package com.orm.inflater.field;

import android.database.Cursor;
import android.util.Log;
import com.orm.SugarRecord;
import com.orm.helper.ManifestHelper;
import com.orm.helper.NamingHelper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class EntityFieldInflater extends FieldInflater {
    private static final String LOG_TAG = "EntityFieldInflater";

    public EntityFieldInflater(Field field, Cursor cursor, Object obj, Class<?> cls) {
        super(field, cursor, obj, cls);
    }

    @Override // com.orm.inflater.field.FieldInflater
    public void inflate() {
        try {
            Cursor cursor = this.cursor;
            long j = cursor.getLong(cursor.getColumnIndex(NamingHelper.toColumnName(this.field)));
            this.field.set(this.object, j > 0 ? SugarRecord.findById(this.fieldType, Long.valueOf(j)) : null);
        } catch (IllegalAccessException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e(LOG_TAG, String.format("Error while inflating entity field %s", this.field), e);
            }
        }
    }
}
