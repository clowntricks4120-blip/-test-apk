package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import ivas.gov.bisp.enumeration.OooOOO0.o000oOoO;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import ivas.gov.bisp.enumeration.p097r.o;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o$OooO0o extends o000oOoO implements ActionMenuView.OooO00o {
    public final /* synthetic */ a a;

    public class aJs extends AbstractViewOnTouchListenerC0317n {
        public aJs(View view, a aVar) {
            super(view);
        }

        @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
        public o d() {
            a.aJt ajt = OooO00o$OooO0o.this.a.t;
            if (ajt == null) {
                return null;
            }
            return ajt.b();
        }

        @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
        public boolean e() {
            OooO00o$OooO0o.this.a.u();
            return true;
        }

        @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
        public boolean f() {
            a aVar = OooO00o$OooO0o.this.a;
            if (aVar.w != null) {
                return false;
            }
            aVar.m();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o$OooO0o(a aVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = aVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C0315d.b(this, getContentDescription());
        setOnTouchListener(new aJs(this, aVar));
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public boolean e() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.u();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
