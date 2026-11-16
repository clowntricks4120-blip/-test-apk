package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.bM.V;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.C0324z;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class OooO extends CheckBox {
    private static int a = 0;
    private static int b = 1;
    public final C0324z c;
    public final r d;
    public final C0322v e;
    public C0316l f;

    public OooO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 65) << 1;
        int i4 = -(((~i2) & 65) | (i2 & (-66)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (i6 != 0) {
            int i7 = 43 / 0;
        }
        return compoundPaddingLeft;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 ivas.gov.bisp.enumeration.k.z) = (r2v2 ivas.gov.bisp.enumeration.k.z), (r2v19 ivas.gov.bisp.enumeration.k.z) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0324z c0324z;
        int i;
        PorterDuff.Mode mode;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 37;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            c0324z = this.c;
            int i5 = 70 / 0;
            if (c0324z != null) {
                int i6 = i3 + 10;
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                a = i7 % 128;
                i = i7 % 2;
                mode = c0324z.e;
                if (i != 0) {
                    int i8 = 11 / 0;
                }
            } else {
                int i9 = i3 & 115;
                int i10 = (((i3 ^ 115) | i9) << 1) - ((i3 | 115) & (~i9));
                a = i10 % 128;
                int i11 = i10 % 2;
                mode = null;
            }
        } else {
            c0324z = this.c;
            if (c0324z != null) {
                int i12 = i3 + 10;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                i = i13 % 2;
                mode = c0324z.e;
                if (i != 0) {
                    int i14 = 11 / 0;
                }
            } else {
                int i15 = i3 & 115;
                int i16 = (((i3 ^ 115) | i15) << 1) - ((i3 | 115) & (~i15));
                a = i16 % 128;
                int i17 = i16 % 2;
                mode = null;
            }
        }
        int i18 = b;
        int i19 = i18 & 105;
        int i20 = -(-((i18 ^ 105) | i19));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return mode;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i5 = ((i4 & 26) + (i4 | 26)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            rVar.k(colorStateList);
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i7 = a;
        int i8 = i7 & 29;
        int i9 = ((i7 ^ 29) | i8) << 1;
        int i10 = -((i7 | 29) & (~i8));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 118) + (i2 | 118)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        C0324z c0324z = this.c;
        if (c0324z != null) {
            c0324z.e = mode;
            c0324z.h = true;
            c0324z.c();
            int i4 = b;
            int i5 = (i4 & 41) + (i4 | 41);
            a = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = a;
        int i8 = i7 & 79;
        int i9 = (i8 - (~(-(-((i7 ^ 79) | i8))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        ad.b(this, getContext());
        C0324z c0324z = new C0324z(this);
        this.c = c0324z;
        c0324z.d(attributeSet, i);
        r rVar = new r(this);
        this.d = rVar;
        rVar.g(attributeSet, i);
        C0322v c0322v = new C0322v(this);
        this.e = c0322v;
        c0322v.i(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (i2 ^ 57) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        a = i6;
        ColorStateList colorStateList = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i7 = i6 + 17;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                colorStateListE = rVar.e();
                int i8 = 70 / 0;
            } else {
                colorStateListE = rVar.e();
            }
            colorStateList = colorStateListE;
        } else {
            int i9 = (i2 & 59) + (i2 | 59);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = (i11 & (-40)) | ((~i11) & 39);
        int i13 = -(-((i11 & 39) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        return colorStateList;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = -(-((i2 ^ 29) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        r rVar = this.d;
        Object obj = null;
        if (rVar != null) {
            int i8 = i6 & 9;
            int i9 = -(-((i6 ^ 9) | i8));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                rVar.f();
                obj.hashCode();
                throw null;
            }
            modeF = rVar.f();
        } else {
            int i11 = ((((i2 ^ 119) | (i2 & 119)) << 1) - (~(-(((~i2) & 119) | (i2 & (-120)))))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            modeF = null;
        }
        int i13 = a;
        int i14 = i13 & 83;
        int i15 = (i13 | 83) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return modeF;
        }
        throw null;
    }

    public ColorStateList getSupportButtonTintList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = ((((i2 ^ 63) | i3) << 1) - (~(-((~i3) & (i2 | 63))))) - 1;
        b = i4 % 128;
        ColorStateList colorStateList = null;
        if (i4 % 2 == 0) {
            colorStateList.hashCode();
            throw null;
        }
        C0324z c0324z = this.c;
        if (c0324z != null) {
            int i5 = i2 + 49;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                ColorStateList colorStateList2 = c0324z.d;
                throw null;
            }
            colorStateList = c0324z.d;
        } else {
            int i6 = (i2 & 117) + (i2 | 117);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a + 111;
        b = i8 % 128;
        int i9 = i8 % 2;
        return colorStateList;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a + 100;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.setBackgroundDrawable(drawable);
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.d;
        if (rVar != null) {
            int i4 = a;
            int i5 = i4 & 31;
            int i6 = (i4 | 31) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                rVar.i();
                int i9 = 98 / 0;
            } else {
                rVar.i();
            }
            int i10 = a;
            int i11 = ((i10 | 25) << 1) - (i10 ^ 25);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a + 17;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 33) | (i2 & 33)) << 1;
        int i4 = -(((~i2) & 33) | (i2 & (-34)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.c(mode);
            int i6 = a;
            int i7 = ((i6 | 35) << 1) - (i6 ^ 35);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = a;
        int i10 = ((i9 | 87) << 1) - (i9 ^ 87);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    private C0316l getEmojiTextViewHelper() {
        int i = 2 % 2;
        int i2 = a + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.f == null) {
            this.f = new C0316l(this);
            int i4 = b;
            int i5 = i4 & 7;
            int i6 = -(-((i4 ^ 7) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        C0316l c0316l = this.f;
        int i9 = a;
        int i10 = (i9 & 25) + (i9 | 25);
        b = i10 % 128;
        int i11 = i10 % 2;
        return c0316l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r3
  0x002d: PHI (r3v4 ivas.gov.bisp.enumeration.k.r) = (r3v3 ivas.gov.bisp.enumeration.k.r), (r3v7 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x002b, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        r rVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 51;
        int i6 = -(-((i4 ^ 51) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            super.setBackgroundResource(i);
            rVar = this.d;
            int i8 = 82 / 0;
            if (rVar != null) {
                int i9 = a;
                i2 = (((i9 | 52) << 1) - (i9 ^ 52)) - 1;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    rVar.h(i);
                    throw null;
                }
                rVar.h(i);
            }
        } else {
            super.setBackgroundResource(i);
            rVar = this.d;
            if (rVar != null) {
                int i10 = a;
                i2 = (((i10 | 52) << 1) - (i10 ^ 52)) - 1;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    rVar.h(i);
                    throw null;
                }
                rVar.h(i);
            }
        }
        int i11 = b;
        int i12 = (-2) - (((i11 & 82) + (i11 | 82)) ^ (-1));
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        V.bxH bxh = getEmojiTextViewHelper().d.c;
        int i5 = a;
        int i6 = i5 & 119;
        int i7 = ((i5 ^ 119) | i6) << 1;
        int i8 = -((i5 | 119) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        bxh.e(z);
        if (i10 == 0) {
            int i11 = 64 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 95) | (i2 & 95)) << 1;
        int i4 = -(((~i2) & 95) | (i2 & (-96)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.setAllCaps(z);
        V v = getEmojiTextViewHelper().d;
        int i7 = b;
        int i8 = i7 & 79;
        int i9 = (((i7 ^ 79) | i8) << 1) - ((i7 | 79) & (~i8));
        a = i9 % 128;
        int i10 = i9 % 2;
        v.c.d(z);
        if (i10 != 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (((i2 | 71) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        InputFilter[] inputFilterArrC = getEmojiTextViewHelper().d.c.c(inputFilterArr);
        int i6 = b;
        int i7 = i6 & 99;
        int i8 = i7 + ((i6 ^ 99) | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        super.setFilters(inputFilterArrC);
        int i10 = b;
        int i11 = i10 & 39;
        int i12 = (i11 - (~((i10 ^ 39) | i11))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r2
  0x0028: PHI (r2v7 ivas.gov.bisp.enumeration.k.z) = (r2v6 ivas.gov.bisp.enumeration.k.z), (r2v8 ivas.gov.bisp.enumeration.k.z) binds: [B:8:0x0026, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0324z c0324z;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 89;
        int i5 = ((((i3 ^ 89) | i4) << 1) - (~(-((i3 | 89) & (~i4))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            c0324z = this.c;
            int i7 = 98 / 0;
            if (c0324z != null) {
                i = (-2) - ((i6 + 42) ^ (-1));
                b = i % 128;
                if (i % 2 == 0) {
                    c0324z.d = colorStateList;
                } else {
                    c0324z.d = colorStateList;
                }
                c0324z.f = true;
                c0324z.c();
                int i8 = b + 107;
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            c0324z = this.c;
            if (c0324z != null) {
                i = (-2) - ((i6 + 42) ^ (-1));
                b = i % 128;
                if (i % 2 == 0) {
                    c0324z.d = colorStateList;
                } else {
                    c0324z.d = colorStateList;
                }
                c0324z.f = true;
                c0324z.c();
                int i10 = b + 107;
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = b;
        int i13 = i12 ^ 45;
        int i14 = ((((i12 & 45) | i13) << 1) - (~(-i13))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = -(-(i2 | 69));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            super.drawableStateChanged();
            throw null;
        }
        super.drawableStateChanged();
        r rVar = this.d;
        if (rVar != null) {
            rVar.d();
            int i6 = a;
            int i7 = ((i6 | 97) << 1) - (i6 ^ 97);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        C0322v c0322v = this.e;
        if (c0322v != null) {
            int i9 = a;
            int i10 = ((i9 ^ 71) | (i9 & 71)) << 1;
            int i11 = -(((~i9) & 71) | (i9 & (-72)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                c0322v.f();
                int i13 = 47 / 0;
            } else {
                c0322v.f();
            }
        }
        int i14 = b;
        int i15 = ((i14 ^ 39) | (i14 & 39)) << 1;
        int i16 = -(((~i14) & 39) | (i14 & (-40)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 20) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        super.setButtonDrawable(drawable);
        C0324z c0324z = this.c;
        if (c0324z != null) {
            int i4 = b;
            int i5 = i4 & 113;
            int i6 = (i4 | 113) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (!(!c0324z.g)) {
                int i10 = b;
                int i11 = i10 & 31;
                int i12 = ((i10 ^ 31) | i11) << 1;
                int i13 = -((i10 | 31) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                c0324z.g = false;
                return;
            }
            c0324z.g = true;
            c0324z.c();
            int i16 = a;
            int i17 = i16 & 117;
            int i18 = (i16 | 117) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = i22 & 93;
        int i24 = i23 + ((i22 ^ 93) | i23);
        a = i24 % 128;
        if (i24 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 79;
        int i5 = (i3 | 79) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        setButtonDrawable(A.c(getContext(), i));
        int i9 = a;
        int i10 = i9 & 113;
        int i11 = (i9 ^ 113) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
