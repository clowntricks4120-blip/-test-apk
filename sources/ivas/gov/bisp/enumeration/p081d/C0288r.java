package ivas.gov.bisp.enumeration.p081d;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.d.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288r {
    private static int a = 0;
    private static int b = 1;
    public final Object c;

    public C0288r(Object obj) {
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = (i2 ^ 81) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        Object obj4 = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i6 = (i2 & 29) + (i2 | 29);
            a = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj != null) {
            int i8 = ((i2 ^ 115) | (i2 & 115)) << 1;
            int i9 = -(((~i2) & 115) | (i2 & (-116)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                obj.getClass();
                obj4.hashCode();
                throw null;
            }
            if (C0288r.class == obj.getClass()) {
                int i11 = b;
                int i12 = (i11 & (-126)) | ((~i11) & 125);
                int i13 = (i11 & 125) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    obj2 = this.c;
                    obj3 = ((C0288r) obj).c;
                    int i15 = 62 / 0;
                } else {
                    obj2 = this.c;
                    obj3 = ((C0288r) obj).c;
                }
                boolean zEquals = Objects.equals(obj2, obj3);
                int i16 = b + 73;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    return zEquals;
                }
                throw null;
            }
        }
        int i17 = a;
        int i18 = (i17 ^ 125) + ((i17 & 125) << 1);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 49 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = ((~i3) & (i2 | 101)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = this.c;
        if (obj == null) {
            int i6 = (i2 ^ 33) + ((i2 & 33) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int i9 = i7 & 21;
            int i10 = (i9 - (~((i7 ^ 21) | i9))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            int i12 = a;
            int i13 = ((i12 | 39) << 1) - (i12 ^ 39);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = (i15 ^ 121) + ((i15 & 121) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            j.w("DisplayCutoutCompat{");
            throw null;
        }
        StringBuilder sbW = j.w("DisplayCutoutCompat{");
        sbW.append(this.c);
        sbW.append("}");
        int i6 = a;
        int i7 = (-2) - ((((i6 | 22) << 1) - (i6 ^ 22)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            sbW.toString();
            obj.hashCode();
            throw null;
        }
        String string = sbW.toString();
        int i8 = b;
        int i9 = (-2) - (((i8 ^ 12) + ((i8 & 12) << 1)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }
}
