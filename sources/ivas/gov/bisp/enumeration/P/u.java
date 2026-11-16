package ivas.gov.bisp.enumeration.P;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.aM.T;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u extends ivas.gov.bisp.enumeration.aM.J {
    private static int a = 0;
    private static int b = 1;

    public final void J(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 74) + ((i2 & 74) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = t.d instanceof TextView;
            throw null;
        }
        View view = t.d;
        if (view instanceof TextView) {
            Map<String, Object> map = t.c;
            float scaleX = ((TextView) view).getScaleX();
            int i4 = b;
            int i5 = ((i4 & 95) - (~(i4 | 95))) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                map.put("android:textscale:scale", Float.valueOf(scaleX));
                throw null;
            }
            map.put("android:textscale:scale", Float.valueOf(scaleX));
        }
        int i6 = b;
        int i7 = (i6 ^ 91) + ((i6 & 91) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 70 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void i(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-24)) | ((~i2) & 23)) - (~((i2 & 23) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        J(t);
        int i5 = b;
        int i6 = ((i5 | 117) << 1) - (i5 ^ 117);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void l(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 46) + ((i2 & 46) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        J(t);
        if (i4 != 0) {
            throw null;
        }
        int i5 = b;
        int i6 = (i5 | 101) << 1;
        int i7 = -(i5 ^ 101);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public class beO implements ValueAnimator.AnimatorUpdateListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ TextView c;

        public beO(u uVar, TextView textView) {
            this.c = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = 2 % 2;
            int i2 = a + 121;
            b = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i4 = b;
            int i5 = (i4 & 17) + (i4 | 17);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.setScaleX(fFloatValue);
            TextView textView = this.c;
            int i7 = a;
            int i8 = i7 ^ 113;
            int i9 = -(-((i7 & 113) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            textView.setScaleY(fFloatValue);
            int i12 = b;
            int i13 = i12 & 33;
            int i14 = (i12 ^ 33) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // ivas.gov.bisp.enumeration.aM.J
    public Animator o(ViewGroup viewGroup, T t, T t2) {
        int i;
        View view;
        TextView textView;
        Map<String, Object> map;
        int i2;
        float f;
        float fFloatValue;
        ValueAnimator valueAnimatorOfFloat;
        beO beo;
        int i3;
        int i4;
        int i5;
        float fFloatValue2;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 ^ 61;
        int i12 = -(-((i10 & 61) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        a = i14;
        Object obj = null;
        if (i13 % 2 == 0) {
            if (t != null) {
                if (t2 != null) {
                    i = ((i14 | 5) << 1) - (i14 ^ 5);
                    b = i % 128;
                    if (i % 2 != 0) {
                        boolean z = t.d instanceof TextView;
                        throw null;
                    }
                    if (t.d instanceof TextView) {
                        int i15 = a;
                        int i16 = (i15 & (-26)) | ((~i15) & 25);
                        int i17 = -(-((i15 & 25) << 1));
                        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        view = t2.d;
                        if (view instanceof TextView) {
                            textView = (TextView) view;
                            Map<String, Object> map2 = t.c;
                            map = t2.c;
                            int i20 = b;
                            int i21 = ((i20 ^ 11) | (i20 & 11)) << 1;
                            int i22 = -(((~i20) & 11) | (i20 & (-12)));
                            i2 = (i21 ^ i22) + ((i22 & i21) << 1);
                            a = i2 % 128;
                            f = 1.0f;
                            if (i2 % 2 != 0) {
                                int i23 = b + 75;
                                a = i23 % 128;
                                int i24 = i23 % 2;
                                fFloatValue = 1.0f;
                            } else {
                                int i25 = b + 75;
                                a = i25 % 128;
                                int i26 = i25 % 2;
                                fFloatValue = 1.0f;
                            }
                            if (map.get("android:textscale:scale") != null) {
                                int i27 = b;
                                i5 = (i27 ^ 63) + ((i27 & 63) << 1);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    fFloatValue2 = ((Float) map.get("android:textscale:scale")).floatValue();
                                    int i28 = 1 / 0;
                                } else {
                                    fFloatValue2 = ((Float) map.get("android:textscale:scale")).floatValue();
                                }
                                f = fFloatValue2;
                            }
                            if (fFloatValue == f) {
                                int i29 = b;
                                int i30 = i29 + 93;
                                a = i30 % 128;
                                int i31 = i30 % 2;
                                i4 = (i29 ^ 115) + ((i29 & 115) << 1);
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    return null;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
                            beo = new beO(this, textView);
                            int i32 = a;
                            i3 = (i32 & 93) + (i32 | 93);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                valueAnimatorOfFloat.addUpdateListener(beo);
                                throw null;
                            }
                            valueAnimatorOfFloat.addUpdateListener(beo);
                        } else {
                            i6 = a;
                            int i33 = i6 & 63;
                            int i34 = (~i33) & (i6 | 63);
                            int i35 = i33 << 1;
                            i7 = (i34 ^ i35) + ((i35 & i34) << 1);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i36 = i6 & 17;
                            int i37 = ((i6 | 17) & (~i36)) + (i36 << 1);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                        }
                    }
                }
            }
            int i39 = a;
            int i40 = i39 & 59;
            i8 = i40 + ((i39 ^ 59) | i40);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return valueAnimatorOfFloat;
            }
            throw null;
        }
        int i41 = 85 / 0;
        if (t != null) {
            if (t2 != null) {
                i = ((i14 | 5) << 1) - (i14 ^ 5);
                b = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = t.d instanceof TextView;
                    throw null;
                }
                if (t.d instanceof TextView) {
                    int i110 = a;
                    int i111 = (i110 & (-26)) | ((~i110) & 25);
                    int i112 = -(-((i110 & 25) << 1));
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                    view = t2.d;
                    if (view instanceof TextView) {
                        i6 = a;
                        int i310 = i6 & 63;
                        int i311 = (~i310) & (i6 | 63);
                        int i312 = i310 << 1;
                        i7 = (i311 ^ i312) + ((i312 & i311) << 1);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i313 = i6 & 17;
                        int i314 = ((i6 | 17) & (~i313)) + (i313 << 1);
                        b = i314 % 128;
                        int i315 = i314 % 2;
                    } else {
                        textView = (TextView) view;
                        Map<String, Object> map3 = t.c;
                        map = t2.c;
                        int i210 = b;
                        int i211 = ((i210 ^ 11) | (i210 & 11)) << 1;
                        int i212 = -(((~i210) & 11) | (i210 & (-12)));
                        i2 = (i211 ^ i212) + ((i212 & i211) << 1);
                        a = i2 % 128;
                        f = 1.0f;
                        if (i2 % 2 != 0 ? map3.get("android:textscale:scale") == null : map3.get("android:textscale:scale") == null) {
                            int i213 = b + 75;
                            a = i213 % 128;
                            int i214 = i213 % 2;
                            fFloatValue = 1.0f;
                        } else {
                            Float f2 = (Float) map3.get("android:textscale:scale");
                            int i42 = a;
                            int i43 = ((i42 | 73) << 1) - (((~i42) & 73) | (i42 & (-74)));
                            b = i43 % 128;
                            if (i43 % 2 == 0) {
                                f2.floatValue();
                                throw null;
                            }
                            fFloatValue = f2.floatValue();
                        }
                        if (map.get("android:textscale:scale") != null) {
                            int i215 = b;
                            i5 = (i215 ^ 63) + ((i215 & 63) << 1);
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                fFloatValue2 = ((Float) map.get("android:textscale:scale")).floatValue();
                                int i216 = 1 / 0;
                            } else {
                                fFloatValue2 = ((Float) map.get("android:textscale:scale")).floatValue();
                            }
                            f = fFloatValue2;
                        }
                        if (fFloatValue == f) {
                            int i217 = b;
                            int i316 = i217 + 93;
                            a = i316 % 128;
                            int i317 = i316 % 2;
                            i4 = (i217 ^ 115) + ((i217 & 115) << 1);
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                return null;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
                        beo = new beO(this, textView);
                        int i318 = a;
                        i3 = (i318 & 93) + (i318 | 93);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            valueAnimatorOfFloat.addUpdateListener(beo);
                            throw null;
                        }
                        valueAnimatorOfFloat.addUpdateListener(beo);
                    }
                }
            }
        }
        int i319 = a;
        int i44 = i319 & 59;
        i8 = i44 + ((i319 ^ 59) | i44);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return valueAnimatorOfFloat;
        }
        throw null;
        valueAnimatorOfFloat = null;
        int i3110 = a;
        int i45 = i3110 & 59;
        i8 = i45 + ((i3110 ^ 59) | i45);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return valueAnimatorOfFloat;
        }
        throw null;
    }
}
