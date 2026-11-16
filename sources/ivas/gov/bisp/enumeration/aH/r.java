package ivas.gov.bisp.enumeration.aH;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    public static class bdV extends Property<r, bdX> {
        private static int a = 1;
        private static int b;
        public static final Property<r, bdX> c = new bdV("circularReveal");

        static {
            int i = b;
            int i2 = (-2) - (((i & 52) + (i | 52)) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        public bdV(String str) {
            super(bdX.class, str);
        }

        @Override // android.util.Property
        public bdX get(r rVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-98)) | ((~i2) & 97);
            int i4 = -(-((i2 & 97) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            bdX revealInfo = rVar.getRevealInfo();
            int i7 = b;
            int i8 = (((i7 | 72) << 1) - (i7 ^ 72)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return revealInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.util.Property
        public void set(r rVar, bdX bdx) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 117;
            int i4 = ((((i2 ^ 117) | i3) << 1) - (~(-((~i3) & (i2 | 117))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            r rVar2 = rVar;
            bdX bdx2 = bdx;
            int i6 = (i2 ^ 81) + ((i2 & 81) << 1);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                rVar2.setRevealInfo(bdx2);
                obj.hashCode();
                throw null;
            }
            rVar2.setRevealInfo(bdx2);
            int i7 = a;
            int i8 = i7 & 33;
            int i9 = -(-((i7 ^ 33) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    public static class bdW extends Property<r, Integer> {
        private static int a = 1;
        private static int b;
        public static final Property<r, Integer> c = new bdW("circularRevealScrimColor");

        static {
            int i = b + 75;
            a = i % 128;
            int i2 = i % 2;
        }

        public bdW(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(r rVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                Integer.valueOf(rVar.getCircularRevealScrimColor());
                throw null;
            }
            Integer numValueOf = Integer.valueOf(rVar.getCircularRevealScrimColor());
            int i4 = b;
            int i5 = i4 ^ 73;
            int i6 = ((i4 & 73) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 36 / 0;
            }
            return numValueOf;
        }

        @Override // android.util.Property
        public void set(r rVar, Integer num) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-74)) | ((~i2) & 73);
            int i4 = (i2 & 73) << 1;
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = (((i2 & (-112)) | ((~i2) & 111)) - (~((i2 & 111) << 1))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            rVar.setCircularRevealScrimColor(num.intValue());
            if (i8 == 0) {
                int i9 = 52 / 0;
            }
            int i10 = a;
            int i11 = ((i10 | 21) << 1) - (i10 ^ 21);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public static class bdX {
        public float a;
        public float b;
        public float c;

        public bdX() {
        }

        public bdX(bdT bdt) {
        }

        public bdX(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void b();

    void e();

    int getCircularRevealScrimColor();

    bdX getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(bdX bdx);

    public static class bdU implements TypeEvaluator<bdX> {
        private static int a = 1;
        private static int b;
        public static final TypeEvaluator<bdX> c = new bdU();
        public final bdX d = new bdX(null);

        static {
            int i = b;
            int i2 = (((i ^ 57) | (i & 57)) << 1) - (((~i) & 57) | (i & (-58)));
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.TypeEvaluator
        public bdX evaluate(float f, bdX bdx, bdX bdx2) {
            bdX bdx3;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = i3 + ((i2 ^ 107) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            bdX bdx4 = bdx;
            bdX bdx5 = bdx2;
            bdX bdx6 = this.d;
            int i6 = i2 & 23;
            int i7 = (((i2 ^ 23) | i6) << 1) - ((i2 | 23) & (~i6));
            a = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                float f2 = bdx4.a;
                float f3 = bdx5.a;
                obj.hashCode();
                throw null;
            }
            float f4 = bdx4.a;
            float f5 = bdx5.a;
            int i8 = a;
            int i9 = i8 ^ 67;
            int i10 = (((i8 & 67) | i9) << 1) - i9;
            b = i10 % 128;
            int i11 = i10 % 2;
            float fY = ivas.gov.bisp.enumeration.O.r.y(f4, f5, f);
            float f6 = bdx4.b;
            float f7 = bdx5.b;
            int i12 = b;
            int i13 = (i12 & 5) + (i12 | 5);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                ivas.gov.bisp.enumeration.O.r.y(f6, f7, f);
                float f8 = bdx4.c;
                obj.hashCode();
                throw null;
            }
            float fY2 = ivas.gov.bisp.enumeration.O.r.y(f6, f7, f);
            float fY3 = ivas.gov.bisp.enumeration.O.r.y(bdx4.c, bdx5.c, f);
            int i14 = a + 87;
            b = i14 % 128;
            int i15 = i14 % 2;
            bdx6.a = fY;
            bdx6.b = fY2;
            int i16 = a;
            int i17 = ((i16 & 50) + (i16 | 50)) - 1;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                bdx6.c = fY3;
                bdx3 = this.d;
                int i18 = 48 / 0;
            } else {
                bdx6.c = fY3;
                bdx3 = this.d;
            }
            int i19 = b + 81;
            a = i19 % 128;
            int i20 = i19 % 2;
            return bdx3;
        }
    }
}
