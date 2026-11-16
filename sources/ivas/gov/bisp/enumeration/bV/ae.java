package ivas.gov.bisp.enumeration.bV;

import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public class ae extends ai {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static final boolean as(String str, int i, String str2, int i2, int i3, boolean z) {
        int i4;
        boolean zRegionMatches;
        int i5;
        int i6 = 2 % 2;
        int i7 = a + 16;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            r.n(str, "<this>");
            r.n(str2, "other");
            int i9 = 15 / 0;
            if (z) {
                zRegionMatches = str.regionMatches(z, i, str2, i2, i3);
                i5 = b + 69;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 4 % 4;
                }
            } else {
                int i11 = a;
                int i12 = i11 & 115;
                int i13 = -(-((i11 ^ 115) | i12));
                i4 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    str.regionMatches(i, str2, i2, i3);
                    throw null;
                }
                zRegionMatches = str.regionMatches(i, str2, i2, i3);
                int i14 = a;
                int i15 = (i14 ^ 27) + ((i14 & 27) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            r.n(str, "<this>");
            r.n(str2, "other");
            if (z) {
                zRegionMatches = str.regionMatches(z, i, str2, i2, i3);
                i5 = b + 69;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i17 = 4 % 4;
                }
            } else {
                int i18 = a;
                int i19 = i18 & 115;
                int i110 = -(-((i18 ^ 115) | i19));
                i4 = ((i19 | i110) << 1) - (i110 ^ i19);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    str.regionMatches(i, str2, i2, i3);
                    throw null;
                }
                zRegionMatches = str.regionMatches(i, str2, i2, i3);
                int i111 = a;
                int i112 = (i111 ^ 27) + ((i111 & 27) << 1);
                b = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i20 = b;
        int i21 = ((i20 | 1) << 1) - (i20 ^ 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return zRegionMatches;
    }

    public static boolean aq(String str, String str2, boolean z, int i) {
        boolean zAs;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 123;
        int i5 = ((i3 | 123) & (~i4)) + (i4 << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if ((i & 2) != 0) {
            int i8 = (i6 & (-84)) | ((~i6) & 83);
            int i9 = (i6 & 83) << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            z = i10 % 2 != 0;
            int i11 = (i6 & 66) + (i6 | 66);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        boolean z2 = z;
        r.n(str2, "prefix");
        if (!z2) {
            int i14 = b;
            int i15 = i14 & 69;
            int i16 = (i14 | 69) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            zAs = str.startsWith(str2);
            int i20 = b;
            int i21 = (i20 ^ 99) + ((i20 & 99) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        } else {
            zAs = as(str, 0, str2, 0, str2.length(), z2);
            int i23 = (-2) - ((a + 112) ^ (-1));
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = b;
        int i26 = i25 & 47;
        int i27 = ((i25 ^ 47) | i26) << 1;
        int i28 = -((i25 | 47) & (~i26));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        a = i29 % 128;
        if (i29 % 2 == 0) {
            int i30 = 84 / 0;
        }
        return zAs;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x008e  */
    public static boolean ar(String str, String str2, boolean z, int i) {
        boolean zAs;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 81;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if ((i & 2) == 0) {
            if (z) {
                int length = str.length();
                int i7 = -(~(-str2.length()));
                int i8 = ((length & i7) + (length | i7)) - 1;
                int i9 = b + 27;
                a = i9 % 128;
                int i10 = i9 % 2;
                zAs = as(str, i8, str2, 0, str2.length(), true);
                int i11 = b;
                int i12 = i11 ^ 67;
                int i13 = -(-((i11 & 67) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 2 / 5;
                }
            }
            i2 = (-2) - ((b + 106) ^ (-1));
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return zAs;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i16 = i5 + 63;
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i5 + 123;
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = b + 46;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        zAs = str.endsWith(str2);
        int i23 = a;
        int i24 = (i23 ^ 21) + ((i23 & 21) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        i2 = (-2) - ((b + 106) ^ (-1));
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return zAs;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
