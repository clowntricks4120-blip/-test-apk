package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.IMediaSession;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.OooOOO0.o000OOo;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.U.C0027p;
import ivas.gov.bisp.enumeration.U.a;
import ivas.gov.bisp.enumeration.U.i;
import ivas.gov.bisp.enumeration.U.l;
import ivas.gov.bisp.enumeration.U.x;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aM.C0073m;
import ivas.gov.bisp.enumeration.aM.u;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p011ak.am;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.P;
import ivas.gov.bisp.enumeration.p088k.W;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public final TextView A;
    public CharSequence B;
    public boolean C;
    public CharSequence D;
    public int E;
    public t F;
    public boolean G;
    public C0019p H;
    public C0019p I;
    public final int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final RectF P;
    public final Rect Q;
    public int R;
    public final Rect S;
    public Typeface T;
    public ColorStateList U;
    public boolean V;
    public PorterDuff.Mode W;
    public int a;
    public ColorStateList aA;
    public View.OnLongClickListener aB;
    public int aC;
    public int aD;
    public int aE;
    public ColorStateList aF;
    public PorterDuff.Mode aG;
    public ColorStateList aH;
    public int aI;
    public int aJ;
    public final CheckableImageButton aK;
    public int aL;
    public boolean aM;
    public boolean aa;
    public Drawable ab;
    public int ac;
    public View.OnLongClickListener ad;
    public final LinkedHashSet<OooOO0> ae;
    public int af;
    public final SparseArray<l> ag;
    public final LinkedHashSet<OooOO0O> ah;
    public final CheckableImageButton ai;
    public ColorStateList aj;
    public boolean ak;
    public boolean al;
    public int am;
    public boolean an;
    public final ivas.gov.bisp.enumeration.P.h ao;
    public ValueAnimator ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public int at;
    public final CheckableImageButton au;
    public Drawable av;
    public int aw;
    public Drawable ax;
    public View.OnLongClickListener ay;
    public ColorStateList az;
    public final FrameLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public EditText e;
    public final FrameLayout f;
    public CharSequence g;
    public int h;
    public final a i;
    public boolean j;
    public int k;
    public TextView l;
    public boolean m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f38o;
    public boolean p;
    public CharSequence q;
    public TextView r;
    public ColorStateList s;
    public int t;
    public ColorStateList u;
    public u v;
    public u w;
    public CharSequence x;
    public ColorStateList y;
    public final TextView z;

    public static class OooO extends C0283j {
        public final TextInputLayout a;

        public OooO(TextInputLayout textInputLayout) {
            this.a = textInputLayout;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            EditText editText = this.a.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.a.getHint();
            CharSequence error = this.a.getError();
            CharSequence placeholderText = this.a.getPlaceholderText();
            int counterMaxLength = this.a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.a.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = !zIsEmpty;
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z2 = this.a.an;
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = zIsEmpty2 ^ true ? hint.toString() : BuildConfig.FLAVOR;
            if (z) {
                alVar.d.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                alVar.d.setText(string);
                if ((!z2) && placeholderText != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(", ");
                    sb.append((Object) placeholderText);
                    alVar.d.setText(sb.toString());
                }
            } else if (placeholderText != null) {
                alVar.d.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    alVar.m(string);
                } else {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) text);
                        sb2.append(", ");
                        sb2.append(string);
                        string = sb2.toString();
                    }
                    alVar.d.setText(string);
                }
                if (i >= 26) {
                    alVar.d.setShowingHintText(zIsEmpty);
                } else {
                    alVar.k(4, zIsEmpty);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            alVar.d.setMaxTextLength(counterMaxLength);
            if (z4) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                alVar.d.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.H(!textInputLayout.as, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.j) {
                textInputLayout2.D(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.p) {
                textInputLayout3.J(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.ai.performClick();
            TextInputLayout.this.ai.jumpDrawablesToCurrentState();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.ao.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface OooOO0 {
        void b(TextInputLayout textInputLayout);
    }

    public interface OooOO0O {
        void b(TextInputLayout textInputLayout, int i);
    }

    public static class OooOOO0 extends ivas.gov.bisp.enumeration.p103z.l {
        public static final Parcelable.Creator<OooOOO0> CREATOR = new OooO00o();
        public CharSequence b;
        public CharSequence c;
        public boolean f;
        public CharSequence g;
        public CharSequence h;

        public static final class OooO00o implements Parcelable.ClassLoaderCreator<OooOOO0> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final OooOOO0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new OooOOO0(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OooOOO0[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new OooOOO0(parcel, null);
            }
        }

        public OooOOO0(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("TextInputLayout.SavedState{");
            sbW.append(Integer.toHexString(System.identityHashCode(this)));
            sbW.append(" error=");
            sbW.append((Object) this.b);
            sbW.append(" hint=");
            sbW.append((Object) this.c);
            sbW.append(" helperText=");
            sbW.append((Object) this.g);
            sbW.append(" placeholderText=");
            sbW.append((Object) this.h);
            sbW.append("}");
            return sbW.toString();
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
            TextUtils.writeToParcel(this.c, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
            TextUtils.writeToParcel(this.h, parcel, i);
        }

        public OooOOO0(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = parcel.readInt() == 1;
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0511  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean, int] */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        ?? r2;
        AttributeSet attributeSet2;
        super(J.b(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        this.h = -1;
        this.a = -1;
        this.i = new a(this);
        this.Q = new Rect();
        this.S = new Rect();
        this.P = new RectF();
        this.ae = new LinkedHashSet<>();
        this.af = 0;
        SparseArray<l> sparseArray = new SparseArray<>();
        this.ag = sparseArray;
        this.ah = new LinkedHashSet<>();
        ivas.gov.bisp.enumeration.P.h hVar = new ivas.gov.bisp.enumeration.P.h(this);
        this.ao = hVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = ivas.gov.bisp.enumeration.T.j.c;
        hVar.I = timeInterpolator;
        hVar.m();
        hVar.L = timeInterpolator;
        hVar.m();
        hVar.p(8388659);
        B bF = ivas.gov.bisp.enumeration.P.a.f(context2, attributeSet, r.Q, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 20, 18, 33, 38, 42);
        this.C = bF.f(41, true);
        setHint(bF.s(4));
        this.aq = bF.f(40, true);
        this.al = bF.f(35, true);
        if (bF.t(3)) {
            setMinWidth(bF.j(3, -1));
        }
        if (bF.t(2)) {
            setMaxWidth(bF.j(2, -1));
        }
        this.F = t.e(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).e();
        this.J = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.M = bF.k(7, 0);
        this.N = bF.j(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.O = bF.j(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.L = this.N;
        float fI = bF.i(11, -1.0f);
        float fI2 = bF.i(10, -1.0f);
        float fI3 = bF.i(8, -1.0f);
        float fI4 = bF.i(9, -1.0f);
        t tVar = this.F;
        Objects.requireNonNull(tVar);
        t.bfu bfuVar = new t.bfu(tVar);
        if (fI >= 0.0f) {
            bfuVar.i(fI);
        }
        if (fI2 >= 0.0f) {
            bfuVar.h(fI2);
        }
        if (fI3 >= 0.0f) {
            bfuVar.g(fI3);
        }
        if (fI4 >= 0.0f) {
            bfuVar.f(fI4);
        }
        this.F = bfuVar.e();
        ColorStateList colorStateListC = ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 5);
        if (colorStateListC != null) {
            int defaultColor = colorStateListC.getDefaultColor();
            this.aD = defaultColor;
            this.R = defaultColor;
            if (colorStateListC.isStateful()) {
                this.aL = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.aC = colorStateListC.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.at = colorStateListC.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.aC = this.aD;
                ColorStateList colorStateListB = A.b(context2, R.color.mtrl_filled_background_color);
                this.aL = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.at = colorStateListB.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.R = 0;
            this.aD = 0;
            this.aL = 0;
            this.aC = 0;
            this.at = 0;
        }
        if (bF.t(1)) {
            ColorStateList colorStateListH = bF.h(1);
            this.aH = colorStateListH;
            this.az = colorStateListH;
        }
        ColorStateList colorStateListC2 = ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 12);
        this.aE = bF.g(12, 0);
        Object obj = ivas.gov.bisp.enumeration.p086i.l.c;
        this.aI = ivas.gov.bisp.enumeration.i.l.aUI.b(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.am = ivas.gov.bisp.enumeration.i.l.aUI.b(context2, R.color.mtrl_textinput_disabled_color);
        this.aJ = ivas.gov.bisp.enumeration.i.l.aUI.b(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListC2 != null) {
            setBoxStrokeColorStateList(colorStateListC2);
        }
        if (bF.t(13)) {
            setBoxStrokeErrorColor(ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 13));
        }
        if (bF.r(42, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(bF.r(42, 0));
        } else {
            r2 = 0;
        }
        int iR = bF.r(33, r2);
        CharSequence charSequenceS = bF.s(28);
        boolean zF = bF.f(29, r2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, linearLayout2, (boolean) r2);
        this.aK = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (ivas.gov.bisp.enumeration.aL.h.e(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(r2);
        }
        if (bF.t(30)) {
            setErrorIconDrawable(bF.l(30));
        }
        if (bF.t(31)) {
            setErrorIconTintList(ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 31));
        }
        if (bF.t(32)) {
            setErrorIconTintMode(ivas.gov.bisp.enumeration.P.J.d(bF.n(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iR2 = bF.r(38, 0);
        boolean zF2 = bF.f(37, false);
        CharSequence charSequenceS2 = bF.s(36);
        int iR3 = bF.r(50, 0);
        CharSequence charSequenceS3 = bF.s(49);
        int iR4 = bF.r(53, 0);
        CharSequence charSequenceS4 = bF.s(52);
        int iR5 = bF.r(63, 0);
        CharSequence charSequenceS5 = bF.s(62);
        boolean zF3 = bF.f(16, false);
        setCounterMaxLength(bF.n(17, -1));
        this.f38o = bF.r(20, 0);
        this.n = bF.r(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.au = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (ivas.gov.bisp.enumeration.aL.h.e(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (bF.t(59)) {
            setStartIconDrawable(bF.l(59));
            if (bF.t(58)) {
                setStartIconContentDescription(bF.s(58));
            }
            setStartIconCheckable(bF.f(57, true));
        }
        if (bF.t(60)) {
            setStartIconTintList(ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 60));
        }
        if (bF.t(61)) {
            setStartIconTintMode(ivas.gov.bisp.enumeration.P.J.d(bF.n(61, -1), null));
        }
        setBoxBackgroundMode(bF.n(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.ai = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (ivas.gov.bisp.enumeration.aL.h.e(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        int iR6 = bF.r(24, 0);
        sparseArray.append(-1, new i(this, iR6));
        sparseArray.append(0, new x(this));
        sparseArray.append(1, new h(this, iR6 == 0 ? bF.r(45, 0) : iR6));
        sparseArray.append(2, new j(this, iR6));
        sparseArray.append(3, new c(this, iR6));
        if (bF.t(25)) {
            setEndIconMode(bF.n(25, 0));
            if (bF.t(23)) {
                setEndIconContentDescription(bF.s(23));
            }
            setEndIconCheckable(bF.f(22, true));
        } else if (bF.t(46)) {
            setEndIconMode(bF.f(46, false) ? 1 : 0);
            setEndIconContentDescription(bF.s(44));
            if (bF.t(47)) {
                setEndIconTintList(ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 47));
            }
            if (bF.t(48)) {
                setEndIconTintMode(ivas.gov.bisp.enumeration.P.J.d(bF.n(48, -1), null));
            }
        }
        if (bF.t(46)) {
            attributeSet2 = null;
        } else {
            if (bF.t(26)) {
                setEndIconTintList(ivas.gov.bisp.enumeration.aL.h.c(context2, bF, 26));
            }
            if (bF.t(27)) {
                attributeSet2 = null;
                setEndIconTintMode(ivas.gov.bisp.enumeration.P.J.d(bF.n(27, -1), null));
            } else {
                attributeSet2 = null;
            }
        }
        o000OOo o000ooo = new o000OOo(context2, attributeSet2);
        this.z = o000ooo;
        o000ooo.setId(R.id.textinput_prefix_text);
        o000ooo.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        T.aXa.f(o000ooo, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(o000ooo);
        o000OOo o000ooo2 = new o000OOo(context2, attributeSet2);
        this.A = o000ooo2;
        o000ooo2.setId(R.id.textinput_suffix_text);
        o000ooo2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        T.aXa.f(o000ooo2, 1);
        linearLayout2.addView(o000ooo2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(zF2);
        setHelperText(charSequenceS2);
        setHelperTextTextAppearance(iR2);
        setErrorEnabled(zF);
        setErrorTextAppearance(iR);
        setErrorContentDescription(charSequenceS);
        setCounterTextAppearance(this.f38o);
        setCounterOverflowTextAppearance(this.n);
        setPlaceholderText(charSequenceS3);
        setPlaceholderTextAppearance(iR3);
        setPrefixText(charSequenceS4);
        setPrefixTextAppearance(iR4);
        setSuffixText(charSequenceS5);
        setSuffixTextAppearance(iR5);
        if (bF.t(34)) {
            setErrorTextColor(bF.h(34));
        }
        if (bF.t(39)) {
            setHelperTextColor(bF.h(39));
        }
        if (bF.t(43)) {
            setHintTextColor(bF.h(43));
        }
        if (bF.t(21)) {
            setCounterTextColor(bF.h(21));
        }
        if (bF.t(19)) {
            setCounterOverflowTextColor(bF.h(19));
        }
        if (bF.t(51)) {
            setPlaceholderTextColor(bF.h(51));
        }
        if (bF.t(54)) {
            setPrefixTextColor(bF.h(54));
        }
        if (bF.t(64)) {
            setSuffixTextColor(bF.h(64));
        }
        setCounterEnabled(zF3);
        setEnabled(bF.f(0, true));
        bF.d.recycle();
        T.aWX.t(this, 2);
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i < 26) {
            return;
        }
        T.aXg.m(this, 1);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, z);
            }
        }
    }

    public static void c(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        boolean zB = T.aWW.b(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zB || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zB);
        checkableImageButton.setPressable(zB);
        checkableImageButton.setLongClickable(z);
        T.aWX.t(checkableImageButton, z2 ? 1 : 2);
    }

    private l getEndIconDelegate() {
        l lVar = this.ag.get(this.af);
        return lVar == null ? this.ag.get(0) : lVar;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.aK.getVisibility() == 0) {
            return this.aK;
        }
        if (t() && w()) {
            return this.ai;
        }
        return null;
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        this.e = editText;
        setMinWidth(this.h);
        setMaxWidth(this.a);
        v();
        setTextInputAccessibilityDelegate(new OooO(this));
        this.ao.r(this.e.getTypeface());
        ivas.gov.bisp.enumeration.P.h hVar = this.ao;
        float textSize = this.e.getTextSize();
        if (hVar.l != textSize) {
            hVar.l = textSize;
            hVar.m();
        }
        int gravity = this.e.getGravity();
        this.ao.p((gravity & (-113)) | 48);
        ivas.gov.bisp.enumeration.P.h hVar2 = this.ao;
        if (hVar2.k != gravity) {
            hVar2.k = gravity;
            hVar2.m();
        }
        this.e.addTextChangedListener(new OooO00o());
        if (this.az == null) {
            this.az = this.e.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.e.getHint();
                this.g = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.G = true;
        }
        if (this.l != null) {
            D(this.e.getText().length());
        }
        G();
        this.i.e();
        this.c.bringToFront();
        this.d.bringToFront();
        this.f.bringToFront();
        this.aK.bringToFront();
        Iterator<OooOO0> it = this.ae.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
        I();
        M();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        H(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.aK.setVisibility(z ? 0 : 8);
        this.f.setVisibility(z ? 8 : 0);
        M();
        if (t()) {
            return;
        }
        A();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        ivas.gov.bisp.enumeration.P.h hVar = this.ao;
        if (charSequence == null || !TextUtils.equals(hVar.v, charSequence)) {
            hVar.v = charSequence;
            hVar.B = null;
            Bitmap bitmap = hVar.C;
            if (bitmap != null) {
                bitmap.recycle();
                hVar.C = null;
            }
            hVar.m();
        }
        if (this.an) {
            return;
        }
        x();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.p == z) {
            return;
        }
        if (z) {
            o000OOo o000ooo = new o000OOo(getContext(), null);
            this.r = o000ooo;
            o000ooo.setId(R.id.textinput_placeholder);
            u uVar = new u();
            uVar.i = 87L;
            TimeInterpolator timeInterpolator = ivas.gov.bisp.enumeration.T.j.c;
            uVar.k = timeInterpolator;
            this.v = uVar;
            uVar.h = 67L;
            u uVar2 = new u();
            uVar2.i = 87L;
            uVar2.k = timeInterpolator;
            this.w = uVar2;
            TextView textView = this.r;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aXa.f(textView, 1);
            setPlaceholderTextAppearance(this.t);
            setPlaceholderTextColor(this.u);
            TextView textView2 = this.r;
            if (textView2 != null) {
                this.b.addView(textView2);
                this.r.setVisibility(0);
            }
        } else {
            TextView textView3 = this.r;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            this.r = null;
        }
        this.p = z;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    public final boolean A() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.x == null) && this.c.getMeasuredWidth() > 0) {
            int measuredWidth = this.c.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.ab == null || this.ac != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ab = colorDrawable;
                this.ac = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ab;
            if (drawable != drawable2) {
                this.e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.ab != null) {
            Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.ab = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.aK.getVisibility() == 0 || ((t() && w()) || this.B != null)) && this.d.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.A.getMeasuredWidth() - this.e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.av;
            if (drawable3 == null || this.aw == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.av = colorDrawable2;
                    this.aw = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.av;
                if (drawable4 != drawable5) {
                    this.ax = drawable4;
                    this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.aw = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.av, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.av == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.av) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.ax, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.av = null;
        }
        return z2;
    }

    public final void B() {
        if (this.l != null) {
            EditText editText = this.e;
            D(editText == null ? 0 : editText.getText().length());
        }
    }

    public void C(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        Context context = getContext();
        Object obj = ivas.gov.bisp.enumeration.p086i.l.c;
        textView.setTextColor(ivas.gov.bisp.enumeration.i.l.aUI.b(context, R.color.design_error));
    }

    public void D(int i) {
        boolean z = this.m;
        int i2 = this.k;
        if (i2 == -1) {
            this.l.setText(String.valueOf(i));
            this.l.setContentDescription(null);
            this.m = false;
        } else {
            this.m = i > i2;
            Context context = getContext();
            this.l.setContentDescription(context.getString(this.m ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.k)));
            if (z != this.m) {
                E();
            }
            am amVarE = am.e();
            TextView textView = this.l;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.k));
            textView.setText(string != null ? amVarE.f(string, amVarE.j, true).toString() : null);
        }
        if (this.e == null || z == this.m) {
            return;
        }
        H(false, false);
        O();
        G();
    }

    public final void E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.l;
        if (textView != null) {
            C(textView, this.m ? this.n : this.f38o);
            if (!this.m && (colorStateList2 = this.s) != null) {
                this.l.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.y) == null) {
                return;
            }
            this.l.setTextColor(colorStateList);
        }
    }

    public final void F() {
        if (this.K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int iQ = q();
            if (iQ != layoutParams.topMargin) {
                layoutParams.topMargin = iQ;
                this.b.requestLayout();
            }
        }
    }

    public void G() {
        Drawable background;
        TextView textView;
        EditText editText = this.e;
        if (editText == null || this.K != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (W.b(background)) {
            background = background.mutate();
        }
        if (this.i.i()) {
            background.setColorFilter(P.d(this.i.j(), PorterDuff.Mode.SRC_IN));
        } else if (this.m && (textView = this.l) != null) {
            background.setColorFilter(P.d(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void H(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zI = this.i.i();
        ColorStateList colorStateList2 = this.az;
        if (colorStateList2 != null) {
            ivas.gov.bisp.enumeration.P.h hVar = this.ao;
            if (hVar.p != colorStateList2) {
                hVar.p = colorStateList2;
                hVar.m();
            }
            ivas.gov.bisp.enumeration.P.h hVar2 = this.ao;
            ColorStateList colorStateList3 = this.az;
            if (hVar2.n != colorStateList3) {
                hVar2.n = colorStateList3;
                hVar2.m();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.az;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.am) : this.am;
            this.ao.n(ColorStateList.valueOf(colorForState));
            ivas.gov.bisp.enumeration.P.h hVar3 = this.ao;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (hVar3.n != colorStateListValueOf) {
                hVar3.n = colorStateListValueOf;
                hVar3.m();
            }
        } else if (zI) {
            ivas.gov.bisp.enumeration.P.h hVar4 = this.ao;
            TextView textView2 = this.i.n;
            hVar4.n(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.m && (textView = this.l) != null) {
            this.ao.n(textView.getTextColors());
        } else if (z4 && (colorStateList = this.aH) != null) {
            ivas.gov.bisp.enumeration.P.h hVar5 = this.ao;
            if (hVar5.p != colorStateList) {
                hVar5.p = colorStateList;
                hVar5.m();
            }
        }
        if (z3 || !this.al || (isEnabled() && z4)) {
            if (z2 || this.an) {
                ValueAnimator valueAnimator = this.ap;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.ap.cancel();
                }
                if (z && this.aq) {
                    l(1.0f);
                } else {
                    this.ao.o(1.0f);
                }
                this.an = false;
                if (r()) {
                    x();
                }
                EditText editText3 = this.e;
                J(editText3 != null ? editText3.getText().length() : 0);
                K();
                N();
                return;
            }
            return;
        }
        if (z2 || !this.an) {
            ValueAnimator valueAnimator2 = this.ap;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.ap.cancel();
            }
            if (z && this.aq) {
                l(0.0f);
            } else {
                this.ao.o(0.0f);
            }
            if (r() && (!((C0027p) this.H).B.isEmpty()) && r()) {
                ((C0027p) this.H).B(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.an = true;
            u();
            K();
            N();
        }
    }

    public final void I() {
        int iG;
        if (this.e == null) {
            return;
        }
        if (this.au.getVisibility() == 0) {
            iG = 0;
        } else {
            EditText editText = this.e;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            iG = T.aWY.g(editText);
        }
        TextView textView = this.z;
        int compoundPaddingTop = this.e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.e.getCompoundPaddingBottom();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
        T.aWY.l(textView, iG, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void J(int i) {
        if (i != 0 || this.an) {
            u();
            return;
        }
        TextView textView = this.r;
        if (textView == null || !this.p) {
            return;
        }
        textView.setText(this.q);
        C0073m.b(this.b, this.v);
        this.r.setVisibility(0);
        this.r.bringToFront();
    }

    public final void K() {
        this.z.setVisibility((this.x == null || this.an) ? 8 : 0);
        A();
    }

    public final void L(boolean z, boolean z2) {
        int defaultColor = this.aF.getDefaultColor();
        int colorForState = this.aF.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.aF.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.E = colorForState2;
        } else if (z2) {
            this.E = colorForState;
        } else {
            this.E = defaultColor;
        }
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        int iH = 0;
        if (!w() && this.aK.getVisibility() != 0) {
            EditText editText = this.e;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            iH = T.aWY.h(editText);
        }
        TextView textView = this.A;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.e.getPaddingTop();
        int paddingBottom = this.e.getPaddingBottom();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
        T.aWY.l(textView, dimensionPixelSize, paddingTop, iH, paddingBottom);
    }

    public final void N() {
        int visibility = this.A.getVisibility();
        boolean z = (this.B == null || this.an) ? false : true;
        this.A.setVisibility(z ? 0 : 8);
        if (visibility != this.A.getVisibility()) {
            getEndIconDelegate().e(z);
        }
        A();
    }

    public void O() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.H == null || this.K == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.E = this.am;
        } else if (this.i.i()) {
            if (this.aF != null) {
                L(z2, z3);
            } else {
                this.E = this.i.j();
            }
        } else if (!this.m || (textView = this.l) == null) {
            if (z2) {
                this.E = this.aE;
            } else if (z3) {
                this.E = this.aJ;
            } else {
                this.E = this.aI;
            }
        } else if (this.aF != null) {
            L(z2, z3);
        } else {
            this.E = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null) {
            a aVar = this.i;
            if (aVar.m && aVar.i()) {
                z = true;
            }
        }
        setErrorIconVisible(z);
        y(this.aK, this.aA);
        y(this.au, this.U);
        z();
        l endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof c) {
            if (!this.i.i() || getEndIconDrawable() == null) {
                n();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                drawableMutate.setTint(this.i.j());
                this.ai.setImageDrawable(drawableMutate);
            }
        }
        int i = this.L;
        if (z2 && isEnabled()) {
            this.L = this.O;
        } else {
            this.L = this.N;
        }
        if (this.L != i && this.K == 2 && r() && !this.an) {
            if (r()) {
                ((C0027p) this.H).B(0.0f, 0.0f, 0.0f, 0.0f);
            }
            x();
        }
        if (this.K == 1) {
            if (!isEnabled()) {
                this.R = this.aL;
            } else if (z3 && !z2) {
                this.R = this.at;
            } else if (z2) {
                this.R = this.aC;
            } else {
                this.R = this.aD;
            }
        }
        m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.b.addView(view, layoutParams2);
        this.b.setLayoutParams(layoutParams);
        F();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(IMediaSession.Stub.TRANSACTION_sendCustomAction)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.g != null) {
            boolean z = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.G = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.b.getChildCount());
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            View childAt = this.b.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.as = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.as = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C) {
            ivas.gov.bisp.enumeration.P.h hVar = this.ao;
            Objects.requireNonNull(hVar);
            int iSave = canvas.save();
            if (hVar.B != null && hVar.e) {
                hVar.R.getLineLeft(0);
                hVar.J.setTextSize(hVar.D);
                float f = hVar.s;
                float f2 = hVar.u;
                float f3 = hVar.E;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                hVar.R.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        C0019p c0019p = this.I;
        if (c0019p != null) {
            Rect bounds = c0019p.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.I.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.ar) {
            return;
        }
        this.ar = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ivas.gov.bisp.enumeration.P.h hVar = this.ao;
        if (hVar != null) {
            hVar.F = drawableState;
            ColorStateList colorStateList2 = hVar.p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = hVar.n) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                hVar.m();
                z = true;
            }
        } else {
            z = false;
        }
        if (this.e != null) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            H(T.aXa.d(this) && isEnabled(), false);
        }
        G();
        O();
        if (z) {
            invalidate();
        }
        this.ar = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return q() + getPaddingTop() + baseline;
    }

    public C0019p getBoxBackground() {
        int i = this.K;
        if (i == 1 || i == 2) {
            return this.H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.R;
    }

    public int getBoxBackgroundMode() {
        return this.K;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.M;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C0019p c0019p = this.H;
        return c0019p.e.d.l.b(c0019p.e());
    }

    public float getBoxCornerRadiusBottomStart() {
        C0019p c0019p = this.H;
        return c0019p.e.d.k.b(c0019p.e());
    }

    public float getBoxCornerRadiusTopEnd() {
        C0019p c0019p = this.H;
        return c0019p.e.d.i.b(c0019p.e());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.H.q();
    }

    public int getBoxStrokeColor() {
        return this.aE;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.aF;
    }

    public int getBoxStrokeWidth() {
        return this.N;
    }

    public int getBoxStrokeWidthFocused() {
        return this.O;
    }

    public int getCounterMaxLength() {
        return this.k;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.j && this.m && (textView = this.l) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.s;
    }

    public ColorStateList getCounterTextColor() {
        return this.s;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.az;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.ai.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.ai.getDrawable();
    }

    public int getEndIconMode() {
        return this.af;
    }

    public CheckableImageButton getEndIconView() {
        return this.ai;
    }

    public CharSequence getError() {
        a aVar = this.i;
        if (aVar.m) {
            return aVar.l;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.i.p;
    }

    public int getErrorCurrentTextColors() {
        return this.i.j();
    }

    public Drawable getErrorIconDrawable() {
        return this.aK.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.i.j();
    }

    public CharSequence getHelperText() {
        a aVar = this.i;
        if (aVar.t) {
            return aVar.r;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.i.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.ao.k();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.ao.j();
    }

    public ColorStateList getHintTextColor() {
        return this.aH;
    }

    public int getMaxWidth() {
        return this.a;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.ai.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.ai.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.p) {
            return this.q;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.x;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.au.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.au.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A;
    }

    public Typeface getTypeface() {
        return this.T;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + i;
        return (this.x == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    public void k(OooOO0 oooOO0) {
        this.ae.add(oooOO0);
        if (this.e != null) {
            oooOO0.b(this);
        }
    }

    public void l(float f) {
        if (this.ao.f == f) {
            return;
        }
        if (this.ap == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.ap = valueAnimator;
            valueAnimator.setInterpolator(ivas.gov.bisp.enumeration.T.j.d);
            this.ap.setDuration(167L);
            this.ap.addUpdateListener(new OooO0o());
        }
        this.ap.setFloatValues(this.ao.f, f);
        this.ap.start();
    }

    public final void m() {
        int i;
        int i2;
        int i3;
        C0019p c0019p = this.H;
        if (c0019p == null) {
            return;
        }
        c0019p.setShapeAppearanceModel(this.F);
        if (this.K == 2 && (i2 = this.L) >= 0 && (i3 = this.E) != 0) {
            this.H.v(i2, i3);
        }
        int iC = this.R;
        if (this.K == 1) {
            iC = ivas.gov.bisp.enumeration.p007ag.j.c(this.R, r.t(getContext(), R.attr.colorSurface, 0));
        }
        this.R = iC;
        this.H.u(ColorStateList.valueOf(iC));
        if (this.af == 3) {
            this.e.getBackground().invalidateSelf();
        }
        C0019p c0019p2 = this.I;
        if (c0019p2 != null) {
            if (this.L >= 0 && (i = this.E) != 0) {
                c0019p2.u(ColorStateList.valueOf(i));
            }
            invalidate();
        }
        invalidate();
    }

    public final void n() {
        p(this.ai, this.ak, this.aj, this.aM, this.aG);
    }

    public final void o() {
        p(this.au, this.V, this.U, this.aa, this.W);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.Q;
            ivas.gov.bisp.enumeration.P.r.b(this, editText, rect);
            C0019p c0019p = this.I;
            if (c0019p != null) {
                int i5 = rect.bottom;
                c0019p.setBounds(rect.left, i5 - this.O, rect.right, i5);
            }
            if (this.C) {
                ivas.gov.bisp.enumeration.P.h hVar = this.ao;
                float textSize = this.e.getTextSize();
                if (hVar.l != textSize) {
                    hVar.l = textSize;
                    hVar.m();
                }
                int gravity = this.e.getGravity();
                this.ao.p((gravity & (-113)) | 48);
                ivas.gov.bisp.enumeration.P.h hVar2 = this.ao;
                if (hVar2.k != gravity) {
                    hVar2.k = gravity;
                    hVar2.m();
                }
                ivas.gov.bisp.enumeration.P.h hVar3 = this.ao;
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.S;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                boolean z2 = T.aWY.f(this) == 1;
                rect2.bottom = rect.bottom;
                int i6 = this.K;
                if (i6 == 1) {
                    rect2.left = j(rect.left, z2);
                    rect2.top = rect.top + this.M;
                    rect2.right = s(rect.right, z2);
                } else if (i6 != 2) {
                    rect2.left = j(rect.left, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = s(rect.right, z2);
                } else {
                    rect2.left = this.e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - q();
                    rect2.right = rect.right - this.e.getPaddingRight();
                }
                Objects.requireNonNull(hVar3);
                int i7 = rect2.left;
                int i8 = rect2.top;
                int i9 = rect2.right;
                int i10 = rect2.bottom;
                if (!ivas.gov.bisp.enumeration.P.h.e(hVar3.h, i7, i8, i9, i10)) {
                    hVar3.h.set(i7, i8, i9, i10);
                    hVar3.G = true;
                    hVar3.f();
                }
                ivas.gov.bisp.enumeration.P.h hVar4 = this.ao;
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.S;
                TextPaint textPaint = hVar4.K;
                textPaint.setTextSize(hVar4.l);
                textPaint.setTypeface(hVar4.w);
                textPaint.setLetterSpacing(0.0f);
                float f = -hVar4.K.ascent();
                rect3.left = this.e.getCompoundPaddingLeft() + rect.left;
                rect3.top = (this.K != 1 || this.e.getMinLines() > 1) ? rect.top + this.e.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect3.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.K != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect3.top + f);
                rect3.bottom = compoundPaddingBottom;
                int i11 = rect3.left;
                int i12 = rect3.top;
                int i13 = rect3.right;
                if (!ivas.gov.bisp.enumeration.P.h.e(hVar4.i, i11, i12, i13, compoundPaddingBottom)) {
                    hVar4.i.set(i11, i12, i13, compoundPaddingBottom);
                    hVar4.G = true;
                    hVar4.f();
                }
                this.ao.m();
                if (!r() || this.an) {
                    return;
                }
                x();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        if (this.e == null || this.e.getMeasuredHeight() >= (iMax = Math.max(this.d.getMeasuredHeight(), this.c.getMeasuredHeight()))) {
            z = false;
        } else {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zA = A();
        if (z || zA) {
            this.e.post(new OooO0OO());
        }
        if (this.r != null && (editText = this.e) != null) {
            this.r.setGravity(editText.getGravity());
            this.r.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        I();
        M();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooOOO0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) parcelable;
        super.onRestoreInstanceState(oooOOO0.e);
        setError(oooOOO0.b);
        if (oooOOO0.f) {
            this.ai.post(new OooO0O0());
        }
        setHint(oooOOO0.c);
        setHelperText(oooOOO0.g);
        setPlaceholderText(oooOOO0.h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        OooOOO0 oooOOO0 = new OooOOO0(super.onSaveInstanceState());
        if (this.i.i()) {
            oooOOO0.b = getError();
        }
        oooOOO0.f = t() && this.ai.isChecked();
        oooOOO0.c = getHint();
        oooOOO0.g = getHelperText();
        oooOOO0.h = getPlaceholderText();
        return oooOOO0;
    }

    public final void p(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final int q() {
        float fK;
        if (!this.C) {
            return 0;
        }
        int i = this.K;
        if (i == 0 || i == 1) {
            fK = this.ao.k();
        } else {
            if (i != 2) {
                return 0;
            }
            fK = this.ao.k() / 2.0f;
        }
        return (int) fK;
    }

    public final boolean r() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.H instanceof C0027p);
    }

    public final int s(int i, boolean z) {
        int compoundPaddingRight = i - this.e.getCompoundPaddingRight();
        return (this.x == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.z.getMeasuredWidth() - this.z.getPaddingRight());
    }

    public void setBoxBackgroundColor(int i) {
        if (this.R != i) {
            this.R = i;
            this.aD = i;
            this.aC = i;
            this.at = i;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = ivas.gov.bisp.enumeration.p086i.l.c;
        setBoxBackgroundColor(ivas.gov.bisp.enumeration.i.l.aUI.b(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.aD = defaultColor;
        this.R = defaultColor;
        this.aL = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.aC = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.at = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.K) {
            return;
        }
        this.K = i;
        if (this.e != null) {
            v();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.M = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.aE != i) {
            this.aE = i;
            O();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.aI = colorStateList.getDefaultColor();
            this.am = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.aJ = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.aE = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.aE != colorStateList.getDefaultColor()) {
            this.aE = colorStateList.getDefaultColor();
        }
        O();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.aF != colorStateList) {
            this.aF = colorStateList;
            O();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.N = i;
        O();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.O = i;
        O();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.j != z) {
            if (z) {
                o000OOo o000ooo = new o000OOo(getContext(), null);
                this.l = o000ooo;
                o000ooo.setId(R.id.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.l.setTypeface(typeface);
                }
                this.l.setMaxLines(1);
                this.i.d(this.l, 2);
                ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                E();
                B();
            } else {
                this.i.l(this.l, 2);
                this.l = null;
            }
            this.j = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.k != i) {
            if (i > 0) {
                this.k = i;
            } else {
                this.k = -1;
            }
            if (this.j) {
                B();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.n != i) {
            this.n = i;
            E();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            E();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f38o != i) {
            this.f38o = i;
            E();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            E();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.az = colorStateList;
        this.aH = colorStateList;
        if (this.e != null) {
            H(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        b(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.ai.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.ai.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? A.c(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.af;
        this.af = i;
        Iterator<OooOO0O> it = this.ah.iterator();
        while (it.hasNext()) {
            it.next().b(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().d(this.K)) {
            getEndIconDelegate().c();
            n();
        } else {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("The current box background mode ");
            sbW.append(this.K);
            sbW.append(" is not supported by the end icon mode ");
            sbW.append(i);
            throw new IllegalStateException(sbW.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.ai;
        View.OnLongClickListener onLongClickListener = this.ay;
        checkableImageButton.setOnClickListener(onClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ay = onLongClickListener;
        CheckableImageButton checkableImageButton = this.ai;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.aj != colorStateList) {
            this.aj = colorStateList;
            this.ak = true;
            n();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.aG != mode) {
            this.aG = mode;
            this.aM = true;
            n();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (w() != z) {
            this.ai.setVisibility(z ? 0 : 8);
            M();
            A();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.i.m) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.i.c();
            return;
        }
        a aVar = this.i;
        aVar.f();
        aVar.l = charSequence;
        aVar.n.setText(charSequence);
        int i = aVar.k;
        if (i != 1) {
            aVar.c = 1;
        }
        aVar.n(i, aVar.c, aVar.m(aVar.n, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        a aVar = this.i;
        aVar.p = charSequence;
        TextView textView = aVar.n;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        a aVar = this.i;
        if (aVar.m != z) {
            aVar.f();
            if (z) {
                o000OOo o000ooo = new o000OOo(aVar.d, null);
                aVar.n = o000ooo;
                o000ooo.setId(R.id.textinput_error);
                aVar.n.setTextAlignment(5);
                Typeface typeface = aVar.v;
                if (typeface != null) {
                    aVar.n.setTypeface(typeface);
                }
                int i = aVar.f52o;
                aVar.f52o = i;
                TextView textView = aVar.n;
                if (textView != null) {
                    aVar.e.C(textView, i);
                }
                ColorStateList colorStateList = aVar.q;
                aVar.q = colorStateList;
                TextView textView2 = aVar.n;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = aVar.p;
                aVar.p = charSequence;
                TextView textView3 = aVar.n;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                aVar.n.setVisibility(4);
                TextView textView4 = aVar.n;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXa.f(textView4, 1);
                aVar.d(aVar.n, 0);
            } else {
                aVar.c();
                aVar.l(aVar.n, 0);
                aVar.n = null;
                aVar.e.G();
                aVar.e.O();
            }
            aVar.m = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? A.c(getContext(), i) : null);
        y(this.aK, this.aA);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.aK;
        View.OnLongClickListener onLongClickListener = this.aB;
        checkableImageButton.setOnClickListener(onClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.aB = onLongClickListener;
        CheckableImageButton checkableImageButton = this.aK;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.aA = colorStateList;
        Drawable drawable = this.aK.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.aK.getDrawable() != drawable) {
            this.aK.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.aK.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.aK.getDrawable() != drawable) {
            this.aK.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        a aVar = this.i;
        aVar.f52o = i;
        TextView textView = aVar.n;
        if (textView != null) {
            aVar.e.C(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        a aVar = this.i;
        aVar.q = colorStateList;
        TextView textView = aVar.n;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.al != z) {
            this.al = z;
            H(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.i.t) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.i.t) {
            setHelperTextEnabled(true);
        }
        a aVar = this.i;
        aVar.f();
        aVar.r = charSequence;
        aVar.s.setText(charSequence);
        int i = aVar.k;
        if (i != 2) {
            aVar.c = 2;
        }
        aVar.n(i, aVar.c, aVar.m(aVar.s, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        a aVar = this.i;
        aVar.w = colorStateList;
        TextView textView = aVar.s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        a aVar = this.i;
        if (aVar.t != z) {
            aVar.f();
            if (z) {
                o000OOo o000ooo = new o000OOo(aVar.d, null);
                aVar.s = o000ooo;
                o000ooo.setId(R.id.textinput_helper_text);
                aVar.s.setTextAlignment(5);
                Typeface typeface = aVar.v;
                if (typeface != null) {
                    aVar.s.setTypeface(typeface);
                }
                aVar.s.setVisibility(4);
                TextView textView = aVar.s;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXa.f(textView, 1);
                int i = aVar.u;
                aVar.u = i;
                TextView textView2 = aVar.s;
                if (textView2 != null) {
                    textView2.setTextAppearance(i);
                }
                ColorStateList colorStateList = aVar.w;
                aVar.w = colorStateList;
                TextView textView3 = aVar.s;
                if (textView3 != null && colorStateList != null) {
                    textView3.setTextColor(colorStateList);
                }
                aVar.d(aVar.s, 1);
            } else {
                aVar.f();
                int i2 = aVar.k;
                if (i2 == 2) {
                    aVar.c = 0;
                }
                aVar.n(i2, aVar.c, aVar.m(aVar.s, null));
                aVar.l(aVar.s, 1);
                aVar.s = null;
                aVar.e.G();
                aVar.e.O();
            }
            aVar.t = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        a aVar = this.i;
        aVar.u = i;
        TextView textView = aVar.s;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.aq = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.G = true;
            } else {
                this.G = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                F();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        ivas.gov.bisp.enumeration.P.h hVar = this.ao;
        ivas.gov.bisp.enumeration.aL.r rVar = new ivas.gov.bisp.enumeration.aL.r(hVar.d.getContext(), i);
        ColorStateList colorStateList = rVar.l;
        if (colorStateList != null) {
            hVar.p = colorStateList;
        }
        float f = rVar.m;
        if (f != 0.0f) {
            hVar.m = f;
        }
        ColorStateList colorStateList2 = rVar.d;
        if (colorStateList2 != null) {
            hVar.O = colorStateList2;
        }
        hVar.N = rVar.i;
        hVar.P = rVar.h;
        hVar.M = rVar.j;
        hVar.Q = rVar.c;
        ivas.gov.bisp.enumeration.aL.j jVar = hVar.z;
        if (jVar != null) {
            jVar.f = true;
        }
        ivas.gov.bisp.enumeration.P.c cVar = new ivas.gov.bisp.enumeration.P.c(hVar);
        rVar.c();
        hVar.z = new ivas.gov.bisp.enumeration.aL.j(cVar, rVar.f60o);
        rVar.e(hVar.d.getContext(), hVar.z);
        hVar.m();
        this.aH = this.ao.p;
        if (this.e != null) {
            H(false, false);
            F();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.aH != colorStateList) {
            if (this.az == null) {
                ivas.gov.bisp.enumeration.P.h hVar = this.ao;
                if (hVar.p != colorStateList) {
                    hVar.p = colorStateList;
                    hVar.m();
                }
            }
            this.aH = colorStateList;
            if (this.e != null) {
                H(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.a = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? A.c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.af != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.aj = colorStateList;
        this.ak = true;
        n();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.aG = mode;
        this.aM = true;
        n();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.p && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.p) {
                setPlaceholderTextEnabled(true);
            }
            this.q = charSequence;
        }
        EditText editText = this.e;
        J(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.t = i;
        TextView textView = this.r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.r;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        K();
    }

    public void setPrefixTextAppearance(int i) {
        this.z.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.au.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? A.c(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.au;
        View.OnLongClickListener onLongClickListener = this.ad;
        checkableImageButton.setOnClickListener(onClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ad = onLongClickListener;
        CheckableImageButton checkableImageButton = this.au;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            this.V = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.W != mode) {
            this.W = mode;
            this.aa = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.au.getVisibility() == 0) != z) {
            this.au.setVisibility(z ? 0 : 8);
            I();
            A();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        N();
    }

    public void setSuffixTextAppearance(int i) {
        this.A.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(OooO oooO) {
        EditText editText = this.e;
        if (editText != null) {
            T.q(editText, oooO);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.ao.r(typeface);
            a aVar = this.i;
            if (typeface != aVar.v) {
                aVar.v = typeface;
                TextView textView = aVar.n;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = aVar.s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.l;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final boolean t() {
        return this.af != 0;
    }

    public final void u() {
        TextView textView = this.r;
        if (textView == null || !this.p) {
            return;
        }
        textView.setText((CharSequence) null);
        C0073m.b(this.b, this.w);
        this.r.setVisibility(4);
    }

    public final void v() {
        int i = this.K;
        if (i == 0) {
            this.H = null;
            this.I = null;
        } else if (i == 1) {
            this.H = new C0019p(this.F);
            this.I = new C0019p();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.s(new StringBuilder(), this.K, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.C || (this.H instanceof C0027p)) {
                this.H = new C0019p(this.F);
            } else {
                this.H = new C0027p(this.F);
            }
            this.I = null;
        }
        EditText editText = this.e;
        if (editText != null && this.H != null && editText.getBackground() == null && this.K != 0) {
            EditText editText2 = this.e;
            C0019p c0019p = this.H;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.s(editText2, c0019p);
        }
        O();
        if (this.K == 1) {
            if (ivas.gov.bisp.enumeration.aL.h.f(getContext())) {
                this.M = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ivas.gov.bisp.enumeration.aL.h.e(getContext())) {
                this.M = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.e != null && this.K == 1) {
            if (ivas.gov.bisp.enumeration.aL.h.f(getContext())) {
                EditText editText3 = this.e;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                T.aWY.l(editText3, T.aWY.g(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), T.aWY.h(this.e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ivas.gov.bisp.enumeration.aL.h.e(getContext())) {
                EditText editText4 = this.e;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                T.aWY.l(editText4, T.aWY.g(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), T.aWY.h(this.e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.K != 0) {
            F();
        }
    }

    public boolean w() {
        return this.f.getVisibility() == 0 && this.ai.getVisibility() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    public final void x() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        if (r()) {
            RectF rectF = this.P;
            ivas.gov.bisp.enumeration.P.h hVar = this.ao;
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            boolean zG = hVar.g(hVar.v);
            hVar.A = zG;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    Rect rect = hVar.h;
                    if (zG) {
                        i = rect.left;
                        f3 = i;
                    } else {
                        f = rect.right;
                        f2 = hVar.H;
                    }
                } else {
                    Rect rect2 = hVar.h;
                    if (zG) {
                        f = rect2.right;
                        f2 = hVar.H;
                    } else {
                        i = rect2.left;
                        f3 = i;
                    }
                }
                rectF.left = f3;
                Rect rect3 = hVar.h;
                float f6 = rect3.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (hVar.H / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zG) {
                        f5 = hVar.H;
                        f4 = f5 + f3;
                    } else {
                        f4 = rect3.right;
                    }
                } else if (zG) {
                    f4 = rect3.right;
                } else {
                    f5 = hVar.H;
                    f4 = f5 + f3;
                }
                rectF.right = f4;
                rectF.bottom = hVar.k() + f6;
                float f7 = rectF.left;
                float f8 = this.J;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.L);
                C0027p c0027p = (C0027p) this.H;
                Objects.requireNonNull(c0027p);
                c0027p.B(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            f2 = hVar.H / 2.0f;
            f3 = f - f2;
            rectF.left = f3;
            Rect rect4 = hVar.h;
            float f9 = rect4.top;
            rectF.top = f9;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (hVar.H / 2.0f);
            } else {
                f4 = (width / 2.0f) + (hVar.H / 2.0f);
            }
            rectF.right = f4;
            rectF.bottom = hVar.k() + f9;
            float f10 = rectF.left;
            float f11 = this.J;
            rectF.left = f10 - f11;
            rectF.right += f11;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.L);
            C0027p c0027p2 = (C0027p) this.H;
            Objects.requireNonNull(c0027p2);
            c0027p2.B(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void y(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public void z() {
        y(this.ai, this.aj);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.ai.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.ai.setImageDrawable(drawable);
        if (drawable != null) {
            n();
            z();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.au.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.au.setImageDrawable(drawable);
        if (drawable != null) {
            o();
            setStartIconVisible(true);
            y(this.au, this.U);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.aK.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.i.m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.ai.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.ai.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
