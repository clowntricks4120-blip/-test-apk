package ivas.gov.bisp.enumeration.p009ai;

import android.os.Handler;
import ivas.gov.bisp.enumeration.Oooo0o0.o00oO0o;
import ivas.gov.bisp.enumeration.p010aj.Q;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class O<T> implements Runnable {
    private static int a = 1;
    private static int b;
    public Callable<T> c;
    public o00oO0o<T> d;
    public Handler e;

    public class aVY implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Q c;
        public final /* synthetic */ Object d;

        public aVY(O o2, Q q, Object obj) {
            this.c = q;
            this.d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 97;
            int i4 = (i2 & 97) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                this.c.b(this.d);
                throw null;
            }
            this.c.b(this.d);
            int i6 = b + 42;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public O(Handler handler, Callable<T> callable, o00oO0o<T> o00oo0o) {
        this.c = callable;
        this.d = o00oo0o;
        this.e = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (((i2 ^ 63) | i3) << 1) - ((i2 | 63) & (~i3));
        b = i4 % 128;
        T tCall = null;
        try {
            if (i4 % 2 != 0) {
                this.c.call();
                try {
                    tCall.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            tCall = this.c.call();
            int i5 = a;
            int i6 = i5 & 41;
            int i7 = -(-(i5 | 41));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            o00oO0o<T> o00oo0o = this.d;
            Handler handler = this.e;
            aVY avy = new aVY(this, o00oo0o, tCall);
            int i10 = b;
            int i11 = i10 | 23;
            int i12 = ((i11 << 1) - (~(-((~(i10 & 23)) & i11)))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            handler.post(avy);
            int i14 = a;
            int i15 = i14 & 59;
            int i16 = (((i14 ^ 59) | i15) << 1) - ((i14 | 59) & (~i15));
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 45 / 0;
            }
        } catch (Exception unused) {
        }
    }
}
