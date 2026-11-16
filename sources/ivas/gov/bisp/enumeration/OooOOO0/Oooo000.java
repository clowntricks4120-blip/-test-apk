package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ae;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.o;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class Oooo000 extends ImageButton {
    private static int a = 0;
    private static int b = 1;
    public final r c;
    public final o d;
    public boolean e;

    public Oooo000(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    public PorterDuff.Mode getSupportImageTintMode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = (i3 - (~((i2 ^ 101) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        o oVar = this.d;
        PorterDuff.Mode mode = null;
        if (oVar != null) {
            int i7 = i5 + 83;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                ae aeVar = oVar.d;
                mode.hashCode();
                throw null;
            }
            ae aeVar2 = oVar.d;
            if (aeVar2 != null) {
                mode = aeVar2.b;
                int i8 = b;
                int i9 = i8 | 9;
                int i10 = i9 << 1;
                int i11 = -((~(i8 & 9)) & i9);
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = b;
                int i15 = i14 & 7;
                int i16 = -(-((i14 ^ 7) | i15));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            int i19 = b;
            int i110 = i19 & 7;
            int i111 = -(-((i19 ^ 7) | i110));
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            a = i112 % 128;
            int i113 = i112 % 2;
        }
        int i20 = b;
        int i21 = i20 ^ 85;
        int i22 = ((i20 & 85) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 & i23) + (i22 | i23);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 60 / 0;
        }
        return mode;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004e  */
    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        boolean z = true;
        int i4 = ((i2 ^ 89) | i3) << 1;
        int i5 = -((i2 | 89) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            boolean z2 = this.d.c.getBackground() instanceof RippleDrawable;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z3 = this.d.c.getBackground() instanceof RippleDrawable;
        int i7 = b;
        int i8 = i7 & 43;
        int i9 = (i7 ^ 43) | i8;
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        if ((((~(z3 ? 1 : 0)) & 1) ^ ((z3 ? 1 : 0) & (-2))) != 0) {
            int i12 = (i7 & 123) + (i7 | 123);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (!super.hasOverlappingRendering()) {
                int i14 = a;
                int i15 = (((i14 | 87) << 1) - (~(-(((~i14) & 87) | (i14 & (-88)))))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                z = false;
            }
        } else {
            int i17 = a;
            int i18 = (((i17 | 87) << 1) - (~(-(((~i17) & 87) | (i17 & (-88)))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
            z = false;
        }
        int i20 = a;
        int i21 = i20 & 71;
        int i22 = -(-((i20 ^ 71) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        return z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 81;
        int i5 = (i3 ^ 81) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.d.e(i);
        int i8 = a + 47;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 ivas.gov.bisp.enumeration.k.o) = (r4v1 ivas.gov.bisp.enumeration.k.o), (r4v12 ivas.gov.bisp.enumeration.k.o) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        o oVar;
        int i = 2 % 2;
        int i2 = a + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            super.setImageURI(uri);
            oVar = this.d;
            int i3 = 51 / 0;
            if (oVar != null) {
                oVar.c();
                int i4 = a;
                int i5 = i4 & 15;
                int i6 = i5 + ((i4 ^ 15) | i5);
                b = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            super.setImageURI(uri);
            oVar = this.d;
            if (oVar != null) {
                oVar.c();
                int i8 = a;
                int i9 = i8 & 15;
                int i10 = i9 + ((i8 ^ 15) | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = a;
        int i13 = i12 & 21;
        int i14 = (i12 ^ 21) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 19) | (i2 & 19)) << 1;
        int i4 = -(((~i2) & 19) | (i2 & (-20)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.c;
        if (i6 == 0) {
            int i7 = 14 / 0;
            if (rVar != null) {
                rVar.c(mode);
                int i8 = b + 105;
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if (rVar != null) {
            rVar.c(mode);
            int i10 = b + 105;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = ((i12 ^ 68) + ((i12 & 68) << 1)) - 1;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        o oVar = this.d;
        if (oVar != null) {
            int i8 = (i6 & 119) + (i6 | 119);
            a = i8 % 128;
            int i9 = i8 % 2;
            oVar.f(colorStateList);
            int i10 = a;
            int i11 = (i10 & (-26)) | ((~i10) & 25);
            int i12 = (i10 & 25) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = (i15 | 87) << 1;
        int i17 = -(((~i15) & 87) | (i15 & (-88)));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i2 ^ 25) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        o oVar = this.d;
        if (oVar != null) {
            int i8 = (i6 & (-64)) | ((~i6) & 63);
            int i9 = (i6 & 63) << 1;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            oVar.g(mode);
            if (i11 != 0) {
                throw null;
            }
            int i12 = a;
            int i13 = i12 | 25;
            int i14 = i13 << 1;
            int i15 = -((~(i12 & 25)) & i13);
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b + 125;
        a = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        this.e = false;
        ad.b(this, getContext());
        r rVar = new r(this);
        this.c = rVar;
        rVar.g(attributeSet, i);
        o oVar = new o(this);
        this.d = oVar;
        oVar.d(attributeSet, i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a + 35;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        r rVar = this.c;
        Object obj = null;
        if (rVar != null) {
            int i5 = ((i3 & (-72)) | ((~i3) & 71)) + ((i3 & 71) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            colorStateListE = rVar.e();
            if (i6 != 0) {
                int i7 = 60 / 0;
            }
        } else {
            int i8 = i3 & 95;
            int i9 = i8 + ((i3 ^ 95) | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            colorStateListE = null;
        }
        int i11 = a;
        int i12 = i11 & 59;
        int i13 = ((((i11 ^ 59) | i12) << 1) - (~(-((i11 | 59) & (~i12))))) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return colorStateListE;
        }
        obj.hashCode();
        throw null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - ((i2 & (-92)) | ((~i2) & 91));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        r rVar = this.c;
        Object obj = null;
        if (rVar != null) {
            int i6 = (i4 & (-96)) | ((~i4) & 95);
            int i7 = -(-((i4 & 95) << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            modeF = rVar.f();
            int i10 = b;
            int i11 = ((i10 ^ 54) + ((i10 & 54) << 1)) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = ((i2 ^ 72) + ((i2 & 72) << 1)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            modeF = null;
        }
        int i15 = b;
        int i16 = (((i15 | 114) << 1) - (i15 ^ 114)) - 1;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return modeF;
        }
        obj.hashCode();
        throw null;
    }

    public ColorStateList getSupportImageTintList() {
        ColorStateList colorStateList;
        ae aeVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = -(-(i2 | 31));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        o oVar = this.d;
        if (oVar == null || (aeVar = oVar.d) == null) {
            int i6 = a;
            int i7 = (i6 ^ 11) + ((i6 & 11) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            colorStateList = null;
        } else {
            int i9 = a;
            int i10 = i9 & 23;
            int i11 = (i9 | 23) & (~i10);
            int i12 = i10 << 1;
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                ColorStateList colorStateList2 = aeVar.a;
                obj.hashCode();
                throw null;
            }
            colorStateList = aeVar.a;
        }
        int i14 = a;
        int i15 = ((i14 ^ 68) + ((i14 & 68) << 1)) - 1;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return colorStateList;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 68) ^ (-1));
        a = i2 % 128;
        if (i2 % 2 != 0) {
            super.setBackgroundDrawable(drawable);
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.c;
        if (rVar != null) {
            int i3 = a;
            int i4 = (((i3 & (-110)) | ((~i3) & 109)) - (~(-(-((i3 & 109) << 1))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            rVar.i();
            if (i5 == 0) {
                throw null;
            }
        }
        int i6 = a;
        int i7 = i6 & 101;
        int i8 = ((i6 ^ 101) | i7) << 1;
        int i9 = -((i6 | 101) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 38 / 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 19;
        a = i3 % 128;
        int i4 = i3 % 2;
        super.setBackgroundResource(i);
        r rVar = this.c;
        if (rVar != null) {
            int i5 = a;
            int i6 = ((i5 ^ 89) - (~(-(-((i5 & 89) << 1))))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                rVar.h(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            rVar.h(i);
            int i7 = a + 51;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = a;
        int i10 = i9 | 87;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & 87)) & i10);
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 & 20) + (i3 | 20)) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        super.setImageLevel(i);
        this.e = true;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = ((~i3) & (i2 | 11)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        r rVar = this.c;
        Object obj = null;
        if (rVar != null) {
            int i6 = i2 & 9;
            int i7 = -(-((i2 ^ 9) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.k(colorStateList);
            if (i9 == 0) {
                obj.hashCode();
                throw null;
            }
            int i10 = b;
            int i11 = i10 | 51;
            int i12 = (i11 << 1) - ((~(i10 & 51)) & i11);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = i14 & 51;
        int i16 = (i15 - (~(-(-((i14 ^ 51) | i15))))) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = (i3 - (~((i2 ^ 39) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            int i6 = a;
            int i7 = i6 & 57;
            int i8 = i7 + ((i6 ^ 57) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                rVar.d();
                throw null;
            }
            rVar.d();
            int i9 = a;
            int i10 = i9 & 9;
            int i11 = (i9 ^ 9) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        o oVar = this.d;
        if (oVar != null) {
            int i14 = a + 9;
            b = i14 % 128;
            int i15 = i14 % 2;
            oVar.c();
            int i16 = a;
            int i17 = i16 ^ 9;
            int i18 = ((i16 & 9) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b + 115;
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = a + 35;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            super.setImageBitmap(bitmap);
            throw null;
        }
        super.setImageBitmap(bitmap);
        o oVar = this.d;
        if (oVar != null) {
            oVar.c();
            int i3 = b;
            int i4 = i3 ^ 11;
            int i5 = ((i3 & 11) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b + 12;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 83) << 1;
        int i4 = -(i2 ^ 83);
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        o oVar = this.d;
        if (oVar != null && drawable != null) {
            int i6 = i2 + 80;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (!this.e) {
                int i9 = (-2) - ((i2 + 52) ^ (-1));
                a = i9 % 128;
                int i10 = i9 % 2;
                oVar.e = drawable.getLevel();
                int i11 = b;
                int i12 = (i11 ^ 5) + ((i11 & 5) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.d;
        if (oVar2 != null) {
            int i14 = b;
            int i15 = i14 ^ 21;
            int i16 = (i14 & 21) << 1;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                oVar2.c();
                obj.hashCode();
                throw null;
            }
            oVar2.c();
            if (!this.e) {
                o oVar3 = this.d;
                if (oVar3.c.getDrawable() != null) {
                    int i18 = a;
                    int i19 = (((i18 ^ 39) | (i18 & 39)) << 1) - (((~i18) & 39) | (i18 & (-40)));
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    oVar3.c.getDrawable().setLevel(oVar3.e);
                    int i21 = b;
                    int i22 = (i21 ^ 73) + ((i21 & 73) << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        }
        int i24 = a + 113;
        b = i24 % 128;
        int i25 = i24 % 2;
    }
}
