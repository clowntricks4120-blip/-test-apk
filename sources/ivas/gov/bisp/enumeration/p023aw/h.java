package ivas.gov.bisp.enumeration.p023aw;

import android.os.SystemClock;
import android.text.TextUtils;
import ivas.gov.bisp.enumeration.p022av.C0097t;
import ivas.gov.bisp.enumeration.p022av.S;
import ivas.gov.bisp.enumeration.p022av.r;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class h implements r {
    private static int a = 0;
    private static int b = 1;
    public final bKv e;
    public final Map<String, bKt> c = new LinkedHashMap(16, 0.75f, true);
    public long d = 0;
    public final int f = 5242880;

    public static class bKu extends FilterInputStream {
        private static int a = 0;
        private static int b = 1;
        public final long c;
        public long d;

        public bKu(InputStream inputStream, long j) {
            super(inputStream);
            this.c = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 29;
            int i4 = -(-((i2 & 29) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                super.read();
                throw null;
            }
            int i6 = super.read();
            if (i6 != -1) {
                int i7 = a;
                int i8 = (i7 & 100) + (i7 | 100);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                this.d = i9 % 2 == 0 ? 0L : this.d + 1;
            }
            int i10 = a + 81;
            b = i10 % 128;
            int i11 = i10 % 2;
            return i6;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r6
  0x0030: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:8:0x002e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 & (-24)) | ((~i5) & 23);
            int i7 = -(-((i5 & 23) << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                i3 = super.read(bArr, i, i2);
                int i9 = 10 / 0;
                if (i3 != -1) {
                    this.d += (long) i3;
                    int i10 = a + 75;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                }
            } else {
                i3 = super.read(bArr, i, i2);
                if (i3 != -1) {
                    this.d += (long) i3;
                    int i12 = a + 75;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            int i14 = b;
            int i15 = i14 & 21;
            int i16 = (i14 | 21) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 2 / 0;
            }
            return i3;
        }
    }

    public interface bKv {
    }

    public h(bKv bkv) {
        this.e = bkv;
    }

    public static int d(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = ((((i2 & 37) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = inputStream.read();
        if (i6 == -1) {
            throw new EOFException();
        }
        int i7 = a;
        int i8 = (i7 ^ 12) + ((i7 & 12) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        int i12 = (i10 & 13) + (i10 | 13);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 63 / 0;
        }
        return i6;
    }

    public r.bJP k(String str) {
        synchronized (this) {
            bKt bkt = this.c.get(str);
            if (bkt == null) {
                return null;
            }
            File fileL = l(str);
            try {
                bKu bku = new bKu(new BufferedInputStream(new FileInputStream(fileL)), fileL.length());
                try {
                    bKt bktD = bKt.d(bku);
                    if (TextUtils.equals(str, bktD.d)) {
                        r.bJP bjpE = bkt.e(h(bku, bku.c - bku.d));
                        bku.close();
                        return bjpE;
                    }
                    S.c("%s: key=%s, found=%s", fileL.getAbsolutePath(), str, bktD.d);
                    bKt bktRemove = this.c.remove(str);
                    if (bktRemove != null) {
                        this.d -= bktRemove.c;
                    }
                    bku.close();
                    return null;
                } catch (Throwable th) {
                    bku.close();
                    throw th;
                }
            } catch (IOException e) {
                S.c("%s: %s", fileL.getAbsolutePath(), e.toString());
                r(str);
                return null;
            }
        }
    }

    public File l(String str) {
        int i = 2 % 2;
        File file = new File(((l) this.e).c(), m(str));
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = (i3 - (~(-(-((i2 ^ 73) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public void n() {
        synchronized (this) {
            try {
                File fileC = ((l) this.e).c();
                if (!fileC.exists()) {
                    if (!fileC.mkdirs()) {
                        S.d("Unable to create cache dir %s", fileC.getAbsolutePath());
                    }
                    return;
                }
                File[] fileArrListFiles = fileC.listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                for (int i = 0; i < length; i = (i | 1) + (i & 1)) {
                    File file = fileArrListFiles[i];
                    try {
                        long length2 = file.length();
                        bKu bku = new bKu(new BufferedInputStream(new FileInputStream(file)), length2);
                        try {
                            bKt bktD = bKt.d(bku);
                            bktD.c = length2;
                            q(bktD.d, bktD);
                            bku.close();
                        } catch (Throwable th) {
                            bku.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(String str, r.bJP bjp) {
        synchronized (this) {
            long j = this.d;
            byte[] bArr = bjp.a;
            long length = bArr.length;
            int i = this.f;
            if (j + length > i && bArr.length > i * 0.9f) {
                return;
            }
            File fileL = l(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileL));
                bKt bkt = new bKt(str, bjp);
                if (!bkt.f(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    S.c("Failed to write header for %s", fileL.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(bjp.a);
                bufferedOutputStream.close();
                bkt.c = fileL.length();
                q(str, bkt);
                p();
            } catch (IOException unused) {
                if (!fileL.delete()) {
                    S.c("Could not clean up file %s", fileL.getAbsolutePath());
                }
                if (!((l) this.e).c().exists()) {
                    S.c("Re-initializing cache after external clearing.", new Object[0]);
                    this.c.clear();
                    this.d = 0L;
                    n();
                }
            }
        }
    }

    public void r(String str) {
        synchronized (this) {
            boolean zDelete = l(str).delete();
            bKt bktRemove = this.c.remove(str);
            if (bktRemove != null) {
                this.d -= bktRemove.c;
            }
            if (!zDelete) {
                S.c("Could not delete cache entry for key=%s, filename=%s", str, m(str));
            }
        }
    }

    public static String f(bKu bku) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 117) + (i2 | 117);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = new String(h(bku, e(bku)), "UTF-8");
        int i5 = b;
        int i6 = (i5 & 89) + (i5 | 89);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return str;
    }

    public static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-82)) | ((~i2) & 81)) + ((i2 & 81) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            bytes = str.getBytes("UTF-8");
            i(outputStream, bytes.length);
            int i4 = 80 / 0;
        } else {
            bytes = str.getBytes("UTF-8");
            i(outputStream, bytes.length);
        }
        int i5 = b + 17;
        a = i5 % 128;
        int i6 = i5 % 2;
        outputStream.write(bytes, 0, bytes.length);
        int i7 = a;
        int i8 = ((i7 | 23) << 1) - (i7 ^ 23);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int c(InputStream inputStream) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 83;
        int i5 = ((i3 & 83) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        int iD = d(inputStream);
        int iD2 = d(inputStream);
        int i9 = a + 57;
        b = i9 % 128;
        int i10 = i9 % 2;
        int iD3 = d(inputStream);
        int iD4 = d(inputStream) << 24;
        int i11 = a;
        int i12 = ((i11 & 101) - (~(-(-(i11 | 101))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2 == 0 ? iD & 1 & (iD2 >> 82) : iD | (iD2 << 8);
        int i14 = i11 & 33;
        int i15 = ((i11 ^ 33) | i14) << 1;
        int i16 = -((i11 | 33) & (~i14));
        int i17 = (i15 & i16) + (i15 | i16);
        int i18 = i17 % 128;
        b = i18;
        if (i17 % 2 == 0) {
            int i19 = ((iD3 | (-77)) << 1) - (((~iD3) & (-77)) | (iD3 & 76));
            int i20 = ((~i19) & i13) | ((~i13) & i19);
            int i21 = i13 & i19;
            int i22 = (i21 & i20) | (i20 ^ i21);
            i = ((~iD4) & i22) | ((~i22) & iD4);
        } else {
            int i23 = iD3 << 16;
            int i24 = i13 & i23;
            int i25 = (i13 | i23) & (~i24);
            int i26 = (i25 & i24) | (i25 ^ i24);
            int i27 = iD4 ^ i26;
            int i28 = iD4 & i26;
            i = (i28 & i27) | (i27 ^ i28);
        }
        int i29 = i18 & 79;
        int i30 = -(-(i18 | 79));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void g(OutputStream outputStream, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 116) + ((i3 & 116) << 1)) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
        outputStream.write(i & 255);
        int i6 = b;
        int i7 = (-2) - (((i6 ^ 90) + ((i6 & 90) << 1)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        outputStream.write((i >> 8) & 255);
        int i9 = b + 105;
        a = i9 % 128;
        int i10 = i9 % 2;
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
        int i11 = b + 93;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public final String m(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int length = str.length() / 2;
        String strSubstring = str.substring(0, length);
        int i5 = b;
        int i6 = (i5 ^ 27) + ((i5 & 27) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            j.w(String.valueOf(strSubstring.hashCode()));
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w(String.valueOf(strSubstring.hashCode()));
        sbW.append(String.valueOf(str.substring(length).hashCode()));
        int i7 = a;
        int i8 = i7 ^ 125;
        int i9 = ((i7 & 125) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return sbW.toString();
        }
        sbW.toString();
        obj.hashCode();
        throw null;
    }

    public static byte[] h(bKu bku, long j) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        int i4 = i3 % 2;
        long j2 = bku.c - bku.d;
        int i5 = b;
        int i6 = i5 & 13;
        int i7 = ((i5 ^ 13) | i6) << 1;
        int i8 = -((~i6) & (i5 | 13));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0 ? j >= 0 : j >= 0) {
            int i10 = i5 & 33;
            int i11 = (i5 | 33) & (~i10);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            if (j <= j2) {
                int i16 = i14 & 91;
                int i17 = (i16 - (~((i14 ^ 91) | i16))) - 1;
                b = i17 % 128;
                int i18 = i17 % 2;
                int i19 = (int) j;
                if (i19 == j) {
                    byte[] bArr = new byte[i19];
                    new DataInputStream(bku).readFully(bArr);
                    int i20 = b;
                    int i21 = ((i20 ^ 102) + ((i20 & 102) << 1)) - 1;
                    int i22 = i21 % 128;
                    a = i22;
                    int i23 = i21 % 2;
                    int i24 = ((i22 & 12) + (i22 | 12)) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    return bArr;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("streamToBytes length=");
        int i26 = a;
        int i27 = i26 & 1;
        int i28 = (i27 - (~(-(-((i26 ^ 1) | i27))))) - 1;
        b = i28 % 128;
        if (i28 % 2 == 0) {
            sb.append(j);
            sb.append(", maxLength=");
            throw null;
        }
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(j2);
        throw new IOException(sb.toString());
    }

    public final void q(String str, bKt bkt) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 53;
        int i4 = ((i2 & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (!this.c.containsKey(str)) {
            int i8 = b + 119;
            a = i8 % 128;
            this.d = i8 % 2 != 0 ? this.d & bkt.c : this.d + bkt.c;
        } else {
            bKt bkt2 = this.c.get(str);
            int i9 = b;
            int i10 = ((i9 ^ 122) + ((i9 & 122) << 1)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            long j = this.d;
            long j2 = bkt.c;
            long j3 = bkt2.c;
            int i12 = a;
            int i13 = (i12 | 39) << 1;
            int i14 = -((i12 & (-40)) | ((~i12) & 39));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            this.d = (j2 - j3) + j;
            int i17 = (i12 & 59) + (i12 | 59);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        this.c.put(str, bkt);
        int i19 = b;
        int i20 = i19 | 3;
        int i21 = (i20 << 1) - ((~(i19 & 3)) & i20);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    public static class bKt {
        private static int a = 1;
        private static int b;
        public long c;
        public final String d;
        public final String e;
        public final long f;
        public final long g;
        public final long h;
        public final long i;
        public final List<C0097t> j;

        public bKt(String str, String str2, long j, long j2, long j3, long j4, List<C0097t> list) {
            this.d = str;
            Object obj = null;
            if (BuildConfig.FLAVOR.equals(str2)) {
                int i = a;
                int i2 = (i | 73) << 1;
                int i3 = -(((~i) & 73) | (i & (-74)));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = null;
            }
            this.e = str2;
            this.f = j;
            int i7 = b;
            int i8 = i7 & 29;
            int i9 = (~i8) & (i7 | 29);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            this.h = j2;
            this.g = j3;
            this.i = j4;
            int i13 = i7 + 57;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                this.j = list;
            } else {
                this.j = list;
                obj.hashCode();
                throw null;
            }
        }

        public r.bJP e(byte[] bArr) {
            int i = 2 % 2;
            r.bJP bjp = new r.bJP();
            bjp.a = bArr;
            int i2 = a;
            int i3 = i2 & 13;
            int i4 = ((i2 ^ 13) | i3) << 1;
            int i5 = -((i2 | 13) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            bjp.b = this.e;
            long j = this.f;
            int i8 = b;
            int i9 = i8 & 43;
            int i10 = i8 | 43;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                bjp.c = j;
                bjp.d = this.h;
                int i12 = 95 / 0;
            } else {
                bjp.c = j;
                bjp.d = this.h;
            }
            bjp.f = this.g;
            bjp.e = this.i;
            List<C0097t> list = this.j;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            int i13 = b;
            int i14 = (i13 & 61) + (i13 | 61);
            a = i14 % 128;
            int i15 = i14 % 2;
            Iterator<C0097t> it = list.iterator();
            int i16 = b;
            int i17 = i16 & 47;
            int i18 = -(-((i16 ^ 47) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            while (!(!it.hasNext())) {
                int i21 = a;
                int i22 = i21 ^ 69;
                int i23 = ((i21 & 69) | i22) << 1;
                int i24 = -i22;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                b = i25 % 128;
                int i26 = i25 % 2;
                C0097t next = it.next();
                String str = next.c;
                int i27 = b;
                int i28 = ((i27 & 52) + (i27 | 52)) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                String str2 = next.d;
                int i30 = a;
                int i31 = i30 & 103;
                int i32 = (i30 | 103) & (~i31);
                int i33 = i31 << 1;
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                b = i34 % 128;
                int i35 = i34 % 2;
                treeMap.put(str, str2);
                int i36 = b + 70;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                a = i37 % 128;
                int i38 = i37 % 2;
            }
            bjp.g = treeMap;
            bjp.h = Collections.unmodifiableList(this.j);
            int i39 = a;
            int i40 = i39 & 75;
            int i41 = ((i39 | 75) & (~i40)) + (i40 << 1);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                return bjp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean f(OutputStream outputStream) {
            C0097t next;
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 81) + (i2 | 81);
            b = i3 % 128;
            int i4 = i3 % 2;
            try {
                h.g(outputStream, 538247942);
                String str2 = this.d;
                int i5 = a;
                int i6 = i5 & 95;
                int i7 = i6 + ((i5 ^ 95) | i6);
                b = i7 % 128;
                int i8 = i7 % 2;
                h.j(outputStream, str2);
                String str3 = this.e;
                Object obj = null;
                if (str3 == null) {
                    int i9 = a;
                    int i10 = i9 & 5;
                    int i11 = i9 | 5;
                    int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                    b = i12 % 128;
                    if (i12 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str3 = BuildConfig.FLAVOR;
                }
                h.j(outputStream, str3);
                h.i(outputStream, this.f);
                int i13 = a;
                int i14 = ((i13 | 47) << 1) - (i13 ^ 47);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    h.i(outputStream, this.h);
                    throw null;
                }
                h.i(outputStream, this.h);
                long j = this.g;
                int i15 = a;
                int i16 = i15 & 81;
                int i17 = i16 + ((i15 ^ 81) | i16);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    h.i(outputStream, j);
                    h.i(outputStream, this.i);
                    obj.hashCode();
                    throw null;
                }
                h.i(outputStream, j);
                h.i(outputStream, this.i);
                List<C0097t> list = this.j;
                if (list != null) {
                    int i18 = b;
                    int i19 = i18 & 93;
                    int i20 = -(-((i18 ^ 93) | i19));
                    int i21 = (i19 & i20) + (i20 | i19);
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        h.g(outputStream, list.size());
                        obj.hashCode();
                        throw null;
                    }
                    h.g(outputStream, list.size());
                    Iterator<C0097t> it = list.iterator();
                    int i22 = a + 33;
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    while (it.hasNext()) {
                        int i24 = a;
                        int i25 = (((i24 & (-110)) | ((~i24) & 109)) - (~((i24 & 109) << 1))) - 1;
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            next = it.next();
                            str = next.c;
                            int i26 = 49 / 0;
                        } else {
                            next = it.next();
                            str = next.c;
                        }
                        int i27 = b;
                        int i28 = ((i27 ^ 91) - (~((i27 & 91) << 1))) - 1;
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        h.j(outputStream, str);
                        String str4 = next.d;
                        int i30 = b;
                        int i31 = i30 & 81;
                        int i32 = i31 + ((i30 ^ 81) | i31);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        h.j(outputStream, str4);
                        int i34 = a;
                        int i35 = i34 ^ 1;
                        int i36 = (i34 & 1) << 1;
                        int i37 = (i35 & i36) + (i36 | i35);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                } else {
                    h.g(outputStream, 0);
                    int i39 = b;
                    int i40 = ((i39 & 36) + (i39 | 36)) - 1;
                    a = i40 % 128;
                    int i41 = i40 % 2;
                }
                outputStream.flush();
                int i42 = b + 90;
                int i43 = (i42 ^ (-1)) + (i42 << 1);
                a = i43 % 128;
                int i44 = i43 % 2;
                return true;
            } catch (IOException e) {
                S.c("%s", e.toString());
                return false;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v29, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List<ivas.gov.bisp.enumeration.av.t>] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v4 */
        public bKt(String str, r.bJP bjp) {
            String str2 = bjp.b;
            long j = bjp.c;
            long j2 = bjp.d;
            int i = b;
            int i2 = (i & (-46)) | ((~i) & 45);
            int i3 = (i & 45) << 1;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            long j3 = bjp.f;
            long j4 = bjp.e;
            ?? arrayList = bjp.h;
            int i6 = b;
            int i7 = i6 & 109;
            int i8 = ((i6 | 109) & (~i7)) + (i7 << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            Object obj = null;
            if (arrayList != 0) {
                int i11 = (((i9 | 60) << 1) - (i9 ^ 60)) - 1;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i12 = 2 % 2;
            } else {
                Map<String, String> map = bjp.g;
                arrayList = new ArrayList(map.size());
                int i13 = a;
                int i14 = i13 & 79;
                int i15 = ((((i13 ^ 79) | i14) << 1) - (~(-((~i14) & (i13 | 79))))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                int i17 = a + 3;
                b = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 2 % 2;
                while (it.hasNext()) {
                    int i20 = b + 9;
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        it.next();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Map.Entry<String, String> next = it.next();
                    C0097t c0097t = new C0097t(next.getKey(), next.getValue());
                    int i21 = a + 79;
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        arrayList.add(c0097t);
                        int i22 = 70 / 0;
                    } else {
                        arrayList.add(c0097t);
                    }
                }
            }
            ?? r13 = arrayList;
            int i23 = b;
            int i24 = (-2) - (((i23 ^ 86) + ((i23 & 86) << 1)) ^ (-1));
            a = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 2 % 2;
            this(str, str2, j, j2, j3, j4, r13);
        }

        public static bKt d(bKu bku) throws IOException {
            long jE;
            long jE2;
            List arrayList;
            int i = 2 % 2;
            int i2 = a + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (h.c(bku) != 538247942) {
                throw new IOException();
            }
            int i4 = a;
            int i5 = i4 ^ 57;
            int i6 = (i4 & 57) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                Object obj = null;
                h.f(bku);
                h.f(bku);
                obj.hashCode();
                throw null;
            }
            String strF = h.f(bku);
            String strF2 = h.f(bku);
            long jE3 = h.e(bku);
            long jE4 = h.e(bku);
            int i8 = b;
            int i9 = ((((i8 ^ 69) | (i8 & 69)) << 1) - (~(-(((~i8) & 69) | (i8 & (-70)))))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                jE = h.e(bku);
                jE2 = h.e(bku);
                int i10 = 82 / 0;
            } else {
                jE = h.e(bku);
                jE2 = h.e(bku);
            }
            long j = jE2;
            long j2 = jE;
            int i11 = a;
            int i12 = (i11 ^ 53) + ((i11 & 53) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            int iC = h.c(bku);
            if (iC < 0) {
                throw new IOException(j.o("readHeaderList size=", iC));
            }
            int i14 = b;
            int i15 = (((i14 ^ 1) | (i14 & 1)) << 1) - ((i14 & (-2)) | ((~i14) & 1));
            int i16 = i15 % 128;
            a = i16;
            if (i15 % 2 == 0) {
                throw null;
            }
            if (iC == 0) {
                int i17 = ((i16 | 125) << 1) - (i16 ^ 125);
                b = i17 % 128;
                int i18 = i17 % 2;
                List listEmptyList = Collections.emptyList();
                int i19 = b;
                int i20 = ((i19 ^ 40) + ((i19 & 40) << 1)) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                arrayList = listEmptyList;
            } else {
                arrayList = new ArrayList();
                int i22 = a;
                int i23 = (((i22 ^ 83) | (i22 & 83)) << 1) - ((i22 & (-84)) | (83 & (~i22)));
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            int i25 = b;
            int i26 = i25 & 9;
            int i27 = (~i26) & (i25 | 9);
            int i28 = i26 << 1;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            a = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (i31 < iC) {
                int i32 = a;
                int i33 = ((~i32) & 25) | (i32 & (-26));
                int i34 = (i32 & 25) << 1;
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    h.f(bku).intern();
                    h.f(bku);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                C0097t c0097t = new C0097t(h.f(bku).intern(), h.f(bku).intern());
                int i36 = a;
                int i37 = i36 ^ 109;
                int i38 = (i36 & 109) << 1;
                int i39 = (i37 & i38) + (i38 | i37);
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    arrayList.add(c0097t);
                    int i40 = i31 - 5;
                    i31 = ((i40 | 71) << 1) - (i40 ^ 71);
                } else {
                    arrayList.add(c0097t);
                    int i41 = (((i31 & (-94)) | ((~i31) & 93)) - (~(-(-((i31 & 93) << 1))))) - 1;
                    i31 = ((i41 & (-92)) - (~(i41 | (-92)))) - 1;
                }
                int i42 = b;
                int i43 = i42 & 21;
                int i44 = i43 + ((i42 ^ 21) | i43);
                a = i44 % 128;
                int i45 = i44 % 2;
            }
            bKt bkt = new bKt(strF, strF2, jE3, jE4, j2, j, arrayList);
            int i46 = b;
            int i47 = (i46 & (-10)) | (9 & (~i46));
            int i48 = -(-((i46 & 9) << 1));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            a = i49 % 128;
            int i50 = i49 % 2;
            return bkt;
        }
    }

    public static void i(OutputStream outputStream, long j) throws IOException {
        long j2;
        long j3;
        char c;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i2 ^ 17) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        outputStream.write((byte) j);
        int i7 = a;
        int i8 = ((i7 & (-4)) | ((~i7) & 3)) + ((i7 & 3) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            outputStream.write((byte) (j >> 8));
            j2 = j >> 32;
        } else {
            outputStream.write((byte) (j >>> 8));
            j2 = j >>> 16;
        }
        outputStream.write((byte) j2);
        byte b2 = (byte) (j >>> 24);
        int i9 = a;
        int i10 = (i9 & 61) + (i9 | 61);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            outputStream.write(b2);
            j3 = j >> 4;
        } else {
            outputStream.write(b2);
            j3 = j >>> 32;
        }
        byte b3 = (byte) j3;
        int i11 = b + 113;
        a = i11 % 128;
        int i12 = i11 % 2;
        outputStream.write(b3);
        outputStream.write((byte) (j >>> 40));
        int i13 = b;
        int i14 = i13 | 47;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 47)) & i14);
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            outputStream.write((byte) (j >> 3));
            c = 14;
        } else {
            outputStream.write((byte) (j >>> 48));
            c = '8';
        }
        int i18 = b;
        int i19 = i18 ^ 13;
        int i20 = ((((i18 & 13) | i19) << 1) - (~(-i19))) - 1;
        a = i20 % 128;
        outputStream.write((byte) (i20 % 2 != 0 ? j >> c : j >>> c));
        int i21 = a;
        int i22 = i21 & 71;
        int i23 = (i21 ^ 71) | i22;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    public static long e(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = (i3 - (~((i2 ^ 67) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        long jD = d(inputStream);
        long jD2 = d(inputStream);
        long jD3 = d(inputStream);
        int i6 = b;
        int i7 = i6 & 69;
        int i8 = (i6 | 69) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        long jD4 = d(inputStream);
        long jD5 = d(inputStream);
        int i12 = b;
        int i13 = ((i12 ^ 49) - (~((i12 & 49) << 1))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            Object obj = null;
            d(inputStream);
            d(inputStream);
            obj.hashCode();
            throw null;
        }
        long jD6 = d(inputStream);
        long jD7 = d(inputStream);
        long j = (jD & 255) | ((jD2 & 255) << 8);
        int i14 = b;
        int i15 = i14 & 87;
        int i16 = (((i14 ^ 87) | i15) << 1) - ((i14 | 87) & (~i15));
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        int i19 = (-2) - ((((i17 | 120) << 1) - (i17 ^ 120)) ^ (-1));
        int i20 = i19 % 128;
        b = i20;
        int i21 = i19 % 2;
        int i22 = i20 ^ 23;
        int i23 = (((i20 & 23) | i22) << 1) - i22;
        a = i23 % 128;
        int i24 = i23 % 2;
        long j2 = j | ((jD3 & 255) << 16) | ((jD4 & 255) << 24) | ((jD5 & 255) << 32) | ((jD6 & 255) << 40) | ((jD7 & 255) << 48);
        int iD = d(inputStream);
        int i25 = a;
        int i26 = ((i25 ^ 98) + ((i25 & 98) << 1)) - 1;
        int i27 = i26 % 128;
        b = i27;
        long j3 = i26 % 2 == 0 ? j2 & ((255 / ((long) iD)) >>> 70) : j2 | ((((long) iD) & 255) << 56);
        int i28 = i27 + 120;
        int i29 = (i28 ^ (-1)) + (i28 << 1);
        a = i29 % 128;
        if (i29 % 2 == 0) {
            return j3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 5;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.d < this.f) {
            int i4 = ((i2 ^ 40) + ((i2 & 40) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (S.c) {
            int i6 = a + 111;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                S.e("Pruning old cache entries.", new Object[1]);
            } else {
                S.e("Pruning old cache entries.", new Object[0]);
            }
            int i7 = b + 109;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        long j = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, bKt> map = this.c;
        int i9 = a + 21;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            map.entrySet().iterator();
            throw null;
        }
        Iterator<Map.Entry<String, bKt>> it = map.entrySet().iterator();
        int i10 = b;
        int i11 = i10 & 99;
        int i12 = ((((i10 ^ 99) | i11) << 1) - (~(-((i10 | 99) & (~i11))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2 != 0 ? 1 : 0;
        while (!(!it.hasNext())) {
            int i14 = a;
            int i15 = i14 & 67;
            int i16 = (i14 ^ 67) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            bKt value = it.next().getValue();
            int i19 = b;
            int i20 = i19 & 11;
            int i21 = (i19 | 11) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 & i22) + (i21 | i22);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                String str = value.d;
                obj.hashCode();
                throw null;
            }
            bKt bkt = value;
            String str2 = bkt.d;
            int i24 = b;
            int i25 = i24 & 125;
            int i26 = ((i24 ^ 125) | i25) << 1;
            int i27 = -((i24 | 125) & (~i25));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            if (l(str2).delete()) {
                int i30 = b + 45;
                a = i30 % 128;
                int i31 = i30 % 2;
                this.d -= bkt.c;
                int i32 = b;
                int i33 = (i32 ^ 22) + ((i32 & 22) << 1);
                int i34 = (i33 ^ (-1)) + (i33 << 1);
                a = i34 % 128;
                int i35 = i34 % 2;
            } else {
                Object[] objArr = new Object[2];
                String str3 = bkt.d;
                int i36 = b;
                int i37 = ((i36 ^ 23) | (i36 & 23)) << 1;
                int i38 = -((23 & (~i36)) | (i36 & (-24)));
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                a = i39 % 128;
                if (i39 % 2 != 0) {
                    objArr[0] = str3;
                } else {
                    objArr[0] = str3;
                }
                objArr[1] = m(str3);
                S.c("Could not delete cache entry for key=%s, filename=%s", objArr);
                int i40 = b;
                int i41 = i40 & 19;
                int i42 = (i40 ^ 19) | i41;
                int i43 = (i41 & i42) + (i42 | i41);
                a = i43 % 128;
                int i44 = i43 % 2;
            }
            it.remove();
            i13 = (-2) - (((i13 ^ 2) + ((i13 & 2) << 1)) ^ (-1));
            long j2 = this.d;
            int i45 = a + 65;
            b = i45 % 128;
            if (i45 % 2 == 0) {
                if (j2 < this.f % 0.9f) {
                    break;
                }
            } else if (j2 < this.f * 0.9f) {
                break;
            }
        }
        if (!(!S.c)) {
            int i46 = a + 7;
            b = i46 % 128;
            int i47 = i46 % 2;
            int i48 = b;
            int i49 = i48 & 27;
            int i50 = (((i48 ^ 27) | i49) << 1) - ((i48 | 27) & (~i49));
            a = i50 % 128;
            int i51 = i50 % 2;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            int i52 = b;
            int i53 = (((i52 | 103) << 1) - (~(-(((~i52) & 103) | (i52 & (-104)))))) - 1;
            a = i53 % 128;
            int i54 = i53 % 2;
            S.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i13), Long.valueOf(this.d - j), Long.valueOf(jElapsedRealtime2 - jElapsedRealtime));
            int i55 = a + 107;
            b = i55 % 128;
            int i56 = i55 % 2;
        }
        int i57 = b;
        int i58 = ((i57 ^ 48) + ((i57 & 48) << 1)) - 1;
        a = i58 % 128;
        if (i58 % 2 != 0) {
            int i59 = 49 / 0;
        }
    }
}
