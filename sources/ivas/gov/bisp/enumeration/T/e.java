package ivas.gov.bisp.enumeration.T;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class e extends Property<ImageView, Matrix> {
    private static int a = 1;
    private static int b;
    public final Matrix c;

    public e() {
        super(Matrix.class, "imageMatrixProperty");
        this.c = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.set(imageView.getImageMatrix());
        int i5 = b;
        int i6 = i5 & 85;
        int i7 = i5 | 85;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 == 0) {
            throw null;
        }
        Matrix matrix = this.c;
        int i10 = ((i9 | 23) << 1) - (i9 ^ 23);
        b = i10 % 128;
        int i11 = i10 % 2;
        return matrix;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        int i = 2 % 2;
        int i2 = b + 113;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = (i3 & 101) + (i3 | 101);
        b = i4 % 128;
        int i5 = i4 % 2;
        imageView.setImageMatrix(matrix);
        if (i5 != 0) {
            int i6 = 21 / 0;
        }
    }
}
