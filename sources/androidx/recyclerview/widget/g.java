package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final RecyclerView.Oooo000 a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public g(RecyclerView.Oooo000 oooo000, s sVar) {
        this.a = oooo000;
    }

    public static g b(RecyclerView.Oooo000 oooo000, int i) {
        if (i == 0) {
            return new s(oooo000);
        }
        if (i == 1) {
            return new t(oooo000);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int c();

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h(View view);

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n(View view);

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return m() - this.b;
    }

    public abstract int p(View view);

    public abstract void q(int i);
}
