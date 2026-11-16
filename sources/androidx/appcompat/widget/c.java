package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.Toolbar.OooO0o;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0323y;
import ivas.gov.bisp.enumeration.p088k.ViewOnClickListenerC0314b;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class c implements InterfaceC0323y {
    public CharSequence a;
    public Toolbar b;
    public int c;
    public View d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public a m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14o;
    public Drawable p;

    public class aJE extends r {
        public final /* synthetic */ int a;
        public boolean b = false;

        public aJE(int i) {
            this.a = i;
        }

        @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p081d.v
        public void a(View view) {
            this.b = true;
        }

        @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p081d.v
        public void c(View view) {
            c.this.b.setVisibility(0);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void e(View view) {
            if (this.b) {
                return;
            }
            c.this.b.setVisibility(this.a);
        }
    }

    public c(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f14o = 0;
        this.b = toolbar;
        this.a = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.i = this.a != null;
        this.h = toolbar.getNavigationIcon();
        B bC = B.c(toolbar.getContext(), null, h.d, R.attr.actionBarStyle, 0);
        int i = 15;
        this.p = bC.l(15);
        if (z) {
            CharSequence charSequenceS = bC.s(27);
            if (!TextUtils.isEmpty(charSequenceS)) {
                setTitle(charSequenceS);
            }
            CharSequence charSequenceS2 = bC.s(25);
            if (!TextUtils.isEmpty(charSequenceS2)) {
                this.j = charSequenceS2;
                if ((this.c & 8) != 0) {
                    this.b.setSubtitle(charSequenceS2);
                }
            }
            Drawable drawableL = bC.l(20);
            if (drawableL != null) {
                this.f = drawableL;
                E();
            }
            Drawable drawableL2 = bC.l(17);
            if (drawableL2 != null) {
                this.g = drawableL2;
                E();
            }
            if (this.h == null && (drawable = this.p) != null) {
                this.h = drawable;
                D();
            }
            w(bC.n(10, 0));
            int iR = bC.r(9, 0);
            if (iR != 0) {
                View viewInflate = LayoutInflater.from(this.b.getContext()).inflate(iR, (ViewGroup) this.b, false);
                View view = this.e;
                if (view != null && (this.c & 16) != 0) {
                    this.b.removeView(view);
                }
                this.e = viewInflate;
                if (viewInflate != null && (this.c & 16) != 0) {
                    this.b.addView(viewInflate);
                }
                w(this.c | 16);
            }
            int iP = bC.p(13, 0);
            if (iP > 0) {
                ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                layoutParams.height = iP;
                this.b.setLayoutParams(layoutParams);
            }
            int iK = bC.k(7, -1);
            int iK2 = bC.k(3, -1);
            if (iK >= 0 || iK2 >= 0) {
                Toolbar toolbar2 = this.b;
                int iMax = Math.max(iK, 0);
                int iMax2 = Math.max(iK2, 0);
                toolbar2.i();
                toolbar2.t.c(iMax, iMax2);
            }
            int iR2 = bC.r(28, 0);
            if (iR2 != 0) {
                Toolbar toolbar3 = this.b;
                Context context = toolbar3.getContext();
                toolbar3.m = iR2;
                TextView textView = toolbar3.c;
                if (textView != null) {
                    textView.setTextAppearance(context, iR2);
                }
            }
            int iR3 = bC.r(26, 0);
            if (iR3 != 0) {
                Toolbar toolbar4 = this.b;
                Context context2 = toolbar4.getContext();
                toolbar4.l = iR3;
                TextView textView2 = toolbar4.d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iR3);
                }
            }
            int iR4 = bC.r(22, 0);
            if (iR4 != 0) {
                this.b.setPopupTheme(iR4);
            }
        } else {
            if (this.b.getNavigationIcon() != null) {
                this.p = this.b.getNavigationIcon();
            } else {
                i = 11;
            }
            this.c = i;
        }
        bC.d.recycle();
        if (R.string.abc_action_bar_up_description != this.f14o) {
            this.f14o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.b.getNavigationContentDescription())) {
                int i2 = this.f14o;
                this.k = i2 != 0 ? u().getString(i2) : null;
                B();
            }
        }
        this.k = this.b.getNavigationContentDescription();
        this.b.setNavigationOnClickListener(new ViewOnClickListenerC0314b(this));
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void A(boolean z) {
        this.b.setCollapsible(z);
    }

    public final void B() {
        if ((this.c & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.b.setNavigationContentDescription(this.f14o);
            } else {
                this.b.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void C(CharSequence charSequence) {
        this.a = charSequence;
        if ((this.c & 8) != 0) {
            this.b.setTitle(charSequence);
            if (this.i) {
                T.r(this.b.getRootView(), charSequence);
            }
        }
    }

    public final void D() {
        if ((this.c & 4) == 0) {
            this.b.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.b;
        Drawable drawable = this.h;
        if (drawable == null) {
            drawable = this.p;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void E() {
        Drawable drawable;
        int i = this.c;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.g;
        }
        this.b.setLogo(drawable);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean a() {
        return this.b.A();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void b(Menu menu, p.aIX aix) {
        u uVar;
        if (this.m == null) {
            a aVar = new a(this.b.getContext());
            this.m = aVar;
            aVar.i = R.id.action_menu_presenter;
        }
        a aVar2 = this.m;
        aVar2.e = aix;
        Toolbar toolbar = this.b;
        n nVar = (n) menu;
        if (nVar == null && toolbar.b == null) {
            return;
        }
        toolbar.j();
        n nVar2 = toolbar.b.q;
        if (nVar2 != nVar) {
            if (nVar2 != null) {
                nVar2.x(toolbar.L);
                nVar2.x(toolbar.N);
            }
            if (toolbar.N == null) {
                toolbar.N = toolbar.new OooO0o();
            }
            aVar2.r = true;
            if (nVar != null) {
                nVar.e(aVar2, toolbar.j);
                nVar.e(toolbar.N, toolbar.j);
            } else {
                aVar2.g(toolbar.j, null);
                Toolbar.OooO0o oooO0o = toolbar.N;
                n nVar3 = oooO0o.a;
                if (nVar3 != null && (uVar = oooO0o.b) != null) {
                    nVar3.g(uVar);
                }
                oooO0o.a = null;
                aVar2.q(true);
                toolbar.N.q(true);
            }
            toolbar.b.setPopupTheme(toolbar.k);
            toolbar.b.setPresenter(aVar2);
            toolbar.L = aVar2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean c() {
        return this.b.v();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void collapseActionView() {
        Toolbar.OooO0o oooO0o = this.b.N;
        u uVar = oooO0o == null ? null : oooO0o.b;
        if (uVar != null) {
            uVar.collapseActionView();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean d() {
        a aVar;
        ActionMenuView actionMenuView = this.b.b;
        return (actionMenuView == null || (aVar = actionMenuView.t) == null || !aVar.m()) ? false : true;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean e() {
        a aVar;
        ActionMenuView actionMenuView = this.b.b;
        return (actionMenuView == null || (aVar = actionMenuView.t) == null || (aVar.w == null && !aVar.t())) ? false : true;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void f() {
        this.n = true;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean g() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.b;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.b) != null && actionMenuView.u;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public CharSequence getTitle() {
        return this.b.getTitle();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void h(p.aIX aix, n.aII aii) {
        Toolbar toolbar = this.b;
        toolbar.O = aix;
        toolbar.E = aii;
        ActionMenuView actionMenuView = toolbar.b;
        if (actionMenuView != null) {
            actionMenuView.v = aix;
            actionMenuView.w = aii;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void i(int i) {
        this.b.setVisibility(i);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public ViewGroup j() {
        return this.b;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void n() {
        a aVar;
        ActionMenuView actionMenuView = this.b.b;
        if (actionMenuView == null || (aVar = actionMenuView.t) == null) {
            return;
        }
        aVar.e();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public int o() {
        return this.c;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public Menu p() {
        return this.b.getMenu();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void q(OooO0OO oooO0OO) {
        View view = this.d;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.b;
            if (parent == toolbar) {
                toolbar.removeView(this.d);
            }
        }
        this.d = null;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void r(int i) {
        this.f = i != 0 ? A.c(u(), i) : null;
        E();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void s(boolean z) {
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void setIcon(int i) {
        this.g = i != 0 ? A.c(u(), i) : null;
        E();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void setTitle(CharSequence charSequence) {
        this.i = true;
        C(charSequence);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void setWindowTitle(CharSequence charSequence) {
        if (this.i) {
            return;
        }
        C(charSequence);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public int t() {
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public Context u() {
        return this.b.getContext();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public ivas.gov.bisp.enumeration.p081d.R v(int i, long j) {
        ivas.gov.bisp.enumeration.p081d.R rD = T.d(this.b);
        rD.c(i == 0 ? 1.0f : 0.0f);
        rD.e(j);
        aJE aje = new aJE(i);
        View view = rD.c.get();
        if (view != null) {
            rD.h(view, aje);
        }
        return rD;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void w(int i) {
        View view;
        int i2 = this.c ^ i;
        this.c = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    B();
                }
                D();
            }
            if ((i2 & 3) != 0) {
                E();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.b.setTitle(this.a);
                    this.b.setSubtitle(this.j);
                } else {
                    this.b.setTitle((CharSequence) null);
                    this.b.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.e) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.b.addView(view);
            } else {
                this.b.removeView(view);
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public boolean x() {
        Toolbar.OooO0o oooO0o = this.b.N;
        return (oooO0o == null || oooO0o.b == null) ? false : true;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void y() {
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void z() {
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0323y
    public void setIcon(Drawable drawable) {
        this.g = drawable;
        E();
    }
}
