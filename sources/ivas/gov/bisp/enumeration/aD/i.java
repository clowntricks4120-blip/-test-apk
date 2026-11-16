package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i extends OooO0OO<Boolean> implements RandomAccess, af {
    private static int a = 1;
    private static int b;
    public boolean[] d;
    public int e;

    static {
        new i(new boolean[0], 0).c = false;
        int i = b;
        int i2 = i & 45;
        int i3 = (((i | 45) & (~i2)) - (~(i2 << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public i() {
        this.d = new boolean[10];
        this.e = 0;
    }

    public final void e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = (i4 - (~((i3 ^ 3) | i4))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i >= 0) {
            int i8 = i6 + 109;
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i < this.e) {
                int i10 = i9 + 29;
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r5 >= r4.e) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r5 >= r4.e) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.aD.i(java.util.Arrays.copyOf(r4.d, r5), r4.e);
        r5 = ivas.gov.bisp.enumeration.aD.i.a;
        r2 = r5 ^ 29;
        r5 = (r5 & 29) << 1;
        r3 = (r2 & r5) + (r5 | r2);
        ivas.gov.bisp.enumeration.aD.i.b = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.aD.R.biN g(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.i.a
            r2 = r1 ^ 65
            r1 = r1 & 65
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            r3 = r1 | r2
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.aD.i.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L23
            int r1 = r4.e
            r2 = 11
            int r2 = r2 / 0
            if (r5 < r1) goto L46
            goto L27
        L23:
            int r1 = r4.e
            if (r5 < r1) goto L46
        L27:
            ivas.gov.bisp.enumeration.aD.i r1 = new ivas.gov.bisp.enumeration.aD.i
            boolean[] r2 = r4.d
            boolean[] r5 = java.util.Arrays.copyOf(r2, r5)
            int r2 = r4.e
            r1.<init>(r5, r2)
            int r5 = ivas.gov.bisp.enumeration.aD.i.a
            r2 = r5 ^ 29
            r5 = r5 & 29
            int r5 = r5 << 1
            r3 = r2 & r5
            r5 = r5 | r2
            int r3 = r3 + r5
            int r5 = r3 % 128
            ivas.gov.bisp.enumeration.aD.i.b = r5
            int r3 = r3 % r0
            return r1
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.i.g(int):ivas.gov.bisp.enumeration.aD.R$biN");
    }

    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 83) + ((i3 & 83) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        e(i);
        Boolean boolValueOf = Boolean.valueOf(this.d[i]);
        int i6 = b;
        int i7 = i6 & 9;
        int i8 = i6 | 9;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public final String h(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        int i3 = b;
        int i4 = (i3 & 43) + (i3 | 43);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            sb.append(i);
            sb.append(", Size:");
            int i5 = 44 / 0;
        } else {
            sb.append(i);
            sb.append(", Size:");
        }
        int i6 = b;
        int i7 = i6 & 63;
        int i8 = ((((i6 ^ 63) | i7) << 1) - (~(-((i6 | 63) & (~i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        sb.append(this.e);
        if (i9 != 0) {
            return sb.toString();
        }
        int i10 = 64 / 0;
        return sb.toString();
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 47;
        b = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 ^ 65;
        int i6 = ((i2 & 65) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iB = 1;
        while (i4 < this.e) {
            int i10 = b;
            int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                iB = (iB * 66) + R.b(this.d[i4]);
                int i12 = (((i4 ^ 46) | (i4 & 46)) << 1) - (((~i4) & 46) | (i4 & (-47)));
                i4 = ((i12 & (-51)) | ((~i12) & 50)) + ((i12 & 50) << 1);
            } else {
                int i13 = iB * 31;
                int i14 = -(-R.b(this.d[i4]));
                int i15 = i13 | i14;
                int i16 = i15 << 1;
                int i17 = -((~(i13 & i14)) & i15);
                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                iB = (i16 ^ i17) + ((i17 & i16) << 1);
            }
            int i18 = b + 15;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = (((i20 | 30) << 1) - (i20 ^ 30)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
        return iB;
    }

    public final boolean remove(Object obj) {
        boolean[] zArr;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 114) + (i3 | 114);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        d();
        int i7 = a;
        int i8 = i7 & 49;
        int i9 = i8 + ((i7 ^ 49) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < this.e) {
            int i12 = b;
            int i13 = ((i12 | 105) << 1) - (i12 ^ 105);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                obj.equals(Boolean.valueOf(this.d[i11]));
                throw null;
            }
            if (obj.equals(Boolean.valueOf(this.d[i11]))) {
                int i14 = b;
                int i15 = (i14 & 58) + (i14 | 58);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    zArr = this.d;
                    i = i11 % 0;
                } else {
                    zArr = this.d;
                    i = ((i11 & (-2)) | ((~i11) & 1)) + ((i11 & 1) << 1);
                }
                int i17 = this.e;
                int i18 = -i11;
                int i19 = i17 & i18;
                int i20 = ((((i17 ^ i18) | i19) << 1) - (~(-((i17 | i18) & (~i19))))) - 1;
                int i21 = ((i20 ^ (-1)) | i20) << 1;
                int i22 = -(~i20);
                System.arraycopy(zArr, i, zArr, i11, ((i21 | i22) << 1) - (i21 ^ i22));
                int i23 = this.e;
                int i24 = b;
                int i25 = ((((i24 ^ 57) | (i24 & 57)) << 1) - (~(-(((~i24) & 57) | (i24 & (-58)))))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                this.e = (-2) - (i23 ^ (-1));
                int i27 = ((AbstractList) this).modCount;
                int i28 = i27 & 1;
                int i29 = (i27 ^ 1) | i28;
                ((AbstractList) this).modCount = (i28 ^ i29) + ((i29 & i28) << 1);
                int i30 = a;
                int i31 = (i30 ^ 107) + ((i30 & 107) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                int i33 = i30 & 101;
                int i34 = ((i30 ^ 101) | i33) << 1;
                int i35 = -((i30 | 101) & (~i33));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                int i37 = i36 % 2;
                return true;
            }
            int i38 = (-2) - (((i11 & 52) + (i11 | 52)) ^ (-1));
            i11 = ((i38 & (-49)) + (i38 | (-49))) - 1;
            int i39 = b + 65;
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = a;
        int i42 = i41 & 61;
        int i43 = i42 + ((i41 ^ 61) | i42);
        b = i43 % 128;
        int i44 = i43 % 2;
        return false;
    }

    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 65) | (i3 & 65)) << 1) - (((~i3) & 65) | (i3 & (-66)));
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        e(i);
        int i6 = a;
        int i7 = i6 + 22;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            boolean[] zArr = this.d;
            boolean z = zArr[i];
            zArr[i] = zBooleanValue;
            throw null;
        }
        boolean[] zArr2 = this.d;
        boolean z2 = zArr2[i];
        zArr2[i] = zBooleanValue;
        int i9 = i6 + 49;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        int i10 = 33 / 0;
        return Boolean.valueOf(z2);
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.e;
        if (i6 == 0) {
            int i8 = 53 / 0;
        }
        int i9 = i2 | 115;
        int i10 = i9 << 1;
        int i11 = -((~(i2 & 115)) & i9);
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        return i7;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 109;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = ((i5 ^ 72) + ((i5 & 72) << 1)) - 1;
            a = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!(obj instanceof i)) {
            int i8 = i3 & 49;
            int i9 = (i8 - (~((i3 ^ 49) | i8))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return super.equals(obj);
            }
            super.equals(obj);
            throw null;
        }
        i iVar = (i) obj;
        if (this.e != iVar.e) {
            int i10 = i5 & 119;
            int i11 = (~i10) & (i5 | 119);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i5 & 99;
            int i16 = (i5 ^ 99) | i15;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                return false;
            }
            throw null;
        }
        boolean[] zArr = iVar.d;
        int i18 = (i5 & 91) + (i5 | 91);
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (true) {
            if (i20 >= this.e) {
                int i21 = a + 27;
                b = i21 % 128;
                int i22 = i21 % 2;
                return true;
            }
            i = a;
            int i23 = (((i ^ 87) | (i & 87)) << 1) - ((i & (-88)) | ((~i) & 87));
            int i24 = i23 % 128;
            b = i24;
            if (i23 % 2 != 0) {
                int i25 = 9 / 0;
                if (this.d[i20] != zArr[i20]) {
                    break;
                }
                i20++;
                int i26 = i24 + 15;
                a = i26 % 128;
                int i27 = i26 % 2;
            } else {
                if (this.d[i20] != zArr[i20]) {
                    break;
                }
                i20++;
                int i28 = i24 + 15;
                a = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        int i30 = (i & (-42)) | ((~i) & 41);
        int i31 = -(-((i & 41) << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        b = i32 % 128;
        if (i32 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public i(boolean[] zArr, int i) {
        this.d = zArr;
        this.e = i;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 125;
        int i7 = i5 | 125;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            d();
            throw null;
        }
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i9 = a;
        int i10 = i9 + 13;
        b = i10 % 128;
        int i11 = i10 % 2;
        boolean[] zArr = this.d;
        int i12 = this.e;
        int i13 = (i9 & 38) + (i9 | 38);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = -i2;
        System.arraycopy(zArr, i2, zArr, i, (i12 ^ i16) + ((i16 & i12) << 1));
        int i17 = this.e;
        int i18 = a;
        int i19 = i18 & 43;
        int i20 = (i19 - (~((i18 ^ 43) | i19))) - 1;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            this.e = i17 >> (i2 >>> i);
            i3 = ((AbstractList) this).modCount;
        } else {
            int i21 = -i;
            int i22 = -((i2 & i21) + (i21 | i2));
            this.e = (((i17 ^ i22) | (i17 & i22)) << 1) - ((i22 & (~i17)) | ((~i22) & i17));
            int i23 = ((AbstractList) this).modCount;
            int i24 = ((i23 ^ 1) | (i23 & 1)) << 1;
            int i25 = -(((~i23) & 1) | (i23 & (-2)));
            i3 = (i25 | i24) + (i24 & i25);
        }
        ((AbstractList) this).modCount = i3;
        int i26 = a;
        int i27 = i26 | 113;
        int i28 = i27 << 1;
        int i29 = -((~(i26 & 113)) & i27);
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
    }

    public final void f(boolean z) {
        int i;
        boolean[] zArr;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 83;
        int i5 = i4 + ((i3 ^ 83) | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            d();
            i = this.e;
            zArr = this.d;
            int i6 = 74 / 0;
        } else {
            d();
            i = this.e;
            zArr = this.d;
        }
        int i7 = b;
        int i8 = i7 + 31;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int length = zArr.length;
            throw null;
        }
        if (i == zArr.length) {
            int i9 = ((i7 | 23) << 1) - (i7 ^ 23);
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean[] zArr2 = new boolean[ivas.gov.bisp.enumeration.p091n.j.C(i, 3, 2, 1)];
            int i11 = b;
            int i12 = (i11 ^ 41) + ((i11 & 41) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                System.arraycopy(zArr, 0, zArr2, 1, i);
            } else {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            }
            this.d = zArr2;
            int i13 = a;
            int i14 = (i13 & 27) + (i13 | 27);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        boolean[] zArr3 = this.d;
        int i16 = this.e;
        int i17 = a;
        int i18 = (i17 & 125) + (i17 | 125);
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i16 & 1;
        int i21 = ((i16 ^ 1) | i20) << 1;
        int i22 = -((~i20) & (i16 | 1));
        this.e = (i21 ^ i22) + ((i21 & i22) << 1);
        int i23 = i17 & 31;
        int i24 = i23 + ((i17 ^ 31) | i23);
        b = i24 % 128;
        int i25 = i24 % 2;
        zArr3[i16] = z;
        int i26 = (i17 & 5) + (i17 | 5);
        b = i26 % 128;
        int i27 = i26 % 2;
    }

    public final Object remove(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 42) + ((i3 & 42) << 1)) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            d();
            e(i);
            throw null;
        }
        d();
        e(i);
        boolean[] zArr = this.d;
        int i5 = a;
        int i6 = i5 & 33;
        int i7 = ((~i6) & (i5 | 33)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        boolean z = zArr[i];
        int i9 = this.e;
        int i10 = ((i5 | 1) << 1) - (i5 ^ 1);
        b = i10 % 128;
        if (i10 % 2 == 0 ? i < i9 - 1 : i < i9) {
            int i11 = i & 1;
            int i12 = (i ^ 1) | i11;
            int i13 = (i11 & i12) + (i11 | i12);
            int i14 = (i9 - (~(-(~(-i))))) - 2;
            int i15 = i5 + 49;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                System.arraycopy(zArr, i13, zArr, i, (i14 & 1) + (i14 | 1));
            } else {
                int i16 = -(i14 ^ (-1));
                System.arraycopy(zArr, i13, zArr, i, ((-2) ^ i16) + ((i16 & (-2)) << 1));
            }
        }
        int i17 = this.e;
        int i18 = ((i17 ^ (-1)) | i17) << 1;
        int i19 = -(~i17);
        this.e = (i18 & i19) + (i19 | i18);
        int i20 = ((AbstractList) this).modCount;
        int i21 = a;
        int i22 = i21 & 93;
        int i23 = ((i21 ^ 93) | i22) << 1;
        int i24 = -((i21 | 93) & (~i22));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = ~i20;
            int i27 = i20 << 1;
            ((AbstractList) this).modCount = (i26 & i27) + (i27 | i26);
        } else {
            ((AbstractList) this).modCount = i20 + 1;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        int i28 = b;
        int i29 = i28 & 5;
        int i30 = -(-(i28 | 5));
        int i31 = (i29 & i30) + (i30 | i29);
        a = i31 % 128;
        if (i31 % 2 != 0) {
            return boolValueOf;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[PHI: r1
  0x0059: PHI (r1v18 boolean[]) = (r1v17 boolean[]), (r1v45 boolean[]) binds: [B:12:0x0057, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x007b A[PHI: r1
  0x007b: PHI (r1v37 boolean[]) = (r1v17 boolean[]), (r1v45 boolean[]) binds: [B:12:0x0057, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ae  */
    public final void add(int i, Object obj) {
        boolean[] zArr;
        int i2;
        boolean[] zArr2;
        boolean[] zArr3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (((i6 | 53) << 1) - (~(-(((~i6) & 53) | (i6 & (-54)))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i >= 0) {
            int i9 = b;
            int i10 = ((i9 ^ 19) | (i9 & 19)) << 1;
            int i11 = -(((~i9) & 19) | (i9 & (-20)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            int i15 = this.e;
            if (i <= i15) {
                int i16 = i13 + 77;
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    zArr = this.d;
                    int i17 = 69 / 0;
                    if (i15 < zArr.length) {
                        int i18 = i & 1;
                        int i19 = -i;
                        System.arraycopy(zArr, i, zArr, (i18 - (~((i ^ 1) | i18))) - 1, (((~i19) & i15) | ((~i15) & i19)) + ((i15 & i19) << 1));
                        int i20 = b;
                        int i21 = (i20 ^ 77) + ((i20 & 77) << 1);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                    } else {
                        zArr2 = new boolean[ivas.gov.bisp.enumeration.p091n.j.C(i15, 3, 2, 1)];
                        int i23 = a + 53;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        System.arraycopy(zArr, 0, zArr2, 0, i);
                        zArr3 = this.d;
                        int i25 = i & 1;
                        i3 = ((~i25) & (i | 1)) + (i25 << 1);
                        int i26 = b;
                        i4 = ((i26 | 25) << 1) - (i26 ^ 25);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            System.arraycopy(zArr3, i, zArr2, i3, this.e * i);
                        } else {
                            int i27 = this.e;
                            int i28 = -(~(-i));
                            System.arraycopy(zArr3, i, zArr2, i3, (((i27 | i28) << 1) - (i27 ^ i28)) - 1);
                        }
                        this.d = zArr2;
                        int i29 = b;
                        int i30 = i29 ^ 41;
                        int i31 = ((i29 & 41) | i30) << 1;
                        int i32 = -i30;
                        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else {
                    zArr = this.d;
                    if (i15 < zArr.length) {
                        int i110 = i & 1;
                        int i111 = -i;
                        System.arraycopy(zArr, i, zArr, (i110 - (~((i ^ 1) | i110))) - 1, (((~i111) & i15) | ((~i15) & i111)) + ((i15 & i111) << 1));
                        int i210 = b;
                        int i211 = (i210 ^ 77) + ((i210 & 77) << 1);
                        a = i211 % 128;
                        int i212 = i211 % 2;
                    } else {
                        zArr2 = new boolean[ivas.gov.bisp.enumeration.p091n.j.C(i15, 3, 2, 1)];
                        int i213 = a + 53;
                        b = i213 % 128;
                        int i214 = i213 % 2;
                        System.arraycopy(zArr, 0, zArr2, 0, i);
                        zArr3 = this.d;
                        int i215 = i & 1;
                        i3 = ((~i215) & (i | 1)) + (i215 << 1);
                        int i216 = b;
                        i4 = ((i216 | 25) << 1) - (i216 ^ 25);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            System.arraycopy(zArr3, i, zArr2, i3, this.e * i);
                        } else {
                            int i217 = this.e;
                            int i218 = -(~(-i));
                            System.arraycopy(zArr3, i, zArr2, i3, (((i217 | i218) << 1) - (i217 ^ i218)) - 1);
                        }
                        this.d = zArr2;
                        int i219 = b;
                        int i35 = i219 ^ 41;
                        int i36 = ((i219 & 41) | i35) << 1;
                        int i37 = -i35;
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                    }
                }
                this.d[i] = zBooleanValue;
                int i40 = this.e;
                int i41 = b + 116;
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                a = i42 % 128;
                if (i42 % 2 == 0) {
                    this.e = i40 / 0;
                    i2 = ((AbstractList) this).modCount;
                } else {
                    int i43 = ((i40 ^ 1) | (i40 & 1)) << 1;
                    int i44 = -(((~i40) & 1) | (i40 & (-2)));
                    this.e = (i43 & i44) + (i44 | i43);
                    i2 = ((AbstractList) this).modCount + 1;
                }
                ((AbstractList) this).modCount = i2;
                int i45 = b;
                int i46 = ((i45 ^ 111) | (i45 & 111)) << 1;
                int i47 = -(((~i45) & 111) | (i45 & (-112)));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                a = i48 % 128;
                if (i48 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (((i2 | 65) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        d();
        Charset charset = R.c;
        Objects.requireNonNull(collection);
        int i6 = a;
        int i7 = ((i6 ^ 99) | (i6 & 99)) << 1;
        int i8 = -((i6 & (-100)) | ((~i6) & 99));
        int i9 = (i7 & i8) + (i7 | i8);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        if (!(collection instanceof i)) {
            int i12 = ((i10 | 51) << 1) - (i10 ^ 51);
            a = i12 % 128;
            int i13 = i12 % 2;
            boolean zAddAll = super.addAll(collection);
            int i14 = a + 39;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 62 / 0;
            }
            return zAddAll;
        }
        i iVar = (i) collection;
        int i16 = iVar.e;
        if (i16 == 0) {
            int i17 = (i10 & 45) + (i10 | 45);
            a = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        int i19 = this.e;
        if (Integer.MAX_VALUE - i19 < i16) {
            throw new OutOfMemoryError();
        }
        int i20 = ((i6 ^ 48) + ((i6 & 48) << 1)) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i19 + i16;
        boolean[] zArr = this.d;
        Object obj = null;
        if (i22 > zArr.length) {
            int i23 = i6 + 67;
            b = i23 % 128;
            if (i23 % 2 != 0) {
                this.d = Arrays.copyOf(zArr, i22);
                throw null;
            }
            this.d = Arrays.copyOf(zArr, i22);
            int i24 = b + 117;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        boolean[] zArr2 = iVar.d;
        boolean[] zArr3 = this.d;
        int i26 = this.e;
        int i27 = b;
        int i28 = i27 & 89;
        int i29 = ((i27 | 89) & (~i28)) + (i28 << 1);
        a = i29 % 128;
        if (i29 % 2 == 0) {
            System.arraycopy(zArr2, 0, zArr3, i26, iVar.e);
            this.e = i22;
            obj.hashCode();
            throw null;
        }
        System.arraycopy(zArr2, 0, zArr3, i26, iVar.e);
        this.e = i22;
        int i30 = ((AbstractList) this).modCount;
        ((AbstractList) this).modCount = (-2) - (((i30 ^ 2) + ((i30 & 2) << 1)) ^ (-1));
        int i31 = b + 55;
        a = i31 % 128;
        int i32 = i31 % 2;
        return true;
    }

    public final boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (i3 - (~(-(-((i2 ^ 63) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        f(((Boolean) obj).booleanValue());
        int i6 = a;
        int i7 = (((i6 | 64) << 1) - (i6 ^ 64)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
