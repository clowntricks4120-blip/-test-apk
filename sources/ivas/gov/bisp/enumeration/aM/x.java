package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ivas.gov.bisp.enumeration.p001aa.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class x extends AnimatorListenerAdapter {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ r c;
    public final /* synthetic */ J d;

    public x(J j, r rVar) {
        this.d = j;
        this.c = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = (i2 | 77) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ArrayList<Animator> arrayList = this.d.q;
        if (i7 != 0) {
            arrayList.add(animator);
        } else {
            arrayList.add(animator);
            throw null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 3) + (i2 | 3);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.remove(animator);
            ArrayList<Animator> arrayList = this.d.q;
            throw null;
        }
        this.c.remove(animator);
        this.d.q.remove(animator);
        int i4 = a;
        int i5 = (i4 & 19) + (i4 | 19);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
