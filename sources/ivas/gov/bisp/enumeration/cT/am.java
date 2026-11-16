package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.p096p.h;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class am extends S implements V {
    private static int a = 1;
    private static int b;
    public static final am c = new am();

    static {
        int i = b;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public final Class<?> b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = (i2 | 99) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = i7 & 23;
        int i10 = -(-((i7 ^ 23) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 56 / 0;
        }
        return Date.class;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public final long d(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 125;
        int i4 = ((i2 & 125) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        long time = ((Date) obj).getTime();
        int i8 = a;
        int i9 = i8 & 51;
        int i10 = (i8 | 51) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 69 / 0;
        }
        return time;
    }
}
