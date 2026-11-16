package ivas.gov.bisp.enumeration.p007ag;

import android.graphics.Insets;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 0;
    private static int b = 1;
    public static final c c = new c(0, 0, 0, 0);
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    static {
        int i = a;
        int i2 = i & 121;
        int i3 = -(-(i | 121));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public static c d(Insets insets) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = ((i2 ^ 73) | i3) << 1;
        int i5 = -((i2 | 73) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = insets.left;
        int i9 = insets.top;
        int i10 = insets.right;
        int i11 = a + 54;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        c cVarC = c(i8, i9, i10, insets.bottom);
        int i14 = b;
        int i15 = i14 & 27;
        int i16 = i15 + ((i14 ^ 27) | i15);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return cVarC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Insets e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.d;
        int i7 = this.e;
        int i8 = this.f;
        int i9 = (i4 & 125) + (i4 | 125);
        b = i9 % 128;
        int i10 = i9 % 2;
        Insets insetsOf = Insets.of(i6, i7, i8, this.g);
        int i11 = a;
        int i12 = i11 ^ 65;
        int i13 = ((i11 & 65) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        return insetsOf;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            j.w("Insets{left=").append(this.d);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w("Insets{left=");
        sbW.append(this.d);
        sbW.append(", top=");
        int i4 = this.e;
        int i5 = a + 77;
        b = i5 % 128;
        int i6 = i5 % 2;
        sbW.append(i4);
        sbW.append(", right=");
        int i7 = a;
        int i8 = (i7 & 47) + (i7 | 47);
        b = i8 % 128;
        int i9 = i8 % 2;
        sbW.append(this.f);
        sbW.append(", bottom=");
        int i10 = a;
        int i11 = (-2) - (((i10 & 50) + (i10 | 50)) ^ (-1));
        b = i11 % 128;
        int i12 = i11 % 2;
        sbW.append(this.g);
        int i13 = b + 49;
        a = i13 % 128;
        int i14 = i13 % 2;
        sbW.append('}');
        String string = sbW.toString();
        int i15 = (-2) - ((b + 22) ^ (-1));
        a = i15 % 128;
        int i16 = i15 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r8 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p007ag.c.c;
        r6 = r1 ^ 103;
        r7 = (((r1 & 103) | r6) << 1) - r6;
        ivas.gov.bisp.enumeration.p007ag.c.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p007ag.c c(int r5, int r6, int r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p007ag.c.b
            r2 = r1 & (-18)
            int r3 = ~r1
            r4 = 17
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p007ag.c.a = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L86
            if (r5 != 0) goto L65
            r2 = r1 & 75
            r1 = r1 ^ 75
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p007ag.c.b = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L64
            if (r6 != 0) goto L65
            if (r7 != 0) goto L65
            r2 = r1 ^ 119(0x77, float:1.67E-43)
            r3 = r1 & 119(0x77, float:1.67E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-120(0xffffffffffffff88, float:NaN))
            int r4 = ~r1
            r4 = r4 & 119(0x77, float:1.67E-43)
            r3 = r3 | r4
            int r3 = -r3
            r4 = r2 | r3
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p007ag.c.a = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L52
            r2 = 60
            int r2 = r2 / 0
            if (r8 != 0) goto L65
            goto L54
        L52:
            if (r8 != 0) goto L65
        L54:
            ivas.gov.bisp.enumeration.ag.c r5 = ivas.gov.bisp.enumeration.p007ag.c.c
            r6 = r1 ^ 103(0x67, float:1.44E-43)
            r7 = r1 & 103(0x67, float:1.44E-43)
            r7 = r7 | r6
            int r7 = r7 << 1
            int r7 = r7 - r6
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.p007ag.c.a = r6
            int r7 = r7 % r0
            return r5
        L64:
            throw r3
        L65:
            ivas.gov.bisp.enumeration.ag.c r1 = new ivas.gov.bisp.enumeration.ag.c
            r1.<init>(r5, r6, r7, r8)
            int r5 = ivas.gov.bisp.enumeration.p007ag.c.b
            r6 = r5 ^ 53
            r7 = r5 & 53
            r6 = r6 | r7
            int r6 = r6 << 1
            r7 = r5 & (-54)
            int r5 = ~r5
            r5 = r5 & 53
            r5 = r5 | r7
            int r5 = -r5
            r7 = r6 | r5
            int r7 = r7 << 1
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r5 = r7 % 128
            ivas.gov.bisp.enumeration.p007ag.c.a = r5
            int r7 = r7 % r0
            return r1
        L86:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.c.c(int, int, int, int):ivas.gov.bisp.enumeration.ag.c");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 121;
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.d;
        int i8 = this.e;
        int i9 = this.f;
        int i10 = (((i4 | 64) << 1) - (i4 ^ 64)) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = (i7 % 118) << i8;
            i = (((((i11 ^ (-111)) | (i11 & (-111))) << 1) - (~(-(((~i11) & (-111)) | (i11 & 110))))) - 1) >>> i9;
            i2 = 114;
        } else {
            int i12 = i7 * 31;
            int i13 = i12 ^ i8;
            i = ((((((i12 & i8) | i13) << 1) - i13) * 31) - (~(-(~(-(-i9)))))) - 2;
            i2 = 31;
        }
        int i14 = i4 + 117;
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        int i17 = i * i2;
        int i18 = -(-this.g);
        int i19 = i17 | i18;
        int i20 = i19 << 1;
        int i21 = -((~(i18 & i17)) & i19);
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        int i23 = i15 & 99;
        int i24 = i23 + ((i15 ^ 99) | i23);
        b = i24 % 128;
        int i25 = i24 % 2;
        return i22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r9.g != r10.g) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r9.g != r10.g) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r10 = (r5 | 79) << 1;
        r1 = -(r5 ^ 79);
        r3 = ((r10 | r1) << 1) - (r10 ^ r1);
        ivas.gov.bisp.enumeration.p007ag.c.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if ((r3 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r9.d == r10.d) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        r10 = r5 + 42;
        r1 = (r10 ^ (-1)) + (r10 << 1);
        ivas.gov.bisp.enumeration.p007ag.c.b = r1 % 128;
        r1 = r1 % 2;
        r10 = ((r5 ^ 60) + ((r5 & 60) << 1)) - 1;
        ivas.gov.bisp.enumeration.p007ag.c.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r9.f == r10.f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r10 = (r1 ^ 29) + ((r1 & 29) << 1);
        ivas.gov.bisp.enumeration.p007ag.c.a = r10 % 128;
        r10 = r10 % 2;
        r10 = r1 & 77;
        r10 = r10 + ((r1 ^ 77) | r10);
        ivas.gov.bisp.enumeration.p007ag.c.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        if ((r10 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        if (r9.e == r10.e) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        r10 = (r5 ^ 91) + ((r5 & 91) << 1);
        r1 = r10 % 128;
        ivas.gov.bisp.enumeration.p007ag.c.b = r1;
        r10 = r10 % 2;
        r10 = (r1 & (-22)) | ((~r1) & 21);
        r1 = -(-((r1 & 21) << 1));
        r3 = ((r10 | r1) << 1) - (r10 ^ r1);
        ivas.gov.bisp.enumeration.p007ag.c.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        if ((r3 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0103, code lost:
    
        r1 = r1 + 89;
        ivas.gov.bisp.enumeration.p007ag.c.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if ((r1 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.c.equals(java.lang.Object):boolean");
    }
}
