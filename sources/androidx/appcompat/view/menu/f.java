package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0319q;
import ivas.gov.bisp.enumeration.p088k.Z;
import ivas.gov.bisp.enumeration.p097r.l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context b;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f5o;
    public int p;
    public View q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public int v;
    public ViewTreeObserver x;
    public p.aIX y;
    public PopupWindow.OnDismissListener z;
    public final List<n> a = new ArrayList();
    public final List<aIT> i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new aIO();
    public final View.OnAttachStateChangeListener k = new aIP();
    public final InterfaceC0319q m = new aIQ();
    public int l = 0;
    public int n = 0;
    public boolean w = false;

    public class aIO implements ViewTreeObserver.OnGlobalLayoutListener {
        public aIO() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws Throwable {
            if (!f.this.e() || f.this.i.size() <= 0 || f.this.i.get(0).a.D) {
                return;
            }
            View view = f.this.q;
            if (view == null || !view.isShown()) {
                f.this.dismiss();
                return;
            }
            Iterator<aIT> it = f.this.i.iterator();
            while (it.hasNext()) {
                it.next().a.f();
            }
        }
    }

    public class aIP implements View.OnAttachStateChangeListener {
        public aIP() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = f.this.x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    f.this.x = view.getViewTreeObserver();
                }
                f fVar = f.this;
                fVar.x.removeGlobalOnLayoutListener(fVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class aIQ implements InterfaceC0319q {

        public class aIS implements Runnable {
            public final /* synthetic */ aIT a;
            public final /* synthetic */ MenuItem b;
            public final /* synthetic */ n c;

            public aIS(aIT ait, MenuItem menuItem, n nVar) {
                this.a = ait;
                this.b = menuItem;
                this.c = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                aIT ait = this.a;
                if (ait != null) {
                    f.this.A = true;
                    ait.b.f(false);
                    f.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.t(this.b, 4);
                }
            }
        }

        public aIQ() {
        }

        @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0319q
        public void a(n nVar, MenuItem menuItem) {
            f.this.h.removeCallbacksAndMessages(null);
            int size = f.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (nVar == f.this.i.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            f.this.h.postAtTime(new aIS(i2 < f.this.i.size() ? f.this.i.get(i2) : null, menuItem, nVar), nVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0319q
        public void n(n nVar, MenuItem menuItem) {
            f.this.h.removeCallbacksAndMessages(nVar);
        }
    }

    public static class aIT {
        public final Z a;
        public final n b;
        public final int c;

        public aIT(Z z, n nVar, int i) {
            this.a = z;
            this.b = nVar;
            this.c = i;
        }
    }

    public f(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.f5o = view;
        this.f = i;
        this.e = i2;
        this.g = z;
        WeakHashMap<View, R> weakHashMap = T.c;
        this.p = T.aWY.f(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199 A[PHI: r4
  0x0199: PHI (r4v14 int) = (r4v13 int), (r4v5 int) binds: [B:75:0x0195, B:72:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b A[PHI: r4
  0x019b: PHI (r4v15 int) = (r4v5 int), (r4v16 int) binds: [B:74:0x0193, B:73:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void A(n nVar) throws Throwable {
        aIT ait;
        View childAt;
        Rect rect;
        Rect rect2;
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        Method method;
        MenuItem item;
        s sVar;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        s sVar2 = new s(nVar, layoutInflaterFrom, this.g, ivas.gov.bisp.enumeration.R.layout.abc_cascading_menu_item_layout);
        if (!e() && this.w) {
            sVar2.c = true;
        } else if (e()) {
            sVar2.c = l.k(nVar);
        }
        int iJ = l.j(sVar2, null, this.b, this.d);
        Z z2 = new Z(this.b, null, this.f, this.e);
        z2.F = this.m;
        z2.v = this;
        z2.C.setOnDismissListener(this);
        z2.t = this.f5o;
        z2.r = this.n;
        z2.q(true);
        z2.C.setInputMethodMode(2);
        z2.n(sVar2);
        z2.o(iJ);
        z2.r = this.n;
        if (this.i.size() > 0) {
            List<aIT> list = this.i;
            ait = list.get(list.size() - 1);
            n nVar2 = ait.b;
            int size = nVar2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    item = null;
                    break;
                }
                item = nVar2.getItem(i5);
                if (item.hasSubMenu() && nVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                o00000OO o00000oo = ait.a.i;
                ListAdapter adapter = o00000oo.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    sVar = (s) headerViewListAdapter.getWrappedAdapter();
                } else {
                    sVar = (s) adapter;
                    headersCount = 0;
                }
                int count = sVar.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == sVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - o00000oo.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o00000oo.getChildCount()) ? o00000oo.getChildAt(firstVisiblePosition) : null;
            }
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    method = Z.E;
                    if (method != null) {
                        try {
                            method.invoke(z2.C, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    z2.C.setTouchModal(false);
                }
                z2.C.setEnterTransition(null);
                List<aIT> list2 = this.i;
                o00000OO o00000oo2 = list2.get(list2.size() - 1).a.i;
                int[] iArr3 = new int[2];
                o00000oo2.getLocationOnScreen(iArr3);
                Rect rect3 = new Rect();
                this.q.getWindowVisibleDisplayFrame(rect3);
                i = (this.p == 1 ? iArr3[0] - iJ >= 0 : (o00000oo2.getWidth() + iArr3[0]) + iJ > rect3.right) ? 0 : 1;
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.p = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    z2.t = childAt;
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr = new int[2];
                    this.f5o.getLocationOnScreen(iArr);
                    iArr2 = new int[2];
                    childAt.getLocationOnScreen(iArr2);
                    if ((this.n & 7) == 5) {
                        iArr[0] = this.f5o.getWidth() + iArr[0];
                        iArr2[0] = childAt.getWidth() + iArr2[0];
                    }
                    i2 = iArr2[0] - iArr[0];
                    i3 = iArr2[1] - iArr[1];
                }
                if ((this.n & 5) == 5) {
                    if (z) {
                        i4 = i2 + iJ;
                    } else {
                        iJ = childAt.getWidth();
                        i4 = i2 - iJ;
                    }
                } else if (z) {
                    iJ = childAt.getWidth();
                    i4 = i2 + iJ;
                } else {
                    i4 = i2 - iJ;
                }
                z2.l = i4;
                z2.p = true;
                z2.f102o = true;
                z2.l(i3);
            } else {
                if (this.r) {
                    z2.l = this.t;
                }
                if (this.u) {
                    z2.l(this.v);
                }
                rect = this.c;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                z2.x = rect2;
            }
            this.i.add(new aIT(z2, nVar, this.p));
            z2.f();
            o00000OO o00000oo3 = z2.i;
            o00000oo3.setOnKeyListener(this);
            if (ait == null || !this.s || nVar.f6o == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o00000oo3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nVar.f6o);
            o00000oo3.addHeaderView(frameLayout, null, false);
            z2.f();
            return;
        }
        ait = null;
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                method = Z.E;
                if (method != null) {
                    method.invoke(z2.C, Boolean.FALSE);
                }
            } else {
                z2.C.setTouchModal(false);
            }
            z2.C.setEnterTransition(null);
            List<aIT> list3 = this.i;
            o00000OO o00000oo4 = list3.get(list3.size() - 1).a.i;
            int[] iArr4 = new int[2];
            o00000oo4.getLocationOnScreen(iArr4);
            Rect rect4 = new Rect();
            this.q.getWindowVisibleDisplayFrame(rect4);
            if (this.p == 1) {
            }
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            this.p = i;
            if (Build.VERSION.SDK_INT >= 26) {
                z2.t = childAt;
                i3 = 0;
                i2 = 0;
            } else {
                iArr = new int[2];
                this.f5o.getLocationOnScreen(iArr);
                iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = this.f5o.getWidth() + iArr[0];
                    iArr2[0] = childAt.getWidth() + iArr2[0];
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) == 5) {
                if (z) {
                    iJ = childAt.getWidth();
                    i4 = i2 - iJ;
                } else {
                    i4 = i2 + iJ;
                }
            } else if (z) {
                iJ = childAt.getWidth();
                i4 = i2 + iJ;
            } else {
                i4 = i2 - iJ;
            }
            z2.l = i4;
            z2.p = true;
            z2.f102o = true;
            z2.l(i3);
        } else {
            if (this.r) {
                z2.l = this.t;
            }
            if (this.u) {
                z2.l(this.v);
            }
            rect = this.c;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            z2.x = rect2;
        }
        this.i.add(new aIT(z2, nVar, this.p));
        z2.f();
        o00000OO o00000oo5 = z2.i;
        o00000oo5.setOnKeyListener(this);
        if (ait == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final Parcelable a() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(n nVar, boolean z) {
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nVar == this.i.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.i.size()) {
            this.i.get(i2).b.f(false);
        }
        aIT aitRemove = this.i.remove(i);
        aitRemove.b.x(this);
        if (this.A) {
            aitRemove.a.C.setExitTransition(null);
            aitRemove.a.C.setAnimationStyle(0);
        }
        aitRemove.a.dismiss();
        int size2 = this.i.size();
        if (size2 > 0) {
            this.p = this.i.get(size2 - 1).c;
        } else {
            View view = this.f5o;
            WeakHashMap<View, R> weakHashMap = T.c;
            this.p = T.aWY.f(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.i.get(0).b.f(false);
                return;
            }
            return;
        }
        dismiss();
        p.aIX aix = this.y;
        if (aix != null) {
            aix.b(nVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.j);
            }
            this.x = null;
        }
        this.q.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean d() {
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final void dismiss() {
        int size = this.i.size();
        if (size <= 0) {
            return;
        }
        aIT[] aitArr = (aIT[]) this.i.toArray(new aIT[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            aIT ait = aitArr[size];
            if (ait.a.e()) {
                ait.a.dismiss();
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final boolean e() {
        return this.i.size() > 0 && this.i.get(0).a.e();
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final void f() throws Throwable {
        if (e()) {
            return;
        }
        Iterator<n> it = this.a.iterator();
        while (it.hasNext()) {
            A(it.next());
        }
        this.a.clear();
        View view = this.f5o;
        this.q = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.q.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public final ListView i() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<aIT> list = this.i;
        return list.get(list.size() - 1).a.i;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void n(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        aIT ait;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ait = null;
                break;
            }
            ait = this.i.get(i);
            if (!ait.a.e()) {
                break;
            } else {
                i++;
            }
        }
        if (ait != null) {
            ait.b.f(false);
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
        this.y = aix;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void q(boolean z) {
        Iterator<aIT> it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().a.i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((s) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean r(w wVar) throws Throwable {
        for (aIT ait : this.i) {
            if (wVar == ait.b) {
                ait.a.i.requestFocus();
                return true;
            }
        }
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        wVar.e(this, this.b);
        if (e()) {
            A(wVar);
        } else {
            this.a.add(wVar);
        }
        p.aIX aix = this.y;
        if (aix != null) {
            aix.e(wVar);
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void s(n nVar) throws Throwable {
        nVar.e(this, this.b);
        if (e()) {
            A(nVar);
        } else {
            this.a.add(nVar);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void t(boolean z) {
        this.w = z;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void u(View view) {
        if (this.f5o != view) {
            this.f5o = view;
            int i = this.l;
            WeakHashMap<View, R> weakHashMap = T.c;
            this.n = Gravity.getAbsoluteGravity(i, T.aWY.f(view));
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void v(int i) {
        if (this.l != i) {
            this.l = i;
            View view = this.f5o;
            WeakHashMap<View, R> weakHashMap = T.c;
            this.n = Gravity.getAbsoluteGravity(i, T.aWY.f(view));
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void w(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void x(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void y(boolean z) {
        this.s = z;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.l
    public final void z(int i) {
        this.u = true;
        this.v = i;
    }
}
