package ivas.gov.bisp.enumeration.Q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.j;
import ivas.gov.bisp.enumeration.p081d.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 1;
    private static int b;
    public final Rect c;
    public final ColorStateList d;
    public final ColorStateList e;
    public final ColorStateList f;
    public final ivas.gov.bisp.enumeration.O.t g;
    public final int h;

    public c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ivas.gov.bisp.enumeration.O.t tVar, Rect rect) {
        ivas.gov.bisp.enumeration.O.r.j(rect.left);
        ivas.gov.bisp.enumeration.O.r.j(rect.top);
        ivas.gov.bisp.enumeration.O.r.j(rect.right);
        ivas.gov.bisp.enumeration.O.r.j(rect.bottom);
        this.c = rect;
        this.d = colorStateList2;
        this.e = colorStateList;
        this.f = colorStateList3;
        this.h = i;
        this.g = tVar;
    }

    public final void d(TextView textView) {
        int i = 2 % 2;
        C0019p c0019p = new C0019p();
        C0019p c0019p2 = new C0019p();
        int i2 = b + 54;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        c0019p.setShapeAppearanceModel(this.g);
        c0019p2.setShapeAppearanceModel(this.g);
        int i5 = a;
        int i6 = i5 & 1;
        int i7 = -(-((i5 ^ 1) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            c0019p.u(this.e);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c0019p.u(this.e);
        c0019p.y(this.h, this.f);
        textView.setTextColor(this.d);
        RippleDrawable rippleDrawable = new RippleDrawable(this.d.withAlpha(30), c0019p, c0019p2);
        Rect rect = this.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int i9 = a;
        int i10 = i9 & 65;
        int i11 = i9 | 65;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        WeakHashMap<View, R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
        ivas.gov.bisp.enumeration.d.T.aWX.s(textView, insetDrawable);
        int i14 = a;
        int i15 = (((i14 ^ 1) | (i14 & 1)) << 1) - (((~i14) & 1) | (i14 & (-2)));
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 9 / 0;
        }
    }

    public static c c(Context context, int i) {
        boolean z;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        int dimensionPixelSize;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 91;
        int i5 = (((~i4) & (i3 | 91)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 75;
        if (i != 0) {
            int i8 = i3 & 75;
            int i9 = i8 + ((i3 ^ 75) | i8);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = ((i10 | 77) << 1) - (i10 ^ 77);
            a = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = ((i3 & 80) + (i3 | 80)) - 1;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 2;
            }
            z = false;
        }
        ivas.gov.bisp.enumeration.O.r.h(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ivas.gov.bisp.enumeration.O.r.z);
        int i16 = a;
        int i17 = ((i16 | 65) << 1) - (i16 ^ 65);
        b = i17 % 128;
        int i18 = i17 % 2;
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        int i19 = a + 69;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            colorStateListB = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 4);
        } else {
            colorStateListB = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 4);
            i7 = 9;
        }
        ColorStateList colorStateListB3 = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, i7);
        ColorStateList colorStateList = colorStateListB;
        int i20 = b;
        int i21 = (i20 & 103) + (i20 | 103);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            colorStateListB2 = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 17);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        } else {
            colorStateListB2 = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 7);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        ColorStateList colorStateList2 = colorStateListB2;
        int i22 = dimensionPixelSize;
        ivas.gov.bisp.enumeration.O.t tVarE = ivas.gov.bisp.enumeration.O.t.d(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new j(0.0f)).e();
        typedArrayObtainStyledAttributes.recycle();
        c cVar = new c(colorStateList, colorStateListB3, colorStateList2, i22, tVarE, rect);
        int i23 = b + 119;
        a = i23 % 128;
        int i24 = i23 % 2;
        return cVar;
    }
}
