package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: loaded from: classes.dex */
public class ad extends C0275u {
    private static int a = 1;
    private static int b;

    public ad(byte[] bArr) {
        super(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.C0275u, ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 71) | (i2 & 71)) << 1;
        int i4 = -(((~i2) & 71) | (i2 & (-72)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        aVar.v(z, 24, p());
        int i7 = a;
        int i8 = i7 | 49;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 49)) & i8);
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.C0275u, ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 56) + ((i2 & 56) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int length = p().length;
        int iB = az.b(length);
        int i5 = (iB & (-2)) | ((~iB) & 1);
        int i6 = (iB & 1) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = a + 123;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i7 / length;
        }
        int i9 = -(-length);
        int i10 = i7 & i9;
        int i11 = -(-(i9 | i7));
        return ((i10 | i11) << 1) - (i11 ^ i10);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.C0275u, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 97;
        int i4 = -(-((i2 & 97) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            int i7 = 15 / 0;
        }
        int i8 = (i6 ^ 93) + ((i6 & 93) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.C0275u, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = (((i2 ^ 81) | i3) << 1) - ((~i3) & (i2 | 81));
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i2 ^ 85) | (i2 & 85)) << 1;
        int i7 = -(((~i2) & 85) | (i2 & (-86)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 79 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb A[EDGE_INSN: B:111:0x01bb->B:65:0x01bb BREAK  A[LOOP:1: B:57:0x0156->B:64:0x01a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0209 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0249  */
    /* JADX WARN: Code duplicated, block: B:75:0x024f  */
    public final byte[] p() {
        boolean z;
        byte[] bArrC;
        byte[] bArr;
        int i;
        boolean z2;
        int i2;
        int i3;
        int length;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        int i6;
        byte[] bArr4;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b + 79;
        a = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr5 = this.c;
        int length2 = bArr5.length;
        Object obj = null;
        if (bArr5[((length2 << 1) - length2) - 1] != 90) {
            int i12 = b;
            int i13 = (i12 ^ 51) + ((i12 & 51) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return bArr5;
            }
            obj.hashCode();
            throw null;
        }
        int i14 = a + 79;
        b = i14 % 128;
        if (i14 % 2 == 0 ? !o(10) : !o(89)) {
            int i15 = b;
            int i16 = i15 & 47;
            int i17 = i15 | 47;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            z = false;
        } else {
            int i20 = b;
            int i21 = i20 ^ 35;
            int i22 = ((i20 & 35) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            a = i24 % 128;
            if (i24 % 2 != 0 ? !o(11) : !o(125)) {
                int i110 = b;
                int i111 = i110 & 47;
                int i112 = i110 | 47;
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i113 % 128;
                int i114 = i113 % 2;
                z = false;
            } else {
                int i25 = b;
                int i26 = ((i25 ^ 53) | (i25 & 53)) << 1;
                int i27 = -(((~i25) & 53) | (i25 & (-54)));
                int i28 = (i26 & i27) + (i27 | i26);
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                int i31 = i29 & 79;
                int i32 = ((i29 | 79) & (~i31)) + (i31 << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
                z = true;
            }
        }
        if (!z) {
            int i34 = a + 5;
            b = i34 % 128;
            int i35 = i34 % 2;
            byte[] bArr6 = this.c;
            int length3 = bArr6.length;
            int i36 = length3 & 4;
            int i37 = ((length3 ^ 4) | i36) << 1;
            int i38 = -((length3 | 4) & (~i36));
            byte[] bArr7 = new byte[((i37 | i38) << 1) - (i38 ^ i37)];
            int i39 = b;
            int i40 = (i39 | 49) << 1;
            int i41 = -(((~i39) & 49) | (i39 & (-50)));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            int length4 = bArr6.length;
            System.arraycopy(bArr6, 0, bArr7, 0, (length4 ^ (-1)) + (length4 << 1));
            byte[] bArrC2 = p.c("0000Z");
            int i44 = b + 3;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                System.arraycopy(bArrC2, 0, bArr7, this.c.length, 4);
            } else {
                System.arraycopy(bArrC2, 0, bArr7, this.c.length - 1, 5);
            }
            int i45 = b + 115;
            a = i45 % 128;
            if (i45 % 2 != 0) {
                return bArr7;
            }
            throw null;
        }
        if (o(12)) {
            int i46 = a;
            int i47 = (i46 & (-54)) | ((~i46) & 53);
            int i48 = -(-((i46 & 53) << 1));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            b = i49 % 128;
            if (i49 % 2 == 0 ? o(13) : o(50)) {
                int i50 = b;
                int i51 = i50 ^ 83;
                int i52 = (((i50 & 83) | i51) << 1) - i51;
                int i53 = i52 % 128;
                a = i53;
                int i54 = i52 % 2;
                int i55 = i53 & 113;
                int i56 = (((i53 | 113) & (~i55)) - (~(i55 << 1))) - 1;
                b = i56 % 128;
                int i57 = i56 % 2;
                int i58 = 0;
                while (true) {
                    bArr = this.c;
                    if (i58 == bArr.length) {
                        int i59 = b;
                        int i60 = (((i59 & (-72)) | ((~i59) & 71)) - (~(-(-((i59 & 71) << 1))))) - 1;
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        break;
                    }
                    int i62 = b;
                    int i63 = i62 ^ 123;
                    int i64 = (i62 & 123) << 1;
                    int i65 = (i63 & i64) + (i63 | i64);
                    a = i65 % 128;
                    if (i65 % 2 == 0) {
                        if (bArr[i58] != 104) {
                            continue;
                        } else if (i58 == 14) {
                            i = (i62 & 77) + (i62 | 77);
                            a = i % 128;
                            if (i % 2 == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int i66 = i62 & 81;
                            int i67 = i66 + ((i62 ^ 81) | i66);
                            i2 = i67 % 128;
                            a = i2;
                            int i68 = i67 % 2;
                            if (z2) {
                                break;
                            }
                            i3 = i2 + 121;
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                length = bArr.length >>> 2;
                            } else {
                                int length5 = bArr.length;
                                int i69 = length5 & (-2);
                                int i70 = -(-((length5 ^ (-2)) | i69));
                                length = ((i69 | i70) << 1) - (i70 ^ i69);
                            }
                            i4 = ((i2 | 37) << 1) - (i2 ^ 37);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i71 = 3 / 3;
                            }
                            while (length > 0) {
                                int i72 = a;
                                int i73 = (i72 ^ 35) + ((i72 & 35) << 1);
                                b = i73 % 128;
                                int i74 = i73 % 2;
                                if (this.c[length] == 48) {
                                    break;
                                }
                                int i75 = b;
                                int i76 = i75 & 119;
                                i8 = i76 + ((i75 ^ 119) | i76);
                                int i77 = i8 % 128;
                                a = i77;
                                if (i8 % 2 == 0) {
                                    int i78 = length & 183;
                                    int i79 = ((length ^ 183) | i78) << 1;
                                    int i80 = -((length | 183) & (~i78));
                                    int i81 = (i79 & i80) + (i80 | i79);
                                    int i82 = i81 & (-119);
                                    length = ((~i82) & (i81 | (-119))) + (i82 << 1);
                                } else {
                                    int i83 = length & 36;
                                    int i84 = (i83 - (~(-(-((length ^ 36) | i83))))) - 1;
                                    int i85 = i84 & (-37);
                                    length = i85 + ((i84 ^ (-37)) | i85);
                                }
                                int i86 = i77 & 113;
                                int i87 = ((i77 ^ 113) | i86) << 1;
                                int i88 = -((i77 | 113) & (~i86));
                                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                                b = i89 % 128;
                                int i90 = i89 % 2;
                            }
                            bArr2 = this.c;
                            if (bArr2[length] == 46) {
                                int i91 = length & 2;
                                int i92 = (length ^ 2) | i91;
                                bArr3 = new byte[((i91 | i92) << 1) - (i91 ^ i92)];
                                int i93 = length & 59;
                                int i94 = -(-((length ^ 59) | i93));
                                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                                int i96 = ((i95 ^ (-58)) | (i95 & (-58))) << 1;
                                int i97 = -((i95 & 57) | ((~i95) & (-58)));
                                i5 = ((i96 | i97) << 1) - (i96 ^ i97);
                                int i98 = b;
                                i6 = ((i98 ^ 116) + ((i98 & 116) << 1)) - 1;
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    System.arraycopy(bArr2, 0, bArr3, 1, i5);
                                    bArr3[i5] = 89;
                                } else {
                                    System.arraycopy(bArr2, 0, bArr3, 0, i5);
                                    bArr3[i5] = 90;
                                }
                                return bArr3;
                            }
                            int i99 = a;
                            int i100 = i99 & 95;
                            int i101 = -(-((i99 ^ 95) | i100));
                            int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                            b = i102 % 128;
                            int i103 = i102 % 2;
                            int i104 = length & 1;
                            int i105 = -(-((length ^ 1) | i104));
                            bArr4 = new byte[(i104 ^ i105) + ((i104 & i105) << 1)];
                            System.arraycopy(bArr2, 0, bArr4, 0, length);
                            int i106 = a;
                            int i107 = (i106 & 30) + (i106 | 30);
                            int i108 = (i107 ^ (-1)) + (i107 << 1);
                            int i109 = i108 % 128;
                            b = i109;
                            int i115 = i108 % 2;
                            bArr4[length] = 90;
                            int i116 = i109 & 111;
                            int i117 = -(-(i109 | 111));
                            i7 = (i116 ^ i117) + ((i116 & i117) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                return bArr4;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    } else if (bArr[i58] != 46) {
                        continue;
                    } else if (i58 == 14) {
                        i = (i62 & 77) + (i62 | 77);
                        a = i % 128;
                        if (i % 2 == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i610 = i62 & 81;
                        int i611 = i610 + ((i62 ^ 81) | i610);
                        i2 = i611 % 128;
                        a = i2;
                        int i612 = i611 % 2;
                        if (z2) {
                            break;
                        }
                        i3 = i2 + 121;
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            length = bArr.length >>> 2;
                        } else {
                            int length6 = bArr.length;
                            int i613 = length6 & (-2);
                            int i710 = -(-((length6 ^ (-2)) | i613));
                            length = ((i613 | i710) << 1) - (i710 ^ i613);
                        }
                        i4 = ((i2 | 37) << 1) - (i2 ^ 37);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i711 = 3 / 3;
                        }
                        while (length > 0) {
                            int i712 = a;
                            int i713 = (i712 ^ 35) + ((i712 & 35) << 1);
                            b = i713 % 128;
                            int i714 = i713 % 2;
                            if (this.c[length] == 48) {
                                break;
                                break;
                            }
                            int i715 = b;
                            int i716 = i715 & 119;
                            i8 = i716 + ((i715 ^ 119) | i716);
                            int i717 = i8 % 128;
                            a = i717;
                            if (i8 % 2 == 0) {
                                int i718 = length & 183;
                                int i719 = ((length ^ 183) | i718) << 1;
                                int i810 = -((length | 183) & (~i718));
                                int i811 = (i719 & i810) + (i810 | i719);
                                int i812 = i811 & (-119);
                                length = ((~i812) & (i811 | (-119))) + (i812 << 1);
                            } else {
                                int i813 = length & 36;
                                int i814 = (i813 - (~(-(-((length ^ 36) | i813))))) - 1;
                                int i815 = i814 & (-37);
                                length = i815 + ((i814 ^ (-37)) | i815);
                            }
                            int i816 = i717 & 113;
                            int i817 = ((i717 ^ 113) | i816) << 1;
                            int i818 = -((i717 | 113) & (~i816));
                            int i819 = ((i817 | i818) << 1) - (i818 ^ i817);
                            b = i819 % 128;
                            int i910 = i819 % 2;
                        }
                        bArr2 = this.c;
                        if (bArr2[length] == 46) {
                            int i911 = length & 2;
                            int i912 = (length ^ 2) | i911;
                            bArr3 = new byte[((i911 | i912) << 1) - (i911 ^ i912)];
                            int i913 = length & 59;
                            int i914 = -(-((length ^ 59) | i913));
                            int i915 = (i913 ^ i914) + ((i914 & i913) << 1);
                            int i916 = ((i915 ^ (-58)) | (i915 & (-58))) << 1;
                            int i917 = -((i915 & 57) | ((~i915) & (-58)));
                            i5 = ((i916 | i917) << 1) - (i916 ^ i917);
                            int i918 = b;
                            i6 = ((i918 ^ 116) + ((i918 & 116) << 1)) - 1;
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                System.arraycopy(bArr2, 0, bArr3, 1, i5);
                                bArr3[i5] = 89;
                            } else {
                                System.arraycopy(bArr2, 0, bArr3, 0, i5);
                                bArr3[i5] = 90;
                            }
                            return bArr3;
                        }
                        int i919 = a;
                        int i1010 = i919 & 95;
                        int i1011 = -(-((i919 ^ 95) | i1010));
                        int i1012 = (i1010 ^ i1011) + ((i1011 & i1010) << 1);
                        b = i1012 % 128;
                        int i1013 = i1012 % 2;
                        int i1014 = length & 1;
                        int i1015 = -(-((length ^ 1) | i1014));
                        bArr4 = new byte[(i1014 ^ i1015) + ((i1014 & i1015) << 1)];
                        System.arraycopy(bArr2, 0, bArr4, 0, length);
                        int i1016 = a;
                        int i1017 = (i1016 & 30) + (i1016 | 30);
                        int i1018 = (i1017 ^ (-1)) + (i1017 << 1);
                        int i1019 = i1018 % 128;
                        b = i1019;
                        int i118 = i1018 % 2;
                        bArr4[length] = 90;
                        int i119 = i1019 & 111;
                        int i1110 = -(-(i1019 | 111));
                        i7 = (i119 ^ i1110) + ((i119 & i1110) << 1);
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            return bArr4;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i120 = (i58 ^ 66) + ((i58 & 66) << 1);
                    i58 = ((i120 & (-64)) + (i120 | (-64))) - 1;
                    int i121 = i62 + 105;
                    a = i121 % 128;
                    int i122 = i121 % 2;
                }
                int i123 = b;
                int i124 = i123 ^ 87;
                int i125 = ((i123 & 87) | i124) << 1;
                int i126 = -i124;
                int i127 = ((i125 | i126) << 1) - (i125 ^ i126);
                a = i127 % 128;
                if (i127 % 2 != 0) {
                    return bArr;
                }
                throw null;
            }
        }
        int i128 = b;
        int i129 = i128 & 5;
        int i130 = ((i128 ^ 5) | i129) << 1;
        int i131 = -((~i129) & (i128 | 5));
        int i132 = (i130 & i131) + (i130 | i131);
        a = i132 % 128;
        if (i132 % 2 == 0) {
            int i133 = 4 / 4;
        }
        int i134 = i128 & 7;
        int i135 = ((i128 | 7) & (~i134)) + (i134 << 1);
        a = i135 % 128;
        int i136 = i135 % 2;
        byte[] bArr8 = this.c;
        int length7 = bArr8.length;
        int i137 = length7 & 2;
        byte[] bArr9 = new byte[i137 + ((length7 ^ 2) | i137)];
        int i138 = a;
        int i139 = i138 ^ 39;
        int i140 = (((i138 & 39) | i139) << 1) - i139;
        b = i140 % 128;
        if (i140 % 2 != 0) {
            System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
            bArrC = p.c("00Z");
        } else {
            System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length - 1);
            bArrC = p.c("00Z");
        }
        int length8 = this.c.length;
        System.arraycopy(bArrC, 0, bArr9, (length8 ^ (-1)) + (length8 << 1), 3);
        int i141 = a;
        int i142 = i141 & 1;
        int i143 = (i142 - (~(-(-((i141 ^ 1) | i142))))) - 1;
        b = i143 % 128;
        int i144 = i143 % 2;
        return bArr9;
    }
}
