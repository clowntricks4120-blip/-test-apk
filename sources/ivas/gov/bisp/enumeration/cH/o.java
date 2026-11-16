package ivas.gov.bisp.enumeration.cH;

import ivas.gov.bisp.enumeration.cF.c;
import ivas.gov.bisp.enumeration.cI.D;
import ivas.gov.bisp.enumeration.cI.al;
import ivas.gov.bisp.enumeration.cL.j;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes.dex */
public class o extends KeyFactorySpi implements c {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;

    public /* synthetic */ o(int i) {
        this.c = i;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = -(-((i2 ^ 45) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = this.c;
        if (i7 == 0) {
            int i8 = (((i6 ^ 77) | (i6 & 77)) << 1) - ((i6 & (-78)) | ((~i6) & 77));
            a = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        if (i7 == 1) {
            if (!(key instanceof al)) {
                int i10 = i6 & 113;
                int i11 = i10 + ((i6 ^ 113) | i10);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    boolean z = key instanceof D;
                    obj.hashCode();
                    throw null;
                }
                if (!(key instanceof D)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
            }
            int i12 = a;
            int i13 = ((i12 & 55) - (~(i12 | 55))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return key;
            }
            throw null;
        }
        if (i7 == 2) {
            if (!(key instanceof j)) {
                int i14 = ((i2 & 118) + (i2 | 118)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                if (!(key instanceof ivas.gov.bisp.enumeration.cL.c)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
            }
            int i16 = i2 + 27;
            b = i16 % 128;
            int i17 = i16 % 2;
            return key;
        }
        int i18 = i6 + 115;
        int i19 = i18 % 128;
        a = i19;
        int i20 = i18 % 2;
        int i21 = ((i19 ^ 95) | (i19 & 95)) << 1;
        int i22 = -((i19 & (-96)) | ((~i19) & 95));
        int i23 = (i21 & i22) + (i21 | i22);
        b = i23 % 128;
        int i24 = i23 % 2;
        if (!(key instanceof ivas.gov.bisp.enumeration.cM.j)) {
            int i25 = (i19 & 49) + (i19 | 49);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                boolean z2 = key instanceof ivas.gov.bisp.enumeration.cM.c;
                obj.hashCode();
                throw null;
            }
            if (!(key instanceof ivas.gov.bisp.enumeration.cM.c)) {
                throw new InvalidKeyException("unsupported key type");
            }
        }
        int i26 = b;
        int i27 = (((i26 ^ 19) | (i26 & 19)) << 1) - (((~i26) & 19) | (i26 & (-20)));
        a = i27 % 128;
        int i28 = i27 % 2;
        return key;
    }

    public PublicKey d(ivas.gov.bisp.enumeration.p069co.c cVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 81) + (i2 | 81);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.c;
        if (i6 == 1) {
            D d = new D(cVar);
            int i7 = a;
            int i8 = i7 & 19;
            int i9 = (i7 | 19) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i6 == 2) {
            ivas.gov.bisp.enumeration.cL.c cVar2 = new ivas.gov.bisp.enumeration.cL.c(cVar);
            int i12 = b + 81;
            a = i12 % 128;
            int i13 = i12 % 2;
            return cVar2;
        }
        int i14 = ((i4 ^ 48) + ((i4 & 48) << 1)) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 5 % 2;
        }
        ivas.gov.bisp.enumeration.cM.c cVar3 = new ivas.gov.bisp.enumeration.cM.c(cVar);
        int i16 = a;
        int i17 = (i16 & 111) + (i16 | 111);
        b = i17 % 128;
        int i18 = i17 % 2;
        return cVar3;
    }

    public PrivateKey c(ivas.gov.bisp.enumeration.p067cm.c cVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = this.c;
        if (i8 == 1) {
            al alVar = new al(cVar);
            int i9 = a;
            int i10 = i9 & 17;
            int i11 = (i9 | 17) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            return alVar;
        }
        if (i8 == 2) {
            j jVar = new j(cVar);
            int i15 = b;
            int i16 = i15 & 65;
            int i17 = (i15 ^ 65) | i16;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            return jVar;
        }
        int i20 = (i6 & (-92)) | ((~i6) & 91);
        int i21 = (i6 & 91) << 1;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        ivas.gov.bisp.enumeration.cM.j jVar2 = new ivas.gov.bisp.enumeration.cM.j(cVar);
        int i24 = b;
        int i25 = i24 & 65;
        int i26 = i25 + ((i24 ^ 65) | i25);
        a = i26 % 128;
        int i27 = i26 % 2;
        return jVar2;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x02ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x02cb  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(r13) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(r13) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        r13 = new java.security.spec.X509EncodedKeySpec(r12.getEncoded());
        r12 = ivas.gov.bisp.enumeration.cH.o.b;
        r1 = r12 & 1;
        r12 = (r12 ^ 1) | r1;
        r2 = ((r1 | r12) << 1) - (r12 ^ r1);
        ivas.gov.bisp.enumeration.cH.o.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        if ((r2 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r13) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r13) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016d, code lost:
    
        r13 = new java.security.spec.PKCS8EncodedKeySpec(r12.getEncoded());
        r12 = ivas.gov.bisp.enumeration.cH.o.b;
        r1 = (r12 & (-120)) | ((~r12) & 119);
        r12 = (r12 & 119) << 1;
        r2 = (r1 & r12) + (r12 | r1);
        ivas.gov.bisp.enumeration.cH.o.a = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key r12, java.lang.Class r13) throws java.security.spec.InvalidKeySpecException {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cH.o.engineGetKeySpec(java.security.Key, java.lang.Class):java.security.spec.KeySpec");
    }

    /* JADX WARN: Code duplicated, block: B:87:0x023f A[Catch: IOException -> 0x02ce, PHI: r15
  0x023f: PHI (r15v14 ivas.gov.bisp.enumeration.ci.i) = (r15v13 ivas.gov.bisp.enumeration.ci.i), (r15v36 ivas.gov.bisp.enumeration.ci.i) binds: [B:86:0x023d, B:81:0x0232] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {IOException -> 0x02ce, blocks: (B:70:0x0202, B:73:0x0211, B:78:0x0228, B:80:0x0230, B:90:0x0258, B:95:0x027f, B:87:0x023f, B:85:0x0237, B:98:0x02be, B:99:0x02c5, B:100:0x02c6, B:101:0x02c8, B:102:0x02cb), top: B:122:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0256 A[DONT_INVERT, PHI: r15
  0x0256: PHI (r15v25 ivas.gov.bisp.enumeration.ci.i) = (r15v13 ivas.gov.bisp.enumeration.ci.i), (r15v36 ivas.gov.bisp.enumeration.ci.i) binds: [B:86:0x023d, B:81:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0258 A[Catch: IOException -> 0x02ce, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x02ce, blocks: (B:70:0x0202, B:73:0x0211, B:78:0x0228, B:80:0x0230, B:90:0x0258, B:95:0x027f, B:87:0x023f, B:85:0x0237, B:98:0x02be, B:99:0x02c5, B:100:0x02c6, B:101:0x02c8, B:102:0x02cb), top: B:122:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0270  */
    /* JADX WARN: Code duplicated, block: B:94:0x0273  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if ((r15 instanceof java.security.spec.PKCS8EncodedKeySpec) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if ((r15 instanceof java.security.spec.PKCS8EncodedKeySpec) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r1 = r1 + 95;
        ivas.gov.bisp.enumeration.cH.o.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p067cm.c.h(ivas.gov.bisp.enumeration.p063ci.O.c(((java.security.spec.PKCS8EncodedKeySpec) r15).getEncoded()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cH.o.b + 45;
        ivas.gov.bisp.enumeration.cH.o.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r15.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("unsupported key specification: ");
        r2 = ivas.gov.bisp.enumeration.cH.o.b + 109;
        ivas.gov.bisp.enumeration.cH.o.a = r2 % 128;
        r2 = r2 % 2;
        r1.append(r15.getClass());
        r1.append(".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r1.toString());
     */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec r15) throws java.security.spec.InvalidKeySpecException {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cH.o.engineGeneratePrivate(java.security.spec.KeySpec):java.security.PrivateKey");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x021f, code lost:
    
        if ((!r1.k(r2)) != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0221, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cH.o.a;
        r2 = r1 & 21;
        r1 = -(-((r1 ^ 21) | r2));
        r5 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.cH.o.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0234, code lost:
    
        r10 = r10.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0238, code lost:
    
        if (r10 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023a, code lost:
    
        r6 = new ivas.gov.bisp.enumeration.p076cv.i(ivas.gov.bisp.enumeration.p063ci.Q.o(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0243, code lost:
    
        r10 = ivas.gov.bisp.enumeration.cH.o.a;
        r1 = ((r10 | 83) << 1) - (r10 ^ 83);
        ivas.gov.bisp.enumeration.cH.o.b = r1 % 128;
        r1 = r1 % 2;
        r1 = ((r10 ^ 15) | (r10 & 15)) << 1;
        r10 = -(((~r10) & 15) | (r10 & (-16)));
        r2 = (r1 & r10) + (r10 | r1);
        ivas.gov.bisp.enumeration.cH.o.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0266, code lost:
    
        r10 = ivas.gov.bisp.enumeration.cH.o.b;
        r1 = (r10 ^ 49) + ((r10 & 49) << 1);
        ivas.gov.bisp.enumeration.cH.o.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if ((!(r10 instanceof java.security.spec.X509EncodedKeySpec)) != true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0273, code lost:
    
        if ((r1 % 2) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0275, code lost:
    
        r10 = 3 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0278, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.cH.u(new ivas.gov.bisp.enumeration.p080cz.r(r6.c, r6.d, r6.e, ivas.gov.bisp.enumeration.p100w.r.N(r6.f).c()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0292, code lost:
    
        r10 = (-2) - ((ivas.gov.bisp.enumeration.cH.o.a + 46) ^ (-1));
        ivas.gov.bisp.enumeration.cH.o.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a7, code lost:
    
        throw new java.security.spec.InvalidKeySpecException("Unable to recognise OID in McEliece private key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if ((!(r10 instanceof java.security.spec.X509EncodedKeySpec)) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r2 = ivas.gov.bisp.enumeration.cH.o.b;
        r3 = ((r2 & (-106)) | ((~r2) & 105)) + ((r2 & 105) << 1);
        ivas.gov.bisp.enumeration.cH.o.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if ((r3 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r1.append("unknown key specification: ");
        r1.append(r10);
        r10 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r1.append("unknown key specification: ");
        r1.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r1.append(".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p069co.c.h(((java.security.spec.X509EncodedKeySpec) r10).getEncoded());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cH.o.a;
        r2 = (r1 & (-92)) | ((~r1) & 91);
        r1 = -(-((r1 & 91) << 1));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.cH.o.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        r10 = d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cH.o.b + 121;
        ivas.gov.bisp.enumeration.cH.o.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0215, code lost:
    
        if (r1 != false) goto L104;
     */
    @Override // java.security.KeyFactorySpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec r10) throws java.security.spec.InvalidKeySpecException {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cH.o.engineGeneratePublic(java.security.spec.KeySpec):java.security.PublicKey");
    }
}
