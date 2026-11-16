package ivas.gov.bisp.enumeration.p018ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.session.PlaybackStateCompat;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ax implements Closeable {
    private static int a = 0;
    private static int b = 1;
    public final File c;
    public final long d;
    public final File e;
    public final FileChannel f;
    public final RandomAccessFile g;
    public final FileLock h;

    public static class aZD extends File {
        public long a;

        public aZD(File file, String str) {
            super(file, str);
            this.a = -1L;
        }
    }

    public ax(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.c = file;
        this.e = file2;
        this.d = e(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.g = randomAccessFile;
        try {
            try {
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    this.f = channel;
                    try {
                        file3.getPath();
                        this.h = channel.lock();
                        file3.getPath();
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            this.f.close();
                            int i = b + 41;
                            a = i % 128;
                            if (i % 2 == 0) {
                                int i2 = 2 % 2;
                            }
                        } catch (IOException unused) {
                        }
                        throw e;
                    }
                } catch (ClassCastException e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw e3;
                } catch (NumberFormatException e4) {
                } catch (IllegalArgumentException e5) {
                } catch (UnsupportedOperationException e6) {
                }
            } catch (Error e7) {
                e = e7;
                try {
                    this.g.close();
                    int i3 = a;
                    int i4 = (i3 & (-122)) | ((~i3) & 121);
                    int i5 = (i3 & 121) << 1;
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e8) {
                e = e8;
                this.g.close();
                int i9 = a;
                int i10 = (i9 & (-122)) | ((~i9) & 121);
                int i11 = (i9 & 121) << 1;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
                throw e;
            }
        } catch (IOException e9) {
            e = e9;
            this.g.close();
            int i15 = a;
            int i16 = (i15 & (-122)) | ((~i15) & 121);
            int i17 = (i15 & 121) << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i110 = 2 % 2;
            throw e;
        }
    }

    public static long d(File file) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-32)) | ((~i2) & 31)) - (~((i2 & 31) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        long jLastModified = file.lastModified();
        if (jLastModified == -1) {
            int i5 = a;
            int i6 = i5 & 95;
            int i7 = i6 + ((i5 ^ 95) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            jLastModified--;
            int i9 = (i5 & 81) + (i5 | 81);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a + 111;
        b = i11 % 128;
        int i12 = i11 % 2;
        return jLastModified;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0108  */
    /* JADX WARN: Code duplicated, block: B:23:0x0121  */
    /* JADX WARN: Code duplicated, block: B:26:0x012c A[Catch: IOException -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0153, blocks: (B:26:0x012c, B:28:0x0135), top: B:51:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0135 A[Catch: IOException -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0153, blocks: (B:26:0x012c, B:28:0x0135), top: B:51:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x013a  */
    /* JADX WARN: Code duplicated, block: B:35:0x016f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List, java.util.List<? extends java.io.File>] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    public final List<? extends File> g(Context context, String str, boolean z) {
        List<aZD> listH;
        long jD;
        long j;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 39;
        int i7 = -(-((i5 ^ 39) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            this.c.getPath();
            obj.hashCode();
            throw null;
        }
        this.c.getPath();
        FileLock fileLock = this.h;
        int i9 = a;
        int i10 = i9 & 45;
        int i11 = (i10 - (~(-(-((i9 ^ 45) | i10))))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        if (!fileLock.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        int i13 = a;
        int i14 = ((i13 ^ 87) - (~((i13 & 87) << 1))) - 1;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!z) {
            int i15 = (((i13 ^ 61) | (i13 & 61)) << 1) - (((~i13) & 61) | (i13 & (-62)));
            b = i15 % 128;
            int i16 = i15 % 2;
            File file = this.c;
            long j2 = this.d;
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            StringBuilder sb = new StringBuilder();
            int i17 = b;
            int i18 = i17 & 41;
            int i19 = ((i17 ^ 41) | i18) << 1;
            int i20 = -((i17 | 41) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                sb.append((String) str);
                throw null;
            }
            sb.append((String) str);
            sb.append("timestamp");
            String string = sb.toString();
            int i22 = b;
            int i23 = (i22 & 81) + (i22 | 81);
            a = i23 % 128;
            int i24 = i23 % 2;
            if (sharedPreferences.getLong(string, -1L) == d(file)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) str);
                int i25 = b;
                int i26 = i25 & 5;
                int i27 = ((i25 ^ 5) | i26) << 1;
                int i28 = -((i25 | 5) & (~i26));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                int i30 = i29 % 2;
                sb2.append("crc");
                String string2 = sb2.toString();
                int i31 = a;
                int i32 = i31 & 43;
                int i33 = (i31 ^ 43) | i32;
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 61 / 0;
                    if (sharedPreferences.getLong(string2, -1L) == j2) {
                        int i36 = a;
                        int i37 = i36 & 117;
                        i2 = ((((i36 ^ 117) | i37) << 1) - (~(-((i36 | 117) & (~i37))))) - 1;
                        int i38 = i2 % 128;
                        b = i38;
                        if (i2 % 2 == 0) {
                            int i39 = 2 % 5;
                        }
                        i3 = i38 + 105;
                        a = i3 % 128;
                        try {
                            if (i3 % 2 != 0) {
                                context = i(context, str);
                                str = 28 / 0;
                            } else {
                                context = i(context, str);
                                str = str;
                            }
                        } catch (IOException unused) {
                            listH = h();
                            jD = d(this.c);
                            j = this.d;
                            int i40 = a + 84;
                            i = (i40 ^ (-1)) + (i40 << 1);
                            b = i % 128;
                            if (i % 2 == 0) {
                                f(context, str, jD, j, listH);
                                obj.hashCode();
                                throw null;
                            }
                            f(context, str, jD, j, listH);
                            context = listH;
                        }
                    } else {
                        int i41 = b;
                        int i42 = i41 & 117;
                        int i43 = -(-((i41 ^ 117) | i42));
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    listH = h();
                    jD = d(this.c);
                    j = this.d;
                    int i46 = a + 84;
                    i = (i46 ^ (-1)) + (i46 << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        f(context, str, jD, j, listH);
                        obj.hashCode();
                        throw null;
                    }
                    f(context, str, jD, j, listH);
                    context = listH;
                } else {
                    if (sharedPreferences.getLong(string2, -1L) == j2) {
                        int i310 = a;
                        int i311 = i310 & 117;
                        i2 = ((((i310 ^ 117) | i311) << 1) - (~(-((i310 | 117) & (~i311))))) - 1;
                        int i312 = i2 % 128;
                        b = i312;
                        if (i2 % 2 == 0) {
                            int i313 = 2 % 5;
                        }
                        i3 = i312 + 105;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            context = i(context, str);
                            str = 28 / 0;
                        } else {
                            context = i(context, str);
                            str = str;
                        }
                    } else {
                        int i47 = b;
                        int i48 = i47 & 117;
                        int i49 = -(-((i47 ^ 117) | i48));
                        int i410 = ((i48 | i49) << 1) - (i49 ^ i48);
                        a = i410 % 128;
                        int i411 = i410 % 2;
                    }
                    listH = h();
                    jD = d(this.c);
                    j = this.d;
                    int i412 = a + 84;
                    i = (i412 ^ (-1)) + (i412 << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        f(context, str, jD, j, listH);
                        obj.hashCode();
                        throw null;
                    }
                    f(context, str, jD, j, listH);
                    context = listH;
                }
            } else {
                int i413 = b;
                int i414 = i413 & 117;
                int i415 = -(-((i413 ^ 117) | i414));
                int i416 = ((i414 | i415) << 1) - (i415 ^ i414);
                a = i416 % 128;
                int i417 = i416 % 2;
                listH = h();
                jD = d(this.c);
                j = this.d;
                int i418 = a + 84;
                i = (i418 ^ (-1)) + (i418 << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    f(context, str, jD, j, listH);
                    obj.hashCode();
                    throw null;
                }
                f(context, str, jD, j, listH);
                context = listH;
            }
        } else {
            listH = h();
            jD = d(this.c);
            j = this.d;
            int i419 = a + 84;
            i = (i419 ^ (-1)) + (i419 << 1);
            b = i % 128;
            if (i % 2 == 0) {
                f(context, str, jD, j, listH);
                obj.hashCode();
                throw null;
            }
            f(context, str, jD, j, listH);
            context = listH;
        }
        context.size();
        int i50 = b;
        int i51 = i50 & 117;
        int i52 = ((((i50 ^ 117) | i51) << 1) - (~(-((i50 | 117) & (~i51))))) - 1;
        a = i52 % 128;
        if (i52 % 2 == 0) {
            return context;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i3 - (~(-(-((i2 ^ 3) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.h.release();
        this.f.close();
        int i6 = a + 27;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.g.close();
        } else {
            this.g.close();
            int i7 = 64 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e A[Catch: all -> 0x0117, TRY_ENTER, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x000a, B:6:0x0023, B:8:0x003b, B:14:0x006c, B:24:0x009e, B:26:0x00ab, B:25:0x00a5, B:28:0x00c6, B:43:0x0113, B:44:0x0116, B:7:0x0031), top: B:48:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x000a, B:6:0x0023, B:8:0x003b, B:14:0x006c, B:24:0x009e, B:26:0x00ab, B:25:0x00a5, B:28:0x00c6, B:43:0x0113, B:44:0x0116, B:7:0x0031), top: B:48:0x000a }] */
    public static long e(File file) throws IOException {
        int iMin;
        int i;
        int iMin2;
        int i2;
        int i3 = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            az.aZG azgB = az.b(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = azgB.b;
            int i4 = b + 101;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                randomAccessFile.seek(azgB.a);
                iMin = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
                int i5 = 66 / 0;
            } else {
                randomAccessFile.seek(azgB.a);
                iMin = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
            }
            byte[] bArr = new byte[16384];
            int i6 = randomAccessFile.read(bArr, 0, iMin);
            int i7 = a;
            int i8 = (i7 ^ 13) + ((i7 & 13) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            while (i6 != -1) {
                int i9 = b;
                int i10 = i9 | 47;
                int i11 = i10 << 1;
                int i12 = -((~(i9 & 47)) & i10);
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                crc32.update(bArr, 0, i6);
                j -= (long) i6;
                int i15 = b;
                int i16 = i15 & 65;
                int i17 = (i15 ^ 65) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                int i19 = i18 % 128;
                a = i19;
                if (i18 % 2 != 0) {
                    if (j == 0) {
                        break;
                    }
                    i = ((i19 & 6) + (i19 | 6)) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        iMin2 = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
                        i2 = 1;
                    } else {
                        iMin2 = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
                        i2 = 0;
                    }
                    i6 = randomAccessFile.read(bArr, i2, iMin2);
                    int i20 = b;
                    int i21 = (((i20 | 21) << 1) - (~(-(((~i20) & 21) | (i20 & (-22)))))) - 1;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    if (j == 0) {
                        break;
                    }
                    i = ((i19 & 6) + (i19 | 6)) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        iMin2 = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
                        i2 = 1;
                    } else {
                        iMin2 = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
                        i2 = 0;
                    }
                    i6 = randomAccessFile.read(bArr, i2, iMin2);
                    int i23 = b;
                    int i24 = (((i23 | 21) << 1) - (~(-(((~i23) & 21) | (i23 & (-22)))))) - 1;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            int i26 = b;
            int i27 = i26 & 115;
            int i28 = i27 + ((i26 ^ 115) | i27);
            int i29 = i28 % 128;
            a = i29;
            int i30 = i28 % 2;
            if (value == -1) {
                int i31 = (i29 ^ 1) + ((i29 & 1) << 1);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    value--;
                }
                int i32 = ((i29 & 53) - (~(i29 | 53))) - 1;
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 3 / 4;
                }
            }
            int i34 = (i29 & 57) + (i29 | 57);
            b = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 71 / 0;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void f(Context context, String str, long j, long j2, List<aZD> list) {
        String string;
        int size;
        Iterator<aZD> it;
        int i;
        String string2;
        long j3;
        int i2 = 2 % 2;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        StringBuilder sb = new StringBuilder();
        int i3 = b;
        int i4 = i3 & 51;
        int i5 = (i3 | 51) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            sb.append(str);
            sb.append("timestamp");
            throw null;
        }
        sb.append(str);
        sb.append("timestamp");
        editorEdit.putLong(sb.toString(), j);
        editorEdit.putLong(j.u(new StringBuilder(), str, "crc"), j2);
        StringBuilder sb2 = new StringBuilder();
        int i8 = b + 91;
        a = i8 % 128;
        int i9 = i8 % 2;
        sb2.append(str);
        sb2.append("dex.number");
        int i10 = a + 105;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            string = sb2.toString();
            size = list.size();
        } else {
            string = sb2.toString();
            int size2 = list.size();
            int i11 = size2 & 1;
            int i12 = -(-(size2 | 1));
            size = (i12 | i11) + (i11 & i12);
        }
        int i13 = a;
        int i14 = i13 ^ 113;
        int i15 = ((i13 & 113) | i14) << 1;
        int i16 = -i14;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            editorEdit.putInt(string, size);
            it = list.iterator();
            i = 5;
        } else {
            editorEdit.putInt(string, size);
            it = list.iterator();
            i = 2;
        }
        int i18 = a;
        int i19 = i18 & 5;
        int i20 = (i19 - (~(-(-((i18 ^ 5) | i19))))) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((i18 ^ 58) + ((i18 & 58) << 1)) - 1;
        b = i22 % 128;
        int i23 = i22 % 2;
        while (it.hasNext()) {
            aZD next = it.next();
            StringBuilder sb3 = new StringBuilder();
            int i24 = b;
            int i25 = i24 & 97;
            int i26 = (((i24 ^ 97) | i25) << 1) - ((i24 | 97) & (~i25));
            a = i26 % 128;
            int i27 = i26 % 2;
            sb3.append(str);
            sb3.append("dex.crc.");
            int i28 = a;
            int i29 = (-2) - ((((i28 | 60) << 1) - (i28 ^ 60)) ^ (-1));
            b = i29 % 128;
            if (i29 % 2 == 0) {
                sb3.append(i);
                string2 = sb3.toString();
                j3 = next.a;
                int i30 = 60 / 0;
            } else {
                sb3.append(i);
                string2 = sb3.toString();
                j3 = next.a;
            }
            editorEdit.putLong(string2, j3);
            StringBuilder sb4 = new StringBuilder();
            int i31 = a;
            int i32 = i31 & 17;
            int i33 = (i31 ^ 17) | i32;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            b = i34 % 128;
            if (i34 % 2 == 0) {
                sb4.append(str);
                sb4.append("dex.time.");
                throw null;
            }
            sb4.append(str);
            sb4.append("dex.time.");
            sb4.append(i);
            editorEdit.putLong(sb4.toString(), next.lastModified());
            int i35 = b;
            int i36 = i35 + 37;
            a = i36 % 128;
            int i37 = i36 % 2;
            int i38 = i | 105;
            int i39 = ((i38 << 1) - (~(-((~(i & 105)) & i38)))) - 1;
            i = ((i39 & (-103)) + (i39 | (-103))) - 1;
            int i40 = (i35 & (-50)) | ((~i35) & 49);
            int i41 = (i35 & 49) << 1;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            int i43 = i42 % 2;
        }
        editorEdit.commit();
        int i44 = a;
        int i45 = (i44 & (-48)) | ((~i44) & 47);
        int i46 = -(-((i44 & 47) << 1));
        int i47 = (i45 & i46) + (i46 | i45);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            throw null;
        }
    }

    public static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = ((i2 | 103) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        String strR = j.r("tmp-", str);
        int i6 = a + 115;
        b = i6 % 128;
        int i7 = i6 % 2;
        File fileCreateTempFile = File.createTempFile(strR, ".zip", file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                int i8 = b + 117;
                a = i8 % 128;
                int i9 = i8 % 2;
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                int i10 = b;
                int i11 = i10 & 75;
                int i12 = (i10 ^ 75) | i11;
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                byte[] bArr = new byte[16384];
                int i15 = b + 105;
                a = i15 % 128;
                int i16 = i15 % 2;
                for (int i17 = inputStream.read(bArr); i17 != -1; i17 = inputStream.read(bArr)) {
                    int i18 = a + 83;
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        zipOutputStream.write(bArr, 0, i17);
                    } else {
                        zipOutputStream.write(bArr, 0, i17);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to mark readonly \"");
                    sb.append(fileCreateTempFile.getAbsolutePath());
                    sb.append("\" (tmp of \"");
                    sb.append(file.getAbsolutePath());
                    sb.append("\")");
                    IOException iOException = new IOException(sb.toString());
                    int i19 = a;
                    int i20 = i19 & 53;
                    int i21 = i20 + ((i19 ^ 53) | i20);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    throw iOException;
                }
                int i23 = a;
                int i24 = i23 & 113;
                int i25 = i24 + ((i23 ^ 113) | i24);
                b = i25 % 128;
                if (i25 % 2 == 0) {
                    file.getPath();
                    fileCreateTempFile.renameTo(file);
                    throw null;
                }
                file.getPath();
                boolean zRenameTo = fileCreateTempFile.renameTo(file);
                int i26 = b + 47;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                if (zRenameTo) {
                    try {
                        inputStream.close();
                        int i27 = b;
                        int i28 = (i27 & 124) + (i27 | 124);
                        int i29 = (i28 ^ (-1)) + (i28 << 1);
                        a = i29 % 128;
                        int i30 = i29 % 2;
                    } catch (IOException unused) {
                    }
                    fileCreateTempFile.delete();
                    int i31 = b;
                    int i32 = (-2) - (((i31 ^ 30) + ((i31 & 30) << 1)) ^ (-1));
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to rename \"");
                sb2.append(fileCreateTempFile.getAbsolutePath());
                sb2.append("\" to \"");
                sb2.append(file.getAbsolutePath());
                sb2.append("\"");
                IOException iOException2 = new IOException(sb2.toString());
                int i34 = b;
                int i35 = (((i34 | 22) << 1) - (i34 ^ 22)) - 1;
                a = i35 % 128;
                if (i35 % 2 == 0) {
                    throw iOException2;
                }
                throw null;
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01b3 A[PHI: r14
  0x01b3: PHI (r14v21 long) = (r14v19 long), (r14v22 long) binds: [B:35:0x01b1, B:32:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207 A[EDGE_INSN: B:75:0x0207->B:43:0x0207 BREAK  A[LOOP:0: B:9:0x008f->B:42:0x01ff], SYNTHETIC] */
    public final List<aZD> i(Context context, String str) throws IOException {
        aZD azd;
        String string;
        long j;
        long j2;
        long jLastModified;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2 = 2;
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String name = this.c.getName();
        int i4 = a + 115;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            sb.append(name);
            sb.append(".classes");
            int i5 = 37 / 0;
        } else {
            sb.append(name);
            sb.append(".classes");
        }
        String string2 = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        StringBuilder sb2 = new StringBuilder();
        int i6 = a;
        int i7 = (i6 & 34) + (i6 | 34);
        int i8 = 1;
        int i9 = i7 - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            sb2.append(str);
            sb2.append("dex.number");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sb2.append(str);
        sb2.append("dex.number");
        int i10 = sharedPreferences.getInt(sb2.toString(), 1);
        ArrayList arrayList3 = new ArrayList(((i10 ^ (-1)) | i10) + i10);
        int i11 = a;
        int i12 = i11 & 121;
        int i13 = (i11 | 121) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        int i18 = i16 & 49;
        int i19 = -(-((i16 ^ 49) | i18));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 2;
        while (true) {
            if (i22 > i10) {
                ArrayList arrayList4 = arrayList3;
                int i23 = a;
                int i24 = ((i23 | 89) << 1) - (i23 ^ 89);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 59 / 0;
                }
                return arrayList4;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            int i26 = b;
            int i27 = ((i26 ^ 87) | (i26 & 87)) << i8;
            int i28 = -(((~i26) & 87) | (i26 & (-88)));
            int i29 = ((i27 | i28) << i8) - (i28 ^ i27);
            a = i29 % 128;
            if (i29 % i2 != 0) {
                sb3.append(i22);
                sb3.append(".zip");
                int i30 = 45 / 0;
            } else {
                sb3.append(i22);
                sb3.append(".zip");
            }
            azd = new aZD(this.e, sb3.toString());
            int i31 = a;
            int i32 = i31 & 37;
            int i33 = (i31 | 37) & (~i32);
            int i34 = -(-(i32 << i8));
            int i35 = (i33 & i34) + (i33 | i34);
            b = i35 % 128;
            int i36 = i35 % i2;
            if (!azd.isFile()) {
                StringBuilder sbW = j.w("Missing extracted secondary dex file '");
                String path = azd.getPath();
                int i37 = b;
                int i38 = i37 & 121;
                int i39 = (i37 ^ 121) | i38;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                if (i40 % 2 != 0) {
                    sbW.append(path);
                    sbW.append("'");
                    int i41 = 4 / 0;
                } else {
                    sbW.append(path);
                    sbW.append("'");
                }
                throw new IOException(sbW.toString());
            }
            azd.a = e(azd);
            StringBuilder sb4 = new StringBuilder();
            int i42 = a;
            int i43 = (((~i42) & 11) | (i42 & (-12))) + ((i42 & 11) << i8);
            b = i43 % 128;
            if (i43 % i2 == 0) {
                sb4.append(str);
                sb4.append("dex.crc.");
                throw null;
            }
            sb4.append(str);
            sb4.append("dex.crc.");
            int i44 = a + 119;
            b = i44 % 128;
            if (i44 % i2 == 0) {
                sb4.append(i22);
                string = sb4.toString();
                int i45 = 95 / 0;
            } else {
                sb4.append(i22);
                string = sb4.toString();
            }
            String str2 = string2;
            j = sharedPreferences.getLong(string, -1L);
            StringBuilder sb5 = new StringBuilder();
            int i46 = b;
            int i47 = i46 ^ 59;
            int i48 = (59 & i46) << i8;
            int i49 = ((i47 | i48) << i8) - (i47 ^ i48);
            a = i49 % 128;
            if (i49 % 2 != 0) {
                sb5.append(str);
                sb5.append("dex.time.");
                int i50 = 20 / 0;
            } else {
                sb5.append(str);
                sb5.append("dex.time.");
            }
            int i51 = b;
            int i52 = (((75 & (~i51)) | (i51 & (-76))) - (~(-(-((i51 & 75) << i8))))) - i8;
            a = i52 % 128;
            if (i52 % 2 != 0) {
                Object obj2 = null;
                sb5.append(i22);
                sharedPreferences.getLong(sb5.toString(), -1L);
                obj2.hashCode();
                throw null;
            }
            sb5.append(i22);
            j2 = sharedPreferences.getLong(sb5.toString(), -1L);
            int i53 = b;
            int i54 = i53 ^ 75;
            int i55 = (i53 & 75) << i8;
            int i56 = (i54 & i55) + (i55 | i54);
            a = i56 % 128;
            if (i56 % 2 == 0) {
                jLastModified = azd.lastModified();
                if (j2 != jLastModified) {
                    break;
                }
                arrayList = arrayList3;
                if (j == azd.a) {
                    break;
                    break;
                }
                int i57 = b;
                i = (i57 ^ 97) + ((i57 & 97) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    arrayList2 = arrayList;
                    arrayList2.add(azd);
                    int i58 = i22 & 40;
                    int i59 = ((((i22 ^ 40) | i58) << 1) - (~(-((~i58) & (i22 | 40))))) - 1;
                    int i60 = i59 & 79;
                    i22 = i60 + ((i59 ^ 79) | i60);
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(azd);
                    int i61 = i22 & 85;
                    int i62 = i61 + ((i22 ^ 85) | i61);
                    int i63 = i62 & (-84);
                    int i64 = (i62 ^ (-84)) | i63;
                    i22 = ((i63 | i64) << 1) - (i64 ^ i63);
                }
                arrayList3 = arrayList2;
                string2 = str2;
                i2 = 2;
                i8 = 1;
            } else {
                jLastModified = azd.lastModified();
                int i65 = 64 / 0;
                if (j2 != jLastModified) {
                    break;
                }
                arrayList = arrayList3;
                if (j == azd.a) {
                    break;
                }
                int i510 = b;
                i = (i510 ^ 97) + ((i510 & 97) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    arrayList2 = arrayList;
                    arrayList2.add(azd);
                    int i511 = i22 & 40;
                    int i512 = ((((i22 ^ 40) | i511) << 1) - (~(-((~i511) & (i22 | 40))))) - 1;
                    int i66 = i512 & 79;
                    i22 = i66 + ((i512 ^ 79) | i66);
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(azd);
                    int i67 = i22 & 85;
                    int i68 = i67 + ((i22 ^ 85) | i67);
                    int i69 = i68 & (-84);
                    int i610 = (i68 ^ (-84)) | i69;
                    i22 = ((i69 | i610) << 1) - (i610 ^ i69);
                }
                arrayList3 = arrayList2;
                string2 = str2;
                i2 = 2;
                i8 = 1;
            }
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Invalid extracted dex: ");
        int i70 = a + 123;
        b = i70 % 128;
        int i71 = i70 % 2;
        sb6.append(azd);
        sb6.append(" (key \"");
        int i72 = b;
        int i73 = ((i72 & 112) + (i72 | 112)) - 1;
        a = i73 % 128;
        if (i73 % 2 != 0) {
            sb6.append(str);
            sb6.append("\"), expected modification time: ");
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        sb6.append(str);
        sb6.append("\"), expected modification time: ");
        int i74 = a;
        int i75 = i74 & 27;
        int i76 = (((i74 ^ 27) | i75) << 1) - ((i74 | 27) & (~i75));
        b = i76 % 128;
        int i77 = i76 % 2;
        sb6.append(j2);
        sb6.append(", modification time: ");
        sb6.append(jLastModified);
        int i78 = a;
        int i79 = (i78 & 91) + (i78 | 91);
        b = i79 % 128;
        int i80 = i79 % 2;
        sb6.append(", expected crc: ");
        sb6.append(j);
        int i81 = b + 123;
        a = i81 % 128;
        if (i81 % 2 != 0) {
            sb6.append(", file crc: ");
            sb6.append(azd.a);
            int i82 = 16 / 0;
        } else {
            sb6.append(", file crc: ");
            sb6.append(azd.a);
        }
        throw new IOException(sb6.toString());
    }

    public final List<aZD> h() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        File file = this.c;
        int i2 = a;
        int i3 = (i2 | 11) << 1;
        int i4 = -(i2 ^ 11);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        sb.append(file.getName());
        int i7 = b + 25;
        a = i7 % 128;
        int i8 = i7 % 2;
        sb.append(".classes");
        String string = sb.toString();
        File[] fileArrListFiles = this.e.listFiles(new aw(this));
        int i9 = (-2) - ((b + 94) ^ (-1));
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        Object obj = null;
        if (fileArrListFiles == null) {
            int i12 = i10 & 101;
            int i13 = i12 + ((i10 ^ 101) | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            this.e.getPath();
            int i15 = b;
            int i16 = ((i15 & (-96)) | ((~i15) & 95)) + ((i15 & 95) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int length = fileArrListFiles.length;
            int i18 = (i10 & (-108)) | ((~i10) & 107);
            int i19 = (i10 & 107) << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < length) {
                int i23 = a;
                int i24 = i23 & 85;
                int i25 = (((i23 ^ 85) | i24) << 1) - ((i23 | 85) & (~i24));
                b = i25 % 128;
                int i26 = i25 % 2;
                File file2 = fileArrListFiles[i22];
                file2.getPath();
                int i27 = a;
                int i28 = (i27 & 33) + (i27 | 33);
                b = i28 % 128;
                if (i28 % 2 == 0) {
                    file2.length();
                    file2.delete();
                    obj.hashCode();
                    throw null;
                }
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                    int i29 = b;
                    int i30 = i29 & 87;
                    int i31 = (i29 ^ 87) | i30;
                    int i32 = (i30 & i31) + (i31 | i30);
                    a = i32 % 128;
                    int i33 = i32 % 2;
                } else {
                    int i34 = (-2) - ((b + 6) ^ (-1));
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    file2.getPath();
                    int i36 = a;
                    int i37 = (i36 & 91) + (i36 | 91);
                    b = i37 % 128;
                    int i38 = i37 % 2;
                }
                int i39 = ((i22 ^ (-120)) + ((i22 & (-120)) << 1)) - 1;
                i22 = ((i39 & 122) - (~(-(-(i39 | 122))))) - 1;
                int i40 = a;
                int i41 = i40 & 71;
                int i42 = (i41 - (~((i40 ^ 71) | i41))) - 1;
                b = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.c);
        int i44 = b;
        int i45 = (((i44 | 114) << 1) - (i44 ^ 114)) - 1;
        a = i45 % 128;
        int i46 = i45 % 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i47 = b;
            int i48 = ((i47 & 96) + (i47 | 96)) - 1;
            a = i48 % 128;
            int i49 = i48 % 2;
            int i50 = 2;
            while (entry != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                int i51 = a + 78;
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                b = i52 % 128;
                int i53 = i52 % 2;
                sb2.append(i50);
                sb2.append(".zip");
                aZD azd = new aZD(this.e, sb2.toString());
                int i54 = a;
                int i55 = (i54 & (-20)) | ((~i54) & 19);
                int i56 = (i54 & 19) << 1;
                int i57 = (i55 & i56) + (i56 | i55);
                b = i57 % 128;
                int i58 = i57 % 2;
                arrayList.add(azd);
                int i59 = b + 21;
                a = i59 % 128;
                int i60 = i59 % 2;
                int i61 = 0;
                boolean z = false;
                while (i61 < 3) {
                    int i62 = b;
                    int i63 = ((i62 ^ 97) | (i62 & 97)) << 1;
                    int i64 = -((i62 & (-98)) | ((~i62) & 97));
                    int i65 = (i63 & i64) + (i64 | i63);
                    int i66 = i65 % 128;
                    a = i66;
                    int i67 = i65 % 2;
                    if (!(!z)) {
                        break;
                    }
                    int i68 = (i66 | 83) << 1;
                    int i69 = -((i66 & (-84)) | (83 & (~i66)));
                    int i70 = (i68 & i69) + (i68 | i69);
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    i61++;
                    c(zipFile, entry, azd, string);
                    int i72 = a;
                    int i73 = i72 & 25;
                    int i74 = (((i72 | 25) & (~i73)) - (~(i73 << 1))) - 1;
                    b = i74 % 128;
                    int i75 = i74 % 2;
                    try {
                        azd.a = e(azd);
                        int i76 = b;
                        int i77 = i76 & 89;
                        int i78 = -(-((i76 ^ 89) | i77));
                        int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                        a = i79 % 128;
                        int i80 = i79 % 2;
                        z = true;
                    } catch (IOException unused) {
                        azd.getAbsolutePath();
                        z = false;
                    }
                    azd.getAbsolutePath();
                    azd.length();
                    int i81 = a;
                    int i82 = ((67 & (~i81)) | (i81 & (-68))) + ((i81 & 67) << 1);
                    int i83 = i82 % 128;
                    b = i83;
                    int i84 = i82 % 2;
                    if (!z) {
                        int i85 = ((i83 | 65) << 1) - (i83 ^ 65);
                        a = i85 % 128;
                        if (i85 % 2 != 0) {
                            azd.delete();
                            throw null;
                        }
                        azd.delete();
                        if (azd.exists()) {
                            int i86 = a + 49;
                            b = i86 % 128;
                            if (i86 % 2 == 0) {
                                azd.getPath();
                                int i87 = 37 / 0;
                            } else {
                                azd.getPath();
                            }
                            int i88 = a;
                            int i89 = i88 + 45;
                            b = i89 % 128;
                            if (i89 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i90 = i88 & 9;
                            int i91 = i90 + ((i88 ^ 9) | i90);
                            b = i91 % 128;
                            int i92 = i91 % 2;
                        } else {
                            continue;
                        }
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not create zip file ");
                    sb3.append(azd.getAbsolutePath());
                    sb3.append(" for secondary dex (");
                    sb3.append(i50);
                    sb3.append(")");
                    IOException iOException = new IOException(sb3.toString());
                    int i93 = b;
                    int i94 = (((i93 | 37) << 1) - (~(-(i93 ^ 37)))) - 1;
                    a = i94 % 128;
                    int i95 = i94 % 2;
                    throw iOException;
                }
                i50++;
                StringBuilder sb4 = new StringBuilder();
                int i96 = b;
                int i97 = ((((i96 ^ 51) | (i96 & 51)) << 1) - (~(-(((~i96) & 51) | (i96 & (-52)))))) - 1;
                a = i97 % 128;
                int i98 = i97 % 2;
                sb4.append("classes");
                int i99 = a;
                int i100 = i99 & 11;
                int i101 = i99 | 11;
                int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                b = i102 % 128;
                if (i102 % 2 == 0) {
                    sb4.append(i50);
                    sb4.append(".dex");
                    obj.hashCode();
                    throw null;
                }
                sb4.append(i50);
                sb4.append(".dex");
                int i103 = a;
                int i104 = ((i103 | 73) << 1) - (i103 ^ 73);
                b = i104 % 128;
                int i105 = i104 % 2;
                entry = zipFile.getEntry(sb4.toString());
                int i106 = b;
                int i107 = (-2) - ((i106 + 94) ^ (-1));
                a = i107 % 128;
                int i108 = i107 % 2;
                int i109 = (i106 & 31) + (i106 | 31);
                a = i109 % 128;
                int i110 = i109 % 2;
            }
            try {
                zipFile.close();
                int i111 = a;
                int i112 = (i111 & (-78)) | ((~i111) & 77);
                int i113 = -(-((i111 & 77) << 1));
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                b = i114 % 128;
                int i115 = i114 % 2;
            } catch (IOException unused2) {
            }
            int i116 = b;
            int i117 = i116 & 107;
            int i118 = (i116 ^ 107) | i117;
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            a = i119 % 128;
            int i120 = i119 % 2;
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
