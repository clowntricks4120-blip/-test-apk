package ivas.gov.bisp.enumeration.p035bh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends n implements Iterable<n> {
    private static int a = 1;
    private static int b;
    public final List<n> c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    public final boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 ^ 27) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (obj != this) {
            int i7 = i2 + 59;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                boolean z2 = obj instanceof W;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof W) {
                List<n> list = ((W) obj).c;
                List<n> list2 = this.c;
                int i8 = i2 + 9;
                a = i8 % 128;
                int i9 = i8 % 2;
                if (list.equals(list2)) {
                    int i10 = a + 81;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                }
            }
            int i12 = a;
            int i13 = (i12 & 103) + (i12 | 103);
            b = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        } else {
            int i15 = a + 81;
            b = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        }
        int i17 = a;
        int i18 = (i17 ^ 31) + ((i17 & 31) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-58)) | ((~i2) & 57)) - (~(-(-((i2 & 57) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.c.hashCode();
        int i5 = a + 15;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Iterator<n> it = this.c.iterator();
        int i7 = a;
        int i8 = ((i7 | 117) << 1) - (i7 ^ 117);
        b = i8 % 128;
        int i9 = i8 % 2;
        return it;
    }
}
