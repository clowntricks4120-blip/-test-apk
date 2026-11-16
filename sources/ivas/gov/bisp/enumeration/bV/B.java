package ivas.gov.bisp.enumeration.bV;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.bT.C;
import ivas.gov.bisp.enumeration.bU.i;
import ivas.gov.bisp.enumeration.bU.z;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class B extends ae {
    private static int a = 1;
    private static int b;

    public static final void aB(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 117) + ((i3 & 117) << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i < 0) {
            int i6 = i5 + 77;
            a = i6 % 128;
            int i7 = i6 % 2;
            throw new IllegalArgumentException(j.o("Limit must be non-negative, but was ", i).toString());
        }
        int i8 = ((i5 | 53) << 1) - (i5 ^ 53);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = ((i5 & (-122)) | ((~i5) & 121)) + ((i5 & 121) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[SYNTHETIC] */
    public static final boolean av(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = ((i9 ^ 17) | (i9 & 17)) << 1;
        int i11 = -(((~i9) & 17) | (i9 & (-18)));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            r.n(charSequence, "<this>");
            r.n(charSequence2, "other");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r.n(charSequence, "<this>");
        r.n(charSequence2, "other");
        if (i2 >= 0 && i >= 0) {
            int i13 = a;
            int i14 = (i13 ^ 16) + ((i13 & 16) << 1);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                int length = charSequence.length();
                int i16 = -i3;
                if (i <= ((((~i16) & length) | ((~length) & i16)) - (~(-(-((length & i16) << 1))))) - 1) {
                    if (i2 <= (charSequence2.length() - (~(-i3))) - 1) {
                        int i17 = a;
                        int i18 = ((i17 | 83) << 1) - (i17 ^ 83);
                        int i19 = i18 % 128;
                        b = i19;
                        int i20 = i18 % 2;
                        int i21 = i19 & 79;
                        int i22 = ((((i19 ^ 79) | i21) << 1) - (~(-((i19 | 79) & (~i21))))) - 1;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        i4 = 0;
                        while (i4 < i3) {
                            int i24 = a;
                            int i25 = i24 & 37;
                            int i26 = (i24 ^ 37) | i25;
                            i6 = (i25 ^ i26) + ((i26 & i25) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                cCharAt = charSequence.charAt(i % i4);
                            } else {
                                int i27 = -(~i4);
                                cCharAt = charSequence.charAt(((i & i27) + (i27 | i)) - 1);
                            }
                            i7 = b + 3;
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                if (!(!ivas.gov.bisp.enumeration.p100w.r.B(cCharAt, charSequence2.charAt(((((~i4) & i2) | ((~i2) & i4)) - (~((i2 & i4) << 1))) - 1), z))) {
                                    int i28 = a;
                                    int i29 = (i28 & 23) + (i28 | 23);
                                    b = i29 % 128;
                                    int i30 = i29 % 2;
                                    return false;
                                }
                                i4++;
                                int i31 = b;
                                int i32 = ((i31 | 12) << 1) - (i31 ^ 12);
                                int i33 = (i32 ^ (-1)) + (i32 << 1);
                                a = i33 % 128;
                                int i34 = i33 % 2;
                            } else {
                                if (!ivas.gov.bisp.enumeration.p100w.r.B(cCharAt, charSequence2.charAt((i2 & i4) + (i2 | i4)), z)) {
                                    int i210 = a;
                                    int i211 = (i210 & 23) + (i210 | 23);
                                    b = i211 % 128;
                                    int i35 = i211 % 2;
                                    return false;
                                }
                                i4++;
                                int i36 = b;
                                int i37 = ((i36 | 12) << 1) - (i36 ^ 12);
                                int i38 = (i37 ^ (-1)) + (i37 << 1);
                                a = i38 % 128;
                                int i39 = i38 % 2;
                            }
                        }
                        int i40 = a;
                        i5 = ((i40 ^ 53) - (~((i40 & 53) << 1))) - 1;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i41 = 1 / 0;
                        }
                        return true;
                    }
                }
            } else if (i <= (charSequence.length() >>> i3)) {
                if (i2 <= (charSequence2.length() - (~(-i3))) - 1) {
                    int i110 = a;
                    int i111 = ((i110 | 83) << 1) - (i110 ^ 83);
                    int i112 = i111 % 128;
                    b = i112;
                    int i212 = i111 % 2;
                    int i213 = i112 & 79;
                    int i214 = ((((i112 ^ 79) | i213) << 1) - (~(-((i112 | 79) & (~i213))))) - 1;
                    a = i214 % 128;
                    int i215 = i214 % 2;
                    i4 = 0;
                    while (i4 < i3) {
                        int i216 = a;
                        int i217 = i216 & 37;
                        int i218 = (i216 ^ 37) | i217;
                        i6 = (i217 ^ i218) + ((i218 & i217) << 1);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            cCharAt = charSequence.charAt(i % i4);
                        } else {
                            int i219 = -(~i4);
                            cCharAt = charSequence.charAt(((i & i219) + (i219 | i)) - 1);
                        }
                        i7 = b + 3;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            if (!(!ivas.gov.bisp.enumeration.p100w.r.B(cCharAt, charSequence2.charAt(((((~i4) & i2) | ((~i2) & i4)) - (~((i2 & i4) << 1))) - 1), z))) {
                                int i2110 = a;
                                int i2111 = (i2110 & 23) + (i2110 | 23);
                                b = i2111 % 128;
                                int i310 = i2111 % 2;
                                return false;
                            }
                            i4++;
                            int i311 = b;
                            int i312 = ((i311 | 12) << 1) - (i311 ^ 12);
                            int i313 = (i312 ^ (-1)) + (i312 << 1);
                            a = i313 % 128;
                            int i314 = i313 % 2;
                        } else {
                            if (!ivas.gov.bisp.enumeration.p100w.r.B(cCharAt, charSequence2.charAt((i2 & i4) + (i2 | i4)), z)) {
                                int i2112 = a;
                                int i2113 = (i2112 & 23) + (i2112 | 23);
                                b = i2113 % 128;
                                int i315 = i2113 % 2;
                                return false;
                            }
                            i4++;
                            int i316 = b;
                            int i317 = ((i316 | 12) << 1) - (i316 ^ 12);
                            int i318 = (i317 ^ (-1)) + (i317 << 1);
                            a = i318 % 128;
                            int i319 = i318 % 2;
                        }
                    }
                    int i42 = a;
                    i5 = ((i42 ^ 53) - (~((i42 & 53) << 1))) - 1;
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i43 = 1 / 0;
                    }
                    return true;
                }
            }
        }
        int i44 = b;
        int i45 = ((i44 & 81) - (~(i44 | 81))) - 1;
        a = i45 % 128;
        if (i45 % 2 == 0) {
            int i46 = 60 / 0;
        }
        return false;
    }

    public static /* synthetic */ int aw(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 110) + ((i5 & 110) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 16) != 0) {
            int i8 = (i5 & (-68)) | ((~i5) & 67);
            int i9 = (i5 & 67) << 1;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i5 & 115;
            int i13 = ((~i12) & (i5 | 115)) + (i12 << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            z2 = false;
        }
        int iAA = aA(charSequence, charSequence2, i, i2, z, z2);
        int i15 = b;
        int i16 = i15 & 75;
        int i17 = i16 + ((i15 ^ 75) | i16);
        a = i17 % 128;
        int i18 = i17 % 2;
        return iAA;
    }

    public static final int ay(CharSequence charSequence) {
        int length;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (i3 - (~((i2 ^ 1) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            r.n(charSequence, "<this>");
            length = charSequence.length();
            int i5 = 99 / 0;
        } else {
            r.n(charSequence, "<this>");
            length = charSequence.length();
        }
        int i6 = ((length ^ (-1)) - (~(length << 1))) - 1;
        int i7 = b + 122;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0077  */
    public static final int az(CharSequence charSequence, String str, int i, boolean z) {
        int length;
        int i2;
        int iAw;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 | 37;
        int i6 = (i5 << 1) - ((~(i4 & 37)) & i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        r.n(charSequence, "<this>");
        r.n(str, "string");
        if (z) {
            length = charSequence.length();
            int i8 = b;
            int i9 = i8 & 17;
            i2 = (i9 - (~(-(-((i8 ^ 17) | i9))))) - 1;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                iAw = aw(charSequence, str, i, length, z, false, 11);
            } else {
                iAw = aw(charSequence, str, i, length, z, false, 16);
            }
        } else {
            int i10 = a;
            int i11 = i10 ^ 93;
            int i12 = (i10 & 93) << 1;
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (charSequence instanceof String) {
                int i15 = ((i10 ^ 125) | (i10 & 125)) << 1;
                int i16 = -(((~i10) & 125) | (i10 & (-126)));
                int i17 = (i15 & i16) + (i15 | i16);
                b = i17 % 128;
                int i18 = i17 % 2;
                iAw = ((String) charSequence).indexOf(str, i);
                int i19 = a + 7;
                b = i19 % 128;
                int i20 = i19 % 2;
            } else {
                length = charSequence.length();
                int i21 = b;
                int i22 = i21 & 17;
                i2 = (i22 - (~(-(-((i21 ^ 17) | i22))))) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    iAw = aw(charSequence, str, i, length, z, false, 11);
                } else {
                    iAw = aw(charSequence, str, i, length, z, false, 16);
                }
            }
        }
        int i23 = b;
        int i24 = ((i23 & (-112)) | ((~i23) & 111)) + ((i23 & 111) << 1);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return iAw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01da  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:83:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0237 A[LOOP:1: B:76:0x0203->B:84:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0267  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e A[EDGE_INSN: B:90:0x019e->B:59:0x019e BREAK  A[LOOP:0: B:46:0x0149->B:58:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x019e A[EDGE_INSN: B:91:0x019e->B:59:0x019e BREAK  A[LOOP:0: B:46:0x0149->B:58:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x025a A[SYNTHETIC] */
    public static final int aA(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        i iVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        int length;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        int i18 = i2;
        int i19 = 2 % 2;
        int i20 = a;
        int i21 = i20 & 11;
        int i22 = (i20 ^ 11) | i21;
        int i23 = (i21 & i22) + (i21 | i22);
        b = i23 % 128;
        Object obj = null;
        if (i23 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z2) {
            int iAy = ay(charSequence);
            if (i17 > iAy) {
                int i24 = a;
                int i25 = i24 ^ 7;
                int i26 = (((i24 & 7) | i25) << 1) - i25;
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i27 = (((i24 | 74) << 1) - (i24 ^ 74)) - 1;
                b = i27 % 128;
                int i28 = i27 % 2;
                i17 = iAy;
            }
            if (i18 < 0) {
                int i29 = b;
                int i30 = ((((i29 ^ 91) | (i29 & 91)) << 1) - (~(-(((~i29) & 91) | (i29 & (-92)))))) - 1;
                int i31 = i30 % 128;
                a = i31;
                int i32 = i30 % 2;
                int i33 = (i31 & 67) + (i31 | 67);
                b = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 2 % 3;
                }
                i18 = 0;
            }
            iVar = new i(i17, i18, -1);
            int i35 = a;
            int i36 = ((i35 | 85) << 1) - (i35 ^ 85);
            b = i36 % 128;
            int i37 = i36 % 2;
        } else {
            int i38 = (i20 ^ 13) + ((i20 & 13) << 1);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                throw null;
            }
            if (i17 < 0) {
                int i39 = (-2) - (((i20 & 54) + (i20 | 54)) ^ (-1));
                b = i39 % 128;
                int i40 = i39 % 2;
                i17 = 0;
            }
            int length2 = charSequence.length();
            if (i18 > length2) {
                int i41 = b;
                int i42 = i41 & 49;
                int i43 = (((i41 ^ 49) | i42) << 1) - ((~i42) & (i41 | 49));
                a = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
                int i44 = i41 + 47;
                a = i44 % 128;
                int i45 = i44 % 2;
                i18 = length2;
            }
            iVar = new z(i17, i18);
            int i46 = a;
            int i47 = i46 & 99;
            int i48 = (i46 ^ 99) | i47;
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            b = i49 % 128;
            if (i49 % 2 != 0) {
                int i50 = 5 / 4;
            }
        }
        if (charSequence instanceof String) {
            int i51 = b;
            int i52 = (((i51 & (-68)) | ((~i51) & 67)) - (~((i51 & 67) << 1))) - 1;
            int i53 = i52 % 128;
            a = i53;
            int i54 = i52 % 2;
            if (charSequence2 instanceof String) {
                int i55 = (i53 ^ 72) + ((i53 & 72) << 1);
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                b = i56 % 128;
                int i57 = i56 % 2;
                int i58 = iVar.c;
                int i59 = iVar.d;
                int i60 = iVar.e;
                int i61 = a + 63;
                int i62 = i61 % 128;
                b = i62;
                int i63 = i61 % 2;
                if (i60 > 0) {
                    int i64 = i62 + 39;
                    a = i64 % 128;
                    int i65 = i64 % 2;
                    if (i58 <= i59) {
                        while (true) {
                            str = (String) charSequence2;
                            str2 = (String) charSequence;
                            length = charSequence2.length();
                            int i66 = a;
                            i14 = (-2) - (((i66 & 40) + (i66 | 40)) ^ (-1));
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i67 = 4 / 0;
                                if (ae.as(str, 0, str2, i58, length, z)) {
                                    break;
                                    break;
                                }
                                if (i58 != i59) {
                                    int i68 = b;
                                    i16 = i68 + 29;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        i58 >>= i60;
                                    } else {
                                        int i69 = -(~i60);
                                        i58 = (((i58 | i69) << 1) - (i58 ^ i69)) - 1;
                                    }
                                    int i70 = i68 + 21;
                                    a = i70 % 128;
                                    int i71 = i70 % 2;
                                }
                            } else {
                                if (!(!ae.as(str, 0, str2, i58, length, z))) {
                                    break;
                                    break;
                                }
                                if (i58 != i59) {
                                    int i610 = b;
                                    i16 = i610 + 29;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        i58 >>= i60;
                                    } else {
                                        int i611 = -(~i60);
                                        i58 = (((i58 | i611) << 1) - (i58 ^ i611)) - 1;
                                    }
                                    int i72 = i610 + 21;
                                    a = i72 % 128;
                                    int i73 = i72 % 2;
                                }
                            }
                        }
                        int i74 = a;
                        int i75 = i74 & 39;
                        i15 = ((i74 | 39) & (~i75)) + (i75 << 1);
                        b = i15 % 128;
                        if (i15 % 2 == 0) {
                            return i58;
                        }
                        throw null;
                    }
                    if (i60 < 0) {
                        int i76 = a;
                        i12 = ((i76 & 22) + (i76 | 22)) - 1;
                        i13 = i12 % 128;
                        b = i13;
                        if (i12 % 2 == 0) {
                            throw null;
                        }
                        if (i59 <= i58) {
                            int i77 = i13 + 3;
                            int i78 = i77 % 128;
                            a = i78;
                            int i79 = i77 % 2;
                            int i80 = i78 + 9;
                            b = i80 % 128;
                            int i81 = i80 % 2;
                            while (true) {
                                str = (String) charSequence2;
                                str2 = (String) charSequence;
                                length = charSequence2.length();
                                int i612 = a;
                                i14 = (-2) - (((i612 & 40) + (i612 | 40)) ^ (-1));
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i613 = 4 / 0;
                                    if (ae.as(str, 0, str2, i58, length, z)) {
                                        break;
                                    }
                                    if (i58 != i59) {
                                        int i614 = b;
                                        i16 = i614 + 29;
                                        a = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            i58 >>= i60;
                                        } else {
                                            int i615 = -(~i60);
                                            i58 = (((i58 | i615) << 1) - (i58 ^ i615)) - 1;
                                        }
                                        int i710 = i614 + 21;
                                        a = i710 % 128;
                                        int i711 = i710 % 2;
                                    }
                                } else {
                                    if (!(!ae.as(str, 0, str2, i58, length, z))) {
                                        break;
                                    }
                                    if (i58 != i59) {
                                        int i616 = b;
                                        i16 = i616 + 29;
                                        a = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            i58 >>= i60;
                                        } else {
                                            int i617 = -(~i60);
                                            i58 = (((i58 | i617) << 1) - (i58 ^ i617)) - 1;
                                        }
                                        int i712 = i616 + 21;
                                        a = i712 % 128;
                                        int i713 = i712 % 2;
                                    }
                                }
                            }
                            int i714 = a;
                            int i715 = i714 & 39;
                            i15 = ((i714 | 39) & (~i715)) + (i715 << 1);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                return i58;
                            }
                            throw null;
                        }
                    }
                } else if (i60 < 0) {
                    int i716 = a;
                    i12 = ((i716 & 22) + (i716 | 22)) - 1;
                    i13 = i12 % 128;
                    b = i13;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    if (i59 <= i58) {
                        int i717 = i13 + 3;
                        int i718 = i717 % 128;
                        a = i718;
                        int i719 = i717 % 2;
                        int i82 = i718 + 9;
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        while (true) {
                            str = (String) charSequence2;
                            str2 = (String) charSequence;
                            length = charSequence2.length();
                            int i618 = a;
                            i14 = (-2) - (((i618 & 40) + (i618 | 40)) ^ (-1));
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i619 = 4 / 0;
                                if (ae.as(str, 0, str2, i58, length, z)) {
                                    break;
                                    break;
                                }
                                if (i58 != i59) {
                                    int i6110 = b;
                                    i16 = i6110 + 29;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        i58 >>= i60;
                                    } else {
                                        int i6111 = -(~i60);
                                        i58 = (((i58 | i6111) << 1) - (i58 ^ i6111)) - 1;
                                    }
                                    int i7110 = i6110 + 21;
                                    a = i7110 % 128;
                                    int i7111 = i7110 % 2;
                                }
                            } else {
                                if (!(!ae.as(str, 0, str2, i58, length, z))) {
                                    break;
                                    break;
                                }
                                if (i58 != i59) {
                                    int i6112 = b;
                                    i16 = i6112 + 29;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        i58 >>= i60;
                                    } else {
                                        int i6113 = -(~i60);
                                        i58 = (((i58 | i6113) << 1) - (i58 ^ i6113)) - 1;
                                    }
                                    int i7112 = i6112 + 21;
                                    a = i7112 % 128;
                                    int i7113 = i7112 % 2;
                                }
                            }
                        }
                        int i7114 = a;
                        int i7115 = i7114 & 39;
                        i15 = ((i7114 | 39) & (~i7115)) + (i7115 << 1);
                        b = i15 % 128;
                        if (i15 % 2 == 0) {
                            return i58;
                        }
                        throw null;
                    }
                }
            } else {
                i3 = iVar.c;
                i4 = iVar.d;
                i5 = iVar.e;
                int i84 = b;
                int i85 = ((i84 ^ 77) | (i84 & 77)) << 1;
                int i86 = -(((~i84) & 77) | (i84 & (-78)));
                i6 = ((i85 | i86) << 1) - (i86 ^ i85);
                i7 = i6 % 128;
                a = i7;
                if (i6 % 2 != 0) {
                    throw null;
                }
                if (i5 <= 0 && i3 <= i4) {
                    i9 = i3;
                    while (!av(charSequence2, 0, charSequence, i9, charSequence2.length(), z)) {
                        if (i9 != i4) {
                            int i87 = a + 119;
                            int i88 = i87 % 128;
                            b = i88;
                            int i89 = i87 % 2;
                            int i90 = -(-i5);
                            i9 = (((i9 ^ i90) | (i9 & i90)) << 1) - ((i90 & (~i9)) | ((~i90) & i9));
                            int i91 = (i88 & 35) + (i88 | 35);
                            a = i91 % 128;
                            int i92 = i91 % 2;
                        }
                    }
                    i10 = a;
                    int i93 = i10 & 49;
                    int i94 = (i10 ^ 49) | i93;
                    i11 = ((i93 | i94) << 1) - (i93 ^ i94);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i95 = (i10 ^ 7) + ((i10 & 7) << 1);
                    b = i95 % 128;
                    int i96 = i95 % 2;
                    return i9;
                }
                if (i5 < 0) {
                    int i97 = i7 & 101;
                    int i98 = (i97 - (~(-(-((i7 ^ 101) | i97))))) - 1;
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    if (i4 <= i3) {
                        i8 = ((i7 | 11) << 1) - (i7 ^ 11);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i100 = 31 / 0;
                        }
                        int i101 = i7 + 9;
                        b = i101 % 128;
                        int i102 = i101 % 2;
                        i9 = i3;
                        while (!av(charSequence2, 0, charSequence, i9, charSequence2.length(), z)) {
                            if (i9 != i4) {
                                int i810 = a + 119;
                                int i811 = i810 % 128;
                                b = i811;
                                int i812 = i810 % 2;
                                int i910 = -(-i5);
                                i9 = (((i9 ^ i910) | (i9 & i910)) << 1) - ((i910 & (~i9)) | ((~i910) & i9));
                                int i911 = (i811 & 35) + (i811 | 35);
                                a = i911 % 128;
                                int i912 = i911 % 2;
                            }
                        }
                        i10 = a;
                        int i913 = i10 & 49;
                        int i914 = (i10 ^ 49) | i913;
                        i11 = ((i913 | i914) << 1) - (i913 ^ i914);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        int i915 = (i10 ^ 7) + ((i10 & 7) << 1);
                        b = i915 % 128;
                        int i916 = i915 % 2;
                        return i9;
                    }
                }
            }
        } else {
            i3 = iVar.c;
            i4 = iVar.d;
            i5 = iVar.e;
            int i813 = b;
            int i814 = ((i813 ^ 77) | (i813 & 77)) << 1;
            int i815 = -(((~i813) & 77) | (i813 & (-78)));
            i6 = ((i814 | i815) << 1) - (i815 ^ i814);
            i7 = i6 % 128;
            a = i7;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (i5 <= 0) {
                if (i5 < 0) {
                    int i917 = i7 & 101;
                    int i918 = (i917 - (~(-(-((i7 ^ 101) | i917))))) - 1;
                    b = i918 % 128;
                    int i919 = i918 % 2;
                    if (i4 <= i3) {
                        i8 = ((i7 | 11) << 1) - (i7 ^ 11);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i103 = 31 / 0;
                        }
                        int i104 = i7 + 9;
                        b = i104 % 128;
                        int i105 = i104 % 2;
                        i9 = i3;
                        while (!av(charSequence2, 0, charSequence, i9, charSequence2.length(), z)) {
                            if (i9 != i4) {
                                int i816 = a + 119;
                                int i817 = i816 % 128;
                                b = i817;
                                int i818 = i816 % 2;
                                int i9110 = -(-i5);
                                i9 = (((i9 ^ i9110) | (i9 & i9110)) << 1) - ((i9110 & (~i9)) | ((~i9110) & i9));
                                int i9111 = (i817 & 35) + (i817 | 35);
                                a = i9111 % 128;
                                int i9112 = i9111 % 2;
                            }
                        }
                        i10 = a;
                        int i9113 = i10 & 49;
                        int i9114 = (i10 ^ 49) | i9113;
                        i11 = ((i9113 | i9114) << 1) - (i9113 ^ i9114);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        int i9115 = (i10 ^ 7) + ((i10 & 7) << 1);
                        b = i9115 % 128;
                        int i9116 = i9115 % 2;
                        return i9;
                    }
                }
            } else if (i5 < 0) {
                int i9117 = i7 & 101;
                int i9118 = (i9117 - (~(-(-((i7 ^ 101) | i9117))))) - 1;
                b = i9118 % 128;
                int i9119 = i9118 % 2;
                if (i4 <= i3) {
                    i8 = ((i7 | 11) << 1) - (i7 ^ 11);
                    b = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i106 = 31 / 0;
                    }
                    int i107 = i7 + 9;
                    b = i107 % 128;
                    int i108 = i107 % 2;
                    i9 = i3;
                    while (!av(charSequence2, 0, charSequence, i9, charSequence2.length(), z)) {
                        if (i9 != i4) {
                            int i819 = a + 119;
                            int i8110 = i819 % 128;
                            b = i8110;
                            int i8111 = i819 % 2;
                            int i91110 = -(-i5);
                            i9 = (((i9 ^ i91110) | (i9 & i91110)) << 1) - ((i91110 & (~i9)) | ((~i91110) & i9));
                            int i91111 = (i8110 & 35) + (i8110 | 35);
                            a = i91111 % 128;
                            int i91112 = i91111 % 2;
                        }
                    }
                    i10 = a;
                    int i91113 = i10 & 49;
                    int i91114 = (i10 ^ 49) | i91113;
                    i11 = ((i91113 | i91114) << 1) - (i91113 ^ i91114);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i91115 = (i10 ^ 7) + ((i10 & 7) << 1);
                    b = i91115 % 128;
                    int i91116 = i91115 % 2;
                    return i9;
                }
            }
        }
        int i109 = a;
        int i110 = (i109 & 23) + (i109 | 23);
        b = i110 % 128;
        int i111 = i110 % 2;
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    public static boolean at(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 112;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean z3 = false;
        if ((i & 2) != 0) {
            int i8 = (i4 & 27) + (i4 | 27);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = (((i9 & (-114)) | ((~i9) & 113)) - (~(-(-((i9 & 113) << 1))))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        r.n(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            int length = charSequence.length();
            int i13 = b;
            int i14 = ((i13 | 82) << 1) - (i13 ^ 82);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            if (aw(charSequence, charSequence2, 0, length, z2, false, 16) >= 0) {
                i2 = b + 47;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i17 = 3 % 2;
                }
                z3 = true;
            }
        } else {
            int i18 = a;
            int i19 = i18 ^ 97;
            int i20 = ((i18 & 97) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 & i21) + (i20 | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            if (az(charSequence, (String) charSequence2, 0, z2) >= 0) {
                int i24 = a + 75;
                b = i24 % 128;
                int i25 = i24 % 2;
                i2 = b + 47;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i110 = 3 % 2;
                }
                z3 = true;
            }
        }
        int i26 = a;
        int i27 = i26 ^ 41;
        int i28 = ((((i26 & 41) | i27) << 1) - (~(-i27))) - 1;
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return z3;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070 A[PHI: r15
  0x0070: PHI (r15v22 java.lang.String) = (r15v21 java.lang.String), (r15v25 java.lang.String) binds: [B:16:0x006e, B:13:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0090 A[PHI: r15
  0x0090: PHI (r15v24 java.lang.String) = (r15v21 java.lang.String), (r15v25 java.lang.String) binds: [B:16:0x006e, B:13:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x023e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0280  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x027a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.List] */
    public static List au(CharSequence charSequence, String[] strArr, boolean z, int i, int i2) {
        ?? arrayList;
        int i3;
        int i4;
        String str;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = i8 ^ 125;
        int i10 = ((i8 & 125) | i9) << 1;
        int i11 = -i9;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        if ((i2 & 2) != 0) {
            int i15 = i13 + 35;
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i13 + 17;
            b = i17 % 128;
            int i18 = i17 % 2;
            z = false;
        }
        if ((i2 & 4) != 0) {
            int i19 = i13 & 91;
            int i20 = (i19 - (~((i13 ^ 91) | i19))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i13 & 43;
            int i23 = (i22 - (~((i13 ^ 43) | i22))) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            i = 0;
        }
        int i25 = 10;
        Object obj = null;
        if (strArr.length == 1) {
            int i26 = b;
            int i27 = (i26 & 111) + (i26 | 111);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                str = strArr[1];
                if (str.length() == 0) {
                    int i28 = a;
                    int i29 = (i28 & (-112)) | ((~i28) & 111);
                    int i30 = -(-((i28 & 111) << 1));
                    int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = i28 + 83;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    z2 = true;
                } else {
                    int i35 = b;
                    int i36 = i35 & 115;
                    int i37 = (i35 | 115) & (~i36);
                    int i38 = i36 << 1;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                    z2 = false;
                }
            } else {
                str = strArr[0];
                if (str.length() == 0) {
                    int i210 = a;
                    int i211 = (i210 & (-112)) | ((~i210) & 111);
                    int i310 = -(-((i210 & 111) << 1));
                    int i311 = (i211 ^ i310) + ((i211 & i310) << 1);
                    b = i311 % 128;
                    int i312 = i311 % 2;
                    int i313 = i210 + 83;
                    b = i313 % 128;
                    int i314 = i313 % 2;
                    z2 = true;
                } else {
                    int i315 = b;
                    int i316 = i315 & 115;
                    int i317 = (i315 | 115) & (~i316);
                    int i318 = i316 << 1;
                    int i319 = (i317 ^ i318) + ((i317 & i318) << 1);
                    a = i319 % 128;
                    int i41 = i319 % 2;
                    z2 = false;
                }
            }
            if (!z2) {
                int i42 = a;
                int i43 = i42 & 29;
                int i44 = i43 + ((i42 ^ 29) | i43);
                b = i44 % 128;
                int i45 = i44 % 2;
                aB(i);
                int iAz = az(charSequence, str, 0, z);
                int i46 = b + 51;
                int i47 = i46 % 128;
                a = i47;
                if (i46 % 2 == 0) {
                    int i48 = 94 / 0;
                    if (iAz != -1) {
                        int i49 = i47 & 73;
                        i5 = (i49 - (~(-(-((i47 ^ 73) | i49))))) - 1;
                        int i50 = i5 % 128;
                        b = i50;
                        if (i5 % 2 != 0 ? i != 1 : i != 0) {
                            if (i > 0) {
                                int i51 = (i50 ^ 83) + ((i50 & 83) << 1);
                                a = i51 % 128;
                                int i52 = i51 % 2;
                                int i53 = (i50 & 85) + (i50 | 85);
                                a = i53 % 128;
                                int i54 = i53 % 2;
                                z3 = true;
                            } else {
                                int i55 = i47 & 91;
                                int i56 = ((((i47 ^ 91) | i55) << 1) - (~(-((i47 | 91) & (~i55))))) - 1;
                                b = i56 % 128;
                                if (i56 % 2 != 0) {
                                    int i57 = 3 % 3;
                                }
                                z3 = false;
                            }
                            if (z3) {
                                int i58 = b;
                                int i59 = i58 + 93;
                                int i60 = i59 % 128;
                                a = i60;
                                int i61 = i59 % 2;
                                if (i > 10) {
                                    int i62 = i60 + 91;
                                    b = i62 % 128;
                                    int i63 = i62 % 2;
                                    int i64 = i60 ^ 5;
                                    int i65 = ((i60 & 5) | i64) << 1;
                                    int i66 = -i64;
                                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                    b = i67 % 128;
                                    int i68 = i67 % 2;
                                } else {
                                    int i69 = i58 + 19;
                                    a = i69 % 128;
                                    int i70 = i69 % 2;
                                    i25 = i;
                                }
                            }
                            arrayList = new ArrayList(i25);
                            int i71 = a;
                            int i72 = i71 & 87;
                            int i73 = (~i72) & (i71 | 87);
                            int i74 = i72 << 1;
                            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                            b = i75 % 128;
                            int i76 = i75 % 2;
                            int i77 = ((i71 ^ 101) - (~((i71 & 101) << 1))) - 1;
                            b = i77 % 128;
                            int i78 = i77 % 2;
                            int i79 = 0;
                            do {
                                String string = charSequence.subSequence(i79, iAz).toString();
                                int i80 = a;
                                int i81 = (((i80 ^ 125) | (i80 & 125)) << 1) - (((~i80) & 125) | (i80 & (-126)));
                                b = i81 % 128;
                                int i82 = i81 % 2;
                                arrayList.add(string);
                                int length = str.length();
                                int i83 = ((~iAz) & length) | ((~length) & iAz);
                                int i84 = -(-((iAz & length) << 1));
                                i79 = (i83 ^ i84) + ((i84 & i83) << 1);
                                int i85 = b;
                                int i86 = i85 & 95;
                                int i87 = ((((i85 ^ 95) | i86) << 1) - (~(-((~i86) & (i85 | 95))))) - 1;
                                a = i87 % 128;
                                int i88 = i87 % 2;
                                if (z3) {
                                    int i89 = i85 & 69;
                                    int i90 = (((i85 | 69) & (~i89)) - (~(-(-(i89 << 1))))) - 1;
                                    a = i90 % 128;
                                    if (i90 % 2 != 0) {
                                        if (arrayList.size() == ((i ^ (-1)) | i) + i) {
                                            break;
                                        }
                                        iAz = az(charSequence, str, i79, z);
                                        i6 = b + 29;
                                        a = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                    } else {
                                        int i91 = i & 1;
                                        int i92 = -(-((i ^ 1) | i91));
                                        if (arrayList.size() == (i91 ^ i92) + ((i91 & i92) << 1)) {
                                            break;
                                        }
                                        iAz = az(charSequence, str, i79, z);
                                        i6 = b + 29;
                                        a = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                } else {
                                    iAz = az(charSequence, str, i79, z);
                                    i6 = b + 29;
                                    a = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                            } while (iAz != -1);
                            String string2 = charSequence.subSequence(i79, charSequence.length()).toString();
                            int i93 = a;
                            int i94 = i93 ^ 71;
                            int i95 = -(-((i93 & 71) << 1));
                            int i96 = (i94 & i95) + (i95 | i94);
                            b = i96 % 128;
                            if (i96 % 2 != 0) {
                                arrayList.add(string2);
                                obj.hashCode();
                                throw null;
                            }
                            arrayList.add(string2);
                        }
                    }
                } else if (iAz != -1) {
                    int i410 = i47 & 73;
                    i5 = (i410 - (~(-(-((i47 ^ 73) | i410))))) - 1;
                    int i510 = i5 % 128;
                    b = i510;
                    if (i5 % 2 != 0) {
                    }
                }
                arrayList = ivas.gov.bisp.enumeration.p100w.r.T(charSequence.toString());
                int i97 = a;
                int i98 = ((i97 & 77) - (~(-(-(i97 | 77))))) - 1;
                b = i98 % 128;
                int i99 = i98 % 2;
            } else {
                aB(i);
                C<z> c = new C(new ad(charSequence, 0, i, new F(C0130y.am(strArr), z)));
                arrayList = new ArrayList(C0130y.an(c, 10));
                int i100 = b;
                int i101 = (i100 & 115) + (i100 | 115);
                a = i101 % 128;
                int i102 = i101 % 2;
                int i103 = a;
                int i104 = ((i103 | 23) << 1) - (i103 ^ 23);
                b = i104 % 128;
                int i105 = i104 % 2;
                for (z zVar : c) {
                    int i106 = b;
                    int i107 = (((i106 | 80) << 1) - (i106 ^ 80)) - 1;
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    int i109 = a;
                    i3 = (-2) - ((((i109 | 54) << 1) - (i109 ^ 54)) ^ (-1));
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        r.n(zVar, "range");
                        int i110 = zVar.c;
                        int i111 = zVar.d;
                        throw null;
                    }
                    r.n(zVar, "range");
                    int i112 = zVar.c;
                    int i113 = zVar.d;
                    int i114 = i113 & 1;
                    int i115 = (i113 | 1) & (~i114);
                    int i116 = i114 << 1;
                    CharSequence charSequenceSubSequence = charSequence.subSequence(i112, (i115 ^ i116) + ((i115 & i116) << 1));
                    int i117 = b;
                    int i118 = i117 & 85;
                    int i119 = ((i117 ^ 85) | i118) << 1;
                    int i120 = -((i117 | 85) & (~i118));
                    int i121 = (i119 & i120) + (i120 | i119);
                    a = i121 % 128;
                    int i122 = i121 % 2;
                    arrayList.add(charSequenceSubSequence.toString());
                    int i123 = b;
                    int i124 = i123 & 125;
                    int i125 = (i123 ^ 125) | i124;
                    i4 = ((i124 | i125) << 1) - (i125 ^ i124);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i126 = 5 % 2;
                    }
                }
            }
        } else {
            aB(i);
            C<z> c2 = new C(new ad(charSequence, 0, i, new F(C0130y.am(strArr), z)));
            arrayList = new ArrayList(C0130y.an(c2, 10));
            int i1010 = b;
            int i1011 = (i1010 & 115) + (i1010 | 115);
            a = i1011 % 128;
            int i1012 = i1011 % 2;
            int i1013 = a;
            int i1014 = ((i1013 | 23) << 1) - (i1013 ^ 23);
            b = i1014 % 128;
            int i1015 = i1014 % 2;
            while (r12.hasNext()) {
                int i1016 = b;
                int i1017 = (((i1016 | 80) << 1) - (i1016 ^ 80)) - 1;
                a = i1017 % 128;
                int i1018 = i1017 % 2;
                int i1019 = a;
                i3 = (-2) - ((((i1019 | 54) << 1) - (i1019 ^ 54)) ^ (-1));
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    r.n(zVar, "range");
                    int i1110 = zVar.c;
                    int i1111 = zVar.d;
                    throw null;
                }
                r.n(zVar, "range");
                int i1112 = zVar.c;
                int i1113 = zVar.d;
                int i1114 = i1113 & 1;
                int i1115 = (i1113 | 1) & (~i1114);
                int i1116 = i1114 << 1;
                CharSequence charSequenceSubSequence2 = charSequence.subSequence(i1112, (i1115 ^ i1116) + ((i1115 & i1116) << 1));
                int i1117 = b;
                int i1118 = i1117 & 85;
                int i1119 = ((i1117 ^ 85) | i1118) << 1;
                int i127 = -((i1117 | 85) & (~i1118));
                int i128 = (i1119 & i127) + (i127 | i1119);
                a = i128 % 128;
                int i129 = i128 % 2;
                arrayList.add(charSequenceSubSequence2.toString());
                int i1210 = b;
                int i1211 = i1210 & 125;
                int i1212 = (i1210 ^ 125) | i1211;
                i4 = ((i1211 | i1212) << 1) - (i1212 ^ i1211);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i1213 = 5 % 2;
                }
            }
        }
        int i130 = b + 27;
        a = i130 % 128;
        if (i130 % 2 == 0) {
            int i131 = 45 / 0;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    public static int ax(CharSequence charSequence, char c, int i, boolean z, int i2) throws Throwable {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int iIndexOf;
        int i5;
        boolean z4;
        int i6;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = i8 & 27;
        int i10 = ((i8 | 27) & (~i9)) + (i9 << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        boolean z5 = false;
        if ((i2 & 2) != 0) {
            int i13 = i11 & 47;
            int i14 = (((i11 ^ 47) | i13) << 1) - ((i11 | 47) & (~i13));
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = i15 & 113;
            int i18 = (i17 - (~(-(-((i15 ^ 113) | i17))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            int i20 = b;
            int i21 = i20 ^ 81;
            int i22 = (((i20 & 81) | i21) << 1) - i21;
            a = i22 % 128;
            int i23 = i22 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if (z2) {
            char[] cArr = {c};
            if (!z2) {
                int i24 = a;
                int i25 = (i24 | 45) << 1;
                int i26 = -(i24 ^ 45);
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                b = i27 % 128;
                iIndexOf = ((String) charSequence).indexOf(i27 % 2 != 0 ? cArr[1] : cArr[0], i3);
                int i28 = a;
                int i29 = (i28 ^ 17) + ((i28 & 17) << 1);
                b = i29 % 128;
                int i30 = i29 % 2;
            } else {
                if (i3 < 0) {
                    int i31 = a;
                    int i32 = i31 & 63;
                    int i33 = i32 + ((i31 ^ 63) | i32);
                    int i34 = i33 % 128;
                    b = i34;
                    int i35 = i33 % 2;
                    int i36 = i34 & 81;
                    int i37 = i36 + ((i34 ^ 81) | i36);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    i3 = 0;
                }
                z zVar = new z(i3, ay(charSequence));
                int i39 = zVar.d;
                int i40 = b;
                int i41 = i40 & 65;
                int i42 = i41 + ((i40 ^ 65) | i41);
                a = i42 % 128;
                int i43 = i42 % 2;
                int i44 = zVar.e;
                if (i44 > 0) {
                    int i45 = a;
                    int i46 = (i45 & 39) + (i45 | 39);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    if (i3 <= i39) {
                        int i48 = (((i45 & (-124)) | ((~i45) & 123)) - (~((i45 & 123) << 1))) - 1;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        i6 = a + 99;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i50 = 2 / 3;
                        }
                        z3 = true;
                    } else {
                        i4 = a + 31;
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i51 = 3 % 4;
                        }
                        z3 = false;
                    }
                } else if (i3 >= i39) {
                    i6 = a + 99;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i52 = 2 / 3;
                    }
                    z3 = true;
                } else {
                    i4 = a + 31;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i53 = 3 % 4;
                    }
                    z3 = false;
                }
                Throwable th = null;
                if (z3) {
                    int i54 = a + 23;
                    b = i54 % 128;
                    if (i54 % 2 != 0) {
                        th.hashCode();
                        throw null;
                    }
                } else {
                    int i55 = b;
                    int i56 = i55 ^ 15;
                    int i57 = -(-((i55 & 15) << 1));
                    int i58 = (i56 & i57) + (i57 | i56);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    i3 = i39;
                }
                while (z3) {
                    int i60 = b;
                    int i61 = (i60 ^ 71) + ((i60 & 71) << 1);
                    a = i61 % 128;
                    int i62 = i61 % 2;
                    if (i3 == i39) {
                        int i63 = ((i60 | 45) << 1) - (i60 ^ 45);
                        int i64 = i63 % 128;
                        a = i64;
                        if (i63 % 2 == 0) {
                            th.hashCode();
                            throw th;
                        }
                        if (!z3) {
                            throw new NoSuchElementException();
                        }
                        int i65 = i64 & 19;
                        int i66 = ((i64 ^ 19) | i65) << 1;
                        int i67 = -((i64 | 19) & (~i65));
                        int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                        b = i68 % 128;
                        int i69 = i68 % 2;
                        i5 = i3;
                        z3 = z5;
                    } else {
                        i5 = (i44 - (~(-(-i3)))) - 1;
                        int i70 = ((i60 & 41) - (~(i60 | 41))) - 1;
                        a = i70 % 128;
                        int i71 = i70 % 2;
                    }
                    char cCharAt = charSequence.charAt(i3);
                    int i72 = a;
                    int i73 = (i72 | 21) << 1;
                    int i74 = -((i72 & (-22)) | ((~i72) & 21));
                    int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                    b = i75 % 128;
                    int i76 = i75 % 2;
                    int i77 = 0;
                    while (true) {
                        if (i77 > 0) {
                            int i78 = a;
                            int i79 = i78 & 55;
                            int i80 = (i78 | 55) & (~i79);
                            int i81 = -(-(i79 << 1));
                            int i82 = ((i80 | i81) << 1) - (i80 ^ i81);
                            b = i82 % 128;
                            int i83 = i82 % 2;
                            z4 = false;
                            break;
                        }
                        int i84 = a;
                        int i85 = i84 & 85;
                        int i86 = -(-((i84 ^ 85) | i85));
                        int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                        b = i87 % 128;
                        int i88 = i87 % 2;
                        if (!(!ivas.gov.bisp.enumeration.p100w.r.B(cArr[i77], cCharAt, z2))) {
                            int i89 = a;
                            int i90 = i89 & 51;
                            int i91 = (i90 - (~(-(-((i89 ^ 51) | i90))))) - 1;
                            b = i91 % 128;
                            int i92 = i91 % 2;
                            z4 = true;
                            break;
                        }
                        i77++;
                        int i93 = b;
                        int i94 = ((i93 & 126) + (i93 | 126)) - 1;
                        a = i94 % 128;
                        int i95 = i94 % 2;
                    }
                    if (z4) {
                        iIndexOf = i3;
                    } else {
                        int i96 = a;
                        int i97 = (i96 & (-98)) | ((~i96) & 97);
                        int i98 = -(-((i96 & 97) << 1));
                        int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                        b = i99 % 128;
                        int i100 = i99 % 2;
                        int i101 = i96 & 1;
                        int i102 = ((((i96 ^ 1) | i101) << 1) - (~(-((i96 | 1) & (~i101))))) - 1;
                        b = i102 % 128;
                        if (i102 % 2 != 0) {
                            int i103 = 3 % 4;
                        }
                        i3 = i5;
                        z5 = false;
                        th = null;
                    }
                }
                int i104 = b;
                int i105 = ((i104 | 25) << 1) - (i104 ^ 25);
                a = i105 % 128;
                if (i105 % 2 == 0) {
                    int i106 = 3 / 2;
                }
                iIndexOf = -1;
            }
        } else {
            int i107 = b + 115;
            a = i107 % 128;
            int i108 = i107 % 2;
            iIndexOf = ((String) charSequence).indexOf(c, i3);
            if (i108 == 0) {
                int i109 = 53 / 0;
            }
            int i110 = b + 79;
            a = i110 % 128;
            if (i110 % 2 == 0) {
                int i111 = 2 / 2;
            }
        }
        int i112 = b;
        int i113 = (((i112 & (-104)) | ((~i112) & 103)) - (~((i112 & 103) << 1))) - 1;
        a = i113 % 128;
        int i114 = i113 % 2;
        return iIndexOf;
    }
}
