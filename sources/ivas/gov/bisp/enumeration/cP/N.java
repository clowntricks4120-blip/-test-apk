package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cJ.C0240j;
import ivas.gov.bisp.enumeration.cJ.c;
import ivas.gov.bisp.enumeration.cJ.h;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class N extends IllegalArgumentException {
    private static int a = 1;
    private static int b;

    public N(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0310  */
    /* JADX WARN: Code duplicated, block: B:109:0x031a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0346  */
    /* JADX WARN: Code duplicated, block: B:112:0x0352  */
    /* JADX WARN: Code duplicated, block: B:115:0x0382  */
    /* JADX WARN: Code duplicated, block: B:116:0x0385  */
    /* JADX WARN: Code duplicated, block: B:117:0x0388  */
    /* JADX WARN: Code duplicated, block: B:120:0x038d  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:123:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x0432  */
    /* JADX WARN: Code duplicated, block: B:128:0x043c  */
    /* JADX WARN: Code duplicated, block: B:130:0x045d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0461  */
    /* JADX WARN: Code duplicated, block: B:133:0x0476  */
    /* JADX WARN: Code duplicated, block: B:134:0x047b  */
    /* JADX WARN: Code duplicated, block: B:138:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:146:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:154:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public N(long j, String str) {
        String strT;
        ConcurrentHashMap<String, c> concurrentHashMap;
        c cVarPutIfAbsent;
        char cCharAt;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        int i7;
        boolean z;
        int i8;
        ArrayList<Object> arrayList;
        String strC;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        int i13;
        String str2;
        String str3;
        boolean z2;
        int i14;
        int i15;
        String str4;
        String str5;
        boolean z3;
        int i16;
        int i17;
        ConcurrentHashMap<String, c> concurrentHashMap2 = C0240j.c;
        c cVarX = C0240j.c.get("yyyy-MM-dd'T'HH:mm:ss.SSS");
        char c3 = 'K';
        if (cVarX == null) {
            h hVar = new h();
            int[] iArr = new int[1];
            int i18 = a;
            int i19 = i18 & 119;
            int i20 = (i19 - (~((i18 ^ 119) | i19))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            int i23 = 0;
            while (i23 < 25) {
                int i24 = a;
                int i25 = i24 & 109;
                int i26 = i25 + ((i24 ^ 109) | i25);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    iArr[1] = i23;
                } else {
                    iArr[i22] = i23;
                }
                String strC2 = C0240j.c("yyyy-MM-dd'T'HH:mm:ss.SSS", iArr);
                int i27 = iArr[i22];
                int length = strC2.length();
                int i28 = a;
                int i29 = (i28 ^ 13) + ((i28 & 13) << 1);
                int i30 = i29 % 128;
                b = i30;
                int i31 = i29 % 2;
                if (length != 0) {
                    int i32 = i30 & 25;
                    int i33 = -(-((i30 ^ 25) | i32));
                    int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                    a = i34 % 128;
                    Object obj = null;
                    if (i34 % 2 != 0 ? (cCharAt = strC2.charAt(i22)) == '\'' : (cCharAt = strC2.charAt(1)) == 'm') {
                        String strSubstring = strC2.substring(1);
                        if (strSubstring.length() == 1) {
                            int i35 = b + 35;
                            a = i35 % 128;
                            int i36 = i35 % 2;
                            i = 0;
                            hVar.f(strSubstring.charAt(0));
                            int i37 = a;
                            int i38 = i37 & 73;
                            int i39 = -(-((i37 ^ 73) | i38));
                            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                            b = i40 % 128;
                            if (i40 % 2 == 0) {
                                int i41 = 2 % 2;
                            }
                        } else {
                            i = 0;
                            hVar.o(new String(strSubstring));
                            int i42 = a + 103;
                            b = i42 % 128;
                            if (i42 % 2 != 0) {
                                throw null;
                            }
                        }
                    } else {
                        if (cCharAt == c3) {
                            AbstractC0246t abstractC0246t = AbstractC0246t.d;
                            hVar.l(AbstractC0246t.p, length, 2);
                            int i43 = 2 % 2;
                        } else if (cCharAt != 'M') {
                            int i44 = b;
                            int i45 = ((i44 | 109) << 1) - (i44 ^ 109);
                            int i46 = i45 % 128;
                            a = i46;
                            int i47 = i45 % 2;
                            if (cCharAt != 'S') {
                                int i48 = i46 & 61;
                                int i49 = i48 + ((i46 ^ 61) | i48);
                                int i50 = i49 % 128;
                                b = i50;
                                int i51 = i49 % 2;
                                if (cCharAt != 'a') {
                                    int i52 = ((i50 | 35) << 1) - (i50 ^ 35);
                                    int i53 = i52 % 128;
                                    a = i53;
                                    int i54 = i52 % 2;
                                    if (cCharAt != 'h') {
                                        int i55 = (i53 & 121) + (i53 | 121);
                                        b = i55 % 128;
                                        int i56 = i55 % 2;
                                        if (cCharAt != 'k') {
                                            int i57 = (i53 & 41) + (i53 | 41);
                                            int i58 = i57 % 128;
                                            b = i58;
                                            int i59 = i57 % 2;
                                            if (cCharAt == 'm') {
                                                AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
                                                hVar.l(AbstractC0246t.u, length, 2);
                                                int i60 = b;
                                                int i61 = ((i60 & 80) + (i60 | 80)) - 1;
                                                a = i61 % 128;
                                                if (i61 % 2 == 0) {
                                                    throw null;
                                                }
                                            } else if (cCharAt == 's') {
                                                AbstractC0246t abstractC0246t3 = AbstractC0246t.d;
                                                hVar.l(AbstractC0246t.x, length, 2);
                                                int i62 = 2 % 2;
                                            } else if (cCharAt == 'G') {
                                                AbstractC0246t abstractC0246t4 = AbstractC0246t.d;
                                                hVar.r(AbstractC0246t.d);
                                                int i63 = a;
                                                int i64 = i63 & 87;
                                                int i65 = i63 | 87;
                                                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                                                b = i66 % 128;
                                                if (i66 % 2 != 0) {
                                                    throw null;
                                                }
                                            } else if (cCharAt == 'H') {
                                                AbstractC0246t abstractC0246t5 = AbstractC0246t.d;
                                                hVar.l(AbstractC0246t.s, length, 2);
                                                int i67 = b;
                                                int i68 = i67 & 17;
                                                int i69 = ((((i67 ^ 17) | i68) << 1) - (~(-((i67 | 17) & (~i68))))) - 1;
                                                a = i69 % 128;
                                                int i70 = i69 % 2;
                                            } else if (cCharAt == 'Y') {
                                                if (length != 2) {
                                                    if (((i27 & 2) + (i27 | 2)) - 1 < 25) {
                                                        int i71 = iArr[0];
                                                        iArr[0] = (((i71 | 1) << 1) - (~(-(((~i71) & 1) | (i71 & (-2)))))) - 1;
                                                        strC = C0240j.c("yyyy-MM-dd'T'HH:mm:ss.SSS", iArr);
                                                        int i72 = a;
                                                        int i73 = i72 & 109;
                                                        int i74 = (i72 | 109) & (~i73);
                                                        int i75 = -(-(i73 << 1));
                                                        i9 = ((i74 | i75) << 1) - (i74 ^ i75);
                                                        b = i9 % 128;
                                                        if (i9 % 2 != 0) {
                                                            C0240j.b(strC);
                                                            i11 = iArr[0];
                                                            c2 = 1;
                                                            i12 = 0;
                                                            i10 = 0;
                                                        } else {
                                                            boolean zB = C0240j.b(strC);
                                                            i10 = ((~(zB ? 1 : 0)) & 1) | ((zB ? 1 : 0) & (-2));
                                                            i11 = iArr[0];
                                                            c2 = 0;
                                                            i12 = 1;
                                                        }
                                                        iArr[c2] = (i11 - (~(-(~(-i12))))) - 2;
                                                        int i76 = b;
                                                        i13 = (((i76 & (-24)) | (23 & (~i76))) - (~(-(-((i76 & 23) << 1))))) - 1;
                                                        a = i13 % 128;
                                                        if (i13 % 2 == 0) {
                                                            int i77 = 5 / 4;
                                                            z = i10;
                                                        } else {
                                                            int i78 = 2 % 2;
                                                            z = i10;
                                                        }
                                                    } else {
                                                        z = 1;
                                                    }
                                                    if (cCharAt == 'x') {
                                                        z zVar = new z();
                                                        P pBd = zVar.d.bd();
                                                        int i79 = b + 55;
                                                        a = i79 % 128;
                                                        int i80 = i79 % 2;
                                                        int iF = pBd.f(zVar.c);
                                                        AbstractC0246t abstractC0246t6 = AbstractC0246t.d;
                                                        AbstractC0246t abstractC0246t7 = AbstractC0246t.h;
                                                        int i81 = iF & (-30);
                                                        int i82 = (iF | (-30)) & (~i81);
                                                        int i83 = -(-(i81 << 1));
                                                        h.bEc bec = new h.bEc(abstractC0246t7, (i82 ^ i83) + ((i82 & i83) << 1), z);
                                                        int i84 = b;
                                                        int i85 = i84 & 31;
                                                        i8 = (i85 - (~((i84 ^ 31) | i85))) - 1;
                                                        a = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            hVar.d = null;
                                                            arrayList = hVar.c;
                                                            int i86 = 24 / 0;
                                                        } else {
                                                            hVar.d = null;
                                                            arrayList = hVar.c;
                                                        }
                                                        arrayList.add(bec);
                                                        hVar.c.add(bec);
                                                        int i87 = 2 % 2;
                                                    } else {
                                                        z zVar2 = new z();
                                                        int iF2 = zVar2.d.aW().f(zVar2.c);
                                                        AbstractC0246t abstractC0246t8 = AbstractC0246t.d;
                                                        int i88 = iF2 & (-30);
                                                        h.bEc bec2 = new h.bEc(AbstractC0246t.l, (i88 - (~((iF2 ^ (-30)) | i88))) - 1, z);
                                                        int i89 = a;
                                                        int i90 = i89 & 21;
                                                        int i91 = i90 + ((i89 ^ 21) | i90);
                                                        b = i91 % 128;
                                                        int i92 = i91 % 2;
                                                        hVar.d = null;
                                                        hVar.c.add(bec2);
                                                        int i93 = b;
                                                        int i94 = ((i93 | 103) << 1) - (i93 ^ 103);
                                                        a = i94 % 128;
                                                        int i95 = i94 % 2;
                                                        hVar.c.add(bec2);
                                                    }
                                                } else {
                                                    i2 = i27 + 2;
                                                    if ((i2 ^ (-1)) + (i2 << 1) < 25) {
                                                        int i96 = i58 & 23;
                                                        int i97 = i96 + ((i58 ^ 23) | i96);
                                                        a = i97 % 128;
                                                        int i98 = i97 % 2;
                                                        int i99 = iArr[0];
                                                        iArr[0] = ((i99 & 1) - (~(i99 | 1))) - 1;
                                                        if (!C0240j.b(C0240j.c("yyyy-MM-dd'T'HH:mm:ss.SSS", iArr))) {
                                                            i3 = 9;
                                                            c = 0;
                                                        } else {
                                                            int i100 = a;
                                                            int i101 = i100 ^ 93;
                                                            int i102 = ((i100 & 93) | i101) << 1;
                                                            int i103 = -i101;
                                                            i6 = ((i102 | i103) << 1) - (i102 ^ i103);
                                                            b = i6 % 128;
                                                            if (i6 % 2 != 0) {
                                                                c = 0;
                                                                int i104 = 71 / 0;
                                                            } else {
                                                                c = 0;
                                                            }
                                                            i3 = length;
                                                        }
                                                        int i105 = iArr[c];
                                                        iArr[c] = ((((i105 ^ (-1)) | i105) << 1) - (~(-(~i105)))) - 1;
                                                        int i106 = a;
                                                        int i107 = i106 ^ 71;
                                                        int i108 = -(-((i106 & 71) << 1));
                                                        i7 = ((i107 | i108) << 1) - (i108 ^ i107);
                                                        b = i7 % 128;
                                                        if (i7 % 2 == 0) {
                                                            obj.hashCode();
                                                            throw null;
                                                        }
                                                        int i109 = 2 % 2;
                                                    } else {
                                                        i3 = 9;
                                                    }
                                                    if (cCharAt != 'Y') {
                                                        AbstractC0246t abstractC0246t9 = AbstractC0246t.d;
                                                        hVar.l(AbstractC0246t.e, length, i3);
                                                        int i110 = b;
                                                        int i111 = i110 & 31;
                                                        i4 = (((i110 ^ 31) | i111) << 1) - ((i110 | 31) & (~i111));
                                                        a = i4 % 128;
                                                        if (i4 % 2 == 0) {
                                                            int i112 = 76 / 0;
                                                        }
                                                    } else if (cCharAt != 'x') {
                                                        hVar.v(length, i3);
                                                    } else if (cCharAt == 'y') {
                                                        int i113 = b;
                                                        int i114 = i113 & 113;
                                                        int i115 = (i113 ^ 113) | i114;
                                                        i5 = (i114 ^ i115) + ((i115 & i114) << 1);
                                                        a = i5 % 128;
                                                        if (i5 % 2 != 0) {
                                                            hVar.w(length, i3);
                                                            throw null;
                                                        }
                                                        hVar.w(length, i3);
                                                        int i116 = 2 % 2;
                                                    }
                                                }
                                            } else if (cCharAt != 'Z') {
                                                if (cCharAt == 'd') {
                                                    AbstractC0246t abstractC0246t10 = AbstractC0246t.d;
                                                    hVar.l(AbstractC0246t.j, length, 2);
                                                    int i117 = b;
                                                    int i118 = (i117 ^ 58) + ((i117 & 58) << 1);
                                                    int i119 = (i118 ^ (-1)) + (i118 << 1);
                                                    a = i119 % 128;
                                                    if (i119 % 2 == 0) {
                                                        int i120 = 5 % 5;
                                                    } else {
                                                        int i121 = 2 % 2;
                                                    }
                                                } else if (cCharAt != 'e') {
                                                    int i122 = ((i58 & (-66)) | (65 & (~i58))) + ((i58 & 65) << 1);
                                                    int i123 = i122 % 128;
                                                    a = i123;
                                                    int i124 = i122 % 2;
                                                    switch (cCharAt) {
                                                        case 'C':
                                                            AbstractC0246t abstractC0246t11 = AbstractC0246t.d;
                                                            hVar.s(AbstractC0246t.g, length, length);
                                                            int i125 = b;
                                                            int i126 = i125 & 87;
                                                            int i127 = (i125 | 87) & (~i126);
                                                            int i128 = -(-(i126 << 1));
                                                            int i129 = ((i127 | i128) << 1) - (i127 ^ i128);
                                                            a = i129 % 128;
                                                            int i130 = i129 % 2;
                                                            int i131 = 2 % 2;
                                                            break;
                                                        case 'D':
                                                            AbstractC0246t abstractC0246t12 = AbstractC0246t.d;
                                                            AbstractC0246t abstractC0246t13 = AbstractC0246t.i;
                                                            int i132 = a;
                                                            int i133 = (i132 & (-56)) | ((~i132) & 55);
                                                            int i134 = -(-((i132 & 55) << 1));
                                                            int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                                                            b = i135 % 128;
                                                            if (i135 % 2 == 0) {
                                                                hVar.l(abstractC0246t13, length, 3);
                                                            } else {
                                                                hVar.l(abstractC0246t13, length, 4);
                                                            }
                                                            break;
                                                        case 'E':
                                                            if (length < 4) {
                                                                AbstractC0246t abstractC0246t14 = AbstractC0246t.d;
                                                                hVar.q(AbstractC0246t.m);
                                                            } else {
                                                                int i136 = i123 & 101;
                                                                int i137 = i136 + ((i123 ^ 101) | i136);
                                                                b = i137 % 128;
                                                                if (i137 % 2 != 0) {
                                                                    AbstractC0246t abstractC0246t15 = AbstractC0246t.d;
                                                                    hVar.r(AbstractC0246t.m);
                                                                    throw null;
                                                                }
                                                                AbstractC0246t abstractC0246t16 = AbstractC0246t.d;
                                                                hVar.r(AbstractC0246t.m);
                                                                int i138 = 2 % 2;
                                                            }
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case 'w':
                                                                    AbstractC0246t abstractC0246t17 = AbstractC0246t.d;
                                                                    hVar.l(AbstractC0246t.n, length, 2);
                                                                    int i139 = b;
                                                                    int i140 = ((i139 | 57) << 1) - (i139 ^ 57);
                                                                    int i141 = i140 % 128;
                                                                    a = i141;
                                                                    if (i140 % 2 == 0) {
                                                                        throw null;
                                                                    }
                                                                    int i142 = ((i141 | 59) << 1) - (i141 ^ 59);
                                                                    b = i142 % 128;
                                                                    if (i142 % 2 == 0) {
                                                                        int i143 = 2 % 2;
                                                                    }
                                                                    break;
                                                                    break;
                                                                case 'x':
                                                                case 'y':
                                                                    if (length != 2) {
                                                                        i2 = i27 + 2;
                                                                        if ((i2 ^ (-1)) + (i2 << 1) < 25) {
                                                                            int i910 = i58 & 23;
                                                                            int i911 = i910 + ((i58 ^ 23) | i910);
                                                                            a = i911 % 128;
                                                                            int i912 = i911 % 2;
                                                                            int i913 = iArr[0];
                                                                            iArr[0] = ((i913 & 1) - (~(i913 | 1))) - 1;
                                                                            if (!C0240j.b(C0240j.c("yyyy-MM-dd'T'HH:mm:ss.SSS", iArr))) {
                                                                                i3 = 9;
                                                                                c = 0;
                                                                            } else {
                                                                                int i1010 = a;
                                                                                int i1011 = i1010 ^ 93;
                                                                                int i1012 = ((i1010 & 93) | i1011) << 1;
                                                                                int i1013 = -i1011;
                                                                                i6 = ((i1012 | i1013) << 1) - (i1012 ^ i1013);
                                                                                b = i6 % 128;
                                                                                if (i6 % 2 != 0) {
                                                                                    c = 0;
                                                                                    int i1014 = 71 / 0;
                                                                                } else {
                                                                                    c = 0;
                                                                                }
                                                                                i3 = length;
                                                                            }
                                                                            int i1015 = iArr[c];
                                                                            iArr[c] = ((((i1015 ^ (-1)) | i1015) << 1) - (~(-(~i1015)))) - 1;
                                                                            int i1016 = a;
                                                                            int i1017 = i1016 ^ 71;
                                                                            int i1018 = -(-((i1016 & 71) << 1));
                                                                            i7 = ((i1017 | i1018) << 1) - (i1018 ^ i1017);
                                                                            b = i7 % 128;
                                                                            if (i7 % 2 == 0) {
                                                                                obj.hashCode();
                                                                                throw null;
                                                                            }
                                                                            int i1019 = 2 % 2;
                                                                        } else {
                                                                            i3 = 9;
                                                                        }
                                                                        if (cCharAt != 'Y') {
                                                                            AbstractC0246t abstractC0246t18 = AbstractC0246t.d;
                                                                            hVar.l(AbstractC0246t.e, length, i3);
                                                                            int i1110 = b;
                                                                            int i1111 = i1110 & 31;
                                                                            i4 = (((i1110 ^ 31) | i1111) << 1) - ((i1110 | 31) & (~i1111));
                                                                            a = i4 % 128;
                                                                            if (i4 % 2 == 0) {
                                                                                int i1112 = 76 / 0;
                                                                            }
                                                                        } else if (cCharAt != 'x') {
                                                                            hVar.v(length, i3);
                                                                        } else if (cCharAt == 'y') {
                                                                            int i1113 = b;
                                                                            int i1114 = i1113 & 113;
                                                                            int i1115 = (i1113 ^ 113) | i1114;
                                                                            i5 = (i1114 ^ i1115) + ((i1115 & i1114) << 1);
                                                                            a = i5 % 128;
                                                                            if (i5 % 2 != 0) {
                                                                                hVar.w(length, i3);
                                                                                throw null;
                                                                            }
                                                                            hVar.w(length, i3);
                                                                            int i1116 = 2 % 2;
                                                                        }
                                                                    } else {
                                                                        if (((i27 & 2) + (i27 | 2)) - 1 < 25) {
                                                                            int i710 = iArr[0];
                                                                            iArr[0] = (((i710 | 1) << 1) - (~(-(((~i710) & 1) | (i710 & (-2)))))) - 1;
                                                                            strC = C0240j.c("yyyy-MM-dd'T'HH:mm:ss.SSS", iArr);
                                                                            int i711 = a;
                                                                            int i712 = i711 & 109;
                                                                            int i713 = (i711 | 109) & (~i712);
                                                                            int i714 = -(-(i712 << 1));
                                                                            i9 = ((i713 | i714) << 1) - (i713 ^ i714);
                                                                            b = i9 % 128;
                                                                            if (i9 % 2 != 0) {
                                                                                C0240j.b(strC);
                                                                                i11 = iArr[0];
                                                                                c2 = 1;
                                                                                i12 = 0;
                                                                                i10 = 0;
                                                                            } else {
                                                                                boolean zB2 = C0240j.b(strC);
                                                                                i10 = ((~(zB2 ? 1 : 0)) & 1) | ((zB2 ? 1 : 0) & (-2));
                                                                                i11 = iArr[0];
                                                                                c2 = 0;
                                                                                i12 = 1;
                                                                            }
                                                                            iArr[c2] = (i11 - (~(-(~(-i12))))) - 2;
                                                                            int i715 = b;
                                                                            i13 = (((i715 & (-24)) | (23 & (~i715))) - (~(-(-((i715 & 23) << 1))))) - 1;
                                                                            a = i13 % 128;
                                                                            if (i13 % 2 == 0) {
                                                                                int i716 = 5 / 4;
                                                                                z = i10;
                                                                            } else {
                                                                                int i717 = 2 % 2;
                                                                                z = i10;
                                                                            }
                                                                        } else {
                                                                            z = 1;
                                                                        }
                                                                        if (cCharAt == 'x') {
                                                                            z zVar3 = new z();
                                                                            int iF3 = zVar3.d.aW().f(zVar3.c);
                                                                            AbstractC0246t abstractC0246t19 = AbstractC0246t.d;
                                                                            int i810 = iF3 & (-30);
                                                                            h.bEc bec3 = new h.bEc(AbstractC0246t.l, (i810 - (~((iF3 ^ (-30)) | i810))) - 1, z);
                                                                            int i811 = a;
                                                                            int i914 = i811 & 21;
                                                                            int i915 = i914 + ((i811 ^ 21) | i914);
                                                                            b = i915 % 128;
                                                                            int i916 = i915 % 2;
                                                                            hVar.d = null;
                                                                            hVar.c.add(bec3);
                                                                            int i917 = b;
                                                                            int i918 = ((i917 | 103) << 1) - (i917 ^ 103);
                                                                            a = i918 % 128;
                                                                            int i919 = i918 % 2;
                                                                            hVar.c.add(bec3);
                                                                        } else {
                                                                            z zVar4 = new z();
                                                                            P pBd2 = zVar4.d.bd();
                                                                            int i718 = b + 55;
                                                                            a = i718 % 128;
                                                                            int i812 = i718 % 2;
                                                                            int iF4 = pBd2.f(zVar4.c);
                                                                            AbstractC0246t abstractC0246t20 = AbstractC0246t.d;
                                                                            AbstractC0246t abstractC0246t21 = AbstractC0246t.h;
                                                                            int i813 = iF4 & (-30);
                                                                            int i814 = (iF4 | (-30)) & (~i813);
                                                                            int i815 = -(-(i813 << 1));
                                                                            h.bEc bec4 = new h.bEc(abstractC0246t21, (i814 ^ i815) + ((i814 & i815) << 1), z);
                                                                            int i816 = b;
                                                                            int i817 = i816 & 31;
                                                                            i8 = (i817 - (~((i816 ^ 31) | i817))) - 1;
                                                                            a = i8 % 128;
                                                                            if (i8 % 2 == 0) {
                                                                                hVar.d = null;
                                                                                arrayList = hVar.c;
                                                                                int i818 = 24 / 0;
                                                                            } else {
                                                                                hVar.d = null;
                                                                                arrayList = hVar.c;
                                                                            }
                                                                            arrayList.add(bec4);
                                                                            hVar.c.add(bec4);
                                                                            int i819 = 2 % 2;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 'z':
                                                                    if (length >= 4) {
                                                                        h.bEa bea = new h.bEa(0, null);
                                                                        int i144 = b;
                                                                        int i145 = (i144 & 51) + (i144 | 51);
                                                                        a = i145 % 128;
                                                                        if (i145 % 2 == 0) {
                                                                            hVar.d = null;
                                                                            hVar.c.add(bea);
                                                                            throw null;
                                                                        }
                                                                        hVar.d = null;
                                                                        hVar.c.add(bea);
                                                                        int i146 = b;
                                                                        int i147 = ((i146 & 82) + (i146 | 82)) - 1;
                                                                        a = i147 % 128;
                                                                        if (i147 % 2 != 0) {
                                                                            hVar.c.add(null);
                                                                        } else {
                                                                            hVar.c.add(null);
                                                                            int i148 = 14 / 0;
                                                                        }
                                                                    } else {
                                                                        h.bEa bea2 = new h.bEa(1, null);
                                                                        hVar.d = null;
                                                                        hVar.c.add(bea2);
                                                                        ArrayList<Object> arrayList2 = hVar.c;
                                                                        int i149 = a;
                                                                        int i150 = ((((i149 ^ 45) | (i149 & 45)) << 1) - (~(-(((~i149) & 45) | (i149 & (-46)))))) - 1;
                                                                        b = i150 % 128;
                                                                        if (i150 % 2 != 0) {
                                                                            arrayList2.add(bea2);
                                                                            obj.hashCode();
                                                                            throw null;
                                                                        }
                                                                        arrayList2.add(bea2);
                                                                        int i151 = 2 % 2;
                                                                    }
                                                                    break;
                                                                default:
                                                                    throw new IllegalArgumentException(j.r("Illegal pattern component: ", strC2));
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    AbstractC0246t abstractC0246t22 = AbstractC0246t.d;
                                                    hVar.l(AbstractC0246t.m, length, 1);
                                                    int i152 = a;
                                                    int i153 = ((i152 & 124) + (i152 | 124)) - 1;
                                                    b = i153 % 128;
                                                    int i154 = i153 % 2;
                                                    int i155 = 2 % 2;
                                                }
                                            } else if (length == 1) {
                                                int i156 = i53 + 109;
                                                b = i156 % 128;
                                                if (i156 % 2 != 0) {
                                                    str4 = null;
                                                    str5 = "Z";
                                                    z3 = true;
                                                    i16 = 5;
                                                    i17 = 3;
                                                } else {
                                                    str4 = null;
                                                    str5 = "Z";
                                                    z3 = false;
                                                    i16 = 2;
                                                    i17 = 2;
                                                }
                                                hVar.t(str4, str5, z3, i16, i17);
                                                int i157 = b;
                                                int i158 = (-2) - (((i157 & 46) + (i157 | 46)) ^ (-1));
                                                a = i158 % 128;
                                                int i159 = i158 % 2;
                                            } else if (length == 2) {
                                                int i160 = i53 | 55;
                                                int i161 = i160 << 1;
                                                int i162 = -(i160 & (~(i53 & 55)));
                                                int i163 = (i161 & i162) + (i162 | i161);
                                                b = i163 % 128;
                                                if (i163 % 2 != 0) {
                                                    str2 = null;
                                                    str3 = "Z";
                                                    z2 = false;
                                                    i14 = 3;
                                                    i15 = 3;
                                                } else {
                                                    str2 = null;
                                                    str3 = "Z";
                                                    z2 = true;
                                                    i14 = 2;
                                                    i15 = 2;
                                                }
                                                hVar.t(str2, str3, z2, i14, i15);
                                                int i164 = b;
                                                int i165 = i164 & 41;
                                                int i166 = ((i164 | 41) & (~i165)) + (i165 << 1);
                                                a = i166 % 128;
                                                int i167 = i166 % 2;
                                                int i168 = 2 % 2;
                                            } else {
                                                h.bDZ bdz = h.bDZ.INSTANCE;
                                                hVar.d = null;
                                                ArrayList<Object> arrayList3 = hVar.c;
                                                int i169 = b;
                                                int i170 = i169 & 63;
                                                int i171 = (i169 | 63) & (~i170);
                                                int i172 = i170 << 1;
                                                int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                                                a = i173 % 128;
                                                if (i173 % 2 == 0) {
                                                    arrayList3.add(bdz);
                                                    hVar.c.add(bdz);
                                                    int i174 = 51 / 0;
                                                } else {
                                                    arrayList3.add(bdz);
                                                    hVar.c.add(bdz);
                                                }
                                                int i175 = b;
                                                int i176 = (-2) - (((i175 & 36) + (i175 | 36)) ^ (-1));
                                                a = i176 % 128;
                                                int i177 = i176 % 2;
                                            }
                                        } else {
                                            AbstractC0246t abstractC0246t23 = AbstractC0246t.d;
                                            hVar.l(AbstractC0246t.q, length, 2);
                                            int i178 = b;
                                            int i179 = ((i178 & 116) + (i178 | 116)) - 1;
                                            a = i179 % 128;
                                            if (i179 % 2 != 0) {
                                                int i180 = 2 % 2;
                                            }
                                        }
                                    } else {
                                        AbstractC0246t abstractC0246t24 = AbstractC0246t.d;
                                        hVar.l(AbstractC0246t.r, length, 2);
                                        int i181 = a + 23;
                                        b = i181 % 128;
                                        if (i181 % 2 != 0) {
                                            int i182 = 63 / 0;
                                        }
                                    }
                                } else {
                                    AbstractC0246t abstractC0246t25 = AbstractC0246t.d;
                                    hVar.r(AbstractC0246t.f80o);
                                }
                            } else {
                                hVar.n(length, length);
                                int i183 = a + 93;
                                b = i183 % 128;
                                int i184 = i183 % 2;
                                int i185 = 2 % 2;
                            }
                        } else if (length < 3) {
                            AbstractC0246t abstractC0246t26 = AbstractC0246t.d;
                            hVar.l(AbstractC0246t.c, length, 2);
                        } else if (length >= 4) {
                            AbstractC0246t abstractC0246t27 = AbstractC0246t.d;
                            hVar.r(AbstractC0246t.c);
                            int i186 = a;
                            int i187 = i186 & 25;
                            int i188 = (i186 | 25) & (~i187);
                            int i189 = i187 << 1;
                            int i190 = (i188 ^ i189) + ((i188 & i189) << 1);
                            b = i190 % 128;
                            int i191 = i190 % 2;
                            int i1210 = 2 % 2;
                        } else {
                            AbstractC0246t abstractC0246t28 = AbstractC0246t.d;
                            hVar.q(AbstractC0246t.c);
                        }
                        i = 0;
                    }
                    i22 = i;
                    i23 = i27 + 1;
                    c3 = 'K';
                } else {
                    cVarX = hVar.x();
                    concurrentHashMap = C0240j.c;
                    if (concurrentHashMap.size() < 500 && (cVarPutIfAbsent = concurrentHashMap.putIfAbsent("yyyy-MM-dd'T'HH:mm:ss.SSS", cVarX)) != null) {
                        cVarX = cVarPutIfAbsent;
                    }
                }
            }
            cVarX = hVar.x();
            concurrentHashMap = C0240j.c;
            if (concurrentHashMap.size() < 500) {
                cVarX = cVarPutIfAbsent;
            }
        }
        StringBuilder sb = new StringBuilder(cVarX.i().p());
        int i192 = b;
        int i193 = (i192 ^ 75) + ((i192 & 75) << 1);
        a = i193 % 128;
        int i194 = i193 % 2;
        try {
            AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
            ivas.gov.bisp.enumeration.cR.N nBz = ivas.gov.bisp.enumeration.cR.N.Q;
            if (nBz == null) {
                int i195 = (-2) - ((b + 96) ^ (-1));
                a = i195 % 128;
                int i196 = i195 % 2;
                nBz = ivas.gov.bisp.enumeration.cR.N.bz();
                int i197 = 2 % 2;
            }
            cVarX.g(sb, j, nBz);
            int i198 = 2 % 2;
        } catch (IOException unused) {
        }
        String string = sb.toString();
        if (str != null) {
            int i199 = a;
            int i200 = i199 & 19;
            int i201 = (i199 ^ 19) | i200;
            int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
            b = i202 % 128;
            int i203 = i202 % 2;
            strT = j.t(" (", str, ")");
            int i204 = 2 % 2;
        } else {
            strT = BuildConfig.FLAVOR;
        }
        super(j.t("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", string, strT));
    }
}
