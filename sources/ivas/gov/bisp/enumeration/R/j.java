package ivas.gov.bisp.enumeration.R;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    public static final int[] e;
    public static final float[] f;
    public final Paint h;
    public final Paint i;
    public int j;
    public int k;
    public int l;
    public static final int[] c = new int[3];
    public static final float[] d = {0.0f, 0.5f, 1.0f};
    private static int b = 37 % 128;
    public final Path m = new Path();
    public Paint n = new Paint();
    public final Paint g = new Paint();

    public j() {
        c(-16777216);
        this.n.setColor(0);
        Paint paint = new Paint(4);
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i = new Paint(paint);
    }

    static {
        int[] iArr = new int[4];
        if (37 % 2 != 0) {
            e = iArr;
            f = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
        } else {
            e = iArr;
            f = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void c(int i) {
        int iF;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 7) + (i3 | 7);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.j = ivas.gov.bisp.enumeration.p007ag.j.f(i, 68);
        int iF2 = ivas.gov.bisp.enumeration.p007ag.j.f(i, 20);
        int i6 = a;
        int i7 = (i6 & (-16)) | ((~i6) & 15);
        int i8 = (i6 & 15) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            this.l = iF2;
            iF = ivas.gov.bisp.enumeration.p007ag.j.f(i, 1);
        } else {
            this.l = iF2;
            iF = ivas.gov.bisp.enumeration.p007ag.j.f(i, 0);
        }
        this.k = iF;
        this.g.setColor(this.j);
        int i10 = b + 57;
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
