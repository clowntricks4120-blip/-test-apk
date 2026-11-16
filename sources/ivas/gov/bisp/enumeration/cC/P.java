package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 0;
    private static int b = 1;
    public static Map<String, C0278x> c = new HashMap();
    public static Map<C0278x, String> d = new HashMap();

    static {
        int i = b + 63;
        a = i % 128;
        int i2 = i % 2;
        Map<String, C0278x> map = c;
        C0278x c0278x = j.a;
        map.put("SHA-256", c0278x);
        int i3 = b + 67;
        a = i3 % 128;
        int i4 = i3 % 2;
        Map<String, C0278x> map2 = c;
        C0278x c0278x2 = j.c;
        map2.put("SHA-512", c0278x2);
        int i5 = a;
        int i6 = ((i5 ^ 61) | (i5 & 61)) << 1;
        int i7 = -(((~i5) & 61) | (i5 & (-62)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            c.put("SHAKE128", j.g);
            throw null;
        }
        Map<String, C0278x> map3 = c;
        C0278x c0278x3 = j.g;
        map3.put("SHAKE128", c0278x3);
        Map<String, C0278x> map4 = c;
        C0278x c0278x4 = j.h;
        map4.put("SHAKE256", c0278x4);
        int i9 = a;
        int i10 = ((i9 & 96) + (i9 | 96)) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            d.put(c0278x, "SHA-256");
            throw null;
        }
        d.put(c0278x, "SHA-256");
        Map<C0278x, String> map5 = d;
        int i11 = a;
        int i12 = ((i11 | 3) << 1) - (i11 ^ 3);
        b = i12 % 128;
        int i13 = i12 % 2;
        map5.put(c0278x2, "SHA-512");
        d.put(c0278x3, "SHAKE128");
        if (i13 == 0) {
            int i14 = 22 / 0;
        }
        d.put(c0278x4, "SHAKE256");
        int i15 = b;
        int i16 = ((i15 & 30) + (i15 | 30)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r0 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r4.k(ivas.gov.bisp.enumeration.p056cb.j.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r4 = new ivas.gov.bisp.enumeration.p071cq.p();
        r1 = ivas.gov.bisp.enumeration.cC.P.b;
        r2 = (r1 | 37) << 1;
        r1 = -(r1 ^ 37);
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.cC.P.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if ((r3 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        r0 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r4.k(ivas.gov.bisp.enumeration.p056cb.j.g) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r4 = new ivas.gov.bisp.enumeration.p071cq.z(128);
        r1 = ivas.gov.bisp.enumeration.cC.P.a;
        r2 = (((r1 ^ 55) | (r1 & 55)) << 1) - (((~r1) & 55) | (r1 & (-56)));
        ivas.gov.bisp.enumeration.cC.P.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r4.k(ivas.gov.bisp.enumeration.p056cb.j.h) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r4 = new ivas.gov.bisp.enumeration.p071cq.z(256);
        r1 = ivas.gov.bisp.enumeration.cC.P.b;
        r2 = r1 ^ 53;
        r1 = ((((r1 & 53) | r2) << 1) - (~(-r2))) - 1;
        ivas.gov.bisp.enumeration.cC.P.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("unrecognized digest OID: ");
        r0.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4.k(ivas.gov.bisp.enumeration.p056cb.j.a) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.k(ivas.gov.bisp.enumeration.p056cb.j.a) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = new ivas.gov.bisp.enumeration.p071cq.e();
        r1 = ivas.gov.bisp.enumeration.cC.P.b;
        r3 = r1 & 25;
        r2 = ((((r1 ^ 25) | r3) << 1) - (~(-((r1 | 25) & (~r3))))) - 1;
        ivas.gov.bisp.enumeration.cC.P.a = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p101x.i b(ivas.gov.bisp.enumeration.p063ci.C0278x r4) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.P.b(ivas.gov.bisp.enumeration.ci.x):ivas.gov.bisp.enumeration.x.i");
    }

    public static C0278x c(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-14)) | ((~i2) & 13)) + ((i2 & 13) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        C0278x c0278x = (C0278x) ((HashMap) c).get(str);
        int i5 = b;
        int i6 = i5 & 101;
        int i7 = ((((i5 ^ 101) | i6) << 1) - (~(-((i5 | 101) & (~i6))))) - 1;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (c0278x == null) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r("unrecognized digest name: ", str));
        }
        int i10 = ((i8 | 107) << 1) - (i8 ^ 107);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return c0278x;
        }
        throw null;
    }
}
