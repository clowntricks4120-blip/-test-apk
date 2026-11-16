package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends ivas.gov.bisp.enumeration.o0000O00.OooO {
    public boolean a;
    public int b;
    public int g;
    public boolean h;
    public OooO0o i;
    public final OooO0O0 j;
    public OooO k;
    public boolean l;
    public int m;

    public class OooO implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener a;

        public OooO(OooO00o oooO00o) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, R> weakHashMap = T.c;
                    view2.setId(T.aWY.c());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).f(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.j);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OooO0O0 implements CompoundButton.OnCheckedChangeListener {
        public OooO0O0(OooO00o oooO00o) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.l) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.a) {
                    chipGroup2.g(compoundButton.getId(), true);
                    ChipGroup.this.m = compoundButton.getId();
                    return;
                }
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup3 = ChipGroup.this;
                if (chipGroup3.m == id) {
                    chipGroup3.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup4 = ChipGroup.this;
            int i = chipGroup4.m;
            if (i != -1 && i != id && chipGroup4.h) {
                chipGroup4.g(i, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    public static class OooO0OO extends ViewGroup.MarginLayoutParams {
        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
        }
    }

    public interface OooO0o {
        void b(ChipGroup chipGroup, int i);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.chipGroupStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_ChipGroup), attributeSet, ivas.gov.bisp.enumeration.R.attr.chipGroupStyle);
        this.j = new OooO0O0(null);
        this.k = new OooO(null);
        this.m = -1;
        this.l = false;
        TypedArray typedArrayE = a.e(getContext(), attributeSet, r.n, ivas.gov.bisp.enumeration.R.attr.chipGroupStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayE.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayE.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayE.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayE.getBoolean(5, false));
        setSingleSelection(typedArrayE.getBoolean(6, false));
        setSelectionRequired(typedArrayE.getBoolean(4, false));
        int resourceId = typedArrayE.getResourceId(0, -1);
        if (resourceId != -1) {
            this.m = resourceId;
        }
        typedArrayE.recycle();
        super.setOnHierarchyChangeListener(this.k);
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aWX.t(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.m = i;
        OooO0o oooO0o = this.i;
        if (oooO0o == null || !this.h) {
            return;
        }
        oooO0o.b(this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.m;
                if (i2 != -1 && this.h) {
                    g(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof OooO0OO);
    }

    @Override // ivas.gov.bisp.enumeration.o0000O00.OooO
    public boolean d() {
        return this.e;
    }

    public void f(int i) {
        int i2 = this.m;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.h) {
            g(i2, false);
        }
        if (i != -1) {
            g(i, true);
        }
        setCheckedId(i);
    }

    public final void g(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.l = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.l = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO0OO(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.h) {
            return this.m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.b;
    }

    public int getChipSpacingVertical() {
        return this.g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.m;
        if (i != -1) {
            g(i, true);
            setCheckedId(this.m);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) al.aXD.c(getRowCount(), this.e ? getChipCount() : -1, false, this.h ? 1 : 2).c);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.b != i) {
            this.b = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.g != i) {
            this.g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(OooO0o oooO0o) {
        this.i = oooO0o;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.k.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.a = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // ivas.gov.bisp.enumeration.o0000O00.OooO
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.l = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.l = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO0OO(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
