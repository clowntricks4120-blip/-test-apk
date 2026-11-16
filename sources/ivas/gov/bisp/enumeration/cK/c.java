package ivas.gov.bisp.enumeration.cK;

import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public int d;

    /* JADX WARN: Code duplicated, block: B:32:0x0188  */
    /* JADX WARN: Code duplicated, block: B:34:0x019a  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x01bf  */
    public c(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        this.c = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        int i8 = a;
        int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        byte b4 = bArr[2];
        int i11 = bArr[3] & 255;
        int i12 = i8 + 79;
        int i13 = i12 % 128;
        b = i13;
        if (i12 % 2 == 0) {
            i = i11 * 24;
            i2 = b2 & 31072;
            int i14 = (b3 & (-26764)) | ((~b3) & 26763);
            int i15 = b3 & 26763;
            i3 = (i15 & i14) | (i14 ^ i15);
        } else {
            i = i11 << 24;
            i2 = b2 & 255;
            i3 = b3 & 255;
        }
        int i16 = (i13 & (-46)) | ((~i13) & 45);
        int i17 = -(-((i13 & 45) << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = i3 * 92;
            i4 = (i2 | i19) & (~(i2 & i19));
            int i20 = b4 & 2264;
            i5 = (i20 | (b4 ^ 2264)) & (~i20);
            i6 = 34;
        } else {
            int i21 = i3 << 8;
            int i22 = i2 & i21;
            int i23 = (i2 | i21) & (~i22);
            i4 = (i23 & i22) | (i23 ^ i22);
            i5 = b4 & 255;
            i6 = 16;
        }
        int i24 = i13 + 3;
        int i25 = i24 % 128;
        a = i25;
        int i26 = i24 % 2;
        int i27 = i5 << i6;
        int i28 = (i4 & i27) | ((~i27) & i4) | ((~i4) & i27);
        int i29 = (i & i28) | (i ^ i28);
        this.d = i29;
        if (i29 != 0) {
            int iY = ivas.gov.bisp.enumeration.p100w.r.y(i29);
            int i30 = a;
            int i31 = i30 ^ 55;
            int i32 = ((((i30 & 55) | i31) << 1) - (~(-i31))) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
            int i34 = 2 % 2;
            int i35 = 0;
            int iAj = 2;
            while (true) {
                if (i35 >= (iY >>> 1)) {
                    int i36 = a;
                    int i37 = i36 & 9;
                    int i38 = (i36 ^ 9) | i37;
                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                    z = true;
                    break;
                }
                int i41 = a;
                int i42 = (i41 & (-8)) | ((~i41) & 7);
                int i43 = -(-((i41 & 7) << 1));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
                iAj = ivas.gov.bisp.enumeration.p100w.r.aj(iAj, iAj, i29);
                int i46 = (iAj & (-3)) ^ ((~iAj) & 2);
                int i47 = a;
                int i48 = ((i47 | 29) << 1) - (i47 ^ 29);
                b = i48 % 128;
                int i49 = i48 % 2;
                int i50 = i46;
                int i51 = i29;
                while (i51 != 0) {
                    int i52 = a + 55;
                    b = i52 % 128;
                    int i53 = i52 % 2;
                    int iX = ivas.gov.bisp.enumeration.p100w.r.X(i50, i51);
                    int i54 = b + 67;
                    int i55 = i54 % 128;
                    a = i55;
                    if (i54 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i56 = (i55 ^ 81) + ((i55 & 81) << 1);
                    b = i56 % 128;
                    int i57 = i56 % 2;
                    i50 = i51;
                    i51 = iX;
                }
                if (i50 != 1) {
                    int i58 = a;
                    int i59 = (i58 & 31) + (i58 | 31);
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    int i61 = i58 & 59;
                    int i62 = (i58 | 59) & (~i61);
                    int i63 = -(-(i61 << 1));
                    int i64 = (i62 & i63) + (i62 | i63);
                    b = i64 % 128;
                    int i65 = i64 % 2;
                } else {
                    int i66 = i35 & 1;
                    i35 = (i66 - (~(-(-((i35 ^ 1) | i66))))) - 1;
                    int i67 = b;
                    int i68 = i67 & 101;
                    int i69 = (i68 - (~((i67 ^ 101) | i68))) - 1;
                    a = i69 % 128;
                    int i70 = i69 % 2;
                }
            }
            if (!(!z)) {
                throw new IllegalArgumentException("byte array is not an encoded finite field");
            }
            int i71 = b;
            int i72 = i71 | 49;
            i7 = (i72 << 1) - ((~(i71 & 49)) & i72);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                this.c = ivas.gov.bisp.enumeration.p100w.r.y(this.d);
                int i73 = 80 / 0;
            } else {
                this.c = ivas.gov.bisp.enumeration.p100w.r.y(this.d);
            }
            int i74 = a;
            int i75 = (i74 & 52) + (i74 | 52);
            int i76 = (i75 ^ (-1)) + (i75 << 1);
            b = i76 % 128;
            int i77 = i76 % 2;
        }
        int i78 = i25 & 13;
        int i79 = (((i25 ^ 13) | i78) << 1) - ((~i78) & (i25 | 13));
        b = i79 % 128;
        int i80 = i79 % 2;
        int i81 = ((i25 | 30) << 1) - (i25 ^ 30);
        int i82 = (i81 ^ (-1)) + (i81 << 1);
        b = i82 % 128;
        int i83 = i82 % 2;
        int i84 = 2 % 2;
        z = false;
        if (!(!z)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int i710 = b;
        int i711 = i710 | 49;
        i7 = (i711 << 1) - ((~(i710 & 49)) & i711);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.c = ivas.gov.bisp.enumeration.p100w.r.y(this.d);
            int i712 = 80 / 0;
        } else {
            this.c = ivas.gov.bisp.enumeration.p100w.r.y(this.d);
        }
        int i713 = a;
        int i714 = (i713 & 52) + (i713 | 52);
        int i715 = (i714 ^ (-1)) + (i714 << 1);
        b = i715 % 128;
        int i716 = i715 % 2;
    }

    public byte[] c() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.d;
        byte[] bArr = new byte[4];
        char c = 5;
        int i7 = ((i3 & (-6)) | ((~i3) & 5)) + ((i3 & 5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        bArr[0] = (byte) i6;
        bArr[1] = (byte) (i6 >>> 8);
        int i9 = ((i3 ^ 102) + ((i3 & 102) << 1)) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = i6 ^ 85;
            int i11 = ((i6 & 85) | i10) << 1;
            int i12 = -i10;
            bArr[2] = (byte) ((i11 ^ i12) + ((i12 & i11) << 1));
            int i13 = i6 & (-94);
            int i14 = ((i6 ^ (-94)) | i13) << 1;
            int i15 = -((i6 | (-94)) & (~i13));
            i = ((i14 | i15) << 1) - (i15 ^ i14);
        } else {
            bArr[2] = (byte) (i6 >>> 16);
            i = i6 >>> 24;
            c = 3;
        }
        int i16 = i3 + 27;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            bArr[c] = (byte) i;
            int i17 = 99 / 0;
        } else {
            bArr[c] = (byte) i;
        }
        int i18 = i3 & 87;
        int i19 = (i3 | 87) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 29 / 0;
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public int d(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 + 91;
        int i6 = i5 % 128;
        b = i6;
        int i7 = 0;
        Object obj = null;
        int i8 = 1;
        if (i5 % 2 == 0) {
            int i9 = i6 & 125;
            int i10 = -(-((i6 ^ 125) | i9));
            i2 = (i9 & i10) + (i9 | i10);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                i7 = 1;
            }
            i8 = i7;
        } else {
            int i11 = 1 << this.c;
            int i12 = (((i11 ^ (-2)) | (i11 & (-2))) << 1) - (((~i11) & (-2)) | (i11 & 1));
            if (i12 == 0) {
                int i13 = i6 & 125;
                int i14 = -(-((i6 ^ 125) | i13));
                i2 = (i13 & i14) + (i13 | i14);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    i7 = 1;
                }
                i8 = i7;
            } else if (i == 0) {
                int i15 = (i6 ^ 5) + ((i6 & 5) << 1);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    i7 = 1;
                }
                i8 = i7;
            } else if (i == 1) {
                int i16 = i6 ^ 65;
                int i17 = -(-((i6 & 65) << 1));
                int i18 = (i16 & i17) + (i16 | i17);
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                int i21 = i19 + 47;
                b = i21 % 128;
                int i22 = i21 % 2;
            } else {
                if (i12 < 0) {
                    int i23 = (i4 ^ 115) + ((i4 & 115) << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    i = d(i);
                    i12 = -i12;
                    int i25 = a;
                    int i26 = (((i25 | 20) << 1) - (i25 ^ 20)) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
                int i28 = b;
                int i29 = i28 & 55;
                int i30 = -(-((i28 ^ 55) | i29));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                a = i31 % 128;
                int i32 = i31 % 2;
                int iF = 1;
                while (i12 != 0) {
                    int i33 = a;
                    int i34 = i33 & 57;
                    int i35 = -(-(i33 | 57));
                    int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    if ((i12 & 1) == 1) {
                        int i38 = (i33 & (-98)) | ((~i33) & 97);
                        int i39 = -(-((i33 & 97) << 1));
                        int i40 = (i38 & i39) + (i39 | i38);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        iF = f(iF, i);
                        int i42 = a;
                        int i43 = (i42 & (-56)) | ((~i42) & 55);
                        int i44 = (i42 & 55) << 1;
                        int i45 = (i43 & i44) + (i44 | i43);
                        b = i45 % 128;
                        int i46 = i45 % 2;
                    }
                    i = f(i, i);
                    i12 >>>= 1;
                    int i47 = a;
                    int i48 = (((i47 ^ 77) | (i47 & 77)) << 1) - (((~i47) & 77) | (i47 & (-78)));
                    int i49 = i48 % 128;
                    b = i49;
                    if (i48 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i50 = i49 | 63;
                    int i51 = (i50 << 1) - ((~(i49 & 63)) & i50);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                }
                i8 = iF;
            }
        }
        int i53 = a;
        int i54 = (-2) - (((i53 & 4) + (i53 | 4)) ^ (-1));
        b = i54 % 128;
        if (i54 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public boolean e(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 97;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.c;
        boolean z = false;
        if (i7 == 31) {
            int i8 = i5 & 85;
            int i9 = (((~i8) & (i5 | 85)) - (~(i8 << 1))) - 1;
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            if (i >= 0) {
                int i12 = i10 & 83;
                int i13 = ((~i12) & (i10 | 83)) + (i12 << 1);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    z = true;
                }
            }
            int i14 = ((i10 | 29) << 1) - (i10 ^ 29);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i >= 0) {
            int i15 = i3 & 7;
            int i16 = (i3 ^ 7) | i15;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            if (i < (1 << i7)) {
                int i19 = ((i3 & (-88)) | ((~i3) & 87)) + ((i3 & 87) << 1);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    z = true;
                }
            }
        }
        int i20 = ((i3 ^ 67) | (i3 & 67)) << 1;
        int i21 = -(((~i3) & 67) | (i3 & (-68)));
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public boolean equals(Object obj) {
        int i;
        int i2;
        c cVar;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 7;
        int i8 = ((i6 ^ 7) | i7) << 1;
        int i9 = -((i6 | 7) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 == 0) {
            int i12 = 89 / 0;
            if (obj != null) {
                int i13 = i11 & 53;
                int i14 = ((i11 ^ 53) | i13) << 1;
                int i15 = -((~i13) & (i11 | 53));
                int i16 = (i14 & i15) + (i14 | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                if (obj instanceof c) {
                    int i18 = i11 & 37;
                    int i19 = (i11 ^ 37) | i18;
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    i = i20 % 128;
                    a = i;
                    i2 = i20 % 2;
                    cVar = (c) obj;
                    i3 = this.c;
                    if (i2 != 0) {
                        int i21 = 39 / 0;
                        if (i3 == cVar.c) {
                            if (this.d == cVar.d) {
                                i4 = i + 77;
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    } else if (i3 == cVar.c) {
                        if (this.d == cVar.d) {
                            i4 = i + 77;
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        } else if (obj != null) {
            int i110 = i11 & 53;
            int i111 = ((i11 ^ 53) | i110) << 1;
            int i112 = -((~i110) & (i11 | 53));
            int i113 = (i111 & i112) + (i111 | i112);
            a = i113 % 128;
            int i114 = i113 % 2;
            if (obj instanceof c) {
                int i115 = i11 & 37;
                int i116 = (i11 ^ 37) | i115;
                int i22 = ((i115 | i116) << 1) - (i116 ^ i115);
                i = i22 % 128;
                a = i;
                i2 = i22 % 2;
                cVar = (c) obj;
                i3 = this.c;
                if (i2 != 0) {
                    int i23 = 39 / 0;
                    if (i3 == cVar.c) {
                        if (this.d == cVar.d) {
                            i4 = i + 77;
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                return false;
                            }
                            return true;
                        }
                    }
                } else if (i3 == cVar.c) {
                    if (this.d == cVar.d) {
                        i4 = i + 77;
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        int i24 = a;
        int i25 = ((i24 | 77) << 1) - (i24 ^ 77);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int f(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 17;
        int i6 = (((i4 ^ 17) | i5) << 1) - ((i4 | 17) & (~i5));
        a = i6 % 128;
        int i7 = i6 % 2;
        int iAj = ivas.gov.bisp.enumeration.p100w.r.aj(i, i2, this.d);
        if (i7 != 0) {
            int i8 = 70 / 0;
        }
        return iAj;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = -(-(i2 | 77));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.d;
        int i8 = i2 + 81;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    /* JADX WARN: Code duplicated, block: B:13:0x006b A[PHI: r2
  0x006b: PHI (r2v27 int) = (r2v13 int), (r2v32 int) binds: [B:8:0x0047, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0070  */
    /* JADX WARN: Code duplicated, block: B:16:0x0095  */
    /* JADX WARN: Code duplicated, block: B:19:0x00be  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0049  */
    public String toString() {
        int i;
        int i2;
        String str;
        String string;
        int i3;
        int i4;
        int i5;
        StringBuilder sb;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 29;
        int i11 = ((((i9 ^ 29) | i10) << 1) - (~(-((i9 | 29) & (~i10))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Finite Field GF(2^");
        sbW.append(this.c);
        int i13 = a;
        int i14 = (-2) - (((i13 ^ 108) + ((i13 & 108) << 1)) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
        sbW.append(") = GF(2)[X]/<");
        if (i15 == 0) {
            i = this.d;
            int i16 = 57 / 0;
            if (i == 0) {
                int i17 = a;
                i2 = ((i17 & (-10)) | ((~i17) & 9)) + ((i17 & 9) << 1);
                int i18 = i2 % 128;
                b = i18;
                if (i2 % 2 == 0) {
                    int i19 = 53 / 0;
                }
                int i20 = i18 + 3;
                a = i20 % 128;
                int i21 = i20 % 2;
                str = "0";
            } else {
                if (((byte) (i & 1)) == 1) {
                    int i22 = b;
                    int i23 = i22 & 23;
                    int i24 = i23 + ((i22 ^ 23) | i23);
                    int i25 = i24 % 128;
                    a = i25;
                    int i26 = i24 % 2;
                    int i27 = i25 & 61;
                    int i28 = ((i25 ^ 61) | i27) << 1;
                    int i29 = -((i25 | 61) & (~i27));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    string = "1";
                } else {
                    int i32 = a;
                    int i33 = (i32 & 75) + (i32 | 75);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    string = BuildConfig.FLAVOR;
                }
                i3 = i >>> 1;
                int i35 = a;
                int i36 = i35 & 61;
                int i37 = ((i35 ^ 61) | i36) << 1;
                int i38 = -((i35 | 61) & (~i36));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                b = i39 % 128;
                int i40 = i39 % 2;
                i4 = 1;
                while (i3 != 0) {
                    int i41 = a;
                    int i42 = (i41 & 112) + (i41 | 112);
                    i5 = (i42 ^ (-1)) + (i42 << 1);
                    b = i5 % 128;
                    if (i5 % 2 == 0 ? ((byte) (i3 & 1)) == 1 : ((byte) ((i3 & (-2)) ^ ((~i3) & 1))) == 0) {
                        sb = new StringBuilder();
                        sb.append(string);
                        int i43 = b + 75;
                        a = i43 % 128;
                        i6 = i43 % 2;
                        sb.append("+x^");
                        sb.append(i4);
                        if (i6 != 0) {
                            string = sb.toString();
                            int i44 = 48 / 0;
                        } else {
                            string = sb.toString();
                        }
                        int i45 = a;
                        int i46 = i45 & 85;
                        int i47 = (i45 | 85) & (~i46);
                        int i48 = i46 << 1;
                        int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                        b = i49 % 128;
                        int i50 = i49 % 2;
                    }
                    i3 >>>= 1;
                    int i51 = ((i4 & 74) + (i4 | 74)) - 1;
                    i4 = (((i51 | (-71)) << 1) - (i51 ^ (-71))) - 1;
                    int i52 = a;
                    int i53 = i52 ^ 27;
                    i7 = (((i52 & 27) | i53) << 1) - i53;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i54 = 2 / 4;
                    }
                }
                str = string;
            }
        } else {
            i = this.d;
            if (i == 0) {
                int i110 = a;
                i2 = ((i110 & (-10)) | ((~i110) & 9)) + ((i110 & 9) << 1);
                int i111 = i2 % 128;
                b = i111;
                if (i2 % 2 == 0) {
                    int i112 = 53 / 0;
                }
                int i210 = i111 + 3;
                a = i210 % 128;
                int i211 = i210 % 2;
                str = "0";
            } else {
                if (((byte) (i & 1)) == 1) {
                    int i212 = b;
                    int i213 = i212 & 23;
                    int i214 = i213 + ((i212 ^ 23) | i213);
                    int i215 = i214 % 128;
                    a = i215;
                    int i216 = i214 % 2;
                    int i217 = i215 & 61;
                    int i218 = ((i215 ^ 61) | i217) << 1;
                    int i219 = -((i215 | 61) & (~i217));
                    int i310 = ((i218 | i219) << 1) - (i219 ^ i218);
                    b = i310 % 128;
                    int i311 = i310 % 2;
                    string = "1";
                } else {
                    int i312 = a;
                    int i313 = (i312 & 75) + (i312 | 75);
                    b = i313 % 128;
                    int i314 = i313 % 2;
                    string = BuildConfig.FLAVOR;
                }
                i3 = i >>> 1;
                int i315 = a;
                int i316 = i315 & 61;
                int i317 = ((i315 ^ 61) | i316) << 1;
                int i318 = -((i315 | 61) & (~i316));
                int i319 = ((i317 | i318) << 1) - (i318 ^ i317);
                b = i319 % 128;
                int i410 = i319 % 2;
                i4 = 1;
                while (i3 != 0) {
                    int i411 = a;
                    int i412 = (i411 & 112) + (i411 | 112);
                    i5 = (i412 ^ (-1)) + (i412 << 1);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        sb = new StringBuilder();
                        sb.append(string);
                        int i413 = b + 75;
                        a = i413 % 128;
                        i6 = i413 % 2;
                        sb.append("+x^");
                        sb.append(i4);
                        if (i6 != 0) {
                            string = sb.toString();
                            int i414 = 48 / 0;
                        } else {
                            string = sb.toString();
                        }
                        int i415 = a;
                        int i416 = i415 & 85;
                        int i417 = (i415 | 85) & (~i416);
                        int i418 = i416 << 1;
                        int i419 = (i417 ^ i418) + ((i417 & i418) << 1);
                        b = i419 % 128;
                        int i55 = i419 % 2;
                    } else {
                        sb = new StringBuilder();
                        sb.append(string);
                        int i4110 = b + 75;
                        a = i4110 % 128;
                        i6 = i4110 % 2;
                        sb.append("+x^");
                        sb.append(i4);
                        if (i6 != 0) {
                            string = sb.toString();
                            int i4111 = 48 / 0;
                        } else {
                            string = sb.toString();
                        }
                        int i4112 = a;
                        int i4113 = i4112 & 85;
                        int i4114 = (i4112 | 85) & (~i4113);
                        int i4115 = i4113 << 1;
                        int i4116 = (i4114 ^ i4115) + ((i4114 & i4115) << 1);
                        b = i4116 % 128;
                        int i56 = i4116 % 2;
                    }
                    i3 >>>= 1;
                    int i57 = ((i4 & 74) + (i4 | 74)) - 1;
                    i4 = (((i57 | (-71)) << 1) - (i57 ^ (-71))) - 1;
                    int i58 = a;
                    int i59 = i58 ^ 27;
                    i7 = (((i58 & 27) | i59) << 1) - i59;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i510 = 2 / 4;
                    }
                }
                str = string;
            }
        }
        String strU = ivas.gov.bisp.enumeration.p091n.j.u(sbW, str, "> ");
        int i60 = b;
        int i61 = i60 & 7;
        int i62 = (i60 ^ 7) | i61;
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        a = i63 % 128;
        int i64 = i63 % 2;
        return strU;
    }
}
