package com.orm.util;

import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.util.Log;
import com.orm.SugarRecord;
import com.orm.annotation.Ignore;
import com.orm.annotation.Table;
import com.orm.helper.ManifestHelper;
import com.orm.helper.MultiDexHelper;
import com.orm.helper.NamingHelper;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectionUtil {
    private ReflectionUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    public static void addFieldValueToColumn(ContentValues contentValues, Field field, Object obj, Map<Object, Long> map) {
        field.setAccessible(true);
        Class<?> type = field.getType();
        try {
            String columnName = NamingHelper.toColumnName(field);
            Object obj2 = field.get(obj);
            if (type.isAnnotationPresent(Table.class)) {
                try {
                    Field declaredField = type.getDeclaredField("id");
                    declaredField.setAccessible(true);
                    if (obj2 != null) {
                        contentValues.put(columnName, String.valueOf(declaredField.get(obj2)));
                        return;
                    } else {
                        contentValues.putNull(columnName);
                        return;
                    }
                } catch (NoSuchFieldException unused) {
                    if (map.containsKey(obj2)) {
                        contentValues.put(columnName, map.get(obj2));
                        return;
                    }
                    return;
                }
            }
            if (SugarRecord.class.isAssignableFrom(type)) {
                contentValues.put(columnName, obj2 != null ? String.valueOf(((SugarRecord) obj2).getId()) : "0");
                return;
            }
            if (!type.equals(Short.class) && !type.equals(Short.TYPE)) {
                if (!type.equals(Integer.class) && !type.equals(Integer.TYPE)) {
                    if (!type.equals(Long.class) && !type.equals(Long.TYPE)) {
                        if (!type.equals(Float.class) && !type.equals(Float.TYPE)) {
                            if (!type.equals(Double.class) && !type.equals(Double.TYPE)) {
                                if (!type.equals(Boolean.class) && !type.equals(Boolean.TYPE)) {
                                    if (type.equals(BigDecimal.class)) {
                                        try {
                                            contentValues.put(columnName, field.get(obj).toString());
                                            return;
                                        } catch (NullPointerException unused2) {
                                            contentValues.putNull(columnName);
                                            return;
                                        }
                                    }
                                    if (Timestamp.class.equals(type)) {
                                        try {
                                            contentValues.put(columnName, Long.valueOf(((Timestamp) field.get(obj)).getTime()));
                                            return;
                                        } catch (NullPointerException unused3) {
                                            contentValues.put(columnName, (Long) null);
                                            return;
                                        }
                                    }
                                    if (Date.class.equals(type)) {
                                        try {
                                            contentValues.put(columnName, Long.valueOf(((Date) field.get(obj)).getTime()));
                                            return;
                                        } catch (NullPointerException unused4) {
                                            contentValues.put(columnName, (Long) null);
                                            return;
                                        }
                                    }
                                    if (Calendar.class.equals(type)) {
                                        try {
                                            contentValues.put(columnName, Long.valueOf(((Calendar) field.get(obj)).getTimeInMillis()));
                                            return;
                                        } catch (NullPointerException unused5) {
                                            contentValues.put(columnName, (Long) null);
                                            return;
                                        }
                                    }
                                    if (type.equals(byte[].class)) {
                                        if (obj2 == null) {
                                            contentValues.put(columnName, BuildConfig.FLAVOR.getBytes());
                                            return;
                                        } else {
                                            contentValues.put(columnName, (byte[]) obj2);
                                            return;
                                        }
                                    }
                                    if (type.equals(List.class)) {
                                        return;
                                    }
                                    if (obj2 == null) {
                                        contentValues.putNull(columnName);
                                        return;
                                    } else if (type.isEnum()) {
                                        contentValues.put(columnName, ((Enum) obj2).name());
                                        return;
                                    } else {
                                        contentValues.put(columnName, String.valueOf(obj2));
                                        return;
                                    }
                                }
                                contentValues.put(columnName, (Boolean) obj2);
                                return;
                            }
                            contentValues.put(columnName, (Double) obj2);
                            return;
                        }
                        contentValues.put(columnName, (Float) obj2);
                        return;
                    }
                    contentValues.put(columnName, (Long) obj2);
                    return;
                }
                contentValues.put(columnName, (Integer) obj2);
                return;
            }
            contentValues.put(columnName, (Short) obj2);
            return;
        } catch (IllegalAccessException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("Sugar", e.getMessage());
            }
        }
        if (ManifestHelper.isDebugEnabled()) {
            Log.e("Sugar", e.getMessage());
        }
    }

    private static List<String> getAllClasses() throws IOException {
        String domainPackageName = ManifestHelper.getDomainPackageName();
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : MultiDexHelper.getAllClasses()) {
                if (str.startsWith(domainPackageName)) {
                    arrayList.add(str);
                }
            }
        } catch (NullPointerException unused) {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(BuildConfig.FLAVOR);
            while (resources.hasMoreElements()) {
                ArrayList<String> arrayList2 = new ArrayList();
                String file = resources.nextElement().getFile();
                if (file.contains("bin") || file.contains("classes") || file.contains("retrolambda")) {
                    for (File file2 : new File(file).listFiles()) {
                        populateFiles(file2, arrayList2, BuildConfig.FLAVOR);
                    }
                    for (String str2 : arrayList2) {
                        if (str2.startsWith(domainPackageName)) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<Field> getAllFields(List<Field> list, Class<?> cls) {
        Collections.addAll(list, cls.getDeclaredFields());
        return cls.getSuperclass() != null ? getAllFields(list, cls.getSuperclass()) : list;
    }

    private static Field getDeepField(String str, Class<?> cls) throws NoSuchFieldException {
        do {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        } while (cls != null);
        throw e;
    }

    public static List<Class> getDomainClasses() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> it = getAllClasses().iterator();
            while (it.hasNext()) {
                Class domainClass = getDomainClass(it.next());
                if (domainClass != null) {
                    arrayList.add(domainClass);
                }
            }
        } catch (PackageManager.NameNotFoundException | IOException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("Sugar", e.getMessage());
            }
        }
        return arrayList;
    }

    private static String getSourcePath() {
        return ContextUtil.getPackageManager().getApplicationInfo(ContextUtil.getPackageName(), 0).sourceDir;
    }

    public static List<Field> getTableFields(Class cls) {
        List<Field> fields = SugarConfig.getFields(cls);
        if (fields != null) {
            return fields;
        }
        ArrayList<Field> arrayList = new ArrayList();
        getAllFields(arrayList, cls);
        ArrayList arrayList2 = new ArrayList();
        for (Field field : arrayList) {
            if (!field.isAnnotationPresent(Ignore.class) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                arrayList2.add(field);
            }
        }
        SugarConfig.setFields(cls, arrayList2);
        return arrayList2;
    }

    private static void populateFiles(File file, List<String> list, String str) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (BuildConfig.FLAVOR.equals(str)) {
                    populateFiles(file2, list, file.getName());
                } else {
                    StringBuilder sbB = P.b(str, ".");
                    sbB.append(file.getName());
                    populateFiles(file2, list, sbB.toString());
                }
            }
            return;
        }
        String name = file.getName();
        if (name.endsWith(".class")) {
            name = name.substring(0, name.length() - 6);
        }
        if (BuildConfig.FLAVOR.equals(str)) {
            list.add(name);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(name);
        list.add(sb.toString());
    }

    public static void setFieldValueForId(Object obj, Long l) {
        try {
            Field deepField = getDeepField("id", obj.getClass());
            deepField.setAccessible(true);
            deepField.set(obj, l);
        } catch (Exception unused) {
        }
    }

    public static void setFieldValueFromCursor(Cursor cursor, Field field, Object obj) {
        field.setAccessible(true);
        try {
            Class<?> type = field.getType();
            String columnName = NamingHelper.toColumnName(field);
            int columnIndex = cursor.getColumnIndex(columnName);
            if (columnIndex < 0) {
                if (ManifestHelper.isDebugEnabled()) {
                    Log.e("SUGAR", "Invalid colName, you should upgrade database");
                    return;
                }
                return;
            }
            if (cursor.isNull(columnIndex)) {
                return;
            }
            if (columnName.equalsIgnoreCase("id")) {
                field.set(obj, Long.valueOf(cursor.getLong(columnIndex)));
                return;
            }
            if (!type.equals(Long.TYPE) && !type.equals(Long.class)) {
                Object bigDecimal = null;
                if (type.equals(String.class)) {
                    Object string = cursor.getString(columnIndex);
                    if (string == null || !string.equals("null")) {
                        bigDecimal = string;
                    }
                    field.set(obj, bigDecimal);
                    return;
                }
                if (!type.equals(Double.TYPE) && !type.equals(Double.class)) {
                    if (!type.equals(Boolean.TYPE) && !type.equals(Boolean.class)) {
                        if (!type.equals(Integer.TYPE) && !type.equals(Integer.class)) {
                            if (!type.equals(Float.TYPE) && !type.equals(Float.class)) {
                                if (!type.equals(Short.TYPE) && !type.equals(Short.class)) {
                                    if (type.equals(BigDecimal.class)) {
                                        String string2 = cursor.getString(columnIndex);
                                        if (string2 == null || !string2.equals("null")) {
                                            bigDecimal = new BigDecimal(string2);
                                        }
                                        field.set(obj, bigDecimal);
                                        return;
                                    }
                                    if (type.equals(Timestamp.class)) {
                                        field.set(obj, new Timestamp(cursor.getLong(columnIndex)));
                                        return;
                                    }
                                    if (type.equals(Date.class)) {
                                        field.set(obj, new Date(cursor.getLong(columnIndex)));
                                        return;
                                    }
                                    if (type.equals(Calendar.class)) {
                                        long j = cursor.getLong(columnIndex);
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTimeInMillis(j);
                                        field.set(obj, calendar);
                                        return;
                                    }
                                    if (type.equals(byte[].class)) {
                                        if (cursor.getBlob(columnIndex) == null) {
                                            field.set(obj, BuildConfig.FLAVOR.getBytes());
                                            return;
                                        } else {
                                            field.set(obj, cursor.getBlob(columnIndex));
                                            return;
                                        }
                                    }
                                    if (!Enum.class.isAssignableFrom(type)) {
                                        if (ManifestHelper.isDebugEnabled()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Class cannot be read from Sqlite3 database. Please check the type of field ");
                                            sb.append(field.getName());
                                            sb.append("(");
                                            sb.append(field.getType().getName());
                                            sb.append(")");
                                            Log.e("Sugar", sb.toString());
                                            return;
                                        }
                                        return;
                                    }
                                    try {
                                        field.set(obj, field.getType().getMethod("valueOf", String.class).invoke(field.getType(), cursor.getString(columnIndex)));
                                        return;
                                    } catch (Exception unused) {
                                        if (ManifestHelper.isDebugEnabled()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Enum cannot be read from Sqlite3 database. Please check the type of field ");
                                            sb2.append(field.getName());
                                            Log.e("Sugar", sb2.toString());
                                            return;
                                        }
                                        return;
                                    }
                                }
                                field.set(obj, Short.valueOf(cursor.getShort(columnIndex)));
                                return;
                            }
                            field.set(obj, Float.valueOf(cursor.getFloat(columnIndex)));
                            return;
                        }
                        field.set(obj, Integer.valueOf(cursor.getInt(columnIndex)));
                        return;
                    }
                    field.set(obj, Boolean.valueOf(cursor.getString(columnIndex).equals("1")));
                    return;
                }
                field.set(obj, Double.valueOf(cursor.getDouble(columnIndex)));
                return;
            }
            field.set(obj, Long.valueOf(cursor.getLong(columnIndex)));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("field set error", e.getMessage());
            }
        }
    }

    private static Class getDomainClass(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, true, Thread.currentThread().getContextClassLoader());
        } catch (Throwable th) {
            String strT = th.getMessage() == null ? j.t("getDomainClass ", str, " error") : th.getMessage();
            if (ManifestHelper.isDebugEnabled()) {
                Log.e("Sugar", strT);
            }
            cls = null;
        }
        if (cls == null || (((!SugarRecord.class.isAssignableFrom(cls) || SugarRecord.class.equals(cls)) && !cls.isAnnotationPresent(Table.class)) || Modifier.isAbstract(cls.getModifiers()))) {
            return null;
        }
        ManifestHelper.isDebugEnabled();
        return cls;
    }
}
