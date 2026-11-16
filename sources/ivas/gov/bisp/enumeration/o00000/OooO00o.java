package ivas.gov.bisp.enumeration.o00000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.OooOOO0.OooO;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aQ.J;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o extends OooO {
    private static int a = 0;
    private static int b = 1;
    public static final int[][] g;
    public ColorStateList h;
    public boolean i;

    static {
        int[] iArr;
        int[][] iArr2 = new int[4][];
        int[] iArr3 = {R.attr.state_enabled, R.attr.state_checked};
        int i = (109 << 1) - ((~0) & 109);
        int i2 = i % 128;
        b = i2;
        if (i % 2 == 0) {
            iArr2[0] = iArr3;
            iArr2[0] = new int[]{R.attr.state_enabled, -16842912};
            iArr = new int[]{-16842910, R.attr.state_checked};
        } else {
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{R.attr.state_enabled, -16842912};
            iArr = new int[]{-16842910, R.attr.state_checked};
        }
        int i3 = i2 & 19;
        int i4 = (~i3) & (i2 | 19);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        iArr2[2] = iArr;
        iArr2[3] = new int[]{-16842910, -16842912};
        int i9 = ((i7 ^ 99) | (i7 & 99)) << 1;
        int i10 = -(((~i7) & 99) | (i7 & (-100)));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        g = iArr2;
        int i14 = i12 & 13;
        int i15 = ((((i12 ^ 13) | i14) << 1) - (~(-((i12 | 13) & (~i14))))) - 1;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OooO00o(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.checkboxStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, ivas.gov.bisp.enumeration.R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, r.B, ivas.gov.bisp.enumeration.R.attr.checkboxStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (typedArrayE.hasValue(0)) {
            setButtonTintList(h.b(context2, typedArrayE, 0));
            int i = a + 121;
            b = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.i = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        int i3 = b;
        int i4 = (i3 & 31) + (i3 | 31);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        a = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        if (this.i) {
            int i5 = b + 113;
            a = i5 % 128;
            int i6 = i5 % 2;
            if (getButtonTintList() == null) {
                int i7 = a;
                int i8 = i7 & 97;
                int i9 = -(-((i7 ^ 97) | i8));
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    setUseMaterialThemeColors(false);
                } else {
                    setUseMaterialThemeColors(true);
                }
                int i11 = b;
                int i12 = ((i11 | 73) << 1) - (i11 ^ 73);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 % 3;
                }
            }
        }
        int i14 = a;
        int i15 = (-2) - (((i14 ^ 38) + ((i14 & 38) << 1)) ^ (-1));
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.i = z;
        Object obj = null;
        if (!z) {
            setButtonTintList(null);
            int i7 = a + 37;
            b = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = ((i2 | 91) << 1) - (i2 ^ 91);
        a = i9 % 128;
        int i10 = i9 % 2;
        setButtonTintList(getMaterialThemeColorsTintList());
        int i11 = a + 66;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        char c;
        int i = 2 % 2;
        int i2 = b + 101;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (this.h == null) {
            int i5 = i3 & 3;
            int i6 = (i5 - (~((i3 ^ 3) | i5))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int[] iArr = new int[g.length];
                r.u(this, ivas.gov.bisp.enumeration.R.attr.colorControlActivated);
                throw null;
            }
            int[][] iArr2 = g;
            int[] iArr3 = new int[iArr2.length];
            int iU = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorControlActivated);
            int iU2 = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorSurface);
            int iU3 = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorOnSurface);
            int i7 = b + 55;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                iArr3[1] = r.v(iU2, iU, 2.0f);
                c = 0;
            } else {
                iArr3[0] = r.v(iU2, iU, 1.0f);
                c = 1;
            }
            int i8 = a;
            int i9 = ((i8 ^ 84) + ((i8 & 84) << 1)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            iArr3[c] = r.v(iU2, iU3, 0.54f);
            iArr3[2] = r.v(iU2, iU3, 0.38f);
            iArr3[3] = r.v(iU2, iU3, 0.38f);
            ColorStateList colorStateList = new ColorStateList(iArr2, iArr3);
            int i11 = b;
            int i12 = ((i11 ^ 97) | (i11 & 97)) << 1;
            int i13 = -(((~i11) & 97) | (i11 & (-98)));
            int i14 = (i12 & i13) + (i13 | i12);
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            this.h = colorStateList;
            int i17 = i15 + 48;
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        ColorStateList colorStateList2 = this.h;
        int i20 = a;
        int i21 = (i20 & 117) + (i20 | 117);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 7 / 0;
        }
        return colorStateList2;
    }
}
