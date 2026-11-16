package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ae;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;
import ivas.gov.bisp.enumeration.p089l.InterfaceC0325p;
import ivas.gov.bisp.enumeration.p089l.l;
import ivas.gov.bisp.enumeration.p089l.o;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0325p, o {
    public final r a;
    public final C0322v b;
    public C0316l c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0316l getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new C0316l(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.a;
        if (rVar != null) {
            rVar.d();
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.f();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0325p.a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            return Math.round(c0322v.c.l);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0325p.a) {
            return super.getAutoSizeMinTextSize();
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            return Math.round(c0322v.c.j);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0325p.a) {
            return super.getAutoSizeStepGranularity();
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            return Math.round(c0322v.c.i);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0325p.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0322v c0322v = this.b;
        return c0322v != null ? c0322v.c.k : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0325p.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            return c0322v.c.g;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return l.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.a;
        if (rVar != null) {
            return rVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.a;
        if (rVar != null) {
            return rVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ae aeVar = this.b.k;
        if (aeVar != null) {
            return aeVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ae aeVar = this.b.k;
        if (aeVar != null) {
            return aeVar.b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0322v c0322v = this.b;
        if (c0322v == null || InterfaceC0325p.a) {
            return;
        }
        c0322v.c.f();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0322v c0322v = this.b;
        if (c0322v == null || InterfaceC0325p.a || !c0322v.g()) {
            return;
        }
        this.b.c.f();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d.c.d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0325p.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0325p.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.d(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0325p.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.l(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.a;
        if (rVar != null) {
            rVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r rVar = this.a;
        if (rVar != null) {
            rVar.h(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d.c.e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().d.c.c(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.d.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.a;
        if (rVar != null) {
            rVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.a;
        if (rVar != null) {
            rVar.c(mode);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p089l.o
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.m(colorStateList);
        this.b.f();
    }

    @Override // ivas.gov.bisp.enumeration.p089l.o
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.n(mode);
        this.b.f();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0322v c0322v = this.b;
        if (c0322v != null) {
            c0322v.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0325p.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0322v c0322v = this.b;
        if (c0322v == null || z || c0322v.g()) {
            return;
        }
        c0322v.c.i(i, f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        ad.b(this, getContext());
        r rVar = new r(this);
        this.a = rVar;
        rVar.g(attributeSet, i);
        C0322v c0322v = new C0322v(this);
        this.b = c0322v;
        c0322v.i(attributeSet, i);
        c0322v.f();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
