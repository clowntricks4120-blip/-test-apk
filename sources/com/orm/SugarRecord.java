package com.orm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.orm.annotation.Table;
import com.orm.annotation.Unique;
import com.orm.helper.ManifestHelper;
import com.orm.helper.NamingHelper;
import com.orm.inflater.EntityInflater;
import com.orm.util.QueryBuilder;
import com.orm.util.ReflectionUtil;
import com.orm.util.SugarCursor;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class SugarRecord {
    private Long id = null;

    public static class CursorIterator<E> implements Iterator<E> {
        public Cursor cursor;
        public Class<E> type;

        public CursorIterator(Class<E> cls, Cursor cursor) {
            this.type = cls;
            this.cursor = cursor;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Cursor cursor = this.cursor;
            return (cursor == null || cursor.isClosed() || this.cursor.isAfterLast()) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r0
  0x0075: PHI (r0v8 E) = (r0v7 E), (r0v12 E) binds: [B:21:0x0072, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.util.Iterator
        public E next() {
            E eNewInstance;
            Cursor cursor = this.cursor;
            if (cursor == null || cursor.isAfterLast()) {
                throw new NoSuchElementException();
            }
            if (this.cursor.isBeforeFirst()) {
                this.cursor.moveToFirst();
            }
            try {
                try {
                    eNewInstance = this.type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        new EntityInflater().withCursor(this.cursor).withObject(eNewInstance).withEntitiesMap(SugarContext.getSugarContext().getEntitiesMap()).inflate();
                        this.cursor.moveToNext();
                        if (this.cursor.isAfterLast()) {
                            this.cursor.close();
                        }
                    } catch (Exception unused) {
                        this.cursor.moveToNext();
                        if (this.cursor.isAfterLast()) {
                            this.cursor.close();
                        }
                    }
                } catch (Exception unused2) {
                    eNewInstance = null;
                }
                return eNewInstance;
            } catch (Throwable th) {
                this.cursor.moveToNext();
                if (this.cursor.isAfterLast()) {
                    this.cursor.close();
                }
                throw th;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static <T> long count(Class<T> cls) {
        return count(cls, null, null, null, null, null);
    }

    public static <T> int deleteAll(Class<T> cls) {
        return deleteAll(cls, null, new String[0]);
    }

    public static <T> int deleteInTx(T... tArr) {
        return deleteInTx(Arrays.asList(tArr));
    }

    public static void executeQuery(String str, String... strArr) {
        getSugarDataBase().execSQL(str, strArr);
    }

    public static <T> List<T> find(Class<T> cls, String str, String... strArr) {
        return find(cls, str, strArr, null, null, null);
    }

    public static <T> Iterator<T> findAll(Class<T> cls) {
        return findAsIterator(cls, null, null, null, null, null);
    }

    public static <T> Iterator<T> findAsIterator(Class<T> cls, String str, String... strArr) {
        return findAsIterator(cls, str, strArr, null, null, null);
    }

    public static <T> T findById(Class<T> cls, Long l) {
        List listFind = find(cls, "id=?", new String[]{String.valueOf(l)}, null, null, "1");
        if (listFind.isEmpty()) {
            return null;
        }
        return (T) listFind.get(0);
    }

    public static <T> List<T> findOneToMany(Class<T> cls, String str, Object obj, Long l) {
        String[] strArr = {String.valueOf(l)};
        StringBuilder sb = new StringBuilder();
        sb.append(NamingHelper.toSQLNameDefault(str));
        sb.append(" = ?");
        return getEntitiesFromCursor(getSugarDataBase().query(NamingHelper.toTableName(cls), null, sb.toString(), strArr, null, null, null, null), cls, str, obj);
    }

    public static <T> List<T> findWithQuery(Class<T> cls, String str, String... strArr) {
        return getEntitiesFromCursor(getSugarDataBase().rawQuery(str, strArr), cls);
    }

    public static <T> Iterator<T> findWithQueryAsIterator(Class<T> cls, String str, String... strArr) {
        return new CursorIterator(cls, getSugarDataBase().rawQuery(str, strArr));
    }

    public static <T> T first(Class<T> cls) {
        StringBuilder sbW = j.w("SELECT * FROM ");
        sbW.append(NamingHelper.toTableName(cls));
        sbW.append(" ORDER BY ID ASC LIMIT 1");
        List listFindWithQuery = findWithQuery(cls, sbW.toString(), new String[0]);
        if (listFindWithQuery.isEmpty()) {
            return null;
        }
        return (T) listFindWithQuery.get(0);
    }

    public static <T> Cursor getCursor(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return new SugarCursor(getSugarDataBase().query(NamingHelper.toTableName(cls), null, str, strArr, str2, null, str3, str4));
    }

    public static <T> List<T> getEntitiesFromCursor(Cursor cursor, Class<T> cls) {
        return getEntitiesFromCursor(cursor, cls, null, null);
    }

    public static SQLiteDatabase getSugarDataBase() {
        return SugarContext.getSugarContext().getSugarDb().getDB();
    }

    public static boolean isSugarEntity(Class<?> cls) {
        return cls.isAnnotationPresent(Table.class) || SugarRecord.class.isAssignableFrom(cls);
    }

    public static <T> T last(Class<T> cls) {
        StringBuilder sbW = j.w("SELECT * FROM ");
        sbW.append(NamingHelper.toTableName(cls));
        sbW.append(" ORDER BY ID DESC LIMIT 1");
        List listFindWithQuery = findWithQuery(cls, sbW.toString(), new String[0]);
        if (listFindWithQuery.isEmpty()) {
            return null;
        }
        return (T) listFindWithQuery.get(0);
    }

    public static <T> List<T> listAll(Class<T> cls) {
        return find(cls, null, null, null, null, null);
    }

    public static String[] replaceArgs(String[] strArr) {
        String str;
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("true")) {
                str = "1";
                strArr2[i] = "1";
            } else if (strArr[i].equals("false")) {
                str = "0";
                strArr2[i] = "0";
            } else {
                str = strArr[i];
            }
            strArr2[i] = str;
        }
        return strArr2;
    }

    public static long save(Object obj) {
        return save(getSugarDataBase(), obj);
    }

    public static <T> void saveInTx(T... tArr) {
        saveInTx(Arrays.asList(tArr));
    }

    public static <T> T singleFindByQuery(Class<T> cls, String str, String... strArr) {
        List listFind = find(cls, str, strArr, null, null, "1");
        if (listFind.isEmpty()) {
            return null;
        }
        return (T) listFind.get(0);
    }

    public static <T> long sum(Class<T> cls, String str) {
        return sum(cls, str, null, null);
    }

    public static long update(Object obj) {
        return update(getSugarDataBase(), obj);
    }

    public static <T> void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }

    public boolean delete() {
        Long id = getId();
        Class<?> cls = getClass();
        if (id == null || id.longValue() <= 0) {
            ManifestHelper.isDebugEnabled();
            return false;
        }
        ManifestHelper.isDebugEnabled();
        return getSugarDataBase().delete(NamingHelper.toTableName(cls), "Id=?", new String[]{id.toString()}) == 1;
    }

    public Long getId() {
        return this.id;
    }

    public void inflate(Cursor cursor) {
        new EntityInflater().withCursor(cursor).withObject(this).withEntitiesMap(SugarContext.getSugarContext().getEntitiesMap()).inflate();
    }

    public void setId(Long l) {
        this.id = l;
    }

    public static <T> long count(Class<T> cls, String str, String... strArr) {
        return count(cls, str, strArr, null, null, null);
    }

    public static <T> int deleteAll(Class<T> cls, String str, String... strArr) {
        return getSugarDataBase().delete(NamingHelper.toTableName(cls), str, strArr);
    }

    public static <T> int deleteInTx(Collection<T> collection) {
        SQLiteDatabase sugarDataBase = getSugarDataBase();
        try {
            sugarDataBase.beginTransaction();
            sugarDataBase.setLockingEnabled(false);
            Iterator<T> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (delete(it.next())) {
                    i++;
                }
            }
            sugarDataBase.setTransactionSuccessful();
            return i;
        } catch (Exception e) {
            if (ManifestHelper.isDebugEnabled()) {
                e.getMessage();
            }
            return 0;
        } finally {
            sugarDataBase.endTransaction();
            sugarDataBase.setLockingEnabled(true);
        }
    }

    public static <T> List<T> find(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return getEntitiesFromCursor(getSugarDataBase().query(NamingHelper.toTableName(cls), null, str, strArr == null ? null : replaceArgs(strArr), str2, null, str3, str4), cls);
    }

    public static <T> Iterator<T> findAsIterator(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return new CursorIterator(cls, getSugarDataBase().query(NamingHelper.toTableName(cls), null, str, strArr, str2, null, str3, str4));
    }

    public static <T> List<T> getEntitiesFromCursor(Cursor cursor, Class<T> cls, String str, Object obj) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                new EntityInflater().withCursor(cursor).withObject(tNewInstance).withEntitiesMap(SugarContext.getSugarContext().getEntitiesMap()).withRelationFieldName(str).withRelationObject(obj).inflate();
                arrayList.add(tNewInstance);
            } catch (Exception unused) {
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static <T> List<T> listAll(Class<T> cls, String str) {
        return find(cls, null, null, null, str, null);
    }

    public static long save(SQLiteDatabase sQLiteDatabase, Object obj) {
        Map<Object, Long> entitiesMap = SugarContext.getSugarContext().getEntitiesMap();
        List<Field> tableFields = ReflectionUtil.getTableFields(obj.getClass());
        ContentValues contentValues = new ContentValues(tableFields.size());
        Field field = null;
        for (Field field2 : tableFields) {
            ReflectionUtil.addFieldValueToColumn(contentValues, field2, obj, entitiesMap);
            if (field2.getName().equals("id")) {
                field = field2;
            }
        }
        if (isSugarEntity(obj.getClass()) && entitiesMap.containsKey(obj)) {
            contentValues.put("id", entitiesMap.get(obj));
        }
        long jInsertWithOnConflict = sQLiteDatabase.insertWithOnConflict(NamingHelper.toTableName(obj.getClass()), null, contentValues, 5);
        if (obj.getClass().isAnnotationPresent(Table.class)) {
            if (field != null) {
                field.setAccessible(true);
                try {
                    field.set(obj, Long.valueOf(jInsertWithOnConflict));
                } catch (IllegalAccessException unused) {
                }
            } else {
                entitiesMap.put(obj, Long.valueOf(jInsertWithOnConflict));
            }
        } else if (SugarRecord.class.isAssignableFrom(obj.getClass())) {
            ((SugarRecord) obj).setId(Long.valueOf(jInsertWithOnConflict));
        }
        ManifestHelper.isDebugEnabled();
        return jInsertWithOnConflict;
    }

    public static <T> void saveInTx(Collection<T> collection) {
        SQLiteDatabase sugarDataBase = getSugarDataBase();
        while (sugarDataBase.isDbLockedByCurrentThread()) {
        }
        sugarDataBase.beginTransaction();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            save(sugarDataBase, it.next());
        }
        sugarDataBase.setTransactionSuccessful();
        sugarDataBase.endTransaction();
    }

    public static <T> long sum(Class<T> cls, String str, String str2, String... strArr) {
        String strR = !TextUtils.isEmpty(str2) ? j.r(" where ", str2) : BuildConfig.FLAVOR;
        try {
            SQLiteDatabase sugarDataBase = getSugarDataBase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT sum(");
            sb.append(str);
            sb.append(") FROM ");
            sb.append(NamingHelper.toTableName(cls));
            sb.append(strR);
            SQLiteStatement sQLiteStatementCompileStatement = sugarDataBase.compileStatement(sb.toString());
            if (strArr != null) {
                for (int length = strArr.length; length != 0; length--) {
                    sQLiteStatementCompileStatement.bindString(length, strArr[length - 1]);
                }
            }
            try {
                return sQLiteStatementCompileStatement.simpleQueryForLong();
            } finally {
                sQLiteStatementCompileStatement.close();
            }
        } catch (SQLiteException unused) {
            return -1L;
        }
    }

    public static long update(SQLiteDatabase sQLiteDatabase, Object obj) {
        Map<Object, Long> entitiesMap = SugarContext.getSugarContext().getEntitiesMap();
        List<Field> tableFields = ReflectionUtil.getTableFields(obj.getClass());
        ContentValues contentValues = new ContentValues(tableFields.size());
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Field field : tableFields) {
            if (field.isAnnotationPresent(Unique.class)) {
                try {
                    field.setAccessible(true);
                    String columnName = NamingHelper.toColumnName(field);
                    Object obj2 = field.get(obj);
                    sb.append(columnName);
                    sb.append(" = ?");
                    arrayList.add(String.valueOf(obj2));
                } catch (IllegalAccessException unused) {
                }
            } else if (!field.getName().equals("id")) {
                ReflectionUtil.addFieldValueToColumn(contentValues, field, obj, entitiesMap);
            }
        }
        long jUpdate = sQLiteDatabase.update(NamingHelper.toTableName(obj.getClass()), contentValues, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
        return jUpdate == 0 ? save(sQLiteDatabase, obj) : jUpdate;
    }

    public static <T> void updateInTx(Collection<T> collection) {
        SQLiteDatabase sugarDataBase = getSugarDataBase();
        try {
            try {
                sugarDataBase.beginTransaction();
                sugarDataBase.setLockingEnabled(false);
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    update(it.next());
                }
                sugarDataBase.setTransactionSuccessful();
            } catch (Exception e) {
                if (ManifestHelper.isDebugEnabled()) {
                    e.getMessage();
                }
            }
        } finally {
            sugarDataBase.endTransaction();
            sugarDataBase.setLockingEnabled(true);
        }
    }

    public static <T> long count(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        String strR = !TextUtils.isEmpty(str) ? j.r(" where ", str) : BuildConfig.FLAVOR;
        try {
            SQLiteDatabase sugarDataBase = getSugarDataBase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT count(*) FROM ");
            sb.append(NamingHelper.toTableName(cls));
            sb.append(strR);
            SQLiteStatement sQLiteStatementCompileStatement = sugarDataBase.compileStatement(sb.toString());
            if (strArr != null) {
                for (int length = strArr.length; length != 0; length--) {
                    sQLiteStatementCompileStatement.bindString(length, strArr[length - 1]);
                }
            }
            try {
                return sQLiteStatementCompileStatement.simpleQueryForLong();
            } finally {
                sQLiteStatementCompileStatement.close();
            }
        } catch (SQLiteException unused) {
            return -1L;
        }
    }

    public static <T> Cursor getCursor(Class<T> cls, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return new SugarCursor(getSugarDataBase().query(NamingHelper.toTableName(cls), strArr, str, strArr2, str2, null, str3, str4));
    }

    public static <T> T findById(Class<T> cls, Integer num) {
        return (T) findById(cls, Long.valueOf(num.intValue()));
    }

    public static <T> List<T> findById(Class<T> cls, String... strArr) {
        StringBuilder sbW = j.w("id IN (");
        sbW.append(QueryBuilder.generatePlaceholders(strArr.length));
        sbW.append(")");
        return find(cls, sbW.toString(), strArr);
    }

    public static <T> Cursor getCursor(String str) {
        return new SugarCursor(getSugarDataBase().rawQuery(str, null));
    }

    public static boolean delete(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isAnnotationPresent(Table.class)) {
            try {
                Field declaredField = cls.getDeclaredField("id");
                boolean z = true;
                declaredField.setAccessible(true);
                Long l = (Long) declaredField.get(obj);
                if (l != null && l.longValue() > 0) {
                    if (getSugarDataBase().delete(NamingHelper.toTableName(cls), "Id=?", new String[]{l.toString()}) != 1) {
                        z = false;
                    }
                    ManifestHelper.isDebugEnabled();
                    return z;
                }
                ManifestHelper.isDebugEnabled();
                return false;
            } catch (IllegalAccessException unused) {
                ManifestHelper.isDebugEnabled();
                return false;
            } catch (NoSuchFieldException unused2) {
                ManifestHelper.isDebugEnabled();
                return false;
            }
        }
        if (SugarRecord.class.isAssignableFrom(cls)) {
            return ((SugarRecord) obj).delete();
        }
        ManifestHelper.isDebugEnabled();
        return false;
    }

    public long save() {
        return save(getSugarDataBase(), this);
    }

    public long update() {
        return update(getSugarDataBase(), this);
    }
}
