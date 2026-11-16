package ivas.gov.bisp.enumeration.L;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.o0Oo0oo.OooO0o;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<V extends View> extends OooO0o<V> {
    private static int a = 0;
    private static int b = 1;
    public VelocityTracker e;
    public Runnable f;
    public OverScroller g;
    public int h;
    public boolean i;
    public int j;
    public int k;

    public c() {
        this.h = -1;
        this.k = -1;
    }

    public void A(CoordinatorLayout coordinatorLayout, V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 24) + (i2 | 24)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public int B() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-122)) | ((~i2) & 121)) + ((i2 & 121) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iU = u();
        int i5 = b;
        int i6 = (i5 | 35) << 1;
        int i7 = -(i5 ^ 35);
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return iU;
        }
        throw null;
    }

    public int E(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 97) << 1) - (i3 ^ 97);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            D(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
            throw null;
        }
        int iD = D(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int i5 = a;
        int i6 = i5 ^ 65;
        int i7 = -(-((i5 & 65) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 41 / 0;
        }
        return iD;
    }

    public int x(V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 11) | (i2 & 11)) << 1) - (((~i2) & 11) | (i2 & (-12)));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            v.getHeight();
            throw null;
        }
        int height = v.getHeight();
        int i4 = b;
        int i5 = (i4 & (-110)) | ((~i4) & 109);
        int i6 = (i4 & 109) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return height;
    }

    public boolean y(V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 23;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 ^ 95;
        int i6 = ((i2 & 95) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int z(V v) {
        int i = 2 % 2;
        int i2 = a + 115;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return -v.getHeight();
        }
        int i3 = 51 / 0;
        return -v.getHeight();
    }

    public final int C(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 17;
        int i7 = (i5 | 17) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        int iB = B();
        int i11 = -i;
        int i12 = iB & i11;
        int i13 = i12 + ((i11 ^ iB) | i12);
        int i14 = a;
        int i15 = i14 & 13;
        int i16 = i14 | 13;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return D(coordinatorLayout, v, i13, i2, i3);
        }
        D(coordinatorLayout, v, i13, i2, i3);
        throw null;
    }

    public class bIP implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final CoordinatorLayout c;
        public final V d;

        public bIP(CoordinatorLayout coordinatorLayout, V v) {
            this.c = coordinatorLayout;
            this.d = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            CoordinatorLayout coordinatorLayout;
            V v;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 13) + (i2 | 13);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (this.d != null) {
                int i5 = i2 & 73;
                int i6 = i2 | 73;
                int i7 = (i5 & i6) + (i6 | i5);
                b = i7 % 128;
                int i8 = i7 % 2;
                OverScroller overScroller = c.this.g;
                if (overScroller != null) {
                    int i9 = a + 41;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    if (overScroller.computeScrollOffset()) {
                        int i11 = a + 87;
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            cVar = c.this;
                            coordinatorLayout = this.c;
                            v = this.d;
                            int i12 = 7 / 0;
                        } else {
                            cVar = c.this;
                            coordinatorLayout = this.c;
                            v = this.d;
                        }
                        cVar.E(coordinatorLayout, v, cVar.g.getCurrY());
                        int i13 = b;
                        int i14 = i13 & 123;
                        int i15 = (i13 | 123) & (~i14);
                        int i16 = i14 << 1;
                        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                        a = i17 % 128;
                        if (i17 % 2 != 0) {
                            V v2 = this.d;
                            WeakHashMap<View, R> weakHashMap = T.c;
                            T.aWX.o(v2, this);
                            int i18 = 15 / 0;
                        } else {
                            V v3 = this.d;
                            WeakHashMap<View, R> weakHashMap2 = T.c;
                            T.aWX.o(v3, this);
                        }
                        int i19 = b;
                        int i20 = ((i19 ^ 111) | (i19 & 111)) << 1;
                        int i21 = -(((~i19) & 111) | (i19 & (-112)));
                        int i22 = (i20 & i21) + (i21 | i20);
                        a = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 16 / 0;
                            return;
                        }
                        return;
                    }
                    c cVar2 = c.this;
                    CoordinatorLayout coordinatorLayout2 = this.c;
                    V v4 = this.d;
                    int i24 = b;
                    int i25 = i24 & 27;
                    int i26 = -(-((i24 ^ 27) | i25));
                    int i27 = (i25 & i26) + (i26 | i25);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    cVar2.A(coordinatorLayout2, v4);
                    int i29 = b;
                    int i30 = (((i29 | 122) << 1) - (i29 ^ 122)) - 1;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                }
            }
            int i32 = b + 115;
            a = i32 % 128;
            int i33 = i32 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public int D(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4;
        int i5;
        int iQ;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 & 89;
        int i12 = -(-(i10 | 89));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        int iU = u();
        if (i14 == 0) {
            if (i2 != 0) {
                if (iU >= i2) {
                    int i15 = a;
                    int i16 = i15 & 13;
                    int i17 = -(-(i15 | 13));
                    int i18 = (i16 & i17) + (i17 | i16);
                    i4 = i18 % 128;
                    b = i4;
                    int i19 = i18 % 2;
                    if (iU <= i3) {
                        i5 = i4 + 123;
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            ivas.gov.bisp.enumeration.O.r.q(i, i2, i3);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        iQ = ivas.gov.bisp.enumeration.O.r.q(i, i2, i3);
                        if (iU != iQ) {
                            int i20 = a;
                            i6 = ((i20 | 11) << 1) - (i20 ^ 11);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                v(iQ);
                                i7 = iU >>> iQ;
                            } else {
                                v(iQ);
                                int i21 = -(~(-iQ));
                                i7 = ((iU ^ i21) + ((i21 & iU) << 1)) - 1;
                            }
                        }
                    }
                }
            }
            int i22 = b;
            int i23 = i22 ^ 23;
            i8 = (((i22 & 23) | i23) << 1) - i23;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i24 = 63 / 0;
            }
            return i7;
        }
        int i25 = 57 / 0;
        if (i2 != 0) {
            if (iU >= i2) {
                int i110 = a;
                int i111 = i110 & 13;
                int i112 = -(-(i110 | 13));
                int i113 = (i111 & i112) + (i112 | i111);
                i4 = i113 % 128;
                b = i4;
                int i114 = i113 % 2;
                if (iU <= i3) {
                    i5 = i4 + 123;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        ivas.gov.bisp.enumeration.O.r.q(i, i2, i3);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    iQ = ivas.gov.bisp.enumeration.O.r.q(i, i2, i3);
                    if (iU != iQ) {
                        int i26 = a;
                        i6 = ((i26 | 11) << 1) - (i26 ^ 11);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            v(iQ);
                            i7 = iU >>> iQ;
                        } else {
                            v(iQ);
                            int i27 = -(~(-iQ));
                            i7 = ((iU ^ i27) + ((i27 & iU) << 1)) - 1;
                        }
                    }
                }
            }
        }
        int i28 = b;
        int i29 = i28 ^ 23;
        i8 = (((i28 & 23) | i29) << 1) - i29;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i210 = 63 / 0;
        }
        return i7;
        int i30 = a;
        int i31 = (i30 ^ 29) + ((i30 & 29) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        i7 = 0;
        int i211 = b;
        int i212 = i211 ^ 23;
        i8 = (((i211 & 23) | i212) << 1) - i212;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i213 = 63 / 0;
        }
        return i7;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0178  */
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 125) + (i2 | 125);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.k < 0) {
            this.k = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
            int i4 = a;
            int i5 = ((i4 | 8) << 1) - (i4 ^ 8);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        if (motionEvent.getActionMasked() == 2) {
            int i8 = a;
            int i9 = i8 & 101;
            int i10 = (i9 - (~(-(-((i8 ^ 101) | i9))))) - 1;
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            if (this.i) {
                int i13 = i11 | 11;
                int i14 = (i13 << 1) - (i13 & (~(i11 & 11)));
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                int i15 = this.h;
                if (i15 == -1) {
                    int i16 = i11 & 91;
                    int i17 = ((i11 ^ 91) | i16) << 1;
                    int i18 = -((~i16) & (i11 | 91));
                    int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = (i11 & (-116)) | ((~i11) & 115);
                    int i22 = -(-((i11 & 115) << 1));
                    int i23 = (i21 & i22) + (i21 | i22);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = 33 / 0;
                    }
                    return false;
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(i15);
                if (iFindPointerIndex == -1) {
                    int i25 = b;
                    int i26 = (i25 & 47) + (i25 | 47);
                    a = i26 % 128;
                    boolean z2 = i26 % 2 != 0;
                    int i27 = i25 + 33;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    return z2;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i29 = -this.j;
                int i30 = ((y ^ i29) | (y & i29)) << 1;
                int i31 = -((i29 & (~y)) | ((~i29) & y));
                int i32 = (i30 & i31) + (i31 | i30);
                int i33 = a;
                int i34 = ((i33 | 125) << 1) - (i33 ^ 125);
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    Math.abs(i32);
                    obj.hashCode();
                    throw null;
                }
                if (Math.abs(i32) > this.k) {
                    int i35 = a;
                    int i36 = (((i35 ^ 19) | (i35 & 19)) << 1) - (((~i35) & 19) | (i35 & (-20)));
                    int i37 = i36 % 128;
                    b = i37;
                    int i38 = i36 % 2;
                    this.j = y;
                    int i39 = i37 & 57;
                    int i40 = (i37 ^ 57) | i39;
                    int i41 = (i39 & i40) + (i40 | i39);
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    return true;
                }
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            int i43 = a;
            int i44 = (((i43 ^ 101) | (i43 & 101)) << 1) - (((~i43) & 101) | (i43 & (-102)));
            b = i44 % 128;
            int i45 = i44 % 2;
            this.h = -1;
            int x = (int) motionEvent.getX();
            float y2 = motionEvent.getY();
            int i46 = a;
            int i47 = i46 & 99;
            int i48 = (i46 | 99) & (~i47);
            int i49 = i47 << 1;
            int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
            b = i50 % 128;
            if (i50 % 2 == 0) {
                y(v);
                obj.hashCode();
                throw null;
            }
            int i51 = (int) y2;
            if (y(v)) {
                int i52 = b;
                int i53 = i52 & 101;
                int i54 = (i52 ^ 101) | i53;
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                a = i55 % 128;
                int i56 = i55 % 2;
                if (!(!coordinatorLayout.y(v, x, i51))) {
                    int i57 = a;
                    int i58 = (i57 & 101) + (i57 | 101);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    z = true;
                } else {
                    int i60 = a;
                    int i61 = i60 & 107;
                    int i62 = ((i60 ^ 107) | i61) << 1;
                    int i63 = -((i60 | 107) & (~i61));
                    int i64 = (i62 & i63) + (i63 | i62);
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    z = false;
                }
            } else {
                int i66 = a;
                int i67 = i66 & 107;
                int i68 = ((i66 ^ 107) | i67) << 1;
                int i69 = -((i66 | 107) & (~i67));
                int i610 = (i68 & i69) + (i69 | i68);
                b = i610 % 128;
                int i611 = i610 % 2;
                z = false;
            }
            this.i = z;
            if (z) {
                int i70 = b;
                int i71 = i70 & 11;
                int i72 = i71 + ((i70 ^ 11) | i71);
                a = i72 % 128;
                int i73 = i72 % 2;
                this.j = i51;
                this.h = motionEvent.getPointerId(0);
                int i74 = b;
                int i75 = i74 & 11;
                int i76 = -(-(i74 | 11));
                int i77 = (i75 & i76) + (i76 | i75);
                int i78 = i77 % 128;
                a = i78;
                int i79 = i77 % 2;
                if (this.e == null) {
                    int i80 = i78 + 113;
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    this.e = VelocityTracker.obtain();
                    int i82 = a + 81;
                    b = i82 % 128;
                    int i83 = i82 % 2;
                }
                OverScroller overScroller = this.g;
                if (overScroller != null) {
                    int i84 = a;
                    int i85 = ((i84 | 23) << 1) - (i84 ^ 23);
                    b = i85 % 128;
                    int i86 = i85 % 2;
                    if (!overScroller.isFinished()) {
                        int i87 = a;
                        int i88 = i87 & 11;
                        int i89 = i88 + ((i87 ^ 11) | i88);
                        b = i89 % 128;
                        int i90 = i89 % 2;
                        this.g.abortAnimation();
                        int i91 = a + 59;
                        b = i91 % 128;
                        int i92 = i91 % 2;
                        return true;
                    }
                }
            }
        }
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            int i93 = b;
            int i94 = ((i93 ^ 34) + ((i93 & 34) << 1)) - 1;
            a = i94 % 128;
            if (i94 % 2 != 0) {
                velocityTracker.addMovement(motionEvent);
                throw null;
            }
            velocityTracker.addMovement(motionEvent);
            int i95 = a + 43;
            b = i95 % 128;
            int i96 = i95 % 2;
        }
        int i97 = b;
        int i98 = i97 ^ 89;
        int i99 = (i97 & 89) << 1;
        int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
        a = i100 % 128;
        if (i100 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0261  */
    /* JADX WARN: Code duplicated, block: B:57:0x027c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0282  */
    /* JADX WARN: Code duplicated, block: B:60:0x0288  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x030d  */
    /* JADX WARN: Code duplicated, block: B:73:0x032d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0345  */
    /* JADX WARN: Code duplicated, block: B:76:0x035b  */
    /* JADX WARN: Code duplicated, block: B:78:0x036f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0372  */
    /* JADX WARN: Code duplicated, block: B:82:0x0382 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0383  */
    public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        bIP bip;
        int i;
        boolean z;
        VelocityTracker velocityTracker;
        int i2;
        VelocityTracker velocityTracker2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a + 99;
        b = i8 % 128;
        int i9 = i8 % 2;
        int actionMasked = motionEvent.getActionMasked();
        Object obj = null;
        boolean z2 = false;
        if (actionMasked != 1) {
            int i10 = a;
            int i11 = (((i10 | 109) << 1) - (~(-(i10 ^ 109)))) - 1;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            if (actionMasked != 2) {
                int i14 = i12 ^ 17;
                int i15 = -(-((i12 & 17) << 1));
                int i16 = (i14 & i15) + (i14 | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                if (actionMasked != 3) {
                    int i18 = ((i12 & 79) - (~(-(-(i12 | 79))))) - 1;
                    a = i18 % 128;
                    if (i18 % 2 == 0 ? actionMasked == 6 : actionMasked == 55) {
                        if (motionEvent.getActionIndex() == 0) {
                            int i19 = b;
                            int i20 = ((i19 | 111) << 1) - (i19 ^ 111);
                            int i21 = i20 % 128;
                            a = i21;
                            int i22 = i20 % 2;
                            int i23 = i21 & 63;
                            int i24 = (i21 | 63) & (~i23);
                            int i25 = -(-(i23 << 1));
                            int i26 = (i24 & i25) + (i24 | i25);
                            b = i26 % 128;
                            int i27 = i26 % 2;
                            i6 = 1;
                        } else {
                            int i28 = a;
                            int i29 = i28 ^ 37;
                            int i30 = -(-((i28 & 37) << 1));
                            int i31 = (i29 & i30) + (i30 | i29);
                            b = i31 % 128;
                            int i32 = i31 % 2;
                            i6 = 0;
                        }
                        this.h = motionEvent.getPointerId(i6);
                        int i33 = b;
                        int i34 = ((i33 | 93) << 1) - (i33 ^ 93);
                        a = i34 % 128;
                        int i35 = i34 % 2;
                        this.j = (int) (motionEvent.getY(i6) + 0.5f);
                        int i36 = a;
                        int i37 = i36 ^ 75;
                        int i38 = -(-((i36 & 75) << 1));
                        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                    }
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                if (iFindPointerIndex == -1) {
                    int i41 = b;
                    int i42 = (i41 & 57) + (i41 | 57);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = (i41 & 9) + (i41 | 9);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i46 = this.j;
                int i47 = b;
                int i48 = (((i47 | 119) << 1) - (~(-((i47 & (-120)) | ((~i47) & 119))))) - 1;
                a = i48 % 128;
                int i49 = i48 % 2;
                this.j = y;
                int i50 = -(~(-y));
                int i51 = (((i46 | i50) << 1) - (i50 ^ i46)) - 1;
                int i52 = i47 & 87;
                int i53 = -(-(i47 | 87));
                int i54 = (i52 & i53) + (i52 | i53);
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    C(coordinatorLayout, v, i51, z(v), 0);
                } else {
                    C(coordinatorLayout, v, i51, z(v), 0);
                }
                int i55 = a;
                int i56 = i55 & 7;
                int i57 = (i55 ^ 7) | i56;
                int i58 = (i56 & i57) + (i57 | i56);
                b = i58 % 128;
                int i59 = i58 % 2;
            }
            int i60 = a;
            int i61 = (i60 & 99) + (i60 | 99);
            b = i61 % 128;
            int i62 = i61 % 2;
            z = false;
            velocityTracker2 = this.e;
            if (velocityTracker2 != null) {
                int i63 = a;
                int i64 = (i63 & 71) + (i63 | 71);
                b = i64 % 128;
                int i65 = i64 % 2;
                velocityTracker2.addMovement(motionEvent);
                int i66 = b;
                int i67 = i66 & 11;
                int i68 = i67 + ((i66 ^ 11) | i67);
                a = i68 % 128;
                int i69 = i68 % 2;
            }
            if (this.i) {
                z2 = true;
            } else {
                i4 = a;
                int i70 = i4 & 83;
                int i71 = (~i70) & (i4 | 83);
                int i72 = -(-(i70 << 1));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                b = i73 % 128;
                int i74 = i73 % 2;
                if (!(!z)) {
                    int i75 = i4 & 31;
                    int i76 = i75 + ((i4 ^ 31) | i75);
                    b = i76 % 128;
                    int i77 = i76 % 2;
                    int i78 = (i4 & 83) + (i4 | 83);
                    b = i78 % 128;
                    int i79 = i78 % 2;
                    z2 = true;
                } else {
                    int i80 = (i4 | 45) << 1;
                    int i81 = -(((~i4) & 45) | (i4 & (-46)));
                    i5 = (i80 & i81) + (i80 | i81);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i82 = 5 / 5;
                    }
                }
            }
            int i83 = b;
            i3 = (i83 ^ 9) + ((i83 & 9) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return z2;
            }
            throw null;
        }
        VelocityTracker velocityTracker3 = this.e;
        if (velocityTracker3 != null) {
            int i84 = b;
            int i85 = (i84 & 49) + (i84 | 49);
            a = i85 % 128;
            int i86 = i85 % 2;
            velocityTracker3.addMovement(motionEvent);
            this.e.computeCurrentVelocity(1000);
            int i87 = b;
            int i88 = ((i87 ^ 58) + ((i87 & 58) << 1)) - 1;
            a = i88 % 128;
            int i89 = i88 % 2;
            float yVelocity = this.e.getYVelocity(this.h);
            int iX = x(v);
            int i90 = b;
            int i91 = ((i90 | 1) << 1) - (i90 ^ 1);
            a = i91 % 128;
            if (i91 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i92 = -iX;
            Runnable runnable = this.f;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.f = null;
                int i93 = b;
                int i94 = (i93 ^ 11) + ((i93 & 11) << 1);
                a = i94 % 128;
                int i95 = i94 % 2;
            }
            if (this.g == null) {
                OverScroller overScroller = new OverScroller(v.getContext());
                int i96 = a;
                int i97 = i96 & 81;
                int i98 = (i97 - (~((i96 ^ 81) | i97))) - 1;
                int i99 = i98 % 128;
                b = i99;
                if (i98 % 2 == 0) {
                    this.g = overScroller;
                    throw null;
                }
                this.g = overScroller;
                int i100 = ((i99 ^ 45) | (i99 & 45)) << 1;
                int i101 = -(((~i99) & 45) | (i99 & (-46)));
                int i102 = (i100 & i101) + (i100 | i101);
                a = i102 % 128;
                int i103 = i102 % 2;
            }
            OverScroller overScroller2 = this.g;
            int iU = u();
            int i104 = b;
            int i105 = i104 & 19;
            int i106 = (i105 - (~(-(-((i104 ^ 19) | i105))))) - 1;
            a = i106 % 128;
            int i107 = i106 % 2;
            int iRound = Math.round(yVelocity);
            int i108 = b + 22;
            int i109 = (i108 ^ (-1)) + (i108 << 1);
            a = i109 % 128;
            if (i109 % 2 != 0) {
                overScroller2.fling(0, iU, 0, iRound, 0, 1, i92, 1);
            } else {
                overScroller2.fling(0, iU, 0, iRound, 0, 0, i92, 0);
            }
            int i110 = b;
            int i111 = i110 & 19;
            int i112 = (i110 | 19) & (~i111);
            int i113 = -(-(i111 << 1));
            int i114 = (i112 & i113) + (i112 | i113);
            a = i114 % 128;
            if (i114 % 2 != 0) {
                int i115 = 23 / 0;
                if (this.g.computeScrollOffset()) {
                    bip = new bIP(coordinatorLayout, v);
                    this.f = bip;
                    int i116 = a;
                    int i117 = i116 & 113;
                    int i118 = i116 | 113;
                    i = ((i117 | i118) << 1) - (i118 ^ i117);
                    b = i % 128;
                    if (i % 2 != 0) {
                        WeakHashMap<View, R> weakHashMap = T.c;
                        T.aWX.o(v, bip);
                        throw null;
                    }
                    WeakHashMap<View, R> weakHashMap2 = T.c;
                    T.aWX.o(v, bip);
                } else {
                    A(coordinatorLayout, v);
                    int i119 = a;
                    int i120 = i119 & 117;
                    int i121 = (((i119 ^ 117) | i120) << 1) - ((i119 | 117) & (~i120));
                    b = i121 % 128;
                    int i122 = i121 % 2;
                }
            } else if (this.g.computeScrollOffset()) {
                bip = new bIP(coordinatorLayout, v);
                this.f = bip;
                int i1110 = a;
                int i1111 = i1110 & 113;
                int i1112 = i1110 | 113;
                i = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                b = i % 128;
                if (i % 2 != 0) {
                    WeakHashMap<View, R> weakHashMap3 = T.c;
                    T.aWX.o(v, bip);
                    throw null;
                }
                WeakHashMap<View, R> weakHashMap4 = T.c;
                T.aWX.o(v, bip);
            } else {
                A(coordinatorLayout, v);
                int i1113 = a;
                int i123 = i1113 & 117;
                int i124 = (((i1113 ^ 117) | i123) << 1) - ((i1113 | 117) & (~i123));
                b = i124 % 128;
                int i125 = i124 % 2;
            }
            int i126 = b;
            int i127 = i126 & 71;
            int i128 = (i126 | 71) & (~i127);
            int i129 = -(-(i127 << 1));
            int i130 = (i128 ^ i129) + ((i128 & i129) << 1);
            a = i130 % 128;
            int i131 = i130 % 2;
            z = true;
        }
        this.i = false;
        this.h = -1;
        velocityTracker = this.e;
        int i132 = b + 87;
        i2 = i132 % 128;
        a = i2;
        int i133 = i132 % 2;
        if (velocityTracker != null) {
            int i134 = ((i2 | 64) << 1) - (i2 ^ 64);
            int i135 = (i134 ^ (-1)) + (i134 << 1);
            b = i135 % 128;
            int i136 = i135 % 2;
            velocityTracker.recycle();
            this.e = null;
            int i137 = b;
            int i138 = i137 & 7;
            int i139 = (i138 - (~((i137 ^ 7) | i138))) - 1;
            a = i139 % 128;
            int i140 = i139 % 2;
            int i141 = i137 & 87;
            int i142 = (i137 | 87) & (~i141);
            int i143 = i141 << 1;
            int i144 = ((i142 | i143) << 1) - (i142 ^ i143);
            a = i144 % 128;
            int i145 = i144 % 2;
        }
        velocityTracker2 = this.e;
        if (velocityTracker2 != null) {
            int i610 = a;
            int i611 = (i610 & 71) + (i610 | 71);
            b = i611 % 128;
            int i612 = i611 % 2;
            velocityTracker2.addMovement(motionEvent);
            int i613 = b;
            int i614 = i613 & 11;
            int i615 = i614 + ((i613 ^ 11) | i614);
            a = i615 % 128;
            int i616 = i615 % 2;
        }
        if (this.i) {
            i4 = a;
            int i710 = i4 & 83;
            int i711 = (~i710) & (i4 | 83);
            int i712 = -(-(i710 << 1));
            int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
            b = i713 % 128;
            int i714 = i713 % 2;
            if (!(!z)) {
                int i715 = i4 & 31;
                int i716 = i715 + ((i4 ^ 31) | i715);
                b = i716 % 128;
                int i717 = i716 % 2;
                int i718 = (i4 & 83) + (i4 | 83);
                b = i718 % 128;
                int i719 = i718 % 2;
                z2 = true;
            } else {
                int i810 = (i4 | 45) << 1;
                int i811 = -(((~i4) & 45) | (i4 & (-46)));
                i5 = (i810 & i811) + (i810 | i811);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i812 = 5 / 5;
                }
            }
        } else {
            z2 = true;
        }
        int i813 = b;
        i3 = (i813 ^ 9) + ((i813 & 9) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
        int i146 = b + 39;
        a = i146 % 128;
        int i147 = i146 % 2;
        z = false;
        this.i = false;
        this.h = -1;
        velocityTracker = this.e;
        int i1310 = b + 87;
        i2 = i1310 % 128;
        a = i2;
        int i1311 = i1310 % 2;
        if (velocityTracker != null) {
            int i1312 = ((i2 | 64) << 1) - (i2 ^ 64);
            int i1313 = (i1312 ^ (-1)) + (i1312 << 1);
            b = i1313 % 128;
            int i1314 = i1313 % 2;
            velocityTracker.recycle();
            this.e = null;
            int i1315 = b;
            int i1316 = i1315 & 7;
            int i1317 = (i1316 - (~((i1315 ^ 7) | i1316))) - 1;
            a = i1317 % 128;
            int i148 = i1317 % 2;
            int i149 = i1315 & 87;
            int i1410 = (i1315 | 87) & (~i149);
            int i1411 = i149 << 1;
            int i1412 = ((i1410 | i1411) << 1) - (i1410 ^ i1411);
            a = i1412 % 128;
            int i1413 = i1412 % 2;
        }
        velocityTracker2 = this.e;
        if (velocityTracker2 != null) {
            int i617 = a;
            int i618 = (i617 & 71) + (i617 | 71);
            b = i618 % 128;
            int i619 = i618 % 2;
            velocityTracker2.addMovement(motionEvent);
            int i6110 = b;
            int i6111 = i6110 & 11;
            int i6112 = i6111 + ((i6110 ^ 11) | i6111);
            a = i6112 % 128;
            int i6113 = i6112 % 2;
        }
        if (this.i) {
            i4 = a;
            int i7110 = i4 & 83;
            int i7111 = (~i7110) & (i4 | 83);
            int i7112 = -(-(i7110 << 1));
            int i7113 = ((i7111 | i7112) << 1) - (i7112 ^ i7111);
            b = i7113 % 128;
            int i7114 = i7113 % 2;
            if (!(!z)) {
                int i7115 = i4 & 31;
                int i7116 = i7115 + ((i4 ^ 31) | i7115);
                b = i7116 % 128;
                int i7117 = i7116 % 2;
                int i7118 = (i4 & 83) + (i4 | 83);
                b = i7118 % 128;
                int i7119 = i7118 % 2;
                z2 = true;
            } else {
                int i814 = (i4 | 45) << 1;
                int i815 = -(((~i4) & 45) | (i4 & (-46)));
                i5 = (i814 & i815) + (i814 | i815);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i816 = 5 / 5;
                }
            }
        } else {
            z2 = true;
        }
        int i817 = b;
        i3 = (i817 ^ 9) + ((i817 & 9) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }
}
