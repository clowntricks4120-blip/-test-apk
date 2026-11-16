package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.cO.h;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ak extends O {
    private static int a = 0;
    private static int b = 1;
    public final byte[] c;

    public ak(byte[] bArr) {
        this.c = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 34) << 1) - (i2 ^ 34);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            boolean z = o2 instanceof ak;
            throw null;
        }
        if (!(o2 instanceof ak)) {
            int i6 = i5 ^ 73;
            int i7 = (i5 & 73) << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = (i9 ^ 39) + ((i9 & 39) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((ak) o2).c;
        int i13 = (i2 | 113) << 1;
        int i14 = -(((~i2) & 113) | (i2 & (-114)));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i17 = b;
        int i18 = i17 & 95;
        int i19 = (i17 | 95) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 120;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 != 0) {
            return j.h(bArr);
        }
        int i5 = 50 / 0;
        return j.h(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 == 0) {
            aVar.v(z, 127, bArr);
        } else {
            aVar.v(z, 12, bArr);
        }
        int i5 = a;
        int i6 = i5 & 33;
        int i7 = ((i5 ^ 33) | i6) << 1;
        int i8 = -((i5 | 33) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 97 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 95;
        int i4 = -(-((i2 & 95) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iB = az.b(this.c.length);
        int i7 = iB & 1;
        int i8 = i7 + ((iB ^ 1) | i7);
        int i9 = a;
        int i10 = i9 ^ 39;
        int i11 = ((i9 & 39) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = -(-this.c.length);
        int i16 = i8 & i15;
        int i17 = -(-((i8 ^ i15) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        int i19 = i9 & 15;
        int i20 = (i9 ^ 15) | i19;
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        int i22 = i21 % 2;
        return i18;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 43;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 | 113) << 1;
        int i6 = -(((~i2) & 113) | (i2 & (-114)));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0152  */
    /* JADX WARN: Code duplicated, block: B:43:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x016b  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0113 A[SYNTHETIC] */
    public String toString() {
        byte b2;
        int i;
        byte b3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b4;
        int i8;
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 2 % 2;
        int i15 = a + 27;
        b = i15 % 128;
        int i16 = i15 % 2;
        byte[] bArr2 = this.c;
        int i17 = p.c;
        int i18 = b;
        int i19 = i18 & 7;
        int i20 = (i18 | 7) & (~i19);
        int i21 = -(-(i19 << 1));
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            char[] cArr = new char[bArr2.length];
            short[] sArr = h.c;
            throw null;
        }
        int length = bArr2.length;
        char[] cArr2 = new char[length];
        short[] sArr2 = h.c;
        int i23 = b;
        int i24 = ((i23 & (-122)) | ((~i23) & 121)) + ((i23 & 121) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = 0;
        int i27 = 0;
        loop0: while (i27 < bArr2.length) {
            int i28 = a + 23;
            int i29 = i28 % 128;
            b = i29;
            if (i28 % 2 != 0) {
                int i30 = (i27 ^ 1) + ((i27 & 1) << 1);
                byte b5 = bArr2[i27];
                b2 = b5;
                if (b5 < 0) {
                    i27 = i30;
                    short s = h.c[b2 & 127];
                    i = s >>> 8;
                    int i31 = a;
                    int i32 = i31 + 41;
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    b3 = (byte) s;
                    i2 = i31 + 113;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i34 = 5 % 2;
                    }
                    while (true) {
                        if (b3 >= 0) {
                            int i35 = b;
                            int i36 = i35 & 31;
                            int i37 = -(-((i35 ^ 31) | i36));
                            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                            i6 = i38 % 128;
                            a = i6;
                            int i39 = i38 % 2;
                            if (i27 < bArr2.length) {
                                int i40 = ((i6 ^ 59) | (i6 & 59)) << 1;
                                int i41 = -(((~i6) & 59) | (i6 & (-60)));
                                i7 = (i40 & i41) + (i41 | i40);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    b4 = bArr2[i27];
                                    i8 = i * 103;
                                    i9 = b4 & 3;
                                } else {
                                    b4 = bArr2[i27];
                                    i8 = i << 6;
                                    i9 = b4 & 63;
                                }
                                int i42 = i8 & i9;
                                int i43 = (i8 | i9) & (~i42);
                                i = (i43 & i42) | (i43 ^ i42);
                                bArr = h.d;
                                i10 = (b4 & 255) >>> 4;
                                int i44 = a;
                                i11 = (i44 ^ 101) + ((i44 & 101) << 1);
                                b = i11 % 128;
                                if (i11 % 2 == 0) {
                                    b3 = bArr[b3 % i10];
                                    int i45 = i27 + 239;
                                    i27 = ((i45 ^ (-1)) + (i45 << 1)) - 124;
                                } else {
                                    b3 = bArr[b3 + i10];
                                    int i46 = i27 & 57;
                                    int i47 = -(-((i27 ^ 57) | i46));
                                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                                    int i49 = i48 & (-56);
                                    i27 = i49 + ((i48 ^ (-56)) | i49);
                                }
                            }
                        } else if (b3 != -2) {
                            int i50 = b;
                            int i51 = i50 & 71;
                            int i52 = -(-((i50 ^ 71) | i51));
                            i3 = ((i51 | i52) << 1) - (i52 ^ i51);
                            i4 = i3 % 128;
                            a = i4;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            if (i <= 65535) {
                                i5 = (((i4 | 113) << 1) - (~(-(i4 ^ 113)))) - 1;
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    throw null;
                                }
                                if (i26 < length) {
                                    cArr2[i26] = (char) i;
                                    int i53 = i26 & 1;
                                    i26 = ((i26 ^ 1) | i53) + i53;
                                    int i54 = (i4 ^ 75) + ((i4 & 75) << 1);
                                    b = i54 % 128;
                                    int i55 = i54 % 2;
                                }
                            } else if (i26 >= (length ^ (-1)) + (length << 1)) {
                                int i56 = i26 + 1;
                                int i57 = i >>> 10;
                                int i58 = i4 + 93;
                                int i59 = i58 % 128;
                                b = i59;
                                int i60 = i58 % 2;
                                int i61 = i57 & 55232;
                                cArr2[i26] = (char) ((((i57 ^ 55232) | i61) << 1) - ((55232 | i57) & (~i61)));
                                int i62 = i26 + 3;
                                i26 = (i62 << 1) + (i62 ^ (-1));
                                int i63 = i59 & 79;
                                int i64 = (i59 ^ 79) | i63;
                                int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                                a = i65 % 128;
                                int i66 = i65 % 2;
                                cArr2[i56] = (char) ((i & 1023) ^ 56320);
                                int i67 = i59 | 53;
                                int i68 = i67 << 1;
                                int i69 = -(i67 & (~(i59 & 53)));
                                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                                a = i70 % 128;
                                int i71 = i70 % 2;
                            }
                        }
                        int i72 = a;
                        int i73 = (i72 | 23) << 1;
                        int i74 = -(((~i72) & 23) | (i72 & (-24)));
                        int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                        b = i75 % 128;
                        int i76 = i75 % 2;
                        i26 = -1;
                        break;
                    }
                }
                i27 = i30;
                int i77 = ((i29 ^ 123) | (i29 & 123)) << 1;
                int i78 = -(((~i29) & 123) | (i29 & (-124)));
                i12 = (i77 ^ i78) + ((i78 & i77) << 1);
                i13 = i12 % 128;
                a = i13;
                if (i12 % 2 == 0) {
                    throw null;
                }
                if (i26 < length) {
                    int i79 = a;
                    int i710 = (i79 | 23) << 1;
                    int i711 = -(((~i79) & 23) | (i79 & (-24)));
                    int i712 = (i710 ^ i711) + ((i711 & i710) << 1);
                    b = i712 % 128;
                    int i713 = i712 % 2;
                    i26 = -1;
                    break;
                }
                cArr2[i26] = (char) b2;
                i26++;
                int i80 = i13 + 79;
                b = i80 % 128;
                int i81 = i80 % 2;
            } else {
                b2 = bArr2[i27];
                if (b2 < 0) {
                    short s2 = h.c[b2 & 127];
                    i = s2 >>> 8;
                    int i310 = a;
                    int i311 = i310 + 41;
                    b = i311 % 128;
                    int i312 = i311 % 2;
                    b3 = (byte) s2;
                    i2 = i310 + 113;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i313 = 5 % 2;
                    }
                    while (true) {
                        if (b3 >= 0) {
                            int i314 = b;
                            int i315 = i314 & 31;
                            int i316 = -(-((i314 ^ 31) | i315));
                            int i317 = ((i315 | i316) << 1) - (i316 ^ i315);
                            i6 = i317 % 128;
                            a = i6;
                            int i318 = i317 % 2;
                            if (i27 < bArr2.length) {
                                int i410 = ((i6 ^ 59) | (i6 & 59)) << 1;
                                int i411 = -(((~i6) & 59) | (i6 & (-60)));
                                i7 = (i410 & i411) + (i411 | i410);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    b4 = bArr2[i27];
                                    i8 = i * 103;
                                    i9 = b4 & 3;
                                } else {
                                    b4 = bArr2[i27];
                                    i8 = i << 6;
                                    i9 = b4 & 63;
                                }
                                int i412 = i8 & i9;
                                int i413 = (i8 | i9) & (~i412);
                                i = (i413 & i412) | (i413 ^ i412);
                                bArr = h.d;
                                i10 = (b4 & 255) >>> 4;
                                int i414 = a;
                                i11 = (i414 ^ 101) + ((i414 & 101) << 1);
                                b = i11 % 128;
                                if (i11 % 2 == 0) {
                                    b3 = bArr[b3 % i10];
                                    int i415 = i27 + 239;
                                    i27 = ((i415 ^ (-1)) + (i415 << 1)) - 124;
                                } else {
                                    b3 = bArr[b3 + i10];
                                    int i416 = i27 & 57;
                                    int i417 = -(-((i27 ^ 57) | i416));
                                    int i418 = ((i416 | i417) << 1) - (i417 ^ i416);
                                    int i419 = i418 & (-56);
                                    i27 = i419 + ((i418 ^ (-56)) | i419);
                                }
                            }
                        } else if (b3 != -2) {
                            int i510 = b;
                            int i511 = i510 & 71;
                            int i512 = -(-((i510 ^ 71) | i511));
                            i3 = ((i511 | i512) << 1) - (i512 ^ i511);
                            i4 = i3 % 128;
                            a = i4;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            if (i <= 65535) {
                                i5 = (((i4 | 113) << 1) - (~(-(i4 ^ 113)))) - 1;
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    throw null;
                                }
                                if (i26 < length) {
                                    cArr2[i26] = (char) i;
                                    int i513 = i26 & 1;
                                    i26 = ((i26 ^ 1) | i513) + i513;
                                    int i514 = (i4 ^ 75) + ((i4 & 75) << 1);
                                    b = i514 % 128;
                                    int i515 = i514 % 2;
                                }
                            } else if (i26 >= (length ^ (-1)) + (length << 1)) {
                                int i516 = i26 + 1;
                                int i517 = i >>> 10;
                                int i518 = i4 + 93;
                                int i519 = i518 % 128;
                                b = i519;
                                int i610 = i518 % 2;
                                int i611 = i517 & 55232;
                                cArr2[i26] = (char) ((((i517 ^ 55232) | i611) << 1) - ((55232 | i517) & (~i611)));
                                int i612 = i26 + 3;
                                i26 = (i612 << 1) + (i612 ^ (-1));
                                int i613 = i519 & 79;
                                int i614 = (i519 ^ 79) | i613;
                                int i615 = ((i613 | i614) << 1) - (i613 ^ i614);
                                a = i615 % 128;
                                int i616 = i615 % 2;
                                cArr2[i516] = (char) ((i & 1023) ^ 56320);
                                int i617 = i519 | 53;
                                int i618 = i617 << 1;
                                int i619 = -(i617 & (~(i519 & 53)));
                                int i714 = ((i618 | i619) << 1) - (i619 ^ i618);
                                a = i714 % 128;
                                int i715 = i714 % 2;
                            }
                        }
                        int i716 = a;
                        int i717 = (i716 | 23) << 1;
                        int i718 = -(((~i716) & 23) | (i716 & (-24)));
                        int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                        b = i719 % 128;
                        int i7110 = i719 % 2;
                        i26 = -1;
                        break;
                    }
                }
                int i720 = ((i29 ^ 123) | (i29 & 123)) << 1;
                int i721 = -(((~i29) & 123) | (i29 & (-124)));
                i12 = (i720 ^ i721) + ((i721 & i720) << 1);
                i13 = i12 % 128;
                a = i13;
                if (i12 % 2 == 0) {
                    throw null;
                }
                if (i26 < length) {
                    int i7111 = a;
                    int i7112 = (i7111 | 23) << 1;
                    int i7113 = -(((~i7111) & 23) | (i7111 & (-24)));
                    int i7114 = (i7112 ^ i7113) + ((i7113 & i7112) << 1);
                    b = i7114 % 128;
                    int i7115 = i7114 % 2;
                    i26 = -1;
                    break;
                }
                cArr2[i26] = (char) b2;
                i26++;
                int i82 = i13 + 79;
                b = i82 % 128;
                int i83 = i82 % 2;
            }
        }
        if (i26 < 0) {
            throw new IllegalArgumentException("Invalid UTF-8 input");
        }
        String str = new String(cArr2, 0, i26);
        int i84 = a + 73;
        b = i84 % 128;
        int i85 = i84 % 2;
        return str;
    }
}
