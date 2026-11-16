package ivas.gov.bisp.enumeration.p009ai;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ai.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC0089m implements ThreadFactory {
    private static int a = 1;
    private static int b;
    public String c;
    public int d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ai.m$aVU */
    public static class aVU extends Thread {
        private static int a = 1;
        private static int b;
        public final int c;

        public aVU(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.c = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 61;
            int i4 = (i2 | 61) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                Process.setThreadPriority(this.c);
                super.run();
                int i7 = 19 / 0;
            } else {
                Process.setThreadPriority(this.c);
                super.run();
            }
            int i8 = a;
            int i9 = i8 & 21;
            int i10 = ((i8 ^ 21) | i9) << 1;
            int i11 = -((i8 | 21) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    public ThreadFactoryC0089m(String str, int i) {
        this.c = str;
        this.d = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int i = 2 % 2;
        aVU avu = new aVU(runnable, this.c, this.d);
        int i2 = a;
        int i3 = (((i2 & (-60)) | ((~i2) & 59)) - (~((i2 & 59) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return avu;
    }
}
