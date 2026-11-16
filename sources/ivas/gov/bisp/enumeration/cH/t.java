package ivas.gov.bisp.enumeration.cH;

import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p069co.j;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.e;
import ivas.gov.bisp.enumeration.p080cz.h;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes.dex */
public class t implements PrivateKey {
    private static int a = 0;
    private static int b = 1;
    public h c;

    public t(h hVar) {
        this.c = hVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 71;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 71)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = ((((i7 ^ 35) | (i7 & 35)) << 1) - (~(-(((~i7) & 35) | (i7 & (-36)))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return "McEliece-CCA2";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        byte[] encoded = null;
        try {
            h hVar = this.c;
            c cVar = new c(new j(P.d), new e(hVar.R, hVar.S, hVar.b, hVar.T, hVar.V, r.L(hVar.a)), null, null);
            int i2 = a + 87;
            b = i2 % 128;
            int i3 = i2 % 2;
            encoded = cVar.getEncoded();
            int i4 = a;
            int i5 = i4 & 105;
            int i6 = i5 + ((i4 ^ 105) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
        } catch (IOException unused) {
        }
        int i8 = b;
        int i9 = (-2) - ((((i8 | 124) << 1) - (i8 ^ 124)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        return encoded;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (((~i3) & (i2 | 113)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 99;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return "PKCS#8";
    }

    public int hashCode() {
        h hVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & 8) + (i4 | 8)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            hVar = this.c;
            i = hVar.S;
            int i6 = 42 / 0;
        } else {
            hVar = this.c;
            i = hVar.S;
        }
        int i7 = hVar.R;
        int i8 = hVar.b.d;
        int i9 = a;
        int i10 = i9 & 103;
        int i11 = i10 + ((i9 ^ 103) | i10);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            hVar.T.hashCode();
            throw null;
        }
        int iHashCode = hVar.T.hashCode();
        h hVar2 = this.c;
        int i12 = b;
        int i13 = ((i12 | 83) << 1) - (i12 ^ 83);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            hVar2.V.hashCode();
            ivas.gov.bisp.enumeration.cK.j jVar = this.c.U;
            throw null;
        }
        int iHashCode2 = hVar2.V.hashCode();
        int iHashCode3 = this.c.U.hashCode();
        int i14 = i * 37;
        int i15 = -(-i7);
        int i16 = i14 & i15;
        int i17 = (i14 | i15) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int i20 = a;
        int i21 = (i20 | 43) << 1;
        int i22 = -((i20 & (-44)) | ((~i20) & 43));
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = (((((i19 | 41) << 1) - (i19 ^ 41)) - 1) >>> i8) % 47;
            int i25 = iHashCode & i24;
            int i26 = i25 + ((iHashCode ^ i24) | i25);
            i2 = iHashCode2 * (((i26 | (-27)) << 1) - (i26 ^ (-27)));
        } else {
            int i27 = i19 * 37;
            int i28 = -(-i8);
            int i29 = i27 & i28;
            int i30 = (i28 | i27) & (~i29);
            int i31 = -(-(i29 << 1));
            int i32 = ((i30 & i31) + (i30 | i31)) * 37;
            int i33 = iHashCode ^ i32;
            int i34 = ((iHashCode & i32) | i33) << 1;
            int i35 = -i33;
            int i36 = (((i34 | i35) << 1) - (i34 ^ i35)) * 37;
            int i37 = iHashCode2 ^ i36;
            int i38 = ((iHashCode2 & i36) | i37) << 1;
            int i39 = -i37;
            i2 = (i38 & i39) + (i39 | i38);
        }
        int i40 = (((i20 | 34) << 1) - (i20 ^ 34)) - 1;
        b = i40 % 128;
        int i41 = i40 % 2;
        int i42 = -(-(i2 * 37));
        int i43 = iHashCode3 ^ i42;
        int i44 = ((i42 & iHashCode3) | i43) << 1;
        int i45 = -i43;
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = i20 ^ 17;
        int i48 = ((i20 & 17) | i47) << 1;
        int i49 = -i47;
        int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
        b = i50 % 128;
        int i51 = i50 % 2;
        return i46;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x010a  */
    /* JADX WARN: Code duplicated, block: B:37:0x012f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    public boolean equals(Object obj) {
        ivas.gov.bisp.enumeration.cK.e eVar;
        h hVar;
        int i;
        ivas.gov.bisp.enumeration.cK.r rVar;
        h hVar2;
        int i2;
        ivas.gov.bisp.enumeration.cK.j jVar;
        ivas.gov.bisp.enumeration.cK.j jVar2;
        int i3;
        boolean zEquals;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 95;
        int i7 = (i5 ^ 95) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        Object obj2 = null;
        if (i8 % 2 != 0) {
            throw null;
        }
        boolean z = false;
        if (obj == null || (!(obj instanceof t))) {
            int i9 = (-2) - ((a + 64) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = i5 ^ 57;
            int i12 = -(-((i5 & 57) << 1));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            t tVar = (t) obj;
            h hVar3 = this.c;
            int i15 = hVar3.R;
            int i16 = a;
            int i17 = i16 & 67;
            int i18 = -(-((i16 ^ 67) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            h hVar4 = tVar.c;
            if (i15 == hVar4.R) {
                int i21 = b;
                int i22 = ((i21 | 67) << 1) - (i21 ^ 67);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = hVar3.S;
                    int i24 = hVar4.S;
                    obj2.hashCode();
                    throw null;
                }
                if (hVar3.S == hVar4.S) {
                    int i25 = a + 91;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    ivas.gov.bisp.enumeration.cK.c cVar = hVar3.b;
                    ivas.gov.bisp.enumeration.cK.c cVar2 = hVar4.b;
                    int i27 = b;
                    int i28 = i27 & 89;
                    int i29 = -(-((i27 ^ 89) | i28));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    a = i30 % 128;
                    if (i30 % 2 != 0) {
                        boolean zEquals2 = cVar.equals(cVar2);
                        int i31 = 10 / 0;
                        if (zEquals2) {
                            eVar = this.c.T;
                            hVar = tVar.c;
                            int i32 = a;
                            int i33 = i32 & 45;
                            int i34 = -(-(i32 | 45));
                            i = ((i33 | i34) << 1) - (i34 ^ i33);
                            b = i % 128;
                            if (i % 2 != 0) {
                                eVar.equals(hVar.T);
                                throw null;
                            }
                            if (eVar.equals(hVar.T)) {
                                rVar = this.c.V;
                                hVar2 = tVar.c;
                                int i35 = b;
                                i2 = ((i35 & 4) + (i35 | 4)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    zEquals = rVar.equals(hVar2.V);
                                    int i36 = 9 / 0;
                                    if (zEquals) {
                                        int i37 = b + 117;
                                        a = i37 % 128;
                                        int i38 = i37 % 2;
                                        jVar = this.c.U;
                                        jVar2 = tVar.c.U;
                                        int i39 = a;
                                        int i40 = i39 ^ 91;
                                        int i41 = (i39 & 91) << 1;
                                        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                                        b = i42 % 128;
                                        int i43 = i42 % 2;
                                        if (jVar.equals(jVar2)) {
                                            int i44 = b;
                                            int i45 = ((i44 ^ 12) + ((i44 & 12) << 1)) - 1;
                                            a = i45 % 128;
                                            int i46 = i45 % 2;
                                            int i47 = (i44 & (-62)) | ((~i44) & 61);
                                            int i48 = -(-((i44 & 61) << 1));
                                            i3 = (i47 & i48) + (i48 | i47);
                                            a = i3 % 128;
                                            if (i3 % 2 != 0) {
                                                int i49 = 2 / 3;
                                            }
                                            z = true;
                                        }
                                    }
                                } else if (!(!rVar.equals(hVar2.V))) {
                                    int i310 = b + 117;
                                    a = i310 % 128;
                                    int i311 = i310 % 2;
                                    jVar = this.c.U;
                                    jVar2 = tVar.c.U;
                                    int i312 = a;
                                    int i410 = i312 ^ 91;
                                    int i411 = (i312 & 91) << 1;
                                    int i412 = ((i410 | i411) << 1) - (i411 ^ i410);
                                    b = i412 % 128;
                                    int i413 = i412 % 2;
                                    if (jVar.equals(jVar2)) {
                                        int i414 = b;
                                        int i415 = ((i414 ^ 12) + ((i414 & 12) << 1)) - 1;
                                        a = i415 % 128;
                                        int i416 = i415 % 2;
                                        int i417 = (i414 & (-62)) | ((~i414) & 61);
                                        int i418 = -(-((i414 & 61) << 1));
                                        i3 = (i417 & i418) + (i418 | i417);
                                        a = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            int i419 = 2 / 3;
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    } else if (cVar.equals(cVar2)) {
                        eVar = this.c.T;
                        hVar = tVar.c;
                        int i313 = a;
                        int i314 = i313 & 45;
                        int i315 = -(-(i313 | 45));
                        i = ((i314 | i315) << 1) - (i315 ^ i314);
                        b = i % 128;
                        if (i % 2 != 0) {
                            eVar.equals(hVar.T);
                            throw null;
                        }
                        if (eVar.equals(hVar.T)) {
                            rVar = this.c.V;
                            hVar2 = tVar.c;
                            int i316 = b;
                            i2 = ((i316 & 4) + (i316 | 4)) - 1;
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                zEquals = rVar.equals(hVar2.V);
                                int i317 = 9 / 0;
                                if (zEquals) {
                                    int i318 = b + 117;
                                    a = i318 % 128;
                                    int i319 = i318 % 2;
                                    jVar = this.c.U;
                                    jVar2 = tVar.c.U;
                                    int i3110 = a;
                                    int i4110 = i3110 ^ 91;
                                    int i4111 = (i3110 & 91) << 1;
                                    int i4112 = ((i4110 | i4111) << 1) - (i4111 ^ i4110);
                                    b = i4112 % 128;
                                    int i4113 = i4112 % 2;
                                    if (jVar.equals(jVar2)) {
                                        int i4114 = b;
                                        int i4115 = ((i4114 ^ 12) + ((i4114 & 12) << 1)) - 1;
                                        a = i4115 % 128;
                                        int i4116 = i4115 % 2;
                                        int i4117 = (i4114 & (-62)) | ((~i4114) & 61);
                                        int i4118 = -(-((i4114 & 61) << 1));
                                        i3 = (i4117 & i4118) + (i4118 | i4117);
                                        a = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            int i4119 = 2 / 3;
                                        }
                                        z = true;
                                    }
                                }
                            } else if (!(!rVar.equals(hVar2.V))) {
                                int i3111 = b + 117;
                                a = i3111 % 128;
                                int i3112 = i3111 % 2;
                                jVar = this.c.U;
                                jVar2 = tVar.c.U;
                                int i3113 = a;
                                int i41110 = i3113 ^ 91;
                                int i41111 = (i3113 & 91) << 1;
                                int i41112 = ((i41110 | i41111) << 1) - (i41111 ^ i41110);
                                b = i41112 % 128;
                                int i41113 = i41112 % 2;
                                if (jVar.equals(jVar2)) {
                                    int i41114 = b;
                                    int i41115 = ((i41114 ^ 12) + ((i41114 & 12) << 1)) - 1;
                                    a = i41115 % 128;
                                    int i41116 = i41115 % 2;
                                    int i41117 = (i41114 & (-62)) | ((~i41114) & 61);
                                    int i41118 = -(-((i41114 & 61) << 1));
                                    i3 = (i41117 & i41118) + (i41118 | i41117);
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        int i41119 = 2 / 3;
                                    }
                                    z = true;
                                }
                            }
                        }
                    }
                    int i50 = (-2) - ((a + 64) ^ (-1));
                    b = i50 % 128;
                    int i110 = i50 % 2;
                } else {
                    int i51 = (-2) - ((a + 64) ^ (-1));
                    b = i51 % 128;
                    int i111 = i51 % 2;
                }
            } else {
                int i52 = (-2) - ((a + 64) ^ (-1));
                b = i52 % 128;
                int i112 = i52 % 2;
            }
        }
        int i53 = b;
        int i54 = ((i53 ^ 32) + ((i53 & 32) << 1)) - 1;
        a = i54 % 128;
        if (i54 % 2 == 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }
}
