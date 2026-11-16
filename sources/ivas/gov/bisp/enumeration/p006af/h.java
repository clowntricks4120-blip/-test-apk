package ivas.gov.bisp.enumeration.p006af;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bX.P;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final long[] D;
    public static final int[] E;
    public static final Object[] F;
    public static boolean[] G = null;
    public static boolean H = false;
    public static final int[] I;
    public static final int[] J;
    public static Field K = null;
    private static int a = 1;
    private static int b;
    public static final int[] c;
    public static final int[] d = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};
    public static final int[] e = {android.R.attr.layout_gravity};
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f66o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    public /* synthetic */ h() {
    }

    public static int d(int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 67) + (i4 | 67);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return j(i2 * 4) / 4;
        }
        int i6 = i2 ^ (-4);
        int i7 = (i2 & (-4)) << 1;
        return j((i6 ^ i7) + ((i7 & i6) << 1)) % 3;
    }

    public static int e(int[] iArr, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 41) + ((i5 & 41) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = ((i2 << 1) - i2) - 1;
        int i10 = ((i7 ^ 19) | (i7 & 19)) << 1;
        int i11 = -(((~i7) & 19) | (i7 & (-20)));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (i14 <= i9) {
            int i15 = b;
            int i16 = i15 + 95;
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((~i9) & i14) | ((~i14) & i9);
            int i19 = -(-((i14 & i9) << 1));
            int i20 = (((i18 | i19) << 1) - (i18 ^ i19)) >>> 1;
            int i21 = iArr[i20];
            int i22 = (i15 ^ 61) + ((i15 & 61) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            if (i21 < i3) {
                int i23 = i15 & 1;
                int i24 = (((i15 | 1) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
                int i25 = i24 % 128;
                a = i25;
                int i26 = i24 % 2;
                int i27 = (i20 & 1) + (i20 | 1);
                int i28 = i25 & 107;
                int i29 = (i25 ^ 107) | i28;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                b = i30 % 128;
                int i31 = i30 % 2;
                i14 = i27;
            } else {
                if (i21 <= i3) {
                    int i32 = i15 & 35;
                    int i33 = i32 + ((i15 ^ 35) | i32);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    return i20;
                }
                int i35 = ((i15 | 1) << 1) - (i15 ^ 1);
                a = i35 % 128;
                int i36 = i35 % 2;
                i9 = i20 - 1;
                int i37 = i15 + 19;
                a = i37 % 128;
                int i38 = i37 % 2;
            }
        }
        int i39 = ~i14;
        int i40 = a;
        int i41 = (i40 & (-10)) | ((~i40) & 9);
        int i42 = (i40 & 9) << 1;
        int i43 = (i41 & i42) + (i42 | i41);
        b = i43 % 128;
        int i44 = i43 % 2;
        return i39;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2 A[SYNTHETIC] */
    public static int f(long[] jArr, int i2, long j2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = (((i9 ^ 57) | (i9 & 57)) << 1) - (((~i9) & 57) | (i9 & (-58)));
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0) {
            int i12 = i2 & (-106);
            int i13 = (i12 - (~((i2 ^ (-106)) | i12))) - 1;
            i3 = (((i13 | 113) << 1) - (i13 ^ 113)) - 1;
            i4 = 1;
        } else {
            int i14 = ((((i2 ^ (-9)) | (i2 & (-9))) << 1) - (~(-(((~i2) & (-9)) | (i2 & 8))))) - 1;
            i3 = (i14 & 8) + (i14 | 8);
            i4 = 0;
        }
        int i15 = (-2) - ((i11 + 42) ^ (-1));
        a = i15 % 128;
        int i16 = i15 % 2;
        while (i4 <= i3) {
            int i17 = b;
            int i18 = i17 & 47;
            int i19 = -(-((i17 ^ 47) | i18));
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            int i21 = i20 % 128;
            a = i21;
            if (i20 % 2 == 0) {
                i5 = (i4 >>> i3) << 1;
                i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
                if (i6 < 0) {
                    i4 = ((i5 & 1) << 1) + ((i5 & (-2)) | ((~i5) & 1));
                    int i22 = (i21 & 25) + (i21 | 25);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    if (i6 > 0) {
                        i7 = (((i17 | 22) << 1) - (i17 ^ 22)) - 1;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i24 = 2 / 0;
                        }
                        return i5;
                    }
                    int i25 = i17 + 113;
                    int i26 = i25 % 128;
                    a = i26;
                    int i27 = i25 % 2;
                    int i28 = i26 & 79;
                    int i29 = i28 + ((i26 ^ 79) | i28);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    i3 = i5 - 1;
                }
            } else {
                int i31 = ((~i3) & i4) | ((~i4) & i3);
                int i32 = -(-((i4 & i3) << 1));
                i5 = ((i31 ^ i32) + ((i31 & i32) << 1)) >>> 1;
                i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
                if (i6 < 0) {
                    i4 = ((i5 & 1) << 1) + ((i5 & (-2)) | ((~i5) & 1));
                    int i210 = (i21 & 25) + (i21 | 25);
                    b = i210 % 128;
                    int i211 = i210 % 2;
                } else {
                    if (i6 > 0) {
                        i7 = (((i17 | 22) << 1) - (i17 ^ 22)) - 1;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i212 = 2 / 0;
                        }
                        return i5;
                    }
                    int i213 = i17 + 113;
                    int i214 = i213 % 128;
                    a = i214;
                    int i215 = i213 % 2;
                    int i216 = i214 & 79;
                    int i217 = i216 + ((i214 ^ 79) | i216);
                    b = i217 % 128;
                    int i33 = i217 % 2;
                    i3 = i5 - 1;
                }
            }
        }
        int i34 = ~i4;
        int i35 = b + 11;
        a = i35 % 128;
        if (i35 % 2 != 0) {
            return i34;
        }
        throw null;
    }

    public static final void g(File file) {
        int i2 = 2 % 2;
        int i3 = b + 69;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            file.delete();
            throw null;
        }
        if (!file.delete()) {
            j jVar = P.c;
            j jVar2 = P.c;
            StringBuilder sb = new StringBuilder();
            int i4 = a;
            int i5 = (i4 & 73) + (i4 | 73);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                sb.append("Could not delete file: ");
                sb.append(file);
                sb.toString();
                throw null;
            }
            sb.append("Could not delete file: ");
            sb.append(file);
            ((i) jVar).x("OooOOO", sb.toString());
            int i6 = b;
            int i7 = i6 & 93;
            int i8 = (i6 | 93) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = i12 & 15;
        int i14 = (((i12 | 15) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 20 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static boolean h(Object obj, Object obj2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 17) + (i4 | 17);
        a = i5 % 128;
        boolean z2 = false;
        if (i5 % 2 != 0) {
            if (obj != obj2) {
                if (obj != null) {
                    int i6 = (-2) - ((i4 + 18) ^ (-1));
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(!obj.equals(obj2))) {
                    }
                }
                int i8 = b;
                int i9 = ((((i8 ^ 17) | (i8 & 17)) << 1) - (~(-(((~i8) & 17) | (i8 & (-18)))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = b;
            i2 = (i11 ^ 83) + ((i11 & 83) << 1);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return z2;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i12 = 8 / 0;
        if (obj != obj2) {
            if (obj != null) {
                int i13 = (-2) - ((i4 + 18) ^ (-1));
                a = i13 % 128;
                int i14 = i13 % 2;
                if (!(!obj.equals(obj2))) {
                }
            }
            int i15 = b;
            int i16 = ((((i15 ^ 17) | (i15 & 17)) << 1) - (~(-(((~i15) & 17) | (i15 & (-18)))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        i2 = (i18 ^ 83) + ((i18 & 83) << 1);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return z2;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
        int i19 = a + 15;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 5 % 3;
        }
        z2 = true;
        int i110 = b;
        i2 = (i110 ^ 83) + ((i110 & 83) << 1);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return z2;
        }
        Object obj5 = null;
        obj5.hashCode();
        throw null;
    }

    public static final boolean i(int i2, int i3) {
        boolean z2;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (((i5 | 112) << 1) - (i5 ^ 112)) - 1;
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if ((i2 & i3) == i3) {
            int i9 = ((((i7 ^ 105) | (i7 & 105)) << 1) - (~(-((i7 & (-106)) | ((~i7) & 105))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i7 + 69;
            b = i11 % 128;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            int i13 = i5 + 79;
            a = i13 % 128;
            int i14 = i13 % 2;
            z2 = false;
        }
        int i15 = b;
        int i16 = i15 ^ 125;
        int i17 = (((i15 & 125) | i16) << 1) - i16;
        a = i17 % 128;
        int i18 = i17 % 2;
        return z2;
    }

    public static int j(int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 123;
        int i6 = (i4 ^ 123) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (i4 ^ 17) + ((i4 & 17) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 4;
        while (i11 < 32) {
            int i12 = a;
            int i13 = i12 + 97;
            int i14 = i13 % 128;
            b = i14;
            int i15 = i13 % 2;
            int i16 = (1 << i11) - 12;
            if (i2 <= i16) {
                int i17 = i14 & 113;
                int i18 = -(-((i14 ^ 113) | i17));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = ((i14 | 99) << 1) - (i14 ^ 99);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    return i16;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i22 = (i11 ^ (-37)) + ((i11 & (-37)) << 1) + 39;
            i11 = (i22 ^ (-1)) + (i22 << 1);
            int i23 = i12 & 99;
            int i24 = i23 + ((i12 ^ 99) | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = ((i26 | 41) << 1) - (i26 ^ 41);
        b = i27 % 128;
        int i28 = i27 % 2;
        return i2;
    }

    public static int k(int i2) {
        int i3 = 2 % 2;
        int i4 = b + 85;
        a = i4 % 128;
        int iJ = i4 % 2 == 0 ? j(i2 << 25) << 82 : j(i2 * 8) / 8;
        int i5 = a;
        int i6 = i5 & 83;
        int i7 = i6 + ((i5 ^ 83) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return iJ;
    }

    public void l(View view) {
        int i2 = 2 % 2;
        int i3 = b + 11;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public float m(View view) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 83) + (i3 | 83);
        b = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    public void n(View view) {
        int i2 = 2 % 2;
        int i3 = b + 41;
        a = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    public void o(View view, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = a + 101;
        b = i7 % 128;
        int i8 = i7 % 2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public void p(View view, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 47;
        int i7 = -(-((i5 ^ 47) | i6));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 35 / 0;
            if (!H) {
                int i10 = i5 & 59;
                int i11 = i5 | 59;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    K = declaredField;
                    int i14 = a;
                    int i15 = ((((i14 ^ 3) | (i14 & 3)) << 1) - (~(-(((~i14) & 3) | (i14 & (-4)))))) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    declaredField.setAccessible(true);
                    int i17 = a;
                    int i18 = i17 & 101;
                    int i19 = (i17 ^ 101) | i18;
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                } catch (NoSuchFieldException unused) {
                }
                H = true;
                int i22 = a + 38;
                i3 = (i22 ^ (-1)) + (i22 << 1);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i23 = 5 / 2;
                }
            }
        } else if (!H) {
            int i110 = i5 & 59;
            int i111 = i5 | 59;
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            a = i112 % 128;
            int i113 = i112 % 2;
            Field declaredField2 = View.class.getDeclaredField("mViewFlags");
            K = declaredField2;
            int i114 = a;
            int i115 = ((((i114 ^ 3) | (i114 & 3)) << 1) - (~(-(((~i114) & 3) | (i114 & (-4)))))) - 1;
            b = i115 % 128;
            int i116 = i115 % 2;
            declaredField2.setAccessible(true);
            int i117 = a;
            int i118 = i117 & 101;
            int i119 = (i117 ^ 101) | i118;
            int i24 = (i118 ^ i119) + ((i119 & i118) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
            H = true;
            int i26 = a + 38;
            i3 = (i26 ^ (-1)) + (i26 << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                int i27 = 5 / 2;
            }
        }
        Field field = K;
        if (field != null) {
            int i28 = b;
            int i29 = (((i28 ^ 117) | (i28 & 117)) << 1) - (((~i28) & 117) | (i28 & (-118)));
            a = i29 % 128;
            int i30 = i29 % 2;
            try {
                int i31 = field.getInt(view);
                Field field2 = K;
                int i32 = b;
                int i33 = ((i32 | 41) << 1) - (i32 ^ 41);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = i31 & 83;
                    field2.setInt(view, (i2 & i34) | (i2 ^ i34));
                } else {
                    int i35 = i31 & (-13);
                    int i36 = i2 & i35;
                    int i37 = (i2 | i35) & (~i36);
                    field2.setInt(view, (i37 & i36) | (i37 ^ i36));
                }
                int i38 = a;
                int i39 = ((i38 & 36) + (i38 | 36)) - 1;
                b = i39 % 128;
                int i40 = i39 % 2;
            } catch (IllegalAccessException unused2) {
                return;
            }
        }
        int i41 = b + 115;
        a = i41 % 128;
        int i42 = i41 % 2;
    }

    public void q(View view, float f2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 22) << 1) - (i3 ^ 22)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    public void r(View view, Matrix matrix) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 13) << 1) - (i3 ^ 13);
        b = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    public void s(View view, Matrix matrix) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 17;
        int i5 = (i3 & 17) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = 63 / 0;
        throw null;
    }

    public /* synthetic */ h(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.f = SwipeDismissBehavior.b(0.0f, 0.1f, 1.0f);
        swipeDismissBehavior.e = SwipeDismissBehavior.b(0.0f, 0.6f, 1.0f);
        swipeDismissBehavior.c = 0;
    }

    static {
        int[] iArr;
        int[] iArr2 = new int[1];
        int i2 = 1 & 103;
        int i3 = -(-((1 ^ 103) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            iArr2[0] = 16843071;
            f = iArr2;
            g = new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};
            i = new int[]{android.R.attr.layout, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
            h = new int[]{android.R.attr.src, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
            j = new int[]{android.R.attr.thumb, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        iArr2[0] = 16843071;
        f = iArr2;
        g = new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};
        i = new int[]{android.R.attr.layout, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
        h = new int[]{android.R.attr.src, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
        j = new int[]{android.R.attr.thumb, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
        k = new int[]{android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};
        c = new int[]{android.R.attr.textAppearance, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
        l = new int[]{android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
        int[] iArr3 = {R.attr.allowStacking};
        int i5 = 1 ^ 103;
        int i6 = -(-((1 & 103) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            m = iArr3;
            n = new int[]{android.R.attr.checkMark, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
            p = new int[]{android.R.attr.button, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
            f66o = new int[]{android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
            q = new int[]{android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};
            iArr = new int[]{android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};
            int i9 = 6 / 0;
        } else {
            m = iArr3;
            n = new int[]{android.R.attr.checkMark, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
            p = new int[]{android.R.attr.button, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
            f66o = new int[]{android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
            q = new int[]{android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};
            iArr = new int[]{android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};
        }
        r = iArr;
        t = new int[]{android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
        s = new int[]{android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
        u = new int[]{android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, R.attr.overlapAnchor};
        x = new int[]{R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
        int[] iArr4 = {android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
        int i10 = i8 + 56;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        w = iArr4;
        y = new int[]{android.R.attr.entries, android.R.attr.popupBackground, android.R.attr.prompt, android.R.attr.dropDownWidth, R.attr.popupTheme};
        z = new int[]{android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
        v = new int[]{android.R.attr.gravity, android.R.attr.minHeight, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
        B = new int[]{android.R.attr.theme, android.R.attr.focusable, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
        int[] iArr5 = {android.R.attr.background, R.attr.backgroundTint, R.attr.backgroundTintMode};
        int i13 = ((i8 | 3) << 1) - (i8 ^ 3);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            A = iArr5;
            C = new int[]{android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
            E = new int[0];
            D = new long[1];
            F = new Object[1];
        } else {
            A = iArr5;
            C = new int[]{android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
            E = new int[0];
            D = new long[0];
            F = new Object[0];
        }
        G = new boolean[3];
        I = new int[]{android.R.attr.name, android.R.attr.id, android.R.attr.tag};
        J = new int[]{android.R.attr.name, android.R.attr.tag};
        int i14 = ((i8 & (-102)) | ((~i8) & 101)) + ((i8 & 101) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
    }
}
