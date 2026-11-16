package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.OooO0O0 {
    public static final /* synthetic */ int s = 0;
    public boolean t;

    public static final class OooO00o extends Property<View, Float> {
        public OooO00o(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    public static final class OooO0O0 extends Property<View, Float> {
        public OooO0O0(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    public static final class OooO0OO extends Property<View, Float> {
        public OooO0OO(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, R> weakHashMap = T.c;
            return Float.valueOf(T.aWY.g(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWY.l(view2, iIntValue, paddingTop, T.aWY.h(view2), view2.getPaddingBottom());
        }
    }

    public static final class OooO0o extends Property<View, Float> {
        public OooO0o(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, R> weakHashMap = T.c;
            return Float.valueOf(T.aWY.h(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWY.l(view2, T.aWY.g(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new OooO00o(Float.class, "width");
        new OooO0O0(Float.class, "height");
        new OooO0OO(Float.class, "paddingStart");
        new OooO0o(Float.class, "paddingEnd");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    public CoordinatorLayout.OooO0OO<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public C0026p getExtendMotionSpec() {
        throw null;
    }

    public C0026p getHideMotionSpec() {
        throw null;
    }

    public C0026p getShowMotionSpec() {
        throw null;
    }

    public C0026p getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.t = z;
    }

    public void setExtendMotionSpec(C0026p c0026p) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C0026p.d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C0026p c0026p) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0026p.d(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setShowMotionSpec(C0026p c0026p) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0026p.d(getContext(), i));
    }

    public void setShrinkMotionSpec(C0026p c0026p) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C0026p.d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.OooO0OO<T> {
        public Rect a;
        public boolean b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public void f(CoordinatorLayout.OooOO0 oooOO0) {
            if (oooOO0.i == 0) {
                oooOO0.i = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.OooOO0) || !(((CoordinatorLayout.OooOO0) layoutParams).b instanceof BottomSheetBehavior)) {
                return false;
            }
            v(view2, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> listK = coordinatorLayout.k(extendedFloatingActionButton);
            int size = listK.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = listK.get(i2);
                if (view2 instanceof AppBarLayout) {
                    w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooOO0) && (((CoordinatorLayout.OooOO0) layoutParams).b instanceof BottomSheetBehavior)) {
                        v(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.z(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((CoordinatorLayout.OooOO0) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        public final boolean v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!u(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooOO0) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                throw null;
            }
            throw null;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!u(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ivas.gov.bisp.enumeration.P.r.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                throw null;
            }
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.s);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
