package ivas.gov.bisp.enumeration.aM;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p006af.h;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u extends AbstractC0075s {
    private static int a = 1;
    private static int b;

    public class bHo extends N {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ View c;

        public bHo(u uVar, View view) {
            this.c = view;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 119;
            int i4 = (i2 ^ 119) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            View view = i5 % 2 == 0 ? this.c : this.c;
            h hVar = L.c;
            hVar.q(view, 1.0f);
            hVar.l(this.c);
            j.y(this);
            int i6 = a;
            int i7 = ((i6 & 23) - (~(i6 | 23))) - 1;
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i9 = i8 ^ 41;
            int i10 = -(-((i8 & 41) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public static class bHp extends AnimatorListenerAdapter {
        private static int a = 1;
        private static int b;
        public final View c;
        public boolean d = false;

        public bHp(View view) {
            this.c = view;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0038  */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 78) << 1) - (i2 ^ 78);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            L.c.q(this.c, 1.0f);
            int i6 = b + 73;
            int i7 = i6 % 128;
            a = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                int i8 = 74 / 0;
                if (this.d) {
                    int i9 = ((i7 ^ 92) + ((i7 & 92) << 1)) - 1;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    this.c.setLayerType(0, null);
                    int i11 = b;
                    int i12 = i11 & 79;
                    int i13 = i12 + ((i11 ^ 79) | i12);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else if (this.d) {
                int i15 = ((i7 ^ 92) + ((i7 & 92) << 1)) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                this.c.setLayerType(0, null);
                int i17 = b;
                int i18 = i17 & 79;
                int i19 = i18 + ((i17 ^ 79) | i18);
                a = i19 % 128;
                int i110 = i19 % 2;
            }
            int i20 = a;
            int i21 = i20 | 37;
            int i22 = i21 << 1;
            int i23 = -((~(i20 & 37)) & i21);
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 69;
            int i4 = ((i2 ^ 69) | i3) << 1;
            int i5 = -((i2 | 69) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            View view = this.c;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
            if (ivas.gov.bisp.enumeration.d.T.aWX.j(view)) {
                int i8 = a + 13;
                b = i8 % 128;
                int i9 = i8 % 2;
                if (this.c.getLayerType() == 0) {
                    int i10 = b + 22;
                    int i11 = (i10 ^ (-1)) + (i10 << 1);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    this.d = true;
                    this.c.setLayerType(2, null);
                    int i13 = b;
                    int i14 = (i13 & 51) + (i13 | 51);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            int i16 = b + 37;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 35 / 0;
            }
        }
    }

    public u(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.A = i;
        int i2 = b + 31;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final Animator M(View view, float f, float f2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 29;
        int i4 = ((i2 & 29) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (f == f2) {
            int i8 = i7 & 87;
            int i9 = (((~i8) & (i7 | 87)) - (~(-(-(i8 << 1))))) - 1;
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 121;
            int i13 = (i10 | 121) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return null;
            }
            throw null;
        }
        L.c.q(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, L.d, f2);
        objectAnimatorOfFloat.addListener(new bHp(view));
        bHo bho = new bHo(this, view);
        int i16 = a;
        int i17 = i16 & 25;
        int i18 = ((((i16 ^ 25) | i17) << 1) - (~(-((i16 | 25) & (~i17))))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        g(bho);
        int i20 = b;
        int i21 = (i20 & 75) + (i20 | 75);
        a = i21 % 128;
        int i22 = i21 % 2;
        return objectAnimatorOfFloat;
    }

    public u() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r5
  0x0050: PHI (r5v5 java.lang.Float) = (r5v4 java.lang.Float), (r5v16 java.lang.Float) binds: [B:12:0x004e, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    @Override // ivas.gov.bisp.enumeration.aM.AbstractC0075s
    public Animator L(ViewGroup viewGroup, View view, T t, T t2) {
        Object obj;
        Float f;
        float fFloatValue;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 29) + (i2 | 29);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            L.c.n(view);
            obj = t.c.get("android:fade:transitionAlpha");
            int i4 = 90 / 0;
        } else {
            L.c.n(view);
            obj = t.c.get("android:fade:transitionAlpha");
        }
        int i5 = a;
        int i6 = i5 & 11;
        int i7 = (((i5 | 11) & (~i6)) - (~(i6 << 1))) - 1;
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            f = (Float) obj;
            int i9 = 90 / 0;
            if (f != null) {
                fFloatValue = f.floatValue();
                int i10 = a;
                int i11 = i10 & 23;
                int i12 = ((i10 ^ 23) | i11) << 1;
                int i13 = -((i10 | 23) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = ((i8 ^ 71) - (~((i8 & 71) << 1))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                fFloatValue = 1.0f;
            }
        } else {
            f = (Float) obj;
            if (f != null) {
                fFloatValue = f.floatValue();
                int i18 = a;
                int i19 = i18 & 23;
                int i110 = ((i18 ^ 23) | i19) << 1;
                int i111 = -((i18 | 23) & (~i19));
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                b = i112 % 128;
                int i113 = i112 % 2;
            } else {
                int i114 = ((i8 ^ 71) - (~((i8 & 71) << 1))) - 1;
                a = i114 % 128;
                int i115 = i114 % 2;
                fFloatValue = 1.0f;
            }
        }
        Animator animatorM = M(view, fFloatValue, 0.0f);
        int i20 = b;
        int i21 = ((i20 | 35) << 1) - (i20 ^ 35);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return animatorM;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void l(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        b = i3 % 128;
        int i4 = i3 % 2;
        K(t);
        Map<String, Object> map = t.c;
        View view = t.d;
        int i5 = a;
        int i6 = (i5 & 5) + (i5 | 5);
        b = i6 % 128;
        int i7 = i6 % 2;
        map.put("android:fade:transitionAlpha", Float.valueOf(L.b(view)));
        int i8 = a;
        int i9 = (i8 ^ 77) + ((i8 & 77) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = (i8 & (-80)) | ((~i8) & 79);
        int i12 = (i8 & 79) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
