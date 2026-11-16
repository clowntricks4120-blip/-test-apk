package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public boolean R;
    public Integer S;
    public boolean T;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, ivas.gov.bisp.enumeration.O.r.I, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayE.hasValue(0)) {
            setNavigationIconTint(typedArrayE.getColor(0, -1));
        }
        this.R = typedArrayE.getBoolean(2, false);
        this.T = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C0019p c0019p = new C0019p();
            c0019p.u(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c0019p.e.e = new S(context2);
            c0019p.w();
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            c0019p.s(T.aXb.b(this));
            T.aWX.s(this, c0019p);
        }
    }

    public final void b(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public Integer getNavigationIconTint() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0019p) {
            ivas.gov.bisp.enumeration.O.r.C(this, (C0019p) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.R || this.T) {
            TextView textViewL = i.l(this, getTitle());
            TextView textViewL2 = i.l(this, getSubtitle());
            if (textViewL == null && textViewL2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i5 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && childAt != textViewL && childAt != textViewL2) {
                    if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.R && textViewL != null) {
                b(textViewL, pair);
            }
            if (!this.T || textViewL2 == null) {
                return;
            }
            b(textViewL2, pair);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ivas.gov.bisp.enumeration.O.r.A(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.S != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.S = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.T != z) {
            this.T = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.R != z) {
            this.R = z;
            requestLayout();
        }
    }
}
