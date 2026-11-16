package ivas.gov.bisp.enumeration.p088k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import ivas.gov.bisp.enumeration.p081d.L;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ac implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static int a = 0;
    private static int b = 1;
    public static ac c;
    public static ac d;
    public ag e;
    public final View f;
    public final CharSequence g;
    public final int h;
    public int k;
    public int l;
    public boolean m;
    public final Runnable j = new aSn();
    public final Runnable i = new aSo();

    public class aSn implements Runnable {
        private static int a = 1;
        private static int b;

        public aSn() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 115;
            int i4 = ((i3 << 1) - (~(-((~(i2 & 115)) & i3)))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            ac.this.f(false);
            int i6 = a;
            int i7 = i6 & 119;
            int i8 = i7 + ((i6 ^ 119) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class aSo implements Runnable {
        private static int a = 1;
        private static int b;

        public aSo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 29;
            int i4 = -(-((i2 ^ 29) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            ac.this.e();
            if (i6 == 0) {
                int i7 = 36 / 0;
            }
            int i8 = a;
            int i9 = ((i8 & 118) + (i8 | 118)) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }
    }

    public ac(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f = view;
        this.g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = L.c;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
            int i = b;
            int i2 = i & 87;
            int i3 = (i | 87) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
            int i8 = a;
            int i9 = i8 & 43;
            int i10 = (((i8 ^ 43) | i9) << 1) - ((i8 | 43) & (~i9));
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        this.h = scaledTouchSlop;
        d();
        view.setOnLongClickListener(this);
        int i13 = b;
        int i14 = ((i13 ^ 79) | (i13 & 79)) << 1;
        int i15 = -(((~i13) & 79) | (i13 & (-80)));
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            view.setOnHoverListener(this);
            throw null;
        }
        view.setOnHoverListener(this);
        int i17 = a;
        int i18 = ((i17 | 125) << 1) - (((~i17) & 125) | (i17 & (-126)));
        b = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i3 - (~((i2 ^ 121) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.k = view.getWidth() / 2;
        int height = view.getHeight();
        int i6 = b;
        int i7 = i6 & 109;
        int i8 = (i7 - (~((i6 ^ 109) | i7))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        this.l = height / 2;
        f(true);
        int i10 = a + 89;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 9) + (i2 | 9);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = i3 + ((i2 ^ 111) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        e();
        int i6 = a + 19;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 73) << 1) - (~(-((i2 & (-74)) | ((~i2) & 73))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        int i5 = (i2 & 83) + (i2 | 83);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void c(ac acVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 113) + (i2 | 113);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ac acVar2 = c;
        if (acVar2 != null) {
            int i4 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                acVar2.f.removeCallbacks(acVar2.j);
                obj.hashCode();
                throw null;
            }
            acVar2.f.removeCallbacks(acVar2.j);
            int i5 = b;
            int i6 = ((((i5 ^ 69) | (i5 & 69)) << 1) - (~(-(((~i5) & 69) | (i5 & (-70)))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        c = acVar;
        if (acVar != null) {
            int i8 = a;
            int i9 = ((i8 | 113) << 1) - (i8 ^ 113);
            b = i9 % 128;
            int i10 = i9 % 2;
            acVar.f.postDelayed(acVar.j, ViewConfiguration.getLongPressTimeout());
            int i11 = b;
            int i12 = i11 + 33;
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 & 83;
            int i15 = ((i11 ^ 83) | i14) << 1;
            int i16 = -((i11 | 83) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = a;
        int i20 = i19 & 9;
        int i21 = -(-((i19 ^ 9) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = -(-((i5 ^ 119) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 != 0) {
            int i10 = 69 / 0;
            if (this.e != null) {
                int i11 = ((i9 ^ 31) | (i9 & 31)) << 1;
                int i12 = -(((~i9) & 31) | (i9 & (-32)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                i = i13 % 128;
                b = i;
                int i14 = i13 % 2;
                if (this.m) {
                    int i15 = (i & (-6)) | ((~i) & 5);
                    int i16 = (i & 5) << 1;
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    int i18 = i17 % 128;
                    a = i18;
                    int i19 = i17 % 2;
                    int i20 = ((i18 ^ 119) | (i18 & 119)) << 1;
                    int i21 = -(((~i18) & 119) | (i18 & (-120)));
                    i2 = (i20 ^ i21) + ((i21 & i20) << 1);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i22 = 80 / 0;
                    }
                    return false;
                }
            }
        } else if (this.e != null) {
            int i110 = ((i9 ^ 31) | (i9 & 31)) << 1;
            int i111 = -(((~i9) & 31) | (i9 & (-32)));
            int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
            i = i112 % 128;
            b = i;
            int i113 = i112 % 2;
            if (this.m) {
                int i114 = (i & (-6)) | ((~i) & 5);
                int i115 = (i & 5) << 1;
                int i116 = ((i114 | i115) << 1) - (i114 ^ i115);
                int i117 = i116 % 128;
                a = i117;
                int i118 = i116 % 2;
                int i23 = ((i117 ^ 119) | (i117 & 119)) << 1;
                int i24 = -(((~i117) & 119) | (i117 & (-120)));
                i2 = (i23 ^ i24) + ((i24 & i23) << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i25 = 80 / 0;
                }
                return false;
            }
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f.getContext().getSystemService("accessibility");
        int i26 = b;
        int i27 = (-2) - (((i26 & 20) + (i26 | 20)) ^ (-1));
        a = i27 % 128;
        Object obj = null;
        if (i27 % 2 != 0) {
            accessibilityManager.isEnabled();
            obj.hashCode();
            throw null;
        }
        if (!(!accessibilityManager.isEnabled())) {
            int i28 = a + 31;
            b = i28 % 128;
            if (i28 % 2 == 0) {
                accessibilityManager.isTouchExplorationEnabled();
                throw null;
            }
            if (accessibilityManager.isTouchExplorationEnabled()) {
                int i29 = a;
                int i30 = i29 ^ 67;
                int i31 = ((i29 & 67) | i30) << 1;
                int i32 = -i30;
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                int i34 = i33 % 128;
                b = i34;
                int i35 = i33 % 2;
                int i36 = i34 & 83;
                int i37 = (i34 | 83) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            int i41 = a + 118;
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            int i43 = i42 % 128;
            b = i43;
            int i44 = i42 % 2;
            if (action == 10) {
                int i45 = (i43 ^ 123) + ((i43 & 123) << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                d();
                e();
                int i47 = a;
                int i48 = i47 & 79;
                int i49 = (i47 ^ 79) | i48;
                int i50 = (i48 & i49) + (i49 | i48);
                b = i50 % 128;
                int i51 = i50 % 2;
            }
        } else if (this.f.isEnabled()) {
            int i52 = a;
            int i53 = (i52 ^ 104) + ((i52 & 104) << 1);
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            int i55 = i54 % 128;
            b = i55;
            int i56 = i54 % 2;
            if (this.e == null) {
                int i57 = (i55 ^ 15) + ((i55 & 15) << 1);
                a = i57 % 128;
                int i58 = i57 % 2;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i59 = a;
                int i60 = ((i59 | 5) << 1) - (5 ^ i59);
                b = i60 % 128;
                if (i60 % 2 == 0) {
                    int i61 = -this.k;
                    int i62 = x & i61;
                    if (Math.abs(((i61 | x) & (~i62)) + (i62 << 1)) <= this.h) {
                        int i63 = b;
                        i3 = ((i63 ^ 117) - (~(-(-((i63 & 117) << 1))))) - 1;
                        a = i3 % 128;
                        if (i3 % 2 != 0 ? Math.abs((y - (~(-this.l))) - 1) <= this.h : Math.abs(y >> this.l) <= this.h) {
                            int i64 = a;
                            int i65 = (i64 & 121) + (i64 | 121);
                            b = i65 % 128;
                            int i66 = i65 % 2;
                        }
                    }
                } else if (Math.abs((x - (~(-this.k))) - 1) <= this.h) {
                    int i67 = b;
                    i3 = ((i67 ^ 117) - (~(-(-((i67 & 117) << 1))))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                    }
                }
                this.k = x;
                this.l = y;
                int i68 = b;
                int i69 = (((i68 ^ 87) | (i68 & 87)) << 1) - (((~i68) & 87) | (i68 & (-88)));
                int i70 = i69 % 128;
                a = i70;
                int i71 = i69 % 2;
                int i72 = ((i70 ^ 83) | (i70 & 83)) << 1;
                int i73 = -(((~i70) & 83) | (i70 & (-84)));
                int i74 = (i72 & i73) + (i73 | i72);
                int i75 = i74 % 128;
                b = i75;
                int i76 = i74 % 2;
                int i77 = i75 & 123;
                int i78 = (((i75 | 123) & (~i77)) - (~(i77 << 1))) - 1;
                a = i78 % 128;
                int i79 = i78 % 2;
                c(this);
                int i80 = b + 37;
                a = i80 % 128;
                int i81 = i80 % 2;
            }
        }
        int i82 = b;
        int i83 = ((i82 & 94) + (i82 | 94)) - 1;
        a = i83 % 128;
        if (i83 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public void e() {
        int i = 2 % 2;
        int i2 = b + 17;
        int i3 = i2 % 128;
        a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (d == this) {
            d = null;
            ag agVar = this.e;
            if (agVar != null) {
                int i4 = (i3 & 93) + (i3 | 93);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    agVar.c();
                    this.e = null;
                    d();
                    obj.hashCode();
                    throw null;
                }
                agVar.c();
                this.e = null;
                d();
                int i5 = a;
                int i6 = i5 & 37;
                int i7 = (i5 ^ 37) | i6;
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    this.f.removeOnAttachStateChangeListener(this);
                    int i9 = 28 / 0;
                } else {
                    this.f.removeOnAttachStateChangeListener(this);
                }
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
                int i10 = a;
                int i11 = (i10 & (-66)) | ((~i10) & 65);
                int i12 = (i10 & 65) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 5 / 5;
                }
            }
        }
        if (c == this) {
            int i15 = b;
            int i16 = i15 & 13;
            int i17 = ((i15 | 13) & (~i16)) + (i16 << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            c(null);
            int i19 = b;
            int i20 = i19 & 31;
            int i21 = -(-((i19 ^ 31) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        this.f.removeCallbacks(this.i);
        int i24 = a;
        int i25 = ((i24 | 65) << 1) - (i24 ^ 65);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0502  */
    /* JADX WARN: Code duplicated, block: B:111:0x0513  */
    /* JADX WARN: Code duplicated, block: B:132:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0237  */
    /* JADX WARN: Code duplicated, block: B:58:0x023f  */
    /* JADX WARN: Code duplicated, block: B:62:0x026a A[EDGE_INSN: B:62:0x026a->B:68:0x02a0 BREAK  A[LOOP:0: B:56:0x023b->B:135:0x023b]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0275  */
    /* JADX WARN: Code duplicated, block: B:65:0x0283  */
    public void f(boolean z) {
        int height;
        int i;
        int i2;
        Context context;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c2;
        int dimensionPixelSize;
        int longPressTimeout;
        long j;
        long j2;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 113;
        int i11 = -(-((i9 ^ 113) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        View view = this.f;
        WeakHashMap<View, R> weakHashMap = T.c;
        if (!T.aXa.c(view)) {
            int i14 = a;
            int i15 = (i14 ^ 57) + ((i14 & 57) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        Object obj = null;
        c(null);
        ac acVar = d;
        if (acVar != null) {
            int i17 = b;
            int i18 = ((i17 & (-58)) | ((~i17) & 57)) + ((i17 & 57) << 1);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                acVar.e();
                int i19 = 57 / 0;
            } else {
                acVar.e();
            }
        }
        d = this;
        this.m = z;
        ag agVar = new ag(this.f.getContext());
        int i20 = (-2) - ((a + 62) ^ (-1));
        int i21 = i20 % 128;
        b = i21;
        int i22 = i20 % 2;
        this.e = agVar;
        View view2 = this.f;
        int width = this.k;
        int i23 = this.l;
        boolean z2 = this.m;
        int i24 = (i21 ^ 57) + ((i21 & 57) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        CharSequence charSequence = this.g;
        if (!(!(agVar.d.getParent() != null))) {
            int i26 = b;
            int i27 = (i26 & 61) + (i26 | 61);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                agVar.c();
                throw null;
            }
            agVar.c();
        }
        agVar.e.setText(charSequence);
        int i28 = b;
        int i29 = (i28 & (-68)) | ((~i28) & 67);
        int i30 = (i28 & 67) << 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        a = i31 % 128;
        int i32 = i31 % 2;
        WindowManager.LayoutParams layoutParams = agVar.f;
        layoutParams.token = view2.getApplicationWindowToken();
        int i33 = a;
        int i34 = ((i33 ^ 61) | (i33 & 61)) << 1;
        int i35 = -(((~i33) & 61) | (i33 & (-62)));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        b = i36 % 128;
        int i37 = i36 % 2;
        int dimensionPixelOffset = agVar.c.getResources().getDimensionPixelOffset(ivas.gov.bisp.enumeration.R.dimen.tooltip_precise_anchor_threshold);
        int i38 = a + 69;
        b = i38 % 128;
        if (i38 % 2 == 0) {
            view2.getWidth();
            throw null;
        }
        if (view2.getWidth() >= dimensionPixelOffset) {
            int i39 = b;
            int i40 = i39 & 9;
            int i41 = i40 + ((i39 ^ 9) | i40);
            a = i41 % 128;
            int i42 = i41 % 2;
            int i43 = ((i39 ^ 59) | (i39 & 59)) << 1;
            int i44 = -(((~i39) & 59) | (i39 & (-60)));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            a = i45 % 128;
            int i46 = i45 % 2;
        } else {
            width = view2.getWidth() / 2;
            int i47 = b;
            int i48 = i47 & 87;
            int i49 = (i48 - (~(-(-((i47 ^ 87) | i48))))) - 1;
            a = i49 % 128;
            int i50 = i49 % 2;
        }
        if (view2.getHeight() >= dimensionPixelOffset) {
            int i51 = a;
            int i52 = ((i51 | 5) << 1) - (i51 ^ 5);
            b = i52 % 128;
            int i53 = i52 % 2;
            int dimensionPixelOffset2 = agVar.c.getResources().getDimensionPixelOffset(ivas.gov.bisp.enumeration.R.dimen.tooltip_precise_anchor_extra_offset);
            int i54 = b;
            int i55 = i54 & 113;
            int i56 = (~i55) & (i54 | 113);
            int i57 = i55 << 1;
            int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
            a = i58 % 128;
            if (i58 % 2 != 0) {
                height = i23 / dimensionPixelOffset2;
                int i59 = -dimensionPixelOffset2;
                i = ((i23 | i59) << 1) - (i23 ^ i59);
            } else {
                height = i23 + dimensionPixelOffset2;
                int i60 = -(~(-dimensionPixelOffset2));
                int i61 = (i23 & i60) + (i23 | i60);
                i = (i61 ^ (-1)) + (i61 << 1);
            }
        } else {
            height = view2.getHeight();
            int i62 = a;
            int i63 = i62 & 89;
            int i64 = ((i62 ^ 89) | i63) << 1;
            int i65 = -((i62 | 89) & (~i63));
            int i66 = (i64 & i65) + (i65 | i64);
            b = i66 % 128;
            if (i66 % 2 == 0) {
                int i67 = 2 / 2;
            }
            i = 0;
        }
        layoutParams.gravity = 49;
        Context context2 = agVar.c;
        int i68 = a;
        int i69 = i68 & 7;
        int i70 = i69 + ((i68 ^ 7) | i69);
        b = i70 % 128;
        if (i70 % 2 == 0) {
            context2.getResources();
            obj.hashCode();
            throw null;
        }
        Resources resources = context2.getResources();
        if (z2) {
            i2 = ivas.gov.bisp.enumeration.R.dimen.tooltip_y_offset_touch;
        } else {
            int i71 = a;
            int i72 = ((i71 & 61) - (~(i71 | 61))) - 1;
            b = i72 % 128;
            int i73 = i72 % 2;
            i2 = ivas.gov.bisp.enumeration.R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view2.getRootView();
        int i74 = a;
        int i75 = ((i74 & 4) + (i74 | 4)) - 1;
        b = i75 % 128;
        int i76 = i75 % 2;
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
            context = view2.getContext();
            while (context instanceof ContextWrapper) {
                int i77 = a;
                int i78 = ((i77 & (-122)) | (121 & (~i77))) + ((i77 & 121) << 1);
                i3 = i78 % 128;
                b = i3;
                int i79 = i78 % 2;
                if (context instanceof Activity) {
                    int i80 = (i3 & (-76)) | ((~i3) & 75);
                    int i81 = (i3 & 75) << 1;
                    i4 = (i80 & i81) + (i80 | i81);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    ((Activity) context).getWindow().getDecorView();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                context = ((ContextWrapper) context).getBaseContext();
                int i82 = a;
                int i83 = i82 & 7;
                i5 = (i83 - (~(-(-((i82 ^ 7) | i83))))) - 1;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i84 = 3 / 5;
                }
            }
        } else {
            int i85 = a;
            int i86 = i85 & 19;
            int i87 = (~i86) & (i85 | 19);
            int i88 = i86 << 1;
            int i89 = (i87 & i88) + (i87 | i88);
            b = i89 % 128;
            if (i89 % 2 != 0 ? ((WindowManager.LayoutParams) layoutParams2).type != 2 : ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                context = view2.getContext();
                while (context instanceof ContextWrapper) {
                    int i710 = a;
                    int i711 = ((i710 & (-122)) | (121 & (~i710))) + ((i710 & 121) << 1);
                    i3 = i711 % 128;
                    b = i3;
                    int i712 = i711 % 2;
                    if (context instanceof Activity) {
                        int i810 = (i3 & (-76)) | ((~i3) & 75);
                        int i811 = (i3 & 75) << 1;
                        i4 = (i810 & i811) + (i810 | i811);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            rootView = ((Activity) context).getWindow().getDecorView();
                            break;
                        }
                        ((Activity) context).getWindow().getDecorView();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    int i812 = a;
                    int i813 = i812 & 7;
                    i5 = (i813 - (~(-(-((i812 ^ 7) | i813))))) - 1;
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i814 = 3 / 5;
                    }
                }
            } else {
                int i90 = a;
                int i91 = (i90 ^ 25) + ((i90 & 25) << 1);
                b = i91 % 128;
                int i92 = i91 % 2;
                int i93 = i90 + 19;
                b = i93 % 128;
                int i94 = i93 % 2;
            }
        }
        if (rootView == null) {
            int i95 = a;
            int i96 = i95 & 27;
            int i97 = (i95 | 27) & (~i96);
            int i98 = i96 << 1;
            int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
            b = i99 % 128;
            int i100 = i99 % 2;
            Log.e("TooltipPopup", "Cannot find app view");
            int i101 = (-2) - ((b + 78) ^ (-1));
            a = i101 % 128;
            int i102 = i101 % 2;
        } else {
            rootView.getWindowVisibleDisplayFrame(agVar.h);
            Rect rect = agVar.h;
            int i103 = b;
            int i104 = i103 & 11;
            int i105 = -(-((i103 ^ 11) | i104));
            int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
            a = i106 % 128;
            int i107 = i106 % 2;
            if (rect.left < 0) {
                int i108 = b + 83;
                a = i108 % 128;
                int i109 = i108 % 2;
                if (rect.top < 0) {
                    int i110 = a;
                    int i111 = i110 & 21;
                    int i112 = ((i110 | 21) & (~i111)) + (i111 << 1);
                    b = i112 % 128;
                    if (i112 % 2 == 0) {
                        agVar.c.getResources();
                        throw null;
                    }
                    Resources resources2 = agVar.c.getResources();
                    int i113 = b;
                    int i114 = ((i113 & 29) - (~(i113 | 29))) - 1;
                    a = i114 % 128;
                    if (i114 % 2 != 0) {
                        resources2.getIdentifier("status_bar_height", "dimen", "android");
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
                    } else {
                        int i115 = b;
                        int i116 = i115 & 65;
                        int i117 = (i115 | 65) & (~i116);
                        int i118 = i116 << 1;
                        int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
                        a = i119 % 128;
                        int i120 = i119 % 2;
                        dimensionPixelSize = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    Rect rect2 = agVar.h;
                    int i121 = b;
                    int i122 = (i121 ^ 21) + ((i121 & 21) << 1);
                    a = i122 % 128;
                    int i123 = i122 % 2;
                    rect2.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                    int i124 = b;
                    int i125 = i124 ^ 13;
                    int i126 = -(-((i124 & 13) << 1));
                    int i127 = (i125 & i126) + (i126 | i125);
                    a = i127 % 128;
                    int i128 = i127 % 2;
                }
            }
            rootView.getLocationOnScreen(agVar.i);
            view2.getLocationOnScreen(agVar.g);
            int i129 = a;
            int i130 = i129 & 5;
            int i131 = (i130 - (~((i129 ^ 5) | i130))) - 1;
            b = i131 % 128;
            int i132 = i131 % 2;
            int[] iArr = agVar.g;
            int i133 = iArr[0];
            int[] iArr2 = agVar.i;
            int i134 = b;
            int i135 = ((i134 & (-90)) | (89 & (~i134))) + ((i134 & 89) << 1);
            int i136 = i135 % 128;
            a = i136;
            int i137 = i135 % 2;
            int i138 = -iArr2[0];
            int i139 = i133 & i138;
            int i140 = ((((i133 ^ i138) | i139) << 1) - (~(-((~i139) & (i133 | i138))))) - 1;
            iArr[0] = i140;
            int i141 = iArr[1];
            int i142 = (-2) - ((((i136 | 74) << 1) - (i136 ^ 74)) ^ (-1));
            b = i142 % 128;
            if (i142 % 2 == 0) {
                iArr[1] = i141 >>> iArr2[1];
                i6 = i140 / width;
            } else {
                int i143 = -(~(-iArr2[1]));
                iArr[1] = (((i141 | i143) << 1) - (i141 ^ i143)) - 1;
                int i144 = -(-width);
                int i145 = ((i140 ^ i144) | (i140 & i144)) << 1;
                int i146 = -((i144 & (~i140)) | ((~i144) & i140));
                i6 = (i145 ^ i146) + ((i146 & i145) << 1);
            }
            int i147 = -(rootView.getWidth() / 2);
            layoutParams.x = (i6 ^ i147) + ((i147 & i6) << 1);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            View view3 = agVar.d;
            int i148 = a;
            int i149 = ((i148 ^ 85) | (i148 & 85)) << 1;
            int i150 = -(((~i148) & 85) | (i148 & (-86)));
            int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
            b = i151 % 128;
            int i152 = i151 % 2;
            view3.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredHeight = agVar.d.getMeasuredHeight();
            int[] iArr3 = agVar.g;
            int i153 = b;
            int i154 = ((i153 ^ 115) | (i153 & 115)) << 1;
            int i155 = -((i153 & (-116)) | ((~i153) & 115));
            int i156 = (i154 ^ i155) + ((i154 & i155) << 1);
            a = i156 % 128;
            if (i156 % 2 != 0) {
                int i157 = (-2) - (((iArr3[0] * i) - (~(-dimensionPixelOffset3))) ^ (-1));
                int i158 = -(~(-measuredHeight));
                i7 = ((i157 & i158) + (i157 | i158)) - 1;
                c2 = 0;
            } else {
                int i159 = (iArr3[1] - (~i)) - 1;
                int i160 = -dimensionPixelOffset3;
                int i161 = (i159 & i160) + (i159 | i160);
                int i162 = -measuredHeight;
                i7 = (i161 & i162) + (i162 | i161);
                c2 = 1;
            }
            int i163 = iArr3[c2];
            int i164 = -(-height);
            int i165 = i163 & i164;
            int i166 = ((i163 ^ i164) | i165) << 1;
            int i167 = -((i163 | i164) & (~i165));
            int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
            int i169 = -(-dimensionPixelOffset3);
            int i170 = i168 & i169;
            int i171 = (i170 - (~(-(-((i169 ^ i168) | i170))))) - 1;
            if (!z2) {
                int i172 = measuredHeight & i171;
                if (((((measuredHeight ^ i171) | i172) << 1) - (~(-((measuredHeight | i171) & (~i172))))) - 1 <= agVar.h.height()) {
                    int i173 = a;
                    int i174 = i173 & 71;
                    int i175 = ((i173 | 71) & (~i174)) + (i174 << 1);
                    b = i175 % 128;
                    if (i175 % 2 == 0) {
                        layoutParams.y = i171;
                        int i176 = 7 / 0;
                    } else {
                        layoutParams.y = i171;
                    }
                    int i177 = b;
                    int i178 = i177 & 57;
                    int i179 = ((i177 | 57) & (~i178)) + (i178 << 1);
                    a = i179 % 128;
                    int i180 = i179 % 2;
                } else {
                    layoutParams.y = i7;
                }
            } else {
                int i181 = (-2) - (((i153 & 100) + (i153 | 100)) ^ (-1));
                a = i181 % 128;
                if (i181 % 2 != 0) {
                    int i182 = 5 / 0;
                    if (i7 < 0) {
                        layoutParams.y = i171;
                        int i183 = b;
                        int i184 = i183 & 83;
                        int i185 = i184 + ((i183 ^ 83) | i184);
                        a = i185 % 128;
                        int i186 = i185 % 2;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (i7 < 0) {
                    layoutParams.y = i171;
                    int i187 = b;
                    int i188 = i187 & 83;
                    int i189 = i188 + ((i187 ^ 83) | i188);
                    a = i189 % 128;
                    int i1810 = i189 % 2;
                } else {
                    layoutParams.y = i7;
                }
            }
        }
        WindowManager windowManager = (WindowManager) agVar.c.getSystemService("window");
        int i190 = b;
        int i191 = i190 & 101;
        int i192 = i191 + ((i190 ^ 101) | i191);
        a = i192 % 128;
        int i193 = i192 % 2;
        windowManager.addView(agVar.d, agVar.f);
        this.f.addOnAttachStateChangeListener(this);
        if (this.m) {
            int i194 = b;
            int i195 = i194 & 69;
            int i196 = (i194 ^ 69) | i195;
            int i197 = ((i195 | i196) << 1) - (i196 ^ i195);
            a = i197 % 128;
            int i198 = i197 % 2;
            j2 = 2500;
        } else {
            if ((T.aWX.i(this.f) & 1) == 1) {
                int i199 = b;
                int i200 = (((i199 | 72) << 1) - (i199 ^ 72)) - 1;
                a = i200 % 128;
                int i201 = i200 % 2;
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                int i202 = b + 33;
                a = i202 % 128;
                int i203 = i202 % 2;
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                int i204 = a;
                int i205 = (i204 & 35) + (i204 | 35);
                b = i205 % 128;
                int i206 = i205 % 2;
                j = 15000;
            }
            j2 = j - ((long) longPressTimeout);
            int i207 = b + 109;
            a = i207 % 128;
            int i208 = i207 % 2;
        }
        this.f.removeCallbacks(this.i);
        int i209 = b;
        int i210 = i209 ^ 85;
        int i211 = ((((i209 & 85) | i210) << 1) - (~(-i210))) - 1;
        a = i211 % 128;
        if (i211 % 2 != 0) {
            this.f.postDelayed(this.i, j2);
            Object obj5 = null;
            obj5.hashCode();
            throw null;
        }
        this.f.postDelayed(this.i, j2);
        int i212 = a;
        int i213 = (i212 | 3) << 1;
        int i214 = -(i212 ^ 3);
        int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
        b = i215 % 128;
        int i216 = i215 % 2;
    }
}
