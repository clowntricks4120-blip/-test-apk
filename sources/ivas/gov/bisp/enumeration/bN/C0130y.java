package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bN.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0130y extends r {
    private static int a = 1;
    private static int b;

    public static final int an(Iterable iterable, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 39;
        int i5 = (i3 ^ 39) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.O.r.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            int i8 = a;
            int i9 = ((i8 | 103) << 1) - (((~i8) & 103) | (i8 & (-104)));
            b = i9 % 128;
            int i10 = i9 % 2;
            i = ((Collection) iterable).size();
            int i11 = a;
            int i12 = ((i11 ^ 23) | (i11 & 23)) << 1;
            int i13 = -(((~i11) & 23) | (i11 & (-24)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 % 3;
            }
        }
        int i16 = a;
        int i17 = i16 & 27;
        int i18 = (i16 | 27) & (~i17);
        int i19 = i17 << 1;
        int i20 = (i18 & i19) + (i18 | i19);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public static final Object ao(Map map, Object obj) {
        Object objE;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 13;
        int i6 = ((i4 ^ 13) | i5) << 1;
        int i7 = -((i4 | 13) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        ivas.gov.bisp.enumeration.O.r.n(map, "<this>");
        if (!(map instanceof K)) {
            objE = map.get(obj);
            if (objE == null) {
                int i10 = b;
                int i11 = i10 & 13;
                int i12 = (i10 ^ 13) | i11;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                if (!map.containsKey(obj)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Key ");
                    int i15 = b;
                    int i16 = i15 ^ 109;
                    int i17 = ((i15 & 109) | i16) << 1;
                    int i18 = -i16;
                    int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    sb.append(obj);
                    sb.append(" is missing in the map.");
                    throw new NoSuchElementException(sb.toString());
                }
            }
            int i21 = b;
            int i22 = i21 & 55;
            i = i22 + ((i21 ^ 55) | i22);
            i2 = i % 128;
        } else {
            int i23 = b;
            int i24 = (i23 ^ 85) + ((i23 & 85) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            objE = ((K) map).e(obj);
            int i26 = b;
            i = ((i26 & (-40)) | ((~i26) & 39)) + ((i26 & 39) << 1);
            i2 = i % 128;
        }
        a = i2;
        int i27 = i % 2;
        int i28 = b;
        int i29 = i28 & 71;
        int i30 = -(-((i28 ^ 71) | i29));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        a = i31 % 128;
        if (i31 % 2 != 0) {
            return objE;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final Map ap(Map map) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        int i2 = a;
        int i3 = (i2 & (-54)) | ((~i2) & 53);
        int i4 = -(-((i2 & 53) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashMap;
    }

    public static final List am(Object[] objArr) {
        List listAsList;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-34)) | ((~i2) & 33)) + ((i2 & 33) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(objArr, "<this>");
            listAsList = Arrays.asList(objArr);
            int i4 = 59 / 0;
        } else {
            ivas.gov.bisp.enumeration.O.r.n(objArr, "<this>");
            listAsList = Arrays.asList(objArr);
        }
        ivas.gov.bisp.enumeration.O.r.m(listAsList, "asList(this)");
        int i5 = b;
        int i6 = ((i5 ^ 97) - (~(-(-((i5 & 97) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return listAsList;
    }
}
