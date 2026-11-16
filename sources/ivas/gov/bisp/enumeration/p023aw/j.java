package ivas.gov.bisp.enumeration.p023aw;

import android.os.SystemClock;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o0ooOOo;
import ivas.gov.bisp.enumeration.p022av.C0095o;
import ivas.gov.bisp.enumeration.p022av.C0096p;
import ivas.gov.bisp.enumeration.p022av.J;
import ivas.gov.bisp.enumeration.p022av.Q;
import ivas.gov.bisp.enumeration.p022av.S;
import ivas.gov.bisp.enumeration.p022av.T;
import ivas.gov.bisp.enumeration.p022av.a;
import ivas.gov.bisp.enumeration.p022av.u;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j implements u {
    private static int a = 0;
    private static int b = 1;
    public final h c;
    public final c d;

    public j(h hVar) {
        c cVar = new c(4096);
        this.c = hVar;
        this.d = cVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ivas.gov.bisp.enumeration.o0ooOO0.o0ooOOo */
    /* JADX WARN: Code duplicated, block: B:135:0x0361  */
    /* JADX WARN: Code duplicated, block: B:136:0x0368  */
    public C0095o c(o00O0O<?> o00o0o) throws Throwable {
        long jElapsedRealtime;
        e eVar;
        byte[] bArr;
        byte[] bArr2;
        P.bKC bkc;
        T t;
        Object[] objArr;
        int i;
        e eVarT;
        int i2;
        List listD;
        byte[] bArrC;
        int i3;
        c cVar;
        int i4 = 2 % 2;
        int i5 = b + 97;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            int i6 = 60 / 0;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        int i7 = a;
        int i8 = ((i7 ^ 112) + ((i7 & 112) << 1)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        while (true) {
            Collections.emptyList();
            try {
                Map<String, String> mapB = r.b(o00o0o.f68o);
                int i10 = b;
                int i11 = ((i10 & (-54)) | ((~i10) & 53)) + ((i10 & 53) << 1);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    eVarT = this.c.T(o00o0o, mapB);
                    int i12 = 71 / 0;
                } else {
                    eVarT = this.c.T(o00o0o, mapB);
                }
                eVar = eVarT;
                int i13 = b;
                int i14 = i13 & 113;
                int i15 = (((i13 | 113) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    try {
                        i2 = eVar.c;
                        listD = eVar.d();
                        int i16 = 87 / 0;
                    } catch (IOException e) {
                        e = e;
                        bArr = null;
                    }
                } else {
                    i2 = eVar.c;
                    listD = eVar.d();
                }
                int i17 = i2;
                if (i17 == 304) {
                    int i18 = b;
                    int i19 = i18 & 113;
                    int i20 = (((i18 ^ 113) | i19) << 1) - ((i18 | 113) & (~i19));
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    int i22 = b + 70;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    C0095o c0095oB = P.b(o00o0o, jElapsedRealtime2, listD);
                    int i25 = a;
                    int i26 = ((i25 & (-8)) | ((~i25) & 7)) + ((i25 & 7) << 1);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        return c0095oB;
                    }
                    throw null;
                }
                InputStream inputStreamC = eVar.c();
                if (inputStreamC != null) {
                    int i27 = b;
                    int i28 = ((i27 ^ 98) + ((i27 & 98) << 1)) - 1;
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        i3 = eVar.d;
                        cVar = this.d;
                        int i29 = 93 / 0;
                    } else {
                        i3 = eVar.d;
                        cVar = this.d;
                    }
                    bArrC = P.c(inputStreamC, i3, cVar);
                    int i30 = a;
                    int i31 = i30 & 107;
                    int i32 = i31 + ((i30 ^ 107) | i31);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                } else {
                    bArrC = new byte[0];
                    int i34 = a;
                    int i35 = i34 | 55;
                    int i36 = ((i35 << 1) - (~(-((~(i34 & 55)) & i35)))) - 1;
                    b = i36 % 128;
                    int i37 = i36 % 2;
                }
                byte[] bArr3 = bArrC;
                try {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    int i38 = b;
                    int i39 = (i38 & 37) + (i38 | 37);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                    P.d(jElapsedRealtime3, o00o0o, bArr3, i17);
                    try {
                        if (i17 >= 200) {
                            int i41 = a;
                            int i42 = i41 & 79;
                            int i43 = i42 + ((i41 ^ 79) | i42);
                            b = i43 % 128;
                            int i44 = i43 % 2;
                            if (i17 <= 299) {
                                C0095o c0095o = new C0095o(i17, bArr3, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                                int i45 = b;
                                int i46 = ((i45 ^ 124) + ((i45 & 124) << 1)) - 1;
                                a = i46 % 128;
                                if (i46 % 2 == 0) {
                                    return c0095o;
                                }
                                throw null;
                            }
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                                bkc = new P.bKC("socket", new Q(), null);
                                int i47 = a;
                                int i48 = i47 & 71;
                                int i49 = (i48 - (~(-(-((i47 ^ 71) | i48))))) - 1;
                                int i50 = i49 % 128;
                                b = i50;
                                int i51 = i49 % 2;
                                int i52 = i50 + 51;
                                a = i52 % 128;
                                int i53 = i52 % 2;
                            } else {
                                if (e instanceof MalformedURLException) {
                                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Bad URL ");
                                    sbW.append(o00o0o.f);
                                    throw new RuntimeException(sbW.toString(), e);
                                }
                                int i54 = a;
                                int i55 = (-2) - (((i54 ^ 98) + ((i54 & 98) << 1)) ^ (-1));
                                int i56 = i55 % 128;
                                b = i56;
                                int i57 = i55 % 2;
                                if (eVar == null) {
                                    throw new J(e);
                                }
                                int i58 = i56 & 45;
                                int i59 = -(-((i56 ^ 45) | i58));
                                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                                a = i60 % 128;
                                int i61 = i60 % 2;
                                int i62 = eVar.c;
                                int i63 = a;
                                int i64 = ((i63 | 122) << 1) - (i63 ^ 122);
                                int i65 = (i64 ^ (-1)) + (i64 << 1);
                                b = i65 % 128;
                                int i66 = i65 % 2;
                                Object[] objArr2 = {Integer.valueOf(i62), o00o0o.f};
                                int i67 = b;
                                int i68 = ((((i67 ^ 1) | (i67 & 1)) << 1) - (~(-(((~i67) & 1) | (i67 & (-2)))))) - 1;
                                a = i68 % 128;
                                if (i68 % 2 != 0) {
                                    S.d("Unexpected response code %d for %s", objArr2);
                                    throw null;
                                }
                                S.d("Unexpected response code %d for %s", objArr2);
                                if (bArr != null) {
                                    C0095o c0095o2 = new C0095o(i62, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, eVar.d());
                                    int i69 = a;
                                    int i70 = (i69 | 115) << 1;
                                    int i71 = -((i69 & (-116)) | ((~i69) & 115));
                                    int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                                    b = i72 % 128;
                                    if (i72 % 2 != 0 ? i62 != 401 : i62 != 26522) {
                                        if (i62 != 403) {
                                            int i73 = i69 + 105;
                                            b = i73 % 128;
                                            if (i73 % 2 != 0 ? i62 >= 400 : i62 >= 18721) {
                                                if (i62 <= 499) {
                                                    throw new C0096p(c0095o2);
                                                }
                                            }
                                            throw new a(c0095o2);
                                        }
                                    }
                                    bkc = new P.bKC("auth", new ivas.gov.bisp.enumeration.p022av.h(c0095o2), null);
                                    int i74 = a;
                                    int i75 = (i74 ^ 19) + ((i74 & 19) << 1);
                                    b = i75 % 128;
                                    if (i75 % 2 == 0) {
                                        throw null;
                                    }
                                    int i76 = (i74 ^ 58) + ((i74 & 58) << 1);
                                    int i77 = (i76 ^ (-1)) + (i76 << 1);
                                    b = i77 % 128;
                                    int i78 = i77 % 2;
                                } else {
                                    bkc = new P.bKC("network", new a(), null);
                                    int i79 = a + 115;
                                    b = i79 % 128;
                                    if (i79 % 2 == 0) {
                                        throw null;
                                    }
                                }
                            }
                            P.bKC bkc2 = bkc;
                            z zVar = o00o0o.m;
                            int i80 = zVar.a;
                            try {
                                t = bkc2.b;
                                int i81 = a;
                                int i82 = (((i81 | 35) << 1) - (~(-(((~i81) & 35) | (i81 & (-36)))))) - 1;
                                b = i82 % 128;
                                int i83 = i82 % 2;
                                int i84 = zVar.b;
                                int i85 = (i84 | 1) << 1;
                                int i86 = -(((~i84) & 1) | (i84 & (-2)));
                                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                                zVar.b = i87;
                                int i88 = a;
                                int i89 = i88 & 3;
                                int i90 = (i88 ^ 3) | i89;
                                int i91 = (i89 & i90) + (i90 | i89);
                                b = i91 % 128;
                                int i92 = i91 % 2;
                                int i93 = (int) (i80 * zVar.d);
                                int i94 = a;
                                int i95 = ((i94 | 111) << 1) - (i94 ^ 111);
                                b = i95 % 128;
                                if (i95 % 2 == 0) {
                                    zVar.a = i93 << i80;
                                    if (i87 > zVar.c) {
                                        break;
                                    }
                                    int i96 = a;
                                    int i97 = ((((i96 ^ 123) | (i96 & 123)) << 1) - (~(-(((~i96) & 123) | (i96 & (-124)))))) - 1;
                                    int i98 = i97 % 128;
                                    b = i98;
                                    int i99 = i97 % 2;
                                    int i100 = i98 + 53;
                                    a = i100 % 128;
                                    int i101 = i100 % 2;
                                    int i102 = i98 ^ 109;
                                    int i103 = ((i98 & 109) | i102) << 1;
                                    int i104 = -i102;
                                    int i105 = (i103 & i104) + (i103 | i104);
                                    a = i105 % 128;
                                    int i106 = i105 % 2;
                                    objArr = new Object[2];
                                    objArr[0] = bkc2.a;
                                    int i107 = a;
                                    int i108 = (i107 | 41) << 1;
                                    int i109 = -(i107 ^ 41);
                                    i = (i108 & i109) + (i109 | i108);
                                    b = i % 128;
                                    if (i % 2 == 0) {
                                        objArr[0] = Integer.valueOf(i80);
                                    } else {
                                        objArr[1] = Integer.valueOf(i80);
                                    }
                                    o00o0o.c(String.format("%s-retry [timeout=%s]", objArr));
                                    int i110 = a;
                                    int i111 = i110 & 111;
                                    int i112 = ((i110 ^ 111) | i111) << 1;
                                    int i113 = -((i110 | 111) & (~i111));
                                    int i114 = (i112 & i113) + (i113 | i112);
                                    b = i114 % 128;
                                    int i115 = i114 % 2;
                                } else {
                                    int i116 = -(-i80);
                                    int i117 = ((~i116) & i93) | ((~i93) & i116);
                                    int i118 = (i93 & i116) << 1;
                                    zVar.a = (i117 ^ i118) + ((i118 & i117) << 1);
                                    if (i87 > zVar.c) {
                                        break;
                                    }
                                    int i910 = a;
                                    int i911 = ((((i910 ^ 123) | (i910 & 123)) << 1) - (~(-(((~i910) & 123) | (i910 & (-124)))))) - 1;
                                    int i912 = i911 % 128;
                                    b = i912;
                                    int i913 = i911 % 2;
                                    int i1010 = i912 + 53;
                                    a = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    int i1012 = i912 ^ 109;
                                    int i1013 = ((i912 & 109) | i1012) << 1;
                                    int i1014 = -i1012;
                                    int i1015 = (i1013 & i1014) + (i1013 | i1014);
                                    a = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                    objArr = new Object[2];
                                    objArr[0] = bkc2.a;
                                    int i1017 = a;
                                    int i1018 = (i1017 | 41) << 1;
                                    int i1019 = -(i1017 ^ 41);
                                    i = (i1018 & i1019) + (i1019 | i1018);
                                    b = i % 128;
                                    if (i % 2 == 0) {
                                        objArr[0] = Integer.valueOf(i80);
                                    } else {
                                        objArr[1] = Integer.valueOf(i80);
                                    }
                                    o00o0o.c(String.format("%s-retry [timeout=%s]", objArr));
                                    int i119 = a;
                                    int i1110 = i119 & 111;
                                    int i1111 = ((i119 ^ 111) | i1110) << 1;
                                    int i1112 = -((i119 | 111) & (~i1110));
                                    int i1113 = (i1111 & i1112) + (i1112 | i1111);
                                    b = i1113 % 128;
                                    int i1114 = i1113 % 2;
                                }
                            } catch (o0ooOOo e2) {
                                int i120 = b;
                                int i121 = i120 & 97;
                                int i122 = (i121 - (~(-(-((i120 ^ 97) | i121))))) - 1;
                                a = i122 % 128;
                                int i123 = i122 % 2;
                                String str = String.format("%s-timeout-giveup [timeout=%s]", bkc2.a, Integer.valueOf(i80));
                                int i124 = a;
                                int i125 = i124 & 51;
                                int i126 = ((i124 | 51) & (~i125)) + (i125 << 1);
                                b = i126 % 128;
                                int i127 = i126 % 2;
                                o00o0o.c(str);
                                throw e2;
                            }
                        }
                        throw new IOException();
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bArr2 = bArr3;
                }
            } catch (IOException e5) {
                e = e5;
                eVar = null;
                bArr = null;
            }
        }
        int i128 = a;
        int i129 = ((i128 ^ 57) | (i128 & 57)) << 1;
        int i130 = -(((~i128) & 57) | (i128 & (-58)));
        int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
        b = i131 % 128;
        if (i131 % 2 != 0) {
            throw t;
        }
        int i132 = 3 / 2;
        throw t;
    }
}
