package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOO;
import ivas.gov.bisp.enumeration.p006af.h;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i<E> implements Collection<E>, Set<E> {
    private static int a = 1;
    private static int b;
    public static int c;
    public static final int[] d = new int[0];
    public static final Object[] e = new Object[0];
    public static Object[] f;
    public static Object[] g;
    public static int h;
    public int[] i = d;
    public Object[] j = e;
    public int k = 0;
    public OooOOO<E, E> l;

    static {
        int i = (1 & (-126)) | ((~1) & 125);
        int i2 = -(-((1 & 125) << 1));
        int i3 = (i & i2) + (i2 | i);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    int i2 = ((i | 67) << 1) - (i ^ 67);
                    int i3 = ((i2 | (-68)) << 1) - (i2 ^ (-68));
                    while (i3 >= 2) {
                        objArr[i3] = null;
                        int i4 = ~i3;
                        int i5 = -(-(i3 << 1));
                        i3 = ((i4 | i5) << 1) - (i4 ^ i5);
                    }
                    g = objArr;
                    int i6 = h;
                    h = ((i6 | 1) << 1) - (i6 ^ 1);
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (c < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    int i7 = (i - (~((~i) | i))) - 1;
                    while (i7 >= 2) {
                        objArr[i7] = null;
                        int i8 = ~i7;
                        int i9 = -(-(i7 << 1));
                        i7 = (i8 ^ i9) + ((i8 & i9) << 1);
                    }
                    f = objArr;
                    c++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i3 - (~((i2 ^ 51) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean z = false;
        int iIndexOf = indexOf(obj);
        if (i5 != 0) {
            int i6 = 66 / 0;
            if (iIndexOf >= 0) {
                int i7 = b;
                int i8 = i7 & 39;
                int i9 = (i7 ^ 39) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                int i12 = a;
                int i13 = (-2) - ((((i12 | 20) << 1) - (i12 ^ 20)) ^ (-1));
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (iIndexOf >= 0) {
            int i15 = b;
            int i16 = i15 & 39;
            int i17 = (i15 ^ 39) | i16;
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            int i110 = a;
            int i111 = (-2) - ((((i110 | 20) << 1) - (i110 ^ 20)) ^ (-1));
            b = i111 % 128;
            int i112 = i111 % 2;
        }
        int i20 = b;
        int i21 = i20 & 97;
        int i22 = (i20 | 97) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        a = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    public final void d(int i) {
        if (i == 8) {
            synchronized (i.class) {
                Object[] objArr = g;
                if (objArr != null) {
                    this.j = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h = (-2) - (h ^ (-1));
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f;
                if (objArr2 != null) {
                    this.j = objArr2;
                    f = (Object[]) objArr2[0];
                    this.i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    int i2 = c;
                    c = i2 + ((i2 ^ (-1)) | i2);
                    return;
                }
            }
        }
        this.i = new int[i];
        this.j = new Object[i];
    }

    public final int indexOf(Object obj) {
        int iE;
        int i = 2 % 2;
        int i2 = b + 28;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj == null) {
            iE = f();
            int i4 = a;
            int i5 = ((i4 | 43) << 1) - (i4 ^ 43);
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iE = e(obj, obj.hashCode());
            int i7 = a;
            int i8 = i7 & 27;
            int i9 = i8 + ((i7 ^ 27) | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a + 77;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return iE;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.k <= 0) {
            int i5 = (i2 ^ 5) + ((i2 & 5) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = (((i4 | 52) << 1) - (i4 ^ 52)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        int i9 = a;
        int i10 = ((i9 ^ 43) | (i9 & 43)) << 1;
        int i11 = -(((~i9) & 43) | (i9 & (-44)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = -(-((i2 ^ 113) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
            if (this.l == null) {
                this.l = new e(this);
                int i7 = b;
                int i8 = i7 & 65;
                int i9 = (i7 ^ 65) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        } else if (this.l == null) {
            this.l = new e(this);
            int i12 = b;
            int i13 = i12 & 65;
            int i14 = (i12 ^ 65) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        OooOOO<E, E> oooOOO = this.l;
        if (oooOOO.d == null) {
            oooOOO.d = new P.aTx();
            int i17 = a + 97;
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        Iterator<E> it = oooOOO.d.iterator();
        int i19 = b + 29;
        a = i19 % 128;
        int i20 = i19 % 2;
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 & (-60)) | ((~i3) & 59)) - (~(-(-((i3 & 59) << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Iterator<?> it = collection.iterator();
        int i6 = a;
        int i7 = (i6 & 71) + (i6 | 71);
        b = i7 % 128;
        int i8 = i7 % 2;
        boolean z = 0;
        while (!(!it.hasNext())) {
            int i9 = b;
            int i10 = (i9 ^ 69) + ((i9 & 69) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            boolean zRemove = remove(it.next());
            int i12 = a;
            int i13 = ((i12 & 126) + (i12 | 126)) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                i = (z | (zRemove ? 1 : 0)) & (~(z & (zRemove ? 1 : 0)));
            } else {
                int i14 = z & (zRemove ? 1 : 0);
                int i15 = (z | (zRemove ? 1 : 0)) & (~i14);
                i = (i15 & i14) | (i15 ^ i14);
            }
            int i16 = i12 ^ 57;
            int i17 = ((i12 & 57) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            z = i;
        }
        int i21 = a;
        int i22 = i21 & 29;
        int i23 = (i21 | 29) & (~i22);
        int i24 = -(-(i22 << 1));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z;
        int i = 2 % 2;
        int i2 = a + 3;
        int i3 = i2 % 128;
        b = i3;
        int i4 = 0;
        if (i2 % 2 != 0) {
            z = true;
        } else {
            int i5 = this.k;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            z = false;
            i4 = i6;
        }
        int i7 = i3 & 87;
        int i8 = -(-((i3 ^ 87) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        while (i4 >= 0) {
            int i11 = b;
            int i12 = ((i11 ^ 82) + ((i11 & 82) << 1)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            if (!collection.contains(this.j[i4])) {
                int i14 = b;
                int i15 = i14 & 99;
                int i16 = i15 + ((i14 ^ 99) | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                g(i4);
                int i18 = b;
                int i19 = i18 & 21;
                int i20 = (i19 - (~((i18 ^ 21) | i19))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            }
            int i22 = (i4 & (-49)) + (i4 | (-49));
            i4 = (i22 ^ 48) + ((i22 & 48) << 1);
            int i23 = a;
            int i24 = (i23 & (-122)) | ((~i23) & 121);
            int i25 = -(-((i23 & 121) << 1));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = b;
        int i29 = i28 & 95;
        int i30 = (((i28 ^ 95) | i29) << 1) - ((i28 | 95) & (~i29));
        a = i30 % 128;
        if (i30 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i4 = -(((~i2) & 87) | (i2 & (-88)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this.k;
        }
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 75) | (i2 & 75)) << 1;
        int i4 = -((i2 & (-76)) | ((~i2) & 75));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.k;
        Object[] objArr = new Object[i7];
        int i8 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i9 = -(((~i2) & 49) | (i2 & (-50)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            System.arraycopy(this.j, 1, objArr, 1, i7);
        } else {
            System.arraycopy(this.j, 0, objArr, 0, i7);
        }
        int i11 = a;
        int i12 = ((i11 ^ 103) - (~((i11 & 103) << 1))) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return objArr;
        }
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-52)) | ((~i2) & 51)) + ((i2 & 51) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            it = collection.iterator();
            int i4 = 9 / 0;
        } else {
            it = collection.iterator();
        }
        while (it.hasNext()) {
            int i5 = a;
            int i6 = ((i5 | 36) << 1) - (i5 ^ 36);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            if (!contains(it.next())) {
                int i9 = a;
                int i10 = i9 & 23;
                int i11 = i9 | 23;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                int i15 = ((i13 | 3) << 1) - (i13 ^ 3);
                a = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
        }
        int i17 = b;
        int i18 = (((i17 | 126) << 1) - (i17 ^ 126)) - 1;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 48 / 0;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = (i2 ^ 117) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            int i7 = a;
            int i8 = ((i7 & (-90)) | ((~i7) & 89)) + ((i7 & 89) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i9 = a;
        int i10 = ((i9 ^ 57) | (i9 & 57)) << 1;
        int i11 = -(((~i9) & 57) | (i9 & (-58)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        g(iIndexOf);
        int i14 = a;
        int i15 = i14 & 87;
        int i16 = ((i14 | 87) & (~i15)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int[] iArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i3 - (~(-(-((i2 ^ 97) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.k;
        if (i7 != 0) {
            int i8 = i5 ^ 109;
            int i9 = -(-((i5 & 109) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                c(this.i, this.j, i7);
                iArr = d;
                int i11 = 67 / 0;
            } else {
                c(this.i, this.j, i7);
                iArr = d;
            }
            int i12 = b;
            int i13 = i12 & 89;
            int i14 = i13 + ((i12 ^ 89) | i13);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                this.i = iArr;
                this.j = e;
                this.k = 1;
            } else {
                this.i = iArr;
                this.j = e;
                this.k = 0;
            }
        }
        int i15 = b;
        int i16 = i15 & 53;
        int i17 = -(-((i15 ^ 53) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int[] iArr = this.i;
        int i7 = this.k;
        int i8 = i5 + 49;
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i7) {
            int i12 = b;
            int i13 = i12 & 79;
            int i14 = i12 | 79;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                i11 >>= iArr[i10];
                int i16 = (-2) - (((i10 ^ 51) + ((i10 & 51) << 1)) ^ (-1));
                int i17 = ((i16 ^ (-11)) | (i16 & (-11))) << 1;
                int i18 = -(((~i16) & (-11)) | (i16 & 10));
                i10 = (i17 ^ i18) + ((i18 & i17) << 1);
            } else {
                int i19 = iArr[i10];
                i10++;
                i11 = ((i11 | i19) << 1) - (i11 ^ i19);
            }
        }
        int i20 = b;
        int i21 = (i20 & 65) + (i20 | 65);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return i11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i;
        int i2 = 2 % 2;
        int i3 = a + 47;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (isEmpty()) {
            int i5 = b;
            int i6 = i5 & 119;
            int i7 = (i6 - (~((i5 ^ 119) | i6))) - 1;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (i8 & 117) + (i8 | 117);
            b = i10 % 128;
            int i11 = i10 % 2;
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.k * 14);
        int i12 = a + 113;
        b = i12 % 128;
        int i13 = i12 % 2;
        sb.append('{');
        int i14 = b;
        int i15 = (i14 ^ 75) + ((i14 & 75) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 2 / 5;
        }
        int i17 = 0;
        while (i17 < this.k) {
            int i18 = a;
            int i19 = (i18 ^ 43) + ((i18 & 43) << 1);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            if (i17 > 0) {
                sb.append(", ");
                int i20 = a + 73;
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 2 % 4;
                }
            }
            Object obj = this.j[i17];
            if (obj != this) {
                int i22 = b;
                int i23 = i22 & 117;
                int i24 = (i22 ^ 117) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    sb.append(obj);
                    throw null;
                }
                sb.append(obj);
                i = a + 85;
                b = i % 128;
            } else {
                sb.append("(this Set)");
                int i26 = a;
                i = (-2) - (((i26 & 114) + (i26 | 114)) ^ (-1));
                b = i % 128;
            }
            int i27 = i % 2;
            i17 = ((i17 & 1) << 1) + (i17 ^ 1);
            int i28 = b;
            int i29 = i28 & 1;
            int i30 = (i28 ^ 1) | i29;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            int i32 = i31 % 2;
        }
        sb.append('}');
        String string = sb.toString();
        int i33 = a;
        int i34 = i33 & 87;
        int i35 = (i33 ^ 87) | i34;
        int i36 = (i34 & i35) + (i35 | i34);
        b = i36 % 128;
        if (i36 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 34) + ((i2 & 34) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int length = tArr.length;
            obj.hashCode();
            throw null;
        }
        if (tArr.length < this.k) {
            Class<?> componentType = tArr.getClass().getComponentType();
            int i4 = this.k;
            int i5 = b;
            int i6 = i5 & 125;
            int i7 = ((i5 ^ 125) | i6) << 1;
            int i8 = -((i5 | 125) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            tArr = (T[]) ((Object[]) Array.newInstance(componentType, i4));
        }
        Object[] objArr = this.j;
        int i10 = this.k;
        int i11 = b;
        int i12 = i11 & 59;
        int i13 = (i11 ^ 59) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        System.arraycopy(objArr, 0, tArr, 0, i10);
        int length2 = tArr.length;
        int i16 = this.k;
        int i17 = a;
        int i18 = i17 & 95;
        int i19 = -(-((i17 ^ 95) | i18));
        int i20 = (i18 & i19) + (i19 | i18);
        int i21 = i20 % 128;
        b = i21;
        int i22 = i20 % 2;
        if (length2 > i16) {
            int i23 = i21 + 53;
            a = i23 % 128;
            int i24 = i23 % 2;
            tArr[i16] = null;
            int i25 = i21 + 13;
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 3 % 2;
            }
        }
        int i27 = a;
        int i28 = (i27 ^ 61) + ((i27 & 61) << 1);
        b = i28 % 128;
        int i29 = i28 % 2;
        return tArr;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110 A[LOOP:0: B:26:0x00b4->B:46:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec A[SYNTHETIC] */
    public final int f() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 ^ 23;
        int i8 = ((i6 & 23) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = this.k;
        Object obj = null;
        if (i12 == 0) {
            int i13 = ((i6 & 47) - (~(-(-(i6 | 47))))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            int i14 = ((((i6 ^ 25) | (i6 & 25)) << 1) - (~(-(((~i6) & 25) | (i6 & (-26)))))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return -1;
            }
            obj.hashCode();
            throw null;
        }
        int iE = h.e(this.i, i12, 0);
        if (iE < 0) {
            int i15 = a;
            int i16 = i15 & 5;
            int i17 = (i15 ^ 5) | i16;
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 80 / 0;
            }
            return iE;
        }
        if (this.j[iE] == null) {
            int i20 = b;
            int i21 = (i20 ^ 65) + ((i20 & 65) << 1);
            int i22 = i21 % 128;
            a = i22;
            int i23 = i21 % 2;
            int i24 = i22 ^ 73;
            int i25 = ((((i22 & 73) | i24) << 1) - (~(-i24))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            return iE;
        }
        int i27 = iE & 1;
        int i28 = (i27 - (~(-(-((iE ^ 1) | i27))))) - 1;
        int i29 = b;
        int i30 = i29 & 109;
        int i31 = (i29 ^ 109) | i30;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        a = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 4 % 2;
        }
        while (i28 < i12) {
            int i34 = a;
            int i35 = (i34 ^ 107) + ((i34 & 107) << 1);
            b = i35 % 128;
            if (i35 % 2 != 0) {
                int i36 = 63 / 0;
                if (this.i[i28] != 0) {
                    break;
                }
                int i37 = i34 & 95;
                i = (i37 - (~((i34 ^ 95) | i37))) - 1;
                i2 = i % 128;
                b = i2;
                if (i % 2 == 0) {
                    Object obj2 = this.j[i28];
                    obj.hashCode();
                    throw null;
                }
                if (this.j[i28] == null) {
                    i3 = (i2 & 71) + (i2 | 71);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i38 = 34 / 0;
                    }
                    int i39 = i2 & 13;
                    int i40 = (i2 ^ 13) | i39;
                    i4 = (i39 & i40) + (i39 | i40);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return i28;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i41 = ((i28 ^ 1) | (i28 & 1)) << 1;
                int i42 = -(((~i28) & 1) | (i28 & (-2)));
                i28 = ((i41 | i42) << 1) - (i42 ^ i41);
                int i43 = i2 & 43;
                int i44 = (((i2 ^ 43) | i43) << 1) - ((i2 | 43) & (~i43));
                a = i44 % 128;
                int i45 = i44 % 2;
            } else {
                if (this.i[i28] != 0) {
                    break;
                }
                int i310 = i34 & 95;
                i = (i310 - (~((i34 ^ 95) | i310))) - 1;
                i2 = i % 128;
                b = i2;
                if (i % 2 == 0) {
                    Object obj3 = this.j[i28];
                    obj.hashCode();
                    throw null;
                }
                if (this.j[i28] == null) {
                    i3 = (i2 & 71) + (i2 | 71);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i311 = 34 / 0;
                    }
                    int i312 = i2 & 13;
                    int i46 = (i2 ^ 13) | i312;
                    i4 = (i312 & i46) + (i312 | i46);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return i28;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i47 = ((i28 ^ 1) | (i28 & 1)) << 1;
                int i48 = -(((~i28) & 1) | (i28 & (-2)));
                i28 = ((i47 | i48) << 1) - (i48 ^ i47);
                int i49 = i2 & 43;
                int i410 = (((i2 ^ 43) | i49) << 1) - ((i2 | 43) & (~i49));
                a = i410 % 128;
                int i411 = i410 % 2;
            }
        }
        int i50 = -(-((iE ^ (-1)) | iE));
        int i51 = (iE ^ i50) + ((iE & i50) << 1);
        int i52 = a + 87;
        b = i52 % 128;
        int i53 = i52 % 2;
        while (i51 >= 0) {
            int i54 = a;
            int i55 = i54 & 113;
            int i56 = i54 | 113;
            int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
            b = i57 % 128;
            int i58 = i57 % 2;
            if (this.i[i51] != 0) {
                break;
            }
            int i59 = (i54 & (-34)) | ((~i54) & 33);
            int i60 = (i54 & 33) << 1;
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            int i62 = i61 % 128;
            b = i62;
            int i63 = i61 % 2;
            if (this.j[i51] == null) {
                int i64 = i62 & 39;
                int i65 = i64 + ((i62 ^ 39) | i64);
                int i66 = i65 % 128;
                a = i66;
                int i67 = i65 % 2;
                int i68 = (i66 & (-108)) | ((~i66) & 107);
                int i69 = -(-((i66 & 107) << 1));
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                b = i70 % 128;
                if (i70 % 2 == 0) {
                    return i51;
                }
                obj.hashCode();
                throw null;
            }
            int i71 = ((i51 | (-28)) << 1) - (i51 ^ (-28));
            i51 = ((i71 | 27) << 1) - (i71 ^ 27);
            int i72 = i62 + 123;
            a = i72 % 128;
            int i73 = i72 % 2;
        }
        int i74 = ~i28;
        int i75 = a;
        int i76 = i75 & 95;
        int i77 = i76 + ((i75 ^ 95) | i76);
        b = i77 % 128;
        int i78 = i77 % 2;
        return i74;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x016f A[LOOP:1: B:41:0x0127->B:53:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x015a A[SYNTHETIC] */
    public final int e(Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 5;
        int i5 = -(-((i3 ^ 5) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        Object obj2 = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i8 = this.k;
        if (i8 == 0) {
            int i9 = (-2) - (((i7 ^ 116) + ((i7 & 116) << 1)) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            return -1;
        }
        int iE = h.e(this.i, i8, i);
        if (iE < 0) {
            int i11 = b;
            int i12 = i11 | 3;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 3)) & i12);
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 32 / 0;
            }
            return iE;
        }
        if (obj.equals(this.j[iE])) {
            int i17 = b;
            int i18 = i17 ^ 125;
            int i19 = ((i17 & 125) | i18) << 1;
            int i20 = -i18;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i17 & 3;
            int i24 = ((i17 | 3) & (~i23)) + (i23 << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            return iE;
        }
        int i26 = (iE & 1) + (iE | 1);
        int i27 = b;
        int i28 = ((i27 & 62) + (i27 | 62)) - 1;
        a = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 5 / 4;
        }
        while (i26 < i8) {
            int i30 = b;
            int i31 = ((i30 ^ 118) + ((i30 & 118) << 1)) - 1;
            a = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = this.i[i26];
                obj2.hashCode();
                throw null;
            }
            if (this.i[i26] != i) {
                break;
            }
            if (obj.equals(this.j[i26])) {
                int i33 = b;
                int i34 = (i33 & (-2)) | ((~i33) & 1);
                int i35 = (i33 & 1) << 1;
                int i36 = (i34 & i35) + (i34 | i35);
                a = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
                int i37 = i33 & 25;
                int i38 = -(-((i33 ^ 25) | i37));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 97 / 0;
                }
                return i26;
            }
            int i41 = ((i26 ^ 1) | (i26 & 1)) << 1;
            int i42 = -(((~i26) & 1) | (i26 & (-2)));
            i26 = (i41 & i42) + (i41 | i42);
            int i43 = b;
            int i44 = ((i43 ^ 86) + ((i43 & 86) << 1)) - 1;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 5 / 2;
            }
        }
        int i46 = (iE ^ (-1)) | iE;
        int i47 = (iE & i46) + (iE | i46);
        int i48 = a;
        int i49 = i48 & 33;
        int i50 = -(-((i48 ^ 33) | i49));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        b = i51 % 128;
        int i52 = i51 % 2;
        while (i47 >= 0) {
            int i53 = b;
            int i54 = (i53 & (-94)) | ((~i53) & 93);
            int i55 = (i53 & 93) << 1;
            int i56 = (i54 & i55) + (i55 | i54);
            a = i56 % 128;
            if (i56 % 2 == 0) {
                int i57 = 46 / 0;
                if (this.i[i47] != i) {
                    break;
                }
                if (obj.equals(this.j[i47])) {
                    int i58 = b;
                    int i59 = ((i58 | 83) << 1) - (i58 ^ 83);
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    int i61 = i58 + 71;
                    a = i61 % 128;
                    int i62 = i61 % 2;
                    return i47;
                }
                i47 = (-2) - (i47 ^ (-1));
                int i63 = b + 117;
                a = i63 % 128;
                int i64 = i63 % 2;
            } else {
                if (this.i[i47] != i) {
                    break;
                }
                if (obj.equals(this.j[i47])) {
                    int i510 = b;
                    int i511 = ((i510 | 83) << 1) - (i510 ^ 83);
                    a = i511 % 128;
                    int i65 = i511 % 2;
                    int i66 = i510 + 71;
                    a = i66 % 128;
                    int i67 = i66 % 2;
                    return i47;
                }
                i47 = (-2) - (i47 ^ (-1));
                int i68 = b + 117;
                a = i68 % 128;
                int i69 = i68 % 2;
            }
        }
        int i70 = ~i26;
        int i71 = a;
        int i72 = i71 & 21;
        int i73 = ((i71 ^ 21) | i72) << 1;
        int i74 = -((i71 | 21) & (~i72));
        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
        b = i75 % 128;
        int i76 = i75 % 2;
        return i70;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 21;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = (i2 & 115) + (i2 | 115);
            b = i5 % 128;
            return i5 % 2 == 0;
        }
        if (obj instanceof Set) {
            int i6 = i2 & 33;
            int i7 = i6 + ((i2 ^ 33) | i6);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                ((Set) obj).size();
                throw null;
            }
            Set set = (Set) obj;
            if (this.k != set.size()) {
                int i8 = b;
                int i9 = i8 & 25;
                int i10 = -(-((i8 ^ 25) | i9));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            int i13 = a;
            int i14 = i13 & 45;
            int i15 = (i13 | 45) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            while (i19 < this.k) {
                try {
                    int i20 = b;
                    int i21 = i20 & 91;
                    int i22 = ((((i20 ^ 91) | i21) << 1) - (~(-((i20 | 91) & (~i21))))) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    if (!set.contains(this.j[i19])) {
                        int i24 = a;
                        int i25 = i24 & 25;
                        int i26 = -(-(i24 | 25));
                        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                        b = i27 % 128;
                        int i28 = i27 % 2;
                        return false;
                    }
                    i19 = ((i19 & 1) << 1) + ((i19 & (-2)) | ((~i19) & 1));
                    int i29 = a;
                    int i30 = (((i29 & (-102)) | ((~i29) & 101)) - (~((i29 & 101) << 1))) - 1;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            int i32 = b;
            int i33 = ((i32 ^ 40) + ((i32 & 40) << 1)) - 1;
            a = i33 % 128;
            int i34 = i33 % 2;
            return true;
        }
        int i35 = b;
        int i36 = i35 ^ 117;
        int i37 = -(-((i35 & 117) << 1));
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        a = i38 % 128;
        if (i38 % 2 == 0) {
            int i39 = 14 / 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 27;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            size = collection.size() << this.k;
        } else {
            int i4 = this.k;
            int size2 = collection.size();
            int i5 = size2 & i4;
            size = ((i4 | size2) & (~i5)) + (i5 << 1);
        }
        int[] iArr = this.i;
        int i6 = a;
        int i7 = i6 | 17;
        int i8 = (i7 << 1) - (i7 & (~(i6 & 17)));
        b = i8 % 128;
        int i9 = i8 % 2;
        ?? r6 = 0;
        if (iArr.length < size) {
            int i10 = i6 + 100;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                d(size);
                throw null;
            }
            Object[] objArr = this.j;
            d(size);
            int i12 = this.k;
            if (i12 > 0) {
                int i13 = b;
                int i14 = (i13 ^ 113) + ((i13 & 113) << 1);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    System.arraycopy(iArr, 1, this.i, 1, i12);
                } else {
                    System.arraycopy(iArr, 0, this.i, 0, i12);
                }
                System.arraycopy(objArr, 0, this.j, 0, this.k);
                int i15 = b;
                int i16 = i15 & 107;
                int i17 = (i15 | 107) & (~i16);
                int i18 = -(-(i16 << 1));
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
            c(iArr, objArr, this.k);
            int i21 = b;
            int i22 = (-2) - (((i21 & 40) + (i21 | 40)) ^ (-1));
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        Iterator<? extends E> it = collection.iterator();
        int i24 = a;
        int i25 = i24 ^ 75;
        int i26 = (i24 & 75) << 1;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        b = i27 % 128;
        int i28 = i27 % 2;
        while (!(!it.hasNext())) {
            int i29 = b;
            int i30 = i29 & 101;
            int i31 = i30 + ((i29 ^ 101) | i30);
            a = i31 % 128;
            int i32 = i31 % 2;
            E next = it.next();
            int i33 = b;
            int i34 = ((i33 ^ 3) - (~((i33 & 3) << 1))) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
            boolean zAdd = add(next);
            if (i35 == 0) {
                i = (zAdd ? 1 : 0) & r6;
            } else {
                int i36 = (((~(zAdd ? 1 : 0)) & r6) == true ? 1 : 0) | (((~r6) & (zAdd ? 1 : 0)) == true ? 1 : 0);
                int i37 = (zAdd ? 1 : 0) & r6;
                i = (i37 & i36) | (i36 ^ i37);
            }
            r6 = i;
        }
        int i38 = a;
        int i39 = (i38 & 79) + (i38 | 79);
        b = i39 % 128;
        int i40 = i39 % 2;
        return r6;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        int iF;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 99;
        int i7 = (i5 ^ 99) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            int i10 = 66 / 0;
            if (e2 == null) {
                int i11 = i9 & 107;
                int i12 = -(-((i9 ^ 107) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                iF = f();
                int i15 = b;
                int i16 = ((i15 ^ 83) | (i15 & 83)) << 1;
                int i17 = -(((~i15) & 83) | (i15 & (-84)));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                i = 0;
            } else {
                int iHashCode = e2.hashCode();
                int iE = e(e2, iHashCode);
                int i20 = b;
                int i21 = (((i20 & (-66)) | ((~i20) & 65)) - (~(-(-((i20 & 65) << 1))))) - 1;
                a = i21 % 128;
                int i22 = i21 % 2;
                i = iHashCode;
                iF = iE;
            }
        } else if (e2 == null) {
            int i110 = i9 & 107;
            int i111 = -(-((i9 ^ 107) | i110));
            int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
            a = i112 % 128;
            int i113 = i112 % 2;
            iF = f();
            int i114 = b;
            int i115 = ((i114 ^ 83) | (i114 & 83)) << 1;
            int i116 = -(((~i114) & 83) | (i114 & (-84)));
            int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
            a = i117 % 128;
            int i118 = i117 % 2;
            i = 0;
        } else {
            int iHashCode2 = e2.hashCode();
            int iE2 = e(e2, iHashCode2);
            int i23 = b;
            int i24 = (((i23 & (-66)) | ((~i23) & 65)) - (~(-(-((i23 & 65) << 1))))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            i = iHashCode2;
            iF = iE2;
        }
        if (iF >= 0) {
            int i26 = a;
            int i27 = ((i26 & 125) - (~(i26 | 125))) - 1;
            b = i27 % 128;
            return i27 % 2 != 0;
        }
        int i28 = ~iF;
        int i29 = this.k;
        int[] iArr = this.i;
        int i30 = a;
        int i31 = (i30 & 49) + (i30 | 49);
        int i32 = i31 % 128;
        b = i32;
        if (i31 % 2 != 0) {
            int length = iArr.length;
            throw null;
        }
        if (i29 >= iArr.length) {
            if (i29 >= 8) {
                int i33 = i32 & 63;
                int i34 = -(-((i32 ^ 63) | i33));
                int i35 = (i33 & i34) + (i33 | i34);
                int i36 = i35 % 128;
                a = i36;
                if (i35 % 2 == 0) {
                    i2 = 0;
                } else {
                    int i37 = i29 >> 1;
                    int i38 = i37 & i29;
                    int i39 = (i29 | i37) & (~i38);
                    int i40 = i38 << 1;
                    i2 = (i39 ^ i40) + ((i39 & i40) << 1);
                }
                int i41 = ((i36 ^ 50) + ((i36 & 50) << 1)) - 1;
                b = i41 % 128;
                int i42 = i41 % 2;
            } else {
                i2 = 4;
                if (i29 >= 4) {
                    int i43 = (i30 | 67) << 1;
                    int i44 = -(i30 ^ 67);
                    int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                    b = i45 % 128;
                    int i46 = i45 % 2 != 0 ? 109 : 8;
                    int i47 = (i30 ^ 6) + ((i30 & 6) << 1);
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    b = i48 % 128;
                    int i49 = i48 % 2;
                    i2 = i46;
                }
            }
            Object[] objArr = this.j;
            d(i2);
            int[] iArr2 = this.i;
            int i50 = a;
            int i51 = i50 + 99;
            b = i51 % 128;
            if (i51 % 2 != 0) {
                int i52 = 21 / 0;
                if (iArr2.length > 0) {
                    int i53 = ((i50 | 79) << 1) - (i50 ^ 79);
                    b = i53 % 128;
                    int i54 = i53 % 2;
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    int i55 = a;
                    int i56 = ((i55 ^ 113) | (i55 & 113)) << 1;
                    int i57 = -(((~i55) & 113) | (i55 & (-114)));
                    i3 = (i56 ^ i57) + ((i57 & i56) << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        System.arraycopy(objArr, 1, this.j, 0, objArr.length);
                    } else {
                        System.arraycopy(objArr, 0, this.j, 0, objArr.length);
                    }
                }
            } else if (iArr2.length > 0) {
                int i58 = ((i50 | 79) << 1) - (i50 ^ 79);
                b = i58 % 128;
                int i59 = i58 % 2;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                int i510 = a;
                int i511 = ((i510 ^ 113) | (i510 & 113)) << 1;
                int i512 = -(((~i510) & 113) | (i510 & (-114)));
                i3 = (i511 ^ i512) + ((i512 & i511) << 1);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    System.arraycopy(objArr, 1, this.j, 0, objArr.length);
                } else {
                    System.arraycopy(objArr, 0, this.j, 0, objArr.length);
                }
            }
            c(iArr, objArr, this.k);
            int i60 = a;
            int i61 = (i60 & 7) + (i60 | 7);
            b = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = this.k;
        if (i28 < i63) {
            int i64 = b;
            int i65 = ((i64 ^ 95) | (i64 & 95)) << 1;
            int i66 = -(((~i64) & 95) | (i64 & (-96)));
            int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
            int i68 = i67 % 128;
            a = i68;
            int i69 = i67 % 2;
            int[] iArr3 = this.i;
            int i70 = (((i28 | 2) << 1) - (i28 ^ 2)) - 1;
            int i71 = (i68 & (-102)) | ((~i68) & 101);
            int i72 = (i68 & 101) << 1;
            int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
            b = i73 % 128;
            int i74 = i73 % 2;
            int i75 = -i28;
            int i76 = i63 & i75;
            int i77 = (i63 | i75) & (~i76);
            int i78 = -(-(i76 << 1));
            System.arraycopy(iArr3, i28, iArr3, i70, (i77 ^ i78) + ((i77 & i78) << 1));
            int i79 = b;
            int i80 = i79 & 75;
            int i81 = i80 + ((i79 ^ 75) | i80);
            a = i81 % 128;
            if (i81 % 2 == 0) {
                throw null;
            }
            Object[] objArr2 = this.j;
            int i82 = ((i79 | 11) << 1) - (i79 ^ 11);
            a = i82 % 128;
            int i83 = i82 % 2;
            int i84 = this.k;
            int i85 = i84 ^ i75;
            System.arraycopy(objArr2, i28, objArr2, i70, (((i84 & i75) | i85) << 1) - i85);
            int i86 = b;
            int i87 = (i86 ^ 73) + ((i86 & 73) << 1);
            a = i87 % 128;
            int i88 = i87 % 2;
        }
        this.i[i28] = i;
        this.j[i28] = e2;
        int i89 = b;
        int i90 = i89 & 49;
        int i91 = (((i89 | 49) & (~i90)) - (~(-(-(i90 << 1))))) - 1;
        int i92 = i91 % 128;
        a = i92;
        int i93 = i91 % 2;
        this.k++;
        int i94 = i92 & 23;
        int i95 = (((i92 | 23) & (~i94)) - (~(i94 << 1))) - 1;
        b = i95 % 128;
        if (i95 % 2 != 0) {
            int i96 = 33 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155  */
    /* JADX WARN: Code duplicated, block: B:41:0x0169  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x01de  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
    public final E g(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        int i14;
        int i15 = 2 % 2;
        int i16 = a;
        int i17 = i16 & 99;
        int i18 = (~i17) & (i16 | 99);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        Object[] objArr2 = this.j;
        E e2 = (E) objArr2[i];
        int i22 = i16 & 49;
        int i23 = ((i16 | 49) & (~i22)) + (i22 << 1);
        int i24 = i23 % 128;
        b = i24;
        if (i23 % 2 == 0 ? (i2 = this.k) > 1 : (i2 = this.k) > 1) {
            int[] iArr = this.i;
            int length = iArr.length;
            int i25 = (i24 & (-2)) | ((~i24) & 1);
            int i26 = (i24 & 1) << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            int i28 = i27 % 128;
            a = i28;
            int i29 = i27 % 2;
            Object obj = null;
            int i30 = 8;
            if (length > 8) {
                int i31 = (i28 & 103) + (i28 | 103);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    int length2 = iArr.length;
                    if (i2 < (length2 ^ (-2)) + ((length2 & (-2)) << 1)) {
                        if (i2 > 8) {
                            int i32 = i28 ^ 71;
                            int i33 = ((i28 & 71) | i32) << 1;
                            int i34 = -i32;
                            i14 = ((i33 | i34) << 1) - (i33 ^ i34);
                            int i35 = i14 % 128;
                            b = i35;
                            if (i14 % 2 != 0) {
                                i30 = i2 / i2;
                            } else {
                                int i36 = -(-(i2 >> 1));
                                i30 = (i2 ^ i36) + ((i2 & i36) << 1);
                            }
                            int i37 = (((i35 | 118) << 1) - (i35 ^ 118)) - 1;
                            a = i37 % 128;
                            int i38 = i37 % 2;
                        }
                        d(i30);
                        int i39 = this.k;
                        int i40 = (i39 ^ (-1)) | i39;
                        this.k = (i39 ^ i40) + ((i39 & i40) << 1);
                        int i41 = b;
                        int i42 = i41 ^ 95;
                        int i43 = ((i41 & 95) | i42) << 1;
                        int i44 = -i42;
                        i7 = (i43 ^ i44) + ((i43 & i44) << 1);
                        i8 = i7 % 128;
                        a = i8;
                        if (i7 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i > 0) {
                            int i45 = (i8 ^ 55) + ((i8 & 55) << 1);
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            System.arraycopy(iArr, 0, this.i, 0, i);
                            int i47 = a;
                            int i48 = (((i47 ^ 87) | (i47 & 87)) << 1) - (((~i47) & 87) | (i47 & (-88)));
                            b = i48 % 128;
                            int i49 = i48 % 2;
                            System.arraycopy(objArr2, 0, this.j, 0, i);
                            int i50 = b;
                            int i51 = (i50 ^ 43) + ((i50 & 43) << 1);
                            a = i51 % 128;
                            int i52 = i51 % 2;
                        }
                        i9 = this.k;
                        if (i < i9) {
                            int i53 = a;
                            int i54 = i53 & 21;
                            i10 = (((i53 ^ 21) | i54) << 1) - ((i53 | 21) & (~i54));
                            b = i10 % 128;
                            if (i10 % 2 != 0) {
                                i11 = i >> 1;
                            } else {
                                i11 = ((i ^ 2) + ((i & 2) << 1)) - 1;
                            }
                            i12 = -i;
                            int i55 = i9 ^ i12;
                            System.arraycopy(iArr, i11, this.i, i, ((((i9 & i12) | i55) << 1) - (~(-i55))) - 1);
                            objArr = this.j;
                            int i56 = a;
                            int i57 = ((i56 ^ 125) | (i56 & 125)) << 1;
                            int i58 = -(((~i56) & 125) | (i56 & (-126)));
                            i13 = ((i57 | i58) << 1) - (i58 ^ i57);
                            b = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i59 = this.k;
                                int i60 = -(~i);
                                System.arraycopy(objArr2, i11, objArr, i, ((i59 ^ i60) + ((i59 & i60) << 1)) - 1);
                            } else {
                                int i61 = this.k - (~i12);
                                System.arraycopy(objArr2, i11, objArr, i, (i61 ^ (-1)) + (i61 << 1));
                            }
                            int i62 = a + 117;
                            b = i62 % 128;
                            int i63 = i62 % 2;
                        }
                    } else {
                        i3 = i2 - 1;
                        this.k = i3;
                        if (i < i3) {
                            i4 = ((i28 ^ 102) + ((i28 & 102) << 1)) - 1;
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                i5 = i >> 1;
                                i6 = i3 % i;
                            } else {
                                int i64 = i & 1;
                                i5 = (i64 - (~((i ^ 1) | i64))) - 1;
                                i6 = i3 - i;
                            }
                            System.arraycopy(iArr, i5, iArr, i, i6);
                            Object[] objArr3 = this.j;
                            int i65 = this.k;
                            int i66 = a + 43;
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            System.arraycopy(objArr3, i5, objArr3, i, (i65 - (~(-i))) - 1);
                            int i68 = b;
                            int i69 = i68 & 49;
                            int i70 = i69 + ((i68 ^ 49) | i69);
                            a = i70 % 128;
                            int i71 = i70 % 2;
                        }
                        this.j[this.k] = null;
                        int i72 = b;
                        int i73 = i72 & 27;
                        int i74 = (((i72 | 27) & (~i73)) - (~(-(-(i73 << 1))))) - 1;
                        a = i74 % 128;
                        int i75 = i74 % 2;
                    }
                } else if (i2 < iArr.length / 3) {
                    if (i2 > 8) {
                        int i310 = i28 ^ 71;
                        int i311 = ((i28 & 71) | i310) << 1;
                        int i312 = -i310;
                        i14 = ((i311 | i312) << 1) - (i311 ^ i312);
                        int i313 = i14 % 128;
                        b = i313;
                        if (i14 % 2 != 0) {
                            i30 = i2 / i2;
                        } else {
                            int i314 = -(-(i2 >> 1));
                            i30 = (i2 ^ i314) + ((i2 & i314) << 1);
                        }
                        int i315 = (((i313 | 118) << 1) - (i313 ^ 118)) - 1;
                        a = i315 % 128;
                        int i316 = i315 % 2;
                    }
                    d(i30);
                    int i317 = this.k;
                    int i410 = (i317 ^ (-1)) | i317;
                    this.k = (i317 ^ i410) + ((i317 & i410) << 1);
                    int i411 = b;
                    int i412 = i411 ^ 95;
                    int i413 = ((i411 & 95) | i412) << 1;
                    int i414 = -i412;
                    i7 = (i413 ^ i414) + ((i413 & i414) << 1);
                    i8 = i7 % 128;
                    a = i8;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i > 0) {
                        int i415 = (i8 ^ 55) + ((i8 & 55) << 1);
                        b = i415 % 128;
                        int i416 = i415 % 2;
                        System.arraycopy(iArr, 0, this.i, 0, i);
                        int i417 = a;
                        int i418 = (((i417 ^ 87) | (i417 & 87)) << 1) - (((~i417) & 87) | (i417 & (-88)));
                        b = i418 % 128;
                        int i419 = i418 % 2;
                        System.arraycopy(objArr2, 0, this.j, 0, i);
                        int i510 = b;
                        int i511 = (i510 ^ 43) + ((i510 & 43) << 1);
                        a = i511 % 128;
                        int i512 = i511 % 2;
                    }
                    i9 = this.k;
                    if (i < i9) {
                        int i513 = a;
                        int i514 = i513 & 21;
                        i10 = (((i513 ^ 21) | i514) << 1) - ((i513 | 21) & (~i514));
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            i11 = i >> 1;
                        } else {
                            i11 = ((i ^ 2) + ((i & 2) << 1)) - 1;
                        }
                        i12 = -i;
                        int i515 = i9 ^ i12;
                        System.arraycopy(iArr, i11, this.i, i, ((((i9 & i12) | i515) << 1) - (~(-i515))) - 1);
                        objArr = this.j;
                        int i516 = a;
                        int i517 = ((i516 ^ 125) | (i516 & 125)) << 1;
                        int i518 = -(((~i516) & 125) | (i516 & (-126)));
                        i13 = ((i517 | i518) << 1) - (i518 ^ i517);
                        b = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i519 = this.k;
                            int i610 = -(~i);
                            System.arraycopy(objArr2, i11, objArr, i, ((i519 ^ i610) + ((i519 & i610) << 1)) - 1);
                        } else {
                            int i611 = this.k - (~i12);
                            System.arraycopy(objArr2, i11, objArr, i, (i611 ^ (-1)) + (i611 << 1));
                        }
                        int i612 = a + 117;
                        b = i612 % 128;
                        int i613 = i612 % 2;
                    }
                } else {
                    i3 = i2 - 1;
                    this.k = i3;
                    if (i < i3) {
                        i4 = ((i28 ^ 102) + ((i28 & 102) << 1)) - 1;
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            i5 = i >> 1;
                            i6 = i3 % i;
                        } else {
                            int i614 = i & 1;
                            i5 = (i614 - (~((i ^ 1) | i614))) - 1;
                            i6 = i3 - i;
                        }
                        System.arraycopy(iArr, i5, iArr, i, i6);
                        Object[] objArr4 = this.j;
                        int i615 = this.k;
                        int i616 = a + 43;
                        b = i616 % 128;
                        int i617 = i616 % 2;
                        System.arraycopy(objArr4, i5, objArr4, i, (i615 - (~(-i))) - 1);
                        int i618 = b;
                        int i619 = i618 & 49;
                        int i76 = i619 + ((i618 ^ 49) | i619);
                        a = i76 % 128;
                        int i77 = i76 % 2;
                    }
                    this.j[this.k] = null;
                    int i78 = b;
                    int i79 = i78 & 27;
                    int i710 = (((i78 | 27) & (~i79)) - (~(-(-(i79 << 1))))) - 1;
                    a = i710 % 128;
                    int i711 = i710 % 2;
                }
            } else {
                i3 = i2 - 1;
                this.k = i3;
                if (i < i3) {
                    i4 = ((i28 ^ 102) + ((i28 & 102) << 1)) - 1;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        i5 = i >> 1;
                        i6 = i3 % i;
                    } else {
                        int i6110 = i & 1;
                        i5 = (i6110 - (~((i ^ 1) | i6110))) - 1;
                        i6 = i3 - i;
                    }
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr5 = this.j;
                    int i6111 = this.k;
                    int i6112 = a + 43;
                    b = i6112 % 128;
                    int i6113 = i6112 % 2;
                    System.arraycopy(objArr5, i5, objArr5, i, (i6111 - (~(-i))) - 1);
                    int i6114 = b;
                    int i6115 = i6114 & 49;
                    int i712 = i6115 + ((i6114 ^ 49) | i6115);
                    a = i712 % 128;
                    int i713 = i712 % 2;
                }
                this.j[this.k] = null;
                int i714 = b;
                int i715 = i714 & 27;
                int i716 = (((i714 | 27) & (~i715)) - (~(-(-(i715 << 1))))) - 1;
                a = i716 % 128;
                int i717 = i716 % 2;
            }
        } else {
            int i80 = i24 ^ 37;
            int i81 = ((i24 & 37) | i80) << 1;
            int i82 = -i80;
            int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
            a = i83 % 128;
            if (i83 % 2 == 0) {
                c(this.i, objArr2, i2);
                int i84 = 45 / 0;
            } else {
                c(this.i, objArr2, i2);
            }
            int i85 = b;
            int i86 = ((i85 | 125) << 1) - (i85 ^ 125);
            a = i86 % 128;
            if (i86 % 2 == 0) {
                this.i = d;
                this.j = e;
                int i87 = 23 / 0;
            } else {
                this.i = d;
                this.j = e;
            }
            this.k = 0;
            int i88 = i85 & 113;
            int i89 = ((i85 ^ 113) | i88) << 1;
            int i90 = -((i85 | 113) & (~i88));
            int i91 = (i89 & i90) + (i90 | i89);
            a = i91 % 128;
            int i92 = i91 % 2;
        }
        int i93 = b;
        int i94 = (i93 & (-76)) | ((~i93) & 75);
        int i95 = -(-((i93 & 75) << 1));
        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
        a = i96 % 128;
        int i97 = i96 % 2;
        return e2;
    }
}
