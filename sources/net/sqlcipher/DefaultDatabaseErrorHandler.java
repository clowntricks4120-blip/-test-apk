package net.sqlcipher;

import android.util.Log;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = "DefaultDatabaseErrorHandler";

    private void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
            return;
        }
        String str2 = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("deleting the database file: ");
        sb.append(str);
        Log.e(str2, sb.toString());
        try {
            new File(str).delete();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // net.sqlcipher.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str = this.TAG;
        StringBuilder sbW = j.w("Corruption reported by sqlite on database, deleting: ");
        sbW.append(sQLiteDatabase.getPath());
        Log.e(str, sbW.toString());
        if (sQLiteDatabase.isOpen()) {
            Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e);
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }
}
