package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.h;
import ivas.gov.bisp.enumeration.O.j;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int a = 0;
    public boolean b;
    public final List<OooO0o> c;
    public final OooO0OO d;
    public final OooOO0 e;
    public final Comparator<MaterialButton> f;
    public final LinkedHashSet<OooO> g;
    public Integer[] h;
    public boolean i;
    public boolean j;
    public int k;

    public interface OooO {
        void b(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class OooO00o implements Comparator<MaterialButton> {
        public OooO00o() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return iCompareTo2 == 0 ? Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4))) : iCompareTo2;
        }
    }

    public class OooO0O0 extends C0283j {
        public OooO0O0() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            int i;
            this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                int i2 = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i = i2;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.l(i3)) {
                            i2++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            alVar.l(al.aXE.c(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class OooO0OO implements MaterialButton.OooO00o {
        public OooO0OO(OooO00o oooO00o) {
        }

        @Override // com.google.android.material.button.MaterialButton.OooO00o
        public void b(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.i) {
                return;
            }
            if (materialButtonToggleGroup.b) {
                materialButtonToggleGroup.k = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.j(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public static class OooO0o {
        public static final h a = new j(0.0f);
        public h b;
        public h c;
        public h d;
        public h e;

        public OooO0o(h hVar, h hVar2, h hVar3, h hVar4) {
            this.b = hVar;
            this.c = hVar3;
            this.d = hVar4;
            this.e = hVar2;
        }
    }

    public class OooOO0 implements MaterialButton.OooO0O0 {
        public OooOO0(OooO00o oooO00o) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.c = new ArrayList();
        this.d = new OooO0OO(null);
        this.e = new OooOO0(null);
        this.g = new LinkedHashSet<>();
        this.f = new OooO00o();
        this.i = false;
        TypedArray typedArrayE = a.e(getContext(), attributeSet, r.u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(2, false));
        this.k = typedArrayE.getResourceId(0, -1);
        this.j = typedArrayE.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayE.recycle();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (l(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (l(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && l(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.k = i;
        j(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            materialButton.setId(T.aWY.c());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.g.add(this.d);
        materialButton.setOnPressedChangeListenerInternal(this.e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        t shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.c.add(new OooO0o(shapeAppearanceModel.j, shapeAppearanceModel.l, shapeAppearanceModel.i, shapeAppearanceModel.k));
        T.q(materialButton, new OooO0O0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(k(i), Integer.valueOf(i));
        }
        this.h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.b) {
            return this.k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButtonK = k(i);
            if (materialButtonK.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonK.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.h;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final void i() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonK = k(i);
            int iMin = Math.min(materialButtonK.getStrokeWidth(), k(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonK.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButtonK.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void j(int i, boolean z) {
        Iterator<OooO> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().b(this, i, z);
        }
    }

    public final MaterialButton k(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean l(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final boolean m(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.j && checkedButtonIds.isEmpty()) {
            n(i, true);
            this.k = i;
            return false;
        }
        if (z && this.b) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                n(iIntValue, false);
                j(iIntValue, false);
            }
        }
        return true;
    }

    public final void n(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.i = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.i = false;
        }
    }

    public void o() {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonK = k(i);
            if (materialButtonK.getVisibility() != 8) {
                t shapeAppearanceModel = materialButtonK.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                t.bfu bfuVar = new t.bfu(shapeAppearanceModel);
                OooO0o oooO0o3 = this.c.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            h hVar = oooO0o3.b;
                            h hVar2 = OooO0o.a;
                            oooO0o2 = new OooO0o(hVar, hVar2, oooO0o3.c, hVar2);
                        } else if (ivas.gov.bisp.enumeration.P.J.c(this)) {
                            h hVar3 = OooO0o.a;
                            oooO0o = new OooO0o(hVar3, hVar3, oooO0o3.c, oooO0o3.d);
                            oooO0o3 = oooO0o;
                        } else {
                            h hVar4 = oooO0o3.b;
                            h hVar5 = oooO0o3.e;
                            h hVar6 = OooO0o.a;
                            oooO0o2 = new OooO0o(hVar4, hVar5, hVar6, hVar6);
                        }
                        oooO0o3 = oooO0o2;
                    } else if (i == lastVisibleChildIndex) {
                        if (!z) {
                            h hVar7 = OooO0o.a;
                            oooO0o = new OooO0o(hVar7, oooO0o3.e, hVar7, oooO0o3.d);
                        } else if (ivas.gov.bisp.enumeration.P.J.c(this)) {
                            h hVar8 = oooO0o3.b;
                            h hVar9 = oooO0o3.e;
                            h hVar10 = OooO0o.a;
                            oooO0o2 = new OooO0o(hVar8, hVar9, hVar10, hVar10);
                            oooO0o3 = oooO0o2;
                        } else {
                            h hVar11 = OooO0o.a;
                            oooO0o = new OooO0o(hVar11, hVar11, oooO0o3.c, oooO0o3.d);
                        }
                        oooO0o3 = oooO0o;
                    } else {
                        oooO0o3 = null;
                    }
                }
                if (oooO0o3 == null) {
                    bfuVar.i(0.0f);
                    bfuVar.h(0.0f);
                    bfuVar.g(0.0f);
                    bfuVar.f(0.0f);
                } else {
                    bfuVar.i = oooO0o3.b;
                    bfuVar.k = oooO0o3.e;
                    bfuVar.h = oooO0o3.c;
                    bfuVar.j = oooO0o3.d;
                }
                materialButtonK.setShapeAppearanceModel(bfuVar.e());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.k;
        if (i == -1 || (materialButton = (MaterialButton) findViewById(i)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) al.aXD.c(1, getVisibleButtonCount(), false, this.b ? 1 : 2).c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        o();
        i();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.g.remove(this.d);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.c.remove(iIndexOfChild);
        }
        o();
        i();
    }

    public void setSelectionRequired(boolean z) {
        this.j = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.i = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButtonK = k(i);
                materialButtonK.setChecked(false);
                j(materialButtonK.getId(), false);
            }
            this.i = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
