package ivas.gov.bisp.enumeration.p073cs;

import ivas.gov.bisp.enumeration.p064cj.p;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class r extends BasicPermission {
    private static int a = 0;
    private static int b = 1;
    public final String c;
    public final int d;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        int i2;
        r rVar;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 + 77;
        int i6 = i5 % 128;
        b = i6;
        boolean z2 = false;
        if (i5 % 2 == 0) {
            if (obj != this) {
                z = false;
                if (!(!(obj instanceof r))) {
                    i2 = (i6 & 115) + (i6 | 115);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i7 = 83 / 0;
                    }
                    return false;
                }
                int i8 = ((i4 ^ 123) | (i4 & 123)) << 1;
                int i9 = -((i4 & (-124)) | ((~i4) & 123));
                int i10 = (i8 & i9) + (i8 | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                rVar = (r) obj;
                if (this.d == rVar.d) {
                    int i12 = i4 & 117;
                    int i13 = (i4 ^ 117) | i12;
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    if (!(!getName().equals(rVar.getName()))) {
                        z2 = z;
                    } else {
                        int i16 = a;
                        int i17 = ((i16 | 5) << 1) - (i16 ^ 5);
                        b = i17 % 128;
                        int i18 = i17 % 2;
                    }
                } else {
                    int i19 = a;
                    int i110 = ((i19 | 5) << 1) - (i19 ^ 5);
                    b = i110 % 128;
                    int i111 = i110 % 2;
                }
                int i20 = a;
                int i21 = (i20 & 125) + (i20 | 125);
                b = i21 % 128;
                int i22 = i21 % 2;
                return z2;
            }
            int i23 = i6 & 85;
            i = (((i6 ^ 85) | i23) << 1) - ((~i23) & (i6 | 85));
            a = i % 128;
            if (i % 2 != 0) {
                int i24 = 41 / 0;
            }
            return true;
        }
        if (obj != this) {
            z = true;
            if (!(!(obj instanceof r))) {
                i2 = (i6 & 115) + (i6 | 115);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i25 = 83 / 0;
                }
                return false;
            }
            int i26 = ((i4 ^ 123) | (i4 & 123)) << 1;
            int i27 = -((i4 & (-124)) | ((~i4) & 123));
            int i112 = (i26 & i27) + (i26 | i27);
            b = i112 % 128;
            int i113 = i112 % 2;
            rVar = (r) obj;
            if (this.d == rVar.d) {
                int i114 = i4 & 117;
                int i115 = (i4 ^ 117) | i114;
                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                b = i116 % 128;
                int i117 = i116 % 2;
                if (!(!getName().equals(rVar.getName()))) {
                    z2 = z;
                } else {
                    int i118 = a;
                    int i119 = ((i118 | 5) << 1) - (i118 ^ 5);
                    b = i119 % 128;
                    int i1110 = i119 % 2;
                }
            } else {
                int i1111 = a;
                int i1112 = ((i1111 | 5) << 1) - (i1111 ^ 5);
                b = i1112 % 128;
                int i1113 = i1112 % 2;
            }
            int i28 = a;
            int i29 = (i28 & 125) + (i28 | 125);
            b = i29 % 128;
            int i210 = i29 % 2;
            return z2;
        }
        int i211 = i6 & 85;
        i = (((i6 ^ 85) | i211) << 1) - ((~i211) & (i6 | 85));
        a = i % 128;
        if (i % 2 != 0) {
            int i212 = 41 / 0;
        }
        return true;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = (((i2 ^ 101) | i3) << 1) - ((~i3) & (i2 | 101));
        a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.c;
        int i6 = (((i2 | 56) << 1) - (i2 ^ 56)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = -(-((i2 ^ 25) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = getName().hashCode();
        int i7 = -(~this.d);
        int i8 = (((iHashCode | i7) << 1) - (iHashCode ^ i7)) - 1;
        int i9 = b;
        int i10 = i9 & 7;
        int i11 = i10 + ((i9 ^ 7) | i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = i2 | 125;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean z = false;
        if (!(permission instanceof r)) {
            int i7 = i2 + 27;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 51;
            b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!getName().equals(permission.getName())) {
            int i12 = a + 35;
            b = i12 % 128;
            return i12 % 2 == 0;
        }
        int i13 = this.d;
        int i14 = a;
        int i15 = i14 & 53;
        int i16 = (i14 | 53) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        int i19 = i18 % 128;
        b = i19;
        int i20 = i18 % 2;
        int i21 = ((r) permission).d;
        if ((i13 & i21) == i21) {
            int i22 = i19 & 37;
            int i23 = (~i22) & (i19 | 37);
            int i24 = -(-(i22 << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            a = i25 % 128;
            z = i25 % 2 == 0;
        }
        int i26 = i19 & 33;
        int i27 = i26 + ((i19 ^ 33) | i26);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    public r(String str, String str2) {
        int i;
        int i2;
        super(str, str2);
        this.c = str2;
        int i3 = p.c;
        char[] charArray = str2.toCharArray();
        int i4 = 2 % 2;
        int i5 = 0;
        boolean z = false;
        while (i5 != charArray.length) {
            int i6 = a;
            int i7 = ((i6 ^ 85) | (i6 & 85)) << 1;
            int i8 = -((i6 & (-86)) | ((~i6) & 85));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            char c = charArray[i5];
            if ('A' <= c) {
                int i11 = i6 & 95;
                int i12 = (i6 ^ 95) | i11;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    if (31 >= c) {
                        int i14 = c & (-65);
                        int i15 = (c | (-65)) & (~i14);
                        int i16 = -(-(i14 << 1));
                        int i17 = (i15 & i16) + (i16 | i15);
                        charArray[i5] = (char) ((i17 & 97) + (i17 | 97));
                        int i18 = ((i6 | 1) << 1) - (i6 ^ 1);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        z = true;
                    }
                } else if ('Z' >= c) {
                    int i110 = c & (-65);
                    int i111 = (c | (-65)) & (~i110);
                    int i112 = -(-(i110 << 1));
                    int i113 = (i111 & i112) + (i112 | i111);
                    charArray[i5] = (char) ((i113 & 97) + (i113 | 97));
                    int i114 = ((i6 | 1) << 1) - (i6 ^ 1);
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    z = true;
                }
            }
            i5++;
            int i20 = b;
            int i21 = i20 & 17;
            int i22 = -(-(i20 | 17));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        if (z) {
            str2 = new String(charArray);
            int i25 = a;
            int i26 = i25 & 47;
            int i27 = -(-((i25 ^ 47) | i26));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2, " ,");
        int i30 = b;
        int i31 = (i30 & (-64)) | ((~i30) & 63);
        int i32 = -(-((i30 & 63) << 1));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        a = i33 % 128;
        int i34 = i33 % 2;
        int i35 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            int i36 = a;
            int i37 = (i36 & 9) + (i36 | 9);
            b = i37 % 128;
            int i38 = i37 % 2;
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                int i39 = (-2) - ((a + 50) ^ (-1));
                int i40 = i39 % 128;
                b = i40;
                int i41 = i39 % 2;
                int i42 = i35 & 1;
                int i43 = (i35 | 1) & (~i42);
                i35 = (i43 & i42) | (i43 ^ i42);
                int i44 = i40 ^ 93;
                int i45 = ((i40 & 93) | i44) << 1;
                int i46 = -i44;
                int i47 = (i45 & i46) + (i46 | i45);
                a = i47 % 128;
                int i48 = i47 % 2;
            } else if (!(!strNextToken.equals("ecimplicitlyca"))) {
                int i49 = b;
                int i50 = i49 ^ 25;
                int i51 = -(-((i49 & 25) << 1));
                int i52 = (i50 & i51) + (i50 | i51);
                a = i52 % 128;
                int i53 = i52 % 2;
                i35 = (i35 & 2) | (i35 & (-3)) | ((~i35) & 2);
                int i54 = ((i49 ^ 103) | (i49 & 103)) << 1;
                int i55 = -(((~i49) & 103) | (i49 & (-104)));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                a = i56 % 128;
                int i57 = i56 % 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                int i58 = b;
                int i59 = i58 + 19;
                a = i59 % 128;
                int i60 = i59 % 2;
                int i61 = (i35 & (-5)) | ((~i35) & 4);
                int i62 = i35 & 4;
                i35 = (i62 & i61) | (i61 ^ i62);
                int i63 = i58 & 121;
                int i64 = -(-((i58 ^ 121) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                a = i65 % 128;
                if (i65 % 2 != 0) {
                    int i66 = 4 / 3;
                }
            } else {
                if (strNextToken.equals("dhdefaultparams")) {
                    int i67 = b;
                    int i68 = i67 & 119;
                    int i69 = ((~i68) & (i67 | 119)) + (i68 << 1);
                    a = i69 % 128;
                    if (i69 % 2 != 0) {
                        i35 = 0;
                    } else {
                        int i70 = i35 & 8;
                        i35 = ((i35 | 8) & (~i70)) | i70;
                    }
                    int i71 = i67 | 73;
                    i = ((i71 << 1) - (~(-((~(i67 & 73)) & i71)))) - 1;
                    a = i % 128;
                } else {
                    if (!(!strNextToken.equals("acceptableeccurves"))) {
                        int i72 = b;
                        int i73 = i72 & 29;
                        int i74 = (i72 ^ 29) | i73;
                        int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
                        a = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = i35 & 16;
                        i35 = ((i35 | 16) & (~i77)) | i77;
                        int i78 = i72 & 71;
                        i2 = (i78 - (~((i72 ^ 71) | i78))) - 1;
                        a = i2 % 128;
                    } else if (!(!strNextToken.equals("additionalecparameters"))) {
                        int i79 = b;
                        int i80 = i79 & 105;
                        int i81 = (i79 | 105) & (~i80);
                        int i82 = -(-(i80 << 1));
                        int i83 = (i81 ^ i82) + ((i81 & i82) << 1);
                        int i84 = i83 % 128;
                        a = i84;
                        int i85 = i83 % 2;
                        int i86 = i35 ^ 32;
                        int i87 = i35 & 32;
                        i35 = (i87 & i86) | (i86 ^ i87);
                        int i88 = i84 & 25;
                        int i89 = (i84 ^ 25) | i88;
                        i = (i88 & i89) + (i89 | i88);
                        b = i % 128;
                    } else if (strNextToken.equals("all")) {
                        int i90 = a;
                        int i91 = i90 & 75;
                        int i92 = ((~i91) & (i90 | 75)) + (i91 << 1);
                        b = i92 % 128;
                        if (i92 % 2 == 0) {
                            i35 = 0;
                        } else {
                            int i93 = i35 ^ 63;
                            int i94 = i35 & 63;
                            i35 = (i94 & i93) | (i93 ^ i94);
                        }
                        i2 = (i90 & 87) + (i90 | 87);
                        b = i2 % 128;
                    }
                    int i95 = i2 % 2;
                }
                int i96 = i % 2;
            }
        }
        if (i35 == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        int i97 = b;
        int i98 = i97 & 55;
        int i99 = (i97 ^ 55) | i98;
        int i100 = (i98 ^ i99) + ((i98 & i99) << 1);
        a = i100 % 128;
        int i101 = i100 % 2;
        this.d = i35;
        if (i101 != 0) {
            throw null;
        }
        int i102 = i97 + 9;
        a = i102 % 128;
        if (i102 % 2 != 0) {
            int i103 = 22 / 0;
        }
    }
}
