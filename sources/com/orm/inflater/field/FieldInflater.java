package com.orm.inflater.field;

import android.database.Cursor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class FieldInflater {
    public Cursor cursor;
    public Field field;
    public Class<?> fieldType;
    public Object object;

    public FieldInflater(Field field, Cursor cursor, Object obj, Class<?> cls) {
        this.field = field;
        this.cursor = cursor;
        this.object = obj;
        this.fieldType = cls;
    }

    public abstract void inflate();
}
