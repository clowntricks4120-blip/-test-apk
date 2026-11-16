package ivas.gov.bisp.enumeration.p018ar;

import android.content.Context;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ay {
    private static int a = 1;
    private static int b;
    public static final Set<File> c = new HashSet();
    public static final boolean d;

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r2 > 0) goto L36;
     */
    static {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p018ar.ay.<clinit>():void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:8:0x000e, B:10:0x001a, B:13:0x0022, B:19:0x0031, B:20:0x0038, B:23:0x004a, B:32:0x006b, B:38:0x0074, B:41:0x0077, B:42:0x007a, B:22:0x003c, B:25:0x0058, B:26:0x005c, B:31:0x0064, B:39:0x0075), top: B:58:0x0003, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void d(Context context, File file, File file2, String str, String str2, boolean z) {
        File file3;
        File file4;
        ax axVar;
        Set<File> set = c;
        synchronized (set) {
            if (((HashSet) set).contains(file)) {
                return;
            }
            ((HashSet) set).add(file);
            System.getProperty("java.vm.version");
            IOException e = null;
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader instanceof BaseDexClassLoader) {
                    if (classLoader == null) {
                        return;
                    }
                    c(context);
                    file3 = new File(file2, "code_cache");
                    h(file3);
                    file4 = new File(file3, str);
                    h(file4);
                    axVar = new ax(file, file4);
                    f(classLoader, file4, axVar.g(context, str2, false));
                    axVar.close();
                    if (e == null) {
                        throw e;
                    }
                    return;
                }
                Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                classLoader = null;
                if (classLoader == null) {
                    return;
                }
                try {
                    c(context);
                } catch (Throwable unused) {
                }
                file3 = new File(file2, "code_cache");
                try {
                    h(file3);
                } catch (IOException unused2) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    h(file3);
                }
                file4 = new File(file3, str);
                h(file4);
                axVar = new ax(file, file4);
                try {
                    try {
                        f(classLoader, file4, axVar.g(context, str2, false));
                    } catch (IOException e2) {
                        if (!z) {
                            throw e2;
                        }
                        f(classLoader, file4, axVar.g(context, str2, true));
                    }
                    try {
                        axVar.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e == null) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        axVar.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            } catch (RuntimeException unused4) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r3 = r9.getApplicationInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r5 = r4 & 33;
        r4 = (r4 | 33) & (~r5);
        r5 = r5 << 1;
        r6 = ((r4 | r5) << 1) - (r4 ^ r5);
        ivas.gov.bisp.enumeration.p018ar.ay.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r4 = 5 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        android.util.Log.e("MultiDex", "MultiDex installation failure", r9);
        r2 = ivas.gov.bisp.enumeration.p091n.j.w("MultiDex installation failed (");
        r3 = ivas.gov.bisp.enumeration.p018ar.ay.a;
        r4 = (r3 & (-56)) | ((~r3) & 55);
        r3 = (r3 & 55) << 1;
        r5 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p018ar.ay.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if ((r5 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        r2.append(r9.getMessage());
        r2.append(").");
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r2.append(r9.getMessage());
        r2.append(").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        throw new java.lang.RuntimeException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r9 = r1 | 59;
        r2 = ((r9 << 1) - (~(-(r9 & (~(r1 & 59)))))) - 1;
        ivas.gov.bisp.enumeration.p018ar.ay.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p018ar.ay.g(android.content.Context):void");
    }

    public static void b(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldE;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = (i2 & 75) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            fieldE = e(obj, str);
            objArr2 = (Object[]) fieldE.get(obj);
            int i6 = 46 / 0;
        } else {
            fieldE = e(obj, str);
            objArr2 = (Object[]) fieldE.get(obj);
        }
        int i7 = a;
        int i8 = i7 & 21;
        int i9 = ((i7 ^ 21) | i8) << 1;
        int i10 = -((i7 | 21) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            objArr2.getClass().getComponentType();
            int length = objArr2.length;
            throw null;
        }
        Class<?> componentType = objArr2.getClass().getComponentType();
        int length2 = objArr2.length;
        int i12 = -(-objArr.length);
        Object objNewInstance = Array.newInstance(componentType, ((((length2 ^ i12) | (length2 & i12)) << 1) - (~(-(((~length2) & i12) | ((~i12) & length2))))) - 1);
        int i13 = b + 15;
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        Object[] objArr3 = (Object[]) objNewInstance;
        int length3 = objArr2.length;
        int i16 = (i14 & (-14)) | ((~i14) & 13);
        int i17 = -(-((i14 & 13) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        System.arraycopy(objArr2, 0, objArr3, 0, length3);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        int i20 = b + 101;
        a = i20 % 128;
        int i21 = i20 % 2;
        fieldE.set(obj, objArr3);
        int i22 = b;
        int i23 = i22 & 41;
        int i24 = (i22 | 41) & (~i23);
        int i25 = -(-(i23 << 1));
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        a = i26 % 128;
        int i27 = i26 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r2 = r1 ^ 79;
        r1 = ((r1 & 79) | r2) << 1;
        r2 = -r2;
        r4 = (r1 & r2) + (r1 | r2);
        ivas.gov.bisp.enumeration.p018ar.ay.a = r4 % 128;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if ((r4 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r2 = r10.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r7 = r2 & 47;
        r6 = ((r2 ^ 47) | r7) << 1;
        r2 = -((r2 | 47) & (~r7));
        r7 = (r6 & r2) + (r2 | r6);
        ivas.gov.bisp.enumeration.p018ar.ay.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if ((r7 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create dir ");
        r5 = r10.getPath();
        r6 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create dir ");
        r5 = r10.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r2.append(r5);
        r2.append(". Parent file is null.");
        r5 = ivas.gov.bisp.enumeration.p018ar.ay.a;
        r6 = r5 & 79;
        r6 = (r6 - (~(-(-((r5 ^ 79) | r6))))) - 1;
        ivas.gov.bisp.enumeration.p018ar.ay.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        android.util.Log.e("MultiDex", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        android.util.Log.e("MultiDex", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create dir ");
        r5.append(r10.getPath());
        r6 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r7 = ((r6 | 27) << 1) - (r6 ^ 27);
        ivas.gov.bisp.enumeration.p018ar.ay.a = r7 % 128;
        r7 = r7 % 2;
        r5.append(". parent file is a dir ");
        r5.append(r2.isDirectory());
        r6 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r7 = ((r6 | 123) << 1) - (((~r6) & 123) | (r6 & (-124)));
        ivas.gov.bisp.enumeration.p018ar.ay.a = r7 % 128;
        r7 = r7 % 2;
        r5.append(", a file ");
        r5.append(r2.isFile());
        r6 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r7 = (((r6 ^ 75) | (r6 & 75)) << 1) - (((~r6) & 75) | (r6 & (-76)));
        ivas.gov.bisp.enumeration.p018ar.ay.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if ((r7 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r5.append(", exists ");
        r5.append(r2.exists());
        r6 = ivas.gov.bisp.enumeration.p018ar.ay.a;
        r7 = r6 & 75;
        r6 = (r6 ^ 75) | r7;
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p018ar.ay.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012b, code lost:
    
        if ((r8 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
    
        r5.append(", readable ");
        r5.append(r2.canRead());
        r1 = ivas.gov.bisp.enumeration.p018ar.ay.a;
        r6 = r1 & 47;
        r6 = r6 + ((r1 ^ 47) | r6);
        ivas.gov.bisp.enumeration.p018ar.ay.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0146, code lost:
    
        if ((r6 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0148, code lost:
    
        r5.append(", writable ");
        r5.append(r2.canWrite());
        r1 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0157, code lost:
    
        r5.append(", writable ");
        r5.append(r2.canWrite());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0161, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p018ar.ay.a + 111;
        ivas.gov.bisp.enumeration.p018ar.ay.b = r1 % 128;
        r1 = r1 % 2;
        android.util.Log.e("MultiDex", r5.toString());
        r1 = ivas.gov.bisp.enumeration.p018ar.ay.b;
        r2 = r1 ^ 67;
        r1 = (((r1 & 67) | r2) << 1) - r2;
        ivas.gov.bisp.enumeration.p018ar.ay.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017f, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("Failed to create directory ");
        r0.append(r10.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0195, code lost:
    
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0196, code lost:
    
        r5.append(", readable ");
        r5.append(r2.canRead());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a1, code lost:
    
        r5.append(", exists ");
        r5.append(r2.exists());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ac, code lost:
    
        r10.getParentFile();
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if ((!r10.isDirectory()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r10.isDirectory() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r10 = (-2) - ((ivas.gov.bisp.enumeration.p018ar.ay.a + 2) ^ (-1));
        ivas.gov.bisp.enumeration.p018ar.ay.b = r10 % 128;
        r10 = r10 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.io.File r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p018ar.ay.h(java.io.File):void");
    }

    public static Field e(Object obj, String str) throws NoSuchFieldException {
        Field declaredField;
        int i = 2 % 2;
        int i2 = a + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        Class<?> superclass = obj.getClass();
        int i4 = a;
        int i5 = i4 & 63;
        int i6 = -(-(i4 | 63));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            if (superclass == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Field ");
                int i9 = b;
                int i10 = i9 & 95;
                int i11 = ((i9 ^ 95) | i10) << 1;
                int i12 = -((i9 | 95) & (~i10));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                sb.append(str);
                sb.append(" not found in ");
                sb.append(obj.getClass());
                throw new NoSuchFieldException(sb.toString());
            }
            int i15 = a;
            int i16 = i15 ^ 73;
            int i17 = ((((i15 & 73) | i16) << 1) - (~(-i16))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            try {
                declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    int i19 = b;
                    int i20 = ((i19 | 75) << 1) - (i19 ^ 75);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    declaredField.setAccessible(true);
                    int i22 = a;
                    int i23 = i22 & 107;
                    int i24 = i22 | 107;
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    break;
                }
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        int i27 = a;
        int i28 = (-2) - (((i27 & 48) + (i27 | 48)) ^ (-1));
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return declaredField;
        }
        throw null;
    }

    public static void c(Context context) {
        File file;
        int i = 2 % 2;
        File file2 = new File(context.getFilesDir(), "secondary-dexes");
        int i2 = a;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            file2.isDirectory();
            obj.hashCode();
            throw null;
        }
        if (!(!file2.isDirectory())) {
            file2.getPath();
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles == null) {
                int i6 = a;
                int i7 = i6 & 111;
                int i8 = ((((i6 ^ 111) | i7) << 1) - (~(-((i6 | 111) & (~i7))))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                file2.getPath();
                int i10 = b + 45;
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int length = fileArrListFiles.length;
            int i12 = b;
            int i13 = ((i12 ^ 75) - (~(-(-((i12 & 75) << 1))))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (i15 < length) {
                int i16 = (-2) - ((b + 70) ^ (-1));
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    file = fileArrListFiles[i15];
                    file.getPath();
                    file.length();
                    int i17 = 59 / 0;
                } else {
                    file = fileArrListFiles[i15];
                    file.getPath();
                    file.length();
                }
                int i18 = a;
                int i19 = (i18 & 61) + (i18 | 61);
                b = i19 % 128;
                int i20 = i19 % 2;
                if (!file.delete()) {
                    int i21 = b + 27;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    file.getPath();
                    if (i22 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i23 = a;
                    int i24 = (i23 & 27) + (i23 | 27);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    file.getPath();
                    int i26 = b;
                    int i27 = (i26 & (-84)) | ((~i26) & 83);
                    int i28 = (i26 & 83) << 1;
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    a = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 2 % 3;
                    }
                }
                int i31 = (i15 ^ (-24)) + ((i15 & (-24)) << 1);
                i15 = (i31 ^ 25) + ((i31 & 25) << 1);
                int i32 = b;
                int i33 = (((i32 ^ 85) | (i32 & 85)) << 1) - (((~i32) & 85) | (i32 & (-86)));
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            if (!file2.delete()) {
                int i35 = a;
                int i36 = i35 ^ 115;
                int i37 = ((((i35 & 115) | i36) << 1) - (~(-i36))) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
                file2.getPath();
                if (i38 != 0) {
                    throw null;
                }
                int i39 = (-2) - ((b + 18) ^ (-1));
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    throw null;
                }
                return;
            }
            file2.getPath();
            int i40 = a;
            int i41 = (i40 & 69) + (i40 | 69);
            b = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = b;
        int i44 = (i43 & (-4)) | ((~i43) & 3);
        int i45 = (i43 & 3) << 1;
        int i46 = (i44 & i45) + (i45 | i44);
        a = i46 % 128;
        int i47 = i46 % 2;
    }

    public static void f(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 102) << 1) - (i2 ^ 102)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!list.isEmpty()) {
            Object obj = e(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = new Class[3];
            int i5 = b;
            int i6 = i5 & 73;
            int i7 = (i6 - (~(-(-((i5 ^ 73) | i6))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                clsArr[1] = ArrayList.class;
                clsArr[1] = File.class;
            } else {
                clsArr[0] = ArrayList.class;
                clsArr[1] = File.class;
            }
            clsArr[2] = ArrayList.class;
            Class<?> superclass = obj.getClass();
            int i8 = a;
            int i9 = (i8 & 19) + (i8 | 19);
            b = i9 % 128;
            int i10 = i9 % 2;
            while (true) {
                Object obj2 = null;
                if (superclass == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Method ");
                    int i11 = a;
                    int i12 = i11 ^ 13;
                    int i13 = -(-((i11 & 13) << 1));
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    sb.append("makeDexElements");
                    sb.append(" with parameters ");
                    int i16 = a;
                    int i17 = i16 & 53;
                    int i18 = (i16 ^ 53) | i17;
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        sb.append(Arrays.asList(clsArr));
                        sb.append(" not found in ");
                        obj2.hashCode();
                        throw null;
                    }
                    sb.append(Arrays.asList(clsArr));
                    sb.append(" not found in ");
                    sb.append(obj.getClass());
                    throw new NoSuchMethodException(sb.toString());
                }
                int i20 = a;
                int i21 = i20 & 59;
                int i22 = ((i20 ^ 59) | i21) << 1;
                int i23 = -((i20 | 59) & (~i21));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
                try {
                    declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        int i26 = b;
                        int i27 = (i26 & 85) + (i26 | 85);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        declaredMethod.setAccessible(true);
                        int i29 = a;
                        int i30 = (i29 & 2) + (i29 | 2);
                        int i31 = (i30 ^ (-1)) + (i30 << 1);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        break;
                    }
                    break;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            int i33 = b;
            int i34 = i33 & 37;
            int i35 = ((i33 | 37) & (~i34)) + (i34 << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
            Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList);
            int i37 = a;
            int i38 = (i37 & (-40)) | ((~i37) & 39);
            int i39 = (i37 & 39) << 1;
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            b = i40 % 128;
            int i41 = i40 % 2;
            b(obj, "dexElements", objArr);
            if (arrayList.size() > 0) {
                int i42 = a;
                int i43 = i42 & 49;
                int i44 = (i42 ^ 49) | i43;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                int i46 = i45 % 2;
                int i47 = a;
                int i48 = (-2) - ((((i47 | 24) << 1) - (i47 ^ 24)) ^ (-1));
                b = i48 % 128;
                if (i48 % 2 != 0) {
                    int i49 = 3 / 3;
                }
                for (IOException iOException : arrayList) {
                    int i50 = b;
                    int i51 = i50 & 1;
                    int i52 = -(-((i50 ^ 1) | i51));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    a = i53 % 128;
                    int i54 = i53 % 2;
                    int i55 = a;
                    int i56 = (i55 & (-10)) | ((~i55) & 9);
                    int i57 = -(-((i55 & 9) << 1));
                    int i58 = (i56 & i57) + (i57 | i56);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                }
                Field fieldE = e(obj, "dexElementsSuppressedExceptions");
                Object obj3 = fieldE.get(obj);
                int i60 = a;
                int i61 = i60 + 71;
                b = i61 % 128;
                int i62 = i61 % 2;
                IOException[] iOExceptionArr2 = (IOException[]) obj3;
                if (iOExceptionArr2 == null) {
                    int i63 = i60 & 77;
                    int i64 = (i63 - (~((i60 ^ 77) | i63))) - 1;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    Object[] array = arrayList.toArray(new IOException[arrayList.size()]);
                    int i66 = b;
                    int i67 = ((i66 & 17) - (~(i66 | 17))) - 1;
                    a = i67 % 128;
                    if (i67 % 2 == 0) {
                        throw null;
                    }
                    iOExceptionArr = (IOException[]) array;
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() - (~(-(-iOExceptionArr2.length)))) - 1];
                    int i68 = b;
                    int i69 = i68 & 91;
                    int i70 = -(-((i68 ^ 91) | i69));
                    int i71 = (i69 & i70) + (i70 | i69);
                    a = i71 % 128;
                    if (i71 % 2 == 0) {
                        arrayList.toArray(iOExceptionArr3);
                        arrayList.size();
                        int length = iOExceptionArr2.length;
                        throw null;
                    }
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    int i72 = b + 105;
                    a = i72 % 128;
                    if (i72 % 2 == 0) {
                        int i73 = 3 / 4;
                    }
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldE.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                int i74 = b + 33;
                a = i74 % 128;
                int i75 = i74 % 2;
                iOException2.initCause((Throwable) arrayList.get(0));
                int i76 = a;
                int i77 = i76 & 81;
                int i78 = ((i76 ^ 81) | i77) << 1;
                int i79 = -((i76 | 81) & (~i77));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                b = i80 % 128;
                int i81 = i80 % 2;
                throw iOException2;
            }
        }
        int i82 = b;
        int i83 = (i82 ^ 11) + ((i82 & 11) << 1);
        a = i83 % 128;
        int i84 = i83 % 2;
    }
}
