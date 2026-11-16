package ivas.gov.bisp.enumeration.p088k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.p097r.o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0317n implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private static int a = 1;
    private static int b;
    public int c;
    public final float d;
    public final int e;
    public final int f;
    public Runnable g;
    public final View h;
    public Runnable i;
    public boolean j;
    public final int[] k = new int[2];

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.n$aRS */
    public class aRS implements Runnable {
        private static int a = 1;
        private static int b;

        public aRS() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1
  0x0029: PHI (r1v7 android.view.ViewParent) = (r1v6 android.view.ViewParent), (r1v15 android.view.ViewParent) binds: [B:8:0x0027, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 52) << 1) - (i2 ^ 52)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            View view = AbstractViewOnTouchListenerC0317n.this.h;
            if (i4 == 0) {
                parent = view.getParent();
                int i5 = 26 / 0;
                if (parent != null) {
                    int i6 = a;
                    int i7 = i6 & 115;
                    int i8 = i7 + ((i6 ^ 115) | i7);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    parent.requestDisallowInterceptTouchEvent(true);
                    int i10 = a;
                    int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else {
                parent = view.getParent();
                if (parent != null) {
                    int i13 = a;
                    int i14 = i13 & 115;
                    int i15 = i14 + ((i13 ^ 115) | i14);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    parent.requestDisallowInterceptTouchEvent(true);
                    int i17 = a;
                    int i18 = ((i17 | 109) << 1) - (i17 ^ 109);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            int i20 = b;
            int i21 = i20 & 29;
            int i22 = i21 + ((i20 ^ 29) | i21);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public AbstractViewOnTouchListenerC0317n(View view) {
        this.h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.f = ((ViewConfiguration.getLongPressTimeout() - (~(-(-tapTimeout)))) - 1) / 2;
    }

    public abstract o d();

    public abstract boolean e();

    public boolean f() {
        int i = 2 % 2;
        int i2 = a + 83;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            d();
            throw null;
        }
        o oVarD = d();
        if (oVarD != null) {
            int i3 = b + 23;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (!(!oVarD.e())) {
                int i5 = a;
                int i6 = ((i5 | 82) << 1) - (i5 ^ 82);
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                oVarD.dismiss();
                if (i8 != 0) {
                    int i9 = 94 / 0;
                }
                int i10 = b;
                int i11 = i10 & 33;
                int i12 = -(-((i10 ^ 33) | i11));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = a;
        int i16 = i15 & 101;
        int i17 = -(-((i15 ^ 101) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-30)) | ((~i2) & 29)) - (~((i2 & 29) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.j = true;
        } else {
            this.j = false;
        }
        this.c = -1;
        Runnable runnable = this.g;
        if (runnable != null) {
            int i4 = i2 & 33;
            int i5 = (((i2 | 33) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            this.h.removeCallbacks(runnable);
            int i7 = b;
            int i8 = (i7 & 51) + (i7 | 51);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = ((i10 ^ 28) + ((i10 & 28) << 1)) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void c() {
        int i = 2 % 2;
        int i2 = a + 125;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Runnable runnable = this.i;
        if (runnable != null) {
            int i5 = i3 & 69;
            int i6 = (i3 | 69) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.h.removeCallbacks(runnable);
            int i10 = a;
            int i11 = i10 ^ 59;
            int i12 = ((i10 & 59) | i11) << 1;
            int i13 = -i11;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        Runnable runnable2 = this.g;
        if (runnable2 != null) {
            int i16 = b;
            int i17 = (((i16 | 46) << 1) - (i16 ^ 46)) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            this.h.removeCallbacks(runnable2);
            int i19 = a + 19;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b + 39;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.n$aRT */
    public class aRT implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aRT() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            float f;
            float f2;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 ^ 13;
            int i6 = (i4 & 13) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                AbstractViewOnTouchListenerC0317n abstractViewOnTouchListenerC0317n = AbstractViewOnTouchListenerC0317n.this;
                abstractViewOnTouchListenerC0317n.c();
                View view = abstractViewOnTouchListenerC0317n.h;
                throw null;
            }
            AbstractViewOnTouchListenerC0317n abstractViewOnTouchListenerC0317n2 = AbstractViewOnTouchListenerC0317n.this;
            abstractViewOnTouchListenerC0317n2.c();
            View view2 = abstractViewOnTouchListenerC0317n2.h;
            if (view2.isEnabled()) {
                int i8 = b + 73;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    view2.isLongClickable();
                    throw null;
                }
                if (!view2.isLongClickable() && abstractViewOnTouchListenerC0317n2.e()) {
                    int i9 = b + 115;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    int i11 = a;
                    int i12 = i11 & 59;
                    int i13 = (i11 ^ 59) | i12;
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        i = 4;
                        f = 0.0f;
                        f2 = 1.0f;
                        i2 = 1;
                    } else {
                        i = 3;
                        f = 0.0f;
                        f2 = 0.0f;
                        i2 = 0;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, i, f, f2, i2);
                    view2.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0317n2.j = true;
                    int i15 = b + 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            int i17 = a;
            int i18 = i17 & 5;
            int i19 = ((((i17 ^ 5) | i18) << 1) - (~(-((i17 | 5) & (~i18))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x042f  */
    /* JADX WARN: Code duplicated, block: B:136:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX WARN: Code duplicated, block: B:34:0x011f  */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153  */
    /* JADX WARN: Code duplicated, block: B:41:0x0164  */
    /* JADX WARN: Code duplicated, block: B:42:0x0166  */
    /* JADX WARN: Code duplicated, block: B:45:0x016a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0303  */
    /* JADX WARN: Code duplicated, block: B:97:0x0359  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        long jUptimeMillis;
        int i;
        float f;
        float f2;
        float x;
        float y;
        float f3;
        int i2;
        int i3;
        o00000OO o00000oo;
        int i4;
        MotionEvent motionEventObtainNoHistory;
        int[] iArr;
        int i5;
        float f4;
        int i6;
        boolean zE;
        int i7;
        int actionMasked;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = i12 + 1;
        a = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            throw null;
        }
        boolean z5 = this.j;
        boolean z6 = false;
        if (!(!z5)) {
            int i14 = i12 & 63;
            int i15 = (i14 - (~((i12 ^ 63) | i14))) - 1;
            a = i15 % 128;
            if (i15 % 2 == 0) {
                d();
                throw null;
            }
            View view2 = this.h;
            o oVarD = d();
            if (oVarD != null) {
                int i16 = b + 97;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 63 / 0;
                    if (oVarD.e()) {
                        int i18 = a;
                        int i19 = i18 & 125;
                        int i20 = (i18 | 125) & (~i19);
                        int i21 = -(-(i19 << 1));
                        int i22 = (i20 & i21) + (i20 | i21);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                        o00000oo = (o00000OO) oVarD.i();
                        if (o00000oo != null) {
                            int i24 = (-2) - ((a + 102) ^ (-1));
                            b = i24 % 128;
                            int i25 = i24 % 2;
                            if (!o00000oo.isShown()) {
                                int i26 = a;
                                i4 = (i26 & 77) + (i26 | 77);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    MotionEvent.obtainNoHistory(motionEvent);
                                    obj.hashCode();
                                    throw null;
                                }
                                motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                int[] iArr2 = this.k;
                                view2.getLocationOnScreen(iArr2);
                                float f5 = iArr2[0];
                                int i27 = b;
                                int i28 = (i27 ^ 41) + ((i27 & 41) << 1);
                                a = i28 % 128;
                                int i29 = i28 % 2;
                                motionEventObtainNoHistory.offsetLocation(f5, iArr2[1]);
                                iArr = this.k;
                                int i30 = a;
                                int i31 = i30 & 27;
                                int i32 = (i30 | 27) & (~i31);
                                int i33 = -(-(i31 << 1));
                                i5 = (i32 & i33) + (i32 | i33);
                                b = i5 % 128;
                                if (i5 % 2 != 0) {
                                    o00000oo.getLocationOnScreen(iArr);
                                    f4 = -iArr[0];
                                    i6 = iArr[1];
                                } else {
                                    o00000oo.getLocationOnScreen(iArr);
                                    f4 = -iArr[0];
                                    i6 = iArr[1];
                                }
                                int i34 = b;
                                int i35 = ((i34 | 102) << 1) - (i34 ^ 102);
                                int i36 = (i35 ^ (-1)) + (i35 << 1);
                                a = i36 % 128;
                                int i37 = i36 % 2;
                                motionEventObtainNoHistory.offsetLocation(f4, -i6);
                                zE = o00000oo.e(motionEventObtainNoHistory, this.c);
                                int i38 = b;
                                int i39 = i38 & 89;
                                i7 = i39 + ((i38 ^ 89) | i39);
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    motionEventObtainNoHistory.recycle();
                                    motionEvent.getActionMasked();
                                    throw null;
                                }
                                motionEventObtainNoHistory.recycle();
                                actionMasked = motionEvent.getActionMasked();
                                if (actionMasked != 1) {
                                    int i40 = a;
                                    int i41 = ((i40 | 19) << 1) - (i40 ^ 19);
                                    i10 = i41 % 128;
                                    b = i10;
                                    int i42 = i41 % 2;
                                    if (actionMasked != 3) {
                                        int i43 = i10 & 77;
                                        int i44 = i43 + ((i10 ^ 77) | i43);
                                        a = i44 % 128;
                                        int i45 = i44 % 2;
                                        z3 = true;
                                    } else {
                                        int i46 = a;
                                        int i47 = ((i46 | 67) << 1) - (i46 ^ 67);
                                        b = i47 % 128;
                                        int i48 = i47 % 2;
                                        z3 = false;
                                    }
                                } else {
                                    int i49 = a;
                                    int i410 = ((i49 | 67) << 1) - (i49 ^ 67);
                                    b = i410 % 128;
                                    int i411 = i410 % 2;
                                    z3 = false;
                                }
                                if (zE) {
                                    int i50 = b;
                                    int i51 = i50 & 119;
                                    int i52 = ((i50 ^ 119) | i51) << 1;
                                    int i53 = -((i50 | 119) & (~i51));
                                    int i54 = (i52 & i53) + (i53 | i52);
                                    i8 = i54 % 128;
                                    a = i8;
                                    int i55 = i54 % 2;
                                    if (z3) {
                                        int i56 = i8 ^ 125;
                                        i9 = ((((i8 & 125) | i56) << 1) - (~(-i56))) - 1;
                                        b = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                        }
                                    }
                                    int i57 = a;
                                    int i58 = i57 & 3;
                                    int i59 = ((i57 ^ 3) | i58) << 1;
                                    int i60 = -((i57 | 3) & (~i58));
                                    i3 = (i59 ^ i60) + ((i60 & i59) << 1);
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        f();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (f()) {
                                        int i61 = b + 73;
                                        a = i61 % 128;
                                        int i62 = i61 % 2;
                                        z2 = false;
                                    }
                                }
                            }
                        }
                    }
                } else if (!(!oVarD.e())) {
                    int i110 = a;
                    int i111 = i110 & 125;
                    int i210 = (i110 | 125) & (~i111);
                    int i211 = -(-(i111 << 1));
                    int i212 = (i210 & i211) + (i210 | i211);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                    o00000oo = (o00000OO) oVarD.i();
                    if (o00000oo != null) {
                        int i214 = (-2) - ((a + 102) ^ (-1));
                        b = i214 % 128;
                        int i215 = i214 % 2;
                        if (!o00000oo.isShown()) {
                            int i216 = a;
                            i4 = (i216 & 77) + (i216 | 77);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                MotionEvent.obtainNoHistory(motionEvent);
                                obj.hashCode();
                                throw null;
                            }
                            motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                            int[] iArr3 = this.k;
                            view2.getLocationOnScreen(iArr3);
                            float f6 = iArr3[0];
                            int i217 = b;
                            int i218 = (i217 ^ 41) + ((i217 & 41) << 1);
                            a = i218 % 128;
                            int i219 = i218 % 2;
                            motionEventObtainNoHistory.offsetLocation(f6, iArr3[1]);
                            iArr = this.k;
                            int i310 = a;
                            int i311 = i310 & 27;
                            int i312 = (i310 | 27) & (~i311);
                            int i313 = -(-(i311 << 1));
                            i5 = (i312 & i313) + (i312 | i313);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                o00000oo.getLocationOnScreen(iArr);
                                f4 = -iArr[0];
                                i6 = iArr[1];
                            } else {
                                o00000oo.getLocationOnScreen(iArr);
                                f4 = -iArr[0];
                                i6 = iArr[1];
                            }
                            int i314 = b;
                            int i315 = ((i314 | 102) << 1) - (i314 ^ 102);
                            int i316 = (i315 ^ (-1)) + (i315 << 1);
                            a = i316 % 128;
                            int i317 = i316 % 2;
                            motionEventObtainNoHistory.offsetLocation(f4, -i6);
                            zE = o00000oo.e(motionEventObtainNoHistory, this.c);
                            int i318 = b;
                            int i319 = i318 & 89;
                            i7 = i319 + ((i318 ^ 89) | i319);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                motionEventObtainNoHistory.recycle();
                                motionEvent.getActionMasked();
                                throw null;
                            }
                            motionEventObtainNoHistory.recycle();
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                int i412 = a;
                                int i413 = ((i412 | 19) << 1) - (i412 ^ 19);
                                i10 = i413 % 128;
                                b = i10;
                                int i414 = i413 % 2;
                                if (actionMasked != 3) {
                                    int i415 = i10 & 77;
                                    int i416 = i415 + ((i10 ^ 77) | i415);
                                    a = i416 % 128;
                                    int i417 = i416 % 2;
                                    z3 = true;
                                } else {
                                    int i418 = a;
                                    int i419 = ((i418 | 67) << 1) - (i418 ^ 67);
                                    b = i419 % 128;
                                    int i4110 = i419 % 2;
                                    z3 = false;
                                }
                            } else {
                                int i4111 = a;
                                int i4112 = ((i4111 | 67) << 1) - (i4111 ^ 67);
                                b = i4112 % 128;
                                int i4113 = i4112 % 2;
                                z3 = false;
                            }
                            if (zE) {
                                int i510 = b;
                                int i511 = i510 & 119;
                                int i512 = ((i510 ^ 119) | i511) << 1;
                                int i513 = -((i510 | 119) & (~i511));
                                int i514 = (i512 & i513) + (i513 | i512);
                                i8 = i514 % 128;
                                a = i8;
                                int i515 = i514 % 2;
                                if (z3) {
                                    int i516 = i8 ^ 125;
                                    i9 = ((((i8 & 125) | i516) << 1) - (~(-i516))) - 1;
                                    b = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                    }
                                }
                                int i517 = a;
                                int i518 = i517 & 3;
                                int i519 = ((i517 ^ 3) | i518) << 1;
                                int i63 = -((i517 | 3) & (~i518));
                                i3 = (i519 ^ i63) + ((i63 & i519) << 1);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    f();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (f()) {
                                    int i64 = b + 73;
                                    a = i64 % 128;
                                    int i65 = i64 % 2;
                                    z2 = false;
                                }
                            }
                        }
                    }
                }
                int i66 = b;
                int i67 = i66 ^ 9;
                int i68 = ((i66 & 9) | i67) << 1;
                int i69 = -i67;
                int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                a = i70 % 128;
                int i71 = i70 % 2;
                int i5110 = a;
                int i5111 = i5110 & 3;
                int i5112 = ((i5110 ^ 3) | i5111) << 1;
                int i610 = -((i5110 | 3) & (~i5111));
                i3 = (i5112 ^ i610) + ((i610 & i5112) << 1);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    f();
                    obj.hashCode();
                    throw null;
                }
                if (f()) {
                    int i611 = b + 73;
                    a = i611 % 128;
                    int i612 = i611 % 2;
                    z2 = false;
                }
            } else {
                int i613 = b;
                int i614 = i613 ^ 9;
                int i615 = ((i613 & 9) | i614) << 1;
                int i616 = -i614;
                int i72 = ((i615 | i616) << 1) - (i615 ^ i616);
                a = i72 % 128;
                int i73 = i72 % 2;
                int i5113 = a;
                int i5114 = i5113 & 3;
                int i5115 = ((i5113 ^ 3) | i5114) << 1;
                int i617 = -((i5113 | 3) & (~i5114));
                i3 = (i5115 ^ i617) + ((i617 & i5115) << 1);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    f();
                    obj.hashCode();
                    throw null;
                }
                if (f()) {
                    int i618 = b + 73;
                    a = i618 % 128;
                    int i619 = i618 % 2;
                    z2 = false;
                }
            }
            int i74 = b;
            int i75 = i74 & 19;
            int i76 = -(-((i74 ^ 19) | i75));
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            a = i77 % 128;
            int i78 = i77 % 2;
            z2 = true;
        } else {
            View view3 = this.h;
            if (!view3.isEnabled()) {
                int i79 = a;
                int i80 = i79 & 7;
                int i81 = (((i79 ^ 7) | i80) << 1) - ((i79 | 7) & (~i80));
                b = i81 % 128;
                int i82 = i81 % 2;
                z = false;
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    int i83 = a;
                    int i84 = i83 & 7;
                    int i85 = -(-((i83 ^ 7) | i84));
                    int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                    int i87 = i86 % 128;
                    b = i87;
                    int i88 = i86 % 2;
                    if (actionMasked2 != 1) {
                        int i89 = ((i87 | 67) << 1) - (i87 ^ 67);
                        int i90 = i89 % 128;
                        a = i90;
                        int i91 = i89 % 2;
                        if (actionMasked2 != 2) {
                            int i92 = (i90 | 97) << 1;
                            int i93 = -(i90 ^ 97);
                            int i94 = (i92 & i93) + (i92 | i93);
                            int i95 = i94 % 128;
                            b = i95;
                            int i96 = i94 % 2;
                            if (actionMasked2 != 3) {
                                int i97 = i95 & 45;
                                int i98 = -(-((i95 ^ 45) | i97));
                                int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                                a = i99 % 128;
                                int i100 = i99 % 2;
                            } else {
                                c();
                                int i101 = a;
                                int i102 = i101 & 97;
                                int i103 = (i101 | 97) & (~i102);
                                int i104 = i102 << 1;
                                int i105 = (i103 & i104) + (i103 | i104);
                                b = i105 % 128;
                                int i106 = i105 % 2;
                            }
                        } else {
                            int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
                            if (iFindPointerIndex >= 0) {
                                int i107 = b;
                                int i108 = i107 & 103;
                                int i109 = -(-((i107 ^ 103) | i108));
                                int i112 = (i108 & i109) + (i109 | i108);
                                a = i112 % 128;
                                if (i112 % 2 == 0) {
                                    x = motionEvent.getX(iFindPointerIndex);
                                    y = motionEvent.getY(iFindPointerIndex);
                                    int i113 = 21 / 0;
                                } else {
                                    x = motionEvent.getX(iFindPointerIndex);
                                    y = motionEvent.getY(iFindPointerIndex);
                                }
                                int i114 = b;
                                int i115 = ((i114 | 120) << 1) - (i114 ^ 120);
                                int i116 = (i115 ^ (-1)) + (i115 << 1);
                                int i117 = i116 % 128;
                                a = i117;
                                if (i116 % 2 == 0) {
                                    throw null;
                                }
                                float f7 = this.d;
                                float f8 = -f7;
                                if (x >= f8) {
                                    int i118 = ((i117 & 16) + (i117 | 16)) - 1;
                                    int i119 = i118 % 128;
                                    b = i119;
                                    int i120 = i118 % 2;
                                    if (y >= f8) {
                                        int i121 = i119 & 93;
                                        int i122 = (i119 ^ 93) | i121;
                                        int i123 = (i121 & i122) + (i122 | i121);
                                        a = i123 % 128;
                                        if (i123 % 2 == 0) {
                                            int right = view3.getRight();
                                            int left = view3.getLeft();
                                            int i124 = right & left;
                                            if (x < ((((right | left) & (~i124)) - (~(i124 << 1))) - 1) * f7) {
                                                int i125 = a;
                                                int i126 = (i125 | 99) << 1;
                                                int i127 = -(((~i125) & 99) | (i125 & (-100)));
                                                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                                                b = i128 % 128;
                                                int i129 = i128 % 2;
                                                int bottom = view3.getBottom();
                                                int i130 = -view3.getTop();
                                                int i131 = bottom | i130;
                                                int i132 = i131 << 1;
                                                int i133 = -((~(bottom & i130)) & i131);
                                                f3 = (i132 ^ i133) + ((i133 & i132) << 1);
                                                int i134 = a;
                                                int i135 = ((i134 & 30) + (i134 | 30)) - 1;
                                                i2 = i135 % 128;
                                                b = i2;
                                                int i136 = i135 % 2;
                                                if (y < f3 + f7) {
                                                    int i137 = (i2 & 119) + (i2 | 119);
                                                    a = i137 % 128;
                                                    int i138 = i137 % 2;
                                                    int i139 = i2 + 69;
                                                    a = i139 % 128;
                                                    int i140 = i139 % 2;
                                                }
                                            }
                                        } else if (x < ((view3.getRight() - (~(-(~(-view3.getLeft()))))) - 2) + f7) {
                                            int i1210 = a;
                                            int i1211 = (i1210 | 99) << 1;
                                            int i1212 = -(((~i1210) & 99) | (i1210 & (-100)));
                                            int i1213 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                                            b = i1213 % 128;
                                            int i1214 = i1213 % 2;
                                            int bottom2 = view3.getBottom();
                                            int i1310 = -view3.getTop();
                                            int i1311 = bottom2 | i1310;
                                            int i1312 = i1311 << 1;
                                            int i1313 = -((~(bottom2 & i1310)) & i1311);
                                            f3 = (i1312 ^ i1313) + ((i1313 & i1312) << 1);
                                            int i1314 = a;
                                            int i1315 = ((i1314 & 30) + (i1314 | 30)) - 1;
                                            i2 = i1315 % 128;
                                            b = i2;
                                            int i1316 = i1315 % 2;
                                            if (y < f3 + f7) {
                                                int i1317 = (i2 & 119) + (i2 | 119);
                                                a = i1317 % 128;
                                                int i1318 = i1317 % 2;
                                                int i1319 = i2 + 69;
                                                a = i1319 % 128;
                                                int i141 = i1319 % 2;
                                            }
                                        }
                                    }
                                }
                                int i142 = b;
                                int i143 = i142 ^ 25;
                                int i144 = -(-((i142 & 25) << 1));
                                int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                                int i146 = i145 % 128;
                                a = i146;
                                int i147 = i145 % 2;
                                int i148 = i146 & 25;
                                int i149 = -(-((i146 ^ 25) | i148));
                                int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                                b = i150 % 128;
                                int i151 = i150 % 2;
                                c();
                                view3.getParent().requestDisallowInterceptTouchEvent(true);
                                int i152 = a;
                                int i153 = i152 ^ 73;
                                int i154 = ((((i152 & 73) | i153) << 1) - (~(-i153))) - 1;
                                b = i154 % 128;
                                int i155 = i154 % 2;
                                z = true;
                            }
                        }
                    } else {
                        c();
                        int i1010 = a;
                        int i1011 = i1010 & 97;
                        int i1012 = (i1010 | 97) & (~i1011);
                        int i1013 = i1011 << 1;
                        int i1014 = (i1012 & i1013) + (i1012 | i1013);
                        b = i1014 % 128;
                        int i1015 = i1014 % 2;
                    }
                } else {
                    this.c = motionEvent.getPointerId(0);
                    if (this.g == null) {
                        this.g = new aRS();
                        int i156 = a;
                        int i157 = ((i156 ^ 97) | (i156 & 97)) << 1;
                        int i158 = -(((~i156) & 97) | (i156 & (-98)));
                        int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                        b = i159 % 128;
                        int i160 = i159 % 2;
                    }
                    view3.postDelayed(this.g, this.e);
                    int i161 = b;
                    int i162 = ((i161 | 95) << 1) - (i161 ^ 95);
                    a = i162 % 128;
                    if (i162 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.i == null) {
                        this.i = new aRT();
                        int i163 = b;
                        int i164 = (((i163 & (-120)) | ((~i163) & 119)) - (~((i163 & 119) << 1))) - 1;
                        a = i164 % 128;
                        if (i164 % 2 == 0) {
                            int i165 = 5 / 2;
                        }
                    }
                    view3.postDelayed(this.i, this.f);
                    int i166 = a;
                    int i167 = i166 | 33;
                    int i168 = i167 << 1;
                    int i169 = -((~(i166 & 33)) & i167);
                    int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                    b = i170 % 128;
                    if (i170 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
                int i710 = a;
                int i810 = i710 & 7;
                int i811 = (((i710 ^ 7) | i810) << 1) - ((i710 | 7) & (~i810));
                b = i811 % 128;
                int i812 = i811 % 2;
                z = false;
            }
            if (!(!z)) {
                int i171 = a + 104;
                int i172 = (i171 ^ (-1)) + (i171 << 1);
                b = i172 % 128;
                if (i172 % 2 != 0) {
                    e();
                    obj.hashCode();
                    throw null;
                }
                if (!e()) {
                    int i173 = b;
                    int i174 = i173 ^ 59;
                    int i175 = ((i173 & 59) | i174) << 1;
                    int i176 = -i174;
                    int i177 = ((i175 | i176) << 1) - (i175 ^ i176);
                    a = i177 % 128;
                    int i178 = i177 % 2;
                    z2 = false;
                } else {
                    int i179 = b;
                    int i180 = (i179 & 85) + (i179 | 85);
                    a = i180 % 128;
                    int i181 = i180 % 2;
                    z2 = true;
                }
            } else {
                int i1710 = b;
                int i1711 = i1710 ^ 59;
                int i1712 = ((i1710 & 59) | i1711) << 1;
                int i1713 = -i1711;
                int i1714 = ((i1712 | i1713) << 1) - (i1712 ^ i1713);
                a = i1714 % 128;
                int i1715 = i1714 % 2;
                z2 = false;
            }
            if (!(!z2)) {
                int i182 = a;
                int i183 = i182 & 93;
                int i184 = -(-((i182 ^ 93) | i183));
                int i185 = ((i183 | i184) << 1) - (i184 ^ i183);
                b = i185 % 128;
                if (i185 % 2 != 0) {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    i = 2;
                    f = 2.0f;
                    f2 = 1.0f;
                } else {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    i = 3;
                    f = 0.0f;
                    f2 = 0.0f;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, i, f, f2, 0);
                int i186 = a;
                int i187 = i186 ^ 113;
                int i188 = ((i186 & 113) | i187) << 1;
                int i189 = -i187;
                int i190 = ((i188 | i189) << 1) - (i188 ^ i189);
                b = i190 % 128;
                if (i190 % 2 != 0) {
                    this.h.onTouchEvent(motionEventObtain);
                    int i191 = 98 / 0;
                } else {
                    this.h.onTouchEvent(motionEventObtain);
                }
                motionEventObtain.recycle();
                int i192 = b;
                int i193 = i192 & 69;
                int i194 = (i192 | 69) & (~i193);
                int i195 = -(-(i193 << 1));
                int i196 = ((i194 | i195) << 1) - (i194 ^ i195);
                a = i196 % 128;
                int i197 = i196 % 2;
                z2 = true;
            }
        }
        this.j = z2;
        if (!(!z2)) {
            z6 = true;
        } else {
            int i198 = a;
            int i199 = i198 ^ 31;
            int i200 = -(-((i198 & 31) << 1));
            int i201 = (i199 & i200) + (i199 | i200);
            b = i201 % 128;
            int i202 = i201 % 2;
            if (z5) {
                int i203 = ((i198 & 64) + (i198 | 64)) - 1;
                b = i203 % 128;
                if (i203 % 2 == 0) {
                    z6 = true;
                }
            } else {
                int i204 = (((i198 & (-32)) | ((~i198) & 31)) - (~((i198 & 31) << 1))) - 1;
                b = i204 % 128;
                int i205 = i204 % 2;
            }
        }
        int i206 = b;
        int i207 = ((i206 | 41) << 1) - (i206 ^ 41);
        a = i207 % 128;
        int i208 = i207 % 2;
        return z6;
    }
}
