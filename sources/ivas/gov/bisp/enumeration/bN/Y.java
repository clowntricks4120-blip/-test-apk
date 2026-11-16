package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.O.r;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Map, Serializable {
    private static int a = 1;
    private static int b;
    public static final Y c = new Y();

    static {
        int i = b;
        int i2 = ((i ^ 49) | (i & 49)) << 1;
        int i3 = -(((~i) & 49) | (i & (-50)));
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        a = i3 % 128;
        return i3 % 2 == 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-6)) | ((~i2) & 5)) - (~((i2 & 5) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (obj instanceof Void) {
            r.n((Void) obj, "value");
            int i6 = a;
            int i7 = i6 & 99;
            int i8 = (i6 ^ 99) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 99 / 0;
            }
            return false;
        }
        int i11 = i4 + 45;
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        int i14 = (i12 | 87) << 1;
        int i15 = -(((~i12) & 87) | (i12 & (-88)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = i3 + ((i2 ^ 87) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        q qVar = q.c;
        int i6 = a;
        int i7 = (i6 | 117) << 1;
        int i8 = -(((~i6) & 117) | (i6 & (-118)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return qVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = i2 | 85;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        boolean z = true;
        if (obj instanceof Map) {
            int i8 = i6 & 61;
            int i9 = ((i6 ^ 61) | i8) << 1;
            int i10 = -((i6 | 61) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            Map map = (Map) obj;
            if (i11 % 2 == 0) {
                map.isEmpty();
                throw null;
            }
            if (map.isEmpty()) {
                int i12 = a;
                int i13 = ((i12 & 34) + (i12 | 34)) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                int i15 = i12 ^ 75;
                int i16 = (i12 & 75) << 1;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 4 % 2;
                }
            } else {
                int i19 = a;
                int i20 = (-2) - (((i19 ^ 124) + ((i19 & 124) << 1)) ^ (-1));
                b = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            }
        } else {
            int i110 = a;
            int i22 = (-2) - (((i110 ^ 124) + ((i110 & 124) << 1)) ^ (-1));
            b = i22 % 128;
            int i23 = i22 % 2;
            z = false;
        }
        int i24 = b + 89;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = -(-((i2 & 33) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        int i6 = 92 / 0;
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 41) | (i2 & 41)) << 1) - ((i2 & (-42)) | ((~i2) & 41));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 & (-42)) | ((~i2) & 41);
        int i6 = -(-((i2 & 41) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = a + 63;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        a = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 122) + (i2 | 122)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return q.c;
        }
        q qVar = q.c;
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = i2 | 37;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (((i6 | 4) << 1) - (i6 ^ 4)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-42)) | ((~i2) & 41)) + ((i2 & 41) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return "{}";
        }
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i2 | 45) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        X x = X.c;
        int i8 = a + 43;
        b = i8 % 128;
        int i9 = i8 % 2;
        return x;
    }
}
