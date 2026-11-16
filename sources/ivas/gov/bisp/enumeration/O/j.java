package ivas.gov.bisp.enumeration.O;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h {
    private static int a = 0;
    private static int b = 1;
    public final float c;

    public j(float f) {
        this.c = f;
    }

    @Override // ivas.gov.bisp.enumeration.O.h
    public final float b(RectF rectF) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        int i4 = (i3 - (~((i2 ^ 39) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        float f = this.c;
        int i7 = i5 & 79;
        int i8 = ((i5 ^ 79) | i7) << 1;
        int i9 = -((i5 | 79) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
        int i4 = -(((~i2) & 119) | (i2 & (-120)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object[] objArr = i5 % 2 != 0 ? new Object[0] : new Object[1];
        Float fValueOf = Float.valueOf(this.c);
        int i6 = a;
        int i7 = ((i6 | 85) << 1) - (i6 ^ 85);
        b = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = fValueOf;
        int iHashCode = Arrays.hashCode(objArr);
        int i9 = b;
        int i10 = ((i9 & (-68)) | ((~i9) & 67)) + ((i9 & 67) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        boolean z = true;
        if (this == obj) {
            int i8 = i2 & 49;
            int i9 = i8 + ((i2 ^ 49) | i8);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = ((i10 | 111) << 1) - (i10 ^ 111);
            a = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        if (!(obj instanceof j)) {
            int i14 = i6 & 79;
            int i15 = -(-((i6 ^ 79) | i14));
            int i16 = (i14 & i15) + (i14 | i15);
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = (i17 & 5) + (i17 | 5);
            b = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }
        float f = this.c;
        float f2 = ((j) obj).c;
        int i21 = i2 & 125;
        int i22 = (~i21) & (i2 | 125);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 & i23) + (i23 | i22);
        b = i24 % 128;
        Object obj2 = null;
        if (i24 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (f != f2) {
            int i25 = (((i2 | 112) << 1) - (i2 ^ 112)) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            z = false;
        }
        int i27 = b;
        int i28 = (i27 & 107) + (i27 | 107);
        a = i28 % 128;
        if (i28 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
