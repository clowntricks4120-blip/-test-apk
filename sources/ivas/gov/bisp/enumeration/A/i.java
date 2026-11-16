package ivas.gov.bisp.enumeration.A;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class i extends Drawable {
    private static int a = 0;
    private static int b = 1;
    public PorterDuffColorFilter c;
    public float d;
    public final RectF f;
    public final Rect g;
    public float i;
    public ColorStateList k;
    public ColorStateList l;
    public boolean h = false;
    public boolean j = true;
    public PorterDuff.Mode m = PorterDuff.Mode.SRC_IN;
    public final Paint e = new Paint(5);

    public i(ColorStateList colorStateList, float f) {
        this.d = f;
        d(colorStateList);
        this.f = new RectF();
        this.g = new Rect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r1 = new android.graphics.PorterDuffColorFilter(r6.getColorForState(getState(), 0), r7);
        r6 = ivas.gov.bisp.enumeration.A.i.b;
        r2 = r6 & 121;
        r7 = (((r6 ^ 121) | r2) << 1) - ((r6 | 121) & (~r2));
        ivas.gov.bisp.enumeration.A.i.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r6, android.graphics.PorterDuff.Mode r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.A.i.a
            r2 = r1 & (-6)
            int r3 = ~r1
            r4 = 5
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.A.i.b = r1
            int r2 = r2 % r0
            if (r6 == 0) goto L51
            r2 = r1 & 114(0x72, float:1.6E-43)
            r1 = r1 | 114(0x72, float:1.6E-43)
            int r2 = r2 + r1
            r1 = r2 ^ (-1)
            int r2 = r2 << 1
            int r1 = r1 + r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.A.i.a = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L2e
            r1 = 77
            int r1 = r1 / r2
            if (r7 == 0) goto L51
            goto L30
        L2e:
            if (r7 == 0) goto L51
        L30:
            int[] r1 = r5.getState()
            int r6 = r6.getColorForState(r1, r2)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r6, r7)
            int r6 = ivas.gov.bisp.enumeration.A.i.b
            r7 = r6 ^ 121(0x79, float:1.7E-43)
            r2 = r6 & 121(0x79, float:1.7E-43)
            r7 = r7 | r2
            int r7 = r7 << 1
            int r2 = ~r2
            r6 = r6 | 121(0x79, float:1.7E-43)
            r6 = r6 & r2
            int r7 = r7 - r6
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.A.i.a = r6
            int r7 = r7 % r0
            return r1
        L51:
            int r6 = ivas.gov.bisp.enumeration.A.i.a
            r7 = r6 | 53
            int r1 = r7 << 1
            r6 = r6 & 53
            int r6 = ~r6
            r6 = r6 & r7
            int r1 = r1 - r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.A.i.b = r6
            int r1 = r1 % r0
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.A.i.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode):android.graphics.PorterDuffColorFilter");
    }

    public final void d(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 54) << 1) - (i2 ^ 54);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (colorStateList == null) {
            int i6 = (i5 & 59) + (i5 | 59);
            b = i6 % 128;
            int i7 = i6 % 2;
            colorStateList = ColorStateList.valueOf(0);
            int i8 = a;
            int i9 = (i8 ^ 31) + ((i8 & 31) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        this.k = colorStateList;
        Paint paint = this.e;
        int i11 = b;
        int i12 = i11 ^ 69;
        int i13 = (i11 & 69) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            colorStateList.getColorForState(getState(), this.k.getDefaultColor());
            throw null;
        }
        paint.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
        int i15 = a;
        int i16 = i15 ^ 15;
        int i17 = -(-((i15 & 15) << 1));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 97 / 0;
        }
    }

    public final void e(Rect rect) {
        Rect rect2;
        int iCeil;
        int iCeil2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = ((i2 ^ 123) | i3) << 1;
        int i5 = -((i2 | 123) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (rect == null) {
            int i9 = ((i7 & 68) + (i7 | 68)) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                getBounds();
                obj.hashCode();
                throw null;
            }
            rect = getBounds();
        }
        RectF rectF = this.f;
        float f = rect.left;
        float f2 = rect.top;
        int i10 = a;
        int i11 = i10 ^ 73;
        int i12 = (i10 & 73) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            rectF.set(f, f2, rect.right, rect.bottom);
            rect2 = this.g;
            int i14 = 41 / 0;
        } else {
            rectF.set(f, f2, rect.right, rect.bottom);
            rect2 = this.g;
        }
        rect2.set(rect);
        if (this.h) {
            int i15 = a;
            int i16 = ((i15 & (-54)) | ((~i15) & 53)) + ((i15 & 53) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            float f3 = this.i;
            if (i17 == 0) {
                p.c(f3, this.d, this.j);
                obj.hashCode();
                throw null;
            }
            float fC = p.c(f3, this.d, this.j);
            float fB = p.b(this.i, this.d, this.j);
            int i18 = b;
            int i19 = ((((i18 ^ 107) | (i18 & 107)) << 1) - (~(-(((~i18) & 107) | (i18 & (-108)))))) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
            Rect rect3 = this.g;
            if (i20 != 0) {
                iCeil = (int) Math.ceil(fB);
                iCeil2 = (int) Math.ceil(fC);
                int i21 = 54 / 0;
            } else {
                iCeil = (int) Math.ceil(fB);
                iCeil2 = (int) Math.ceil(fC);
            }
            int i22 = b;
            int i23 = i22 ^ 81;
            int i24 = (((i22 & 81) | i23) << 1) - i23;
            a = i24 % 128;
            if (i24 % 2 != 0) {
                rect3.inset(iCeil, iCeil2);
                this.f.set(this.g);
                throw null;
            }
            rect3.inset(iCeil, iCeil2);
            this.f.set(this.g);
        }
        int i25 = b + 21;
        a = i25 % 128;
        int i26 = i25 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = a + 29;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2 == 0 ? 51 : -3;
        int i5 = ((i3 ^ 72) + ((i3 & 72) << 1)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 36) << 1) - (i2 ^ 36);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        outline.setRoundRect(this.g, this.d);
        int i6 = b;
        int i7 = ((i6 & (-64)) | ((~i6) & 63)) + ((i6 & 63) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 69 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-66)) | ((~i3) & 65)) - (~(-(-((i3 & 65) << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        ColorStateList colorStateList2 = this.l;
        if (colorStateList2 != null) {
            int i5 = i3 + 117;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                colorStateList2.isStateful();
                throw null;
            }
            if (colorStateList2.isStateful()) {
                int i6 = b;
                int i7 = i6 & 81;
                int i8 = ((i6 ^ 81) | i7) << 1;
                int i9 = -((i6 | 81) & (~i7));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                colorStateList = this.k;
                if (colorStateList != null) {
                    int i12 = b + 80;
                    i = (i12 ^ (-1)) + (i12 << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        colorStateList.isStateful();
                        throw null;
                    }
                    if (!colorStateList.isStateful()) {
                        int i13 = b;
                        int i14 = i13 & 81;
                        int i15 = ((i13 ^ 81) | i14) << 1;
                        int i16 = -((i13 | 81) & (~i14));
                        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else if (!super.isStateful()) {
                        int i19 = b;
                        int i20 = i19 & 49;
                        int i21 = i20 + ((i19 ^ 49) | i20);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        z = false;
                    } else {
                        int i110 = b;
                        int i111 = i110 & 81;
                        int i112 = ((i110 ^ 81) | i111) << 1;
                        int i113 = -((i110 | 81) & (~i111));
                        int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                        a = i114 % 128;
                        int i115 = i114 % 2;
                        z = true;
                    }
                } else if (!super.isStateful()) {
                    int i116 = b;
                    int i23 = i116 & 49;
                    int i24 = i23 + ((i116 ^ 49) | i23);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    z = false;
                } else {
                    int i117 = b;
                    int i118 = i117 & 81;
                    int i119 = ((i117 ^ 81) | i118) << 1;
                    int i1110 = -((i117 | 81) & (~i118));
                    int i1111 = (i119 ^ i1110) + ((i1110 & i119) << 1);
                    a = i1111 % 128;
                    int i1112 = i1111 % 2;
                    z = true;
                }
            }
        } else {
            colorStateList = this.k;
            if (colorStateList != null) {
                int i120 = b + 80;
                i = (i120 ^ (-1)) + (i120 << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    colorStateList.isStateful();
                    throw null;
                }
                if (!colorStateList.isStateful()) {
                    int i1113 = b;
                    int i1114 = i1113 & 81;
                    int i1115 = ((i1113 ^ 81) | i1114) << 1;
                    int i1116 = -((i1113 | 81) & (~i1114));
                    int i1117 = (i1115 ^ i1116) + ((i1116 & i1115) << 1);
                    a = i1117 % 128;
                    int i1118 = i1117 % 2;
                    z = true;
                } else if (!super.isStateful()) {
                    int i1119 = b;
                    int i26 = i1119 & 49;
                    int i27 = i26 + ((i1119 ^ 49) | i26);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    z = false;
                } else {
                    int i11110 = b;
                    int i11111 = i11110 & 81;
                    int i11112 = ((i11110 ^ 81) | i11111) << 1;
                    int i11113 = -((i11110 | 81) & (~i11111));
                    int i11114 = (i11112 ^ i11113) + ((i11113 & i11112) << 1);
                    a = i11114 % 128;
                    int i11115 = i11114 % 2;
                    z = true;
                }
            } else if (!super.isStateful()) {
                int i11116 = b;
                int i29 = i11116 & 49;
                int i210 = i29 + ((i11116 ^ 49) | i29);
                a = i210 % 128;
                int i211 = i210 % 2;
                z = false;
            } else {
                int i11117 = b;
                int i11118 = i11117 & 81;
                int i11119 = ((i11117 ^ 81) | i11118) << 1;
                int i111110 = -((i11117 | 81) & (~i11118));
                int i111111 = (i11119 ^ i111110) + ((i111110 & i11119) << 1);
                a = i111111 % 128;
                int i111112 = i111111 % 2;
                z = true;
            }
        }
        int i30 = b;
        int i31 = i30 & 39;
        int i32 = (i30 ^ 39) | i31;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 26) + (i2 | 26)) ^ (-1));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ColorStateList colorStateList = this.k;
            colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            throw null;
        }
        ColorStateList colorStateList2 = this.k;
        int colorForState = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
        if (colorForState != this.e.getColor()) {
            int i4 = b;
            int i5 = ((i4 ^ 25) | (i4 & 25)) << 1;
            int i6 = -((i4 & (-26)) | ((~i4) & 25));
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i4 ^ 79;
            int i10 = (i4 & 79) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 4;
            }
            z = true;
        } else {
            int i13 = b;
            int i14 = ((i13 | 113) << 1) - (i13 ^ 113);
            a = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        if (!(!z)) {
            int i16 = a;
            int i17 = (i16 & 85) + (i16 | 85);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                this.e.setColor(colorForState);
                int i18 = 21 / 0;
            } else {
                this.e.setColor(colorForState);
            }
            int i19 = a;
            int i20 = i19 ^ 31;
            int i21 = ((i19 & 31) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 & i22) + (i21 | i22);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        ColorStateList colorStateList3 = this.l;
        if (colorStateList3 != null) {
            int i25 = b;
            int i26 = i25 ^ 93;
            int i27 = -(-((i25 & 93) << 1));
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            PorterDuff.Mode mode = this.m;
            if (mode != null) {
                int i30 = i25 & 23;
                int i31 = i30 + ((i25 ^ 23) | i30);
                a = i31 % 128;
                int i32 = i31 % 2;
                this.c = c(colorStateList3, mode);
                return true;
            }
        }
        int i33 = a + 61;
        b = i33 % 128;
        if (i33 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 101) << 1;
        int i5 = -(((~i3) & 101) | (i3 & (-102)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.e.setAlpha(i);
        if (i7 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.setColorFilter(colorFilter);
        int i4 = b;
        int i5 = (i4 ^ 97) + ((i4 & 97) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 43;
        int i4 = -(-((i2 & 43) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            super.onBoundsChange(rect);
            e(rect);
        } else {
            super.onBoundsChange(rect);
            e(rect);
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.l = colorStateList;
            throw null;
        }
        this.l = colorStateList;
        this.c = c(colorStateList, this.m);
        invalidateSelf();
        int i4 = b;
        int i5 = i4 & 107;
        int i6 = (i4 ^ 107) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.m = mode;
        ColorStateList colorStateList = this.l;
        int i5 = (((i2 | 32) << 1) - (i2 ^ 32)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.c = c(colorStateList, mode);
            invalidateSelf();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c = c(colorStateList, mode);
        invalidateSelf();
        int i6 = a;
        int i7 = ((i6 ^ 101) - (~(-(-((i6 & 101) << 1))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r1
  0x0025: PHI (r1v8 android.graphics.Paint) = (r1v7 android.graphics.Paint), (r1v25 android.graphics.Paint) binds: [B:8:0x0023, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 ^ 73;
        int i8 = (((i6 & 73) | i7) << 1) - i7;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            paint = this.e;
            if (this.c != null) {
                if (paint.getColorFilter() == null) {
                    int i9 = a;
                    int i10 = i9 & 47;
                    i = (i10 - (~((i9 ^ 47) | i10))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        paint.setColorFilter(this.c);
                    } else {
                        paint.setColorFilter(this.c);
                        z = true;
                    }
                }
                z = false;
            }
            RectF rectF = this.f;
            float f = this.d;
            int i11 = a;
            int i12 = (((i11 & (-38)) | ((~i11) & 37)) - (~((i11 & 37) << 1))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (z) {
                i3 = a + 101;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    paint.setColorFilter(null);
                    int i14 = 49 / 0;
                } else {
                    paint.setColorFilter(null);
                }
                int i15 = a;
                int i16 = i15 & 37;
                i4 = (((i15 | 37) & (~i16)) - (~(i16 << 1))) - 1;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i17 = 2 / 2;
                }
            }
            int i18 = a;
            i2 = (i18 ^ 19) + ((i18 & 19) << 1);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        paint = this.e;
        int i19 = 19 / 0;
        if (this.c != null) {
            if (paint.getColorFilter() == null) {
                int i20 = a;
                int i110 = i20 & 47;
                i = (i110 - (~((i20 ^ 47) | i110))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    paint.setColorFilter(this.c);
                } else {
                    paint.setColorFilter(this.c);
                    z = true;
                }
            }
            z = false;
        }
        RectF rectF2 = this.f;
        float f2 = this.d;
        int i111 = a;
        int i112 = (((i111 & (-38)) | ((~i111) & 37)) - (~((i111 & 37) << 1))) - 1;
        b = i112 % 128;
        int i113 = i112 % 2;
        canvas.drawRoundRect(rectF2, f2, f2, paint);
        if (z) {
            i3 = a + 101;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                paint.setColorFilter(null);
                int i114 = 49 / 0;
            } else {
                paint.setColorFilter(null);
            }
            int i115 = a;
            int i116 = i115 & 37;
            i4 = (((i115 | 37) & (~i116)) - (~(i116 << 1))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i117 = 2 / 2;
            }
        }
        int i118 = a;
        i2 = (i118 ^ 19) + ((i118 & 19) << 1);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i21 = a;
        int i22 = i21 ^ 77;
        int i23 = (i21 & 77) << 1;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        b = i24 % 128;
        int i25 = i24 % 2;
        z = false;
        RectF rectF3 = this.f;
        float f3 = this.d;
        int i119 = a;
        int i1110 = (((i119 & (-38)) | ((~i119) & 37)) - (~((i119 & 37) << 1))) - 1;
        b = i1110 % 128;
        int i1111 = i1110 % 2;
        canvas.drawRoundRect(rectF3, f3, f3, paint);
        if (z) {
            i3 = a + 101;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                paint.setColorFilter(null);
                int i1112 = 49 / 0;
            } else {
                paint.setColorFilter(null);
            }
            int i1113 = a;
            int i1114 = i1113 & 37;
            i4 = (((i1113 | 37) & (~i1114)) - (~(i1114 << 1))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i1115 = 2 / 2;
            }
        }
        int i1116 = a;
        i2 = (i1116 ^ 19) + ((i1116 & 19) << 1);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
