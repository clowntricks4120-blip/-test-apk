package ivas.gov.bisp.enumeration.p002ab;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N {
    private static int a = 1;
    private static int b;
    public final int[] c;
    public final float[] d;

    public N(List<Integer> list, List<Float> list2) {
        float fFloatValue;
        int size = list.size();
        this.c = new int[size];
        this.d = new float[size];
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < size) {
            int i3 = a;
            int i4 = i3 & 55;
            int i5 = (i4 - (~((i3 ^ 55) | i4))) - 1;
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                list.get(i2);
                obj.hashCode();
                throw null;
            }
            int[] iArr = this.c;
            Integer num = list.get(i2);
            int i6 = b;
            int i7 = (i6 ^ 125) + ((i6 & 125) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                iArr[i2] = num.intValue();
                obj.hashCode();
                throw null;
            }
            iArr[i2] = num.intValue();
            float[] fArr = this.d;
            int i8 = b;
            int i9 = i8 | 61;
            int i10 = (i9 << 1) - ((~(i8 & 61)) & i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                fFloatValue = list2.get(i2).floatValue();
                int i11 = 95 / 0;
            } else {
                fFloatValue = list2.get(i2).floatValue();
            }
            fArr[i2] = fFloatValue;
            int i12 = i2 & 1;
            int i13 = (i2 | 1) & (~i12);
            int i14 = i12 << 1;
            i2 = ((i13 & i14) << 1) + (i13 ^ i14);
            int i15 = a;
            int i16 = ((i15 | 13) << 1) - (i15 ^ 13);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = i18 & 119;
        int i20 = (i18 ^ 119) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    public N(int i, int i2) {
        this.c = new int[]{i, i2};
        this.d = new float[]{0.0f, 1.0f};
    }

    public N(int i, int i2, int i3) {
        this.c = new int[]{i, i2, i3};
        this.d = new float[]{0.0f, 0.5f, 1.0f};
    }
}
