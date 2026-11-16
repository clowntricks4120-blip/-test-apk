package net.sqlcipher.database;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    public SQLiteDatabase mDatabase;
    private String mSqlStmt;
    public long nHandle;
    public long nStatement = 0;
    private boolean mInUse = false;

    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        this.nHandle = 0L;
        this.mSqlStmt = null;
        if (!sQLiteDatabase.isOpen()) {
            StringBuilder sbW = j.w("database ");
            sbW.append(sQLiteDatabase.getPath());
            sbW.append(" already closed");
            throw new IllegalStateException(sbW.toString());
        }
        this.mDatabase = sQLiteDatabase;
        this.mSqlStmt = str;
        this.nHandle = sQLiteDatabase.mNativeHandle;
        compile(str, true);
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbW = j.w("database ");
            sbW.append(this.mDatabase.getPath());
            sbW.append(" already closed");
            throw new IllegalStateException(sbW.toString());
        }
        if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    public boolean acquire() {
        synchronized (this) {
            if (this.mInUse) {
                return false;
            }
            this.mInUse = true;
            boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            return true;
        }
    }

    public void finalize() throws Throwable {
        try {
            if (this.nStatement == 0) {
                return;
            }
            boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            releaseSqlStatement();
        } finally {
            super.finalize();
        }
    }

    public void release() {
        synchronized (this) {
            boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            this.mInUse = false;
        }
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0L;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }
}
