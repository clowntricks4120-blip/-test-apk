package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.O.r;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class X implements List, Serializable, RandomAccess {
    private static int a = 1;
    private static int b;
    public static final X c = new X();

    static {
        int i = a;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = b + 43;
        int i3 = i2 % 128;
        a = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof Void;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof Void)) {
            int i4 = i3 + 26;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        r.n((Void) obj, "element");
        int i7 = b;
        int i8 = i7 & 77;
        int i9 = ((i7 ^ 77) | i8) << 1;
        int i10 = -((i7 | 77) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 9) + (i2 | 9);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            r.n(collection, "elements");
            return collection.isEmpty();
        }
        r.n(collection, "elements");
        collection.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 21) + (i2 | 21);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (!(!(obj instanceof List))) {
            int i6 = (i4 ^ 31) + ((i4 & 31) << 1);
            b = i6 % 128;
            List list = (List) obj;
            if (i6 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (list.isEmpty()) {
                int i7 = a;
                int i8 = ((i7 ^ 119) | (i7 & 119)) << 1;
                int i9 = -(((~i7) & 119) | (i7 & (-120)));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                int i12 = b + 111;
                a = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            }
        } else {
            int i14 = b + 111;
            a = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = b;
        int i17 = i16 & 97;
        int i18 = ((i16 ^ 97) | i17) << 1;
        int i19 = -((i16 | 97) & (~i17));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        int i3 = b;
        int i4 = ((i3 ^ 90) + ((i3 & 90) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        sb.append(i);
        sb.append(i5 == 0 ? (char) 16 : '.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (((i2 ^ 67) | i3) << 1) - ((i2 | 67) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2 == 0 ? 0 : 1;
        int i7 = (-2) - ((((i5 | 60) << 1) - (i5 ^ 60)) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        ivas.gov.bisp.enumeration.O.r.n((java.lang.Void) r7, "element");
        r7 = ivas.gov.bisp.enumeration.bN.X.b;
        r1 = ((r7 ^ 113) | (r7 & 113)) << 1;
        r7 = -(((~r7) & 113) | (r7 & (-114)));
        r2 = (r1 ^ r7) + ((r7 & r1) << 1);
        ivas.gov.bisp.enumeration.bN.X.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if ((r7 instanceof java.lang.Void) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((r7 instanceof java.lang.Void) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r7 = r1 & 85;
        r1 = -(-((r1 ^ 85) | r7));
        r2 = (r7 ^ r1) + ((r7 & r1) << 1);
        ivas.gov.bisp.enumeration.bN.X.b = r2 % 128;
     */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int indexOf(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.bN.X.a
            r2 = r1 ^ 11
            r3 = r1 & 11
            r4 = 1
            int r3 = r3 << r4
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.bN.X.b = r3
            int r2 = r2 % r0
            r3 = -1
            if (r2 == 0) goto L1d
            boolean r2 = r7 instanceof java.lang.Void
            r5 = 84
            int r5 = r5 / 0
            if (r2 == 0) goto L21
            goto L37
        L1d:
            boolean r2 = r7 instanceof java.lang.Void
            if (r2 == r4) goto L37
        L21:
            r7 = r1 & 85
            r1 = r1 ^ 85
            r1 = r1 | r7
            int r1 = -r1
            int r1 = -r1
            r2 = r7 ^ r1
            r7 = r7 & r1
            int r7 = r7 << r4
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.bN.X.b = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L35
            return r3
        L35:
            r7 = 0
            throw r7
        L37:
            java.lang.Void r7 = (java.lang.Void) r7
            java.lang.String r1 = "element"
            ivas.gov.bisp.enumeration.O.r.n(r7, r1)
            int r7 = ivas.gov.bisp.enumeration.bN.X.b
            r1 = r7 ^ 113(0x71, float:1.58E-43)
            r2 = r7 & 113(0x71, float:1.58E-43)
            r1 = r1 | r2
            int r1 = r1 << r4
            r2 = r7 & (-114(0xffffffffffffff8e, float:NaN))
            int r7 = ~r7
            r5 = 113(0x71, float:1.58E-43)
            r7 = r7 & r5
            r7 = r7 | r2
            int r7 = -r7
            r2 = r1 ^ r7
            r7 = r7 & r1
            int r7 = r7 << r4
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.bN.X.a = r7
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bN.X.indexOf(java.lang.Object):int");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 115) + ((i2 & 115) << 1);
        int i4 = i3 % 128;
        a = i4;
        boolean z = !(i3 % 2 == 0);
        int i5 = (-2) - ((i4 + 30) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = (i2 | 5) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            n nVar = n.c;
            throw null;
        }
        n nVar2 = n.c;
        int i7 = a;
        int i8 = ((i7 | 23) << 1) - (i7 ^ 23);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 89 / 0;
        }
        return nVar2;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-80)) | ((~i2) & 79)) - (~(-(-((i2 & 79) << 1))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof Void;
            throw null;
        }
        if (!(obj instanceof Void)) {
            int i4 = (i2 ^ 119) + ((i2 & 119) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            return -1;
        }
        r.n((Void) obj, "element");
        int i6 = a;
        int i7 = (i6 & 49) + (i6 | 49);
        b = i7 % 128;
        int i8 = i7 % 2;
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 115) | (i2 & 115)) << 1;
        int i4 = -(((~i2) & 115) | (i2 & (-116)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return n.c;
        }
        n nVar = n.c;
        throw null;
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 118;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 3;
        int i7 = (i6 - (~((i2 ^ 3) | i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a + 69;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            int i8 = 36 / 0;
            if (i == 0) {
                if (i2 == 0) {
                    i3 = (-2) - ((i7 + 90) ^ (-1));
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i9 = 48 / 0;
                    }
                    i4 = ((i7 ^ 34) + ((i7 & 34) << 1)) - 1;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return this;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (i == 0) {
            if (i2 == 0) {
                i3 = (-2) - ((i7 + 90) ^ (-1));
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i10 = 48 / 0;
                }
                i4 = ((i7 ^ 34) + ((i7 & 34) << 1)) - 1;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        int i11 = b;
        int i12 = (i11 ^ 73) + ((i11 & 73) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 122) + (i2 | 122)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            r.D(this);
            throw null;
        }
        Object[] objArrD = r.D(this);
        int i4 = a;
        int i5 = i4 & 53;
        int i6 = (i4 | 53) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 21 / 0;
        }
        return objArrD;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 66) + ((i2 & 66) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        r.n(tArr, "array");
        T[] tArr2 = (T[]) r.E(this, tArr);
        int i5 = b;
        int i6 = (((i5 ^ 1) | (i5 & 1)) << 1) - (((~i5) & 1) | (i5 & (-2)));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return tArr2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = (i2 ^ 49) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 ^ 35) - (~(-(-((i6 & 35) << 1))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return "[]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        throw new java.lang.IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.o("Index: ", r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r5 = ivas.gov.bisp.enumeration.bN.n.c;
        r1 = ivas.gov.bisp.enumeration.bN.X.a;
        r3 = r1 & 17;
        r2 = ((r1 ^ 17) | r3) << 1;
        r1 = -((r1 | 17) & (~r3));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.bN.X.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        return r5;
     */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ListIterator listIterator(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.bN.X.b
            r2 = r1 ^ 113(0x71, float:1.58E-43)
            r3 = r1 & 113(0x71, float:1.58E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r1 = r1 | 113(0x71, float:1.58E-43)
            r1 = r1 & r3
            int r1 = -r1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.bN.X.a = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L25
            r1 = 73
            int r1 = r1 / 0
            if (r5 != 0) goto L43
            goto L27
        L25:
            if (r5 != 0) goto L43
        L27:
            ivas.gov.bisp.enumeration.bN.n r5 = ivas.gov.bisp.enumeration.bN.n.c
            int r1 = ivas.gov.bisp.enumeration.bN.X.a
            r2 = r1 ^ 17
            r3 = r1 & 17
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r1 = r1 | 17
            r1 = r1 & r3
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.bN.X.b = r1
            int r3 = r3 % r0
            return r5
        L43:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Index: "
            java.lang.String r5 = ivas.gov.bisp.enumeration.p091n.j.o(r1, r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bN.X.listIterator(int):java.util.ListIterator");
    }
}
