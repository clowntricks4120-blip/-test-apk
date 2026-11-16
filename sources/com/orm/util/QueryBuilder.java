package com.orm.util;

import com.orm.SugarRecord;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class QueryBuilder {
    public static String generatePlaceholders(int i) {
        if (i <= 0) {
            throw new RuntimeException("The number of arguments must be greater than or equal to 1.");
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public static String getColumnType(Class<?> cls) {
        if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE) || cls.equals(Integer.class) || cls.equals(Integer.TYPE) || cls.equals(Long.class) || cls.equals(Long.TYPE)) {
            return "INTEGER";
        }
        if (!cls.isPrimitive() && SugarRecord.class.isAssignableFrom(cls)) {
            return "INTEGER";
        }
        if (cls.equals(Date.class) || cls.equals(java.sql.Date.class) || cls.equals(Calendar.class)) {
            return "INTEGER NULL";
        }
        if (cls.getName().equals("[B")) {
            return "BLOB";
        }
        if (cls.equals(Double.class) || cls.equals(Double.TYPE) || cls.equals(Float.class) || cls.equals(Float.TYPE)) {
            return "FLOAT";
        }
        return (cls.equals(String.class) || cls.equals(Character.TYPE) || cls.equals(BigDecimal.class)) ? "TEXT" : BuildConfig.FLAVOR;
    }
}
