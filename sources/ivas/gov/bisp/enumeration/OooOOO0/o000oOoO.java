package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ae;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.o;
import ivas.gov.bisp.enumeration.p088k.r;

/* JADX INFO: loaded from: classes.dex */
public class o000oOoO extends ImageView {
    private static int a = 1;
    private static int b;
    public final r c;
    public final o d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        this.e = false;
        ad.b(this, getContext());
        r rVar = new r(this);
        this.c = rVar;
        rVar.g(attributeSet, i);
        o oVar = new o(this);
        this.d = oVar;
        oVar.d(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 33;
        int i5 = (((i3 | 33) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            super.setBackgroundResource(i);
            throw null;
        }
        super.setBackgroundResource(i);
        r rVar = this.c;
        if (rVar != null) {
            int i6 = b;
            int i7 = (((i6 | 101) << 1) - (~(-(i6 ^ 101)))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            rVar.h(i);
            int i9 = b;
            int i10 = i9 & 89;
            int i11 = (i9 | 89) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = (-2) - ((((i15 | 124) << 1) - (i15 ^ 124)) ^ (-1));
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (i2 | 55) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        o oVar = this.d;
        Object obj = null;
        if (oVar != null) {
            int i9 = i7 & 19;
            int i10 = (i7 ^ 19) | i9;
            int i11 = (i9 & i10) + (i10 | i9);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            if (drawable != null) {
                int i14 = i12 & 45;
                int i15 = -(-((i12 ^ 45) | i14));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                int i17 = i16 % 128;
                a = i17;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!this.e) {
                    int i18 = i17 & 31;
                    int i19 = (i18 - (~(-(-((i17 ^ 31) | i18))))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    oVar.e = drawable.getLevel();
                    int i21 = a;
                    int i22 = (i21 & 7) + (i21 | 7);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.d;
        if (oVar2 != null) {
            int i24 = a;
            int i25 = i24 & 117;
            int i26 = (i25 - (~((i24 ^ 117) | i25))) - 1;
            b = i26 % 128;
            if (i26 % 2 != 0) {
                oVar2.c();
                throw null;
            }
            oVar2.c();
            if (!this.e) {
                o oVar3 = this.d;
                if (oVar3.c.getDrawable() != null) {
                    int i27 = a;
                    int i28 = ((i27 | 13) << 1) - (i27 ^ 13);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    oVar3.c.getDrawable().setLevel(oVar3.e);
                    int i30 = a;
                    int i31 = i30 | 19;
                    int i32 = i31 << 1;
                    int i33 = -((~(i30 & 19)) & i31);
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
        }
        int i36 = b;
        int i37 = i36 & 117;
        int i38 = -(-((i36 ^ 117) | i37));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        a = i39 % 128;
        if (i39 % 2 == 0) {
            int i40 = 34 / 0;
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 78) + ((i3 & 78) << 1)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        super.setImageLevel(i);
        this.e = true;
        int i6 = b;
        int i7 = ((i6 & 86) + (i6 | 86)) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        int i2 = 2 % 2;
        int i3 = a + 41;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        o oVar = this.d;
        if (oVar != null) {
            int i6 = i4 + 35;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                oVar.e(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            oVar.e(i);
            int i7 = a;
            int i8 = ((i7 & (-112)) | ((~i7) & 111)) + ((i7 & 111) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = i10 & 89;
        int i12 = -(-((i10 ^ 89) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 41 / 0;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = i2 | 93;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i8 = ((i6 | 37) << 1) - (i6 ^ 37);
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.k(colorStateList);
            int i10 = b + 97;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b + 63;
        a = i12 % 128;
        int i13 = i12 % 2;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        o oVar = this.d;
        if (oVar != null) {
            oVar.g(mode);
            int i5 = b;
            int i6 = ((i5 | 57) << 1) - (i5 ^ 57);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b;
        int i9 = i8 & 53;
        int i10 = (i9 - (~(-(-((i8 ^ 53) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = i3 + ((i2 ^ 69) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            int i6 = a;
            int i7 = i6 & 11;
            int i8 = -(-((i6 ^ 11) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            rVar.d();
            int i11 = a;
            int i12 = (-2) - (((i11 & 18) + (i11 | 18)) ^ (-1));
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        o oVar = this.d;
        Object obj = null;
        if (oVar != null) {
            int i14 = b;
            int i15 = i14 & 55;
            int i16 = (i14 ^ 55) | i15;
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                oVar.c();
                obj.hashCode();
                throw null;
            }
            oVar.c();
        }
        int i18 = a;
        int i19 = (((i18 | 41) << 1) - (~(-(i18 ^ 41)))) - 1;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = ((~i3) & (i2 | 3)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r rVar = this.c;
        if (rVar != null) {
            int i6 = (i2 ^ 97) + ((i2 & 97) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                rVar.e();
                obj.hashCode();
                throw null;
            }
            colorStateListE = rVar.e();
        } else {
            int i7 = i5 + 107;
            a = i7 % 128;
            int i8 = i7 % 2;
            colorStateListE = null;
        }
        int i9 = a;
        int i10 = (i9 & (-6)) | ((~i9) & 5);
        int i11 = (i9 & 5) << 1;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return colorStateListE;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r2
  0x0026: PHI (r2v6 ivas.gov.bisp.enumeration.k.r) = (r2v5 ivas.gov.bisp.enumeration.k.r), (r2v13 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x0024, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 11;
        int i5 = (((i3 ^ 11) | i4) << 1) - ((i3 | 11) & (~i4));
        int i6 = i5 % 128;
        b = i6;
        PorterDuff.Mode modeF = null;
        if (i5 % 2 != 0) {
            rVar = this.c;
            int i7 = 26 / 0;
            if (rVar != null) {
                int i8 = i6 & 111;
                int i9 = (i6 | 111) & (~i8);
                int i10 = -(-(i8 << 1));
                i = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    rVar.f();
                    throw null;
                }
                modeF = rVar.f();
            } else {
                int i11 = i6 & 1;
                int i12 = ((i6 ^ 1) | i11) << 1;
                int i13 = -((i6 | 1) & (~i11));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            rVar = this.c;
            if (rVar != null) {
                int i16 = i6 & 111;
                int i17 = (i6 | 111) & (~i16);
                int i18 = -(-(i16 << 1));
                i = (i17 ^ i18) + ((i17 & i18) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    rVar.f();
                    throw null;
                }
                modeF = rVar.f();
            } else {
                int i19 = i6 & 1;
                int i110 = ((i6 ^ 1) | i19) << 1;
                int i111 = -((i6 | 1) & (~i19));
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                a = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i20 = a;
        int i21 = i20 & 115;
        int i22 = ((i20 | 115) & (~i21)) + (i21 << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        return modeF;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[PHI: r1
  0x002a: PHI (r1v14 ivas.gov.bisp.enumeration.k.ae) = (r1v13 ivas.gov.bisp.enumeration.k.ae), (r1v16 ivas.gov.bisp.enumeration.k.ae) binds: [B:10:0x0028, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    public ColorStateList getSupportImageTintList() {
        ColorStateList colorStateList;
        ae aeVar;
        int i = 2 % 2;
        int i2 = a + 115;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        o oVar = this.d;
        if (oVar != null) {
            int i5 = (-2) - ((i3 + 118) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                aeVar = oVar.d;
                int i6 = 60 / 0;
                if (aeVar != null) {
                    int i7 = a;
                    int i8 = ((i7 ^ 19) | (i7 & 19)) << 1;
                    int i9 = -(((~i7) & 19) | (i7 & (-20)));
                    int i10 = (i8 & i9) + (i9 | i8);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    colorStateList = aeVar.a;
                    int i12 = b;
                    int i13 = i12 & 67;
                    int i14 = i13 + ((i12 ^ 67) | i13);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = b;
                    int i17 = i16 & 67;
                    int i18 = (((i16 | 67) & (~i17)) - (~(i17 << 1))) - 1;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    colorStateList = null;
                }
            } else {
                aeVar = oVar.d;
                if (aeVar != null) {
                    int i20 = a;
                    int i21 = ((i20 ^ 19) | (i20 & 19)) << 1;
                    int i22 = -(((~i20) & 19) | (i20 & (-20)));
                    int i110 = (i21 & i22) + (i22 | i21);
                    b = i110 % 128;
                    int i111 = i110 % 2;
                    colorStateList = aeVar.a;
                    int i112 = b;
                    int i113 = i112 & 67;
                    int i114 = i113 + ((i112 ^ 67) | i113);
                    a = i114 % 128;
                    int i115 = i114 % 2;
                } else {
                    int i116 = b;
                    int i117 = i116 & 67;
                    int i118 = (((i116 | 67) & (~i117)) - (~(i117 << 1))) - 1;
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    colorStateList = null;
                }
            }
        } else {
            int i1110 = b;
            int i1111 = i1110 & 67;
            int i1112 = (((i1110 | 67) & (~i1111)) - (~(i1111 << 1))) - 1;
            a = i1112 % 128;
            int i1113 = i1112 % 2;
            colorStateList = null;
        }
        int i23 = b;
        int i24 = (i23 & 51) + (i23 | 51);
        a = i24 % 128;
        int i25 = i24 % 2;
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v7 ivas.gov.bisp.enumeration.k.o) = (r3v6 ivas.gov.bisp.enumeration.k.o), (r3v22 ivas.gov.bisp.enumeration.k.o) binds: [B:8:0x002a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar;
        int i;
        ae aeVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-78)) | ((~i4) & 77);
        int i6 = -(-((i4 & 77) << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        PorterDuff.Mode mode = null;
        if (i7 % 2 != 0) {
            oVar = this.d;
            if (oVar != null) {
                int i8 = ((i4 ^ 53) | (i4 & 53)) << 1;
                int i9 = -(((~i4) & 53) | (i4 & (-54)));
                i = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    ae aeVar2 = oVar.d;
                    mode.hashCode();
                    throw null;
                }
                aeVar = oVar.d;
                if (aeVar != null) {
                    int i10 = a;
                    int i11 = ((i10 & 67) - (~(-(-(i10 | 67))))) - 1;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    mode = aeVar.b;
                    int i13 = a;
                    int i14 = (((i13 | 84) << 1) - (i13 ^ 84)) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            int i16 = a;
            int i17 = i16 & 61;
            i2 = (i17 - (~(-(-((i16 ^ 61) | i17))))) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i18 = 75 / 0;
            }
            return mode;
        }
        oVar = this.d;
        int i19 = 4 / 0;
        if (oVar != null) {
            int i20 = ((i4 ^ 53) | (i4 & 53)) << 1;
            int i21 = -(((~i4) & 53) | (i4 & (-54)));
            i = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i % 128;
            if (i % 2 != 0) {
                ae aeVar3 = oVar.d;
                mode.hashCode();
                throw null;
            }
            aeVar = oVar.d;
            if (aeVar != null) {
                int i110 = a;
                int i111 = ((i110 & 67) - (~(-(-(i110 | 67))))) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
                mode = aeVar.b;
                int i113 = a;
                int i114 = (((i113 | 84) << 1) - (i113 ^ 84)) - 1;
                b = i114 % 128;
                int i115 = i114 % 2;
            }
        }
        int i116 = a;
        int i117 = i116 & 61;
        i2 = (i117 - (~(-(-((i116 ^ 61) | i117))))) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i118 = 75 / 0;
        }
        return mode;
        int i22 = b;
        int i23 = i22 & 83;
        int i24 = (i22 ^ 83) | i23;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        a = i25 % 128;
        int i26 = i25 % 2;
        int i119 = a;
        int i1110 = i119 & 61;
        i2 = (i1110 - (~(-(-((i119 ^ 61) | i1110))))) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i1111 = 75 / 0;
        }
        return mode;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.setBackgroundDrawable(drawable);
            throw null;
        }
        super.setBackgroundDrawable(drawable);
        r rVar = this.c;
        if (rVar != null) {
            rVar.i();
            int i3 = b;
            int i4 = ((i3 & 111) - (~(i3 | 111))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = b;
        int i7 = i6 | 81;
        int i8 = (i7 << 1) - ((~(i6 & 81)) & i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 41;
        int i4 = ((((i2 & 41) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            super.setImageBitmap(bitmap);
            throw null;
        }
        super.setImageBitmap(bitmap);
        o oVar = this.d;
        if (oVar != null) {
            oVar.c();
            int i5 = b;
            int i6 = i5 ^ 37;
            int i7 = (((i5 & 37) | i6) << 1) - i6;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b;
        int i10 = (i9 | 39) << 1;
        int i11 = -(((~i9) & 39) | (i9 & (-40)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 56 / 0;
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i7 = i2 & 73;
            int i8 = (i2 | 73) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            rVar.c(mode);
            int i12 = b;
            int i13 = ((i12 | 77) << 1) - (i12 ^ 77);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = ((i15 | 107) << 1) - (i15 ^ 107);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        o oVar = this.d;
        if (oVar != null) {
            int i7 = (((i2 | 70) << 1) - (i2 ^ 70)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            oVar.f(colorStateList);
            int i9 = a;
            int i10 = i9 ^ 87;
            int i11 = (((i9 & 87) | i10) << 1) - i10;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = (i13 ^ 9) + ((i13 & 9) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 67;
        int i4 = (i2 & 67) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setImageURI(uri);
        o oVar = this.d;
        if (oVar != null) {
            int i7 = b;
            int i8 = i7 & 93;
            int i9 = ((((i7 ^ 93) | i8) << 1) - (~(-((i7 | 93) & (~i8))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            oVar.c();
            if (i10 == 0) {
                int i11 = 34 / 0;
            }
        }
        int i12 = b;
        int i13 = i12 & 107;
        int i14 = (i13 - (~((i12 ^ 107) | i13))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        boolean z;
        int i = 2 % 2;
        int i2 = a + 119;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z2 = this.d.c.getBackground() instanceof RippleDrawable;
            throw null;
        }
        boolean z3 = this.d.c.getBackground() instanceof RippleDrawable;
        int i3 = (z3 ? 1 : 0) & 1;
        if ((((!z3 ? 1 : 0) | i3) & (~i3)) != 0) {
            int i4 = b;
            int i5 = (i4 | 65) << 1;
            int i6 = -(((~i4) & 65) | (i4 & (-66)));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                super.hasOverlappingRendering();
                obj.hashCode();
                throw null;
            }
            if (super.hasOverlappingRendering()) {
                z = true;
            } else {
                int i8 = a;
                int i9 = i8 & 37;
                int i10 = ((i8 | 37) & (~i9)) + (i9 << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            }
        } else {
            int i12 = a;
            int i13 = i12 & 37;
            int i14 = ((i12 | 37) & (~i13)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = a;
        int i17 = i16 & 107;
        int i18 = (((i16 | 107) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }
}
