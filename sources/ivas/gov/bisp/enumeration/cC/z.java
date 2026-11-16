package ivas.gov.bisp.enumeration.cC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements T {
    private static int a = 0;
    private static int b = 1;
    public static final Map<String, z> c;
    public final int d;
    public final String e;

    static {
        HashMap map = new HashMap();
        map.put(c("SHA-256", 32, 16, 67, 10), new z(1, "XMSS_SHA2_10_256"));
        map.put(c("SHA-256", 32, 16, 67, 16), new z(2, "XMSS_SHA2_16_256"));
        map.put(c("SHA-256", 32, 16, 67, 20), new z(3, "XMSS_SHA2_20_256"));
        map.put(c("SHA-512", 64, 16, 131, 10), new z(4, "XMSS_SHA2_10_512"));
        map.put(c("SHA-512", 64, 16, 131, 16), new z(5, "XMSS_SHA2_16_512"));
        map.put(c("SHA-512", 64, 16, 131, 20), new z(6, "XMSS_SHA2_20_512"));
        map.put(c("SHAKE128", 32, 16, 67, 10), new z(7, "XMSS_SHAKE_10_256"));
        map.put(c("SHAKE128", 32, 16, 67, 16), new z(8, "XMSS_SHAKE_16_256"));
        map.put(c("SHAKE128", 32, 16, 67, 20), new z(9, "XMSS_SHAKE_20_256"));
        map.put(c("SHAKE256", 64, 16, 131, 10), new z(10, "XMSS_SHAKE_10_512"));
        map.put(c("SHAKE256", 64, 16, 131, 16), new z(11, "XMSS_SHAKE_16_512"));
        map.put(c("SHAKE256", 64, 16, 131, 20), new z(12, "XMSS_SHAKE_20_512"));
        c = Collections.unmodifiableMap(map);
        int i = b;
        int i2 = (i & (-126)) | ((~i) & 125);
        int i3 = -(-((i & 125) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public z(int i, String str) {
        this.d = i;
        this.e = str;
    }

    public static String c(String str, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i6 = a;
        int i7 = i6 & 47;
        int i8 = -(-((i6 ^ 47) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        sb.append("-");
        sb.append(i);
        if (i10 == 0) {
            throw null;
        }
        int i11 = a;
        int i12 = ((i11 | 77) << 1) - (i11 ^ 77);
        b = i12 % 128;
        int i13 = i12 % 2;
        sb.append("-");
        sb.append(i2);
        if (i13 == 0) {
            throw null;
        }
        int i14 = a;
        int i15 = ((i14 | 112) << 1) - (i14 ^ 112);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        sb.append("-");
        sb.append(i3);
        if (i17 == 0) {
            throw null;
        }
        sb.append("-");
        sb.append(i4);
        int i18 = a;
        int i19 = (i18 ^ 19) + ((i18 & 19) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        String string = sb.toString();
        int i21 = a;
        int i22 = i21 & 61;
        int i23 = -(-((i21 ^ 61) | i22));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.cC.T
    public final int b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 71) - (~(-(-((i2 & 71) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d;
        int i6 = i2 + 21;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 65 / 0;
        }
        return i5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = -(-((i2 ^ 65) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
