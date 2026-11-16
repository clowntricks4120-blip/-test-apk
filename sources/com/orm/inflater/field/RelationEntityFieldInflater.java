package com.orm.inflater.field;

import android.database.Cursor;
import android.util.Log;
import com.orm.helper.ManifestHelper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class RelationEntityFieldInflater extends EntityFieldInflater {
    private static final String LOG_TAG = "RelEntityFieldInflater";
    public Object relationObject;

    public RelationEntityFieldInflater(Field field, Cursor cursor, Object obj, Class<?> cls, Object obj2) {
        super(field, cursor, obj, cls);
        this.relationObject = obj2;
    }

    @Override // com.orm.inflater.field.EntityFieldInflater, com.orm.inflater.field.FieldInflater
    public void inflate() {
        try {
            this.field.set(this.object, this.relationObject);
        } catch (IllegalAccessException e) {
            if (ManifestHelper.isDebugEnabled()) {
                Log.e(LOG_TAG, String.format("Error while inflating %s field", this.field), e);
            }
        }
    }
}
