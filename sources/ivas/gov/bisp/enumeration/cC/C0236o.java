package ivas.gov.bisp.enumeration.cC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236o implements T {
    private static int a = 1;
    private static int b;
    public static final Map<String, C0236o> c;
    public final int d;
    public final String e;

    static {
        HashMap map = new HashMap();
        map.put(c("SHA-256", 32, 16, 67), new C0236o(16777217, "WOTSP_SHA2-256_W16"));
        String strC = c("SHA-512", 64, 16, 131);
        C0236o c0236o = new C0236o(33554434, "WOTSP_SHA2-512_W16");
        int i = a + 37;
        b = i % 128;
        int i2 = i % 2;
        map.put(strC, c0236o);
        map.put(i2 != 0 ? c("SHAKE128", 18, 88, 1) : c("SHAKE128", 32, 16, 67), new C0236o(50331651, "WOTSP_SHAKE128_W16"));
        String strC2 = c("SHAKE256", 64, 16, 131);
        C0236o c0236o2 = new C0236o(67108868, "WOTSP_SHAKE256_W16");
        int i3 = a;
        int i4 = (((i3 ^ 3) | (i3 & 3)) << 1) - (((~i3) & 3) | (i3 & (-4)));
        b = i4 % 128;
        int i5 = i4 % 2;
        map.put(strC2, c0236o2);
        c = Collections.unmodifiableMap(map);
        int i6 = a + 119;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0236o(int i, String str) {
        this.d = i;
        this.e = str;
    }

    public static String c(String str, int i, int i2, int i3) {
        int i4 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i5 = b;
        int i6 = i5 & 99;
        int i7 = (i5 ^ 99) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        sb.append("-");
        sb.append(i);
        int i10 = b;
        int i11 = i10 & 73;
        int i12 = i11 + ((i10 ^ 73) | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        sb.append("-");
        sb.append(i2);
        sb.append("-");
        int i14 = b;
        int i15 = i14 & 17;
        int i16 = -(-((i14 ^ 17) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        int i18 = i17 % 2;
        sb.append(i3);
        if (i18 == 0) {
            sb.toString();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = sb.toString();
        int i19 = b;
        int i20 = i19 & 91;
        int i21 = ((i19 ^ 91) | i20) << 1;
        int i22 = -((i19 | 91) & (~i20));
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.cC.T
    public final int b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 3) + (i2 | 3);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d;
        int i6 = i2 | 95;
        int i7 = (i6 << 1) - ((~(i2 & 95)) & i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-76)) | ((~i2) & 75)) + ((i2 & 75) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.e;
        int i5 = i2 + 35;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
