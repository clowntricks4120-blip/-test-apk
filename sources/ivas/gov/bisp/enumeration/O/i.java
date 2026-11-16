package ivas.gov.bisp.enumeration.O;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ivas.gov.bisp.enumeration.bV.U;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.M;
import ivas.gov.bisp.enumeration.p004ad.N;
import ivas.gov.bisp.enumeration.p004ad.O;
import ivas.gov.bisp.enumeration.p102y.J;
import ivas.gov.bisp.enumeration.p102y.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i implements x, ivas.gov.bisp.enumeration.aO.j {
    private static int a = 1;
    private static int b;
    public static final int[] c = {R.attr.minWidth, R.attr.minHeight, ivas.gov.bisp.enumeration.R.attr.cardBackgroundColor, ivas.gov.bisp.enumeration.R.attr.cardCornerRadius, ivas.gov.bisp.enumeration.R.attr.cardElevation, ivas.gov.bisp.enumeration.R.attr.cardMaxElevation, ivas.gov.bisp.enumeration.R.attr.cardPreventCornerOverlap, ivas.gov.bisp.enumeration.R.attr.cardUseCompatPadding, ivas.gov.bisp.enumeration.R.attr.contentPadding, ivas.gov.bisp.enumeration.R.attr.contentPaddingBottom, ivas.gov.bisp.enumeration.R.attr.contentPaddingLeft, ivas.gov.bisp.enumeration.R.attr.contentPaddingRight, ivas.gov.bisp.enumeration.R.attr.contentPaddingTop};
    public static final float[][] d;
    public static final float[][] e;
    public static final float[][] f;
    public static final float[] g;
    public static i h;
    public static final int[] i;

    public /* synthetic */ i() {
    }

    public static void e(int i2, byte[] bArr, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 ^ 75;
        int i8 = (i6 & 75) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            bArr[i3] = (byte) i2;
            i4 = i3;
        } else {
            int i11 = ((i3 ^ 1) | (i3 & 1)) << 1;
            int i12 = -((i3 & (-2)) | ((~i3) & 1));
            i4 = ((i11 | i12) << 1) - (i11 ^ i12);
            bArr[i3] = (byte) i2;
            int i13 = i4 & 1;
            int i14 = (i4 ^ 1) | i13;
            i3 = ((i13 | i14) << 1) - (i13 ^ i14);
        }
        int i15 = ((i10 & (-18)) | ((~i10) & 17)) + ((i10 & 17) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            bArr[i4] = (byte) (i2 >> 56);
        } else {
            bArr[i4] = (byte) (i2 >>> 8);
        }
        int i16 = i10 + 5;
        a = i16 % 128;
        int i17 = i16 % 2;
        bArr[i3] = (byte) (i2 >>> 16);
        int i18 = i10 & 109;
        int i19 = -(-((i10 ^ 109) | i18));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = i20 % 128;
        a = i21;
        int i22 = i20 % 2;
        bArr[(-2) - ((((i3 | 2) << 1) - (i3 ^ 2)) ^ (-1))] = (byte) (i2 >>> 24);
        int i23 = i21 + 91;
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    public static int f(byte[] bArr, int i2) {
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = (i8 ^ 37) + ((i8 & 37) << 1);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            i3 = i2 >> 1;
            b2 = bArr[i2];
            int i11 = i3 & 1;
            int i12 = (i3 ^ 1) | i11;
            i4 = i11 & i12;
            i5 = i11 | i12;
        } else {
            int i13 = i2 ^ 1;
            i3 = (((i2 & 1) | i13) << 1) - i13;
            b2 = bArr[i2];
            int i14 = i3 & 1;
            int i15 = (i3 ^ 1) | i14;
            i4 = i14 ^ i15;
            i5 = (i14 & i15) << 1;
        }
        int i16 = i4 + i5;
        int i17 = (i10 | 67) << 1;
        int i18 = -(((~i10) & 67) | (i10 & (-68)));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = i19 % 128;
        a = i20;
        int i21 = i19 % 2;
        byte b3 = bArr[i3];
        byte b4 = bArr[i16];
        int i22 = (-2) - ((((i20 | 106) << 1) - (i20 ^ 106)) ^ (-1));
        b = i22 % 128;
        int i23 = i22 % 2;
        int i24 = (i16 & (-2)) | ((~i16) & 1);
        int i25 = (i16 & 1) << 1;
        int i26 = (bArr[(i24 & i25) + (i24 | i25)] & 255) << 24;
        int i27 = i20 & 17;
        int i28 = (i20 | 17) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        int i31 = i30 % 128;
        b = i31;
        if (i30 % 2 != 0) {
            i6 = (((~b2) & 255) ^ (b2 & (-256))) & (((b3 | 5635) & (~(b3 & 5635))) << 119);
        } else {
            int i32 = b2 & 255;
            int i33 = (b3 & 255) << 8;
            i6 = ((~i32) & i33) | ((~i33) & i32);
        }
        int i34 = (b4 & 255) << 16;
        int i35 = i6 & i34;
        int i36 = ((i6 | i34) & (~i35)) | i35;
        int i37 = ((~i36) & i26) | ((~i26) & i36);
        int i38 = i26 & i36;
        int i39 = (i38 & i37) | (i37 ^ i38);
        int i40 = i31 & 103;
        int i41 = -(-((i31 ^ 103) | i40));
        int i42 = (i40 & i41) + (i40 | i41);
        a = i42 % 128;
        int i43 = i42 % 2;
        return i39;
    }

    public static void i(boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 45) | (i3 & 45)) << 1) - (((~i3) & 45) | (i3 & (-46)));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i7 = (i5 ^ 11) + ((i5 & 11) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public static String k(int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 21;
        int i6 = (i4 ^ 21) | i5;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0 ? i2 == 5 : i2 == 5) {
            int i9 = i8 & 113;
            int i10 = (i8 ^ 113) | i9;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            return "qTESLA-p-I";
        }
        int i13 = ((i4 ^ 119) - (~(-(-((i4 & 119) << 1))))) - 1;
        int i14 = i13 % 128;
        a = i14;
        if (i13 % 2 != 0 ? i2 != 6 : i2 != 103) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("unknown security category: ", i2));
        }
        int i15 = ((i14 | 35) << 1) - (i14 ^ 35);
        b = i15 % 128;
        int i16 = i15 % 2;
        return "qTESLA-p-III";
    }

    public static int m(float f2) {
        boolean z;
        float f3;
        boolean z2;
        float f4;
        double d2;
        float f5;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = ((i3 ^ 47) | i4) << 1;
        int i6 = -((~i4) & (i3 | 47));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 == 0 ? f2 < 1.0f : f2 < 1.0f) {
            int i9 = (i3 | 31) << 1;
            int i10 = -(i3 ^ 31);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return -16777216;
        }
        Object obj = null;
        if (f2 > 99.0f) {
            int i13 = i3 & 65;
            int i14 = -(-(i3 | 65));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return -1;
            }
            obj.hashCode();
            throw null;
        }
        float f6 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            int i16 = (i8 & 89) + (i8 | 89);
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i8 + 33;
            a = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            int i20 = i3 + 7;
            b = i20 % 128;
            int i21 = i20 % 2;
            z = false;
        }
        if (z) {
            int i22 = a;
            int i23 = (((i22 | 4) << 1) - (i22 ^ 4)) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            f3 = f6 * f6 * f6;
            int i25 = (i22 & 25) + (i22 | 25);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 2 / 5;
            }
        } else {
            f3 = f2 / 903.2963f;
            int i27 = b;
            int i28 = (i27 ^ 73) + ((i27 & 73) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        float f7 = f6 * f6 * f6;
        if (f7 > 0.008856452f) {
            int i30 = a;
            int i31 = (i30 ^ 125) + ((i30 & 125) << 1);
            int i32 = i31 % 128;
            b = i32;
            int i33 = i31 % 2;
            int i34 = i32 ^ 91;
            int i35 = ((((i32 & 91) | i34) << 1) - (~(-i34))) - 1;
            a = i35 % 128;
            if (i35 % 2 == 0) {
                int i36 = 4 % 5;
            }
            z2 = true;
        } else {
            int i37 = b;
            int i38 = i37 & 73;
            int i39 = -(-((i37 ^ 73) | i38));
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            a = i40 % 128;
            int i41 = i40 % 2;
            z2 = false;
        }
        if (z2) {
            int i42 = b;
            int i43 = ((i42 & 29) - (~(-(-(i42 | 29))))) - 1;
            int i44 = i43 % 128;
            a = i44;
            int i45 = i43 % 2;
            int i46 = i44 & 77;
            int i47 = (i44 ^ 77) | i46;
            int i48 = (i46 & i47) + (i47 | i46);
            b = i48 % 128;
            int i49 = i48 % 2;
            f4 = f7;
        } else {
            float f8 = (f6 * 116.0f) - 16.0f;
            int i50 = a;
            int i51 = (i50 & (-84)) | ((~i50) & 83);
            int i52 = -(-((i50 & 83) << 1));
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            b = i53 % 128;
            f4 = i53 % 2 != 0 ? f8 + 903.2963f : f8 / 903.2963f;
        }
        if (!z2) {
            int i54 = b;
            int i55 = (i54 & 1) + (i54 | 1);
            int i56 = i55 % 128;
            a = i56;
            float f9 = i55 % 2 == 0 ? ((f6 % 116.0f) / 16.0f) * 903.2963f : ((f6 * 116.0f) - 16.0f) / 903.2963f;
            int i57 = i56 + 77;
            b = i57 % 128;
            int i58 = i57 % 2;
            f7 = f9;
        }
        float[] fArr = g;
        float f10 = fArr[0];
        double d3 = f4 * f10;
        int i59 = a;
        int i60 = (((i59 | 81) << 1) - (~(-(i59 ^ 81)))) - 1;
        int i61 = i60 % 128;
        b = i61;
        if (i60 % 2 != 0) {
            d2 = f3 - f10;
            f5 = f7 - fArr[5];
        } else {
            d2 = f3 * fArr[1];
            f5 = f7 * fArr[2];
        }
        double d4 = f5;
        double d5 = d2;
        int i62 = i61 + 113;
        a = i62 % 128;
        if (i62 % 2 != 0) {
            return ivas.gov.bisp.enumeration.p007ag.j.b(d3, d5, d4);
        }
        ivas.gov.bisp.enumeration.p007ag.j.b(d3, d5, d4);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r3
  0x0027: PHI (r3v4 int) = (r3v3 int), (r3v10 int) binds: [B:8:0x0025, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final int n(int i2, int i3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 95;
        int i9 = i7 | 95;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0) {
            int i12 = -i3;
            i4 = (((~i12) & i2) | ((~i2) & i12)) + ((i2 & i12) << 1);
            if (i4 < 0) {
                int i13 = i11 & 93;
                int i14 = (i11 ^ 93) | i13;
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                int i18 = -(-i3);
                i4 = (i4 ^ i18) + ((i18 & i4) << 1);
                i5 = ((i16 & 54) + (i16 | 54)) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i19 = 4 / 3;
                }
            }
        } else {
            i4 = i2 % i3;
            if (i4 < 0) {
                int i110 = i11 & 93;
                int i111 = (i11 ^ 93) | i110;
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                int i113 = i112 % 128;
                a = i113;
                int i114 = i112 % 2;
                int i115 = -(-i3);
                i4 = (i4 ^ i115) + ((i115 & i4) << 1);
                i5 = ((i113 & 54) + (i113 | 54)) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i116 = 4 / 3;
                }
            }
        }
        int i20 = b + 89;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public static float o(int i2) {
        float fPow;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 77;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        float f2 = i2 / 255.0f;
        int i8 = ((i6 | 123) << 1) - (i6 ^ 123);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (f2 <= 0.04045f) {
            int i11 = (((i9 ^ 115) | (i9 & 115)) << 1) - ((i9 & (-116)) | ((~i9) & 115));
            int i12 = i11 % 128;
            a = i12;
            fPow = i11 % 2 == 0 ? f2 - 12.92f : f2 / 12.92f;
            i3 = (((i12 & (-28)) | ((~i12) & 27)) - (~((i12 & 27) << 1))) - 1;
            b = i3 % 128;
        } else {
            double d2 = (f2 + 0.055f) / 1.055f;
            int i13 = i6 & 67;
            int i14 = (((~i13) & (i6 | 67)) - (~(i13 << 1))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            fPow = (float) Math.pow(d2, 2.4000000953674316d);
            i3 = b + 65;
            a = i3 % 128;
        }
        int i16 = i3 % 2;
        float f3 = fPow * 100.0f;
        int i17 = a + 97;
        b = i17 % 128;
        int i18 = i17 % 2;
        return f3;
    }

    public static String r(File file, Charset charset, int i2) {
        Charset charset2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 31) | (i4 & 31)) << 1;
        int i6 = -((i4 & (-32)) | ((~i4) & 31));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        if ((i2 & 1) != 0) {
            int i9 = i4 ^ 125;
            int i10 = ((i4 & 125) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            charset2 = U.c;
            int i14 = b;
            int i15 = i14 & 9;
            int i16 = (i14 | 9) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = i4 & 77;
            int i21 = i4 | 77;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            charset2 = null;
        }
        r.n(charset2, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset2);
        int i24 = a;
        int i25 = ((i24 ^ 33) | (i24 & 33)) << 1;
        int i26 = -(((~i24) & 33) | (i24 & (-34)));
        int i27 = (i25 & i26) + (i26 | i25);
        b = i27 % 128;
        int i28 = i27 % 2;
        try {
            String strW = ivas.gov.bisp.enumeration.p100w.r.W(inputStreamReader);
            ivas.gov.bisp.enumeration.p100w.r.k(inputStreamReader, null);
            int i29 = b;
            int i30 = i29 & 39;
            int i31 = -(-(i29 | 39));
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            int i33 = i32 % 2;
            return strW;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ivas.gov.bisp.enumeration.p100w.r.k(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0084  */
    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    public static int s(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = ((i7 & (-110)) | ((~i7) & 109)) + ((i7 & 109) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 & 73;
        int i11 = (i7 | 73) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < i3) {
            int i16 = a;
            int i17 = (-2) - (((i16 ^ 90) + ((i16 & 90) << 1)) ^ (-1));
            b = i17 % 128;
            if (i17 % 2 != 0) {
                i4 = inputStream.read(bArr, i2 >>> i15, i3 >>> i15);
                if (i4 < 0) {
                    break;
                }
                int i18 = a;
                int i19 = i18 & 55;
                int i20 = ((i18 ^ 55) | i19) << 1;
                int i21 = -((~i19) & (i18 | 55));
                i5 = (i20 & i21) + (i20 | i21);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    i15 %= i4;
                } else {
                    int i22 = -(~(-(-i4)));
                    int i23 = (i15 ^ i22) + ((i15 & i22) << 1);
                    i15 = (i23 ^ (-1)) + (i23 << 1);
                }
                int i24 = i18 & 91;
                int i25 = (((i18 | 91) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
                b = i25 % 128;
                int i26 = i25 % 2;
            } else {
                int i27 = ((~i15) & i2) | ((~i2) & i15);
                int i28 = (i2 & i15) << 1;
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                int i30 = -i15;
                int i31 = i3 & i30;
                i4 = inputStream.read(bArr, i29, ((i30 | i3) & (~i31)) + (i31 << 1));
                if (i4 < 0) {
                    break;
                }
                int i110 = a;
                int i111 = i110 & 55;
                int i210 = ((i110 ^ 55) | i111) << 1;
                int i211 = -((~i111) & (i110 | 55));
                i5 = (i210 & i211) + (i210 | i211);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    i15 %= i4;
                } else {
                    int i212 = -(~(-(-i4)));
                    int i213 = (i15 ^ i212) + ((i15 & i212) << 1);
                    i15 = (i213 ^ (-1)) + (i213 << 1);
                }
                int i214 = i110 & 91;
                int i215 = (((i110 | 91) & (~i214)) - (~(-(-(i214 << 1))))) - 1;
                b = i215 % 128;
                int i216 = i215 % 2;
            }
        }
        int i32 = b;
        int i33 = i32 & 87;
        int i34 = (((i32 ^ 87) | i33) << 1) - ((i32 | 87) & (~i33));
        a = i34 % 128;
        int i35 = i34 % 2;
        return i15;
    }

    public static float t(float f2) {
        float f3;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 3) + ((i5 & 3) << 1);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (f2 > 8.0f) {
            double dPow = Math.pow((((double) f2) + 16.0d) / 116.0d, 3.0d);
            int i8 = a + 85;
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 != 0) {
                throw null;
            }
            f3 = (float) dPow;
            int i10 = (i9 | 35) << 1;
            int i11 = -((i9 & (-36)) | ((~i9) & 35));
            i2 = (i10 ^ i11) + ((i10 & i11) << 1);
            i3 = i2 % 128;
        } else {
            f3 = f2 / 903.2963f;
            int i12 = i7 & 57;
            int i13 = (i7 | 57) & (~i12);
            int i14 = -(-(i12 << 1));
            i2 = (i13 & i14) + (i13 | i14);
            i3 = i2 % 128;
        }
        a = i3;
        int i15 = i2 % 2;
        float f4 = f3 * 100.0f;
        int i16 = a;
        int i17 = i16 & 27;
        int i18 = i17 + ((i16 ^ 27) | i17);
        b = i18 % 128;
        int i19 = i18 % 2;
        return f4;
    }

    @Override // ivas.gov.bisp.enumeration.p102y.x
    public Object d() {
        int i2 = 2 % 2;
        J j = new J();
        int i3 = a;
        int i4 = i3 & 49;
        int i5 = (((i3 ^ 49) | i4) << 1) - ((i3 | 49) & (~i4));
        b = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public void u(float f2, float f3, float f4, a aVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 105;
        int i5 = ((i3 ^ 105) | i4) << 1;
        int i6 = -((i3 | 105) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        aVar.f(f2, 0.0f);
        int i9 = (-2) - ((b + 88) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public int w(String str, String str2, Throwable th) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 49;
        int i5 = (((i3 | 49) & (~i4)) - (~(i4 << 1))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            r.n(str2, "msg");
            Log.e(str, str2, th);
            throw null;
        }
        r.n(str2, "msg");
        int iE = Log.e(str, str2, th);
        int i6 = b;
        int i7 = i6 & 105;
        int i8 = -(-(i6 | 105));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return iE;
    }

    public int x(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
        b = i4 % 128;
        int i5 = i4 % 2;
        r.n(str2, "msg");
        int iW = Log.w(str, str2);
        int i6 = b + 65;
        a = i6 % 128;
        int i7 = i6 % 2;
        return iW;
    }

    public int y(String str, String str2, Throwable th) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 60) + ((i3 & 60) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        r.n(str2, "msg");
        int iW = Log.w(str, str2, th);
        int i7 = a;
        int i8 = ((i7 & 2) + (i7 | 2)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return iW;
    }

    public /* synthetic */ i(ivas.gov.bisp.enumeration.p102y.r rVar) {
    }

    public static void p(AnimatorSet animatorSet, List list) {
        int i2 = 2 % 2;
        int i3 = b + 85;
        a = i3 % 128;
        int i4 = i3 % 2;
        int size = list.size();
        long jMax = 0;
        int i5 = 0;
        while (i5 < size) {
            int i6 = a;
            int i7 = (i6 & (-126)) | ((~i6) & 125);
            int i8 = -(-((i6 & 125) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            Animator animator = (Animator) list.get(i5);
            int i11 = b + 63;
            a = i11 % 128;
            int i12 = i11 % 2;
            long startDelay = animator.getStartDelay();
            int i13 = b;
            int i14 = i13 & 91;
            int i15 = i14 + ((i13 ^ 91) | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            jMax = Math.max(jMax, animator.getDuration() + startDelay);
            int i17 = b + 63;
            int i18 = i17 % 128;
            a = i18;
            if (i17 % 2 == 0) {
                int i19 = (i5 & 93) + (i5 | 93);
                i5 = ((i19 | (-63)) << 1) - (i19 ^ (-63));
            } else {
                i5++;
            }
            int i20 = i18 & 89;
            int i21 = ((i18 ^ 89) | i20) << 1;
            int i22 = -((~i20) & (i18 | 89));
            int i23 = (i21 & i22) + (i21 | i22);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 2 % 5;
            }
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        int i25 = a;
        int i26 = (i25 ^ 45) + ((i25 & 45) << 1);
        b = i26 % 128;
        if (i26 % 2 != 0) {
            list.add(1, valueAnimatorOfInt);
        } else {
            list.add(0, valueAnimatorOfInt);
        }
        animatorSet.playTogether(list);
        int i27 = b;
        int i28 = ((i27 | 97) << 1) - (i27 ^ 97);
        a = i28 % 128;
        if (i28 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static byte[] q(InputStream inputStream) throws IOException {
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        int i3 = b + 47;
        a = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = inputStream.read(bArr, 0, 4096);
            if (i5 < 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i6 = b;
                int i7 = i6 & 101;
                int i8 = ((i6 | 101) & (~i7)) + (i7 << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                return byteArray;
            }
            int i10 = a;
            int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            byteArrayOutputStream.write(bArr, 0, i5);
            int i13 = b;
            int i14 = (i13 & 89) + (i13 | 89);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 % 2;
            }
        }
    }

    public static byte[] h(byte[] bArr) {
        byte[] bArrCopyOf;
        int length;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 101;
        int i5 = i4 + ((i3 ^ 101) | i4);
        a = i5 % 128;
        byte b2 = 1;
        if (i5 % 2 != 0 ? bArr.length >= 16 : bArr.length >= 1) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        int i6 = ((i3 & (-110)) | ((~i3) & 109)) + ((i3 & 109) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            bArrCopyOf = Arrays.copyOf(bArr, 0);
            length = bArr.length;
        } else {
            bArrCopyOf = Arrays.copyOf(bArr, 16);
            length = bArr.length;
            b2 = -128;
        }
        bArrCopyOf[length] = b2;
        int i7 = a + 83;
        b = i7 % 128;
        int i8 = i7 % 2;
        return bArrCopyOf;
    }

    public static byte[] j(byte[] bArr) {
        int i2;
        byte b2;
        byte b3;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 115) << 1) - (i4 ^ 115);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        int i8 = i6 & 85;
        int i9 = (i6 ^ 85) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        byte[] bArr2 = new byte[16];
        int i13 = i11 & 55;
        int i14 = (i11 ^ 55) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < 16) {
            int i18 = a;
            int i19 = i18 + 75;
            b = i19 % 128;
            int i20 = i19 % 2;
            byte b4 = (byte) ((bArr[i17] << 1) & 254);
            bArr2[i17] = b4;
            if (i17 < 15) {
                int i21 = ((i18 ^ 78) + ((i18 & 78) << 1)) - 1;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    b3 = bArr[i17];
                    b2 = 112;
                } else {
                    int i22 = i17 & 1;
                    int i23 = (i17 ^ 1) | i22;
                    byte b5 = bArr[(i22 & i23) + (i22 | i23)];
                    b2 = 7;
                    b3 = b5;
                }
                int i24 = (((i18 | 32) << 1) - (i18 ^ 32)) - 1;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = b3 % b2;
                    bArr2[i17] = (byte) (((byte) ((i25 & 1) | (i25 ^ 1))) & b4);
                } else {
                    byte b6 = (byte) ((b3 >> b2) & 1);
                    int i26 = ((~b6) & b4) | ((~b4) & b6);
                    int i27 = b6 & b4;
                    bArr2[i17] = (byte) ((i27 & i26) | (i26 ^ i27));
                }
            }
            i17 = (((i17 ^ 1) | (i17 & 1)) << 1) - (((~i17) & 1) | (i17 & (-2)));
            int i28 = b;
            int i29 = i28 & 11;
            int i30 = i29 + ((i28 ^ 11) | i29);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        byte b7 = bArr2[15];
        byte b8 = bArr[0];
        int i32 = a;
        int i33 = ((i32 ^ 49) | (i32 & 49)) << 1;
        int i34 = -(((~i32) & 49) | (i32 & (-50)));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        int i36 = i35 % 128;
        b = i36;
        if (i35 % 2 != 0) {
            i2 = ((byte) ((b8 >>> 92) & 2453)) & b7;
        } else {
            byte b9 = (byte) ((b8 >> 7) & 135);
            int i37 = (~b7) & b9;
            int i38 = (~b9) & b7;
            i2 = (i38 & i37) | (i37 ^ i38);
        }
        int i39 = i36 + 13;
        int i40 = i39 % 128;
        a = i40;
        int i41 = i39 % 2;
        bArr2[15] = (byte) i2;
        int i42 = i40 & 47;
        int i43 = (i40 ^ 47) | i42;
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        b = i44 % 128;
        int i45 = i44 % 2;
        return bArr2;
    }

    public static TextView l(Toolbar toolbar, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 & (-64)) | ((~i3) & 63)) - (~((i3 & 63) << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 & 33;
        int i7 = -(-((i3 ^ 33) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            Object obj = null;
            if (i10 >= toolbar.getChildCount()) {
                int i11 = a + 85;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i12 = b;
            int i13 = i12 & 95;
            int i14 = (i12 | 95) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                int i18 = a;
                int i19 = i18 & 59;
                int i20 = (((i18 | 59) & (~i19)) - (~(i19 << 1))) - 1;
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    TextUtils.equals(((TextView) childAt).getText(), charSequence);
                    throw null;
                }
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    int i21 = a;
                    int i22 = (((i21 & (-120)) | ((~i21) & 119)) - (~(-(-((i21 & 119) << 1))))) - 1;
                    int i23 = i22 % 128;
                    b = i23;
                    int i24 = i22 % 2;
                    int i25 = (-2) - (((i23 ^ 32) + ((i23 & 32) << 1)) ^ (-1));
                    a = i25 % 128;
                    if (i25 % 2 != 0) {
                        return textView;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            i10++;
            int i26 = a + 40;
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
    }

    static {
        int[] iArr;
        float[][] fArr = new float[3][];
        float[] fArr2 = {0.401288f, 0.650173f, -0.051461f};
        int i2 = ((1 ^ 58) + ((1 & 58) << 1)) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            fArr[1] = fArr2;
            fArr[0] = new float[]{-0.250268f, 1.204414f, 0.045854f};
        } else {
            fArr[0] = fArr2;
            fArr[1] = new float[]{-0.250268f, 1.204414f, 0.045854f};
        }
        fArr[2] = new float[]{-0.002079f, 0.048952f, 0.953127f};
        d = fArr;
        float[][] fArr3 = new float[3][];
        float[] fArr4 = {1.8620678f, -1.0112547f, 0.14918678f};
        int i3 = (-2) - ((1 - (-8)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            fArr3[0] = fArr4;
            fArr3[1] = new float[]{0.38752654f, 0.62144744f, -0.00897398f};
        } else {
            fArr3[0] = fArr4;
            fArr3[1] = new float[]{0.38752654f, 0.62144744f, -0.00897398f};
        }
        fArr3[2] = new float[]{-0.0158415f, -0.03412294f, 1.0499644f};
        e = fArr3;
        g = new float[]{95.047f, 100.0f, 108.883f};
        float[][] fArr5 = new float[3][];
        int i4 = 1 & 39;
        int i5 = ((~i4) & (1 | 39)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        fArr5[0] = new float[]{0.41233894f, 0.35762063f, 0.18051042f};
        float[] fArr6 = {0.2126f, 0.7152f, 0.0722f};
        int i7 = (1 - (-110)) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            fArr5[1] = fArr6;
            fArr5[3] = new float[]{0.01932141f, 0.11916382f, 0.9503448f};
            f = fArr5;
            iArr = new int[]{R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, ivas.gov.bisp.enumeration.R.attr.fastScrollEnabled, ivas.gov.bisp.enumeration.R.attr.fastScrollHorizontalThumbDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollHorizontalTrackDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollVerticalThumbDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollVerticalTrackDrawable, ivas.gov.bisp.enumeration.R.attr.layoutManager, ivas.gov.bisp.enumeration.R.attr.reverseLayout, ivas.gov.bisp.enumeration.R.attr.spanCount, ivas.gov.bisp.enumeration.R.attr.stackFromEnd};
        } else {
            fArr5[1] = fArr6;
            fArr5[2] = new float[]{0.01932141f, 0.11916382f, 0.9503448f};
            f = fArr5;
            iArr = new int[]{R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, ivas.gov.bisp.enumeration.R.attr.fastScrollEnabled, ivas.gov.bisp.enumeration.R.attr.fastScrollHorizontalThumbDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollHorizontalTrackDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollVerticalThumbDrawable, ivas.gov.bisp.enumeration.R.attr.fastScrollVerticalTrackDrawable, ivas.gov.bisp.enumeration.R.attr.layoutManager, ivas.gov.bisp.enumeration.R.attr.reverseLayout, ivas.gov.bisp.enumeration.R.attr.spanCount, ivas.gov.bisp.enumeration.R.attr.stackFromEnd};
        }
        int i8 = ((1 ^ 56) + ((1 & 56) << 1)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        i = iArr;
        int i10 = (((1 & (-92)) | ((~1) & 91)) - (~(-(-((1 & 91) << 1))))) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02e1 A[PHI: r5
  0x02e1: PHI (r5v149 int) = (r5v148 int), (r5v160 int) binds: [B:112:0x02df, B:109:0x02da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3 A[PHI: r5
  0x02e3: PHI (r5v159 int) = (r5v148 int), (r5v160 int) binds: [B:112:0x02df, B:109:0x02da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:172:0x0418 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x041a  */
    /* JADX WARN: Code duplicated, block: B:182:0x044a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0467  */
    /* JADX WARN: Code duplicated, block: B:185:0x046f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0473  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:216:0x0544  */
    /* JADX WARN: Code duplicated, block: B:235:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:237:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:239:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:241:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:243:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:313:0x0821  */
    /* JADX WARN: Code duplicated, block: B:341:0x0899  */
    /* JADX WARN: Code duplicated, block: B:343:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:344:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:346:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:347:0x08be  */
    /* JADX WARN: Code duplicated, block: B:349:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:351:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:353:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:354:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:357:0x0903  */
    /* JADX WARN: Code duplicated, block: B:358:0x0910  */
    /* JADX WARN: Code duplicated, block: B:360:0x0918  */
    /* JADX WARN: Code duplicated, block: B:361:0x091b  */
    /* JADX WARN: Code duplicated, block: B:364:0x0925  */
    /* JADX WARN: Code duplicated, block: B:365:0x094c  */
    /* JADX WARN: Code duplicated, block: B:367:0x0950  */
    /* JADX WARN: Code duplicated, block: B:369:0x096d  */
    /* JADX WARN: Code duplicated, block: B:370:0x0975  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:407:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:492:0x0c53  */
    /* JADX WARN: Code duplicated, block: B:496:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:500:0x0c73  */
    /* JADX WARN: Code duplicated, block: B:502:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:504:0x0c7d  */
    /* JADX WARN: Code duplicated, block: B:506:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:507:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:508:0x0c8b A[PHI: r5
  0x0c8b: PHI (r5v72 ivas.gov.bisp.enumeration.ac.t) = (r5v71 ivas.gov.bisp.enumeration.ac.t), (r5v82 ivas.gov.bisp.enumeration.ac.t) binds: [B:503:0x0c7b, B:506:0x0c85] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:510:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:512:0x0ca9  */
    /* JADX WARN: Code duplicated, block: B:514:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:516:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:519:0x0ccb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:520:0x0ccd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v35, types: [int] */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v168 */
    /* JADX WARN: Type inference failed for: r2v169, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v171 */
    /* JADX WARN: Type inference failed for: r2v185, types: [int] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v113, types: [int] */
    /* JADX WARN: Type inference failed for: r3v127, types: [int] */
    /* JADX WARN: Type inference failed for: r3v138, types: [int] */
    /* JADX WARN: Type inference failed for: r3v141, types: [int] */
    /* JADX WARN: Type inference failed for: r3v162, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v100, types: [int] */
    /* JADX WARN: Type inference failed for: r4v129, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v98, types: [int] */
    /* JADX WARN: Type inference failed for: r6v105, types: [int] */
    /* JADX WARN: Type inference failed for: r6v118, types: [int] */
    /* JADX WARN: Type inference failed for: r7v55, types: [int] */
    /* JADX WARN: Type inference failed for: r7v59, types: [int] */
    public static void g(O o2, ivas.gov.bisp.enumeration.p003ac.i iVar, int i2) {
        int i3;
        M[] mArr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        C0087m c0087m;
        char c2;
        ivas.gov.bisp.enumeration.p003ac.i iVar2;
        ivas.gov.bisp.enumeration.p003ac.i iVar3;
        int i7;
        N[] nArr;
        int i8;
        C0087m c0087m2;
        N n;
        ivas.gov.bisp.enumeration.p003ac.t tVar;
        ivas.gov.bisp.enumeration.p003ac.t tVar2;
        int i9;
        int i10;
        ivas.gov.bisp.enumeration.p003ac.t tVar3;
        N n2;
        ivas.gov.bisp.enumeration.p003ac.t tVar4;
        N[] nArr2;
        int iD;
        int i11;
        int i12;
        int iD2;
        N n3;
        ivas.gov.bisp.enumeration.p003ac.t tVar5;
        ivas.gov.bisp.enumeration.p003ac.t tVar6;
        int i13;
        int iD3;
        int i14;
        N[] nArr3;
        N n4;
        int i15;
        N n5;
        N n6;
        ivas.gov.bisp.enumeration.p003ac.t tVar7;
        N n7;
        ivas.gov.bisp.enumeration.p003ac.t tVar8;
        C0087m c0087m3;
        ivas.gov.bisp.enumeration.p003ac.t tVar9;
        int i16;
        int i17;
        N n8;
        int i18;
        int size;
        float f2;
        C0087m c0087m4;
        N n9;
        N n10;
        boolean z8;
        C0087m c0087m5;
        ivas.gov.bisp.enumeration.p003ac.t tVar10;
        ivas.gov.bisp.enumeration.p003ac.t tVar11;
        int i19;
        int i20;
        int i21;
        int i22;
        C0087m c0087m6;
        int i23;
        int iD4;
        int[] iArr;
        int i24;
        int i25;
        int iC;
        O o3 = o2;
        ivas.gov.bisp.enumeration.p003ac.i iVar4 = iVar;
        int i26 = 2;
        int i27 = 2 % 2;
        int i28 = a;
        int i29 = (i28 & (-120)) | ((~i28) & 119);
        ?? r12 = 1;
        int i30 = (i28 & 119) << 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        b = i31 % 128;
        int i32 = i31 % 2;
        int i33 = 0;
        if (i2 == 0) {
            int i34 = o3.am;
            M[] mArr2 = o3.ap;
            int i35 = a;
            int i36 = ((i35 | 51) << 1) - (i35 ^ 51);
            b = i36 % 128;
            int i37 = i36 % 2;
            i3 = i34;
            mArr = mArr2;
            i4 = 0;
        } else {
            i3 = o3.an;
            mArr = o3.ao;
            i4 = 2;
        }
        int i38 = 0;
        while (i38 < i3) {
            int i39 = a;
            int i40 = (i39 & (-78)) | ((~i39) & 77);
            int i41 = -(-((i39 & 77) << r12));
            int i42 = (i40 & i41) + (i41 | i40);
            b = i42 % 128;
            int i43 = i42 % i26;
            M m = mArr[i38];
            int i44 = 3;
            int i45 = 8;
            Object obj = null;
            if (!m.t) {
                int i46 = m.f64o * i26;
                C0087m c0087m7 = m.b;
                C0087m c0087m8 = c0087m7;
                ?? r18 = i33;
                while ((~r18 ? 1 : 0) == r12) {
                    int i47 = m.a;
                    m.a = (i47 ^ 1) + ((i47 & r12) << r12);
                    C0087m[] c0087mArr = c0087m7.ae;
                    int i48 = m.f64o;
                    c0087mArr[i48] = null;
                    c0087m7.ad[i48] = null;
                    if (c0087m7.Y != i45) {
                        int i49 = m.l;
                        int i50 = (i49 & (-2)) | ((~i49) & r12);
                        int i51 = -(-(((i49 & r12) == true ? 1 : 0) << r12));
                        m.l = (i50 & i51) + (i50 | i51);
                        if (c0087m7.j(i48) != i44) {
                            int i52 = a;
                            int i53 = i52 & 83;
                            int i54 = (i52 ^ 83) | i53;
                            int i55 = ((i53 | i54) << r12) - (i54 ^ i53);
                            b = i55 % 128;
                            if (i55 % i26 != 0) {
                                int i56 = m.n;
                                int i57 = m.f64o;
                                throw null;
                            }
                            int i58 = m.n;
                            int i59 = m.f64o;
                            if (i59 == 0) {
                                iC = c0087m7.p();
                            } else {
                                iC = i59 == r12 ? c0087m7.c() : i33;
                            }
                            m.n = (i58 - (~(-(-iC)))) - r12;
                        }
                        int i60 = m.n;
                        int iD5 = c0087m7.K[i46].d();
                        ?? r13 = ((iD5 & i60) - (~(i60 | iD5))) - r12;
                        m.n = r13;
                        N[] nArr4 = c0087m7.K;
                        int i61 = ((i46 | 1) << r12) - ((i46 & (-2)) | ((~i46) & r12));
                        m.n = (nArr4[i61].d() - (~(-(-r13)))) - r12;
                        int i62 = b;
                        int i63 = (((i62 | 52) << r12) - (i62 ^ 52)) - 1;
                        a = i63 % 128;
                        if (i63 % i26 == 0) {
                            i23 = m.m;
                            iD4 = c0087m7.K[i46].d();
                            int i64 = 5 / i33;
                        } else {
                            i23 = m.m;
                            iD4 = c0087m7.K[i46].d();
                        }
                        int i65 = -(-i23);
                        int i66 = iD4 & i65;
                        ?? r3 = (((i65 | iD4) & (~i66)) - (~(i66 << 1))) - r12;
                        m.m = r3;
                        int i67 = b;
                        int i68 = (i67 ^ 53) + ((i67 & 53) << r12);
                        a = i68 % 128;
                        int i69 = i68 % i26;
                        int iD6 = c0087m7.K[i61].d();
                        int i70 = iD6 ^ r3;
                        ?? r4 = ((r3 & iD6) | i70) << r12;
                        int i71 = -i70;
                        m.m = ((r4 | i71) << r12) - (r4 ^ i71);
                        if (m.c == null) {
                            m.c = c0087m7;
                        }
                        m.e = c0087m7;
                        int[] iArr2 = c0087m7.M;
                        int i72 = m.f64o;
                        if (iArr2[i72] == 3 && ((i24 = (iArr = c0087m7.n)[i72]) == 0 || i24 == 3 || i24 == i26)) {
                            int i73 = m.j;
                            m.j = (i73 ^ 1) + ((i73 & r12) << r12);
                            float[] fArr = c0087m7.ac;
                            float f3 = fArr[i72];
                            if (f3 > 0.0f) {
                                m.k += fArr[i72];
                            }
                            if (c0087m7.Y != 8 && iArr2[i72] == 3 && ((i25 = iArr[i72]) == 0 || i25 == 3)) {
                                if (f3 < 0.0f) {
                                    m.r = r12;
                                } else {
                                    m.q = r12;
                                }
                                if (m.i == null) {
                                    m.i = new ArrayList<>();
                                }
                                m.i.add(c0087m7);
                            }
                            if (m.f == null) {
                                m.f = c0087m7;
                            }
                            C0087m c0087m9 = m.h;
                            if (c0087m9 != null) {
                                c0087m9.ad[m.f64o] = c0087m7;
                            }
                            m.h = c0087m7;
                        }
                    }
                    if (c0087m8 != c0087m7) {
                        c0087m8.ae[m.f64o] = c0087m7;
                    }
                    N n11 = c0087m7.K[(((i46 | 2) << r12) - (i46 ^ 2)) - r12].f;
                    if (n11 != null) {
                        c0087m6 = n11.d;
                        N[] nArr5 = c0087m6.K;
                        if (nArr5[i46].f == null || nArr5[i46].f.d != c0087m7) {
                            c0087m6 = null;
                        }
                    } else {
                        c0087m6 = null;
                    }
                    if (c0087m6 == null) {
                        int i74 = a;
                        int i75 = i74 & 97;
                        int i76 = ((i74 ^ 97) | i75) << r12;
                        int i77 = -((i74 | 97) & (~i75));
                        int i78 = (i76 ^ i77) + ((i77 & i76) << r12);
                        b = i78 % 128;
                        int i79 = i78 % 2;
                        c0087m6 = c0087m7;
                        r18 = r12;
                    }
                    c0087m8 = c0087m7;
                    i44 = 3;
                    i45 = 8;
                    i26 = 2;
                    i33 = 0;
                    c0087m7 = c0087m6;
                    r18 = r18;
                }
                C0087m c0087m10 = m.c;
                if (c0087m10 != null) {
                    int i80 = m.n;
                    int i81 = -c0087m10.K[i46].d();
                    m.n = (i80 ^ i81) + ((i81 & i80) << r12);
                }
                C0087m c0087m11 = m.e;
                if (c0087m11 != null) {
                    int i82 = m.n;
                    int i83 = -c0087m11.K[((i46 ^ 2) + ((i46 & 2) << r12)) - 1].d();
                    m.n = (i82 ^ i83) + ((i83 & i82) << r12);
                }
                m.d = c0087m7;
                if (m.f64o == 0 && m.p) {
                    int i84 = b;
                    int i85 = i84 & 119;
                    int i86 = (((i84 | 119) & (~i85)) - (~(-(-(i85 << r12))))) - r12;
                    a = i86 % 128;
                    if (i86 % i26 == 0) {
                        m.g = c0087m7;
                        obj.hashCode();
                        throw null;
                    }
                    m.g = c0087m7;
                } else {
                    m.g = m.b;
                }
                m.s = (m.q && m.r) ? r12 : i33;
            }
            m.t = r12;
            C0087m c0087m12 = m.b;
            C0087m c0087m13 = m.d;
            C0087m c0087m14 = m.c;
            C0087m c0087m15 = m.e;
            C0087m c0087m16 = m.g;
            int i87 = a;
            int i88 = i87 & 95;
            ?? r5 = ((((i87 ^ 95) | i88) << r12) - (~(-((i87 | 95) & (~i88))))) - r12;
            b = r5 % 128;
            int i89 = r5 % 2;
            float f4 = m.k;
            ?? r6 = o3.M[i2] == 2 ? r12 : 0;
            if (i2 == 0) {
                int i90 = b;
                int i91 = (((i90 & (-86)) | ((~i90) & 85)) - (~(-(-((i90 & 85) << 1))))) - 1;
                a = i91 % 128;
                if (i91 % 2 == 0) {
                    i21 = c0087m16.aa;
                    int i92 = 84 / 0;
                    if (i21 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = c0087m16.aa;
                    if (i21 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (i21 == 1) {
                    int i93 = a;
                    int i94 = i93 & 67;
                    int i95 = (((i93 ^ 67) | i94) << 1) - ((~i94) & (i93 | 67));
                    b = i95 % 128;
                    i22 = 2;
                    int i96 = i95 % 2;
                    z3 = true;
                } else {
                    i22 = 2;
                    z3 = false;
                }
                if (i21 == i22) {
                    int i97 = a;
                    boolean z9 = z3;
                    int i98 = (((7 & (~i97)) | (i97 & (-8))) - (~(-(-((i97 & 7) << 1))))) - 1;
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    z4 = z9;
                    z5 = z4;
                    z6 = z2;
                    z7 = true;
                } else {
                    z5 = z3;
                    z6 = z2;
                    z7 = false;
                }
            } else {
                f4 = f4;
                int i100 = c0087m16.ab;
                boolean z10 = i100 == 0;
                if (i100 == 1) {
                    int i101 = b;
                    int i102 = i101 | 75;
                    int i103 = i102 << 1;
                    int i104 = -((~(i101 & 75)) & i102);
                    int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
                    a = i105 % 128;
                    i5 = 2;
                    int i106 = i105 % 2;
                    z = true;
                } else {
                    i5 = 2;
                    z = false;
                }
                if (i100 == i5) {
                    z2 = z10;
                    z4 = z;
                    z5 = z4;
                    z6 = z2;
                    z7 = true;
                } else {
                    z2 = z10;
                    z3 = z;
                    z5 = z3;
                    z6 = z2;
                    z7 = false;
                }
            }
            C0087m c0087m17 = c0087m12;
            boolean z11 = false;
            while (true) {
                i3 = i3;
                if (!z11) {
                    N n12 = c0087m17.K[i4];
                    int i107 = z7 ? 1 : 4;
                    int iD7 = n12.d();
                    i38 = i38;
                    int[] iArr3 = c0087m17.M;
                    z5 = z5;
                    int i108 = a;
                    c0087m16 = c0087m16;
                    int i109 = (i108 & (-28)) | (27 & (~i108));
                    int i110 = -(-((i108 & 27) << 1));
                    int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                    b = i111 % 128;
                    if (i111 % 2 == 0 ? iArr3[i2] != 3 : iArr3[i2] != 4) {
                        z8 = false;
                    } else if (c0087m17.n[i2] == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    N n13 = n12.f;
                    if (n13 != null) {
                        int i112 = b;
                        int i113 = (i112 ^ 114) + ((i112 & 114) << 1);
                        int i114 = (i113 ^ (-1)) + (i113 << 1);
                        m = m;
                        a = i114 % 128;
                        if (i114 % 2 == 0) {
                            int i115 = 54 / 0;
                            if (c0087m17 != c0087m12) {
                                int iD8 = n13.d();
                                int i116 = -(-iD7);
                                int i117 = iD8 & i116;
                                iD7 = ((iD8 | i116) & (~i117)) + (i117 << 1);
                            }
                        } else if (c0087m17 != c0087m12) {
                            int iD9 = n13.d();
                            int i118 = -(-iD7);
                            int i119 = iD9 & i118;
                            iD7 = ((iD9 | i118) & (~i119)) + (i119 << 1);
                        }
                    } else {
                        m = m;
                    }
                    if (!(!z7)) {
                        int i120 = a;
                        int i121 = i120 ^ 51;
                        int i122 = ((((i120 & 51) | i121) << 1) - (~(-i121))) - 1;
                        b = i122 % 128;
                        if (i122 % 2 != 0) {
                            int i123 = 42 / 0;
                            if (c0087m17 != c0087m12) {
                                if (c0087m17 != c0087m14) {
                                    i107 = 5;
                                }
                            }
                        } else if (c0087m17 != c0087m12) {
                            if (c0087m17 != c0087m14) {
                                i107 = 5;
                            }
                        }
                    }
                    N n14 = n12.f;
                    if (n14 != null) {
                        int i124 = a;
                        int i125 = (51 & (~i124)) | (i124 & (-52));
                        int i126 = -(-((i124 & 51) << 1));
                        int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                        b = i127 % 128;
                        if (i127 % 2 != 0) {
                            int i128 = 14 / 0;
                            if (c0087m17 == c0087m14) {
                                tVar10 = n12.i;
                                tVar11 = n14.i;
                                int i129 = a;
                                int i130 = i129 & 111;
                                int i131 = -(-((i129 ^ 111) | i130));
                                i19 = (i130 ^ i131) + ((i131 & i130) << 1);
                                b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    iVar4.h(tVar10, tVar11, iD7, 6);
                                    int i132 = 51 / 0;
                                } else {
                                    iVar4.h(tVar10, tVar11, iD7, 6);
                                }
                            } else {
                                iVar4.h(n12.i, n14.i, iD7, 8);
                            }
                        } else if (c0087m17 == c0087m14) {
                            tVar10 = n12.i;
                            tVar11 = n14.i;
                            int i1210 = a;
                            int i133 = i1210 & 111;
                            int i134 = -(-((i1210 ^ 111) | i133));
                            i19 = (i133 ^ i134) + ((i134 & i133) << 1);
                            b = i19 % 128;
                            if (i19 % 2 != 0) {
                                iVar4.h(tVar10, tVar11, iD7, 6);
                                int i135 = 51 / 0;
                            } else {
                                iVar4.h(tVar10, tVar11, iD7, 6);
                            }
                        } else {
                            iVar4.h(n12.i, n14.i, iD7, 8);
                        }
                        if (z8) {
                            int i136 = a;
                            int i137 = (((i136 & (-94)) | ((~i136) & 93)) - (~(-(-((i136 & 93) << 1))))) - 1;
                            b = i137 % 128;
                            if (i137 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (!z7) {
                                i20 = 5;
                            } else {
                                i20 = i107;
                            }
                        } else {
                            i20 = i107;
                        }
                        ivas.gov.bisp.enumeration.p003ac.t tVar12 = n12.i;
                        N n15 = n12.f;
                        int i138 = b;
                        int i139 = ((((i138 ^ 91) | (i138 & 91)) << 1) - (~(-((i138 & (-92)) | ((~i138) & 91))))) - 1;
                        a = i139 % 128;
                        if (i139 % 2 == 0) {
                            iVar4.g(tVar12, n15.i, iD7, i20);
                            throw null;
                        }
                        iVar4.g(tVar12, n15.i, iD7, i20);
                    }
                    if (r6 != 0) {
                        if (c0087m17.Y != 8 && c0087m17.M[i2] == 3) {
                            N[] nArr6 = c0087m17.K;
                            iVar4.h(nArr6[(-1) - (~(i4 ^ 1))].i, nArr6[i4].i, 0, 5);
                        }
                        iVar4.h(c0087m17.K[i4].i, o3.K[i4].i, 0, 8);
                    }
                    int i140 = (i4 ^ 1) << 1;
                    int i141 = -(i4 | 1);
                    N n16 = c0087m17.K[(i140 & i141) + (i140 | i141)].f;
                    int i142 = a;
                    int i143 = i142 & 103;
                    int i144 = ((((i142 ^ 103) | i143) << 1) - (~(-((i142 | 103) & (~i143))))) - 1;
                    b = i144 % 128;
                    if (i144 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (n16 != null) {
                        c0087m5 = n16.d;
                        N[] nArr7 = c0087m5.K;
                        if (nArr7[i4].f == null || nArr7[i4].f.d != c0087m17) {
                            c0087m5 = null;
                        }
                    } else {
                        c0087m5 = null;
                    }
                    if (c0087m5 != null) {
                        c0087m17 = c0087m5;
                        z11 = z11;
                    } else {
                        z11 = true;
                    }
                }
            }
            M m2 = m;
            C0087m c0087m18 = c0087m16;
            int i145 = i38;
            C0087m c0087m19 = c0087m12;
            boolean z12 = z5;
            if (c0087m15 != null) {
                int i146 = i4 | 1;
                if (c0087m13.K[i146].f != null) {
                    N n17 = c0087m15.K[i146];
                    if (c0087m15.M[i2] == 3) {
                        int i147 = b;
                        int i148 = i147 & 91;
                        int i149 = (i147 ^ 91) | i148;
                        int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                        a = i150 % 128;
                        if (i150 % 2 == 0) {
                            int i151 = 35 / 0;
                            if (c0087m15.n[i2] == 0) {
                                if (!z7) {
                                    n10 = n17.f;
                                    if (n10.d == o3) {
                                        iVar4.g(n17.i, n10.i, -n17.d(), 5);
                                    }
                                }
                            }
                        } else if (c0087m15.n[i2] == 0) {
                            if (!z7) {
                                n10 = n17.f;
                                if (n10.d == o3) {
                                    iVar4.g(n17.i, n10.i, -n17.d(), 5);
                                }
                            }
                        }
                        if (z7) {
                            n9 = n17.f;
                            if (n9.d == o3) {
                                iVar4.g(n17.i, n9.i, -n17.d(), 4);
                            }
                        }
                    } else if (z7) {
                        n9 = n17.f;
                        if (n9.d == o3) {
                            iVar4.g(n17.i, n9.i, -n17.d(), 4);
                        }
                    }
                    ivas.gov.bisp.enumeration.p003ac.t tVar13 = n17.i;
                    N[] nArr8 = c0087m13.K;
                    int i152 = a;
                    int i153 = (i152 ^ 85) + ((i152 & 85) << 1);
                    b = i153 % 128;
                    if (i153 % 2 != 0) {
                        ivas.gov.bisp.enumeration.p003ac.t tVar14 = nArr8[i146].f.i;
                        n17.d();
                        throw null;
                    }
                    ivas.gov.bisp.enumeration.p003ac.t tVar15 = nArr8[i146].f.i;
                    int i154 = -n17.d();
                    int i155 = b;
                    int i156 = i155 ^ 43;
                    int i157 = (i155 & 43) << 1;
                    int i158 = (i156 & i157) + (i157 | i156);
                    a = i158 % 128;
                    int i159 = i158 % 2;
                    iVar4.j(tVar13, tVar15, i154, 6);
                }
            }
            if (r6 != 0) {
                int i160 = (i4 ^ 1) << 1;
                int i161 = -(i4 | 1);
                int i162 = (i160 & i161) + (i160 | i161);
                ivas.gov.bisp.enumeration.p003ac.t tVar16 = o3.K[i162].i;
                N[] nArr9 = c0087m13.K;
                ivas.gov.bisp.enumeration.p003ac.t tVar17 = nArr9[i162].i;
                int iD10 = nArr9[i162].d();
                int i163 = b + 5;
                a = i163 % 128;
                int i164 = i163 % 2;
                iVar4.h(tVar16, tVar17, iD10, 8);
            }
            M m3 = m2;
            ArrayList<C0087m> arrayList = m3.i;
            if (arrayList != null && (size = arrayList.size()) > 1) {
                float f5 = (m3.r && !m3.s) ? m3.j : f4;
                C0087m c0087m20 = null;
                float f6 = 0.0f;
                int i165 = 0;
                while (i165 < size) {
                    C0087m c0087m21 = arrayList.get(i165);
                    float f7 = c0087m21.ac[i2];
                    if (f7 < 0.0f) {
                        if (m3.s) {
                            N[] nArr10 = c0087m21.K;
                            arrayList = arrayList;
                            iVar4.g(nArr10[(-2) - ((i4 + 2) ^ (-1))].i, nArr10[i4].i, 0, 4);
                        } else {
                            f2 = 0.0f;
                            f7 = 1.0f;
                        }
                        m3 = m3;
                        size = size;
                        c0087m4 = c0087m13;
                        int i166 = (i165 & (-96)) | ((~i165) & 95);
                        int i167 = (i165 & 95) << 1;
                        int i168 = (i166 & i167) + (i166 | i167);
                        i165 = ((i168 & (-93)) + (i168 | (-93))) - 1;
                        arrayList = arrayList;
                        size = size;
                        m3 = m3;
                        c0087m13 = c0087m4;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f7 == f2) {
                        N[] nArr11 = c0087m21.K;
                        iVar4.g(nArr11[((i4 ^ 1) << 1) - (i4 | 1)].i, nArr11[i4].i, 0, 8);
                        m3 = m3;
                        size = size;
                        c0087m4 = c0087m13;
                    } else {
                        if (c0087m20 != null) {
                            N[] nArr12 = c0087m20.K;
                            ivas.gov.bisp.enumeration.p003ac.t tVar18 = nArr12[i4].i;
                            int i169 = (i4 & (-2)) | (1 & (~i4));
                            int i170 = (i169 << 1) - i169;
                            ivas.gov.bisp.enumeration.p003ac.t tVar19 = nArr12[i170].i;
                            N[] nArr13 = c0087m21.K;
                            ivas.gov.bisp.enumeration.p003ac.t tVar20 = nArr13[i4].i;
                            ivas.gov.bisp.enumeration.p003ac.t tVar21 = nArr13[i170].i;
                            ivas.gov.bisp.enumeration.p003ac.r rVarP = iVar.p();
                            rVarP.d = 0.0f;
                            if (f5 != 0.0f) {
                                int i171 = a;
                                int i172 = i171 & 85;
                                int i173 = -(-((i171 ^ 85) | i172));
                                int i174 = ((i172 | i173) << 1) - (i172 ^ i173);
                                c0087m4 = c0087m13;
                                b = i174 % 128;
                                int i175 = i174 % 2;
                                if (f6 != f7) {
                                    if (f6 == 0.0f) {
                                        rVarP.f.d(tVar18, 1.0f);
                                        rVarP.f.d(tVar19, -1.0f);
                                    } else if (f7 == f2) {
                                        rVarP.f.d(tVar20, 1.0f);
                                        rVarP.f.d(tVar21, -1.0f);
                                    } else {
                                        float f8 = (f6 / f5) / (f7 / f5);
                                        rVarP.f.d(tVar18, 1.0f);
                                        rVarP.f.d(tVar19, -1.0f);
                                        rVarP.f.d(tVar21, f8);
                                        rVarP.f.d(tVar20, -f8);
                                    }
                                }
                                iVar4.f(rVarP);
                            } else {
                                c0087m4 = c0087m13;
                            }
                            rVarP.f.d(tVar18, 1.0f);
                            rVarP.f.d(tVar19, -1.0f);
                            rVarP.f.d(tVar21, 1.0f);
                            rVarP.f.d(tVar20, -1.0f);
                            iVar4.f(rVarP);
                        } else {
                            c0087m4 = c0087m13;
                        }
                        f6 = f7;
                        c0087m20 = c0087m21;
                    }
                    int i1610 = (i165 & (-96)) | ((~i165) & 95);
                    int i1611 = (i165 & 95) << 1;
                    int i1612 = (i1610 & i1611) + (i1610 | i1611);
                    i165 = ((i1612 & (-93)) + (i1612 | (-93))) - 1;
                    arrayList = arrayList;
                    size = size;
                    m3 = m3;
                    c0087m13 = c0087m4;
                }
            }
            M m4 = m3;
            C0087m c0087m22 = c0087m13;
            if (c0087m14 == null || !(c0087m14 == c0087m15 || z7)) {
                c0087m15 = c0087m15;
                i6 = i4;
                int i176 = i145;
                c0087m = c0087m22;
                if (z6) {
                    int i177 = a;
                    int i178 = (i177 & 85) + (i177 | 85);
                    b = i178 % 128;
                    if (i178 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (c0087m14 != null) {
                        int i179 = m4.j;
                        boolean z13 = i179 > 0 && m4.a == i179;
                        C0087m c0087m23 = c0087m14;
                        C0087m c0087m24 = c0087m23;
                        while (c0087m24 != null) {
                            C0087m c0087m25 = c0087m24.ae[i2];
                            while (c0087m25 != null && c0087m25.Y == 8) {
                                c0087m25 = c0087m25.ae[i2];
                            }
                            if (c0087m25 == null) {
                                int i180 = b;
                                int i181 = i180 & 93;
                                int i182 = (i180 | 93) & (~i181);
                                int i183 = -(-(i181 << 1));
                                int i184 = (i182 & i183) + (i182 | i183);
                                a = i184 % 128;
                                if (i184 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (c0087m24 != c0087m15) {
                                    i11 = i176;
                                } else {
                                    N n18 = c0087m24.K[i6];
                                    tVar3 = n18.i;
                                    n2 = n18.f;
                                    if (n2 != null) {
                                        tVar4 = n2.i;
                                    } else {
                                        tVar4 = null;
                                    }
                                    if (c0087m23 != c0087m24) {
                                        int i185 = (i6 ^ 1) << 1;
                                        int i186 = -(i6 | 1);
                                        tVar4 = c0087m23.K[(i185 ^ i186) + ((i185 & i186) << 1)].i;
                                    } else if (c0087m24 == c0087m14) {
                                        int i187 = a;
                                        int i188 = (i187 ^ 15) + ((i187 & 15) << 1);
                                        b = i188 % 128;
                                        int i189 = i188 % 2;
                                        if (c0087m23 == c0087m24) {
                                            nArr2 = c0087m19.K;
                                            if (nArr2[i6].f != null) {
                                                tVar4 = nArr2[i6].f.i;
                                            } else {
                                                tVar4 = null;
                                            }
                                        }
                                    }
                                    iD = n18.d();
                                    N[] nArr14 = c0087m24.K;
                                    int i190 = (i6 ^ 1) << 1;
                                    i11 = i176;
                                    int i191 = -((i6 & (-2)) | ((~i6) & 1));
                                    i12 = (i190 ^ i191) + ((i190 & i191) << 1);
                                    iD2 = nArr14[i12].d();
                                    if (c0087m25 != null) {
                                        n3 = c0087m25.K[i6];
                                        tVar5 = n3.i;
                                        tVar6 = c0087m24.K[i12].i;
                                    } else {
                                        n3 = c0087m.K[i12].f;
                                        if (n3 != null) {
                                            tVar5 = n3.i;
                                        } else {
                                            tVar5 = null;
                                        }
                                        tVar6 = c0087m24.K[i12].i;
                                    }
                                    if (n3 != null) {
                                        int i192 = b;
                                        int i193 = i192 ^ 107;
                                        int i194 = (i192 & 107) << 1;
                                        int i195 = (i193 & i194) + (i193 | i194);
                                        a = i195 % 128;
                                        int i196 = i195 % 2;
                                        int i197 = -(~n3.d());
                                        iD2 = (((iD2 | i197) << 1) - (iD2 ^ i197)) - 1;
                                    }
                                    if (c0087m23 != null) {
                                        iD3 = c0087m23.K[i12].d();
                                        int i198 = b;
                                        i14 = (((i198 | 100) << 1) - (i198 ^ 100)) - 1;
                                        a = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i199 = -iD3;
                                            iD = ((iD & i199) << 1) + (iD ^ i199);
                                        } else {
                                            iD = (iD - (~iD3)) - 1;
                                        }
                                    }
                                    if (tVar3 == null && tVar4 != null && tVar5 != null && tVar6 != null) {
                                        if (c0087m24 == c0087m14) {
                                            int i200 = b;
                                            int i201 = (-2) - (((i200 & 84) + (i200 | 84)) ^ (-1));
                                            a = i201 % 128;
                                            if (i201 % 2 == 0) {
                                                c0087m14.K[i6].d();
                                                obj.hashCode();
                                                throw null;
                                            }
                                            iD = c0087m14.K[i6].d();
                                            int i202 = b;
                                            int i203 = (i202 & 125) + (i202 | 125);
                                            a = i203 % 128;
                                            if (i203 % 2 == 0) {
                                                throw null;
                                            }
                                        }
                                        int i204 = iD;
                                        int iD11 = c0087m24 == c0087m15 ? c0087m15.K[i12].d() : iD2;
                                        if (z13) {
                                            int i205 = b;
                                            int i206 = i205 & 87;
                                            int i207 = (i205 | 87) & (~i206);
                                            int i208 = -(-(i206 << 1));
                                            int i209 = ((i207 | i208) << 1) - (i207 ^ i208);
                                            a = i209 % 128;
                                            i13 = i209 % 2 == 0 ? 110 : 8;
                                        } else {
                                            i13 = 5;
                                        }
                                        iVar.e(tVar3, tVar4, i204, 0.5f, tVar5, tVar6, iD11, i13);
                                    }
                                }
                            } else {
                                N n19 = c0087m24.K[i6];
                                tVar3 = n19.i;
                                n2 = n19.f;
                                if (n2 != null) {
                                    tVar4 = n2.i;
                                } else {
                                    tVar4 = null;
                                }
                                if (c0087m23 != c0087m24) {
                                    int i1810 = (i6 ^ 1) << 1;
                                    int i1811 = -(i6 | 1);
                                    tVar4 = c0087m23.K[(i1810 ^ i1811) + ((i1810 & i1811) << 1)].i;
                                } else if (c0087m24 == c0087m14) {
                                    int i1812 = a;
                                    int i1813 = (i1812 ^ 15) + ((i1812 & 15) << 1);
                                    b = i1813 % 128;
                                    int i1814 = i1813 % 2;
                                    if (c0087m23 == c0087m24) {
                                        nArr2 = c0087m19.K;
                                        if (nArr2[i6].f != null) {
                                            tVar4 = nArr2[i6].f.i;
                                        } else {
                                            tVar4 = null;
                                        }
                                    }
                                }
                                iD = n19.d();
                                N[] nArr15 = c0087m24.K;
                                int i1910 = (i6 ^ 1) << 1;
                                i11 = i176;
                                int i1911 = -((i6 & (-2)) | ((~i6) & 1));
                                i12 = (i1910 ^ i1911) + ((i1910 & i1911) << 1);
                                iD2 = nArr15[i12].d();
                                if (c0087m25 != null) {
                                    n3 = c0087m25.K[i6];
                                    tVar5 = n3.i;
                                    tVar6 = c0087m24.K[i12].i;
                                } else {
                                    n3 = c0087m.K[i12].f;
                                    if (n3 != null) {
                                        tVar5 = n3.i;
                                    } else {
                                        tVar5 = null;
                                    }
                                    tVar6 = c0087m24.K[i12].i;
                                }
                                if (n3 != null) {
                                    int i1912 = b;
                                    int i1913 = i1912 ^ 107;
                                    int i1914 = (i1912 & 107) << 1;
                                    int i1915 = (i1913 & i1914) + (i1913 | i1914);
                                    a = i1915 % 128;
                                    int i1916 = i1915 % 2;
                                    int i1917 = -(~n3.d());
                                    iD2 = (((iD2 | i1917) << 1) - (iD2 ^ i1917)) - 1;
                                }
                                if (c0087m23 != null) {
                                    iD3 = c0087m23.K[i12].d();
                                    int i1918 = b;
                                    i14 = (((i1918 | 100) << 1) - (i1918 ^ 100)) - 1;
                                    a = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i1919 = -iD3;
                                        iD = ((iD & i1919) << 1) + (iD ^ i1919);
                                    } else {
                                        iD = (iD - (~iD3)) - 1;
                                    }
                                }
                                if (tVar3 == null) {
                                }
                            }
                            if (c0087m24.Y != 8) {
                                int i210 = b + 17;
                                a = i210 % 128;
                                if (i210 % 2 == 0) {
                                    int i211 = 16 / 0;
                                }
                                c0087m23 = c0087m24;
                            } else {
                                c0087m23 = c0087m23;
                            }
                            c0087m24 = c0087m25;
                            i176 = i11;
                        }
                        i145 = i176;
                    } else {
                        i145 = i176;
                        int i212 = 8;
                        if (z12 && c0087m14 != null) {
                            int i213 = m4.j;
                            boolean z14 = i213 > 0 && m4.a == i213;
                            C0087m c0087m26 = c0087m14;
                            C0087m c0087m27 = c0087m26;
                            while (c0087m27 != null) {
                                C0087m c0087m28 = c0087m27.ae[i2];
                                while (c0087m28 != null && c0087m28.Y == i212) {
                                    c0087m28 = c0087m28.ae[i2];
                                }
                                if (c0087m27 != c0087m14) {
                                    int i214 = a;
                                    int i215 = i214 & 27;
                                    int i216 = ((i214 ^ 27) | i215) << 1;
                                    int i217 = -((i214 | 27) & (~i215));
                                    int i218 = (i216 & i217) + (i217 | i216);
                                    int i219 = i218 % 128;
                                    b = i219;
                                    if (i218 % 2 != 0) {
                                        throw null;
                                    }
                                    if (c0087m27 != c0087m15) {
                                        int i220 = (i219 ^ 103) + ((i219 & 103) << 1);
                                        a = i220 % 128;
                                        int i221 = i220 % 2;
                                        if (c0087m28 != null) {
                                            int i222 = ((((i219 ^ 51) | (i219 & 51)) << 1) - (~(-(((~i219) & 51) | (i219 & (-52)))))) - 1;
                                            a = i222 % 128;
                                            if (i222 % 2 == 0) {
                                                obj.hashCode();
                                                throw null;
                                            }
                                            C0087m c0087m29 = c0087m28 == c0087m15 ? null : c0087m28;
                                            N n20 = c0087m27.K[i6];
                                            ivas.gov.bisp.enumeration.p003ac.t tVar22 = n20.i;
                                            int i223 = a + 74;
                                            int i224 = (i223 ^ (-1)) + (i223 << 1);
                                            b = i224 % 128;
                                            if (i224 % 2 != 0) {
                                                nArr = c0087m26.K;
                                                i8 = i6 >> 1;
                                            } else {
                                                nArr = c0087m26.K;
                                                i8 = i6 ^ 1;
                                            }
                                            ivas.gov.bisp.enumeration.p003ac.t tVar23 = nArr[i8].i;
                                            int i225 = b;
                                            int i226 = i225 & 5;
                                            int i227 = (i225 | 5) & (~i226);
                                            int i228 = -(-(i226 << 1));
                                            int i229 = (i227 & i228) + (i227 | i228);
                                            a = i229 % 128;
                                            int i230 = i229 % 2;
                                            int iD12 = n20.d();
                                            int iD13 = c0087m27.K[i8].d();
                                            if (c0087m29 != null) {
                                                n = c0087m29.K[i6];
                                                tVar = n.i;
                                                c0087m2 = c0087m29;
                                                N n21 = n.f;
                                                tVar2 = n21 != null ? n21.i : null;
                                            } else {
                                                c0087m2 = c0087m29;
                                                n = c0087m15.K[i6];
                                                tVar = n != null ? n.i : null;
                                                tVar2 = c0087m27.K[i8].i;
                                            }
                                            if (n != null) {
                                                int iD14 = n.d();
                                                int i231 = iD14 ^ iD13;
                                                int i232 = (iD13 & iD14) << 1;
                                                i9 = (i231 & i232) + (i231 | i232);
                                            } else {
                                                i9 = iD13;
                                            }
                                            int iD15 = c0087m26.K[i8].d();
                                            int i233 = z14 ? 8 : 4;
                                            if (tVar22 == null || tVar23 == null || tVar == null || tVar2 == null) {
                                                i7 = 8;
                                            } else {
                                                int i234 = b;
                                                int i235 = i234 & 11;
                                                int i236 = (((i234 ^ 11) | i235) << 1) - ((i234 | 11) & (~i235));
                                                a = i236 % 128;
                                                if (i236 % 2 == 0) {
                                                    i10 = iD15 / iD12;
                                                } else {
                                                    int i237 = -(-iD12);
                                                    int i238 = iD15 & i237;
                                                    int i239 = (i237 | iD15) & (~i238);
                                                    int i240 = -(-(i238 << 1));
                                                    i10 = (i239 ^ i240) + ((i239 & i240) << 1);
                                                }
                                                i7 = 8;
                                                iVar.e(tVar22, tVar23, i10, 0.5f, tVar, tVar2, i9, i233);
                                            }
                                            c0087m28 = c0087m2;
                                        } else {
                                            c0087m26 = c0087m26;
                                            z14 = z14;
                                            i7 = i212;
                                        }
                                    } else {
                                        c0087m26 = c0087m26;
                                        z14 = z14;
                                        i7 = i212;
                                    }
                                } else {
                                    c0087m26 = c0087m26;
                                    z14 = z14;
                                    i7 = i212;
                                }
                                c0087m26 = c0087m27.Y != i7 ? c0087m27 : c0087m26;
                                c0087m27 = c0087m28;
                                i212 = i7;
                                z14 = z14;
                            }
                            c2 = '3';
                            N n22 = c0087m14.K[i6];
                            N n23 = c0087m19.K[i6].f;
                            int i241 = a;
                            int i242 = ((i241 & 56) + (i241 | 56)) - 1;
                            b = i242 % 128;
                            int i243 = i242 % 2;
                            N[] nArr16 = c0087m15.K;
                            int i244 = (-1) - (~(i6 ^ 1));
                            N n24 = nArr16[i244];
                            int i245 = b;
                            int i246 = i245 & 29;
                            int i247 = ((i245 | 29) & (~i246)) + (i246 << 1);
                            a = i247 % 128;
                            int i248 = i247 % 2;
                            N n25 = c0087m.K[i244].f;
                            if (n23 != null) {
                                if (c0087m14 != c0087m15) {
                                    int i249 = b + 5;
                                    a = i249 % 128;
                                    int i250 = i249 % 2;
                                    iVar3 = iVar;
                                    iVar3.g(n22.i, n23.i, n22.d(), 5);
                                } else {
                                    iVar3 = iVar;
                                    if (n25 != null) {
                                        iVar2 = iVar3;
                                        iVar.e(n22.i, n23.i, n22.d(), 0.5f, n24.i, n25.i, n24.d(), 5);
                                    }
                                }
                                iVar2 = iVar3;
                            } else {
                                iVar2 = iVar;
                            }
                            if (n25 != null && c0087m14 != c0087m15) {
                                iVar2.g(n24.i, n25.i, -n24.d(), 5);
                            }
                        }
                    }
                    c0087m = c0087m;
                    c2 = '3';
                    iVar2 = iVar;
                } else {
                    i145 = i176;
                    int i2110 = 8;
                    if (z12) {
                        c0087m = c0087m;
                        c2 = '3';
                        iVar2 = iVar;
                    } else {
                        c0087m = c0087m;
                        c2 = '3';
                        iVar2 = iVar;
                    }
                }
            } else {
                N n26 = c0087m19.K[i4];
                c0087m = c0087m22;
                int i251 = i4 ^ 1;
                N n27 = c0087m.K[i251];
                N n28 = n26.f;
                ivas.gov.bisp.enumeration.p003ac.t tVar24 = n28 != null ? n28.i : null;
                N n29 = n27.f;
                ivas.gov.bisp.enumeration.p003ac.t tVar25 = n29 != null ? n29.i : null;
                N n30 = c0087m14.K[i4];
                N n31 = c0087m15.K[i251];
                if (tVar24 != null) {
                    int i252 = a;
                    int i253 = i252 & 103;
                    int i254 = ((i252 | 103) & (~i253)) + (i253 << 1);
                    b = i254 % 128;
                    int i255 = i254 % 2;
                    if (tVar25 != null) {
                        iVar.e(n30.i, tVar24, n30.d(), i2 == 0 ? c0087m18.W : c0087m18.af, tVar25, n31.i, n31.d(), 7);
                        i6 = i4;
                    } else {
                        i6 = i4;
                        i145 = i145;
                    }
                } else {
                    i6 = i4;
                    i145 = i145;
                }
                c2 = '3';
                iVar2 = iVar4;
            }
            if (!z6) {
                int i256 = a;
                int i257 = ((i256 & 21) - (~(i256 | 21))) - 1;
                b = i257 % 128;
                int i258 = i257 % 2;
                if (z12) {
                    if (c0087m14 != null && c0087m14 != c0087m15) {
                        nArr3 = c0087m14.K;
                        n4 = nArr3[i6];
                        N[] nArr17 = c0087m15.K;
                        i15 = (-1) - (~(-(-(i6 ^ 1))));
                        n5 = nArr17[i15];
                        n6 = n4.f;
                        if (n6 != null) {
                            tVar7 = n6.i;
                        } else {
                            tVar7 = null;
                        }
                        n7 = n5.f;
                        if (n7 != null) {
                            tVar8 = n7.i;
                        } else {
                            tVar8 = null;
                        }
                        c0087m3 = c0087m;
                        if (c0087m3 == c0087m15) {
                            tVar9 = tVar8;
                        } else {
                            n8 = c0087m3.K[i15].f;
                            if (n8 != null) {
                                tVar8 = n8.i;
                                tVar9 = tVar8;
                            } else {
                                tVar9 = null;
                            }
                        }
                        if (c0087m14 == c0087m15) {
                            n4 = nArr3[i6];
                            n5 = nArr3[i15];
                            int i259 = b;
                            int i260 = i259 & 57;
                            int i261 = -(-((i259 ^ 57) | i260));
                            i17 = ((i260 | i261) << 1) - (i261 ^ i260);
                            a = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i262 = 81 / 0;
                            }
                        }
                        if (tVar7 != null) {
                            int i263 = b;
                            int i264 = i263 & 57;
                            int i265 = -(-((i263 ^ 57) | i264));
                            i16 = (i264 & i265) + (i265 | i264);
                            a = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i266 = 42 / 0;
                                if (tVar9 != null) {
                                    iVar.e(n4.i, tVar7, n4.d(), 0.5f, tVar9, n5.i, c0087m15.K[i15].d(), 5);
                                    int i267 = a;
                                    int i268 = (i267 & (-102)) | ((~i267) & 101);
                                    int i269 = -(-((i267 & 101) << 1));
                                    int i270 = (i268 & i269) + (i269 | i268);
                                    b = i270 % 128;
                                    int i271 = i270 % 2;
                                }
                            } else if (tVar9 != null) {
                                iVar.e(n4.i, tVar7, n4.d(), 0.5f, tVar9, n5.i, c0087m15.K[i15].d(), 5);
                                int i2610 = a;
                                int i2611 = (i2610 & (-102)) | ((~i2610) & 101);
                                int i2612 = -(-((i2610 & 101) << 1));
                                int i272 = (i2611 & i2612) + (i2612 | i2611);
                                b = i272 % 128;
                                int i273 = i272 % 2;
                            }
                        }
                    }
                }
            } else if (c0087m14 != null) {
                nArr3 = c0087m14.K;
                n4 = nArr3[i6];
                N[] nArr18 = c0087m15.K;
                i15 = (-1) - (~(-(-(i6 ^ 1))));
                n5 = nArr18[i15];
                n6 = n4.f;
                if (n6 != null) {
                    tVar7 = n6.i;
                } else {
                    tVar7 = null;
                }
                n7 = n5.f;
                if (n7 != null) {
                    tVar8 = n7.i;
                } else {
                    tVar8 = null;
                }
                c0087m3 = c0087m;
                if (c0087m3 == c0087m15) {
                    tVar9 = tVar8;
                } else {
                    n8 = c0087m3.K[i15].f;
                    if (n8 != null) {
                        tVar8 = n8.i;
                        tVar9 = tVar8;
                    } else {
                        tVar9 = null;
                    }
                }
                if (c0087m14 == c0087m15) {
                    n4 = nArr3[i6];
                    n5 = nArr3[i15];
                    int i2510 = b;
                    int i2613 = i2510 & 57;
                    int i2614 = -(-((i2510 ^ 57) | i2613));
                    i17 = ((i2613 | i2614) << 1) - (i2614 ^ i2613);
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i2615 = 81 / 0;
                    }
                }
                if (tVar7 != null) {
                    int i2616 = b;
                    int i2617 = i2616 & 57;
                    int i2618 = -(-((i2616 ^ 57) | i2617));
                    i16 = (i2617 & i2618) + (i2618 | i2617);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i2619 = 42 / 0;
                        if (tVar9 != null) {
                            iVar.e(n4.i, tVar7, n4.d(), 0.5f, tVar9, n5.i, c0087m15.K[i15].d(), 5);
                            int i26110 = a;
                            int i26111 = (i26110 & (-102)) | ((~i26110) & 101);
                            int i26112 = -(-((i26110 & 101) << 1));
                            int i274 = (i26111 & i26112) + (i26112 | i26111);
                            b = i274 % 128;
                            int i275 = i274 % 2;
                        }
                    } else if (tVar9 != null) {
                        iVar.e(n4.i, tVar7, n4.d(), 0.5f, tVar9, n5.i, c0087m15.K[i15].d(), 5);
                        int i26113 = a;
                        int i26114 = (i26113 & (-102)) | ((~i26113) & 101);
                        int i26115 = -(-((i26113 & 101) << 1));
                        int i276 = (i26114 & i26115) + (i26115 | i26114);
                        b = i276 % 128;
                        int i277 = i276 % 2;
                    }
                }
            }
            i38 = (((i145 ^ 1) | (i145 & 1)) << 1) - ((i145 & (-2)) | ((~i145) & 1));
            int i278 = a;
            int i279 = i278 & 1;
            int i280 = i279 + ((i278 ^ 1) | i279);
            b = i280 % 128;
            if (i280 % 2 != 0) {
                i18 = 0;
                int i281 = 69 / 0;
            } else {
                i18 = 0;
            }
            i33 = i18;
            iVar4 = iVar2;
            i4 = i6;
            i3 = i3;
            i26 = 2;
            r12 = 1;
            o3 = o2;
        }
    }
}
