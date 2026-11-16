package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.U.P;
import ivas.gov.bisp.enumeration.U.l;
import ivas.gov.bisp.enumeration.U.t;
import ivas.gov.bisp.enumeration.U.u;
import ivas.gov.bisp.enumeration.U.z;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c extends l {

    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.OooOO0O a;
    public final View.OnFocusChangeListener b;
    public final TextWatcher g;
    public final TextInputLayout.OooO h;
    public final TextInputLayout.OooOO0 i;
    public boolean j;
    public boolean k;
    public long l;
    public C0019p m;
    public StateListDrawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AccessibilityManager f39o;
    public ValueAnimator p;
    public ValueAnimator q;

    public class aOW implements TextInputLayout.OooOO0O {

        public class aOX implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public aOX(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(c.this.g);
            }
        }

        public aOW() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public void b(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new aOX(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == c.this.b) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    public class aOY extends ivas.gov.bisp.enumeration.P.l {

        public class aPa implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public aPa(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.a.isPopupShowing();
                c.f(c.this, zIsPopupShowing);
                c.this.j = zIsPopupShowing;
            }
        }

        public aOY() {
        }

        @Override // ivas.gov.bisp.enumeration.P.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewB = c.b(c.this.c.getEditText());
            if (c.this.f39o.isTouchExplorationEnabled() && c.g(autoCompleteTextViewB) && !c.this.e.hasFocus()) {
                autoCompleteTextViewB.dismissDropDown();
            }
            autoCompleteTextViewB.post(new aPa(autoCompleteTextViewB));
        }
    }

    public class aPb implements View.OnFocusChangeListener {
        public aPb() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            c.this.c.setEndIconActivated(z);
            if (z) {
                return;
            }
            c.f(c.this, false);
            c.this.j = false;
        }
    }

    public class aPc extends TextInputLayout.OooO {
        public aPc(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooO, ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            super.h(view, alVar);
            if (!c.g(c.this.c.getEditText())) {
                alVar.d.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT < 26) {
                Bundle bundleH = alVar.h();
                if (bundleH == null || (bundleH.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                    return;
                }
            } else if (!alVar.d.isShowingHintText()) {
                return;
            }
            alVar.m(null);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void j(View view, AccessibilityEvent accessibilityEvent) {
            this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewB = c.b(c.this.c.getEditText());
            if (accessibilityEvent.getEventType() == 1 && c.this.f39o.isTouchExplorationEnabled() && !c.g(c.this.c.getEditText())) {
                c.h(c.this, autoCompleteTextViewB);
            }
        }
    }

    public class aPd implements TextInputLayout.OooOO0 {
        public aPd() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public void b(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewB = c.b(textInputLayout.getEditText());
            c cVar = c.this;
            int boxBackgroundMode = cVar.c.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextViewB.setDropDownBackgroundDrawable(cVar.m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextViewB.setDropDownBackgroundDrawable(cVar.n);
            }
            c cVar2 = c.this;
            Objects.requireNonNull(cVar2);
            if (autoCompleteTextViewB.getKeyListener() == null) {
                int boxBackgroundMode2 = cVar2.c.getBoxBackgroundMode();
                C0019p boxBackground = cVar2.c.getBoxBackground();
                int iU = r.u(autoCompleteTextViewB, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iU2 = r.u(autoCompleteTextViewB, R.attr.colorSurface);
                    C0019p c0019p = new C0019p(boxBackground.e.d);
                    int iV = r.v(iU, iU2, 0.1f);
                    c0019p.u(new ColorStateList(iArr, new int[]{iV, 0}));
                    c0019p.setTint(iU2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iV, iU2});
                    C0019p c0019p2 = new C0019p(boxBackground.e.d);
                    c0019p2.setTint(-1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0019p, c0019p2), boxBackground});
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    T.aWX.s(autoCompleteTextViewB, layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = cVar2.c.getBoxBackgroundColor();
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{r.v(iU, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                    T.aWX.s(autoCompleteTextViewB, rippleDrawable);
                }
            }
            c cVar3 = c.this;
            Objects.requireNonNull(cVar3);
            autoCompleteTextViewB.setOnTouchListener(new P(cVar3, autoCompleteTextViewB));
            autoCompleteTextViewB.setOnFocusChangeListener(cVar3.b);
            autoCompleteTextViewB.setOnDismissListener(new t(cVar3));
            autoCompleteTextViewB.setThreshold(0);
            autoCompleteTextViewB.removeTextChangedListener(c.this.g);
            autoCompleteTextViewB.addTextChangedListener(c.this.g);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (autoCompleteTextViewB.getKeyListener() == null) {
                CheckableImageButton checkableImageButton = c.this.e;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                T.aWX.t(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(c.this.h);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class aPe implements View.OnClickListener {
        public aPe() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h(c.this, (AutoCompleteTextView) c.this.c.getEditText());
        }
    }

    public c(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.g = new aOY();
        this.b = new aPb();
        this.h = new aPc(this.c);
        this.i = new aPd();
        this.a = new aOW();
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView b(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void f(c cVar, boolean z) {
        if (cVar.k != z) {
            cVar.k = z;
            cVar.q.cancel();
            cVar.p.start();
        }
    }

    public static boolean g(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void h(c cVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(cVar);
        if (autoCompleteTextView != null) {
            if (cVar.i()) {
                cVar.j = false;
            }
            if (cVar.j) {
                cVar.j = false;
                return;
            }
            boolean z = cVar.k;
            boolean z2 = !z;
            if (z != z2) {
                cVar.k = z2;
                cVar.q.cancel();
                cVar.p.start();
            }
            if (!cVar.k) {
                autoCompleteTextView.dismissDropDown();
            } else {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void c() {
        float dimensionPixelOffset = this.d.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.d.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.d.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0019p c0019pL = l(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C0019p c0019pL2 = l(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = c0019pL;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.n = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, c0019pL);
        this.n.addState(new int[0], c0019pL2);
        int i = this.f;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        this.c.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.c;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.c.setEndIconOnClickListener(new aPe());
        this.c.k(this.i);
        this.c.ah.add(this.a);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = ivas.gov.bisp.enumeration.T.j.c;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(67L);
        valueAnimatorOfFloat.addUpdateListener(new z(this));
        this.q = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(50L);
        valueAnimatorOfFloat2.addUpdateListener(new z(this));
        this.p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new u(this));
        this.f39o = (AccessibilityManager) this.d.getSystemService("accessibility");
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public boolean d(int i) {
        return i != 0;
    }

    public final boolean i() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.l;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final C0019p l(float f, float f2, float f3, int i) {
        ivas.gov.bisp.enumeration.O.t.bfu bfuVar = new ivas.gov.bisp.enumeration.O.t.bfu();
        bfuVar.i(f);
        bfuVar.h(f);
        bfuVar.f(f2);
        bfuVar.g(f2);
        ivas.gov.bisp.enumeration.O.t tVarE = bfuVar.e();
        Context context = this.d;
        Paint paint = C0019p.c;
        int iD = ivas.gov.bisp.enumeration.aL.c.d(context, R.attr.colorSurface, C0019p.class.getSimpleName());
        C0019p c0019p = new C0019p();
        c0019p.e.e = new S(context);
        c0019p.w();
        c0019p.u(ColorStateList.valueOf(iD));
        C0019p.bfp bfpVar = c0019p.e;
        if (bfpVar.q != f3) {
            bfpVar.q = f3;
            c0019p.w();
        }
        c0019p.e.d = tVarE;
        c0019p.invalidateSelf();
        C0019p.bfp bfpVar2 = c0019p.e;
        if (bfpVar2.c == null) {
            bfpVar2.c = new Rect();
        }
        c0019p.e.c.set(0, i, 0, i);
        c0019p.invalidateSelf();
        return c0019p;
    }
}
