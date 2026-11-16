package ivas.gov.bisp.enumeration.O;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z implements h {
    private static int a = 1;
    private static int b;
    public final float c;

    public z(float f) {
        this.c = f;
    }

    @Override // ivas.gov.bisp.enumeration.O.h
    public final float b(RectF rectF) {
        int i = 2 % 2;
        int i2 = b + 15;
        a = i2 % 128;
        int i3 = i2 % 2;
        float fHeight = rectF.height() * this.c;
        int i4 = a;
        int i5 = i4 & 63;
        int i6 = (i4 ^ 63) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return fHeight;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Float.valueOf(this.c)};
        int i4 = a;
        int i5 = (((i4 & (-12)) | ((~i4) & 11)) - (~((i4 & 11) << 1))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            Arrays.hashCode(objArr);
            throw null;
        }
        int iHashCode = Arrays.hashCode(objArr);
        int i6 = a + 9;
        b = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 5;
        int i6 = (((i4 ^ 5) | i5) << 1) - ((~i5) & (i4 | 5));
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            if (this != obj) {
                z = false;
                if (!(obj instanceof z)) {
                    int i8 = ((i7 ^ 99) | (i7 & 99)) << 1;
                    int i9 = -((i7 & (-100)) | ((~i7) & 99));
                    i2 = (i8 ^ i9) + ((i8 & i9) << 1);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        return true;
                    }
                    return false;
                }
                if (this.c != ((z) obj).c) {
                    int i10 = i7 & 93;
                    int i11 = (i7 ^ 93) | i10;
                    int i12 = (i10 & i11) + (i10 | i11);
                    int i13 = i12 % 128;
                    b = i13;
                    boolean z2 = i12 % 2 != 0;
                    int i14 = (i13 ^ 107) + ((i13 & 107) << 1);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    z = z2;
                }
                int i16 = b;
                int i17 = i16 & 47;
                int i18 = (i16 ^ 47) | i17;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                return z;
            }
            int i21 = i4 + 9;
            int i22 = i21 % 128;
            a = i22;
            int i23 = i21 % 2;
            int i24 = ((i22 ^ 93) | (i22 & 93)) << 1;
            int i25 = -(((~i22) & 93) | (i22 & (-94)));
            i = (i24 ^ i25) + ((i25 & i24) << 1);
            b = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            z = true;
            if (!(obj instanceof z)) {
                int i26 = ((i7 ^ 99) | (i7 & 99)) << 1;
                int i27 = -((i7 & (-100)) | ((~i7) & 99));
                i2 = (i26 ^ i27) + ((i26 & i27) << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                return false;
            }
            if (this.c != ((z) obj).c) {
                int i110 = i7 & 93;
                int i111 = (i7 ^ 93) | i110;
                int i112 = (i110 & i111) + (i110 | i111);
                int i113 = i112 % 128;
                b = i113;
                if (i112 % 2 != 0) {
                }
                int i114 = (i113 ^ 107) + ((i113 & 107) << 1);
                a = i114 % 128;
                int i115 = i114 % 2;
                z = z2;
            }
            int i116 = b;
            int i117 = i116 & 47;
            int i118 = (i116 ^ 47) | i117;
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            a = i119 % 128;
            int i28 = i119 % 2;
            return z;
        }
        int i29 = i4 + 9;
        int i210 = i29 % 128;
        a = i210;
        int i211 = i29 % 2;
        int i212 = ((i210 ^ 93) | (i210 & 93)) << 1;
        int i213 = -(((~i210) & 93) | (i210 & (-94)));
        i = (i212 ^ i213) + ((i213 & i212) << 1);
        b = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
