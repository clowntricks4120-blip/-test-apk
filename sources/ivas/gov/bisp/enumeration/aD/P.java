package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public int d = 100;
    public C0063t e;

    public static final class biX extends P {
        private static int a = 1;
        private static int b;
        public int f;
        public final byte[] g;
        public int h;
        public final boolean i;
        public int j;
        public int k;
        public int l;
        public int m;

        public biX(byte[] bArr, int i, int i2, boolean z, biW biw) {
            super(null);
            this.m = Integer.MAX_VALUE;
            this.g = bArr;
            this.h = i2 + i;
            this.k = i;
            this.f = i;
            this.i = z;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final long A() throws C0065v {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 64) + ((i2 & 64) << 1)) - 1;
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                I();
                throw null;
            }
            long jI = I();
            int i4 = b;
            int i5 = (i4 & (-34)) | ((~i4) & 33);
            int i6 = -(-((i4 & 33) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return jI;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int B() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 99;
            int i4 = i3 + ((i2 ^ 99) | i3);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                G();
                throw null;
            }
            int iG = G();
            int i5 = b;
            int i6 = i5 & 105;
            int i7 = -(-((i5 ^ 105) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 25 / 0;
            }
            return iG;
        }

        public final int D() throws C0065v {
            byte b2;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = a;
            int i8 = i7 ^ 11;
            int i9 = -(-((i7 & 11) << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = this.k;
            int i13 = this.h;
            int i14 = -i12;
            int i15 = i13 & i14;
            int i16 = (i13 | i14) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            int i19 = i7 & 47;
            int i20 = (i19 - (~(-(-((i7 ^ 47) | i19))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            if (i18 < 4) {
                throw C0065v.c();
            }
            int i22 = i7 & 51;
            int i23 = ((i7 ^ 51) | i22) << 1;
            int i24 = -((i7 | 51) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            byte[] bArr = this.g;
            this.k = i12 + 4;
            int i28 = i26 & 61;
            int i29 = i26 | 61;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            a = i30 % 128;
            int i31 = i30 % 2;
            byte b3 = bArr[i12];
            int i32 = i12 & 1;
            int i33 = ((i12 ^ 1) | i32) << 1;
            int i34 = -((~i32) & (i12 | 1));
            byte b4 = bArr[(i33 & i34) + (i33 | i34)];
            int i35 = (i26 & 39) + (i26 | 39);
            int i36 = i35 % 128;
            a = i36;
            if (i35 % 2 == 0) {
                b2 = bArr[((i12 ^ (-3)) + ((i12 & (-3)) << 1)) - 1];
            } else {
                int i37 = i12 & 2;
                int i38 = (~i37) & (i12 | 2);
                int i39 = i37 << 1;
                b2 = bArr[(i38 & i39) + (i39 | i38)];
            }
            int i40 = i12 ^ 3;
            int i41 = (bArr[((((i12 & 3) | i40) << 1) - (~(-i40))) - 1] & 255) << 24;
            int i42 = (-2) - ((i36 + 104) ^ (-1));
            int i43 = i42 % 128;
            b = i43;
            if (i42 % 2 != 0) {
                i = b3 & 17716;
                i2 = b4 & 16812;
                i3 = 13;
            } else {
                i = b3 & 255;
                i2 = b4 & 255;
                i3 = 8;
            }
            int i44 = (((i43 | 33) << 1) - (~(-(i43 ^ 33)))) - 1;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = -i3;
                int i46 = i2 & i45;
                int i47 = (i2 ^ i45) | i46;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                int i49 = (~i48) & i;
                int i50 = (~i) & i48;
                i4 = (i50 & i49) | (i49 ^ i50);
                i5 = (b2 & 8751) * 27;
            } else {
                int i51 = i2 << i3;
                i4 = (i & i51) | (i ^ i51);
                i5 = (b2 & 255) << 16;
            }
            int i52 = (i43 | 3) << 1;
            int i53 = -(i43 ^ 3);
            int i54 = (i52 & i53) + (i53 | i52);
            a = i54 % 128;
            if (i54 % 2 == 0) {
                int i55 = i4 & i5;
                int i56 = (i55 | (i4 ^ i5)) & (~i55);
                return (i56 & i41) | ((~i56) & i41) | ((~i41) & i56);
            }
            int i57 = (i4 ^ i5) | (i4 & i5);
            int i58 = ((~i57) & i41) | ((~i41) & i57);
            int i59 = i57 & i41;
            return (i59 & i58) | (i58 ^ i59);
        }

        public final byte E() throws C0065v {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 29;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.k;
            if (i4 == this.h) {
                throw C0065v.c();
            }
            byte[] bArr = this.g;
            int i5 = i4 & 1;
            this.k = ((((i4 ^ 1) | i5) << 1) - (~(-((~i5) & (i4 | 1))))) - 1;
            int i6 = (i2 & (-114)) | ((~i2) & 113);
            int i7 = (i2 & 113) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                byte b2 = bArr[i4];
                throw null;
            }
            byte b3 = bArr[i4];
            int i10 = ((i9 & (-2)) | ((~i9) & 1)) + ((i9 & 1) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 32 / 0;
            }
            return b3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
        
            if (r2 >= 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
        
            r4 = ((r1 & 48) + (r1 | 48)) - 1;
            r1 = r4 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.b = r1;
            r4 = r4 % 2;
            r10.k = r6;
            r1 = r1 + 77;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        
            if ((r1 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            r1 = -r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            if (((((~r1) & r4) | ((~r4) & r1)) + ((r1 & r4) << 1)) < 9) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        
            r4 = r7 & 79;
            r1 = (((r7 ^ 79) | r4) << 1) - ((~r4) & (r7 | 79));
            r4 = r1 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        
            if ((r1 % 2) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
        
            r1 = r5[r6] >> 23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        
            r1 = r6 & 1;
            r8 = (~r1) & (r6 | 1);
            r1 = -(-(r1 << 1));
            r9 = ((r8 | r1) << 1) - (r1 ^ r8);
            r1 = r5[r6] << 7;
            r6 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        
            r8 = r2 & r1;
            r1 = ((r1 ^ r2) | r8) & (~r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
        
            if (r1 >= 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
        
            r2 = (r4 & 63) + (r4 | 63);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r2 % 128;
            r2 = r2 % 2;
            r1 = (r1 | (-128)) & (~(r1 & (-128)));
            r2 = (r4 & (-84)) | ((~r4) & 83);
            r4 = (r4 & 83) << 1;
            r5 = ((r2 | r4) << 1) - (r2 ^ r4);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        
            if ((r5 % 2) == 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
        
            r2 = 2 / 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
        
            r2 = (((r6 | 2) << 1) - (r6 ^ 2)) - 1;
            r4 = r5[r6];
            r6 = ((r7 ^ 79) - (~(-(-((r7 & 79) << 1))))) - 1;
            r8 = r6 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
        
            if ((r6 % 2) != 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
        
            r6 = r4 & 14;
            r4 = -(-(r4 | 14));
            r1 = r1 & ((r6 ^ r4) + ((r4 & r6) << 1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
        
            if (r1 < 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
        
            r4 = r4 << 14;
            r1 = (r1 | r4) & (~(r1 & r4));
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
        
            if (r1 < 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
        
            r1 = (r1 | 16256) & (~(r1 & 16256));
            r4 = r7 ^ 51;
            r5 = (r7 & 51) << 1;
            r6 = (r4 & r5) + (r4 | r5);
            ivas.gov.bisp.enumeration.aD.P.biX.a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
        
            r6 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0134, code lost:
        
            r6 = ((((r2 ^ 1) | (r2 & 1)) << 1) - (~(-((r2 & (-2)) | ((~r2) & 1))))) - 1;
            r2 = r5[r2] << 21;
            r1 = (r1 | r2) & (~(r1 & r2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x014f, code lost:
        
            if (r1 >= 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0151, code lost:
        
            r2 = ((r8 | 61) << 1) - (r8 ^ 61);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0160, code lost:
        
            if ((r2 % 2) == 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0162, code lost:
        
            r1 = r1 & (-2080896);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
        
            r1 = ((~r1) & (-2080896)) | (2080895 & r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:
        
            r2 = ((r8 | 27) << 1) - (r8 ^ 27);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0179, code lost:
        
            r2 = r6 & 1;
            r4 = -(-(r6 | 1));
            r2 = ((r2 & r4) << 1) + (r2 ^ r4);
            r4 = r5[r6];
            r6 = (((r8 | 56) << 1) - (r8 ^ 56)) - 1;
            r7 = r6 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.b = r7;
            r6 = r6 % 2;
            r6 = r4 << 28;
            r8 = (~r6) & r1;
            r1 = (~r1) & r6;
            r1 = (r1 & r8) | (r8 ^ r1);
            r1 = ((~r1) & 266354560) | ((-266354561) & r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
        
            if (r4 >= 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01ab, code lost:
        
            r4 = r7 & 53;
            r6 = (r7 ^ 53) | r4;
            r8 = (r4 ^ r6) + ((r4 & r6) << 1);
            ivas.gov.bisp.enumeration.aD.P.biX.a = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01bb, code lost:
        
            if ((r8 % 2) != 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01bf, code lost:
        
            if (r5[r2] >= 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
        
            r6 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01c5, code lost:
        
            r4 = r2 & 1;
            r6 = (((~r4) & (r2 | 1)) - (~(-(-(r4 << 1))))) - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01d5, code lost:
        
            if (r5[r2] >= 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01d7, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01d8, code lost:
        
            r4 = r7 + 103;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4 % 128;
            r4 = r4 % 2;
            r4 = r2 ^ 1;
            r6 = -(-((r2 & 1) << 1));
            r8 = (r4 & r6) + (r4 | r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01ed, code lost:
        
            if (r5[r2] >= 0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01ef, code lost:
        
            r7 = r7 + 79;
            r2 = r7 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r2;
            r7 = r7 % 2;
            r6 = r8 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01fa, code lost:
        
            if (r5[r8] >= 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01fc, code lost:
        
            r4 = (r2 | 107) << 1;
            r7 = -((r2 & (-108)) | ((~r2) & 107));
            r8 = (r4 & r7) + (r4 | r7);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r8 % 128;
            r8 = r8 % 2;
            r4 = r6 & 1;
            r7 = -(-((r6 ^ 1) | r4));
            r8 = (r4 ^ r7) + ((r4 & r7) << 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0220, code lost:
        
            if (r5[r6] >= 0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0222, code lost:
        
            r4 = (r2 & (-50)) | ((~r2) & 49);
            r2 = (r2 & 49) << 1;
            r6 = (r4 ^ r2) + ((r2 & r4) << 1);
            ivas.gov.bisp.enumeration.aD.P.biX.b = r6 % 128;
            r6 = r6 % 2;
            r2 = r8 ^ 1;
            r6 = ((((r8 & 1) | r2) << 1) - (~(-r2))) - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0245, code lost:
        
            if (r5[r8] >= 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0248, code lost:
        
            r6 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0249, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.P.biX.b + 121;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0252, code lost:
        
            if ((r2 % 2) != 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0254, code lost:
        
            r2 = 5 / 4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0257, code lost:
        
            r10.k = r6;
            r2 = ivas.gov.bisp.enumeration.aD.P.biX.b;
            r4 = (((r2 ^ 11) | (r2 & 11)) << 1) - (((~r2) & 11) | (r2 & (-12)));
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x026e, code lost:
        
            if ((r4 % 2) == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0270, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0271, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0274, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
        
            if (r2 >= 0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int G() {
            /*
                Method dump skipped, instruction units count: 668
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.P.biX.G():int");
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final boolean f() {
            int i = 2 % 2;
            int i2 = b;
            boolean z = true;
            int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
            a = i3 % 128;
            if (i3 % 2 != 0 ? I() == 0 : I() == 0) {
                int i4 = a;
                int i5 = i4 & 51;
                int i6 = (i5 - (~(-(-((i4 ^ 51) | i5))))) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                int i8 = a;
                int i9 = (((i8 | 10) << 1) - (i8 ^ 10)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = a;
            int i12 = (i11 & 71) + (i11 | 71);
            b = i12 % 128;
            int i13 = i12 % 2;
            return z;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final void g(int i) throws C0065v {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 6) + (i3 | 6);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            if (this.l != i) {
                throw C0065v.d();
            }
            int i8 = i6 + 24;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int h() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 63;
            int i4 = -(-((i2 ^ 63) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = this.k;
            int i9 = -this.f;
            int i10 = i8 & i9;
            int i11 = (i8 ^ i9) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = (i6 ^ 107) + ((i6 & 107) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return i12;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final boolean i() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 87;
            int i4 = i3 + ((i2 ^ 87) | i3);
            int i5 = i4 % 128;
            b = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            boolean z = true;
            if (this.k == this.h) {
                int i6 = i5 & 89;
                int i7 = (i5 ^ 89) | i6;
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = ((i5 ^ 123) | (i5 & 123)) << 1;
                int i11 = -((i5 & (-124)) | ((~i5) & 123));
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            }
            int i14 = i5 & 3;
            int i15 = -(-((i5 ^ 3) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final double m() {
            double dLongBitsToDouble;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 48) + ((i2 & 48) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                dLongBitsToDouble = Double.longBitsToDouble(F());
                int i4 = 29 / 0;
            } else {
                dLongBitsToDouble = Double.longBitsToDouble(F());
            }
            int i5 = a;
            int i6 = i5 ^ 111;
            int i7 = ((i5 & 111) | i6) << 1;
            int i8 = -i6;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return dLongBitsToDouble;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int n() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 32) << 1) - (i2 ^ 32)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int iG = G();
            int i5 = b;
            int i6 = i5 ^ 41;
            int i7 = -(-((i5 & 41) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return iG;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final long o() throws C0065v {
            int i = 2 % 2;
            int i2 = a + 17;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return F();
            }
            F();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int p() throws C0065v {
            int iD;
            int i = 2 % 2;
            int i2 = a + 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                iD = D();
                int i3 = 90 / 0;
            } else {
                iD = D();
            }
            int i4 = b;
            int i5 = (((i4 | 28) << 1) - (i4 ^ 28)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return iD;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final float q() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 9;
            int i4 = (((i2 ^ 9) | i3) << 1) - ((i2 | 9) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            float fIntBitsToFloat = Float.intBitsToFloat(D());
            int i6 = a;
            int i7 = (i6 ^ 69) + ((i6 & 69) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            return fIntBitsToFloat;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int r() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 31;
            int i4 = (i2 ^ 31) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int iG = G();
            int i7 = b;
            int i8 = (((i7 | 74) << 1) - (i7 ^ 74)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return iG;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int s() throws C0065v {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 9) | (i2 & 9)) << 1) - (~(-(((~i2) & 9) | (i2 & (-10)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int iD = D();
            int i5 = b + 7;
            a = i5 % 128;
            int i6 = i5 % 2;
            return iD;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final long t() throws C0065v {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 75;
            int i4 = ((i3 << 1) - (~(-((~(i2 & 75)) & i3)))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            long jI = I();
            int i6 = a;
            int i7 = i6 | 115;
            int i8 = ((i7 << 1) - (~(-((~(i6 & 115)) & i7)))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return jI;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final long u() throws C0065v {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 15) | (i2 & 15)) << 1;
            int i4 = -(((~i2) & 15) | (i2 & (-16)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            long jF = F();
            int i7 = a;
            int i8 = ((i7 ^ 6) + ((i7 & 6) << 1)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 80 / 0;
            }
            return jF;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final long w() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 11) | (i2 & 11)) << 1;
            int i4 = -(((~i2) & 11) | (i2 & (-12)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return P.d(I());
            }
            P.d(I());
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int x() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 3;
            int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
            a = i4 % 128;
            int i5 = i4 % 2;
            int iG = G();
            if (i5 != 0) {
                return P.c(iG);
            }
            P.c(iG);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void H(int i) throws C0065v {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 ^ 75;
            int i5 = ((((i3 & 75) | i4) << 1) - (~(-i4))) - 1;
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i >= 0) {
                int i6 = this.h;
                int i7 = this.k;
                int i8 = i3 + 91;
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = -i7;
                if (i <= (i6 & i11) + (i6 | i11)) {
                    int i12 = ((i9 | 55) << 1) - (i9 ^ 55);
                    b = i12 % 128;
                    if (i12 % 2 != 0) {
                        this.k = i7 / i;
                    } else {
                        int i13 = -(-i);
                        int i14 = i7 & i13;
                        this.k = i14 + ((i13 ^ i7) | i14);
                    }
                    int i15 = ((i9 & 92) + (i9 | 92)) - 1;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
            if (i >= 0) {
                throw C0065v.c();
            }
            int i16 = i3 + 99;
            a = i16 % 128;
            if (i16 % 2 != 0) {
                throw C0065v.i();
            }
            C0065v.i();
            throw null;
        }

        public final long J() throws C0065v {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 43;
            int i4 = ((i2 & 43) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            long j = i6 % 2 == 0 ? 1L : 0L;
            int i7 = 0;
            while (i7 < 64) {
                int i8 = a;
                int i9 = (i8 & 53) + (i8 | 53);
                b = i9 % 128;
                int i10 = i9 % 2;
                byte bE = E();
                int i11 = ~bE;
                j |= ((long) (bE & 127)) << i7;
                int i12 = b;
                int i13 = i12 & 1;
                int i14 = i13 + ((i12 ^ 1) | i13);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = (i11 & 12498) | (bE & (-12499));
                    int i16 = bE & 12498;
                    if (((i16 & i15) | (i15 ^ i16)) == 0) {
                        int i17 = ((i12 ^ 47) | (i12 & 47)) << 1;
                        int i18 = -((i12 & (-48)) | ((~i12) & 47));
                        int i19 = (i17 & i18) + (i17 | i18);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        return j;
                    }
                    i7 += 7;
                    int i21 = i12 + 37;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    if ((bE & 128) == 0) {
                        int i110 = ((i12 ^ 47) | (i12 & 47)) << 1;
                        int i111 = -((i12 & (-48)) | ((~i12) & 47));
                        int i112 = (i110 & i111) + (i110 | i111);
                        a = i112 % 128;
                        int i23 = i112 % 2;
                        return j;
                    }
                    i7 += 7;
                    int i24 = i12 + 37;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            throw C0065v.h();
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final void j(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 29;
            int i5 = (i4 - (~(-(-((i3 ^ 29) | i4))))) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.m = i;
                K();
            } else {
                this.m = i;
                K();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int v() throws C0065v {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 69;
            int i4 = ((((i2 & 69) | i3) << 1) - (~(-i3))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (!(!i())) {
                int i6 = a;
                int i7 = (((i6 & (-116)) | ((~i6) & 115)) - (~((i6 & 115) << 1))) - 1;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                this.l = 0;
                int i10 = (((i8 | 68) << 1) - (i8 ^ 68)) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                return 0;
            }
            int iG = G();
            this.l = iG;
            if ((iG >>> 3) == 0) {
                throw C0065v.e();
            }
            int i12 = a;
            int i13 = i12 & 111;
            int i14 = -(-((i12 ^ 111) | i13));
            int i15 = (i13 & i14) + (i14 | i13);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            int i18 = (i16 ^ 93) + ((i16 & 93) << 1);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                return iG;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            if (r1 <= ((r3 ^ r2) + ((r2 & r3) << 1))) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        
            r2 = new java.lang.String(r7.g, r4, r1, ivas.gov.bisp.enumeration.aD.R.c);
            r3 = ivas.gov.bisp.enumeration.aD.P.biX.a;
            r4 = (r3 & 7) + (r3 | 7);
            r3 = r4 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.b = r3;
            r4 = r4 % 2;
            r4 = r7.k;
            r1 = -(-r1);
            r5 = ((~r1) & r4) | ((~r4) & r1);
            r1 = -(-((r1 & r4) << 1));
            r7.k = ((r5 | r1) << 1) - (r1 ^ r5);
            r1 = r3 & 11;
            r1 = r1 + ((r3 ^ 11) | r1);
            ivas.gov.bisp.enumeration.aD.P.biX.a = r1 % 128;
            r1 = r1 % 2;
            r1 = (r3 & 111) + (r3 | 111);
            ivas.gov.bisp.enumeration.aD.P.biX.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
        
            if (r1 <= (r3 * r4)) goto L11;
         */
        @Override // ivas.gov.bisp.enumeration.aD.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String y() throws ivas.gov.bisp.enumeration.aD.C0065v {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.P.biX.y():java.lang.String");
        }

        public final long F() throws C0065v {
            byte[] bArr;
            byte b2;
            long j;
            byte b3;
            long j2;
            long j3;
            int i;
            long j4;
            long j5;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 109;
            int i5 = (i3 ^ 109) | i4;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = this.k;
            int i9 = this.h;
            int i10 = -i8;
            int i11 = i9 & i10;
            int i12 = (i9 ^ i10) | i11;
            if ((i11 & i12) + (i12 | i11) < 8) {
                throw C0065v.c();
            }
            int i13 = i3 & 25;
            int i14 = ((i3 ^ 25) | i13) << 1;
            int i15 = -((~i13) & (i3 | 25));
            int i16 = (i14 & i15) + (i14 | i15);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                bArr = this.g;
                this.k = i8 * 121;
                b2 = bArr[i8];
            } else {
                bArr = this.g;
                int i17 = i8 & 8;
                this.k = (i17 - (~(-(-((i8 ^ 8) | i17))))) - 1;
                b2 = bArr[i8];
            }
            long j6 = b2;
            int i18 = (((i3 | 102) << 1) - (i3 ^ 102)) - 1;
            int i19 = i18 % 128;
            a = i19;
            if (i18 % 2 == 0) {
                j = bArr[i8 / 0];
                b3 = bArr[i8 << 5];
            } else {
                j = bArr[((i8 | 1) << 1) - (i8 ^ 1)];
                b3 = bArr[((i8 | 2) << 1) - (i8 ^ 2)];
            }
            long j7 = b3;
            int i20 = (i8 & (-4)) | ((~i8) & 3);
            int i21 = -(-((i8 & 3) << 1));
            long j8 = bArr[(i20 ^ i21) + ((i20 & i21) << 1)];
            long j9 = bArr[(((i8 | 5) << 1) - (i8 ^ 5)) - 1];
            int i22 = (((i19 ^ 95) | (i19 & 95)) << 1) - ((i19 & (-96)) | (95 & (~i19)));
            int i23 = i22 % 128;
            b = i23;
            if (i22 % 2 != 0) {
                j2 = bArr[i8 * 5];
                j3 = bArr[i8 << 99];
                i = 103;
            } else {
                j2 = bArr[(((i8 | 6) << 1) - (i8 ^ 6)) - 1];
                j3 = bArr[i8 + 6];
                i = 7;
            }
            long j10 = j3;
            int i24 = i23 + 5;
            a = i24 % 128;
            if (i24 % 2 == 0) {
                j4 = (((long) bArr[i8 << i]) + 255) >> 7;
                j5 = j6 * 255;
            } else {
                int i25 = -(-i);
                j4 = (((long) bArr[(i8 ^ i25) + ((i25 & i8) << 1)]) & 255) << 56;
                j5 = j6 & 255;
            }
            long j11 = ((j & 255) << 8) | j5 | ((j7 & 255) << 16);
            int i26 = i23 ^ 71;
            int i27 = ((((i23 & 71) | i26) << 1) - (~(-i26))) - 1;
            int i28 = i27 % 128;
            a = i28;
            long j12 = j4 | (i27 % 2 == 0 ? (j11 ^ ((j8 / 255) >>> 68)) - ((j9 | 255) >>> 53) : j11 | ((j8 & 255) << 24) | ((j9 & 255) << 32)) | ((j2 & 255) << 40) | ((j10 & 255) << 48);
            int i29 = ((i28 ^ 113) | (i28 & 113)) << 1;
            int i30 = -((i28 & (-114)) | ((~i28) & 113));
            int i31 = (i29 & i30) + (i29 | i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            return j12;
        }

        public final void K() {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 23;
            int i6 = ((i4 ^ 23) | i5) << 1;
            int i7 = -((~i5) & (i4 | 23));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = this.h;
            if (i10 != 0) {
                i = i11 % this.j;
            } else {
                int i12 = this.j;
                int i13 = i11 & i12;
                int i14 = (i11 | i12) & (~i13);
                int i15 = -(-(i13 << 1));
                i = (i14 | i15) + (i14 & i15);
            }
            this.h = i;
            int i16 = -this.f;
            int i17 = ((~i16) & i) | ((~i) & i16);
            int i18 = -(-((i16 & i) << 1));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            int i20 = this.m;
            Object obj = null;
            if (i19 <= i20) {
                this.j = 0;
                int i21 = i4 & 91;
                int i22 = -(-((i4 ^ 91) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i24 = (((i9 | 94) << 1) - (i9 ^ 94)) - 1;
            int i25 = i24 % 128;
            a = i25;
            if (i24 % 2 == 0) {
                i2 = i19 * i20;
            } else {
                int i26 = -i20;
                i2 = (((i19 ^ i26) | (i19 & i26)) << 1) - ((i26 & (~i19)) | ((~i26) & i19));
            }
            this.j = i2;
            this.h = (i - (~(-i2))) - 1;
            int i27 = i25 ^ 25;
            int i28 = ((i25 & 25) | i27) << 1;
            int i29 = -i27;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final int k(int i) throws C0065v {
            int i2 = 2 % 2;
            int i3 = b + 103;
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (i < 0) {
                throw C0065v.i();
            }
            int i6 = i4 + 83;
            b = i6 % 128;
            int i7 = i6 % 2;
            int iH = h();
            int i8 = -(-i);
            int i9 = (iH & i8) + (i8 | iH);
            int i10 = this.m;
            if (i9 > i10) {
                throw C0065v.c();
            }
            int i11 = b + 49;
            a = i11 % 128;
            int i12 = i11 % 2;
            this.m = i9;
            K();
            int i13 = a;
            int i14 = i13 ^ 41;
            int i15 = -(-((i13 & 41) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            return i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
        
            if (r1 <= ((r8 & r5) + (r5 | r8))) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        
            r4 = ((r3 ^ 126) + ((r3 & 126) << 1)) - 1;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        
            if ((r4 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.as.c.c(r9.g, r6, r1);
            r3 = r9.k;
            r1 = -(-r1);
            r4 = ((~r1) & r3) | ((~r3) & r1);
            r1 = (r1 & r3) << 1;
            r9.k = (r4 & r1) + (r1 | r4);
            r1 = ivas.gov.bisp.enumeration.aD.P.biX.a;
            r1 = (-2) - ((((r1 | 32) << 1) - (r1 ^ 32)) ^ (-1));
            ivas.gov.bisp.enumeration.aD.P.biX.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
        
            ivas.gov.bisp.enumeration.aD.as.c.c(r9.g, r6, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
        
            if (r1 <= ((r7 ^ r5) + ((r5 & r7) << 1))) goto L11;
         */
        @Override // ivas.gov.bisp.enumeration.aD.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String z() throws ivas.gov.bisp.enumeration.aD.C0065v {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.P.biX.z():java.lang.String");
        }

        @Override // ivas.gov.bisp.enumeration.aD.P
        public final boolean C(int i) throws C0065v {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 + 83;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = i & 7;
            int i8 = 0;
            Object obj = null;
            if (i7 == 0) {
                int i9 = this.h;
                int i10 = -this.k;
                if ((i9 & i10) + (i9 | i10) < 10) {
                    while (i8 < 10) {
                        int i11 = b;
                        int i12 = (i11 ^ 77) + ((i11 & 77) << 1);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                        if (E() < 0) {
                            int i14 = (i8 & (-92)) | ((~i8) & 91);
                            int i15 = -(-((i8 & 91) << 1));
                            int i16 = (i14 & i15) + (i14 | i15);
                            i8 = (-2) - ((((i16 | (-89)) << 1) - (i16 ^ (-89))) ^ (-1));
                            int i17 = a;
                            int i18 = (((i17 | 34) << 1) - (i17 ^ 34)) - 1;
                            b = i18 % 128;
                            int i19 = i18 % 2;
                        }
                    }
                    throw C0065v.h();
                }
                int i20 = i5 & 35;
                int i21 = i20 + ((i5 ^ 35) | i20);
                int i22 = i21 % 128;
                a = i22;
                i8 = i21 % 2 == 0 ? 1 : 0;
                int i23 = i22 + 35;
                b = i23 % 128;
                int i24 = i23 % 2;
                while (i8 < 10) {
                    int i25 = b;
                    int i26 = (((i25 | 119) << 1) - (~(-(((~i25) & 119) | (i25 & (-120)))))) - 1;
                    int i27 = i26 % 128;
                    a = i27;
                    int i28 = i26 % 2;
                    byte[] bArr = this.g;
                    int i29 = this.k;
                    this.k = (i29 ^ 1) + ((i29 & 1) << 1);
                    int i30 = (i27 & 112) + (i27 | 112);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    int i32 = i31 % 128;
                    b = i32;
                    if (i31 % 2 != 0) {
                        byte b2 = bArr[i29];
                        obj.hashCode();
                        throw null;
                    }
                    if (bArr[i29] < 0) {
                        int i33 = i32 & 109;
                        int i34 = (~i33) & (i32 | 109);
                        int i35 = -(-(i33 << 1));
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        int i38 = (i8 ^ 69) + ((i8 & 69) << 1);
                        i8 = (i38 & (-68)) + (i38 | (-68));
                        int i39 = (i32 | 117) << 1;
                        int i40 = -(i32 ^ 117);
                        int i41 = (i39 & i40) + (i39 | i40);
                        a = i41 % 128;
                        if (i41 % 2 == 0) {
                            int i42 = 4 / 5;
                        }
                    }
                }
                throw C0065v.h();
                int i43 = a;
                int i44 = (i43 & 111) + (i43 | 111);
                b = i44 % 128;
                int i45 = i44 % 2;
                return true;
            }
            int i46 = i3 & 69;
            int i47 = (i3 | 69) & (~i46);
            int i48 = -(-(i46 << 1));
            int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
            int i50 = i49 % 128;
            b = i50;
            if (i49 % 2 == 0 ? i7 == 1 : i7 == 0) {
                H(8);
                int i51 = a;
                int i52 = i51 ^ 19;
                int i53 = -(-((i51 & 19) << 1));
                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                b = i54 % 128;
                int i55 = i54 % 2;
                return true;
            }
            int i56 = i50 + 113;
            a = i56 % 128;
            int i57 = i56 % 2;
            if (i7 == 2) {
                H(G());
                int i58 = a;
                int i59 = ((i58 ^ 9) - (~((i58 & 9) << 1))) - 1;
                b = i59 % 128;
                if (i59 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i60 = i50 + 19;
            a = i60 % 128;
            int i61 = i60 % 2;
            if (i7 != 3) {
                int i62 = i50 & 65;
                int i63 = (((~i62) & (i50 | 65)) - (~(-(-(i62 << 1))))) - 1;
                int i64 = i63 % 128;
                a = i64;
                if (i63 % 2 != 0 ? i7 == 4 : i7 == 5) {
                    int i65 = ((i50 | 17) << 1) - (i50 ^ 17);
                    a = i65 % 128;
                    int i66 = i65 % 2;
                    return false;
                }
                if (i7 != 5) {
                    throw C0065v.g();
                }
                int i67 = i64 & 121;
                int i68 = -(-(i64 | 121));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                b = i69 % 128;
                int i70 = i69 % 2;
                H(4);
                int i71 = b + 29;
                a = i71 % 128;
                if (i71 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            while (true) {
                int iV = v();
                if (iV == 0) {
                    break;
                }
                int i72 = a;
                int i73 = i72 & 89;
                int i74 = (i73 - (~(-(-((i72 ^ 89) | i73))))) - 1;
                b = i74 % 128;
                if (i74 % 2 != 0) {
                    int i75 = 5 / 0;
                    if (!C(iV)) {
                        break;
                    }
                } else if (!C(iV)) {
                    break;
                }
            }
            int i76 = (i >>> 3) << 3;
            int i77 = (i76 & (-5)) | ((~i76) & 4);
            int i78 = i76 & 4;
            g((i78 & i77) | (i77 ^ i78));
            int i79 = b;
            int i80 = i79 & 21;
            int i81 = -(-((i79 ^ 21) | i80));
            int i82 = (i80 & i81) + (i81 | i80);
            a = i82 % 128;
            if (i82 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0137 A[PHI: r2
  0x0137: PHI (r2v12 int) = (r2v11 int), (r2v95 int) binds: [B:29:0x0135, B:26:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x0158 A[PHI: r2
  0x0158: PHI (r2v18 int) = (r2v11 int), (r2v95 int) binds: [B:29:0x0135, B:26:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x016f  */
        /* JADX WARN: Code duplicated, block: B:36:0x017b  */
        /* JADX WARN: Code duplicated, block: B:38:0x0183 A[PHI: r2
  0x0183: PHI (r2v22 int) = (r2v21 int), (r2v92 int) binds: [B:37:0x0181, B:34:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x01ac A[PHI: r2
  0x01ac: PHI (r2v26 int) = (r2v21 int), (r2v92 int) binds: [B:37:0x0181, B:34:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:45:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:47:0x01d7 A[PHI: r9
  0x01d7: PHI (r9v26 long) = (r9v25 long), (r9v35 long) binds: [B:46:0x01d5, B:43:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:48:0x01f2 A[PHI: r9
  0x01f2: PHI (r9v28 long) = (r9v25 long), (r9v35 long) binds: [B:46:0x01d5, B:43:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x0213  */
        /* JADX WARN: Code duplicated, block: B:53:0x0218  */
        /* JADX WARN: Code duplicated, block: B:58:0x0257  */
        /* JADX WARN: Code duplicated, block: B:60:0x0292  */
        /* JADX WARN: Code duplicated, block: B:62:0x02c3  */
        /* JADX WARN: Code duplicated, block: B:65:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:66:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:68:0x0325  */
        /* JADX WARN: Code duplicated, block: B:71:0x032e A[PHI: r6
  0x032e: PHI (r6v52 long) = (r6v50 long), (r6v54 long) binds: [B:73:0x0336, B:69:0x032b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:72:0x0331  */
        /* JADX WARN: Code duplicated, block: B:74:0x0338 A[PHI: r6
  0x0338: PHI (r6v51 long) = (r6v50 long), (r6v54 long) binds: [B:73:0x0336, B:69:0x032b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:77:0x035e  */
        public final long I() throws C0065v {
            int i;
            int i2;
            long j;
            long j2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            long j3;
            int i8;
            long j4;
            int i9;
            int i10;
            long j5;
            long j6;
            long j7;
            int i11;
            int i12;
            long j8;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            long j9;
            int i18;
            long j10;
            int i19 = 2 % 2;
            int i20 = a;
            int i21 = (i20 & 59) + (i20 | 59);
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = this.k;
            int i25 = this.h;
            if (i25 != i24) {
                int i26 = (-2) - ((i22 + 58) ^ (-1));
                a = i26 % 128;
                int i27 = i26 % 2;
                byte[] bArr = this.g;
                int i28 = i24 ^ 1;
                int i29 = ((i24 & 1) | i28) << 1;
                int i30 = -i28;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                int i32 = ((i22 ^ 101) | (i22 & 101)) << 1;
                int i33 = -((i22 & (-102)) | ((~i22) & 101));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                int i35 = i34 % 128;
                a = i35;
                int i36 = i34 % 2;
                byte b2 = bArr[i24];
                if (b2 >= 0) {
                    int i37 = i35 & 25;
                    int i38 = (~i37) & (i35 | 25);
                    int i39 = -(-(i37 << 1));
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    this.k = i31;
                    long j11 = b2;
                    int i42 = i35 & 125;
                    int i43 = ((i35 ^ 125) | i42) << 1;
                    int i44 = -((~i42) & (i35 | 125));
                    int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        int i46 = 4 / 0;
                    }
                    return j11;
                }
                int i47 = -i31;
                int i48 = (i25 | i47) << 1;
                int i49 = -(((~i25) & i47) | ((~i47) & i25));
                if ((i48 ^ i49) + ((i49 & i48) << 1) >= 9) {
                    int i50 = ((i22 ^ 106) + ((i22 & 106) << 1)) - 1;
                    a = i50 % 128;
                    if (i50 % 2 == 0) {
                        i = bArr[i31] % 117;
                    } else {
                        int i51 = i31 & 1;
                        int i52 = (~i51) & (i31 | 1);
                        int i53 = -(-(i51 << 1));
                        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                        i = bArr[i31] << 7;
                        i31 = i54;
                    }
                    int i55 = ((~b2) & i) | ((~i) & b2);
                    if (i55 >= 0) {
                        int i56 = i31 & 1;
                        int i57 = ((((i31 ^ 1) | i56) << 1) - (~(-((~i56) & (i31 | 1))))) - 1;
                        byte b3 = bArr[i31];
                        int i58 = ((i22 & (-96)) | ((~i22) & 95)) + ((i22 & 95) << 1);
                        int i59 = i58 % 128;
                        a = i59;
                        if (i58 % 2 == 0) {
                            int i60 = b3 & 14;
                            int i61 = ((b3 | 14) & (~i60)) + (i60 << 1);
                            int i62 = ((~i61) & i55) | ((~i55) & i61);
                            int i63 = i55 & i61;
                            i2 = (i63 & i62) | (i62 ^ i63);
                            if (i2 >= 0) {
                                int i64 = i59 ^ 73;
                                int i65 = (i59 & 73) << 1;
                                int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                                int i67 = i66 % 128;
                                b = i67;
                                int i68 = i66 % 2;
                                j = ((~i2) & 16256) ^ (i2 & (-16257));
                                int i69 = i67 + 49;
                                a = i69 % 128;
                                int i70 = i69 % 2;
                            } else {
                                i31 = ((i57 & 1) << 1) + (i57 ^ 1);
                                i3 = bArr[i57] << 21;
                                i4 = (i22 & 83) + (i22 | 83);
                                i5 = i4 % 128;
                                a = i5;
                                if (i4 % 2 == 0) {
                                    int i71 = i2 & i3;
                                    int i72 = (i2 | i3) & (~i71);
                                    i6 = (i72 & i71) | (i72 ^ i71);
                                    if (i6 < 0) {
                                        i7 = ((~i6) & (-2080896)) ^ (2080895 & i6);
                                        int i73 = i5 & 97;
                                        int i74 = (i73 - (~((i5 ^ 97) | i73))) - 1;
                                        b = i74 % 128;
                                        int i75 = i74 % 2;
                                    } else {
                                        j3 = i6;
                                        int i76 = i31 & 1;
                                        i8 = ((~i76) & (i31 | 1)) + (i76 << 1);
                                        j4 = bArr[i31];
                                        i9 = (i5 ^ 11) + ((i5 & 11) << 1);
                                        i10 = i9 % 128;
                                        b = i10;
                                        if (i9 % 2 != 0) {
                                            j5 = j3 + (j4 << 28);
                                            if (j5 >= 0) {
                                                int i77 = (i10 & (-70)) | ((~i10) & 69);
                                                int i78 = -(-((i10 & 69) << 1));
                                                int i79 = (i77 & i78) + (i78 | i77);
                                                a = i79 % 128;
                                                int i80 = i79 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81 = i8 & 1;
                                                i31 = ((~i81) & (i8 | 1)) + (i81 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0 ? j7 >= 0 : j7 >= 0) {
                                                    int i82 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i83 = -(-((i31 & 1) << 1));
                                                    i14 = ((i82 | i83) << 1) - (i82 ^ i83);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i84 = i12 + 9;
                                                    i15 = i84 % 128;
                                                    b = i15;
                                                    int i85 = i84 % 2;
                                                    if (j5 >= 0) {
                                                        int i86 = i15 & 1;
                                                        int i87 = -(-((i15 ^ 1) | i86));
                                                        int i88 = (i86 ^ i87) + ((i86 & i87) << 1);
                                                        a = i88 % 128;
                                                        int i89 = i88 % 2;
                                                        int i90 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i90 % 128;
                                                        int i91 = i90 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i92 = i14 & 1;
                                                        int i93 = ((i14 ^ 1) | i92) << 1;
                                                        int i94 = -((~i92) & (i14 | 1));
                                                        i16 = ((i93 | i94) << 1) - (i93 ^ i94);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i95 = i15 | 3;
                                                        int i96 = i95 << 1;
                                                        int i97 = -(i95 & (~(i15 & 3)));
                                                        int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                                                        a = i98 % 128;
                                                        int i99 = i98 % 2;
                                                        if (j7 < 0) {
                                                            int i100 = (i15 & 43) + (i15 | 43);
                                                            a = i100 % 128;
                                                            int i101 = i100 % 2;
                                                            int i102 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i102 % 128;
                                                            int i103 = i102 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                        } else {
                                                            int i104 = i16 & 1;
                                                            int i105 = (~i104) & (i16 | 1);
                                                            int i106 = i104 << 1;
                                                            i17 = ((i105 | i106) << 1) - (i106 ^ i105);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i107 = (i15 & 45) + (i15 | 45);
                                                                    a = i107 % 128;
                                                                    int i108 = i107 % 2;
                                                                    int i109 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i110 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i109 | i110) << 1) - (i109 ^ i110);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1010 = (i15 & 45) + (i15 | 45);
                                                                    a = i1010 % 128;
                                                                    int i1011 = i1010 % 2;
                                                                    int i1012 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1012 | i111) << 1) - (i1012 ^ i111);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i112 = i10 ^ 31;
                                                    int i113 = -(-((i10 & 31) << 1));
                                                    int i114 = (i112 & i113) + (i113 | i112);
                                                    a = i114 % 128;
                                                    int i115 = i114 % 2;
                                                    j8 = -34093383808L;
                                                }
                                                j2 = j8 ^ j7;
                                                int i116 = a;
                                                i13 = (((i116 | 84) << 1) - (i116 ^ 84)) - 1;
                                                b = i13 % 128;
                                                if (i13 % 2 != 0) {
                                                    int i117 = 3 / 2;
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i118 = b;
                                            int i119 = ((i118 ^ 100) + ((i118 & 100) << 1)) - 1;
                                            a = i119 % 128;
                                            int i120 = i119 % 2;
                                        } else {
                                            j5 = j3 ^ (j4 << 28);
                                            if (j5 >= 0) {
                                                int i710 = (i10 & (-70)) | ((~i10) & 69);
                                                int i711 = -(-((i10 & 69) << 1));
                                                int i712 = (i710 & i711) + (i711 | i710);
                                                a = i712 % 128;
                                                int i810 = i712 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i811 = i8 & 1;
                                                i31 = ((~i811) & (i8 | 1)) + (i811 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i812 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i813 = -(-((i31 & 1) << 1));
                                                    i14 = ((i812 | i813) << 1) - (i812 ^ i813);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i814 = i12 + 9;
                                                    i15 = i814 % 128;
                                                    b = i15;
                                                    int i815 = i814 % 2;
                                                    if (j5 >= 0) {
                                                        int i816 = i15 & 1;
                                                        int i817 = -(-((i15 ^ 1) | i816));
                                                        int i818 = (i816 ^ i817) + ((i816 & i817) << 1);
                                                        a = i818 % 128;
                                                        int i819 = i818 % 2;
                                                        int i910 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i910 % 128;
                                                        int i911 = i910 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i912 = i14 & 1;
                                                        int i913 = ((i14 ^ 1) | i912) << 1;
                                                        int i914 = -((~i912) & (i14 | 1));
                                                        i16 = ((i913 | i914) << 1) - (i913 ^ i914);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i915 = i15 | 3;
                                                        int i916 = i915 << 1;
                                                        int i917 = -(i915 & (~(i15 & 3)));
                                                        int i918 = ((i916 | i917) << 1) - (i917 ^ i916);
                                                        a = i918 % 128;
                                                        int i919 = i918 % 2;
                                                        if (j7 < 0) {
                                                            int i1013 = (i15 & 43) + (i15 | 43);
                                                            a = i1013 % 128;
                                                            int i1014 = i1013 % 2;
                                                            int i1015 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i1015 % 128;
                                                            int i1016 = i1015 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1110 = a;
                                                            i13 = (((i1110 | 84) << 1) - (i1110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i1017 = i16 & 1;
                                                            int i1018 = (~i1017) & (i16 | 1);
                                                            int i1019 = i1017 << 1;
                                                            i17 = ((i1018 | i1019) << 1) - (i1019 ^ i1018);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10110 = (i15 & 45) + (i15 | 45);
                                                                    a = i10110 % 128;
                                                                    int i10111 = i10110 % 2;
                                                                    int i10112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10112 | i1112) << 1) - (i10112 ^ i1112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10113 = (i15 & 45) + (i15 | 45);
                                                                    a = i10113 % 128;
                                                                    int i10114 = i10113 % 2;
                                                                    int i10115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10115 | i1113) << 1) - (i10115 ^ i1113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i8110 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i8111 = -(-((i31 & 1) << 1));
                                                    i14 = ((i8110 | i8111) << 1) - (i8110 ^ i8111);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i8112 = i12 + 9;
                                                    i15 = i8112 % 128;
                                                    b = i15;
                                                    int i8113 = i8112 % 2;
                                                    if (j5 >= 0) {
                                                        int i8114 = i15 & 1;
                                                        int i8115 = -(-((i15 ^ 1) | i8114));
                                                        int i8116 = (i8114 ^ i8115) + ((i8114 & i8115) << 1);
                                                        a = i8116 % 128;
                                                        int i8117 = i8116 % 2;
                                                        int i9110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i9110 % 128;
                                                        int i9111 = i9110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i9112 = i14 & 1;
                                                        int i9113 = ((i14 ^ 1) | i9112) << 1;
                                                        int i9114 = -((~i9112) & (i14 | 1));
                                                        i16 = ((i9113 | i9114) << 1) - (i9113 ^ i9114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i9115 = i15 | 3;
                                                        int i9116 = i9115 << 1;
                                                        int i9117 = -(i9115 & (~(i15 & 3)));
                                                        int i9118 = ((i9116 | i9117) << 1) - (i9117 ^ i9116);
                                                        a = i9118 % 128;
                                                        int i9119 = i9118 % 2;
                                                        if (j7 < 0) {
                                                            int i10116 = (i15 & 43) + (i15 | 43);
                                                            a = i10116 % 128;
                                                            int i10117 = i10116 % 2;
                                                            int i10118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i10118 % 128;
                                                            int i10119 = i10118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1114 = a;
                                                            i13 = (((i1114 | 84) << 1) - (i1114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10120 = i16 & 1;
                                                            int i10121 = (~i10120) & (i16 | 1);
                                                            int i10122 = i10120 << 1;
                                                            i17 = ((i10121 | i10122) << 1) - (i10122 ^ i10121);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101110 = (i15 & 45) + (i15 | 45);
                                                                    a = i101110 % 128;
                                                                    int i101111 = i101110 % 2;
                                                                    int i101112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101112 | i1116) << 1) - (i101112 ^ i1116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101113 = (i15 & 45) + (i15 | 45);
                                                                    a = i101113 % 128;
                                                                    int i101114 = i101113 % 2;
                                                                    int i101115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101115 | i1117) << 1) - (i101115 ^ i1117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i1118 = b;
                                            int i1119 = ((i1118 ^ 100) + ((i1118 & 100) << 1)) - 1;
                                            a = i1119 % 128;
                                            int i121 = i1119 % 2;
                                        }
                                    }
                                } else {
                                    int i122 = i2 & i3;
                                    i6 = ((i2 ^ i3) | i122) & (~i122);
                                    if (i6 < 0) {
                                        i7 = ((~i6) & (-2080896)) ^ (2080895 & i6);
                                        int i713 = i5 & 97;
                                        int i714 = (i713 - (~((i5 ^ 97) | i713))) - 1;
                                        b = i714 % 128;
                                        int i715 = i714 % 2;
                                    } else {
                                        j3 = i6;
                                        int i716 = i31 & 1;
                                        i8 = ((~i716) & (i31 | 1)) + (i716 << 1);
                                        j4 = bArr[i31];
                                        i9 = (i5 ^ 11) + ((i5 & 11) << 1);
                                        i10 = i9 % 128;
                                        b = i10;
                                        if (i9 % 2 != 0) {
                                            j5 = j3 + (j4 << 28);
                                            if (j5 >= 0) {
                                                int i717 = (i10 & (-70)) | ((~i10) & 69);
                                                int i718 = -(-((i10 & 69) << 1));
                                                int i719 = (i717 & i718) + (i718 | i717);
                                                a = i719 % 128;
                                                int i8118 = i719 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i8119 = i8 & 1;
                                                i31 = ((~i8119) & (i8 | 1)) + (i8119 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i81110 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i81111 = -(-((i31 & 1) << 1));
                                                    i14 = ((i81110 | i81111) << 1) - (i81110 ^ i81111);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i81112 = i12 + 9;
                                                    i15 = i81112 % 128;
                                                    b = i15;
                                                    int i81113 = i81112 % 2;
                                                    if (j5 >= 0) {
                                                        int i81114 = i15 & 1;
                                                        int i81115 = -(-((i15 ^ 1) | i81114));
                                                        int i81116 = (i81114 ^ i81115) + ((i81114 & i81115) << 1);
                                                        a = i81116 % 128;
                                                        int i81117 = i81116 % 2;
                                                        int i91110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i91110 % 128;
                                                        int i91111 = i91110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i91112 = i14 & 1;
                                                        int i91113 = ((i14 ^ 1) | i91112) << 1;
                                                        int i91114 = -((~i91112) & (i14 | 1));
                                                        i16 = ((i91113 | i91114) << 1) - (i91113 ^ i91114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i91115 = i15 | 3;
                                                        int i91116 = i91115 << 1;
                                                        int i91117 = -(i91115 & (~(i15 & 3)));
                                                        int i91118 = ((i91116 | i91117) << 1) - (i91117 ^ i91116);
                                                        a = i91118 % 128;
                                                        int i91119 = i91118 % 2;
                                                        if (j7 < 0) {
                                                            int i101116 = (i15 & 43) + (i15 | 43);
                                                            a = i101116 % 128;
                                                            int i101117 = i101116 % 2;
                                                            int i101118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i101118 % 128;
                                                            int i101119 = i101118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i11110 = a;
                                                            i13 = (((i11110 | 84) << 1) - (i11110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i11111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10123 = i16 & 1;
                                                            int i10124 = (~i10123) & (i16 | 1);
                                                            int i10125 = i10123 << 1;
                                                            i17 = ((i10124 | i10125) << 1) - (i10125 ^ i10124);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011110 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011110 % 128;
                                                                    int i1011111 = i1011110 % 2;
                                                                    int i1011112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011112 | i11112) << 1) - (i1011112 ^ i11112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011113 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011113 % 128;
                                                                    int i1011114 = i1011113 % 2;
                                                                    int i1011115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011115 | i11113) << 1) - (i1011115 ^ i11113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i81118 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i81119 = -(-((i31 & 1) << 1));
                                                    i14 = ((i81118 | i81119) << 1) - (i81118 ^ i81119);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i811110 = i12 + 9;
                                                    i15 = i811110 % 128;
                                                    b = i15;
                                                    int i811111 = i811110 % 2;
                                                    if (j5 >= 0) {
                                                        int i811112 = i15 & 1;
                                                        int i811113 = -(-((i15 ^ 1) | i811112));
                                                        int i811114 = (i811112 ^ i811113) + ((i811112 & i811113) << 1);
                                                        a = i811114 % 128;
                                                        int i811115 = i811114 % 2;
                                                        int i911110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i911110 % 128;
                                                        int i911111 = i911110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i911112 = i14 & 1;
                                                        int i911113 = ((i14 ^ 1) | i911112) << 1;
                                                        int i911114 = -((~i911112) & (i14 | 1));
                                                        i16 = ((i911113 | i911114) << 1) - (i911113 ^ i911114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i911115 = i15 | 3;
                                                        int i911116 = i911115 << 1;
                                                        int i911117 = -(i911115 & (~(i15 & 3)));
                                                        int i911118 = ((i911116 | i911117) << 1) - (i911117 ^ i911116);
                                                        a = i911118 % 128;
                                                        int i911119 = i911118 % 2;
                                                        if (j7 < 0) {
                                                            int i1011116 = (i15 & 43) + (i15 | 43);
                                                            a = i1011116 % 128;
                                                            int i1011117 = i1011116 % 2;
                                                            int i1011118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i1011118 % 128;
                                                            int i1011119 = i1011118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i11114 = a;
                                                            i13 = (((i11114 | 84) << 1) - (i11114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i11115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10126 = i16 & 1;
                                                            int i10127 = (~i10126) & (i16 | 1);
                                                            int i10128 = i10126 << 1;
                                                            i17 = ((i10127 | i10128) << 1) - (i10128 ^ i10127);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111110 % 128;
                                                                    int i10111111 = i10111110 % 2;
                                                                    int i10111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111112 | i11116) << 1) - (i10111112 ^ i11116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111113 % 128;
                                                                    int i10111114 = i10111113 % 2;
                                                                    int i10111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111115 | i11117) << 1) - (i10111115 ^ i11117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i11118 = b;
                                            int i11119 = ((i11118 ^ 100) + ((i11118 & 100) << 1)) - 1;
                                            a = i11119 % 128;
                                            int i123 = i11119 % 2;
                                        } else {
                                            j5 = j3 ^ (j4 << 28);
                                            if (j5 >= 0) {
                                                int i7110 = (i10 & (-70)) | ((~i10) & 69);
                                                int i7111 = -(-((i10 & 69) << 1));
                                                int i7112 = (i7110 & i7111) + (i7111 | i7110);
                                                a = i7112 % 128;
                                                int i81120 = i7112 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81121 = i8 & 1;
                                                i31 = ((~i81121) & (i8 | 1)) + (i81121 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i811116 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i811117 = -(-((i31 & 1) << 1));
                                                    i14 = ((i811116 | i811117) << 1) - (i811116 ^ i811117);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i811118 = i12 + 9;
                                                    i15 = i811118 % 128;
                                                    b = i15;
                                                    int i811119 = i811118 % 2;
                                                    if (j5 >= 0) {
                                                        int i8111110 = i15 & 1;
                                                        int i8111111 = -(-((i15 ^ 1) | i8111110));
                                                        int i8111112 = (i8111110 ^ i8111111) + ((i8111110 & i8111111) << 1);
                                                        a = i8111112 % 128;
                                                        int i8111113 = i8111112 % 2;
                                                        int i9111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i9111110 % 128;
                                                        int i9111111 = i9111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i9111112 = i14 & 1;
                                                        int i9111113 = ((i14 ^ 1) | i9111112) << 1;
                                                        int i9111114 = -((~i9111112) & (i14 | 1));
                                                        i16 = ((i9111113 | i9111114) << 1) - (i9111113 ^ i9111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i9111115 = i15 | 3;
                                                        int i9111116 = i9111115 << 1;
                                                        int i9111117 = -(i9111115 & (~(i15 & 3)));
                                                        int i9111118 = ((i9111116 | i9111117) << 1) - (i9111117 ^ i9111116);
                                                        a = i9111118 % 128;
                                                        int i9111119 = i9111118 % 2;
                                                        if (j7 < 0) {
                                                            int i10111116 = (i15 & 43) + (i15 | 43);
                                                            a = i10111116 % 128;
                                                            int i10111117 = i10111116 % 2;
                                                            int i10111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i10111118 % 128;
                                                            int i10111119 = i10111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i111110 = a;
                                                            i13 = (((i111110 | 84) << 1) - (i111110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i111111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10129 = i16 & 1;
                                                            int i101210 = (~i10129) & (i16 | 1);
                                                            int i101211 = i10129 << 1;
                                                            i17 = ((i101210 | i101211) << 1) - (i101211 ^ i101210);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111110 % 128;
                                                                    int i101111111 = i101111110 % 2;
                                                                    int i101111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111112 | i111112) << 1) - (i101111112 ^ i111112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111113 % 128;
                                                                    int i101111114 = i101111113 % 2;
                                                                    int i101111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111115 | i111113) << 1) - (i101111115 ^ i111113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i8111114 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i8111115 = -(-((i31 & 1) << 1));
                                                    i14 = ((i8111114 | i8111115) << 1) - (i8111114 ^ i8111115);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i8111116 = i12 + 9;
                                                    i15 = i8111116 % 128;
                                                    b = i15;
                                                    int i8111117 = i8111116 % 2;
                                                    if (j5 >= 0) {
                                                        int i8111118 = i15 & 1;
                                                        int i8111119 = -(-((i15 ^ 1) | i8111118));
                                                        int i81111110 = (i8111118 ^ i8111119) + ((i8111118 & i8111119) << 1);
                                                        a = i81111110 % 128;
                                                        int i81111111 = i81111110 % 2;
                                                        int i91111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i91111110 % 128;
                                                        int i91111111 = i91111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i91111112 = i14 & 1;
                                                        int i91111113 = ((i14 ^ 1) | i91111112) << 1;
                                                        int i91111114 = -((~i91111112) & (i14 | 1));
                                                        i16 = ((i91111113 | i91111114) << 1) - (i91111113 ^ i91111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i91111115 = i15 | 3;
                                                        int i91111116 = i91111115 << 1;
                                                        int i91111117 = -(i91111115 & (~(i15 & 3)));
                                                        int i91111118 = ((i91111116 | i91111117) << 1) - (i91111117 ^ i91111116);
                                                        a = i91111118 % 128;
                                                        int i91111119 = i91111118 % 2;
                                                        if (j7 < 0) {
                                                            int i101111116 = (i15 & 43) + (i15 | 43);
                                                            a = i101111116 % 128;
                                                            int i101111117 = i101111116 % 2;
                                                            int i101111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i101111118 % 128;
                                                            int i101111119 = i101111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i111114 = a;
                                                            i13 = (((i111114 | 84) << 1) - (i111114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i111115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i101212 = i16 & 1;
                                                            int i101213 = (~i101212) & (i16 | 1);
                                                            int i101214 = i101212 << 1;
                                                            i17 = ((i101213 | i101214) << 1) - (i101214 ^ i101213);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111110 % 128;
                                                                    int i1011111111 = i1011111110 % 2;
                                                                    int i1011111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111112 | i111116) << 1) - (i1011111112 ^ i111116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111113 % 128;
                                                                    int i1011111114 = i1011111113 % 2;
                                                                    int i1011111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111115 | i111117) << 1) - (i1011111115 ^ i111117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i111118 = b;
                                            int i111119 = ((i111118 ^ 100) + ((i111118 & 100) << 1)) - 1;
                                            a = i111119 % 128;
                                            int i124 = i111119 % 2;
                                        }
                                    }
                                }
                            }
                            int i125 = b;
                            int i126 = i125 & 55;
                            int i127 = i125 | 55;
                            int i128 = (i126 & i127) + (i127 | i126);
                            a = i128 % 128;
                            int i129 = i128 % 2;
                            j2 = j;
                            i31 = i57;
                        } else {
                            int i130 = b3 << 14;
                            int i131 = (~i130) & i55;
                            int i132 = (~i55) & i130;
                            i2 = (i132 & i131) | (i131 ^ i132);
                            if (i2 >= 0) {
                                int i610 = i59 ^ 73;
                                int i611 = (i59 & 73) << 1;
                                int i612 = (i610 ^ i611) + ((i610 & i611) << 1);
                                int i613 = i612 % 128;
                                b = i613;
                                int i614 = i612 % 2;
                                j = ((~i2) & 16256) ^ (i2 & (-16257));
                                int i615 = i613 + 49;
                                a = i615 % 128;
                                int i720 = i615 % 2;
                            } else {
                                i31 = ((i57 & 1) << 1) + (i57 ^ 1);
                                i3 = bArr[i57] << 21;
                                i4 = (i22 & 83) + (i22 | 83);
                                i5 = i4 % 128;
                                a = i5;
                                if (i4 % 2 == 0) {
                                    int i721 = i2 & i3;
                                    int i722 = (i2 | i3) & (~i721);
                                    i6 = (i722 & i721) | (i722 ^ i721);
                                    if (i6 < 0) {
                                        i7 = ((~i6) & (-2080896)) ^ (2080895 & i6);
                                        int i7113 = i5 & 97;
                                        int i7114 = (i7113 - (~((i5 ^ 97) | i7113))) - 1;
                                        b = i7114 % 128;
                                        int i7115 = i7114 % 2;
                                    } else {
                                        j3 = i6;
                                        int i7116 = i31 & 1;
                                        i8 = ((~i7116) & (i31 | 1)) + (i7116 << 1);
                                        j4 = bArr[i31];
                                        i9 = (i5 ^ 11) + ((i5 & 11) << 1);
                                        i10 = i9 % 128;
                                        b = i10;
                                        if (i9 % 2 != 0) {
                                            j5 = j3 + (j4 << 28);
                                            if (j5 >= 0) {
                                                int i7117 = (i10 & (-70)) | ((~i10) & 69);
                                                int i7118 = -(-((i10 & 69) << 1));
                                                int i7119 = (i7117 & i7118) + (i7118 | i7117);
                                                a = i7119 % 128;
                                                int i81122 = i7119 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81123 = i8 & 1;
                                                i31 = ((~i81123) & (i8 | 1)) + (i81123 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i81111112 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i81111113 = -(-((i31 & 1) << 1));
                                                    i14 = ((i81111112 | i81111113) << 1) - (i81111112 ^ i81111113);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i81111114 = i12 + 9;
                                                    i15 = i81111114 % 128;
                                                    b = i15;
                                                    int i81111115 = i81111114 % 2;
                                                    if (j5 >= 0) {
                                                        int i81111116 = i15 & 1;
                                                        int i81111117 = -(-((i15 ^ 1) | i81111116));
                                                        int i81111118 = (i81111116 ^ i81111117) + ((i81111116 & i81111117) << 1);
                                                        a = i81111118 % 128;
                                                        int i81111119 = i81111118 % 2;
                                                        int i911111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i911111110 % 128;
                                                        int i911111111 = i911111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i911111112 = i14 & 1;
                                                        int i911111113 = ((i14 ^ 1) | i911111112) << 1;
                                                        int i911111114 = -((~i911111112) & (i14 | 1));
                                                        i16 = ((i911111113 | i911111114) << 1) - (i911111113 ^ i911111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i911111115 = i15 | 3;
                                                        int i911111116 = i911111115 << 1;
                                                        int i911111117 = -(i911111115 & (~(i15 & 3)));
                                                        int i911111118 = ((i911111116 | i911111117) << 1) - (i911111117 ^ i911111116);
                                                        a = i911111118 % 128;
                                                        int i911111119 = i911111118 % 2;
                                                        if (j7 < 0) {
                                                            int i1011111116 = (i15 & 43) + (i15 | 43);
                                                            a = i1011111116 % 128;
                                                            int i1011111117 = i1011111116 % 2;
                                                            int i1011111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i1011111118 % 128;
                                                            int i1011111119 = i1011111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1111110 = a;
                                                            i13 = (((i1111110 | 84) << 1) - (i1111110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1111111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i101215 = i16 & 1;
                                                            int i101216 = (~i101215) & (i16 | 1);
                                                            int i101217 = i101215 << 1;
                                                            i17 = ((i101216 | i101217) << 1) - (i101217 ^ i101216);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111110 % 128;
                                                                    int i10111111111 = i10111111110 % 2;
                                                                    int i10111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111112 | i1111112) << 1) - (i10111111112 ^ i1111112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111113 % 128;
                                                                    int i10111111114 = i10111111113 % 2;
                                                                    int i10111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111115 | i1111113) << 1) - (i10111111115 ^ i1111113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i811111110 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i811111111 = -(-((i31 & 1) << 1));
                                                    i14 = ((i811111110 | i811111111) << 1) - (i811111110 ^ i811111111);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i811111112 = i12 + 9;
                                                    i15 = i811111112 % 128;
                                                    b = i15;
                                                    int i811111113 = i811111112 % 2;
                                                    if (j5 >= 0) {
                                                        int i811111114 = i15 & 1;
                                                        int i811111115 = -(-((i15 ^ 1) | i811111114));
                                                        int i811111116 = (i811111114 ^ i811111115) + ((i811111114 & i811111115) << 1);
                                                        a = i811111116 % 128;
                                                        int i811111117 = i811111116 % 2;
                                                        int i9111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i9111111110 % 128;
                                                        int i9111111111 = i9111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i9111111112 = i14 & 1;
                                                        int i9111111113 = ((i14 ^ 1) | i9111111112) << 1;
                                                        int i9111111114 = -((~i9111111112) & (i14 | 1));
                                                        i16 = ((i9111111113 | i9111111114) << 1) - (i9111111113 ^ i9111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i9111111115 = i15 | 3;
                                                        int i9111111116 = i9111111115 << 1;
                                                        int i9111111117 = -(i9111111115 & (~(i15 & 3)));
                                                        int i9111111118 = ((i9111111116 | i9111111117) << 1) - (i9111111117 ^ i9111111116);
                                                        a = i9111111118 % 128;
                                                        int i9111111119 = i9111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i10111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i10111111116 % 128;
                                                            int i10111111117 = i10111111116 % 2;
                                                            int i10111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i10111111118 % 128;
                                                            int i10111111119 = i10111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1111114 = a;
                                                            i13 = (((i1111114 | 84) << 1) - (i1111114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1111115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i101218 = i16 & 1;
                                                            int i101219 = (~i101218) & (i16 | 1);
                                                            int i1012110 = i101218 << 1;
                                                            i17 = ((i101219 | i1012110) << 1) - (i1012110 ^ i101219);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111110 % 128;
                                                                    int i101111111111 = i101111111110 % 2;
                                                                    int i101111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111112 | i1111116) << 1) - (i101111111112 ^ i1111116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111113 % 128;
                                                                    int i101111111114 = i101111111113 % 2;
                                                                    int i101111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111115 | i1111117) << 1) - (i101111111115 ^ i1111117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i1111118 = b;
                                            int i1111119 = ((i1111118 ^ 100) + ((i1111118 & 100) << 1)) - 1;
                                            a = i1111119 % 128;
                                            int i1210 = i1111119 % 2;
                                        } else {
                                            j5 = j3 ^ (j4 << 28);
                                            if (j5 >= 0) {
                                                int i71110 = (i10 & (-70)) | ((~i10) & 69);
                                                int i71111 = -(-((i10 & 69) << 1));
                                                int i71112 = (i71110 & i71111) + (i71111 | i71110);
                                                a = i71112 % 128;
                                                int i81124 = i71112 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81125 = i8 & 1;
                                                i31 = ((~i81125) & (i8 | 1)) + (i81125 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i811111118 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i811111119 = -(-((i31 & 1) << 1));
                                                    i14 = ((i811111118 | i811111119) << 1) - (i811111118 ^ i811111119);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i8111111110 = i12 + 9;
                                                    i15 = i8111111110 % 128;
                                                    b = i15;
                                                    int i8111111111 = i8111111110 % 2;
                                                    if (j5 >= 0) {
                                                        int i8111111112 = i15 & 1;
                                                        int i8111111113 = -(-((i15 ^ 1) | i8111111112));
                                                        int i8111111114 = (i8111111112 ^ i8111111113) + ((i8111111112 & i8111111113) << 1);
                                                        a = i8111111114 % 128;
                                                        int i8111111115 = i8111111114 % 2;
                                                        int i91111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i91111111110 % 128;
                                                        int i91111111111 = i91111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i91111111112 = i14 & 1;
                                                        int i91111111113 = ((i14 ^ 1) | i91111111112) << 1;
                                                        int i91111111114 = -((~i91111111112) & (i14 | 1));
                                                        i16 = ((i91111111113 | i91111111114) << 1) - (i91111111113 ^ i91111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i91111111115 = i15 | 3;
                                                        int i91111111116 = i91111111115 << 1;
                                                        int i91111111117 = -(i91111111115 & (~(i15 & 3)));
                                                        int i91111111118 = ((i91111111116 | i91111111117) << 1) - (i91111111117 ^ i91111111116);
                                                        a = i91111111118 % 128;
                                                        int i91111111119 = i91111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i101111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i101111111116 % 128;
                                                            int i101111111117 = i101111111116 % 2;
                                                            int i101111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i101111111118 % 128;
                                                            int i101111111119 = i101111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i11111110 = a;
                                                            i13 = (((i11111110 | 84) << 1) - (i11111110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i11111111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i1012111 = i16 & 1;
                                                            int i1012112 = (~i1012111) & (i16 | 1);
                                                            int i1012113 = i1012111 << 1;
                                                            i17 = ((i1012112 | i1012113) << 1) - (i1012113 ^ i1012112);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111111110 % 128;
                                                                    int i1011111111111 = i1011111111110 % 2;
                                                                    int i1011111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11111112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111111112 | i11111112) << 1) - (i1011111111112 ^ i11111112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111111113 % 128;
                                                                    int i1011111111114 = i1011111111113 % 2;
                                                                    int i1011111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11111113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111111115 | i11111113) << 1) - (i1011111111115 ^ i11111113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i8111111116 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i8111111117 = -(-((i31 & 1) << 1));
                                                    i14 = ((i8111111116 | i8111111117) << 1) - (i8111111116 ^ i8111111117);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i8111111118 = i12 + 9;
                                                    i15 = i8111111118 % 128;
                                                    b = i15;
                                                    int i8111111119 = i8111111118 % 2;
                                                    if (j5 >= 0) {
                                                        int i81111111110 = i15 & 1;
                                                        int i81111111111 = -(-((i15 ^ 1) | i81111111110));
                                                        int i81111111112 = (i81111111110 ^ i81111111111) + ((i81111111110 & i81111111111) << 1);
                                                        a = i81111111112 % 128;
                                                        int i81111111113 = i81111111112 % 2;
                                                        int i911111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i911111111110 % 128;
                                                        int i911111111111 = i911111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i911111111112 = i14 & 1;
                                                        int i911111111113 = ((i14 ^ 1) | i911111111112) << 1;
                                                        int i911111111114 = -((~i911111111112) & (i14 | 1));
                                                        i16 = ((i911111111113 | i911111111114) << 1) - (i911111111113 ^ i911111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i911111111115 = i15 | 3;
                                                        int i911111111116 = i911111111115 << 1;
                                                        int i911111111117 = -(i911111111115 & (~(i15 & 3)));
                                                        int i911111111118 = ((i911111111116 | i911111111117) << 1) - (i911111111117 ^ i911111111116);
                                                        a = i911111111118 % 128;
                                                        int i911111111119 = i911111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i1011111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i1011111111116 % 128;
                                                            int i1011111111117 = i1011111111116 % 2;
                                                            int i1011111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i1011111111118 % 128;
                                                            int i1011111111119 = i1011111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i11111114 = a;
                                                            i13 = (((i11111114 | 84) << 1) - (i11111114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i11111115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i1012114 = i16 & 1;
                                                            int i1012115 = (~i1012114) & (i16 | 1);
                                                            int i1012116 = i1012114 << 1;
                                                            i17 = ((i1012115 | i1012116) << 1) - (i1012116 ^ i1012115);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111111110 % 128;
                                                                    int i10111111111111 = i10111111111110 % 2;
                                                                    int i10111111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11111116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111111112 | i11111116) << 1) - (i10111111111112 ^ i11111116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111111113 % 128;
                                                                    int i10111111111114 = i10111111111113 % 2;
                                                                    int i10111111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i11111117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111111115 | i11111117) << 1) - (i10111111111115 ^ i11111117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i11111118 = b;
                                            int i11111119 = ((i11111118 ^ 100) + ((i11111118 & 100) << 1)) - 1;
                                            a = i11111119 % 128;
                                            int i1211 = i11111119 % 2;
                                        }
                                    }
                                } else {
                                    int i1212 = i2 & i3;
                                    i6 = ((i2 ^ i3) | i1212) & (~i1212);
                                    if (i6 < 0) {
                                        i7 = ((~i6) & (-2080896)) ^ (2080895 & i6);
                                        int i71113 = i5 & 97;
                                        int i71114 = (i71113 - (~((i5 ^ 97) | i71113))) - 1;
                                        b = i71114 % 128;
                                        int i71115 = i71114 % 2;
                                    } else {
                                        j3 = i6;
                                        int i71116 = i31 & 1;
                                        i8 = ((~i71116) & (i31 | 1)) + (i71116 << 1);
                                        j4 = bArr[i31];
                                        i9 = (i5 ^ 11) + ((i5 & 11) << 1);
                                        i10 = i9 % 128;
                                        b = i10;
                                        if (i9 % 2 != 0) {
                                            j5 = j3 + (j4 << 28);
                                            if (j5 >= 0) {
                                                int i71117 = (i10 & (-70)) | ((~i10) & 69);
                                                int i71118 = -(-((i10 & 69) << 1));
                                                int i71119 = (i71117 & i71118) + (i71118 | i71117);
                                                a = i71119 % 128;
                                                int i81126 = i71119 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81127 = i8 & 1;
                                                i31 = ((~i81127) & (i8 | 1)) + (i81127 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i81111111114 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i81111111115 = -(-((i31 & 1) << 1));
                                                    i14 = ((i81111111114 | i81111111115) << 1) - (i81111111114 ^ i81111111115);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i81111111116 = i12 + 9;
                                                    i15 = i81111111116 % 128;
                                                    b = i15;
                                                    int i81111111117 = i81111111116 % 2;
                                                    if (j5 >= 0) {
                                                        int i81111111118 = i15 & 1;
                                                        int i81111111119 = -(-((i15 ^ 1) | i81111111118));
                                                        int i811111111110 = (i81111111118 ^ i81111111119) + ((i81111111118 & i81111111119) << 1);
                                                        a = i811111111110 % 128;
                                                        int i811111111111 = i811111111110 % 2;
                                                        int i9111111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i9111111111110 % 128;
                                                        int i9111111111111 = i9111111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i9111111111112 = i14 & 1;
                                                        int i9111111111113 = ((i14 ^ 1) | i9111111111112) << 1;
                                                        int i9111111111114 = -((~i9111111111112) & (i14 | 1));
                                                        i16 = ((i9111111111113 | i9111111111114) << 1) - (i9111111111113 ^ i9111111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i9111111111115 = i15 | 3;
                                                        int i9111111111116 = i9111111111115 << 1;
                                                        int i9111111111117 = -(i9111111111115 & (~(i15 & 3)));
                                                        int i9111111111118 = ((i9111111111116 | i9111111111117) << 1) - (i9111111111117 ^ i9111111111116);
                                                        a = i9111111111118 % 128;
                                                        int i9111111111119 = i9111111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i10111111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i10111111111116 % 128;
                                                            int i10111111111117 = i10111111111116 % 2;
                                                            int i10111111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i10111111111118 % 128;
                                                            int i10111111111119 = i10111111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i111111110 = a;
                                                            i13 = (((i111111110 | 84) << 1) - (i111111110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i111111111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i1012117 = i16 & 1;
                                                            int i1012118 = (~i1012117) & (i16 | 1);
                                                            int i1012119 = i1012117 << 1;
                                                            i17 = ((i1012118 | i1012119) << 1) - (i1012119 ^ i1012118);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111111110 % 128;
                                                                    int i101111111111111 = i101111111111110 % 2;
                                                                    int i101111111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111111112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111111112 | i111111112) << 1) - (i101111111111112 ^ i111111112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111111113 % 128;
                                                                    int i101111111111114 = i101111111111113 % 2;
                                                                    int i101111111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111111113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111111115 | i111111113) << 1) - (i101111111111115 ^ i111111113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i811111111112 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i811111111113 = -(-((i31 & 1) << 1));
                                                    i14 = ((i811111111112 | i811111111113) << 1) - (i811111111112 ^ i811111111113);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i811111111114 = i12 + 9;
                                                    i15 = i811111111114 % 128;
                                                    b = i15;
                                                    int i811111111115 = i811111111114 % 2;
                                                    if (j5 >= 0) {
                                                        int i811111111116 = i15 & 1;
                                                        int i811111111117 = -(-((i15 ^ 1) | i811111111116));
                                                        int i811111111118 = (i811111111116 ^ i811111111117) + ((i811111111116 & i811111111117) << 1);
                                                        a = i811111111118 % 128;
                                                        int i811111111119 = i811111111118 % 2;
                                                        int i91111111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i91111111111110 % 128;
                                                        int i91111111111111 = i91111111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i91111111111112 = i14 & 1;
                                                        int i91111111111113 = ((i14 ^ 1) | i91111111111112) << 1;
                                                        int i91111111111114 = -((~i91111111111112) & (i14 | 1));
                                                        i16 = ((i91111111111113 | i91111111111114) << 1) - (i91111111111113 ^ i91111111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i91111111111115 = i15 | 3;
                                                        int i91111111111116 = i91111111111115 << 1;
                                                        int i91111111111117 = -(i91111111111115 & (~(i15 & 3)));
                                                        int i91111111111118 = ((i91111111111116 | i91111111111117) << 1) - (i91111111111117 ^ i91111111111116);
                                                        a = i91111111111118 % 128;
                                                        int i91111111111119 = i91111111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i101111111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i101111111111116 % 128;
                                                            int i101111111111117 = i101111111111116 % 2;
                                                            int i101111111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i101111111111118 % 128;
                                                            int i101111111111119 = i101111111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i111111114 = a;
                                                            i13 = (((i111111114 | 84) << 1) - (i111111114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i111111115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10121110 = i16 & 1;
                                                            int i10121111 = (~i10121110) & (i16 | 1);
                                                            int i10121112 = i10121110 << 1;
                                                            i17 = ((i10121111 | i10121112) << 1) - (i10121112 ^ i10121111);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111111111110 % 128;
                                                                    int i1011111111111111 = i1011111111111110 % 2;
                                                                    int i1011111111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111111116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111111111112 | i111111116) << 1) - (i1011111111111112 ^ i111111116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i1011111111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i1011111111111113 % 128;
                                                                    int i1011111111111114 = i1011111111111113 % 2;
                                                                    int i1011111111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i111111117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i1011111111111115 | i111111117) << 1) - (i1011111111111115 ^ i111111117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i111111118 = b;
                                            int i111111119 = ((i111111118 ^ 100) + ((i111111118 & 100) << 1)) - 1;
                                            a = i111111119 % 128;
                                            int i1213 = i111111119 % 2;
                                        } else {
                                            j5 = j3 ^ (j4 << 28);
                                            if (j5 >= 0) {
                                                int i711110 = (i10 & (-70)) | ((~i10) & 69);
                                                int i711111 = -(-((i10 & 69) << 1));
                                                int i711112 = (i711110 & i711111) + (i711111 | i711110);
                                                a = i711112 % 128;
                                                int i81128 = i711112 % 2;
                                                j6 = 266354560;
                                                i31 = i8;
                                            } else {
                                                int i81129 = i8 & 1;
                                                i31 = ((~i81129) & (i8 | 1)) + (i81129 << 1);
                                                j7 = j5 ^ (((long) bArr[i8]) << 35);
                                                i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
                                                i12 = i11 % 128;
                                                a = i12;
                                                if (i11 % 2 == 0) {
                                                    int i8111111111110 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i8111111111111 = -(-((i31 & 1) << 1));
                                                    i14 = ((i8111111111110 | i8111111111111) << 1) - (i8111111111110 ^ i8111111111111);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i8111111111112 = i12 + 9;
                                                    i15 = i8111111111112 % 128;
                                                    b = i15;
                                                    int i8111111111113 = i8111111111112 % 2;
                                                    if (j5 >= 0) {
                                                        int i8111111111114 = i15 & 1;
                                                        int i8111111111115 = -(-((i15 ^ 1) | i8111111111114));
                                                        int i8111111111116 = (i8111111111114 ^ i8111111111115) + ((i8111111111114 & i8111111111115) << 1);
                                                        a = i8111111111116 % 128;
                                                        int i8111111111117 = i8111111111116 % 2;
                                                        int i911111111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i911111111111110 % 128;
                                                        int i911111111111111 = i911111111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i911111111111112 = i14 & 1;
                                                        int i911111111111113 = ((i14 ^ 1) | i911111111111112) << 1;
                                                        int i911111111111114 = -((~i911111111111112) & (i14 | 1));
                                                        i16 = ((i911111111111113 | i911111111111114) << 1) - (i911111111111113 ^ i911111111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i911111111111115 = i15 | 3;
                                                        int i911111111111116 = i911111111111115 << 1;
                                                        int i911111111111117 = -(i911111111111115 & (~(i15 & 3)));
                                                        int i911111111111118 = ((i911111111111116 | i911111111111117) << 1) - (i911111111111117 ^ i911111111111116);
                                                        a = i911111111111118 % 128;
                                                        int i911111111111119 = i911111111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i1011111111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i1011111111111116 % 128;
                                                            int i1011111111111117 = i1011111111111116 % 2;
                                                            int i1011111111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i1011111111111118 % 128;
                                                            int i1011111111111119 = i1011111111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1111111110 = a;
                                                            i13 = (((i1111111110 | 84) << 1) - (i1111111110 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1111111111 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10121113 = i16 & 1;
                                                            int i10121114 = (~i10121113) & (i16 | 1);
                                                            int i10121115 = i10121113 << 1;
                                                            i17 = ((i10121114 | i10121115) << 1) - (i10121115 ^ i10121114);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111111111110 % 128;
                                                                    int i10111111111111111 = i10111111111111110 % 2;
                                                                    int i10111111111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111111112 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111111111112 | i1111111112) << 1) - (i10111111111111112 ^ i1111111112);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i10111111111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i10111111111111113 % 128;
                                                                    int i10111111111111114 = i10111111111111113 % 2;
                                                                    int i10111111111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111111113 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i10111111111111115 | i1111111113) << 1) - (i10111111111111115 ^ i1111111113);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i8111111111118 = (i31 & (-2)) | ((~i31) & 1);
                                                    int i8111111111119 = -(-((i31 & 1) << 1));
                                                    i14 = ((i8111111111118 | i8111111111119) << 1) - (i8111111111118 ^ i8111111111119);
                                                    j5 = j7 ^ (((long) bArr[i31]) << 42);
                                                    int i81111111111110 = i12 + 9;
                                                    i15 = i81111111111110 % 128;
                                                    b = i15;
                                                    int i81111111111111 = i81111111111110 % 2;
                                                    if (j5 >= 0) {
                                                        int i81111111111112 = i15 & 1;
                                                        int i81111111111113 = -(-((i15 ^ 1) | i81111111111112));
                                                        int i81111111111114 = (i81111111111112 ^ i81111111111113) + ((i81111111111112 & i81111111111113) << 1);
                                                        a = i81111111111114 % 128;
                                                        int i81111111111115 = i81111111111114 % 2;
                                                        int i9111111111111110 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
                                                        a = i9111111111111110 % 128;
                                                        int i9111111111111111 = i9111111111111110 % 2;
                                                        j6 = 4363953127296L;
                                                        i31 = i14;
                                                    } else {
                                                        int i9111111111111112 = i14 & 1;
                                                        int i9111111111111113 = ((i14 ^ 1) | i9111111111111112) << 1;
                                                        int i9111111111111114 = -((~i9111111111111112) & (i14 | 1));
                                                        i16 = ((i9111111111111113 | i9111111111111114) << 1) - (i9111111111111113 ^ i9111111111111114);
                                                        j7 = j5 ^ (((long) bArr[i14]) << 49);
                                                        int i9111111111111115 = i15 | 3;
                                                        int i9111111111111116 = i9111111111111115 << 1;
                                                        int i9111111111111117 = -(i9111111111111115 & (~(i15 & 3)));
                                                        int i9111111111111118 = ((i9111111111111116 | i9111111111111117) << 1) - (i9111111111111117 ^ i9111111111111116);
                                                        a = i9111111111111118 % 128;
                                                        int i9111111111111119 = i9111111111111118 % 2;
                                                        if (j7 < 0) {
                                                            int i10111111111111116 = (i15 & 43) + (i15 | 43);
                                                            a = i10111111111111116 % 128;
                                                            int i10111111111111117 = i10111111111111116 % 2;
                                                            int i10111111111111118 = (((i15 | 29) << 1) - (~(-(i15 ^ 29)))) - 1;
                                                            a = i10111111111111118 % 128;
                                                            int i10111111111111119 = i10111111111111118 % 2;
                                                            j8 = -558586000294016L;
                                                            i31 = i16;
                                                            j2 = j8 ^ j7;
                                                            int i1111111114 = a;
                                                            i13 = (((i1111111114 | 84) << 1) - (i1111111114 ^ 84)) - 1;
                                                            b = i13 % 128;
                                                            if (i13 % 2 != 0) {
                                                                int i1111111115 = 3 / 2;
                                                            }
                                                        } else {
                                                            int i10121116 = i16 & 1;
                                                            int i10121117 = (~i10121116) & (i16 | 1);
                                                            int i10121118 = i10121116 << 1;
                                                            i17 = ((i10121117 | i10121118) << 1) - (i10121118 ^ i10121117);
                                                            j9 = bArr[i16];
                                                            i18 = (-2) - ((((i15 | 4) << 1) - (i15 ^ 4)) ^ (-1));
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                j10 = (j7 + (j9 >> 56)) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111111111110 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111111111110 % 128;
                                                                    int i101111111111111111 = i101111111111111110 % 2;
                                                                    int i101111111111111112 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111111116 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111111111112 | i1111111116) << 1) - (i101111111111111112 ^ i1111111116);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            } else {
                                                                j10 = ((j9 << 56) ^ j7) ^ 71499008037633920L;
                                                                if (j10 < 0) {
                                                                    int i101111111111111113 = (i15 & 45) + (i15 | 45);
                                                                    a = i101111111111111113 % 128;
                                                                    int i101111111111111114 = i101111111111111113 % 2;
                                                                    int i101111111111111115 = ((i17 ^ 1) | (i17 & 1)) << 1;
                                                                    int i1111111117 = -((i17 & (-2)) | ((~i17) & 1));
                                                                    i31 = ((i101111111111111115 | i1111111117) << 1) - (i101111111111111115 ^ i1111111117);
                                                                    if (bArr[i17] >= 0) {
                                                                        j2 = j10;
                                                                    }
                                                                } else {
                                                                    i57 = i17;
                                                                    j = j10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = j6 ^ j5;
                                            int i1111111118 = b;
                                            int i1111111119 = ((i1111111118 ^ 100) + ((i1111111118 & 100) << 1)) - 1;
                                            a = i1111111119 % 128;
                                            int i1214 = i1111111119 % 2;
                                        }
                                    }
                                }
                            }
                            int i1215 = b;
                            int i1216 = i1215 & 55;
                            int i1217 = i1215 | 55;
                            int i1218 = (i1216 & i1217) + (i1217 | i1216);
                            a = i1218 % 128;
                            int i1219 = i1218 % 2;
                            j2 = j;
                            i31 = i57;
                        }
                        this.k = i31;
                        int i133 = b;
                        int i134 = (((i133 ^ 47) | (i133 & 47)) << 1) - (((~i133) & 47) | (i133 & (-48)));
                        a = i134 % 128;
                        int i135 = i134 % 2;
                        return j2;
                    }
                    int i136 = ((i22 & (-74)) | ((~i22) & 73)) + ((i22 & 73) << 1);
                    int i137 = i136 % 128;
                    a = i137;
                    if (i136 % 2 == 0) {
                        i7 = i55 & 121;
                    } else {
                        int i138 = i55 & (-128);
                        i7 = ((i55 ^ (-128)) | i138) & (~i138);
                    }
                    int i139 = i137 + 49;
                    b = i139 % 128;
                    int i140 = i139 % 2;
                    j2 = i7;
                    int i141 = a;
                    int i142 = (i141 ^ 77) + ((i141 & 77) << 1);
                    b = i142 % 128;
                    int i143 = i142 % 2;
                    this.k = i31;
                    int i1310 = b;
                    int i1311 = (((i1310 ^ 47) | (i1310 & 47)) << 1) - (((~i1310) & 47) | (i1310 & (-48)));
                    a = i1311 % 128;
                    int i1312 = i1311 % 2;
                    return j2;
                }
            }
            long J = J();
            int i144 = b;
            int i145 = i144 ^ 63;
            int i146 = ((i144 & 63) | i145) << 1;
            int i147 = -i145;
            int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
            a = i148 % 128;
            if (i148 % 2 == 0) {
                int i149 = 11 / 0;
            }
            return J;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x010f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x0111  */
        /* JADX WARN: Code duplicated, block: B:36:0x0125 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x0127  */
        /* JADX WARN: Code duplicated, block: B:42:0x0157  */
        /* JADX WARN: Code duplicated, block: B:44:0x015c  */
        /* JADX WARN: Code duplicated, block: B:46:0x0160  */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if (r1 <= ((r8 << 1) - ((~(r5 & r7)) & r8))) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r4 = r4 + 111;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4 % 128;
            r4 = r4 % 2;
            r2 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r10.g, r6, r1);
            r4 = ivas.gov.bisp.enumeration.aD.P.biX.a;
            r5 = ((r4 & 108) + (r4 | 108)) - 1;
            r4 = r5 % 128;
            ivas.gov.bisp.enumeration.aD.P.biX.b = r4;
            r5 = r5 % 2;
            r5 = r10.k;
            r1 = -(-r1);
            r10.k = (r5 ^ r1) + ((r1 & r5) << 1);
            r4 = r4 + 23;
            ivas.gov.bisp.enumeration.aD.P.biX.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
        
            if ((r4 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
        
            if (r1 <= (r5 / r6)) goto L11;
         */
        @Override // ivas.gov.bisp.enumeration.aD.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ivas.gov.bisp.enumeration.aD.AbstractC0069z l() throws ivas.gov.bisp.enumeration.aD.C0065v {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.P.biX.l():ivas.gov.bisp.enumeration.aD.z");
        }
    }

    public P(biW biw) {
    }

    public static int c(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 109) | (i3 & 109)) << 1;
        int i5 = -((i3 & (-110)) | ((~i3) & 109));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = -(i & 1);
        int i9 = i >>> 1;
        int i10 = (~i9) & i8;
        int i11 = i9 & (~i8);
        int i12 = (i11 & i10) | (i10 ^ i11);
        int i13 = i3 + 73;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 51 / 0;
        }
        return i12;
    }

    public static long d(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return j | (-(j % 1));
        }
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract long A();

    public abstract int B();

    public abstract boolean C(int i);

    public abstract boolean f();

    public abstract void g(int i);

    public abstract int h();

    public abstract boolean i();

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract AbstractC0069z l();

    public abstract double m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract float q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract String y();

    public abstract String z();

    public static P e(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 2 % 2;
        biX bix = new biX(bArr, i, i2, z, null);
        try {
            bix.k(i2);
            int i4 = a;
            int i5 = i4 & 37;
            int i6 = -(-((i4 ^ 37) | i5));
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = (i4 ^ 41) + ((i4 & 41) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return bix;
            }
            throw null;
        } catch (oo0o0Oo e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }
}
