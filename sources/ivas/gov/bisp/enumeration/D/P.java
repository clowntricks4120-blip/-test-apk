package ivas.gov.bisp.enumeration.D;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class P implements t {
    private static int a = 1;
    private static int b;
    public IBinder c;

    public P(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (i3 - (~(-(-((i2 ^ 37) | i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        IBinder iBinder = this.c;
        int i7 = ((i5 & 93) - (~(i5 | 93))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return iBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
