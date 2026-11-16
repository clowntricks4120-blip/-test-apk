package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 extends ViewGroup {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11o;

    public static class aJn extends LinearLayout.LayoutParams {
        public aJn(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public aJn(int i, int i2) {
            super(i, i2);
        }

        public aJn(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public OooO0O0(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aJn;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aJn generateLayoutParams(AttributeSet attributeSet) {
        return new aJn(getContext(), attributeSet);
    }

    public void e(Canvas canvas, int i) {
        Drawable drawable = this.k;
        int paddingLeft = getPaddingLeft();
        int i2 = this.f11o;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.f11o, this.l + i);
        this.k.draw(canvas);
    }

    public void f(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.f11o, this.m + i, (getHeight() - getPaddingBottom()) - this.f11o);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public aJn generateDefaultLayoutParams() {
        int i = this.f;
        if (i == 0) {
            return new aJn(-2, -2);
        }
        if (i == 1) {
            return new aJn(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.d;
        if (this.f == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((aJn) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.c;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.f11o;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.f;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public aJn generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aJn(layoutParams);
    }

    public boolean i(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((aJn) childAt.getLayoutParams())).topMargin) - this.l);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.l;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((aJn) childAt2.getLayoutParams())).bottomMargin;
                }
                e(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zB = aj.b(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                aJn ajn = (aJn) childAt3.getLayoutParams();
                f(canvas, zB ? childAt3.getRight() + ((LinearLayout.LayoutParams) ajn).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) ajn).leftMargin) - this.m);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                aJn ajn2 = (aJn) childAt4.getLayoutParams();
                if (zB) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) ajn2).leftMargin;
                    i = this.m;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) ajn2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.m;
                right = left - i;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.OooO0O0");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.OooO0O0");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        int i15 = 8388615;
        if (this.f == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = getPaddingRight();
            int paddingRight2 = getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.e;
            int i18 = i17 & 112;
            if (i18 != 16) {
                paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.g;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.g) / 2);
            }
            int i19 = 0;
            while (i19 < virtualChildCount) {
                View childAt = getChildAt(i19);
                if (childAt != null && childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    aJn ajn = (aJn) childAt.getLayoutParams();
                    int i20 = ((LinearLayout.LayoutParams) ajn).gravity;
                    if (i20 < 0) {
                        i20 = i17 & i15;
                    }
                    WeakHashMap<View, R> weakHashMap = T.c;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, T.aWY.f(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i13 = ((LinearLayout.LayoutParams) ajn).leftMargin + paddingLeft2;
                        } else {
                            i11 = (i16 - paddingRight) - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) ajn).rightMargin;
                        }
                        if (i(i19)) {
                            paddingTop += this.l;
                        }
                        int i21 = paddingTop + ((LinearLayout.LayoutParams) ajn).topMargin;
                        childAt.layout(i13, i21, measuredWidth + i13, measuredHeight2 + i21);
                        paddingTop = j.f(measuredHeight2, ((LinearLayout.LayoutParams) ajn).bottomMargin, 0, i21);
                    } else {
                        i11 = ((((i16 - paddingLeft2) - paddingRight2) - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) ajn).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) ajn).rightMargin;
                    }
                    i13 = i11 - i12;
                    if (i(i19)) {
                        paddingTop += this.l;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) ajn).topMargin;
                    childAt.layout(i13, i22, measuredWidth + i13, measuredHeight2 + i22);
                    paddingTop = j.f(measuredHeight2, ((LinearLayout.LayoutParams) ajn).bottomMargin, 0, i22);
                }
                i19++;
                i14 = 8;
                i15 = 8388615;
            }
            return;
        }
        boolean zB = aj.b(this);
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.e;
        int i25 = i24 & 112;
        boolean z2 = this.b;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        WeakHashMap<View, R> weakHashMap2 = T.c;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i24 & 8388615, T.aWY.f(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.g;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.g) / 2);
        }
        if (zB) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int iF = paddingLeft;
        int i26 = 0;
        while (i26 < virtualChildCount2) {
            int i27 = (i6 * i26) + i5;
            View childAt2 = getChildAt(i27);
            if (childAt2 == null) {
                i7 = i5;
            } else {
                i7 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    aJn ajn2 = (aJn) childAt2.getLayoutParams();
                    if (z2) {
                        i8 = i25;
                        baseline = ((LinearLayout.LayoutParams) ajn2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) ajn2).gravity;
                        if (i9 < 0) {
                            i9 = i8;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((((i23 - paddingTop2) - paddingBottom2) - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) ajn2).topMargin) - ((LinearLayout.LayoutParams) ajn2).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) ajn2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = ((i23 - paddingBottom) - measuredHeight3) - ((LinearLayout.LayoutParams) ajn2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i27)) {
                            iF += this.m;
                        }
                        int i28 = iF + ((LinearLayout.LayoutParams) ajn2).leftMargin;
                        childAt2.layout(i28, measuredHeight, measuredWidth2 + i28, measuredHeight3 + measuredHeight);
                        iF = j.f(measuredWidth2, ((LinearLayout.LayoutParams) ajn2).rightMargin, 0, i28);
                    } else {
                        i8 = i25;
                    }
                    i9 = ((LinearLayout.LayoutParams) ajn2).gravity;
                    if (i9 < 0) {
                        i9 = i8;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((((i23 - paddingTop2) - paddingBottom2) - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) ajn2).topMargin) - ((LinearLayout.LayoutParams) ajn2).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) ajn2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = ((i23 - paddingBottom) - measuredHeight3) - ((LinearLayout.LayoutParams) ajn2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (i(i27)) {
                        iF += this.m;
                    }
                    int i29 = iF + ((LinearLayout.LayoutParams) ajn2).leftMargin;
                    childAt2.layout(i29, measuredHeight, measuredWidth2 + i29, measuredHeight3 + measuredHeight);
                    iF = j.f(measuredWidth2, ((LinearLayout.LayoutParams) ajn2).rightMargin, 0, i29);
                }
                i26++;
                i5 = i7;
                virtualChildCount2 = virtualChildCount2;
                i25 = i8;
                z2 = z2;
            }
            i8 = i25;
            i26++;
            i5 = i7;
            virtualChildCount2 = virtualChildCount2;
            i25 = i8;
            z2 = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:210:0x0484  */
    /* JADX WARN: Code duplicated, block: B:211:0x0489  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:218:0x04be  */
    /* JADX WARN: Code duplicated, block: B:219:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:221:0x04df  */
    /* JADX WARN: Code duplicated, block: B:227:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:236:0x0536  */
    /* JADX WARN: Code duplicated, block: B:242:0x0548  */
    /* JADX WARN: Code duplicated, block: B:245:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0552  */
    /* JADX WARN: Code duplicated, block: B:248:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x055d  */
    /* JADX WARN: Code duplicated, block: B:276:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:284:0x0605  */
    /* JADX WARN: Code duplicated, block: B:285:0x0614  */
    /* JADX WARN: Code duplicated, block: B:307:0x069a  */
    /* JADX WARN: Code duplicated, block: B:309:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:312:0x06be  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:360:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:362:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:366:0x0803  */
    /* JADX WARN: Code duplicated, block: B:374:0x0816  */
    /* JADX WARN: Code duplicated, block: B:377:0x0846  */
    /* JADX WARN: Code duplicated, block: B:383:0x086e  */
    /* JADX WARN: Code duplicated, block: B:385:0x087d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0889  */
    /* JADX WARN: Code duplicated, block: B:389:0x0895  */
    /* JADX WARN: Code duplicated, block: B:390:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:420:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x08ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int iMax;
        int iResolveSizeAndState;
        float f;
        int iCombineMeasuredStates;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c2;
        int i8;
        int iMax2;
        View childAt;
        int i9;
        int i10;
        int baseline;
        int i11;
        int iMakeMeasureSpec;
        int i12;
        int i13;
        View childAt2;
        aJn ajn;
        int i14;
        View childAt3;
        aJn ajn2;
        int i15;
        int i16;
        float f2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z;
        boolean z2;
        aJn ajn3;
        int measuredWidth;
        boolean z3;
        int i23;
        boolean z4;
        int i24;
        int measuredHeight;
        boolean z5;
        int iMax3;
        int baseline2;
        int i25;
        int i26;
        int i27;
        boolean z6;
        int i28;
        int i29;
        boolean z7;
        aJn ajn4;
        boolean z8;
        int i30;
        boolean z9;
        int iMax4;
        int i31 = -2;
        int i32 = Integer.MIN_VALUE;
        int i33 = 8;
        int i34 = 1073741824;
        float f3 = 0.0f;
        boolean z10 = true;
        if (this.f == 1) {
            this.g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i35 = this.c;
            boolean z11 = this.a;
            boolean z12 = true;
            int i36 = 0;
            int iMax5 = 0;
            int i37 = 0;
            int iMax6 = 0;
            boolean z13 = false;
            int i38 = 0;
            int iMax7 = 0;
            boolean z14 = false;
            float f4 = 0.0f;
            while (i36 < virtualChildCount) {
                View childAt4 = getChildAt(i36);
                if (childAt4 == null) {
                    this.g = this.g;
                } else {
                    if (childAt4.getVisibility() != i33) {
                        if (i(i36)) {
                            this.g += this.l;
                        }
                        aJn ajn5 = (aJn) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) ajn5).weight;
                        f4 += f5;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) ajn5).height == 0 && f5 > f3) {
                            int i39 = this.g;
                            this.g = Math.max(i39, ((LinearLayout.LayoutParams) ajn5).topMargin + i39 + ((LinearLayout.LayoutParams) ajn5).bottomMargin);
                            ajn4 = ajn5;
                            z8 = true;
                            z7 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) ajn5).height != 0 || f5 <= f3) {
                                i29 = i32;
                            } else {
                                ((LinearLayout.LayoutParams) ajn5).height = i31;
                                i29 = 0;
                            }
                            int i40 = f4 == f3 ? this.g : 0;
                            z7 = true;
                            ajn4 = ajn5;
                            measureChildWithMargins(childAt4, i, 0, i2, i40);
                            if (i29 != i32) {
                                ((LinearLayout.LayoutParams) ajn4).height = i29;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i41 = this.g;
                            this.g = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) ajn4).topMargin + ((LinearLayout.LayoutParams) ajn4).bottomMargin);
                            int i42 = iMax7;
                            if (z11) {
                                iMax7 = Math.max(measuredHeight2, i42);
                            }
                            z8 = z13;
                        }
                        if (i35 >= 0 && i35 == i36 + 1) {
                            this.d = this.g;
                        }
                        if (i36 < i35 && ((LinearLayout.LayoutParams) ajn4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i30 = mode;
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) ajn4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = z7;
                            z14 = z9;
                        }
                        int i43 = ((LinearLayout.LayoutParams) ajn4).leftMargin + ((LinearLayout.LayoutParams) ajn4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i43;
                        iMax4 = Math.max(i37, measuredWidth2);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(i38, childAt4.getMeasuredState());
                        boolean z15 = (z12 && ((LinearLayout.LayoutParams) ajn4).width == -1) ? z7 : false;
                        if (((LinearLayout.LayoutParams) ajn4).weight > 0.0f) {
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax6 = Math.max(iMax6, i43);
                        } else {
                            int i44 = iMax6;
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i43);
                            iMax6 = i44;
                        }
                        z13 = z8;
                        z12 = z15;
                        i38 = iCombineMeasuredStates2;
                    }
                    i36++;
                    mode = i30;
                    i37 = iMax4;
                    i35 = i35;
                    z10 = z7;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i31 = -2;
                    i32 = Integer.MIN_VALUE;
                    i33 = 8;
                    i34 = 1073741824;
                    f3 = 0.0f;
                }
                i35 = i35;
                mode2 = mode2;
                i30 = mode;
                virtualChildCount = virtualChildCount;
                iMax4 = i37;
                z7 = true;
                i36++;
                mode = i30;
                i37 = iMax4;
                i35 = i35;
                z10 = z7;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i31 = -2;
                i32 = Integer.MIN_VALUE;
                i33 = 8;
                i34 = 1073741824;
                f3 = 0.0f;
            }
            int i45 = mode2;
            int i46 = mode;
            int i47 = virtualChildCount;
            boolean z16 = z10;
            int iMax8 = iMax5;
            int iMax9 = i37;
            int i48 = iMax6;
            int iCombineMeasuredStates3 = i38;
            int i49 = iMax7;
            int i50 = i47;
            if (this.g > 0 && i(i50)) {
                this.g += this.l;
            }
            if (z11 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                this.g = 0;
                for (int i51 = 0; i51 < i50; i51++) {
                    View childAt5 = getChildAt(i51);
                    if (childAt5 == null) {
                        this.g = this.g;
                    } else if (childAt5.getVisibility() != 8) {
                        aJn ajn6 = (aJn) childAt5.getLayoutParams();
                        int i52 = this.g;
                        this.g = Math.max(i52, i52 + i49 + ((LinearLayout.LayoutParams) ajn6).topMargin + ((LinearLayout.LayoutParams) ajn6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.g;
            this.g = paddingBottom;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i53 = (16777215 & iResolveSizeAndState2) - this.g;
            if (z13 || (i53 != 0 && f4 > 0.0f)) {
                float f6 = this.h;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.g = 0;
                int i54 = 0;
                while (i54 < i50) {
                    View childAt6 = getChildAt(i54);
                    if (childAt6.getVisibility() != 8) {
                        aJn ajn7 = (aJn) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) ajn7).weight;
                        if (f7 > 0.0f) {
                            int i55 = (int) ((i53 * f7) / f4);
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) ajn7).leftMargin + ((LinearLayout.LayoutParams) ajn7).rightMargin, ((LinearLayout.LayoutParams) ajn7).width);
                            if (((LinearLayout.LayoutParams) ajn7).height == 0) {
                                i28 = 1073741824;
                                if (i45 == 1073741824) {
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i55 > 0 ? i55 : 0, 1073741824));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                f4 -= f7;
                                i53 -= i55;
                            } else {
                                i28 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i55;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i28));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            f4 -= f7;
                            i53 -= i55;
                        }
                        int i56 = ((LinearLayout.LayoutParams) ajn7).leftMargin + ((LinearLayout.LayoutParams) ajn7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i56;
                        iMax9 = Math.max(iMax9, measuredWidth3);
                        if (i46 != 1073741824) {
                            i27 = -1;
                            if (((LinearLayout.LayoutParams) ajn7).width != -1) {
                            }
                            iMax8 = Math.max(iMax8, i56);
                            if (z12 || ((LinearLayout.LayoutParams) ajn7).width != i27) {
                                z6 = false;
                            } else {
                                z6 = z16;
                            }
                            int i57 = this.g;
                            this.g = Math.max(i57, childAt6.getMeasuredHeight() + i57 + ((LinearLayout.LayoutParams) ajn7).topMargin + ((LinearLayout.LayoutParams) ajn7).bottomMargin);
                            z12 = z6;
                        } else {
                            i27 = -1;
                        }
                        i56 = measuredWidth3;
                        iMax8 = Math.max(iMax8, i56);
                        if (z12) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        int i58 = this.g;
                        this.g = Math.max(i58, childAt6.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) ajn7).topMargin + ((LinearLayout.LayoutParams) ajn7).bottomMargin);
                        z12 = z6;
                    } else {
                        iResolveSizeAndState2 = iResolveSizeAndState2;
                        i50 = i50;
                    }
                    i54++;
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                    i50 = i50;
                }
                i25 = iResolveSizeAndState2;
                i26 = i50;
                this.g = getPaddingBottom() + getPaddingTop() + this.g;
            } else {
                iMax8 = Math.max(iMax8, i48);
                if (z11 && i45 != 1073741824) {
                    for (int i59 = 0; i59 < i50; i59++) {
                        View childAt7 = getChildAt(i59);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((aJn) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                        }
                    }
                }
                i25 = iResolveSizeAndState2;
                i26 = i50;
            }
            if (z12 || i46 == 1073741824) {
                iMax8 = iMax9;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax8, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), i25);
            if (z14) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                int i60 = i26;
                for (int i61 = 0; i61 < i60; i61++) {
                    View childAt8 = getChildAt(i61);
                    if (childAt8.getVisibility() != 8) {
                        aJn ajn8 = (aJn) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) ajn8).width == -1) {
                            int i62 = ((LinearLayout.LayoutParams) ajn8).height;
                            ((LinearLayout.LayoutParams) ajn8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) ajn8).height = i62;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.b;
        boolean z18 = this.a;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int i63 = 0;
        float f8 = 0.0f;
        int i64 = 0;
        int i65 = 0;
        int iMax10 = 0;
        int iMax11 = 0;
        int i66 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i65 < virtualChildCount2) {
            View childAt9 = getChildAt(i65);
            if (childAt9 == null) {
                this.g = this.g;
                i15 = i63;
                i16 = i64;
            } else {
                i15 = i63;
                i16 = i64;
                if (childAt9.getVisibility() != 8) {
                    if (i(i65)) {
                        this.g += this.m;
                    }
                    aJn ajn9 = (aJn) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) ajn9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) ajn9).width == 0 && f9 > 0.0f) {
                        if (z19) {
                            this.g = ((LinearLayout.LayoutParams) ajn9).leftMargin + ((LinearLayout.LayoutParams) ajn9).rightMargin + this.g;
                        } else {
                            int i67 = this.g;
                            this.g = Math.max(i67, ((LinearLayout.LayoutParams) ajn9).leftMargin + i67 + ((LinearLayout.LayoutParams) ajn9).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            ajn3 = ajn9;
                            i19 = i15;
                            i20 = i16;
                            i22 = i65;
                            z = z18;
                            z2 = z17;
                        } else {
                            ajn3 = ajn9;
                            i19 = i15;
                            i20 = i16;
                            i22 = i65;
                            i23 = 1073741824;
                            z = z18;
                            z2 = z17;
                            z3 = true;
                        }
                        if (mode4 == i23 && ((LinearLayout.LayoutParams) ajn3).height == -1) {
                            z4 = true;
                            z22 = true;
                        } else {
                            z4 = false;
                        }
                        i24 = ((LinearLayout.LayoutParams) ajn3).topMargin + ((LinearLayout.LayoutParams) ajn3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i24;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i68 = ((LinearLayout.LayoutParams) ajn3).gravity;
                            if (i68 < 0) {
                                i68 = this.e;
                            }
                            int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                            iArr[i69] = Math.max(iArr[i69], baseline2);
                            iArr2[i69] = Math.max(iArr2[i69], measuredHeight - baseline2);
                        }
                        int iMax12 = Math.max(i20, measuredHeight);
                        if (z20 || ((LinearLayout.LayoutParams) ajn3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) ajn3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax11 = Math.max(iMax11, measuredHeight);
                            iMax3 = i19;
                        } else {
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax3 = Math.max(i19, measuredHeight);
                        }
                        i64 = iMax12;
                        i63 = iMax3;
                        i66 = iCombineMeasuredStates4;
                        z21 = z3;
                        z20 = z5;
                        f8 = f10;
                    } else {
                        int i70 = i65;
                        if (((LinearLayout.LayoutParams) ajn9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) ajn9).width = -2;
                                i17 = 0;
                            }
                            if (f10 == f2) {
                                i18 = this.g;
                            } else {
                                i18 = 0;
                            }
                            i19 = i15;
                            i20 = i16;
                            i21 = i17;
                            i22 = i70;
                            z = z18;
                            z2 = z17;
                            measureChildWithMargins(childAt9, i, i18, i2, 0);
                            if (i21 != Integer.MIN_VALUE) {
                                ajn3 = ajn9;
                                ((LinearLayout.LayoutParams) ajn3).width = i21;
                            } else {
                                ajn3 = ajn9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z19) {
                                this.g = j.f(((LinearLayout.LayoutParams) ajn3).leftMargin + measuredWidth, ((LinearLayout.LayoutParams) ajn3).rightMargin, 0, this.g);
                            } else {
                                int i71 = this.g;
                                this.g = Math.max(i71, i71 + measuredWidth + ((LinearLayout.LayoutParams) ajn3).leftMargin + ((LinearLayout.LayoutParams) ajn3).rightMargin);
                            }
                            if (z) {
                                iMax10 = Math.max(measuredWidth, iMax10);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i18 = this.g;
                        } else {
                            i18 = 0;
                        }
                        i19 = i15;
                        i20 = i16;
                        i21 = i17;
                        i22 = i70;
                        z = z18;
                        z2 = z17;
                        measureChildWithMargins(childAt9, i, i18, i2, 0);
                        if (i21 != Integer.MIN_VALUE) {
                            ajn3 = ajn9;
                            ((LinearLayout.LayoutParams) ajn3).width = i21;
                        } else {
                            ajn3 = ajn9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z19) {
                            this.g = j.f(((LinearLayout.LayoutParams) ajn3).leftMargin + measuredWidth, ((LinearLayout.LayoutParams) ajn3).rightMargin, 0, this.g);
                        } else {
                            int i72 = this.g;
                            this.g = Math.max(i72, i72 + measuredWidth + ((LinearLayout.LayoutParams) ajn3).leftMargin + ((LinearLayout.LayoutParams) ajn3).rightMargin);
                        }
                        if (z) {
                            iMax10 = Math.max(measuredWidth, iMax10);
                        }
                    }
                    z3 = z21;
                    i23 = 1073741824;
                    if (mode4 == i23) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i24 = ((LinearLayout.LayoutParams) ajn3).topMargin + ((LinearLayout.LayoutParams) ajn3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i24;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax13 = Math.max(i20, measuredHeight);
                    if (z20) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) ajn3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax11 = Math.max(iMax11, measuredHeight);
                        iMax3 = i19;
                    } else {
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax3 = Math.max(i19, measuredHeight);
                    }
                    i64 = iMax13;
                    i63 = iMax3;
                    i66 = iCombineMeasuredStates5;
                    z21 = z3;
                    z20 = z5;
                    f8 = f10;
                }
                i65 = i22 + 1;
                z18 = z;
                z17 = z2;
            }
            z2 = z17;
            i63 = i15;
            i64 = i16;
            i22 = i65;
            z = z18;
            i65 = i22 + 1;
            z18 = z;
            z17 = z2;
        }
        boolean z23 = z18;
        boolean z24 = z17;
        int i73 = i63;
        int i74 = i64;
        if (this.g > 0 && i(virtualChildCount2)) {
            this.g += this.m;
        }
        int i75 = iArr[1];
        if (i75 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                iMax = i74;
            }
            if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.g = 0;
                for (i14 = 0; i14 < virtualChildCount2; i14++) {
                    childAt3 = getChildAt(i14);
                    if (childAt3 == null) {
                        this.g = this.g;
                    } else if (childAt3.getVisibility() == 8) {
                        ajn2 = (aJn) childAt3.getLayoutParams();
                        if (z19) {
                            this.g = j.f(((LinearLayout.LayoutParams) ajn2).leftMargin + iMax10, ((LinearLayout.LayoutParams) ajn2).rightMargin, 0, this.g);
                        } else {
                            int i76 = this.g;
                            this.g = Math.max(i76, i76 + iMax10 + ((LinearLayout.LayoutParams) ajn2).leftMargin + ((LinearLayout.LayoutParams) ajn2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.g;
            this.g = paddingRight;
            iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            int i77 = (16777215 & iResolveSizeAndState) - this.g;
            if (!z21 || (i77 != 0 && f8 > 0.0f)) {
                f = this.h;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.g = 0;
                iCombineMeasuredStates = i66;
                iMax = -1;
                i3 = 0;
                while (i3 < virtualChildCount2) {
                    childAt = getChildAt(i3);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        iResolveSizeAndState = iResolveSizeAndState;
                        virtualChildCount2 = virtualChildCount2;
                        i9 = mode3;
                        i3 = i3;
                        iArr2 = iArr2;
                    } else {
                        aJn ajn10 = (aJn) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) ajn10).weight;
                        if (f11 > 0.0f) {
                            int i78 = (int) ((i77 * f11) / f8);
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) ajn10).topMargin + ((LinearLayout.LayoutParams) ajn10).bottomMargin, ((LinearLayout.LayoutParams) ajn10).height);
                            if (((LinearLayout.LayoutParams) ajn10).width == 0) {
                                i11 = 1073741824;
                                i9 = mode3;
                                if (mode3 == 1073741824) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i78 > 0 ? i78 : 0, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f8 -= f11;
                                i77 -= i78;
                            } else {
                                i9 = mode3;
                                i11 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i78;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 -= f11;
                            i77 -= i78;
                        } else {
                            i9 = mode3;
                        }
                        if (z19) {
                            this.g = j.f(childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) ajn10).leftMargin, ((LinearLayout.LayoutParams) ajn10).rightMargin, 0, this.g);
                        } else {
                            int i79 = this.g;
                            this.g = Math.max(i79, childAt.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) ajn10).leftMargin + ((LinearLayout.LayoutParams) ajn10).rightMargin);
                        }
                        boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) ajn10).height == -1;
                        int i80 = ((LinearLayout.LayoutParams) ajn10).topMargin + ((LinearLayout.LayoutParams) ajn10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i80;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z25) {
                            i80 = measuredHeight4;
                        }
                        int iMax14 = Math.max(i73, i80);
                        if (z20) {
                            i10 = -1;
                            boolean z26 = ((LinearLayout.LayoutParams) ajn10).height == -1;
                            if (!z24 && (baseline = childAt.getBaseline()) != i10) {
                                int i81 = ((LinearLayout.LayoutParams) ajn10).gravity;
                                if (i81 < 0) {
                                    i81 = this.e;
                                }
                                int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                                iArr[i82] = Math.max(iArr[i82], baseline);
                                iArr2[i82] = Math.max(iArr2[i82], measuredHeight4 - baseline);
                            }
                            z20 = z26;
                            i73 = iMax14;
                        } else {
                            i10 = -1;
                        }
                        if (!z24) {
                        }
                        z20 = z26;
                        i73 = iMax14;
                    }
                    i3++;
                    virtualChildCount2 = virtualChildCount2;
                    mode3 = i9;
                    iResolveSizeAndState = iResolveSizeAndState;
                    iArr2 = iArr2;
                }
                i4 = i2;
                i5 = iResolveSizeAndState;
                i6 = virtualChildCount2;
                int[] iArr3 = iArr2;
                this.g = getPaddingRight() + getPaddingLeft() + this.g;
                i7 = iArr[1];
                if (i7 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c2 = 3;
                    if (iArr[3] == -1) {
                        iMax2 = i73;
                    }
                    if (!z20 && mode4 != 1073741824) {
                        iMax = i73;
                    }
                    setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | i5, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
                    if (z22) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        i13 = i6;
                        for (i12 = i8; i12 < i13; i12++) {
                            childAt2 = getChildAt(i12);
                            if (childAt2.getVisibility() != 8) {
                                ajn = (aJn) childAt2.getLayoutParams();
                                if (((LinearLayout.LayoutParams) ajn).height == -1) {
                                    int i83 = ((LinearLayout.LayoutParams) ajn).width;
                                    ((LinearLayout.LayoutParams) ajn).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((LinearLayout.LayoutParams) ajn).width = i83;
                                }
                            }
                        }
                    }
                }
                c2 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr3[c2], Math.max(iArr3[0], Math.max(iArr3[1], iArr3[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                if (!z20) {
                    iMax = i73;
                }
                setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | i5, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
                if (z22) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    i13 = i6;
                    while (i12 < i13) {
                        childAt2 = getChildAt(i12);
                        if (childAt2.getVisibility() != 8) {
                            ajn = (aJn) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) ajn).height == -1) {
                                int i84 = ((LinearLayout.LayoutParams) ajn).width;
                                ((LinearLayout.LayoutParams) ajn).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((LinearLayout.LayoutParams) ajn).width = i84;
                            }
                        }
                    }
                }
            }
            iMax2 = Math.max(i73, iMax11);
            if (z23 && mode3 != 1073741824) {
                for (int i85 = 0; i85 < virtualChildCount2; i85++) {
                    View childAt10 = getChildAt(i85);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((aJn) childAt10.getLayoutParams())).weight > 0.0f) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax10, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            iCombineMeasuredStates = i66;
            i73 = iMax2;
            i8 = 0;
            if (!z20) {
                iMax = i73;
            }
            setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | i5, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
            if (z22) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i13 = i6;
                while (i12 < i13) {
                    childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        ajn = (aJn) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) ajn).height == -1) {
                            int i86 = ((LinearLayout.LayoutParams) ajn).width;
                            ((LinearLayout.LayoutParams) ajn).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) ajn).width = i86;
                        }
                    }
                }
            }
        }
        c = 3;
        iMax = Math.max(i74, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i75, iArr[2]))));
        if (z23) {
            this.g = 0;
            while (i14 < virtualChildCount2) {
                childAt3 = getChildAt(i14);
                if (childAt3 == null) {
                    this.g = this.g;
                } else if (childAt3.getVisibility() == 8) {
                    ajn2 = (aJn) childAt3.getLayoutParams();
                    if (z19) {
                        this.g = j.f(((LinearLayout.LayoutParams) ajn2).leftMargin + iMax10, ((LinearLayout.LayoutParams) ajn2).rightMargin, 0, this.g);
                    } else {
                        int i710 = this.g;
                        this.g = Math.max(i710, i710 + iMax10 + ((LinearLayout.LayoutParams) ajn2).leftMargin + ((LinearLayout.LayoutParams) ajn2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.g;
        this.g = paddingRight2;
        iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i711 = (16777215 & iResolveSizeAndState) - this.g;
        if (z21) {
            f = this.h;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.g = 0;
            iCombineMeasuredStates = i66;
            iMax = -1;
            i3 = 0;
            while (i3 < virtualChildCount2) {
                childAt = getChildAt(i3);
                if (childAt != null) {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                    i9 = mode3;
                    i3 = i3;
                    iArr2 = iArr2;
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                    i9 = mode3;
                    i3 = i3;
                    iArr2 = iArr2;
                }
                i3++;
                virtualChildCount2 = virtualChildCount2;
                mode3 = i9;
                iResolveSizeAndState = iResolveSizeAndState;
                iArr2 = iArr2;
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            int[] iArr4 = iArr2;
            this.g = getPaddingRight() + getPaddingLeft() + this.g;
            i7 = iArr[1];
            if (i7 != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            i8 = 0;
            iMax = Math.max(iMax, Math.max(iArr4[c2], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i7, iArr[2]))));
        } else {
            f = this.h;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.g = 0;
            iCombineMeasuredStates = i66;
            iMax = -1;
            i3 = 0;
            while (i3 < virtualChildCount2) {
                childAt = getChildAt(i3);
                if (childAt != null) {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                    i9 = mode3;
                    i3 = i3;
                    iArr2 = iArr2;
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                    i9 = mode3;
                    i3 = i3;
                    iArr2 = iArr2;
                }
                i3++;
                virtualChildCount2 = virtualChildCount2;
                mode3 = i9;
                iResolveSizeAndState = iResolveSizeAndState;
                iArr2 = iArr2;
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            int[] iArr5 = iArr2;
            this.g = getPaddingRight() + getPaddingLeft() + this.g;
            i7 = iArr[1];
            if (i7 != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            i8 = 0;
            iMax = Math.max(iMax, Math.max(iArr5[c2], Math.max(iArr5[0], Math.max(iArr5[1], iArr5[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i7, iArr[2]))));
        }
        if (!z20) {
            iMax = i73;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | i5, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
        if (z22) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i13 = i6;
            while (i12 < i13) {
                childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() != 8) {
                    ajn = (aJn) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) ajn).height == -1) {
                        int i87 = ((LinearLayout.LayoutParams) ajn).width;
                        ((LinearLayout.LayoutParams) ajn).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) ajn).width = i87;
                    }
                }
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.c = i;
            return;
        }
        StringBuilder sbW = j.w("base aligned child index out of range (0, ");
        sbW.append(getChildCount());
        sbW.append(")");
        throw new IllegalArgumentException(sbW.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.m = drawable.getIntrinsicWidth();
            this.l = drawable.getIntrinsicHeight();
        } else {
            this.m = 0;
            this.l = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f11o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.a = z;
    }

    public void setOrientation(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public OooO0O0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OooO0O0(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        this.b = true;
        this.c = -1;
        this.d = 0;
        this.e = 8388659;
        int[] iArr = h.f66o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        T.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.h = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.c = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (typedArrayObtainStyledAttributes.hasValue(5) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = A.c(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.n = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f11o = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
