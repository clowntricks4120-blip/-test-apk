package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.bM.V;
import ivas.gov.bisp.enumeration.p006af.h;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0316l {
    private static int a = 0;
    private static int b = 1;
    public final TextView c;
    public final V d;

    public C0316l(TextView textView) {
        this.c = textView;
        this.d = new V(textView, false);
    }

    public void d(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 25) | (i2 & 25)) << 1) - (((~i2) & 25) | (i2 & (-26)));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.c.e(z);
        int i5 = b;
        int i6 = (((i5 ^ 95) | (i5 & 95)) << 1) - (((~i5) & 95) | (i5 & (-96)));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 97 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.content.res.TypedArray] */
    public void c(AttributeSet attributeSet, int i) {
        boolean zHasValue;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 9) - (~((i3 & 9) << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.getContext();
            int[] iArr = h.c;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context = this.c.getContext();
        int[] iArr2 = h.c;
        int i5 = (-2) - ((b + 78) ^ (-1));
        a = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 1);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(97);
                attributeSet = typedArrayObtainStyledAttributes;
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                zHasValue = typedArrayObtainStyledAttributes2.hasValue(14);
                attributeSet = typedArrayObtainStyledAttributes2;
            }
            int i6 = a;
            int i7 = (i6 ^ 35) + ((i6 & 35) << 1);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            if (zHasValue) {
                int i10 = i8 & 83;
                int i11 = (((i8 | 83) & (~i10)) - (~(i10 << 1))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                z = attributeSet.getBoolean(14, true);
                int i13 = b;
                int i14 = i13 & 117;
                int i15 = (i13 ^ 117) | i14;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
            } else {
                z = true;
            }
            attributeSet.recycle();
            d(z);
            int i18 = a;
            int i19 = i18 ^ 5;
            int i20 = ((i18 & 5) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        } catch (Throwable th) {
            attributeSet.recycle();
            throw th;
        }
    }
}
