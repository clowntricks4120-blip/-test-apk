package ivas.gov.bisp.enumeration.aE;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.O.u;

/* JADX INFO: loaded from: classes.dex */
public class j extends Drawable {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public final Paint e;
    public float k;
    public int l;
    public int m;
    public int n;
    public int p;
    public t q;
    public ColorStateList r;
    public final u d = u.bfv.c;
    public final Path f = new Path();
    public final Rect g = new Rect();
    public final RectF i = new RectF();
    public final RectF h = new RectF();
    public final bdE j = new bdE(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f58o = true;

    public class bdE extends Drawable.ConstantState {
        private static int a = 0;
        private static int b = 1;

        public bdE(bdD bdd) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = b + 35;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            int i5 = (((i3 & (-50)) | ((~i3) & 49)) - (~((i3 & 49) << 1))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 107) + (i2 | 107);
            b = i3 % 128;
            int i4 = i3 % 2;
            j jVar = j.this;
            int i5 = (i2 ^ 27) + ((i2 & 27) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return jVar;
        }
    }

    public j(t tVar) {
        this.q = tVar;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public RectF c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.h.set(getBounds());
        int i5 = a + 81;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        RectF rectF = this.h;
        int i8 = ((i6 & (-24)) | ((~i6) & 23)) + ((i6 & 23) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        bdE bde;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 28) + ((i2 & 28) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            bde = this.j;
            int i4 = 73 / 0;
        } else {
            bde = this.j;
        }
        int i5 = i2 + 95;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return bde;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 58) + (i3 | 58)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0 ? this.k <= 0.0f : this.k <= 2.0f) {
            int i5 = i3 & 31;
            int i6 = ((((i3 ^ 31) | i5) << 1) - (~(-((i3 | 31) & (~i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            i = -2;
        } else {
            int i8 = i3 & 73;
            int i9 = (i3 | 73) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            i = -3;
        }
        int i13 = b + 26;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return i;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = ((i2 ^ 87) | i3) << 1;
        int i5 = -((i2 | 87) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 63 / 0;
            if (this.q.i(c())) {
                int i8 = a;
                int i9 = ((i8 | 125) << 1) - (i8 ^ 125);
                b = i9 % 128;
                int i10 = i9 % 2;
                int iRound = Math.round(this.k);
                rect.set(iRound, iRound, iRound, iRound);
                int i11 = a;
                int i12 = (i11 & 71) + (i11 | 71);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (!(!this.q.i(c()))) {
            int i14 = a;
            int i15 = ((i14 | 125) << 1) - (i14 ^ 125);
            b = i15 % 128;
            int i16 = i15 % 2;
            int iRound2 = Math.round(this.k);
            rect.set(iRound2, iRound2, iRound2, iRound2);
            int i17 = a;
            int i18 = (i17 & 71) + (i17 | 71);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = i20 & 33;
        int i22 = i21 + ((i20 ^ 33) | i21);
        a = i22 % 128;
        int i23 = i22 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = -(-((i2 ^ 33) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            int i8 = i6 & 13;
            int i9 = (i6 | 13) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (colorStateList.isStateful()) {
                int i13 = b;
                int i14 = i13 ^ 125;
                int i15 = -(-((i13 & 125) << 1));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else if (super.isStateful()) {
                int i18 = b;
                int i19 = i18 ^ 125;
                int i110 = -(-((i18 & 125) << 1));
                int i111 = (i19 ^ i110) + ((i110 & i19) << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
                z = true;
            } else {
                int i20 = b;
                int i21 = (i20 | 53) << 1;
                int i22 = -(i20 ^ 53);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                z = false;
            }
        } else if (super.isStateful()) {
            int i113 = b;
            int i114 = i113 ^ 125;
            int i115 = -(-((i113 & 125) << 1));
            int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
            a = i116 % 128;
            int i117 = i116 % 2;
            z = true;
        } else {
            int i25 = b;
            int i26 = (i25 | 53) << 1;
            int i27 = -(i25 ^ 53);
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            z = false;
        }
        int i30 = b;
        int i31 = (((i30 ^ 97) | (i30 & 97)) << 1) - (((~i30) & 97) | (i30 & (-98)));
        a = i31 % 128;
        if (i31 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f58o = true;
        int i5 = ((i2 ^ 80) + ((i2 & 80) << 1)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = -(-(i2 | 73));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.e.setColorFilter(colorFilter);
            invalidateSelf();
            int i6 = 54 / 0;
        } else {
            this.e.setColorFilter(colorFilter);
            invalidateSelf();
        }
        int i7 = a;
        int i8 = i7 & 99;
        int i9 = (i8 - (~((i7 ^ 99) | i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 123) << 1) - (i3 ^ 123);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.e.setAlpha(i);
        invalidateSelf();
        int i6 = a + 109;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
    }

    public void d(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (colorStateList != null) {
            this.p = colorStateList.getColorForState(getState(), this.p);
            int i4 = b;
            int i5 = i4 & 79;
            int i6 = -(-(i4 | 79));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        this.r = colorStateList;
        this.f58o = true;
        invalidateSelf();
        int i9 = a;
        int i10 = i9 ^ 97;
        int i11 = ((i9 & 97) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r3
  0x002b: PHI (r3v5 android.content.res.ColorStateList) = (r3v4 android.content.res.ColorStateList), (r3v14 android.content.res.ColorStateList) binds: [B:8:0x0029, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList;
        int i;
        int colorForState;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 33;
        int i5 = ((i3 ^ 33) | i4) << 1;
        int i6 = -((~i4) & (i3 | 33));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            colorStateList = this.r;
            int i8 = 24 / 0;
            if (colorStateList != null) {
                i = i3 + 93;
                b = i % 128;
                if (i % 2 != 0) {
                    colorStateList.getColorForState(iArr, this.p);
                    obj.hashCode();
                    throw null;
                }
                colorForState = colorStateList.getColorForState(iArr, this.p);
                if (colorForState != this.p) {
                    this.f58o = true;
                    this.p = colorForState;
                    int i9 = b;
                    int i10 = (i9 ^ 121) + ((i9 & 121) << 1);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        } else {
            colorStateList = this.r;
            if (colorStateList != null) {
                i = i3 + 93;
                b = i % 128;
                if (i % 2 != 0) {
                    colorStateList.getColorForState(iArr, this.p);
                    obj.hashCode();
                    throw null;
                }
                colorForState = colorStateList.getColorForState(iArr, this.p);
                if (colorForState != this.p) {
                    this.f58o = true;
                    this.p = colorForState;
                    int i12 = b;
                    int i13 = (i12 ^ 121) + ((i12 & 121) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        }
        if (this.f58o) {
            int i15 = b;
            int i16 = i15 & 83;
            int i17 = (((i15 ^ 83) | i16) << 1) - ((i15 | 83) & (~i16));
            a = i17 % 128;
            int i18 = i17 % 2;
            invalidateSelf();
            int i19 = a;
            int i20 = i19 ^ 45;
            int i21 = (i19 & 45) << 1;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        boolean z = this.f58o;
        int i24 = b;
        int i25 = (i24 & 41) + (i24 | 41);
        a = i25 % 128;
        if (i25 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(IMediaSession.Stub.TRANSACTION_previous)
    public void getOutline(Outline outline) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 96) << 1) - (i2 ^ 96)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.q.i(c())) {
            int i5 = b;
            int i6 = (i5 | 67) << 1;
            int i7 = -(((~i5) & 67) | (i5 & (-68)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            Object obj = null;
            if (i8 % 2 != 0) {
                this.q.j.b(c());
                obj.hashCode();
                throw null;
            }
            float fB = this.q.j.b(c());
            int i9 = a;
            int i10 = i9 & 103;
            int i11 = (i9 | 103) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            outline.setRoundRect(getBounds(), fB);
            int i15 = b;
            int i16 = ((i15 | 117) << 1) - (i15 ^ 117);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            return;
        }
        copyBounds(this.g);
        RectF rectF = this.i;
        Rect rect = this.g;
        int i17 = b + 23;
        a = i17 % 128;
        int i18 = i17 % 2;
        rectF.set(rect);
        u uVar = this.d;
        t tVar = this.q;
        RectF rectF2 = this.i;
        int i19 = a;
        int i20 = ((i19 & (-92)) | ((~i19) & 91)) + ((i19 & 91) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        Path path = this.f;
        int i22 = i19 + 7;
        b = i22 % 128;
        int i23 = i22 % 2;
        uVar.c(tVar, 1.0f, rectF2, null, path);
        if (this.f.isConvex()) {
            int i24 = b;
            int i25 = i24 & 45;
            int i26 = (i24 ^ 45) | i25;
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            outline.setConvexPath(this.f);
            int i29 = a;
            int i30 = i29 & 49;
            int i31 = i30 + ((i29 ^ 49) | i30);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 4 / 2;
            }
        }
        int i33 = a;
        int i34 = (i33 & (-4)) | ((~i33) & 3);
        int i35 = (i33 & 3) << 1;
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        b = i36 % 128;
        int i37 = i36 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        int iF;
        float[] fArr;
        float f;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 27) + (i2 | 27);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (this.f58o) {
            int i6 = ((i4 ^ 64) + ((i4 & 64) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                Rect rect = this.g;
                copyBounds(rect);
                rect.height();
                obj.hashCode();
                throw null;
            }
            Paint paint = this.e;
            Rect rect2 = this.g;
            copyBounds(rect2);
            float fHeight = this.k / rect2.height();
            int[] iArr = new int[6];
            iArr[0] = ivas.gov.bisp.enumeration.p007ag.j.c(this.c, this.p);
            int i7 = this.l;
            int i8 = b;
            int i9 = (i8 & (-124)) | ((~i8) & 123);
            int i10 = -(-((i8 & 123) << 1));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                iArr[1] = ivas.gov.bisp.enumeration.p007ag.j.c(i7, this.p);
                iF = ivas.gov.bisp.enumeration.p007ag.j.f(this.l, 1);
            } else {
                iArr[1] = ivas.gov.bisp.enumeration.p007ag.j.c(i7, this.p);
                iF = ivas.gov.bisp.enumeration.p007ag.j.f(this.l, 0);
            }
            int i12 = this.p;
            int i13 = a;
            char c = 3;
            int i14 = ((i13 ^ 3) - (~((i13 & 3) << 1))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            iArr[2] = ivas.gov.bisp.enumeration.p007ag.j.c(iF, i12);
            int iC = ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(this.n, 0), this.p);
            int i16 = b;
            int i17 = ((i16 | 59) << 1) - (i16 ^ 59);
            a = i17 % 128;
            int i18 = i17 % 2;
            iArr[3] = iC;
            iArr[4] = ivas.gov.bisp.enumeration.p007ag.j.c(this.n, this.p);
            int iC2 = ivas.gov.bisp.enumeration.p007ag.j.c(this.m, this.p);
            int i19 = a;
            int i20 = (i19 ^ 113) + ((i19 & 113) << 1);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                iArr[5] = iC2;
                float[] fArr2 = new float[65];
                fArr2[1] = 0.0f;
                fArr2[0] = fHeight;
                fArr2[2] = 0.5f;
                fArr2[5] = 0.5f;
                fArr = fArr2;
                f = 2.0f;
            } else {
                iArr[5] = iC2;
                fArr = new float[]{0.0f, fHeight, 0.5f, 0.5f, 0.0f, 0.0f};
                c = 4;
                f = 1.0f;
            }
            fArr[c] = f - fHeight;
            fArr[5] = 1.0f;
            LinearGradient linearGradient = new LinearGradient(0.0f, rect2.top, 0.0f, rect2.bottom, iArr, fArr, Shader.TileMode.CLAMP);
            int i21 = b;
            int i22 = i21 & 55;
            int i23 = i21 | 55;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            if (i24 % 2 != 0) {
                paint.setShader(linearGradient);
                this.f58o = true;
            } else {
                paint.setShader(linearGradient);
                this.f58o = false;
            }
        }
        float strokeWidth = this.e.getStrokeWidth() / 2.0f;
        Rect rect3 = this.g;
        int i25 = b + 91;
        a = i25 % 128;
        int i26 = i25 % 2;
        copyBounds(rect3);
        this.i.set(this.g);
        int i27 = b;
        int i28 = i27 | 83;
        int i29 = ((i28 << 1) - (~(-((~(i27 & 83)) & i28)))) - 1;
        a = i29 % 128;
        if (i29 % 2 != 0) {
            this.q.j.b(c());
            obj.hashCode();
            throw null;
        }
        float fB = this.q.j.b(c());
        int i30 = a;
        int i31 = ((i30 & 2) + (i30 | 2)) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        float fMin = Math.min(fB, this.i.width() / 2.0f);
        t tVar = this.q;
        int i33 = a;
        int i34 = ((i33 ^ 58) + ((i33 & 58) << 1)) - 1;
        b = i34 % 128;
        int i35 = i34 % 2;
        if (tVar.i(c())) {
            int i36 = b;
            int i37 = ((i36 | 119) << 1) - (i36 ^ 119);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                this.i.inset(strokeWidth, strokeWidth);
                rectF = this.i;
                int i38 = 19 / 0;
            } else {
                this.i.inset(strokeWidth, strokeWidth);
                rectF = this.i;
            }
            canvas.drawRoundRect(rectF, fMin, fMin, this.e);
            int i39 = b;
            int i40 = i39 & 47;
            int i41 = (((i39 ^ 47) | i40) << 1) - ((i39 | 47) & (~i40));
            a = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = b;
        int i44 = (i43 & 39) + (i43 | 39);
        a = i44 % 128;
        int i45 = i44 % 2;
    }
}
