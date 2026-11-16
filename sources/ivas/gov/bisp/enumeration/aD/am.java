package ivas.gov.bisp.enumeration.aD;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class am extends V {
    private static int a = 1;
    private static int b;

    public aa b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        aa aaVarC = c(null);
        int i6 = b + 75;
        a = i6 % 128;
        int i7 = i6 % 2;
        return aaVarC;
    }

    @Override // ivas.gov.bisp.enumeration.aD.V
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = b().equals(obj);
        int i4 = b;
        int i5 = i4 ^ 31;
        int i6 = -(-((i4 & 31) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.V
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 48) + ((i2 & 48) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        aa aaVarB = b();
        if (i4 == 0) {
            return aaVarB.hashCode();
        }
        aaVarB.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String string = b().toString();
        if (i4 == 0) {
            int i5 = 53 / 0;
        }
        return string;
    }

    public static class bjV<K> implements Iterator<Map.Entry<K, Object>> {
        private static int a = 1;
        private static int b;
        public Iterator<Map.Entry<K, Object>> c;

        public bjV(Iterator<Map.Entry<K, Object>> it) {
            this.c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 77;
            int i4 = -(-((i2 ^ 77) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                this.c.hasNext();
                throw null;
            }
            boolean zHasNext = this.c.hasNext();
            int i6 = b;
            int i7 = i6 & 107;
            int i8 = i6 | 107;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return zHasNext;
            }
            throw null;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = 2 % 2;
            int i2 = a + 41;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.remove();
            int i4 = a;
            int i5 = i4 & 51;
            int i6 = ((i4 ^ 51) | i5) << 1;
            int i7 = -((i4 | 51) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 79 / 0;
            }
        }

        @Override // java.util.Iterator
        public Object next() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 74) + ((i2 & 74) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            Map.Entry<K, Object> next = this.c.next();
            int i6 = b;
            int i7 = (i6 & 63) + (i6 | 63);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (next.getValue() instanceof am) {
                bjU bju = new bjU(next, null);
                int i9 = a;
                int i10 = i9 & 47;
                int i11 = -(-((i9 ^ 47) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                next = bju;
            }
            int i14 = b + 109;
            a = i14 % 128;
            int i15 = i14 % 2;
            return next;
        }
    }

    public static class bjU<K> implements Map.Entry<K, Object> {
        private static int a = 1;
        private static int b;
        public Map.Entry<K, am> c;

        public bjU(Map.Entry entry, bjT bjt) {
            this.c = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-(((~i2) & 101) | (i2 & (-102)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            K key = this.c.getKey();
            int i5 = a;
            int i6 = i5 & 89;
            int i7 = (i5 | 89) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            return key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 79;
            int i4 = (i2 ^ 79) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            am value = this.c.getValue();
            if (value != null) {
                aa aaVarB = value.b();
                int i7 = b;
                int i8 = ((i7 | 79) << 1) - (i7 ^ 79);
                a = i8 % 128;
                int i9 = i8 % 2;
                return aaVarB;
            }
            int i10 = a;
            int i11 = i10 ^ 97;
            int i12 = (i10 & 97) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return null;
            }
            int i14 = 88 / 0;
            return null;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (!(obj instanceof aa)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            int i6 = (-2) - (((i4 ^ 78) + ((i4 & 78) << 1)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            am value = this.c.getValue();
            int i8 = b;
            int i9 = i8 & 15;
            int i10 = (((i8 | 15) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            aa aaVar = value.c;
            value.d = null;
            value.c = (aa) obj;
            int i12 = a;
            int i13 = (i12 & (-74)) | ((~i12) & 73);
            int i14 = (i12 & 73) << 1;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i12 & 99) + (i12 | 99);
            b = i17 % 128;
            int i18 = i17 % 2;
            return aaVar;
        }
    }
}
