package ivas.gov.bisp.enumeration.aB;

import ivas.gov.bisp.enumeration.bN.Y;
import ivas.gov.bisp.enumeration.bO.u;
import java.util.List;
import java.util.Map;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {
    private static int a = 0;
    private static int b = 1;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final HttpSender.Method g;
    public final String h;
    public final int i;
    public final int j;
    public final Class<? extends ivas.gov.bisp.enumeration.df.h> k;
    public final String l;
    public final Integer m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f53o;
    public final List<TLS> p;
    public final Map<String, String> q;

    @Override // ivas.gov.bisp.enumeration.aB.j
    public final boolean a() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.d;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(boolean z, String str, String str2, String str3, HttpSender.Method method, int i, int i2, boolean z2, Class<? extends ivas.gov.bisp.enumeration.df.h> cls, String str4, Integer num, String str5, boolean z3, List<? extends TLS> list, Map<String, String> map) {
        ivas.gov.bisp.enumeration.O.r.n(str, "uri");
        ivas.gov.bisp.enumeration.O.r.n(method, "httpMethod");
        int i3 = b;
        int i4 = i3 & 61;
        int i5 = (i3 ^ 61) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.n(cls, "keyStoreFactoryClass");
            ivas.gov.bisp.enumeration.O.r.n(str5, "certificateType");
            ivas.gov.bisp.enumeration.O.r.n(list, "tlsProtocols");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(cls, "keyStoreFactoryClass");
        ivas.gov.bisp.enumeration.O.r.n(str5, "certificateType");
        ivas.gov.bisp.enumeration.O.r.n(list, "tlsProtocols");
        ivas.gov.bisp.enumeration.O.r.n(map, "httpHeaders");
        this.d = z;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.g = method;
        this.i = i;
        this.j = i2;
        this.c = z2;
        this.k = cls;
        this.l = str4;
        this.m = num;
        this.f53o = str5;
        this.n = z3;
        this.p = list;
        this.q = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(boolean z, String str, String str2, String str3, HttpSender.Method method, int i, int i2, boolean z2, Class cls, String str4, Integer num, String str5, boolean z3, List list, Map map, int i3, u uVar) {
        boolean z4;
        String str6;
        String str7;
        HttpSender.Method method2;
        int i4;
        int i5;
        boolean z5;
        Class cls2;
        String str8;
        Integer num2;
        String str9;
        boolean z6;
        List listQ;
        Map map2;
        if ((i3 & 1) != 0) {
            int i6 = a;
            int i7 = i6 & 85;
            int i8 = i7 + ((i6 ^ 85) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z4 = true;
        } else {
            z4 = z;
        }
        Object obj = null;
        if ((i3 & 4) != 0) {
            int i11 = a;
            int i12 = i11 ^ 91;
            int i13 = ((i11 & 91) | i12) << 1;
            int i14 = -i12;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((i11 ^ 9) | (i11 & 9)) << 1;
            int i18 = -(((~i11) & 9) | (i11 & (-10)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 4 / 3;
            } else {
                int i21 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i3 & 8) != 0) {
            int i22 = a;
            int i23 = i22 & 107;
            int i24 = ((i22 ^ 107) | i23) << 1;
            int i25 = -((i22 | 107) & (~i23));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i27 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i3 & 16) != 0) {
            int i28 = b;
            int i29 = (i28 ^ 69) + ((i28 & 69) << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            HttpSender.Method method3 = HttpSender.Method.POST;
            int i31 = b;
            int i32 = i31 | 43;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 43)) & i32);
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
            int i37 = 2 % 2;
            method2 = method3;
        } else {
            method2 = method;
        }
        if ((i3 & 32) != 0) {
            int i38 = a;
            int i39 = i38 & 53;
            int i40 = (((~i39) & (i38 | 53)) - (~(i39 << 1))) - 1;
            b = i40 % 128;
            int i41 = i40 % 2;
            int i42 = i38 + 79;
            b = i42 % 128;
            int i43 = i42 % 2;
            int i44 = 2 % 2;
            i4 = 5000;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            int i45 = b;
            int i46 = i45 & 43;
            int i47 = (i46 - (~(-(-((i45 ^ 43) | i46))))) - 1;
            a = i47 % 128;
            int i48 = i47 % 2;
            int i49 = ((i45 ^ 82) + ((i45 & 82) << 1)) - 1;
            a = i49 % 128;
            if (i49 % 2 == 0) {
                int i50 = 2 % 2;
            }
            i5 = 20000;
        } else {
            i5 = i2;
        }
        if ((i3 & 128) != 0) {
            int i51 = b + 105;
            int i52 = i51 % 128;
            a = i52;
            int i53 = i51 % 2;
            int i54 = i52 ^ 19;
            int i55 = ((i52 & 19) | i54) << 1;
            int i56 = -i54;
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            b = i57 % 128;
            int i58 = i57 % 2;
            int i59 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i3 & 256) != 0) {
            int i60 = b;
            int i61 = i60 & 97;
            int i62 = (i60 ^ 97) | i61;
            int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
            int i64 = i63 % 128;
            a = i64;
            int i65 = i63 % 2;
            int i66 = i64 + 57;
            b = i66 % 128;
            int i67 = i66 % 2;
            int i68 = 2 % 2;
            cls2 = ivas.gov.bisp.enumeration.df.r.class;
        } else {
            cls2 = cls;
        }
        if ((i3 & 512) != 0) {
            int i69 = b;
            int i70 = ((i69 ^ 29) - (~(-(-((i69 & 29) << 1))))) - 1;
            a = i70 % 128;
            if (i70 % 2 != 0) {
                int i71 = 33 / 0;
            }
            int i72 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i3 & 1024) != 0) {
            int i73 = b + 7;
            int i74 = i73 % 128;
            a = i74;
            if (i73 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i75 = i74 + 43;
            b = i75 % 128;
            if (i75 % 2 != 0) {
                int i76 = 2 % 2;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i3 & 2048) != 0) {
            int i77 = b;
            int i78 = i77 & 87;
            int i79 = (i78 - (~((i77 ^ 87) | i78))) - 1;
            int i80 = i79 % 128;
            a = i80;
            int i81 = i79 % 2;
            int i82 = i80 & 73;
            int i83 = i80 | 73;
            int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
            b = i84 % 128;
            int i85 = i84 % 2;
            int i86 = 2 % 2;
            str9 = "X.509";
        } else {
            str9 = str5;
        }
        if ((i3 & 4096) != 0) {
            int i87 = b;
            int i88 = i87 ^ 91;
            int i89 = -(-((i87 & 91) << 1));
            int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
            int i91 = i90 % 128;
            a = i91;
            int i92 = i90 % 2;
            int i93 = i91 + 13;
            b = i93 % 128;
            int i94 = i93 % 2;
            int i95 = 2 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i3 & 8192) != 0) {
            int i96 = a;
            int i97 = (i96 & 65) + (i96 | 65);
            b = i97 % 128;
            int i98 = i97 % 2;
            TLS tls = TLS.V1_2;
            int i99 = a;
            int i100 = i99 & 23;
            int i101 = (((i99 ^ 23) | i100) << 1) - ((~i100) & (i99 | 23));
            b = i101 % 128;
            int i102 = i101 % 2;
            TLS[] tlsArr = {TLS.V1_3, tls, TLS.V1_1, TLS.V1};
            int i103 = a;
            int i104 = i103 & 77;
            int i105 = (i103 | 77) & (~i104);
            int i106 = -(-(i104 << 1));
            int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
            b = i107 % 128;
            if (i107 % 2 == 0) {
                ivas.gov.bisp.enumeration.p100w.r.Q(tlsArr);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i108 = 2 % 2;
            listQ = ivas.gov.bisp.enumeration.p100w.r.Q(tlsArr);
        } else {
            listQ = list;
        }
        if ((i3 & 16384) != 0) {
            int i109 = a;
            int i110 = i109 & 91;
            int i111 = -(-((i109 ^ 91) | i110));
            int i112 = (i110 & i111) + (i111 | i110);
            b = i112 % 128;
            int i113 = i112 % 2;
            map2 = Y.c;
            int i114 = b;
            int i115 = (i114 & 21) + (i114 | 21);
            a = i115 % 128;
            if (i115 % 2 == 0) {
                int i116 = 2 % 2;
            }
        } else {
            map2 = map;
        }
        int i117 = a;
        int i118 = i117 & 121;
        int i119 = (i117 ^ 121) | i118;
        int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
        b = i120 % 128;
        if (i120 % 2 != 0) {
            this(z4, str, str6, str7, method2, i4, i5, z5, cls2, str8, num2, str9, z6, listQ, map2);
        } else {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }
}
