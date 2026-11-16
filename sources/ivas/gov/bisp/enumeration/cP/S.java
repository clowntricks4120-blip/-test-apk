package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class S implements Serializable {
    private static int a = 1;
    private static int b;
    public static S c;
    public static S d;
    public static S e;
    public final String f;
    public final x[] g;

    static {
        new HashMap(32);
        int i = a;
        int i2 = (i & 107) + (i | 107);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public S(String str, x[] xVarArr, int[] iArr) {
        this.f = str;
        this.g = xVarArr;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (((i2 | 107) & (~i3)) - (~(i3 << 1))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 | 97) << 1) - (i5 ^ 97);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int iHashCode = 0;
        while (true) {
            x[] xVarArr = this.g;
            if (i9 >= xVarArr.length) {
                int i10 = a;
                int i11 = i10 & 57;
                int i12 = -(-((i10 ^ 57) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                return iHashCode;
            }
            int i15 = a;
            int i16 = i15 & 39;
            int i17 = (i15 | 39) & (~i16);
            int i18 = i16 << 1;
            int i19 = (i17 & i18) + (i17 | i18);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                iHashCode <<= xVarArr[i9].hashCode();
                int i20 = (i9 ^ 15) + ((i9 & 15) << 1);
                i9 = (i20 ^ (-7)) + ((i20 & (-7)) << 1);
            } else {
                int i21 = -(~(-(-xVarArr[i9].hashCode())));
                int i22 = ((iHashCode ^ i21) + ((iHashCode & i21) << 1)) - 1;
                int i23 = i9 & 1;
                int i24 = ((i9 ^ 1) | i23) << 1;
                int i25 = -((i9 | 1) & (~i23));
                i9 = ((i24 | i25) << 1) - (i25 ^ i24);
                iHashCode = i22;
            }
            int i26 = b + 121;
            a = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    public static S c() {
        x[] xVarArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = ((i2 | 7) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        S s = d;
        if (s == null) {
            int i6 = i5 + 115;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                xVarArr = new x[0];
                xVarArr[0] = x.c;
            } else {
                xVarArr = new x[]{x.c};
            }
            S s2 = new S("Days", xVarArr, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
            int i7 = b;
            int i8 = ((i7 | 27) << 1) - (i7 ^ 27);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                d = s2;
                int i10 = 91 / 0;
            } else {
                d = s2;
            }
            int i11 = i9 & 9;
            int i12 = ((i9 ^ 9) | i11) << 1;
            int i13 = -((i9 | 9) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            s = s2;
        }
        int i16 = a;
        int i17 = (((i16 | 36) << 1) - (i16 ^ 36)) - 1;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 27 / 0;
        }
        return s;
    }

    public static S d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 40;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        S s = e;
        if (s == null) {
            int i6 = ((i2 | 58) << 1) - (i2 ^ 58);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            S s2 = new S("Months", i7 % 2 == 0 ? new x[]{x.h} : new x[]{x.h}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
            int i8 = a;
            int i9 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            e = s2;
            int i12 = (i10 ^ 121) + ((i10 & 121) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            s = s2;
        }
        int i14 = b;
        int i15 = ((i14 | 9) << 1) - (i14 ^ 9);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 43 / 0;
        }
        return s;
    }

    public static S e() {
        int i = 2 % 2;
        int i2 = a + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        S s = c;
        if (s == null) {
            S s2 = new S("Years", new x[]{x.f}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
            int i4 = b;
            int i5 = i4 & 87;
            int i6 = -(-((i4 ^ 87) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            c = s2;
            int i10 = ((i8 ^ 79) | (i8 & 79)) << 1;
            int i11 = -(((~i8) & 79) | (i8 & (-80)));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            s = s2;
        }
        int i14 = a;
        int i15 = i14 & 103;
        int i16 = (i14 ^ 103) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ((r7 instanceof ivas.gov.bisp.enumeration.cP.S) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r7 = ((r1 & 16) + (r1 | 16)) - 1;
        r1 = r7 % 128;
        ivas.gov.bisp.enumeration.cP.S.b = r1;
        r7 = r7 % 2;
        r7 = r1 ^ 85;
        r1 = (r1 & 85) << 1;
        r2 = ((r7 | r1) << 1) - (r7 ^ r1);
        ivas.gov.bisp.enumeration.cP.S.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r2 = r6.g;
        r7 = ((ivas.gov.bisp.enumeration.cP.S) r7).g;
        r3 = ((r1 | 9) << 1) - (r1 ^ 9);
        ivas.gov.bisp.enumeration.cP.S.b = r3 % 128;
        r3 = r3 % 2;
        r7 = java.util.Arrays.equals(r2, r7);
        r1 = ivas.gov.bisp.enumeration.cP.S.b + 91;
        ivas.gov.bisp.enumeration.cP.S.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r7 = r2 & 105;
        r1 = (~r7) & (r2 | 105);
        r7 = -(-(r7 << 1));
        r2 = ((r1 | r7) << 1) - (r7 ^ r1);
        ivas.gov.bisp.enumeration.cP.S.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cP.S.a
            r2 = r1 & 123(0x7b, float:1.72E-43)
            r3 = r1 ^ 123(0x7b, float:1.72E-43)
            r3 = r3 | r2
            r4 = r2 & r3
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.cP.S.b = r2
            int r4 = r4 % r0
            r3 = 0
            r5 = 1
            if (r4 == 0) goto L1d
            r4 = 63
            int r4 = r4 / r3
            if (r6 != r7) goto L37
            goto L1f
        L1d:
            if (r6 != r7) goto L37
        L1f:
            r7 = r2 & 105(0x69, float:1.47E-43)
            int r1 = ~r7
            r2 = r2 | 105(0x69, float:1.47E-43)
            r1 = r1 & r2
            int r7 = r7 << r5
            int r7 = -r7
            int r7 = -r7
            r2 = r1 | r7
            int r2 = r2 << r5
            r7 = r7 ^ r1
            int r2 = r2 - r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.cP.S.a = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L35
            goto L36
        L35:
            r3 = r5
        L36:
            return r3
        L37:
            boolean r2 = r7 instanceof ivas.gov.bisp.enumeration.cP.S
            if (r2 != 0) goto L57
            r7 = r1 & 16
            r1 = r1 | 16
            int r7 = r7 + r1
            int r7 = r7 + (-1)
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.cP.S.b = r1
            int r7 = r7 % r0
            r7 = r1 ^ 85
            r1 = r1 & 85
            int r1 = r1 << r5
            r2 = r7 | r1
            int r2 = r2 << r5
            r7 = r7 ^ r1
            int r2 = r2 - r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.cP.S.a = r7
            int r2 = r2 % r0
            return r3
        L57:
            ivas.gov.bisp.enumeration.cP.S r7 = (ivas.gov.bisp.enumeration.cP.S) r7
            ivas.gov.bisp.enumeration.cP.x[] r2 = r6.g
            ivas.gov.bisp.enumeration.cP.x[] r7 = r7.g
            r3 = r1 | 9
            int r3 = r3 << r5
            r1 = r1 ^ 9
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cP.S.b = r1
            int r3 = r3 % r0
            boolean r7 = java.util.Arrays.equals(r2, r7)
            int r1 = ivas.gov.bisp.enumeration.cP.S.b
            int r1 = r1 + 91
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cP.S.a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L78
            return r7
        L78:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cP.S.equals(java.lang.Object):boolean");
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 18) << 1) - (i2 ^ 18)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.w("PeriodType[");
            throw null;
        }
        StringBuilder sbW = j.w("PeriodType[");
        String str = this.f;
        int i4 = b + 17;
        a = i4 % 128;
        int i5 = i4 % 2;
        String strU = j.u(sbW, str, "]");
        if (i5 == 0) {
            int i6 = 82 / 0;
        }
        return strU;
    }
}
