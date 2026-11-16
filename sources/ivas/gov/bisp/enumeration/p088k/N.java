package ivas.gov.bisp.enumeration.p088k;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import ivas.gov.bisp.enumeration.p008ah.c;

/* JADX INFO: loaded from: classes.dex */
public class N {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final ProgressBar d;
    public Bitmap e;

    static {
        int i = (96 << 1) - 97;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public N(ProgressBar progressBar) {
        this.d = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable d(Drawable drawable, boolean z) {
        Drawable drawable2;
        LayerDrawable layerDrawable;
        int numberOfLayers;
        Drawable[] drawableArr;
        boolean z2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = -(-((i2 ^ 31) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (drawable instanceof c) {
            int i8 = i2 + 106;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                ((c) drawable).b();
                throw null;
            }
            c cVar = (c) drawable;
            Drawable drawableB = cVar.b();
            if (drawableB != null) {
                int i10 = a;
                int i11 = i10 ^ 29;
                int i12 = (((i10 & 29) | i11) << 1) - i11;
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    d(drawableB, z);
                    throw null;
                }
                cVar.e(d(drawableB, z));
                int i13 = a + 79;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                int i15 = (i2 & (-4)) | ((~i2) & 3);
                int i16 = (i2 & 3) << 1;
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    layerDrawable = (LayerDrawable) drawable;
                    numberOfLayers = layerDrawable.getNumberOfLayers();
                    drawableArr = new Drawable[numberOfLayers];
                    int i18 = 88 / 0;
                } else {
                    layerDrawable = (LayerDrawable) drawable;
                    numberOfLayers = layerDrawable.getNumberOfLayers();
                    drawableArr = new Drawable[numberOfLayers];
                }
                int i19 = b;
                int i20 = i19 & 125;
                int i21 = i20 + ((i19 ^ 125) | i20);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 2 % 5;
                }
                int i23 = 0;
                while (i23 < numberOfLayers) {
                    int i24 = b;
                    int i25 = i24 & 67;
                    int i26 = i24 | 67;
                    int i27 = (i25 & i26) + (i26 | i25);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    int id = layerDrawable.getId(i23);
                    Drawable drawable3 = layerDrawable.getDrawable(i23);
                    int i29 = b;
                    int i30 = i29 & 111;
                    int i31 = -(-((i29 ^ 111) | i30));
                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                    int i33 = i32 % 128;
                    a = i33;
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                    if (id == 16908301 || id == 16908303) {
                        int i34 = (i33 ^ 3) + ((i33 & 3) << 1);
                        b = i34 % 128;
                        if (i34 % 2 == 0) {
                            int i35 = 5 / 3;
                        }
                        z2 = true;
                    } else {
                        int i36 = (i33 ^ 49) + ((i33 & 49) << 1);
                        int i37 = i36 % 128;
                        b = i37;
                        int i38 = i36 % 2;
                        int i39 = ((i37 & 4) + (i37 | 4)) - 1;
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        z2 = false;
                    }
                    drawableArr[i23] = d(drawable3, z2);
                    int i41 = b;
                    int i42 = ((i41 | 125) << 1) - (i41 ^ 125);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = (i23 & (-103)) + (i23 | (-103));
                    i23 = (i44 & 104) + (i44 | 104);
                    int i45 = ((i41 & 42) + (i41 | 42)) - 1;
                    a = i45 % 128;
                    int i46 = i45 % 2;
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                int i47 = b;
                int i48 = (i47 & 63) + (i47 | 63);
                a = i48 % 128;
                int i49 = i48 % 2;
                int i50 = 0;
                while (i50 < numberOfLayers) {
                    int i51 = b + 75;
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    layerDrawable2.setId(i50, layerDrawable.getId(i50));
                    int i53 = a;
                    int i54 = ((i53 | 71) << 1) - (i53 ^ 71);
                    b = i54 % 128;
                    if (i54 % 2 == 0) {
                        layerDrawable2.setLayerGravity(i50, layerDrawable.getLayerGravity(i50));
                        layerDrawable2.setLayerWidth(i50, layerDrawable.getLayerWidth(i50));
                        int i55 = 12 / 0;
                    } else {
                        layerDrawable2.setLayerGravity(i50, layerDrawable.getLayerGravity(i50));
                        layerDrawable2.setLayerWidth(i50, layerDrawable.getLayerWidth(i50));
                    }
                    layerDrawable2.setLayerHeight(i50, layerDrawable.getLayerHeight(i50));
                    int i56 = a;
                    int i57 = i56 & 115;
                    int i58 = (i56 | 115) & (~i57);
                    int i59 = i57 << 1;
                    int i60 = (i58 & i59) + (i58 | i59);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    layerDrawable2.setLayerInsetLeft(i50, layerDrawable.getLayerInsetLeft(i50));
                    layerDrawable2.setLayerInsetRight(i50, layerDrawable.getLayerInsetRight(i50));
                    int i62 = a;
                    int i63 = (((i62 & (-16)) | ((~i62) & 15)) - (~(-(-((i62 & 15) << 1))))) - 1;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    layerDrawable2.setLayerInsetTop(i50, layerDrawable.getLayerInsetTop(i50));
                    int i65 = b;
                    int i66 = i65 & 33;
                    int i67 = ((i65 ^ 33) | i66) << 1;
                    int i68 = -((i65 | 33) & (~i66));
                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    layerDrawable2.setLayerInsetBottom(i50, layerDrawable.getLayerInsetBottom(i50));
                    layerDrawable2.setLayerInsetStart(i50, layerDrawable.getLayerInsetStart(i50));
                    int i71 = a;
                    int i72 = (i71 ^ 118) + ((i71 & 118) << 1);
                    int i73 = (i72 ^ (-1)) + (i72 << 1);
                    b = i73 % 128;
                    int i74 = i73 % 2;
                    layerDrawable2.setLayerInsetEnd(i50, layerDrawable.getLayerInsetEnd(i50));
                    i50 = ((((i50 ^ 1) | (i50 & 1)) << 1) - (~(-(((~i50) & 1) | (i50 & (-2)))))) - 1;
                    int i75 = a;
                    int i76 = i75 & 17;
                    int i77 = ((i75 | 17) & (~i76)) + (i76 << 1);
                    b = i77 % 128;
                    int i78 = i77 % 2;
                }
                int i79 = (-2) - ((a + 46) ^ (-1));
                b = i79 % 128;
                if (i79 % 2 == 0) {
                    int i80 = 63 / 0;
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                int i81 = (i6 | 73) << 1;
                int i82 = -(i6 ^ 73);
                int i83 = (i81 & i82) + (i81 | i82);
                a = i83 % 128;
                int i84 = i83 % 2;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.e == null) {
                    int i85 = a;
                    int i86 = (i85 & (-92)) | ((~i85) & 91);
                    int i87 = -(-((i85 & 91) << 1));
                    int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                    int i89 = i88 % 128;
                    b = i89;
                    if (i88 % 2 == 0) {
                        this.e = bitmap;
                        obj.hashCode();
                        throw null;
                    }
                    this.e = bitmap;
                    int i90 = i89 + 7;
                    a = i90 % 128;
                    if (i90 % 2 != 0) {
                        int i91 = 2 / 2;
                    }
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                int i92 = b;
                int i93 = (i92 & (-88)) | ((~i92) & 87);
                int i94 = -(-((i92 & 87) << 1));
                int i95 = (i93 & i94) + (i94 | i93);
                a = i95 % 128;
                int i96 = i95 % 2;
                shapeDrawable.getPaint().setShader(bitmapShader);
                int i97 = b;
                int i98 = ((i97 & 66) + (i97 | 66)) - 1;
                a = i98 % 128;
                if (i98 % 2 != 0) {
                    shapeDrawable.getPaint();
                    bitmapDrawable.getPaint().getColorFilter();
                    obj.hashCode();
                    throw null;
                }
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    drawable2 = shapeDrawable;
                    ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
                    int i99 = b;
                    int i100 = i99 & 119;
                    int i101 = i100 + ((i99 ^ 119) | i100);
                    a = i101 % 128;
                    int i102 = i101 % 2;
                    drawable2 = clipDrawable;
                }
                drawable2 = shapeDrawable;
                int i103 = b;
                int i104 = i103 ^ 5;
                int i105 = ((((i103 & 5) | i104) << 1) - (~(-i104))) - 1;
                a = i105 % 128;
                if (i105 % 2 == 0) {
                    return drawable2;
                }
                throw null;
            }
        }
        int i106 = a;
        int i107 = ((i106 ^ 101) | (i106 & 101)) << 1;
        int i108 = -(((~i106) & 101) | (i106 & (-102)));
        int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
        b = i109 % 128;
        int i110 = i109 % 2;
        return drawable;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006d  */
    /* JADX WARN: Code duplicated, block: B:13:0x009f  */
    /* JADX WARN: Code duplicated, block: B:15:0x00e4 A[LOOP:0: B:11:0x009b->B:15:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0057  */
    public void c(AttributeSet attributeSet, int i) {
        AnimationDrawable animationDrawable;
        int numberOfFrames;
        AnimationDrawable animationDrawable2;
        int i2;
        Drawable drawableD;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 112) + ((i5 & 112) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        Context context = this.d.getContext();
        int[] iArr = c;
        int i8 = b;
        int i9 = ((i8 ^ 31) | (i8 & 31)) << 1;
        int i10 = -(((~i8) & 31) | (i8 & (-32)));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        B bC = B.c(context, attributeSet, iArr, i, 0);
        Drawable drawableM = bC.m(0);
        int i13 = a;
        int i14 = i13 ^ 5;
        int i15 = (((i13 & 5) | i14) << 1) - i14;
        int i16 = i15 % 128;
        b = i16;
        Object obj = null;
        if (i15 % 2 == 0) {
            int i17 = 33 / 0;
            if (drawableM != null) {
                int i18 = i16 & 69;
                int i19 = -(-(i16 | 69));
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                a = i20 % 128;
                int i21 = i20 % 2;
                ProgressBar progressBar = this.d;
                if (drawableM instanceof AnimationDrawable) {
                    animationDrawable = (AnimationDrawable) drawableM;
                    numberOfFrames = animationDrawable.getNumberOfFrames();
                    animationDrawable2 = new AnimationDrawable();
                    int i22 = (-2) - ((b + 2) ^ (-1));
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    animationDrawable2.setOneShot(animationDrawable.isOneShot());
                    int i24 = a;
                    int i25 = (((i24 | 96) << 1) - (i24 ^ 96)) - 1;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    i2 = 0;
                    while (i2 < numberOfFrames) {
                        int i27 = b;
                        int i28 = i27 | 123;
                        int i29 = i28 << 1;
                        int i30 = -((~(i27 & 123)) & i28);
                        int i31 = (i29 & i30) + (i30 | i29);
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        drawableD = d(animationDrawable.getFrame(i2), true);
                        int i33 = (-2) - ((a + 16) ^ (-1));
                        b = i33 % 128;
                        int i34 = i33 % 2;
                        drawableD.setLevel(10000);
                        int i35 = a;
                        int i36 = i35 & 17;
                        int i37 = ((i35 ^ 17) | i36) << 1;
                        int i38 = -((i35 | 17) & (~i36));
                        i3 = ((i37 | i38) << 1) - (i38 ^ i37);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i2));
                            obj.hashCode();
                            throw null;
                        }
                        animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i2));
                        int i39 = ((((i2 ^ 92) | (i2 & 92)) << 1) - (~(-(((~i2) & 92) | (i2 & (-93)))))) - 1;
                        int i40 = i39 & (-91);
                        int i41 = ((i39 ^ (-91)) | i40) << 1;
                        int i42 = -((i39 | (-91)) & (~i40));
                        i2 = (i41 | i42) + (i41 & i42);
                        int i43 = b;
                        int i44 = ((i43 ^ 35) | (i43 & 35)) << 1;
                        int i45 = -(((~i43) & 35) | (i43 & (-36)));
                        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    animationDrawable2.setLevel(10000);
                    int i48 = b + 77;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    drawableM = animationDrawable2;
                }
                progressBar.setIndeterminateDrawable(drawableM);
                int i50 = b;
                int i51 = (i50 & 106) + (i50 | 106);
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                a = i52 % 128;
                int i53 = i52 % 2;
            }
        } else if (drawableM != null) {
            int i110 = i16 & 69;
            int i111 = -(-(i16 | 69));
            int i210 = ((i110 | i111) << 1) - (i110 ^ i111);
            a = i210 % 128;
            int i211 = i210 % 2;
            ProgressBar progressBar2 = this.d;
            if (drawableM instanceof AnimationDrawable) {
                animationDrawable = (AnimationDrawable) drawableM;
                numberOfFrames = animationDrawable.getNumberOfFrames();
                animationDrawable2 = new AnimationDrawable();
                int i212 = (-2) - ((b + 2) ^ (-1));
                a = i212 % 128;
                int i213 = i212 % 2;
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                int i214 = a;
                int i215 = (((i214 | 96) << 1) - (i214 ^ 96)) - 1;
                b = i215 % 128;
                int i216 = i215 % 2;
                i2 = 0;
                while (i2 < numberOfFrames) {
                    int i217 = b;
                    int i218 = i217 | 123;
                    int i219 = i218 << 1;
                    int i310 = -((~(i217 & 123)) & i218);
                    int i311 = (i219 & i310) + (i310 | i219);
                    a = i311 % 128;
                    int i312 = i311 % 2;
                    drawableD = d(animationDrawable.getFrame(i2), true);
                    int i313 = (-2) - ((a + 16) ^ (-1));
                    b = i313 % 128;
                    int i314 = i313 % 2;
                    drawableD.setLevel(10000);
                    int i315 = a;
                    int i316 = i315 & 17;
                    int i317 = ((i315 ^ 17) | i316) << 1;
                    int i318 = -((i315 | 17) & (~i316));
                    i3 = ((i317 | i318) << 1) - (i318 ^ i317);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i2));
                        obj.hashCode();
                        throw null;
                    }
                    animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i2));
                    int i319 = ((((i2 ^ 92) | (i2 & 92)) << 1) - (~(-(((~i2) & 92) | (i2 & (-93)))))) - 1;
                    int i410 = i319 & (-91);
                    int i411 = ((i319 ^ (-91)) | i410) << 1;
                    int i412 = -((i319 | (-91)) & (~i410));
                    i2 = (i411 | i412) + (i411 & i412);
                    int i413 = b;
                    int i414 = ((i413 ^ 35) | (i413 & 35)) << 1;
                    int i415 = -(((~i413) & 35) | (i413 & (-36)));
                    int i416 = (i414 ^ i415) + ((i415 & i414) << 1);
                    a = i416 % 128;
                    int i417 = i416 % 2;
                }
                animationDrawable2.setLevel(10000);
                int i418 = b + 77;
                a = i418 % 128;
                int i419 = i418 % 2;
                drawableM = animationDrawable2;
            }
            progressBar2.setIndeterminateDrawable(drawableM);
            int i54 = b;
            int i55 = (i54 & 106) + (i54 | 106);
            int i56 = (i55 ^ (-1)) + (i55 << 1);
            a = i56 % 128;
            int i57 = i56 % 2;
        }
        Drawable drawableM2 = bC.m(1);
        if (drawableM2 != null) {
            int i58 = b + 116;
            int i59 = (i58 ^ (-1)) + (i58 << 1);
            a = i59 % 128;
            int i60 = i59 % 2;
            this.d.setProgressDrawable(d(drawableM2, false));
            int i61 = b;
            int i62 = ((i61 ^ 107) - (~((i61 & 107) << 1))) - 1;
            a = i62 % 128;
            int i63 = i62 % 2;
        }
        bC.d.recycle();
        int i64 = b;
        int i65 = (((i64 & (-122)) | ((~i64) & 121)) - (~((i64 & 121) << 1))) - 1;
        a = i65 % 128;
        if (i65 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
