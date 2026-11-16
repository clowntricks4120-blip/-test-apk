package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.bM.V;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0318p;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.W;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;
import ivas.gov.bisp.enumeration.p089l.l;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0 extends CheckedTextView {
    private static int a = 0;
    private static int b = 1;
    public final C0318p c;
    public final r d;
    public final C0322v e;
    public C0316l f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ca A[Catch: all -> 0x01d6, TRY_ENTER, TryCatch #1 {all -> 0x01d6, blocks: (B:3:0x0049, B:5:0x0053, B:9:0x006c, B:35:0x0105, B:40:0x011c, B:43:0x0136, B:41:0x0123, B:45:0x0150, B:48:0x015f, B:50:0x0172, B:52:0x0184, B:14:0x008e, B:15:0x0095, B:17:0x00b7, B:23:0x00ca, B:28:0x00d7, B:30:0x00ed, B:26:0x00d1), top: B:67:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d1 A[Catch: all -> 0x01d6, TryCatch #1 {all -> 0x01d6, blocks: (B:3:0x0049, B:5:0x0053, B:9:0x006c, B:35:0x0105, B:40:0x011c, B:43:0x0136, B:41:0x0123, B:45:0x0150, B:48:0x015f, B:50:0x0172, B:52:0x0184, B:14:0x008e, B:15:0x0095, B:17:0x00b7, B:23:0x00ca, B:28:0x00d7, B:30:0x00ed, B:26:0x00d1), top: B:67:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d7 A[Catch: all -> 0x01d6, PHI: r3
  0x00d7: PHI (r3v18 int) = (r3v17 int), (r3v26 int) binds: [B:27:0x00d5, B:25:0x00d0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x01d6, blocks: (B:3:0x0049, B:5:0x0053, B:9:0x006c, B:35:0x0105, B:40:0x011c, B:43:0x0136, B:41:0x0123, B:45:0x0150, B:48:0x015f, B:50:0x0172, B:52:0x0184, B:14:0x008e, B:15:0x0095, B:17:0x00b7, B:23:0x00ca, B:28:0x00d7, B:30:0x00ed, B:26:0x00d1), top: B:67:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    public OooOO0(Context context, AttributeSet attributeSet) {
        int i;
        int iR;
        int i2;
        CheckedTextView checkedTextView;
        ColorStateList colorStateListH;
        int iR2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ai.b(context);
        ad.b(this, getContext());
        C0322v c0322v = new C0322v(this);
        this.e = c0322v;
        c0322v.i(attributeSet, R.attr.checkedTextViewStyle);
        c0322v.f();
        r rVar = new r(this);
        this.d = rVar;
        rVar.g(attributeSet, R.attr.checkedTextViewStyle);
        C0318p c0318p = new C0318p(this);
        this.c = c0318p;
        Context context2 = getContext();
        int[] iArr = h.n;
        B bC = B.c(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        T.p(this, getContext(), iArr, attributeSet, bC.d, R.attr.checkedTextViewStyle, 0);
        try {
            Object obj = null;
            if (!bC.t(1) || (iR2 = bC.r(1, 0)) == 0) {
                int i3 = a;
                int i4 = (-2) - ((((i3 | 36) << 1) - (i3 ^ 36)) ^ (-1));
                int i5 = i4 % 128;
                b = i5;
                int i6 = i4 % 2;
                int i7 = 2 % 2;
                int i8 = i5 ^ 3;
                int i9 = ((((i5 & 3) | i8) << 1) - (~(-i8))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                if (!(!bC.t(0))) {
                    i = b + 87;
                    a = i % 128;
                    if (i % 2 != 0) {
                        iR = bC.r(0, 0);
                        if (iR != 0) {
                            CheckedTextView checkedTextView2 = c0318p.c;
                            Drawable drawableC = A.c(checkedTextView2.getContext(), iR);
                            int i11 = a;
                            int i12 = (i11 & 31) + (i11 | 31);
                            b = i12 % 128;
                            int i13 = i12 % 2;
                            checkedTextView2.setCheckMarkDrawable(drawableC);
                            int i14 = a;
                            int i15 = i14 & 43;
                            int i16 = (i14 ^ 43) | i15;
                            i2 = (i15 & i16) + (i16 | i15);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i17 = 2 % 2;
                            }
                        }
                    } else {
                        iR = bC.r(0, 0);
                        if (iR != 0) {
                            CheckedTextView checkedTextView3 = c0318p.c;
                            Drawable drawableC2 = A.c(checkedTextView3.getContext(), iR);
                            int i18 = a;
                            int i19 = (i18 & 31) + (i18 | 31);
                            b = i19 % 128;
                            int i110 = i19 % 2;
                            checkedTextView3.setCheckMarkDrawable(drawableC2);
                            int i111 = a;
                            int i112 = i111 & 43;
                            int i113 = (i111 ^ 43) | i112;
                            i2 = (i112 & i113) + (i113 | i112);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i114 = 2 % 2;
                            }
                        }
                    }
                }
            } else {
                int i20 = b;
                int i21 = ((i20 & (-104)) | ((~i20) & 103)) + ((i20 & 103) << 1);
                a = i21 % 128;
                try {
                    if (i21 % 2 != 0) {
                        A.c(getContext(), iR2);
                        throw null;
                    }
                    setCheckMarkDrawable(A.c(getContext(), iR2));
                    int i22 = a;
                    int i23 = i22 & 37;
                    int i24 = (i23 - (~((i22 ^ 37) | i23))) - 1;
                    b = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 2 % 2;
                    }
                } catch (Resources.NotFoundException unused) {
                    int i26 = a;
                    int i27 = (-2) - ((((i26 | 36) << 1) - (i26 ^ 36)) ^ (-1));
                    int i28 = i27 % 128;
                    b = i28;
                    int i29 = i27 % 2;
                    int i30 = 2 % 2;
                    int i31 = i28 ^ 3;
                    int i32 = ((((i28 & 3) | i31) << 1) - (~(-i31))) - 1;
                    a = i32 % 128;
                    int i115 = i32 % 2;
                    if (!(!bC.t(0))) {
                        i = b + 87;
                        a = i % 128;
                        if (i % 2 != 0) {
                            iR = bC.r(0, 0);
                            if (iR != 0) {
                                CheckedTextView checkedTextView4 = c0318p.c;
                                Drawable drawableC3 = A.c(checkedTextView4.getContext(), iR);
                                int i116 = a;
                                int i117 = (i116 & 31) + (i116 | 31);
                                b = i117 % 128;
                                int i118 = i117 % 2;
                                checkedTextView4.setCheckMarkDrawable(drawableC3);
                                int i119 = a;
                                int i1110 = i119 & 43;
                                int i1111 = (i119 ^ 43) | i1110;
                                i2 = (i1110 & i1111) + (i1111 | i1110);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i1112 = 2 % 2;
                                }
                            }
                        } else {
                            iR = bC.r(0, 0);
                            if (iR != 0) {
                                CheckedTextView checkedTextView5 = c0318p.c;
                                Drawable drawableC4 = A.c(checkedTextView5.getContext(), iR);
                                int i1113 = a;
                                int i1114 = (i1113 & 31) + (i1113 | 31);
                                b = i1114 % 128;
                                int i1115 = i1114 % 2;
                                checkedTextView5.setCheckMarkDrawable(drawableC4);
                                int i1116 = a;
                                int i1117 = i1116 & 43;
                                int i1118 = (i1116 ^ 43) | i1117;
                                i2 = (i1117 & i1118) + (i1118 | i1117);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i1119 = 2 % 2;
                                }
                            }
                        }
                    }
                }
            }
            if (bC.t(2)) {
                int i33 = b;
                int i34 = (((i33 | 112) << 1) - (i33 ^ 112)) - 1;
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    checkedTextView = c0318p.c;
                    colorStateListH = bC.h(3);
                } else {
                    checkedTextView = c0318p.c;
                    colorStateListH = bC.h(2);
                }
                int i35 = a;
                int i36 = (i35 ^ 17) + ((i35 & 17) << 1);
                b = i36 % 128;
                int i37 = i36 % 2;
                checkedTextView.setCheckMarkTintList(colorStateListH);
                int i38 = b;
                int i39 = i38 & 95;
                int i40 = ((((i38 ^ 95) | i39) << 1) - (~(-((i38 | 95) & (~i39))))) - 1;
                a = i40 % 128;
                int i41 = i40 % 2;
                int i42 = 2 % 2;
            }
            if (bC.t(3)) {
                int i43 = b + 117;
                a = i43 % 128;
                int i44 = i43 % 2;
                CheckedTextView checkedTextView6 = c0318p.c;
                int iN = bC.n(3, -1);
                int i45 = a;
                int i46 = ((i45 & 104) + (i45 | 104)) - 1;
                b = i46 % 128;
                int i47 = i46 % 2;
                PorterDuff.Mode modeE = W.e(iN, null);
                int i48 = a;
                int i49 = (((i48 | 96) << 1) - (i48 ^ 96)) - 1;
                b = i49 % 128;
                int i50 = i49 % 2;
                checkedTextView6.setCheckMarkTintMode(modeE);
                int i51 = a;
                int i52 = i51 & 87;
                int i53 = (i51 | 87) & (~i52);
                int i54 = i52 << 1;
                int i55 = (i53 & i54) + (i53 | i54);
                b = i55 % 128;
                int i56 = i55 % 2;
                int i57 = 2 % 2;
            }
            bC.d.recycle();
            C0316l emojiTextViewHelper = getEmojiTextViewHelper();
            int i58 = b;
            int i59 = i58 & 9;
            int i60 = (i59 - (~((i58 ^ 9) | i59))) - 1;
            a = i60 % 128;
            if (i60 % 2 != 0) {
                emojiTextViewHelper.c(attributeSet, R.attr.checkedTextViewStyle);
                obj.hashCode();
                throw null;
            }
            emojiTextViewHelper.c(attributeSet, R.attr.checkedTextViewStyle);
            int i61 = b;
            int i62 = i61 ^ 91;
            int i63 = -(-((i61 & 91) << 1));
            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
            a = i64 % 128;
            if (i64 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            bC.d.recycle();
            throw th;
        }
    }

    private C0316l getEmojiTextViewHelper() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.f == null) {
            this.f = new C0316l(this);
            int i7 = b;
            int i8 = (((i7 | 32) << 1) - (i7 ^ 32)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        C0316l c0316l = this.f;
        int i10 = a;
        int i11 = i10 & 21;
        int i12 = i10 | 21;
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        return c0316l;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 103) << 1) - (((~i2) & 103) | (i2 & (-104)));
        a = i3 % 128;
        int i4 = i3 % 2;
        ActionMode.Callback callbackF = l.f(super.getCustomSelectionActionModeCallback());
        int i5 = a;
        int i6 = i5 & 53;
        int i7 = i6 + ((i5 ^ 53) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return callbackF;
    }

    public ColorStateList getSupportBackgroundTintList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-20)) | ((~i2) & 19)) + ((i2 & 19) << 1);
        int i4 = i3 % 128;
        b = i4;
        ColorStateList colorStateListE = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        r rVar = this.d;
        if (rVar != null) {
            int i5 = i2 + 21;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                rVar.e();
                throw null;
            }
            colorStateListE = rVar.e();
        } else {
            int i6 = i4 & 89;
            int i7 = i6 + ((i4 ^ 89) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = a;
        int i10 = i9 & 121;
        int i11 = ((i9 ^ 121) | i10) << 1;
        int i12 = -((i9 | 121) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        return colorStateListE;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 62) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        r rVar = this.d;
        Object obj = null;
        if (rVar != null) {
            int i6 = i4 | 101;
            int i7 = i6 << 1;
            int i8 = -(i6 & (~(i4 & 101)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                modeF = rVar.f();
                int i10 = 42 / 0;
            } else {
                modeF = rVar.f();
            }
        } else {
            int i11 = i2 + 97;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 2;
            }
            modeF = null;
        }
        int i13 = b;
        int i14 = i13 ^ 71;
        int i15 = ((((i13 & 71) | i14) << 1) - (~(-i14))) - 1;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return modeF;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c A[PHI: r1
  0x001c: PHI (r1v5 ivas.gov.bisp.enumeration.k.p) = (r1v4 ivas.gov.bisp.enumeration.k.p), (r1v10 ivas.gov.bisp.enumeration.k.p) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    public ColorStateList getSupportCheckMarkTintList() {
        C0318p c0318p;
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = b + 33;
        int i3 = i2 % 128;
        a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            c0318p = this.c;
            int i4 = 90 / 0;
            if (c0318p != null) {
                int i5 = ((i3 | 119) << 1) - (i3 ^ 119);
                b = i5 % 128;
                int i6 = i5 % 2;
                colorStateList = c0318p.d;
                int i7 = a;
                int i8 = ((i7 | 61) << 1) - (((~i7) & 61) | (i7 & (-62)));
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = i3 + 99;
                b = i10 % 128;
                int i11 = i10 % 2;
                colorStateList = null;
            }
        } else {
            c0318p = this.c;
            if (c0318p != null) {
                int i12 = ((i3 | 119) << 1) - (i3 ^ 119);
                b = i12 % 128;
                int i13 = i12 % 2;
                colorStateList = c0318p.d;
                int i14 = a;
                int i15 = ((i14 | 61) << 1) - (((~i14) & 61) | (i14 & (-62)));
                b = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = i3 + 99;
                b = i17 % 128;
                int i18 = i17 % 2;
                colorStateList = null;
            }
        }
        int i19 = b;
        int i20 = ((i19 ^ 77) | (i19 & 77)) << 1;
        int i21 = -(((~i19) & 77) | (i19 & (-78)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return colorStateList;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = (i2 | 67) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
        int i8 = a + 89;
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 73;
        a = i11 % 128;
        int i12 = i11 % 2;
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        V v;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 73;
        int i4 = (((i2 & 73) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            super.setAllCaps(z);
            v = getEmojiTextViewHelper().d;
            int i5 = 33 / 0;
        } else {
            super.setAllCaps(z);
            v = getEmojiTextViewHelper().d;
        }
        int i6 = a + 12;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        v.c.d(z);
        int i9 = b;
        int i10 = (i9 & 54) + (i9 | 54);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (((i2 | 73) & (~i3)) - (~(i3 << 1))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i7 = (((i5 ^ 11) | (i5 & 11)) << 1) - (((~i5) & 11) | (i5 & (-12)));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                rVar.c(mode);
                int i8 = 41 / 0;
            } else {
                rVar.c(mode);
            }
            int i9 = a + 107;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (((i11 | 48) << 1) - (i11 ^ 48)) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        C0318p c0318p = this.c;
        if (i6 != 0) {
            int i7 = 14 / 0;
            if (c0318p != null) {
                c0318p.d = colorStateList;
                c0318p.f = true;
                c0318p.c();
                int i8 = a;
                int i9 = (i8 ^ 33) + ((i8 & 33) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (c0318p != null) {
            c0318p.d = colorStateList;
            c0318p.f = true;
            c0318p.c();
            int i11 = a;
            int i12 = (i11 ^ 33) + ((i11 & 33) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = i14 & 9;
        int i16 = -(-((i14 ^ 9) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = -(-((i2 ^ 41) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        C0318p c0318p = this.c;
        if (c0318p != null) {
            int i7 = i6 & 83;
            int i8 = ((((i6 ^ 83) | i7) << 1) - (~(-((i6 | 83) & (~i7))))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            c0318p.e = mode;
            c0318p.h = true;
            c0318p.c();
            int i10 = a;
            int i11 = (i10 ^ 3) + ((i10 & 3) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (i13 & (-8)) | ((~i13) & 7);
        int i15 = (i13 & 7) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v8 ivas.gov.bisp.enumeration.k.v) = (r1v7 ivas.gov.bisp.enumeration.k.v), (r1v9 ivas.gov.bisp.enumeration.k.v) binds: [B:8:0x002f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        C0322v c0322v;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 43;
        int i5 = ((i3 ^ 43) | i4) << 1;
        int i6 = -((i3 | 43) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            super.setTextAppearance(context, i);
            c0322v = this.e;
            int i8 = 92 / 0;
            if (c0322v != null) {
                c0322v.h(context, i);
                int i9 = a;
                int i10 = (i9 ^ 83) + ((i9 & 83) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            super.setTextAppearance(context, i);
            c0322v = this.e;
            if (c0322v != null) {
                c0322v.h(context, i);
                int i12 = a;
                int i13 = (i12 ^ 83) + ((i12 & 83) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = b;
        int i16 = (i15 ^ 23) + ((i15 & 23) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = i2 | 91;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            super.drawableStateChanged();
            throw null;
        }
        super.drawableStateChanged();
        C0322v c0322v = this.e;
        if (c0322v != null) {
            c0322v.f();
            int i6 = a;
            int i7 = (i6 & 61) + (i6 | 61);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 5;
            }
        }
        r rVar = this.d;
        if (rVar != null) {
            int i9 = b;
            int i10 = (i9 ^ 107) + ((i9 & 107) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            rVar.d();
            int i12 = a;
            int i13 = (i12 & 123) + (i12 | 123);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        C0318p c0318p = this.c;
        if (c0318p != null) {
            int i15 = a;
            int i16 = (i15 ^ 105) + ((i15 & 105) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            c0318p.c();
            if (i17 == 0) {
                obj.hashCode();
                throw null;
            }
            int i18 = b + 103;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b + 87;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        PorterDuff.Mode mode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 44) + ((i2 & 44) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        C0318p c0318p = this.c;
        if (c0318p != null) {
            int i5 = (i2 & 83) + (i2 | 83);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                mode = c0318p.e;
                int i6 = 87 / 0;
            } else {
                mode = c0318p.e;
            }
            int i7 = b;
            int i8 = (-2) - (((i7 & 40) + (i7 | 40)) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 4;
            }
        } else {
            int i10 = i2 ^ 115;
            int i11 = ((i2 & 115) | i10) << 1;
            int i12 = -i10;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 / 5;
            }
            mode = null;
        }
        int i15 = a;
        int i16 = i15 & 115;
        int i17 = (i15 | 115) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return mode;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 ivas.gov.bisp.enumeration.k.r) = (r4v1 ivas.gov.bisp.enumeration.k.r), (r4v17 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        r rVar;
        int i = 2 % 2;
        int i2 = b + 81;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            super.setBackgroundDrawable(drawable);
            rVar = this.d;
            int i3 = 76 / 0;
            if (rVar != null) {
                rVar.i();
                int i4 = a;
                int i5 = i4 & 43;
                int i6 = -(-(i4 | 43));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            super.setBackgroundDrawable(drawable);
            rVar = this.d;
            if (rVar != null) {
                rVar.i();
                int i9 = a;
                int i10 = i9 & 43;
                int i11 = -(-(i9 | 43));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        int i14 = b;
        int i15 = ((((i14 ^ 15) | (i14 & 15)) << 1) - (~(-(((~i14) & 15) | (i14 & (-16)))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 117) | (i3 & 117)) << 1) - (((~i3) & 117) | (i3 & (-118)));
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
            int i5 = a + 59;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = b;
        int i8 = i7 & 113;
        int i9 = -(-((i7 ^ 113) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 91;
        int i4 = -(-((i2 & 91) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            super.setCustomSelectionActionModeCallback(l.h(this, callback));
        } else {
            super.setCustomSelectionActionModeCallback(l.h(this, callback));
            int i6 = 60 / 0;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 26) + (i2 | 26)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        r rVar = this.d;
        if (rVar != null) {
            int i5 = i2 & 11;
            int i6 = -(-((i2 ^ 11) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                rVar.k(colorStateList);
                int i8 = 98 / 0;
            } else {
                rVar.k(colorStateList);
            }
        }
        int i9 = b;
        int i10 = (i9 & 49) + (i9 | 49);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (i2 | 19) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            getEmojiTextViewHelper().d.c.e(z);
            return;
        }
        getEmojiTextViewHelper().d.c.e(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b + 119;
        a = i2 % 128;
        int i3 = i2 % 2;
        super.setCheckMarkDrawable(drawable);
        C0318p c0318p = this.c;
        if (c0318p != null) {
            int i4 = b;
            int i5 = ((i4 & 95) - (~(-(-(i4 | 95))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            if (c0318p.g) {
                int i7 = a;
                int i8 = i7 ^ 3;
                int i9 = ((((i7 & 3) | i8) << 1) - (~(-i8))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                c0318p.g = false;
                int i11 = b;
                int i12 = ((i11 & (-34)) | ((~i11) & 33)) + ((i11 & 33) << 1);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 63 / 0;
                    return;
                }
                return;
            }
            c0318p.g = true;
            c0318p.c();
            int i14 = b;
            int i15 = i14 & 73;
            int i16 = i15 + ((i14 ^ 73) | i15);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = (((i18 & (-16)) | ((~i18) & 15)) - (~((i18 & 15) << 1))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 27;
        int i5 = -(-((i3 ^ 27) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        setCheckMarkDrawable(A.c(getContext(), i));
        int i8 = b;
        int i9 = ((i8 & (-36)) | ((~i8) & 35)) + ((i8 & 35) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
