package com.orm.util;

import android.database.Cursor;
import android.database.CursorWrapper;

/* JADX INFO: loaded from: classes.dex */
public class SugarCursor extends CursorWrapper {
    public SugarCursor(Cursor cursor) {
        super(cursor);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(String str) {
        if (str.equals("_id")) {
            str = "ID";
        }
        return super.getColumnIndex(str);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        try {
            return super.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            if (str.equals("_id")) {
                return super.getColumnIndexOrThrow("ID");
            }
            throw e;
        }
    }
}
