package ivas.gov.bisp.enumeration.bD;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.cC.C0237p;
import ivas.gov.bisp.enumeration.cE.W;
import ivas.gov.bisp.enumeration.cH.o;
import ivas.gov.bisp.enumeration.p020at.au;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p074ct.c;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T {
    private static int a = 0;
    private static int b = 1;

    public static boolean b(r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 73) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        return true;
    }

    public static String c(String str, au auVar, String str2, au auVar2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = b;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = (i2 & 105) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        sb.append(auVar);
        sb.append(str2);
        if (i6 != 0) {
            throw null;
        }
        int i7 = a;
        int i8 = (((i7 ^ 79) | (i7 & 79)) << 1) - (((~i7) & 79) | (i7 & (-80)));
        b = i8 % 128;
        int i9 = i8 % 2;
        sb.append(auVar2);
        String string = sb.toString();
        if (i9 == 0) {
            int i10 = 90 / 0;
        }
        return string;
    }

    public static HashSet d(HashMap map, String str, au.bae baeVar, int i) {
        int i2 = 2 % 2;
        map.put(str, baeVar);
        HashSet hashSet = new HashSet(i);
        int i3 = a;
        int i4 = i3 ^ 31;
        int i5 = ((((i3 & 31) | i4) << 1) - (~(-i4))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return hashSet;
    }

    public static void e(int i, c cVar, C0278x c0278x) {
        int i2 = 2 % 2;
        cVar.c(c0278x, new W(i));
        int i3 = a;
        int i4 = (i3 & (-58)) | ((~i3) & 57);
        int i5 = -(-((i3 & 57) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void f(int i, c cVar, C0278x c0278x) {
        int i2 = 2 % 2;
        cVar.c(c0278x, new o(i));
        int i3 = a;
        int i4 = ((i3 & 29) - (~(i3 | 29))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void g(int i, String str, HashMap map, String str2) {
        int i2 = 2 % 2;
        map.put(str2, new C0237p(i, str));
        int i3 = a + 37;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 17;
        int i5 = -(-(i3 | 17));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0 ? i == 1 : i == 0) {
            int i8 = i3 & 61;
            int i9 = i8 + ((i3 ^ 61) | i8);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 65 / 0;
            }
            int i11 = i3 & 123;
            int i12 = -(-((i3 ^ 123) | i11));
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            return "LOW";
        }
        if (i == 2) {
            int i15 = i7 ^ 115;
            int i16 = ((((i7 & 115) | i15) << 1) - (~(-i15))) - 1;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                return "NORMAL";
            }
            int i17 = 39 / 0;
            return "NORMAL";
        }
        if (i == 3) {
            int i18 = i7 + 21;
            a = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i7 & 31;
            int i21 = (i7 ^ 31) | i20;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                return "HIGH";
            }
            throw null;
        }
        if (i != 4) {
            int i23 = (i7 & 80) + (i7 | 80);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            return "null";
        }
        int i26 = (((i3 | 66) << 1) - (i3 ^ 66)) - 1;
        b = i26 % 128;
        int i27 = i26 % 2;
        int i28 = ((((i3 ^ 103) | (i3 & 103)) << 1) - (~(-(((~i3) & 103) | (i3 & (-104)))))) - 1;
        b = i28 % 128;
        int i29 = i28 % 2;
        return "IMMEDIATE";
    }
}
