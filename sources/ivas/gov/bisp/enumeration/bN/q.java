package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.O.r;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Set, Serializable {
    private static int a = 1;
    private static int b;
    public static final q c = new q();

    static {
        int i = b;
        int i2 = ((i ^ 44) + ((i & 44) << 1)) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        int i4 = i3 % 128;
        b = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            boolean z = obj instanceof Void;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof Void) {
            r.n((Void) obj, "element");
            int i5 = b + 97;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return false;
        }
        int i7 = i4 & 7;
        int i8 = (i4 | 7) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        r.n(collection, "elements");
        boolean zIsEmpty = collection.isEmpty();
        int i5 = a;
        int i6 = ((i5 | 51) << 1) - (i5 ^ 51);
        b = i6 % 128;
        int i7 = i6 % 2;
        return zIsEmpty;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = -(-((i2 ^ 97) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            boolean z2 = obj instanceof Set;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof Set) {
            int i7 = i6 ^ 51;
            int i8 = (((i6 & 51) | i7) << 1) - i7;
            a = i8 % 128;
            int i9 = i8 % 2;
            if (!(!((Set) obj).isEmpty())) {
                int i10 = b + 59;
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                int i13 = (((i11 & (-98)) | ((~i11) & 97)) - (~(-(-((i11 & 97) << 1))))) - 1;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 % 4;
                }
                z = true;
            } else {
                int i15 = b;
                int i16 = i15 & 5;
                int i17 = ((i15 ^ 5) | i16) << 1;
                int i18 = -((i15 | 5) & (~i16));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                z = false;
            }
        } else {
            int i110 = b;
            int i111 = i110 & 5;
            int i112 = ((i110 ^ 5) | i111) << 1;
            int i113 = -((i110 | 5) & (~i111));
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            a = i114 % 128;
            int i21 = i114 % 2;
            z = false;
        }
        int i22 = a;
        int i23 = i22 & 87;
        int i24 = (((i22 ^ 87) | i23) << 1) - ((i22 | 87) & (~i23));
        b = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 101) + (i2 | 101);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2 == 0 ? 1 : 0;
        int i6 = ((i4 ^ 63) - (~((i4 & 63) << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 7;
        b = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 & 27;
        int i5 = -(-((i2 ^ 27) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 9 / 0;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 97;
        int i4 = ((((i2 & 97) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        n nVar = n.c;
        int i6 = a;
        int i7 = i6 ^ 99;
        int i8 = -(-((i6 & 99) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return nVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 109;
        int i4 = -(-((i2 & 109) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 91;
        int i9 = (i6 | 91) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int i = 2 % 2;
        int i2 = b + 88;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArrD = r.D(this);
        int i5 = a;
        int i6 = i5 & 87;
        int i7 = (i6 - (~(-(-((i5 ^ 87) | i6))))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
        return objArrD;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 21) + (i2 | 21);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        r.n(tArr, "array");
        if (i4 != 0) {
            r.E(this, tArr);
            throw null;
        }
        T[] tArr2 = (T[]) r.E(this, tArr);
        int i5 = a + 109;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return tArr2;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (i3 - (~(-(-((i2 ^ 63) | i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 | 29) << 1) - (i5 ^ 29);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 24 / 0;
        }
        return "[]";
    }
}
