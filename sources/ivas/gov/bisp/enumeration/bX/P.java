package ivas.gov.bisp.enumeration.bX;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.p006af.c;
import ivas.gov.bisp.enumeration.p006af.h;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.acra.ErrorReporter;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static int a = 0;
    private static int b = 1;
    public static j c = new i();
    public static ErrorReporter d;

    static {
        Class[] clsArr;
        c cVar = new InvocationHandler() { // from class: ivas.gov.bisp.enumeration.af.c
            private static int a = 1;
            private static int b;

            static {
                int i = a + 124;
                int i2 = (i ^ (-1)) + (i << 1);
                b = i2 % 128;
                int i3 = i2 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0156  */
            /* JADX WARN: Code duplicated, block: B:39:0x0190  */
            /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
            /* JADX WARN: Code duplicated, block: B:42:0x01af  */
            /* JADX WARN: Code duplicated, block: B:56:0x0241  */
            /* JADX WARN: Code duplicated, block: B:73:0x018e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:74:0x018d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:75:0x017e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:76:0x015a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:77:0x0143 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x01c8 A[EDGE_INSN: B:78:0x01c8->B:44:0x01c8 BREAK  A[LOOP:0: B:10:0x0063->B:79:0x0063], SYNTHETIC] */
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                String string;
                String str;
                String strD;
                int length;
                int i;
                int i2;
                boolean z;
                int i3;
                int i4;
                int i5;
                int i6 = 2 % 2;
                j jVar = P.c;
                Object obj2 = null;
                try {
                    j jVar2 = new j(new File("/proc/self/cmdline"));
                    int i7 = b;
                    int i8 = (i7 & (-98)) | ((~i7) & 97);
                    int i9 = (i7 & 97) << 1;
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        strD = jVar2.d();
                        length = (-2) - (strD.length() ^ (-1));
                        i = 1;
                    } else {
                        strD = jVar2.d();
                        int length2 = strD.length();
                        int i11 = (length2 ^ (-1)) | length2;
                        length = ((length2 & i11) << 1) + (length2 ^ i11);
                        i = 0;
                    }
                    int i12 = b;
                    int i13 = (i12 | 83) << 1;
                    int i14 = -(((~i12) & 83) | (i12 & (-84)));
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    boolean z2 = false;
                    while (i <= length) {
                        int i17 = b;
                        int i18 = (((i17 | 84) << 1) - (i17 ^ 84)) - 1;
                        int i19 = i18 % 128;
                        a = i19;
                        int i20 = i18 % 2;
                        if (!z2) {
                            int i21 = ((i19 ^ 45) - (~(-(-((i19 & 45) << 1))))) - 1;
                            int i22 = i21 % 128;
                            b = i22;
                            int i23 = i21 % 2;
                            int i24 = i22 & 33;
                            int i25 = (i22 | 33) & (~i24);
                            int i26 = -(-(i24 << 1));
                            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            i2 = i;
                        } else {
                            int i29 = i19 & 19;
                            int i30 = (((i19 ^ 19) | i29) << 1) - ((i19 | 19) & (~i29));
                            b = i30 % 128;
                            int i31 = i30 % 2;
                            i2 = length;
                        }
                        char cCharAt = strD.charAt(i2);
                        if (cCharAt >= ' ') {
                            if (cCharAt == ' ') {
                                int i32 = b;
                                int i33 = i32 & 25;
                                int i34 = i33 + ((i32 ^ 25) | i33);
                                int i35 = i34 % 128;
                                a = i35;
                                int i36 = i34 % 2;
                                int i37 = i35 & 55;
                                int i38 = (i35 | 55) & (~i37);
                                int i39 = i37 << 1;
                                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                                b = i40 % 128;
                                int i41 = i40 % 2;
                            } else {
                                int i42 = b;
                                int i43 = i42 & 27;
                                int i44 = i42 | 27;
                                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                                int i46 = i45 % 128;
                                a = i46;
                                int i47 = i45 % 2;
                                int i48 = (((i46 | 19) << 1) - (~(-(((~i46) & 19) | (i46 & (-20)))))) - 1;
                                b = i48 % 128;
                                if (i48 % 2 != 0) {
                                    int i49 = 3 % 5;
                                }
                                z = false;
                            }
                            if (z2) {
                                int i50 = a;
                                int i51 = i50 & 81;
                                int i52 = (i50 ^ 81) | i51;
                                i3 = ((i51 | i52) << 1) - (i52 ^ i51);
                                i4 = i3 % 128;
                                b = i4;
                                if (i3 % 2 == 0) {
                                    throw null;
                                }
                                if (!(!z)) {
                                    int i53 = (i & 42) | ((~i) & (-43));
                                    int i54 = -(-((i & (-43)) << 1));
                                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                                    int i56 = i55 & 44;
                                    i = (i56 - (~((i55 ^ 44) | i56))) - 1;
                                    int i57 = (i4 & 105) + (i4 | 105);
                                    a = i57 % 128;
                                    int i58 = i57 % 2;
                                } else {
                                    int i59 = (((i4 | 116) << 1) - (i4 ^ 116)) - 1;
                                    a = i59 % 128;
                                    int i60 = i59 % 2;
                                    z2 = true;
                                }
                            } else {
                                if (z) {
                                    break;
                                }
                                int i61 = a;
                                int i62 = i61 ^ 17;
                                i5 = ((((i61 & 17) | i62) << 1) - (~(-i62))) - 1;
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i63 = (length | 96) << 1;
                                    int i64 = -(length ^ 96);
                                    length = (i63 & i64) + (i64 | i63);
                                } else {
                                    int i65 = -(~length);
                                    length = ((-2) & i65) + (i65 | (-2));
                                }
                                int i66 = i61 & 123;
                                int i67 = (((i61 ^ 123) | i66) << 1) - ((i61 | 123) & (~i66));
                                b = i67 % 128;
                                int i68 = i67 % 2;
                            }
                        } else {
                            int i69 = a;
                            int i70 = (i69 & 67) + (i69 | 67);
                            b = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = ((i69 | 61) << 1) - (i69 ^ 61);
                            b = i72 % 128;
                            int i73 = i72 % 2;
                        }
                        int i74 = b;
                        int i75 = i74 & 97;
                        int i76 = (i75 - (~(-(-((i74 ^ 97) | i75))))) - 1;
                        int i77 = i76 % 128;
                        a = i77;
                        z = !(i76 % 2 == 0);
                        int i78 = (i77 & (-28)) | ((~i77) & 27);
                        int i79 = -(-((i77 & 27) << 1));
                        int i80 = (i78 & i79) + (i79 | i78);
                        b = i80 % 128;
                        int i81 = i80 % 2;
                        if (z2) {
                            if (z) {
                                break;
                                break;
                            }
                            int i610 = a;
                            int i611 = i610 ^ 17;
                            i5 = ((((i610 & 17) | i611) << 1) - (~(-i611))) - 1;
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i612 = (length | 96) << 1;
                                int i613 = -(length ^ 96);
                                length = (i612 & i613) + (i613 | i612);
                            } else {
                                int i614 = -(~length);
                                length = ((-2) & i614) + (i614 | (-2));
                            }
                            int i615 = i610 & 123;
                            int i616 = (((i610 ^ 123) | i615) << 1) - ((i610 | 123) & (~i615));
                            b = i616 % 128;
                            int i617 = i616 % 2;
                        } else {
                            int i510 = a;
                            int i511 = i510 & 81;
                            int i512 = (i510 ^ 81) | i511;
                            i3 = ((i511 | i512) << 1) - (i512 ^ i511);
                            i4 = i3 % 128;
                            b = i4;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            if (!(!z)) {
                                int i513 = (i & 42) | ((~i) & (-43));
                                int i514 = -(-((i & (-43)) << 1));
                                int i515 = ((i513 | i514) << 1) - (i514 ^ i513);
                                int i516 = i515 & 44;
                                i = (i516 - (~((i515 ^ 44) | i516))) - 1;
                                int i517 = (i4 & 105) + (i4 | 105);
                                a = i517 % 128;
                                int i518 = i517 % 2;
                            } else {
                                int i519 = (((i4 | 116) << 1) - (i4 ^ 116)) - 1;
                                a = i519 % 128;
                                int i618 = i519 % 2;
                                z2 = true;
                            }
                        }
                    }
                    string = strD.subSequence(i, (((length & (-2)) | ((~length) & 1)) - (~((length & 1) << 1))) - 1).toString();
                    int i82 = b;
                    int i83 = i82 & 53;
                    int i84 = (i82 ^ 53) | i83;
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    int i86 = i85 % 128;
                    a = i86;
                    int i87 = i85 % 2;
                    int i88 = i86 ^ 21;
                    int i89 = ((((i86 & 21) | i88) << 1) - (~(-i88))) - 1;
                    b = i89 % 128;
                    int i90 = i89 % 2;
                } catch (IOException unused) {
                    string = null;
                }
                if (string != null) {
                    int i91 = b;
                    int i92 = (((i91 ^ 83) | (i91 & 83)) << 1) - ((83 & (~i91)) | (i91 & (-84)));
                    a = i92 % 128;
                    int i93 = i92 % 2;
                    if (ae.ar(string, ":acra", false, 2)) {
                        int i94 = a;
                        int i95 = i94 ^ 95;
                        int i96 = ((i94 & 95) | i95) << 1;
                        int i97 = -i95;
                        int i98 = (i96 & i97) + (i96 | i97);
                        int i99 = i98 % 128;
                        b = i99;
                        int i100 = i98 % 2;
                        int i101 = (((i99 | 116) << 1) - (i99 ^ 116)) - 1;
                        a = i101 % 128;
                        if (i101 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        str = "in SenderService process";
                    } else {
                        int i102 = a;
                        int i103 = i102 & 23;
                        int i104 = i102 | 23;
                        int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                        b = i105 % 128;
                        int i106 = i105 % 2;
                        str = "before ACRA#init (if you did call #init, check if your configuration is valid)";
                    }
                } else {
                    int i107 = a;
                    int i108 = i107 & 23;
                    int i109 = i107 | 23;
                    int i1010 = (i108 ^ i109) + ((i109 & i108) << 1);
                    b = i1010 % 128;
                    int i1011 = i1010 % 2;
                    str = "before ACRA#init (if you did call #init, check if your configuration is valid)";
                }
                j jVar3 = P.c;
                j jVar4 = P.c;
                String name = method.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("ErrorReporter#");
                int i110 = a;
                int i111 = i110 & 93;
                int i112 = ((i110 | 93) & (~i111)) + (i111 << 1);
                b = i112 % 128;
                if (i112 % 2 != 0) {
                    sb.append(name);
                    sb.append(" called ");
                    throw null;
                }
                sb.append(name);
                sb.append(" called ");
                sb.append(str);
                sb.append(". THIS CALL WILL BE IGNORED!");
                int i113 = a;
                int i114 = i113 & 37;
                int i115 = (i114 - (~(-(-((i113 ^ 37) | i114))))) - 1;
                b = i115 % 128;
                int i116 = i115 % 2;
                String string2 = sb.toString();
                i iVar = (i) jVar3;
                int i117 = b;
                int i118 = (i117 & (-114)) | ((~i117) & 113);
                int i119 = (i117 & 113) << 1;
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                a = i120 % 128;
                if (i120 % 2 == 0) {
                    iVar.x("OooOOO", string2);
                    obj2.hashCode();
                    throw null;
                }
                iVar.x("OooOOO", string2);
                int i121 = b;
                int i122 = i121 & 93;
                int i123 = (((i121 ^ 93) | i122) << 1) - ((i121 | 93) & (~i122));
                a = i123 % 128;
                if (i123 % 2 != 0) {
                    return null;
                }
                obj2.hashCode();
                throw null;
            }
        };
        int i = b;
        int i2 = (i & (-54)) | ((~i) & 53);
        int i3 = -(-((i & 53) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        ClassLoader classLoader = h.class.getClassLoader();
        if (i5 != 0) {
            clsArr = new Class[0];
            clsArr[0] = ErrorReporter.class;
        } else {
            clsArr = new Class[]{ErrorReporter.class};
        }
        d = (ErrorReporter) Proxy.newProxyInstance(classLoader, clsArr, cVar);
        int i6 = a;
        int i7 = ((i6 & 66) + (i6 | 66)) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }
}
