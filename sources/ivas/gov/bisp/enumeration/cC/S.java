package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class S {
    private static int a = 1;
    private static int b;
    public static final Map<Integer, S> c;
    public final T d;
    public final int e;
    public final int f;
    public final C0278x g;
    public final String h;
    public final int i;
    public final int j;
    public final J k;

    public final a c() {
        int i = 2 % 2;
        a aVar = new a(this.k);
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        return aVar;
    }

    public S(int i, C0278x c0278x) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        Objects.requireNonNull(c0278x, "digest == null");
        this.e = i;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = i3 + ((i2 ^ 65) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 2 % 2;
        int i7 = 2;
        while (true) {
            int i8 = this.e;
            if (i7 > i8) {
                throw new IllegalStateException("should never happen...");
            }
            int i9 = b;
            int i10 = (i9 ^ 55) + ((i9 & 55) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = -i7;
            int i14 = i8 & i13;
            if ((i14 + ((i8 ^ i13) | i14)) % 2 == 0) {
                int i15 = i9 ^ 85;
                int i16 = -(-((i9 & 85) << 1));
                int i17 = (i15 & i16) + (i15 | i16);
                a = i17 % 128;
                Object obj = null;
                if (i17 % 2 == 0) {
                    this.f = i7;
                    ((HashMap) P.d).get(c0278x);
                    obj.hashCode();
                    throw null;
                }
                this.f = i7;
                Object obj2 = ((HashMap) P.d).get(c0278x);
                int i18 = a;
                int i19 = ((i18 | 82) << 1) - (i18 ^ 82);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                String str = (String) obj2;
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unrecognized digest oid: ");
                    sb.append(c0278x);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.h = str;
                this.g = c0278x;
                J j = new J(c0278x);
                int i21 = a;
                int i22 = (i21 & 69) + (i21 | 69);
                b = i22 % 128;
                int i23 = i22 % 2;
                this.k = j;
                int i24 = j.c;
                this.j = i24;
                int i25 = b;
                int i26 = i25 & 87;
                int i27 = (i26 - (~(-(-((i25 ^ 87) | i26))))) - 1;
                a = i27 % 128;
                if (i27 % 2 == 0) {
                    this.i = j.d;
                    int i28 = j.e;
                    obj.hashCode();
                    throw null;
                }
                int i29 = j.d;
                this.i = i29;
                int i30 = j.e;
                int i31 = a;
                int i32 = (i31 & 67) + (i31 | 67);
                b = i32 % 128;
                int i33 = i32 % 2;
                Map<String, z> map = z.c;
                Objects.requireNonNull(str, "algorithmName == null");
                Map<String, z> map2 = z.c;
                int i34 = b + 35;
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    map2.get(z.c(str, i24, i29, i30, i));
                    obj.hashCode();
                    throw null;
                }
                this.d = map2.get(z.c(str, i24, i29, i30, i));
                int i35 = a;
                int i36 = i35 ^ 95;
                int i37 = ((i35 & 95) | i36) << 1;
                int i38 = -i36;
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                b = i39 % 128;
                int i40 = i39 % 2;
                return;
            }
            int i41 = i7 & 1;
            int i42 = -(-((i7 ^ 1) | i41));
            i7 = ((i42 & i41) << 1) + (i41 ^ i42);
            int i43 = ((i11 ^ 31) | (i11 & 31)) << 1;
            int i44 = -((i11 & (-32)) | ((~i11) & 31));
            int i45 = (i43 & i44) + (i43 | i44);
            b = i45 % 128;
            int i46 = i45 % 2;
        }
    }

    static {
        HashMap map = new HashMap();
        C0278x c0278x = j.a;
        map.put(1, new S(10, c0278x));
        map.put(2, new S(16, c0278x));
        map.put(3, new S(20, c0278x));
        C0278x c0278x2 = j.c;
        map.put(4, new S(10, c0278x2));
        map.put(5, new S(16, c0278x2));
        map.put(6, new S(20, c0278x2));
        C0278x c0278x3 = j.g;
        map.put(7, new S(10, c0278x3));
        map.put(8, new S(16, c0278x3));
        map.put(9, new S(20, c0278x3));
        C0278x c0278x4 = j.h;
        map.put(10, new S(10, c0278x4));
        map.put(11, new S(16, c0278x4));
        S s = new S(20, c0278x4);
        int i = a;
        int i2 = i & 111;
        int i3 = (i | 111) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            map.put(12, s);
            c = Collections.unmodifiableMap(map);
        } else {
            map.put(12, s);
            c = Collections.unmodifiableMap(map);
            throw null;
        }
    }
}
