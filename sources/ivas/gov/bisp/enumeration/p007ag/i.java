package ivas.gov.bisp.enumeration.p007ag;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i extends u {
    private static int a = 0;
    private static int b = 1;
    public static Class<?> d;
    public static Constructor<?> e;
    public static Method f;
    public static boolean g;
    public static Method h;

    public static boolean h(Object obj, String str, int i, boolean z) {
        Boolean boolValueOf;
        char c;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 97;
        int i5 = -(-(i3 | 97));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        i();
        try {
            try {
                Method method = f;
                Object[] objArr = new Object[3];
                int i8 = a;
                int i9 = i8 ^ 7;
                int i10 = ((((i8 & 7) | i9) << 1) - (~(-i9))) - 1;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    objArr[0] = str;
                    objArr[0] = Integer.valueOf(i);
                    boolValueOf = Boolean.valueOf(z);
                    c = 5;
                } else {
                    objArr[0] = str;
                    objArr[1] = Integer.valueOf(i);
                    boolValueOf = Boolean.valueOf(z);
                    c = 2;
                }
                int i11 = a;
                int i12 = i11 & 93;
                int i13 = -(-(i11 | 93));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                objArr[c] = boolValueOf;
                boolean zBooleanValue = ((Boolean) method.invoke(obj, objArr)).booleanValue();
                int i16 = b;
                int i17 = i16 & 101;
                int i18 = i17 + ((i16 ^ 101) | i17);
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i19 = i16 ^ 111;
                int i20 = ((i16 & 111) | i19) << 1;
                int i21 = -i19;
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                a = i22 % 128;
                int i23 = i22 % 2;
                return zBooleanValue;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c5 A[Catch: all -> 0x0151, RuntimeException -> 0x0156, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RuntimeException -> 0x0156, all -> 0x0151, blocks: (B:15:0x0082, B:21:0x00c5, B:23:0x00dc), top: B:60:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x003d A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface c(Context context, M.aUO auo, Resources resources, int i) {
        boolean zB;
        int i2;
        int i3;
        boolean zH;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a + 39;
        b = i7 % 128;
        int i8 = i7 % 2;
        i();
        try {
            Object objNewInstance = e.newInstance(new Object[0]);
            int i9 = b;
            int i10 = (((i9 | 26) << 1) - (i9 ^ 26)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            M.aUP[] aupArr = auo.a;
            int length = aupArr.length;
            int i12 = a;
            int i13 = i12 ^ 11;
            int i14 = (i12 & 11) << 1;
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 0;
            while (true) {
                Object obj = null;
                if (i17 >= length) {
                    i();
                    try {
                        Object objNewInstance2 = Array.newInstance(d, 1);
                        int i18 = a;
                        int i19 = (-2) - (((i18 & 30) + (i18 | 30)) ^ (-1));
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        Array.set(objNewInstance2, 0, objNewInstance);
                        Method method = h;
                        Object[] objArr = new Object[1];
                        int i21 = a;
                        int i22 = (i21 ^ 29) + ((i21 & 29) << 1);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            objArr[0] = objNewInstance2;
                            return (Typeface) method.invoke(null, objArr);
                        }
                        objArr[0] = objNewInstance2;
                        int i23 = 0 / 0;
                        return (Typeface) method.invoke(null, objArr);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                int i24 = b + 113;
                a = i24 % 128;
                int i25 = i24 % 2;
                M.aUP aup = aupArr[i17];
                File fileD = l.d(context);
                int i26 = a;
                int i27 = i26 + 87;
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 81 / 0;
                    if (fileD == null) {
                        int i29 = i26 ^ 105;
                        int i30 = (i26 & 105) << 1;
                        int i31 = (i29 & i30) + (i29 | i30);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = i26 ^ 19;
                        int i34 = ((i26 & 19) | i33) << 1;
                        int i35 = -i33;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        return null;
                    }
                    try {
                        zB = l.b(fileD, resources, aup.e);
                        i2 = a;
                        int i38 = i2 & 23;
                        int i39 = -(-((i2 ^ 23) | i38));
                        i3 = ((i38 | i39) << 1) - (i38 ^ i39);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (!zB) {
                            int i40 = ((((i2 ^ 91) | (i2 & 91)) << 1) - (~(-((i2 & (-92)) | ((~i2) & 91))))) - 1;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                            fileD.delete();
                            int i42 = b + 61;
                            a = i42 % 128;
                            int i43 = i42 % 2;
                            return null;
                        }
                        String path = fileD.getPath();
                        int i44 = aup.b;
                        int i45 = a;
                        int i46 = i45 & 87;
                        int i47 = (i45 ^ 87) | i46;
                        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        zH = h(objNewInstance, path, i44, aup.c);
                        i4 = b;
                        int i50 = i4 + 102;
                        int i51 = (i50 ^ (-1)) + (i50 << 1);
                        a = i51 % 128;
                        int i52 = i51 % 2;
                        if (!zH) {
                            int i53 = i4 & 33;
                            int i54 = (~i53) & (i4 | 33);
                            int i55 = -(-(i53 << 1));
                            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                            a = i56 % 128;
                            int i57 = i56 % 2;
                            fileD.delete();
                            int i58 = b;
                            int i59 = (i58 & (-56)) | ((~i58) & 55);
                            int i60 = -(-((i58 & 55) << 1));
                            int i61 = (i59 & i60) + (i60 | i59);
                            a = i61 % 128;
                            int i62 = i61 % 2;
                            return null;
                        }
                        fileD.delete();
                        int i63 = ((i17 ^ 53) | (i17 & 53)) << 1;
                        int i64 = -(((~i17) & 53) | (i17 & (-54)));
                        int i65 = (i63 & i64) + (i64 | i63);
                        i17 = ((i65 | (-52)) << 1) - (i65 ^ (-52));
                        int i66 = a;
                        i5 = ((i66 | 93) << 1) - (i66 ^ 93);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i67 = 4 % 3;
                        }
                    } catch (RuntimeException unused) {
                        fileD.delete();
                        return null;
                    } catch (Throwable th) {
                        fileD.delete();
                        throw th;
                    }
                } else {
                    if (fileD == null) {
                        int i210 = i26 ^ 105;
                        int i310 = (i26 & 105) << 1;
                        int i311 = (i210 & i310) + (i210 | i310);
                        b = i311 % 128;
                        int i312 = i311 % 2;
                        int i313 = i26 ^ 19;
                        int i314 = ((i26 & 19) | i313) << 1;
                        int i315 = -i313;
                        int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                        b = i316 % 128;
                        int i317 = i316 % 2;
                        return null;
                    }
                    zB = l.b(fileD, resources, aup.e);
                    i2 = a;
                    int i318 = i2 & 23;
                    int i319 = -(-((i2 ^ 23) | i318));
                    i3 = ((i318 | i319) << 1) - (i318 ^ i319);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (!zB) {
                        int i410 = ((((i2 ^ 91) | (i2 & 91)) << 1) - (~(-((i2 & (-92)) | ((~i2) & 91))))) - 1;
                        b = i410 % 128;
                        int i411 = i410 % 2;
                        fileD.delete();
                        int i412 = b + 61;
                        a = i412 % 128;
                        int i413 = i412 % 2;
                        return null;
                    }
                    String path2 = fileD.getPath();
                    int i414 = aup.b;
                    int i415 = a;
                    int i416 = i415 & 87;
                    int i417 = (i415 ^ 87) | i416;
                    int i418 = (i416 ^ i417) + ((i417 & i416) << 1);
                    b = i418 % 128;
                    int i419 = i418 % 2;
                    zH = h(objNewInstance, path2, i414, aup.c);
                    i4 = b;
                    int i510 = i4 + 102;
                    int i511 = (i510 ^ (-1)) + (i510 << 1);
                    a = i511 % 128;
                    int i512 = i511 % 2;
                    if (!zH) {
                        int i513 = i4 & 33;
                        int i514 = (~i513) & (i4 | 33);
                        int i515 = -(-(i513 << 1));
                        int i516 = (i514 ^ i515) + ((i515 & i514) << 1);
                        a = i516 % 128;
                        int i517 = i516 % 2;
                        fileD.delete();
                        int i518 = b;
                        int i519 = (i518 & (-56)) | ((~i518) & 55);
                        int i68 = -(-((i518 & 55) << 1));
                        int i69 = (i519 & i68) + (i68 | i519);
                        a = i69 % 128;
                        int i610 = i69 % 2;
                        return null;
                    }
                    fileD.delete();
                    int i611 = ((i17 ^ 53) | (i17 & 53)) << 1;
                    int i612 = -(((~i17) & 53) | (i17 & (-54)));
                    int i613 = (i611 & i612) + (i612 | i611);
                    i17 = ((i613 | (-52)) << 1) - (i613 ^ (-52));
                    int i614 = a;
                    i5 = ((i614 | 93) << 1) - (i614 ^ 93);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i615 = 4 % 3;
                    }
                }
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[Catch: IOException -> 0x01fd, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x01fd, blocks: (B:10:0x0049, B:18:0x006e, B:49:0x016b, B:62:0x01b8, B:75:0x01f3, B:74:0x01f0, B:76:0x01f4, B:24:0x0095, B:27:0x00ad, B:30:0x00d3, B:35:0x00f0, B:45:0x014c, B:48:0x0167, B:55:0x0183, B:56:0x0186, B:57:0x0187, B:60:0x01a2, B:70:0x01dc, B:69:0x01d9, B:33:0x00e4, B:37:0x010f, B:38:0x0120, B:59:0x019e, B:66:0x01d4, B:71:0x01dd), top: B:86:0x0047, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    @Override // ivas.gov.bisp.enumeration.p007ag.u
    public Typeface d(Context context, CancellationSignal cancellationSignal, N[] nArr, int i) {
        File file;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 93) | (i3 & 93)) << 1) - ((i3 & (-94)) | ((~i3) & 93));
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (nArr.length <= 0) {
            int i6 = i3 ^ 13;
            int i7 = ((((i3 & 13) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 55 / 0;
            }
            return null;
        }
        N nG = g(nArr, i);
        ContentResolver contentResolver = context.getContentResolver();
        int i9 = a + 89;
        b = i9 % 128;
        try {
            if (i9 % 2 == 0) {
                contentResolver.openFileDescriptor(nG.a, "r", cancellationSignal);
                obj.hashCode();
                throw null;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(nG.a, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                int i10 = a;
                int i11 = i10 & 113;
                int i12 = -(-((i10 ^ 113) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 28 / 0;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        int i15 = b;
                        int i16 = i15 & 47;
                        int i17 = (i15 ^ 47) | i16;
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                    }
                } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int i110 = b;
                    int i111 = i110 & 47;
                    int i112 = (i110 ^ 47) | i111;
                    int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                    a = i113 % 128;
                    int i114 = i113 % 2;
                }
                int i20 = a;
                int i21 = ((i20 | 123) << 1) - (i20 ^ 123);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("/proc/self/fd/");
                    int i22 = b;
                    int i23 = (i22 & 23) + (i22 | 23);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        sb.append(parcelFileDescriptorOpenFileDescriptor.getFd());
                        Os.readlink(sb.toString());
                        obj.hashCode();
                        throw null;
                    }
                    sb.append(parcelFileDescriptorOpenFileDescriptor.getFd());
                    String str = Os.readlink(sb.toString());
                    int i24 = a;
                    int i25 = i24 ^ 91;
                    int i26 = ((i24 & 91) | i25) << 1;
                    int i27 = -i25;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    b = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 37 / 0;
                        if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                            file = new File(str);
                            int i30 = a;
                            int i31 = (i30 & (-20)) | ((~i30) & 19);
                            int i32 = -(-((i30 & 19) << 1));
                            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                            b = i33 % 128;
                            int i34 = i33 % 2;
                        } else {
                            int i35 = a;
                            int i36 = i35 ^ 109;
                            int i37 = (i35 & 109) << 1;
                            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                            b = i38 % 128;
                            int i39 = i38 % 2;
                            file = null;
                        }
                    } else if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                        file = new File(str);
                        int i310 = a;
                        int i311 = (i310 & (-20)) | ((~i310) & 19);
                        int i312 = -(-((i310 & 19) << 1));
                        int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                        b = i313 % 128;
                        int i314 = i313 % 2;
                    } else {
                        int i315 = a;
                        int i316 = i315 ^ 109;
                        int i317 = (i315 & 109) << 1;
                        int i318 = (i316 ^ i317) + ((i317 & i316) << 1);
                        b = i318 % 128;
                        int i319 = i318 % 2;
                        file = null;
                    }
                    if (file != null) {
                        int i40 = a;
                        int i41 = (((i40 | 64) << 1) - (i40 ^ 64)) - 1;
                        b = i41 % 128;
                        if (i41 % 2 == 0) {
                            file.canRead();
                            throw null;
                        }
                        if (file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            int i42 = b + 86;
                            int i43 = (i42 ^ (-1)) + (i42 << 1);
                            a = i43 % 128;
                            if (i43 % 2 == 0) {
                                return typefaceCreateFromFile;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i44 = b;
                        int i45 = i44 | 13;
                        int i46 = ((i45 << 1) - (~(-((~(i44 & 13)) & i45)))) - 1;
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    int i48 = a;
                    int i49 = (i48 ^ 101) + ((i48 & 101) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    try {
                        Typeface typefaceE = e(context, fileInputStream);
                        fileInputStream.close();
                        int i51 = a;
                        int i52 = i51 & 3;
                        int i53 = (((i51 ^ 3) | i52) << 1) - ((i51 | 3) & (~i52));
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        parcelFileDescriptorOpenFileDescriptor.close();
                        int i55 = b;
                        int i56 = i55 & 97;
                        int i57 = ((i55 ^ 97) | i56) << 1;
                        int i58 = -((i55 | 97) & (~i56));
                        int i59 = (i57 & i58) + (i58 | i57);
                        a = i59 % 128;
                        int i60 = i59 % 2;
                        return typefaceE;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ErrnoException unused) {
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int i61 = a;
                    int i62 = ((i61 | 67) << 1) - (i61 ^ 67);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public static void i() {
        Method method;
        Class<?> cls;
        Constructor<?> constructor;
        Method method2;
        int i = 2 % 2;
        int i2 = a + 15;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (g) {
            int i4 = i3 & 117;
            int i5 = ((((i3 ^ 117) | i4) << 1) - (~(-((i3 | 117) & (~i4))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        g = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Class<?>[] clsArr = new Class[0];
            int i7 = a;
            int i8 = (((i7 | 112) << 1) - (i7 ^ 112)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            constructor = cls.getConstructor(clsArr);
            Class<?>[] clsArr2 = new Class[3];
            clsArr2[0] = String.class;
            int i10 = b;
            int i11 = (i10 | 37) << 1;
            int i12 = -(i10 ^ 37);
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            clsArr2[1] = Integer.TYPE;
            clsArr2[2] = Boolean.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", clsArr2);
            int i15 = b + 57;
            a = i15 % 128;
            int i16 = i15 % 2;
            Object objNewInstance = Array.newInstance(cls, 1);
            Class[] clsArr3 = new Class[1];
            int i17 = a;
            int i18 = i17 & 41;
            int i19 = ((i17 | 41) & (~i18)) + (i18 << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                clsArr3[0] = objNewInstance.getClass();
                Typeface.class.getMethod("createFromFamiliesWithDefault", clsArr3);
                throw null;
            }
            clsArr3[0] = objNewInstance.getClass();
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", clsArr3);
            int i20 = b;
            int i21 = i20 & 69;
            int i22 = (((i20 ^ 69) | i21) << 1) - ((i20 | 69) & (~i21));
            a = i22 % 128;
            int i23 = i22 % 2;
            e = constructor;
            d = cls;
            f = method2;
            int i24 = b;
            int i25 = i24 & 63;
            int i26 = i24 | 63;
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                h = method;
            } else {
                h = method;
                throw null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            int i28 = a;
            int i29 = (i28 & (-72)) | ((~i28) & 71);
            int i30 = (i28 & 71) << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 6 / 0;
            }
            method = null;
            cls = null;
            constructor = null;
            method2 = null;
        }
    }
}
