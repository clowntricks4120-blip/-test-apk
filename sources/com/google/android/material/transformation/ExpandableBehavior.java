package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.S.L;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.OooO0OO<View> {
    public int a;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ L c;

        public OooO00o(View view, int i, L l) {
            this.a = view;
            this.b = i;
            this.c = l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.b) {
                L l = this.c;
                expandableBehavior.v((View) l, this.a, l.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        L l = (L) view2;
        if (!u(l.b())) {
            return false;
        }
        this.a = l.b() ? 1 : 2;
        return v((View) l, view, l.b(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        L l;
        WeakHashMap<View, R> weakHashMap = T.c;
        if (!T.aXa.d(view)) {
            List<View> listK = coordinatorLayout.k(view);
            int size = listK.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    l = null;
                    break;
                }
                View view2 = listK.get(i2);
                if (e(coordinatorLayout, view, view2)) {
                    l = (L) view2;
                    break;
                }
                i2++;
            }
            if (l != null && u(l.b())) {
                int i3 = l.b() ? 1 : 2;
                this.a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new OooO00o(view, i3, l));
            }
        }
        return false;
    }

    public final boolean u(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    public abstract boolean v(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
