package ivas.gov.bisp.enumeration.p085h;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class an {
    private static int a = 0;
    private static int b = 1;

    public static int b(AppOpsManager appOpsManager, String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 41;
        int i5 = (((i3 ^ 41) | i4) << 1) - ((~i4) & (i3 | 41));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (appOpsManager == null) {
            int i6 = ((i3 & (-62)) | ((~i3) & 61)) + ((i3 & 61) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return 1;
        }
        int iCheckOpNoThrow = appOpsManager.checkOpNoThrow(str, i, str2);
        int i8 = a;
        int i9 = i8 & 39;
        int i10 = i9 + ((i8 ^ 39) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        return iCheckOpNoThrow;
    }

    public static String c(Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = -(-((i2 & 87) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        String opPackageName = context.getOpPackageName();
        int i7 = a;
        int i8 = ((((i7 ^ 95) | (i7 & 95)) << 1) - (~(-(((~i7) & 95) | (i7 & (-96)))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return opPackageName;
        }
        throw null;
    }

    public static AppOpsManager d(Context context) {
        int i = 2 % 2;
        int i2 = b + 65;
        a = i2 % 128;
        int i3 = i2 % 2;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        int i4 = a;
        int i5 = i4 & 119;
        int i6 = -(-(i4 | 119));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return appOpsManager;
    }
}
