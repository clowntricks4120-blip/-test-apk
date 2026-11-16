package ivas.gov.bisp.enumeration.U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public class u extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.textfield.c c;

    public u(com.google.android.material.textfield.c cVar) {
        this.c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        CheckableImageButton checkableImageButton;
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 2) + (i2 | 2)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            com.google.android.material.textfield.c cVar = this.c;
            checkableImageButton = cVar.e;
            z = cVar.k;
            int i4 = 53 / 0;
        } else {
            com.google.android.material.textfield.c cVar2 = this.c;
            checkableImageButton = cVar2.e;
            z = cVar2.k;
        }
        int i5 = b;
        int i6 = i5 | 53;
        int i7 = ((i6 << 1) - (~(-((~(i5 & 53)) & i6)))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            checkableImageButton.setChecked(z);
            this.c.q.start();
        } else {
            checkableImageButton.setChecked(z);
            this.c.q.start();
            int i8 = 17 / 0;
        }
    }
}
