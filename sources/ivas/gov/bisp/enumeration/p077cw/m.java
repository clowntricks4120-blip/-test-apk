package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p071cq.e;
import ivas.gov.bisp.enumeration.p071cq.p;
import ivas.gov.bisp.enumeration.p071cq.z;
import ivas.gov.bisp.enumeration.p101x.i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m {
    private static int a = 1;
    private static int b;
    public static Map<String, C0278x> c = new HashMap();
    public static Map<C0278x, String> d = new HashMap();

    static {
        int i = b;
        int i2 = (i & (-30)) | ((~i) & 29);
        int i3 = (i & 29) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            c.put("SHA-256", j.a);
            obj.hashCode();
            throw null;
        }
        Map<String, C0278x> map = c;
        C0278x c0278x = j.a;
        map.put("SHA-256", c0278x);
        Map<String, C0278x> map2 = c;
        C0278x c0278x2 = j.c;
        map2.put("SHA-512", c0278x2);
        int i5 = b + 53;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            c.put("SHAKE128", j.g);
            throw null;
        }
        Map<String, C0278x> map3 = c;
        C0278x c0278x3 = j.g;
        map3.put("SHAKE128", c0278x3);
        int i6 = b;
        int i7 = i6 & 87;
        int i8 = (((i6 | 87) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        Map<String, C0278x> map4 = c;
        C0278x c0278x4 = j.h;
        map4.put("SHAKE256", c0278x4);
        int i10 = a;
        int i11 = ((i10 ^ 53) | (i10 & 53)) << 1;
        int i12 = -(((~i10) & 53) | (i10 & (-54)));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        d.put(c0278x, "SHA-256");
        Map<C0278x, String> map5 = d;
        int i15 = a;
        int i16 = i15 ^ 23;
        int i17 = -(-((i15 & 23) << 1));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        map5.put(c0278x2, "SHA-512");
        d.put(c0278x3, "SHAKE128");
        if (i19 != 0) {
            obj.hashCode();
            throw null;
        }
        int i20 = a;
        int i21 = i20 ^ 33;
        int i22 = -(-((i20 & 33) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        d.put(c0278x4, "SHAKE256");
        if (i24 != 0) {
            obj.hashCode();
            throw null;
        }
        int i25 = b;
        int i26 = (((i25 | 70) << 1) - (i25 ^ 70)) - 1;
        a = i26 % 128;
        if (i26 % 2 == 0) {
            throw null;
        }
    }

    public static i b(C0278x c0278x) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-4)) | ((~i2) & 3)) + ((i2 & 3) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            c0278x.k(j.a);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (c0278x.k(j.a)) {
            e eVar = new e();
            int i4 = b + 61;
            a = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }
        if (c0278x.k(j.c)) {
            p pVar = new p();
            int i6 = a;
            int i7 = i6 & 103;
            int i8 = (i6 | 103) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return pVar;
        }
        if (c0278x.k(j.g)) {
            z zVar = new z(128);
            int i12 = a;
            int i13 = i12 ^ 55;
            int i14 = ((i12 & 55) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 57 / 0;
            }
            return zVar;
        }
        if (!c0278x.k(j.h)) {
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized digest OID: ");
            sb.append(c0278x);
            throw new IllegalArgumentException(sb.toString());
        }
        z zVar2 = new z(256);
        int i18 = b;
        int i19 = i18 & 27;
        int i20 = -(-((i18 ^ 27) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        return zVar2;
    }
}
