package ivas.gov.bisp.enumeration.p015ao;

import android.view.animation.Interpolator;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class at implements Interpolator {
    private static int a = 1;
    private static int b;
    public final float[] c;
    public final float d;

    public at(float[] fArr) {
        this.c = fArr;
        int length = fArr.length;
        int i = length ^ (-1);
        int i2 = (length | i) << 1;
        int i3 = -i;
        this.d = 1.0f / ((i2 ^ i3) + ((i2 & i3) << 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int iMin;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0 ? f >= 1.0f : f >= 0.0f) {
            int i5 = ((i2 & 62) + (i2 | 62)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return 1.0f;
            }
            throw null;
        }
        if (f <= 0.0f) {
            int i6 = (i2 & 61) + (i2 | 61);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i2 & 5) - (~(-(-(i2 | 5))))) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return 0.0f;
            }
            throw null;
        }
        float[] fArr = this.c;
        int length = fArr.length;
        float f2 = (((~length) - (~(-(-(length << 1))))) - 1) * f;
        int i9 = i4 & 81;
        int i10 = ((i4 ^ 81) | i9) << 1;
        int i11 = -((i4 | 81) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = (int) f2;
        if (i12 % 2 != 0) {
            int length2 = fArr.length;
            int i14 = length2 & (-2);
            iMin = Math.min(i13, i14 + ((length2 ^ (-2)) | i14));
        } else {
            int length3 = fArr.length;
            int i15 = (length3 | (-2)) << 1;
            int i16 = -(length3 ^ (-2));
            iMin = Math.min(i13, (i15 ^ i16) + ((i16 & i15) << 1));
        }
        float f3 = this.d;
        float f4 = (f - (iMin * f3)) / f3;
        int i17 = a;
        int i18 = (i17 ^ 69) + ((i17 & 69) << 1);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            float f5 = this.c[iMin];
            obj.hashCode();
            throw null;
        }
        float[] fArr2 = this.c;
        float f6 = fArr2[iMin];
        int i19 = ((i17 & 30) + (i17 | 30)) - 1;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return j.e(fArr2[iMin], f6, f4, f6);
        }
        int i20 = iMin & 1;
        return j.e(fArr2[i20 + ((iMin ^ 1) | i20)], f6, f4, f6);
    }
}
