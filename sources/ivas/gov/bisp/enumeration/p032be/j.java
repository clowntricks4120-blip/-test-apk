package ivas.gov.bisp.enumeration.p032be;

import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.p035bh.Z;
import ivas.gov.bisp.enumeration.p050bw.e;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j implements Closeable {
    private static int a = 1;
    private static int b;
    public static final char[] c = ")]}'\n".toCharArray();
    public final Reader e;
    public long l;
    public int m;
    public String n;
    public int[] p;
    public String[] q;
    public int[] r;
    public boolean f = false;
    public final char[] g = new char[1024];
    public int i = 0;
    public int h = 0;
    public int j = 0;
    public int k = 0;
    public int d = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f72o = 1;

    static {
        biF bif = new biF();
        int i = a;
        int i2 = (((i & (-72)) | ((~i) & 71)) - (~((i & 71) << 1))) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            h.c = bif;
            throw null;
        }
        h.c = bif;
        int i3 = a;
        int i4 = i3 & 13;
        int i5 = i3 | 13;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public j(Reader reader) {
        int[] iArr = new int[32];
        this.p = iArr;
        iArr[0] = 6;
        this.q = new String[32];
        this.r = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.e = reader;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e5 A[LOOP:2: B:55:0x0208->B:101:0x02e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[LOOP:1: B:54:0x01f8->B:143:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x0216  */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:61:0x0232  */
    /* JADX WARN: Code duplicated, block: B:63:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0247  */
    /* JADX WARN: Code duplicated, block: B:69:0x0256  */
    /* JADX WARN: Code duplicated, block: B:72:0x025b  */
    /* JADX WARN: Code duplicated, block: B:74:0x025f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0263  */
    /* JADX WARN: Code duplicated, block: B:78:0x027d  */
    /* JADX WARN: Code duplicated, block: B:80:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0291  */
    /* JADX WARN: Code duplicated, block: B:84:0x0295  */
    /* JADX WARN: Code duplicated, block: B:86:0x0299  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02db  */
    public void C() throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String[] strArr;
        int i16;
        int i17 = 2 % 2;
        int i18 = b;
        int i19 = ((i18 ^ 83) | (i18 & 83)) << 1;
        int i20 = -((i18 & (-84)) | ((~i18) & 83));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((i18 & (-10)) | ((~i18) & 9)) + ((i18 & 9) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        int i25 = 0;
        do {
            int iG = this.d;
            if (iG == 0) {
                int i26 = b;
                int i27 = (i26 | 37) << 1;
                int i28 = -(((~i26) & 37) | (i26 & (-38)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                int i30 = i29 % 2;
                iG = g();
                int i31 = b;
                int i32 = i31 & 23;
                int i33 = ((i31 | 23) & (~i32)) + (i32 << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            if (iG == 3) {
                int i35 = a;
                int i36 = ((i35 ^ 55) | (i35 & 55)) << 1;
                int i37 = -(((~i35) & 55) | (i35 & (-56)));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                b = i38 % 128;
                int i39 = i38 % 2;
                z(1);
                int i40 = b;
                int i41 = i40 & 5;
                int i42 = i40 | 5;
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                a = i43 % 128;
                int i44 = i43 % 2;
            } else {
                if (iG == 1) {
                    int i45 = a;
                    int i46 = (i45 & 7) + (i45 | 7);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    z(3);
                } else {
                    if (iG == 4) {
                        int i48 = b;
                        int i49 = (i48 & 19) + (i48 | 19);
                        int i50 = i49 % 128;
                        a = i50;
                        int i51 = i49 % 2;
                        int i52 = this.f72o;
                        int i53 = -(-((i52 ^ (-1)) | i52));
                        this.f72o = (i52 ^ i53) + ((i52 & i53) << 1);
                        int i54 = i50 & 21;
                        int i55 = (i50 | 21) & (~i54);
                        int i56 = -(-(i54 << 1));
                        int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                        b = i57 % 128;
                        int i58 = i57 % 2;
                    } else if (iG == 2) {
                        int i59 = b + 12;
                        int i60 = (i59 ^ (-1)) + (i59 << 1);
                        a = i60 % 128;
                        this.f72o = i60 % 2 == 0 ? this.f72o : this.f72o - 1;
                    } else if (iG != 14) {
                        int i61 = a;
                        int i62 = i61 & 109;
                        int i63 = i62 + ((i61 ^ 109) | i62);
                        b = i63 % 128;
                        int i64 = i63 % 2;
                        if (iG != 10) {
                            int i65 = i61 ^ 85;
                            int i66 = ((((i61 & 85) | i65) << 1) - (~(-i65))) - 1;
                            int i67 = i66 % 128;
                            b = i67;
                            if (i66 % 2 == 0 ? iG == 8 : iG == 98) {
                                B('\'');
                                int i68 = (-2) - ((a + 58) ^ (-1));
                                b = i68 % 128;
                                int i69 = i68 % 2;
                            } else {
                                int i70 = ((i67 & 30) + (i67 | 30)) - 1;
                                a = i70 % 128;
                                if (i70 % 2 != 0 ? iG == 12 : iG == 109) {
                                    B('\'');
                                    int i610 = (-2) - ((a + 58) ^ (-1));
                                    b = i610 % 128;
                                    int i611 = i610 % 2;
                                } else {
                                    int i71 = i67 + 32;
                                    int i72 = (i71 ^ (-1)) + (i71 << 1);
                                    a = i72 % 128;
                                    int i73 = i72 % 2;
                                    if (iG != 9) {
                                        int i74 = (i67 & 17) + (i67 | 17);
                                        a = i74 % 128;
                                        if (i74 % 2 != 0 ? iG == 13 : iG == 62) {
                                            B('\"');
                                            int i75 = b;
                                            int i76 = (((i75 ^ 7) | (i75 & 7)) << 1) - (((~i75) & 7) | (i75 & (-8)));
                                            a = i76 % 128;
                                            int i77 = i76 % 2;
                                        } else {
                                            int i78 = (i67 ^ 15) + ((i67 & 15) << 1);
                                            int i79 = i78 % 128;
                                            a = i79;
                                            int i80 = i78 % 2;
                                            if (iG == 16) {
                                                int i81 = i79 ^ 41;
                                                int i82 = ((i79 & 41) | i81) << 1;
                                                int i83 = -i81;
                                                int i84 = (i82 & i83) + (i83 | i82);
                                                int i85 = i84 % 128;
                                                b = i85;
                                                int i86 = i84 % 2;
                                                int i87 = this.i;
                                                int i88 = -(-this.m);
                                                int i89 = i87 & i88;
                                                this.i = (((i87 ^ i88) | i89) << 1) - ((i87 | i88) & (~i89));
                                                int i90 = ((i85 & 52) + (i85 | 52)) - 1;
                                                int i91 = i90 % 128;
                                                a = i91;
                                                int i92 = i90 % 2;
                                                int i93 = i91 & 3;
                                                int i94 = (i91 ^ 3) | i93;
                                                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                                                b = i95 % 128;
                                                int i96 = i95 % 2;
                                            }
                                        }
                                    } else {
                                        B('\"');
                                        int i710 = b;
                                        int i711 = (((i710 ^ 7) | (i710 & 7)) << 1) - (((~i710) & 7) | (i710 & (-8)));
                                        a = i711 % 128;
                                        int i712 = i711 % 2;
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                int i97 = b;
                                int i98 = ((i97 & 97) - (~(-(-(i97 | 97))))) - 1;
                                a = i98 % 128;
                                int i99 = i98 % 2;
                                i = 0;
                                while (true) {
                                    int i100 = this.i;
                                    i2 = -(-i);
                                    int i101 = i100 ^ i2;
                                    i3 = (((i100 & i2) | i101) << 1) - i101;
                                    if (i3 < this.h) {
                                        i5 = a;
                                        int i102 = (i5 & 17) + (i5 | 17);
                                        b = i102 % 128;
                                        int i103 = i102 % 2;
                                        c2 = this.g[i3];
                                        if (c2 != '\t') {
                                            int i104 = i5 + 123;
                                            i6 = i104 % 128;
                                            b = i6;
                                            int i105 = i104 % 2;
                                            if (c2 != '\n') {
                                                i7 = (((i6 | 42) << 1) - (i6 ^ 42)) - 1;
                                                a = i7 % 128;
                                                if (i7 % 2 == 0) {
                                                    if (c2 != 3) {
                                                        if (c2 != '\r') {
                                                            int i106 = i6 & 113;
                                                            i8 = (i106 - (~((i6 ^ 113) | i106))) - 1;
                                                            a = i8 % 128;
                                                            if (i8 % 2 == 0) {
                                                                if (c2 != '^') {
                                                                    if (c2 != '#') {
                                                                        int i107 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                        int i108 = -(((~i6) & 21) | (i6 & (-22)));
                                                                        int i109 = (i107 & i108) + (i108 | i107);
                                                                        i9 = i109 % 128;
                                                                        a = i9;
                                                                        int i110 = i109 % 2;
                                                                        if (c2 != ',') {
                                                                            int i111 = i9 & 73;
                                                                            int i112 = (i9 ^ 73) | i111;
                                                                            i10 = ((i111 | i112) << 1) - (i112 ^ i111);
                                                                            i11 = i10 % 128;
                                                                            b = i11;
                                                                            if (i10 % 2 != 0) {
                                                                                if (c2 != 'a') {
                                                                                    if (c2 != '=') {
                                                                                        int i113 = i11 & 117;
                                                                                        int i114 = -(-((i11 ^ 117) | i113));
                                                                                        int i115 = (i113 & i114) + (i113 | i114);
                                                                                        a = i115 % 128;
                                                                                        int i116 = i115 % 2;
                                                                                        if (c2 != '{') {
                                                                                            i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                            i13 = i12 % 128;
                                                                                            a = i13;
                                                                                            if (i12 % 2 == 0) {
                                                                                                if (c2 != 'P') {
                                                                                                    int i117 = i13 + 63;
                                                                                                    i14 = i117 % 128;
                                                                                                    b = i14;
                                                                                                    int i118 = i117 % 2;
                                                                                                    if (c2 != ':') {
                                                                                                        int i119 = i14 + 81;
                                                                                                        i15 = i119 % 128;
                                                                                                        a = i15;
                                                                                                        int i120 = i119 % 2;
                                                                                                        if (c2 != ';') {
                                                                                                            int i121 = i15 + 87;
                                                                                                            b = i121 % 128;
                                                                                                            int i122 = i121 % 2;
                                                                                                            switch (c2) {
                                                                                                                case '[':
                                                                                                                case ']':
                                                                                                                    break;
                                                                                                                case '\\':
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    i++;
                                                                                                                    int i123 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                    b = i123 % 128;
                                                                                                                    int i124 = i123 % 2;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else if (c2 != '}') {
                                                                                                int i1110 = i13 + 63;
                                                                                                i14 = i1110 % 128;
                                                                                                b = i14;
                                                                                                int i1111 = i1110 % 2;
                                                                                                if (c2 != ':') {
                                                                                                    int i1112 = i14 + 81;
                                                                                                    i15 = i1112 % 128;
                                                                                                    a = i15;
                                                                                                    int i125 = i1112 % 2;
                                                                                                    if (c2 != ';') {
                                                                                                        int i126 = i15 + 87;
                                                                                                        b = i126 % 128;
                                                                                                        int i127 = i126 % 2;
                                                                                                        switch (c2) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i++;
                                                                                                                int i128 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                b = i128 % 128;
                                                                                                                int i129 = i128 % 2;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != '/') {
                                                                                if (c2 != '=') {
                                                                                    int i1113 = i11 & 117;
                                                                                    int i1114 = -(-((i11 ^ 117) | i1113));
                                                                                    int i1115 = (i1113 & i1114) + (i1113 | i1114);
                                                                                    a = i1115 % 128;
                                                                                    int i1116 = i1115 % 2;
                                                                                    if (c2 != '{') {
                                                                                        i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                        i13 = i12 % 128;
                                                                                        a = i13;
                                                                                        if (i12 % 2 == 0) {
                                                                                            if (c2 != 'P') {
                                                                                                int i1117 = i13 + 63;
                                                                                                i14 = i1117 % 128;
                                                                                                b = i14;
                                                                                                int i1118 = i1117 % 2;
                                                                                                if (c2 != ':') {
                                                                                                    int i1119 = i14 + 81;
                                                                                                    i15 = i1119 % 128;
                                                                                                    a = i15;
                                                                                                    int i1210 = i1119 % 2;
                                                                                                    if (c2 != ';') {
                                                                                                        int i1211 = i15 + 87;
                                                                                                        b = i1211 % 128;
                                                                                                        int i1212 = i1211 % 2;
                                                                                                        switch (c2) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i++;
                                                                                                                int i1213 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                b = i1213 % 128;
                                                                                                                int i1214 = i1213 % 2;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (c2 != '}') {
                                                                                            int i11110 = i13 + 63;
                                                                                            i14 = i11110 % 128;
                                                                                            b = i14;
                                                                                            int i11111 = i11110 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i11112 = i14 + 81;
                                                                                                i15 = i11112 % 128;
                                                                                                a = i15;
                                                                                                int i1215 = i11112 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i1216 = i15 + 87;
                                                                                                    b = i1216 % 128;
                                                                                                    int i1217 = i1216 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i1218 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i1218 % 128;
                                                                                                            int i1219 = i1218 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    f();
                                                                    int i130 = a;
                                                                    int i131 = i130 & 89;
                                                                    int i132 = i131 + ((i130 ^ 89) | i131);
                                                                    b = i132 % 128;
                                                                    int i133 = i132 % 2;
                                                                }
                                                            } else if (c2 != ' ') {
                                                                if (c2 != '#') {
                                                                    int i1010 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                    int i1011 = -(((~i6) & 21) | (i6 & (-22)));
                                                                    int i1012 = (i1010 & i1011) + (i1011 | i1010);
                                                                    i9 = i1012 % 128;
                                                                    a = i9;
                                                                    int i1120 = i1012 % 2;
                                                                    if (c2 != ',') {
                                                                        int i1121 = i9 & 73;
                                                                        int i1122 = (i9 ^ 73) | i1121;
                                                                        i10 = ((i1121 | i1122) << 1) - (i1122 ^ i1121);
                                                                        i11 = i10 % 128;
                                                                        b = i11;
                                                                        if (i10 % 2 != 0) {
                                                                            if (c2 != 'a') {
                                                                                if (c2 != '=') {
                                                                                    int i11113 = i11 & 117;
                                                                                    int i11114 = -(-((i11 ^ 117) | i11113));
                                                                                    int i11115 = (i11113 & i11114) + (i11113 | i11114);
                                                                                    a = i11115 % 128;
                                                                                    int i11116 = i11115 % 2;
                                                                                    if (c2 != '{') {
                                                                                        i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                        i13 = i12 % 128;
                                                                                        a = i13;
                                                                                        if (i12 % 2 == 0) {
                                                                                            if (c2 != 'P') {
                                                                                                int i11117 = i13 + 63;
                                                                                                i14 = i11117 % 128;
                                                                                                b = i14;
                                                                                                int i11118 = i11117 % 2;
                                                                                                if (c2 != ':') {
                                                                                                    int i11119 = i14 + 81;
                                                                                                    i15 = i11119 % 128;
                                                                                                    a = i15;
                                                                                                    int i12110 = i11119 % 2;
                                                                                                    if (c2 != ';') {
                                                                                                        int i12111 = i15 + 87;
                                                                                                        b = i12111 % 128;
                                                                                                        int i12112 = i12111 % 2;
                                                                                                        switch (c2) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i++;
                                                                                                                int i12113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                b = i12113 % 128;
                                                                                                                int i12114 = i12113 % 2;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (c2 != '}') {
                                                                                            int i111110 = i13 + 63;
                                                                                            i14 = i111110 % 128;
                                                                                            b = i14;
                                                                                            int i111111 = i111110 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111112 = i14 + 81;
                                                                                                i15 = i111112 % 128;
                                                                                                a = i15;
                                                                                                int i12115 = i111112 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i12116 = i15 + 87;
                                                                                                    b = i12116 % 128;
                                                                                                    int i12117 = i12116 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i12118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i12118 % 128;
                                                                                                            int i12119 = i12118 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != '/') {
                                                                            if (c2 != '=') {
                                                                                int i111113 = i11 & 117;
                                                                                int i111114 = -(-((i11 ^ 117) | i111113));
                                                                                int i111115 = (i111113 & i111114) + (i111113 | i111114);
                                                                                a = i111115 % 128;
                                                                                int i111116 = i111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i111117 = i13 + 63;
                                                                                            i14 = i111117 % 128;
                                                                                            b = i14;
                                                                                            int i111118 = i111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111119 = i14 + 81;
                                                                                                i15 = i111119 % 128;
                                                                                                a = i15;
                                                                                                int i121110 = i111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i121111 = i15 + 87;
                                                                                                    b = i121111 % 128;
                                                                                                    int i121112 = i121111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i121113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i121113 % 128;
                                                                                                            int i121114 = i121113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i1111110 = i13 + 63;
                                                                                        i14 = i1111110 % 128;
                                                                                        b = i14;
                                                                                        int i1111111 = i1111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111112 = i14 + 81;
                                                                                            i15 = i1111112 % 128;
                                                                                            a = i15;
                                                                                            int i121115 = i1111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i121116 = i15 + 87;
                                                                                                b = i121116 % 128;
                                                                                                int i121117 = i121116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i121118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i121118 % 128;
                                                                                                        int i121119 = i121118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                f();
                                                                int i134 = a;
                                                                int i135 = i134 & 89;
                                                                int i136 = i135 + ((i134 ^ 89) | i135);
                                                                b = i136 % 128;
                                                                int i137 = i136 % 2;
                                                            }
                                                        }
                                                    }
                                                } else if (c2 != '\f') {
                                                    if (c2 != '\r') {
                                                        int i1013 = i6 & 113;
                                                        i8 = (i1013 - (~((i6 ^ 113) | i1013))) - 1;
                                                        a = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            if (c2 != '^') {
                                                                if (c2 != '#') {
                                                                    int i1014 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                    int i1015 = -(((~i6) & 21) | (i6 & (-22)));
                                                                    int i1016 = (i1014 & i1015) + (i1015 | i1014);
                                                                    i9 = i1016 % 128;
                                                                    a = i9;
                                                                    int i1123 = i1016 % 2;
                                                                    if (c2 != ',') {
                                                                        int i1124 = i9 & 73;
                                                                        int i1125 = (i9 ^ 73) | i1124;
                                                                        i10 = ((i1124 | i1125) << 1) - (i1125 ^ i1124);
                                                                        i11 = i10 % 128;
                                                                        b = i11;
                                                                        if (i10 % 2 != 0) {
                                                                            if (c2 != 'a') {
                                                                                if (c2 != '=') {
                                                                                    int i1111113 = i11 & 117;
                                                                                    int i1111114 = -(-((i11 ^ 117) | i1111113));
                                                                                    int i1111115 = (i1111113 & i1111114) + (i1111113 | i1111114);
                                                                                    a = i1111115 % 128;
                                                                                    int i1111116 = i1111115 % 2;
                                                                                    if (c2 != '{') {
                                                                                        i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                        i13 = i12 % 128;
                                                                                        a = i13;
                                                                                        if (i12 % 2 == 0) {
                                                                                            if (c2 != 'P') {
                                                                                                int i1111117 = i13 + 63;
                                                                                                i14 = i1111117 % 128;
                                                                                                b = i14;
                                                                                                int i1111118 = i1111117 % 2;
                                                                                                if (c2 != ':') {
                                                                                                    int i1111119 = i14 + 81;
                                                                                                    i15 = i1111119 % 128;
                                                                                                    a = i15;
                                                                                                    int i1211110 = i1111119 % 2;
                                                                                                    if (c2 != ';') {
                                                                                                        int i1211111 = i15 + 87;
                                                                                                        b = i1211111 % 128;
                                                                                                        int i1211112 = i1211111 % 2;
                                                                                                        switch (c2) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i++;
                                                                                                                int i1211113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                b = i1211113 % 128;
                                                                                                                int i1211114 = i1211113 % 2;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (c2 != '}') {
                                                                                            int i11111110 = i13 + 63;
                                                                                            i14 = i11111110 % 128;
                                                                                            b = i14;
                                                                                            int i11111111 = i11111110 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i11111112 = i14 + 81;
                                                                                                i15 = i11111112 % 128;
                                                                                                a = i15;
                                                                                                int i1211115 = i11111112 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i1211116 = i15 + 87;
                                                                                                    b = i1211116 % 128;
                                                                                                    int i1211117 = i1211116 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i1211118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i1211118 % 128;
                                                                                                            int i1211119 = i1211118 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != '/') {
                                                                            if (c2 != '=') {
                                                                                int i11111113 = i11 & 117;
                                                                                int i11111114 = -(-((i11 ^ 117) | i11111113));
                                                                                int i11111115 = (i11111113 & i11111114) + (i11111113 | i11111114);
                                                                                a = i11111115 % 128;
                                                                                int i11111116 = i11111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i11111117 = i13 + 63;
                                                                                            i14 = i11111117 % 128;
                                                                                            b = i14;
                                                                                            int i11111118 = i11111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i11111119 = i14 + 81;
                                                                                                i15 = i11111119 % 128;
                                                                                                a = i15;
                                                                                                int i12111110 = i11111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i12111111 = i15 + 87;
                                                                                                    b = i12111111 % 128;
                                                                                                    int i12111112 = i12111111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i12111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i12111113 % 128;
                                                                                                            int i12111114 = i12111113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i111111110 = i13 + 63;
                                                                                        i14 = i111111110 % 128;
                                                                                        b = i14;
                                                                                        int i111111111 = i111111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i111111112 = i14 + 81;
                                                                                            i15 = i111111112 % 128;
                                                                                            a = i15;
                                                                                            int i12111115 = i111111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i12111116 = i15 + 87;
                                                                                                b = i12111116 % 128;
                                                                                                int i12111117 = i12111116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i12111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i12111118 % 128;
                                                                                                        int i12111119 = i12111118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                f();
                                                                int i138 = a;
                                                                int i139 = i138 & 89;
                                                                int i1310 = i139 + ((i138 ^ 89) | i139);
                                                                b = i1310 % 128;
                                                                int i1311 = i1310 % 2;
                                                            }
                                                        } else if (c2 != ' ') {
                                                            if (c2 != '#') {
                                                                int i1017 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                int i1018 = -(((~i6) & 21) | (i6 & (-22)));
                                                                int i1019 = (i1017 & i1018) + (i1018 | i1017);
                                                                i9 = i1019 % 128;
                                                                a = i9;
                                                                int i1126 = i1019 % 2;
                                                                if (c2 != ',') {
                                                                    int i1127 = i9 & 73;
                                                                    int i1128 = (i9 ^ 73) | i1127;
                                                                    i10 = ((i1127 | i1128) << 1) - (i1128 ^ i1127);
                                                                    i11 = i10 % 128;
                                                                    b = i11;
                                                                    if (i10 % 2 != 0) {
                                                                        if (c2 != 'a') {
                                                                            if (c2 != '=') {
                                                                                int i111111113 = i11 & 117;
                                                                                int i111111114 = -(-((i11 ^ 117) | i111111113));
                                                                                int i111111115 = (i111111113 & i111111114) + (i111111113 | i111111114);
                                                                                a = i111111115 % 128;
                                                                                int i111111116 = i111111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i111111117 = i13 + 63;
                                                                                            i14 = i111111117 % 128;
                                                                                            b = i14;
                                                                                            int i111111118 = i111111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111111119 = i14 + 81;
                                                                                                i15 = i111111119 % 128;
                                                                                                a = i15;
                                                                                                int i121111110 = i111111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i121111111 = i15 + 87;
                                                                                                    b = i121111111 % 128;
                                                                                                    int i121111112 = i121111111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i121111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i121111113 % 128;
                                                                                                            int i121111114 = i121111113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i1111111110 = i13 + 63;
                                                                                        i14 = i1111111110 % 128;
                                                                                        b = i14;
                                                                                        int i1111111111 = i1111111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111111112 = i14 + 81;
                                                                                            i15 = i1111111112 % 128;
                                                                                            a = i15;
                                                                                            int i121111115 = i1111111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i121111116 = i15 + 87;
                                                                                                b = i121111116 % 128;
                                                                                                int i121111117 = i121111116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i121111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i121111118 % 128;
                                                                                                        int i121111119 = i121111118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != '/') {
                                                                        if (c2 != '=') {
                                                                            int i1111111113 = i11 & 117;
                                                                            int i1111111114 = -(-((i11 ^ 117) | i1111111113));
                                                                            int i1111111115 = (i1111111113 & i1111111114) + (i1111111113 | i1111111114);
                                                                            a = i1111111115 % 128;
                                                                            int i1111111116 = i1111111115 % 2;
                                                                            if (c2 != '{') {
                                                                                i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                i13 = i12 % 128;
                                                                                a = i13;
                                                                                if (i12 % 2 == 0) {
                                                                                    if (c2 != 'P') {
                                                                                        int i1111111117 = i13 + 63;
                                                                                        i14 = i1111111117 % 128;
                                                                                        b = i14;
                                                                                        int i1111111118 = i1111111117 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111111119 = i14 + 81;
                                                                                            i15 = i1111111119 % 128;
                                                                                            a = i15;
                                                                                            int i1211111110 = i1111111119 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i1211111111 = i15 + 87;
                                                                                                b = i1211111111 % 128;
                                                                                                int i1211111112 = i1211111111 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i1211111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i1211111113 % 128;
                                                                                                        int i1211111114 = i1211111113 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != '}') {
                                                                                    int i11111111110 = i13 + 63;
                                                                                    i14 = i11111111110 % 128;
                                                                                    b = i14;
                                                                                    int i11111111111 = i11111111110 % 2;
                                                                                    if (c2 != ':') {
                                                                                        int i11111111112 = i14 + 81;
                                                                                        i15 = i11111111112 % 128;
                                                                                        a = i15;
                                                                                        int i1211111115 = i11111111112 % 2;
                                                                                        if (c2 != ';') {
                                                                                            int i1211111116 = i15 + 87;
                                                                                            b = i1211111116 % 128;
                                                                                            int i1211111117 = i1211111116 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i++;
                                                                                                    int i1211111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                    b = i1211111118 % 128;
                                                                                                    int i1211111119 = i1211111118 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            f();
                                                            int i1312 = a;
                                                            int i1313 = i1312 & 89;
                                                            int i1314 = i1313 + ((i1312 ^ 89) | i1313);
                                                            b = i1314 % 128;
                                                            int i1315 = i1314 % 2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        this.i = (this.i - (~i2)) - 1;
                                        int i140 = b;
                                        int i141 = (i140 ^ 17) + ((i140 & 17) << 1);
                                        a = i141 % 128;
                                        int i142 = i141 % 2;
                                    } else {
                                        this.i = i3;
                                        if (!j(1)) {
                                            i4 = a + 37;
                                            b = i4 % 128;
                                            if (i4 % 2 != 0) {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            int i910 = b;
                            int i911 = ((i910 & 97) - (~(-(-(i910 | 97))))) - 1;
                            a = i911 % 128;
                            int i912 = i911 % 2;
                            i = 0;
                            while (true) {
                                int i1020 = this.i;
                                i2 = -(-i);
                                int i1021 = i1020 ^ i2;
                                i3 = (((i1020 & i2) | i1021) << 1) - i1021;
                                if (i3 < this.h) {
                                    i5 = a;
                                    int i1022 = (i5 & 17) + (i5 | 17);
                                    b = i1022 % 128;
                                    int i1023 = i1022 % 2;
                                    c2 = this.g[i3];
                                    if (c2 != '\t') {
                                        int i1024 = i5 + 123;
                                        i6 = i1024 % 128;
                                        b = i6;
                                        int i1025 = i1024 % 2;
                                        if (c2 != '\n') {
                                            i7 = (((i6 | 42) << 1) - (i6 ^ 42)) - 1;
                                            a = i7 % 128;
                                            if (i7 % 2 == 0) {
                                                if (c2 != 3) {
                                                    if (c2 != '\r') {
                                                        int i10110 = i6 & 113;
                                                        i8 = (i10110 - (~((i6 ^ 113) | i10110))) - 1;
                                                        a = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            if (c2 != '^') {
                                                                if (c2 != '#') {
                                                                    int i10111 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                    int i10112 = -(((~i6) & 21) | (i6 & (-22)));
                                                                    int i10113 = (i10111 & i10112) + (i10112 | i10111);
                                                                    i9 = i10113 % 128;
                                                                    a = i9;
                                                                    int i1129 = i10113 % 2;
                                                                    if (c2 != ',') {
                                                                        int i11210 = i9 & 73;
                                                                        int i11211 = (i9 ^ 73) | i11210;
                                                                        i10 = ((i11210 | i11211) << 1) - (i11211 ^ i11210);
                                                                        i11 = i10 % 128;
                                                                        b = i11;
                                                                        if (i10 % 2 != 0) {
                                                                            if (c2 != 'a') {
                                                                                if (c2 != '=') {
                                                                                    int i11111111113 = i11 & 117;
                                                                                    int i11111111114 = -(-((i11 ^ 117) | i11111111113));
                                                                                    int i11111111115 = (i11111111113 & i11111111114) + (i11111111113 | i11111111114);
                                                                                    a = i11111111115 % 128;
                                                                                    int i11111111116 = i11111111115 % 2;
                                                                                    if (c2 != '{') {
                                                                                        i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                        i13 = i12 % 128;
                                                                                        a = i13;
                                                                                        if (i12 % 2 == 0) {
                                                                                            if (c2 != 'P') {
                                                                                                int i11111111117 = i13 + 63;
                                                                                                i14 = i11111111117 % 128;
                                                                                                b = i14;
                                                                                                int i11111111118 = i11111111117 % 2;
                                                                                                if (c2 != ':') {
                                                                                                    int i11111111119 = i14 + 81;
                                                                                                    i15 = i11111111119 % 128;
                                                                                                    a = i15;
                                                                                                    int i12111111110 = i11111111119 % 2;
                                                                                                    if (c2 != ';') {
                                                                                                        int i12111111111 = i15 + 87;
                                                                                                        b = i12111111111 % 128;
                                                                                                        int i12111111112 = i12111111111 % 2;
                                                                                                        switch (c2) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i++;
                                                                                                                int i12111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                                b = i12111111113 % 128;
                                                                                                                int i12111111114 = i12111111113 % 2;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (c2 != '}') {
                                                                                            int i111111111110 = i13 + 63;
                                                                                            i14 = i111111111110 % 128;
                                                                                            b = i14;
                                                                                            int i111111111111 = i111111111110 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111111111112 = i14 + 81;
                                                                                                i15 = i111111111112 % 128;
                                                                                                a = i15;
                                                                                                int i12111111115 = i111111111112 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i12111111116 = i15 + 87;
                                                                                                    b = i12111111116 % 128;
                                                                                                    int i12111111117 = i12111111116 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i12111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i12111111118 % 128;
                                                                                                            int i12111111119 = i12111111118 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != '/') {
                                                                            if (c2 != '=') {
                                                                                int i111111111113 = i11 & 117;
                                                                                int i111111111114 = -(-((i11 ^ 117) | i111111111113));
                                                                                int i111111111115 = (i111111111113 & i111111111114) + (i111111111113 | i111111111114);
                                                                                a = i111111111115 % 128;
                                                                                int i111111111116 = i111111111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i111111111117 = i13 + 63;
                                                                                            i14 = i111111111117 % 128;
                                                                                            b = i14;
                                                                                            int i111111111118 = i111111111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111111111119 = i14 + 81;
                                                                                                i15 = i111111111119 % 128;
                                                                                                a = i15;
                                                                                                int i121111111110 = i111111111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i121111111111 = i15 + 87;
                                                                                                    b = i121111111111 % 128;
                                                                                                    int i121111111112 = i121111111111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i121111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i121111111113 % 128;
                                                                                                            int i121111111114 = i121111111113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i1111111111110 = i13 + 63;
                                                                                        i14 = i1111111111110 % 128;
                                                                                        b = i14;
                                                                                        int i1111111111111 = i1111111111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111111111112 = i14 + 81;
                                                                                            i15 = i1111111111112 % 128;
                                                                                            a = i15;
                                                                                            int i121111111115 = i1111111111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i121111111116 = i15 + 87;
                                                                                                b = i121111111116 % 128;
                                                                                                int i121111111117 = i121111111116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i121111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i121111111118 % 128;
                                                                                                        int i121111111119 = i121111111118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                f();
                                                                int i1316 = a;
                                                                int i1317 = i1316 & 89;
                                                                int i1318 = i1317 + ((i1316 ^ 89) | i1317);
                                                                b = i1318 % 128;
                                                                int i1319 = i1318 % 2;
                                                            }
                                                        } else if (c2 != ' ') {
                                                            if (c2 != '#') {
                                                                int i10114 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                int i10115 = -(((~i6) & 21) | (i6 & (-22)));
                                                                int i10116 = (i10114 & i10115) + (i10115 | i10114);
                                                                i9 = i10116 % 128;
                                                                a = i9;
                                                                int i11212 = i10116 % 2;
                                                                if (c2 != ',') {
                                                                    int i11213 = i9 & 73;
                                                                    int i11214 = (i9 ^ 73) | i11213;
                                                                    i10 = ((i11213 | i11214) << 1) - (i11214 ^ i11213);
                                                                    i11 = i10 % 128;
                                                                    b = i11;
                                                                    if (i10 % 2 != 0) {
                                                                        if (c2 != 'a') {
                                                                            if (c2 != '=') {
                                                                                int i1111111111113 = i11 & 117;
                                                                                int i1111111111114 = -(-((i11 ^ 117) | i1111111111113));
                                                                                int i1111111111115 = (i1111111111113 & i1111111111114) + (i1111111111113 | i1111111111114);
                                                                                a = i1111111111115 % 128;
                                                                                int i1111111111116 = i1111111111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i1111111111117 = i13 + 63;
                                                                                            i14 = i1111111111117 % 128;
                                                                                            b = i14;
                                                                                            int i1111111111118 = i1111111111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i1111111111119 = i14 + 81;
                                                                                                i15 = i1111111111119 % 128;
                                                                                                a = i15;
                                                                                                int i1211111111110 = i1111111111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i1211111111111 = i15 + 87;
                                                                                                    b = i1211111111111 % 128;
                                                                                                    int i1211111111112 = i1211111111111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i1211111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i1211111111113 % 128;
                                                                                                            int i1211111111114 = i1211111111113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i11111111111110 = i13 + 63;
                                                                                        i14 = i11111111111110 % 128;
                                                                                        b = i14;
                                                                                        int i11111111111111 = i11111111111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i11111111111112 = i14 + 81;
                                                                                            i15 = i11111111111112 % 128;
                                                                                            a = i15;
                                                                                            int i1211111111115 = i11111111111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i1211111111116 = i15 + 87;
                                                                                                b = i1211111111116 % 128;
                                                                                                int i1211111111117 = i1211111111116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i1211111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i1211111111118 % 128;
                                                                                                        int i1211111111119 = i1211111111118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != '/') {
                                                                        if (c2 != '=') {
                                                                            int i11111111111113 = i11 & 117;
                                                                            int i11111111111114 = -(-((i11 ^ 117) | i11111111111113));
                                                                            int i11111111111115 = (i11111111111113 & i11111111111114) + (i11111111111113 | i11111111111114);
                                                                            a = i11111111111115 % 128;
                                                                            int i11111111111116 = i11111111111115 % 2;
                                                                            if (c2 != '{') {
                                                                                i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                i13 = i12 % 128;
                                                                                a = i13;
                                                                                if (i12 % 2 == 0) {
                                                                                    if (c2 != 'P') {
                                                                                        int i11111111111117 = i13 + 63;
                                                                                        i14 = i11111111111117 % 128;
                                                                                        b = i14;
                                                                                        int i11111111111118 = i11111111111117 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i11111111111119 = i14 + 81;
                                                                                            i15 = i11111111111119 % 128;
                                                                                            a = i15;
                                                                                            int i12111111111110 = i11111111111119 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i12111111111111 = i15 + 87;
                                                                                                b = i12111111111111 % 128;
                                                                                                int i12111111111112 = i12111111111111 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i12111111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i12111111111113 % 128;
                                                                                                        int i12111111111114 = i12111111111113 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != '}') {
                                                                                    int i111111111111110 = i13 + 63;
                                                                                    i14 = i111111111111110 % 128;
                                                                                    b = i14;
                                                                                    int i111111111111111 = i111111111111110 % 2;
                                                                                    if (c2 != ':') {
                                                                                        int i111111111111112 = i14 + 81;
                                                                                        i15 = i111111111111112 % 128;
                                                                                        a = i15;
                                                                                        int i12111111111115 = i111111111111112 % 2;
                                                                                        if (c2 != ';') {
                                                                                            int i12111111111116 = i15 + 87;
                                                                                            b = i12111111111116 % 128;
                                                                                            int i12111111111117 = i12111111111116 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i++;
                                                                                                    int i12111111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                    b = i12111111111118 % 128;
                                                                                                    int i12111111111119 = i12111111111118 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            f();
                                                            int i13110 = a;
                                                            int i13111 = i13110 & 89;
                                                            int i13112 = i13111 + ((i13110 ^ 89) | i13111);
                                                            b = i13112 % 128;
                                                            int i13113 = i13112 % 2;
                                                        }
                                                    }
                                                }
                                            } else if (c2 != '\f') {
                                                if (c2 != '\r') {
                                                    int i10117 = i6 & 113;
                                                    i8 = (i10117 - (~((i6 ^ 113) | i10117))) - 1;
                                                    a = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        if (c2 != '^') {
                                                            if (c2 != '#') {
                                                                int i10118 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                                int i10119 = -(((~i6) & 21) | (i6 & (-22)));
                                                                int i101110 = (i10118 & i10119) + (i10119 | i10118);
                                                                i9 = i101110 % 128;
                                                                a = i9;
                                                                int i11215 = i101110 % 2;
                                                                if (c2 != ',') {
                                                                    int i11216 = i9 & 73;
                                                                    int i11217 = (i9 ^ 73) | i11216;
                                                                    i10 = ((i11216 | i11217) << 1) - (i11217 ^ i11216);
                                                                    i11 = i10 % 128;
                                                                    b = i11;
                                                                    if (i10 % 2 != 0) {
                                                                        if (c2 != 'a') {
                                                                            if (c2 != '=') {
                                                                                int i111111111111113 = i11 & 117;
                                                                                int i111111111111114 = -(-((i11 ^ 117) | i111111111111113));
                                                                                int i111111111111115 = (i111111111111113 & i111111111111114) + (i111111111111113 | i111111111111114);
                                                                                a = i111111111111115 % 128;
                                                                                int i111111111111116 = i111111111111115 % 2;
                                                                                if (c2 != '{') {
                                                                                    i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                    i13 = i12 % 128;
                                                                                    a = i13;
                                                                                    if (i12 % 2 == 0) {
                                                                                        if (c2 != 'P') {
                                                                                            int i111111111111117 = i13 + 63;
                                                                                            i14 = i111111111111117 % 128;
                                                                                            b = i14;
                                                                                            int i111111111111118 = i111111111111117 % 2;
                                                                                            if (c2 != ':') {
                                                                                                int i111111111111119 = i14 + 81;
                                                                                                i15 = i111111111111119 % 128;
                                                                                                a = i15;
                                                                                                int i121111111111110 = i111111111111119 % 2;
                                                                                                if (c2 != ';') {
                                                                                                    int i121111111111111 = i15 + 87;
                                                                                                    b = i121111111111111 % 128;
                                                                                                    int i121111111111112 = i121111111111111 % 2;
                                                                                                    switch (c2) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i++;
                                                                                                            int i121111111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                            b = i121111111111113 % 128;
                                                                                                            int i121111111111114 = i121111111111113 % 2;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != '}') {
                                                                                        int i1111111111111110 = i13 + 63;
                                                                                        i14 = i1111111111111110 % 128;
                                                                                        b = i14;
                                                                                        int i1111111111111111 = i1111111111111110 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111111111111112 = i14 + 81;
                                                                                            i15 = i1111111111111112 % 128;
                                                                                            a = i15;
                                                                                            int i121111111111115 = i1111111111111112 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i121111111111116 = i15 + 87;
                                                                                                b = i121111111111116 % 128;
                                                                                                int i121111111111117 = i121111111111116 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i121111111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i121111111111118 % 128;
                                                                                                        int i121111111111119 = i121111111111118 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != '/') {
                                                                        if (c2 != '=') {
                                                                            int i1111111111111113 = i11 & 117;
                                                                            int i1111111111111114 = -(-((i11 ^ 117) | i1111111111111113));
                                                                            int i1111111111111115 = (i1111111111111113 & i1111111111111114) + (i1111111111111113 | i1111111111111114);
                                                                            a = i1111111111111115 % 128;
                                                                            int i1111111111111116 = i1111111111111115 % 2;
                                                                            if (c2 != '{') {
                                                                                i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                i13 = i12 % 128;
                                                                                a = i13;
                                                                                if (i12 % 2 == 0) {
                                                                                    if (c2 != 'P') {
                                                                                        int i1111111111111117 = i13 + 63;
                                                                                        i14 = i1111111111111117 % 128;
                                                                                        b = i14;
                                                                                        int i1111111111111118 = i1111111111111117 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i1111111111111119 = i14 + 81;
                                                                                            i15 = i1111111111111119 % 128;
                                                                                            a = i15;
                                                                                            int i1211111111111110 = i1111111111111119 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i1211111111111111 = i15 + 87;
                                                                                                b = i1211111111111111 % 128;
                                                                                                int i1211111111111112 = i1211111111111111 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i1211111111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i1211111111111113 % 128;
                                                                                                        int i1211111111111114 = i1211111111111113 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != '}') {
                                                                                    int i11111111111111110 = i13 + 63;
                                                                                    i14 = i11111111111111110 % 128;
                                                                                    b = i14;
                                                                                    int i11111111111111111 = i11111111111111110 % 2;
                                                                                    if (c2 != ':') {
                                                                                        int i11111111111111112 = i14 + 81;
                                                                                        i15 = i11111111111111112 % 128;
                                                                                        a = i15;
                                                                                        int i1211111111111115 = i11111111111111112 % 2;
                                                                                        if (c2 != ';') {
                                                                                            int i1211111111111116 = i15 + 87;
                                                                                            b = i1211111111111116 % 128;
                                                                                            int i1211111111111117 = i1211111111111116 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i++;
                                                                                                    int i1211111111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                    b = i1211111111111118 % 128;
                                                                                                    int i1211111111111119 = i1211111111111118 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            f();
                                                            int i13114 = a;
                                                            int i13115 = i13114 & 89;
                                                            int i13116 = i13115 + ((i13114 ^ 89) | i13115);
                                                            b = i13116 % 128;
                                                            int i13117 = i13116 % 2;
                                                        }
                                                    } else if (c2 != ' ') {
                                                        if (c2 != '#') {
                                                            int i101111 = ((i6 ^ 21) | (i6 & 21)) << 1;
                                                            int i101112 = -(((~i6) & 21) | (i6 & (-22)));
                                                            int i101113 = (i101111 & i101112) + (i101112 | i101111);
                                                            i9 = i101113 % 128;
                                                            a = i9;
                                                            int i11218 = i101113 % 2;
                                                            if (c2 != ',') {
                                                                int i11219 = i9 & 73;
                                                                int i112110 = (i9 ^ 73) | i11219;
                                                                i10 = ((i11219 | i112110) << 1) - (i112110 ^ i11219);
                                                                i11 = i10 % 128;
                                                                b = i11;
                                                                if (i10 % 2 != 0) {
                                                                    if (c2 != 'a') {
                                                                        if (c2 != '=') {
                                                                            int i11111111111111113 = i11 & 117;
                                                                            int i11111111111111114 = -(-((i11 ^ 117) | i11111111111111113));
                                                                            int i11111111111111115 = (i11111111111111113 & i11111111111111114) + (i11111111111111113 | i11111111111111114);
                                                                            a = i11111111111111115 % 128;
                                                                            int i11111111111111116 = i11111111111111115 % 2;
                                                                            if (c2 != '{') {
                                                                                i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                                i13 = i12 % 128;
                                                                                a = i13;
                                                                                if (i12 % 2 == 0) {
                                                                                    if (c2 != 'P') {
                                                                                        int i11111111111111117 = i13 + 63;
                                                                                        i14 = i11111111111111117 % 128;
                                                                                        b = i14;
                                                                                        int i11111111111111118 = i11111111111111117 % 2;
                                                                                        if (c2 != ':') {
                                                                                            int i11111111111111119 = i14 + 81;
                                                                                            i15 = i11111111111111119 % 128;
                                                                                            a = i15;
                                                                                            int i12111111111111110 = i11111111111111119 % 2;
                                                                                            if (c2 != ';') {
                                                                                                int i12111111111111111 = i15 + 87;
                                                                                                b = i12111111111111111 % 128;
                                                                                                int i12111111111111112 = i12111111111111111 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        i++;
                                                                                                        int i12111111111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                        b = i12111111111111113 % 128;
                                                                                                        int i12111111111111114 = i12111111111111113 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != '}') {
                                                                                    int i111111111111111110 = i13 + 63;
                                                                                    i14 = i111111111111111110 % 128;
                                                                                    b = i14;
                                                                                    int i111111111111111111 = i111111111111111110 % 2;
                                                                                    if (c2 != ':') {
                                                                                        int i111111111111111112 = i14 + 81;
                                                                                        i15 = i111111111111111112 % 128;
                                                                                        a = i15;
                                                                                        int i12111111111111115 = i111111111111111112 % 2;
                                                                                        if (c2 != ';') {
                                                                                            int i12111111111111116 = i15 + 87;
                                                                                            b = i12111111111111116 % 128;
                                                                                            int i12111111111111117 = i12111111111111116 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i++;
                                                                                                    int i12111111111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                    b = i12111111111111118 % 128;
                                                                                                    int i12111111111111119 = i12111111111111118 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2 != '/') {
                                                                    if (c2 != '=') {
                                                                        int i111111111111111113 = i11 & 117;
                                                                        int i111111111111111114 = -(-((i11 ^ 117) | i111111111111111113));
                                                                        int i111111111111111115 = (i111111111111111113 & i111111111111111114) + (i111111111111111113 | i111111111111111114);
                                                                        a = i111111111111111115 % 128;
                                                                        int i111111111111111116 = i111111111111111115 % 2;
                                                                        if (c2 != '{') {
                                                                            i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                                                                            i13 = i12 % 128;
                                                                            a = i13;
                                                                            if (i12 % 2 == 0) {
                                                                                if (c2 != 'P') {
                                                                                    int i111111111111111117 = i13 + 63;
                                                                                    i14 = i111111111111111117 % 128;
                                                                                    b = i14;
                                                                                    int i111111111111111118 = i111111111111111117 % 2;
                                                                                    if (c2 != ':') {
                                                                                        int i111111111111111119 = i14 + 81;
                                                                                        i15 = i111111111111111119 % 128;
                                                                                        a = i15;
                                                                                        int i121111111111111110 = i111111111111111119 % 2;
                                                                                        if (c2 != ';') {
                                                                                            int i121111111111111111 = i15 + 87;
                                                                                            b = i121111111111111111 % 128;
                                                                                            int i121111111111111112 = i121111111111111111 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i++;
                                                                                                    int i121111111111111113 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                    b = i121111111111111113 % 128;
                                                                                                    int i121111111111111114 = i121111111111111113 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != '}') {
                                                                                int i1111111111111111110 = i13 + 63;
                                                                                i14 = i1111111111111111110 % 128;
                                                                                b = i14;
                                                                                int i1111111111111111111 = i1111111111111111110 % 2;
                                                                                if (c2 != ':') {
                                                                                    int i1111111111111111112 = i14 + 81;
                                                                                    i15 = i1111111111111111112 % 128;
                                                                                    a = i15;
                                                                                    int i121111111111111115 = i1111111111111111112 % 2;
                                                                                    if (c2 != ';') {
                                                                                        int i121111111111111116 = i15 + 87;
                                                                                        b = i121111111111111116 % 128;
                                                                                        int i121111111111111117 = i121111111111111116 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                i++;
                                                                                                int i121111111111111118 = ((i15 & 120) + (i15 | 120)) - 1;
                                                                                                b = i121111111111111118 % 128;
                                                                                                int i121111111111111119 = i121111111111111118 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        f();
                                                        int i13118 = a;
                                                        int i13119 = i13118 & 89;
                                                        int i131110 = i13119 + ((i13118 ^ 89) | i13119);
                                                        b = i131110 % 128;
                                                        int i131111 = i131110 % 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.i = (this.i - (~i2)) - 1;
                                    int i143 = b;
                                    int i144 = (i143 ^ 17) + ((i143 & 17) << 1);
                                    a = i144 % 128;
                                    int i145 = i144 % 2;
                                } else {
                                    this.i = i3;
                                    if (!j(1)) {
                                        i4 = a + 37;
                                        b = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i25 = (i25 << 1) + (i25 ^ (-1));
                    int i146 = b;
                    int i147 = i146 & 107;
                    int i148 = (i146 | 107) & (~i147);
                    int i149 = i147 << 1;
                    int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                    a = i150 % 128;
                    int i151 = i150 % 2;
                }
                this.d = 0;
            }
            i25 = (i25 | 1) + (i25 & 1);
            int i152 = b + 87;
            a = i152 % 128;
            int i153 = i152 % 2;
            this.d = 0;
        } while (i25 != 0);
        int i154 = a;
        int i155 = i154 & 43;
        int i156 = i155 + ((i154 ^ 43) | i155);
        b = i156 % 128;
        int i157 = i156 % 2;
        int[] iArr = this.r;
        int i158 = this.f72o;
        int i159 = i158 - 1;
        int i160 = i154 & 3;
        int i161 = (((~i160) & (i154 | 3)) - (~(i160 << 1))) - 1;
        b = i161 % 128;
        if (i161 % 2 != 0) {
            iArr[i159] = iArr[i159];
            strArr = this.q;
            int i162 = ((i158 | 1) << 1) - (i158 ^ 1);
            i16 = (i162 ^ (-1)) + (i162 << 1);
        } else {
            iArr[i159] = (-2) - ((iArr[i159] + 2) ^ (-1));
            strArr = this.q;
            i16 = i158 - 1;
        }
        int i163 = (i154 ^ 97) + ((i154 & 97) << 1);
        int i164 = i163 % 128;
        b = i164;
        int i165 = i163 % 2;
        strArr[i16] = "null";
        int i166 = i164 & 27;
        int i167 = -(-(i164 | 27));
        int i168 = (i166 ^ i167) + ((i167 & i166) << 1);
        a = i168 % 128;
        int i169 = i168 % 2;
    }

    public final IOException D(String str) throws h {
        int i = 2 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(str);
        sbW.append(m());
        throw new h(sbW.toString());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    public final boolean l(char c2) throws h {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0 ? c2 != '\t' : c2 != 'X') {
            int i5 = i4 + 63;
            b = i5 % 128;
            if (i5 % 2 == 0 ? c2 != '\n' : c2 != '{') {
                if (c2 != '\f') {
                    int i6 = (i4 | 27) << 1;
                    int i7 = -(i4 ^ 27);
                    int i8 = (i6 & i7) + (i6 | i7);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    if (c2 != '\r') {
                        int i10 = i4 | 71;
                        int i11 = i10 << 1;
                        int i12 = -(i10 & (~(i4 & 71)));
                        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        if (c2 != ' ') {
                            int i15 = (i4 & 75) + (i4 | 75);
                            int i16 = i15 % 128;
                            b = i16;
                            if (i15 % 2 == 0 ? c2 == '#' : c2 == 15) {
                                f();
                                int i17 = a;
                                int i18 = i17 & 89;
                                int i19 = (i17 | 89) & (~i18);
                                int i20 = i18 << 1;
                                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                                b = i21 % 128;
                                int i22 = i21 % 2;
                            } else {
                                int i23 = i16 ^ 95;
                                int i24 = -(-((i16 & 95) << 1));
                                int i25 = (i23 & i24) + (i23 | i24);
                                a = i25 % 128;
                                int i26 = i25 % 2;
                                if (c2 != ',') {
                                    int i27 = i16 ^ 31;
                                    int i28 = -(-((i16 & 31) << 1));
                                    int i29 = (i27 & i28) + (i28 | i27);
                                    int i30 = i29 % 128;
                                    a = i30;
                                    if (i29 % 2 != 0 ? c2 == '/' : c2 == '2') {
                                        f();
                                        int i110 = a;
                                        int i111 = i110 & 89;
                                        int i112 = (i110 | 89) & (~i111);
                                        int i210 = i111 << 1;
                                        int i211 = ((i112 | i210) << 1) - (i112 ^ i210);
                                        b = i211 % 128;
                                        int i212 = i211 % 2;
                                    } else {
                                        int i31 = i30 + 103;
                                        b = i31 % 128;
                                        int i32 = i31 % 2;
                                        if (c2 != '=') {
                                            int i33 = (i30 ^ 15) + ((i30 & 15) << 1);
                                            b = i33 % 128;
                                            if (i33 % 2 == 0 ? c2 != '{' : c2 != 'w') {
                                                if (c2 != '}') {
                                                    int i34 = i30 ^ 19;
                                                    int i35 = (i30 & 19) << 1;
                                                    int i36 = (i34 & i35) + (i35 | i34);
                                                    int i37 = i36 % 128;
                                                    b = i37;
                                                    int i38 = i36 % 2;
                                                    if (c2 != ':') {
                                                        int i39 = i37 | 71;
                                                        int i40 = i39 << 1;
                                                        int i41 = -(i39 & (~(i37 & 71)));
                                                        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                                                        a = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        if (c2 != ';') {
                                                            int i44 = ((i37 ^ 84) + ((i37 & 84) << 1)) - 1;
                                                            a = i44 % 128;
                                                            if (i44 % 2 == 0) {
                                                                obj.hashCode();
                                                                throw null;
                                                            }
                                                            switch (c2) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    f();
                                                                    int i113 = a;
                                                                    int i114 = i113 & 89;
                                                                    int i115 = (i113 | 89) & (~i114);
                                                                    int i213 = i114 << 1;
                                                                    int i214 = ((i115 | i213) << 1) - (i115 ^ i213);
                                                                    b = i214 % 128;
                                                                    int i215 = i214 % 2;
                                                                    break;
                                                                default:
                                                                    int i45 = i37 & 35;
                                                                    int i46 = ((((i37 ^ 35) | i45) << 1) - (~(-((i37 | 35) & (~i45))))) - 1;
                                                                    a = i46 % 128;
                                                                    if (i46 % 2 != 0) {
                                                                        return true;
                                                                    }
                                                                    throw null;
                                                            }
                                                        } else {
                                                            f();
                                                            int i116 = a;
                                                            int i117 = i116 & 89;
                                                            int i118 = (i116 | 89) & (~i117);
                                                            int i216 = i117 << 1;
                                                            int i217 = ((i118 | i216) << 1) - (i118 ^ i216);
                                                            b = i217 % 128;
                                                            int i218 = i217 % 2;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            f();
                                            int i119 = a;
                                            int i1110 = i119 & 89;
                                            int i1111 = (i119 | 89) & (~i1110);
                                            int i219 = i1110 << 1;
                                            int i2110 = ((i1111 | i219) << 1) - (i1111 ^ i219);
                                            b = i2110 % 128;
                                            int i2111 = i2110 % 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i47 = a + 41;
        b = i47 % 128;
        if (i47 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r8 == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r8 == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r12.d = 0;
        r5 = r12.r;
        r6 = r1 ^ 57;
        r1 = ((r1 & 57) | r6) << 1;
        r4 = -r6;
        r6 = ((r1 | r4) << 1) - (r1 ^ r4);
        r1 = r6 % 128;
        ivas.gov.bisp.enumeration.p032be.j.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if ((r6 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r4 = r12.f72o;
        r6 = ((r4 & 2) + (r4 | 2)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r4 = r12.f72o;
        r6 = (r4 ^ (-1)) + (r4 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r4 = (r1 ^ 15) + ((r1 & 15) << 1);
        ivas.gov.bisp.enumeration.p032be.j.b = r4 % 128;
        r4 = r4 % 2;
        r5[r6] = r5[r6] + 1;
        r4 = r1 & 111;
        r1 = -(-((r1 ^ 111) | r4));
        r2 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.p032be.j.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("Expected an int but was ");
        r0.append(r12.l);
        r0.append(m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int o() {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.j.o():int");
    }

    public String r() {
        String strU;
        int i = 2 % 2;
        int i2 = a + 37;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iG = this.d;
        if (iG == 0) {
            iG = g();
            int i3 = b + 83;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 4;
            }
        }
        if (iG == 14) {
            int i5 = b;
            int i6 = ((i5 & 64) + (i5 | 64)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                strU = w();
                int i7 = 74 / 0;
            } else {
                strU = w();
            }
        } else if (iG == 12) {
            int i8 = a + 59;
            b = i8 % 128;
            strU = u(i8 % 2 != 0 ? '=' : '\'');
        } else {
            if (iG != 13) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected a name but was ");
                sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(y()));
                sbW.append(m());
                throw new IllegalStateException(sbW.toString());
            }
            int i9 = b;
            int i10 = i9 & 111;
            int i11 = (((i9 | 111) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
            a = i11 % 128;
            strU = u(i11 % 2 == 0 ? 'x' : '\"');
        }
        this.d = 0;
        String[] strArr = this.q;
        int i12 = this.f72o;
        int i13 = a;
        int i14 = ((i13 ^ 57) | (i13 & 57)) << 1;
        int i15 = -(((~i13) & 57) | (i13 & (-58)));
        int i16 = (i14 & i15) + (i15 | i14);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            strArr[((i12 & (-2)) | ((~i12) & 1)) + ((i12 & 1) << 1)] = strU;
        } else {
            strArr[(~i12) + (i12 << 1)] = strU;
        }
        return strU;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String simpleName = getClass().getSimpleName();
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 14) + ((i2 & 14) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        sb.append(simpleName);
        sb.append(m());
        int i5 = b;
        int i6 = i5 & 59;
        int i7 = -(-((i5 ^ 59) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        String string = sb.toString();
        int i10 = a + 25;
        b = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:107:0x024d  */
    /* JADX WARN: Code duplicated, block: B:109:0x025b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0338 A[PHI: r1
  0x0338: PHI (r1v59 char) = (r1v15 char), (r1v60 char) binds: [B:20:0x0070, B:17:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x035a  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[PHI: r1
  0x0072: PHI (r1v16 char) = (r1v15 char), (r1v60 char) binds: [B:20:0x0070, B:17:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final char v() throws h {
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 2 % 2;
        int i16 = a;
        int i17 = i16 ^ 17;
        int i18 = (((i16 & 17) | i17) << 1) - i17;
        b = i18 % 128;
        char c4 = 0;
        Object obj = null;
        if (i18 % 2 != 0) {
            int i19 = 57 / 0;
            if (this.i == this.h) {
                if (!j(1)) {
                    int i20 = (-2) - ((b + 4) ^ (-1));
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    D("Unterminated escape sequence");
                    throw null;
                }
            }
        } else if (this.i == this.h) {
            if (!j(1)) {
                int i22 = (-2) - ((b + 4) ^ (-1));
                a = i22 % 128;
                int i23 = i22 % 2;
                D("Unterminated escape sequence");
                throw null;
            }
        }
        char[] cArr = this.g;
        int i24 = this.i;
        int i25 = i24 + 1;
        int i26 = a;
        int i27 = ((i26 ^ 49) | (i26 & 49)) << 1;
        int i28 = -(((~i26) & 49) | (i26 & (-50)));
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = i29 % 128;
        b = i30;
        if (i29 % 2 != 0) {
            this.i = i25;
            c2 = cArr[i24];
            if (c2 != 'v') {
                i = ((i30 | 21) << 1) - (((~i30) & 21) | (i30 & (-22)));
                i2 = i % 128;
                a = i2;
                if (i % 2 == 0 ? c2 != '\"' : c2 != '\r') {
                    if (c2 != '\'') {
                        int i31 = i2 & 33;
                        i3 = (((i2 | 33) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
                        i4 = i3 % 128;
                        b = i4;
                        if (i3 % 2 != 0 ? c2 != '/' : c2 != '+') {
                            if (c2 != '\\') {
                                i5 = i4 + 7;
                                i6 = i5 % 128;
                                a = i6;
                                if (i5 % 2 == 0 ? c2 == 'b' : c2 == 'O') {
                                    int i32 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                                    b = i32 % 128;
                                    int i33 = i32 % 2;
                                    return '\b';
                                }
                                if (c2 == 'f') {
                                    int i34 = i4 + 113;
                                    a = i34 % 128;
                                    int i35 = i34 % 2;
                                    return '\f';
                                }
                                int i36 = i4 & 71;
                                int i37 = ((i4 ^ 71) | i36) << 1;
                                int i38 = -((~i36) & (i4 | 71));
                                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                                int i40 = i39 % 128;
                                a = i40;
                                if (i39 % 2 != 0 ? c2 == 'n' : c2 == '(') {
                                    int i41 = i40 ^ 7;
                                    int i42 = ((i40 & 7) | i41) << 1;
                                    int i43 = -i41;
                                    int i44 = (i42 & i43) + (i43 | i42);
                                    b = i44 % 128;
                                    if (i44 % 2 == 0) {
                                        return '\n';
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                if (c2 == 'r') {
                                    int i45 = ((i40 & 90) + (i40 | 90)) - 1;
                                    b = i45 % 128;
                                    if (i45 % 2 == 0) {
                                        return '\r';
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                int i46 = i4 + 107;
                                a = i46 % 128;
                                int i47 = i46 % 2;
                                if (c2 == 't') {
                                    int i48 = i4 + 73;
                                    a = i48 % 128;
                                    int i49 = i48 % 2;
                                    return '\t';
                                }
                                int i50 = i4 & 101;
                                int i51 = -(-((i4 ^ 101) | i50));
                                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                                int i53 = i52 % 128;
                                a = i53;
                                if (i52 % 2 != 0 ? c2 != 'u' : c2 != 'u') {
                                    D("Invalid escape sequence");
                                    throw null;
                                }
                                int i54 = i25 & 4;
                                int i55 = (i25 | 4) & (~i54);
                                int i56 = i54 << 1;
                                if ((i55 & i56) + (i56 | i55) > this.h) {
                                    int i57 = i53 & 33;
                                    int i58 = ((i53 ^ 33) | i57) << 1;
                                    int i59 = -((i53 | 33) & (~i57));
                                    int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                                    b = i60 % 128;
                                    if (i60 % 2 == 0 ? !j(4) : !j(5)) {
                                        int i61 = b;
                                        int i62 = (i61 ^ 55) + ((i61 & 55) << 1);
                                        a = i62 % 128;
                                        if (i62 % 2 == 0) {
                                            D("Unterminated escape sequence");
                                            throw null;
                                        }
                                        D("Unterminated escape sequence");
                                        throw null;
                                    }
                                }
                                int i63 = this.i;
                                int i64 = b;
                                int i65 = i64 & 45;
                                int i66 = (((i64 ^ 45) | i65) << 1) - ((i64 | 45) & (~i65));
                                a = i66 % 128;
                                int i67 = i66 % 2;
                                int i68 = i63;
                                while (i68 < i63 + 4) {
                                    int i69 = b;
                                    int i70 = i69 & 83;
                                    int i71 = (((i69 ^ 83) | i70) << 1) - ((i69 | 83) & (~i70));
                                    int i72 = i71 % 128;
                                    a = i72;
                                    if (i71 % 2 == 0) {
                                        c3 = this.g[i68];
                                        i7 = c4 >> 2;
                                    } else {
                                        c3 = this.g[i68];
                                        i7 = c4 << 4;
                                    }
                                    char c5 = (char) i7;
                                    if (c3 >= '0') {
                                        int i73 = i72 & 13;
                                        int i74 = (i73 - (~(-(-((i72 ^ 13) | i73))))) - 1;
                                        b = i74 % 128;
                                        int i75 = i74 % 2;
                                        if (c3 <= '9') {
                                            int i76 = i72 & 119;
                                            int i77 = -(-(i72 | 119));
                                            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                                            b = i78 % 128;
                                            int i79 = i78 % 2;
                                            int i80 = ((c3 ^ (-48)) | (c3 & (-48))) << 1;
                                            int i81 = -(((~c3) & (-48)) | (c3 & '/'));
                                            i12 = (i80 ^ i81) + ((i81 & i80) << 1);
                                            int i82 = i72 & 73;
                                            int i83 = (i72 ^ 73) | i82;
                                            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                                            b = i84 % 128;
                                            int i85 = i84 % 2;
                                        } else {
                                            if (c3 >= 'a') {
                                                if (c3 >= 'A') {
                                                    i8 = a;
                                                    int i86 = ((i8 & 40) + (i8 | 40)) - 1;
                                                    b = i86 % 128;
                                                    int i87 = i86 % 2;
                                                    if (c3 <= 'F') {
                                                        i9 = ((i8 & 121) - (~(-(-(i8 | 121))))) - 1;
                                                        b = i9 % 128;
                                                        if (i9 % 2 != 0) {
                                                            i10 = (((c3 & (-30)) | ((~c3) & 29)) - (~((c3 & 29) << 1))) - 1;
                                                        } else {
                                                            i10 = (c3 & (-65)) + (c3 | (-65));
                                                        }
                                                        i11 = i10;
                                                    }
                                                }
                                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("\\u");
                                                sbW.append(new String(this.g, this.i, 4));
                                                throw new NumberFormatException(sbW.toString());
                                            }
                                            int i88 = b;
                                            int i89 = i88 | 41;
                                            int i90 = i89 << 1;
                                            int i91 = -(i89 & (~(i88 & 41)));
                                            i13 = (i90 & i91) + (i91 | i90);
                                            a = i13 % 128;
                                            if (i13 % 2 == 0 ? c3 > 'f' : c3 > 'n') {
                                                if (c3 >= 'A') {
                                                    i8 = a;
                                                    int i810 = ((i8 & 40) + (i8 | 40)) - 1;
                                                    b = i810 % 128;
                                                    int i811 = i810 % 2;
                                                    if (c3 <= 'F') {
                                                        i9 = ((i8 & 121) - (~(-(-(i8 | 121))))) - 1;
                                                        b = i9 % 128;
                                                        if (i9 % 2 != 0) {
                                                            i10 = (((c3 & (-30)) | ((~c3) & 29)) - (~((c3 & 29) << 1))) - 1;
                                                        } else {
                                                            i10 = (c3 & (-65)) + (c3 | (-65));
                                                        }
                                                        i11 = i10;
                                                    }
                                                }
                                                StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("\\u");
                                                sbW2.append(new String(this.g, this.i, 4));
                                                throw new NumberFormatException(sbW2.toString());
                                            }
                                            int i92 = i88 & 115;
                                            int i93 = (i88 | 115) & (~i92);
                                            int i94 = i92 << 1;
                                            int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                                            a = i95 % 128;
                                            if (i95 % 2 == 0) {
                                                int i96 = (c3 | '_') << 1;
                                                int i97 = -(c3 ^ '_');
                                                i11 = (i96 ^ i97) + ((i96 & i97) << 1);
                                            } else {
                                                i11 = ((c3 | (-97)) << 1) - (c3 ^ (-97));
                                            }
                                            int i98 = i11 & (-83);
                                            int i99 = (i98 - (~(-(-((i11 ^ (-83)) | i98))))) - 1;
                                            i12 = (((i99 & (-94)) | ((~i99) & 93)) - (~((i99 & 93) << 1))) - 1;
                                            int i100 = b + 81;
                                            a = i100 % 128;
                                            int i101 = i100 % 2;
                                        }
                                    } else {
                                        if (c3 >= 'a') {
                                            if (c3 >= 'A') {
                                                i8 = a;
                                                int i812 = ((i8 & 40) + (i8 | 40)) - 1;
                                                b = i812 % 128;
                                                int i813 = i812 % 2;
                                                if (c3 <= 'F') {
                                                    i9 = ((i8 & 121) - (~(-(-(i8 | 121))))) - 1;
                                                    b = i9 % 128;
                                                    if (i9 % 2 != 0) {
                                                        i10 = (((c3 & (-30)) | ((~c3) & 29)) - (~((c3 & 29) << 1))) - 1;
                                                    } else {
                                                        i10 = (c3 & (-65)) + (c3 | (-65));
                                                    }
                                                    i11 = i10;
                                                }
                                            }
                                            StringBuilder sbW3 = ivas.gov.bisp.enumeration.p091n.j.w("\\u");
                                            sbW3.append(new String(this.g, this.i, 4));
                                            throw new NumberFormatException(sbW3.toString());
                                        }
                                        int i814 = b;
                                        int i815 = i814 | 41;
                                        int i910 = i815 << 1;
                                        int i911 = -(i815 & (~(i814 & 41)));
                                        i13 = (i910 & i911) + (i911 | i910);
                                        a = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            if (c3 >= 'A') {
                                                i8 = a;
                                                int i816 = ((i8 & 40) + (i8 | 40)) - 1;
                                                b = i816 % 128;
                                                int i817 = i816 % 2;
                                                if (c3 <= 'F') {
                                                    i9 = ((i8 & 121) - (~(-(-(i8 | 121))))) - 1;
                                                    b = i9 % 128;
                                                    if (i9 % 2 != 0) {
                                                        i10 = (((c3 & (-30)) | ((~c3) & 29)) - (~((c3 & 29) << 1))) - 1;
                                                    } else {
                                                        i10 = (c3 & (-65)) + (c3 | (-65));
                                                    }
                                                    i11 = i10;
                                                }
                                            }
                                            StringBuilder sbW4 = ivas.gov.bisp.enumeration.p091n.j.w("\\u");
                                            sbW4.append(new String(this.g, this.i, 4));
                                            throw new NumberFormatException(sbW4.toString());
                                        }
                                        if (c3 >= 'A') {
                                            i8 = a;
                                            int i818 = ((i8 & 40) + (i8 | 40)) - 1;
                                            b = i818 % 128;
                                            int i819 = i818 % 2;
                                            if (c3 <= 'F') {
                                                i9 = ((i8 & 121) - (~(-(-(i8 | 121))))) - 1;
                                                b = i9 % 128;
                                                if (i9 % 2 != 0) {
                                                    i10 = (((c3 & (-30)) | ((~c3) & 29)) - (~((c3 & 29) << 1))) - 1;
                                                } else {
                                                    i10 = (c3 & (-65)) + (c3 | (-65));
                                                }
                                                i11 = i10;
                                            }
                                        }
                                        StringBuilder sbW5 = ivas.gov.bisp.enumeration.p091n.j.w("\\u");
                                        sbW5.append(new String(this.g, this.i, 4));
                                        throw new NumberFormatException(sbW5.toString());
                                        int i912 = i11 & (-83);
                                        int i913 = (i912 - (~(-(-((i11 ^ (-83)) | i912))))) - 1;
                                        i12 = (((i913 & (-94)) | ((~i913) & 93)) - (~((i913 & 93) << 1))) - 1;
                                        int i102 = b + 81;
                                        a = i102 % 128;
                                        int i103 = i102 % 2;
                                    }
                                    c4 = (char) ((-2) - ((i12 - (~(-(-c5)))) ^ (-1)));
                                    i68 = ((i68 & 1) << 1) + (i68 ^ 1);
                                    int i104 = b;
                                    int i105 = (i104 & (-2)) | ((~i104) & 1);
                                    int i106 = -(-((i104 & 1) << 1));
                                    int i107 = (i105 & i106) + (i106 | i105);
                                    a = i107 % 128;
                                    int i108 = i107 % 2;
                                }
                                int i109 = this.i;
                                this.i = ((i109 ^ 5) + ((i109 & 5) << 1)) - 1;
                                int i110 = b;
                                int i111 = (i110 ^ 123) + ((i110 & 123) << 1);
                                a = i111 % 128;
                                if (i111 % 2 != 0) {
                                    return c4;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            } else {
                int i112 = this.j;
                int i113 = i112 & 1;
                this.j = i113 + ((i112 ^ 1) | i113);
                int i114 = (i30 & 96) + (i30 | 96);
                int i115 = (i114 ^ (-1)) + (i114 << 1);
                a = i115 % 128;
                int i116 = i115 % 2;
                this.k = i25;
                i14 = i30 + 29;
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i117 = 4 % 2;
                }
            }
        } else {
            this.i = i25;
            c2 = cArr[i24];
            if (c2 != '\n') {
                i = ((i30 | 21) << 1) - (((~i30) & 21) | (i30 & (-22)));
                i2 = i % 128;
                a = i2;
                if (i % 2 == 0) {
                    if (c2 != '\'') {
                        int i310 = i2 & 33;
                        i3 = (((i2 | 33) & (~i310)) - (~(-(-(i310 << 1))))) - 1;
                        i4 = i3 % 128;
                        b = i4;
                        if (i3 % 2 != 0) {
                            if (c2 != '\\') {
                                i5 = i4 + 7;
                                i6 = i5 % 128;
                                a = i6;
                                if (i5 % 2 == 0) {
                                    int i311 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                                    b = i311 % 128;
                                    int i312 = i311 % 2;
                                    return '\b';
                                }
                                int i313 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                                b = i313 % 128;
                                int i314 = i313 % 2;
                                return '\b';
                            }
                        } else if (c2 != '\\') {
                            i5 = i4 + 7;
                            i6 = i5 % 128;
                            a = i6;
                            if (i5 % 2 == 0) {
                                int i315 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                                b = i315 % 128;
                                int i316 = i315 % 2;
                                return '\b';
                            }
                            int i317 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                            b = i317 % 128;
                            int i318 = i317 % 2;
                            return '\b';
                        }
                    }
                } else if (c2 != '\'') {
                    int i319 = i2 & 33;
                    i3 = (((i2 | 33) & (~i319)) - (~(-(-(i319 << 1))))) - 1;
                    i4 = i3 % 128;
                    b = i4;
                    if (i3 % 2 != 0) {
                        if (c2 != '\\') {
                            i5 = i4 + 7;
                            i6 = i5 % 128;
                            a = i6;
                            if (i5 % 2 == 0) {
                                int i3110 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                                b = i3110 % 128;
                                int i3111 = i3110 % 2;
                                return '\b';
                            }
                            int i3112 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                            b = i3112 % 128;
                            int i3113 = i3112 % 2;
                            return '\b';
                        }
                    } else if (c2 != '\\') {
                        i5 = i4 + 7;
                        i6 = i5 % 128;
                        a = i6;
                        if (i5 % 2 == 0) {
                            int i3114 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                            b = i3114 % 128;
                            int i3115 = i3114 % 2;
                            return '\b';
                        }
                        int i3116 = (((i6 & (-28)) | ((~i6) & 27)) - (~((i6 & 27) << 1))) - 1;
                        b = i3116 % 128;
                        int i3117 = i3116 % 2;
                        return '\b';
                    }
                }
            } else {
                int i118 = this.j;
                int i119 = i118 & 1;
                this.j = i119 + ((i118 ^ 1) | i119);
                int i1110 = (i30 & 96) + (i30 | 96);
                int i1111 = (i1110 ^ (-1)) + (i1110 << 1);
                a = i1111 % 128;
                int i1112 = i1111 % 2;
                this.k = i25;
                i14 = i30 + 29;
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    int i1113 = 4 % 2;
                }
            }
        }
        int i120 = a;
        int i121 = ((i120 ^ 123) | (i120 & 123)) << 1;
        int i122 = -(((~i120) & 123) | (i120 & (-124)));
        int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
        b = i123 % 128;
        int i124 = i123 % 2;
        return c2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    public boolean c() throws IOException {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int iG = this.d;
        if (iG == 0) {
            int i5 = i4 & 9;
            int i6 = (i4 ^ 9) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                g();
                throw null;
            }
            iG = g();
        }
        if (iG != 2) {
            int i8 = a;
            int i9 = ((i8 ^ 105) | (i8 & 105)) << 1;
            int i10 = -(((~i8) & 105) | (i8 & (-106)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            int i12 = i11 % 128;
            b = i12;
            if (i11 % 2 == 0 ? iG == 4 : iG == 5) {
                int i13 = a;
                int i14 = ((i13 ^ 124) + ((i13 & 124) << 1)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                z = false;
            } else {
                int i16 = (i12 & 123) + (i12 | 123);
                a = i16 % 128;
                int i17 = i16 % 2;
                int i18 = (i12 & (-26)) | ((~i12) & 25);
                int i19 = (i12 & 25) << 1;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 2 / 3;
                }
                z = true;
            }
        } else {
            int i110 = a;
            int i111 = ((i110 ^ 124) + ((i110 & 124) << 1)) - 1;
            b = i111 % 128;
            int i112 = i111 % 2;
            z = false;
        }
        int i22 = b;
        int i23 = ((i22 & 12) + (i22 | 12)) - 1;
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = ((i2 ^ 71) | i3) << 1;
        int i5 = -((i2 | 71) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        int iG = this.d;
        if (iG == 0) {
            iG = g();
            int i7 = b;
            int i8 = ((i7 & 55) - (~(-(-(i7 | 55))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (iG != 3) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected BEGIN_ARRAY but was ");
            sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(y()));
            sbW.append(m());
            throw new IllegalStateException(sbW.toString());
        }
        int i10 = a + 59;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            z(1);
        } else {
            z(1);
        }
        int[] iArr = this.r;
        int i11 = this.f72o;
        int i12 = (i11 ^ (-1)) | i11;
        iArr[(i11 & i12) + (i11 | i12)] = 0;
        this.d = 0;
        int i13 = b;
        int i14 = (i13 & 77) + (i13 | 77);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        D("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5.f != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r5.f != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = r1 & 69;
        r2 = (r2 - (~((r1 ^ 69) | r2))) - 1;
        ivas.gov.bisp.enumeration.p032be.j.b = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() throws ivas.gov.bisp.enumeration.p032be.h {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p032be.j.b
            r2 = r1 & 35
            r1 = r1 ^ 35
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.j.a = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L21
            boolean r2 = r5.f
            r4 = 11
            int r4 = r4 / 0
            if (r2 == 0) goto L37
            goto L25
        L21:
            boolean r2 = r5.f
            if (r2 == 0) goto L37
        L25:
            r2 = r1 & 69
            r1 = r1 ^ 69
            r1 = r1 | r2
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p032be.j.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L36
            return
        L36:
            throw r3
        L37:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r5.D(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.j.f():void");
    }

    public void h() {
        int i;
        int[] iArr;
        int i2;
        int iG;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 111) << 1) - (i4 ^ 111);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = this.d;
        if (i8 == 0) {
            int i9 = i6 & 21;
            int i10 = ((i6 ^ 21) | i9) << 1;
            int i11 = -((i6 | 21) & (~i9));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                iG = g();
                int i13 = 71 / 0;
            } else {
                iG = g();
            }
            i8 = iG;
            int i14 = b;
            int i15 = i14 & 103;
            int i16 = ((((i14 ^ 103) | i15) << 1) - (~(-((i14 | 103) & (~i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        if (i8 != 2) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected END_OBJECT but was ");
            String strF = ivas.gov.bisp.enumeration.p091n.j.F(y());
            int i18 = b;
            int i19 = i18 & 75;
            int i20 = (i18 | 75) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            sbW.append(strF);
            sbW.append(m());
            throw new IllegalStateException(sbW.toString());
        }
        int i24 = b;
        int i25 = (-2) - (((i24 & 70) + (i24 | 70)) ^ (-1));
        a = i25 % 128;
        if (i25 % 2 == 0) {
            i = this.f72o >>> 1;
        } else {
            int i26 = this.f72o;
            int i27 = ~i26;
            int i28 = -(-(i26 << 1));
            i = (i28 | i27) + (i27 & i28);
        }
        this.f72o = i;
        int i29 = i24 & 35;
        int i30 = (i24 ^ 35) | i29;
        int i31 = (i29 & i30) + (i29 | i30);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            this.q[i] = null;
            iArr = this.r;
            int i32 = i - 19;
            i2 = ((i32 | 99) << 1) - (i32 ^ 99);
        } else {
            this.q[i] = null;
            iArr = this.r;
            int i33 = i & 115;
            int i34 = i | 115;
            int i35 = (((i33 | i34) << 1) - (i34 ^ i33)) - 115;
            i2 = (i35 << 1) + (i35 ^ (-1));
        }
        int i36 = iArr[i2];
        iArr[i2] = ((i36 | 1) << 1) - (i36 ^ 1);
        this.d = 0;
        int i37 = i24 & 77;
        int i38 = (i37 - (~(-(-((i24 ^ 77) | i37))))) - 1;
        a = i38 % 128;
        int i39 = i38 % 2;
    }

    public void i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 81;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iG = this.d;
        if (iG == 0) {
            int i5 = i2 & 77;
            int i6 = (i5 - (~(-(-((i2 ^ 77) | i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            iG = g();
            int i8 = b + 119;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (iG != 4) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected END_ARRAY but was ");
            sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(y()));
            sbW.append(m());
            throw new IllegalStateException(sbW.toString());
        }
        int i10 = a;
        int i11 = i10 & 73;
        int i12 = (i10 ^ 73) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        int i16 = this.f72o;
        int i17 = -(-((i16 ^ (-1)) | i16));
        int i18 = (i16 & i17) + (i16 | i17);
        this.f72o = i18;
        int i19 = i14 | 51;
        int i20 = (i19 << 1) - ((~(i14 & 51)) & i19);
        int i21 = i20 % 128;
        a = i21;
        int i22 = i20 % 2;
        int[] iArr = this.r;
        int i23 = i18 ^ 64;
        int i24 = ((((i18 & 64) | i23) << 1) - (~(-i23))) - 1;
        int i25 = (i24 | (-65)) << 1;
        int i26 = -(i24 ^ (-65));
        int i27 = (i25 & i26) + (i25 | i26);
        int i28 = (((i21 | 90) << 1) - (i21 ^ 90)) - 1;
        int i29 = i28 % 128;
        b = i29;
        int i30 = i28 % 2;
        iArr[i27] = iArr[i27] + 1;
        this.d = 0;
        int i31 = ((i29 & (-112)) | ((~i29) & 111)) + ((i29 & 111) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    public String m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-58)) | ((~i2) & 57)) + ((i2 & 57) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.j;
        int i5 = this.i;
        int i6 = this.k;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        int i7 = a;
        int i8 = i7 & 5;
        int i9 = -(-((i7 ^ 5) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            sb.append(i4);
            sb.append(" column ");
        } else {
            int i11 = i4 & 1;
            int i12 = (i4 ^ 1) | i11;
            sb.append((i11 ^ i12) + ((i12 & i11) << 1));
            sb.append(" column ");
        }
        int i13 = b;
        int i14 = i13 ^ 75;
        int i15 = ((((i13 & 75) | i14) << 1) - (~(-i14))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = -i6;
        int i18 = ((((~i17) & i5) | ((~i5) & i17)) - (~(-(-((i17 & i5) << 1))))) - 1;
        int i19 = i18 & 1;
        int i20 = -(-((i18 ^ 1) | i19));
        sb.append(((i19 | i20) << 1) - (i19 ^ i20));
        int i21 = b;
        int i22 = (i21 & 125) + (i21 | 125);
        a = i22 % 128;
        int i23 = i22 % 2;
        sb.append(" path ");
        sb.append(k());
        int i24 = a;
        int i25 = (i24 ^ 125) + ((i24 & 125) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
        String string = sb.toString();
        int i27 = a;
        int i28 = (i27 & 9) + (i27 | 9);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 84 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public long q() throws IOException {
        int iG;
        char c2;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 83;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            iG = this.d;
            int i4 = 2 / 0;
            if (iG == 0) {
                iG = g();
                int i5 = b;
                int i6 = (i5 & (-48)) | ((~i5) & 47);
                int i7 = (i5 & 47) << 1;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            iG = this.d;
            if (iG == 0) {
                iG = g();
                int i10 = b;
                int i11 = (i10 & (-48)) | ((~i10) & 47);
                int i12 = (i10 & 47) << 1;
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        Object obj = null;
        if (iG == 15) {
            int i15 = b;
            int i16 = i15 & 15;
            int i17 = ((i15 ^ 15) | i16) << 1;
            int i18 = -((i15 | 15) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            a = i20;
            if (i19 % 2 == 0) {
                this.d = 1;
            } else {
                this.d = 0;
            }
            int[] iArr = this.r;
            int i21 = this.f72o - 1;
            int i22 = iArr[i21];
            int i23 = i22 & 1;
            int i24 = (i22 ^ 1) | i23;
            iArr[i21] = (i23 & i24) + (i24 | i23);
            long j = this.l;
            int i25 = i20 & 99;
            int i26 = (i25 - (~(-(-((i20 ^ 99) | i25))))) - 1;
            b = i26 % 128;
            if (i26 % 2 == 0) {
                return j;
            }
            throw null;
        }
        if (iG == 16) {
            String str = new String(this.g, this.i, this.m);
            int i27 = b;
            int i28 = (i27 & 87) + (i27 | 87);
            int i29 = i28 % 128;
            a = i29;
            if (i28 % 2 == 0) {
                this.n = str;
                i = this.i >>> this.m;
            } else {
                this.n = str;
                int i30 = this.i;
                int i31 = -(-this.m);
                int i32 = i30 ^ i31;
                i = (((i30 & i31) | i32) << 1) - i32;
            }
            this.i = i;
            int i33 = ((i29 ^ 113) | (i29 & 113)) << 1;
            int i34 = -(((~i29) & 113) | (i29 & (-114)));
            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
            b = i35 % 128;
            int i36 = i35 % 2;
        } else {
            if (iG != 8) {
                int i37 = b;
                int i38 = i37 ^ 79;
                int i39 = ((((i37 & 79) | i38) << 1) - (~(-i38))) - 1;
                a = i39 % 128;
                int i40 = i39 % 2;
                if (iG != 9) {
                    int i41 = i37 & 11;
                    int i42 = (i41 - (~((i37 ^ 11) | i41))) - 1;
                    int i43 = i42 % 128;
                    a = i43;
                    if (i42 % 2 != 0 ? iG != 10 : iG != 102) {
                        int i44 = ((i43 ^ 59) | (i43 & 59)) << 1;
                        int i45 = -((i43 & (-60)) | ((~i43) & 59));
                        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected a long but was ");
                        String strF = ivas.gov.bisp.enumeration.p091n.j.F(y());
                        int i48 = b;
                        int i49 = (i48 & (-66)) | ((~i48) & 65);
                        int i50 = -(-((i48 & 65) << 1));
                        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                        a = i51 % 128;
                        int i52 = i51 % 2;
                        sbW.append(strF);
                        sbW.append(m());
                        throw new IllegalStateException(sbW.toString());
                    }
                }
            }
            if (iG == 10) {
                int i53 = b;
                int i54 = i53 & 43;
                int i55 = (i53 | 43) & (~i54);
                int i56 = i54 << 1;
                int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    this.n = w();
                    throw null;
                }
                this.n = w();
            } else {
                if (iG == 8) {
                    int i58 = a;
                    int i59 = i58 + 86;
                    int i60 = (i59 ^ (-1)) + (i59 << 1);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = i58 & 45;
                    int i63 = (i58 ^ 45) | i62;
                    int i64 = (i62 & i63) + (i63 | i62);
                    b = i64 % 128;
                    if (i64 % 2 != 0) {
                        int i65 = 2 / 2;
                    }
                    c2 = '\'';
                } else {
                    int i66 = b;
                    int i67 = (i66 & (-62)) | ((~i66) & 61);
                    int i68 = -(-((i66 & 61) << 1));
                    int i69 = (i67 & i68) + (i68 | i67);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    c2 = '\"';
                }
                this.n = u(c2);
                int i71 = b;
                int i72 = ((((i71 ^ 123) | (i71 & 123)) << 1) - (~(-(((~i71) & 123) | (i71 & (-124)))))) - 1;
                a = i72 % 128;
                if (i72 % 2 == 0) {
                    int i73 = 4 % 2;
                }
            }
            try {
                long j2 = Long.parseLong(this.n);
                this.d = 0;
                int i74 = b;
                int i75 = ((i74 & 106) + (i74 | 106)) - 1;
                a = i75 % 128;
                int i76 = i75 % 2;
                int[] iArr2 = this.r;
                int i77 = this.f72o - 1;
                int i78 = i74 ^ 101;
                int i79 = (((i74 & 101) | i78) << 1) - i78;
                a = i79 % 128;
                if (i79 % 2 == 0) {
                    int i80 = iArr2[i77];
                    iArr2[i77] = (-2) - ((((i80 | 1) << 1) - (i80 ^ 1)) ^ (-1));
                } else {
                    int i81 = iArr2[i77];
                    int i82 = i81 & 1;
                    int i83 = (i81 ^ 1) | i82;
                    iArr2[i77] = (i82 & i83) + (i83 | i82);
                }
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.d = 11;
        double d = Double.parseDouble(this.n);
        int i84 = a;
        int i85 = i84 ^ 73;
        int i86 = (i84 & 73) << 1;
        int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
        b = i87 % 128;
        if (i87 % 2 != 0) {
            throw null;
        }
        long j3 = (long) d;
        if (j3 != d) {
            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Expected a long but was ");
            String str2 = this.n;
            int i88 = b;
            int i89 = (i88 | 65) << 1;
            int i90 = -(((~i88) & 65) | (i88 & (-66)));
            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
            a = i91 % 128;
            if (i91 % 2 != 0) {
                sbW2.append(str2);
                sbW2.append(m());
                throw new NumberFormatException(sbW2.toString());
            }
            sbW2.append(str2);
            sbW2.append(m());
            obj.hashCode();
            throw null;
        }
        this.n = null;
        this.d = 0;
        int[] iArr3 = this.r;
        int i92 = i84 ^ 75;
        int i93 = ((i84 & 75) | i92) << 1;
        int i94 = -i92;
        int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
        int i96 = i95 % 128;
        b = i96;
        int i97 = i95 % 2;
        int i98 = this.f72o;
        int i99 = i98 + ((i98 ^ (-1)) | i98);
        int i100 = (i96 & 95) + (i96 | 95);
        int i101 = i100 % 128;
        a = i101;
        if (i100 % 2 == 0) {
            iArr3[i99] = iArr3[i99];
        } else {
            int i102 = iArr3[i99];
            int i103 = i102 & 1;
            int i104 = (i102 ^ 1) | i103;
            iArr3[i99] = (i103 & i104) + (i104 | i103);
        }
        int i105 = i101 & 23;
        int i106 = -(-((i101 ^ 23) | i105));
        int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
        b = i107 % 128;
        if (i107 % 2 == 0) {
            return j3;
        }
        throw null;
    }

    public void s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (((i2 ^ 71) | i3) << 1) - ((i2 | 71) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.d;
        if (i7 == 0) {
            int i8 = i5 + 18;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            int iG = g();
            if (i10 == 0) {
                int i11 = 13 / 0;
            }
            i7 = iG;
            int i12 = b;
            int i13 = i12 ^ 121;
            int i14 = (((i12 & 121) | i13) << 1) - i13;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        if (i7 != 7) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected null but was ");
            int iY = y();
            int i16 = b;
            int i17 = ((i16 ^ 109) | (i16 & 109)) << 1;
            int i18 = -(((~i16) & 109) | (i16 & (-110)));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
            sbW.append(m());
            throw new IllegalStateException(sbW.toString());
        }
        int i21 = b;
        int i22 = i21 ^ 121;
        int i23 = (i21 & 121) << 1;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        int i25 = i24 % 128;
        a = i25;
        int i26 = i24 % 2;
        this.d = 0;
        int[] iArr = this.r;
        int i27 = this.f72o;
        int i28 = i25 + 47;
        int i29 = i28 % 128;
        b = i29;
        if (i28 % 2 != 0) {
            int i30 = i27 << 1;
            iArr[i30] = iArr[i30];
        } else {
            int i31 = i27 - 1;
            int i32 = iArr[i31];
            int i33 = ((i32 ^ 1) | (i32 & 1)) << 1;
            int i34 = -(((~i32) & 1) | (i32 & (-2)));
            iArr[i31] = ((i33 | i34) << 1) - (i34 ^ i33);
        }
        int i35 = ((i29 ^ 23) | (i29 & 23)) << 1;
        int i36 = -((i29 & (-24)) | ((~i29) & 23));
        int i37 = (i35 & i36) + (i35 | i36);
        a = i37 % 128;
        if (i37 % 2 == 0) {
            int i38 = 27 / 0;
        }
    }

    public int y() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = i3 + ((i2 ^ 87) | i3);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        int iG = this.d;
        if (iG == 0) {
            int i6 = i5 ^ 47;
            int i7 = ((i5 & 47) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                g();
                throw null;
            }
            iG = g();
        }
        switch (iG) {
            case 1:
                int i10 = a;
                int i11 = (i10 ^ 9) + ((9 & i10) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 53 / 0;
                }
                return 3;
            case 2:
                int i13 = a;
                int i14 = ((i13 & (-30)) | ((~i13) & 29)) + ((i13 & 29) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                return 4;
            case 3:
                int i16 = a;
                int i17 = (((i16 & (-56)) | ((~i16) & 55)) - (~(-(-((i16 & 55) << 1))))) - 1;
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    return 1;
                }
                obj.hashCode();
                throw null;
            case 4:
                int i18 = b;
                int i19 = (i18 | 17) << 1;
                int i20 = -(((~i18) & 17) | (i18 & (-18)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                return 2;
            case 5:
            case 6:
                int i23 = b;
                int i24 = i23 & 39;
                int i25 = i23 | 39;
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 24 / 0;
                }
                return 8;
            case 7:
                int i28 = a;
                int i29 = ((i28 | 25) << 1) - (i28 ^ 25);
                b = i29 % 128;
                int i30 = i29 % 2;
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                int i31 = a + 27;
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 81 / 0;
                }
                return 6;
            case 12:
            case 13:
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                int i33 = a;
                int i34 = (i33 | 33) << 1;
                int i35 = -(i33 ^ 33);
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    return 5;
                }
                obj.hashCode();
                throw null;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
            case 16:
                int i37 = a;
                int i38 = i37 & 69;
                int i39 = (((i37 ^ 69) | i38) << 1) - ((i37 | 69) & (~i38));
                b = i39 % 128;
                int i40 = i39 % 2;
                return 7;
            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                int i41 = b;
                int i42 = i41 & 71;
                int i43 = i41 | 71;
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                a = i44 % 128;
                int i45 = i44 % 2;
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:28:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120 A[SYNTHETIC] */
    public String k() {
        int i;
        int i2;
        String str;
        int[] iArr;
        int i3;
        int i4 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i5 = b;
        int i6 = i5 ^ 15;
        int i7 = ((i5 & 15) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = this.f72o;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = b;
            int i14 = i13 & 27;
            int i15 = ((i13 ^ 27) | i14) << 1;
            int i16 = -((i13 | 27) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            int[] iArr2 = this.p;
            if (i19 != 0 ? (i = iArr2[i12]) == 1 : (i = iArr2[i12]) == 1) {
                sb.append('[');
                iArr = this.r;
                int i20 = b;
                i3 = (i20 & 115) + (i20 | 115);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    sb.append(iArr[i12]);
                    sb.append('s');
                } else {
                    sb.append(iArr[i12]);
                    sb.append(']');
                }
                int i21 = b;
                int i22 = (i21 & 112) + (i21 | 112);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
            } else {
                int i25 = i18 & 103;
                int i26 = (i18 ^ 103) | i25;
                int i27 = (i25 & i26) + (i26 | i25);
                int i28 = i27 % 128;
                b = i28;
                int i29 = i27 % 2;
                if (i != 2) {
                    int i30 = (i28 & (-56)) | ((~i28) & 55);
                    int i31 = (i28 & 55) << 1;
                    int i32 = (i30 & i31) + (i31 | i30);
                    int i33 = i32 % 128;
                    a = i33;
                    int i34 = i32 % 2;
                    if (i != 3) {
                        int i35 = i33 & 69;
                        int i36 = ((i33 ^ 69) | i35) << 1;
                        int i37 = -((i33 | 69) & (~i35));
                        int i38 = (i36 & i37) + (i37 | i36);
                        int i39 = i38 % 128;
                        b = i39;
                        int i40 = i38 % 2;
                        if (i != 4) {
                            int i41 = (i39 & (-14)) | ((~i39) & 13);
                            int i42 = -(-((i39 & 13) << 1));
                            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                            a = i43 % 128;
                            if (i43 % 2 == 0) {
                                if (i == 5) {
                                    sb.append('.');
                                    String[] strArr = this.q;
                                    int i44 = a;
                                    int i45 = (-2) - (((i44 ^ 100) + ((i44 & 100) << 1)) ^ (-1));
                                    i2 = i45 % 128;
                                    b = i2;
                                    int i46 = i45 % 2;
                                    str = strArr[i12];
                                    if (str != null) {
                                        int i47 = ((i2 ^ 123) - (~((i2 & 123) << 1))) - 1;
                                        a = i47 % 128;
                                        int i48 = i47 % 2;
                                        sb.append(str);
                                        int i49 = b;
                                        int i50 = i49 & 49;
                                        int i51 = ((((i49 ^ 49) | i50) << 1) - (~(-((i49 | 49) & (~i50))))) - 1;
                                        a = i51 % 128;
                                        int i52 = i51 % 2;
                                    }
                                }
                            } else if (i == 5) {
                                sb.append('.');
                                String[] strArr2 = this.q;
                                int i410 = a;
                                int i411 = (-2) - (((i410 ^ 100) + ((i410 & 100) << 1)) ^ (-1));
                                i2 = i411 % 128;
                                b = i2;
                                int i412 = i411 % 2;
                                str = strArr2[i12];
                                if (str != null) {
                                    int i413 = ((i2 ^ 123) - (~((i2 & 123) << 1))) - 1;
                                    a = i413 % 128;
                                    int i414 = i413 % 2;
                                    sb.append(str);
                                    int i415 = b;
                                    int i53 = i415 & 49;
                                    int i54 = ((((i415 ^ 49) | i53) << 1) - (~(-((i415 | 49) & (~i53))))) - 1;
                                    a = i54 % 128;
                                    int i55 = i54 % 2;
                                }
                            }
                        } else {
                            sb.append('.');
                            String[] strArr3 = this.q;
                            int i416 = a;
                            int i417 = (-2) - (((i416 ^ 100) + ((i416 & 100) << 1)) ^ (-1));
                            i2 = i417 % 128;
                            b = i2;
                            int i418 = i417 % 2;
                            str = strArr3[i12];
                            if (str != null) {
                                int i419 = ((i2 ^ 123) - (~((i2 & 123) << 1))) - 1;
                                a = i419 % 128;
                                int i4110 = i419 % 2;
                                sb.append(str);
                                int i4111 = b;
                                int i56 = i4111 & 49;
                                int i57 = ((((i4111 ^ 49) | i56) << 1) - (~(-((i4111 | 49) & (~i56))))) - 1;
                                a = i57 % 128;
                                int i58 = i57 % 2;
                            }
                        }
                    } else {
                        sb.append('.');
                        String[] strArr4 = this.q;
                        int i4112 = a;
                        int i4113 = (-2) - (((i4112 ^ 100) + ((i4112 & 100) << 1)) ^ (-1));
                        i2 = i4113 % 128;
                        b = i2;
                        int i4114 = i4113 % 2;
                        str = strArr4[i12];
                        if (str != null) {
                            int i4115 = ((i2 ^ 123) - (~((i2 & 123) << 1))) - 1;
                            a = i4115 % 128;
                            int i4116 = i4115 % 2;
                            sb.append(str);
                            int i4117 = b;
                            int i59 = i4117 & 49;
                            int i510 = ((((i4117 ^ 49) | i59) << 1) - (~(-((i4117 | 49) & (~i59))))) - 1;
                            a = i510 % 128;
                            int i511 = i510 % 2;
                        }
                    }
                } else {
                    sb.append('[');
                    iArr = this.r;
                    int i210 = b;
                    i3 = (i210 & 115) + (i210 | 115);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        sb.append(iArr[i12]);
                        sb.append('s');
                    } else {
                        sb.append(iArr[i12]);
                        sb.append(']');
                    }
                    int i211 = b;
                    int i212 = (i211 & 112) + (i211 | 112);
                    int i213 = (i212 ^ (-1)) + (i212 << 1);
                    a = i213 % 128;
                    int i214 = i213 % 2;
                }
            }
            int i60 = ((i12 ^ 58) | (i12 & 58)) << 1;
            int i61 = -(((~i12) & 58) | (i12 & (-59)));
            int i62 = (i60 & i61) + (i61 | i60);
            int i63 = (i62 & 56) | ((~i62) & (-57));
            int i64 = (i62 & (-57)) << 1;
            i12 = ((i63 & i64) << 1) + (i63 ^ i64);
            int i65 = a;
            int i66 = i65 & 125;
            int i67 = (i65 | 125) & (~i66);
            int i68 = -(-(i66 << 1));
            int i69 = (i67 & i68) + (i67 | i68);
            b = i69 % 128;
            int i70 = i69 % 2;
        }
        String string = sb.toString();
        int i71 = a;
        int i72 = i71 & 101;
        int i73 = (i72 - (~(-(-((i71 ^ 101) | i72))))) - 1;
        b = i73 % 128;
        if (i73 % 2 != 0) {
            int i74 = 83 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007b  */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final void A() {
        int i;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        do {
            if (this.i >= this.h) {
                int i6 = a + 121;
                b = i6 % 128;
                int i7 = i6 % 2;
                if (!j(1)) {
                    break;
                }
                char[] cArr = this.g;
                int i8 = this.i;
                int i9 = a;
                int i10 = (i9 ^ 79) + ((i9 & 79) << 1);
                int i11 = i10 % 128;
                b = i11;
                int i12 = i10 % 2;
                i = (i8 & 1) + (i8 | 1);
                this.i = i;
                c2 = cArr[i8];
                int i13 = i11 + 35;
                i2 = i13 % 128;
                a = i2;
                int i14 = i13 % 2;
                if (c2 == '\n') {
                    i3 = i2 + 5;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.j = this.j;
                    } else {
                        int i15 = this.j;
                        int i16 = i15 & 1;
                        int i17 = -(-((i15 ^ 1) | i16));
                        this.j = (i16 ^ i17) + ((i17 & i16) << 1);
                    }
                    int i18 = ((i2 ^ 27) | (i2 & 27)) << 1;
                    int i19 = -(((~i2) & 27) | (i2 & (-28)));
                    int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                    b = i20 % 128;
                    i4 = i20 % 2;
                    this.k = i;
                    if (i4 == 0) {
                        throw null;
                    }
                    return;
                }
            } else {
                char[] cArr2 = this.g;
                int i21 = this.i;
                int i22 = a;
                int i110 = (i22 ^ 79) + ((i22 & 79) << 1);
                int i111 = i110 % 128;
                b = i111;
                int i112 = i110 % 2;
                i = (i21 & 1) + (i21 | 1);
                this.i = i;
                c2 = cArr2[i21];
                int i113 = i111 + 35;
                i2 = i113 % 128;
                a = i2;
                int i114 = i113 % 2;
                if (c2 == '\n') {
                    i3 = i2 + 5;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.j = this.j;
                    } else {
                        int i115 = this.j;
                        int i116 = i115 & 1;
                        int i117 = -(-((i115 ^ 1) | i116));
                        this.j = (i116 ^ i117) + ((i117 & i116) << 1);
                    }
                    int i118 = ((i2 ^ 27) | (i2 & 27)) << 1;
                    int i119 = -(((~i2) & 27) | (i2 & (-28)));
                    int i23 = ((i118 | i119) << 1) - (i118 ^ i119);
                    b = i23 % 128;
                    i4 = i23 % 2;
                    this.k = i;
                    if (i4 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        } while (c2 != '\r');
        int i24 = b;
        int i25 = i24 & 47;
        int i26 = (i24 ^ 47) | i25;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 81;
        int i4 = ((i2 & 81) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.d = 0;
        int[] iArr = this.p;
        int i8 = ((i2 | 123) << 1) - (i2 ^ 123);
        b = i8 % 128;
        int i9 = i8 % 2;
        iArr[0] = 8;
        this.f72o = 1;
        this.e.close();
        int i10 = a;
        int i11 = i10 & 113;
        int i12 = (i10 | 113) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 81;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iG = this.d;
        if (iG == 0) {
            int i4 = i2 & 81;
            int i5 = -(-((i2 ^ 81) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            iG = g();
            int i8 = b;
            int i9 = ((i8 ^ 49) | (i8 & 49)) << 1;
            int i10 = -(((~i8) & 49) | (i8 & (-50)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        if (iG == 1) {
            int i13 = a;
            int i14 = (-2) - (((i13 & 60) + (i13 | 60)) ^ (-1));
            b = i14 % 128;
            z(i14 % 2 == 0 ? 3 : 2);
            this.d = 0;
            return;
        }
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected BEGIN_OBJECT but was ");
        String strF = ivas.gov.bisp.enumeration.p091n.j.F(y());
        int i15 = b + 75;
        a = i15 % 128;
        int i16 = i15 % 2;
        sbW.append(strF);
        sbW.append(m());
        throw new IllegalStateException(sbW.toString());
    }

    public boolean n() {
        int iG;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.d;
        if (i5 == 0) {
            int i6 = (((i4 ^ 55) | (i4 & 55)) << 1) - (((~i4) & 55) | (i4 & (-56)));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                iG = g();
                int i7 = 76 / 0;
            } else {
                iG = g();
            }
            i5 = iG;
        }
        if (i5 == 5) {
            int i8 = a;
            int i9 = i8 ^ 89;
            int i10 = (i8 & 89) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            this.d = 0;
            int[] iArr = this.r;
            int i14 = this.f72o;
            int i15 = i12 & 93;
            int i16 = (((~i15) & (i12 | 93)) - (~(i15 << 1))) - 1;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = iArr[i14];
                iArr[i14] = 0;
            } else {
                int i18 = i14 - 1;
                int i19 = iArr[i18];
                iArr[i18] = (i19 & 1) + (i19 | 1);
            }
            int i20 = i12 & 71;
            int i21 = (i12 | 71) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            return true;
        }
        if (i5 != 6) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected a boolean but was ");
            int iY = y();
            int i25 = a;
            int i26 = (i25 ^ 122) + ((i25 & 122) << 1);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
            sbW.append(m());
            throw new IllegalStateException(sbW.toString());
        }
        int i29 = a;
        int i30 = ((i29 | 66) << 1) - (i29 ^ 66);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        int i32 = i31 % 128;
        b = i32;
        int i33 = i31 % 2;
        this.d = 0;
        int[] iArr2 = this.r;
        int i34 = this.f72o;
        int i35 = ((i34 ^ (-1)) - (~(i34 << 1))) - 1;
        int i36 = iArr2[i35];
        iArr2[i35] = (i36 & 1) + (i36 | 1);
        int i37 = ((i32 | 63) << 1) - (i32 ^ 63);
        a = i37 % 128;
        if (i37 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x016b A[SYNTHETIC] */
    public final boolean j(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = (i10 & (-80)) | ((~i10) & 79);
        int i12 = (i10 & 79) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        char[] cArr = this.g;
        int i16 = this.k;
        int i17 = this.i;
        int i18 = i14 + 55;
        b = i18 % 128;
        if (i18 % 2 != 0) {
            this.k = i16 >>> i17;
        } else {
            int i19 = -i17;
            this.k = (i16 ^ i19) + ((i16 & i19) << 1);
        }
        int i20 = this.h;
        if (i20 != i17) {
            int i21 = i14 & 123;
            int i22 = -(-((i14 ^ 123) | i21));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            int i25 = -i17;
            int i26 = (i20 & i25) + (i20 | i25);
            this.h = i26;
            int i27 = i14 + 97;
            b = i27 % 128;
            if (i27 % 2 != 0) {
                System.arraycopy(cArr, i17, cArr, 1, i26);
            } else {
                System.arraycopy(cArr, i17, cArr, 0, i26);
            }
        } else {
            this.h = 0;
            int i28 = i14 & 39;
            int i29 = (i14 | 39) & (~i28);
            int i30 = i28 << 1;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 3 % 4;
            }
        }
        this.i = 0;
        int i33 = a;
        int i34 = ((i33 | 11) << 1) - (i33 ^ 11);
        b = i34 % 128;
        int i35 = i34 % 2;
        do {
            Reader reader = this.e;
            int i36 = this.h;
            int i37 = a;
            int i38 = ((i37 | 31) << 1) - (i37 ^ 31);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                int length = cArr.length;
                i2 = reader.read(cArr, i36, (((length ^ i36) | (length & i36)) << 1) - (((~length) & i36) | ((~i36) & length)));
                if (i2 == -1) {
                    int i39 = a;
                    int i40 = (((i39 ^ 23) | (i39 & 23)) << 1) - (((~i39) & 23) | (i39 & (-24)));
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    return false;
                }
                int i42 = b;
                i3 = (-2) - ((((i42 | 76) << 1) - (i42 ^ 76)) ^ (-1));
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 == 0) {
                    i5 = this.h << i2;
                } else {
                    int i43 = this.h;
                    int i44 = i43 & i2;
                    int i45 = (i2 ^ i43) | i44;
                    i5 = ((i44 | i45) << 1) - (i45 ^ i44);
                }
                this.h = i5;
                if (this.j == 0) {
                    int i46 = i4 + 119;
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    i6 = this.k;
                    if (i6 == 0) {
                        i7 = (((i4 | 104) << 1) - (i4 ^ 104)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (i5 > 0) {
                            i8 = ((i4 & 77) - (~(i4 | 77))) - 1;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                if (cArr[0] == 65279) {
                                    int i48 = this.i;
                                    int i49 = i48 & 1;
                                    this.i = ((((i48 ^ 1) | i49) << 1) - (~(-((i48 | 1) & (~i49))))) - 1;
                                    int i50 = ((i6 | 1) << 1) - (i6 ^ 1);
                                    int i51 = i4 & 109;
                                    int i52 = i51 + ((i4 ^ 109) | i51);
                                    b = i52 % 128;
                                    int i53 = i52 % 2;
                                    this.k = i50;
                                    int i54 = i ^ 1;
                                    int i55 = -(-((i & 1) << 1));
                                    int i56 = (i54 & i55) + (i55 | i54);
                                    int i57 = (i4 & (-60)) | ((~i4) & 59);
                                    int i58 = (i4 & 59) << 1;
                                    int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                                    b = i59 % 128;
                                    int i60 = i59 % 2;
                                    i = i56;
                                }
                            } else if (cArr[0] == 65279) {
                                int i410 = this.i;
                                int i411 = i410 & 1;
                                this.i = ((((i410 ^ 1) | i411) << 1) - (~(-((i410 | 1) & (~i411))))) - 1;
                                int i510 = ((i6 | 1) << 1) - (i6 ^ 1);
                                int i511 = i4 & 109;
                                int i512 = i511 + ((i4 ^ 109) | i511);
                                b = i512 % 128;
                                int i513 = i512 % 2;
                                this.k = i510;
                                int i514 = i ^ 1;
                                int i515 = -(-((i & 1) << 1));
                                int i516 = (i514 & i515) + (i515 | i514);
                                int i517 = (i4 & (-60)) | ((~i4) & 59);
                                int i518 = (i4 & 59) << 1;
                                int i519 = (i517 ^ i518) + ((i517 & i518) << 1);
                                b = i519 % 128;
                                int i61 = i519 % 2;
                                i = i516;
                            }
                        }
                    }
                }
            } else {
                int length2 = cArr.length;
                int i62 = -i36;
                i2 = reader.read(cArr, i36, (((~i62) & length2) | ((~length2) & i62)) + ((length2 & i62) << 1));
                if (i2 == -1) {
                    int i310 = a;
                    int i412 = (((i310 ^ 23) | (i310 & 23)) << 1) - (((~i310) & 23) | (i310 & (-24)));
                    b = i412 % 128;
                    int i413 = i412 % 2;
                    return false;
                }
                int i414 = b;
                i3 = (-2) - ((((i414 | 76) << 1) - (i414 ^ 76)) ^ (-1));
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 == 0) {
                    i5 = this.h << i2;
                } else {
                    int i415 = this.h;
                    int i416 = i415 & i2;
                    int i417 = (i2 ^ i415) | i416;
                    i5 = ((i416 | i417) << 1) - (i417 ^ i416);
                }
                this.h = i5;
                if (this.j == 0) {
                    int i418 = i4 + 119;
                    b = i418 % 128;
                    int i419 = i418 % 2;
                    i6 = this.k;
                    if (i6 == 0) {
                        i7 = (((i4 | 104) << 1) - (i4 ^ 104)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (i5 > 0) {
                            i8 = ((i4 & 77) - (~(i4 | 77))) - 1;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                if (cArr[0] == 65279) {
                                    int i4110 = this.i;
                                    int i4111 = i4110 & 1;
                                    this.i = ((((i4110 ^ 1) | i4111) << 1) - (~(-((i4110 | 1) & (~i4111))))) - 1;
                                    int i5110 = ((i6 | 1) << 1) - (i6 ^ 1);
                                    int i5111 = i4 & 109;
                                    int i5112 = i5111 + ((i4 ^ 109) | i5111);
                                    b = i5112 % 128;
                                    int i5113 = i5112 % 2;
                                    this.k = i5110;
                                    int i5114 = i ^ 1;
                                    int i5115 = -(-((i & 1) << 1));
                                    int i5116 = (i5114 & i5115) + (i5115 | i5114);
                                    int i5117 = (i4 & (-60)) | ((~i4) & 59);
                                    int i5118 = (i4 & 59) << 1;
                                    int i5119 = (i5117 ^ i5118) + ((i5117 & i5118) << 1);
                                    b = i5119 % 128;
                                    int i63 = i5119 % 2;
                                    i = i5116;
                                }
                            } else if (cArr[0] == 65279) {
                                int i4112 = this.i;
                                int i4113 = i4112 & 1;
                                this.i = ((((i4112 ^ 1) | i4113) << 1) - (~(-((i4112 | 1) & (~i4113))))) - 1;
                                int i51110 = ((i6 | 1) << 1) - (i6 ^ 1);
                                int i51111 = i4 & 109;
                                int i51112 = i51111 + ((i4 ^ 109) | i51111);
                                b = i51112 % 128;
                                int i51113 = i51112 % 2;
                                this.k = i51110;
                                int i51114 = i ^ 1;
                                int i51115 = -(-((i & 1) << 1));
                                int i51116 = (i51114 & i51115) + (i51115 | i51114);
                                int i51117 = (i4 & (-60)) | ((~i4) & 59);
                                int i51118 = (i4 & 59) << 1;
                                int i51119 = (i51117 ^ i51118) + ((i51117 & i51118) << 1);
                                b = i51119 % 128;
                                int i64 = i51119 % 2;
                                i = i51116;
                            }
                        }
                    }
                }
            }
        } while (i5 < i);
        int i65 = b;
        int i66 = i65 + 51;
        a = i66 % 128;
        int i67 = i66 % 2;
        int i68 = ((i65 | 55) << 1) - (i65 ^ 55);
        a = i68 % 128;
        int i69 = i68 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02be  */
    /* JADX WARN: Code duplicated, block: B:104:0x0301 A[LOOP:2: B:96:0x02a6->B:104:0x0301, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0351  */
    /* JADX WARN: Code duplicated, block: B:110:0x035f  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:121:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x02e2 A[EDGE_INSN: B:146:0x02e2->B:103:0x02e2 BREAK  A[LOOP:2: B:96:0x02a6->B:104:0x0301], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0252  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b6  */
    public final int t(boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c3;
        int i17;
        boolean zJ;
        int i18;
        int i19 = 2 % 2;
        int i20 = b;
        int i21 = i20 + 69;
        a = i21 % 128;
        int i22 = i21 % 2;
        char[] cArr = this.g;
        int i23 = this.i;
        int i24 = this.h;
        int i25 = i20 & 109;
        int i26 = ((i20 ^ 109) | i25) << 1;
        int i27 = -((i20 | 109) & (~i25));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        a = i28 % 128;
        int i29 = i28 % 2;
        while (true) {
            Object obj = null;
            if (i23 == i24) {
                int i30 = b + 125;
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    this.i = i23;
                    if (!j(1)) {
                        break;
                    }
                    i23 = this.i;
                    i24 = this.h;
                    int i31 = (-2) - ((a + 68) ^ (-1));
                    b = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    this.i = i23;
                    if (!j(1)) {
                        break;
                    }
                    i23 = this.i;
                    i24 = this.h;
                    int i33 = (-2) - ((a + 68) ^ (-1));
                    b = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            int i35 = ((i23 ^ 2) + ((i23 & 2) << 1)) - 1;
            char c4 = cArr[i23];
            int i36 = b;
            int i37 = i36 + 15;
            int i38 = i37 % 128;
            a = i38;
            int i39 = i37 % 2;
            if (c4 == '\n') {
                int i40 = ((i36 | 19) << 1) - (i36 ^ 19);
                a = i40 % 128;
                int i41 = i40 % 2;
                int i42 = this.j;
                int i43 = (i42 & 2) + (i42 | 2);
                this.j = (i43 ^ (-1)) + (i43 << 1);
                this.k = i35;
                int i44 = i36 + 101;
                a = i44 % 128;
                if (i44 % 2 == 0) {
                    int i45 = 4 / 2;
                }
            } else if (c4 != ' ') {
                int i46 = i38 + 123;
                int i47 = i46 % 128;
                b = i47;
                if (i46 % 2 != 0) {
                    if (c4 != '`') {
                        if (c4 != '\t') {
                            i = i47 + 41;
                            i2 = i % 128;
                            a = i2;
                            if (i % 2 == 0) {
                                if (c4 == '=') {
                                    this.i = i35;
                                    if (i35 == i24) {
                                        i17 = i2 + 55;
                                        b = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            this.i = i35 % 1;
                                            zJ = j(5);
                                        } else {
                                            int i48 = -(~i35);
                                            this.i = ((-2) & i48) + (i48 | (-2));
                                            zJ = j(2);
                                        }
                                        this.i -= -1;
                                        if (!zJ) {
                                            int i49 = b;
                                            int i50 = (((i49 | 114) << 1) - (i49 ^ 114)) - 1;
                                            a = i50 % 128;
                                            int i51 = i50 % 2;
                                            i18 = (-2) - ((i49 + 118) ^ (-1));
                                            a = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                return c4;
                                            }
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                    f();
                                    i5 = this.i;
                                    c2 = cArr[i5];
                                    int i52 = b;
                                    int i53 = i52 & 43;
                                    int i54 = (i52 ^ 43) | i53;
                                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                                    i6 = i55 % 128;
                                    a = i6;
                                    int i56 = i55 % 2;
                                    if (c2 != '*') {
                                        int i57 = i6 & 9;
                                        int i58 = (i6 ^ 9) | i57;
                                        i7 = (i57 ^ i58) + ((i58 & i57) << 1);
                                        i8 = i7 % 128;
                                        b = i8;
                                        if (i7 % 2 != 0) {
                                            if (c2 != '%') {
                                                int i59 = ((i8 & 120) + (i8 | 120)) - 1;
                                                a = i59 % 128;
                                                int i60 = i59 % 2;
                                                return c4;
                                            }
                                            int i61 = i5 & 1;
                                            int i62 = -(-((i5 ^ 1) | i61));
                                            this.i = (i61 & i62) + (i62 | i61);
                                            A();
                                            int i63 = b;
                                            int i64 = ((i63 | 79) << 1) - (i63 ^ 79);
                                            a = i64 % 128;
                                            int i65 = i64 % 2;
                                            i23 = this.i;
                                            i24 = this.h;
                                            int i66 = i63 & 79;
                                            int i67 = (i66 - (~(-(-((i63 ^ 79) | i66))))) - 1;
                                            a = i67 % 128;
                                            int i68 = i67 % 2;
                                        } else {
                                            if (c2 != '/') {
                                                int i510 = ((i8 & 120) + (i8 | 120)) - 1;
                                                a = i510 % 128;
                                                int i69 = i510 % 2;
                                                return c4;
                                            }
                                            int i610 = i5 & 1;
                                            int i611 = -(-((i5 ^ 1) | i610));
                                            this.i = (i610 & i611) + (i611 | i610);
                                            A();
                                            int i612 = b;
                                            int i613 = ((i612 | 79) << 1) - (i612 ^ 79);
                                            a = i613 % 128;
                                            int i614 = i613 % 2;
                                            i23 = this.i;
                                            i24 = this.h;
                                            int i615 = i612 & 79;
                                            int i616 = (i615 - (~(-(-((i612 ^ 79) | i615))))) - 1;
                                            a = i616 % 128;
                                            int i617 = i616 % 2;
                                        }
                                    } else {
                                        int i70 = i5 & 1;
                                        this.i = ((((i5 ^ 1) | i70) << 1) - (~(-((i5 | 1) & (~i70))))) - 1;
                                        int i71 = (i6 & 14) + (i6 | 14);
                                        i9 = (i71 ^ (-1)) + (i71 << 1);
                                        b = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            int i72 = 5 % 3;
                                        }
                                        while (true) {
                                            i10 = this.i;
                                            i11 = this.h;
                                            int i73 = a;
                                            int i74 = i73 & 3;
                                            i12 = (((i73 ^ 3) | i74) << 1) - ((i73 | 3) & (~i74));
                                            b = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                i13 = i10 & 2;
                                                if (i13 + ((i10 ^ 2) | i13) > i11) {
                                                    if (!j(2)) {
                                                        int i75 = a;
                                                        int i76 = i75 & 55;
                                                        int i77 = ((i75 ^ 55) | i76) << 1;
                                                        int i78 = -((~i76) & (i75 | 55));
                                                        int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                                                        b = i79 % 128;
                                                        int i80 = i79 % 2;
                                                        int i81 = i75 + 77;
                                                        b = i81 % 128;
                                                        int i82 = i81 % 2;
                                                        D("Unterminated comment");
                                                        throw null;
                                                    }
                                                }
                                            } else if (i10 * 2 > i11) {
                                                if (!j(2)) {
                                                    int i710 = a;
                                                    int i711 = i710 & 55;
                                                    int i712 = ((i710 ^ 55) | i711) << 1;
                                                    int i713 = -((~i711) & (i710 | 55));
                                                    int i714 = ((i712 | i713) << 1) - (i712 ^ i713);
                                                    b = i714 % 128;
                                                    int i83 = i714 % 2;
                                                    int i84 = i710 + 77;
                                                    b = i84 % 128;
                                                    int i85 = i84 % 2;
                                                    D("Unterminated comment");
                                                    throw null;
                                                }
                                            }
                                            char[] cArr2 = this.g;
                                            int i86 = this.i;
                                            int i87 = b;
                                            int i88 = i87 & 95;
                                            int i89 = -(-(i87 | 95));
                                            i14 = ((i88 | i89) << 1) - (i89 ^ i88);
                                            int i90 = i14 % 128;
                                            a = i90;
                                            if (i14 % 2 == 0 ? cArr2[i86] != '\n' : cArr2[i86] != '4') {
                                                i15 = 0;
                                                while (true) {
                                                    if (i15 >= 2) {
                                                        int i91 = b;
                                                        int i92 = i91 | 53;
                                                        int i93 = ((i92 << 1) - (~(-(i92 & (~(i91 & 53)))))) - 1;
                                                        a = i93 % 128;
                                                        int i94 = i93 % 2;
                                                        int i95 = this.i;
                                                        int i96 = (i95 | 2) << 1;
                                                        int i97 = -(((~i95) & 2) | (i95 & (-3)));
                                                        i23 = (i97 | i96) + (i96 & i97);
                                                        i24 = this.h;
                                                        int i98 = (i91 ^ 35) + ((i91 & 35) << 1);
                                                        a = i98 % 128;
                                                        int i99 = i98 % 2;
                                                        break;
                                                    }
                                                    int i100 = a;
                                                    i16 = (i100 & 29) + (i100 | 29);
                                                    int i101 = i16 % 128;
                                                    b = i101;
                                                    if (i16 % 2 != 0) {
                                                        c3 = this.g[this.i * i15];
                                                    } else {
                                                        char[] cArr3 = this.g;
                                                        int i102 = this.i;
                                                        int i103 = i102 & i15;
                                                        c3 = cArr3[(((i102 ^ i15) | i103) << 1) - ((i102 | i15) & (~i103))];
                                                    }
                                                    int i104 = i101 ^ 19;
                                                    int i105 = (((i101 & 19) | i104) << 1) - i104;
                                                    a = i105 % 128;
                                                    int i106 = i105 % 2;
                                                    if (c3 != "*/".charAt(i15)) {
                                                        break;
                                                    }
                                                    int i107 = i15 + 67;
                                                    i15 = (i107 | (-66)) + (i107 & (-66));
                                                    int i108 = b;
                                                    int i109 = i108 & 49;
                                                    int i110 = (i108 | 49) & (~i109);
                                                    int i111 = i109 << 1;
                                                    int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                                                    a = i112 % 128;
                                                    int i113 = i112 % 2;
                                                }
                                            } else {
                                                int i114 = (i90 ^ 45) + ((i90 & 45) << 1);
                                                int i115 = i114 % 128;
                                                b = i115;
                                                if (i114 % 2 != 0) {
                                                    this.j = this.j;
                                                    this.k = i86 / 0;
                                                } else {
                                                    int i116 = this.j;
                                                    int i117 = i116 & 1;
                                                    int i118 = ((i116 ^ 1) | i117) << 1;
                                                    int i119 = -((i116 | 1) & (~i117));
                                                    this.j = ((i118 | i119) << 1) - (i119 ^ i118);
                                                    int i120 = i86 & 1;
                                                    int i121 = (i86 | 1) & (~i120);
                                                    int i122 = -(-(i120 << 1));
                                                    this.k = (i121 & i122) + (i122 | i121);
                                                }
                                                int i123 = i115 ^ 99;
                                                int i124 = (i115 & 99) << 1;
                                                int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                                                a = i125 % 128;
                                                int i126 = i125 % 2;
                                            }
                                            int i127 = this.i;
                                            this.i = (((i127 & (-2)) | ((~i127) & 1)) - (~((i127 & 1) << 1))) - 1;
                                            int i128 = b;
                                            int i129 = i128 & 7;
                                            int i130 = ((i128 | 7) & (~i129)) + (i129 << 1);
                                            a = i130 % 128;
                                            int i131 = i130 % 2;
                                        }
                                    }
                                } else {
                                    if (c4 == '#') {
                                        this.i = i35;
                                        i3 = ((((i2 ^ 29) | (i2 & 29)) << 1) - (~(-((i2 & (-30)) | ((~i2) & 29))))) - 1;
                                        b = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            return c4;
                                        }
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i4 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        this.i = i35;
                                        f();
                                        A();
                                        throw null;
                                    }
                                    this.i = i35;
                                    f();
                                    A();
                                    i23 = this.i;
                                    int i132 = b;
                                    int i133 = i132 & 107;
                                    int i134 = ((((i132 ^ 107) | i133) << 1) - (~(-((~i133) & (i132 | 107))))) - 1;
                                    a = i134 % 128;
                                    int i135 = i134 % 2;
                                    i24 = this.h;
                                    int i136 = i132 ^ 101;
                                    int i137 = -(-((i132 & 101) << 1));
                                    int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                                    a = i138 % 128;
                                    int i139 = i138 % 2;
                                }
                            } else if (c4 == '/') {
                                this.i = i35;
                                if (i35 == i24) {
                                    i17 = i2 + 55;
                                    b = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        this.i = i35 % 1;
                                        zJ = j(5);
                                    } else {
                                        int i410 = -(~i35);
                                        this.i = ((-2) & i410) + (i410 | (-2));
                                        zJ = j(2);
                                    }
                                    this.i -= -1;
                                    if (!zJ) {
                                        int i411 = b;
                                        int i511 = (((i411 | 114) << 1) - (i411 ^ 114)) - 1;
                                        a = i511 % 128;
                                        int i512 = i511 % 2;
                                        i18 = (-2) - ((i411 + 118) ^ (-1));
                                        a = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            return c4;
                                        }
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                                f();
                                i5 = this.i;
                                c2 = cArr[i5];
                                int i513 = b;
                                int i514 = i513 & 43;
                                int i515 = (i513 ^ 43) | i514;
                                int i516 = ((i514 | i515) << 1) - (i515 ^ i514);
                                i6 = i516 % 128;
                                a = i6;
                                int i517 = i516 % 2;
                                if (c2 != '*') {
                                    int i518 = i6 & 9;
                                    int i519 = (i6 ^ 9) | i518;
                                    i7 = (i518 ^ i519) + ((i519 & i518) << 1);
                                    i8 = i7 % 128;
                                    b = i8;
                                    if (i7 % 2 != 0) {
                                        if (c2 != '%') {
                                            int i5110 = ((i8 & 120) + (i8 | 120)) - 1;
                                            a = i5110 % 128;
                                            int i618 = i5110 % 2;
                                            return c4;
                                        }
                                        int i619 = i5 & 1;
                                        int i6110 = -(-((i5 ^ 1) | i619));
                                        this.i = (i619 & i6110) + (i6110 | i619);
                                        A();
                                        int i6111 = b;
                                        int i6112 = ((i6111 | 79) << 1) - (i6111 ^ 79);
                                        a = i6112 % 128;
                                        int i6113 = i6112 % 2;
                                        i23 = this.i;
                                        i24 = this.h;
                                        int i6114 = i6111 & 79;
                                        int i6115 = (i6114 - (~(-(-((i6111 ^ 79) | i6114))))) - 1;
                                        a = i6115 % 128;
                                        int i6116 = i6115 % 2;
                                    } else {
                                        if (c2 != '/') {
                                            int i5111 = ((i8 & 120) + (i8 | 120)) - 1;
                                            a = i5111 % 128;
                                            int i6117 = i5111 % 2;
                                            return c4;
                                        }
                                        int i6118 = i5 & 1;
                                        int i6119 = -(-((i5 ^ 1) | i6118));
                                        this.i = (i6118 & i6119) + (i6119 | i6118);
                                        A();
                                        int i61110 = b;
                                        int i61111 = ((i61110 | 79) << 1) - (i61110 ^ 79);
                                        a = i61111 % 128;
                                        int i61112 = i61111 % 2;
                                        i23 = this.i;
                                        i24 = this.h;
                                        int i61113 = i61110 & 79;
                                        int i61114 = (i61113 - (~(-(-((i61110 ^ 79) | i61113))))) - 1;
                                        a = i61114 % 128;
                                        int i61115 = i61114 % 2;
                                    }
                                } else {
                                    int i715 = i5 & 1;
                                    this.i = ((((i5 ^ 1) | i715) << 1) - (~(-((i5 | 1) & (~i715))))) - 1;
                                    int i716 = (i6 & 14) + (i6 | 14);
                                    i9 = (i716 ^ (-1)) + (i716 << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i717 = 5 % 3;
                                    }
                                    while (true) {
                                        i10 = this.i;
                                        i11 = this.h;
                                        int i718 = a;
                                        int i719 = i718 & 3;
                                        i12 = (((i718 ^ 3) | i719) << 1) - ((i718 | 3) & (~i719));
                                        b = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            i13 = i10 & 2;
                                            if (i13 + ((i10 ^ 2) | i13) > i11) {
                                                if (!j(2)) {
                                                    int i7110 = a;
                                                    int i7111 = i7110 & 55;
                                                    int i7112 = ((i7110 ^ 55) | i7111) << 1;
                                                    int i7113 = -((~i7111) & (i7110 | 55));
                                                    int i7114 = ((i7112 | i7113) << 1) - (i7112 ^ i7113);
                                                    b = i7114 % 128;
                                                    int i810 = i7114 % 2;
                                                    int i811 = i7110 + 77;
                                                    b = i811 % 128;
                                                    int i812 = i811 % 2;
                                                    D("Unterminated comment");
                                                    throw null;
                                                }
                                            }
                                        } else if (i10 * 2 > i11) {
                                            if (!j(2)) {
                                                int i7115 = a;
                                                int i7116 = i7115 & 55;
                                                int i7117 = ((i7115 ^ 55) | i7116) << 1;
                                                int i7118 = -((~i7116) & (i7115 | 55));
                                                int i7119 = ((i7117 | i7118) << 1) - (i7117 ^ i7118);
                                                b = i7119 % 128;
                                                int i813 = i7119 % 2;
                                                int i814 = i7115 + 77;
                                                b = i814 % 128;
                                                int i815 = i814 % 2;
                                                D("Unterminated comment");
                                                throw null;
                                            }
                                        }
                                        char[] cArr4 = this.g;
                                        int i816 = this.i;
                                        int i817 = b;
                                        int i818 = i817 & 95;
                                        int i819 = -(-(i817 | 95));
                                        i14 = ((i818 | i819) << 1) - (i819 ^ i818);
                                        int i910 = i14 % 128;
                                        a = i910;
                                        if (i14 % 2 == 0) {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 >= 2) {
                                                    int i911 = b;
                                                    int i912 = i911 | 53;
                                                    int i913 = ((i912 << 1) - (~(-(i912 & (~(i911 & 53)))))) - 1;
                                                    a = i913 % 128;
                                                    int i914 = i913 % 2;
                                                    int i915 = this.i;
                                                    int i916 = (i915 | 2) << 1;
                                                    int i917 = -(((~i915) & 2) | (i915 & (-3)));
                                                    i23 = (i917 | i916) + (i916 & i917);
                                                    i24 = this.h;
                                                    int i918 = (i911 ^ 35) + ((i911 & 35) << 1);
                                                    a = i918 % 128;
                                                    int i919 = i918 % 2;
                                                    break;
                                                    break;
                                                }
                                                int i1010 = a;
                                                i16 = (i1010 & 29) + (i1010 | 29);
                                                int i1011 = i16 % 128;
                                                b = i1011;
                                                if (i16 % 2 != 0) {
                                                    c3 = this.g[this.i * i15];
                                                } else {
                                                    char[] cArr5 = this.g;
                                                    int i1012 = this.i;
                                                    int i1013 = i1012 & i15;
                                                    c3 = cArr5[(((i1012 ^ i15) | i1013) << 1) - ((i1012 | i15) & (~i1013))];
                                                }
                                                int i1014 = i1011 ^ 19;
                                                int i1015 = (((i1011 & 19) | i1014) << 1) - i1014;
                                                a = i1015 % 128;
                                                int i1016 = i1015 % 2;
                                                if (c3 != "*/".charAt(i15)) {
                                                    break;
                                                    break;
                                                }
                                                int i1017 = i15 + 67;
                                                i15 = (i1017 | (-66)) + (i1017 & (-66));
                                                int i1018 = b;
                                                int i1019 = i1018 & 49;
                                                int i1110 = (i1018 | 49) & (~i1019);
                                                int i1111 = i1019 << 1;
                                                int i1112 = ((i1110 | i1111) << 1) - (i1110 ^ i1111);
                                                a = i1112 % 128;
                                                int i1113 = i1112 % 2;
                                            }
                                            int i1210 = this.i;
                                            this.i = (((i1210 & (-2)) | ((~i1210) & 1)) - (~((i1210 & 1) << 1))) - 1;
                                            int i1211 = b;
                                            int i1212 = i1211 & 7;
                                            int i1310 = ((i1211 | 7) & (~i1212)) + (i1212 << 1);
                                            a = i1310 % 128;
                                            int i1311 = i1310 % 2;
                                        } else {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 >= 2) {
                                                    int i9110 = b;
                                                    int i9111 = i9110 | 53;
                                                    int i9112 = ((i9111 << 1) - (~(-(i9111 & (~(i9110 & 53)))))) - 1;
                                                    a = i9112 % 128;
                                                    int i9113 = i9112 % 2;
                                                    int i9114 = this.i;
                                                    int i9115 = (i9114 | 2) << 1;
                                                    int i9116 = -(((~i9114) & 2) | (i9114 & (-3)));
                                                    i23 = (i9116 | i9115) + (i9115 & i9116);
                                                    i24 = this.h;
                                                    int i9117 = (i9110 ^ 35) + ((i9110 & 35) << 1);
                                                    a = i9117 % 128;
                                                    int i9118 = i9117 % 2;
                                                    break;
                                                    break;
                                                }
                                                int i10110 = a;
                                                i16 = (i10110 & 29) + (i10110 | 29);
                                                int i10111 = i16 % 128;
                                                b = i10111;
                                                if (i16 % 2 != 0) {
                                                    c3 = this.g[this.i * i15];
                                                } else {
                                                    char[] cArr6 = this.g;
                                                    int i10112 = this.i;
                                                    int i10113 = i10112 & i15;
                                                    c3 = cArr6[(((i10112 ^ i15) | i10113) << 1) - ((i10112 | i15) & (~i10113))];
                                                }
                                                int i10114 = i10111 ^ 19;
                                                int i10115 = (((i10111 & 19) | i10114) << 1) - i10114;
                                                a = i10115 % 128;
                                                int i10116 = i10115 % 2;
                                                if (c3 != "*/".charAt(i15)) {
                                                    break;
                                                    break;
                                                }
                                                int i10117 = i15 + 67;
                                                i15 = (i10117 | (-66)) + (i10117 & (-66));
                                                int i10118 = b;
                                                int i10119 = i10118 & 49;
                                                int i1114 = (i10118 | 49) & (~i10119);
                                                int i1115 = i10119 << 1;
                                                int i1116 = ((i1114 | i1115) << 1) - (i1114 ^ i1115);
                                                a = i1116 % 128;
                                                int i1117 = i1116 % 2;
                                            }
                                            int i1213 = this.i;
                                            this.i = (((i1213 & (-2)) | ((~i1213) & 1)) - (~((i1213 & 1) << 1))) - 1;
                                            int i1214 = b;
                                            int i1215 = i1214 & 7;
                                            int i1312 = ((i1214 | 7) & (~i1215)) + (i1215 << 1);
                                            a = i1312 % 128;
                                            int i1313 = i1312 % 2;
                                        }
                                    }
                                }
                            } else {
                                if (c4 == '#') {
                                    this.i = i35;
                                    i3 = ((((i2 ^ 29) | (i2 & 29)) << 1) - (~(-((i2 & (-30)) | ((~i2) & 29))))) - 1;
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        return c4;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                i4 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    this.i = i35;
                                    f();
                                    A();
                                    throw null;
                                }
                                this.i = i35;
                                f();
                                A();
                                i23 = this.i;
                                int i1314 = b;
                                int i1315 = i1314 & 107;
                                int i1316 = ((((i1314 ^ 107) | i1315) << 1) - (~(-((~i1315) & (i1314 | 107))))) - 1;
                                a = i1316 % 128;
                                int i1317 = i1316 % 2;
                                i24 = this.h;
                                int i1318 = i1314 ^ 101;
                                int i1319 = -(-((i1314 & 101) << 1));
                                int i1320 = ((i1318 | i1319) << 1) - (i1319 ^ i1318);
                                a = i1320 % 128;
                                int i1321 = i1320 % 2;
                            }
                        }
                    }
                } else if (c4 != '\r') {
                    if (c4 != '\t') {
                        i = i47 + 41;
                        i2 = i % 128;
                        a = i2;
                        if (i % 2 == 0) {
                            if (c4 == '=') {
                                this.i = i35;
                                if (i35 == i24) {
                                    i17 = i2 + 55;
                                    b = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        this.i = i35 % 1;
                                        zJ = j(5);
                                    } else {
                                        int i412 = -(~i35);
                                        this.i = ((-2) & i412) + (i412 | (-2));
                                        zJ = j(2);
                                    }
                                    this.i -= -1;
                                    if (!zJ) {
                                        int i413 = b;
                                        int i5112 = (((i413 | 114) << 1) - (i413 ^ 114)) - 1;
                                        a = i5112 % 128;
                                        int i5113 = i5112 % 2;
                                        i18 = (-2) - ((i413 + 118) ^ (-1));
                                        a = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            return c4;
                                        }
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                                f();
                                i5 = this.i;
                                c2 = cArr[i5];
                                int i5114 = b;
                                int i5115 = i5114 & 43;
                                int i5116 = (i5114 ^ 43) | i5115;
                                int i5117 = ((i5115 | i5116) << 1) - (i5116 ^ i5115);
                                i6 = i5117 % 128;
                                a = i6;
                                int i5118 = i5117 % 2;
                                if (c2 != '*') {
                                    int i5119 = i6 & 9;
                                    int i5120 = (i6 ^ 9) | i5119;
                                    i7 = (i5119 ^ i5120) + ((i5120 & i5119) << 1);
                                    i8 = i7 % 128;
                                    b = i8;
                                    if (i7 % 2 != 0) {
                                        if (c2 != '%') {
                                            int i51110 = ((i8 & 120) + (i8 | 120)) - 1;
                                            a = i51110 % 128;
                                            int i61116 = i51110 % 2;
                                            return c4;
                                        }
                                        int i61117 = i5 & 1;
                                        int i61118 = -(-((i5 ^ 1) | i61117));
                                        this.i = (i61117 & i61118) + (i61118 | i61117);
                                        A();
                                        int i61119 = b;
                                        int i611110 = ((i61119 | 79) << 1) - (i61119 ^ 79);
                                        a = i611110 % 128;
                                        int i611111 = i611110 % 2;
                                        i23 = this.i;
                                        i24 = this.h;
                                        int i611112 = i61119 & 79;
                                        int i611113 = (i611112 - (~(-(-((i61119 ^ 79) | i611112))))) - 1;
                                        a = i611113 % 128;
                                        int i611114 = i611113 % 2;
                                    } else {
                                        if (c2 != '/') {
                                            int i51111 = ((i8 & 120) + (i8 | 120)) - 1;
                                            a = i51111 % 128;
                                            int i611115 = i51111 % 2;
                                            return c4;
                                        }
                                        int i611116 = i5 & 1;
                                        int i611117 = -(-((i5 ^ 1) | i611116));
                                        this.i = (i611116 & i611117) + (i611117 | i611116);
                                        A();
                                        int i611118 = b;
                                        int i611119 = ((i611118 | 79) << 1) - (i611118 ^ 79);
                                        a = i611119 % 128;
                                        int i6111110 = i611119 % 2;
                                        i23 = this.i;
                                        i24 = this.h;
                                        int i6111111 = i611118 & 79;
                                        int i6111112 = (i6111111 - (~(-(-((i611118 ^ 79) | i6111111))))) - 1;
                                        a = i6111112 % 128;
                                        int i6111113 = i6111112 % 2;
                                    }
                                } else {
                                    int i7120 = i5 & 1;
                                    this.i = ((((i5 ^ 1) | i7120) << 1) - (~(-((i5 | 1) & (~i7120))))) - 1;
                                    int i7121 = (i6 & 14) + (i6 | 14);
                                    i9 = (i7121 ^ (-1)) + (i7121 << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i7122 = 5 % 3;
                                    }
                                    while (true) {
                                        i10 = this.i;
                                        i11 = this.h;
                                        int i7123 = a;
                                        int i7124 = i7123 & 3;
                                        i12 = (((i7123 ^ 3) | i7124) << 1) - ((i7123 | 3) & (~i7124));
                                        b = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            i13 = i10 & 2;
                                            if (i13 + ((i10 ^ 2) | i13) > i11) {
                                                if (!j(2)) {
                                                    int i71110 = a;
                                                    int i71111 = i71110 & 55;
                                                    int i71112 = ((i71110 ^ 55) | i71111) << 1;
                                                    int i71113 = -((~i71111) & (i71110 | 55));
                                                    int i71114 = ((i71112 | i71113) << 1) - (i71112 ^ i71113);
                                                    b = i71114 % 128;
                                                    int i8110 = i71114 % 2;
                                                    int i8111 = i71110 + 77;
                                                    b = i8111 % 128;
                                                    int i8112 = i8111 % 2;
                                                    D("Unterminated comment");
                                                    throw null;
                                                }
                                            }
                                        } else if (i10 * 2 > i11) {
                                            if (!j(2)) {
                                                int i71115 = a;
                                                int i71116 = i71115 & 55;
                                                int i71117 = ((i71115 ^ 55) | i71116) << 1;
                                                int i71118 = -((~i71116) & (i71115 | 55));
                                                int i71119 = ((i71117 | i71118) << 1) - (i71117 ^ i71118);
                                                b = i71119 % 128;
                                                int i8113 = i71119 % 2;
                                                int i8114 = i71115 + 77;
                                                b = i8114 % 128;
                                                int i8115 = i8114 % 2;
                                                D("Unterminated comment");
                                                throw null;
                                            }
                                        }
                                        char[] cArr7 = this.g;
                                        int i8116 = this.i;
                                        int i8117 = b;
                                        int i8118 = i8117 & 95;
                                        int i8119 = -(-(i8117 | 95));
                                        i14 = ((i8118 | i8119) << 1) - (i8119 ^ i8118);
                                        int i9119 = i14 % 128;
                                        a = i9119;
                                        if (i14 % 2 == 0) {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 >= 2) {
                                                    int i91110 = b;
                                                    int i91111 = i91110 | 53;
                                                    int i91112 = ((i91111 << 1) - (~(-(i91111 & (~(i91110 & 53)))))) - 1;
                                                    a = i91112 % 128;
                                                    int i91113 = i91112 % 2;
                                                    int i91114 = this.i;
                                                    int i91115 = (i91114 | 2) << 1;
                                                    int i91116 = -(((~i91114) & 2) | (i91114 & (-3)));
                                                    i23 = (i91116 | i91115) + (i91115 & i91116);
                                                    i24 = this.h;
                                                    int i91117 = (i91110 ^ 35) + ((i91110 & 35) << 1);
                                                    a = i91117 % 128;
                                                    int i91118 = i91117 % 2;
                                                    break;
                                                    break;
                                                }
                                                int i101110 = a;
                                                i16 = (i101110 & 29) + (i101110 | 29);
                                                int i101111 = i16 % 128;
                                                b = i101111;
                                                if (i16 % 2 != 0) {
                                                    c3 = this.g[this.i * i15];
                                                } else {
                                                    char[] cArr8 = this.g;
                                                    int i101112 = this.i;
                                                    int i101113 = i101112 & i15;
                                                    c3 = cArr8[(((i101112 ^ i15) | i101113) << 1) - ((i101112 | i15) & (~i101113))];
                                                }
                                                int i101114 = i101111 ^ 19;
                                                int i101115 = (((i101111 & 19) | i101114) << 1) - i101114;
                                                a = i101115 % 128;
                                                int i101116 = i101115 % 2;
                                                if (c3 != "*/".charAt(i15)) {
                                                    break;
                                                    break;
                                                }
                                                int i101117 = i15 + 67;
                                                i15 = (i101117 | (-66)) + (i101117 & (-66));
                                                int i101118 = b;
                                                int i101119 = i101118 & 49;
                                                int i1118 = (i101118 | 49) & (~i101119);
                                                int i1119 = i101119 << 1;
                                                int i11110 = ((i1118 | i1119) << 1) - (i1118 ^ i1119);
                                                a = i11110 % 128;
                                                int i11111 = i11110 % 2;
                                            }
                                            int i1216 = this.i;
                                            this.i = (((i1216 & (-2)) | ((~i1216) & 1)) - (~((i1216 & 1) << 1))) - 1;
                                            int i1217 = b;
                                            int i1218 = i1217 & 7;
                                            int i13110 = ((i1217 | 7) & (~i1218)) + (i1218 << 1);
                                            a = i13110 % 128;
                                            int i13111 = i13110 % 2;
                                        } else {
                                            i15 = 0;
                                            while (true) {
                                                if (i15 >= 2) {
                                                    int i91119 = b;
                                                    int i911110 = i91119 | 53;
                                                    int i911111 = ((i911110 << 1) - (~(-(i911110 & (~(i91119 & 53)))))) - 1;
                                                    a = i911111 % 128;
                                                    int i911112 = i911111 % 2;
                                                    int i911113 = this.i;
                                                    int i911114 = (i911113 | 2) << 1;
                                                    int i911115 = -(((~i911113) & 2) | (i911113 & (-3)));
                                                    i23 = (i911115 | i911114) + (i911114 & i911115);
                                                    i24 = this.h;
                                                    int i911116 = (i91119 ^ 35) + ((i91119 & 35) << 1);
                                                    a = i911116 % 128;
                                                    int i911117 = i911116 % 2;
                                                    break;
                                                    break;
                                                }
                                                int i1011110 = a;
                                                i16 = (i1011110 & 29) + (i1011110 | 29);
                                                int i1011111 = i16 % 128;
                                                b = i1011111;
                                                if (i16 % 2 != 0) {
                                                    c3 = this.g[this.i * i15];
                                                } else {
                                                    char[] cArr9 = this.g;
                                                    int i1011112 = this.i;
                                                    int i1011113 = i1011112 & i15;
                                                    c3 = cArr9[(((i1011112 ^ i15) | i1011113) << 1) - ((i1011112 | i15) & (~i1011113))];
                                                }
                                                int i1011114 = i1011111 ^ 19;
                                                int i1011115 = (((i1011111 & 19) | i1011114) << 1) - i1011114;
                                                a = i1011115 % 128;
                                                int i1011116 = i1011115 % 2;
                                                if (c3 != "*/".charAt(i15)) {
                                                    break;
                                                    break;
                                                }
                                                int i1011117 = i15 + 67;
                                                i15 = (i1011117 | (-66)) + (i1011117 & (-66));
                                                int i1011118 = b;
                                                int i1011119 = i1011118 & 49;
                                                int i11112 = (i1011118 | 49) & (~i1011119);
                                                int i11113 = i1011119 << 1;
                                                int i11114 = ((i11112 | i11113) << 1) - (i11112 ^ i11113);
                                                a = i11114 % 128;
                                                int i11115 = i11114 % 2;
                                            }
                                            int i1219 = this.i;
                                            this.i = (((i1219 & (-2)) | ((~i1219) & 1)) - (~((i1219 & 1) << 1))) - 1;
                                            int i12110 = b;
                                            int i12111 = i12110 & 7;
                                            int i13112 = ((i12110 | 7) & (~i12111)) + (i12111 << 1);
                                            a = i13112 % 128;
                                            int i13113 = i13112 % 2;
                                        }
                                    }
                                }
                            } else {
                                if (c4 == '#') {
                                    this.i = i35;
                                    i3 = ((((i2 ^ 29) | (i2 & 29)) << 1) - (~(-((i2 & (-30)) | ((~i2) & 29))))) - 1;
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        return c4;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                i4 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    this.i = i35;
                                    f();
                                    A();
                                    throw null;
                                }
                                this.i = i35;
                                f();
                                A();
                                i23 = this.i;
                                int i13114 = b;
                                int i13115 = i13114 & 107;
                                int i13116 = ((((i13114 ^ 107) | i13115) << 1) - (~(-((~i13115) & (i13114 | 107))))) - 1;
                                a = i13116 % 128;
                                int i13117 = i13116 % 2;
                                i24 = this.h;
                                int i13118 = i13114 ^ 101;
                                int i13119 = -(-((i13114 & 101) << 1));
                                int i1322 = ((i13118 | i13119) << 1) - (i13119 ^ i13118);
                                a = i1322 % 128;
                                int i1323 = i1322 % 2;
                            }
                        } else if (c4 == '/') {
                            this.i = i35;
                            if (i35 == i24) {
                                i17 = i2 + 55;
                                b = i17 % 128;
                                if (i17 % 2 != 0) {
                                    this.i = i35 % 1;
                                    zJ = j(5);
                                } else {
                                    int i414 = -(~i35);
                                    this.i = ((-2) & i414) + (i414 | (-2));
                                    zJ = j(2);
                                }
                                this.i -= -1;
                                if (!zJ) {
                                    int i415 = b;
                                    int i51112 = (((i415 | 114) << 1) - (i415 ^ 114)) - 1;
                                    a = i51112 % 128;
                                    int i51113 = i51112 % 2;
                                    i18 = (-2) - ((i415 + 118) ^ (-1));
                                    a = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        return c4;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                            f();
                            i5 = this.i;
                            c2 = cArr[i5];
                            int i51114 = b;
                            int i51115 = i51114 & 43;
                            int i51116 = (i51114 ^ 43) | i51115;
                            int i51117 = ((i51115 | i51116) << 1) - (i51116 ^ i51115);
                            i6 = i51117 % 128;
                            a = i6;
                            int i51118 = i51117 % 2;
                            if (c2 != '*') {
                                int i51119 = i6 & 9;
                                int i5121 = (i6 ^ 9) | i51119;
                                i7 = (i51119 ^ i5121) + ((i5121 & i51119) << 1);
                                i8 = i7 % 128;
                                b = i8;
                                if (i7 % 2 != 0) {
                                    if (c2 != '%') {
                                        int i511110 = ((i8 & 120) + (i8 | 120)) - 1;
                                        a = i511110 % 128;
                                        int i6111114 = i511110 % 2;
                                        return c4;
                                    }
                                    int i6111115 = i5 & 1;
                                    int i6111116 = -(-((i5 ^ 1) | i6111115));
                                    this.i = (i6111115 & i6111116) + (i6111116 | i6111115);
                                    A();
                                    int i6111117 = b;
                                    int i6111118 = ((i6111117 | 79) << 1) - (i6111117 ^ 79);
                                    a = i6111118 % 128;
                                    int i6111119 = i6111118 % 2;
                                    i23 = this.i;
                                    i24 = this.h;
                                    int i61111110 = i6111117 & 79;
                                    int i61111111 = (i61111110 - (~(-(-((i6111117 ^ 79) | i61111110))))) - 1;
                                    a = i61111111 % 128;
                                    int i61111112 = i61111111 % 2;
                                } else {
                                    if (c2 != '/') {
                                        int i511111 = ((i8 & 120) + (i8 | 120)) - 1;
                                        a = i511111 % 128;
                                        int i61111113 = i511111 % 2;
                                        return c4;
                                    }
                                    int i61111114 = i5 & 1;
                                    int i61111115 = -(-((i5 ^ 1) | i61111114));
                                    this.i = (i61111114 & i61111115) + (i61111115 | i61111114);
                                    A();
                                    int i61111116 = b;
                                    int i61111117 = ((i61111116 | 79) << 1) - (i61111116 ^ 79);
                                    a = i61111117 % 128;
                                    int i61111118 = i61111117 % 2;
                                    i23 = this.i;
                                    i24 = this.h;
                                    int i61111119 = i61111116 & 79;
                                    int i611111110 = (i61111119 - (~(-(-((i61111116 ^ 79) | i61111119))))) - 1;
                                    a = i611111110 % 128;
                                    int i611111111 = i611111110 % 2;
                                }
                            } else {
                                int i7125 = i5 & 1;
                                this.i = ((((i5 ^ 1) | i7125) << 1) - (~(-((i5 | 1) & (~i7125))))) - 1;
                                int i7126 = (i6 & 14) + (i6 | 14);
                                i9 = (i7126 ^ (-1)) + (i7126 << 1);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    int i7127 = 5 % 3;
                                }
                                while (true) {
                                    i10 = this.i;
                                    i11 = this.h;
                                    int i7128 = a;
                                    int i7129 = i7128 & 3;
                                    i12 = (((i7128 ^ 3) | i7129) << 1) - ((i7128 | 3) & (~i7129));
                                    b = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        i13 = i10 & 2;
                                        if (i13 + ((i10 ^ 2) | i13) > i11) {
                                            if (!j(2)) {
                                                int i711110 = a;
                                                int i711111 = i711110 & 55;
                                                int i711112 = ((i711110 ^ 55) | i711111) << 1;
                                                int i711113 = -((~i711111) & (i711110 | 55));
                                                int i711114 = ((i711112 | i711113) << 1) - (i711112 ^ i711113);
                                                b = i711114 % 128;
                                                int i81110 = i711114 % 2;
                                                int i81111 = i711110 + 77;
                                                b = i81111 % 128;
                                                int i81112 = i81111 % 2;
                                                D("Unterminated comment");
                                                throw null;
                                            }
                                        }
                                    } else if (i10 * 2 > i11) {
                                        if (!j(2)) {
                                            int i711115 = a;
                                            int i711116 = i711115 & 55;
                                            int i711117 = ((i711115 ^ 55) | i711116) << 1;
                                            int i711118 = -((~i711116) & (i711115 | 55));
                                            int i711119 = ((i711117 | i711118) << 1) - (i711117 ^ i711118);
                                            b = i711119 % 128;
                                            int i81113 = i711119 % 2;
                                            int i81114 = i711115 + 77;
                                            b = i81114 % 128;
                                            int i81115 = i81114 % 2;
                                            D("Unterminated comment");
                                            throw null;
                                        }
                                    }
                                    char[] cArr10 = this.g;
                                    int i81116 = this.i;
                                    int i81117 = b;
                                    int i81118 = i81117 & 95;
                                    int i81119 = -(-(i81117 | 95));
                                    i14 = ((i81118 | i81119) << 1) - (i81119 ^ i81118);
                                    int i91120 = i14 % 128;
                                    a = i91120;
                                    if (i14 % 2 == 0) {
                                        i15 = 0;
                                        while (true) {
                                            if (i15 >= 2) {
                                                int i911118 = b;
                                                int i911119 = i911118 | 53;
                                                int i9111110 = ((i911119 << 1) - (~(-(i911119 & (~(i911118 & 53)))))) - 1;
                                                a = i9111110 % 128;
                                                int i9111111 = i9111110 % 2;
                                                int i9111112 = this.i;
                                                int i9111113 = (i9111112 | 2) << 1;
                                                int i9111114 = -(((~i9111112) & 2) | (i9111112 & (-3)));
                                                i23 = (i9111114 | i9111113) + (i9111113 & i9111114);
                                                i24 = this.h;
                                                int i9111115 = (i911118 ^ 35) + ((i911118 & 35) << 1);
                                                a = i9111115 % 128;
                                                int i9111116 = i9111115 % 2;
                                                break;
                                                break;
                                            }
                                            int i10111110 = a;
                                            i16 = (i10111110 & 29) + (i10111110 | 29);
                                            int i10111111 = i16 % 128;
                                            b = i10111111;
                                            if (i16 % 2 != 0) {
                                                c3 = this.g[this.i * i15];
                                            } else {
                                                char[] cArr11 = this.g;
                                                int i10111112 = this.i;
                                                int i10111113 = i10111112 & i15;
                                                c3 = cArr11[(((i10111112 ^ i15) | i10111113) << 1) - ((i10111112 | i15) & (~i10111113))];
                                            }
                                            int i10111114 = i10111111 ^ 19;
                                            int i10111115 = (((i10111111 & 19) | i10111114) << 1) - i10111114;
                                            a = i10111115 % 128;
                                            int i10111116 = i10111115 % 2;
                                            if (c3 != "*/".charAt(i15)) {
                                                break;
                                                break;
                                            }
                                            int i10111117 = i15 + 67;
                                            i15 = (i10111117 | (-66)) + (i10111117 & (-66));
                                            int i10111118 = b;
                                            int i10111119 = i10111118 & 49;
                                            int i11116 = (i10111118 | 49) & (~i10111119);
                                            int i11117 = i10111119 << 1;
                                            int i11118 = ((i11116 | i11117) << 1) - (i11116 ^ i11117);
                                            a = i11118 % 128;
                                            int i11119 = i11118 % 2;
                                        }
                                        int i12112 = this.i;
                                        this.i = (((i12112 & (-2)) | ((~i12112) & 1)) - (~((i12112 & 1) << 1))) - 1;
                                        int i12113 = b;
                                        int i12114 = i12113 & 7;
                                        int i131110 = ((i12113 | 7) & (~i12114)) + (i12114 << 1);
                                        a = i131110 % 128;
                                        int i131111 = i131110 % 2;
                                    } else {
                                        i15 = 0;
                                        while (true) {
                                            if (i15 >= 2) {
                                                int i9111117 = b;
                                                int i9111118 = i9111117 | 53;
                                                int i9111119 = ((i9111118 << 1) - (~(-(i9111118 & (~(i9111117 & 53)))))) - 1;
                                                a = i9111119 % 128;
                                                int i91111110 = i9111119 % 2;
                                                int i91111111 = this.i;
                                                int i91111112 = (i91111111 | 2) << 1;
                                                int i91111113 = -(((~i91111111) & 2) | (i91111111 & (-3)));
                                                i23 = (i91111113 | i91111112) + (i91111112 & i91111113);
                                                i24 = this.h;
                                                int i91111114 = (i9111117 ^ 35) + ((i9111117 & 35) << 1);
                                                a = i91111114 % 128;
                                                int i91111115 = i91111114 % 2;
                                                break;
                                                break;
                                            }
                                            int i101111110 = a;
                                            i16 = (i101111110 & 29) + (i101111110 | 29);
                                            int i101111111 = i16 % 128;
                                            b = i101111111;
                                            if (i16 % 2 != 0) {
                                                c3 = this.g[this.i * i15];
                                            } else {
                                                char[] cArr12 = this.g;
                                                int i101111112 = this.i;
                                                int i101111113 = i101111112 & i15;
                                                c3 = cArr12[(((i101111112 ^ i15) | i101111113) << 1) - ((i101111112 | i15) & (~i101111113))];
                                            }
                                            int i101111114 = i101111111 ^ 19;
                                            int i101111115 = (((i101111111 & 19) | i101111114) << 1) - i101111114;
                                            a = i101111115 % 128;
                                            int i101111116 = i101111115 % 2;
                                            if (c3 != "*/".charAt(i15)) {
                                                break;
                                                break;
                                            }
                                            int i101111117 = i15 + 67;
                                            i15 = (i101111117 | (-66)) + (i101111117 & (-66));
                                            int i101111118 = b;
                                            int i101111119 = i101111118 & 49;
                                            int i111110 = (i101111118 | 49) & (~i101111119);
                                            int i111111 = i101111119 << 1;
                                            int i111112 = ((i111110 | i111111) << 1) - (i111110 ^ i111111);
                                            a = i111112 % 128;
                                            int i111113 = i111112 % 2;
                                        }
                                        int i12115 = this.i;
                                        this.i = (((i12115 & (-2)) | ((~i12115) & 1)) - (~((i12115 & 1) << 1))) - 1;
                                        int i12116 = b;
                                        int i12117 = i12116 & 7;
                                        int i131112 = ((i12116 | 7) & (~i12117)) + (i12117 << 1);
                                        a = i131112 % 128;
                                        int i131113 = i131112 % 2;
                                    }
                                }
                            }
                        } else {
                            if (c4 == '#') {
                                this.i = i35;
                                i3 = ((((i2 ^ 29) | (i2 & 29)) << 1) - (~(-((i2 & (-30)) | ((~i2) & 29))))) - 1;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    return c4;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            i4 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                this.i = i35;
                                f();
                                A();
                                throw null;
                            }
                            this.i = i35;
                            f();
                            A();
                            i23 = this.i;
                            int i131114 = b;
                            int i131115 = i131114 & 107;
                            int i131116 = ((((i131114 ^ 107) | i131115) << 1) - (~(-((~i131115) & (i131114 | 107))))) - 1;
                            a = i131116 % 128;
                            int i131117 = i131116 % 2;
                            i24 = this.h;
                            int i131118 = i131114 ^ 101;
                            int i131119 = -(-((i131114 & 101) << 1));
                            int i1324 = ((i131118 | i131119) << 1) - (i131119 ^ i131118);
                            a = i1324 % 128;
                            int i1325 = i1324 % 2;
                        }
                    }
                }
            }
            int i140 = a;
            int i141 = (i140 ^ 27) + ((i140 & 27) << 1);
            b = i141 % 128;
            int i142 = i141 % 2;
            i23 = i35;
        }
        int i143 = b;
        int i144 = i143 & 55;
        int i145 = -(-((i143 ^ 55) | i144));
        int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
        int i147 = i146 % 128;
        a = i147;
        int i148 = i146 % 2;
        if (!(!z)) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("End of input");
            sbW.append(m());
            throw new EOFException(sbW.toString());
        }
        int i149 = i147 + 49;
        b = i149 % 128;
        int i150 = i149 % 2;
        int i151 = i147 & 57;
        int i152 = (i147 | 57) & (~i151);
        int i153 = -(-(i151 << 1));
        int i154 = (i152 & i153) + (i153 | i152);
        b = i154 % 128;
        if (i154 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    public final void z(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-4)) | ((~i3) & 3);
        int i5 = -(-((i3 & 3) << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.f72o;
        int[] iArr = this.p;
        int i8 = (i3 & 34) + (i3 | 34);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            int length = iArr.length;
            obj.hashCode();
            throw null;
        }
        if (i7 == iArr.length) {
            int i11 = ((i10 & 79) - (~(-(-(i10 | 79))))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i7 * 2;
            this.p = Arrays.copyOf(iArr, i13);
            int i14 = b;
            int i15 = i14 & 59;
            int i16 = (i14 | 59) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            this.r = Arrays.copyOf(this.r, i13);
            String[] strArr = this.q;
            int i20 = b;
            int i21 = ((i20 | 67) << 1) - (i20 ^ 67);
            a = i21 % 128;
            int i22 = i21 % 2;
            this.q = (String[]) Arrays.copyOf(strArr, i13);
            int i23 = a;
            int i24 = (i23 & 78) + (i23 | 78);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int[] iArr2 = this.p;
        int i27 = this.f72o;
        this.f72o = (((i27 | 2) << 1) - (i27 ^ 2)) - 1;
        int i28 = a;
        int i29 = i28 & 23;
        int i30 = i28 | 23;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            iArr2[i27] = i;
        } else {
            iArr2[i27] = i;
            obj.hashCode();
            throw null;
        }
    }

    public final void B(char c2) throws h {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-110)) | ((~i2) & 109)) + ((i2 & 109) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        char[] cArr = this.g;
        int i6 = i4 & 57;
        int i7 = (i4 | 57) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            int i11 = this.i;
            int i12 = this.h;
            int i13 = a;
            int i14 = (i13 & (-122)) | ((~i13) & 121);
            int i15 = -(-((i13 & 121) << 1));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            while (true) {
                if (i11 >= i12) {
                    this.i = i11;
                    if (j(1)) {
                        break;
                    }
                    int i18 = a;
                    int i19 = i18 & 29;
                    int i20 = i19 + ((i18 ^ 29) | i19);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    D("Unterminated string");
                    throw null;
                }
                int i22 = a;
                int i23 = (-2) - ((((i22 | 58) << 1) - (i22 ^ 58)) ^ (-1));
                int i24 = i23 % 128;
                b = i24;
                int i25 = i23 % 2;
                int i26 = ((i11 ^ 2) + ((i11 & 2) << 1)) - 1;
                char c3 = cArr[i11];
                if (c3 == c2) {
                    int i27 = (i24 & 103) + (i24 | 103);
                    int i28 = i27 % 128;
                    a = i28;
                    if (i27 % 2 == 0) {
                        this.i = i26;
                        throw null;
                    }
                    this.i = i26;
                    int i29 = i28 & 87;
                    int i30 = -(-((i28 ^ 87) | i29));
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    b = i31 % 128;
                    if (i31 % 2 != 0) {
                        int i32 = 95 / 0;
                        return;
                    }
                    return;
                }
                if (c3 == '\\') {
                    int i33 = i24 + 33;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    this.i = i26;
                    v();
                    int i35 = a;
                    int i36 = (((i35 & (-100)) | ((~i35) & 99)) - (~(-(-((i35 & 99) << 1))))) - 1;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    break;
                }
                if (c3 == '\n') {
                    int i38 = (i22 | 43) << 1;
                    int i39 = -(i22 ^ 43);
                    int i40 = (i38 & i39) + (i38 | i39);
                    b = i40 % 128;
                    if (i40 % 2 != 0) {
                        this.j = this.j;
                    } else {
                        int i41 = this.j;
                        int i42 = i41 & 1;
                        int i43 = ((i41 ^ 1) | i42) << 1;
                        int i44 = -((i41 | 1) & (~i42));
                        this.j = ((i43 | i44) << 1) - (i44 ^ i43);
                    }
                    this.k = i26;
                    int i45 = i22 + 5;
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        int i46 = 2 / 3;
                    }
                }
                int i47 = b + 87;
                a = i47 % 128;
                int i48 = i47 % 2;
                i11 = i26;
            }
        }
    }

    public String x() {
        String str;
        int iG;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 121;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d;
        if (i5 == 0) {
            int i6 = (-2) - (((i2 ^ 126) + ((i2 & 126) << 1)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                iG = g();
                int i7 = 28 / 0;
            } else {
                iG = g();
            }
            i5 = iG;
        }
        if (i5 == 10) {
            int i8 = b;
            int i9 = (i8 & 23) + (i8 | 23);
            a = i9 % 128;
            int i10 = i9 % 2;
            str = w();
            int i11 = b;
            int i12 = i11 & 115;
            int i13 = (i11 | 115) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 4 % 2;
            }
        } else if (i5 == 8) {
            int i17 = a;
            int i18 = ((i17 & 6) + (i17 | 6)) - 1;
            b = i18 % 128;
            str = u(i18 % 2 != 0 ? ',' : '\'');
            int i19 = b;
            int i20 = i19 ^ 69;
            int i21 = (((i19 & 69) | i20) << 1) - i20;
            a = i21 % 128;
            int i22 = i21 % 2;
        } else if (i5 == 9) {
            int i23 = a;
            int i24 = ((i23 ^ 15) | (i23 & 15)) << 1;
            int i25 = -(((~i23) & 15) | (i23 & (-16)));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            str = u(i26 % 2 != 0 ? '0' : '\"');
        } else if (i5 == 11) {
            int i27 = b;
            int i28 = ((i27 | 27) << 1) - (i27 ^ 27);
            a = i28 % 128;
            int i29 = i28 % 2;
            String str2 = this.n;
            this.n = null;
            int i30 = i27 & 103;
            int i31 = ((((i27 ^ 103) | i30) << 1) - (~(-((i27 | 103) & (~i30))))) - 1;
            a = i31 % 128;
            int i32 = i31 % 2;
            str = str2;
        } else if (i5 == 15) {
            int i33 = (-2) - ((b + 14) ^ (-1));
            a = i33 % 128;
            int i34 = i33 % 2;
            str = Long.toString(this.l);
            int i35 = b;
            int i36 = i35 ^ 23;
            int i37 = ((i35 & 23) | i36) << 1;
            int i38 = -i36;
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            a = i39 % 128;
            int i40 = i39 % 2;
        } else {
            if (i5 != 16) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected a string but was ");
                String strF = ivas.gov.bisp.enumeration.p091n.j.F(y());
                int i41 = a;
                int i42 = ((i41 | 101) << 1) - (i41 ^ 101);
                b = i42 % 128;
                if (i42 % 2 != 0) {
                    sbW.append(strF);
                    sbW.append(m());
                    throw null;
                }
                sbW.append(strF);
                sbW.append(m());
                throw new IllegalStateException(sbW.toString());
            }
            str = new String(this.g, this.i, this.m);
            int i43 = b;
            int i44 = (i43 | 81) << 1;
            int i45 = -(((~i43) & 81) | (i43 & (-82)));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            a = i46 % 128;
            if (i46 % 2 == 0) {
                this.i >>= this.m;
            } else {
                int i47 = this.i;
                int i48 = this.m;
                int i49 = i47 & i48;
                this.i = i49 + ((i47 ^ i48) | i49);
            }
        }
        this.d = 0;
        int[] iArr = this.r;
        int i50 = b;
        int i51 = (i50 & 43) + (i50 | 43);
        int i52 = i51 % 128;
        a = i52;
        int i53 = i51 % 2 == 0 ? this.f72o : this.f72o - 1;
        int i54 = iArr[i53];
        iArr[i53] = ((i54 | 1) << 1) - (i54 ^ 1);
        int i55 = i52 & 47;
        int i56 = ((((i52 ^ 47) | i55) << 1) - (~(-((i52 | 47) & (~i55))))) - 1;
        b = i56 % 128;
        if (i56 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public class biF extends h {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aL(j jVar) throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 117;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (!(!(jVar instanceof e))) {
                int i5 = i2 & 21;
                int i6 = (((i2 ^ 21) | i5) << 1) - ((i2 | 21) & (~i5));
                a = i6 % 128;
                int i7 = i6 % 2;
                e eVar = (e) jVar;
                eVar.E(5);
                int i8 = a;
                int i9 = i8 ^ 119;
                int i10 = -(-((i8 & 119) << 1));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                Object next = ((Iterator) eVar.F()).next();
                int i13 = b + 22;
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                Map.Entry entry = (Map.Entry) next;
                eVar.H(entry.getValue());
                Z z = new Z((String) entry.getKey());
                int i16 = a;
                int i17 = ((i16 ^ 121) | (i16 & 121)) << 1;
                int i18 = -(((~i16) & 121) | (i16 & (-122)));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    eVar.H(z);
                    return;
                } else {
                    eVar.H(z);
                    int i20 = 21 / 0;
                    return;
                }
            }
            int iG = jVar.d;
            Object obj = null;
            if (iG == 0) {
                int i21 = a;
                int i22 = (i21 & 123) + (i21 | 123);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    jVar.g();
                    throw null;
                }
                iG = jVar.g();
            }
            if (iG == 13) {
                int i23 = b;
                int i24 = ((i23 & 74) + (i23 | 74)) - 1;
                a = i24 % 128;
                jVar.d = i24 % 2 == 0 ? 87 : 9;
                int i25 = a;
                int i26 = i25 & 117;
                int i27 = (i25 | 117) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (iG == 12) {
                int i30 = b;
                int i31 = ((i30 | 53) << 1) - (i30 ^ 53);
                a = i31 % 128;
                jVar.d = i31 % 2 == 0 ? 90 : 8;
                int i32 = b;
                int i33 = (i32 & 51) + (i32 | 51);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = 62 / 0;
                    return;
                }
                return;
            }
            if (iG != 14) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Expected a name but was ");
                sbW.append(ivas.gov.bisp.enumeration.p091n.j.F(jVar.y()));
                sbW.append(jVar.m());
                throw new IllegalStateException(sbW.toString());
            }
            int i35 = a;
            int i36 = (i35 ^ 37) + ((i35 & 37) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            jVar.d = 10;
            int i38 = a;
            int i39 = i38 & 93;
            int i40 = -(-(i38 | 93));
            int i41 = (i39 & i40) + (i40 | i39);
            b = i41 % 128;
            int i42 = i41 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0106 A[PHI: r6
  0x0106: PHI (r6v42 int) = (r6v41 int), (r6v48 int) binds: [B:28:0x0104, B:25:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0228 A[LOOP:0: B:3:0x002d->B:56:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0239 A[SYNTHETIC] */
    public final String u(char c2) throws h {
        int i;
        int i2;
        int i3;
        int i4;
        char c3;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 123;
        int i9 = (i7 | 123) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        char[] cArr = this.g;
        int i14 = i12 ^ 15;
        int i15 = ((i12 & 15) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        a = i17 % 128;
        int i18 = i17 % 2;
        Object obj = null;
        StringBuilder sb = null;
        while (true) {
            int i19 = this.i;
            int i20 = this.h;
            int i21 = a;
            int i22 = i21 & 3;
            int i23 = (i21 ^ 3) | i22;
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            int i25 = i24 % 2;
            while (true) {
                int i26 = b;
                int i27 = ((i26 | 89) << 1) - (i26 ^ 89);
                a = i27 % 128;
                int i28 = i27 % 2;
                i = i19;
                while (true) {
                    if (i < i20) {
                        int i29 = a;
                        int i30 = i29 & 109;
                        int i31 = ((i29 ^ 109) | i30) << 1;
                        int i32 = -((~i30) & (i29 | 109));
                        int i33 = (i31 & i32) + (i31 | i32);
                        int i34 = i33 % 128;
                        b = i34;
                        if (i33 % 2 != 0) {
                            i4 = i >> 1;
                            c3 = cArr[i];
                        } else {
                            i4 = ((i & 2) + (i | 2)) - 1;
                            c3 = cArr[i];
                        }
                        if (c3 == c2) {
                            int i35 = (i34 ^ 123) + ((i34 & 123) << 1);
                            a = i35 % 128;
                            int i36 = i35 % 2;
                            this.i = i4;
                            int i37 = (-2) - (((i4 - (~(-(~(-i19))))) - 1) ^ (-1));
                            int i38 = (i37 - (~(-(-((i37 ^ (-1)) | i37))))) - 1;
                            if (sb == null) {
                                String str = new String(cArr, i19, i38);
                                int i39 = b;
                                int i40 = i39 & 53;
                                int i41 = i40 + ((i39 ^ 53) | i40);
                                a = i41 % 128;
                                if (i41 % 2 != 0) {
                                    return str;
                                }
                                throw null;
                            }
                            sb.append(cArr, i19, i38);
                            int i42 = a + 1;
                            b = i42 % 128;
                            int i43 = i42 % 2;
                            String string = sb.toString();
                            int i44 = a;
                            int i45 = i44 & 101;
                            int i46 = -(-(i44 | 101));
                            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            return string;
                        }
                        if (c3 == '\\') {
                            int i49 = ((i29 ^ 80) + ((i29 & 80) << 1)) - 1;
                            b = i49 % 128;
                            if (i49 % 2 != 0) {
                                this.i = i4;
                                i5 = (i4 * i19) >> 1;
                                if (sb == null) {
                                    sb = new StringBuilder(Math.max((((i5 | 1) << 1) - ((i5 & (-2)) | ((~i5) & 1))) * 2, 16));
                                    int i50 = b;
                                    int i51 = i50 & 25;
                                    int i52 = (i50 ^ 25) | i51;
                                    int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                                    a = i53 % 128;
                                    int i54 = i53 % 2;
                                    int i55 = (((i50 & (-122)) | ((~i50) & 121)) - (~((i50 & 121) << 1))) - 1;
                                    a = i55 % 128;
                                    int i56 = i55 % 2;
                                }
                            } else {
                                this.i = i4;
                                int i57 = -i19;
                                int i58 = (((i4 ^ i57) | (i4 & i57)) << 1) - ((i57 & (~i4)) | ((~i57) & i4));
                                int i59 = ~i58;
                                int i60 = i58 << 1;
                                i5 = (i59 | i60) + (i59 & i60);
                                if (sb == null) {
                                    sb = new StringBuilder(Math.max((((i5 | 1) << 1) - ((i5 & (-2)) | ((~i5) & 1))) * 2, 16));
                                    int i510 = b;
                                    int i511 = i510 & 25;
                                    int i512 = (i510 ^ 25) | i511;
                                    int i513 = ((i511 | i512) << 1) - (i511 ^ i512);
                                    a = i513 % 128;
                                    int i514 = i513 % 2;
                                    int i515 = (((i510 & (-122)) | ((~i510) & 121)) - (~((i510 & 121) << 1))) - 1;
                                    a = i515 % 128;
                                    int i516 = i515 % 2;
                                }
                            }
                            sb.append(cArr, i19, i5);
                            int i61 = b;
                            int i62 = (i61 ^ 105) + ((i61 & 105) << 1);
                            a = i62 % 128;
                            if (i62 % 2 == 0) {
                                sb.append(v());
                                obj.hashCode();
                                throw null;
                            }
                            sb.append(v());
                            i19 = this.i;
                            i20 = this.h;
                            int i63 = b;
                            int i64 = ((((i63 ^ 91) | (i63 & 91)) << 1) - (~(-(((~i63) & 91) | (i63 & (-92)))))) - 1;
                            a = i64 % 128;
                            int i65 = i64 % 2;
                        } else {
                            if (c3 == '\n') {
                                int i66 = (i34 & 43) + (i34 | 43);
                                a = i66 % 128;
                                int i67 = i66 % 2;
                                this.j++;
                                this.k = i4;
                                int i68 = (((i34 & (-8)) | ((~i34) & 7)) - (~((i34 & 7) << 1))) - 1;
                                a = i68 % 128;
                                int i69 = i68 % 2;
                            }
                            int i70 = a;
                            int i71 = (i70 | 107) << 1;
                            int i72 = -(((~i70) & 107) | (i70 & (-108)));
                            int i73 = (i71 & i72) + (i72 | i71);
                            b = i73 % 128;
                            if (i73 % 2 != 0) {
                                int i74 = 3 % 3;
                            }
                            i = i4;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i19) * 2, 16));
                int i75 = b;
                int i76 = i75 ^ 13;
                int i77 = (((i75 & 13) | i76) << 1) - i76;
                int i78 = i77 % 128;
                a = i78;
                if (i77 % 2 == 0) {
                    throw null;
                }
                int i79 = i78 & 3;
                int i80 = ((i78 ^ 3) | i79) << 1;
                int i81 = -((i78 | 3) & (~i79));
                int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                b = i82 % 128;
                int i83 = i82 % 2;
            }
            sb.append(cArr, i19, i - i19);
            int i84 = b;
            int i85 = i84 & 67;
            int i86 = i85 + ((i84 ^ 67) | i85);
            a = i86 % 128;
            if (i86 % 2 == 0) {
                this.i = i;
                if (!j(1)) {
                    D("Unterminated string");
                    throw null;
                }
                i2 = a + 119;
                i3 = i2 % 128;
                b = i3;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i87 = (-2) - ((((i3 | 2) << 1) - (i3 ^ 2)) ^ (-1));
                a = i87 % 128;
                int i88 = i87 % 2;
            } else {
                this.i = i;
                if (!j(1)) {
                    D("Unterminated string");
                    throw null;
                }
                i2 = a + 119;
                i3 = i2 % 128;
                b = i3;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i89 = (-2) - ((((i3 | 2) << 1) - (i3 ^ 2)) ^ (-1));
                a = i89 % 128;
                int i810 = i89 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x015d. Please report as an issue. */
    public final String w() throws h {
        int i;
        int i2;
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
        String string;
        String str;
        int i13 = 2 % 2;
        int i14 = a;
        int i15 = (i14 ^ 76) + ((i14 & 76) << 1);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 26 / 0;
        }
        Object obj = null;
        StringBuilder sb = null;
        while (true) {
            int i18 = b;
            int i19 = i18 & 57;
            int i20 = -(-((i18 ^ 57) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                int i24 = this.i;
                int i25 = -(-i23);
                int i26 = ~i25;
                if ((i24 - i26) - 1 < this.h) {
                    int i27 = a;
                    int i28 = (i27 & 53) + (i27 | 53);
                    int i29 = i28 % 128;
                    b = i29;
                    int i30 = i28 % 2;
                    int i31 = -i26;
                    char c2 = this.g[((i24 & i31) + (i24 | i31)) - 1];
                    if (c2 != '\t') {
                        int i32 = i29 ^ 61;
                        int i33 = ((i29 & 61) | i32) << 1;
                        int i34 = -i32;
                        int i35 = (i33 & i34) + (i34 | i33);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                        if (c2 != '\n') {
                            int i37 = i29 + 11;
                            int i38 = i37 % 128;
                            a = i38;
                            if (i37 % 2 == 0) {
                                if (c2 != 'C') {
                                    int i39 = i38 & 9;
                                    int i40 = (i39 - (~(-(-((i38 ^ 9) | i39))))) - 1;
                                    i = i40 % 128;
                                    b = i;
                                    int i41 = i40 % 2;
                                    if (c2 != '\r') {
                                        int i42 = i + 76;
                                        i2 = (i42 ^ (-1)) + (i42 << 1);
                                        a = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            if (c2 != 2) {
                                                int i43 = i & 81;
                                                int i44 = -(-((i ^ 81) | i43));
                                                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                                                i3 = i45 % 128;
                                                a = i3;
                                                int i46 = i45 % 2;
                                                if (c2 != '#') {
                                                    i4 = (i3 & 43) + (i3 | 43);
                                                    i5 = i4 % 128;
                                                    b = i5;
                                                    if (i4 % 2 != 0) {
                                                        if (c2 != 'M') {
                                                            int i47 = i5 & 121;
                                                            int i48 = -(-((i5 ^ 121) | i47));
                                                            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                                                            i6 = i49 % 128;
                                                            a = i6;
                                                            int i50 = i49 % 2;
                                                            if (c2 != '/') {
                                                                int i51 = (-2) - ((i6 + 66) ^ (-1));
                                                                b = i51 % 128;
                                                                int i52 = i51 % 2;
                                                                if (c2 != '=') {
                                                                    i7 = i6 + 91;
                                                                    i8 = i7 % 128;
                                                                    b = i8;
                                                                    if (i7 % 2 != 0) {
                                                                        if (c2 != ':') {
                                                                            int i53 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                            a = i53 % 128;
                                                                            int i54 = i53 % 2;
                                                                            if (c2 != '}') {
                                                                                int i55 = i8 & 89;
                                                                                int i56 = -(-((i8 ^ 89) | i55));
                                                                                i9 = ((i55 | i56) << 1) - (i55 ^ i56);
                                                                                i10 = i9 % 128;
                                                                                a = i10;
                                                                                if (i9 % 2 == 0) {
                                                                                    if (c2 != ',') {
                                                                                        int i57 = (i10 & (-18)) | ((~i10) & 17);
                                                                                        int i58 = -(-((i10 & 17) << 1));
                                                                                        i11 = ((i57 | i58) << 1) - (i57 ^ i58);
                                                                                        b = i11 % 128;
                                                                                        if (i11 % 2 != 0) {
                                                                                            if (c2 != '\r') {
                                                                                                int i59 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                                int i60 = (i59 ^ (-1)) + (i59 << 1);
                                                                                                i12 = i60 % 128;
                                                                                                b = i12;
                                                                                                int i61 = i60 % 2;
                                                                                                switch (c2) {
                                                                                                    case '[':
                                                                                                    case ']':
                                                                                                        break;
                                                                                                    case '\\':
                                                                                                        break;
                                                                                                    default:
                                                                                                        int i62 = i23 - 50;
                                                                                                        i23 = ((i62 & 51) << 1) + (i62 ^ 51);
                                                                                                        int i63 = i12 & 25;
                                                                                                        int i64 = (i12 ^ 25) | i63;
                                                                                                        int i65 = (i63 & i64) + (i63 | i64);
                                                                                                        a = i65 % 128;
                                                                                                        int i66 = i65 % 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        } else if (c2 != ';') {
                                                                                            int i510 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i67 = (i510 ^ (-1)) + (i510 << 1);
                                                                                            i12 = i67 % 128;
                                                                                            b = i12;
                                                                                            int i68 = i67 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i69 = i23 - 50;
                                                                                                    i23 = ((i69 & 51) << 1) + (i69 ^ 51);
                                                                                                    int i610 = i12 & 25;
                                                                                                    int i611 = (i12 ^ 25) | i610;
                                                                                                    int i612 = (i610 & i611) + (i610 | i611);
                                                                                                    a = i612 % 128;
                                                                                                    int i613 = i612 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ':') {
                                                                                    int i511 = (i10 & (-18)) | ((~i10) & 17);
                                                                                    int i512 = -(-((i10 & 17) << 1));
                                                                                    i11 = ((i511 | i512) << 1) - (i511 ^ i512);
                                                                                    b = i11 % 128;
                                                                                    if (i11 % 2 != 0) {
                                                                                        if (c2 != '\r') {
                                                                                            int i513 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i614 = (i513 ^ (-1)) + (i513 << 1);
                                                                                            i12 = i614 % 128;
                                                                                            b = i12;
                                                                                            int i615 = i614 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i616 = i23 - 50;
                                                                                                    i23 = ((i616 & 51) << 1) + (i616 ^ 51);
                                                                                                    int i617 = i12 & 25;
                                                                                                    int i618 = (i12 ^ 25) | i617;
                                                                                                    int i619 = (i617 & i618) + (i617 | i618);
                                                                                                    a = i619 % 128;
                                                                                                    int i6110 = i619 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != ';') {
                                                                                        int i514 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111 = (i514 ^ (-1)) + (i514 << 1);
                                                                                        i12 = i6111 % 128;
                                                                                        b = i12;
                                                                                        int i6112 = i6111 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i6113 = i23 - 50;
                                                                                                i23 = ((i6113 & 51) << 1) + (i6113 ^ 51);
                                                                                                int i6114 = i12 & 25;
                                                                                                int i6115 = (i12 ^ 25) | i6114;
                                                                                                int i6116 = (i6114 & i6115) + (i6114 | i6115);
                                                                                                a = i6116 % 128;
                                                                                                int i6117 = i6116 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != '{') {
                                                                        int i515 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                        a = i515 % 128;
                                                                        int i516 = i515 % 2;
                                                                        if (c2 != '}') {
                                                                            int i517 = i8 & 89;
                                                                            int i518 = -(-((i8 ^ 89) | i517));
                                                                            i9 = ((i517 | i518) << 1) - (i517 ^ i518);
                                                                            i10 = i9 % 128;
                                                                            a = i10;
                                                                            if (i9 % 2 == 0) {
                                                                                if (c2 != ',') {
                                                                                    int i519 = (i10 & (-18)) | ((~i10) & 17);
                                                                                    int i5110 = -(-((i10 & 17) << 1));
                                                                                    i11 = ((i519 | i5110) << 1) - (i519 ^ i5110);
                                                                                    b = i11 % 128;
                                                                                    if (i11 % 2 != 0) {
                                                                                        if (c2 != '\r') {
                                                                                            int i5111 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i6118 = (i5111 ^ (-1)) + (i5111 << 1);
                                                                                            i12 = i6118 % 128;
                                                                                            b = i12;
                                                                                            int i6119 = i6118 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i61110 = i23 - 50;
                                                                                                    i23 = ((i61110 & 51) << 1) + (i61110 ^ 51);
                                                                                                    int i61111 = i12 & 25;
                                                                                                    int i61112 = (i12 ^ 25) | i61111;
                                                                                                    int i61113 = (i61111 & i61112) + (i61111 | i61112);
                                                                                                    a = i61113 % 128;
                                                                                                    int i61114 = i61113 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != ';') {
                                                                                        int i5112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i61115 = (i5112 ^ (-1)) + (i5112 << 1);
                                                                                        i12 = i61115 % 128;
                                                                                        b = i12;
                                                                                        int i61116 = i61115 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61117 = i23 - 50;
                                                                                                i23 = ((i61117 & 51) << 1) + (i61117 ^ 51);
                                                                                                int i61118 = i12 & 25;
                                                                                                int i61119 = (i12 ^ 25) | i61118;
                                                                                                int i611110 = (i61118 & i61119) + (i61118 | i61119);
                                                                                                a = i611110 % 128;
                                                                                                int i611111 = i611110 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ':') {
                                                                                int i5113 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i5114 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i5113 | i5114) << 1) - (i5113 ^ i5114);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i5115 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i611112 = (i5115 ^ (-1)) + (i5115 << 1);
                                                                                        i12 = i611112 % 128;
                                                                                        b = i12;
                                                                                        int i611113 = i611112 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i611114 = i23 - 50;
                                                                                                i23 = ((i611114 & 51) << 1) + (i611114 ^ 51);
                                                                                                int i611115 = i12 & 25;
                                                                                                int i611116 = (i12 ^ 25) | i611115;
                                                                                                int i611117 = (i611115 & i611116) + (i611115 | i611116);
                                                                                                a = i611117 % 128;
                                                                                                int i611118 = i611117 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i5116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611119 = (i5116 ^ (-1)) + (i5116 << 1);
                                                                                    i12 = i611119 % 128;
                                                                                    b = i12;
                                                                                    int i6111110 = i611119 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111 = i23 - 50;
                                                                                            i23 = ((i6111111 & 51) << 1) + (i6111111 ^ 51);
                                                                                            int i6111112 = i12 & 25;
                                                                                            int i6111113 = (i12 ^ 25) | i6111112;
                                                                                            int i6111114 = (i6111112 & i6111113) + (i6111112 | i6111113);
                                                                                            a = i6111114 % 128;
                                                                                            int i6111115 = i6111114 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (c2 != ',') {
                                                        int i410 = i5 & 121;
                                                        int i411 = -(-((i5 ^ 121) | i410));
                                                        int i412 = ((i410 | i411) << 1) - (i411 ^ i410);
                                                        i6 = i412 % 128;
                                                        a = i6;
                                                        int i520 = i412 % 2;
                                                        if (c2 != '/') {
                                                            int i521 = (-2) - ((i6 + 66) ^ (-1));
                                                            b = i521 % 128;
                                                            int i522 = i521 % 2;
                                                            if (c2 != '=') {
                                                                i7 = i6 + 91;
                                                                i8 = i7 % 128;
                                                                b = i8;
                                                                if (i7 % 2 != 0) {
                                                                    if (c2 != ':') {
                                                                        int i5117 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                        a = i5117 % 128;
                                                                        int i5118 = i5117 % 2;
                                                                        if (c2 != '}') {
                                                                            int i5119 = i8 & 89;
                                                                            int i5120 = -(-((i8 ^ 89) | i5119));
                                                                            i9 = ((i5119 | i5120) << 1) - (i5119 ^ i5120);
                                                                            i10 = i9 % 128;
                                                                            a = i10;
                                                                            if (i9 % 2 == 0) {
                                                                                if (c2 != ',') {
                                                                                    int i51110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                    int i51111 = -(-((i10 & 17) << 1));
                                                                                    i11 = ((i51110 | i51111) << 1) - (i51110 ^ i51111);
                                                                                    b = i11 % 128;
                                                                                    if (i11 % 2 != 0) {
                                                                                        if (c2 != '\r') {
                                                                                            int i51112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i6111116 = (i51112 ^ (-1)) + (i51112 << 1);
                                                                                            i12 = i6111116 % 128;
                                                                                            b = i12;
                                                                                            int i6111117 = i6111116 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i6111118 = i23 - 50;
                                                                                                    i23 = ((i6111118 & 51) << 1) + (i6111118 ^ 51);
                                                                                                    int i6111119 = i12 & 25;
                                                                                                    int i61111110 = (i12 ^ 25) | i6111119;
                                                                                                    int i61111111 = (i6111119 & i61111110) + (i6111119 | i61111110);
                                                                                                    a = i61111111 % 128;
                                                                                                    int i61111112 = i61111111 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != ';') {
                                                                                        int i51113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i61111113 = (i51113 ^ (-1)) + (i51113 << 1);
                                                                                        i12 = i61111113 % 128;
                                                                                        b = i12;
                                                                                        int i61111114 = i61111113 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61111115 = i23 - 50;
                                                                                                i23 = ((i61111115 & 51) << 1) + (i61111115 ^ 51);
                                                                                                int i61111116 = i12 & 25;
                                                                                                int i61111117 = (i12 ^ 25) | i61111116;
                                                                                                int i61111118 = (i61111116 & i61111117) + (i61111116 | i61111117);
                                                                                                a = i61111118 % 128;
                                                                                                int i61111119 = i61111118 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ':') {
                                                                                int i51114 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i51115 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i51114 | i51115) << 1) - (i51114 ^ i51115);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i51116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i611111110 = (i51116 ^ (-1)) + (i51116 << 1);
                                                                                        i12 = i611111110 % 128;
                                                                                        b = i12;
                                                                                        int i611111111 = i611111110 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i611111112 = i23 - 50;
                                                                                                i23 = ((i611111112 & 51) << 1) + (i611111112 ^ 51);
                                                                                                int i611111113 = i12 & 25;
                                                                                                int i611111114 = (i12 ^ 25) | i611111113;
                                                                                                int i611111115 = (i611111113 & i611111114) + (i611111113 | i611111114);
                                                                                                a = i611111115 % 128;
                                                                                                int i611111116 = i611111115 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i51117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111117 = (i51117 ^ (-1)) + (i51117 << 1);
                                                                                    i12 = i611111117 % 128;
                                                                                    b = i12;
                                                                                    int i611111118 = i611111117 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111119 = i23 - 50;
                                                                                            i23 = ((i611111119 & 51) << 1) + (i611111119 ^ 51);
                                                                                            int i6111111110 = i12 & 25;
                                                                                            int i6111111111 = (i12 ^ 25) | i6111111110;
                                                                                            int i6111111112 = (i6111111110 & i6111111111) + (i6111111110 | i6111111111);
                                                                                            a = i6111111112 % 128;
                                                                                            int i6111111113 = i6111111112 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2 != '{') {
                                                                    int i51118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i51118 % 128;
                                                                    int i51119 = i51118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51120 = i8 & 89;
                                                                        int i5121 = -(-((i8 ^ 89) | i51120));
                                                                        i9 = ((i51120 | i5121) << 1) - (i51120 ^ i5121);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i511110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i511111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i511110 | i511111) << 1) - (i511110 ^ i511111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i511112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111111114 = (i511112 ^ (-1)) + (i511112 << 1);
                                                                                        i12 = i6111111114 % 128;
                                                                                        b = i12;
                                                                                        int i6111111115 = i6111111114 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i6111111116 = i23 - 50;
                                                                                                i23 = ((i6111111116 & 51) << 1) + (i6111111116 ^ 51);
                                                                                                int i6111111117 = i12 & 25;
                                                                                                int i6111111118 = (i12 ^ 25) | i6111111117;
                                                                                                int i6111111119 = (i6111111117 & i6111111118) + (i6111111117 | i6111111118);
                                                                                                a = i6111111119 % 128;
                                                                                                int i61111111110 = i6111111119 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i511113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111 = (i511113 ^ (-1)) + (i511113 << 1);
                                                                                    i12 = i61111111111 % 128;
                                                                                    b = i12;
                                                                                    int i61111111112 = i61111111111 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111113 = i23 - 50;
                                                                                            i23 = ((i61111111113 & 51) << 1) + (i61111111113 ^ 51);
                                                                                            int i61111111114 = i12 & 25;
                                                                                            int i61111111115 = (i12 ^ 25) | i61111111114;
                                                                                            int i61111111116 = (i61111111114 & i61111111115) + (i61111111114 | i61111111115);
                                                                                            a = i61111111116 % 128;
                                                                                            int i61111111117 = i61111111116 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i511114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i511115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i511114 | i511115) << 1) - (i511114 ^ i511115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i511116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111118 = (i511116 ^ (-1)) + (i511116 << 1);
                                                                                    i12 = i61111111118 % 128;
                                                                                    b = i12;
                                                                                    int i61111111119 = i61111111118 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111110 = i23 - 50;
                                                                                            i23 = ((i611111111110 & 51) << 1) + (i611111111110 ^ 51);
                                                                                            int i611111111111 = i12 & 25;
                                                                                            int i611111111112 = (i12 ^ 25) | i611111111111;
                                                                                            int i611111111113 = (i611111111111 & i611111111112) + (i611111111111 | i611111111112);
                                                                                            a = i611111111113 % 128;
                                                                                            int i611111111114 = i611111111113 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i511117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111115 = (i511117 ^ (-1)) + (i511117 << 1);
                                                                                i12 = i611111111115 % 128;
                                                                                b = i12;
                                                                                int i611111111116 = i611111111115 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111117 = i23 - 50;
                                                                                        i23 = ((i611111111117 & 51) << 1) + (i611111111117 ^ 51);
                                                                                        int i611111111118 = i12 & 25;
                                                                                        int i611111111119 = (i12 ^ 25) | i611111111118;
                                                                                        int i6111111111110 = (i611111111118 & i611111111119) + (i611111111118 | i611111111119);
                                                                                        a = i6111111111110 % 128;
                                                                                        int i6111111111111 = i6111111111110 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                f();
                                                int i70 = a;
                                                int i71 = (i70 & (-16)) | ((~i70) & 15);
                                                int i72 = -(-((i70 & 15) << 1));
                                                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                                                b = i73 % 128;
                                                int i74 = i73 % 2;
                                            }
                                        } else if (c2 != ' ') {
                                            int i413 = i & 81;
                                            int i414 = -(-((i ^ 81) | i413));
                                            int i415 = (i413 ^ i414) + ((i414 & i413) << 1);
                                            i3 = i415 % 128;
                                            a = i3;
                                            int i416 = i415 % 2;
                                            if (c2 != '#') {
                                                i4 = (i3 & 43) + (i3 | 43);
                                                i5 = i4 % 128;
                                                b = i5;
                                                if (i4 % 2 != 0) {
                                                    if (c2 != 'M') {
                                                        int i417 = i5 & 121;
                                                        int i418 = -(-((i5 ^ 121) | i417));
                                                        int i419 = ((i417 | i418) << 1) - (i418 ^ i417);
                                                        i6 = i419 % 128;
                                                        a = i6;
                                                        int i523 = i419 % 2;
                                                        if (c2 != '/') {
                                                            int i524 = (-2) - ((i6 + 66) ^ (-1));
                                                            b = i524 % 128;
                                                            int i525 = i524 % 2;
                                                            if (c2 != '=') {
                                                                i7 = i6 + 91;
                                                                i8 = i7 % 128;
                                                                b = i8;
                                                                if (i7 % 2 != 0) {
                                                                    if (c2 != ':') {
                                                                        int i511118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                        a = i511118 % 128;
                                                                        int i511119 = i511118 % 2;
                                                                        if (c2 != '}') {
                                                                            int i51121 = i8 & 89;
                                                                            int i5122 = -(-((i8 ^ 89) | i51121));
                                                                            i9 = ((i51121 | i5122) << 1) - (i51121 ^ i5122);
                                                                            i10 = i9 % 128;
                                                                            a = i10;
                                                                            if (i9 % 2 == 0) {
                                                                                if (c2 != ',') {
                                                                                    int i5111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                    int i5111111 = -(-((i10 & 17) << 1));
                                                                                    i11 = ((i5111110 | i5111111) << 1) - (i5111110 ^ i5111111);
                                                                                    b = i11 % 128;
                                                                                    if (i11 % 2 != 0) {
                                                                                        if (c2 != '\r') {
                                                                                            int i5111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i6111111111112 = (i5111112 ^ (-1)) + (i5111112 << 1);
                                                                                            i12 = i6111111111112 % 128;
                                                                                            b = i12;
                                                                                            int i6111111111113 = i6111111111112 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i6111111111114 = i23 - 50;
                                                                                                    i23 = ((i6111111111114 & 51) << 1) + (i6111111111114 ^ 51);
                                                                                                    int i6111111111115 = i12 & 25;
                                                                                                    int i6111111111116 = (i12 ^ 25) | i6111111111115;
                                                                                                    int i6111111111117 = (i6111111111115 & i6111111111116) + (i6111111111115 | i6111111111116);
                                                                                                    a = i6111111111117 % 128;
                                                                                                    int i6111111111118 = i6111111111117 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != ';') {
                                                                                        int i5111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111111111119 = (i5111113 ^ (-1)) + (i5111113 << 1);
                                                                                        i12 = i6111111111119 % 128;
                                                                                        b = i12;
                                                                                        int i61111111111110 = i6111111111119 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61111111111111 = i23 - 50;
                                                                                                i23 = ((i61111111111111 & 51) << 1) + (i61111111111111 ^ 51);
                                                                                                int i61111111111112 = i12 & 25;
                                                                                                int i61111111111113 = (i12 ^ 25) | i61111111111112;
                                                                                                int i61111111111114 = (i61111111111112 & i61111111111113) + (i61111111111112 | i61111111111113);
                                                                                                a = i61111111111114 % 128;
                                                                                                int i61111111111115 = i61111111111114 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ':') {
                                                                                int i5111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i5111115 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i5111114 | i5111115) << 1) - (i5111114 ^ i5111115);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i5111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i61111111111116 = (i5111116 ^ (-1)) + (i5111116 << 1);
                                                                                        i12 = i61111111111116 % 128;
                                                                                        b = i12;
                                                                                        int i61111111111117 = i61111111111116 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61111111111118 = i23 - 50;
                                                                                                i23 = ((i61111111111118 & 51) << 1) + (i61111111111118 ^ 51);
                                                                                                int i61111111111119 = i12 & 25;
                                                                                                int i611111111111110 = (i12 ^ 25) | i61111111111119;
                                                                                                int i611111111111111 = (i61111111111119 & i611111111111110) + (i61111111111119 | i611111111111110);
                                                                                                a = i611111111111111 % 128;
                                                                                                int i611111111111112 = i611111111111111 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i5111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111111111113 = (i5111117 ^ (-1)) + (i5111117 << 1);
                                                                                    i12 = i611111111111113 % 128;
                                                                                    b = i12;
                                                                                    int i611111111111114 = i611111111111113 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111111115 = i23 - 50;
                                                                                            i23 = ((i611111111111115 & 51) << 1) + (i611111111111115 ^ 51);
                                                                                            int i611111111111116 = i12 & 25;
                                                                                            int i611111111111117 = (i12 ^ 25) | i611111111111116;
                                                                                            int i611111111111118 = (i611111111111116 & i611111111111117) + (i611111111111116 | i611111111111117);
                                                                                            a = i611111111111118 % 128;
                                                                                            int i611111111111119 = i611111111111118 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2 != '{') {
                                                                    int i5111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i5111118 % 128;
                                                                    int i5111119 = i5111118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51122 = i8 & 89;
                                                                        int i5123 = -(-((i8 ^ 89) | i51122));
                                                                        i9 = ((i51122 | i5123) << 1) - (i51122 ^ i5123);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i51111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i51111111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i51111110 | i51111111) << 1) - (i51111110 ^ i51111111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i51111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111111111111110 = (i51111112 ^ (-1)) + (i51111112 << 1);
                                                                                        i12 = i6111111111111110 % 128;
                                                                                        b = i12;
                                                                                        int i6111111111111111 = i6111111111111110 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i6111111111111112 = i23 - 50;
                                                                                                i23 = ((i6111111111111112 & 51) << 1) + (i6111111111111112 ^ 51);
                                                                                                int i6111111111111113 = i12 & 25;
                                                                                                int i6111111111111114 = (i12 ^ 25) | i6111111111111113;
                                                                                                int i6111111111111115 = (i6111111111111113 & i6111111111111114) + (i6111111111111113 | i6111111111111114);
                                                                                                a = i6111111111111115 % 128;
                                                                                                int i6111111111111116 = i6111111111111115 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i51111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i6111111111111117 = (i51111113 ^ (-1)) + (i51111113 << 1);
                                                                                    i12 = i6111111111111117 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111118 = i6111111111111117 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111119 = i23 - 50;
                                                                                            i23 = ((i6111111111111119 & 51) << 1) + (i6111111111111119 ^ 51);
                                                                                            int i61111111111111110 = i12 & 25;
                                                                                            int i61111111111111111 = (i12 ^ 25) | i61111111111111110;
                                                                                            int i61111111111111112 = (i61111111111111110 & i61111111111111111) + (i61111111111111110 | i61111111111111111);
                                                                                            a = i61111111111111112 % 128;
                                                                                            int i61111111111111113 = i61111111111111112 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i51111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i51111115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i51111114 | i51111115) << 1) - (i51111114 ^ i51111115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i51111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111114 = (i51111116 ^ (-1)) + (i51111116 << 1);
                                                                                    i12 = i61111111111111114 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111115 = i61111111111111114 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111111111116 = i23 - 50;
                                                                                            i23 = ((i61111111111111116 & 51) << 1) + (i61111111111111116 ^ 51);
                                                                                            int i61111111111111117 = i12 & 25;
                                                                                            int i61111111111111118 = (i12 ^ 25) | i61111111111111117;
                                                                                            int i61111111111111119 = (i61111111111111117 & i61111111111111118) + (i61111111111111117 | i61111111111111118);
                                                                                            a = i61111111111111119 % 128;
                                                                                            int i611111111111111110 = i61111111111111119 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i51111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111111111111 = (i51111117 ^ (-1)) + (i51111117 << 1);
                                                                                i12 = i611111111111111111 % 128;
                                                                                b = i12;
                                                                                int i611111111111111112 = i611111111111111111 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111113 = i23 - 50;
                                                                                        i23 = ((i611111111111111113 & 51) << 1) + (i611111111111111113 ^ 51);
                                                                                        int i611111111111111114 = i12 & 25;
                                                                                        int i611111111111111115 = (i12 ^ 25) | i611111111111111114;
                                                                                        int i611111111111111116 = (i611111111111111114 & i611111111111111115) + (i611111111111111114 | i611111111111111115);
                                                                                        a = i611111111111111116 % 128;
                                                                                        int i611111111111111117 = i611111111111111116 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (c2 != ',') {
                                                    int i4110 = i5 & 121;
                                                    int i4111 = -(-((i5 ^ 121) | i4110));
                                                    int i4112 = ((i4110 | i4111) << 1) - (i4111 ^ i4110);
                                                    i6 = i4112 % 128;
                                                    a = i6;
                                                    int i526 = i4112 % 2;
                                                    if (c2 != '/') {
                                                        int i527 = (-2) - ((i6 + 66) ^ (-1));
                                                        b = i527 % 128;
                                                        int i528 = i527 % 2;
                                                        if (c2 != '=') {
                                                            i7 = i6 + 91;
                                                            i8 = i7 % 128;
                                                            b = i8;
                                                            if (i7 % 2 != 0) {
                                                                if (c2 != ':') {
                                                                    int i51111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i51111118 % 128;
                                                                    int i51111119 = i51111118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51123 = i8 & 89;
                                                                        int i5124 = -(-((i8 ^ 89) | i51123));
                                                                        i9 = ((i51123 | i5124) << 1) - (i51123 ^ i5124);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i511111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i511111111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i511111110 | i511111111) << 1) - (i511111110 ^ i511111111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i511111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i611111111111111118 = (i511111112 ^ (-1)) + (i511111112 << 1);
                                                                                        i12 = i611111111111111118 % 128;
                                                                                        b = i12;
                                                                                        int i611111111111111119 = i611111111111111118 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i6111111111111111110 = i23 - 50;
                                                                                                i23 = ((i6111111111111111110 & 51) << 1) + (i6111111111111111110 ^ 51);
                                                                                                int i6111111111111111111 = i12 & 25;
                                                                                                int i6111111111111111112 = (i12 ^ 25) | i6111111111111111111;
                                                                                                int i6111111111111111113 = (i6111111111111111111 & i6111111111111111112) + (i6111111111111111111 | i6111111111111111112);
                                                                                                a = i6111111111111111113 % 128;
                                                                                                int i6111111111111111114 = i6111111111111111113 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i511111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i6111111111111111115 = (i511111113 ^ (-1)) + (i511111113 << 1);
                                                                                    i12 = i6111111111111111115 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111111116 = i6111111111111111115 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111111117 = i23 - 50;
                                                                                            i23 = ((i6111111111111111117 & 51) << 1) + (i6111111111111111117 ^ 51);
                                                                                            int i6111111111111111118 = i12 & 25;
                                                                                            int i6111111111111111119 = (i12 ^ 25) | i6111111111111111118;
                                                                                            int i61111111111111111110 = (i6111111111111111118 & i6111111111111111119) + (i6111111111111111118 | i6111111111111111119);
                                                                                            a = i61111111111111111110 % 128;
                                                                                            int i61111111111111111111 = i61111111111111111110 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i511111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i511111115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i511111114 | i511111115) << 1) - (i511111114 ^ i511111115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i511111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111111112 = (i511111116 ^ (-1)) + (i511111116 << 1);
                                                                                    i12 = i61111111111111111112 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111111113 = i61111111111111111112 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111111111111114 = i23 - 50;
                                                                                            i23 = ((i61111111111111111114 & 51) << 1) + (i61111111111111111114 ^ 51);
                                                                                            int i61111111111111111115 = i12 & 25;
                                                                                            int i61111111111111111116 = (i12 ^ 25) | i61111111111111111115;
                                                                                            int i61111111111111111117 = (i61111111111111111115 & i61111111111111111116) + (i61111111111111111115 | i61111111111111111116);
                                                                                            a = i61111111111111111117 % 128;
                                                                                            int i61111111111111111118 = i61111111111111111117 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i511111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111119 = (i511111117 ^ (-1)) + (i511111117 << 1);
                                                                                i12 = i61111111111111111119 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111110 = i61111111111111111119 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111111111 = i23 - 50;
                                                                                        i23 = ((i611111111111111111111 & 51) << 1) + (i611111111111111111111 ^ 51);
                                                                                        int i611111111111111111112 = i12 & 25;
                                                                                        int i611111111111111111113 = (i12 ^ 25) | i611111111111111111112;
                                                                                        int i611111111111111111114 = (i611111111111111111112 & i611111111111111111113) + (i611111111111111111112 | i611111111111111111113);
                                                                                        a = i611111111111111111114 % 128;
                                                                                        int i611111111111111111115 = i611111111111111111114 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (c2 != '{') {
                                                                int i511111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                a = i511111118 % 128;
                                                                int i511111119 = i511111118 % 2;
                                                                if (c2 != '}') {
                                                                    int i51124 = i8 & 89;
                                                                    int i5125 = -(-((i8 ^ 89) | i51124));
                                                                    i9 = ((i51124 | i5125) << 1) - (i51124 ^ i5125);
                                                                    i10 = i9 % 128;
                                                                    a = i10;
                                                                    if (i9 % 2 == 0) {
                                                                        if (c2 != ',') {
                                                                            int i5111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i5111111111 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i5111111110 | i5111111111) << 1) - (i5111111110 ^ i5111111111);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i5111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111111111111111116 = (i5111111112 ^ (-1)) + (i5111111112 << 1);
                                                                                    i12 = i611111111111111111116 % 128;
                                                                                    b = i12;
                                                                                    int i611111111111111111117 = i611111111111111111116 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111111111111118 = i23 - 50;
                                                                                            i23 = ((i611111111111111111118 & 51) << 1) + (i611111111111111111118 ^ 51);
                                                                                            int i611111111111111111119 = i12 & 25;
                                                                                            int i6111111111111111111110 = (i12 ^ 25) | i611111111111111111119;
                                                                                            int i6111111111111111111111 = (i611111111111111111119 & i6111111111111111111110) + (i611111111111111111119 | i6111111111111111111110);
                                                                                            a = i6111111111111111111111 % 128;
                                                                                            int i6111111111111111111112 = i6111111111111111111111 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i5111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i6111111111111111111113 = (i5111111113 ^ (-1)) + (i5111111113 << 1);
                                                                                i12 = i6111111111111111111113 % 128;
                                                                                b = i12;
                                                                                int i6111111111111111111114 = i6111111111111111111113 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i6111111111111111111115 = i23 - 50;
                                                                                        i23 = ((i6111111111111111111115 & 51) << 1) + (i6111111111111111111115 ^ 51);
                                                                                        int i6111111111111111111116 = i12 & 25;
                                                                                        int i6111111111111111111117 = (i12 ^ 25) | i6111111111111111111116;
                                                                                        int i6111111111111111111118 = (i6111111111111111111116 & i6111111111111111111117) + (i6111111111111111111116 | i6111111111111111111117);
                                                                                        a = i6111111111111111111118 % 128;
                                                                                        int i6111111111111111111119 = i6111111111111111111118 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != ':') {
                                                                        int i5111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                        int i5111111115 = -(-((i10 & 17) << 1));
                                                                        i11 = ((i5111111114 | i5111111115) << 1) - (i5111111114 ^ i5111111115);
                                                                        b = i11 % 128;
                                                                        if (i11 % 2 != 0) {
                                                                            if (c2 != '\r') {
                                                                                int i5111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111111110 = (i5111111116 ^ (-1)) + (i5111111116 << 1);
                                                                                i12 = i61111111111111111111110 % 128;
                                                                                b = i12;
                                                                                int i61111111111111111111111 = i61111111111111111111110 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i61111111111111111111112 = i23 - 50;
                                                                                        i23 = ((i61111111111111111111112 & 51) << 1) + (i61111111111111111111112 ^ 51);
                                                                                        int i61111111111111111111113 = i12 & 25;
                                                                                        int i61111111111111111111114 = (i12 ^ 25) | i61111111111111111111113;
                                                                                        int i61111111111111111111115 = (i61111111111111111111113 & i61111111111111111111114) + (i61111111111111111111113 | i61111111111111111111114);
                                                                                        a = i61111111111111111111115 % 128;
                                                                                        int i61111111111111111111116 = i61111111111111111111115 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (c2 != ';') {
                                                                            int i5111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i61111111111111111111117 = (i5111111117 ^ (-1)) + (i5111111117 << 1);
                                                                            i12 = i61111111111111111111117 % 128;
                                                                            b = i12;
                                                                            int i61111111111111111111118 = i61111111111111111111117 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i61111111111111111111119 = i23 - 50;
                                                                                    i23 = ((i61111111111111111111119 & 51) << 1) + (i61111111111111111111119 ^ 51);
                                                                                    int i611111111111111111111110 = i12 & 25;
                                                                                    int i611111111111111111111111 = (i12 ^ 25) | i611111111111111111111110;
                                                                                    int i611111111111111111111112 = (i611111111111111111111110 & i611111111111111111111111) + (i611111111111111111111110 | i611111111111111111111111);
                                                                                    a = i611111111111111111111112 % 128;
                                                                                    int i611111111111111111111113 = i611111111111111111111112 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            f();
                                            int i75 = a;
                                            int i76 = (i75 & (-16)) | ((~i75) & 15);
                                            int i77 = -(-((i75 & 15) << 1));
                                            int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                                            b = i78 % 128;
                                            int i79 = i78 % 2;
                                        }
                                    }
                                }
                            } else if (c2 != '\f') {
                                int i310 = i38 & 9;
                                int i420 = (i310 - (~(-(-((i38 ^ 9) | i310))))) - 1;
                                i = i420 % 128;
                                b = i;
                                int i421 = i420 % 2;
                                if (c2 != '\r') {
                                    int i422 = i + 76;
                                    i2 = (i422 ^ (-1)) + (i422 << 1);
                                    a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        if (c2 != 2) {
                                            int i4113 = i & 81;
                                            int i4114 = -(-((i ^ 81) | i4113));
                                            int i4115 = (i4113 ^ i4114) + ((i4114 & i4113) << 1);
                                            i3 = i4115 % 128;
                                            a = i3;
                                            int i4116 = i4115 % 2;
                                            if (c2 != '#') {
                                                i4 = (i3 & 43) + (i3 | 43);
                                                i5 = i4 % 128;
                                                b = i5;
                                                if (i4 % 2 != 0) {
                                                    if (c2 != 'M') {
                                                        int i4117 = i5 & 121;
                                                        int i4118 = -(-((i5 ^ 121) | i4117));
                                                        int i4119 = ((i4117 | i4118) << 1) - (i4118 ^ i4117);
                                                        i6 = i4119 % 128;
                                                        a = i6;
                                                        int i529 = i4119 % 2;
                                                        if (c2 != '/') {
                                                            int i5210 = (-2) - ((i6 + 66) ^ (-1));
                                                            b = i5210 % 128;
                                                            int i5211 = i5210 % 2;
                                                            if (c2 != '=') {
                                                                i7 = i6 + 91;
                                                                i8 = i7 % 128;
                                                                b = i8;
                                                                if (i7 % 2 != 0) {
                                                                    if (c2 != ':') {
                                                                        int i5111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                        a = i5111111118 % 128;
                                                                        int i5111111119 = i5111111118 % 2;
                                                                        if (c2 != '}') {
                                                                            int i51125 = i8 & 89;
                                                                            int i5126 = -(-((i8 ^ 89) | i51125));
                                                                            i9 = ((i51125 | i5126) << 1) - (i51125 ^ i5126);
                                                                            i10 = i9 % 128;
                                                                            a = i10;
                                                                            if (i9 % 2 == 0) {
                                                                                if (c2 != ',') {
                                                                                    int i51111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                    int i51111111111 = -(-((i10 & 17) << 1));
                                                                                    i11 = ((i51111111110 | i51111111111) << 1) - (i51111111110 ^ i51111111111);
                                                                                    b = i11 % 128;
                                                                                    if (i11 % 2 != 0) {
                                                                                        if (c2 != '\r') {
                                                                                            int i51111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                            int i611111111111111111111114 = (i51111111112 ^ (-1)) + (i51111111112 << 1);
                                                                                            i12 = i611111111111111111111114 % 128;
                                                                                            b = i12;
                                                                                            int i611111111111111111111115 = i611111111111111111111114 % 2;
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    int i611111111111111111111116 = i23 - 50;
                                                                                                    i23 = ((i611111111111111111111116 & 51) << 1) + (i611111111111111111111116 ^ 51);
                                                                                                    int i611111111111111111111117 = i12 & 25;
                                                                                                    int i611111111111111111111118 = (i12 ^ 25) | i611111111111111111111117;
                                                                                                    int i611111111111111111111119 = (i611111111111111111111117 & i611111111111111111111118) + (i611111111111111111111117 | i611111111111111111111118);
                                                                                                    a = i611111111111111111111119 % 128;
                                                                                                    int i6111111111111111111111110 = i611111111111111111111119 % 2;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } else if (c2 != ';') {
                                                                                        int i51111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111111111111111111111111 = (i51111111113 ^ (-1)) + (i51111111113 << 1);
                                                                                        i12 = i6111111111111111111111111 % 128;
                                                                                        b = i12;
                                                                                        int i6111111111111111111111112 = i6111111111111111111111111 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i6111111111111111111111113 = i23 - 50;
                                                                                                i23 = ((i6111111111111111111111113 & 51) << 1) + (i6111111111111111111111113 ^ 51);
                                                                                                int i6111111111111111111111114 = i12 & 25;
                                                                                                int i6111111111111111111111115 = (i12 ^ 25) | i6111111111111111111111114;
                                                                                                int i6111111111111111111111116 = (i6111111111111111111111114 & i6111111111111111111111115) + (i6111111111111111111111114 | i6111111111111111111111115);
                                                                                                a = i6111111111111111111111116 % 128;
                                                                                                int i6111111111111111111111117 = i6111111111111111111111116 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ':') {
                                                                                int i51111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i51111111115 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i51111111114 | i51111111115) << 1) - (i51111111114 ^ i51111111115);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i51111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i6111111111111111111111118 = (i51111111116 ^ (-1)) + (i51111111116 << 1);
                                                                                        i12 = i6111111111111111111111118 % 128;
                                                                                        b = i12;
                                                                                        int i6111111111111111111111119 = i6111111111111111111111118 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61111111111111111111111110 = i23 - 50;
                                                                                                i23 = ((i61111111111111111111111110 & 51) << 1) + (i61111111111111111111111110 ^ 51);
                                                                                                int i61111111111111111111111111 = i12 & 25;
                                                                                                int i61111111111111111111111112 = (i12 ^ 25) | i61111111111111111111111111;
                                                                                                int i61111111111111111111111113 = (i61111111111111111111111111 & i61111111111111111111111112) + (i61111111111111111111111111 | i61111111111111111111111112);
                                                                                                a = i61111111111111111111111113 % 128;
                                                                                                int i61111111111111111111111114 = i61111111111111111111111113 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i51111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111111111111115 = (i51111111117 ^ (-1)) + (i51111111117 << 1);
                                                                                    i12 = i61111111111111111111111115 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111111111111116 = i61111111111111111111111115 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111111111111111111117 = i23 - 50;
                                                                                            i23 = ((i61111111111111111111111117 & 51) << 1) + (i61111111111111111111111117 ^ 51);
                                                                                            int i61111111111111111111111118 = i12 & 25;
                                                                                            int i61111111111111111111111119 = (i12 ^ 25) | i61111111111111111111111118;
                                                                                            int i611111111111111111111111110 = (i61111111111111111111111118 & i61111111111111111111111119) + (i61111111111111111111111118 | i61111111111111111111111119);
                                                                                            a = i611111111111111111111111110 % 128;
                                                                                            int i611111111111111111111111111 = i611111111111111111111111110 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2 != '{') {
                                                                    int i51111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i51111111118 % 128;
                                                                    int i51111111119 = i51111111118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51126 = i8 & 89;
                                                                        int i5127 = -(-((i8 ^ 89) | i51126));
                                                                        i9 = ((i51126 | i5127) << 1) - (i51126 ^ i5127);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i511111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i511111111111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i511111111110 | i511111111111) << 1) - (i511111111110 ^ i511111111111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i511111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i611111111111111111111111112 = (i511111111112 ^ (-1)) + (i511111111112 << 1);
                                                                                        i12 = i611111111111111111111111112 % 128;
                                                                                        b = i12;
                                                                                        int i611111111111111111111111113 = i611111111111111111111111112 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i611111111111111111111111114 = i23 - 50;
                                                                                                i23 = ((i611111111111111111111111114 & 51) << 1) + (i611111111111111111111111114 ^ 51);
                                                                                                int i611111111111111111111111115 = i12 & 25;
                                                                                                int i611111111111111111111111116 = (i12 ^ 25) | i611111111111111111111111115;
                                                                                                int i611111111111111111111111117 = (i611111111111111111111111115 & i611111111111111111111111116) + (i611111111111111111111111115 | i611111111111111111111111116);
                                                                                                a = i611111111111111111111111117 % 128;
                                                                                                int i611111111111111111111111118 = i611111111111111111111111117 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i511111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111111111111111111111119 = (i511111111113 ^ (-1)) + (i511111111113 << 1);
                                                                                    i12 = i611111111111111111111111119 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111111111111111110 = i611111111111111111111111119 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111111111111111111 = i23 - 50;
                                                                                            i23 = ((i6111111111111111111111111111 & 51) << 1) + (i6111111111111111111111111111 ^ 51);
                                                                                            int i6111111111111111111111111112 = i12 & 25;
                                                                                            int i6111111111111111111111111113 = (i12 ^ 25) | i6111111111111111111111111112;
                                                                                            int i6111111111111111111111111114 = (i6111111111111111111111111112 & i6111111111111111111111111113) + (i6111111111111111111111111112 | i6111111111111111111111111113);
                                                                                            a = i6111111111111111111111111114 % 128;
                                                                                            int i6111111111111111111111111115 = i6111111111111111111111111114 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i511111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i511111111115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i511111111114 | i511111111115) << 1) - (i511111111114 ^ i511111111115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i511111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i6111111111111111111111111116 = (i511111111116 ^ (-1)) + (i511111111116 << 1);
                                                                                    i12 = i6111111111111111111111111116 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111111111111111117 = i6111111111111111111111111116 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111111111111111118 = i23 - 50;
                                                                                            i23 = ((i6111111111111111111111111118 & 51) << 1) + (i6111111111111111111111111118 ^ 51);
                                                                                            int i6111111111111111111111111119 = i12 & 25;
                                                                                            int i61111111111111111111111111110 = (i12 ^ 25) | i6111111111111111111111111119;
                                                                                            int i61111111111111111111111111111 = (i6111111111111111111111111119 & i61111111111111111111111111110) + (i6111111111111111111111111119 | i61111111111111111111111111110);
                                                                                            a = i61111111111111111111111111111 % 128;
                                                                                            int i61111111111111111111111111112 = i61111111111111111111111111111 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i511111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111111111111113 = (i511111111117 ^ (-1)) + (i511111111117 << 1);
                                                                                i12 = i61111111111111111111111111113 % 128;
                                                                                b = i12;
                                                                                int i61111111111111111111111111114 = i61111111111111111111111111113 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i61111111111111111111111111115 = i23 - 50;
                                                                                        i23 = ((i61111111111111111111111111115 & 51) << 1) + (i61111111111111111111111111115 ^ 51);
                                                                                        int i61111111111111111111111111116 = i12 & 25;
                                                                                        int i61111111111111111111111111117 = (i12 ^ 25) | i61111111111111111111111111116;
                                                                                        int i61111111111111111111111111118 = (i61111111111111111111111111116 & i61111111111111111111111111117) + (i61111111111111111111111111116 | i61111111111111111111111111117);
                                                                                        a = i61111111111111111111111111118 % 128;
                                                                                        int i61111111111111111111111111119 = i61111111111111111111111111118 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (c2 != ',') {
                                                    int i41110 = i5 & 121;
                                                    int i41111 = -(-((i5 ^ 121) | i41110));
                                                    int i41112 = ((i41110 | i41111) << 1) - (i41111 ^ i41110);
                                                    i6 = i41112 % 128;
                                                    a = i6;
                                                    int i5212 = i41112 % 2;
                                                    if (c2 != '/') {
                                                        int i5213 = (-2) - ((i6 + 66) ^ (-1));
                                                        b = i5213 % 128;
                                                        int i5214 = i5213 % 2;
                                                        if (c2 != '=') {
                                                            i7 = i6 + 91;
                                                            i8 = i7 % 128;
                                                            b = i8;
                                                            if (i7 % 2 != 0) {
                                                                if (c2 != ':') {
                                                                    int i511111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i511111111118 % 128;
                                                                    int i511111111119 = i511111111118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51127 = i8 & 89;
                                                                        int i5128 = -(-((i8 ^ 89) | i51127));
                                                                        i9 = ((i51127 | i5128) << 1) - (i51127 ^ i5128);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i5111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i5111111111111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i5111111111110 | i5111111111111) << 1) - (i5111111111110 ^ i5111111111111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i5111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i611111111111111111111111111110 = (i5111111111112 ^ (-1)) + (i5111111111112 << 1);
                                                                                        i12 = i611111111111111111111111111110 % 128;
                                                                                        b = i12;
                                                                                        int i611111111111111111111111111111 = i611111111111111111111111111110 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i611111111111111111111111111112 = i23 - 50;
                                                                                                i23 = ((i611111111111111111111111111112 & 51) << 1) + (i611111111111111111111111111112 ^ 51);
                                                                                                int i611111111111111111111111111113 = i12 & 25;
                                                                                                int i611111111111111111111111111114 = (i12 ^ 25) | i611111111111111111111111111113;
                                                                                                int i611111111111111111111111111115 = (i611111111111111111111111111113 & i611111111111111111111111111114) + (i611111111111111111111111111113 | i611111111111111111111111111114);
                                                                                                a = i611111111111111111111111111115 % 128;
                                                                                                int i611111111111111111111111111116 = i611111111111111111111111111115 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i5111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111111111111111111111111117 = (i5111111111113 ^ (-1)) + (i5111111111113 << 1);
                                                                                    i12 = i611111111111111111111111111117 % 128;
                                                                                    b = i12;
                                                                                    int i611111111111111111111111111118 = i611111111111111111111111111117 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111111111111111111111119 = i23 - 50;
                                                                                            i23 = ((i611111111111111111111111111119 & 51) << 1) + (i611111111111111111111111111119 ^ 51);
                                                                                            int i6111111111111111111111111111110 = i12 & 25;
                                                                                            int i6111111111111111111111111111111 = (i12 ^ 25) | i6111111111111111111111111111110;
                                                                                            int i6111111111111111111111111111112 = (i6111111111111111111111111111110 & i6111111111111111111111111111111) + (i6111111111111111111111111111110 | i6111111111111111111111111111111);
                                                                                            a = i6111111111111111111111111111112 % 128;
                                                                                            int i6111111111111111111111111111113 = i6111111111111111111111111111112 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i5111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i5111111111115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i5111111111114 | i5111111111115) << 1) - (i5111111111114 ^ i5111111111115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i5111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i6111111111111111111111111111114 = (i5111111111116 ^ (-1)) + (i5111111111116 << 1);
                                                                                    i12 = i6111111111111111111111111111114 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111111111111111111115 = i6111111111111111111111111111114 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111111111111111111116 = i23 - 50;
                                                                                            i23 = ((i6111111111111111111111111111116 & 51) << 1) + (i6111111111111111111111111111116 ^ 51);
                                                                                            int i6111111111111111111111111111117 = i12 & 25;
                                                                                            int i6111111111111111111111111111118 = (i12 ^ 25) | i6111111111111111111111111111117;
                                                                                            int i6111111111111111111111111111119 = (i6111111111111111111111111111117 & i6111111111111111111111111111118) + (i6111111111111111111111111111117 | i6111111111111111111111111111118);
                                                                                            a = i6111111111111111111111111111119 % 128;
                                                                                            int i61111111111111111111111111111110 = i6111111111111111111111111111119 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i5111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111111111111111111 = (i5111111111117 ^ (-1)) + (i5111111111117 << 1);
                                                                                i12 = i61111111111111111111111111111111 % 128;
                                                                                b = i12;
                                                                                int i61111111111111111111111111111112 = i61111111111111111111111111111111 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i61111111111111111111111111111113 = i23 - 50;
                                                                                        i23 = ((i61111111111111111111111111111113 & 51) << 1) + (i61111111111111111111111111111113 ^ 51);
                                                                                        int i61111111111111111111111111111114 = i12 & 25;
                                                                                        int i61111111111111111111111111111115 = (i12 ^ 25) | i61111111111111111111111111111114;
                                                                                        int i61111111111111111111111111111116 = (i61111111111111111111111111111114 & i61111111111111111111111111111115) + (i61111111111111111111111111111114 | i61111111111111111111111111111115);
                                                                                        a = i61111111111111111111111111111116 % 128;
                                                                                        int i61111111111111111111111111111117 = i61111111111111111111111111111116 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (c2 != '{') {
                                                                int i5111111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                a = i5111111111118 % 128;
                                                                int i5111111111119 = i5111111111118 % 2;
                                                                if (c2 != '}') {
                                                                    int i51128 = i8 & 89;
                                                                    int i5129 = -(-((i8 ^ 89) | i51128));
                                                                    i9 = ((i51128 | i5129) << 1) - (i51128 ^ i5129);
                                                                    i10 = i9 % 128;
                                                                    a = i10;
                                                                    if (i9 % 2 == 0) {
                                                                        if (c2 != ',') {
                                                                            int i51111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i51111111111111 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i51111111111110 | i51111111111111) << 1) - (i51111111111110 ^ i51111111111111);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i51111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111111111111111111118 = (i51111111111112 ^ (-1)) + (i51111111111112 << 1);
                                                                                    i12 = i61111111111111111111111111111118 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111111111111111111119 = i61111111111111111111111111111118 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111111111111111111111111110 = i23 - 50;
                                                                                            i23 = ((i611111111111111111111111111111110 & 51) << 1) + (i611111111111111111111111111111110 ^ 51);
                                                                                            int i611111111111111111111111111111111 = i12 & 25;
                                                                                            int i611111111111111111111111111111112 = (i12 ^ 25) | i611111111111111111111111111111111;
                                                                                            int i611111111111111111111111111111113 = (i611111111111111111111111111111111 & i611111111111111111111111111111112) + (i611111111111111111111111111111111 | i611111111111111111111111111111112);
                                                                                            a = i611111111111111111111111111111113 % 128;
                                                                                            int i611111111111111111111111111111114 = i611111111111111111111111111111113 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i51111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111111111111111111111111115 = (i51111111111113 ^ (-1)) + (i51111111111113 << 1);
                                                                                i12 = i611111111111111111111111111111115 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111111111111111116 = i611111111111111111111111111111115 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111111111111111111117 = i23 - 50;
                                                                                        i23 = ((i611111111111111111111111111111117 & 51) << 1) + (i611111111111111111111111111111117 ^ 51);
                                                                                        int i611111111111111111111111111111118 = i12 & 25;
                                                                                        int i611111111111111111111111111111119 = (i12 ^ 25) | i611111111111111111111111111111118;
                                                                                        int i6111111111111111111111111111111110 = (i611111111111111111111111111111118 & i611111111111111111111111111111119) + (i611111111111111111111111111111118 | i611111111111111111111111111111119);
                                                                                        a = i6111111111111111111111111111111110 % 128;
                                                                                        int i6111111111111111111111111111111111 = i6111111111111111111111111111111110 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != ':') {
                                                                        int i51111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                        int i51111111111115 = -(-((i10 & 17) << 1));
                                                                        i11 = ((i51111111111114 | i51111111111115) << 1) - (i51111111111114 ^ i51111111111115);
                                                                        b = i11 % 128;
                                                                        if (i11 % 2 != 0) {
                                                                            if (c2 != '\r') {
                                                                                int i51111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i6111111111111111111111111111111112 = (i51111111111116 ^ (-1)) + (i51111111111116 << 1);
                                                                                i12 = i6111111111111111111111111111111112 % 128;
                                                                                b = i12;
                                                                                int i6111111111111111111111111111111113 = i6111111111111111111111111111111112 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i6111111111111111111111111111111114 = i23 - 50;
                                                                                        i23 = ((i6111111111111111111111111111111114 & 51) << 1) + (i6111111111111111111111111111111114 ^ 51);
                                                                                        int i6111111111111111111111111111111115 = i12 & 25;
                                                                                        int i6111111111111111111111111111111116 = (i12 ^ 25) | i6111111111111111111111111111111115;
                                                                                        int i6111111111111111111111111111111117 = (i6111111111111111111111111111111115 & i6111111111111111111111111111111116) + (i6111111111111111111111111111111115 | i6111111111111111111111111111111116);
                                                                                        a = i6111111111111111111111111111111117 % 128;
                                                                                        int i6111111111111111111111111111111118 = i6111111111111111111111111111111117 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (c2 != ';') {
                                                                            int i51111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i6111111111111111111111111111111119 = (i51111111111117 ^ (-1)) + (i51111111111117 << 1);
                                                                            i12 = i6111111111111111111111111111111119 % 128;
                                                                            b = i12;
                                                                            int i61111111111111111111111111111111110 = i6111111111111111111111111111111119 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i61111111111111111111111111111111111 = i23 - 50;
                                                                                    i23 = ((i61111111111111111111111111111111111 & 51) << 1) + (i61111111111111111111111111111111111 ^ 51);
                                                                                    int i61111111111111111111111111111111112 = i12 & 25;
                                                                                    int i61111111111111111111111111111111113 = (i12 ^ 25) | i61111111111111111111111111111111112;
                                                                                    int i61111111111111111111111111111111114 = (i61111111111111111111111111111111112 & i61111111111111111111111111111111113) + (i61111111111111111111111111111111112 | i61111111111111111111111111111111113);
                                                                                    a = i61111111111111111111111111111111114 % 128;
                                                                                    int i61111111111111111111111111111111115 = i61111111111111111111111111111111114 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            f();
                                            int i710 = a;
                                            int i711 = (i710 & (-16)) | ((~i710) & 15);
                                            int i712 = -(-((i710 & 15) << 1));
                                            int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
                                            b = i713 % 128;
                                            int i714 = i713 % 2;
                                        }
                                    } else if (c2 != ' ') {
                                        int i41113 = i & 81;
                                        int i41114 = -(-((i ^ 81) | i41113));
                                        int i41115 = (i41113 ^ i41114) + ((i41114 & i41113) << 1);
                                        i3 = i41115 % 128;
                                        a = i3;
                                        int i41116 = i41115 % 2;
                                        if (c2 != '#') {
                                            i4 = (i3 & 43) + (i3 | 43);
                                            i5 = i4 % 128;
                                            b = i5;
                                            if (i4 % 2 != 0) {
                                                if (c2 != 'M') {
                                                    int i41117 = i5 & 121;
                                                    int i41118 = -(-((i5 ^ 121) | i41117));
                                                    int i41119 = ((i41117 | i41118) << 1) - (i41118 ^ i41117);
                                                    i6 = i41119 % 128;
                                                    a = i6;
                                                    int i5215 = i41119 % 2;
                                                    if (c2 != '/') {
                                                        int i5216 = (-2) - ((i6 + 66) ^ (-1));
                                                        b = i5216 % 128;
                                                        int i5217 = i5216 % 2;
                                                        if (c2 != '=') {
                                                            i7 = i6 + 91;
                                                            i8 = i7 % 128;
                                                            b = i8;
                                                            if (i7 % 2 != 0) {
                                                                if (c2 != ':') {
                                                                    int i51111111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                    a = i51111111111118 % 128;
                                                                    int i51111111111119 = i51111111111118 % 2;
                                                                    if (c2 != '}') {
                                                                        int i51129 = i8 & 89;
                                                                        int i51210 = -(-((i8 ^ 89) | i51129));
                                                                        i9 = ((i51129 | i51210) << 1) - (i51129 ^ i51210);
                                                                        i10 = i9 % 128;
                                                                        a = i10;
                                                                        if (i9 % 2 == 0) {
                                                                            if (c2 != ',') {
                                                                                int i511111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                                int i511111111111111 = -(-((i10 & 17) << 1));
                                                                                i11 = ((i511111111111110 | i511111111111111) << 1) - (i511111111111110 ^ i511111111111111);
                                                                                b = i11 % 128;
                                                                                if (i11 % 2 != 0) {
                                                                                    if (c2 != '\r') {
                                                                                        int i511111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                        int i61111111111111111111111111111111116 = (i511111111111112 ^ (-1)) + (i511111111111112 << 1);
                                                                                        i12 = i61111111111111111111111111111111116 % 128;
                                                                                        b = i12;
                                                                                        int i61111111111111111111111111111111117 = i61111111111111111111111111111111116 % 2;
                                                                                        switch (c2) {
                                                                                            case '[':
                                                                                            case ']':
                                                                                                break;
                                                                                            case '\\':
                                                                                                break;
                                                                                            default:
                                                                                                int i61111111111111111111111111111111118 = i23 - 50;
                                                                                                i23 = ((i61111111111111111111111111111111118 & 51) << 1) + (i61111111111111111111111111111111118 ^ 51);
                                                                                                int i61111111111111111111111111111111119 = i12 & 25;
                                                                                                int i611111111111111111111111111111111110 = (i12 ^ 25) | i61111111111111111111111111111111119;
                                                                                                int i611111111111111111111111111111111111 = (i61111111111111111111111111111111119 & i611111111111111111111111111111111110) + (i61111111111111111111111111111111119 | i611111111111111111111111111111111110);
                                                                                                a = i611111111111111111111111111111111111 % 128;
                                                                                                int i611111111111111111111111111111111112 = i611111111111111111111111111111111111 % 2;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } else if (c2 != ';') {
                                                                                    int i511111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i611111111111111111111111111111111113 = (i511111111111113 ^ (-1)) + (i511111111111113 << 1);
                                                                                    i12 = i611111111111111111111111111111111113 % 128;
                                                                                    b = i12;
                                                                                    int i611111111111111111111111111111111114 = i611111111111111111111111111111111113 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i611111111111111111111111111111111115 = i23 - 50;
                                                                                            i23 = ((i611111111111111111111111111111111115 & 51) << 1) + (i611111111111111111111111111111111115 ^ 51);
                                                                                            int i611111111111111111111111111111111116 = i12 & 25;
                                                                                            int i611111111111111111111111111111111117 = (i12 ^ 25) | i611111111111111111111111111111111116;
                                                                                            int i611111111111111111111111111111111118 = (i611111111111111111111111111111111116 & i611111111111111111111111111111111117) + (i611111111111111111111111111111111116 | i611111111111111111111111111111111117);
                                                                                            a = i611111111111111111111111111111111118 % 128;
                                                                                            int i611111111111111111111111111111111119 = i611111111111111111111111111111111118 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (c2 != ':') {
                                                                            int i511111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i511111111111115 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i511111111111114 | i511111111111115) << 1) - (i511111111111114 ^ i511111111111115);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i511111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i6111111111111111111111111111111111110 = (i511111111111116 ^ (-1)) + (i511111111111116 << 1);
                                                                                    i12 = i6111111111111111111111111111111111110 % 128;
                                                                                    b = i12;
                                                                                    int i6111111111111111111111111111111111111 = i6111111111111111111111111111111111110 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i6111111111111111111111111111111111112 = i23 - 50;
                                                                                            i23 = ((i6111111111111111111111111111111111112 & 51) << 1) + (i6111111111111111111111111111111111112 ^ 51);
                                                                                            int i6111111111111111111111111111111111113 = i12 & 25;
                                                                                            int i6111111111111111111111111111111111114 = (i12 ^ 25) | i6111111111111111111111111111111111113;
                                                                                            int i6111111111111111111111111111111111115 = (i6111111111111111111111111111111111113 & i6111111111111111111111111111111111114) + (i6111111111111111111111111111111111113 | i6111111111111111111111111111111111114);
                                                                                            a = i6111111111111111111111111111111111115 % 128;
                                                                                            int i6111111111111111111111111111111111116 = i6111111111111111111111111111111111115 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i511111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i6111111111111111111111111111111111117 = (i511111111111117 ^ (-1)) + (i511111111111117 << 1);
                                                                                i12 = i6111111111111111111111111111111111117 % 128;
                                                                                b = i12;
                                                                                int i6111111111111111111111111111111111118 = i6111111111111111111111111111111111117 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i6111111111111111111111111111111111119 = i23 - 50;
                                                                                        i23 = ((i6111111111111111111111111111111111119 & 51) << 1) + (i6111111111111111111111111111111111119 ^ 51);
                                                                                        int i61111111111111111111111111111111111110 = i12 & 25;
                                                                                        int i61111111111111111111111111111111111111 = (i12 ^ 25) | i61111111111111111111111111111111111110;
                                                                                        int i61111111111111111111111111111111111112 = (i61111111111111111111111111111111111110 & i61111111111111111111111111111111111111) + (i61111111111111111111111111111111111110 | i61111111111111111111111111111111111111);
                                                                                        a = i61111111111111111111111111111111111112 % 128;
                                                                                        int i61111111111111111111111111111111111113 = i61111111111111111111111111111111111112 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (c2 != '{') {
                                                                int i511111111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                a = i511111111111118 % 128;
                                                                int i511111111111119 = i511111111111118 % 2;
                                                                if (c2 != '}') {
                                                                    int i511210 = i8 & 89;
                                                                    int i51211 = -(-((i8 ^ 89) | i511210));
                                                                    i9 = ((i511210 | i51211) << 1) - (i511210 ^ i51211);
                                                                    i10 = i9 % 128;
                                                                    a = i10;
                                                                    if (i9 % 2 == 0) {
                                                                        if (c2 != ',') {
                                                                            int i5111111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i5111111111111111 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i5111111111111110 | i5111111111111111) << 1) - (i5111111111111110 ^ i5111111111111111);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i5111111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111111111111111111111111114 = (i5111111111111112 ^ (-1)) + (i5111111111111112 << 1);
                                                                                    i12 = i61111111111111111111111111111111111114 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111111111111111111111111115 = i61111111111111111111111111111111111114 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111111111111111111111111111111116 = i23 - 50;
                                                                                            i23 = ((i61111111111111111111111111111111111116 & 51) << 1) + (i61111111111111111111111111111111111116 ^ 51);
                                                                                            int i61111111111111111111111111111111111117 = i12 & 25;
                                                                                            int i61111111111111111111111111111111111118 = (i12 ^ 25) | i61111111111111111111111111111111111117;
                                                                                            int i61111111111111111111111111111111111119 = (i61111111111111111111111111111111111117 & i61111111111111111111111111111111111118) + (i61111111111111111111111111111111111117 | i61111111111111111111111111111111111118);
                                                                                            a = i61111111111111111111111111111111111119 % 128;
                                                                                            int i611111111111111111111111111111111111110 = i61111111111111111111111111111111111119 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i5111111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111111111111111111111111111111111 = (i5111111111111113 ^ (-1)) + (i5111111111111113 << 1);
                                                                                i12 = i611111111111111111111111111111111111111 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111111111111111111111112 = i611111111111111111111111111111111111111 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111111111111111111111111113 = i23 - 50;
                                                                                        i23 = ((i611111111111111111111111111111111111113 & 51) << 1) + (i611111111111111111111111111111111111113 ^ 51);
                                                                                        int i611111111111111111111111111111111111114 = i12 & 25;
                                                                                        int i611111111111111111111111111111111111115 = (i12 ^ 25) | i611111111111111111111111111111111111114;
                                                                                        int i611111111111111111111111111111111111116 = (i611111111111111111111111111111111111114 & i611111111111111111111111111111111111115) + (i611111111111111111111111111111111111114 | i611111111111111111111111111111111111115);
                                                                                        a = i611111111111111111111111111111111111116 % 128;
                                                                                        int i611111111111111111111111111111111111117 = i611111111111111111111111111111111111116 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != ':') {
                                                                        int i5111111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                        int i5111111111111115 = -(-((i10 & 17) << 1));
                                                                        i11 = ((i5111111111111114 | i5111111111111115) << 1) - (i5111111111111114 ^ i5111111111111115);
                                                                        b = i11 % 128;
                                                                        if (i11 % 2 != 0) {
                                                                            if (c2 != '\r') {
                                                                                int i5111111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111111111111111111111111111111118 = (i5111111111111116 ^ (-1)) + (i5111111111111116 << 1);
                                                                                i12 = i611111111111111111111111111111111111118 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111111111111111111111119 = i611111111111111111111111111111111111118 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i6111111111111111111111111111111111111110 = i23 - 50;
                                                                                        i23 = ((i6111111111111111111111111111111111111110 & 51) << 1) + (i6111111111111111111111111111111111111110 ^ 51);
                                                                                        int i6111111111111111111111111111111111111111 = i12 & 25;
                                                                                        int i6111111111111111111111111111111111111112 = (i12 ^ 25) | i6111111111111111111111111111111111111111;
                                                                                        int i6111111111111111111111111111111111111113 = (i6111111111111111111111111111111111111111 & i6111111111111111111111111111111111111112) + (i6111111111111111111111111111111111111111 | i6111111111111111111111111111111111111112);
                                                                                        a = i6111111111111111111111111111111111111113 % 128;
                                                                                        int i6111111111111111111111111111111111111114 = i6111111111111111111111111111111111111113 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (c2 != ';') {
                                                                            int i5111111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i6111111111111111111111111111111111111115 = (i5111111111111117 ^ (-1)) + (i5111111111111117 << 1);
                                                                            i12 = i6111111111111111111111111111111111111115 % 128;
                                                                            b = i12;
                                                                            int i6111111111111111111111111111111111111116 = i6111111111111111111111111111111111111115 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i6111111111111111111111111111111111111117 = i23 - 50;
                                                                                    i23 = ((i6111111111111111111111111111111111111117 & 51) << 1) + (i6111111111111111111111111111111111111117 ^ 51);
                                                                                    int i6111111111111111111111111111111111111118 = i12 & 25;
                                                                                    int i6111111111111111111111111111111111111119 = (i12 ^ 25) | i6111111111111111111111111111111111111118;
                                                                                    int i61111111111111111111111111111111111111110 = (i6111111111111111111111111111111111111118 & i6111111111111111111111111111111111111119) + (i6111111111111111111111111111111111111118 | i6111111111111111111111111111111111111119);
                                                                                    a = i61111111111111111111111111111111111111110 % 128;
                                                                                    int i61111111111111111111111111111111111111111 = i61111111111111111111111111111111111111110 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (c2 != ',') {
                                                int i411110 = i5 & 121;
                                                int i411111 = -(-((i5 ^ 121) | i411110));
                                                int i411112 = ((i411110 | i411111) << 1) - (i411111 ^ i411110);
                                                i6 = i411112 % 128;
                                                a = i6;
                                                int i5218 = i411112 % 2;
                                                if (c2 != '/') {
                                                    int i5219 = (-2) - ((i6 + 66) ^ (-1));
                                                    b = i5219 % 128;
                                                    int i52110 = i5219 % 2;
                                                    if (c2 != '=') {
                                                        i7 = i6 + 91;
                                                        i8 = i7 % 128;
                                                        b = i8;
                                                        if (i7 % 2 != 0) {
                                                            if (c2 != ':') {
                                                                int i5111111111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                                a = i5111111111111118 % 128;
                                                                int i5111111111111119 = i5111111111111118 % 2;
                                                                if (c2 != '}') {
                                                                    int i511211 = i8 & 89;
                                                                    int i51212 = -(-((i8 ^ 89) | i511211));
                                                                    i9 = ((i511211 | i51212) << 1) - (i511211 ^ i51212);
                                                                    i10 = i9 % 128;
                                                                    a = i10;
                                                                    if (i9 % 2 == 0) {
                                                                        if (c2 != ',') {
                                                                            int i51111111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                            int i51111111111111111 = -(-((i10 & 17) << 1));
                                                                            i11 = ((i51111111111111110 | i51111111111111111) << 1) - (i51111111111111110 ^ i51111111111111111);
                                                                            b = i11 % 128;
                                                                            if (i11 % 2 != 0) {
                                                                                if (c2 != '\r') {
                                                                                    int i51111111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                    int i61111111111111111111111111111111111111112 = (i51111111111111112 ^ (-1)) + (i51111111111111112 << 1);
                                                                                    i12 = i61111111111111111111111111111111111111112 % 128;
                                                                                    b = i12;
                                                                                    int i61111111111111111111111111111111111111113 = i61111111111111111111111111111111111111112 % 2;
                                                                                    switch (c2) {
                                                                                        case '[':
                                                                                        case ']':
                                                                                            break;
                                                                                        case '\\':
                                                                                            break;
                                                                                        default:
                                                                                            int i61111111111111111111111111111111111111114 = i23 - 50;
                                                                                            i23 = ((i61111111111111111111111111111111111111114 & 51) << 1) + (i61111111111111111111111111111111111111114 ^ 51);
                                                                                            int i61111111111111111111111111111111111111115 = i12 & 25;
                                                                                            int i61111111111111111111111111111111111111116 = (i12 ^ 25) | i61111111111111111111111111111111111111115;
                                                                                            int i61111111111111111111111111111111111111117 = (i61111111111111111111111111111111111111115 & i61111111111111111111111111111111111111116) + (i61111111111111111111111111111111111111115 | i61111111111111111111111111111111111111116);
                                                                                            a = i61111111111111111111111111111111111111117 % 128;
                                                                                            int i61111111111111111111111111111111111111118 = i61111111111111111111111111111111111111117 % 2;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            } else if (c2 != ';') {
                                                                                int i51111111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111111111111111111111111119 = (i51111111111111113 ^ (-1)) + (i51111111111111113 << 1);
                                                                                i12 = i61111111111111111111111111111111111111119 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111111111111111111111111110 = i61111111111111111111111111111111111111119 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111111111111111111111111111111 = i23 - 50;
                                                                                        i23 = ((i611111111111111111111111111111111111111111 & 51) << 1) + (i611111111111111111111111111111111111111111 ^ 51);
                                                                                        int i611111111111111111111111111111111111111112 = i12 & 25;
                                                                                        int i611111111111111111111111111111111111111113 = (i12 ^ 25) | i611111111111111111111111111111111111111112;
                                                                                        int i611111111111111111111111111111111111111114 = (i611111111111111111111111111111111111111112 & i611111111111111111111111111111111111111113) + (i611111111111111111111111111111111111111112 | i611111111111111111111111111111111111111113);
                                                                                        a = i611111111111111111111111111111111111111114 % 128;
                                                                                        int i611111111111111111111111111111111111111115 = i611111111111111111111111111111111111111114 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (c2 != ':') {
                                                                        int i51111111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                        int i51111111111111115 = -(-((i10 & 17) << 1));
                                                                        i11 = ((i51111111111111114 | i51111111111111115) << 1) - (i51111111111111114 ^ i51111111111111115);
                                                                        b = i11 % 128;
                                                                        if (i11 % 2 != 0) {
                                                                            if (c2 != '\r') {
                                                                                int i51111111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i611111111111111111111111111111111111111116 = (i51111111111111116 ^ (-1)) + (i51111111111111116 << 1);
                                                                                i12 = i611111111111111111111111111111111111111116 % 128;
                                                                                b = i12;
                                                                                int i611111111111111111111111111111111111111117 = i611111111111111111111111111111111111111116 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i611111111111111111111111111111111111111118 = i23 - 50;
                                                                                        i23 = ((i611111111111111111111111111111111111111118 & 51) << 1) + (i611111111111111111111111111111111111111118 ^ 51);
                                                                                        int i611111111111111111111111111111111111111119 = i12 & 25;
                                                                                        int i6111111111111111111111111111111111111111110 = (i12 ^ 25) | i611111111111111111111111111111111111111119;
                                                                                        int i6111111111111111111111111111111111111111111 = (i611111111111111111111111111111111111111119 & i6111111111111111111111111111111111111111110) + (i611111111111111111111111111111111111111119 | i6111111111111111111111111111111111111111110);
                                                                                        a = i6111111111111111111111111111111111111111111 % 128;
                                                                                        int i6111111111111111111111111111111111111111112 = i6111111111111111111111111111111111111111111 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (c2 != ';') {
                                                                            int i51111111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i6111111111111111111111111111111111111111113 = (i51111111111111117 ^ (-1)) + (i51111111111111117 << 1);
                                                                            i12 = i6111111111111111111111111111111111111111113 % 128;
                                                                            b = i12;
                                                                            int i6111111111111111111111111111111111111111114 = i6111111111111111111111111111111111111111113 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i6111111111111111111111111111111111111111115 = i23 - 50;
                                                                                    i23 = ((i6111111111111111111111111111111111111111115 & 51) << 1) + (i6111111111111111111111111111111111111111115 ^ 51);
                                                                                    int i6111111111111111111111111111111111111111116 = i12 & 25;
                                                                                    int i6111111111111111111111111111111111111111117 = (i12 ^ 25) | i6111111111111111111111111111111111111111116;
                                                                                    int i6111111111111111111111111111111111111111118 = (i6111111111111111111111111111111111111111116 & i6111111111111111111111111111111111111111117) + (i6111111111111111111111111111111111111111116 | i6111111111111111111111111111111111111111117);
                                                                                    a = i6111111111111111111111111111111111111111118 % 128;
                                                                                    int i6111111111111111111111111111111111111111119 = i6111111111111111111111111111111111111111118 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (c2 != '{') {
                                                            int i51111111111111118 = ((i8 & (-76)) | ((~i8) & 75)) + ((i8 & 75) << 1);
                                                            a = i51111111111111118 % 128;
                                                            int i51111111111111119 = i51111111111111118 % 2;
                                                            if (c2 != '}') {
                                                                int i511212 = i8 & 89;
                                                                int i51213 = -(-((i8 ^ 89) | i511212));
                                                                i9 = ((i511212 | i51213) << 1) - (i511212 ^ i51213);
                                                                i10 = i9 % 128;
                                                                a = i10;
                                                                if (i9 % 2 == 0) {
                                                                    if (c2 != ',') {
                                                                        int i511111111111111110 = (i10 & (-18)) | ((~i10) & 17);
                                                                        int i511111111111111111 = -(-((i10 & 17) << 1));
                                                                        i11 = ((i511111111111111110 | i511111111111111111) << 1) - (i511111111111111110 ^ i511111111111111111);
                                                                        b = i11 % 128;
                                                                        if (i11 % 2 != 0) {
                                                                            if (c2 != '\r') {
                                                                                int i511111111111111112 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                                int i61111111111111111111111111111111111111111110 = (i511111111111111112 ^ (-1)) + (i511111111111111112 << 1);
                                                                                i12 = i61111111111111111111111111111111111111111110 % 128;
                                                                                b = i12;
                                                                                int i61111111111111111111111111111111111111111111 = i61111111111111111111111111111111111111111110 % 2;
                                                                                switch (c2) {
                                                                                    case '[':
                                                                                    case ']':
                                                                                        break;
                                                                                    case '\\':
                                                                                        break;
                                                                                    default:
                                                                                        int i61111111111111111111111111111111111111111112 = i23 - 50;
                                                                                        i23 = ((i61111111111111111111111111111111111111111112 & 51) << 1) + (i61111111111111111111111111111111111111111112 ^ 51);
                                                                                        int i61111111111111111111111111111111111111111113 = i12 & 25;
                                                                                        int i61111111111111111111111111111111111111111114 = (i12 ^ 25) | i61111111111111111111111111111111111111111113;
                                                                                        int i61111111111111111111111111111111111111111115 = (i61111111111111111111111111111111111111111113 & i61111111111111111111111111111111111111111114) + (i61111111111111111111111111111111111111111113 | i61111111111111111111111111111111111111111114);
                                                                                        a = i61111111111111111111111111111111111111111115 % 128;
                                                                                        int i61111111111111111111111111111111111111111116 = i61111111111111111111111111111111111111111115 % 2;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (c2 != ';') {
                                                                            int i511111111111111113 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i61111111111111111111111111111111111111111117 = (i511111111111111113 ^ (-1)) + (i511111111111111113 << 1);
                                                                            i12 = i61111111111111111111111111111111111111111117 % 128;
                                                                            b = i12;
                                                                            int i61111111111111111111111111111111111111111118 = i61111111111111111111111111111111111111111117 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i61111111111111111111111111111111111111111119 = i23 - 50;
                                                                                    i23 = ((i61111111111111111111111111111111111111111119 & 51) << 1) + (i61111111111111111111111111111111111111111119 ^ 51);
                                                                                    int i611111111111111111111111111111111111111111110 = i12 & 25;
                                                                                    int i611111111111111111111111111111111111111111111 = (i12 ^ 25) | i611111111111111111111111111111111111111111110;
                                                                                    int i611111111111111111111111111111111111111111112 = (i611111111111111111111111111111111111111111110 & i611111111111111111111111111111111111111111111) + (i611111111111111111111111111111111111111111110 | i611111111111111111111111111111111111111111111);
                                                                                    a = i611111111111111111111111111111111111111111112 % 128;
                                                                                    int i611111111111111111111111111111111111111111113 = i611111111111111111111111111111111111111111112 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2 != ':') {
                                                                    int i511111111111111114 = (i10 & (-18)) | ((~i10) & 17);
                                                                    int i511111111111111115 = -(-((i10 & 17) << 1));
                                                                    i11 = ((i511111111111111114 | i511111111111111115) << 1) - (i511111111111111114 ^ i511111111111111115);
                                                                    b = i11 % 128;
                                                                    if (i11 % 2 != 0) {
                                                                        if (c2 != '\r') {
                                                                            int i511111111111111116 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                            int i611111111111111111111111111111111111111111114 = (i511111111111111116 ^ (-1)) + (i511111111111111116 << 1);
                                                                            i12 = i611111111111111111111111111111111111111111114 % 128;
                                                                            b = i12;
                                                                            int i611111111111111111111111111111111111111111115 = i611111111111111111111111111111111111111111114 % 2;
                                                                            switch (c2) {
                                                                                case '[':
                                                                                case ']':
                                                                                    break;
                                                                                case '\\':
                                                                                    break;
                                                                                default:
                                                                                    int i611111111111111111111111111111111111111111116 = i23 - 50;
                                                                                    i23 = ((i611111111111111111111111111111111111111111116 & 51) << 1) + (i611111111111111111111111111111111111111111116 ^ 51);
                                                                                    int i611111111111111111111111111111111111111111117 = i12 & 25;
                                                                                    int i611111111111111111111111111111111111111111118 = (i12 ^ 25) | i611111111111111111111111111111111111111111117;
                                                                                    int i611111111111111111111111111111111111111111119 = (i611111111111111111111111111111111111111111117 & i611111111111111111111111111111111111111111118) + (i611111111111111111111111111111111111111111117 | i611111111111111111111111111111111111111111118);
                                                                                    a = i611111111111111111111111111111111111111111119 % 128;
                                                                                    int i6111111111111111111111111111111111111111111110 = i611111111111111111111111111111111111111111119 % 2;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    } else if (c2 != ';') {
                                                                        int i511111111111111117 = (i10 ^ 28) + ((i10 & 28) << 1);
                                                                        int i6111111111111111111111111111111111111111111111 = (i511111111111111117 ^ (-1)) + (i511111111111111117 << 1);
                                                                        i12 = i6111111111111111111111111111111111111111111111 % 128;
                                                                        b = i12;
                                                                        int i6111111111111111111111111111111111111111111112 = i6111111111111111111111111111111111111111111111 % 2;
                                                                        switch (c2) {
                                                                            case '[':
                                                                            case ']':
                                                                                break;
                                                                            case '\\':
                                                                                break;
                                                                            default:
                                                                                int i6111111111111111111111111111111111111111111113 = i23 - 50;
                                                                                i23 = ((i6111111111111111111111111111111111111111111113 & 51) << 1) + (i6111111111111111111111111111111111111111111113 ^ 51);
                                                                                int i6111111111111111111111111111111111111111111114 = i12 & 25;
                                                                                int i6111111111111111111111111111111111111111111115 = (i12 ^ 25) | i6111111111111111111111111111111111111111111114;
                                                                                int i6111111111111111111111111111111111111111111116 = (i6111111111111111111111111111111111111111111114 & i6111111111111111111111111111111111111111111115) + (i6111111111111111111111111111111111111111111114 | i6111111111111111111111111111111111111111111115);
                                                                                a = i6111111111111111111111111111111111111111111116 % 128;
                                                                                int i6111111111111111111111111111111111111111111117 = i6111111111111111111111111111111111111111111116 % 2;
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        f();
                                        int i715 = a;
                                        int i716 = (i715 & (-16)) | ((~i715) & 15);
                                        int i717 = -(-((i715 & 15) << 1));
                                        int i718 = ((i716 | i717) << 1) - (i717 ^ i716);
                                        b = i718 % 128;
                                        int i719 = i718 % 2;
                                    }
                                }
                            }
                        }
                    }
                    int i80 = a;
                    int i81 = (i80 ^ 53) + ((i80 & 53) << 1);
                    b = i81 % 128;
                    int i82 = i81 % 2;
                } else if (i23 < this.g.length) {
                    int i83 = b + 43;
                    a = i83 % 128;
                    int i84 = i83 % 2;
                    if (!j(i23 + 1)) {
                        int i85 = a;
                        int i86 = (i85 ^ 53) + ((i85 & 53) << 1);
                        b = i86 % 128;
                        int i87 = i86 % 2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i23, 16));
                        int i88 = b;
                        int i89 = (i88 ^ 91) + ((i88 & 91) << 1);
                        a = i89 % 128;
                        int i90 = i89 % 2;
                        int i91 = ((i88 & 111) - (~(i88 | 111))) - 1;
                        a = i91 % 128;
                        int i92 = i91 % 2;
                    }
                    sb.append(this.g, this.i, i23);
                    int i93 = b;
                    int i94 = i93 & 115;
                    int i95 = -(-(i93 | 115));
                    int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                    a = i96 % 128;
                    int i97 = i96 % 2;
                    int i98 = this.i;
                    int i99 = i98 ^ i25;
                    int i100 = ((i98 & i25) | i99) << 1;
                    int i101 = -i99;
                    this.i = (i100 & i101) + (i100 | i101);
                    if (!j(1)) {
                        int i102 = a;
                        int i103 = i102 & 33;
                        int i104 = (((i102 ^ 33) | i103) << 1) - ((i102 | 33) & (~i103));
                        int i105 = i104 % 128;
                        b = i105;
                        int i106 = i104 % 2;
                        int i107 = ((i105 | 37) << 1) - (i105 ^ 37);
                        a = i107 % 128;
                        int i108 = i107 % 2;
                        i23 = 0;
                    }
                }
                if (sb == null) {
                    str = new String(this.g, this.i, i23);
                    int i109 = a;
                    int i110 = i109 & 119;
                    int i111 = (((i109 ^ 119) | i110) << 1) - ((i109 | 119) & (~i110));
                    b = i111 % 128;
                    if (i111 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    sb.append(this.g, this.i, i23);
                    int i112 = b;
                    int i113 = ((i112 | 121) << 1) - (i112 ^ 121);
                    a = i113 % 128;
                    if (i113 % 2 == 0) {
                        string = sb.toString();
                        int i114 = 47 / 0;
                    } else {
                        string = sb.toString();
                    }
                    str = string;
                    int i115 = a;
                    int i116 = i115 ^ 83;
                    int i117 = ((i115 & 83) | i116) << 1;
                    int i118 = -i116;
                    int i119 = ((i117 | i118) << 1) - (i117 ^ i118);
                    b = i119 % 128;
                    int i120 = i119 % 2;
                }
                int i121 = this.i;
                int i122 = -(-i23);
                int i123 = i121 & i122;
                this.i = ((i121 | i122) & (~i123)) + (i123 << 1);
                int i124 = b;
                int i125 = i124 & 29;
                int i126 = (i124 ^ 29) | i125;
                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                a = i127 % 128;
                int i128 = i127 % 2;
                return str;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x016a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0189  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0208, code lost:
    
        if (java.lang.Double.isInfinite(r1) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double p() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p032be.j.p():double");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029b  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0311  */
    /* JADX WARN: Code duplicated, block: B:133:0x0330  */
    /* JADX WARN: Code duplicated, block: B:141:0x0363 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:142:0x0364  */
    /* JADX WARN: Code duplicated, block: B:145:0x0389  */
    /* JADX WARN: Code duplicated, block: B:148:0x038e  */
    /* JADX WARN: Code duplicated, block: B:150:0x039c  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c5 A[PHI: r9 r10
  0x03c5: PHI (r9v21 int) = (r9v20 int), (r9v26 int) binds: [B:144:0x0387, B:150:0x039c] A[DONT_GENERATE, DONT_INLINE]
  0x03c5: PHI (r10v17 int) = (r10v16 int), (r10v27 int) binds: [B:144:0x0387, B:150:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x0417  */
    /* JADX WARN: Code duplicated, block: B:171:0x0424 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0426  */
    /* JADX WARN: Code duplicated, block: B:174:0x043b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0442 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0444  */
    /* JADX WARN: Code duplicated, block: B:180:0x044d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:201:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:203:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:204:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:210:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0509  */
    /* JADX WARN: Code duplicated, block: B:218:0x050f  */
    /* JADX WARN: Code duplicated, block: B:223:0x052c  */
    /* JADX WARN: Code duplicated, block: B:224:0x052e  */
    /* JADX WARN: Code duplicated, block: B:234:0x056a  */
    /* JADX WARN: Code duplicated, block: B:236:0x056d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0582 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x0586  */
    /* JADX WARN: Code duplicated, block: B:246:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:258:0x0607  */
    /* JADX WARN: Code duplicated, block: B:260:0x060f  */
    /* JADX WARN: Code duplicated, block: B:262:0x061f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0623  */
    /* JADX WARN: Code duplicated, block: B:268:0x0628  */
    /* JADX WARN: Code duplicated, block: B:270:0x062b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0655  */
    /* JADX WARN: Code duplicated, block: B:279:0x0665  */
    /* JADX WARN: Code duplicated, block: B:281:0x0675 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:282:0x0676  */
    /* JADX WARN: Code duplicated, block: B:284:0x067b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0687  */
    /* JADX WARN: Code duplicated, block: B:288:0x068f  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:357:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:360:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0657 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x02fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public int g() throws IOException {
        ?? r1;
        int iT;
        int i;
        int i2;
        char[] cArr;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        int length;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        char[] cArr2;
        boolean z;
        int i13;
        int i14;
        int i15;
        int i16;
        char c3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35 = 2;
        int i36 = 2 % 2;
        int i37 = a;
        int i38 = 1;
        int i39 = ((i37 ^ 87) | (i37 & 87)) << 1;
        int i40 = -((i37 & (-88)) | ((~i37) & 87));
        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
        int i42 = i41 % 128;
        b = i42;
        if (i41 % 2 != 0) {
            throw null;
        }
        int[] iArr = this.p;
        int i43 = this.f72o;
        int i44 = i43 ^ (-1);
        int i45 = i44 | i43;
        int i46 = iArr[(i43 ^ i45) + ((i43 & i45) << 1)];
        int i47 = 5;
        if (i46 == 1) {
            iArr[i44 + (i43 << 1)] = 2;
        } else if (i46 == 2) {
            int iT2 = t(true);
            if (iT2 != 44) {
                if (iT2 != 59) {
                    if (iT2 == 93) {
                        this.d = 4;
                        return 4;
                    }
                    D("Unterminated array");
                    throw null;
                }
                f();
            }
        } else {
            if (i46 == 3 || i46 == 5) {
                iArr[(i43 ^ (-1)) + (i43 << 1)] = 4;
                if (i46 != 5 || (iT = t(true)) == 44) {
                    r1 = 1;
                } else {
                    int i48 = b;
                    int i49 = i48 & 5;
                    int i50 = (i48 ^ 5) | i49;
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    int i52 = i51 % 128;
                    a = i52;
                    int i53 = i51 % 2;
                    if (iT != 59) {
                        if (iT != 125) {
                            D("Unterminated object");
                            throw null;
                        }
                        int i54 = i52 & 13;
                        int i55 = (i54 - (~((i52 ^ 13) | i54))) - 1;
                        b = i55 % 128;
                        int i56 = i55 % 2;
                        this.d = 2;
                        return 2;
                    }
                    f();
                    r1 = 1;
                }
                int iT3 = t(r1);
                if (iT3 == 34) {
                    this.d = 13;
                    return 13;
                }
                if (iT3 == 39) {
                    f();
                    this.d = 12;
                    return 12;
                }
                int i57 = a;
                int i58 = ((i57 ^ 13) | (i57 & 13)) << r1;
                int i59 = -(((~i57) & 13) | (i57 & (-14)));
                int i60 = (i58 ^ i59) + ((i59 & i58) << r1);
                b = i60 % 128;
                if (i60 % 2 == 0 ? iT3 == 125 : iT3 == 94) {
                    if (i46 != 5) {
                        this.d = 2;
                        return 2;
                    }
                    D("Expected name");
                    throw null;
                }
                f();
                this.i--;
                if (l((char) iT3)) {
                    this.d = 14;
                    return 14;
                }
                D("Expected name");
                throw null;
            }
            if (i46 == 4) {
                iArr[i43 + i45] = 5;
                int iT4 = t(true);
                if (iT4 != 58) {
                    if (iT4 != 61) {
                        D("Expected ':'");
                        throw null;
                    }
                    int i61 = b + 77;
                    a = i61 % 128;
                    int i62 = i61 % 2;
                    f();
                    if (this.i >= this.h) {
                        int i63 = b;
                        int i64 = i63 & 115;
                        int i65 = (i63 ^ 115) | i64;
                        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                        a = i66 % 128;
                        if (i66 % 2 != 0 ? j(1) : j(0)) {
                            cArr = this.g;
                            i3 = this.i;
                            if (cArr[i3] == '>') {
                                int i67 = b + 31;
                                a = i67 % 128;
                                int i68 = i67 % 2;
                                int i69 = (i3 & (-2)) | ((~i3) & 1);
                                int i70 = (i3 & 1) << 1;
                                this.i = (i69 ^ i70) + ((i69 & i70) << 1);
                            }
                        }
                    } else {
                        cArr = this.g;
                        i3 = this.i;
                        if (cArr[i3] == '>') {
                            int i610 = b + 31;
                            a = i610 % 128;
                            int i611 = i610 % 2;
                            int i612 = (i3 & (-2)) | ((~i3) & 1);
                            int i71 = (i3 & 1) << 1;
                            this.i = (i612 ^ i71) + ((i612 & i71) << 1);
                        }
                    }
                }
            } else if (i46 == 6) {
                int i72 = i42 + 73;
                a = i72 % 128;
                int i73 = i72 % 2;
                if (this.f) {
                    t(true);
                    int i74 = (-2) - (this.i ^ (-1));
                    this.i = i74;
                    char[] cArr3 = c;
                    int i75 = -(~cArr3.length);
                    int i76 = (i74 & i75) + (i74 | i75);
                    int i77 = (i76 ^ (-1)) + (i76 << 1);
                    int i78 = b;
                    int i79 = (i78 & 53) + (i78 | 53);
                    a = i79 % 128;
                    int i80 = i79 % 2;
                    if (i77 <= this.h || j(cArr3.length)) {
                        int i81 = 0;
                        while (true) {
                            char[] cArr4 = c;
                            if (i81 >= cArr4.length) {
                                int i82 = this.i;
                                int i83 = -(-cArr4.length);
                                this.i = ((i82 | i83) << 1) - (i82 ^ i83);
                                break;
                            }
                            char[] cArr5 = this.g;
                            int i84 = this.i;
                            if (cArr5[(i84 & i81) + (i84 | i81)] != cArr4[i81]) {
                                break;
                            }
                            int i85 = b;
                            int i86 = ((i85 | 13) << 1) - (i85 ^ 13);
                            a = i86 % 128;
                            if (i86 % 2 == 0) {
                                int i87 = i81 ^ 67;
                                int i88 = (((i81 & 67) | i87) << 1) - i87;
                                int i89 = (i88 & (-23)) | ((~i88) & 22);
                                int i90 = (i88 & 22) << 1;
                                i = i89 & i90;
                                i2 = i90 | i89;
                            } else {
                                int i91 = (i81 & 48) | ((~i81) & (-49));
                                int i92 = (i81 & (-49)) << 1;
                                int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                                int i94 = ((i93 ^ 50) | (i93 & 50)) << 1;
                                int i95 = -((i93 & (-51)) | ((~i93) & 50));
                                i = i94 ^ i95;
                                i2 = (i94 & i95) << 1;
                            }
                            i81 = i2 + i;
                        }
                    }
                }
                int[] iArr2 = this.p;
                int i96 = this.f72o;
                iArr2[(i96 ^ (-1)) + (i96 << 1)] = 7;
                int i97 = b;
                int i98 = (i97 & 20) + (i97 | 20);
                int i99 = (i98 ^ (-1)) + (i98 << 1);
                a = i99 % 128;
                int i100 = i99 % 2;
            } else if (i46 == 7) {
                int i101 = i37 & 79;
                int i102 = i101 + ((i37 ^ 79) | i101);
                b = i102 % 128;
                int i103 = i102 % 2;
                if (t(false) == -1) {
                    int i104 = b;
                    int i105 = (i104 | 99) << 1;
                    int i106 = -(i104 ^ 99);
                    int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    this.d = 17;
                    return 17;
                }
                f();
                int i109 = this.i;
                this.i = (~i109) + (i109 << 1);
                int i110 = b;
                int i111 = (i110 & 125) + (i110 | 125);
                a = i111 % 128;
                int i112 = i111 % 2;
            } else if (i46 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iT5 = t(true);
        if (iT5 == 34) {
            this.d = 9;
            return 9;
        }
        if (iT5 == 39) {
            f();
            this.d = 8;
            return 8;
        }
        char c4 = '9';
        if (iT5 != 44) {
            int i113 = b;
            int i114 = i113 | 15;
            int i115 = i114 << 1;
            int i116 = -(i114 & (~(i113 & 15)));
            int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
            a = i117 % 128;
            if (i117 % 2 != 0 ? iT5 == 59 : iT5 == 35) {
                i4 = 1;
            } else {
                if (iT5 == 91) {
                    this.d = 3;
                    return 3;
                }
                int i118 = i113 & 61;
                int i119 = (i113 ^ 61) | i118;
                int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                int i121 = i120 % 128;
                a = i121;
                if (i120 % 2 != 0 ? iT5 != 93 : iT5 != 30) {
                    if (iT5 == 123) {
                        this.d = 1;
                        return 1;
                    }
                    int i122 = -(this.i ^ (-1));
                    int i123 = ((-2) & i122) + ((-2) | i122);
                    this.i = i123;
                    char c5 = this.g[i123];
                    if (c5 != 't') {
                        int i124 = (i121 ^ 95) + ((i121 & 95) << 1);
                        b = i124 % 128;
                        int i125 = i124 % 2;
                        if (c5 != 'T') {
                            int i126 = ((((i121 ^ 57) | (i121 & 57)) << 1) - (~(-(((~i121) & 57) | (i121 & (-58)))))) - 1;
                            int i127 = i126 % 128;
                            b = i127;
                            int i128 = i126 % 2;
                            if (c5 != 'f') {
                                int i129 = ((i127 | 115) << 1) - (i127 ^ 115);
                                int i130 = i129 % 128;
                                a = i130;
                                if (i129 % 2 != 0 ? c5 == 'F' : c5 == '(') {
                                    str = "false";
                                    str2 = "FALSE";
                                    i5 = 6;
                                } else {
                                    if (c5 != 'n') {
                                        int i131 = (i130 ^ 113) + ((i130 & 113) << 1);
                                        b = i131 % 128;
                                        int i132 = i131 % 2;
                                        if (c5 == 'N') {
                                        }
                                        if (i5 != 0) {
                                            return i5;
                                        }
                                        cArr2 = this.g;
                                        int i133 = this.i;
                                        int i134 = this.h;
                                        int i135 = a;
                                        int i136 = ((i135 & (-112)) | ((~i135) & 111)) + ((i135 & 111) << 1);
                                        b = i136 % 128;
                                        int i137 = i136 % 2;
                                        z = true;
                                        i13 = i134;
                                        long j = 0;
                                        i14 = 0;
                                        boolean z3 = false;
                                        i15 = i133;
                                        i16 = 0;
                                        while (true) {
                                            if (i15 + i16 != i13) {
                                                c3 = cArr2[(i15 - (~i16)) - i38];
                                                if (c3 != '+') {
                                                    int i138 = a;
                                                    int i139 = i138 & 15;
                                                    int i140 = ((~i139) & (i138 | 15)) + (i139 << i38);
                                                    i19 = i140 % 128;
                                                    b = i19;
                                                    int i141 = i140 % i35;
                                                    if (c3 != 'E' || c3 == 'e') {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i142 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i142 ^ 76) + ((i142 & 76) << 1);
                                                        int i143 = b;
                                                        int i144 = (i143 | 37) << 1;
                                                        int i145 = -(i143 ^ 37);
                                                        i18 = (i144 & i145) + (i145 | i144);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i146 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    } else if (c3 != '-') {
                                                        int i147 = ((i19 ^ 60) + ((i19 & 60) << i38)) - i38;
                                                        int i148 = i147 % 128;
                                                        a = i148;
                                                        int i149 = i147 % i35;
                                                        if (c3 != '.') {
                                                            int i150 = i148 & 23;
                                                            int i151 = (((i148 ^ 23) | i150) << i38) - ((~i150) & (i148 | 23));
                                                            b = i151 % 128;
                                                            if (i151 % i35 != 0) {
                                                                if (c3 >= 27) {
                                                                    int i152 = ((i148 | 51) << i38) - (i148 ^ 51);
                                                                    b = i152 % 128;
                                                                    int i153 = i152 % i35;
                                                                    if (c3 <= c4) {
                                                                        if (i14 != i38) {
                                                                            int i154 = i148 & 15;
                                                                            int i155 = -(-((i148 ^ 15) | i154));
                                                                            i23 = ((i154 | i155) << 1) - (i154 ^ i155);
                                                                            b = i23 % 128;
                                                                            if (i23 % i35 != 0) {
                                                                                int i156 = 19 / 0;
                                                                                if (i14 != 0) {
                                                                                    i24 = i148 + 45;
                                                                                    i25 = i24 % 128;
                                                                                    b = i25;
                                                                                    if (i24 % i35 != 0 ? i14 != i35 : i14 != 5) {
                                                                                        cArr2 = cArr2;
                                                                                        if (i14 == 3) {
                                                                                            i27 = i25 + 65;
                                                                                            a = i27 % 128;
                                                                                            if (i27 % 2 == 0) {
                                                                                                i28 = 3;
                                                                                            } else {
                                                                                                i28 = 4;
                                                                                            }
                                                                                            i14 = i28;
                                                                                        } else if (i14 != 5 || i14 == 6) {
                                                                                            i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                            a = i26 % 128;
                                                                                            if (i26 % 2 == 0) {
                                                                                                int i157 = 5 % 5;
                                                                                            }
                                                                                            i14 = 7;
                                                                                        }
                                                                                    } else if (j != 0) {
                                                                                        int i158 = (-2) - (((i148 ^ 94) + ((i148 & 94) << i38)) ^ (-1));
                                                                                        b = i158 % 128;
                                                                                        long j2 = i158 % i35 != 0 ? (j ^ 10) / ((long) (c3 << '0')) : (10 * j) - ((long) ((((c3 ^ (-48)) | (c3 & (-48))) << i38) - ((c3 & '/') | ((-48) & (~c3)))));
                                                                                        if (j <= -922337203685477580L) {
                                                                                            int i159 = ((i148 ^ 114) + ((i148 & 114) << 1)) - 1;
                                                                                            b = i159 % 128;
                                                                                            int i160 = i159 % 2;
                                                                                            if (j == -922337203685477580L) {
                                                                                                int i161 = (i148 & (-42)) | ((~i148) & 41);
                                                                                                int i162 = (i148 & 41) << 1;
                                                                                                int i163 = (i161 ^ i162) + ((i161 & i162) << 1);
                                                                                                b = i163 % 128;
                                                                                                int i164 = i163 % 2;
                                                                                                if (j2 < j) {
                                                                                                    z2 = true;
                                                                                                }
                                                                                            }
                                                                                            int i165 = i148 & 29;
                                                                                            int i166 = i165 + ((i148 ^ 29) | i165);
                                                                                            b = i166 % 128;
                                                                                            int i167 = i166 % 2;
                                                                                            z2 = false;
                                                                                        } else {
                                                                                            z2 = true;
                                                                                        }
                                                                                        j = j2;
                                                                                        z &= z2;
                                                                                    }
                                                                                } else {
                                                                                    cArr2 = cArr2;
                                                                                    j = -(c3 - '0');
                                                                                    int i168 = i148 + 99;
                                                                                    b = i168 % 128;
                                                                                    int i169 = i168 % 2;
                                                                                    i14 = 2;
                                                                                }
                                                                            } else if (i14 != 0) {
                                                                                i24 = i148 + 45;
                                                                                i25 = i24 % 128;
                                                                                b = i25;
                                                                                if (i24 % i35 != 0) {
                                                                                    cArr2 = cArr2;
                                                                                    if (i14 == 3) {
                                                                                        i27 = i25 + 65;
                                                                                        a = i27 % 128;
                                                                                        if (i27 % 2 == 0) {
                                                                                            i28 = 3;
                                                                                        } else {
                                                                                            i28 = 4;
                                                                                        }
                                                                                        i14 = i28;
                                                                                    } else {
                                                                                        if (i14 != 5) {
                                                                                        }
                                                                                        i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                        a = i26 % 128;
                                                                                        if (i26 % 2 == 0) {
                                                                                            int i1510 = 5 % 5;
                                                                                        }
                                                                                        i14 = 7;
                                                                                    }
                                                                                } else {
                                                                                    cArr2 = cArr2;
                                                                                    if (i14 == 3) {
                                                                                        i27 = i25 + 65;
                                                                                        a = i27 % 128;
                                                                                        if (i27 % 2 == 0) {
                                                                                            i28 = 3;
                                                                                        } else {
                                                                                            i28 = 4;
                                                                                        }
                                                                                        i14 = i28;
                                                                                    } else {
                                                                                        if (i14 != 5) {
                                                                                        }
                                                                                        i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                        a = i26 % 128;
                                                                                        if (i26 % 2 == 0) {
                                                                                            int i1511 = 5 % 5;
                                                                                        }
                                                                                        i14 = 7;
                                                                                    }
                                                                                }
                                                                                int i1410 = (i16 & (-75)) + (i16 | (-75));
                                                                                i16 = (i1410 ^ 76) + ((i1410 & 76) << 1);
                                                                                int i1411 = b;
                                                                                int i1412 = (i1411 | 37) << 1;
                                                                                int i1413 = -(i1411 ^ 37);
                                                                                i18 = (i1412 & i1413) + (i1413 | i1412);
                                                                                a = i18 % 128;
                                                                                if (i18 % 2 == 0) {
                                                                                    int i1414 = 3 % 2;
                                                                                }
                                                                                cArr2 = cArr2;
                                                                                i35 = 2;
                                                                                c4 = '9';
                                                                                i38 = 1;
                                                                                i47 = 5;
                                                                            } else {
                                                                                cArr2 = cArr2;
                                                                                j = -(c3 - '0');
                                                                                int i1610 = i148 + 99;
                                                                                b = i1610 % 128;
                                                                                int i1611 = i1610 % 2;
                                                                                i14 = 2;
                                                                            }
                                                                        } else {
                                                                            cArr2 = cArr2;
                                                                            j = -(c3 - '0');
                                                                            int i1612 = i148 + 99;
                                                                            b = i1612 % 128;
                                                                            int i1613 = i1612 % 2;
                                                                            i14 = 2;
                                                                        }
                                                                        int i1415 = (i16 & (-75)) + (i16 | (-75));
                                                                        i16 = (i1415 ^ 76) + ((i1415 & 76) << 1);
                                                                        int i1416 = b;
                                                                        int i1417 = (i1416 | 37) << 1;
                                                                        int i1418 = -(i1416 ^ 37);
                                                                        i18 = (i1417 & i1418) + (i1418 | i1417);
                                                                        a = i18 % 128;
                                                                        if (i18 % 2 == 0) {
                                                                            int i1419 = 3 % 2;
                                                                        }
                                                                        cArr2 = cArr2;
                                                                        i35 = 2;
                                                                        c4 = '9';
                                                                        i38 = 1;
                                                                        i47 = 5;
                                                                    }
                                                                }
                                                            } else if (c3 >= '0') {
                                                                int i1512 = ((i148 | 51) << i38) - (i148 ^ 51);
                                                                b = i1512 % 128;
                                                                int i1513 = i1512 % i35;
                                                                if (c3 <= c4) {
                                                                    if (i14 != i38) {
                                                                        int i1514 = i148 & 15;
                                                                        int i1515 = -(-((i148 ^ 15) | i1514));
                                                                        i23 = ((i1514 | i1515) << 1) - (i1514 ^ i1515);
                                                                        b = i23 % 128;
                                                                        if (i23 % i35 != 0) {
                                                                            int i1516 = 19 / 0;
                                                                            if (i14 != 0) {
                                                                                i24 = i148 + 45;
                                                                                i25 = i24 % 128;
                                                                                b = i25;
                                                                                if (i24 % i35 != 0) {
                                                                                    cArr2 = cArr2;
                                                                                    if (i14 == 3) {
                                                                                        i27 = i25 + 65;
                                                                                        a = i27 % 128;
                                                                                        if (i27 % 2 == 0) {
                                                                                            i28 = 3;
                                                                                        } else {
                                                                                            i28 = 4;
                                                                                        }
                                                                                        i14 = i28;
                                                                                    } else {
                                                                                        if (i14 != 5) {
                                                                                        }
                                                                                        i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                        a = i26 % 128;
                                                                                        if (i26 % 2 == 0) {
                                                                                            int i1517 = 5 % 5;
                                                                                        }
                                                                                        i14 = 7;
                                                                                    }
                                                                                } else {
                                                                                    cArr2 = cArr2;
                                                                                    if (i14 == 3) {
                                                                                        i27 = i25 + 65;
                                                                                        a = i27 % 128;
                                                                                        if (i27 % 2 == 0) {
                                                                                            i28 = 3;
                                                                                        } else {
                                                                                            i28 = 4;
                                                                                        }
                                                                                        i14 = i28;
                                                                                    } else {
                                                                                        if (i14 != 5) {
                                                                                        }
                                                                                        i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                        a = i26 % 128;
                                                                                        if (i26 % 2 == 0) {
                                                                                            int i1518 = 5 % 5;
                                                                                        }
                                                                                        i14 = 7;
                                                                                    }
                                                                                }
                                                                                int i14110 = (i16 & (-75)) + (i16 | (-75));
                                                                                i16 = (i14110 ^ 76) + ((i14110 & 76) << 1);
                                                                                int i14111 = b;
                                                                                int i14112 = (i14111 | 37) << 1;
                                                                                int i14113 = -(i14111 ^ 37);
                                                                                i18 = (i14112 & i14113) + (i14113 | i14112);
                                                                                a = i18 % 128;
                                                                                if (i18 % 2 == 0) {
                                                                                    int i14114 = 3 % 2;
                                                                                }
                                                                                cArr2 = cArr2;
                                                                                i35 = 2;
                                                                                c4 = '9';
                                                                                i38 = 1;
                                                                                i47 = 5;
                                                                            } else {
                                                                                cArr2 = cArr2;
                                                                                j = -(c3 - '0');
                                                                                int i1614 = i148 + 99;
                                                                                b = i1614 % 128;
                                                                                int i1615 = i1614 % 2;
                                                                                i14 = 2;
                                                                            }
                                                                        } else if (i14 != 0) {
                                                                            i24 = i148 + 45;
                                                                            i25 = i24 % 128;
                                                                            b = i25;
                                                                            if (i24 % i35 != 0) {
                                                                                cArr2 = cArr2;
                                                                                if (i14 == 3) {
                                                                                    i27 = i25 + 65;
                                                                                    a = i27 % 128;
                                                                                    if (i27 % 2 == 0) {
                                                                                        i28 = 3;
                                                                                    } else {
                                                                                        i28 = 4;
                                                                                    }
                                                                                    i14 = i28;
                                                                                } else {
                                                                                    if (i14 != 5) {
                                                                                    }
                                                                                    i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                    a = i26 % 128;
                                                                                    if (i26 % 2 == 0) {
                                                                                        int i1519 = 5 % 5;
                                                                                    }
                                                                                    i14 = 7;
                                                                                }
                                                                            } else {
                                                                                cArr2 = cArr2;
                                                                                if (i14 == 3) {
                                                                                    i27 = i25 + 65;
                                                                                    a = i27 % 128;
                                                                                    if (i27 % 2 == 0) {
                                                                                        i28 = 3;
                                                                                    } else {
                                                                                        i28 = 4;
                                                                                    }
                                                                                    i14 = i28;
                                                                                } else {
                                                                                    if (i14 != 5) {
                                                                                    }
                                                                                    i26 = (-2) - ((((i25 | 102) << 1) - (i25 ^ 102)) ^ (-1));
                                                                                    a = i26 % 128;
                                                                                    if (i26 % 2 == 0) {
                                                                                        int i15110 = 5 % 5;
                                                                                    }
                                                                                    i14 = 7;
                                                                                }
                                                                            }
                                                                            int i14115 = (i16 & (-75)) + (i16 | (-75));
                                                                            i16 = (i14115 ^ 76) + ((i14115 & 76) << 1);
                                                                            int i14116 = b;
                                                                            int i14117 = (i14116 | 37) << 1;
                                                                            int i14118 = -(i14116 ^ 37);
                                                                            i18 = (i14117 & i14118) + (i14118 | i14117);
                                                                            a = i18 % 128;
                                                                            if (i18 % 2 == 0) {
                                                                                int i14119 = 3 % 2;
                                                                            }
                                                                            cArr2 = cArr2;
                                                                            i35 = 2;
                                                                            c4 = '9';
                                                                            i38 = 1;
                                                                            i47 = 5;
                                                                        } else {
                                                                            cArr2 = cArr2;
                                                                            j = -(c3 - '0');
                                                                            int i1616 = i148 + 99;
                                                                            b = i1616 % 128;
                                                                            int i1617 = i1616 % 2;
                                                                            i14 = 2;
                                                                        }
                                                                    } else {
                                                                        cArr2 = cArr2;
                                                                        j = -(c3 - '0');
                                                                        int i1618 = i148 + 99;
                                                                        b = i1618 % 128;
                                                                        int i1619 = i1618 % 2;
                                                                        i14 = 2;
                                                                    }
                                                                    int i141110 = (i16 & (-75)) + (i16 | (-75));
                                                                    i16 = (i141110 ^ 76) + ((i141110 & 76) << 1);
                                                                    int i141111 = b;
                                                                    int i141112 = (i141111 | 37) << 1;
                                                                    int i141113 = -(i141111 ^ 37);
                                                                    i18 = (i141112 & i141113) + (i141113 | i141112);
                                                                    a = i18 % 128;
                                                                    if (i18 % 2 == 0) {
                                                                        int i141114 = 3 % 2;
                                                                    }
                                                                    cArr2 = cArr2;
                                                                    i35 = 2;
                                                                    c4 = '9';
                                                                    i38 = 1;
                                                                    i47 = 5;
                                                                }
                                                            }
                                                            if (!l(c3)) {
                                                                if (i14 == i35) {
                                                                    if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                                        i31 = 2;
                                                                    } else {
                                                                        if (!z3) {
                                                                            j = -j;
                                                                        }
                                                                        this.l = j;
                                                                        int i170 = this.i;
                                                                        int i171 = b;
                                                                        int i172 = (i171 | 19) << 1;
                                                                        int i173 = -(((~i171) & 19) | (i171 & (-20)));
                                                                        int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                                                                        a = i174 % 128;
                                                                        int i175 = i174 % 2;
                                                                        this.i = (i170 - (~i16)) - 1;
                                                                        i29 = 15;
                                                                        this.d = 15;
                                                                    }
                                                                }
                                                                if (i14 != i31) {
                                                                    i31 = i35;
                                                                    int i176 = b;
                                                                    int i177 = (i176 ^ 106) + ((i176 & 106) << 1);
                                                                    i33 = (i177 ^ (-1)) + (i177 << 1);
                                                                    a = i33 % 128;
                                                                    if (i33 % 2 == 0 ? i14 != 4 : i14 != 2) {
                                                                        if (i14 == 7) {
                                                                        }
                                                                    }
                                                                }
                                                                i31 = i35;
                                                                this.m = i16;
                                                                int i178 = a;
                                                                int i179 = i178 ^ 109;
                                                                int i180 = -(-((i178 & 109) << 1));
                                                                i32 = ((i179 | i180) << 1) - (i180 ^ i179);
                                                                int i181 = i32 % 128;
                                                                b = i181;
                                                                if (i32 % 2 != 0) {
                                                                    this.d = 16;
                                                                    int i182 = 17 / 0;
                                                                } else {
                                                                    this.d = 16;
                                                                }
                                                                int i183 = (-2) - ((-1) ^ ((i181 ^ 18) + ((i181 & 18) << 1)));
                                                                a = i183 % 128;
                                                                int i184 = i183 % 2;
                                                                i29 = 16;
                                                            }
                                                        } else {
                                                            cArr2 = cArr2;
                                                            if (i14 == i35) {
                                                                i14 = 3;
                                                                int i141115 = (i16 & (-75)) + (i16 | (-75));
                                                                i16 = (i141115 ^ 76) + ((i141115 & 76) << 1);
                                                                int i141116 = b;
                                                                int i141117 = (i141116 | 37) << 1;
                                                                int i141118 = -(i141116 ^ 37);
                                                                i18 = (i141117 & i141118) + (i141118 | i141117);
                                                                a = i18 % 128;
                                                                if (i18 % 2 == 0) {
                                                                    int i141119 = 3 % 2;
                                                                }
                                                                cArr2 = cArr2;
                                                                i35 = 2;
                                                                c4 = '9';
                                                                i38 = 1;
                                                                i47 = 5;
                                                            }
                                                        }
                                                    } else {
                                                        cArr2 = cArr2;
                                                        i17 = 6;
                                                        if (i14 == 0) {
                                                            i14 = 1;
                                                            z3 = true;
                                                        } else if (i14 == 5) {
                                                            int i185 = (i138 & (-62)) | ((~i138) & 61);
                                                            int i186 = -(-((i138 & 61) << 1));
                                                            int i187 = (i185 & i186) + (i185 | i186);
                                                            b = i187 % 128;
                                                            int i188 = i187 % 2;
                                                            int i189 = i138 & 105;
                                                            int i190 = -(-((i138 ^ 105) | i189));
                                                            int i191 = (i189 & i190) + (i189 | i190);
                                                            b = i191 % 128;
                                                            int i192 = i191 % 2;
                                                            i14 = i17;
                                                        }
                                                        int i1411110 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i1411110 ^ 76) + ((i1411110 & 76) << 1);
                                                        int i1411111 = b;
                                                        int i1411112 = (i1411111 | 37) << 1;
                                                        int i1411113 = -(i1411111 ^ 37);
                                                        i18 = (i1411112 & i1411113) + (i1411113 | i1411112);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i1411114 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i193 = b;
                                                    int i194 = i193 & 101;
                                                    i30 = i194 + ((i193 ^ 101) | i194);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj = null;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                cArr2 = cArr2;
                                                i17 = 6;
                                                if (i14 != i47) {
                                                }
                                                i14 = i17;
                                                int i1411115 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i1411115 ^ 76) + ((i1411115 & 76) << 1);
                                                int i1411116 = b;
                                                int i1411117 = (i1411116 | 37) << 1;
                                                int i1411118 = -(i1411116 ^ 37);
                                                i18 = (i1411117 & i1411118) + (i1411118 | i1411117);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i1411119 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            } else if (i16 == cArr2.length) {
                                                i34 = i16 & 1;
                                                if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                                    int i195 = this.i;
                                                    int i196 = this.h;
                                                    int i197 = a;
                                                    int i198 = ((i197 ^ 71) | (i197 & 71)) << 1;
                                                    int i199 = -((i197 & (-72)) | (71 & (~i197)));
                                                    int i200 = (i198 & i199) + (i198 | i199);
                                                    b = i200 % 128;
                                                    int i201 = i200 % i35;
                                                    i13 = i196;
                                                    i15 = i195;
                                                    c3 = cArr2[(i15 - (~i16)) - i38];
                                                    if (c3 != '+') {
                                                        int i1310 = a;
                                                        int i1311 = i1310 & 15;
                                                        int i1420 = ((~i1311) & (i1310 | 15)) + (i1311 << i38);
                                                        i19 = i1420 % 128;
                                                        b = i19;
                                                        int i1421 = i1420 % i35;
                                                        if (c3 != 'E') {
                                                            cArr2 = cArr2;
                                                            i20 = i35;
                                                            if (i14 != i20) {
                                                                i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                                a = i22 % 128;
                                                                if (i22 % i20 == 0) {
                                                                    i21 = 5;
                                                                    if (i14 != 5) {
                                                                    }
                                                                } else {
                                                                    i21 = 5;
                                                                    if (i14 != 4) {
                                                                    }
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                            }
                                                            i14 = i21;
                                                            int i14111110 = (i16 & (-75)) + (i16 | (-75));
                                                            i16 = (i14111110 ^ 76) + ((i14111110 & 76) << 1);
                                                            int i14111111 = b;
                                                            int i14111112 = (i14111111 | 37) << 1;
                                                            int i14111113 = -(i14111111 ^ 37);
                                                            i18 = (i14111112 & i14111113) + (i14111113 | i14111112);
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                int i14111114 = 3 % 2;
                                                            }
                                                            cArr2 = cArr2;
                                                            i35 = 2;
                                                            c4 = '9';
                                                            i38 = 1;
                                                            i47 = 5;
                                                        } else {
                                                            cArr2 = cArr2;
                                                            i20 = i35;
                                                            if (i14 != i20) {
                                                                i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                                a = i22 % 128;
                                                                if (i22 % i20 == 0) {
                                                                    i21 = 5;
                                                                    if (i14 != 5) {
                                                                    }
                                                                } else {
                                                                    i21 = 5;
                                                                    if (i14 != 4) {
                                                                    }
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                            }
                                                            i14 = i21;
                                                            int i14111115 = (i16 & (-75)) + (i16 | (-75));
                                                            i16 = (i14111115 ^ 76) + ((i14111115 & 76) << 1);
                                                            int i14111116 = b;
                                                            int i14111117 = (i14111116 | 37) << 1;
                                                            int i14111118 = -(i14111116 ^ 37);
                                                            i18 = (i14111117 & i14111118) + (i14111118 | i14111117);
                                                            a = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                int i14111119 = 3 % 2;
                                                            }
                                                            cArr2 = cArr2;
                                                            i35 = 2;
                                                            c4 = '9';
                                                            i38 = 1;
                                                            i47 = 5;
                                                        }
                                                        if (i29 != 0) {
                                                            if (l(this.g[this.i])) {
                                                                D("Expected value");
                                                                throw null;
                                                            }
                                                            f();
                                                            this.d = 10;
                                                            return 10;
                                                        }
                                                        int i1910 = b;
                                                        int i1911 = i1910 & 101;
                                                        i30 = i1911 + ((i1910 ^ 101) | i1911);
                                                        a = i30 % 128;
                                                        if (i30 % 2 != 0) {
                                                            return i29;
                                                        }
                                                        Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    cArr2 = cArr2;
                                                    i17 = 6;
                                                    if (i14 != i47) {
                                                    }
                                                    i14 = i17;
                                                    int i141111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i141111110 ^ 76) + ((i141111110 & 76) << 1);
                                                    int i141111111 = b;
                                                    int i141111112 = (i141111111 | 37) << 1;
                                                    int i141111113 = -(i141111111 ^ 37);
                                                    i18 = (i141111112 & i141111113) + (i141111113 | i141111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i141111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i14 == i35) {
                                                    if (z) {
                                                    }
                                                    i31 = 2;
                                                }
                                                if (i14 != i31) {
                                                    i31 = i35;
                                                    int i1710 = b;
                                                    int i1711 = (i1710 ^ 106) + ((i1710 & 106) << 1);
                                                    i33 = (i1711 ^ (-1)) + (i1711 << 1);
                                                    a = i33 % 128;
                                                    if (i33 % 2 == 0) {
                                                        if (i14 == 7) {
                                                        }
                                                        if (i29 != 0) {
                                                            if (l(this.g[this.i])) {
                                                                D("Expected value");
                                                                throw null;
                                                            }
                                                            f();
                                                            this.d = 10;
                                                            return 10;
                                                        }
                                                        int i1912 = b;
                                                        int i1913 = i1912 & 101;
                                                        i30 = i1913 + ((i1912 ^ 101) | i1913);
                                                        a = i30 % 128;
                                                        if (i30 % 2 != 0) {
                                                            return i29;
                                                        }
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    if (i14 == 7) {
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i1914 = b;
                                                    int i1915 = i1914 & 101;
                                                    i30 = i1915 + ((i1914 ^ 101) | i1915);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj4 = null;
                                                    obj4.hashCode();
                                                    throw null;
                                                }
                                                i31 = i35;
                                                this.m = i16;
                                                int i1712 = a;
                                                int i1713 = i1712 ^ 109;
                                                int i1810 = -(-((i1712 & 109) << 1));
                                                i32 = ((i1713 | i1810) << 1) - (i1810 ^ i1713);
                                                int i1811 = i32 % 128;
                                                b = i1811;
                                                if (i32 % 2 != 0) {
                                                    this.d = 16;
                                                    int i1812 = 17 / 0;
                                                } else {
                                                    this.d = 16;
                                                }
                                                int i1813 = (-2) - ((-1) ^ ((i1811 ^ 18) + ((i1811 & 18) << 1)));
                                                a = i1813 % 128;
                                                int i1814 = i1813 % 2;
                                                i29 = 16;
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i1916 = b;
                                                int i1917 = i1916 & 101;
                                                i30 = i1917 + ((i1916 ^ 101) | i1917);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj5 = null;
                                                obj5.hashCode();
                                                throw null;
                                            }
                                            i29 = 0;
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i1918 = b;
                                            int i1919 = i1918 & 101;
                                            i30 = i1919 + ((i1918 ^ 101) | i1919);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                    }
                                    str = "null";
                                    str2 = "NULL";
                                    i5 = 7;
                                }
                            } else {
                                str = "false";
                                str2 = "FALSE";
                                i5 = 6;
                            }
                        } else {
                            str = "true";
                            str2 = "TRUE";
                            i5 = 5;
                        }
                        length = str.length();
                        i6 = 1;
                        while (true) {
                            if (i6 < length) {
                                i7 = this.i;
                                if ((((~length) & i7) | ((~i7) & length)) + ((i7 & length) << 1) >= this.h) {
                                    if (!l(this.g[this.i + length])) {
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    cArr2 = this.g;
                                    int i1312 = this.i;
                                    int i1313 = this.h;
                                    int i1314 = a;
                                    int i1315 = ((i1314 & (-112)) | ((~i1314) & 111)) + ((i1314 & 111) << 1);
                                    b = i1315 % 128;
                                    int i1316 = i1315 % 2;
                                    z = true;
                                    i13 = i1313;
                                    long j3 = 0;
                                    i14 = 0;
                                    boolean z4 = false;
                                    i15 = i1312;
                                    i16 = 0;
                                    while (true) {
                                        if (i15 + i16 != i13) {
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i1317 = a;
                                                int i1318 = i1317 & 15;
                                                int i1422 = ((~i1318) & (i1317 | 15)) + (i1318 << i38);
                                                i19 = i1422 % 128;
                                                b = i19;
                                                int i1423 = i1422 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i141111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i141111115 ^ 76) + ((i141111115 & 76) << 1);
                                                    int i141111116 = b;
                                                    int i141111117 = (i141111116 | 37) << 1;
                                                    int i141111118 = -(i141111116 ^ 37);
                                                    i18 = (i141111117 & i141111118) + (i141111118 | i141111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i141111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i1411111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i1411111110 ^ 76) + ((i1411111110 & 76) << 1);
                                                    int i1411111111 = b;
                                                    int i1411111112 = (i1411111111 | 37) << 1;
                                                    int i1411111113 = -(i1411111111 ^ 37);
                                                    i18 = (i1411111112 & i1411111113) + (i1411111113 | i1411111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i1411111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i19110 = b;
                                                int i19111 = i19110 & 101;
                                                i30 = i19111 + ((i19110 ^ 101) | i19111);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj7 = null;
                                                obj7.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i1411111115 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i1411111115 ^ 76) + ((i1411111115 & 76) << 1);
                                            int i1411111116 = b;
                                            int i1411111117 = (i1411111116 | 37) << 1;
                                            int i1411111118 = -(i1411111116 ^ 37);
                                            i18 = (i1411111117 & i1411111118) + (i1411111118 | i1411111117);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i1411111119 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        } else if (i16 == cArr2.length) {
                                            i34 = i16 & 1;
                                            if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                                int i1920 = this.i;
                                                int i1921 = this.h;
                                                int i1922 = a;
                                                int i1923 = ((i1922 ^ 71) | (i1922 & 71)) << 1;
                                                int i1924 = -((i1922 & (-72)) | (71 & (~i1922)));
                                                int i202 = (i1923 & i1924) + (i1923 | i1924);
                                                b = i202 % 128;
                                                int i203 = i202 % i35;
                                                i13 = i1921;
                                                i15 = i1920;
                                                c3 = cArr2[(i15 - (~i16)) - i38];
                                                if (c3 != '+') {
                                                    int i1319 = a;
                                                    int i13110 = i1319 & 15;
                                                    int i1424 = ((~i13110) & (i1319 | 15)) + (i13110 << i38);
                                                    i19 = i1424 % 128;
                                                    b = i19;
                                                    int i1425 = i1424 % i35;
                                                    if (c3 != 'E') {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111110 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111110 ^ 76) + ((i14111111110 & 76) << 1);
                                                        int i14111111111 = b;
                                                        int i14111111112 = (i14111111111 | 37) << 1;
                                                        int i14111111113 = -(i14111111111 ^ 37);
                                                        i18 = (i14111111112 & i14111111113) + (i14111111113 | i14111111112);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111114 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    } else {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111115 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111115 ^ 76) + ((i14111111115 & 76) << 1);
                                                        int i14111111116 = b;
                                                        int i14111111117 = (i14111111116 | 37) << 1;
                                                        int i14111111118 = -(i14111111116 ^ 37);
                                                        i18 = (i14111111117 & i14111111118) + (i14111111118 | i14111111117);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111119 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i19112 = b;
                                                    int i19113 = i19112 & 101;
                                                    i30 = i19113 + ((i19112 ^ 101) | i19113);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj8 = null;
                                                    obj8.hashCode();
                                                    throw null;
                                                }
                                                cArr2 = cArr2;
                                                i17 = 6;
                                                if (i14 != i47) {
                                                }
                                                i14 = i17;
                                                int i141111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111110 ^ 76) + ((i141111111110 & 76) << 1);
                                                int i141111111111 = b;
                                                int i141111111112 = (i141111111111 | 37) << 1;
                                                int i141111111113 = -(i141111111111 ^ 37);
                                                i18 = (i141111111112 & i141111111113) + (i141111111113 | i141111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i14 == i35) {
                                                if (z) {
                                                }
                                                i31 = 2;
                                            }
                                            if (i14 != i31) {
                                                i31 = i35;
                                                int i1714 = b;
                                                int i1715 = (i1714 ^ 106) + ((i1714 & 106) << 1);
                                                i33 = (i1715 ^ (-1)) + (i1715 << 1);
                                                a = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    if (i14 == 7) {
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i19114 = b;
                                                    int i19115 = i19114 & 101;
                                                    i30 = i19115 + ((i19114 ^ 101) | i19115);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i19116 = b;
                                                int i19117 = i19116 & 101;
                                                i30 = i19117 + ((i19116 ^ 101) | i19117);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj10 = null;
                                                obj10.hashCode();
                                                throw null;
                                            }
                                            i31 = i35;
                                            this.m = i16;
                                            int i1716 = a;
                                            int i1717 = i1716 ^ 109;
                                            int i1815 = -(-((i1716 & 109) << 1));
                                            i32 = ((i1717 | i1815) << 1) - (i1815 ^ i1717);
                                            int i1816 = i32 % 128;
                                            b = i1816;
                                            if (i32 % 2 != 0) {
                                                this.d = 16;
                                                int i1817 = 17 / 0;
                                            } else {
                                                this.d = 16;
                                            }
                                            int i1818 = (-2) - ((-1) ^ ((i1816 ^ 18) + ((i1816 & 18) << 1)));
                                            a = i1818 % 128;
                                            int i1819 = i1818 % 2;
                                            i29 = 16;
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i19118 = b;
                                            int i19119 = i19118 & 101;
                                            i30 = i19119 + ((i19118 ^ 101) | i19119);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj11 = null;
                                            obj11.hashCode();
                                            throw null;
                                        }
                                        i29 = 0;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i191110 = b;
                                        int i191111 = i191110 & 101;
                                        i30 = i191111 + ((i191110 ^ 101) | i191111);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj12 = null;
                                        obj12.hashCode();
                                        throw null;
                                    }
                                }
                                int i204 = b;
                                int i205 = (i204 & 69) + (i204 | 69);
                                a = i205 % 128;
                                int i206 = i205 % 2;
                                int i207 = length & 1;
                                i8 = (~i207) & (length | 1);
                                i9 = i207 << 1;
                                if (!(!j((i8 ^ i9) + ((i9 & i8) << 1)))) {
                                    if (!l(this.g[this.i + length])) {
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    cArr2 = this.g;
                                    int i13111 = this.i;
                                    int i13112 = this.h;
                                    int i13113 = a;
                                    int i13114 = ((i13113 & (-112)) | ((~i13113) & 111)) + ((i13113 & 111) << 1);
                                    b = i13114 % 128;
                                    int i13115 = i13114 % 2;
                                    z = true;
                                    i13 = i13112;
                                    long j4 = 0;
                                    i14 = 0;
                                    boolean z5 = false;
                                    i15 = i13111;
                                    i16 = 0;
                                    while (true) {
                                        if (i15 + i16 != i13) {
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i13116 = a;
                                                int i13117 = i13116 & 15;
                                                int i1426 = ((~i13117) & (i13116 | 15)) + (i13117 << i38);
                                                i19 = i1426 % 128;
                                                b = i19;
                                                int i1427 = i1426 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i141111111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i141111111115 ^ 76) + ((i141111111115 & 76) << 1);
                                                    int i141111111116 = b;
                                                    int i141111111117 = (i141111111116 | 37) << 1;
                                                    int i141111111118 = -(i141111111116 ^ 37);
                                                    i18 = (i141111111117 & i141111111118) + (i141111111118 | i141111111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i141111111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i1411111111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i1411111111110 ^ 76) + ((i1411111111110 & 76) << 1);
                                                    int i1411111111111 = b;
                                                    int i1411111111112 = (i1411111111111 | 37) << 1;
                                                    int i1411111111113 = -(i1411111111111 ^ 37);
                                                    i18 = (i1411111111112 & i1411111111113) + (i1411111111113 | i1411111111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i1411111111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i191112 = b;
                                                int i191113 = i191112 & 101;
                                                i30 = i191113 + ((i191112 ^ 101) | i191113);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj13 = null;
                                                obj13.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i1411111111115 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i1411111111115 ^ 76) + ((i1411111111115 & 76) << 1);
                                            int i1411111111116 = b;
                                            int i1411111111117 = (i1411111111116 | 37) << 1;
                                            int i1411111111118 = -(i1411111111116 ^ 37);
                                            i18 = (i1411111111117 & i1411111111118) + (i1411111111118 | i1411111111117);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i1411111111119 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        } else if (i16 == cArr2.length) {
                                            i34 = i16 & 1;
                                            if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                                int i1925 = this.i;
                                                int i1926 = this.h;
                                                int i1927 = a;
                                                int i1928 = ((i1927 ^ 71) | (i1927 & 71)) << 1;
                                                int i1929 = -((i1927 & (-72)) | (71 & (~i1927)));
                                                int i208 = (i1928 & i1929) + (i1928 | i1929);
                                                b = i208 % 128;
                                                int i209 = i208 % i35;
                                                i13 = i1926;
                                                i15 = i1925;
                                                c3 = cArr2[(i15 - (~i16)) - i38];
                                                if (c3 != '+') {
                                                    int i13118 = a;
                                                    int i13119 = i13118 & 15;
                                                    int i1428 = ((~i13119) & (i13118 | 15)) + (i13119 << i38);
                                                    i19 = i1428 % 128;
                                                    b = i19;
                                                    int i1429 = i1428 % i35;
                                                    if (c3 != 'E') {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111110 ^ 76) + ((i14111111111110 & 76) << 1);
                                                        int i14111111111111 = b;
                                                        int i14111111111112 = (i14111111111111 | 37) << 1;
                                                        int i14111111111113 = -(i14111111111111 ^ 37);
                                                        i18 = (i14111111111112 & i14111111111113) + (i14111111111113 | i14111111111112);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111114 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    } else {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111115 ^ 76) + ((i14111111111115 & 76) << 1);
                                                        int i14111111111116 = b;
                                                        int i14111111111117 = (i14111111111116 | 37) << 1;
                                                        int i14111111111118 = -(i14111111111116 ^ 37);
                                                        i18 = (i14111111111117 & i14111111111118) + (i14111111111118 | i14111111111117);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111119 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i191114 = b;
                                                    int i191115 = i191114 & 101;
                                                    i30 = i191115 + ((i191114 ^ 101) | i191115);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj14 = null;
                                                    obj14.hashCode();
                                                    throw null;
                                                }
                                                cArr2 = cArr2;
                                                i17 = 6;
                                                if (i14 != i47) {
                                                }
                                                i14 = i17;
                                                int i141111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111111110 ^ 76) + ((i141111111111110 & 76) << 1);
                                                int i141111111111111 = b;
                                                int i141111111111112 = (i141111111111111 | 37) << 1;
                                                int i141111111111113 = -(i141111111111111 ^ 37);
                                                i18 = (i141111111111112 & i141111111111113) + (i141111111111113 | i141111111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i14 == i35) {
                                                if (z) {
                                                }
                                                i31 = 2;
                                            }
                                            if (i14 != i31) {
                                                i31 = i35;
                                                int i1718 = b;
                                                int i1719 = (i1718 ^ 106) + ((i1718 & 106) << 1);
                                                i33 = (i1719 ^ (-1)) + (i1719 << 1);
                                                a = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    if (i14 == 7) {
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i191116 = b;
                                                    int i191117 = i191116 & 101;
                                                    i30 = i191117 + ((i191116 ^ 101) | i191117);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj15 = null;
                                                    obj15.hashCode();
                                                    throw null;
                                                }
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i191118 = b;
                                                int i191119 = i191118 & 101;
                                                i30 = i191119 + ((i191118 ^ 101) | i191119);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj16 = null;
                                                obj16.hashCode();
                                                throw null;
                                            }
                                            i31 = i35;
                                            this.m = i16;
                                            int i17110 = a;
                                            int i17111 = i17110 ^ 109;
                                            int i18110 = -(-((i17110 & 109) << 1));
                                            i32 = ((i17111 | i18110) << 1) - (i18110 ^ i17111);
                                            int i18111 = i32 % 128;
                                            b = i18111;
                                            if (i32 % 2 != 0) {
                                                this.d = 16;
                                                int i18112 = 17 / 0;
                                            } else {
                                                this.d = 16;
                                            }
                                            int i18113 = (-2) - ((-1) ^ ((i18111 ^ 18) + ((i18111 & 18) << 1)));
                                            a = i18113 % 128;
                                            int i18114 = i18113 % 2;
                                            i29 = 16;
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i1911110 = b;
                                            int i1911111 = i1911110 & 101;
                                            i30 = i1911111 + ((i1911110 ^ 101) | i1911111);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj17 = null;
                                            obj17.hashCode();
                                            throw null;
                                        }
                                        i29 = 0;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i1911112 = b;
                                        int i1911113 = i1911112 & 101;
                                        i30 = i1911113 + ((i1911112 ^ 101) | i1911113);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj18 = null;
                                        obj18.hashCode();
                                        throw null;
                                    }
                                }
                                int i210 = this.i;
                                int i211 = -(-length);
                                int i212 = i210 & i211;
                                this.i = (i212 - (~(-(-((i210 ^ i211) | i212))))) - 1;
                                this.d = i5;
                                if (i5 != 0) {
                                    return i5;
                                }
                                cArr2 = this.g;
                                int i131110 = this.i;
                                int i131111 = this.h;
                                int i131112 = a;
                                int i131113 = ((i131112 & (-112)) | ((~i131112) & 111)) + ((i131112 & 111) << 1);
                                b = i131113 % 128;
                                int i131114 = i131113 % 2;
                                z = true;
                                i13 = i131111;
                                long j5 = 0;
                                i14 = 0;
                                boolean z6 = false;
                                i15 = i131110;
                                i16 = 0;
                                while (true) {
                                    if (i15 + i16 != i13) {
                                        c3 = cArr2[(i15 - (~i16)) - i38];
                                        if (c3 != '+') {
                                            int i131115 = a;
                                            int i131116 = i131115 & 15;
                                            int i14210 = ((~i131116) & (i131115 | 15)) + (i131116 << i38);
                                            i19 = i14210 % 128;
                                            b = i19;
                                            int i14211 = i14210 % i35;
                                            if (c3 != 'E') {
                                                cArr2 = cArr2;
                                                i20 = i35;
                                                if (i14 != i20) {
                                                    i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                    a = i22 % 128;
                                                    if (i22 % i20 == 0) {
                                                        i21 = 5;
                                                        if (i14 != 5) {
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                        if (i14 != 4) {
                                                        }
                                                    }
                                                } else {
                                                    i21 = 5;
                                                }
                                                i14 = i21;
                                                int i141111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111111115 ^ 76) + ((i141111111111115 & 76) << 1);
                                                int i141111111111116 = b;
                                                int i141111111111117 = (i141111111111116 | 37) << 1;
                                                int i141111111111118 = -(i141111111111116 ^ 37);
                                                i18 = (i141111111111117 & i141111111111118) + (i141111111111118 | i141111111111117);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111111119 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            } else {
                                                cArr2 = cArr2;
                                                i20 = i35;
                                                if (i14 != i20) {
                                                    i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                    a = i22 % 128;
                                                    if (i22 % i20 == 0) {
                                                        i21 = 5;
                                                        if (i14 != 5) {
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                        if (i14 != 4) {
                                                        }
                                                    }
                                                } else {
                                                    i21 = 5;
                                                }
                                                i14 = i21;
                                                int i1411111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i1411111111111110 ^ 76) + ((i1411111111111110 & 76) << 1);
                                                int i1411111111111111 = b;
                                                int i1411111111111112 = (i1411111111111111 | 37) << 1;
                                                int i1411111111111113 = -(i1411111111111111 ^ 37);
                                                i18 = (i1411111111111112 & i1411111111111113) + (i1411111111111113 | i1411111111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i1411111111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i1911114 = b;
                                            int i1911115 = i1911114 & 101;
                                            i30 = i1911115 + ((i1911114 ^ 101) | i1911115);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj19 = null;
                                            obj19.hashCode();
                                            throw null;
                                        }
                                        cArr2 = cArr2;
                                        i17 = 6;
                                        if (i14 != i47) {
                                        }
                                        i14 = i17;
                                        int i1411111111111115 = (i16 & (-75)) + (i16 | (-75));
                                        i16 = (i1411111111111115 ^ 76) + ((i1411111111111115 & 76) << 1);
                                        int i1411111111111116 = b;
                                        int i1411111111111117 = (i1411111111111116 | 37) << 1;
                                        int i1411111111111118 = -(i1411111111111116 ^ 37);
                                        i18 = (i1411111111111117 & i1411111111111118) + (i1411111111111118 | i1411111111111117);
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            int i1411111111111119 = 3 % 2;
                                        }
                                        cArr2 = cArr2;
                                        i35 = 2;
                                        c4 = '9';
                                        i38 = 1;
                                        i47 = 5;
                                    } else if (i16 == cArr2.length) {
                                        i34 = i16 & 1;
                                        if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                            int i19210 = this.i;
                                            int i19211 = this.h;
                                            int i19212 = a;
                                            int i19213 = ((i19212 ^ 71) | (i19212 & 71)) << 1;
                                            int i19214 = -((i19212 & (-72)) | (71 & (~i19212)));
                                            int i2010 = (i19213 & i19214) + (i19213 | i19214);
                                            b = i2010 % 128;
                                            int i2011 = i2010 % i35;
                                            i13 = i19211;
                                            i15 = i19210;
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i131117 = a;
                                                int i131118 = i131117 & 15;
                                                int i14212 = ((~i131118) & (i131117 | 15)) + (i131118 << i38);
                                                i19 = i14212 % 128;
                                                b = i19;
                                                int i14213 = i14212 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i14111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i14111111111111110 ^ 76) + ((i14111111111111110 & 76) << 1);
                                                    int i14111111111111111 = b;
                                                    int i14111111111111112 = (i14111111111111111 | 37) << 1;
                                                    int i14111111111111113 = -(i14111111111111111 ^ 37);
                                                    i18 = (i14111111111111112 & i14111111111111113) + (i14111111111111113 | i14111111111111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i14111111111111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i14111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i14111111111111115 ^ 76) + ((i14111111111111115 & 76) << 1);
                                                    int i14111111111111116 = b;
                                                    int i14111111111111117 = (i14111111111111116 | 37) << 1;
                                                    int i14111111111111118 = -(i14111111111111116 ^ 37);
                                                    i18 = (i14111111111111117 & i14111111111111118) + (i14111111111111118 | i14111111111111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i14111111111111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i1911116 = b;
                                                int i1911117 = i1911116 & 101;
                                                i30 = i1911117 + ((i1911116 ^ 101) | i1911117);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj110 = null;
                                                obj110.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i141111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i141111111111111110 ^ 76) + ((i141111111111111110 & 76) << 1);
                                            int i141111111111111111 = b;
                                            int i141111111111111112 = (i141111111111111111 | 37) << 1;
                                            int i141111111111111113 = -(i141111111111111111 ^ 37);
                                            i18 = (i141111111111111112 & i141111111111111113) + (i141111111111111113 | i141111111111111112);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i141111111111111114 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        }
                                        if (i14 == i35) {
                                            if (z) {
                                            }
                                            i31 = 2;
                                        }
                                        if (i14 != i31) {
                                            i31 = i35;
                                            int i17112 = b;
                                            int i17113 = (i17112 ^ 106) + ((i17112 & 106) << 1);
                                            i33 = (i17113 ^ (-1)) + (i17113 << 1);
                                            a = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i1911118 = b;
                                                int i1911119 = i1911118 & 101;
                                                i30 = i1911119 + ((i1911118 ^ 101) | i1911119);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj111 = null;
                                                obj111.hashCode();
                                                throw null;
                                            }
                                            if (i14 == 7) {
                                            }
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i19111110 = b;
                                            int i19111111 = i19111110 & 101;
                                            i30 = i19111111 + ((i19111110 ^ 101) | i19111111);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj112 = null;
                                            obj112.hashCode();
                                            throw null;
                                        }
                                        i31 = i35;
                                        this.m = i16;
                                        int i17114 = a;
                                        int i17115 = i17114 ^ 109;
                                        int i18115 = -(-((i17114 & 109) << 1));
                                        i32 = ((i17115 | i18115) << 1) - (i18115 ^ i17115);
                                        int i18116 = i32 % 128;
                                        b = i18116;
                                        if (i32 % 2 != 0) {
                                            this.d = 16;
                                            int i18117 = 17 / 0;
                                        } else {
                                            this.d = 16;
                                        }
                                        int i18118 = (-2) - ((-1) ^ ((i18116 ^ 18) + ((i18116 & 18) << 1)));
                                        a = i18118 % 128;
                                        int i18119 = i18118 % 2;
                                        i29 = 16;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i19111112 = b;
                                        int i19111113 = i19111112 & 101;
                                        i30 = i19111113 + ((i19111112 ^ 101) | i19111113);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj113 = null;
                                        obj113.hashCode();
                                        throw null;
                                    }
                                    i29 = 0;
                                    if (i29 != 0) {
                                        if (l(this.g[this.i])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        f();
                                        this.d = 10;
                                        return 10;
                                    }
                                    int i19111114 = b;
                                    int i19111115 = i19111114 & 101;
                                    i30 = i19111115 + ((i19111114 ^ 101) | i19111115);
                                    a = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return i29;
                                    }
                                    Object obj114 = null;
                                    obj114.hashCode();
                                    throw null;
                                }
                            }
                            i10 = this.i;
                            i11 = -(~i6);
                            if ((-2) - (((i10 & i11) + (i10 | i11)) ^ (-1)) >= this.h || j(((i6 & 1) - (~(-(-(i6 | 1))))) - 1)) {
                                char[] cArr6 = this.g;
                                int i213 = this.i;
                                int i214 = i213 & i6;
                                int i215 = -(-((i213 ^ i6) | i214));
                                c2 = cArr6[(i214 ^ i215) + ((i215 & i214) << 1)];
                                int i216 = b;
                                int i217 = i216 & 27;
                                i12 = (i217 - (~((i216 ^ 27) | i217))) - 1;
                                a = i12 % 128;
                                if (i12 % 2 == 0) {
                                    str.charAt(i6);
                                    throw null;
                                }
                                if (c2 != str.charAt(i6) || c2 == str2.charAt(i6)) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        str = "true";
                        str2 = "TRUE";
                        i5 = 5;
                        length = str.length();
                        i6 = 1;
                        while (true) {
                            if (i6 < length) {
                                i7 = this.i;
                                if ((((~length) & i7) | ((~i7) & length)) + ((i7 & length) << 1) >= this.h) {
                                    if (!l(this.g[this.i + length])) {
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    cArr2 = this.g;
                                    int i131119 = this.i;
                                    int i1311110 = this.h;
                                    int i1311111 = a;
                                    int i1311112 = ((i1311111 & (-112)) | ((~i1311111) & 111)) + ((i1311111 & 111) << 1);
                                    b = i1311112 % 128;
                                    int i1311113 = i1311112 % 2;
                                    z = true;
                                    i13 = i1311110;
                                    long j6 = 0;
                                    i14 = 0;
                                    boolean z7 = false;
                                    i15 = i131119;
                                    i16 = 0;
                                    while (true) {
                                        if (i15 + i16 != i13) {
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i1311114 = a;
                                                int i1311115 = i1311114 & 15;
                                                int i14214 = ((~i1311115) & (i1311114 | 15)) + (i1311115 << i38);
                                                i19 = i14214 % 128;
                                                b = i19;
                                                int i14215 = i14214 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i141111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i141111111111111115 ^ 76) + ((i141111111111111115 & 76) << 1);
                                                    int i141111111111111116 = b;
                                                    int i141111111111111117 = (i141111111111111116 | 37) << 1;
                                                    int i141111111111111118 = -(i141111111111111116 ^ 37);
                                                    i18 = (i141111111111111117 & i141111111111111118) + (i141111111111111118 | i141111111111111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i141111111111111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i1411111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i1411111111111111110 ^ 76) + ((i1411111111111111110 & 76) << 1);
                                                    int i1411111111111111111 = b;
                                                    int i1411111111111111112 = (i1411111111111111111 | 37) << 1;
                                                    int i1411111111111111113 = -(i1411111111111111111 ^ 37);
                                                    i18 = (i1411111111111111112 & i1411111111111111113) + (i1411111111111111113 | i1411111111111111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i1411111111111111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i19111116 = b;
                                                int i19111117 = i19111116 & 101;
                                                i30 = i19111117 + ((i19111116 ^ 101) | i19111117);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj115 = null;
                                                obj115.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i1411111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i1411111111111111115 ^ 76) + ((i1411111111111111115 & 76) << 1);
                                            int i1411111111111111116 = b;
                                            int i1411111111111111117 = (i1411111111111111116 | 37) << 1;
                                            int i1411111111111111118 = -(i1411111111111111116 ^ 37);
                                            i18 = (i1411111111111111117 & i1411111111111111118) + (i1411111111111111118 | i1411111111111111117);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i1411111111111111119 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        } else if (i16 == cArr2.length) {
                                            i34 = i16 & 1;
                                            if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                                int i19215 = this.i;
                                                int i19216 = this.h;
                                                int i19217 = a;
                                                int i19218 = ((i19217 ^ 71) | (i19217 & 71)) << 1;
                                                int i19219 = -((i19217 & (-72)) | (71 & (~i19217)));
                                                int i2012 = (i19218 & i19219) + (i19218 | i19219);
                                                b = i2012 % 128;
                                                int i2013 = i2012 % i35;
                                                i13 = i19216;
                                                i15 = i19215;
                                                c3 = cArr2[(i15 - (~i16)) - i38];
                                                if (c3 != '+') {
                                                    int i1311116 = a;
                                                    int i1311117 = i1311116 & 15;
                                                    int i14216 = ((~i1311117) & (i1311116 | 15)) + (i1311117 << i38);
                                                    i19 = i14216 % 128;
                                                    b = i19;
                                                    int i14217 = i14216 % i35;
                                                    if (c3 != 'E') {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111111111110 ^ 76) + ((i14111111111111111110 & 76) << 1);
                                                        int i14111111111111111111 = b;
                                                        int i14111111111111111112 = (i14111111111111111111 | 37) << 1;
                                                        int i14111111111111111113 = -(i14111111111111111111 ^ 37);
                                                        i18 = (i14111111111111111112 & i14111111111111111113) + (i14111111111111111113 | i14111111111111111112);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111111111114 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    } else {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111111111115 ^ 76) + ((i14111111111111111115 & 76) << 1);
                                                        int i14111111111111111116 = b;
                                                        int i14111111111111111117 = (i14111111111111111116 | 37) << 1;
                                                        int i14111111111111111118 = -(i14111111111111111116 ^ 37);
                                                        i18 = (i14111111111111111117 & i14111111111111111118) + (i14111111111111111118 | i14111111111111111117);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111111111119 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i19111118 = b;
                                                    int i19111119 = i19111118 & 101;
                                                    i30 = i19111119 + ((i19111118 ^ 101) | i19111119);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj116 = null;
                                                    obj116.hashCode();
                                                    throw null;
                                                }
                                                cArr2 = cArr2;
                                                i17 = 6;
                                                if (i14 != i47) {
                                                }
                                                i14 = i17;
                                                int i141111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111111111111110 ^ 76) + ((i141111111111111111110 & 76) << 1);
                                                int i141111111111111111111 = b;
                                                int i141111111111111111112 = (i141111111111111111111 | 37) << 1;
                                                int i141111111111111111113 = -(i141111111111111111111 ^ 37);
                                                i18 = (i141111111111111111112 & i141111111111111111113) + (i141111111111111111113 | i141111111111111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111111111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i14 == i35) {
                                                if (z) {
                                                }
                                                i31 = 2;
                                            }
                                            if (i14 != i31) {
                                                i31 = i35;
                                                int i17116 = b;
                                                int i17117 = (i17116 ^ 106) + ((i17116 & 106) << 1);
                                                i33 = (i17117 ^ (-1)) + (i17117 << 1);
                                                a = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    if (i14 == 7) {
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i191111110 = b;
                                                    int i191111111 = i191111110 & 101;
                                                    i30 = i191111111 + ((i191111110 ^ 101) | i191111111);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj117 = null;
                                                    obj117.hashCode();
                                                    throw null;
                                                }
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i191111112 = b;
                                                int i191111113 = i191111112 & 101;
                                                i30 = i191111113 + ((i191111112 ^ 101) | i191111113);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj118 = null;
                                                obj118.hashCode();
                                                throw null;
                                            }
                                            i31 = i35;
                                            this.m = i16;
                                            int i17118 = a;
                                            int i17119 = i17118 ^ 109;
                                            int i181110 = -(-((i17118 & 109) << 1));
                                            i32 = ((i17119 | i181110) << 1) - (i181110 ^ i17119);
                                            int i181111 = i32 % 128;
                                            b = i181111;
                                            if (i32 % 2 != 0) {
                                                this.d = 16;
                                                int i181112 = 17 / 0;
                                            } else {
                                                this.d = 16;
                                            }
                                            int i181113 = (-2) - ((-1) ^ ((i181111 ^ 18) + ((i181111 & 18) << 1)));
                                            a = i181113 % 128;
                                            int i181114 = i181113 % 2;
                                            i29 = 16;
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i191111114 = b;
                                            int i191111115 = i191111114 & 101;
                                            i30 = i191111115 + ((i191111114 ^ 101) | i191111115);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj119 = null;
                                            obj119.hashCode();
                                            throw null;
                                        }
                                        i29 = 0;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i191111116 = b;
                                        int i191111117 = i191111116 & 101;
                                        i30 = i191111117 + ((i191111116 ^ 101) | i191111117);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj1110 = null;
                                        obj1110.hashCode();
                                        throw null;
                                    }
                                }
                                int i2014 = b;
                                int i2015 = (i2014 & 69) + (i2014 | 69);
                                a = i2015 % 128;
                                int i2016 = i2015 % 2;
                                int i2017 = length & 1;
                                i8 = (~i2017) & (length | 1);
                                i9 = i2017 << 1;
                                if (!(!j((i8 ^ i9) + ((i9 & i8) << 1)))) {
                                    if (!l(this.g[this.i + length])) {
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    cArr2 = this.g;
                                    int i1311118 = this.i;
                                    int i1311119 = this.h;
                                    int i13111110 = a;
                                    int i13111111 = ((i13111110 & (-112)) | ((~i13111110) & 111)) + ((i13111110 & 111) << 1);
                                    b = i13111111 % 128;
                                    int i13111112 = i13111111 % 2;
                                    z = true;
                                    i13 = i1311119;
                                    long j7 = 0;
                                    i14 = 0;
                                    boolean z8 = false;
                                    i15 = i1311118;
                                    i16 = 0;
                                    while (true) {
                                        if (i15 + i16 != i13) {
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i13111113 = a;
                                                int i13111114 = i13111113 & 15;
                                                int i14218 = ((~i13111114) & (i13111113 | 15)) + (i13111114 << i38);
                                                i19 = i14218 % 128;
                                                b = i19;
                                                int i14219 = i14218 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i141111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i141111111111111111115 ^ 76) + ((i141111111111111111115 & 76) << 1);
                                                    int i141111111111111111116 = b;
                                                    int i141111111111111111117 = (i141111111111111111116 | 37) << 1;
                                                    int i141111111111111111118 = -(i141111111111111111116 ^ 37);
                                                    i18 = (i141111111111111111117 & i141111111111111111118) + (i141111111111111111118 | i141111111111111111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i141111111111111111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i1411111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i1411111111111111111110 ^ 76) + ((i1411111111111111111110 & 76) << 1);
                                                    int i1411111111111111111111 = b;
                                                    int i1411111111111111111112 = (i1411111111111111111111 | 37) << 1;
                                                    int i1411111111111111111113 = -(i1411111111111111111111 ^ 37);
                                                    i18 = (i1411111111111111111112 & i1411111111111111111113) + (i1411111111111111111113 | i1411111111111111111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i1411111111111111111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i191111118 = b;
                                                int i191111119 = i191111118 & 101;
                                                i30 = i191111119 + ((i191111118 ^ 101) | i191111119);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj1111 = null;
                                                obj1111.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i1411111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i1411111111111111111115 ^ 76) + ((i1411111111111111111115 & 76) << 1);
                                            int i1411111111111111111116 = b;
                                            int i1411111111111111111117 = (i1411111111111111111116 | 37) << 1;
                                            int i1411111111111111111118 = -(i1411111111111111111116 ^ 37);
                                            i18 = (i1411111111111111111117 & i1411111111111111111118) + (i1411111111111111111118 | i1411111111111111111117);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i1411111111111111111119 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        } else if (i16 == cArr2.length) {
                                            i34 = i16 & 1;
                                            if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                                int i192110 = this.i;
                                                int i192111 = this.h;
                                                int i192112 = a;
                                                int i192113 = ((i192112 ^ 71) | (i192112 & 71)) << 1;
                                                int i192114 = -((i192112 & (-72)) | (71 & (~i192112)));
                                                int i2018 = (i192113 & i192114) + (i192113 | i192114);
                                                b = i2018 % 128;
                                                int i2019 = i2018 % i35;
                                                i13 = i192111;
                                                i15 = i192110;
                                                c3 = cArr2[(i15 - (~i16)) - i38];
                                                if (c3 != '+') {
                                                    int i13111115 = a;
                                                    int i13111116 = i13111115 & 15;
                                                    int i142110 = ((~i13111116) & (i13111115 | 15)) + (i13111116 << i38);
                                                    i19 = i142110 % 128;
                                                    b = i19;
                                                    int i142111 = i142110 % i35;
                                                    if (c3 != 'E') {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111111111111110 ^ 76) + ((i14111111111111111111110 & 76) << 1);
                                                        int i14111111111111111111111 = b;
                                                        int i14111111111111111111112 = (i14111111111111111111111 | 37) << 1;
                                                        int i14111111111111111111113 = -(i14111111111111111111111 ^ 37);
                                                        i18 = (i14111111111111111111112 & i14111111111111111111113) + (i14111111111111111111113 | i14111111111111111111112);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111111111111114 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    } else {
                                                        cArr2 = cArr2;
                                                        i20 = i35;
                                                        if (i14 != i20) {
                                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                            a = i22 % 128;
                                                            if (i22 % i20 == 0) {
                                                                i21 = 5;
                                                                if (i14 != 5) {
                                                                }
                                                            } else {
                                                                i21 = 5;
                                                                if (i14 != 4) {
                                                                }
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                        }
                                                        i14 = i21;
                                                        int i14111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                        i16 = (i14111111111111111111115 ^ 76) + ((i14111111111111111111115 & 76) << 1);
                                                        int i14111111111111111111116 = b;
                                                        int i14111111111111111111117 = (i14111111111111111111116 | 37) << 1;
                                                        int i14111111111111111111118 = -(i14111111111111111111116 ^ 37);
                                                        i18 = (i14111111111111111111117 & i14111111111111111111118) + (i14111111111111111111118 | i14111111111111111111117);
                                                        a = i18 % 128;
                                                        if (i18 % 2 == 0) {
                                                            int i14111111111111111111119 = 3 % 2;
                                                        }
                                                        cArr2 = cArr2;
                                                        i35 = 2;
                                                        c4 = '9';
                                                        i38 = 1;
                                                        i47 = 5;
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i1911111110 = b;
                                                    int i1911111111 = i1911111110 & 101;
                                                    i30 = i1911111111 + ((i1911111110 ^ 101) | i1911111111);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj1112 = null;
                                                    obj1112.hashCode();
                                                    throw null;
                                                }
                                                cArr2 = cArr2;
                                                i17 = 6;
                                                if (i14 != i47) {
                                                }
                                                i14 = i17;
                                                int i141111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111111111111111110 ^ 76) + ((i141111111111111111111110 & 76) << 1);
                                                int i141111111111111111111111 = b;
                                                int i141111111111111111111112 = (i141111111111111111111111 | 37) << 1;
                                                int i141111111111111111111113 = -(i141111111111111111111111 ^ 37);
                                                i18 = (i141111111111111111111112 & i141111111111111111111113) + (i141111111111111111111113 | i141111111111111111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111111111111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i14 == i35) {
                                                if (z) {
                                                }
                                                i31 = 2;
                                            }
                                            if (i14 != i31) {
                                                i31 = i35;
                                                int i171110 = b;
                                                int i171111 = (i171110 ^ 106) + ((i171110 & 106) << 1);
                                                i33 = (i171111 ^ (-1)) + (i171111 << 1);
                                                a = i33 % 128;
                                                if (i33 % 2 == 0) {
                                                    if (i14 == 7) {
                                                    }
                                                    if (i29 != 0) {
                                                        if (l(this.g[this.i])) {
                                                            D("Expected value");
                                                            throw null;
                                                        }
                                                        f();
                                                        this.d = 10;
                                                        return 10;
                                                    }
                                                    int i1911111112 = b;
                                                    int i1911111113 = i1911111112 & 101;
                                                    i30 = i1911111113 + ((i1911111112 ^ 101) | i1911111113);
                                                    a = i30 % 128;
                                                    if (i30 % 2 != 0) {
                                                        return i29;
                                                    }
                                                    Object obj1113 = null;
                                                    obj1113.hashCode();
                                                    throw null;
                                                }
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i1911111114 = b;
                                                int i1911111115 = i1911111114 & 101;
                                                i30 = i1911111115 + ((i1911111114 ^ 101) | i1911111115);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj1114 = null;
                                                obj1114.hashCode();
                                                throw null;
                                            }
                                            i31 = i35;
                                            this.m = i16;
                                            int i171112 = a;
                                            int i171113 = i171112 ^ 109;
                                            int i181115 = -(-((i171112 & 109) << 1));
                                            i32 = ((i171113 | i181115) << 1) - (i181115 ^ i171113);
                                            int i181116 = i32 % 128;
                                            b = i181116;
                                            if (i32 % 2 != 0) {
                                                this.d = 16;
                                                int i181117 = 17 / 0;
                                            } else {
                                                this.d = 16;
                                            }
                                            int i181118 = (-2) - ((-1) ^ ((i181116 ^ 18) + ((i181116 & 18) << 1)));
                                            a = i181118 % 128;
                                            int i181119 = i181118 % 2;
                                            i29 = 16;
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i1911111116 = b;
                                            int i1911111117 = i1911111116 & 101;
                                            i30 = i1911111117 + ((i1911111116 ^ 101) | i1911111117);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj1115 = null;
                                            obj1115.hashCode();
                                            throw null;
                                        }
                                        i29 = 0;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i1911111118 = b;
                                        int i1911111119 = i1911111118 & 101;
                                        i30 = i1911111119 + ((i1911111118 ^ 101) | i1911111119);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj1116 = null;
                                        obj1116.hashCode();
                                        throw null;
                                    }
                                }
                                int i218 = this.i;
                                int i219 = -(-length);
                                int i2110 = i218 & i219;
                                this.i = (i2110 - (~(-(-((i218 ^ i219) | i2110))))) - 1;
                                this.d = i5;
                                if (i5 != 0) {
                                    return i5;
                                }
                                cArr2 = this.g;
                                int i13111117 = this.i;
                                int i13111118 = this.h;
                                int i13111119 = a;
                                int i131111110 = ((i13111119 & (-112)) | ((~i13111119) & 111)) + ((i13111119 & 111) << 1);
                                b = i131111110 % 128;
                                int i131111111 = i131111110 % 2;
                                z = true;
                                i13 = i13111118;
                                long j8 = 0;
                                i14 = 0;
                                boolean z9 = false;
                                i15 = i13111117;
                                i16 = 0;
                                while (true) {
                                    if (i15 + i16 != i13) {
                                        c3 = cArr2[(i15 - (~i16)) - i38];
                                        if (c3 != '+') {
                                            int i131111112 = a;
                                            int i131111113 = i131111112 & 15;
                                            int i142112 = ((~i131111113) & (i131111112 | 15)) + (i131111113 << i38);
                                            i19 = i142112 % 128;
                                            b = i19;
                                            int i142113 = i142112 % i35;
                                            if (c3 != 'E') {
                                                cArr2 = cArr2;
                                                i20 = i35;
                                                if (i14 != i20) {
                                                    i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                    a = i22 % 128;
                                                    if (i22 % i20 == 0) {
                                                        i21 = 5;
                                                        if (i14 != 5) {
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                        if (i14 != 4) {
                                                        }
                                                    }
                                                } else {
                                                    i21 = 5;
                                                }
                                                i14 = i21;
                                                int i141111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i141111111111111111111115 ^ 76) + ((i141111111111111111111115 & 76) << 1);
                                                int i141111111111111111111116 = b;
                                                int i141111111111111111111117 = (i141111111111111111111116 | 37) << 1;
                                                int i141111111111111111111118 = -(i141111111111111111111116 ^ 37);
                                                i18 = (i141111111111111111111117 & i141111111111111111111118) + (i141111111111111111111118 | i141111111111111111111117);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i141111111111111111111119 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            } else {
                                                cArr2 = cArr2;
                                                i20 = i35;
                                                if (i14 != i20) {
                                                    i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                    a = i22 % 128;
                                                    if (i22 % i20 == 0) {
                                                        i21 = 5;
                                                        if (i14 != 5) {
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                        if (i14 != 4) {
                                                        }
                                                    }
                                                } else {
                                                    i21 = 5;
                                                }
                                                i14 = i21;
                                                int i1411111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                i16 = (i1411111111111111111111110 ^ 76) + ((i1411111111111111111111110 & 76) << 1);
                                                int i1411111111111111111111111 = b;
                                                int i1411111111111111111111112 = (i1411111111111111111111111 | 37) << 1;
                                                int i1411111111111111111111113 = -(i1411111111111111111111111 ^ 37);
                                                i18 = (i1411111111111111111111112 & i1411111111111111111111113) + (i1411111111111111111111113 | i1411111111111111111111112);
                                                a = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    int i1411111111111111111111114 = 3 % 2;
                                                }
                                                cArr2 = cArr2;
                                                i35 = 2;
                                                c4 = '9';
                                                i38 = 1;
                                                i47 = 5;
                                            }
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i19111111110 = b;
                                            int i19111111111 = i19111111110 & 101;
                                            i30 = i19111111111 + ((i19111111110 ^ 101) | i19111111111);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj1117 = null;
                                            obj1117.hashCode();
                                            throw null;
                                        }
                                        cArr2 = cArr2;
                                        i17 = 6;
                                        if (i14 != i47) {
                                        }
                                        i14 = i17;
                                        int i1411111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                        i16 = (i1411111111111111111111115 ^ 76) + ((i1411111111111111111111115 & 76) << 1);
                                        int i1411111111111111111111116 = b;
                                        int i1411111111111111111111117 = (i1411111111111111111111116 | 37) << 1;
                                        int i1411111111111111111111118 = -(i1411111111111111111111116 ^ 37);
                                        i18 = (i1411111111111111111111117 & i1411111111111111111111118) + (i1411111111111111111111118 | i1411111111111111111111117);
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            int i1411111111111111111111119 = 3 % 2;
                                        }
                                        cArr2 = cArr2;
                                        i35 = 2;
                                        c4 = '9';
                                        i38 = 1;
                                        i47 = 5;
                                    } else if (i16 == cArr2.length) {
                                        i34 = i16 & 1;
                                        if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                            int i192115 = this.i;
                                            int i192116 = this.h;
                                            int i192117 = a;
                                            int i192118 = ((i192117 ^ 71) | (i192117 & 71)) << 1;
                                            int i192119 = -((i192117 & (-72)) | (71 & (~i192117)));
                                            int i20110 = (i192118 & i192119) + (i192118 | i192119);
                                            b = i20110 % 128;
                                            int i20111 = i20110 % i35;
                                            i13 = i192116;
                                            i15 = i192115;
                                            c3 = cArr2[(i15 - (~i16)) - i38];
                                            if (c3 != '+') {
                                                int i131111114 = a;
                                                int i131111115 = i131111114 & 15;
                                                int i142114 = ((~i131111115) & (i131111114 | 15)) + (i131111115 << i38);
                                                i19 = i142114 % 128;
                                                b = i19;
                                                int i142115 = i142114 % i35;
                                                if (c3 != 'E') {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i14111111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i14111111111111111111111110 ^ 76) + ((i14111111111111111111111110 & 76) << 1);
                                                    int i14111111111111111111111111 = b;
                                                    int i14111111111111111111111112 = (i14111111111111111111111111 | 37) << 1;
                                                    int i14111111111111111111111113 = -(i14111111111111111111111111 ^ 37);
                                                    i18 = (i14111111111111111111111112 & i14111111111111111111111113) + (i14111111111111111111111113 | i14111111111111111111111112);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i14111111111111111111111114 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                } else {
                                                    cArr2 = cArr2;
                                                    i20 = i35;
                                                    if (i14 != i20) {
                                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                                        a = i22 % 128;
                                                        if (i22 % i20 == 0) {
                                                            i21 = 5;
                                                            if (i14 != 5) {
                                                            }
                                                        } else {
                                                            i21 = 5;
                                                            if (i14 != 4) {
                                                            }
                                                        }
                                                    } else {
                                                        i21 = 5;
                                                    }
                                                    i14 = i21;
                                                    int i14111111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                                    i16 = (i14111111111111111111111115 ^ 76) + ((i14111111111111111111111115 & 76) << 1);
                                                    int i14111111111111111111111116 = b;
                                                    int i14111111111111111111111117 = (i14111111111111111111111116 | 37) << 1;
                                                    int i14111111111111111111111118 = -(i14111111111111111111111116 ^ 37);
                                                    i18 = (i14111111111111111111111117 & i14111111111111111111111118) + (i14111111111111111111111118 | i14111111111111111111111117);
                                                    a = i18 % 128;
                                                    if (i18 % 2 == 0) {
                                                        int i14111111111111111111111119 = 3 % 2;
                                                    }
                                                    cArr2 = cArr2;
                                                    i35 = 2;
                                                    c4 = '9';
                                                    i38 = 1;
                                                    i47 = 5;
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i19111111112 = b;
                                                int i19111111113 = i19111111112 & 101;
                                                i30 = i19111111113 + ((i19111111112 ^ 101) | i19111111113);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj1118 = null;
                                                obj1118.hashCode();
                                                throw null;
                                            }
                                            cArr2 = cArr2;
                                            i17 = 6;
                                            if (i14 != i47) {
                                            }
                                            i14 = i17;
                                            int i141111111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                            i16 = (i141111111111111111111111110 ^ 76) + ((i141111111111111111111111110 & 76) << 1);
                                            int i141111111111111111111111111 = b;
                                            int i141111111111111111111111112 = (i141111111111111111111111111 | 37) << 1;
                                            int i141111111111111111111111113 = -(i141111111111111111111111111 ^ 37);
                                            i18 = (i141111111111111111111111112 & i141111111111111111111111113) + (i141111111111111111111111113 | i141111111111111111111111112);
                                            a = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                int i141111111111111111111111114 = 3 % 2;
                                            }
                                            cArr2 = cArr2;
                                            i35 = 2;
                                            c4 = '9';
                                            i38 = 1;
                                            i47 = 5;
                                        }
                                        if (i14 == i35) {
                                            if (z) {
                                            }
                                            i31 = 2;
                                        }
                                        if (i14 != i31) {
                                            i31 = i35;
                                            int i171114 = b;
                                            int i171115 = (i171114 ^ 106) + ((i171114 & 106) << 1);
                                            i33 = (i171115 ^ (-1)) + (i171115 << 1);
                                            a = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                if (i14 == 7) {
                                                }
                                                if (i29 != 0) {
                                                    if (l(this.g[this.i])) {
                                                        D("Expected value");
                                                        throw null;
                                                    }
                                                    f();
                                                    this.d = 10;
                                                    return 10;
                                                }
                                                int i19111111114 = b;
                                                int i19111111115 = i19111111114 & 101;
                                                i30 = i19111111115 + ((i19111111114 ^ 101) | i19111111115);
                                                a = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    return i29;
                                                }
                                                Object obj1119 = null;
                                                obj1119.hashCode();
                                                throw null;
                                            }
                                            if (i14 == 7) {
                                            }
                                            if (i29 != 0) {
                                                if (l(this.g[this.i])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                f();
                                                this.d = 10;
                                                return 10;
                                            }
                                            int i19111111116 = b;
                                            int i19111111117 = i19111111116 & 101;
                                            i30 = i19111111117 + ((i19111111116 ^ 101) | i19111111117);
                                            a = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return i29;
                                            }
                                            Object obj11110 = null;
                                            obj11110.hashCode();
                                            throw null;
                                        }
                                        i31 = i35;
                                        this.m = i16;
                                        int i171116 = a;
                                        int i171117 = i171116 ^ 109;
                                        int i1811110 = -(-((i171116 & 109) << 1));
                                        i32 = ((i171117 | i1811110) << 1) - (i1811110 ^ i171117);
                                        int i1811111 = i32 % 128;
                                        b = i1811111;
                                        if (i32 % 2 != 0) {
                                            this.d = 16;
                                            int i1811112 = 17 / 0;
                                        } else {
                                            this.d = 16;
                                        }
                                        int i1811113 = (-2) - ((-1) ^ ((i1811111 ^ 18) + ((i1811111 & 18) << 1)));
                                        a = i1811113 % 128;
                                        int i1811114 = i1811113 % 2;
                                        i29 = 16;
                                        if (i29 != 0) {
                                            if (l(this.g[this.i])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            f();
                                            this.d = 10;
                                            return 10;
                                        }
                                        int i19111111118 = b;
                                        int i19111111119 = i19111111118 & 101;
                                        i30 = i19111111119 + ((i19111111118 ^ 101) | i19111111119);
                                        a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            return i29;
                                        }
                                        Object obj11111 = null;
                                        obj11111.hashCode();
                                        throw null;
                                    }
                                    i29 = 0;
                                    if (i29 != 0) {
                                        if (l(this.g[this.i])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        f();
                                        this.d = 10;
                                        return 10;
                                    }
                                    int i191111111110 = b;
                                    int i191111111111 = i191111111110 & 101;
                                    i30 = i191111111111 + ((i191111111110 ^ 101) | i191111111111);
                                    a = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return i29;
                                    }
                                    Object obj11112 = null;
                                    obj11112.hashCode();
                                    throw null;
                                }
                            }
                            i10 = this.i;
                            i11 = -(~i6);
                            if ((-2) - (((i10 & i11) + (i10 | i11)) ^ (-1)) >= this.h) {
                                char[] cArr7 = this.g;
                                int i2111 = this.i;
                                int i2112 = i2111 & i6;
                                int i2113 = -(-((i2111 ^ i6) | i2112));
                                c2 = cArr7[(i2112 ^ i2113) + ((i2113 & i2112) << 1)];
                                int i2114 = b;
                                int i2115 = i2114 & 27;
                                i12 = (i2115 - (~((i2114 ^ 27) | i2115))) - 1;
                                a = i12 % 128;
                                if (i12 % 2 == 0) {
                                    str.charAt(i6);
                                    throw null;
                                }
                                if (c2 != str.charAt(i6)) {
                                }
                                i6++;
                            } else {
                                char[] cArr8 = this.g;
                                int i2116 = this.i;
                                int i2117 = i2116 & i6;
                                int i2118 = -(-((i2116 ^ i6) | i2117));
                                c2 = cArr8[(i2117 ^ i2118) + ((i2118 & i2117) << 1)];
                                int i2119 = b;
                                int i21110 = i2119 & 27;
                                i12 = (i21110 - (~((i2119 ^ 27) | i21110))) - 1;
                                a = i12 % 128;
                                if (i12 % 2 == 0) {
                                    str.charAt(i6);
                                    throw null;
                                }
                                if (c2 != str.charAt(i6)) {
                                }
                                i6++;
                            }
                        }
                    }
                    int i220 = b;
                    int i221 = (i220 & 67) + (i220 | 67);
                    a = i221 % 128;
                    if (i221 % 2 == 0) {
                        int i222 = 4 / 5;
                    }
                    i5 = 0;
                    if (i5 != 0) {
                        return i5;
                    }
                    cArr2 = this.g;
                    int i131111116 = this.i;
                    int i131111117 = this.h;
                    int i131111118 = a;
                    int i131111119 = ((i131111118 & (-112)) | ((~i131111118) & 111)) + ((i131111118 & 111) << 1);
                    b = i131111119 % 128;
                    int i1311111110 = i131111119 % 2;
                    z = true;
                    i13 = i131111117;
                    long j9 = 0;
                    i14 = 0;
                    boolean z10 = false;
                    i15 = i131111116;
                    i16 = 0;
                    while (true) {
                        if (i15 + i16 != i13) {
                            c3 = cArr2[(i15 - (~i16)) - i38];
                            if (c3 != '+') {
                                int i1311111111 = a;
                                int i1311111112 = i1311111111 & 15;
                                int i142116 = ((~i1311111112) & (i1311111111 | 15)) + (i1311111112 << i38);
                                i19 = i142116 % 128;
                                b = i19;
                                int i142117 = i142116 % i35;
                                if (c3 != 'E') {
                                    cArr2 = cArr2;
                                    i20 = i35;
                                    if (i14 != i20) {
                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                        a = i22 % 128;
                                        if (i22 % i20 == 0) {
                                            i21 = 5;
                                            if (i14 != 5) {
                                            }
                                        } else {
                                            i21 = 5;
                                            if (i14 != 4) {
                                            }
                                        }
                                    } else {
                                        i21 = 5;
                                    }
                                    i14 = i21;
                                    int i141111111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                    i16 = (i141111111111111111111111115 ^ 76) + ((i141111111111111111111111115 & 76) << 1);
                                    int i141111111111111111111111116 = b;
                                    int i141111111111111111111111117 = (i141111111111111111111111116 | 37) << 1;
                                    int i141111111111111111111111118 = -(i141111111111111111111111116 ^ 37);
                                    i18 = (i141111111111111111111111117 & i141111111111111111111111118) + (i141111111111111111111111118 | i141111111111111111111111117);
                                    a = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        int i141111111111111111111111119 = 3 % 2;
                                    }
                                    cArr2 = cArr2;
                                    i35 = 2;
                                    c4 = '9';
                                    i38 = 1;
                                    i47 = 5;
                                } else {
                                    cArr2 = cArr2;
                                    i20 = i35;
                                    if (i14 != i20) {
                                        i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                        a = i22 % 128;
                                        if (i22 % i20 == 0) {
                                            i21 = 5;
                                            if (i14 != 5) {
                                            }
                                        } else {
                                            i21 = 5;
                                            if (i14 != 4) {
                                            }
                                        }
                                    } else {
                                        i21 = 5;
                                    }
                                    i14 = i21;
                                    int i1411111111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                    i16 = (i1411111111111111111111111110 ^ 76) + ((i1411111111111111111111111110 & 76) << 1);
                                    int i1411111111111111111111111111 = b;
                                    int i1411111111111111111111111112 = (i1411111111111111111111111111 | 37) << 1;
                                    int i1411111111111111111111111113 = -(i1411111111111111111111111111 ^ 37);
                                    i18 = (i1411111111111111111111111112 & i1411111111111111111111111113) + (i1411111111111111111111111113 | i1411111111111111111111111112);
                                    a = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        int i1411111111111111111111111114 = 3 % 2;
                                    }
                                    cArr2 = cArr2;
                                    i35 = 2;
                                    c4 = '9';
                                    i38 = 1;
                                    i47 = 5;
                                }
                                if (i29 != 0) {
                                    if (l(this.g[this.i])) {
                                        D("Expected value");
                                        throw null;
                                    }
                                    f();
                                    this.d = 10;
                                    return 10;
                                }
                                int i191111111112 = b;
                                int i191111111113 = i191111111112 & 101;
                                i30 = i191111111113 + ((i191111111112 ^ 101) | i191111111113);
                                a = i30 % 128;
                                if (i30 % 2 != 0) {
                                    return i29;
                                }
                                Object obj11113 = null;
                                obj11113.hashCode();
                                throw null;
                            }
                            cArr2 = cArr2;
                            i17 = 6;
                            if (i14 != i47) {
                            }
                            i14 = i17;
                            int i1411111111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                            i16 = (i1411111111111111111111111115 ^ 76) + ((i1411111111111111111111111115 & 76) << 1);
                            int i1411111111111111111111111116 = b;
                            int i1411111111111111111111111117 = (i1411111111111111111111111116 | 37) << 1;
                            int i1411111111111111111111111118 = -(i1411111111111111111111111116 ^ 37);
                            i18 = (i1411111111111111111111111117 & i1411111111111111111111111118) + (i1411111111111111111111111118 | i1411111111111111111111111117);
                            a = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i1411111111111111111111111119 = 3 % 2;
                            }
                            cArr2 = cArr2;
                            i35 = 2;
                            c4 = '9';
                            i38 = 1;
                            i47 = 5;
                        } else if (i16 == cArr2.length) {
                            i34 = i16 & 1;
                            if (j(((~i34) & (i16 | 1)) + (i34 << i38))) {
                                int i1921110 = this.i;
                                int i1921111 = this.h;
                                int i1921112 = a;
                                int i1921113 = ((i1921112 ^ 71) | (i1921112 & 71)) << 1;
                                int i1921114 = -((i1921112 & (-72)) | (71 & (~i1921112)));
                                int i20112 = (i1921113 & i1921114) + (i1921113 | i1921114);
                                b = i20112 % 128;
                                int i20113 = i20112 % i35;
                                i13 = i1921111;
                                i15 = i1921110;
                                c3 = cArr2[(i15 - (~i16)) - i38];
                                if (c3 != '+') {
                                    int i1311111113 = a;
                                    int i1311111114 = i1311111113 & 15;
                                    int i142118 = ((~i1311111114) & (i1311111113 | 15)) + (i1311111114 << i38);
                                    i19 = i142118 % 128;
                                    b = i19;
                                    int i142119 = i142118 % i35;
                                    if (c3 != 'E') {
                                        cArr2 = cArr2;
                                        i20 = i35;
                                        if (i14 != i20) {
                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                            a = i22 % 128;
                                            if (i22 % i20 == 0) {
                                                i21 = 5;
                                                if (i14 != 5) {
                                                }
                                            } else {
                                                i21 = 5;
                                                if (i14 != 4) {
                                                }
                                            }
                                        } else {
                                            i21 = 5;
                                        }
                                        i14 = i21;
                                        int i14111111111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                        i16 = (i14111111111111111111111111110 ^ 76) + ((i14111111111111111111111111110 & 76) << 1);
                                        int i14111111111111111111111111111 = b;
                                        int i14111111111111111111111111112 = (i14111111111111111111111111111 | 37) << 1;
                                        int i14111111111111111111111111113 = -(i14111111111111111111111111111 ^ 37);
                                        i18 = (i14111111111111111111111111112 & i14111111111111111111111111113) + (i14111111111111111111111111113 | i14111111111111111111111111112);
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            int i14111111111111111111111111114 = 3 % 2;
                                        }
                                        cArr2 = cArr2;
                                        i35 = 2;
                                        c4 = '9';
                                        i38 = 1;
                                        i47 = 5;
                                    } else {
                                        cArr2 = cArr2;
                                        i20 = i35;
                                        if (i14 != i20) {
                                            i22 = ((i19 ^ 86) + ((i19 & 86) << 1)) - 1;
                                            a = i22 % 128;
                                            if (i22 % i20 == 0) {
                                                i21 = 5;
                                                if (i14 != 5) {
                                                }
                                            } else {
                                                i21 = 5;
                                                if (i14 != 4) {
                                                }
                                            }
                                        } else {
                                            i21 = 5;
                                        }
                                        i14 = i21;
                                        int i14111111111111111111111111115 = (i16 & (-75)) + (i16 | (-75));
                                        i16 = (i14111111111111111111111111115 ^ 76) + ((i14111111111111111111111111115 & 76) << 1);
                                        int i14111111111111111111111111116 = b;
                                        int i14111111111111111111111111117 = (i14111111111111111111111111116 | 37) << 1;
                                        int i14111111111111111111111111118 = -(i14111111111111111111111111116 ^ 37);
                                        i18 = (i14111111111111111111111111117 & i14111111111111111111111111118) + (i14111111111111111111111111118 | i14111111111111111111111111117);
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            int i14111111111111111111111111119 = 3 % 2;
                                        }
                                        cArr2 = cArr2;
                                        i35 = 2;
                                        c4 = '9';
                                        i38 = 1;
                                        i47 = 5;
                                    }
                                    if (i29 != 0) {
                                        if (l(this.g[this.i])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        f();
                                        this.d = 10;
                                        return 10;
                                    }
                                    int i191111111114 = b;
                                    int i191111111115 = i191111111114 & 101;
                                    i30 = i191111111115 + ((i191111111114 ^ 101) | i191111111115);
                                    a = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return i29;
                                    }
                                    Object obj11114 = null;
                                    obj11114.hashCode();
                                    throw null;
                                }
                                cArr2 = cArr2;
                                i17 = 6;
                                if (i14 != i47) {
                                }
                                i14 = i17;
                                int i141111111111111111111111111110 = (i16 & (-75)) + (i16 | (-75));
                                i16 = (i141111111111111111111111111110 ^ 76) + ((i141111111111111111111111111110 & 76) << 1);
                                int i141111111111111111111111111111 = b;
                                int i141111111111111111111111111112 = (i141111111111111111111111111111 | 37) << 1;
                                int i141111111111111111111111111113 = -(i141111111111111111111111111111 ^ 37);
                                i18 = (i141111111111111111111111111112 & i141111111111111111111111111113) + (i141111111111111111111111111113 | i141111111111111111111111111112);
                                a = i18 % 128;
                                if (i18 % 2 == 0) {
                                    int i141111111111111111111111111114 = 3 % 2;
                                }
                                cArr2 = cArr2;
                                i35 = 2;
                                c4 = '9';
                                i38 = 1;
                                i47 = 5;
                            }
                            if (i14 == i35) {
                                if (z) {
                                }
                                i31 = 2;
                            }
                            if (i14 != i31) {
                                i31 = i35;
                                int i171118 = b;
                                int i171119 = (i171118 ^ 106) + ((i171118 & 106) << 1);
                                i33 = (i171119 ^ (-1)) + (i171119 << 1);
                                a = i33 % 128;
                                if (i33 % 2 == 0) {
                                    if (i14 == 7) {
                                    }
                                    if (i29 != 0) {
                                        if (l(this.g[this.i])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        f();
                                        this.d = 10;
                                        return 10;
                                    }
                                    int i191111111116 = b;
                                    int i191111111117 = i191111111116 & 101;
                                    i30 = i191111111117 + ((i191111111116 ^ 101) | i191111111117);
                                    a = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return i29;
                                    }
                                    Object obj11115 = null;
                                    obj11115.hashCode();
                                    throw null;
                                }
                                if (i14 == 7) {
                                }
                                if (i29 != 0) {
                                    if (l(this.g[this.i])) {
                                        D("Expected value");
                                        throw null;
                                    }
                                    f();
                                    this.d = 10;
                                    return 10;
                                }
                                int i191111111118 = b;
                                int i191111111119 = i191111111118 & 101;
                                i30 = i191111111119 + ((i191111111118 ^ 101) | i191111111119);
                                a = i30 % 128;
                                if (i30 % 2 != 0) {
                                    return i29;
                                }
                                Object obj11116 = null;
                                obj11116.hashCode();
                                throw null;
                            }
                            i31 = i35;
                            this.m = i16;
                            int i1711110 = a;
                            int i1711111 = i1711110 ^ 109;
                            int i1811115 = -(-((i1711110 & 109) << 1));
                            i32 = ((i1711111 | i1811115) << 1) - (i1811115 ^ i1711111);
                            int i1811116 = i32 % 128;
                            b = i1811116;
                            if (i32 % 2 != 0) {
                                this.d = 16;
                                int i1811117 = 17 / 0;
                            } else {
                                this.d = 16;
                            }
                            int i1811118 = (-2) - ((-1) ^ ((i1811116 ^ 18) + ((i1811116 & 18) << 1)));
                            a = i1811118 % 128;
                            int i1811119 = i1811118 % 2;
                            i29 = 16;
                            if (i29 != 0) {
                                if (l(this.g[this.i])) {
                                    D("Expected value");
                                    throw null;
                                }
                                f();
                                this.d = 10;
                                return 10;
                            }
                            int i1911111111110 = b;
                            int i1911111111111 = i1911111111110 & 101;
                            i30 = i1911111111111 + ((i1911111111110 ^ 101) | i1911111111111);
                            a = i30 % 128;
                            if (i30 % 2 != 0) {
                                return i29;
                            }
                            Object obj11117 = null;
                            obj11117.hashCode();
                            throw null;
                        }
                        i29 = 0;
                        if (i29 != 0) {
                            if (l(this.g[this.i])) {
                                D("Expected value");
                                throw null;
                            }
                            f();
                            this.d = 10;
                            return 10;
                        }
                        int i1911111111112 = b;
                        int i1911111111113 = i1911111111112 & 101;
                        i30 = i1911111111113 + ((i1911111111112 ^ 101) | i1911111111113);
                        a = i30 % 128;
                        if (i30 % 2 != 0) {
                            return i29;
                        }
                        Object obj11118 = null;
                        obj11118.hashCode();
                        throw null;
                    }
                }
                i4 = 1;
                if (i46 == 1) {
                    this.d = 4;
                    return 4;
                }
            }
        } else {
            i4 = 1;
        }
        if (i46 != i4) {
            int i223 = b;
            int i224 = i223 & 71;
            int i225 = (i223 | 71) & (~i224);
            int i226 = i224 << i4;
            int i227 = (i225 & i226) + (i225 | i226);
            int i228 = i227 % 128;
            a = i228;
            int i229 = i227 % 2;
            if (i46 != 2) {
                int i230 = i228 & 57;
                int i231 = -(-((i228 ^ 57) | i230));
                int i232 = (i230 ^ i231) + ((i230 & i231) << 1);
                b = i232 % 128;
                if (i232 % 2 == 0) {
                    D("Unexpected value");
                    throw null;
                }
                D("Unexpected value");
                int i233 = 73 / 0;
                throw null;
            }
        }
        f();
        this.i--;
        int i234 = a;
        int i235 = ((((i234 ^ 65) | (i234 & 65)) << 1) - (~(-(((~i234) & 65) | (i234 & (-66)))))) - 1;
        b = i235 % 128;
        int i236 = i235 % 2;
        this.d = 7;
        return 7;
    }
}
