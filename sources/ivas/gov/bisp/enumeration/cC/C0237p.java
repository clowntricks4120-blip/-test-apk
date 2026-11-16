package ivas.gov.bisp.enumeration.cC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237p implements T {
    private static int a = 1;
    private static int b;
    public static final Map<String, C0237p> c;
    public final int d;
    public final String e;

    static {
        HashMap map = new HashMap();
        ivas.gov.bisp.enumeration.bD.T.g(1, "XMSSMT_SHA2_20/2_256", map, c("SHA-256", 32, 16, 67, 20, 2));
        ivas.gov.bisp.enumeration.bD.T.g(2, "XMSSMT_SHA2_20/4_256", map, c("SHA-256", 32, 16, 67, 20, 4));
        ivas.gov.bisp.enumeration.bD.T.g(3, "XMSSMT_SHA2_40/2_256", map, c("SHA-256", 32, 16, 67, 40, 2));
        ivas.gov.bisp.enumeration.bD.T.g(4, "XMSSMT_SHA2_40/4_256", map, c("SHA-256", 32, 16, 67, 40, 2));
        int i = a + 69;
        b = i % 128;
        int i2 = i % 2;
        ivas.gov.bisp.enumeration.bD.T.g(5, "XMSSMT_SHA2_40/8_256", map, c("SHA-256", 32, 16, 67, 40, 4));
        ivas.gov.bisp.enumeration.bD.T.g(6, "XMSSMT_SHA2_60/3_256", map, c("SHA-256", 32, 16, 67, 60, 8));
        ivas.gov.bisp.enumeration.bD.T.g(7, "XMSSMT_SHA2_60/6_256", map, c("SHA-256", 32, 16, 67, 60, 6));
        ivas.gov.bisp.enumeration.bD.T.g(8, "XMSSMT_SHA2_60/12_256", map, c("SHA-256", 32, 16, 67, 60, 12));
        int i3 = a;
        int i4 = (i3 & (-118)) | ((~i3) & 117);
        int i5 = -(-((i3 & 117) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.bD.T.g(9, "XMSSMT_SHA2_20/2_512", map, c("SHA-512", 64, 16, 131, 20, 2));
        ivas.gov.bisp.enumeration.bD.T.g(10, "XMSSMT_SHA2_20/4_512", map, c("SHA-512", 64, 16, 131, 20, 4));
        ivas.gov.bisp.enumeration.bD.T.g(11, "XMSSMT_SHA2_40/2_512", map, c("SHA-512", 64, 16, 131, 40, 2));
        ivas.gov.bisp.enumeration.bD.T.g(12, "XMSSMT_SHA2_40/4_512", map, c("SHA-512", 64, 16, 131, 40, 4));
        int i8 = a;
        int i9 = (i8 & 115) + (i8 | 115);
        b = i9 % 128;
        int i10 = i9 % 2;
        ivas.gov.bisp.enumeration.bD.T.g(13, "XMSSMT_SHA2_40/8_512", map, c("SHA-512", 64, 16, 131, 40, 8));
        ivas.gov.bisp.enumeration.bD.T.g(14, "XMSSMT_SHA2_60/3_512", map, c("SHA-512", 64, 16, 131, 60, 3));
        ivas.gov.bisp.enumeration.bD.T.g(15, "XMSSMT_SHA2_60/6_512", map, c("SHA-512", 64, 16, 131, 60, 6));
        ivas.gov.bisp.enumeration.bD.T.g(16, "XMSSMT_SHA2_60/12_512", map, c("SHA-512", 64, 16, 131, 60, 12));
        int i11 = a;
        int i12 = i11 & 31;
        int i13 = ((i11 ^ 31) | i12) << 1;
        int i14 = -((i11 | 31) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        ivas.gov.bisp.enumeration.bD.T.g(17, "XMSSMT_SHAKE_20/2_256", map, c("SHAKE128", 32, 16, 67, 20, 2));
        ivas.gov.bisp.enumeration.bD.T.g(18, "XMSSMT_SHAKE_20/4_256", map, c("SHAKE128", 32, 16, 67, 20, 4));
        ivas.gov.bisp.enumeration.bD.T.g(19, "XMSSMT_SHAKE_40/2_256", map, c("SHAKE128", 32, 16, 67, 40, 2));
        ivas.gov.bisp.enumeration.bD.T.g(20, "XMSSMT_SHAKE_40/4_256", map, c("SHAKE128", 32, 16, 67, 40, 4));
        int i17 = a;
        int i18 = ((i17 ^ 110) + ((i17 & 110) << 1)) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        ivas.gov.bisp.enumeration.bD.T.g(21, "XMSSMT_SHAKE_40/8_256", map, c("SHAKE128", 32, 16, 67, 40, 8));
        ivas.gov.bisp.enumeration.bD.T.g(22, "XMSSMT_SHAKE_60/3_256", map, c("SHAKE128", 32, 16, 67, 60, 3));
        ivas.gov.bisp.enumeration.bD.T.g(23, "XMSSMT_SHAKE_60/6_256", map, c("SHAKE128", 32, 16, 67, 60, 6));
        ivas.gov.bisp.enumeration.bD.T.g(24, "XMSSMT_SHAKE_60/12_256", map, c("SHAKE128", 32, 16, 67, 60, 12));
        String strC = c("SHAKE256", 64, 16, 131, 20, 2);
        int i20 = a;
        int i21 = (i20 & (-54)) | ((~i20) & 53);
        int i22 = (i20 & 53) << 1;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        ivas.gov.bisp.enumeration.bD.T.g(25, "XMSSMT_SHAKE_20/2_512", map, strC);
        ivas.gov.bisp.enumeration.bD.T.g(26, "XMSSMT_SHAKE_20/4_512", map, c("SHAKE256", 64, 16, 131, 20, 4));
        ivas.gov.bisp.enumeration.bD.T.g(27, "XMSSMT_SHAKE_40/2_512", map, c("SHAKE256", 64, 16, 131, 40, 2));
        ivas.gov.bisp.enumeration.bD.T.g(28, "XMSSMT_SHAKE_40/4_512", map, c("SHAKE256", 64, 16, 131, 40, 4));
        ivas.gov.bisp.enumeration.bD.T.g(29, "XMSSMT_SHAKE_40/8_512", map, c("SHAKE256", 64, 16, 131, 40, 8));
        ivas.gov.bisp.enumeration.bD.T.g(30, "XMSSMT_SHAKE_60/3_512", map, c("SHAKE256", 64, 16, 131, 60, 3));
        ivas.gov.bisp.enumeration.bD.T.g(31, "XMSSMT_SHAKE_60/6_512", map, c("SHAKE256", 64, 16, 131, 60, 6));
        map.put(c("SHAKE256", 64, 16, 131, 60, 12), new C0237p(32, "XMSSMT_SHAKE_60/12_512"));
        c = Collections.unmodifiableMap(map);
        int i25 = a;
        int i26 = i25 | 93;
        int i27 = i26 << 1;
        int i28 = -((~(i25 & 93)) & i26);
        int i29 = (i27 & i28) + (i28 | i27);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            throw null;
        }
    }

    public C0237p(int i, String str) {
        this.d = i;
        this.e = str;
    }

    public static String c(String str, int i, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i7 = b + 95;
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        sb.append("-");
        sb.append(i);
        if (i8 == 0) {
            obj.hashCode();
            throw null;
        }
        int i9 = b;
        int i10 = (i9 & 35) + (i9 | 35);
        a = i10 % 128;
        int i11 = i10 % 2;
        sb.append("-");
        sb.append(i2);
        sb.append("-");
        int i12 = b;
        int i13 = i12 & 1;
        int i14 = i13 + ((i12 ^ 1) | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        sb.append(i3);
        sb.append("-");
        int i16 = b;
        int i17 = i16 & 125;
        int i18 = (i16 ^ 125) | i17;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        sb.append(i4);
        sb.append("-");
        if (i20 == 0) {
            int i21 = 75 / 0;
        }
        int i22 = a;
        int i23 = ((i22 | 77) << 1) - (i22 ^ 77);
        b = i23 % 128;
        int i24 = i23 % 2;
        sb.append(i5);
        String string = sb.toString();
        int i25 = b;
        int i26 = i25 & 105;
        int i27 = i25 | 105;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        if (i28 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cC.T
    public final int b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 77;
        int i4 = ((i2 & 77) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.d;
        if (i7 == 0) {
            int i9 = 73 / 0;
        }
        return i8;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b + 45;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
