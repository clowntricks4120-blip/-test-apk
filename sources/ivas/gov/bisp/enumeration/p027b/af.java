package ivas.gov.bisp.enumeration.p027b;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class af {
    private static int a = 1;
    private static int b;
    public static AtomicBoolean c = new AtomicBoolean(false);

    public static class aZi extends F {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 91;
            int i4 = (i2 & 91) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            ReportFragment.c(activity);
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = b;
            int i8 = i7 & 69;
            int i9 = (i8 - (~((i7 ^ 69) | i8))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 58 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-114)) | ((~i2) & 113);
            int i4 = -(-((i2 & 113) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 2) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        int i = b;
        int i2 = i & 21;
        int i3 = (i ^ 21) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
