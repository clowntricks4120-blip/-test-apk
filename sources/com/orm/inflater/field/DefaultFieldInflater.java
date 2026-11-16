package com.orm.inflater.field;

import android.database.Cursor;
import com.orm.util.ReflectionUtil;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class DefaultFieldInflater extends FieldInflater {
    public DefaultFieldInflater(Field field, Cursor cursor, Object obj, Class<?> cls) {
        super(field, cursor, obj, cls);
    }

    @Override // com.orm.inflater.field.FieldInflater
    public void inflate() {
        ReflectionUtil.setFieldValueFromCursor(this.cursor, this.field, this.object);
    }
}
