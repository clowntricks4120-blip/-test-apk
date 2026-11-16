package ivas.gov.bisp.enumeration.U;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ivas.gov.bisp.enumeration.O.C0019p;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.U.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0027p extends C0019p {
    private static int a = 1;
    private static int b;
    public final Paint A;
    public final RectF B;
    public int C;

    public C0027p() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    public void B(float f, float f2, float f3, float f4) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 101;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            float f5 = this.B.left;
            obj.hashCode();
            throw null;
        }
        RectF rectF = this.B;
        if (f == rectF.left) {
            int i6 = a;
            int i7 = (-2) - ((((i6 | 54) << 1) - (i6 ^ 54)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 9 / 0;
                if (f2 == rectF.top) {
                    int i9 = b;
                    i2 = (i9 & 101) + (i9 | 101);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        float f6 = rectF.right;
                        obj.hashCode();
                        throw null;
                    }
                    if (f3 == rectF.right) {
                        int i10 = a;
                        i3 = ((i10 ^ 10) + ((i10 & 10) << 1)) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            float f7 = rectF.bottom;
                            throw null;
                        }
                        if (f4 != rectF.bottom) {
                        }
                    }
                }
            } else if (f2 == rectF.top) {
                int i11 = b;
                i2 = (i11 & 101) + (i11 | 101);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    float f8 = rectF.right;
                    obj.hashCode();
                    throw null;
                }
                if (f3 == rectF.right) {
                    int i12 = a;
                    i3 = ((i12 ^ 10) + ((i12 & 10) << 1)) - 1;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        float f9 = rectF.bottom;
                        throw null;
                    }
                    if (f4 != rectF.bottom) {
                    }
                }
            }
            rectF.set(f, f2, f3, f4);
            int i13 = b;
            int i14 = i13 & 95;
            int i15 = (i13 | 95) & (~i14);
            int i16 = i14 << 1;
            i = (i15 & i16) + (i15 | i16);
            a = i % 128;
            if (i % 2 != 0) {
                invalidateSelf();
                throw null;
            }
            invalidateSelf();
        } else {
            rectF.set(f, f2, f3, f4);
            int i17 = b;
            int i18 = i17 & 95;
            int i19 = (i17 | 95) & (~i18);
            int i110 = i18 << 1;
            i = (i19 & i110) + (i19 | i110);
            a = i % 128;
            if (i % 2 != 0) {
                invalidateSelf();
                throw null;
            }
            invalidateSelf();
        }
        int i20 = a;
        int i21 = (i20 & (-72)) | ((~i20) & 71);
        int i22 = -(-((i20 & 71) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    public C0027p(ivas.gov.bisp.enumeration.O.t tVar) {
        if (tVar == null) {
            tVar = new ivas.gov.bisp.enumeration.O.t();
            int i = b + 13;
            a = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        super(tVar);
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.B = new RectF();
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p
    public void l(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = ((i2 | 103) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.B.isEmpty();
            obj.hashCode();
            throw null;
        }
        if (this.B.isEmpty()) {
            int i5 = a;
            int i6 = i5 & 29;
            int i7 = (i5 | 29) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            super.l(canvas);
            if (i10 != 0) {
                throw null;
            }
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.l(canvas2);
        int i11 = a;
        int i12 = i11 & 21;
        int i13 = -(-((i11 ^ 21) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        canvas2.drawRect(this.B, this.A);
        int i16 = a;
        int i17 = ((((i16 ^ 51) | (i16 & 51)) << 1) - (~(-(((~i16) & 51) | (i16 & (-52)))))) - 1;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = a + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = getCallback() instanceof View;
            throw null;
        }
        Drawable.Callback callback = getCallback();
        if (!(!(callback instanceof View))) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                int i3 = a;
                int i4 = i3 & 71;
                int i5 = ((i3 | 71) & (~i4)) + (i4 << 1);
                b = i5 % 128;
                int i6 = i5 % 2;
                view.setLayerType(2, null);
                int i7 = a + 25;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            float width = canvas.getWidth();
            int height = canvas.getHeight();
            int i9 = a;
            int i10 = ((((i9 ^ 5) | (i9 & 5)) << 1) - (~(-(((~i9) & 5) | (i9 & (-6)))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            this.C = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            int i12 = b;
            int i13 = i12 & 107;
            int i14 = (i12 ^ 107) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        super.draw(canvas);
        if (!(getCallback() instanceof View)) {
            int i17 = a;
            int i18 = ((i17 | 79) << 1) - (((~i17) & 79) | (i17 & (-80)));
            b = i18 % 128;
            int i19 = i18 % 2;
            canvas.restoreToCount(this.C);
            int i20 = b;
            int i21 = (i20 & 25) + (i20 | 25);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 4 % 5;
            }
        }
        int i23 = b;
        int i24 = (-2) - (((i23 ^ 124) + ((i23 & 124) << 1)) ^ (-1));
        a = i24 % 128;
        int i25 = i24 % 2;
    }
}
