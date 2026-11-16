package ivas.gov.bisp.enumeration.da;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ BottomAppBar c;

    public h(BottomAppBar bottomAppBar) {
        this.c = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            BottomAppBar bottomAppBar = this.c;
            bottomAppBar.aa = bottomAppBar.aa;
        } else {
            BottomAppBar bottomAppBar2 = this.c;
            int i4 = bottomAppBar2.aa + 2;
            bottomAppBar2.aa = (i4 ^ (-1)) + (i4 << 1);
        }
        int i5 = b;
        int i6 = (i5 & (-24)) | ((~i5) & 23);
        int i7 = -(-((i5 & 23) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 58 / 0;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = ((i2 ^ 45) | i3) << 1;
        int i5 = -((i2 | 45) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        BottomAppBar.a(this.c);
        BottomAppBar bottomAppBar = this.c;
        int i8 = b;
        int i9 = (-2) - (((i8 ^ 44) + ((i8 & 44) << 1)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        Objects.requireNonNull(bottomAppBar);
        this.c.U = null;
        int i11 = b;
        int i12 = i11 & 49;
        int i13 = ((i11 ^ 49) | i12) << 1;
        int i14 = -((i11 | 49) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
    }
}
