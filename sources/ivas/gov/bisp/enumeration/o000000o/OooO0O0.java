package ivas.gov.bisp.enumeration.o000000o;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 extends CardView implements Checkable, o {
    private static int j = 0;
    private static int k = 1;
    public static final int[] l = {R.attr.state_dragged};
    public boolean m;

    public interface bdP {
    }

    static {
        int i = 1 & 57;
        int i2 = (~i) & (1 | 57);
        int i3 = -(-(i << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        j = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 | 65) << 1;
        int i4 = -(((~i2) & 65) | (i2 & (-66)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        j = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        int i = 2 % 2;
        int i2 = j + 3;
        k = i2 % 128;
        int i3 = i2 % 2;
        throw null;
    }

    public float getCardViewRadius() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 119;
        int i4 = (((i2 | 119) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        j = i4 % 128;
        int i5 = i4 % 2;
        float radius = super.getRadius();
        int i6 = j;
        int i7 = ((i6 ^ 49) | (i6 & 49)) << 1;
        int i8 = -(((~i6) & 49) | (i6 & (-50)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        k = i9 % 128;
        int i10 = i9 % 2;
        return radius;
    }

    public Drawable getCheckedIcon() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = ((((i2 ^ 89) | (i2 & 89)) << 1) - (~(-(((~i2) & 89) | (i2 & (-90)))))) - 1;
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    public int getCheckedIconMargin() {
        int i = 2 % 2;
        int i2 = k + 17;
        j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 29 / 0;
        throw null;
    }

    public int getCheckedIconSize() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = ((i2 ^ 73) | (i2 & 73)) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 & i4) + (i4 | i3);
        j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i6 = 0 / 0;
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 9;
        int i4 = (i2 ^ 9) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        k = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = 82 / 0;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 105;
        int i4 = i2 | 105;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        k = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        k = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        k = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        int i7 = 54 / 0;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 31;
        int i4 = (i2 | 31) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        j = i6 % 128;
        int i7 = i6 % 2;
        throw null;
    }

    public float getProgress() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = ((i2 & 29) - (~(i2 | 29))) - 1;
        k = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 ^ 81;
        int i4 = -(-((i2 & 81) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        j = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    public ColorStateList getRippleColor() {
        int i = 2 % 2;
        int i2 = j + 23;
        k = i2 % 128;
        int i3 = i2 % 2;
        throw null;
    }

    public t getShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        k = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = ((i2 | 107) << 1) - (i2 ^ 107);
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    public int getStrokeWidth() {
        int i = 2 % 2;
        int i2 = k + 7;
        j = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 19;
        int i4 = i3 + ((i2 ^ 19) | i3);
        int i5 = i4 % 128;
        j = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 99;
        k = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = k;
        int i5 = i4 & 81;
        int i6 = (i4 | 81) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        j = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            super.onMeasure(i, i2);
            getMeasuredWidth();
            getMeasuredHeight();
            obj.hashCode();
            throw null;
        }
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        int i9 = j;
        int i10 = (i9 ^ 43) + ((i9 & 43) << 1);
        k = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = k + 31;
        j = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundDrawable(drawable);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = j;
        int i5 = ((i4 ^ 99) | (i4 & 99)) << 1;
        int i6 = -(((~i4) & 99) | (i4 & (-100)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        k = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 ^ 125) + ((i2 & 125) << 1);
        j = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = ((i2 & 74) + (i2 | 74)) - 1;
        j = i3 % 128;
        int i4 = i3 % 2;
        super.setBackgroundDrawable(drawable);
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        int i6 = j;
        int i7 = i6 & 25;
        int i8 = (i6 | 25) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        k = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = k;
        int i4 = i3 & 37;
        int i5 = (i4 - (~(-(-((i3 ^ 37) | i4))))) - 1;
        j = i5 % 128;
        int i6 = i5 % 2;
        ColorStateList.valueOf(i);
        if (i6 == 0) {
            throw null;
        }
        int i7 = 47 / 0;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        int i = 2 % 2;
        int i2 = k + 109;
        j = i2 % 128;
        if (i2 % 2 == 0) {
            super.setCardElevation(f);
            throw null;
        }
        super.setCardElevation(f);
        int i3 = 40 / 0;
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = ((i2 ^ 86) + ((i2 & 86) << 1)) - 1;
        k = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    public void setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 95;
        int i4 = ((i2 ^ 95) | i3) << 1;
        int i5 = -((i2 | 95) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        k = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 ^ 47;
        int i4 = ((i2 & 47) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        k = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = ((i2 & 53) - (~(i2 | 53))) - 1;
        k = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        int i2 = 2 % 2;
        int i3 = j;
        int i4 = i3 & 97;
        int i5 = ((((i3 ^ 97) | i4) << 1) - (~(-((i3 | 97) & (~i4))))) - 1;
        k = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public void setCheckedIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = k;
        int i4 = (i3 & 83) + (i3 | 83);
        j = i4 % 128;
        int i5 = i4 % 2;
        A.c(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(int i) {
        int i2 = 2 % 2;
        int i3 = j;
        int i4 = (-2) - (((i3 ^ 4) + ((i3 & 4) << 1)) ^ (-1));
        k = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        getResources().getDimensionPixelSize(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = (r1 & 115) + (r1 | 115);
        ivas.gov.bisp.enumeration.o000000o.OooO0O0.j = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCheckedIconSizeResource(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.o000000o.OooO0O0.j
            r2 = r1 ^ 99
            r3 = r1 & 99
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r1 = r1 | 99
            r1 = r1 & r3
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.o000000o.OooO0O0.k = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            r2 = 30
            int r2 = r2 / 0
            if (r5 != 0) goto L30
            goto L25
        L23:
            if (r5 != 0) goto L30
        L25:
            r5 = r1 & 115(0x73, float:1.61E-43)
            r1 = r1 | 115(0x73, float:1.61E-43)
            int r5 = r5 + r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.o000000o.OooO0O0.j = r1
            int r5 = r5 % r0
            return
        L30:
            android.content.res.Resources r0 = r4.getResources()
            r0.getDimensionPixelSize(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.o000000o.OooO0O0.setCheckedIconSizeResource(int):void");
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 59;
        int i4 = i3 + ((i2 ^ 59) | i3);
        k = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 25;
        int i4 = -(-((i2 ^ 25) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        k = i5 % 128;
        int i6 = i5 % 2;
        super.setClickable(z);
        if (i6 == 0) {
            int i7 = 21 / 0;
        }
    }

    public void setOnCheckedChangeListener(bdP bdp) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 51;
        int i4 = ((i2 ^ 51) | i3) << 1;
        int i5 = -((i2 | 51) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        j = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setProgress(float f) {
        int i = 2 % 2;
        int i2 = j + 25;
        k = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = 11 / 0;
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = (i2 ^ 125) + ((i2 & 125) << 1);
        k = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = 46 / 0;
        throw null;
    }

    public void setStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = j;
        int i4 = i3 ^ 105;
        int i5 = ((i3 & 105) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        k = i7 % 128;
        if (i7 % 2 != 0) {
            setStrokeColor(ColorStateList.valueOf(i));
        } else {
            setStrokeColor(ColorStateList.valueOf(i));
            int i8 = 3 / 0;
        }
    }

    public void setStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = k + 73;
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        k = i5 % 128;
        int i6 = i5 % 2;
    }

    private RectF getBoundsAsRectF() {
        int i = 2 % 2;
        new RectF();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 & 63) + (i2 | 63);
        j = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 | 71;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 71)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        j = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = 31 / 0;
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        int i2 = 2 % 2;
        int i3 = k;
        int i4 = i3 ^ 9;
        int i5 = ((i3 & 9) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        j = i8;
        Object obj = null;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i != -1) {
            getResources().getDimensionPixelSize(i);
            throw null;
        }
        int i9 = i8 & 107;
        int i10 = ((i8 | 107) & (~i9)) + (i9 << 1);
        k = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 | 15;
        int i4 = (i3 << 1) - ((~(i2 & 15)) & i3);
        k = i4 % 128;
        int i5 = i4 % 2;
        super.setMaxCardElevation(f);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 & 83) + (i2 | 83);
        j = i3 % 128;
        if (i3 % 2 == 0) {
            super.setPreventCornerOverlap(z);
            throw null;
        }
        super.setPreventCornerOverlap(z);
        int i4 = 38 / 0;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 85;
        int i4 = ((i2 ^ 85) | i3) << 1;
        int i5 = -((i2 | 85) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        j = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            super.setRadius(f);
            throw null;
        }
        super.setRadius(f);
        obj.hashCode();
        throw null;
    }

    public void setRippleColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = j;
        int i4 = i3 & 33;
        int i5 = (i4 - (~((i3 ^ 33) | i4))) - 1;
        k = i5 % 128;
        if (i5 % 2 == 0) {
            A.b(getContext(), i);
            throw null;
        }
        A.b(getContext(), i);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.O.o
    public void setShapeAppearanceModel(t tVar) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 3;
        int i4 = (i2 | 3) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        j = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            setClipToOutline(tVar.i(getBoundsAsRectF()));
            throw null;
        }
        setClipToOutline(tVar.i(getBoundsAsRectF()));
        obj.hashCode();
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        k = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 107;
        int i4 = -(-(i2 | 107));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        j = i5 % 128;
        if (i5 % 2 != 0) {
            super.setUseCompatPadding(z);
            throw null;
        }
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int i2 = 2 % 2;
        int i3 = j;
        int i4 = i3 ^ 39;
        int i5 = (((i3 & 39) | i4) << 1) - i4;
        k = i5 % 128;
        int i6 = i5 % 2;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.m) {
            int i7 = k;
            int i8 = i7 & 33;
            int i9 = i8 + ((i7 ^ 33) | i8);
            j = i9 % 128;
            int i10 = i9 % 2;
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, l);
            int i11 = j;
            int i12 = (i11 ^ 80) + ((i11 & 80) << 1);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            k = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 % 2;
            }
        }
        int i15 = k;
        int i16 = (i15 | 113) << 1;
        int i17 = -(i15 ^ 113);
        int i18 = (i16 & i17) + (i17 | i16);
        j = i18 % 128;
        int i19 = i18 % 2;
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        k = i3 % 128;
        if (i3 % 2 == 0) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
        int i4 = k;
        int i5 = (i4 & 5) + (i4 | 5);
        j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (((i2 | 12) << 1) - (i2 ^ 12)) - 1;
        j = i3 % 128;
        if (i3 % 2 != 0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } else {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        int i4 = j;
        int i5 = ((i4 | 70) << 1) - (i4 ^ 70);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        k = i6 % 128;
        if (i6 % 2 == 0) {
            accessibilityNodeInfo.setClickable(isClickable());
            accessibilityNodeInfo.setChecked(true);
        } else {
            accessibilityNodeInfo.setClickable(isClickable());
            accessibilityNodeInfo.setChecked(false);
        }
    }

    public void setDragged(boolean z) {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        j = i3 % 128;
        int i4 = i3 % 2;
        if (this.m == z) {
            int i5 = i2 & 99;
            int i6 = i2 | 99;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            j = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = i2 + 107;
        j = i9 % 128;
        int i10 = i9 % 2;
        this.m = z;
        refreshDrawableState();
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
        int i11 = j;
        int i12 = ((i11 & 90) + (i11 | 90)) - 1;
        k = i12 % 128;
        int i13 = i12 % 2;
        invalidate();
        int i14 = j;
        int i15 = i14 & 19;
        int i16 = ((i14 | 19) & (~i15)) + (i15 << 1);
        k = i16 % 128;
        int i17 = i16 % 2;
    }
}
