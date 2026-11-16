package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p089l.t;
import ivas.gov.bisp.enumeration.p089l.u;
import ivas.gov.bisp.enumeration.p097r.o;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Y implements o {
    private static int a = 0;
    private static int b = 1;
    public static Method c;
    public static Method d;
    public static Method e;
    public final Handler A;
    public PopupWindow C;
    public boolean D;
    public Context g;
    public ListAdapter h;
    public o00000OO i;
    public int l;
    public int m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f102o;
    public boolean p;
    public DataSetObserver s;
    public View t;
    public AdapterView.OnItemClickListener v;
    public Rect x;
    public int k = -2;
    public int j = -2;
    public int f = 1002;
    public int r = 0;
    public int q = Integer.MAX_VALUE;
    public final aSl u = new aSl();
    public final aSk w = new aSk();
    public final aSj z = new aSj();
    public final aSh y = new aSh();
    public final Rect B = new Rect();

    public class aSh implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aSh() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 97) | (i2 & 97)) << 1) - (~(-(((~i2) & 97) | (i2 & (-98)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            o00000OO o00000oo = Y.this.i;
            if (o00000oo != null) {
                int i5 = b + 119;
                a = i5 % 128;
                int i6 = i5 % 2;
                o00000oo.setListSelectionHidden(true);
                o00000oo.requestLayout();
            }
            int i7 = a;
            int i8 = (i7 ^ 30) + ((i7 & 30) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public class aSi extends DataSetObserver {
        private static int a = 1;
        private static int b;

        public aSi() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Throwable {
            int i = 2 % 2;
            int i2 = a + 47;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (Y.this.e()) {
                int i4 = b;
                int i5 = i4 & 71;
                int i6 = i4 | 71;
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                a = i7 % 128;
                int i8 = i7 % 2;
                Y.this.f();
                int i9 = a + 7;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = b;
            int i12 = ((i11 ^ 82) + ((i11 & 82) << 1)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 53;
            int i4 = (i2 ^ 53) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                Y.this.dismiss();
                throw null;
            }
            Y.this.dismiss();
            int i6 = a;
            int i7 = i6 & 59;
            int i8 = i7 + ((i6 ^ 59) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public class aSl implements Runnable {
        private static int a = 1;
        private static int b;

        public aSl() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 19) << 1) - (~(-(i2 ^ 19)))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            o00000OO o00000oo = Y.this.i;
            if (o00000oo != null) {
                int i5 = b + 91;
                a = i5 % 128;
                int i6 = i5 % 2;
                WeakHashMap<View, R> weakHashMap = T.c;
                if (!(!T.aXa.c(o00000oo))) {
                    int i7 = b;
                    int i8 = (i7 & (-46)) | ((~i7) & 45);
                    int i9 = (i7 & 45) << 1;
                    int i10 = (i8 & i9) + (i9 | i8);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    int count = Y.this.i.getCount();
                    Y y = Y.this;
                    int i12 = b + 15;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    if (count > y.i.getChildCount()) {
                        int i14 = b;
                        int i15 = i14 & 3;
                        int i16 = ((i14 ^ 3) | i15) << 1;
                        int i17 = -((i14 | 3) & (~i15));
                        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                        a = i18 % 128;
                        Object obj = null;
                        if (i18 % 2 == 0) {
                            Y.this.i.getChildCount();
                            obj.hashCode();
                            throw null;
                        }
                        int childCount = Y.this.i.getChildCount();
                        int i19 = a + 119;
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i20 = Y.this.q;
                            obj.hashCode();
                            throw null;
                        }
                        Y y2 = Y.this;
                        if (childCount <= y2.q) {
                            int i21 = b + 63;
                            a = i21 % 128;
                            int i22 = i21 % 2;
                            y2.C.setInputMethodMode(2);
                            Y.this.f();
                            int i23 = a + 47;
                            b = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i24 = 4 % 3;
                            }
                        }
                    }
                }
            }
            int i25 = b;
            int i26 = (i25 & (-90)) | ((~i25) & 89);
            int i27 = -(-((i25 & 89) << 1));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 92 / 0;
            }
        }
    }

    static {
        Class[] clsArr;
        Object obj = null;
        if (Build.VERSION.SDK_INT <= 28) {
            int i = b;
            int i2 = i & 65;
            int i3 = i | 65;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            a = i4 % 128;
            int i5 = i4 % 2;
            try {
                Class[] clsArr2 = {Boolean.TYPE};
                int i6 = a;
                int i7 = i6 & 115;
                int i8 = i6 | 115;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                c = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", clsArr2);
                int i11 = b;
                int i12 = (i11 ^ 117) + ((i11 & 117) << 1);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 % 2;
                }
            } catch (NoSuchMethodException unused) {
            }
            try {
                Class[] clsArr3 = {Rect.class};
                int i14 = a + 91;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", clsArr3);
                    throw null;
                }
                d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", clsArr3);
                int i15 = b;
                int i16 = (((i15 ^ 9) | (i15 & 9)) << 1) - (((~i15) & 9) | (i15 & (-10)));
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 2 % 2;
                }
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            int i18 = b;
            int i19 = (((i18 | 40) << 1) - (i18 ^ 40)) - 1;
            a = i19 % 128;
            try {
                if (i19 % 2 != 0) {
                    clsArr = new Class[5];
                    clsArr[0] = View.class;
                    clsArr[1] = Integer.TYPE;
                } else {
                    clsArr = new Class[3];
                    clsArr[0] = View.class;
                    clsArr[1] = Integer.TYPE;
                }
                clsArr[2] = Boolean.TYPE;
                e = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", clsArr);
                int i20 = (-2) - ((a + 48) ^ (-1));
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 2 % 2;
                }
            } catch (NoSuchMethodException unused3) {
                return;
            }
        }
        int i22 = b + 45;
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public Y(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.q, i, i2);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
            int i3 = b;
            int i4 = ((((i3 ^ 81) | (i3 & 81)) << 1) - (~(-(((~i3) & 81) | (i3 & (-82)))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        M m = new M(context, attributeSet, i, i2);
        int i7 = a;
        int i8 = ((i7 | 3) << 1) - (i7 ^ 3);
        b = i8 % 128;
        int i9 = i8 % 2;
        this.C = m;
        m.setInputMethodMode(1);
        int i10 = b;
        int i11 = ((i10 ^ 13) | (i10 & 13)) << 1;
        int i12 = -(((~i10) & 13) | (i10 & (-14)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Drawable c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 86) + (i2 | 86)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable background = this.C.getBackground();
        int i5 = b;
        int i6 = i5 ^ 123;
        int i7 = -(-((i5 & 123) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return background;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void d(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 41) + (i3 | 41);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.l = i;
        int i6 = ((i3 & (-114)) | ((~i3) & 113)) + ((i3 & 113) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (i2 | 85) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.C.isShowing();
        }
        int i7 = 78 / 0;
        return this.C.isShowing();
    }

    public int g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.l;
        int i5 = i2 + 15;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public ListView i() {
        int i = 2 % 2;
        int i2 = b + 31;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        o00000OO o00000oo = this.i;
        int i5 = i3 & 35;
        int i6 = (i3 ^ 35) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return o00000oo;
    }

    public void m(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.C.setBackgroundDrawable(drawable);
        int i5 = b;
        int i6 = i5 & 91;
        int i7 = (i5 ^ 91) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 55 / 0;
        }
    }

    public void o(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 87;
        int i5 = (((i3 ^ 87) | i4) << 1) - ((i3 | 87) & (~i4));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.C.getBackground();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable background = this.C.getBackground();
        if (background == null) {
            this.j = i;
            int i6 = a;
            int i7 = i6 & 35;
            int i8 = ((i6 ^ 35) | i7) << 1;
            int i9 = -((i6 | 35) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 90 / 0;
                return;
            }
            return;
        }
        int i12 = a;
        int i13 = i12 ^ 109;
        int i14 = -(-((i12 & 109) << 1));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        background.getPadding(this.B);
        Rect rect = this.B;
        int i17 = a;
        int i18 = i17 & 93;
        int i19 = (i18 - (~((i17 ^ 93) | i18))) - 1;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = rect.left % rect.right;
            int i21 = -(-i);
            int i22 = i20 & i21;
            int i23 = (i21 | i20) & (~i22);
            int i24 = i22 << 1;
            this.j = ((i23 | i24) << 1) - (i23 ^ i24);
            return;
        }
        int i25 = rect.left;
        int i26 = rect.right;
        int i27 = i25 & i26;
        int i28 = (i25 | i26) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = -(-i);
        int i32 = i30 & i31;
        int i33 = i31 | i30;
        this.j = ((i32 | i33) << 1) - (i33 ^ i32);
    }

    public o00000OO p(Context context, boolean z) {
        int i = 2 % 2;
        o00000OO o00000oo = new o00000OO(context, z);
        int i2 = a + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        return o00000oo;
    }

    @Override // ivas.gov.bisp.enumeration.p097r.o
    public void dismiss() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 21) | (i2 & 21)) << 1;
        int i4 = -(((~i2) & 21) | (i2 & (-22)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.C.dismiss();
            throw null;
        }
        this.C.dismiss();
        PopupWindow popupWindow = this.C;
        int i6 = a;
        int i7 = ((i6 | 82) << 1) - (i6 ^ 82);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        popupWindow.setContentView(null);
        this.i = null;
        Handler handler = this.A;
        int i10 = b;
        int i11 = (((i10 ^ 91) | (i10 & 91)) << 1) - (((~i10) & 91) | (i10 & (-92)));
        a = i11 % 128;
        if (i11 % 2 != 0) {
            handler.removeCallbacks(this.u);
            throw null;
        }
        handler.removeCallbacks(this.u);
        int i12 = a;
        int i13 = i12 | 51;
        int i14 = ((i13 << 1) - (~(-((~(i12 & 51)) & i13)))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = -(-((i2 ^ 81) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.n) {
            int i6 = this.m;
            int i7 = i2 + 57;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = (i2 ^ 47) + ((i2 & 47) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = (i9 & (-22)) | ((~i9) & 21);
        int i12 = -(-((i9 & 21) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return 0;
        }
        obj.hashCode();
        throw null;
    }

    public void l(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 69;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.m = i;
        this.n = true;
        int i6 = (i3 & 17) + (i3 | 17);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void q(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = (((i2 | 67) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.D = z;
        this.C.setFocusable(z);
        int i6 = b + 23;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public class aSj implements AbsListView.OnScrollListener {
        private static int a = 0;
        private static int b = 1;

        public aSj() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (((i5 | 100) << 1) - (i5 ^ 100)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 | 51) << 1;
            int i5 = -((i3 & (-52)) | ((~i3) & 51));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 != 0 ? i == 1 : i == 1) {
                int i7 = i3 & 109;
                int i8 = ((((i3 ^ 109) | i7) << 1) - (~(-((i3 | 109) & (~i7))))) - 1;
                b = i8 % 128;
                if (i8 % 2 != 0 ? Y.this.C.getInputMethodMode() != 2 : Y.this.C.getInputMethodMode() != 3) {
                    int i9 = a;
                    int i10 = (i9 ^ 115) + ((i9 & 115) << 1);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 & 111;
                    int i13 = i9 | 111;
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    if (Y.this.C.getContentView() != null) {
                        int i16 = b + 29;
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        Y y = Y.this;
                        Handler handler = y.A;
                        aSl asl = y.u;
                        int i18 = b;
                        int i19 = i18 & 71;
                        int i20 = ((((i18 ^ 71) | i19) << 1) - (~(-((i18 | 71) & (~i19))))) - 1;
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        handler.removeCallbacks(asl);
                        Y.this.u.run();
                        int i22 = a;
                        int i23 = i22 & 73;
                        int i24 = (i22 | 73) & (~i23);
                        int i25 = -(-(i23 << 1));
                        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    }
                } else {
                    int i28 = b;
                    int i29 = (i28 ^ 5) + ((i28 & 5) << 1);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
            }
            int i31 = b;
            int i32 = ((i31 & (-104)) | ((~i31) & 103)) + ((i31 & 103) << 1);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                throw null;
            }
        }
    }

    public class aSk implements View.OnTouchListener {
        private static int a = 0;
        private static int b = 1;

        public aSk() {
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0100 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:30:0x0102  */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action;
            int x;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 81) + (i2 | 81);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                action = motionEvent.getAction();
                x = (int) motionEvent.getX();
                int i4 = 68 / 0;
            } else {
                action = motionEvent.getAction();
                x = (int) motionEvent.getX();
            }
            int y = (int) motionEvent.getY();
            if (action == 0) {
                int i5 = b;
                int i6 = ((i5 ^ 63) - (~(-(-((i5 & 63) << 1))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                PopupWindow popupWindow = Y.this.C;
                if (popupWindow != null) {
                    int i8 = a;
                    int i9 = i8 & 73;
                    int i10 = (i9 - (~(-(-((i8 ^ 73) | i9))))) - 1;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    if (popupWindow.isShowing()) {
                        int i12 = b;
                        int i13 = i12 & 103;
                        int i14 = -(-((i12 ^ 103) | i13));
                        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                        a = i15 % 128;
                        int i16 = i15 % 2;
                        if (x >= 0) {
                            int i17 = (((i12 | 126) << 1) - (i12 ^ 126)) - 1;
                            a = i17 % 128;
                            int i18 = i17 % 2;
                            PopupWindow popupWindow2 = Y.this.C;
                            int i19 = b;
                            int i20 = i19 & 125;
                            int i21 = (i19 ^ 125) | i20;
                            int i22 = (i20 & i21) + (i21 | i20);
                            a = i22 % 128;
                            int i23 = i22 % 2;
                            if (x < popupWindow2.getWidth()) {
                                int i24 = b;
                                int i25 = i24 ^ 11;
                                int i26 = (i24 & 11) << 1;
                                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                                int i28 = i27 % 128;
                                a = i28;
                                int i29 = i27 % 2;
                                if (y >= 0) {
                                    int i30 = (i28 & 111) + (i28 | 111);
                                    b = i30 % 128;
                                    Object obj = null;
                                    if (i30 % 2 == 0) {
                                        Y.this.C.getHeight();
                                        throw null;
                                    }
                                    if (y < Y.this.C.getHeight()) {
                                        int i31 = b;
                                        int i32 = ((i31 | 69) << 1) - (i31 ^ 69);
                                        a = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            Y y2 = Y.this;
                                            Handler handler = y2.A;
                                            aSl asl = y2.u;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        Y y3 = Y.this;
                                        y3.A.postDelayed(y3.u, 250L);
                                        int i33 = a;
                                        int i34 = ((i33 ^ 93) - (~((i33 & 93) << 1))) - 1;
                                        b = i34 % 128;
                                        int i35 = i34 % 2;
                                    } else if (action == 1) {
                                        int i36 = a;
                                        int i37 = (((i36 & (-82)) | ((~i36) & 81)) - (~((i36 & 81) << 1))) - 1;
                                        b = i37 % 128;
                                        int i38 = i37 % 2;
                                        Y y4 = Y.this;
                                        y4.A.removeCallbacks(y4.u);
                                        int i39 = a;
                                        int i40 = (i39 & (-12)) | ((~i39) & 11);
                                        int i41 = -(-((i39 & 11) << 1));
                                        int i42 = (i40 & i41) + (i41 | i40);
                                        b = i42 % 128;
                                        int i43 = i42 % 2;
                                    }
                                } else if (action == 1) {
                                    int i310 = a;
                                    int i311 = (((i310 & (-82)) | ((~i310) & 81)) - (~((i310 & 81) << 1))) - 1;
                                    b = i311 % 128;
                                    int i312 = i311 % 2;
                                    Y y5 = Y.this;
                                    y5.A.removeCallbacks(y5.u);
                                    int i313 = a;
                                    int i44 = (i313 & (-12)) | ((~i313) & 11);
                                    int i45 = -(-((i313 & 11) << 1));
                                    int i46 = (i44 & i45) + (i45 | i44);
                                    b = i46 % 128;
                                    int i47 = i46 % 2;
                                }
                            } else if (action == 1) {
                                int i314 = a;
                                int i315 = (((i314 & (-82)) | ((~i314) & 81)) - (~((i314 & 81) << 1))) - 1;
                                b = i315 % 128;
                                int i316 = i315 % 2;
                                Y y6 = Y.this;
                                y6.A.removeCallbacks(y6.u);
                                int i317 = a;
                                int i48 = (i317 & (-12)) | ((~i317) & 11);
                                int i49 = -(-((i317 & 11) << 1));
                                int i410 = (i48 & i49) + (i49 | i48);
                                b = i410 % 128;
                                int i411 = i410 % 2;
                            }
                        } else if (action == 1) {
                            int i318 = a;
                            int i319 = (((i318 & (-82)) | ((~i318) & 81)) - (~((i318 & 81) << 1))) - 1;
                            b = i319 % 128;
                            int i3110 = i319 % 2;
                            Y y7 = Y.this;
                            y7.A.removeCallbacks(y7.u);
                            int i3111 = a;
                            int i412 = (i3111 & (-12)) | ((~i3111) & 11);
                            int i413 = -(-((i3111 & 11) << 1));
                            int i414 = (i412 & i413) + (i413 | i412);
                            b = i414 % 128;
                            int i415 = i414 % 2;
                        }
                    } else if (action == 1) {
                        int i3112 = a;
                        int i3113 = (((i3112 & (-82)) | ((~i3112) & 81)) - (~((i3112 & 81) << 1))) - 1;
                        b = i3113 % 128;
                        int i3114 = i3113 % 2;
                        Y y8 = Y.this;
                        y8.A.removeCallbacks(y8.u);
                        int i3115 = a;
                        int i416 = (i3115 & (-12)) | ((~i3115) & 11);
                        int i417 = -(-((i3115 & 11) << 1));
                        int i418 = (i416 & i417) + (i417 | i416);
                        b = i418 % 128;
                        int i419 = i418 % 2;
                    }
                } else if (action == 1) {
                    int i3116 = a;
                    int i3117 = (((i3116 & (-82)) | ((~i3116) & 81)) - (~((i3116 & 81) << 1))) - 1;
                    b = i3117 % 128;
                    int i3118 = i3117 % 2;
                    Y y9 = Y.this;
                    y9.A.removeCallbacks(y9.u);
                    int i3119 = a;
                    int i4110 = (i3119 & (-12)) | ((~i3119) & 11);
                    int i4111 = -(-((i3119 & 11) << 1));
                    int i4112 = (i4110 & i4111) + (i4111 | i4110);
                    b = i4112 % 128;
                    int i4113 = i4112 % 2;
                }
            } else if (action == 1) {
                int i31110 = a;
                int i31111 = (((i31110 & (-82)) | ((~i31110) & 81)) - (~((i31110 & 81) << 1))) - 1;
                b = i31111 % 128;
                int i31112 = i31111 % 2;
                Y y10 = Y.this;
                y10.A.removeCallbacks(y10.u);
                int i31113 = a;
                int i4114 = (i31113 & (-12)) | ((~i31113) & 11);
                int i4115 = -(-((i31113 & 11) << 1));
                int i4116 = (i4114 & i4115) + (i4115 | i4114);
                b = i4116 % 128;
                int i4117 = i4116 % 2;
            }
            int i50 = b;
            int i51 = i50 ^ 109;
            int i52 = ((i50 & 109) | i51) << 1;
            int i53 = -i51;
            int i54 = (i52 & i53) + (i52 | i53);
            a = i54 % 128;
            int i55 = i54 % 2;
            return false;
        }
    }

    public void n(ListAdapter listAdapter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (i2 ^ 119) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new aSi();
            int i7 = a + 61;
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            ListAdapter listAdapter2 = this.h;
            if (listAdapter2 != null) {
                int i9 = (i6 ^ 82) + ((i6 & 82) << 1);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
                int i12 = b;
                int i13 = ((i12 ^ 89) | (i12 & 89)) << 1;
                int i14 = -(((~i12) & 89) | (i12 & (-90)));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        this.h = listAdapter;
        if (listAdapter != null) {
            int i17 = b;
            int i18 = (i17 & (-86)) | ((~i17) & 85);
            int i19 = -(-((i17 & 85) << 1));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            listAdapter.registerDataSetObserver(this.s);
            int i22 = b;
            int i23 = i22 & 113;
            int i24 = (i22 | 113) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 4 / 2;
            }
        }
        o00000OO o00000oo = this.i;
        if (o00000oo != null) {
            int i28 = a;
            int i29 = (-2) - (((i28 & 98) + (i28 | 98)) ^ (-1));
            b = i29 % 128;
            if (i29 % 2 == 0) {
                o00000oo.setAdapter(this.h);
                throw null;
            }
            o00000oo.setAdapter(this.h);
            int i30 = a;
            int i31 = ((i30 | 91) << 1) - (i30 ^ 91);
            b = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = b;
        int i34 = (i33 & 109) + (i33 | 109);
        a = i34 % 128;
        if (i34 % 2 != 0) {
            int i35 = 57 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00f0 A[PHI: r0 r7
  0x00f0: PHI (r0v165 int) = (r0v164 int), (r0v167 int) binds: [B:21:0x00ee, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r7v84 int) = (r7v83 int), (r7v93 int) binds: [B:21:0x00ee, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.p097r.o
    public void f() throws Throwable {
        int i;
        boolean z;
        int maxAvailableHeight;
        int iMakeMeasureSpec;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        o00000OO o00000oo;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 ^ 37;
        int i12 = ((i10 & 37) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        Object obj = null;
        if (this.i == null) {
            int i17 = ((i15 | 31) << 1) - (i15 ^ 31);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            Context context = this.g;
            boolean z2 = this.D;
            o00000OO o00000ooP = p(context, ((~(z2 ? 1 : 0)) & 1) | ((z2 ? 1 : 0) & (-2)));
            this.i = o00000ooP;
            int i18 = a;
            int i19 = ((i18 ^ 30) + ((i18 & 30) << 1)) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            o00000ooP.setAdapter(this.h);
            o00000OO o00000oo2 = this.i;
            int i21 = b;
            int i22 = i21 & 109;
            int i23 = (i21 ^ 109) | i22;
            int i24 = (i22 & i23) + (i23 | i22);
            a = i24 % 128;
            int i25 = i24 % 2;
            o00000oo2.setOnItemClickListener(this.v);
            this.i.setFocusable(true);
            this.i.setFocusableInTouchMode(true);
            this.i.setOnItemSelectedListener(new X(this));
            this.i.setOnScrollListener(this.z);
            int i26 = a;
            int i27 = (((i26 & (-8)) | ((~i26) & 7)) - (~(-(-((i26 & 7) << 1))))) - 1;
            b = i27 % 128;
            if (i27 % 2 == 0) {
                this.C.setContentView(this.i);
                obj.hashCode();
                throw null;
            }
            this.C.setContentView(this.i);
        }
        Drawable background = this.C.getBackground();
        if (background != null) {
            int i28 = b + 47;
            a = i28 % 128;
            int i29 = i28 % 2;
            background.getPadding(this.B);
            Rect rect = this.B;
            int i30 = b + 31;
            a = i30 % 128;
            if (i30 % 2 != 0) {
                i8 = rect.top;
                i = rect.bottom / i8;
                if (!this.n) {
                    this.m = -i8;
                    int i31 = a;
                    int i32 = i31 & 125;
                    int i33 = -(-((i31 ^ 125) | i32));
                    int i34 = (i32 & i33) + (i33 | i32);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                }
            } else {
                i8 = rect.top;
                int i36 = rect.bottom;
                int i37 = -(-i8);
                int i38 = i36 & i37;
                i = ((i36 ^ i37) | i38) + i38;
                if (!this.n) {
                    this.m = -i8;
                    int i39 = a;
                    int i310 = i39 & 125;
                    int i311 = -(-((i39 ^ 125) | i310));
                    int i312 = (i310 & i311) + (i311 | i310);
                    b = i312 % 128;
                    int i313 = i312 % 2;
                }
            }
        } else {
            this.B.setEmpty();
            i = 0;
        }
        if (this.C.getInputMethodMode() == 2) {
            int i40 = b;
            int i41 = ((i40 | 46) << 1) - (i40 ^ 46);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            z = true;
        } else {
            int i44 = b + 71;
            a = i44 % 128;
            int i45 = i44 % 2;
            z = false;
        }
        View view = this.t;
        int i46 = this.m;
        if (Build.VERSION.SDK_INT <= 23) {
            int i47 = b;
            int i48 = i47 & 73;
            int i49 = (i48 - (~((i47 ^ 73) | i48))) - 1;
            int i50 = i49 % 128;
            a = i50;
            if (i49 % 2 != 0) {
                throw null;
            }
            Method method = e;
            if (method != null) {
                try {
                    PopupWindow popupWindow = this.C;
                    Object[] objArr = new Object[3];
                    int i51 = i50 & 97;
                    int i52 = (i51 - (~(-(-((i50 ^ 97) | i51))))) - 1;
                    b = i52 % 128;
                    if (i52 % 2 == 0) {
                        objArr[1] = view;
                        objArr[0] = Integer.valueOf(i46);
                    } else {
                        objArr[0] = view;
                        objArr[1] = Integer.valueOf(i46);
                    }
                    objArr[2] = Boolean.valueOf(z);
                    maxAvailableHeight = ((Integer) method.invoke(popupWindow, objArr)).intValue();
                } catch (Exception unused) {
                    maxAvailableHeight = this.C.getMaxAvailableHeight(view, i46);
                    int i53 = a;
                    int i54 = i53 & 41;
                    int i55 = i54 + ((i53 ^ 41) | i54);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                }
            } else {
                maxAvailableHeight = this.C.getMaxAvailableHeight(view, i46);
                int i57 = a;
                int i58 = i57 & 41;
                int i59 = i58 + ((i57 ^ 41) | i58);
                b = i59 % 128;
                int i510 = i59 % 2;
            }
        } else {
            maxAvailableHeight = this.C.getMaxAvailableHeight(view, i46, z);
        }
        if (this.k == -1) {
            int i60 = a;
            int i61 = (i60 | 95) << 1;
            int i62 = -(((~i60) & 95) | (i60 & (-96)));
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            b = i63 % 128;
            if (i63 % 2 == 0) {
                i3 = (maxAvailableHeight ^ i) + ((i & maxAvailableHeight) << 1);
            } else {
                int i64 = -(~i);
                i3 = ((maxAvailableHeight ^ i64) + ((i64 & maxAvailableHeight) << 1)) - 1;
            }
        } else {
            int i65 = this.j;
            if (i65 == -2) {
                int i66 = this.g.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.B;
                int i67 = rect2.left;
                int i68 = -(-rect2.right);
                int i69 = i67 & i68;
                int i70 = (i68 ^ i67) | i69;
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                int i72 = b;
                int i73 = i72 & 25;
                int i74 = (((i72 | 25) & (~i73)) - (~(-(-(i73 << 1))))) - 1;
                a = i74 % 128;
                int i75 = i74 % 2;
                int i76 = -i71;
                int i77 = i66 & i76;
                int i78 = -(-((i66 ^ i76) | i77));
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((i77 | i78) << 1) - (i78 ^ i77), Integer.MIN_VALUE);
            } else if (i65 != -1) {
                int i79 = b;
                int i80 = i79 & 67;
                int i81 = (((i79 ^ 67) | i80) << 1) - ((i79 | 67) & (~i80));
                a = i81 % 128;
                if (i81 % 2 != 0) {
                    View.MeasureSpec.makeMeasureSpec(i65, 1073741824);
                    throw null;
                }
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i65, 1073741824);
            } else {
                int i82 = this.g.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.B;
                int i83 = rect3.left;
                int i84 = b;
                int i85 = ((i84 ^ 81) | (i84 & 81)) << 1;
                int i86 = -((i84 & (-82)) | ((~i84) & 81));
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                a = i87 % 128;
                int i88 = i87 % 2;
                int i89 = rect3.right;
                int i90 = b + 47;
                a = i90 % 128;
                int i91 = i90 % 2;
                int i92 = -(((i83 | i89) << 1) - (i89 ^ i83));
                int i93 = i82 & i92;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i93 - (~(-(-((i82 ^ i92) | i93))))) - 1, 1073741824);
            }
            int iD = this.i.d(iMakeMeasureSpec, maxAvailableHeight, -1);
            if (iD > 0) {
                int i94 = a;
                int i95 = i94 ^ 1;
                int i96 = (i94 & 1) << 1;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                b = i97 % 128;
                int i98 = i97 % 2;
                int paddingTop = this.i.getPaddingTop();
                int paddingBottom = this.i.getPaddingBottom();
                int i99 = a + 99;
                b = i99 % 128;
                if (i99 % 2 == 0) {
                    i2 = (paddingBottom / paddingTop) << i;
                } else {
                    int i100 = paddingBottom & paddingTop;
                    int i101 = -(-((paddingTop ^ paddingBottom) | i100));
                    int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                    int i103 = -(-i);
                    int i104 = ((~i103) & i102) | ((~i102) & i103);
                    int i105 = (i103 & i102) << 1;
                    int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                    int i107 = i106 << 1;
                    int i108 = -i106;
                    i2 = (i107 | i108) + (i107 & i108);
                }
            } else {
                i2 = 0;
            }
            i3 = (iD & i2) + (i2 | iD);
            int i109 = b;
            int i110 = i109 & 23;
            int i111 = (i109 ^ 23) | i110;
            int i112 = (i110 & i111) + (i111 | i110);
            a = i112 % 128;
            if (i112 % 2 != 0) {
                int i113 = 4 % 4;
            }
        }
        byte b2 = this.C.getInputMethodMode() == 2;
        PopupWindow popupWindow2 = this.C;
        int i114 = this.f;
        int i115 = a + 109;
        b = i115 % 128;
        if (i115 % 2 == 0) {
            u.e(popupWindow2, i114);
            this.C.isShowing();
            throw null;
        }
        u.e(popupWindow2, i114);
        if (!(!this.C.isShowing())) {
            View view2 = this.t;
            WeakHashMap<View, R> weakHashMap = T.c;
            if (!T.aXa.c(view2)) {
                int i116 = b;
                int i117 = (-2) - (((i116 & 116) + (i116 | 116)) ^ (-1));
                a = i117 % 128;
                int i118 = i117 % 2;
                return;
            }
            int width = this.j;
            if (width == -1) {
                int i119 = b;
                int i120 = ((i119 ^ 83) | (i119 & 83)) << 1;
                int i121 = -(((~i119) & 83) | (i119 & (-84)));
                int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                a = i122 % 128;
                int i123 = i122 % 2;
                width = -1;
            } else if (width == -2) {
                int i124 = b;
                int i125 = (((i124 | 84) << 1) - (i124 ^ 84)) - 1;
                a = i125 % 128;
                int i126 = i125 % 2;
                width = this.t.getWidth();
            }
            int i127 = this.k;
            if (i127 == -1) {
                if (b2 == false) {
                    i3 = -1;
                }
                if (b2 == true) {
                    int i128 = b;
                    int i129 = i128 + 93;
                    a = i129 % 128;
                    int i130 = i129 % 2;
                    PopupWindow popupWindow3 = this.C;
                    if (this.j == -1) {
                        int i131 = i128 + 41;
                        a = i131 % 128;
                        if (i131 % 2 != 0) {
                            throw null;
                        }
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    popupWindow3.setWidth(i7);
                    this.C.setHeight(0);
                } else {
                    PopupWindow popupWindow4 = this.C;
                    if (this.j == -1) {
                        int i132 = a;
                        int i133 = i132 & 83;
                        int i134 = ((i132 | 83) & (~i133)) + (i133 << 1);
                        b = i134 % 128;
                        int i135 = i134 % 2;
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow4.setWidth(i6);
                    this.C.setHeight(-1);
                    int i136 = a;
                    int i137 = i136 & 15;
                    int i138 = (i137 - (~(-(-((i136 ^ 15) | i137))))) - 1;
                    b = i138 % 128;
                    if (i138 % 2 == 0) {
                        int i139 = 3 % 2;
                    }
                }
            } else if (i127 != -2) {
                int i140 = b;
                int i141 = (((i140 ^ 105) | (i140 & 105)) << 1) - (((~i140) & 105) | (i140 & (-106)));
                a = i141 % 128;
                int i142 = i141 % 2;
                i3 = i127;
            }
            this.C.setOutsideTouchable(true);
            PopupWindow popupWindow5 = this.C;
            int i143 = a;
            int i144 = i143 & 99;
            int i145 = (((i143 ^ 99) | i144) << 1) - ((~i144) & (i143 | 99));
            b = i145 % 128;
            int i146 = i145 % 2;
            View view3 = this.t;
            int i147 = this.l;
            int i148 = this.m;
            int i149 = (-2) - (((i143 ^ 86) + ((i143 & 86) << 1)) ^ (-1));
            int i150 = i149 % 128;
            b = i150;
            int i151 = i149 % 2;
            if (width < 0) {
                int i152 = i150 | 11;
                int i153 = i152 << 1;
                int i154 = -((~(i150 & 11)) & i152);
                int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                a = i155 % 128;
                int i156 = i155 % 2;
                i4 = -1;
            } else {
                i4 = width;
            }
            if (i3 < 0) {
                int i157 = a;
                int i158 = (((i157 & (-18)) | ((~i157) & 17)) - (~(-(-((i157 & 17) << 1))))) - 1;
                b = i158 % 128;
                int i159 = i158 % 2;
                int i160 = i157 & 13;
                int i161 = (((i157 ^ 13) | i160) << 1) - ((i157 | 13) & (~i160));
                b = i161 % 128;
                if (i161 % 2 == 0) {
                    int i162 = 3 % 5;
                }
                i5 = -1;
            } else {
                i5 = i3;
            }
            popupWindow5.update(view3, i147, i148, i4, i5);
            int i163 = b;
            int i164 = ((i163 & 10) + (i163 | 10)) - 1;
            a = i164 % 128;
            if (i164 % 2 != 0) {
                int i165 = 39 / 0;
                return;
            }
            return;
        }
        int width2 = this.j;
        if (width2 == -1) {
            int i166 = a;
            int i167 = i166 & 109;
            int i168 = -(-((i166 ^ 109) | i167));
            int i169 = (i167 & i168) + (i168 | i167);
            b = i169 % 128;
            if (i169 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            width2 = -1;
        } else if (width2 == -2) {
            int i170 = a;
            int i171 = i170 & 111;
            int i172 = i170 | 111;
            int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
            b = i173 % 128;
            if (i173 % 2 == 0) {
                width2 = this.t.getWidth();
                int i174 = 27 / 0;
            } else {
                width2 = this.t.getWidth();
            }
        }
        int i175 = this.k;
        if (i175 == -1) {
            int i176 = b;
            int i177 = ((i176 | 79) << 1) - (i176 ^ 79);
            a = i177 % 128;
            int i178 = i177 % 2;
            i3 = -1;
        } else if (i175 != -2) {
            int i179 = a;
            int i180 = i179 ^ 3;
            int i181 = (i179 & 3) << 1;
            int i182 = (i180 ^ i181) + ((i181 & i180) << 1);
            b = i182 % 128;
            int i183 = i182 % 2;
            i3 = i175;
        }
        this.C.setWidth(width2);
        this.C.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = c;
            if (method2 != null) {
                int i184 = b + 3;
                a = i184 % 128;
                int i185 = i184 % 2;
                try {
                    PopupWindow popupWindow6 = this.C;
                    Object[] objArr2 = new Object[1];
                    Boolean bool = Boolean.TRUE;
                    int i186 = b;
                    int i187 = (i186 & (-76)) | ((~i186) & 75);
                    int i188 = -(-((i186 & 75) << 1));
                    int i189 = ((i187 | i188) << 1) - (i188 ^ i187);
                    a = i189 % 128;
                    if (i189 % 2 != 0) {
                        objArr2[0] = bool;
                        method2.invoke(popupWindow6, objArr2);
                        int i190 = 57 / 0;
                    } else {
                        objArr2[0] = bool;
                        method2.invoke(popupWindow6, objArr2);
                    }
                } catch (Exception unused2) {
                }
            }
        } else {
            this.C.setIsClippedToScreen(true);
        }
        this.C.setOutsideTouchable(true);
        PopupWindow popupWindow7 = this.C;
        int i191 = a + 9;
        b = i191 % 128;
        int i192 = i191 % 2;
        popupWindow7.setTouchInterceptor(this.w);
        if (this.p) {
            PopupWindow popupWindow8 = this.C;
            boolean z3 = this.f102o;
            int i193 = a;
            int i194 = i193 & 63;
            int i195 = i193 | 63;
            int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
            b = i196 % 128;
            int i197 = i196 % 2;
            u.d(popupWindow8, z3);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            int i198 = b;
            int i199 = i198 & 39;
            int i200 = ((~i199) & (i198 | 39)) + (i199 << 1);
            a = i200 % 128;
            int i201 = i200 % 2;
            Method method3 = d;
            if (method3 != null) {
                try {
                    PopupWindow popupWindow9 = this.C;
                    Object[] objArr3 = new Object[1];
                    int i202 = i198 & 87;
                    int i203 = (i198 ^ 87) | i202;
                    int i204 = (i202 & i203) + (i203 | i202);
                    a = i204 % 128;
                    if (i204 % 2 != 0) {
                        objArr3[0] = this.x;
                        method3.invoke(popupWindow9, objArr3);
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    objArr3[0] = this.x;
                    method3.invoke(popupWindow9, objArr3);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.C.setEpicenterBounds(this.x);
        }
        t.b(this.C, this.t, this.l, this.m, this.r);
        this.i.setSelection(-1);
        int i205 = b;
        int i206 = i205 & 87;
        int i207 = ((i205 ^ 87) | i206) << 1;
        int i208 = -((i205 | 87) & (~i206));
        int i209 = (i207 ^ i208) + ((i208 & i207) << 1);
        a = i209 % 128;
        if (i209 % 2 != 0) {
            throw null;
        }
        if ((!this.D || this.i.isInTouchMode()) && (o00000oo = this.i) != null) {
            int i210 = a;
            int i211 = i210 & 101;
            int i212 = i211 + ((i210 ^ 101) | i211);
            b = i212 % 128;
            int i213 = i212 % 2;
            o00000oo.setListSelectionHidden(true);
            o00000oo.requestLayout();
        }
        if (this.D) {
            return;
        }
        int i214 = b;
        int i215 = (((i214 | 32) << 1) - (i214 ^ 32)) - 1;
        a = i215 % 128;
        int i216 = i215 % 2;
        this.A.post(this.y);
        int i217 = b;
        int i218 = ((i217 & 86) + (i217 | 86)) - 1;
        a = i218 % 128;
        int i219 = i218 % 2;
    }
}
