package ivas.gov.bisp.enumeration.bL;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class aE<A, B> implements Serializable {
    private static int a = 1;
    private static int b;
    public final A c;
    public final B d;

    public aE(A a2, B b2) {
        this.c = a2;
        this.d = b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if ((!ivas.gov.bisp.enumeration.O.r.f(r4, r6)) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (ivas.gov.bisp.enumeration.O.r.f(r8.d, r9.d) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bL.aE.b;
        r1 = (((r9 ^ 91) | (r9 & 91)) << 1) - (((~r9) & 91) | (r9 & (-92)));
        ivas.gov.bisp.enumeration.bL.aE.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bL.aE.b;
        r1 = r9 & 9;
        r1 = (r1 - (~(-(-((r9 ^ 9) | r1))))) - 1;
        r9 = r1 % 128;
        ivas.gov.bisp.enumeration.bL.aE.a = r9;
        r1 = r1 % 2;
        r1 = r9 & 49;
        r9 = -(-(r9 | 49));
        r2 = (r1 & r9) + (r9 | r1);
        ivas.gov.bisp.enumeration.bL.aE.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r9 = ivas.gov.bisp.enumeration.bL.aE.b;
        r1 = r9 & 119;
        r1 = r1 + ((r9 ^ 119) | r1);
        ivas.gov.bisp.enumeration.bL.aE.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if ((r1 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.bL.aE.a
            r2 = r1 & 113(0x71, float:1.58E-43)
            r1 = r1 | 113(0x71, float:1.58E-43)
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.bL.aE.b = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto Lb4
            r2 = 1
            if (r8 != r9) goto L26
            r9 = r1 | 17
            int r9 = r9 << r2
            r3 = r1 & (-18)
            int r1 = ~r1
            r4 = 17
            r1 = r1 & r4
            r1 = r1 | r3
            int r9 = r9 - r1
            int r1 = r9 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r1
            int r9 = r9 % r0
            return r2
        L26:
            boolean r4 = r9 instanceof ivas.gov.bisp.enumeration.bL.aE
            r5 = 0
            if (r4 != 0) goto L40
            r9 = r1 & 81
            r1 = r1 ^ 81
            r1 = r1 | r9
            int r1 = ~r1
            int r9 = r9 - r1
            int r9 = r9 - r2
            int r1 = r9 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r1
            int r9 = r9 % r0
            int r1 = r1 + 55
            int r9 = r1 % 128
            ivas.gov.bisp.enumeration.bL.aE.b = r9
            int r1 = r1 % r0
            return r5
        L40:
            ivas.gov.bisp.enumeration.bL.aE r9 = (ivas.gov.bisp.enumeration.bL.aE) r9
            A r4 = r8.c
            A r6 = r9.c
            int r1 = r1 + 87
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r7
            int r1 = r1 % r0
            if (r1 != 0) goto L59
            boolean r1 = ivas.gov.bisp.enumeration.O.r.f(r4, r6)
            r4 = 23
            int r4 = r4 / r5
            if (r1 == 0) goto La0
            goto L60
        L59:
            boolean r1 = ivas.gov.bisp.enumeration.O.r.f(r4, r6)
            r1 = r1 ^ r2
            if (r1 == r2) goto La0
        L60:
            B r1 = r8.d
            B r9 = r9.d
            boolean r9 = ivas.gov.bisp.enumeration.O.r.f(r1, r9)
            if (r9 == 0) goto L7f
            int r9 = ivas.gov.bisp.enumeration.bL.aE.b
            r1 = r9 ^ 91
            r3 = r9 & 91
            r1 = r1 | r3
            int r1 = r1 << r2
            r3 = r9 & (-92)
            int r9 = ~r9
            r9 = r9 & 91
            r9 = r9 | r3
            int r1 = r1 - r9
            int r9 = r1 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r9
            int r1 = r1 % r0
            return r2
        L7f:
            int r9 = ivas.gov.bisp.enumeration.bL.aE.b
            r1 = r9 & 9
            r9 = r9 ^ 9
            r9 = r9 | r1
            int r9 = -r9
            int r9 = -r9
            int r9 = ~r9
            int r1 = r1 - r9
            int r1 = r1 - r2
            int r9 = r1 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r9
            int r1 = r1 % r0
            r1 = r9 & 49
            r9 = r9 | 49
            int r9 = -r9
            int r9 = -r9
            r2 = r1 & r9
            r9 = r9 | r1
            int r2 = r2 + r9
            int r9 = r2 % 128
            ivas.gov.bisp.enumeration.bL.aE.b = r9
            int r2 = r2 % r0
            return r5
        La0:
            int r9 = ivas.gov.bisp.enumeration.bL.aE.b
            r1 = r9 & 119(0x77, float:1.67E-43)
            r9 = r9 ^ 119(0x77, float:1.67E-43)
            r9 = r9 | r1
            int r1 = r1 + r9
            int r9 = r1 % 128
            ivas.gov.bisp.enumeration.bL.aE.a = r9
            int r1 = r1 % r0
            if (r1 == 0) goto Lb0
            return r5
        Lb0:
            r3.hashCode()
            throw r3
        Lb4:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bL.aE.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    public final int hashCode() {
        A a2;
        int i;
        int i2;
        int iHashCode;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 + 109;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            a2 = this.c;
            if (a2 == null) {
                i2 = 1;
                int i7 = (i5 & (-84)) | ((~i5) & 83);
                int i8 = (i5 & 83) << 1;
                i3 = (i7 & i8) + (i7 | i8);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    iHashCode = 1;
                } else {
                    iHashCode = 0;
                }
                int i9 = i5 & 31;
                int i10 = (i5 | 31) & (~i9);
                int i11 = -(-(i9 << 1));
                int i12 = (i10 & i11) + (i10 | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
            } else {
                i = 1;
                iHashCode = a2.hashCode();
                int i14 = a + 25;
                b = i14 % 128;
                int i15 = i14 % 2;
                i2 = i;
            }
        } else {
            a2 = this.c;
            if (a2 == null) {
                i2 = 0;
                int i16 = (i5 & (-84)) | ((~i5) & 83);
                int i17 = (i5 & 83) << 1;
                i3 = (i16 & i17) + (i16 | i17);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    iHashCode = 1;
                } else {
                    iHashCode = 0;
                }
                int i18 = i5 & 31;
                int i19 = (i5 | 31) & (~i18);
                int i110 = -(-(i18 << 1));
                int i111 = (i19 & i110) + (i19 | i110);
                b = i111 % 128;
                int i112 = i111 % 2;
            } else {
                i = 0;
                iHashCode = a2.hashCode();
                int i113 = a + 25;
                b = i113 % 128;
                int i114 = i113 % 2;
                i2 = i;
            }
        }
        B b2 = this.d;
        if (b2 != null) {
            int i20 = a;
            int i21 = i20 & 51;
            int i22 = -(-((i20 ^ 51) | i21));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            int iHashCode2 = b2.hashCode();
            if (i24 != 0) {
                int i25 = 83 / 0;
            }
            i2 = iHashCode2;
        }
        int i26 = (iHashCode * 31) + i2;
        int i27 = b;
        int i28 = i27 & 125;
        int i29 = (i27 | 125) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        a = i31 % 128;
        int i32 = i31 % 2;
        return i26;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        int i2 = a;
        int i3 = ((i2 ^ 25) | (i2 & 25)) << 1;
        int i4 = -(((~i2) & 25) | (i2 & (-26)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        sb.append(this.c);
        if (i6 != 0) {
            int i7 = 37 / 0;
        }
        sb.append(", ");
        sb.append(this.d);
        int i8 = b;
        int i9 = i8 ^ 53;
        int i10 = ((i8 & 53) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        sb.append(i12 % 2 == 0 ? '9' : ')');
        String string = sb.toString();
        int i13 = b;
        int i14 = i13 & 33;
        int i15 = ((((i13 ^ 33) | i14) << 1) - (~(-((i13 | 33) & (~i14))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return string;
    }
}
