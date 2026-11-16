package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.u;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0287p;
import ivas.gov.bisp.enumeration.p087j.S;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.OooO0O0 implements n.aIH, m {
    public OooO A;
    public Context p;
    public n q;
    public int r;
    public boolean s;
    public a t;
    public boolean u;
    public p.aIX v;
    public n.aII w;
    public int x;
    public int y;
    public int z;

    public interface OooO {
    }

    public interface OooO00o {
        boolean b();

        boolean e();
    }

    public static class OooO0O0 implements p.aIX {
        @Override // androidx.appcompat.view.menu.p.aIX
        public void b(n nVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.p.aIX
        public boolean e(n nVar) {
            return false;
        }
    }

    public static class OooO0OO extends androidx.appcompat.widget.OooO0O0.aJn {

        @ViewDebug.ExportedProperty
        public boolean a;

        @ViewDebug.ExportedProperty
        public int b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;
        public boolean e;

        @ViewDebug.ExportedProperty
        public boolean f;

        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooO0OO(OooO0OO oooO0OO) {
            super(oooO0OO);
            this.a = oooO0OO.a;
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    public class OooO0o implements n.aII {
        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public boolean b(n nVar, MenuItem menuItem) {
            OooO oooO = ActionMenuView.this.A;
            if (oooO == null) {
                return false;
            }
            Toolbar.OooO00o oooO00o = (Toolbar.OooO00o) oooO;
            Iterator<InterfaceC0287p> it = Toolbar.this.I.a.iterator();
            while (it.hasNext()) {
                if (it.next().e(menuItem)) {
                }
            }
            Toolbar.OooOO0 oooOO0 = Toolbar.this.J;
            return oooOO0 != null && S.this.d.onMenuItemSelected(0, menuItem);
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public void e(n nVar) {
            n.aII aii = ActionMenuView.this.w;
            if (aii != null) {
                aii.e(nVar);
            }
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.p = context;
        this.r = 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static int c(View view, int i, int i2, int i3, int i4) {
        int i5;
        OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.f();
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
        }
        oooO0OO.d = !oooO0OO.a && z;
        oooO0OO.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.view.menu.n.aIH
    public boolean b(u uVar) {
        return this.q.s(uVar, null, 0);
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO0OO;
    }

    @Override // androidx.appcompat.widget.OooO0O0
    /* JADX INFO: renamed from: d */
    public androidx.appcompat.widget.OooO0O0.aJn generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(n nVar) {
        this.q = nVar;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            n nVar = new n(context);
            this.q = nVar;
            nVar.h = new OooO0o();
            a aVar = new a(context);
            this.t = aVar;
            aVar.l = true;
            aVar.n = true;
            p.aIX oooO0O0 = this.v;
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0();
            }
            aVar.e = oooO0O0;
            this.q.e(aVar, this.p);
            a aVar2 = this.t;
            aVar2.a = this;
            this.q = aVar2.d;
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        a aVar = this.t;
        OooO00o$OooO0o oooO00o$OooO0o = aVar.j;
        if (oooO00o$OooO0o != null) {
            return oooO00o$OooO0o.getDrawable();
        }
        if (aVar.m) {
            return aVar.k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public OooO0OO generateDefaultLayoutParams() {
        OooO0OO oooO0OO = new OooO0OO(-2, -2);
        ((LinearLayout.LayoutParams) oooO0OO).gravity = 16;
        return oooO0OO;
    }

    public boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof OooO00o)) {
            zB = ((OooO00o) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof OooO00o)) ? zB : zB | ((OooO00o) childAt2).e();
    }

    @Override // androidx.appcompat.widget.OooO0O0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public OooO0OO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        OooO0OO oooO0OO = layoutParams instanceof OooO0OO ? new OooO0OO((OooO0OO) layoutParams) : new OooO0OO(layoutParams);
        if (((LinearLayout.LayoutParams) oooO0OO).gravity <= 0) {
            ((LinearLayout.LayoutParams) oooO0OO).gravity = 16;
        }
        return oooO0OO;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.t;
        if (aVar != null) {
            aVar.q(false);
            if (this.t.t()) {
                this.t.m();
                this.t.u();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.t;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.s) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zB = aj.b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
                if (oooO0OO.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) oooO0OO).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) oooO0OO).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) oooO0OO).leftMargin) + ((LinearLayout.LayoutParams) oooO0OO).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                OooO0OO oooO0OO2 = (OooO0OO) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oooO0OO2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) oooO0OO2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) oooO0OO2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            OooO0OO oooO0OO3 = (OooO0OO) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oooO0OO3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) oooO0OO3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = j.f(measuredWidth4, ((LinearLayout.LayoutParams) oooO0OO3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    @Override // androidx.appcompat.widget.OooO0O0, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        ?? r5;
        n nVar;
        boolean z3 = this.s;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.s = z4;
        if (z3 != z4) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.s && (nVar = this.q) != null && size != this.y) {
            this.y = size;
            nVar.r(true);
        }
        int childCount = getChildCount();
        if (!this.s || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                OooO0OO oooO0OO = (OooO0OO) getChildAt(i4).getLayoutParams();
                ((LinearLayout.LayoutParams) oooO0OO).rightMargin = 0;
                ((LinearLayout.LayoutParams) oooO0OO).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i5 = size2 - (paddingRight + paddingLeft);
        int i6 = this.x;
        int i7 = i5 / i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i8 = ((i5 % i6) / i7) + i6;
        int childCount2 = getChildCount();
        int i9 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i10 = 0;
        boolean z5 = false;
        int i11 = 0;
        long j = 0;
        while (i10 < childCount2) {
            View childAt = getChildAt(i10);
            int i12 = size3;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i13 = i9 + 1;
                if (z6) {
                    int i14 = this.z;
                    r5 = 0;
                    childAt.setPadding(i14, 0, i14, 0);
                } else {
                    r5 = 0;
                }
                OooO0OO oooO0OO2 = (OooO0OO) childAt.getLayoutParams();
                oooO0OO2.e = r5;
                oooO0OO2.c = r5;
                oooO0OO2.b = r5;
                oooO0OO2.d = r5;
                ((LinearLayout.LayoutParams) oooO0OO2).leftMargin = r5;
                ((LinearLayout.LayoutParams) oooO0OO2).rightMargin = r5;
                oooO0OO2.f = z6 && ((ActionMenuItemView) childAt).f();
                int iC = c(childAt, i8, oooO0OO2.a ? 1 : i7, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iC);
                if (oooO0OO2.d) {
                    i11++;
                }
                if (oooO0OO2.a) {
                    z5 = true;
                }
                i7 -= iC;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iC == 1) {
                    j |= (long) (1 << i10);
                }
                i9 = i13;
            }
            i10++;
            size3 = i12;
        }
        int i15 = size3;
        boolean z7 = z5 && i9 == 2;
        boolean z8 = false;
        while (true) {
            if (i11 <= 0 || i7 <= 0) {
                z = z8;
                i3 = iMax;
                break;
            }
            int i16 = Integer.MAX_VALUE;
            int i17 = 0;
            int i18 = 0;
            long j2 = 0;
            while (i17 < childCount2) {
                boolean z9 = z8;
                OooO0OO oooO0OO3 = (OooO0OO) getChildAt(i17).getLayoutParams();
                int i19 = iMax;
                if (oooO0OO3.d) {
                    int i20 = oooO0OO3.b;
                    if (i20 < i16) {
                        j2 = 1 << i17;
                        i16 = i20;
                        i18 = 1;
                    } else if (i20 == i16) {
                        j2 |= 1 << i17;
                        i18++;
                    }
                }
                i17++;
                iMax = i19;
                z8 = z9;
            }
            z = z8;
            i3 = iMax;
            j |= j2;
            if (i18 > i7) {
                break;
            }
            int i21 = 0;
            while (i21 < childCount2) {
                View childAt2 = getChildAt(i21);
                OooO0OO oooO0OO4 = (OooO0OO) childAt2.getLayoutParams();
                int i22 = i5;
                int i23 = mode;
                long j3 = 1 << i21;
                if ((j2 & j3) == 0) {
                    if (oooO0OO4.b == i16 + 1) {
                        j |= j3;
                    }
                    z7 = z7;
                } else {
                    if (z7 && oooO0OO4.f && i7 == 1) {
                        int i24 = this.z;
                        childAt2.setPadding(i24 + i8, 0, i24, 0);
                    }
                    oooO0OO4.b++;
                    oooO0OO4.e = true;
                    i7--;
                }
                i21++;
                mode = i23;
                i5 = i22;
                z7 = z7;
            }
            iMax = i3;
            z8 = true;
        }
        boolean z10 = !z5 && i9 == 1;
        if (i7 <= 0 || j == 0 || (i7 >= i9 - 1 && !z10 && iMax2 <= 1)) {
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((OooO0OO) getChildAt(0).getLayoutParams()).f) {
                    fBitCount -= 0.5f;
                }
                int i25 = childCount2 - 1;
                if ((j & ((long) (1 << i25))) != 0 && !((OooO0OO) getChildAt(i25).getLayoutParams()).f) {
                    fBitCount -= 0.5f;
                }
            }
            int i26 = fBitCount > 0.0f ? (int) ((i7 * i8) / fBitCount) : 0;
            boolean z11 = z;
            for (int i27 = 0; i27 < childCount2; i27++) {
                if ((j & ((long) (1 << i27))) != 0) {
                    View childAt3 = getChildAt(i27);
                    OooO0OO oooO0OO5 = (OooO0OO) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        oooO0OO5.c = i26;
                        oooO0OO5.e = true;
                        if (i27 == 0 && !oooO0OO5.f) {
                            ((LinearLayout.LayoutParams) oooO0OO5).leftMargin = (-i26) / 2;
                        }
                        z11 = true;
                    } else if (oooO0OO5.a) {
                        oooO0OO5.c = i26;
                        oooO0OO5.e = true;
                        ((LinearLayout.LayoutParams) oooO0OO5).rightMargin = (-i26) / 2;
                        z11 = true;
                    } else {
                        if (i27 != 0) {
                            ((LinearLayout.LayoutParams) oooO0OO5).leftMargin = i26 / 2;
                        }
                        if (i27 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) oooO0OO5).rightMargin = i26 / 2;
                        }
                    }
                }
            }
            z2 = z11;
        }
        if (z2) {
            for (int i28 = 0; i28 < childCount2; i28++) {
                View childAt4 = getChildAt(i28);
                OooO0OO oooO0OO6 = (OooO0OO) childAt4.getLayoutParams();
                if (oooO0OO6.e) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((oooO0OO6.b * i8) + oooO0OO6.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, mode == 1073741824 ? i15 : i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.r = z;
    }

    public void setOnMenuItemClickListener(OooO oooO) {
        this.A = oooO;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        a aVar = this.t;
        OooO00o$OooO0o oooO00o$OooO0o = aVar.j;
        if (oooO00o$OooO0o != null) {
            oooO00o$OooO0o.setImageDrawable(drawable);
        } else {
            aVar.m = true;
            aVar.k = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.u = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.p = getContext();
            } else {
                this.p = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(a aVar) {
        this.t = aVar;
        aVar.a = this;
        this.q = aVar.d;
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }
}
