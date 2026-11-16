package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.bM.V;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.C0324z;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class o00Ooo extends RadioButton {
    private static int a = 0;
    private static int b = 1;
    public final C0324z c;
    public final r d;
    public final C0322v e;
    public C0316l f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(Context context, AttributeSet attributeSet, int i) {
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

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 39;
        int i4 = -(-((i2 & 39) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        int i7 = a;
        int i8 = i7 & 31;
        int i9 = (i7 | 31) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        C0324z c0324z = this.c;
        if (c0324z != null) {
            int i6 = i4 ^ 21;
            int i7 = ((((i4 & 21) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                colorStateList = c0324z.d;
                int i8 = 46 / 0;
            } else {
                colorStateList = c0324z.d;
            }
            int i9 = a;
            int i10 = ((((i9 ^ 7) | (i9 & 7)) << 1) - (~(-(((~i9) & 7) | (i9 & (-8)))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i4 + 81;
            a = i12 % 128;
            int i13 = i12 % 2;
            colorStateList = null;
        }
        int i14 = b;
        int i15 = i14 | 83;
        int i16 = i15 << 1;
        int i17 = -((~(i14 & 83)) & i15);
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v7 ivas.gov.bisp.enumeration.k.z) = (r2v6 ivas.gov.bisp.enumeration.k.z), (r2v23 ivas.gov.bisp.enumeration.k.z) binds: [B:8:0x0025, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0324z c0324z;
        PorterDuff.Mode mode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = (~i3) & (i2 | 49);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            c0324z = this.c;
            int i7 = 69 / 0;
            if (c0324z != null) {
                mode = c0324z.e;
                int i8 = b;
                int i9 = i8 & 23;
                int i10 = (((i8 | 23) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = i2 & 123;
                int i13 = ((((i2 ^ 123) | i12) << 1) - (~(-((i2 | 123) & (~i12))))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                mode = null;
            }
        } else {
            c0324z = this.c;
            if (c0324z != null) {
                mode = c0324z.e;
                int i15 = b;
                int i16 = i15 & 23;
                int i17 = (((i15 | 23) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
                a = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = i2 & 123;
                int i110 = ((((i2 ^ 123) | i19) << 1) - (~(-((i2 | 123) & (~i19))))) - 1;
                a = i110 % 128;
                int i111 = i110 % 2;
                mode = null;
            }
        }
        int i20 = b;
        int i21 = ((i20 | 97) << 1) - (i20 ^ 97);
        a = i21 % 128;
        int i22 = i21 % 2;
        return mode;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        C0324z c0324z = this.c;
        if (c0324z != null) {
            int i6 = ((i4 | 69) << 1) - (i4 ^ 69);
            b = i6 % 128;
            int i7 = i6 % 2;
            c0324z.d = colorStateList;
            c0324z.f = true;
            c0324z.c();
            int i8 = a;
            int i9 = i8 & 81;
            int i10 = (i8 | 81) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = (i14 & 51) + (i14 | 51);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (~i3) & (i2 | 117);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0324z c0324z = this.c;
        if (c0324z != null) {
            int i7 = i2 + 43;
            b = i7 % 128;
            int i8 = i7 % 2;
            c0324z.e = mode;
            c0324z.h = true;
            int i9 = a;
            int i10 = ((i9 & 118) + (i9 | 118)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            c0324z.c();
            int i12 = b;
            int i13 = (((i12 | 66) << 1) - (i12 ^ 66)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = i15 & 51;
        int i17 = (i16 - (~(-(-((i15 ^ 51) | i16))))) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 89) << 1) - ((i2 & (-90)) | ((~i2) & 89));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i6 = ((i4 & 5) - (~(-(-(i4 | 5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            colorStateListE = rVar.e();
            int i8 = a;
            int i9 = i8 & 45;
            int i10 = i9 + ((i8 ^ 45) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i2 & 107;
            int i13 = (i12 - (~((i2 ^ 107) | i12))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            colorStateListE = null;
        }
        int i15 = b;
        int i16 = (i15 & (-46)) | ((~i15) & 45);
        int i17 = -(-((i15 & 45) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return colorStateListE;
        }
        throw null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        r rVar = this.d;
        Object obj = null;
        if (rVar != null) {
            int i6 = i2 ^ 1;
            int i7 = -(-((i2 & 1) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                rVar.f();
                obj.hashCode();
                throw null;
            }
            modeF = rVar.f();
        } else {
            int i9 = ((i4 | 40) << 1) - (i4 ^ 40);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            modeF = null;
        }
        int i12 = b;
        int i13 = (i12 ^ 43) + ((i12 & 43) << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return modeF;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.setBackgroundDrawable(drawable);
            obj.hashCode();
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.d;
        if (rVar != null) {
            int i4 = b + 125;
            a = i4 % 128;
            int i5 = i4 % 2;
            rVar.i();
            if (i5 != 0) {
                throw null;
            }
        }
        int i6 = b;
        int i7 = i6 & 35;
        int i8 = i7 + ((i6 ^ 35) | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 97 / 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-122)) | ((~i3) & 121)) + ((i3 & 121) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            super.setBackgroundResource(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setBackgroundResource(i);
        r rVar = this.d;
        if (rVar != null) {
            rVar.h(i);
            int i5 = b + 51;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = b;
        int i8 = ((((i7 ^ 121) | (i7 & 121)) << 1) - (~(-(((~i7) & 121) | (i7 & (-122)))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r6
  0x0022: PHI (r6v2 ivas.gov.bisp.enumeration.k.z) = (r6v1 ivas.gov.bisp.enumeration.k.z), (r6v23 ivas.gov.bisp.enumeration.k.z) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r6.g != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r6.g != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r6.g = false;
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a;
        r1 = ((r6 ^ 37) | (r6 & 37)) << 1;
        r6 = -(((~r6) & 37) | (r6 & (-38)));
        r2 = ((r1 | r6) << 1) - (r6 ^ r1);
        ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if ((r2 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r6 = 24 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r6.g = true;
        r6.c();
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b;
        r1 = (r6 ^ 113) + ((r6 & 113) << 1);
        ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    @Override // android.widget.CompoundButton
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setButtonDrawable(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a
            int r1 = r1 + 111
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1b
            super.setButtonDrawable(r6)
            ivas.gov.bisp.enumeration.k.z r6 = r5.c
            r1 = 70
            int r1 = r1 / r3
            if (r6 == 0) goto L6f
            goto L22
        L1b:
            super.setButtonDrawable(r6)
            ivas.gov.bisp.enumeration.k.z r6 = r5.c
            if (r6 == 0) goto L6f
        L22:
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a
            r4 = r1 & 113(0x71, float:1.58E-43)
            r1 = r1 | 113(0x71, float:1.58E-43)
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L37
            boolean r1 = r6.g
            int r4 = r3 / r3
            if (r1 == 0) goto L5d
            goto L3b
        L37:
            boolean r1 = r6.g
            if (r1 == 0) goto L5d
        L3b:
            r6.g = r3
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a
            r1 = r6 ^ 37
            r4 = r6 & 37
            r1 = r1 | r4
            int r1 = r1 << r2
            r4 = r6 & (-38)
            int r6 = ~r6
            r6 = r6 & 37
            r6 = r6 | r4
            int r6 = -r6
            r4 = r1 | r6
            int r2 = r4 << 1
            r6 = r6 ^ r1
            int r2 = r2 - r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L5c
            r6 = 24
            int r6 = r6 / r3
        L5c:
            return
        L5d:
            r6.g = r2
            r6.c()
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b
            r1 = r6 ^ 113(0x71, float:1.58E-43)
            r6 = r6 & 113(0x71, float:1.58E-43)
            int r6 = r6 << r2
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a = r6
            int r1 = r1 % r0
        L6f:
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.b
            r1 = r6 & (-126(0xffffffffffffff82, float:NaN))
            int r3 = ~r6
            r3 = r3 & 125(0x7d, float:1.75E-43)
            r1 = r1 | r3
            r6 = r6 & 125(0x7d, float:1.75E-43)
            int r6 = r6 << r2
            int r6 = -r6
            int r6 = -r6
            r2 = r1 & r6
            r6 = r6 | r1
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.a = r6
            int r2 = r2 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o00Ooo.setButtonDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i2 ^ 67) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i8 = ((i6 | 87) << 1) - (i6 ^ 87);
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.k(colorStateList);
            if (i9 == 0) {
                throw null;
            }
        }
        int i10 = b + 67;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 31) | (i2 & 31)) << 1) - (((~i2) & 31) | (i2 & (-32)));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.c(mode);
            int i4 = a;
            int i5 = i4 & 57;
            int i6 = (i5 - (~(-(-((i4 ^ 57) | i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a;
        int i9 = ((i8 ^ 73) | (i8 & 73)) << 1;
        int i10 = -(((~i8) & 73) | (i8 & (-74)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    private C0316l getEmojiTextViewHelper() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.f == null) {
            this.f = new C0316l(this);
            int i7 = a;
            int i8 = i7 ^ 29;
            int i9 = -(-((i7 & 29) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        C0316l c0316l = this.f;
        int i12 = b + 111;
        a = i12 % 128;
        int i13 = i12 % 2;
        return c0316l;
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            getEmojiTextViewHelper().d.c.e(z);
            int i5 = 68 / 0;
        } else {
            getEmojiTextViewHelper().d.c.e(z);
        }
        int i6 = b;
        int i7 = i6 & 15;
        int i8 = (i6 | 15) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        InputFilter[] inputFilterArrC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            inputFilterArrC = getEmojiTextViewHelper().d.c.c(inputFilterArr);
            int i4 = 5 / 0;
        } else {
            inputFilterArrC = getEmojiTextViewHelper().d.c.c(inputFilterArr);
        }
        int i5 = b;
        int i6 = i5 & 47;
        int i7 = i6 + ((i5 ^ 47) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        super.setFilters(inputFilterArrC);
        if (i8 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 113) + (i2 | 113);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.setAllCaps(z);
        V v = getEmojiTextViewHelper().d;
        int i5 = a;
        int i6 = i5 & 43;
        int i7 = ((i5 ^ 43) | i6) << 1;
        int i8 = -((i5 | 43) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            v.c.d(z);
        } else {
            v.c.d(z);
            int i10 = 54 / 0;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 16) + ((i2 & 16) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        super.drawableStateChanged();
        r rVar = this.d;
        if (rVar != null) {
            int i5 = a;
            int i6 = (i5 & (-16)) | ((~i5) & 15);
            int i7 = -(-((i5 & 15) << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.d();
            int i10 = a;
            int i11 = i10 & 101;
            int i12 = i11 + ((i10 ^ 101) | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        C0322v c0322v = this.e;
        Object obj = null;
        if (c0322v != null) {
            int i14 = b;
            int i15 = i14 & 83;
            int i16 = (i14 ^ 83) | i15;
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                c0322v.f();
                throw null;
            }
            c0322v.f();
            int i18 = a + 55;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 2 / 2;
            }
        }
        int i20 = a + 59;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 37;
        int i5 = ((((i3 ^ 37) | i4) << 1) - (~(-((i3 | 37) & (~i4))))) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            setButtonDrawable(A.c(getContext(), i));
            int i6 = 3 / 0;
        } else {
            setButtonDrawable(A.c(getContext(), i));
        }
        int i7 = a;
        int i8 = ((i7 | 49) << 1) - (i7 ^ 49);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
