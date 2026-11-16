package ivas.gov.bisp.enumeration.p091n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import ivas.gov.bisp.enumeration.p008ah.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable implements Drawable.Callback {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;
    public boolean d;
    public aPC e;
    public Rect f;
    public Drawable g;
    public Drawable i;
    public boolean j;
    public Runnable l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public aPQ f105o;
    public int h = 255;
    public int k = -1;

    public class aPP implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aPP() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b + 111;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                h.this.c(true);
            } else {
                h.this.c(true);
            }
            h.this.invalidateSelf();
        }
    }

    public static class aPQ implements Drawable.Callback {
        private static int a = 1;
        private static int b;
        public Drawable.Callback c;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-72)) | ((~i2) & 71)) + ((i2 & 71) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 35;
            int i4 = (i2 ^ 35) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            Drawable.Callback callback = this.c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
                int i6 = b;
                int i7 = (i6 & 78) + (i6 | 78);
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = a;
            int i11 = i10 & 63;
            int i12 = i11 + ((i10 ^ 63) | i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 41;
            int i4 = -(-(i2 | 41));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            Drawable.Callback callback = this.c;
            if (callback != null) {
                int i8 = (((i6 | 4) << 1) - (i6 ^ 4)) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                callback.scheduleDrawable(drawable, runnable, j);
                int i10 = a;
                int i11 = ((i10 & 63) - (~(-(-(i10 | 63))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = b;
            int i14 = ((i13 | 55) << 1) - (((~i13) & 55) | (i13 & (-56)));
            a = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.e.canApplyTheme();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zCanApplyTheme = this.e.canApplyTheme();
        int i4 = b;
        int i5 = (((i4 | 109) << 1) - (~(-(((~i4) & 109) | (i4 & (-110)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return zCanApplyTheme;
    }

    public aPC d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = (i3 - (~(-(-((i2 ^ 71) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = 21 / 0;
        throw null;
    }

    public void g(aPC apc) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 73) + (i2 | 73);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = 71 / 0;
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 9;
        int i4 = (i2 & 9) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.h;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = -(-(i2 | 15));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.g;
        int i7 = i2 & 31;
        int i8 = (i2 | 31) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return drawable;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[LOOP:0: B:27:0x0097->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        aPC apc;
        int i;
        int i2;
        Drawable[] drawableArr;
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 ^ 111;
        int i9 = (i7 & 111) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        int iResolveOpacity = -2;
        Drawable drawable2 = this.g;
        if (i11 != 0) {
            if (drawable2 == null) {
                iResolveOpacity = 118;
            } else if (drawable2.isVisible()) {
                apc = this.e;
                if (!apc.s) {
                    apc.e();
                    i2 = apc.k;
                    int i12 = b;
                    int i13 = ((((i12 ^ 53) | (i12 & 53)) << 1) - (~(-(((~i12) & 53) | (i12 & (-54)))))) - 1;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    drawableArr = apc.j;
                    if (i2 > 0) {
                        int i15 = a;
                        i5 = (i15 ^ 95) + ((i15 & 95) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            drawable = drawableArr[0];
                        } else {
                            drawable = drawableArr[0];
                        }
                        iResolveOpacity = drawable.getOpacity();
                    }
                    int i16 = a;
                    i3 = (i16 ^ 49) + ((i16 & 49) << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i17 = 5 % 2;
                    }
                    i4 = 1;
                    while (i4 < i2) {
                        int i18 = a + 124;
                        int i19 = (i18 ^ (-1)) + (i18 << 1);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawableArr[i4].getOpacity());
                        int i21 = b;
                        int i22 = i21 & 41;
                        int i23 = (((~i22) & (i21 | 41)) - (~(i22 << 1))) - 1;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        i4 = (((i4 & (-11)) | ((~i4) & 10)) + ((i4 & 10) << 1)) - 9;
                        int i25 = (i21 & 107) + (i21 | 107);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                    }
                    apc.u = iResolveOpacity;
                    apc.s = true;
                    int i27 = a;
                    int i28 = ((i27 ^ 67) | (i27 & 67)) << 1;
                    int i29 = -(((~i27) & 67) | (i27 & (-68)));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    int i32 = b;
                    int i33 = ((((i32 ^ 117) | (i32 & 117)) << 1) - (~(-(((~i32) & 117) | (i32 & (-118)))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    iResolveOpacity = apc.u;
                    int i35 = a;
                    int i36 = (i35 & (-58)) | ((~i35) & 57);
                    int i37 = (i35 & 57) << 1;
                    i = ((i36 | i37) << 1) - (i37 ^ i36);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i38 = 4 % 4;
                    }
                }
            } else {
                int i39 = a;
                int i40 = ((i39 | 83) << 1) - (i39 ^ 83);
                b = i40 % 128;
                iResolveOpacity = i40 % 2 != 0 ? 2 : -2;
                int i41 = ((i39 | 3) << 1) - (i39 ^ 3);
                b = i41 % 128;
                int i42 = i41 % 2;
            }
        } else if (drawable2 != null) {
            if (drawable2.isVisible()) {
                int i310 = a;
                int i43 = ((i310 | 83) << 1) - (i310 ^ 83);
                b = i43 % 128;
                if (i43 % 2 != 0) {
                }
                int i44 = ((i310 | 3) << 1) - (i310 ^ 3);
                b = i44 % 128;
                int i45 = i44 % 2;
            } else {
                apc = this.e;
                if (!apc.s) {
                    apc.e();
                    i2 = apc.k;
                    int i110 = b;
                    int i111 = ((((i110 ^ 53) | (i110 & 53)) << 1) - (~(-(((~i110) & 53) | (i110 & (-54)))))) - 1;
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    drawableArr = apc.j;
                    if (i2 > 0) {
                        int i113 = a;
                        i5 = (i113 ^ 95) + ((i113 & 95) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            drawable = drawableArr[0];
                        } else {
                            drawable = drawableArr[0];
                        }
                        iResolveOpacity = drawable.getOpacity();
                    }
                    int i114 = a;
                    i3 = (i114 ^ 49) + ((i114 & 49) << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i115 = 5 % 2;
                    }
                    i4 = 1;
                    while (i4 < i2) {
                        int i116 = a + 124;
                        int i117 = (i116 ^ (-1)) + (i116 << 1);
                        b = i117 % 128;
                        int i210 = i117 % 2;
                        iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawableArr[i4].getOpacity());
                        int i211 = b;
                        int i212 = i211 & 41;
                        int i213 = (((~i212) & (i211 | 41)) - (~(i212 << 1))) - 1;
                        a = i213 % 128;
                        int i214 = i213 % 2;
                        i4 = (((i4 & (-11)) | ((~i4) & 10)) + ((i4 & 10) << 1)) - 9;
                        int i215 = (i211 & 107) + (i211 | 107);
                        a = i215 % 128;
                        int i216 = i215 % 2;
                    }
                    apc.u = iResolveOpacity;
                    apc.s = true;
                    int i217 = a;
                    int i218 = ((i217 ^ 67) | (i217 & 67)) << 1;
                    int i219 = -(((~i217) & 67) | (i217 & (-68)));
                    int i311 = ((i218 | i219) << 1) - (i219 ^ i218);
                    b = i311 % 128;
                    int i312 = i311 % 2;
                } else {
                    int i313 = b;
                    int i314 = ((((i313 ^ 117) | (i313 & 117)) << 1) - (~(-(((~i313) & 117) | (i313 & (-118)))))) - 1;
                    a = i314 % 128;
                    int i315 = i314 % 2;
                    iResolveOpacity = apc.u;
                    int i316 = a;
                    int i317 = (i316 & (-58)) | ((~i316) & 57);
                    int i318 = (i316 & 57) << 1;
                    i = ((i317 | i318) << 1) - (i318 ^ i317);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i319 = 4 % 4;
                    }
                }
            }
        }
        int i46 = a;
        int i47 = i46 & 3;
        int i48 = i46 | 3;
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        b = i49 % 128;
        int i50 = i49 % 2;
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        aPC apc = this.e;
        if (apc != null) {
            int i6 = (-2) - (((i4 & 30) + (i4 | 30)) ^ (-1));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                apc.s = true;
                apc.x = true;
            } else {
                apc.s = false;
                apc.x = false;
            }
            int i7 = b;
            int i8 = i7 & 9;
            int i9 = -(-((i7 ^ 9) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        if (drawable == this.g) {
            int i12 = a;
            int i13 = ((i12 | 89) << 1) - (i12 ^ 89);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (getCallback() != null) {
                int i15 = b;
                int i16 = ((i15 ^ 51) | (i15 & 51)) << 1;
                int i17 = -(((~i15) & 51) | (i15 & (-52)));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    getCallback().invalidateDrawable(this);
                    throw null;
                }
                getCallback().invalidateDrawable(this);
                int i19 = b;
                int i20 = (((i19 | 87) << 1) - (~(-(((~i19) & 87) | (i19 & (-88)))))) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        int i22 = b;
        int i23 = i22 & 3;
        int i24 = ((i22 ^ 3) | i23) << 1;
        int i25 = -((i22 | 3) & (~i23));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 76 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        int i = 2 % 2;
        int i2 = b + 65;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.e.D;
        int i4 = b;
        int i5 = ((((i4 ^ 41) | (i4 & 41)) << 1) - (~(-(((~i4) & 41) | (i4 & (-42)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = -(-((i2 & 33) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (drawable == this.g && getCallback() != null) {
            int i6 = a + 121;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                getCallback().scheduleDrawable(this, runnable, j);
                int i7 = 72 / 0;
            } else {
                getCallback().scheduleDrawable(this, runnable, j);
            }
        }
        int i8 = b + 87;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 38 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 ivas.gov.bisp.enumeration.n.h$aPC) = (r1v4 ivas.gov.bisp.enumeration.n.h$aPC), (r1v15 ivas.gov.bisp.enumeration.n.h$aPC) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        aPC apc;
        Drawable drawable;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 99;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            apc = this.e;
            int i4 = 93 / 0;
            if (apc.D != z) {
                int i5 = a;
                int i6 = (i5 & 53) + (i5 | 53);
                b = i6 % 128;
                int i7 = i6 % 2;
                apc.D = z;
                drawable = this.g;
                if (drawable != null) {
                    int i8 = b + 7;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    drawable.setAutoMirrored(z);
                    int i10 = a;
                    i = (i10 ^ 61) + ((i10 & 61) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i11 = 2 % 4;
                    }
                }
            }
        } else {
            apc = this.e;
            if (apc.D != z) {
                int i12 = a;
                int i13 = (i12 & 53) + (i12 | 53);
                b = i13 % 128;
                int i14 = i13 % 2;
                apc.D = z;
                drawable = this.g;
                if (drawable != null) {
                    int i15 = b + 7;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    drawable.setAutoMirrored(z);
                    int i17 = a;
                    i = (i17 ^ 61) + ((i17 & 61) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i18 = 2 % 4;
                    }
                }
            }
        }
        int i19 = b;
        int i20 = (((i19 | 16) << 1) - (i19 ^ 16)) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r2
  0x0028: PHI (r2v5 ivas.gov.bisp.enumeration.n.h$aPC) = (r2v4 ivas.gov.bisp.enumeration.n.h$aPC), (r2v10 ivas.gov.bisp.enumeration.n.h$aPC) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        aPC apc;
        Drawable drawable;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 115) - (~((i3 & 115) << 1))) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            apc = this.e;
            int i5 = 38 / 0;
            if (apc.v != z) {
                apc.v = z;
                drawable = this.g;
                if (drawable != null) {
                    int i6 = a;
                    i = ((i6 | 61) << 1) - (i6 ^ 61);
                    b = i % 128;
                    if (i % 2 == 0) {
                        drawable.setDither(z);
                        obj.hashCode();
                        throw null;
                    }
                    drawable.setDither(z);
                }
            }
        } else {
            apc = this.e;
            if (apc.v != z) {
                apc.v = z;
                drawable = this.g;
                if (drawable != null) {
                    int i7 = a;
                    i = ((i7 | 61) << 1) - (i7 ^ 61);
                    b = i % 128;
                    if (i % 2 == 0) {
                        drawable.setDither(z);
                        obj.hashCode();
                        throw null;
                    }
                    drawable.setDither(z);
                }
            }
        }
        int i8 = b;
        int i9 = i8 & 113;
        int i10 = i9 + ((i8 ^ 113) | i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-66)) | ((~i2) & 65);
        int i4 = (i2 & 65) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
            int i6 = b;
            int i7 = i6 ^ 79;
            int i8 = -(-((i6 & 79) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = (i11 ^ 52) + ((i11 & 52) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static abstract class aPC extends Drawable.ConstantState {
        private static int a = 1;
        private static int b;
        public int A;
        public boolean B;
        public int C;
        public boolean D;
        public int E;
        public ColorFilter F;
        public boolean G;
        public boolean H;
        public ColorStateList I;
        public PorterDuff.Mode J;
        public boolean K;
        public boolean c;
        public final h d;
        public Resources e;
        public int f;
        public int g;
        public SparseArray<Drawable.ConstantState> h;
        public int i;
        public Drawable[] j;
        public int k;
        public boolean l;
        public Rect m;
        public boolean n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f106o;
        public boolean p;
        public int q;
        public int r;
        public boolean s;
        public int t;
        public int u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public boolean z;

        /* JADX WARN: Code duplicated, block: B:102:0x0312  */
        /* JADX WARN: Code duplicated, block: B:103:0x0315  */
        /* JADX WARN: Code duplicated, block: B:113:0x0365  */
        /* JADX WARN: Code duplicated, block: B:115:0x037c  */
        /* JADX WARN: Code duplicated, block: B:117:0x0384  */
        /* JADX WARN: Code duplicated, block: B:118:0x039a  */
        /* JADX WARN: Code duplicated, block: B:131:0x03b0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:64:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:66:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:68:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:69:0x020c  */
        /* JADX WARN: Code duplicated, block: B:72:0x0221  */
        /* JADX WARN: Code duplicated, block: B:73:0x0224  */
        /* JADX WARN: Code duplicated, block: B:76:0x022a  */
        /* JADX WARN: Code duplicated, block: B:78:0x0235  */
        /* JADX WARN: Code duplicated, block: B:79:0x026a  */
        /* JADX WARN: Code duplicated, block: B:81:0x0271  */
        /* JADX WARN: Code duplicated, block: B:99:0x02f7 A[PHI: r11
  0x02f7: PHI (r11v17 android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState>) = 
  (r11v16 android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState>)
  (r11v38 android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState>)
 binds: [B:98:0x02f5, B:95:0x02ec] A[DONT_GENERATE, DONT_INLINE]] */
        public aPC(aPC apc, h hVar, Resources resources) {
            Resources resources2;
            int i;
            int i2;
            int i3;
            int i4;
            Rect rect;
            int i5;
            SparseArray<Drawable.ConstantState> sparseArray;
            int i6;
            int i7;
            Drawable.ConstantState constantState;
            int i8;
            this.c = false;
            this.n = false;
            this.v = true;
            this.C = 0;
            this.E = 0;
            this.d = hVar;
            Object obj = null;
            if (resources != null) {
                int i9 = b;
                int i10 = i9 & 23;
                int i11 = (((i9 ^ 23) | i10) << 1) - ((i9 | 23) & (~i10));
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 % 2;
                }
                resources2 = resources;
            } else if (apc != null) {
                int i13 = b;
                int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                int i15 = i14 % 128;
                a = i15;
                if (i14 % 2 == 0) {
                    resources2 = apc.e;
                    int i16 = 29 / 0;
                } else {
                    resources2 = apc.e;
                }
                int i17 = i15 + 45;
                b = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 2 % 2;
            } else {
                int i20 = b;
                int i21 = i20 & 1;
                int i22 = ((i20 | 1) & (~i21)) + (i21 << 1);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 2 % 2;
                }
                resources2 = null;
            }
            this.e = resources2;
            if (apc != null) {
                int i24 = a;
                int i25 = i24 & 55;
                int i26 = (i25 - (~((i24 ^ 55) | i25))) - 1;
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = apc.f;
                    obj.hashCode();
                    throw null;
                }
                i = apc.f;
                int i28 = ((i24 | 93) << 1) - (((~i24) & 93) | (i24 & (-94)));
                b = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 2 % 2;
                }
            } else {
                int i30 = a;
                int i31 = i30 & 91;
                int i32 = (i31 - (~((i30 ^ 91) | i31))) - 1;
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 2 % 2;
                }
                i = 0;
            }
            int i34 = h.c;
            if (resources != null) {
                int i35 = b;
                int i36 = (((i35 ^ 7) | (i35 & 7)) << 1) - (((~i35) & 7) | (i35 & (-8)));
                a = i36 % 128;
                if (i36 % 2 == 0) {
                    i8 = resources.getDisplayMetrics().densityDpi;
                    int i37 = 10 / 0;
                } else {
                    i8 = resources.getDisplayMetrics().densityDpi;
                }
                i = i8;
                int i38 = b;
                int i39 = (((i38 | 38) << 1) - (i38 ^ 38)) - 1;
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 5 / 4;
                } else {
                    int i41 = 2 % 2;
                }
            }
            if (i == 0) {
                int i42 = b;
                int i43 = i42 & 29;
                int i44 = (((~i43) & (i42 | 29)) - (~(-(-(i43 << 1))))) - 1;
                a = i44 % 128;
                int i45 = i44 % 2;
                int i46 = i42 & 93;
                int i47 = (((i42 ^ 93) | i46) << 1) - ((i42 | 93) & (~i46));
                a = i47 % 128;
                int i48 = i47 % 2;
                int i49 = 2 % 2;
                i = 160;
            }
            this.f = i;
            if (apc != null) {
                int i50 = a;
                int i51 = ((i50 & (-50)) | ((~i50) & 49)) + ((i50 & 49) << 1);
                b = i51 % 128;
                int i52 = i51 % 2;
                this.g = apc.g;
                this.i = apc.i;
                this.y = true;
                this.z = true;
                this.c = apc.c;
                int i53 = ((((i50 ^ 113) | (i50 & 113)) << 1) - (~(-((i50 & (-114)) | ((~i50) & 113))))) - 1;
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    this.n = apc.n;
                    this.v = apc.v;
                    boolean z = apc.B;
                    throw null;
                }
                this.n = apc.n;
                this.v = apc.v;
                boolean z2 = apc.B;
                int i54 = i50 + 3;
                b = i54 % 128;
                if (i54 % 2 != 0) {
                    this.B = z2;
                    this.A = apc.A;
                    this.C = apc.C;
                    int i55 = 96 / 0;
                } else {
                    this.B = z2;
                    this.A = apc.A;
                    this.C = apc.C;
                }
                this.E = apc.E;
                this.D = apc.D;
                int i56 = i50 & 73;
                int i57 = ((~i56) & (i50 | 73)) + (i56 << 1);
                b = i57 % 128;
                int i58 = i57 % 2;
                this.F = apc.F;
                this.G = apc.G;
                ColorStateList colorStateList = apc.I;
                int i59 = ((i50 & (-10)) | ((~i50) & 9)) + ((i50 & 9) << 1);
                b = i59 % 128;
                int i60 = i59 % 2;
                this.I = colorStateList;
                this.J = apc.J;
                this.K = apc.K;
                int i61 = (((i50 ^ 23) | (i50 & 23)) << 1) - (((~i50) & 23) | (i50 & (-24)));
                int i62 = i61 % 128;
                b = i62;
                if (i61 % 2 != 0) {
                    this.H = apc.H;
                    int i63 = 63 / 0;
                    if (apc.f == i) {
                        int i64 = i62 & 33;
                        i2 = (i64 - (~((i62 ^ 33) | i64))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            boolean z3 = apc.l;
                            obj.hashCode();
                            throw null;
                        }
                        if (apc.l) {
                            if (apc.m != null) {
                                rect = new Rect(apc.m);
                                int i65 = a;
                                int i66 = ((i65 & 59) - (~(i65 | 59))) - 1;
                                b = i66 % 128;
                                int i67 = i66 % 2;
                                int i68 = 2 % 2;
                            } else {
                                rect = null;
                            }
                            this.m = rect;
                            this.l = true;
                            int i69 = b;
                            int i70 = i69 ^ 91;
                            i5 = (((i69 & 91) | i70) << 1) - i70;
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                int i71 = 2 % 5;
                            } else {
                                int i72 = 2 % 2;
                            }
                        }
                        if (apc.p) {
                            i3 = a + 37;
                            i4 = i3 % 128;
                            b = i4;
                            if (i3 % 2 == 0) {
                                this.f106o = apc.f106o;
                                int i73 = apc.q;
                                throw null;
                            }
                            this.f106o = apc.f106o;
                            this.q = apc.q;
                            this.r = apc.r;
                            int i74 = (i4 & (-32)) | ((~i4) & 31);
                            int i75 = -(-((i4 & 31) << 1));
                            int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                            int i77 = i76 % 128;
                            a = i77;
                            int i78 = i76 % 2;
                            this.t = apc.t;
                            this.p = true;
                            int i79 = i77 ^ 7;
                            int i80 = (((i77 & 7) | i79) << 1) - i79;
                            b = i80 % 128;
                            int i81 = i80 % 2;
                            int i82 = 2 % 2;
                        }
                    }
                } else {
                    this.H = apc.H;
                    if (apc.f == i) {
                        int i610 = i62 & 33;
                        i2 = (i610 - (~((i62 ^ 33) | i610))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            boolean z4 = apc.l;
                            obj.hashCode();
                            throw null;
                        }
                        if (apc.l) {
                            if (apc.m != null) {
                                rect = new Rect(apc.m);
                                int i611 = a;
                                int i612 = ((i611 & 59) - (~(i611 | 59))) - 1;
                                b = i612 % 128;
                                int i613 = i612 % 2;
                                int i614 = 2 % 2;
                            } else {
                                rect = null;
                            }
                            this.m = rect;
                            this.l = true;
                            int i615 = b;
                            int i710 = i615 ^ 91;
                            i5 = (((i615 & 91) | i710) << 1) - i710;
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                int i711 = 2 % 5;
                            } else {
                                int i712 = 2 % 2;
                            }
                        }
                        if (apc.p) {
                            i3 = a + 37;
                            i4 = i3 % 128;
                            b = i4;
                            if (i3 % 2 == 0) {
                                this.f106o = apc.f106o;
                                int i713 = apc.q;
                                throw null;
                            }
                            this.f106o = apc.f106o;
                            this.q = apc.q;
                            this.r = apc.r;
                            int i714 = (i4 & (-32)) | ((~i4) & 31);
                            int i715 = -(-((i4 & 31) << 1));
                            int i716 = ((i714 | i715) << 1) - (i714 ^ i715);
                            int i717 = i716 % 128;
                            a = i717;
                            int i718 = i716 % 2;
                            this.t = apc.t;
                            this.p = true;
                            int i719 = i717 ^ 7;
                            int i83 = (((i717 & 7) | i719) << 1) - i719;
                            b = i83 % 128;
                            int i84 = i83 % 2;
                            int i85 = 2 % 2;
                        }
                    }
                }
                if (apc.s) {
                    int i86 = b;
                    int i87 = (-2) - ((i86 + 120) ^ (-1));
                    a = i87 % 128;
                    int i88 = i87 % 2;
                    this.u = apc.u;
                    this.s = true;
                    int i89 = (((i86 | 60) << 1) - (i86 ^ 60)) - 1;
                    a = i89 % 128;
                    int i90 = i89 % 2;
                    int i91 = 2 % 2;
                }
                if (apc.x) {
                    int i92 = b;
                    int i93 = (-2) - (((i92 ^ 82) + ((i92 & 82) << 1)) ^ (-1));
                    a = i93 % 128;
                    int i94 = i93 % 2;
                    this.w = apc.w;
                    this.x = true;
                    int i95 = i92 & 23;
                    int i96 = ((i92 ^ 23) | i95) << 1;
                    int i97 = -((23 | i92) & (~i95));
                    int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                    a = i98 % 128;
                    if (i98 % 2 != 0) {
                        int i99 = 2 % 2;
                    }
                }
                Drawable[] drawableArr = apc.j;
                this.j = new Drawable[drawableArr.length];
                int i100 = b + 109;
                a = i100 % 128;
                if (i100 % 2 == 0) {
                    this.k = apc.k;
                    sparseArray = apc.h;
                    int i101 = 91 / 0;
                    if (sparseArray != null) {
                        this.h = sparseArray.clone();
                        int i102 = a;
                        int i103 = i102 & 79;
                        int i104 = -(-((i102 ^ 79) | i103));
                        i6 = (i103 & i104) + (i104 | i103);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i105 = 2 % 2;
                        }
                    } else {
                        this.h = new SparseArray<>(this.k);
                        int i106 = b;
                        int i107 = ((i106 ^ 45) | (i106 & 45)) << 1;
                        int i108 = -(((~i106) & 45) | (i106 & (-46)));
                        int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                        a = i109 % 128;
                        int i110 = i109 % 2;
                        int i111 = 2 % 2;
                    }
                } else {
                    this.k = apc.k;
                    sparseArray = apc.h;
                    if (sparseArray != null) {
                        this.h = sparseArray.clone();
                        int i1010 = a;
                        int i1011 = i1010 & 79;
                        int i1012 = -(-((i1010 ^ 79) | i1011));
                        i6 = (i1011 & i1012) + (i1012 | i1011);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i1013 = 2 % 2;
                        }
                    } else {
                        this.h = new SparseArray<>(this.k);
                        int i1014 = b;
                        int i1015 = ((i1014 ^ 45) | (i1014 & 45)) << 1;
                        int i1016 = -(((~i1014) & 45) | (i1014 & (-46)));
                        int i1017 = ((i1015 | i1016) << 1) - (i1016 ^ i1015);
                        a = i1017 % 128;
                        int i112 = i1017 % 2;
                        int i113 = 2 % 2;
                    }
                }
                int i114 = this.k;
                int i115 = a + 85;
                b = i115 % 128;
                int i116 = i115 % 2;
                int i117 = 2 % 2;
                int i118 = 0;
                while (i118 < i114) {
                    int i119 = a;
                    int i120 = (i119 ^ 17) + ((i119 & 17) << 1);
                    int i121 = i120 % 128;
                    b = i121;
                    if (i120 % 2 != 0) {
                        int i122 = 42 / 0;
                        if (drawableArr[i118] != null) {
                            int i123 = i121 & 83;
                            int i124 = ((i121 ^ 83) | i123) << 1;
                            int i125 = -((i121 | 83) & (~i123));
                            i7 = (i124 ^ i125) + ((i125 & i124) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                drawableArr[i118].getConstantState();
                                obj.hashCode();
                                throw null;
                            }
                            constantState = drawableArr[i118].getConstantState();
                            if (constantState != null) {
                                this.h.put(i118, constantState);
                                int i126 = a;
                                int i127 = (-2) - (((i126 & 40) + (i126 | 40)) ^ (-1));
                                b = i127 % 128;
                                int i128 = i127 % 2;
                            } else {
                                this.j[i118] = drawableArr[i118];
                                int i129 = b;
                                int i130 = i129 ^ 7;
                                int i131 = (i129 & 7) << 1;
                                int i132 = (i130 & i131) + (i131 | i130);
                                a = i132 % 128;
                                int i133 = i132 % 2;
                            }
                        } else {
                            continue;
                        }
                    } else if (drawableArr[i118] != null) {
                        int i1210 = i121 & 83;
                        int i1211 = ((i121 ^ 83) | i1210) << 1;
                        int i1212 = -((i121 | 83) & (~i1210));
                        i7 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                        a = i7 % 128;
                        if (i7 % 2 != 0) {
                            drawableArr[i118].getConstantState();
                            obj.hashCode();
                            throw null;
                        }
                        constantState = drawableArr[i118].getConstantState();
                        if (constantState != null) {
                            this.h.put(i118, constantState);
                            int i1213 = a;
                            int i1214 = (-2) - (((i1213 & 40) + (i1213 | 40)) ^ (-1));
                            b = i1214 % 128;
                            int i1215 = i1214 % 2;
                        } else {
                            this.j[i118] = drawableArr[i118];
                            int i1216 = b;
                            int i134 = i1216 ^ 7;
                            int i135 = (i1216 & 7) << 1;
                            int i136 = (i134 & i135) + (i135 | i134);
                            a = i136 % 128;
                            int i137 = i136 % 2;
                        }
                    } else {
                        continue;
                    }
                    i118 = (((i118 | 1) << 1) - (~(-(i118 ^ 1)))) - 1;
                    int i138 = b + 66;
                    int i139 = (i138 ^ (-1)) + (i138 << 1);
                    a = i139 % 128;
                    int i140 = i139 % 2;
                }
            } else {
                this.j = new Drawable[10];
                this.k = 0;
                int i141 = a;
                int i142 = (((i141 | 18) << 1) - (i141 ^ 18)) - 1;
                b = i142 % 128;
                int i143 = i142 % 2;
                int i144 = 2 % 2;
            }
            int i145 = a;
            int i146 = i145 & 71;
            int i147 = (i145 | 71) & (~i146);
            int i148 = i146 << 1;
            int i149 = (i147 ^ i148) + ((i147 & i148) << 1);
            b = i149 % 128;
            if (i149 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final void e() {
            int i = 2 % 2;
            int i2 = b + 83;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            SparseArray<Drawable.ConstantState> sparseArray = this.h;
            if (sparseArray != null) {
                int i5 = (i3 & 91) + (i3 | 91);
                b = i5 % 128;
                int i6 = i5 % 2;
                int size = sparseArray.size();
                int i7 = b;
                int i8 = i7 & 19;
                int i9 = i8 + ((i7 ^ 19) | i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = a;
                    int i13 = (i12 ^ 63) + ((i12 & 63) << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    int iKeyAt = this.h.keyAt(i11);
                    SparseArray<Drawable.ConstantState> sparseArray2 = this.h;
                    int i15 = a;
                    int i16 = (i15 & 27) + (i15 | 27);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    Drawable.ConstantState constantStateValueAt = sparseArray2.valueAt(i11);
                    Drawable[] drawableArr = this.j;
                    int i18 = (-2) - ((a + 12) ^ (-1));
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.e);
                    int i20 = b;
                    int i21 = (i20 ^ 39) + ((i20 & 39) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = this.A;
                    int i24 = (i20 & 17) + (i20 | 17);
                    a = i24 % 128;
                    if (i24 % 2 == 0) {
                        drawableNewDrawable.setLayoutDirection(i23);
                        drawableNewDrawable.mutate();
                        throw null;
                    }
                    drawableNewDrawable.setLayoutDirection(i23);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.d);
                    int i25 = a + 28;
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        drawableArr[iKeyAt] = drawableMutate;
                        int i27 = (i11 & (-17)) + (i11 | (-17));
                        int i28 = i27 & 93;
                        int i29 = (i27 | 93) & (~i28);
                        int i30 = i28 << 1;
                        i11 = ((i29 | i30) << 1) - (i30 ^ i29);
                    } else {
                        drawableArr[iKeyAt] = drawableMutate;
                        i11 = (((i11 | 2) << 1) - (i11 ^ 2)) - 1;
                    }
                }
                this.h = null;
                int i31 = a;
                int i32 = i31 & 43;
                int i33 = i32 + ((i31 ^ 43) | i32);
                b = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 4 % 5;
                }
            }
            int i35 = b;
            int i36 = i35 & 125;
            int i37 = (i35 ^ 125) | i36;
            int i38 = (i36 & i37) + (i37 | i36);
            a = i38 % 128;
            int i39 = i38 % 2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 71;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.g;
            int i6 = this.i;
            int i7 = i5 ^ i6;
            int i8 = i5 & i6;
            int i9 = (i8 & i7) | (i7 ^ i8);
            int i10 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-(((~i2) & 101) | (i2 & (-102)))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            return i9;
        }

        public abstract void h();

        public void d() {
            Drawable[] drawableArr;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                this.p = false;
            } else {
                this.p = true;
            }
            e();
            int i4 = this.k;
            int i5 = a;
            int i6 = (i5 ^ 23) + ((i5 & 23) << 1);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                drawableArr = this.j;
                this.q = -1;
                int i8 = 66 / 0;
            } else {
                drawableArr = this.j;
                this.q = -1;
            }
            int i9 = i7 | 41;
            int i10 = (i9 << 1) - (i9 & (~(i7 & 41)));
            a = i10 % 128;
            int i11 = i10 % 2;
            this.f106o = -1;
            this.t = 0;
            int i12 = ((i7 | 123) << 1) - (i7 ^ 123);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                this.r = 0;
                int i13 = 8 / 0;
            } else {
                this.r = 0;
            }
            int i14 = (i7 ^ 25) + ((i7 & 25) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < i4) {
                int i17 = b;
                int i18 = (i17 & (-124)) | ((~i17) & 123);
                int i19 = (i17 & 123) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                Drawable drawable = drawableArr[i16];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f106o) {
                    int i22 = a + 42;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    int i24 = i23 % 128;
                    b = i24;
                    int i25 = i23 % 2;
                    this.f106o = intrinsicWidth;
                    int i26 = ((i24 ^ 35) | (i24 & 35)) << 1;
                    int i27 = -(((~i24) & 35) | (i24 & (-36)));
                    int i28 = (i26 & i27) + (i26 | i27);
                    a = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 3 / 5;
                    }
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.q) {
                    int i30 = a;
                    int i31 = (i30 ^ 22) + ((i30 & 22) << 1);
                    int i32 = (i31 ^ (-1)) + (i31 << 1);
                    int i33 = i32 % 128;
                    b = i33;
                    int i34 = i32 % 2;
                    this.q = intrinsicHeight;
                    int i35 = i33 ^ 85;
                    int i36 = -(-((i33 & 85) << 1));
                    int i37 = (i35 & i36) + (i35 | i36);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.r) {
                    int i39 = b;
                    int i40 = i39 & 101;
                    int i41 = (i40 - (~(-(-((i39 ^ 101) | i40))))) - 1;
                    int i42 = i41 % 128;
                    a = i42;
                    if (i41 % 2 == 0) {
                        this.r = minimumWidth;
                        throw null;
                    }
                    this.r = minimumWidth;
                    int i43 = i42 & 45;
                    int i44 = (i42 | 45) & (~i43);
                    int i45 = -(-(i43 << 1));
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.t) {
                    int i48 = a;
                    int i49 = (i48 & 5) + (i48 | 5);
                    b = i49 % 128;
                    if (i49 % 2 != 0) {
                        this.t = minimumHeight;
                        int i50 = 72 / 0;
                    } else {
                        this.t = minimumHeight;
                    }
                }
                i16++;
                int i51 = b + 97;
                a = i51 % 128;
                int i52 = i51 % 2;
            }
            int i53 = b;
            int i54 = (i53 ^ 117) + ((i53 & 117) << 1);
            a = i54 % 128;
            int i55 = i54 % 2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i;
            Drawable[] drawableArr;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 ^ 117) | (i4 & 117)) << 1;
            int i6 = -(((~i4) & 117) | (i4 & (-118)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                i = this.k;
                drawableArr = this.j;
                i2 = 1;
            } else {
                i = this.k;
                drawableArr = this.j;
                i2 = 0;
            }
            while (true) {
                Object obj = null;
                if (i2 >= i) {
                    int i8 = b;
                    int i9 = i8 & 71;
                    int i10 = i9 + ((i8 ^ 71) | i9);
                    a = i10 % 128;
                    if (i10 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                int i11 = a;
                int i12 = i11 & 107;
                int i13 = i11 | 107;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                int i15 = i14 % 128;
                b = i15;
                if (i14 % 2 != 0) {
                    Drawable drawable = drawableArr[i2];
                    throw null;
                }
                Drawable drawable2 = drawableArr[i2];
                if (drawable2 != null) {
                    int i16 = i15 & 103;
                    int i17 = (i15 ^ 103) | i16;
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    if (!(!drawable2.canApplyTheme())) {
                        int i20 = a;
                        int i21 = ((i20 ^ 28) + ((i20 & 28) << 1)) - 1;
                        int i22 = i21 % 128;
                        b = i22;
                        int i23 = i21 % 2;
                        int i24 = ((i22 ^ 15) | (i22 & 15)) << 1;
                        int i25 = -(((~i22) & 15) | (i22 & (-16)));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        a = i26 % 128;
                        if (i26 % 2 != 0) {
                            return true;
                        }
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    Drawable.ConstantState constantState = this.h.get(i2);
                    if (constantState != null) {
                        int i27 = a;
                        int i28 = ((i27 | 12) << 1) - (i27 ^ 12);
                        int i29 = (i28 ^ (-1)) + (i28 << 1);
                        b = i29 % 128;
                        if (i29 % 2 != 0) {
                            constantState.canApplyTheme();
                            obj.hashCode();
                            throw null;
                        }
                        if (!(!constantState.canApplyTheme())) {
                            int i30 = b + 33;
                            a = i30 % 128;
                            int i31 = i30 % 2;
                            return true;
                        }
                    }
                }
                int i32 = i2 & 1;
                int i33 = -(-((i2 ^ 1) | i32));
                i2 = ((i32 | i33) << 1) - (i33 ^ i32);
                int i34 = b + 25;
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 5 / 3;
                }
            }
        }

        public final void g(Resources resources) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 91;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (resources != null) {
                int i4 = i2 | 43;
                int i5 = i4 << 1;
                int i6 = -((~(i2 & 43)) & i4);
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                this.e = resources;
                int i9 = h.c;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i10 = b;
                int i11 = ((i10 | 37) << 1) - (i10 ^ 37);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = displayMetrics.densityDpi;
                if (i13 == 0) {
                    int i14 = a;
                    int i15 = ((i14 ^ 35) - (~(-(-((i14 & 35) << 1))))) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2 != 0 ? 18895 : 160;
                    int i17 = ((i14 ^ 108) + ((i14 & 108) << 1)) - 1;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    i13 = i16;
                }
                int i19 = this.f;
                this.f = i13;
                if (i19 != i13) {
                    int i20 = (-2) - ((b + 38) ^ (-1));
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    this.p = false;
                    this.l = false;
                    int i23 = i21 & 57;
                    int i24 = (i21 ^ 57) | i23;
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int i27 = a;
            int i28 = i27 ^ 47;
            int i29 = ((i27 & 47) | i28) << 1;
            int i30 = -i28;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            b = i31 % 128;
            int i32 = i31 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0041 A[PHI: r9
  0x0041: PHI (r9v5 android.graphics.drawable.Drawable[]) = (r9v4 android.graphics.drawable.Drawable[]), (r9v11 android.graphics.drawable.Drawable[]) binds: [B:12:0x003f, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        public final int c(Drawable drawable) {
            int changingConfigurations;
            boolean z;
            Drawable[] drawableArr;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 14) << 1) - (i2 ^ 14)) - 1;
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 == 0) {
                int length = this.j.length;
                throw null;
            }
            int i5 = this.k;
            if (i5 >= this.j.length) {
                int i6 = (-2) - ((i5 + 11) ^ (-1));
                e.aPE ape = (e.aPE) this;
                Drawable[] drawableArr2 = new Drawable[i6];
                int i7 = ((i4 | 33) << 1) - (i4 ^ 33);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    drawableArr = ape.j;
                    int i8 = 42 / 0;
                    if (drawableArr != null) {
                        int i9 = (-2) - ((i4 + 8) ^ (-1));
                        b = i9 % 128;
                        int i10 = i9 % 2;
                        System.arraycopy(drawableArr, 0, drawableArr2, 0, i5);
                        int i11 = a;
                        int i12 = (((i11 ^ 7) | (i11 & 7)) << 1) - (((~i11) & 7) | (i11 & (-8)));
                        b = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else {
                    drawableArr = ape.j;
                    if (drawableArr != null) {
                        int i14 = (-2) - ((i4 + 8) ^ (-1));
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        System.arraycopy(drawableArr, 0, drawableArr2, 0, i5);
                        int i16 = a;
                        int i17 = (((i16 ^ 7) | (i16 & 7)) << 1) - (((~i16) & 7) | (i16 & (-8)));
                        b = i17 % 128;
                        int i18 = i17 % 2;
                    }
                }
                ape.j = drawableArr2;
                int[][] iArr = new int[i6][];
                int i19 = a;
                int i20 = ((i19 | 89) << 1) - (i19 ^ 89);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    System.arraycopy(ape.L, 0, iArr, 0, i5);
                } else {
                    System.arraycopy(ape.L, 0, iArr, 0, i5);
                }
                int i21 = a;
                int i22 = (i21 ^ 87) + ((i21 & 87) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                ape.L = iArr;
                int i24 = b + 95;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            int i26 = b + 49;
            a = i26 % 128;
            int i27 = i26 % 2;
            drawable.setCallback(this.d);
            Drawable[] drawableArr3 = this.j;
            int i28 = a;
            int i29 = (((i28 | 20) << 1) - (i28 ^ 20)) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            drawableArr3[i5] = drawable;
            this.k++;
            int i31 = i28 & 63;
            int i32 = (i28 | 63) & (~i31);
            int i33 = -(-(i31 << 1));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                changingConfigurations = drawable.getChangingConfigurations() & this.i;
            } else {
                int i35 = this.i;
                int changingConfigurations2 = drawable.getChangingConfigurations();
                int i36 = changingConfigurations2 ^ i35;
                int i37 = changingConfigurations2 & i35;
                changingConfigurations = (i37 & i36) | (i36 ^ i37);
            }
            int i38 = b + 113;
            int i39 = i38 % 128;
            a = i39;
            int i40 = i38 % 2;
            this.i = changingConfigurations;
            this.s = false;
            this.x = false;
            int i41 = i39 & 43;
            int i42 = i41 + ((i39 ^ 43) | i41);
            b = i42 % 128;
            if (i42 % 2 != 0) {
                this.m = null;
                this.l = true;
                z = true;
            } else {
                this.m = null;
                this.l = false;
                z = false;
            }
            this.p = z;
            this.y = false;
            int i43 = i39 & 113;
            int i44 = (((~i43) & (i39 | 113)) - (~(-(-(i43 << 1))))) - 1;
            b = i44 % 128;
            int i45 = i44 % 2;
            return i5;
        }

        public final Drawable f(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 29;
            int i5 = (~i4) & (i3 | 29);
            int i6 = -(-(i4 << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            Drawable drawable = this.j[i];
            if (drawable != null) {
                int i10 = ((i8 | 3) << 1) - (i8 ^ 3);
                int i11 = i10 % 128;
                b = i11;
                int i12 = i10 % 2;
                int i13 = i11 & 81;
                int i14 = ((i11 | 81) & (~i13)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.h;
            Object obj = null;
            if (sparseArray != null) {
                int i16 = i3 & 67;
                int i17 = ((((i3 ^ 67) | i16) << 1) - (~(-((i3 | 67) & (~i16))))) - 1;
                a = i17 % 128;
                int i18 = i17 % 2;
                int iIndexOfKey = sparseArray.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    int i19 = a;
                    int i20 = i19 & 89;
                    int i21 = -(-((i19 ^ 89) | i20));
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    Drawable.ConstantState constantStateValueAt = this.h.valueAt(iIndexOfKey);
                    int i24 = a;
                    int i25 = (-2) - (((i24 ^ 116) + ((i24 & 116) << 1)) ^ (-1));
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.e);
                    int i27 = this.A;
                    int i28 = a;
                    int i29 = (i28 ^ 93) + ((i28 & 93) << 1);
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        drawableNewDrawable.setLayoutDirection(i27);
                        drawableNewDrawable.mutate();
                        throw null;
                    }
                    drawableNewDrawable.setLayoutDirection(i27);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    int i30 = a + 93;
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        drawableMutate.setCallback(this.d);
                        int i31 = 95 / 0;
                    } else {
                        drawableMutate.setCallback(this.d);
                    }
                    int i32 = b;
                    int i33 = i32 & 67;
                    int i34 = ((((i32 ^ 67) | i33) << 1) - (~(-((~i33) & (i32 | 67))))) - 1;
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    this.j[i] = drawableMutate;
                    SparseArray<Drawable.ConstantState> sparseArray2 = this.h;
                    int i36 = i32 & 83;
                    int i37 = -(-(i32 | 83));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    sparseArray2.removeAt(iIndexOfKey);
                    if (this.h.size() == 0) {
                        int i40 = b;
                        int i41 = (i40 & (-88)) | ((~i40) & 87);
                        int i42 = (i40 & 87) << 1;
                        int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        this.h = null;
                        int i45 = i40 & 1;
                        int i46 = i45 + ((i40 ^ 1) | i45);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    int i48 = b;
                    int i49 = ((i48 | 53) << 1) - (i48 ^ 53);
                    a = i49 % 128;
                    if (i49 % 2 != 0) {
                        return drawableMutate;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            int i50 = b + 76;
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            a = i51 % 128;
            if (i51 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            super.getChangingConfigurations();
            this.e.getChangingConfigurations();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int changingConfigurations = super.getChangingConfigurations();
        int changingConfigurations2 = this.e.getChangingConfigurations();
        int i4 = changingConfigurations & changingConfigurations2;
        int i5 = (changingConfigurations | changingConfigurations2) & (~i4);
        int i6 = (i5 & i4) | (i5 ^ i4);
        int i7 = a;
        int i8 = (((i7 | 126) << 1) - (i7 ^ 126)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 27;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 27)) & i3)))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Rect rect2 = this.f;
        if (rect2 == null) {
            super.getHotspotBounds(rect);
            int i7 = a + 31;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 10 / 0;
                return;
            }
            return;
        }
        int i9 = i5 ^ 113;
        int i10 = ((i5 & 113) | i9) << 1;
        int i11 = -i9;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        rect.set(rect2);
        if (i13 != 0) {
            int i14 = 38 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = ((i2 ^ 125) | i3) << 1;
        int i5 = -((~i3) & (i2 | 125));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Drawable drawable = this.g;
        if (drawable != null) {
            int i8 = (i2 & 61) + (i2 | 61);
            a = i8 % 128;
            int i9 = i8 % 2;
            drawable.getOutline(outline);
            int i10 = b;
            int i11 = i10 ^ 21;
            int i12 = ((i10 & 21) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = a;
        int i17 = i16 & 105;
        int i18 = -(-((i16 ^ 105) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            int i4 = i2 & 51;
            int i5 = ((i2 | 51) & (~i4)) + (i4 << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                drawable.setBounds(rect);
                throw null;
            }
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            int i6 = a;
            int i7 = ((i6 | 33) << 1) - (i6 ^ 33);
            b = i7 % 128;
            int i8 = i7 % 2;
            drawable2.setBounds(rect);
            int i9 = a;
            int i10 = i9 & 69;
            int i11 = i10 + ((i9 ^ 69) | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = ((i13 ^ 120) + ((i13 & 120) << 1)) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = i4 + ((i3 ^ 55) | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Drawable drawable = this.i;
        if (drawable != null) {
            int i8 = (i6 ^ 123) + ((i6 & 123) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            boolean level = drawable.setLevel(i);
            int i10 = b;
            int i11 = i10 & 87;
            int i12 = i11 + ((i10 ^ 87) | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return level;
        }
        Drawable drawable2 = this.g;
        if (drawable2 == null) {
            int i14 = i3 ^ 25;
            int i15 = -(-((i3 & 25) << 1));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        int i18 = i3 ^ 61;
        int i19 = -(-((i3 & 61) << 1));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            drawable2.setLevel(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean level2 = drawable2.setLevel(i);
        int i21 = b;
        int i22 = i21 & 83;
        int i23 = ((i21 ^ 83) | i22) << 1;
        int i24 = -((i21 | 83) & (~i22));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        return level2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-52)) | ((~i2) & 51);
        int i4 = -(-((i2 & 51) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        aPC apc = this.e;
        apc.H = true;
        int i7 = b + 19;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            PorterDuff.Mode mode2 = apc.J;
            throw null;
        }
        if (apc.J != mode) {
            apc.J = mode;
            j.d(this.g, mode);
            int i8 = a;
            int i9 = ((i8 & (-108)) | ((~i8) & 107)) + ((i8 & 107) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 4;
            }
        }
        int i11 = a;
        int i12 = i11 & 35;
        int i13 = -(-((i11 ^ 35) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 123;
        int i5 = (i3 ^ 123) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Drawable drawable2 = this.g;
        if (i7 == 0) {
            int i8 = 86 / 0;
            if (drawable == drawable2) {
                if (getCallback() != null) {
                    int i9 = a;
                    i = (((i9 & (-16)) | ((~i9) & 15)) - (~((i9 & 15) << 1))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        getCallback().unscheduleDrawable(this, runnable);
                        throw null;
                    }
                    getCallback().unscheduleDrawable(this, runnable);
                    int i10 = b;
                    int i11 = (i10 & (-34)) | ((~i10) & 33);
                    int i12 = -(-((i10 & 33) << 1));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        } else if (drawable == drawable2) {
            if (getCallback() != null) {
                int i15 = a;
                i = (((i15 & (-16)) | ((~i15) & 15)) - (~((i15 & 15) << 1))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    getCallback().unscheduleDrawable(this, runnable);
                    throw null;
                }
                getCallback().unscheduleDrawable(this, runnable);
                int i16 = b;
                int i17 = (i16 & (-34)) | ((~i16) & 33);
                int i18 = -(-((i16 & 33) << 1));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = b;
        int i21 = (i20 ^ 68) + ((i20 & 68) << 1);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i4 = -(((~i2) & 49) | (i2 & (-50)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        aPC apc = this.e;
        int minimumWidth = 0;
        if (!apc.n) {
            Drawable drawable = this.g;
            if (drawable != null) {
                int i7 = a;
                int i8 = i7 ^ 61;
                int i9 = (((i7 & 61) | i8) << 1) - i8;
                b = i9 % 128;
                int i10 = i9 % 2;
                minimumWidth = drawable.getMinimumWidth();
                int i11 = b;
                int i12 = i11 & 37;
                int i13 = (i12 - (~(-(-((i11 ^ 37) | i12))))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = b;
                int i16 = ((i15 & 118) + (i15 | 118)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = a;
            int i19 = i18 | 87;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 87)) & i19);
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            return minimumWidth;
        }
        int i24 = b;
        int i25 = i24 | 33;
        int i26 = i25 << 1;
        int i27 = -((~(i24 & 33)) & i25);
        int i28 = (i26 & i27) + (i27 | i26);
        a = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 29 / 0;
            if (!apc.p) {
                apc.d();
                int i30 = a;
                int i31 = ((i30 ^ 79) | (i30 & 79)) << 1;
                int i32 = -(((~i30) & 79) | (i30 & (-80)));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                b = i33 % 128;
                int i34 = i33 % 2;
            }
        } else if (!apc.p) {
            apc.d();
            int i35 = a;
            int i36 = ((i35 ^ 79) | (i35 & 79)) << 1;
            int i37 = -(((~i35) & 79) | (i35 & (-80)));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = apc.r;
        int i41 = a + 69;
        b = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 21 / 0;
        }
        return i40;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        aPC apc = this.e;
        int i6 = this.k;
        int i7 = i3 + 7;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = apc.k;
        Drawable[] drawableArr = apc.j;
        int i10 = a + 37;
        b = i10 % 128;
        boolean z = i10 % 2 != 0;
        int i11 = 0;
        while (i11 < i9) {
            int i12 = b + 83;
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                int i15 = ((i13 ^ 125) | (i13 & 125)) << 1;
                int i16 = -(((~i13) & 125) | (i13 & (-126)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                boolean layoutDirection = drawable.setLayoutDirection(i);
                int i19 = a;
                int i20 = i19 + 113;
                b = i20 % 128;
                Object obj = null;
                if (i20 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i11 == i6) {
                    int i21 = i19 + 115;
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        throw null;
                    }
                    z = layoutDirection;
                } else {
                    continue;
                }
            }
            int i22 = (i11 | 1) << 1;
            int i23 = -(((~i11) & 1) | (i11 & (-2)));
            i11 = ((i22 | i23) << 1) - (i23 ^ i22);
            int i24 = a;
            int i25 = ((i24 & (-38)) | ((~i24) & 37)) + ((i24 & 37) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        apc.A = i;
        int i27 = a;
        int i28 = ((i27 ^ 67) | (i27 & 67)) << 1;
        int i29 = -(((~i27) & 67) | (i27 & (-68)));
        int i30 = (i28 & i29) + (i29 | i28);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 67 / 0;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 | 3) << 1) - (i6 ^ 3);
        b = i7 % 128;
        int i8 = i7 % 2;
        Rect rect = this.f;
        if (rect == null) {
            this.f = new Rect(i, i2, i3, i4);
            int i9 = a;
            int i10 = ((i9 ^ 67) - (~((i9 & 67) << 1))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            rect.set(i, i2, i3, i4);
            int i12 = a;
            int i13 = (i12 ^ 82) + ((i12 & 82) << 1);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 4;
            }
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            int i16 = b;
            int i17 = i16 & 107;
            int i18 = -(-((i16 ^ 107) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            int i20 = i19 % 2;
            drawable.setHotspotBounds(i, i2, i3, i4);
            int i21 = a + 5;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 2 / 4;
            }
        }
        int i23 = b;
        int i24 = (i23 & 27) + (i23 | 27);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e A[PHI: r2
  0x001e: PHI (r2v4 android.graphics.drawable.Drawable) = (r2v3 android.graphics.drawable.Drawable), (r2v14 android.graphics.drawable.Drawable) binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 85) + (i2 | 85);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            drawable = this.g;
            int i4 = 23 / 0;
            if (drawable != null) {
                int i5 = i2 & 5;
                int i6 = ((i2 ^ 5) | i5) << 1;
                int i7 = -((i2 | 5) & (~i5));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                drawable.draw(canvas);
                int i10 = a + 73;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            drawable = this.g;
            if (drawable != null) {
                int i12 = i2 & 5;
                int i13 = ((i2 ^ 5) | i12) << 1;
                int i14 = -((i2 | 5) & (~i12));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                drawable.draw(canvas);
                int i17 = a + 73;
                b = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            int i19 = b + 113;
            a = i19 % 128;
            int i20 = i19 % 2;
            drawable2.draw(canvas);
            int i21 = b;
            int i22 = (i21 & 82) + (i21 | 82);
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = a;
        int i26 = ((i25 ^ 53) | (i25 & 53)) << 1;
        int i27 = -(((~i25) & 53) | (i25 & (-54)));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f A[PHI: r6
  0x006f: PHI (r6v17 android.graphics.drawable.Drawable) = (r6v16 android.graphics.drawable.Drawable), (r6v38 android.graphics.drawable.Drawable) binds: [B:17:0x006d, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    public boolean f(int i) {
        Runnable runnable;
        Drawable drawable;
        int i2;
        long j;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 125;
        int i6 = ((i4 ^ 125) | i5) << 1;
        int i7 = -((i4 | 125) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        Object obj = null;
        if (i == this.k) {
            int i11 = ((i9 ^ 72) + ((i9 & 72) << 1)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i9 ^ 41;
            int i14 = -(-((i9 & 41) << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.e.E > 0) {
            int i16 = a;
            int i17 = i16 & 45;
            int i18 = (i16 ^ 45) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                drawable = this.i;
                int i20 = 28 / 0;
                if (drawable != null) {
                    drawable.setVisible(false, false);
                    int i21 = a;
                    int i22 = (-2) - (((i21 & 84) + (i21 | 84)) ^ (-1));
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else {
                drawable = this.i;
                if (drawable != null) {
                    drawable.setVisible(false, false);
                    int i24 = a;
                    int i25 = (-2) - (((i24 & 84) + (i24 | 84)) ^ (-1));
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            Drawable drawable2 = this.g;
            if (drawable2 != null) {
                int i27 = a;
                int i28 = i27 ^ 41;
                int i29 = (i27 & 41) << 1;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    this.i = drawable2;
                    j = this.e.E;
                    int i31 = 53 / 0;
                } else {
                    this.i = drawable2;
                    j = this.e.E;
                }
                this.n = j + jUptimeMillis;
                int i32 = b;
                i2 = ((i32 & 57) - (~(-(-(i32 | 57))))) - 1;
            } else {
                this.i = null;
                this.n = 0L;
                int i33 = b;
                i2 = (i33 & 95) + (i33 | 95);
            }
            a = i2 % 128;
            int i34 = i2 % 2;
        } else {
            Drawable drawable3 = this.g;
            if (drawable3 != null) {
                int i35 = b;
                int i36 = ((i35 ^ 26) + ((i35 & 26) << 1)) - 1;
                a = i36 % 128;
                int i37 = i36 % 2;
                drawable3.setVisible(false, false);
                int i38 = a;
                int i39 = (i38 & 111) + (i38 | 111);
                b = i39 % 128;
                int i40 = i39 % 2;
            }
        }
        if (i >= 0) {
            int i41 = b + 9;
            a = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = this.e.k;
                throw null;
            }
            aPC apc = this.e;
            if (i < apc.k) {
                int i43 = a;
                int i44 = i43 ^ 15;
                int i45 = -(-((i43 & 15) << 1));
                int i46 = (i44 & i45) + (i45 | i44);
                b = i46 % 128;
                int i47 = i46 % 2;
                Drawable drawableF = apc.f(i);
                this.g = drawableF;
                int i48 = b;
                int i49 = i48 & 75;
                int i50 = i48 | 75;
                int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                a = i51 % 128;
                int i52 = i51 % 2;
                this.k = i;
                if (drawableF != null) {
                    int i53 = i48 & 51;
                    int i54 = ((i48 | 51) & (~i53)) + (i53 << 1);
                    a = i54 % 128;
                    if (i54 % 2 == 0) {
                        int i55 = this.e.C;
                        throw null;
                    }
                    int i56 = this.e.C;
                    if (i56 > 0) {
                        this.m = jUptimeMillis + ((long) i56);
                        int i57 = b + 49;
                        a = i57 % 128;
                        int i58 = i57 % 2;
                    }
                    e(drawableF);
                    int i59 = a;
                    int i60 = i59 & 29;
                    int i61 = (i59 ^ 29) | i60;
                    int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                }
            } else {
                this.g = null;
                this.k = -1;
                int i64 = a;
                int i65 = (i64 ^ 107) + ((i64 & 107) << 1);
                b = i65 % 128;
                int i66 = i65 % 2;
            }
        } else {
            this.g = null;
            this.k = -1;
            int i67 = a;
            int i68 = (i67 ^ 107) + ((i67 & 107) << 1);
            b = i68 % 128;
            int i69 = i68 % 2;
        }
        if (this.m == 0) {
            int i70 = b;
            int i71 = i70 & 113;
            int i72 = ((i70 ^ 113) | i71) << 1;
            int i73 = -((i70 | 113) & (~i71));
            int i74 = (i72 & i73) + (i73 | i72);
            a = i74 % 128;
            int i75 = i74 % 2;
            if (this.n != 0) {
                runnable = this.l;
                if (runnable == null) {
                    this.l = new aPP();
                    int i76 = a;
                    int i77 = (((i76 & (-56)) | ((~i76) & 55)) - (~((i76 & 55) << 1))) - 1;
                    b = i77 % 128;
                    int i78 = i77 % 2;
                } else {
                    unscheduleSelf(runnable);
                    int i79 = a;
                    int i80 = i79 & 77;
                    int i81 = ((i79 ^ 77) | i80) << 1;
                    int i82 = -((i79 | 77) & (~i80));
                    int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                    b = i83 % 128;
                    int i84 = i83 % 2;
                }
                c(true);
                int i85 = a;
                int i86 = ((i85 | 25) << 1) - (i85 ^ 25);
                b = i86 % 128;
                int i87 = i86 % 2;
            }
        } else {
            runnable = this.l;
            if (runnable == null) {
                this.l = new aPP();
                int i710 = a;
                int i711 = (((i710 & (-56)) | ((~i710) & 55)) - (~((i710 & 55) << 1))) - 1;
                b = i711 % 128;
                int i712 = i711 % 2;
            } else {
                unscheduleSelf(runnable);
                int i713 = a;
                int i88 = i713 & 77;
                int i89 = ((i713 ^ 77) | i88) << 1;
                int i810 = -((i713 | 77) & (~i88));
                int i811 = ((i89 | i810) << 1) - (i810 ^ i89);
                b = i811 % 128;
                int i812 = i811 % 2;
            }
            c(true);
            int i813 = a;
            int i814 = ((i813 | 25) << 1) - (i813 ^ 25);
            b = i814 % 128;
            int i815 = i814 % 2;
        }
        invalidateSelf();
        int i90 = b;
        int i91 = (i90 & 99) + (i90 | 99);
        a = i91 % 128;
        if (i91 % 2 == 0) {
            int i92 = 79 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int intrinsicHeight;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z = this.e.n;
            obj.hashCode();
            throw null;
        }
        aPC apc = this.e;
        if (!apc.n) {
            Drawable drawable = this.g;
            if (drawable != null) {
                int i6 = b;
                int i7 = (i6 | 25) << 1;
                int i8 = -(i6 ^ 25);
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                intrinsicHeight = drawable.getIntrinsicHeight();
                int i11 = a;
                int i12 = i11 & 89;
                int i13 = i11 | 89;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = a + 102;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                intrinsicHeight = -1;
            }
            int i19 = b;
            int i20 = ((i19 | 21) << 1) - (i19 ^ 21);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                return intrinsicHeight;
            }
            obj.hashCode();
            throw null;
        }
        int i21 = b;
        int i22 = i21 ^ 83;
        int i23 = ((((i21 & 83) | i22) << 1) - (~(-i22))) - 1;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 65 / 0;
            if (!apc.p) {
                int i25 = a;
                int i26 = i25 | 3;
                int i27 = i26 << 1;
                int i28 = -((~(i25 & 3)) & i26);
                int i29 = (i27 & i28) + (i28 | i27);
                b = i29 % 128;
                int i30 = i29 % 2;
                apc.d();
                int i31 = a;
                int i32 = (i31 ^ 23) + ((i31 & 23) << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
        } else if (!apc.p) {
            int i210 = a;
            int i211 = i210 | 3;
            int i212 = i211 << 1;
            int i213 = -((~(i210 & 3)) & i211);
            int i214 = (i212 & i213) + (i213 | i212);
            b = i214 % 128;
            int i34 = i214 % 2;
            apc.d();
            int i35 = a;
            int i36 = (i35 ^ 23) + ((i35 & 23) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = apc.q;
        int i39 = b;
        int i40 = (((i39 & (-4)) | ((~i39) & 3)) - (~((i39 & 3) << 1))) - 1;
        a = i40 % 128;
        int i41 = i40 % 2;
        return i38;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int minimumHeight;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i2 ^ 121) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z = this.e.n;
            throw null;
        }
        aPC apc = this.e;
        if (!(!apc.n)) {
            if (!apc.p) {
                int i6 = a + 124;
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                apc.d();
                int i9 = a;
                int i10 = (-2) - (((i9 ^ 90) + ((i9 & 90) << 1)) ^ (-1));
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 / 5;
                }
            }
            int i12 = apc.t;
            int i13 = a;
            int i14 = i13 & 43;
            int i15 = -(-((i13 ^ 43) | i14));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            return i12;
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            int i18 = a;
            int i19 = i18 & 123;
            int i20 = -(-((i18 ^ 123) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                drawable.getMinimumHeight();
                obj.hashCode();
                throw null;
            }
            minimumHeight = drawable.getMinimumHeight();
            int i22 = b;
            int i23 = (((i22 ^ 5) | (i22 & 5)) << 1) - (((~i22) & 5) | (i22 & (-6)));
            a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = b;
            int i26 = i25 & 33;
            int i27 = i25 | 33;
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            minimumHeight = 0;
        }
        int i30 = b;
        int i31 = i30 & 19;
        int i32 = i31 + ((i30 ^ 19) | i31);
        a = i32 % 128;
        int i33 = i32 % 2;
        return minimumHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-42)) | ((~i2) & 41)) - (~(-(-((i2 & 41) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            boolean state = drawable.setState(iArr);
            int i5 = b;
            int i6 = ((i5 ^ 83) | (i5 & 83)) << 1;
            int i7 = -(((~i5) & 83) | (i5 & (-84)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 40 / 0;
            }
            return state;
        }
        Drawable drawable2 = this.g;
        if (drawable2 == null) {
            int i10 = i4 & 123;
            int i11 = (i4 ^ 123) | i10;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i13 = i4 + 15;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            drawable2.setState(iArr);
            throw null;
        }
        boolean state2 = drawable2.setState(iArr);
        int i14 = a + 69;
        b = i14 % 128;
        int i15 = i14 % 2;
        return state2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:9:0x003d  */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((((i5 ^ 51) | (i5 & 51)) << 1) - (~(-(((~i5) & 51) | (i5 & (-52)))))) - 1;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (!this.j) {
            this.j = true;
            this.h = i;
            drawable = this.g;
            int i8 = (i7 ^ 3) + ((i7 & 3) << 1);
            i2 = i8 % 128;
            a = i2;
            int i9 = i8 % 2;
            if (drawable != null) {
                int i10 = ((i2 | 73) << 1) - (i2 ^ 73);
                b = i10 % 128;
                i3 = i10 % 2;
                long j = this.m;
                if (i3 != 0 ? j == 0 : j == 0) {
                    int i11 = (i2 ^ 73) + ((i2 & 73) << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    drawable.setAlpha(i);
                    int i13 = b;
                    int i14 = i13 & 45;
                    int i15 = -(-((i13 ^ 45) | i14));
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                c(false);
                int i17 = a;
                int i18 = i17 ^ 123;
                int i19 = (i17 & 123) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                int i21 = i20 % 2;
            }
        } else {
            int i22 = i7 & 31;
            int i23 = ((((i7 ^ 31) | i22) << 1) - (~(-((~i22) & (i7 | 31))))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            if (this.h != i) {
                this.j = true;
                this.h = i;
                drawable = this.g;
                int i25 = (i7 ^ 3) + ((i7 & 3) << 1);
                i2 = i25 % 128;
                a = i2;
                int i26 = i25 % 2;
                if (drawable != null) {
                    int i110 = ((i2 | 73) << 1) - (i2 ^ 73);
                    b = i110 % 128;
                    i3 = i110 % 2;
                    long j2 = this.m;
                    if (i3 != 0) {
                        c(false);
                        int i111 = a;
                        int i112 = i111 ^ 123;
                        int i113 = (i111 & 123) << 1;
                        int i27 = (i112 & i113) + (i113 | i112);
                        b = i27 % 128;
                        int i28 = i27 % 2;
                    } else {
                        c(false);
                        int i114 = a;
                        int i115 = i114 ^ 123;
                        int i116 = (i114 & 123) << 1;
                        int i29 = (i115 & i116) + (i116 | i115);
                        b = i29 % 128;
                        int i210 = i29 % 2;
                    }
                }
            }
        }
        int i30 = b;
        int i31 = i30 ^ 123;
        int i32 = ((((i30 & 123) | i31) << 1) - (~(-i31))) - 1;
        a = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 79 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 5) + (i2 | 5);
        b = i3 % 128;
        int i4 = i3 % 2;
        aPC apc = this.e;
        apc.K = true;
        if (apc.I != colorStateList) {
            int i5 = a;
            int i6 = i5 & 43;
            int i7 = i6 + ((i5 ^ 43) | i6);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                apc.I = colorStateList;
                j.c(this.g, colorStateList);
                int i8 = 63 / 0;
            } else {
                apc.I = colorStateList;
                j.c(this.g, colorStateList);
            }
            int i9 = b;
            int i10 = i9 & 115;
            int i11 = ((i9 ^ 115) | i10) << 1;
            int i12 = -((i9 | 115) & (~i10));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = i15 & 17;
        int i17 = (i16 - (~((i15 ^ 17) | i16))) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.i;
        if (drawable != null) {
            int i4 = b + 51;
            a = i4 % 128;
            int i5 = i4 % 2;
            drawable.setVisible(z, z2);
            int i6 = a;
            int i7 = ((i6 | 11) << 1) - (i6 ^ 11);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            int i9 = a;
            int i10 = (i9 ^ 13) + ((i9 & 13) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            drawable2.setVisible(z, z2);
            int i12 = a;
            int i13 = (i12 & (-92)) | ((~i12) & 91);
            int i14 = -(-((i12 & 91) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = ((i17 & (-30)) | ((~i17) & 29)) + ((i17 & 29) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        return visible;
    }

    public void c(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = i2 | 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.j = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.g;
        int i7 = a;
        int i8 = i7 ^ 77;
        int i9 = ((((i7 & 77) | i8) << 1) - (~(-i8))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        if (drawable != null) {
            int i11 = i7 + 99;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            long j = this.m;
            if (j != 0) {
                int i14 = i12 + 117;
                a = i14 % 128;
                int i15 = i14 % 2;
                if (j <= jUptimeMillis) {
                    int i16 = i12 + 85;
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        drawable.setAlpha(this.h);
                        throw null;
                    }
                    drawable.setAlpha(this.h);
                    this.m = 0L;
                    int i17 = a;
                    int i18 = i17 & 81;
                    int i19 = ((((i17 ^ 81) | i18) << 1) - (~(-((i17 | 81) & (~i18))))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = a;
                    int i22 = i21 & 113;
                    int i23 = -(-(i21 | 113));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    int i26 = (int) ((j - jUptimeMillis) * 255);
                    int i27 = this.e.C;
                    int i28 = b;
                    int i29 = i28 & 121;
                    int i30 = ((i28 ^ 121) | i29) << 1;
                    int i31 = -((i28 | 121) & (~i29));
                    int i32 = (i30 & i31) + (i31 | i30);
                    int i33 = i32 % 128;
                    a = i33;
                    int i34 = i32 % 2;
                    int i35 = -(i26 / i27);
                    int i36 = i35 & 255;
                    int i37 = (((((i35 ^ 255) | i36) << 1) - (~(-((i35 | 255) & (~i36))))) - 1) * this.h;
                    int i38 = i33 ^ 9;
                    int i39 = ((i33 & 9) | i38) << 1;
                    int i40 = -i38;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    b = i41 % 128;
                    if (i41 % 2 != 0) {
                        int i42 = i37 | (-1744);
                        drawable.setAlpha((i42 << 1) - (i42 & (~(i37 & (-1744)))));
                    } else {
                        drawable.setAlpha(i37 / 255);
                        z2 = true;
                    }
                }
            } else {
                int i210 = a;
                int i211 = i210 & 113;
                int i212 = -(-(i210 | 113));
                int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                b = i213 % 128;
                int i214 = i213 % 2;
            }
            z2 = false;
        } else {
            this.m = 0L;
            int i110 = a;
            int i111 = i110 & 81;
            int i112 = ((((i110 ^ 81) | i111) << 1) - (~(-((i110 | 81) & (~i111))))) - 1;
            b = i112 % 128;
            int i215 = i112 % 2;
            int i216 = a;
            int i217 = i216 & 113;
            int i218 = -(-(i216 | 113));
            int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
            b = i219 % 128;
            int i2110 = i219 % 2;
            z2 = false;
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            int i43 = b;
            int i44 = i43 & 7;
            int i45 = (i43 ^ 7) | i44;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            int i47 = i46 % 128;
            a = i47;
            int i48 = i46 % 2;
            long j2 = this.n;
            if (j2 != 0) {
                int i49 = ((i47 ^ 20) + ((i47 & 20) << 1)) - 1;
                b = i49 % 128;
                if (i49 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (j2 <= jUptimeMillis) {
                    drawable2.setVisible(false, false);
                    this.i = null;
                    int i50 = a;
                    int i51 = ((i50 & 56) + (i50 | 56)) - 1;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    this.n = 0L;
                    int i53 = a;
                    int i54 = (((i53 | 96) << 1) - (i53 ^ 96)) - 1;
                    b = i54 % 128;
                    int i55 = i54 % 2;
                } else {
                    boolean z3 = false;
                    int i56 = this.e.E;
                    int i57 = a + 71;
                    int i58 = i57 % 128;
                    b = i58;
                    int i59 = i57 % 2;
                    int i60 = ((((int) ((j2 - jUptimeMillis) * 255)) / i56) * this.h) / 255;
                    int i61 = ((i58 ^ 34) + ((i58 & 34) << 1)) - 1;
                    a = i61 % 128;
                    if (i61 % 2 == 0) {
                        drawable2.setAlpha(i60);
                    } else {
                        drawable2.setAlpha(i60);
                        z3 = true;
                    }
                    int i62 = a;
                    int i63 = (i62 | 31) << 1;
                    int i64 = -(((~i62) & 31) | (i62 & (-32)));
                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                    b = i65 % 128;
                    int i66 = i65 % 2;
                    z2 = z3;
                }
            }
        } else {
            this.n = 0L;
            int i510 = a;
            int i511 = (((i510 | 96) << 1) - (i510 ^ 96)) - 1;
            b = i511 % 128;
            int i512 = i511 % 2;
        }
        if (z) {
            int i67 = a;
            int i68 = (i67 & 118) + (i67 | 118);
            int i69 = (i68 ^ (-1)) + (i68 << 1);
            b = i69 % 128;
            int i70 = i69 % 2;
            if (z2) {
                int i71 = i67 + 109;
                b = i71 % 128;
                int i72 = i71 % 2;
                scheduleSelf(this.l, jUptimeMillis + 16);
                int i73 = a;
                int i74 = i73 ^ 49;
                int i75 = -(-((i73 & 49) << 1));
                int i76 = (i74 & i75) + (i75 | i74);
                b = i76 % 128;
                int i77 = i76 % 2;
            }
        }
        int i78 = a;
        int i79 = i78 & 11;
        int i80 = -(-((i78 ^ 11) | i79));
        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
        b = i81 % 128;
        int i82 = i81 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 7;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 7)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (!this.d) {
            int i8 = (((i2 | 3) << 1) - (~(-(i2 ^ 3)))) - 1;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 10 / 0;
                if (super.mutate() == this) {
                    aPC apcD = d();
                    apcD.h();
                    g(apcD);
                    int i10 = b;
                    int i11 = i10 & 125;
                    int i12 = ((i10 ^ 125) | i11) << 1;
                    int i13 = -((i10 | 125) & (~i11));
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    this.d = true;
                }
            } else if (super.mutate() == this) {
                aPC apcD2 = d();
                apcD2.h();
                g(apcD2);
                int i16 = b;
                int i17 = i16 & 125;
                int i18 = ((i16 ^ 125) | i17) << 1;
                int i19 = -((i16 | 125) & (~i17));
                int i110 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i110 % 128;
                int i111 = i110 % 2;
                this.d = true;
            }
        }
        int i20 = b;
        int i21 = (((i20 | 20) << 1) - (i20 ^ 20)) - 1;
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 35) - (~(-(-(i2 | 35))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        aPC apc = this.e;
        apc.G = true;
        int i5 = a;
        int i6 = ((i5 | 9) << 1) - (i5 ^ 9);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (apc.F != colorFilter) {
            int i8 = b;
            int i9 = ((i8 ^ 63) | (i8 & 63)) << 1;
            int i10 = -(((~i8) & 63) | (i8 & (-64)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            apc.F = colorFilter;
            Drawable drawable = this.g;
            if (drawable != null) {
                int i13 = a;
                int i14 = (i13 & 49) + (i13 | 49);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    drawable.setColorFilter(colorFilter);
                    int i15 = 70 / 0;
                } else {
                    drawable.setColorFilter(colorFilter);
                }
            }
        }
        int i16 = a;
        int i17 = ((i16 | 21) << 1) - (i16 ^ 21);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 111) | (i2 & 111)) << 1) - (~(-(((~i2) & 111) | (i2 & (-112)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        aPC apc = this.e;
        int intrinsicWidth = -1;
        if (apc.n) {
            int i5 = b + 79;
            a = i5 % 128;
            int i6 = i5 % 2;
            if (!apc.p) {
                int i7 = b;
                int i8 = (-2) - (((i7 ^ 122) + ((i7 & 122) << 1)) ^ (-1));
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    apc.d();
                    int i9 = 62 / 0;
                } else {
                    apc.d();
                }
                int i10 = b;
                int i11 = (-2) - ((((i10 | 52) << 1) - (i10 ^ 52)) ^ (-1));
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = apc.f106o;
            int i14 = b;
            int i15 = ((i14 & 13) - (~(-(-(i14 | 13))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return i13;
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            int i17 = a;
            int i18 = i17 ^ 97;
            int i19 = ((i17 & 97) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 & i20) + (i19 | i20);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                drawable.getIntrinsicWidth();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            intrinsicWidth = drawable.getIntrinsicWidth();
            int i22 = a;
            int i23 = i22 & 31;
            int i24 = i22 | 31;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 3 % 4;
            }
        } else {
            int i27 = b;
            int i28 = i27 & 39;
            int i29 = (i27 ^ 39) | i28;
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = a;
        int i33 = ((i32 ^ 113) | (i32 & 113)) << 1;
        int i34 = -(((~i32) & 113) | (i32 & (-114)));
        int i35 = (i33 & i34) + (i34 | i33);
        b = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 20 / 0;
        }
        return intrinsicWidth;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void e(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a + 117;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
            if (this.f105o == null) {
                this.f105o = new aPQ();
                int i4 = a;
                int i5 = (((i4 ^ 29) | (i4 & 29)) << 1) - (((~i4) & 29) | (i4 & (-30)));
                b = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (this.f105o == null) {
            this.f105o = new aPQ();
            int i7 = a;
            int i8 = (((i7 ^ 29) | (i7 & 29)) << 1) - (((~i7) & 29) | (i7 & (-30)));
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        aPQ apq = this.f105o;
        apq.c = drawable.getCallback();
        int i10 = b;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = -(-((i10 & 67) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        try {
            if (i13 % 2 == 0) {
                drawable.setCallback(apq);
                int i14 = this.e.C;
                throw null;
            }
            drawable.setCallback(apq);
            if (this.e.C <= 0) {
                int i15 = a;
                int i16 = ((i15 & (-92)) | ((~i15) & 91)) + ((i15 & 91) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                if (!(!this.j)) {
                    int i18 = i15 & 125;
                    int i19 = (i15 ^ 125) | i18;
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        drawable.setAlpha(this.h);
                        throw null;
                    }
                    drawable.setAlpha(this.h);
                }
            }
            aPC apc = this.e;
            if (apc.G) {
                int i21 = b + 51;
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    drawable.setColorFilter(apc.F);
                    throw null;
                }
                drawable.setColorFilter(apc.F);
            } else {
                if (apc.K) {
                    int i22 = b + 45;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    drawable.setTintList(apc.I);
                    int i24 = a;
                    int i25 = i24 & 77;
                    int i26 = ((((i24 ^ 77) | i25) << 1) - (~(-((i24 | 77) & (~i25))))) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
                aPC apc2 = this.e;
                if (apc2.H) {
                    int i28 = a + 39;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    drawable.setTintMode(apc2.J);
                    int i30 = b;
                    int i31 = i30 & 41;
                    int i32 = (i30 | 41) & (~i31);
                    int i33 = -(-(i31 << 1));
                    int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
            drawable.setVisible(isVisible(), true);
            int i36 = a;
            int i37 = (i36 ^ 125) + ((i36 & 125) << 1);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                drawable.setDither(this.e.v);
                getState();
                throw null;
            }
            drawable.setDither(this.e.v);
            int[] state = getState();
            int i38 = a;
            int i39 = ((i38 & 7) - (~(i38 | 7))) - 1;
            b = i39 % 128;
            if (i39 % 2 != 0) {
                drawable.setState(state);
                drawable.setLevel(getLevel());
                throw null;
            }
            drawable.setState(state);
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int layoutDirection = getLayoutDirection();
            int i40 = b;
            int i41 = (i40 ^ 49) + ((i40 & 49) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
            drawable.setLayoutDirection(layoutDirection);
            boolean z = this.e.D;
            int i43 = a;
            int i44 = (i43 | 27) << 1;
            int i45 = -(i43 ^ 27);
            int i46 = (i44 & i45) + (i45 | i44);
            b = i46 % 128;
            int i47 = i46 % 2;
            drawable.setAutoMirrored(z);
            Rect rect = this.f;
            int i48 = b;
            int i49 = i48 & 67;
            int i50 = ((i48 ^ 67) | i49) << 1;
            int i51 = -((i48 | 67) & (~i49));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            int i53 = i52 % 128;
            a = i53;
            int i54 = i52 % 2;
            if (rect != null) {
                int i55 = (i53 ^ 87) + ((i53 & 87) << 1);
                b = i55 % 128;
                if (i55 % 2 != 0) {
                    int i56 = rect.left;
                    int i57 = rect.top;
                    throw null;
                }
                int i58 = rect.left;
                int i59 = rect.top;
                int i60 = rect.right;
                int i61 = rect.bottom;
                int i62 = a;
                int i63 = ((i62 | 74) << 1) - (i62 ^ 74);
                int i64 = (i63 ^ (-1)) + (i63 << 1);
                b = i64 % 128;
                int i65 = i64 % 2;
                drawable.setHotspotBounds(i58, i59, i60, i61);
                int i66 = b;
                int i67 = i66 & 83;
                int i68 = (i66 | 83) & (~i67);
                int i69 = i67 << 1;
                int i70 = (i68 & i69) + (i68 | i69);
                a = i70 % 128;
                int i71 = i70 % 2;
            }
            aPQ apq2 = this.f105o;
            Drawable.Callback callback = apq2.c;
            int i72 = a;
            int i73 = (i72 & 15) + (i72 | 15);
            b = i73 % 128;
            if (i73 % 2 == 0) {
                apq2.c = null;
                drawable.setCallback(callback);
            } else {
                apq2.c = null;
                drawable.setCallback(callback);
                int i74 = 43 / 0;
            }
        } catch (Throwable th) {
            aPQ apq3 = this.f105o;
            Drawable.Callback callback2 = apq3.c;
            apq3.c = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1
  0x0031: PHI (r1v25 ivas.gov.bisp.enumeration.n.h$aPC) = (r1v4 ivas.gov.bisp.enumeration.n.h$aPC), (r1v33 ivas.gov.bisp.enumeration.n.h$aPC) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5 A[LOOP:0: B:19:0x006e->B:31:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 ivas.gov.bisp.enumeration.n.h$aPC) = (r1v4 ivas.gov.bisp.enumeration.n.h$aPC), (r1v33 ivas.gov.bisp.enumeration.n.h$aPC) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        aPC apc;
        boolean z;
        aPC apc2;
        int i;
        int i2;
        int i3;
        Drawable[] drawableArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = a + 75;
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            apc = this.e;
            if (!(!apc.y)) {
                z = apc.z;
                int i10 = b;
                int i11 = (i10 ^ 91) + ((i10 & 91) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                apc.e();
                apc.y = true;
                i2 = a + 117;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i13 = apc.k;
                    Drawable[] drawableArr2 = apc.j;
                    obj.hashCode();
                    throw null;
                }
                i3 = apc.k;
                drawableArr = apc.j;
                int i14 = b;
                int i15 = i14 ^ 91;
                int i16 = (i14 & 91) << 1;
                i4 = (i15 ^ i16) + ((i15 & i16) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                int i17 = i14 | 29;
                i6 = (i17 << 1) - ((~(i14 & 29)) & i17);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i18 = 5 / 3;
                }
                while (true) {
                    if (i5 < i3) {
                        int i19 = a;
                        int i20 = i19 ^ 63;
                        int i21 = ((((i19 & 63) | i20) << 1) - (~(-i20))) - 1;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        if (drawableArr[i5].getConstantState() == null) {
                            i7 = b + 99;
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                apc.z = true;
                                z = true;
                            } else {
                                apc.z = false;
                                z = false;
                            }
                        } else {
                            int i23 = i5 & (-52);
                            int i24 = (i5 ^ (-52)) | i23;
                            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                            int i26 = i25 & 53;
                            int i27 = (~i26) & (i25 | 53);
                            int i28 = i26 << 1;
                            i5 = ((i27 | i28) << 1) - (i28 ^ i27);
                            int i29 = a;
                            int i30 = i29 & 97;
                            int i31 = -(-((i29 ^ 97) | i30));
                            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                            b = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    } else {
                        apc.z = true;
                        int i34 = b;
                        int i35 = i34 & 5;
                        int i36 = (i34 | 5) & (~i35);
                        int i37 = i35 << 1;
                        int i38 = (i36 & i37) + (i36 | i37);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                    }
                }
            }
            if (!z) {
                int i40 = b;
                int i41 = i40 & 61;
                i = ((((i40 ^ 61) | i41) << 1) - (~(-((i40 | 61) & (~i41))))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
        } else {
            apc = this.e;
            if (apc.y) {
                z = apc.z;
                int i110 = b;
                int i111 = (i110 ^ 91) + ((i110 & 91) << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
            } else {
                apc.e();
                apc.y = true;
                i2 = a + 117;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i113 = apc.k;
                    Drawable[] drawableArr3 = apc.j;
                    obj.hashCode();
                    throw null;
                }
                i3 = apc.k;
                drawableArr = apc.j;
                int i114 = b;
                int i115 = i114 ^ 91;
                int i116 = (i114 & 91) << 1;
                i4 = (i115 ^ i116) + ((i115 & i116) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                int i117 = i114 | 29;
                i6 = (i117 << 1) - ((~(i114 & 29)) & i117);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i118 = 5 / 3;
                }
                while (true) {
                    if (i5 < i3) {
                        int i119 = a;
                        int i210 = i119 ^ 63;
                        int i211 = ((((i119 & 63) | i210) << 1) - (~(-i210))) - 1;
                        b = i211 % 128;
                        int i212 = i211 % 2;
                        if (drawableArr[i5].getConstantState() == null) {
                            i7 = b + 99;
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                apc.z = true;
                                z = true;
                            } else {
                                apc.z = false;
                                z = false;
                            }
                        } else {
                            int i213 = i5 & (-52);
                            int i214 = (i5 ^ (-52)) | i213;
                            int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                            int i216 = i215 & 53;
                            int i217 = (~i216) & (i215 | 53);
                            int i218 = i216 << 1;
                            i5 = ((i217 | i218) << 1) - (i218 ^ i217);
                            int i219 = a;
                            int i310 = i219 & 97;
                            int i311 = -(-((i219 ^ 97) | i310));
                            int i312 = ((i310 | i311) << 1) - (i311 ^ i310);
                            b = i312 % 128;
                            int i313 = i312 % 2;
                        }
                    } else {
                        apc.z = true;
                        int i314 = b;
                        int i315 = i314 & 5;
                        int i316 = (i314 | 5) & (~i315);
                        int i317 = i315 << 1;
                        int i318 = (i316 & i317) + (i316 | i317);
                        a = i318 % 128;
                        int i319 = i318 % 2;
                    }
                }
            }
            if (!z) {
                int i42 = b;
                int i43 = i42 & 61;
                i = ((((i42 ^ 61) | i43) << 1) - (~(-((i42 | 61) & (~i43))))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
        }
        int i44 = b;
        int i45 = i44 ^ 31;
        int i46 = (i44 & 31) << 1;
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        a = i47 % 128;
        if (i47 % 2 == 0) {
            this.e.g = getChangingConfigurations();
            apc2 = this.e;
            int i48 = 63 / 0;
        } else {
            this.e.g = getChangingConfigurations();
            apc2 = this.e;
        }
        int i49 = b;
        int i50 = i49 & 101;
        int i51 = i49 | 101;
        int i52 = (i50 & i51) + (i51 | i50);
        a = i52 % 128;
        if (i52 % 2 != 0) {
            return apc2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d A[PHI: r2
  0x001d: PHI (r2v3 android.graphics.drawable.Drawable) = (r2v2 android.graphics.drawable.Drawable), (r2v38 android.graphics.drawable.Drawable) binds: [B:8:0x001b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 71;
        int i5 = i4 % 128;
        b = i5;
        boolean z = false;
        if (i4 % 2 != 0) {
            drawable = this.i;
            int i6 = 32 / 0;
            if (drawable != null) {
                int i7 = i3 ^ 1;
                i = ((((i3 & 1) | i7) << 1) - (~(-i7))) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    drawable.jumpToCurrentState();
                    this.i = null;
                } else {
                    drawable.jumpToCurrentState();
                    this.i = null;
                    z = true;
                }
            } else {
                int i8 = (i5 & (-26)) | ((~i5) & 25);
                int i9 = -(-((i5 & 25) << 1));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            drawable = this.i;
            if (drawable != null) {
                int i12 = i3 ^ 1;
                i = ((((i3 & 1) | i12) << 1) - (~(-i12))) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    drawable.jumpToCurrentState();
                    this.i = null;
                } else {
                    drawable.jumpToCurrentState();
                    this.i = null;
                    z = true;
                }
            } else {
                int i13 = (i5 & (-26)) | ((~i5) & 25);
                int i14 = -(-((i5 & 25) << 1));
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            int i17 = b + 105;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                drawable2.jumpToCurrentState();
                throw null;
            }
            drawable2.jumpToCurrentState();
            if (!(!this.j)) {
                int i18 = (-2) - ((a + 80) ^ (-1));
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    this.g.setAlpha(this.h);
                    throw null;
                }
                this.g.setAlpha(this.h);
            }
        }
        if (this.n != 0) {
            int i19 = a;
            int i20 = i19 & 111;
            int i21 = (i19 ^ 111) | i20;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            this.n = 0L;
            int i24 = i19 & 53;
            int i25 = -(-((i19 ^ 53) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 4 / 5;
            }
            z = true;
        }
        if (this.m != 0) {
            int i28 = a;
            int i29 = ((i28 & (-14)) | ((~i28) & 13)) + ((i28 & 13) << 1);
            b = i29 % 128;
            if (i29 % 2 != 0) {
                this.m = 1L;
            } else {
                this.m = 0L;
            }
            int i30 = (i28 ^ 29) + ((i28 & 29) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            z = true;
        }
        if (!(!z)) {
            int i32 = a;
            int i33 = ((i32 ^ 74) + ((i32 & 74) << 1)) - 1;
            b = i33 % 128;
            int i34 = i33 % 2;
            invalidateSelf();
            int i35 = a;
            int i36 = (i35 | 33) << 1;
            int i37 = -(((~i35) & 33) | (i35 & (-34)));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = b;
        int i41 = i40 & 29;
        int i42 = (i41 - (~(-(-((i40 ^ 29) | i41))))) - 1;
        a = i42 % 128;
        int i43 = i42 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r1
  0x0022: PHI (r1v5 ivas.gov.bisp.enumeration.n.h$aPC) = (r1v4 ivas.gov.bisp.enumeration.n.h$aPC), (r1v8 ivas.gov.bisp.enumeration.n.h$aPC) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        aPC apc;
        int i;
        Drawable[] drawableArr;
        int i2;
        Drawable drawable;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b + 55;
        a = i6 % 128;
        int i7 = 0;
        Object obj = null;
        if (i6 % 2 == 0) {
            apc = this.e;
            Objects.requireNonNull(apc);
            int i8 = 53 / 0;
            if (theme != null) {
                apc.e();
                i = apc.k;
                int i9 = b;
                int i10 = i9 & 37;
                int i11 = (i10 - (~(-(-((i9 ^ 37) | i10))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                drawableArr = apc.j;
                int i13 = a;
                int i14 = (i13 ^ 119) + ((i13 & 119) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                while (i7 < i) {
                    i2 = a;
                    int i16 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    drawable = drawableArr[i7];
                    if (drawable != null) {
                        i3 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            drawable.canApplyTheme();
                            obj.hashCode();
                            throw null;
                        }
                        if (drawable.canApplyTheme()) {
                            int i18 = b;
                            int i19 = (i18 & (-26)) | ((~i18) & 25);
                            int i20 = (i18 & 25) << 1;
                            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                            a = i21 % 128;
                            int i22 = i21 % 2;
                            drawableArr[i7].applyTheme(theme);
                            int i23 = apc.i;
                            int i24 = a;
                            int i25 = (i24 & 1) + (i24 | 1);
                            b = i25 % 128;
                            int i26 = i25 % 2;
                            int changingConfigurations = drawableArr[i7].getChangingConfigurations();
                            int i27 = i23 & changingConfigurations;
                            int i28 = (i23 | changingConfigurations) & (~i27);
                            apc.i = (i28 & i27) | (i28 ^ i27);
                            i4 = b + 51;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i29 = 3 / 5;
                            }
                        }
                    }
                    int i30 = i7 & 1;
                    int i31 = (i7 ^ 1) | i30;
                    i7 = (i31 | i30) + (i30 & i31);
                    int i32 = b;
                    int i33 = (i32 & (-8)) | ((~i32) & 7);
                    int i34 = (i32 & 7) << 1;
                    int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                }
                apc.g(theme.getResources());
                int i37 = b;
                int i38 = i37 & 123;
                int i39 = (i37 ^ 123) | i38;
                int i40 = (i38 & i39) + (i39 | i38);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
        } else {
            apc = this.e;
            Objects.requireNonNull(apc);
            if (theme != null) {
                apc.e();
                i = apc.k;
                int i42 = b;
                int i110 = i42 & 37;
                int i111 = (i110 - (~(-(-((i42 ^ 37) | i110))))) - 1;
                a = i111 % 128;
                int i112 = i111 % 2;
                drawableArr = apc.j;
                int i113 = a;
                int i114 = (i113 ^ 119) + ((i113 & 119) << 1);
                b = i114 % 128;
                int i115 = i114 % 2;
                while (i7 < i) {
                    i2 = a;
                    int i116 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
                    b = i116 % 128;
                    int i117 = i116 % 2;
                    drawable = drawableArr[i7];
                    if (drawable != null) {
                        i3 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            drawable.canApplyTheme();
                            obj.hashCode();
                            throw null;
                        }
                        if (drawable.canApplyTheme()) {
                            int i118 = b;
                            int i119 = (i118 & (-26)) | ((~i118) & 25);
                            int i210 = (i118 & 25) << 1;
                            int i211 = (i119 ^ i210) + ((i210 & i119) << 1);
                            a = i211 % 128;
                            int i212 = i211 % 2;
                            drawableArr[i7].applyTheme(theme);
                            int i213 = apc.i;
                            int i214 = a;
                            int i215 = (i214 & 1) + (i214 | 1);
                            b = i215 % 128;
                            int i216 = i215 % 2;
                            int changingConfigurations2 = drawableArr[i7].getChangingConfigurations();
                            int i217 = i213 & changingConfigurations2;
                            int i218 = (i213 | changingConfigurations2) & (~i217);
                            apc.i = (i218 & i217) | (i218 ^ i217);
                            i4 = b + 51;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i219 = 3 / 5;
                            }
                        }
                    }
                    int i310 = i7 & 1;
                    int i311 = (i7 ^ 1) | i310;
                    i7 = (i311 | i310) + (i310 & i311);
                    int i312 = b;
                    int i313 = (i312 & (-8)) | ((~i312) & 7);
                    int i314 = (i312 & 7) << 1;
                    int i315 = ((i313 | i314) << 1) - (i314 ^ i313);
                    a = i315 % 128;
                    int i316 = i315 % 2;
                }
                apc.g(theme.getResources());
                int i317 = b;
                int i318 = i317 & 123;
                int i319 = (i317 ^ 123) | i318;
                int i43 = (i318 & i319) + (i319 | i318);
                a = i43 % 128;
                int i44 = i43 % 2;
            }
        }
        int i45 = a;
        int i46 = i45 & 45;
        int i47 = -(-((i45 ^ 45) | i46));
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        b = i48 % 128;
        if (i48 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x012a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:53:0x0190  */
    /* JADX WARN: Code duplicated, block: B:55:0x0194  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x021a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) throws Throwable {
        aPC apc;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean padding;
        int i11;
        int i12 = 2 % 2;
        int i13 = b;
        int i14 = (i13 & (-104)) | ((~i13) & 103);
        int i15 = -(-((i13 & 103) << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            apc = this.e;
            z = apc.c;
            int i17 = 60 / 0;
        } else {
            apc = this.e;
            z = apc.c;
        }
        Throwable th = null;
        rect = null;
        Rect rect2 = null;
        if (!(!z)) {
            int i18 = a;
            int i19 = i18 & 3;
            int i20 = (i19 - (~(-(-((i18 ^ 3) | i19))))) - 1;
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            int i23 = i21 & 93;
            int i24 = (i21 ^ 93) | i23;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 5 % 3;
            }
        } else {
            Rect rect3 = apc.m;
            if (rect3 == null) {
                int i27 = b;
                int i28 = i27 & 101;
                int i29 = (i27 ^ 101) | i28;
                int i30 = (i28 & i29) + (i29 | i28);
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    boolean z2 = apc.l;
                    th.hashCode();
                    throw null;
                }
                if (apc.l) {
                    int i31 = a;
                    int i32 = i31 ^ 47;
                    int i33 = (((i31 & 47) | i32) << 1) - i32;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    rect2 = rect3;
                } else {
                    apc.e();
                    Rect rect4 = new Rect();
                    int i35 = b;
                    int i36 = i35 & 79;
                    int i37 = (((i35 | 79) & (~i36)) - (~(i36 << 1))) - 1;
                    a = i37 % 128;
                    if (i37 % 2 == 0) {
                        int i38 = apc.k;
                        Drawable[] drawableArr = apc.j;
                        throw null;
                    }
                    int i39 = apc.k;
                    Drawable[] drawableArr2 = apc.j;
                    int i40 = a;
                    int i41 = (((i40 | 31) << 1) - (~(-(((~i40) & 31) | (i40 & (-32)))))) - 1;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = 0;
                    Rect rect5 = null;
                    while (i43 < i39) {
                        int i44 = a;
                        int i45 = (i44 & 109) + (i44 | 109);
                        b = i45 % 128;
                        if (i45 % 2 != 0) {
                            int i46 = 66 / 0;
                            if (drawableArr2[i43].getPadding(rect4)) {
                                int i47 = b;
                                int i48 = ((i47 ^ 83) | (i47 & 83)) << 1;
                                int i49 = -(((~i47) & 83) | (i47 & (-84)));
                                i = (i48 & i49) + (i49 | i48);
                                a = i % 128;
                                if (i % 2 != 0) {
                                    th.hashCode();
                                    throw th;
                                }
                                if (rect5 == null) {
                                    rect5 = new Rect(0, 0, 0, 0);
                                    int i50 = a + 121;
                                    b = i50 % 128;
                                    int i51 = i50 % 2;
                                }
                                i2 = rect4.left;
                                if (i2 > rect5.left) {
                                    int i52 = b;
                                    i10 = (i52 & 105) + (i52 | 105);
                                    a = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        rect5.left = i2;
                                        th.hashCode();
                                        throw th;
                                    }
                                    rect5.left = i2;
                                    int i53 = a;
                                    int i54 = i53 & 21;
                                    int i55 = -(-((i53 ^ 21) | i54));
                                    int i56 = (i54 & i55) + (i55 | i54);
                                    b = i56 % 128;
                                    int i57 = i56 % 2;
                                }
                                i3 = rect4.top;
                                if (i3 > rect5.top) {
                                    int i58 = a;
                                    i9 = ((i58 & 112) + (i58 | 112)) - 1;
                                    b = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        rect5.top = i3;
                                        int i59 = 92 / 0;
                                    } else {
                                        rect5.top = i3;
                                    }
                                }
                                i4 = rect4.right;
                                if (i4 > rect5.right) {
                                    int i60 = a;
                                    int i61 = i60 & 43;
                                    int i62 = -(-(i60 | 43));
                                    int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
                                    b = i63 % 128;
                                    int i64 = i63 % 2;
                                    rect5.right = i4;
                                    int i65 = b;
                                    int i66 = ((i65 | 75) << 1) - (i65 ^ 75);
                                    a = i66 % 128;
                                    int i67 = i66 % 2;
                                }
                                i5 = rect4.bottom;
                                int i68 = b;
                                i6 = ((((i68 ^ 75) | (i68 & 75)) << 1) - (~(-((i68 & (-76)) | ((~i68) & 75))))) - 1;
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i69 = 52 / 0;
                                    if (i5 > rect5.bottom) {
                                        int i70 = b;
                                        i7 = (-2) - (((i70 & 52) + (i70 | 52)) ^ (-1));
                                        a = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            rect5.bottom = i5;
                                            Object obj = null;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        rect5.bottom = i5;
                                        int i71 = a;
                                        int i72 = i71 & 59;
                                        int i73 = -(-((i71 ^ 59) | i72));
                                        i8 = (i72 & i73) + (i73 | i72);
                                        b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i74 = 4 / 5;
                                        }
                                    }
                                } else if (i5 > rect5.bottom) {
                                    int i75 = b;
                                    i7 = (-2) - (((i75 & 52) + (i75 | 52)) ^ (-1));
                                    a = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        rect5.bottom = i5;
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    rect5.bottom = i5;
                                    int i76 = a;
                                    int i77 = i76 & 59;
                                    int i78 = -(-((i76 ^ 59) | i77));
                                    i8 = (i77 & i78) + (i78 | i77);
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i79 = 4 / 5;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (drawableArr2[i43].getPadding(rect4)) {
                            int i410 = b;
                            int i411 = ((i410 ^ 83) | (i410 & 83)) << 1;
                            int i412 = -(((~i410) & 83) | (i410 & (-84)));
                            i = (i411 & i412) + (i412 | i411);
                            a = i % 128;
                            if (i % 2 != 0) {
                                th.hashCode();
                                throw th;
                            }
                            if (rect5 == null) {
                                rect5 = new Rect(0, 0, 0, 0);
                                int i510 = a + 121;
                                b = i510 % 128;
                                int i511 = i510 % 2;
                            }
                            i2 = rect4.left;
                            if (i2 > rect5.left) {
                                int i512 = b;
                                i10 = (i512 & 105) + (i512 | 105);
                                a = i10 % 128;
                                if (i10 % 2 != 0) {
                                    rect5.left = i2;
                                    th.hashCode();
                                    throw th;
                                }
                                rect5.left = i2;
                                int i513 = a;
                                int i514 = i513 & 21;
                                int i515 = -(-((i513 ^ 21) | i514));
                                int i516 = (i514 & i515) + (i515 | i514);
                                b = i516 % 128;
                                int i517 = i516 % 2;
                            }
                            i3 = rect4.top;
                            if (i3 > rect5.top) {
                                int i518 = a;
                                i9 = ((i518 & 112) + (i518 | 112)) - 1;
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    rect5.top = i3;
                                    int i519 = 92 / 0;
                                } else {
                                    rect5.top = i3;
                                }
                            }
                            i4 = rect4.right;
                            if (i4 > rect5.right) {
                                int i610 = a;
                                int i611 = i610 & 43;
                                int i612 = -(-(i610 | 43));
                                int i613 = ((i611 | i612) << 1) - (i611 ^ i612);
                                b = i613 % 128;
                                int i614 = i613 % 2;
                                rect5.right = i4;
                                int i615 = b;
                                int i616 = ((i615 | 75) << 1) - (i615 ^ 75);
                                a = i616 % 128;
                                int i617 = i616 % 2;
                            }
                            i5 = rect4.bottom;
                            int i618 = b;
                            i6 = ((((i618 ^ 75) | (i618 & 75)) << 1) - (~(-((i618 & (-76)) | ((~i618) & 75))))) - 1;
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i619 = 52 / 0;
                                if (i5 > rect5.bottom) {
                                    int i710 = b;
                                    i7 = (-2) - (((i710 & 52) + (i710 | 52)) ^ (-1));
                                    a = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        rect5.bottom = i5;
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    rect5.bottom = i5;
                                    int i711 = a;
                                    int i712 = i711 & 59;
                                    int i713 = -(-((i711 ^ 59) | i712));
                                    i8 = (i712 & i713) + (i713 | i712);
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i714 = 4 / 5;
                                    }
                                }
                            } else if (i5 > rect5.bottom) {
                                int i715 = b;
                                i7 = (-2) - (((i715 & 52) + (i715 | 52)) ^ (-1));
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    rect5.bottom = i5;
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                rect5.bottom = i5;
                                int i716 = a;
                                int i717 = i716 & 59;
                                int i718 = -(-((i716 ^ 59) | i717));
                                i8 = (i717 & i718) + (i718 | i717);
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i719 = 4 / 5;
                                }
                            }
                        } else {
                            continue;
                        }
                        int i80 = i43 & (-19);
                        int i81 = (i43 ^ (-19)) | i80;
                        int i82 = (i80 & i81) + (i80 | i81);
                        int i83 = (i82 & (-21)) | ((~i82) & 20);
                        int i84 = -(-((i82 & 20) << 1));
                        i43 = ((i83 | i84) << 1) - (i83 ^ i84);
                        int i85 = a;
                        int i86 = ((i85 | 33) << 1) - (i85 ^ 33);
                        b = i86 % 128;
                        int i87 = i86 % 2;
                        th = null;
                    }
                    apc.l = true;
                    apc.m = rect5;
                    int i88 = b;
                    int i89 = ((i88 | 61) << 1) - (i88 ^ 61);
                    a = i89 % 128;
                    if (i89 % 2 == 0) {
                        int i90 = 3 % 2;
                    }
                    rect2 = rect5;
                }
            } else {
                int i310 = a;
                int i311 = i310 ^ 47;
                int i312 = (((i310 & 47) | i311) << 1) - i311;
                b = i312 % 128;
                int i313 = i312 % 2;
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            int i91 = a;
            int i92 = (i91 & (-86)) | ((~i91) & 85);
            int i93 = -(-((i91 & 85) << 1));
            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
            b = i94 % 128;
            int i95 = i94 % 2;
            rect.set(rect2);
            int i96 = rect2.left;
            int i97 = rect2.top;
            int i98 = a + 81;
            b = i98 % 128;
            int i99 = i98 % 2;
            int i100 = i96 | i97;
            int i101 = rect2.bottom;
            int i102 = i100 ^ i101;
            int i103 = i100 & i101;
            int i104 = (i103 & i102) | (i102 ^ i103);
            int i105 = rect2.right;
            int i106 = i104 & i105;
            int i107 = (i104 | i105) & (~i106);
            if (((i107 & i106) | (i107 ^ i106)) != 0) {
                int i108 = a;
                int i109 = (i108 & 23) + (i108 | 23);
                b = i109 % 128;
                if (i109 % 2 == 0) {
                    padding = true;
                }
            } else {
                int i110 = b;
                int i111 = ((i110 & 44) + (i110 | 44)) - 1;
                a = i111 % 128;
                int i112 = i111 % 2;
            }
            padding = false;
        } else {
            Drawable drawable = this.g;
            if (drawable != null) {
                int i113 = b + 15;
                a = i113 % 128;
                int i114 = i113 % 2;
                padding = drawable.getPadding(rect);
                int i115 = b;
                int i116 = i115 & 41;
                int i117 = (i115 | 41) & (~i116);
                int i118 = -(-(i116 << 1));
                int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
                a = i119 % 128;
                int i120 = i119 % 2;
            } else {
                padding = super.getPadding(rect);
                int i121 = b + 28;
                int i122 = (i121 ^ (-1)) + (i121 << 1);
                a = i122 % 128;
                int i123 = i122 % 2;
            }
        }
        if (this.e.D) {
            int i124 = a;
            int i125 = i124 & 25;
            int i126 = (i124 | 25) & (~i125);
            int i127 = -(-(i125 << 1));
            int i128 = (i126 & i127) + (i126 | i127);
            b = i128 % 128;
            int i129 = i128 % 2;
            if (getLayoutDirection() == 1) {
                int i130 = b;
                int i131 = (((i130 | 99) << 1) - (~(-(((~i130) & 99) | (i130 & (-100)))))) - 1;
                int i132 = i131 % 128;
                a = i132;
                byte b2 = i131 % 2 != 0;
                int i133 = ((i132 & (-122)) | ((~i132) & 121)) + ((i132 & 121) << 1);
                b = i133 % 128;
                int i134 = i133 % 2;
                if (b2 != false) {
                    int i135 = (i132 & 65) + (i132 | 65);
                    b = i135 % 128;
                    if (i135 % 2 != 0) {
                        i11 = rect.left;
                        rect.left = rect.right;
                        int i136 = 5 / 0;
                    } else {
                        i11 = rect.left;
                        rect.left = rect.right;
                    }
                    rect.right = i11;
                    int i137 = a;
                    int i138 = i137 & 123;
                    int i139 = i138 + ((i137 ^ 123) | i138);
                    b = i139 % 128;
                    int i140 = i139 % 2;
                }
            }
        }
        int i141 = b;
        int i142 = ((i141 ^ 99) | (i141 & 99)) << 1;
        int i143 = -(((~i141) & 99) | (i141 & (-100)));
        int i144 = (i142 ^ i143) + ((i143 & i142) << 1);
        a = i144 % 128;
        int i145 = i144 % 2;
        return padding;
    }
}
