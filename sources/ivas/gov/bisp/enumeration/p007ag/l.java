package ivas.gov.bisp.enumeration.p007ag;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private static int a = 1;
    private static int b;

    public static File d(Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            context.getCacheDir();
            throw null;
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            int i4 = a;
            int i5 = i4 ^ 3;
            int i6 = -(-((i4 & 3) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = (i8 & 75) + (i8 | 75);
            a = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        StringBuilder sbW = j.w(".font");
        sbW.append(Process.myPid());
        int i12 = a;
        int i13 = ((i12 & 79) - (~(-(-(i12 | 79))))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            sbW.append("-");
            sbW.append(Process.myTid());
            throw null;
        }
        sbW.append("-");
        sbW.append(Process.myTid());
        sbW.append("-");
        String string = sbW.toString();
        int i14 = b;
        int i15 = (i14 & (-32)) | ((~i14) & 31);
        int i16 = -(-((i14 & 31) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < 100) {
            File file = new File(cacheDir, j.o(string, i19));
            int i20 = b + 47;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                file.createNewFile();
                throw null;
            }
            try {
                if (!(!file.createNewFile())) {
                    int i21 = a;
                    int i22 = ((i21 ^ 67) | (i21 & 67)) << 1;
                    int i23 = -(((~i21) & 67) | (i21 & (-68)));
                    int i24 = (i22 & i23) + (i23 | i22);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    return file;
                }
                i19 = ((i19 & 1) << 1) + (i19 ^ 1);
                int i26 = a;
                int i27 = (((i26 & (-66)) | ((~i26) & 65)) - (~(-(-((i26 & 65) << 1))))) - 1;
                b = i27 % 128;
                int i28 = i27 % 2;
            } catch (IOException unused) {
                continue;
            }
            continue;
            i19 = ((i19 & 1) << 1) + (i19 ^ 1);
            int i29 = a;
            int i210 = (((i29 & (-66)) | ((~i29) & 65)) - (~(-(-((i29 & 65) << 1))))) - 1;
            b = i210 % 128;
            int i211 = i210 % 2;
        }
        int i30 = a + 118;
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[Catch: IOException -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x006b, blocks: (B:25:0x0062, B:26:0x0065, B:29:0x0068), top: B:42:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[Catch: IOException -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x006b, blocks: (B:25:0x0062, B:26:0x0065, B:29:0x0068), top: B:42:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0028 A[EXC_TOP_SPLITTER, PHI: r4 r5
  0x0028: PHI (r4v6 boolean) = (r4v5 boolean), (r4v9 boolean) binds: [B:11:0x0026, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r5v5 java.io.InputStream) = (r5v18 java.io.InputStream), (r5v19 java.io.InputStream) binds: [B:11:0x0026, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static boolean b(File file, Resources resources, int i) throws Throwable {
        int i2;
        boolean zC;
        InputStream inputStream;
        int i3 = 2 % 2;
        int i4 = b + 111;
        a = i4 % 128;
        try {
            try {
                if (i4 % 2 == 0) {
                    InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                    zC = c(file, inputStreamOpenRawResource);
                    int i5 = 15 / 0;
                    resources = inputStreamOpenRawResource;
                    inputStream = inputStreamOpenRawResource;
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStream.close();
                            int i6 = b + 93;
                            a = i6 % 128;
                            resources = i6 % 2;
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    InputStream inputStreamOpenRawResource2 = resources.openRawResource(i);
                    zC = c(file, inputStreamOpenRawResource2);
                    resources = inputStreamOpenRawResource2;
                    inputStream = inputStreamOpenRawResource2;
                    if (inputStreamOpenRawResource2 != null) {
                        inputStream.close();
                        int i7 = b + 93;
                        a = i7 % 128;
                        resources = i7 % 2;
                    }
                }
                int i8 = a;
                int i9 = (i8 ^ 45) + ((i8 & 45) << 1);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return zC;
                }
                throw null;
            } catch (Throwable th) {
                th = th;
                resources = 0;
                if (resources != 0) {
                    int i10 = a;
                    int i11 = i10 & 83;
                    int i12 = -(-((i10 ^ 83) | i11));
                    i2 = ((i11 | i12) << 1) - (i12 ^ i11);
                    b = i2 % 128;
                    try {
                        if (i2 % 2 != 0) {
                            resources.close();
                            throw null;
                        }
                        resources.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (resources != 0) {
                int i13 = a;
                int i14 = i13 & 83;
                int i15 = -(-((i13 ^ 83) | i14));
                i2 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    resources.close();
                    throw null;
                }
                resources.close();
            }
            throw th;
        }
    }

    public static boolean c(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            fileOutputStream = new FileOutputStream(file, false);
            int i2 = a;
            int i3 = (((i2 | 114) << 1) - (i2 ^ 114)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            try {
                try {
                    byte[] bArr = new byte[1024];
                    int i6 = (-2) - (((i4 & 40) + (i4 | 40)) ^ (-1));
                    a = i6 % 128;
                    while (true) {
                        int i7 = i6 % 2;
                        int i8 = inputStream.read(bArr);
                        if (i8 != -1) {
                            int i9 = a;
                            int i10 = i9 & 25;
                            int i11 = (((i9 | 25) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            fileOutputStream.write(bArr, 0, i8);
                            i6 = a + 111;
                            b = i6 % 128;
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream.close();
                    int i13 = a;
                    int i14 = (i13 & 91) + (i13 | 91);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    int i16 = b;
                    int i17 = (i16 ^ 119) + ((i16 & 119) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    return true;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        int i19 = b;
                        int i20 = ((i19 | 28) << 1) - (i19 ^ 28);
                        int i21 = (i20 ^ (-1)) + (i20 << 1);
                        a = i21 % 128;
                        try {
                            if (i21 % 2 == 0) {
                                fileOutputStream.close();
                                throw null;
                            }
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                StringBuilder sb = new StringBuilder();
                int i22 = a;
                int i23 = ((i22 ^ 113) | (i22 & 113)) << 1;
                int i24 = -(((~i22) & 113) | (i22 & (-114)));
                int i25 = (i23 & i24) + (i24 | i23);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    throw null;
                }
                sb.append("Error copying resource contents to temp file: ");
                sb.append(e.getMessage());
                Log.e("TypefaceCompatUtil", sb.toString());
                if (fileOutputStream != null) {
                    int i26 = b;
                    int i27 = ((i26 ^ 93) - (~((i26 & 93) << 1))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    try {
                        fileOutputStream.close();
                        int i29 = b;
                        int i30 = i29 ^ 1;
                        int i31 = ((i29 & 1) | i30) << 1;
                        int i32 = -i30;
                        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    } catch (IOException unused3) {
                    }
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                int i35 = b;
                int i36 = i35 & 39;
                int i37 = (((i35 | 39) & (~i36)) - (~(i36 << 1))) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static ByteBuffer e(Context context, CancellationSignal cancellationSignal, Uri uri) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 19) + (i2 | 19);
        a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
                throw null;
            }
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        int i4 = b;
                        int i5 = i4 & 45;
                        int i6 = (i4 ^ 45) | i5;
                        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                        a = i7 % 128;
                        int i8 = i7 % 2;
                        parcelFileDescriptorOpenFileDescriptor.close();
                        int i9 = a;
                        int i10 = (i9 | 67) << 1;
                        int i11 = -(((~i9) & 67) | (i9 & (-68)));
                        int i12 = (i10 & i11) + (i11 | i10);
                        b = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    int i14 = a;
                    int i15 = ((i14 ^ 25) | (i14 & 25)) << 1;
                    int i16 = -(((~i14) & 25) | (i14 & (-26)));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileChannel channel = fileInputStream.getChannel();
                        int i18 = a;
                        int i19 = (i18 & 75) + (i18 | 75);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        int i21 = b;
                        int i22 = i21 & 47;
                        int i23 = (i21 | 47) & (~i22);
                        int i24 = i22 << 1;
                        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        int i27 = b;
                        int i28 = ((i27 | 73) << 1) - (i27 ^ 73);
                        a = i28 % 128;
                        if (i28 % 2 == 0) {
                            int i29 = 18 / 0;
                        }
                        return map;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
