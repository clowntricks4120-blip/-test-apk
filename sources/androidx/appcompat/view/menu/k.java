package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p097r.l;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public p.aIX a;
    public final Context b;
    public final n c;
    public final boolean d;
    public final int e;
    public View f;
    public final int g;
    public boolean i;
    public l j;
    public PopupWindow.OnDismissListener k;
    public int h = 8388611;
    public final PopupWindow.OnDismissListener l = new aJf();

    public class aJf implements PopupWindow.OnDismissListener {
        public aJf() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            k.this.d();
        }
    }

    public k(Context context, n nVar, View view, boolean z, int i, int i2) {
        this.b = context;
        this.c = nVar;
        this.f = view;
        this.d = z;
        this.e = i;
        this.g = i2;
    }

    public l b() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            l fVar = Math.min(point.x, point.y) >= this.b.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new f(this.b, this.f, this.e, this.g, this.d) : new v(this.b, this.c, this.f, this.e, this.g, this.d);
            fVar.s(this.c);
            fVar.w(this.l);
            fVar.u(this.f);
            fVar.p(this.a);
            fVar.t(this.i);
            fVar.v(this.h);
            this.j = fVar;
        }
        return this.j;
    }

    public boolean c() {
        l lVar = this.j;
        return lVar != null && lVar.e();
    }

    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e(p.aIX aix) {
        this.a = aix;
        l lVar = this.j;
        if (lVar != null) {
            lVar.p(aix);
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        l lVarB = b();
        lVarB.y(z2);
        if (z) {
            int i3 = this.h;
            View view = this.f;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            if ((Gravity.getAbsoluteGravity(i3, T.aWY.f(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            lVarB.x(i);
            lVarB.z(i2);
            int i4 = (int) ((this.b.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarB.c = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        lVarB.f();
    }
}
