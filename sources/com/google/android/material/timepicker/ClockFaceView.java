package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p093o0000Oo.OooO;
import java.util.Arrays;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends OooO implements ClockHandView.OooO0OO {
    public final int A;
    public final int B;
    public final int C;
    public String[] D;
    public float E;
    public final ColorStateList F;
    public final C0283j p;
    public final Rect q;
    public final ClockHandView u;
    public final RectF v;
    public final SparseArray<TextView> w;
    public final float[] x;
    public final int[] y;
    public final int z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.q = new Rect();
        this.v = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.w = sparseArray;
        this.x = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.p, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListB = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 1);
        this.F = colorStateListB;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.u = clockHandView;
        this.z = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.y = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.f.add(this);
        int defaultColor = A.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListB2 = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new j(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.p = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        this.D = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.D.length, size); i++) {
            TextView textView = this.w.get(i);
            if (i >= this.D.length) {
                removeView(textView);
                this.w.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.w.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.D[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                T.q(textView, this.p);
                textView.setTextColor(this.F);
            }
        }
        this.B = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.A = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.C = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OooO0OO
    public void b(float f, boolean z) {
        if (Math.abs(this.E - f) > 0.001f) {
            this.E = f;
            c();
        }
    }

    public final void c() {
        RectF rectF = this.u.j;
        for (int i = 0; i < this.w.size(); i++) {
            TextView textView = this.w.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.q);
                this.q.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.q);
                this.v.set(this.q);
                textView.getPaint().setShader(RectF.intersects(rectF, this.v) ? new RadialGradient(rectF.centerX() - this.v.left, rectF.centerY() - this.v.top, rectF.width() * 0.5f, this.y, this.x, Shader.TileMode.CLAMP) : null);
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) al.aXD.c(1, this.D.length, false, 1).c);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.C / Math.max(Math.max(this.B / displayMetrics.heightPixels, this.A / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
