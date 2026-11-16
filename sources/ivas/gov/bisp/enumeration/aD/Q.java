package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends OooO0OO<Float> implements RandomAccess, af {
    private static int a = 1;
    private static int b;
    public float[] d;
    public int e;

    static {
        Q q = new Q(new float[0], 0);
        int i = b;
        int i2 = ((i ^ 7) | (i & 7)) << 1;
        int i3 = -(((~i) & 7) | (i & (-8)));
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            q.c = true;
        } else {
            q.c = false;
        }
    }

    public Q() {
        this.d = new float[10];
        this.e = 0;
    }

    public final void e(int i) {
        int i2 = 2 % 2;
        int i3 = a + 25;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (i >= 0) {
            int i6 = i4 & 13;
            int i7 = (i4 ^ 13) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i < this.e) {
                int i10 = i9 & 55;
                int i11 = i9 | 55;
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    public final String h(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        int i3 = b;
        int i4 = ((i3 ^ 74) + ((i3 & 74) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(i);
        sb.append(", Size:");
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
        sb.append(this.e);
        String string = sb.toString();
        int i7 = a;
        int i8 = i7 ^ 75;
        int i9 = ((((i7 & 75) | i8) << 1) - (~(-i8))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    public final boolean remove(Object obj) {
        int i;
        float[] fArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            d();
            i = 1;
        } else {
            d();
            i = 0;
        }
        while (i < this.e) {
            int i6 = a;
            int i7 = i6 & 5;
            int i8 = (i6 | 5) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            if (obj.equals(Float.valueOf(this.d[i]))) {
                int i12 = b;
                int i13 = ((i12 ^ 15) | (i12 & 15)) << 1;
                int i14 = -((i12 & (-16)) | ((~i12) & 15));
                int i15 = (i13 & i14) + (i13 | i14);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    fArr = this.d;
                    i2 = (i - (~((i ^ (-1)) | i))) - 1;
                } else {
                    fArr = this.d;
                    int i16 = i & 1;
                    int i17 = ((i ^ 1) | i16) << 1;
                    int i18 = -((~i16) & (i | 1));
                    i2 = (i17 | i18) + (i17 & i18);
                }
                int i19 = i12 ^ 79;
                int i20 = ((((i12 & 79) | i19) << 1) - (~(-i19))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                int i22 = this.e;
                int i23 = -i;
                int i24 = i22 | i23;
                System.arraycopy(fArr, i2, fArr, i, (-2) - (((i24 << 1) - ((~(i22 & i23)) & i24)) ^ (-1)));
                int i25 = a;
                int i26 = i25 & 33;
                int i27 = (i25 | 33) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    this.e = this.e;
                } else {
                    int i30 = this.e;
                    int i31 = (i30 ^ (-1)) | i30;
                    this.e = (i30 ^ i31) + ((i30 & i31) << 1);
                }
                int i32 = ((AbstractList) this).modCount;
                ((AbstractList) this).modCount = (-2) - ((((i32 | 2) << 1) - (i32 ^ 2)) ^ (-1));
                int i33 = b;
                int i34 = ((i33 | 83) << 1) - (i33 ^ 83);
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i35 = (((i & (-23)) | ((~i) & 22)) - (~((i & 22) << 1))) - 1;
            i = ((i35 | (-21)) << 1) - (((~i35) & (-21)) | (i35 & 20));
            int i36 = b;
            int i37 = i36 | 125;
            int i38 = i37 << 1;
            int i39 = -((~(i36 & 125)) & i37);
            int i40 = (i38 & i39) + (i39 | i38);
            a = i40 % 128;
            int i41 = i40 % 2;
        }
        int i42 = b;
        int i43 = (i42 & (-84)) | ((~i42) & 83);
        int i44 = (i42 & 83) << 1;
        int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
        a = i45 % 128;
        if (i45 % 2 == 0) {
            int i46 = 61 / 0;
        }
        return false;
    }

    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = i4 + ((i3 ^ 25) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        e(i);
        int i7 = b;
        int i8 = ((i7 & 78) + (i7 | 78)) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            float[] fArr = this.d;
            float f = fArr[i];
            fArr[i] = fFloatValue;
            throw null;
        }
        float[] fArr2 = this.d;
        float f2 = fArr2[i];
        fArr2[i] = fFloatValue;
        int i9 = i7 & 49;
        int i10 = ((~i9) & (i7 | 49)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        Float fValueOf = Float.valueOf(f2);
        int i12 = b;
        int i13 = ((i12 | 95) << 1) - (i12 ^ 95);
        a = i13 % 128;
        int i14 = i13 % 2;
        return fValueOf;
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 49) + (i2 | 49);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.e;
        int i7 = i4 ^ 61;
        int i8 = -(-((i4 & 61) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = -(-((i2 ^ 117) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this == obj) {
            int i8 = i2 & 1;
            int i9 = -(-(i2 | 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof Q)) {
            int i12 = ((i6 | 59) << 1) - (i6 ^ 59);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return super.equals(obj);
            }
            super.equals(obj);
            obj2.hashCode();
            throw null;
        }
        Q q = (Q) obj;
        if (this.e != q.e) {
            int i13 = (i6 ^ 85) + ((i6 & 85) << 1);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = (i14 & 96) + (i14 | 96);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        float[] fArr = q.d;
        int i19 = (-2) - ((i2 + 124) ^ (-1));
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < this.e) {
            int i22 = b;
            int i23 = ((i22 | 53) << 1) - (i22 ^ 53);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 33 / 0;
                if (Float.floatToIntBits(this.d[i21]) != Float.floatToIntBits(fArr[i21])) {
                    int i25 = b;
                    int i26 = i25 & 79;
                    int i27 = (i26 - (~((i25 ^ 79) | i26))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    return false;
                }
                int i29 = i21 & 95;
                int i30 = -(-(i21 | 95));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = i31 & (-94);
                int i33 = (i31 ^ (-94)) | i32;
                i21 = ((i32 & i33) << 1) + (i32 ^ i33);
                int i34 = a + 41;
                b = i34 % 128;
                int i35 = i34 % 2;
            } else {
                if (Float.floatToIntBits(this.d[i21]) != Float.floatToIntBits(fArr[i21])) {
                    int i210 = b;
                    int i211 = i210 & 79;
                    int i212 = (i211 - (~((i210 ^ 79) | i211))) - 1;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                    return false;
                }
                int i214 = i21 & 95;
                int i36 = -(-(i21 | 95));
                int i37 = (i214 & i36) + (i36 | i214);
                int i38 = i37 & (-94);
                int i39 = (i37 ^ (-94)) | i38;
                i21 = ((i38 & i39) << 1) + (i38 ^ i39);
                int i310 = a + 41;
                b = i310 % 128;
                int i311 = i310 % 2;
            }
        }
        int i40 = b;
        int i41 = ((i40 ^ 76) + ((i40 & 76) << 1)) - 1;
        a = i41 % 128;
        if (i41 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final void f(float f) {
        float[] fArr;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 93) + ((i3 & 93) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        d();
        int i6 = this.e;
        float[] fArr2 = this.d;
        int i7 = a;
        int i8 = ((i7 ^ 38) + ((i7 & 38) << 1)) - 1;
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (i6 == fArr2.length) {
            int i11 = i9 & 85;
            int i12 = -(-((i9 ^ 85) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                fArr = new float[ivas.gov.bisp.enumeration.p091n.j.C(i6, 5, 5, 1)];
                i = 1;
            } else {
                fArr = new float[ivas.gov.bisp.enumeration.p091n.j.C(i6, 3, 2, 1)];
                i = 0;
            }
            System.arraycopy(fArr2, i, fArr, i, i6);
            this.d = fArr;
            int i14 = b + 25;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        float[] fArr3 = this.d;
        int i16 = this.e;
        int i17 = i16 ^ 1;
        int i18 = ((i16 & 1) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = b;
        int i22 = i21 | 67;
        int i23 = i22 << 1;
        int i24 = -((~(i21 & 67)) & i22);
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int i26 = i25 % 128;
        a = i26;
        int i27 = i25 % 2;
        this.e = i20;
        fArr3[i16] = f;
        int i28 = i26 + 45;
        b = i28 % 128;
        if (i28 % 2 != 0) {
            throw null;
        }
    }

    public final R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 125;
        int i5 = -(-((i3 ^ 125) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (i < this.e) {
            throw new IllegalArgumentException();
        }
        Q q = new Q(Arrays.copyOf(this.d, i), this.e);
        int i8 = a;
        int i9 = (i8 | 85) << 1;
        int i10 = -(i8 ^ 85);
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 93 / 0;
        }
        return q;
    }

    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 49;
        int i5 = i4 + ((i3 ^ 49) | i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            e(i);
            float f = this.d[i];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e(i);
        Float fValueOf = Float.valueOf(this.d[i]);
        int i6 = b;
        int i7 = ((i6 | 81) << 1) - (i6 ^ 81);
        a = i7 % 128;
        int i8 = i7 % 2;
        return fValueOf;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 25) + (i2 | 25);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = (i4 & 49) + (i4 | 49);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        int i9 = 1;
        while (i8 < this.e) {
            int i10 = a;
            int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i9 * 31;
            int i14 = -(-Float.floatToIntBits(this.d[i8]));
            int i15 = i13 & i14;
            int i16 = -(-((i13 ^ i14) | i15));
            i9 = ((i15 | i16) << 1) - (i16 ^ i15);
            int i17 = b;
            int i18 = i17 ^ 69;
            int i19 = ((i17 & 69) | i18) << 1;
            int i20 = -i18;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            i8 = (-2) - ((i8 + 2) ^ (-1));
            int i23 = ((i17 & 6) + (i17 | 6)) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = a;
        int i26 = i25 & 107;
        int i27 = -(-(i25 | 107));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        b = i28 % 128;
        int i29 = i28 % 2;
        return i9;
    }

    public final void removeRange(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 49;
        int i6 = ((((i4 & 49) | i5) << 1) - (~(-i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i8 = a;
        int i9 = i8 & 63;
        int i10 = (i8 ^ 63) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        float[] fArr = this.d;
        int i13 = this.e;
        int i14 = -i2;
        int i15 = i13 & i14;
        int i16 = (i13 | i14) & (~i15);
        int i17 = -(-(i15 << 1));
        System.arraycopy(fArr, i2, fArr, i, (i16 ^ i17) + ((i16 & i17) << 1));
        int i18 = a;
        int i19 = i18 & 41;
        int i20 = ((i18 ^ 41) | i19) << 1;
        int i21 = -((i18 | 41) & (~i19));
        int i22 = (i20 & i21) + (i21 | i20);
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = this.e;
        int i25 = -i;
        int i26 = i2 & i25;
        int i27 = -(~(-((((i2 ^ i25) | i26) << 1) - ((i25 | i2) & (~i26)))));
        this.e = (-2) - (((i24 & i27) + (i27 | i24)) ^ (-1));
        int i28 = ((AbstractList) this).modCount;
        int i29 = a + 75;
        b = i29 % 128;
        if (i29 % 2 != 0) {
            ((AbstractList) this).modCount = i28;
            return;
        }
        int i30 = i28 & 1;
        int i31 = (i28 ^ 1) | i30;
        ((AbstractList) this).modCount = (i30 ^ i31) + ((i31 & i30) << 1);
    }

    public Q(float[] fArr, int i) {
        this.d = fArr;
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f A[PHI: r3 r4
  0x006f: PHI (r3v6 float) = (r3v5 float), (r3v8 float) binds: [B:12:0x006d, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r4v6 int) = (r4v5 int), (r4v12 int) binds: [B:12:0x006d, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object remove(int i) {
        float[] fArr;
        float f;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 123) << 1) - (~(-(((~i4) & 123) | (i4 & (-124)))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            d();
            e(i);
            fArr = this.d;
            int i6 = 55 / 0;
        } else {
            d();
            e(i);
            fArr = this.d;
        }
        int i7 = b;
        int i8 = i7 & 33;
        int i9 = (((~i8) & (i7 | 33)) - (~(i8 << 1))) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            f = fArr[i];
            i2 = this.e;
            int i10 = i2 & 1;
            int i11 = ((i2 ^ 1) | i10) << 1;
            int i12 = -((~i10) & (i2 | 1));
            if (i < ((i11 | i12) << 1) - (i11 ^ i12)) {
                int i13 = i7 & 29;
                int i14 = i13 + ((i7 ^ 29) | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i & 1;
                int i17 = -(-(i | 1));
                int i18 = (i16 & i17) + (i16 | i17);
                int i19 = -i;
                int i20 = i2 & i19;
                int i21 = (i19 ^ i2) | i20;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                System.arraycopy(fArr, i18, fArr, i, (i22 - (~((i22 ^ (-1)) | i22))) - 1);
                int i23 = b;
                int i24 = (i23 ^ 77) + ((i23 & 77) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        } else {
            f = fArr[i];
            i2 = this.e;
            int i26 = ((i2 ^ (-1)) | i2) << 1;
            int i27 = -(~i2);
            if (i < (i26 & i27) + (i26 | i27)) {
                int i110 = i7 & 29;
                int i111 = i110 + ((i7 ^ 29) | i110);
                a = i111 % 128;
                int i112 = i111 % 2;
                int i113 = i & 1;
                int i114 = -(-(i | 1));
                int i115 = (i113 & i114) + (i113 | i114);
                int i116 = -i;
                int i28 = i2 & i116;
                int i29 = (i116 ^ i2) | i28;
                int i210 = ((i28 | i29) << 1) - (i29 ^ i28);
                System.arraycopy(fArr, i115, fArr, i, (i210 - (~((i210 ^ (-1)) | i210))) - 1);
                int i211 = b;
                int i212 = (i211 ^ 77) + ((i211 & 77) << 1);
                a = i212 % 128;
                int i213 = i212 % 2;
            }
        }
        this.e--;
        int i30 = b;
        int i31 = (i30 ^ 87) + ((i30 & 87) << 1);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            ((AbstractList) this).modCount = ((AbstractList) this).modCount;
        } else {
            int i32 = ((AbstractList) this).modCount;
            int i33 = i32 & 1;
            ((AbstractList) this).modCount = i33 + ((i32 ^ 1) | i33);
        }
        Float fValueOf = Float.valueOf(f);
        int i34 = b;
        int i35 = i34 ^ 61;
        int i36 = ((((i34 & 61) | i35) << 1) - (~(-i35))) - 1;
        a = i36 % 128;
        int i37 = i36 % 2;
        return fValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e A[PHI: r1 r2
  0x007e: PHI (r1v28 int) = (r1v27 int), (r1v34 int) binds: [B:19:0x007c, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r2v20 float[]) = (r2v19 float[]), (r2v35 float[]) binds: [B:19:0x007c, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    public final boolean addAll(Collection<? extends Float> collection) {
        int i;
        float[] fArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-66)) | ((~i4) & 65);
        int i6 = -(-((i4 & 65) << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        d();
        Charset charset = R.c;
        Objects.requireNonNull(collection);
        int i9 = b;
        int i10 = i9 & 59;
        int i11 = i10 + ((i9 ^ 59) | i10);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        if (!(collection instanceof Q)) {
            int i14 = (i9 ^ 91) + ((i9 & 91) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            boolean zAddAll = super.addAll(collection);
            int i16 = b;
            int i17 = i16 & 121;
            int i18 = (i17 - (~(-(-((i16 ^ 121) | i17))))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            return zAddAll;
        }
        Q q = (Q) collection;
        int i20 = q.e;
        if (i20 == 0) {
            int i21 = i9 + 9;
            a = i21 % 128;
            return i21 % 2 == 0;
        }
        int i22 = this.e;
        int i23 = -i22;
        if ((i23 ^ Integer.MAX_VALUE) + ((i23 & Integer.MAX_VALUE) << 1) < i20) {
            throw new OutOfMemoryError();
        }
        int i24 = i12 + 65;
        b = i24 % 128;
        if (i24 % 2 != 0) {
            i = i22 / i20;
            fArr = this.d;
            if (i > fArr.length) {
                int i25 = i12 & 121;
                int i26 = ((i12 ^ 121) | i25) << 1;
                int i27 = -((i12 | 121) & (~i25));
                i2 = ((i26 | i27) << 1) - (i27 ^ i26);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    this.d = Arrays.copyOf(fArr, i);
                    int i28 = 63 / 0;
                } else {
                    this.d = Arrays.copyOf(fArr, i);
                }
            }
        } else {
            int i29 = -(-i20);
            int i30 = ((i22 ^ i29) | (i22 & i29)) << 1;
            int i31 = -(((~i22) & i29) | ((~i29) & i22));
            i = ((i30 | i31) << 1) - (i31 ^ i30);
            fArr = this.d;
            if (i > fArr.length) {
                int i210 = i12 & 121;
                int i211 = ((i12 ^ 121) | i210) << 1;
                int i212 = -((i12 | 121) & (~i210));
                i2 = ((i211 | i212) << 1) - (i212 ^ i211);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    this.d = Arrays.copyOf(fArr, i);
                    int i213 = 63 / 0;
                } else {
                    this.d = Arrays.copyOf(fArr, i);
                }
            }
        }
        float[] fArr2 = q.d;
        float[] fArr3 = this.d;
        int i32 = this.e;
        int i33 = b;
        int i34 = i33 & 39;
        int i35 = i34 + ((i33 ^ 39) | i34);
        a = i35 % 128;
        if (i35 % 2 == 0) {
            System.arraycopy(fArr2, 0, fArr3, i32, q.e);
            this.e = i;
            int i36 = 22 / 0;
        } else {
            System.arraycopy(fArr2, 0, fArr3, i32, q.e);
            this.e = i;
        }
        int i37 = ((AbstractList) this).modCount;
        int i38 = i37 ^ 1;
        int i39 = -(-((i37 & 1) << 1));
        ((AbstractList) this).modCount = ((i38 | i39) << 1) - (i39 ^ i38);
        int i40 = a;
        int i41 = i40 & 101;
        int i42 = ((i40 ^ 101) | i41) << 1;
        int i43 = -((i40 | 101) & (~i41));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        b = i44 % 128;
        int i45 = i44 % 2;
        return true;
    }

    public final void add(int i, Object obj) {
        int i2;
        float[] fArr;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 73;
        a = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            ((Float) obj).floatValue();
            d();
            obj2.hashCode();
            throw null;
        }
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i < 0 || i > (i2 = this.e)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i6 = a;
        int i7 = ((i6 | 117) << 1) - (i6 ^ 117);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int length = this.d.length;
            throw null;
        }
        float[] fArr2 = this.d;
        if (i2 < fArr2.length) {
            int i8 = -i;
            int i9 = i2 & i8;
            int i10 = ((i2 ^ i8) | i9) << 1;
            int i11 = -((i2 | i8) & (~i9));
            System.arraycopy(fArr2, i, fArr2, (-2) - ((i + 2) ^ (-1)), ((i10 | i11) << 1) - (i11 ^ i10));
            int i12 = b;
            int i13 = i12 & 77;
            int i14 = ((i12 ^ 77) | i13) << 1;
            int i15 = -((i12 | 77) & (~i13));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            float[] fArr3 = new float[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
            int i18 = b;
            int i19 = (i18 & 67) + (i18 | 67);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                System.arraycopy(fArr2, 0, fArr3, 0, i);
                fArr = this.d;
                i3 = i;
            } else {
                System.arraycopy(fArr2, 0, fArr3, 0, i);
                fArr = this.d;
                i3 = (i & 1) + (i | 1);
            }
            int i20 = a;
            int i21 = i20 & 113;
            int i22 = ((i20 | 113) & (~i21)) + (i21 << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            int i24 = this.e;
            int i25 = -i;
            System.arraycopy(fArr, i, fArr3, i3, (((~i25) & i24) | ((~i24) & i25)) + ((i24 & i25) << 1));
            this.d = fArr3;
            int i26 = a;
            int i27 = ((i26 ^ 9) - (~(-(-((i26 & 9) << 1))))) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        this.d[i] = fFloatValue;
        int i29 = this.e;
        int i30 = i29 & 1;
        int i31 = i29 | 1;
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = a + 21;
        b = i33 % 128;
        int i34 = i33 % 2;
        this.e = i32;
        int i35 = ((AbstractList) this).modCount;
        ((AbstractList) this).modCount = (i35 ^ 1) + ((i35 & 1) << 1);
        int i36 = a;
        int i37 = (-2) - ((((i36 | 106) << 1) - (i36 ^ 106)) ^ (-1));
        b = i37 % 128;
        int i38 = i37 % 2;
    }

    public final boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = i3 + ((i2 ^ 93) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            f(((Float) obj).floatValue());
            int i5 = 71 / 0;
        } else {
            f(((Float) obj).floatValue());
        }
        int i6 = b;
        int i7 = ((i6 & (-20)) | ((~i6) & 19)) + ((i6 & 19) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }
}
