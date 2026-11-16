package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class M extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ J c;

    public M(J j) {
        this.c = j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = (((i2 ^ 79) | i3) << 1) - ((i2 | 79) & (~i3));
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.c.r();
            animator.removeListener(this);
            throw null;
        }
        this.c.r();
        animator.removeListener(this);
        int i5 = a + 11;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
