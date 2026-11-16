package ivas.gov.bisp.enumeration.p081d;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.M.n;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p007ag.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class T {
    private static int a = 0;
    private static int b = 1;
    public static WeakHashMap<View, R> c;
    public static Field d;
    public static boolean e;
    public static final int[] f;
    public static final aWV g;
    public static final J h;

    public static class aWV implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private static int a = 1;
        private static int b;
        public final WeakHashMap<View, Boolean> c = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-82)) | ((~i2) & 81);
            int i4 = -(-((i2 & 81) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            if (i6 != 0) {
                throw null;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 71;
            int i4 = (i2 ^ 71) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 107;
            int i5 = ((i3 | 107) & (~i4)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = b;
                int i8 = ((i7 | 125) << 1) - (((~i7) & 125) | (i7 & (-126)));
                a = i8 % 128;
                Object obj = null;
                if (i8 % 2 == 0) {
                    this.c.entrySet().iterator();
                    throw null;
                }
                Iterator<Map.Entry<View, Boolean>> it = this.c.entrySet().iterator();
                int i9 = a + 9;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 89 / 0;
                }
                while (!(!it.hasNext())) {
                    int i11 = b + 43;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    Map.Entry<View, Boolean> next = it.next();
                    View key = next.getKey();
                    int i13 = a;
                    int i14 = i13 & 109;
                    int i15 = ((((i13 ^ 109) | i14) << 1) - (~(-((i13 | 109) & (~i14))))) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    View view = key;
                    boolean zBooleanValue = next.getValue().booleanValue();
                    int i17 = a;
                    int i18 = (-2) - (((i17 & 74) + (i17 | 74)) ^ (-1));
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    if (view.getVisibility() == 0) {
                        int i20 = b;
                        int i21 = ((i20 & 68) + (i20 | 68)) - 1;
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = ((i20 | 3) << 1) - (i20 ^ 3);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        z = true;
                    } else {
                        int i25 = a;
                        int i26 = (i25 & (-112)) | ((~i25) & 111);
                        int i27 = (i25 & 111) << 1;
                        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        z = false;
                    }
                    if (zBooleanValue != z) {
                        int i30 = b;
                        int i31 = i30 + 75;
                        a = i31 % 128;
                        if (i31 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            int i32 = i30 & 43;
                            int i33 = (i30 ^ 43) | i32;
                            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                            int i35 = i34 % 128;
                            a = i35;
                            i = i34 % 2 == 0 ? 65 : 16;
                            int i36 = i35 & 101;
                            int i37 = ((i35 | 101) & (~i36)) + (i36 << 1);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                        } else {
                            int i39 = i30 & 57;
                            int i40 = (((i30 | 57) & (~i39)) - (~(i39 << 1))) - 1;
                            a = i40 % 128;
                            if (i40 % 2 == 0) {
                                int i41 = 5 % 4;
                            }
                            i = 32;
                        }
                        T.k(view, i);
                        WeakHashMap<View, Boolean> weakHashMap = this.c;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        int i42 = a;
                        int i43 = ((i42 | 35) << 1) - (((~i42) & 35) | (i42 & (-36)));
                        b = i43 % 128;
                        if (i43 % 2 != 0) {
                            weakHashMap.put(view, boolValueOf);
                            obj.hashCode();
                            throw null;
                        }
                        weakHashMap.put(view, boolValueOf);
                        int i44 = b;
                        int i45 = (i44 ^ 21) + ((i44 & 21) << 1);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                    }
                }
            }
            int i47 = a;
            int i48 = (((i47 | 2) << 1) - (i47 ^ 2)) - 1;
            b = i48 % 128;
            if (i48 % 2 != 0) {
                int i49 = 93 / 0;
            }
        }
    }

    public static class aWW {
        private static int a = 0;
        private static int b = 1;

        public static boolean b(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 ^ 13) | (i2 & 13)) << 1) - (((~i2) & 13) | (i2 & (-14)));
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean zHasOnClickListeners = view.hasOnClickListeners();
            if (i4 == 0) {
                int i5 = 75 / 0;
            }
            int i6 = b;
            int i7 = i6 ^ 97;
            int i8 = (i6 & 97) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return zHasOnClickListeners;
        }
    }

    public static class aWX {
        private static int a = 0;
        private static int b = 1;

        public static boolean b(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean zHasTransientState = view.hasTransientState();
            int i5 = a;
            int i6 = (i5 & 95) + (i5 | 95);
            b = i6 % 128;
            int i7 = i6 % 2;
            return zHasTransientState;
        }

        public static AccessibilityNodeProvider c(View view) {
            int i = 2 % 2;
            int i2 = b + 123;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                view.getAccessibilityNodeProvider();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
            int i3 = b;
            int i4 = ((i3 & (-76)) | ((~i3) & 75)) + ((i3 & 75) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            return accessibilityNodeProvider;
        }

        public static boolean d(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 8) + ((i2 & 8) << 1)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean fitsSystemWindows = view.getFitsSystemWindows();
            int i5 = a;
            int i6 = i5 & 9;
            int i7 = i6 + ((i5 ^ 9) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            return fitsSystemWindows;
        }

        public static int e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 37;
            int i4 = -(-((i2 & 37) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return view.getImportantForAccessibility();
            }
            view.getImportantForAccessibility();
            throw null;
        }

        public static int f(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-92)) | ((~i2) & 91)) - (~(-(-((i2 & 91) << 1))))) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                view.getMinimumHeight();
                obj.hashCode();
                throw null;
            }
            int minimumHeight = view.getMinimumHeight();
            int i4 = a + 53;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return minimumHeight;
            }
            obj.hashCode();
            throw null;
        }

        public static ViewParent g(View view) {
            int i = 2 % 2;
            int i2 = a + 70;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            ViewParent parentForAccessibility = view.getParentForAccessibility();
            int i5 = b;
            int i6 = (i5 ^ 27) + ((i5 & 27) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return parentForAccessibility;
        }

        public static int h(View view) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 112) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
            int minimumWidth = view.getMinimumWidth();
            int i4 = b + 101;
            a = i4 % 128;
            int i5 = i4 % 2;
            return minimumWidth;
        }

        public static int i(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 21;
            int i4 = ((i2 & 21) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return view.getWindowSystemUiVisibility();
            }
            view.getWindowSystemUiVisibility();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static boolean j(View view) {
            int i = 2 % 2;
            int i2 = b + 47;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return view.hasOverlappingRendering();
            }
            view.hasOverlappingRendering();
            throw null;
        }

        public static boolean k(View view, int i, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 37;
            int i5 = (i4 - (~((i3 ^ 37) | i4))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            boolean zPerformAccessibilityAction = view.performAccessibilityAction(i, bundle);
            int i7 = a;
            int i8 = (-2) - (((i7 ^ 120) + ((i7 & 120) << 1)) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
            return zPerformAccessibilityAction;
        }

        public static void l(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-50)) | ((~i2) & 49)) - (~((i2 & 49) << 1))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            view.postInvalidateOnAnimation();
            if (i4 != 0) {
                int i5 = 62 / 0;
            }
        }

        public static void m(View view, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = i6 ^ 1;
            int i8 = ((i6 & 1) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            view.postInvalidateOnAnimation(i, i2, i3, i4);
            int i12 = a;
            int i13 = (i12 & 24) + (i12 | 24);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }

        public static void n(View view, Runnable runnable, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 91;
            int i4 = -(-((i2 ^ 91) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.postOnAnimationDelayed(runnable, j);
            if (i6 != 0) {
                int i7 = 91 / 0;
            }
        }

        public static void o(View view, Runnable runnable) {
            int i = 2 % 2;
            int i2 = b + 81;
            a = i2 % 128;
            int i3 = i2 % 2;
            view.postOnAnimation(runnable);
            int i4 = a;
            int i5 = i4 | 61;
            int i6 = (i5 << 1) - ((~(i4 & 61)) & i5);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        public static void p(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 91;
            int i4 = -(-((i2 ^ 91) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                throw null;
            }
        }

        public static void q(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 103;
            int i4 = (i2 ^ 103) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                view.requestFitSystemWindows();
                return;
            }
            view.requestFitSystemWindows();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void r(View view, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = (((i2 | 51) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            view.setHasTransientState(z);
            if (i5 != 0) {
                int i6 = 58 / 0;
            }
            int i7 = a;
            int i8 = ((((i7 ^ 5) | (i7 & 5)) << 1) - (~(-(((~i7) & 5) | (i7 & (-6)))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void s(View view, Drawable drawable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 7) << 1;
            int i4 = -(i2 ^ 7);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            view.setBackground(drawable);
            if (i6 == 0) {
                throw null;
            }
            int i7 = a;
            int i8 = (i7 & 81) + (i7 | 81);
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void t(View view, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 104) + ((i3 & 104) << 1);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.setImportantForAccessibility(i);
            int i7 = a;
            int i8 = (i7 ^ 23) + ((i7 & 23) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static class aWY {
        private static int a = 0;
        private static int b = 1;

        public static void b(View view, Paint paint) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 97;
            int i4 = ((i2 ^ 97) | i3) << 1;
            int i5 = -((i2 | 97) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.setLayerPaint(paint);
            if (i7 != 0) {
                int i8 = 41 / 0;
            }
        }

        public static int c() {
            int i = 2 % 2;
            int i2 = b + 3;
            a = i2 % 128;
            int i3 = i2 % 2;
            int iGenerateViewId = View.generateViewId();
            int i4 = a;
            int i5 = i4 & 33;
            int i6 = ((i4 | 33) & (~i5)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return iGenerateViewId;
        }

        public static Display d(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 101) | (i2 & 101)) << 1;
            int i4 = -(((~i2) & 101) | (i2 & (-102)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            Display display = view.getDisplay();
            int i7 = a + 3;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return display;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 111) | (i2 & 111)) << 1) - (((~i2) & 111) | (i2 & (-112)));
            a = i3 % 128;
            int i4 = i3 % 2;
            int labelFor = view.getLabelFor();
            int i5 = a;
            int i6 = (i5 & 65) + (i5 | 65);
            b = i6 % 128;
            int i7 = i6 % 2;
            return labelFor;
        }

        public static int f(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 78) << 1) - (i2 ^ 78)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                view.getLayoutDirection();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int layoutDirection = view.getLayoutDirection();
            int i4 = a;
            int i5 = i4 & 77;
            int i6 = i5 + ((i4 ^ 77) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return layoutDirection;
        }

        public static int g(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 110) << 1) - (i2 ^ 110)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return view.getPaddingStart();
            }
            int i4 = 54 / 0;
            return view.getPaddingStart();
        }

        public static int h(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 9;
            int i4 = -(-((i2 ^ 9) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int paddingEnd = view.getPaddingEnd();
            if (i6 == 0) {
                int i7 = 19 / 0;
            }
            return paddingEnd;
        }

        public static boolean i(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-92)) | ((~i2) & 91);
            int i4 = (i2 & 91) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean zIsPaddingRelative = view.isPaddingRelative();
            int i7 = a;
            int i8 = i7 ^ 21;
            int i9 = -(-((i7 & 21) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return zIsPaddingRelative;
        }

        public static void j(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 65;
            int i5 = (((i3 | 65) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            view.setLabelFor(i);
            int i7 = a;
            int i8 = ((i7 | 81) << 1) - (i7 ^ 81);
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void k(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 57;
            int i5 = (((i3 | 57) & (~i4)) - (~(i4 << 1))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            view.setLayoutDirection(i);
            int i7 = a;
            int i8 = (((i7 & (-116)) | ((~i7) & 115)) - (~((i7 & 115) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = ((i6 | 15) << 1) - (i6 ^ 15);
            b = i7 % 128;
            int i8 = i7 % 2;
            view.setPaddingRelative(i, i2, i3, i4);
            int i9 = b;
            int i10 = i9 & 21;
            int i11 = -(-((i9 ^ 21) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 7 / 0;
            }
        }
    }

    public static class aWZ {
        private static int a = 1;
        private static int b;

        public static Rect b(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 2) + ((i2 & 2) << 1)) ^ (-1));
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                view.getClipBounds();
                throw null;
            }
            Rect clipBounds = view.getClipBounds();
            int i4 = b + 87;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return clipBounds;
            }
            obj.hashCode();
            throw null;
        }

        public static boolean c(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-44)) | ((~i2) & 43);
            int i4 = (i2 & 43) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            boolean zIsInLayout = view.isInLayout();
            int i7 = b;
            int i8 = ((i7 & 34) + (i7 | 34)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return zIsInLayout;
        }

        public static void d(View view, Rect rect) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
            int i4 = -(((~i2) & 41) | (i2 & (-42)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.setClipBounds(rect);
            if (i6 == 0) {
                int i7 = 92 / 0;
            }
            int i8 = b;
            int i9 = ((((i8 ^ 25) | (i8 & 25)) << 1) - (~(-(((~i8) & 25) | (i8 & (-26)))))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }
    }

    public static class aXa {
        private static int a = 0;
        private static int b = 1;

        public static int b(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = (i2 ^ 107) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int accessibilityLiveRegion = view.getAccessibilityLiveRegion();
            int i7 = a;
            int i8 = ((i7 & (-112)) | ((~i7) & 111)) + ((i7 & 111) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return accessibilityLiveRegion;
        }

        public static boolean c(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 11) << 1) - (i2 ^ 11);
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            int i5 = b;
            int i6 = i5 & 47;
            int i7 = (i5 | 47) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return zIsAttachedToWindow;
            }
            throw null;
        }

        public static boolean d(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 55;
            int i4 = i3 + ((i2 ^ 55) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsLaidOut = view.isLaidOut();
            int i6 = a;
            int i7 = ((i6 | 40) << 1) - (i6 ^ 40);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return zIsLaidOut;
        }

        public static boolean e(View view) {
            int i = 2 % 2;
            int i2 = b + 83;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return view.isLayoutDirectionResolved();
            }
            view.isLayoutDirectionResolved();
            throw null;
        }

        public static void f(View view, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 ^ 37) | (i3 & 37)) << 1) - (((~i3) & 37) | (i3 & (-38)));
            a = i4 % 128;
            int i5 = i4 % 2;
            view.setAccessibilityLiveRegion(i);
            int i6 = b;
            int i7 = i6 & 91;
            int i8 = i7 + ((i6 ^ 91) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void g(ViewParent viewParent, View view, View view2, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 ^ 67) + ((i3 & 67) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
            int i6 = b;
            int i7 = (-2) - (((i6 & 86) + (i6 | 86)) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void h(AccessibilityEvent accessibilityEvent, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 67;
            int i5 = -(-(i3 | 67));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            accessibilityEvent.setContentChangeTypes(i);
            if (i7 != 0) {
                int i8 = 8 / 0;
            }
        }
    }

    public static class aXd {
        private static int a = 0;
        private static int b = 1;

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 95) + (i2 | 95);
            b = i3 % 128;
            int i4 = i3 % 2;
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            int i5 = b;
            int i6 = (i5 ^ 25) + ((i5 & 25) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return windowInsetsDispatchApplyWindowInsets;
        }

        public static WindowInsets c(View view, WindowInsets windowInsets) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 69;
            int i4 = ((i2 ^ 69) | i3) << 1;
            int i5 = -((i2 | 69) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return view.onApplyWindowInsets(windowInsets);
            }
            view.onApplyWindowInsets(windowInsets);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void d(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 55) | (i2 & 55)) << 1;
            int i4 = -(((~i2) & 55) | (i2 & (-56)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.requestApplyInsets();
            int i7 = a;
            int i8 = ((i7 ^ 79) | (i7 & 79)) << 1;
            int i9 = -(((~i7) & 79) | (i7 & (-80)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public static class aXf {
        private static int a = 0;
        private static int b = 1;

        public static void b(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = ((((i2 ^ 121) | i3) << 1) - (~(-((i2 | 121) & (~i3))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            view.cancelDragAndDrop();
            if (i5 != 0) {
                int i6 = 89 / 0;
            }
            int i7 = a;
            int i8 = ((i7 | 3) << 1) - (((~i7) & 3) | (i7 & (-4)));
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static void c(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 103;
            int i4 = ((i2 & 103) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.dispatchFinishTemporaryDetach();
            int i8 = a;
            int i9 = i8 & 123;
            int i10 = (i9 - (~((i8 ^ 123) | i9))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public static void d(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-54)) | ((~i2) & 53);
            int i4 = (i2 & 53) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.dispatchStartTemporaryDetach();
            int i7 = a + 85;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public static void e(View view, PointerIcon pointerIcon) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 113) + (i2 | 113);
            b = i3 % 128;
            int i4 = i3 % 2;
            view.setPointerIcon(pointerIcon);
            int i5 = b + 79;
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 35;
            int i4 = (((i2 ^ 35) | i3) << 1) - ((i2 | 35) & (~i3));
            a = i4 % 128;
            int i5 = i4 % 2;
            view.updateDragShadow(dragShadowBuilder);
            int i6 = a;
            int i7 = ((i6 | 67) << 1) - (i6 ^ 67);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static boolean g(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 71) << 1) - (i3 ^ 71);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
                throw null;
            }
            boolean zStartDragAndDrop = view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
            int i5 = a + 101;
            b = i5 % 128;
            int i6 = i5 % 2;
            return zStartDragAndDrop;
        }
    }

    public static class aXg {
        private static int a = 1;
        private static int b;

        public static boolean b(View view) {
            int i = 2 % 2;
            int i2 = a + 123;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zRestoreDefaultFocus = view.restoreDefaultFocus();
            int i4 = a;
            int i5 = i4 & 91;
            int i6 = i5 + ((i4 ^ 91) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return zRestoreDefaultFocus;
        }

        public static void c(View view, Collection<View> collection, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 1;
            int i5 = i3 | 1;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.addKeyboardNavigationClusters(collection, i);
            int i8 = a + 41;
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        public static int d(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 25;
            int i4 = ((i2 & 25) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return view.getImportantForAutofill();
            }
            view.getImportantForAutofill();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 123;
            int i4 = -(-((i2 & 123) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                view.getNextClusterForwardId();
                throw null;
            }
            int nextClusterForwardId = view.getNextClusterForwardId();
            int i6 = a;
            int i7 = i6 & 105;
            int i8 = ((i6 | 105) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return nextClusterForwardId;
        }

        public static boolean f(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 75;
            int i4 = ((i2 | 75) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            boolean zHasExplicitFocusable = view.hasExplicitFocusable();
            int i6 = b;
            int i7 = ((i6 ^ 123) | (i6 & 123)) << 1;
            int i8 = -(((~i6) & 123) | (i6 & (-124)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return zHasExplicitFocusable;
            }
            throw null;
        }

        public static boolean g(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 1;
            int i4 = (i2 ^ 1) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            boolean zIsImportantForAutofill = view.isImportantForAutofill();
            int i7 = b;
            int i8 = ((i7 ^ 12) + ((i7 & 12) << 1)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return zIsImportantForAutofill;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static boolean h(View view) {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 84) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsFocusedByDefault = view.isFocusedByDefault();
            int i4 = a;
            int i5 = i4 & 121;
            int i6 = (i4 ^ 121) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            return zIsFocusedByDefault;
        }

        public static boolean i(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            if (i4 == 0) {
                int i5 = 76 / 0;
            }
            int i6 = b;
            int i7 = ((i6 & 81) - (~(i6 | 81))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return zIsKeyboardNavigationCluster;
        }

        public static View j(View view, View view2, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 51;
            int i5 = -(-((i3 ^ 51) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                view.keyboardNavigationClusterSearch(view2, i);
                obj.hashCode();
                throw null;
            }
            View viewKeyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
            int i7 = b;
            int i8 = ((i7 ^ 124) + ((i7 & 124) << 1)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return viewKeyboardNavigationClusterSearch;
            }
            obj.hashCode();
            throw null;
        }

        public static void k(View view, String... strArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 44) + (i2 | 44)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            view.setAutofillHints(strArr);
            if (i4 != 0) {
                int i5 = 84 / 0;
            }
        }

        public static void l(View view, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 1;
            int i4 = ((i2 ^ 1) | i3) << 1;
            int i5 = -((i2 | 1) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.setFocusedByDefault(z);
            if (i7 == 0) {
                int i8 = 60 / 0;
            }
        }

        public static void m(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 95;
            int i5 = -(-((i3 ^ 95) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            view.setImportantForAutofill(i);
            if (i7 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void n(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 109;
            int i5 = (i3 | 109) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            view.setNextClusterForwardId(i);
            if (i8 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void o(View view, boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 109;
            int i4 = i2 | 109;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                view.setKeyboardNavigationCluster(z);
                return;
            }
            view.setKeyboardNavigationCluster(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void p(View view, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 117) | (i2 & 117)) << 1) - (~(-(((~i2) & 117) | (i2 & (-118)))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                view.setTooltipText(charSequence);
                int i4 = 66 / 0;
            } else {
                view.setTooltipText(charSequence);
            }
            int i5 = a;
            int i6 = i5 | 93;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 93)) & i6);
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }
    }

    public static class aXi {
        private static int a = 0;
        private static int b = 1;

        public static View.AccessibilityDelegate b(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-16)) | ((~i2) & 15)) - (~(-(-((i2 & 15) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            View.AccessibilityDelegate accessibilityDelegate = view.getAccessibilityDelegate();
            int i5 = a;
            int i6 = (i5 ^ 75) + ((i5 & 75) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return accessibilityDelegate;
            }
            throw null;
        }

        public static List<Rect> c(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-108)) | ((~i2) & 107);
            int i4 = (i2 & 107) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            List<Rect> systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            int i7 = b + 75;
            a = i7 % 128;
            int i8 = i7 % 2;
            return systemGestureExclusionRects;
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (-2) - (((i4 ^ 76) + ((i4 & 76) << 1)) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
            int i7 = b;
            int i8 = i7 & 67;
            int i9 = ((i7 | 67) & (~i8)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        public static void e(View view, List<Rect> list) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 55;
            int i4 = i3 + ((i2 ^ 55) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            view.setSystemGestureExclusionRects(list);
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = b;
            int i7 = i6 ^ 119;
            int i8 = (i6 & 119) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 21 / 0;
            }
        }
    }

    public static class aXj {
        private static int a = 1;
        private static int b;

        public static CharSequence b(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 57;
            int i4 = (i2 | 57) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            CharSequence stateDescription = view.getStateDescription();
            int i8 = b + 73;
            a = i8 % 128;
            int i9 = i8 % 2;
            return stateDescription;
        }

        public static void c(View view, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-24)) | ((~i2) & 23);
            int i4 = (i2 & 23) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.setStateDescription(charSequence);
            int i7 = b + 89;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static final class aXk implements OnReceiveContentListener {
        private static int a = 0;
        private static int b = 1;
        public final InterfaceC0286o c;

        public aXk(InterfaceC0286o interfaceC0286o) {
            this.c = interfaceC0286o;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        
            if (r7 != r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            r7 = (((r2 | 122) << 1) - (r2 ^ 122)) - 1;
            ivas.gov.bisp.enumeration.d.T.aXk.b = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
        
            if ((r7 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            r7 = r7.c.e();
            r8 = ivas.gov.bisp.enumeration.d.T.aXk.b + 101;
            ivas.gov.bisp.enumeration.d.T.aXk.a = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        
            if ((r8 % 2) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
        
            if (r7 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
        
            if (r7 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        
            r7 = ((r2 | 123) << 1) - (r2 ^ 123);
            r8 = r7 % 128;
            ivas.gov.bisp.enumeration.d.T.aXk.b = r8;
            r7 = r7 % 2;
            r7 = (r8 & 45) + (r8 | 45);
            ivas.gov.bisp.enumeration.d.T.aXk.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
        
            if ((r7 % 2) != 0) goto L11;
         */
        @Override // android.view.OnReceiveContentListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ContentInfo onReceiveContent(android.view.View r7, android.view.ContentInfo r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                ivas.gov.bisp.enumeration.d.h r1 = new ivas.gov.bisp.enumeration.d.h
                ivas.gov.bisp.enumeration.d.h$aWq r2 = new ivas.gov.bisp.enumeration.d.h$aWq
                r2.<init>(r8)
                r1.<init>(r2)
                int r2 = ivas.gov.bisp.enumeration.d.T.aXk.b
                r3 = r2 | 99
                int r3 = r3 << 1
                r4 = r2 & (-100)
                int r2 = ~r2
                r5 = 99
                r2 = r2 & r5
                r2 = r2 | r4
                int r2 = -r2
                r4 = r3 & r2
                r2 = r2 | r3
                int r4 = r4 + r2
                int r2 = r4 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.a = r2
                int r4 = r4 % r0
                ivas.gov.bisp.enumeration.d.o r2 = r6.c
                ivas.gov.bisp.enumeration.d.h r7 = r2.b(r7, r1)
                int r2 = ivas.gov.bisp.enumeration.d.T.aXk.b
                r3 = r2 ^ 17
                r2 = r2 & 17
                int r2 = r2 << 1
                int r3 = r3 + r2
                int r2 = r3 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.a = r2
                int r3 = r3 % r0
                r4 = 0
                if (r3 == 0) goto L42
                r3 = 90
                int r3 = r3 / 0
                if (r7 != 0) goto L61
                goto L44
            L42:
                if (r7 != 0) goto L61
            L44:
                r7 = r2 | 123(0x7b, float:1.72E-43)
                int r7 = r7 << 1
                r8 = r2 ^ 123(0x7b, float:1.72E-43)
                int r7 = r7 - r8
                int r8 = r7 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.b = r8
                int r7 = r7 % r0
                r7 = r8 & 45
                r8 = r8 | 45
                int r7 = r7 + r8
                int r8 = r7 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.a = r8
                int r7 = r7 % r0
                if (r7 != 0) goto L5d
                return r4
            L5d:
                r4.hashCode()
                throw r4
            L61:
                if (r7 != r1) goto L78
                r7 = r2 | 122(0x7a, float:1.71E-43)
                int r7 = r7 << 1
                r1 = r2 ^ 122(0x7a, float:1.71E-43)
                int r7 = r7 - r1
                int r7 = r7 + (-1)
                int r1 = r7 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.b = r1
                int r7 = r7 % r0
                if (r7 == 0) goto L74
                return r8
            L74:
                r4.hashCode()
                throw r4
            L78:
                ivas.gov.bisp.enumeration.d.h$aWp r7 = r7.c
                android.view.ContentInfo r7 = r7.e()
                int r8 = ivas.gov.bisp.enumeration.d.T.aXk.b
                int r8 = r8 + 101
                int r1 = r8 % 128
                ivas.gov.bisp.enumeration.d.T.aXk.a = r1
                int r8 = r8 % r0
                if (r8 != 0) goto L8a
                return r7
            L8a:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.d.T.aXk.onReceiveContent(android.view.View, android.view.ContentInfo):android.view.ContentInfo");
        }
    }

    public interface aXl {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class aXm {
        private static int a = 1;
        private static int b;
        public static final ArrayList<WeakReference<View>> c = new ArrayList<>();
        public WeakHashMap<View, Boolean> d = null;
        public SparseArray<WeakReference<View>> e = null;
        public WeakReference<KeyEvent> f = null;

        static {
            int i = a;
            int i2 = (((i | 64) << 1) - (i ^ 64)) - 1;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 25) | (i2 & 25)) << 1;
            int i4 = -((i2 & (-26)) | ((~i2) & 25));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            WeakHashMap<View, Boolean> weakHashMap = this.d;
            Object obj = null;
            if (weakHashMap != null) {
                int i7 = (i2 ^ 126) + ((i2 & 126) << 1);
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (weakHashMap.containsKey(view)) {
                    int i10 = b;
                    int i11 = (i10 ^ 19) + ((i10 & 19) << 1);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    if (view instanceof ViewGroup) {
                        int i13 = (i10 ^ 87) + ((i10 & 87) << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            ((ViewGroup) view).getChildCount();
                            obj.hashCode();
                            throw null;
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        int i14 = b + 63;
                        a = i14 % 128;
                        int i15 = i14 % 2 == 0 ? (~childCount) + (childCount << 1) : ((((childCount ^ (-1)) | childCount) << 1) - (~(-(~childCount)))) - 1;
                        while (i15 >= 0) {
                            int i16 = a;
                            int i17 = (i16 & (-48)) | ((~i16) & 47);
                            int i18 = (i16 & 47) << 1;
                            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                            b = i19 % 128;
                            int i20 = i19 % 2;
                            View viewC = c(viewGroup.getChildAt(i15), keyEvent);
                            int i21 = a;
                            int i22 = i21 + 85;
                            int i23 = i22 % 128;
                            b = i23;
                            int i24 = i22 % 2;
                            if (viewC != null) {
                                int i25 = ((i21 & 88) + (i21 | 88)) - 1;
                                b = i25 % 128;
                                int i26 = i25 % 2;
                                int i27 = i21 & 97;
                                int i28 = (~i27) & (i21 | 97);
                                int i29 = i27 << 1;
                                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                return viewC;
                            }
                            i15 = (((~i15) | i15) << 1) - (~i15);
                            int i32 = (i23 & 121) + (i23 | 121);
                            a = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    }
                    if (d(view, keyEvent)) {
                        int i34 = a;
                        int i35 = i34 ^ 53;
                        int i36 = -(-((i34 & 53) << 1));
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        int i38 = i37 % 128;
                        b = i38;
                        int i39 = i37 % 2;
                        int i40 = (-2) - (((i38 & 100) + (i38 | 100)) ^ (-1));
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        return view;
                    }
                }
            }
            int i42 = b + 91;
            a = i42 % 128;
            int i43 = i42 % 2;
            return null;
        }

        public final boolean d(View view, KeyEvent keyEvent) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 7;
            int i4 = -(-((i2 ^ 7) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                int i7 = a;
                int i8 = i7 & 15;
                int i9 = (((i7 | 15) & (~i8)) - (~(i8 << 1))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                int size = arrayList.size();
                int i11 = (size - (~((size ^ (-1)) | size))) - 1;
                int i12 = b;
                int i13 = (i12 | 11) << 1;
                int i14 = -(i12 ^ 11);
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 4 / 2;
                }
                while (i11 >= 0) {
                    int i17 = b;
                    int i18 = (i17 ^ 55) + ((i17 & 55) << 1);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    if (!(!((aXl) arrayList.get(i11)).onUnhandledKeyEvent(view, keyEvent))) {
                        int i20 = a;
                        int i21 = ((i20 ^ 16) + ((i20 & 16) << 1)) - 1;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = i20 ^ 1;
                        int i24 = (i20 & 1) << 1;
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        return true;
                    }
                    i11 += (~i11) | i11;
                    int i27 = b;
                    int i28 = i27 & 7;
                    int i29 = (i28 - (~(-(-((i27 ^ 7) | i28))))) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
            }
            int i31 = a;
            int i32 = (i31 ^ 25) + ((i31 & 25) << 1);
            b = i32 % 128;
            int i33 = i32 % 2;
            return false;
        }
    }

    public static final class aXn {
        private static int a = 0;
        private static int b = 1;

        public static String[] b(View view) {
            int i = 2 % 2;
            int i2 = a + 26;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            String[] receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            int i5 = a + 117;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return receiveContentMimeTypes;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void d(View view, String[] strArr, InterfaceC0286o interfaceC0286o) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 81;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (interfaceC0286o != null) {
                view.setOnReceiveContentListener(strArr, new aXk(interfaceC0286o));
                int i5 = b;
                int i6 = (((i5 ^ 87) | (i5 & 87)) << 1) - (((~i5) & 87) | (i5 & (-88)));
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i7 = i2 ^ 105;
            int i8 = (i2 & 105) << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                view.setOnReceiveContentListener(strArr, null);
                obj.hashCode();
                throw null;
            }
            view.setOnReceiveContentListener(strArr, null);
            int i10 = b + 71;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static h c(View view, h hVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
            int i4 = -(((~i2) & 13) | (i2 & (-14)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                hVar.c.e();
                obj.hashCode();
                throw null;
            }
            ContentInfo contentInfoE = hVar.c.e();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoE);
            if (contentInfoPerformReceiveContent == null) {
                int i6 = a + 38;
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (contentInfoPerformReceiveContent == contentInfoE) {
                int i8 = b;
                int i9 = ((i8 & 108) + (i8 | 108)) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    return hVar;
                }
                obj.hashCode();
                throw null;
            }
            h hVar2 = new h(new h.aWq(contentInfoPerformReceiveContent));
            int i10 = a;
            int i11 = i10 & 113;
            int i12 = ((((i10 ^ 113) | i11) << 1) - (~(-((i10 | 113) & (~i11))))) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 60 / 0;
            }
            return hVar2;
        }
    }

    static {
        new AtomicInteger(1);
        c = null;
        e = false;
        f = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        h = new J() { // from class: ivas.gov.bisp.enumeration.d.N
            private static int a = 0;
            private static int b = 1;

            static {
                int i = b;
                int i2 = i & 69;
                int i3 = ((i | 69) & (~i2)) + (i2 << 1);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 63 / 0;
                }
            }

            @Override // ivas.gov.bisp.enumeration.p081d.J
            public final h b(h hVar) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    WeakHashMap<View, R> weakHashMap = T.c;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                WeakHashMap<View, R> weakHashMap2 = T.c;
                int i4 = b;
                int i5 = (i4 & (-60)) | ((~i4) & 59);
                int i6 = -(-((i4 & 59) << 1));
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                int i8 = i7 % 2;
                return hVar;
            }
        };
        aWV awv = new aWV();
        int i = a;
        int i2 = ((i ^ 22) + ((i & 22) << 1)) - 1;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            g = awv;
            int i3 = 5 / 0;
        } else {
            g = awv;
        }
        int i4 = i + 119;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public static R d(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = -(-((i2 ^ 73) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
            if (c == null) {
                c = new WeakHashMap<>();
                int i7 = a + 57;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } else if (c == null) {
            c = new WeakHashMap<>();
            int i9 = a + 57;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        R r = c.get(view);
        int i11 = b;
        int i12 = i11 & 69;
        int i13 = ((((i11 ^ 69) | i12) << 1) - (~(-((i11 | 69) & (~i12))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        Object obj = null;
        if (r == null) {
            r = new R(view);
            c.put(view, r);
            int i15 = b;
            int i16 = ((i15 | 89) << 1) - (i15 ^ 89);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i17 = a;
        int i18 = i17 & 91;
        int i19 = (i17 | 91) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            return r;
        }
        throw null;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = aXm.c;
        aXm axm = (aXm) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (axm == null) {
            axm = new aXm();
            view.setTag(R.id.tag_unhandled_key_event_manager, axm);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = axm.d;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = aXm.c;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (axm.d == null) {
                        axm.d = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size = (-2) - (size ^ (-1));
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = aXm.c;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            axm.d.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                axm.d.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewC = axm.c(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                if (axm.e == null) {
                    axm.e = new SparseArray<>();
                }
                axm.e.put(keyCode, new WeakReference<>(viewC));
            }
        }
        return viewC != null;
    }

    public static List<al.aXC> j(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
            int i7 = a + 115;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = a;
        int i10 = i9 & 1;
        int i11 = (((i9 ^ 1) | i10) << 1) - ((i9 | 1) & (~i10));
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 45 / 0;
        }
        return arrayList;
    }

    public static am l(View view, am amVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 ^ 47) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        WindowInsets windowInsetsL = amVar.l();
        if (windowInsetsL != null) {
            int i7 = b;
            int i8 = (i7 ^ 87) + ((i7 & 87) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            WindowInsets windowInsetsC = aXd.c(view, windowInsetsL);
            if (!windowInsetsC.equals(windowInsetsL)) {
                int i10 = a;
                int i11 = i10 & 5;
                int i12 = i11 + ((i10 ^ 5) | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                am amVarD = am.d(windowInsetsC, view);
                int i14 = b;
                int i15 = i14 ^ 41;
                int i16 = (i14 & 41) << 1;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                return amVarD;
            }
        }
        int i19 = b + 19;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            return amVar;
        }
        throw null;
    }

    public static void n(View view, al.aXC axc, CharSequence charSequence, n nVar) {
        int i = 2 % 2;
        al.aXC axc2 = new al.aXC(null, axc.l, null, nVar, axc.m);
        int i2 = a;
        int i3 = ((((i2 ^ 3) | (i2 & 3)) << 1) - (~(-(((~i2) & 3) | (i2 & (-4)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        c(view, axc2);
        int i5 = b;
        int i6 = ((i5 | 65) << 1) - (i5 ^ 65);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    public static void o(int i, View view) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 47) | (i3 & 47)) << 1;
        int i5 = -(((~i3) & 47) | (i3 & (-48)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        List<al.aXC> listJ = j(view);
        int i8 = b;
        int i9 = i8 & 85;
        int i10 = (i8 ^ 85) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < listJ.size()) {
            int i14 = a + 57;
            b = i14 % 128;
            int i15 = i14 % 2;
            if (listJ.get(i13).e() == i) {
                int i16 = b;
                int i17 = (i16 & 5) + (i16 | 5);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    listJ.remove(i13);
                    int i18 = 59 / 0;
                } else {
                    listJ.remove(i13);
                }
                int i19 = a + 95;
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 74 / 0;
                    return;
                }
                return;
            }
            i13 = (i13 | 1) + (i13 & 1);
            int i21 = a;
            int i22 = (((i21 | 20) << 1) - (i21 ^ 20)) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = b;
        int i25 = (i24 | 9) << 1;
        int i26 = -(i24 ^ 9);
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        a = i27 % 128;
        int i28 = i27 % 2;
    }

    public static abstract class aWM<T> {
        private static int a = 0;
        private static int b = 1;
        public final int c;
        public final Class<T> d;
        public final int e;
        public final int f;

        public aWM(int i, Class<T> cls, int i2) {
            this.c = i;
            this.d = cls;
            this.f = 0;
            this.e = i2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005b  */
        /* JADX WARN: Code duplicated, block: B:24:0x00af  */
        public boolean d(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 103) | (i2 & 103)) << 1;
            int i4 = -((i2 & (-104)) | ((~i2) & 103));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            if (bool != null) {
                int i7 = i2 ^ 35;
                int i8 = (i2 & 35) << 1;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    bool.booleanValue();
                    throw null;
                }
                if (bool.booleanValue()) {
                    int i10 = b;
                    int i11 = ((i10 ^ 119) - (~(-(-((i10 & 119) << 1))))) - 1;
                    int i12 = i11 % 128;
                    a = i12;
                    int i13 = i11 % 2;
                    int i14 = (i12 ^ 31) + ((i12 & 31) << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    int i16 = a;
                    int i17 = (i16 | 7) << 1;
                    int i18 = -(i16 ^ 7);
                    int i19 = (i17 & i18) + (i18 | i17);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    z = false;
                }
            } else {
                int i110 = a;
                int i111 = (i110 | 7) << 1;
                int i112 = -(i110 ^ 7);
                int i113 = (i111 & i112) + (i112 | i111);
                b = i113 % 128;
                int i21 = i113 % 2;
                z = false;
            }
            if (bool2 != null) {
                int i22 = b;
                int i23 = (i22 & (-36)) | ((~i22) & 35);
                int i24 = -(-((i22 & 35) << 1));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    bool2.booleanValue();
                    obj.hashCode();
                    throw null;
                }
                if (!bool2.booleanValue()) {
                    int i26 = b;
                    int i27 = i26 & 111;
                    int i28 = (i26 ^ 111) | i27;
                    int i29 = (i27 & i28) + (i28 | i27);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    int i31 = a;
                    int i32 = (((i31 & (-114)) | ((~i31) & 113)) - (~(-(-((i31 & 113) << 1))))) - 1;
                    b = i32 % 128;
                    if (i32 % 2 != 0) {
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                int i210 = b;
                int i211 = i210 & 111;
                int i212 = (i210 ^ 111) | i211;
                int i213 = (i211 & i212) + (i212 | i211);
                a = i213 % 128;
                int i33 = i213 % 2;
                z2 = false;
            }
            if (z != z2) {
                int i34 = b;
                int i35 = (i34 & 119) + (i34 | 119);
                int i36 = i35 % 128;
                a = i36;
                z3 = i35 % 2 != 0;
                int i37 = i36 + 123;
                b = i37 % 128;
                if (i37 % 2 == 0) {
                    int i38 = 2 / 3;
                }
            } else {
                z3 = true;
            }
            int i39 = b;
            int i40 = i39 & 119;
            int i41 = (((i39 ^ 119) | i40) << 1) - ((i39 | 119) & (~i40));
            a = i41 % 128;
            int i42 = i41 % 2;
            return z3;
        }

        public abstract T e(View view);

        public abstract void f(View view, T t);

        public abstract boolean h(T t, T t2);

        public void i(View view, T t) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-68)) | ((~i2) & 67)) + ((i2 & 67) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (Build.VERSION.SDK_INT >= this.e) {
                int i5 = a;
                int i6 = i5 ^ 17;
                int i7 = ((i5 & 17) | i6) << 1;
                int i8 = -i6;
                int i9 = (i7 & i8) + (i7 | i8);
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                int i12 = i10 ^ 59;
                int i13 = -(-((i10 & 59) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    f(view, t);
                    int i15 = 78 / 0;
                } else {
                    f(view, t);
                }
                int i16 = a;
                int i17 = i16 & 43;
                int i18 = (i16 ^ 43) | i17;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                return;
            }
            int i21 = a;
            int i22 = (i21 | 97) << 1;
            int i23 = -(((~i21) & 97) | (i21 & (-98)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
            if (h(g(view), t)) {
                int i26 = a;
                int i27 = (i26 & 83) + (i26 | 83);
                b = i27 % 128;
                int i28 = i27 % 2;
                C0283j c0283jH = T.h(view);
                if (c0283jH == null) {
                    c0283jH = new C0283j();
                    int i29 = a;
                    int i30 = i29 & 19;
                    int i31 = (i30 - (~(-(-((i29 ^ 19) | i30))))) - 1;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                }
                T.q(view, c0283jH);
                view.setTag(this.c, t);
                int i33 = b;
                int i34 = ((((i33 ^ 101) | (i33 & 101)) << 1) - (~(-(((~i33) & 101) | (i33 & (-102)))))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                T.k(view, this.f);
                int i36 = a;
                int i37 = ((i36 | 117) << 1) - (i36 ^ 117);
                b = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = a;
            int i40 = i39 & 69;
            int i41 = (i39 | 69) & (~i40);
            int i42 = -(-(i40 << 1));
            int i43 = (i41 & i42) + (i41 | i42);
            b = i43 % 128;
            if (i43 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public T g(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 87;
            int i4 = (i3 - (~(-(-((i2 ^ 87) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (Build.VERSION.SDK_INT >= this.e) {
                int i6 = b;
                int i7 = i6 + 43;
                a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 101;
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = (i6 & (-98)) | ((~i6) & 97);
                int i12 = (i6 & 97) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                T tE = e(view);
                int i15 = b;
                int i16 = ((i15 | 99) << 1) - (i15 ^ 99);
                a = i16 % 128;
                int i17 = i16 % 2;
                return tE;
            }
            int i18 = b;
            int i19 = (i18 & (-84)) | ((~i18) & 83);
            int i20 = (i18 & 83) << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            T t = (T) view.getTag(this.c);
            Class<T> cls = this.d;
            int i23 = a;
            int i24 = (i23 & 55) + (i23 | 55);
            b = i24 % 128;
            int i25 = i24 % 2;
            if (!cls.isInstance(t)) {
                int i26 = b;
                int i27 = i26 & 101;
                int i28 = -(-((i26 ^ 101) | i27));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
                return null;
            }
            int i31 = a;
            int i32 = (i31 & (-10)) | ((~i31) & 9);
            int i33 = -(-((i31 & 9) << 1));
            int i34 = (i32 & i33) + (i32 | i33);
            b = i34 % 128;
            int i35 = i34 % 2;
            int i36 = i31 & 73;
            int i37 = -(-((i31 ^ 73) | i36));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            b = i38 % 128;
            int i39 = i38 % 2;
            return t;
        }

        public aWM(int i, Class<T> cls, int i2, int i3) {
            this.c = i;
            this.d = cls;
            this.f = i2;
            this.e = i3;
        }
    }

    public static class aXh {
        private static int a = 1;
        private static int b;

        public static void b(View view, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 69) << 1) - (i2 ^ 69);
            a = i3 % 128;
            int i4 = i3 % 2;
            view.setScreenReaderFocusable(z);
            int i5 = a;
            int i6 = ((i5 ^ 55) - (~(-(-((i5 & 55) << 1))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        public static void c(View view, final aXl axl) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 93) | (i2 & 93)) << 1;
            int i4 = -(((~i2) & 93) | (i2 & (-94)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            t tVar = (t) view.getTag(R.id.tag_unhandled_key_listeners);
            if (tVar == null) {
                tVar = new t();
                view.setTag(R.id.tag_unhandled_key_listeners, tVar);
                int i7 = a;
                int i8 = (i7 ^ 125) + ((i7 & 125) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
            Objects.requireNonNull(axl);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: ivas.gov.bisp.enumeration.d.S
                private static int a = 0;
                private static int b = 1;

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    int i10 = 2 % 2;
                    int i11 = a;
                    int i12 = i11 & 45;
                    int i13 = (i11 | 45) & (~i12);
                    int i14 = -(-(i12 << 1));
                    int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    boolean zOnUnhandledKeyEvent = axl.onUnhandledKeyEvent(view2, keyEvent);
                    int i17 = a;
                    int i18 = (i17 & (-54)) | ((~i17) & 53);
                    int i19 = -(-((i17 & 53) << 1));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        return zOnUnhandledKeyEvent;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            int i10 = b + 31;
            a = i10 % 128;
            int i11 = i10 % 2;
            tVar.put(axl, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            int i12 = b;
            int i13 = i12 & 73;
            int i14 = (((i12 | 73) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 28 / 0;
            }
        }

        public static CharSequence d(View view) {
            CharSequence accessibilityPaneTitle;
            int i = 2 % 2;
            int i2 = a + 65;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                accessibilityPaneTitle = view.getAccessibilityPaneTitle();
                int i3 = 3 / 0;
            } else {
                accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            }
            int i4 = b;
            int i5 = i4 ^ 73;
            int i6 = (i4 & 73) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            return accessibilityPaneTitle;
        }

        public static boolean e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 89) | (i2 & 89)) << 1) - (~(-(((~i2) & 89) | (i2 & (-90)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsAccessibilityHeading = view.isAccessibilityHeading();
            int i5 = a;
            int i6 = (i5 & (-86)) | ((~i5) & 85);
            int i7 = (i5 & 85) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 28 / 0;
            }
            return zIsAccessibilityHeading;
        }

        public static boolean f(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 55;
            int i4 = i3 + ((i2 ^ 55) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsScreenReaderFocusable = view.isScreenReaderFocusable();
            int i6 = a;
            int i7 = ((i6 ^ 57) | (i6 & 57)) << 1;
            int i8 = -(((~i6) & 57) | (i6 & (-58)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return zIsScreenReaderFocusable;
            }
            throw null;
        }

        public static <T> T g(View view, int i) {
            int i2 = 2 % 2;
            int i3 = b + 64;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return (T) view.requireViewById(i);
            }
            view.requireViewById(i);
            throw null;
        }

        public static void i(View view, boolean z) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
            b = i3 % 128;
            int i4 = i3 % 2;
            view.setAccessibilityHeading(z);
            int i5 = b;
            int i6 = (i5 & 48) + (i5 | 48);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
        }

        public static void j(View view, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 117) - (~(-(-((i2 & 117) << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                view.setAccessibilityPaneTitle(charSequence);
                throw null;
            }
            view.setAccessibilityPaneTitle(charSequence);
            int i4 = a;
            int i5 = i4 & 103;
            int i6 = -(-(i4 | 103));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        public static void h(View view, aXl axl) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 75;
            int i4 = ((((i2 & 75) | i3) << 1) - (~(-i3))) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            t tVar = (t) view.getTag(R.id.tag_unhandled_key_listeners);
            if (tVar == null) {
                int i5 = b;
                int i6 = (i5 & 69) + (i5 | 69);
                a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) tVar.getOrDefault(axl, null);
            if (onUnhandledKeyEventListener != null) {
                int i8 = b + 81;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                    int i9 = 5 / 0;
                } else {
                    view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                }
                int i10 = a;
                int i11 = (i10 & (-20)) | ((~i10) & 19);
                int i12 = -(-((i10 & 19) << 1));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = a;
            int i16 = i15 & 57;
            int i17 = -(-((i15 ^ 57) | i16));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    public static String[] b(View view) {
        String[] strArrB;
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 31) {
            String[] strArr = (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
            int i4 = a;
            int i5 = i4 & 23;
            int i6 = (i5 - (~(-(-((i4 ^ 23) | i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return strArr;
        }
        int i8 = b;
        int i9 = ((i8 ^ 76) + ((i8 & 76) << 1)) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            strArrB = aXn.b(view);
            int i10 = 73 / 0;
        } else {
            strArrB = aXn.b(view);
        }
        int i11 = a + 119;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return strArrB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void p(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 83) + (i4 | 83);
        b = i5 % 128;
        if (i5 % 2 != 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 39) {
            aXi.d(view, context, iArr, attributeSet, typedArray, i, i2);
            int i6 = a;
            int i7 = i6 & 27;
            int i8 = i6 | 27;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (-2) - ((((i11 | 76) << 1) - (i11 ^ 76)) ^ (-1));
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 5 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static void q(View view, C0283j c0283j) {
        View.AccessibilityDelegate accessibilityDelegate;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = i3 + ((i2 ^ 21) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
            if (c0283j == null) {
                if (g(view) instanceof C0283j.aWk) {
                    c0283j = new C0283j();
                    int i6 = b;
                    int i7 = i6 ^ 27;
                    int i8 = ((((i6 & 27) | i7) << 1) - (~(-i7))) - 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else if (c0283j == null) {
            if (g(view) instanceof C0283j.aWk) {
                c0283j = new C0283j();
                int i10 = b;
                int i11 = i10 ^ 27;
                int i12 = ((((i10 & 27) | i11) << 1) - (~(-i11))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        Object obj = null;
        if (c0283j == null) {
            int i14 = b;
            int i15 = ((i14 & 43) - (~(-(-(i14 | 43))))) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 68 / 0;
            }
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = c0283j.e;
            int i17 = b;
            int i18 = (i17 ^ 86) + ((i17 & 86) << 1);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
        int i21 = a;
        int i22 = ((i21 ^ 102) + ((i21 & 102) << 1)) - 1;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static class aXb {
        private static int a = 0;
        private static int b = 1;

        public static boolean A(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & 44) + (i3 | 44)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zStartNestedScroll = view.startNestedScroll(i);
            int i6 = b;
            int i7 = (((i6 & (-18)) | ((~i6) & 17)) - (~((i6 & 17) << 1))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return zStartNestedScroll;
        }

        public static float b(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 103;
            int i4 = (i2 ^ 103) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            float elevation = view.getElevation();
            int i7 = b;
            int i8 = ((i7 | 79) << 1) - (i7 ^ 79);
            a = i8 % 128;
            int i9 = i8 % 2;
            return elevation;
        }

        public static void c(WindowInsets windowInsets, View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 99;
            int i4 = -(-((i2 ^ 99) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                int i7 = b;
                int i8 = i7 & 95;
                int i9 = (i7 ^ 95) | i8;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
                int i12 = b;
                int i13 = (i12 & (-66)) | ((~i12) & 65);
                int i14 = (i12 & 65) << 1;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = b + 101;
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        public static boolean e(View view, float f, float f2, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 91;
            int i4 = (i2 ^ 91) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            boolean zDispatchNestedFling = view.dispatchNestedFling(f, f2, z);
            int i7 = b;
            int i8 = (i7 ^ 75) + ((i7 & 75) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 35 / 0;
            }
            return zDispatchNestedFling;
        }

        public static boolean f(View view, float f, float f2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean zDispatchNestedPreFling = view.dispatchNestedPreFling(f, f2);
            int i5 = b;
            int i6 = (i5 ^ 63) + ((i5 & 63) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 28 / 0;
            }
            return zDispatchNestedPreFling;
        }

        public static boolean g(View view, int i, int i2, int i3, int i4, int[] iArr) {
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = (i6 & (-26)) | ((~i6) & 25);
            int i8 = (i6 & 25) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            boolean zDispatchNestedScroll = view.dispatchNestedScroll(i, i2, i3, i4, iArr);
            if (i10 == 0) {
                int i11 = 97 / 0;
            }
            return zDispatchNestedScroll;
        }

        public static boolean h(View view, int i, int i2, int[] iArr, int[] iArr2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 & (-26)) | ((~i4) & 25);
            int i6 = -(-((i4 & 25) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            boolean zDispatchNestedPreScroll = view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
            int i9 = b;
            int i10 = i9 & 57;
            int i11 = -(-(i9 | 57));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return zDispatchNestedPreScroll;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static ColorStateList i(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 50) + ((i2 & 50) << 1)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int i5 = a;
            int i6 = i5 & 59;
            int i7 = (((i5 ^ 59) | i6) << 1) - ((i5 | 59) & (~i6));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return backgroundTintList;
            }
            throw null;
        }

        public static PorterDuff.Mode j(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            b = i3 % 128;
            int i4 = i3 % 2;
            PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
            int i5 = b;
            int i6 = i5 & 77;
            int i7 = (i6 - (~((i5 ^ 77) | i6))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return backgroundTintMode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static String l(View view) {
            int i = 2 % 2;
            int i2 = a + 107;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return view.getTransitionName();
            }
            view.getTransitionName();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static float m(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 59) | (i2 & 59)) << 1) - (~(-(((~i2) & 59) | (i2 & (-60)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            float translationZ = view.getTranslationZ();
            int i5 = b;
            int i6 = (i5 & (-116)) | ((~i5) & 115);
            int i7 = (i5 & 115) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return translationZ;
        }

        public static boolean n(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 39;
            int i4 = (i2 & 39) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            boolean zHasNestedScrollingParent = view.hasNestedScrollingParent();
            if (i6 != 0) {
                int i7 = 10 / 0;
            }
            int i8 = b;
            int i9 = (i8 | 17) << 1;
            int i10 = -(((~i8) & 17) | (i8 & (-18)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return zHasNestedScrollingParent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static float o(View view) {
            int i = 2 % 2;
            int i2 = b + 45;
            a = i2 % 128;
            int i3 = i2 % 2;
            float z = view.getZ();
            int i4 = b;
            int i5 = i4 & 51;
            int i6 = (i4 ^ 51) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }

        public static boolean p(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 7;
            int i4 = i3 + ((i2 ^ 7) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsImportantForAccessibility = view.isImportantForAccessibility();
            if (i5 != 0) {
                int i6 = 65 / 0;
            }
            int i7 = a;
            int i8 = i7 & 3;
            int i9 = (i8 - (~(-(-((i7 ^ 3) | i8))))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 58 / 0;
            }
            return zIsImportantForAccessibility;
        }

        public static boolean q(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-100)) | ((~i2) & 99);
            int i4 = -(-((i2 & 99) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return view.isNestedScrollingEnabled();
            }
            view.isNestedScrollingEnabled();
            throw null;
        }

        public static void r(View view, PorterDuff.Mode mode) {
            int i = 2 % 2;
            int i2 = a + 85;
            b = i2 % 128;
            int i3 = i2 % 2;
            view.setBackgroundTintMode(mode);
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
        }

        public static void s(View view, ColorStateList colorStateList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 9;
            int i4 = -(-((i2 ^ 9) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            view.setBackgroundTintList(colorStateList);
            int i7 = b;
            int i8 = i7 & 99;
            int i9 = (i7 | 99) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public static void t(View view, float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-104)) | ((~i2) & 103);
            int i4 = (i2 & 103) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                view.setElevation(f);
                return;
            }
            view.setElevation(f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void u(View view, float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-2)) | ((~i2) & 1)) - (~((i2 & 1) << 1))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            view.setZ(f);
            if (i4 == 0) {
                throw null;
            }
            int i5 = a;
            int i6 = i5 ^ 43;
            int i7 = ((((i5 & 43) | i6) << 1) - (~(-i6))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 45 / 0;
            }
        }

        public static void v(View view, InterfaceC0282a interfaceC0282a) {
            int i = 2 % 2;
            int i2 = a + 39;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (Build.VERSION.SDK_INT < 30) {
                int i4 = b;
                int i5 = i4 & 39;
                int i6 = i5 + ((i4 ^ 39) | i5);
                a = i6 % 128;
                int i7 = i6 % 2;
                view.setTag(R.id.tag_on_apply_window_listener, interfaceC0282a);
                int i8 = a;
                int i9 = (i8 & 31) + (i8 | 31);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 % 2;
                }
            }
            if (interfaceC0282a != null) {
                view.setOnApplyWindowInsetsListener(new aXc(view, interfaceC0282a));
                int i11 = b;
                int i12 = i11 & 25;
                int i13 = i12 + ((i11 ^ 25) | i12);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i14 = a;
            int i15 = i14 & 79;
            int i16 = (i14 ^ 79) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
                throw null;
            }
        }

        public static void w(View view, boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 39;
            int i4 = ((i2 & 39) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.setNestedScrollingEnabled(z);
            if (i7 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void x(View view, String str) {
            int i = 2 % 2;
            int i2 = b + 39;
            a = i2 % 128;
            int i3 = i2 % 2;
            view.setTransitionName(str);
            int i4 = b;
            int i5 = i4 & 49;
            int i6 = i5 + ((i4 ^ 49) | i5);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 9 / 0;
            }
        }

        public static void y(View view, float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 117;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 117)) & i3);
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            view.setTranslationZ(f);
            if (i7 != 0) {
                throw null;
            }
        }

        public static void z(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-58)) | ((~i2) & 57)) - (~(-(-((i2 & 57) << 1))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            view.stopNestedScroll();
            if (i4 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static am d(View view, am amVar, Rect rect) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 40) ^ (-1));
            a = i2 % 128;
            if (i2 % 2 != 0) {
                amVar.l();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            WindowInsets windowInsetsL = amVar.l();
            if (windowInsetsL == null) {
                rect.setEmpty();
                int i3 = b + 66;
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 78 / 0;
                }
                return amVar;
            }
            am amVarD = am.d(view.computeSystemWindowInsets(windowInsetsL, rect), view);
            int i6 = b;
            int i7 = i6 & 41;
            int i8 = -(-((i6 ^ 41) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return amVarD;
        }

        public class aXc implements View.OnApplyWindowInsetsListener {
            private static int a = 1;
            private static int b;
            public am c = null;
            public final /* synthetic */ View d;
            public final /* synthetic */ InterfaceC0282a e;

            public aXc(View view, InterfaceC0282a interfaceC0282a) {
                this.d = view;
                this.e = interfaceC0282a;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                am amVarD;
                int i;
                am amVar;
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 23;
                int i5 = ((i3 | 23) & (~i4)) + (i4 << 1);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    amVarD = am.d(windowInsets, view);
                    i = Build.VERSION.SDK_INT;
                    int i6 = 46 / 0;
                } else {
                    amVarD = am.d(windowInsets, view);
                    i = Build.VERSION.SDK_INT;
                }
                int i7 = a + 35;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                if (i < 30) {
                    int i10 = i8 + 79;
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        aXb.c(windowInsets, this.d);
                        amVar = this.c;
                        int i11 = 97 / 0;
                    } else {
                        aXb.c(windowInsets, this.d);
                        amVar = this.c;
                    }
                    int i12 = a + 65;
                    b = i12 % 128;
                    if (i12 % 2 != 0) {
                        amVarD.equals(amVar);
                        throw null;
                    }
                    if (amVarD.equals(amVar)) {
                        int i13 = a;
                        int i14 = i13 & 27;
                        int i15 = i13 | 27;
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        am amVarB = this.e.b(view, amVarD);
                        if (i17 != 0) {
                            int i18 = 94 / 0;
                        }
                        WindowInsets windowInsetsL = amVarB.l();
                        int i19 = a;
                        int i20 = (i19 & (-116)) | ((~i19) & 115);
                        int i21 = (i19 & 115) << 1;
                        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                        return windowInsetsL;
                    }
                }
                this.c = amVarD;
                am amVarB2 = this.e.b(view, amVarD);
                int i24 = a;
                int i25 = ((i24 ^ 6) + ((i24 & 6) << 1)) - 1;
                b = i25 % 128;
                if (i25 % 2 == 0 ? i >= 30 : i >= 75) {
                    WindowInsets windowInsetsL2 = amVarB2.l();
                    int i26 = b;
                    int i27 = i26 ^ 27;
                    int i28 = ((i26 & 27) | i27) << 1;
                    int i29 = -i27;
                    int i30 = (i28 & i29) + (i28 | i29);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    return windowInsetsL2;
                }
                WeakHashMap<View, R> weakHashMap = T.c;
                aXd.d(view);
                WindowInsets windowInsetsL3 = amVarB2.l();
                int i32 = a;
                int i33 = i32 & 37;
                int i34 = (((i32 ^ 37) | i33) << 1) - ((i32 | 37) & (~i33));
                b = i34 % 128;
                int i35 = i34 % 2;
                return windowInsetsL3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003a  */
        /* JADX WARN: Code duplicated, block: B:15:0x0053  */
        /* JADX WARN: Code duplicated, block: B:20:0x0079  */
        /* JADX WARN: Code duplicated, block: B:22:0x008c  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: IllegalAccessException -> 0x01aa, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ae A[Catch: IllegalAccessException -> 0x01aa, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ce A[PHI: r5
  0x00ce: PHI (r5v15 int) = (r5v14 int), (r5v20 int) binds: [B:28:0x00ac, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d2 A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e1 A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:42:0x010c A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:48:0x011c A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0175 A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0185 A[Catch: IllegalAccessException -> 0x01aa, TRY_ENTER, TryCatch #2 {IllegalAccessException -> 0x01aa, blocks: (B:12:0x003e, B:16:0x005e, B:18:0x0071, B:24:0x00a1, B:29:0x00ae, B:39:0x00ef, B:42:0x010c, B:44:0x0117, B:50:0x013c, B:52:0x0157, B:55:0x0175, B:57:0x0180, B:62:0x018e, B:61:0x0185, B:48:0x011c, B:35:0x00d2, B:37:0x00e1, B:27:0x00a8), top: B:73:0x003e }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01af  */
        public static am k(View view) {
            Object obj;
            int i;
            Rect rect;
            Rect rect2;
            int i2;
            int i3;
            int i4;
            am.aWz awa;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            am amVarE;
            int i10;
            int i11 = 2 % 2;
            int i12 = b;
            int i13 = i12 & 93;
            int i14 = -(-((i12 ^ 93) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            am amVar = null;
            if (am.aWy.f) {
                int i17 = b + 73;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 16 / 0;
                    if (!(!view.isAttachedToWindow())) {
                        try {
                            obj = am.aWy.c.get(view.getRootView());
                            int i19 = b;
                            int i20 = ((i19 & 62) + (i19 | 62)) - 1;
                            i = i20 % 128;
                            a = i;
                            int i21 = i20 % 2;
                            if (obj != null) {
                                int i22 = (i ^ 83) + ((i & 83) << 1);
                                b = i22 % 128;
                                int i23 = i22 % 2;
                                rect = (Rect) am.aWy.d.get(obj);
                                Field field = am.aWy.e;
                                int i24 = a + 81;
                                b = i24 % 128;
                                int i25 = i24 % 2;
                                rect2 = (Rect) field.get(obj);
                                if (rect != null) {
                                    i2 = b;
                                    int i26 = i2 & 43;
                                    int i27 = (i26 - (~(-(-((i2 ^ 43) | i26))))) - 1;
                                    a = i27 % 128;
                                    int i28 = i27 % 2;
                                    if (rect2 != null) {
                                        int i29 = i2 & 9;
                                        i3 = ((((i2 ^ 9) | i29) << 1) - (~(-((i2 | 9) & (~i29))))) - 1;
                                        a = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            i4 = Build.VERSION.SDK_INT;
                                            if (i4 >= 51) {
                                                awa = new am.aWC();
                                                int i30 = a;
                                                i10 = (((i30 & (-38)) | ((~i30) & 37)) - (~(-(-((i30 & 37) << 1))))) - 1;
                                                b = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    int i31 = 3 % 5;
                                                }
                                            } else if (i4 >= 29) {
                                                awa = new am.aWB();
                                                int i32 = b + 101;
                                                a = i32 % 128;
                                                int i33 = i32 % 2;
                                            } else {
                                                awa = new am.aWA();
                                                int i34 = b + 123;
                                                a = i34 % 128;
                                                int i35 = i34 % 2;
                                            }
                                        } else {
                                            i4 = Build.VERSION.SDK_INT;
                                            if (i4 >= 30) {
                                                awa = new am.aWC();
                                                int i36 = a;
                                                i10 = (((i36 & (-38)) | ((~i36) & 37)) - (~(-(-((i36 & 37) << 1))))) - 1;
                                                b = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    int i37 = 3 % 5;
                                                }
                                            } else if (i4 >= 29) {
                                                awa = new am.aWB();
                                                int i38 = b + 101;
                                                a = i38 % 128;
                                                int i39 = i38 % 2;
                                            } else {
                                                awa = new am.aWA();
                                                int i310 = b + 123;
                                                a = i310 % 128;
                                                int i311 = i310 % 2;
                                            }
                                        }
                                        i5 = rect.left;
                                        i6 = rect.top;
                                        i7 = rect.right;
                                        int i40 = b;
                                        int i41 = i40 & 41;
                                        int i42 = (i40 | 41) & (~i41);
                                        int i43 = -(-(i41 << 1));
                                        i8 = (i42 ^ i43) + ((i42 & i43) << 1);
                                        a = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            awa.f(c.c(i5, i6, i7, rect.bottom));
                                            int i44 = 93 / 0;
                                        } else {
                                            awa.f(c.c(i5, i6, i7, rect.bottom));
                                        }
                                        int i45 = b;
                                        int i46 = i45 & 19;
                                        int i47 = ((i45 ^ 19) | i46) << 1;
                                        int i48 = -((i45 | 19) & (~i46));
                                        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                                        a = i49 % 128;
                                        int i50 = i49 % 2;
                                        int i51 = rect2.left;
                                        int i52 = rect2.top;
                                        int i53 = rect2.right;
                                        int i54 = b;
                                        int i55 = (i54 & (-48)) | ((~i54) & 47);
                                        int i56 = (i54 & 47) << 1;
                                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                        a = i57 % 128;
                                        int i58 = i57 % 2;
                                        awa.g(c.c(i51, i52, i53, rect2.bottom));
                                        int i59 = b;
                                        int i60 = i59 & 119;
                                        i9 = (((i59 | 119) & (~i60)) - (~(-(-(i60 << 1))))) - 1;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            amVarE = awa.e();
                                            amVarE.d.p(amVarE);
                                            int i61 = 12 / 0;
                                        } else {
                                            amVarE = awa.e();
                                            amVarE.d.p(amVarE);
                                        }
                                        amVarE.d.g(view.getRootView());
                                        int i62 = b;
                                        int i63 = ((i62 ^ 121) - (~(-(-((i62 & 121) << 1))))) - 1;
                                        a = i63 % 128;
                                        int i64 = i63 % 2;
                                        amVar = amVarE;
                                    }
                                }
                            }
                        } catch (IllegalAccessException e) {
                            e.getMessage();
                        }
                    } else {
                        int i65 = b;
                        int i66 = (i65 & (-36)) | ((~i65) & 35);
                        int i67 = -(-((i65 & 35) << 1));
                        int i68 = (i66 & i67) + (i67 | i66);
                        a = i68 % 128;
                        int i69 = i68 % 2;
                    }
                } else if (!(!view.isAttachedToWindow())) {
                    obj = am.aWy.c.get(view.getRootView());
                    int i110 = b;
                    int i210 = ((i110 & 62) + (i110 | 62)) - 1;
                    i = i210 % 128;
                    a = i;
                    int i211 = i210 % 2;
                    if (obj != null) {
                        int i212 = (i ^ 83) + ((i & 83) << 1);
                        b = i212 % 128;
                        int i213 = i212 % 2;
                        rect = (Rect) am.aWy.d.get(obj);
                        Field field2 = am.aWy.e;
                        int i214 = a + 81;
                        b = i214 % 128;
                        int i215 = i214 % 2;
                        rect2 = (Rect) field2.get(obj);
                        if (rect != null) {
                            i2 = b;
                            int i216 = i2 & 43;
                            int i217 = (i216 - (~(-(-((i2 ^ 43) | i216))))) - 1;
                            a = i217 % 128;
                            int i218 = i217 % 2;
                            if (rect2 != null) {
                                int i219 = i2 & 9;
                                i3 = ((((i2 ^ 9) | i219) << 1) - (~(-((i2 | 9) & (~i219))))) - 1;
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    i4 = Build.VERSION.SDK_INT;
                                    if (i4 >= 51) {
                                        awa = new am.aWC();
                                        int i312 = a;
                                        i10 = (((i312 & (-38)) | ((~i312) & 37)) - (~(-(-((i312 & 37) << 1))))) - 1;
                                        b = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            int i313 = 3 % 5;
                                        }
                                    } else if (i4 >= 29) {
                                        awa = new am.aWB();
                                        int i314 = b + 101;
                                        a = i314 % 128;
                                        int i315 = i314 % 2;
                                    } else {
                                        awa = new am.aWA();
                                        int i316 = b + 123;
                                        a = i316 % 128;
                                        int i317 = i316 % 2;
                                    }
                                } else {
                                    i4 = Build.VERSION.SDK_INT;
                                    if (i4 >= 30) {
                                        awa = new am.aWC();
                                        int i318 = a;
                                        i10 = (((i318 & (-38)) | ((~i318) & 37)) - (~(-(-((i318 & 37) << 1))))) - 1;
                                        b = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            int i319 = 3 % 5;
                                        }
                                    } else if (i4 >= 29) {
                                        awa = new am.aWB();
                                        int i3110 = b + 101;
                                        a = i3110 % 128;
                                        int i3111 = i3110 % 2;
                                    } else {
                                        awa = new am.aWA();
                                        int i3112 = b + 123;
                                        a = i3112 % 128;
                                        int i3113 = i3112 % 2;
                                    }
                                }
                                i5 = rect.left;
                                i6 = rect.top;
                                i7 = rect.right;
                                int i410 = b;
                                int i411 = i410 & 41;
                                int i412 = (i410 | 41) & (~i411);
                                int i413 = -(-(i411 << 1));
                                i8 = (i412 ^ i413) + ((i412 & i413) << 1);
                                a = i8 % 128;
                                if (i8 % 2 != 0) {
                                    awa.f(c.c(i5, i6, i7, rect.bottom));
                                    int i414 = 93 / 0;
                                } else {
                                    awa.f(c.c(i5, i6, i7, rect.bottom));
                                }
                                int i415 = b;
                                int i416 = i415 & 19;
                                int i417 = ((i415 ^ 19) | i416) << 1;
                                int i418 = -((i415 | 19) & (~i416));
                                int i419 = (i417 ^ i418) + ((i418 & i417) << 1);
                                a = i419 % 128;
                                int i510 = i419 % 2;
                                int i511 = rect2.left;
                                int i512 = rect2.top;
                                int i513 = rect2.right;
                                int i514 = b;
                                int i515 = (i514 & (-48)) | ((~i514) & 47);
                                int i516 = (i514 & 47) << 1;
                                int i517 = (i515 ^ i516) + ((i516 & i515) << 1);
                                a = i517 % 128;
                                int i518 = i517 % 2;
                                awa.g(c.c(i511, i512, i513, rect2.bottom));
                                int i519 = b;
                                int i610 = i519 & 119;
                                i9 = (((i519 | 119) & (~i610)) - (~(-(-(i610 << 1))))) - 1;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    amVarE = awa.e();
                                    amVarE.d.p(amVarE);
                                    int i611 = 12 / 0;
                                } else {
                                    amVarE = awa.e();
                                    amVarE.d.p(amVarE);
                                }
                                amVarE.d.g(view.getRootView());
                                int i612 = b;
                                int i613 = ((i612 ^ 121) - (~(-(-((i612 & 121) << 1))))) - 1;
                                a = i613 % 128;
                                int i614 = i613 % 2;
                                amVar = amVarE;
                            }
                        }
                    }
                } else {
                    int i615 = b;
                    int i616 = (i615 & (-36)) | ((~i615) & 35);
                    int i617 = -(-((i615 & 35) << 1));
                    int i618 = (i616 & i617) + (i617 | i616);
                    a = i618 % 128;
                    int i619 = i618 % 2;
                }
            }
            int i70 = b;
            int i71 = (i70 ^ 92) + ((i70 & 92) << 1);
            int i72 = (i71 ^ (-1)) + (i71 << 1);
            a = i72 % 128;
            int i73 = i72 % 2;
            return amVar;
        }
    }

    public static CharSequence i(View view) {
        Object tag;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (Build.VERSION.SDK_INT >= 28) {
            int i7 = b;
            int i8 = ((i7 | 73) << 1) - (i7 ^ 73);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i7 & 105) + (i7 | 105);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                tag = aXh.d(view);
                int i11 = 15 / 0;
            } else {
                tag = aXh.d(view);
            }
            int i12 = b;
            int i13 = i12 | 61;
            int i14 = i13 << 1;
            int i15 = -((~(i12 & 61)) & i13);
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = a;
            int i19 = i18 & 59;
            int i20 = (i18 | 59) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            int i24 = b;
            int i25 = i24 & 47;
            int i26 = ((i24 | 47) & (~i25)) + (i25 << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            if (!CharSequence.class.isInstance(tag)) {
                int i28 = a;
                int i29 = i28 & 111;
                int i30 = ((((i28 ^ 111) | i29) << 1) - (~(-((i28 | 111) & (~i29))))) - 1;
                int i31 = i30 % 128;
                b = i31;
                if (i30 % 2 == 0) {
                    throw null;
                }
                int i32 = i31 + 103;
                a = i32 % 128;
                int i33 = i32 % 2;
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        int i34 = b;
        int i35 = i34 & 43;
        int i36 = -(-(i34 | 43));
        int i37 = (i35 & i36) + (i36 | i35);
        a = i37 % 128;
        int i38 = i37 % 2;
        return charSequence;
    }

    public static class aXe {
        private static int a = 0;
        private static int b = 1;

        public static int c(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 61;
            int i4 = ((i2 & 61) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            int scrollIndicators = view.getScrollIndicators();
            int i8 = b;
            int i9 = i8 ^ 57;
            int i10 = (i8 & 57) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return scrollIndicators;
        }

        public static void d(View view, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & 60) + (i3 | 60)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            view.setScrollIndicators(i);
            int i6 = a;
            int i7 = i6 & 31;
            int i8 = (i6 | 31) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        }

        public static void e(View view, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b + 65;
            a = i4 % 128;
            int i5 = i4 % 2;
            view.setScrollIndicators(i, i2);
            if (i5 != 0) {
                int i6 = 21 / 0;
            }
            int i7 = a;
            int i8 = i7 & 29;
            int i9 = ((i7 ^ 29) | i8) << 1;
            int i10 = -((i7 | 29) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            if ((r3 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            r1 = r6 | 59;
            r3 = r1 << 1;
            r6 = -((~(r6 & 59)) & r1);
            r1 = (r3 & r6) + (r6 | r3);
            ivas.gov.bisp.enumeration.d.T.aXe.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            r1 = ivas.gov.bisp.enumeration.p081d.am.d(r1, null);
            r1.d.p(r1);
            r6 = r6.getRootView();
            r3 = ivas.gov.bisp.enumeration.d.T.aXe.a;
            r4 = (r3 ^ 107) + ((r3 & 107) << 1);
            ivas.gov.bisp.enumeration.d.T.aXe.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            if ((r4 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            r1.d.g(r6);
            r6 = ivas.gov.bisp.enumeration.d.T.aXe.a;
            r3 = (r6 & (-70)) | ((~r6) & 69);
            r6 = (r6 & 69) << 1;
            r4 = (r3 ^ r6) + ((r6 & r3) << 1);
            ivas.gov.bisp.enumeration.d.T.aXe.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
        
            if ((r4 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            r1.d.g(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            r6 = ivas.gov.bisp.enumeration.d.T.aXe.b;
            r1 = r6 | 19;
            r3 = (r1 << 1) - ((~(r6 & 19)) & r1);
            r6 = r3 % 128;
            ivas.gov.bisp.enumeration.d.T.aXe.a = r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static ivas.gov.bisp.enumeration.p081d.am b(android.view.View r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.d.T.aXe.b
                r2 = r1 ^ 86
                r1 = r1 & 86
                int r1 = r1 << 1
                int r2 = r2 + r1
                r1 = r2 ^ (-1)
                int r2 = r2 << 1
                int r1 = r1 + r2
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.d.T.aXe.a = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L24
                android.view.WindowInsets r1 = r6.getRootWindowInsets()
                r3 = 97
                int r3 = r3 / 0
                if (r1 != 0) goto L50
                goto L2a
            L24:
                android.view.WindowInsets r1 = r6.getRootWindowInsets()
                if (r1 != 0) goto L50
            L2a:
                int r6 = ivas.gov.bisp.enumeration.d.T.aXe.b
                r1 = r6 | 19
                int r3 = r1 << 1
                r6 = r6 & 19
                int r6 = ~r6
                r6 = r6 & r1
                int r3 = r3 - r6
                int r6 = r3 % 128
                ivas.gov.bisp.enumeration.d.T.aXe.a = r6
                int r3 = r3 % r0
                if (r3 != 0) goto L4f
                r1 = r6 | 59
                int r3 = r1 << 1
                r6 = r6 & 59
                int r6 = ~r6
                r6 = r6 & r1
                int r6 = -r6
                r1 = r3 & r6
                r6 = r6 | r3
                int r1 = r1 + r6
                int r6 = r1 % 128
                ivas.gov.bisp.enumeration.d.T.aXe.b = r6
                int r1 = r1 % r0
                return r2
            L4f:
                throw r2
            L50:
                ivas.gov.bisp.enumeration.d.am r1 = ivas.gov.bisp.enumeration.p081d.am.d(r1, r2)
                ivas.gov.bisp.enumeration.d.am$aWD r3 = r1.d
                r3.p(r1)
                android.view.View r6 = r6.getRootView()
                int r3 = ivas.gov.bisp.enumeration.d.T.aXe.a
                r4 = r3 ^ 107(0x6b, float:1.5E-43)
                r3 = r3 & 107(0x6b, float:1.5E-43)
                int r3 = r3 << 1
                int r4 = r4 + r3
                int r3 = r4 % 128
                ivas.gov.bisp.enumeration.d.T.aXe.b = r3
                int r4 = r4 % r0
                if (r4 == 0) goto L8d
                ivas.gov.bisp.enumeration.d.am$aWD r3 = r1.d
                r3.g(r6)
                int r6 = ivas.gov.bisp.enumeration.d.T.aXe.a
                r3 = r6 & (-70)
                int r4 = ~r6
                r5 = 69
                r4 = r4 & r5
                r3 = r3 | r4
                r6 = r6 & r5
                int r6 = r6 << 1
                r4 = r3 ^ r6
                r6 = r6 & r3
                int r6 = r6 << 1
                int r4 = r4 + r6
                int r6 = r4 % 128
                ivas.gov.bisp.enumeration.d.T.aXe.b = r6
                int r4 = r4 % r0
                if (r4 == 0) goto L8c
                return r1
            L8c:
                throw r2
            L8d:
                ivas.gov.bisp.enumeration.d.am$aWD r0 = r1.d
                r0.g(r6)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.d.T.aXe.b(android.view.View):ivas.gov.bisp.enumeration.d.am");
        }
    }

    public static am e(View view, am amVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        a = i3 % 128;
        int i4 = i3 % 2;
        WindowInsets windowInsetsL = amVar.l();
        Object obj = null;
        if (windowInsetsL != null) {
            int i5 = a;
            int i6 = (i5 & (-10)) | ((~i5) & 9);
            int i7 = -(-((i5 & 9) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            WindowInsets windowInsetsB = aXd.b(view, windowInsetsL);
            if (!windowInsetsB.equals(windowInsetsL)) {
                int i10 = b;
                int i11 = (i10 & (-58)) | ((~i10) & 57);
                int i12 = -(-((i10 & 57) << 1));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    am.d(windowInsetsB, view);
                    throw null;
                }
                am amVarD = am.d(windowInsetsB, view);
                int i14 = b;
                int i15 = (i14 & 61) + (i14 | 61);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    return amVarD;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i16 = b;
        int i17 = ((i16 & 68) + (i16 | 68)) - 1;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return amVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #0 {all -> 0x00b5, blocks: (B:23:0x0092, B:28:0x00ab, B:29:0x00b1), top: B:39:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:23:0x0092, B:28:0x00ab, B:29:0x00b1), top: B:39:0x0092 }] */
    public static View.AccessibilityDelegate g(View view) {
        Object obj;
        int i;
        View.AccessibilityDelegate accessibilityDelegate;
        Field declaredField;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = (i3 | 95) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i9 = b;
            int i10 = (i9 & 81) + (i9 | 81);
            a = i10 % 128;
            int i11 = i10 % 2;
            View.AccessibilityDelegate accessibilityDelegateB = aXi.b(view);
            int i12 = a;
            int i13 = (((i12 | 52) << 1) - (i12 ^ 52)) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 47 / 0;
            }
            return accessibilityDelegateB;
        }
        View.AccessibilityDelegate accessibilityDelegate2 = null;
        if (e) {
            int i15 = b;
            int i16 = ((i15 | 67) << 1) - (i15 ^ 67);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                accessibilityDelegate2.hashCode();
                throw null;
            }
            int i17 = i15 ^ 113;
            int i18 = ((i15 & 113) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            a = i20 % 128;
            int i21 = i20 % 2;
        } else if (d == null) {
            int i22 = b + 73;
            a = i22 % 128;
            try {
                if (i22 % 2 != 0) {
                    declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    d = declaredField;
                    z = false;
                } else {
                    declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    d = declaredField;
                    z = true;
                }
                int i23 = a;
                int i24 = ((i23 ^ 69) | (i23 & 69)) << 1;
                int i25 = -(((~i23) & 69) | (i23 & (-70)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    declaredField.setAccessible(z);
                    throw null;
                }
                declaredField.setAccessible(z);
                try {
                    obj = d.get(view);
                    if (obj instanceof View.AccessibilityDelegate) {
                        int i27 = a + 94;
                        i = (i27 ^ (-1)) + (i27 << 1);
                        b = i % 128;
                        if (i % 2 == 0) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                            int i28 = 17 / 0;
                        } else {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                        accessibilityDelegate2 = accessibilityDelegate;
                    }
                } catch (Throwable unused) {
                    e = true;
                }
            } catch (Throwable unused2) {
                e = true;
            }
        } else {
            obj = d.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                int i29 = a + 94;
                i = (i29 ^ (-1)) + (i29 << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    accessibilityDelegate = (View.AccessibilityDelegate) obj;
                    int i210 = 17 / 0;
                } else {
                    accessibilityDelegate = (View.AccessibilityDelegate) obj;
                }
                accessibilityDelegate2 = accessibilityDelegate;
            }
        }
        int i30 = a;
        int i31 = i30 & 109;
        int i32 = i31 + ((i30 ^ 109) | i31);
        b = i32 % 128;
        int i33 = i32 % 2;
        return accessibilityDelegate2;
    }

    public static C0283j h(View view) {
        C0283j c0283j;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-(i2 | 123));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        View.AccessibilityDelegate accessibilityDelegateG = g(view);
        if (accessibilityDelegateG == null) {
            int i7 = b;
            int i8 = (-2) - ((((i7 | 118) << 1) - (i7 ^ 118)) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 | 125;
            int i11 = i10 << 1;
            int i12 = -((~(i7 & 125)) & i10);
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 31 / 0;
            }
            return null;
        }
        if (!(accessibilityDelegateG instanceof C0283j.aWk)) {
            C0283j c0283j2 = new C0283j(accessibilityDelegateG);
            int i15 = a;
            int i16 = (((i15 | 14) << 1) - (i15 ^ 14)) - 1;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                return c0283j2;
            }
            throw null;
        }
        int i17 = b;
        int i18 = ((i17 | 3) << 1) - (i17 ^ 3);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            c0283j = ((C0283j.aWk) accessibilityDelegateG).c;
            int i19 = 80 / 0;
        } else {
            c0283j = ((C0283j.aWk) accessibilityDelegateG).c;
        }
        int i20 = a;
        int i21 = i20 ^ 17;
        int i22 = (i20 & 17) << 1;
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        return c0283j;
    }

    public static void c(View view, al.aXC axc) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = (i3 | 53) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            h(view);
            obj.hashCode();
            throw null;
        }
        C0283j c0283jH = h(view);
        if (c0283jH == null) {
            c0283jH = new C0283j();
            int i8 = b + 107;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 2;
            }
        }
        q(view, c0283jH);
        o(axc.e(), view);
        int i10 = b;
        int i11 = i10 ^ 107;
        int i12 = ((((i10 & 107) | i11) << 1) - (~(-i11))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            j(view).add(axc);
            i = 1;
        } else {
            j(view).add(axc);
            i = 0;
        }
        int i13 = b;
        int i14 = i13 ^ 1;
        int i15 = ((i13 & 1) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            k(view, i);
            throw null;
        }
        k(view, i);
        int i18 = a + 31;
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (ivas.gov.bisp.enumeration.d.T.aXa.c(r7) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (ivas.gov.bisp.enumeration.d.T.aXa.c(r7) != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p081d.T.b + 39;
        ivas.gov.bisp.enumeration.p081d.T.a = r1 % 128;
        r1 = r1 % 2;
        r7.getViewTreeObserver().addOnGlobalLayoutListener(r8);
        r7 = ivas.gov.bisp.enumeration.p081d.T.a;
        r8 = r7 & 67;
        r7 = -(-((r7 ^ 67) | r8));
        r1 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.p081d.T.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(android.view.View r7, java.lang.CharSequence r8) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p081d.T.r(android.view.View, java.lang.CharSequence):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h m(View view, h hVar) {
        J j;
        J j2;
        h hVarB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = (((i2 | 85) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(!Log.isLoggable("ViewCompat", 3))) {
            int i6 = a;
            int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                Objects.toString(hVar);
                Objects.requireNonNull(view);
                view.getId();
                int i8 = 17 / 0;
            } else {
                Objects.toString(hVar);
                Objects.requireNonNull(view);
                view.getId();
            }
            int i9 = a;
            int i10 = i9 & 53;
            int i11 = -(-(i9 | 53));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int i14 = a;
            int i15 = i14 & 17;
            int i16 = -(-(i14 | 17));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            h hVarC = aXn.c(view, hVar);
            int i19 = a;
            int i20 = ((i19 | 41) << 1) - (i19 ^ 41);
            b = i20 % 128;
            int i21 = i20 % 2;
            return hVarC;
        }
        InterfaceC0286o interfaceC0286o = (InterfaceC0286o) view.getTag(R.id.tag_on_receive_content_listener);
        if (interfaceC0286o == null) {
            if (view instanceof J) {
                int i22 = b;
                int i23 = (i22 & 85) + (i22 | 85);
                int i24 = i23 % 128;
                a = i24;
                int i25 = i23 % 2;
                j = (J) view;
                int i26 = i24 + 43;
                b = i26 % 128;
                int i27 = i26 % 2;
            } else {
                j = h;
                int i28 = a;
                int i29 = (i28 ^ 75) + ((i28 & 75) << 1);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
            h hVarB2 = j.b(hVar);
            int i31 = b;
            int i32 = i31 | 53;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 53)) & i32);
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
            return hVarB2;
        }
        int i37 = a;
        int i38 = i37 & 99;
        int i39 = i38 + ((i37 ^ 99) | i38);
        b = i39 % 128;
        int i40 = i39 % 2;
        h hVarB3 = interfaceC0286o.b(view, hVar);
        if (hVarB3 == null) {
            int i41 = b;
            int i42 = (-2) - ((((i41 | 28) << 1) - (i41 ^ 28)) ^ (-1));
            a = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 7 / 0;
            }
            int i44 = i41 & 33;
            int i45 = -(-((i41 ^ 33) | i44));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            a = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 3 / 3;
            }
            hVarB = null;
        } else {
            if (!(!(view instanceof J))) {
                int i48 = a;
                int i49 = i48 + 59;
                b = i49 % 128;
                int i50 = i49 % 2;
                j2 = (J) view;
                int i51 = i48 & 77;
                int i52 = (((i48 | 77) & (~i51)) - (~(-(-(i51 << 1))))) - 1;
                b = i52 % 128;
                int i53 = i52 % 2;
            } else {
                j2 = h;
                int i54 = b;
                int i55 = i54 ^ 77;
                int i56 = ((((i54 & 77) | i55) << 1) - (~(-i55))) - 1;
                a = i56 % 128;
                int i57 = i56 % 2;
            }
            hVarB = j2.b(hVarB3);
            int i58 = b;
            int i59 = i58 & 1;
            int i60 = (i58 ^ 1) | i59;
            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
            a = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = b + 87;
        a = i63 % 128;
        int i64 = i63 % 2;
        return hVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (i(r10) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p081d.T.b;
        r7 = (r2 ^ 41) + ((r2 & 41) << 1);
        ivas.gov.bisp.enumeration.p081d.T.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if ((r7 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r10.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p081d.T.a;
        r7 = (r2 & (-66)) | ((~r2) & 65);
        r2 = -(-((r2 & 65) << 1));
        r8 = ((r7 | r2) << 1) - (r2 ^ r7);
        ivas.gov.bisp.enumeration.p081d.T.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if ((r8 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r2 = 2 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        r10.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p081d.T.a + 87;
        ivas.gov.bisp.enumeration.p081d.T.b = r2 % 128;
        r2 = r2 % 2;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r8 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (ivas.gov.bisp.enumeration.d.T.aXa.b(r10) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p081d.T.a;
        r9 = ((r7 & 58) + (r7 | 58)) - 1;
        r7 = r9 % 128;
        ivas.gov.bisp.enumeration.p081d.T.b = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if ((r9 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r2 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r2 = ((r7 ^ 81) | (r7 & 81)) << 1;
        r5 = -((r7 & (-82)) | ((~r7) & 81));
        r7 = (r2 & r5) + (r2 | r5);
        ivas.gov.bisp.enumeration.p081d.T.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if ((r7 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r11 != 127) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r11 != 32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        r2 = android.view.accessibility.AccessibilityEvent.obtain();
        r10.onInitializeAccessibilityEvent(r2);
        r3 = ivas.gov.bisp.enumeration.p081d.T.b;
        r5 = r3 & 7;
        r3 = (r3 | 7) & (~r5);
        r5 = r5 << 1;
        r7 = ((r3 | r5) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.p081d.T.a = r7 % 128;
        r7 = r7 % 2;
        r2.setEventType(32);
        ivas.gov.bisp.enumeration.d.T.aXa.h(r2, r11);
        r11 = ivas.gov.bisp.enumeration.p081d.T.b;
        r3 = ((r11 ^ 80) + ((r11 & 80) << 1)) - 1;
        ivas.gov.bisp.enumeration.p081d.T.a = r3 % 128;
        r3 = r3 % 2;
        r2.setSource(r10);
        r10.onPopulateAccessibilityEvent(r2);
        r11 = ivas.gov.bisp.enumeration.p081d.T.a;
        r11 = (-2) - ((((r11 | 40) << 1) - (r11 ^ 40)) ^ (-1));
        ivas.gov.bisp.enumeration.p081d.T.b = r11 % 128;
        r11 = r11 % 2;
        r2.getText().add(i(r10));
        r10 = ivas.gov.bisp.enumeration.p081d.T.b;
        r11 = (r10 & 77) + (r10 | 77);
        ivas.gov.bisp.enumeration.p081d.T.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        if ((r11 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        r1.sendAccessibilityEvent(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0132, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0133, code lost:
    
        r1.sendAccessibilityEvent(r2);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r10.getParent() == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p081d.T.b;
        r2 = (r1 & (-112)) | ((~r1) & 111);
        r1 = (r1 & 111) << 1;
        r4 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p081d.T.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015a, code lost:
    
        ivas.gov.bisp.enumeration.d.T.aXa.g(r10.getParent(), r10, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015d, code lost:
    
        r10 = (-2) - ((ivas.gov.bisp.enumeration.p081d.T.b + 96) ^ (-1));
        ivas.gov.bisp.enumeration.p081d.T.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016a, code lost:
    
        if ((r10 % 2) == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        r10 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0171, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(r10.getParent().getClass().getSimpleName());
        r0.append(" does not fully implement ViewParent");
        android.util.Log.e("ViewCompat", r0.toString(), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0194, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        r1 = android.view.accessibility.AccessibilityEvent.obtain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0199, code lost:
    
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019c, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p081d.T.a;
        r8 = r7 & 17;
        r7 = (r7 | 17) & (~r8);
        r8 = r8 << 1;
        r9 = ((r7 | r8) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.p081d.T.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01af, code lost:
    
        if ((r9 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b1, code lost:
    
        r7 = 17741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b3, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1.isEnabled() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b5, code lost:
    
        r7 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b8, code lost:
    
        r1.setEventType(r8);
        ivas.gov.bisp.enumeration.d.T.aXa.h(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01be, code lost:
    
        if (r2 == true) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p081d.T.a;
        r7 = r11 & 97;
        r2 = ((((r11 ^ 97) | r7) << 1) - (~(-((r11 | 97) & (~r7))))) - 1;
        ivas.gov.bisp.enumeration.p081d.T.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
    
        if ((r2 % 2) != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d9, code lost:
    
        r1.getText().add(i(r10));
        r11 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e8, code lost:
    
        r1.getText().add(i(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f3, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p081d.T.a;
        r2 = (r11 & (-96)) | ((~r11) & 95);
        r11 = -(-((r11 & 95) << 1));
        r7 = (r2 ^ r11) + ((r11 & r2) << 1);
        ivas.gov.bisp.enumeration.p081d.T.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020a, code lost:
    
        if ((r7 % 2) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0210, code lost:
    
        if (ivas.gov.bisp.enumeration.d.T.aWX.e(r10) != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0212, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p081d.T.b;
        r2 = ((r11 ^ 4) + ((r11 & 4) << 1)) - 1;
        ivas.gov.bisp.enumeration.p081d.T.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021f, code lost:
    
        if ((r2 % 2) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0221, code lost:
    
        ivas.gov.bisp.enumeration.d.T.aWX.t(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0225, code lost:
    
        ivas.gov.bisp.enumeration.d.T.aWX.t(r10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0228, code lost:
    
        r11 = r10.getParent();
        r2 = ivas.gov.bisp.enumeration.p081d.T.b;
        r3 = ((r2 | 85) << 1) - (r2 ^ 85);
        ivas.gov.bisp.enumeration.p081d.T.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023c, code lost:
    
        if ((!(r11 instanceof android.view.View)) == true) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x023e, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p081d.T.b;
        r6 = r2 & 107;
        r3 = ((r2 ^ 107) | r6) << 1;
        r2 = -((r2 | 107) & (~r6));
        r6 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p081d.T.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025d, code lost:
    
        if (ivas.gov.bisp.enumeration.d.T.aWX.e((android.view.View) r11) != 4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025f, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p081d.T.b;
        r2 = r11 & 13;
        r11 = (r11 ^ 13) | r2;
        r3 = ((r2 | r11) << 1) - (r11 ^ r2);
        ivas.gov.bisp.enumeration.p081d.T.a = r3 % 128;
        r3 = r3 % 2;
        ivas.gov.bisp.enumeration.d.T.aWX.t(r10, 2);
        r11 = ivas.gov.bisp.enumeration.p081d.T.a + 63;
        ivas.gov.bisp.enumeration.p081d.T.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x027d, code lost:
    
        r11 = r11.getParent();
        r2 = ivas.gov.bisp.enumeration.p081d.T.a;
        r3 = r2 & 45;
        r2 = -(-((r2 ^ 45) | r3));
        r6 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p081d.T.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0294, code lost:
    
        if ((r6 % 2) != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0296, code lost:
    
        r2 = 3 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x029a, code lost:
    
        r10.sendAccessibilityEventUnchecked(r1);
        r10 = ivas.gov.bisp.enumeration.p081d.T.a;
        r11 = r10 & 5;
        r10 = (r10 ^ 5) | r11;
        r1 = (r11 & r10) + (r10 | r11);
        ivas.gov.bisp.enumeration.p081d.T.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ad, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p081d.T.a;
        r11 = (((r10 ^ 7) | (r10 & 7)) << 1) - (((~r10) & 7) | (r10 & (-8)));
        ivas.gov.bisp.enumeration.p081d.T.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c2, code lost:
    
        ivas.gov.bisp.enumeration.d.T.aWX.e(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (r1.isEnabled() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p081d.T.a + 77;
        ivas.gov.bisp.enumeration.p081d.T.b = r10 % 128;
        r10 = r10 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(android.view.View r10, int r11) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p081d.T.k(android.view.View, int):void");
    }
}
