package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.P.t;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.aL.r;
import ivas.gov.bisp.enumeration.aR.m;
import ivas.gov.bisp.enumeration.p008ah.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class j extends C0019p implements Drawable.Callback, t.aNV {
    public static final int[] a = {R.attr.state_enabled};
    public static final ShapeDrawable b = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public ColorStateList B;
    public float C;
    public float D;
    public ColorStateList E;
    public float F;
    public ColorStateList G;
    public Drawable H;
    public ColorStateList I;
    public CharSequence J;
    public boolean K;
    public ColorStateList L;
    public float M;
    public boolean N;
    public boolean O;
    public Drawable P;
    public Drawable Q;
    public boolean R;
    public CharSequence S;
    public float T;
    public boolean U;
    public Drawable V;
    public C0026p W;
    public C0026p X;
    public float Y;
    public float Z;
    public PorterDuffColorFilter aA;
    public ColorStateList aB;
    public final PointF aC;
    public int aD;
    public int aE;
    public ColorFilter aF;
    public int aG;
    public int[] aH;
    public final Path aI;
    public float aa;
    public float ab;
    public float ac;
    public float ad;
    public float ae;
    public float af;
    public final Paint ag;
    public final Context ah;
    public final Paint.FontMetrics ai;
    public final RectF aj;
    public int ak;
    public WeakReference<aNX> al;
    public TextUtils.TruncateAt am;
    public boolean an;
    public boolean ao;
    public ColorStateList ap;
    public ColorStateList aq;
    public final t ar;
    public int as;
    public int at;
    public int au;
    public boolean av;
    public int aw;
    public int ax;
    public boolean ay;
    public PorterDuff.Mode az;

    public interface aNX {
        void b();
    }

    public j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(ivas.gov.bisp.enumeration.O.t.e(context, attributeSet, i, i2).e());
        this.C = -1.0f;
        this.ag = new Paint(1);
        this.ai = new Paint.FontMetrics();
        this.aj = new RectF();
        this.aC = new PointF();
        this.aI = new Path();
        this.aE = 255;
        this.az = PorterDuff.Mode.SRC_IN;
        this.al = new WeakReference<>(null);
        this.e.e = new S(context);
        w();
        this.ah = context;
        t tVar = new t(this);
        this.ar = tVar;
        this.J = BuildConfig.FLAVOR;
        tVar.c.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        ae(iArr);
        this.an = true;
        b.setTint(-1);
    }

    public static boolean c(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean d(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ax() || aw()) {
            float f = this.Y + this.Z;
            float fK = K();
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fK;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fK;
            }
            Drawable drawable = this.av ? this.V : this.H;
            float fCeil = this.M;
            if (fCeil <= 0.0f && drawable != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.ah.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final void C(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(this.aH);
            }
            drawable.setTintList(this.G);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.O) {
            drawable2.setTintList(this.L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float D() {
        if (!ax() && !aw()) {
            return 0.0f;
        }
        return K() + this.Z + this.aa;
    }

    public final void E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ay()) {
            float f = this.af + this.ae + this.T + this.ad + this.ac;
            if (getLayoutDirection() == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                float f3 = rect.left;
                rectF.left = f3;
                rectF.right = f3 + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public final void F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ay()) {
            float f = this.af + this.ae;
            if (getLayoutDirection() == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.T;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.T;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.T;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public float G() {
        if (ay()) {
            return this.ad + this.T + this.ae;
        }
        return 0.0f;
    }

    public float H() {
        return this.ao ? q() : this.C;
    }

    public void I(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable J() {
        Drawable drawable = this.P;
        if (drawable != 0) {
            return drawable instanceof c ? ((c) drawable).b() : drawable;
        }
        return null;
    }

    public final float K() {
        Drawable drawable = this.av ? this.V : this.H;
        float f = this.M;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void L() {
        aNX anx = this.al.get();
        if (anx != null) {
            anx.b();
        }
    }

    public final boolean M(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.A;
        int iJ = j(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.as) : 0);
        boolean state = true;
        if (this.as != iJ) {
            this.as = iJ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.B;
        int iJ2 = j(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.at) : 0);
        if (this.at != iJ2) {
            this.at = iJ2;
            zOnStateChange = true;
        }
        int iC = ivas.gov.bisp.enumeration.p007ag.j.c(iJ2, iJ);
        if ((this.au != iC) | (this.e.g == null)) {
            this.au = iC;
            u(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.E;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ax) : 0;
        if (this.ax != colorForState) {
            this.ax = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.ap == null || !ivas.gov.bisp.enumeration.p041bn.j.d(iArr)) ? 0 : this.ap.getColorForState(iArr, this.aG);
        if (this.aG != colorForState2) {
            this.aG = colorForState2;
            if (this.ay) {
                zOnStateChange = true;
            }
        }
        r rVar = this.ar.g;
        int colorForState3 = (rVar == null || (colorStateList = rVar.l) == null) ? 0 : colorStateList.getColorForState(iArr, this.aw);
        if (this.aw != colorForState3) {
            this.aw = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.U) {
                    z = true;
                    break;
                }
            }
            z = false;
            break;
        }
        if (this.av == z || this.V == null) {
            z2 = false;
        } else {
            float fD = D();
            this.av = z;
            if (fD != D()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.aB;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.aD) : 0;
        if (this.aD != colorForState4) {
            this.aD = colorForState4;
            this.aA = m.b(this, this.aB, this.az);
        } else {
            state = zOnStateChange;
        }
        if (c(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (c(this.V)) {
            state |= this.V.setState(iArr);
        }
        if (c(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.P.setState(iArr3);
        }
        if (c(this.Q)) {
            state |= this.Q.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            L();
        }
        return state;
    }

    public void N(Drawable drawable) {
        if (this.V != drawable) {
            float fD = D();
            this.V = drawable;
            float fD2 = D();
            aD(this.V);
            C(this.V);
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void O(boolean z) {
        if (this.U != z) {
            this.U = z;
            float fD = D();
            if (!z && this.av) {
                this.av = false;
            }
            float fD2 = D();
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void P(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.aq != colorStateList) {
            this.aq = colorStateList;
            if (this.R && (drawable = this.V) != null && this.U) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Q(boolean z) {
        if (this.R != z) {
            boolean zAw = aw();
            this.R = z;
            boolean zAw2 = aw();
            if (zAw != zAw2) {
                if (zAw2) {
                    C(this.V);
                } else {
                    aD(this.V);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void R(float f) {
        if (this.M != f) {
            float fD = D();
            this.M = f;
            float fD2 = D();
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void S(float f) {
        if (this.af != f) {
            this.af = f;
            invalidateSelf();
            L();
        }
    }

    @Deprecated
    public void T(float f) {
        if (this.C != f) {
            this.C = f;
            this.e.d = this.e.d.h(f);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.Drawable, com.google.android.material.chip.j] */
    public void U(Drawable drawable) {
        ?? B;
        Object obj = this.H;
        if (obj == null) {
            B = 0;
        } else if (obj instanceof c) {
            B = obj;
            B = ((c) obj).b();
        }
        if (B != drawable) {
            float fD = D();
            this.H = drawable != null ? drawable.mutate() : null;
            float fD2 = D();
            aD(B);
            if (ax()) {
                C(this.H);
            }
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void V(ColorStateList colorStateList) {
        this.O = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (ax()) {
                this.H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void W(float f) {
        if (this.D != f) {
            this.D = f;
            invalidateSelf();
            L();
        }
    }

    public void X(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            L();
        }
    }

    public void Y(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.ao) {
                x(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Z(float f) {
        if (this.F != f) {
            this.F = f;
            this.ag.setStrokeWidth(f);
            if (this.ao) {
                this.e.n = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void aD(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void aE(float f) {
        if (this.ac != f) {
            this.ac = f;
            invalidateSelf();
            L();
        }
    }

    public void aa(Drawable drawable) {
        Drawable drawableJ = J();
        if (drawableJ != drawable) {
            float fG = G();
            this.P = drawable != null ? drawable.mutate() : null;
            int[] iArr = ivas.gov.bisp.enumeration.p041bn.j.c;
            this.Q = new RippleDrawable(ivas.gov.bisp.enumeration.p041bn.j.c(this.I), this.P, b);
            float fG2 = G();
            aD(drawableJ);
            if (ay()) {
                C(this.P);
            }
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public void ab(float f) {
        if (this.ae != f) {
            this.ae = f;
            invalidateSelf();
            if (ay()) {
                L();
            }
        }
    }

    public void ac(float f) {
        if (this.T != f) {
            this.T = f;
            invalidateSelf();
            if (ay()) {
                L();
            }
        }
    }

    public void ad(float f) {
        if (this.ad != f) {
            this.ad = f;
            invalidateSelf();
            if (ay()) {
                L();
            }
        }
    }

    public boolean ae(int[] iArr) {
        if (Arrays.equals(this.aH, iArr)) {
            return false;
        }
        this.aH = iArr;
        if (ay()) {
            return M(getState(), iArr);
        }
        return false;
    }

    public void af(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (ay()) {
                this.P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void ag(float f) {
        if (this.aa != f) {
            float fD = D();
            this.aa = f;
            float fD2 = D();
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void ah(boolean z) {
        if (this.N != z) {
            boolean zAy = ay();
            this.N = z;
            boolean zAy2 = ay();
            if (zAy != zAy2) {
                if (zAy2) {
                    C(this.P);
                } else {
                    aD(this.P);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void ai(float f) {
        if (this.Z != f) {
            float fD = D();
            this.Z = f;
            float fD2 = D();
            invalidateSelf();
            if (fD != fD2) {
                L();
            }
        }
    }

    public void aj(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            this.ap = this.ay ? ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void at(boolean z) {
        if (this.K != z) {
            boolean zAx = ax();
            this.K = z;
            boolean zAx2 = ax();
            if (zAx != zAx2) {
                if (zAx2) {
                    C(this.H);
                } else {
                    aD(this.H);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void au(float f) {
        if (this.ab != f) {
            this.ab = f;
            invalidateSelf();
            L();
        }
    }

    public void av(boolean z) {
        if (this.ay != z) {
            this.ay = z;
            this.ap = z ? ivas.gov.bisp.enumeration.p041bn.j.c(this.I) : null;
            onStateChange(getState());
        }
    }

    public final boolean aw() {
        return this.R && this.V != null && this.av;
    }

    public final boolean ax() {
        return this.K && this.H != null;
    }

    public final boolean ay() {
        return this.N && this.P != null;
    }

    public void az(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.J, charSequence)) {
            return;
        }
        this.J = charSequence;
        this.ar.f = true;
        invalidateSelf();
        L();
    }

    @Override // ivas.gov.bisp.enumeration.P.t.aNV
    public void b() {
        L();
        invalidateSelf();
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.aE) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        if (!this.ao) {
            this.ag.setColor(this.as);
            this.ag.setStyle(Paint.Style.FILL);
            this.aj.set(bounds);
            canvas.drawRoundRect(this.aj, H(), H(), this.ag);
        }
        if (!this.ao) {
            this.ag.setColor(this.at);
            this.ag.setStyle(Paint.Style.FILL);
            Paint paint = this.ag;
            ColorFilter colorFilter = this.aF;
            if (colorFilter == null) {
                colorFilter = this.aA;
            }
            paint.setColorFilter(colorFilter);
            this.aj.set(bounds);
            canvas.drawRoundRect(this.aj, H(), H(), this.ag);
        }
        if (this.ao) {
            super.draw(canvas);
        }
        if (this.F > 0.0f && !this.ao) {
            this.ag.setColor(this.ax);
            this.ag.setStyle(Paint.Style.STROKE);
            if (!this.ao) {
                Paint paint2 = this.ag;
                ColorFilter colorFilter2 = this.aF;
                if (colorFilter2 == null) {
                    colorFilter2 = this.aA;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.aj;
            float f = bounds.left;
            float f2 = this.F / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.C - (this.F / 2.0f);
            canvas.drawRoundRect(this.aj, f3, f3, this.ag);
        }
        this.ag.setColor(this.aG);
        this.ag.setStyle(Paint.Style.FILL);
        this.aj.set(bounds);
        if (this.ao) {
            g(new RectF(bounds), this.aI);
            k(canvas, this.ag, this.aI, this.e.d, e());
        } else {
            canvas.drawRoundRect(this.aj, H(), H(), this.ag);
        }
        if (ax()) {
            B(bounds, this.aj);
            RectF rectF2 = this.aj;
            float f4 = rectF2.left;
            float f5 = rectF2.top;
            canvas.translate(f4, f5);
            this.H.setBounds(0, 0, (int) this.aj.width(), (int) this.aj.height());
            this.H.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (aw()) {
            B(bounds, this.aj);
            RectF rectF3 = this.aj;
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.V.setBounds(0, 0, (int) this.aj.width(), (int) this.aj.height());
            this.V.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.an || this.J == null) {
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.aC;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.J != null) {
                float fD = D() + this.Y + this.ab;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fD;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fD;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                this.ar.c.getFontMetrics(this.ai);
                Paint.FontMetrics fontMetrics = this.ai;
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.aj;
            rectF4.setEmpty();
            if (this.J != null) {
                float fD2 = D() + this.Y + this.ab;
                float fG = G() + this.af + this.ac;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fD2;
                    rectF4.right = bounds.right - fG;
                } else {
                    rectF4.left = bounds.left + fG;
                    rectF4.right = bounds.right - fD2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            t tVar = this.ar;
            if (tVar.g != null) {
                tVar.c.drawableState = getState();
                t tVar2 = this.ar;
                tVar2.g.h(this.ah, tVar2.c, tVar2.d);
            }
            this.ar.c.setTextAlign(align);
            boolean z = Math.round(this.ar.c(this.J.toString())) > Math.round(this.aj.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.aj);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.J;
            if (z && this.am != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.ar.c, this.aj.width(), this.am);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF2 = this.aC;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.ar.c);
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
        if (ay()) {
            F(bounds, this.aj);
            RectF rectF5 = this.aj;
            float f8 = rectF5.left;
            float f9 = rectF5.top;
            canvas.translate(f8, f9);
            this.P.setBounds(i3, i3, (int) this.aj.width(), (int) this.aj.height());
            int[] iArr = ivas.gov.bisp.enumeration.p041bn.j.c;
            this.Q.setBounds(this.P.getBounds());
            this.Q.jumpToCurrentState();
            this.Q.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (this.aE < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.aE;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.aF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f = this.Y;
        float fD = D();
        float f2 = this.ab;
        float fC = this.ar.c(this.J.toString());
        float f3 = this.ac;
        return Math.min(Math.round(G() + fC + fD + f + f2 + f3 + this.af), this.ak);
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    @TargetApi(IMediaSession.Stub.TRANSACTION_previous)
    public void getOutline(Outline outline) {
        if (this.ao) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(this.aE / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public boolean isStateful() {
        r rVar;
        ColorStateList colorStateList;
        return d(this.A) || d(this.B) || d(this.E) || (this.ay && d(this.ap)) || (!((rVar = this.ar.g) == null || (colorStateList = rVar.l) == null || !colorStateList.isStateful()) || ((this.R && this.V != null && this.U) || c(this.H) || c(this.V) || d(this.aB)));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ax()) {
            zOnLayoutDirectionChanged |= this.H.setLayoutDirection(i);
        }
        if (aw()) {
            zOnLayoutDirectionChanged |= this.V.setLayoutDirection(i);
        }
        if (ay()) {
            zOnLayoutDirectionChanged |= this.P.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (ax()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (aw()) {
            zOnLevelChange |= this.V.setLevel(i);
        }
        if (ay()) {
            zOnLevelChange |= this.P.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable, ivas.gov.bisp.enumeration.P.t.aNV
    public boolean onStateChange(int[] iArr) {
        if (this.ao) {
            super.onStateChange(iArr);
        }
        return M(iArr, this.aH);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.aE != i) {
            this.aE = i;
            invalidateSelf();
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.aF != colorFilter) {
            this.aF = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.aB != colorStateList) {
            this.aB = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.az != mode) {
            this.az = mode;
            this.aA = m.b(this, this.aB, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ax()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (aw()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (ay()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
