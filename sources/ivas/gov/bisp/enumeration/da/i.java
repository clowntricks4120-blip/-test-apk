package ivas.gov.bisp.enumeration.da;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ BottomAppBar c;

    public i(BottomAppBar bottomAppBar) {
        this.c = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 13) + (i2 | 13);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Objects.requireNonNull(this.c);
            throw null;
        }
        Objects.requireNonNull(this.c);
        throw null;
    }
}
