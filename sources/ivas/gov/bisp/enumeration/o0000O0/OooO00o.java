package ivas.gov.bisp.enumeration.o0000O0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.OooOOO0.o00Ooo;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aQ.J;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o extends o00Ooo {
    private static int a = 0;
    private static int b = 1;
    public static final int[][] g;
    public ColorStateList h;
    public boolean i;

    static {
        int[] iArr = {R.attr.state_enabled, -16842912};
        int i = ((1 & (-46)) | ((~1) & 45)) + ((1 & 45) << 1);
        a = i % 128;
        int i2 = i % 2;
        int i3 = 1 - (-76);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        g = new int[][]{new int[]{R.attr.state_enabled, R.attr.state_checked}, iArr, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        int i6 = 1 & 99;
        int i7 = (1 ^ 99) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public OooO00o(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.radioButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, ivas.gov.bisp.enumeration.R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, r.D, ivas.gov.bisp.enumeration.R.attr.radioButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayE.hasValue(0)) {
            setButtonTintList(h.b(context2, typedArrayE, 0));
            int i = b;
            int i2 = (i & (-72)) | ((~i) & 71);
            int i3 = -(-((i & 71) << 1));
            int i4 = (i2 & i3) + (i3 | i2);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.i = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        int i7 = b;
        int i8 = ((i7 ^ 67) | (i7 & 67)) << 1;
        int i9 = -(((~i7) & 67) | (i7 & (-68)));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 93;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.i = z;
            throw null;
        }
        this.i = z;
        if (!z) {
            setButtonTintList(null);
            int i4 = b;
            int i5 = (i4 & 67) + (i4 | 67);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = i2 & 1;
        int i7 = (i2 | 1) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        setButtonTintList(getMaterialThemeColorsTintList());
        int i11 = b;
        int i12 = (i11 & 93) + (i11 | 93);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 22 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = -(-((i2 & 81) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            super.onAttachedToWindow();
            throw null;
        }
        super.onAttachedToWindow();
        if (this.i) {
            int i6 = b;
            int i7 = i6 & 7;
            int i8 = i7 + ((i6 ^ 7) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            ColorStateList buttonTintList = getButtonTintList();
            if (i9 != 0) {
                int i10 = 50 / 0;
                if (buttonTintList == null) {
                    int i11 = b;
                    int i12 = i11 & 89;
                    int i13 = ((i11 ^ 89) | i12) << 1;
                    int i14 = -((i11 | 89) & (~i12));
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    setUseMaterialThemeColors(true);
                    int i17 = a;
                    int i18 = ((i17 & 83) - (~(-(-(i17 | 83))))) - 1;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else if (buttonTintList == null) {
                int i110 = b;
                int i111 = i110 & 89;
                int i112 = ((i110 ^ 89) | i111) << 1;
                int i113 = -((i110 | 89) & (~i111));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                a = i114 % 128;
                int i115 = i114 % 2;
                setUseMaterialThemeColors(true);
                int i116 = a;
                int i117 = ((i116 & 83) - (~(-(-(i116 | 83))))) - 1;
                b = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        int i20 = a;
        int i21 = (-2) - (((i20 ^ 58) + ((i20 & 58) << 1)) ^ (-1));
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        int iU;
        int iU2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.h == null) {
            int i8 = i6 + 18;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                iU = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorControlActivated);
                iU2 = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorOnSurface);
                int i10 = 13 / 0;
            } else {
                iU = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorControlActivated);
                iU2 = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorOnSurface);
            }
            int iU3 = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorSurface);
            int[][] iArr = g;
            int[] iArr2 = new int[iArr.length];
            int i11 = a;
            int i12 = ((i11 ^ 63) | (i11 & 63)) << 1;
            int i13 = -(((~i11) & 63) | (i11 & (-64)));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                iArr2[1] = r.v(iU3, iU, 2.0f);
            } else {
                iArr2[0] = r.v(iU3, iU, 1.0f);
            }
            int iV = r.v(iU3, iU2, 0.54f);
            int i15 = b;
            int i16 = ((i15 ^ 27) - (~(-(-((i15 & 27) << 1))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            iArr2[1] = iV;
            iArr2[2] = r.v(iU3, iU2, 0.38f);
            iArr2[3] = r.v(iU3, iU2, 0.38f);
            ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
            int i18 = a;
            int i19 = (((i18 | 115) << 1) - (~(-(i18 ^ 115)))) - 1;
            int i20 = i19 % 128;
            b = i20;
            if (i19 % 2 == 0) {
                this.h = colorStateList;
                throw null;
            }
            this.h = colorStateList;
            int i21 = (i20 ^ 81) + ((i20 & 81) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        ColorStateList colorStateList2 = this.h;
        int i23 = b;
        int i24 = ((i23 ^ 66) + ((i23 & 66) << 1)) - 1;
        a = i24 % 128;
        int i25 = i24 % 2;
        return colorStateList2;
    }
}
