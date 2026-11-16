package ivas.gov.bisp.enumeration.p074ct;

import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.cE.W;
import ivas.gov.bisp.enumeration.dg.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p073cs.h;
import ivas.gov.bisp.enumeration.p076cv.P;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Provider implements h {
    private static int a = 0;
    private static int b = 1;
    public static final String[] c;
    public static final Map d;
    public static final Class e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;

    public class bBE implements PrivilegedAction {
        private static int a = 1;
        private static int b;

        public bBE() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            String str;
            String str2;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 9) + (i2 | 9);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                c cVar = c.this;
                cVar.d("org.bouncycastle.jcajce.provider.digest.", c.c);
                cVar.d("org.bouncycastle.jcajce.provider.symmetric.", c.f);
                cVar.d("org.bouncycastle.jcajce.provider.symmetric.", c.h);
                cVar.d("org.bouncycastle.jcajce.provider.symmetric.", c.g);
                throw null;
            }
            c cVar2 = c.this;
            cVar2.d("org.bouncycastle.jcajce.provider.digest.", c.c);
            cVar2.d("org.bouncycastle.jcajce.provider.symmetric.", c.f);
            cVar2.d("org.bouncycastle.jcajce.provider.symmetric.", c.h);
            cVar2.d("org.bouncycastle.jcajce.provider.symmetric.", c.g);
            cVar2.d("org.bouncycastle.jcajce.provider.asymmetric.", c.i);
            cVar2.d("org.bouncycastle.jcajce.provider.asymmetric.", c.j);
            cVar2.d("org.bouncycastle.jcajce.provider.keystore.", c.k);
            cVar2.d("org.bouncycastle.jcajce.provider.drbg.", c.l);
            T.f(2, cVar2, P.e);
            int i4 = b;
            int i5 = ((i4 & 62) + (i4 | 62)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            T.e(2, cVar2, P.g);
            T.e(4, cVar2, P.f);
            T.e(4, cVar2, j.a);
            T.f(3, cVar2, P.h);
            T.f(3, cVar2, j.b);
            T.e(1, cVar2, P.c);
            T.f(0, cVar2, P.d);
            T.e(3, cVar2, P.b);
            T.f(1, cVar2, P.i);
            T.f(1, cVar2, P.a);
            C0278x c0278x = ivas.gov.bisp.enumeration.p067cm.j.a;
            W w = new W(0);
            int i7 = b;
            int i8 = ((i7 | 81) << 1) - (i7 ^ 81);
            a = i8 % 128;
            int i9 = i8 % 2;
            cVar2.c(c0278x, w);
            cVar2.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            cVar2.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            cVar2.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            cVar2.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            int i10 = a;
            int i11 = i10 & 121;
            int i12 = ((i10 ^ 121) | i11) << 1;
            int i13 = -((i10 | 121) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            cVar2.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            cVar2.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            cVar2.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            cVar2.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            cVar2.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            int i16 = a + 61;
            b = i16 % 128;
            int i17 = i16 % 2;
            cVar2.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            cVar2.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            cVar2.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            cVar2.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            cVar2.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            int i18 = b + 35;
            a = i18 % 128;
            int i19 = i18 % 2;
            cVar2.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            Class cls = c.e;
            cVar2.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            cVar2.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            if (cls != null) {
                int i20 = a;
                int i21 = (i20 & 57) + (i20 | 57);
                b = i21 % 128;
                str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
                if (i21 % 2 != 0) {
                    cVar2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    throw null;
                }
                cVar2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                int i22 = b + 87;
                a = i22 % 128;
                int i23 = i22 % 2;
                str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
            } else {
                str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
                cVar2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                int i24 = a + 29;
                b = i24 % 128;
                int i25 = i24 % 2;
                str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
            }
            cVar2.put("CertPathBuilder.RFC3280", str2);
            cVar2.put("CertPathValidator.PKIX", str);
            int i26 = a;
            int i27 = i26 & 1;
            int i28 = (i26 | 1) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 & i29) + (i28 | i29);
            b = i30 % 128;
            int i31 = i30 % 2;
            cVar2.put("CertPathBuilder.PKIX", str2);
            cVar2.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            int i32 = a;
            int i33 = ((i32 ^ 97) | (i32 & 97)) << 1;
            int i34 = -(((~i32) & 97) | (i32 & (-98)));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            b = i35 % 128;
            int i36 = i35 % 2;
            cVar2.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            cVar2.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            int i37 = b;
            int i38 = i37 & 115;
            int i39 = (((i37 | 115) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
            a = i39 % 128;
            int i40 = i39 % 2;
            cVar2.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            if (i40 == 0) {
                throw null;
            }
            int i41 = b + 77;
            a = i41 % 128;
            int i42 = i41 % 2;
            return null;
        }
    }

    static {
        new h();
        d = new HashMap();
        e = ivas.gov.bisp.enumeration.p075cu.P.b(c.class, "java.security.cert.PKIXRevocationChecker");
        f = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        int i2 = b;
        int i3 = (i2 ^ 41) + ((i2 & 41) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        h = new String[]{"SipHash", "SipHash128", "Poly1305"};
        int i6 = i4 ^ 75;
        int i7 = -(-((i4 & 75) << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i4 & 117;
        int i11 = (((i4 ^ 117) | i10) << 1) - ((i4 | 117) & (~i10));
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        int i14 = (((i12 ^ 79) | (i12 & 79)) << 1) - ((79 & (~i12)) | (i12 & (-80)));
        a = i14 % 128;
        int i15 = i14 % 2;
        g = new String[]{"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
        i = new String[]{"X509", "IES", "COMPOSITE"};
        int i16 = i12 | 43;
        int i17 = i16 << 1;
        int i18 = -(i16 & (~(i12 & 43)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        j = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
        int i21 = i12 & 77;
        int i22 = -(-((i12 ^ 77) | i21));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        int i26 = i24 + 109;
        int i27 = i26 % 128;
        b = i27;
        int i28 = i26 % 2;
        c = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
        k = new String[]{"BC", "BCFKS", "PKCS12"};
        l = new String[]{"DRBG"};
        int i29 = (-2) - (((i27 ^ 74) + ((i27 & 74) << 1)) ^ (-1));
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    public c() {
        super("BC", 1.68d, "BouncyCastle Security Provider v1.68");
        AccessController.doPrivileged(new bBE());
    }

    public final void c(C0278x c0278x, ivas.gov.bisp.enumeration.cF.c cVar) {
        Map map = d;
        synchronized (map) {
            ((HashMap) map).put(c0278x, cVar);
        }
    }

    public final void d(String str, String[] strArr) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 23) << 1) - (i3 ^ 23);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 & 33;
        int i7 = (i3 ^ 33) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 != strArr.length) {
            int i11 = a;
            int i12 = i11 | 89;
            int i13 = (i12 << 1) - ((~(i11 & 89)) & i12);
            b = i13 % 128;
            Object obj = null;
            if (i13 % 2 == 0) {
                ivas.gov.bisp.enumeration.p091n.j.w(str).append(strArr[i10]);
                obj.hashCode();
                throw null;
            }
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(str);
            sbW.append(strArr[i10]);
            sbW.append("$Mappings");
            int i14 = a;
            int i15 = i14 & 47;
            int i16 = i15 + ((i14 ^ 47) | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            Class clsB = ivas.gov.bisp.enumeration.p075cu.P.b(c.class, sbW.toString());
            if (clsB != null) {
                int i18 = b;
                int i19 = (i18 & (-106)) | ((~i18) & 105);
                int i20 = -(-((i18 & 105) << 1));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    ((ivas.gov.bisp.enumeration.cF.j) clsB.newInstance()).c(this);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    ((ivas.gov.bisp.enumeration.cF.j) clsB.newInstance()).c(this);
                    int i22 = b;
                    int i23 = (i22 ^ 95) + ((i22 & 95) << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                } catch (Exception e2) {
                    StringBuilder sbB = ivas.gov.bisp.enumeration.p003ac.P.b("cannot create instance of ", str);
                    sbB.append(strArr[i10]);
                    sbB.append("$Mappings : ");
                    sbB.append(e2);
                    throw new InternalError(sbB.toString());
                }
                StringBuilder sbB2 = ivas.gov.bisp.enumeration.p003ac.P.b("cannot create instance of ", str);
                sbB2.append(strArr[i10]);
                sbB2.append("$Mappings : ");
                sbB2.append(e2);
                throw new InternalError(sbB2.toString());
            }
            i10++;
            int i25 = a;
            int i26 = (i25 & 106) + (i25 | 106);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = b;
        int i30 = ((i29 | 77) << 1) - (i29 ^ 77);
        a = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 26 / 0;
        }
    }
}
