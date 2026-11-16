package androidx.sqlite.db;

import ivas.gov.bisp.enumeration.K.J;

/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteStatement extends J {
    long executeInsert();

    int executeUpdateDelete();
}
