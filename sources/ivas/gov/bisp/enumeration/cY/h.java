package ivas.gov.bisp.enumeration.cY;

import android.content.Context;
import android.util.Base64;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bV.U;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.df.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<T> {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.aB.i c;
    public final ivas.gov.bisp.enumeration.aB.r d;
    public final Context e;
    public final HttpSender.Method f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;
    public final Map<String, String> k;

    public h(ivas.gov.bisp.enumeration.aB.r rVar, Context context, HttpSender.Method method, String str, String str2, int i, int i2, Map<String, String> map) {
        ivas.gov.bisp.enumeration.O.r.n(method, "method");
        this.d = rVar;
        this.e = context;
        this.f = method;
        this.g = str;
        this.i = str2;
        this.h = i;
        this.j = i2;
        this.k = map;
        this.c = (ivas.gov.bisp.enumeration.aB.i) ivas.gov.bisp.enumeration.p100w.r.F(rVar, ivas.gov.bisp.enumeration.aB.i.class);
    }

    public abstract String d(Context context, T t);

    public abstract void h(OutputStream outputStream, T t);

    public final void c(HttpsURLConnection httpsURLConnection) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        ivas.gov.bisp.enumeration.aB.r rVar;
        ivas.gov.bisp.enumeration.df.h rVar2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        Context context = this.e;
        int i5 = a + 104;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            rVar = this.d;
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
            int i7 = 14 / 0;
        } else {
            rVar = this.d;
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        }
        int i8 = a;
        int i9 = i8 & 45;
        int i10 = (i9 - (~(-(-((i8 ^ 45) | i9))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        ivas.gov.bisp.enumeration.aB.i iVar = (ivas.gov.bisp.enumeration.aB.i) ivas.gov.bisp.enumeration.p100w.r.F(rVar, ivas.gov.bisp.enumeration.aB.i.class);
        Class<? extends ivas.gov.bisp.enumeration.df.h> cls = iVar.k;
        int i12 = b;
        int i13 = i12 & 119;
        int i14 = i13 + ((i12 ^ 119) | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        ivas.gov.bisp.enumeration.O.r.n(cls, "clazz");
        Object obj = null;
        try {
            rVar2 = cls.newInstance();
            int i16 = b;
            int i17 = i16 & 11;
            int i18 = i17 + ((i16 ^ 11) | i17);
            a = i18 % 128;
            int i19 = i18 % 2;
        } catch (IllegalAccessException e) {
            j jVar = P.c;
            j jVar2 = P.c;
            String name = cls.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create instance of class ");
            sb.append(name);
            ((ivas.gov.bisp.enumeration.O.i) jVar).w("OooOOO", sb.toString(), e);
            int i20 = b;
            int i21 = (i20 & 101) + (i20 | 101);
            a = i21 % 128;
            int i22 = i21 % 2;
            rVar2 = null;
        } catch (InstantiationException e2) {
            j jVar3 = P.c;
            j jVar4 = P.c;
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create instance of class ");
            sb2.append(name2);
            ((ivas.gov.bisp.enumeration.O.i) jVar3).w("OooOOO", sb2.toString(), e2);
            int i23 = b;
            int i24 = (i23 & 101) + (i23 | 101);
            a = i24 % 128;
            int i25 = i24 % 2;
            rVar2 = null;
        }
        if (rVar2 == null) {
            rVar2 = new ivas.gov.bisp.enumeration.df.r();
            int i26 = b;
            int i27 = (((i26 | 72) << 1) - (i26 ^ 72)) - 1;
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        KeyStore keyStoreCreate = rVar2.create(context);
        int i29 = a;
        int i30 = (i29 ^ 103) + ((i29 & 103) << 1);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (keyStoreCreate == null) {
            int i31 = i29 ^ 67;
            int i32 = (((i29 & 67) | i31) << 1) - i31;
            b = i32 % 128;
            if (i32 % 2 == 0) {
                Integer num = iVar.m;
                String str = iVar.l;
                obj.hashCode();
                throw null;
            }
            Integer num2 = iVar.m;
            String str2 = iVar.l;
            String str3 = iVar.f53o;
            if (num2 != null) {
                ivas.gov.bisp.enumeration.df.i iVar2 = new ivas.gov.bisp.enumeration.df.i(str3, num2.intValue());
                int i33 = a;
                int i34 = i33 ^ 123;
                int i35 = -(-((i33 & 123) << 1));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    iVar2.create(context);
                    obj.hashCode();
                    throw null;
                }
                keyStoreCreate = iVar2.create(context);
                int i37 = a;
                int i38 = (i37 & 1) + (i37 | 1);
                b = i38 % 128;
                int i39 = i38 % 2;
            } else if (str2 != null) {
                int i40 = b;
                int i41 = (((i40 | 91) << 1) - (~(-(((~i40) & 91) | (i40 & (-92)))))) - 1;
                a = i41 % 128;
                int i42 = i41 % 2;
                if (ae.aq(str2, "asset://", false, 2)) {
                    int i43 = b;
                    int i44 = ((i43 & 97) - (~(i43 | 97))) - 1;
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    String strSubstring = str2.substring(8);
                    ivas.gov.bisp.enumeration.O.r.m(strSubstring, "this as java.lang.String).substring(startIndex)");
                    ivas.gov.bisp.enumeration.df.j jVar5 = new ivas.gov.bisp.enumeration.df.j(str3, strSubstring);
                    int i46 = b;
                    int i47 = i46 ^ 5;
                    int i48 = ((((i46 & 5) | i47) << 1) - (~(-i47))) - 1;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    keyStoreCreate = jVar5.create(context);
                    int i50 = a;
                    int i51 = i50 & 61;
                    int i52 = (i50 ^ 61) | i51;
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    b = i53 % 128;
                    int i54 = i53 % 2;
                } else {
                    keyStoreCreate = new c(str3, str2).create(context);
                    int i55 = b;
                    int i56 = ((i55 ^ 44) + ((i55 & 44) << 1)) - 1;
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    int i58 = i55 + 53;
                    a = i58 % 128;
                    int i59 = i58 % 2;
                }
            }
        }
        trustManagerFactory.init(keyStoreCreate);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        int i60 = a;
        int i61 = i60 & 41;
        int i62 = -(-((i60 ^ 41) | i61));
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        b = i63 % 128;
        if (i63 % 2 == 0) {
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            sSLContext.getSocketFactory();
            obj.hashCode();
            throw null;
        }
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        int i64 = b + 51;
        a = i64 % 128;
        if (i64 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.m(socketFactory, "sslContext.socketFactory");
            List<TLS> list = this.c.p;
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.m(socketFactory, "sslContext.socketFactory");
        httpsURLConnection.setSSLSocketFactory(new ivas.gov.bisp.enumeration.df.e(socketFactory, this.c.p));
        int i65 = b;
        int i66 = ((((i65 ^ 99) | (i65 & 99)) << 1) - (~(-(((~i65) & 99) | (i65 & (-100)))))) - 1;
        a = i66 % 128;
        int i67 = i66 % 2;
    }

    public final void e(int i, String str) throws IOException {
        String string;
        ivas.gov.bisp.enumeration.O.i iVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 43) | (i3 & 43)) << 1;
        int i5 = -(((~i3) & 43) | (i3 & (-44)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        j jVar = P.c;
        if (i7 != 0 ? i >= 200 : i >= 6862) {
            int i8 = b;
            int i9 = i8 & 13;
            int i10 = (~i9) & (i8 | 13);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (i < 300) {
                int i14 = (i8 ^ 111) + ((i8 & 111) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                j jVar2 = P.c;
                int i16 = b + 9;
                a = i16 % 128;
                int i17 = i16 % 2;
                return;
            }
        }
        Object obj = null;
        if (i != 408) {
            int i18 = b;
            int i19 = (-2) - ((((i18 | 26) << 1) - (i18 ^ 26)) ^ (-1));
            int i20 = i19 % 128;
            a = i20;
            if (i19 % 2 == 0 ? i < 500 : i < 28813) {
                int i21 = i20 & 71;
                int i22 = (i21 - (~(-(-((i20 ^ 71) | i21))))) - 1;
                b = i22 % 128;
                if (i22 % 2 != 0 ? i >= 400 : i >= 11960) {
                    j jVar3 = P.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    int i23 = a;
                    int i24 = (i23 & (-20)) | ((~i23) & 19);
                    int i25 = -(-((i23 & 19) << 1));
                    int i26 = (i24 & i25) + (i25 | i24);
                    b = i26 % 128;
                    if (i26 % 2 == 0) {
                        sb.append(": Client error - request will be discarded");
                        sb.toString();
                        obj.hashCode();
                        throw null;
                    }
                    sb.append(": Client error - request will be discarded");
                    ((ivas.gov.bisp.enumeration.O.i) jVar3).x("OooOOO", sb.toString());
                    int i27 = b + 97;
                    a = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 93 / 0;
                        return;
                    }
                    return;
                }
                j jVar4 = P.c;
                StringBuilder sb2 = new StringBuilder();
                int i29 = a;
                int i30 = i29 & 19;
                int i31 = (19 ^ i29) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                b = i32 % 128;
                int i33 = i32 % 2;
                sb2.append("Could not send ACRA Post - request will be discarded. responseCode=");
                sb2.append(i);
                sb2.append(" message=");
                int i34 = b;
                int i35 = i34 | 9;
                int i36 = i35 << 1;
                int i37 = -((~(i34 & 9)) & i35);
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    sb2.append(str);
                    string = sb2.toString();
                    iVar = (ivas.gov.bisp.enumeration.O.i) jVar4;
                    int i39 = 82 / 0;
                } else {
                    sb2.append(str);
                    string = sb2.toString();
                    iVar = (ivas.gov.bisp.enumeration.O.i) jVar4;
                }
                iVar.x("OooOOO", string);
                int i40 = a;
                int i41 = i40 ^ 35;
                int i42 = -(-((i40 & 35) << 1));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                b = i43 % 128;
                if (i43 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        j jVar5 = P.c;
        StringBuilder sb3 = new StringBuilder();
        int i44 = b;
        int i45 = i44 & 85;
        int i46 = (i45 - (~(-(-((i44 ^ 85) | i45))))) - 1;
        a = i46 % 128;
        int i47 = i46 % 2;
        sb3.append("Could not send ACRA Post responseCode=");
        sb3.append(i);
        int i48 = a;
        int i49 = i48 | 11;
        int i50 = (i49 << 1) - ((~(i48 & 11)) & i49);
        b = i50 % 128;
        if (i50 % 2 == 0) {
            sb3.append(" message=");
            sb3.append(str);
            throw null;
        }
        sb3.append(" message=");
        sb3.append(str);
        ((ivas.gov.bisp.enumeration.O.i) jVar5).x("OooOOO", sb3.toString());
        throw new IOException(ivas.gov.bisp.enumeration.p091n.j.o("Host returned error code ", i));
    }

    public final void g(HttpURLConnection httpURLConnection, HttpSender.Method method, T t) throws IOException {
        OutputStream bufferedOutputStream;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.O.r.n(method, "method");
        httpURLConnection.setRequestMethod(method.name());
        int i7 = b;
        int i8 = (i7 & (-116)) | ((~i7) & 115);
        int i9 = -(-((i7 & 115) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        httpURLConnection.setDoOutput(true);
        System.setProperty("http.keepAlive", "false");
        httpURLConnection.connect();
        int i12 = b;
        int i13 = i12 ^ 119;
        int i14 = ((((i12 & 119) | i13) << 1) - (~(-i13))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        if (this.c.n) {
            bufferedOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream(), 8192);
            int i16 = b;
            int i17 = i16 ^ 79;
            int i18 = ((i16 & 79) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 2 / 4;
            }
        } else {
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            int i22 = a;
            int i23 = i22 & 75;
            int i24 = (((i22 ^ 75) | i23) << 1) - ((i22 | 75) & (~i23));
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        try {
            h(bufferedOutputStream, t);
            bufferedOutputStream.flush();
            ivas.gov.bisp.enumeration.p100w.r.k(bufferedOutputStream, null);
            int i26 = a + 9;
            b = i26 % 128;
            int i27 = i26 % 2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ivas.gov.bisp.enumeration.p100w.r.k(bufferedOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x011c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0133  */
    /* JADX WARN: Code duplicated, block: B:31:0x0146  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x01be  */
    public void f(URL url, T t) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 ^ 93;
        int i7 = ((i5 & 93) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        ivas.gov.bisp.enumeration.O.r.e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        int i11 = a;
        int i12 = i11 + 73;
        b = i12 % 128;
        int i13 = i12 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            int i14 = (i11 ^ 75) + ((i11 & 75) << 1);
            b = i14 % 128;
            try {
                if (i14 % 2 == 0) {
                    c((HttpsURLConnection) httpURLConnection);
                    int i15 = 84 / 0;
                } else {
                    c((HttpsURLConnection) httpURLConnection);
                }
            } catch (GeneralSecurityException e) {
                j jVar = P.c;
                j jVar2 = P.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not configure SSL for ACRA request to ");
                sb.append(url);
                ((ivas.gov.bisp.enumeration.O.i) jVar).w("OooOOO", sb.toString(), e);
            }
        }
        int i16 = this.h;
        int i17 = this.j;
        httpURLConnection.setConnectTimeout(i16);
        int i18 = b;
        int i19 = ((i18 & 43) - (~(i18 | 43))) - 1;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            httpURLConnection.setReadTimeout(i17);
            throw null;
        }
        httpURLConnection.setReadTimeout(i17);
        String str = this.g;
        String str2 = this.i;
        int i20 = a;
        int i21 = (i20 & 81) + (i20 | 81);
        b = i21 % 128;
        int i22 = i21 % 2;
        Map<String, String> map = this.k;
        int i23 = (i20 & (-116)) | ((~i20) & 115);
        int i24 = (i20 & 115) << 1;
        int i25 = (i23 & i24) + (i24 | i23);
        b = i25 % 128;
        int i26 = i25 % 2;
        Object[] objArrCopyOf = Arrays.copyOf(new Object[]{"5.9.6"}, 1);
        int i27 = b;
        int i28 = i27 ^ 11;
        int i29 = ((((i27 & 11) | i28) << 1) - (~(-i28))) - 1;
        a = i29 % 128;
        int i30 = i29 % 2;
        String str3 = String.format("Android ACRA %1$s", objArrCopyOf);
        ivas.gov.bisp.enumeration.O.r.m(str3, "format(format, *args)");
        int i31 = a;
        int i32 = ((i31 | 25) << 1) - (i31 ^ 25);
        b = i32 % 128;
        int i33 = i32 % 2;
        httpURLConnection.setRequestProperty("User-Agent", str3);
        int i34 = a + 35;
        b = i34 % 128;
        int i35 = i34 % 2;
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xml,application/json,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        Context context = this.e;
        int i36 = a;
        int i37 = (i36 & 25) + (i36 | 25);
        b = i37 % 128;
        if (i37 % 2 == 0) {
            httpURLConnection.setRequestProperty("Content-Type", d(context, t));
            int i38 = 73 / 0;
            if (str != null) {
                i = a;
                int i39 = i ^ 59;
                int i40 = ((i & 59) | i39) << 1;
                int i41 = -i39;
                i2 = (i40 ^ i41) + ((i41 & i40) << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (str2 != null) {
                    int i42 = i & 75;
                    i3 = (i42 - (~(-(-((i ^ 75) | i42))))) - 1;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        ivas.gov.bisp.enumeration.p091n.j.t(str, ":", str2);
                        Charset charset = U.c;
                        throw null;
                    }
                    String strT = ivas.gov.bisp.enumeration.p091n.j.t(str, ":", str2);
                    Charset charset2 = U.c;
                    byte[] bytes = strT.getBytes(charset2);
                    int i43 = a;
                    int i44 = i43 ^ 75;
                    int i45 = ((i43 & 75) | i44) << 1;
                    int i46 = -i44;
                    int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    ivas.gov.bisp.enumeration.O.r.m(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] bArrEncode = Base64.encode(bytes, 2);
                    ivas.gov.bisp.enumeration.O.r.m(bArrEncode, "encode(\"$login:$password…s.UTF_8), Base64.NO_WRAP)");
                    String str4 = new String(bArrEncode, charset2);
                    StringBuilder sb2 = new StringBuilder();
                    int i49 = b;
                    int i50 = i49 ^ 33;
                    int i51 = ((i49 & 33) | i50) << 1;
                    int i52 = -i50;
                    int i53 = (i51 & i52) + (i51 | i52);
                    a = i53 % 128;
                    int i54 = i53 % 2;
                    sb2.append("Basic ");
                    sb2.append(str4);
                    int i55 = a + 47;
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    httpURLConnection.setRequestProperty("Authorization", sb2.toString());
                    int i57 = a;
                    int i58 = (-2) - (((i57 & 22) + (i57 | 22)) ^ (-1));
                    b = i58 % 128;
                    int i59 = i58 % 2;
                }
            }
        } else {
            httpURLConnection.setRequestProperty("Content-Type", d(context, t));
            if (str != null) {
                i = a;
                int i310 = i ^ 59;
                int i410 = ((i & 59) | i310) << 1;
                int i411 = -i310;
                i2 = (i410 ^ i411) + ((i411 & i410) << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (str2 != null) {
                    int i412 = i & 75;
                    i3 = (i412 - (~(-(-((i ^ 75) | i412))))) - 1;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        ivas.gov.bisp.enumeration.p091n.j.t(str, ":", str2);
                        Charset charset3 = U.c;
                        throw null;
                    }
                    String strT2 = ivas.gov.bisp.enumeration.p091n.j.t(str, ":", str2);
                    Charset charset4 = U.c;
                    byte[] bytes2 = strT2.getBytes(charset4);
                    int i413 = a;
                    int i414 = i413 ^ 75;
                    int i415 = ((i413 & 75) | i414) << 1;
                    int i416 = -i414;
                    int i417 = (i415 ^ i416) + ((i415 & i416) << 1);
                    b = i417 % 128;
                    int i418 = i417 % 2;
                    ivas.gov.bisp.enumeration.O.r.m(bytes2, "this as java.lang.String).getBytes(charset)");
                    byte[] bArrEncode2 = Base64.encode(bytes2, 2);
                    ivas.gov.bisp.enumeration.O.r.m(bArrEncode2, "encode(\"$login:$password…s.UTF_8), Base64.NO_WRAP)");
                    String str5 = new String(bArrEncode2, charset4);
                    StringBuilder sb3 = new StringBuilder();
                    int i419 = b;
                    int i510 = i419 ^ 33;
                    int i511 = ((i419 & 33) | i510) << 1;
                    int i512 = -i510;
                    int i513 = (i511 & i512) + (i511 | i512);
                    a = i513 % 128;
                    int i514 = i513 % 2;
                    sb3.append("Basic ");
                    sb3.append(str5);
                    int i515 = a + 47;
                    b = i515 % 128;
                    int i516 = i515 % 2;
                    httpURLConnection.setRequestProperty("Authorization", sb3.toString());
                    int i517 = a;
                    int i518 = (-2) - (((i517 & 22) + (i517 | 22)) ^ (-1));
                    b = i518 % 128;
                    int i519 = i518 % 2;
                }
            }
        }
        if (this.c.n) {
            int i60 = b + 19;
            a = i60 % 128;
            if (i60 % 2 != 0) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                int i61 = 95 / 0;
            } else {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
            int i62 = b;
            int i63 = i62 & 3;
            int i64 = i63 + ((i62 ^ 3) | i63);
            a = i64 % 128;
            int i65 = i64 % 2;
        }
        if (map != null) {
            int i66 = b;
            int i67 = (i66 & (-24)) | ((~i66) & 23);
            int i68 = -(-((i66 & 23) << 1));
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            a = i69 % 128;
            if (i69 % 2 != 0) {
                map.entrySet().iterator();
                throw null;
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                int i70 = b;
                int i71 = ((i70 ^ 25) | (i70 & 25)) << 1;
                int i72 = -(((~i70) & 25) | (i70 & (-26)));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                a = i73 % 128;
                int i74 = i73 % 2;
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                int i75 = a + 55;
                b = i75 % 128;
                if (i75 % 2 == 0) {
                    httpURLConnection.setRequestProperty(key, next.getValue());
                    int i76 = 27 / 0;
                } else {
                    httpURLConnection.setRequestProperty(key, next.getValue());
                }
                int i77 = a;
                int i78 = (((i77 | 6) << 1) - (i77 ^ 6)) - 1;
                b = i78 % 128;
                int i79 = i78 % 2;
            }
        }
        j jVar3 = P.c;
        try {
            g(httpURLConnection, this.f, t);
            int i80 = b + 5;
            a = i80 % 128;
            int i81 = i80 % 2;
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            ivas.gov.bisp.enumeration.O.r.m(responseMessage, "urlConnection.responseMessage");
            int i82 = b;
            int i83 = ((i82 ^ 26) + ((i82 & 26) << 1)) - 1;
            a = i83 % 128;
            int i84 = i83 % 2;
            e(responseCode, responseMessage);
            httpURLConnection.disconnect();
            int i85 = a;
            int i86 = (((i85 | 86) << 1) - (i85 ^ 86)) - 1;
            b = i86 % 128;
            int i87 = i86 % 2;
        } catch (SocketTimeoutException e2) {
            if (!this.c.c) {
                throw e2;
            }
            j jVar4 = P.c;
            int i88 = a;
            int i89 = i88 & 37;
            int i90 = i88 | 37;
            int i91 = (i89 & i90) + (i90 | i89);
            b = i91 % 128;
            int i92 = i91 % 2;
        }
    }
}
