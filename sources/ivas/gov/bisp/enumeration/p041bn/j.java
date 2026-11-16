package ivas.gov.bisp.enumeration.p041bn;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 1;
    private static int b;
    public static final int[] c = {R.attr.state_pressed};
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;

    static {
        int i = (1 - (-116)) - 1;
        int i2 = i % 128;
        b = i2;
        if (i % 2 != 0) {
            d = new int[]{R.attr.state_selected, R.attr.state_pressed};
        } else {
            d = new int[]{R.attr.state_selected, R.attr.state_pressed};
        }
        int[] iArr = new int[1];
        int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            iArr[0] = 16842913;
            e = iArr;
            f = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        } else {
            iArr[0] = 16842913;
            e = iArr;
            f = new int[]{R.attr.state_enabled, R.attr.state_pressed};
            int i6 = 43 / 0;
        }
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (colorStateList != null) {
            int i8 = i6 + 123;
            a = i8 % 128;
            int i9 = i8 % 2;
            colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            int i10 = b + 77;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 5;
            }
        } else {
            int i12 = i6 + 61;
            a = i12 % 128;
            int i13 = i12 % 2;
            colorForState = 0;
        }
        int iMin = Math.min(Color.alpha(colorForState) * 2, 255);
        int i14 = a;
        int i15 = (i14 ^ 63) + ((i14 & 63) << 1);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return ivas.gov.bisp.enumeration.p007ag.j.f(colorForState, iMin);
        }
        ivas.gov.bisp.enumeration.p007ag.j.f(colorForState, iMin);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x0067 A[PHI: r8
  0x0067: PHI (r8v13 int) = (r8v3 int), (r8v17 int) binds: [B:10:0x004c, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[SYNTHETIC] */
    public static boolean d(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 107;
        int i8 = (((~i7) & (i6 | 107)) - (~(-(-(i7 << 1))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int length = iArr.length;
        int i10 = i6 & 123;
        int i11 = -(-((i6 ^ 123) | i10));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        boolean z = false;
        int i14 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i14 < length) {
            int i15 = a;
            int i16 = (i15 ^ 71) + ((i15 & 71) << 1);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                i = iArr[i14];
                int i17 = 69 / 0;
                if (i == 16842910) {
                    int i18 = i15 & 3;
                    int i19 = (i15 | 3) & (~i18);
                    int i20 = -(-(i18 << 1));
                    i2 = ((i19 | i20) << 1) - (i20 ^ i19);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i21 = 3 / 5;
                    }
                    z2 = true;
                } else if (i == 16842908 && i != 16842919) {
                    int i22 = (i15 & (-122)) | ((~i15) & 121);
                    int i23 = -(-((i15 & 121) << 1));
                    i4 = ((i22 | i23) << 1) - (i23 ^ i22);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (i != 16843623) {
                        int i24 = b;
                        int i25 = i24 & 19;
                        int i26 = i24 | 19;
                        i3 = (i25 & i26) + (i26 | i25);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i27 = 4 / 3;
                        }
                        z3 = true;
                    }
                } else {
                    int i28 = b;
                    int i29 = i28 & 19;
                    int i210 = i28 | 19;
                    i3 = (i29 & i210) + (i210 | i29);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i211 = 4 / 3;
                    }
                    z3 = true;
                }
            } else {
                i = iArr[i14];
                if (i == 16842910) {
                    int i110 = i15 & 3;
                    int i111 = (i15 | 3) & (~i110);
                    int i212 = -(-(i110 << 1));
                    i2 = ((i111 | i212) << 1) - (i212 ^ i111);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i213 = 3 / 5;
                    }
                    z2 = true;
                } else if (i == 16842908) {
                    int i214 = b;
                    int i215 = i214 & 19;
                    int i216 = i214 | 19;
                    i3 = (i215 & i216) + (i216 | i215);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i217 = 4 / 3;
                    }
                    z3 = true;
                } else {
                    int i218 = (i15 & (-122)) | ((~i15) & 121);
                    int i219 = -(-((i15 & 121) << 1));
                    i4 = ((i218 | i219) << 1) - (i219 ^ i218);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (i != 16843623) {
                        int i2110 = b;
                        int i2111 = i2110 & 19;
                        int i2112 = i2110 | 19;
                        i3 = (i2111 & i2112) + (i2112 | i2111);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i2113 = 4 / 3;
                        }
                        z3 = true;
                    }
                }
            }
            i14 = (i14 | 1) + (i14 & 1);
            int i30 = b;
            int i31 = (i30 & 124) + (i30 | 124);
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
        }
        if (!(!z2)) {
            int i34 = a;
            int i35 = (-2) - ((((i34 | 104) << 1) - (i34 ^ 104)) ^ (-1));
            b = i35 % 128;
            if (i35 % 2 != 0) {
                if (!z3) {
                    z = true;
                }
            } else if (z3) {
            }
            int i36 = (i34 ^ 100) + ((i34 & 100) << 1);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            b = i37 % 128;
            if (i37 % 2 == 0) {
                z = true;
            }
        }
        int i38 = a;
        int i39 = ((i38 ^ 71) - (~((i38 & 71) << 1))) - 1;
        b = i39 % 128;
        int i40 = i39 % 2;
        return z;
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b + 37;
        int i3 = i2 % 128;
        a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (colorStateList == null) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            int i4 = b + 81;
            a = i4 % 128;
            int i5 = i4 % 2;
            return colorStateListValueOf;
        }
        int i6 = ((i3 ^ 59) | (i3 & 59)) << 1;
        int i7 = -(((~i3) & 59) | (i3 & (-60)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        if (Build.VERSION.SDK_INT <= 27) {
            int i10 = a;
            int i11 = i10 & 25;
            int i12 = ((((i10 ^ 25) | i11) << 1) - (~(-((i10 | 25) & (~i11))))) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                Color.alpha(colorStateList.getDefaultColor());
                obj.hashCode();
                throw null;
            }
            if (Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f, 0));
                int i13 = b;
                int i14 = (i13 ^ 41) + ((i13 & 41) << 1);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                int i15 = i13 & 63;
                int i16 = (i13 ^ 63) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = b;
        int i20 = (i19 ^ 51) + ((i19 & 51) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        return colorStateList;
    }
}
