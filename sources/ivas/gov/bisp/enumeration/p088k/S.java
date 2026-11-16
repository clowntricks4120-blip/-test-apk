package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class S extends N {
    private static int a = 0;
    private static int b = 1;
    public boolean f;
    public final SeekBar g;
    public ColorStateList h;
    public Drawable i;
    public PorterDuff.Mode j;
    public boolean k;

    public S(SeekBar seekBar) {
        super(seekBar);
        this.h = null;
        this.j = null;
        this.k = false;
        this.f = false;
        this.g = seekBar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r2
  0x0021: PHI (r2v5 android.graphics.drawable.Drawable) = (r2v4 android.graphics.drawable.Drawable), (r2v32 android.graphics.drawable.Drawable) binds: [B:8:0x001f, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e() {
        Drawable drawable;
        Drawable drawableMutate;
        int i;
        Drawable drawable2;
        PorterDuff.Mode mode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 & 38) + (i5 | 38)) - 1;
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            drawable = this.i;
            int i8 = 96 / 0;
            if (drawable != null) {
                if (this.k) {
                    drawableMutate = drawable.mutate();
                    this.i = drawableMutate;
                    i = a;
                    int i9 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    if (!(!this.k)) {
                        int i11 = (i ^ 49) + ((i & 49) << 1);
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        drawableMutate.setTintList(this.h);
                        int i13 = b + 39;
                        a = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    if (!(!this.f)) {
                        int i15 = a;
                        int i16 = i15 + 27;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        drawable2 = this.i;
                        mode = this.j;
                        i2 = i15 + 65;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            drawable2.setTintMode(mode);
                            obj.hashCode();
                            throw null;
                        }
                        drawable2.setTintMode(mode);
                        int i18 = b;
                        int i19 = i18 ^ 31;
                        int i20 = ((i18 & 31) | i19) << 1;
                        int i21 = -i19;
                        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    if (this.i.isStateful()) {
                        int i24 = b;
                        int i25 = i24 & 91;
                        int i26 = i25 + ((i24 ^ 91) | i25);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        this.i.setState(this.g.getDrawableState());
                        int i28 = b;
                        int i29 = ((i28 & 114) + (i28 | 114)) - 1;
                        a = i29 % 128;
                        int i30 = i29 % 2;
                    }
                } else {
                    i3 = ((i7 & (-84)) | ((~i7) & 83)) + ((i7 & 83) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i31 = 43 / 0;
                        if (!(!this.f)) {
                            drawableMutate = drawable.mutate();
                            this.i = drawableMutate;
                            i = a;
                            int i32 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                            b = i32 % 128;
                            int i110 = i32 % 2;
                            if (!(!this.k)) {
                                int i111 = (i ^ 49) + ((i & 49) << 1);
                                b = i111 % 128;
                                int i112 = i111 % 2;
                                drawableMutate.setTintList(this.h);
                                int i113 = b + 39;
                                a = i113 % 128;
                                int i114 = i113 % 2;
                            }
                            if (!(!this.f)) {
                                int i115 = a;
                                int i116 = i115 + 27;
                                b = i116 % 128;
                                int i117 = i116 % 2;
                                drawable2 = this.i;
                                mode = this.j;
                                i2 = i115 + 65;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    drawable2.setTintMode(mode);
                                    obj.hashCode();
                                    throw null;
                                }
                                drawable2.setTintMode(mode);
                                int i118 = b;
                                int i119 = i118 ^ 31;
                                int i210 = ((i118 & 31) | i119) << 1;
                                int i211 = -i119;
                                int i212 = (i210 ^ i211) + ((i210 & i211) << 1);
                                a = i212 % 128;
                                int i213 = i212 % 2;
                            }
                            if (this.i.isStateful()) {
                                int i214 = b;
                                int i215 = i214 & 91;
                                int i216 = i215 + ((i214 ^ 91) | i215);
                                a = i216 % 128;
                                int i217 = i216 % 2;
                                this.i.setState(this.g.getDrawableState());
                                int i218 = b;
                                int i219 = ((i218 & 114) + (i218 | 114)) - 1;
                                a = i219 % 128;
                                int i33 = i219 % 2;
                            }
                        }
                    } else if (this.f) {
                        drawableMutate = drawable.mutate();
                        this.i = drawableMutate;
                        i = a;
                        int i34 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                        b = i34 % 128;
                        int i1110 = i34 % 2;
                        if (!(!this.k)) {
                            int i1111 = (i ^ 49) + ((i & 49) << 1);
                            b = i1111 % 128;
                            int i1112 = i1111 % 2;
                            drawableMutate.setTintList(this.h);
                            int i1113 = b + 39;
                            a = i1113 % 128;
                            int i1114 = i1113 % 2;
                        }
                        if (!(!this.f)) {
                            int i1115 = a;
                            int i1116 = i1115 + 27;
                            b = i1116 % 128;
                            int i1117 = i1116 % 2;
                            drawable2 = this.i;
                            mode = this.j;
                            i2 = i1115 + 65;
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                drawable2.setTintMode(mode);
                                obj.hashCode();
                                throw null;
                            }
                            drawable2.setTintMode(mode);
                            int i1118 = b;
                            int i1119 = i1118 ^ 31;
                            int i2110 = ((i1118 & 31) | i1119) << 1;
                            int i2111 = -i1119;
                            int i2112 = (i2110 ^ i2111) + ((i2110 & i2111) << 1);
                            a = i2112 % 128;
                            int i2113 = i2112 % 2;
                        }
                        if (this.i.isStateful()) {
                            int i2114 = b;
                            int i2115 = i2114 & 91;
                            int i2116 = i2115 + ((i2114 ^ 91) | i2115);
                            a = i2116 % 128;
                            int i2117 = i2116 % 2;
                            this.i.setState(this.g.getDrawableState());
                            int i2118 = b;
                            int i2119 = ((i2118 & 114) + (i2118 | 114)) - 1;
                            a = i2119 % 128;
                            int i35 = i2119 % 2;
                        }
                    }
                }
            }
        } else {
            drawable = this.i;
            if (drawable != null) {
                if (this.k) {
                    i3 = ((i7 & (-84)) | ((~i7) & 83)) + ((i7 & 83) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i36 = 43 / 0;
                        if (!(!this.f)) {
                            drawableMutate = drawable.mutate();
                            this.i = drawableMutate;
                            i = a;
                            int i37 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                            b = i37 % 128;
                            int i11110 = i37 % 2;
                            if (!(!this.k)) {
                                int i11111 = (i ^ 49) + ((i & 49) << 1);
                                b = i11111 % 128;
                                int i11112 = i11111 % 2;
                                drawableMutate.setTintList(this.h);
                                int i11113 = b + 39;
                                a = i11113 % 128;
                                int i11114 = i11113 % 2;
                            }
                            if (!(!this.f)) {
                                int i11115 = a;
                                int i11116 = i11115 + 27;
                                b = i11116 % 128;
                                int i11117 = i11116 % 2;
                                drawable2 = this.i;
                                mode = this.j;
                                i2 = i11115 + 65;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    drawable2.setTintMode(mode);
                                    obj.hashCode();
                                    throw null;
                                }
                                drawable2.setTintMode(mode);
                                int i11118 = b;
                                int i11119 = i11118 ^ 31;
                                int i21110 = ((i11118 & 31) | i11119) << 1;
                                int i21111 = -i11119;
                                int i21112 = (i21110 ^ i21111) + ((i21110 & i21111) << 1);
                                a = i21112 % 128;
                                int i21113 = i21112 % 2;
                            }
                            if (this.i.isStateful()) {
                                int i21114 = b;
                                int i21115 = i21114 & 91;
                                int i21116 = i21115 + ((i21114 ^ 91) | i21115);
                                a = i21116 % 128;
                                int i21117 = i21116 % 2;
                                this.i.setState(this.g.getDrawableState());
                                int i21118 = b;
                                int i21119 = ((i21118 & 114) + (i21118 | 114)) - 1;
                                a = i21119 % 128;
                                int i38 = i21119 % 2;
                            }
                        }
                    } else if (this.f) {
                        drawableMutate = drawable.mutate();
                        this.i = drawableMutate;
                        i = a;
                        int i39 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                        b = i39 % 128;
                        int i111110 = i39 % 2;
                        if (!(!this.k)) {
                            int i111111 = (i ^ 49) + ((i & 49) << 1);
                            b = i111111 % 128;
                            int i111112 = i111111 % 2;
                            drawableMutate.setTintList(this.h);
                            int i111113 = b + 39;
                            a = i111113 % 128;
                            int i111114 = i111113 % 2;
                        }
                        if (!(!this.f)) {
                            int i111115 = a;
                            int i111116 = i111115 + 27;
                            b = i111116 % 128;
                            int i111117 = i111116 % 2;
                            drawable2 = this.i;
                            mode = this.j;
                            i2 = i111115 + 65;
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                drawable2.setTintMode(mode);
                                obj.hashCode();
                                throw null;
                            }
                            drawable2.setTintMode(mode);
                            int i111118 = b;
                            int i111119 = i111118 ^ 31;
                            int i211110 = ((i111118 & 31) | i111119) << 1;
                            int i211111 = -i111119;
                            int i211112 = (i211110 ^ i211111) + ((i211110 & i211111) << 1);
                            a = i211112 % 128;
                            int i211113 = i211112 % 2;
                        }
                        if (this.i.isStateful()) {
                            int i211114 = b;
                            int i211115 = i211114 & 91;
                            int i211116 = i211115 + ((i211114 ^ 91) | i211115);
                            a = i211116 % 128;
                            int i211117 = i211116 % 2;
                            this.i.setState(this.g.getDrawableState());
                            int i211118 = b;
                            int i211119 = ((i211118 & 114) + (i211118 | 114)) - 1;
                            a = i211119 % 128;
                            int i310 = i211119 % 2;
                        }
                    }
                } else {
                    drawableMutate = drawable.mutate();
                    this.i = drawableMutate;
                    i = a;
                    int i311 = ((i ^ 9) - (~((i & 9) << 1))) - 1;
                    b = i311 % 128;
                    int i1111110 = i311 % 2;
                    if (!(!this.k)) {
                        int i1111111 = (i ^ 49) + ((i & 49) << 1);
                        b = i1111111 % 128;
                        int i1111112 = i1111111 % 2;
                        drawableMutate.setTintList(this.h);
                        int i1111113 = b + 39;
                        a = i1111113 % 128;
                        int i1111114 = i1111113 % 2;
                    }
                    if (!(!this.f)) {
                        int i1111115 = a;
                        int i1111116 = i1111115 + 27;
                        b = i1111116 % 128;
                        int i1111117 = i1111116 % 2;
                        drawable2 = this.i;
                        mode = this.j;
                        i2 = i1111115 + 65;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            drawable2.setTintMode(mode);
                            obj.hashCode();
                            throw null;
                        }
                        drawable2.setTintMode(mode);
                        int i1111118 = b;
                        int i1111119 = i1111118 ^ 31;
                        int i2111110 = ((i1111118 & 31) | i1111119) << 1;
                        int i2111111 = -i1111119;
                        int i2111112 = (i2111110 ^ i2111111) + ((i2111110 & i2111111) << 1);
                        a = i2111112 % 128;
                        int i2111113 = i2111112 % 2;
                    }
                    if (this.i.isStateful()) {
                        int i2111114 = b;
                        int i2111115 = i2111114 & 91;
                        int i2111116 = i2111115 + ((i2111114 ^ 91) | i2111115);
                        a = i2111116 % 128;
                        int i2111117 = i2111116 % 2;
                        this.i.setState(this.g.getDrawableState());
                        int i2111118 = b;
                        int i2111119 = ((i2111118 & 114) + (i2111118 | 114)) - 1;
                        a = i2111119 % 128;
                        int i312 = i2111119 % 2;
                    }
                }
            }
        }
        int i40 = b;
        int i41 = (i40 & 39) + (i40 | 39);
        a = i41 % 128;
        if (i41 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void f(Canvas canvas) {
        int max;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 83) + ((i4 & 83) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.i != null) {
            int i8 = ((i6 ^ 69) | (i6 & 69)) << 1;
            int i9 = -(((~i6) & 69) | (i6 & (-70)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                max = this.g.getMax();
                i = 0;
            } else {
                max = this.g.getMax();
                i = 1;
            }
            int i11 = a;
            int i12 = (i11 & 105) + (i11 | 105);
            b = i12 % 128;
            int i13 = i12 % 2;
            if (max > 1) {
                int i14 = ((i11 & 84) + (i11 | 84)) - 1;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    this.i.getIntrinsicWidth();
                    this.i.getIntrinsicHeight();
                    throw null;
                }
                int intrinsicWidth = this.i.getIntrinsicWidth();
                int intrinsicHeight = this.i.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    int i15 = a;
                    int i16 = (i15 & (-20)) | ((~i15) & 19);
                    int i17 = (i15 & 19) << 1;
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    int i19 = i18 % 128;
                    b = i19;
                    int i20 = i18 % 2;
                    i2 = intrinsicWidth / 2;
                    int i21 = i19 + 36;
                    int i22 = (i21 ^ (-1)) + (i21 << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    int i24 = a;
                    int i25 = ((i24 & 28) + (i24 | 28)) - 1;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    int i27 = a;
                    int i28 = i27 & 67;
                    int i29 = -(-((i27 ^ 67) | i28));
                    int i30 = (i28 & i29) + (i29 | i28);
                    int i31 = i30 % 128;
                    b = i31;
                    int i32 = i30 % 2;
                    int i33 = ((((i31 ^ 51) | (i31 & 51)) << 1) - (~(-(((~i31) & 51) | (i31 & (-52)))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    i = intrinsicHeight / 2;
                }
                int i35 = b;
                int i36 = (i35 & 121) + (i35 | 121);
                a = i36 % 128;
                int i37 = i36 % 2;
                this.i.setBounds(-i2, -i, i2, i);
                int width = this.g.getWidth();
                int i38 = b;
                int i39 = i38 & 71;
                int i40 = (i38 ^ 71) | i39;
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                a = i41 % 128;
                int i42 = i41 % 2;
                int paddingLeft = this.g.getPaddingLeft();
                SeekBar seekBar = this.g;
                int i43 = b;
                int i44 = ((i43 ^ 1) | (i43 & 1)) << 1;
                int i45 = -(((~i43) & 1) | (i43 & (-2)));
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                a = i46 % 128;
                int i47 = i46 % 2;
                int i48 = -paddingLeft;
                int i49 = ((~i48) & width) | ((~width) & i48);
                int i50 = -(-((width & i48) << 1));
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                int i52 = -seekBar.getPaddingRight();
                int i53 = ((~i52) & i51) | ((~i51) & i52);
                int i54 = -(-((i52 & i51) << 1));
                float f = (i53 ^ i54) + ((i54 & i53) << 1);
                int i55 = a;
                int i56 = (i55 ^ 17) + ((i55 & 17) << 1);
                b = i56 % 128;
                float f2 = i56 % 2 == 0 ? f - max : f / max;
                int iSave = canvas.save();
                float paddingLeft2 = this.g.getPaddingLeft();
                int height = this.g.getHeight();
                int i57 = b;
                int i58 = i57 & 13;
                int i59 = i58 + ((i57 ^ 13) | i58);
                a = i59 % 128;
                int i60 = i59 % 2;
                canvas.translate(paddingLeft2, height / 2);
                int i61 = a;
                int i62 = i61 & 93;
                int i63 = i62 + ((i61 ^ 93) | i62);
                b = i63 % 128;
                int i64 = i63 % 2;
                int i65 = 0;
                while (i65 <= max) {
                    int i66 = a;
                    int i67 = i66 & 43;
                    int i68 = ((i66 ^ 43) | i67) << 1;
                    int i69 = -((i66 | 43) & (~i67));
                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    this.i.draw(canvas);
                    canvas.translate(f2, 0.0f);
                    i65++;
                    int i72 = a;
                    int i73 = i72 & 1;
                    int i74 = (i72 | 1) & (~i73);
                    int i75 = -(-(i73 << 1));
                    int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                    b = i76 % 128;
                    int i77 = i76 % 2;
                }
                canvas.restoreToCount(iSave);
                int i78 = a;
                int i79 = (((i78 & (-62)) | ((~i78) & 61)) - (~((i78 & 61) << 1))) - 1;
                b = i79 % 128;
                if (i79 % 2 == 0) {
                    int i80 = 4 % 5;
                }
            }
        }
        int i81 = a;
        int i82 = ((i81 | 49) << 1) - (i81 ^ 49);
        b = i82 % 128;
        if (i82 % 2 == 0) {
            int i83 = 16 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a4 A[PHI: r1
  0x00a4: PHI (r1v12 android.graphics.drawable.Drawable) = (r1v11 android.graphics.drawable.Drawable), (r1v55 android.graphics.drawable.Drawable) binds: [B:17:0x00a2, B:14:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb  */
    @Override // ivas.gov.bisp.enumeration.p088k.N
    public void c(AttributeSet attributeSet, int i) {
        Drawable drawableM;
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 49;
        b = i4 % 128;
        int i5 = i4 % 2;
        super.c(attributeSet, i);
        Context context = this.g.getContext();
        int i6 = a;
        int i7 = ((i6 & 112) + (i6 | 112)) - 1;
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            int[] iArr = h.j;
            obj.hashCode();
            throw null;
        }
        int[] iArr2 = h.j;
        int i8 = b;
        int i9 = ((i8 | 69) << 1) - (((~i8) & 69) | (i8 & (-70)));
        a = i9 % 128;
        B bC = i9 % 2 != 0 ? B.c(context, attributeSet, iArr2, i, 0) : B.c(context, attributeSet, iArr2, i, 0);
        SeekBar seekBar = this.g;
        B b2 = bC;
        int i10 = a;
        int i11 = i10 & 29;
        int i12 = -(-((i10 ^ 29) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            seekBar.getContext();
            TypedArray typedArray = b2.d;
            obj.hashCode();
            throw null;
        }
        Context context2 = seekBar.getContext();
        TypedArray typedArray2 = b2.d;
        int i14 = a;
        int i15 = ((i14 ^ 41) | (i14 & 41)) << 1;
        int i16 = -((41 & (~i14)) | (i14 & (-42)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            T.p(seekBar, context2, iArr2, attributeSet, typedArray2, i, 0);
            drawableM = b2.m(1);
            if (drawableM != null) {
                this.g.setThumb(drawableM);
                int i18 = b + 44;
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        } else {
            T.p(seekBar, context2, iArr2, attributeSet, typedArray2, i, 0);
            drawableM = b2.m(0);
            if (drawableM != null) {
                this.g.setThumb(drawableM);
                int i110 = b + 44;
                int i111 = (i110 ^ (-1)) + (i110 << 1);
                a = i111 % 128;
                int i21 = i111 % 2;
            }
        }
        Drawable drawableL = b2.l(1);
        Drawable drawable = this.i;
        int i22 = b;
        int i23 = i22 ^ 51;
        int i24 = ((i22 & 51) | i23) << 1;
        int i25 = -i23;
        int i26 = (i24 & i25) + (i25 | i24);
        a = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 99 / 0;
            if (drawable != null) {
                int i28 = i22 & 7;
                int i29 = i28 + ((i22 ^ 7) | i28);
                a = i29 % 128;
                int i30 = i29 % 2;
                drawable.setCallback(null);
                int i31 = a;
                i2 = (((i31 & (-104)) | ((~i31) & 103)) - (~((i31 & 103) << 1))) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i32 = 5 / 2;
                }
            }
        } else if (drawable != null) {
            int i210 = i22 & 7;
            int i211 = i210 + ((i22 ^ 7) | i210);
            a = i211 % 128;
            int i33 = i211 % 2;
            drawable.setCallback(null);
            int i34 = a;
            i2 = (((i34 & (-104)) | ((~i34) & 103)) - (~((i34 & 103) << 1))) - 1;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i35 = 5 / 2;
            }
        }
        this.i = drawableL;
        if (drawableL != null) {
            int i36 = a;
            int i37 = i36 & 81;
            int i38 = i36 | 81;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            b = i39 % 128;
            int i40 = i39 % 2;
            drawableL.setCallback(this.g);
            SeekBar seekBar2 = this.g;
            int i41 = b;
            int i42 = (((i41 & (-20)) | ((~i41) & 19)) - (~(-(-((i41 & 19) << 1))))) - 1;
            a = i42 % 128;
            int i43 = i42 % 2;
            WeakHashMap<View, R> weakHashMap = T.c;
            int iF = T.aWY.f(seekBar2);
            int i44 = b;
            int i45 = ((((i44 ^ 25) | (i44 & 25)) << 1) - (~(-(((~i44) & 25) | (i44 & (-26)))))) - 1;
            a = i45 % 128;
            if (i45 % 2 != 0) {
                drawableL.setLayoutDirection(iF);
                drawableL.isStateful();
                obj.hashCode();
                throw null;
            }
            drawableL.setLayoutDirection(iF);
            if (drawableL.isStateful()) {
                drawableL.setState(this.g.getDrawableState());
                int i46 = a;
                int i47 = (((i46 | 45) << 1) - (~(-(((~i46) & 45) | (i46 & (-46)))))) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
            }
            e();
            int i49 = a;
            int i50 = ((i49 & (-22)) | ((~i49) & 21)) + ((i49 & 21) << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        this.g.invalidate();
        if (b2.t(3)) {
            int i52 = b;
            int i53 = ((i52 ^ 77) - (~((i52 & 77) << 1))) - 1;
            a = i53 % 128;
            int i54 = i53 % 2;
            int iN = b2.n(3, -1);
            PorterDuff.Mode mode = this.j;
            int i55 = a;
            int i56 = (i55 | 101) << 1;
            int i57 = -(i55 ^ 101);
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            b = i58 % 128;
            int i59 = i58 % 2;
            this.j = W.e(iN, mode);
            this.f = true;
            int i60 = a;
            int i61 = i60 & 3;
            int i62 = (3 | i60) & (~i61);
            int i63 = i61 << 1;
            int i64 = (i62 & i63) + (i62 | i63);
            b = i64 % 128;
            int i65 = i64 % 2;
        }
        if (b2.t(2)) {
            int i66 = b;
            int i67 = (i66 & (-120)) | ((~i66) & 119);
            int i68 = (i66 & 119) << 1;
            int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
            a = i69 % 128;
            int i70 = i69 % 2;
            this.h = b2.h(2);
            this.k = true;
            int i71 = a;
            int i72 = i71 & 95;
            int i73 = (((i71 | 95) & (~i72)) - (~(i72 << 1))) - 1;
            b = i73 % 128;
            int i74 = i73 % 2;
        }
        b2.d.recycle();
        e();
        int i75 = b;
        int i76 = (i75 & (-50)) | ((~i75) & 49);
        int i77 = (i75 & 49) << 1;
        int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
        a = i78 % 128;
        if (i78 % 2 != 0) {
            throw null;
        }
    }
}
