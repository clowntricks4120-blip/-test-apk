package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.view.menu.w;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p097r.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends q {
    public OooO00o$OooO0o j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13o;
    public int p;
    public int q;
    public boolean r;
    public aJq s;
    public aJt t;
    public final SparseBooleanArray u;
    public aJp v;
    public aJr w;
    public int x;
    public final aJu y;

    public class aJp extends k {
        public aJp(Context context, w wVar, View view) {
            super(context, wVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!wVar.A.j()) {
                View view2 = a.this.j;
                this.f = view2 == null ? (View) a.this.a : view2;
            }
            e(a.this.y);
        }

        @Override // androidx.appcompat.view.menu.k
        public void d() {
            a aVar = a.this;
            aVar.v = null;
            aVar.x = 0;
            super.d();
        }
    }

    public class aJq extends ActionMenuItemView.OooO0O0 {
        public aJq() {
        }
    }

    public class aJr implements Runnable {
        public aJt a;

        public aJr(aJt ajt) {
            this.a = ajt;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.aII aii;
            n nVar = a.this.d;
            if (nVar != null && (aii = nVar.h) != null) {
                aii.e(nVar);
            }
            View view = (View) a.this.a;
            if (view != null && view.getWindowToken() != null && this.a.f()) {
                a.this.t = this.a;
            }
            a.this.w = null;
        }
    }

    public class aJt extends k {
        public aJt(Context context, n nVar, View view, boolean z) {
            super(context, nVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.h = 8388613;
            e(a.this.y);
        }

        @Override // androidx.appcompat.view.menu.k
        public void d() {
            n nVar = a.this.d;
            if (nVar != null) {
                nVar.f(true);
            }
            a.this.t = null;
            super.d();
        }
    }

    public class aJu implements p.aIX {
        public aJu() {
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public void b(n nVar, boolean z) {
            if (nVar instanceof w) {
                nVar.m().f(false);
            }
            p.aIX aix = a.this.e;
            if (aix != null) {
                aix.b(nVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public boolean e(n nVar) {
            a aVar = a.this;
            if (nVar == aVar.d) {
                return false;
            }
            aVar.x = ((w) nVar).A.b;
            p.aIX aix = aVar.e;
            if (aix != null) {
                return aix.e(nVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class aJv implements Parcelable {
        public static final Parcelable.Creator<aJv> CREATOR = new aJw();
        public int b;

        public class aJw implements Parcelable.Creator<aJv> {
            @Override // android.os.Parcelable.Creator
            public aJv createFromParcel(Parcel parcel) {
                return new aJv(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public aJv[] newArray(int i) {
                return new aJv[i];
            }
        }

        public aJv() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }

        public aJv(Parcel parcel) {
            this.b = parcel.readInt();
        }
    }

    public a(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.u = new SparseBooleanArray();
        this.y = new aJu();
    }

    @Override // androidx.appcompat.view.menu.p
    public Parcelable a() {
        aJv ajv = new aJv();
        ajv.b = this.x;
        return ajv;
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(n nVar, boolean z) {
        e();
        p.aIX aix = this.e;
        if (aix != null) {
            aix.b(nVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean d() {
        int size;
        ArrayList<u> arrayListN;
        int i;
        boolean z;
        n nVar = this.d;
        if (nVar != null) {
            arrayListN = nVar.n();
            size = arrayListN.size();
        } else {
            size = 0;
            arrayListN = null;
        }
        int i2 = this.p;
        int i3 = this.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.a;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            u uVar = arrayListN.get(i4);
            int i7 = uVar.z;
            if ((i7 & 2) == 2) {
                i6++;
            } else if ((i7 & 1) == 1) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.r && uVar.B) {
                i2 = 0;
            }
            i4++;
        }
        if (this.l && (z2 || i5 + i6 > i2)) {
            i2--;
        }
        int i8 = i2 - i6;
        SparseBooleanArray sparseBooleanArray = this.u;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            u uVar2 = arrayListN.get(i9);
            int i11 = uVar2.z;
            if ((i11 & 2) == i) {
                View viewI = i(uVar2, null, viewGroup);
                viewI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewI.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = uVar2.c;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                uVar2.n(z);
            } else {
                if ((i11 & 1) == z) {
                    int i13 = uVar2.c;
                    boolean z3 = sparseBooleanArray.get(i13);
                    boolean z4 = ((i8 > 0 || z3) && i3 > 0) ? z : false;
                    if (z4) {
                        View viewI2 = i(uVar2, null, viewGroup);
                        viewI2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewI2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z4 &= i3 + i10 > 0;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i9; i14++) {
                            u uVar3 = arrayListN.get(i14);
                            if (uVar3.c == i13) {
                                if (uVar3.j()) {
                                    i8++;
                                }
                                uVar3.n(false);
                            }
                        }
                    }
                    if (z4) {
                        i8--;
                    }
                    uVar2.n(z4);
                } else {
                    uVar2.n(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    public boolean e() {
        return m() | s();
    }

    @Override // androidx.appcompat.view.menu.p
    public void g(Context context, n nVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = nVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.l = true;
        }
        int i = 2;
        this.f13o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int measuredWidth = this.f13o;
        if (this.l) {
            if (this.j == null) {
                OooO00o$OooO0o oooO00o$OooO0o = new OooO00o$OooO0o(this, this.b);
                this.j = oooO00o$OooO0o;
                if (this.m) {
                    oooO00o$OooO0o.setImageDrawable(this.k);
                    this.k = null;
                    this.m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.q = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i(u uVar, View view, ViewGroup viewGroup) {
        View actionView = uVar.getActionView();
        if (actionView == null || uVar.h()) {
            m.aIE aie = view instanceof m.aIE ? (m.aIE) view : (m.aIE) this.f.inflate(this.h, viewGroup, false);
            aie.d(uVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aie;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.a);
            if (this.s == null) {
                this.s = new aJq();
            }
            actionMenuItemView.setPopupCallback(this.s);
            actionView = (View) aie;
        }
        actionView.setVisibility(uVar.B ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean m() {
        Object obj;
        aJr ajr = this.w;
        if (ajr != null && (obj = this.a) != null) {
            ((View) obj).removeCallbacks(ajr);
            this.w = null;
            return true;
        }
        aJt ajt = this.t;
        if (ajt == null) {
            return false;
        }
        if (ajt.c()) {
            ajt.j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void n(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof aJv) && (i = ((aJv) parcelable).b) > 0 && (menuItemFindItem = this.d.findItem(i)) != null) {
            r((w) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.p
    public void q(boolean z) {
        int size;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.a;
        ArrayList<u> arrayList = null;
        if (viewGroup != null) {
            n nVar = this.d;
            if (nVar != null) {
                nVar.c();
                ArrayList<u> arrayListN = this.d.n();
                int size2 = arrayListN.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    u uVar = arrayListN.get(i2);
                    if (uVar.j()) {
                        View childAt = viewGroup.getChildAt(i);
                        u itemData = childAt instanceof m.aIE ? ((m.aIE) childAt).getItemData() : null;
                        View viewI = i(uVar, childAt, viewGroup);
                        if (uVar != itemData) {
                            viewI.setPressed(false);
                            viewI.jumpDrawablesToCurrentState();
                        }
                        if (viewI != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewI.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewI);
                            }
                            ((ViewGroup) this.a).addView(viewI, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.a).requestLayout();
        n nVar2 = this.d;
        if (nVar2 != null) {
            nVar2.c();
            ArrayList<u> arrayList2 = nVar2.b;
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ivas.gov.bisp.enumeration.p081d.c cVar = arrayList2.get(i3).A;
            }
        }
        n nVar3 = this.d;
        if (nVar3 != null) {
            nVar3.c();
            arrayList = nVar3.k;
        }
        if (!this.l || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!arrayList.get(0).B))) {
            OooO00o$OooO0o oooO00o$OooO0o = this.j;
            if (oooO00o$OooO0o != null) {
                Object parent = oooO00o$OooO0o.getParent();
                Object obj = this.a;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        } else {
            if (this.j == null) {
                this.j = new OooO00o$OooO0o(this, this.b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.a) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.a;
                OooO00o$OooO0o oooO00o$OooO0o2 = this.j;
                ActionMenuView.OooO0OO oooO0OOGenerateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                oooO0OOGenerateDefaultLayoutParams.a = true;
                actionMenuView.addView(oooO00o$OooO0o2, oooO0OOGenerateDefaultLayoutParams);
            }
        }
        ((ActionMenuView) this.a).setOverflowReserved(this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.p
    public boolean r(w wVar) {
        boolean z = false;
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        w wVar2 = wVar;
        while (true) {
            n nVar = wVar2.z;
            if (nVar == this.d) {
                break;
            }
            wVar2 = (w) nVar;
        }
        u uVar = wVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.a;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof m.aIE) && ((m.aIE) childAt).getItemData() == uVar) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.x = wVar.A.b;
        int size = wVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = wVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        aJp ajp = new aJp(this.c, wVar, view);
        this.v = ajp;
        ajp.i = z;
        l lVar = ajp.j;
        if (lVar != null) {
            lVar.t(z);
        }
        if (!this.v.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        p.aIX aix = this.e;
        if (aix != null) {
            aix.e(wVar);
        }
        return true;
    }

    public boolean s() {
        aJp ajp = this.v;
        if (ajp == null) {
            return false;
        }
        if (!ajp.c()) {
            return true;
        }
        ajp.j.dismiss();
        return true;
    }

    public boolean t() {
        aJt ajt = this.t;
        return ajt != null && ajt.c();
    }

    public boolean u() {
        n nVar;
        if (!this.l || t() || (nVar = this.d) == null || this.a == null || this.w != null) {
            return false;
        }
        nVar.c();
        if (nVar.k.isEmpty()) {
            return false;
        }
        aJr ajr = new aJr(new aJt(this.c, this.d, this.j, true));
        this.w = ajr;
        ((View) this.a).post(ajr);
        return true;
    }
}
