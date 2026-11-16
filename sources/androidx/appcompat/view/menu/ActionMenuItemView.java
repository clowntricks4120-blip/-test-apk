package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import ivas.gov.bisp.enumeration.OooOOO0.o000OOo;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import ivas.gov.bisp.enumeration.p097r.o;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends o000OOo implements m.aIE, View.OnClickListener, ActionMenuView.OooO00o {
    public CharSequence a;
    public u b;
    public Drawable i;
    public n.aIH j;
    public AbstractViewOnTouchListenerC0317n k;
    public boolean l;
    public OooO0O0 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3o;
    public int p;
    public int q;

    public class OooO00o extends AbstractViewOnTouchListenerC0317n {
        public OooO00o() {
            super(ActionMenuItemView.this);
        }

        @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
        public o d() {
            a.aJp ajp;
            OooO0O0 oooO0O0 = ActionMenuItemView.this.m;
            if (oooO0O0 == null || (ajp = a.this.v) == null) {
                return null;
            }
            return ajp.b();
        }

        @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
        public boolean e() {
            o oVarD;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            n.aIH aih = actionMenuItemView.j;
            return aih != null && aih.b(actionMenuItemView.b) && (oVarD = d()) != null && oVarD.e();
        }
    }

    public static abstract class OooO0O0 {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.l = i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f, 0, 0);
        this.f3o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public void d(u uVar, int i) {
        this.b = uVar;
        setIcon(uVar.getIcon());
        setTitle(uVar.getTitleCondensed());
        setId(uVar.b);
        setVisibility(uVar.isVisible() ? 0 : 8);
        setEnabled(uVar.isEnabled());
        if (uVar.hasSubMenu() && this.k == null) {
            this.k = new OooO00o();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean e() {
        return f() && this.b.getIcon() == null;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public u getItemData() {
        return this.b;
    }

    public final void h() {
        boolean z = (!TextUtils.isEmpty(this.a)) & (this.i == null || ((this.b.z & 4) == 4 && (this.l || this.n)));
        setText(z ? this.a : null);
        CharSequence charSequence = this.b.r;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z ? null : this.b.g);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.b.q;
        if (TextUtils.isEmpty(charSequence2)) {
            C0315d.b(this, z ? null : this.b.g);
        } else {
            C0315d.b(this, charSequence2);
        }
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n.aIH aih = this.j;
        if (aih != null) {
            aih.b(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = i();
        h();
    }

    @Override // ivas.gov.bisp.enumeration.OooOOO0.o000OOo, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zF = f();
        if (zF && (i3 = this.q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f3o) : this.f3o;
        if (mode != 1073741824 && this.f3o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zF || this.i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0317n abstractViewOnTouchListenerC0317n;
        if (this.b.hasSubMenu() && (abstractViewOnTouchListenerC0317n = this.k) != null && abstractViewOnTouchListenerC0317n.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.n != z) {
            this.n = z;
            u uVar = this.b;
            if (uVar != null) {
                n nVar = uVar.m;
                nVar.l = true;
                nVar.r(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(n.aIH aih) {
        this.j = aih;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(OooO0O0 oooO0O0) {
        this.m = oooO0O0;
    }

    public void setTitle(CharSequence charSequence) {
        this.a = charSequence;
        h();
    }
}
