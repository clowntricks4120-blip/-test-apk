package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.Z;
import ivas.gov.bisp.enumeration.p097r.l;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final int a;
    public final Context b;
    public final n d;
    public final boolean e;
    public final s f;
    public final int g;
    public final int h;
    public final Z i;
    public View l;
    public PopupWindow.OnDismissListener m;
    public View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p.aIX f8o;
    public boolean p;
    public ViewTreeObserver q;
    public boolean r;
    public int t;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new aJh();
    public final View.OnAttachStateChangeListener k = new aJi();
    public int s = 0;

    public class aJh implements ViewTreeObserver.OnGlobalLayoutListener {
        public aJh() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws Throwable {
            if (v.this.e()) {
                v vVar = v.this;
                if (vVar.i.D) {
                    return;
                }
                View view = vVar.n;
                if (view == null || !view.isShown()) {
                    v.this.dismiss();
                } else {
                    v.this.i.f();
                }
            }
        }
    }

    public class aJi implements View.OnAttachStateChangeListener {
        public aJi() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = v.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    v.this.q = view.getViewTreeObserver();
                }
                v vVar = v.this;
                vVar.q.removeGlobalOnLayoutListener(vVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public v(Context context, n nVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.d = nVar;
        this.e = z;
        this.f = new s(nVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i;
        this.a = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.i = new Z(context, null, i, i2);
        nVar.e(this, context);
    }

    @Override // androidx.appcompat.view.menu.p
    public final Parcelable a() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(n nVar, boolean z) {
        if (nVar != this.d) {
            return;
        }
        dismiss();
        p.aIX aix = this.f8o;
        if (aix != null) {
            aix.b(nVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean d() {
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final void dismiss() {
        if (e()) {
            this.i.dismiss();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final boolean e() {
        return !this.p && this.i.e();
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final void f() throws Throwable {
        View view;
        if (e()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.n = view;
        this.i.C.setOnDismissListener(this);
        Z z = this.i;
        z.v = this;
        z.q(true);
        View view2 = this.n;
        boolean z2 = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        Z z3 = this.i;
        z3.t = view2;
        z3.r = this.s;
        if (!this.r) {
            this.t = l.j(this.f, null, this.b, this.g);
            this.r = true;
        }
        this.i.o(this.t);
        this.i.C.setInputMethodMode(2);
        Z z4 = this.i;
        Rect rect = this.c;
        Objects.requireNonNull(z4);
        z4.x = rect != null ? new Rect(rect) : null;
        this.i.f();
        o00000OO o00000oo = this.i.i;
        o00000oo.setOnKeyListener(this);
        if (this.u && this.d.f6o != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o00000oo, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.d.f6o);
            }
            frameLayout.setEnabled(false);
            o00000oo.addHeaderView(frameLayout, null, false);
        }
        this.i.n(this.f);
        this.i.f();
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final ListView i() {
        return this.i.i;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void n(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.d.f(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.n.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.j);
            this.q = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void p(p.aIX aix) {
        this.f8o = aix;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void q(boolean z) {
        this.r = false;
        s sVar = this.f;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean r(w wVar) {
        if (wVar.hasVisibleItems()) {
            k kVar = new k(this.b, wVar, this.n, this.e, this.h, this.a);
            kVar.e(this.f8o);
            boolean zK = l.k(wVar);
            kVar.i = zK;
            l lVar = kVar.j;
            if (lVar != null) {
                lVar.t(zK);
            }
            kVar.k = this.m;
            this.m = null;
            this.d.f(false);
            Z z = this.i;
            int width = z.l;
            int i = !z.n ? 0 : z.m;
            int i2 = this.s;
            View view = this.l;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            if ((Gravity.getAbsoluteGravity(i2, T.aWY.f(view)) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!kVar.c()) {
                if (kVar.f != null) {
                    kVar.g(width, i, true, true);
                }
            }
            p.aIX aix = this.f8o;
            if (aix != null) {
                aix.e(wVar);
            }
            return true;
        }
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void s(n nVar) {
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void t(boolean z) {
        this.f.c = z;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void u(View view) {
        this.l = view;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void v(int i) {
        this.s = i;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void w(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void x(int i) {
        this.i.l = i;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void y(boolean z) {
        this.u = z;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void z(int i) {
        Z z = this.i;
        z.m = i;
        z.n = true;
    }
}
