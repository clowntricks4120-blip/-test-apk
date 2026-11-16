package ivas.gov.bisp.enumeration.p001aa;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class z<K, V> {
    private static int a = 0;
    private static int b = 1;
    public final LinkedHashMap<K, V> c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public z(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.e = i;
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(0, 0.75f, true);
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = -(-((i2 ^ 73) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.c = linkedHashMap;
        int i8 = (i6 ^ 39) + ((i6 & 39) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public final V c(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.c.get(k);
            if (v == null) {
                this.i++;
                return null;
            }
            int i = this.g;
            this.g = ((((i ^ 1) | (i & 1)) << 1) - (~(-(((~i) & 1) | (i & (-2)))))) - 1;
            return v;
        }
    }

    public final V d(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            int i = this.f;
            this.f = (i & 1) + (i | 1);
            this.d++;
            vPut = this.c.put(k, v);
            if (vPut != null) {
                this.d--;
            }
        }
        e(this.e);
        return vPut;
    }

    public void e(int i) {
        while (true) {
            synchronized (this) {
                if (this.d < 0 || (this.c.isEmpty() && this.d != 0)) {
                    break;
                }
                if (this.d > i && !this.c.isEmpty()) {
                    Map.Entry<K, V> next = this.c.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.c.remove(key);
                    this.d = (-2) - (this.d ^ (-1));
                    int i2 = this.h;
                    this.h = (((i2 & (-2)) | ((~i2) & 1)) - (~(-(-((i2 & 1) << 1))))) - 1;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(sb.toString());
    }

    public final String toString() {
        String str;
        synchronized (this) {
            int i = this.g;
            int i2 = this.i;
            int i3 = (i2 & i) + (i2 | i);
            str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.e), Integer.valueOf(this.g), Integer.valueOf(this.i), Integer.valueOf(i3 != 0 ? (i * 100) / i3 : 0));
        }
        return str;
    }
}
