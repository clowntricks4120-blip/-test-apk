package ivas.gov.bisp.enumeration.OooOOO0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import ivas.gov.bisp.enumeration.bM.V;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class o000000O extends ToggleButton {
    private static int a = 0;
    private static int b = 1;
    public final r c;
    public final C0322v d;
    public C0316l e;

    public o000000O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ad.b(this, getContext());
        r rVar = new r(this);
        this.c = rVar;
        rVar.g(attributeSet, R.attr.buttonStyleToggle);
        C0322v c0322v = new C0322v(this);
        this.d = c0322v;
        c0322v.i(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().c(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0316l getEmojiTextViewHelper() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.e == null) {
            this.e = new C0316l(this);
            int i6 = b;
            int i7 = i6 & 15;
            int i8 = (i7 - (~((i6 ^ 15) | i7))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        C0316l c0316l = this.e;
        int i10 = a;
        int i11 = (i10 | 3) << 1;
        int i12 = -(((~i10) & 3) | (i10 & (-4)));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 45 / 0;
        }
        return c0316l;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 15;
        int i4 = -(-((i2 & 15) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i8 = ((i6 & 24) + (i6 | 24)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            modeF = rVar.f();
            int i10 = a;
            int i11 = i10 & 41;
            int i12 = (i11 - (~((i10 ^ 41) | i11))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = i2 & 63;
            int i15 = (i2 | 63) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            modeF = null;
        }
        int i19 = b;
        int i20 = i19 & 17;
        int i21 = i20 + ((i19 ^ 17) | i20);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            return modeF;
        }
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 28) << 1) - (i2 ^ 28)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.k(colorStateList);
            int i4 = a;
            int i5 = i4 & 35;
            int i6 = -(-((i4 ^ 35) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 4;
            }
        }
        int i9 = a + 5;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 61;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 61)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i8 = ((i2 & 108) + (i2 | 108)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.c(mode);
            int i10 = a;
            int i11 = i10 & 111;
            int i12 = -(-((i10 ^ 111) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = ((i15 | 55) << 1) - (i15 ^ 55);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 25) + (i2 | 25);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i6 = i2 ^ 27;
            int i7 = ((i2 & 27) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            colorStateListE = rVar.e();
            int i11 = b + 125;
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = (i4 & 85) + (i4 | 85);
            a = i13 % 128;
            int i14 = i13 % 2;
            colorStateListE = null;
        }
        int i15 = a;
        int i16 = i15 & 33;
        int i17 = -(-((i15 ^ 33) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        return colorStateListE;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 91;
        int i4 = ((i2 & 91) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            super.setBackgroundDrawable(drawable);
            obj.hashCode();
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.c;
        if (rVar != null) {
            int i7 = a;
            int i8 = ((i7 & (-120)) | ((~i7) & 119)) + ((i7 & 119) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.i();
            int i10 = a + 59;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 5;
            }
        }
        int i12 = a + 39;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-70)) | ((~i3) & 69)) + ((i3 & 69) << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            super.setBackgroundResource(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setBackgroundResource(i);
        r rVar = this.c;
        if (rVar != null) {
            int i5 = b;
            int i6 = i5 ^ 105;
            int i7 = ((i5 & 105) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            rVar.h(i);
            int i11 = a;
            int i12 = ((i11 & 40) + (i11 | 40)) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 / 4;
            }
        }
        int i14 = b;
        int i15 = i14 ^ 91;
        int i16 = ((i14 & 91) | i15) << 1;
        int i17 = -i15;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 10 / 0;
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        int i3 = i2 % 2;
        getEmojiTextViewHelper().d.c.e(z);
        int i4 = a;
        int i5 = (i4 & 39) + (i4 | 39);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            int i8 = a;
            int i9 = ((i8 ^ 40) + ((i8 & 40) << 1)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            rVar.d();
            if (i10 == 0) {
                throw null;
            }
            int i11 = a + 95;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i13 = a;
            int i14 = i13 & 89;
            int i15 = (((i13 | 89) & (~i14)) - (~(i14 << 1))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            c0322v.f();
            int i17 = a + 69;
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b + 52;
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        V.bxH bxh;
        int i = 2 % 2;
        int i2 = a + 105;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            super.setAllCaps(z);
            bxh = getEmojiTextViewHelper().d.c;
            int i3 = 8 / 0;
        } else {
            super.setAllCaps(z);
            bxh = getEmojiTextViewHelper().d.c;
        }
        int i4 = a;
        int i5 = ((i4 | 19) << 1) - (i4 ^ 19);
        b = i5 % 128;
        int i6 = i5 % 2;
        bxh.d(z);
        if (i6 == 0) {
            throw null;
        }
        int i7 = b;
        int i8 = ((i7 | 93) << 1) - (i7 ^ 93);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 ^ 27) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        InputFilter[] inputFilterArrC = getEmojiTextViewHelper().d.c.c(inputFilterArr);
        int i7 = a;
        int i8 = (i7 ^ 87) + ((i7 & 87) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        super.setFilters(inputFilterArrC);
        int i10 = a + 87;
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
