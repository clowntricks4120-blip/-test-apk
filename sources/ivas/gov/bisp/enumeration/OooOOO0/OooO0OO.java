package ivas.gov.bisp.enumeration.OooOOO0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.bM.L;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;
import ivas.gov.bisp.enumeration.p089l.l;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends AutoCompleteTextView {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.popupBackground};
    public final r d;
    public final C0322v e;
    public final C0321u f;

    static {
        int i = (1 & 77) + (1 | 77);
        a = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    public OooO0OO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r2
  0x002b: PHI (r2v7 ivas.gov.bisp.enumeration.k.r) = (r2v6 ivas.gov.bisp.enumeration.k.r), (r2v15 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x0029, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public ColorStateList getSupportBackgroundTintList() {
        r rVar;
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 19) | (i2 & 19)) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            rVar = this.d;
            int i5 = 50 / 0;
            if (rVar != null) {
                colorStateListE = rVar.e();
                int i6 = a + 9;
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = i4 & 89;
                int i9 = (i4 ^ 89) | i8;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                colorStateListE = null;
            }
        } else {
            rVar = this.d;
            if (rVar != null) {
                colorStateListE = rVar.e();
                int i12 = a + 9;
                b = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = i4 & 89;
                int i15 = (i4 ^ 89) | i14;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                colorStateListE = null;
            }
        }
        int i18 = a + 73;
        b = i18 % 128;
        int i19 = i18 % 2;
        return colorStateListE;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 113;
        int i5 = i4 % 128;
        b = i5;
        PorterDuff.Mode modeF = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i6 = i5 & 101;
            int i7 = (i6 - (~(-(-((i5 ^ 101) | i6))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            modeF = rVar.f();
            int i9 = b;
            i = ((i9 ^ 120) + ((i9 & 120) << 1)) - 1;
            a = i % 128;
        } else {
            i = ((i3 | 111) << 1) - (i3 ^ 111);
            b = i % 128;
        }
        int i10 = i % 2;
        int i11 = b;
        int i12 = (((i11 | 92) << 1) - (i11 ^ 92)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        return modeF;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = a + 57;
        b = i3 % 128;
        int i4 = i3 % 2;
        setDropDownBackgroundDrawable(A.c(getContext(), i));
        int i5 = b;
        int i6 = i5 & 47;
        int i7 = (((i5 | 47) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (i2 ^ 55) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        KeyListener keyListenerK = this.f.k(keyListener);
        if (i6 != 0) {
            super.setKeyListener(keyListenerK);
            int i7 = 28 / 0;
        } else {
            super.setKeyListener(keyListenerK);
        }
        int i8 = a;
        int i9 = i8 & 21;
        int i10 = (i8 | 21) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 16) << 1) - (i2 ^ 16)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i4 = (i2 ^ 10) + ((i2 & 10) << 1);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            rVar.c(mode);
            int i7 = b;
            int i8 = i7 & 35;
            int i9 = ((((i7 ^ 35) | i8) << 1) - (~(-((i7 | 35) & (~i8))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = ((i11 ^ 43) - (~(-(-((i11 & 43) << 1))))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(Context context, AttributeSet attributeSet, int i) {
        KeyListener keyListener;
        boolean zIsFocusable;
        int inputType;
        super(context, attributeSet, i);
        ai.b(context);
        ad.b(this, getContext());
        B bC = B.c(getContext(), attributeSet, c, i, 0);
        if (bC.t(0)) {
            setDropDownBackgroundDrawable(bC.l(0));
            int i2 = a;
            int i3 = i2 | 95;
            int i4 = (i3 << 1) - ((~(i2 & 95)) & i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        bC.d.recycle();
        r rVar = new r(this);
        this.d = rVar;
        rVar.g(attributeSet, i);
        C0322v c0322v = new C0322v(this);
        int i7 = a;
        int i8 = i7 & 63;
        int i9 = (i8 - (~(-(-((i7 ^ 63) | i8))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        this.e = c0322v;
        c0322v.i(attributeSet, i);
        c0322v.f();
        C0321u c0321u = new C0321u((EditText) this);
        int i11 = a;
        int i12 = i11 & 19;
        int i13 = (((i11 | 19) & (~i12)) - (~(i12 << 1))) - 1;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            this.f = c0321u;
            c0321u.l(attributeSet, i);
            keyListener = getKeyListener();
            int i14 = 85 / 0;
        } else {
            this.f = c0321u;
            c0321u.l(attributeSet, i);
            keyListener = getKeyListener();
        }
        boolean z = keyListener instanceof NumberKeyListener;
        int i15 = (z ? 1 : 0) & 1;
        int i16 = ((!z ? 1 : 0) | i15) & (~i15);
        Object obj = null;
        if (i16 != 0) {
            int i17 = a;
            int i18 = (i17 & (-54)) | ((~i17) & 53);
            int i19 = (i17 & 53) << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                zIsFocusable = super.isFocusable();
                inputType = super.getInputType();
                int i21 = 77 / 0;
            } else {
                zIsFocusable = super.isFocusable();
                inputType = super.getInputType();
            }
            int i22 = a;
            int i23 = ((i22 | 15) << 1) - (i22 ^ 15);
            b = i23 % 128;
            int i24 = i23 % 2;
            KeyListener keyListenerK = c0321u.k(keyListener);
            if (keyListenerK != keyListener) {
                int i25 = b;
                int i26 = ((i25 & 93) - (~(-(-(i25 | 93))))) - 1;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    super.setKeyListener(keyListenerK);
                    super.setRawInputType(inputType);
                    obj.hashCode();
                    throw null;
                }
                super.setKeyListener(keyListenerK);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                int i27 = b;
                int i28 = i27 & 123;
                int i29 = ((i27 | 123) & (~i28)) + (i28 << 1);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 2 % 2;
                }
            }
        }
        int i31 = b;
        int i32 = (i31 & (-28)) | ((~i31) & 27);
        int i33 = (i31 & 27) << 1;
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        a = i34 % 128;
        if (i34 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.drawableStateChanged();
        r rVar = this.d;
        if (rVar != null) {
            int i4 = a;
            int i5 = i4 & 67;
            int i6 = -(-((i4 ^ 67) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            rVar.d();
            int i9 = b;
            int i10 = i9 ^ 79;
            int i11 = (i9 & 79) << 1;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        C0322v c0322v = this.e;
        if (c0322v != null) {
            int i14 = a;
            int i15 = ((i14 | 111) << 1) - (i14 ^ 111);
            b = i15 % 128;
            int i16 = i15 % 2;
            c0322v.f();
            if (i16 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i17 = a;
            int i18 = (i17 & 111) + (i17 | 111);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = i20 | 119;
        int i22 = (i21 << 1) - ((~(i20 & 119)) & i21);
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        int i = 2 % 2;
        int i2 = a + 75;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return l.f(super.getCustomSelectionActionModeCallback());
        }
        l.f(super.getCustomSelectionActionModeCallback());
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        int i3 = i2 % 2;
        super.setBackgroundDrawable(drawable);
        r rVar = this.d;
        if (rVar != null) {
            int i4 = a;
            int i5 = ((i4 & 93) - (~(-(-(i4 | 93))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            rVar.i();
            int i7 = b;
            int i8 = i7 ^ 75;
            int i9 = (((i7 & 75) | i8) << 1) - i8;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = ((i11 | 19) << 1) - (i11 ^ 19);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 ivas.gov.bisp.enumeration.k.r) = (r1v4 ivas.gov.bisp.enumeration.k.r), (r1v14 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        r rVar;
        int i2 = 2 % 2;
        int i3 = a + 115;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.setBackgroundResource(i);
            rVar = this.d;
            int i4 = 43 / 0;
            if (rVar != null) {
                rVar.h(i);
                int i5 = b;
                int i6 = (i5 ^ 53) + ((i5 & 53) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            super.setBackgroundResource(i);
            rVar = this.d;
            if (rVar != null) {
                rVar.h(i);
                int i8 = b;
                int i9 = (i8 ^ 53) + ((i8 & 53) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        int i11 = a;
        int i12 = i11 & 123;
        int i13 = (((i11 ^ 123) | i12) << 1) - ((i11 | 123) & (~i12));
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 83) | (i2 & 83)) << 1) - (((~i2) & 83) | (i2 & (-84)));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            super.setCustomSelectionActionModeCallback(l.h(this, callback));
            int i4 = 0 / 0;
        } else {
            super.setCustomSelectionActionModeCallback(l.h(this, callback));
        }
        int i5 = a;
        int i6 = i5 ^ 23;
        int i7 = ((i5 & 23) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 21 / 0;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-92)) | ((~i2) & 91)) + ((i2 & 91) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i5 = ((i2 & (-90)) | ((~i2) & 89)) + ((i2 & 89) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                rVar.k(colorStateList);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            rVar.k(colorStateList);
        }
        int i6 = a;
        int i7 = i6 & 123;
        int i8 = (i6 ^ 123) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.setTextAppearance(context, i);
        C0322v c0322v = this.e;
        if (c0322v != null) {
            int i5 = a;
            int i6 = i5 & 95;
            int i7 = (i5 ^ 95) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            c0322v.h(context, i);
            int i10 = a;
            int i11 = i10 & 53;
            int i12 = -(-((i10 ^ 53) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = (((i15 | 110) << 1) - (i15 ^ 110)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 115;
        int i4 = (i2 & 115) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
            int i6 = 61 / 0;
        } else {
            inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
        }
        int i7 = b;
        int i8 = i7 ^ 115;
        int i9 = ((i7 & 115) | i8) << 1;
        int i10 = -i8;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return this.f.o(inputConnectionOnCreateInputConnection, editorInfo);
        }
        int i12 = 99 / 0;
        return this.f.o(inputConnectionOnCreateInputConnection, editorInfo);
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 30) ^ (-1));
        a = i2 % 128;
        if (i2 % 2 != 0) {
            L.bxT bxt = ((L) this.f.d).a;
            throw null;
        }
        L.bxT bxt2 = ((L) this.f.d).a;
        int i3 = b + 17;
        a = i3 % 128;
        int i4 = i3 % 2;
        bxt2.e(z);
        int i5 = a;
        int i6 = (-2) - ((((i5 | 122) << 1) - (i5 ^ 122)) ^ (-1));
        b = i6 % 128;
        int i7 = i6 % 2;
    }
}
