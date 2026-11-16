package ivas.gov.bisp.enumeration.cR;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0250o {
    private static int a = 1;
    private static int b;
    public static ConcurrentMap<Locale, C0250o> c = new ConcurrentHashMap();
    public final TreeMap<String, Integer> d;
    public final String[] e;
    public final String[] f;
    public final String[] g;
    public final String[] h;
    public final String[] i;
    public final String[] j;
    public final TreeMap<String, Integer> k;
    public final TreeMap<String, Integer> l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f84o;
    public final int p;

    static {
        int i = a;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public C0250o(Locale locale) {
        Integer[] numArr;
        int i;
        int i2;
        String[] strArr;
        DateFormatSymbols dateFormatSymbolsC = ivas.gov.bisp.enumeration.cP.u.c(locale);
        this.e = dateFormatSymbolsC.getEras();
        this.f = f(dateFormatSymbolsC.getWeekdays());
        this.g = f(dateFormatSymbolsC.getShortWeekdays());
        String[] months = dateFormatSymbolsC.getMonths();
        String[] strArr2 = new String[13];
        int i3 = 2 % 2;
        int i4 = 1;
        while (i4 < 13) {
            int i5 = b + 27;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            strArr2[i4] = months[i4 - 1];
            i4 = (((i4 & (-2)) | ((~i4) & 1)) - (~((i4 & 1) << 1))) - 1;
            int i8 = i6 & 9;
            int i9 = (i8 - (~(-(-((i6 ^ 9) | i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        this.h = strArr2;
        String[] shortMonths = dateFormatSymbolsC.getShortMonths();
        int i11 = b;
        int i12 = i11 & 17;
        int i13 = i12 + ((i11 ^ 17) | i12);
        a = i13 % 128;
        String[] strArr3 = i13 % 2 == 0 ? new String[13] : new String[13];
        int i14 = 1;
        while (i14 < 13) {
            int i15 = b + 9;
            int i16 = i15 % 128;
            a = i16;
            if (i15 % 2 == 0) {
                strArr3[i14] = shortMonths[i14];
            } else {
                strArr3[i14] = shortMonths[i14 - 1];
            }
            int i17 = (i16 & (-98)) | ((~i16) & 97);
            int i18 = -(-((i16 & 97) << 1));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = (i14 | 1) << 1;
            int i23 = -(((~i14) & 1) | (i14 & (-2)));
            i14 = ((i22 | i23) << 1) - (i23 ^ i22);
            int i24 = (i20 & 25) + (i20 | 25);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        this.j = strArr3;
        this.i = dateFormatSymbolsC.getAmPmStrings();
        int i26 = a;
        int i27 = (i26 & (-96)) | ((~i26) & 95);
        int i28 = (i26 & 95) << 1;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            numArr = new Integer[99];
            i = 1;
        } else {
            numArr = new Integer[13];
            i = 0;
        }
        int i30 = (i26 ^ 101) + ((i26 & 101) << 1);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 2 / 2;
        }
        while (i < 13) {
            int i32 = b + 85;
            a = i32 % 128;
            if (i32 % 2 == 0) {
                numArr[i] = Integer.valueOf(i);
                i += 6;
            } else {
                numArr[i] = Integer.valueOf(i);
                i = (i ^ 1) + ((i & 1) << 1);
            }
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        int i33 = b;
        int i34 = ((i33 ^ 54) + ((i33 & 54) << 1)) - 1;
        int i35 = i34 % 128;
        a = i35;
        int i36 = i34 % 2;
        this.k = treeMap;
        String[] strArr4 = this.e;
        int i37 = (i35 | 9) << 1;
        int i38 = -(((~i35) & 9) | (i35 & (-10)));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        b = i39 % 128;
        Object obj = null;
        if (i39 % 2 != 0) {
            c(treeMap, strArr4, numArr);
            "en".equals(locale.getLanguage());
            throw null;
        }
        c(treeMap, strArr4, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            int i40 = b;
            int i41 = i40 & 115;
            int i42 = i40 | 115;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            a = i43 % 128;
            int i44 = i43 % 2;
            treeMap.put("CE", numArr[1]);
            int i45 = a;
            int i46 = ((i45 & 108) + (i45 | 108)) - 1;
            b = i46 % 128;
            int i47 = i46 % 2;
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        int i48 = a;
        int i49 = i48 ^ 83;
        int i50 = (((i48 & 83) | i49) << 1) - i49;
        b = i50 % 128;
        if (i50 % 2 != 0) {
            this.l = treeMap2;
            c(treeMap2, this.f, numArr);
            int i51 = 30 / 0;
        } else {
            this.l = treeMap2;
            c(treeMap2, this.f, numArr);
        }
        int i52 = b;
        int i53 = (i52 & (-48)) | ((~i52) & 47);
        int i54 = (i52 & 47) << 1;
        int i55 = (i53 & i54) + (i54 | i53);
        a = i55 % 128;
        if (i55 % 2 == 0) {
            c(treeMap2, this.g, numArr);
            i2 = 0;
        } else {
            c(treeMap2, this.g, numArr);
            i2 = 1;
        }
        int i56 = b;
        int i57 = i56 & 103;
        int i58 = (i57 - (~((i56 ^ 103) | i57))) - 1;
        a = i58 % 128;
        int i59 = i58 % 2;
        while (i2 <= 7) {
            int i60 = b;
            int i61 = ((i60 ^ 89) | (i60 & 89)) << 1;
            int i62 = -(((~i60) & 89) | (i60 & (-90)));
            int i63 = (i61 & i62) + (i62 | i61);
            a = i63 % 128;
            if (i63 % 2 == 0) {
                treeMap2.put(String.valueOf(i2).intern(), numArr[i2]);
                int i64 = 34 / 0;
            } else {
                treeMap2.put(String.valueOf(i2).intern(), numArr[i2]);
            }
            i2 = (i2 | 1) + (i2 & 1);
            int i65 = a;
            int i66 = i65 & 105;
            int i67 = ((i65 | 105) & (~i66)) + (i66 << 1);
            b = i67 % 128;
            int i68 = i67 % 2;
        }
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
        int i69 = b;
        int i70 = (((i69 | 88) << 1) - (i69 ^ 88)) - 1;
        a = i70 % 128;
        if (i70 % 2 == 0) {
            this.d = treeMap3;
            c(treeMap3, this.h, numArr);
            obj.hashCode();
            throw null;
        }
        this.d = treeMap3;
        c(treeMap3, this.h, numArr);
        int i71 = a;
        int i72 = i71 ^ 55;
        int i73 = -(-((i71 & 55) << 1));
        int i74 = (i72 & i73) + (i73 | i72);
        b = i74 % 128;
        int i75 = i74 % 2;
        c(treeMap3, this.j, numArr);
        int i76 = a;
        int i77 = (((i76 | 56) << 1) - (i76 ^ 56)) - 1;
        b = i77 % 128;
        int i78 = i77 % 2;
        int i79 = 1;
        while (i79 <= 12) {
            int i80 = b + 105;
            a = i80 % 128;
            if (i80 % 2 == 0) {
                treeMap3.put(String.valueOf(i79).intern(), numArr[i79]);
                throw null;
            }
            treeMap3.put(String.valueOf(i79).intern(), numArr[i79]);
            int i81 = a;
            int i82 = (-2) - (((i81 & 14) + (i81 | 14)) ^ (-1));
            b = i82 % 128;
            if (i82 % 2 != 0) {
                int i83 = ((i79 & (-78)) | ((~i79) & 77)) + ((i79 & 77) << 1);
                int i84 = i83 & (-63);
                int i85 = -(-((i83 ^ (-63)) | i84));
                i79 = ((i84 | i85) << 1) - (i84 ^ i85);
            } else {
                int i86 = (i79 & 42) + (i79 | 42);
                i79 = (i86 & (-41)) + (i86 | (-41));
            }
        }
        this.m = e(this.e);
        int i87 = a;
        int i88 = ((i87 | 40) << 1) - (i87 ^ 40);
        int i89 = (i88 ^ (-1)) + (i88 << 1);
        b = i89 % 128;
        int i90 = i89 % 2;
        this.n = e(this.f);
        int i91 = b + 54;
        int i92 = (i91 ^ (-1)) + (i91 << 1);
        a = i92 % 128;
        if (i92 % 2 == 0) {
            e(this.g);
            strArr = this.h;
            int i93 = 93 / 0;
        } else {
            e(this.g);
            strArr = this.h;
        }
        this.f84o = e(strArr);
        e(this.j);
        int i94 = b;
        int i95 = (i94 & (-2)) | ((~i94) & 1);
        int i96 = (i94 & 1) << 1;
        int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
        a = i97 % 128;
        if (i97 % 2 == 0) {
            this.p = e(this.i);
            obj.hashCode();
            throw null;
        }
        this.p = e(this.i);
        int i98 = b;
        int i99 = i98 | 77;
        int i100 = ((i99 << 1) - (~(-((~(i98 & 77)) & i99)))) - 1;
        a = i100 % 128;
        if (i100 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static int e(String[] strArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int length = strArr.length;
        int i6 = ((i4 & 36) + (i4 | 36)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            int i9 = ((length ^ (-1)) | length) << 1;
            int i10 = -(~length);
            length = (i10 | i9) + (i9 & i10);
            if (length < 0) {
                int i11 = a;
                int i12 = (-2) - (((i11 ^ 10) + ((i11 & 10) << 1)) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                return i8;
            }
            int i14 = b;
            int i15 = i14 & 45;
            int i16 = (~i15) & (i14 | 45);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            String str = strArr[length];
            if (str != null) {
                int i20 = ((i14 ^ 119) | (i14 & 119)) << 1;
                int i21 = -(((~i14) & 119) | (i14 & (-120)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    str.length();
                    throw null;
                }
                int length2 = str.length();
                if (length2 > i8) {
                    int i23 = a;
                    int i24 = i23 & 125;
                    int i25 = i23 | 125;
                    int i26 = (i24 & i25) + (i25 | i24);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    i8 = length2;
                }
            }
        }
    }

    public static String[] f(String[] strArr) {
        String[] strArr2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 53) << 1) - (i4 ^ 53);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            strArr2 = new String[100];
            i = 0;
        } else {
            strArr2 = new String[8];
            i = 1;
        }
        int i6 = ((i4 | 67) << 1) - (i4 ^ 67);
        b = i6 % 128;
        int i7 = i6 % 2;
        while (i < 8) {
            int i8 = a;
            int i9 = i8 & 67;
            int i10 = ((i8 ^ 67) | i9) << 1;
            int i11 = -((~i9) & (i8 | 67));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            int i13 = i12 % 128;
            b = i13;
            if (i12 % 2 == 0 ? i >= 7 : i >= 57) {
                int i14 = (i13 & 65) + (i13 | 65);
                a = i14 % 128;
                int i15 = i14 % 2;
                i2 = 1;
            } else {
                int i16 = i ^ 1;
                int i17 = ((i & 1) | i16) << 1;
                int i18 = -i16;
                i2 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i19 = ((i8 | 13) << 1) - (i8 ^ 13);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
            strArr2[i] = strArr[i2];
            i = ((i & 1) << 1) + (i ^ 1);
            int i21 = a;
            int i22 = (((i21 & (-10)) | ((~i21) & 9)) - (~(-(-((i21 & 9) << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = (i24 & 5) + (i24 | 5);
        a = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 95 / 0;
        }
        return strArr2;
    }

    public static void c(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length;
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 31) + (i2 | 31);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            length = strArr.length;
            int i4 = 86 / 0;
        } else {
            length = strArr.length;
        }
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int i5 = b;
            int i6 = ((i5 | 55) << 1) - (i5 ^ 55);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                str = strArr[length];
                int i7 = 23 / 0;
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                    int i8 = a;
                    int i9 = i8 & 95;
                    int i10 = (i9 - (~(-(-((i8 ^ 95) | i9))))) - 1;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                }
            } else {
                str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                    int i12 = a;
                    int i13 = i12 & 95;
                    int i14 = (i13 - (~(-(-((i12 ^ 95) | i13))))) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
        }
        int i16 = b;
        int i17 = (-2) - ((((i16 | 6) << 1) - (i16 ^ 6)) ^ (-1));
        a = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static C0250o d(Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 47) << 1;
        int i4 = -(i2 ^ 47);
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (locale == null) {
            int i7 = i2 ^ 51;
            int i8 = ((i2 & 51) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                locale = Locale.getDefault();
                int i11 = 25 / 0;
            } else {
                locale = Locale.getDefault();
            }
            int i12 = b;
            int i13 = i12 & 91;
            int i14 = (((i12 | 91) & (~i13)) - (~(i13 << 1))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        C0250o c0250o = (C0250o) ((ConcurrentHashMap) c).get(locale);
        int i16 = a;
        int i17 = (i16 ^ 55) + ((i16 & 55) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        if (c0250o == null) {
            c0250o = new C0250o(locale);
            ConcurrentMap<Locale, C0250o> concurrentMap = c;
            int i19 = b;
            int i20 = ((i19 & (-14)) | ((~i19) & 13)) + ((i19 & 13) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            C0250o c0250o2 = (C0250o) ((ConcurrentHashMap) concurrentMap).putIfAbsent(locale, c0250o);
            int i22 = a;
            int i23 = (i22 & 107) + (i22 | 107);
            int i24 = i23 % 128;
            b = i24;
            if (i23 % 2 != 0) {
                throw null;
            }
            if (c0250o2 != null) {
                int i25 = i24 + 1;
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    throw null;
                }
                c0250o = c0250o2;
            }
        }
        int i26 = b;
        int i27 = (i26 & 39) + (i26 | 39);
        a = i27 % 128;
        int i28 = i27 % 2;
        return c0250o;
    }
}
