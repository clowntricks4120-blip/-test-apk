package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class B {
    public final aNl a;
    public aNn b = new aNn();

    public interface aNl {
        int a(View view);

        View b(int i);

        int c();

        int d(View view);

        int e();
    }

    public static class aNn {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public boolean b() {
            int i = this.a;
            if ((i & 7) != 0 && (i & c(this.d, this.b)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (c(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            return (i4 & 28672) == 0 || (i4 & (c(this.e, this.c) << 12)) != 0;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    public B(aNl anl) {
        this.a = anl;
    }

    public View b(int i, int i2, int i3, int i4) {
        int iC = this.a.c();
        int iE = this.a.e();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewB = this.a.b(i);
            int iA = this.a.a(viewB);
            int iD = this.a.d(viewB);
            aNn ann = this.b;
            ann.b = iC;
            ann.c = iE;
            ann.d = iA;
            ann.e = iD;
            if (i3 != 0) {
                ann.a = 0;
                ann.a = i3;
                if (ann.b()) {
                    return viewB;
                }
            }
            if (i4 != 0) {
                aNn ann2 = this.b;
                ann2.a = 0;
                ann2.a = i4;
                if (ann2.b()) {
                    view = viewB;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean c(View view, int i) {
        aNn ann = this.b;
        int iC = this.a.c();
        int iE = this.a.e();
        int iA = this.a.a(view);
        int iD = this.a.d(view);
        ann.b = iC;
        ann.c = iE;
        ann.d = iA;
        ann.e = iD;
        if (i == 0) {
            return false;
        }
        aNn ann2 = this.b;
        ann2.a = 0;
        ann2.a = i;
        return ann2.b();
    }
}
