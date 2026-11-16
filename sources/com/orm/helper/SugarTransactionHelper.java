package com.orm.helper;

import android.database.sqlite.SQLiteDatabase;
import com.orm.SugarContext;

/* JADX INFO: loaded from: classes.dex */
public final class SugarTransactionHelper {
    private static final String LOG_TAG = "SugarTransactionHelper";

    public interface Callback {
        void manipulateInTransaction();
    }

    private SugarTransactionHelper() {
    }

    public static void doInTransaction(Callback callback) {
        SQLiteDatabase db = SugarContext.getSugarContext().getSugarDb().getDB();
        db.beginTransaction();
        try {
            callback.manipulateInTransaction();
            db.setTransactionSuccessful();
        } catch (Throwable unused) {
        }
        db.endTransaction();
    }
}
