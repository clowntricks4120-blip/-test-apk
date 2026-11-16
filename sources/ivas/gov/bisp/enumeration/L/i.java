package ivas.gov.bisp.enumeration.L;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.stateListAnimator};

    static {
        int i = (47 << 1) - 47;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static void b(View view, float f) {
        int i = 2 % 2;
        int integer = view.getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        int i2 = (-2) - ((a + 42) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int[] iArr = {R.attr.state_enabled, ivas.gov.bisp.enumeration.R.attr.state_liftable, -2130969387};
        float[] fArr = {0.0f};
        int i5 = i3 & 1;
        int i6 = (i3 ^ 1) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            ObjectAnimator.ofFloat(view, "elevation", fArr).setDuration(integer);
            throw null;
        }
        long j = integer;
        stateListAnimator.addState(iArr, ObjectAnimator.ofFloat(view, "elevation", fArr).setDuration(j));
        int[] iArr2 = {R.attr.state_enabled};
        int i8 = b;
        int i9 = (((i8 | 72) << 1) - (i8 ^ 72)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j);
        int i11 = b;
        int i12 = (-2) - (((i11 & 32) + (i11 | 32)) ^ (-1));
        a = i12 % 128;
        int i13 = i12 % 2;
        stateListAnimator.addState(iArr2, duration);
        int i14 = b;
        int i15 = (i14 ^ 63) + ((i14 & 63) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "elevation", 0.0f);
        int i17 = b;
        int i18 = i17 & 1;
        int i19 = -(-((i17 ^ 1) | i18));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        stateListAnimator.addState(new int[0], objectAnimatorOfFloat.setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
        int i22 = b;
        int i23 = (i22 & (-82)) | ((~i22) & 81);
        int i24 = -(-((i22 & 81) << 1));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
    }
}
