package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0O.o000oOoO;
import ivas.gov.bisp.enumeration.p102y.J;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bh.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0144q extends n {
    private static int a = 1;
    private static int b;
    public final o000oOoO<String, n> c = new J();

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    public final boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = ((i2 | 101) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if (obj != this) {
            int i7 = i5 & 45;
            int i8 = i7 + ((i5 ^ 45) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (obj instanceof C0144q) {
                int i10 = i5 & 39;
                int i11 = (i10 - (~((i5 ^ 39) | i10))) - 1;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    o000oOoO<String, n> o000oooo = ((C0144q) obj).c;
                    obj2.hashCode();
                    throw null;
                }
                if (((C0144q) obj).c.equals(this.c)) {
                    int i12 = a;
                    int i13 = (i12 ^ 37) + ((i12 & 37) << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                }
            }
            int i15 = a;
            int i16 = (i15 & 53) + (i15 | 53);
            b = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        } else {
            int i18 = a;
            int i19 = (i18 ^ 37) + ((i18 & 37) << 1);
            b = i19 % 128;
            int i110 = i19 % 2;
            z = true;
        }
        int i20 = b;
        int i21 = i20 & 29;
        int i22 = (i20 ^ 29) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = ((i2 ^ 53) | i3) << 1;
        int i5 = -((i2 | 53) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iHashCode = this.c.hashCode();
        int i8 = a;
        int i9 = ((i8 ^ 74) + ((i8 & 74) << 1)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 2 / 0;
        }
        return iHashCode;
    }
}
