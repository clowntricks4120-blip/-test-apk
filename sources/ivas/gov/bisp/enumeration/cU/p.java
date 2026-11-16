package ivas.gov.bisp.enumeration.cU;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements i {
    private static int a = 1;
    private static int b;
    public static final Set<String> c = Collections.singleton("UTC");

    static {
        int i = b;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cU.i
    public final Set<String> e() {
        Set<String> set;
        int i = 2 % 2;
        int i2 = (-2) - ((a + 106) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            set = c;
            int i4 = 50 / 0;
        } else {
            set = c;
        }
        int i5 = (i3 | 123) << 1;
        int i6 = -(((~i3) & 123) | (i3 & (-124)));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 41 / 0;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return ivas.gov.bisp.enumeration.cP.AbstractC0242a.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r7 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.c;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r7 = ivas.gov.bisp.enumeration.cU.p.a;
        r1 = (r7 & (-110)) | ((~r7) & 109);
        r7 = (r7 & 109) << 1;
        r2 = (r1 ^ r7) + ((r7 & r1) << 1);
        ivas.gov.bisp.enumeration.cU.p.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if ((!r7) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r7 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r7 = ivas.gov.bisp.enumeration.cU.p.a;
        r1 = r7 & 39;
        r7 = (r7 | 39) & (~r1);
        r1 = r1 << 1;
        r2 = (r7 & r1) + (r7 | r1);
        ivas.gov.bisp.enumeration.cU.p.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    @Override // ivas.gov.bisp.enumeration.cU.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.cP.AbstractC0242a b(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cU.p.a
            r2 = r1 ^ 84
            r1 = r1 & 84
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cU.p.b = r1
            int r2 = r2 % r0
            java.lang.String r1 = "UTC"
            r4 = 0
            boolean r7 = r1.equalsIgnoreCase(r7)
            if (r2 == 0) goto L24
            r1 = 19
            int r1 = r1 / 0
            r7 = r7 ^ r3
            if (r7 == r3) goto L43
            goto L26
        L24:
            if (r7 == 0) goto L43
        L26:
            int r7 = ivas.gov.bisp.enumeration.cU.p.a
            r1 = r7 & 39
            int r2 = ~r1
            r7 = r7 | 39
            r7 = r7 & r2
            int r1 = r1 << r3
            r2 = r7 & r1
            r7 = r7 | r1
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.cU.p.b = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L3d
            ivas.gov.bisp.enumeration.cP.a r7 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.c
            return r7
        L3d:
            ivas.gov.bisp.enumeration.cP.a r7 = ivas.gov.bisp.enumeration.cP.AbstractC0242a.c
            r4.hashCode()
            throw r4
        L43:
            int r7 = ivas.gov.bisp.enumeration.cU.p.a
            r1 = r7 & (-110(0xffffffffffffff92, float:NaN))
            int r2 = ~r7
            r5 = 109(0x6d, float:1.53E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            r7 = r7 & r5
            int r7 = r7 << r3
            r2 = r1 ^ r7
            r7 = r7 & r1
            int r7 = r7 << r3
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.cU.p.b = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L5b
            return r4
        L5b:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cU.p.b(java.lang.String):ivas.gov.bisp.enumeration.cP.a");
    }
}
