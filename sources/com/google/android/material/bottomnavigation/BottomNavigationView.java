package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o000OOo.OooO0OO;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends OooOo00 {

    @Deprecated
    public interface OooO00o extends OooOo00.aNO {
    }

    @Deprecated
    public interface OooO0O0 extends OooOo00.aNP {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        B bF = a.f(getContext(), attributeSet, r.l, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(bF.f(1, true));
        if (bF.t(0)) {
            setMinimumHeight(bF.j(0, 0));
        }
        bF.d.recycle();
        J.b(this, new ivas.gov.bisp.enumeration.p046bs.r(this));
    }

    @Override // ivas.gov.bisp.enumeration.p095o0000oO.OooOo00
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        OooO0OO oooO0OO = (OooO0OO) getMenuView();
        if (oooO0OO.K != z) {
            oooO0OO.setItemHorizontalTranslationEnabled(z);
            getPresenter().q(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OooO00o oooO00o) {
        setOnItemReselectedListener(oooO00o);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OooO0O0 oooO0O0) {
        setOnItemSelectedListener(oooO0O0);
    }
}
