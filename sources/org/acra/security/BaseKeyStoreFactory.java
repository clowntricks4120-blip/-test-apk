package org.acra.security;

import android.content.Context;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.df.h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyStoreFactory implements h {
    public final String a;

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.CERTIFICATE.ordinal()] = 1;
            iArr[Type.KEYSTORE.ordinal()] = 2;
            a = iArr;
        }
    }

    public enum Type {
        CERTIFICATE,
        KEYSTORE
    }

    public BaseKeyStoreFactory(String str) {
        this.a = str;
    }

    public abstract InputStream b(Context context);

    public final String c() {
        String defaultType = KeyStore.getDefaultType();
        r.m(defaultType, "getDefaultType()");
        return defaultType;
    }

    @Override // ivas.gov.bisp.enumeration.df.h
    public KeyStore create(Context context) {
        KeyStore keyStore;
        InputStream inputStreamB = b(context);
        if (inputStreamB == null) {
            return null;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamB);
        try {
            try {
                try {
                    keyStore = KeyStore.getInstance(c());
                    int i = OooO00o.a[Type.CERTIFICATE.ordinal()];
                    if (i == 1) {
                        Certificate certificateGenerateCertificate = CertificateFactory.getInstance(this.a).generateCertificate(bufferedInputStream);
                        keyStore.load(null, null);
                        keyStore.setCertificateEntry("ca", certificateGenerateCertificate);
                    } else if (i == 2) {
                        keyStore.load(bufferedInputStream, null);
                    }
                } catch (NoSuchAlgorithmException e) {
                    j jVar = P.c;
                    j jVar2 = P.c;
                    ((i) jVar).w("OooOOO", "Could not load keystore", e);
                    keyStore = null;
                } catch (CertificateException e2) {
                    j jVar3 = P.c;
                    j jVar4 = P.c;
                    ((i) jVar3).w("OooOOO", "Could not load certificate", e2);
                    keyStore = null;
                }
            } catch (IOException e3) {
                j jVar5 = P.c;
                j jVar6 = P.c;
                ((i) jVar5).w("OooOOO", "Could not load keystore", e3);
                keyStore = null;
            } catch (KeyStoreException e4) {
                j jVar7 = P.c;
                j jVar8 = P.c;
                ((i) jVar7).w("OooOOO", "Could not load keystore", e4);
                keyStore = null;
            }
            ivas.gov.bisp.enumeration.p100w.r.k(bufferedInputStream, null);
            return keyStore;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ivas.gov.bisp.enumeration.p100w.r.k(bufferedInputStream, th);
                throw th2;
            }
        }
    }
}
