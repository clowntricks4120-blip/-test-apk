package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.view.menu.w;
import ivas.gov.bisp.enumeration.OooOOO0.Oooo000;
import ivas.gov.bisp.enumeration.OooOOO0.o000OOo;
import ivas.gov.bisp.enumeration.OooOOO0.o000oOoO;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0287p;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.i;
import ivas.gov.bisp.enumeration.p087j.z;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0323y;
import ivas.gov.bisp.enumeration.p088k.ab;
import ivas.gov.bisp.enumeration.p088k.af;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p103z.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public boolean A;
    public ColorStateList B;
    public boolean C;
    public final ArrayList<View> D;
    public n.aII E;
    public ArrayList<MenuItem> F;
    public final ArrayList<View> G;
    public final int[] H;
    public final i I;
    public OooOO0 J;
    public final ActionMenuView.OooO K;
    public a L;
    public c M;
    public OooO0o N;
    public p.aIX O;
    public final Runnable P;
    public boolean Q;
    public ImageButton a;
    public ActionMenuView b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public ImageButton f;
    public Drawable g;
    public CharSequence h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ab t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public class OooO00o implements ActionMenuView.OooO {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.A();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OooO0o oooO0o = Toolbar.this.N;
            u uVar = oooO0o == null ? null : oooO0o.b;
            if (uVar != null) {
                uVar.collapseActionView();
            }
        }
    }

    public class OooO0o implements p {
        public n a;
        public u b;

        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.p
        public Parcelable a() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.p
        public void b(n nVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.p
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.p
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.p
        public void g(Context context, n nVar) {
            u uVar;
            n nVar2 = this.a;
            if (nVar2 != null && (uVar = this.b) != null) {
                nVar2.g(uVar);
            }
            this.a = nVar;
        }

        @Override // androidx.appcompat.view.menu.p
        public boolean h(n nVar, u uVar) {
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof ivas.gov.bisp.enumeration.p099u.c) {
                ((ivas.gov.bisp.enumeration.p099u.c) callback).a();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.a);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            int size = toolbar3.G.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.G.clear();
                    this.b = null;
                    Toolbar.this.requestLayout();
                    uVar.B = false;
                    uVar.m.r(false);
                    return true;
                }
                toolbar3.addView(toolbar3.G.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.p
        public void n(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.p
        public boolean o(n nVar, u uVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.a.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.a);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.a);
            }
            Toolbar.this.i = uVar.getActionView();
            this.b = uVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                OooO oooOGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                oooOGenerateDefaultLayoutParams.a = (toolbar4.n & 112) | 8388611;
                oooOGenerateDefaultLayoutParams.b = 2;
                toolbar4.i.setLayoutParams(oooOGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((OooO) childAt.getLayoutParams()).b != 2 && childAt != toolbar6.b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.G.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            uVar.B = true;
            uVar.m.r(false);
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof ivas.gov.bisp.enumeration.p099u.c) {
                ((ivas.gov.bisp.enumeration.p099u.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.p
        public void q(boolean z) {
            if (this.b != null) {
                n nVar = this.a;
                if (nVar != null) {
                    int size = nVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.getItem(i) == this.b) {
                            return;
                        }
                    }
                }
                h(this.a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.p
        public boolean r(w wVar) {
            return false;
        }
    }

    public interface OooOO0 {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ivas.gov.bisp.enumeration.p099u.i(getContext());
    }

    public boolean A() {
        a aVar;
        ActionMenuView actionMenuView = this.b;
        return (actionMenuView == null || (aVar = actionMenuView.t) == null || !aVar.u()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof OooO);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public OooO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof OooO) {
            return new OooO((OooO) layoutParams);
        }
        if (layoutParams instanceof z.aJI) {
            return new OooO((z.aJI) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO((ViewGroup.MarginLayoutParams) layoutParams) : new OooO(layoutParams);
    }

    public final void f(List<View> list, int i) {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        boolean z = T.aWY.f(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, T.aWY.f(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                OooO oooO = (OooO) childAt.getLayoutParams();
                if (oooO.b == 0 && z(childAt) && n(oooO.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            OooO oooO2 = (OooO) childAt2.getLayoutParams();
            if (oooO2.b == 0 && z(childAt2) && n(oooO2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void g(View view, boolean z) {
        OooO oooOGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            oooOGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            oooOGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (OooO) layoutParams;
        }
        oooOGenerateLayoutParams.b = 1;
        if (!z || this.i == null) {
            addView(view, oooOGenerateLayoutParams);
        } else {
            view.setLayoutParams(oooOGenerateLayoutParams);
            this.G.add(view);
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.a;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.a;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ab abVar = this.t;
        if (abVar != null) {
            return abVar.i ? abVar.c : abVar.d;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i == Integer.MIN_VALUE ? getContentInsetEnd() : i;
    }

    public int getContentInsetLeft() {
        ab abVar = this.t;
        if (abVar != null) {
            return abVar.c;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ab abVar = this.t;
        if (abVar != null) {
            return abVar.d;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ab abVar = this.t;
        if (abVar != null) {
            return abVar.i ? abVar.d : abVar.c;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i == Integer.MIN_VALUE ? getContentInsetStart() : i;
    }

    public int getCurrentContentInsetEnd() {
        n nVar;
        ActionMenuView actionMenuView = this.b;
        return (actionMenuView == null || (nVar = actionMenuView.q) == null || !nVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.w, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        return T.aWY.f(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        return T.aWY.f(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.b.getMenu();
    }

    public View getNavButtonView() {
        return this.f;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.x;
    }

    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public int getTitleMarginEnd() {
        return this.p;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.c;
    }

    public InterfaceC0323y getWrapper() {
        if (this.M == null) {
            this.M = new c(this, true);
        }
        return this.M;
    }

    public void h() {
        if (this.a == null) {
            Oooo000 oooo000 = new Oooo000(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.a = oooo000;
            oooo000.setImageDrawable(this.g);
            this.a.setContentDescription(this.h);
            OooO oooOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            oooOGenerateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            oooOGenerateDefaultLayoutParams.b = 2;
            this.a.setLayoutParams(oooOGenerateDefaultLayoutParams);
            this.a.setOnClickListener(new OooO0OO());
        }
    }

    public final void i() {
        if (this.t == null) {
            this.t = new ab();
        }
    }

    public final void j() {
        if (this.b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.b = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.b.setOnMenuItemClickListener(this.K);
            ActionMenuView actionMenuView2 = this.b;
            p.aIX aix = this.O;
            n.aII aii = this.E;
            actionMenuView2.v = aix;
            actionMenuView2.w = aii;
            OooO oooOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            oooOGenerateDefaultLayoutParams.a = (this.n & 112) | 8388613;
            this.b.setLayoutParams(oooOGenerateDefaultLayoutParams);
            g(this.b, false);
        }
    }

    public final void k() {
        j();
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView.q == null) {
            n nVar = (n) actionMenuView.getMenu();
            if (this.N == null) {
                this.N = new OooO0o();
            }
            this.b.setExpandedActionViewsExclusive(true);
            nVar.e(this.N, this.j);
        }
    }

    public final void l() {
        if (this.f == null) {
            this.f = new Oooo000(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            OooO oooOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            oooOGenerateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            this.f.setLayoutParams(oooOGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public OooO generateDefaultLayoutParams() {
        return new OooO(-2, -2);
    }

    public final int n(int i) {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        int iF = T.aWY.f(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iF) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return iF == 1 ? 5 : 3;
    }

    public final int o(View view, int i) {
        OooO oooO = (OooO) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = oooO.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.s & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) oooO).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) oooO).topMargin;
        if (iMax >= i4) {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        } else {
            iMax = i4;
        }
        return paddingTop + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0291 A[LOOP:0: B:102:0x028f->B:103:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b3 A[LOOP:1: B:105:0x02b1->B:106:0x02b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9 A[LOOP:2: B:108:0x02d7->B:109:0x02d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x031b  */
    /* JADX WARN: Code duplicated, block: B:114:0x031f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0329 A[LOOP:3: B:116:0x0327->B:117:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:89:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233  */
    /* JADX WARN: Code duplicated, block: B:95:0x0256  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iU;
        int iW;
        int iMax;
        int iMin;
        boolean z2;
        boolean z3;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        OooO oooO;
        OooO oooO2;
        boolean z4;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int size2;
        int i19;
        ArrayList<View> arrayList;
        int size3;
        int i20;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int size4;
        int i25;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        boolean z5 = T.aWY.f(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.H;
        iArr[1] = 0;
        iArr[0] = 0;
        int iF = T.aWX.f(this);
        int iMin2 = iF >= 0 ? Math.min(iF, i4 - i2) : 0;
        if (z(this.f)) {
            if (z5) {
                iW = w(this.f, i26, iArr, iMin2);
                iU = paddingLeft;
            } else {
                iU = u(this.f, paddingLeft, iArr, iMin2);
            }
            if (z(this.a)) {
                if (z5) {
                    iW = w(this.a, iW, iArr, iMin2);
                } else {
                    iU = u(this.a, iU, iArr, iMin2);
                }
            }
            if (z(this.b)) {
                if (z5) {
                    iU = u(this.b, iU, iArr, iMin2);
                } else {
                    iW = w(this.b, iW, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iU);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iW));
            iMax = Math.max(iU, currentContentInsetLeft);
            iMin = Math.min(iW, i26 - currentContentInsetRight);
            if (z(this.i)) {
                if (z5) {
                    iMin = w(this.i, iMin, iArr, iMin2);
                } else {
                    iMax = u(this.i, iMax, iArr, iMin2);
                }
            }
            if (z(this.e)) {
                if (z5) {
                    iMin = w(this.e, iMin, iArr, iMin2);
                } else {
                    iMax = u(this.e, iMax, iArr, iMin2);
                }
            }
            z2 = z(this.c);
            z3 = z(this.d);
            if (z2) {
                OooO oooO3 = (OooO) this.c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) oooO3).bottomMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (z3) {
                OooO oooO4 = (OooO) this.d.getLayoutParams();
                measuredHeight += this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO4).topMargin + ((ViewGroup.MarginLayoutParams) oooO4).bottomMargin;
            }
            if (!z2 || z3) {
                if (z2) {
                    textView = this.c;
                } else {
                    textView = this.d;
                }
                if (z3) {
                    textView2 = this.d;
                } else {
                    textView2 = this.c;
                }
                oooO = (OooO) textView.getLayoutParams();
                oooO2 = (OooO) textView2.getLayoutParams();
                z4 = (!z2 && this.c.getMeasuredWidth() > 0) || (z3 && this.d.getMeasuredWidth() > 0);
                i5 = this.s & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
                        i16 = this.u;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) oooO2).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) oooO2).bottomMargin) - this.u) - measuredHeight;
                }
                if (z5) {
                    if (z4) {
                        i10 = this.q;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (z2) {
                        OooO oooO5 = (OooO) this.c.getLayoutParams();
                        int measuredWidth2 = iMin - this.c.getMeasuredWidth();
                        int measuredHeight2 = this.c.getMeasuredHeight() + paddingTop;
                        this.c.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.p;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) oooO5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (z3) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                        this.d.layout(iMin - this.d.getMeasuredWidth(), i28, iMin, this.d.getMeasuredHeight() + i28);
                        i12 = iMin - this.p;
                    } else {
                        i12 = iMin;
                    }
                    if (z4) {
                        iMin = Math.min(i11, i12);
                    }
                } else {
                    if (z4) {
                        i7 = this.q;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax += Math.max(0, i29);
                    iArr[0] = Math.max(0, -i29);
                    if (z2) {
                        OooO oooO6 = (OooO) this.c.getLayoutParams();
                        int measuredWidth3 = this.c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.c.getMeasuredHeight() + paddingTop;
                        this.c.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.p;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) oooO6).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (z3) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.d.getMeasuredWidth() + iMax;
                        this.d.layout(iMax, i30, measuredWidth4, this.d.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.p;
                    } else {
                        i9 = iMax;
                    }
                    if (z4) {
                        iMax = Math.max(i8, i9);
                    }
                }
            } else {
                i6 = paddingLeft;
                iMin2 = iMin2;
            }
            f(this.D, 3);
            size = this.D.size();
            for (i17 = 0; i17 < size; i17++) {
                iMax = u(this.D.get(i17), iMax, iArr, iMin2);
            }
            i18 = iMin2;
            f(this.D, 5);
            size2 = this.D.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = w(this.D.get(i19), iMin, iArr, i18);
            }
            f(this.D, 1);
            arrayList = this.D;
            int i31 = iArr[0];
            int i32 = iArr[1];
            size3 = arrayList.size();
            i20 = i32;
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = arrayList.get(i22);
                OooO oooO7 = (OooO) view.getLayoutParams();
                int i33 = ((ViewGroup.MarginLayoutParams) oooO7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) oooO7).rightMargin - i20;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i20 = iMax6;
                i21 = iMax5;
            }
            i23 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i24 = measuredWidth + i23;
            if (i23 >= iMax) {
                if (i24 > iMin) {
                    iMax = i23 - (i24 - iMin);
                } else {
                    iMax = i23;
                }
            }
            size4 = this.D.size();
            for (i25 = 0; i25 < size4; i25++) {
                iMax = u(this.D.get(i25), iMax, iArr, i18);
            }
            this.D.clear();
        }
        iU = paddingLeft;
        iW = i26;
        if (z(this.a)) {
            if (z5) {
                iW = w(this.a, iW, iArr, iMin2);
            } else {
                iU = u(this.a, iU, iArr, iMin2);
            }
        }
        if (z(this.b)) {
            if (z5) {
                iU = u(this.b, iU, iArr, iMin2);
            } else {
                iW = w(this.b, iW, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iU);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iW));
        iMax = Math.max(iU, currentContentInsetLeft2);
        iMin = Math.min(iW, i26 - currentContentInsetRight2);
        if (z(this.i)) {
            if (z5) {
                iMin = w(this.i, iMin, iArr, iMin2);
            } else {
                iMax = u(this.i, iMax, iArr, iMin2);
            }
        }
        if (z(this.e)) {
            if (z5) {
                iMin = w(this.e, iMin, iArr, iMin2);
            } else {
                iMax = u(this.e, iMax, iArr, iMin2);
            }
        }
        z2 = z(this.c);
        z3 = z(this.d);
        if (z2) {
            OooO oooO8 = (OooO) this.c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) oooO8).bottomMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (z3) {
            OooO oooO9 = (OooO) this.d.getLayoutParams();
            measuredHeight += this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO9).topMargin + ((ViewGroup.MarginLayoutParams) oooO9).bottomMargin;
        }
        if (z2) {
            if (z2) {
                textView = this.c;
            } else {
                textView = this.d;
            }
            if (z3) {
                textView2 = this.d;
            } else {
                textView2 = this.c;
            }
            oooO = (OooO) textView.getLayoutParams();
            oooO2 = (OooO) textView2.getLayoutParams();
            if (z2) {
            }
            i5 = this.s & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
                    i16 = this.u;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) oooO2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) oooO2).bottomMargin) - this.u) - measuredHeight;
            }
            if (z5) {
                if (z4) {
                    i10 = this.q;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (z2) {
                    OooO oooO10 = (OooO) this.c.getLayoutParams();
                    int measuredWidth5 = iMin - this.c.getMeasuredWidth();
                    int measuredHeight4 = this.c.getMeasuredHeight() + paddingTop;
                    this.c.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.p;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) oooO10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z3) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                    this.d.layout(iMin - this.d.getMeasuredWidth(), i211, iMin, this.d.getMeasuredHeight() + i211);
                    i12 = iMin - this.p;
                } else {
                    i12 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z4) {
                    i7 = this.q;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax += Math.max(0, i212);
                iArr[0] = Math.max(0, -i212);
                if (z2) {
                    OooO oooO11 = (OooO) this.c.getLayoutParams();
                    int measuredWidth6 = this.c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.c.getMeasuredHeight() + paddingTop;
                    this.c.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.p;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) oooO11).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z3) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.d.getMeasuredWidth() + iMax;
                    this.d.layout(iMax, i35, measuredWidth7, this.d.getMeasuredHeight() + i35);
                    i9 = measuredWidth7 + this.p;
                } else {
                    i9 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (z2) {
                textView = this.c;
            } else {
                textView = this.d;
            }
            if (z3) {
                textView2 = this.d;
            } else {
                textView2 = this.c;
            }
            oooO = (OooO) textView.getLayoutParams();
            oooO2 = (OooO) textView2.getLayoutParams();
            if (z2) {
            }
            i5 = this.s & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) oooO).topMargin + this.r;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
                    i16 = this.u;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) oooO2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) oooO2).bottomMargin) - this.u) - measuredHeight;
            }
            if (z5) {
                if (z4) {
                    i10 = this.q;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (z2) {
                    OooO oooO12 = (OooO) this.c.getLayoutParams();
                    int measuredWidth8 = iMin - this.c.getMeasuredWidth();
                    int measuredHeight6 = this.c.getMeasuredHeight() + paddingTop;
                    this.c.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.p;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) oooO12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z3) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                    this.d.layout(iMin - this.d.getMeasuredWidth(), i214, iMin, this.d.getMeasuredHeight() + i214);
                    i12 = iMin - this.p;
                } else {
                    i12 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z4) {
                    i7 = this.q;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax += Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (z2) {
                    OooO oooO13 = (OooO) this.c.getLayoutParams();
                    int measuredWidth9 = this.c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.c.getMeasuredHeight() + paddingTop;
                    this.c.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.p;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) oooO13).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z3) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((OooO) this.d.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.d.getMeasuredWidth() + iMax;
                    this.d.layout(iMax, i36, measuredWidth10, this.d.getMeasuredHeight() + i36);
                    i9 = measuredWidth10 + this.p;
                } else {
                    i9 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        f(this.D, 3);
        size = this.D.size();
        while (i17 < size) {
            iMax = u(this.D.get(i17), iMax, iArr, iMin2);
        }
        i18 = iMin2;
        f(this.D, 5);
        size2 = this.D.size();
        while (i19 < size2) {
            iMin = w(this.D.get(i19), iMin, iArr, i18);
        }
        f(this.D, 1);
        arrayList = this.D;
        int i37 = iArr[0];
        int i38 = iArr[1];
        size3 = arrayList.size();
        i20 = i38;
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = arrayList.get(i22);
            OooO oooO14 = (OooO) view2.getLayoutParams();
            int i39 = ((ViewGroup.MarginLayoutParams) oooO14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) oooO14).rightMargin - i20;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i20 = iMax10;
            i21 = iMax9;
        }
        i23 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i24 = measuredWidth + i23;
        if (i23 >= iMax) {
            if (i24 > iMin) {
                iMax = i23 - (i24 - iMin);
            } else {
                iMax = i23;
            }
        }
        size4 = this.D.size();
        while (i25 < size4) {
            iMax = u(this.D.get(i25), iMax, iArr, i18);
        }
        this.D.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iP;
        int iMax;
        int iCombineMeasuredStates;
        int iP2;
        int iR;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.H;
        boolean zB = aj.b(this);
        int i3 = 0;
        if (z(this.f)) {
            x(this.f, i, 0, i2, 0, this.f12o);
            iP = p(this.f) + this.f.getMeasuredWidth();
            iMax = Math.max(0, r(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f.getMeasuredState());
        } else {
            iP = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (z(this.a)) {
            x(this.a, i, 0, i2, 0, this.f12o);
            iP = p(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, r(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iP);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - iP);
        if (z(this.b)) {
            x(this.b, i, iMax3, i2, 0, this.f12o);
            iP2 = p(this.b) + this.b.getMeasuredWidth();
            iMax = Math.max(iMax, r(this.b) + this.b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
        } else {
            iP2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iP2);
        iArr[!zB ? 1 : 0] = Math.max(0, currentContentInsetEnd - iP2);
        if (z(this.i)) {
            iMax4 += y(this.i, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, r(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (z(this.e)) {
            iMax4 += y(this.e, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, r(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((OooO) childAt.getLayoutParams()).b == 0 && z(childAt)) {
                iMax4 += y(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, r(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.r + this.u;
        int i6 = this.q + this.p;
        if (z(this.c)) {
            y(this.c, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth = this.c.getMeasuredWidth();
            int iP3 = p(this.c);
            iR = r(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
            iMax2 = iP3 + measuredWidth;
        } else {
            iR = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (z(this.d)) {
            iMax2 = Math.max(iMax2, y(this.d, i, iMax4 + i6, i2, iR + i5, iArr));
            iR += r(this.d) + this.d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iR);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + paddingLeft + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom + paddingTop + iMax5, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.Q) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (z(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof OooOO0O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOO0O oooOO0O = (OooOO0O) parcelable;
        super.onRestoreInstanceState(oooOO0O.e);
        ActionMenuView actionMenuView = this.b;
        n nVar = actionMenuView != null ? actionMenuView.q : null;
        int i = oooOO0O.b;
        if (i != 0 && this.N != null && nVar != null && (menuItemFindItem = nVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (oooOO0O.c) {
            removeCallbacks(this.P);
            post(this.P);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        i();
        ab abVar = this.t;
        boolean z = i == 1;
        if (z != abVar.i) {
            abVar.i = z;
            if (!abVar.j) {
                abVar.c = abVar.h;
                abVar.d = abVar.g;
                return;
            }
            if (z) {
                int i2 = abVar.f;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = abVar.h;
                }
                abVar.c = i2;
                int i3 = abVar.e;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = abVar.g;
                }
                abVar.d = i3;
                return;
            }
            int i4 = abVar.e;
            if (i4 == Integer.MIN_VALUE) {
                i4 = abVar.h;
            }
            abVar.c = i4;
            int i5 = abVar.f;
            if (i5 == Integer.MIN_VALUE) {
                i5 = abVar.g;
            }
            abVar.d = i5;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        u uVar;
        OooOO0O oooOO0O = new OooOO0O(super.onSaveInstanceState());
        OooO0o oooO0o = this.N;
        if (oooO0o != null && (uVar = oooO0o.b) != null) {
            oooOO0O.b = uVar.b;
        }
        oooOO0O.c = v();
        return oooOO0O;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = false;
        }
        if (!this.A) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.A = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A = false;
        }
        return true;
    }

    public final int p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void q(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void s() {
        Iterator<MenuItem> it = this.F.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        i iVar = this.I;
        Menu menu = getMenu();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0287p> it2 = iVar.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.F = currentMenuItems2;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(A.c(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.Q = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(A.c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(A.c(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OooOO0 oooOO0) {
        this.J = oooOO0;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return view.getParent() == this || this.G.contains(view);
    }

    public final int u(View view, int i, int[] iArr, int i2) {
        OooO oooO = (OooO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iO = o(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iO, iMax + measuredWidth, view.getMeasuredHeight() + iO);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) oooO).rightMargin + iMax;
    }

    public boolean v() {
        a aVar;
        ActionMenuView actionMenuView = this.b;
        return (actionMenuView == null || (aVar = actionMenuView.t) == null || !aVar.t()) ? false : true;
    }

    public final int w(View view, int i, int[] iArr, int i2) {
        OooO oooO = (OooO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iO = o(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iO, iMax, view.getMeasuredHeight() + iO);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) oooO).leftMargin);
    }

    public final void x(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = marginLayoutParams.leftMargin;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight + paddingLeft + i6 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingBottom + paddingTop + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int y(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        int paddingLeft = getPaddingLeft();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + paddingLeft + iMax + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i3, paddingBottom + paddingTop + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final boolean z(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public static class OooO extends z.aJI {
        public int b;

        public OooO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public OooO(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public OooO(OooO oooO) {
            super((z.aJI) oooO);
            this.b = 0;
            this.b = oooO.b;
        }

        public OooO(z.aJI aji) {
            super(aji);
            this.b = 0;
        }

        public OooO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public OooO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = 8388627;
        this.D = new ArrayList<>();
        this.G = new ArrayList<>();
        this.H = new int[2];
        this.I = new i(new af(this, 0));
        this.F = new ArrayList<>();
        this.K = new OooO00o();
        this.P = new OooO0O0();
        Context context2 = getContext();
        int[] iArr = h.v;
        B bC = B.c(context2, attributeSet, iArr, i, 0);
        T.p(this, context, iArr, attributeSet, bC.d, i, 0);
        this.m = bC.r(28, 0);
        this.l = bC.r(19, 0);
        this.s = bC.o(0, this.s);
        this.n = bC.o(2, 48);
        int iK = bC.k(22, 0);
        iK = bC.t(27) ? bC.k(27, iK) : iK;
        this.u = iK;
        this.r = iK;
        this.p = iK;
        this.q = iK;
        int iK2 = bC.k(25, -1);
        if (iK2 >= 0) {
            this.q = iK2;
        }
        int iK3 = bC.k(24, -1);
        if (iK3 >= 0) {
            this.p = iK3;
        }
        int iK4 = bC.k(26, -1);
        if (iK4 >= 0) {
            this.r = iK4;
        }
        int iK5 = bC.k(23, -1);
        if (iK5 >= 0) {
            this.u = iK5;
        }
        this.f12o = bC.j(13, -1);
        int iK6 = bC.k(9, Integer.MIN_VALUE);
        int iK7 = bC.k(5, Integer.MIN_VALUE);
        int iJ = bC.j(7, 0);
        int iJ2 = bC.j(8, 0);
        i();
        ab abVar = this.t;
        abVar.j = false;
        if (iJ != Integer.MIN_VALUE) {
            abVar.h = iJ;
            abVar.c = iJ;
        }
        if (iJ2 != Integer.MIN_VALUE) {
            abVar.g = iJ2;
            abVar.d = iJ2;
        }
        if (iK6 != Integer.MIN_VALUE || iK7 != Integer.MIN_VALUE) {
            abVar.c(iK6, iK7);
        }
        this.v = bC.k(10, Integer.MIN_VALUE);
        this.w = bC.k(6, Integer.MIN_VALUE);
        this.g = bC.l(4);
        this.h = bC.s(3);
        CharSequence charSequenceS = bC.s(21);
        if (!TextUtils.isEmpty(charSequenceS)) {
            setTitle(charSequenceS);
        }
        CharSequence charSequenceS2 = bC.s(18);
        if (!TextUtils.isEmpty(charSequenceS2)) {
            setSubtitle(charSequenceS2);
        }
        this.j = getContext();
        setPopupTheme(bC.r(17, 0));
        Drawable drawableL = bC.l(16);
        if (drawableL != null) {
            setNavigationIcon(drawableL);
        }
        CharSequence charSequenceS3 = bC.s(15);
        if (!TextUtils.isEmpty(charSequenceS3)) {
            setNavigationContentDescription(charSequenceS3);
        }
        Drawable drawableL2 = bC.l(11);
        if (drawableL2 != null) {
            setLogo(drawableL2);
        }
        CharSequence charSequenceS4 = bC.s(12);
        if (!TextUtils.isEmpty(charSequenceS4)) {
            setLogoDescription(charSequenceS4);
        }
        if (bC.t(29)) {
            setTitleTextColor(bC.h(29));
        }
        if (bC.t(20)) {
            setSubtitleTextColor(bC.h(20));
        }
        if (bC.t(14)) {
            getMenuInflater().inflate(bC.r(14, 0), getMenu());
        }
        bC.d.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.a;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.a.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.a;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new o000oOoO(getContext(), null, 0);
            }
            if (!t(this.e)) {
                g(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && t(imageView)) {
                removeView(this.e);
                this.G.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new o000oOoO(getContext(), null, 0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0315d.b(this.f, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!t(this.f)) {
                g(this.f, true);
            }
        } else {
            ImageButton imageButton = this.f;
            if (imageButton != null && t(imageButton)) {
                removeView(this.f);
                this.G.remove(this.f);
            }
        }
        ImageButton imageButton2 = this.f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.d;
            if (textView != null && t(textView)) {
                removeView(this.d);
                this.G.remove(this.d);
            }
        } else {
            if (this.d == null) {
                Context context = getContext();
                o000OOo o000ooo = new o000OOo(context, null);
                this.d = o000ooo;
                o000ooo.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!t(this.d)) {
                g(this.d, true);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && t(textView)) {
                removeView(this.c);
                this.G.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                o000OOo o000ooo = new o000OOo(context, null);
                this.c = o000ooo;
                o000ooo.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!t(this.c)) {
                g(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class OooOO0O extends l {
        public static final Parcelable.Creator<OooOO0O> CREATOR = new OooO00o();
        public int b;
        public boolean c;

        public class OooO00o implements Parcelable.ClassLoaderCreator<OooOO0O> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public OooOO0O createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new OooOO0O(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new OooOO0O[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new OooOO0O(parcel, null);
            }
        }

        public OooOO0O(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public OooOO0O(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
