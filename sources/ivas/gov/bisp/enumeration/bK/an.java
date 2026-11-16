package ivas.gov.bisp.enumeration.bK;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class an {
    private static int a = 0;
    private static int b = 1;
    public static an c;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public static an c() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 43;
        int i5 = ((((i3 ^ 43) | i4) << 1) - (~(-((i3 | 43) & (~i4))))) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
            if (c == null) {
                c = new an();
                int i7 = b;
                int i8 = i7 & 37;
                i = i8 + ((i7 ^ 37) | i8);
                a = i % 128;
                if (i % 2 != 0) {
                    int i9 = 5 % 5;
                }
            }
        } else if (c == null) {
            c = new an();
            int i10 = b;
            int i11 = i10 & 37;
            i = i11 + ((i10 ^ 37) | i11);
            a = i % 128;
            if (i % 2 != 0) {
                int i12 = 5 % 5;
            }
        }
        an anVar = c;
        int i13 = a + 87;
        b = i13 % 128;
        int i14 = i13 % 2;
        return anVar;
    }

    public byte[] d(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat;
        int i;
        int i2 = 2 % 2;
        Bitmap bitmapCopy = Bitmap.createBitmap(bitmap).copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapCopy);
        Paint paint = new Paint();
        paint.setTextSize(30.0f);
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = a;
        int i4 = ((i3 | 13) << 1) - (i3 ^ 13);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            i = 101;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
            i = 20;
        }
        bitmapCopy.compress(compressFormat, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i5 = b;
        int i6 = (-2) - (((i5 & 38) + (i5 | 38)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
        return byteArray;
    }
}
