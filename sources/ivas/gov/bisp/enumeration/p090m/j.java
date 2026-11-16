package ivas.gov.bisp.enumeration.p090m;

import ivas.gov.bisp.enumeration.OooOOOO.OooO0O0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class j<K, V> extends OooO0O0<K, V> {
    private static int a = 0;
    private static int b = 1;
    public HashMap<K, OooO0O0.OooO0OO<K, V>> g = new HashMap<>();

    public OooO0O0.OooO0OO<K, V> c(K k) {
        int i = 2 % 2;
        int i2 = a + 119;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.g.get(k);
        }
        this.g.get(k);
        throw null;
    }

    public boolean contains(K k) {
        int i = 2 % 2;
        int i2 = a + 81;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.g.containsKey(k);
            throw null;
        }
        boolean zContainsKey = this.g.containsKey(k);
        int i3 = a;
        int i4 = i3 & 27;
        int i5 = (i3 ^ 27) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return zContainsKey;
        }
        obj.hashCode();
        throw null;
    }

    public V f(K k, V v) {
        int i = 2 % 2;
        int i2 = a + 47;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.g.get(k);
            obj.hashCode();
            throw null;
        }
        c.aTj atj = this.g.get(k);
        if (atj != null) {
            V v2 = atj.d;
            int i3 = b;
            int i4 = i3 ^ 15;
            int i5 = (((i3 & 15) | i4) << 1) - i4;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return v2;
            }
            obj.hashCode();
            throw null;
        }
        HashMap<K, OooO0O0.OooO0OO<K, V>> map = this.g;
        OooO0O0.OooO0OO<K, V> oooO0OOD = d(k, v);
        int i6 = b;
        int i7 = (-2) - (((i6 & 106) + (i6 | 106)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        map.put(k, oooO0OOD);
        int i9 = a;
        int i10 = i9 ^ 25;
        int i11 = ((i9 & 25) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 & i12) + (i11 | i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public V g(K k) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 58) + ((i2 & 58) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            super.g(k);
            this.g.remove(k);
            throw null;
        }
        V v = (V) super.g(k);
        this.g.remove(k);
        int i4 = a;
        int i5 = i4 & 73;
        int i6 = (i5 - (~((i4 ^ 73) | i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return v;
    }
}
