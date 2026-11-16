package ivas.gov.bisp.enumeration.T;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private static int a = 1;
    private static int b;
    public long c;
    public long d;
    public TimeInterpolator e;
    public int f;
    public int g;

    public z(long j, long j2) {
        this.e = null;
        this.f = 0;
        this.g = 1;
        this.c = j;
        this.d = j2;
    }

    public TimeInterpolator e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        TimeInterpolator timeInterpolator = this.e;
        if (timeInterpolator == null) {
            timeInterpolator = j.d;
            int i4 = b;
            int i5 = i4 & 103;
            int i6 = (i4 | 103) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = (((i10 & (-18)) | ((~i10) & 17)) - (~((i10 & 17) << 1))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        return timeInterpolator;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 62) << 1) - (i4 ^ 62);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        long j = this.c;
        int i9 = (int) (j ^ (j >>> 32));
        long j2 = this.d;
        int i10 = i7 & 61;
        int i11 = (i10 - (~(-(-((i7 ^ 61) | i10))))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (int) ((j2 >>> 32) ^ j2);
        Class<?> cls = e().getClass();
        int i14 = a + 79;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            iHashCode = cls.hashCode();
            i = this.f;
            i2 = i9 % 27;
        } else {
            iHashCode = cls.hashCode();
            i = this.f;
            i2 = i9 * 31;
        }
        int i15 = i2 & i13;
        int i16 = (i15 + ((i13 ^ i2) | i15)) * 31;
        int i17 = iHashCode & i16;
        int i18 = (((iHashCode | i16) & (~i17)) + (i17 << 1)) * 31;
        int i19 = -(-i);
        int i20 = i18 & i19;
        int i21 = (i19 | i18) & (~i20);
        int i22 = i20 << 1;
        int i23 = (((i21 | i22) << 1) - (i21 ^ i22)) * 31;
        int i24 = this.g;
        int i25 = b;
        int i26 = i25 + 123;
        a = i26 % 128;
        int i27 = i26 % 2;
        int i28 = (i23 - (~(-(-i24)))) - 1;
        int i29 = (i25 ^ 7) + ((i25 & 7) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
        return i28;
    }

    public void d(Animator animator) {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            animator.setStartDelay(this.c);
            obj.hashCode();
            throw null;
        }
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(e());
        int i6 = a;
        int i7 = i6 ^ 91;
        int i8 = (i6 & 91) << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        if (!(!(animator instanceof ValueAnimator))) {
            int i11 = ((i6 | 39) << 1) - (i6 ^ 39);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.f);
                int i12 = 20 / 0;
            } else {
                valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.f);
            }
            int i13 = a;
            int i14 = i13 | 73;
            int i15 = i14 << 1;
            int i16 = -((~(i13 & 73)) & i14);
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            valueAnimator.setRepeatMode(this.g);
            int i19 = a;
            int i20 = i19 & 61;
            int i21 = -(-((i19 ^ 61) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = i24 & 91;
        int i26 = i24 | 91;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 106) << 1) - (i2 ^ 106)) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 & 43;
            int i6 = (i2 | 43) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 107;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 11 / 0;
            }
            return true;
        }
        if (!(obj instanceof z)) {
            int i13 = i4 + 107;
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((i4 & 54) + (i4 | 54)) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        z zVar = (z) obj;
        long j = this.c;
        long j2 = zVar.c;
        int i17 = (((i4 | 54) << 1) - (i4 ^ 54)) - 1;
        int i18 = i17 % 128;
        a = i18;
        if (i17 % 2 == 0) {
            throw null;
        }
        if (j != j2) {
            int i19 = ((i18 | 65) << 1) - ((i18 & (-66)) | ((~i18) & 65));
            b = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }
        if (this.d != zVar.d) {
            int i21 = ((i4 | 24) << 1) - (i4 ^ 24);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            int i25 = ((i23 & 99) - (~(i23 | 99))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            return false;
        }
        if (this.f != zVar.f) {
            int i27 = i18 & 87;
            int i28 = (i18 ^ 87) | i27;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            b = i29 % 128;
            int i30 = i29 % 2;
            return false;
        }
        if (this.g == zVar.g) {
            boolean zEquals = e().getClass().equals(zVar.e().getClass());
            int i31 = b;
            int i32 = i31 ^ 23;
            int i33 = (((i31 & 23) | i32) << 1) - i32;
            a = i33 % 128;
            int i34 = i33 % 2;
            return zEquals;
        }
        int i35 = i4 & 117;
        int i36 = (i4 ^ 117) | i35;
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int i38 = i37 % 128;
        a = i38;
        int i39 = i37 % 2;
        int i40 = ((i38 & 36) + (i38 | 36)) - 1;
        b = i40 % 128;
        int i41 = i40 % 2;
        return false;
    }

    public z(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f = 0;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public String toString() {
        char c;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        int i2 = b;
        int i3 = i2 | 49;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 49)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            sb.append(z.class.getName());
            c = 'E';
        } else {
            sb.append(z.class.getName());
            c = '{';
        }
        sb.append(c);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = b;
        int i8 = i7 ^ 75;
        int i9 = -(-((i7 & 75) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        sb.append(Integer.toHexString(iIdentityHashCode));
        sb.append(" delay: ");
        long j = this.c;
        int i12 = b;
        int i13 = i12 & 47;
        int i14 = ((i12 ^ 47) | i13) << 1;
        int i15 = -((i12 | 47) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            sb.append(j);
            sb.append(" duration: ");
            throw null;
        }
        sb.append(j);
        sb.append(" duration: ");
        sb.append(this.d);
        sb.append(" interpolator: ");
        int i17 = b + 91;
        a = i17 % 128;
        int i18 = i17 % 2;
        sb.append(e().getClass());
        sb.append(" repeatCount: ");
        int i19 = a;
        int i20 = (((i19 & (-72)) | ((~i19) & 71)) - (~(-(-((i19 & 71) << 1))))) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        sb.append(this.f);
        sb.append(" repeatMode: ");
        int i22 = a;
        int i23 = ((i22 | 91) << 1) - (i22 ^ 91);
        b = i23 % 128;
        int i24 = i23 % 2;
        String strS = ivas.gov.bisp.enumeration.p091n.j.s(sb, this.g, "}\n");
        int i25 = b + 63;
        a = i25 % 128;
        if (i25 % 2 != 0) {
            return strS;
        }
        throw null;
    }
}
