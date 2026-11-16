package ivas.gov.bisp.enumeration.p096p;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class c extends h {
    private static int a = 0;
    private static int b = 1;
    public final Object d = new Object();
    public final ExecutorService e = Executors.newFixedThreadPool(4, new aRz(this));

    public class aRz implements ThreadFactory {
        private static int a = 1;
        private static int b;
        public final AtomicInteger c = new AtomicInteger(0);

        public aRz(c cVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int i = 2 % 2;
            Thread thread = new Thread(runnable);
            int i2 = a;
            int i3 = i2 & 103;
            int i4 = ((i2 | 103) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {Integer.valueOf(this.c.getAndIncrement())};
            int i6 = a;
            int i7 = i6 ^ 71;
            int i8 = ((i6 & 71) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                thread.setName(String.format("arch_disk_io_%d", objArr));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            thread.setName(String.format("arch_disk_io_%d", objArr));
            int i11 = b;
            int i12 = i11 ^ 17;
            int i13 = ((i11 & 17) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            return thread;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public void S(Runnable runnable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.execute(runnable);
        int i5 = b;
        int i6 = ((i5 | 121) << 1) - (i5 ^ 121);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public boolean az() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = ((((i2 ^ 83) | i3) << 1) - (~(-((i2 | 83) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            int i6 = b;
            int i7 = i6 & 69;
            int i8 = ((i6 ^ 69) | i7) << 1;
            int i9 = -((~i7) & (i6 | 69));
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i6 + 69;
            a = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = a;
            int i15 = (i14 & 63) + (i14 | 63);
            b = i15 % 128;
            int i16 = i15 % 2;
            z = false;
        }
        int i17 = a;
        int i18 = (((i17 & (-122)) | ((~i17) & 121)) - (~((i17 & 121) << 1))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }
}
