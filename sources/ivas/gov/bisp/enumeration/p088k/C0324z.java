package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0324z {
    private static int a = 1;
    private static int b;
    public final CompoundButton c;
    public boolean g;
    public ColorStateList d = null;
    public PorterDuff.Mode e = null;
    public boolean f = false;
    public boolean h = false;

    public C0324z(CompoundButton compoundButton) {
        this.c = compoundButton;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v8 android.graphics.drawable.Drawable) = (r1v7 android.graphics.drawable.Drawable), (r1v19 android.graphics.drawable.Drawable) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public void c() {
        Drawable buttonDrawable;
        Drawable drawableMutate;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 117;
        int i7 = (i5 | 117) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            buttonDrawable = this.c.getButtonDrawable();
            int i10 = 8 / 0;
            if (buttonDrawable != null) {
                if (!(!this.f)) {
                    drawableMutate = buttonDrawable.mutate();
                    if (this.f) {
                        int i11 = a;
                        int i12 = i11 & 57;
                        i2 = ((i11 | 57) & (~i12)) + (i12 << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            drawableMutate.setTintList(this.d);
                            throw null;
                        }
                        drawableMutate.setTintList(this.d);
                        int i13 = a + 57;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    if (this.h) {
                        int i15 = a;
                        int i16 = ((i15 | 104) << 1) - (i15 ^ 104);
                        int i17 = (i16 ^ (-1)) + (i16 << 1);
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        drawableMutate.setTintMode(this.e);
                        int i19 = b + 115;
                        a = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    if (!(!drawableMutate.isStateful())) {
                        int i21 = b;
                        i = (i21 & 13) + (i21 | 13);
                        a = i % 128;
                        if (i % 2 == 0) {
                            drawableMutate.setState(this.c.getDrawableState());
                            int i22 = 90 / 0;
                        } else {
                            drawableMutate.setState(this.c.getDrawableState());
                        }
                    }
                    this.c.setButtonDrawable(drawableMutate);
                    int i23 = a + 125;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    int i25 = b;
                    int i26 = i25 & 105;
                    int i27 = (i25 | 105) & (~i26);
                    int i28 = -(-(i26 << 1));
                    i3 = (i27 & i28) + (i27 | i28);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (this.h) {
                        drawableMutate = buttonDrawable.mutate();
                        if (this.f) {
                            int i110 = a;
                            int i111 = i110 & 57;
                            i2 = ((i110 | 57) & (~i111)) + (i111 << 1);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                drawableMutate.setTintList(this.d);
                                throw null;
                            }
                            drawableMutate.setTintList(this.d);
                            int i112 = a + 57;
                            b = i112 % 128;
                            int i113 = i112 % 2;
                        }
                        if (this.h) {
                            int i114 = a;
                            int i115 = ((i114 | 104) << 1) - (i114 ^ 104);
                            int i116 = (i115 ^ (-1)) + (i115 << 1);
                            b = i116 % 128;
                            int i117 = i116 % 2;
                            drawableMutate.setTintMode(this.e);
                            int i118 = b + 115;
                            a = i118 % 128;
                            int i29 = i118 % 2;
                        }
                        if (!(!drawableMutate.isStateful())) {
                            int i210 = b;
                            i = (i210 & 13) + (i210 | 13);
                            a = i % 128;
                            if (i % 2 == 0) {
                                drawableMutate.setState(this.c.getDrawableState());
                                int i211 = 90 / 0;
                            } else {
                                drawableMutate.setState(this.c.getDrawableState());
                            }
                        }
                        this.c.setButtonDrawable(drawableMutate);
                        int i212 = a + 125;
                        b = i212 % 128;
                        int i213 = i212 % 2;
                    }
                }
            }
        } else {
            buttonDrawable = this.c.getButtonDrawable();
            if (buttonDrawable != null) {
                if (!(!this.f)) {
                    drawableMutate = buttonDrawable.mutate();
                    if (this.f) {
                        int i119 = a;
                        int i1110 = i119 & 57;
                        i2 = ((i119 | 57) & (~i1110)) + (i1110 << 1);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            drawableMutate.setTintList(this.d);
                            throw null;
                        }
                        drawableMutate.setTintList(this.d);
                        int i1111 = a + 57;
                        b = i1111 % 128;
                        int i1112 = i1111 % 2;
                    }
                    if (this.h) {
                        int i1113 = a;
                        int i1114 = ((i1113 | 104) << 1) - (i1113 ^ 104);
                        int i1115 = (i1114 ^ (-1)) + (i1114 << 1);
                        b = i1115 % 128;
                        int i1116 = i1115 % 2;
                        drawableMutate.setTintMode(this.e);
                        int i1117 = b + 115;
                        a = i1117 % 128;
                        int i214 = i1117 % 2;
                    }
                    if (!(!drawableMutate.isStateful())) {
                        int i215 = b;
                        i = (i215 & 13) + (i215 | 13);
                        a = i % 128;
                        if (i % 2 == 0) {
                            drawableMutate.setState(this.c.getDrawableState());
                            int i216 = 90 / 0;
                        } else {
                            drawableMutate.setState(this.c.getDrawableState());
                        }
                    }
                    this.c.setButtonDrawable(drawableMutate);
                    int i217 = a + 125;
                    b = i217 % 128;
                    int i218 = i217 % 2;
                } else {
                    int i219 = b;
                    int i220 = i219 & 105;
                    int i221 = (i219 | 105) & (~i220);
                    int i222 = -(-(i220 << 1));
                    i3 = (i221 & i222) + (i221 | i222);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (this.h) {
                        drawableMutate = buttonDrawable.mutate();
                        if (this.f) {
                            int i1118 = a;
                            int i1119 = i1118 & 57;
                            i2 = ((i1118 | 57) & (~i1119)) + (i1119 << 1);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                drawableMutate.setTintList(this.d);
                                throw null;
                            }
                            drawableMutate.setTintList(this.d);
                            int i11110 = a + 57;
                            b = i11110 % 128;
                            int i11111 = i11110 % 2;
                        }
                        if (this.h) {
                            int i11112 = a;
                            int i11113 = ((i11112 | 104) << 1) - (i11112 ^ 104);
                            int i11114 = (i11113 ^ (-1)) + (i11113 << 1);
                            b = i11114 % 128;
                            int i11115 = i11114 % 2;
                            drawableMutate.setTintMode(this.e);
                            int i11116 = b + 115;
                            a = i11116 % 128;
                            int i2110 = i11116 % 2;
                        }
                        if (!(!drawableMutate.isStateful())) {
                            int i2111 = b;
                            i = (i2111 & 13) + (i2111 | 13);
                            a = i % 128;
                            if (i % 2 == 0) {
                                drawableMutate.setState(this.c.getDrawableState());
                                int i2112 = 90 / 0;
                            } else {
                                drawableMutate.setState(this.c.getDrawableState());
                            }
                        }
                        this.c.setButtonDrawable(drawableMutate);
                        int i2113 = a + 125;
                        b = i2113 % 128;
                        int i2114 = i2113 % 2;
                    }
                }
            }
        }
        int i30 = a;
        int i31 = i30 & 125;
        int i32 = (i30 ^ 125) | i31;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0083 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090 A[PHI: r4
  0x0090: PHI (r4v49 int) = (r4v48 int), (r4v58 int) binds: [B:22:0x008e, B:20:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0181 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x018b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x005a, B:18:0x0083, B:24:0x0099, B:26:0x00b4, B:35:0x00ff, B:38:0x0112, B:42:0x0129, B:44:0x0140, B:48:0x015a, B:49:0x0163, B:50:0x0164, B:54:0x0181, B:55:0x0187, B:56:0x018b, B:57:0x0192, B:60:0x01a5, B:62:0x01b5, B:21:0x008a, B:13:0x0065), top: B:75:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e8  */
    public void d(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        CompoundButton compoundButton;
        ColorStateList colorStateListH;
        int iR;
        int i5;
        int i6;
        int i7;
        int iR2;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = (i9 ^ 99) + ((i9 & 99) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            this.c.getContext();
            int[] iArr = h.p;
            throw null;
        }
        Context context = this.c.getContext();
        int[] iArr2 = h.p;
        B bC = B.c(context, attributeSet, iArr2, i, 0);
        CompoundButton compoundButton2 = this.c;
        int i11 = b;
        int i12 = i11 & 103;
        int i13 = ((i11 | 103) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            compoundButton2.getContext();
            TypedArray typedArray = bC.d;
            throw null;
        }
        T.p(compoundButton2, compoundButton2.getContext(), iArr2, attributeSet, bC.d, i, 0);
        int i14 = b;
        int i15 = (i14 & (-114)) | ((~i14) & 113);
        int i16 = -(-((i14 & 113) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        try {
            if (i17 % 2 != 0) {
                if (bC.t(1)) {
                    z = true;
                    int i18 = a;
                    int i19 = i18 & 107;
                    int i20 = (i18 | 107) & (~i19);
                    int i21 = -(-(i19 << 1));
                    i7 = (i20 ^ i21) + ((i20 & i21) << 1);
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        iR2 = bC.r(0, 0);
                        if (iR2 != 0) {
                            int i22 = b + 3;
                            a = i22 % 128;
                            int i23 = i22 % 2;
                            CompoundButton compoundButton3 = this.c;
                            Drawable drawableC = A.c(compoundButton3.getContext(), iR2);
                            int i24 = a;
                            int i25 = ((i24 & (-26)) | ((~i24) & 25)) + ((i24 & 25) << 1);
                            b = i25 % 128;
                            int i26 = i25 % 2;
                            compoundButton3.setButtonDrawable(drawableC);
                            int i27 = b;
                            int i28 = ((i27 ^ 89) | (i27 & 89)) << 1;
                            int i29 = -(((~i27) & 89) | (i27 & (-90)));
                            int i30 = (i28 & i29) + (i29 | i28);
                            a = i30 % 128;
                            int i31 = i30 % 2;
                        }
                    } else {
                        iR2 = bC.r(1, 0);
                        if (iR2 != 0) {
                            int i210 = b + 3;
                            a = i210 % 128;
                            int i211 = i210 % 2;
                            CompoundButton compoundButton4 = this.c;
                            Drawable drawableC2 = A.c(compoundButton4.getContext(), iR2);
                            int i212 = a;
                            int i213 = ((i212 & (-26)) | ((~i212) & 25)) + ((i212 & 25) << 1);
                            b = i213 % 128;
                            int i214 = i213 % 2;
                            compoundButton4.setButtonDrawable(drawableC2);
                            int i215 = b;
                            int i216 = ((i215 ^ 89) | (i215 & 89)) << 1;
                            int i217 = -(((~i215) & 89) | (i215 & (-90)));
                            int i32 = (i216 & i217) + (i217 | i216);
                            a = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    }
                }
                if (!z) {
                    int i34 = b;
                    int i35 = ((i34 ^ 79) | (i34 & 79)) << 1;
                    int i36 = -(((~i34) & 79) | (i34 & (-80)));
                    int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    if (bC.t(0)) {
                        int i39 = a;
                        int i40 = i39 & 103;
                        int i41 = i40 + ((i39 ^ 103) | i40);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        iR = bC.r(0, 0);
                        if (iR != 0) {
                            int i43 = a;
                            int i44 = i43 & 105;
                            i5 = ((i43 | 105) & (~i44)) + (i44 << 1);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                A.c(this.c.getContext(), iR);
                                throw null;
                            }
                            CompoundButton compoundButton5 = this.c;
                            Drawable drawableC3 = A.c(compoundButton5.getContext(), iR);
                            int i45 = a;
                            int i46 = i45 & 63;
                            int i47 = i46 + ((i45 ^ 63) | i46);
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            compoundButton5.setButtonDrawable(drawableC3);
                            int i49 = a;
                            int i50 = i49 ^ 33;
                            int i51 = -(-((i49 & 33) << 1));
                            i6 = (i50 & i51) + (i51 | i50);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i52 = 5 % 3;
                            }
                        }
                    }
                }
                if (bC.t(2)) {
                    int i53 = a;
                    int i54 = i53 & 71;
                    i4 = ((((i53 ^ 71) | i54) << 1) - (~(-((i53 | 71) & (~i54))))) - 1;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        compoundButton = this.c;
                        colorStateListH = bC.h(2);
                    } else {
                        compoundButton = this.c;
                        colorStateListH = bC.h(2);
                    }
                    compoundButton.setButtonTintList(colorStateListH);
                }
                if (bC.t(3)) {
                    int i55 = a;
                    int i56 = ((i55 | 59) << 1) - (i55 ^ 59);
                    b = i56 % 128;
                    int i57 = i56 % 2;
                    CompoundButton compoundButton6 = this.c;
                    int iN = bC.n(3, -1);
                    int i58 = a + 121;
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    compoundButton6.setButtonTintMode(W.e(iN, null));
                    int i60 = b;
                    int i61 = i60 & 121;
                    int i62 = (((i60 | 121) & (~i61)) - (~(-(-(i61 << 1))))) - 1;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                }
                bC.d.recycle();
                int i64 = b;
                int i65 = i64 & 61;
                int i66 = (i64 ^ 61) | i65;
                i3 = (i65 ^ i66) + ((i66 & i65) << 1);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }
            if (bC.t(1)) {
                z = false;
                int i110 = a;
                int i111 = i110 & 107;
                int i218 = (i110 | 107) & (~i111);
                int i219 = -(-(i111 << 1));
                i7 = (i218 ^ i219) + ((i218 & i219) << 1);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    iR2 = bC.r(0, 0);
                    if (iR2 != 0) {
                        int i2110 = b + 3;
                        a = i2110 % 128;
                        int i2111 = i2110 % 2;
                        try {
                            CompoundButton compoundButton7 = this.c;
                            Drawable drawableC4 = A.c(compoundButton7.getContext(), iR2);
                            int i2112 = a;
                            int i2113 = ((i2112 & (-26)) | ((~i2112) & 25)) + ((i2112 & 25) << 1);
                            b = i2113 % 128;
                            int i2114 = i2113 % 2;
                            compoundButton7.setButtonDrawable(drawableC4);
                            int i2115 = b;
                            int i2116 = ((i2115 ^ 89) | (i2115 & 89)) << 1;
                            int i2117 = -(((~i2115) & 89) | (i2115 & (-90)));
                            int i310 = (i2116 & i2117) + (i2117 | i2116);
                            a = i310 % 128;
                            int i311 = i310 % 2;
                        } catch (Resources.NotFoundException unused) {
                            int i67 = b;
                            i2 = ((i67 | 83) << 1) - (i67 ^ 83);
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i68 = 3 / 3;
                            }
                            z = false;
                        }
                    }
                } else {
                    iR2 = bC.r(1, 0);
                    if (iR2 != 0) {
                        int i2118 = b + 3;
                        a = i2118 % 128;
                        int i2119 = i2118 % 2;
                        CompoundButton compoundButton8 = this.c;
                        Drawable drawableC5 = A.c(compoundButton8.getContext(), iR2);
                        int i21110 = a;
                        int i21111 = ((i21110 & (-26)) | ((~i21110) & 25)) + ((i21110 & 25) << 1);
                        b = i21111 % 128;
                        int i21112 = i21111 % 2;
                        compoundButton8.setButtonDrawable(drawableC5);
                        int i21113 = b;
                        int i21114 = ((i21113 ^ 89) | (i21113 & 89)) << 1;
                        int i21115 = -(((~i21113) & 89) | (i21113 & (-90)));
                        int i312 = (i21114 & i21115) + (i21115 | i21114);
                        a = i312 % 128;
                        int i313 = i312 % 2;
                    }
                }
            }
            if (!z) {
                int i314 = b;
                int i315 = ((i314 ^ 79) | (i314 & 79)) << 1;
                int i316 = -(((~i314) & 79) | (i314 & (-80)));
                int i317 = ((i315 | i316) << 1) - (i316 ^ i315);
                a = i317 % 128;
                int i318 = i317 % 2;
                if (bC.t(0)) {
                    int i319 = a;
                    int i410 = i319 & 103;
                    int i411 = i410 + ((i319 ^ 103) | i410);
                    b = i411 % 128;
                    int i412 = i411 % 2;
                    iR = bC.r(0, 0);
                    if (iR != 0) {
                        int i413 = a;
                        int i414 = i413 & 105;
                        i5 = ((i413 | 105) & (~i414)) + (i414 << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            A.c(this.c.getContext(), iR);
                            throw null;
                        }
                        CompoundButton compoundButton9 = this.c;
                        Drawable drawableC6 = A.c(compoundButton9.getContext(), iR);
                        int i415 = a;
                        int i416 = i415 & 63;
                        int i417 = i416 + ((i415 ^ 63) | i416);
                        b = i417 % 128;
                        int i418 = i417 % 2;
                        compoundButton9.setButtonDrawable(drawableC6);
                        int i419 = a;
                        int i510 = i419 ^ 33;
                        int i511 = -(-((i419 & 33) << 1));
                        i6 = (i510 & i511) + (i511 | i510);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i512 = 5 % 3;
                        }
                    }
                }
            }
            if (bC.t(2)) {
                int i513 = a;
                int i514 = i513 & 71;
                i4 = ((((i513 ^ 71) | i514) << 1) - (~(-((i513 | 71) & (~i514))))) - 1;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    compoundButton = this.c;
                    colorStateListH = bC.h(2);
                } else {
                    compoundButton = this.c;
                    colorStateListH = bC.h(2);
                }
                compoundButton.setButtonTintList(colorStateListH);
            }
            if (bC.t(3)) {
                int i515 = a;
                int i516 = ((i515 | 59) << 1) - (i515 ^ 59);
                b = i516 % 128;
                int i517 = i516 % 2;
                CompoundButton compoundButton10 = this.c;
                int iN2 = bC.n(3, -1);
                int i518 = a + 121;
                b = i518 % 128;
                int i519 = i518 % 2;
                compoundButton10.setButtonTintMode(W.e(iN2, null));
                int i69 = b;
                int i610 = i69 & 121;
                int i611 = (((i69 | 121) & (~i610)) - (~(-(-(i610 << 1))))) - 1;
                a = i611 % 128;
                int i612 = i611 % 2;
            }
            bC.d.recycle();
            int i613 = b;
            int i614 = i613 & 61;
            int i615 = (i613 ^ 61) | i614;
            i3 = (i614 ^ i615) + ((i615 & i614) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i616 = b;
            i2 = ((i616 | 83) << 1) - (i616 ^ 83);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i617 = 3 / 3;
            }
            z = false;
            if (!z) {
                int i3110 = b;
                int i3111 = ((i3110 ^ 79) | (i3110 & 79)) << 1;
                int i3112 = -(((~i3110) & 79) | (i3110 & (-80)));
                int i3113 = ((i3111 | i3112) << 1) - (i3112 ^ i3111);
                a = i3113 % 128;
                int i3114 = i3113 % 2;
                if (bC.t(0)) {
                    int i3115 = a;
                    int i4110 = i3115 & 103;
                    int i4111 = i4110 + ((i3115 ^ 103) | i4110);
                    b = i4111 % 128;
                    int i4112 = i4111 % 2;
                    iR = bC.r(0, 0);
                    if (iR != 0) {
                        int i4113 = a;
                        int i4114 = i4113 & 105;
                        i5 = ((i4113 | 105) & (~i4114)) + (i4114 << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            A.c(this.c.getContext(), iR);
                            throw null;
                        }
                        CompoundButton compoundButton11 = this.c;
                        Drawable drawableC7 = A.c(compoundButton11.getContext(), iR);
                        int i4115 = a;
                        int i4116 = i4115 & 63;
                        int i4117 = i4116 + ((i4115 ^ 63) | i4116);
                        b = i4117 % 128;
                        int i4118 = i4117 % 2;
                        compoundButton11.setButtonDrawable(drawableC7);
                        int i4119 = a;
                        int i5110 = i4119 ^ 33;
                        int i5111 = -(-((i4119 & 33) << 1));
                        i6 = (i5110 & i5111) + (i5111 | i5110);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i5112 = 5 % 3;
                        }
                    }
                }
            }
            if (bC.t(2)) {
                int i5113 = a;
                int i5114 = i5113 & 71;
                i4 = ((((i5113 ^ 71) | i5114) << 1) - (~(-((i5113 | 71) & (~i5114))))) - 1;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    compoundButton = this.c;
                    colorStateListH = bC.h(2);
                } else {
                    compoundButton = this.c;
                    colorStateListH = bC.h(2);
                }
                compoundButton.setButtonTintList(colorStateListH);
            }
            if (bC.t(3)) {
                int i5115 = a;
                int i5116 = ((i5115 | 59) << 1) - (i5115 ^ 59);
                b = i5116 % 128;
                int i5117 = i5116 % 2;
                CompoundButton compoundButton12 = this.c;
                int iN3 = bC.n(3, -1);
                int i5118 = a + 121;
                b = i5118 % 128;
                int i5119 = i5118 % 2;
                compoundButton12.setButtonTintMode(W.e(iN3, null));
                int i618 = b;
                int i619 = i618 & 121;
                int i6110 = (((i618 | 121) & (~i619)) - (~(-(-(i619 << 1))))) - 1;
                a = i6110 % 128;
                int i6111 = i6110 % 2;
            }
            bC.d.recycle();
            int i6112 = b;
            int i6113 = i6112 & 61;
            int i6114 = (i6112 ^ 61) | i6113;
            i3 = (i6113 ^ i6114) + ((i6114 & i6113) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            bC.d.recycle();
            throw th;
        }
    }
}
