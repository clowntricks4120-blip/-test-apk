package com.orm.inflater.field;

import android.database.Cursor;
import android.util.Log;
import com.orm.SugarRecord;
import com.orm.annotation.OneToMany;
import com.orm.helper.ManifestHelper;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

/* JADX INFO: loaded from: classes.dex */
public class ListFieldInflater extends FieldInflater {
    private static final String LOG_TAG = "ListFieldInflater";

    public ListFieldInflater(Field field, Cursor cursor, Object obj, Class<?> cls) {
        super(field, cursor, obj, cls);
    }

    @Override // com.orm.inflater.field.FieldInflater
    public void inflate() {
        if (!this.field.isAnnotationPresent(OneToMany.class)) {
            Field field = this.field;
            return;
        }
        try {
            Cursor cursor = this.cursor;
            long j = cursor.getLong(cursor.getColumnIndex("ID"));
            Class cls = (Class) ((ParameterizedType) this.field.getGenericType()).getActualTypeArguments()[0];
            String strTargetField = ((OneToMany) this.field.getAnnotation(OneToMany.class)).targetField();
            Field field2 = this.field;
            Object obj = this.object;
            field2.set(obj, SugarRecord.findOneToMany(cls, strTargetField, obj, Long.valueOf(j)));
        } catch (IllegalAccessException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e(LOG_TAG, String.format("Error while inflating list field %s", this.field), e);
            }
        }
    }
}
