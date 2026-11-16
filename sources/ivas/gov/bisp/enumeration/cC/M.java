package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    private static int a = 0;
    private static int b = 1;
    public static final Map<Integer, M> c;
    public final T d;
    public final S e;
    public final int f;
    public final int g;

    public M(int i, int i2, C0278x c0278x) {
        String strC;
        this.f = i;
        this.g = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = b;
        int i4 = (i3 & 79) + (i3 | 79);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i / i2;
        if (i6 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        S s = new S(i6, c0278x);
        int i7 = b;
        int i8 = ((i7 & 12) + (i7 | 12)) - 1;
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            this.e = s;
            String str = s.h;
            obj.hashCode();
            throw null;
        }
        this.e = s;
        String str2 = s.h;
        int i9 = s.j;
        int i10 = s.i;
        int i11 = b;
        int i12 = (i11 & (-14)) | ((~i11) & 13);
        int i13 = (i11 & 13) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = s.k.e;
        int i17 = a;
        int i18 = (((i17 & (-124)) | ((~i17) & 123)) - (~(-(-((i17 & 123) << 1))))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        Map<String, C0237p> map = C0237p.c;
        Objects.requireNonNull(str2, "algorithmName == null");
        Map<String, C0237p> map2 = C0237p.c;
        int i20 = a + 59;
        b = i20 % 128;
        if (i20 % 2 == 0) {
            strC = C0237p.c(str2, i9, i10, i16, i, i2);
            int i21 = 31 / 0;
        } else {
            strC = C0237p.c(str2, i9, i10, i16, i, i2);
        }
        int i22 = a;
        int i23 = i22 & 47;
        int i24 = -(-((i22 ^ 47) | i23));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            this.d = map2.get(strC);
            throw null;
        }
        this.d = map2.get(strC);
        int i26 = a + 27;
        b = i26 % 128;
        int i27 = i26 % 2;
    }

    static {
        HashMap map = new HashMap();
        C0278x c0278x = j.a;
        map.put(1, new M(20, 2, c0278x));
        map.put(2, new M(20, 4, c0278x));
        map.put(3, new M(40, 2, c0278x));
        map.put(4, new M(40, 4, c0278x));
        map.put(5, new M(40, 8, c0278x));
        map.put(6, new M(60, 3, c0278x));
        map.put(7, new M(60, 6, c0278x));
        map.put(8, new M(60, 12, c0278x));
        C0278x c0278x2 = j.c;
        map.put(9, new M(20, 2, c0278x2));
        map.put(10, new M(20, 4, c0278x2));
        map.put(11, new M(40, 2, c0278x2));
        map.put(12, new M(40, 4, c0278x2));
        map.put(13, new M(40, 8, c0278x2));
        map.put(14, new M(60, 3, c0278x2));
        map.put(15, new M(60, 6, c0278x2));
        map.put(16, new M(60, 12, c0278x2));
        C0278x c0278x3 = j.g;
        map.put(17, new M(20, 2, c0278x3));
        map.put(18, new M(20, 4, c0278x3));
        map.put(19, new M(40, 2, c0278x3));
        map.put(20, new M(40, 4, c0278x3));
        map.put(21, new M(40, 8, c0278x3));
        map.put(22, new M(60, 3, c0278x3));
        map.put(23, new M(60, 6, c0278x3));
        map.put(24, new M(60, 12, c0278x3));
        C0278x c0278x4 = j.h;
        map.put(25, new M(20, 2, c0278x4));
        map.put(26, new M(20, 4, c0278x4));
        map.put(27, new M(40, 2, c0278x4));
        map.put(28, new M(40, 4, c0278x4));
        map.put(29, new M(40, 8, c0278x4));
        map.put(30, new M(60, 3, c0278x4));
        map.put(31, new M(60, 6, c0278x4));
        map.put(32, new M(60, 12, c0278x4));
        c = Collections.unmodifiableMap(map);
        int i = b;
        int i2 = (i & 23) + (i | 23);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
