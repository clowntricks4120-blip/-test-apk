package com.orm;

import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.orm.annotation.Column;
import com.orm.annotation.MultiUnique;
import com.orm.annotation.NotNull;
import com.orm.annotation.Unique;
import com.orm.helper.ManifestHelper;
import com.orm.helper.NamingHelper;
import com.orm.util.ContextUtil;
import com.orm.util.KeyWordUtil;
import com.orm.util.MigrationFileParser;
import com.orm.util.NumberComparator;
import com.orm.util.QueryBuilder;
import com.orm.util.ReflectionUtil;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class SchemaGenerator {
    private SchemaGenerator() {
    }

    private void addColumns(Class<?> cls, SQLiteDatabase sQLiteDatabase) {
        List<Field> tableFields = ReflectionUtil.getTableFields(cls);
        String tableName = NamingHelper.toTableName(cls);
        ArrayList<String> columnNames = getColumnNames(sQLiteDatabase, tableName);
        ArrayList<String> arrayList = new ArrayList();
        for (Field field : tableFields) {
            String columnName = NamingHelper.toColumnName(field);
            String columnType = QueryBuilder.getColumnType(field.getType());
            if (field.isAnnotationPresent(Column.class)) {
                columnName = ((Column) field.getAnnotation(Column.class)).name();
            }
            if (!columnNames.contains(columnName)) {
                StringBuilder sb = new StringBuilder("ALTER TABLE ");
                sb.append(tableName);
                sb.append(" ADD COLUMN ");
                sb.append(columnName);
                sb.append(" ");
                sb.append(columnType);
                if (field.isAnnotationPresent(NotNull.class)) {
                    if (columnType.endsWith(" NULL")) {
                        sb.delete(sb.length() - 5, sb.length());
                    }
                    sb.append(" NOT NULL");
                }
                arrayList.add(sb.toString());
            }
        }
        for (String str : arrayList) {
            ManifestHelper.isDebugEnabled();
            sQLiteDatabase.execSQL(str);
        }
    }

    private void executeScript(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            AssetManager assets = ContextUtil.getAssets();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assets.open(sb.toString())));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb2.append(line);
                }
            }
            for (String str3 : new MigrationFileParser(sb2.toString()).getStatements()) {
                ManifestHelper.isDebugEnabled();
                if (!str3.isEmpty()) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
        } catch (IOException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("SUGAR", e.getMessage());
            }
        }
        ManifestHelper.isDebugEnabled();
    }

    private boolean executeSugarUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        try {
            List<String> listAsList = Arrays.asList(ContextUtil.getAssets().list("sugar_upgrades"));
            Collections.sort(listAsList, new NumberComparator());
            for (String str : listAsList) {
                ManifestHelper.isDebugEnabled();
                try {
                    int iIntValue = Integer.valueOf(str.replace(".sql", BuildConfig.FLAVOR)).intValue();
                    if (iIntValue > i && iIntValue <= i2) {
                        executeScript(sQLiteDatabase, "sugar_upgrades/", str);
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                    ManifestHelper.isDebugEnabled();
                }
            }
        } catch (IOException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("SUGAR", e.getMessage());
            }
        }
        return z;
    }

    public static SchemaGenerator getInstance() {
        return new SchemaGenerator();
    }

    public void afterTableCreated(Class<?> cls, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append(".sql");
        executeScript(sQLiteDatabase, "sugar_after_create/", sb.toString());
    }

    public void createDatabase(SQLiteDatabase sQLiteDatabase) {
        for (Class cls : ReflectionUtil.getDomainClasses()) {
            createTable(cls, sQLiteDatabase);
            afterTableCreated(cls, sQLiteDatabase);
        }
    }

    public void createTable(Class<?> cls, SQLiteDatabase sQLiteDatabase) {
        String strCreateTableSQL = createTableSQL(cls);
        if (strCreateTableSQL.isEmpty()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(strCreateTableSQL);
        } catch (SQLException unused) {
        }
    }

    public String createTableSQL(Class<?> cls) {
        ManifestHelper.isDebugEnabled();
        List<Field> tableFields = ReflectionUtil.getTableFields(cls);
        String tableName = NamingHelper.toTableName(cls);
        if (KeyWordUtil.isKeyword(tableName)) {
            ManifestHelper.isDebugEnabled();
        }
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(tableName);
        sb.append(" ( ID INTEGER PRIMARY KEY AUTOINCREMENT ");
        for (Field field : tableFields) {
            String columnName = NamingHelper.toColumnName(field);
            String columnType = QueryBuilder.getColumnType(field.getType());
            if (columnType != null && !columnName.equalsIgnoreCase("Id")) {
                if (field.isAnnotationPresent(Column.class)) {
                    Column column = (Column) field.getAnnotation(Column.class);
                    String strName = column.name();
                    sb.append(", ");
                    sb.append(strName);
                    sb.append(" ");
                    sb.append(columnType);
                    if (column.notNull()) {
                        if (columnType.endsWith(" NULL")) {
                            sb.delete(sb.length() - 5, sb.length());
                        }
                        sb.append(" NOT NULL");
                    }
                    if (column.unique()) {
                        sb.append(" UNIQUE");
                    }
                } else {
                    sb.append(", ");
                    sb.append(columnName);
                    sb.append(" ");
                    sb.append(columnType);
                    if (field.isAnnotationPresent(NotNull.class)) {
                        if (columnType.endsWith(" NULL")) {
                            sb.delete(sb.length() - 5, sb.length());
                        }
                        sb.append(" NOT_NULL");
                    }
                    if (field.isAnnotationPresent(Unique.class)) {
                        sb.append(" UNIQUE");
                    }
                }
            }
        }
        if (cls.isAnnotationPresent(MultiUnique.class)) {
            String strValue = ((MultiUnique) cls.getAnnotation(MultiUnique.class)).value();
            sb.append(", UNIQUE(");
            String[] strArrSplit = strValue.split(",");
            for (int i = 0; i < strArrSplit.length; i++) {
                sb.append(NamingHelper.toSQLNameDefault(strArrSplit[i]));
                if (i < strArrSplit.length - 1) {
                    sb.append(",");
                }
            }
            sb.append(") ON CONFLICT REPLACE");
        }
        sb.append(" ) ");
        ManifestHelper.isDebugEnabled();
        return sb.toString();
    }

    public void deleteTables(SQLiteDatabase sQLiteDatabase) {
        for (Class cls : ReflectionUtil.getDomainClasses()) {
            StringBuilder sbW = j.w("DROP TABLE IF EXISTS ");
            sbW.append(NamingHelper.toTableName(cls));
            sQLiteDatabase.execSQL(sbW.toString());
        }
    }

    public ArrayList<String> getColumnNames(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, null);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < cursorQuery.getColumnCount(); i++) {
            arrayList.add(cursorQuery.getColumnName(i));
        }
        cursorQuery.close();
        return arrayList;
    }
}
