package ivas.gov.bisp.enumeration.N;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import ivas.gov.bisp.enumeration.M.D;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.OooOOoo.OooOo00;
import ivas.gov.bisp.enumeration.OoooO0O.o0000O0O;
import ivas.gov.bisp.enumeration.p001aa.u;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends C0283j {
    private static int a = 1;
    private static int b;
    public static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final o0000O0O.OooO00o<al> g = new aYi();
    public static final o0000O0O.OooO0O0<OooOo00<al>, al> h;
    public final View i;
    public final AccessibilityManager n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public aYl f45o;
    public final Rect j = new Rect();
    public final Rect l = new Rect();
    public final Rect k = new Rect();
    public final int[] m = new int[2];
    public int p = Integer.MIN_VALUE;
    public int q = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;

    public class aYi implements o0000O0O.OooO00o<al> {
        private static int a = 0;
        private static int b = 1;

        public void c(Object obj, Rect rect) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                ((al) obj).d.getBoundsInParent(rect);
                int i4 = 12 / 0;
            } else {
                ((al) obj).d.getBoundsInParent(rect);
            }
            int i5 = b + 81;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public class aYk implements o0000O0O.OooO0O0<OooOo00<al>, al> {
    }

    public class aYl extends D {
        private static int a = 1;
        private static int b;

        public aYl() {
        }

        /* JADX WARN: Code duplicated, block: B:42:0x015b  */
        @Override // ivas.gov.bisp.enumeration.M.D
        public boolean f(int i, int i2, Bundle bundle) {
            boolean zK;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 ^ 100) + ((i4 & 100) << 1);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            int i7 = i6 % 128;
            a = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            q qVar = q.this;
            if (i == -1) {
                View view = qVar.i;
                WeakHashMap<View, R> weakHashMap = T.c;
                int i8 = b;
                int i9 = (i8 & 65) + (i8 | 65);
                a = i9 % 128;
                int i10 = i9 % 2;
                zK = T.aWX.k(view, i2, bundle);
                int i11 = a + 23;
                b = i11 % 128;
                int i12 = i11 % 2;
            } else if (i2 != 1) {
                int i13 = (((i7 & (-126)) | ((~i7) & 125)) - (~((i7 & 125) << 1))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                if (i2 != 2) {
                    int i15 = (i7 & 23) + (i7 | 23);
                    b = i15 % 128;
                    if (i15 % 2 == 0 ? i2 != 64 : i2 != 36) {
                        int i16 = i7 & 117;
                        int i17 = ((i7 ^ 117) | i16) << 1;
                        int i18 = -((i7 | 117) & (~i16));
                        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                        b = i19 % 128;
                        if (i19 % 2 == 0 ? i2 == 128 : i2 == 21864) {
                            zK = qVar.m(i);
                            int i20 = b;
                            int i21 = ((i20 ^ 43) | (i20 & 43)) << 1;
                            int i22 = -(((~i20) & 43) | (i20 & (-44)));
                            int i23 = (i21 & i22) + (i22 | i21);
                            a = i23 % 128;
                            int i24 = i23 % 2;
                        } else {
                            zK = qVar.s(i, i2, bundle);
                            int i25 = b;
                            int i26 = i25 & 75;
                            int i27 = (i26 - (~(-(-((i25 ^ 75) | i26))))) - 1;
                            a = i27 % 128;
                            int i28 = i27 % 2;
                        }
                    } else if (!(!qVar.n.isEnabled())) {
                        int i29 = b;
                        int i30 = i29 & 61;
                        int i31 = (i29 | 61) & (~i30);
                        int i32 = i30 << 1;
                        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        if (!(!qVar.n.isTouchExplorationEnabled())) {
                            int i35 = b;
                            int i36 = i35 ^ 105;
                            int i37 = (i35 & 105) << 1;
                            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                            a = i38 % 128;
                            int i39 = i38 % 2;
                            int i40 = qVar.p;
                            if (i40 != i) {
                                int i41 = a;
                                int i42 = ((i41 | 95) << 1) - (i41 ^ 95);
                                b = i42 % 128;
                                if (i42 % 2 != 0) {
                                    throw null;
                                }
                                if (i40 != Integer.MIN_VALUE) {
                                    int i43 = i41 ^ 35;
                                    int i44 = ((i41 & 35) | i43) << 1;
                                    int i45 = -i43;
                                    int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                                    b = i46 % 128;
                                    int i47 = i46 % 2;
                                    qVar.m(i40);
                                    int i48 = b;
                                    int i49 = i48 & 115;
                                    int i50 = ((i48 ^ 115) | i49) << 1;
                                    int i51 = -((i48 | 115) & (~i49));
                                    int i52 = (i50 & i51) + (i51 | i50);
                                    a = i52 % 128;
                                    int i53 = i52 % 2;
                                }
                                qVar.p = i;
                                View view2 = qVar.i;
                                int i54 = b;
                                int i55 = (i54 ^ 120) + ((i54 & 120) << 1);
                                int i56 = (i55 ^ (-1)) + (i55 << 1);
                                a = i56 % 128;
                                if (i56 % 2 == 0) {
                                    view2.invalidate();
                                    qVar.v(i, 32768);
                                    throw null;
                                }
                                view2.invalidate();
                                qVar.v(i, 32768);
                                int i57 = a;
                                int i58 = i57 ^ 9;
                                int i59 = ((((i57 & 9) | i58) << 1) - (~(-i58))) - 1;
                                int i60 = i59 % 128;
                                b = i60;
                                int i61 = i59 % 2;
                                int i62 = i60 & 111;
                                int i63 = ((i60 | 111) & (~i62)) + (i62 << 1);
                                a = i63 % 128;
                                int i64 = i63 % 2;
                                zK = true;
                            } else {
                                int i65 = b;
                                int i66 = (-2) - (((i65 ^ 98) + ((i65 & 98) << 1)) ^ (-1));
                                a = i66 % 128;
                                int i67 = i66 % 2;
                                zK = false;
                            }
                        } else {
                            int i68 = b;
                            int i69 = (-2) - (((i68 ^ 98) + ((i68 & 98) << 1)) ^ (-1));
                            a = i69 % 128;
                            int i610 = i69 % 2;
                            zK = false;
                        }
                    } else {
                        int i611 = b;
                        int i612 = (-2) - (((i611 ^ 98) + ((i611 & 98) << 1)) ^ (-1));
                        a = i612 % 128;
                        int i613 = i612 % 2;
                        zK = false;
                    }
                } else {
                    zK = qVar.n(i);
                    int i70 = b;
                    int i71 = (-2) - (((i70 ^ 76) + ((i70 & 76) << 1)) ^ (-1));
                    a = i71 % 128;
                    int i72 = i71 % 2;
                }
            } else {
                zK = qVar.t(i);
                int i73 = a;
                int i74 = (i73 & 87) + (i73 | 87);
                b = i74 % 128;
                int i75 = i74 % 2;
            }
            int i76 = a;
            int i77 = i76 ^ 85;
            int i78 = -(-((i76 & 85) << 1));
            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
            b = i79 % 128;
            if (i79 % 2 == 0) {
                return zK;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.M.D
        public al d(int i) {
            int i2 = 2 % 2;
            int i3 = a + 105;
            b = i3 % 128;
            int i4 = i3 % 2;
            al alVar = new al(AccessibilityNodeInfo.obtain(q.this.r(i).d));
            int i5 = b;
            int i6 = ((i5 & (-112)) | ((~i5) & 111)) + ((i5 & 111) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return alVar;
        }

        @Override // ivas.gov.bisp.enumeration.M.D
        public al e(int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 | 108) << 1) - (i4 ^ 108);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            if (i == 2) {
                int i8 = i4 & 101;
                int i9 = (((i4 | 101) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = q.this.p;
                    obj.hashCode();
                    throw null;
                }
                i2 = q.this.p;
                int i11 = b;
                int i12 = i11 & 97;
                int i13 = i12 + ((i11 ^ 97) | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                i2 = q.this.q;
                int i15 = b + 53;
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            if (i2 != Integer.MIN_VALUE) {
                al alVar = new al(AccessibilityNodeInfo.obtain(q.this.r(i2).d));
                int i17 = a + 23;
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    return alVar;
                }
                obj.hashCode();
                throw null;
            }
            int i18 = b;
            int i19 = i18 & 87;
            int i20 = (~i19) & (i18 | 87);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((i18 & 50) + (i18 | 50)) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
    }

    static {
        aYk ayk = new aYk();
        int i = b;
        int i2 = i & 25;
        int i3 = (i ^ 25) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        h = ayk;
        int i7 = i5 + 69;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public q(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        Context context = view.getContext();
        int i = a;
        int i2 = i & 69;
        int i3 = i | 69;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
        int i6 = b;
        int i7 = (i6 & 35) + (i6 | 35);
        a = i7 % 128;
        int i8 = i7 % 2;
        view.setFocusable(true);
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aWX.e(view) == 0) {
            int i9 = b;
            int i10 = (i9 ^ 43) + ((i9 & 43) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                T.aWX.t(view, 0);
            } else {
                T.aWX.t(view, 1);
            }
            int i11 = 2 % 2;
        }
        int i12 = a + 99;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void g(View view, AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        int i4 = b + 7;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        v(r8, 65536);
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        v(r8, 65536);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r8 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = (-2) - (((r8 & 44) + (r8 | 44)) ^ (-1));
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if ((r8 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r8 = (r1 & (-56)) | ((~r1) & 55);
        r1 = (r1 & 55) << 1;
        r2 = ((r8 | r1) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.N.q.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r7.p == r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r7.p == r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r7.p = Integer.MIN_VALUE;
        r7.i.invalidate();
        r1 = ivas.gov.bisp.enumeration.N.q.a + 61;
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.N.q.b
            r2 = r1 | 62
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 ^ 62
            int r2 = r2 - r4
            int r2 = r2 - r3
            int r4 = r2 % 128
            ivas.gov.bisp.enumeration.N.q.a = r4
            int r2 = r2 % r0
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L1d
            int r2 = r7.p
            r6 = 6
            int r6 = r6 / r5
            if (r2 != r8) goto L53
            goto L21
        L1d:
            int r2 = r7.p
            if (r2 != r8) goto L53
        L21:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.p = r1
            android.view.View r1 = r7.i
            r1.invalidate()
            int r1 = ivas.gov.bisp.enumeration.N.q.a
            int r1 = r1 + 61
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.N.q.b = r2
            int r1 = r1 % r0
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 == 0) goto L3c
            r7.v(r8, r2)
            r3 = r5
            goto L3f
        L3c:
            r7.v(r8, r2)
        L3f:
            int r8 = ivas.gov.bisp.enumeration.N.q.a
            r1 = r8 & 44
            r8 = r8 | 44
            int r1 = r1 + r8
            r8 = r1 ^ (-1)
            int r8 = (-2) - r8
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.N.q.b = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L52
            return r3
        L52:
            throw r4
        L53:
            r8 = r1 & (-56)
            int r2 = ~r1
            r6 = 55
            r2 = r2 & r6
            r8 = r8 | r2
            r1 = r1 & r6
            int r1 = r1 << r3
            r2 = r8 | r1
            int r2 = r2 << r3
            r8 = r8 ^ r1
            int r2 = r2 - r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.N.q.a = r8
            int r2 = r2 % r0
            if (r2 == 0) goto L69
            return r5
        L69:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.q.m(int):boolean");
    }

    public abstract void q(List<Integer> list);

    public abstract boolean s(int i, int i2, Bundle bundle);

    public final boolean t(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 73;
        int i5 = ((i4 << 1) - (~(-((~(i3 & 73)) & i4)))) - 1;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.i.isFocused();
            obj.hashCode();
            throw null;
        }
        if (!this.i.isFocused() && !this.i.requestFocus()) {
            int i6 = a;
            int i7 = i6 & 71;
            int i8 = (i6 ^ 71) | i7;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            boolean z = i9 % 2 != 0;
            int i10 = ((i6 & 18) + (i6 | 18)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return z;
            }
            throw null;
        }
        int i11 = this.q;
        if (i11 == i) {
            int i12 = a;
            int i13 = i12 & 115;
            int i14 = -(-(i12 | 115));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i12 | 65) << 1;
            int i18 = -(((~i12) & 65) | (i12 & (-66)));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (i11 != Integer.MIN_VALUE) {
            int i20 = a + 9;
            b = i20 % 128;
            int i21 = i20 % 2;
            n(i11);
            int i22 = b;
            int i23 = i22 ^ 69;
            int i24 = (((i22 & 69) | i23) << 1) - i23;
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        if (i == Integer.MIN_VALUE) {
            int i26 = b;
            int i27 = i26 ^ 83;
            int i28 = ((i26 & 83) | i27) << 1;
            int i29 = -i27;
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            boolean z2 = !(i30 % 2 != 0);
            int i31 = i26 & 77;
            int i32 = (i31 - (~((i26 ^ 77) | i31))) - 1;
            a = i32 % 128;
            if (i32 % 2 != 0) {
                return z2;
            }
            throw null;
        }
        this.q = i;
        Chip.OooO0O0 oooO0O0 = (Chip.OooO0O0) this;
        if (i == 1) {
            int i33 = a;
            int i34 = i33 & 43;
            int i35 = ((i33 ^ 43) | i34) << 1;
            int i36 = -((i33 | 43) & (~i34));
            int i37 = (i35 & i36) + (i36 | i35);
            b = i37 % 128;
            int i38 = i37 % 2;
            Chip chip = Chip.this;
            chip.f34o = true;
            int i39 = a;
            int i40 = (i39 ^ 19) + ((i39 & 19) << 1);
            b = i40 % 128;
            int i41 = i40 % 2;
            chip.refreshDrawableState();
            int i42 = b;
            int i43 = i42 & 39;
            int i44 = -(-((i42 ^ 39) | i43));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            a = i45 % 128;
            int i46 = i45 % 2;
        }
        v(i, 8);
        int i47 = b;
        int i48 = i47 & 117;
        int i49 = i48 + ((i47 ^ 117) | i48);
        a = i49 % 128;
        if (i49 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public abstract void u(int i, al alVar);

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public D f(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
            if (this.f45o == null) {
                this.f45o = new aYl();
                int i5 = b;
                int i6 = i5 | 59;
                int i7 = i6 << 1;
                int i8 = -((~(i5 & 59)) & i6);
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (this.f45o == null) {
            this.f45o = new aYl();
            int i11 = b;
            int i12 = i11 | 59;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 59)) & i12);
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        aYl ayl = this.f45o;
        int i17 = a;
        int i18 = ((i17 | 103) << 1) - (i17 ^ 103);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return ayl;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r8 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r7.q = Integer.MIN_VALUE;
        r4 = (com.google.android.material.chip.Chip.OooO0O0) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r1 = r1 + 63;
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
        r1 = r1 % 2;
        r1 = com.google.android.material.chip.Chip.this;
        r1.f34o = false;
        r1.refreshDrawableState();
        r1 = ivas.gov.bisp.enumeration.N.q.b;
        r4 = (r1 & (-54)) | ((~r1) & 53);
        r1 = -(-((r1 & 53) << 1));
        r5 = (r4 & r1) + (r1 | r4);
        ivas.gov.bisp.enumeration.N.q.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        v(r8, 8);
        r8 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = ((r8 | 115) << 1) - (r8 ^ 115);
        ivas.gov.bisp.enumeration.N.q.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r8 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r7.q != r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7.q != r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r8 = (r1 ^ 31) + ((r1 & 31) << 1);
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.N.q.b
            r2 = r1 & (-68)
            int r3 = ~r1
            r3 = r3 & 67
            r2 = r2 | r3
            r1 = r1 & 67
            r3 = 1
            int r1 = r1 << r3
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.N.q.a = r1
            int r4 = r4 % r0
            r2 = 0
            if (r4 != 0) goto L23
            int r4 = r7.q
            r5 = 63
            int r5 = r5 / r2
            if (r4 == r8) goto L37
            goto L27
        L23:
            int r4 = r7.q
            if (r4 == r8) goto L37
        L27:
            r8 = r1 ^ 31
            r1 = r1 & 31
            int r1 = r1 << r3
            int r8 = r8 + r1
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.N.q.b = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L35
            return r2
        L35:
            r8 = 0
            throw r8
        L37:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.q = r4
            r4 = r7
            com.google.android.material.chip.Chip$OooO0O0 r4 = (com.google.android.material.chip.Chip.OooO0O0) r4
            if (r8 != r3) goto L64
            int r1 = r1 + 63
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.N.q.b = r5
            int r1 = r1 % r0
            com.google.android.material.chip.Chip r1 = com.google.android.material.chip.Chip.this
            r1.f34o = r2
            r1.refreshDrawableState()
            int r1 = ivas.gov.bisp.enumeration.N.q.b
            r4 = r1 & (-54)
            int r5 = ~r1
            r6 = 53
            r5 = r5 & r6
            r4 = r4 | r5
            r1 = r1 & r6
            int r1 = r1 << r3
            int r1 = -r1
            int r1 = -r1
            r5 = r4 & r1
            r1 = r1 | r4
            int r5 = r5 + r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.N.q.a = r1
            int r5 = r5 % r0
        L64:
            r1 = 8
            r7.v(r8, r1)
            int r8 = ivas.gov.bisp.enumeration.N.q.b
            r1 = r8 | 115(0x73, float:1.61E-43)
            int r1 = r1 << r3
            r8 = r8 ^ 115(0x73, float:1.61E-43)
            int r1 = r1 - r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.N.q.a = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L7b
            r8 = 23
            int r8 = r8 / r2
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.q.n(int):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void h(View view, al alVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        b = i3 % 128;
        int i4 = i3 % 2;
        View.AccessibilityDelegate accessibilityDelegate = this.d;
        AccessibilityNodeInfo accessibilityNodeInfo = alVar.d;
        int i5 = a;
        int i6 = (((i5 & (-90)) | ((~i5) & 89)) - (~(-(-((i5 & 89) << 1))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip.OooO0O0 oooO0O0 = (Chip.OooO0O0) this;
        Chip chip = Chip.this;
        int i8 = a;
        int i9 = i8 & 55;
        int i10 = ((i8 ^ 55) | i9) << 1;
        int i11 = -((i8 | 55) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        alVar.d.setCheckable(chip.m());
        int i14 = a;
        int i15 = i14 & 19;
        int i16 = ((i14 ^ 19) | i15) << 1;
        int i17 = -((i14 | 19) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            alVar.d.setClickable(Chip.this.isClickable());
            int i19 = 57 / 0;
        } else {
            alVar.d.setClickable(Chip.this.isClickable());
        }
        CharSequence accessibilityClassName = Chip.this.getAccessibilityClassName();
        AccessibilityNodeInfo accessibilityNodeInfo2 = alVar.d;
        int i20 = b;
        int i21 = i20 & 81;
        int i22 = (i20 | 81) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        a = i24 % 128;
        Object obj = null;
        if (i24 % 2 == 0) {
            accessibilityNodeInfo2.setClassName(accessibilityClassName);
            Chip.this.getText();
            AccessibilityNodeInfo accessibilityNodeInfo3 = alVar.d;
            obj.hashCode();
            throw null;
        }
        accessibilityNodeInfo2.setClassName(accessibilityClassName);
        CharSequence text = Chip.this.getText();
        AccessibilityNodeInfo accessibilityNodeInfo4 = alVar.d;
        int i25 = a;
        int i26 = i25 | 61;
        int i27 = i26 << 1;
        int i28 = -((~(i25 & 61)) & i26);
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        b = i29 % 128;
        int i30 = i29 % 2;
        accessibilityNodeInfo4.setText(text);
        int i31 = b;
        int i32 = i31 & 103;
        int i33 = i32 + ((i31 ^ 103) | i32);
        a = i33 % 128;
        if (i33 % 2 == 0) {
            throw null;
        }
    }

    public al r(int i) {
        View view;
        Integer num;
        int i2 = 2 % 2;
        int i3 = a + 25;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (i != -1) {
            al alVarO = o(i);
            int i5 = a;
            int i6 = (i5 & 75) + (i5 | 75);
            b = i6 % 128;
            int i7 = i6 % 2;
            return alVarO;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.i);
        al alVar = new al(accessibilityNodeInfoObtain);
        int i8 = a;
        int i9 = i8 & 117;
        int i10 = (((i8 ^ 117) | i9) << 1) - ((i8 | 117) & (~i9));
        b = i10 % 128;
        int i11 = i10 % 2;
        View view2 = this.i;
        WeakHashMap<View, R> weakHashMap = T.c;
        view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        int i12 = b;
        int i13 = i12 & 77;
        int i14 = (i12 | 77) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        q(arrayList);
        Object obj = null;
        if (accessibilityNodeInfoObtain.getChildCount() > 0) {
            int i18 = b + 101;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                arrayList.size();
                obj.hashCode();
                throw null;
            }
            if (arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
        }
        int size = arrayList.size();
        int i19 = a;
        int i20 = ((i19 & 8) + (i19 | 8)) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        while (i22 < size) {
            int i23 = b;
            int i24 = i23 & 99;
            int i25 = (((i23 | 99) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            a = i25 % 128;
            if (i25 % 2 == 0) {
                view = this.i;
                num = (Integer) arrayList.get(i22);
                int i26 = 32 / 0;
            } else {
                view = this.i;
                num = (Integer) arrayList.get(i22);
            }
            int i27 = a;
            int i28 = (i27 & (-114)) | ((~i27) & 113);
            int i29 = (i27 & 113) << 1;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            b = i30 % 128;
            if (i30 % 2 != 0) {
                alVar.d.addChild(view, num.intValue());
                obj.hashCode();
                throw null;
            }
            alVar.d.addChild(view, num.intValue());
            int i31 = b;
            int i32 = i31 ^ 41;
            int i33 = -(-((i31 & 41) << 1));
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            a = i34 % 128;
            int i35 = i34 % 2;
            i22++;
            int i36 = (-2) - (((i31 ^ 118) + ((i31 & 118) << 1)) ^ (-1));
            a = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = a + 37;
        b = i38 % 128;
        int i39 = i38 % 2;
        return alVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r12 = ivas.gov.bisp.enumeration.N.q.b;
        r13 = ((r12 | 77) << 1) - (r12 ^ 77);
        ivas.gov.bisp.enumeration.N.q.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if ((r13 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r12 == (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r6 = (r4 ^ 65) + ((r4 & 65) << 1);
        ivas.gov.bisp.enumeration.N.q.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if ((r6 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r13 = android.view.accessibility.AccessibilityEvent.obtain(r13);
        r4 = r(r12);
        r6 = r13.getText();
        r7 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = r7 & 41;
        r8 = r8 + ((r7 ^ 41) | r8);
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if ((r8 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r6.add(r4.j());
        r6 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r6.add(r4.j());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        r13.setContentDescription(r4.i());
        r6 = r4.d.isScrollable();
        r7 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = (r7 & (-46)) | ((~r7) & 45);
        r7 = (r7 & 45) << 1;
        r9 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.N.q.b = r9 % 128;
        r9 = r9 % 2;
        r13.setScrollable(r6);
        r6 = r4.d.isPassword();
        r7 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = (r7 & (-84)) | ((~r7) & 83);
        r7 = (r7 & 83) << 1;
        r9 = ((r8 | r7) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.N.q.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if ((r9 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        r13.setPassword(r6);
        r6 = r4.d.isEnabled();
        r7 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        r13.setPassword(r6);
        r6 = r4.d.isEnabled();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        r13.setEnabled(r6);
        r6 = r4.d.isChecked();
        r7 = ivas.gov.bisp.enumeration.N.q.b + 103;
        ivas.gov.bisp.enumeration.N.q.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0104, code lost:
    
        if ((r7 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        r13.setChecked(r6);
        r7 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if ((!r13.getText().isEmpty()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r13.setChecked(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
    
        if (r13.getText().isEmpty() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0129, code lost:
    
        if (r13.getContentDescription() == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0134, code lost:
    
        r3 = r4.d.getClassName();
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r6 = ((r4 ^ 69) | (r4 & 69)) << 1;
        r4 = -(((~r4) & 69) | (r4 & (-70)));
        r7 = (r6 & r4) + (r4 | r6);
        ivas.gov.bisp.enumeration.N.q.a = r7 % 128;
        r7 = r7 % 2;
        r13.setClassName(r3);
        r3 = r11.i;
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r6 = (r4 | 23) << 1;
        r4 = -(((~r4) & 23) | (r4 & (-24)));
        r7 = (r6 & r4) + (r4 | r6);
        ivas.gov.bisp.enumeration.N.q.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016e, code lost:
    
        if ((r7 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0170, code lost:
    
        r13.setSource(r3, r12);
        r13.setPackageName(r11.i.getContext().getPackageName());
        r12 = ivas.gov.bisp.enumeration.N.q.b;
        r3 = r12 & 85;
        r3 = (r3 - (~(-(-((r12 ^ 85) | r3))))) - 1;
        ivas.gov.bisp.enumeration.N.q.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0193, code lost:
    
        r13.setSource(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0196, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0197, code lost:
    
        r13 = android.view.accessibility.AccessibilityEvent.obtain(r13);
        r(r12);
        r13.getText();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a5, code lost:
    
        r13 = android.view.accessibility.AccessibilityEvent.obtain(r13);
        r11.i.onInitializeAccessibilityEvent(r13);
        r12 = ivas.gov.bisp.enumeration.N.q.b;
        r3 = ((r12 | 11) << 1) - (r12 ^ 11);
        ivas.gov.bisp.enumeration.N.q.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bc, code lost:
    
        r12 = r1.requestSendAccessibilityEvent(r11.i, r13);
        r13 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = (r13 ^ 69) + ((r13 & 69) << 1);
        ivas.gov.bisp.enumeration.N.q.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cf, code lost:
    
        if ((r1 % 2) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d2, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d5, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.q.v(int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03bf, code lost:
    
        r15.recycle();
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r1 = ((r15 | 21) << 1) - (r15 ^ 21);
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03ce, code lost:
    
        r15 = r14.j;
        r1 = r14.m[0];
        r4 = r14.i.getScrollX();
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = ((r5 | 115) << 1) - (r5 ^ 115);
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03e7, code lost:
    
        if ((r8 % 2) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03e9, code lost:
    
        r5 = r14.m[1];
        r8 = r14.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ef, code lost:
    
        r8 = r8.getScrollY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03f4, code lost:
    
        r5 = r14.m[1];
        r8 = r14.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03fb, code lost:
    
        r9 = ivas.gov.bisp.enumeration.N.q.a;
        r12 = ((r9 ^ 54) + ((r9 & 54) << 1)) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0409, code lost:
    
        if ((r12 % 2) == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x040b, code lost:
    
        r4 = -r4;
        r9 = ((r1 | r4) << 1) - (r1 ^ r4);
        r5 = r5 / r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0413, code lost:
    
        r9 = (r1 - (~(-(~(-r4))))) - 2;
        r1 = -r8;
        r5 = (((r5 ^ r1) | (r5 & r1)) << 1) - ((r1 & (~r5)) | ((~r1) & r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0428, code lost:
    
        r15.offset(r9, r5);
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = ((r15 | 67) << 1) - (r15 ^ 67);
        ivas.gov.bisp.enumeration.N.q.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0440, code lost:
    
        if (r14.i.getLocalVisibleRect(r14.k) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0442, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r1 = (((r15 | 47) << 1) - (~(-((r15 & (-48)) | ((~r15) & 47))))) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
        r1 = r1 % 2;
        r1 = r14.k;
        r4 = r14.m[0];
        r5 = r14.i;
        r15 = r15 + 29;
        ivas.gov.bisp.enumeration.N.q.b = r15 % 128;
        r15 = r15 % 2;
        r15 = r5.getScrollX();
        r5 = r14.m[1];
        r8 = r14.i;
        r9 = ivas.gov.bisp.enumeration.N.q.b;
        r12 = (r9 | 71) << 1;
        r9 = -(r9 ^ 71);
        r13 = ((r12 | r9) << 1) - (r9 ^ r12);
        ivas.gov.bisp.enumeration.N.q.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0481, code lost:
    
        if ((r13 % 2) != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0483, code lost:
    
        r15 = -r15;
        r9 = r4 & r15;
        r15 = -(-(r15 | r4));
        r1.offset(((r9 | r15) << 1) - (r15 ^ r9), r5 % r8.getScrollY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0497, code lost:
    
        r8 = r8.getScrollY();
        r15 = -r15;
        r9 = (r4 | r15) << 1;
        r15 = -((r15 & (~r4)) | ((~r15) & r4));
        r4 = (r9 ^ r15) + ((r15 & r9) << 1);
        r15 = -(~(-r8));
        r1.offset(r4, (-2) - ((((r5 | r15) << 1) - (r15 ^ r5)) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04b9, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r1 = r15 & 61;
        r1 = r1 + ((r15 ^ 61) | r1);
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04c6, code lost:
    
        if ((r1 % 2) != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04d0, code lost:
    
        if (r14.j.intersect(r14.k) == true) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04d4, code lost:
    
        r2.d.setBoundsInScreen(r14.j);
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r4 = r15 & 107;
        r1 = ((r15 ^ 107) | r4) << 1;
        r15 = -((r15 | 107) & (~r4));
        r4 = (r1 & r15) + (r15 | r1);
        ivas.gov.bisp.enumeration.N.q.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04f1, code lost:
    
        if ((r4 % 2) != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04f3, code lost:
    
        r15 = r14.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04f5, code lost:
    
        if (r15 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04f8, code lost:
    
        r15 = r14.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04fa, code lost:
    
        if (r15 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0500, code lost:
    
        if (r15.isEmpty() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0502, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = (r15 ^ 46) + ((r15 & 46) << 1);
        r15 = (r1 ^ (-1)) + (r1 << 1);
        r1 = r15 % 128;
        ivas.gov.bisp.enumeration.N.q.a = r1;
        r15 = r15 % 2;
        r15 = (((r1 | 106) << 1) - (r1 ^ 106)) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0527, code lost:
    
        if (r14.i.getWindowVisibility() == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0529, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = r15 ^ 21;
        r15 = ((r15 & 21) | r1) << 1;
        r1 = -r1;
        r4 = (r15 & r1) + (r15 | r1);
        ivas.gov.bisp.enumeration.N.q.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x053c, code lost:
    
        r15 = r14.i.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0545, code lost:
    
        if ((!(r15 instanceof android.view.View)) == true) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0547, code lost:
    
        r1 = ivas.gov.bisp.enumeration.N.q.a;
        r4 = r1 & 89;
        r4 = r4 + ((r1 ^ 89) | r4);
        ivas.gov.bisp.enumeration.N.q.b = r4 % 128;
        r4 = r4 % 2;
        r15 = (android.view.View) r15;
        r1 = r15.getAlpha();
        r4 = ivas.gov.bisp.enumeration.N.q.a + 77;
        ivas.gov.bisp.enumeration.N.q.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0566, code lost:
    
        if (r1 <= 0.0f) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x056c, code lost:
    
        if (r15.getVisibility() == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x056e, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = (r15 & 71) + (r15 | 71);
        ivas.gov.bisp.enumeration.N.q.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x057b, code lost:
    
        r15 = r15.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0580, code lost:
    
        if (r15 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0582, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r1 = r15 & 29;
        r1 = r1 + ((r15 ^ 29) | r1);
        r15 = r1 % 128;
        ivas.gov.bisp.enumeration.N.q.b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x058f, code lost:
    
        if ((r1 % 2) == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0592, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0593, code lost:
    
        if (r11 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0595, code lost:
    
        r1 = ((r15 | 125) << 1) - (r15 ^ 125);
        ivas.gov.bisp.enumeration.N.q.a = r1 % 128;
        r1 = r1 % 2;
        r2.d.setVisibleToUser(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x05a6, code lost:
    
        r14.j.intersect(r14.k);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x05b0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x05b1, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r1 = (r15 ^ 37) + ((r15 & 37) << 1);
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05be, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05bf, code lost:
    
        r15.equals(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05c3, code lost:
    
        r14.i.getContext().getPackageName();
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05d7, code lost:
    
        throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (((r5 & r10) | (r10 ^ r5)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if ((r5 & 128) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        r5 = (-2) - ((((r8 | 110) << 1) - (r8 ^ 110)) ^ (-1));
        ivas.gov.bisp.enumeration.N.q.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if ((r5 % 2) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
    
        r1.setPackageName(r14.i.getContext().getPackageName());
        r5 = r14.i;
        r2.f = r15;
        r1.setSource(r5, r15);
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = r5 & 93;
        r10 = (r5 ^ 93) | r8;
        r11 = (r8 ^ r10) + ((r8 & r10) << 1);
        ivas.gov.bisp.enumeration.N.q.a = r11 % 128;
        r11 = r11 % 2;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        if (r14.p != r15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        r8 = (((r5 ^ 21) | (r5 & 21)) << 1) - (((~r5) & 21) | (r5 & (-22)));
        ivas.gov.bisp.enumeration.N.q.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if ((r8 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        r1.setAccessibilityFocused(true);
        r1.addAction(17238);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        r1.setAccessibilityFocused(true);
        r1.addAction(128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = ((r5 | 115) << 1) - (r5 ^ 115);
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        r1.setAccessibilityFocused(false);
        r1.addAction(64);
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = r5 & 43;
        r5 = r5 | 43;
        r9 = (r8 & r5) + (r5 | r8);
        ivas.gov.bisp.enumeration.N.q.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0138, code lost:
    
        if (r14.q != r15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013a, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.b + 125;
        ivas.gov.bisp.enumeration.N.q.a = r15 % 128;
        r15 = r15 % 2;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0145, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0148, code lost:
    
        if ((!r15) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014f, code lost:
    
        if ((!r1.isFocusable()) == true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0151, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = (r5 ^ 97) + ((r5 & 97) << 1);
        ivas.gov.bisp.enumeration.N.q.a = r8 % 128;
        r8 = r8 % 2;
        r1.addAction(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0162, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = ((((r5 ^ 73) | (r5 & 73)) << 1) - (~(-(((~r5) & 73) | (r5 & (-74)))))) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
        r8 = r8 % 2;
        r1.addAction(2);
        r5 = ivas.gov.bisp.enumeration.N.q.a + 125;
        ivas.gov.bisp.enumeration.N.q.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        r1.setFocused(r15);
        r14.i.getLocationOnScreen(r14.m);
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r5 = ((r15 ^ 16) + ((r15 & 16) << 1)) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r5 % 128;
        r5 = r5 % 2;
        r1.getBoundsInScreen(r14.j);
        r15 = r14.j;
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = ((r5 ^ 27) | (r5 & 27)) << 1;
        r5 = -(((~r5) & 27) | (r5 & (-28)));
        r9 = (r8 ^ r5) + ((r5 & r8) << 1);
        ivas.gov.bisp.enumeration.N.q.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01bd, code lost:
    
        if ((r9 % 2) == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c3, code lost:
    
        if (r15.equals(r4) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c5, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.a;
        r4 = (r15 & (-30)) | ((~r15) & 29);
        r15 = -(-((r15 & 29) << 1));
        r5 = ((r4 | r15) << 1) - (r15 ^ r4);
        ivas.gov.bisp.enumeration.N.q.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01dc, code lost:
    
        if ((r5 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01de, code lost:
    
        r1.getBoundsInParent(r14.j);
        r15 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e7, code lost:
    
        r1.getBoundsInParent(r14.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ee, code lost:
    
        if (r2.e == (-1)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f0, code lost:
    
        r15 = ivas.gov.bisp.enumeration.N.q.b;
        r1 = (r15 | 61) << 1;
        r15 = -(r15 ^ 61);
        r4 = (r1 & r15) + (r15 | r1);
        ivas.gov.bisp.enumeration.N.q.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0201, code lost:
    
        if ((r4 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0203, code lost:
    
        r15 = android.view.accessibility.AccessibilityNodeInfo.obtain();
        r1 = r2.e;
        r4 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x020d, code lost:
    
        r15 = android.view.accessibility.AccessibilityNodeInfo.obtain();
        r1 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0213, code lost:
    
        if (r1 == (-1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0215, code lost:
    
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r5 = r4 | 67;
        r8 = ((r5 << 1) - (~(-((~(r4 & 67)) & r5)))) - 1;
        ivas.gov.bisp.enumeration.N.q.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0228, code lost:
    
        if ((r8 % 2) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x022a, code lost:
    
        r15.setParent(r14.i, -1);
        r4 = ivas.gov.bisp.enumeration.N.q.f;
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = ((r5 ^ 72) + ((r5 & 72) << 1)) - 1;
        ivas.gov.bisp.enumeration.N.q.a = r8 % 128;
        r8 = r8 % 2;
        r15.setBoundsInParent(r4);
        r4 = (com.google.android.material.chip.Chip.OooO0O0) r14;
        r5 = ivas.gov.bisp.enumeration.N.q.b;
        r8 = r5 & 25;
        r5 = ((r5 | 25) & (~r8)) + (r8 << 1);
        r8 = r5 % 128;
        ivas.gov.bisp.enumeration.N.q.a = r8;
        r5 = r5 % 2;
        r5 = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0256, code lost:
    
        if (r1 != 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0258, code lost:
    
        r1 = ((r8 | 63) << 1) - (r8 ^ 63);
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0263, code lost:
    
        if ((r1 % 2) != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0265, code lost:
    
        r1 = com.google.android.material.chip.Chip.this.getCloseIconContentDescription();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026b, code lost:
    
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026d, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = r5 & 89;
        r5 = (((r5 | 89) & (~r8)) - (~(r8 << 1))) - 1;
        ivas.gov.bisp.enumeration.N.q.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027e, code lost:
    
        if ((r5 % 2) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0280, code lost:
    
        r15.setContentDescription(r1);
        r1 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0287, code lost:
    
        r15.setContentDescription(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028b, code lost:
    
        r1 = com.google.android.material.chip.Chip.this.getText();
        r8 = com.google.android.material.chip.Chip.this.getContext();
        r9 = new java.lang.Object[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a0, code lost:
    
        r5 = (-2) - ((ivas.gov.bisp.enumeration.N.q.b + 80) ^ (-1));
        ivas.gov.bisp.enumeration.N.q.a = r5 % 128;
        r5 = r5 % 2;
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02ad, code lost:
    
        r9[0] = r5;
        r1 = r8.getString(ivas.gov.bisp.enumeration.R.string.mtrl_chip_close_icon_content_description, r9);
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r9 = r5 & 77;
        r8 = ((r5 ^ 77) | r9) << 1;
        r5 = -((r5 | 77) & (~r9));
        r9 = (r8 ^ r5) + ((r5 & r8) << 1);
        ivas.gov.bisp.enumeration.N.q.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02cd, code lost:
    
        if ((r9 % 2) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02cf, code lost:
    
        r15.setContentDescription(r1.trim());
        r1 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02da, code lost:
    
        r15.setContentDescription(r1.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e1, code lost:
    
        r15.setBoundsInParent(com.google.android.material.chip.Chip.this.getCloseIconTouchBoundsInt());
        r1 = ivas.gov.bisp.enumeration.N.q.a + 45;
        ivas.gov.bisp.enumeration.N.q.b = r1 % 128;
        r1 = r1 % 2;
        r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ivas.gov.bisp.enumeration.M.al.aXC.e.k;
        r5 = ivas.gov.bisp.enumeration.N.q.a;
        r8 = (r5 & 59) + (r5 | 59);
        ivas.gov.bisp.enumeration.N.q.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0305, code lost:
    
        if ((r8 % 2) != 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0307, code lost:
    
        r15.addAction(r1);
        r1 = com.google.android.material.chip.Chip.this.isEnabled();
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r5 = ((r4 | 25) << 1) - (r4 ^ 25);
        ivas.gov.bisp.enumeration.N.q.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x031d, code lost:
    
        if ((r5 % 2) == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x031f, code lost:
    
        r15.setEnabled(r1);
        r1 = ivas.gov.bisp.enumeration.N.q.b;
        r4 = r1 ^ 49;
        r1 = (r1 & 49) << 1;
        r5 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.N.q.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0333, code lost:
    
        if ((r5 % 2) != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0335, code lost:
    
        r1 = 2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0338, code lost:
    
        r15.setEnabled(r1);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x033e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033f, code lost:
    
        r15.addAction(r1);
        com.google.android.material.chip.Chip.this.isEnabled();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0347, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0348, code lost:
    
        com.google.android.material.chip.Chip.this.getCloseIconContentDescription();
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0350, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0351, code lost:
    
        r15.setContentDescription(net.sqlcipher.BuildConfig.FLAVOR);
        r1 = com.google.android.material.chip.Chip.b;
        r4 = ivas.gov.bisp.enumeration.N.q.b;
        r4 = (-2) - ((((r4 | 122) << 1) - (r4 ^ 122)) ^ (-1));
        ivas.gov.bisp.enumeration.N.q.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0367, code lost:
    
        if ((r4 % 2) != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0369, code lost:
    
        r15.setBoundsInParent(r1);
        r1 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0370, code lost:
    
        r15.setBoundsInParent(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0373, code lost:
    
        r15.getBoundsInParent(r14.l);
        r1 = ivas.gov.bisp.enumeration.N.q.b;
        r4 = ((r1 | 15) << 1) - (r1 ^ 15);
        ivas.gov.bisp.enumeration.N.q.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0385, code lost:
    
        if ((r4 % 2) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0387, code lost:
    
        r1 = r14.j;
        r4 = r14.l;
        r5 = r4.left;
        r4 = r4.top;
        r8 = ivas.gov.bisp.enumeration.N.q.b;
        r9 = ((r8 | 29) << 1) - (r8 ^ 29);
        ivas.gov.bisp.enumeration.N.q.a = r9 % 128;
        r9 = r9 % 2;
        r1.offset(r5, r4);
        r1 = ivas.gov.bisp.enumeration.N.q.a;
        r4 = r1 & 97;
        r1 = (r1 | 97) & (~r4);
        r4 = r4 << 1;
        r5 = (r1 ^ r4) + ((r1 & r4) << 1);
        ivas.gov.bisp.enumeration.N.q.b = r5 % 128;
        r5 = r5 % 2;
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03b5, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b9, code lost:
    
        r15.setParent(r14.i, -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.M.al o(int r15) {
        /*
            Method dump skipped, instruction units count: 1519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.q.o(int):ivas.gov.bisp.enumeration.M.al");
    }

    /* JADX WARN: Code duplicated, block: B:113:0x032f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0357  */
    /* JADX WARN: Code duplicated, block: B:128:0x0407  */
    /* JADX WARN: Code duplicated, block: B:138:0x044d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0458  */
    /* JADX WARN: Code duplicated, block: B:141:0x0464  */
    /* JADX WARN: Code duplicated, block: B:144:0x049d  */
    /* JADX WARN: Code duplicated, block: B:145:0x049f  */
    /* JADX WARN: Code duplicated, block: B:147:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x04be  */
    /* JADX WARN: Code duplicated, block: B:150:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:176:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:177:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x0606  */
    /* JADX WARN: Code duplicated, block: B:217:0x03bb A[SYNTHETIC] */
    public final boolean p(int i, Rect rect) {
        al alVar;
        View view;
        boolean z;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        int iLastIndexOf;
        Object obj;
        al alVar2;
        int i7;
        int size;
        int i8;
        al alVar3;
        int i9;
        int i10;
        int iH;
        int i11;
        int iE;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 2;
        int i18 = 2 % 2;
        ArrayList arrayList2 = new ArrayList();
        q(arrayList2);
        u uVar = new u();
        int i19 = a;
        int i20 = (i19 & 76) + (i19 | 76);
        int i21 = 1;
        int i22 = i20 - 1;
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        while (i24 < arrayList2.size()) {
            al alVarO = o(((Integer) arrayList2.get(i24)).intValue());
            int iIntValue = ((Integer) arrayList2.get(i24)).intValue();
            int i25 = a;
            int i26 = (i25 ^ 35) + ((i25 & 35) << 1);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                uVar.g(iIntValue, alVarO);
                int i27 = i24 & 98;
                int i28 = (i24 ^ 98) | i27;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                int i30 = i29 & (-21);
                int i31 = -(-((i29 ^ (-21)) | i30));
                i24 = ((i30 | i31) << 1) - (i30 ^ i31);
            } else {
                uVar.g(iIntValue, alVarO);
                i24 = (-2) - ((i24 + 2) ^ (-1));
            }
        }
        int i32 = this.q;
        Object obj2 = null;
        if (i32 == Integer.MIN_VALUE) {
            int i33 = a;
            int i34 = (((i33 ^ 25) | (i33 & 25)) << 1) - (((~i33) & 25) | (i33 & (-26)));
            b = i34 % 128;
            int i35 = i34 % 2;
            alVar = null;
        } else {
            alVar = (al) uVar.e(i32);
        }
        if (i != 1) {
            int i36 = a;
            int i37 = i36 & 61;
            int i38 = (i36 ^ 61) | i37;
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            b = i39 % 128;
            if (i39 % 2 == 0 ? i == 2 : i == 5) {
                view = this.i;
                WeakHashMap<View, R> weakHashMap = T.c;
                if (T.aWY.f(view) == 1) {
                    int i40 = b + 3;
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    z = true;
                } else {
                    z = false;
                }
                aYk ayk = h;
                o0000O0O.OooO00o<al> oooO00o = g;
                int i42 = b;
                int i43 = i42 & 99;
                int i44 = (i43 - (~((i42 ^ 99) | i43))) - 1;
                a = i44 % 128;
                int i45 = i44 % 2;
                Objects.requireNonNull(ayk);
                i2 = uVar.i();
                arrayList = new ArrayList(i2);
                int i46 = a;
                int i47 = i46 & 39;
                int i48 = (i46 ^ 39) | i47;
                i3 = ((i47 | i48) << 1) - (i48 ^ i47);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                while (i4 < i2) {
                    alVar3 = (al) uVar.e[i4];
                    int i49 = b;
                    int i50 = i49 & 99;
                    int i51 = -(-(i49 | 99));
                    i9 = (i50 ^ i51) + ((i51 & i50) << 1);
                    a = i9 % 128;
                    if (i9 % 2 == 0) {
                        arrayList.add(alVar3);
                        int i52 = i4 & 143;
                        int i53 = ((i4 | 143) & (~i52)) + (i52 << 1);
                        int i54 = i53 ^ (-35);
                        int i55 = -(-((i53 & (-35)) << 1));
                        i4 = (i54 & i55) + (i55 | i54);
                    } else {
                        arrayList.add(alVar3);
                        i4++;
                    }
                    int i56 = b;
                    int i57 = ((i56 ^ 88) + ((i56 & 88) << 1)) - 1;
                    a = i57 % 128;
                    int i58 = i57 % 2;
                }
                i5 = -1;
                Collections.sort(arrayList, new Z.aYm(z, oooO00o));
                int i59 = a;
                int i60 = i59 ^ 39;
                int i61 = ((i59 & 39) | i60) << 1;
                int i62 = -i60;
                i6 = (i61 ^ i62) + ((i62 & i61) << 1);
                b = i6 % 128;
                if (i6 % 2 != 0 ? i == 1 : i == 1) {
                    size = arrayList.size();
                    if (alVar != null) {
                        int i63 = a;
                        int i64 = ((i63 | 51) << 1) - (i63 ^ 51);
                        b = i64 % 128;
                        int i65 = i64 % 2;
                        size = arrayList.indexOf(alVar);
                    }
                    i8 = ((size << 1) - size) - 1;
                    if (i8 >= 0) {
                        obj = arrayList.get(i8);
                        int i66 = b;
                        int i67 = i66 & 37;
                        int i68 = -(-((i66 ^ 37) | i67));
                        int i69 = (i67 & i68) + (i68 | i67);
                        a = i69 % 128;
                        int i70 = i69 % 2;
                    } else {
                        obj = null;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    }
                    int i71 = (i59 ^ 47) + ((i59 & 47) << 1);
                    b = i71 % 128;
                    if (i71 % 2 != 0) {
                        arrayList.size();
                        throw null;
                    }
                    int size2 = arrayList.size();
                    if (alVar == null) {
                        int i72 = a;
                        int i73 = i72 & 21;
                        int i74 = i72 | 21;
                        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                        b = i75 % 128;
                        int i76 = i75 % 2;
                        iLastIndexOf = -1;
                    } else {
                        iLastIndexOf = arrayList.lastIndexOf(alVar);
                        int i77 = a;
                        int i78 = i77 & 57;
                        int i79 = ((i77 ^ 57) | i78) << 1;
                        int i80 = -((i77 | 57) & (~i78));
                        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                        b = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    int i83 = (iLastIndexOf & (-105)) | ((~iLastIndexOf) & 104);
                    int i84 = -(-((iLastIndexOf & 104) << 1));
                    int i85 = ((i83 & i84) + (i84 | i83)) - 103;
                    if (i85 < size2) {
                        int i86 = b;
                        int i87 = i86 & 91;
                        int i88 = ((((i86 ^ 91) | i87) << 1) - (~(-((i86 | 91) & (~i87))))) - 1;
                        a = i88 % 128;
                        int i89 = i88 % 2;
                        obj = arrayList.get(i85);
                        int i90 = b;
                        int i91 = ((i90 ^ 123) | (i90 & 123)) << 1;
                        int i92 = -(((~i90) & 123) | (i90 & (-124)));
                        int i93 = (i91 & i92) + (i92 | i91);
                        a = i93 % 128;
                        int i94 = i93 % 2;
                    } else {
                        obj = null;
                    }
                }
                alVar2 = (al) obj;
                int i95 = a;
                i7 = (((i95 & (-40)) | ((~i95) & 39)) - (~(-(-((i95 & 39) << 1))))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i96 = 4 % 5;
                }
            } else {
                if (i != 17) {
                    int i97 = i36 ^ 95;
                    int i98 = -(-((i36 & 95) << 1));
                    int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                    int i100 = i99 % 128;
                    b = i100;
                    int i101 = i99 % 2;
                    if (i != 33) {
                        int i102 = i100 + 99;
                        int i103 = i102 % 128;
                        a = i103;
                        if (i102 % 2 != 0 ? i != 66 : i != 127) {
                            int i104 = i103 & 27;
                            int i105 = (~i104) & (i103 | 27);
                            int i106 = i104 << 1;
                            int i107 = (i105 & i106) + (i106 | i105);
                            b = i107 % 128;
                            int i108 = i107 % 2;
                            if (i != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        }
                    }
                }
                Rect rect2 = new Rect();
                int i109 = this.q;
                int i110 = b;
                int i111 = i110 & 105;
                int i112 = i111 + ((i110 ^ 105) | i111);
                a = i112 % 128;
                if (i112 % 2 == 0) {
                    throw null;
                }
                if (i109 != Integer.MIN_VALUE) {
                    r(i109).d.getBoundsInParent(rect2);
                    int i113 = a;
                    int i114 = i113 ^ 3;
                    int i115 = ((((i113 & 3) | i114) << 1) - (~(-i114))) - 1;
                    b = i115 % 128;
                    int i116 = i115 % 2;
                } else if (rect != null) {
                    int i117 = ((i110 | 17) << 1) - (i110 ^ 17);
                    a = i117 % 128;
                    if (i117 % 2 == 0) {
                        rect2.set(rect);
                        obj2.hashCode();
                        throw null;
                    }
                    rect2.set(rect);
                } else {
                    View view2 = this.i;
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    int i118 = b;
                    int i119 = (i118 & 49) + (i118 | 49);
                    a = i119 % 128;
                    if (i119 % 2 != 0 ? i == 17 : i == 71) {
                        rect2.set(width, 0, width, height);
                    } else if (i != 33) {
                        int i120 = i118 + 61;
                        int i121 = i120 % 128;
                        a = i121;
                        if (i120 % 2 != 0 ? i == 66 : i == 30) {
                            rect2.set(-1, 0, -1, height);
                        } else {
                            if (i != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            int i122 = i121 + 50;
                            int i123 = (i122 ^ (-1)) + (i122 << 1);
                            b = i123 % 128;
                            if (i123 % 2 != 0) {
                                rect2.set(1, -1, width, -1);
                            } else {
                                rect2.set(0, -1, width, -1);
                            }
                            int i124 = b;
                            int i125 = (-2) - ((((i124 | 2) << 1) - (i124 ^ 2)) ^ (-1));
                            a = i125 % 128;
                            if (i125 % 2 == 0) {
                                int i126 = 4 / 4;
                            }
                        }
                    } else {
                        rect2.set(0, height, width, height);
                    }
                }
                aYk ayk2 = h;
                aYi ayi = g;
                Rect rect3 = new Rect(rect2);
                int i127 = a;
                int i128 = i127 & 5;
                int i129 = ((~i128) & (i127 | 5)) + (i128 << 1);
                int i130 = i129 % 128;
                b = i130;
                int i131 = i129 % 2;
                if (i != 17) {
                    int i132 = (i130 ^ 10) + ((i130 & 10) << 1);
                    int i133 = (i132 ^ (-1)) + (i132 << 1);
                    int i134 = i133 % 128;
                    a = i134;
                    if (i133 % 2 != 0 ? i == 33 : i == 61) {
                        int iHeight = rect2.height();
                        int i135 = ((iHeight ^ 1) | (iHeight & 1)) << 1;
                        int i136 = -(((~iHeight) & 1) | (iHeight & (-2)));
                        rect3.offset(0, ((i135 | i136) << 1) - (i136 ^ i135));
                        int i137 = a;
                        int i138 = i137 & 9;
                        int i139 = -(-(i137 | 9));
                        int i140 = (i138 & i139) + (i139 | i138);
                        b = i140 % 128;
                        int i141 = i140 % 2;
                    } else if (i != 66) {
                        int i142 = i134 + 53;
                        b = i142 % 128;
                        int i143 = i142 % 2;
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        int i144 = ((i134 ^ 95) - (~((i134 & 95) << 1))) - 1;
                        b = i144 % 128;
                        int i145 = i144 % 2;
                        int iHeight2 = rect2.height();
                        rect3.offset(0, -(((iHeight2 | 1) << 1) - (iHeight2 ^ 1)));
                        int i146 = a;
                        int i147 = ((i146 ^ 51) - (~((i146 & 51) << 1))) - 1;
                        b = i147 % 128;
                        int i148 = i147 % 2;
                    } else {
                        int iWidth = rect2.width();
                        int i149 = iWidth & 1;
                        int i150 = (iWidth | 1) & (~i149);
                        int i151 = i149 << 1;
                        rect3.offset(-(((i150 | i151) << 1) - (i150 ^ i151)), 0);
                    }
                } else {
                    int iWidth2 = rect2.width();
                    rect3.offset((-2) - (((iWidth2 ^ 2) + ((iWidth2 & 2) << 1)) ^ (-1)), 0);
                }
                Objects.requireNonNull(ayk2);
                int i152 = uVar.i();
                Rect rect4 = new Rect();
                alVar2 = null;
                int i153 = 0;
                while (i153 < i152) {
                    int i154 = b;
                    int i155 = i154 ^ 93;
                    int i156 = -(-((i154 & 93) << i21));
                    int i157 = (i155 & i156) + (i156 | i155);
                    a = i157 % 128;
                    int i158 = i157 % i17;
                    al alVar4 = (al) uVar.e[i153];
                    if (alVar4 != alVar) {
                        int i159 = a;
                        int i160 = (i159 ^ 59) + ((i159 & 59) << i21);
                        b = i160 % 128;
                        if (i160 % i17 != 0) {
                            ayi.c(alVar4, rect4);
                            throw null;
                        }
                        ayi.c(alVar4, rect4);
                        int i161 = a + 73;
                        b = i161 % 128;
                        int i162 = i161 % i17;
                        if (Z.d(rect2, rect4, i)) {
                            int i163 = b;
                            int i164 = i163 & 111;
                            int i165 = -(-((i163 ^ 111) | i164));
                            int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                            a = i166 % 128;
                            if (i166 % i17 == 0) {
                                Z.d(rect2, rect3, i);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            if (!Z.d(rect2, rect3, i) || Z.b(i, rect2, rect4, rect3)) {
                                i11 = i152;
                            } else {
                                int i167 = b;
                                int i168 = (i167 & 91) + (i167 | 91);
                                a = i168 % 128;
                                if (i168 % i17 == 0) {
                                    int i169 = 13 / 0;
                                    if (((Z.b(i, rect2, rect3, rect4) ? 1 : 0) ^ i21) != i21) {
                                        i11 = i152;
                                    } else {
                                        int i170 = a;
                                        int i171 = i170 & 13;
                                        int i172 = -(-(i170 | 13));
                                        int i173 = (i171 ^ i172) + ((i172 & i171) << i21);
                                        b = i173 % 128;
                                        int i174 = i173 % i17;
                                        iE = Z.e(i, rect2, rect4);
                                        int i175 = b;
                                        i12 = ((i175 | 73) << 1) - (i175 ^ 73);
                                        a = i12 % 128;
                                        if (i12 % i17 != 0) {
                                            Z.f(i, rect2, rect4);
                                            Z.e(i, rect2, rect3);
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        int iF = Z.f(i, rect2, rect4);
                                        int iE2 = Z.e(i, rect2, rect3);
                                        int iF2 = Z.f(i, rect2, rect3);
                                        int i176 = iF * iF;
                                        int i177 = b;
                                        int i178 = ((i177 & 56) + (i177 | 56)) - 1;
                                        i11 = i152;
                                        int i179 = i178 % 128;
                                        a = i179;
                                        int i180 = i178 % 2;
                                        int i181 = -(-(iE * 13 * iE));
                                        int i182 = i176 & i181;
                                        int i183 = ((i176 ^ i181) | i182) << 1;
                                        int i184 = -((i181 | i176) & (~i182));
                                        i13 = ((i183 | i184) << 1) - (i184 ^ i183);
                                        i14 = iF2 * iF2;
                                        int i185 = i179 & 93;
                                        int i186 = (i179 | 93) & (~i185);
                                        int i187 = i185 << 1;
                                        int i188 = (i186 & i187) + (i186 | i187);
                                        b = i188 % 128;
                                        int i189 = i188 % 2;
                                        i15 = -(-(iE2 * 13 * iE2));
                                        i16 = i14 & i15;
                                        if (i13 < (((i14 | i15) & (~i16)) - (~(i16 << 1))) - 1) {
                                        }
                                    }
                                    int i190 = b;
                                    int i191 = (i190 & (-96)) | ((~i190) & 95);
                                    int i192 = -(-((i190 & 95) << 1));
                                    int i193 = (i191 ^ i192) + ((i192 & i191) << 1);
                                    a = i193 % 128;
                                    int i194 = i193 % 2;
                                } else {
                                    if (Z.b(i, rect2, rect3, rect4)) {
                                        i11 = i152;
                                    } else {
                                        int i1710 = a;
                                        int i1711 = i1710 & 13;
                                        int i1712 = -(-(i1710 | 13));
                                        int i1713 = (i1711 ^ i1712) + ((i1712 & i1711) << i21);
                                        b = i1713 % 128;
                                        int i1714 = i1713 % i17;
                                        iE = Z.e(i, rect2, rect4);
                                        int i1715 = b;
                                        i12 = ((i1715 | 73) << 1) - (i1715 ^ 73);
                                        a = i12 % 128;
                                        if (i12 % i17 != 0) {
                                            Z.f(i, rect2, rect4);
                                            Z.e(i, rect2, rect3);
                                            Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        int iF3 = Z.f(i, rect2, rect4);
                                        int iE3 = Z.e(i, rect2, rect3);
                                        int iF4 = Z.f(i, rect2, rect3);
                                        int i1716 = iF3 * iF3;
                                        int i1717 = b;
                                        int i1718 = ((i1717 & 56) + (i1717 | 56)) - 1;
                                        i11 = i152;
                                        int i1719 = i1718 % 128;
                                        a = i1719;
                                        int i1810 = i1718 % 2;
                                        int i1811 = -(-(iE * 13 * iE));
                                        int i1812 = i1716 & i1811;
                                        int i1813 = ((i1716 ^ i1811) | i1812) << 1;
                                        int i1814 = -((i1811 | i1716) & (~i1812));
                                        i13 = ((i1813 | i1814) << 1) - (i1814 ^ i1813);
                                        i14 = iF4 * iF4;
                                        int i1815 = i1719 & 93;
                                        int i1816 = (i1719 | 93) & (~i1815);
                                        int i1817 = i1815 << 1;
                                        int i1818 = (i1816 & i1817) + (i1816 | i1817);
                                        b = i1818 % 128;
                                        int i1819 = i1818 % 2;
                                        i15 = -(-(iE3 * 13 * iE3));
                                        i16 = i14 & i15;
                                        if (i13 < (((i14 | i15) & (~i16)) - (~(i16 << 1))) - 1) {
                                        }
                                    }
                                    int i195 = b;
                                    int i196 = (i195 & (-96)) | ((~i195) & 95);
                                    int i197 = -(-((i195 & 95) << 1));
                                    int i198 = (i196 ^ i197) + ((i197 & i196) << 1);
                                    a = i198 % 128;
                                    int i199 = i198 % 2;
                                }
                            }
                            int i200 = b;
                            int i201 = ((i200 & (-80)) | ((~i200) & 79)) + ((i200 & 79) << 1);
                            int i202 = i201 % 128;
                            a = i202;
                            int i203 = i201 % 2;
                            int i204 = i202 & 97;
                            int i205 = ((((i202 ^ 97) | i204) << 1) - (~(-((i202 | 97) & (~i204))))) - 1;
                            b = i205 % 128;
                            if (i205 % 2 != 0) {
                                rect3.set(rect4);
                                int i206 = 79 / 0;
                            } else {
                                rect3.set(rect4);
                            }
                            alVar2 = alVar4;
                        } else {
                            i11 = i152;
                            int i1910 = b;
                            int i1911 = (i1910 & (-96)) | ((~i1910) & 95);
                            int i1912 = -(-((i1910 & 95) << 1));
                            int i1913 = (i1911 ^ i1912) + ((i1912 & i1911) << 1);
                            a = i1913 % 128;
                            int i1914 = i1913 % 2;
                        }
                        int i207 = i153 ^ (-108);
                        int i208 = (i153 & (-108)) << 1;
                        i153 = (((i207 | i208) << 1) - (i207 ^ i208)) + 109;
                        i152 = i11;
                        i17 = 2;
                        i21 = 1;
                    } else {
                        i11 = i152;
                        alVar2 = alVar2;
                    }
                    alVar2 = alVar2;
                    int i209 = i153 ^ (-108);
                    int i2010 = (i153 & (-108)) << 1;
                    i153 = (((i209 | i2010) << 1) - (i209 ^ i2010)) + 109;
                    i152 = i11;
                    i17 = 2;
                    i21 = 1;
                }
                i5 = -1;
            }
        } else {
            view = this.i;
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (T.aWY.f(view) == 1) {
                int i410 = b + 3;
                a = i410 % 128;
                int i411 = i410 % 2;
                z = true;
            } else {
                z = false;
            }
            aYk ayk3 = h;
            o0000O0O.OooO00o<al> oooO00o2 = g;
            int i412 = b;
            int i413 = i412 & 99;
            int i414 = (i413 - (~((i412 ^ 99) | i413))) - 1;
            a = i414 % 128;
            int i415 = i414 % 2;
            Objects.requireNonNull(ayk3);
            i2 = uVar.i();
            arrayList = new ArrayList(i2);
            int i416 = a;
            int i417 = i416 & 39;
            int i418 = (i416 ^ 39) | i417;
            i3 = ((i417 | i418) << 1) - (i418 ^ i417);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            while (i4 < i2) {
                alVar3 = (al) uVar.e[i4];
                int i419 = b;
                int i510 = i419 & 99;
                int i511 = -(-(i419 | 99));
                i9 = (i510 ^ i511) + ((i511 & i510) << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    arrayList.add(alVar3);
                    int i512 = i4 & 143;
                    int i513 = ((i4 | 143) & (~i512)) + (i512 << 1);
                    int i514 = i513 ^ (-35);
                    int i515 = -(-((i513 & (-35)) << 1));
                    i4 = (i514 & i515) + (i515 | i514);
                } else {
                    arrayList.add(alVar3);
                    i4++;
                }
                int i516 = b;
                int i517 = ((i516 ^ 88) + ((i516 & 88) << 1)) - 1;
                a = i517 % 128;
                int i518 = i517 % 2;
            }
            i5 = -1;
            Collections.sort(arrayList, new Z.aYm(z, oooO00o2));
            int i519 = a;
            int i610 = i519 ^ 39;
            int i611 = ((i519 & 39) | i610) << 1;
            int i612 = -i610;
            i6 = (i611 ^ i612) + ((i612 & i611) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                size = arrayList.size();
                if (alVar != null) {
                    int i613 = a;
                    int i614 = ((i613 | 51) << 1) - (i613 ^ 51);
                    b = i614 % 128;
                    int i615 = i614 % 2;
                    size = arrayList.indexOf(alVar);
                }
                i8 = ((size << 1) - size) - 1;
                if (i8 >= 0) {
                    obj = arrayList.get(i8);
                    int i616 = b;
                    int i617 = i616 & 37;
                    int i618 = -(-((i616 ^ 37) | i617));
                    int i619 = (i617 & i618) + (i618 | i617);
                    a = i619 % 128;
                    int i710 = i619 % 2;
                } else {
                    obj = null;
                }
                alVar2 = (al) obj;
                int i910 = a;
                i7 = (((i910 & (-40)) | ((~i910) & 39)) - (~(-(-((i910 & 39) << 1))))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i911 = 4 % 5;
                }
            } else {
                size = arrayList.size();
                if (alVar != null) {
                    int i6110 = a;
                    int i6111 = ((i6110 | 51) << 1) - (i6110 ^ 51);
                    b = i6111 % 128;
                    int i6112 = i6111 % 2;
                    size = arrayList.indexOf(alVar);
                }
                i8 = ((size << 1) - size) - 1;
                if (i8 >= 0) {
                    obj = arrayList.get(i8);
                    int i6113 = b;
                    int i6114 = i6113 & 37;
                    int i6115 = -(-((i6113 ^ 37) | i6114));
                    int i6116 = (i6114 & i6115) + (i6115 | i6114);
                    a = i6116 % 128;
                    int i711 = i6116 % 2;
                } else {
                    obj = null;
                }
                alVar2 = (al) obj;
                int i912 = a;
                i7 = (((i912 & (-40)) | ((~i912) & 39)) - (~(-(-((i912 & 39) << 1))))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i913 = 4 % 5;
                }
            }
        }
        if (alVar2 == null) {
            int i210 = b;
            int i211 = (i210 ^ 41) + ((i210 & 41) << 1);
            a = i211 % 128;
            if (i211 % 2 == 0) {
                int i212 = 11 / 0;
            }
            iH = Integer.MIN_VALUE;
        } else {
            int i213 = 0;
            while (true) {
                if (i213 >= uVar.f) {
                    i10 = i5;
                    break;
                }
                int i214 = a;
                int i215 = i214 ^ 73;
                int i216 = ((((i214 & 73) | i215) << 1) - (~(-i215))) - 1;
                b = i216 % 128;
                if (i216 % 2 != 0) {
                    Object obj6 = null;
                    Object obj7 = uVar.e[i213];
                    obj6.hashCode();
                    throw null;
                }
                if (uVar.e[i213] == alVar2) {
                    int i217 = b;
                    int i218 = (i217 & 119) + (i217 | 119);
                    a = i218 % 128;
                    if (i218 % 2 == 0) {
                        throw null;
                    }
                    i10 = i213;
                    break;
                }
                i213++;
            }
            iH = uVar.h(i10);
        }
        boolean zT = t(iH);
        int i219 = a + 71;
        b = i219 % 128;
        if (i219 % 2 == 0) {
            return zT;
        }
        throw null;
    }
}
