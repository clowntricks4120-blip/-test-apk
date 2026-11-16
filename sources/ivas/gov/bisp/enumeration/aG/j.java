package ivas.gov.bisp.enumeration.aG;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 1;
    private static int b;
    public PorterDuff.Mode c;
    public final MaterialButton d;
    public t e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable p;
    public LayerDrawable s;
    public boolean t;
    public int u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f59o = false;
    public boolean q = false;
    public boolean r = false;

    public j(MaterialButton materialButton, t tVar) {
        this.d = materialButton;
        this.e = tVar;
    }

    public C0019p d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i2 ^ 113) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        C0019p c0019pE = e(false);
        int i7 = a;
        int i8 = i7 & 77;
        int i9 = (i7 ^ 77) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return c0019pE;
    }

    public final C0019p e(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 93) - (~(i2 | 93))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        LayerDrawable layerDrawable = this.s;
        Object obj = null;
        if (layerDrawable != null) {
            int i5 = i2 & 7;
            int i6 = (i2 | 7) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (layerDrawable.getNumberOfLayers() > 0) {
                int i10 = a;
                int i11 = i10 & 75;
                int i12 = ((i10 | 75) & (~i11)) + (i11 << 1);
                b = i12 % 128;
                C0019p c0019p = (C0019p) ((LayerDrawable) ((InsetDrawable) (i12 % 2 != 0 ? this.s.getDrawable(0) : this.s.getDrawable(0))).getDrawable()).getDrawable(((~(z ? 1 : 0)) & 1) | ((z ? 1 : 0) & (-2)));
                int i13 = a + 77;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    return c0019p;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i14 = a + 11;
        b = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    public final C0019p f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 93) << 1;
        int i4 = -(((~i2) & 93) | (i2 & (-94)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        C0019p c0019pE = i5 % 2 == 0 ? e(false) : e(true);
        int i6 = b;
        int i7 = (((i6 & (-52)) | ((~i6) & 51)) - (~((i6 & 51) << 1))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 95 / 0;
        }
        return c0019pE;
    }

    public o c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null) {
            int i5 = (i2 | 75) << 1;
            int i6 = -(((~i2) & 75) | (i2 & (-76)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0 ? layerDrawable.getNumberOfLayers() > 1 : layerDrawable.getNumberOfLayers() > 0) {
                int i8 = a;
                int i9 = ((i8 | 27) << 1) - (i8 ^ 27);
                b = i9 % 128;
                if (i9 % 2 == 0 ? this.s.getNumberOfLayers() > 2 : this.s.getNumberOfLayers() > 2) {
                    o oVar = (o) this.s.getDrawable(2);
                    int i10 = a;
                    int i11 = (((i10 | 42) << 1) - (i10 ^ 42)) - 1;
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        return oVar;
                    }
                    throw null;
                }
                o oVar2 = (o) this.s.getDrawable(1);
                int i12 = a;
                int i13 = i12 ^ 109;
                int i14 = ((i12 & 109) | i13) << 1;
                int i15 = -i13;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                b = i16 % 128;
                int i17 = i16 % 2;
                return oVar2;
            }
        }
        int i18 = a;
        int i19 = (i18 | 11) << 1;
        int i20 = -(((~i18) & 11) | (i18 & (-12)));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public void h(t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.e = tVar;
            d();
            throw null;
        }
        this.e = tVar;
        if (d() != null) {
            int i4 = a;
            int i5 = (i4 ^ 107) + ((i4 & 107) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                d().e.d = tVar;
                obj.hashCode();
                throw null;
            }
            C0019p c0019pD = d();
            c0019pD.e.d = tVar;
            c0019pD.invalidateSelf();
            int i6 = b + 15;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 2;
            }
        }
        if (f() != null) {
            int i8 = b;
            int i9 = (i8 ^ 1) + ((i8 & 1) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                f().e.d = tVar;
                obj.hashCode();
                throw null;
            }
            C0019p c0019pF = f();
            c0019pF.e.d = tVar;
            c0019pF.invalidateSelf();
            int i10 = a;
            int i11 = (i10 | 101) << 1;
            int i12 = -(((~i10) & 101) | (i10 & (-102)));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 5;
            }
        }
        if (c() != null) {
            int i15 = b;
            int i16 = ((i15 ^ 123) | (i15 & 123)) << 1;
            int i17 = -(((~i15) & 123) | (i15 & (-124)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            c().setShapeAppearanceModel(tVar);
            int i20 = b;
            int i21 = i20 & 83;
            int i22 = (i20 | 83) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = (i26 & (-24)) | ((~i26) & 23);
        int i28 = -(-((i26 & 23) << 1));
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    public final void j() {
        int iU;
        int i = 2 % 2;
        int i2 = a + 13;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            d();
            f();
            throw null;
        }
        C0019p c0019pD = d();
        C0019p c0019pF = f();
        if (c0019pD != null) {
            c0019pD.y(this.k, this.m);
            int i3 = b;
            int i4 = (i3 ^ 35) + ((i3 & 35) << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (c0019pF != null) {
                int i7 = (((i5 | 46) << 1) - (i5 ^ 46)) - 1;
                int i8 = i7 % 128;
                b = i8;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                float f = this.k;
                if (this.f59o) {
                    int i9 = i5 + 46;
                    int i10 = (i9 ^ (-1)) + (i9 << 1);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    iU = r.u(this.d, R.attr.colorSurface);
                    int i12 = a;
                    int i13 = i12 & 5;
                    int i14 = ((i12 | 5) & (~i13)) + (i13 << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = (-2) - ((((i8 | 100) << 1) - (i8 ^ 100)) ^ (-1));
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    iU = 0;
                }
                c0019pF.v(f, iU);
                int i18 = b;
                int i19 = i18 & 15;
                int i20 = (((i18 ^ 15) | i19) << 1) - ((i18 | 15) & (~i19));
                a = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        int i22 = a;
        int i23 = (i22 & (-20)) | ((~i22) & 19);
        int i24 = (i22 & 19) << 1;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
    }

    public final void g(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 95;
        int i7 = -(-((i5 ^ 95) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            MaterialButton materialButton = this.d;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWY.g(materialButton);
            obj.hashCode();
            throw null;
        }
        MaterialButton materialButton2 = this.d;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
        int iG = T.aWY.g(materialButton2);
        int paddingTop = this.d.getPaddingTop();
        int iH = T.aWY.h(this.d);
        int i9 = a;
        int i10 = (i9 & 103) + (i9 | 103);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            this.d.getPaddingBottom();
            throw null;
        }
        int paddingBottom = this.d.getPaddingBottom();
        int i11 = this.i;
        int i12 = a;
        int i13 = i12 & 51;
        int i14 = (i12 ^ 51) | i13;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            i3 = this.h;
            this.h = i2;
            int i16 = 50 / 0;
        } else {
            i3 = this.h;
            this.h = i2;
        }
        this.i = i;
        if (!this.q) {
            int i17 = i12 & 65;
            int i18 = (((i12 | 65) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                i();
                obj.hashCode();
                throw null;
            }
            i();
        }
        MaterialButton materialButton3 = this.d;
        int i19 = (paddingTop - (~(-(~i)))) - 2;
        int i20 = -i11;
        int i21 = ((i19 & i20) - (~(i20 | i19))) - 1;
        int i22 = a + 73;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            T.aWY.l(materialButton3, iG, i21, iH, (paddingBottom >>> i2) >>> i3);
        } else {
            int i23 = ((~i2) & paddingBottom) | ((~paddingBottom) & i2);
            int i24 = (i2 & paddingBottom) << 1;
            int i25 = (i23 & i24) + (i23 | i24);
            int i26 = -i3;
            T.aWY.l(materialButton3, iG, i21, iH, (((~i26) & i25) | ((~i25) & i26)) + ((i26 & i25) << 1));
        }
        int i27 = a + 42;
        int i28 = (i27 ^ (-1)) + (i27 << 1);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 64 / 0;
        }
    }

    public final void i() {
        PorterDuff.Mode mode;
        int iU;
        Drawable[] drawableArr;
        int i = 2 % 2;
        MaterialButton materialButton = this.d;
        C0019p c0019p = new C0019p(this.e);
        int i2 = b + 71;
        a = i2 % 128;
        int i3 = i2 % 2;
        c0019p.r(this.d.getContext());
        int i4 = b + 35;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            c0019p.setTintList(this.l);
            mode = this.c;
            int i5 = 71 / 0;
        } else {
            c0019p.setTintList(this.l);
            mode = this.c;
        }
        Object obj = null;
        if (mode != null) {
            int i6 = b;
            int i7 = i6 & 33;
            int i8 = i7 + ((i6 ^ 33) | i7);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                c0019p.setTintMode(mode);
                obj.hashCode();
                throw null;
            }
            c0019p.setTintMode(mode);
            int i9 = b;
            int i10 = i9 & 5;
            int i11 = ((i9 ^ 5) | i10) << 1;
            int i12 = -((i9 | 5) & (~i10));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        c0019p.y(this.k, this.m);
        C0019p c0019p2 = new C0019p(this.e);
        int i15 = a;
        int i16 = i15 & 91;
        int i17 = i16 + ((i15 ^ 91) | i16);
        b = i17 % 128;
        int i18 = i17 % 2;
        c0019p2.setTint(0);
        int i19 = this.k;
        int i20 = b;
        int i21 = i20 & 65;
        int i22 = -(-((i20 ^ 65) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        int i24 = i23 % 128;
        a = i24;
        if (i23 % 2 == 0) {
            throw null;
        }
        float f = i19;
        if (!this.f59o) {
            int i25 = i24 ^ 77;
            int i26 = ((i24 & 77) | i25) << 1;
            int i27 = -i25;
            int i28 = (i26 & i27) + (i26 | i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            iU = 0;
        } else {
            iU = r.u(this.d, R.attr.colorSurface);
            int i30 = a;
            int i31 = (i30 & (-44)) | ((~i30) & 43);
            int i32 = -(-((i30 & 43) << 1));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        c0019p2.v(f, iU);
        C0019p c0019p3 = new C0019p(this.e);
        int i35 = b;
        int i36 = i35 & 11;
        int i37 = i36 + ((i35 ^ 11) | i36);
        a = i37 % 128;
        int i38 = i37 % 2;
        this.p = c0019p3;
        c0019p3.setTint(-1);
        ColorStateList colorStateListC = ivas.gov.bisp.enumeration.p041bn.j.c(this.n);
        int i39 = b;
        int i40 = i39 & 117;
        int i41 = (i39 ^ 117) | i40;
        int i42 = (i40 & i41) + (i41 | i40);
        a = i42 % 128;
        if (i42 % 2 == 0) {
            drawableArr = new Drawable[5];
            drawableArr[1] = c0019p2;
            drawableArr[0] = c0019p;
        } else {
            drawableArr = new Drawable[]{c0019p2, c0019p};
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListC, new InsetDrawable((Drawable) new LayerDrawable(drawableArr), this.f, this.i, this.g, this.h), this.p);
        int i43 = a;
        int i44 = ((i43 ^ 44) + ((i43 & 44) << 1)) - 1;
        b = i44 % 128;
        if (i44 % 2 != 0) {
            this.s = rippleDrawable;
            materialButton.setInternalBackground(rippleDrawable);
            d();
            obj.hashCode();
            throw null;
        }
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0019p c0019pD = d();
        if (c0019pD != null) {
            int i45 = a;
            int i46 = i45 & 27;
            int i47 = -(-((i45 ^ 27) | i46));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            b = i48 % 128;
            int i49 = i48 % 2;
            c0019pD.s(this.u);
            int i50 = b;
            int i51 = i50 & 15;
            int i52 = (i50 | 15) & (~i51);
            int i53 = i51 << 1;
            int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
            a = i54 % 128;
            int i55 = i54 % 2;
        }
        int i56 = a;
        int i57 = ((i56 | 13) << 1) - (i56 ^ 13);
        b = i57 % 128;
        if (i57 % 2 != 0) {
            throw null;
        }
    }
}
