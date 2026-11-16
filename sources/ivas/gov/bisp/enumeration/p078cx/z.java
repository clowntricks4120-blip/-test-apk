package ivas.gov.bisp.enumeration.p078cx;

import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p069co.j;
import ivas.gov.bisp.enumeration.p071cq.e;
import ivas.gov.bisp.enumeration.p071cq.p;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.l;
import ivas.gov.bisp.enumeration.p101x.i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private static int a = 0;
    private static int b = 1;
    public static final Map c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    public static final j k;

    public static i b(C0278x c0278x) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 63;
        int i5 = ((((i3 ^ 63) | i4) << 1) - (~(-((i3 | 63) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            c0278x.k(ivas.gov.bisp.enumeration.p056cb.j.a);
            throw null;
        }
        if (c0278x.k(ivas.gov.bisp.enumeration.p056cb.j.a)) {
            e eVar = new e();
            int i6 = b;
            int i7 = (i6 | 15) << 1;
            int i8 = -(((~i6) & 15) | (i6 & (-16)));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return eVar;
        }
        if (c0278x.k(ivas.gov.bisp.enumeration.p056cb.j.c)) {
            p pVar = new p();
            int i11 = b;
            int i12 = ((i11 & (-44)) | ((~i11) & 43)) + ((i11 & 43) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return pVar;
            }
            throw null;
        }
        if (c0278x.k(ivas.gov.bisp.enumeration.p056cb.j.g)) {
            ivas.gov.bisp.enumeration.p071cq.z zVar = new ivas.gov.bisp.enumeration.p071cq.z(128);
            int i13 = a;
            int i14 = i13 ^ 25;
            int i15 = ((i13 & 25) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 15 / 0;
            }
            return zVar;
        }
        if (!c0278x.k(ivas.gov.bisp.enumeration.p056cb.j.h)) {
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized digest OID: ");
            sb.append(c0278x);
            throw new IllegalArgumentException(sb.toString());
        }
        ivas.gov.bisp.enumeration.p071cq.z zVar2 = new ivas.gov.bisp.enumeration.p071cq.z(256);
        int i19 = b;
        int i20 = (i19 & 89) + (i19 | 89);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return zVar2;
        }
        throw null;
    }

    public static j c(int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 63) - (~(-(-((i4 & 63) << 1))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0 ? i2 == 5 : i2 == 5) {
            j jVar = d;
            int i6 = i4 & 91;
            int i7 = -(-((i4 ^ 91) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return jVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = i4 & 37;
        int i10 = ((i4 ^ 37) | i9) << 1;
        int i11 = -((~i9) & (i4 | 37));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        if (i2 != 6) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("unknown security category: ", i2));
        }
        int i14 = (((i4 | 78) << 1) - (i4 ^ 78)) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        j jVar2 = e;
        int i16 = (-2) - (((i4 & 84) + (i4 | 84)) ^ (-1));
        b = i16 % 128;
        int i17 = i16 % 2;
        return jVar2;
    }

    public static j d(String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 19) << 1) - (i3 ^ 19);
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!str.equals("SHA3-256")) {
            if (!str.equals("SHA-512/256")) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r("unknown tree digest: ", str));
            }
            int i6 = b;
            int i7 = (i6 & 75) + (i6 | 75);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return g;
            }
            throw null;
        }
        int i8 = a;
        int i9 = (i8 & 79) + (i8 | 79);
        b = i9 % 128;
        int i10 = i9 % 2;
        j jVar = f;
        int i11 = ((i8 ^ 43) - (~((i8 & 43) << 1))) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return jVar;
        }
        obj.hashCode();
        throw null;
    }

    public static j f(String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 37;
        int i5 = (i4 - (~(-(-((i3 ^ 37) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (str.equals("SHA-256")) {
            int i7 = b;
            int i8 = (i7 ^ 49) + ((i7 & 49) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            j jVar = i;
            int i9 = (i7 & 31) + (i7 | 31);
            a = i9 % 128;
            int i10 = i9 % 2;
            return jVar;
        }
        if (!(!str.equals("SHA-512"))) {
            int i11 = b;
            int i12 = i11 & 47;
            int i13 = (i11 ^ 47) | i12;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            j jVar2 = h;
            int i16 = i11 & 65;
            int i17 = i16 + ((i11 ^ 65) | i16);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 85 / 0;
            }
            return jVar2;
        }
        if (str.equals("SHAKE128")) {
            int i19 = b;
            int i20 = (((i19 ^ 53) | (i19 & 53)) << 1) - ((i19 & (-54)) | ((~i19) & 53));
            a = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            j jVar3 = j;
            int i21 = i19 ^ 35;
            int i22 = ((i19 & 35) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            return jVar3;
        }
        if (!str.equals("SHAKE256")) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r("unknown tree digest: ", str));
        }
        int i26 = b;
        int i27 = (i26 & 13) + (i26 | 13);
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        j jVar4 = k;
        int i30 = i28 ^ 21;
        int i31 = (i28 & 21) << 1;
        int i32 = (i30 & i31) + (i31 | i30);
        b = i32 % 128;
        int i33 = i32 % 2;
        return jVar4;
    }

    static {
        int i2;
        C0278x c0278x = P.i;
        d = new j(c0278x);
        C0278x c0278x2 = P.a;
        e = new j(c0278x2);
        f = new j(ivas.gov.bisp.enumeration.p056cb.j.e);
        g = new j(ivas.gov.bisp.enumeration.p056cb.j.f);
        i = new j(ivas.gov.bisp.enumeration.p056cb.j.a);
        h = new j(ivas.gov.bisp.enumeration.p056cb.j.c);
        j = new j(ivas.gov.bisp.enumeration.p056cb.j.g);
        k = new j(ivas.gov.bisp.enumeration.p056cb.j.h);
        HashMap map = new HashMap();
        int i3 = a;
        int i4 = i3 & 125;
        int i5 = i3 | 125;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            c = map;
            i2 = 3;
        } else {
            c = map;
            i2 = 5;
        }
        map.put(c0278x, Integer.valueOf(i2));
        int i7 = b + 99;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            map.put(c0278x2, 61);
        } else {
            map.put(c0278x2, 6);
        }
    }

    public static String e(l lVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = -(-((i3 ^ 45) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        j jVar = lVar.d;
        C0278x c0278x = jVar.c;
        C0278x c0278x2 = f.c;
        int i8 = a;
        int i9 = ((i8 & 67) - (~(i8 | 67))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        boolean zK = c0278x.k(c0278x2);
        Object obj = null;
        if (zK) {
            int i11 = b;
            int i12 = i11 & 43;
            int i13 = ((i11 ^ 43) | i12) << 1;
            int i14 = -((i11 | 43) & (~i12));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = i15 % 128;
            a = i16;
            if (i15 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i17 = (-2) - ((i16 + 40) ^ (-1));
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 57 / 0;
            }
            return "SHA3-256";
        }
        C0278x c0278x3 = jVar.c;
        C0278x c0278x4 = g.c;
        int i19 = b + 95;
        a = i19 % 128;
        int i20 = i19 % 2;
        if (!c0278x3.k(c0278x4)) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("unknown tree digest: ");
            sbW.append(jVar.c);
            throw new IllegalArgumentException(sbW.toString());
        }
        int i21 = b;
        int i22 = ((i21 ^ 113) | (i21 & 113)) << 1;
        int i23 = -(((~i21) & 113) | (i21 & (-114)));
        int i24 = (i22 & i23) + (i23 | i22);
        int i25 = i24 % 128;
        a = i25;
        if (i24 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i26 = ((i25 & (-18)) | ((~i25) & 17)) + ((i25 & 17) << 1);
        b = i26 % 128;
        if (i26 % 2 != 0) {
            return "SHA-512/256";
        }
        obj.hashCode();
        throw null;
    }
}
