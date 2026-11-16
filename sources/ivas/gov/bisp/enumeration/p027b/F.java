package ivas.gov.bisp.enumeration.p027b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class F implements Application.ActivityLifecycleCallbacks {
    private static int a = 0;
    private static int b = 1;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (((i2 | 103) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = b + 6;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = -(-(i2 | 91));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = a + 91;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = a + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = a + 50;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
