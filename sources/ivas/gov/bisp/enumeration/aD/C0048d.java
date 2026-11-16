package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.OooO0OO;
import ivas.gov.bisp.enumeration.o000O000.o000O0O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0048d<E> extends OooO0OO<E> implements RandomAccess {
    private static int a = 1;
    private static int b;
    public static final o000O0O0<Object> d;
    public E[] e;
    public int f;

    static {
        C0048d c0048d = new C0048d(new Object[0], 0);
        d = c0048d;
        int i = a + 103;
        b = i % 128;
        int i2 = i % 2;
        c0048d.c = false;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 76) + ((i3 & 76) << 1)) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0048d(E[] eArr, int i) {
        this.e = eArr;
        this.f = i;
    }

    public final String e(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        int i3 = b;
        int i4 = (i3 & 95) + (i3 | 95);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            sb.append(i);
            sb.append(", Size:");
            throw null;
        }
        sb.append(i);
        sb.append(", Size:");
        int i5 = this.f;
        int i6 = a;
        int i7 = (i6 & (-6)) | ((~i6) & 5);
        int i8 = (i6 & 5) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        sb.append(i5);
        String string = sb.toString();
        int i11 = a;
        int i12 = (i11 ^ 21) + ((i11 & 21) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    public final void f(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 1) | (i3 & 1)) << 1) - ((1 & (~i3)) | (i3 & (-2)));
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i >= 0) {
            int i5 = i3 + 37;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i < this.f) {
                int i6 = i3 + 97;
                a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    public final E get(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = (i3 ^ 47) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            f(i);
            return this.e[i];
        }
        f(i);
        int i7 = 11 / 0;
        return this.e[i];
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = (~i3) & (i2 | 115);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.f;
        int i9 = i2 & 93;
        int i10 = i9 + ((i2 ^ 93) | i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public final R.biN g(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 91) + (i3 | 91);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i < this.f) {
            throw new IllegalArgumentException();
        }
        C0048d c0048d = new C0048d(Arrays.copyOf(this.e, i), this.f);
        int i5 = a;
        int i6 = i5 ^ 63;
        int i7 = ((i5 & 63) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return c0048d;
        }
        obj.hashCode();
        throw null;
    }

    public final E set(int i, E e) {
        E[] eArr;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 79) + (i3 | 79);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            d();
            f(i);
            eArr = this.e;
            int i5 = 65 / 0;
        } else {
            d();
            f(i);
            eArr = this.e;
        }
        int i6 = a + 69;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            E e2 = eArr[i];
            eArr[i] = e;
            int i7 = ((AbstractList) this).modCount;
            obj.hashCode();
            throw null;
        }
        E e3 = eArr[i];
        eArr[i] = e;
        int i8 = ((AbstractList) this).modCount;
        int i9 = b;
        int i10 = i9 & 25;
        int i11 = (i9 ^ 25) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        ((AbstractList) this).modCount = ((i8 & 1) - (~(i8 | 1))) - 1;
        int i14 = b;
        int i15 = i14 & 37;
        int i16 = ((i14 | 37) & (~i15)) + (i15 << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return e3;
        }
        throw null;
    }

    public final boolean add(E e) {
        int i = 2 % 2;
        int i2 = b + 1;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            d();
            obj.hashCode();
            throw null;
        }
        d();
        int i3 = this.f;
        E[] eArr = this.e;
        if (i3 == eArr.length) {
            int i4 = b;
            int i5 = (((i4 ^ 69) | (i4 & 69)) << 1) - (((~i4) & 69) | (i4 & (-70)));
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (i3 * 3) / 2;
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, (i7 & 1) + (i7 | 1));
            int i8 = b;
            int i9 = i8 & 115;
            int i10 = (i8 | 115) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            this.e = eArr2;
            if (i13 == 0) {
                throw null;
            }
        }
        E[] eArr3 = this.e;
        int i14 = this.f;
        this.f = ((i14 & 1) - (~(i14 | 1))) - 1;
        int i15 = (-2) - ((a + 32) ^ (-1));
        b = i15 % 128;
        if (i15 % 2 != 0) {
            eArr3[i14] = e;
            ((AbstractList) this).modCount <<= 1;
            return false;
        }
        eArr3[i14] = e;
        int i16 = ((AbstractList) this).modCount;
        int i17 = (i16 | 1) << 1;
        int i18 = -(((~i16) & 1) | (i16 & (-2)));
        ((AbstractList) this).modCount = (i17 ^ i18) + ((i18 & i17) << 1);
        return true;
    }

    public final E remove(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        d();
        f(i);
        E[] eArr = this.e;
        int i6 = b;
        int i7 = (i6 & (-114)) | ((~i6) & 113);
        int i8 = (i6 & 113) << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        E e = eArr[i];
        int i11 = this.f;
        int i12 = i6 & 97;
        int i13 = ((~i12) & (i6 | 97)) + (i12 << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11 ^ (-1);
        int i16 = -(-(i11 << 1));
        if (i < (i15 & i16) + (i15 | i16)) {
            int i17 = i6 + 77;
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i11 - (~(-i));
            int i20 = i6 & 47;
            int i21 = ((((i6 ^ 47) | i20) << 1) - (~(-((i6 | 47) & (~i20))))) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            System.arraycopy(eArr, i + 1, eArr, i, i19 - 2);
            int i23 = a;
            int i24 = ((i23 | 87) << 1) - (i23 ^ 87);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = this.f;
        this.f = (~i26) + (i26 << 1);
        int i27 = a;
        int i28 = (i27 & 105) + (i27 | 105);
        b = i28 % 128;
        int i29 = i28 % 2;
        int i30 = ((AbstractList) this).modCount;
        ((AbstractList) this).modCount = (((i30 | 2) << 1) - (i30 ^ 2)) - 1;
        int i31 = a;
        int i32 = i31 & 29;
        int i33 = i32 + ((i31 ^ 29) | i32);
        b = i33 % 128;
        if (i33 % 2 == 0) {
            return e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void add(int i, E e) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-68)) | ((~i3) & 67)) + ((i3 & 67) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        d();
        if (i >= 0) {
            int i6 = b;
            int i7 = i6 & 51;
            int i8 = (i7 - (~(-(-((i6 ^ 51) | i7))))) - 1;
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = this.f;
            if (i <= i11) {
                int i12 = i9 ^ 1;
                int i13 = -(-((i9 & 1) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                E[] eArr = this.e;
                if (i11 < eArr.length) {
                    int i17 = (i15 ^ 13) + ((i15 & 13) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = i & 1;
                    int i20 = -i;
                    int i21 = i11 & i20;
                    System.arraycopy(eArr, i, eArr, (i19 - (~((i ^ 1) | i19))) - 1, ((i11 | i20) & (~i21)) + (i21 << 1));
                    int i22 = b;
                    int i23 = ((i22 ^ 89) | (i22 & 89)) << 1;
                    int i24 = -(((~i22) & 89) | (i22 & (-90)));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    E[] eArr2 = (E[]) new Object[ivas.gov.bisp.enumeration.p091n.j.C(i11, 3, 2, 1)];
                    int i27 = b;
                    int i28 = (-2) - ((((i27 | 122) << 1) - (i27 ^ 122)) ^ (-1));
                    a = i28 % 128;
                    if (i28 % 2 == 0) {
                        System.arraycopy(eArr, 0, eArr2, 1, i);
                    } else {
                        System.arraycopy(eArr, 0, eArr2, 0, i);
                    }
                    E[] eArr3 = this.e;
                    int i29 = a;
                    int i30 = (i29 ^ 91) + ((i29 & 91) << 1);
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        System.arraycopy(eArr3, i, eArr2, i % 1, this.f >>> i);
                    } else {
                        int i31 = this.f;
                        int i32 = -i;
                        System.arraycopy(eArr3, i, eArr2, (i ^ 1) + ((i & 1) << 1), ((i31 & i32) - (~(-(-(i31 | i32))))) - 1);
                    }
                    this.e = eArr2;
                    int i33 = b;
                    int i34 = i33 & 99;
                    int i35 = (i33 | 99) & (~i34);
                    int i36 = i34 << 1;
                    int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                }
                this.e[i] = e;
                int i39 = this.f;
                int i40 = b;
                int i41 = (i40 & 117) + (i40 | 117);
                a = i41 % 128;
                int i42 = i41 % 2;
                this.f = ((i39 | 1) << 1) - (i39 ^ 1);
                int i43 = ((AbstractList) this).modCount;
                int i44 = a;
                int i45 = ((i44 ^ 40) + ((i44 & 40) << 1)) - 1;
                b = i45 % 128;
                if (i45 % 2 != 0) {
                    ((AbstractList) this).modCount = i43 >>> 1;
                    return;
                }
                int i46 = i43 & 1;
                int i47 = (i43 | 1) & (~i46);
                int i48 = -(-(i46 << 1));
                ((AbstractList) this).modCount = (i47 ^ i48) + ((i47 & i48) << 1);
                return;
            }
        }
        throw new IndexOutOfBoundsException(e(i));
    }
}
