package ivas.gov.bisp.enumeration.p085h;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static int a = 0;
    private static int b = 1;

    public static Intent c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        Intent component;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 123) | (i2 & 123)) << 1) - (((~i2) & 123) | (i2 & (-124)));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d(context, componentName);
            throw null;
        }
        String strD = d(context, componentName);
        if (strD == null) {
            int i4 = a;
            int i5 = (-2) - (((i4 & 76) + (i4 | 76)) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strD);
        int i7 = b;
        int i8 = ((((i7 ^ 27) | (i7 & 27)) << 1) - (~(-(((~i7) & 27) | (i7 & (-28)))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            d(context, componentName2);
            throw null;
        }
        if (d(context, componentName2) == null) {
            component = Intent.makeMainActivity(componentName2);
            int i9 = b;
            int i10 = (-2) - ((((i9 | 116) << 1) - (i9 ^ 116)) ^ (-1));
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 / 5;
            }
        } else {
            component = new Intent().setComponent(componentName2);
            int i12 = a;
            int i13 = ((i12 ^ 6) + ((i12 & 6) << 1)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = ((i15 ^ 62) + ((i15 & 62) << 1)) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return component;
        }
        obj.hashCode();
        throw null;
    }

    public static String d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 25) << 1) - (i3 ^ 25);
        b = i4 % 128;
        int i5 = i4 % 2;
        PackageManager packageManager = context.getPackageManager();
        int i6 = Build.VERSION.SDK_INT;
        int i7 = a;
        int i8 = ((i7 | 73) << 1) - (i7 ^ 73);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        Object obj = null;
        if (i6 >= 29) {
            int i11 = (i7 ^ 39) + ((i7 & 39) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i7 & 89;
            int i14 = i7 | 89;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            i = 269222528;
        } else if (i6 >= 24) {
            int i17 = (i9 & 111) + (i9 | 111);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i = 787072;
        } else {
            i = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        int i18 = b;
        int i19 = i18 | 107;
        int i20 = i19 << 1;
        int i21 = -(i19 & (~(i18 & 107)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        if (str != null) {
            int i24 = i18 & 99;
            int i25 = (i18 ^ 99) | i24;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                return str;
            }
            throw null;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null) {
            int i27 = b;
            int i28 = i27 & 83;
            int i29 = ((i27 | 83) & (~i28)) + (i28 << 1);
            int i30 = i29 % 128;
            a = i30;
            int i31 = i29 % 2;
            int i32 = i30 | 19;
            int i33 = (i32 << 1) - (i32 & (~(i30 & 19)));
            b = i33 % 128;
            if (i33 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String string = bundle.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            int i34 = a;
            int i35 = (i34 & (-26)) | ((~i34) & 25);
            int i36 = -(-((i34 & 25) << 1));
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            b = i37 % 128;
            if (i37 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i38 = (((i34 & (-2)) | ((~i34) & 1)) - (~((i34 & 1) << 1))) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                int i39 = 43 / 0;
            }
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            String packageName = context.getPackageName();
            int i40 = b;
            int i41 = (i40 & (-48)) | ((~i40) & 47);
            int i42 = -(-((i40 & 47) << 1));
            int i43 = (i41 & i42) + (i42 | i41);
            a = i43 % 128;
            if (i43 % 2 != 0) {
                sb.append(packageName);
                sb.append(string);
                obj.hashCode();
                throw null;
            }
            sb.append(packageName);
            sb.append(string);
            string = sb.toString();
            int i44 = a + 3;
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        int i46 = a;
        int i47 = (-2) - (((i46 ^ 46) + ((i46 & 46) << 1)) ^ (-1));
        b = i47 % 128;
        if (i47 % 2 == 0) {
            int i48 = 48 / 0;
        }
        return string;
    }

    public static Intent b(Activity activity) {
        Intent component;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 27;
        int i4 = ((i2 & 27) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            activity.getParentActivityIntent();
            obj.hashCode();
            throw null;
        }
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            int i7 = b;
            int i8 = ((i7 ^ 46) + ((i7 & 46) << 1)) - 1;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return parentActivityIntent;
            }
            throw null;
        }
        try {
            String strD = d(activity, activity.getComponentName());
            if (strD == null) {
                int i9 = b;
                int i10 = i9 ^ 21;
                int i11 = (((i9 & 21) | i10) << 1) - i10;
                int i12 = i11 % 128;
                a = i12;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i13 = i12 + 39;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            ComponentName componentName = new ComponentName(activity, strD);
            try {
                if (d(activity, componentName) == null) {
                    int i14 = a + 85;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    component = Intent.makeMainActivity(componentName);
                    int i16 = b;
                    int i17 = i16 & 119;
                    int i18 = -(-((i16 ^ 119) | i17));
                    int i19 = (i17 & i18) + (i18 | i17);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    component = new Intent().setComponent(componentName);
                    int i21 = b;
                    int i22 = ((i21 | 89) << 1) - (i21 ^ 89);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = i21 & 63;
                    int i25 = i24 + ((i21 ^ 63) | i24);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
                int i27 = a;
                int i28 = i27 & 109;
                int i29 = (i28 - (~((i27 ^ 109) | i28))) - 1;
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 98 / 0;
                }
                return component;
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("getParentActivityIntent: bad parentActivityName '");
                sb.append(strD);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
