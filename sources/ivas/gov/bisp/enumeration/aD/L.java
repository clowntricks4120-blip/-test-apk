package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class L extends OooO0OO<Integer> implements RandomAccess, af {
    private static int a = 1;
    private static int b;
    public int[] d;
    public int e;

    static {
        new L(new int[0], 0).c = false;
        int i = a;
        int i2 = (i & 89) + (i | 89);
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public L() {
        this.d = new int[10];
        this.e = 0;
    }

    public final void f(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((((i3 | 14) << 1) - (i3 ^ 14)) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        d();
        int i6 = this.e;
        int[] iArr = this.d;
        int i7 = a;
        int i8 = i7 & 55;
        int i9 = (i7 ^ 55) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        if (i6 == iArr.length) {
            int i13 = i11 + 75;
            a = i13 % 128;
            int i14 = i13 % 2;
            int[] iArr2 = new int[ivas.gov.bisp.enumeration.p091n.j.C(i6, 3, 2, 1)];
            int i15 = a;
            int i16 = (i15 | 3) << 1;
            int i17 = -(3 ^ i15);
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.d = iArr2;
            int i20 = a;
            int i21 = i20 & 119;
            int i22 = -(-(i20 | 119));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        int[] iArr3 = this.d;
        int i25 = this.e;
        this.e = (i25 ^ 1) + ((i25 & 1) << 1);
        int i26 = a + 73;
        int i27 = i26 % 128;
        b = i27;
        if (i26 % 2 != 0) {
            iArr3[i25] = i;
            int i28 = 59 / 0;
        } else {
            iArr3[i25] = i;
        }
        int i29 = (i27 ^ 83) + ((i27 & 83) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    public final R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = a + 109;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (i < this.e) {
            throw new IllegalArgumentException();
        }
        L l = new L(Arrays.copyOf(this.d, i), this.e);
        int i5 = a;
        int i6 = i5 & 99;
        int i7 = (i5 | 99) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int h(int i) {
        int i2 = 2 % 2;
        int i3 = a + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        e(i);
        int i5 = this.d[i];
        int i6 = a;
        int i7 = ((i6 & 20) + (i6 | 20)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 55;
        a = i2 % 128;
        int i3 = 0;
        int i4 = i2 % 2 == 0 ? 0 : 1;
        while (i3 < this.e) {
            int i5 = a;
            int i6 = i5 ^ 99;
            int i7 = (i5 & 99) << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i4 * 31;
            int i11 = -(-this.d[i3]);
            int i12 = i10 & i11;
            i4 = ((i10 ^ i11) | i12) + i12;
            int i13 = (((i5 ^ 109) | (i5 & 109)) << 1) - ((i5 & (-110)) | ((~i5) & 109));
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i3 & 70;
            int i16 = ((i3 | 70) & (~i15)) + (i15 << 1);
            int i17 = i16 & (-69);
            int i18 = ((i16 ^ (-69)) | i17) << 1;
            int i19 = -((i16 | (-69)) & (~i17));
            i3 = (i19 | i18) + (i18 & i19);
            int i20 = i5 & 33;
            int i21 = i5 | 33;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = (i24 & 61) + (i24 | 61);
        a = i25 % 128;
        int i26 = i25 % 2;
        return i4;
    }

    public final String i(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        int i3 = b;
        int i4 = ((i3 & 111) - (~(-(-(i3 | 111))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        sb.append(i);
        sb.append(", Size:");
        if (i5 == 0) {
            throw null;
        }
        sb.append(this.e);
        String string = sb.toString();
        int i6 = a;
        int i7 = (i6 ^ 45) + ((i6 & 45) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (~i3) & (i2 | 93);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.e;
        int i9 = (i2 ^ 23) + ((i2 & 23) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public final void e(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 113) << 1;
        int i5 = -((i3 & (-114)) | ((~i3) & 113));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (i < 0 || i >= this.e) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i7 = i3 + 17;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 0;
        }
    }

    public final void removeRange(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 63;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.d;
        int i6 = this.e;
        int i7 = -i2;
        int i8 = ((i6 | i7) << 1) - (((~i6) & i7) | ((~i7) & i6));
        int i9 = b;
        int i10 = i9 | 3;
        int i11 = ((i10 << 1) - (~(-((~(i9 & 3)) & i10)))) - 1;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            System.arraycopy(iArr, i2, iArr, i, i8);
            int i12 = this.e;
            int i13 = -(i2 << i);
            int i14 = i12 & i13;
            int i15 = -(-((i13 ^ i12) | i14));
            i3 = (i14 ^ i15) + ((i15 & i14) << 1);
        } else {
            System.arraycopy(iArr, i2, iArr, i, i8);
            int i16 = this.e;
            int i17 = -(~(-i));
            i3 = (i16 - (~(-((-2) - (((i2 & i17) + (i17 | i2)) ^ (-1)))))) - 1;
        }
        this.e = i3;
        int i18 = b;
        int i19 = i18 ^ 21;
        int i20 = -(-((i18 & 21) << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((AbstractList) this).modCount;
        if (i22 != 0) {
            int i24 = i23 ^ 1;
            i23 = (((i23 & 1) | i24) << 1) - i24;
        }
        ((AbstractList) this).modCount = i23;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0094 A[PHI: r2 r6
  0x0094: PHI (r2v15 int) = (r2v14 int), (r2v24 int) binds: [B:19:0x0092, B:16:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r6v2 int[]) = (r6v1 int[]), (r6v8 int[]) binds: [B:19:0x0092, B:16:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    public final boolean addAll(Collection<? extends Integer> collection) {
        int i;
        int[] iArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 103;
        int i6 = i5 + ((i4 ^ 103) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        d();
        Charset charset = R.c;
        Objects.requireNonNull(collection);
        int i8 = b;
        int i9 = i8 & 17;
        int i10 = -(-((i8 ^ 17) | i9));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        if (!(collection instanceof L)) {
            int i14 = i12 + 77;
            b = i14 % 128;
            int i15 = i14 % 2;
            boolean zAddAll = super.addAll(collection);
            int i16 = b;
            int i17 = i16 ^ 11;
            int i18 = -(-((i16 & 11) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            return zAddAll;
        }
        L l = (L) collection;
        int i21 = l.e;
        Object obj = null;
        if (i21 == 0) {
            int i22 = (i8 & (-124)) | ((~i8) & 123);
            int i23 = -(-((i8 & 123) << 1));
            int i24 = (i22 & i23) + (i22 | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((i8 & 50) + (i8 | 50)) - 1;
            a = i26 % 128;
            if (i26 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        int i27 = this.e;
        int i28 = -i27;
        int i29 = i28 ^ Integer.MAX_VALUE;
        int i30 = (i28 & Integer.MAX_VALUE) << 1;
        if ((i29 ^ i30) + ((i30 & i29) << 1) < i21) {
            throw new OutOfMemoryError();
        }
        int i31 = i8 & 23;
        int i32 = -(-((i8 ^ 23) | i31));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = i33 % 128;
        a = i34;
        if (i33 % 2 == 0) {
            i = i27 << i21;
            iArr = this.d;
            if (i > iArr.length) {
                i2 = (i34 & 87) + (i34 | 87);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    this.d = Arrays.copyOf(iArr, i);
                    int i35 = 58 / 0;
                } else {
                    this.d = Arrays.copyOf(iArr, i);
                }
                int i36 = a;
                int i37 = ((i36 & 116) + (i36 | 116)) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
            }
        } else {
            int i39 = -(-i21);
            i = (i39 | i27) + (i27 & i39);
            iArr = this.d;
            if (i > iArr.length) {
                i2 = (i34 & 87) + (i34 | 87);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    this.d = Arrays.copyOf(iArr, i);
                    int i310 = 58 / 0;
                } else {
                    this.d = Arrays.copyOf(iArr, i);
                }
                int i311 = a;
                int i312 = ((i311 & 116) + (i311 | 116)) - 1;
                b = i312 % 128;
                int i313 = i312 % 2;
            }
        }
        int[] iArr2 = l.d;
        int[] iArr3 = this.d;
        int i40 = this.e;
        int i41 = a + 15;
        b = i41 % 128;
        if (i41 % 2 != 0) {
            System.arraycopy(iArr2, 0, iArr3, i40, l.e);
            this.e = i;
            obj.hashCode();
            throw null;
        }
        System.arraycopy(iArr2, 0, iArr3, i40, l.e);
        this.e = i;
        int i42 = b;
        int i43 = i42 & 119;
        int i44 = (i42 ^ 119) | i43;
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        a = i45 % 128;
        int i46 = i45 % 2;
        ((AbstractList) this).modCount++;
        int i47 = b;
        int i48 = i47 & 37;
        int i49 = (i47 ^ 37) | i48;
        int i50 = (i48 & i49) + (i49 | i48);
        a = i50 % 128;
        if (i50 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 103;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 103)) & i4);
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        e(i);
        Integer numValueOf = Integer.valueOf(this.d[i]);
        int i9 = b;
        int i10 = (i9 & 87) + (i9 | 87);
        a = i10 % 128;
        int i11 = i10 % 2;
        return numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0023 A[SYNTHETIC] */
    public final boolean remove(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 59;
        int i5 = i4 + ((i3 ^ 59) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        d();
        int i7 = b;
        int i8 = (i7 ^ 125) + ((i7 & 125) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            if (i10 >= this.e) {
                int i11 = a;
                int i12 = i11 & 85;
                int i13 = i11 | 85;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 26 / 0;
                }
                return false;
            }
            int i16 = a;
            int i17 = ((i16 | 17) << 1) - (i16 ^ 17);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 26 / 0;
                if (obj.equals(Integer.valueOf(this.d[i10]))) {
                    break;
                }
                i10++;
                int i19 = b;
                int i20 = i19 & 101;
                int i21 = ((i19 ^ 101) | i20) << 1;
                int i22 = -((i19 | 101) & (~i20));
                i = ((i21 | i22) << 1) - (i22 ^ i21);
                a = i % 128;
                if (i % 2 == 0) {
                    int i23 = 3 / 5;
                }
            } else {
                if (obj.equals(Integer.valueOf(this.d[i10]))) {
                    break;
                }
                i10++;
                int i110 = b;
                int i24 = i110 & 101;
                int i25 = ((i110 ^ 101) | i24) << 1;
                int i26 = -((i110 | 101) & (~i24));
                i = ((i25 | i26) << 1) - (i26 ^ i25);
                a = i % 128;
                if (i % 2 == 0) {
                    int i27 = 3 / 5;
                }
            }
        }
        int i28 = b;
        int i29 = i28 & 119;
        int i30 = -(-((i28 ^ 119) | i29));
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = i31 % 128;
        a = i32;
        int i33 = i31 % 2;
        int[] iArr = this.d;
        int i34 = i33 == 0 ? i10 << 1 : (((i10 & (-2)) | ((~i10) & 1)) - (~(-(-((i10 & 1) << 1))))) - 1;
        int i35 = this.e;
        int i36 = i32 + 58;
        int i37 = (i36 ^ (-1)) + (i36 << 1);
        b = i37 % 128;
        int i38 = i37 % 2;
        int i39 = -i10;
        System.arraycopy(iArr, i34, iArr, i10, (((i35 | i39) << 1) - (i39 ^ i35)) - 1);
        int i40 = this.e;
        int i41 = b;
        int i42 = i41 & 85;
        int i43 = ((((i41 ^ 85) | i42) << 1) - (~(-((i41 | 85) & (~i42))))) - 1;
        a = i43 % 128;
        if (i43 % 2 == 0) {
            this.e = i40;
            int i44 = ((AbstractList) this).modCount;
            ((AbstractList) this).modCount = ((i44 | 1) << 1) - (i44 ^ 1);
        } else {
            this.e = (-2) - (~i40);
            int i45 = ((AbstractList) this).modCount;
            int i46 = i45 & 1;
            int i47 = (i45 ^ 1) | i46;
            ((AbstractList) this).modCount = (i46 & i47) + (i47 | i46);
        }
        int i48 = b;
        int i49 = i48 & 57;
        int i50 = (i48 ^ 57) | i49;
        int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
        a = i51 % 128;
        int i52 = i51 % 2;
        int i53 = i48 ^ 49;
        int i54 = ((((i48 & 49) | i53) << 1) - (~(-i53))) - 1;
        a = i54 % 128;
        if (i54 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public L(int[] iArr, int i) {
        this.d = iArr;
        this.e = i;
    }

    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 23) << 1) - (i3 ^ 23);
        a = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            ((Integer) obj).intValue();
            d();
            throw null;
        }
        int iIntValue = ((Integer) obj).intValue();
        d();
        e(i);
        int[] iArr = this.d;
        int i5 = iArr[i];
        int i6 = b;
        int i7 = i6 & 77;
        int i8 = ((i6 | 77) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            iArr[i] = iIntValue;
            return Integer.valueOf(i5);
        }
        iArr[i] = iIntValue;
        Integer.valueOf(i5);
        obj2.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 111;
        int i4 = i3 % 128;
        b = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = (((i2 | 22) << 1) - (i2 ^ 22)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 & 67;
            int i8 = ((i2 ^ 67) | i7) << 1;
            int i9 = -((i2 | 67) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof L)) {
            int i11 = i2 & 83;
            int i12 = ((i2 ^ 83) | i11) << 1;
            int i13 = -((i2 | 83) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                super.equals(obj);
                obj2.hashCode();
                throw null;
            }
            boolean zEquals = super.equals(obj);
            int i15 = a;
            int i16 = (i15 & (-110)) | ((~i15) & 109);
            int i17 = (i15 & 109) << 1;
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            return zEquals;
        }
        L l = (L) obj;
        if (this.e != l.e) {
            int i20 = (i2 ^ 41) + ((i2 & 41) << 1);
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            int i23 = ((i21 ^ 26) + ((i21 & 26) << 1)) - 1;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int[] iArr = l.d;
        int i24 = i4 ^ 117;
        int i25 = (i4 & 117) << 1;
        int i26 = (i24 & i25) + (i24 | i25);
        a = i26 % 128;
        int i27 = i26 % 2;
        int i28 = 0;
        while (i28 < this.e) {
            int i29 = a;
            int i30 = ((i29 & 20) + (i29 | 20)) - 1;
            int i31 = i30 % 128;
            b = i31;
            int i32 = i30 % 2;
            if (this.d[i28] != iArr[i28]) {
                int i33 = i31 ^ 89;
                int i34 = (((i31 & 89) | i33) << 1) - i33;
                a = i34 % 128;
                return i34 % 2 == 0;
            }
            int i35 = (((i28 | 56) << 1) - (i28 ^ 56)) - 1;
            int i36 = i35 ^ (-54);
            int i37 = -(-((i35 & (-54)) << 1));
            i28 = ((i36 | i37) << 1) - (i36 ^ i37);
            int i38 = (i29 & 51) + (i29 | 51);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = b;
        int i41 = ((i40 & 6) + (i40 | 6)) - 1;
        a = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 85 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[PHI: r3
  0x004d: PHI (r3v7 int[]) = (r3v6 int[]), (r3v17 int[]) binds: [B:14:0x004b, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0074 A[PHI: r3
  0x0074: PHI (r3v8 int[]) = (r3v6 int[]), (r3v17 int[]) binds: [B:14:0x004b, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public final void add(int i, Object obj) {
        int i2;
        int[] iArr;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 97;
        int i6 = ((i4 ^ 97) | i5) << 1;
        int i7 = -((i4 | 97) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            ((Integer) obj).intValue();
            d();
            throw null;
        }
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.e)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i9 = a;
        int i10 = i9 ^ 103;
        int i11 = (i9 & 103) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            iArr = this.d;
            int i13 = 52 / 0;
            if (i2 < iArr.length) {
                int i14 = i & 1;
                int i15 = (i14 - (~(-(-((i ^ 1) | i14))))) - 1;
                int i16 = -i;
                int i17 = i2 & i16;
                int i18 = (i2 | i16) & (~i17);
                int i19 = i17 << 1;
                System.arraycopy(iArr, i, iArr, i15, (i18 ^ i19) + ((i18 & i19) << 1));
                int i20 = b;
                int i21 = (i20 & 95) + (i20 | 95);
                a = i21 % 128;
                int i22 = i21 % 2;
            } else {
                int[] iArr2 = new int[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                int i23 = b;
                int i24 = (((i23 | 28) << 1) - (i23 ^ 28)) - 1;
                a = i24 % 128;
                int i25 = i24 % 2;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                int[] iArr3 = this.d;
                int i26 = a;
                int i27 = (((i26 ^ 67) | (i26 & 67)) << 1) - (((~i26) & 67) | (i26 & (-68)));
                b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = this.e;
                int i30 = -i;
                System.arraycopy(iArr3, i, iArr2, i + 1, ((i29 | i30) << 1) - (i29 ^ i30));
                int i31 = b;
                int i32 = i31 ^ 45;
                int i33 = (((i31 & 45) | i32) << 1) - i32;
                int i34 = i33 % 128;
                a = i34;
                int i35 = i33 % 2;
                this.d = iArr2;
                int i36 = (i34 & 2) + (i34 | 2);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
            }
        } else {
            iArr = this.d;
            if (i2 < iArr.length) {
                int i110 = i & 1;
                int i111 = (i110 - (~(-(-((i ^ 1) | i110))))) - 1;
                int i112 = -i;
                int i113 = i2 & i112;
                int i114 = (i2 | i112) & (~i113);
                int i115 = i113 << 1;
                System.arraycopy(iArr, i, iArr, i111, (i114 ^ i115) + ((i114 & i115) << 1));
                int i210 = b;
                int i211 = (i210 & 95) + (i210 | 95);
                a = i211 % 128;
                int i212 = i211 % 2;
            } else {
                int[] iArr4 = new int[ivas.gov.bisp.enumeration.p091n.j.C(i2, 3, 2, 1)];
                int i213 = b;
                int i214 = (((i213 | 28) << 1) - (i213 ^ 28)) - 1;
                a = i214 % 128;
                int i215 = i214 % 2;
                System.arraycopy(iArr, 0, iArr4, 0, i);
                int[] iArr5 = this.d;
                int i216 = a;
                int i217 = (((i216 ^ 67) | (i216 & 67)) << 1) - (((~i216) & 67) | (i216 & (-68)));
                b = i217 % 128;
                int i218 = i217 % 2;
                int i219 = this.e;
                int i39 = -i;
                System.arraycopy(iArr5, i, iArr4, i + 1, ((i219 | i39) << 1) - (i219 ^ i39));
                int i310 = b;
                int i311 = i310 ^ 45;
                int i312 = (((i310 & 45) | i311) << 1) - i311;
                int i313 = i312 % 128;
                a = i313;
                int i314 = i312 % 2;
                this.d = iArr4;
                int i315 = (i313 & 2) + (i313 | 2);
                int i316 = (i315 ^ (-1)) + (i315 << 1);
                b = i316 % 128;
                int i317 = i316 % 2;
            }
        }
        this.d[i] = iIntValue;
        int i40 = this.e;
        int i41 = a;
        int i42 = (i41 & 55) + (i41 | 55);
        b = i42 % 128;
        if (i42 % 2 != 0) {
            this.e = i40;
            ((AbstractList) this).modCount = ((AbstractList) this).modCount;
        } else {
            this.e = i40 + 1;
            int i43 = ((AbstractList) this).modCount;
            ((AbstractList) this).modCount = ((i43 & 2) + (i43 | 2)) - 1;
        }
    }

    public final Object remove(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 95;
        int i7 = (i6 - (~(-(-((i5 ^ 95) | i6))))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            d();
            e(i);
            throw null;
        }
        d();
        e(i);
        int[] iArr = this.d;
        int i8 = iArr[i];
        int i9 = this.e;
        int i10 = (i9 ^ (-1)) | i9;
        if (i < (i9 & i10) + (i10 | i9)) {
            int i11 = a;
            int i12 = i11 & 1;
            int i13 = (i11 | 1) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                i2 = i % 1;
                i3 = i9 >>> i;
            } else {
                int i16 = i & 1;
                int i17 = ((i ^ 1) | i16) << 1;
                int i18 = -((~i16) & (i | 1));
                i2 = (i17 | i18) + (i17 & i18);
                int i19 = -i;
                int i20 = i9 & i19;
                int i21 = (i9 | i19) & (~i20);
                int i22 = -(-(i20 << 1));
                i3 = ((i21 & i22) << 1) + (i21 ^ i22);
            }
            System.arraycopy(iArr, i2, iArr, i, (i3 ^ (-1)) + (i3 << 1));
            int i23 = a;
            int i24 = i23 & 89;
            int i25 = (i23 | 89) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = this.e;
        this.e = (~i29) + (i29 << 1);
        int i30 = ((AbstractList) this).modCount;
        int i31 = a;
        int i32 = i31 & 63;
        int i33 = ((i31 | 63) & (~i32)) + (i32 << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
        int i35 = i30 & 1;
        int i36 = (i30 ^ 1) | i35;
        ((AbstractList) this).modCount = ((i35 | i36) << 1) - (i36 ^ i35);
        Integer numValueOf = Integer.valueOf(i8);
        int i37 = a + 103;
        b = i37 % 128;
        int i38 = i37 % 2;
        return numValueOf;
    }

    public final boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = -(-(i2 | 97));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        f(((Integer) obj).intValue());
        int i7 = a;
        int i8 = i7 & 37;
        int i9 = -(-(i7 | 37));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }
}
