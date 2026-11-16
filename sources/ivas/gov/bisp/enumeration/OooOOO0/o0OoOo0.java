package ivas.gov.bisp.enumeration.OooOOO0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.bM.L;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class o0OoOo0 extends MultiAutoCompleteTextView {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.popupBackground};
    public final r d;
    public final C0322v e;
    public final C0321u f;

    static {
        int i = 1 + 67;
        a = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
        ai.b(context);
        ad.b(this, getContext());
        B bC = B.c(getContext(), attributeSet, c, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle, 0);
        if (bC.t(0)) {
            setDropDownBackgroundDrawable(bC.l(0));
            int i = b + 123;
            a = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        bC.d.recycle();
        r rVar = new r(this);
        int i4 = a;
        int i5 = i4 & 33;
        int i6 = ((((i4 ^ 33) | i5) << 1) - (~(-((i4 | 33) & (~i5))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        this.d = rVar;
        rVar.g(attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
        C0322v c0322v = new C0322v(this);
        int i8 = b + 97;
        a = i8 % 128;
        int i9 = i8 % 2;
        this.e = c0322v;
        c0322v.i(attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
        c0322v.f();
        C0321u c0321u = new C0321u((EditText) this);
        int i10 = b + 47;
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            this.f = c0321u;
            c0321u.l(attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
            throw null;
        }
        this.f = c0321u;
        c0321u.l(attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
        int i11 = b;
        int i12 = (((i11 | 48) << 1) - (i11 ^ 48)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        KeyListener keyListener = getKeyListener();
        boolean z = keyListener instanceof NumberKeyListener;
        if ((((~(z ? 1 : 0)) & 1) | ((z ? 1 : 0) & (-2))) != 0) {
            int i14 = b;
            int i15 = i14 & 11;
            int i16 = ((i14 ^ 11) | i15) << 1;
            int i17 = -((i14 | 11) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            boolean zIsFocusable = isFocusable();
            int inputType = getInputType();
            KeyListener keyListenerK = c0321u.k(keyListener);
            int i20 = b;
            int i21 = i20 ^ 93;
            int i22 = (i20 & 93) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (keyListenerK != keyListener) {
                super.setKeyListener(keyListenerK);
                setRawInputType(inputType);
                setFocusable(zIsFocusable);
                int i24 = a;
                int i25 = (i24 & 7) + (i24 | 7);
                b = i25 % 128;
                int i26 = i25 % 2;
                int i27 = 2 % 2;
            }
        }
        int i28 = a;
        int i29 = i28 & 115;
        int i30 = -(-((i28 ^ 115) | i29));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        b = i31 % 128;
        int i32 = i31 % 2;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((b + 112) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            setDropDownBackgroundDrawable(A.c(getContext(), i));
        } else {
            setDropDownBackgroundDrawable(A.c(getContext(), i));
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        int i = 2 % 2;
        int i2 = a + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setKeyListener(this.f.k(keyListener));
        int i4 = a;
        int i5 = (i4 & 119) + (i4 | 119);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 57;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i4 = (-2) - ((i2 + 8) ^ (-1));
            b = i4 % 128;
            int i5 = i4 % 2;
            rVar.k(colorStateList);
            int i6 = a;
            int i7 = i6 ^ 31;
            int i8 = ((i6 & 31) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a + 43;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 62) + ((i2 & 62) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        r rVar = this.d;
        Object obj = null;
        if (rVar != null) {
            int i7 = i5 + 105;
            b = i7 % 128;
            int i8 = i7 % 2;
            colorStateListE = rVar.e();
            int i9 = a;
            int i10 = (((i9 | 54) << 1) - (i9 ^ 54)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = (((i2 & (-52)) | ((~i2) & 51)) - (~((i2 & 51) << 1))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            colorStateListE = null;
        }
        int i14 = b;
        int i15 = i14 & 31;
        int i16 = ((i14 ^ 31) | i15) << 1;
        int i17 = -((i14 | 31) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return colorStateListE;
        }
        obj.hashCode();
        throw null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i5 = i2 & 97;
            int i6 = (((i2 ^ 97) | i5) << 1) - ((i2 | 97) & (~i5));
            b = i6 % 128;
            int i7 = i6 % 2;
            modeF = rVar.f();
            int i8 = b;
            int i9 = ((i8 ^ 25) - (~(-(-((i8 & 25) << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = i2 & 29;
            int i12 = (i2 ^ 29) | i11;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 / 5;
            }
            modeF = null;
        }
        int i15 = b + 98;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        return modeF;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        int i3 = i2 % 2;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
        int i4 = a;
        int i5 = i4 & 59;
        int i6 = (i4 ^ 59) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return this.f.o(inputConnectionOnCreateInputConnection, editorInfo);
        }
        int i8 = 1 / 0;
        return this.f.o(inputConnectionOnCreateInputConnection, editorInfo);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
  0x0033: PHI (r1v10 ivas.gov.bisp.enumeration.k.r) = (r1v9 ivas.gov.bisp.enumeration.k.r), (r1v16 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x0031, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        r rVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 35) | (i4 & 35)) << 1;
        int i6 = -(((~i4) & 35) | (i4 & (-36)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            super.setBackgroundResource(i);
            rVar = this.d;
            int i8 = 16 / 0;
            if (rVar != null) {
                rVar.h(i);
                int i9 = b;
                int i10 = i9 ^ 65;
                int i11 = (i9 & 65) << 1;
                i2 = (i10 & i11) + (i11 | i10);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i12 = 2 % 4;
                }
            }
        } else {
            super.setBackgroundResource(i);
            rVar = this.d;
            if (rVar != null) {
                rVar.h(i);
                int i13 = b;
                int i14 = i13 ^ 65;
                int i15 = (i13 & 65) << 1;
                i2 = (i14 & i15) + (i15 | i14);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i16 = 2 % 4;
                }
            }
        }
        int i17 = a;
        int i18 = ((i17 & 5) - (~(i17 | 5))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i8 = i6 ^ 89;
            int i9 = ((((i6 & 89) | i8) << 1) - (~(-i8))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                rVar.c(mode);
                int i10 = 40 / 0;
            } else {
                rVar.c(mode);
            }
            int i11 = b + 33;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a + 7;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 89) + (i2 | 89);
        a = i3 % 128;
        int i4 = i3 % 2;
        super.setBackgroundDrawable(drawable);
        r rVar = this.d;
        if (rVar != null) {
            int i5 = b + 81;
            a = i5 % 128;
            int i6 = i5 % 2;
            rVar.i();
            int i7 = b;
            int i8 = i7 & 103;
            int i9 = ((i7 ^ 103) | i8) << 1;
            int i10 = -((i7 | 103) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = i13 & 61;
        int i15 = (i13 ^ 61) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 74 / 0;
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (((i2 | 97) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        L.bxT bxt = ((L) this.f.d).a;
        int i6 = b;
        int i7 = ((i6 ^ 70) + ((i6 & 70) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        bxt.e(z);
        int i9 = b;
        int i10 = i9 & 123;
        int i11 = (i9 ^ 123) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((a + 78) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.setTextAppearance(context, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setTextAppearance(context, i);
        C0322v c0322v = this.e;
        if (c0322v != null) {
            int i4 = b;
            int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                c0322v.h(context, i);
                int i6 = 31 / 0;
            } else {
                c0322v.h(context, i);
            }
            int i7 = a + 75;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 % 5;
            }
        }
        int i9 = b + 121;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-82)) | ((~i2) & 81)) - (~((i2 & 81) << 1))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.drawableStateChanged();
            obj.hashCode();
            throw null;
        }
        super.drawableStateChanged();
        r rVar = this.d;
        if (rVar != null) {
            rVar.d();
            int i4 = a;
            int i5 = i4 & 95;
            int i6 = -(-(i4 | 95));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 5;
            }
        }
        C0322v c0322v = this.e;
        if (c0322v != null) {
            int i9 = a;
            int i10 = (i9 ^ 19) + ((i9 & 19) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                c0322v.f();
                obj.hashCode();
                throw null;
            }
            c0322v.f();
        }
        int i11 = b;
        int i12 = ((i11 | 94) << 1) - (i11 ^ 94);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
