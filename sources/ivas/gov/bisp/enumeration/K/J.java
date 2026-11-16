package ivas.gov.bisp.enumeration.K;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface J extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);
}
