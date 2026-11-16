package ivas.gov.bisp.enumeration.p013am;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.am.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0092p {
    private static int a = 0;
    private static int b = 1;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.am.p$aXU */
    public static class aXU {
        private static int a = 0;
        private static int b = 1;

        public static Handler b(Looper looper) {
            int i = 2 % 2;
            int i2 = b + 45;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                Handler.createAsync(looper);
                throw null;
            }
            Handler handlerCreateAsync = Handler.createAsync(looper);
            int i3 = a;
            int i4 = i3 ^ 59;
            int i5 = (((i3 & 59) | i4) << 1) - i4;
            b = i5 % 128;
            int i6 = i5 % 2;
            return handlerCreateAsync;
        }
    }

    public static ThreadPoolExecutor b(final String str) {
        int i = 2 % 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: ivas.gov.bisp.enumeration.am.i
            private static int a = 0;
            private static int b = 1;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = 2 % 2;
                Thread thread = new Thread(runnable, str);
                int i3 = b;
                int i4 = ((i3 ^ 122) + ((i3 & 122) << 1)) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
                thread.setPriority(10);
                int i6 = a;
                int i7 = i6 & 61;
                int i8 = (((i6 | 61) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                return thread;
            }
        });
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = i2 | 119;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        int i7 = b;
        int i8 = ((i7 | 119) << 1) - (i7 ^ 119);
        a = i8 % 128;
        int i9 = i8 % 2;
        return threadPoolExecutor;
    }

    public static Handler c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (i3 - (~(-(-((i2 ^ 69) | i3))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0 ? Build.VERSION.SDK_INT < 28 : Build.VERSION.SDK_INT < 18) {
            Handler handler = new Handler(Looper.getMainLooper());
            int i5 = b;
            int i6 = (i5 ^ 25) + ((i5 & 25) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return handler;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = a;
        int i8 = i7 & 11;
        int i9 = (i7 ^ 11) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        Looper mainLooper = Looper.getMainLooper();
        if (i11 != 0) {
            return aXU.b(mainLooper);
        }
        aXU.b(mainLooper);
        obj.hashCode();
        throw null;
    }
}
