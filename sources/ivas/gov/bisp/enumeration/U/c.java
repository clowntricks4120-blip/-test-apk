package ivas.gov.bisp.enumeration.U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.j;

/* JADX INFO: loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ j c;

    public c(j jVar) {
        this.c = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 125) + (i2 | 125);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.c.setEndIconVisible(true);
        int i5 = a + 23;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
