package ivas.gov.bisp.enumeration.aM;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0076t extends J {
    public static final String[] A;
    public static final Property<bHf, PointF> B;
    public static final Property<View, PointF> C;
    public static final Property<View, PointF> D;
    public static final Property<View, PointF> E;
    private static int a = 0;
    private static int b = 1;
    public static final Property<bHf, PointF> z;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bHb */
    public class bHb extends AnimatorListenerAdapter {
        private bHf mViewBounds;

        public bHb(C0076t c0076t, bHf bhf) {
            this.mViewBounds = bhf;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bHe */
    public class bHe extends N {
        private static int a = 1;
        private static int b;
        public boolean c = false;
        public final /* synthetic */ ViewGroup d;

        public bHe(C0076t c0076t, ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void d(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 122) + (i2 | 122)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            S.b(this.d, false);
            int i5 = b;
            int i6 = ((i5 & 108) + (i5 | 108)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void e(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 118) + ((i2 & 118) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            S.b(this.d, true);
            int i5 = a;
            int i6 = (i5 | 43) << 1;
            int i7 = -(((~i5) & 43) | (i5 & (-44)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 37 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 91;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (!this.c) {
                int i5 = i2 & 3;
                int i6 = -(-(i2 | 3));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                b = i7 % 128;
                int i8 = i7 % 2;
                S.b(this.d, false);
                int i9 = a;
                int i10 = ((i9 ^ 71) | (i9 & 71)) << 1;
                int i11 = -(((~i9) & 71) | (i9 & (-72)));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 % 3;
                }
            }
            j.y(this);
            int i14 = b;
            int i15 = ((i14 | 1) << 1) - (i14 ^ 1);
            a = i15 % 128;
            int i16 = i15 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void c(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 49;
            int i4 = (i2 | 49) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                S.b(this.d, true);
                this.c = false;
            } else {
                S.b(this.d, false);
                this.c = true;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bHf */
    public static class bHf {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public View f;
        public int g;

        public bHf(View view) {
            this.f = view;
        }
    }

    static {
        int i = (-1) - (~(-(-3)));
        b = i % 128;
        int i2 = i % 2;
        A = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        new bGV(PointF.class, "boundsOrigin");
        z = new bGW(PointF.class, "topLeft");
        B = new bGX(PointF.class, "bottomRight");
        D = new bGY(PointF.class, "bottomRight");
        C = new bGZ(PointF.class, "topLeft");
        E = new bHa(PointF.class, "position");
        int i3 = a;
        int i4 = (i3 & (-72)) | ((~i3) & 71);
        int i5 = (i3 & 71) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void i(T t) {
        int i = 2 % 2;
        int i2 = b + 115;
        a = i2 % 128;
        int i3 = i2 % 2;
        J(t);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = a + 18;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public void l(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 6) + (i2 | 6)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        J(t);
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J
    public String[] s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 45;
        int i4 = ((((i2 & 45) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        String[] strArr = A;
        int i6 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i7 = -(((~i2) & 87) | (i2 & (-88)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return strArr;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bGV */
    public static final class bGV extends Property<Drawable, PointF> {
        private static int a = 1;
        private static int b;
        public Rect c;

        public bGV(Class cls, String str) {
            super(cls, str);
            this.c = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-30)) | ((~i2) & 29)) - (~(-(-((i2 & 29) << 1))))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                drawable.copyBounds(this.c);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            drawable.copyBounds(this.c);
            Rect rect = this.c;
            PointF pointF = new PointF(rect.left, rect.top);
            int i4 = b;
            int i5 = ((i4 | 3) << 1) - (i4 ^ 3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return pointF;
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.c);
            int i5 = b;
            int i6 = (-2) - (((i5 & 120) + (i5 | 120)) ^ (-1));
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                Math.round(pointF2.x);
                Math.round(pointF2.y);
                obj.hashCode();
                throw null;
            }
            Rect rect = this.c;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            int i7 = b;
            int i8 = i7 ^ 91;
            int i9 = ((((i7 & 91) | i8) << 1) - (~(-i8))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                rect.offsetTo(iRound, iRound2);
                drawable2.setBounds(this.c);
            } else {
                rect.offsetTo(iRound, iRound2);
                drawable2.setBounds(this.c);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bHa */
    public static final class bHa extends Property<View, PointF> {
        private static int a = 0;
        private static int b = 1;

        public bHa(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 & 38) + (i2 | 38)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = (i2 & 122) + (i2 | 122);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 71;
            int i4 = (i2 & 71) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            View view2 = view;
            PointF pointF2 = pointF;
            int i8 = (i6 & 87) + (i6 | 87);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                Math.round(pointF2.x);
                float f = pointF2.y;
                throw null;
            }
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            int width = view2.getWidth();
            int i9 = b;
            int i10 = (((i9 & (-34)) | ((~i9) & 33)) - (~((i9 & 33) << 1))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            int height = view2.getHeight();
            int i12 = a;
            int i13 = ((i12 | 32) << 1) - (i12 ^ 32);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                L.c(view2, iRound, iRound2, width << iRound, height >>> iRound2);
                return;
            }
            int i15 = -(-iRound);
            int i16 = width & i15;
            int i17 = i15 | width;
            int i18 = (i16 & i17) + (i17 | i16);
            int i19 = -(-iRound2);
            int i20 = ((~i19) & height) | ((~height) & i19);
            int i21 = -(-((i19 & height) << 1));
            L.c(view2, iRound, iRound2, i18, (i20 ^ i21) + ((i21 & i20) << 1));
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bGZ */
    public static final class bGZ extends Property<View, PointF> {
        private static int a = 0;
        private static int b = 1;

        public bGZ(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 97) << 1;
            int i4 = -(i2 ^ 97);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = i6 & 53;
            int i9 = -(-((i6 ^ 53) | i8));
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            int iRound;
            int right;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 67;
            int i4 = -(-((i2 & 67) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound2 = Math.round(pointF2.x);
            int i7 = a;
            int i8 = i7 & 119;
            int i9 = (i8 - (~((i7 ^ 119) | i8))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                iRound = Math.round(pointF2.y);
                right = view2.getRight();
                int i10 = 4 / 0;
            } else {
                iRound = Math.round(pointF2.y);
                right = view2.getRight();
            }
            L.c(view2, iRound2, iRound, right, view2.getBottom());
            int i11 = a;
            int i12 = ((i11 & 80) + (i11 | 80)) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x009f  */
    public final void J(T t) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 43;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            View view = t.d;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view2 = t.d;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = ivas.gov.bisp.enumeration.p081d.T.c;
        int i4 = b;
        int i5 = ((i4 | 87) << 1) - (i4 ^ 87);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!(!ivas.gov.bisp.enumeration.d.T.aXa.d(view2))) {
            Map<String, Object> map = t.c;
            Rect rect = new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            int i7 = a;
            int i8 = i7 ^ 41;
            int i9 = ((i7 & 41) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            map.put("android:changeBounds:bounds", rect);
            int i13 = a;
            int i14 = i13 & 85;
            int i15 = ((i13 ^ 85) | i14) << 1;
            int i16 = -((i13 | 85) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            i = i17 % 2;
            t.c.put("android:changeBounds:parent", t.d.getParent());
            if (i == 0) {
                int i18 = 71 / 0;
            }
            int i19 = b;
            int i20 = ((i19 | 113) << 1) - (i19 ^ 113);
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i19 & 37;
            int i23 = (i22 - (~((i19 ^ 37) | i22))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = b;
            int i26 = ((i25 | 115) << 1) - (i25 ^ 115);
            a = i26 % 128;
            int i27 = i26 % 2;
            if (view2.getWidth() == 0) {
                int i28 = b + 49;
                a = i28 % 128;
                int i29 = i28 % 2;
                if (view2.getHeight() != 0) {
                    Map<String, Object> map2 = t.c;
                    Rect rect2 = new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                    int i30 = a;
                    int i31 = i30 ^ 41;
                    int i32 = ((i30 & 41) | i31) << 1;
                    int i110 = -i31;
                    int i111 = (i32 ^ i110) + ((i32 & i110) << 1);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    map2.put("android:changeBounds:bounds", rect2);
                    int i113 = a;
                    int i114 = i113 & 85;
                    int i115 = ((i113 ^ 85) | i114) << 1;
                    int i116 = -((i113 | 85) & (~i114));
                    int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                    b = i117 % 128;
                    i = i117 % 2;
                    t.c.put("android:changeBounds:parent", t.d.getParent());
                    if (i == 0) {
                        int i118 = 71 / 0;
                    }
                    int i119 = b;
                    int i210 = ((i119 | 113) << 1) - (i119 ^ 113);
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    int i212 = i119 & 37;
                    int i213 = (i212 - (~((i119 ^ 37) | i212))) - 1;
                    a = i213 % 128;
                    int i214 = i213 % 2;
                }
            } else {
                Map<String, Object> map3 = t.c;
                Rect rect3 = new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                int i33 = a;
                int i34 = i33 ^ 41;
                int i35 = ((i33 & 41) | i34) << 1;
                int i1110 = -i34;
                int i1111 = (i35 ^ i1110) + ((i35 & i1110) << 1);
                b = i1111 % 128;
                int i1112 = i1111 % 2;
                map3.put("android:changeBounds:bounds", rect3);
                int i1113 = a;
                int i1114 = i1113 & 85;
                int i1115 = ((i1113 ^ 85) | i1114) << 1;
                int i1116 = -((i1113 | 85) & (~i1114));
                int i1117 = ((i1115 | i1116) << 1) - (i1116 ^ i1115);
                b = i1117 % 128;
                i = i1117 % 2;
                t.c.put("android:changeBounds:parent", t.d.getParent());
                if (i == 0) {
                    int i1118 = 71 / 0;
                }
                int i1119 = b;
                int i215 = ((i1119 | 113) << 1) - (i1119 ^ 113);
                a = i215 % 128;
                int i216 = i215 % 2;
                int i217 = i1119 & 37;
                int i218 = (i217 - (~((i1119 ^ 37) | i217))) - 1;
                a = i218 % 128;
                int i219 = i218 % 2;
            }
        }
        int i36 = b;
        int i37 = (i36 ^ 101) + ((i36 & 101) << 1);
        a = i37 % 128;
        int i38 = i37 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bGY */
    public static final class bGY extends Property<View, PointF> {
        private static int a = 0;
        private static int b = 1;

        public bGY(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 75;
            int i4 = (i2 ^ 75) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            int i6 = 14 / 0;
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = -(-((i2 ^ 107) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                view.getLeft();
                throw null;
            }
            View view2 = view;
            PointF pointF2 = pointF;
            int left = view2.getLeft();
            int i6 = a;
            int i7 = (i6 | 75) << 1;
            int i8 = -(((~i6) & 75) | (i6 & (-76)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                view2.getTop();
                Math.round(pointF2.x);
                obj.hashCode();
                throw null;
            }
            int top = view2.getTop();
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            int i10 = b;
            int i11 = i10 & 55;
            int i12 = ((i10 | 55) & (~i11)) + (i11 << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                L.c(view2, left, top, iRound, iRound2);
                int i13 = 26 / 0;
            } else {
                L.c(view2, left, top, iRound, iRound2);
            }
            int i14 = a;
            int i15 = i14 & 89;
            int i16 = (i14 ^ 89) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bGW */
    public static final class bGW extends Property<bHf, PointF> {
        private static int a = 1;
        private static int b;

        public bGW(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* synthetic */ PointF get(bHf bhf) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 35;
            int i4 = (i3 - (~((i2 ^ 35) | i3))) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 & 73;
            int i6 = ((i2 ^ 73) | i5) << 1;
            int i7 = -((i2 | 73) & (~i5));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 14 / 0;
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0087  */
        /* JADX WARN: Code duplicated, block: B:17:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b2  */
        @Override // android.util.Property
        public final void set(bHf bhf, PointF pointF) {
            bHf bhf2;
            PointF pointF2;
            View view;
            int i;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 & (-110)) | ((~i5) & 109);
            int i7 = -(-((i5 & 109) << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                bhf2 = bhf;
                pointF2 = pointF;
                int i10 = 23 / 0;
            } else {
                bhf2 = bhf;
                pointF2 = pointF;
            }
            int i11 = i9 + 19;
            b = i11 % 128;
            Object obj = null;
            if (i11 % 2 != 0) {
                Objects.requireNonNull(bhf2);
                Math.round(pointF2.x);
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(bhf2);
            bhf2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            int i12 = a;
            int i13 = ((i12 & (-86)) | ((~i12) & 85)) + ((i12 & 85) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            bhf2.b = iRound;
            int i15 = bhf2.e;
            int i16 = (i15 & (-2)) | ((~i15) & 1);
            int i17 = -(-((i15 & 1) << 1));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            int i19 = a + 83;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                bhf2.e = i18;
                int i20 = 33 / 0;
                if (i18 == bhf2.g) {
                    int i21 = b;
                    int i22 = i21 & 117;
                    int i23 = (i22 - (~(-(-((i21 ^ 117) | i22))))) - 1;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    view = bhf2.f;
                    i = bhf2.a;
                    i2 = bhf2.c;
                    i3 = a + 17;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        L.c(view, i, iRound, i2, bhf2.d);
                    } else {
                        L.c(view, i, iRound, i2, bhf2.d);
                    }
                    bhf2.e = 0;
                    bhf2.g = 0;
                }
            } else {
                bhf2.e = i18;
                if (i18 == bhf2.g) {
                    int i25 = b;
                    int i26 = i25 & 117;
                    int i27 = (i26 - (~(-(-((i25 ^ 117) | i26))))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    view = bhf2.f;
                    i = bhf2.a;
                    i2 = bhf2.c;
                    i3 = a + 17;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        L.c(view, i, iRound, i2, bhf2.d);
                    } else {
                        L.c(view, i, iRound, i2, bhf2.d);
                    }
                    bhf2.e = 0;
                    bhf2.g = 0;
                }
            }
            int i29 = a;
            int i30 = ((i29 & (-78)) | ((~i29) & 77)) + ((i29 & 77) << 1);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.t$bGX */
    public static final class bGX extends Property<bHf, PointF> {
        private static int a = 1;
        private static int b;

        public bGX(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(bHf bhf) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = i2 | 91;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            int i7 = i2 & 37;
            int i8 = (i2 ^ 37) | i7;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }

        @Override // android.util.Property
        public final void set(bHf bhf, PointF pointF) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & 19) + (i3 | 19);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                Objects.requireNonNull(bhf);
                throw null;
            }
            bHf bhf2 = bhf;
            PointF pointF2 = pointF;
            Objects.requireNonNull(bhf2);
            bhf2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            int i5 = b;
            int i6 = ((i5 ^ 78) + ((i5 & 78) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                bhf2.d = iRound;
                i = bhf2.g;
            } else {
                bhf2.d = iRound;
                int i7 = bhf2.g;
                i = (((i7 ^ 1) | (i7 & 1)) << 1) - (((~i7) & 1) | (i7 & (-2)));
            }
            bhf2.g = i;
            int i8 = a;
            int i9 = i8 & 77;
            int i10 = (i8 ^ 77) | i9;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (bhf2.e == i) {
                int i13 = a;
                int i14 = (i13 & 21) + (i13 | 21);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    View view = bhf2.f;
                    int i15 = bhf2.a;
                    int i16 = bhf2.b;
                    throw null;
                }
                View view2 = bhf2.f;
                int i17 = bhf2.a;
                int i18 = bhf2.b;
                int i19 = a;
                int i20 = i19 & 81;
                int i21 = ((((i19 ^ 81) | i20) << 1) - (~(-((i19 | 81) & (~i20))))) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
                L.c(view2, i17, i18, bhf2.c, iRound);
                bhf2.e = 0;
                int i23 = b;
                int i24 = i23 & 9;
                int i25 = -(-((i23 ^ 9) | i24));
                int i26 = (i24 & i25) + (i25 | i24);
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    bhf2.g = 1;
                } else {
                    bhf2.g = 0;
                }
            }
            int i27 = b + 39;
            a = i27 % 128;
            int i28 = i27 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    /* JADX WARN: Code duplicated, block: B:149:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:151:0x05cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f7, code lost:
    
        if ((r10 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f9, code lost:
    
        r6[1] = r3;
        r6[1] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03fe, code lost:
    
        r6[0] = r3;
        r6[1] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0403, code lost:
    
        r5.playTogether(r6);
        r5.addListener(new ivas.gov.bisp.enumeration.aM.C0076t.bHb(r0, r2));
        r2 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r3 = r2 & 75;
        r3 = r3 + ((r2 ^ 75) | r3);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
        r3 = r3 % 2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x041f, code lost:
    
        r4.al(r5, r6, r7, r20);
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0429, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x042a, code lost:
    
        r0 = r22;
        r9 = r20;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0430, code lost:
    
        if (r12 != r6) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0432, code lost:
    
        r3 = (r2 & 49) + (r2 | 49);
        r2 = r3 % 128;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r2;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x043d, code lost:
    
        if (r14 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x043f, code lost:
    
        r3 = ((r2 & 81) - (~(-(-(r2 | 81))))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x044f, code lost:
    
        if ((r3 % 2) == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0451, code lost:
    
        r2 = r0.x;
        r3 = r5;
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r5 = (r4 & 81) + (r4 | 81);
        r4 = r5 % 128;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0461, code lost:
    
        if ((r5 % 2) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0463, code lost:
    
        r5 = r8;
        r6 = r10;
        r7 = r9;
        r9 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x046c, code lost:
    
        r5 = r8;
        r6 = r10;
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x046f, code lost:
    
        r8 = ((r4 | 80) << 1) - (r4 ^ 80);
        r4 = (r8 ^ (-1)) + (r8 << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r4 % 128;
        r4 = r4 % 2;
        r2 = r2.al(r3, r5, r6, r7);
        r3 = (-2) - ((ivas.gov.bisp.enumeration.aM.C0076t.b + 86) ^ (-1));
        ivas.gov.bisp.enumeration.aM.C0076t.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0492, code lost:
    
        if ((r3 % 2) != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0494, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aM.C0071a.b(r4, ivas.gov.bisp.enumeration.aM.C0076t.D, r2);
        r3 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r3 = (-2) - (((r3 & 68) + (r3 | 68)) ^ (-1));
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04ad, code lost:
    
        ivas.gov.bisp.enumeration.aM.C0071a.b(r4, ivas.gov.bisp.enumeration.aM.C0076t.D, r2);
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04b7, code lost:
    
        r2 = r0.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04bb, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r5 = (r4 ^ 91) + ((r4 & 91) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r5 % 128;
        r5 = r5 % 2;
        r8 = (r4 ^ 70) + ((r4 & 70) << 1);
        r4 = (r8 ^ (-1)) + (r8 << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r4 % 128;
        r4 = r4 % 2;
        r2 = r0.x.al(r12, r14, r6, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04e5, code lost:
    
        if (r4 != 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04e7, code lost:
    
        r3 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04eb, code lost:
    
        r3 = ivas.gov.bisp.enumeration.aM.C0076t.a + 109;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04f5, code lost:
    
        if ((r3 % 2) == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04f7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aM.C0071a.b(r4, ivas.gov.bisp.enumeration.aM.C0076t.C, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0503, code lost:
    
        if ((r4.getParent() instanceof android.view.ViewGroup) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0505, code lost:
    
        r3 = ivas.gov.bisp.enumeration.aM.C0076t.a + 34;
        r4 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r4 % 128;
        r4 = r4 % 2;
        r1 = (android.view.ViewGroup) r4.getParent();
        ivas.gov.bisp.enumeration.aM.S.b(r1, true);
        r0.g(new ivas.gov.bisp.enumeration.aM.C0076t.bHe(r0, r1));
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r3 = r1 & 47;
        r4 = -(-((r1 ^ 47) | r3));
        r5 = ((r3 | r4) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r5 % 128;
        r5 = r5 % 2;
        r3 = r1 & 85;
        r1 = (r1 ^ 85) | r3;
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0549, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r3 = r1 & 3;
        r1 = -(-((r1 ^ 3) | r3));
        r4 = (r3 ^ r1) + ((r1 & r3) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x055e, code lost:
    
        if ((r4 % 2) == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0560, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0561, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0565, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0566, code lost:
    
        r3 = null;
        ivas.gov.bisp.enumeration.aM.C0071a.b(r4, ivas.gov.bisp.enumeration.aM.C0076t.C, r2);
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0570, code lost:
    
        ivas.gov.bisp.enumeration.aM.L.c(r4, r12, r14, r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0578, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0579, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r2 = r1 & 63;
        r1 = (r1 ^ 63) | r2;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x058f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0590, code lost:
    
        r3 = null;
        r1 = (android.graphics.Rect) r1.get("android:changeBounds:clip");
        r25.c.get("android:changeBounds:clip");
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x05a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05a2, code lost:
    
        r3 = null;
        r1 = (android.graphics.Rect) r25.c.get("android:changeBounds:bounds");
        r1 = r8.left;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05b0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        r4 = r25.d;
        r8 = (android.graphics.Rect) r24.c.get("android:changeBounds:bounds");
        r12 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r13 = ((r12 & 16) + (r12 | 16)) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if ((r13 % 2) == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r11 = (android.graphics.Rect) r25.c.get("android:changeBounds:bounds");
        r12 = r8.left;
        r13 = r11.left;
        r14 = r8.top;
        r15 = r11.top;
        r16 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r5 = ((r16 | 43) << 1) - (r16 ^ 43);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if ((r5 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        r5 = r8.right;
        r10 = r11.right;
        r8 = r8.bottom;
        r17 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r5 = r8.right;
        r10 = r11.right;
        r8 = r8.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r17 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r6 = r17 & 97;
        r9 = (~r6) & (r17 | 97);
        r6 = r6 << 1;
        r6 = (r9 & r6) + (r6 | r9);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
    
        if ((r6 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        r6 = r11.bottom;
        r9 = -(-r12);
        r3 = r5 & r9;
        r11 = ((((r5 ^ r9) | r3) << 1) - (~(-((~r3) & (r9 | r5))))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
    
        r6 = r11.bottom;
        r3 = -(~(-r12));
        r9 = ((r5 | r3) << 1) - (r3 ^ r5);
        r11 = (r9 ^ (-1)) + (r9 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0125, code lost:
    
        r3 = -r14;
        r0 = r8 & r3;
        r9 = ((r8 ^ r3) | r0) << 1;
        r0 = -((~r0) & (r3 | r8));
        r3 = (r9 & r0) + (r0 | r9);
        r0 = -r13;
        r9 = r10 & r0;
        r0 = ((r0 | r10) & (~r9)) + (r9 << 1);
        r7 = -r15;
        r9 = r6 | r7;
        r7 = (r9 << 1) - ((~(r7 & r6)) & r9);
        r1 = r24.c;
        r9 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r9 = (r9 ^ 27) + ((r9 & 27) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015f, code lost:
    
        if ((r9 % 2) == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0161, code lost:
    
        r1 = (android.graphics.Rect) r1.get("android:changeBounds:clip");
        r2 = (android.graphics.Rect) r25.c.get("android:changeBounds:clip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016f, code lost:
    
        if (r11 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0171, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r9 = (((r4 | 49) << 1) - (~(-(r4 ^ 49)))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        if ((r9 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0188, code lost:
    
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018d, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018f, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r9 = r4 & 77;
        r4 = (r4 ^ 77) | r9;
        r4 = (r9 & r4) + (r4 | r9);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a1, code lost:
    
        if (r7 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a3, code lost:
    
        if (r12 != r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a5, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r9 = (r4 | 89) << 1;
        r21 = r13;
        r13 = -((r4 & (-90)) | ((~r4) & 89));
        r9 = ((r9 | r13) << 1) - (r9 ^ r13);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c4, code lost:
    
        if (r14 != r15) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c6, code lost:
    
        r9 = r4 & 125;
        r9 = r9 + ((r4 ^ 125) | r9);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r9 % 128;
        r9 = r9 % 2;
        r9 = (((r4 & (-62)) | ((~r4) & 61)) - (~((r4 & 61) << 1))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r9 % 128;
        r9 = r9 % 2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e7, code lost:
    
        r21 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e9, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r9 = (((r4 & (-88)) | ((~r4) & 87)) - (~((r4 & 87) << 1))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fe, code lost:
    
        if ((r9 % 2) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0200, code lost:
    
        r4 = 4 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0202, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0203, code lost:
    
        if (r5 != r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0205, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r13 = (r9 & 32) + (r9 | 32);
        r9 = (r13 ^ (-1)) + (r13 << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0219, code lost:
    
        if (r8 == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021b, code lost:
    
        r9 = r4 & 1;
        r9 = (r9 - (~((r4 ^ 1) | r9))) - 1;
        r13 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r4 = (r13 ^ 5) + ((r13 & 5) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4 % 128;
        r4 = r4 % 2;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0235, code lost:
    
        r21 = r13;
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r9 = r4 ^ 83;
        r4 = -(-((r4 & 83) << 1));
        r4 = (r9 ^ r4) + ((r4 & r9) << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4 % 128;
        r4 = r4 % 2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024e, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0250, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r13 = r9 & 117;
        r20 = r6;
        r6 = (~r13) & (r9 | 117);
        r9 = 1;
        r6 = r6 + (r13 << 1);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0268, code lost:
    
        if ((!r1.equals(r2)) == true) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026b, code lost:
    
        r20 = r6;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026e, code lost:
    
        if (r1 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0270, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r6 = r1 ^ 17;
        r1 = -(-((r1 & 17) << r9));
        r13 = ((r6 | r1) << r9) - (r1 ^ r6);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0284, code lost:
    
        if ((r13 % 2) != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0286, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0288, code lost:
    
        r4 = r4 + 1;
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r2 = (((r1 | 26) << 1) - (r1 ^ 26)) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029b, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x029f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a0, code lost:
    
        if (r4 <= 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a2, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r2 = (r1 & (-38)) | ((~r1) & 37);
        r1 = (r1 & 37) << 1;
        r6 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b8, code lost:
    
        if ((r6 % 2) == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ba, code lost:
    
        ivas.gov.bisp.enumeration.aM.L.c(r4, r12, r14, r5, r8);
        r2 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r6 = (r2 & (-16)) | ((~r2) & 15);
        r9 = -(-((r2 & 15) << 1));
        r13 = (r6 & r9) + (r6 | r9);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02d8, code lost:
    
        if (r4 != 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02da, code lost:
    
        r6 = r2 & 119;
        r4 = ((r2 ^ 119) | r6) << 1;
        r2 = -((r2 | 119) & (~r6));
        r6 = ((r4 | r2) << 1) - (r2 ^ r4);
        r2 = r6 % 128;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r2;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f1, code lost:
    
        if (r11 != r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f3, code lost:
    
        r0 = r2 | 89;
        r4 = r0 << 1;
        r0 = -(r0 & (~(r2 & 89)));
        r6 = (r4 & r0) + (r0 | r4);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0306, code lost:
    
        if ((r6 % 2) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0308, code lost:
    
        if (r3 != r7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x030a, code lost:
    
        r0 = r2 & 107;
        r2 = (r2 ^ 107) | r0;
        r3 = ((r0 | r2) << 1) - (r0 ^ r2);
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x031b, code lost:
    
        if ((r3 % 2) != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
    
        r0 = r22;
        r2 = r0.x;
        r3 = r12;
        r4 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0327, code lost:
    
        r0 = r22;
        r2 = r0.x;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x032c, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b + 27;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0336, code lost:
    
        if ((r4 % 2) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0338, code lost:
    
        r4 = r14;
        r5 = r21;
        r6 = r15;
        r7 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0342, code lost:
    
        r4 = r14;
        r5 = r21;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0347, code lost:
    
        r2 = r2.al(r3, r4, r5, r6);
        r3 = ivas.gov.bisp.enumeration.aM.C0076t.a + 45;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
        r3 = r3 % 2;
        r2 = ivas.gov.bisp.enumeration.aM.C0071a.b(r4, ivas.gov.bisp.enumeration.aM.C0076t.E, r2);
        r3 = ivas.gov.bisp.enumeration.aM.C0076t.a + 23;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0369, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x036a, code lost:
    
        r0 = r22;
        r6 = r21;
        r2 = new ivas.gov.bisp.enumeration.aM.C0076t.bHf(r4);
        r3 = r0.x;
        r4 = r12;
        r7 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r9 = r7 & 75;
        r9 = (r9 - (~(-(-((r7 ^ 75) | r9))))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0389, code lost:
    
        if ((r9 % 2) != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x038b, code lost:
    
        r7 = r14;
        r6 = r6;
        r9 = r15;
        r11 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0393, code lost:
    
        r7 = r14;
        r6 = r6;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0396, code lost:
    
        r3 = ivas.gov.bisp.enumeration.aM.C0071a.b(r2, ivas.gov.bisp.enumeration.aM.C0076t.z, r3.al(r4, r7, r6, r9));
        r4 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r6 = ((r4 ^ 29) - (~((r4 & 29) << 1))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.a = r6 % 128;
        r6 = r6 % 2;
        r4 = r0.x;
        r5 = r5;
        r6 = r8;
        r7 = r10;
        r8 = ivas.gov.bisp.enumeration.aM.C0076t.a;
        r10 = r8 & 3;
        r9 = ((((r8 ^ 3) | r10) << 1) - (~(-((r8 | 3) & (~r10))))) - 1;
        ivas.gov.bisp.enumeration.aM.C0076t.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03cd, code lost:
    
        if ((r9 % 2) == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03cf, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aM.C0071a.b(r2, ivas.gov.bisp.enumeration.aM.C0076t.B, r4.al(r5, r6, r7, r20));
        r5 = new android.animation.AnimatorSet();
        r6 = new android.animation.Animator[2];
        r7 = ivas.gov.bisp.enumeration.aM.C0076t.b;
        r8 = r7 & 99;
        r7 = (r7 | 99) & (~r8);
        r8 = r8 << 1;
        r10 = (r7 & r8) + (r7 | r8);
        ivas.gov.bisp.enumeration.aM.C0076t.a = r10 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.aM.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator o(android.view.ViewGroup r23, ivas.gov.bisp.enumeration.aM.T r24, ivas.gov.bisp.enumeration.aM.T r25) {
        /*
            Method dump skipped, instruction units count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aM.C0076t.o(android.view.ViewGroup, ivas.gov.bisp.enumeration.aM.T, ivas.gov.bisp.enumeration.aM.T):android.animation.Animator");
    }
}
