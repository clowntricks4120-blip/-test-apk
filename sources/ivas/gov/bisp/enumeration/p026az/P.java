package ivas.gov.bisp.enumeration.p026az;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Base64;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 0;
    private static int b = 1;
    public static P c;

    public static byte[] c(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 103) + (i2 | 103);
        a = i3 % 128;
        byte[] bArrDecode = i3 % 2 != 0 ? Base64.decode(str, 1) : Base64.decode(str, 0);
        int i4 = b;
        int i5 = i4 & 53;
        int i6 = i5 + ((i4 ^ 53) | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
        return bArrDecode;
    }

    public static String d(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 99) - (~(-(-((i2 & 99) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (bArr != null) {
            int i5 = ((i2 ^ 91) | (i2 & 91)) << 1;
            int i6 = -((i2 & (-92)) | ((~i2) & 91));
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            if (bArr.length != 0) {
                int i9 = (-2) - ((i2 + 40) ^ (-1));
                b = i9 % 128;
                String strEncodeToString = i9 % 2 == 0 ? Base64.encodeToString(bArr, 1, bArr.length, 1) : Base64.encodeToString(bArr, 0, bArr.length, 0);
                int i10 = a;
                int i11 = ((i10 ^ 38) + ((i10 & 38) << 1)) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
                return strEncodeToString;
            }
        }
        int i13 = b;
        int i14 = i13 ^ 63;
        int i15 = ((i13 & 63) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        return BuildConfig.FLAVOR;
    }

    public Bitmap g(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static P e() {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (c == null) {
            c = new P();
            int i3 = a;
            int i4 = (i3 & 21) + (i3 | 21);
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        P p = c;
        int i6 = a + 103;
        b = i6 % 128;
        int i7 = i6 % 2;
        return p;
    }

    public void h(Context context, Bitmap bitmap, String str) {
        int i = 2 % 2;
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            ImageView imageView = new ImageView(context);
            int i2 = a;
            int i3 = (i2 ^ 5) + ((i2 & 5) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (str.length() > 0) {
                int i5 = a;
                int i6 = i5 & 101;
                int i7 = ((((i5 ^ 101) | i6) << 1) - (~(-((i5 | 101) & (~i6))))) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                builder.setTitle(str);
                int i9 = b;
                int i10 = i9 & 53;
                int i11 = (i9 ^ 53) | i10;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 3 / 4;
                }
            }
            builder.setView(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            int i14 = a + 107;
            b = i14 % 128;
            int i15 = i14 % 2;
            imageView.setImageBitmap(bitmap);
            AlertDialog alertDialogCreate = builder.create();
            Window window = alertDialogCreate.getWindow();
            int i16 = a + 83;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                window.setFlags(4, 3);
            } else {
                window.setFlags(4, 4);
            }
            alertDialogCreate.show();
        } catch (Exception unused) {
            Toast.makeText(context, "Error displaying image", 1).show();
        }
    }

    public static Bitmap f(String str, Bitmap bitmap) {
        int i;
        int height;
        int i2;
        int i3;
        int i4 = 2 % 2;
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            int i5 = a;
            int i6 = ((i5 ^ 73) | (i5 & 73)) << 1;
            int i7 = -((i5 & (-74)) | ((~i5) & 73));
            int i8 = (i6 & i7) + (i6 | i7);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            if (attributeInt != 3) {
                int i11 = (i9 & (-48)) | ((~i9) & 47);
                int i12 = (i9 & 47) << 1;
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                a = i13 % 128;
                if (i13 % 2 == 0 ? attributeInt == 6 : attributeInt == 121) {
                    int i14 = ((i9 | 97) << 1) - ((i9 & (-98)) | ((~i9) & 97));
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    i = 90;
                } else {
                    int i16 = i9 & 7;
                    int i17 = i16 + ((i9 ^ 7) | i16);
                    int i18 = i17 % 128;
                    a = i18;
                    int i19 = i17 % 2;
                    if (attributeInt != 8) {
                        int i20 = (((i18 & (-66)) | ((~i18) & 65)) - (~(-(-((i18 & 65) << 1))))) - 1;
                        b = i20 % 128;
                        i = i20 % 2 == 0 ? 1 : 0;
                    } else {
                        int i21 = i9 ^ 95;
                        int i22 = (i9 & 95) << 1;
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        i = 270;
                    }
                }
            } else {
                int i25 = i5 ^ 97;
                int i26 = (i5 & 97) << 1;
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                b = i27 % 128;
                int i28 = i27 % 2;
                i = 180;
            }
            Matrix matrix = new Matrix();
            float f = i;
            int i29 = b;
            int i30 = i29 & 77;
            int i31 = i29 | 77;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                matrix.postRotate(f);
                int width = bitmap.getWidth();
                height = bitmap.getHeight();
                i2 = width;
                i3 = 1;
            } else {
                matrix.postRotate(f);
                int width2 = bitmap.getWidth();
                height = bitmap.getHeight();
                i2 = width2;
                i3 = 0;
            }
            bitmap = Bitmap.createBitmap(bitmap, i3, 0, i2, height, matrix, true);
            int i33 = a;
            int i34 = i33 ^ 49;
            int i35 = ((i33 & 49) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 & i36) + (i35 | i36);
            b = i37 % 128;
            int i38 = i37 % 2;
        } catch (Exception unused) {
        }
        float width3 = 1280.0f / bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int i39 = a;
        int i40 = ((i39 ^ 61) | (i39 & 61)) << 1;
        int i41 = -(((~i39) & 61) | (i39 & (-62)));
        int i42 = (i40 & i41) + (i41 | i40);
        b = i42 % 128;
        int i43 = i42 % 2;
        float fMin = Math.min(width3, 1280.0f / height2);
        float width4 = bitmap.getWidth();
        int i44 = a + 111;
        b = i44 % 128;
        int i45 = i44 % 2;
        int iRound = Math.round(width4 * fMin);
        float height3 = fMin * bitmap.getHeight();
        int i46 = b;
        int i47 = i46 & 63;
        int i48 = ((i46 | 63) & (~i47)) + (i47 << 1);
        a = i48 % 128;
        int i49 = i48 % 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, Math.round(height3), true);
        int i50 = b;
        int i51 = (-2) - ((((i50 | 116) << 1) - (i50 ^ 116)) ^ (-1));
        a = i51 % 128;
        if (i51 % 2 != 0) {
            int i52 = 18 / 0;
        }
        return bitmapCreateScaledBitmap;
    }
}
