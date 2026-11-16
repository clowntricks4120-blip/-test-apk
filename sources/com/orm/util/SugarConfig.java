package com.orm.util;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SugarConfig {
    public static Map<Class<?>, List<Field>> fields = new HashMap();

    public static void clearCache() {
        fields.clear();
        fields = new HashMap();
    }

    public static List<Field> getFields(Class<?> cls) {
        if (fields.containsKey(cls)) {
            return Collections.synchronizedList(fields.get(cls));
        }
        return null;
    }

    public static void setFields(Class<?> cls, List<Field> list) {
        fields.put(cls, list);
    }
}
