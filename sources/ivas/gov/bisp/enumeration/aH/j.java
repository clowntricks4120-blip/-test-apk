package ivas.gov.bisp.enumeration.aH;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ r c;

    public j(r rVar) {
        this.c = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 17;
        int i4 = ((i2 & 17) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.e();
        int i8 = a + 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (i3 - (~((i2 ^ 33) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.b();
            int i5 = 32 / 0;
        } else {
            this.c.b();
        }
        int i6 = b;
        int i7 = i6 & 19;
        int i8 = (i6 | 19) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }
}
