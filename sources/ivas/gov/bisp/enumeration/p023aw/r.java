package ivas.gov.bisp.enumeration.p023aw;

import android.util.Log;
import ivas.gov.bisp.enumeration.p022av.C0095o;
import ivas.gov.bisp.enumeration.p022av.S;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 0;
    private static int b = 1;

    public static String d(Map<String, String> map, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-48)) | ((~i2) & 47);
        int i4 = -(-((i2 & 47) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (map == null) {
            int i7 = i6 & 103;
            int i8 = i7 + ((i6 ^ 103) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            return str;
        }
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            int i10 = b;
            int i11 = (i10 | 49) << 1;
            int i12 = -(i10 ^ 49);
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            String[] strArrSplit = str2.split(";", 0);
            int i15 = b;
            int i16 = i15 & 13;
            int i17 = i16 + ((i15 ^ 13) | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 1;
            while (i19 < strArrSplit.length) {
                int i20 = b;
                int i21 = (((i20 ^ 113) | (i20 & 113)) << 1) - (((~i20) & 113) | (i20 & (-114)));
                a = i21 % 128;
                int i22 = i21 % 2;
                String[] strArrSplit2 = strArrSplit[i19].trim().split("=", 0);
                if (strArrSplit2.length == 2) {
                    int i23 = a;
                    int i24 = i23 & 31;
                    int i25 = -(-((i23 ^ 31) | i24));
                    int i26 = (i24 & i25) + (i25 | i24);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    if (!(!strArrSplit2[0].equals("charset"))) {
                        int i28 = a;
                        int i29 = i28 & 117;
                        int i30 = (((i28 ^ 117) | i29) << 1) - ((~i29) & (i28 | 117));
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        String str3 = strArrSplit2[1];
                        int i32 = i28 & 3;
                        int i33 = ((((i28 ^ 3) | i32) << 1) - (~(-((i28 | 3) & (~i32))))) - 1;
                        b = i33 % 128;
                        if (i33 % 2 == 0) {
                            int i34 = 46 / 0;
                        }
                        return str3;
                    }
                }
                i19 = ((i19 ^ 2) + ((i19 & 2) << 1)) - 1;
                int i35 = b;
                int i36 = i35 & 55;
                int i37 = -(-((i35 ^ 55) | i36));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                a = i38 % 128;
                int i39 = i38 % 2;
            }
        }
        int i40 = b + 111;
        a = i40 % 128;
        if (i40 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static long e(String str) {
        String strC;
        int i = 2 % 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            int i2 = a;
            int i3 = i2 & 53;
            int i4 = ((i2 ^ 53) | i3) << 1;
            int i5 = -((i2 | 53) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat.parse(str).getTime();
            }
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            simpleDateFormat.parse(str).getTime();
            throw null;
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                S.e("Unable to parse dateStr: %s, falling back to 0", str);
                int i7 = b;
                int i8 = i7 & 65;
                int i9 = (i7 | 65) & (~i8);
                int i10 = -(-(i8 << 1));
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = a + 45;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr = new Object[0];
                    objArr[1] = str;
                    strC = S.c("Unable to parse dateStr: %s, falling back to 0", objArr);
                } else {
                    strC = S.c("Unable to parse dateStr: %s, falling back to 0", str);
                }
                Log.e("Volley", strC, e);
                int i14 = a;
                int i15 = ((i14 ^ 88) + ((i14 & 88) << 1)) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = b + 77;
            a = i17 % 128;
            int i18 = i17 % 2;
            return 0L;
        }
    }

    public static Map<String, String> b(ivas.gov.bisp.enumeration.av.r.bJP bjp) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = i3 + ((i2 ^ 97) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (bjp == null) {
            int i6 = i2 & 17;
            int i7 = (i2 ^ 17) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            int i10 = a;
            int i11 = (i10 ^ 116) + ((i10 & 116) << 1);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                return mapEmptyMap;
            }
            throw null;
        }
        HashMap map = new HashMap();
        String str = bjp.b;
        if (str != null) {
            int i13 = b;
            int i14 = i13 & 103;
            int i15 = (i13 | 103) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            map.put("If-None-Match", str);
            int i19 = a + 9;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        long j = bjp.d;
        if (j > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date(j);
            int i21 = b;
            int i22 = ((((i21 ^ 9) | (i21 & 9)) << 1) - (~(-((9 & (~i21)) | (i21 & (-10)))))) - 1;
            a = i22 % 128;
            int i23 = i22 % 2;
            map.put("If-Modified-Since", simpleDateFormat.format(date));
            int i24 = a;
            int i25 = (i24 ^ 3) + ((i24 & 3) << 1);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 2 % 5;
            }
        }
        int i27 = b + 59;
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:28:0x0105  */
    /* JADX WARN: Code duplicated, block: B:31:0x0113 A[PHI: r13
  0x0113: PHI (r13v17 java.lang.String) = (r13v16 java.lang.String), (r13v31 java.lang.String) binds: [B:29:0x0110, B:26:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x012d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:41:0x014c  */
    /* JADX WARN: Code duplicated, block: B:43:0x015e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:48:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01db  */
    /* JADX WARN: Code duplicated, block: B:57:0x0207  */
    /* JADX WARN: Code duplicated, block: B:62:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:96:0x0384  */
    public static ivas.gov.bisp.enumeration.av.r.bJP c(C0095o c0095o) {
        long jE;
        int i;
        boolean z;
        long j;
        boolean z2;
        long j2;
        long jE2;
        long jE3;
        int i2;
        long j3;
        long j4;
        long j5;
        String[] strArrSplit;
        int i3;
        String strTrim;
        int i4;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 113;
        int i11 = (i9 ^ 113) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c0095o.e;
        Object obj = null;
        if (map == null) {
            int i14 = b;
            int i15 = (-2) - ((i14 + 114) ^ (-1));
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i14 & 58) + (i14 | 58);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            int i20 = b + 110;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                e(str);
                obj.hashCode();
                throw null;
            }
            jE = e(str);
            int i22 = a;
            int i23 = i22 & 89;
            int i24 = (((i22 | 89) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
        } else {
            int i26 = b;
            int i27 = i26 & 89;
            int i28 = (((i26 | 89) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
            a = i28 % 128;
            int i29 = i28 % 2;
            jE = 0;
        }
        String str2 = map.get("Cache-Control");
        int i30 = b;
        int i31 = i30 ^ 17;
        int i32 = ((i30 & 17) | i31) << 1;
        int i33 = -i31;
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = i34 % 128;
        a = i35;
        if (i34 % 2 != 0) {
            if (str2 != null) {
                i = 1;
                strArrSplit = str2.split(",", 0);
                int i36 = b;
                int i37 = i36 & 103;
                int i38 = (i37 - (~(-(-((i36 ^ 103) | i37))))) - 1;
                int i39 = i38 % 128;
                a = i39;
                int i40 = i38 % 2;
                int i41 = i39 + 15;
                b = i41 % 128;
                int i42 = i41 % 2;
                z2 = false;
                j = 0;
                j2 = 0;
                while (true) {
                    if (i < strArrSplit.length) {
                        int i43 = a;
                        int i44 = i43 & 11;
                        int i45 = ((i43 ^ 11) | i44) << 1;
                        int i46 = -((~i44) & (i43 | 11));
                        i3 = (i45 & i46) + (i45 | i46);
                        b = i3 % 128;
                        if (i3 % i7 == 0) {
                            strTrim = strArrSplit[i].trim();
                            int i47 = 67 / 0;
                            if (!strTrim.equals("no-cache")) {
                                int i48 = a;
                                int i49 = i48 & 53;
                                int i50 = (~i49) & (i48 | 53);
                                int i51 = -(-(i49 << 1));
                                i5 = (i50 & i51) + (i50 | i51);
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    strTrim.equals("no-store");
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (!(!strTrim.equals("no-store"))) {
                                    int i52 = a + 3;
                                    b = i52 % 128;
                                    int i53 = i52 % 2;
                                    if (!strTrim.startsWith("max-age=")) {
                                        int i54 = b;
                                        int i55 = ((i54 & 24) + (i54 | 24)) - 1;
                                        a = i55 % 128;
                                        int i56 = i55 % 2;
                                        j = Long.parseLong(strTrim.substring(8));
                                        int i57 = b;
                                        int i58 = i57 & 117;
                                        i6 = (((i57 | 117) & (~i58)) - (~(i58 << 1))) - 1;
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            int i59 = 4 / 5;
                                        }
                                    } else if (strTrim.startsWith("stale-while-revalidate=")) {
                                        int i60 = b;
                                        int i61 = i60 & 17;
                                        int i62 = i61 + ((i60 ^ 17) | i61);
                                        a = i62 % 128;
                                        int i63 = i62 % 2;
                                        try {
                                            j2 = Long.parseLong(strTrim.substring(23));
                                            int i64 = a + 119;
                                            int i65 = i64 % 128;
                                            b = i65;
                                            int i66 = i64 % 2;
                                            int i67 = (i65 | 81) << 1;
                                            int i68 = -(((~i65) & 81) | (i65 & (-82)));
                                            int i69 = (i67 & i68) + (i67 | i68);
                                            a = i69 % 128;
                                            int i70 = i69 % 2;
                                        } catch (Exception unused) {
                                        }
                                    } else if (strTrim.equals("must-revalidate")) {
                                        int i71 = b;
                                        int i72 = i71 & 119;
                                        int i73 = (i71 ^ 119) | i72;
                                        int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                                        a = i74 % 128;
                                        int i75 = i74 % 2;
                                        z2 = true;
                                    } else {
                                        int i76 = b;
                                        int i77 = ((((i76 ^ 115) | (i76 & 115)) << 1) - (~(-((115 & (~i76)) | (i76 & (-116)))))) - 1;
                                        a = i77 % 128;
                                        int i78 = i77 % 2;
                                        if (strTrim.equals("proxy-revalidate")) {
                                            int i79 = b;
                                            int i710 = i79 & 119;
                                            int i711 = (i79 ^ 119) | i710;
                                            int i712 = ((i710 | i711) << 1) - (i711 ^ i710);
                                            a = i712 % 128;
                                            int i713 = i712 % 2;
                                            z2 = true;
                                        }
                                    }
                                    int i80 = i ^ (-54);
                                    int i81 = ((i & (-54)) | i80) << 1;
                                    int i82 = -i80;
                                    int i83 = (i81 & i82) + (i82 | i81);
                                    int i84 = (i83 & (-56)) | ((~i83) & 55);
                                    int i85 = (i83 & 55) << 1;
                                    i = (i84 ^ i85) + ((i84 & i85) << 1);
                                    int i86 = b + 31;
                                    a = i86 % 128;
                                    int i87 = i86 % 2;
                                    i7 = 2;
                                }
                            }
                        } else {
                            strTrim = strArrSplit[i].trim();
                            if (!(!strTrim.equals("no-cache"))) {
                                int i410 = a;
                                int i411 = i410 & 53;
                                int i510 = (~i411) & (i410 | 53);
                                int i511 = -(-(i411 << 1));
                                i5 = (i510 & i511) + (i510 | i511);
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    strTrim.equals("no-store");
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                if (!(!strTrim.equals("no-store"))) {
                                    int i512 = a + 3;
                                    b = i512 % 128;
                                    int i513 = i512 % 2;
                                    if (!strTrim.startsWith("max-age=")) {
                                        int i514 = b;
                                        int i515 = ((i514 & 24) + (i514 | 24)) - 1;
                                        a = i515 % 128;
                                        int i516 = i515 % 2;
                                        j = Long.parseLong(strTrim.substring(8));
                                        int i517 = b;
                                        int i518 = i517 & 117;
                                        i6 = (((i517 | 117) & (~i518)) - (~(i518 << 1))) - 1;
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            int i519 = 4 / 5;
                                        }
                                    } else if (strTrim.startsWith("stale-while-revalidate=")) {
                                        int i610 = b;
                                        int i611 = i610 & 17;
                                        int i612 = i611 + ((i610 ^ 17) | i611);
                                        a = i612 % 128;
                                        int i613 = i612 % 2;
                                        j2 = Long.parseLong(strTrim.substring(23));
                                        int i614 = a + 119;
                                        int i615 = i614 % 128;
                                        b = i615;
                                        int i616 = i614 % 2;
                                        int i617 = (i615 | 81) << 1;
                                        int i618 = -(((~i615) & 81) | (i615 & (-82)));
                                        int i619 = (i617 & i618) + (i617 | i618);
                                        a = i619 % 128;
                                        int i714 = i619 % 2;
                                    } else if (strTrim.equals("must-revalidate")) {
                                        int i715 = b;
                                        int i716 = ((((i715 ^ 115) | (i715 & 115)) << 1) - (~(-((115 & (~i715)) | (i715 & (-116)))))) - 1;
                                        a = i716 % 128;
                                        int i717 = i716 % 2;
                                        if (strTrim.equals("proxy-revalidate")) {
                                            int i718 = b;
                                            int i719 = i718 & 119;
                                            int i7110 = (i718 ^ 119) | i719;
                                            int i7111 = ((i719 | i7110) << 1) - (i7110 ^ i719);
                                            a = i7111 % 128;
                                            int i7112 = i7111 % 2;
                                            z2 = true;
                                        }
                                    } else {
                                        int i7113 = b;
                                        int i7114 = i7113 & 119;
                                        int i7115 = (i7113 ^ 119) | i7114;
                                        int i7116 = ((i7114 | i7115) << 1) - (i7115 ^ i7114);
                                        a = i7116 % 128;
                                        int i7117 = i7116 % 2;
                                        z2 = true;
                                    }
                                    int i88 = i ^ (-54);
                                    int i89 = ((i & (-54)) | i88) << 1;
                                    int i810 = -i88;
                                    int i811 = (i89 & i810) + (i810 | i89);
                                    int i812 = (i811 & (-56)) | ((~i811) & 55);
                                    int i813 = (i811 & 55) << 1;
                                    i = (i812 ^ i813) + ((i812 & i813) << 1);
                                    int i814 = b + 31;
                                    a = i814 % 128;
                                    int i815 = i814 % 2;
                                    i7 = 2;
                                }
                            }
                        }
                        int i90 = a;
                        int i91 = i90 ^ 125;
                        i4 = ((((i90 & 125) | i91) << 1) - (~(-i91))) - 1;
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    int i92 = b;
                    int i93 = i92 & 113;
                    int i94 = -(-((i92 ^ 113) | i93));
                    int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                    a = i95 % 128;
                    int i96 = i95 % 2;
                    z = true;
                }
            } else {
                int i97 = ((i35 & 3) - (~(i35 | 3))) - 1;
                b = i97 % 128;
                int i98 = i97 % 2;
                z = false;
                j = 0;
                z2 = false;
                j2 = 0;
            }
        } else if (str2 != null) {
            i = 0;
            strArrSplit = str2.split(",", 0);
            int i310 = b;
            int i311 = i310 & 103;
            int i312 = (i311 - (~(-(-((i310 ^ 103) | i311))))) - 1;
            int i313 = i312 % 128;
            a = i313;
            int i412 = i312 % 2;
            int i413 = i313 + 15;
            b = i413 % 128;
            int i414 = i413 % 2;
            z2 = false;
            j = 0;
            j2 = 0;
            while (true) {
                if (i < strArrSplit.length) {
                    int i415 = a;
                    int i416 = i415 & 11;
                    int i417 = ((i415 ^ 11) | i416) << 1;
                    int i418 = -((~i416) & (i415 | 11));
                    i3 = (i417 & i418) + (i417 | i418);
                    b = i3 % 128;
                    if (i3 % i7 == 0) {
                        strTrim = strArrSplit[i].trim();
                        int i419 = 67 / 0;
                        if (!strTrim.equals("no-cache")) {
                            int i4110 = a;
                            int i4111 = i4110 & 53;
                            int i5110 = (~i4111) & (i4110 | 53);
                            int i5111 = -(-(i4111 << 1));
                            i5 = (i5110 & i5111) + (i5110 | i5111);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                strTrim.equals("no-store");
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            if (!(!strTrim.equals("no-store"))) {
                                int i5112 = a + 3;
                                b = i5112 % 128;
                                int i5113 = i5112 % 2;
                                if (!strTrim.startsWith("max-age=")) {
                                    int i5114 = b;
                                    int i5115 = ((i5114 & 24) + (i5114 | 24)) - 1;
                                    a = i5115 % 128;
                                    int i5116 = i5115 % 2;
                                    j = Long.parseLong(strTrim.substring(8));
                                    int i5117 = b;
                                    int i5118 = i5117 & 117;
                                    i6 = (((i5117 | 117) & (~i5118)) - (~(i5118 << 1))) - 1;
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        int i5119 = 4 / 5;
                                    }
                                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                                    int i6110 = b;
                                    int i6111 = i6110 & 17;
                                    int i6112 = i6111 + ((i6110 ^ 17) | i6111);
                                    a = i6112 % 128;
                                    int i6113 = i6112 % 2;
                                    j2 = Long.parseLong(strTrim.substring(23));
                                    int i6114 = a + 119;
                                    int i6115 = i6114 % 128;
                                    b = i6115;
                                    int i6116 = i6114 % 2;
                                    int i6117 = (i6115 | 81) << 1;
                                    int i6118 = -(((~i6115) & 81) | (i6115 & (-82)));
                                    int i6119 = (i6117 & i6118) + (i6117 | i6118);
                                    a = i6119 % 128;
                                    int i7118 = i6119 % 2;
                                } else if (strTrim.equals("must-revalidate")) {
                                    int i7119 = b;
                                    int i7120 = ((((i7119 ^ 115) | (i7119 & 115)) << 1) - (~(-((115 & (~i7119)) | (i7119 & (-116)))))) - 1;
                                    a = i7120 % 128;
                                    int i7121 = i7120 % 2;
                                    if (strTrim.equals("proxy-revalidate")) {
                                        int i71110 = b;
                                        int i71111 = i71110 & 119;
                                        int i71112 = (i71110 ^ 119) | i71111;
                                        int i71113 = ((i71111 | i71112) << 1) - (i71112 ^ i71111);
                                        a = i71113 % 128;
                                        int i71114 = i71113 % 2;
                                        z2 = true;
                                    }
                                } else {
                                    int i71115 = b;
                                    int i71116 = i71115 & 119;
                                    int i71117 = (i71115 ^ 119) | i71116;
                                    int i71118 = ((i71116 | i71117) << 1) - (i71117 ^ i71116);
                                    a = i71118 % 128;
                                    int i71119 = i71118 % 2;
                                    z2 = true;
                                }
                                int i816 = i ^ (-54);
                                int i817 = ((i & (-54)) | i816) << 1;
                                int i818 = -i816;
                                int i819 = (i817 & i818) + (i818 | i817);
                                int i8110 = (i819 & (-56)) | ((~i819) & 55);
                                int i8111 = (i819 & 55) << 1;
                                i = (i8110 ^ i8111) + ((i8110 & i8111) << 1);
                                int i8112 = b + 31;
                                a = i8112 % 128;
                                int i8113 = i8112 % 2;
                                i7 = 2;
                            }
                        }
                    } else {
                        strTrim = strArrSplit[i].trim();
                        if (!(!strTrim.equals("no-cache"))) {
                            int i4112 = a;
                            int i4113 = i4112 & 53;
                            int i51110 = (~i4113) & (i4112 | 53);
                            int i51111 = -(-(i4113 << 1));
                            i5 = (i51110 & i51111) + (i51110 | i51111);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                strTrim.equals("no-store");
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            if (!(!strTrim.equals("no-store"))) {
                                int i51112 = a + 3;
                                b = i51112 % 128;
                                int i51113 = i51112 % 2;
                                if (!strTrim.startsWith("max-age=")) {
                                    int i51114 = b;
                                    int i51115 = ((i51114 & 24) + (i51114 | 24)) - 1;
                                    a = i51115 % 128;
                                    int i51116 = i51115 % 2;
                                    j = Long.parseLong(strTrim.substring(8));
                                    int i51117 = b;
                                    int i51118 = i51117 & 117;
                                    i6 = (((i51117 | 117) & (~i51118)) - (~(i51118 << 1))) - 1;
                                    a = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        int i51119 = 4 / 5;
                                    }
                                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                                    int i61110 = b;
                                    int i61111 = i61110 & 17;
                                    int i61112 = i61111 + ((i61110 ^ 17) | i61111);
                                    a = i61112 % 128;
                                    int i61113 = i61112 % 2;
                                    j2 = Long.parseLong(strTrim.substring(23));
                                    int i61114 = a + 119;
                                    int i61115 = i61114 % 128;
                                    b = i61115;
                                    int i61116 = i61114 % 2;
                                    int i61117 = (i61115 | 81) << 1;
                                    int i61118 = -(((~i61115) & 81) | (i61115 & (-82)));
                                    int i61119 = (i61117 & i61118) + (i61117 | i61118);
                                    a = i61119 % 128;
                                    int i71120 = i61119 % 2;
                                } else if (strTrim.equals("must-revalidate")) {
                                    int i71121 = b;
                                    int i7122 = ((((i71121 ^ 115) | (i71121 & 115)) << 1) - (~(-((115 & (~i71121)) | (i71121 & (-116)))))) - 1;
                                    a = i7122 % 128;
                                    int i7123 = i7122 % 2;
                                    if (strTrim.equals("proxy-revalidate")) {
                                        int i711110 = b;
                                        int i711111 = i711110 & 119;
                                        int i711112 = (i711110 ^ 119) | i711111;
                                        int i711113 = ((i711111 | i711112) << 1) - (i711112 ^ i711111);
                                        a = i711113 % 128;
                                        int i711114 = i711113 % 2;
                                        z2 = true;
                                    }
                                } else {
                                    int i711115 = b;
                                    int i711116 = i711115 & 119;
                                    int i711117 = (i711115 ^ 119) | i711116;
                                    int i711118 = ((i711116 | i711117) << 1) - (i711117 ^ i711116);
                                    a = i711118 % 128;
                                    int i711119 = i711118 % 2;
                                    z2 = true;
                                }
                                int i8114 = i ^ (-54);
                                int i8115 = ((i & (-54)) | i8114) << 1;
                                int i8116 = -i8114;
                                int i8117 = (i8115 & i8116) + (i8116 | i8115);
                                int i8118 = (i8117 & (-56)) | ((~i8117) & 55);
                                int i8119 = (i8117 & 55) << 1;
                                i = (i8118 ^ i8119) + ((i8118 & i8119) << 1);
                                int i81110 = b + 31;
                                a = i81110 % 128;
                                int i81111 = i81110 % 2;
                                i7 = 2;
                            }
                        }
                    }
                    int i99 = a;
                    int i910 = i99 ^ 125;
                    i4 = ((((i99 & 125) | i910) << 1) - (~(-i910))) - 1;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i911 = b;
                int i912 = i911 & 113;
                int i913 = -(-((i911 ^ 113) | i912));
                int i914 = (i912 ^ i913) + ((i913 & i912) << 1);
                a = i914 % 128;
                int i915 = i914 % 2;
                z = true;
            }
        } else {
            int i916 = ((i35 & 3) - (~(i35 | 3))) - 1;
            b = i916 % 128;
            int i917 = i916 % 2;
            z = false;
            j = 0;
            z2 = false;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        int i100 = a;
        int i101 = ((i100 | 23) << 1) - (i100 ^ 23);
        int i102 = i101 % 128;
        b = i102;
        int i103 = i101 % 2;
        if (str3 != null) {
            int i104 = ((i100 & 3) - (~(i100 | 3))) - 1;
            b = i104 % 128;
            if (i104 % 2 == 0) {
                e(str3);
                Object obj6 = null;
                obj6.hashCode();
                throw null;
            }
            jE2 = e(str3);
        } else {
            int i105 = (i102 ^ 47) + ((i102 & 47) << 1);
            a = i105 % 128;
            int i106 = i105 % 2;
            jE2 = 0;
        }
        String str4 = map.get("Last-Modified");
        int i107 = b;
        int i108 = i107 ^ 123;
        int i109 = -(-((i107 & 123) << 1));
        int i110 = (i108 & i109) + (i109 | i108);
        a = i110 % 128;
        if (i110 % 2 != 0) {
            int i111 = 31 / 0;
            if (str4 != null) {
                jE3 = e(str4);
                int i112 = a;
                i2 = ((i112 & 24) + (i112 | 24)) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i113 = 4 / 4;
                }
            } else {
                int i114 = i107 & 103;
                int i115 = (~i114) & (i107 | 103);
                int i116 = i114 << 1;
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                a = i117 % 128;
                int i118 = i117 % 2;
                jE3 = 0;
            }
        } else if (str4 != null) {
            jE3 = e(str4);
            int i119 = a;
            i2 = ((i119 & 24) + (i119 | 24)) - 1;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i1110 = 4 / 4;
            }
        } else {
            int i1111 = i107 & 103;
            int i1112 = (~i1111) & (i107 | 103);
            int i1113 = i1111 << 1;
            int i1114 = (i1112 ^ i1113) + ((i1113 & i1112) << 1);
            a = i1114 % 128;
            int i1115 = i1114 % 2;
            jE3 = 0;
        }
        String str5 = map.get("ETag");
        if (z) {
            int i120 = b;
            int i121 = (i120 ^ 91) + ((i120 & 91) << 1);
            a = i121 % 128;
            int i122 = i121 % 2;
            j3 = (j * 1000) + jCurrentTimeMillis;
            int i123 = i120 + 73;
            int i124 = i123 % 128;
            a = i124;
            int i125 = i123 % 2;
            if (z2) {
                int i126 = (-2) - ((i124 + 108) ^ (-1));
                b = i126 % 128;
                int i127 = i126 % 2;
                int i128 = i124 + 37;
                b = i128 % 128;
                int i129 = i128 % 2;
                j5 = j3;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j3;
            }
            int i130 = i124 ^ 51;
            int i131 = ((i124 & 51) | i130) << 1;
            int i132 = -i130;
            int i133 = (i131 & i132) + (i132 | i131);
            b = i133 % 128;
            int i134 = i133 % 2;
            j4 = j5;
        } else {
            j3 = 0;
            if (jE > 0) {
                int i135 = a;
                int i136 = ((i135 | 65) << 1) - (i135 ^ 65);
                int i137 = i136 % 128;
                b = i137;
                int i138 = i136 % 2;
                if (jE2 >= jE) {
                    int i139 = ((i137 ^ 12) + ((i137 & 12) << 1)) - 1;
                    a = i139 % 128;
                    j3 = i139 % 2 != 0 ? jCurrentTimeMillis ^ (jE2 - jE) : jCurrentTimeMillis + (jE2 - jE);
                } else {
                    int i140 = b;
                    int i141 = (-2) - (((i140 ^ 42) + ((i140 & 42) << 1)) ^ (-1));
                    a = i141 % 128;
                    int i142 = i141 % 2;
                }
            } else {
                int i143 = b;
                int i144 = (-2) - (((i143 ^ 42) + ((i143 & 42) << 1)) ^ (-1));
                a = i144 % 128;
                int i145 = i144 % 2;
            }
            j4 = j3;
        }
        ivas.gov.bisp.enumeration.av.r.bJP bjp = new ivas.gov.bisp.enumeration.av.r.bJP();
        byte[] bArr = c0095o.d;
        int i146 = a + 17;
        b = i146 % 128;
        int i147 = i146 % 2;
        bjp.a = bArr;
        bjp.b = str5;
        int i148 = a;
        int i149 = ((i148 | 24) << 1) - (i148 ^ 24);
        int i150 = (i149 ^ (-1)) + (i149 << 1);
        b = i150 % 128;
        int i151 = i150 % 2;
        bjp.e = j3;
        bjp.f = j4;
        int i152 = a;
        int i153 = ((i152 ^ 110) + ((i152 & 110) << 1)) - 1;
        b = i153 % 128;
        int i154 = i153 % 2;
        bjp.c = jE;
        bjp.d = jE3;
        int i155 = a;
        int i156 = (-2) - (((i155 & 80) + (i155 | 80)) ^ (-1));
        b = i156 % 128;
        if (i156 % 2 == 0) {
            bjp.g = map;
            bjp.h = c0095o.f;
            int i157 = 51 / 0;
        } else {
            bjp.g = map;
            bjp.h = c0095o.f;
        }
        return bjp;
    }
}
