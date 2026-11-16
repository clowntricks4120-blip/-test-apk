package ivas.gov.bisp.enumeration.p096p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j extends h {
    private static int a = 0;
    private static int b = 1;
    public static volatile j d;
    public static final Executor e = new aRx();
    public h f = new c();

    public static final class aRx implements Executor {
        private static int a = 1;
        private static int b;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = a + 23;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                j.bx().f.S(runnable);
                int i3 = 18 / 0;
            } else {
                j.bx().f.S(runnable);
            }
            int i4 = b;
            int i5 = (i4 & (-18)) | ((~i4) & 17);
            int i6 = -(-((i4 & 17) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    static {
        int i = a;
        int i2 = (((i & (-30)) | ((~i) & 29)) - (~((i & 29) << 1))) - 1;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static j bx() {
        if (d != null) {
            return d;
        }
        synchronized (j.class) {
            if (d == null) {
                d = new j();
            }
        }
        return d;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public void S(Runnable runnable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-50)) | ((~i2) & 49);
        int i4 = (i2 & 49) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.f.S(runnable);
        } else {
            this.f.S(runnable);
            int i6 = 92 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public boolean az() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        boolean zAz = this.f.az();
        int i7 = a;
        int i8 = i7 & 15;
        int i9 = ((i7 ^ 15) | i8) << 1;
        int i10 = -((i7 | 15) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 59 / 0;
        }
        return zAz;
    }
}
