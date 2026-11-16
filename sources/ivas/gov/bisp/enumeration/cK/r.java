package ivas.gov.bisp.enumeration.cK;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p003ac.P;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 1;
    private static int b;
    public int[] c;

    public byte[] c() {
        int i;
        int length;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((i3 + 60) ^ (-1));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            length = this.c.length;
            i = length;
        } else {
            int length2 = this.c.length;
            int i5 = -(-((length2 ^ (-1)) | length2));
            int i6 = (i5 | length2) + (length2 & i5);
            i = length2;
            length = i6;
        }
        int i7 = i3 & 97;
        int i8 = (i3 | 97) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        int iB = h.b(length);
        int i12 = i * iB;
        int i13 = a;
        int i14 = ((i13 ^ 19) | (i13 & 19)) << 1;
        int i15 = -(((~i13) & 19) | (i13 & (-20)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        int i19 = i12 & 4;
        byte[] bArr = new byte[((((i12 ^ 4) | i19) << 1) - (~(-((i12 | 4) & (~i19))))) - 1];
        int i20 = i17 ^ 63;
        int i21 = (((i17 & 63) | i20) << 1) - i20;
        a = i21 % 128;
        int i22 = 0;
        if (i21 % 2 == 0) {
            i.e(i, bArr, 1);
        } else {
            i.e(i, bArr, 0);
        }
        while (i22 < i) {
            int i23 = b;
            int i24 = (i23 ^ 33) + ((i23 & 33) << 1);
            int i25 = i24 % 128;
            a = i25;
            int i26 = i24 % 2;
            int i27 = this.c[i22];
            int i28 = (((i25 & (-54)) | ((~i25) & 53)) - (~(-(-((i25 & 53) << 1))))) - 1;
            int i29 = i28 % 128;
            b = i29;
            int i30 = i28 % 2;
            int i31 = iB - 1;
            int i32 = i29 & 5;
            int i33 = (i29 | 5) & (~i32);
            int i34 = i32 << 1;
            int i35 = (i33 & i34) + (i33 | i34);
            a = i35 % 128;
            int i36 = i35 % 2;
            while (i31 >= 0) {
                int i37 = b;
                int i38 = (i37 ^ 11) + ((i37 & 11) << 1);
                int i39 = i38 % 128;
                a = i39;
                int i40 = i38 % 2;
                int i41 = i22 * iB;
                int i42 = (i39 ^ 93) + ((i39 & 93) << 1);
                int i43 = i42 % 128;
                b = i43;
                int i44 = i42 % 2;
                int i45 = i41 & 4;
                bArr[(-2) - ((((i45 - (~((i41 ^ 4) | i45))) - 1) - (~(-(-i31)))) ^ (-1))] = (byte) (i27 >>> (i31 * 8));
                int i46 = ~i31;
                int i47 = i31 << 1;
                i31 = (i47 | i46) + (i46 & i47);
                int i48 = i43 ^ 99;
                int i49 = ((i43 & 99) | i48) << 1;
                int i50 = -i48;
                int i51 = (i49 & i50) + (i49 | i50);
                a = i51 % 128;
                int i52 = i51 % 2;
            }
            int i53 = (i22 ^ (-125)) + ((i22 & (-125)) << 1);
            i22 = ((i53 | 126) << 1) - (i53 ^ 126);
            int i54 = b;
            int i55 = i54 ^ 33;
            int i56 = (i54 & 33) << 1;
            int i57 = (i55 & i56) + (i56 | i55);
            a = i57 % 128;
            int i58 = i57 % 2;
        }
        int i59 = a;
        int i60 = ((i59 & 35) - (~(i59 | 35))) - 1;
        b = i60 % 128;
        if (i60 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 6) + (i2 | 6)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof r)) {
            int i6 = i4 & 107;
            int i7 = i6 + ((i4 ^ 107) | i6);
            b = i7 % 128;
            return i7 % 2 != 0;
        }
        boolean zE = ivas.gov.bisp.enumeration.p100w.r.E(this.c, ((r) obj).c);
        int i8 = b;
        int i9 = (((i8 ^ 59) | (i8 & 59)) << 1) - (((~i8) & 59) | (i8 & (-60)));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 81 / 0;
        }
        return zE;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iG = ivas.gov.bisp.enumeration.p064cj.j.g(this.c);
        int i4 = b;
        int i5 = ((i4 ^ 13) | (i4 & 13)) << 1;
        int i6 = -(((~i4) & 13) | (i4 & (-14)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return iG;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 39) | (i2 & 39)) << 1) - (((~i2) & 39) | (i2 & (-40)));
        a = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("[");
        sbW.append(this.c[0]);
        int i5 = a;
        int i6 = i5 & 57;
        int i7 = (i5 ^ 57) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        String string = sbW.toString();
        int i10 = b;
        int i11 = i10 & 125;
        int i12 = (i10 | 125) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 1;
        while (i16 < this.c.length) {
            int i17 = b;
            int i18 = (i17 ^ 9) + ((i17 & 9) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            StringBuilder sbB = P.b(string, ", ");
            int[] iArr = this.c;
            int i20 = a;
            int i21 = ((((i20 ^ 63) | (i20 & 63)) << 1) - (~(-(((~i20) & 63) | (i20 & (-64)))))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                sbB.append(iArr[i16]);
                string = sbB.toString();
                int i22 = ((i16 & 142) + (i16 | 142)) - 1;
                int i23 = i22 & (-127);
                int i24 = -(-((i22 ^ (-127)) | i23));
                i16 = (i23 & i24) + (i23 | i24);
            } else {
                sbB.append(iArr[i16]);
                string = sbB.toString();
                int i25 = i16 ^ 1;
                i16 = (((i16 & 1) | i25) << 1) - i25;
            }
        }
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(string, "]");
        int i26 = b;
        int i27 = ((i26 ^ 45) | (i26 & 45)) << 1;
        int i28 = -(((~i26) & 45) | (i26 & (-46)));
        int i29 = (i27 & i28) + (i28 | i27);
        a = i29 % 128;
        if (i29 % 2 != 0) {
            return strR;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r18.length == (((r11 ^ 5) + ((r11 & 5) << 1)) - 1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r11 = r7 & 101;
        r10 = ((r7 ^ 101) | r11) << 1;
        r7 = -((r7 | 101) & (~r11));
        r11 = (r10 ^ r7) + ((r7 & r10) << 1);
        ivas.gov.bisp.enumeration.cK.r.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if ((r11 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r17.c = new int[r5];
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r17.c = new int[r5];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r10 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r7 >= r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r10 = ivas.gov.bisp.enumeration.cK.r.a;
        r11 = r10 & 99;
        r11 = r11 + ((r10 ^ 99) | r11);
        r10 = r11 % 128;
        ivas.gov.bisp.enumeration.cK.r.b = r10;
        r11 = r11 % 2;
        r11 = r17.c;
        r12 = (-2) - (r6 ^ (-1));
        r10 = (-2) - ((((r10 | 72) << 1) - (r10 ^ 72)) ^ (-1));
        ivas.gov.bisp.enumeration.cK.r.a = r10 % 128;
        r10 = r10 % 2;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r12 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r13 = ivas.gov.bisp.enumeration.cK.r.b + 103;
        r14 = r13 % 128;
        ivas.gov.bisp.enumeration.cK.r.a = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if ((r13 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        r13 = ((r7 * r6) << 5) >>> r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        r13 = (r7 * r6) + 4;
        r15 = -(-r12);
        r16 = r13 & r15;
        r13 = (r13 ^ r15) | r16;
        r13 = (r16 | r13) + (r16 & r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        r15 = ((r14 ^ 107) | (r14 & 107)) << 1;
        r2 = -((r14 & (-108)) | ((~r14) & 107));
        r2 = (r15 ^ r2) + ((r2 & r15) << 1);
        ivas.gov.bisp.enumeration.cK.r.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        if ((r2 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        r2 = r18[r13];
        r13 = r2 & 26407;
        r2 = ((((r2 | 26407) & (~r13)) | r13) * (r12 * 6)) & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        r2 = (r18[r13] & 255) << (r12 * 8);
        r2 = (r2 & r10) | (((~r2) & r10) | ((~r10) & r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        r2 = r12 & 12;
        r12 = (r12 ^ 12) | r2;
        r13 = (r2 & r12) + (r2 | r12);
        r2 = (r13 & 12) | ((~r13) & (-13));
        r12 = (r13 & (-13)) << 1;
        r12 = ((r2 | r12) << 1) - (r2 ^ r12);
        r2 = (((r14 & (-66)) | ((~r14) & 65)) - (~(-(-((r14 & 65) << 1))))) - 1;
        ivas.gov.bisp.enumeration.cK.r.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
    
        r11[r7] = r10;
        r7 = r7 + 1;
        r2 = ivas.gov.bisp.enumeration.cK.r.a;
        r11 = r2 & 101;
        r10 = ((r2 ^ 101) | r11) << 1;
        r2 = -((r2 | 101) & (~r11));
        r11 = (r10 & r2) + (r2 | r10);
        ivas.gov.bisp.enumeration.cK.r.b = r11 % 128;
        r11 = r11 % 2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0141, code lost:
    
        r1 = r17.c;
        r2 = r1.length;
        r3 = new boolean[r2];
        r5 = ivas.gov.bisp.enumeration.cK.r.b;
        r6 = r5 & 23;
        r6 = (r6 - (~(-(-((r5 ^ 23) | r6))))) - 1;
        ivas.gov.bisp.enumeration.cK.r.a = r6 % 128;
        r6 = r6 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0158, code lost:
    
        if (r5 >= r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015a, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cK.r.b;
        r7 = r6 & 33;
        r7 = r7 + ((r6 ^ 33) | r7);
        ivas.gov.bisp.enumeration.cK.r.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0167, code lost:
    
        if ((r7 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        if (r1[r5] < 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
    
        if (r1[r5] < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0172, code lost:
    
        r6 = r6 + 117;
        r7 = r6 % 128;
        ivas.gov.bisp.enumeration.cK.r.a = r7;
        r6 = r6 % 2;
        r6 = r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017b, code lost:
    
        if (r6 >= r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017d, code lost:
    
        r10 = r7 + 91;
        r11 = r10 % 128;
        ivas.gov.bisp.enumeration.cK.r.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0184, code lost:
    
        if ((r10 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0188, code lost:
    
        if (r3[r6] != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018a, code lost:
    
        r3[r6] = true;
        r6 = r5 & 1;
        r5 = (r5 | 1) & (~r6);
        r6 = r6 << 1;
        r5 = (r5 | r6) + (r5 & r6);
        r6 = (r11 ^ 35) + ((r11 & 35) << 1);
        ivas.gov.bisp.enumeration.cK.r.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a3, code lost:
    
        r1 = (r7 & 57) + (r7 | 57);
        r2 = r1 % 128;
        ivas.gov.bisp.enumeration.cK.r.b = r2;
        r1 = r1 % 2;
        r2 = r2 + 73;
        ivas.gov.bisp.enumeration.cK.r.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b5, code lost:
    
        r1 = r3[r6];
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c1, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid encoding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cK.r.b + 54;
        r2 = (r1 ^ (-1)) + (r1 << 1);
        r1 = r2 % 128;
        ivas.gov.bisp.enumeration.cK.r.a = r1;
        r2 = r2 % 2;
        r2 = r1 & 69;
        r2 = r2 + ((r1 ^ 69) | r2);
        ivas.gov.bisp.enumeration.cK.r.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e0, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid encoding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r18.length == (((r11 ^ r12) + ((r11 & r12) << 1)) >>> 2)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(byte[] r18) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cK.r.<init>(byte[]):void");
    }
}
