package ivas.gov.bisp.enumeration.p023aw;

import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.p022av.C0097t;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {
    private static int a = 0;
    private static int b = 1;

    public static class bKz extends FilterInputStream {
        private static int a = 0;
        private static int b = 1;
        public final HttpURLConnection c;

        /* JADX WARN: Illegal instructions before constructor call */
        public bKz(HttpURLConnection httpURLConnection) {
            InputStream errorStream;
            try {
                errorStream = httpURLConnection.getInputStream();
                int i = b;
                int i2 = ((i ^ 89) | (i & 89)) << 1;
                int i3 = -(((~i) & 89) | (i & (-90)));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            super(errorStream);
            this.c = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 109) + (i2 | 109);
            a = i3 % 128;
            int i4 = i3 % 2;
            super.close();
            this.c.disconnect();
            int i5 = b;
            int i6 = i5 & 37;
            int i7 = i5 | 37;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void bB(HttpURLConnection httpURLConnection, o00O0O<?> o00o0o) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrF = o00o0o.f();
        if (bArrF != null) {
            int i5 = b;
            int i6 = ((i5 ^ 70) + ((i5 & 70) << 1)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            bz(httpURLConnection, o00o0o, bArrF);
            int i8 = a;
            int i9 = (i8 & 79) + (i8 | 79);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 2;
            }
        }
        int i11 = b;
        int i12 = i11 & 15;
        int i13 = i12 + ((i11 ^ 15) | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public static List<C0097t> bx(Map<String, List<String>> map) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(map.size());
        Set<Map.Entry<String, List<String>>> setEntrySet = map.entrySet();
        int i2 = b;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Iterator<Map.Entry<String, List<String>>> it = setEntrySet.iterator();
        int i5 = a;
        int i6 = ((i5 ^ 90) + ((i5 & 90) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            int i8 = a;
            int i9 = i8 ^ 119;
            int i10 = (i8 & 119) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                it.next().getKey();
                throw null;
            }
            Map.Entry<String, List<String>> next = it.next();
            if (next.getKey() != null) {
                Iterator<String> it2 = next.getValue().iterator();
                int i12 = b;
                int i13 = i12 & 1;
                int i14 = ((~i13) & (i12 | 1)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((i12 | 31) << 1) - (i12 ^ 31);
                a = i16 % 128;
                int i17 = i16 % 2;
                while (it2.hasNext()) {
                    C0097t c0097t = new C0097t(next.getKey(), it2.next());
                    int i18 = b;
                    int i19 = i18 & 25;
                    int i20 = ((i18 ^ 25) | i19) << 1;
                    int i21 = -((i18 | 25) & (~i19));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    a = i22 % 128;
                    if (i22 % 2 != 0) {
                        arrayList.add(c0097t);
                        throw null;
                    }
                    arrayList.add(c0097t);
                }
            }
        }
        int i23 = b;
        int i24 = i23 & 119;
        int i25 = i24 + ((i23 ^ 119) | i24);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 17 / 0;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bb, code lost:
    
        if (r11 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        if (r11 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        r6 = (r2 & (-82)) | ((~r2) & 81);
        r2 = (r2 & 81) << 1;
        r8 = ((r6 | r2) << 1) - (r2 ^ r6);
        ivas.gov.bisp.enumeration.p023aw.i.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        if (r10.e == 4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p023aw.i.b;
        r2 = r10 ^ 39;
        r10 = (((r10 & 39) | r2) << 1) - r2;
        r2 = r10 % 128;
        ivas.gov.bisp.enumeration.p023aw.i.a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        if ((r10 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (118 > r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (100 > r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        r10 = (r2 ^ 35) + ((r2 & 35) << 1);
        ivas.gov.bisp.enumeration.p023aw.i.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        if (r11 < 200) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        if (r11 == 204) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0104, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p023aw.i.b;
        r2 = ((r10 ^ 37) | (r10 & 37)) << 1;
        r10 = -(((~r10) & 37) | (r10 & (-38)));
        r6 = ((r2 | r10) << 1) - (r10 ^ r2);
        r10 = r6 % 128;
        ivas.gov.bisp.enumeration.p023aw.i.a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011e, code lost:
    
        if ((r6 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0122, code lost:
    
        if (r11 == 19837) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        if (r11 == 304) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        r10 = r10 + 27;
        ivas.gov.bisp.enumeration.p023aw.i.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        r7 = new ivas.gov.bisp.enumeration.p023aw.e(r11, bx(r1.getHeaderFields()), r1.getContentLength(), new ivas.gov.bisp.enumeration.aw.i.bKz(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0146, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p023aw.i.a;
        r11 = ((r10 ^ 120) + ((r10 & 120) << 1)) - 1;
        r10 = r11 % 128;
        ivas.gov.bisp.enumeration.p023aw.i.b = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0154, code lost:
    
        if ((r11 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0156, code lost:
    
        r11 = r10 & 37;
        r10 = (r10 | 37) & (~r11);
        r11 = r11 << 1;
        r1 = (r10 & r11) + (r10 | r11);
        ivas.gov.bisp.enumeration.p023aw.i.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0165, code lost:
    
        if ((r1 % 2) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0167, code lost:
    
        r0 = 2 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016a, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016d, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p023aw.i.a;
        r2 = ((r10 ^ 113) | (r10 & 113)) << 1;
        r10 = -(((~r10) & 113) | (r10 & (-114)));
        r6 = (r2 ^ r10) + ((r10 & r2) << 1);
        ivas.gov.bisp.enumeration.p023aw.i.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0187, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p023aw.e(r11, bx(r1.getHeaderFields()), -1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p023aw.i.a;
        r11 = (((r10 & (-40)) | ((~r10) & 39)) - (~(-(-((r10 & 39) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p023aw.i.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a9, code lost:
    
        if ((r11 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ab, code lost:
    
        r1.disconnect();
        r10 = ivas.gov.bisp.enumeration.p023aw.i.a + 81;
        ivas.gov.bisp.enumeration.p023aw.i.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b7, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b8, code lost:
    
        r1.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c3, code lost:
    
        throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
     */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p023aw.e T(ivas.gov.bisp.enumeration.o0ooOO0.o00O0O<?> r10, java.util.Map<java.lang.String, java.lang.String> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p023aw.i.T(ivas.gov.bisp.enumeration.av.M, java.util.Map):ivas.gov.bisp.enumeration.aw.e");
    }

    public final void bz(HttpURLConnection httpURLConnection, o00O0O<?> o00o0o, byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = ((i2 | 3) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            int i6 = a;
            int i7 = ((i6 ^ 24) + ((i6 & 24) << 1)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            httpURLConnection.setRequestProperty("Content-Type", o00o0o.g());
            int i9 = a;
            int i10 = i9 & 7;
            int i11 = (i10 - (~((i9 ^ 7) | i10))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        int i13 = a;
        int i14 = (i13 ^ 61) + ((i13 & 61) << 1);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            dataOutputStream.write(bArr);
            dataOutputStream.close();
            throw null;
        }
        dataOutputStream.write(bArr);
        dataOutputStream.close();
        int i15 = b + 1;
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    public void bA(HttpURLConnection httpURLConnection, o00O0O<?> o00o0o) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 29) << 1;
        int i4 = -(i2 ^ 29);
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            int i6 = o00o0o.e;
            obj.hashCode();
            throw null;
        }
        switch (o00o0o.e) {
            case -1:
                byte[] bArrK = o00o0o.k();
                if (bArrK != null) {
                    int i7 = b + 98;
                    int i8 = (i7 ^ (-1)) + (i7 << 1);
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        bz(httpURLConnection, o00o0o, bArrK);
                        throw null;
                    }
                    httpURLConnection.setRequestMethod("POST");
                    bz(httpURLConnection, o00o0o, bArrK);
                }
                int i9 = b;
                int i10 = i9 & 17;
                int i11 = ((i9 ^ 17) | i10) << 1;
                int i12 = -((i9 | 17) & (~i10));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 62 / 0;
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                int i15 = b;
                int i16 = (((i15 & (-2)) | ((~i15) & 1)) - (~(-(-((i15 & 1) << 1))))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                bB(httpURLConnection, o00o0o);
                int i18 = a;
                int i19 = ((i18 | 73) << 1) - (i18 ^ 73);
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                bB(httpURLConnection, o00o0o);
                int i20 = b + 121;
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 8 / 0;
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                int i22 = b;
                int i23 = i22 & 51;
                int i24 = i23 + ((i22 ^ 51) | i23);
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 58 / 0;
                    return;
                }
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                int i26 = a;
                int i27 = i26 & 27;
                int i28 = ((i26 | 27) & (~i27)) + (i27 << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                int i30 = b;
                int i31 = i30 ^ 27;
                int i32 = ((i30 & 27) | i31) << 1;
                int i33 = -i31;
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                int i35 = a + 45;
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    throw null;
                }
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                bB(httpURLConnection, o00o0o);
                int i36 = b;
                int i37 = i36 ^ 87;
                int i38 = (((i36 & 87) | i37) << 1) - i37;
                a = i38 % 128;
                int i39 = i38 % 2;
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
