package ivas.gov.bisp.enumeration.cZ;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p002ab.J;
import ivas.gov.bisp.enumeration.p002ab.Q;
import ivas.gov.bisp.enumeration.p002ab.x;
import ivas.gov.bisp.enumeration.p008ah.j;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class p extends i {
    private static int a = 0;
    private static int b = 1;
    public static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    public final Matrix e;
    public bIr f;
    public PorterDuffColorFilter g;
    public boolean h;
    public ColorFilter i;
    public boolean j;
    public final float[] k;
    public final Rect l;

    public static abstract class bIl {
        private static int a = 1;
        private static int b;

        public bIl() {
        }

        public boolean d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public boolean e(int[] iArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 3;
            int i4 = -(-((i2 ^ 3) | i3));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 & 55;
            int i8 = ((i2 ^ 55) | i7) << 1;
            int i9 = -((i2 | 55) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bIl(bIk bik) {
        }
    }

    public static class bIn extends bIm {
        public bIn() {
        }

        public bIn(bIn bin2) {
            super(bin2);
        }
    }

    public static class bIo extends bIm {
        private static int a = 0;
        private static int b = 1;
        public float g;
        public x h;
        public int[] i;
        public float j;
        public x k;
        public float l;
        public float m;
        public float n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Cap f85o;
        public float p;
        public Paint.Join q;
        public float r;

        public bIo() {
            this.j = 0.0f;
            this.g = 1.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = 1.0f;
            this.p = 0.0f;
            this.f85o = Paint.Cap.BUTT;
            this.q = Paint.Join.MITER;
            this.r = 4.0f;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004a  */
        @Override // ivas.gov.bisp.enumeration.cZ.p.bIl
        public boolean d() {
            int i = 2 % 2;
            int i2 = b + 34;
            boolean z = true;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (this.k.e()) {
                int i5 = b;
                int i6 = i5 & 45;
                int i7 = ((i5 ^ 45) | i6) << 1;
                int i8 = -((i5 | 45) & (~i6));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = a;
                int i12 = ((i11 | 79) << 1) - (i11 ^ 79);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    this.h.e();
                    throw null;
                }
                if (this.h.e()) {
                    int i13 = b;
                    int i14 = i13 & 45;
                    int i15 = ((i13 ^ 45) | i14) << 1;
                    int i16 = -((i13 | 45) & (~i14));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    int i19 = b;
                    int i20 = (i19 ^ 43) + ((i19 & 43) << 1);
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        z = false;
                    }
                }
            }
            int i21 = a;
            int i22 = (i21 & 13) + (i21 | 13);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cZ.p.bIl
        public boolean e(int[] iArr) {
            int i = 2 % 2;
            int i2 = a + 93;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zF = this.k.f(iArr);
            x xVar = this.h;
            int i4 = b;
            int i5 = i4 & 77;
            int i6 = (i4 | 77) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            boolean zF2 = xVar.f(iArr) | zF;
            int i10 = b;
            int i11 = i10 | 53;
            int i12 = (i11 << 1) - ((~(i10 & 53)) & i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return zF2;
        }

        public float getFillAlpha() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 66) << 1) - (i2 ^ 66)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            float f = this.l;
            int i5 = i2 & 61;
            int i6 = (i2 ^ 61) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public float getStrokeAlpha() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 44) << 1) - (i2 ^ 44)) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return this.g;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public float getStrokeWidth() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 89;
            int i4 = ((((i2 ^ 89) | i3) << 1) - (~(-((i2 | 89) & (~i3))))) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return this.j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public float getTrimPathEnd() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-102)) | ((~i2) & 101)) - (~(-(-((i2 & 101) << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return this.n;
            }
            int i4 = 26 / 0;
            return this.n;
        }

        public float getTrimPathOffset() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 103) + (i2 | 103);
            a = i3 % 128;
            int i4 = i3 % 2;
            float f = this.p;
            int i5 = (i2 ^ 93) + ((i2 & 93) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public float getTrimPathStart() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 13;
            int i4 = ((((i2 & 13) | i3) << 1) - (~(-i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            float f = this.m;
            if (i5 != 0) {
                int i6 = 12 / 0;
            }
            return f;
        }

        public void setFillAlpha(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 5;
            int i4 = -(-((i2 ^ 5) | i3));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.l = f;
                int i6 = 99 / 0;
            } else {
                this.l = f;
            }
            int i7 = i2 + 71;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 63 / 0;
            }
        }

        public void setStrokeAlpha(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-72)) | ((~i2) & 71);
            int i4 = (i2 & 71) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            this.g = f;
            int i8 = ((i6 ^ 37) | (i6 & 37)) << 1;
            int i9 = -(((~i6) & 37) | (i6 & (-38)));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 30 / 0;
            }
        }

        public void setStrokeWidth(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                this.j = f;
                return;
            }
            this.j = f;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setTrimPathEnd(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 115;
            int i4 = ((i2 ^ 115) | i3) << 1;
            int i5 = -((i2 | 115) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            this.n = f;
            int i9 = (i7 & 94) + (i7 | 94);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        }

        public void setTrimPathOffset(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 113;
            int i4 = ((i3 << 1) - (~(-(i3 & (~(i2 & 113)))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            this.p = f;
            int i6 = ((i2 | 59) << 1) - (i2 ^ 59);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 47 / 0;
            }
        }

        public void setTrimPathStart(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 33;
            int i4 = ((i3 << 1) - (~(-((~(i2 & 33)) & i3)))) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            this.m = f;
            int i7 = i5 & 3;
            int i8 = i7 + ((i5 ^ 3) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        public int getFillColor() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 57;
            int i4 = -(-(i2 | 57));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = this.k.e;
            int i8 = b;
            int i9 = ((i8 ^ 9) | (i8 & 9)) << 1;
            int i10 = -(((~i8) & 9) | (i8 & (-10)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return i7;
        }

        public int getStrokeColor() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 59;
            int i4 = -(-(i2 | 59));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return this.h.e;
            }
            int i6 = this.h.e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setFillColor(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 36) + (i3 | 36);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.k.e = i;
            int i7 = b;
            int i8 = i7 ^ 15;
            int i9 = -(-((i7 & 15) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setStrokeColor(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & 89) - (~(i3 | 89))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            this.h.e = i;
            int i6 = a;
            int i7 = i6 ^ 61;
            int i8 = (i6 & 61) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bIo(bIo bio) {
            super(bio);
            this.j = 0.0f;
            this.g = 1.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = 1.0f;
            this.p = 0.0f;
            this.f85o = Paint.Cap.BUTT;
            this.q = Paint.Join.MITER;
            this.r = 4.0f;
            this.i = bio.i;
            this.h = bio.h;
            this.j = bio.j;
            this.g = bio.g;
            this.k = bio.k;
            this.e = bio.e;
            this.l = bio.l;
            this.m = bio.m;
            this.n = bio.n;
            this.p = bio.p;
            this.f85o = bio.f85o;
            this.q = bio.q;
            this.r = bio.r;
        }
    }

    public static class bIp extends bIl {
        private static int a = 0;
        private static int b = 1;
        public float c;
        public final Matrix d;
        public final ArrayList<bIl> e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public final Matrix l;
        public int m;
        public int[] n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f86o;

        public bIp(bIp bip, OooO0o<String, Object> oooO0o) {
            bIm bin2;
            super(null);
            this.d = new Matrix();
            this.e = new ArrayList<>();
            this.f = 0.0f;
            this.g = 0.0f;
            this.i = 0.0f;
            this.h = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.c = 0.0f;
            Matrix matrix = new Matrix();
            this.l = matrix;
            this.f86o = null;
            this.f = bip.f;
            this.g = bip.g;
            this.i = bip.i;
            this.h = bip.h;
            this.j = bip.j;
            this.k = bip.k;
            this.c = bip.c;
            this.n = bip.n;
            String str = bip.f86o;
            this.f86o = str;
            this.m = bip.m;
            if (str != null) {
                oooO0o.put(str, this);
                int i = a;
                int i2 = ((((i ^ 77) | (i & 77)) << 1) - (~(-(((~i) & 77) | (i & (-78)))))) - 1;
                b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            matrix.set(bip.l);
            ArrayList<bIl> arrayList = bip.e;
            int i5 = a;
            int i6 = i5 + 47;
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 79;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 5;
            } else {
                int i10 = 2 % 2;
            }
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int i12 = a;
                int i13 = (((i12 | 36) << 1) - (i12 ^ 36)) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                bIl bil = arrayList.get(i11);
                if (bil instanceof bIp) {
                    ArrayList<bIl> arrayList2 = this.e;
                    bIp bip2 = new bIp((bIp) bil, oooO0o);
                    int i15 = b;
                    int i16 = i15 & 103;
                    int i17 = -(-((i15 ^ 103) | i16));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    a = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList2.add(bip2);
                        throw null;
                    }
                    arrayList2.add(bip2);
                    int i19 = a;
                    int i20 = (i19 & (-68)) | ((~i19) & 67);
                    int i21 = (i19 & 67) << 1;
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 2 % 2;
                } else {
                    if (bil instanceof bIo) {
                        bin2 = new bIo((bIo) bil);
                        int i25 = b;
                        int i26 = ((i25 & (-8)) | ((~i25) & 7)) + ((i25 & 7) << 1);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        int i28 = 2 % 2;
                    } else {
                        if (!(bil instanceof bIn)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bin2 = new bIn((bIn) bil);
                        int i29 = (-2) - ((b + 34) ^ (-1));
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        int i31 = 2 % 2;
                    }
                    this.e.add(bin2);
                    String str2 = bin2.d;
                    int i32 = a;
                    int i33 = i32 ^ 9;
                    int i34 = ((((i32 & 9) | i33) << 1) - (~(-i33))) - 1;
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    if (str2 != null) {
                        int i36 = i32 + 115;
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        oooO0o.put(str2, bin2);
                        int i38 = b;
                        int i39 = ((i38 | 35) << 1) - (i38 ^ 35);
                        a = i39 % 128;
                        if (i39 % 2 == 0) {
                            int i40 = 2 % 2;
                        }
                    }
                }
                int i41 = (i11 ^ (-67)) + ((i11 & (-67)) << 1);
                i11 = (i41 ^ 68) + ((i41 & 68) << 1);
                int i42 = a;
                int i43 = ((i42 ^ 77) - (~(-(-((i42 & 77) << 1))))) - 1;
                b = i43 % 128;
                int i44 = i43 % 2;
                int i45 = 2 % 2;
            }
            int i46 = b;
            int i47 = i46 | 57;
            int i48 = i47 << 1;
            int i49 = -((~(i46 & 57)) & i47);
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            a = i50 % 128;
            if (i50 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cZ.p.bIl
        public boolean d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 13;
            int i4 = (((i2 & 13) | i3) << 1) - i3;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            int i7 = i5 & 21;
            int i8 = (((i5 ^ 21) | i7) << 1) - ((i5 | 21) & (~i7));
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < this.e.size()) {
                int i11 = a;
                int i12 = ((i11 | 101) << 1) - (((~i11) & 101) | (i11 & (-102)));
                b = i12 % 128;
                Object obj = null;
                if (i12 % 2 == 0) {
                    this.e.get(i10).d();
                    throw null;
                }
                if (this.e.get(i10).d()) {
                    int i13 = a;
                    int i14 = i13 | 25;
                    int i15 = i14 << 1;
                    int i16 = -((~(i13 & 25)) & i14);
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    int i18 = i17 % 128;
                    b = i18;
                    int i19 = i17 % 2;
                    int i20 = (i18 ^ 43) + ((i18 & 43) << 1);
                    a = i20 % 128;
                    if (i20 % 2 == 0) {
                        return true;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i21 = i10 ^ 1;
                int i22 = -(-((i10 & 1) << 1));
                i10 = ((i22 & i21) << 1) + (i21 ^ i22);
                int i23 = a;
                int i24 = i23 ^ 5;
                int i25 = ((i23 & 5) | i24) << 1;
                int i26 = -i24;
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 4 % 3;
                }
            }
            int i29 = b;
            int i30 = i29 ^ 13;
            int i31 = ((i29 & 13) | i30) << 1;
            int i32 = -i30;
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            return false;
        }

        public String getGroupName() {
            int i = 2 % 2;
            int i2 = b + 15;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.f86o;
            }
            throw null;
        }

        public Matrix getLocalMatrix() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 113;
            b = i3 % 128;
            int i4 = i3 % 2;
            Matrix matrix = this.l;
            int i5 = i2 + 45;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return matrix;
            }
            throw null;
        }

        public float getPivotX() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 5;
            int i4 = -(-(i2 | 5));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            float f = this.g;
            int i7 = i2 & 53;
            int i8 = i7 + ((i2 ^ 53) | i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 7 / 0;
            }
            return f;
        }

        public float getPivotY() {
            int i = 2 % 2;
            int i2 = b + 97;
            a = i2 % 128;
            int i3 = i2 % 2;
            float f = this.i;
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return f;
        }

        public float getRotation() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 74) + ((i2 & 74) << 1)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            float f = this.f;
            int i5 = i2 & 83;
            int i6 = (i2 | 83) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return f;
        }

        public float getScaleX() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = (i2 | 107) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            float f = this.h;
            int i9 = (i7 ^ 123) + ((i7 & 123) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return f;
        }

        public float getScaleY() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 4) + ((i2 & 4) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            float f = this.j;
            int i6 = i2 & 69;
            int i7 = (i2 ^ 69) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return f;
        }

        public float getTranslateX() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 57;
            int i4 = ((i2 ^ 57) | i3) << 1;
            int i5 = -((i2 | 57) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            float f = this.k;
            int i9 = i7 + 27;
            a = i9 % 128;
            int i10 = i9 % 2;
            return f;
        }

        public float getTranslateY() {
            float f;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - ((((i2 | 122) << 1) - (i2 ^ 122)) ^ (-1));
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 != 0) {
                f = this.c;
                int i5 = 68 / 0;
            } else {
                f = this.c;
            }
            int i6 = (((i4 ^ 43) | (i4 & 43)) << 1) - (((~i4) & 43) | (i4 & (-44)));
            b = i6 % 128;
            int i7 = i6 % 2;
            return f;
        }

        public void setPivotY(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 67;
            int i4 = ((i2 ^ 67) | i3) << 1;
            int i5 = -((i2 | 67) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (f != this.i) {
                this.i = f;
                f();
                int i7 = a + 35;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = b;
            int i10 = (i9 & 77) + (i9 | 77);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 74 / 0;
            }
        }

        public void setScaleX(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 41) - (~(-(-(i2 | 41))))) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (f != this.h) {
                int i4 = i2 & 81;
                int i5 = ((i2 ^ 81) | i4) << 1;
                int i6 = -((i2 | 81) & (~i4));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                this.h = f;
                f();
                int i9 = b;
                int i10 = i9 & 87;
                int i11 = (i9 | 87) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 2;
                }
            }
            int i15 = a;
            int i16 = ((i15 & 53) - (~(i15 | 53))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        public void setScaleY(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-16)) | ((~i2) & 15)) + ((i2 & 15) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (f != this.j) {
                int i5 = i2 & 23;
                int i6 = (i5 - (~((i2 ^ 23) | i5))) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                this.j = f;
                f();
                int i8 = a;
                int i9 = i8 ^ 37;
                int i10 = (((i8 & 37) | i9) << 1) - i9;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = a;
            int i13 = ((i12 & 18) + (i12 | 18)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }

        public void setTranslateY(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = ((i2 | 17) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (f != this.c) {
                int i7 = ((i5 & 96) + (i5 | 96)) - 1;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    this.c = f;
                    f();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.c = f;
                f();
            }
            int i8 = a;
            int i9 = ((i8 ^ 59) | (i8 & 59)) << 1;
            int i10 = -(((~i8) & 59) | (i8 & (-60)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cZ.p.bIl
        public boolean e(int[] iArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 31) - (~(-(-(i2 | 31))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = ((i2 ^ 29) | (i2 & 29)) << 1;
            int i6 = -(((~i2) & 29) | (i2 & (-30)));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 5;
            }
            int i9 = 0;
            boolean z = false;
            while (i9 < this.e.size()) {
                int i10 = b;
                int i11 = ((i10 ^ 31) | (i10 & 31)) << 1;
                int i12 = -(((~i10) & 31) | (i10 & (-32)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                boolean zE = this.e.get(i9).e(iArr);
                int i15 = b;
                int i16 = ((i15 | 77) << 1) - (((~i15) & 77) | (i15 & (-78)));
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                boolean z2 = z ^ zE;
                boolean z3 = z & zE;
                z = (z3 & z2) | (z2 ^ z3);
                int i19 = i9 & 114;
                int i20 = -(-((i9 ^ 114) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = i21 & (-113);
                int i23 = -(-((i21 ^ (-113)) | i22));
                i9 = ((i22 & i23) << 1) + (i22 ^ i23);
                int i24 = (-2) - (((i17 & 8) + (i17 | 8)) ^ (-1));
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 3 % 5;
                }
            }
            int i26 = b;
            int i27 = i26 ^ 35;
            int i28 = -(-((i26 & 35) << 1));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002d  */
        public void setPivotX(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 65;
            int i4 = ((i2 ^ 65) | i3) << 1;
            int i5 = -((i2 | 65) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 26 / 0;
                if (f != this.g) {
                    this.g = f;
                    f();
                    int i8 = b;
                    int i9 = ((i8 | 115) << 1) - (i8 ^ 115);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else if (f != this.g) {
                this.g = f;
                f();
                int i11 = b;
                int i12 = ((i11 | 115) << 1) - (i11 ^ 115);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = a;
            int i15 = i14 & 27;
            int i16 = i15 + ((i14 ^ 27) | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        public void setRotation(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 101;
            int i4 = (i2 ^ 101) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (f != this.f) {
                this.f = f;
                f();
                int i6 = a;
                int i7 = i6 & 123;
                int i8 = i6 | 123;
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = a;
            int i12 = i11 ^ 123;
            int i13 = ((i11 & 123) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        }

        public void setTranslateX(float f) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 53;
            int i4 = i3 + ((i2 ^ 53) | i3);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (f != this.k) {
                this.k = f;
                f();
                int i5 = a;
                int i6 = i5 & 41;
                int i7 = (i5 | 41) & (~i6);
                int i8 = i6 << 1;
                int i9 = (i7 & i8) + (i7 | i8);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = b + 19;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final void f() {
            Matrix matrix;
            float f;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 111;
            int i4 = ((i2 ^ 111) | i3) << 1;
            int i5 = -((i2 | 111) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                this.l.reset();
                obj.hashCode();
                throw null;
            }
            this.l.reset();
            this.l.postTranslate(-this.g, -this.i);
            Matrix matrix2 = this.l;
            float f2 = this.h;
            int i7 = b;
            int i8 = i7 & 113;
            int i9 = ((i7 | 113) & (~i8)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                matrix2.postScale(f2, this.j);
                matrix = this.l;
                f = this.f;
                int i10 = 58 / 0;
            } else {
                matrix2.postScale(f2, this.j);
                matrix = this.l;
                f = this.f;
            }
            int i11 = a;
            int i12 = i11 & 115;
            int i13 = (((i11 ^ 115) | i12) << 1) - ((i11 | 115) & (~i12));
            b = i13 % 128;
            int i14 = i13 % 2;
            matrix.postRotate(f, 0.0f, 0.0f);
            Matrix matrix3 = this.l;
            float f3 = this.k;
            float f4 = this.g;
            int i15 = b;
            int i16 = i15 & 87;
            int i17 = ((((i15 ^ 87) | i16) << 1) - (~(-((i15 | 87) & (~i16))))) - 1;
            a = i17 % 128;
            if (i17 % 2 != 0) {
                matrix3.postTranslate(f3 % f4, this.c * this.i);
            } else {
                matrix3.postTranslate(f3 + f4, this.c + this.i);
            }
            int i18 = a;
            int i19 = ((i18 ^ 90) + ((i18 & 90) << 1)) - 1;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public bIp() {
            super(null);
            this.d = new Matrix();
            this.e = new ArrayList<>();
            this.f = 0.0f;
            this.g = 0.0f;
            this.i = 0.0f;
            this.h = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.c = 0.0f;
            this.l = new Matrix();
            this.f86o = null;
        }
    }

    public static class bIr extends Drawable.ConstantState {
        private static int a = 1;
        private static int b;
        public int c;
        public int d;
        public bIq e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public Bitmap h;
        public boolean i;
        public ColorStateList j;
        public PorterDuff.Mode k;
        public boolean l;
        public boolean m;
        public Paint n;

        public bIr(bIr bir) {
            this.f = null;
            this.g = p.d;
            if (bir != null) {
                this.d = bir.d;
                bIq biq = new bIq(bir.e);
                int i = a;
                int i2 = i & 99;
                int i3 = (i2 - (~((i ^ 99) | i2))) - 1;
                b = i3 % 128;
                int i4 = i3 % 2;
                this.e = biq;
                if (bir.e.j != null) {
                    biq.j = new Paint(bir.e.j);
                    int i5 = b;
                    int i6 = i5 ^ 99;
                    int i7 = -(-((i5 & 99) << 1));
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 % 2;
                    }
                }
                if (bir.e.h != null) {
                    bIq biq2 = this.e;
                    Paint paint = new Paint(bir.e.h);
                    int i10 = a;
                    int i11 = i10 & 37;
                    int i12 = -(-((i10 ^ 37) | i11));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        biq2.h = paint;
                        int i14 = 63 / 0;
                    } else {
                        biq2.h = paint;
                    }
                    int i15 = b + 89;
                    a = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 2 % 2;
                    }
                }
                this.f = bir.f;
                PorterDuff.Mode mode = bir.g;
                int i17 = b;
                int i18 = (-2) - (((i17 ^ 110) + ((i17 & 110) << 1)) ^ (-1));
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    this.g = mode;
                    this.i = bir.i;
                    int i19 = 74 / 0;
                } else {
                    this.g = mode;
                    this.i = bir.i;
                }
                int i20 = 2 % 2;
            }
            int i21 = a;
            int i22 = ((i21 | 123) << 1) - (i21 ^ 123);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 58 / 0;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 17) + (i2 | 17);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.d;
            int i5 = (i2 & 61) + (i2 | 61);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            p pVar = new p(this);
            int i2 = a;
            int i3 = (i2 & (-2)) | ((~i2) & 1);
            int i4 = -(-((i2 & 1) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return pVar;
        }

        public boolean d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-118)) | ((~i2) & 117);
            int i4 = (i2 & 117) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            bIq biq = this.e;
            if (biq.r == null) {
                int i7 = b;
                int i8 = (i7 | 125) << 1;
                int i9 = -(((~i7) & 125) | (i7 & (-126)));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                biq.r = Boolean.valueOf(biq.l.d());
                int i12 = b;
                int i13 = i12 & 109;
                int i14 = (i12 | 109) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            boolean zBooleanValue = biq.r.booleanValue();
            int i18 = b;
            int i19 = i18 & 49;
            int i20 = (((i18 | 49) & (~i19)) - (~(i19 << 1))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            return zBooleanValue;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            p pVar = new p(this);
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = i2 | 91;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return pVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void e(int i, int i2) {
            int i3 = 2 % 2;
            this.h.eraseColor(0);
            Canvas canvas = new Canvas(this.h);
            int i4 = b;
            int i5 = ((i4 | 39) << 1) - (i4 ^ 39);
            a = i5 % 128;
            int i6 = i5 % 2;
            bIq biq = this.e;
            bIp bip = biq.l;
            Matrix matrix = bIq.c;
            int i7 = b;
            int i8 = i7 & 75;
            int i9 = -(-(i7 | 75));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            biq.d(bip, matrix, canvas, i, i2, null);
            int i12 = a;
            int i13 = i12 ^ 103;
            int i14 = -(-((i12 & 103) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }

        public bIr() {
            this.f = null;
            this.g = p.d;
            this.e = new bIq();
        }
    }

    public static class bIs extends Drawable.ConstantState {
        private static int a = 0;
        private static int b = 1;
        public final Drawable.ConstantState c;

        public bIs(Drawable.ConstantState constantState) {
            this.c = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 108) ^ (-1));
            b = i2 % 128;
            if (i2 % 2 == 0) {
                this.c.canApplyTheme();
                throw null;
            }
            boolean zCanApplyTheme = this.c.canApplyTheme();
            int i3 = a;
            int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            return zCanApplyTheme;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 49;
            int i4 = i3 + ((i2 ^ 49) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            int changingConfigurations = this.c.getChangingConfigurations();
            int i6 = a;
            int i7 = (i6 & 23) + (i6 | 23);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 68 / 0;
            }
            return changingConfigurations;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            p pVar = new p();
            Drawable.ConstantState constantState = this.c;
            int i2 = b + 85;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                pVar.c = (VectorDrawable) constantState.newDrawable();
                int i3 = 50 / 0;
            } else {
                pVar.c = (VectorDrawable) constantState.newDrawable();
            }
            int i4 = b;
            int i5 = (-2) - (((i4 & 34) + (i4 | 34)) ^ (-1));
            a = i5 % 128;
            int i6 = i5 % 2;
            return pVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            p pVar = new p();
            Drawable.ConstantState constantState = this.c;
            int i2 = b;
            int i3 = (((i2 ^ 57) | (i2 & 57)) << 1) - (((~i2) & 57) | (i2 & (-58)));
            a = i3 % 128;
            int i4 = i3 % 2;
            pVar.c = (VectorDrawable) constantState.newDrawable(resources);
            int i5 = a;
            int i6 = i5 & 83;
            int i7 = (((i5 | 83) & (~i6)) - (~(i6 << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return pVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            int i = 2 % 2;
            p pVar = new p();
            Drawable.ConstantState constantState = this.c;
            int i2 = a;
            int i3 = i2 & 11;
            int i4 = -(-((i2 ^ 11) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            VectorDrawable vectorDrawable = (VectorDrawable) constantState.newDrawable(resources, theme);
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = b;
            int i8 = i7 & 63;
            int i9 = i7 | 63;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            pVar.c = vectorDrawable;
            int i12 = a;
            int i13 = (i12 ^ 105) + ((i12 & 105) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return pVar;
        }
    }

    static {
        int i = a;
        int i2 = i & 53;
        int i3 = i2 + ((i ^ 53) | i2);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
    }

    public p() {
        this.j = true;
        this.k = new float[9];
        this.e = new Matrix();
        this.l = new Rect();
        this.f = new bIr();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = a;
            int i6 = i5 & 11;
            int i7 = (((i5 | 11) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                drawable.canApplyTheme();
                throw null;
            }
            drawable.canApplyTheme();
        }
        int i8 = b;
        int i9 = (i8 & (-10)) | ((~i8) & 9);
        int i10 = -(-((i8 & 9) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 42) + (i2 | 42);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            int rootAlpha = this.f.e.getRootAlpha();
            int i5 = b;
            int i6 = i5 & 115;
            int i7 = i5 | 115;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return rootAlpha;
        }
        int i10 = b;
        int i11 = (i10 ^ 17) + ((i10 & 17) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int alpha = drawable2.getAlpha();
        int i13 = b;
        int i14 = i13 & 25;
        int i15 = (i13 ^ 25) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return alpha;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 52) << 1) - (i2 ^ 52)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = b;
            int i6 = i5 ^ 93;
            int i7 = -(-((i5 & 93) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            int changingConfigurations = drawable.getChangingConfigurations();
            int i10 = b + 84;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return changingConfigurations;
        }
        int changingConfigurations2 = super.getChangingConfigurations();
        int changingConfigurations3 = this.f.getChangingConfigurations();
        int i13 = changingConfigurations2 & changingConfigurations3;
        int i14 = ((changingConfigurations2 | changingConfigurations3) & (~i13)) | i13;
        int i15 = b;
        int i16 = (i15 & (-118)) | ((~i15) & 117);
        int i17 = (i15 & 117) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return i14;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            ColorFilter colorFilter = drawable2.getColorFilter();
            int i4 = b;
            int i5 = (i4 & (-40)) | ((~i4) & 39);
            int i6 = (i4 & 39) << 1;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            return colorFilter;
        }
        ColorFilter colorFilter2 = this.i;
        int i9 = b;
        int i10 = (i9 & (-124)) | ((~i9) & 123);
        int i11 = -(-((i9 & 123) << 1));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return colorFilter2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 123) | (i2 & 123)) << 1;
        int i4 = -(((~i2) & 123) | (i2 & (-124)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            boolean z = this.f.i;
            int i6 = b;
            int i7 = (i6 & 111) + (i6 | 111);
            a = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }
        boolean zIsAutoMirrored = drawable2.isAutoMirrored();
        int i9 = b;
        int i10 = i9 & 61;
        int i11 = (((i9 ^ 61) | i10) << 1) - ((i9 | 61) & (~i10));
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return zIsAutoMirrored;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-116)) | ((~i2) & 115)) + ((i2 & 115) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = b;
            int i6 = i5 & 121;
            int i7 = ((i5 ^ 121) | i6) << 1;
            int i8 = -((i5 | 121) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                drawable.setBounds(rect);
                throw null;
            }
            drawable.setBounds(rect);
        }
        int i10 = b + 27;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = i3 + ((i2 ^ 121) | i3);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            this.f.i = z;
            int i5 = a;
            int i6 = ((i5 & 63) - (~(i5 | 63))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = a;
        int i8 = i7 & 49;
        int i9 = -(-((i7 ^ 49) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            drawable2.setAutoMirrored(z);
            obj.hashCode();
            throw null;
        }
        drawable2.setAutoMirrored(z);
        int i11 = b;
        int i12 = (i11 & (-6)) | ((~i11) & 5);
        int i13 = (i11 & 5) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    public static p d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = 2 % 2;
        p pVar = new p();
        int i2 = b;
        int i3 = i2 ^ 115;
        int i4 = ((i2 & 115) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        pVar.inflate(resources, xmlPullParser, attributeSet, theme);
        if (i7 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = b;
        int i9 = i8 ^ 41;
        int i10 = ((i8 & 41) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 84 / 0;
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r1 = new android.graphics.PorterDuffColorFilter(r6.getColorForState(getState(), 0), r7);
        r6 = (-2) - ((ivas.gov.bisp.enumeration.cZ.p.b + 46) ^ (-1));
        ivas.gov.bisp.enumeration.cZ.p.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r7 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.PorterDuffColorFilter e(android.content.res.ColorStateList r6, android.graphics.PorterDuff.Mode r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.p.a
            r2 = r1 ^ 117(0x75, float:1.64E-43)
            r3 = r1 & 117(0x75, float:1.64E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-118(0xffffffffffffff8a, float:NaN))
            int r4 = ~r1
            r4 = r4 & 117(0x75, float:1.64E-43)
            r3 = r3 | r4
            int r3 = -r3
            r4 = r2 | r3
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.cZ.p.b = r2
            int r4 = r4 % r0
            if (r6 == 0) goto L4d
            int r1 = r1 + 95
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cZ.p.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L30
            r1 = 26
            int r1 = r1 / r2
            if (r7 == 0) goto L4d
            goto L32
        L30:
            if (r7 == 0) goto L4d
        L32:
            int[] r1 = r5.getState()
            int r6 = r6.getColorForState(r1, r2)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r6, r7)
            int r6 = ivas.gov.bisp.enumeration.cZ.p.b
            int r6 = r6 + 46
            r6 = r6 ^ (-1)
            int r6 = (-2) - r6
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.cZ.p.a = r7
            int r6 = r6 % r0
            return r1
        L4d:
            int r6 = ivas.gov.bisp.enumeration.cZ.p.b
            r7 = r6 & 107(0x6b, float:1.5E-43)
            r6 = r6 | 107(0x6b, float:1.5E-43)
            int r7 = r7 + r6
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.cZ.p.a = r6
            int r7 = r7 % r0
            r6 = 0
            if (r7 != 0) goto L5d
            return r6
        L5d:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.p.e(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode):android.graphics.PorterDuffColorFilter");
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = b + 1;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            int i3 = (int) this.f.e.m;
            int i4 = b;
            int i5 = i4 ^ 111;
            int i6 = ((((i4 & 111) | i5) << 1) - (~(-i5))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return i3;
        }
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        int i8 = a;
        int i9 = i8 & 1;
        int i10 = -(-((i8 ^ 1) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return intrinsicHeight;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int i7 = a + 3;
            b = i7 % 128;
            int i8 = i7 % 2;
            return -3;
        }
        int i9 = a;
        int i10 = i9 & 91;
        int i11 = (((i9 | 91) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return drawable.getOpacity();
        }
        drawable.getOpacity();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        inflate(r6, r7, r8, null);
        r6 = ivas.gov.bisp.enumeration.cZ.p.b;
        r7 = (r6 ^ 45) + ((r6 & 45) << 1);
        ivas.gov.bisp.enumeration.cZ.p.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if ((r7 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r3 = ivas.gov.bisp.enumeration.cZ.p.a;
        r4 = (r3 ^ 79) + ((r3 & 79) << 1);
        ivas.gov.bisp.enumeration.cZ.p.b = r4 % 128;
        r4 = r4 % 2;
        r1.inflate(r6, r7, r8);
        r6 = ivas.gov.bisp.enumeration.cZ.p.b + 103;
        ivas.gov.bisp.enumeration.cZ.p.a = r6 % 128;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.p.a
            int r1 = r1 + 117
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cZ.p.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            android.graphics.drawable.Drawable r1 = r5.c
            r3 = 46
            int r3 = r3 / 0
            if (r1 == 0) goto L3d
            goto L1c
        L18:
            android.graphics.drawable.Drawable r1 = r5.c
            if (r1 == 0) goto L3d
        L1c:
            int r3 = ivas.gov.bisp.enumeration.cZ.p.a
            r4 = r3 ^ 79
            r3 = r3 & 79
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            ivas.gov.bisp.enumeration.cZ.p.b = r3
            int r4 = r4 % r0
            r1.inflate(r6, r7, r8)
            int r6 = ivas.gov.bisp.enumeration.cZ.p.b
            int r6 = r6 + 103
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.cZ.p.a = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L39
            return
        L39:
            r2.hashCode()
            throw r2
        L3d:
            r5.inflate(r6, r7, r8, r2)
            int r6 = ivas.gov.bisp.enumeration.cZ.p.b
            r7 = r6 ^ 45
            r6 = r6 & 45
            int r6 = r6 << 1
            int r7 = r7 + r6
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.cZ.p.a = r6
            int r7 = r7 % r0
            if (r7 != 0) goto L51
            return
        L51:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.p.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 67) - (~(i2 | 67))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.invalidateSelf();
            int i5 = a;
            int i6 = i5 ^ 69;
            int i7 = (((i5 & 69) | i6) << 1) - i6;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = a;
        int i9 = i8 & 39;
        int i10 = (i8 | 39) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        drawable.invalidateSelf();
        int i14 = b + 19;
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 2 % 2;
        int i2 = b + 77;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.mutate();
            int i3 = b;
            int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }
        if (!this.h) {
            int i6 = a;
            int i7 = ((i6 | 41) << 1) - (((~i6) & 41) | (i6 & (-42)));
            b = i7 % 128;
            int i8 = i7 % 2;
            if (super.mutate() == this) {
                bIr bir = new bIr(this.f);
                int i9 = a;
                int i10 = ((((i9 ^ 61) | (i9 & 61)) << 1) - (~(-((i9 & (-62)) | ((~i9) & 61))))) - 1;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f = bir;
                } else {
                    this.f = bir;
                }
                this.h = true;
                int i11 = (((i9 | 112) << 1) - (i9 ^ 112)) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = b;
        int i14 = i13 & 115;
        int i15 = -(-((i13 ^ 115) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.scheduleSelf(runnable, j);
            int i5 = b;
            int i6 = (i5 & 121) + (i5 | 121);
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = b;
        int i9 = ((i8 & (-104)) | ((~i8) & 103)) + ((i8 & 103) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            drawable.scheduleSelf(runnable, j);
        } else {
            drawable.scheduleSelf(runnable, j);
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 1) + (i3 | 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            if (this.f.e.getRootAlpha() != i) {
                int i6 = b;
                int i7 = i6 & 119;
                int i8 = i6 | 119;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    this.f.e.setRootAlpha(i);
                    invalidateSelf();
                    throw null;
                }
                this.f.e.setRootAlpha(i);
                invalidateSelf();
                int i10 = a + 7;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = a;
            int i13 = (i12 & 103) + (i12 | 103);
            b = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        int i15 = a;
        int i16 = i15 & 39;
        int i17 = ((i15 ^ 39) | i16) << 1;
        int i18 = -((i15 | 39) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        drawable.setAlpha(i);
        if (i20 == 0) {
            int i21 = 69 / 0;
        }
        int i22 = b;
        int i23 = i22 & 55;
        int i24 = ((i22 ^ 55) | i23) << 1;
        int i25 = -((i22 | 55) & (~i23));
        int i26 = (i24 & i25) + (i25 | i24);
        a = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 78 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 11) + (i3 | 11);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            Drawable drawable = this.c;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            j.b(drawable2, i);
            int i5 = b;
            int i6 = (i5 & 31) + (i5 | 31);
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        setTintList(ColorStateList.valueOf(i));
        int i8 = a;
        int i9 = (i8 & 47) + (i8 | 47);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = ((i2 & 37) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            boolean visible = super.setVisible(z, z2);
            int i7 = a;
            int i8 = (i7 ^ 7) + ((i7 & 7) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 53 / 0;
            }
            return visible;
        }
        int i10 = b;
        int i11 = (i10 & 55) + (i10 | 55);
        a = i11 % 128;
        int i12 = i11 % 2;
        boolean visible2 = drawable2.setVisible(z, z2);
        int i13 = a;
        int i14 = i13 | 45;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 45)) & i14);
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        return visible2;
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        int i = 2 % 2;
        int i2 = a + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.unscheduleSelf(runnable);
            int i4 = b;
            int i5 = i4 & 41;
            int i6 = (((i4 | 41) & (~i5)) - (~(i5 << 1))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = a;
        int i9 = i8 ^ 61;
        int i10 = ((((i8 & 61) | i9) << 1) - (~(-i9))) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            drawable.unscheduleSelf(runnable);
            throw null;
        }
        drawable.unscheduleSelf(runnable);
        int i11 = b + 5;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
    }

    public static abstract class bIm extends bIl {
        private static int a = 1;
        private static int b;
        public ivas.gov.bisp.enumeration.ag.r.aVv[] c;
        public String d;
        public int e;
        public int f;

        public bIm() {
            super(null);
            this.c = null;
            this.e = 0;
        }

        public ivas.gov.bisp.enumeration.ag.r.aVv[] getPathData() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 67;
            int i4 = (i2 | 67) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr = this.c;
            int i9 = (i7 ^ 25) + ((i7 & 25) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 99 / 0;
            }
            return avvArr;
        }

        public String getPathName() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 108) + ((i2 & 108) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            b = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            String str = this.d;
            int i6 = (i5 ^ 91) + ((i5 & 91) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public void setPathData(ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 25;
            int i4 = (i2 | 25) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                ivas.gov.bisp.enumeration.p007ag.r.b(this.c, avvArr);
                obj.hashCode();
                throw null;
            }
            if (!ivas.gov.bisp.enumeration.p007ag.r.b(this.c, avvArr)) {
                this.c = ivas.gov.bisp.enumeration.p007ag.r.f(avvArr);
                int i7 = b;
                int i8 = (i7 ^ 115) + ((i7 & 115) << 1);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 80 / 0;
                    return;
                }
                return;
            }
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr2 = this.c;
            int i10 = a;
            int i11 = i10 & 89;
            int i12 = (i10 | 89) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < avvArr.length) {
                int i17 = a;
                int i18 = ((i17 & 51) - (~(i17 | 51))) - 1;
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    avvArr2[i16].c = avvArr[i16].c;
                    throw null;
                }
                avvArr2[i16].c = avvArr[i16].c;
                int i19 = a;
                int i20 = (i19 & 97) + (i19 | 97);
                b = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (i22 < avvArr[i16].d.length) {
                    int i23 = a + 13;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    float[] fArr = avvArr2[i16].d;
                    float f = avvArr[i16].d[i22];
                    int i25 = a;
                    int i26 = (i25 & 23) + (i25 | 23);
                    int i27 = i26 % 128;
                    b = i27;
                    int i28 = i26 % 2;
                    fArr[i22] = f;
                    i22 = (((i22 & (-2)) | ((~i22) & 1)) - (~(-(-((i22 & 1) << 1))))) - 1;
                    int i29 = (i27 | 97) << 1;
                    int i30 = -((i27 & (-98)) | ((~i27) & 97));
                    int i31 = (i29 & i30) + (i29 | i30);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
                int i33 = i16 & 1;
                int i34 = (i16 ^ 1) | i33;
                i16 = (i34 | i33) + (i33 & i34);
                int i35 = b;
                int i36 = ((i35 & 90) + (i35 | 90)) - 1;
                a = i36 % 128;
                int i37 = i36 % 2;
            }
            int i38 = a;
            int i39 = (i38 ^ 22) + ((i38 & 22) << 1);
            int i40 = (i39 ^ (-1)) + (i39 << 1);
            b = i40 % 128;
            int i41 = i40 % 2;
        }

        public bIm(bIm bim) {
            super(null);
            this.c = null;
            this.e = 0;
            this.d = bim.d;
            this.f = bim.f;
            this.c = ivas.gov.bisp.enumeration.p007ag.r.f(bim.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
        int i4 = -(((~i2) & 89) | (i2 & (-90)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int i7 = (int) this.f.e.d;
            int i8 = b;
            int i9 = i8 & 35;
            int i10 = (i8 | 35) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 71 / 0;
            }
            return i7;
        }
        int i14 = b;
        int i15 = (i14 & (-106)) | ((~i14) & 105);
        int i16 = -(-((i14 & 105) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            drawable.getIntrinsicWidth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i18 = a;
        int i19 = i18 & 51;
        int i20 = (i18 | 51) & (~i19);
        int i21 = i19 << 1;
        int i22 = (i20 & i21) + (i20 | i21);
        b = i22 % 128;
        int i23 = i22 % 2;
        return intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = ((((i2 ^ 17) | i3) << 1) - (~(-((i2 | 17) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.c != null) {
            int i6 = a;
            int i7 = (i6 & 125) + (i6 | 125);
            b = i7 % 128;
            int i8 = i7 % 2;
            if (Build.VERSION.SDK_INT >= 24) {
                bIs bis = new bIs(this.c.getConstantState());
                int i9 = b + 93;
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 96 / 0;
                }
                return bis;
            }
        }
        this.f.d = getChangingConfigurations();
        int i11 = a;
        int i12 = (((i11 & (-56)) | ((~i11) & 55)) - (~((i11 & 55) << 1))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        bIr bir = this.f;
        int i14 = i11 + 21;
        b = i14 % 128;
        int i15 = i14 % 2;
        return bir;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 103) << 1;
        int i4 = -(i2 ^ 103);
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        boolean z = false;
        if (drawable2 != null) {
            boolean zIsStateful = drawable2.isStateful();
            int i6 = a;
            int i7 = (((i6 & (-66)) | ((~i6) & 65)) - (~(-(-((i6 & 65) << 1))))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 42 / 0;
            }
            return zIsStateful;
        }
        if (super.isStateful()) {
            int i9 = b + 125;
            a = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            int i11 = b;
            int i12 = i11 & 105;
            int i13 = (((i11 ^ 105) | i12) << 1) - ((i11 | 105) & (~i12));
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            bIr bir = this.f;
            if (bir != null) {
                int i16 = i14 + 103;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    boolean zD = bir.d();
                    int i17 = 53 / 0;
                    if (!zD) {
                        colorStateList = this.f.f;
                        if (colorStateList != null) {
                            int i18 = a;
                            int i19 = i18 | 105;
                            int i20 = i19 << 1;
                            int i21 = -((~(i18 & 105)) & i19);
                            int i22 = (i20 & i21) + (i21 | i20);
                            b = i22 % 128;
                            int i23 = i22 % 2;
                            if (!colorStateList.isStateful()) {
                            }
                        }
                    }
                } else if (!bir.d()) {
                    colorStateList = this.f.f;
                    if (colorStateList != null) {
                        int i110 = a;
                        int i111 = i110 | 105;
                        int i24 = i111 << 1;
                        int i25 = -((~(i110 & 105)) & i111);
                        int i26 = (i24 & i25) + (i25 | i24);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        if (!colorStateList.isStateful()) {
                        }
                    }
                }
                int i28 = b + 125;
                a = i28 % 128;
                int i112 = i28 % 2;
                z = true;
            }
            int i29 = a;
            int i30 = (i29 & (-40)) | ((~i29) & 39);
            int i31 = (i29 & 39) << 1;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            b = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = a;
        int i35 = (-2) - ((((i34 | 112) << 1) - (i34 ^ 112)) ^ (-1));
        b = i35 % 128;
        if (i35 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
        int i4 = -(((~i2) & 41) | (i2 & (-42)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            this.i = colorFilter;
            invalidateSelf();
            int i7 = b;
            int i8 = (((i7 | 54) << 1) - (i7 ^ 54)) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 67 / 0;
                return;
            }
            return;
        }
        int i10 = b;
        int i11 = i10 & 91;
        int i12 = i11 + ((i10 ^ 91) | i11);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        drawable.setColorFilter(colorFilter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.c;
        Object obj = null;
        if (drawable != null) {
            int i6 = a;
            int i7 = (i6 & (-68)) | ((~i6) & 67);
            int i8 = -(-((i6 & 67) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                j.c(drawable, colorStateList);
                return;
            } else {
                j.c(drawable, colorStateList);
                obj.hashCode();
                throw null;
            }
        }
        bIr bir = this.f;
        if (bir.f != colorStateList) {
            int i10 = a;
            int i11 = (i10 ^ 79) + ((i10 & 79) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                bir.f = colorStateList;
                PorterDuff.Mode mode = bir.g;
                obj.hashCode();
                throw null;
            }
            bir.f = colorStateList;
            this.g = e(colorStateList, bir.g);
            invalidateSelf();
            int i12 = b;
            int i13 = i12 & 117;
            int i14 = ((i12 ^ 117) | i13) << 1;
            int i15 = -((i12 | 117) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = i18 & 19;
        int i20 = (i18 | 19) & (~i19);
        int i21 = i19 << 1;
        int i22 = (i20 & i21) + (i20 | i21);
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (i2 ^ 117) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        Object obj = null;
        if (drawable != null) {
            int i7 = a;
            int i8 = ((i7 | 97) << 1) - (i7 ^ 97);
            b = i8 % 128;
            int i9 = i8 % 2;
            j.d(drawable, mode);
            int i10 = b;
            int i11 = i10 & 7;
            int i12 = (((i10 | 7) & (~i11)) - (~(i11 << 1))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        bIr bir = this.f;
        if (bir.g != mode) {
            int i13 = b + 69;
            a = i13 % 128;
            int i14 = i13 % 2;
            bir.g = mode;
            PorterDuffColorFilter porterDuffColorFilterE = e(bir.f, mode);
            int i15 = b;
            int i16 = i15 & 101;
            int i17 = i16 + ((i15 ^ 101) | i16);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                this.g = porterDuffColorFilterE;
                invalidateSelf();
                obj.hashCode();
                throw null;
            }
            this.g = porterDuffColorFilterE;
            invalidateSelf();
            int i18 = b;
            int i19 = (i18 ^ 9) + ((i18 & 9) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a;
        int i22 = ((i21 ^ 107) | (i21 & 107)) << 1;
        int i23 = -(((~i21) & 107) | (i21 & (-108)));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    public p(bIr bir) {
        this.j = true;
        this.k = new float[9];
        this.e = new Matrix();
        this.l = new Rect();
        this.f = bir;
        this.g = e(bir.f, bir.g);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean zE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = -(-((i2 ^ 113) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i7 = a;
            int i8 = i7 & 3;
            int i9 = (i7 | 3) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            boolean state = drawable.setState(iArr);
            int i13 = a;
            int i14 = (i13 ^ 55) + ((i13 & 55) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return state;
        }
        bIr bir = this.f;
        ColorStateList colorStateList = bir.f;
        if (colorStateList != null) {
            int i16 = a;
            int i17 = i16 & 93;
            int i18 = ((i16 ^ 93) | i17) << 1;
            int i19 = -((i16 | 93) & (~i17));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            int i21 = i20 % 2;
            PorterDuff.Mode mode = bir.g;
            if (mode != null) {
                int i22 = b;
                int i23 = i22 & 59;
                int i24 = (i22 | 59) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    this.g = e(colorStateList, mode);
                    invalidateSelf();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.g = e(colorStateList, mode);
                invalidateSelf();
                int i27 = a;
                int i28 = i27 & 13;
                int i29 = (i27 ^ 13) | i28;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                b = i30 % 128;
                int i31 = i30 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!(!bir.d())) {
            int i32 = b;
            int i33 = i32 & 95;
            int i34 = (i32 | 95) & (~i33);
            int i35 = i33 << 1;
            int i36 = (i34 & i35) + (i34 | i35);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                int i37 = 71 / 0;
                zE = bir.e.l.e(iArr);
            } else {
                zE = bir.e.l.e(iArr);
            }
            boolean z2 = bir.m;
            int i38 = (z2 ? 1 : 0) & zE;
            int i39 = ((z2 ? 1 : 0) | zE) & (~i38);
            bir.m = (i39 & i38) | (i39 ^ i38);
            int i40 = b + 3;
            int i41 = i40 % 128;
            a = i41;
            int i42 = i40 % 2;
            if (zE != 0) {
                int i43 = i41 & 13;
                int i44 = (i41 ^ 13) | i43;
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                b = i45 % 128;
                int i46 = i45 % 2;
                invalidateSelf();
                int i47 = b;
                int i48 = (-2) - ((((i47 | 124) << 1) - (i47 ^ 124)) ^ (-1));
                a = i48 % 128;
                int i49 = i48 % 2;
                z = true;
            }
        }
        int i50 = b;
        int i51 = i50 & 107;
        int i52 = ((i50 ^ 107) | i51) << 1;
        int i53 = -((i50 | 107) & (~i51));
        int i54 = (i52 & i53) + (i53 | i52);
        a = i54 % 128;
        int i55 = i54 % 2;
        return z;
    }

    public static class bIq {
        private static int a = 0;
        private static int b = 1;
        public static final Matrix c = new Matrix();
        public float d;
        public final Path e;
        public final Path f;
        public final Matrix g;
        public Paint h;
        public PathMeasure i;
        public Paint j;
        public int k;
        public final bIp l;
        public float m;
        public float n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f87o;
        public String p;
        public int q;
        public Boolean r;
        public final OooO0o<String, Object> s;

        static {
            int i = a;
            int i2 = i & 29;
            int i3 = ((i ^ 29) | i2) << 1;
            int i4 = -((i | 29) & (~i2));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        public bIq() {
            this.g = new Matrix();
            this.d = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.f87o = 0.0f;
            this.q = 255;
            this.p = null;
            this.r = null;
            this.s = new ivas.gov.bisp.enumeration.p001aa.r();
            this.l = new bIp();
            this.e = new Path();
            this.f = new Path();
        }

        public float getAlpha() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 29) << 1) - (~(-(((~i2) & 29) | (i2 & (-30)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            float rootAlpha = getRootAlpha() / 255.0f;
            int i5 = a;
            int i6 = i5 & 37;
            int i7 = (i5 | 37) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return rootAlpha;
            }
            throw null;
        }

        public int getRootAlpha() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 37) << 1;
            int i4 = -((i2 & (-38)) | ((~i2) & 37));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = this.q;
            int i8 = i2 & 11;
            int i9 = (i8 - (~((i2 ^ 11) | i8))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return i7;
        }

        public void setAlpha(float f) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            setRootAlpha((int) (f * 255.0f));
            int i5 = b;
            int i6 = i5 & 63;
            int i7 = (((i5 | 63) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        }

        public void setRootAlpha(int i) {
            int i2 = 2 % 2;
            int i3 = b + 63;
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            this.q = i;
            int i6 = i4 + 17;
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x03ab  */
        /* JADX WARN: Code duplicated, block: B:102:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:104:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:105:0x03cd  */
        /* JADX WARN: Code duplicated, block: B:108:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:110:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:112:0x042b  */
        /* JADX WARN: Code duplicated, block: B:113:0x043a  */
        /* JADX WARN: Code duplicated, block: B:116:0x0457  */
        /* JADX WARN: Code duplicated, block: B:118:0x0491  */
        /* JADX WARN: Code duplicated, block: B:119:0x049b  */
        /* JADX WARN: Code duplicated, block: B:123:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:125:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:126:0x04d7  */
        /* JADX WARN: Code duplicated, block: B:129:0x04ed  */
        /* JADX WARN: Code duplicated, block: B:130:0x04f5  */
        /* JADX WARN: Code duplicated, block: B:135:0x0505  */
        /* JADX WARN: Code duplicated, block: B:139:0x050f  */
        /* JADX WARN: Code duplicated, block: B:142:0x0515  */
        /* JADX WARN: Code duplicated, block: B:145:0x0528  */
        /* JADX WARN: Code duplicated, block: B:147:0x053c  */
        /* JADX WARN: Code duplicated, block: B:150:0x054e  */
        /* JADX WARN: Code duplicated, block: B:153:0x0555  */
        /* JADX WARN: Code duplicated, block: B:156:0x0577  */
        /* JADX WARN: Code duplicated, block: B:158:0x0599  */
        /* JADX WARN: Code duplicated, block: B:159:0x05a0  */
        /* JADX WARN: Code duplicated, block: B:161:0x05c2  */
        /* JADX WARN: Code duplicated, block: B:163:0x05d8  */
        /* JADX WARN: Code duplicated, block: B:166:0x0603  */
        /* JADX WARN: Code duplicated, block: B:168:0x060e  */
        /* JADX WARN: Code duplicated, block: B:199:0x0501 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:200:0x044b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:201:0x04fa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:202:0x062e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:206:0x06d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x01a2 A[PHI: r1
  0x01a2: PHI (r1v34 float) = (r1v33 float), (r1v45 float) binds: [B:39:0x01a0, B:36:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:43:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:45:0x01df  */
        /* JADX WARN: Code duplicated, block: B:56:0x021e A[PHI: r6
  0x021e: PHI (r6v27 ivas.gov.bisp.enumeration.ag.r$aVv[]) = (r6v26 ivas.gov.bisp.enumeration.ag.r$aVv[]), (r6v57 ivas.gov.bisp.enumeration.ag.r$aVv[]) binds: [B:55:0x021c, B:52:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:92:0x0366 A[PHI: r2
  0x0366: PHI (r2v82 ivas.gov.bisp.enumeration.ab.x) = (r2v81 ivas.gov.bisp.enumeration.ab.x), (r2v170 ivas.gov.bisp.enumeration.ab.x) binds: [B:91:0x0364, B:88:0x035b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:94:0x036a  */
        /* JADX WARN: Code duplicated, block: B:98:0x0394  */
        public final void d(bIp bip, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Matrix matrix2;
            int i3;
            int i4;
            float fHypot;
            float f;
            float fMax;
            int i5;
            float fAbs;
            bIq biq;
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr;
            Path.FillType fillType;
            float length;
            x xVar;
            boolean z;
            boolean z2;
            x xVar2;
            boolean z3;
            x xVar3;
            Paint paint;
            Paint.Join join;
            Paint.Cap cap;
            int i6;
            float f2;
            int i7;
            int i8;
            float f3;
            int i9;
            float fAlpha;
            int i10;
            x xVar4;
            Paint paint2;
            int i11;
            int iRound;
            Path path;
            int i12;
            Path.FillType fillType2;
            Path path2;
            int i13;
            int i14;
            int i15;
            int iAlpha;
            int i16;
            Paint paint3;
            int i17;
            bIq biq2 = this;
            int i18 = 2;
            int i19 = 2 % 2;
            int i20 = a;
            int i21 = i20 ^ 119;
            int i22 = ((i20 & 119) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            char c2 = 0;
            if (i24 % 2 == 0) {
                bip.d.set(matrix);
                matrix2 = bip.d;
                int i25 = 51 / 0;
            } else {
                bip.d.set(matrix);
                matrix2 = bip.d;
            }
            matrix2.preConcat(bip.l);
            canvas.save();
            int i26 = a;
            int i27 = i26 ^ 93;
            int i28 = ((i26 & 93) | i27) << 1;
            int i29 = -i27;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 2 / 3;
            }
            int i32 = 0;
            while (i32 < bip.e.size()) {
                int i33 = b;
                int i34 = i33 & 35;
                int i35 = ((i33 ^ 35) | i34) << 1;
                int i36 = -((i33 | 35) & (~i34));
                int i37 = (i35 & i36) + (i36 | i35);
                a = i37 % 128;
                Object obj = null;
                if (i37 % i18 != 0) {
                    bip.e.get(i32);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                bIl bil = bip.e.get(i32);
                if (bil instanceof bIp) {
                    int i38 = a;
                    int i39 = i38 & 123;
                    int i40 = ((((i38 ^ 123) | i39) << 1) - (~(-((i38 | 123) & (~i39))))) - 1;
                    b = i40 % 128;
                    if (i40 % i18 == 0) {
                        Matrix matrix3 = bip.d;
                        obj.hashCode();
                        throw null;
                    }
                    bIp bip2 = (bIp) bil;
                    Matrix matrix4 = bip.d;
                    int i41 = a;
                    int i42 = i41 & 91;
                    int i43 = (i41 ^ 91) | i42;
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    b = i44 % 128;
                    if (i44 % i18 == 0) {
                        d(bip2, matrix4, canvas, i, i2, colorFilter);
                        obj.hashCode();
                        throw null;
                    }
                    i3 = i32;
                    d(bip2, matrix4, canvas, i, i2, colorFilter);
                } else {
                    i3 = i32;
                    if (bil instanceof bIm) {
                        bIm bim = (bIm) bil;
                        float f4 = i / biq2.n;
                        int i45 = a;
                        int i46 = (((i45 ^ 125) | (i45 & 125)) << 1) - (((~i45) & 125) | (i45 & (-126)));
                        b = i46 % 128;
                        int i47 = i46 % i18;
                        float f5 = i2 / biq2.f87o;
                        float fMin = Math.min(f4, f5);
                        Matrix matrix5 = bip.d;
                        biq2.g.set(matrix5);
                        int i48 = b;
                        int i49 = i48 & 39;
                        int i50 = -(-((i48 ^ 39) | i49));
                        int i51 = (i49 & i50) + (i49 | i50);
                        a = i51 % 128;
                        if (i51 % i18 != 0) {
                            biq2.g.postScale(f4, f5);
                            throw null;
                        }
                        biq2.g.postScale(f4, f5);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix5.mapVectors(fArr);
                        float fHypot2 = (float) Math.hypot(fArr[c2], fArr[1]);
                        int i52 = a;
                        int i53 = ((i52 & (-14)) | ((~i52) & 13)) + ((i52 & 13) << 1);
                        b = i53 % 128;
                        if (i53 % i18 == 0) {
                            float f6 = fArr[4];
                            float fHypot3 = (float) Math.hypot(f6, f6);
                            f = fArr[1];
                            fHypot = fHypot3;
                            i4 = 2;
                        } else {
                            i4 = i18;
                            fHypot = (float) Math.hypot(fArr[i4], fArr[3]);
                            f = fArr[c2];
                        }
                        float f7 = fArr[1];
                        float f8 = fArr[i4];
                        float f9 = fArr[3];
                        int i54 = b;
                        int i55 = ((i54 | 49) << 1) - (i54 ^ 49);
                        a = i55 % 128;
                        if (i55 % 2 != 0) {
                            fMax = Math.max(fHypot2, fHypot);
                            if (fMax > 1.0f) {
                                i5 = b + 19;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    fAbs = Math.abs((f + f9) / (f7 / f8)) - fMax;
                                } else {
                                    fAbs = Math.abs((f * f9) - (f7 * f8)) / fMax;
                                }
                                int i56 = a;
                                int i57 = (i56 ^ 91) + ((i56 & 91) << 1);
                                b = i57 % 128;
                                int i58 = i57 % 2;
                                int i59 = ((i56 & (-120)) | ((~i56) & 119)) + ((i56 & 119) << 1);
                                b = i59 % 128;
                                int i60 = i59 % 2;
                            } else {
                                fAbs = 0.0f;
                            }
                        } else {
                            fMax = Math.max(fHypot2, fHypot);
                            if (fMax > 0.0f) {
                                i5 = b + 19;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    fAbs = Math.abs((f + f9) / (f7 / f8)) - fMax;
                                } else {
                                    fAbs = Math.abs((f * f9) - (f7 * f8)) / fMax;
                                }
                                int i510 = a;
                                int i511 = (i510 ^ 91) + ((i510 & 91) << 1);
                                b = i511 % 128;
                                int i512 = i511 % 2;
                                int i513 = ((i510 & (-120)) | ((~i510) & 119)) + ((i510 & 119) << 1);
                                b = i513 % 128;
                                int i61 = i513 % 2;
                            } else {
                                fAbs = 0.0f;
                            }
                        }
                        if (fAbs == 0.0f) {
                            int i62 = b + 23;
                            a = i62 % 128;
                            int i63 = i62 % 2;
                            biq = this;
                        } else {
                            biq = this;
                            Path path3 = biq.e;
                            Objects.requireNonNull(bim);
                            int i64 = a;
                            int i65 = i64 & 7;
                            int i66 = ((i64 | 7) & (~i65)) + (i65 << 1);
                            b = i66 % 128;
                            if (i66 % 2 == 0) {
                                path3.reset();
                                avvArr = bim.c;
                                int i67 = 12 / 0;
                                if (avvArr != null) {
                                    ivas.gov.bisp.enumeration.ag.r.aVv.e(avvArr, path3);
                                }
                            } else {
                                path3.reset();
                                avvArr = bim.c;
                                if (avvArr != null) {
                                    ivas.gov.bisp.enumeration.ag.r.aVv.e(avvArr, path3);
                                }
                            }
                            Path path4 = biq.e;
                            Path path5 = biq.f;
                            int i68 = b;
                            int i69 = (i68 ^ 1) + ((i68 & 1) << 1);
                            a = i69 % 128;
                            int i70 = i69 % 2;
                            path5.reset();
                            if (!(bim instanceof bIn)) {
                                bIo bio = (bIo) bim;
                                float f10 = bio.m;
                                if (f10 != 0.0f || bio.n != 1.0f) {
                                    float f11 = bio.p;
                                    float f12 = bio.n;
                                    int i71 = a;
                                    int i72 = ((i71 ^ 70) + ((i71 & 70) << 1)) - 1;
                                    b = i72 % 128;
                                    if (i72 % 2 == 0) {
                                        throw null;
                                    }
                                    if (biq.i == null) {
                                        biq.i = new PathMeasure();
                                    }
                                    biq.i.setPath(biq.e, false);
                                    int i73 = b;
                                    int i74 = ((i73 | 23) << 1) - (i73 ^ 23);
                                    a = i74 % 128;
                                    if (i74 % 2 != 0) {
                                        length = biq.i.getLength();
                                        int i75 = 57 / 0;
                                    } else {
                                        length = biq.i.getLength();
                                    }
                                    float f13 = ((f10 + f11) % 1.0f) * length;
                                    float f14 = (f12 + f11) % 1.0f;
                                    int i76 = b;
                                    int i77 = ((i76 & (-114)) | (113 & (~i76))) + ((i76 & 113) << 1);
                                    a = i77 % 128;
                                    float f15 = i77 % 2 != 0 ? f14 + length : f14 * length;
                                    path4.reset();
                                    if (f13 > f15) {
                                        int i78 = a;
                                        int i79 = i78 & 57;
                                        int i80 = (((i78 ^ 57) | i79) << 1) - ((i78 | 57) & (~i79));
                                        b = i80 % 128;
                                        int i81 = i80 % 2;
                                        biq.i.getSegment(f13, length, path4, true);
                                        int i82 = a;
                                        int i83 = i82 & 15;
                                        int i84 = (i83 - (~(-(-((i82 ^ 15) | i83))))) - 1;
                                        b = i84 % 128;
                                        int i85 = i84 % 2;
                                        biq.i.getSegment(0.0f, f15, path4, true);
                                        int i86 = b;
                                        int i87 = i86 ^ 119;
                                        int i88 = ((i86 & 119) | i87) << 1;
                                        int i89 = -i87;
                                        int i90 = (i88 & i89) + (i88 | i89);
                                        a = i90 % 128;
                                        if (i90 % 2 != 0) {
                                            int i91 = 3 % 4;
                                        }
                                    } else {
                                        PathMeasure pathMeasure = biq.i;
                                        int i92 = a;
                                        int i93 = ((i92 ^ 9) | (i92 & 9)) << 1;
                                        int i94 = -((i92 & (-10)) | ((~i92) & 9));
                                        int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                                        b = i95 % 128;
                                        int i96 = i95 % 2;
                                        pathMeasure.getSegment(f13, f15, path4, true);
                                    }
                                    path4.rLineTo(0.0f, 0.0f);
                                }
                                biq.f.addPath(path4, biq.g);
                                int i97 = a;
                                int i98 = i97 & 93;
                                int i99 = ((((i97 ^ 93) | i98) << 1) - (~(-((i97 | 93) & (~i98))))) - 1;
                                b = i99 % 128;
                                if (i99 % 2 == 0) {
                                    xVar = bio.k;
                                    int i100 = 64 / 0;
                                    if (!xVar.d()) {
                                        if (xVar.e == 0) {
                                            int i101 = b;
                                            int i102 = i101 ^ 35;
                                            int i103 = (((i101 & 35) | i102) << 1) - i102;
                                            int i104 = i103 % 128;
                                            a = i104;
                                            int i105 = i103 % 2;
                                            int i106 = i104 & 83;
                                            int i107 = -(-((i104 ^ 83) | i106));
                                            int i108 = (i106 & i107) + (i106 | i107);
                                            b = i108 % 128;
                                            int i109 = i108 % 2;
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        int i110 = b;
                                        i10 = (((i110 ^ 69) | (i110 & 69)) << 1) - (((~i110) & 69) | (i110 & (-70)));
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            x xVar5 = bio.k;
                                            throw null;
                                        }
                                        xVar4 = bio.k;
                                        if (biq.j == null) {
                                            paint3 = new Paint(1);
                                            i17 = a + 1;
                                            b = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                biq.j = paint3;
                                                paint3.setStyle(Paint.Style.FILL);
                                                int i111 = 53 / 0;
                                            } else {
                                                biq.j = paint3;
                                                paint3.setStyle(Paint.Style.FILL);
                                            }
                                        }
                                        paint2 = biq.j;
                                        if (!xVar4.d()) {
                                            paint2.setShader(null);
                                            int i112 = b;
                                            int i113 = (i112 ^ 92) + ((i112 & 92) << 1);
                                            i14 = (i113 ^ (-1)) + (i113 << 1);
                                            a = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                paint2.setAlpha(255);
                                                int i114 = xVar4.e;
                                                float f16 = bio.l;
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            paint2.setAlpha(255);
                                            i15 = xVar4.e;
                                            float f17 = bio.l;
                                            int i115 = a;
                                            int i116 = i115 & 121;
                                            int i117 = (i116 - (~((i115 ^ 121) | i116))) - 1;
                                            b = i117 % 128;
                                            int i118 = i117 % 2;
                                            PorterDuff.Mode mode = p.d;
                                            iAlpha = (int) (Color.alpha(i15) * f17);
                                            int i119 = a;
                                            int i120 = i119 & 57;
                                            int i121 = (i119 ^ 57) | i120;
                                            i16 = (i120 & i121) + (i121 | i120);
                                            b = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                int i122 = i15 ^ 16777215;
                                                int i123 = i15 & 16777215;
                                                paint2.setColor((i123 & i122) | (i122 ^ i123) | (iAlpha >> 6));
                                            } else {
                                                int i124 = i15 & 16777215;
                                                int i125 = iAlpha << 24;
                                                int i126 = ((~i125) & i124) | ((~i124) & i125);
                                                int i127 = i124 & i125;
                                                paint2.setColor((i127 & i126) | (i126 ^ i127));
                                            }
                                        } else {
                                            int i128 = a + 13;
                                            b = i128 % 128;
                                            int i129 = i128 % 2;
                                            Shader shader = xVar4.c;
                                            Matrix matrix6 = biq.g;
                                            int i130 = a;
                                            int i131 = i130 & 77;
                                            int i132 = -(-((i130 ^ 77) | i131));
                                            int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                                            b = i133 % 128;
                                            int i134 = i133 % 2;
                                            shader.setLocalMatrix(matrix6);
                                            paint2.setShader(shader);
                                            int i135 = b;
                                            i11 = ((i135 & 105) - (~(i135 | 105))) - 1;
                                            a = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                iRound = Math.round(bio.l - 255.0f);
                                            } else {
                                                iRound = Math.round(bio.l * 255.0f);
                                            }
                                            paint2.setAlpha(iRound);
                                            int i136 = a;
                                            int i137 = i136 & 19;
                                            int i138 = (i137 - (~((i136 ^ 19) | i137))) - 1;
                                            b = i138 % 128;
                                            int i139 = i138 % 2;
                                        }
                                        paint2.setColorFilter(colorFilter);
                                        path = biq.f;
                                        int i140 = a;
                                        int i141 = i140 & 5;
                                        int i142 = (i140 ^ 5) | i141;
                                        i12 = (i141 ^ i142) + ((i142 & i141) << 1);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i143 = bio.e;
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        if (bio.e == 0) {
                                            fillType2 = Path.FillType.WINDING;
                                        } else {
                                            fillType2 = Path.FillType.EVEN_ODD;
                                        }
                                        path.setFillType(fillType2);
                                        path2 = biq.f;
                                        int i144 = a;
                                        i13 = (i144 & 79) + (i144 | 79);
                                        b = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            canvas.drawPath(path2, paint2);
                                            z2 = false;
                                            int i145 = 88 / 0;
                                        } else {
                                            z2 = false;
                                            canvas.drawPath(path2, paint2);
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    xVar2 = bio.h;
                                    if (xVar2.d() && xVar2.e == 0) {
                                        z3 = z2;
                                    } else {
                                        int i146 = b;
                                        int i147 = (((i146 | 108) << 1) - (i146 ^ 108)) - 1;
                                        a = i147 % 128;
                                        int i148 = i147 % 2;
                                        z3 = true;
                                    }
                                    if (!(!z3)) {
                                        int i149 = a;
                                        int i150 = (i149 ^ 95) + ((i149 & 95) << 1);
                                        b = i150 % 128;
                                        int i151 = i150 % 2;
                                        xVar3 = bio.h;
                                        if (biq.h == null) {
                                            Paint paint4 = new Paint(1);
                                            biq.h = paint4;
                                            paint4.setStyle(Paint.Style.STROKE);
                                        }
                                        paint = biq.h;
                                        join = bio.q;
                                        if (join != null) {
                                            paint.setStrokeJoin(join);
                                        }
                                        cap = bio.f85o;
                                        if (cap != null) {
                                            int i152 = a;
                                            int i153 = i152 & 79;
                                            int i154 = (i153 - (~((i152 ^ 79) | i153))) - 1;
                                            b = i154 % 128;
                                            int i155 = i154 % 2;
                                            paint.setStrokeCap(cap);
                                        }
                                        paint.setStrokeMiter(bio.r);
                                        if (!xVar3.d()) {
                                            paint.setShader(null);
                                            paint.setAlpha(255);
                                            i8 = xVar3.e;
                                            f3 = bio.g;
                                            PorterDuff.Mode mode2 = p.d;
                                            int i156 = a;
                                            int i157 = i156 & 27;
                                            i9 = (((i156 ^ 27) | i157) << 1) - ((i156 | 27) & (~i157));
                                            b = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                fAlpha = Color.alpha(i8) % f3;
                                            } else {
                                                fAlpha = Color.alpha(i8) * f3;
                                            }
                                            int i158 = (int) fAlpha;
                                            int i159 = b;
                                            int i160 = ((i159 ^ 109) - (~((i159 & 109) << 1))) - 1;
                                            a = i160 % 128;
                                            int i161 = i160 % 2;
                                            int i162 = i8 & 16777215;
                                            int i163 = i158 << 24;
                                            paint.setColor((i162 & i163) | (i162 ^ i163));
                                        } else {
                                            int i164 = b;
                                            int i165 = i164 & 47;
                                            int i166 = -(-(i164 | 47));
                                            i6 = ((i165 | i166) << 1) - (i166 ^ i165);
                                            a = i6 % 128;
                                            if (i6 % 2 != 0) {
                                                Shader shader2 = xVar3.c;
                                                Object obj5 = null;
                                                obj5.hashCode();
                                                throw null;
                                            }
                                            Shader shader3 = xVar3.c;
                                            shader3.setLocalMatrix(biq.g);
                                            paint.setShader(shader3);
                                            paint.setAlpha(Math.round(bio.g * 255.0f));
                                        }
                                        paint.setColorFilter(colorFilter);
                                        f2 = bio.j;
                                        int i167 = a;
                                        i7 = (i167 ^ 57) + ((i167 & 57) << 1);
                                        b = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            paint.setStrokeWidth(f2 * fAbs * fMin);
                                        } else {
                                            paint.setStrokeWidth(f2 * fAbs * fMin);
                                        }
                                        canvas.drawPath(biq.f, paint);
                                        int i168 = b;
                                        int i169 = (i168 & (-18)) | ((~i168) & 17);
                                        int i170 = -(-((i168 & 17) << 1));
                                        int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                                        a = i171 % 128;
                                        int i172 = i171 % 2;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    xVar = bio.k;
                                    if (!xVar.d()) {
                                        if (xVar.e == 0) {
                                            int i1010 = b;
                                            int i1011 = i1010 ^ 35;
                                            int i1012 = (((i1010 & 35) | i1011) << 1) - i1011;
                                            int i1013 = i1012 % 128;
                                            a = i1013;
                                            int i1014 = i1012 % 2;
                                            int i1015 = i1013 & 83;
                                            int i1016 = -(-((i1013 ^ 83) | i1015));
                                            int i1017 = (i1015 & i1016) + (i1015 | i1016);
                                            b = i1017 % 128;
                                            int i1018 = i1017 % 2;
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        int i1110 = b;
                                        i10 = (((i1110 ^ 69) | (i1110 & 69)) << 1) - (((~i1110) & 69) | (i1110 & (-70)));
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            x xVar6 = bio.k;
                                            throw null;
                                        }
                                        xVar4 = bio.k;
                                        if (biq.j == null) {
                                            paint3 = new Paint(1);
                                            i17 = a + 1;
                                            b = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                biq.j = paint3;
                                                paint3.setStyle(Paint.Style.FILL);
                                                int i1111 = 53 / 0;
                                            } else {
                                                biq.j = paint3;
                                                paint3.setStyle(Paint.Style.FILL);
                                            }
                                        }
                                        paint2 = biq.j;
                                        if (!xVar4.d()) {
                                            paint2.setShader(null);
                                            int i1112 = b;
                                            int i1113 = (i1112 ^ 92) + ((i1112 & 92) << 1);
                                            i14 = (i1113 ^ (-1)) + (i1113 << 1);
                                            a = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                paint2.setAlpha(255);
                                                int i1114 = xVar4.e;
                                                float f18 = bio.l;
                                                Object obj6 = null;
                                                obj6.hashCode();
                                                throw null;
                                            }
                                            paint2.setAlpha(255);
                                            i15 = xVar4.e;
                                            float f19 = bio.l;
                                            int i1115 = a;
                                            int i1116 = i1115 & 121;
                                            int i1117 = (i1116 - (~((i1115 ^ 121) | i1116))) - 1;
                                            b = i1117 % 128;
                                            int i1118 = i1117 % 2;
                                            PorterDuff.Mode mode3 = p.d;
                                            iAlpha = (int) (Color.alpha(i15) * f19);
                                            int i1119 = a;
                                            int i1210 = i1119 & 57;
                                            int i1211 = (i1119 ^ 57) | i1210;
                                            i16 = (i1210 & i1211) + (i1211 | i1210);
                                            b = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                int i1212 = i15 ^ 16777215;
                                                int i1213 = i15 & 16777215;
                                                paint2.setColor((i1213 & i1212) | (i1212 ^ i1213) | (iAlpha >> 6));
                                            } else {
                                                int i1214 = i15 & 16777215;
                                                int i1215 = iAlpha << 24;
                                                int i1216 = ((~i1215) & i1214) | ((~i1214) & i1215);
                                                int i1217 = i1214 & i1215;
                                                paint2.setColor((i1217 & i1216) | (i1216 ^ i1217));
                                            }
                                        } else {
                                            int i1218 = a + 13;
                                            b = i1218 % 128;
                                            int i1219 = i1218 % 2;
                                            Shader shader4 = xVar4.c;
                                            Matrix matrix7 = biq.g;
                                            int i1310 = a;
                                            int i1311 = i1310 & 77;
                                            int i1312 = -(-((i1310 ^ 77) | i1311));
                                            int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                                            b = i1313 % 128;
                                            int i1314 = i1313 % 2;
                                            shader4.setLocalMatrix(matrix7);
                                            paint2.setShader(shader4);
                                            int i1315 = b;
                                            i11 = ((i1315 & 105) - (~(i1315 | 105))) - 1;
                                            a = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                iRound = Math.round(bio.l - 255.0f);
                                            } else {
                                                iRound = Math.round(bio.l * 255.0f);
                                            }
                                            paint2.setAlpha(iRound);
                                            int i1316 = a;
                                            int i1317 = i1316 & 19;
                                            int i1318 = (i1317 - (~((i1316 ^ 19) | i1317))) - 1;
                                            b = i1318 % 128;
                                            int i1319 = i1318 % 2;
                                        }
                                        paint2.setColorFilter(colorFilter);
                                        path = biq.f;
                                        int i1410 = a;
                                        int i1411 = i1410 & 5;
                                        int i1412 = (i1410 ^ 5) | i1411;
                                        i12 = (i1411 ^ i1412) + ((i1412 & i1411) << 1);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i1413 = bio.e;
                                            Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                        if (bio.e == 0) {
                                            fillType2 = Path.FillType.WINDING;
                                        } else {
                                            fillType2 = Path.FillType.EVEN_ODD;
                                        }
                                        path.setFillType(fillType2);
                                        path2 = biq.f;
                                        int i1414 = a;
                                        i13 = (i1414 & 79) + (i1414 | 79);
                                        b = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            canvas.drawPath(path2, paint2);
                                            z2 = false;
                                            int i1415 = 88 / 0;
                                        } else {
                                            z2 = false;
                                            canvas.drawPath(path2, paint2);
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    xVar2 = bio.h;
                                    if (xVar2.d()) {
                                        int i1416 = b;
                                        int i1417 = (((i1416 | 108) << 1) - (i1416 ^ 108)) - 1;
                                        a = i1417 % 128;
                                        int i1418 = i1417 % 2;
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (!(!z3)) {
                                        int i1419 = a;
                                        int i1510 = (i1419 ^ 95) + ((i1419 & 95) << 1);
                                        b = i1510 % 128;
                                        int i1511 = i1510 % 2;
                                        xVar3 = bio.h;
                                        if (biq.h == null) {
                                            Paint paint5 = new Paint(1);
                                            biq.h = paint5;
                                            paint5.setStyle(Paint.Style.STROKE);
                                        }
                                        paint = biq.h;
                                        join = bio.q;
                                        if (join != null) {
                                            paint.setStrokeJoin(join);
                                        }
                                        cap = bio.f85o;
                                        if (cap != null) {
                                            int i1512 = a;
                                            int i1513 = i1512 & 79;
                                            int i1514 = (i1513 - (~((i1512 ^ 79) | i1513))) - 1;
                                            b = i1514 % 128;
                                            int i1515 = i1514 % 2;
                                            paint.setStrokeCap(cap);
                                        }
                                        paint.setStrokeMiter(bio.r);
                                        if (!xVar3.d()) {
                                            paint.setShader(null);
                                            paint.setAlpha(255);
                                            i8 = xVar3.e;
                                            f3 = bio.g;
                                            PorterDuff.Mode mode4 = p.d;
                                            int i1516 = a;
                                            int i1517 = i1516 & 27;
                                            i9 = (((i1516 ^ 27) | i1517) << 1) - ((i1516 | 27) & (~i1517));
                                            b = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                fAlpha = Color.alpha(i8) % f3;
                                            } else {
                                                fAlpha = Color.alpha(i8) * f3;
                                            }
                                            int i1518 = (int) fAlpha;
                                            int i1519 = b;
                                            int i1610 = ((i1519 ^ 109) - (~((i1519 & 109) << 1))) - 1;
                                            a = i1610 % 128;
                                            int i1611 = i1610 % 2;
                                            int i1612 = i8 & 16777215;
                                            int i1613 = i1518 << 24;
                                            paint.setColor((i1612 & i1613) | (i1612 ^ i1613));
                                        } else {
                                            int i1614 = b;
                                            int i1615 = i1614 & 47;
                                            int i1616 = -(-(i1614 | 47));
                                            i6 = ((i1615 | i1616) << 1) - (i1616 ^ i1615);
                                            a = i6 % 128;
                                            if (i6 % 2 != 0) {
                                                Shader shader5 = xVar3.c;
                                                Object obj8 = null;
                                                obj8.hashCode();
                                                throw null;
                                            }
                                            Shader shader6 = xVar3.c;
                                            shader6.setLocalMatrix(biq.g);
                                            paint.setShader(shader6);
                                            paint.setAlpha(Math.round(bio.g * 255.0f));
                                        }
                                        paint.setColorFilter(colorFilter);
                                        f2 = bio.j;
                                        int i1617 = a;
                                        i7 = (i1617 ^ 57) + ((i1617 & 57) << 1);
                                        b = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            paint.setStrokeWidth(f2 * fAbs * fMin);
                                        } else {
                                            paint.setStrokeWidth(f2 * fAbs * fMin);
                                        }
                                        canvas.drawPath(biq.f, paint);
                                        int i1618 = b;
                                        int i1619 = (i1618 & (-18)) | ((~i1618) & 17);
                                        int i173 = -(-((i1618 & 17) << 1));
                                        int i174 = ((i1619 | i173) << 1) - (i173 ^ i1619);
                                        a = i174 % 128;
                                        int i175 = i174 % 2;
                                    } else {
                                        continue;
                                    }
                                }
                                z = true;
                                if (z) {
                                    int i11110 = b;
                                    i10 = (((i11110 ^ 69) | (i11110 & 69)) << 1) - (((~i11110) & 69) | (i11110 & (-70)));
                                    a = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        x xVar7 = bio.k;
                                        throw null;
                                    }
                                    xVar4 = bio.k;
                                    if (biq.j == null) {
                                        paint3 = new Paint(1);
                                        i17 = a + 1;
                                        b = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            biq.j = paint3;
                                            paint3.setStyle(Paint.Style.FILL);
                                            int i11111 = 53 / 0;
                                        } else {
                                            biq.j = paint3;
                                            paint3.setStyle(Paint.Style.FILL);
                                        }
                                    }
                                    paint2 = biq.j;
                                    if (!xVar4.d()) {
                                        paint2.setShader(null);
                                        int i11112 = b;
                                        int i11113 = (i11112 ^ 92) + ((i11112 & 92) << 1);
                                        i14 = (i11113 ^ (-1)) + (i11113 << 1);
                                        a = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            paint2.setAlpha(255);
                                            int i11114 = xVar4.e;
                                            float f110 = bio.l;
                                            Object obj9 = null;
                                            obj9.hashCode();
                                            throw null;
                                        }
                                        paint2.setAlpha(255);
                                        i15 = xVar4.e;
                                        float f111 = bio.l;
                                        int i11115 = a;
                                        int i11116 = i11115 & 121;
                                        int i11117 = (i11116 - (~((i11115 ^ 121) | i11116))) - 1;
                                        b = i11117 % 128;
                                        int i11118 = i11117 % 2;
                                        PorterDuff.Mode mode5 = p.d;
                                        iAlpha = (int) (Color.alpha(i15) * f111);
                                        int i11119 = a;
                                        int i12110 = i11119 & 57;
                                        int i12111 = (i11119 ^ 57) | i12110;
                                        i16 = (i12110 & i12111) + (i12111 | i12110);
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            int i12112 = i15 ^ 16777215;
                                            int i12113 = i15 & 16777215;
                                            paint2.setColor((i12113 & i12112) | (i12112 ^ i12113) | (iAlpha >> 6));
                                        } else {
                                            int i12114 = i15 & 16777215;
                                            int i12115 = iAlpha << 24;
                                            int i12116 = ((~i12115) & i12114) | ((~i12114) & i12115);
                                            int i12117 = i12114 & i12115;
                                            paint2.setColor((i12117 & i12116) | (i12116 ^ i12117));
                                        }
                                    } else {
                                        int i12118 = a + 13;
                                        b = i12118 % 128;
                                        int i12119 = i12118 % 2;
                                        Shader shader7 = xVar4.c;
                                        Matrix matrix8 = biq.g;
                                        int i13110 = a;
                                        int i13111 = i13110 & 77;
                                        int i13112 = -(-((i13110 ^ 77) | i13111));
                                        int i13113 = (i13111 ^ i13112) + ((i13112 & i13111) << 1);
                                        b = i13113 % 128;
                                        int i13114 = i13113 % 2;
                                        shader7.setLocalMatrix(matrix8);
                                        paint2.setShader(shader7);
                                        int i13115 = b;
                                        i11 = ((i13115 & 105) - (~(i13115 | 105))) - 1;
                                        a = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            iRound = Math.round(bio.l - 255.0f);
                                        } else {
                                            iRound = Math.round(bio.l * 255.0f);
                                        }
                                        paint2.setAlpha(iRound);
                                        int i13116 = a;
                                        int i13117 = i13116 & 19;
                                        int i13118 = (i13117 - (~((i13116 ^ 19) | i13117))) - 1;
                                        b = i13118 % 128;
                                        int i13119 = i13118 % 2;
                                    }
                                    paint2.setColorFilter(colorFilter);
                                    path = biq.f;
                                    int i14110 = a;
                                    int i14111 = i14110 & 5;
                                    int i14112 = (i14110 ^ 5) | i14111;
                                    i12 = (i14111 ^ i14112) + ((i14112 & i14111) << 1);
                                    b = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        int i14113 = bio.e;
                                        Object obj10 = null;
                                        obj10.hashCode();
                                        throw null;
                                    }
                                    if (bio.e == 0) {
                                        fillType2 = Path.FillType.WINDING;
                                    } else {
                                        fillType2 = Path.FillType.EVEN_ODD;
                                    }
                                    path.setFillType(fillType2);
                                    path2 = biq.f;
                                    int i14114 = a;
                                    i13 = (i14114 & 79) + (i14114 | 79);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        canvas.drawPath(path2, paint2);
                                        z2 = false;
                                        int i14115 = 88 / 0;
                                    } else {
                                        z2 = false;
                                        canvas.drawPath(path2, paint2);
                                    }
                                } else {
                                    z2 = false;
                                }
                                xVar2 = bio.h;
                                if (xVar2.d()) {
                                    int i14116 = b;
                                    int i14117 = (((i14116 | 108) << 1) - (i14116 ^ 108)) - 1;
                                    a = i14117 % 128;
                                    int i14118 = i14117 % 2;
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (!(!z3)) {
                                    int i14119 = a;
                                    int i15110 = (i14119 ^ 95) + ((i14119 & 95) << 1);
                                    b = i15110 % 128;
                                    int i15111 = i15110 % 2;
                                    xVar3 = bio.h;
                                    if (biq.h == null) {
                                        Paint paint6 = new Paint(1);
                                        biq.h = paint6;
                                        paint6.setStyle(Paint.Style.STROKE);
                                    }
                                    paint = biq.h;
                                    join = bio.q;
                                    if (join != null) {
                                        paint.setStrokeJoin(join);
                                    }
                                    cap = bio.f85o;
                                    if (cap != null) {
                                        int i15112 = a;
                                        int i15113 = i15112 & 79;
                                        int i15114 = (i15113 - (~((i15112 ^ 79) | i15113))) - 1;
                                        b = i15114 % 128;
                                        int i15115 = i15114 % 2;
                                        paint.setStrokeCap(cap);
                                    }
                                    paint.setStrokeMiter(bio.r);
                                    if (!xVar3.d()) {
                                        paint.setShader(null);
                                        paint.setAlpha(255);
                                        i8 = xVar3.e;
                                        f3 = bio.g;
                                        PorterDuff.Mode mode6 = p.d;
                                        int i15116 = a;
                                        int i15117 = i15116 & 27;
                                        i9 = (((i15116 ^ 27) | i15117) << 1) - ((i15116 | 27) & (~i15117));
                                        b = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            fAlpha = Color.alpha(i8) % f3;
                                        } else {
                                            fAlpha = Color.alpha(i8) * f3;
                                        }
                                        int i15118 = (int) fAlpha;
                                        int i15119 = b;
                                        int i16110 = ((i15119 ^ 109) - (~((i15119 & 109) << 1))) - 1;
                                        a = i16110 % 128;
                                        int i16111 = i16110 % 2;
                                        int i16112 = i8 & 16777215;
                                        int i16113 = i15118 << 24;
                                        paint.setColor((i16112 & i16113) | (i16112 ^ i16113));
                                    } else {
                                        int i16114 = b;
                                        int i16115 = i16114 & 47;
                                        int i16116 = -(-(i16114 | 47));
                                        i6 = ((i16115 | i16116) << 1) - (i16116 ^ i16115);
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            Shader shader8 = xVar3.c;
                                            Object obj11 = null;
                                            obj11.hashCode();
                                            throw null;
                                        }
                                        Shader shader9 = xVar3.c;
                                        shader9.setLocalMatrix(biq.g);
                                        paint.setShader(shader9);
                                        paint.setAlpha(Math.round(bio.g * 255.0f));
                                    }
                                    paint.setColorFilter(colorFilter);
                                    f2 = bio.j;
                                    int i16117 = a;
                                    i7 = (i16117 ^ 57) + ((i16117 & 57) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        paint.setStrokeWidth(f2 * fAbs * fMin);
                                    } else {
                                        paint.setStrokeWidth(f2 * fAbs * fMin);
                                    }
                                    canvas.drawPath(biq.f, paint);
                                    int i16118 = b;
                                    int i16119 = (i16118 & (-18)) | ((~i16118) & 17);
                                    int i176 = -(-((i16118 & 17) << 1));
                                    int i177 = ((i16119 | i176) << 1) - (i176 ^ i16119);
                                    a = i177 % 128;
                                    int i178 = i177 % 2;
                                } else {
                                    continue;
                                }
                            } else {
                                int i179 = b;
                                int i180 = (((i179 ^ 37) | (i179 & 37)) << 1) - (((~i179) & 37) | (i179 & (-38)));
                                a = i180 % 128;
                                int i181 = i180 % 2;
                                Path path6 = biq.f;
                                if (bim.e == 0) {
                                    fillType = Path.FillType.WINDING;
                                    int i182 = a + 74;
                                    int i183 = (i182 ^ (-1)) + (i182 << 1);
                                    b = i183 % 128;
                                    int i184 = i183 % 2;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                    int i185 = b;
                                    int i186 = ((i185 ^ 64) + ((i185 & 64) << 1)) - 1;
                                    a = i186 % 128;
                                    int i187 = i186 % 2;
                                }
                                path6.setFillType(fillType);
                                Path path7 = biq.f;
                                int i188 = a;
                                int i189 = ((i188 ^ 103) | (i188 & 103)) << 1;
                                int i190 = -(((~i188) & 103) | (i188 & (-104)));
                                int i191 = (i189 ^ i190) + ((i190 & i189) << 1);
                                b = i191 % 128;
                                if (i191 % 2 == 0) {
                                    path7.addPath(path4, biq.g);
                                    canvas.clipPath(biq.f);
                                    throw null;
                                }
                                path7.addPath(path4, biq.g);
                                canvas.clipPath(biq.f);
                                int i192 = a;
                                int i193 = (i192 & (-48)) | ((~i192) & 47);
                                int i194 = -(-((i192 & 47) << 1));
                                int i195 = (i193 & i194) + (i194 | i193);
                                b = i195 % 128;
                                if (i195 % 2 == 0) {
                                    int i196 = 3 / 2;
                                }
                            }
                        }
                    }
                    int i197 = i3;
                    i32 = (((i197 | (-105)) << 1) - (i197 ^ (-105))) + 106;
                    int i198 = a + 125;
                    b = i198 % 128;
                    int i199 = i198 % 2;
                    biq2 = biq;
                    i18 = 2;
                    c2 = 0;
                }
                biq = biq2;
                int i1910 = i3;
                i32 = (((i1910 | (-105)) << 1) - (i1910 ^ (-105))) + 106;
                int i1911 = a + 125;
                b = i1911 % 128;
                int i1912 = i1911 % 2;
                biq2 = biq;
                i18 = 2;
                c2 = 0;
            }
            canvas.restore();
        }

        public bIq(bIq biq) {
            this.g = new Matrix();
            this.d = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.f87o = 0.0f;
            this.q = 255;
            this.p = null;
            this.r = null;
            ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r();
            this.s = rVar;
            this.l = new bIp(biq.l, rVar);
            this.e = new Path(biq.e);
            this.f = new Path(biq.f);
            this.d = biq.d;
            this.m = biq.m;
            this.n = biq.n;
            this.f87o = biq.f87o;
            this.k = biq.k;
            this.q = biq.q;
            this.p = biq.p;
            String str = biq.p;
            if (str != null) {
                rVar.put(str, this);
                int i = b;
                int i2 = i & 91;
                int i3 = -(-((i ^ 91) | i2));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.r = biq.r;
            int i7 = b + 23;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:109:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:113:0x0405  */
    /* JADX WARN: Code duplicated, block: B:114:0x0406  */
    /* JADX WARN: Code duplicated, block: B:116:0x040a  */
    /* JADX WARN: Code duplicated, block: B:118:0x041c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0420  */
    /* JADX WARN: Code duplicated, block: B:122:0x043b  */
    /* JADX WARN: Code duplicated, block: B:126:0x049e  */
    /* JADX WARN: Code duplicated, block: B:127:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:33:0x0132  */
    /* JADX WARN: Code duplicated, block: B:36:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0141 A[PHI: r8
  0x0141: PHI (r8v14 int) = (r8v13 int), (r8v39 int) binds: [B:37:0x013f, B:34:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0150  */
    /* JADX WARN: Code duplicated, block: B:43:0x0196  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0238  */
    /* JADX WARN: Code duplicated, block: B:64:0x024b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0255  */
    /* JADX WARN: Code duplicated, block: B:69:0x025b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0263  */
    /* JADX WARN: Code duplicated, block: B:73:0x0281  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x033c  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        ColorFilter colorFilter;
        Matrix matrix;
        float[] fArr;
        int i3;
        float f;
        float fAbs;
        float fAbs2;
        float fAbs3;
        int i4;
        int iHeight;
        int iMin;
        int i5;
        int iMin2;
        int i6;
        int iSave;
        boolean z;
        bIr bir;
        Bitmap bitmap;
        int i7;
        bIr bir2;
        int i8;
        bIr bir3;
        boolean z2;
        Paint paint;
        Paint paint2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 2 % 2;
        int i18 = b + 39;
        a = i18 % 128;
        Object obj = null;
        if (i18 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.draw(canvas);
            int i19 = a;
            int i20 = i19 ^ 119;
            int i21 = -(-((i19 & 119) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            return;
        }
        copyBounds(this.l);
        Rect rect = this.l;
        int i24 = a + 51;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 87 / 0;
            if (rect.width() > 0) {
                int i26 = b;
                int i27 = ((i26 | 99) << 1) - (i26 ^ 99);
                a = i27 % 128;
                int i28 = i27 % 2;
                if (this.l.height() > 0) {
                    i = b;
                    int i29 = i ^ 73;
                    int i30 = (i & 73) << 1;
                    i2 = (i29 ^ i30) + ((i29 & i30) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    colorFilter = this.i;
                    if (colorFilter == null) {
                        colorFilter = this.g;
                        int i31 = i + 3;
                        a = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    canvas.getMatrix(this.e);
                    matrix = this.e;
                    fArr = this.k;
                    int i33 = a;
                    int i34 = (i33 | 5) << 1;
                    int i35 = -(((~i33) & 5) | (i33 & (-6)));
                    i3 = (i34 ^ i35) + ((i35 & i34) << 1);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        matrix.getValues(fArr);
                        f = this.k[0];
                    } else {
                        matrix.getValues(fArr);
                        f = this.k[0];
                    }
                    fAbs = Math.abs(f);
                    fAbs2 = Math.abs(this.k[4]);
                    fAbs3 = Math.abs(this.k[1]);
                    int i36 = b;
                    int i37 = (((i36 | 105) << 1) - (~(-(((~i36) & 105) | (i36 & (-106)))))) - 1;
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    float fAbs4 = Math.abs(this.k[3]);
                    int i39 = b + 101;
                    i4 = i39 % 128;
                    a = i4;
                    int i40 = i39 % 2;
                    if (fAbs3 == 0.0f || fAbs4 != 0.0f) {
                        int i41 = i4 & 33;
                        int i42 = ((~i41) & (i4 | 33)) + (i41 << 1);
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        fAbs = 1.0f;
                        fAbs2 = 1.0f;
                    }
                    int iWidth = (int) (this.l.width() * fAbs);
                    iHeight = (int) (this.l.height() * fAbs2);
                    iMin = Math.min(2048, iWidth);
                    int i44 = b;
                    i5 = (i44 & 33) + (i44 | 33);
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        iMin2 = Math.min(11892, iHeight);
                        if (iMin > 0) {
                            int i45 = b;
                            int i46 = ((i45 | 15) << 1) - (i45 ^ 15);
                            i6 = i46 % 128;
                            a = i6;
                            int i47 = i46 % 2;
                            if (iMin2 > 0) {
                                int i48 = i6 & 11;
                                int i49 = -(-((i6 ^ 11) | i48));
                                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                                b = i50 % 128;
                                int i51 = i50 % 2;
                                iSave = canvas.save();
                                Rect rect2 = this.l;
                                int i52 = b;
                                int i53 = i52 & 41;
                                int i54 = i53 + ((i52 ^ 41) | i53);
                                a = i54 % 128;
                                int i55 = i54 % 2;
                                float f2 = rect2.left;
                                int i56 = rect2.top;
                                int i57 = b;
                                int i58 = ((i57 & 70) + (i57 | 70)) - 1;
                                a = i58 % 128;
                                int i59 = i58 % 2;
                                canvas.translate(f2, i56);
                                if (!isAutoMirrored()) {
                                    int i60 = b;
                                    int i61 = i60 & 75;
                                    int i62 = -(-((i60 ^ 75) | i61));
                                    int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                                    a = i63 % 128;
                                    int i64 = i63 % 2;
                                    z = false;
                                } else {
                                    int i65 = b;
                                    int i66 = i65 & 67;
                                    i16 = (((i65 | 67) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                                    a = i16 % 128;
                                    if (i16 % 2 != 0 ? getLayoutDirection() != 1 : getLayoutDirection() != 0) {
                                        int i67 = b;
                                        int i68 = i67 & 75;
                                        int i69 = -(-((i67 ^ 75) | i68));
                                        int i610 = (i68 ^ i69) + ((i69 & i68) << 1);
                                        a = i610 % 128;
                                        int i611 = i610 % 2;
                                        z = false;
                                    } else {
                                        int i70 = b;
                                        int i71 = i70 & 23;
                                        int i72 = ((i70 | 23) & (~i71)) + (i71 << 1);
                                        a = i72 % 128;
                                        int i73 = i72 % 2;
                                        z = true;
                                    }
                                }
                                if (!(!z)) {
                                    int i74 = a;
                                    i15 = (i74 ^ 49) + ((i74 & 49) << 1);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        canvas.translate(this.l.width(), 2.0f);
                                    } else {
                                        canvas.translate(this.l.width(), 0.0f);
                                    }
                                    int i75 = a;
                                    int i76 = i75 & 75;
                                    int i77 = ((i75 | 75) & (~i76)) + (i76 << 1);
                                    b = i77 % 128;
                                    int i78 = i77 % 2;
                                    canvas.scale(-1.0f, 1.0f);
                                    int i79 = b + 97;
                                    a = i79 % 128;
                                    int i80 = i79 % 2;
                                }
                                this.l.offsetTo(0, 0);
                                bir = this.f;
                                int i81 = a + 61;
                                b = i81 % 128;
                                int i82 = i81 % 2;
                                bitmap = bir.h;
                                if (bitmap != null) {
                                    int i83 = a;
                                    int i84 = i83 & 13;
                                    int i85 = (i83 ^ 13) | i84;
                                    i14 = (i84 ^ i85) + ((i85 & i84) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i86 = 81 / 0;
                                        if (iMin == bitmap.getWidth()) {
                                            if (iMin2 == bir.h.getHeight()) {
                                                int i87 = a;
                                                int i88 = i87 & 17;
                                                int i89 = (i87 ^ 17) | i88;
                                                int i90 = (i88 & i89) + (i89 | i88);
                                                b = i90 % 128;
                                                int i91 = i90 % 2;
                                            }
                                        }
                                    } else if (iMin == bitmap.getWidth()) {
                                        if (iMin2 == bir.h.getHeight()) {
                                            int i810 = a;
                                            int i811 = i810 & 17;
                                            int i812 = (i810 ^ 17) | i811;
                                            int i92 = (i811 & i812) + (i812 | i811);
                                            b = i92 % 128;
                                            int i93 = i92 % 2;
                                        }
                                    }
                                    int i94 = a;
                                    int i95 = ((i94 | 23) << 1) - (i94 ^ 23);
                                    b = i95 % 128;
                                    int i96 = i95 % 2;
                                    bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                    int i97 = a;
                                    int i98 = i97 & 101;
                                    int i99 = (i97 | 101) & (~i98);
                                    int i100 = -(-(i98 << 1));
                                    i7 = (i99 ^ i100) + ((i99 & i100) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bir.m = false;
                                    } else {
                                        bir.m = true;
                                    }
                                    int i101 = a + 79;
                                    b = i101 % 128;
                                    int i102 = i101 % 2;
                                } else {
                                    bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                    int i910 = a;
                                    int i911 = i910 & 101;
                                    int i912 = (i910 | 101) & (~i911);
                                    int i103 = -(-(i911 << 1));
                                    i7 = (i912 ^ i103) + ((i912 & i103) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bir.m = false;
                                    } else {
                                        bir.m = true;
                                    }
                                    int i104 = a + 79;
                                    b = i104 % 128;
                                    int i105 = i104 % 2;
                                }
                                if (this.j) {
                                    bir2 = this.f;
                                    if (bir2.m) {
                                        int i106 = a;
                                        int i107 = i106 & 121;
                                        int i108 = (((i106 ^ 121) | i107) << 1) - ((~i107) & (i106 | 121));
                                        b = i108 % 128;
                                        int i109 = i108 % 2;
                                        int i110 = ((i106 | 47) << 1) - (i106 ^ 47);
                                        b = i110 % 128;
                                        int i111 = i110 % 2;
                                        this.f.e(iMin, iMin2);
                                        bIr bir4 = this.f;
                                        int i112 = b;
                                        int i113 = i112 & 81;
                                        int i114 = (i113 - (~(-(-((i112 ^ 81) | i113))))) - 1;
                                        a = i114 % 128;
                                        int i115 = i114 % 2;
                                        bir4.j = bir4.f;
                                        PorterDuff.Mode mode = bir4.g;
                                        int i116 = b;
                                        int i117 = ((i116 ^ 118) + ((i116 & 118) << 1)) - 1;
                                        a = i117 % 128;
                                        int i118 = i117 % 2;
                                        bir4.k = mode;
                                        bir4.c = bir4.e.getRootAlpha();
                                        int i119 = b;
                                        int i120 = ((i119 | 43) << 1) - (i119 ^ 43);
                                        a = i120 % 128;
                                        int i121 = i120 % 2;
                                        bir4.l = bir4.i;
                                        bir4.m = false;
                                        int i122 = b;
                                        int i123 = i122 ^ 7;
                                        int i124 = (i122 & 7) << 1;
                                        int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                                        a = i125 % 128;
                                        int i126 = i125 % 2;
                                    } else {
                                        int i127 = a;
                                        int i128 = i127 & 5;
                                        int i129 = -(-(i127 | 5));
                                        i8 = (i128 ^ i129) + ((i129 & i128) << 1);
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i130 = 87 / 0;
                                            if (bir2.j == bir2.f) {
                                                if (bir2.k != bir2.g && bir2.l == bir2.i) {
                                                    int i131 = b;
                                                    int i132 = i131 & 29;
                                                    int i133 = (i132 - (~(-(-((i131 ^ 29) | i132))))) - 1;
                                                    a = i133 % 128;
                                                    int i134 = i133 % 2;
                                                    int i135 = bir2.c;
                                                    bIq biq = bir2.e;
                                                    int i136 = a;
                                                    int i137 = i136 ^ 87;
                                                    int i138 = -(-((i136 & 87) << 1));
                                                    int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                                                    b = i139 % 128;
                                                    int i140 = i139 % 2;
                                                    if (i135 == biq.getRootAlpha()) {
                                                        int i141 = a + 1;
                                                        b = i141 % 128;
                                                        int i142 = i141 % 2;
                                                    }
                                                }
                                            }
                                        } else if (bir2.j == bir2.f) {
                                            if (bir2.k != bir2.g) {
                                            }
                                        }
                                        int i1010 = a;
                                        int i1011 = i1010 & 121;
                                        int i1012 = (((i1010 ^ 121) | i1011) << 1) - ((~i1011) & (i1010 | 121));
                                        b = i1012 % 128;
                                        int i1013 = i1012 % 2;
                                        int i1110 = ((i1010 | 47) << 1) - (i1010 ^ 47);
                                        b = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                        this.f.e(iMin, iMin2);
                                        bIr bir5 = this.f;
                                        int i1112 = b;
                                        int i1113 = i1112 & 81;
                                        int i1114 = (i1113 - (~(-(-((i1112 ^ 81) | i1113))))) - 1;
                                        a = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                        bir5.j = bir5.f;
                                        PorterDuff.Mode mode2 = bir5.g;
                                        int i1116 = b;
                                        int i1117 = ((i1116 ^ 118) + ((i1116 & 118) << 1)) - 1;
                                        a = i1117 % 128;
                                        int i1118 = i1117 % 2;
                                        bir5.k = mode2;
                                        bir5.c = bir5.e.getRootAlpha();
                                        int i1119 = b;
                                        int i1210 = ((i1119 | 43) << 1) - (i1119 ^ 43);
                                        a = i1210 % 128;
                                        int i1211 = i1210 % 2;
                                        bir5.l = bir5.i;
                                        bir5.m = false;
                                        int i1212 = b;
                                        int i1213 = i1212 ^ 7;
                                        int i1214 = (i1212 & 7) << 1;
                                        int i1215 = (i1213 ^ i1214) + ((i1214 & i1213) << 1);
                                        a = i1215 % 128;
                                        int i1216 = i1215 % 2;
                                    }
                                } else {
                                    int i143 = b + 45;
                                    a = i143 % 128;
                                    int i144 = i143 % 2;
                                    this.f.e(iMin, iMin2);
                                    int i145 = b;
                                    int i146 = ((i145 & 78) + (i145 | 78)) - 1;
                                    a = i146 % 128;
                                    int i147 = i146 % 2;
                                }
                                bir3 = this.f;
                                Rect rect3 = this.l;
                                int i148 = a;
                                int i149 = (i148 & 73) + (i148 | 73);
                                b = i149 % 128;
                                if (i149 % 2 == 0 ? bir3.e.getRootAlpha() < 255 : bir3.e.getRootAlpha() < 17244) {
                                    int i150 = a + 17;
                                    b = i150 % 128;
                                    int i151 = i150 % 2;
                                    z2 = true;
                                }
                                if (!z2) {
                                    i12 = a;
                                    i13 = ((i12 & 121) - (~(i12 | 121))) - 1;
                                    b = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                    if (colorFilter == null) {
                                        int i152 = i12 + 47;
                                        b = i152 % 128;
                                        int i153 = i152 % 2;
                                        paint = null;
                                    } else {
                                        if (bir3.n == null) {
                                            paint2 = new Paint();
                                            bir3.n = paint2;
                                            i9 = b + 5;
                                            a = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                paint2.setFilterBitmap(false);
                                            } else {
                                                paint2.setFilterBitmap(true);
                                            }
                                            int i154 = b;
                                            int i155 = (i154 | 89) << 1;
                                            int i156 = -(((~i154) & 89) | (i154 & (-90)));
                                            i10 = ((i155 | i156) << 1) - (i156 ^ i155);
                                            a = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                int i157 = 2 / 4;
                                            }
                                        }
                                        Paint paint3 = bir3.n;
                                        int rootAlpha = bir3.e.getRootAlpha();
                                        int i158 = b;
                                        int i159 = ((i158 | 1) << 1) - (i158 ^ 1);
                                        a = i159 % 128;
                                        int i160 = i159 % 2;
                                        paint3.setAlpha(rootAlpha);
                                        bir3.n.setColorFilter(colorFilter);
                                        int i161 = b;
                                        int i162 = (i161 & (-122)) | ((~i161) & 121);
                                        int i163 = -(-((i161 & 121) << 1));
                                        int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                                        a = i164 % 128;
                                        int i165 = i164 % 2;
                                        paint = bir3.n;
                                        int i166 = a;
                                        int i167 = i166 & 117;
                                        int i168 = (i166 ^ 117) | i167;
                                        int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                                        b = i169 % 128;
                                        int i170 = i169 % 2;
                                    }
                                } else {
                                    if (bir3.n == null) {
                                        paint2 = new Paint();
                                        bir3.n = paint2;
                                        i9 = b + 5;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            paint2.setFilterBitmap(false);
                                        } else {
                                            paint2.setFilterBitmap(true);
                                        }
                                        int i1510 = b;
                                        int i1511 = (i1510 | 89) << 1;
                                        int i1512 = -(((~i1510) & 89) | (i1510 & (-90)));
                                        i10 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            int i1513 = 2 / 4;
                                        }
                                    }
                                    Paint paint4 = bir3.n;
                                    int rootAlpha2 = bir3.e.getRootAlpha();
                                    int i1514 = b;
                                    int i1515 = ((i1514 | 1) << 1) - (i1514 ^ 1);
                                    a = i1515 % 128;
                                    int i1610 = i1515 % 2;
                                    paint4.setAlpha(rootAlpha2);
                                    bir3.n.setColorFilter(colorFilter);
                                    int i1611 = b;
                                    int i1612 = (i1611 & (-122)) | ((~i1611) & 121);
                                    int i1613 = -(-((i1611 & 121) << 1));
                                    int i1614 = (i1612 ^ i1613) + ((i1613 & i1612) << 1);
                                    a = i1614 % 128;
                                    int i1615 = i1614 % 2;
                                    paint = bir3.n;
                                    int i1616 = a;
                                    int i1617 = i1616 & 117;
                                    int i1618 = (i1616 ^ 117) | i1617;
                                    int i1619 = ((i1617 | i1618) << 1) - (i1618 ^ i1617);
                                    b = i1619 % 128;
                                    int i171 = i1619 % 2;
                                }
                                canvas.drawBitmap(bir3.h, (Rect) null, rect3, paint);
                                int i172 = b;
                                i11 = (((i172 & (-106)) | ((~i172) & 105)) - (~((i172 & 105) << 1))) - 1;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    canvas.restoreToCount(iSave);
                                    throw null;
                                }
                                canvas.restoreToCount(iSave);
                            }
                        }
                    } else {
                        iMin2 = Math.min(2048, iHeight);
                        if (iMin > 0) {
                            int i410 = b;
                            int i411 = ((i410 | 15) << 1) - (i410 ^ 15);
                            i6 = i411 % 128;
                            a = i6;
                            int i412 = i411 % 2;
                            if (iMin2 > 0) {
                                int i413 = i6 & 11;
                                int i414 = -(-((i6 ^ 11) | i413));
                                int i510 = ((i413 | i414) << 1) - (i414 ^ i413);
                                b = i510 % 128;
                                int i511 = i510 % 2;
                                iSave = canvas.save();
                                Rect rect4 = this.l;
                                int i512 = b;
                                int i513 = i512 & 41;
                                int i514 = i513 + ((i512 ^ 41) | i513);
                                a = i514 % 128;
                                int i515 = i514 % 2;
                                float f3 = rect4.left;
                                int i516 = rect4.top;
                                int i517 = b;
                                int i518 = ((i517 & 70) + (i517 | 70)) - 1;
                                a = i518 % 128;
                                int i519 = i518 % 2;
                                canvas.translate(f3, i516);
                                if (!isAutoMirrored()) {
                                    int i612 = b;
                                    int i613 = i612 & 75;
                                    int i614 = -(-((i612 ^ 75) | i613));
                                    int i615 = (i613 ^ i614) + ((i614 & i613) << 1);
                                    a = i615 % 128;
                                    int i616 = i615 % 2;
                                    z = false;
                                } else {
                                    int i617 = b;
                                    int i618 = i617 & 67;
                                    i16 = (((i617 | 67) & (~i618)) - (~(-(-(i618 << 1))))) - 1;
                                    a = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        int i619 = b;
                                        int i6110 = i619 & 75;
                                        int i6111 = -(-((i619 ^ 75) | i6110));
                                        int i6112 = (i6110 ^ i6111) + ((i6111 & i6110) << 1);
                                        a = i6112 % 128;
                                        int i6113 = i6112 % 2;
                                        z = false;
                                    } else {
                                        int i6114 = b;
                                        int i6115 = i6114 & 75;
                                        int i6116 = -(-((i6114 ^ 75) | i6115));
                                        int i6117 = (i6115 ^ i6116) + ((i6116 & i6115) << 1);
                                        a = i6117 % 128;
                                        int i6118 = i6117 % 2;
                                        z = false;
                                    }
                                }
                                if (!(!z)) {
                                    int i710 = a;
                                    i15 = (i710 ^ 49) + ((i710 & 49) << 1);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        canvas.translate(this.l.width(), 2.0f);
                                    } else {
                                        canvas.translate(this.l.width(), 0.0f);
                                    }
                                    int i711 = a;
                                    int i712 = i711 & 75;
                                    int i713 = ((i711 | 75) & (~i712)) + (i712 << 1);
                                    b = i713 % 128;
                                    int i714 = i713 % 2;
                                    canvas.scale(-1.0f, 1.0f);
                                    int i715 = b + 97;
                                    a = i715 % 128;
                                    int i813 = i715 % 2;
                                }
                                this.l.offsetTo(0, 0);
                                bir = this.f;
                                int i814 = a + 61;
                                b = i814 % 128;
                                int i815 = i814 % 2;
                                bitmap = bir.h;
                                if (bitmap != null) {
                                    int i816 = a;
                                    int i817 = i816 & 13;
                                    int i818 = (i816 ^ 13) | i817;
                                    i14 = (i817 ^ i818) + ((i818 & i817) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i819 = 81 / 0;
                                        if (iMin == bitmap.getWidth()) {
                                            if (iMin2 == bir.h.getHeight()) {
                                                int i8110 = a;
                                                int i8111 = i8110 & 17;
                                                int i8112 = (i8110 ^ 17) | i8111;
                                                int i913 = (i8111 & i8112) + (i8112 | i8111);
                                                b = i913 % 128;
                                                int i914 = i913 % 2;
                                            }
                                        }
                                    } else if (iMin == bitmap.getWidth()) {
                                        if (iMin2 == bir.h.getHeight()) {
                                            int i8113 = a;
                                            int i8114 = i8113 & 17;
                                            int i8115 = (i8113 ^ 17) | i8114;
                                            int i915 = (i8114 & i8115) + (i8115 | i8114);
                                            b = i915 % 128;
                                            int i916 = i915 % 2;
                                        }
                                    }
                                    int i917 = a;
                                    int i918 = ((i917 | 23) << 1) - (i917 ^ 23);
                                    b = i918 % 128;
                                    int i919 = i918 % 2;
                                    bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                    int i9110 = a;
                                    int i9111 = i9110 & 101;
                                    int i9112 = (i9110 | 101) & (~i9111);
                                    int i1014 = -(-(i9111 << 1));
                                    i7 = (i9112 ^ i1014) + ((i9112 & i1014) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bir.m = false;
                                    } else {
                                        bir.m = true;
                                    }
                                    int i1015 = a + 79;
                                    b = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                } else {
                                    bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                    int i9113 = a;
                                    int i9114 = i9113 & 101;
                                    int i9115 = (i9113 | 101) & (~i9114);
                                    int i1017 = -(-(i9114 << 1));
                                    i7 = (i9115 ^ i1017) + ((i9115 & i1017) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bir.m = false;
                                    } else {
                                        bir.m = true;
                                    }
                                    int i1018 = a + 79;
                                    b = i1018 % 128;
                                    int i1019 = i1018 % 2;
                                }
                                if (this.j) {
                                    int i1410 = b + 45;
                                    a = i1410 % 128;
                                    int i1411 = i1410 % 2;
                                    this.f.e(iMin, iMin2);
                                    int i1412 = b;
                                    int i1413 = ((i1412 & 78) + (i1412 | 78)) - 1;
                                    a = i1413 % 128;
                                    int i1414 = i1413 % 2;
                                } else {
                                    bir2 = this.f;
                                    if (bir2.m) {
                                        int i1217 = a;
                                        int i1218 = i1217 & 5;
                                        int i1219 = -(-(i1217 | 5));
                                        i8 = (i1218 ^ i1219) + ((i1219 & i1218) << 1);
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i1310 = 87 / 0;
                                            if (bir2.j == bir2.f) {
                                                if (bir2.k != bir2.g) {
                                                }
                                            }
                                        } else if (bir2.j == bir2.f) {
                                            if (bir2.k != bir2.g) {
                                            }
                                        }
                                        int i10110 = a;
                                        int i10111 = i10110 & 121;
                                        int i10112 = (((i10110 ^ 121) | i10111) << 1) - ((~i10111) & (i10110 | 121));
                                        b = i10112 % 128;
                                        int i10113 = i10112 % 2;
                                        int i11110 = ((i10110 | 47) << 1) - (i10110 ^ 47);
                                        b = i11110 % 128;
                                        int i11111 = i11110 % 2;
                                        this.f.e(iMin, iMin2);
                                        bIr bir6 = this.f;
                                        int i11112 = b;
                                        int i11113 = i11112 & 81;
                                        int i11114 = (i11113 - (~(-(-((i11112 ^ 81) | i11113))))) - 1;
                                        a = i11114 % 128;
                                        int i11115 = i11114 % 2;
                                        bir6.j = bir6.f;
                                        PorterDuff.Mode mode3 = bir6.g;
                                        int i11116 = b;
                                        int i11117 = ((i11116 ^ 118) + ((i11116 & 118) << 1)) - 1;
                                        a = i11117 % 128;
                                        int i11118 = i11117 % 2;
                                        bir6.k = mode3;
                                        bir6.c = bir6.e.getRootAlpha();
                                        int i11119 = b;
                                        int i12110 = ((i11119 | 43) << 1) - (i11119 ^ 43);
                                        a = i12110 % 128;
                                        int i12111 = i12110 % 2;
                                        bir6.l = bir6.i;
                                        bir6.m = false;
                                        int i12112 = b;
                                        int i12113 = i12112 ^ 7;
                                        int i12114 = (i12112 & 7) << 1;
                                        int i12115 = (i12113 ^ i12114) + ((i12114 & i12113) << 1);
                                        a = i12115 % 128;
                                        int i12116 = i12115 % 2;
                                    } else {
                                        int i10114 = a;
                                        int i10115 = i10114 & 121;
                                        int i10116 = (((i10114 ^ 121) | i10115) << 1) - ((~i10115) & (i10114 | 121));
                                        b = i10116 % 128;
                                        int i10117 = i10116 % 2;
                                        int i111110 = ((i10114 | 47) << 1) - (i10114 ^ 47);
                                        b = i111110 % 128;
                                        int i111111 = i111110 % 2;
                                        this.f.e(iMin, iMin2);
                                        bIr bir7 = this.f;
                                        int i111112 = b;
                                        int i111113 = i111112 & 81;
                                        int i111114 = (i111113 - (~(-(-((i111112 ^ 81) | i111113))))) - 1;
                                        a = i111114 % 128;
                                        int i111115 = i111114 % 2;
                                        bir7.j = bir7.f;
                                        PorterDuff.Mode mode4 = bir7.g;
                                        int i111116 = b;
                                        int i111117 = ((i111116 ^ 118) + ((i111116 & 118) << 1)) - 1;
                                        a = i111117 % 128;
                                        int i111118 = i111117 % 2;
                                        bir7.k = mode4;
                                        bir7.c = bir7.e.getRootAlpha();
                                        int i111119 = b;
                                        int i12117 = ((i111119 | 43) << 1) - (i111119 ^ 43);
                                        a = i12117 % 128;
                                        int i12118 = i12117 % 2;
                                        bir7.l = bir7.i;
                                        bir7.m = false;
                                        int i12119 = b;
                                        int i121110 = i12119 ^ 7;
                                        int i121111 = (i12119 & 7) << 1;
                                        int i121112 = (i121110 ^ i121111) + ((i121111 & i121110) << 1);
                                        a = i121112 % 128;
                                        int i121113 = i121112 % 2;
                                    }
                                }
                                bir3 = this.f;
                                Rect rect5 = this.l;
                                int i1415 = a;
                                int i1416 = (i1415 & 73) + (i1415 | 73);
                                b = i1416 % 128;
                                z2 = i1416 % 2 == 0 ? false : false;
                                if (!z2) {
                                    i12 = a;
                                    i13 = ((i12 & 121) - (~(i12 | 121))) - 1;
                                    b = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                    if (colorFilter == null) {
                                        int i1516 = i12 + 47;
                                        b = i1516 % 128;
                                        int i1517 = i1516 % 2;
                                        paint = null;
                                    } else {
                                        if (bir3.n == null) {
                                            paint2 = new Paint();
                                            bir3.n = paint2;
                                            i9 = b + 5;
                                            a = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                paint2.setFilterBitmap(false);
                                            } else {
                                                paint2.setFilterBitmap(true);
                                            }
                                            int i1518 = b;
                                            int i1519 = (i1518 | 89) << 1;
                                            int i15110 = -(((~i1518) & 89) | (i1518 & (-90)));
                                            i10 = ((i1519 | i15110) << 1) - (i15110 ^ i1519);
                                            a = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                int i15111 = 2 / 4;
                                            }
                                        }
                                        Paint paint5 = bir3.n;
                                        int rootAlpha3 = bir3.e.getRootAlpha();
                                        int i15112 = b;
                                        int i15113 = ((i15112 | 1) << 1) - (i15112 ^ 1);
                                        a = i15113 % 128;
                                        int i16110 = i15113 % 2;
                                        paint5.setAlpha(rootAlpha3);
                                        bir3.n.setColorFilter(colorFilter);
                                        int i16111 = b;
                                        int i16112 = (i16111 & (-122)) | ((~i16111) & 121);
                                        int i16113 = -(-((i16111 & 121) << 1));
                                        int i16114 = (i16112 ^ i16113) + ((i16113 & i16112) << 1);
                                        a = i16114 % 128;
                                        int i16115 = i16114 % 2;
                                        paint = bir3.n;
                                        int i16116 = a;
                                        int i16117 = i16116 & 117;
                                        int i16118 = (i16116 ^ 117) | i16117;
                                        int i16119 = ((i16117 | i16118) << 1) - (i16118 ^ i16117);
                                        b = i16119 % 128;
                                        int i173 = i16119 % 2;
                                    }
                                } else {
                                    if (bir3.n == null) {
                                        paint2 = new Paint();
                                        bir3.n = paint2;
                                        i9 = b + 5;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            paint2.setFilterBitmap(false);
                                        } else {
                                            paint2.setFilterBitmap(true);
                                        }
                                        int i15114 = b;
                                        int i15115 = (i15114 | 89) << 1;
                                        int i15116 = -(((~i15114) & 89) | (i15114 & (-90)));
                                        i10 = ((i15115 | i15116) << 1) - (i15116 ^ i15115);
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            int i15117 = 2 / 4;
                                        }
                                    }
                                    Paint paint6 = bir3.n;
                                    int rootAlpha4 = bir3.e.getRootAlpha();
                                    int i15118 = b;
                                    int i15119 = ((i15118 | 1) << 1) - (i15118 ^ 1);
                                    a = i15119 % 128;
                                    int i161110 = i15119 % 2;
                                    paint6.setAlpha(rootAlpha4);
                                    bir3.n.setColorFilter(colorFilter);
                                    int i161111 = b;
                                    int i161112 = (i161111 & (-122)) | ((~i161111) & 121);
                                    int i161113 = -(-((i161111 & 121) << 1));
                                    int i161114 = (i161112 ^ i161113) + ((i161113 & i161112) << 1);
                                    a = i161114 % 128;
                                    int i161115 = i161114 % 2;
                                    paint = bir3.n;
                                    int i161116 = a;
                                    int i161117 = i161116 & 117;
                                    int i161118 = (i161116 ^ 117) | i161117;
                                    int i161119 = ((i161117 | i161118) << 1) - (i161118 ^ i161117);
                                    b = i161119 % 128;
                                    int i174 = i161119 % 2;
                                }
                                canvas.drawBitmap(bir3.h, (Rect) null, rect5, paint);
                                int i175 = b;
                                i11 = (((i175 & (-106)) | ((~i175) & 105)) - (~((i175 & 105) << 1))) - 1;
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    canvas.restoreToCount(iSave);
                                    throw null;
                                }
                                canvas.restoreToCount(iSave);
                            }
                        }
                    }
                }
            }
        } else if (rect.width() > 0) {
            int i210 = b;
            int i211 = ((i210 | 99) << 1) - (i210 ^ 99);
            a = i211 % 128;
            int i212 = i211 % 2;
            if (this.l.height() > 0) {
                i = b;
                int i213 = i ^ 73;
                int i310 = (i & 73) << 1;
                i2 = (i213 ^ i310) + ((i213 & i310) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                colorFilter = this.i;
                if (colorFilter == null) {
                    colorFilter = this.g;
                    int i311 = i + 3;
                    a = i311 % 128;
                    int i312 = i311 % 2;
                }
                canvas.getMatrix(this.e);
                matrix = this.e;
                fArr = this.k;
                int i313 = a;
                int i314 = (i313 | 5) << 1;
                int i315 = -(((~i313) & 5) | (i313 & (-6)));
                i3 = (i314 ^ i315) + ((i315 & i314) << 1);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    matrix.getValues(fArr);
                    f = this.k[0];
                } else {
                    matrix.getValues(fArr);
                    f = this.k[0];
                }
                fAbs = Math.abs(f);
                fAbs2 = Math.abs(this.k[4]);
                fAbs3 = Math.abs(this.k[1]);
                int i316 = b;
                int i317 = (((i316 | 105) << 1) - (~(-(((~i316) & 105) | (i316 & (-106)))))) - 1;
                a = i317 % 128;
                int i318 = i317 % 2;
                float fAbs5 = Math.abs(this.k[3]);
                int i319 = b + 101;
                i4 = i319 % 128;
                a = i4;
                int i415 = i319 % 2;
                if (fAbs3 == 0.0f) {
                    int i416 = i4 & 33;
                    int i417 = ((~i416) & (i4 | 33)) + (i416 << 1);
                    b = i417 % 128;
                    int i418 = i417 % 2;
                    fAbs = 1.0f;
                    fAbs2 = 1.0f;
                } else {
                    int i419 = i4 & 33;
                    int i4110 = ((~i419) & (i4 | 33)) + (i419 << 1);
                    b = i4110 % 128;
                    int i4111 = i4110 % 2;
                    fAbs = 1.0f;
                    fAbs2 = 1.0f;
                }
                int iWidth2 = (int) (this.l.width() * fAbs);
                iHeight = (int) (this.l.height() * fAbs2);
                iMin = Math.min(2048, iWidth2);
                int i420 = b;
                i5 = (i420 & 33) + (i420 | 33);
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    iMin2 = Math.min(11892, iHeight);
                    if (iMin > 0) {
                        int i4112 = b;
                        int i4113 = ((i4112 | 15) << 1) - (i4112 ^ 15);
                        i6 = i4113 % 128;
                        a = i6;
                        int i4114 = i4113 % 2;
                        if (iMin2 > 0) {
                            int i4115 = i6 & 11;
                            int i4116 = -(-((i6 ^ 11) | i4115));
                            int i5110 = ((i4115 | i4116) << 1) - (i4116 ^ i4115);
                            b = i5110 % 128;
                            int i5111 = i5110 % 2;
                            iSave = canvas.save();
                            Rect rect6 = this.l;
                            int i5112 = b;
                            int i5113 = i5112 & 41;
                            int i5114 = i5113 + ((i5112 ^ 41) | i5113);
                            a = i5114 % 128;
                            int i5115 = i5114 % 2;
                            float f4 = rect6.left;
                            int i5116 = rect6.top;
                            int i5117 = b;
                            int i5118 = ((i5117 & 70) + (i5117 | 70)) - 1;
                            a = i5118 % 128;
                            int i5119 = i5118 % 2;
                            canvas.translate(f4, i5116);
                            if (!isAutoMirrored()) {
                                int i6119 = b;
                                int i61110 = i6119 & 75;
                                int i61111 = -(-((i6119 ^ 75) | i61110));
                                int i61112 = (i61110 ^ i61111) + ((i61111 & i61110) << 1);
                                a = i61112 % 128;
                                int i61113 = i61112 % 2;
                                z = false;
                            } else {
                                int i6120 = b;
                                int i6121 = i6120 & 67;
                                i16 = (((i6120 | 67) & (~i6121)) - (~(-(-(i6121 << 1))))) - 1;
                                a = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i61114 = b;
                                    int i61115 = i61114 & 75;
                                    int i61116 = -(-((i61114 ^ 75) | i61115));
                                    int i61117 = (i61115 ^ i61116) + ((i61116 & i61115) << 1);
                                    a = i61117 % 128;
                                    int i61118 = i61117 % 2;
                                    z = false;
                                } else {
                                    int i61119 = b;
                                    int i611110 = i61119 & 75;
                                    int i611111 = -(-((i61119 ^ 75) | i611110));
                                    int i611112 = (i611110 ^ i611111) + ((i611111 & i611110) << 1);
                                    a = i611112 % 128;
                                    int i611113 = i611112 % 2;
                                    z = false;
                                }
                            }
                            if (!(!z)) {
                                int i716 = a;
                                i15 = (i716 ^ 49) + ((i716 & 49) << 1);
                                b = i15 % 128;
                                if (i15 % 2 == 0) {
                                    canvas.translate(this.l.width(), 2.0f);
                                } else {
                                    canvas.translate(this.l.width(), 0.0f);
                                }
                                int i717 = a;
                                int i718 = i717 & 75;
                                int i719 = ((i717 | 75) & (~i718)) + (i718 << 1);
                                b = i719 % 128;
                                int i7110 = i719 % 2;
                                canvas.scale(-1.0f, 1.0f);
                                int i7111 = b + 97;
                                a = i7111 % 128;
                                int i8116 = i7111 % 2;
                            }
                            this.l.offsetTo(0, 0);
                            bir = this.f;
                            int i8117 = a + 61;
                            b = i8117 % 128;
                            int i8118 = i8117 % 2;
                            bitmap = bir.h;
                            if (bitmap != null) {
                                int i8119 = a;
                                int i8120 = i8119 & 13;
                                int i8121 = (i8119 ^ 13) | i8120;
                                i14 = (i8120 ^ i8121) + ((i8121 & i8120) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i8122 = 81 / 0;
                                    if (iMin == bitmap.getWidth()) {
                                        if (iMin2 == bir.h.getHeight()) {
                                            int i81110 = a;
                                            int i81111 = i81110 & 17;
                                            int i81112 = (i81110 ^ 17) | i81111;
                                            int i9116 = (i81111 & i81112) + (i81112 | i81111);
                                            b = i9116 % 128;
                                            int i9117 = i9116 % 2;
                                        }
                                    }
                                } else if (iMin == bitmap.getWidth()) {
                                    if (iMin2 == bir.h.getHeight()) {
                                        int i81113 = a;
                                        int i81114 = i81113 & 17;
                                        int i81115 = (i81113 ^ 17) | i81114;
                                        int i9118 = (i81114 & i81115) + (i81115 | i81114);
                                        b = i9118 % 128;
                                        int i9119 = i9118 % 2;
                                    }
                                }
                                int i9120 = a;
                                int i9121 = ((i9120 | 23) << 1) - (i9120 ^ 23);
                                b = i9121 % 128;
                                int i9122 = i9121 % 2;
                                bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                int i91110 = a;
                                int i91111 = i91110 & 101;
                                int i91112 = (i91110 | 101) & (~i91111);
                                int i10118 = -(-(i91111 << 1));
                                i7 = (i91112 ^ i10118) + ((i91112 & i10118) << 1);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    bir.m = false;
                                } else {
                                    bir.m = true;
                                }
                                int i10119 = a + 79;
                                b = i10119 % 128;
                                int i10120 = i10119 % 2;
                            } else {
                                bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                int i91113 = a;
                                int i91114 = i91113 & 101;
                                int i91115 = (i91113 | 101) & (~i91114);
                                int i101110 = -(-(i91114 << 1));
                                i7 = (i91115 ^ i101110) + ((i91115 & i101110) << 1);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    bir.m = false;
                                } else {
                                    bir.m = true;
                                }
                                int i101111 = a + 79;
                                b = i101111 % 128;
                                int i10121 = i101111 % 2;
                            }
                            if (this.j) {
                                int i1417 = b + 45;
                                a = i1417 % 128;
                                int i1418 = i1417 % 2;
                                this.f.e(iMin, iMin2);
                                int i1419 = b;
                                int i14110 = ((i1419 & 78) + (i1419 | 78)) - 1;
                                a = i14110 % 128;
                                int i14111 = i14110 % 2;
                            } else {
                                bir2 = this.f;
                                if (bir2.m) {
                                    int i12120 = a;
                                    int i12121 = i12120 & 5;
                                    int i12122 = -(-(i12120 | 5));
                                    i8 = (i12121 ^ i12122) + ((i12122 & i12121) << 1);
                                    b = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i1311 = 87 / 0;
                                        if (bir2.j == bir2.f) {
                                            if (bir2.k != bir2.g) {
                                            }
                                        }
                                    } else if (bir2.j == bir2.f) {
                                        if (bir2.k != bir2.g) {
                                        }
                                    }
                                    int i101112 = a;
                                    int i101113 = i101112 & 121;
                                    int i101114 = (((i101112 ^ 121) | i101113) << 1) - ((~i101113) & (i101112 | 121));
                                    b = i101114 % 128;
                                    int i101115 = i101114 % 2;
                                    int i1111110 = ((i101112 | 47) << 1) - (i101112 ^ 47);
                                    b = i1111110 % 128;
                                    int i1111111 = i1111110 % 2;
                                    this.f.e(iMin, iMin2);
                                    bIr bir8 = this.f;
                                    int i1111112 = b;
                                    int i1111113 = i1111112 & 81;
                                    int i1111114 = (i1111113 - (~(-(-((i1111112 ^ 81) | i1111113))))) - 1;
                                    a = i1111114 % 128;
                                    int i1111115 = i1111114 % 2;
                                    bir8.j = bir8.f;
                                    PorterDuff.Mode mode5 = bir8.g;
                                    int i1111116 = b;
                                    int i1111117 = ((i1111116 ^ 118) + ((i1111116 & 118) << 1)) - 1;
                                    a = i1111117 % 128;
                                    int i1111118 = i1111117 % 2;
                                    bir8.k = mode5;
                                    bir8.c = bir8.e.getRootAlpha();
                                    int i1111119 = b;
                                    int i121114 = ((i1111119 | 43) << 1) - (i1111119 ^ 43);
                                    a = i121114 % 128;
                                    int i121115 = i121114 % 2;
                                    bir8.l = bir8.i;
                                    bir8.m = false;
                                    int i121116 = b;
                                    int i121117 = i121116 ^ 7;
                                    int i121118 = (i121116 & 7) << 1;
                                    int i121119 = (i121117 ^ i121118) + ((i121118 & i121117) << 1);
                                    a = i121119 % 128;
                                    int i1211110 = i121119 % 2;
                                } else {
                                    int i101116 = a;
                                    int i101117 = i101116 & 121;
                                    int i101118 = (((i101116 ^ 121) | i101117) << 1) - ((~i101117) & (i101116 | 121));
                                    b = i101118 % 128;
                                    int i101119 = i101118 % 2;
                                    int i11111110 = ((i101116 | 47) << 1) - (i101116 ^ 47);
                                    b = i11111110 % 128;
                                    int i11111111 = i11111110 % 2;
                                    this.f.e(iMin, iMin2);
                                    bIr bir9 = this.f;
                                    int i11111112 = b;
                                    int i11111113 = i11111112 & 81;
                                    int i11111114 = (i11111113 - (~(-(-((i11111112 ^ 81) | i11111113))))) - 1;
                                    a = i11111114 % 128;
                                    int i11111115 = i11111114 % 2;
                                    bir9.j = bir9.f;
                                    PorterDuff.Mode mode6 = bir9.g;
                                    int i11111116 = b;
                                    int i11111117 = ((i11111116 ^ 118) + ((i11111116 & 118) << 1)) - 1;
                                    a = i11111117 % 128;
                                    int i11111118 = i11111117 % 2;
                                    bir9.k = mode6;
                                    bir9.c = bir9.e.getRootAlpha();
                                    int i11111119 = b;
                                    int i1211111 = ((i11111119 | 43) << 1) - (i11111119 ^ 43);
                                    a = i1211111 % 128;
                                    int i1211112 = i1211111 % 2;
                                    bir9.l = bir9.i;
                                    bir9.m = false;
                                    int i1211113 = b;
                                    int i1211114 = i1211113 ^ 7;
                                    int i1211115 = (i1211113 & 7) << 1;
                                    int i1211116 = (i1211114 ^ i1211115) + ((i1211115 & i1211114) << 1);
                                    a = i1211116 % 128;
                                    int i1211117 = i1211116 % 2;
                                }
                            }
                            bir3 = this.f;
                            Rect rect7 = this.l;
                            int i14112 = a;
                            int i14113 = (i14112 & 73) + (i14112 | 73);
                            b = i14113 % 128;
                            if (i14113 % 2 == 0) {
                            }
                            if (!z2) {
                                i12 = a;
                                i13 = ((i12 & 121) - (~(i12 | 121))) - 1;
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    throw null;
                                }
                                if (colorFilter == null) {
                                    int i15120 = i12 + 47;
                                    b = i15120 % 128;
                                    int i15121 = i15120 % 2;
                                    paint = null;
                                } else {
                                    if (bir3.n == null) {
                                        paint2 = new Paint();
                                        bir3.n = paint2;
                                        i9 = b + 5;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            paint2.setFilterBitmap(false);
                                        } else {
                                            paint2.setFilterBitmap(true);
                                        }
                                        int i151110 = b;
                                        int i151111 = (i151110 | 89) << 1;
                                        int i151112 = -(((~i151110) & 89) | (i151110 & (-90)));
                                        i10 = ((i151111 | i151112) << 1) - (i151112 ^ i151111);
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            int i151113 = 2 / 4;
                                        }
                                    }
                                    Paint paint7 = bir3.n;
                                    int rootAlpha5 = bir3.e.getRootAlpha();
                                    int i151114 = b;
                                    int i151115 = ((i151114 | 1) << 1) - (i151114 ^ 1);
                                    a = i151115 % 128;
                                    int i1611110 = i151115 % 2;
                                    paint7.setAlpha(rootAlpha5);
                                    bir3.n.setColorFilter(colorFilter);
                                    int i1611111 = b;
                                    int i1611112 = (i1611111 & (-122)) | ((~i1611111) & 121);
                                    int i1611113 = -(-((i1611111 & 121) << 1));
                                    int i1611114 = (i1611112 ^ i1611113) + ((i1611113 & i1611112) << 1);
                                    a = i1611114 % 128;
                                    int i1611115 = i1611114 % 2;
                                    paint = bir3.n;
                                    int i1611116 = a;
                                    int i1611117 = i1611116 & 117;
                                    int i1611118 = (i1611116 ^ 117) | i1611117;
                                    int i1611119 = ((i1611117 | i1611118) << 1) - (i1611118 ^ i1611117);
                                    b = i1611119 % 128;
                                    int i176 = i1611119 % 2;
                                }
                            } else {
                                if (bir3.n == null) {
                                    paint2 = new Paint();
                                    bir3.n = paint2;
                                    i9 = b + 5;
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        paint2.setFilterBitmap(false);
                                    } else {
                                        paint2.setFilterBitmap(true);
                                    }
                                    int i151116 = b;
                                    int i151117 = (i151116 | 89) << 1;
                                    int i151118 = -(((~i151116) & 89) | (i151116 & (-90)));
                                    i10 = ((i151117 | i151118) << 1) - (i151118 ^ i151117);
                                    a = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i151119 = 2 / 4;
                                    }
                                }
                                Paint paint8 = bir3.n;
                                int rootAlpha6 = bir3.e.getRootAlpha();
                                int i1511110 = b;
                                int i1511111 = ((i1511110 | 1) << 1) - (i1511110 ^ 1);
                                a = i1511111 % 128;
                                int i16111110 = i1511111 % 2;
                                paint8.setAlpha(rootAlpha6);
                                bir3.n.setColorFilter(colorFilter);
                                int i16111111 = b;
                                int i16111112 = (i16111111 & (-122)) | ((~i16111111) & 121);
                                int i16111113 = -(-((i16111111 & 121) << 1));
                                int i16111114 = (i16111112 ^ i16111113) + ((i16111113 & i16111112) << 1);
                                a = i16111114 % 128;
                                int i16111115 = i16111114 % 2;
                                paint = bir3.n;
                                int i16111116 = a;
                                int i16111117 = i16111116 & 117;
                                int i16111118 = (i16111116 ^ 117) | i16111117;
                                int i16111119 = ((i16111117 | i16111118) << 1) - (i16111118 ^ i16111117);
                                b = i16111119 % 128;
                                int i177 = i16111119 % 2;
                            }
                            canvas.drawBitmap(bir3.h, (Rect) null, rect7, paint);
                            int i178 = b;
                            i11 = (((i178 & (-106)) | ((~i178) & 105)) - (~((i178 & 105) << 1))) - 1;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                canvas.restoreToCount(iSave);
                                throw null;
                            }
                            canvas.restoreToCount(iSave);
                        }
                    }
                } else {
                    iMin2 = Math.min(2048, iHeight);
                    if (iMin > 0) {
                        int i4117 = b;
                        int i4118 = ((i4117 | 15) << 1) - (i4117 ^ 15);
                        i6 = i4118 % 128;
                        a = i6;
                        int i4119 = i4118 % 2;
                        if (iMin2 > 0) {
                            int i41110 = i6 & 11;
                            int i41111 = -(-((i6 ^ 11) | i41110));
                            int i51110 = ((i41110 | i41111) << 1) - (i41111 ^ i41110);
                            b = i51110 % 128;
                            int i51111 = i51110 % 2;
                            iSave = canvas.save();
                            Rect rect8 = this.l;
                            int i51112 = b;
                            int i51113 = i51112 & 41;
                            int i51114 = i51113 + ((i51112 ^ 41) | i51113);
                            a = i51114 % 128;
                            int i51115 = i51114 % 2;
                            float f5 = rect8.left;
                            int i51116 = rect8.top;
                            int i51117 = b;
                            int i51118 = ((i51117 & 70) + (i51117 | 70)) - 1;
                            a = i51118 % 128;
                            int i51119 = i51118 % 2;
                            canvas.translate(f5, i51116);
                            if (!isAutoMirrored()) {
                                int i611114 = b;
                                int i611115 = i611114 & 75;
                                int i611116 = -(-((i611114 ^ 75) | i611115));
                                int i611117 = (i611115 ^ i611116) + ((i611116 & i611115) << 1);
                                a = i611117 % 128;
                                int i611118 = i611117 % 2;
                                z = false;
                            } else {
                                int i6122 = b;
                                int i6123 = i6122 & 67;
                                i16 = (((i6122 | 67) & (~i6123)) - (~(-(-(i6123 << 1))))) - 1;
                                a = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i611119 = b;
                                    int i6111110 = i611119 & 75;
                                    int i6111111 = -(-((i611119 ^ 75) | i6111110));
                                    int i6111112 = (i6111110 ^ i6111111) + ((i6111111 & i6111110) << 1);
                                    a = i6111112 % 128;
                                    int i6111113 = i6111112 % 2;
                                    z = false;
                                } else {
                                    int i6111114 = b;
                                    int i6111115 = i6111114 & 75;
                                    int i6111116 = -(-((i6111114 ^ 75) | i6111115));
                                    int i6111117 = (i6111115 ^ i6111116) + ((i6111116 & i6111115) << 1);
                                    a = i6111117 % 128;
                                    int i6111118 = i6111117 % 2;
                                    z = false;
                                }
                            }
                            if (!(!z)) {
                                int i7112 = a;
                                i15 = (i7112 ^ 49) + ((i7112 & 49) << 1);
                                b = i15 % 128;
                                if (i15 % 2 == 0) {
                                    canvas.translate(this.l.width(), 2.0f);
                                } else {
                                    canvas.translate(this.l.width(), 0.0f);
                                }
                                int i7113 = a;
                                int i7114 = i7113 & 75;
                                int i7115 = ((i7113 | 75) & (~i7114)) + (i7114 << 1);
                                b = i7115 % 128;
                                int i7116 = i7115 % 2;
                                canvas.scale(-1.0f, 1.0f);
                                int i7117 = b + 97;
                                a = i7117 % 128;
                                int i81116 = i7117 % 2;
                            }
                            this.l.offsetTo(0, 0);
                            bir = this.f;
                            int i81117 = a + 61;
                            b = i81117 % 128;
                            int i81118 = i81117 % 2;
                            bitmap = bir.h;
                            if (bitmap != null) {
                                int i81119 = a;
                                int i8123 = i81119 & 13;
                                int i8124 = (i81119 ^ 13) | i8123;
                                i14 = (i8123 ^ i8124) + ((i8124 & i8123) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i8125 = 81 / 0;
                                    if (iMin == bitmap.getWidth()) {
                                        if (iMin2 == bir.h.getHeight()) {
                                            int i811110 = a;
                                            int i811111 = i811110 & 17;
                                            int i811112 = (i811110 ^ 17) | i811111;
                                            int i91116 = (i811111 & i811112) + (i811112 | i811111);
                                            b = i91116 % 128;
                                            int i91117 = i91116 % 2;
                                        }
                                    }
                                } else if (iMin == bitmap.getWidth()) {
                                    if (iMin2 == bir.h.getHeight()) {
                                        int i811113 = a;
                                        int i811114 = i811113 & 17;
                                        int i811115 = (i811113 ^ 17) | i811114;
                                        int i91118 = (i811114 & i811115) + (i811115 | i811114);
                                        b = i91118 % 128;
                                        int i91119 = i91118 % 2;
                                    }
                                }
                                int i9123 = a;
                                int i9124 = ((i9123 | 23) << 1) - (i9123 ^ 23);
                                b = i9124 % 128;
                                int i9125 = i9124 % 2;
                                bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                int i911110 = a;
                                int i911111 = i911110 & 101;
                                int i911112 = (i911110 | 101) & (~i911111);
                                int i1011110 = -(-(i911111 << 1));
                                i7 = (i911112 ^ i1011110) + ((i911112 & i1011110) << 1);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    bir.m = false;
                                } else {
                                    bir.m = true;
                                }
                                int i1011111 = a + 79;
                                b = i1011111 % 128;
                                int i10122 = i1011111 % 2;
                            } else {
                                bir.h = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                                int i911113 = a;
                                int i911114 = i911113 & 101;
                                int i911115 = (i911113 | 101) & (~i911114);
                                int i1011112 = -(-(i911114 << 1));
                                i7 = (i911115 ^ i1011112) + ((i911115 & i1011112) << 1);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    bir.m = false;
                                } else {
                                    bir.m = true;
                                }
                                int i1011113 = a + 79;
                                b = i1011113 % 128;
                                int i10123 = i1011113 % 2;
                            }
                            if (this.j) {
                                int i14114 = b + 45;
                                a = i14114 % 128;
                                int i14115 = i14114 % 2;
                                this.f.e(iMin, iMin2);
                                int i14116 = b;
                                int i14117 = ((i14116 & 78) + (i14116 | 78)) - 1;
                                a = i14117 % 128;
                                int i14118 = i14117 % 2;
                            } else {
                                bir2 = this.f;
                                if (bir2.m) {
                                    int i12123 = a;
                                    int i12124 = i12123 & 5;
                                    int i12125 = -(-(i12123 | 5));
                                    i8 = (i12124 ^ i12125) + ((i12125 & i12124) << 1);
                                    b = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i1312 = 87 / 0;
                                        if (bir2.j == bir2.f) {
                                            if (bir2.k != bir2.g) {
                                            }
                                        }
                                    } else if (bir2.j == bir2.f) {
                                        if (bir2.k != bir2.g) {
                                        }
                                    }
                                    int i1011114 = a;
                                    int i1011115 = i1011114 & 121;
                                    int i1011116 = (((i1011114 ^ 121) | i1011115) << 1) - ((~i1011115) & (i1011114 | 121));
                                    b = i1011116 % 128;
                                    int i1011117 = i1011116 % 2;
                                    int i111111110 = ((i1011114 | 47) << 1) - (i1011114 ^ 47);
                                    b = i111111110 % 128;
                                    int i111111111 = i111111110 % 2;
                                    this.f.e(iMin, iMin2);
                                    bIr bir10 = this.f;
                                    int i111111112 = b;
                                    int i111111113 = i111111112 & 81;
                                    int i111111114 = (i111111113 - (~(-(-((i111111112 ^ 81) | i111111113))))) - 1;
                                    a = i111111114 % 128;
                                    int i111111115 = i111111114 % 2;
                                    bir10.j = bir10.f;
                                    PorterDuff.Mode mode7 = bir10.g;
                                    int i111111116 = b;
                                    int i111111117 = ((i111111116 ^ 118) + ((i111111116 & 118) << 1)) - 1;
                                    a = i111111117 % 128;
                                    int i111111118 = i111111117 % 2;
                                    bir10.k = mode7;
                                    bir10.c = bir10.e.getRootAlpha();
                                    int i111111119 = b;
                                    int i1211118 = ((i111111119 | 43) << 1) - (i111111119 ^ 43);
                                    a = i1211118 % 128;
                                    int i1211119 = i1211118 % 2;
                                    bir10.l = bir10.i;
                                    bir10.m = false;
                                    int i12111110 = b;
                                    int i12111111 = i12111110 ^ 7;
                                    int i12111112 = (i12111110 & 7) << 1;
                                    int i12111113 = (i12111111 ^ i12111112) + ((i12111112 & i12111111) << 1);
                                    a = i12111113 % 128;
                                    int i12111114 = i12111113 % 2;
                                } else {
                                    int i1011118 = a;
                                    int i1011119 = i1011118 & 121;
                                    int i10111110 = (((i1011118 ^ 121) | i1011119) << 1) - ((~i1011119) & (i1011118 | 121));
                                    b = i10111110 % 128;
                                    int i10111111 = i10111110 % 2;
                                    int i1111111110 = ((i1011118 | 47) << 1) - (i1011118 ^ 47);
                                    b = i1111111110 % 128;
                                    int i1111111111 = i1111111110 % 2;
                                    this.f.e(iMin, iMin2);
                                    bIr bir11 = this.f;
                                    int i1111111112 = b;
                                    int i1111111113 = i1111111112 & 81;
                                    int i1111111114 = (i1111111113 - (~(-(-((i1111111112 ^ 81) | i1111111113))))) - 1;
                                    a = i1111111114 % 128;
                                    int i1111111115 = i1111111114 % 2;
                                    bir11.j = bir11.f;
                                    PorterDuff.Mode mode8 = bir11.g;
                                    int i1111111116 = b;
                                    int i1111111117 = ((i1111111116 ^ 118) + ((i1111111116 & 118) << 1)) - 1;
                                    a = i1111111117 % 128;
                                    int i1111111118 = i1111111117 % 2;
                                    bir11.k = mode8;
                                    bir11.c = bir11.e.getRootAlpha();
                                    int i1111111119 = b;
                                    int i12111115 = ((i1111111119 | 43) << 1) - (i1111111119 ^ 43);
                                    a = i12111115 % 128;
                                    int i12111116 = i12111115 % 2;
                                    bir11.l = bir11.i;
                                    bir11.m = false;
                                    int i12111117 = b;
                                    int i12111118 = i12111117 ^ 7;
                                    int i12111119 = (i12111117 & 7) << 1;
                                    int i121111110 = (i12111118 ^ i12111119) + ((i12111119 & i12111118) << 1);
                                    a = i121111110 % 128;
                                    int i121111111 = i121111110 % 2;
                                }
                            }
                            bir3 = this.f;
                            Rect rect9 = this.l;
                            int i14119 = a;
                            int i141110 = (i14119 & 73) + (i14119 | 73);
                            b = i141110 % 128;
                            if (i141110 % 2 == 0) {
                            }
                            if (!z2) {
                                i12 = a;
                                i13 = ((i12 & 121) - (~(i12 | 121))) - 1;
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    throw null;
                                }
                                if (colorFilter == null) {
                                    int i15122 = i12 + 47;
                                    b = i15122 % 128;
                                    int i15123 = i15122 % 2;
                                    paint = null;
                                } else {
                                    if (bir3.n == null) {
                                        paint2 = new Paint();
                                        bir3.n = paint2;
                                        i9 = b + 5;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            paint2.setFilterBitmap(false);
                                        } else {
                                            paint2.setFilterBitmap(true);
                                        }
                                        int i1511112 = b;
                                        int i1511113 = (i1511112 | 89) << 1;
                                        int i1511114 = -(((~i1511112) & 89) | (i1511112 & (-90)));
                                        i10 = ((i1511113 | i1511114) << 1) - (i1511114 ^ i1511113);
                                        a = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            int i1511115 = 2 / 4;
                                        }
                                    }
                                    Paint paint9 = bir3.n;
                                    int rootAlpha7 = bir3.e.getRootAlpha();
                                    int i1511116 = b;
                                    int i1511117 = ((i1511116 | 1) << 1) - (i1511116 ^ 1);
                                    a = i1511117 % 128;
                                    int i161111110 = i1511117 % 2;
                                    paint9.setAlpha(rootAlpha7);
                                    bir3.n.setColorFilter(colorFilter);
                                    int i161111111 = b;
                                    int i161111112 = (i161111111 & (-122)) | ((~i161111111) & 121);
                                    int i161111113 = -(-((i161111111 & 121) << 1));
                                    int i161111114 = (i161111112 ^ i161111113) + ((i161111113 & i161111112) << 1);
                                    a = i161111114 % 128;
                                    int i161111115 = i161111114 % 2;
                                    paint = bir3.n;
                                    int i161111116 = a;
                                    int i161111117 = i161111116 & 117;
                                    int i161111118 = (i161111116 ^ 117) | i161111117;
                                    int i161111119 = ((i161111117 | i161111118) << 1) - (i161111118 ^ i161111117);
                                    b = i161111119 % 128;
                                    int i179 = i161111119 % 2;
                                }
                            } else {
                                if (bir3.n == null) {
                                    paint2 = new Paint();
                                    bir3.n = paint2;
                                    i9 = b + 5;
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        paint2.setFilterBitmap(false);
                                    } else {
                                        paint2.setFilterBitmap(true);
                                    }
                                    int i1511118 = b;
                                    int i1511119 = (i1511118 | 89) << 1;
                                    int i15111110 = -(((~i1511118) & 89) | (i1511118 & (-90)));
                                    i10 = ((i1511119 | i15111110) << 1) - (i15111110 ^ i1511119);
                                    a = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i15111111 = 2 / 4;
                                    }
                                }
                                Paint paint10 = bir3.n;
                                int rootAlpha8 = bir3.e.getRootAlpha();
                                int i15111112 = b;
                                int i15111113 = ((i15111112 | 1) << 1) - (i15111112 ^ 1);
                                a = i15111113 % 128;
                                int i1611111110 = i15111113 % 2;
                                paint10.setAlpha(rootAlpha8);
                                bir3.n.setColorFilter(colorFilter);
                                int i1611111111 = b;
                                int i1611111112 = (i1611111111 & (-122)) | ((~i1611111111) & 121);
                                int i1611111113 = -(-((i1611111111 & 121) << 1));
                                int i1611111114 = (i1611111112 ^ i1611111113) + ((i1611111113 & i1611111112) << 1);
                                a = i1611111114 % 128;
                                int i1611111115 = i1611111114 % 2;
                                paint = bir3.n;
                                int i1611111116 = a;
                                int i1611111117 = i1611111116 & 117;
                                int i1611111118 = (i1611111116 ^ 117) | i1611111117;
                                int i1611111119 = ((i1611111117 | i1611111118) << 1) - (i1611111118 ^ i1611111117);
                                b = i1611111119 % 128;
                                int i1710 = i1611111119 % 2;
                            }
                            canvas.drawBitmap(bir3.h, (Rect) null, rect9, paint);
                            int i1711 = b;
                            i11 = (((i1711 & (-106)) | ((~i1711) & 105)) - (~((i1711 & 105) << 1))) - 1;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                canvas.restoreToCount(iSave);
                                throw null;
                            }
                            canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
        }
        int i180 = b + 69;
        a = i180 % 128;
        if (i180 % 2 != 0) {
            int i181 = 55 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0495  */
    /* JADX WARN: Code duplicated, block: B:164:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:172:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:235:0x071f  */
    /* JADX WARN: Code duplicated, block: B:236:0x073d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0752  */
    /* JADX WARN: Code duplicated, block: B:242:0x0761  */
    /* JADX WARN: Code duplicated, block: B:244:0x0769  */
    /* JADX WARN: Code duplicated, block: B:247:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:248:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:251:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:254:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:256:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:269:0x0861  */
    /* JADX WARN: Code duplicated, block: B:271:0x0877  */
    /* JADX WARN: Code duplicated, block: B:273:0x0888 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:274:0x0889  */
    /* JADX WARN: Code duplicated, block: B:276:0x088e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0892  */
    /* JADX WARN: Code duplicated, block: B:296:0x07fc A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateListB;
        PorterDuffColorFilter porterDuffColorFilterE;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b2;
        float f;
        float f2;
        int i6;
        float f3;
        String string;
        int i7;
        int i8;
        TypedArray typedArray;
        bIo bio;
        OooO0o<String, Object> oooO0o;
        String pathName;
        int i9;
        TypedArray typedArray2;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = b;
        int i16 = (i15 | 5) << 1;
        int i17 = -(((~i15) & 5) | (i15 & (-6)));
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i20 = b;
            int i21 = i20 | 91;
            int i22 = ((i21 << 1) - (~(-((~(i20 & 91)) & i21)))) - 1;
            a = i22 % 128;
            int i23 = i22 % 2;
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        bIr bir = this.f;
        bir.e = new bIq();
        TypedArray typedArrayE = Q.e(resources, theme, attributeSet, c.d);
        bIr bir2 = this.f;
        bIq biq = bir2.e;
        if (Q.d(xmlPullParser, "tintMode")) {
            i = typedArrayE.getInt(6, -1);
        } else {
            int i24 = b;
            int i25 = i24 & 7;
            int i26 = (i24 | 7) & (~i25);
            int i27 = i25 << 1;
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            a = i28 % 128;
            int i29 = i28 % 2;
            i = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        bir2.g = mode;
        if (Q.d(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayE.getValue(1, typedValue);
            int i30 = typedValue.type;
            if (i30 == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
            if (i30 < 28 || i30 > 31) {
                Resources resources2 = typedArrayE.getResources();
                int resourceId = typedArrayE.getResourceId(1, 0);
                int i31 = b;
                int i32 = (i31 & 15) + (i31 | 15);
                a = i32 % 128;
                int i33 = i32 % 2;
                ThreadLocal<TypedValue> threadLocal = J.c;
                try {
                    colorStateListB = J.b(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    colorStateListB = null;
                }
            } else {
                int i34 = a;
                int i35 = i34 & 37;
                int i36 = (((~i35) & (i34 | 37)) - (~(-(-(i35 << 1))))) - 1;
                b = i36 % 128;
                if (i36 % 2 == 0) {
                    ColorStateList.valueOf(typedValue.data);
                    throw null;
                }
                colorStateListB = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListB = null;
        }
        if (colorStateListB != null) {
            bir2.f = colorStateListB;
        }
        boolean z = bir2.i;
        if (Q.d(xmlPullParser, "autoMirrored")) {
            z = typedArrayE.getBoolean(5, z);
        }
        bir2.i = z;
        float f4 = biq.n;
        if (Q.d(xmlPullParser, "viewportWidth")) {
            f4 = typedArrayE.getFloat(7, f4);
        }
        biq.n = f4;
        float f5 = biq.f87o;
        if (Q.d(xmlPullParser, "viewportHeight")) {
            f5 = typedArrayE.getFloat(8, f5);
        }
        biq.f87o = f5;
        float f6 = biq.n;
        int i37 = b;
        int i38 = i37 & 31;
        int i39 = -(-((i37 ^ 31) | i38));
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        a = i40 % 128;
        if (i40 % 2 == 0 ? f6 <= 0.0f : f6 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArrayE.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        if (f5 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(typedArrayE.getPositionDescription());
            sb3.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        biq.d = typedArrayE.getDimension(3, biq.d);
        float dimension = typedArrayE.getDimension(2, biq.m);
        biq.m = dimension;
        int i41 = a;
        int i42 = (i41 & 19) + (i41 | 19);
        b = i42 % 128;
        int i43 = i42 % 2;
        if (biq.d <= 0.0f) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArrayE.getPositionDescription());
            sb4.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        if (dimension <= 0.0f) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(typedArrayE.getPositionDescription());
            sb5.append("<vector> tag requires height > 0");
            throw new XmlPullParserException(sb5.toString());
        }
        float alpha = biq.getAlpha();
        if (Q.d(xmlPullParser, "alpha")) {
            int i44 = b;
            int i45 = i44 ^ 87;
            int i46 = ((i44 & 87) | i45) << 1;
            int i47 = -i45;
            int i48 = (i46 & i47) + (i46 | i47);
            a = i48 % 128;
            alpha = i48 % 2 != 0 ? typedArrayE.getFloat(2, alpha) : typedArrayE.getFloat(4, alpha);
        }
        biq.setAlpha(alpha);
        String string2 = typedArrayE.getString(0);
        if (string2 != null) {
            biq.p = string2;
            OooO0o<String, Object> oooO0o2 = biq.s;
            int i49 = a;
            int i50 = i49 & 93;
            int i51 = (((i49 | 93) & (~i50)) - (~(i50 << 1))) - 1;
            b = i51 % 128;
            int i52 = i51 % 2;
            oooO0o2.put(string2, biq);
        }
        typedArrayE.recycle();
        bir.d = getChangingConfigurations();
        bir.m = true;
        bIr bir3 = this.f;
        bIq biq2 = bir3.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i53 = a;
        int i54 = (i53 & 110) + (i53 | 110);
        int i55 = (i54 ^ (-1)) + (i54 << 1);
        b = i55 % 128;
        int i56 = i55 % 2;
        arrayDeque.push(biq2.l);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        int i57 = a;
        int i58 = i57 & 61;
        int i59 = ((((i57 ^ 61) | i58) << 1) - (~(-((i57 | 61) & (~i58))))) - 1;
        b = i59 % 128;
        int i60 = i59 % 2 == 0 ? depth << 1 : depth - (-1);
        int i61 = 1;
        for (int i62 = 1; eventType != i62; i62 = 1) {
            int i63 = b + 17;
            a = i63 % 128;
            int i64 = i63 % i13;
            if (xmlPullParser.getDepth() < i60) {
                int i65 = a;
                int i66 = ((i65 ^ 48) + ((i65 & 48) << i62)) - i62;
                b = i66 % 128;
                if (i66 % i13 == 0) {
                    i5 = 3;
                    if (eventType == 3) {
                        if ((i61 ^ 1) != i62) {
                            throw new XmlPullParserException("no path defined");
                        }
                        porterDuffColorFilterE = e(bir.f, bir.g);
                        i2 = b;
                        i3 = i2 + 83;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.g = porterDuffColorFilterE;
                            throw null;
                        }
                        this.g = porterDuffColorFilterE;
                        i4 = ((i2 | 11) << 1) - (i2 ^ 11);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    i5 = 3;
                    if (eventType == 3) {
                        if ((i61 ^ 1) != i62) {
                            throw new XmlPullParserException("no path defined");
                        }
                        porterDuffColorFilterE = e(bir.f, bir.g);
                        i2 = b;
                        i3 = i2 + 83;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.g = porterDuffColorFilterE;
                            throw null;
                        }
                        this.g = porterDuffColorFilterE;
                        i4 = ((i2 | 11) << 1) - (i2 ^ 11);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            return;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            } else {
                i5 = 3;
            }
            if (eventType == i13) {
                String name = xmlPullParser.getName();
                Object objPeek = arrayDeque.peek();
                int i67 = a + 99;
                b = i67 % 128;
                int i68 = i67 % i13;
                bIp bip = (bIp) objPeek;
                if ("path".equals(name)) {
                    bIo bio2 = new bIo();
                    TypedArray typedArrayE2 = Q.e(resources, theme, attributeSet, c.f);
                    int i69 = b;
                    int i70 = (i69 & 82) + (i69 | 82);
                    int i71 = (i70 ^ (-1)) + (i70 << 1);
                    a = i71 % 128;
                    if (i71 % 2 != 0) {
                        bio2.i = null;
                        Q.d(xmlPullParser, "pathData");
                        throw null;
                    }
                    bio2.i = null;
                    if (!(!Q.d(xmlPullParser, "pathData"))) {
                        String string3 = typedArrayE2.getString(0);
                        if (string3 != null) {
                            int i72 = a;
                            int i73 = i72 & 65;
                            int i74 = (~i73) & (i72 | 65);
                            int i75 = i73 << 1;
                            int i76 = (i74 & i75) + (i74 | i75);
                            b = i76 % 128;
                            i9 = 2;
                            if (i76 % 2 == 0) {
                                bio2.d = string3;
                                throw null;
                            }
                            bio2.d = string3;
                        } else {
                            i9 = 2;
                        }
                        String string4 = typedArrayE2.getString(i9);
                        if (string4 != null) {
                            bio2.c = ivas.gov.bisp.enumeration.p007ag.r.d(string4);
                        }
                        bio2.k = Q.b(typedArrayE2, xmlPullParser, theme, "fillColor", 1, 0);
                        float f7 = bio2.l;
                        if (Q.d(xmlPullParser, "fillAlpha")) {
                            typedArray2 = typedArrayE2;
                            f7 = typedArray2.getFloat(12, f7);
                        } else {
                            typedArray2 = typedArrayE2;
                        }
                        bio2.l = f7;
                        if (Q.d(xmlPullParser, "strokeLineCap")) {
                            i10 = -1;
                            i11 = typedArray2.getInt(8, -1);
                        } else {
                            i11 = -1;
                            i10 = -1;
                        }
                        Paint.Cap cap = bio2.f85o;
                        if (i11 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i11 != 1) {
                            int i77 = (-2) - ((a + 10) ^ i10);
                            b = i77 % 128;
                            if (i77 % 2 != 0 ? i11 == 2 : i11 == 5) {
                                cap = Paint.Cap.SQUARE;
                                int i78 = a;
                                int i79 = i78 & 61;
                                int i80 = (i79 - (~((i78 ^ 61) | i79))) - 1;
                                b = i80 % 128;
                                int i81 = i80 % 2;
                            }
                        } else {
                            cap = Paint.Cap.ROUND;
                            int i82 = b;
                            int i83 = (i82 & (-2)) | ((~i82) & 1);
                            int i84 = -(-((i82 & 1) << 1));
                            int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                            a = i85 % 128;
                            int i86 = i85 % 2;
                        }
                        bio2.f85o = cap;
                        int i87 = a;
                        int i88 = i87 & 57;
                        int i89 = (i87 ^ 57) | i88;
                        int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                        int i92 = !Q.d(xmlPullParser, "strokeLineJoin") ? i10 : typedArray2.getInt(9, i10);
                        Paint.Join join = bio2.q;
                        if (i92 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i92 != 1) {
                            int i93 = a;
                            int i94 = i93 & 99;
                            int i95 = ((i93 ^ 99) | i94) << 1;
                            int i96 = -((~i94) & (i93 | 99));
                            int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                            b = i97 % 128;
                            int i98 = i97 % 2;
                            if (i92 == 2) {
                                join = Paint.Join.BEVEL;
                            }
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        bio2.q = join;
                        float f8 = bio2.r;
                        int i99 = a;
                        int i100 = (((i99 & (-58)) | ((~i99) & 57)) - (~((i99 & 57) << 1))) - 1;
                        b = i100 % 128;
                        if (i100 % 2 == 0) {
                            Q.d(xmlPullParser, "strokeMiterLimit");
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        if (Q.d(xmlPullParser, "strokeMiterLimit")) {
                            f8 = typedArray2.getFloat(10, f8);
                        }
                        bio2.r = f8;
                        int i101 = a;
                        int i102 = i101 & 91;
                        int i103 = (i101 ^ 91) | i102;
                        int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                        b = i104 % 128;
                        int i105 = i104 % 2;
                        b2 = -1;
                        typedArray = typedArray2;
                        bio = bio2;
                        bio.h = Q.b(typedArray2, xmlPullParser, theme, "strokeColor", 3, 0);
                        float f9 = bio.g;
                        int i106 = b;
                        int i107 = ((i106 | 93) << 1) - (i106 ^ 93);
                        a = i107 % 128;
                        int i108 = i107 % 2;
                        if (Q.d(xmlPullParser, "strokeAlpha")) {
                            f9 = typedArray.getFloat(11, f9);
                        }
                        bio.g = f9;
                        float f10 = bio.j;
                        if (Q.d(xmlPullParser, "strokeWidth")) {
                            f10 = typedArray.getFloat(4, f10);
                        }
                        bio.j = f10;
                        float f11 = bio.n;
                        int i109 = b + 14;
                        int i110 = (i109 ^ (-1)) + (i109 << 1);
                        a = i110 % 128;
                        if (i110 % 2 != 0) {
                            int i111 = 27 / 0;
                            if (Q.d(xmlPullParser, "trimPathEnd")) {
                                int i112 = a;
                                int i113 = i112 & 99;
                                int i114 = -(-((i112 ^ 99) | i113));
                                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                                b = i115 % 128;
                                int i116 = i115 % 2;
                                f11 = typedArray.getFloat(6, f11);
                            }
                        } else if (Q.d(xmlPullParser, "trimPathEnd")) {
                            int i117 = a;
                            int i118 = i117 & 99;
                            int i119 = -(-((i117 ^ 99) | i118));
                            int i1110 = (i118 ^ i119) + ((i119 & i118) << 1);
                            b = i1110 % 128;
                            int i1111 = i1110 % 2;
                            f11 = typedArray.getFloat(6, f11);
                        }
                        bio.n = f11;
                        float f12 = bio.p;
                        int i120 = b + 79;
                        a = i120 % 128;
                        if (i120 % 2 != 0) {
                            int i121 = 96 / 0;
                            if (Q.d(xmlPullParser, "trimPathOffset")) {
                                f12 = typedArray.getFloat(7, f12);
                                int i122 = b;
                                i12 = (((i122 | 41) << 1) - (~(-((i122 & (-42)) | (41 & (~i122)))))) - 1;
                                a = i12 % 128;
                                if (i12 % 2 != 0) {
                                    int i123 = 2 % 4;
                                }
                            }
                        } else if (Q.d(xmlPullParser, "trimPathOffset")) {
                            f12 = typedArray.getFloat(7, f12);
                            int i124 = b;
                            i12 = (((i124 | 41) << 1) - (~(-((i124 & (-42)) | (41 & (~i124)))))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i125 = 2 % 4;
                            }
                        }
                        bio.p = f12;
                        float f13 = bio.m;
                        if (Q.d(xmlPullParser, "trimPathStart")) {
                            f13 = typedArray.getFloat(5, f13);
                        }
                        bio.m = f13;
                        int i126 = bio.e;
                        if (Q.d(xmlPullParser, "fillType")) {
                            i126 = typedArray.getInt(13, i126);
                            int i127 = a;
                            int i128 = i127 & 37;
                            int i129 = -(-((i127 ^ 37) | i128));
                            int i130 = (i128 & i129) + (i129 | i128);
                            b = i130 % 128;
                            int i131 = i130 % 2;
                        }
                        bio.e = i126;
                    } else {
                        typedArray = typedArrayE2;
                        bio = bio2;
                        b2 = -1;
                        int i132 = b;
                        int i133 = ((i132 ^ 12) + ((i132 & 12) << 1)) - 1;
                        a = i133 % 128;
                        int i134 = i133 % 2;
                    }
                    typedArray.recycle();
                    bip.e.add(bio);
                    int i135 = b;
                    int i136 = (((i135 | 96) << 1) - (i135 ^ 96)) - 1;
                    a = i136 % 128;
                    int i137 = i136 % 2;
                    if (bio.getPathName() != null) {
                        int i138 = b;
                        int i139 = i138 & 53;
                        int i140 = -(-((i138 ^ 53) | i139));
                        int i141 = (i139 & i140) + (i140 | i139);
                        a = i141 % 128;
                        if (i141 % 2 != 0) {
                            biq2 = biq2;
                            oooO0o = biq2.s;
                            pathName = bio.getPathName();
                            int i142 = 22 / 0;
                        } else {
                            biq2 = biq2;
                            oooO0o = biq2.s;
                            pathName = bio.getPathName();
                        }
                        oooO0o.put(pathName, bio);
                    } else {
                        biq2 = biq2;
                    }
                    int i143 = bir3.d;
                    int i144 = bio.f;
                    int i145 = i143 ^ i144;
                    int i146 = i144 & i143;
                    bir3.d = (i146 & i145) | (i145 ^ i146);
                    i61 = 0;
                } else {
                    i60 = i60;
                    b2 = -1;
                    arrayDeque = arrayDeque;
                    if ("clip-path".equals(name)) {
                        bIn bin2 = new bIn();
                        int i147 = b;
                        int i148 = i147 & 103;
                        int i149 = i148 + ((i147 ^ 103) | i148);
                        a = i149 % 128;
                        int i150 = i149 % 2;
                        if (!(!Q.d(xmlPullParser, "pathData"))) {
                            TypedArray typedArrayE3 = Q.e(resources, theme, attributeSet, c.g);
                            String string5 = typedArrayE3.getString(0);
                            if (string5 != null) {
                                bin2.d = string5;
                            }
                            String string6 = typedArrayE3.getString(1);
                            if (string6 != null) {
                                int i151 = b + 21;
                                a = i151 % 128;
                                i8 = 2;
                                int i152 = i151 % 2;
                                bin2.c = ivas.gov.bisp.enumeration.p007ag.r.d(string6);
                            } else {
                                i8 = 2;
                            }
                            bin2.e = !Q.d(xmlPullParser, "fillType") ? 0 : typedArrayE3.getInt(i8, 0);
                            typedArrayE3.recycle();
                        }
                        bip.e.add(bin2);
                        if (bin2.getPathName() != null) {
                            biq2.s.put(bin2.getPathName(), bin2);
                        }
                        int i153 = bir3.d;
                        int i154 = bin2.f;
                        int i155 = a;
                        int i156 = i155 & 111;
                        int i157 = ((i155 ^ 111) | i156) << 1;
                        int i158 = -((i155 | 111) & (~i156));
                        int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                        b = i159 % 128;
                        if (i159 % 2 == 0) {
                            int i160 = ((~i153) & i154) | ((~i154) & i153);
                            int i161 = i154 & i153;
                            bir3.d = (i161 & i160) | (i160 ^ i161);
                        } else {
                            bir3.d = i154 | i153;
                        }
                    } else if ("group".equals(name)) {
                        bIp bip2 = new bIp();
                        TypedArray typedArrayE4 = Q.e(resources, theme, attributeSet, c.e);
                        bip2.n = null;
                        float f14 = bip2.f;
                        if (Q.d(xmlPullParser, "rotation")) {
                            int i162 = b;
                            int i163 = i162 & 91;
                            int i164 = (~i163) & (i162 | 91);
                            int i165 = i163 << 1;
                            int i166 = ((i164 | i165) << 1) - (i164 ^ i165);
                            a = i166 % 128;
                            int i167 = i166 % 2;
                            f14 = typedArrayE4.getFloat(5, f14);
                        }
                        bip2.f = f14;
                        bip2.g = typedArrayE4.getFloat(1, bip2.g);
                        float f15 = bip2.i;
                        int i168 = b;
                        int i169 = (i168 & (-54)) | (53 & (~i168));
                        int i170 = (i168 & 53) << 1;
                        int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                        a = i171 % 128;
                        int i172 = i171 % 2;
                        bip2.i = typedArrayE4.getFloat(2, f15);
                        float f16 = bip2.h;
                        if (Q.d(xmlPullParser, "scaleX")) {
                            int i173 = b + 93;
                            a = i173 % 128;
                            if (i173 % 2 != 0) {
                                f16 = typedArrayE4.getFloat(5, f16);
                            } else {
                                f16 = typedArrayE4.getFloat(3, f16);
                            }
                            bip2.h = f16;
                            f = bip2.j;
                            int i174 = b;
                            int i175 = i174 & 25;
                            int i176 = -(-((i174 ^ 25) | i175));
                            int i177 = (i175 ^ i176) + ((i175 & i176) << 1);
                            a = i177 % 128;
                            int i178 = i177 % 2;
                            if (Q.d(xmlPullParser, "scaleY")) {
                                int i179 = b;
                                int i180 = (i179 | 71) << 1;
                                int i181 = -(i179 ^ 71);
                                int i182 = (i180 ^ i181) + ((i181 & i180) << 1);
                                a = i182 % 128;
                                int i183 = i182 % 2;
                                f = typedArrayE4.getFloat(4, f);
                            }
                            bip2.j = f;
                            f2 = bip2.k;
                            int i184 = b;
                            i6 = (i184 & 91) + (i184 | 91);
                            a = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i185 = 22 / 0;
                                if (Q.d(xmlPullParser, "translateX")) {
                                    f2 = typedArrayE4.getFloat(6, f2);
                                    int i186 = b;
                                    int i187 = i186 ^ 63;
                                    int i188 = (i186 & 63) << 1;
                                    int i189 = (i187 & i188) + (i187 | i188);
                                    a = i189 % 128;
                                    int i190 = i189 % 2;
                                }
                            } else if (Q.d(xmlPullParser, "translateX")) {
                                f2 = typedArrayE4.getFloat(6, f2);
                                int i1810 = b;
                                int i1811 = i1810 ^ 63;
                                int i1812 = (i1810 & 63) << 1;
                                int i1813 = (i1811 & i1812) + (i1811 | i1812);
                                a = i1813 % 128;
                                int i191 = i1813 % 2;
                            }
                            bip2.k = f2;
                            f3 = bip2.c;
                            int i192 = b;
                            int i193 = i192 & 7;
                            int i194 = -(-(i192 | 7));
                            int i195 = (i193 & i194) + (i194 | i193);
                            a = i195 % 128;
                            int i196 = i195 % 2;
                            if (!Q.d(xmlPullParser, "translateY")) {
                                f3 = typedArrayE4.getFloat(7, f3);
                            }
                            bip2.c = f3;
                            string = typedArrayE4.getString(0);
                            if (string != null) {
                                int i197 = a + 67;
                                b = i197 % 128;
                                int i198 = i197 % 2;
                                bip2.f86o = string;
                            }
                            bip2.f();
                            typedArrayE4.recycle();
                            ArrayList<bIl> arrayList = bip.e;
                            int i199 = b;
                            int i200 = ((i199 & 40) + (i199 | 40)) - 1;
                            a = i200 % 128;
                            int i201 = i200 % 2;
                            arrayList.add(bip2);
                            arrayDeque.push(bip2);
                            if (bip2.getGroupName() != null) {
                                i7 = a + 3;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    biq2.s.put(bip2.getGroupName(), bip2);
                                    throw null;
                                }
                                biq2.s.put(bip2.getGroupName(), bip2);
                            }
                            int i202 = bir3.d;
                            int i203 = bip2.m;
                            int i204 = i203 & i202;
                            int i205 = (i203 | i202) & (~i204);
                            bir3.d = (i205 & i204) | (i205 ^ i204);
                        }
                        bip2.h = f16;
                        f = bip2.j;
                        int i1710 = b;
                        int i1711 = i1710 & 25;
                        int i1712 = -(-((i1710 ^ 25) | i1711));
                        int i1713 = (i1711 ^ i1712) + ((i1711 & i1712) << 1);
                        a = i1713 % 128;
                        int i1714 = i1713 % 2;
                        if (Q.d(xmlPullParser, "scaleY")) {
                            int i1715 = b;
                            int i1814 = (i1715 | 71) << 1;
                            int i1815 = -(i1715 ^ 71);
                            int i1816 = (i1814 ^ i1815) + ((i1815 & i1814) << 1);
                            a = i1816 % 128;
                            int i1817 = i1816 % 2;
                            f = typedArrayE4.getFloat(4, f);
                        }
                        bip2.j = f;
                        f2 = bip2.k;
                        int i1818 = b;
                        i6 = (i1818 & 91) + (i1818 | 91);
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i1819 = 22 / 0;
                            if (Q.d(xmlPullParser, "translateX")) {
                                f2 = typedArrayE4.getFloat(6, f2);
                                int i18110 = b;
                                int i18111 = i18110 ^ 63;
                                int i18112 = (i18110 & 63) << 1;
                                int i18113 = (i18111 & i18112) + (i18111 | i18112);
                                a = i18113 % 128;
                                int i1910 = i18113 % 2;
                            }
                        } else if (Q.d(xmlPullParser, "translateX")) {
                            f2 = typedArrayE4.getFloat(6, f2);
                            int i18114 = b;
                            int i18115 = i18114 ^ 63;
                            int i18116 = (i18114 & 63) << 1;
                            int i18117 = (i18115 & i18116) + (i18115 | i18116);
                            a = i18117 % 128;
                            int i1911 = i18117 % 2;
                        }
                        bip2.k = f2;
                        f3 = bip2.c;
                        int i1912 = b;
                        int i1913 = i1912 & 7;
                        int i1914 = -(-(i1912 | 7));
                        int i1915 = (i1913 & i1914) + (i1914 | i1913);
                        a = i1915 % 128;
                        int i1916 = i1915 % 2;
                        if (!Q.d(xmlPullParser, "translateY")) {
                            f3 = typedArrayE4.getFloat(7, f3);
                        }
                        bip2.c = f3;
                        string = typedArrayE4.getString(0);
                        if (string != null) {
                            int i1917 = a + 67;
                            b = i1917 % 128;
                            int i1918 = i1917 % 2;
                            bip2.f86o = string;
                        }
                        bip2.f();
                        typedArrayE4.recycle();
                        ArrayList<bIl> arrayList2 = bip.e;
                        int i1919 = b;
                        int i206 = ((i1919 & 40) + (i1919 | 40)) - 1;
                        a = i206 % 128;
                        int i207 = i206 % 2;
                        arrayList2.add(bip2);
                        arrayDeque.push(bip2);
                        if (bip2.getGroupName() != null) {
                            i7 = a + 3;
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                biq2.s.put(bip2.getGroupName(), bip2);
                                throw null;
                            }
                            biq2.s.put(bip2.getGroupName(), bip2);
                        }
                        int i208 = bir3.d;
                        int i209 = bip2.m;
                        int i2010 = i209 & i208;
                        int i2011 = (i209 | i208) & (~i2010);
                        bir3.d = (i2011 & i2010) | (i2011 ^ i2010);
                    }
                }
            } else {
                i60 = i60;
                b2 = -1;
                arrayDeque = arrayDeque;
                if (eventType == i5 && "group".equals(xmlPullParser.getName())) {
                    int i210 = (-2) - ((b + 36) ^ (-1));
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    arrayDeque.pop();
                    int i212 = a;
                    int i213 = ((i212 | 97) << 1) - (i212 ^ 97);
                    b = i213 % 128;
                    int i214 = i213 % 2;
                }
            }
            eventType = xmlPullParser.next();
            arrayDeque = arrayDeque;
            i60 = i60;
            i13 = 2;
        }
        if ((i61 ^ 1) != i62) {
            throw new XmlPullParserException("no path defined");
        }
        porterDuffColorFilterE = e(bir.f, bir.g);
        i2 = b;
        i3 = i2 + 83;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.g = porterDuffColorFilterE;
            throw null;
        }
        this.g = porterDuffColorFilterE;
        i4 = ((i2 | 11) << 1) - (i2 ^ 11);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
