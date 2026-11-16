package ivas.gov.bisp.enumeration.T;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.T.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0026p {
    private static int a = 0;
    private static int b = 1;
    public final OooOOOO<String, z> c = new t();
    public final OooOOOO<String, PropertyValuesHolder[]> d = new t();

    public boolean equals(Object obj) {
        boolean zEquals;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = (-2) - (((i2 ^ 114) + ((i2 & 114) << 1)) ^ (-1));
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 114;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        if (!(obj instanceof C0026p)) {
            int i11 = i2 & 109;
            int i12 = i11 + ((i2 ^ 109) | i11);
            a = i12 % 128;
            return i12 % 2 != 0;
        }
        OooOOOO<String, z> oooOOOO = this.c;
        OooOOOO<String, z> oooOOOO2 = ((C0026p) obj).c;
        int i13 = (-2) - ((i4 + 74) ^ (-1));
        b = i13 % 128;
        if (i13 % 2 == 0) {
            zEquals = oooOOOO.equals(oooOOOO2);
            int i14 = 34 / 0;
        } else {
            zEquals = oooOOOO.equals(oooOOOO2);
        }
        int i15 = b;
        int i16 = (i15 ^ 91) + ((i15 & 91) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = this.c.hashCode();
        int i7 = b + 39;
        a = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public static C0026p c(Context context, TypedArray typedArray, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 2) + (i3 | 2)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (typedArray.hasValue(i)) {
            int i6 = a + 27;
            b = i6 % 128;
            int i7 = i6 % 2;
            int resourceId = typedArray.getResourceId(i, 0);
            if (i7 != 0 ? resourceId != 0 : resourceId != 0) {
                C0026p c0026pD = d(context, resourceId);
                int i8 = b;
                int i9 = (-2) - (((i8 & 58) + (i8 | 58)) ^ (-1));
                a = i9 % 128;
                int i10 = i9 % 2;
                return c0026pD;
            }
        }
        int i11 = a + 40;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static C0026p d(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 55;
        int i5 = ((i3 & 55) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        Object obj = null;
        try {
            if (i7 % 2 == 0) {
                boolean z = AnimatorInflater.loadAnimator(context, i) instanceof AnimatorSet;
                throw null;
            }
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                int i8 = a;
                int i9 = (((i8 ^ 21) | (i8 & 21)) << 1) - (((~i8) & 21) | (i8 & (-22)));
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    return e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                }
                e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                obj.hashCode();
                throw null;
            }
            if (animatorLoadAnimator == null) {
                int i10 = a;
                int i11 = (-2) - ((((i10 | 8) << 1) - (i10 ^ 8)) ^ (-1));
                b = i11 % 128;
                int i12 = i11 % 2;
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            int i13 = (-2) - ((a + 104) ^ (-1));
            b = i13 % 128;
            int i14 = i13 % 2;
            C0026p c0026pE = e(arrayList);
            int i15 = a;
            int i16 = i15 & 93;
            int i17 = ((i15 ^ 93) | i16) << 1;
            int i18 = -((i15 | 93) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            return c0026pE;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public z f(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = -(-((i2 ^ 1) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        boolean z = false;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
            if (this.c.getOrDefault(str, null) != null) {
                int i7 = b;
                int i8 = (((i7 | 5) << 1) - (~(-(((~i7) & 5) | (i7 & (-6)))))) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                int i10 = a;
                int i11 = (-2) - (((i10 & 68) + (i10 | 68)) ^ (-1));
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (this.c.getOrDefault(str, null) != null) {
            int i13 = b;
            int i14 = (((i13 | 5) << 1) - (~(-(((~i13) & 5) | (i13 & (-6)))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            int i16 = a;
            int i17 = (-2) - (((i16 & 68) + (i16 | 68)) ^ (-1));
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i19 = a + 55;
        b = i19 % 128;
        int i20 = i19 % 2;
        z zVar = (z) this.c.getOrDefault(str, null);
        int i21 = b;
        int i22 = ((i21 ^ 101) - (~((i21 & 101) << 1))) - 1;
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return zVar;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        int i2 = b + 21;
        a = i2 % 128;
        int i3 = i2 % 2;
        sb.append(C0026p.class.getName());
        int i4 = b;
        int i5 = ((i4 ^ 110) + ((i4 & 110) << 1)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        sb.append('{');
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i7 = a + 64;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        sb.append(hexString);
        sb.append(" timings: ");
        int i10 = a;
        int i11 = i10 & 91;
        int i12 = i11 + ((i10 ^ 91) | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        sb.append(this.c);
        sb.append("}\n");
        int i14 = b;
        int i15 = (i14 & (-86)) | ((~i14) & 85);
        int i16 = -(-((i14 & 85) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return sb.toString();
        }
        sb.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0100  */
    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0113 A[SYNTHETIC] */
    public static C0026p e(List<Animator> list) {
        TimeInterpolator timeInterpolator;
        TimeInterpolator timeInterpolator2;
        int i;
        OooOOOO<String, z> oooOOOO;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        C0026p c0026p = new C0026p();
        int size = list.size();
        int i6 = a;
        int i7 = ((i6 | 101) << 1) - (i6 ^ 101);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 | 87;
        int i10 = i9 << 1;
        int i11 = -((~(i6 & 87)) & i9);
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            int i16 = a;
            int i17 = ((i16 & 122) + (i16 | 122)) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            Animator animator = list.get(i15);
            int i19 = b + 117;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                boolean z = animator instanceof ObjectAnimator;
                throw null;
            }
            if (!(animator instanceof ObjectAnimator)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            int i20 = b;
            int i21 = ((i20 | 31) << 1) - (i20 ^ 31);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                Object obj = null;
                objectAnimator.getValues();
                obj.hashCode();
                throw null;
            }
            PropertyValuesHolder[] values = objectAnimator.getValues();
            OooOOOO<String, PropertyValuesHolder[]> oooOOOO2 = c0026p.d;
            int i22 = b;
            int i23 = i22 & 25;
            int i24 = (i23 - (~(-(-((i22 ^ 25) | i23))))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            oooOOOO2.put(propertyName, values);
            String propertyName2 = objectAnimator.getPropertyName();
            int i26 = a;
            int i27 = i26 ^ 55;
            int i28 = -(-((i26 & 55) << 1));
            int i29 = (i27 & i28) + (i28 | i27);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                objectAnimator.getStartDelay();
                objectAnimator.getDuration();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            int i30 = b + 7;
            a = i30 % 128;
            int i31 = i30 % 2;
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if (!(interpolator instanceof AccelerateDecelerateInterpolator)) {
                int i32 = a;
                int i33 = i32 + 77;
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = 88 / i14;
                    if (interpolator != null) {
                        int i35 = ((((i32 ^ 63) | (i32 & 63)) << 1) - (~(-(((~i32) & 63) | (i32 & (-64)))))) - 1;
                        i2 = i35 % 128;
                        b = i2;
                        int i36 = i35 % 2;
                        if (interpolator instanceof AccelerateInterpolator) {
                            i4 = ((i2 & (-46)) | ((~i2) & 45)) + ((i2 & 45) << 1);
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                TimeInterpolator timeInterpolator3 = j.e;
                                throw null;
                            }
                            timeInterpolator = j.e;
                        } else if (!(interpolator instanceof DecelerateInterpolator)) {
                            timeInterpolator2 = interpolator;
                        } else {
                            int i37 = i32 & 63;
                            i3 = i37 + ((i32 ^ 63) | i37);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                TimeInterpolator timeInterpolator4 = j.f;
                                throw null;
                            }
                            timeInterpolator = j.f;
                        }
                    } else {
                        timeInterpolator = j.d;
                        int i38 = a;
                        int i39 = (i38 & 5) + (i38 | 5);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                    }
                    timeInterpolator2 = timeInterpolator;
                } else {
                    if (interpolator != null) {
                        int i310 = ((((i32 ^ 63) | (i32 & 63)) << 1) - (~(-(((~i32) & 63) | (i32 & (-64)))))) - 1;
                        i2 = i310 % 128;
                        b = i2;
                        int i311 = i310 % 2;
                        if (interpolator instanceof AccelerateInterpolator) {
                            i4 = ((i2 & (-46)) | ((~i2) & 45)) + ((i2 & 45) << 1);
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                TimeInterpolator timeInterpolator5 = j.e;
                                throw null;
                            }
                            timeInterpolator = j.e;
                        } else if (!(interpolator instanceof DecelerateInterpolator)) {
                            timeInterpolator2 = interpolator;
                        } else {
                            int i312 = i32 & 63;
                            i3 = i312 + ((i32 ^ 63) | i312);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                TimeInterpolator timeInterpolator6 = j.f;
                                throw null;
                            }
                            timeInterpolator = j.f;
                        }
                    } else {
                        timeInterpolator = j.d;
                        int i313 = a;
                        int i314 = (i313 & 5) + (i313 | 5);
                        b = i314 % 128;
                        int i41 = i314 % 2;
                    }
                    timeInterpolator2 = timeInterpolator;
                }
            } else {
                timeInterpolator = j.d;
                int i315 = a;
                int i316 = (i315 & 5) + (i315 | 5);
                b = i316 % 128;
                int i42 = i316 % 2;
                timeInterpolator2 = timeInterpolator;
            }
            z zVar = new z(startDelay, duration, timeInterpolator2);
            int i43 = a;
            int i44 = ((i43 ^ 125) | (i43 & 125)) << 1;
            int i45 = -(((~i43) & 125) | (i43 & (-126)));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
            zVar.f = objectAnimator.getRepeatCount();
            int i48 = b;
            int i49 = i48 & 71;
            int i50 = ((i48 | 71) & (~i49)) + (i49 << 1);
            a = i50 % 128;
            if (i50 % 2 != 0) {
                zVar.g = objectAnimator.getRepeatMode();
                oooOOOO = c0026p.c;
                i = 0;
                int i51 = 20 / 0;
            } else {
                i = 0;
                zVar.g = objectAnimator.getRepeatMode();
                oooOOOO = c0026p.c;
            }
            oooOOOO.put(propertyName2, zVar);
            int i52 = i15 & 1;
            int i53 = ((i15 ^ 1) | i52) << 1;
            int i54 = -((i15 | 1) & (~i52));
            i15 = (i53 & i54) + (i53 | i54);
            int i55 = b;
            int i56 = i55 & 63;
            int i57 = (i55 | 63) & (~i56);
            int i58 = i56 << 1;
            int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
            a = i59 % 128;
            int i60 = i59 % 2;
            i14 = i;
        }
        int i61 = (-2) - ((a + 44) ^ (-1));
        b = i61 % 128;
        if (i61 % 2 != 0) {
            return c0026p;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
