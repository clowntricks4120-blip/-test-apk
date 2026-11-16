package ivas.gov.bisp.enumeration.p022av;

import android.os.Handler;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class P implements O {
    public final Executor a;

    public class bJW implements Executor {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Handler c;

        public bJW(P p, Handler handler) {
            this.c = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 5) + (i2 | 5);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.post(runnable);
            int i5 = a;
            int i6 = i5 & 65;
            int i7 = (i6 - (~(-(-((i5 ^ 65) | i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static class bJX implements Runnable {
        public final M a;
        public final C0094m b;
        public final Runnable c;

        public bJX(M m, C0094m c0094m, Runnable runnable) {
            this.a = m;
            this.b = c0094m;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0094m.bas basVar;
            this.a.m();
            C0094m c0094m = this.b;
            T t = c0094m.c;
            if (t == null) {
                this.a.e(c0094m.a);
            } else {
                M m = this.a;
                synchronized (m.g) {
                    basVar = m.i;
                }
                if (basVar != null) {
                    basVar.b(t);
                }
            }
            if (this.b.d) {
                this.a.c("intermediate-response");
            } else {
                this.a.d("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public P(Handler handler) {
        this.a = new bJW(this, handler);
    }

    public void c(o00O0O<?> o00o0o, o00Ooo<?> o00ooo, Runnable runnable) {
        synchronized (o00o0o.g) {
            o00o0o.l = true;
        }
        o00o0o.c("post-response");
        this.a.execute(new bJX(o00o0o, o00ooo, runnable));
    }
}
