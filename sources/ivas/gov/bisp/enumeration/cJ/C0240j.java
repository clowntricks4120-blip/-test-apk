package ivas.gov.bisp.enumeration.cJ;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cJ.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0240j {
    private static int a = 0;
    private static int b = 1;
    public static final ConcurrentHashMap<String, c> c = new ConcurrentHashMap<>();

    static {
        new AtomicReferenceArray(25);
        int i = a;
        int i2 = (-2) - (((i ^ 108) + ((i & 108) << 1)) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1 <= 2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.C0240j.b(java.lang.String):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
    /* JADX WARN: Code duplicated, block: B:17:0x0098  */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e A[PHI: r15
  0x011e: PHI (r15v9 int) = (r15v8 int), (r15v12 int) binds: [B:37:0x011c, B:34:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:44:0x016a  */
    /* JADX WARN: Code duplicated, block: B:46:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x018c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dd A[EDGE_INSN: B:67:0x01dd->B:63:0x01dd BREAK  A[LOOP:0: B:13:0x0073->B:21:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd A[EDGE_INSN: B:68:0x01dd->B:63:0x01dd BREAK  A[LOOP:0: B:13:0x0073->B:21:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x004c  */
    public static String c(String str, int[] iArr) {
        boolean z;
        int i;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i10 = b;
        int i11 = (((i10 | 3) << 1) - (~(-(((~i10) & 3) | (i10 & (-4)))))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = iArr[0];
            str.length();
            str.charAt(i12);
            throw null;
        }
        int i13 = iArr[0];
        int length = str.length();
        char cCharAt2 = str.charAt(i13);
        if (cCharAt2 >= 'A') {
            int i14 = a;
            int i15 = i14 & 85;
            int i16 = (i14 | 85) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            if (cCharAt2 <= 'Z') {
                sb.append(cCharAt2);
                int i20 = a;
                int i21 = ((i20 | 31) << 1) - (i20 ^ 31);
                b = i21 % 128;
                int i22 = i21 % 2;
                while (true) {
                    int i23 = i13 & 1;
                    int i24 = -(-((i13 ^ 1) | i23));
                    i7 = (i23 | i24) + (i23 & i24);
                    if (i7 >= length) {
                        break;
                        break;
                    }
                    int i25 = b;
                    int i26 = i25 & 87;
                    int i27 = (i26 - (~(-(-((i25 ^ 87) | i26))))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    if (str.charAt(i7) != cCharAt2) {
                        break;
                        break;
                    }
                    int i29 = b;
                    int i30 = i29 & 91;
                    i8 = (i30 - (~((i29 ^ 91) | i30))) - 1;
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        sb.append(cCharAt2);
                        int i31 = 85 / 0;
                    } else {
                        sb.append(cCharAt2);
                    }
                    i13 = i7;
                }
            } else {
                if (cCharAt2 >= 'a') {
                    int i32 = a;
                    int i33 = ((i32 | 125) << 1) - (i32 ^ 125);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    if (cCharAt2 <= 'z') {
                        sb.append(cCharAt2);
                        int i210 = a;
                        int i211 = ((i210 | 31) << 1) - (i210 ^ 31);
                        b = i211 % 128;
                        int i212 = i211 % 2;
                        while (true) {
                            int i213 = i13 & 1;
                            int i214 = -(-((i13 ^ 1) | i213));
                            i7 = (i213 | i214) + (i213 & i214);
                            if (i7 >= length) {
                                break;
                            }
                            int i215 = b;
                            int i216 = i215 & 87;
                            int i217 = (i216 - (~(-(-((i215 ^ 87) | i216))))) - 1;
                            a = i217 % 128;
                            int i218 = i217 % 2;
                            if (str.charAt(i7) != cCharAt2) {
                                break;
                            }
                            int i219 = b;
                            int i35 = i219 & 91;
                            i8 = (i35 - (~((i219 ^ 91) | i35))) - 1;
                            a = i8 % 128;
                            if (i8 % 2 != 0) {
                                sb.append(cCharAt2);
                                int i36 = 85 / 0;
                            } else {
                                sb.append(cCharAt2);
                            }
                            i13 = i7;
                        }
                    }
                }
                sb.append('\'');
                int i37 = b;
                int i38 = ((i37 & (-94)) | ((~i37) & 93)) + ((i37 & 93) << 1);
                a = i38 % 128;
                int i39 = i38 % 2;
                z = false;
                while (i13 < length) {
                    int i40 = b;
                    int i41 = (i40 | 73) << 1;
                    int i42 = -(i40 ^ 73);
                    i = ((i41 | i42) << 1) - (i42 ^ i41);
                    a = i % 128;
                    if (i % 2 != 0 ? (cCharAt = str.charAt(i13)) != '\'' : (cCharAt = str.charAt(i13)) != 'I') {
                        if (!z) {
                            int i43 = b;
                            int i44 = i43 & 37;
                            int i45 = (i43 ^ 37) | i44;
                            i4 = ((i44 | i45) << 1) - (i45 ^ i44);
                            i5 = i4 % 128;
                            a = i5;
                            if (i4 % 2 != 0 ? cCharAt >= 'A' : cCharAt >= 0) {
                                i6 = i5 + 11;
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    if (cCharAt > 20) {
                                    }
                                } else if (cCharAt > 'Z') {
                                }
                                i13--;
                                int i46 = b + 111;
                                a = i46 % 128;
                                int i47 = i46 % 2;
                                break;
                            }
                            if (cCharAt >= 'a') {
                                int i48 = ((i5 & 55) - (~(-(-(i5 | 55))))) - 1;
                                b = i48 % 128;
                                int i49 = i48 % 2;
                                if (cCharAt <= 'z') {
                                    i13--;
                                    int i410 = b + 111;
                                    a = i410 % 128;
                                    int i411 = i410 % 2;
                                    break;
                                }
                            }
                        }
                        sb.append(cCharAt);
                        int i50 = a;
                        int i51 = ((i50 | 13) << 1) - (i50 ^ 13);
                        b = i51 % 128;
                        int i52 = i51 % 2;
                    } else {
                        int i53 = b;
                        int i54 = i53 & 11;
                        int i55 = -(-((i53 ^ 11) | i54));
                        int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                        a = i56 % 128;
                        if (i56 % 2 != 0) {
                            int i57 = -(~i13);
                            i2 = ((-2) & i57) + (i57 | (-2));
                            if (i2 < length) {
                                if (str.charAt(i2) == '\'') {
                                    int i58 = a;
                                    int i59 = i58 & 85;
                                    int i60 = ((i58 | 85) & (~i59)) + (i59 << 1);
                                    b = i60 % 128;
                                    int i61 = i60 % 2;
                                    sb.append(cCharAt);
                                    int i62 = b;
                                    int i63 = (((i62 & (-20)) | ((~i62) & 19)) - (~(-(-((i62 & 19) << 1))))) - 1;
                                    a = i63 % 128;
                                    int i64 = i63 % 2;
                                    i13 = i2;
                                }
                            }
                        } else {
                            i2 = (i13 ^ 1) + ((i13 & 1) << 1);
                            if (i2 < length) {
                                if (str.charAt(i2) == '\'') {
                                    int i510 = a;
                                    int i511 = i510 & 85;
                                    int i65 = ((i510 | 85) & (~i511)) + (i511 << 1);
                                    b = i65 % 128;
                                    int i66 = i65 % 2;
                                    sb.append(cCharAt);
                                    int i67 = b;
                                    int i68 = (((i67 & (-20)) | ((~i67) & 19)) - (~(-(-((i67 & 19) << 1))))) - 1;
                                    a = i68 % 128;
                                    int i69 = i68 % 2;
                                    i13 = i2;
                                }
                            }
                        }
                        z = !z;
                        int i70 = a;
                        int i71 = ((i70 | 89) << 1) - (((~i70) & 89) | (i70 & (-90)));
                        b = i71 % 128;
                        int i72 = i71 % 2;
                    }
                    i13++;
                    int i73 = a;
                    int i74 = i73 & 91;
                    int i75 = -(-((i73 ^ 91) | i74));
                    i3 = (i74 & i75) + (i75 | i74);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i76 = 5 % 5;
                    }
                }
            }
        } else {
            if (cCharAt2 >= 'a') {
                int i310 = a;
                int i311 = ((i310 | 125) << 1) - (i310 ^ 125);
                b = i311 % 128;
                int i312 = i311 % 2;
                if (cCharAt2 <= 'z') {
                    sb.append(cCharAt2);
                    int i2110 = a;
                    int i2111 = ((i2110 | 31) << 1) - (i2110 ^ 31);
                    b = i2111 % 128;
                    int i2112 = i2111 % 2;
                    while (true) {
                        int i2113 = i13 & 1;
                        int i2114 = -(-((i13 ^ 1) | i2113));
                        i7 = (i2113 | i2114) + (i2113 & i2114);
                        if (i7 >= length) {
                            break;
                            break;
                        }
                        int i2115 = b;
                        int i2116 = i2115 & 87;
                        int i2117 = (i2116 - (~(-(-((i2115 ^ 87) | i2116))))) - 1;
                        a = i2117 % 128;
                        int i2118 = i2117 % 2;
                        if (str.charAt(i7) != cCharAt2) {
                            break;
                            break;
                        }
                        int i2119 = b;
                        int i313 = i2119 & 91;
                        i8 = (i313 - (~((i2119 ^ 91) | i313))) - 1;
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            sb.append(cCharAt2);
                            int i314 = 85 / 0;
                        } else {
                            sb.append(cCharAt2);
                        }
                        i13 = i7;
                    }
                }
            }
            sb.append('\'');
            int i315 = b;
            int i316 = ((i315 & (-94)) | ((~i315) & 93)) + ((i315 & 93) << 1);
            a = i316 % 128;
            int i317 = i316 % 2;
            z = false;
            while (i13 < length) {
                int i412 = b;
                int i413 = (i412 | 73) << 1;
                int i414 = -(i412 ^ 73);
                i = ((i413 | i414) << 1) - (i414 ^ i413);
                a = i % 128;
                if (i % 2 != 0) {
                    if (!z) {
                        int i415 = b;
                        int i416 = i415 & 37;
                        int i417 = (i415 ^ 37) | i416;
                        i4 = ((i416 | i417) << 1) - (i417 ^ i416);
                        i5 = i4 % 128;
                        a = i5;
                        if (i4 % 2 != 0) {
                            i6 = i5 + 11;
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                if (cCharAt > 20) {
                                }
                            } else if (cCharAt > 'Z') {
                            }
                            i13--;
                            int i418 = b + 111;
                            a = i418 % 128;
                            int i419 = i418 % 2;
                            break;
                        }
                        i6 = i5 + 11;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (cCharAt > 20) {
                            }
                        } else if (cCharAt > 'Z') {
                        }
                        i13--;
                        int i4110 = b + 111;
                        a = i4110 % 128;
                        int i4111 = i4110 % 2;
                        break;
                        if (cCharAt >= 'a') {
                            int i420 = ((i5 & 55) - (~(-(-(i5 | 55))))) - 1;
                            b = i420 % 128;
                            int i421 = i420 % 2;
                            if (cCharAt <= 'z') {
                                i13--;
                                int i4112 = b + 111;
                                a = i4112 % 128;
                                int i4113 = i4112 % 2;
                                break;
                            }
                        }
                    }
                    sb.append(cCharAt);
                    int i512 = a;
                    int i513 = ((i512 | 13) << 1) - (i512 ^ 13);
                    b = i513 % 128;
                    int i514 = i513 % 2;
                    i13++;
                    int i77 = a;
                    int i78 = i77 & 91;
                    int i79 = -(-((i77 ^ 91) | i78));
                    i3 = (i78 & i79) + (i79 | i78);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i710 = 5 % 5;
                    }
                } else {
                    if (!z) {
                        int i4114 = b;
                        int i4115 = i4114 & 37;
                        int i4116 = (i4114 ^ 37) | i4115;
                        i4 = ((i4115 | i4116) << 1) - (i4116 ^ i4115);
                        i5 = i4 % 128;
                        a = i5;
                        if (i4 % 2 != 0) {
                            i6 = i5 + 11;
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                if (cCharAt > 20) {
                                }
                            } else if (cCharAt > 'Z') {
                            }
                            i13--;
                            int i4117 = b + 111;
                            a = i4117 % 128;
                            int i4118 = i4117 % 2;
                            break;
                        }
                        i6 = i5 + 11;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (cCharAt > 20) {
                            }
                        } else if (cCharAt > 'Z') {
                        }
                        i13--;
                        int i4119 = b + 111;
                        a = i4119 % 128;
                        int i41110 = i4119 % 2;
                        break;
                        if (cCharAt >= 'a') {
                            int i422 = ((i5 & 55) - (~(-(-(i5 | 55))))) - 1;
                            b = i422 % 128;
                            int i423 = i422 % 2;
                            if (cCharAt <= 'z') {
                                i13--;
                                int i41111 = b + 111;
                                a = i41111 % 128;
                                int i41112 = i41111 % 2;
                                break;
                            }
                        }
                    }
                    sb.append(cCharAt);
                    int i515 = a;
                    int i516 = ((i515 | 13) << 1) - (i515 ^ 13);
                    b = i516 % 128;
                    int i517 = i516 % 2;
                    i13++;
                    int i711 = a;
                    int i712 = i711 & 91;
                    int i713 = -(-((i711 ^ 91) | i712));
                    i3 = (i712 & i713) + (i713 | i712);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i714 = 5 % 5;
                    }
                }
            }
        }
        iArr[0] = i13;
        String string = sb.toString();
        int i80 = a;
        int i81 = ((i80 & 61) - (~(-(-(i80 | 61))))) - 1;
        b = i81 % 128;
        int i82 = i81 % 2;
        return string;
    }
}
