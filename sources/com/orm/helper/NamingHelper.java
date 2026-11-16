package com.orm.helper;

import com.orm.annotation.Column;
import com.orm.annotation.Table;
import java.lang.reflect.Field;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class NamingHelper {
    private NamingHelper() {
    }

    public static String toColumnName(Field field) {
        return field.isAnnotationPresent(Column.class) ? ((Column) field.getAnnotation(Column.class)).name() : toSQLNameDefault(field.getName());
    }

    public static String toSQLNameDefault(String str) {
        if (str.equalsIgnoreCase("_id")) {
            return "_id";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            char c = i > 0 ? charArray[i - 1] : (char) 0;
            char c2 = charArray[i];
            char c3 = i < charArray.length + (-1) ? charArray[i + 1] : (char) 0;
            if (i == 0 || Character.isLowerCase(c2) || Character.isDigit(c2)) {
                sb.append(Character.toUpperCase(c2));
            } else if (Character.isUpperCase(c2)) {
                if (!Character.isLetterOrDigit(c)) {
                    sb.append(c2);
                } else if (Character.isLowerCase(c)) {
                    sb.append('_');
                    sb.append(c2);
                } else if (c3 <= 0 || !Character.isLowerCase(c3)) {
                    sb.append(c2);
                } else {
                    sb.append('_');
                    sb.append(c2);
                }
            }
            i++;
        }
        return sb.toString();
    }

    public static String toTableName(Class<?> cls) {
        if (!cls.isAnnotationPresent(Table.class)) {
            return toSQLNameDefault(cls.getSimpleName());
        }
        Table table = (Table) cls.getAnnotation(Table.class);
        return BuildConfig.FLAVOR.equals(table.name()) ? toSQLNameDefault(cls.getSimpleName()) : table.name();
    }
}
