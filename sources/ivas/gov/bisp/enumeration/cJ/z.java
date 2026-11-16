package ivas.gov.bisp.enumeration.cJ;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private static int a = 1;
    private static int b;
    public static final double c = Math.log(10.0d);
    public static final /* synthetic */ int d = 0;

    static {
        int i = b + 3;
        a = i % 128;
        int i2 = i % 2;
    }

    public static int d(CharSequence charSequence, int i) {
        char cCharAt;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-64)) | ((~i3) & 63);
        int i5 = -(-((i3 & 63) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        char cCharAt2 = charSequence.charAt(i);
        int i8 = ((cCharAt2 ^ (-48)) | (cCharAt2 & (-48))) << 1;
        int i9 = -(((~cCharAt2) & (-48)) | (cCharAt2 & '/'));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = (-2) - ((b + 34) ^ (-1));
        a = i11 % 128;
        if (i11 % 2 == 0) {
            cCharAt = charSequence.charAt(i % 1);
        } else {
            int i12 = i ^ 1;
            int i13 = ((i & 1) | i12) << 1;
            int i14 = -i12;
            cCharAt = charSequence.charAt((i13 ^ i14) + ((i13 & i14) << 1));
        }
        int i15 = i10 << 3;
        int i16 = -(-(i10 << 1));
        int i17 = (cCharAt - (~(-(-(((i15 ^ i16) - (~((i15 & i16) << 1))) - 1))))) - 1;
        int i18 = (i17 & (-48)) + (i17 | (-48));
        int i19 = b + 59;
        a = i19 % 128;
        int i20 = i19 % 2;
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r7 != Integer.MIN_VALUE) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cJ.z.a;
        r2 = r1 + 103;
        ivas.gov.bisp.enumeration.cJ.z.b = r2 % 128;
        r2 = r2 % 2;
        r7 = -r7;
        r1 = r1 + 73;
        ivas.gov.bisp.enumeration.cJ.z.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r6.append("2147483648");
        r6 = ivas.gov.bisp.enumeration.cJ.z.b + 23;
        ivas.gov.bisp.enumeration.cJ.z.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r7 != Integer.MIN_VALUE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.Appendable r6, int r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.z.c(java.lang.Appendable, int):void");
    }

    public static void b(Appendable appendable, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = i8 & 111;
        int i10 = ((i8 ^ 111) | i9) << 1;
        int i11 = -((i8 | 111) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        if (i < 0) {
            int i15 = i13 | 81;
            int i16 = i15 << 1;
            int i17 = -((~(i13 & 81)) & i15);
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    int i20 = a;
                    int i21 = ((i20 & 49) - (~(-(-(i20 | 49))))) - 1;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    appendable.append('0');
                    i2--;
                    int i23 = a;
                    int i24 = (i23 & 123) + (i23 | 123);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
                appendable.append("2147483648");
                int i26 = b;
                int i27 = ((i26 & 100) + (i26 | 100)) - 1;
                a = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i28 = b;
            int i29 = i28 ^ 1;
            int i30 = (((i28 & 1) | i29) << 1) - i29;
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            i = -i;
            int i33 = i31 + 91;
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        if (i < 10) {
            while (i2 > 1) {
                int i35 = b;
                int i36 = (i35 ^ 17) + ((i35 & 17) << 1);
                a = i36 % 128;
                if (i36 % 2 == 0) {
                    appendable.append('n');
                    int i37 = i2 + 105;
                    i2 = (i37 ^ (-1)) + (i37 << 1);
                } else {
                    appendable.append('0');
                    int i38 = (i2 ^ (-111)) + ((i2 & (-111)) << 1);
                    i2 = ((i38 | 110) << 1) - (110 ^ i38);
                }
            }
            appendable.append((char) ((i ^ 48) + ((i & 48) << 1)));
            int i39 = b;
            int i40 = (i39 ^ 37) + ((i39 & 37) << 1);
            int i41 = i40 % 128;
            a = i41;
            int i42 = i40 % 2;
            int i43 = i41 & 31;
            int i44 = (((i41 | 31) & (~i43)) - (~(i43 << 1))) - 1;
            b = i44 % 128;
            int i45 = i44 % 2;
            return;
        }
        if (i < 100) {
            while (i2 > 2) {
                int i46 = b;
                int i47 = (((i46 ^ 81) | (i46 & 81)) << 1) - (((~i46) & 81) | (i46 & (-82)));
                a = i47 % 128;
                int i48 = i47 % 2;
                appendable.append('0');
                int i49 = (i2 & 79) | ((~i2) & (-80));
                int i50 = -(-((i2 & (-80)) << 1));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                int i52 = i51 & 79;
                i2 = i52 + ((i51 ^ 79) | i52);
                int i53 = a;
                int i54 = i53 & 33;
                int i55 = (i53 | 33) & (~i54);
                int i56 = -(-(i54 << 1));
                int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                b = i57 % 128;
                if (i57 % 2 != 0) {
                    int i58 = 3 / 5;
                }
            }
            int i59 = i & 1;
            int i60 = (i ^ 1) | i59;
            int i61 = (((i59 ^ i60) + ((i59 & i60) << 1)) * 13421772) >> 27;
            int i62 = a + 60;
            int i63 = (i62 ^ (-1)) + (i62 << 1);
            b = i63 % 128;
            int i64 = i63 % 2;
            appendable.append((char) ((((i61 | 49) << 1) - (i61 ^ 49)) - 1));
            int i65 = i61 << 3;
            int i66 = a;
            int i67 = ((i66 & 6) + (i66 | 6)) - 1;
            b = i67 % 128;
            if (i67 % 2 != 0) {
                i6 = ((i >> i65) / (i61 - 1)) * 54;
            } else {
                int i68 = -i65;
                int i69 = (((((i ^ i68) | (i & i68)) << 1) - (((~i) & i68) | ((~i68) & i))) - (~(-(~(-(i61 << 1)))))) - 2;
                i6 = ((i69 ^ 49) + ((i69 & 49) << 1)) - 1;
            }
            appendable.append((char) i6);
            int i70 = b;
            int i71 = i70 ^ 35;
            int i72 = -(-((i70 & 35) << 1));
            int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
            a = i73 % 128;
            if (i73 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i < 1000) {
            int i74 = b;
            int i75 = (((i74 & (-94)) | ((~i74) & 93)) - (~(-(-((i74 & 93) << 1))))) - 1;
            int i76 = i75 % 128;
            a = i76;
            int i77 = i75 % 2;
            int i78 = i76 + 29;
            b = i78 % 128;
            int i79 = i78 % 2;
            i3 = 3;
        } else if (i < 10000) {
            int i80 = a;
            int i81 = i80 & 37;
            int i82 = -(-((i80 ^ 37) | i81));
            int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
            b = i83 % 128;
            int i84 = i83 % 2;
            int i85 = (i80 ^ 97) + ((i80 & 97) << 1);
            b = i85 % 128;
            int i86 = i85 % 2;
            i3 = 4;
        } else {
            int iLog = (int) (Math.log(i) / c);
            int i87 = iLog & 1;
            int i88 = -(-((iLog ^ 1) | i87));
            i3 = (i88 | i87) + (i87 & i88);
            int i89 = b;
            int i90 = (((i89 & (-114)) | ((~i89) & 113)) - (~((i89 & 113) << 1))) - 1;
            a = i90 % 128;
            int i91 = i90 % 2;
        }
        while (i2 > i3) {
            int i92 = b;
            int i93 = i92 & 37;
            int i94 = ((i92 | 37) & (~i93)) + (i93 << 1);
            a = i94 % 128;
            if (i94 % 2 == 0) {
                appendable.append('x');
                int i95 = (i2 ^ 192) + ((i2 & 192) << 1);
                i4 = i95 & (-117);
                i5 = i95 | (-117);
            } else {
                appendable.append('0');
                int i96 = ((i2 | 55) << 1) - (i2 ^ 55);
                i4 = i96 ^ (-56);
                i5 = (i96 & (-56)) << 1;
            }
            i2 = i4 + i5;
            int i97 = a;
            int i98 = i97 & 115;
            int i99 = ((i97 ^ 115) | i98) << 1;
            int i100 = -((i97 | 115) & (~i98));
            int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
            b = i101 % 128;
            int i102 = i101 % 2;
        }
        appendable.append(Integer.toString(i));
        int i103 = a;
        int i104 = ((i103 & (-4)) | ((~i103) & 3)) + ((i103 & 3) << 1);
        b = i104 % 128;
        if (i104 % 2 != 0) {
            throw null;
        }
    }
}
