package ivas.gov.bisp.enumeration.p095o0000oO;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.u;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.aW.p;
import ivas.gov.bisp.enumeration.dc.j;
import ivas.gov.bisp.enumeration.p081d.M;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0 extends FrameLayout implements m.aIE {
    private static int a = 1;
    private static int b;
    public static final int[] c = {R.attr.state_checked};
    public static final bhh d = new bhh(null);
    public static final bhh e;
    public bhh A;
    public float B;
    public int C;
    public int D;
    public boolean E;
    public j F;
    public int G;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
    public final FrameLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f107o;
    public final ImageView p;
    public final TextView q;
    public final ViewGroup r;
    public final TextView s;
    public int t;
    public ColorStateList u;
    public u v;
    public Drawable w;
    public boolean x;
    public ValueAnimator y;
    public Drawable z;

    public class bhg implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;

        public bhg(int i) {
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 40) + ((i2 & 40) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                OooOO0.this.p(this.c);
                int i5 = 49 / 0;
            } else {
                OooOO0.this.p(this.c);
            }
            int i6 = a + 105;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 0;
            }
        }
    }

    public static class bhh {
        private static int a = 1;
        private static int b;

        public bhh(bhf bhfVar) {
        }

        public float c(float f, float f2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = i4 & 85;
            int i7 = (i4 ^ 85) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return 1.0f;
        }
    }

    public static class bhi extends bhh {
        private static int a = 1;
        private static int b;

        public bhi(bhf bhfVar) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.o0000oO.OooOO0.bhh
        public float c(float f, float f2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 123;
            int i4 = (i2 ^ 123) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return ivas.gov.bisp.enumeration.T.j.b(0.4f, 1.0f, f);
        }
    }

    static {
        bhi bhiVar = new bhi(null);
        int i = b;
        int i2 = i ^ 89;
        int i3 = -(-((i & 89) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        e = bhiVar;
        if (i6 == 0) {
            int i7 = 31 / 0;
        }
        int i8 = i5 | 35;
        int i9 = i8 << 1;
        int i10 = -(i8 & (~(i5 & 35)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public OooOO0(Context context) {
        super(context);
        this.g = false;
        this.t = -1;
        this.A = d;
        this.B = 0.0f;
        this.x = false;
        this.D = 0;
        this.C = 0;
        this.E = false;
        this.G = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.n = (FrameLayout) findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_icon_container);
        this.f107o = findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_icon_view);
        this.p = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_labels_group);
        this.r = viewGroup;
        TextView textView = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_small_label_view);
        this.q = textView;
        TextView textView2 = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.navigation_bar_item_large_label_view);
        this.s = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.h = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.i = viewGroup.getPaddingBottom();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(textView, 2);
        T.aWX.t(textView2, 2);
        setFocusable(true);
        k(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new bhf());
            int i = a;
            int i2 = i ^ 101;
            int i3 = ((i & 101) | i2) << 1;
            int i4 = -i2;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        int i7 = b;
        int i8 = ((i7 ^ 79) - (~((i7 & 79) << 1))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public static void c(View view, int i) {
        int i2 = 2 % 2;
        int i3 = b + 27;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            view.getPaddingLeft();
            view.getPaddingTop();
            view.getPaddingRight();
            throw null;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        int i4 = a;
        int i5 = (i4 & 35) + (i4 | 35);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public static void f(View view, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 96) << 1) - (i4 ^ 96);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        int i8 = b;
        int i9 = i8 & 105;
        int i10 = i9 + ((i8 ^ 105) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
        int i12 = b;
        int i13 = i12 & 39;
        int i14 = -(-((i12 ^ 39) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 67 / 0;
        }
    }

    private View getIconOrContainer() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 110) + ((i2 & 110) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        View view = this.n;
        if (view == null) {
            view = this.p;
            int i5 = (i4 & (-14)) | ((~i4) & 13);
            int i6 = (i4 & 13) << 1;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (i4 | 103) << 1;
        int i10 = -(((~i4) & 103) | (i4 & (-104)));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return view;
    }

    private int getSuggestedIconHeight() {
        int minimumHeight;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (~i3) & (i2 | 107);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        j jVar = this.F;
        if (jVar != null) {
            int i9 = i2 & 115;
            int i10 = i9 + ((i2 ^ 115) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            minimumHeight = jVar.getMinimumHeight() / 2;
            int i12 = b + 37;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 3;
            }
        } else {
            int i14 = i7 & 73;
            int i15 = (i7 | 73) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            minimumHeight = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int i19 = b;
        int i20 = (i19 ^ 35) + ((i19 & 35) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        int iMax = Math.max(minimumHeight, layoutParams.topMargin);
        int measuredWidth = this.p.getMeasuredWidth();
        int i22 = b;
        int i23 = i22 ^ 79;
        int i24 = -(-((i22 & 79) << 1));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        int i26 = i25 % 128;
        a = i26;
        int i27 = i25 % 2;
        int i28 = measuredWidth ^ iMax;
        int i29 = ((iMax & measuredWidth) | i28) << 1;
        int i30 = -i28;
        int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
        int i32 = -(~minimumHeight);
        int i33 = (((i31 | i32) << 1) - (i32 ^ i31)) - 1;
        int i34 = (((i26 | 82) << 1) - (i26 ^ 82)) - 1;
        b = i34 % 128;
        int i35 = i34 % 2;
        return i33;
    }

    public Drawable getActiveIndicatorDrawable() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = (i2 & 105) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        View view = this.f107o;
        if (view != null) {
            Drawable background = view.getBackground();
            int i8 = (-2) - ((a + 50) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 72 / 0;
            }
            return background;
        }
        int i10 = ((i6 ^ 67) | (i6 & 67)) << 1;
        int i11 = -((i6 & (-68)) | ((~i6) & 67));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i6 & 13;
        int i15 = i14 + ((i6 ^ 13) | i14);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public j getBadge() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = (i2 ^ 71) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j jVar = this.F;
        int i7 = ((i6 & 89) - (~(-(-(i6 | 89))))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 80 / 0;
        }
        return jVar;
    }

    public int getItemBackgroundResId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 123) - (~(-(-(i2 | 123))))) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = ((i4 | 85) << 1) - (i4 ^ 85);
        b = i5 % 128;
        int i6 = i5 % 2;
        return ivas.gov.bisp.enumeration.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public u getItemData() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        u uVar = this.v;
        if (i8 != 0) {
            int i9 = 73 / 0;
        }
        int i10 = i7 & 105;
        int i11 = (i7 ^ 105) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return uVar;
    }

    public int getItemDefaultMarginResId() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 76) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return ivas.gov.bisp.enumeration.R.dimen.mtrl_navigation_bar_item_default_margin;
        }
        throw null;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i2 | 65) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this.t;
        }
        throw null;
    }

    public final boolean l() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = (i3 - (~(-(-((i2 ^ 15) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.F != null) {
            int i7 = (i5 & 37) + (i5 | 37);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i5 + 93;
            b = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            int i11 = i5 & 119;
            int i12 = (i5 | 119) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = b;
        int i17 = ((i16 ^ 48) + ((i16 & 48) << 1)) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        return z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        bhg bhgVar = new bhg(i);
        int i6 = a;
        int i7 = i6 ^ 73;
        int i8 = ((((i6 & 73) | i7) << 1) - (~(-i7))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            post(bhgVar);
        } else {
            post(bhgVar);
            int i9 = 10 / 0;
        }
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 91) << 1;
        int i4 = -((i2 & (-92)) | ((~i2) & 91));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        View view = this.f107o;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            int i6 = b + 25;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = ((i2 ^ 7) | (i2 & 7)) << 1;
        int i9 = -(((~i2) & 7) | (i2 & (-8)));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 9 / 0;
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = (i3 ^ 121) | i4;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.x = z;
        View view = this.f107o;
        if (view != null) {
            int i8 = ((i3 & 26) + (i3 | 26)) - 1;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            if (z) {
                int i11 = ((i9 ^ 27) | (i9 & 27)) << 1;
                int i12 = -((i9 & (-28)) | ((~i9) & 27));
                int i13 = (i11 & i12) + (i11 | i12);
                a = i13 % 128;
                i = i13 % 2 == 0 ? 1 : 0;
                int i14 = ((i9 & 125) - (~(i9 | 125))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = i9 + 95;
                a = i16 % 128;
                int i17 = i16 % 2;
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
            int i18 = a + 61;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = i20 & 1;
        int i22 = ((i20 | 1) & (~i21)) + (i21 << 1);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setActiveIndicatorHeight(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 67;
        int i5 = ((i3 & 67) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.C = i;
            p(getWidth());
        } else {
            this.C = i;
            p(getWidth());
            throw null;
        }
    }

    public void setActiveIndicatorResizeable(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = ((i2 ^ 43) | i3) << 1;
        int i5 = -((i2 | 43) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.E = z;
        if (i7 == 0) {
            throw null;
        }
    }

    public void setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        refreshDrawableState();
        int i4 = b;
        int i5 = ((i4 | 76) << 1) - (i4 ^ 76);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setItemPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.i != i) {
            int i6 = i3 ^ 111;
            int i7 = ((i3 & 111) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.i = i;
            m();
            int i11 = b + 37;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 & 29;
        int i15 = (i14 - (~((i13 ^ 29) | i14))) - 1;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = a + 115;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.h != i) {
            int i5 = i4 + 55;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                this.h = i;
                m();
                int i6 = 92 / 0;
            } else {
                this.h = i;
                m();
            }
        }
        int i7 = b;
        int i8 = (i7 & (-82)) | ((~i7) & 81);
        int i9 = (i7 & 81) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setItemPosition(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = ((i3 ^ 3) | i4) << 1;
        int i6 = -((i3 | 3) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.t = i;
        if (i8 != 0) {
            throw null;
        }
    }

    public class bhf implements View.OnLayoutChangeListener {
        private static int a = 0;
        private static int b = 1;

        public bhf() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = a;
            int i11 = i10 & 95;
            int i12 = (i10 | 95) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                OooOO0.this.p.getVisibility();
                throw null;
            }
            if (OooOO0.this.p.getVisibility() == 0) {
                int i15 = a;
                int i16 = ((i15 | 19) << 1) - (i15 ^ 19);
                b = i16 % 128;
                int i17 = i16 % 2;
                OooOO0 oooOO0 = OooOO0.this;
                ImageView imageView = oooOO0.p;
                if (oooOO0.l()) {
                    j jVar = oooOO0.F;
                    Rect rect = new Rect();
                    int i18 = b;
                    int i19 = i18 & 93;
                    int i20 = (((i18 | 93) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    imageView.getDrawingRect(rect);
                    jVar.setBounds(rect);
                    int i22 = b;
                    int i23 = (((i22 ^ 65) | (i22 & 65)) << 1) - (((~i22) & 65) | (i22 & (-66)));
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        jVar.g(imageView, null);
                        int i24 = 56 / 0;
                    } else {
                        jVar.g(imageView, null);
                    }
                    int i25 = a;
                    int i26 = i25 & 119;
                    int i27 = (((i25 | 119) & (~i26)) - (~(i26 << 1))) - 1;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            int i29 = b;
            int i30 = i29 & 125;
            int i31 = (i29 | 125) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
    }

    public final void k(float f, float f2) {
        float f3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i2 ^ 97) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            this.k = f % f2;
            f3 = (2.0f + f2) % f;
        } else {
            this.k = f - f2;
            f3 = (f2 * 1.0f) / f;
        }
        this.j = f3;
        this.l = (f * 1.0f) / f2;
        int i7 = i6 + 23;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r2
  0x0025: PHI (r2v4 androidx.appcompat.view.menu.u) = (r2v3 androidx.appcompat.view.menu.u), (r2v10 androidx.appcompat.view.menu.u) binds: [B:8:0x0023, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void m() {
        u uVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 17;
        int i4 = (i2 & 17) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            uVar = this.v;
            int i6 = 51 / 0;
            if (uVar != null) {
                int i7 = i2 ^ 21;
                int i8 = -(-((i2 & 21) << 1));
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                setChecked(uVar.isChecked());
                int i11 = b;
                int i12 = i11 & 113;
                int i13 = -(-((i11 ^ 113) | i12));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            uVar = this.v;
            if (uVar != null) {
                int i16 = i2 ^ 21;
                int i17 = -(-((i2 & 21) << 1));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                setChecked(uVar.isChecked());
                int i110 = b;
                int i111 = i110 & 113;
                int i112 = -(-((i110 ^ 113) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                a = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i20 = b;
        int i21 = i20 & 47;
        int i22 = (i20 | 47) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        a = i24 % 128;
        if (i24 % 2 == 0) {
            throw null;
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 95) << 1) - (~(-(((~i3) & 95) | (i3 & (-96)))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.G = i;
            p(getWidth());
        } else {
            this.G = i;
            p(getWidth());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setActiveIndicatorWidth(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 103;
        int i5 = (i3 & 103) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.D = i;
            p(getWidth());
        } else {
            this.D = i;
            p(getWidth());
            throw null;
        }
    }

    public void setBadge(j jVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 78) + (i2 | 78)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.F = jVar;
        ImageView imageView = this.p;
        if (imageView != null) {
            int i5 = (i2 & (-114)) | ((~i2) & 113);
            int i6 = -(-((i2 & 113) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                l();
                obj.hashCode();
                throw null;
            }
            if (l() && imageView != null) {
                int i8 = b;
                int i9 = ((i8 ^ 44) + ((i8 & 44) << 1)) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                setClipChildren(false);
                setClipToPadding(false);
                j jVar2 = this.F;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                int i11 = a;
                int i12 = i11 & 53;
                int i13 = (i12 - (~((i11 ^ 53) | i12))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                jVar2.setBounds(rect);
                jVar2.g(imageView, null);
                if (jVar2.e() != null) {
                    int i15 = b;
                    int i16 = (i15 | 81) << 1;
                    int i17 = -(i15 ^ 81);
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    jVar2.e().setForeground(jVar2);
                    int i20 = a + 31;
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                imageView.getOverlay().add(jVar2);
                int i21 = a;
                int i22 = (((i21 & (-106)) | ((~i21) & 105)) - (~(-(-((i21 & 105) << 1))))) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = b;
        int i25 = i24 & 39;
        int i26 = (i24 ^ 39) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        a = i27 % 128;
        int i28 = i27 % 2;
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 19;
        int i5 = -(-((i3 ^ 19) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
            int i7 = 71 / 0;
        } else {
            layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
        }
        int i8 = b;
        int i9 = (i8 ^ 121) + ((i8 & 121) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            layoutParams.width = i;
            layoutParams.height = i;
            throw null;
        }
        layoutParams.width = i;
        layoutParams.height = i;
        this.p.setLayoutParams(layoutParams);
        int i10 = b;
        int i11 = i10 & 59;
        int i12 = (i10 ^ 59) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        TextView textView;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 55;
        int i4 = i2 | 55;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (colorStateList != null) {
            int i8 = i6 & 101;
            int i9 = ((i6 ^ 101) | i8) << 1;
            int i10 = -((i6 | 101) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                this.q.setTextColor(colorStateList);
                textView = this.s;
                int i12 = 1 / 0;
            } else {
                this.q.setTextColor(colorStateList);
                textView = this.s;
            }
            int i13 = a;
            int i14 = i13 & 27;
            int i15 = -(-((i13 ^ 27) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            textView.setTextColor(colorStateList);
            int i18 = b;
            int i19 = ((((i18 ^ 47) | (i18 & 47)) << 1) - (~(-(((~i18) & 47) | (i18 & (-48)))))) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a + 55;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 8 / 0;
        }
    }

    public static void e(View view, float f, float f2, int i) {
        int i2 = 2 % 2;
        int i3 = a + 115;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            view.setScaleX(f);
            view.setScaleY(f2);
            view.setVisibility(i);
        } else {
            view.setScaleX(f);
            view.setScaleY(f2);
            view.setVisibility(i);
            int i4 = 72 / 0;
        }
    }

    private int getSuggestedIconWidth() {
        int i;
        int iMax;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 21;
        int i5 = (i3 ^ 21) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        j jVar = this.F;
        if (jVar == null) {
            int i9 = (i7 ^ 59) + ((i7 & 59) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        } else {
            int minimumWidth = jVar.getMinimumWidth();
            j.bIE bie = this.F.c;
            int i11 = b;
            int i12 = i11 & 101;
            int i13 = (i11 ^ 101) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = -(-bie.n);
                i = ((minimumWidth | i15) << 1) - (minimumWidth ^ i15);
            } else {
                int i16 = -bie.n;
                i = (minimumWidth ^ i16) + ((minimumWidth & i16) << 1);
            }
            int i17 = b;
            int i18 = i17 & 57;
            int i19 = (i17 | 57) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int i23 = a;
        int i24 = (i23 & 101) + (i23 | 101);
        b = i24 % 128;
        int i25 = i24 % 2;
        int iMax2 = Math.max(i, layoutParams.leftMargin);
        int measuredWidth = this.p.getMeasuredWidth();
        int i26 = a;
        int i27 = (((i26 | 96) << 1) - (i26 ^ 96)) - 1;
        b = i27 % 128;
        if (i27 % 2 != 0) {
            iMax = Math.max(i, layoutParams.rightMargin);
            int i28 = 51 / 0;
        } else {
            iMax = Math.max(i, layoutParams.rightMargin);
        }
        int i29 = measuredWidth & iMax2;
        int i30 = -(-((i29 - (~(-(-((iMax2 ^ measuredWidth) | i29))))) - 1));
        int i31 = iMax & i30;
        int i32 = (iMax | i30) & (~i31);
        int i33 = i31 << 1;
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = b;
        int i36 = i35 & 123;
        int i37 = (i36 - (~(-(-((i35 ^ 123) | i36))))) - 1;
        a = i37 % 128;
        int i38 = i37 % 2;
        return i34;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-114)) | ((~i3) & 113);
        int i5 = -(-((i3 & 113) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            getSuggestedIconHeight();
            obj.hashCode();
            throw null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        int i7 = layoutParams.topMargin;
        int measuredHeight = this.r.getMeasuredHeight();
        int i8 = b;
        int i9 = (((i8 | 16) << 1) - (i8 ^ 16)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            i = (measuredHeight * (suggestedIconHeight / i7)) >> layoutParams.bottomMargin;
        } else {
            int i10 = -(-i7);
            int i11 = suggestedIconHeight & i10;
            int i12 = (suggestedIconHeight ^ i10) | i11;
            int i13 = -(-(((i11 | i12) << 1) - (i12 ^ i11)));
            int i14 = (measuredHeight ^ i13) + ((i13 & measuredHeight) << 1);
            int i15 = -(-layoutParams.bottomMargin);
            int i16 = i14 ^ i15;
            i = (((i15 & i14) | i16) << 1) - i16;
        }
        int i17 = b;
        int i18 = i17 & 113;
        int i19 = -(-((i17 ^ 113) | i18));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return i;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 14) << 1) - (i2 ^ 14)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
            throw null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        int i5 = layoutParams.leftMargin;
        int measuredWidth = this.r.getMeasuredWidth();
        int i6 = layoutParams.rightMargin;
        int i7 = a;
        int i8 = i7 & 119;
        int i9 = -(-(i7 | 119));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = -(-i5);
        int i13 = (measuredWidth & i12) + (i12 | measuredWidth);
        int i14 = -(-i6);
        int iMax = Math.max(getSuggestedIconWidth(), (i13 ^ i14) + ((i14 & i13) << 1));
        int i15 = a;
        int i16 = ((i15 | 109) << 1) - (i15 ^ 109);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 95 / 0;
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 59;
        a = i4 % 128;
        int[] iArrOnCreateDrawableState = i4 % 2 == 0 ? super.onCreateDrawableState(i) : super.onCreateDrawableState((((i | 2) << 1) - (i ^ 2)) - 1);
        u uVar = this.v;
        if (uVar != null) {
            int i5 = b + 85;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
                if (uVar.isCheckable()) {
                    if (this.v.isChecked()) {
                        int i7 = b + 16;
                        i2 = (i7 ^ (-1)) + (i7 << 1);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, c);
                            throw null;
                        }
                        FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, c);
                    }
                }
            } else if (uVar.isCheckable()) {
                if (this.v.isChecked()) {
                    int i8 = b + 16;
                    i2 = (i8 ^ (-1)) + (i8 << 1);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, c);
                        throw null;
                    }
                    FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, c);
                }
            }
        }
        int i9 = b;
        int i10 = (i9 ^ 29) + ((i9 & 29) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return iArrOnCreateDrawableState;
        }
        throw null;
    }

    public void setIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 21) | (i2 & 21)) << 1;
        int i4 = -((i2 & (-22)) | ((~i2) & 21));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (drawable == this.w) {
            int i7 = i6 & 33;
            int i8 = (((~i7) & (i6 | 33)) - (~(i7 << 1))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        this.w = drawable;
        if (drawable != null) {
            int i10 = ((i2 ^ 33) | (i2 & 33)) << 1;
            int i11 = -(((~i2) & 33) | (i2 & (-34)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                drawable.getConstantState();
                throw null;
            }
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                int i13 = a;
                int i14 = (i13 & (-14)) | ((~i13) & 13);
                int i15 = (i13 & 13) << 1;
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                drawable = constantState.newDrawable();
                int i18 = b;
                int i19 = i18 | 117;
                int i20 = (i19 << 1) - ((~(i18 & 117)) & i19);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 4 % 3;
                }
            }
            drawable = drawable.mutate();
            this.z = drawable;
            int i22 = a;
            int i23 = (i22 | 11) << 1;
            int i24 = -(i22 ^ 11);
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
            ColorStateList colorStateList = this.u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
                int i26 = b;
                int i27 = ((i26 ^ 93) | (i26 & 93)) << 1;
                int i28 = -(((~i26) & 93) | (i26 & (-94)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 2 % 5;
                }
            }
        }
        this.p.setImageDrawable(drawable);
        int i31 = b;
        int i32 = ((i31 & 112) + (i31 | 112)) - 1;
        a = i32 % 128;
        if (i32 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public void setItemBackground(int i) {
        Drawable drawableC;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 + 53;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
            if (i == 0) {
                int i8 = (i5 & 5) + (i5 | 5);
                b = i8 % 128;
                int i9 = i8 % 2;
                drawableC = null;
            } else {
                Context context = getContext();
                Object obj2 = l.c;
                drawableC = l.aUH.c(context, i);
                i2 = a;
                int i10 = i2 & 79;
                i3 = (((~i10) & (i2 | 79)) - (~(-(-(i10 << 1))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i11 = i2 & 95;
                int i12 = (i11 - (~((i2 ^ 95) | i11))) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (i == 0) {
            int i14 = (i5 & 5) + (i5 | 5);
            b = i14 % 128;
            int i15 = i14 % 2;
            drawableC = null;
        } else {
            Context context2 = getContext();
            Object obj3 = l.c;
            drawableC = l.aUH.c(context2, i);
            i2 = a;
            int i16 = i2 & 79;
            i3 = (((~i16) & (i2 | 79)) - (~(-(-(i16 << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i17 = i2 & 95;
            int i18 = (i17 - (~((i2 ^ 95) | i17))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        setItemBackground(drawableC);
        int i20 = a;
        int i21 = ((i20 & 80) + (i20 | 80)) - 1;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setShifting(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.f != z) {
            this.f = z;
            m();
            int i4 = a;
            int i5 = i4 & 111;
            int i6 = ((((i4 ^ 111) | i5) << 1) - (~(-((i4 | 111) & (~i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a;
        int i9 = i8 | 109;
        int i10 = i9 << 1;
        int i11 = -((~(i8 & 109)) & i9);
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public void setTextAppearanceActive(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-86)) | ((~i3) & 85);
        int i5 = (i3 & 85) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.s.setTextAppearance(i);
        float textSize = this.q.getTextSize();
        int i8 = b;
        int i9 = i8 & 75;
        int i10 = i9 + ((i8 ^ 75) | i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            k(textSize, this.s.getTextSize());
            int i11 = 86 / 0;
        } else {
            k(textSize, this.s.getTextSize());
        }
        int i12 = b;
        int i13 = i12 & 11;
        int i14 = (i13 - (~((i12 ^ 11) | i13))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    public void setTextAppearanceInactive(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 102) + (i3 | 102)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.q.setTextAppearance(i);
            this.q.getTextSize();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.q.setTextAppearance(i);
        k(this.q.getTextSize(), this.s.getTextSize());
        int i5 = a;
        int i6 = i5 & 123;
        int i7 = (i5 ^ 123) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r1
  0x0041: PHI (r1v14 androidx.appcompat.view.menu.u) = (r1v13 androidx.appcompat.view.menu.u), (r1v47 androidx.appcompat.view.menu.u) binds: [B:8:0x003f, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public void setTitle(CharSequence charSequence) {
        u uVar;
        u uVar2;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 71;
        int i7 = ((i5 ^ 71) | i6) << 1;
        int i8 = -((i5 | 71) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        this.q.setText(charSequence);
        this.s.setText(charSequence);
        int i11 = a;
        int i12 = (i11 ^ 13) + ((i11 & 13) << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            uVar = this.v;
            if (uVar != null) {
                if (!(!TextUtils.isEmpty(uVar.r))) {
                }
            }
            uVar2 = this.v;
            if (uVar2 != null) {
                int i13 = b;
                int i14 = i13 & 85;
                i3 = (i14 - (~(-(-((i13 ^ 85) | i14))))) - 1;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    TextUtils.isEmpty(uVar2.q);
                    throw null;
                }
                if (TextUtils.isEmpty(uVar2.q)) {
                    int i15 = a + 107;
                    int i16 = i15 % 128;
                    b = i16;
                    int i17 = i15 % 2;
                    int i18 = i16 + 76;
                    int i19 = (i18 ^ (-1)) + (i18 << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    charSequence = this.v.q;
                    int i21 = a;
                    int i22 = i21 & 47;
                    int i23 = (i21 | 47) & (~i22);
                    int i24 = i22 << 1;
                    int i25 = (i23 & i24) + (i23 | i24);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            if (Build.VERSION.SDK_INT > 23) {
                int i27 = a + 17;
                b = i27 % 128;
                i2 = i27 % 2;
                C0315d.b(this, charSequence);
                if (i2 != 0) {
                    int i28 = 81 / 0;
                }
            }
            int i29 = a;
            i = ((i29 | 1) << 1) - (i29 ^ 1);
            b = i % 128;
            if (i % 2 != 0) {
                int i30 = 67 / 0;
            }
        }
        uVar = this.v;
        int i31 = 86 / 0;
        if (uVar != null) {
            if (!(!TextUtils.isEmpty(uVar.r))) {
            }
        }
        uVar2 = this.v;
        if (uVar2 != null) {
            int i110 = b;
            int i111 = i110 & 85;
            i3 = (i111 - (~(-(-((i110 ^ 85) | i111))))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                TextUtils.isEmpty(uVar2.q);
                throw null;
            }
            if (TextUtils.isEmpty(uVar2.q)) {
                int i112 = a + 107;
                int i113 = i112 % 128;
                b = i113;
                int i114 = i112 % 2;
                int i115 = i113 + 76;
                int i116 = (i115 ^ (-1)) + (i115 << 1);
                a = i116 % 128;
                int i210 = i116 % 2;
            } else {
                charSequence = this.v.q;
                int i211 = a;
                int i212 = i211 & 47;
                int i213 = (i211 | 47) & (~i212);
                int i214 = i212 << 1;
                int i215 = (i213 & i214) + (i213 | i214);
                b = i215 % 128;
                int i216 = i215 % 2;
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            int i217 = a + 17;
            b = i217 % 128;
            i2 = i217 % 2;
            C0315d.b(this, charSequence);
            if (i2 != 0) {
                int i218 = 81 / 0;
            }
        }
        int i219 = a;
        i = ((i219 | 1) << 1) - (i219 ^ 1);
        b = i % 128;
        if (i % 2 != 0) {
            int i32 = 67 / 0;
        }
        setContentDescription(charSequence);
        int i33 = b;
        int i34 = i33 & 37;
        int i35 = -(-((i33 ^ 37) | i34));
        int i36 = (i34 & i35) + (i35 | i34);
        a = i36 % 128;
        int i37 = i36 % 2;
        uVar2 = this.v;
        if (uVar2 != null) {
            int i117 = b;
            int i118 = i117 & 85;
            i3 = (i118 - (~(-(-((i117 ^ 85) | i118))))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                TextUtils.isEmpty(uVar2.q);
                throw null;
            }
            if (TextUtils.isEmpty(uVar2.q)) {
                int i119 = a + 107;
                int i1110 = i119 % 128;
                b = i1110;
                int i1111 = i119 % 2;
                int i1112 = i1110 + 76;
                int i1113 = (i1112 ^ (-1)) + (i1112 << 1);
                a = i1113 % 128;
                int i2110 = i1113 % 2;
            } else {
                charSequence = this.v.q;
                int i2111 = a;
                int i2112 = i2111 & 47;
                int i2113 = (i2111 | 47) & (~i2112);
                int i2114 = i2112 << 1;
                int i2115 = (i2113 & i2114) + (i2113 | i2114);
                b = i2115 % 128;
                int i2116 = i2115 % 2;
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            int i2117 = a + 17;
            b = i2117 % 128;
            i2 = i2117 % 2;
            C0315d.b(this, charSequence);
            if (i2 != 0) {
                int i2118 = 81 / 0;
            }
        }
        int i2119 = a;
        i = ((i2119 | 1) << 1) - (i2119 ^ 1);
        b = i % 128;
        if (i % 2 != 0) {
            int i38 = 67 / 0;
        }
    }

    private int getItemVisiblePosition() {
        View childAt;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ((ViewGroup) getParent()).indexOfChild(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i6 = b;
        int i7 = (i6 & 19) + (i6 | 19);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i9 < iIndexOfChild) {
            int i11 = a + 27;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                childAt = viewGroup.getChildAt(i9);
                int i12 = 28 / 0;
            } else {
                childAt = viewGroup.getChildAt(i9);
            }
            if (childAt instanceof OooOO0) {
                int i13 = a;
                int i14 = (i13 ^ 119) + ((i13 & 119) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                if (childAt.getVisibility() == 0) {
                    int i16 = a;
                    int i17 = (((i16 ^ 61) | (i16 & 61)) << 1) - (((~i16) & 61) | (i16 & (-62)));
                    int i18 = i17 % 128;
                    b = i18;
                    if (i17 % 2 == 0) {
                        int i19 = i10 & 1;
                        int i20 = -(-((i10 ^ 1) | i19));
                        i10 = (i19 ^ i20) + ((i20 & i19) << 1);
                    }
                    int i21 = (i18 ^ 81) + ((i18 & 81) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            i9++;
            int i23 = a;
            int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = (i26 ^ 13) + ((i26 & 13) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    public final void p(int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 111) - (~(-(-((i4 & 111) << 1))))) - 1;
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f107o == null) {
            int i7 = i6 & 39;
            int i8 = (((i6 ^ 39) | i7) << 1) - ((i6 | 39) & (~i7));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 0;
                return;
            }
            return;
        }
        int i10 = this.D;
        int i11 = this.G;
        int i12 = (i6 ^ 77) + ((i6 & 77) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = -(i11 * 2);
        int iMin = Math.min(i10, ((((~i14) & i) | ((~i) & i14)) - (~((i & i14) << 1))) - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f107o.getLayoutParams();
        int i15 = b + 72;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        int i17 = i16 % 128;
        a = i17;
        if (i16 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.E) {
            int i18 = i17 & 111;
            int i19 = -(-(i17 | 111));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = i20 % 128;
            b = i21;
            if (i20 % 2 == 0 ? this.m != 2 : this.m != 4) {
                int i22 = b;
                int i23 = i22 & 119;
                int i24 = (i22 ^ 119) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                int i26 = i25 % 2;
                z = false;
            } else {
                int i27 = i21 & 105;
                int i28 = (i21 ^ 105) | i27;
                int i29 = (i27 & i28) + (i27 | i28);
                a = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i21 & 93;
                int i32 = (i31 - (~((i21 ^ 93) | i31))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
                z = true;
            }
        } else {
            int i210 = b;
            int i211 = i210 & 119;
            int i212 = (i210 ^ 119) | i211;
            int i213 = (i211 & i212) + (i212 | i211);
            a = i213 % 128;
            int i214 = i213 % 2;
            z = false;
        }
        if (!(!z)) {
            int i34 = a;
            int i35 = (-2) - (((i34 ^ 30) + ((i34 & 30) << 1)) ^ (-1));
            b = i35 % 128;
            if (i35 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i2 = iMin;
        } else {
            i2 = this.C;
            int i36 = a;
            int i37 = (i36 ^ 117) + ((i36 & 117) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        layoutParams.height = i2;
        layoutParams.width = iMin;
        View view = this.f107o;
        int i39 = (-2) - ((b + 126) ^ (-1));
        a = i39 % 128;
        if (i39 % 2 == 0) {
            view.setLayoutParams(layoutParams);
            obj.hashCode();
            throw null;
        }
        view.setLayoutParams(layoutParams);
        int i40 = a;
        int i41 = i40 ^ 79;
        int i42 = -(-((i40 & 79) << 1));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        b = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 14 / 0;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        M m;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            super.setEnabled(z);
            this.q.setEnabled(z);
            int i4 = 98 / 0;
        } else {
            super.setEnabled(z);
            this.q.setEnabled(z);
        }
        this.s.setEnabled(z);
        ImageView imageView = this.p;
        int i5 = a + 87;
        b = i5 % 128;
        int i6 = i5 % 2;
        imageView.setEnabled(z);
        if (!z) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            if (Build.VERSION.SDK_INT >= 24) {
                int i7 = a;
                int i8 = i7 ^ 79;
                int i9 = -(-((i7 & 79) << 1));
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    T.aXf.e(this, null);
                    throw null;
                }
                T.aXf.e(this, null);
                int i11 = a;
                int i12 = (i11 & 37) + (i11 | 37);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            int i14 = a;
            int i15 = ((i14 | 63) << 1) - (i14 ^ 63);
            b = i15 % 128;
            int i16 = i15 % 2;
            Context context = getContext();
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 24) {
                m = new M(PointerIcon.getSystemIcon(context, 1002));
                int i18 = b;
                int i19 = i18 ^ 57;
                int i20 = ((i18 & 57) | i19) << 1;
                int i21 = -i19;
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                int i23 = i22 % 128;
                a = i23;
                int i24 = i22 % 2;
                int i25 = i23 & 25;
                int i26 = (i25 - (~(-(-((i23 ^ 25) | i25))))) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
            } else {
                M m2 = new M(null);
                int i28 = a;
                int i29 = i28 | 81;
                int i30 = i29 << 1;
                int i31 = -((~(i28 & 81)) & i29);
                int i32 = (i30 & i31) + (i31 | i30);
                b = i32 % 128;
                int i33 = i32 % 2;
                m = m2;
            }
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
            if (i17 >= 24) {
                int i34 = b;
                int i35 = i34 ^ 63;
                int i36 = (i34 & 63) << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                a = i37 % 128;
                int i38 = i37 % 2;
                T.aXf.e(this, (PointerIcon) m.a);
                int i39 = a;
                int i40 = ((i39 | 21) << 1) - (i39 ^ 21);
                b = i40 % 128;
                int i41 = i40 % 2;
                return;
            }
        }
        int i42 = b;
        int i43 = ((i42 | 54) << 1) - (i42 ^ 54);
        int i44 = (i43 ^ (-1)) + (i43 << 1);
        a = i44 % 128;
        int i45 = i44 % 2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = i3 + ((i2 ^ 115) | i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.u = colorStateList;
            throw null;
        }
        this.u = colorStateList;
        if (this.v != null) {
            int i5 = i2 + 117;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            Drawable drawable = this.z;
            if (drawable != null) {
                int i6 = i2 + 73;
                a = i6 % 128;
                int i7 = i6 % 2;
                drawable.setTintList(colorStateList);
                this.z.invalidateSelf();
                int i8 = b;
                int i9 = i8 ^ 73;
                int i10 = ((i8 & 73) | i9) << 1;
                int i11 = -i9;
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        int i14 = a;
        int i15 = i14 & 27;
        int i16 = (((i14 | 27) & (~i15)) - (~(i15 << 1))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public void setItemBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (i2 | 13) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (drawable != null) {
            int i9 = i7 & 85;
            int i10 = ((i7 ^ 85) | i9) << 1;
            int i11 = -((i7 | 85) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (drawable.getConstantState() != null) {
                int i14 = a;
                int i15 = (i14 & 19) + (i14 | 19);
                b = i15 % 128;
                int i16 = i15 % 2;
                Drawable drawableNewDrawable = drawable.getConstantState().newDrawable();
                if (i16 != 0) {
                    drawableNewDrawable.mutate();
                    throw null;
                }
                drawable = drawableNewDrawable.mutate();
                int i17 = b + 115;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.s(this, drawable);
        int i19 = b;
        int i20 = ((i19 ^ 12) + ((i19 & 12) << 1)) - 1;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    public final void o(float f, float f2) {
        float f3;
        float f4;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 7;
        int i4 = (i3 << 1) - ((~(i2 & 7)) & i3);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        View view = this.f107o;
        if (view != null) {
            bhh bhhVar = this.A;
            Objects.requireNonNull(bhhVar);
            int i5 = a;
            int i6 = (i5 ^ 53) + ((i5 & 53) << 1);
            b = i6 % 128;
            view.setScaleX(i6 % 2 != 0 ? ivas.gov.bisp.enumeration.T.j.b(0.4f, 1.0f, f) : ivas.gov.bisp.enumeration.T.j.b(0.4f, 1.0f, f));
            int i7 = a;
            int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            view.setScaleY(bhhVar.c(f, f2));
            int i10 = i9 != 0 ? (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) : (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            int i11 = b;
            int i12 = (((i11 & (-70)) | ((~i11) & 69)) - (~(-(-((i11 & 69) << 1))))) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i10 == 0) {
                int i13 = i11 ^ 99;
                int i14 = (i11 & 99) << 1;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                f3 = 0.8f;
            } else {
                int i17 = (i11 & (-50)) | ((~i11) & 49);
                int i18 = -(-((i11 & 49) << 1));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 2 % 4;
                }
                f3 = 0.0f;
            }
            if (i10 == 0) {
                int i21 = a;
                int i22 = (-2) - (((i21 & 42) + (i21 | 42)) ^ (-1));
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i21 & 59;
                int i25 = i24 + ((i21 ^ 59) | i24);
                b = i25 % 128;
                int i26 = i25 % 2;
                f4 = 1.0f;
            } else {
                int i27 = a;
                int i28 = i27 ^ 81;
                int i29 = (i27 & 81) << 1;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 5 % 5;
                }
                f4 = 0.2f;
            }
            float fC = ivas.gov.bisp.enumeration.T.j.c(0.0f, 1.0f, f3, f4, f);
            int i32 = a;
            int i33 = i32 ^ 25;
            int i34 = ((i32 & 25) | i33) << 1;
            int i35 = -i33;
            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            view.setAlpha(fC);
            int i38 = b;
            int i39 = (((i38 & (-82)) | ((~i38) & 81)) - (~((i38 & 81) << 1))) - 1;
            a = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 4 % 3;
            }
        }
        this.B = f;
        int i41 = a;
        int i42 = i41 & 99;
        int i43 = i42 + ((i41 ^ 99) | i42);
        b = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 78 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0077  */
    public void setLabelVisibilityMode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 53;
        int i5 = (i3 & 53) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.m != i) {
            this.m = i;
            if (this.E) {
                int i8 = (i7 ^ 89) + ((i7 & 89) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (i == 2) {
                    int i10 = (i7 & 112) + (i7 | 112);
                    int i11 = (i10 ^ (-1)) + (i10 << 1);
                    int i12 = i11 % 128;
                    b = i12;
                    int i13 = i11 % 2;
                    int i14 = ((i12 | 103) << 1) - (i12 ^ 103);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = i12 & 57;
                    int i17 = ((i12 ^ 57) | i16) << 1;
                    int i18 = -((i12 | 57) & (~i16));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    int i20 = i19 % 128;
                    a = i20;
                    int i21 = i19 % 2;
                    this.A = e;
                    int i22 = (-2) - ((((i20 | 50) << 1) - (i20 ^ 50)) ^ (-1));
                    b = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    int i24 = i7 + 31;
                    int i25 = i24 % 128;
                    b = i25;
                    int i26 = i24 % 2;
                    this.A = d;
                    int i27 = (((i25 ^ 91) | (i25 & 91)) << 1) - (((~i25) & 91) | (i25 & (-92)));
                    a = i27 % 128;
                    int i28 = i27 % 2;
                }
            } else {
                int i29 = i7 + 31;
                int i210 = i29 % 128;
                b = i210;
                int i211 = i29 % 2;
                this.A = d;
                int i212 = (((i210 ^ 91) | (i210 & 91)) << 1) - (((~i210) & 91) | (i210 & (-92)));
                a = i212 % 128;
                int i213 = i212 % 2;
            }
            p(getWidth());
            m();
            int i30 = a;
            int i31 = i30 & 123;
            int i32 = -(-((i30 ^ 123) | i31));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = a + 25;
        b = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 15 / 0;
        }
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public void d(u uVar, int i) {
        CharSequence charSequence;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 11;
        int i6 = -(-((i4 & 11) << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.v = uVar;
        setCheckable(uVar.isCheckable());
        int i9 = b;
        int i10 = (i9 ^ 73) + ((i9 & 73) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            setChecked(uVar.isChecked());
            setEnabled(uVar.isEnabled());
            int i11 = 63 / 0;
        } else {
            setChecked(uVar.isChecked());
            setEnabled(uVar.isEnabled());
        }
        int i12 = a + 93;
        b = i12 % 128;
        int i13 = i12 % 2;
        setIcon(uVar.getIcon());
        CharSequence charSequence2 = uVar.g;
        int i14 = a;
        int i15 = (i14 ^ 10) + ((i14 & 10) << 1);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        setTitle(charSequence2);
        setId(uVar.b);
        int i18 = a + 71;
        b = i18 % 128;
        int i19 = i18 % 2;
        if (!TextUtils.isEmpty(uVar.r)) {
            int i20 = b;
            int i21 = i20 ^ 113;
            int i22 = ((i20 & 113) | i21) << 1;
            int i23 = -i21;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                setContentDescription(uVar.r);
                int i25 = 24 / 0;
            } else {
                setContentDescription(uVar.r);
            }
            int i26 = b;
            int i27 = i26 & 69;
            int i28 = -(-((i26 ^ 69) | i27));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 5 / 4;
            }
        }
        if (!TextUtils.isEmpty(uVar.q)) {
            int i31 = a;
            int i32 = (i31 ^ 45) + ((i31 & 45) << 1);
            b = i32 % 128;
            int i33 = i32 % 2;
            charSequence = uVar.q;
            int i34 = b;
            int i35 = i34 ^ 123;
            int i36 = -(-((i34 & 123) << 1));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            a = i37 % 128;
            int i38 = i37 % 2;
        } else {
            charSequence = uVar.g;
            int i39 = a;
            int i40 = i39 & 3;
            int i41 = ((((i39 ^ 3) | i40) << 1) - (~(-((i39 | 3) & (~i40))))) - 1;
            b = i41 % 128;
            if (i41 % 2 != 0) {
                int i42 = 2 % 5;
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            int i43 = b;
            int i44 = (((i43 ^ 71) | (i43 & 71)) << 1) - (((~i43) & 71) | (i43 & (-72)));
            a = i44 % 128;
            int i45 = i44 % 2;
            C0315d.b(this, charSequence);
            int i46 = b;
            int i47 = i46 & 63;
            int i48 = (((i46 ^ 63) | i47) << 1) - ((i46 | 63) & (~i47));
            a = i48 % 128;
            int i49 = i48 % 2;
        }
        if (uVar.isVisible()) {
            int i50 = a;
            int i51 = ((i50 | 53) << 1) - (i50 ^ 53);
            b = i51 % 128;
            int i52 = i51 % 2;
            i2 = 0;
        } else {
            int i53 = a;
            int i54 = i53 & 123;
            int i55 = (i53 | 123) & (~i54);
            int i56 = -(-(i54 << 1));
            int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
            b = i57 % 128;
            int i58 = i57 % 2;
            i2 = 8;
        }
        setVisibility(i2);
        this.g = true;
        int i59 = a;
        int i60 = i59 & 95;
        int i61 = i60 + ((i59 ^ 95) | i60);
        b = i61 % 128;
        if (i61 % 2 != 0) {
            int i62 = 36 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x009f  */
    /* JADX WARN: Code duplicated, block: B:12:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:13:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0212  */
    /* JADX WARN: Code duplicated, block: B:44:0x022c  */
    /* JADX WARN: Code duplicated, block: B:9:0x008c  */
    public void setChecked(boolean z) {
        int i;
        float f;
        int i2;
        TextView textView;
        int i3;
        int i4;
        TextView textView2;
        TimeInterpolator timeInterpolatorE;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 ^ 45;
        int i8 = ((((i6 & 45) | i7) << 1) - (~(-i7))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        TextView textView3 = this.s;
        textView3.setPivotX(textView3.getWidth() / 2);
        int i10 = a;
        int i11 = i10 & 119;
        int i12 = (i10 ^ 119) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        TextView textView4 = this.s;
        textView4.setPivotY(textView4.getBaseline());
        TextView textView5 = this.q;
        int i15 = b;
        int i16 = ((i15 & (-18)) | ((~i15) & 17)) + ((i15 & 17) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        textView5.setPivotX(textView5.getWidth() / 2);
        TextView textView6 = this.q;
        int i18 = b;
        int i19 = i18 & 97;
        int i20 = (i19 - (~(-(-((i18 ^ 97) | i19))))) - 1;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            textView6.setPivotY(textView6.getBaseline());
            int i21 = 52 / 0;
            if (z) {
                int i22 = b;
                int i23 = i22 & 119;
                i = ((((i22 ^ 119) | i23) << 1) - (~(-((i22 | 119) & (~i23))))) - 1;
                int i24 = i % 128;
                a = i24;
                if (i % 2 == 0) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                int i25 = i24 & 45;
                int i26 = (((i24 ^ 45) | i25) << 1) - ((i24 | 45) & (~i25));
                b = i26 % 128;
                int i27 = i26 % 2;
            } else {
                int i28 = a;
                int i29 = i28 & 99;
                int i30 = (i28 ^ 99) | i29;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                b = i31 % 128;
                int i32 = i31 % 2;
                f = 0.0f;
            }
        } else {
            textView6.setPivotY(textView6.getBaseline());
            if (!z) {
                int i210 = a;
                int i211 = i210 & 99;
                int i33 = (i210 ^ 99) | i211;
                int i34 = ((i211 | i33) << 1) - (i33 ^ i211);
                b = i34 % 128;
                int i35 = i34 % 2;
                f = 0.0f;
            } else {
                int i212 = b;
                int i213 = i212 & 119;
                i = ((((i212 ^ 119) | i213) << 1) - (~(-((i212 | 119) & (~i213))))) - 1;
                int i214 = i % 128;
                a = i214;
                if (i % 2 == 0) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                int i215 = i214 & 45;
                int i216 = (((i214 ^ 45) | i215) << 1) - ((i214 | 45) & (~i215));
                b = i216 % 128;
                int i217 = i216 % 2;
            }
        }
        Object obj = null;
        if (this.x) {
            int i36 = b;
            int i37 = i36 & 57;
            int i38 = (i36 ^ 57) | i37;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            int i40 = i39 % 128;
            a = i40;
            int i41 = i39 % 2;
            if (this.g) {
                int i42 = (i40 & (-76)) | ((~i40) & 75);
                int i43 = -(-((i40 & 75) << 1));
                int i44 = (i42 & i43) + (i43 | i42);
                b = i44 % 128;
                int i45 = i44 % 2;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                if (!T.aXa.c(this)) {
                    o(f, f);
                    int i46 = b;
                    int i47 = (i46 & (-90)) | ((~i46) & 89);
                    int i48 = (i46 & 89) << 1;
                    i2 = (i47 ^ i48) + ((i48 & i47) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i49 = 2 / 4;
                    }
                } else {
                    int i50 = b;
                    int i51 = (((i50 | 42) << 1) - (i50 ^ 42)) - 1;
                    int i52 = i51 % 128;
                    a = i52;
                    if (i51 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    ValueAnimator valueAnimator = this.y;
                    if (valueAnimator != null) {
                        int i53 = ((i52 | 95) << 1) - (i52 ^ 95);
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        valueAnimator.cancel();
                        this.y = null;
                        int i55 = a;
                        int i56 = ((i55 ^ 29) | (i55 & 29)) << 1;
                        int i57 = -(((~i55) & 29) | (i55 & (-30)));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        b = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.B, f);
                    this.y = valueAnimatorOfFloat;
                    p pVar = new p(this, f);
                    int i60 = a;
                    int i61 = (i60 & (-6)) | ((~i60) & 5);
                    int i62 = (i60 & 5) << 1;
                    int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    valueAnimatorOfFloat.addUpdateListener(pVar);
                    ValueAnimator valueAnimator2 = this.y;
                    Context context = getContext();
                    TimeInterpolator timeInterpolator = ivas.gov.bisp.enumeration.T.j.d;
                    int i65 = a;
                    int i66 = (i65 ^ 107) + ((i65 & 107) << 1);
                    b = i66 % 128;
                    if (i66 % 2 != 0) {
                        timeInterpolatorE = ivas.gov.bisp.enumeration.p028ba.l.e(context, ivas.gov.bisp.enumeration.R.attr.motionEasingStandard, timeInterpolator);
                        int i67 = 81 / 0;
                    } else {
                        timeInterpolatorE = ivas.gov.bisp.enumeration.p028ba.l.e(context, ivas.gov.bisp.enumeration.R.attr.motionEasingStandard, timeInterpolator);
                    }
                    int i68 = a;
                    int i69 = i68 & 107;
                    int i70 = (i69 - (~(-(-((i68 ^ 107) | i69))))) - 1;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    valueAnimator2.setInterpolator(timeInterpolatorE);
                    ValueAnimator valueAnimator3 = this.y;
                    Context context2 = getContext();
                    int i72 = b;
                    int i73 = (i72 ^ 5) + ((i72 & 5) << 1);
                    a = i73 % 128;
                    if (i73 % 2 == 0) {
                        getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.material_motion_duration_long_1);
                        throw null;
                    }
                    int integer = getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.material_motion_duration_long_1);
                    int i74 = b;
                    int i75 = (i74 ^ 99) + ((i74 & 99) << 1);
                    a = i75 % 128;
                    if (i75 % 2 == 0) {
                        valueAnimator3.setDuration(ivas.gov.bisp.enumeration.p028ba.l.d(context2, ivas.gov.bisp.enumeration.R.attr.motionDurationLong1, integer));
                        throw null;
                    }
                    valueAnimator3.setDuration(ivas.gov.bisp.enumeration.p028ba.l.d(context2, ivas.gov.bisp.enumeration.R.attr.motionDurationLong1, integer));
                    this.y.start();
                    int i76 = a;
                    int i77 = ((i76 | 11) << 1) - (((~i76) & 11) | (i76 & (-12)));
                    b = i77 % 128;
                    int i78 = i77 % 2;
                }
            } else {
                o(f, f);
                int i410 = b;
                int i411 = (i410 & (-90)) | ((~i410) & 89);
                int i412 = (i410 & 89) << 1;
                i2 = (i411 ^ i412) + ((i412 & i411) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i413 = 2 / 4;
                }
            }
        } else {
            o(f, f);
            int i414 = b;
            int i415 = (i414 & (-90)) | ((~i414) & 89);
            int i416 = (i414 & 89) << 1;
            i2 = (i415 ^ i416) + ((i416 & i415) << 1);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i417 = 2 / 4;
            }
        }
        int i79 = this.m;
        if (i79 != -1) {
            int i80 = a;
            int i81 = ((i80 ^ 107) | (i80 & 107)) << 1;
            int i82 = -((i80 & (-108)) | ((~i80) & 107));
            int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
            int i84 = i83 % 128;
            b = i84;
            if (i83 % 2 != 0) {
                throw null;
            }
            if (i79 != 0) {
                int i85 = i80 & 45;
                int i86 = ((i80 | 45) & (~i85)) + (i85 << 1);
                b = i86 % 128;
                if (i86 % 2 == 0 ? i79 == 1 : i79 == 1) {
                    c(this.r, this.i);
                    if (!z) {
                        f(getIconOrContainer(), this.h, 49);
                        int i87 = a;
                        int i88 = ((i87 & 20) + (i87 | 20)) - 1;
                        b = i88 % 128;
                        if (i88 % 2 != 0) {
                            TextView textView7 = this.s;
                            float f2 = this.l;
                            e(textView7, f2, f2, 3);
                        } else {
                            TextView textView8 = this.s;
                            float f3 = this.l;
                            e(textView8, f3, f3, 4);
                        }
                        int i89 = b;
                        int i90 = i89 & 45;
                        int i91 = i90 + ((i89 ^ 45) | i90);
                        a = i91 % 128;
                        if (i91 % 2 == 0) {
                            e(this.q, 2.0f, 0.0f, 1);
                        } else {
                            e(this.q, 1.0f, 1.0f, 0);
                        }
                    } else {
                        int i92 = b + 51;
                        a = i92 % 128;
                        int i93 = i92 % 2;
                        View iconOrContainer = getIconOrContainer();
                        float f4 = this.h;
                        int i94 = a;
                        int i95 = ((i94 | 43) << 1) - (i94 ^ 43);
                        b = i95 % 128;
                        if (i95 % 2 != 0) {
                            f(iconOrContainer, (int) (f4 + this.k), 7);
                        } else {
                            f(iconOrContainer, (int) (f4 + this.k), 49);
                        }
                        e(this.s, 1.0f, 1.0f, 0);
                        int i96 = a;
                        int i97 = i96 & 113;
                        int i98 = ((((i96 ^ 113) | i97) << 1) - (~(-((~i97) & (i96 | 113))))) - 1;
                        b = i98 % 128;
                        if (i98 % 2 != 0) {
                            throw null;
                        }
                        TextView textView9 = this.q;
                        float f5 = this.j;
                        int i99 = i96 & 31;
                        int i100 = (i96 ^ 31) | i99;
                        int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                        b = i101 % 128;
                        int i102 = i101 % 2;
                        e(textView9, f5, f5, 4);
                        int i103 = a + 69;
                        b = i103 % 128;
                        int i104 = i103 % 2;
                    }
                } else if (i79 == 2) {
                    f(getIconOrContainer(), this.h, 17);
                    TextView textView10 = this.s;
                    int i105 = b;
                    int i106 = i105 & 47;
                    int i107 = (i106 - (~(-(-((i105 ^ 47) | i106))))) - 1;
                    a = i107 % 128;
                    if (i107 % 2 == 0) {
                        textView10.setVisibility(31);
                        textView2 = this.q;
                        i4 = 63;
                    } else {
                        i4 = 8;
                        textView10.setVisibility(8);
                        textView2 = this.q;
                    }
                    textView2.setVisibility(i4);
                }
            } else {
                if (z) {
                    int i108 = i84 & 7;
                    int i109 = (~i108) & (7 | i84);
                    int i110 = i108 << 1;
                    int i111 = (i109 & i110) + (i110 | i109);
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    View iconOrContainer2 = getIconOrContainer();
                    int i113 = this.h;
                    int i114 = a;
                    int i115 = ((((i114 ^ 63) | (i114 & 63)) << 1) - (~(-(((~i114) & 63) | (i114 & (-64)))))) - 1;
                    b = i115 % 128;
                    int i116 = i115 % 2;
                    f(iconOrContainer2, i113, 49);
                    c(this.r, this.i);
                    int i117 = a;
                    int i118 = (i117 ^ 109) + ((i117 & 109) << 1);
                    b = i118 % 128;
                    if (i118 % 2 != 0) {
                        this.s.setVisibility(1);
                    } else {
                        this.s.setVisibility(0);
                    }
                } else {
                    f(getIconOrContainer(), this.h, 17);
                    ViewGroup viewGroup = this.r;
                    int i119 = b;
                    int i120 = (i119 | 71) << 1;
                    int i121 = -(i119 ^ 71);
                    int i122 = (i120 & i121) + (i121 | i120);
                    a = i122 % 128;
                    int i123 = i122 % 2;
                    c(viewGroup, 0);
                    this.s.setVisibility(4);
                    int i124 = b;
                    int i125 = i124 & 19;
                    int i126 = ((i124 | 19) & (~i125)) + (i125 << 1);
                    a = i126 % 128;
                    int i127 = i126 % 2;
                }
                this.q.setVisibility(4);
                int i128 = a;
                int i129 = i128 & 37;
                int i130 = (i128 | 37) & (~i129);
                int i131 = -(-(i129 << 1));
                int i132 = (i130 ^ i131) + ((i130 & i131) << 1);
                b = i132 % 128;
                int i133 = i132 % 2;
            }
        } else if (this.f) {
            int i134 = a;
            int i135 = i134 ^ 81;
            int i136 = (i134 & 81) << 1;
            int i137 = (i135 & i136) + (i136 | i135);
            b = i137 % 128;
            int i138 = i137 % 2;
            if (!(!z)) {
                View iconOrContainer3 = getIconOrContainer();
                int i139 = this.h;
                int i140 = b;
                int i141 = i140 | 125;
                int i142 = (i141 << 1) - ((~(i140 & 125)) & i141);
                a = i142 % 128;
                if (i142 % 2 == 0) {
                    f(iconOrContainer3, i139, 55);
                } else {
                    f(iconOrContainer3, i139, 49);
                }
                c(this.r, this.i);
                this.s.setVisibility(0);
                int i143 = b;
                int i144 = (i143 ^ 55) + ((i143 & 55) << 1);
                a = i144 % 128;
                int i145 = i144 % 2;
            } else {
                f(getIconOrContainer(), this.h, 17);
                int i146 = b;
                int i147 = (i146 ^ 87) + ((i146 & 87) << 1);
                a = i147 % 128;
                if (i147 % 2 == 0) {
                    c(this.r, 1);
                    textView = this.s;
                    i3 = 2;
                } else {
                    c(this.r, 0);
                    textView = this.s;
                    i3 = 4;
                }
                int i148 = a;
                int i149 = i148 & 121;
                int i150 = (i148 ^ 121) | i149;
                int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                b = i151 % 128;
                int i152 = i151 % 2;
                textView.setVisibility(i3);
                int i153 = a;
                int i154 = (-2) - ((((i153 | 26) << 1) - (i153 ^ 26)) ^ (-1));
                b = i154 % 128;
                if (i154 % 2 != 0) {
                    int i155 = 4 / 3;
                }
            }
            this.q.setVisibility(4);
            int i156 = b + 121;
            a = i156 % 128;
            int i157 = i156 % 2;
        } else {
            c(this.r, this.i);
            if (z) {
                View iconOrContainer4 = getIconOrContainer();
                float f6 = this.h;
                float f7 = this.k;
                int i158 = b;
                int i159 = (i158 & (-40)) | ((~i158) & 39);
                int i160 = (i158 & 39) << 1;
                int i161 = (i159 & i160) + (i160 | i159);
                a = i161 % 128;
                if (i161 % 2 == 0) {
                    f(iconOrContainer4, (int) (f6 % f7), 48);
                } else {
                    f(iconOrContainer4, (int) (f6 + f7), 49);
                }
                e(this.s, 1.0f, 1.0f, 0);
                TextView textView11 = this.q;
                float f8 = this.j;
                int i162 = a;
                int i163 = (((i162 | 4) << 1) - (i162 ^ 4)) - 1;
                b = i163 % 128;
                int i164 = i163 % 2;
                e(textView11, f8, f8, 4);
                int i165 = a;
                int i166 = (i165 & (-82)) | ((~i165) & 81);
                int i167 = -(-((i165 & 81) << 1));
                int i168 = (i166 & i167) + (i167 | i166);
                b = i168 % 128;
                int i169 = i168 % 2;
            } else {
                View iconOrContainer5 = getIconOrContainer();
                int i170 = this.h;
                int i171 = a;
                int i172 = ((i171 ^ 75) | (i171 & 75)) << 1;
                int i173 = -((75 & (~i171)) | (i171 & (-76)));
                int i174 = (i172 & i173) + (i173 | i172);
                b = i174 % 128;
                int i175 = i174 % 2;
                f(iconOrContainer5, i170, 49);
                TextView textView12 = this.s;
                float f9 = this.l;
                int i176 = a;
                int i177 = i176 & 57;
                int i178 = i177 + ((i176 ^ 57) | i177);
                b = i178 % 128;
                if (i178 % 2 != 0) {
                    e(textView12, f9, f9, 3);
                } else {
                    e(textView12, f9, f9, 4);
                }
                TextView textView13 = this.q;
                int i179 = a;
                int i180 = (i179 ^ 25) + ((i179 & 25) << 1);
                b = i180 % 128;
                if (i180 % 2 != 0) {
                    e(textView13, 0.0f, 1.0f, 1);
                } else {
                    e(textView13, 1.0f, 1.0f, 0);
                }
                int i181 = a;
                int i182 = i181 ^ 25;
                int i183 = (((i181 & 25) | i182) << 1) - i182;
                b = i183 % 128;
                int i184 = i183 % 2;
            }
        }
        refreshDrawableState();
        setSelected(z);
        int i185 = a;
        int i186 = i185 ^ 39;
        int i187 = ((((i185 & 39) | i186) << 1) - (~(-i186))) - 1;
        b = i187 % 128;
        int i188 = i187 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0154  */
    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    /* JADX WARN: Code duplicated, block: B:45:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01da  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0206  */
    /* JADX WARN: Code duplicated, block: B:61:0x0241  */
    /* JADX WARN: Code duplicated, block: B:63:0x0259  */
    /* JADX WARN: Code duplicated, block: B:64:0x025c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0263  */
    /* JADX WARN: Code duplicated, block: B:68:0x026a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r3
  0x0029: PHI (r3v5 ivas.gov.bisp.enumeration.dc.j) = (r3v4 ivas.gov.bisp.enumeration.dc.j), (r3v54 ivas.gov.bisp.enumeration.dc.j) binds: [B:8:0x0027, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        j jVar;
        int i;
        u uVar;
        CharSequence charSequence;
        StringBuilder sb;
        j jVar2;
        int i2;
        int i3;
        Context context;
        int i4;
        int iF;
        int i5;
        int i6;
        int i7;
        Resources resources;
        int i8;
        int iF2;
        Object[] objArr;
        Integer numValueOf;
        int i9;
        Object quantityString;
        Object[] objArr2;
        int i10;
        int i11;
        int i12;
        String string;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 2 % 2;
        int i18 = b + 111;
        a = i18 % 128;
        Object obj = null;
        if (i18 % 2 == 0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            jVar = this.F;
            int i19 = 83 / 0;
            if (jVar != null) {
                int i20 = b;
                int i21 = i20 ^ 105;
                int i22 = (i20 & 105) << 1;
                i = ((i21 | i22) << 1) - (i22 ^ i21);
                a = i % 128;
                if (i % 2 != 0) {
                    jVar.isVisible();
                    obj.hashCode();
                    throw null;
                }
                if (jVar.isVisible()) {
                    uVar = this.v;
                    charSequence = uVar.g;
                    int i23 = a;
                    int i24 = (i23 & 18) + (i23 | 18);
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    if (!TextUtils.isEmpty(uVar.r)) {
                        int i27 = a;
                        int i28 = i27 & 27;
                        int i29 = (((i27 | 27) & (~i28)) - (~(-(-(i28 << 1))))) - 1;
                        b = i29 % 128;
                        int i30 = i29 % 2;
                        charSequence = this.v.r;
                        i16 = b + 69;
                        a = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i31 = 4 / 4;
                        }
                    }
                    sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    int i32 = b;
                    int i33 = ((i32 ^ 42) + ((i32 & 42) << 1)) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    sb.append(", ");
                    jVar2 = this.F;
                    int i35 = b;
                    int i36 = ((i35 ^ 79) | (i35 & 79)) << 1;
                    int i37 = -(((~i35) & 79) | (i35 & (-80)));
                    i2 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        jVar2.isVisible();
                        obj.hashCode();
                        throw null;
                    }
                    if (jVar2.isVisible()) {
                        if (!jVar2.h()) {
                            quantityString = jVar2.c.j;
                            int i38 = b;
                            int i39 = i38 & 33;
                            i12 = i39 + ((i38 ^ 33) | i39);
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i40 = 5 % 2;
                            }
                        } else {
                            int i41 = a;
                            int i42 = i41 ^ 61;
                            int i43 = ((i41 & 61) | i42) << 1;
                            int i44 = -i42;
                            int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            if (jVar2.c.k > 0) {
                                i3 = a + 41;
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    context = jVar2.d.get();
                                    int i47 = 82 / 0;
                                } else {
                                    context = jVar2.d.get();
                                }
                                int i48 = a;
                                int i49 = (i48 ^ 123) + ((i48 & 123) << 1);
                                i4 = i49 % 128;
                                b = i4;
                                int i50 = i49 % 2;
                                if (context == null) {
                                    int i51 = ((i4 ^ 79) | (i4 & 79)) << 1;
                                    int i52 = -((i4 & (-80)) | ((~i4) & 79));
                                    i11 = (i51 ^ i52) + ((i51 & i52) << 1);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i53 = 47 / 0;
                                    }
                                    int i54 = i4 + 105;
                                    a = i54 % 128;
                                    int i55 = i54 % 2;
                                } else {
                                    iF = jVar2.f();
                                    i5 = jVar2.m;
                                    int i56 = b + 32;
                                    i6 = (i56 ^ (-1)) + (i56 << 1);
                                    i7 = i6 % 128;
                                    a = i7;
                                    if (i6 % 2 == 0) {
                                        int i57 = 70 / 0;
                                        if (iF <= i5) {
                                            int i58 = i7 + 119;
                                            b = i58 % 128;
                                            int i59 = i58 % 2;
                                            resources = context.getResources();
                                            j.bIE bie = jVar2.c;
                                            int i60 = b + 88;
                                            int i61 = (i60 ^ (-1)) + (i60 << 1);
                                            a = i61 % 128;
                                            int i62 = i61 % 2;
                                            i8 = bie.k;
                                            iF2 = jVar2.f();
                                            objArr = new Object[1];
                                            int i63 = a;
                                            int i64 = ((i63 | 65) << 1) - (i63 ^ 65);
                                            b = i64 % 128;
                                            int i65 = i64 % 2;
                                            numValueOf = Integer.valueOf(jVar2.f());
                                            int i66 = a;
                                            int i67 = i66 ^ 107;
                                            int i68 = (i66 & 107) << 1;
                                            i9 = ((i67 | i68) << 1) - (i68 ^ i67);
                                            b = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                objArr[0] = numValueOf;
                                                quantityString = resources.getQuantityString(i8, iF2, objArr);
                                                int i69 = 16 / 0;
                                            } else {
                                                objArr[0] = numValueOf;
                                                quantityString = resources.getQuantityString(i8, iF2, objArr);
                                            }
                                        } else {
                                            int i70 = jVar2.c.d;
                                            objArr2 = new Object[1];
                                            int i71 = a;
                                            int i72 = ((i71 ^ 103) | (i71 & 103)) << 1;
                                            int i73 = -(((~i71) & 103) | (i71 & (-104)));
                                            i10 = (i72 ^ i73) + ((i73 & i72) << 1);
                                            b = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                objArr2[1] = Integer.valueOf(i5);
                                            } else {
                                                objArr2[0] = Integer.valueOf(i5);
                                            }
                                            quantityString = context.getString(i70, objArr2);
                                            int i74 = (-2) - ((a + 88) ^ (-1));
                                            int i75 = i74 % 128;
                                            b = i75;
                                            int i76 = i74 % 2;
                                            int i77 = ((i75 ^ 24) + ((i75 & 24) << 1)) - 1;
                                            a = i77 % 128;
                                            int i78 = i77 % 2;
                                        }
                                    } else if (iF <= i5) {
                                        int i510 = i7 + 119;
                                        b = i510 % 128;
                                        int i511 = i510 % 2;
                                        resources = context.getResources();
                                        j.bIE bie2 = jVar2.c;
                                        int i610 = b + 88;
                                        int i611 = (i610 ^ (-1)) + (i610 << 1);
                                        a = i611 % 128;
                                        int i612 = i611 % 2;
                                        i8 = bie2.k;
                                        iF2 = jVar2.f();
                                        objArr = new Object[1];
                                        int i613 = a;
                                        int i614 = ((i613 | 65) << 1) - (i613 ^ 65);
                                        b = i614 % 128;
                                        int i615 = i614 % 2;
                                        numValueOf = Integer.valueOf(jVar2.f());
                                        int i616 = a;
                                        int i617 = i616 ^ 107;
                                        int i618 = (i616 & 107) << 1;
                                        i9 = ((i617 | i618) << 1) - (i618 ^ i617);
                                        b = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            objArr[0] = numValueOf;
                                            quantityString = resources.getQuantityString(i8, iF2, objArr);
                                            int i619 = 16 / 0;
                                        } else {
                                            objArr[0] = numValueOf;
                                            quantityString = resources.getQuantityString(i8, iF2, objArr);
                                        }
                                    } else {
                                        int i79 = jVar2.c.d;
                                        objArr2 = new Object[1];
                                        int i710 = a;
                                        int i711 = ((i710 ^ 103) | (i710 & 103)) << 1;
                                        int i712 = -(((~i710) & 103) | (i710 & (-104)));
                                        i10 = (i711 ^ i712) + ((i712 & i711) << 1);
                                        b = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            objArr2[1] = Integer.valueOf(i5);
                                        } else {
                                            objArr2[0] = Integer.valueOf(i5);
                                        }
                                        quantityString = context.getString(i79, objArr2);
                                        int i713 = (-2) - ((a + 88) ^ (-1));
                                        int i714 = i713 % 128;
                                        b = i714;
                                        int i715 = i713 % 2;
                                        int i716 = ((i714 ^ 24) + ((i714 & 24) << 1)) - 1;
                                        a = i716 % 128;
                                        int i717 = i716 % 2;
                                    }
                                }
                            }
                        }
                        sb.append(quantityString);
                        string = sb.toString();
                        int i80 = a;
                        int i81 = i80 ^ 83;
                        int i82 = (i80 & 83) << 1;
                        i13 = ((i81 | i82) << 1) - (i82 ^ i81);
                        b = i13 % 128;
                        if (i13 % 2 == 0) {
                            accessibilityNodeInfo.setContentDescription(string);
                            obj.hashCode();
                            throw null;
                        }
                        accessibilityNodeInfo.setContentDescription(string);
                        int i83 = a;
                        i14 = (((i83 & (-74)) | ((~i83) & 73)) - (~((i83 & 73) << 1))) - 1;
                        b = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i84 = 4 % 5;
                        }
                    } else {
                        int i85 = b;
                        i15 = ((i85 ^ 46) + ((i85 & 46) << 1)) - 1;
                        a = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    }
                    quantityString = null;
                    sb.append(quantityString);
                    string = sb.toString();
                    int i86 = a;
                    int i87 = i86 ^ 83;
                    int i88 = (i86 & 83) << 1;
                    i13 = ((i87 | i88) << 1) - (i88 ^ i87);
                    b = i13 % 128;
                    if (i13 % 2 == 0) {
                        accessibilityNodeInfo.setContentDescription(string);
                        obj.hashCode();
                        throw null;
                    }
                    accessibilityNodeInfo.setContentDescription(string);
                    int i89 = a;
                    i14 = (((i89 & (-74)) | ((~i89) & 73)) - (~((i89 & 73) << 1))) - 1;
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i810 = 4 % 5;
                    }
                }
            }
        } else {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            jVar = this.F;
            if (jVar != null) {
                int i210 = b;
                int i211 = i210 ^ 105;
                int i212 = (i210 & 105) << 1;
                i = ((i211 | i212) << 1) - (i212 ^ i211);
                a = i % 128;
                if (i % 2 != 0) {
                    jVar.isVisible();
                    obj.hashCode();
                    throw null;
                }
                if (jVar.isVisible()) {
                    uVar = this.v;
                    charSequence = uVar.g;
                    int i213 = a;
                    int i214 = (i213 & 18) + (i213 | 18);
                    int i215 = (i214 ^ (-1)) + (i214 << 1);
                    b = i215 % 128;
                    int i216 = i215 % 2;
                    if (!TextUtils.isEmpty(uVar.r)) {
                        int i217 = a;
                        int i218 = i217 & 27;
                        int i219 = (((i217 | 27) & (~i218)) - (~(-(-(i218 << 1))))) - 1;
                        b = i219 % 128;
                        int i310 = i219 % 2;
                        charSequence = this.v.r;
                        i16 = b + 69;
                        a = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i311 = 4 / 4;
                        }
                    }
                    sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    int i312 = b;
                    int i313 = ((i312 ^ 42) + ((i312 & 42) << 1)) - 1;
                    a = i313 % 128;
                    int i314 = i313 % 2;
                    sb.append(", ");
                    jVar2 = this.F;
                    int i315 = b;
                    int i316 = ((i315 ^ 79) | (i315 & 79)) << 1;
                    int i317 = -(((~i315) & 79) | (i315 & (-80)));
                    i2 = ((i316 | i317) << 1) - (i317 ^ i316);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        jVar2.isVisible();
                        obj.hashCode();
                        throw null;
                    }
                    if (jVar2.isVisible()) {
                        int i811 = b;
                        i15 = ((i811 ^ 46) + ((i811 & 46) << 1)) - 1;
                        a = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        if (!jVar2.h()) {
                            quantityString = jVar2.c.j;
                            int i318 = b;
                            int i319 = i318 & 33;
                            i12 = i319 + ((i318 ^ 33) | i319);
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i410 = 5 % 2;
                            }
                        } else {
                            int i411 = a;
                            int i412 = i411 ^ 61;
                            int i413 = ((i411 & 61) | i412) << 1;
                            int i414 = -i412;
                            int i415 = ((i413 | i414) << 1) - (i413 ^ i414);
                            b = i415 % 128;
                            int i416 = i415 % 2;
                            if (jVar2.c.k > 0) {
                                i3 = a + 41;
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    context = jVar2.d.get();
                                    int i417 = 82 / 0;
                                } else {
                                    context = jVar2.d.get();
                                }
                                int i418 = a;
                                int i419 = (i418 ^ 123) + ((i418 & 123) << 1);
                                i4 = i419 % 128;
                                b = i4;
                                int i512 = i419 % 2;
                                if (context == null) {
                                    int i513 = ((i4 ^ 79) | (i4 & 79)) << 1;
                                    int i514 = -((i4 & (-80)) | ((~i4) & 79));
                                    i11 = (i513 ^ i514) + ((i513 & i514) << 1);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i515 = 47 / 0;
                                    }
                                    int i516 = i4 + 105;
                                    a = i516 % 128;
                                    int i517 = i516 % 2;
                                } else {
                                    iF = jVar2.f();
                                    i5 = jVar2.m;
                                    int i518 = b + 32;
                                    i6 = (i518 ^ (-1)) + (i518 << 1);
                                    i7 = i6 % 128;
                                    a = i7;
                                    if (i6 % 2 == 0) {
                                        int i519 = 70 / 0;
                                        if (iF <= i5) {
                                            int i5110 = i7 + 119;
                                            b = i5110 % 128;
                                            int i5111 = i5110 % 2;
                                            resources = context.getResources();
                                            j.bIE bie3 = jVar2.c;
                                            int i6110 = b + 88;
                                            int i6111 = (i6110 ^ (-1)) + (i6110 << 1);
                                            a = i6111 % 128;
                                            int i6112 = i6111 % 2;
                                            i8 = bie3.k;
                                            iF2 = jVar2.f();
                                            objArr = new Object[1];
                                            int i6113 = a;
                                            int i6114 = ((i6113 | 65) << 1) - (i6113 ^ 65);
                                            b = i6114 % 128;
                                            int i6115 = i6114 % 2;
                                            numValueOf = Integer.valueOf(jVar2.f());
                                            int i6116 = a;
                                            int i6117 = i6116 ^ 107;
                                            int i6118 = (i6116 & 107) << 1;
                                            i9 = ((i6117 | i6118) << 1) - (i6118 ^ i6117);
                                            b = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                objArr[0] = numValueOf;
                                                quantityString = resources.getQuantityString(i8, iF2, objArr);
                                                int i6119 = 16 / 0;
                                            } else {
                                                objArr[0] = numValueOf;
                                                quantityString = resources.getQuantityString(i8, iF2, objArr);
                                            }
                                        } else {
                                            int i718 = jVar2.c.d;
                                            objArr2 = new Object[1];
                                            int i719 = a;
                                            int i7110 = ((i719 ^ 103) | (i719 & 103)) << 1;
                                            int i7111 = -(((~i719) & 103) | (i719 & (-104)));
                                            i10 = (i7110 ^ i7111) + ((i7111 & i7110) << 1);
                                            b = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                objArr2[1] = Integer.valueOf(i5);
                                            } else {
                                                objArr2[0] = Integer.valueOf(i5);
                                            }
                                            quantityString = context.getString(i718, objArr2);
                                            int i7112 = (-2) - ((a + 88) ^ (-1));
                                            int i7113 = i7112 % 128;
                                            b = i7113;
                                            int i7114 = i7112 % 2;
                                            int i7115 = ((i7113 ^ 24) + ((i7113 & 24) << 1)) - 1;
                                            a = i7115 % 128;
                                            int i7116 = i7115 % 2;
                                        }
                                    } else if (iF <= i5) {
                                        int i5112 = i7 + 119;
                                        b = i5112 % 128;
                                        int i5113 = i5112 % 2;
                                        resources = context.getResources();
                                        j.bIE bie4 = jVar2.c;
                                        int i61110 = b + 88;
                                        int i61111 = (i61110 ^ (-1)) + (i61110 << 1);
                                        a = i61111 % 128;
                                        int i61112 = i61111 % 2;
                                        i8 = bie4.k;
                                        iF2 = jVar2.f();
                                        objArr = new Object[1];
                                        int i61113 = a;
                                        int i61114 = ((i61113 | 65) << 1) - (i61113 ^ 65);
                                        b = i61114 % 128;
                                        int i61115 = i61114 % 2;
                                        numValueOf = Integer.valueOf(jVar2.f());
                                        int i61116 = a;
                                        int i61117 = i61116 ^ 107;
                                        int i61118 = (i61116 & 107) << 1;
                                        i9 = ((i61117 | i61118) << 1) - (i61118 ^ i61117);
                                        b = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            objArr[0] = numValueOf;
                                            quantityString = resources.getQuantityString(i8, iF2, objArr);
                                            int i61119 = 16 / 0;
                                        } else {
                                            objArr[0] = numValueOf;
                                            quantityString = resources.getQuantityString(i8, iF2, objArr);
                                        }
                                    } else {
                                        int i7117 = jVar2.c.d;
                                        objArr2 = new Object[1];
                                        int i7118 = a;
                                        int i7119 = ((i7118 ^ 103) | (i7118 & 103)) << 1;
                                        int i71110 = -(((~i7118) & 103) | (i7118 & (-104)));
                                        i10 = (i7119 ^ i71110) + ((i71110 & i7119) << 1);
                                        b = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            objArr2[1] = Integer.valueOf(i5);
                                        } else {
                                            objArr2[0] = Integer.valueOf(i5);
                                        }
                                        quantityString = context.getString(i7117, objArr2);
                                        int i71111 = (-2) - ((a + 88) ^ (-1));
                                        int i71112 = i71111 % 128;
                                        b = i71112;
                                        int i71113 = i71111 % 2;
                                        int i71114 = ((i71112 ^ 24) + ((i71112 & 24) << 1)) - 1;
                                        a = i71114 % 128;
                                        int i71115 = i71114 % 2;
                                    }
                                }
                            }
                        }
                        sb.append(quantityString);
                        string = sb.toString();
                        int i812 = a;
                        int i813 = i812 ^ 83;
                        int i814 = (i812 & 83) << 1;
                        i13 = ((i813 | i814) << 1) - (i814 ^ i813);
                        b = i13 % 128;
                        if (i13 % 2 == 0) {
                            accessibilityNodeInfo.setContentDescription(string);
                            obj.hashCode();
                            throw null;
                        }
                        accessibilityNodeInfo.setContentDescription(string);
                        int i815 = a;
                        i14 = (((i815 & (-74)) | ((~i815) & 73)) - (~((i815 & 73) << 1))) - 1;
                        b = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i816 = 4 % 5;
                        }
                    }
                    quantityString = null;
                    sb.append(quantityString);
                    string = sb.toString();
                    int i817 = a;
                    int i818 = i817 ^ 83;
                    int i819 = (i817 & 83) << 1;
                    i13 = ((i818 | i819) << 1) - (i819 ^ i818);
                    b = i13 % 128;
                    if (i13 % 2 == 0) {
                        accessibilityNodeInfo.setContentDescription(string);
                        obj.hashCode();
                        throw null;
                    }
                    accessibilityNodeInfo.setContentDescription(string);
                    int i8110 = a;
                    i14 = (((i8110 & (-74)) | ((~i8110) & 73)) - (~((i8110 & 73) << 1))) - 1;
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i8111 = 4 % 5;
                    }
                }
            }
        }
        int itemVisiblePosition = getItemVisiblePosition();
        boolean zIsSelected = isSelected();
        int i90 = b;
        int i91 = ((((i90 ^ 123) | (i90 & 123)) << 1) - (~(-(((~i90) & 123) | (i90 & (-124)))))) - 1;
        a = i91 % 128;
        if (i91 % 2 == 0) {
            throw null;
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) al.aXE.c(0, 1, itemVisiblePosition, 1, false, zIsSelected).c);
        if (!(!isSelected())) {
            int i92 = b;
            int i93 = ((i92 ^ 48) + ((i92 & 48) << 1)) - 1;
            a = i93 % 128;
            int i94 = i93 % 2;
            accessibilityNodeInfo.setClickable(false);
            Object obj2 = al.aXC.e.k;
            int i95 = a;
            int i96 = i95 & 45;
            int i97 = (i95 ^ 45) | i96;
            int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
            b = i98 % 128;
            if (i98 % 2 != 0) {
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
                obj.hashCode();
                throw null;
            }
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
        }
        String string2 = getResources().getString(ivas.gov.bisp.enumeration.R.string.item_view_role_description);
        Bundle extras = accessibilityNodeInfo.getExtras();
        int i99 = a;
        int i100 = i99 & 37;
        int i101 = (((i99 | 37) & (~i100)) - (~(-(-(i100 << 1))))) - 1;
        b = i101 % 128;
        int i102 = i101 % 2;
        extras.putCharSequence("AccessibilityNodeInfo.roleDescription", string2);
        int i103 = a;
        int i104 = i103 & 61;
        int i105 = (((i103 | 61) & (~i104)) - (~(i104 << 1))) - 1;
        b = i105 % 128;
        int i106 = i105 % 2;
    }
}
