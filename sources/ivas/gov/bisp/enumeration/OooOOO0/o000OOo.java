package ivas.gov.bisp.enumeration.OooOOO0;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p007ag.e;
import ivas.gov.bisp.enumeration.p007ag.u;
import ivas.gov.bisp.enumeration.p011ak.V;
import ivas.gov.bisp.enumeration.p088k.C0316l;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ae;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;
import ivas.gov.bisp.enumeration.p089l.InterfaceC0325p;
import ivas.gov.bisp.enumeration.p089l.l;
import ivas.gov.bisp.enumeration.p089l.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class o000OOo extends TextView implements o, InterfaceC0325p {
    private static int a = 0;
    private static int b = 1;
    public final r c;
    public final C0322v d;
    public final C0321u e;
    public boolean f;
    public C0316l g;
    public Future<V> h;

    public o000OOo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = ((((i2 & 103) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (InterfaceC0325p.a) {
            int i6 = a + 31;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return super.getAutoSizeMaxTextSize();
            }
            super.getAutoSizeMaxTextSize();
            throw null;
        }
        C0322v c0322v = this.d;
        if (c0322v == null) {
            int i7 = a;
            int i8 = ((i7 & 62) + (i7 | 62)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return -1;
        }
        int i10 = a;
        int i11 = (((i10 ^ 119) | (i10 & 119)) << 1) - (((~i10) & 119) | (i10 & (-120)));
        b = i11 % 128;
        int i12 = i11 % 2;
        int iRound = Math.round(c0322v.c.l);
        int i13 = b;
        int i14 = i13 & 125;
        int i15 = (i13 | 125) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return iRound;
        }
        throw null;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        Paint.FontMetricsInt fontMetricsInt;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = ((i2 ^ 23) | i3) << 1;
        int i5 = -((i2 | 23) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int paddingTop = getPaddingTop();
        TextPaint paint = getPaint();
        if (i7 != 0) {
            fontMetricsInt = paint.getFontMetricsInt();
            int i8 = 44 / 0;
        } else {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        int i9 = a;
        int i10 = i9 & 107;
        int i11 = i10 + ((i9 ^ 107) | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = -fontMetricsInt.top;
        int i14 = (paddingTop & i13) + (paddingTop | i13);
        int i15 = b;
        int i16 = ((i15 ^ 62) + ((i15 & 62) << 1)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        return i14;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 15;
        int i4 = ((i2 & 15) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int paddingBottom = getPaddingBottom();
        int i8 = getPaint().getFontMetricsInt().bottom;
        int i9 = b;
        int i10 = i9 & 7;
        int i11 = (i10 - (~(-(-((i9 ^ 7) | i10))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2 != 0 ? paddingBottom / i8 : (-2) - ((paddingBottom - (~i8)) ^ (-1));
        int i13 = i9 + 79;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        ae aeVar = this.d.k;
        if (aeVar != null) {
            int i6 = b;
            int i7 = ((i6 ^ 59) | (i6 & 59)) << 1;
            int i8 = -(((~i6) & 59) | (i6 & (-60)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            colorStateList = aeVar.a;
            int i11 = a;
            int i12 = (((i11 ^ 105) | (i11 & 105)) << 1) - (((~i11) & 105) | (i11 & (-106)));
            b = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = b;
            int i15 = i14 & 117;
            int i16 = -(-((i14 ^ 117) | i15));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            colorStateList = null;
        }
        int i19 = b;
        int i20 = (i19 | 3) << 1;
        int i21 = -(((~i19) & 3) | (i19 & (-4)));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
        return colorStateList;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        b = i3 % 128;
        PorterDuff.Mode mode = null;
        if (i3 % 2 == 0) {
            ae aeVar = this.d.k;
            throw null;
        }
        ae aeVar2 = this.d.k;
        if (aeVar2 != null) {
            int i4 = b;
            int i5 = ((i4 | 43) << 1) - (((~i4) & 43) | (i4 & (-44)));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                PorterDuff.Mode mode2 = aeVar2.b;
                mode.hashCode();
                throw null;
            }
            mode = aeVar2.b;
        } else {
            int i6 = b;
            int i7 = (i6 | 37) << 1;
            int i8 = -(((~i6) & 37) | (i6 & (-38)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 49;
        int i13 = (i11 | 49) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        return mode;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, PHI: r1
  0x001a: PHI (r1v5 java.util.concurrent.Future<ivas.gov.bisp.enumeration.ak.V>) = 
  (r1v4 java.util.concurrent.Future<ivas.gov.bisp.enumeration.ak.V>)
  (r1v16 java.util.concurrent.Future<ivas.gov.bisp.enumeration.ak.V>)
 binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<V> future;
        int i = 2 % 2;
        int i2 = b + 71;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            future = this.h;
            int i3 = 2 / 0;
            if (future != null) {
                try {
                    this.h = null;
                    V v = future.get();
                    int i4 = a;
                    int i5 = i4 & 7;
                    int i6 = -(-((i4 ^ 7) | i5));
                    int i7 = (i5 & i6) + (i6 | i5);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    l.g(this, v);
                    int i9 = a;
                    int i10 = ((((i9 ^ 119) | (i9 & 119)) << 1) - (~(-(((~i9) & 119) | (i9 & (-120)))))) - 1;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        } else {
            future = this.h;
            if (future != null) {
                this.h = null;
                V v2 = future.get();
                int i12 = a;
                int i13 = i12 & 7;
                int i14 = -(-((i12 ^ 7) | i13));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                l.g(this, v2);
                int i17 = a;
                int i18 = ((((i17 ^ 119) | (i17 & 119)) << 1) - (~(-(((~i17) & 119) | (i17 & (-120)))))) - 1;
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        CharSequence text = super.getText();
        int i20 = a;
        int i21 = i20 & 19;
        int i22 = -(-(i20 | 19));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            return text;
        }
        throw null;
    }

    public V.aWg getTextMetricsParamsCompat() {
        V.aWg awgB;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 76) + ((i2 & 76) << 1)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            awgB = l.b(this);
            int i4 = 12 / 0;
        } else {
            awgB = l.b(this);
        }
        int i5 = a;
        int i6 = (i5 & 59) + (i5 | 59);
        b = i6 % 128;
        int i7 = i6 % 2;
        return awgB;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 93;
        int i8 = (i6 | 93) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        if (InterfaceC0325p.a) {
            int i12 = a;
            int i13 = ((i12 & 60) + (i12 | 60)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            int i15 = a;
            int i16 = (-2) - ((((i15 | 96) << 1) - (i15 ^ 96)) ^ (-1));
            b = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            return;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i17 = b;
            int i18 = i17 & 67;
            int i19 = (((i17 | 67) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                c0322v.k(i, i2, i3, i4);
                int i20 = 80 / 0;
            } else {
                c0322v.k(i, i2, i3, i4);
            }
            int i21 = a;
            int i22 = i21 & 15;
            int i23 = i21 | 15;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = i26 & 79;
        int i28 = (i27 - (~(-(-((i26 ^ 79) | i27))))) - 1;
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = (i2 ^ 105) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setCustomSelectionActionModeCallback(l.h(this, callback));
        int i7 = b;
        int i8 = (i7 ^ 114) + ((i7 & 114) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            getEmojiTextViewHelper().d.c.c(inputFilterArr);
            throw null;
        }
        super.setFilters(getEmojiTextViewHelper().d.c.c(inputFilterArr));
        int i3 = a + 45;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 73;
        int i5 = (i3 & 73) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0 ? Build.VERSION.SDK_INT < 28 : Build.VERSION.SDK_INT < 67) {
            l.d(this, i);
            int i7 = a;
            int i8 = i7 ^ 91;
            int i9 = ((i7 & 91) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i12 = b;
        int i13 = ((i12 ^ 120) + ((i12 & 120) << 1)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            super.setLastBaselineToBottomHeight(i);
            throw null;
        }
        super.setLastBaselineToBottomHeight(i);
        int i14 = b;
        int i15 = i14 & 3;
        int i16 = (i14 | 3) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = -(-(i3 | 45));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        l.e(this, i);
        if (i7 == 0) {
            throw null;
        }
    }

    public void setPrecomputedText(V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 114) << 1) - (i2 ^ 114);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        l.g(this, v);
        int i6 = a;
        int i7 = i6 & 23;
        int i8 = ((i6 ^ 23) | i7) << 1;
        int i9 = -((i6 | 23) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 47 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 23) + ((i3 & 23) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            super.setTextAppearance(context, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setTextAppearance(context, i);
        C0322v c0322v = this.d;
        if (c0322v != null) {
            c0322v.h(context, i);
            int i5 = b + 121;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = a + 111;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 90 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0 ? Build.VERSION.SDK_INT < 28 : Build.VERSION.SDK_INT < 57) {
            int i3 = b + 109;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            C0321u c0321u = this.e;
            if (c0321u != null) {
                c0321u.d = textClassifier;
                int i4 = a + 43;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        super.setTextClassifier(textClassifier);
        int i5 = a;
        int i6 = i5 & 9;
        int i7 = -(-((i5 ^ 9) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setTextFuture(Future<V> future) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 51) + (i2 | 51);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            this.h = future;
            throw null;
        }
        this.h = future;
        if (future != null) {
            int i5 = i4 + 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                requestLayout();
                int i6 = 85 / 0;
            } else {
                requestLayout();
            }
        }
        int i7 = a;
        int i8 = i7 ^ 23;
        int i9 = (i7 & 23) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        this.f = false;
        ad.b(this, getContext());
        r rVar = new r(this);
        this.c = rVar;
        rVar.g(attributeSet, i);
        C0322v c0322v = new C0322v(this);
        this.d = c0322v;
        c0322v.i(attributeSet, i);
        c0322v.f();
        this.e = new C0321u(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private C0316l getEmojiTextViewHelper() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 35;
        int i4 = ((i2 & 35) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.g == null) {
            this.g = new C0316l(this);
            int i8 = a;
            int i9 = i8 & 23;
            int i10 = (i9 - (~((i8 ^ 23) | i9))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        C0316l c0316l = this.g;
        int i12 = b + 79;
        a = i12 % 128;
        int i13 = i12 % 2;
        return c0316l;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        int i = 2 % 2;
        int i2 = b + 27;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = InterfaceC0325p.a;
            obj.hashCode();
            throw null;
        }
        if (InterfaceC0325p.a) {
            int i3 = a;
            int i4 = (i3 & (-62)) | ((~i3) & 61);
            int i5 = -(-((i3 & 61) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                super.getAutoSizeMinTextSize();
                obj.hashCode();
                throw null;
            }
            int autoSizeMinTextSize = super.getAutoSizeMinTextSize();
            int i7 = b;
            int i8 = (i7 ^ 98) + ((i7 & 98) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return autoSizeMinTextSize;
        }
        C0322v c0322v = this.d;
        if (c0322v == null) {
            int i11 = a + 7;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        int i12 = b;
        int i13 = (((i12 & (-102)) | ((~i12) & 101)) - (~(-(-((i12 & 101) << 1))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        int iRound = Math.round(c0322v.c.j);
        int i15 = b;
        int i16 = (i15 & (-62)) | ((~i15) & 61);
        int i17 = (i15 & 61) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        return iRound;
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        b = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0 ? !InterfaceC0325p.a : !InterfaceC0325p.a) {
            C0322v c0322v = this.d;
            if (c0322v == null) {
                int i5 = b + 15;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    return 0;
                }
                throw null;
            }
            int i6 = b;
            int i7 = (i6 ^ 121) + ((i6 & 121) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = c0322v.c.g;
            int i10 = b + 23;
            a = i10 % 128;
            int i11 = i10 % 2;
            return i9;
        }
        int i12 = b;
        int i13 = ((i12 & 22) + (i12 | 22)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        if (super.getAutoSizeTextType() == 1) {
            int i15 = b;
            int i16 = (i15 & 39) + (i15 | 39);
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i15 & 81;
            int i19 = (i15 | 81) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            i4 = 1;
        }
        int i23 = b;
        int i24 = i23 | 61;
        int i25 = ((i24 << 1) - (~(-((~(i23 & 61)) & i24)))) - 1;
        a = i25 % 128;
        int i26 = i25 % 2;
        return i4;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = -(-((i2 ^ 85) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return l.f(super.getCustomSelectionActionModeCallback());
        }
        int i6 = 22 / 0;
        return l.f(super.getCustomSelectionActionModeCallback());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r2
  0x0020: PHI (r2v4 ivas.gov.bisp.enumeration.k.r) = (r2v3 ivas.gov.bisp.enumeration.k.r), (r2v16 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public ColorStateList getSupportBackgroundTintList() {
        r rVar;
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = i3 + ((i2 ^ 37) | i3);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            rVar = this.c;
            int i6 = 41 / 0;
            if (rVar != null) {
                colorStateListE = rVar.e();
                int i7 = a + 79;
                b = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = (((i5 | 8) << 1) - (i5 ^ 8)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                colorStateListE = null;
            }
        } else {
            rVar = this.c;
            if (rVar != null) {
                colorStateListE = rVar.e();
                int i11 = a + 79;
                b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = (((i5 | 8) << 1) - (i5 ^ 8)) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                colorStateListE = null;
            }
        }
        int i15 = a + 35;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return colorStateListE;
        }
        throw null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        int i = 2 % 2;
        int i2 = a + 81;
        int i3 = i2 % 128;
        b = i3;
        PorterDuff.Mode mode = null;
        if (i2 % 2 == 0) {
            mode.hashCode();
            throw null;
        }
        r rVar = this.c;
        if (rVar != null) {
            int i4 = i3 + 113;
            a = i4 % 128;
            int i5 = i4 % 2;
            PorterDuff.Mode modeF = rVar.f();
            if (i5 != 0) {
                int i6 = 75 / 0;
            }
            mode = modeF;
        } else {
            int i7 = i3 & 67;
            int i8 = -(-(i3 | 67));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 53;
        int i13 = i11 | 53;
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 60 / 0;
        }
        return mode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 ivas.gov.bisp.enumeration.k.v) = (r4v1 ivas.gov.bisp.enumeration.k.v), (r4v18 ivas.gov.bisp.enumeration.k.v) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C0322v c0322v;
        int i4;
        int i5 = 2 % 2;
        int i6 = a + 87;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            c0322v = this.d;
            int i7 = 68 / 0;
            if (c0322v != null) {
                if (!InterfaceC0325p.a) {
                    int i8 = b;
                    int i9 = i8 | 5;
                    i4 = ((i9 << 1) - (~(-((~(i8 & 5)) & i9)))) - 1;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i10 = 16 / 0;
                        if (c0322v.g()) {
                            this.d.c.f();
                            int i11 = b;
                            int i12 = (-2) - ((((i11 | 38) << 1) - (i11 ^ 38)) ^ (-1));
                            a = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    } else if (c0322v.g()) {
                        this.d.c.f();
                        int i14 = b;
                        int i15 = (-2) - ((((i14 | 38) << 1) - (i14 ^ 38)) ^ (-1));
                        a = i15 % 128;
                        int i16 = i15 % 2;
                    }
                }
            }
        } else {
            super.onTextChanged(charSequence, i, i2, i3);
            c0322v = this.d;
            if (c0322v != null) {
                if (!InterfaceC0325p.a) {
                    int i17 = b;
                    int i18 = i17 | 5;
                    i4 = ((i18 << 1) - (~(-((~(i17 & 5)) & i18)))) - 1;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i19 = 16 / 0;
                        if (c0322v.g()) {
                            this.d.c.f();
                            int i110 = b;
                            int i111 = (-2) - ((((i110 | 38) << 1) - (i110 ^ 38)) ^ (-1));
                            a = i111 % 128;
                            int i112 = i111 % 2;
                        }
                    } else if (c0322v.g()) {
                        this.d.c.f();
                        int i113 = b;
                        int i114 = (-2) - ((((i113 | 38) << 1) - (i113 ^ 38)) ^ (-1));
                        a = i114 % 128;
                        int i115 = i114 % 2;
                    }
                }
            }
        }
        int i20 = a;
        int i21 = i20 ^ 103;
        int i22 = ((i20 & 103) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 & i23) + (i22 | i23);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1
  0x0029: PHI (r1v7 ivas.gov.bisp.enumeration.k.r) = (r1v6 ivas.gov.bisp.enumeration.k.r), (r1v13 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x0027, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        r rVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 12) + (i4 | 12);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            super.setBackgroundResource(i);
            rVar = this.c;
            int i7 = 64 / 0;
            if (rVar != null) {
                int i8 = b;
                int i9 = i8 & 93;
                int i10 = (i8 | 93) & (~i9);
                int i11 = -(-(i9 << 1));
                i2 = (i10 & i11) + (i10 | i11);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    rVar.h(i);
                    int i12 = 51 / 0;
                } else {
                    rVar.h(i);
                }
                int i13 = b;
                int i14 = i13 & 113;
                int i15 = ((i13 ^ 113) | i14) << 1;
                int i16 = -((i13 | 113) & (~i14));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            super.setBackgroundResource(i);
            rVar = this.c;
            if (rVar != null) {
                int i19 = b;
                int i20 = i19 & 93;
                int i110 = (i19 | 93) & (~i20);
                int i111 = -(-(i20 << 1));
                i2 = (i110 & i111) + (i110 | i111);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    rVar.h(i);
                    int i112 = 51 / 0;
                } else {
                    rVar.h(i);
                }
                int i113 = b;
                int i114 = i113 & 113;
                int i115 = ((i113 ^ 113) | i114) << 1;
                int i116 = -((i113 | 113) & (~i114));
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                a = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        int i21 = b;
        int i22 = (i21 | 71) << 1;
        int i23 = -(((~i21) & 71) | (i21 & (-72)));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = ((i2 | 97) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0322v c0322v = this.d;
        int i6 = b;
        int i7 = i6 & 1;
        int i8 = i6 | 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        if (c0322v != null) {
            int i11 = i6 + 67;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                c0322v.f();
                int i12 = 85 / 0;
            } else {
                c0322v.f();
            }
            int i13 = b + 41;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = i15 & 121;
        int i17 = (i15 | 121) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = a + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0322v c0322v = this.d;
        int i4 = a;
        int i5 = (((i4 ^ 105) | (i4 & 105)) << 1) - (((~i4) & 105) | (i4 & (-106)));
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (c0322v != null) {
            int i8 = i6 & 43;
            int i9 = i8 + ((i6 ^ 43) | i8);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                c0322v.f();
                int i10 = 92 / 0;
            } else {
                c0322v.f();
            }
        }
        int i11 = b;
        int i12 = i11 ^ 61;
        int i13 = (i11 & 61) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 48) + (i2 | 48)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            throw null;
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0322v c0322v = this.d;
        int i4 = a;
        int i5 = (((i4 ^ 65) | (i4 & 65)) << 1) - (((~i4) & 65) | (i4 & (-66)));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
            if (c0322v != null) {
                c0322v.f();
                int i7 = a;
                int i8 = (i7 & 33) + (i7 | 33);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if (c0322v != null) {
            c0322v.f();
            int i10 = a;
            int i11 = (i10 & 33) + (i10 | 33);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = (-2) - (((i13 & 48) + (i13 | 48)) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        int i2 = 2 % 2;
        int i3 = b + 95;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            l.c(this, i);
            int i5 = b;
            int i6 = (i5 & 13) + (i5 | 13);
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = a;
        int i9 = (i8 ^ 88) + ((i8 & 88) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        super.setFirstBaselineToTopHeight(i);
        if (i11 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = ((~i3) & (i2 | 25)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i6 = (i2 & 89) + (i2 | 89);
            b = i6 % 128;
            int i7 = i6 % 2;
            rVar.k(colorStateList);
            int i8 = b + 89;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = (i10 & 11) + (i10 | 11);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 67) | (i2 & 67)) << 1;
        int i4 = -((i2 & (-68)) | ((~i2) & 67));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i7 = i2 & 67;
            int i8 = -(-(i2 | 67));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            rVar.c(mode);
            if (i10 != 0) {
                throw null;
            }
            int i11 = b + 9;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 & 83;
        int i15 = (i13 ^ 83) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p089l.o
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = ((i2 ^ 93) | i3) << 1;
        int i5 = -((i2 | 93) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.d.m(colorStateList);
        this.d.f();
        int i8 = a;
        int i9 = (i8 & 107) + (i8 | 107);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p089l.o
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.n(mode);
        this.d.f();
        int i5 = a;
        int i6 = (((i5 | 27) << 1) - (~(-(((~i5) & 27) | (i5 & (-28)))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            int i7 = a;
            int i8 = (-2) - (((i7 ^ 62) + ((i7 & 62) << 1)) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 == 0) {
                rVar.d();
                int i9 = 18 / 0;
            } else {
                rVar.d();
            }
        }
        C0322v c0322v = this.d;
        Object obj = null;
        if (c0322v != null) {
            int i10 = b;
            int i11 = i10 ^ 7;
            int i12 = ((i10 & 7) | i11) << 1;
            int i13 = -i11;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                c0322v.f();
                throw null;
            }
            c0322v.f();
            int i15 = a;
            int i16 = i15 & 41;
            int i17 = (((i15 ^ 41) | i16) << 1) - ((i15 | 41) & (~i16));
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = ((i19 ^ 46) + ((i19 & 46) << 1)) - 1;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 103) | (i2 & 103)) << 1;
        int i4 = -(((~i2) & 103) | (i2 & (-104)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (InterfaceC0325p.a) {
            int i7 = (-2) - ((a + 30) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return super.getAutoSizeTextAvailableSizes();
            }
            super.getAutoSizeTextAvailableSizes();
            throw null;
        }
        C0322v c0322v = this.d;
        if (c0322v == null) {
            int[] iArr = new int[0];
            int i8 = b + 105;
            a = i8 % 128;
            int i9 = i8 % 2;
            return iArr;
        }
        int i10 = a;
        int i11 = i10 | 79;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 79)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        int[] iArr2 = c0322v.c.k;
        int i16 = a;
        int i17 = ((i16 ^ 111) - (~(-(-((i16 & 111) << 1))))) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
        return iArr2;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-38)) | ((~i2) & 37)) - (~(-(-((i2 & 37) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            int i5 = a;
            int i6 = i5 ^ 111;
            int i7 = -(-((i5 & 111) << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            Object obj = null;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            C0321u c0321u = this.e;
            if (c0321u != null) {
                int i9 = i5 ^ 57;
                int i10 = -(-((i5 & 57) << 1));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                TextClassifier textClassifierM = c0321u.m();
                int i13 = b;
                int i14 = (i13 & (-80)) | ((~i13) & 79);
                int i15 = (i13 & 79) << 1;
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    return textClassifierM;
                }
                throw null;
            }
        }
        TextClassifier textClassifier = super.getTextClassifier();
        int i17 = a;
        int i18 = ((i17 & (-110)) | ((~i17) & 109)) + ((i17 & 109) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        return textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i = 2 % 2;
        int i2 = b + 117;
        a = i2 % 128;
        int i3 = i2 % 2;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0322v c0322v = this.d;
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = i5 + ((i4 ^ 39) | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            c0322v.j(this, inputConnectionOnCreateInputConnection, editorInfo);
            ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
            throw null;
        }
        c0322v.j(this, inputConnectionOnCreateInputConnection, editorInfo);
        ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
        int i7 = b;
        int i8 = i7 & 83;
        int i9 = (i7 ^ 83) | i8;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i7 & 17;
        int i13 = (i7 ^ 17) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 89 / 0;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        V v;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 29) + (i4 | 29);
        a = i5 % 128;
        int i6 = i5 % 2;
        Future<V> future = this.h;
        if (future != null) {
            int i7 = i4 & 7;
            int i8 = (i4 | 7) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    this.h = null;
                    v = future.get();
                    int i11 = 75 / 0;
                } else {
                    this.h = null;
                    v = future.get();
                }
                l.g(this, v);
                int i12 = a;
                int i13 = ((i12 | 1) << 1) - (i12 ^ 1);
                b = i13 % 128;
                int i14 = i13 % 2;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
        int i15 = b;
        int i16 = i15 ^ 31;
        int i17 = ((i15 & 31) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 11;
        int i5 = ((i3 ^ 11) | i4) << 1;
        int i6 = -((i3 | 11) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (InterfaceC0325p.a) {
            int i9 = b;
            int i10 = i9 & 61;
            int i11 = -(-((i9 ^ 61) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            super.setAutoSizeTextTypeWithDefaults(i);
            int i14 = b;
            int i15 = i14 & 107;
            int i16 = ((((i14 ^ 107) | i15) << 1) - (~(-((i14 | 107) & (~i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            return;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i18 = a;
            int i19 = i18 & 73;
            int i20 = -(-((i18 ^ 73) | i19));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            c0322v.l(i);
            int i23 = b + 115;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = b;
        int i26 = i25 & 103;
        int i27 = (((i25 ^ 103) | i26) << 1) - ((i25 | 103) & (~i26));
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 74 / 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            super.setBackgroundDrawable(drawable);
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.c;
        if (rVar != null) {
            rVar.i();
            int i3 = a;
            int i4 = i3 ^ 45;
            int i5 = ((i3 & 45) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 2;
            }
        }
        int i9 = b;
        int i10 = (i9 ^ 64) + ((i9 & 64) << 1);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 1;
        int i4 = (((i2 & 1) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0322v c0322v = this.d;
        int i6 = b;
        int i7 = ((i6 | 27) << 1) - (i6 ^ 27);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        if (c0322v != null) {
            c0322v.f();
            int i8 = a;
            int i9 = i8 ^ 11;
            int i10 = (i8 & 11) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = i13 ^ 49;
        int i15 = (i13 & 49) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = i3 + ((i2 ^ 7) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            ivas.gov.bisp.enumeration.bM.V.bxH bxh = getEmojiTextViewHelper().d.c;
            throw null;
        }
        ivas.gov.bisp.enumeration.bM.V.bxH bxh2 = getEmojiTextViewHelper().d.c;
        int i5 = b;
        int i6 = (-2) - (((i5 ^ 126) + ((i5 & 126) << 1)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
        bxh2.e(z);
        if (i7 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = a + 3;
        b = i7 % 128;
        int i8 = i7 % 2;
        super.onLayout(z, i, i2, i3, i4);
        C0322v c0322v = this.d;
        int i9 = b;
        int i10 = i9 & 87;
        int i11 = (i10 - (~((i9 ^ 87) | i10))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
            if (c0322v != null) {
                i5 = (-2) - ((i9 + 52) ^ (-1));
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z2 = InterfaceC0325p.a;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!InterfaceC0325p.a) {
                    c0322v.c.f();
                    int i13 = a;
                    int i14 = i13 ^ 27;
                    int i15 = ((i13 & 27) | i14) << 1;
                    int i16 = -i14;
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
        } else if (c0322v != null) {
            i5 = (-2) - ((i9 + 52) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z3 = InterfaceC0325p.a;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!InterfaceC0325p.a) {
                c0322v.c.f();
                int i19 = a;
                int i110 = i19 ^ 27;
                int i111 = ((i19 & 27) | i110) << 1;
                int i112 = -i110;
                int i113 = ((i111 | i112) << 1) - (i111 ^ i112);
                b = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i20 = b;
        int i21 = (i20 ^ 33) + ((i20 & 33) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 112) + (i2 | 112)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.setAllCaps(z);
            ivas.gov.bisp.enumeration.bM.V.bxH bxh = getEmojiTextViewHelper().d.c;
            throw null;
        }
        super.setAllCaps(z);
        ivas.gov.bisp.enumeration.bM.V.bxH bxh2 = getEmojiTextViewHelper().d.c;
        int i4 = (-2) - ((a + 64) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        bxh2.d(z);
        int i6 = b;
        int i7 = ((i6 ^ 120) + ((i6 & 120) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1 = r5.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b + 41;
        ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1.d(r6, r7);
        r6 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r1.d(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a + 5;
        ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a;
        r7 = r6 & 73;
        r7 = (r7 - (~(-(-((r6 ^ 73) | r7))))) - 1;
        ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if ((!ivas.gov.bisp.enumeration.p089l.InterfaceC0325p.a) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (ivas.gov.bisp.enumeration.p089l.InterfaceC0325p.a != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        super.setAutoSizeTextTypeUniformWithPresetSizes(r6, r7);
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b;
        r7 = ((r6 ^ 83) | (r6 & 83)) << 1;
        r6 = -(((~r6) & 83) | (r6 & (-84)));
        r1 = (r7 & r6) + (r6 | r7);
        ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a
            r2 = r1 ^ 109(0x6d, float:1.53E-43)
            r3 = r1 & 109(0x6d, float:1.53E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-110(0xffffffffffffff92, float:NaN))
            int r1 = ~r1
            r4 = 109(0x6d, float:1.53E-43)
            r1 = r1 & r4
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L26
            boolean r1 = ivas.gov.bisp.enumeration.p089l.InterfaceC0325p.a
            r2 = 64
            int r2 = r2 / 0
            r1 = r1 ^ 1
            if (r1 == 0) goto L2a
            goto L48
        L26:
            boolean r1 = ivas.gov.bisp.enumeration.p089l.InterfaceC0325p.a
            if (r1 == 0) goto L48
        L2a:
            super.setAutoSizeTextTypeUniformWithPresetSizes(r6, r7)
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b
            r7 = r6 ^ 83
            r1 = r6 & 83
            r7 = r7 | r1
            int r7 = r7 << 1
            r1 = r6 & (-84)
            int r6 = ~r6
            r2 = 83
            r6 = r6 & r2
            r6 = r6 | r1
            int r6 = -r6
            r1 = r7 & r6
            r6 = r6 | r7
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a = r6
            int r1 = r1 % r0
            return
        L48:
            ivas.gov.bisp.enumeration.k.v r1 = r5.d
            if (r1 == 0) goto L6b
            int r2 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b
            int r2 = r2 + 41
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L5f
            r1.d(r6, r7)
            r6 = 75
            int r6 = r6 / 0
            goto L62
        L5f:
            r1.d(r6, r7)
        L62:
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a
            int r6 = r6 + 5
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b = r7
            int r6 = r6 % r0
        L6b:
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o000OOo.a
            r7 = r6 & 73
            r6 = r6 ^ 73
            r6 = r6 | r7
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6
            int r7 = r7 - r6
            int r7 = r7 + (-1)
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o000OOo.b = r6
            int r7 = r7 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o000OOo.setAutoSizeTextTypeUniformWithPresetSizes(int[], int):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawableC;
        Drawable drawableC2;
        Drawable drawableC3;
        int i5 = 2 % 2;
        int i6 = a + 77;
        b = i6 % 128;
        Drawable drawableC4 = null;
        if (i6 % 2 == 0) {
            getContext();
            drawableC4.hashCode();
            throw null;
        }
        Context context = getContext();
        if (i != 0) {
            drawableC = A.c(context, i);
            int i7 = a;
            int i8 = ((i7 & 80) + (i7 | 80)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = a;
            int i11 = i10 & 19;
            int i12 = (i10 ^ 19) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            drawableC = null;
        }
        if (i2 != 0) {
            int i15 = b;
            int i16 = (i15 & 83) + (i15 | 83);
            a = i16 % 128;
            int i17 = i16 % 2;
            drawableC2 = A.c(context, i2);
            int i18 = b;
            int i19 = (i18 ^ 25) + ((i18 & 25) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
        } else {
            int i21 = b;
            int i22 = i21 & 125;
            int i23 = (i21 ^ 125) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            int i25 = i24 % 2;
            drawableC2 = null;
        }
        if (i3 != 0) {
            int i26 = a + 105;
            b = i26 % 128;
            int i27 = i26 % 2;
            drawableC3 = A.c(context, i3);
            int i28 = b;
            int i29 = (i28 | 1) << 1;
            int i30 = -(((~i28) & 1) | (i28 & (-2)));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            int i32 = i31 % 2;
        } else {
            int i33 = a;
            int i34 = i33 | 5;
            int i35 = (i34 << 1) - ((~(i33 & 5)) & i34);
            b = i35 % 128;
            int i36 = i35 % 2;
            drawableC3 = null;
        }
        if (i4 != 0) {
            int i37 = b;
            int i38 = ((i37 ^ 19) - (~(-(-((i37 & 19) << 1))))) - 1;
            a = i38 % 128;
            int i39 = i38 % 2;
            drawableC4 = A.c(context, i4);
            int i40 = b + 81;
            a = i40 % 128;
            int i41 = i40 % 2;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
        C0322v c0322v = this.d;
        int i42 = b;
        int i43 = i42 & 95;
        int i44 = -(-((i42 ^ 95) | i43));
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        a = i45 % 128;
        int i46 = i45 % 2;
        if (c0322v != null) {
            int i47 = (i42 ^ 62) + ((i42 & 62) << 1);
            int i48 = (i47 ^ (-1)) + (i47 << 1);
            a = i48 % 128;
            int i49 = i48 % 2;
            c0322v.f();
            int i50 = a;
            int i51 = ((i50 & 108) + (i50 | 108)) - 1;
            b = i51 % 128;
            int i52 = i51 % 2;
        }
        int i53 = b;
        int i54 = (i53 & (-60)) | ((~i53) & 59);
        int i55 = (i53 & 59) << 1;
        int i56 = (i54 & i55) + (i55 | i54);
        a = i56 % 128;
        int i57 = i56 % 2;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 17) << 1) - (i3 ^ 17);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            boolean z = InterfaceC0325p.a;
            obj.hashCode();
            throw null;
        }
        boolean z2 = InterfaceC0325p.a;
        if (z2) {
            super.setTextSize(i, f);
            int i5 = b + 81;
            a = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i7 = a;
            int i8 = (i7 & 123) + (i7 | 123);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!z2) {
                int i10 = ((i7 ^ 71) | (i7 & 71)) << 1;
                int i11 = -(((~i7) & 71) | (i7 & (-72)));
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                if (!c0322v.g()) {
                    int i14 = b;
                    int i15 = i14 & 29;
                    int i16 = (((i14 ^ 29) | i15) << 1) - ((i14 | 29) & (~i15));
                    a = i16 % 128;
                    if (i16 % 2 != 0) {
                        c0322v.c.i(i, f);
                        throw null;
                    }
                    c0322v.c.i(i, f);
                }
            }
        }
        int i17 = b;
        int i18 = i17 ^ 73;
        int i19 = -(-((i17 & 73) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 107;
        int i5 = (i3 | 107) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        Typeface typefaceCreate = null;
        if (this.f) {
            int i10 = i8 + 5;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            typefaceCreate.hashCode();
            throw null;
        }
        if (typeface != null) {
            int i11 = ((((i8 ^ 17) | (i8 & 17)) << 1) - (~(-(((~i8) & 17) | (i8 & (-18)))))) - 1;
            int i12 = i11 % 128;
            a = i12;
            if (i11 % 2 != 0) {
                typefaceCreate.hashCode();
                throw null;
            }
            if (i > 0) {
                int i13 = ((i12 ^ 87) | (i12 & 87)) << 1;
                int i14 = -(((~i12) & 87) | (i12 & (-88)));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                Context context = getContext();
                u uVar = e.c;
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null");
                }
                int i17 = a;
                int i18 = i17 & 17;
                int i19 = (i17 ^ 17) | i18;
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                int i21 = i20 % 2;
                typefaceCreate = Typeface.create(typeface, i);
                int i22 = a;
                int i23 = ((i22 | 103) << 1) - (i22 ^ 103);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
        }
        this.f = true;
        if (typefaceCreate != null) {
            int i25 = b;
            int i26 = (i25 ^ 31) + ((i25 & 31) << 1);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 87 / 0;
            }
            int i28 = i25 & 67;
            int i29 = (i28 - (~((i25 ^ 67) | i28))) - 1;
            a = i29 % 128;
            int i30 = i29 % 2;
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
            this.f = false;
            int i31 = b;
            int i32 = (((i31 ^ 91) | (i31 & 91)) << 1) - (((~i31) & 91) | (i31 & (-92)));
            a = i32 % 128;
            int i33 = i32 % 2;
        } catch (Throwable th) {
            this.f = false;
            throw th;
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-80)) | ((~i2) & 79);
        int i4 = -(-((i2 & 79) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z = InterfaceC0325p.a;
            throw null;
        }
        if (InterfaceC0325p.a) {
            int autoSizeStepGranularity = super.getAutoSizeStepGranularity();
            int i6 = a + 83;
            b = i6 % 128;
            int i7 = i6 % 2;
            return autoSizeStepGranularity;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i8 = a;
            int i9 = (((i8 | 94) << 1) - (i8 ^ 94)) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return Math.round(c0322v.c.i);
            }
            Math.round(c0322v.c.i);
            throw null;
        }
        int i10 = a + 46;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return -1;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public void setTextMetricsParamsCompat(V.aWg awg) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 & 2) + (i5 | 2)) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0 ? (textDirectionHeuristic = awg.d) == TextDirectionHeuristics.FIRSTSTRONG_RTL : (textDirectionHeuristic = awg.d) == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            i = 1;
        } else {
            int i7 = a;
            int i8 = i7 & 51;
            int i9 = (i7 | 51) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                int i13 = b;
                int i14 = i13 & 67;
                int i15 = ((i13 ^ 67) | i14) << 1;
                int i16 = -((i13 | 67) & (~i14));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    int i19 = a + 21;
                    int i20 = i19 % 128;
                    b = i20;
                    int i21 = i19 % 2;
                    int i22 = (((i20 ^ 67) | (i20 & 67)) << 1) - (((~i20) & 67) | (i20 & (-68)));
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    i = 2;
                } else {
                    i = 4;
                    if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                        int i24 = b;
                        int i25 = i24 + 31;
                        a = i25 % 128;
                        i = i25 % 2 == 0 ? 3 : 4;
                        i2 = ((i24 & 21) - (~(i24 | 21))) - 1;
                        a = i2 % 128;
                    } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                        int i26 = b;
                        int i27 = i26 & 21;
                        int i28 = (~i27) & (i26 | 21);
                        int i29 = i27 << 1;
                        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = i26 ^ 49;
                        int i33 = ((i26 & 49) | i32) << 1;
                        int i34 = -i32;
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                    } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                        int i37 = a;
                        int i38 = (((i37 | 88) << 1) - (i37 ^ 88)) - 1;
                        b = i38 % 128;
                        i = i38 % 2 == 0 ? 3 : 5;
                        int i39 = (i37 ^ 109) + ((i37 & 109) << 1);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                    } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                        int i41 = a + 71;
                        b = i41 % 128;
                        i = i41 % 2 == 0 ? 44 : 6;
                    } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                        int i42 = b;
                        int i43 = (((i42 ^ 89) | (i42 & 89)) << 1) - (((~i42) & 89) | (i42 & (-90)));
                        int i44 = i43 % 128;
                        a = i44;
                        i = i43 % 2 != 0 ? 76 : 7;
                        int i45 = i44 & 111;
                        i2 = (i45 - (~(-(-((i44 ^ 111) | i45))))) - 1;
                        b = i2 % 128;
                    } else {
                        i = 1;
                    }
                    int i46 = i2 % 2;
                }
            } else {
                i = 1;
            }
        }
        setTextDirection(i);
        TextPaint paint = getPaint();
        TextPaint textPaint = awg.c;
        int i47 = b;
        int i48 = i47 & 37;
        int i49 = (i47 ^ 37) | i48;
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        a = i50 % 128;
        if (i50 % 2 != 0) {
            paint.set(textPaint);
            i3 = awg.e;
            int i51 = 92 / 0;
        } else {
            paint.set(textPaint);
            i3 = awg.e;
        }
        setBreakStrategy(i3);
        setHyphenationFrequency(awg.f);
        int i52 = b;
        int i53 = (i52 ^ 39) + ((i52 & 39) << 1);
        a = i53 % 128;
        if (i53 % 2 != 0) {
            int i54 = 66 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[PHI: r2
  0x0030: PHI (r2v10 android.content.Context) = (r2v3 android.content.Context), (r2v11 android.content.Context) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r2
  0x0022: PHI (r2v4 android.content.Context) = (r2v3 android.content.Context), (r2v11 android.content.Context) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context;
        Drawable drawableC;
        Drawable drawableC2;
        Drawable drawableC3;
        Drawable drawableC4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 89) + (i6 | 89);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            context = getContext();
            int i8 = 3 / 0;
            if (i != 0) {
                drawableC = A.c(context, i);
                int i9 = b + 113;
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = b;
                int i12 = ((i11 & (-70)) | ((~i11) & 69)) + ((i11 & 69) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                drawableC = null;
            }
        } else {
            context = getContext();
            if (i != 0) {
                drawableC = A.c(context, i);
                int i14 = b + 113;
                a = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = b;
                int i17 = ((i16 & (-70)) | ((~i16) & 69)) + ((i16 & 69) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                drawableC = null;
            }
        }
        if (i2 != 0) {
            int i19 = b + 109;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                A.c(context, i2);
                throw null;
            }
            drawableC2 = A.c(context, i2);
        } else {
            int i20 = a;
            int i21 = i20 ^ 9;
            int i22 = (i20 & 9) << 1;
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 3 / 3;
            }
            drawableC2 = null;
        }
        if (i3 != 0) {
            int i25 = (-2) - ((a + 12) ^ (-1));
            b = i25 % 128;
            if (i25 % 2 == 0) {
                A.c(context, i3);
                obj.hashCode();
                throw null;
            }
            drawableC3 = A.c(context, i3);
            int i26 = a;
            int i27 = (i26 ^ 45) + ((i26 & 45) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        } else {
            int i29 = a;
            int i30 = ((i29 & 78) + (i29 | 78)) - 1;
            b = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 5 / 4;
            }
            drawableC3 = null;
        }
        if (i4 != 0) {
            int i32 = a;
            int i33 = i32 & 29;
            int i34 = (i32 ^ 29) | i33;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            b = i35 % 128;
            int i36 = i35 % 2;
            drawableC4 = A.c(context, i4);
            int i37 = a;
            int i38 = ((i37 | 93) << 1) - (i37 ^ 93);
            b = i38 % 128;
            int i39 = i38 % 2;
        } else {
            drawableC4 = null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
        C0322v c0322v = this.d;
        int i40 = a;
        int i41 = i40 & 99;
        int i42 = -(-((i40 ^ 99) | i41));
        int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
        b = i43 % 128;
        int i44 = i43 % 2;
        if (c0322v != null) {
            int i45 = i40 & 123;
            int i46 = ((i40 ^ 123) | i45) << 1;
            int i47 = -((i40 | 123) & (~i45));
            int i48 = (i46 & i47) + (i47 | i46);
            b = i48 % 128;
            int i49 = i48 % 2;
            c0322v.f();
            if (i49 == 0) {
                throw null;
            }
        }
        int i50 = a;
        int i51 = ((i50 ^ 65) | (i50 & 65)) << 1;
        int i52 = -(((~i50) & 65) | (i50 & (-66)));
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        b = i53 % 128;
        if (i53 % 2 == 0) {
            throw null;
        }
    }
}
