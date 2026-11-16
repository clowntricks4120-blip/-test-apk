package ivas.gov.bisp.enumeration.p035bh;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class S implements L {
    private static int a = 0;
    private static int b = 1;
    public static final S c;
    public static final /* synthetic */ S[] d;

    public final enum bot extends S {
        private static int a = 1;
        private static int b;

        public bot(String str, int i) {
            super(str, i, null);
        }

        @Override // ivas.gov.bisp.enumeration.p035bh.L
        public final String d(Field field) {
            int i = 2 % 2;
            int i2 = a + 33;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return field.getName();
            }
            field.getName();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        bot botVar = new bot("IDENTITY", 0);
        c = botVar;
        S s = new S("UPPER_CAMEL_CASE", 1) { // from class: ivas.gov.bisp.enumeration.bh.S.bou
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p035bh.L
            public final String d(Field field) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = (i2 & 51) + (i2 | 51);
                b = i3 % 128;
                int i4 = i3 % 2;
                String strE = S.e(field.getName());
                int i5 = a;
                int i6 = i5 & 87;
                int i7 = (i5 | 87) & (~i6);
                int i8 = -(-(i6 << 1));
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 42 / 0;
                }
                return strE;
            }
        };
        S s2 = new S("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: ivas.gov.bisp.enumeration.bh.S.bov
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p035bh.L
            public final String d(Field field) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = (i2 ^ 116) + ((i2 & 116) << 1);
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                String strC = S.c(field.getName(), " ");
                if (i5 != 0) {
                    S.e(strC);
                    throw null;
                }
                String strE = S.e(strC);
                int i6 = a;
                int i7 = i6 & 121;
                int i8 = i6 | 121;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return strE;
                }
                throw null;
            }
        };
        int i = 3;
        S s3 = new S("LOWER_CASE_WITH_UNDERSCORES", i) { // from class: ivas.gov.bisp.enumeration.bh.S.bow
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p035bh.L
            public final String d(Field field) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 111;
                int i5 = (((i3 ^ 111) | i4) << 1) - ((i3 | 111) & (~i4));
                a = i5 % 128;
                int i6 = i5 % 2;
                String name = field.getName();
                if (i6 != 0) {
                    S.c(name, "_");
                    Locale locale = Locale.ENGLISH;
                    throw null;
                }
                String strC = S.c(name, "_");
                Locale locale2 = Locale.ENGLISH;
                int i7 = a;
                int i8 = i7 & 93;
                int i9 = (i7 ^ 93) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                String lowerCase = strC.toLowerCase(locale2);
                int i12 = b;
                int i13 = (i12 | 103) << 1;
                int i14 = -(((~i12) & 103) | (i12 & (-104)));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                return lowerCase;
            }
        };
        S s4 = new S("LOWER_CASE_WITH_DASHES", 4) { // from class: ivas.gov.bisp.enumeration.bh.S.box
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.p035bh.L
            public final String d(Field field) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 ^ 87;
                int i5 = (i3 & 87) << 1;
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                int i7 = i6 % 2;
                String strC = S.c(field.getName(), "-");
                Locale locale = Locale.ENGLISH;
                int i8 = a;
                int i9 = ((i8 ^ 113) - (~((i8 & 113) << 1))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                String lowerCase = strC.toLowerCase(locale);
                int i11 = b;
                int i12 = ((i11 ^ 121) - (~(-(-((i11 & 121) << 1))))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                return lowerCase;
            }
        };
        S s5 = new S("LOWER_CASE_WITH_DOTS", 5) { // from class: ivas.gov.bisp.enumeration.bh.S.boy
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.p035bh.L
            public final String d(Field field) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 ^ 125;
                int i5 = (((i3 & 125) | i4) << 1) - i4;
                a = i5 % 128;
                int i6 = i5 % 2;
                String lowerCase = S.c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
                int i7 = b;
                int i8 = i7 & 43;
                int i9 = ((i7 ^ 43) | i8) << 1;
                int i10 = -((i7 | 43) & (~i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    return lowerCase;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i2 = b;
        int i3 = (-2) - ((i2 + 6) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        S[] sArr = new S[6];
        sArr[0] = botVar;
        int i5 = i2 + 119;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            sArr[1] = s;
            sArr[3] = s2;
            sArr[5] = s3;
        } else {
            sArr[1] = s;
            sArr[2] = s2;
            sArr[3] = s3;
            i = 4;
        }
        sArr[i] = s4;
        sArr[5] = s5;
        d = sArr;
        int i6 = (i2 & 95) + (i2 | 95);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public S(String str, int i, bot botVar) {
        super(str, i);
    }

    public static String e(String str) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 5;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            length = str.length();
            i = 1;
        } else {
            length = str.length();
            i = 0;
        }
        while (!Character.isLetter(str.charAt(i))) {
            int i4 = b;
            int i5 = (-2) - (((i4 ^ 70) + ((i4 & 70) << 1)) ^ (-1));
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0) {
                int i7 = -(~length);
                if (i >= (((-2) | i7) << 1) - (i7 ^ (-2))) {
                    break;
                }
                i++;
                int i8 = (i6 & 76) + (i6 | 76);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
            } else {
                if (i >= length) {
                    break;
                }
                i++;
                int i11 = (i6 & 76) + (i6 | 76);
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            int i14 = a + 59;
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            int i17 = i15 & 115;
            int i18 = (i15 | 115) & (~i17);
            int i19 = -(-(i17 << 1));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            int i22 = b + 15;
            a = i22 % 128;
            int i23 = i22 % 2;
            sb.append(str.substring(1));
            String string = sb.toString();
            int i24 = b;
            int i25 = (i24 & (-40)) | ((~i24) & 39);
            int i26 = (i24 & 39) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, i);
        int i29 = a;
        int i30 = i29 & 117;
        int i31 = (((i29 | 117) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        sb2.append(strSubstring);
        sb2.append(upperCase);
        int i33 = b + 85;
        a = i33 % 128;
        int i34 = i33 % 2;
        int i35 = (i | 1) << 1;
        int i36 = -((i & (-2)) | ((~i) & 1));
        sb2.append(str.substring((i35 ^ i36) + ((i35 & i36) << 1)));
        String string2 = sb2.toString();
        int i37 = a;
        int i38 = ((i37 ^ 98) + ((i37 & 98) << 1)) - 1;
        b = i38 % 128;
        int i39 = i38 % 2;
        return string2;
    }

    public static S valueOf(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i2 | 45) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        S s = (S) Enum.valueOf(S.class, str);
        if (i7 != 0) {
            int i8 = 19 / 0;
        }
        int i9 = a;
        int i10 = (i9 & (-110)) | ((~i9) & 109);
        int i11 = (i9 & 109) << 1;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        return s;
    }

    public static S[] values() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 41;
        int i4 = (i2 & 41) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        S[] sArr = (S[]) d.clone();
        int i7 = a;
        int i8 = (-2) - ((((i7 | 98) << 1) - (i7 ^ 98)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        return sArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    public static String c(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = b;
        int i3 = i2 ^ 35;
        int i4 = ((i2 & 35) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = ((i2 | 1) << 1) - (i2 ^ 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = a;
            int i12 = i11 & 13;
            int i13 = (i12 - (~((i11 ^ 13) | i12))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                int i15 = a;
                int i16 = i15 & 101;
                int i17 = ((i15 | 101) & (~i16)) + (i16 << 1);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 90 / 0;
                    if (sb.length() != 0) {
                        sb.append(str2);
                        int i19 = a;
                        int i20 = i19 & 113;
                        int i21 = (i20 - (~(-(-((i19 ^ 113) | i20))))) - 1;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                    }
                } else if (sb.length() != 0) {
                    sb.append(str2);
                    int i110 = a;
                    int i23 = i110 & 113;
                    int i24 = (i23 - (~(-(-((i110 ^ 113) | i23))))) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            sb.append(cCharAt);
            int i26 = i10 - 19;
            i10 = (i26 | 20) + (i26 & 20);
            int i27 = a;
            int i28 = i27 & 31;
            int i29 = (i27 ^ 31) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        String string = sb.toString();
        int i32 = b;
        int i33 = ((i32 & 4) + (i32 | 4)) - 1;
        a = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 3 / 0;
        }
        return string;
    }
}
