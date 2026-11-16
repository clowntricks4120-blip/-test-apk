package ivas.gov.bisp.enumeration.cU;

import ivas.gov.bisp.enumeration.cP.u;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {
    private static int a = 0;
    private static int b = 1;
    public HashMap<Locale, Map<String, Map<String, Object>>> c = f();
    public HashMap<Locale, Map<String, Map<Boolean, Object>>> d = f();

    @Override // ivas.gov.bisp.enumeration.cU.e
    public String b(Locale locale, String str, String str2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-18)) | ((~i2) & 17)) - (~((i2 & 17) << 1))) - 1;
        a = i3 % 128;
        String str3 = null;
        if (i3 % 2 != 0) {
            g(locale, str, str2);
            str3.hashCode();
            throw null;
        }
        String[] strArrG = g(locale, str, str2);
        if (strArrG == null) {
            int i4 = b;
            int i5 = i4 & 31;
            int i6 = (i4 ^ 31) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 4;
            }
        } else {
            str3 = strArrG[0];
            int i9 = b;
            int i10 = i9 & 71;
            int i11 = i10 + ((i9 ^ 71) | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b + 126;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        return str3;
    }

    @Override // ivas.gov.bisp.enumeration.cU.e
    public String e(Locale locale, String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = i3 + ((i2 ^ 89) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        String[] strArrG = g(locale, str, str2);
        if (strArrG == null) {
            int i6 = b + 31;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 60 / 0;
            }
            str3 = null;
        } else {
            str3 = strArrG[1];
            int i8 = b;
            int i9 = i8 | 73;
            int i10 = i9 << 1;
            int i11 = -((~(i8 & 73)) & i9);
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = (-2) - ((a + 6) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
        return str3;
    }

    public final HashMap f() {
        int i = 2 % 2;
        HashMap map = new HashMap(7);
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.AbstractMap, java.util.HashMap] */
    public final String[] g(Locale locale, String str, String str2) {
        Object[] objArr;
        synchronized (this) {
            String[] strArr = null;
            if (locale == null || str == 0 || str2 == null) {
                return null;
            }
            Map map = this.c.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> map2 = this.c;
                HashMap mapF = f();
                map2.put(locale, mapF);
                map = mapF;
            }
            ?? F = (Map) map.get(str);
            if (F == 0) {
                F = f();
                map.put(str, F);
                String[][] zoneStrings = u.c(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        objArr = null;
                        break;
                    }
                    objArr = zoneStrings[i];
                    if (objArr != null && objArr.length >= 5 && str.equals(objArr[0])) {
                        break;
                    }
                    i++;
                }
                String[][] zoneStrings2 = u.c(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                for (int i2 = 0; i2 < length2; i2 = (-2) - (((i2 & 2) + (i2 | 2)) ^ (-1))) {
                    String[] strArr2 = zoneStrings2[i2];
                    if (strArr2 != null && strArr2.length >= 5 && str.equals(strArr2[0])) {
                        strArr = strArr2;
                        break;
                    }
                }
                if (objArr != null && strArr != null) {
                    F.put(objArr[2], new String[]{strArr[2], strArr[1]});
                    if (objArr[2].equals(objArr[4])) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(objArr[4]);
                        sb.append("-Summer");
                        F.put(sb.toString(), new String[]{strArr[4], strArr[3]});
                    } else {
                        F.put(objArr[4], new String[]{strArr[4], strArr[3]});
                    }
                }
            }
            return (String[]) F.get(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.AbstractMap, java.util.HashMap] */
    public final String[] h(Locale locale, String str, String str2, boolean z) {
        String[] strArr;
        synchronized (this) {
            String[] strArr2 = null;
            if (locale == null || str == null || str2 == null) {
                return null;
            }
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = this.d.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> map2 = this.d;
                HashMap mapF = f();
                map2.put(locale, mapF);
                map = mapF;
            }
            ?? F = (Map) map.get(str);
            if (F == 0) {
                F = f();
                map.put(str, F);
                String[][] zoneStrings = u.c(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i = ((i ^ 2) + ((i & 2) << 1)) - 1;
                }
                String[][] zoneStrings2 = u.c(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                for (int i2 = 0; i2 < length2; i2 = (-2) - (((i2 & 2) + (i2 | 2)) ^ (-1))) {
                    String[] strArr3 = zoneStrings2[i2];
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    F.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    F.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) F.get(Boolean.valueOf(z));
        }
    }
}
