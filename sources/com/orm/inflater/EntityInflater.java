package com.orm.inflater;

import android.database.Cursor;
import com.orm.SugarRecord;
import com.orm.inflater.field.DefaultFieldInflater;
import com.orm.inflater.field.EntityFieldInflater;
import com.orm.inflater.field.ListFieldInflater;
import com.orm.inflater.field.RelationEntityFieldInflater;
import com.orm.util.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class EntityInflater {
    private Cursor cursor;
    private Map<Object, Long> entitiesMap;
    private Object object;
    private String relationFieldName;
    private Object relationObject;

    public void inflate() {
        List<Field> tableFields = ReflectionUtil.getTableFields(this.object.getClass());
        Cursor cursor = this.cursor;
        long j = cursor.getLong(cursor.getColumnIndex("ID"));
        if (!this.entitiesMap.containsKey(this.object)) {
            this.entitiesMap.put(this.object, Long.valueOf(j));
        }
        for (Field field : tableFields) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            (SugarRecord.isSugarEntity(type) ? field.getName().equals(this.relationFieldName) ? new RelationEntityFieldInflater(field, this.cursor, this.object, type, this.relationObject) : new EntityFieldInflater(field, this.cursor, this.object, type) : type.equals(List.class) ? new ListFieldInflater(field, this.cursor, this.object, type) : new DefaultFieldInflater(field, this.cursor, this.object, type)).inflate();
        }
    }

    public EntityInflater withCursor(Cursor cursor) {
        this.cursor = cursor;
        return this;
    }

    public EntityInflater withEntitiesMap(Map<Object, Long> map) {
        this.entitiesMap = map;
        return this;
    }

    public EntityInflater withObject(Object obj) {
        this.object = obj;
        return this;
    }

    public EntityInflater withRelationFieldName(String str) {
        this.relationFieldName = str;
        return this;
    }

    public EntityInflater withRelationObject(Object obj) {
        this.relationObject = obj;
        return this;
    }
}
