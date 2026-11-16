package ivas.gov.bisp.enumeration.p091n;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import ivas.gov.bisp.enumeration.OooOOoo.OooOO0O;
import ivas.gov.bisp.enumeration.OooOOoo.OooOo00;
import ivas.gov.bisp.enumeration.cZ.h;
import ivas.gov.bisp.enumeration.cZ.p;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.u;
import ivas.gov.bisp.enumeration.p002ab.Q;
import ivas.gov.bisp.enumeration.p088k.K;
import ivas.gov.bisp.enumeration.p098t.j;
import ivas.gov.bisp.enumeration.p100w.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class c extends e {
    private static int a = 1;
    private static int b;
    public aPJ r;
    public aPL s;
    public int t;
    public boolean u;
    public int v;

    public static abstract class aPJ {
        private static int a = 0;
        private static int b = 1;

        public aPJ(aPI api) {
        }

        public boolean c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = (i3 - (~(-(-((i2 ^ 91) | i3))))) - 1;
            b = i4 % 128;
            return i4 % 2 == 0;
        }

        public void d() {
            int i = 2 % 2;
            int i2 = b + 27;
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        public abstract void e();

        public abstract void f();
    }

    public static class aPK extends aPJ {
        private static int a = 0;
        private static int b = 1;
        public final Animatable c;

        public aPK(Animatable animatable) {
            super(null);
            this.c = animatable;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void e() {
            int i = 2 % 2;
            int i2 = a + 41;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.start();
            int i4 = a;
            int i5 = ((((i4 ^ 123) | (i4 & 123)) << 1) - (~(-(((~i4) & 123) | (i4 & (-124)))))) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void f() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 7;
            int i4 = (i2 & 7) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.stop();
            if (i6 == 0) {
                int i7 = 97 / 0;
            }
        }
    }

    public static class aPL extends e.aPE {
        private static int a = 1;
        private static int b;
        public OooOO0O<Long> M;
        public OooOo00<Integer> N;

        public aPL(aPL apl, c cVar, Resources resources) {
            super(apl, cVar, resources);
            if (apl == null) {
                this.M = new C0083p();
                u uVar = new u();
                int i = b;
                int i2 = (i & 26) + (i | 26);
                int i3 = (i2 ^ (-1)) + (i2 << 1);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    this.N = uVar;
                    return;
                } else {
                    this.N = uVar;
                    int i4 = 41 / 0;
                    return;
                }
            }
            this.M = apl.M;
            OooOo00<Integer> oooOo00 = apl.N;
            int i5 = a;
            int i6 = i5 & 81;
            int i7 = ((i5 ^ 81) | i6) << 1;
            int i8 = -((~i6) & (i5 | 81));
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            this.N = oooOo00;
            int i11 = i5 ^ 95;
            int i12 = (i5 & 95) << 1;
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static long j(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 ^ 3;
            int i6 = (i4 & 3) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            long j = i;
            long j2 = i2;
            return i7 % 2 != 0 ? j2 & (j << 20) : j2 | (j << 32);
        }

        public int k(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 + 47;
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            if (i < 0) {
                int i7 = ((i3 | 84) << 1) - (i3 ^ 84);
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = ((i9 ^ 122) + ((i9 & 122) << 1)) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                Object objF = this.N.f(i, 0);
                int i13 = b;
                int i14 = i13 & 119;
                int i15 = (i14 - (~((i13 ^ 119) | i14))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                int iIntValue = ((Integer) objF).intValue();
                if (i16 == 0) {
                    int i17 = 90 / 0;
                }
                i6 = iIntValue;
                int i18 = a + 8;
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = b;
            int i22 = ((i21 ^ 87) | (i21 & 87)) << 1;
            int i23 = -(((~i21) & 87) | (i21 & (-88)));
            int i24 = (i22 & i23) + (i23 | i22);
            a = i24 % 128;
            int i25 = i24 % 2;
            return i6;
        }

        @Override // ivas.gov.bisp.enumeration.n.e.aPE, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            c cVar = new c(this, null);
            int i2 = b + 25;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return cVar;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.n.e.aPE, ivas.gov.bisp.enumeration.n.h.aPC
        public void h() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 96) << 1) - (i2 ^ 96)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                this.M = this.M.f();
                throw null;
            }
            this.M = this.M.f();
            OooOo00<Integer> oooOo00 = this.N;
            int i4 = a;
            int i5 = i4 & 3;
            int i6 = ((i4 | 3) & (~i5)) + (i5 << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                this.N = oooOo00.d();
            } else {
                this.N = oooOo00.d();
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.n.e.aPE, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            c cVar = new c(this, resources);
            int i2 = a;
            int i3 = (i2 | 7) << 1;
            int i4 = -(((~i2) & 7) | (i2 & (-8)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return cVar;
            }
            throw null;
        }
    }

    public static class aPM extends aPJ {
        private static int a = 0;
        private static int b = 1;
        public final h c;

        public aPM(h hVar) {
            super(null);
            this.c = hVar;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.start();
            int i5 = a;
            int i6 = ((i5 | 75) << 1) - (i5 ^ 75);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void f() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 21;
            int i4 = (((i2 ^ 21) | i3) << 1) - ((i2 | 21) & (~i3));
            a = i4 % 128;
            int i5 = i4 % 2;
            this.c.stop();
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class aPN extends aPJ {
        private static int a = 0;
        private static int b = 1;
        public final ObjectAnimator c;
        public final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aPN(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            long j;
            super(null);
            Object obj = null;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
                int i3 = a + 96;
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 4;
                } else {
                    int i6 = 2 % 2;
                }
            } else {
                int i7 = a;
                int i8 = ((i7 ^ 94) + ((i7 & 94) << 1)) - 1;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
                i = 0;
            }
            if (!z) {
                i2 = (~numberOfFrames) + (numberOfFrames << 1);
                int i10 = b;
                int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } else {
                int i14 = b;
                int i15 = i14 & 17;
                int i16 = (i14 | 17) & (~i15);
                int i17 = i15 << 1;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 2 % 2;
                i2 = 0;
            }
            aPO apo = new aPO(animationDrawable, z);
            int i21 = b + 32;
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            int i25 = (i23 & (-104)) | ((~i23) & 103);
            int i26 = -(-((i23 & 103) << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            int i29 = b;
            int i30 = i29 & 111;
            int i31 = (i29 ^ 111) | i30;
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                j.b(objectAnimatorOfInt, true);
                j = apo.e;
                int i33 = 60 / 0;
            } else {
                j.b(objectAnimatorOfInt, true);
                j = apo.e;
            }
            objectAnimatorOfInt.setDuration(j);
            objectAnimatorOfInt.setInterpolator(apo);
            this.d = z2;
            int i34 = a;
            int i35 = i34 & 57;
            int i36 = i35 + ((i34 ^ 57) | i35);
            b = i36 % 128;
            if (i36 % 2 == 0) {
                this.c = objectAnimatorOfInt;
                int i37 = 24 / 0;
            } else {
                this.c = objectAnimatorOfInt;
            }
            int i38 = i34 & 105;
            int i39 = (i38 - (~(-(-((i34 ^ 105) | i38))))) - 1;
            b = i39 % 128;
            if (i39 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public boolean c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 35;
            int i4 = -(-((i2 ^ 35) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            boolean z = this.d;
            int i7 = i6 + 101;
            b = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 60) << 1) - (i2 ^ 60)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.reverse();
            int i5 = a;
            int i6 = i5 | 59;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 59)) & i6);
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-54)) | ((~i2) & 53);
            int i4 = -(-((i2 & 53) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.start();
            if (i6 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.n.c.aPJ
        public void f() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 63;
            int i4 = i3 + ((i2 ^ 63) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            this.c.cancel();
            if (i5 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = 31 << 1;
        int i2 = -31;
        int i3 = (i & i2) + (i2 | i);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public c() {
        this(null, null);
    }

    @Override // ivas.gov.bisp.enumeration.p091n.e, ivas.gov.bisp.enumeration.p091n.h
    public h.aPC d() {
        int i = 2 % 2;
        Object obj = null;
        aPL apl = new aPL(this.s, this, null);
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = ((i2 & 51) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return apl;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p091n.e
    public e.aPE h() {
        int i = 2 % 2;
        aPL apl = new aPL(this.s, this, null);
        int i2 = b;
        int i3 = (i2 ^ 19) + ((i2 & 19) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        return apl;
    }

    public c(aPL apl, Resources resources) {
        super(null);
        this.t = -1;
        this.v = -1;
        aPL apl2 = new aPL(apl, this, resources);
        super.g(apl2);
        this.s = apl2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // ivas.gov.bisp.enumeration.p091n.e, ivas.gov.bisp.enumeration.p091n.h
    public void g(h.aPC apc) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (((i2 | 75) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        super.g(apc);
        if (apc instanceof aPL) {
            int i6 = b;
            int i7 = ((i6 ^ 31) | (i6 & 31)) << 1;
            int i8 = -(((~i6) & 31) | (i6 & (-32)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            this.s = (aPL) apc;
            int i12 = i10 & 83;
            int i13 = (i12 - (~(-(-((i10 ^ 83) | i12))))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 3;
            }
        }
        int i15 = b;
        int i16 = (-2) - (((i15 ^ 54) + ((i15 & 54) << 1)) ^ (-1));
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p091n.e, ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 121) + (i2 | 121);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.u) {
            super.mutate();
            this.s.h();
            int i4 = b;
            int i5 = (((i4 | 58) << 1) - (i4 ^ 58)) - 1;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            this.u = true;
            int i8 = i6 & 95;
            int i9 = -(-((i6 ^ 95) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = (-2) - (((i12 ^ 2) + ((i12 & 2) << 1)) ^ (-1));
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 69 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f A[DONT_INVERT] */
    @Override // ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = -(-(i3 | 25));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            super.setVisible(z, z2);
            throw null;
        }
        boolean visible = super.setVisible(z, z2);
        aPJ apj = this.r;
        if (apj != null) {
            int i7 = a + 53;
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 != 0) {
                int i9 = 62 / 0;
                if (!visible) {
                    int i10 = i8 & 117;
                    int i11 = i8 | 117;
                    i = (i10 & i11) + (i10 | i11);
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i12 = 6 / 0;
                        if (!(!z2)) {
                        }
                    } else if (z2) {
                    }
                }
            } else if (!visible) {
                int i13 = i8 & 117;
                int i14 = i8 | 117;
                i = (i13 & i14) + (i13 | i14);
                a = i % 128;
                if (i % 2 == 0) {
                    int i15 = 6 / 0;
                    if (!(!z2)) {
                    }
                } else if (z2) {
                }
            }
            if (z) {
                int i16 = ((i8 & (-36)) | ((~i8) & 35)) + ((i8 & 35) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                apj.e();
                int i18 = b;
                int i19 = i18 & 7;
                int i20 = (i18 ^ 7) | i19;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
            } else {
                jumpToCurrentState();
                int i23 = a;
                int i24 = i23 & 19;
                int i25 = (i23 ^ 19) | i24;
                int i26 = (i24 & i25) + (i25 | i24);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        }
        int i28 = b;
        int i29 = ((i28 & 80) + (i28 | 80)) - 1;
        a = i29 % 128;
        if (i29 % 2 != 0) {
            return visible;
        }
        obj.hashCode();
        throw null;
    }

    public static class aPO implements TimeInterpolator {
        private static int a = 0;
        private static int b = 1;
        public int[] c;
        public int d;
        public int e;

        public aPO(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.d = numberOfFrames;
            int[] iArr = this.c;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.c = new int[numberOfFrames];
                int i2 = a;
                int i3 = i2 ^ 67;
                int i4 = ((i2 & 67) | i3) << 1;
                int i5 = -i3;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 3;
                } else {
                    int i8 = 2 % 2;
                }
            }
            int[] iArr2 = this.c;
            int i9 = a;
            int i10 = (i9 & 105) + (i9 | 105);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 3;
            } else {
                int i12 = 2 % 2;
            }
            int i13 = 0;
            int i14 = 0;
            while (i13 < numberOfFrames) {
                int i15 = a;
                int i16 = i15 & 19;
                int i17 = (i15 ^ 19) | i16;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                int i19 = i18 % 128;
                b = i19;
                int i20 = i18 % 2;
                if (!z) {
                    int i21 = i15 + 95;
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 2 % 2;
                    }
                    i = i13;
                } else {
                    int i23 = (-2) - ((((i19 | 126) << 1) - (i19 ^ 126)) ^ (-1));
                    int i24 = i23 % 128;
                    a = i24;
                    if (i23 % 2 != 0) {
                        int i25 = numberOfFrames >>> i13;
                        int i26 = ~i25;
                        int i27 = -(-(i25 << 1));
                        i = ((i26 | i27) << 1) - (i27 ^ i26);
                    } else {
                        int i28 = -i13;
                        int i29 = (numberOfFrames ^ i28) + ((i28 & numberOfFrames) << 1);
                        int i30 = i29 ^ (-1);
                        i = ((i29 | i30) << 1) - i30;
                    }
                    int i31 = i24 & 59;
                    int i32 = (i24 ^ 59) | i31;
                    int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 2 % 2;
                }
                int duration = animationDrawable.getDuration(i);
                int i36 = a;
                int i37 = (((i36 | 9) << 1) - (~(-(i36 ^ 9)))) - 1;
                int i38 = i37 % 128;
                b = i38;
                if (i37 % 2 == 0) {
                    iArr2[i13] = duration;
                    i14 %= duration;
                    i13 = (i13 & 44) + (i13 | 44);
                } else {
                    iArr2[i13] = duration;
                    i14 = (i14 - (~duration)) - 1;
                    int i39 = (i13 & (-2)) | ((~i13) & 1);
                    int i40 = -(-((i13 & 1) << 1));
                    i13 = ((i39 | i40) << 1) - (i40 ^ i39);
                }
                int i41 = i38 ^ 11;
                int i42 = -(-((i38 & 11) << 1));
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                a = i43 % 128;
                if (i43 % 2 != 0) {
                    int i44 = 4 / 3;
                } else {
                    int i45 = 2 % 2;
                }
            }
            this.e = i14;
            int i46 = b;
            int i47 = ((i46 ^ 33) | (i46 & 33)) << 1;
            int i48 = -(((~i46) & 33) | (i46 & (-34)));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            a = i49 % 128;
            int i50 = i49 % 2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 119;
            int i4 = i3 + ((i2 ^ 119) | i3);
            int i5 = i4 % 128;
            a = i5;
            int i6 = (int) (i4 % 2 != 0 ? (f - this.e) % 0.5f : (f * this.e) + 0.5f);
            int i7 = this.d;
            int[] iArr = this.c;
            int i8 = i5 & 9;
            int i9 = (i5 | 9) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < i7) {
                int i14 = b;
                int i15 = (((i14 | 85) << 1) - (~(-(i14 ^ 85)))) - 1;
                int i16 = i15 % 128;
                a = i16;
                if (i15 % 2 != 0) {
                    int i17 = iArr[i13];
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i18 = iArr[i13];
                if (i6 < i18) {
                    break;
                }
                int i19 = -i18;
                i6 = ((i6 | i19) << 1) - (i6 ^ i19);
                int i20 = i13 + 51;
                i13 = (i20 | (-50)) + (i20 & (-50));
                int i21 = i16 & 49;
                int i22 = -(-((i16 ^ 49) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            if (i13 < i7) {
                int i25 = a;
                int i26 = (i25 & 109) + (i25 | 109);
                int i27 = i26 % 128;
                b = i27;
                f2 = (i26 % 2 == 0 ? i6 : i6) / this.e;
                int i28 = ((i27 ^ 55) | (i27 & 55)) << 1;
                int i29 = -(((~i27) & 55) | (i27 & (-56)));
                int i30 = (i28 & i29) + (i29 | i28);
                a = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = b;
                int i33 = (i32 & 113) + (i32 | 113);
                a = i33 % 128;
                int i34 = i33 % 2;
                f2 = 0.0f;
            }
            float f3 = (i13 / i7) + f2;
            int i35 = a + 101;
            b = i35 % 128;
            int i36 = i35 % 2;
            return f3;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 33) + (i2 | 33);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.jumpToCurrentState();
        aPJ apj = this.r;
        if (apj != null) {
            int i5 = a;
            int i6 = (((i5 | 6) << 1) - (i5 ^ 6)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                apj.f();
                this.r = null;
                int i7 = 44 / 0;
            } else {
                apj.f();
                this.r = null;
            }
            f(this.t);
            this.t = -1;
            int i8 = a;
            int i9 = i8 & 5;
            int i10 = i9 + ((i8 ^ 5) | i9);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                this.v = -1;
                int i11 = 85 / 0;
            } else {
                this.v = -1;
            }
            int i12 = i8 & 19;
            int i13 = ((i8 ^ 19) | i12) << 1;
            int i14 = -((i8 | 19) & (~i12));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = (i17 & (-104)) | ((~i17) & 103);
        int i19 = (i17 & 103) << 1;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 52 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0105  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123  */
    /* JADX WARN: Code duplicated, block: B:34:0x012d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0133 A[DONT_INVERT, PHI: r11
  0x0133: PHI (r11v12 int) = (r11v11 int), (r11v20 int) binds: [B:35:0x0131, B:32:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0174  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x0203  */
    /* JADX WARN: Code duplicated, block: B:56:0x022e  */
    /* JADX WARN: Code duplicated, block: B:58:0x023e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0240  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:63:0x028e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0298  */
    /* JADX WARN: Code duplicated, block: B:67:0x029c  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x031b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0371  */
    /* JADX WARN: Code duplicated, block: B:92:0x037b A[PHI: r5
  0x037b: PHI (r5v2 boolean) = (r5v1 boolean), (r5v52 boolean) binds: [B:13:0x0051, B:85:0x034c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v7 ivas.gov.bisp.enumeration.n.c$aPL) = (r3v6 ivas.gov.bisp.enumeration.n.c$aPL), (r3v82 ivas.gov.bisp.enumeration.n.c$aPL) binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.p091n.e, ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        aPL apl;
        int i;
        int i2;
        boolean z;
        int i3;
        aPL apl2;
        int iK;
        int i4;
        int iK2;
        int i5;
        int iLongValue;
        int i6;
        int i7;
        boolean z2;
        Object obj;
        aPJ apk;
        int i8;
        boolean z3;
        int i9;
        long jLongValue;
        int i10;
        int i11;
        boolean z4;
        int i12;
        boolean z5;
        boolean z6;
        int i13 = 2 % 2;
        int i14 = (-2) - ((b + 50) ^ (-1));
        a = i14 % 128;
        boolean z7 = false;
        z = false;
        boolean z8 = false;
        z = false;
        z = false;
        boolean z9 = false;
        if (i14 % 2 == 0) {
            apl = this.s;
            i = apl.i(iArr);
            int i15 = 80 / 0;
            if (i < 0) {
                int i16 = a;
                int i17 = ((i16 & 60) + (i16 | 60)) - 1;
                b = i17 % 128;
                int i18 = i17 % 2;
                i = apl.i(StateSet.WILD_CARD);
                int i19 = b;
                i2 = (i19 & 115) + (i19 | 115);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i20 = 5 % 5;
                }
            }
        } else {
            apl = this.s;
            i = apl.i(iArr);
            if (i < 0) {
                int i110 = a;
                int i111 = ((i110 & 60) + (i110 | 60)) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
                i = apl.i(StateSet.WILD_CARD);
                int i113 = b;
                i2 = (i113 & 115) + (i113 | 115);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i21 = 5 % 5;
                }
            }
        }
        int i22 = this.k;
        if (i != i22) {
            int i23 = a;
            int i24 = i23 & 75;
            int i25 = -(-(i23 | 75));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            int i27 = i26 % 128;
            b = i27;
            int i28 = i26 % 2;
            aPJ apj = this.r;
            Object obj2 = null;
            if (apj != null) {
                int i29 = ((i27 | 7) << 1) - (i27 ^ 7);
                a = i29 % 128;
                int i30 = i29 % 2;
                if (i != this.t) {
                    if (i == this.v) {
                        int i31 = (((i27 | 108) << 1) - (i27 ^ 108)) - 1;
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        if (apj.c()) {
                            int i33 = a;
                            int i34 = ((i33 ^ 88) + ((i33 & 88) << 1)) - 1;
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            apj.d();
                            this.t = this.v;
                            int i36 = a;
                            int i37 = i36 & 111;
                            int i38 = -(-((i36 ^ 111) | i37));
                            int i39 = (i37 & i38) + (i38 | i37);
                            int i40 = i39 % 128;
                            b = i40;
                            int i41 = i39 % 2;
                            this.v = i;
                            int i42 = i40 & 33;
                            int i43 = ((((i40 ^ 33) | i42) << 1) - (~(-((i40 | 33) & (~i42))))) - 1;
                            a = i43 % 128;
                            int i44 = i43 % 2;
                        }
                    }
                    i22 = this.t;
                    apj.f();
                    int i45 = a;
                    int i46 = i45 ^ 99;
                    int i47 = (i45 & 99) << 1;
                    int i48 = (i46 & i47) + (i47 | i46);
                    b = i48 % 128;
                    if (i48 % 2 != 0) {
                        int i49 = 4 / 3;
                    }
                    this.r = null;
                    this.v = -1;
                    this.t = -1;
                    int i50 = a;
                    int i51 = (i50 & (-28)) | ((~i50) & 27);
                    int i52 = (i50 & 27) << 1;
                    i3 = (i51 & i52) + (i52 | i51);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.s.k(i22);
                        obj2.hashCode();
                        throw null;
                    }
                    apl2 = this.s;
                    iK = apl2.k(i22);
                    int i53 = a;
                    int i54 = i53 & 107;
                    int i55 = ((i53 ^ 107) | i54) << 1;
                    int i56 = -((i53 | 107) & (~i54));
                    i4 = (i55 & i56) + (i56 | i55);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        iK2 = apl2.k(i);
                        int i57 = 48 / 0;
                        if (iK2 != 0) {
                            if (iK != 0) {
                                int i58 = a;
                                int i59 = (i58 & (-94)) | ((~i58) & 93);
                                int i60 = -(-((i58 & 93) << 1));
                                i5 = (i59 ^ i60) + ((i60 & i59) << 1);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    aPL.j(iK, iK2);
                                    OooOO0O<Long> oooOO0O = apl2.M;
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                iLongValue = (int) ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                i6 = b;
                                int i61 = (i6 ^ 89) + ((i6 & 89) << 1);
                                a = i61 % 128;
                                int i62 = i61 % 2;
                                if (iLongValue >= 0) {
                                    int i63 = i6 + 79;
                                    a = i63 % 128;
                                    int i64 = i63 % 2;
                                    long j = aPL.j(iK, iK2);
                                    OooOO0O<Long> oooOO0O2 = apl2.M;
                                    int i65 = b + 71;
                                    a = i65 % 128;
                                    int i66 = i65 % 2;
                                    Long l = (Long) oooOO0O2.h(j, -1L);
                                    i7 = a + 93;
                                    b = i7 % 128;
                                    if (i7 % 2 != 0 ? (l.longValue() & 8589934592L) == 0 : l.longValue() * 8589934592L == 1) {
                                        int i67 = b;
                                        int i68 = i67 & 67;
                                        int i69 = (i67 ^ 67) | i68;
                                        int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                                        a = i70 % 128;
                                        int i71 = i70 % 2;
                                        z2 = false;
                                    } else {
                                        int i72 = b;
                                        int i73 = (i72 ^ 97) + ((i72 & 97) << 1);
                                        int i74 = i73 % 128;
                                        a = i74;
                                        int i75 = i73 % 2;
                                        int i76 = i74 + 91;
                                        b = i76 % 128;
                                        int i77 = i76 % 2;
                                        z2 = true;
                                    }
                                    f(iLongValue);
                                    obj = this.g;
                                    if (obj instanceof AnimationDrawable) {
                                        int i78 = b;
                                        int i79 = i78 ^ 99;
                                        int i80 = (i78 & 99) << 1;
                                        i9 = ((i79 | i80) << 1) - (i80 ^ i79);
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            aPL.j(iK, iK2);
                                            OooOO0O<Long> oooOO0O3 = apl2.M;
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        jLongValue = ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                        i10 = a;
                                        int i81 = i10 + 4;
                                        int i82 = (i81 ^ (-1)) + (i81 << 1);
                                        i11 = i82 % 128;
                                        b = i11;
                                        int i83 = i82 % 2;
                                        if ((jLongValue & 4294967296L) != 0) {
                                            i12 = (-2) - ((-1) ^ ((i10 ^ 18) + ((i10 & 18) << 1)));
                                            int i84 = i12 % 128;
                                            b = i84;
                                            if (i12 % 2 != 0) {
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            int i85 = i84 & 125;
                                            int i86 = ((i84 ^ 125) | i85) << 1;
                                            int i87 = -((i84 | 125) & (~i85));
                                            int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                                            a = i88 % 128;
                                            int i89 = i88 % 2;
                                        } else {
                                            int i90 = (i11 & (-98)) | ((~i11) & 97);
                                            int i91 = (i11 & 97) << 1;
                                            int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                                            a = i92 % 128;
                                            int i93 = i92 % 2;
                                            z4 = false;
                                        }
                                        apk = new aPN((AnimationDrawable) obj, z4, z2);
                                        int i94 = b;
                                        int i95 = i94 + 15;
                                        a = i95 % 128;
                                        int i96 = i95 % 2;
                                        int i97 = (i94 & (-104)) | ((~i94) & 103);
                                        int i98 = (i94 & 103) << 1;
                                        int i99 = (i97 & i98) + (i98 | i97);
                                        a = i99 % 128;
                                        int i100 = i99 % 2;
                                    } else if (obj instanceof h) {
                                        apk = new aPM((h) obj);
                                        int i101 = a;
                                        int i102 = i101 & 77;
                                        int i103 = (i101 | 77) & (~i102);
                                        int i104 = -(-(i102 << 1));
                                        int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
                                        b = i105 % 128;
                                        int i106 = i105 % 2;
                                    } else if (obj instanceof Animatable) {
                                        apk = new aPK((Animatable) obj);
                                        int i107 = b;
                                        int i108 = (i107 | 63) << 1;
                                        int i109 = -(i107 ^ 63);
                                        int i114 = (i108 ^ i109) + ((i109 & i108) << 1);
                                        a = i114 % 128;
                                        int i115 = i114 % 2;
                                    }
                                    apk.e();
                                    this.r = apk;
                                    int i116 = b;
                                    int i117 = i116 ^ 27;
                                    int i118 = ((i116 & 27) | i117) << 1;
                                    int i119 = -i117;
                                    i8 = ((i118 | i119) << 1) - (i118 ^ i119);
                                    int i120 = i8 % 128;
                                    a = i120;
                                    if (i8 % 2 == 0) {
                                        this.v = i22;
                                        this.t = i;
                                        z3 = false;
                                        int i121 = 94 / 0;
                                    } else {
                                        z3 = false;
                                        this.v = i22;
                                        this.t = i;
                                    }
                                    int i122 = ((i120 | 117) << 1) - (i120 ^ 117);
                                    b = i122 % 128;
                                    int i123 = i122 % 2;
                                    z8 = z3;
                                }
                                z9 = false;
                            }
                        }
                    } else {
                        iK2 = apl2.k(i);
                        if (iK2 != 0) {
                            if (iK != 0) {
                                int i510 = a;
                                int i511 = (i510 & (-94)) | ((~i510) & 93);
                                int i610 = -(-((i510 & 93) << 1));
                                i5 = (i511 ^ i610) + ((i610 & i511) << 1);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    aPL.j(iK, iK2);
                                    OooOO0O<Long> oooOO0O4 = apl2.M;
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                iLongValue = (int) ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                i6 = b;
                                int i611 = (i6 ^ 89) + ((i6 & 89) << 1);
                                a = i611 % 128;
                                int i612 = i611 % 2;
                                if (iLongValue >= 0) {
                                    int i613 = i6 + 79;
                                    a = i613 % 128;
                                    int i614 = i613 % 2;
                                    long j2 = aPL.j(iK, iK2);
                                    OooOO0O<Long> oooOO0O5 = apl2.M;
                                    int i615 = b + 71;
                                    a = i615 % 128;
                                    int i616 = i615 % 2;
                                    Long l2 = (Long) oooOO0O5.h(j2, -1L);
                                    i7 = a + 93;
                                    b = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i617 = b;
                                        int i618 = i617 & 67;
                                        int i619 = (i617 ^ 67) | i618;
                                        int i710 = (i618 ^ i619) + ((i619 & i618) << 1);
                                        a = i710 % 128;
                                        int i711 = i710 % 2;
                                        z2 = false;
                                    } else {
                                        int i6110 = b;
                                        int i6111 = i6110 & 67;
                                        int i6112 = (i6110 ^ 67) | i6111;
                                        int i712 = (i6111 ^ i6112) + ((i6112 & i6111) << 1);
                                        a = i712 % 128;
                                        int i713 = i712 % 2;
                                        z2 = false;
                                    }
                                    f(iLongValue);
                                    obj = this.g;
                                    if (obj instanceof AnimationDrawable) {
                                        int i714 = b;
                                        int i715 = i714 ^ 99;
                                        int i810 = (i714 & 99) << 1;
                                        i9 = ((i715 | i810) << 1) - (i810 ^ i715);
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            aPL.j(iK, iK2);
                                            OooOO0O<Long> oooOO0O6 = apl2.M;
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                        jLongValue = ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                        i10 = a;
                                        int i811 = i10 + 4;
                                        int i812 = (i811 ^ (-1)) + (i811 << 1);
                                        i11 = i812 % 128;
                                        b = i11;
                                        int i813 = i812 % 2;
                                        if ((jLongValue & 4294967296L) != 0) {
                                            i12 = (-2) - ((-1) ^ ((i10 ^ 18) + ((i10 & 18) << 1)));
                                            int i814 = i12 % 128;
                                            b = i814;
                                            if (i12 % 2 != 0) {
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            int i815 = i814 & 125;
                                            int i816 = ((i814 ^ 125) | i815) << 1;
                                            int i817 = -((i814 | 125) & (~i815));
                                            int i818 = (i816 ^ i817) + ((i817 & i816) << 1);
                                            a = i818 % 128;
                                            int i819 = i818 % 2;
                                        } else {
                                            int i910 = (i11 & (-98)) | ((~i11) & 97);
                                            int i911 = (i11 & 97) << 1;
                                            int i912 = (i910 ^ i911) + ((i910 & i911) << 1);
                                            a = i912 % 128;
                                            int i913 = i912 % 2;
                                            z4 = false;
                                        }
                                        apk = new aPN((AnimationDrawable) obj, z4, z2);
                                        int i914 = b;
                                        int i915 = i914 + 15;
                                        a = i915 % 128;
                                        int i916 = i915 % 2;
                                        int i917 = (i914 & (-104)) | ((~i914) & 103);
                                        int i918 = (i914 & 103) << 1;
                                        int i919 = (i917 & i918) + (i918 | i917);
                                        a = i919 % 128;
                                        int i1010 = i919 % 2;
                                    } else if (obj instanceof h) {
                                        apk = new aPM((h) obj);
                                        int i1011 = a;
                                        int i1012 = i1011 & 77;
                                        int i1013 = (i1011 | 77) & (~i1012);
                                        int i1014 = -(-(i1012 << 1));
                                        int i1015 = (i1013 ^ i1014) + ((i1013 & i1014) << 1);
                                        b = i1015 % 128;
                                        int i1016 = i1015 % 2;
                                    } else if (obj instanceof Animatable) {
                                        apk = new aPK((Animatable) obj);
                                        int i1017 = b;
                                        int i1018 = (i1017 | 63) << 1;
                                        int i1019 = -(i1017 ^ 63);
                                        int i1110 = (i1018 ^ i1019) + ((i1019 & i1018) << 1);
                                        a = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                    }
                                    apk.e();
                                    this.r = apk;
                                    int i1112 = b;
                                    int i1113 = i1112 ^ 27;
                                    int i1114 = ((i1112 & 27) | i1113) << 1;
                                    int i1115 = -i1113;
                                    i8 = ((i1114 | i1115) << 1) - (i1114 ^ i1115);
                                    int i124 = i8 % 128;
                                    a = i124;
                                    if (i8 % 2 == 0) {
                                        this.v = i22;
                                        this.t = i;
                                        z3 = false;
                                        int i125 = 94 / 0;
                                    } else {
                                        z3 = false;
                                        this.v = i22;
                                        this.t = i;
                                    }
                                    int i126 = ((i124 | 117) << 1) - (i124 ^ 117);
                                    b = i126 % 128;
                                    int i127 = i126 % 2;
                                    z8 = z3;
                                }
                                z9 = false;
                            }
                        }
                    }
                    int i128 = a;
                    int i129 = (((i128 & (-52)) | ((~i128) & 51)) - (~(-(-((i128 & 51) << 1))))) - 1;
                    b = i129 % 128;
                    int i130 = i129 % 2;
                    z5 = z9;
                    z6 = z9;
                }
                int i131 = a;
                int i132 = ((i131 & 86) + (i131 | 86)) - 1;
                b = i132 % 128;
                int i133 = i132 % 2;
                z5 = true;
                z6 = z8;
            } else {
                this.r = null;
                this.v = -1;
                this.t = -1;
                int i512 = a;
                int i513 = (i512 & (-28)) | ((~i512) & 27);
                int i514 = (i512 & 27) << 1;
                i3 = (i513 & i514) + (i514 | i513);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    this.s.k(i22);
                    obj2.hashCode();
                    throw null;
                }
                apl2 = this.s;
                iK = apl2.k(i22);
                int i515 = a;
                int i516 = i515 & 107;
                int i517 = ((i515 ^ 107) | i516) << 1;
                int i518 = -((i515 | 107) & (~i516));
                i4 = (i517 & i518) + (i518 | i517);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    iK2 = apl2.k(i);
                    int i519 = 48 / 0;
                    if (iK2 != 0) {
                        if (iK != 0) {
                            int i5110 = a;
                            int i5111 = (i5110 & (-94)) | ((~i5110) & 93);
                            int i6113 = -(-((i5110 & 93) << 1));
                            i5 = (i5111 ^ i6113) + ((i6113 & i5111) << 1);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                aPL.j(iK, iK2);
                                OooOO0O<Long> oooOO0O7 = apl2.M;
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                            iLongValue = (int) ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                            i6 = b;
                            int i6114 = (i6 ^ 89) + ((i6 & 89) << 1);
                            a = i6114 % 128;
                            int i6115 = i6114 % 2;
                            if (iLongValue >= 0) {
                                int i6116 = i6 + 79;
                                a = i6116 % 128;
                                int i6117 = i6116 % 2;
                                long j3 = aPL.j(iK, iK2);
                                OooOO0O<Long> oooOO0O8 = apl2.M;
                                int i6118 = b + 71;
                                a = i6118 % 128;
                                int i6119 = i6118 % 2;
                                Long l3 = (Long) oooOO0O8.h(j3, -1L);
                                i7 = a + 93;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    int i61110 = b;
                                    int i61111 = i61110 & 67;
                                    int i61112 = (i61110 ^ 67) | i61111;
                                    int i716 = (i61111 ^ i61112) + ((i61112 & i61111) << 1);
                                    a = i716 % 128;
                                    int i717 = i716 % 2;
                                    z2 = false;
                                } else {
                                    int i61113 = b;
                                    int i61114 = i61113 & 67;
                                    int i61115 = (i61113 ^ 67) | i61114;
                                    int i718 = (i61114 ^ i61115) + ((i61115 & i61114) << 1);
                                    a = i718 % 128;
                                    int i719 = i718 % 2;
                                    z2 = false;
                                }
                                f(iLongValue);
                                obj = this.g;
                                if (obj instanceof AnimationDrawable) {
                                    int i7110 = b;
                                    int i7111 = i7110 ^ 99;
                                    int i8110 = (i7110 & 99) << 1;
                                    i9 = ((i7111 | i8110) << 1) - (i8110 ^ i7111);
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        aPL.j(iK, iK2);
                                        OooOO0O<Long> oooOO0O9 = apl2.M;
                                        Object obj8 = null;
                                        obj8.hashCode();
                                        throw null;
                                    }
                                    jLongValue = ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                    i10 = a;
                                    int i8111 = i10 + 4;
                                    int i8112 = (i8111 ^ (-1)) + (i8111 << 1);
                                    i11 = i8112 % 128;
                                    b = i11;
                                    int i8113 = i8112 % 2;
                                    if ((jLongValue & 4294967296L) != 0) {
                                        i12 = (-2) - ((-1) ^ ((i10 ^ 18) + ((i10 & 18) << 1)));
                                        int i8114 = i12 % 128;
                                        b = i8114;
                                        if (i12 % 2 != 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        int i8115 = i8114 & 125;
                                        int i8116 = ((i8114 ^ 125) | i8115) << 1;
                                        int i8117 = -((i8114 | 125) & (~i8115));
                                        int i8118 = (i8116 ^ i8117) + ((i8117 & i8116) << 1);
                                        a = i8118 % 128;
                                        int i8119 = i8118 % 2;
                                    } else {
                                        int i9110 = (i11 & (-98)) | ((~i11) & 97);
                                        int i9111 = (i11 & 97) << 1;
                                        int i9112 = (i9110 ^ i9111) + ((i9110 & i9111) << 1);
                                        a = i9112 % 128;
                                        int i9113 = i9112 % 2;
                                        z4 = false;
                                    }
                                    apk = new aPN((AnimationDrawable) obj, z4, z2);
                                    int i9114 = b;
                                    int i9115 = i9114 + 15;
                                    a = i9115 % 128;
                                    int i9116 = i9115 % 2;
                                    int i9117 = (i9114 & (-104)) | ((~i9114) & 103);
                                    int i9118 = (i9114 & 103) << 1;
                                    int i9119 = (i9117 & i9118) + (i9118 | i9117);
                                    a = i9119 % 128;
                                    int i10110 = i9119 % 2;
                                } else if (obj instanceof h) {
                                    apk = new aPM((h) obj);
                                    int i10111 = a;
                                    int i10112 = i10111 & 77;
                                    int i10113 = (i10111 | 77) & (~i10112);
                                    int i10114 = -(-(i10112 << 1));
                                    int i10115 = (i10113 ^ i10114) + ((i10113 & i10114) << 1);
                                    b = i10115 % 128;
                                    int i10116 = i10115 % 2;
                                } else if (obj instanceof Animatable) {
                                    apk = new aPK((Animatable) obj);
                                    int i10117 = b;
                                    int i10118 = (i10117 | 63) << 1;
                                    int i10119 = -(i10117 ^ 63);
                                    int i1116 = (i10118 ^ i10119) + ((i10119 & i10118) << 1);
                                    a = i1116 % 128;
                                    int i1117 = i1116 % 2;
                                }
                                apk.e();
                                this.r = apk;
                                int i1118 = b;
                                int i1119 = i1118 ^ 27;
                                int i11110 = ((i1118 & 27) | i1119) << 1;
                                int i11111 = -i1119;
                                i8 = ((i11110 | i11111) << 1) - (i11110 ^ i11111);
                                int i1210 = i8 % 128;
                                a = i1210;
                                if (i8 % 2 == 0) {
                                    this.v = i22;
                                    this.t = i;
                                    z3 = false;
                                    int i1211 = 94 / 0;
                                } else {
                                    z3 = false;
                                    this.v = i22;
                                    this.t = i;
                                }
                                int i1212 = ((i1210 | 117) << 1) - (i1210 ^ 117);
                                b = i1212 % 128;
                                int i1213 = i1212 % 2;
                                z8 = z3;
                                int i134 = a;
                                int i135 = ((i134 & 86) + (i134 | 86)) - 1;
                                b = i135 % 128;
                                int i136 = i135 % 2;
                                z5 = true;
                                z6 = z8;
                            }
                            z9 = false;
                        }
                    }
                } else {
                    iK2 = apl2.k(i);
                    if (iK2 != 0) {
                        if (iK != 0) {
                            int i5112 = a;
                            int i5113 = (i5112 & (-94)) | ((~i5112) & 93);
                            int i61116 = -(-((i5112 & 93) << 1));
                            i5 = (i5113 ^ i61116) + ((i61116 & i5113) << 1);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                aPL.j(iK, iK2);
                                OooOO0O<Long> oooOO0O10 = apl2.M;
                                Object obj9 = null;
                                obj9.hashCode();
                                throw null;
                            }
                            iLongValue = (int) ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                            i6 = b;
                            int i61117 = (i6 ^ 89) + ((i6 & 89) << 1);
                            a = i61117 % 128;
                            int i61118 = i61117 % 2;
                            if (iLongValue >= 0) {
                                int i61119 = i6 + 79;
                                a = i61119 % 128;
                                int i61120 = i61119 % 2;
                                long j4 = aPL.j(iK, iK2);
                                OooOO0O<Long> oooOO0O11 = apl2.M;
                                int i61121 = b + 71;
                                a = i61121 % 128;
                                int i61122 = i61121 % 2;
                                Long l4 = (Long) oooOO0O11.h(j4, -1L);
                                i7 = a + 93;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    int i611110 = b;
                                    int i611111 = i611110 & 67;
                                    int i611112 = (i611110 ^ 67) | i611111;
                                    int i7112 = (i611111 ^ i611112) + ((i611112 & i611111) << 1);
                                    a = i7112 % 128;
                                    int i7113 = i7112 % 2;
                                    z2 = false;
                                } else {
                                    int i611113 = b;
                                    int i611114 = i611113 & 67;
                                    int i611115 = (i611113 ^ 67) | i611114;
                                    int i7114 = (i611114 ^ i611115) + ((i611115 & i611114) << 1);
                                    a = i7114 % 128;
                                    int i7115 = i7114 % 2;
                                    z2 = false;
                                }
                                f(iLongValue);
                                obj = this.g;
                                if (obj instanceof AnimationDrawable) {
                                    int i7116 = b;
                                    int i7117 = i7116 ^ 99;
                                    int i81110 = (i7116 & 99) << 1;
                                    i9 = ((i7117 | i81110) << 1) - (i81110 ^ i7117);
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        aPL.j(iK, iK2);
                                        OooOO0O<Long> oooOO0O12 = apl2.M;
                                        Object obj10 = null;
                                        obj10.hashCode();
                                        throw null;
                                    }
                                    jLongValue = ((Long) apl2.M.h(aPL.j(iK, iK2), -1L)).longValue();
                                    i10 = a;
                                    int i81111 = i10 + 4;
                                    int i81112 = (i81111 ^ (-1)) + (i81111 << 1);
                                    i11 = i81112 % 128;
                                    b = i11;
                                    int i81113 = i81112 % 2;
                                    if ((jLongValue & 4294967296L) != 0) {
                                        i12 = (-2) - ((-1) ^ ((i10 ^ 18) + ((i10 & 18) << 1)));
                                        int i81114 = i12 % 128;
                                        b = i81114;
                                        if (i12 % 2 != 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        int i81115 = i81114 & 125;
                                        int i81116 = ((i81114 ^ 125) | i81115) << 1;
                                        int i81117 = -((i81114 | 125) & (~i81115));
                                        int i81118 = (i81116 ^ i81117) + ((i81117 & i81116) << 1);
                                        a = i81118 % 128;
                                        int i81119 = i81118 % 2;
                                    } else {
                                        int i91110 = (i11 & (-98)) | ((~i11) & 97);
                                        int i91111 = (i11 & 97) << 1;
                                        int i91112 = (i91110 ^ i91111) + ((i91110 & i91111) << 1);
                                        a = i91112 % 128;
                                        int i91113 = i91112 % 2;
                                        z4 = false;
                                    }
                                    apk = new aPN((AnimationDrawable) obj, z4, z2);
                                    int i91114 = b;
                                    int i91115 = i91114 + 15;
                                    a = i91115 % 128;
                                    int i91116 = i91115 % 2;
                                    int i91117 = (i91114 & (-104)) | ((~i91114) & 103);
                                    int i91118 = (i91114 & 103) << 1;
                                    int i91119 = (i91117 & i91118) + (i91118 | i91117);
                                    a = i91119 % 128;
                                    int i101110 = i91119 % 2;
                                } else if (obj instanceof h) {
                                    apk = new aPM((h) obj);
                                    int i101111 = a;
                                    int i101112 = i101111 & 77;
                                    int i101113 = (i101111 | 77) & (~i101112);
                                    int i101114 = -(-(i101112 << 1));
                                    int i101115 = (i101113 ^ i101114) + ((i101113 & i101114) << 1);
                                    b = i101115 % 128;
                                    int i101116 = i101115 % 2;
                                } else if (obj instanceof Animatable) {
                                    apk = new aPK((Animatable) obj);
                                    int i101117 = b;
                                    int i101118 = (i101117 | 63) << 1;
                                    int i101119 = -(i101117 ^ 63);
                                    int i11112 = (i101118 ^ i101119) + ((i101119 & i101118) << 1);
                                    a = i11112 % 128;
                                    int i11113 = i11112 % 2;
                                }
                                apk.e();
                                this.r = apk;
                                int i11114 = b;
                                int i11115 = i11114 ^ 27;
                                int i11116 = ((i11114 & 27) | i11115) << 1;
                                int i11117 = -i11115;
                                i8 = ((i11116 | i11117) << 1) - (i11116 ^ i11117);
                                int i1214 = i8 % 128;
                                a = i1214;
                                if (i8 % 2 == 0) {
                                    this.v = i22;
                                    this.t = i;
                                    z3 = false;
                                    int i1215 = 94 / 0;
                                } else {
                                    z3 = false;
                                    this.v = i22;
                                    this.t = i;
                                }
                                int i1216 = ((i1214 | 117) << 1) - (i1214 ^ 117);
                                b = i1216 % 128;
                                int i1217 = i1216 % 2;
                                z8 = z3;
                                int i137 = a;
                                int i138 = ((i137 & 86) + (i137 | 86)) - 1;
                                b = i138 % 128;
                                int i139 = i138 % 2;
                                z5 = true;
                                z6 = z8;
                            }
                            z9 = false;
                        }
                    }
                }
                int i1218 = a;
                int i1219 = (((i1218 & (-52)) | ((~i1218) & 51)) - (~(-(-((i1218 & 51) << 1))))) - 1;
                b = i1219 % 128;
                int i1310 = i1219 % 2;
                z5 = z9;
                z6 = z9;
            }
            if (!z5) {
                int i140 = b + 37;
                a = i140 % 128;
                if (i140 % 2 == 0) {
                    f(i);
                    Object obj11 = null;
                    obj11.hashCode();
                    throw null;
                }
                if (f(i)) {
                    z7 = z6;
                    int i141 = a;
                    int i142 = ((i141 ^ 49) | (i141 & 49)) << 1;
                    int i143 = -(((~i141) & 49) | (i141 & (-50)));
                    int i144 = (i142 & i143) + (i143 | i142);
                    b = i144 % 128;
                    int i145 = i144 % 2;
                } else {
                    z7 = z6;
                    int i146 = b;
                    int i147 = (((i146 | 32) << 1) - (i146 ^ 32)) - 1;
                    a = i147 % 128;
                    int i148 = i147 % 2;
                    z = z7;
                }
            }
            z = true;
        } else {
            z7 = z6;
            int i149 = b;
            int i1410 = (((i149 | 32) << 1) - (i149 ^ 32)) - 1;
            a = i1410 % 128;
            int i1411 = i1410 % 2;
            z = z7;
        }
        Drawable drawable = this.g;
        boolean z10 = z;
        if (drawable != null) {
            int i150 = b;
            int i151 = i150 & 73;
            int i152 = (i150 ^ 73) | i151;
            int i153 = (i151 & i152) + (i152 | i151);
            a = i153 % 128;
            int i154 = i153 % 2;
            boolean state = drawable.setState(iArr);
            int i155 = (z ? 1 : 0) & (state ? 1 : 0);
            int i156 = ((state ? 1 : 0) | (z ? 1 : 0)) & (~i155);
            int i157 = (i156 ^ i155) | (i156 & i155);
            int i158 = b + 83;
            a = i158 % 128;
            int i159 = i158 % 2;
            z10 = i157;
        }
        int i160 = a;
        int i161 = i160 ^ 67;
        int i162 = -(-((i160 & 67) << 1));
        int i163 = (i161 & i162) + (i162 | i161);
        b = i163 % 128;
        int i164 = i163 % 2;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x043a A[PHI: r11
  0x043a: PHI (r11v8 int) = (r11v7 int), (r11v13 int) binds: [B:102:0x0438, B:99:0x042f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0458  */
    /* JADX WARN: Code duplicated, block: B:154:0x0613  */
    /* JADX WARN: Code duplicated, block: B:57:0x02ba  */
    public static c i(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        int depth;
        int i;
        int i2;
        int resourceId;
        Drawable drawableJ;
        long j;
        int next;
        TypedArray typedArrayE;
        Drawable drawableB;
        int next2;
        int attributeNameResource;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 27;
        int i8 = 1;
        int i9 = ((i6 ^ 27) | i7) << 1;
        int i10 = -((i6 | 27) & (~i7));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        String name = xmlPullParser.getName();
        int i13 = b;
        int i14 = (i13 ^ 32) + ((i13 & 32) << 1);
        int i15 = -1;
        int i16 = (-2) - (i14 ^ (-1));
        a = i16 % 128;
        int i17 = i16 % 2;
        if (!name.equals("animated-selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid animated-selector tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        c cVar = new c(null, null);
        TypedArray typedArrayE2 = Q.e(resources, theme, attributeSet, r.d);
        cVar.setVisible(typedArrayE2.getBoolean(1, true), true);
        aPL apl = cVar.s;
        int i18 = apl.g;
        int iC = ivas.gov.bisp.enumeration.p098t.c.c(typedArrayE2);
        int i19 = ((~iC) & i18) | ((~i18) & iC);
        int i20 = i18 & iC;
        apl.g = (i20 & i19) | (i19 ^ i20);
        boolean z2 = typedArrayE2.getBoolean(2, apl.c);
        int i21 = a;
        int i22 = (i21 & 58) + (i21 | 58);
        int i23 = (i22 ^ (-1)) + (i22 << 1);
        b = i23 % 128;
        int i24 = 3;
        if (i23 % 2 != 0) {
            apl.c = z2;
            z = typedArrayE2.getBoolean(5, apl.n);
        } else {
            apl.c = z2;
            z = typedArrayE2.getBoolean(3, apl.n);
        }
        int i25 = a;
        int i26 = ((i25 ^ 41) | (i25 & 41)) << 1;
        int i27 = -((i25 & (-42)) | ((~i25) & 41));
        int i28 = (i26 & i27) + (i26 | i27);
        b = i28 % 128;
        int i29 = i28 % 2;
        apl.n = z;
        apl.C = typedArrayE2.getInt(4, apl.C);
        int i30 = a;
        int i31 = i30 & 103;
        int i32 = ((i30 ^ 103) | i31) << 1;
        int i33 = -((i30 | 103) & (~i31));
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        b = i34 % 128;
        int i35 = i34 % 2;
        apl.E = typedArrayE2.getInt(5, apl.E);
        int i36 = b + 115;
        a = i36 % 128;
        int i37 = i36 % 2;
        boolean z3 = apl.v;
        int i38 = 0;
        cVar.setDither(typedArrayE2.getBoolean(0, z3));
        cVar.e.g(resources);
        int i39 = a;
        int i40 = (i39 & 111) + (i39 | 111);
        b = i40 % 128;
        if (i40 % 2 != 0) {
            typedArrayE2.recycle();
            depth = xmlPullParser.getDepth() / 0;
        } else {
            typedArrayE2.recycle();
            int depth2 = xmlPullParser.getDepth();
            depth = ((depth2 & 1) << 1) + (depth2 ^ 1);
        }
        int i41 = a;
        int i42 = i41 & 109;
        int i43 = -(-(i41 | 109));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        b = i44 % 128;
        if (i44 % 2 != 0) {
            int i45 = 3 / 2;
        }
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == i8) {
                break;
            }
            int i46 = b;
            int i47 = i46 & 77;
            int i48 = i47 + ((i46 ^ 77) | i47);
            a = i48 % 128;
            if (i48 % i4 == 0) {
                xmlPullParser.getDepth();
                throw null;
            }
            int depth3 = xmlPullParser.getDepth();
            if (depth3 < depth && next3 == i24) {
                break;
            }
            if (next3 == i4) {
                int i49 = a;
                int i50 = (i49 ^ 91) + ((i49 & 91) << i8);
                b = i50 % 128;
                int i51 = i50 % i4;
                if (depth3 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        int i52 = a;
                        int i53 = i52 & 15;
                        int i54 = (i52 | 15) & (~i53);
                        int i55 = -(-(i53 << i8));
                        int i56 = ((i54 | i55) << i8) - (i54 ^ i55);
                        b = i56 % 128;
                        if (i56 % i4 != 0) {
                            typedArrayE = Q.e(resources, theme, attributeSet, r.e);
                            int i57 = 62 / i38;
                        } else {
                            typedArrayE = Q.e(resources, theme, attributeSet, r.e);
                        }
                        int i58 = b;
                        int i59 = (i58 & 13) + (i58 | 13);
                        a = i59 % 128;
                        int i60 = i59 % i4;
                        int resourceId2 = typedArrayE.getResourceId(i38, i38);
                        int resourceId3 = typedArrayE.getResourceId(i8, i15);
                        if (resourceId3 > 0) {
                            int i61 = a;
                            int i62 = i61 & 51;
                            int i63 = -(-((i61 ^ 51) | i62));
                            int i64 = (i62 ^ i63) + ((i62 & i63) << i8);
                            b = i64 % 128;
                            int i65 = i64 % i4;
                            drawableB = K.c().j(context, resourceId3);
                            int i66 = (-2) - ((b + 46) ^ i15);
                            a = i66 % 128;
                            int i67 = i66 % i4;
                        } else {
                            drawableB = null;
                        }
                        typedArrayE.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i68 = a;
                        int i69 = i68 & 57;
                        int i70 = -(-((i68 ^ 57) | i69));
                        int i71 = (i69 ^ i70) + ((i69 & i70) << i8);
                        b = i71 % 128;
                        int i72 = i71 % i4;
                        int i73 = i38;
                        int i74 = i73;
                        while (i73 < attributeCount) {
                            int i75 = a;
                            int i76 = (-2) - (((i75 & 84) + (i75 | 84)) ^ (-1));
                            b = i76 % 128;
                            if (i76 % i4 != 0) {
                                attributeNameResource = attributeSet.getAttributeNameResource(i73);
                                int i77 = 49 / 0;
                            } else {
                                attributeNameResource = attributeSet.getAttributeNameResource(i73);
                            }
                            int i78 = b;
                            int i79 = i78 & 89;
                            int i80 = depth;
                            int i81 = (~i79) & (i78 | 89);
                            int i82 = i79 << 1;
                            int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                            int i84 = i83 % 128;
                            a = i84;
                            if (i83 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (attributeNameResource != 0) {
                                int i85 = i84 & 41;
                                int i86 = i85 + ((i84 ^ 41) | i85);
                                b = i86 % 128;
                                int i87 = i86 % 2;
                                if (attributeNameResource != 16842960) {
                                    int i88 = i84 & 1;
                                    i3 = attributeCount;
                                    int i89 = (((~i88) & (i84 | 1)) - (~(i88 << 1))) - 1;
                                    b = i89 % 128;
                                    int i90 = i89 % 2;
                                    if (attributeNameResource != 16843161) {
                                        int i91 = (((i84 | 30) << 1) - (i84 ^ 30)) - 1;
                                        b = i91 % 128;
                                        int i92 = i91 % 2;
                                        if (!(!attributeSet.getAttributeBooleanValue(i73, false))) {
                                            int i93 = (-2) - ((b + 36) ^ (-1));
                                            int i94 = i93 % 128;
                                            a = i94;
                                            if (i93 % 2 == 0) {
                                                throw null;
                                            }
                                            int i95 = i94 + 108;
                                            int i96 = (i95 ^ (-1)) + (i95 << 1);
                                            b = i96 % 128;
                                            int i97 = i96 % 2;
                                        } else {
                                            attributeNameResource = -attributeNameResource;
                                        }
                                        iArr[i74] = attributeNameResource;
                                        int i98 = i74 ^ 1;
                                        int i99 = (i74 & 1) << 1;
                                        i74 = (i98 ^ i99) + ((i98 & i99) << 1);
                                        int i100 = a;
                                        int i101 = ((i100 ^ 103) | (i100 & 103)) << 1;
                                        int i102 = -((103 & (~i100)) | (i100 & (-104)));
                                        int i103 = (i101 & i102) + (i102 | i101);
                                        b = i103 % 128;
                                        int i104 = i103 % 2;
                                    }
                                } else {
                                    i3 = attributeCount;
                                }
                            } else {
                                i3 = attributeCount;
                            }
                            int i105 = i73 & 1;
                            i73 = i105 + ((i73 ^ 1) | i105);
                            int i106 = a + 3;
                            b = i106 % 128;
                            if (i106 % 2 != 0) {
                                int i107 = 3 % 3;
                            }
                            depth = i80;
                            attributeCount = i3;
                            i4 = 2;
                        }
                        i = depth;
                        int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i74);
                        if (drawableB == null) {
                            do {
                                next2 = xmlPullParser.next();
                            } while (next2 == 4);
                            int i108 = a;
                            int i109 = (i108 & 101) + (i108 | 101);
                            int i110 = i109 % 128;
                            b = i110;
                            int i111 = i109 % 2;
                            if (next2 != 2) {
                                throw new XmlPullParserException(j.x(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            }
                            int i112 = (i110 ^ 9) + ((i110 & 9) << 1);
                            a = i112 % 128;
                            int i113 = i112 % 2;
                            if (!(!xmlPullParser.getName().equals("vector"))) {
                                int i114 = a + 3;
                                b = i114 % 128;
                                if (i114 % 2 != 0) {
                                    p.d(resources, xmlPullParser, attributeSet, theme);
                                    throw null;
                                }
                                drawableB = p.d(resources, xmlPullParser, attributeSet, theme);
                                int i115 = b;
                                int i116 = i115 | 9;
                                int i117 = i116 << 1;
                                int i118 = -((~(i115 & 9)) & i116);
                                int i119 = (i117 & i118) + (i118 | i117);
                                a = i119 % 128;
                                if (i119 % 2 == 0) {
                                    int i120 = 4 % 4;
                                }
                            } else {
                                drawableB = ivas.gov.bisp.enumeration.p098t.c.b(resources, xmlPullParser, attributeSet, theme);
                                int i121 = a;
                                int i122 = ((i121 & (-88)) | ((~i121) & 87)) + ((i121 & 87) << 1);
                                b = i122 % 128;
                                int i123 = i122 % 2;
                            }
                        }
                        if (drawableB == null) {
                            throw new XmlPullParserException(j.x(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                        aPL apl2 = cVar.s;
                        int iC2 = apl2.c(drawableB);
                        int i124 = a;
                        int i125 = i124 ^ 21;
                        int i126 = ((i124 & 21) | i125) << 1;
                        int i127 = -i125;
                        int i128 = (i126 & i127) + (i126 | i127);
                        b = i128 % 128;
                        int i129 = i128 % 2;
                        apl2.L[iC2] = iArrTrimStateSet;
                        OooOo00<Integer> oooOo00 = apl2.N;
                        int i130 = b + 57;
                        a = i130 % 128;
                        if (i130 % 2 == 0) {
                            oooOo00.g(iC2, Integer.valueOf(resourceId2));
                            int i131 = 37 / 0;
                        } else {
                            oooOo00.g(iC2, Integer.valueOf(resourceId2));
                        }
                        i2 = 2;
                    } else {
                        i = depth;
                        if (xmlPullParser.getName().equals("transition")) {
                            TypedArray typedArrayE3 = Q.e(resources, theme, attributeSet, r.f);
                            int i132 = b;
                            int i133 = i132 & 89;
                            int i134 = -(-(i132 | 89));
                            int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                            a = i135 % 128;
                            int resourceId4 = i135 % 2 == 0 ? typedArrayE3.getResourceId(3, -1) : typedArrayE3.getResourceId(2, -1);
                            int i136 = b;
                            int i137 = (i136 ^ 81) + ((i136 & 81) << 1);
                            a = i137 % 128;
                            int i138 = i137 % 2;
                            int resourceId5 = typedArrayE3.getResourceId(1, -1);
                            int i139 = b;
                            int i140 = (i139 & (-72)) | ((~i139) & 71);
                            int i141 = -(-((i139 & 71) << 1));
                            int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                            a = i142 % 128;
                            if (i142 % 2 == 0) {
                                resourceId = typedArrayE3.getResourceId(0, -1);
                                int i143 = 31 / 0;
                                if (resourceId > 0) {
                                    drawableJ = K.c().j(context, resourceId);
                                    int i144 = a;
                                    int i145 = i144 & 69;
                                    int i146 = -(-((i144 ^ 69) | i145));
                                    int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                                    b = i147 % 128;
                                    int i148 = i147 % 2;
                                } else {
                                    drawableJ = null;
                                }
                            } else {
                                resourceId = typedArrayE3.getResourceId(0, -1);
                                if (resourceId > 0) {
                                    drawableJ = K.c().j(context, resourceId);
                                    int i149 = a;
                                    int i1410 = i149 & 69;
                                    int i1411 = -(-((i149 ^ 69) | i1410));
                                    int i1412 = ((i1410 | i1411) << 1) - (i1411 ^ i1410);
                                    b = i1412 % 128;
                                    int i1413 = i1412 % 2;
                                } else {
                                    drawableJ = null;
                                }
                            }
                            boolean z4 = typedArrayE3.getBoolean(3, false);
                            typedArrayE3.recycle();
                            int i150 = a;
                            int i151 = i150 & 1;
                            int i152 = -(-(i150 | 1));
                            int i153 = (i151 & i152) + (i152 | i151);
                            b = i153 % 128;
                            if (i153 % 2 != 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (drawableJ == null) {
                                do {
                                    next = xmlPullParser.next();
                                } while (next == 4);
                                if (next != 2) {
                                    throw new XmlPullParserException(j.x(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                                }
                                if (xmlPullParser.getName().equals("animated-vector")) {
                                    drawableJ = new h(context, null, null);
                                    int i154 = (-2) - ((a + 124) ^ (-1));
                                    b = i154 % 128;
                                    if (i154 % 2 != 0) {
                                        drawableJ.inflate(resources, xmlPullParser, attributeSet, theme);
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    drawableJ.inflate(resources, xmlPullParser, attributeSet, theme);
                                } else {
                                    drawableJ = ivas.gov.bisp.enumeration.p098t.c.b(resources, xmlPullParser, attributeSet, theme);
                                    int i155 = a + 21;
                                    b = i155 % 128;
                                    int i156 = i155 % 2;
                                }
                            }
                            if (drawableJ == null) {
                                throw new XmlPullParserException(j.x(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            }
                            int i157 = a;
                            int i158 = i157 & 81;
                            int i159 = -(-((i157 ^ 81) | i158));
                            int i160 = ((i158 | i159) << 1) - (i159 ^ i158);
                            int i161 = i160 % 128;
                            b = i161;
                            int i162 = i160 % 2;
                            if (resourceId4 != -1) {
                                int i163 = i161 + 28;
                                int i164 = (i163 ^ (-1)) + (i163 << 1);
                                a = i164 % 128;
                                int i165 = i164 % 2;
                                if (resourceId5 != -1) {
                                    int i166 = i161 & 119;
                                    int i167 = (i161 | 119) & (~i166);
                                    int i168 = i166 << 1;
                                    int i169 = ((i167 | i168) << 1) - (i167 ^ i168);
                                    a = i169 % 128;
                                    int i170 = i169 % 2;
                                    aPL apl3 = cVar.s;
                                    int iC3 = apl3.c(drawableJ);
                                    long j2 = aPL.j(resourceId4, resourceId5);
                                    int i171 = b;
                                    int i172 = i171 & 89;
                                    int i173 = (i171 ^ 89) | i172;
                                    int i174 = (i172 & i173) + (i173 | i172);
                                    int i175 = i174 % 128;
                                    a = i175;
                                    if (i174 % 2 == 0) {
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    if (z4) {
                                        j = 8589934592L;
                                    } else {
                                        int i176 = i175 & 41;
                                        int i177 = i175 | 41;
                                        int i178 = (i176 & i177) + (i176 | i177);
                                        b = i178 % 128;
                                        int i179 = i178 % 2;
                                        j = 0;
                                    }
                                    OooOO0O<Long> oooOO0O = apl3.M;
                                    long j3 = iC3;
                                    int i180 = b;
                                    int i181 = i180 ^ 7;
                                    int i182 = ((i180 & 7) | i181) << 1;
                                    int i183 = -i181;
                                    int i184 = (i182 & i183) + (i183 | i182);
                                    a = i184 % 128;
                                    long j4 = j3 | j;
                                    if (i184 % 2 == 0) {
                                        oooOO0O.d(j2, Long.valueOf(j4));
                                    } else {
                                        oooOO0O.d(j2, Long.valueOf(j4));
                                    }
                                    int i185 = b + 57;
                                    int i186 = i185 % 128;
                                    a = i186;
                                    int i187 = i185 % 2;
                                    if (!(!z4)) {
                                        int i188 = i186 + 18;
                                        int i189 = (i188 ^ (-1)) + (i188 << 1);
                                        b = i189 % 128;
                                        int i190 = i189 % 2;
                                        long j5 = aPL.j(resourceId5, resourceId4);
                                        OooOO0O<Long> oooOO0O2 = apl3.M;
                                        int i191 = b;
                                        int i192 = (i191 & 116) + (i191 | 116);
                                        int i193 = (i192 ^ (-1)) + (i192 << 1);
                                        a = i193 % 128;
                                        if (i193 % 2 == 0) {
                                            oooOO0O2.d(j5, Long.valueOf((j3 / 4294967296L) | j));
                                        } else {
                                            oooOO0O2.d(j5, Long.valueOf(4294967296L | j3 | j));
                                        }
                                    }
                                }
                            }
                            throw new XmlPullParserException(j.x(xmlPullParser, new StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
                        }
                        int i194 = a;
                        int i195 = i194 & 17;
                        int i196 = (((i194 ^ 17) | i195) << 1) - ((i194 | 17) & (~i195));
                        b = i196 % 128;
                        i2 = 2;
                        int i197 = i196 % 2;
                    }
                    int i198 = a + 67;
                    b = i198 % 128;
                    int i199 = i198 % i2;
                } else {
                    i = depth;
                }
            } else {
                i = depth;
            }
            depth = i;
            i4 = 2;
            i15 = -1;
            i8 = 1;
            i38 = 0;
            i24 = 3;
        }
        cVar.onStateChange(cVar.getState());
        int i200 = a;
        int i201 = (i200 & (-104)) | (103 & (~i200));
        int i202 = -(-((i200 & 103) << 1));
        int i203 = (i201 & i202) + (i202 | i201);
        b = i203 % 128;
        if (i203 % 2 == 0) {
            return cVar;
        }
        throw null;
    }
}
