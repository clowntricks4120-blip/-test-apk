package ivas.gov.bisp.enumeration.P;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static int a = 1;
    private static int b;
    public final ArrayList<beJ> c = new ArrayList<>();
    public beJ d = null;
    public ValueAnimator e = null;
    public final Animator.AnimatorListener f = new beI();

    public class beI extends AnimatorListenerAdapter {
        private static int a = 1;
        private static int b;

        public beI() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-118)) | ((~i2) & 117)) + ((i2 & 117) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            z zVar = z.this;
            Object obj = null;
            if (zVar.e == animator) {
                int i5 = a;
                int i6 = i5 & 45;
                int i7 = i5 | 45;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                zVar.e = null;
                int i10 = b;
                int i11 = ((i10 & 3) - (~(-(-(i10 | 3))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = a;
            int i14 = (i13 & 35) + (i13 | 35);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static class beJ {
        public final int[] a;
        public final ValueAnimator b;

        public beJ(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public final void c(int[] iArr, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        beJ bej = new beJ(iArr, valueAnimator);
        int i2 = a;
        int i3 = ((i2 & (-86)) | ((~i2) & 85)) + ((i2 & 85) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        valueAnimator.addListener(this.f);
        this.c.add(bej);
        int i5 = b;
        int i6 = i5 & 19;
        int i7 = ((~i6) & (i5 | 19)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i5 + 81;
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
