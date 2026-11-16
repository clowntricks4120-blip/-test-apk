package com.orm.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes.dex */
public final class ContextUtil {
    private static Context ctx;

    private ContextUtil() {
    }

    public static AssetManager getAssets() {
        return getContext().getAssets();
    }

    public static Context getContext() {
        return ctx;
    }

    public static PackageManager getPackageManager() {
        return getContext().getPackageManager();
    }

    public static String getPackageName() {
        return getContext().getPackageName();
    }

    public static void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context shouldn't be null!");
        }
        ctx = context;
    }

    public static void terminate() {
        ctx = null;
    }
}
