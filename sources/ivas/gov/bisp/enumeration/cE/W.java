package ivas.gov.bisp.enumeration.cE;

import ivas.gov.bisp.enumeration.cF.c;
import ivas.gov.bisp.enumeration.cG.A;
import ivas.gov.bisp.enumeration.cG.am;
import ivas.gov.bisp.enumeration.cH.a;
import ivas.gov.bisp.enumeration.cH.l;
import ivas.gov.bisp.enumeration.cM.h;
import ivas.gov.bisp.enumeration.p055ca.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p076cv.C0281p;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.t;
import ivas.gov.bisp.enumeration.p076cv.u;
import ivas.gov.bisp.enumeration.p076cv.z;
import ivas.gov.bisp.enumeration.p080cz.e;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class W extends KeyFactorySpi implements c {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;

    public /* synthetic */ W(int i) {
        this.c = i;
    }

    public PrivateKey c(ivas.gov.bisp.enumeration.p067cm.c cVar) {
        t tVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.c;
        int i7 = 0;
        if (i6 == 0) {
            s sVar = new s(cVar);
            int i8 = a + 49;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 66 / 0;
            }
            return sVar;
        }
        Object obj = null;
        if (i6 == 2) {
            A a2 = new A(cVar);
            int i10 = a;
            int i11 = i10 & 7;
            int i12 = (((i10 | 7) & (~i11)) - (~(i11 << 1))) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                return a2;
            }
            throw null;
        }
        if (i6 != 3) {
            int i13 = ((i4 & (-22)) | ((~i4) & 21)) + ((i4 & 21) << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 5;
            }
            h hVar = new h(cVar);
            int i15 = b;
            int i16 = (i15 ^ 51) + ((i15 & 51) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return hVar;
            }
            throw null;
        }
        i iVarJ = cVar.j();
        if (!(!(iVarJ instanceof t))) {
            int i17 = a;
            int i18 = ((i17 | 105) << 1) - (i17 ^ 105);
            int i19 = i18 % 128;
            b = i19;
            int i20 = i18 % 2;
            tVar = (t) iVarJ;
            int i21 = i19 + 21;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 2 / 3;
            }
        } else if (iVarJ != null) {
            t tVar2 = new t(Q.o(iVarJ));
            int i23 = b;
            int i24 = (i23 ^ 57) + ((i23 & 57) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            tVar = tVar2;
        } else {
            int i26 = b;
            int i27 = (((i26 ^ 105) | (i26 & 105)) << 1) - (((~i26) & 105) | (i26 & (-106)));
            a = i27 % 128;
            int i28 = i27 % 2;
            tVar = null;
        }
        short[][] sArrQ = r.q(tVar.f);
        short[] sArrP = r.p(tVar.h);
        int i29 = a + 109;
        b = i29 % 128;
        int i30 = i29 % 2;
        short[][] sArrQ2 = r.q(tVar.g);
        byte[] bArr = tVar.i;
        int i31 = a;
        int i32 = (((i31 ^ 11) | (i31 & 11)) << 1) - (((~i31) & 11) | (i31 & (-12)));
        b = i32 % 128;
        if (i32 % 2 != 0) {
            r.p(bArr);
            int[] iArr = new int[tVar.j.length];
            obj.hashCode();
            throw null;
        }
        short[] sArrP2 = r.p(bArr);
        byte[] bArr2 = tVar.j;
        int[] iArr2 = new int[bArr2.length];
        int i33 = b;
        int i34 = ((i33 & 3) - (~(i33 | 3))) - 1;
        a = i34 % 128;
        int i35 = i34 % 2;
        int i36 = (i33 ^ 49) + ((i33 & 49) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        while (i7 < bArr2.length) {
            int i38 = a;
            int i39 = i38 ^ 71;
            int i40 = (i38 & 71) << 1;
            int i41 = (i39 & i40) + (i39 | i40);
            b = i41 % 128;
            int i42 = i41 % 2;
            iArr2[i7] = bArr2[i7] & 255;
            int i43 = i7 & 1;
            i7 = (((i7 | 1) & (~i43)) - (~(-(-(i43 << 1))))) - 1;
            int i44 = i38 & 121;
            int i45 = -(-((i38 ^ 121) | i44));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
        }
        j jVar = new j(sArrQ, sArrP, sArrQ2, sArrP2, iArr2, tVar.c);
        int i48 = b;
        int i49 = i48 & 99;
        int i50 = ((i48 ^ 99) | i49) << 1;
        int i51 = -((i48 | 99) & (~i49));
        int i52 = (i50 & i51) + (i51 | i50);
        a = i52 % 128;
        if (i52 % 2 != 0) {
            return jVar;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cE.y) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cE.y) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        throw new java.security.InvalidKeyException("unsupported key type");
     */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.Key engineTranslateKey(java.security.Key r10) throws java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cE.W.engineTranslateKey(java.security.Key):java.security.Key");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243 A[Catch: IOException -> 0x02b8, PHI: r11
  0x0243: PHI (r11v27 ivas.gov.bisp.enumeration.ci.O) = (r11v26 ivas.gov.bisp.enumeration.ci.O), (r11v47 ivas.gov.bisp.enumeration.ci.O) binds: [B:98:0x0241, B:95:0x023a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {IOException -> 0x02b8, blocks: (B:85:0x01fe, B:87:0x0210, B:89:0x021f, B:93:0x0234, B:105:0x0277, B:99:0x0243, B:97:0x023d, B:110:0x029d, B:112:0x02b7), top: B:146:0x01fe }] */
    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws Exception {
        O oC;
        O oJ;
        z zVar;
        int i;
        PublicKey publicKeyD;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-100)) | ((~i3) & 99);
        int i5 = (i3 & 99) << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        a = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i8 = this.c;
        if (i8 == 0) {
            if (!(keySpec instanceof X509EncodedKeySpec)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown key specification: ");
                int i9 = a;
                int i10 = i9 & 89;
                int i11 = -(-((i9 ^ 89) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                sb.append(keySpec);
                sb.append(".");
                if (i13 != 0) {
                    int i14 = 51 / 0;
                }
                throw new InvalidKeySpecException(sb.toString());
            }
            int i15 = i3 & 71;
            int i16 = (((i3 | 71) & (~i15)) - (~(i15 << 1))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            try {
                ivas.gov.bisp.enumeration.p069co.c cVarH = ivas.gov.bisp.enumeration.p069co.c.h(((X509EncodedKeySpec) keySpec).getEncoded());
                int i18 = b;
                int i19 = (i18 ^ 93) + ((i18 & 93) << 1);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    return d(cVarH);
                }
                d(cVarH);
                obj.hashCode();
                throw null;
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString(), e);
            }
        }
        if (i8 == 1) {
            if (!(keySpec instanceof X509EncodedKeySpec)) {
                StringBuilder sb2 = new StringBuilder();
                int i20 = b;
                int i21 = i20 & 105;
                int i22 = i21 + ((i20 ^ 105) | i21);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    sb2.append("Unsupported key specification: ");
                    sb2.append(keySpec.getClass());
                    int i23 = 61 / 0;
                } else {
                    sb2.append("Unsupported key specification: ");
                    sb2.append(keySpec.getClass());
                }
                sb2.append(".");
                throw new InvalidKeySpecException(sb2.toString());
            }
            int i24 = (i3 & 47) + (i3 | 47);
            a = i24 % 128;
            try {
                if (i24 % 2 == 0) {
                    oC = O.c(((X509EncodedKeySpec) keySpec).getEncoded());
                    int i25 = 71 / 0;
                } else {
                    try {
                        oC = O.c(((X509EncodedKeySpec) keySpec).getEncoded());
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                ivas.gov.bisp.enumeration.p069co.c cVarH2 = ivas.gov.bisp.enumeration.p069co.c.h(oC);
                try {
                    C0278x c0278x = P.c;
                    ivas.gov.bisp.enumeration.p069co.j jVar = cVarH2.c;
                    int i26 = a;
                    int i27 = i26 ^ 81;
                    int i28 = (((i26 & 81) | i27) << 1) - i27;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    C0278x c0278x2 = jVar.c;
                    int i30 = b;
                    int i31 = i30 & 89;
                    int i32 = i31 + ((i30 ^ 89) | i31);
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    if (!c0278x.k(c0278x2)) {
                        InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                        int i34 = b;
                        int i35 = i34 ^ 63;
                        int i36 = ((i34 & 63) | i35) << 1;
                        int i37 = -i35;
                        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        throw invalidKeySpecException;
                    }
                    int i40 = b;
                    int i41 = i40 & 11;
                    int i42 = i41 + ((i40 ^ 11) | i41);
                    a = i42 % 128;
                    if (i42 % 2 == 0) {
                        oJ = cVarH2.j();
                        int i43 = 29 / 0;
                        if (oJ != null) {
                            zVar = new z(Q.o(oJ));
                            int i44 = a;
                            int i45 = (i44 & 114) + (i44 | 114);
                            int i46 = (i45 ^ (-1)) + (i45 << 1);
                            b = i46 % 128;
                            int i47 = i46 % 2;
                        } else {
                            int i48 = b;
                            int i49 = (i48 & (-92)) | ((~i48) & 91);
                            int i50 = (i48 & 91) << 1;
                            i = ((i49 | i50) << 1) - (i50 ^ i49);
                            a = i % 128;
                            if (i % 2 == 0) {
                                int i51 = 4 / 3;
                            }
                            zVar = null;
                        }
                    } else {
                        oJ = cVarH2.j();
                        if (oJ != null) {
                            zVar = new z(Q.o(oJ));
                            int i410 = a;
                            int i411 = (i410 & 114) + (i410 | 114);
                            int i412 = (i411 ^ (-1)) + (i411 << 1);
                            b = i412 % 128;
                            int i413 = i412 % 2;
                        } else {
                            int i414 = b;
                            int i415 = (i414 & (-92)) | ((~i414) & 91);
                            int i52 = (i414 & 91) << 1;
                            i = ((i415 | i52) << 1) - (i52 ^ i415);
                            a = i % 128;
                            if (i % 2 == 0) {
                                int i53 = 4 / 3;
                            }
                            zVar = null;
                        }
                    }
                    a aVar = new a(new ivas.gov.bisp.enumeration.p080cz.i(zVar.c, zVar.d, new ivas.gov.bisp.enumeration.cK.j(zVar.e)));
                    int i54 = (-2) - ((b + 54) ^ (-1));
                    a = i54 % 128;
                    if (i54 % 2 != 0) {
                        return aVar;
                    }
                    throw null;
                } catch (IOException e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unable to decode X509EncodedKeySpec: ");
                    sb3.append(e3.getMessage());
                    throw new InvalidKeySpecException(sb3.toString());
                }
            } catch (IOException e4) {
                throw new InvalidKeySpecException(e4.toString());
            }
        }
        if (i8 == 2) {
            if (!(keySpec instanceof X509EncodedKeySpec)) {
                StringBuilder sb4 = new StringBuilder();
                int i55 = a + 65;
                b = i55 % 128;
                if (i55 % 2 != 0) {
                    sb4.append("Unknown key specification: ");
                    sb4.append(keySpec);
                    throw null;
                }
                sb4.append("Unknown key specification: ");
                sb4.append(keySpec);
                sb4.append(".");
                throw new InvalidKeySpecException(sb4.toString());
            }
            int i56 = (i7 ^ 107) + ((i7 & 107) << 1);
            b = i56 % 128;
            int i57 = i56 % 2;
            try {
                PublicKey publicKeyD2 = d(ivas.gov.bisp.enumeration.p069co.c.h(((X509EncodedKeySpec) keySpec).getEncoded()));
                int i58 = b;
                int i59 = (i58 & (-98)) | ((~i58) & 97);
                int i60 = (i58 & 97) << 1;
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                a = i61 % 128;
                int i62 = i61 % 2;
                int i63 = i58 & 73;
                int i64 = ((i58 ^ 73) | i63) << 1;
                int i65 = -((i58 | 73) & (~i63));
                int i66 = (i64 & i65) + (i65 | i64);
                a = i66 % 128;
                if (i66 % 2 != 0) {
                    return publicKeyD2;
                }
                throw null;
            } catch (Exception e5) {
                throw new InvalidKeySpecException(e5.toString());
            }
        }
        if (i8 != 3) {
            int i67 = ((i7 ^ 62) + ((i7 & 62) << 1)) - 1;
            b = i67 % 128;
            int i68 = i67 % 2;
            int i69 = i7 + 13;
            b = i69 % 128;
            if (i69 % 2 != 0) {
                boolean z = keySpec instanceof X509EncodedKeySpec;
                obj.hashCode();
                throw null;
            }
            if (!(keySpec instanceof X509EncodedKeySpec)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("unknown key specification: ");
                int i70 = b;
                int i71 = (i70 & 83) + (i70 | 83);
                a = i71 % 128;
                int i72 = i71 % 2;
                sb5.append(keySpec);
                sb5.append(".");
                throw new InvalidKeySpecException(sb5.toString());
            }
            try {
                ivas.gov.bisp.enumeration.p069co.c cVarH3 = ivas.gov.bisp.enumeration.p069co.c.h(((X509EncodedKeySpec) keySpec).getEncoded());
                int i73 = a + 5;
                b = i73 % 128;
                int i74 = i73 % 2;
                PublicKey publicKeyD3 = d(cVarH3);
                int i75 = a;
                int i76 = (i75 ^ 53) + ((i75 & 53) << 1);
                b = i76 % 128;
                if (i76 % 2 != 0) {
                    int i77 = 44 / 0;
                }
                return publicKeyD3;
            } catch (Exception e6) {
                throw new InvalidKeySpecException(e6.toString());
            }
        }
        if (keySpec instanceof ivas.gov.bisp.enumeration.cN.i) {
            publicKeyD = new ivas.gov.bisp.enumeration.p055ca.c((ivas.gov.bisp.enumeration.cN.i) keySpec);
            int i78 = a;
            int i79 = ((i78 & 10) + (i78 | 10)) - 1;
            b = i79 % 128;
            int i80 = i79 % 2;
        } else {
            if (!(keySpec instanceof X509EncodedKeySpec)) {
                StringBuilder sb6 = new StringBuilder();
                int i81 = a;
                int i82 = i81 & 41;
                int i83 = -(-((i81 ^ 41) | i82));
                int i84 = (i82 & i83) + (i83 | i82);
                b = i84 % 128;
                if (i84 % 2 != 0) {
                    sb6.append("Unknown key specification: ");
                    sb6.append(keySpec);
                    int i85 = 80 / 0;
                } else {
                    sb6.append("Unknown key specification: ");
                    sb6.append(keySpec);
                }
                sb6.append(".");
                throw new InvalidKeySpecException(sb6.toString());
            }
            int i86 = i7 + 95;
            b = i86 % 128;
            int i87 = i86 % 2;
            try {
                publicKeyD = d(ivas.gov.bisp.enumeration.p069co.c.h(((X509EncodedKeySpec) keySpec).getEncoded()));
                int i88 = a;
                int i89 = i88 & 25;
                int i90 = i89 + ((i88 ^ 25) | i89);
                b = i90 % 128;
                int i91 = i90 % 2;
                int i92 = i88 & 29;
                int i93 = (i88 ^ 29) | i92;
                int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                b = i94 % 128;
                int i95 = i94 % 2;
            } catch (Exception e7) {
                throw new InvalidKeySpecException(e7.toString());
            }
        }
        int i96 = b;
        int i97 = (i96 & 89) + (i96 | 89);
        a = i97 % 128;
        if (i97 % 2 != 0) {
            return publicKeyD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        PrivateKey privateKeyC;
        PrivateKey jVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 29) + (i2 | 29);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.c;
        C0281p c0281p = null;
        if (i6 == 0) {
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unsupported key specification: ");
                int i7 = b;
                int i8 = (i7 & 79) + (i7 | 79);
                a = i8 % 128;
                int i9 = i8 % 2;
                sb.append(keySpec.getClass());
                sb.append(".");
                throw new InvalidKeySpecException(sb.toString());
            }
            int i10 = ((i4 ^ 21) | (i4 & 21)) << 1;
            int i11 = -((i4 & (-22)) | ((~i4) & 21));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            try {
                if (i12 % 2 == 0) {
                    O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                    c0281p.hashCode();
                    throw null;
                }
                O oC = O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                int i13 = b;
                int i14 = i13 & 27;
                int i15 = i14 + ((i13 ^ 27) | i14);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    return c(ivas.gov.bisp.enumeration.p067cm.c.h(oC));
                }
                c(ivas.gov.bisp.enumeration.p067cm.c.h(oC));
                throw null;
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString(), e);
            }
        }
        if (i6 == 1) {
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb2 = new StringBuilder();
                int i16 = b;
                int i17 = i16 & 15;
                int i18 = ((i16 | 15) & (~i17)) + (i17 << 1);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    sb2.append("Unsupported key specification: ");
                    sb2.append(keySpec.getClass());
                    int i19 = 44 / 0;
                } else {
                    sb2.append("Unsupported key specification: ");
                    sb2.append(keySpec.getClass());
                }
                sb2.append(".");
                throw new InvalidKeySpecException(sb2.toString());
            }
            int i20 = ((i4 | 101) << 1) - (i4 ^ 101);
            a = i20 % 128;
            int i21 = i20 % 2;
            try {
                ivas.gov.bisp.enumeration.p067cm.c cVarH = ivas.gov.bisp.enumeration.p067cm.c.h(O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                int i22 = a;
                int i23 = i22 & 79;
                int i24 = ((i22 ^ 79) | i23) << 1;
                int i25 = -((i22 | 79) & (~i23));
                int i26 = (i24 & i25) + (i25 | i24);
                b = i26 % 128;
                int i27 = i26 % 2;
                try {
                    C0278x c0278x = P.c;
                    C0278x c0278x2 = cVarH.d.c;
                    int i28 = b;
                    int i29 = (i28 ^ 123) + ((i28 & 123) << 1);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    if (!c0278x.k(c0278x2)) {
                        throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                    }
                    int i31 = b + 77;
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    i iVarJ = cVarH.j();
                    if (iVarJ instanceof C0281p) {
                        int i33 = b;
                        int i34 = i33 & 17;
                        int i35 = (((~i34) & (i33 | 17)) - (~(i34 << 1))) - 1;
                        a = i35 % 128;
                        if (i35 % 2 == 0) {
                            throw null;
                        }
                        c0281p = (C0281p) iVarJ;
                        int i36 = i33 ^ 125;
                        int i37 = ((i33 & 125) | i36) << 1;
                        int i38 = -i36;
                        int i39 = (i37 & i38) + (i38 | i37);
                        a = i39 % 128;
                        int i40 = i39 % 2;
                    } else if (iVarJ != null) {
                        c0281p = new C0281p(Q.o(iVarJ));
                        int i41 = b;
                        int i42 = (-2) - (((i41 & 16) + (i41 | 16)) ^ (-1));
                        a = i42 % 128;
                        int i43 = i42 % 2;
                    } else {
                        int i44 = b;
                        int i45 = (-2) - ((((i44 | 14) << 1) - (i44 ^ 14)) ^ (-1));
                        a = i45 % 128;
                        int i46 = i45 % 2;
                    }
                    l lVar = new l(new e(c0281p.c, c0281p.d, new ivas.gov.bisp.enumeration.cK.c(c0281p.e), new ivas.gov.bisp.enumeration.cK.e(new ivas.gov.bisp.enumeration.cK.c(c0281p.e), c0281p.g), new ivas.gov.bisp.enumeration.cK.r(c0281p.h), new ivas.gov.bisp.enumeration.cK.r(c0281p.i), new ivas.gov.bisp.enumeration.cK.j(c0281p.f)));
                    int i47 = b;
                    int i48 = (i47 ^ 109) + ((i47 & 109) << 1);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    return lVar;
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to decode PKCS8EncodedKeySpec: ");
                sb3.append(e2);
                throw new InvalidKeySpecException(sb3.toString());
            }
        }
        if (i6 == 2) {
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb4 = new StringBuilder();
                int i50 = b;
                int i51 = (((i50 & (-22)) | ((~i50) & 21)) - (~((i50 & 21) << 1))) - 1;
                a = i51 % 128;
                int i52 = i51 % 2;
                sb4.append("Unsupported key specification: ");
                sb4.append(keySpec.getClass());
                sb4.append(".");
                throw new InvalidKeySpecException(sb4.toString());
            }
            int i53 = ((i4 | 58) << 1) - (i4 ^ 58);
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            a = i54 % 128;
            int i55 = i54 % 2;
            try {
                ivas.gov.bisp.enumeration.p067cm.c cVarH2 = ivas.gov.bisp.enumeration.p067cm.c.h(O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                int i56 = a;
                int i57 = (i56 & 57) + (i56 | 57);
                b = i57 % 128;
                int i58 = i57 % 2;
                PrivateKey privateKeyC2 = c(cVarH2);
                int i59 = a;
                int i60 = (i59 ^ 120) + ((i59 & 120) << 1);
                int i61 = (i60 ^ (-1)) + (i60 << 1);
                b = i61 % 128;
                int i62 = i61 % 2;
                return privateKeyC2;
            } catch (Exception e3) {
                throw new InvalidKeySpecException(e3.toString());
            }
        }
        if (i6 != 3) {
            int i63 = (i2 ^ 25) + ((i2 & 25) << 1);
            b = i63 % 128;
            int i64 = i63 % 2;
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("unsupported key specification: ");
                int i65 = a;
                int i66 = i65 & 11;
                int i67 = (((i65 | 11) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                b = i67 % 128;
                if (i67 % 2 == 0) {
                    sb5.append(keySpec.getClass());
                    sb5.append(".");
                    throw new InvalidKeySpecException(sb5.toString());
                }
                sb5.append(keySpec.getClass());
                sb5.append(".");
                c0281p.hashCode();
                throw null;
            }
            int i68 = i2 ^ 121;
            int i69 = ((((i2 & 121) | i68) << 1) - (~(-i68))) - 1;
            b = i69 % 128;
            int i70 = i69 % 2;
            try {
                O oC2 = O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                int i71 = b;
                int i72 = (((i71 | 30) << 1) - (i71 ^ 30)) - 1;
                a = i72 % 128;
                int i73 = i72 % 2;
                PrivateKey privateKeyC3 = c(ivas.gov.bisp.enumeration.p067cm.c.h(oC2));
                int i74 = b;
                int i75 = (i74 & 23) + (i74 | 23);
                a = i75 % 128;
                int i76 = i75 % 2;
                return privateKeyC3;
            } catch (Exception e4) {
                throw new InvalidKeySpecException(e4.toString());
            }
        }
        if (keySpec instanceof ivas.gov.bisp.enumeration.cN.e) {
            jVar = new j((ivas.gov.bisp.enumeration.cN.e) keySpec);
            int i77 = a;
            int i78 = i77 ^ 81;
            int i79 = (((i77 & 81) | i78) << 1) - i78;
            b = i79 % 128;
            if (i79 % 2 != 0) {
                int i80 = 4 % 3;
            }
        } else {
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb6 = new StringBuilder();
                int i81 = a;
                int i82 = (i81 & 65) + (i81 | 65);
                b = i82 % 128;
                if (i82 % 2 != 0) {
                    sb6.append("Unsupported key specification: ");
                    sb6.append(keySpec.getClass());
                    int i83 = 66 / 0;
                } else {
                    sb6.append("Unsupported key specification: ");
                    sb6.append(keySpec.getClass());
                }
                sb6.append(".");
                throw new InvalidKeySpecException(sb6.toString());
            }
            int i84 = (i4 & 3) + (i4 | 3);
            a = i84 % 128;
            int i85 = i84 % 2;
            try {
                O oC3 = O.c(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                int i86 = b;
                int i87 = ((i86 ^ 22) + ((i86 & 22) << 1)) - 1;
                a = i87 % 128;
                if (i87 % 2 == 0) {
                    privateKeyC = c(ivas.gov.bisp.enumeration.p067cm.c.h(oC3));
                    int i88 = 58 / 0;
                } else {
                    privateKeyC = c(ivas.gov.bisp.enumeration.p067cm.c.h(oC3));
                }
                jVar = privateKeyC;
            } catch (Exception e5) {
                throw new InvalidKeySpecException(e5.toString());
            }
        }
        int i89 = a;
        int i90 = i89 & 3;
        int i91 = ((i89 ^ 3) | i90) << 1;
        int i92 = -((i89 | 3) & (~i90));
        int i93 = (i91 & i92) + (i92 | i91);
        b = i93 % 128;
        int i94 = i93 % 2;
        return jVar;
    }

    public PublicKey d(ivas.gov.bisp.enumeration.p069co.c cVar) {
        u uVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 91) + (i2 | 91);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.c;
        if (i6 == 0) {
            y yVar = new y(cVar);
            int i7 = a;
            int i8 = i7 ^ 35;
            int i9 = (i7 & 35) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 53 / 0;
            }
            return yVar;
        }
        if (i6 == 2) {
            am amVar = new am(cVar);
            int i12 = a;
            int i13 = (i12 ^ 35) + ((i12 & 35) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 55 / 0;
            }
            return amVar;
        }
        if (i6 != 3) {
            int i15 = i4 & 19;
            int i16 = (((i4 ^ 19) | i15) << 1) - ((i4 | 19) & (~i15));
            b = i16 % 128;
            int i17 = i16 % 2;
            ivas.gov.bisp.enumeration.cM.r rVar = new ivas.gov.bisp.enumeration.cM.r(cVar);
            int i18 = a;
            int i19 = (i18 & 91) + (i18 | 91);
            b = i19 % 128;
            int i20 = i19 % 2;
            return rVar;
        }
        O oJ = cVar.j();
        Object obj = null;
        if (oJ != null) {
            uVar = new u(Q.o(oJ));
            int i21 = b;
            int i22 = ((i21 & 52) + (i21 | 52)) - 1;
            a = i22 % 128;
            int i23 = i22 % 2;
        } else {
            int i24 = b;
            int i25 = ((i24 | 19) << 1) - (((~i24) & 19) | (i24 & (-20)));
            a = i25 % 128;
            int i26 = i25 % 2;
            uVar = null;
        }
        int iY = uVar.e.y();
        byte[][] bArr = uVar.g;
        int i27 = b;
        int i28 = i27 & 121;
        int i29 = -(-((i27 ^ 121) | i28));
        int i30 = (i28 & i29) + (i29 | i28);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            r.q(bArr);
            r.q(uVar.f);
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p055ca.c cVar2 = new ivas.gov.bisp.enumeration.p055ca.c(iY, r.q(bArr), r.q(uVar.f), r.p(uVar.h));
        int i31 = a;
        int i32 = i31 & 49;
        int i33 = (i31 | 49) & (~i32);
        int i34 = -(-(i32 << 1));
        int i35 = (i33 & i34) + (i33 | i34);
        b = i35 % 128;
        if (i35 % 2 == 0) {
            return cVar2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x028d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0294  */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0493, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r14) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x049c, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r14) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x049e, code lost:
    
        r14 = new java.security.spec.PKCS8EncodedKeySpec(r13.getEncoded());
        r13 = ivas.gov.bisp.enumeration.cE.W.a + 65;
        ivas.gov.bisp.enumeration.cE.W.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04b0, code lost:
    
        if ((r13 % 2) == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04b2, code lost:
    
        r13 = 38 / 0;
     */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key r13, java.lang.Class r14) throws java.security.spec.InvalidKeySpecException {
        /*
            Method dump skipped, instruction units count: 1253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cE.W.engineGetKeySpec(java.security.Key, java.lang.Class):java.security.spec.KeySpec");
    }
}
