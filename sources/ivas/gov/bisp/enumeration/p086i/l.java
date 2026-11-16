package ivas.gov.bisp.enumeration.p086i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class l {
    private static int a = 0;
    private static int b = 1;
    public static final Object c = new Object();

    public static class aUF {
        private static int a = 0;
        private static int b = 1;

        public static void b(Context context, Intent[] intentArr, Bundle bundle) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            context.startActivities(intentArr, bundle);
            int i5 = a;
            int i6 = i5 & 97;
            int i7 = ((i5 ^ 97) | i6) << 1;
            int i8 = -((i5 | 97) & (~i6));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 98 / 0;
            }
        }

        public static void c(Context context, Intent intent, Bundle bundle) {
            int i = 2 % 2;
            int i2 = b + 14;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            context.startActivity(intent, bundle);
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = a;
            int i6 = i5 ^ 125;
            int i7 = -(-((i5 & 125) << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static class aUG {
        private static int a = 0;
        private static int b = 1;

        public static File[] b(Context context) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            a = i3 % 128;
            int i4 = i3 % 2;
            File[] externalCacheDirs = context.getExternalCacheDirs();
            int i5 = b + 123;
            a = i5 % 128;
            int i6 = i5 % 2;
            return externalCacheDirs;
        }

        public static File[] c(Context context, String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 90) + ((i2 & 90) << 1)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            File[] externalFilesDirs = context.getExternalFilesDirs(str);
            int i5 = a;
            int i6 = ((((i5 ^ 17) | (i5 & 17)) << 1) - (~(-(((~i5) & 17) | (i5 & (-18)))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return externalFilesDirs;
        }

        public static File[] d(Context context) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 1;
            int i4 = i3 + ((i2 ^ 1) | i3);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                context.getObbDirs();
                throw null;
            }
            File[] obbDirs = context.getObbDirs();
            int i5 = a;
            int i6 = (i5 | 125) << 1;
            int i7 = -(((~i5) & 125) | (i5 & (-126)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 66 / 0;
            }
            return obbDirs;
        }
    }

    public static class aUH {
        private static int a = 0;
        private static int b = 1;

        public static File b(Context context) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 63) | (i2 & 63)) << 1;
            int i4 = -(((~i2) & 63) | (i2 & (-64)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                context.getCodeCacheDir();
                throw null;
            }
            File codeCacheDir = context.getCodeCacheDir();
            int i6 = b;
            int i7 = (i6 & (-50)) | ((~i6) & 49);
            int i8 = (i6 & 49) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 46 / 0;
            }
            return codeCacheDir;
        }

        public static Drawable c(Context context, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 99) + (i3 | 99);
            b = i4 % 128;
            int i5 = i4 % 2;
            Drawable drawable = context.getDrawable(i);
            int i6 = a;
            int i7 = (-2) - (((i6 & 106) + (i6 | 106)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 55 / 0;
            }
            return drawable;
        }

        public static File d(Context context) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return context.getNoBackupFilesDir();
            }
            context.getNoBackupFilesDir();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class aUI {
        private static int a = 1;
        private static int b;

        public static int b(Context context, int i) {
            int i2 = 2 % 2;
            int i3 = b + 33;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return context.getColor(i);
            }
            context.getColor(i);
            throw null;
        }

        public static <T> T c(Context context, Class<T> cls) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
            int i4 = -(((~i2) & 27) | (i2 & (-28)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                context.getSystemService(cls);
                throw null;
            }
            T t = (T) context.getSystemService(cls);
            int i6 = b;
            int i7 = i6 & 111;
            int i8 = -(-((i6 ^ 111) | i7));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 47 / 0;
            }
            return t;
        }

        public static String d(Context context, Class<?> cls) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 85;
            int i4 = (i2 ^ 85) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            String systemServiceName = context.getSystemServiceName(cls);
            if (i6 == 0) {
                int i7 = 88 / 0;
            }
            int i8 = b;
            int i9 = (i8 | 55) << 1;
            int i10 = -(((~i8) & 55) | (i8 & (-56)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return systemServiceName;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = a;
        int i2 = i & 105;
        int i3 = i2 + ((i ^ 105) | i2);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static int b(Context context, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = -(-(i2 | 25));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(str, "permission must be non-null");
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i7 = b + 111;
        a = i7 % 128;
        int i8 = i7 % 2;
        int iCheckPermission = context.checkPermission(str, iMyPid, iMyUid);
        int i9 = b;
        int i10 = i9 & 23;
        int i11 = ((i9 ^ 23) | i10) << 1;
        int i12 = -((i9 | 23) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        return iCheckPermission;
    }
}
