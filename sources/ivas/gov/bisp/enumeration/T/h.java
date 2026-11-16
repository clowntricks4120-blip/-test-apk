package ivas.gov.bisp.enumeration.T;

import android.util.Property;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class h extends Property<ViewGroup, Float> {
    private static int a = 1;
    private static int b;
    public static final Property<ViewGroup, Float> c = new h("childrenAlpha");

    static {
        int i = a;
        int i2 = i & 55;
        int i3 = (i | 55) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public h(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2;
        float fFloatValue;
        int childCount;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (i3 - (~((i2 ^ 117) | i3))) - 1;
        b = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            viewGroup2 = viewGroup;
            fFloatValue = f.floatValue();
            int i6 = 20 / 0;
        } else {
            viewGroup2 = viewGroup;
            fFloatValue = f.floatValue();
        }
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int i7 = a;
        int i8 = ((i7 ^ 48) + ((i7 & 48) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            childCount = viewGroup2.getChildCount();
            i5 = 1;
        } else {
            childCount = viewGroup2.getChildCount();
        }
        while (i5 < childCount) {
            int i9 = (-2) - ((a + 92) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            viewGroup2.getChildAt(i5).setAlpha(fFloatValue);
            int i11 = i5 ^ 73;
            i5 = ((((i5 & 73) | i11) << 1) - (~(-i11))) - 73;
            int i12 = a + 65;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = ((i14 | 39) << 1) - (i14 ^ 39);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = a + 12;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Float fValueOf = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
            int i4 = a;
            int i5 = ((i4 ^ 104) + ((i4 & 104) << 1)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = a;
        int i8 = i7 & 67;
        int i9 = -(-((i7 ^ 67) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return fValueOf;
        }
        obj.hashCode();
        throw null;
    }
}
