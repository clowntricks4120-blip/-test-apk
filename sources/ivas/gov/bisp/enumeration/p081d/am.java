package ivas.gov.bisp.enumeration.p081d;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import ivas.gov.bisp.enumeration.p007ag.c;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class am {
    private static int a = 1;
    private static int b;
    public static final am c;
    public final aWD d;

    public static class aWC extends aWB {
        public aWC() {
        }

        public aWC(am amVar) {
            super(amVar);
        }
    }

    public static class aWE extends aWD {
        private static int a = 0;
        private static int b = 1;
        public static Method e;
        public static boolean f;
        public static Class<?> g;
        public static Field h;
        public static Field i;
        public final WindowInsets j;
        public c[] k;
        public am l;
        public c m;
        public c n;

        public aWE(am amVar, WindowInsets windowInsets) {
            super(amVar);
            this.m = null;
            this.j = windowInsets;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 56) + ((i3 & 56) << 1)) - 1;
            a = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                super.equals(obj);
                obj2.hashCode();
                throw null;
            }
            if (!super.equals(obj)) {
                int i5 = b + 121;
                int i6 = i5 % 128;
                a = i6;
                int i7 = i5 % 2;
                int i8 = (i6 ^ 5) + ((i6 & 5) << 1);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 73 / 0;
                }
                return false;
            }
            c cVar = this.n;
            c cVar2 = ((aWE) obj).n;
            int i10 = b + 17;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                Objects.equals(cVar, cVar2);
                obj2.hashCode();
                throw null;
            }
            boolean zEquals = Objects.equals(cVar, cVar2);
            int i11 = a;
            int i12 = i11 & 23;
            int i13 = (((i11 | 23) & (~i12)) - (~(i12 << 1))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return zEquals;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public void g(View view) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 87;
            int i5 = ((i3 ^ 87) | i4) << 1;
            int i6 = -((i3 | 87) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            c cVarQ = q(view);
            if (cVarQ == null) {
                int i9 = a;
                int i10 = (i9 & 97) + (i9 | 97);
                b = i10 % 128;
                int i11 = i10 % 2;
                cVarQ = c.c;
                int i12 = b;
                int i13 = (i12 ^ 115) + ((i12 & 115) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            y(cVarQ);
            int i15 = b;
            int i16 = (i15 ^ 67) + ((i15 & 67) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 67 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public boolean m() {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 42) << 1) - (i3 ^ 42)) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsRound = this.j.isRound();
            int i6 = b + 73;
            a = i6 % 128;
            int i7 = i6 % 2;
            return zIsRound;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public void n(c[] cVarArr) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 67) - (~(-(-((i3 & 67) << 1))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            this.k = cVarArr;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = (i3 ^ 101) + ((i3 & 101) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public void p(am amVar) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 5;
            int i5 = (i3 ^ 5) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            this.l = amVar;
            int i9 = i7 & 17;
            int i10 = i7 | 17;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
        }

        public void y(c cVar) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 47;
            int i5 = ((i3 ^ 47) | i4) << 1;
            int i6 = -((i3 | 47) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            this.n = cVar;
            int i10 = i8 ^ 119;
            int i11 = -(-((i8 & 119) << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003e  */
        /* JADX WARN: Code duplicated, block: B:13:0x0052  */
        /* JADX WARN: Code duplicated, block: B:14:0x0056  */
        /* JADX WARN: Code duplicated, block: B:25:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x008a  */
        /* JADX WARN: Code duplicated, block: B:29:0x009c A[Catch: ReflectiveOperationException -> 0x00a5, TRY_ENTER, TryCatch #1 {ReflectiveOperationException -> 0x00a5, blocks: (B:29:0x009c, B:38:0x00d6, B:42:0x00fe, B:45:0x0119, B:47:0x0121, B:51:0x0125, B:34:0x00a8), top: B:69:0x009a }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: ReflectiveOperationException -> 0x00a5, TRY_LEAVE, TryCatch #1 {ReflectiveOperationException -> 0x00a5, blocks: (B:29:0x009c, B:38:0x00d6, B:42:0x00fe, B:45:0x0119, B:47:0x0121, B:51:0x0125, B:34:0x00a8), top: B:69:0x009a }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00fc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00fe A[Catch: ReflectiveOperationException -> 0x00a5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ReflectiveOperationException -> 0x00a5, blocks: (B:29:0x009c, B:38:0x00d6, B:42:0x00fe, B:45:0x0119, B:47:0x0121, B:51:0x0125, B:34:0x00a8), top: B:69:0x009a }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0119 A[Catch: ReflectiveOperationException -> 0x00a5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ReflectiveOperationException -> 0x00a5, blocks: (B:29:0x009c, B:38:0x00d6, B:42:0x00fe, B:45:0x0119, B:47:0x0121, B:51:0x0125, B:34:0x00a8), top: B:69:0x009a }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0125 A[Catch: ReflectiveOperationException -> 0x00a5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ReflectiveOperationException -> 0x00a5, blocks: (B:29:0x009c, B:38:0x00d6, B:42:0x00fe, B:45:0x0119, B:47:0x0121, B:51:0x0125, B:34:0x00a8), top: B:69:0x009a }] */
        /* JADX WARN: Code duplicated, block: B:53:0x013f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0159 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x015a  */
        /* JADX WARN: Code duplicated, block: B:58:0x015b  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        
            if (r9 == null) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private ivas.gov.bisp.enumeration.p007ag.c q(android.view.View r9) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.d.am.aWE.q(android.view.View):ivas.gov.bisp.enumeration.ag.c");
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public final c k() {
            int systemWindowInsetRight;
            WindowInsets windowInsets;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 31;
            int i5 = (((i3 ^ 31) | i4) << 1) - ((~i4) & (i3 | 31));
            a = i5 % 128;
            int i6 = i5 % 2;
            if (this.m == null) {
                int i7 = (i3 & 123) + (i3 | 123);
                a = i7 % 128;
                int i8 = i7 % 2;
                int systemWindowInsetLeft = this.j.getSystemWindowInsetLeft();
                int systemWindowInsetTop = this.j.getSystemWindowInsetTop();
                int i9 = b;
                int i10 = (i9 ^ 69) + ((i9 & 69) << 1);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    systemWindowInsetRight = this.j.getSystemWindowInsetRight();
                    windowInsets = this.j;
                    int i11 = 83 / 0;
                } else {
                    systemWindowInsetRight = this.j.getSystemWindowInsetRight();
                    windowInsets = this.j;
                }
                c cVarC = c.c(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, windowInsets.getSystemWindowInsetBottom());
                int i12 = a + 119;
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                this.m = cVarC;
                int i15 = (i13 ^ 81) + ((i13 & 81) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            c cVar = this.m;
            int i17 = a;
            int i18 = i17 & 73;
            int i19 = ((i17 ^ 73) | i18) << 1;
            int i20 = -((i17 | 73) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                return cVar;
            }
            throw null;
        }

        @SuppressLint({"PrivateApi"})
        private static void r() {
            Class<?> cls;
            int i2 = 2 % 2;
            int i3 = b + 119;
            a = i3 % 128;
            int i4 = i3 % 2;
            try {
                e = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                int i5 = b;
                int i6 = ((i5 & 22) + (i5 | 22)) - 1;
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    cls = Class.forName("android.view.View$AttachInfo");
                    g = cls;
                    int i7 = 20 / 0;
                } else {
                    cls = Class.forName("android.view.View$AttachInfo");
                    g = cls;
                }
                int i8 = a;
                int i9 = i8 & 87;
                int i10 = ((i8 ^ 87) | i9) << 1;
                int i11 = -((i8 | 87) & (~i9));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                h = cls.getDeclaredField("mVisibleInsets");
                Class<?> cls2 = Class.forName("android.view.ViewRootImpl");
                int i14 = a;
                int i15 = i14 & 35;
                int i16 = ((((i14 ^ 35) | i15) << 1) - (~(-((i14 | 35) & (~i15))))) - 1;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    i = cls2.getDeclaredField("mAttachInfo");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i = cls2.getDeclaredField("mAttachInfo");
                Field field = h;
                int i17 = a;
                int i18 = i17 & 29;
                int i19 = (i17 ^ 29) | i18;
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                int i21 = i20 % 2;
                field.setAccessible(true);
                i.setAccessible(true);
                int i22 = a;
                int i23 = ((i22 & (-74)) | ((~i22) & 73)) + ((i22 & 73) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                f = true;
                int i25 = a;
                int i26 = (-2) - ((((i25 | 6) << 1) - (i25 ^ 6)) ^ (-1));
                b = i26 % 128;
                int i27 = i26 % 2;
            } catch (ReflectiveOperationException e2) {
                StringBuilder sbW = j.w("Failed to get visible insets. (Reflection error). ");
                sbW.append(e2.getMessage());
                Log.e("WindowInsetsCompat", sbW.toString(), e2);
            }
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public am c(int i2, int i3, int i4, int i5) {
            aWz awa;
            int i6 = 2 % 2;
            int i7 = a + 33;
            b = i7 % 128;
            int i8 = i7 % 2;
            am amVarF = am.f(this.j);
            int i9 = Build.VERSION.SDK_INT;
            int i10 = a;
            int i11 = i10 & 47;
            int i12 = (i11 - (~(-(-((i10 ^ 47) | i11))))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            if (i9 >= 30) {
                awa = new aWC(amVarF);
                int i14 = b + 109;
                a = i14 % 128;
                int i15 = i14 % 2;
            } else if (i9 >= 29) {
                awa = new aWB(amVarF);
                int i16 = b + 101;
                a = i16 % 128;
                int i17 = i16 % 2;
            } else {
                awa = new aWA(amVarF);
                int i18 = b;
                int i19 = i18 & 13;
                int i20 = (i19 - (~(-(-((i18 ^ 13) | i19))))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
            }
            c cVarE = am.e(k(), i2, i3, i4, i5);
            int i22 = b;
            int i23 = ((i22 & (-22)) | ((~i22) & 21)) + ((i22 & 21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            awa.g(cVarE);
            c cVarE2 = am.e(j(), i2, i3, i4, i5);
            int i25 = b + 99;
            a = i25 % 128;
            int i26 = i25 % 2;
            awa.f(cVarE2);
            am amVarE = awa.e();
            int i27 = a;
            int i28 = i27 & 121;
            int i29 = (i27 ^ 121) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            if (i30 % 2 != 0) {
                return amVarE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class aWG extends aWF {
        private static int a = 1;
        private static int b;

        public aWG(am amVar, WindowInsets windowInsets) {
            super(amVar, windowInsets);
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public am d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
            a = i3 % 128;
            int i4 = i3 % 2;
            am amVarF = am.f(this.j.consumeDisplayCutout());
            int i5 = a;
            int i6 = i5 & 71;
            int i7 = i5 | 71;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return amVarF;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0098  */
        @Override // ivas.gov.bisp.enumeration.d.am.aWE, ivas.gov.bisp.enumeration.d.am.aWD
        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 39) + (i2 | 39);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i6 = i4 & 117;
                int i7 = -(-(i4 | 117));
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i4 + 94;
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            boolean z = false;
            if (!(obj instanceof aWG)) {
                int i12 = ((i2 | 91) << 1) - (i2 ^ 91);
                b = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i2 & 21;
                int i15 = i14 + ((i2 ^ 21) | i14);
                b = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            aWG awg = (aWG) obj;
            WindowInsets windowInsets = this.j;
            WindowInsets windowInsets2 = awg.j;
            int i17 = b;
            int i18 = i17 & 105;
            int i19 = -(-((i17 ^ 105) | i18));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                Objects.equals(windowInsets, windowInsets2);
                throw null;
            }
            if (!(!Objects.equals(windowInsets, windowInsets2))) {
                int i21 = b;
                int i22 = i21 & 109;
                int i23 = ((i21 ^ 109) | i22) << 1;
                int i24 = -((i21 | 109) & (~i22));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                a = i25 % 128;
                int i26 = i25 % 2;
                if (!(!Objects.equals(this.n, awg.n))) {
                    z = true;
                } else {
                    int i27 = a;
                    int i28 = i27 & 29;
                    int i29 = (i27 ^ 29) | i28;
                    int i30 = (i28 & i29) + (i29 | i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
            } else {
                int i210 = a;
                int i211 = i210 & 29;
                int i212 = (i210 ^ 29) | i211;
                int i32 = (i211 & i212) + (i212 | i211);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
            int i34 = a;
            int i35 = i34 & 115;
            int i36 = (i34 ^ 115) | i35;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
            return z;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public int hashCode() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.j.hashCode();
            int i5 = b + 95;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003b  */
        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
        /* JADX WARN: Code duplicated, block: B:13:0x004e A[PHI: r1
  0x004e: PHI (r1v18 android.view.DisplayCutout) = (r1v6 android.view.DisplayCutout), (r1v24 android.view.DisplayCutout) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:9:0x0028  */
        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public C0288r i() {
            DisplayCutout displayCutout;
            int i;
            int i2;
            C0288r c0288r;
            int i3 = 2 % 2;
            int i4 = a + 90;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                displayCutout = this.j.getDisplayCutout();
                int i6 = 29 / 0;
                if (displayCutout == null) {
                    i = b;
                    i2 = ((i ^ 84) + ((i & 84) << 1)) - 1;
                    a = i2 % 128;
                    c0288r = null;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i7 = i & 125;
                    int i8 = -(-(i | 125));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    c0288r = new C0288r(displayCutout);
                    int i11 = a;
                    int i12 = i11 & 35;
                    int i13 = i12 + ((i11 ^ 35) | i12);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                displayCutout = this.j.getDisplayCutout();
                if (displayCutout == null) {
                    i = b;
                    i2 = ((i ^ 84) + ((i & 84) << 1)) - 1;
                    a = i2 % 128;
                    c0288r = null;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i15 = i & 125;
                    int i16 = -(-(i | 125));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    c0288r = new C0288r(displayCutout);
                    int i19 = a;
                    int i110 = i19 & 35;
                    int i111 = i110 + ((i19 ^ 35) | i110);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                }
            }
            int i20 = b;
            int i21 = (i20 ^ 113) + ((i20 & 113) << 1);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 55 / 0;
            }
            return c0288r;
        }
    }

    public static class aWI extends aWH {
        private static int a = 1;
        private static int b;
        public static final am s = am.f(WindowInsets.CONSUMED);

        static {
            int i = b;
            int i2 = (i | 5) << 1;
            int i3 = -(i ^ 5);
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public aWI(am amVar, WindowInsets windowInsets) {
            super(amVar, windowInsets);
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWE, ivas.gov.bisp.enumeration.d.am.aWD
        public final void g(View view) {
            int i = 2 % 2;
            int i2 = b + 87;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class aWy {
        private static int a = 0;
        private static int b = 1;
        public static Field c;
        public static Field d;
        public static Field e;
        public static boolean f;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                c = declaredField;
                declaredField.setAccessible(true);
                int i = b;
                int i2 = i ^ 31;
                int i3 = ((((i & 31) | i2) << 1) - (~(-i2))) - 1;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    d = Class.forName("android.view.View$AttachInfo").getDeclaredField("mStableInsets");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                d = declaredField2;
                int i4 = a + 87;
                b = i4 % 128;
                int i5 = i4 % 2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                e = declaredField3;
                int i6 = b;
                int i7 = i6 & 57;
                int i8 = ((i6 ^ 57) | i7) << 1;
                int i9 = -((i6 | 57) & (~i7));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                declaredField3.setAccessible(true);
                f = true;
                int i12 = b;
                int i13 = i12 & 113;
                int i14 = i12 | 113;
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            } catch (ReflectiveOperationException e2) {
                e2.getMessage();
            }
        }
    }

    public static class aWz {
        private static int a = 0;
        private static int b = 1;
        public final am c;

        public aWz() {
            this(new am((am) null));
        }

        public final void d() {
            int i = 2 % 2;
            int i2 = a + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
        }

        public am e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 30) + ((i2 & 30) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            throw null;
        }

        public void f(c cVar) {
            int i = 2 % 2;
            int i2 = a + 117;
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            obj.hashCode();
            throw null;
        }

        public void g(c cVar) {
            int i = 2 % 2;
            int i2 = a + 50;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            throw null;
        }

        public aWz(am amVar) {
            this.c = amVar;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 30) {
            c = aWD.c;
            int i = b;
            int i2 = (((i | 86) << 1) - (i ^ 86)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = a + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
        c = aWI.s;
        int i6 = a;
        int i7 = i6 & 55;
        int i8 = (i7 - (~((i6 ^ 55) | i7))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public am(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        Object obj = null;
        if (i >= 30) {
            this.d = new aWI(this, windowInsets);
            int i2 = b + 21;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i >= 29) {
            this.d = new aWH(this, windowInsets);
            int i3 = b;
            int i4 = (i3 & 11) + (i3 | 11);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i >= 28) {
            this.d = new aWG(this, windowInsets);
            int i5 = a;
            int i6 = ((i5 & (-92)) | ((~i5) & 91)) + ((i5 & 91) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 69 / 0;
                return;
            }
            return;
        }
        this.d = new aWF(this, windowInsets);
        int i8 = a;
        int i9 = ((i8 ^ 89) | (i8 & 89)) << 1;
        int i10 = -(((~i8) & 89) | (i8 & (-90)));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static am f(WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            d(windowInsets, null);
            obj.hashCode();
            throw null;
        }
        am amVarD = d(windowInsets, null);
        int i4 = b;
        int i5 = i4 & 27;
        int i6 = (((i4 ^ 27) | i5) << 1) - ((i4 | 27) & (~i5));
        a = i6 % 128;
        int i7 = i6 % 2;
        return amVarD;
    }

    @Deprecated
    public int g() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = (i3 | 95) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        c cVarK = this.d.k();
        if (i8 != 0) {
            i = cVarK.g;
            int i9 = 35 / 0;
        } else {
            i = cVarK.g;
        }
        int i10 = a;
        int i11 = (i10 ^ 99) + ((i10 & 99) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return i;
        }
        throw null;
    }

    @Deprecated
    public int h() {
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        c cVarK = this.d.k();
        if (i3 == 0) {
            return cVarK.d;
        }
        int i4 = 51 / 0;
        return cVarK.d;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-76)) | ((~i2) & 75)) + ((i2 & 75) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        aWD awd = this.d;
        if (awd == null) {
            int i5 = i2 & 11;
            int i6 = i5 + ((i2 ^ 11) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = awd.hashCode();
            int i8 = a;
            int i9 = (i8 & 65) + (i8 | 65);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (((i11 ^ 79) | (i11 & 79)) << 1) - (((~i11) & 79) | (i11 & (-80)));
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public int i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = (((i2 ^ 23) | i3) << 1) - ((i2 | 23) & (~i3));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.k().f;
        }
        int i5 = 48 / 0;
        return this.d.k().f;
    }

    @Deprecated
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d.k().e;
        int i6 = b;
        int i7 = ((i6 | 35) << 1) - (i6 ^ 35);
        a = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public boolean k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 80) + ((i2 & 80) << 1)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.l();
            throw null;
        }
        boolean zL = this.d.l();
        int i4 = a;
        int i5 = ((i4 ^ 59) | (i4 & 59)) << 1;
        int i6 = -(((~i4) & 59) | (i4 & (-60)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return zL;
    }

    public WindowInsets l() {
        WindowInsets windowInsets;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 23) - (~(-(-(i2 | 23))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        aWD awd = this.d;
        Object obj = null;
        if (awd instanceof aWE) {
            int i5 = i2 | 27;
            int i6 = i5 << 1;
            int i7 = -((~(i2 & 27)) & i5);
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            aWE awe = (aWE) awd;
            if (i8 % 2 == 0) {
                WindowInsets windowInsets2 = awe.j;
                throw null;
            }
            windowInsets = awe.j;
        } else {
            int i9 = i2 + 37;
            a = i9 % 128;
            int i10 = i9 % 2;
            windowInsets = null;
        }
        int i11 = b;
        int i12 = i11 & 113;
        int i13 = ((i11 | 113) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return windowInsets;
        }
        obj.hashCode();
        throw null;
    }

    public static class aWA extends aWz {
        private static int a = 1;
        private static int b;
        public static Field d;
        public static Constructor<WindowInsets> e;
        public static boolean f;
        public static boolean g;
        public WindowInsets h;
        public c i;

        public aWA() {
            this.h = h();
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public void f(c cVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 108) + ((i2 & 108) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            this.i = cVar;
            int i7 = (-2) - ((i5 + 114) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public void g(c cVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-8)) | ((~i2) & 7);
            int i4 = (i2 & 7) << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            WindowInsets windowInsets = this.h;
            if (windowInsets != null) {
                int i7 = ((i2 ^ 15) | (i2 & 15)) << 1;
                int i8 = -(((~i2) & 15) | (i2 & (-16)));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = cVar.d;
                int i12 = cVar.e;
                int i13 = cVar.f;
                int i14 = a + 57;
                b = i14 % 128;
                int i15 = i14 % 2;
                this.h = windowInsets.replaceSystemWindowInsets(i11, i12, i13, cVar.g);
                int i16 = b;
                int i17 = i16 & 19;
                int i18 = (i16 ^ 19) | i17;
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = a;
            int i22 = i21 & 23;
            int i23 = i22 + ((i21 ^ 23) | i22);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 10 / 0;
            }
        }

        public aWA(am amVar) {
            super(amVar);
            this.h = amVar.l();
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public am e() {
            int i = 2 % 2;
            int i2 = a + 65;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                d();
                aWD awd = am.f(this.h).d;
                throw null;
            }
            d();
            am amVarF = am.f(this.h);
            aWD awd2 = amVarF.d;
            int i3 = a;
            int i4 = (i3 & 105) + (i3 | 105);
            b = i4 % 128;
            int i5 = i4 % 2;
            awd2.n(null);
            amVarF.d.o(this.i);
            int i6 = a;
            int i7 = ((i6 ^ 64) + ((i6 & 64) << 1)) - 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 102;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 37 / 0;
            }
            return amVarF;
        }

        private static WindowInsets h() {
            WindowInsets windowInsetsNewInstance;
            Constructor<WindowInsets> constructor;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 85) + (i2 | 85);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            Object obj = null;
            if (!f) {
                int i6 = ((i4 & (-10)) | ((~i4) & 9)) + ((i4 & 9) << 1);
                a = i6 % 128;
                try {
                    if (i6 % 2 == 0) {
                        d = WindowInsets.class.getDeclaredField("CONSUMED");
                        obj.hashCode();
                        throw null;
                    }
                    d = WindowInsets.class.getDeclaredField("CONSUMED");
                    f = true;
                    int i7 = b + 63;
                    a = i7 % 128;
                    int i8 = i7 % 2;
                } catch (ReflectiveOperationException unused) {
                }
            }
            Field field = d;
            if (field != null) {
                int i9 = a;
                int i10 = (((i9 | 44) << 1) - (i9 ^ 44)) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
                        int i12 = a;
                        int i13 = ((i12 ^ 6) + ((i12 & 6) << 1)) - 1;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        return windowInsets2;
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!g) {
                int i15 = a;
                int i16 = (i15 ^ 91) + ((i15 & 91) << 1);
                b = i16 % 128;
                try {
                    if (i16 % 2 != 0) {
                        Class[] clsArr = new Class[0];
                        clsArr[0] = Rect.class;
                        constructor = WindowInsets.class.getConstructor(clsArr);
                    } else {
                        constructor = WindowInsets.class.getConstructor(Rect.class);
                    }
                    int i17 = a;
                    int i18 = i17 & 49;
                    int i19 = ((i17 ^ 49) | i18) << 1;
                    int i20 = -((i17 | 49) & (~i18));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        e = constructor;
                        throw null;
                    }
                    e = constructor;
                    g = true;
                    int i22 = a;
                    int i23 = (i22 & 59) + (i22 | 59);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                } catch (ReflectiveOperationException unused3) {
                }
            }
            Constructor<WindowInsets> constructor2 = e;
            if (constructor2 != null) {
                try {
                    Object[] objArr = new Object[1];
                    Rect rect = new Rect();
                    int i25 = b;
                    int i26 = i25 & 55;
                    int i27 = (i25 | 55) & (~i26);
                    int i28 = -(-(i26 << 1));
                    int i29 = (i27 & i28) + (i27 | i28);
                    a = i29 % 128;
                    if (i29 % 2 == 0) {
                        objArr[0] = rect;
                        windowInsetsNewInstance = constructor2.newInstance(objArr);
                    } else {
                        objArr[0] = rect;
                        windowInsetsNewInstance = constructor2.newInstance(objArr);
                    }
                    int i30 = b;
                    int i31 = (-2) - (((i30 & 8) + (i30 | 8)) ^ (-1));
                    a = i31 % 128;
                    if (i31 % 2 != 0) {
                        return windowInsetsNewInstance;
                    }
                    obj.hashCode();
                    throw null;
                } catch (ReflectiveOperationException unused4) {
                }
            }
            int i32 = b;
            int i33 = i32 & 41;
            int i34 = ((i32 ^ 41) | i33) << 1;
            int i35 = -((i32 | 41) & (~i33));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    public static class aWB extends aWz {
        private static int a = 0;
        private static int b = 1;
        public final WindowInsets.Builder d;

        public aWB() {
            this.d = new WindowInsets.Builder();
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public void f(c cVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 23) + (i2 | 23);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.d.setStableInsets(cVar.e());
            int i5 = b + 73;
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public void g(c cVar) {
            int i = 2 % 2;
            int i2 = a + 61;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                this.d.setSystemWindowInsets(cVar.e());
                int i3 = 28 / 0;
            } else {
                this.d.setSystemWindowInsets(cVar.e());
            }
            int i4 = a;
            int i5 = i4 & 33;
            int i6 = ((((i4 ^ 33) | i5) << 1) - (~(-((i4 | 33) & (~i5))))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public aWB(am amVar) {
            WindowInsets.Builder builder;
            super(amVar);
            WindowInsets windowInsetsL = amVar.l();
            if (windowInsetsL != null) {
                builder = new WindowInsets.Builder(windowInsetsL);
                int i = a;
                int i2 = ((i ^ 1) | (i & 1)) << 1;
                int i3 = -(((~i) & 1) | (i & (-2)));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } else {
                builder = new WindowInsets.Builder();
                int i7 = b;
                int i8 = i7 & 49;
                int i9 = (i7 ^ 49) | i8;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            }
            this.d = builder;
            int i13 = b;
            int i14 = i13 & 47;
            int i15 = (i14 - (~(-(-((i13 ^ 47) | i14))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWz
        public am e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            d();
            am amVarF = am.f(this.d.build());
            int i5 = b + 57;
            a = i5 % 128;
            int i6 = i5 % 2;
            amVarF.d.n(null);
            int i7 = b;
            int i8 = i7 & 17;
            int i9 = (i7 ^ 17) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            return amVarF;
        }
    }

    public static class aWH extends aWG {
        private static int a = 1;
        private static int b;
        public c p;
        public c q;
        public c r;

        public aWH(am amVar, WindowInsets windowInsets) {
            super(amVar, windowInsets);
            this.p = null;
            this.q = null;
            this.r = null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWE, ivas.gov.bisp.enumeration.d.am.aWD
        public am c(int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = (-2) - ((a + 36) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            am amVarF = am.f(this.j.inset(i, i2, i3, i4));
            int i8 = b;
            int i9 = (i8 & (-8)) | ((~i8) & 7);
            int i10 = (i8 & 7) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return amVarF;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWF, ivas.gov.bisp.enumeration.d.am.aWD
        public void o(c cVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public c h() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 110) << 1) - (i2 ^ 110)) - 1;
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.q == null) {
                int i5 = ((i4 ^ 90) + ((i4 & 90) << 1)) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                this.q = c.d(this.j.getMandatorySystemGestureInsets());
                int i7 = b;
                int i8 = (i7 & (-50)) | ((~i7) & 49);
                int i9 = (i7 & 49) << 1;
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
            c cVar = this.q;
            int i12 = a;
            int i13 = i12 ^ 5;
            int i14 = -(-((i12 & 5) << 1));
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 82 / 0;
            }
            return cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static am d(WindowInsets windowInsets, View view) {
        int i;
        int i2 = 2 % 2;
        Objects.requireNonNull(windowInsets);
        am amVar = new am(windowInsets);
        int i3 = b;
        int i4 = i3 + 106;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
            if (view != null) {
                int i7 = ((i3 ^ 109) - (~(-(-((i3 & 109) << 1))))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                WeakHashMap<View, R> weakHashMap = T.c;
                if (T.aXa.c(view)) {
                    int i9 = a;
                    i = ((i9 & (-72)) | ((~i9) & 71)) + ((i9 & 71) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        amVar.d.p(T.aXe.b(view));
                        int i10 = 4 / 0;
                    } else {
                        amVar.d.p(T.aXe.b(view));
                    }
                    amVar.d.g(view.getRootView());
                    int i11 = a;
                    int i12 = ((i11 | 75) << 1) - (i11 ^ 75);
                    b = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        } else if (view != null) {
            int i14 = ((i3 ^ 109) - (~(-(-((i3 & 109) << 1))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (T.aXa.c(view)) {
                int i16 = a;
                i = ((i16 & (-72)) | ((~i16) & 71)) + ((i16 & 71) << 1);
                b = i % 128;
                if (i % 2 != 0) {
                    amVar.d.p(T.aXe.b(view));
                    int i17 = 4 / 0;
                } else {
                    amVar.d.p(T.aXe.b(view));
                }
                amVar.d.g(view.getRootView());
                int i18 = a;
                int i19 = ((i18 | 75) << 1) - (i18 ^ 75);
                b = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = a;
        int i21 = i20 & 63;
        int i22 = (i20 | 63) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 48 / 0;
        }
        return amVar;
    }

    public static c e(c cVar, int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        int iMax2;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 103;
        int i9 = (i7 | 103) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            iMax = Math.max(1, cVar.d >> i);
            i5 = 1;
        } else {
            int i12 = cVar.d;
            int i13 = -i;
            iMax = Math.max(0, ((((i12 ^ i13) | (i12 & i13)) << 1) - (~(-(((~i12) & i13) | ((~i13) & i12))))) - 1);
            i5 = 0;
        }
        int i14 = b;
        int i15 = ((i14 | 71) << 1) - (i14 ^ 71);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = cVar.e;
            int i17 = -(~(-i2));
            iMax2 = Math.max(i5, ((i16 ^ i17) + ((i16 & i17) << 1)) - 1);
        } else {
            int i18 = cVar.e;
            int i19 = -i2;
            int i20 = i18 & i19;
            iMax2 = Math.max(i5, i20 + ((i18 ^ i19) | i20));
        }
        int i21 = a;
        int i22 = i21 & 45;
        int i23 = (i21 | 45) & (~i22);
        int i24 = -(-(i22 << 1));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        b = i25 % 128;
        int i26 = i25 % 2;
        int i27 = cVar.f;
        int i28 = -i3;
        int i29 = i27 ^ i28;
        int iMax3 = Math.max(0, (((i27 & i28) | i29) << 1) - i29);
        int i30 = cVar.g;
        int i31 = b;
        int i32 = i31 & 119;
        int i33 = ((i31 ^ 119) | i32) << 1;
        int i34 = -((i31 | 119) & (~i32));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        a = i35 % 128;
        int i36 = i35 % 2;
        int i37 = -i4;
        int i38 = i30 & i37;
        int iMax4 = Math.max(0, i38 + ((i30 ^ i37) | i38));
        if (iMax == i) {
            int i39 = a;
            int i40 = i39 & 87;
            int i41 = i40 + ((i39 ^ 87) | i40);
            int i42 = i41 % 128;
            b = i42;
            int i43 = i41 % 2;
            if (iMax2 == i2) {
                int i44 = ((i42 ^ 16) + ((i42 & 16) << 1)) - 1;
                int i45 = i44 % 128;
                a = i45;
                Object obj = null;
                if (i44 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (iMax3 == i3) {
                    int i46 = i45 & 91;
                    int i47 = (((i45 | 91) & (~i46)) - (~(i46 << 1))) - 1;
                    int i48 = i47 % 128;
                    b = i48;
                    if (i47 % 2 != 0) {
                        throw null;
                    }
                    if (iMax4 == i4) {
                        int i49 = ((i48 | 5) << 1) - (i48 ^ 5);
                        a = i49 % 128;
                        int i50 = i49 % 2;
                        int i51 = i48 ^ 65;
                        int i52 = (i48 & 65) << 1;
                        int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                        a = i53 % 128;
                        if (i53 % 2 != 0) {
                            return cVar;
                        }
                        throw null;
                    }
                }
            }
        }
        c cVarC = c.c(iMax, iMax2, iMax3, iMax4);
        int i54 = b + 65;
        a = i54 % 128;
        int i55 = i54 % 2;
        return cVarC;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = i3 + ((i2 ^ 71) | i3);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i6 = ((i2 | 37) << 1) - (i2 ^ 37);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(!(obj instanceof am))) {
            aWD awd = this.d;
            aWD awd2 = ((am) obj).d;
            int i7 = (-2) - ((i5 + 42) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return Objects.equals(awd, awd2);
            }
            Objects.equals(awd, awd2);
            throw null;
        }
        int i8 = ((i2 | 95) << 1) - (i2 ^ 95);
        int i9 = i8 % 128;
        b = i9;
        boolean z = i8 % 2 != 0;
        int i10 = i9 | 1;
        int i11 = (i10 << 1) - ((~(i9 & 1)) & i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        return z;
    }

    public static class aWD {
        private static int a = 1;
        private static int b;
        public static final am c;
        public final am d;

        static {
            aWz awa;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                awa = new aWC();
                int i2 = a;
                int i3 = (i2 & (-26)) | ((~i2) & 25);
                int i4 = (i2 & 25) << 1;
                int i5 = (i3 & i4) + (i4 | i3);
                b = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } else if (i >= 29) {
                awa = new aWB();
                int i8 = b;
                int i9 = i8 & 85;
                int i10 = (i9 - (~(-(-((i8 ^ 85) | i9))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } else {
                awa = new aWA();
                int i13 = b;
                int i14 = i13 & 109;
                int i15 = (i13 | 109) & (~i14);
                int i16 = i14 << 1;
                int i17 = (i15 & i16) + (i15 | i16);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 2 % 2;
                }
            }
            aWD awd = awa.e().d.d().d;
            int i19 = b;
            int i20 = i19 ^ 71;
            int i21 = -(-((i19 & 71) << 1));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            c = awd.e().d.f();
            int i24 = b;
            int i25 = i24 & 51;
            int i26 = i24 | 51;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 40 / 0;
            }
        }

        public aWD(am amVar) {
            this.d = amVar;
        }

        public am c(int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = (-2) - ((((i6 | 42) << 1) - (i6 ^ 42)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            am amVar = c;
            int i8 = (i6 & 27) + (i6 | 27);
            b = i8 % 128;
            int i9 = i8 % 2;
            return amVar;
        }

        public am d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 91;
            int i4 = -(-((i2 & 91) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return this.d;
            }
            throw null;
        }

        public am e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 25;
            int i4 = ((i2 ^ 25) | i3) << 1;
            int i5 = -((i2 | 25) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            am amVar = this.d;
            int i9 = i7 & 99;
            int i10 = (i9 - (~(-(-((i7 ^ 99) | i9))))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 0;
            }
            return amVar;
        }

        public am f() {
            int i = 2 % 2;
            int i2 = b + 31;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            am amVar = this.d;
            int i5 = i3 & 1;
            int i6 = (i3 ^ 1) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 14 / 0;
            }
            return amVar;
        }

        public void g(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 83) + (i2 | 83);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        public c h() {
            c cVarK;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 113;
            int i4 = (((i2 | 113) & (~i3)) - (~(i3 << 1))) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                cVarK = k();
                int i5 = 46 / 0;
            } else {
                cVarK = k();
            }
            int i6 = a;
            int i7 = (i6 & (-112)) | ((~i6) & 111);
            int i8 = (i6 & 111) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            return cVarK;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 116) + (i2 | 116)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            char c2 = 5;
            Object[] objArr = new Object[5];
            Boolean boolValueOf = Boolean.valueOf(m());
            int i5 = a;
            int i6 = i5 & 111;
            int i7 = (i6 - (~(-(-((i5 ^ 111) | i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = boolValueOf;
            objArr[1] = Boolean.valueOf(l());
            int i9 = b + 121;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                objArr[2] = k();
                objArr[3] = j();
            } else {
                objArr[2] = k();
                objArr[3] = j();
                c2 = 4;
            }
            int i10 = a + 73;
            b = i10 % 128;
            int i11 = i10 % 2;
            objArr[c2] = i();
            int iHash = Objects.hash(objArr);
            int i12 = b;
            int i13 = (i12 & 1) + (1 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            return iHash;
        }

        public C0288r i() {
            int i = 2 % 2;
            int i2 = b + 87;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public c j() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((((i2 | 32) << 1) - (i2 ^ 32)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            c cVar = c.c;
            int i5 = b;
            int i6 = i5 & 111;
            int i7 = (((i5 ^ 111) | i6) << 1) - ((i5 | 111) & (~i6));
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 26 / 0;
            }
            return cVar;
        }

        public c k() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 75;
            int i4 = -(-(i2 | 75));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            c cVar = c.c;
            int i7 = b;
            int i8 = (i7 & 126) + (i7 | 126);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return cVar;
        }

        public boolean l() {
            int i = 2 % 2;
            int i2 = a + 19;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public boolean m() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 55;
            int i4 = -(-(i2 | 55));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = (i6 & (-32)) | ((~i6) & 31);
            int i9 = -(-((i6 & 31) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public void n(c[] cVarArr) {
            int i = 2 % 2;
            int i2 = b + 35;
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        public void o(c cVar) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 40) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        public void p(am amVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-42)) | ((~i2) & 41)) + ((i2 & 41) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0035  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x007a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:39:0x0100  */
        /* JADX WARN: Code duplicated, block: B:41:0x010e  */
        /* JADX WARN: Code duplicated, block: B:42:0x0110  */
        /* JADX WARN: Code duplicated, block: B:44:0x011f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0129  */
        public boolean equals(Object obj) {
            boolean z;
            int i;
            aWD awd;
            boolean z2;
            int i2;
            c cVarK;
            c cVarK2;
            int i3;
            c cVarJ;
            c cVarJ2;
            int i4;
            int i5;
            boolean zEquals;
            int i6 = 2 % 2;
            int i7 = b;
            int i8 = ((i7 | 37) << 1) - (i7 ^ 37);
            int i9 = i8 % 128;
            a = i9;
            Object obj2 = null;
            if (i8 % 2 == 0) {
                if (this != obj) {
                    z = false;
                    if (!(obj instanceof aWD)) {
                        int i10 = i9 & 119;
                        int i11 = ((((i9 ^ 119) | i10) << 1) - (~(-((~i10) & (i9 | 119))))) - 1;
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i9 + 93;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        return false;
                    }
                    awd = (aWD) obj;
                    if (m() == awd.m()) {
                        int i15 = b;
                        i2 = (((i15 | 6) << 1) - (i15 ^ 6)) - 1;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i16 = 19 / 0;
                            if (l() == awd.l()) {
                                int i17 = b;
                                int i18 = (i17 & 71) + (i17 | 71);
                                a = i18 % 128;
                                int i19 = i18 % 2;
                                cVarK = k();
                                cVarK2 = awd.k();
                                int i20 = a;
                                int i21 = i20 ^ 115;
                                int i22 = (((i20 & 115) | i21) << 1) - i21;
                                b = i22 % 128;
                                int i23 = i22 % 2;
                                if (Objects.equals(cVarK, cVarK2)) {
                                    int i24 = a;
                                    int i25 = i24 & 67;
                                    int i26 = (i24 | 67) & (~i25);
                                    int i27 = -(-(i25 << 1));
                                    i3 = (i26 ^ i27) + ((i26 & i27) << 1);
                                    b = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        j();
                                        awd.j();
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    cVarJ = j();
                                    cVarJ2 = awd.j();
                                    int i28 = a;
                                    i4 = (-2) - (((i28 & 84) + (i28 | 84)) ^ (-1));
                                    b = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        zEquals = Objects.equals(cVarJ, cVarJ2);
                                        int i29 = 84 / 0;
                                        if (!(!zEquals)) {
                                            int i30 = b;
                                            i5 = (-2) - (((i30 & 42) + (i30 | 42)) ^ (-1));
                                            a = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                Objects.equals(i(), awd.i());
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            z2 = Objects.equals(i(), awd.i()) ? z : false;
                                        }
                                    } else if (Objects.equals(cVarJ, cVarJ2)) {
                                        int i31 = b;
                                        i5 = (-2) - (((i31 & 42) + (i31 | 42)) ^ (-1));
                                        a = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            Objects.equals(i(), awd.i());
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (Objects.equals(i(), awd.i())) {
                                        }
                                    }
                                }
                            }
                        } else if (l() == awd.l()) {
                            int i110 = b;
                            int i111 = (i110 & 71) + (i110 | 71);
                            a = i111 % 128;
                            int i112 = i111 % 2;
                            cVarK = k();
                            cVarK2 = awd.k();
                            int i210 = a;
                            int i211 = i210 ^ 115;
                            int i212 = (((i210 & 115) | i211) << 1) - i211;
                            b = i212 % 128;
                            int i213 = i212 % 2;
                            if (Objects.equals(cVarK, cVarK2)) {
                                int i214 = a;
                                int i215 = i214 & 67;
                                int i216 = (i214 | 67) & (~i215);
                                int i217 = -(-(i215 << 1));
                                i3 = (i216 ^ i217) + ((i216 & i217) << 1);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    j();
                                    awd.j();
                                    obj2.hashCode();
                                    throw null;
                                }
                                cVarJ = j();
                                cVarJ2 = awd.j();
                                int i218 = a;
                                i4 = (-2) - (((i218 & 84) + (i218 | 84)) ^ (-1));
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    zEquals = Objects.equals(cVarJ, cVarJ2);
                                    int i219 = 84 / 0;
                                    if (!(!zEquals)) {
                                        int i32 = b;
                                        i5 = (-2) - (((i32 & 42) + (i32 | 42)) ^ (-1));
                                        a = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            Objects.equals(i(), awd.i());
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (Objects.equals(i(), awd.i())) {
                                        }
                                    }
                                } else if (Objects.equals(cVarJ, cVarJ2)) {
                                    int i33 = b;
                                    i5 = (-2) - (((i33 & 42) + (i33 | 42)) ^ (-1));
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        Objects.equals(i(), awd.i());
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (Objects.equals(i(), awd.i())) {
                                    }
                                }
                            }
                        }
                        int i34 = a;
                        int i35 = ((i34 ^ 94) + ((i34 & 94) << 1)) - 1;
                        b = i35 % 128;
                        int i36 = i35 % 2;
                    } else {
                        int i37 = a;
                        int i38 = ((i37 ^ 94) + ((i37 & 94) << 1)) - 1;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    int i40 = b;
                    int i41 = ((i40 | 99) << 1) - (((~i40) & 99) | (i40 & (-100)));
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    return z2;
                }
                int i43 = i9 ^ 79;
                int i44 = -(-((i9 & 79) << 1));
                i = (i43 & i44) + (i43 | i44);
                b = i % 128;
                if (i % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (this != obj) {
                z = true;
                if (!(obj instanceof aWD)) {
                    int i113 = i9 & 119;
                    int i114 = ((((i9 ^ 119) | i113) << 1) - (~(-((~i113) & (i9 | 119))))) - 1;
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    int i116 = i9 + 93;
                    b = i116 % 128;
                    int i117 = i116 % 2;
                    return false;
                }
                awd = (aWD) obj;
                if (m() == awd.m()) {
                    int i118 = b;
                    i2 = (((i118 | 6) << 1) - (i118 ^ 6)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i119 = 19 / 0;
                        if (l() == awd.l()) {
                            int i1110 = b;
                            int i1111 = (i1110 & 71) + (i1110 | 71);
                            a = i1111 % 128;
                            int i1112 = i1111 % 2;
                            cVarK = k();
                            cVarK2 = awd.k();
                            int i2110 = a;
                            int i2111 = i2110 ^ 115;
                            int i2112 = (((i2110 & 115) | i2111) << 1) - i2111;
                            b = i2112 % 128;
                            int i2113 = i2112 % 2;
                            if (Objects.equals(cVarK, cVarK2)) {
                                int i2114 = a;
                                int i2115 = i2114 & 67;
                                int i2116 = (i2114 | 67) & (~i2115);
                                int i2117 = -(-(i2115 << 1));
                                i3 = (i2116 ^ i2117) + ((i2116 & i2117) << 1);
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    j();
                                    awd.j();
                                    obj2.hashCode();
                                    throw null;
                                }
                                cVarJ = j();
                                cVarJ2 = awd.j();
                                int i2118 = a;
                                i4 = (-2) - (((i2118 & 84) + (i2118 | 84)) ^ (-1));
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    zEquals = Objects.equals(cVarJ, cVarJ2);
                                    int i2119 = 84 / 0;
                                    if (!(!zEquals)) {
                                        int i310 = b;
                                        i5 = (-2) - (((i310 & 42) + (i310 | 42)) ^ (-1));
                                        a = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            Objects.equals(i(), awd.i());
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (Objects.equals(i(), awd.i())) {
                                        }
                                    }
                                } else if (Objects.equals(cVarJ, cVarJ2)) {
                                    int i311 = b;
                                    i5 = (-2) - (((i311 & 42) + (i311 | 42)) ^ (-1));
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        Objects.equals(i(), awd.i());
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (Objects.equals(i(), awd.i())) {
                                    }
                                }
                            }
                        }
                    } else if (l() == awd.l()) {
                        int i1113 = b;
                        int i1114 = (i1113 & 71) + (i1113 | 71);
                        a = i1114 % 128;
                        int i1115 = i1114 % 2;
                        cVarK = k();
                        cVarK2 = awd.k();
                        int i21110 = a;
                        int i21111 = i21110 ^ 115;
                        int i21112 = (((i21110 & 115) | i21111) << 1) - i21111;
                        b = i21112 % 128;
                        int i21113 = i21112 % 2;
                        if (Objects.equals(cVarK, cVarK2)) {
                            int i21114 = a;
                            int i21115 = i21114 & 67;
                            int i21116 = (i21114 | 67) & (~i21115);
                            int i21117 = -(-(i21115 << 1));
                            i3 = (i21116 ^ i21117) + ((i21116 & i21117) << 1);
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                j();
                                awd.j();
                                obj2.hashCode();
                                throw null;
                            }
                            cVarJ = j();
                            cVarJ2 = awd.j();
                            int i21118 = a;
                            i4 = (-2) - (((i21118 & 84) + (i21118 | 84)) ^ (-1));
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                zEquals = Objects.equals(cVarJ, cVarJ2);
                                int i21119 = 84 / 0;
                                if (!(!zEquals)) {
                                    int i312 = b;
                                    i5 = (-2) - (((i312 & 42) + (i312 | 42)) ^ (-1));
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        Objects.equals(i(), awd.i());
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (Objects.equals(i(), awd.i())) {
                                    }
                                }
                            } else if (Objects.equals(cVarJ, cVarJ2)) {
                                int i313 = b;
                                i5 = (-2) - (((i313 & 42) + (i313 | 42)) ^ (-1));
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    Objects.equals(i(), awd.i());
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (Objects.equals(i(), awd.i())) {
                                }
                            }
                        }
                    }
                    int i314 = a;
                    int i315 = ((i314 ^ 94) + ((i314 & 94) << 1)) - 1;
                    b = i315 % 128;
                    int i316 = i315 % 2;
                } else {
                    int i317 = a;
                    int i318 = ((i317 ^ 94) + ((i317 & 94) << 1)) - 1;
                    b = i318 % 128;
                    int i319 = i318 % 2;
                }
                int i45 = b;
                int i46 = ((i45 | 99) << 1) - (((~i45) & 99) | (i45 & (-100)));
                a = i46 % 128;
                int i47 = i46 % 2;
                return z2;
            }
            int i48 = i9 ^ 79;
            int i49 = -(-((i9 & 79) << 1));
            i = (i48 & i49) + (i48 | i49);
            b = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            throw null;
        }
    }

    public static class aWF extends aWE {
        private static int a = 1;
        private static int b;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public c f93o;

        public aWF(am amVar, WindowInsets windowInsets) {
            super(amVar, windowInsets);
            this.f93o = null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public am e() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 1;
            int i4 = (i2 ^ 1) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            am amVarF = am.f(this.j.consumeStableInsets());
            int i7 = b;
            int i8 = i7 & 91;
            int i9 = ((i7 ^ 91) | i8) << 1;
            int i10 = -((i7 | 91) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return amVarF;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public am f() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            am amVarF = am.f(this.j.consumeSystemWindowInsets());
            int i5 = a;
            int i6 = (i5 & 30) + (i5 | 30);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return amVarF;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public boolean l() {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 104) ^ (-1));
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.j.isConsumed();
                throw null;
            }
            boolean zIsConsumed = this.j.isConsumed();
            int i3 = b;
            int i4 = i3 & 67;
            int i5 = -(-((i3 ^ 67) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return zIsConsumed;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public void o(c cVar) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-88)) | ((~i2) & 87);
            int i4 = -(-((i2 & 87) << 1));
            int i5 = (i3 & i4) + (i3 | i4);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.f93o = cVar;
            int i7 = (i2 ^ 39) + ((i2 & 39) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.d.am.aWD
        public final c j() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-66)) | ((~i2) & 65);
            int i4 = -(-((i2 & 65) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            Object obj = null;
            if (this.f93o == null) {
                int i8 = (i6 ^ 83) + ((i6 & 83) << 1);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    this.j.getStableInsetLeft();
                    this.j.getStableInsetTop();
                    obj.hashCode();
                    throw null;
                }
                int stableInsetLeft = this.j.getStableInsetLeft();
                int stableInsetTop = this.j.getStableInsetTop();
                int stableInsetRight = this.j.getStableInsetRight();
                int stableInsetBottom = this.j.getStableInsetBottom();
                int i9 = b;
                int i10 = ((i9 ^ 123) - (~(-(-((i9 & 123) << 1))))) - 1;
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f93o = c.c(stableInsetLeft, stableInsetTop, stableInsetRight, stableInsetBottom);
                    throw null;
                }
                this.f93o = c.c(stableInsetLeft, stableInsetTop, stableInsetRight, stableInsetBottom);
                int i11 = b;
                int i12 = ((i11 ^ 109) | (i11 & 109)) << 1;
                int i13 = -(((~i11) & 109) | (i11 & (-110)));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            c cVar = this.f93o;
            int i16 = a;
            int i17 = i16 & 69;
            int i18 = -(-(i16 | 69));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return cVar;
            }
            throw null;
        }
    }

    public am(am amVar) {
        this.d = new aWD(this);
    }
}
