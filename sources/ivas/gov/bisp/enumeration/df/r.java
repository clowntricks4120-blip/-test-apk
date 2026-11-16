package ivas.gov.bisp.enumeration.df;

import android.content.Context;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.df.h
    public final KeyStore create(Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 107;
        int i6 = (i2 ^ 107) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }
}
