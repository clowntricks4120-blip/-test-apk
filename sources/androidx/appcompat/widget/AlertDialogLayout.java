package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends OooO0O0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int b(View view) {
        while (true) {
            WeakHashMap<View, R> weakHashMap = T.c;
            int iF = T.aWX.f(view);
            if (iF > 0) {
                return iF;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 1) {
                    view = viewGroup.getChildAt(0);
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                OooO0O0.aJn ajn = (OooO0O0.aJn) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) ajn).gravity;
                if (i11 < 0) {
                    i11 = 8388615 & gravity;
                }
                WeakHashMap<View, R> weakHashMap = T.c;
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, T.aWY.f(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = ((LinearLayout.LayoutParams) ajn).leftMargin + paddingLeft;
                    } else {
                        i5 = (i8 - paddingRight) - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) ajn).rightMargin;
                    }
                    if (i(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) ajn).topMargin;
                    childAt.layout(i7, i12, measuredWidth + i7, measuredHeight2 + i12);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) ajn).bottomMargin + i12;
                } else {
                    i5 = ((((i8 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) ajn).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) ajn).rightMargin;
                }
                i7 = i5 - i6;
                if (i(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + ((LinearLayout.LayoutParams) ajn).topMargin;
                childAt.layout(i7, i13, measuredWidth + i7, measuredHeight2 + i13);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) ajn).bottomMargin + i13;
            }
        }
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.View
    public void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iB;
        int measuredHeight;
        int measuredHeight2;
        int i3;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == ivas.gov.bisp.enumeration.R.id.topPanel) {
                    view = childAt;
                } else if (id == ivas.gov.bisp.enumeration.R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != ivas.gov.bisp.enumeration.R.id.contentPanel && id != ivas.gov.bisp.enumeration.R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iB = b(view2);
            measuredHeight = view2.getMeasuredHeight() - iB;
            paddingBottom += iB;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iB = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingBottom;
        if (view2 != null) {
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                i3 = iMin + iB;
            } else {
                i3 = iB;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            paddingBottom = (paddingBottom - iB) + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + measuredHeight2, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    OooO0O0.aJn ajn = (OooO0O0.aJn) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) ajn).width == -1) {
                        int i8 = ((LinearLayout.LayoutParams) ajn).height;
                        ((LinearLayout.LayoutParams) ajn).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) ajn).height = i8;
                    }
                }
            }
        }
    }
}
