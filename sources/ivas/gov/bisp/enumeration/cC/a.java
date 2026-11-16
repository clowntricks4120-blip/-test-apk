package ivas.gov.bisp.enumeration.cC;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a = 1;
    private static int b;
    public final J c;
    public final ivas.gov.bisp.enumeration.p010aj.S d;
    public byte[] e;
    public byte[] f;

    public a(J j) {
        Objects.requireNonNull(j, "params == null");
        this.c = j;
        int i = j.c;
        this.d = new ivas.gov.bisp.enumeration.p010aj.S(j.f, i);
        this.e = new byte[i];
        this.f = new byte[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r6.length == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6.length == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cC.a.b;
        r2 = r1 & 85;
        r2 = (r2 - (~(-(-((r1 ^ 85) | r2))))) - 1;
        ivas.gov.bisp.enumeration.cC.a.a = r2 % 128;
        r2 = r2 % 2;
        r4.e = r5;
        r4.f = r6;
        r5 = r1 & 51;
        r6 = (~r5) & (r1 | 51);
        r5 = r5 << 1;
        r1 = (r6 ^ r5) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.cC.a.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        throw new java.lang.IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cC.a.a
            r2 = r1 & 51
            r1 = r1 ^ 51
            r1 = r1 | r2
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cC.a.b = r1
            int r2 = r2 % r0
            java.lang.String r1 = "secretKeySeed == null"
            if (r2 == 0) goto L22
            java.util.Objects.requireNonNull(r5, r1)
            int r1 = r5.length
            ivas.gov.bisp.enumeration.cC.J r2 = r4.c
            r3 = 23
            int r3 = r3 / 0
            goto L28
        L22:
            java.util.Objects.requireNonNull(r5, r1)
            int r1 = r5.length
            ivas.gov.bisp.enumeration.cC.J r2 = r4.c
        L28:
            int r2 = r2.c
            if (r1 != r2) goto L81
            int r1 = ivas.gov.bisp.enumeration.cC.a.a
            r3 = r1 ^ 67
            r1 = r1 & 67
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cC.a.b = r1
            int r3 = r3 % r0
            java.lang.String r1 = "publicSeed == null"
            if (r3 == 0) goto L49
            java.util.Objects.requireNonNull(r6, r1)
            int r1 = r6.length
            r3 = 61
            int r3 = r3 / 0
            if (r1 != r2) goto L79
            goto L4f
        L49:
            java.util.Objects.requireNonNull(r6, r1)
            int r1 = r6.length
            if (r1 != r2) goto L79
        L4f:
            int r1 = ivas.gov.bisp.enumeration.cC.a.b
            r2 = r1 & 85
            r3 = r1 ^ 85
            r3 = r3 | r2
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cC.a.a = r3
            int r2 = r2 % r0
            r4.e = r5
            r4.f = r6
            r5 = r1 & 51
            int r6 = ~r5
            r1 = r1 | 51
            r6 = r6 & r1
            int r5 = r5 << 1
            r1 = r6 ^ r5
            r5 = r5 & r6
            int r5 = r5 << 1
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.cC.a.a = r5
            int r1 = r1 % r0
            return
        L79:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "size of publicSeed needs to be equal to size of digest"
            r5.<init>(r6)
            throw r5
        L81:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "size of secretKeySeed needs to be equal to size of digest"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.a.f(byte[], byte[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        if (r14 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r14 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r13 = (r2 & (-122)) | ((~r2) & 121);
        r14 = (r2 & 121) << 1;
        r15 = (r13 ^ r14) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.cC.a.b = r15 % 128;
        r15 = r15 % 2;
        r13 = (r2 & 31) + (r2 | 31);
        ivas.gov.bisp.enumeration.cC.a.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r12 = c(r12, r13, r14 - 1, r15);
        r13 = new ivas.gov.bisp.enumeration.cC.C0234l.bCT();
        r14 = r15.c;
        r2 = ivas.gov.bisp.enumeration.cC.a.a + 105;
        ivas.gov.bisp.enumeration.cC.a.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if ((r2 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        r13 = (ivas.gov.bisp.enumeration.cC.C0234l.bCT) ((ivas.gov.bisp.enumeration.cC.C0234l.bCT) r13.e(r14)).f(r15.d);
        r13.h = r15.h;
        r13.g = r15.g;
        r13.i = ((~r4) - (~(r4 << 1))) - 1;
        r14 = ivas.gov.bisp.enumeration.cC.a.b + 93;
        ivas.gov.bisp.enumeration.cC.a.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
    
        if ((r14 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
    
        r13 = (ivas.gov.bisp.enumeration.cC.C0234l) ((ivas.gov.bisp.enumeration.cC.C0234l.bCT) r13.d(1)).g();
        r14 = r11.d.d(r11.f, r13.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        r13 = (ivas.gov.bisp.enumeration.cC.C0234l) ((ivas.gov.bisp.enumeration.cC.C0234l.bCT) r13.d(0)).g();
        r14 = r11.d.d(r11.f, r13.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        r15 = (ivas.gov.bisp.enumeration.cC.C0234l.bCT) new ivas.gov.bisp.enumeration.cC.C0234l.bCT().e(r13.c);
        r9 = r13.d;
        r2 = ivas.gov.bisp.enumeration.cC.a.b;
        r4 = (r2 ^ 99) + ((r2 & 99) << 1);
        ivas.gov.bisp.enumeration.cC.a.a = r4 % 128;
        r4 = r4 % 2;
        r15 = (ivas.gov.bisp.enumeration.cC.C0234l.bCT) r15.f(r9);
        r15.h = r13.h;
        r2 = r13.g;
        r4 = ivas.gov.bisp.enumeration.cC.a.b + 121;
        ivas.gov.bisp.enumeration.cC.a.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0132, code lost:
    
        if ((r4 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0134, code lost:
    
        r15.g = r2;
        r15.i = r13.i;
        r13 = r15.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        r15.g = r2;
        r15.i = r13.i;
        r13 = r15.d(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0149, code lost:
    
        r13 = r11.d.d(r11.f, ((ivas.gov.bisp.enumeration.cC.C0234l) ((ivas.gov.bisp.enumeration.cC.C0234l.bCT) r13).g()).c());
        r15 = new byte[r1];
        r2 = ivas.gov.bisp.enumeration.cC.a.a;
        r4 = (((r2 ^ 85) | (r2 & 85)) << 1) - (((~r2) & 85) | (r2 & (-86)));
        ivas.gov.bisp.enumeration.cC.a.b = r4 % 128;
        r4 = r4 % 2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0175, code lost:
    
        if (r2 >= r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0177, code lost:
    
        r4 = ivas.gov.bisp.enumeration.cC.a.b;
        r6 = r4 & 111;
        r7 = r4 | 111;
        r9 = ((r6 | r7) << 1) - (r6 ^ r7);
        ivas.gov.bisp.enumeration.cC.a.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0187, code lost:
    
        if ((r9 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        r6 = r12[r2];
        r7 = r13[r2];
        r9 = ((~r7) & r6) | ((~r6) & r7);
        r6 = r6 & r7;
        r15[r2] = (byte) ((r6 & r9) | (r9 ^ r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019b, code lost:
    
        r6 = r12[r2];
        r7 = r13[r2];
        r9 = r6 & r7;
        r15[r2] = (byte) (((r6 ^ r7) | r9) & (~r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a8, code lost:
    
        r6 = ((r2 ^ (-51)) | (r2 & (-51))) << 1;
        r2 = -(((~r2) & (-51)) | (r2 & 50));
        r7 = (r6 & r2) + (r2 | r6);
        r2 = r7 & 52;
        r6 = (~r2) & (r7 | 52);
        r2 = -(-(r2 << 1));
        r2 = (r2 | r6) + (r6 & r2);
        r6 = r4 & 63;
        r4 = -(-((r4 ^ 63) | r6));
        r7 = (r6 & r4) + (r4 | r6);
        ivas.gov.bisp.enumeration.cC.a.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d7, code lost:
    
        r12 = r11.d;
        java.util.Objects.requireNonNull(r12);
        r13 = ivas.gov.bisp.enumeration.cC.a.a;
        r2 = r13 | 71;
        r4 = r2 << 1;
        r13 = -((~(r13 & 71)) & r2);
        r2 = (r4 ^ r13) + ((r13 & r4) << 1);
        ivas.gov.bisp.enumeration.cC.a.b = r2 % 128;
        r2 = r2 % 2;
        r13 = r14.length;
        r2 = r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01f4, code lost:
    
        if (r13 != r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f6, code lost:
    
        r13 = ivas.gov.bisp.enumeration.cC.a.b + 125;
        ivas.gov.bisp.enumeration.cC.a.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ff, code lost:
    
        if ((r13 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0201, code lost:
    
        if (r1 != r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0203, code lost:
    
        r12 = r12.f(0, r14, r15);
        r13 = ivas.gov.bisp.enumeration.cC.a.b;
        r14 = r13 & 119;
        r13 = (r13 | 119) & (~r14);
        r14 = r14 << 1;
        r15 = (r13 & r14) + (r13 | r14);
        ivas.gov.bisp.enumeration.cC.a.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0219, code lost:
    
        if ((r15 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x021b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021c, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0227, code lost:
    
        throw new java.lang.IllegalArgumentException("wrong in length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0228, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
    
        throw new java.lang.IllegalArgumentException("wrong key length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0231, code lost:
    
        r12 = (ivas.gov.bisp.enumeration.cC.C0234l.bCT) ((ivas.gov.bisp.enumeration.cC.C0234l.bCT) r13.e(r14)).f(r15.d);
        r12 = r15.h;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0244, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] c(byte[] r12, int r13, int r14, ivas.gov.bisp.enumeration.cC.C0234l r15) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.a.c(byte[], int, int, ivas.gov.bisp.enumeration.cC.l):byte[]");
    }

    public final byte[] e(byte[] bArr, C0234l c0234l) {
        C0234l.bCT bct;
        int i;
        int i2 = 2 % 2;
        C0234l.bCT bct2 = new C0234l.bCT();
        int i3 = c0234l.c;
        int i4 = b + 11;
        a = i4 % 128;
        int i5 = i4 % 2;
        C0234l.bCT bct3 = (C0234l.bCT) bct2.e(i3);
        int i6 = b;
        int i7 = i6 & 93;
        int i8 = i7 + ((i6 ^ 93) | i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            bct3.f(c0234l.d);
            throw null;
        }
        x.bCP bcpF = bct3.f(c0234l.d);
        int i9 = a;
        int i10 = i9 & 111;
        int i11 = (i10 - (~(-(-((i9 ^ 111) | i10))))) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            bct = (C0234l.bCT) bcpF;
            i = c0234l.h;
            int i12 = 20 / 0;
        } else {
            bct = (C0234l.bCT) bcpF;
            i = c0234l.h;
        }
        bct.h = i;
        C0234l c0234l2 = (C0234l) bct.g();
        int i13 = a;
        int i14 = (i13 | 9) << 1;
        int i15 = -(((~i13) & 9) | (i13 & (-10)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        byte[] bArrD = this.d.d(bArr, c0234l2.c());
        int i18 = (-2) - ((a + 24) ^ (-1));
        b = i18 % 128;
        int i19 = i18 % 2;
        return bArrD;
    }

    public final ivas.gov.bisp.enumeration.p086i.a d(C0234l c0234l) {
        byte[] bArrD;
        J j;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 40) + (i2 | 40)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[][] bArr = new byte[this.c.e][];
        int i5 = b;
        int i6 = (i5 & 89) + (i5 | 89);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 3;
        }
        int i8 = 0;
        while (true) {
            J j2 = this.c;
            if (i8 >= j2.e) {
                ivas.gov.bisp.enumeration.p086i.a aVar = new ivas.gov.bisp.enumeration.p086i.a(j2, bArr);
                int i9 = b + 109;
                a = i9 % 128;
                int i10 = i9 % 2;
                return aVar;
            }
            C0234l.bCT bct = new C0234l.bCT();
            int i11 = c0234l.c;
            int i12 = a;
            int i13 = ((i12 ^ 60) + ((i12 & 60) << 1)) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            C0234l.bCT bct2 = (C0234l.bCT) ((C0234l.bCT) bct.e(i11)).f(c0234l.d);
            int i14 = a;
            int i15 = i14 & 39;
            int i16 = ((((i14 ^ 39) | i15) << 1) - (~(-((i14 | 39) & (~i15))))) - 1;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                bct2.h = c0234l.h;
                int i17 = 40 / 0;
            } else {
                bct2.h = c0234l.h;
            }
            bct2.g = i8;
            int i18 = c0234l.i;
            int i19 = a;
            int i20 = ((i19 ^ 69) | (i19 & 69)) << 1;
            int i21 = -(((~i19) & 69) | (i19 & (-70)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                bct2.i = i18;
                bct2.d(c0234l.f);
                throw null;
            }
            bct2.i = i18;
            c0234l = (C0234l) ((C0234l.bCT) bct2.d(c0234l.f)).g();
            if (i8 >= 0) {
                int i23 = b + 125;
                a = i23 % 128;
                int i24 = i23 % 2;
                if (i8 < this.c.e) {
                    int i25 = b;
                    int i26 = i25 ^ 35;
                    int i27 = ((i25 & 35) | i26) << 1;
                    int i28 = -i26;
                    int i29 = (i27 & i28) + (i28 | i27);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    ivas.gov.bisp.enumeration.p010aj.S s = this.d;
                    byte[] bArr2 = this.e;
                    long j3 = i8;
                    int i31 = i25 & 63;
                    int i32 = (i25 ^ 63) | i31;
                    int i33 = (i31 & i32) + (i32 | i31);
                    a = i33 % 128;
                    if (i33 % 2 == 0) {
                        bArrD = s.d(bArr2, v.k(j3, 32));
                        j = this.c;
                        int i34 = 97 / 0;
                    } else {
                        bArrD = s.d(bArr2, v.k(j3, 32));
                        j = this.c;
                    }
                    int i35 = j.d;
                    int i36 = a;
                    int i37 = ((i36 ^ 29) - (~((i36 & 29) << 1))) - 1;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = -(~i35);
                    bArr[i8] = c(bArrD, 0, ((-2) & i39) + (i39 | (-2)), c0234l);
                    int i40 = (i8 & 2) + (i8 | 2);
                    i8 = (i40 ^ (-1)) + (i40 << 1);
                    int i41 = a + 41;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                }
            }
            throw new IllegalArgumentException("index out of bounds");
        }
    }
}
