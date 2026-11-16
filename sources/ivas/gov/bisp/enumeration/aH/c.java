package ivas.gov.bisp.enumeration.aH;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator b(r rVar, float f, float f2, float f3) {
        Property<r, r.bdX> property;
        TypeEvaluator<r.bdX> typeEvaluator;
        r.bdX[] bdxArr;
        int i = 2 % 2;
        int i2 = a + 11;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            property = r.bdV.c;
            typeEvaluator = r.bdU.c;
            bdxArr = new r.bdX[0];
        } else {
            property = r.bdV.c;
            typeEvaluator = r.bdU.c;
            bdxArr = new r.bdX[1];
        }
        r.bdX bdx = new r.bdX(f, f2, f3);
        int i3 = a;
        int i4 = i3 & 13;
        int i5 = (((i3 | 13) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            bdxArr[0] = bdx;
            ObjectAnimator.ofObject(rVar, (Property<r, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) bdxArr);
            obj.hashCode();
            throw null;
        }
        bdxArr[0] = bdx;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(rVar, (Property<r, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) bdxArr);
        r.bdX revealInfo = rVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        int i6 = b;
        int i7 = i6 ^ 107;
        int i8 = (i6 & 107) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        float f4 = revealInfo.c;
        int i11 = b;
        int i12 = ((i11 & 14) + (i11 | 14)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) rVar, (int) f, (int) f2, f4, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = a;
        int i15 = i14 & 125;
        int i16 = i15 + ((i14 ^ 125) | i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i14 & 23;
        int i19 = (((i14 | 23) & (~i18)) - (~(i18 << 1))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        int i21 = b + 79;
        int i22 = i21 % 128;
        a = i22;
        int i23 = i21 % 2;
        int i24 = i22 & 9;
        int i25 = ((i22 ^ 9) | i24) << 1;
        int i26 = -((i22 | 9) & (~i24));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        if (i27 % 2 == 0) {
            return animatorSet;
        }
        throw null;
    }
}
