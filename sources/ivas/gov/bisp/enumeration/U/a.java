package ivas.gov.bisp.enumeration.U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.T.j;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a = 1;
    private static int b;
    public int c;
    public final Context d;
    public final TextInputLayout e;
    public LinearLayout f;
    public int g;
    public Animator h;
    public FrameLayout i;
    public final float j;
    public int k;
    public CharSequence l;
    public boolean m;
    public TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f52o;
    public CharSequence p;
    public ColorStateList q;
    public CharSequence r;
    public TextView s;
    public boolean t;
    public int u;
    public Typeface v;
    public ColorStateList w;

    public class bfR extends AnimatorListenerAdapter {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;
        public final /* synthetic */ int e;
        public final /* synthetic */ TextView f;

        public bfR(int i, TextView textView, int i2, TextView textView2) {
            this.c = i;
            this.d = textView;
            this.e = i2;
            this.f = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = a + 19;
            b = i2 % 128;
            int i3 = i2 % 2;
            a aVar = a.this;
            aVar.k = this.c;
            int i4 = b;
            int i5 = (((i4 | 93) << 1) - (~(-(((~i4) & 93) | (i4 & (-94)))))) - 1;
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                aVar.h = null;
                obj.hashCode();
                throw null;
            }
            aVar.h = null;
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.e == 1) {
                    int i6 = a;
                    int i7 = i6 & 71;
                    int i8 = (((i6 ^ 71) | i7) << 1) - ((i6 | 71) & (~i7));
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        TextView textView2 = a.this.n;
                        throw null;
                    }
                    TextView textView3 = a.this.n;
                    if (textView3 != null) {
                        int i9 = a;
                        int i10 = i9 & 13;
                        int i11 = i10 + ((i9 ^ 13) | i10);
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        textView3.setText((CharSequence) null);
                        int i13 = a;
                        int i14 = i13 & 23;
                        int i15 = (i14 - (~((i13 ^ 23) | i14))) - 1;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                    }
                }
            }
            TextView textView4 = this.f;
            if (textView4 != null) {
                int i17 = a + 107;
                b = i17 % 128;
                int i18 = i17 % 2;
                textView4.setTranslationY(0.0f);
                this.f.setAlpha(1.0f);
                int i19 = a;
                int i20 = i19 & 45;
                int i21 = (i19 | 45) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            int i25 = b;
            int i26 = (i25 & 65) + (i25 | 65);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 35 / 0;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((i2 + 34) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            TextView textView = this.f;
            if (textView != null) {
                int i5 = (i2 & 59) + (i2 | 59);
                b = i5 % 128;
                textView.setVisibility(i5 % 2 == 0 ? 1 : 0);
            }
            int i6 = b;
            int i7 = i6 & 15;
            int i8 = i7 + ((i6 ^ 15) | i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }

    public a(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.d = context;
        this.e = textInputLayout;
        this.j = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = ((i2 | 43) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f == null || this.e.getEditText() == null) {
            int i5 = a + 49;
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = a;
            int i8 = i7 ^ 33;
            int i9 = ((i7 & 33) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            b = i12;
            boolean z = i11 % 2 == 0;
            int i13 = ((i12 ^ 115) | (i12 & 115)) << 1;
            int i14 = -(((~i12) & 115) | (i12 & (-116)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            if (z) {
                int i18 = i16 & 31;
                int i19 = (((i16 | 31) & (~i18)) - (~(i18 << 1))) - 1;
                b = i19 % 128;
                int i20 = i19 % 2;
                EditText editText = this.e.getEditText();
                Context context = this.d;
                int i21 = b;
                int i22 = ((i21 | 119) << 1) - (i21 ^ 119);
                a = i22 % 128;
                int i23 = i22 % 2;
                boolean zE = ivas.gov.bisp.enumeration.aL.h.e(context);
                LinearLayout linearLayout = this.f;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                int i24 = a;
                int i25 = i24 & 41;
                int i26 = ((i24 ^ 41) | i25) << 1;
                int i27 = -((i24 | 41) & (~i25));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                int iG = T.aWY.g(editText);
                int i30 = a + 45;
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    k(zE, R.dimen.material_helper_text_font_1_3_padding_horizontal, iG);
                    this.d.getResources();
                    obj.hashCode();
                    throw null;
                }
                int iK = k(zE, R.dimen.material_helper_text_font_1_3_padding_horizontal, iG);
                int iK2 = k(zE, R.dimen.material_helper_text_font_1_3_padding_top, this.d.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top));
                int i31 = a;
                int i32 = i31 & 77;
                int i33 = -(-((i31 ^ 77) | i32));
                int i34 = (i32 & i33) + (i33 | i32);
                b = i34 % 128;
                int i35 = i34 % 2;
                int iH = T.aWY.h(editText);
                int i36 = a + 43;
                b = i36 % 128;
                T.aWY.l(linearLayout, iK, iK2, i36 % 2 != 0 ? k(zE, R.dimen.material_helper_text_font_1_3_padding_horizontal, iH) : k(zE, R.dimen.material_helper_text_font_1_3_padding_horizontal, iH), 0);
            }
        }
        int i37 = a;
        int i38 = i37 & 91;
        int i39 = ((i37 ^ 91) | i38) << 1;
        int i40 = -((i37 | 91) & (~i38));
        int i41 = (i39 & i40) + (i40 | i39);
        b = i41 % 128;
        int i42 = i41 % 2;
    }

    public final void f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (((i2 | 3) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Animator animator = this.h;
        if (animator != null) {
            animator.cancel();
            int i5 = b;
            int i6 = i5 & 27;
            int i7 = (((i5 | 27) & (~i6)) - (~(i6 << 1))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 4;
            }
        }
        int i9 = a;
        int i10 = (i9 ^ 121) + ((i9 & 121) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public final TextView h(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-36)) | ((~i3) & 35);
        int i5 = (i3 & 35) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (i == 1) {
            TextView textView = this.n;
            int i9 = (((i7 | 108) << 1) - (i7 ^ 108)) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return textView;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = i7 & 47;
        int i11 = (i7 | 47) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        int i14 = i13 % 128;
        b = i14;
        if (i13 % 2 == 0 ? i != 2 : i != 3) {
            int i15 = (i14 & 17) + (i14 | 17);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 10 / 0;
            }
            return null;
        }
        TextView textView2 = this.s;
        int i17 = i14 & 91;
        int i18 = ((((i14 ^ 91) | i17) << 1) - (~(-((i14 | 91) & (~i17))))) - 1;
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return textView2;
        }
        obj.hashCode();
        throw null;
    }

    public final int j() {
        int i = 2 % 2;
        int i2 = b;
        int currentTextColor = -1;
        int i3 = ((i2 ^ 4) + ((i2 & 4) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.n;
        if (textView != null) {
            int i5 = i2 + 87;
            a = i5 % 128;
            int i6 = i5 % 2;
            currentTextColor = textView.getCurrentTextColor();
            int i7 = b;
            int i8 = (i7 & 99) + (i7 | 99);
            a = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = (i2 & 17) + (i2 | 17);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 / 3;
            }
        }
        int i12 = a;
        int i13 = (i12 & 77) + (i12 | 77);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return currentTextColor;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
    public final void l(TextView textView, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-54)) | ((~i3) & 53)) + ((i3 & 53) << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            int i6 = (i5 & 33) + (i5 | 33);
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (i != 0) {
            int i8 = i3 & 5;
            int i9 = ((((i3 ^ 5) | i8) << 1) - (~(-((~i8) & (i3 | 5))))) - 1;
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            if (i != 1) {
                int i12 = i10 & 15;
                int i13 = -(-((i10 ^ 15) | i12));
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                int i17 = i15 & 71;
                int i18 = ((i15 ^ 71) | i17) << 1;
                int i19 = -((i15 | 71) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            } else {
                int i22 = i3 & 31;
                int i23 = -(-((i3 ^ 31) | i22));
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                z = true;
            }
        } else {
            int i26 = i3 & 31;
            int i27 = -(-((i3 ^ 31) | i26));
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            z = true;
        }
        if (z) {
            int i30 = b;
            int i31 = (i30 & 65) + (i30 | 65);
            int i32 = i31 % 128;
            a = i32;
            int i33 = i31 % 2;
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                int i34 = i32 & 107;
                int i35 = (i34 - (~(-(-((i32 ^ 107) | i34))))) - 1;
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    frameLayout.removeView(textView);
                    throw null;
                }
                frameLayout.removeView(textView);
                int i36 = b;
                int i37 = i36 & 59;
                int i38 = (((i36 ^ 59) | i37) << 1) - ((i36 | 59) & (~i37));
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 5 / 5;
                }
            } else {
                linearLayout.removeView(textView);
                int i40 = a;
                int i41 = ((i40 | 125) << 1) - (i40 ^ 125);
                b = i41 % 128;
                int i42 = i41 % 2;
            }
        } else {
            linearLayout.removeView(textView);
            int i43 = a;
            int i44 = ((i43 | 125) << 1) - (i43 ^ 125);
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        int i46 = this.g - 1;
        this.g = i46;
        int i47 = b + 115;
        int i48 = i47 % 128;
        a = i48;
        int i49 = i47 % 2;
        LinearLayout linearLayout2 = this.f;
        if (i46 == 0) {
            int i50 = (((i48 & (-26)) | ((~i48) & 25)) - (~(-(-((i48 & 25) << 1))))) - 1;
            b = i50 % 128;
            int i51 = i50 % 2;
            linearLayout2.setVisibility(8);
            int i52 = a;
            int i53 = (((i52 & (-76)) | ((~i52) & 75)) - (~(-(-((i52 & 75) << 1))))) - 1;
            b = i53 % 128;
            int i54 = i53 % 2;
        }
        int i55 = a;
        int i56 = (i55 ^ 91) + ((i55 & 91) << 1);
        b = i56 % 128;
        int i57 = i56 % 2;
    }

    public final int k(boolean z, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 26) + (i4 | 26);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i7 = i4 + 79;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                this.d.getResources().getDimensionPixelSize(i);
                obj.hashCode();
                throw null;
            }
            i2 = this.d.getResources().getDimensionPixelSize(i);
        }
        int i8 = a;
        int i9 = ((i8 ^ 85) - (~((i8 & 85) << 1))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 41 / 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    public final boolean m(TextView textView, CharSequence charSequence) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-40)) | ((~i2) & 39);
        int i4 = -(-((i2 & 39) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        TextInputLayout textInputLayout = this.e;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        Object obj = null;
        if (!T.aXa.d(textInputLayout)) {
            int i7 = a + 61;
            b = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        } else {
            int i9 = a;
            int i10 = i9 & 63;
            int i11 = -(-((i9 ^ 63) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                this.e.isEnabled();
                obj.hashCode();
                throw null;
            }
            if (this.e.isEnabled()) {
                if (this.c == this.k) {
                    int i13 = b + 53;
                    int i14 = i13 % 128;
                    a = i14;
                    int i15 = i13 % 2;
                    if (textView != null) {
                        int i16 = ((i14 & 4) + (i14 | 4)) - 1;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        if (TextUtils.equals(textView.getText(), charSequence)) {
                            int i18 = a + 61;
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            z = false;
                        }
                    }
                }
                int i20 = (-2) - ((b + 26) ^ (-1));
                a = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                int i110 = a + 61;
                b = i110 % 128;
                int i111 = i110 % 2;
                z = false;
            }
        }
        int i22 = a;
        int i23 = ((i22 | 105) << 1) - (i22 ^ 105);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x012d  */
    public final void d(TextView textView, int i) {
        TextInputLayout textInputLayout;
        LinearLayout linearLayout;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 41) + (i4 | 41);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (this.f == null) {
            int i6 = i4 & 35;
            int i7 = i6 + ((i4 ^ 35) | i6);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.i == null) {
                LinearLayout linearLayout2 = new LinearLayout(this.d);
                int i8 = (-2) - ((a + 106) ^ (-1));
                b = i8 % 128;
                int i9 = i8 % 2;
                this.f = linearLayout2;
                linearLayout2.setOrientation(0);
                int i10 = b;
                int i11 = i10 & 113;
                int i12 = -(-((i10 ^ 113) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    textInputLayout = this.e;
                    linearLayout = this.f;
                    i2 = 59;
                } else {
                    textInputLayout = this.e;
                    linearLayout = this.f;
                    i2 = -2;
                }
                textInputLayout.addView(linearLayout, -1, i2);
                this.i = new FrameLayout(this.d);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                int i14 = a + 105;
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    this.f.addView(this.i, layoutParams);
                    obj.hashCode();
                    throw null;
                }
                this.f.addView(this.i, layoutParams);
                if (this.e.getEditText() != null) {
                    int i15 = b;
                    int i16 = i15 & 57;
                    int i17 = (((i15 | 57) & (~i16)) - (~(i16 << 1))) - 1;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    e();
                    int i19 = a;
                    int i20 = (((i19 | 12) << 1) - (i19 ^ 12)) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
        }
        if (i != 0) {
            int i22 = a;
            int i23 = i22 & 37;
            int i24 = ((i22 ^ 37) | i23) << 1;
            int i25 = -((i22 | 37) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = i26 % 128;
            b = i27;
            int i28 = i26 % 2;
            if (i != 1) {
                int i29 = i27 & 1;
                int i30 = i29 + ((i27 ^ 1) | i29);
                a = i30 % 128;
                int i31 = i30 % 2;
                int i32 = i27 & 23;
                int i33 = (i27 | 23) & (~i32);
                int i34 = -(-(i32 << 1));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                a = i35 % 128;
                int i36 = i35 % 2;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                LinearLayout linearLayout3 = this.f;
                int i37 = b;
                int i38 = ((i37 | 53) << 1) - (i37 ^ 53);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    linearLayout3.addView(textView, layoutParams2);
                    throw null;
                }
                linearLayout3.addView(textView, layoutParams2);
                int i39 = b;
                int i40 = i39 & 71;
                int i41 = -(-((i39 ^ 71) | i40));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                a = i42 % 128;
                int i43 = i42 % 2;
            } else {
                int i44 = a;
                int i45 = ((i44 ^ 9) | (i44 & 9)) << 1;
                int i46 = -(((~i44) & 9) | (i44 & (-10)));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                int i48 = i47 % 128;
                b = i48;
                int i49 = i47 % 2;
                int i50 = i48 & 115;
                int i51 = ((i48 ^ 115) | i50) << 1;
                int i52 = -((i48 | 115) & (~i50));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                a = i53 % 128;
                int i54 = i53 % 2;
                this.i.setVisibility(0);
                this.i.addView(textView);
            }
        } else {
            int i410 = a;
            int i411 = ((i410 ^ 9) | (i410 & 9)) << 1;
            int i412 = -(((~i410) & 9) | (i410 & (-10)));
            int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
            int i414 = i413 % 128;
            b = i414;
            int i415 = i413 % 2;
            int i55 = i414 & 115;
            int i56 = ((i414 ^ 115) | i55) << 1;
            int i57 = -((i414 | 115) & (~i55));
            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
            a = i58 % 128;
            int i59 = i58 % 2;
            this.i.setVisibility(0);
            this.i.addView(textView);
        }
        this.f.setVisibility(0);
        int i60 = this.g;
        int i61 = i60 ^ 1;
        int i62 = ((i60 & 1) | i61) << 1;
        int i63 = -i61;
        int i64 = (i62 ^ i63) + ((i62 & i63) << 1);
        int i65 = a;
        int i66 = i65 & 117;
        int i67 = (i65 ^ 117) | i66;
        int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
        b = i68 % 128;
        if (i68 % 2 != 0) {
            this.g = i64;
            throw null;
        }
        this.g = i64;
        int i69 = i65 & 41;
        int i70 = (i65 ^ 41) | i69;
        int i71 = (i69 & i70) + (i70 | i69);
        b = i71 % 128;
        int i72 = i71 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    public final boolean i() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 63;
        int i4 = (i2 & 63) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (this.c == 1) {
            int i7 = i2 + 75;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (this.n != null) {
                int i9 = (i2 & (-56)) | ((~i2) & 55);
                int i10 = (i2 & 55) << 1;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    TextUtils.isEmpty(this.l);
                    obj.hashCode();
                    throw null;
                }
                if (TextUtils.isEmpty(this.l)) {
                    int i12 = b;
                    int i13 = (i12 ^ 77) + ((i12 & 77) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                } else {
                    z = true;
                }
            } else {
                int i15 = b;
                int i16 = (i15 ^ 77) + ((i15 & 77) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
        } else {
            int i18 = b;
            int i19 = (i18 ^ 77) + ((i18 & 77) << 1);
            a = i19 % 128;
            int i110 = i19 % 2;
            z = false;
        }
        int i20 = a + 122;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0076  */
    public final void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = (((i2 ^ 69) | i3) << 1) - ((i2 | 69) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.l = null;
        f();
        int i6 = this.k;
        int i7 = a;
        int i8 = (-2) - ((((i7 | 4) << 1) - (i7 ^ 4)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        if (i6 == 1) {
            int i10 = (((i7 | 32) << 1) - (i7 ^ 32)) - 1;
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            if (this.t) {
                int i13 = i11 & 73;
                int i14 = (i13 - (~(-(-((i11 ^ 73) | i13))))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                if (TextUtils.isEmpty(this.r)) {
                    this.c = 0;
                    int i16 = b;
                    int i17 = i16 & 39;
                    int i18 = (i16 | 39) & (~i17);
                    int i19 = -(-(i17 << 1));
                    int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    int i22 = a;
                    int i23 = (((i22 | 35) << 1) - (~(-(((~i22) & 35) | (i22 & (-36)))))) - 1;
                    b = i23 % 128;
                    if (i23 % 2 != 0) {
                        this.c = 3;
                    } else {
                        this.c = 2;
                    }
                }
            } else {
                this.c = 0;
                int i110 = b;
                int i111 = i110 & 39;
                int i112 = (i110 | 39) & (~i111);
                int i113 = -(-(i111 << 1));
                int i24 = (i112 ^ i113) + ((i112 & i113) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        int i26 = this.k;
        int i27 = this.c;
        TextView textView = this.n;
        int i28 = a;
        int i29 = i28 & 99;
        int i30 = (i28 | 99) & (~i29);
        int i31 = i29 << 1;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        b = i32 % 128;
        int i33 = i32 % 2;
        n(i26, i27, m(textView, null));
        int i34 = a + 21;
        b = i34 % 128;
        if (i34 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:28:0x0123  */
    /* JADX WARN: Code duplicated, block: B:31:0x014b  */
    /* JADX WARN: Code duplicated, block: B:33:0x015d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0161  */
    public final void g(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        int i4;
        float f;
        int i5;
        int i6;
        float[] fArr;
        float f2;
        int i7;
        ObjectAnimator objectAnimatorOfFloat;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = ((i11 | 41) << 1) - ((i11 & (-42)) | ((~i11) & 41));
        a = i12 % 128;
        int i13 = i12 % 2;
        if (textView != null) {
            int i14 = (((i11 | 44) << 1) - (i11 ^ 44)) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (!(!z)) {
                if (i != i3) {
                    int i15 = (-2) - (((i11 & 70) + (i11 | 70)) ^ (-1));
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    if (i == i2) {
                        if (i3 == i) {
                            int i17 = a;
                            int i18 = (((i17 ^ 87) | (i17 & 87)) << 1) - ((i17 & (-88)) | ((~i17) & 87));
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            int i20 = ((i17 & 98) + (i17 | 98)) - 1;
                            int i21 = i20 % 128;
                            b = i21;
                            int i22 = i20 % 2;
                            int i23 = i21 + 119;
                            int i24 = i23 % 128;
                            a = i24;
                            int i25 = i23 % 2;
                            int i26 = i24 & 55;
                            int i27 = i24 | 55;
                            int i28 = (i26 & i27) + (i26 | i27);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            f = 1.0f;
                        } else {
                            i4 = (((i11 | 101) << 1) - (~(-((i11 & (-102)) | ((~i11) & 101))))) - 1;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i30 = 2 % 5;
                            }
                            int i31 = (i11 & 23) + (i11 | 23);
                            a = i31 % 128;
                            int i32 = i31 % 2;
                            f = 0.0f;
                        }
                        Property property = View.ALPHA;
                        float[] fArr2 = {f};
                        int i33 = b;
                        int i34 = i33 | 47;
                        int i35 = i34 << 1;
                        int i36 = -((~(i33 & 47)) & i34);
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr2);
                        objectAnimatorOfFloat2.setDuration(167L);
                        int i39 = b;
                        int i40 = ((i39 | 9) << 1) - (((~i39) & 9) | (i39 & (-10)));
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        objectAnimatorOfFloat2.setInterpolator(j.c);
                        list.add(objectAnimatorOfFloat2);
                        i5 = a;
                        i6 = ((i5 & (-46)) | ((~i5) & 45)) + ((i5 & 45) << 1);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i42 = 19 / 0;
                            if (i3 == i) {
                                int i43 = i5 & 33;
                                int i44 = ((~i43) & (i5 | 33)) + (i43 << 1);
                                b = i44 % 128;
                                int i45 = i44 % 2;
                                Property property2 = View.TRANSLATION_Y;
                                fArr = new float[2];
                                f2 = this.j;
                                int i46 = a;
                                i7 = ((i46 & (-32)) | ((~i46) & 31)) + ((i46 & 31) << 1);
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    fArr[0] = -f2;
                                    fArr[0] = 1.0f;
                                } else {
                                    fArr[0] = -f2;
                                    fArr[1] = 0.0f;
                                }
                                objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr);
                                int i47 = a + 97;
                                b = i47 % 128;
                                int i48 = i47 % 2;
                                objectAnimatorOfFloat.setDuration(217L);
                                objectAnimatorOfFloat.setInterpolator(j.f);
                                int i49 = a;
                                i8 = (i49 ^ 61) + ((i49 & 61) << 1);
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    list.add(objectAnimatorOfFloat);
                                    throw null;
                                }
                                list.add(objectAnimatorOfFloat);
                                int i50 = b;
                                i9 = (i50 ^ 5) + ((i50 & 5) << 1);
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i51 = 4 % 5;
                                }
                            }
                        } else if (i3 == i) {
                            int i410 = i5 & 33;
                            int i411 = ((~i410) & (i5 | 33)) + (i410 << 1);
                            b = i411 % 128;
                            int i412 = i411 % 2;
                            Property property3 = View.TRANSLATION_Y;
                            fArr = new float[2];
                            f2 = this.j;
                            int i413 = a;
                            i7 = ((i413 & (-32)) | ((~i413) & 31)) + ((i413 & 31) << 1);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                fArr[0] = -f2;
                                fArr[0] = 1.0f;
                            } else {
                                fArr[0] = -f2;
                                fArr[1] = 0.0f;
                            }
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr);
                            int i414 = a + 97;
                            b = i414 % 128;
                            int i415 = i414 % 2;
                            objectAnimatorOfFloat.setDuration(217L);
                            objectAnimatorOfFloat.setInterpolator(j.f);
                            int i416 = a;
                            i8 = (i416 ^ 61) + ((i416 & 61) << 1);
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                list.add(objectAnimatorOfFloat);
                                throw null;
                            }
                            list.add(objectAnimatorOfFloat);
                            int i52 = b;
                            i9 = (i52 ^ 5) + ((i52 & 5) << 1);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i53 = 4 % 5;
                            }
                        }
                    }
                } else {
                    if (i3 == i) {
                        int i110 = a;
                        int i111 = (((i110 ^ 87) | (i110 & 87)) << 1) - ((i110 & (-88)) | ((~i110) & 87));
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        int i210 = ((i110 & 98) + (i110 | 98)) - 1;
                        int i211 = i210 % 128;
                        b = i211;
                        int i212 = i210 % 2;
                        int i213 = i211 + 119;
                        int i214 = i213 % 128;
                        a = i214;
                        int i215 = i213 % 2;
                        int i216 = i214 & 55;
                        int i217 = i214 | 55;
                        int i218 = (i216 & i217) + (i216 | i217);
                        b = i218 % 128;
                        int i219 = i218 % 2;
                        f = 1.0f;
                    } else {
                        i4 = (((i11 | 101) << 1) - (~(-((i11 & (-102)) | ((~i11) & 101))))) - 1;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i310 = 2 % 5;
                        }
                        int i311 = (i11 & 23) + (i11 | 23);
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        f = 0.0f;
                    }
                    Property property4 = View.ALPHA;
                    float[] fArr3 = {f};
                    int i313 = b;
                    int i314 = i313 | 47;
                    int i315 = i314 << 1;
                    int i316 = -((~(i313 & 47)) & i314);
                    int i317 = ((i315 | i316) << 1) - (i316 ^ i315);
                    a = i317 % 128;
                    int i318 = i317 % 2;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr3);
                    objectAnimatorOfFloat3.setDuration(167L);
                    int i319 = b;
                    int i417 = ((i319 | 9) << 1) - (((~i319) & 9) | (i319 & (-10)));
                    a = i417 % 128;
                    int i418 = i417 % 2;
                    objectAnimatorOfFloat3.setInterpolator(j.c);
                    list.add(objectAnimatorOfFloat3);
                    i5 = a;
                    i6 = ((i5 & (-46)) | ((~i5) & 45)) + ((i5 & 45) << 1);
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i419 = 19 / 0;
                        if (i3 == i) {
                            int i4110 = i5 & 33;
                            int i4111 = ((~i4110) & (i5 | 33)) + (i4110 << 1);
                            b = i4111 % 128;
                            int i4112 = i4111 % 2;
                            Property property5 = View.TRANSLATION_Y;
                            fArr = new float[2];
                            f2 = this.j;
                            int i4113 = a;
                            i7 = ((i4113 & (-32)) | ((~i4113) & 31)) + ((i4113 & 31) << 1);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                fArr[0] = -f2;
                                fArr[0] = 1.0f;
                            } else {
                                fArr[0] = -f2;
                                fArr[1] = 0.0f;
                            }
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property5, fArr);
                            int i4114 = a + 97;
                            b = i4114 % 128;
                            int i4115 = i4114 % 2;
                            objectAnimatorOfFloat.setDuration(217L);
                            objectAnimatorOfFloat.setInterpolator(j.f);
                            int i4116 = a;
                            i8 = (i4116 ^ 61) + ((i4116 & 61) << 1);
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                list.add(objectAnimatorOfFloat);
                                throw null;
                            }
                            list.add(objectAnimatorOfFloat);
                            int i54 = b;
                            i9 = (i54 ^ 5) + ((i54 & 5) << 1);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i55 = 4 % 5;
                            }
                        }
                    } else if (i3 == i) {
                        int i4117 = i5 & 33;
                        int i4118 = ((~i4117) & (i5 | 33)) + (i4117 << 1);
                        b = i4118 % 128;
                        int i4119 = i4118 % 2;
                        Property property6 = View.TRANSLATION_Y;
                        fArr = new float[2];
                        f2 = this.j;
                        int i41110 = a;
                        i7 = ((i41110 & (-32)) | ((~i41110) & 31)) + ((i41110 & 31) << 1);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            fArr[0] = -f2;
                            fArr[0] = 1.0f;
                        } else {
                            fArr[0] = -f2;
                            fArr[1] = 0.0f;
                        }
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property6, fArr);
                        int i41111 = a + 97;
                        b = i41111 % 128;
                        int i41112 = i41111 % 2;
                        objectAnimatorOfFloat.setDuration(217L);
                        objectAnimatorOfFloat.setInterpolator(j.f);
                        int i41113 = a;
                        i8 = (i41113 ^ 61) + ((i41113 & 61) << 1);
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            list.add(objectAnimatorOfFloat);
                            throw null;
                        }
                        list.add(objectAnimatorOfFloat);
                        int i56 = b;
                        i9 = (i56 ^ 5) + ((i56 & 5) << 1);
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i57 = 4 % 5;
                        }
                    }
                }
            }
        }
        int i58 = b;
        int i59 = ((i58 ^ 116) + ((i58 & 116) << 1)) - 1;
        a = i59 % 128;
        int i60 = i59 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0142 A[PHI: r0
  0x0142: PHI (r0v10 android.widget.TextView) = (r0v9 android.widget.TextView), (r0v15 android.widget.TextView) binds: [B:34:0x0140, B:31:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0148  */
    public final void n(int i, int i2, boolean z) {
        TextView textViewH;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 17;
        int i6 = ((i4 ^ 17) | i5) << 1;
        int i7 = -((~i5) & (i4 | 17));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        int i9 = i8 % 128;
        a = i9;
        Object obj = null;
        if (i8 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i == i2) {
            int i10 = (-2) - ((i9 + 36) ^ (-1));
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 0;
                return;
            }
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.h = animatorSet;
            ArrayList arrayList = new ArrayList();
            int i12 = a;
            int i13 = (i12 | 107) << 1;
            int i14 = -(((~i12) & 107) | (i12 & (-108)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            g(arrayList, this.t, this.s, 2, i, i2);
            int i17 = b;
            int i18 = i17 & 31;
            int i19 = ((i17 | 31) & (~i18)) + (i18 << 1);
            int i20 = i19 % 128;
            a = i20;
            int i21 = i19 % 2;
            boolean z2 = this.m;
            TextView textView = this.n;
            int i22 = i20 & 43;
            int i23 = i22 + ((i20 ^ 43) | i22);
            b = i23 % 128;
            int i24 = i23 % 2;
            g(arrayList, z2, textView, 1, i, i2);
            ivas.gov.bisp.enumeration.O.i.p(animatorSet, arrayList);
            int i25 = a + 57;
            b = i25 % 128;
            int i26 = i25 % 2;
            bfR bfr = new bfR(i2, h(i), i, h(i2));
            int i27 = (-2) - ((b + 86) ^ (-1));
            a = i27 % 128;
            if (i27 % 2 == 0) {
                animatorSet.addListener(bfr);
                animatorSet.start();
                int i28 = 69 / 0;
            } else {
                animatorSet.addListener(bfr);
                animatorSet.start();
            }
        } else if (i != i2) {
            int i29 = i4 + 31;
            int i30 = i29 % 128;
            a = i30;
            int i31 = i29 % 2;
            if (i2 != 0) {
                int i32 = (i30 & (-20)) | ((~i30) & 19);
                int i33 = -(-((i30 & 19) << 1));
                int i34 = (i32 & i33) + (i33 | i32);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    h(i2);
                    throw null;
                }
                TextView textViewH2 = h(i2);
                if (textViewH2 != null) {
                    textViewH2.setVisibility(0);
                    textViewH2.setAlpha(1.0f);
                    int i35 = b;
                    int i36 = ((i35 ^ 55) | (i35 & 55)) << 1;
                    int i37 = -(((~i35) & 55) | (i35 & (-56)));
                    int i38 = (i36 & i37) + (i37 | i36);
                    a = i38 % 128;
                    if (i38 % 2 == 0) {
                        int i39 = 3 % 2;
                    }
                }
            }
            if (i != 0) {
                int i40 = a + 19;
                b = i40 % 128;
                if (i40 % 2 != 0) {
                    textViewH = h(i);
                    int i41 = 3 / 0;
                    if (textViewH != null) {
                        textViewH.setVisibility(4);
                        if (i == 1) {
                            int i42 = a;
                            int i43 = i42 ^ 3;
                            int i44 = -(-((i42 & 3) << 1));
                            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            textViewH.setText((CharSequence) null);
                            int i47 = b + 56;
                            int i48 = (i47 ^ (-1)) + (i47 << 1);
                            a = i48 % 128;
                            int i49 = i48 % 2;
                        }
                    }
                } else {
                    textViewH = h(i);
                    if (textViewH != null) {
                        textViewH.setVisibility(4);
                        if (i == 1) {
                            int i410 = a;
                            int i411 = i410 ^ 3;
                            int i412 = -(-((i410 & 3) << 1));
                            int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                            b = i413 % 128;
                            int i414 = i413 % 2;
                            textViewH.setText((CharSequence) null);
                            int i415 = b + 56;
                            int i416 = (i415 ^ (-1)) + (i415 << 1);
                            a = i416 % 128;
                            int i417 = i416 % 2;
                        }
                    }
                }
            }
            this.k = i2;
            int i50 = a + 5;
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        this.e.G();
        this.e.H(z, false);
        int i52 = (-2) - ((a + 70) ^ (-1));
        b = i52 % 128;
        int i53 = i52 % 2;
        this.e.O();
        int i54 = a + 47;
        b = i54 % 128;
        int i55 = i54 % 2;
    }
}
