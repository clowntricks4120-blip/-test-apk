package ivas.gov.bisp.enumeration.p052by;

import ivas.gov.bisp.enumeration.bG.B;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class aY implements Comparator<B> {
    private static int a = 0;
    private static int b = 1;

    @Override // java.util.Comparator
    public int compare(B b2, B b3) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 105;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = b3.f;
            throw null;
        }
        int i5 = b3.f;
        int i6 = b2.f;
        if (i5 > i6) {
            int i7 = b;
            int i8 = ((i7 & 23) - (~(-(-(i7 | 23))))) - 1;
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = (i9 | 13) << 1;
            int i12 = -(i9 ^ 13);
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 % 2;
            }
            i = 1;
        } else if (i5 < i6) {
            int i15 = b;
            int i16 = i15 & 23;
            int i17 = i15 | 23;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            int i20 = (((i15 | 72) << 1) - (i15 ^ 72)) - 1;
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 4 % 3;
            }
            i = -1;
        } else {
            int i22 = a;
            int i23 = i22 & 43;
            int i24 = (i22 | 43) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 2 % 4;
            }
            i = 0;
        }
        int i28 = b;
        int i29 = i28 ^ 5;
        int i30 = ((i28 & 5) | i29) << 1;
        int i31 = -i29;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        a = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 68 / 0;
        }
        return i;
    }
}
