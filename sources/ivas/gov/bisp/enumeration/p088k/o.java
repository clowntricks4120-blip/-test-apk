package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;

/* JADX INFO: loaded from: classes.dex */
public class o {
    private static int a = 0;
    private static int b = 1;
    public final ImageView c;
    public ae d;
    public int e = 0;

    public o(ImageView imageView) {
        this.c = imageView;
    }

    public void e(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-84)) | ((~i3) & 83);
        int i5 = (i3 & 83) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            int i8 = (i7 & 35) + (i7 | 35);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                A.c(this.c.getContext(), i);
                throw null;
            }
            Drawable drawableC = A.c(this.c.getContext(), i);
            if (drawableC != null) {
                W.c(drawableC);
                int i9 = a;
                int i10 = (i9 ^ 39) + ((i9 & 39) << 1);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 4 / 3;
                }
            }
            this.c.setImageDrawable(drawableC);
            int i12 = a;
            int i13 = i12 & 85;
            int i14 = (((i12 | 85) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            this.c.setImageDrawable(null);
            int i16 = a;
            int i17 = i16 ^ 123;
            int i18 = (i16 & 123) << 1;
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        c();
        int i21 = a;
        int i22 = (i21 & 13) + (i21 | 13);
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    public void g(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b + 27;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (this.d == null) {
            this.d = new ae();
            int i4 = b;
            int i5 = ((i4 & 38) + (i4 | 38)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
        ae aeVar = this.d;
        aeVar.b = mode;
        int i7 = b;
        int i8 = (((i7 & (-42)) | ((~i7) & 41)) - (~((i7 & 41) << 1))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        aeVar.c = true;
        c();
        int i10 = a;
        int i11 = i10 & 65;
        int i12 = i11 + ((i10 ^ 65) | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public void f(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = i3 + ((i2 ^ 11) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.d == null) {
            this.d = new ae();
            int i6 = b + 115;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        ae aeVar = this.d;
        aeVar.a = colorStateList;
        aeVar.d = true;
        int i8 = b;
        int i9 = i8 ^ 89;
        int i10 = ((i8 & 89) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        c();
        if (i13 != 0) {
            throw null;
        }
    }

    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 6) + (i2 | 6);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.c.getDrawable();
        if (drawable != null) {
            int i6 = a + 75;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                W.c(drawable);
                throw null;
            }
            W.c(drawable);
            int i7 = b;
            int i8 = (((i7 | 72) << 1) - (i7 ^ 72)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (drawable != null) {
            int i10 = b;
            int i11 = (i10 & 61) + (i10 | 61);
            int i12 = i11 % 128;
            a = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            ae aeVar = this.d;
            if (aeVar != null) {
                int i13 = i12 & 89;
                int i14 = ((i12 | 89) & (~i13)) + (i13 << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                P.e(drawable, aeVar, this.c.getDrawableState());
                int i16 = b;
                int i17 = i16 ^ 89;
                int i18 = (i16 & 89) << 1;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        int i21 = b;
        int i22 = i21 & 107;
        int i23 = (i21 ^ 107) | i22;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2 A[Catch: all -> 0x01ad, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01ad, blocks: (B:12:0x0093, B:17:0x00b0, B:22:0x00bd, B:27:0x00e2, B:29:0x00eb, B:20:0x00b7, B:35:0x0112, B:36:0x0117, B:40:0x012b, B:44:0x0140, B:45:0x0146, B:46:0x014a, B:47:0x0151, B:53:0x0169, B:58:0x0189, B:61:0x01a5, B:62:0x01ac, B:54:0x0170), top: B:66:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb A[Catch: all -> 0x01ad, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01ad, blocks: (B:12:0x0093, B:17:0x00b0, B:22:0x00bd, B:27:0x00e2, B:29:0x00eb, B:20:0x00b7, B:35:0x0112, B:36:0x0117, B:40:0x012b, B:44:0x0140, B:45:0x0146, B:46:0x014a, B:47:0x0151, B:53:0x0169, B:58:0x0189, B:61:0x01a5, B:62:0x01ac, B:54:0x0170), top: B:66:0x0093 }] */
    public void d(AttributeSet attributeSet, int i) {
        int iN;
        ImageView imageView;
        ImageView imageView2;
        ColorStateList colorStateListH;
        int iR;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 | 51;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 51)) & i6);
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        Context context = this.c.getContext();
        int[] iArr = h.h;
        int i11 = b;
        int i12 = (i11 | 45) << 1;
        int i13 = -(((~i11) & 45) | (i11 & (-46)));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        B bC = i14 % 2 != 0 ? B.c(context, attributeSet, iArr, i, 1) : B.c(context, attributeSet, iArr, i, 0);
        ImageView imageView3 = this.c;
        int i15 = a;
        int i16 = (i15 & (-38)) | ((~i15) & 37);
        int i17 = -(-((i15 & 37) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        Context context2 = imageView3.getContext();
        TypedArray typedArray = bC.d;
        int i20 = a;
        int i21 = ((i20 & (-14)) | ((~i20) & 13)) + ((i20 & 13) << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            T.p(imageView3, context2, iArr, attributeSet, typedArray, i, 1);
        } else {
            T.p(imageView3, context2, iArr, attributeSet, typedArray, i, 0);
        }
        int i22 = b;
        int i23 = i22 & 79;
        int i24 = (i22 ^ 79) | i23;
        int i25 = (i23 & i24) + (i24 | i23);
        a = i25 % 128;
        int i26 = i25 % 2;
        try {
            Drawable drawable = this.c.getDrawable();
            if (drawable == null) {
                int i27 = a;
                int i28 = i27 & 83;
                int i29 = i27 | 83;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    iR = bC.r(0, -1);
                    if (iR != -1) {
                        drawable = A.c(this.c.getContext(), iR);
                        i2 = b;
                        int i31 = ((i2 | 117) << 1) - (i2 ^ 117);
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        if (drawable != null) {
                            i3 = (i2 ^ 43) + ((i2 & 43) << 1);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                this.c.setImageDrawable(drawable);
                                int i33 = 47 / 0;
                            } else {
                                this.c.setImageDrawable(drawable);
                            }
                            int i34 = a;
                            int i35 = ((i34 | 119) << 1) - (i34 ^ 119);
                            b = i35 % 128;
                            int i36 = i35 % 2;
                        }
                    }
                } else {
                    iR = bC.r(1, -1);
                    if (iR != -1) {
                        drawable = A.c(this.c.getContext(), iR);
                        i2 = b;
                        int i37 = ((i2 | 117) << 1) - (i2 ^ 117);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        if (drawable != null) {
                            i3 = (i2 ^ 43) + ((i2 & 43) << 1);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                this.c.setImageDrawable(drawable);
                                int i39 = 47 / 0;
                            } else {
                                this.c.setImageDrawable(drawable);
                            }
                            int i310 = a;
                            int i311 = ((i310 | 119) << 1) - (i310 ^ 119);
                            b = i311 % 128;
                            int i312 = i311 % 2;
                        }
                    }
                }
            }
            if (drawable != null) {
                int i40 = b;
                int i41 = (-2) - (((i40 & 20) + (i40 | 20)) ^ (-1));
                a = i41 % 128;
                if (i41 % 2 != 0) {
                    W.c(drawable);
                    int i42 = 43 / 0;
                } else {
                    W.c(drawable);
                }
                int i43 = b;
                int i44 = i43 & 21;
                int i45 = i44 + ((i43 ^ 21) | i44);
                a = i45 % 128;
                if (i45 % 2 != 0) {
                    int i46 = 3 / 5;
                }
            }
            if (bC.t(2)) {
                int i47 = a;
                int i48 = ((i47 | 123) << 1) - (i47 ^ 123);
                b = i48 % 128;
                if (i48 % 2 == 0) {
                    imageView2 = this.c;
                    colorStateListH = bC.h(5);
                } else {
                    imageView2 = this.c;
                    colorStateListH = bC.h(2);
                }
                imageView2.setImageTintList(colorStateListH);
            }
            if (!(!bC.t(3))) {
                int i49 = a;
                int i50 = (i49 ^ 95) + ((i49 & 95) << 1);
                b = i50 % 128;
                if (i50 % 2 == 0) {
                    imageView = this.c;
                    iN = bC.n(5, -1);
                } else {
                    ImageView imageView4 = this.c;
                    iN = bC.n(3, -1);
                    imageView = imageView4;
                }
                int i51 = a;
                int i52 = ((i51 | 75) << 1) - (i51 ^ 75);
                b = i52 % 128;
                if (i52 % 2 == 0) {
                    imageView.setImageTintMode(W.e(iN, null));
                    throw null;
                }
                imageView.setImageTintMode(W.e(iN, null));
            }
            bC.d.recycle();
            int i53 = b;
            int i54 = i53 & 61;
            int i55 = ((i53 | 61) & (~i54)) + (i54 << 1);
            a = i55 % 128;
            int i56 = i55 % 2;
        } catch (Throwable th) {
            bC.d.recycle();
            throw th;
        }
    }
}
