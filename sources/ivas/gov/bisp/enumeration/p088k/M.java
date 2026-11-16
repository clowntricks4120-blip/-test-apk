package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p089l.u;

/* JADX INFO: loaded from: classes.dex */
public class M extends PopupWindow {
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    public M(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int i3;
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.u, i, i2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            u.d(this, typedArrayObtainStyledAttributes.getBoolean(2, false));
            int i4 = b;
            int i5 = i4 & 29;
            int i6 = -(-((i4 ^ 29) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            int i9 = b;
            i3 = (((i9 | 14) << 1) - (i9 ^ 14)) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i10 = 2 % 3;
            } else {
                int i11 = 2 % 2;
            }
        } else {
            int i12 = b;
            int i13 = i12 & 43;
            int i14 = i13 + ((i12 ^ 43) | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                int i16 = a;
                int i17 = i16 ^ 97;
                int i18 = (((i16 & 97) | i17) << 1) - i17;
                b = i18 % 128;
                int i19 = i18 % 2;
                drawable = A.c(context, resourceId);
                int i20 = a;
                int i21 = ((i20 ^ 88) + ((i20 & 88) << 1)) - 1;
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 2 / 2;
                } else {
                    int i23 = 2 % 2;
                }
            } else {
                drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                int i24 = b;
                i3 = (((i24 | 14) << 1) - (i24 ^ 14)) - 1;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i110 = 2 % 3;
                } else {
                    int i111 = 2 % 2;
                }
            }
        }
        setBackgroundDrawable(drawable);
        typedArrayObtainStyledAttributes.recycle();
        int i25 = b;
        int i26 = i25 & 81;
        int i27 = (i25 | 81) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 27;
        int i6 = (((i4 | 27) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        super.showAsDropDown(view, i, i2);
        if (i7 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (((i6 ^ 103) | (i6 & 103)) << 1) - (((~i6) & 103) | (i6 & (-104)));
        a = i7 % 128;
        if (i7 % 2 == 0) {
            super.update(view, i, i2, i3, i4);
        } else {
            super.update(view, i, i2, i3, i4);
            throw null;
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & (-28)) | ((~i5) & 27);
        int i7 = (i5 & 27) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        super.showAsDropDown(view, i, i2, i3);
        int i10 = a;
        int i11 = i10 & 59;
        int i12 = (i10 ^ 59) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 52 / 0;
        }
    }
}
