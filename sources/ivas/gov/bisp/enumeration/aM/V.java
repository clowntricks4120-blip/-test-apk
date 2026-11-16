package ivas.gov.bisp.enumeration.aM;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class V extends am {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.aM.R, ivas.gov.bisp.enumeration.p006af.h
    public float m(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        a = i3 % 128;
        int i4 = i3 % 2;
        float transitionAlpha = view.getTransitionAlpha();
        int i5 = b;
        int i6 = (i5 | 51) << 1;
        int i7 = -(i5 ^ 51);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return transitionAlpha;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.A, ivas.gov.bisp.enumeration.p006af.h
    public void o(View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 ^ 113) - (~(-(-((i6 & 113) << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        view.setLeftTopRightBottom(i, i2, i3, i4);
        int i9 = a + 27;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.am, ivas.gov.bisp.enumeration.p006af.h
    public void p(View view, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 31) + (i3 | 31);
        b = i4 % 128;
        int i5 = i4 % 2;
        view.setTransitionVisibility(i);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = a;
        int i7 = i6 ^ 17;
        int i8 = (((i6 & 17) | i7) << 1) - i7;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.R, ivas.gov.bisp.enumeration.p006af.h
    public void q(View view, float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = ((i2 ^ 31) | i3) << 1;
        int i5 = -((i2 | 31) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        view.setTransitionAlpha(f);
        int i8 = a + 41;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.C0077v, ivas.gov.bisp.enumeration.p006af.h
    public void r(View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 33;
        int i4 = (((i2 & 33) | i3) << 1) - i3;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            view.transformMatrixToGlobal(matrix);
            return;
        }
        view.transformMatrixToGlobal(matrix);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.C0077v, ivas.gov.bisp.enumeration.p006af.h
    public void s(View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-86)) | ((~i2) & 85)) + ((i2 & 85) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        view.transformMatrixToLocal(matrix);
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        int i6 = b;
        int i7 = i6 & 85;
        int i8 = i6 | 85;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }
}
