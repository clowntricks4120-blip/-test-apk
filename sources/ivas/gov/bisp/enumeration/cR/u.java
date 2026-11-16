package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.C0244m;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static int a = 1;
    private static int b;
    public final AbstractC0242a c;
    public final C0244m d;
    public final int e;

    public u(AbstractC0242a abstractC0242a, C0244m c0244m, int i) {
        this.c = abstractC0242a;
        this.d = c0244m;
        this.e = i;
    }

    public int hashCode() {
        C0244m c0244m;
        int iHashCode;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = (i3 ^ 43) | i4;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            c0244m = this.d;
            if (c0244m == null) {
                i = 1;
                int i7 = ((i3 & 8) + (i3 | 8)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i3 + 95;
                b = i9 % 128;
                int i10 = i9 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = c0244m.hashCode();
                int i11 = b;
                int i12 = (i11 & 32) + (i11 | 32);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            c0244m = this.d;
            if (c0244m == null) {
                i = 0;
                int i15 = ((i3 & 8) + (i3 | 8)) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                int i17 = i3 + 95;
                b = i17 % 128;
                int i18 = i17 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = c0244m.hashCode();
                int i19 = b;
                int i110 = (i19 & 32) + (i19 | 32);
                int i111 = (i110 ^ (-1)) + (i110 << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        int i20 = this.e;
        AbstractC0242a abstractC0242a = this.c;
        if (abstractC0242a != null) {
            int i21 = b;
            int i22 = i21 & 101;
            int i23 = i22 + ((i21 ^ 101) | i22);
            a = i23 % 128;
            int i24 = i23 % 2;
            iHashCode = abstractC0242a.hashCode();
            if (i24 == 0) {
                int i25 = 99 / 0;
            }
            int i26 = a;
            int i27 = (i26 & 15) + (i26 | 15);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = (((iHashCode2 | 31) << 1) - (iHashCode2 ^ 31)) * 31;
        int i30 = i29 ^ i20;
        int i31 = ((i29 & i20) | i30) << 1;
        int i32 = -i30;
        int i33 = (((i31 | i32) << 1) - (i31 ^ i32)) * 31;
        int i34 = ((i33 | iHashCode) << 1) - (iHashCode ^ i33);
        int i35 = a;
        int i36 = ((i35 ^ 28) + ((i35 & 28) << 1)) - 1;
        b = i36 % 128;
        int i37 = i36 % 2;
        return i34;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 120) + (i2 | 120);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i6 = i2 + 19;
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & 103;
            int i9 = -(-((i2 ^ 103) | i8));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj == null) {
            int i11 = i5 | 59;
            int i12 = ((i11 << 1) - (~(-(i11 & (~(i5 & 59)))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (-2) - ((((i5 | 122) << 1) - (i5 ^ 122)) ^ (-1));
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 / 0;
            }
            return false;
        }
        if (!(obj instanceof u)) {
            int i16 = ((i2 | 67) << 1) - (i2 ^ 67);
            int i17 = i16 % 128;
            b = i17;
            boolean z = !(i16 % 2 == 0);
            int i18 = (-2) - ((i17 + 86) ^ (-1));
            a = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }
        u uVar = (u) obj;
        C0244m c0244m = this.d;
        if (c0244m == null) {
            int i20 = ((i5 ^ 119) | (i5 & 119)) << 1;
            int i21 = -((i5 & (-120)) | ((~i5) & 119));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            if (uVar.d != null) {
                int i24 = (i5 & 75) + (i5 | 75);
                a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = i5 & 125;
                int i27 = (i26 - (~(-(-((i5 ^ 125) | i26))))) - 1;
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
        } else if (!c0244m.equals(uVar.d)) {
            int i28 = b;
            int i29 = (i28 | 31) << 1;
            int i30 = -(i28 ^ 31);
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            int i32 = i31 % 128;
            a = i32;
            int i33 = i31 % 2;
            int i34 = i32 | 15;
            int i35 = i34 << 1;
            int i36 = -((~(i32 & 15)) & i34);
            int i37 = (i35 & i36) + (i36 | i35);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                int i38 = 88 / 0;
            }
            return false;
        }
        if (this.e != uVar.e) {
            int i39 = a;
            int i40 = ((i39 | 103) << 1) - (i39 ^ 103);
            int i41 = i40 % 128;
            b = i41;
            int i42 = i40 % 2;
            int i43 = i41 ^ 105;
            int i44 = (i41 & 105) << 1;
            int i45 = (i43 & i44) + (i44 | i43);
            a = i45 % 128;
            if (i45 % 2 != 0) {
                return false;
            }
            throw null;
        }
        AbstractC0242a abstractC0242a = this.c;
        if (abstractC0242a == null) {
            int i46 = b;
            int i47 = i46 & 109;
            int i48 = ((i46 | 109) & (~i47)) + (i47 << 1);
            int i49 = i48 % 128;
            a = i49;
            int i50 = i48 % 2;
            if (uVar.c != null) {
                int i51 = ((i49 | 107) << 1) - (i49 ^ 107);
                b = i51 % 128;
                boolean z2 = i51 % 2 != 0;
                int i52 = (i49 & (-64)) | ((~i49) & 63);
                int i53 = -(-((i49 & 63) << 1));
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                b = i54 % 128;
                int i55 = i54 % 2;
                return z2;
            }
        } else if (!abstractC0242a.equals(uVar.c)) {
            int i56 = b + 3;
            int i57 = i56 % 128;
            a = i57;
            int i58 = i56 % 2;
            int i59 = i57 + 41;
            b = i59 % 128;
            int i60 = i59 % 2;
            return false;
        }
        int i61 = b + 59;
        a = i61 % 128;
        int i62 = i61 % 2;
        return true;
    }
}
