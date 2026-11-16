package ivas.gov.bisp.enumeration.O;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 0;
    private static int b = 1;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;

    @Deprecated
    public float g;

    @Deprecated
    public float h;
    public final List<bfB> i = new ArrayList();
    public final List<bfx> j = new ArrayList();

    public static abstract class bfB {
        public final Matrix a = new Matrix();

        public abstract void c(Matrix matrix, Path path);
    }

    public static abstract class bfx {
        private static int a = 1;
        private static int b;
        public static final Matrix c = new Matrix();

        static {
            int i = a;
            int i2 = i & 35;
            int i3 = (((i | 35) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        public abstract void c(Matrix matrix, ivas.gov.bisp.enumeration.R.j jVar, int i, Canvas canvas);
    }

    public a() {
        g(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void e(Matrix matrix, Path path) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 104) + ((i2 & 104) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int size = this.i.size();
        int i5 = a;
        int i6 = (i5 & 45) + (i5 | 45);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < size) {
            int i9 = b;
            int i10 = (((i9 & (-20)) | ((~i9) & 19)) - (~((i9 & 19) << 1))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            bfB bfb = this.i.get(i8);
            if (i11 != 0) {
                int i12 = 49 / 0;
            }
            int i13 = a;
            int i14 = ((i13 ^ 41) | (i13 & 41)) << 1;
            int i15 = -(((~i13) & 41) | (i13 & (-42)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            bfb.c(matrix, path);
            i8 = ((i8 ^ 2) + ((i8 & 2) << 1)) - 1;
            int i18 = a;
            int i19 = ((i18 & 23) - (~(i18 | 23))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b + 3;
        a = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    public static class bfA extends bfx {
        private static int a = 0;
        private static int b = 1;
        public final bfD d;
        public final float e;
        public final float f;

        public bfA(bfD bfd, float f, float f2) {
            this.d = bfd;
            this.e = f;
            this.f = f2;
        }

        public float d() {
            float f;
            float f2;
            int i = 2 % 2;
            int i2 = b + 9;
            a = i2 % 128;
            int i3 = i2 % 2;
            bfD bfd = this.d;
            float f3 = bfd.e;
            float f4 = this.f;
            int i4 = a;
            int i5 = (i4 | 41) << 1;
            int i6 = -(((~i4) & 41) | (i4 & (-42)));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                f = bfd.d;
                f2 = f3 + f4;
            } else {
                f = bfd.d;
                f2 = f3 - f4;
            }
            float degrees = (float) Math.toDegrees(Math.atan(f2 / (f - this.e)));
            int i8 = b;
            int i9 = ((i8 & 28) + (i8 | 28)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return degrees;
        }

        @Override // ivas.gov.bisp.enumeration.O.a.bfx
        public void c(Matrix matrix, ivas.gov.bisp.enumeration.R.j jVar, int i, Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            int i2 = 2 % 2;
            int i3 = a + 91;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                bfD bfd = this.d;
                f = bfd.e;
                f2 = this.f;
                f3 = bfd.d;
                f4 = this.e;
                int i4 = 13 / 0;
            } else {
                bfD bfd2 = this.d;
                f = bfd2.e;
                f2 = this.f;
                f3 = bfd2.d;
                f4 = this.e;
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.e, this.f);
            float fD = d();
            int i5 = b;
            int i6 = ((i5 | 77) << 1) - (i5 ^ 77);
            a = i6 % 128;
            int i7 = i6 % 2;
            matrix2.preRotate(fD);
            Objects.requireNonNull(jVar);
            rectF.bottom += i;
            int i8 = b;
            int i9 = (i8 & 117) + (i8 | 117);
            a = i9 % 128;
            int i10 = i9 % 2;
            rectF.offset(0.0f, -i);
            int[] iArr = ivas.gov.bisp.enumeration.R.j.c;
            iArr[0] = jVar.k;
            iArr[1] = jVar.l;
            iArr[2] = jVar.j;
            Paint paint = jVar.i;
            float f5 = rectF.left;
            LinearGradient linearGradient = new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ivas.gov.bisp.enumeration.R.j.d, Shader.TileMode.CLAMP);
            int i11 = a + 9;
            b = i11 % 128;
            int i12 = i11 % 2;
            paint.setShader(linearGradient);
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, jVar.i);
            int i13 = b + 75;
            a = i13 % 128;
            int i14 = i13 % 2;
            canvas.restore();
            int i15 = b;
            int i16 = ((i15 | 95) << 1) - (i15 ^ 95);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 58 / 0;
            }
        }
    }

    public static class bfD extends bfB {
        private static int b = 0;
        private static int c = 1;
        public float d;
        public float e;

        @Override // ivas.gov.bisp.enumeration.O.a.bfB
        public void c(Matrix matrix, Path path) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 56) + (i2 | 56)) - 1;
            c = i3 % 128;
            if (i3 % 2 == 0) {
                Matrix matrix2 = this.a;
                matrix.invert(matrix2);
                path.transform(matrix2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Matrix matrix3 = this.a;
            matrix.invert(matrix3);
            path.transform(matrix3);
            int i4 = b;
            int i5 = ((i4 & (-4)) | ((~i4) & 3)) + ((i4 & 3) << 1);
            c = i5 % 128;
            int i6 = i5 % 2;
            path.lineTo(this.d, this.e);
            path.transform(matrix);
            int i7 = b;
            int i8 = i7 & 91;
            int i9 = (((i7 ^ 91) | i8) << 1) - ((i7 | 91) & (~i8));
            c = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static class bfC extends bfB {
        private static int b = 1;
        private static int c;
        public static final RectF d = new RectF();

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        @Deprecated
        public float h;

        @Deprecated
        public float i;

        @Deprecated
        public float j;

        static {
            int i = b;
            int i2 = ((i ^ 57) - (~((i & 57) << 1))) - 1;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bfC(float f, float f2, float f3, float f4) {
            this.e = f;
            this.f = f2;
            this.g = f3;
            this.i = f4;
        }

        @Override // ivas.gov.bisp.enumeration.O.a.bfB
        public void c(Matrix matrix, Path path) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 117;
            int i4 = (i2 | 117) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                matrix.invert(this.a);
                obj.hashCode();
                throw null;
            }
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = d;
            float f = this.e;
            float f2 = this.f;
            int i7 = c;
            int i8 = ((i7 ^ 8) + ((i7 & 8) << 1)) - 1;
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f3 = this.g;
            float f4 = this.i;
            int i10 = (i9 ^ 101) + ((i9 & 101) << 1);
            c = i10 % 128;
            int i11 = i10 % 2;
            rectF.set(f, f2, f3, f4);
            float f5 = this.h;
            int i12 = b;
            int i13 = (i12 & 47) + (i12 | 47);
            c = i13 % 128;
            int i14 = i13 % 2;
            path.arcTo(rectF, f5, this.j, false);
            path.transform(matrix);
            int i15 = b;
            int i16 = (((i15 | 96) << 1) - (i15 ^ 96)) - 1;
            c = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d A[PHI: r5
  0x005d: PHI (r5v6 float) = (r5v5 float), (r5v15 float) binds: [B:12:0x005b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x0076 A[PHI: r5
  0x0076: PHI (r5v14 float) = (r5v5 float), (r5v15 float) binds: [B:12:0x005b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        int i;
        float f8;
        int i2 = 2 % 2;
        bfC bfc = new bfC(f, f2, f3, f4);
        int i3 = a;
        int i4 = i3 ^ 37;
        int i5 = (((i3 & 37) | i4) << 1) - i4;
        b = i5 % 128;
        int i6 = i5 % 2;
        bfc.h = f5;
        int i7 = a + 11;
        b = i7 % 128;
        boolean z = false;
        if (i7 % 2 == 0) {
            bfc.j = f6;
            this.i.add(bfc);
            int i8 = 89 / 0;
        } else {
            bfc.j = f6;
            this.i.add(bfc);
        }
        bfz bfzVar = new bfz(bfc);
        int i9 = b;
        int i10 = (-2) - (((i9 ^ 74) + ((i9 & 74) << 1)) ^ (-1));
        a = i10 % 128;
        if (i10 % 2 != 0) {
            f7 = f5 + f6;
            if (f6 < 0.0f) {
                int i11 = (i9 & (-104)) | ((~i9) & 103);
                int i12 = -(-((i9 & 103) << 1));
                i = (i11 & i12) + (i11 | i12);
                a = i % 128;
                if (i % 2 == 0) {
                    z = true;
                }
            } else {
                int i13 = i9 & 1;
                int i14 = i13 + ((i9 ^ 1) | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            f7 = f5 + f6;
            if (f6 < 0.0f) {
                int i16 = (i9 & (-104)) | ((~i9) & 103);
                int i17 = -(-((i9 & 103) << 1));
                i = (i16 & i17) + (i16 | i17);
                a = i % 128;
                if (i % 2 == 0) {
                    z = true;
                }
            } else {
                int i18 = i9 & 1;
                int i19 = i18 + ((i9 ^ 1) | i18);
                a = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        if (z) {
            int i20 = i9 & 35;
            int i21 = (i9 ^ 35) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            f5 = (f5 + 180.0f) % 360.0f;
            int i25 = ((i23 ^ 23) - (~((i23 & 23) << 1))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        if (z) {
            int i27 = a;
            int i28 = i27 & 77;
            int i29 = i28 + ((i27 ^ 77) | i28);
            b = i29 % 128;
            int i30 = i29 % 2;
            f8 = (180.0f + f7) % 360.0f;
            int i31 = i27 & 65;
            int i32 = i31 + ((i27 ^ 65) | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
        } else {
            int i34 = b + 41;
            a = i34 % 128;
            int i35 = i34 % 2;
            f8 = f7;
        }
        d(f5);
        this.j.add(bfzVar);
        int i36 = b + 35;
        int i37 = i36 % 128;
        a = i37;
        int i38 = i36 % 2;
        this.h = f8;
        int i39 = i37 & 41;
        int i40 = i39 + ((i37 ^ 41) | i39);
        b = i40 % 128;
        int i41 = i40 % 2;
        double d = f7;
        float fCos = (float) Math.cos(Math.toRadians(d));
        int i42 = b;
        int i43 = i42 & 7;
        int i44 = ((i42 ^ 7) | i43) << 1;
        int i45 = -((i42 | 7) & (~i43));
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = i46 % 128;
        a = i47;
        int i48 = i46 % 2;
        this.e = (((f3 - f) / 2.0f) * fCos) + ((f + f3) * 0.5f);
        int i49 = i47 + 87;
        b = i49 % 128;
        float fSin = ((i49 % 2 == 0 ? (f4 / f2) / 1.0f : (f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
        int i50 = b;
        int i51 = (i50 & 83) + (i50 | 83);
        int i52 = i51 % 128;
        a = i52;
        if (i51 % 2 != 0) {
            this.f = fSin;
            throw null;
        }
        this.f = fSin;
        int i53 = i52 & 123;
        int i54 = (i52 ^ 123) | i53;
        int i55 = (i53 & i54) + (i53 | i54);
        b = i55 % 128;
        int i56 = i55 % 2;
    }

    public final void d(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 72) + ((i2 & 72) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.h;
        if (f2 == f) {
            int i6 = i2 + 13;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        int i8 = i2 + 19;
        int i9 = i8 % 128;
        a = i9;
        Object obj = null;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (f3 > 180.0f) {
            int i10 = i9 & 35;
            int i11 = (~i10) & (i9 | 35);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        float f4 = this.e;
        float f5 = this.f;
        bfC bfc = new bfC(f4, f5, f4, f5);
        int i14 = a;
        int i15 = ((i14 | 119) << 1) - (i14 ^ 119);
        b = i15 % 128;
        int i16 = i15 % 2;
        bfc.h = this.h;
        bfc.j = f3;
        List<bfx> list = this.j;
        bfz bfzVar = new bfz(bfc);
        int i17 = b;
        int i18 = i17 & 17;
        int i19 = (i17 | 17) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            list.add(bfzVar);
            this.h = f;
            obj.hashCode();
            throw null;
        }
        list.add(bfzVar);
        this.h = f;
        int i22 = a;
        int i23 = i22 & 123;
        int i24 = -(-(i22 | 123));
        int i25 = (i23 & i24) + (i24 | i23);
        b = i25 % 128;
        int i26 = i25 % 2;
    }

    public void g(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.c = f;
        this.d = f2;
        int i6 = i4 + 40;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            this.e = f;
            this.f = f2;
            this.h = f3;
            int i8 = 19 / 0;
        } else {
            this.e = f;
            this.f = f2;
            this.h = f3;
        }
        int i9 = i4 + 89;
        b = i9 % 128;
        int i10 = i9 % 2;
        this.g = (f3 + f4) % 360.0f;
        int i11 = ((i4 ^ 47) | (i4 & 47)) << 1;
        int i12 = -((i4 & (-48)) | ((~i4) & 47));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        b = i13 % 128;
        int i14 = i13 % 2;
        this.i.clear();
        List<bfx> list = this.j;
        int i15 = a + 91;
        b = i15 % 128;
        int i16 = i15 % 2;
        list.clear();
        int i17 = a;
        int i18 = (i17 & (-12)) | ((~i17) & 11);
        int i19 = -(-((i17 & 11) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        b = i20 % 128;
        int i21 = i20 % 2;
    }

    public void f(float f, float f2) {
        int i = 2 % 2;
        bfD bfd = new bfD();
        bfd.d = f;
        int i2 = a;
        int i3 = ((i2 ^ 123) - (~(-(-((i2 & 123) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        bfd.e = f2;
        this.i.add(bfd);
        bfA bfa = new bfA(bfd, this.e, this.f);
        int i5 = a;
        int i6 = i5 | 11;
        int i7 = (i6 << 1) - ((~(i5 & 11)) & i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            bfa.d();
            bfa.d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fD = bfa.d();
        float fD2 = bfa.d();
        d(fD + 270.0f);
        List<bfx> list = this.j;
        int i8 = b + 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        list.add(bfa);
        this.h = fD2 + 270.0f;
        int i10 = b + 4;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        this.e = f;
        this.f = f2;
        int i14 = i12 & 25;
        int i15 = (((i12 ^ 25) | i14) << 1) - ((~i14) & (i12 | 25));
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public static class bfz extends bfx {
        private static int a = 0;
        private static int b = 1;
        public final bfC d;

        public bfz(bfC bfc) {
            this.d = bfc;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0236  */
        /* JADX WARN: Code duplicated, block: B:49:0x024b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0261  */
        @Override // ivas.gov.bisp.enumeration.O.a.bfx
        public void c(Matrix matrix, ivas.gov.bisp.enumeration.R.j jVar, int i, Canvas canvas) {
            boolean z;
            int i2;
            char c;
            float f;
            float f2;
            float f3;
            int i3;
            int[] iArr;
            char c2;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 103;
            int i7 = (i5 ^ 103) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            bfC bfc = this.d;
            float f4 = bfc.h;
            float f5 = bfc.j;
            int i10 = a;
            int i11 = ((i10 & 50) + (i10 | 50)) - 1;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                float f6 = this.d.e;
                throw null;
            }
            bfC bfc2 = this.d;
            RectF rectF = new RectF(bfc2.e, bfc2.f, bfc2.g, bfc2.i);
            int i12 = a;
            int i13 = i12 & 65;
            int i14 = (i12 ^ 65) | i13;
            int i15 = (i13 & i14) + (i13 | i14);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            if (f5 < 0.0f) {
                int i18 = ((i12 ^ 109) | (i12 & 109)) << 1;
                int i19 = -(((~i12) & 109) | (i12 & (-110)));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                int i23 = i21 & 121;
                int i24 = i21 | 121;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 4 / 4;
                }
                z = true;
            } else {
                int i27 = i16 & 17;
                int i28 = (i27 - (~((i16 ^ 17) | i27))) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                z = false;
            }
            Path path = jVar.m;
            if (z) {
                int i30 = a + 27;
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    iArr = ivas.gov.bisp.enumeration.R.j.e;
                    iArr[0] = 0;
                    c2 = 0;
                } else {
                    iArr = ivas.gov.bisp.enumeration.R.j.e;
                    iArr[0] = 0;
                    c2 = 1;
                }
                int i31 = a;
                int i32 = (i31 & 61) + (i31 | 61);
                b = i32 % 128;
                int i33 = i32 % 2;
                iArr[c2] = jVar.k;
                iArr[2] = jVar.l;
                int i34 = (-2) - ((b + 28) ^ (-1));
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    iArr[4] = jVar.j;
                } else {
                    iArr[3] = jVar.j;
                }
            } else {
                path.rewind();
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                int i35 = a;
                int i36 = (i35 | 63) << 1;
                int i37 = -(i35 ^ 63);
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                b = i38 % 128;
                int i39 = i38 % 2;
                path.moveTo(fCenterX, fCenterY);
                path.arcTo(rectF, f4, f5);
                int i40 = a;
                int i41 = (i40 & 69) + (i40 | 69);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    path.close();
                    float f7 = -i;
                    rectF.inset(f7, f7);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                path.close();
                float f8 = -i;
                rectF.inset(f8, f8);
                int[] iArr2 = ivas.gov.bisp.enumeration.R.j.e;
                iArr2[0] = 0;
                int i42 = jVar.j;
                int i43 = a;
                int i44 = (-2) - ((((i43 | 110) << 1) - (i43 ^ 110)) ^ (-1));
                b = i44 % 128;
                if (i44 % 2 == 0) {
                    iArr2[1] = i42;
                    iArr2[4] = jVar.l;
                    i2 = jVar.k;
                    c = 2;
                } else {
                    iArr2[1] = i42;
                    iArr2[2] = jVar.l;
                    i2 = jVar.k;
                    c = 3;
                }
                iArr2[c] = i2;
                int i45 = b;
                int i46 = (i45 ^ 93) + ((i45 & 93) << 1);
                a = i46 % 128;
                if (i46 % 2 != 0) {
                    int i47 = 3 / 5;
                }
            }
            float f9 = 2.0f;
            float fWidth = rectF.width() / 2.0f;
            if (fWidth > 0.0f) {
                int i48 = b;
                int i49 = i48 & 93;
                int i50 = i49 + ((i48 ^ 93) | i49);
                int i51 = i50 % 128;
                a = i51;
                if (i50 % 2 != 0) {
                    f = 1.0f - (i * fWidth);
                    f2 = 1.0f - f;
                    f9 = 1.0f;
                } else {
                    f = 1.0f - (i / fWidth);
                    f2 = 1.0f - f;
                }
                int i52 = i51 + 5;
                b = i52 % 128;
                int i53 = i52 % 2;
                float f10 = f2 / f9;
                float[] fArr = ivas.gov.bisp.enumeration.R.j.f;
                fArr[1] = f;
                int i54 = a;
                int i55 = (i54 & 43) + (i54 | 43);
                b = i55 % 128;
                int i56 = i55 % 2;
                fArr[2] = f10 + f;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, ivas.gov.bisp.enumeration.R.j.e, fArr, Shader.TileMode.CLAMP);
                int i57 = a;
                int i58 = i57 ^ 95;
                int i59 = ((i57 & 95) | i58) << 1;
                int i60 = -i58;
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                b = i61 % 128;
                int i62 = i61 % 2;
                jVar.h.setShader(radialGradient);
                int i63 = a;
                int i64 = ((i63 ^ 57) | (i63 & 57)) << 1;
                int i65 = -(((~i63) & 57) | (i63 & (-58)));
                int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                b = i66 % 128;
                if (i66 % 2 == 0) {
                    canvas.save();
                    canvas.concat(matrix);
                    f3 = 0.0f;
                } else {
                    canvas.save();
                    canvas.concat(matrix);
                    f3 = 1.0f;
                }
                int i67 = (-2) - ((a + 88) ^ (-1));
                b = i67 % 128;
                if (i67 % 2 == 0) {
                    canvas.scale(f3, rectF.height() / rectF.width());
                    if (!z) {
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                        int i68 = b;
                        i3 = ((i68 & 44) + (i68 | 44)) - 1;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            canvas.drawPath(path, jVar.n);
                            throw null;
                        }
                        canvas.drawPath(path, jVar.n);
                        int i69 = a;
                        int i70 = i69 & 85;
                        int i71 = i69 | 85;
                        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                        b = i72 % 128;
                        int i73 = i72 % 2;
                    }
                } else {
                    canvas.scale(f3, rectF.height() / rectF.width());
                    if (!z) {
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                        int i610 = b;
                        i3 = ((i610 & 44) + (i610 | 44)) - 1;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            canvas.drawPath(path, jVar.n);
                            throw null;
                        }
                        canvas.drawPath(path, jVar.n);
                        int i611 = a;
                        int i74 = i611 & 85;
                        int i75 = i611 | 85;
                        int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                        b = i76 % 128;
                        int i77 = i76 % 2;
                    }
                }
                canvas.drawArc(rectF, f4, f5, true, jVar.h);
                int i78 = b;
                int i79 = i78 & 85;
                int i80 = ((i78 ^ 85) | i79) << 1;
                int i81 = -((i78 | 85) & (~i79));
                int i82 = (i80 & i81) + (i81 | i80);
                a = i82 % 128;
                if (i82 % 2 != 0) {
                    canvas.restore();
                    int i83 = 78 / 0;
                } else {
                    canvas.restore();
                }
            }
            int i84 = a;
            int i85 = ((i84 | 55) << 1) - (i84 ^ 55);
            b = i85 % 128;
            if (i85 % 2 == 0) {
                int i86 = 85 / 0;
            }
        }
    }
}
