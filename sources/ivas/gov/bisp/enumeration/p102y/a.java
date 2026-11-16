package ivas.gov.bisp.enumeration.p102y;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a = 0;
    private static int b = 1;
    public static final int c;

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    static {
        int i;
        int i2;
        String property = System.getProperty("java.version");
        int i3 = 0;
        try {
            String[] strArrSplit = property.split("[._]");
            String str = strArrSplit[0];
            int i4 = b;
            int i5 = (i4 & 33) + (i4 | 33);
            a = i5 % 128;
            int i6 = i5 % 2;
            i = Integer.parseInt(str);
            if (i == 1) {
                int i7 = a;
                int i8 = ((i7 ^ 28) + ((i7 & 28) << 1)) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    if (strArrSplit.length > 1) {
                        i = Integer.parseInt(strArrSplit[1]);
                        int i9 = a;
                        int i10 = i9 & 121;
                        int i11 = ((i9 ^ 121) | i10) << 1;
                        int i12 = -((i9 | 121) & (~i10));
                        i2 = (i11 & i12) + (i12 | i11);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i13 = 5 / 2;
                        } else {
                            int i14 = 2 % 2;
                        }
                    }
                } else if (strArrSplit.length > 1) {
                    i = Integer.parseInt(strArrSplit[1]);
                    int i15 = a;
                    int i16 = i15 & 121;
                    int i17 = ((i15 ^ 121) | i16) << 1;
                    int i18 = -((i15 | 121) & (~i16));
                    i2 = (i17 & i18) + (i18 | i17);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i19 = 5 / 2;
                    } else {
                        int i110 = 2 % 2;
                    }
                }
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                int i20 = a;
                int i21 = i20 & 77;
                int i22 = -(-((i20 ^ 77) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 4 % 3;
                } else {
                    int i25 = 2 % 2;
                }
                while (i3 < property.length()) {
                    int i26 = b;
                    int i27 = (i26 | 61) << 1;
                    int i28 = -(((~i26) & 61) | (i26 & (-62)));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    char cCharAt = property.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    int i31 = b + 77;
                    a = i31 % 128;
                    if (i31 % 2 != 0) {
                        sb.append(cCharAt);
                        int i32 = i3 & 49;
                        int i33 = (i3 | 49) & (~i32);
                        int i34 = -(-(i32 << 1));
                        i3 = (((i33 | i34) << 1) - (i33 ^ i34)) + 29;
                    } else {
                        sb.append(cCharAt);
                        int i35 = i3 & (-93);
                        int i36 = (((i3 | (-93)) & (~i35)) - (~(i35 << 1))) - 1;
                        i3 = (-2) - ((((i36 | 95) << 1) - (i36 ^ 95)) ^ (-1));
                    }
                    int i37 = a;
                    int i38 = i37 ^ 111;
                    int i39 = ((((i37 & 111) | i38) << 1) - (~(-i38))) - 1;
                    b = i39 % 128;
                    int i40 = i39 % 2;
                    int i41 = 2 % 2;
                }
                i = Integer.parseInt(sb.toString());
                int i42 = b + 16;
                int i43 = (i42 ^ (-1)) + (i42 << 1);
                a = i43 % 128;
                if (i43 % 2 == 0) {
                    int i44 = 2 % 2;
                }
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            int i45 = b;
            int i46 = (i45 & (-120)) | ((~i45) & 119);
            int i47 = -(-((i45 & 119) << 1));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            int i49 = i48 % 128;
            a = i49;
            int i50 = i48 % 2;
            int i51 = i49 & 39;
            int i52 = ((i49 | 39) & (~i51)) + (i51 << 1);
            b = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 2 % 2;
            }
            i = 6;
        }
        c = i;
        int i54 = b + 56;
        int i55 = (i54 ^ (-1)) + (i54 << 1);
        a = i55 % 128;
        if (i55 % 2 != 0) {
            throw null;
        }
    }
}
