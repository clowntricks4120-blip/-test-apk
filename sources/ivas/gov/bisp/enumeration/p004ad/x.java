package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.p003ac.i;
import ivas.gov.bisp.enumeration.p003ac.r;
import ivas.gov.bisp.enumeration.p003ac.t;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class x extends S {
    private static int a = 0;
    private static int b = 1;
    public int aj = 0;
    public boolean ai = true;
    public int ak = 0;

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 95) + (i2 | 95);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((((i2 ^ 47) | (i2 & 47)) << 1) - (~(-(((~i2) & 47) | (i2 & (-48)))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = (i2 ^ 69) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        String strU = j.u(j.w("[Barrier] "), this.Z, " {");
        int i7 = a + 44;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2 == 0 ? 1 : 0;
        while (i9 < this.ah) {
            int i10 = b;
            int i11 = i10 & 77;
            int i12 = -(-((i10 ^ 77) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                C0087m c0087m = this.ag[i9];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            C0087m c0087m2 = this.ag[i9];
            if (i9 > 0) {
                strU = j.r(strU, ", ");
                int i14 = b;
                int i15 = (i14 ^ 5) + ((i14 & 5) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            StringBuilder sbW = j.w(strU);
            sbW.append(c0087m2.Z);
            int i17 = b;
            int i18 = i17 ^ 9;
            int i19 = ((i17 & 9) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 & i20) + (i19 | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            strU = sbW.toString();
            int i23 = i9 & 1;
            i9 = (i23 - (~((i9 ^ 1) | i23))) - 1;
            int i24 = a;
            int i25 = ((((i24 ^ 91) | (i24 & 91)) << 1) - (~(-(((~i24) & 91) | (i24 & (-92)))))) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 3 / 4;
            }
        }
        String strR = j.r(strU, "}");
        int i27 = a + 99;
        b = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 29 / 0;
        }
        return strR;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:102:0x0257  */
    /* JADX WARN: Code duplicated, block: B:103:0x0259  */
    /* JADX WARN: Code duplicated, block: B:106:0x025f  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x0307  */
    /* JADX WARN: Code duplicated, block: B:130:0x0325  */
    /* JADX WARN: Code duplicated, block: B:142:0x0395  */
    /* JADX WARN: Code duplicated, block: B:206:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0179 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d3 A[PHI: r8
  0x00d3: PHI (r8v65 ivas.gov.bisp.enumeration.ad.m) = (r8v64 ivas.gov.bisp.enumeration.ad.m), (r8v80 ivas.gov.bisp.enumeration.ad.m) binds: [B:23:0x00d1, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212 A[PHI: r12
  0x0212: PHI (r12v21 int) = (r12v20 int), (r12v23 int) binds: [B:85:0x0210, B:82:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250 A[DONT_INVERT] */
    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public void d(i iVar) throws Throwable {
        N[] nArr;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        Object obj;
        int i2;
        t tVarN;
        N[] nArr2;
        int i3;
        int i4;
        r rVarP;
        t tVarO;
        int i5;
        int i6;
        C0087m c0087m;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        N[] nArr3 = this.K;
        int i11 = 0;
        nArr3[0] = this.B;
        nArr3[2] = this.A;
        nArr3[1] = this.C;
        int i12 = a;
        int i13 = (i12 & 39) + (i12 | 39);
        b = i13 % 128;
        int i14 = i13 % 2;
        nArr3[3] = this.E;
        int i15 = b;
        int i16 = i15 & 111;
        int i17 = (i15 ^ 111) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (true) {
            nArr = this.K;
            if (i20 >= nArr.length) {
                break;
            }
            int i21 = b;
            int i22 = i21 | 71;
            int i23 = i22 << 1;
            int i24 = -((~(i21 & 71)) & i22);
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                N n = nArr[i20];
                n.i = iVar.n(n);
                int i26 = 23 / 0;
            } else {
                N n2 = nArr[i20];
                n2.i = iVar.n(n2);
            }
            int i27 = (i20 & (-125)) | ((~i20) & 124);
            int i28 = (i20 & 124) << 1;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            int i30 = i29 & (-123);
            int i31 = (i29 ^ (-123)) | i30;
            i20 = (i30 | i31) + (i30 & i31);
        }
        int i32 = this.aj;
        if (i32 >= 0) {
            int i33 = a;
            int i34 = (i33 & 11) + (i33 | 11);
            b = i34 % 128;
            int i35 = i34 % 2;
            if (i32 < 4) {
                int i36 = ((i33 | 93) << 1) - (i33 ^ 93);
                b = i36 % 128;
                int i37 = i36 % 2;
                N n3 = nArr[i32];
                int i38 = 0;
                while (true) {
                    th = null;
                    if (i38 >= this.ah) {
                        z = false;
                        break;
                    }
                    int i39 = a;
                    int i40 = (((i39 & (-34)) | ((~i39) & 33)) - (~(-(-((i39 & 33) << 1))))) - 1;
                    b = i40 % 128;
                    if (i40 % 2 == 0) {
                        c0087m = this.ag[i38];
                        int i41 = 22 / 0;
                        if (!this.ai) {
                            int i42 = b;
                            i7 = ((i42 | 65) << 1) - (i42 ^ 65);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                c0087m.e();
                                throw null;
                            }
                            if (c0087m.e()) {
                                continue;
                            }
                        }
                        i38++;
                        int i43 = b + 46;
                        int i44 = (i43 ^ (-1)) + (i43 << 1);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    } else {
                        c0087m = this.ag[i38];
                        if (!this.ai) {
                            int i46 = b;
                            i7 = ((i46 | 65) << 1) - (i46 ^ 65);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                c0087m.e();
                                throw null;
                            }
                            if (c0087m.e()) {
                                continue;
                            }
                        }
                        i38++;
                        int i47 = b + 46;
                        int i48 = (i47 ^ (-1)) + (i47 << 1);
                        a = i48 % 128;
                        int i49 = i48 % 2;
                    }
                    int i50 = this.aj;
                    if (i50 != 0) {
                        int i51 = a;
                        int i52 = ((i51 & 6) + (i51 | 6)) - 1;
                        b = i52 % 128;
                        if (i52 % 2 != 0 ? i50 != 1 : i50 != 0) {
                            i8 = this.aj;
                            if ((i8 != 2 || i8 == 3) && c0087m.n() == 3) {
                                int i53 = a;
                                int i54 = (i53 & (-58)) | ((~i53) & 57);
                                int i55 = -(-((i53 & 57) << 1));
                                i9 = (i54 ^ i55) + ((i55 & i54) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n4 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null || c0087m.E.f == null) {
                                }
                            }
                            i38++;
                            int i410 = b + 46;
                            int i411 = (i410 ^ (-1)) + (i410 << 1);
                            a = i411 % 128;
                            int i412 = i411 % 2;
                        } else if (c0087m.k() == 3) {
                            int i56 = a;
                            int i57 = (((i56 | 106) << 1) - (i56 ^ 106)) - 1;
                            b = i57 % 128;
                            int i58 = i57 % 2;
                            if (c0087m.B.f != null || c0087m.C.f == null) {
                                i8 = this.aj;
                                if (i8 != 2) {
                                    int i59 = a;
                                    int i510 = (i59 & (-58)) | ((~i59) & 57);
                                    int i511 = -(-((i59 & 57) << 1));
                                    i9 = (i510 ^ i511) + ((i511 & i510) << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        N n5 = c0087m.A.f;
                                        th.hashCode();
                                        throw null;
                                    }
                                    if (c0087m.A.f != null) {
                                        continue;
                                    }
                                } else {
                                    int i512 = a;
                                    int i513 = (i512 & (-58)) | ((~i512) & 57);
                                    int i514 = -(-((i512 & 57) << 1));
                                    i9 = (i513 ^ i514) + ((i514 & i513) << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        N n6 = c0087m.A.f;
                                        th.hashCode();
                                        throw null;
                                    }
                                    if (c0087m.A.f != null) {
                                        continue;
                                    }
                                }
                                i38++;
                                int i413 = b + 46;
                                int i414 = (i413 ^ (-1)) + (i413 << 1);
                                a = i414 % 128;
                                int i415 = i414 % 2;
                            }
                        } else {
                            i8 = this.aj;
                            if (i8 != 2) {
                                int i515 = a;
                                int i516 = (i515 & (-58)) | ((~i515) & 57);
                                int i517 = -(-((i515 & 57) << 1));
                                i9 = (i516 ^ i517) + ((i517 & i516) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n7 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            } else {
                                int i518 = a;
                                int i519 = (i518 & (-58)) | ((~i518) & 57);
                                int i5110 = -(-((i518 & 57) << 1));
                                i9 = (i519 ^ i5110) + ((i5110 & i519) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n8 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            }
                            i38++;
                            int i416 = b + 46;
                            int i417 = (i416 ^ (-1)) + (i416 << 1);
                            a = i417 % 128;
                            int i418 = i417 % 2;
                        }
                    } else if (c0087m.k() == 3) {
                        int i520 = a;
                        int i521 = (((i520 | 106) << 1) - (i520 ^ 106)) - 1;
                        b = i521 % 128;
                        int i522 = i521 % 2;
                        if (c0087m.B.f != null) {
                            i8 = this.aj;
                            if (i8 != 2) {
                                int i5111 = a;
                                int i5112 = (i5111 & (-58)) | ((~i5111) & 57);
                                int i5113 = -(-((i5111 & 57) << 1));
                                i9 = (i5112 ^ i5113) + ((i5113 & i5112) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n9 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            } else {
                                int i5114 = a;
                                int i5115 = (i5114 & (-58)) | ((~i5114) & 57);
                                int i5116 = -(-((i5114 & 57) << 1));
                                i9 = (i5115 ^ i5116) + ((i5116 & i5115) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n10 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            }
                            i38++;
                            int i419 = b + 46;
                            int i4110 = (i419 ^ (-1)) + (i419 << 1);
                            a = i4110 % 128;
                            int i4111 = i4110 % 2;
                        } else {
                            i8 = this.aj;
                            if (i8 != 2) {
                                int i5117 = a;
                                int i5118 = (i5117 & (-58)) | ((~i5117) & 57);
                                int i5119 = -(-((i5117 & 57) << 1));
                                i9 = (i5118 ^ i5119) + ((i5119 & i5118) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n11 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            } else {
                                int i51110 = a;
                                int i51111 = (i51110 & (-58)) | ((~i51110) & 57);
                                int i51112 = -(-((i51110 & 57) << 1));
                                i9 = (i51111 ^ i51112) + ((i51112 & i51111) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    N n12 = c0087m.A.f;
                                    th.hashCode();
                                    throw null;
                                }
                                if (c0087m.A.f != null) {
                                    continue;
                                }
                            }
                            i38++;
                            int i4112 = b + 46;
                            int i4113 = (i4112 ^ (-1)) + (i4112 << 1);
                            a = i4113 % 128;
                            int i4114 = i4113 % 2;
                        }
                    } else {
                        i8 = this.aj;
                        if (i8 != 2) {
                            int i51113 = a;
                            int i51114 = (i51113 & (-58)) | ((~i51113) & 57);
                            int i51115 = -(-((i51113 & 57) << 1));
                            i9 = (i51114 ^ i51115) + ((i51115 & i51114) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                N n13 = c0087m.A.f;
                                th.hashCode();
                                throw null;
                            }
                            if (c0087m.A.f != null) {
                                continue;
                            }
                        } else {
                            int i51116 = a;
                            int i51117 = (i51116 & (-58)) | ((~i51116) & 57);
                            int i51118 = -(-((i51116 & 57) << 1));
                            i9 = (i51117 ^ i51118) + ((i51118 & i51117) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                N n14 = c0087m.A.f;
                                th.hashCode();
                                throw null;
                            }
                            if (c0087m.A.f != null) {
                                continue;
                            }
                        }
                        i38++;
                        int i4115 = b + 46;
                        int i4116 = (i4115 ^ (-1)) + (i4115 << 1);
                        a = i4116 % 128;
                        int i4117 = i4116 % 2;
                    }
                    int i60 = b;
                    int i61 = ((((i60 ^ 67) | (i60 & 67)) << 1) - (~(-(((~i60) & 67) | (i60 & (-68)))))) - 1;
                    a = i61 % 128;
                    int i62 = i61 % 2;
                    z = true;
                    break;
                }
                if (!this.B.e()) {
                    int i63 = b;
                    int i64 = i63 & 81;
                    int i65 = -(-((i63 ^ 81) | i64));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    a = i66 % 128;
                    if (i66 % 2 != 0) {
                        this.C.e();
                        th.hashCode();
                        throw null;
                    }
                    if (!(!this.C.e())) {
                        int i67 = a;
                        int i68 = i67 | 25;
                        int i69 = ((i68 << 1) - (~(-((~(i67 & 25)) & i68)))) - 1;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    int i610 = a;
                    int i611 = i610 | 25;
                    int i612 = ((i611 << 1) - (~(-((~(i610 & 25)) & i611)))) - 1;
                    b = i612 % 128;
                    int i71 = i612 % 2;
                    z2 = true;
                }
                if (!(!this.A.e())) {
                    z3 = true;
                } else {
                    int i72 = a + 89;
                    b = i72 % 128;
                    int i73 = i72 % 2;
                    if (this.E.e()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (!z) {
                    int i74 = a;
                    int i75 = (((i74 & (-122)) | ((~i74) & 121)) - (~((i74 & 121) << 1))) - 1;
                    b = i75 % 128;
                    if (i75 % 2 == 0) {
                        i5 = this.aj;
                        int i76 = 56 / 0;
                        if (i5 == 0) {
                            int i77 = (i74 & 61) + (i74 | 61);
                            b = i77 % 128;
                            int i78 = i77 % 2;
                            if (!z2) {
                            }
                            z4 = true;
                        }
                    } else {
                        i5 = this.aj;
                        if (i5 == 0) {
                            int i79 = (i74 & 61) + (i74 | 61);
                            b = i79 % 128;
                            int i710 = i79 % 2;
                            if (!z2) {
                            }
                            z4 = true;
                        }
                    }
                    if (i5 == 2) {
                        int i80 = b;
                        int i81 = i80 & 111;
                        int i82 = (((i80 ^ 111) | i81) << 1) - ((i80 | 111) & (~i81));
                        a = i82 % 128;
                        if (i82 % 2 != 0) {
                            th.hashCode();
                            throw null;
                        }
                        if (!z3) {
                            if (i5 == 1) {
                                int i83 = b;
                                int i84 = i83 & 87;
                                i6 = (i84 - (~(-(-((i83 ^ 87) | i84))))) - 1;
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    th.hashCode();
                                    throw null;
                                }
                                if (!z2) {
                                    if (i5 == 3 || (!z3)) {
                                        z4 = false;
                                    }
                                }
                            } else {
                                if (i5 == 3) {
                                }
                                z4 = false;
                            }
                        }
                        z4 = true;
                    } else if (i5 == 1) {
                        int i85 = b;
                        int i86 = i85 & 87;
                        i6 = (i86 - (~(-(-((i85 ^ 87) | i86))))) - 1;
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            th.hashCode();
                            throw null;
                        }
                        if (!z2) {
                            if (i5 == 3) {
                            }
                            z4 = false;
                        }
                        z4 = true;
                    } else {
                        if (i5 == 3) {
                        }
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (!(!z4)) {
                    i = 5;
                } else {
                    int i87 = b;
                    int i88 = i87 & 83;
                    int i89 = -(-((i87 ^ 83) | i88));
                    int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                    int i91 = i90 % 128;
                    a = i91;
                    int i92 = i90 % 2;
                    int i93 = (i91 ^ 29) + ((i91 & 29) << 1);
                    b = i93 % 128;
                    int i94 = i93 % 2;
                    i = 4;
                }
                int i95 = 0;
                while (i95 < this.ah) {
                    C0087m c0087m2 = this.ag[i95];
                    if (!this.ai) {
                        int i96 = b;
                        int i97 = i96 & 97;
                        int i98 = (i97 - (~((i96 ^ 97) | i97))) - 1;
                        a = i98 % 128;
                        if (i98 % 2 != 0) {
                            c0087m2.e();
                            th.hashCode();
                            throw th;
                        }
                        if (c0087m2.e()) {
                            obj = c0087m2.K[this.aj];
                            int i99 = b;
                            i2 = (i99 ^ 65) + ((i99 & 65) << 1);
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                iVar.n(obj);
                                N[] nArr4 = c0087m2.K;
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            tVarN = iVar.n(obj);
                            nArr2 = c0087m2.K;
                            i3 = this.aj;
                            N n15 = nArr2[i3];
                            int i100 = b;
                            int i101 = i100 & 13;
                            int i102 = ((i100 ^ 13) | i101) << 1;
                            int i103 = -((~i101) & (i100 | 13));
                            int i104 = (i102 & i103) + (i102 | i103);
                            a = i104 % 128;
                            int i105 = i104 % 2;
                            n15.i = tVarN;
                            if (nArr2[i3].f != null) {
                                int i106 = b;
                                int i107 = ((i106 | 59) << 1) - (i106 ^ 59);
                                a = i107 % 128;
                                int i108 = i107 % 2;
                                if (nArr2[i3].f.d == this) {
                                    int i109 = nArr2[i3].h;
                                    int i110 = i109 << 1;
                                    int i111 = -i109;
                                    i4 = (i110 ^ i111) + ((i111 & i110) << 1);
                                    int i112 = a;
                                    int i113 = i112 & 11;
                                    int i114 = (i113 - (~(-(-((i112 ^ 11) | i113))))) - 1;
                                    b = i114 % 128;
                                    int i115 = i114 % 2;
                                } else {
                                    i4 = i11;
                                }
                            } else {
                                i4 = i11;
                            }
                            if (i3 != 0 || i3 == 2) {
                                t tVar = n3.i;
                                int i116 = this.ak;
                                r rVarP2 = iVar.p();
                                t tVarO2 = iVar.o();
                                tVarO2.h = 0;
                                int i117 = -i4;
                                int i118 = i116 & i117;
                                rVarP2.i(tVar, tVarN, tVarO2, ((((i116 ^ i117) | i118) << 1) - (~(-((i116 | i117) & (~i118))))) - 1);
                                iVar.f(rVarP2);
                                int i119 = a;
                                int i120 = i119 & 79;
                                int i121 = -(-((i119 ^ 79) | i120));
                                int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                                b = i122 % 128;
                                int i123 = i122 % 2;
                            } else {
                                int i124 = b;
                                int i125 = i124 ^ 45;
                                int i126 = -(-((i124 & 45) << 1));
                                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                                a = i127 % 128;
                                if (i127 % 2 != 0) {
                                    t tVar2 = n3.i;
                                    throw null;
                                }
                                t tVar3 = n3.i;
                                int i128 = this.ak;
                                int i129 = a;
                                int i130 = (i129 & 90) + (i129 | 90);
                                int i131 = (i130 ^ (-1)) + (i130 << 1);
                                b = i131 % 128;
                                if (i131 % 2 == 0) {
                                    rVarP = iVar.p();
                                    tVarO = iVar.o();
                                    tVarO.h = 1;
                                } else {
                                    rVarP = iVar.p();
                                    tVarO = iVar.o();
                                    tVarO.h = i11;
                                }
                                int i132 = -(-i4);
                                int i133 = ((~i132) & i128) | ((~i128) & i132);
                                int i134 = -(-((i132 & i128) << 1));
                                rVarP.j(tVar3, tVarN, tVarO, ((i133 | i134) << 1) - (i133 ^ i134));
                                iVar.f(rVarP);
                                int i135 = b;
                                int i136 = i135 | 31;
                                int i137 = (i136 << 1) - ((~(i135 & 31)) & i136);
                                a = i137 % 128;
                                int i138 = i137 % 2;
                            }
                            t tVar4 = n3.i;
                            int i139 = this.ak;
                            int i140 = b;
                            int i141 = (i140 & 111) + (i140 | 111);
                            a = i141 % 128;
                            int i142 = i141 % 2;
                            int i143 = -(-i4);
                            iVar.g(tVar4, tVarN, (i139 ^ i143) + ((i139 & i143) << 1), i);
                            int i144 = b;
                            int i145 = (i144 ^ 11) + ((i144 & 11) << 1);
                            a = i145 % 128;
                            int i146 = i145 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        obj = c0087m2.K[this.aj];
                        int i910 = b;
                        i2 = (i910 ^ 65) + ((i910 & 65) << 1);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            iVar.n(obj);
                            N[] nArr5 = c0087m2.K;
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        tVarN = iVar.n(obj);
                        nArr2 = c0087m2.K;
                        i3 = this.aj;
                        N n16 = nArr2[i3];
                        int i1010 = b;
                        int i1011 = i1010 & 13;
                        int i1012 = ((i1010 ^ 13) | i1011) << 1;
                        int i1013 = -((~i1011) & (i1010 | 13));
                        int i1014 = (i1012 & i1013) + (i1012 | i1013);
                        a = i1014 % 128;
                        int i1015 = i1014 % 2;
                        n16.i = tVarN;
                        if (nArr2[i3].f != null) {
                            int i1016 = b;
                            int i1017 = ((i1016 | 59) << 1) - (i1016 ^ 59);
                            a = i1017 % 128;
                            int i1018 = i1017 % 2;
                            if (nArr2[i3].f.d == this) {
                                int i1019 = nArr2[i3].h;
                                int i1110 = i1019 << 1;
                                int i1111 = -i1019;
                                i4 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                                int i1112 = a;
                                int i1113 = i1112 & 11;
                                int i1114 = (i1113 - (~(-(-((i1112 ^ 11) | i1113))))) - 1;
                                b = i1114 % 128;
                                int i1115 = i1114 % 2;
                            } else {
                                i4 = i11;
                            }
                        } else {
                            i4 = i11;
                        }
                        if (i3 != 0) {
                            t tVar5 = n3.i;
                            int i1116 = this.ak;
                            r rVarP3 = iVar.p();
                            t tVarO3 = iVar.o();
                            tVarO3.h = 0;
                            int i1117 = -i4;
                            int i1118 = i1116 & i1117;
                            rVarP3.i(tVar5, tVarN, tVarO3, ((((i1116 ^ i1117) | i1118) << 1) - (~(-((i1116 | i1117) & (~i1118))))) - 1);
                            iVar.f(rVarP3);
                            int i1119 = a;
                            int i1210 = i1119 & 79;
                            int i1211 = -(-((i1119 ^ 79) | i1210));
                            int i1212 = (i1210 ^ i1211) + ((i1211 & i1210) << 1);
                            b = i1212 % 128;
                            int i1213 = i1212 % 2;
                        } else {
                            t tVar6 = n3.i;
                            int i11110 = this.ak;
                            r rVarP4 = iVar.p();
                            t tVarO4 = iVar.o();
                            tVarO4.h = 0;
                            int i11111 = -i4;
                            int i11112 = i11110 & i11111;
                            rVarP4.i(tVar6, tVarN, tVarO4, ((((i11110 ^ i11111) | i11112) << 1) - (~(-((i11110 | i11111) & (~i11112))))) - 1);
                            iVar.f(rVarP4);
                            int i11113 = a;
                            int i1214 = i11113 & 79;
                            int i1215 = -(-((i11113 ^ 79) | i1214));
                            int i1216 = (i1214 ^ i1215) + ((i1215 & i1214) << 1);
                            b = i1216 % 128;
                            int i1217 = i1216 % 2;
                        }
                        t tVar7 = n3.i;
                        int i1310 = this.ak;
                        int i147 = b;
                        int i148 = (i147 & 111) + (i147 | 111);
                        a = i148 % 128;
                        int i149 = i148 % 2;
                        int i1410 = -(-i4);
                        iVar.g(tVar7, tVarN, (i1310 ^ i1410) + ((i1310 & i1410) << 1), i);
                        int i1411 = b;
                        int i1412 = (i1411 ^ 11) + ((i1411 & 11) << 1);
                        a = i1412 % 128;
                        int i1413 = i1412 % 2;
                    }
                    i95++;
                    int i150 = a + 59;
                    b = i150 % 128;
                    int i151 = i150 % 2;
                    i11 = 0;
                    th = null;
                }
                int i152 = this.aj;
                if (i152 == 0) {
                    int i153 = a + 123;
                    b = i153 % 128;
                    int i154 = i153 % 2;
                    t tVar8 = this.C.i;
                    t tVar9 = this.B.i;
                    int i155 = a;
                    int i156 = (((i155 | 47) << 1) - (~(-(((~i155) & 47) | (i155 & (-48)))))) - 1;
                    b = i156 % 128;
                    if (i156 % 2 == 0) {
                        iVar.g(tVar8, tVar9, 0, 95);
                    } else {
                        iVar.g(tVar8, tVar9, 0, 8);
                    }
                    t tVar10 = this.B.i;
                    int i157 = a;
                    int i158 = (i157 & 49) + (i157 | 49);
                    b = i158 % 128;
                    if (i158 % 2 == 0) {
                        iVar.g(tVar10, this.N.C.i, 0, 2);
                    } else {
                        iVar.g(tVar10, this.N.C.i, 0, 4);
                    }
                    int i159 = b;
                    int i160 = (i159 & 47) + (i159 | 47);
                    a = i160 % 128;
                    if (i160 % 2 != 0) {
                        Object obj4 = null;
                        t tVar11 = this.B.i;
                        N n17 = this.N.B;
                        obj4.hashCode();
                        throw null;
                    }
                    iVar.g(this.B.i, this.N.B.i, 0, 0);
                    int i161 = b;
                    int i162 = (i161 & 85) + (i161 | 85);
                    a = i162 % 128;
                    if (i162 % 2 == 0) {
                        return;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                if (i152 == 1) {
                    int i163 = a;
                    int i164 = i163 & 15;
                    int i165 = (i164 - (~(-(-((i163 ^ 15) | i164))))) - 1;
                    b = i165 % 128;
                    if (i165 % 2 == 0) {
                        Object obj6 = null;
                        t tVar12 = this.B.i;
                        N n18 = this.C;
                        obj6.hashCode();
                        throw null;
                    }
                    iVar.g(this.B.i, this.C.i, 0, 8);
                    int i166 = b;
                    int i167 = i166 & 77;
                    int i168 = i166 | 77;
                    int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                    a = i169 % 128;
                    int i170 = i169 % 2;
                    t tVar13 = this.B.i;
                    C0087m c0087m3 = this.N;
                    int i171 = b;
                    int i172 = i171 & 99;
                    int i173 = -(-(i171 | 99));
                    int i174 = (i172 & i173) + (i173 | i172);
                    a = i174 % 128;
                    if (i174 % 2 != 0) {
                        iVar.g(tVar13, c0087m3.B.i, 0, 4);
                    } else {
                        iVar.g(tVar13, c0087m3.B.i, 0, 4);
                    }
                    t tVar14 = this.B.i;
                    C0087m c0087m4 = this.N;
                    int i175 = a;
                    int i176 = ((i175 & 78) + (i175 | 78)) - 1;
                    b = i176 % 128;
                    int i177 = i176 % 2;
                    iVar.g(tVar14, c0087m4.C.i, 0, 0);
                    int i178 = a;
                    int i179 = i178 & 9;
                    int i180 = ((i178 | 9) & (~i179)) + (i179 << 1);
                    b = i180 % 128;
                    if (i180 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                if (i152 != 2) {
                    if (i152 == 3) {
                        int i181 = b;
                        int i182 = (-2) - ((((i181 | 84) << 1) - (i181 ^ 84)) ^ (-1));
                        a = i182 % 128;
                        int i183 = i182 % 2;
                        t tVar15 = this.A.i;
                        t tVar16 = this.E.i;
                        int i184 = b;
                        int i185 = i184 ^ 1;
                        int i186 = ((((i184 & 1) | i185) << 1) - (~(-i185))) - 1;
                        a = i186 % 128;
                        int i187 = i186 % 2;
                        iVar.g(tVar15, tVar16, 0, 8);
                        iVar.g(this.A.i, this.N.A.i, 0, 4);
                        t tVar17 = this.A.i;
                        N n19 = this.N.E;
                        int i188 = a;
                        int i189 = i188 & 49;
                        int i190 = ((i188 ^ 49) | i189) << 1;
                        int i191 = -((i188 | 49) & (~i189));
                        int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
                        b = i192 % 128;
                        if (i192 % 2 == 0) {
                            iVar.g(tVar17, n19.i, 1, 0);
                            return;
                        } else {
                            iVar.g(tVar17, n19.i, 0, 0);
                            return;
                        }
                    }
                    return;
                }
                t tVar18 = this.E.i;
                t tVar19 = this.A.i;
                int i193 = b + 27;
                a = i193 % 128;
                if (i193 % 2 != 0) {
                    iVar.g(tVar18, tVar19, 1, 98);
                } else {
                    iVar.g(tVar18, tVar19, 0, 8);
                }
                t tVar20 = this.A.i;
                int i194 = a;
                int i195 = i194 & 85;
                int i196 = -(-((i194 ^ 85) | i195));
                int i197 = (i195 & i196) + (i196 | i195);
                b = i197 % 128;
                int i198 = i197 % 2;
                iVar.g(tVar20, this.N.E.i, 0, 4);
                int i199 = b;
                int i200 = i199 & 65;
                int i201 = (i199 | 65) & (~i200);
                int i202 = i200 << 1;
                int i203 = (i201 ^ i202) + ((i201 & i202) << 1);
                a = i203 % 128;
                if (i203 % 2 != 0) {
                    t tVar21 = this.A.i;
                    N n20 = this.N.A;
                    Object obj7 = null;
                    obj7.hashCode();
                    throw null;
                }
                t tVar22 = this.A.i;
                N n21 = this.N.A;
                int i204 = a + 18;
                int i205 = (i204 ^ (-1)) + (i204 << 1);
                b = i205 % 128;
                if (i205 % 2 == 0) {
                    iVar.g(tVar22, n21.i, 1, 1);
                } else {
                    iVar.g(tVar22, n21.i, 0, 0);
                }
            }
        }
    }
}
