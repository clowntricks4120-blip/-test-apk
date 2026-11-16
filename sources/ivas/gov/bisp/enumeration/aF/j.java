package ivas.gov.bisp.enumeration.aF;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ivas.gov.bisp.enumeration.O.C0019p;

/* JADX INFO: loaded from: classes.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ BottomSheetBehavior c;

    public j(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheetBehavior bottomSheetBehavior = this.c;
        int i4 = a;
        int i5 = i4 & 71;
        int i6 = ((i4 | 71) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            C0019p c0019p = bottomSheetBehavior.a;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0019p c0019p2 = bottomSheetBehavior.a;
        if (c0019p2 != null) {
            c0019p2.t(fFloatValue);
            int i7 = a;
            int i8 = ((i7 ^ 9) | (i7 & 9)) << 1;
            int i9 = -(((~i7) & 9) | (i7 & (-10)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = (-2) - (((i12 & 108) + (i12 | 108)) ^ (-1));
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
