package ivas.gov.bisp.enumeration.df;

import android.os.Build;
import ivas.gov.bisp.enumeration.bN.C0130y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.acra.security.TLS;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SSLSocketFactory {
    private static int a = 1;
    private static int b;
    public final SSLSocketFactory c;
    public final List<String> d;

    public final Socket c(Socket socket) {
        int length;
        int i;
        int i2;
        List<String> list;
        String[] strArr;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 117;
        int i6 = (i4 | 117) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        if (socket instanceof SSLSocket) {
            int i11 = i9 + 43;
            b = i11 % 128;
            int i12 = i11 % 2;
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            int i13 = a;
            int i14 = (((i13 ^ 33) | (i13 & 33)) << 1) - (((~i13) & 33) | (i13 & (-34)));
            b = i14 % 128;
            if (i14 % 2 != 0) {
                ivas.gov.bisp.enumeration.O.r.m(supportedProtocols, "sslSocket.supportedProtocols");
                length = supportedProtocols.length;
            } else {
                ivas.gov.bisp.enumeration.O.r.m(supportedProtocols, "sslSocket.supportedProtocols");
                length = supportedProtocols.length;
            }
            int i15 = b;
            int i16 = (i15 & 95) + (i15 | 95);
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    int i19 = a;
                    int i20 = i19 & 121;
                    int i21 = -(-((i19 ^ 121) | i20));
                    i = (i20 & i21) + (i21 | i20);
                    i2 = i % 128;
                    break;
                }
                int i22 = b;
                int i23 = i22 & 61;
                int i24 = (i22 ^ 61) | i23;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    this.d.contains(supportedProtocols[i18]);
                    throw null;
                }
                if (this.d.contains(supportedProtocols[i18])) {
                    int i26 = b;
                    int i27 = i26 & 117;
                    int i28 = (((i26 ^ 117) | i27) << 1) - ((~i27) & (i26 | 117));
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i26 & 67;
                    int i31 = (~i30) & (i26 | 67);
                    int i32 = i30 << 1;
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    a = i33 % 128;
                    if (i33 % 2 == 0) {
                        list = this.d;
                        strArr = new String[1];
                    } else {
                        list = this.d;
                        strArr = new String[0];
                    }
                    int i34 = (-2) - (((i26 & 96) + (i26 | 96)) ^ (-1));
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    Object[] array = list.toArray(strArr);
                    int i36 = b;
                    int i37 = i36 | 51;
                    int i38 = i37 << 1;
                    int i39 = -((~(i36 & 51)) & i37);
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    ivas.gov.bisp.enumeration.O.r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr2 = (String[]) array;
                    int i42 = a;
                    int i43 = i42 & 113;
                    int i44 = i42 | 113;
                    int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        sSLSocket.setEnabledProtocols(strArr2);
                        throw null;
                    }
                    sSLSocket.setEnabledProtocols(strArr2);
                    int i46 = a;
                    int i47 = i46 ^ 117;
                    int i48 = (i46 & 117) << 1;
                    i = ((i47 | i48) << 1) - (i48 ^ i47);
                    i2 = i % 128;
                    break;
                }
                int i49 = ((i18 ^ 59) | (i18 & 59)) << 1;
                int i50 = -(((~i18) & 59) | (i18 & (-60)));
                int i51 = (i49 & i50) + (i50 | i49);
                i18 = ((i51 & (-57)) + (i51 | (-57))) - 1;
                int i52 = b;
                int i53 = ((i52 ^ 116) + ((i52 & 116) << 1)) - 1;
                a = i53 % 128;
                int i54 = i53 % 2;
            }
            b = i2;
            int i55 = i % 2;
        }
        int i56 = a;
        int i57 = i56 & 1;
        int i58 = (((i56 | 1) & (~i57)) - (~(i57 << 1))) - 1;
        b = i58 % 128;
        if (i58 % 2 != 0) {
            int i59 = 75 / 0;
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 91;
        int i5 = (i3 ^ 91) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.O.r.n(socket, "socket");
        ivas.gov.bisp.enumeration.O.r.n(str, "s");
        SSLSocketFactory sSLSocketFactory = this.c;
        int i8 = b;
        int i9 = (((i8 & (-66)) | ((~i8) & 65)) - (~((i8 & 65) << 1))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, str, i, z);
        ivas.gov.bisp.enumeration.O.r.m(socketCreateSocket, "delegate.createSocket(socket, s, i, b)");
        if (i10 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c(socketCreateSocket);
        int i11 = a + 101;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 9 / 0;
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        int i = 2 % 2;
        int i2 = a + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        String[] defaultCipherSuites = this.c.getDefaultCipherSuites();
        ivas.gov.bisp.enumeration.O.r.m(defaultCipherSuites, "delegate.defaultCipherSuites");
        int i4 = a;
        int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 & 15;
        int i8 = ((((i4 ^ 15) | i7) << 1) - (~(-((i4 | 15) & (~i7))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (i2 | 13) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        String[] supportedCipherSuites = this.c.getSupportedCipherSuites();
        if (i7 == 0) {
            ivas.gov.bisp.enumeration.O.r.m(supportedCipherSuites, "delegate.supportedCipherSuites");
            int i8 = 52 / 0;
        } else {
            ivas.gov.bisp.enumeration.O.r.m(supportedCipherSuites, "delegate.supportedCipherSuites");
        }
        int i9 = a + 7;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return supportedCipherSuites;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 111) + ((i3 & 111) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(str, "s");
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(str, "s");
        SSLSocketFactory sSLSocketFactory = this.c;
        int i5 = a;
        int i6 = (i5 ^ 24) + ((i5 & 24) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.m(sSLSocketFactory.createSocket(str, i), "delegate.createSocket(s, i)");
            throw null;
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(str, i);
        ivas.gov.bisp.enumeration.O.r.m(socketCreateSocket, "delegate.createSocket(s, i)");
        int i8 = a;
        int i9 = i8 & 99;
        int i10 = ((i8 ^ 99) | i9) << 1;
        int i11 = -((i8 | 99) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        c(socketCreateSocket);
        if (i13 != 0) {
            int i14 = 32 / 0;
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = a + 25;
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(str, "s");
        ivas.gov.bisp.enumeration.O.r.n(inetAddress, "inetAddress");
        SSLSocketFactory sSLSocketFactory = this.c;
        int i6 = a;
        int i7 = (i6 & 99) + (i6 | 99);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.m(sSLSocketFactory.createSocket(str, i, inetAddress, i2), "delegate.createSocket(s, i, inetAddress, i1)");
            obj.hashCode();
            throw null;
        }
        Socket socketCreateSocket = sSLSocketFactory.createSocket(str, i, inetAddress, i2);
        ivas.gov.bisp.enumeration.O.r.m(socketCreateSocket, "delegate.createSocket(s, i, inetAddress, i1)");
        c(socketCreateSocket);
        int i8 = b;
        int i9 = i8 & 7;
        int i10 = (((i8 | 7) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return socketCreateSocket;
        }
        obj.hashCode();
        throw null;
    }

    public e(SSLSocketFactory sSLSocketFactory, List<? extends TLS> list) {
        ivas.gov.bisp.enumeration.O.r.n(list, "protocols");
        this.c = sSLSocketFactory;
        ArrayList arrayList = new ArrayList(list);
        if (Build.VERSION.SDK_INT < 29) {
            arrayList.remove(TLS.V1_3);
            int i = a;
            int i2 = (i ^ 70) + ((i & 70) << 1);
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        ArrayList arrayList2 = new ArrayList(C0130y.an(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i6 = a;
        int i7 = i6 & 53;
        int i8 = (i6 ^ 53) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        int i12 = i10 & 53;
        int i13 = (i12 - (~(-(-((i10 ^ 53) | i12))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 2 % 2;
        while (it.hasNext()) {
            int i16 = a;
            int i17 = i16 | 75;
            int i18 = (i17 << 1) - ((~(i16 & 75)) & i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            String id = ((TLS) it.next()).getId();
            int i20 = b;
            int i21 = i20 & 15;
            int i22 = (i20 | 15) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                arrayList2.add(id);
                int i25 = 82 / 0;
            } else {
                arrayList2.add(id);
            }
        }
        this.d = arrayList2;
        int i26 = a;
        int i27 = i26 & 85;
        int i28 = (i27 - (~(-(-((i26 ^ 85) | i27))))) - 1;
        b = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 9 / 0;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 31;
        int i5 = ((i3 & 31) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.n(inetAddress, "inetAddress");
            this.c.createSocket(inetAddress, i);
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(inetAddress, "inetAddress");
        Socket socketCreateSocket = this.c.createSocket(inetAddress, i);
        ivas.gov.bisp.enumeration.O.r.m(socketCreateSocket, "delegate.createSocket(inetAddress, i)");
        c(socketCreateSocket);
        int i8 = a + 79;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return socketCreateSocket;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 109;
        int i6 = i5 + ((i4 ^ 109) | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.O.r.n(inetAddress, "inetAddress");
        ivas.gov.bisp.enumeration.O.r.n(inetAddress2, "inetAddress1");
        SSLSocketFactory sSLSocketFactory = this.c;
        int i8 = a;
        int i9 = ((i8 & (-10)) | ((~i8) & 9)) + ((i8 & 9) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        Socket socketCreateSocket = sSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        ivas.gov.bisp.enumeration.O.r.m(socketCreateSocket, "delegate.createSocket(in…ess, i, inetAddress1, i1)");
        int i11 = b;
        int i12 = i11 & 7;
        int i13 = -(-(i11 | 7));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        c(socketCreateSocket);
        int i16 = a;
        int i17 = (i16 ^ 93) + ((i16 & 93) << 1);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return socketCreateSocket;
        }
        throw null;
    }
}
