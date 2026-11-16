package ivas.gov.bisp.enumeration.p088k;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.p008ah.c;
import ivas.gov.bisp.enumeration.p091n.r;

/* JADX INFO: loaded from: classes.dex */
public class W {
    private static int a = 1;
    private static int b;
    public static final int[] c = {R.attr.state_checked};
    public static final int[] d = new int[0];

    static {
        new Rect();
        int i = a;
        int i2 = (-2) - ((((i | 62) << 1) - (i ^ 62)) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 21;
        int i5 = -(-((i3 & 21) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0 ? i == 3 : i == 4) {
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_OVER;
            int i8 = b;
            int i9 = i8 & 93;
            int i10 = -(-((i8 ^ 93) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 54 / 0;
            }
            return mode2;
        }
        if (i == 5) {
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            int i13 = a;
            int i14 = (i13 ^ 24) + ((i13 & 24) << 1);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return mode3;
        }
        int i17 = i7 & 77;
        int i18 = -(-((i7 ^ 77) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        int i20 = i19 % 128;
        a = i20;
        if (i19 % 2 != 0 ? i == 9 : i == 52) {
            PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_ATOP;
            int i21 = a;
            int i22 = i21 ^ 27;
            int i23 = -(-((i21 & 27) << 1));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                return mode4;
            }
            throw null;
        }
        switch (i) {
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                PorterDuff.Mode mode5 = PorterDuff.Mode.MULTIPLY;
                int i25 = a + 3;
                b = i25 % 128;
                int i26 = i25 % 2;
                return mode5;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                PorterDuff.Mode mode6 = PorterDuff.Mode.SCREEN;
                int i27 = b + 51;
                a = i27 % 128;
                int i28 = i27 % 2;
                return mode6;
            case 16:
                PorterDuff.Mode mode7 = PorterDuff.Mode.ADD;
                int i29 = a + 25;
                b = i29 % 128;
                int i30 = i29 % 2;
                return mode7;
            default:
                int i31 = (i20 & (-40)) | ((~i20) & 39);
                int i32 = -(-((i20 & 39) << 1));
                int i33 = (i31 & i32) + (i31 | i32);
                b = i33 % 128;
                int i34 = i33 % 2;
                return mode;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    public static void d(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 19) + ((i2 & 19) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int[] state = drawable.getState();
        if (state != null) {
            int i5 = b;
            int i6 = i5 ^ 11;
            int i7 = ((i5 & 11) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (state.length != 0) {
                int i11 = i5 + 117;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    drawable.setState(d);
                    throw null;
                }
                drawable.setState(d);
            } else {
                drawable.setState(c);
                int i12 = a;
                int i13 = i12 ^ 101;
                int i14 = -(-((i12 & 101) << 1));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            drawable.setState(c);
            int i17 = a;
            int i18 = i17 ^ 101;
            int i19 = -(-((i17 & 101) << 1));
            int i110 = (i18 & i19) + (i19 | i18);
            b = i110 % 128;
            int i111 = i110 % 2;
        }
        drawable.setState(state);
        int i20 = a;
        int i21 = ((i20 ^ 56) + ((i20 & 56) << 1)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1 r3
  0x0032: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0030, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r3v1 int) = (r3v0 int), (r3v8 int) binds: [B:8:0x0030, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static void c(Drawable drawable) {
        String name;
        int i;
        int i2;
        int i3;
        int i4;
        boolean zEquals;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (-2) - (((i6 & 36) + (i6 | 36)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            name = drawable.getClass().getName();
            i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                i2 = a;
                i3 = (i2 ^ 77) + ((i2 & 77) << 1);
                b = i3 % 128;
                if (i3 % 2 != 0 ? i < 31 : i < 111) {
                    int i8 = (((i2 & (-74)) | ((~i2) & 73)) - (~((i2 & 73) << 1))) - 1;
                    b = i8 % 128;
                    i4 = i8 % 2;
                    zEquals = "android.graphics.drawable.ColorStateListDrawable".equals(name);
                    if (i4 != 0) {
                        int i9 = 29 / 0;
                        if (zEquals) {
                            d(drawable);
                            int i10 = b;
                            int i11 = i10 & 29;
                            int i12 = -(-(i10 | 29));
                            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                            a = i13 % 128;
                            int i14 = i13 % 2;
                        }
                    } else if (zEquals) {
                        d(drawable);
                        int i15 = b;
                        int i16 = i15 & 29;
                        int i17 = -(-(i15 | 29));
                        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                    }
                }
            }
        } else {
            name = drawable.getClass().getName();
            i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                i2 = a;
                i3 = (i2 ^ 77) + ((i2 & 77) << 1);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i20 = (((i2 & (-74)) | ((~i2) & 73)) - (~((i2 & 73) << 1))) - 1;
                    b = i20 % 128;
                    i4 = i20 % 2;
                    zEquals = "android.graphics.drawable.ColorStateListDrawable".equals(name);
                    if (i4 != 0) {
                        int i21 = 29 / 0;
                        if (zEquals) {
                            d(drawable);
                            int i110 = b;
                            int i111 = i110 & 29;
                            int i112 = -(-(i110 | 29));
                            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                            a = i113 % 128;
                            int i114 = i113 % 2;
                        }
                    } else if (zEquals) {
                        d(drawable);
                        int i115 = b;
                        int i116 = i115 & 29;
                        int i117 = -(-(i115 | 29));
                        int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                        a = i118 % 128;
                        int i119 = i118 % 2;
                    }
                } else {
                    int i22 = (((i2 & (-74)) | ((~i2) & 73)) - (~((i2 & 73) << 1))) - 1;
                    b = i22 % 128;
                    i4 = i22 % 2;
                    zEquals = "android.graphics.drawable.ColorStateListDrawable".equals(name);
                    if (i4 != 0) {
                        int i23 = 29 / 0;
                        if (zEquals) {
                            d(drawable);
                            int i1110 = b;
                            int i1111 = i1110 & 29;
                            int i1112 = -(-(i1110 | 29));
                            int i1113 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                            a = i1113 % 128;
                            int i1114 = i1113 % 2;
                        }
                    } else if (zEquals) {
                        d(drawable);
                        int i1115 = b;
                        int i1116 = i1115 & 29;
                        int i1117 = -(-(i1115 | 29));
                        int i1118 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                        a = i1118 % 128;
                        int i1119 = i1118 % 2;
                    }
                }
            }
        }
        int i24 = b + 7;
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Drawable drawable) {
        Drawable[] children;
        int length;
        int i;
        int i2;
        int i3 = 2 % 2;
        while (true) {
            Object obj = null;
            if (drawable instanceof DrawableContainer) {
                int i4 = b;
                int i5 = (((i4 ^ 5) | (i4 & 5)) << 1) - (((~i4) & 5) | (i4 & (-6)));
                a = i5 % 128;
                int i6 = i5 % 2;
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    break;
                }
                int i7 = b;
                int i8 = ((i7 | 69) << 1) - (((~i7) & 69) | (i7 & (-70)));
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                    length = children.length;
                    i = 1;
                } else {
                    children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                    length = children.length;
                    i = 0;
                }
                int i9 = b + 85;
                a = i9 % 128;
                int i10 = i9 % 2;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int i11 = a;
                    int i12 = i11 & 67;
                    int i13 = (((i11 | 67) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 31 / 0;
                        if (!b(children[i])) {
                            int i15 = a;
                            int i16 = (i15 ^ 51) + ((i15 & 51) << 1);
                            b = i16 % 128;
                            int i17 = i16 % 2;
                            i2 = ((i15 ^ 38) + ((i15 & 38) << 1)) - 1;
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                return false;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i18 = (i & 16) | ((~i) & (-17));
                        int i19 = (i & (-17)) << 1;
                        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                        int i21 = i20 & 18;
                        int i22 = -(-((i20 ^ 18) | i21));
                        i = ((i21 & i22) << 1) + (i21 ^ i22);
                        int i23 = a;
                        int i24 = i23 & 83;
                        int i25 = -(-((i23 ^ 83) | i24));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    } else {
                        if (!b(children[i])) {
                            int i110 = a;
                            int i111 = (i110 ^ 51) + ((i110 & 51) << 1);
                            b = i111 % 128;
                            int i112 = i111 % 2;
                            i2 = ((i110 ^ 38) + ((i110 & 38) << 1)) - 1;
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                return false;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i113 = (i & 16) | ((~i) & (-17));
                        int i114 = (i & (-17)) << 1;
                        int i28 = (i113 ^ i114) + ((i114 & i113) << 1);
                        int i29 = i28 & 18;
                        int i210 = -(-((i28 ^ 18) | i29));
                        i = ((i29 & i210) << 1) + (i29 ^ i210);
                        int i211 = a;
                        int i212 = i211 & 83;
                        int i213 = -(-((i211 ^ 83) | i212));
                        int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                        b = i214 % 128;
                        int i215 = i214 % 2;
                    }
                }
            } else if (drawable instanceof c) {
                int i30 = b;
                int i31 = i30 & 73;
                int i32 = i31 + ((i30 ^ 73) | i31);
                a = i32 % 128;
                int i33 = i32 % 2;
                drawable = ((c) drawable).b();
                int i34 = a;
                int i35 = i34 & 123;
                int i36 = (i35 - (~((i34 ^ 123) | i35))) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
            } else if (drawable instanceof r) {
                int i38 = b;
                int i39 = i38 & 103;
                int i40 = i39 + ((i38 ^ 103) | i39);
                a = i40 % 128;
                int i41 = i40 % 2;
                drawable = ((r) drawable).c;
                int i42 = b;
                int i43 = i42 ^ 79;
                int i44 = -(-((i42 & 79) << 1));
                int i45 = (i43 & i44) + (i44 | i43);
                a = i45 % 128;
                int i46 = i45 % 2;
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    break;
                }
                int i47 = a;
                int i48 = i47 & 19;
                int i49 = (((i47 | 19) & (~i48)) - (~(i48 << 1))) - 1;
                b = i49 % 128;
                int i50 = i49 % 2;
                drawable = ((ScaleDrawable) drawable).getDrawable();
                int i51 = a + 85;
                b = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 2 % 5;
                }
            }
        }
        int i53 = a;
        int i54 = ((i53 | 113) << 1) - (i53 ^ 113);
        b = i54 % 128;
        if (i54 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
