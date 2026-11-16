package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 0;
    private static int b = 1;
    public final View c;
    public ae f;
    public ae g;
    public ae h;
    public int e = -1;
    public final P d = P.c();

    public r(View view) {
        this.c = view;
    }

    public ColorStateList e() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 99) << 1) - (~(-(i2 ^ 99)))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ae aeVar = this.h;
        if (aeVar != null) {
            int i6 = i4 & 29;
            int i7 = -(-((i4 ^ 29) | i6));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            colorStateList = aeVar.a;
            int i10 = a;
            int i11 = i10 & 19;
            int i12 = ((i10 ^ 19) | i11) << 1;
            int i13 = -((i10 | 19) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 % 2;
            }
        } else {
            int i16 = i2 & 81;
            int i17 = ((((i2 ^ 81) | i16) << 1) - (~(-((i2 | 81) & (~i16))))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            colorStateList = null;
        }
        int i19 = b;
        int i20 = (i19 | 31) << 1;
        int i21 = -(((~i19) & 31) | (i19 & (-32)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 27 / 0;
        }
        return colorStateList;
    }

    public PorterDuff.Mode f() {
        PorterDuff.Mode mode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 37) - (~(-(-(i2 | 37))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ae aeVar = this.h;
        if (aeVar != null) {
            int i6 = ((i2 & 2) + (i2 | 2)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            mode = aeVar.b;
            if (i7 == 0) {
                int i8 = 8 / 0;
            }
        } else {
            int i9 = i4 & 111;
            int i10 = (~i9) & (i4 | 111);
            int i11 = i9 << 1;
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 / 4;
            }
            mode = null;
        }
        int i14 = b;
        int i15 = ((i14 ^ 92) + ((i14 & 92) << 1)) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return mode;
    }

    public void k(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = -(-((i2 ^ 61) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.h == null) {
            this.h = new ae();
            int i7 = b;
            int i8 = i7 & 7;
            int i9 = (i8 - (~((i7 ^ 7) | i8))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        ae aeVar = this.h;
        aeVar.a = colorStateList;
        aeVar.d = true;
        int i11 = b;
        int i12 = ((i11 ^ 56) + ((i11 & 56) << 1)) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            d();
            int i13 = 82 / 0;
        } else {
            d();
        }
        int i14 = a;
        int i15 = ((i14 | 91) << 1) - (i14 ^ 91);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public void c(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 79) | (i2 & 79)) << 1) - (((~i2) & 79) | (i2 & (-80)));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.h == null) {
            this.h = new ae();
            int i4 = b;
            int i5 = i4 & 87;
            int i6 = (i5 - (~((i4 ^ 87) | i5))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        ae aeVar = this.h;
        aeVar.b = mode;
        int i8 = b;
        int i9 = i8 & 1;
        int i10 = ((i8 ^ 1) | i9) << 1;
        int i11 = -((i8 | 1) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        aeVar.c = true;
        d();
        int i14 = b;
        int i15 = (i14 ^ 59) + ((i14 & 59) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    public void h(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-54)) | ((~i3) & 53);
        int i5 = -(-((i3 & 53) << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.e = i;
        P p = this.d;
        ColorStateList colorStateListH = null;
        if (p != null) {
            int i9 = ((i3 & 76) + (i3 | 76)) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                p.h(this.c.getContext(), i);
                throw null;
            }
            colorStateListH = p.h(this.c.getContext(), i);
            int i10 = b;
            int i11 = (i10 & 61) + (i10 | 61);
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = i7 + 65;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        j(colorStateListH);
        d();
        int i15 = b + 46;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    public void i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.e = -1;
        j(null);
        d();
        int i8 = b;
        int i9 = i8 & 115;
        int i10 = (i9 - (~(-(-((i8 ^ 115) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void j(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (colorStateList != null) {
            int i5 = i2 & 97;
            int i6 = i2 | 97;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (this.f == null) {
                this.f = new ae();
                int i9 = b;
                int i10 = i9 | 101;
                int i11 = ((i10 << 1) - (~(-((~(i9 & 101)) & i10)))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            ae aeVar = this.f;
            aeVar.a = colorStateList;
            aeVar.d = true;
            int i13 = b;
            int i14 = i13 & 57;
            int i15 = (i13 ^ 57) | i14;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            this.f = null;
            int i18 = (i2 & 43) + (i2 | 43);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        d();
        int i20 = (-2) - ((b + 70) ^ (-1));
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[Catch: all -> 0x018b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x018b, blocks: (B:17:0x0081, B:23:0x0094, B:26:0x00ae, B:28:0x00bd, B:32:0x00d8, B:33:0x00dc, B:34:0x00df, B:59:0x0182, B:60:0x018a, B:35:0x00e0, B:38:0x00f5, B:40:0x010a, B:42:0x011c, B:47:0x0138, B:48:0x013f, B:52:0x0158, B:49:0x0144, B:20:0x008c), top: B:64:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #0 {all -> 0x018b, blocks: (B:17:0x0081, B:23:0x0094, B:26:0x00ae, B:28:0x00bd, B:32:0x00d8, B:33:0x00dc, B:34:0x00df, B:59:0x0182, B:60:0x018a, B:35:0x00e0, B:38:0x00f5, B:40:0x010a, B:42:0x011c, B:47:0x0138, B:48:0x013f, B:52:0x0158, B:49:0x0144, B:20:0x008c), top: B:64:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc A[Catch: all -> 0x018b, TryCatch #0 {all -> 0x018b, blocks: (B:17:0x0081, B:23:0x0094, B:26:0x00ae, B:28:0x00bd, B:32:0x00d8, B:33:0x00dc, B:34:0x00df, B:59:0x0182, B:60:0x018a, B:35:0x00e0, B:38:0x00f5, B:40:0x010a, B:42:0x011c, B:47:0x0138, B:48:0x013f, B:52:0x0158, B:49:0x0144, B:20:0x008c), top: B:64:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0182 A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #0 {all -> 0x018b, blocks: (B:17:0x0081, B:23:0x0094, B:26:0x00ae, B:28:0x00bd, B:32:0x00d8, B:33:0x00dc, B:34:0x00df, B:59:0x0182, B:60:0x018a, B:35:0x00e0, B:38:0x00f5, B:40:0x010a, B:42:0x011c, B:47:0x0138, B:48:0x013f, B:52:0x0158, B:49:0x0144, B:20:0x008c), top: B:64:0x007f }] */
    public void g(AttributeSet attributeSet, int i) {
        int[] iArr;
        View view;
        int iN;
        P p;
        int i2;
        ColorStateList colorStateListH;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & (-26)) | ((~i5) & 25);
        int i7 = -(-((i5 & 25) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        Context context = this.c.getContext();
        if (i9 != 0) {
            iArr = h.A;
            int i10 = 76 / 0;
        } else {
            iArr = h.A;
        }
        int[] iArr2 = iArr;
        int i11 = b + 99;
        a = i11 % 128;
        B bC = i11 % 2 != 0 ? B.c(context, attributeSet, iArr2, i, 1) : B.c(context, attributeSet, iArr2, i, 0);
        View view2 = this.c;
        Context context2 = view2.getContext();
        TypedArray typedArray = bC.d;
        int i12 = b;
        int i13 = i12 & 27;
        int i14 = (((i12 ^ 27) | i13) << 1) - ((i12 | 27) & (~i13));
        a = i14 % 128;
        if (i14 % 2 != 0) {
            T.p(view2, context2, iArr2, attributeSet, typedArray, i, 1);
        } else {
            T.p(view2, context2, iArr2, attributeSet, typedArray, i, 0);
        }
        int i15 = a;
        int i16 = i15 ^ 15;
        int i17 = ((i15 & 15) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        Object obj = null;
        try {
            if (i19 % 2 == 0) {
                int i20 = 13 / 0;
                if (!(!bC.t(0))) {
                    this.e = bC.r(0, -1);
                    p = this.d;
                    int i21 = b;
                    int i22 = i21 ^ 67;
                    int i23 = (i21 & 67) << 1;
                    i2 = (i22 & i23) + (i23 | i22);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.c.getContext();
                        obj.hashCode();
                        throw null;
                    }
                    Context context3 = this.c.getContext();
                    int i24 = a + 81;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    colorStateListH = p.h(context3, this.e);
                    if (colorStateListH != null) {
                        int i26 = b;
                        i3 = (-2) - (((i26 ^ 90) + ((i26 & 90) << 1)) ^ (-1));
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            j(colorStateListH);
                            throw null;
                        }
                        j(colorStateListH);
                    }
                }
            } else if (!(!bC.t(0))) {
                this.e = bC.r(0, -1);
                p = this.d;
                int i27 = b;
                int i28 = i27 ^ 67;
                int i29 = (i27 & 67) << 1;
                i2 = (i28 & i29) + (i29 | i28);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    this.c.getContext();
                    obj.hashCode();
                    throw null;
                }
                Context context4 = this.c.getContext();
                int i210 = a + 81;
                b = i210 % 128;
                int i211 = i210 % 2;
                colorStateListH = p.h(context4, this.e);
                if (colorStateListH != null) {
                    int i212 = b;
                    i3 = (-2) - (((i212 ^ 90) + ((i212 & 90) << 1)) ^ (-1));
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        j(colorStateListH);
                        throw null;
                    }
                    j(colorStateListH);
                }
            }
            if (bC.t(1)) {
                int i30 = a;
                int i31 = i30 & 25;
                int i32 = ((i30 | 25) & (~i31)) + (i31 << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
                View view3 = this.c;
                ColorStateList colorStateListH2 = bC.h(1);
                int i34 = a;
                int i35 = i34 & 9;
                int i36 = (i35 - (~((i34 ^ 9) | i35))) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
                T.aXb.s(view3, colorStateListH2);
                int i38 = b;
                int i39 = i38 & 27;
                int i40 = ((i38 | 27) & (~i39)) + (i39 << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
            if (!(!bC.t(2))) {
                int i42 = b;
                int i43 = (((i42 & (-110)) | ((~i42) & 109)) - (~((i42 & 109) << 1))) - 1;
                a = i43 % 128;
                if (i43 % 2 != 0) {
                    view = this.c;
                    iN = bC.n(3, -1);
                } else {
                    view = this.c;
                    iN = bC.n(2, -1);
                }
                PorterDuff.Mode modeE = W.e(iN, null);
                int i44 = a;
                int i45 = ((i44 | 17) << 1) - (i44 ^ 17);
                b = i45 % 128;
                int i46 = i45 % 2;
                T.aXb.r(view, modeE);
                int i47 = b;
                int i48 = i47 & 55;
                int i49 = i48 + ((i47 ^ 55) | i48);
                a = i49 % 128;
                int i50 = i49 % 2;
            }
            bC.d.recycle();
            int i51 = b;
            int i52 = ((i51 & 77) - (~(i51 | 77))) - 1;
            a = i52 % 128;
            if (i52 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            bC.d.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012e, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0131, code lost:
    
        if (r5 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0134, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p088k.r.b;
        r5 = (r4 ^ 5) + ((r4 & 5) << 1);
        ivas.gov.bisp.enumeration.p088k.r.a = r5 % 128;
        r5 = r5 % 2;
        r5 = ((r4 & (-36)) | ((~r4) & 35)) + ((r4 & 35) << 1);
        ivas.gov.bisp.enumeration.p088k.r.a = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p088k.r.d():void");
    }
}
