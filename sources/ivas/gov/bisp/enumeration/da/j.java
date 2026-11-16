package ivas.gov.bisp.enumeration.da;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ BottomAppBar c;

    public j(BottomAppBar bottomAppBar) {
        this.c = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 103;
        int i5 = ((i3 ^ 103) | i4) << 1;
        int i6 = -((i3 | 103) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            bottomAppBar = this.c;
            int i8 = bottomAppBar.aa;
            i = 0;
        } else {
            bottomAppBar = this.c;
            i = bottomAppBar.aa + 1;
        }
        bottomAppBar.aa = i;
        int i9 = a;
        int i10 = (-2) - ((((i9 | 68) << 1) - (i9 ^ 68)) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 21;
        int i4 = -(-((i2 & 21) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            BottomAppBar.a(this.c);
            this.c.S = null;
        } else {
            BottomAppBar.a(this.c);
            this.c.S = null;
            int i6 = 27 / 0;
        }
    }
}
