package ivas.gov.bisp.enumeration.O;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import ivas.gov.bisp.enumeration.aK.S;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.O.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0019p extends Drawable implements o {
    private static int a = 0;
    private static int b = 1;
    public static final Paint c;
    public final Path d;
    public bfp e;
    public final a.bfx[] f;
    public final a.bfx[] g;
    public boolean h;
    public final BitSet i;
    public final Matrix j;
    public final Path k;
    public final RectF l;
    public final RectF m;
    public final Region n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f46o;
    public final Region p;
    public final Paint q;
    public final Paint r;
    public final u.bfn s;
    public final ivas.gov.bisp.enumeration.R.j t;
    public final u u;
    public boolean v;
    public PorterDuffColorFilter w;
    public PorterDuffColorFilter x;
    public int y;
    public final RectF z;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.O.p$bfo */
    public class bfo implements u.bfn {
        public bfo() {
        }
    }

    public C0019p() {
        this(new t());
    }

    public final void g(RectF rectF, Path path) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 41) + (i2 | 41);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        u uVar = this.u;
        bfp bfpVar = this.e;
        int i6 = ((i4 ^ 125) | (i4 & 125)) << 1;
        int i7 = -(((~i4) & 125) | (i4 & (-126)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        t tVar = bfpVar.d;
        float f = bfpVar.m;
        int i10 = a;
        int i11 = ((i10 ^ 5) | (i10 & 5)) << 1;
        int i12 = -(((~i10) & 5) | (i10 & (-6)));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            uVar.c(tVar, f, rectF, this.s, path);
            throw null;
        }
        uVar.c(tVar, f, rectF, this.s, path);
        int i14 = b;
        int i15 = i14 ^ 95;
        int i16 = -(-((i14 & 95) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        a = i3 % 128;
        int i4 = i3 % 2;
        bfp bfpVar = this.e;
        int i5 = i2 & 109;
        int i6 = -(-((i2 ^ 109) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 62 / 0;
        }
        return bfpVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = a + 31;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2 == 0 ? 34 : -3;
        int i5 = ((i3 & 104) + (i3 | 104)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 2 % 2;
        bfp bfpVar = new bfp(this.e);
        int i2 = b;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e = bfpVar;
        int i5 = (((i2 | 86) << 1) - (i2 ^ 86)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public int n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        bfp bfpVar = this.e;
        double d = bfpVar.u;
        int i5 = bfpVar.w;
        int i6 = b;
        int i7 = (i6 ^ 47) + ((i6 & 47) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        int iCos = (int) (Math.cos(Math.toRadians(i5)) * d);
        int i9 = b;
        int i10 = (((i9 | 98) << 1) - (i9 ^ 98)) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return iCos;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 android.graphics.Paint$Style) = (r1v5 android.graphics.Paint$Style), (r1v29 android.graphics.Paint$Style) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean p() {
        Paint.Style style;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 11;
        b = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            style = this.e.x;
            if (style != Paint.Style.FILL_AND_STROKE) {
                int i4 = a;
                int i5 = i4 & 121;
                i = (((i4 | 121) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    int i6 = 54 / 0;
                    if (style == Paint.Style.STROKE) {
                    }
                } else if (style == Paint.Style.STROKE) {
                }
                int i7 = b;
                int i8 = i7 & 65;
                int i9 = (i7 | 65) & (~i8);
                int i10 = i8 << 1;
                int i11 = (i9 & i10) + (i9 | i10);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = b;
            int i14 = ((i13 | 11) << 1) - (i13 ^ 11);
            a = i14 % 128;
            int i15 = i14 % 2;
            return z;
        }
        style = this.e.x;
        int i16 = 38 / 0;
        if (style != Paint.Style.FILL_AND_STROKE) {
            int i17 = a;
            int i18 = i17 & 121;
            i = (((i17 | 121) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
            b = i % 128;
            if (i % 2 == 0) {
                int i19 = 54 / 0;
                if (style == Paint.Style.STROKE) {
                }
            } else if (style == Paint.Style.STROKE) {
            }
            int i20 = b;
            int i21 = i20 & 65;
            int i22 = (i20 | 65) & (~i21);
            int i110 = i21 << 1;
            int i111 = (i22 & i110) + (i22 | i110);
            a = i111 % 128;
            int i112 = i111 % 2;
        }
        int i113 = b;
        int i114 = ((i113 | 11) << 1) - (i113 ^ 11);
        a = i114 % 128;
        int i115 = i114 % 2;
        return z;
        if (this.r.getStrokeWidth() > 0.0f) {
            int i23 = b + 23;
            int i24 = i23 % 128;
            a = i24;
            int i25 = i23 % 2;
            int i26 = ((i24 ^ 41) | (i24 & 41)) << 1;
            int i27 = -(((~i24) & 41) | (i24 & (-42)));
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 2 % 5;
            }
            z = true;
        } else {
            int i210 = b;
            int i211 = i210 & 65;
            int i212 = (i210 | 65) & (~i211);
            int i116 = i211 << 1;
            int i117 = (i212 & i116) + (i212 | i116);
            a = i117 % 128;
            int i118 = i117 % 2;
        }
        int i119 = b;
        int i1110 = ((i119 | 11) << 1) - (i119 ^ 11);
        a = i1110 % 128;
        int i1111 = i1110 % 2;
        return z;
    }

    public float q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        h hVar = this.e.d.j;
        RectF rectFE = e();
        int i7 = b;
        int i8 = i7 & 41;
        int i9 = ((i7 | 41) & (~i8)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        float fB = hVar.b(rectFE);
        int i11 = b;
        int i12 = i11 & 63;
        int i13 = ((i11 ^ 63) | i12) << 1;
        int i14 = -((i11 | 63) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        return fB;
    }

    public void s(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = ((i2 | 9) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        bfp bfpVar = this.e;
        if (bfpVar.q != f) {
            int i6 = b + 121;
            a = i6 % 128;
            int i7 = i6 % 2;
            bfpVar.q = f;
            w();
            int i8 = a;
            int i9 = (-2) - ((((i8 | 74) << 1) - (i8 ^ 74)) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 13;
        int i13 = -(-((i11 ^ 13) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 95;
        int i5 = (((i3 | 95) & (~i4)) - (~(i4 << 1))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        setTintList(ColorStateList.valueOf(i));
        int i7 = a;
        int i8 = (i7 | 47) << 1;
        int i9 = -(((~i7) & 47) | (i7 & (-48)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void t(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 105;
        int i4 = (i2 & 105) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        bfp bfpVar = this.e;
        if (bfpVar.m != f) {
            int i7 = a;
            int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            bfpVar.m = f;
            this.h = true;
            invalidateSelf();
            int i10 = b;
            int i11 = ((i10 ^ 78) + ((i10 & 78) << 1)) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = i13 & 37;
        int i15 = (i13 | 37) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    public void v(float f, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 8) << 1) - (i3 ^ 8);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.e.n = f;
            invalidateSelf();
            throw null;
        }
        this.e.n = f;
        invalidateSelf();
        int i6 = a;
        int i7 = i6 & 59;
        int i8 = (i6 ^ 59) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        x(ColorStateList.valueOf(i));
        int i11 = b;
        int i12 = i11 ^ 15;
        int i13 = (((i11 & 15) | i12) << 1) - i12;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 75 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r2
  0x0025: PHI (r2v4 ivas.gov.bisp.enumeration.O.p$bfp) = (r2v3 ivas.gov.bisp.enumeration.O.p$bfp), (r2v15 ivas.gov.bisp.enumeration.O.p$bfp) binds: [B:8:0x0023, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public void x(ColorStateList colorStateList) {
        bfp bfpVar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            bfpVar = this.e;
            int i5 = 55 / 0;
            if (bfpVar.i != colorStateList) {
                bfpVar.i = colorStateList;
                onStateChange(getState());
                int i6 = b;
                int i7 = i6 & 57;
                int i8 = i7 + ((i6 ^ 57) | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                i = ((i6 ^ 57) - (~((i6 & 57) << 1))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i10 = 5 % 3;
                }
            }
        } else {
            bfpVar = this.e;
            if (bfpVar.i != colorStateList) {
                bfpVar.i = colorStateList;
                onStateChange(getState());
                int i11 = b;
                int i12 = i11 & 57;
                int i13 = i12 + ((i11 ^ 57) | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                i = ((i11 ^ 57) - (~((i11 & 57) << 1))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i15 = 5 % 3;
                }
            }
        }
        int i16 = b;
        int i17 = i16 & 97;
        int i18 = ((i16 ^ 97) | i17) << 1;
        int i19 = -((i16 | 97) & (~i17));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.O.p$bfp */
    public static final class bfp extends Drawable.ConstantState {
        private static int a = 0;
        private static int b = 1;
        public Rect c;
        public t d;
        public S e;
        public ColorFilter f;
        public ColorStateList g;
        public ColorStateList h;
        public ColorStateList i;
        public ColorStateList j;
        public PorterDuff.Mode k;
        public float l;
        public float m;
        public float n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f47o;
        public int p;
        public float q;
        public float r;
        public int s;
        public int t;
        public int u;
        public boolean v;
        public int w;
        public Paint.Style x;

        public bfp(t tVar, S s) {
            this.g = null;
            this.i = null;
            this.h = null;
            this.j = null;
            this.k = PorterDuff.Mode.SRC_IN;
            this.c = null;
            this.l = 1.0f;
            this.m = 1.0f;
            this.p = 255;
            this.f47o = 0.0f;
            this.q = 0.0f;
            this.r = 0.0f;
            this.t = 0;
            this.s = 0;
            this.u = 0;
            this.w = 0;
            this.v = false;
            this.x = Paint.Style.FILL_AND_STROKE;
            this.d = tVar;
            this.e = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 71;
            int i4 = ((i2 ^ 71) | i3) << 1;
            int i5 = -((i2 | 71) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 83;
            b = i9 % 128;
            int i10 = i9 % 2;
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i = 2 % 2;
            C0019p c0019p = new C0019p(this);
            c0019p.h = true;
            int i2 = a + 18;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            return c0019p;
        }

        public bfp(bfp bfpVar) {
            this.g = null;
            this.i = null;
            this.h = null;
            this.j = null;
            this.k = PorterDuff.Mode.SRC_IN;
            this.c = null;
            this.l = 1.0f;
            this.m = 1.0f;
            this.p = 255;
            this.f47o = 0.0f;
            this.q = 0.0f;
            this.r = 0.0f;
            this.t = 0;
            this.s = 0;
            this.u = 0;
            this.w = 0;
            this.v = false;
            this.x = Paint.Style.FILL_AND_STROKE;
            this.d = bfpVar.d;
            this.e = bfpVar.e;
            this.n = bfpVar.n;
            this.f = bfpVar.f;
            this.g = bfpVar.g;
            this.i = bfpVar.i;
            this.k = bfpVar.k;
            this.j = bfpVar.j;
            this.p = bfpVar.p;
            this.l = bfpVar.l;
            this.u = bfpVar.u;
            this.t = bfpVar.t;
            this.v = bfpVar.v;
            this.m = bfpVar.m;
            this.f47o = bfpVar.f47o;
            this.q = bfpVar.q;
            this.r = bfpVar.r;
            this.s = bfpVar.s;
            this.w = bfpVar.w;
            this.h = bfpVar.h;
            this.x = bfpVar.x;
            if (bfpVar.c != null) {
                this.c = new Rect(bfpVar.c);
                int i = a + 17;
                b = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            }
            int i4 = b;
            int i5 = i4 & 91;
            int i6 = (((i4 ^ 91) | i5) << 1) - ((i4 | 91) & (~i5));
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    static {
        Paint paint = new Paint(1);
        c = paint;
        paint.setColor(-1);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        int i = b;
        int i2 = (((i ^ 17) | (i & 17)) << 1) - (((~i) & 17) | (i & (-18)));
        a = i2 % 128;
        int i3 = i2 % 2;
        paint.setXfermode(porterDuffXfermode);
        int i4 = b;
        int i5 = i4 & 7;
        int i6 = i4 | 7;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public C0019p(t tVar) {
        this(new bfp(tVar, null));
    }

    public RectF e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 94) + ((i2 & 94) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.l.set(getBounds());
            return this.l;
        }
        this.l.set(getBounds());
        int i5 = 27 / 0;
        return this.l;
    }

    public final void f(RectF rectF, Path path) {
        float f;
        float fWidth;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = i2 | 101;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        g(rectF, path);
        if (this.e.l != 1.0f) {
            int i7 = a;
            int i8 = i7 & 1;
            int i9 = (i8 - (~((i7 ^ 1) | i8))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            this.j.reset();
            Matrix matrix = this.j;
            bfp bfpVar = this.e;
            int i11 = b;
            int i12 = i11 & 3;
            int i13 = -(-(i11 | 3));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                f = bfpVar.l;
                fWidth = rectF.width() - 0.0f;
            } else {
                f = bfpVar.l;
                fWidth = rectF.width() / 2.0f;
            }
            float fHeight = rectF.height();
            int i15 = a;
            int i16 = i15 & 89;
            int i17 = ((i15 | 89) & (~i16)) + (i16 << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            matrix.setScale(f, f, fWidth, fHeight / 2.0f);
            Matrix matrix2 = this.j;
            int i19 = a;
            int i20 = (i19 & 19) + (i19 | 19);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                path.transform(matrix2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            path.transform(matrix2);
        }
        path.computeBounds(this.z, true);
        int i21 = (-2) - ((b + 110) ^ (-1));
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r7 = super.getPadding(r7);
        r1 = ivas.gov.bisp.enumeration.O.C0019p.a;
        r2 = (r1 | 27) << 1;
        r1 = -(((~r1) & 27) | (r1 & (-28)));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.O.C0019p.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r0 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = ivas.gov.bisp.enumeration.O.C0019p.a;
        r4 = r2 | 15;
        r5 = r4 << 1;
        r2 = -((~(r2 & 15)) & r4);
        r4 = (r5 ^ r2) + ((r2 & r5) << 1);
        ivas.gov.bisp.enumeration.O.C0019p.b = r4 % 128;
        r4 = r4 % 2;
        r7.set(r1);
        r7 = ivas.gov.bisp.enumeration.O.C0019p.a;
        r1 = r7 ^ 55;
        r7 = -(-((r7 & 55) << 1));
        r2 = (r1 & r7) + (r7 | r1);
        ivas.gov.bisp.enumeration.O.C0019p.b = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean getPadding(android.graphics.Rect r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.O.C0019p.a
            r2 = r1 ^ 2
            r1 = r1 & r0
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r2 = r2 - r3
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.O.C0019p.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1e
            ivas.gov.bisp.enumeration.O.p$bfp r1 = r6.e
            android.graphics.Rect r1 = r1.c
            r2 = 51
            int r2 = r2 / 0
            if (r1 == 0) goto L4f
            goto L24
        L1e:
            ivas.gov.bisp.enumeration.O.p$bfp r1 = r6.e
            android.graphics.Rect r1 = r1.c
            if (r1 == 0) goto L4f
        L24:
            int r2 = ivas.gov.bisp.enumeration.O.C0019p.a
            r4 = r2 | 15
            int r5 = r4 << 1
            r2 = r2 & 15
            int r2 = ~r2
            r2 = r2 & r4
            int r2 = -r2
            r4 = r5 ^ r2
            r2 = r2 & r5
            int r2 = r2 << r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.O.C0019p.b = r2
            int r4 = r4 % r0
            r7.set(r1)
            int r7 = ivas.gov.bisp.enumeration.O.C0019p.a
            r1 = r7 ^ 55
            r7 = r7 & 55
            int r7 = r7 << r3
            int r7 = -r7
            int r7 = -r7
            r2 = r1 & r7
            r7 = r7 | r1
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.O.C0019p.b = r7
            int r2 = r2 % r0
            return r3
        L4f:
            boolean r7 = super.getPadding(r7)
            int r1 = ivas.gov.bisp.enumeration.O.C0019p.a
            r2 = r1 | 27
            int r2 = r2 << r3
            r4 = r1 & (-28)
            int r1 = ~r1
            r1 = r1 & 27
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 | r1
            int r3 = r4 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.O.C0019p.b = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L70
            r0 = 58
            int r0 = r0 / 0
        L70:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.C0019p.getPadding(android.graphics.Rect):boolean");
    }

    public final void i(Canvas canvas) {
        float f;
        float f2;
        Path path;
        Paint paint;
        a.bfx bfxVar;
        ivas.gov.bisp.enumeration.R.j jVar;
        bfp bfpVar;
        int i = 2 % 2;
        int i2 = a + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.i.cardinality();
        Object obj = null;
        if (this.e.u != 0) {
            int i4 = b;
            int i5 = ((i4 ^ 80) + ((i4 & 80) << 1)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                Paint paint2 = this.t.g;
                throw null;
            }
            canvas.drawPath(this.k, this.t.g);
            int i6 = a + 89;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a;
        int i9 = (i8 & (-10)) | ((~i8) & 9);
        int i10 = -(-((i8 & 9) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < 4) {
            int i14 = a + 25;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                bfxVar = this.f[i13];
                jVar = this.t;
                bfpVar = this.e;
                int i15 = 15 / 0;
            } else {
                bfxVar = this.f[i13];
                jVar = this.t;
                bfpVar = this.e;
            }
            int i16 = bfpVar.s;
            Matrix matrix = a.bfx.c;
            int i17 = a + 111;
            b = i17 % 128;
            int i18 = i17 % 2;
            bfxVar.c(matrix, jVar, i16, canvas);
            a.bfx bfxVar2 = this.g[i13];
            ivas.gov.bisp.enumeration.R.j jVar2 = this.t;
            int i19 = b;
            int i20 = i19 ^ 79;
            int i21 = -(-((i19 & 79) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = this.e.s;
            int i25 = b + 13;
            a = i25 % 128;
            if (i25 % 2 != 0) {
                bfxVar2.c(matrix, jVar2, i24, canvas);
                int i26 = (((i13 & (-62)) | ((~i13) & 61)) - (~((i13 & 61) << 1))) - 1;
                int i27 = i26 | (-59);
                int i28 = i27 << 1;
                int i29 = -(i27 & (~(i26 & (-59))));
                i13 = (i28 & i29) + (i29 | i28);
            } else {
                bfxVar2.c(matrix, jVar2, i24, canvas);
                int i30 = ((i13 & (-78)) + (i13 | (-78))) - 1;
                i13 = (((i30 ^ 80) | (i30 & 80)) << 1) - (((~i30) & 80) | (i30 & (-81)));
            }
            int i31 = b;
            int i32 = (i31 & 47) + (i31 | 47);
            a = i32 % 128;
            int i33 = i32 % 2;
        }
        if (this.v) {
            int i34 = a;
            int i35 = i34 & 21;
            int i36 = -(-((i34 ^ 21) | i35));
            int i37 = (i35 & i36) + (i36 | i35);
            b = i37 % 128;
            int i38 = i37 % 2;
            int iM = m();
            int iN = n();
            int i39 = b + 41;
            int i40 = i39 % 128;
            a = i40;
            if (i39 % 2 != 0) {
                f = -iM;
                f2 = -iN;
                int i41 = 14 / 0;
            } else {
                f = -iM;
                f2 = -iN;
            }
            int i42 = i40 & 55;
            int i43 = ((i40 ^ 55) | i42) << 1;
            int i44 = -((i40 | 55) & (~i42));
            int i45 = (i43 & i44) + (i44 | i43);
            b = i45 % 128;
            if (i45 % 2 == 0) {
                canvas.translate(f, f2);
                path = this.k;
                paint = c;
                int i46 = 72 / 0;
            } else {
                canvas.translate(f, f2);
                path = this.k;
                paint = c;
            }
            canvas.drawPath(path, paint);
            float f3 = iM;
            float f4 = iN;
            int i47 = a;
            int i48 = (i47 ^ 55) + ((i47 & 55) << 1);
            b = i48 % 128;
            if (i48 % 2 == 0) {
                canvas.translate(f3, f4);
                obj.hashCode();
                throw null;
            }
            canvas.translate(f3, f4);
            int i49 = a;
            int i50 = (i49 ^ 15) + ((i49 & 15) << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = a;
        int i53 = i52 & 103;
        int i54 = (i53 - (~(-(-((i52 ^ 103) | i53))))) - 1;
        b = i54 % 128;
        int i55 = i54 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (((i2 | 77) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.h = false;
        } else {
            this.h = true;
        }
        super.invalidateSelf();
    }

    public int m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i3 - (~(-(-((i2 ^ 17) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = this.e.u;
            throw null;
        }
        bfp bfpVar = this.e;
        double d = bfpVar.u;
        double dSin = Math.sin(Math.toRadians(bfpVar.w));
        int i6 = b;
        int i7 = i6 & 125;
        int i8 = (~i7) & (i6 | 125);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = (int) (dSin * d);
        int i13 = (i6 ^ 105) + ((i6 & 105) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public final float o() {
        int i = 2 % 2;
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (!p()) {
            int i4 = b + 87;
            a = i4 % 128;
            int i5 = i4 % 2;
            return 0.0f;
        }
        int i6 = a;
        int i7 = i6 & 19;
        int i8 = (i6 | 19) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        float strokeWidth = this.r.getStrokeWidth();
        float f = i11 == 0 ? strokeWidth + 1.0f : strokeWidth / 2.0f;
        int i12 = b;
        int i13 = (i12 ^ 117) + ((i12 & 117) << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return f;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.h = false;
        } else {
            this.h = true;
        }
        super.onBoundsChange(rect);
        int i4 = a;
        int i5 = i4 & 53;
        int i6 = (i4 | 53) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.graphics.drawable.Drawable, ivas.gov.bisp.enumeration.P.t.aNV
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = (((i2 ^ 5) | i3) << 1) - ((i2 | 5) & (~i3));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            z(iArr);
            A();
            throw null;
        }
        boolean z2 = z(iArr);
        boolean zA = A();
        if (z2 || zA) {
            int i5 = b;
            int i6 = ((i5 & 86) + (i5 | 86)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = b;
            int i9 = i8 & 103;
            int i10 = ((i8 ^ 103) | i9) << 1;
            int i11 = -((~i9) & (i8 | 103));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (i8 & (-104)) | ((~i8) & 103);
            int i15 = -(-((i8 & 103) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        }
        if (z) {
            int i18 = b + 123;
            a = i18 % 128;
            int i19 = i18 % 2;
            invalidateSelf();
            int i20 = a;
            int i21 = i20 & 91;
            int i22 = (i20 ^ 91) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 5 % 3;
            }
        }
        int i25 = a;
        int i26 = i25 & 55;
        int i27 = (i25 | 55) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 & i28) + (i27 | i28);
        b = i29 % 128;
        int i30 = i29 % 2;
        return z;
    }

    public void r(Context context) {
        int i = 2 % 2;
        this.e.e = new S(context);
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = ((i2 ^ 111) | i3) << 1;
        int i5 = -((i2 | 111) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            w();
            int i7 = 74 / 0;
        } else {
            w();
        }
        int i8 = b;
        int i9 = i8 & 85;
        int i10 = -(-(i8 | 85));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.f = colorFilter;
        super.invalidateSelf();
        int i4 = b;
        int i5 = i4 & 83;
        int i6 = (i4 ^ 83) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.O.o
    public void setShapeAppearanceModel(t tVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 97) + (i2 | 97);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.d = tVar;
        invalidateSelf();
        int i5 = b;
        int i6 = (((i5 | 43) << 1) - (~(-(i5 ^ 43)))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public C0019p(bfp bfpVar) {
        u uVar;
        this.f = new a.bfx[4];
        this.g = new a.bfx[4];
        this.i = new BitSet(8);
        this.j = new Matrix();
        this.k = new Path();
        this.d = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.p = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.t = new ivas.gov.bisp.enumeration.R.j();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            uVar = u.bfv.c;
            int i = a + 89;
            b = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            uVar = new u();
            int i4 = (-2) - ((a + 58) ^ (-1));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.u = uVar;
        RectF rectF = new RectF();
        int i6 = b;
        int i7 = i6 & 119;
        int i8 = (i7 - (~((i6 ^ 119) | i7))) - 1;
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        this.z = rectF;
        this.v = true;
        this.e = bfpVar;
        int i11 = i9 & 99;
        int i12 = (((i9 ^ 99) | i11) << 1) - ((~i11) & (i9 | 99));
        b = i12 % 128;
        int i13 = i12 % 2;
        paint2.setStyle(Paint.Style.STROKE);
        Paint.Style style = Paint.Style.FILL;
        int i14 = b;
        int i15 = ((i14 | 57) << 1) - (i14 ^ 57);
        a = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            paint.setStyle(style);
            A();
            getState();
            obj.hashCode();
            throw null;
        }
        paint.setStyle(style);
        A();
        z(getState());
        bfo bfoVar = new bfo();
        int i16 = a;
        int i17 = ((i16 | 125) << 1) - (i16 ^ 125);
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        this.s = bfoVar;
        int i20 = i18 & 5;
        int i21 = ((((i18 ^ 5) | i20) << 1) - (~(-((i18 | 5) & (~i20))))) - 1;
        a = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v34 ivas.gov.bisp.enumeration.O.p$bfp, still in use, count: 2, list:
          (r1v34 ivas.gov.bisp.enumeration.O.p$bfp) from 0x0010: IGET (r1v34 ivas.gov.bisp.enumeration.O.p$bfp) A[WRAPPED] ivas.gov.bisp.enumeration.O.p.bfp.t int
          (r1v34 ivas.gov.bisp.enumeration.O.p$bfp) from 0x002f: PHI (r1 I:??) = (r1v4 ivas.gov.bisp.enumeration.O.p$bfp), (r1v34 ivas.gov.bisp.enumeration.O.p$bfp) binds: [B:8:0x001a, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.graphics.drawable.Drawable
    @android.annotation.TargetApi(android.support.v4.media.session.IMediaSession.Stub.TRANSACTION_previous)
    public void getOutline(android.graphics.Outline r6) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.C0019p.getOutline(android.graphics.Outline):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 65) << 1) - (i4 ^ 65);
        a = i5 % 128;
        int i6 = i5 % 2;
        bfp bfpVar = this.e;
        if (i6 != 0) {
            int i7 = 25 / 0;
            if (bfpVar.p != i) {
                i2 = b + 63;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    bfpVar.p = i;
                    super.invalidateSelf();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                bfpVar.p = i;
                super.invalidateSelf();
            }
        } else if (bfpVar.p != i) {
            i2 = b + 63;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                bfpVar.p = i;
                super.invalidateSelf();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bfpVar.p = i;
            super.invalidateSelf();
        }
        int i8 = b;
        int i9 = i8 & 7;
        int i10 = (i9 - (~(-(-((i8 ^ 7) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b + 9;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.e.j = colorStateList;
            A();
            obj.hashCode();
            throw null;
        }
        this.e.j = colorStateList;
        A();
        int i3 = b;
        int i4 = (i3 & 49) + (i3 | 49);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            super.invalidateSelf();
        } else {
            super.invalidateSelf();
            throw null;
        }
    }

    public void u(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b + 1;
        a = i2 % 128;
        int i3 = i2 % 2;
        bfp bfpVar = this.e;
        if (bfpVar.g != colorStateList) {
            int i4 = b;
            int i5 = i4 & 27;
            int i6 = ((((i4 ^ 27) | i5) << 1) - (~(-((i4 | 27) & (~i5))))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                bfpVar.g = colorStateList;
                onStateChange(getState());
                throw null;
            }
            bfpVar.g = colorStateList;
            onStateChange(getState());
            int i7 = a;
            int i8 = (i7 & 9) + (i7 | 9);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = i10 & 57;
        int i12 = ((i10 ^ 57) | i11) << 1;
        int i13 = -((i10 | 57) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public void y(float f, ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 22) ^ (-1));
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.e.n = f;
            invalidateSelf();
            obj.hashCode();
            throw null;
        }
        this.e.n = f;
        invalidateSelf();
        x(colorStateList);
        int i3 = a;
        int i4 = i3 & 125;
        int i5 = i4 + ((i3 ^ 125) | i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Region region;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = i2 | 49;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.n.set(getBounds());
        int i7 = b;
        int i8 = i7 & 121;
        int i9 = -(-((i7 ^ 121) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            f(e(), this.k);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        f(e(), this.k);
        this.p.setPath(this.k, this.n);
        Region region2 = this.n;
        int i11 = a;
        int i12 = i11 & 49;
        int i13 = ((i11 | 49) & (~i12)) + (i12 << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            region2.op(this.p, Region.Op.DIFFERENCE);
            region = this.n;
            int i14 = 64 / 0;
        } else {
            region2.op(this.p, Region.Op.DIFFERENCE);
            region = this.n;
        }
        int i15 = (-2) - ((a + 18) ^ (-1));
        b = i15 % 128;
        int i16 = i15 % 2;
        return region;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:9:0x004b  */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 34) + (i3 | 34)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!(!super.isStateful())) {
            int i6 = a;
            int i7 = i6 ^ 9;
            int i8 = ((i6 & 9) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            int i12 = b;
            int i13 = (((i12 | 78) << 1) - (i12 ^ 78)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            ColorStateList colorStateList4 = this.e.j;
            if (colorStateList4 != null) {
                int i15 = b;
                int i16 = i15 & 81;
                int i17 = ((i15 ^ 81) | i16) << 1;
                int i18 = -((i15 | 81) & (~i16));
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i20 = i19 % 2;
                if (colorStateList4.isStateful()) {
                    int i21 = a;
                    int i22 = i21 ^ 9;
                    int i23 = ((i21 & 9) | i22) << 1;
                    int i24 = -i22;
                    int i110 = (i23 & i24) + (i23 | i24);
                    b = i110 % 128;
                    int i111 = i110 % 2;
                    z = true;
                } else {
                    colorStateList = this.e.h;
                    if (colorStateList != null) {
                        int i25 = a + 7;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        if (colorStateList.isStateful()) {
                            int i27 = a;
                            int i28 = i27 ^ 9;
                            int i29 = ((i27 & 9) | i28) << 1;
                            int i210 = -i28;
                            int i112 = (i29 & i210) + (i29 | i210);
                            b = i112 % 128;
                            int i113 = i112 % 2;
                            z = true;
                        } else {
                            colorStateList2 = this.e.i;
                            if (colorStateList2 != null) {
                                int i30 = a;
                                i = ((i30 ^ 70) + ((i30 & 70) << 1)) - 1;
                                b = i % 128;
                                if (i % 2 != 0) {
                                    colorStateList2.isStateful();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (colorStateList2.isStateful()) {
                                    int i211 = a;
                                    int i212 = i211 ^ 9;
                                    int i213 = ((i211 & 9) | i212) << 1;
                                    int i214 = -i212;
                                    int i114 = (i213 & i214) + (i213 | i214);
                                    b = i114 % 128;
                                    int i115 = i114 % 2;
                                    z = true;
                                } else {
                                    colorStateList3 = this.e.g;
                                    if (colorStateList3 != null) {
                                        int i31 = a;
                                        int i32 = (i31 & (-2)) | ((~i31) & 1);
                                        int i33 = -(-((i31 & 1) << 1));
                                        int i34 = (i32 & i33) + (i33 | i32);
                                        b = i34 % 128;
                                        int i35 = i34 % 2;
                                        if (!colorStateList3.isStateful()) {
                                            int i215 = a;
                                            int i216 = i215 ^ 9;
                                            int i217 = ((i215 & 9) | i216) << 1;
                                            int i218 = -i216;
                                            int i116 = (i217 & i218) + (i217 | i218);
                                            b = i116 % 128;
                                            int i117 = i116 % 2;
                                            z = true;
                                        }
                                    }
                                    int i36 = b;
                                    int i37 = i36 & 103;
                                    int i38 = (((i36 | 103) & (~i37)) - (~(i37 << 1))) - 1;
                                    a = i38 % 128;
                                    int i39 = i38 % 2;
                                    z = false;
                                }
                            } else {
                                colorStateList3 = this.e.g;
                                if (colorStateList3 != null) {
                                    int i310 = a;
                                    int i311 = (i310 & (-2)) | ((~i310) & 1);
                                    int i312 = -(-((i310 & 1) << 1));
                                    int i313 = (i311 & i312) + (i312 | i311);
                                    b = i313 % 128;
                                    int i314 = i313 % 2;
                                    if (!colorStateList3.isStateful()) {
                                        int i219 = a;
                                        int i2110 = i219 ^ 9;
                                        int i2111 = ((i219 & 9) | i2110) << 1;
                                        int i2112 = -i2110;
                                        int i118 = (i2111 & i2112) + (i2111 | i2112);
                                        b = i118 % 128;
                                        int i119 = i118 % 2;
                                        z = true;
                                    }
                                }
                                int i315 = b;
                                int i316 = i315 & 103;
                                int i317 = (((i315 | 103) & (~i316)) - (~(i316 << 1))) - 1;
                                a = i317 % 128;
                                int i318 = i317 % 2;
                                z = false;
                            }
                        }
                    } else {
                        colorStateList2 = this.e.i;
                        if (colorStateList2 != null) {
                            int i319 = a;
                            i = ((i319 ^ 70) + ((i319 & 70) << 1)) - 1;
                            b = i % 128;
                            if (i % 2 != 0) {
                                colorStateList2.isStateful();
                                obj.hashCode();
                                throw null;
                            }
                            if (colorStateList2.isStateful()) {
                                colorStateList3 = this.e.g;
                                if (colorStateList3 != null) {
                                    int i3110 = a;
                                    int i3111 = (i3110 & (-2)) | ((~i3110) & 1);
                                    int i3112 = -(-((i3110 & 1) << 1));
                                    int i3113 = (i3111 & i3112) + (i3112 | i3111);
                                    b = i3113 % 128;
                                    int i3114 = i3113 % 2;
                                    if (!colorStateList3.isStateful()) {
                                        int i2113 = a;
                                        int i2114 = i2113 ^ 9;
                                        int i2115 = ((i2113 & 9) | i2114) << 1;
                                        int i2116 = -i2114;
                                        int i1110 = (i2115 & i2116) + (i2115 | i2116);
                                        b = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                        z = true;
                                    }
                                }
                                int i3115 = b;
                                int i3116 = i3115 & 103;
                                int i3117 = (((i3115 | 103) & (~i3116)) - (~(i3116 << 1))) - 1;
                                a = i3117 % 128;
                                int i3118 = i3117 % 2;
                                z = false;
                            } else {
                                int i2117 = a;
                                int i2118 = i2117 ^ 9;
                                int i2119 = ((i2117 & 9) | i2118) << 1;
                                int i21110 = -i2118;
                                int i1112 = (i2119 & i21110) + (i2119 | i21110);
                                b = i1112 % 128;
                                int i1113 = i1112 % 2;
                                z = true;
                            }
                        } else {
                            colorStateList3 = this.e.g;
                            if (colorStateList3 != null) {
                                int i3119 = a;
                                int i31110 = (i3119 & (-2)) | ((~i3119) & 1);
                                int i31111 = -(-((i3119 & 1) << 1));
                                int i31112 = (i31110 & i31111) + (i31111 | i31110);
                                b = i31112 % 128;
                                int i31113 = i31112 % 2;
                                if (!colorStateList3.isStateful()) {
                                    int i21111 = a;
                                    int i21112 = i21111 ^ 9;
                                    int i21113 = ((i21111 & 9) | i21112) << 1;
                                    int i21114 = -i21112;
                                    int i1114 = (i21113 & i21114) + (i21113 | i21114);
                                    b = i1114 % 128;
                                    int i1115 = i1114 % 2;
                                    z = true;
                                }
                            }
                            int i31114 = b;
                            int i31115 = i31114 & 103;
                            int i31116 = (((i31114 | 103) & (~i31115)) - (~(i31115 << 1))) - 1;
                            a = i31116 % 128;
                            int i31117 = i31116 % 2;
                            z = false;
                        }
                    }
                }
            } else {
                colorStateList = this.e.h;
                if (colorStateList != null) {
                    int i220 = a + 7;
                    b = i220 % 128;
                    int i221 = i220 % 2;
                    if (colorStateList.isStateful()) {
                        colorStateList2 = this.e.i;
                        if (colorStateList2 != null) {
                            int i3120 = a;
                            i = ((i3120 ^ 70) + ((i3120 & 70) << 1)) - 1;
                            b = i % 128;
                            if (i % 2 != 0) {
                                colorStateList2.isStateful();
                                obj.hashCode();
                                throw null;
                            }
                            if (colorStateList2.isStateful()) {
                                colorStateList3 = this.e.g;
                                if (colorStateList3 != null) {
                                    int i31118 = a;
                                    int i31119 = (i31118 & (-2)) | ((~i31118) & 1);
                                    int i311110 = -(-((i31118 & 1) << 1));
                                    int i311111 = (i31119 & i311110) + (i311110 | i31119);
                                    b = i311111 % 128;
                                    int i311112 = i311111 % 2;
                                    if (!colorStateList3.isStateful()) {
                                        int i21115 = a;
                                        int i21116 = i21115 ^ 9;
                                        int i21117 = ((i21115 & 9) | i21116) << 1;
                                        int i21118 = -i21116;
                                        int i1116 = (i21117 & i21118) + (i21117 | i21118);
                                        b = i1116 % 128;
                                        int i1117 = i1116 % 2;
                                        z = true;
                                    }
                                }
                                int i311113 = b;
                                int i311114 = i311113 & 103;
                                int i311115 = (((i311113 | 103) & (~i311114)) - (~(i311114 << 1))) - 1;
                                a = i311115 % 128;
                                int i311116 = i311115 % 2;
                                z = false;
                            } else {
                                int i21119 = a;
                                int i211110 = i21119 ^ 9;
                                int i211111 = ((i21119 & 9) | i211110) << 1;
                                int i211112 = -i211110;
                                int i1118 = (i211111 & i211112) + (i211111 | i211112);
                                b = i1118 % 128;
                                int i1119 = i1118 % 2;
                                z = true;
                            }
                        } else {
                            colorStateList3 = this.e.g;
                            if (colorStateList3 != null) {
                                int i311117 = a;
                                int i311118 = (i311117 & (-2)) | ((~i311117) & 1);
                                int i311119 = -(-((i311117 & 1) << 1));
                                int i3111110 = (i311118 & i311119) + (i311119 | i311118);
                                b = i3111110 % 128;
                                int i3111111 = i3111110 % 2;
                                if (!colorStateList3.isStateful()) {
                                    int i211113 = a;
                                    int i211114 = i211113 ^ 9;
                                    int i211115 = ((i211113 & 9) | i211114) << 1;
                                    int i211116 = -i211114;
                                    int i11110 = (i211115 & i211116) + (i211115 | i211116);
                                    b = i11110 % 128;
                                    int i11111 = i11110 % 2;
                                    z = true;
                                }
                            }
                            int i3111112 = b;
                            int i3111113 = i3111112 & 103;
                            int i3111114 = (((i3111112 | 103) & (~i3111113)) - (~(i3111113 << 1))) - 1;
                            a = i3111114 % 128;
                            int i3111115 = i3111114 % 2;
                            z = false;
                        }
                    } else {
                        int i211117 = a;
                        int i211118 = i211117 ^ 9;
                        int i211119 = ((i211117 & 9) | i211118) << 1;
                        int i2111110 = -i211118;
                        int i11112 = (i211119 & i2111110) + (i211119 | i2111110);
                        b = i11112 % 128;
                        int i11113 = i11112 % 2;
                        z = true;
                    }
                } else {
                    colorStateList2 = this.e.i;
                    if (colorStateList2 != null) {
                        int i3121 = a;
                        i = ((i3121 ^ 70) + ((i3121 & 70) << 1)) - 1;
                        b = i % 128;
                        if (i % 2 != 0) {
                            colorStateList2.isStateful();
                            obj.hashCode();
                            throw null;
                        }
                        if (colorStateList2.isStateful()) {
                            colorStateList3 = this.e.g;
                            if (colorStateList3 != null) {
                                int i3111116 = a;
                                int i3111117 = (i3111116 & (-2)) | ((~i3111116) & 1);
                                int i3111118 = -(-((i3111116 & 1) << 1));
                                int i3111119 = (i3111117 & i3111118) + (i3111118 | i3111117);
                                b = i3111119 % 128;
                                int i31111110 = i3111119 % 2;
                                if (!colorStateList3.isStateful()) {
                                    int i2111111 = a;
                                    int i2111112 = i2111111 ^ 9;
                                    int i2111113 = ((i2111111 & 9) | i2111112) << 1;
                                    int i2111114 = -i2111112;
                                    int i11114 = (i2111113 & i2111114) + (i2111113 | i2111114);
                                    b = i11114 % 128;
                                    int i11115 = i11114 % 2;
                                    z = true;
                                }
                            }
                            int i31111111 = b;
                            int i31111112 = i31111111 & 103;
                            int i31111113 = (((i31111111 | 103) & (~i31111112)) - (~(i31111112 << 1))) - 1;
                            a = i31111113 % 128;
                            int i31111114 = i31111113 % 2;
                            z = false;
                        } else {
                            int i2111115 = a;
                            int i2111116 = i2111115 ^ 9;
                            int i2111117 = ((i2111115 & 9) | i2111116) << 1;
                            int i2111118 = -i2111116;
                            int i11116 = (i2111117 & i2111118) + (i2111117 | i2111118);
                            b = i11116 % 128;
                            int i11117 = i11116 % 2;
                            z = true;
                        }
                    } else {
                        colorStateList3 = this.e.g;
                        if (colorStateList3 != null) {
                            int i31111115 = a;
                            int i31111116 = (i31111115 & (-2)) | ((~i31111115) & 1);
                            int i31111117 = -(-((i31111115 & 1) << 1));
                            int i31111118 = (i31111116 & i31111117) + (i31111117 | i31111116);
                            b = i31111118 % 128;
                            int i31111119 = i31111118 % 2;
                            if (!colorStateList3.isStateful()) {
                                int i2111119 = a;
                                int i21111110 = i2111119 ^ 9;
                                int i21111111 = ((i2111119 & 9) | i21111110) << 1;
                                int i21111112 = -i21111110;
                                int i11118 = (i21111111 & i21111112) + (i21111111 | i21111112);
                                b = i11118 % 128;
                                int i11119 = i11118 % 2;
                                z = true;
                            }
                        }
                        int i311111110 = b;
                        int i311111111 = i311111110 & 103;
                        int i311111112 = (((i311111110 | 103) & (~i311111111)) - (~(i311111111 << 1))) - 1;
                        a = i311111112 % 128;
                        int i311111113 = i311111112 % 2;
                        z = false;
                    }
                }
            }
        }
        int i40 = a;
        int i41 = (((i40 ^ 41) | (i40 & 41)) << 1) - (((~i40) & 41) | (i40 & (-42)));
        b = i41 % 128;
        if (i41 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final void k(Canvas canvas, Paint paint, Path path, t tVar, RectF rectF) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 56) + (i2 | 56)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            tVar.i(rectF);
            obj.hashCode();
            throw null;
        }
        if (!tVar.i(rectF)) {
            canvas.drawPath(path, paint);
            int i4 = a;
            int i5 = (i4 ^ 91) + ((i4 & 91) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
                return;
            }
            return;
        }
        int i7 = b;
        int i8 = (i7 & 97) + (i7 | 97);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            tVar.i.b(rectF);
            obj.hashCode();
            throw null;
        }
        float fB = tVar.i.b(rectF) * this.e.m;
        canvas.drawRoundRect(rectF, fB, fB, paint);
        int i9 = b;
        int i10 = (i9 ^ 21) + ((i9 & 21) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            PorterDuff.Mode mode2 = this.e.k;
            throw null;
        }
        bfp bfpVar = this.e;
        if (bfpVar.k != mode) {
            bfpVar.k = mode;
            A();
            super.invalidateSelf();
            int i4 = b;
            int i5 = i4 & 3;
            int i6 = ((i4 ^ 3) | i5) << 1;
            int i7 = -((i4 | 3) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = (i10 ^ 101) + ((i10 & 101) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cc A[PHI: r11
  0x00cc: PHI (r11v11 int) = (r11v10 int), (r11v16 int) binds: [B:25:0x00ca, B:22:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean z(int[] iArr) {
        boolean z;
        int colorForState;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 19) << 1;
        int i4 = -(((~i2) & 19) | (i2 & (-20)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            ColorStateList colorStateList = this.e.g;
            throw null;
        }
        if (this.e.g != null) {
            int i6 = a;
            int i7 = i6 & 1;
            int i8 = -(-((i6 ^ 1) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                this.q.getColor();
                throw null;
            }
            int color = this.q.getColor();
            int colorForState2 = this.e.g.getColorForState(iArr, color);
            if (color != colorForState2) {
                int i10 = a;
                int i11 = i10 & 35;
                int i12 = (((i10 ^ 35) | i11) << 1) - ((i10 | 35) & (~i11));
                b = i12 % 128;
                int i13 = i12 % 2;
                this.q.setColor(colorForState2);
                int i14 = a;
                int i15 = i14 ^ 1;
                int i16 = -(-((i14 & 1) << 1));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 2 % 3;
                }
                z = true;
            } else {
                int i19 = b;
                int i20 = i19 & 49;
                int i21 = i20 + ((i19 ^ 49) | i20);
                a = i21 % 128;
                int i22 = i21 % 2;
                z = false;
            }
        } else {
            int i110 = b;
            int i23 = i110 & 49;
            int i24 = i23 + ((i110 ^ 49) | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            z = false;
        }
        if (this.e.i != null) {
            int i26 = b;
            int i27 = ((i26 | 111) << 1) - (i26 ^ 111);
            a = i27 % 128;
            int i28 = i27 % 2;
            int color2 = this.r.getColor();
            ColorStateList colorStateList2 = this.e.i;
            int i29 = b;
            int i30 = i29 & 113;
            int i31 = -(-((i29 ^ 113) | i30));
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                colorForState = colorStateList2.getColorForState(iArr, color2);
                int i33 = 36 / 0;
                if (color2 != colorForState) {
                    int i34 = b;
                    int i35 = ((i34 | 63) << 1) - (i34 ^ 63);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    this.r.setColor(colorForState);
                    int i37 = b + 14;
                    int i38 = (i37 ^ (-1)) + (i37 << 1);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    z = true;
                }
            } else {
                colorForState = colorStateList2.getColorForState(iArr, color2);
                if (color2 != colorForState) {
                    int i310 = b;
                    int i311 = ((i310 | 63) << 1) - (i310 ^ 63);
                    a = i311 % 128;
                    int i312 = i311 % 2;
                    this.r.setColor(colorForState);
                    int i313 = b + 14;
                    int i314 = (i313 ^ (-1)) + (i313 << 1);
                    a = i314 % 128;
                    int i315 = i314 % 2;
                    z = true;
                }
            }
        }
        int i40 = b;
        int i41 = ((i40 ^ 19) | (i40 & 19)) << 1;
        int i42 = -(((~i40) & 19) | (i40 & (-20)));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        a = i43 % 128;
        int i44 = i43 % 2;
        return z;
    }

    public void l(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
        int i4 = -((i2 & (-28)) | ((~i2) & 27));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Paint paint = this.r;
        Path path = this.d;
        t tVar = this.f46o;
        int i6 = i2 | 7;
        int i7 = i6 << 1;
        int i8 = -((~(i2 & 7)) & i6);
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        this.m.set(e());
        int i11 = b;
        int i12 = i11 & 83;
        int i13 = (i12 - (~(-(-((i11 ^ 83) | i12))))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            float fO = o();
            this.m.inset(fO, fO);
            throw null;
        }
        float fO2 = o();
        this.m.inset(fO2, fO2);
        int i14 = a;
        int i15 = (-2) - (((i14 ^ 34) + ((i14 & 34) << 1)) ^ (-1));
        b = i15 % 128;
        if (i15 % 2 == 0) {
            k(canvas, paint, path, tVar, this.m);
            throw null;
        }
        k(canvas, paint, path, tVar, this.m);
        int i16 = b;
        int i17 = ((i16 ^ 59) | (i16 & 59)) << 1;
        int i18 = -(((~i16) & 59) | (i16 & (-60)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 72 / 0;
        }
    }

    public final void w() {
        float f;
        float f2;
        bfp bfpVar;
        int i = 2 % 2;
        int i2 = b + 107;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            float f3 = this.e.q;
            throw null;
        }
        bfp bfpVar2 = this.e;
        float f4 = bfpVar2.q;
        int i3 = b;
        int i4 = (i3 ^ 115) + ((i3 & 115) << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            f = f4 / bfpVar2.r;
            f2 = 0.75f + f;
        } else {
            f = f4 + bfpVar2.r;
            f2 = 0.75f * f;
        }
        double d = f2;
        int i5 = b + 115;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            bfpVar2.s = (int) Math.ceil(d);
            bfpVar = this.e;
            int i6 = 15 / 0;
        } else {
            bfpVar2.s = (int) Math.ceil(d);
            bfpVar = this.e;
        }
        bfpVar.u = (int) Math.ceil(f * 0.25f);
        int i7 = b + 105;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            A();
            super.invalidateSelf();
        } else {
            A();
            super.invalidateSelf();
            int i8 = 34 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    public final PorterDuffColorFilter h(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int i;
        int color;
        int iJ;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 31;
        int i5 = ((i3 ^ 31) | i4) << 1;
        int i6 = -((i3 | 31) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        b = i8;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (i7 % 2 == 0) {
            porterDuffColorFilter.hashCode();
            throw null;
        }
        if (colorStateList != null) {
            int i9 = (i8 ^ 119) + ((i8 & 119) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (mode != null) {
                int colorForState = colorStateList.getColorForState(getState(), 0);
                if (z) {
                    int i10 = b;
                    int i11 = i10 & 87;
                    int i12 = -(-((i10 ^ 87) | i11));
                    int i13 = (i11 & i12) + (i12 | i11);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        j(colorForState);
                        porterDuffColorFilter.hashCode();
                        throw null;
                    }
                    colorForState = j(colorForState);
                    int i14 = b;
                    int i15 = (i14 & 73) + (i14 | 73);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
                this.y = colorForState;
                porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
                int i17 = b;
                int i18 = i17 & 49;
                int i19 = (i18 - (~((i17 ^ 49) | i18))) - 1;
                int i20 = i19 % 128;
                a = i20;
                int i21 = i19 % 2;
                int i22 = (i20 & (-48)) | ((~i20) & 47);
                int i23 = (i20 & 47) << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
            } else if (z) {
                int i26 = i8 | 33;
                int i27 = i26 << 1;
                int i28 = -(i26 & (~(i8 & 33)));
                i = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    color = paint.getColor();
                    iJ = j(color);
                    this.y = iJ;
                    int i29 = 52 / 0;
                } else {
                    color = paint.getColor();
                    iJ = j(color);
                    this.y = iJ;
                }
                if (iJ != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(iJ, PorterDuff.Mode.SRC_IN);
                    int i30 = a + 103;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    int i32 = b;
                    int i33 = (i32 ^ 89) + ((i32 & 89) << 1);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                }
            } else {
                int i35 = b;
                int i36 = (i35 ^ 89) + ((i35 & 89) << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
            }
        } else if (z) {
            int i210 = i8 | 33;
            int i211 = i210 << 1;
            int i212 = -(i210 & (~(i8 & 33)));
            i = (i211 ^ i212) + ((i212 & i211) << 1);
            a = i % 128;
            if (i % 2 != 0) {
                color = paint.getColor();
                iJ = j(color);
                this.y = iJ;
                int i213 = 52 / 0;
            } else {
                color = paint.getColor();
                iJ = j(color);
                this.y = iJ;
            }
            if (iJ != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(iJ, PorterDuff.Mode.SRC_IN);
                int i38 = a + 103;
                b = i38 % 128;
                int i39 = i38 % 2;
            } else {
                int i310 = b;
                int i311 = (i310 ^ 89) + ((i310 & 89) << 1);
                a = i311 % 128;
                int i312 = i311 % 2;
            }
        } else {
            int i313 = b;
            int i314 = (i313 ^ 89) + ((i313 & 89) << 1);
            a = i314 % 128;
            int i315 = i314 % 2;
        }
        int i40 = b;
        int i41 = (i40 & (-76)) | ((~i40) & 75);
        int i42 = (i40 & 75) << 1;
        int i43 = (i41 & i42) + (i42 | i41);
        a = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 35 / 0;
        }
        return porterDuffColorFilter;
    }

    public final boolean A() {
        Paint paint;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = -(-((i2 ^ 45) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        bfp bfpVar = this.e;
        int i7 = i2 + 110;
        boolean z = true;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            ColorStateList colorStateList = bfpVar.j;
            PorterDuff.Mode mode = bfpVar.k;
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList2 = bfpVar.j;
        PorterDuff.Mode mode2 = bfpVar.k;
        int i9 = b;
        int i10 = i9 & 31;
        int i11 = ((i9 | 31) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            paint = this.q;
            int i12 = 31 / 0;
        } else {
            paint = this.q;
        }
        this.x = h(colorStateList2, mode2, paint, true);
        bfp bfpVar2 = this.e;
        int i13 = b;
        int i14 = ((i13 | 29) << 1) - (i13 ^ 29);
        a = i14 % 128;
        int i15 = i14 % 2;
        ColorStateList colorStateList3 = bfpVar2.h;
        PorterDuff.Mode mode3 = bfpVar2.k;
        int i16 = b;
        int i17 = ((i16 ^ 70) + ((i16 & 70) << 1)) - 1;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        this.w = h(colorStateList3, mode3, this.r, false);
        bfp bfpVar3 = this.e;
        int i18 = a;
        int i19 = i18 & 107;
        int i20 = ((i18 ^ 107) | i19) << 1;
        int i21 = -((i18 | 107) & (~i19));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        if (bfpVar3.v) {
            int i24 = b;
            int i25 = ((i24 | 92) << 1) - (i24 ^ 92);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            ivas.gov.bisp.enumeration.R.j jVar = this.t;
            ColorStateList colorStateList4 = bfpVar3.j;
            int[] state = getState();
            int i28 = a;
            int i29 = (i28 & (-22)) | ((~i28) & 21);
            int i30 = -(-((i28 & 21) << 1));
            int i31 = (i29 & i30) + (i30 | i29);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                jVar.c(colorStateList4.getColorForState(state, 0));
                obj.hashCode();
                throw null;
            }
            jVar.c(colorStateList4.getColorForState(state, 0));
        }
        if (Objects.equals(porterDuffColorFilter, this.x)) {
            int i32 = b;
            int i33 = i32 & 87;
            int i34 = i33 + ((i32 ^ 87) | i33);
            a = i34 % 128;
            int i35 = i34 % 2;
            if (Objects.equals(porterDuffColorFilter2, this.w)) {
                int i36 = b;
                int i37 = i36 & 59;
                int i38 = (i37 - (~(-(-((i36 ^ 59) | i37))))) - 1;
                a = i38 % 128;
                int i39 = i38 % 2;
                z = false;
            } else {
                int i40 = a;
                int i41 = ((i40 ^ 39) | (i40 & 39)) << 1;
                int i42 = -((i40 & (-40)) | ((~i40) & 39));
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                b = i43 % 128;
                z = i43 % 2 != 0;
                int i44 = i40 & 85;
                int i45 = i44 + ((i40 ^ 85) | i44);
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 4 % 4;
                }
            }
        }
        int i47 = a + 95;
        b = i47 % 128;
        if (i47 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ad A[PHI: r7
  0x00ad: PHI (r7v13 float) = (r7v12 float), (r7v28 float) binds: [B:23:0x00ab, B:20:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0156  */
    /* JADX WARN: Code duplicated, block: B:39:0x0185  */
    /* JADX WARN: Code duplicated, block: B:41:0x0192  */
    public int j(int i) {
        float f;
        float fMin;
        int i2;
        int iV;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b + 113;
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            bfp bfpVar = this.e;
            float f2 = bfpVar.q;
            float f3 = bfpVar.r;
            throw null;
        }
        bfp bfpVar2 = this.e;
        float f4 = bfpVar2.q;
        float f5 = bfpVar2.r;
        int i8 = b;
        int i9 = i8 & 81;
        int i10 = ((i8 ^ 81) | i9) << 1;
        int i11 = -((i8 | 81) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        float f6 = f4 + f5 + bfpVar2.f47o;
        S s = bfpVar2.e;
        int i14 = a;
        int i15 = i14 + 119;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (s != null) {
            int i16 = i14 + 35;
            b = i16 % 128;
            int i17 = i16 % 2;
            if (!(!s.d)) {
                int i18 = b;
                int i19 = (i18 & (-78)) | ((~i18) & 77);
                int i20 = (i18 & 77) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                if (i21 % 2 == 0 ? ivas.gov.bisp.enumeration.p007ag.j.f(i, 255) != s.g : ivas.gov.bisp.enumeration.p007ag.j.f(i, 18433) != s.g) {
                    int i22 = b;
                    int i23 = i22 & 87;
                    int i24 = i22 | 87;
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    int i27 = a;
                    int i28 = i27 ^ 109;
                    int i29 = -(-((i27 & 109) << 1));
                    int i30 = (i28 & i29) + (i28 | i29);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = i27 & 3;
                    int i33 = (i27 ^ 3) | i32;
                    int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                    b = i34 % 128;
                    if (i34 % 2 == 0) {
                        f = s.h;
                        if (f > 1.0f) {
                            if (f6 > 0.0f) {
                                int i35 = b + 11;
                                a = i35 % 128;
                                int i36 = i35 % 2;
                                float fLog1p = (((float) Math.log1p(f6 / f)) * 4.5f) + 2.0f;
                                int i37 = a;
                                int i38 = (i37 ^ 6) + ((i37 & 6) << 1);
                                int i39 = (i38 ^ (-1)) + (i38 << 1);
                                b = i39 % 128;
                                int i40 = i39 % 2;
                                fMin = Math.min(fLog1p / 100.0f, 1.0f);
                                int i41 = a;
                                int i42 = i41 & 113;
                                int i43 = (i41 ^ 113) | i42;
                                i2 = (i42 & i43) + (i43 | i42);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i44 = 2 % 5;
                                }
                            }
                        }
                        int iAlpha = Color.alpha(i);
                        int iF = ivas.gov.bisp.enumeration.p007ag.j.f(i, 255);
                        int i45 = b;
                        int i46 = i45 & 105;
                        int i47 = (i46 - (~(-(-((i45 ^ 105) | i46))))) - 1;
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        iV = r.v(iF, s.e, fMin);
                        if (fMin > 0.0f) {
                            int i49 = b;
                            i3 = ((i49 ^ 108) + ((i49 & 108) << 1)) - 1;
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i50 = s.f;
                                obj.hashCode();
                                throw null;
                            }
                            i4 = s.f;
                            if (i4 != 0) {
                                int i51 = b;
                                int i52 = i51 & 55;
                                int i53 = ((i51 ^ 55) | i52) << 1;
                                int i54 = -((i51 | 55) & (~i52));
                                i5 = ((i53 | i54) << 1) - (i54 ^ i53);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                                    obj.hashCode();
                                    throw null;
                                }
                                iV = ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                                int i55 = b;
                                int i56 = (((i55 & (-2)) | ((~i55) & 1)) - (~((i55 & 1) << 1))) - 1;
                                int i57 = i56 % 128;
                                a = i57;
                                int i58 = i56 % 2;
                                int i59 = (((i57 & (-88)) | ((~i57) & 87)) - (~(-(-((i57 & 87) << 1))))) - 1;
                                b = i59 % 128;
                                int i60 = i59 % 2;
                            }
                        }
                        i = ivas.gov.bisp.enumeration.p007ag.j.f(iV, iAlpha);
                        int i61 = b;
                        int i62 = (((i61 & (-16)) | ((~i61) & 15)) - (~(-(-((i61 & 15) << 1))))) - 1;
                        a = i62 % 128;
                        int i63 = i62 % 2;
                    } else {
                        f = s.h;
                        if (f > 0.0f) {
                            if (f6 > 0.0f) {
                                int i310 = b + 11;
                                a = i310 % 128;
                                int i311 = i310 % 2;
                                float fLog1p2 = (((float) Math.log1p(f6 / f)) * 4.5f) + 2.0f;
                                int i312 = a;
                                int i313 = (i312 ^ 6) + ((i312 & 6) << 1);
                                int i314 = (i313 ^ (-1)) + (i313 << 1);
                                b = i314 % 128;
                                int i410 = i314 % 2;
                                fMin = Math.min(fLog1p2 / 100.0f, 1.0f);
                                int i411 = a;
                                int i412 = i411 & 113;
                                int i413 = (i411 ^ 113) | i412;
                                i2 = (i412 & i413) + (i413 | i412);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i414 = 2 % 5;
                                }
                            }
                        }
                        int iAlpha2 = Color.alpha(i);
                        int iF2 = ivas.gov.bisp.enumeration.p007ag.j.f(i, 255);
                        int i415 = b;
                        int i416 = i415 & 105;
                        int i417 = (i416 - (~(-(-((i415 ^ 105) | i416))))) - 1;
                        a = i417 % 128;
                        int i418 = i417 % 2;
                        iV = r.v(iF2, s.e, fMin);
                        if (fMin > 0.0f) {
                            int i419 = b;
                            i3 = ((i419 ^ 108) + ((i419 & 108) << 1)) - 1;
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i510 = s.f;
                                obj.hashCode();
                                throw null;
                            }
                            i4 = s.f;
                            if (i4 != 0) {
                                int i511 = b;
                                int i512 = i511 & 55;
                                int i513 = ((i511 ^ 55) | i512) << 1;
                                int i514 = -((i511 | 55) & (~i512));
                                i5 = ((i513 | i514) << 1) - (i514 ^ i513);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                                    obj.hashCode();
                                    throw null;
                                }
                                iV = ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                                int i515 = b;
                                int i516 = (((i515 & (-2)) | ((~i515) & 1)) - (~((i515 & 1) << 1))) - 1;
                                int i517 = i516 % 128;
                                a = i517;
                                int i518 = i516 % 2;
                                int i519 = (((i517 & (-88)) | ((~i517) & 87)) - (~(-(-((i517 & 87) << 1))))) - 1;
                                b = i519 % 128;
                                int i64 = i519 % 2;
                            }
                        }
                        i = ivas.gov.bisp.enumeration.p007ag.j.f(iV, iAlpha2);
                        int i65 = b;
                        int i66 = (((i65 & (-16)) | ((~i65) & 15)) - (~(-(-((i65 & 15) << 1))))) - 1;
                        a = i66 % 128;
                        int i67 = i66 % 2;
                    }
                    int i68 = a;
                    int i69 = i68 & 107;
                    int i70 = (i69 - (~(-(-((i68 ^ 107) | i69))))) - 1;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    fMin = 0.0f;
                    int iAlpha3 = Color.alpha(i);
                    int iF3 = ivas.gov.bisp.enumeration.p007ag.j.f(i, 255);
                    int i4110 = b;
                    int i4111 = i4110 & 105;
                    int i4112 = (i4111 - (~(-(-((i4110 ^ 105) | i4111))))) - 1;
                    a = i4112 % 128;
                    int i4113 = i4112 % 2;
                    iV = r.v(iF3, s.e, fMin);
                    if (fMin > 0.0f) {
                        int i4114 = b;
                        i3 = ((i4114 ^ 108) + ((i4114 & 108) << 1)) - 1;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i5110 = s.f;
                            obj.hashCode();
                            throw null;
                        }
                        i4 = s.f;
                        if (i4 != 0) {
                            int i5111 = b;
                            int i5112 = i5111 & 55;
                            int i5113 = ((i5111 ^ 55) | i5112) << 1;
                            int i5114 = -((i5111 | 55) & (~i5112));
                            i5 = ((i5113 | i5114) << 1) - (i5114 ^ i5113);
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                                obj.hashCode();
                                throw null;
                            }
                            iV = ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i4, S.c), iV);
                            int i5115 = b;
                            int i5116 = (((i5115 & (-2)) | ((~i5115) & 1)) - (~((i5115 & 1) << 1))) - 1;
                            int i5117 = i5116 % 128;
                            a = i5117;
                            int i5118 = i5116 % 2;
                            int i5119 = (((i5117 & (-88)) | ((~i5117) & 87)) - (~(-(-((i5117 & 87) << 1))))) - 1;
                            b = i5119 % 128;
                            int i610 = i5119 % 2;
                        }
                    }
                    i = ivas.gov.bisp.enumeration.p007ag.j.f(iV, iAlpha3);
                    int i611 = b;
                    int i612 = (((i611 & (-16)) | ((~i611) & 15)) - (~(-(-((i611 & 15) << 1))))) - 1;
                    a = i612 % 128;
                    int i613 = i612 % 2;
                }
            }
        }
        int i72 = b + 115;
        a = i72 % 128;
        if (i72 % 2 == 0) {
            return i;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x045a  */
    /* JADX WARN: Code duplicated, block: B:103:0x047e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0489  */
    /* JADX WARN: Code duplicated, block: B:112:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0536  */
    /* JADX WARN: Code duplicated, block: B:122:0x0541  */
    /* JADX WARN: Code duplicated, block: B:125:0x0546  */
    /* JADX WARN: Code duplicated, block: B:132:0x0592  */
    /* JADX WARN: Code duplicated, block: B:133:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:139:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:142:0x05fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:143:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ac A[PHI: r1
  0x02ac: PHI (r1v118 int) = (r1v117 int), (r1v125 int) binds: [B:60:0x02aa, B:57:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x03bf A[DONT_INVERT, PHI: r1
  0x03bf: PHI (r1v96 int) = (r1v95 int), (r1v108 int) binds: [B:90:0x03bd, B:87:0x03b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0449  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0548, code lost:
    
        if (r1 == android.graphics.Paint.Style.FILL) goto L127;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.C0019p.draw(android.graphics.Canvas):void");
    }
}
