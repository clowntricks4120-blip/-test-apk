package ivas.gov.bisp.enumeration.U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.j;

/* JADX INFO: loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ j c;

    public h(j jVar) {
        this.c = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (((i2 | 55) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.c.setEndIconVisible(false);
        int i6 = a;
        int i7 = i6 & 107;
        int i8 = -(-((i6 ^ 107) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }
}
