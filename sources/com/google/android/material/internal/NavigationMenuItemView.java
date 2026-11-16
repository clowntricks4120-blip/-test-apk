package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.OooO0O0;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.o0000O00.OooOO0;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends OooOO0 implements m.aIE {
    public static final int[] p = {R.attr.state_checked};
    public FrameLayout A;
    public ColorStateList B;
    public u C;
    public boolean D;
    public Drawable E;
    public final C0283j F;
    public boolean q;
    public int x;
    public final CheckedTextView y;
    public boolean z;

    public class OooO00o extends C0283j {
        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            alVar.d.setCheckable(NavigationMenuItemView.this.z);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooO00o oooO00o = new OooO00o();
        this.F = oooO00o;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ivas.gov.bisp.enumeration.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ivas.gov.bisp.enumeration.R.id.design_menu_item_text);
        this.y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.q(checkedTextView, oooO00o);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(ivas.gov.bisp.enumeration.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public void d(u uVar, int i) {
        StateListDrawable stateListDrawable;
        this.C = uVar;
        int i2 = uVar.b;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(uVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(p, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.s(this, stateListDrawable);
        }
        setCheckable(uVar.isCheckable());
        setChecked(uVar.isChecked());
        setEnabled(uVar.isEnabled());
        setTitle(uVar.g);
        setIcon(uVar.getIcon());
        setActionView(uVar.getActionView());
        setContentDescription(uVar.r);
        C0315d.b(this, uVar.q);
        u uVar2 = this.C;
        if (uVar2.g == null && uVar2.getIcon() == null && this.C.getActionView() != null) {
            this.y.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                OooO0O0.aJn ajn = (OooO0O0.aJn) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) ajn).width = -1;
                this.A.setLayoutParams(ajn);
                return;
            }
            return;
        }
        this.y.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            OooO0O0.aJn ajn2 = (OooO0O0.aJn) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) ajn2).width = -2;
            this.A.setLayoutParams(ajn2);
        }
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public u getItemData() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        u uVar = this.C;
        if (uVar != null && uVar.isCheckable() && this.C.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.z != z) {
            this.z = z;
            this.F.l(this.y, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.y.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.B);
            }
            int i = this.x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.q) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C0084m.c;
                Drawable drawable2 = resources.getDrawable(ivas.gov.bisp.enumeration.R.drawable.navigation_empty_icon, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i2 = this.x;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        this.y.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.y.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.x = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.D = colorStateList != null;
        u uVar = this.C;
        if (uVar != null) {
            setIcon(uVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.q = z;
    }

    public void setTextAppearance(int i) {
        this.y.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }
}
