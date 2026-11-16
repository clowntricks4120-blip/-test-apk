package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: loaded from: classes.dex */
public final class as {
    private static int a = 0;
    private static int b = 1;
    public static final bkT c;

    public static class bkS {
        private static int a = 1;
        private static int b;

        public static boolean c(byte b2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 31;
            int i4 = -(-((i2 ^ 31) | i3));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            boolean z = false;
            if (b2 >= 0) {
                int i8 = (i2 & 83) + (i2 | 83);
                a = i8 % 128;
                z = i8 % 2 != 0;
            } else {
                int i9 = i6 & 7;
                int i10 = (((~i9) & (i6 | 7)) - (~(-(-(i9 << 1))))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = a + 119;
            b = i12 % 128;
            int i13 = i12 % 2;
            return z;
        }

        public static boolean f(byte b2) {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 109;
            int i4 = i3 + ((i2 ^ 109) | i3);
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 != 0 ? b2 <= -65 : b2 <= 76) {
                int i6 = i5 + 55;
                b = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                int i8 = (((i2 & (-66)) | ((~i2) & 65)) - (~((i2 & 65) << 1))) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            }
            int i10 = a;
            int i11 = i10 & 41;
            int i12 = ((i10 ^ 41) | i11) << 1;
            int i13 = -((i10 | 41) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            return z;
        }

        public static void d(byte b2, byte b3, char[] cArr, int i) throws C0065v {
            int i2 = 2 % 2;
            int i3 = a + 105;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            if (b2 >= -62) {
                int i6 = i4 & 15;
                int i7 = (((i4 ^ 15) | i6) << 1) - ((i4 | 15) & (~i6));
                a = i7 % 128;
                Object obj = null;
                if (i7 % 2 == 0) {
                    f(b3);
                    obj.hashCode();
                    throw null;
                }
                if (!f(b3)) {
                    int i8 = a;
                    int i9 = ((i8 ^ 116) + ((i8 & 116) << 1)) - 1;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    char c = (char) (((b2 & 31) << 6) | (b3 & 63));
                    int i11 = (((i8 | 34) << 1) - (i8 ^ 34)) - 1;
                    int i12 = i11 % 128;
                    b = i12;
                    int i13 = i11 % 2;
                    cArr[i] = c;
                    int i14 = i12 + 65;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
            throw C0065v.f();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0041  */
        /* JADX WARN: Code duplicated, block: B:16:0x0045  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        /* JADX WARN: Code duplicated, block: B:22:0x0097  */
        /* JADX WARN: Code duplicated, block: B:23:0x009e  */
        public static void e(byte b2, byte b3, byte b4, char[] cArr, int i) throws C0065v {
            char c;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 & 95) + (i4 | 95);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                f(b3);
                throw null;
            }
            if (!f(b3)) {
                if (b2 == -32) {
                    int i6 = a;
                    int i7 = (i6 | 103) << 1;
                    int i8 = -(((~i6) & 103) | (i6 & (-104)));
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    b = i9 % 128;
                    if (i9 % 2 == 0 ? b3 >= -96 : b3 >= 110) {
                        if (b2 == -19) {
                            int i10 = b + 69;
                            a = i10 % 128;
                            int i11 = i10 % 2;
                            if (b3 < -96) {
                                if (!f(b4)) {
                                    int i12 = b;
                                    int i13 = (-2) - ((((i12 | 118) << 1) - (i12 ^ 118)) ^ (-1));
                                    a = i13 % 128;
                                    int i14 = i13 % 2;
                                    int i15 = i12 + 15;
                                    int i16 = i15 % 128;
                                    a = i16;
                                    int i17 = i15 % 2;
                                    int i18 = ((b2 & 15) << 12) ^ ((b3 & 63) << 6);
                                    int i19 = b4 & 63;
                                    c = (char) (((~i18) & i19) | ((~i19) & i18));
                                    int i20 = (i16 & (-72)) | ((~i16) & 71);
                                    int i21 = -(-((i16 & 71) << 1));
                                    i2 = (i20 & i21) + (i20 | i21);
                                    b = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        cArr[i] = c;
                                        return;
                                    } else {
                                        cArr[i] = c;
                                        int i22 = 93 / 0;
                                        return;
                                    }
                                }
                            }
                        } else if (!f(b4)) {
                            int i110 = b;
                            int i111 = (-2) - ((((i110 | 118) << 1) - (i110 ^ 118)) ^ (-1));
                            a = i111 % 128;
                            int i112 = i111 % 2;
                            int i113 = i110 + 15;
                            int i114 = i113 % 128;
                            a = i114;
                            int i115 = i113 % 2;
                            int i116 = ((b2 & 15) << 12) ^ ((b3 & 63) << 6);
                            int i117 = b4 & 63;
                            c = (char) (((~i116) & i117) | ((~i117) & i116));
                            int i23 = (i114 & (-72)) | ((~i114) & 71);
                            int i24 = -(-((i114 & 71) << 1));
                            i2 = (i23 & i24) + (i23 | i24);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                cArr[i] = c;
                                return;
                            } else {
                                cArr[i] = c;
                                int i25 = 93 / 0;
                                return;
                            }
                        }
                    }
                } else if (b2 == -19) {
                    int i118 = b + 69;
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    if (b3 < -96) {
                        if (!f(b4)) {
                            int i1110 = b;
                            int i1111 = (-2) - ((((i1110 | 118) << 1) - (i1110 ^ 118)) ^ (-1));
                            a = i1111 % 128;
                            int i1112 = i1111 % 2;
                            int i1113 = i1110 + 15;
                            int i1114 = i1113 % 128;
                            a = i1114;
                            int i1115 = i1113 % 2;
                            int i1116 = ((b2 & 15) << 12) ^ ((b3 & 63) << 6);
                            int i1117 = b4 & 63;
                            c = (char) (((~i1116) & i1117) | ((~i1117) & i1116));
                            int i26 = (i1114 & (-72)) | ((~i1114) & 71);
                            int i27 = -(-((i1114 & 71) << 1));
                            i2 = (i26 & i27) + (i26 | i27);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                cArr[i] = c;
                                return;
                            } else {
                                cArr[i] = c;
                                int i28 = 93 / 0;
                                return;
                            }
                        }
                    }
                } else if (!f(b4)) {
                    int i1118 = b;
                    int i1119 = (-2) - ((((i1118 | 118) << 1) - (i1118 ^ 118)) ^ (-1));
                    a = i1119 % 128;
                    int i11110 = i1119 % 2;
                    int i11111 = i1118 + 15;
                    int i11112 = i11111 % 128;
                    a = i11112;
                    int i11113 = i11111 % 2;
                    int i11114 = ((b2 & 15) << 12) ^ ((b3 & 63) << 6);
                    int i11115 = b4 & 63;
                    c = (char) (((~i11114) & i11115) | ((~i11115) & i11114));
                    int i29 = (i11112 & (-72)) | ((~i11112) & 71);
                    int i210 = -(-((i11112 & 71) << 1));
                    i2 = (i29 & i210) + (i29 | i210);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        cArr[i] = c;
                        return;
                    } else {
                        cArr[i] = c;
                        int i211 = 93 / 0;
                        return;
                    }
                }
            }
            throw C0065v.f();
        }

        public static void b(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws C0065v {
            int i2;
            int i3;
            int i4;
            char c;
            int i5 = 2 % 2;
            int i6 = b;
            int i7 = ((i6 | 123) << 1) - (i6 ^ 123);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (!f(b3)) {
                int i9 = b;
                int i10 = (i9 & 53) + (i9 | 53);
                int i11 = i10 % 128;
                a = i11;
                if (i10 % 2 == 0) {
                    int i12 = ((b3 | (-74)) << 1) - (b3 ^ (-74));
                    int i13 = -(b2 >> 84);
                    int i14 = i12 & i13;
                    i2 = ((i12 | i13) & (~i14)) + (i14 << 1);
                    i3 = 34;
                } else {
                    int i15 = (b3 & (-113)) | ((~b3) & 112);
                    int i16 = (b3 & 112) << 1;
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    int i18 = b2 << 28;
                    int i19 = i17 & i18;
                    i2 = (((i18 | i17) & (~i19)) - (~(i19 << 1))) - 1;
                    i3 = 30;
                }
                if ((i2 >> i3) == 0) {
                    int i20 = i11 + 77;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    if (!f(b4)) {
                        int i22 = b;
                        int i23 = (i22 ^ 55) + ((i22 & 55) << 1);
                        a = i23 % 128;
                        Object obj = null;
                        if (i23 % 2 == 0) {
                            f(b5);
                            throw null;
                        }
                        if (!f(b5)) {
                            int i24 = b;
                            int i25 = i24 & 35;
                            int i26 = ((((i24 ^ 35) | i25) << 1) - (~(-((i24 | 35) & (~i25))))) - 1;
                            int i27 = i26 % 128;
                            a = i27;
                            int i28 = i26 % 2;
                            int i29 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6);
                            int i30 = (((i27 & (-32)) | ((~i27) & 31)) - (~(-(-((i27 & 31) << 1))))) - 1;
                            b = i30 % 128;
                            if (i30 % 2 != 0) {
                                int i31 = (b5 & (-64)) ^ ((~b5) & 63);
                                i4 = (i29 | i31) & (~(i29 & i31));
                                int i32 = i4 >>> 25;
                                int i33 = i32 | (-55232);
                                int i34 = i33 << 1;
                                int i35 = -((~(i32 & (-55232))) & i33);
                                c = (char) ((i34 ^ i35) + ((i35 & i34) << 1));
                            } else {
                                int i36 = b5 & 63;
                                i4 = ((~i29) & i36) | ((~i36) & i29);
                                c = (char) ((i4 >>> 10) - (-55232));
                            }
                            int i37 = i27 + 113;
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            cArr[i] = c;
                            int i39 = i27 + 77;
                            int i40 = i39 % 128;
                            b = i40;
                            int i41 = i39 % 2;
                            cArr[(i ^ 1) + ((i & 1) << 1)] = (char) ((i4 & 1023) + 56320);
                            int i42 = (i40 & (-110)) | ((~i40) & 109);
                            int i43 = -(-((i40 & 109) << 1));
                            int i44 = (i42 & i43) + (i42 | i43);
                            a = i44 % 128;
                            if (i44 % 2 != 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
            throw C0065v.f();
        }
    }

    public static abstract class bkT {
        public abstract String c(byte[] bArr, int i, int i2);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i, int i2);

        public abstract int e(int i, byte[] bArr, int i2, int i3);
    }

    public static class bkV extends IllegalArgumentException {
        private static int a = 1;
        private static int b;

        public bkV(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unpaired surrogate at index ");
            int i3 = b + 99;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append(i);
                sb.append(" of ");
                sb.append(i2);
                super(sb.toString());
                return;
            }
            sb.append(i);
            sb.append(" of ");
            sb.append(i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class bkW extends bkT {
        private static int a = 0;
        private static int b = 1;

        public static int f(byte[] bArr, int i, long j, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 53;
            int i6 = -(-(i4 | 53));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            b = i8;
            Object obj = null;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 == 0) {
                bkT bkt = as.c;
                if (i > -12) {
                    int i9 = b + 79;
                    a = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 48 / 0;
                    }
                    i = -1;
                }
                int i11 = b;
                int i12 = i11 ^ 61;
                int i13 = (i11 & 61) << 1;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                return i;
            }
            if (i2 == 1) {
                int iB = as.b(i, ar.j(bArr, j));
                int i16 = a;
                int i17 = i16 & 75;
                int i18 = i16 | 75;
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                int i20 = i19 % 2;
                return iB;
            }
            int i21 = (((i8 | 100) << 1) - (i8 ^ 100)) - 1;
            a = i21 % 128;
            if (i21 % 2 == 0 ? i2 != 2 : i2 != 2) {
                throw new AssertionError();
            }
            byte bJ = ar.j(bArr, j);
            byte bJ2 = ar.j(bArr, j + 1);
            int i22 = b;
            int i23 = ((i22 ^ 79) | (i22 & 79)) << 1;
            int i24 = -(((~i22) & 79) | (i22 & (-80)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                return as.e(i, bJ, bJ2);
            }
            as.e(i, bJ, bJ2);
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0467  */
        /* JADX WARN: Code duplicated, block: B:108:0x047d  */
        /* JADX WARN: Code duplicated, block: B:110:0x0489  */
        /* JADX WARN: Code duplicated, block: B:112:0x049f  */
        /* JADX WARN: Code duplicated, block: B:114:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:117:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:123:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:124:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:138:0x0478 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:139:0x046c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x0455 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x0164 A[PHI: r7
  0x0164: PHI (r7v29 char) = (r7v17 char), (r7v18 char), (r7v73 char) binds: [B:37:0x0115, B:39:0x0119, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x016a  */
        /* JADX WARN: Code duplicated, block: B:61:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:63:0x0208  */
        /* JADX WARN: Code duplicated, block: B:65:0x0222  */
        /* JADX WARN: Code duplicated, block: B:67:0x0228  */
        /* JADX WARN: Code duplicated, block: B:69:0x0234  */
        /* JADX WARN: Code duplicated, block: B:70:0x023b  */
        /* JADX WARN: Code duplicated, block: B:73:0x0261  */
        /* JADX WARN: Code duplicated, block: B:75:0x026a  */
        /* JADX WARN: Code duplicated, block: B:78:0x02e7  */
        /* JADX WARN: Code duplicated, block: B:82:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:84:0x030e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0323  */
        /* JADX WARN: Code duplicated, block: B:88:0x034b  */
        /* JADX WARN: Code duplicated, block: B:90:0x0360  */
        /* JADX WARN: Code duplicated, block: B:93:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:94:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:97:0x042b  */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x04ba, code lost:
        
            if (java.lang.Character.isSurrogatePair(r7, r31.charAt(r1)) != false) goto L121;
         */
        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int d(java.lang.CharSequence r31, byte[] r32, int r33, int r34) {
            /*
                Method dump skipped, instruction units count: 1385
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.as.bkW.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
        
            if (r14 >= r5) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.as.bkW.b + 93;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
        
            if ((r2 % 2) == 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
            r7 = 85 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
        
            if (ivas.gov.bisp.enumeration.aD.as.bkS.c(r2) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
        
            if ((!ivas.gov.bisp.enumeration.aD.as.bkS.c(r2)) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        
            r6 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r7 = (((r6 | 112) << 1) - (r6 ^ 112)) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
        
            if ((r7 % 2) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        
            r7 = r14 & 105;
            r15[r1] = (char) r2;
            r14 = (r7 + ((r14 ^ 105) | r7)) - 49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
        
            r14 = r14 + 1;
            r15[r1] = (char) r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
        
            r2 = (r1 & (-2)) | ((~r1) & 1);
            r1 = -(-((r1 & 1) << 1));
            r1 = ((r2 | r1) << 1) - (r1 ^ r2);
            r2 = ((r6 ^ 97) | (r6 & 97)) << 1;
            r6 = -(((~r6) & 97) | (r6 & (-98)));
            r7 = ((r2 | r6) << 1) - (r2 ^ r6);
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r6 = r2 ^ 23;
            r2 = (((r2 & 23) | r6) << 1) - r6;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
        
            if (r14 >= r5) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
        
            r6 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r7 = r6 & 89;
            r8 = (~r7) & (r6 | 89);
            r7 = r7 << 1;
            r9 = (r8 & r7) + (r7 | r8);
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0101, code lost:
        
            if ((r9 % 2) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
        
            r7 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0105, code lost:
        
            r7 = r14 ^ 1;
            r8 = (r14 & 1) << 1;
            r9 = (r7 & r8) + (r7 | r8);
            r7 = r14;
            r14 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
        
            r10 = r6 & 23;
            r9 = ((((r6 ^ 23) | r10) << 1) - (~(-((r6 | 23) & (~r10))))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r9 % 128;
            r9 = r9 % 2;
            r6 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
        
            if (ivas.gov.bisp.enumeration.aD.as.bkS.c(r6) == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x012d, code lost:
        
            r7 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r8 = (r7 & 71) + (r7 | 71);
            r7 = r8 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7;
            r8 = r8 % 2;
            r8 = r1 & 1;
            r9 = -(-((r1 ^ 1) | r8));
            r10 = ((r8 | r9) << 1) - (r8 ^ r9);
            r6 = (char) r6;
            r8 = (r7 & (-58)) | ((~r7) & 57);
            r9 = -(-((r7 & 57) << 1));
            r11 = (r8 & r9) + (r8 | r9);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x015b, code lost:
        
            if ((r11 % 2) == 0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x015d, code lost:
        
            r15[r1] = r6;
            r7 = r7 + 85;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r7 % 128;
            r7 = r7 % 2;
            r1 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0167, code lost:
        
            if (r14 >= r5) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0169, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.as.bkW.a + 87;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r2 % 128;
            r2 = r2 % 2;
            r2 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
            r6 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r8 = r6 & 59;
            r7 = ((((r6 ^ 59) | r8) << 1) - (~(-((r6 | 59) & (~r8))))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r7 % 128;
            r7 = r7 % 2;
            r6 = ivas.gov.bisp.enumeration.aD.as.bkS.c(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        
            if (r7 != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0192, code lost:
        
            r7 = 38 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0195, code lost:
        
            if (r6 != false) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0198, code lost:
        
            if (r6 != false) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x019a, code lost:
        
            r2 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r6 = ((r2 & (-44)) | ((~r2) & 43)) + ((r2 & 43) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01ad, code lost:
        
            r7 = r14 & (-63);
            r6 = (((r14 ^ (-63)) | r7) << 1) - ((r14 | (-63)) & (~r7));
            r14 = (((r6 | 65) << 1) - (r6 ^ 65)) - 1;
            r6 = r1 & 1;
            r7 = (((~r6) & (r1 | 1)) - (~(-(-(r6 << 1))))) - 1;
            r6 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r8 = r6 ^ 119;
            r6 = -(-((r6 & 119) << 1));
            r9 = ((r8 | r6) << 1) - (r6 ^ r8);
            r6 = r9 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r6;
            r9 = r9 % 2;
            r15[r1] = (char) r2;
            r6 = r6 + 115;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r6 % 128;
            r6 = r6 % 2;
            r1 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01ec, code lost:
        
            r15[r1] = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01f1, code lost:
        
            if (r6 >= (-32)) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01f3, code lost:
        
            r7 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r8 = ((r7 & (-48)) | ((~r7) & 47)) + ((r7 & 47) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r8 % 128;
            r8 = r8 % 2;
            r8 = r7 + 117;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r8 % 128;
            r8 = r8 % 2;
            r8 = (((r7 ^ 99) | (r7 & 99)) << 1) - (((~r7) & 99) | (r7 & (-100)));
            r7 = r8 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x021d, code lost:
        
            if ((r8 % 2) == 0) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x021f, code lost:
        
            if (r14 >= r5) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0221, code lost:
        
            r2 = ((r7 ^ 102) + ((r7 & 102) << 1)) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r2 % 128;
            r2 = r2 % 2;
            r2 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
            r7 = ivas.gov.bisp.enumeration.aD.as.bkW.b + 39;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x023b, code lost:
        
            if ((r7 % 2) == 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x023d, code lost:
        
            ivas.gov.bisp.enumeration.aD.as.bkS.d(r6, r2, r15, r1);
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0242, code lost:
        
            ivas.gov.bisp.enumeration.aD.as.bkS.d(r6, r2, r15, r1);
            r2 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0246, code lost:
        
            r6 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r7 = r6 & 17;
            r8 = -(-((r6 ^ 17) | r7));
            r9 = (r7 ^ r8) + ((r7 & r8) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0259, code lost:
        
            if ((r9 % 2) != 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x025b, code lost:
        
            r14 = r14 % r2;
            r2 = r1 ^ 43;
            r1 = (((r1 & 43) | r2) << 1) - r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0264, code lost:
        
            r7 = r14 & r2;
            r14 = -(-((r14 ^ r2) | r7));
            r2 = ((r7 | r14) << 1) - (r14 ^ r7);
            r14 = r1 ^ 127;
            r1 = ((r1 & 127) | r14) << 1;
            r14 = -r14;
            r7 = ((r1 | r14) << 1) - (r14 ^ r1);
            r14 = r7 ^ (-126);
            r1 = ((r7 & (-126)) | r14) << 1;
            r14 = -r14;
            r7 = (r1 & r14) + (r14 | r1);
            r14 = r2;
            r1 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
        
            if (((r2 & r6) | (r2 ^ r6)) >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0288, code lost:
        
            r2 = (r6 & (-52)) | ((~r6) & 51);
            r6 = -(-((r6 & 51) << 1));
            r7 = ((r2 | r6) << 1) - (r2 ^ r6);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02a3, code lost:
        
            throw ivas.gov.bisp.enumeration.aD.C0065v.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x02a4, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02a5, code lost:
        
            r7 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r8 = r7 & 79;
            r8 = r8 + ((r7 ^ 79) | r8);
            r9 = r8 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r9;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x02b4, code lost:
        
            if (r6 >= (-16)) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02b6, code lost:
        
            r9 = r9 + 67;
            r2 = r9 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r2;
            r9 = r9 % 2;
            r7 = (r2 & (-54)) | ((~r2) & 53);
            r8 = -(-((r2 & 53) << 1));
            r9 = (r7 & r8) + (r7 | r8);
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r9 % 128;
            r9 = r9 % 2;
            r7 = (-2) - (((r2 ^ 92) + ((r2 & 92) << 1)) ^ (-1));
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x02e4, code lost:
        
            if (r14 >= ((-2) - (r5 ^ (-1)))) goto L115;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
        
            r2 = r2 + 119;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r2 % 128;
            r2 = r2 % 2;
            r2 = ((r14 | 1) << 1) - (r14 ^ 1);
            r14 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
            r7 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r8 = ((r7 ^ 77) - (~((r7 & 77) << 1))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r8 % 128;
            r8 = r8 % 2;
            r7 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r2);
            r8 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r9 = r8 & 81;
            r8 = -(-((r8 ^ 81) | r9));
            r10 = ((r9 | r8) << 1) - (r8 ^ r9);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r10 % 128;
            r10 = r10 % 2;
            ivas.gov.bisp.enumeration.aD.as.bkS.e(r6, r14, r7, r15, r1);
            r14 = (-2) - ((((r2 | (-126)) << 1) - (r2 ^ (-126))) ^ (-1));
            r14 = ((r14 & 128) << 1) + (r14 ^ 128);
            r2 = r1 & 56;
            r1 = (r1 ^ 56) | r2;
            r6 = (r2 ^ r1) + ((r1 & r2) << 1);
            r1 = r6 & (-55);
            r1 = (r1 - (~((r6 ^ (-55)) | r1))) - 1;
            r2 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r6 = r2 & 71;
            r2 = -(-((r2 ^ 71) | r6));
            r7 = (r6 ^ r2) + ((r2 & r6) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x035d, code lost:
        
            throw ivas.gov.bisp.enumeration.aD.C0065v.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x035e, code lost:
        
            r8 = ((r7 & (-84)) | ((~r7) & 83)) + ((r7 & 83) << 1);
            r7 = r8 % 128;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r7;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0372, code lost:
        
            if (r14 >= ((r5 & (-2)) + (r5 | (-2)))) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0374, code lost:
        
            r8 = (r7 ^ 79) + ((r7 & 79) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r8 % 128;
            r8 = r8 % 2;
            r8 = r14 & 1;
            r7 = ((r14 ^ 1) | r8) << 1;
            r8 = -((~r8) & (r14 | 1));
            r9 = (r7 & r8) + (r7 | r8);
            r7 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
            r14 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r8 = r14 & 87;
            r14 = (r14 | 87) & (~r8);
            r8 = -(-(r8 << 1));
            r10 = (r14 ^ r8) + ((r14 & r8) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x03a8, code lost:
        
            if ((r10 % 2) != 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x03aa, code lost:
        
            r14 = r9 % 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x03ac, code lost:
        
            r8 = ivas.gov.bisp.enumeration.aD.ar.j(r13, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x03b2, code lost:
        
            r14 = r9 & 1;
            r8 = -(-(r9 | 1));
            r14 = ((r14 | r8) << 1) - (r14 ^ r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x03bf, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aD.as.bkW.b;
            r10 = (r9 ^ 85) + ((r9 & 85) << 1);
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x03cc, code lost:
        
            if ((r10 % 2) != 0) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x03ce, code lost:
        
            ivas.gov.bisp.enumeration.aD.as.bkS.b(r6, r7, r8, ivas.gov.bisp.enumeration.aD.ar.j(r13, r14), r15, r1);
            r2 = r1 & 1;
            r2 = (r2 - (~((r1 ^ 1) | r2))) - 1;
            r1 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r6 = r1 ^ 33;
            r7 = ((r1 & 33) | r6) << 1;
            r6 = -r6;
            r8 = ((r7 | r6) << 1) - (r6 ^ r7);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x03f3, code lost:
        
            if ((r8 % 2) != 0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x03f5, code lost:
        
            r2 = r2 % 1;
            r14 = r14 << 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x03fa, code lost:
        
            r14 = ((r14 | 1) << 1) - (r14 ^ 1);
            r2 = (r2 ^ 1) + ((r2 & 1) << 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0408, code lost:
        
            r1 = r1 + 35;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r1 % 128;
            r1 = r1 % 2;
            r1 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0412, code lost:
        
            ivas.gov.bisp.enumeration.aD.ar.j(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0416, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x041b, code lost:
        
            throw ivas.gov.bisp.enumeration.aD.C0065v.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x041c, code lost:
        
            r13 = new java.lang.String(r15, 0, r1);
            r14 = ivas.gov.bisp.enumeration.aD.as.bkW.a;
            r15 = r14 ^ 67;
            r14 = ((((r14 & 67) | r15) << 1) - (~(-r15))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r14 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
        
            if (((r2 & r7) | (r2 ^ r7)) >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0432, code lost:
        
            if ((r14 % 2) == 0) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0434, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0435, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0438, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0439, code lost:
        
            r5 = new java.lang.Object[3];
            r13 = r13.length;
            r1 = r1 + 103;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0444, code lost:
        
            if ((r1 % 2) != 0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0446, code lost:
        
            r5[0] = java.lang.Integer.valueOf(r13);
            r5[0] = java.lang.Integer.valueOf(r14);
            r0 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0454, code lost:
        
            r5[0] = java.lang.Integer.valueOf(r13);
            r5[1] = java.lang.Integer.valueOf(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0460, code lost:
        
            r5[r0] = java.lang.Integer.valueOf(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0471, code lost:
        
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", r5));
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
        
            r2 = -(-r15);
            r5 = ((r14 ^ r2) - (~((r2 & r14) << 1))) - 1;
            r15 = new char[r15];
            r2 = r1 | 105;
            r6 = ((r2 << 1) - (~(-((~(r1 & 105)) & r2)))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r6 % 128;
            r6 = r6 % 2;
            r1 = 0;
         */
        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String c(byte[] r13, int r14, int r15) throws ivas.gov.bisp.enumeration.aD.C0065v {
            /*
                Method dump skipped, instruction units count: 1138
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.as.bkW.c(byte[], int, int):java.lang.String");
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:37:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
        
            if (ivas.gov.bisp.enumeration.aD.ar.j(r26, r10) <= (-65)) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
        
            if (r22 >= r2) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        
            if (r22 >= r2) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
        
            r1 = r5 & 5;
            r1 = (r1 - (~(-(-((r5 ^ 5) | r1))))) - 1;
            ivas.gov.bisp.enumeration.aD.as.bkW.a = r1 % 128;
            r1 = r1 % 2;
            r0 = ivas.gov.bisp.enumeration.aD.as.b(r9, r0);
            r1 = ivas.gov.bisp.enumeration.aD.as.bkW.a + 91;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            r10 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
        
            if (ivas.gov.bisp.enumeration.aD.ar.j(r26, r10) > (-65)) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
        
            if (r14 >= r2) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0201, code lost:
        
            if (r14 >= r2) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0203, code lost:
        
            r1 = ((r5 | 13) << 1) - (r5 ^ 13);
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r1 % 128;
            r1 = r1 % 2;
            r0 = ivas.gov.bisp.enumeration.aD.as.e(r9, r12, r0);
            r1 = ivas.gov.bisp.enumeration.aD.as.bkW.a + 79;
            ivas.gov.bisp.enumeration.aD.as.bkW.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x021b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x021c, code lost:
        
            r10 = r14;
            r15 = r0;
         */
        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int e(int r25, byte[] r26, int r27, int r28) {
            /*
                Method dump skipped, instruction units count: 1365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.as.bkW.e(int, byte[], int, int):int");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    static {
        int i;
        boolean z;
        bkT bku;
        if (!ar.k) {
            int i2 = b;
            int i3 = ((i2 ^ 33) | (i2 & 33)) << 1;
            int i4 = -(((~i2) & 33) | (i2 & (-34)));
            i = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i % 128;
            if (i % 2 == 0) {
                int i5 = 2 % 2;
            }
            z = false;
        } else {
            int i6 = b;
            int i7 = (i6 & 31) + (i6 | 31);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (!ar.j) {
                int i9 = b;
                int i10 = ((i9 ^ 33) | (i9 & 33)) << 1;
                int i11 = -(((~i9) & 33) | (i9 & (-34)));
                i = ((i10 | i11) << 1) - (i11 ^ i10);
                a = i % 128;
                if (i % 2 == 0) {
                    int i12 = 2 % 2;
                }
                z = false;
            } else {
                int i13 = b;
                int i14 = ((i13 ^ 13) | (i13 & 13)) << 1;
                int i15 = -(((~i13) & 13) | (i13 & (-14)));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                int i19 = i17 & 29;
                int i20 = (i17 | 29) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 & i21) + (i20 | i21);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 2 % 2;
                }
                z = true;
            }
        }
        Object obj = null;
        if (z) {
            int i24 = a;
            int i25 = ((i24 | 11) << 1) - (i24 ^ 11);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                C0061r.b();
                throw null;
            }
            if (C0061r.b()) {
                bku = new bkU();
                int i26 = a;
                int i27 = ((i26 | 11) << 1) - (i26 ^ 11);
                b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = 2 % 2;
            } else {
                bku = new bkW();
                int i30 = (-2) - ((b + 106) ^ (-1));
                a = i30 % 128;
                int i31 = i30 % 2;
                int i32 = 2 % 2;
            }
        } else {
            bku = new bkU();
            int i210 = a;
            int i211 = ((i210 | 11) << 1) - (i210 ^ 11);
            b = i211 % 128;
            int i212 = i211 % 2;
            int i213 = 2 % 2;
        }
        c = bku;
        int i33 = b;
        int i34 = (((i33 | 122) << 1) - (i33 ^ 122)) - 1;
        a = i34 % 128;
        if (i34 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public static int b(int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 | 11;
        int i8 = ((i7 << 1) - (~(-(i7 & (~(i6 & 11)))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = -1;
        if (i <= -12) {
            int i11 = i6 & 63;
            int i12 = -(-((i6 ^ 63) | i11));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (i2 <= -65) {
                int i15 = (-2) - ((i6 + 26) ^ (-1));
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = i2 >> 88;
                    int i17 = (~i16) & i;
                    int i18 = (~i) & i16;
                    i4 = (i18 & i17) | (i17 ^ i18);
                } else {
                    int i19 = i2 << 8;
                    i4 = ((~i) & i19) | ((~i19) & i);
                }
                i10 = i4;
                int i20 = (i6 & 102) + (i6 | 102);
                i3 = (i20 ^ (-1)) + (i20 << 1);
                b = i3 % 128;
            } else {
                int i21 = b;
                int i22 = i21 & 71;
                i3 = (i22 - (~((i21 ^ 71) | i22))) - 1;
                a = i3 % 128;
            }
        } else {
            int i23 = b;
            int i24 = i23 & 71;
            i3 = (i24 - (~((i23 ^ 71) | i24))) - 1;
            a = i3 % 128;
        }
        int i25 = i3 % 2;
        int i26 = b;
        int i27 = ((i26 | 91) << 1) - (i26 ^ 91);
        a = i27 % 128;
        int i28 = i27 % 2;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0116  */
    /* JADX WARN: Code duplicated, block: B:28:0x0131  */
    /* JADX WARN: Code duplicated, block: B:30:0x014a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0157  */
    /* JADX WARN: Code duplicated, block: B:32:0x0173  */
    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:36:0x018c  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8 A[SYNTHETIC] */
    public static int d(CharSequence charSequence) {
        char cCharAt;
        int length;
        char cCharAt2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 & (-34)) | ((~i6) & 33);
        int i8 = -(-((i6 & 33) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        int length2 = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length2) {
            int i13 = a;
            int i14 = i13 & 103;
            int i15 = ((i13 ^ 103) | i14) << 1;
            int i16 = -((i13 | 103) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            if (charSequence.charAt(i12) >= 128) {
                break;
            }
            int i19 = b;
            int i20 = ((i19 ^ 125) | (i19 & 125)) << 1;
            int i21 = -((i19 & (-126)) | ((~i19) & 125));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                i12 = ((i12 & (-13)) | ((~i12) & 12)) + ((i12 & 12) << 1);
            } else {
                int i23 = ((i12 | 24) << 1) - (i12 ^ 24);
                i12 = (i23 & (-23)) + (i23 | (-23));
            }
            int i24 = i19 & 89;
            int i25 = (i19 | 89) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = (i29 & 104) + (i29 | 104);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        int i33 = length2;
        while (true) {
            if (i12 < length2) {
                int i34 = a;
                int i35 = ((i34 | 97) << 1) - (i34 ^ 97);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    cCharAt = charSequence.charAt(i12);
                    if (cCharAt >= 13503) {
                        length = charSequence.length();
                        int i36 = a;
                        int i37 = (i36 ^ 5) + ((i36 & 5) << 1);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        while (i12 < length) {
                            int i39 = a;
                            int i40 = i39 & 33;
                            int i41 = ((i39 ^ 33) | i40) << 1;
                            int i42 = -((i39 | 33) & (~i40));
                            int i43 = (i41 & i42) + (i42 | i41);
                            b = i43 % 128;
                            int i44 = i43 % 2;
                            cCharAt2 = charSequence.charAt(i12);
                            if (cCharAt2 < 2048) {
                                int i45 = a;
                                i3 = ((((i45 ^ 19) | (i45 & 19)) << 1) - (~(-(((~i45) & 19) | (i45 & (-20)))))) - 1;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    i11 = (i11 - (~(-(~(-((7 >>> cCharAt2) % 36)))))) - 2;
                                } else {
                                    int i46 = -cCharAt2;
                                    int i47 = i46 & 127;
                                    int i48 = (i46 | 127) & (~i47);
                                    int i49 = i47 << 1;
                                    int i50 = -(-(((i48 ^ i49) + ((i48 & i49) << 1)) >>> 31));
                                    int i51 = i11 & i50;
                                    int i52 = (i11 ^ i50) | i51;
                                    i11 = ((i52 & i51) << 1) + (i51 ^ i52);
                                }
                            } else {
                                i11 += 2;
                                if (55296 <= cCharAt2) {
                                    i = b;
                                    int i53 = (i ^ 89) + ((i & 89) << 1);
                                    a = i53 % 128;
                                    int i54 = i53 % 2;
                                    if (cCharAt2 <= 57343) {
                                        int i55 = (((i | 1) << 1) - (~(-(((~i) & 1) | (i & (-2)))))) - 1;
                                        a = i55 % 128;
                                        int i56 = i55 % 2;
                                        if (Character.codePointAt(charSequence, i12) >= 65536) {
                                            throw new bkV(i12, length);
                                        }
                                        int i57 = b;
                                        int i58 = (i57 & (-38)) | ((~i57) & 37);
                                        int i59 = -(-((i57 & 37) << 1));
                                        i2 = ((i58 | i59) << 1) - (i59 ^ i58);
                                        int i60 = i2 % 128;
                                        a = i60;
                                        if (i2 % 2 == 0) {
                                            int i61 = i12 | 1;
                                            int i62 = i61 << 1;
                                            int i63 = -((~(i12 & 1)) & i61);
                                            i12 = (i62 ^ i63) + ((i63 & i62) << 1);
                                        }
                                        int i64 = (i60 & (-84)) | ((~i60) & 83);
                                        int i65 = (i60 & 83) << 1;
                                        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                                        b = i66 % 128;
                                        int i67 = i66 % 2;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i12 = ((i12 | 1) << 1) - (i12 ^ 1);
                            int i68 = a + 47;
                            b = i68 % 128;
                            int i69 = i68 % 2;
                        }
                        i33 = (((i33 | i11) << 1) - (~(-((i11 & (~i33)) | ((~i11) & i33))))) - 1;
                        int i70 = b;
                        int i71 = i70 & 85;
                        int i72 = (i70 ^ 85) | i71;
                        int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                        a = i73 % 128;
                        int i74 = i73 % 2;
                    }
                    int i75 = a;
                    int i76 = i75 & 85;
                    int i77 = -(-((i75 ^ 85) | i76));
                    i4 = ((i76 | i77) << 1) - (i77 ^ i76);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i78 = '-' >> cCharAt;
                        i33 <<= (i78 & 121) + (i78 | 121);
                        int i79 = ((i12 | 114) << 1) - (i12 ^ 114);
                        i12 = (i79 & (-32)) + (i79 | (-32));
                    } else {
                        int i80 = -cCharAt;
                        int i81 = i80 & 127;
                        int i82 = -(-(((((i80 ^ 127) | i81) << 1) - ((i80 | 127) & (~i81))) >>> 31));
                        i12 = (-2) - ((i12 + 2) ^ (-1));
                        i33 = (i33 ^ i82) + ((i33 & i82) << 1);
                    }
                } else {
                    cCharAt = charSequence.charAt(i12);
                    if (cCharAt >= 2048) {
                        length = charSequence.length();
                        int i310 = a;
                        int i311 = (i310 ^ 5) + ((i310 & 5) << 1);
                        b = i311 % 128;
                        int i312 = i311 % 2;
                        while (i12 < length) {
                            int i313 = a;
                            int i410 = i313 & 33;
                            int i411 = ((i313 ^ 33) | i410) << 1;
                            int i412 = -((i313 | 33) & (~i410));
                            int i413 = (i411 & i412) + (i412 | i411);
                            b = i413 % 128;
                            int i414 = i413 % 2;
                            cCharAt2 = charSequence.charAt(i12);
                            if (cCharAt2 < 2048) {
                                int i415 = a;
                                i3 = ((((i415 ^ 19) | (i415 & 19)) << 1) - (~(-(((~i415) & 19) | (i415 & (-20)))))) - 1;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    i11 = (i11 - (~(-(~(-((7 >>> cCharAt2) % 36)))))) - 2;
                                } else {
                                    int i416 = -cCharAt2;
                                    int i417 = i416 & 127;
                                    int i418 = (i416 | 127) & (~i417);
                                    int i419 = i417 << 1;
                                    int i510 = -(-(((i418 ^ i419) + ((i418 & i419) << 1)) >>> 31));
                                    int i511 = i11 & i510;
                                    int i512 = (i11 ^ i510) | i511;
                                    i11 = ((i512 & i511) << 1) + (i511 ^ i512);
                                }
                            } else {
                                i11 += 2;
                                if (55296 <= cCharAt2) {
                                    i = b;
                                    int i513 = (i ^ 89) + ((i & 89) << 1);
                                    a = i513 % 128;
                                    int i514 = i513 % 2;
                                    if (cCharAt2 <= 57343) {
                                        int i515 = (((i | 1) << 1) - (~(-(((~i) & 1) | (i & (-2)))))) - 1;
                                        a = i515 % 128;
                                        int i516 = i515 % 2;
                                        if (Character.codePointAt(charSequence, i12) >= 65536) {
                                            throw new bkV(i12, length);
                                        }
                                        int i517 = b;
                                        int i518 = (i517 & (-38)) | ((~i517) & 37);
                                        int i519 = -(-((i517 & 37) << 1));
                                        i2 = ((i518 | i519) << 1) - (i519 ^ i518);
                                        int i610 = i2 % 128;
                                        a = i610;
                                        if (i2 % 2 == 0) {
                                            int i611 = i12 | 1;
                                            int i612 = i611 << 1;
                                            int i613 = -((~(i12 & 1)) & i611);
                                            i12 = (i612 ^ i613) + ((i613 & i612) << 1);
                                        }
                                        int i614 = (i610 & (-84)) | ((~i610) & 83);
                                        int i615 = (i610 & 83) << 1;
                                        int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
                                        b = i616 % 128;
                                        int i617 = i616 % 2;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i12 = ((i12 | 1) << 1) - (i12 ^ 1);
                            int i618 = a + 47;
                            b = i618 % 128;
                            int i619 = i618 % 2;
                        }
                        i33 = (((i33 | i11) << 1) - (~(-((i11 & (~i33)) | ((~i11) & i33))))) - 1;
                        int i710 = b;
                        int i711 = i710 & 85;
                        int i712 = (i710 ^ 85) | i711;
                        int i713 = (i711 ^ i712) + ((i712 & i711) << 1);
                        a = i713 % 128;
                        int i714 = i713 % 2;
                    }
                    int i715 = a;
                    int i716 = i715 & 85;
                    int i717 = -(-((i715 ^ 85) | i716));
                    i4 = ((i716 | i717) << 1) - (i717 ^ i716);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i718 = '-' >> cCharAt;
                        i33 <<= (i718 & 121) + (i718 | 121);
                        int i719 = ((i12 | 114) << 1) - (i12 ^ 114);
                        i12 = (i719 & (-32)) + (i719 | (-32));
                    } else {
                        int i83 = -cCharAt;
                        int i84 = i83 & 127;
                        int i85 = -(-(((((i83 ^ 127) | i84) << 1) - ((i83 | 127) & (~i84))) >>> 31));
                        i12 = (-2) - ((i12 + 2) ^ (-1));
                        i33 = (i33 ^ i85) + ((i33 & i85) << 1);
                    }
                }
            }
            if (i33 < length2) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("UTF-8 length does not fit in int: ");
                sbW.append(((long) i33) + 4294967296L);
                throw new IllegalArgumentException(sbW.toString());
            }
            int i86 = b;
            int i87 = i86 & 59;
            int i88 = (i86 ^ 59) | i87;
            int i89 = (i87 ^ i88) + ((i87 & i88) << 1);
            a = i89 % 128;
            int i90 = i89 % 2;
            int i91 = i86 & 75;
            int i92 = ((i86 | 75) & (~i91)) + (i91 << 1);
            a = i92 % 128;
            if (i92 % 2 == 0) {
                return i33;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    public static int e(int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = a + 27;
        int i7 = i6 % 128;
        b = i7;
        int i8 = -1;
        if (i6 % 2 != 0 ? i > -12 : i > 119) {
            int i9 = ((i7 | 27) << 1) - (i7 ^ 27);
            a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = (i7 & 85) + (i7 | 85);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (i2 <= -65) {
                int i13 = (((i7 | 34) << 1) - (i7 ^ 34)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                if (i3 <= -65) {
                    int i15 = (i7 & 7) + (i7 | 7);
                    a = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = i2 >> 78;
                        int i17 = (~i16) & i;
                        int i18 = (~i) & i16;
                        int i19 = (i18 & i17) | (i17 ^ i18);
                        int i20 = i3 % 101;
                        int i21 = ((~i20) & i19) | ((~i19) & i20);
                        int i22 = i19 & i20;
                        i4 = (i22 & i21) | (i21 ^ i22);
                    } else {
                        int i23 = i2 << 8;
                        int i24 = (i | i23) & (~(i & i23));
                        int i25 = i3 << 16;
                        int i26 = i24 & i25;
                        i4 = ((i24 ^ i25) | i26) & (~i26);
                    }
                    i8 = i4;
                } else {
                    int i27 = ((i7 | 27) << 1) - (i7 ^ 27);
                    a = i27 % 128;
                    int i110 = i27 % 2;
                }
            } else {
                int i28 = ((i7 | 27) << 1) - (i7 ^ 27);
                a = i28 % 128;
                int i111 = i28 % 2;
            }
        }
        int i29 = i7 & 107;
        int i30 = ((~i29) & (i7 | 107)) + (i29 << 1);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 29 / 0;
        }
        return i8;
    }

    public static boolean f(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = (-2) - ((b + 10) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean z = false;
        if (c.e(0, bArr, i, i2) == 0) {
            int i6 = a + 20;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 77;
            a = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        }
        int i12 = b;
        int i13 = i12 & 1;
        int i14 = i13 + ((i12 ^ 1) | i13);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int c(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 83;
        int i8 = -(-(i6 | 83));
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        int iE = bArr[(-2) - (i ^ (-1))];
        int i11 = (i2 - (~(-i))) - 1;
        if (i11 != 0) {
            int i12 = i6 + 47;
            b = i12 % 128;
            if (i12 % 2 != 0 ? i11 == 1 : i11 == 0) {
                int i13 = bArr[i];
                if (iE <= -12) {
                    int i14 = i6 ^ 71;
                    int i15 = (i6 & 71) << 1;
                    int i16 = (i14 & i15) + (i14 | i15);
                    int i17 = i16 % 128;
                    b = i17;
                    if (i16 % 2 != 0 ? i13 <= -65 : i13 <= 89) {
                        int i18 = i13 << 8;
                        int i19 = iE & i18;
                        int i20 = ((i18 ^ iE) | i19) & (~i19);
                        int i21 = ((i17 | 113) << 1) - (i17 ^ 113);
                        a = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i22 = 3 % 2;
                        }
                        iE = i20;
                    } else {
                        int i23 = (i6 ^ 77) + ((i6 & 77) << 1);
                        b = i23 % 128;
                        if (i23 % 2 == 0) {
                            int i24 = 88 / 0;
                        }
                        iE = -1;
                    }
                } else {
                    iE = -1;
                }
                int i25 = b;
                int i26 = ((i25 | 75) << 1) - (i25 ^ 75);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 3 / 5;
                }
            } else {
                int i28 = i6 & 95;
                int i29 = (i6 | 95) & (~i28);
                int i30 = -(-(i28 << 1));
                int i31 = (i29 & i30) + (i29 | i30);
                int i32 = i31 % 128;
                b = i32;
                int i33 = i31 % 2;
                if (i11 != 2) {
                    throw new AssertionError();
                }
                int i34 = i32 + 13;
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    i3 = bArr[i];
                    i4 = bArr[(-2) - (i ^ (-1))];
                } else {
                    i3 = bArr[i];
                    i4 = bArr[i - (-1)];
                }
                iE = e(iE, i3, i4);
                int i35 = a + 57;
                b = i35 % 128;
                int i36 = i35 % 2;
            }
        } else if (iE > -12) {
            int i37 = ((((i6 ^ 45) | (i6 & 45)) << 1) - (~(-((i6 & (-46)) | ((~i6) & 45))))) - 1;
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = (i6 & (-100)) | ((~i6) & 99);
            int i40 = (i6 & 99) << 1;
            int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 2 / 5;
            }
            iE = -1;
        }
        int i43 = a + 63;
        b = i43 % 128;
        if (i43 % 2 != 0) {
            return iE;
        }
        throw null;
    }

    public static final class bkU extends bkT {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        public final String c(byte[] bArr, int i, int i2) throws C0065v {
            Integer numValueOf;
            int i3;
            int i4;
            int i5;
            byte b2;
            int i6;
            int i7;
            int i8;
            int i9 = i;
            int i10 = 2 % 2;
            int i11 = b;
            int i12 = i11 | 71;
            int i13 = i12 << 1;
            int i14 = -(i12 & (~(i11 & 71)));
            char c = 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            int i18 = i9 & i2;
            int i19 = (i9 ^ i2) | i18;
            int length = bArr.length;
            int i20 = -(~(-i9));
            int i21 = ((length ^ i20) + ((length & i20) << 1)) - 1;
            int i22 = -i2;
            int i23 = (i21 - (~i22)) - 1;
            int i24 = ((~i23) & i19) | ((~i19) & i23);
            int i25 = i19 & i23;
            if (((i25 & i24) | (i24 ^ i25)) < 0) {
                Object[] objArr = new Object[3];
                int length2 = bArr.length;
                int i26 = (i11 & 17) + (i11 | 17);
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    objArr[0] = Integer.valueOf(length2);
                    numValueOf = Integer.valueOf(i);
                    c = 0;
                } else {
                    objArr[0] = Integer.valueOf(length2);
                    numValueOf = Integer.valueOf(i);
                }
                objArr[c] = numValueOf;
                objArr[2] = Integer.valueOf(i2);
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr));
            }
            int i27 = (((i16 | 48) << 1) - (i16 ^ 48)) - 1;
            int i28 = i27 % 128;
            b = i28;
            if (i27 % 2 != 0) {
                int i29 = i9 & i22;
                i3 = (i29 - (~((i9 ^ i22) | i29))) - 1;
            } else {
                int i30 = (~i18) & (i9 | i2);
                int i31 = -(-(i18 << 1));
                i3 = ((i30 & i31) << 1) + (i30 ^ i31);
            }
            char[] cArr = new char[i2];
            int i32 = i28 & 91;
            int i33 = (((i28 ^ 91) | i32) << 1) - ((i28 | 91) & (~i32));
            a = i33 % 128;
            int i34 = i33 % 2;
            int i35 = 0;
            while (i9 < i3) {
                int i36 = a;
                int i37 = (((i36 & (-40)) | ((~i36) & 39)) - (~((i36 & 39) << 1))) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
                byte b3 = bArr[i9];
                if (!bkS.c(b3)) {
                    break;
                }
                int i39 = b;
                int i40 = (((i39 & (-80)) | ((~i39) & 79)) - (~(-(-((i39 & 79) << 1))))) - 1;
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    i8 = ((i9 ^ 51) + ((i9 & 51) << 1)) - 1;
                    cArr[i35] = (char) b3;
                    int i41 = i35 ^ 101;
                    int i42 = ((i35 & 101) | i41) << 1;
                    int i43 = -i41;
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    i35 = ((i44 & (-50)) + (i44 | (-50))) - 1;
                } else {
                    int i45 = (-2) - (((i9 ^ 96) + ((i9 & 96) << 1)) ^ (-1));
                    int i46 = i45 & (-94);
                    i8 = i46 + ((i45 ^ (-94)) | i46);
                    cArr[i35] = (char) b3;
                    int i47 = i35 & (-2);
                    int i48 = ((i35 | (-2)) & (~i47)) + (i47 << 1);
                    int i49 = i48 & 3;
                    int i50 = (i48 ^ 3) | i49;
                    i35 = (i49 & i50) + (i49 | i50);
                }
                i9 = i8;
            }
            int i51 = b;
            int i52 = (i51 & (-120)) | ((~i51) & 119);
            int i53 = (i51 & 119) << 1;
            int i54 = (i52 & i53) + (i53 | i52);
            a = i54 % 128;
            if (i54 % 2 == 0) {
                int i55 = 4 / 4;
            }
            while (i9 < i3) {
                int i56 = b;
                int i57 = (i56 & (-2)) | ((~i56) & 1);
                int i58 = (i56 & 1) << 1;
                int i59 = (i57 & i58) + (i58 | i57);
                a = i59 % 128;
                int i60 = i59 % 2;
                int i61 = i9 & 1;
                int i62 = i61 + ((i9 ^ 1) | i61);
                byte b4 = bArr[i9];
                if (bkS.c(b4)) {
                    int i63 = a;
                    int i64 = ((i63 ^ 15) | (i63 & 15)) << 1;
                    int i65 = -(((~i63) & 15) | (i63 & (-16)));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    int i67 = i66 % 128;
                    b = i67;
                    int i68 = i66 % 2;
                    int i69 = (i35 | 1) << 1;
                    int i70 = -(i35 ^ 1);
                    int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                    char c2 = (char) b4;
                    int i72 = i67 & 5;
                    int i73 = i72 + ((i67 ^ 5) | i72);
                    a = i73 % 128;
                    if (i73 % 2 == 0) {
                        cArr[i35] = c2;
                        int i74 = 59 / 0;
                    } else {
                        cArr[i35] = c2;
                    }
                    i9 = i62;
                    i35 = i71;
                    while (i9 < i3) {
                        int i75 = a;
                        int i76 = i75 & 85;
                        int i77 = ((i75 | 85) & (~i76)) + (i76 << 1);
                        b = i77 % 128;
                        int i78 = i77 % 2;
                        byte b5 = bArr[i9];
                        if (!bkS.c(b5)) {
                            int i79 = a + 25;
                            b = i79 % 128;
                            if (i79 % 2 == 0) {
                                break;
                            }
                            int i80 = 58 / 0;
                            break;
                        }
                        int i81 = i9 | 1;
                        int i82 = i81 << 1;
                        int i83 = -((~(i9 & 1)) & i81);
                        i9 = ((i83 & i82) << 1) + (i82 ^ i83);
                        int i84 = ((i35 | 1) << 1) - (i35 ^ 1);
                        char c3 = (char) b5;
                        int i85 = b;
                        int i86 = ((i85 | 17) << 1) - (i85 ^ 17);
                        int i87 = i86 % 128;
                        a = i87;
                        if (i86 % 2 == 0) {
                            cArr[i35] = c3;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        cArr[i35] = c3;
                        int i88 = i87 + 107;
                        b = i88 % 128;
                        int i89 = i88 % 2;
                        i35 = i84;
                    }
                } else if (b4 < -32) {
                    int i90 = a;
                    int i91 = (i90 & (-58)) | ((~i90) & 57);
                    int i92 = -(-((i90 & 57) << 1));
                    int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                    b = i93 % 128;
                    int i94 = i93 % 2;
                    int i95 = ((i90 | 99) << 1) - (((~i90) & 99) | (i90 & (-100)));
                    int i96 = i95 % 128;
                    b = i96;
                    if (i95 % 2 != 0) {
                        int i97 = 4 / 4;
                    }
                    int i98 = i96 ^ 81;
                    int i99 = (i96 & 81) << 1;
                    int i100 = (i98 & i99) + (i98 | i99);
                    a = i100 % 128;
                    int i101 = i100 % 2;
                    if (i62 >= i3) {
                        throw C0065v.f();
                    }
                    int i102 = (i96 ^ 85) + ((i96 & 85) << 1);
                    a = i102 % 128;
                    int i103 = i102 % 2;
                    bkS.d(b4, bArr[i62], cArr, i35);
                    i9 = (i62 ^ 1) + ((i62 & 1) << 1);
                    int i104 = b;
                    int i105 = (-2) - (((i104 ^ 50) + ((i104 & 50) << 1)) ^ (-1));
                    int i106 = i105 % 128;
                    a = i106;
                    if (i105 % 2 == 0) {
                        int i107 = i35 ^ 105;
                        int i108 = (i35 & 105) << 1;
                        i4 = ((i107 | i108) << 1) - (i108 ^ i107);
                    } else {
                        int i109 = i35 & 21;
                        int i110 = (i35 | 21) & (~i109);
                        int i111 = -(-(i109 << 1));
                        i4 = (((i110 | i111) << 1) - (i110 ^ i111)) - 20;
                    }
                    i35 = i4;
                    int i112 = i106 ^ 45;
                    int i113 = ((i106 & 45) | i112) << 1;
                    int i114 = -i112;
                    int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                    b = i115 % 128;
                    if (i115 % 2 != 0) {
                        int i116 = 2 % 5;
                    }
                } else {
                    int i117 = b;
                    int i118 = (i117 | 49) << 1;
                    int i119 = -((i117 & (-50)) | ((~i117) & 49));
                    int i120 = ((i118 | i119) << 1) - (i118 ^ i119);
                    a = i120 % 128;
                    int i121 = i120 % 2;
                    if (b4 < -16) {
                        int i122 = (-2) - (((i117 & 52) + (i117 | 52)) ^ (-1));
                        int i123 = i122 % 128;
                        a = i123;
                        int i124 = i122 % 2;
                        int i125 = ((i123 | 24) << 1) - (i123 ^ 24);
                        int i126 = (i125 ^ (-1)) + (i125 << 1);
                        b = i126 % 128;
                        int i127 = i126 % 2;
                        int i128 = (i123 & 47) + (i123 | 47);
                        b = i128 % 128;
                        if (i128 % 2 != 0) {
                            if (i62 >= i3) {
                                throw C0065v.f();
                            }
                            int i129 = i123 & 99;
                            int i130 = (i123 | 99) & (~i129);
                            int i131 = i129 << 1;
                            int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                            int i133 = i132 % 128;
                            b = i133;
                            int i134 = i132 % 2;
                            int i135 = (i62 ^ 1) + ((i62 & 1) << 1);
                            byte b6 = bArr[i62];
                            byte b7 = bArr[i135];
                            int i136 = (-2) - ((i133 + 20) ^ (-1));
                            a = i136 % 128;
                            int i137 = i136 % 2;
                            bkS.e(b4, b6, b7, cArr, i35);
                            int i138 = i135 & 48;
                            int i139 = (i138 - (~((i135 ^ 48) | i138))) - 1;
                            i9 = ((i139 & (-47)) << 1) + ((i139 & 46) | ((~i139) & (-47)));
                            int i140 = i35 & 1;
                            int i141 = ((i35 ^ 1) | i140) << 1;
                            int i142 = -((i35 | 1) & (~i140));
                            i35 = ((i142 & i141) << 1) + (i141 ^ i142);
                            int i143 = b;
                            int i144 = i143 & 39;
                            int i145 = ((i143 ^ 39) | i144) << 1;
                            int i146 = -((i143 | 39) & (~i144));
                            int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                            a = i147 % 128;
                            int i148 = i147 % 2;
                        } else {
                            if (i62 >= i3 - 1) {
                                throw C0065v.f();
                            }
                            int i1210 = i123 & 99;
                            int i1310 = (i123 | 99) & (~i1210);
                            int i1311 = i1210 << 1;
                            int i1312 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
                            int i1313 = i1312 % 128;
                            b = i1313;
                            int i1314 = i1312 % 2;
                            int i1315 = (i62 ^ 1) + ((i62 & 1) << 1);
                            byte b8 = bArr[i62];
                            byte b9 = bArr[i1315];
                            int i1316 = (-2) - ((i1313 + 20) ^ (-1));
                            a = i1316 % 128;
                            int i1317 = i1316 % 2;
                            bkS.e(b4, b8, b9, cArr, i35);
                            int i1318 = i1315 & 48;
                            int i1319 = (i1318 - (~((i1315 ^ 48) | i1318))) - 1;
                            i9 = ((i1319 & (-47)) << 1) + ((i1319 & 46) | ((~i1319) & (-47)));
                            int i149 = i35 & 1;
                            int i1410 = ((i35 ^ 1) | i149) << 1;
                            int i1411 = -((i35 | 1) & (~i149));
                            i35 = ((i1411 & i1410) << 1) + (i1410 ^ i1411);
                            int i1412 = b;
                            int i1413 = i1412 & 39;
                            int i1414 = ((i1412 ^ 39) | i1413) << 1;
                            int i1415 = -((i1412 | 39) & (~i1413));
                            int i1416 = ((i1414 | i1415) << 1) - (i1415 ^ i1414);
                            a = i1416 % 128;
                            int i1417 = i1416 % 2;
                        }
                    } else {
                        int i150 = i117 & 63;
                        int i151 = i150 + ((i117 ^ 63) | i150);
                        int i152 = i151 % 128;
                        a = i152;
                        int i153 = i151 % 2;
                        if (i62 >= (i3 ^ (-2)) + ((i3 & (-2)) << 1)) {
                            throw C0065v.f();
                        }
                        int i154 = i152 & 41;
                        int i155 = (i152 | 41) & (~i154);
                        int i156 = i154 << 1;
                        int i157 = (i155 & i156) + (i155 | i156);
                        b = i157 % 128;
                        if (i157 % 2 != 0) {
                            i5 = i62 >>> 1;
                            b2 = bArr[i62];
                            i6 = i5 % 1;
                        } else {
                            i5 = ((i62 & 2) + (i62 | 2)) - 1;
                            b2 = bArr[i62];
                            int i158 = i5 & 1;
                            i6 = (i158 - (~(-(-((i5 ^ 1) | i158))))) - 1;
                        }
                        bkS.b(b4, b2, bArr[i5], bArr[i6], cArr, i35);
                        int i159 = b;
                        int i160 = ((i159 ^ 86) + ((i159 & 86) << 1)) - 1;
                        a = i160 % 128;
                        if (i160 % 2 == 0) {
                            int i161 = i35 % 0;
                            i7 = i6 % 0;
                            i35 = (i161 ^ (-1)) + (i161 << 1);
                        } else {
                            int i162 = i35 & 1;
                            int i163 = i162 + ((i35 ^ 1) | i162);
                            int i164 = i163 & 1;
                            i35 = i164 + ((i163 ^ 1) | i164);
                            int i165 = i6 ^ 1;
                            int i166 = -(-((i6 & 1) << 1));
                            i7 = (i165 & i166) + (i165 | i166);
                        }
                        i9 = i7;
                    }
                }
            }
            String str = new String(cArr, 0, i35);
            int i167 = b;
            int i168 = i167 & 105;
            int i169 = -(-((i167 ^ 105) | i168));
            int i170 = (i168 ^ i169) + ((i169 & i168) << 1);
            a = i170 % 128;
            if (i170 % 2 == 0) {
                int i171 = 75 / 0;
            }
            return str;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x014f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0153  */
        /* JADX WARN: Code duplicated, block: B:38:0x0168  */
        /* JADX WARN: Code duplicated, block: B:39:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:41:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:43:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:45:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:47:0x0204  */
        /* JADX WARN: Code duplicated, block: B:48:0x020b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0226  */
        /* JADX WARN: Code duplicated, block: B:52:0x0236  */
        /* JADX WARN: Code duplicated, block: B:54:0x02ac  */
        /* JADX WARN: Code duplicated, block: B:56:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:58:0x02c9  */
        /* JADX WARN: Code duplicated, block: B:62:0x02f2  */
        /* JADX WARN: Code duplicated, block: B:64:0x02f7  */
        /* JADX WARN: Code duplicated, block: B:66:0x0346  */
        /* JADX WARN: Code duplicated, block: B:67:0x035a  */
        /* JADX WARN: Code duplicated, block: B:70:0x03e6  */
        /* JADX WARN: Code duplicated, block: B:77:0x041c  */
        /* JADX WARN: Code duplicated, block: B:79:0x042b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x042d  */
        /* JADX WARN: Code duplicated, block: B:82:0x0445  */
        /* JADX WARN: Code duplicated, block: B:86:0x0462  */
        /* JADX WARN: Code duplicated, block: B:94:0x040b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:97:0x041a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x040f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x02e1 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x045a, code lost:
        
            if (java.lang.Character.isSurrogatePair(r1, r17.charAt(r5)) == false) goto L84;
         */
        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int d(java.lang.CharSequence r17, byte[] r18, int r19, int r20) {
            /*
                Method dump skipped, instruction units count: 1182
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.as.bkU.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0297  */
        /* JADX WARN: Code duplicated, block: B:104:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:146:0x0422  */
        /* JADX WARN: Code duplicated, block: B:148:0x0426  */
        /* JADX WARN: Code duplicated, block: B:150:0x043e  */
        /* JADX WARN: Code duplicated, block: B:153:0x0443  */
        /* JADX WARN: Code duplicated, block: B:156:0x0448  */
        /* JADX WARN: Code duplicated, block: B:157:0x044a  */
        /* JADX WARN: Code duplicated, block: B:172:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:174:0x04f0  */
        /* JADX WARN: Code duplicated, block: B:201:0x0511 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:202:0x0511 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:203:0x0456 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x0511 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:211:0x0502 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:212:0x0511 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:213:0x04f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:214:0x0511 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:218:0x0343 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:219:0x0343 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:220:0x0343 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0144  */
        /* JADX WARN: Code duplicated, block: B:56:0x0148  */
        /* JADX WARN: Code duplicated, block: B:58:0x0160  */
        /* JADX WARN: Code duplicated, block: B:61:0x0167  */
        /* JADX WARN: Code duplicated, block: B:99:0x028b  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        
            if (r24[r2] <= (-65)) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
        
            if (r2 >= r26) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01a0, code lost:
        
            if (r6 >= r26) goto L73;
         */
        @Override // ivas.gov.bisp.enumeration.aD.as.bkT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int e(int r23, byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 1346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.as.bkU.e(int, byte[], int, int):int");
        }
    }
}
