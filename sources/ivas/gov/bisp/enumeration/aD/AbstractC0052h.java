package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052h<E> extends AbstractList<E> implements o0OO00O.OooO0OO<E> {
    private static int a = 0;
    private static int b = 1;
    public boolean c = true;

    public final void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 81) | (i2 & 81)) << 1) - (~(-((i2 & (-82)) | ((~i2) & 81))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c = false;
        int i5 = (i2 | 35) << 1;
        int i6 = -(i2 ^ 35);
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 99;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 99)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (!this.c) {
            throw new UnsupportedOperationException();
        }
        int i9 = (-2) - (((i7 ^ 76) + ((i7 & 76) << 1)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public boolean o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 5) - (~(i2 | 5))) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.c;
        int i5 = i4 + 71;
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            d();
            return super.retainAll(collection);
        }
        d();
        super.retainAll(collection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        boolean zAdd;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            d();
            zAdd = super.add(e);
            int i4 = 22 / 0;
        } else {
            d();
            zAdd = super.add(e);
        }
        int i5 = b;
        int i6 = (i5 & 108) + (i5 | 108);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            d();
            super.addAll(collection);
            throw null;
        }
        d();
        boolean zAddAll = super.addAll(collection);
        int i7 = a;
        int i8 = i7 & 69;
        int i9 = (i7 ^ 69) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return zAddAll;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i2 ^ 113) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        d();
        super.clear();
        int i7 = a;
        int i8 = i7 & 115;
        int i9 = (i7 | 115) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b + 101;
        a = i2 % 128;
        int i3 = i2 % 2;
        int size = size();
        int i4 = a;
        int i5 = i4 | 85;
        int i6 = (i5 << 1) - ((~(i4 & 85)) & i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        int iHashCode = 1;
        while (i8 < size) {
            int i9 = a;
            int i10 = (((i9 ^ 83) | (i9 & 83)) << 1) - (((~i9) & 83) | (i9 & (-84)));
            b = i10 % 128;
            iHashCode = i10 % 2 == 0 ? (iHashCode / 67) / get(i8).hashCode() : (iHashCode * 31) + get(i8).hashCode();
            int i11 = b;
            int i12 = i11 & 75;
            int i13 = ((i11 ^ 75) | i12) << 1;
            int i14 = -((~i12) & (i11 | 75));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            i8 = ((i8 & 2) + (i8 | 2)) - 1;
            int i17 = i11 + 89;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = (i19 & 39) + (i19 | 39);
        a = i20 % 128;
        int i21 = i20 % 2;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 85) - (~(i2 | 85))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        d();
        boolean zRemove = super.remove(obj);
        int i5 = b;
        int i6 = i5 & 69;
        int i7 = ((i5 ^ 69) | i6) << 1;
        int i8 = -((i5 | 69) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            d();
            return super.removeAll(collection);
        }
        d();
        super.removeAll(collection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 44) + ((i3 & 44) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        d();
        boolean zAddAll = super.addAll(i, collection);
        int i6 = a;
        int i7 = (i6 ^ 99) + ((i6 & 99) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return zAddAll;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 126) + (i2 | 126);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj == this) {
            int i6 = (i5 ^ 89) + ((i5 & 89) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof List)) {
            int i8 = ((i2 | 123) << 1) - (i2 ^ 123);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = i9 & 51;
            int i12 = (i9 | 51) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 67 / 0;
            }
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            int i16 = (i5 ^ 38) + ((i5 & 38) << 1);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                super.equals(obj);
                obj2.hashCode();
                throw null;
            }
            boolean zEquals = super.equals(obj);
            int i18 = b;
            int i19 = i18 & 75;
            int i20 = (i18 | 75) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                return zEquals;
            }
            obj2.hashCode();
            throw null;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            int i23 = b;
            int i24 = (((i23 | 32) << 1) - (i23 ^ 32)) - 1;
            a = i24 % 128;
            boolean z = i24 % 2 != 0;
            int i25 = i23 ^ 73;
            int i26 = ((((i23 & 73) | i25) << 1) - (~(-i25))) - 1;
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 31 / 0;
            }
            return z;
        }
        int i28 = b;
        int i29 = i28 & 93;
        int i30 = (i28 | 93) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        a = i32 % 128;
        int i33 = i32 % 2;
        int i34 = 0;
        while (i34 < size) {
            int i35 = a;
            int i36 = ((i35 & 91) - (~(i35 | 91))) - 1;
            b = i36 % 128;
            int i37 = i36 % 2;
            E e = get(i34);
            Object obj3 = list.get(i34);
            int i38 = a;
            int i39 = i38 & 7;
            int i40 = (i39 - (~(-(-((i38 ^ 7) | i39))))) - 1;
            b = i40 % 128;
            if (i40 % 2 == 0) {
                e.equals(obj3);
                obj2.hashCode();
                throw null;
            }
            if (!e.equals(obj3)) {
                int i41 = a;
                int i42 = i41 & 75;
                int i43 = (i42 - (~(-(-((i41 ^ 75) | i42))))) - 1;
                b = i43 % 128;
                int i44 = i43 % 2;
                return false;
            }
            i34 = (-2) - ((i34 + 2) ^ (-1));
            int i45 = a;
            int i46 = (i45 & 23) + (i45 | 23);
            b = i46 % 128;
            int i47 = i46 % 2;
        }
        int i48 = a + 53;
        b = i48 % 128;
        int i49 = i48 % 2;
        return true;
    }
}
