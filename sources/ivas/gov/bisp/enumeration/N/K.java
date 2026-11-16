package ivas.gov.bisp.enumeration.N;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class K {
    private static int a = 1;
    private static int b;
    public static final Interpolator c = new aYn();
    public int[] d;
    public int e;
    public int f;
    public float[] h;
    public float[] i;
    public float[] j;
    public float[] k;
    public int[] l;
    public int[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VelocityTracker f44o;
    public float p;
    public float q;
    public int r;
    public OverScroller s;
    public View t;
    public final aNN u;
    public boolean v;
    public final ViewGroup x;
    public int g = -1;
    public final Runnable w = new aYo();

    public static abstract class aNN {
        private static int a = 0;
        private static int b = 1;

        public abstract boolean c(View view, int i);

        public abstract int d(View view, int i, int i2);

        public abstract int e(View view, int i, int i2);

        public int f(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 85) << 1) - (~(-(((~i2) & 85) | (i2 & (-86)))))) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = ((i4 & (-126)) | ((~i4) & 125)) + ((i4 & 125) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return 0;
        }

        public int g(View view) {
            int i = 2 % 2;
            int i2 = b + 55;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 117;
            b = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public abstract void h(int i);

        public void i(View view, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & (-46)) | ((~i3) & 45);
            int i5 = (i3 & 45) << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public abstract void j(View view, int i, int i2, int i3, int i4);

        public abstract void k(View view, float f, float f2);
    }

    public class aYn implements Interpolator {
        private static int a = 0;
        private static int b = 1;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 53;
            int i4 = -(-(i2 | 53));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                f2 = f / 1.0f;
                f3 = ((f2 * f2) / f2) % f2;
            } else {
                f2 = f - 1.0f;
                f3 = f2 * f2 * f2 * f2;
            }
            float f4 = (f3 * f2) + 1.0f;
            int i6 = i2 + 89;
            b = i6 % 128;
            int i7 = i6 % 2;
            return f4;
        }
    }

    public class aYo implements Runnable {
        private static int a = 1;
        private static int b;

        public aYo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 61) + (i2 | 61);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                K.this.u(1);
            } else {
                K.this.u(0);
            }
            int i4 = b;
            int i5 = i4 ^ 39;
            int i6 = ((((i4 & 39) | i5) << 1) - (~(-i5))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    static {
        int i = b;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public K(Context context, ViewGroup viewGroup, aNN ann) {
        if (ann == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.x = viewGroup;
        this.u = ann;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = b;
        int i2 = i & 103;
        int i3 = (((i ^ 103) | i2) << 1) - ((i | 103) & (~i2));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            float f = context.getResources().getDisplayMetrics().density;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        int i4 = b;
        int i5 = i4 & 11;
        int i6 = (~i5) & (i4 | 11);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        this.r = (int) ((f2 * 20.0f) + 0.5f);
        int i10 = i4 & 61;
        int i11 = -(-((i4 ^ 61) | i10));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        this.f = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        OverScroller overScroller = new OverScroller(context, c);
        int i14 = a;
        int i15 = i14 & 23;
        int i16 = -(-((i14 ^ 23) | i15));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        this.s = overScroller;
        int i19 = i14 & 5;
        int i20 = -(-((i14 ^ 5) | i19));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 89 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r1 <= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r6 = ivas.gov.bisp.enumeration.N.K.a;
        r1 = r6 | 79;
        r2 = r1 << 1;
        r1 = -(r1 & (~(r6 & 79)));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.N.K.b = r3 % 128;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if ((r3 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r5 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r5 = (((r6 | 36) << 1) - (r6 ^ 36)) - 1;
        ivas.gov.bisp.enumeration.N.K.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.K.b;
        r2 = r5 & 43;
        r6 = (((r5 ^ 43) | r2) << 1) - ((r5 | 43) & (~r2));
        ivas.gov.bisp.enumeration.N.K.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        r6 = ivas.gov.bisp.enumeration.N.K.b + 17;
        ivas.gov.bisp.enumeration.N.K.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if ((r6 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r6 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 < r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 < r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5 = ivas.gov.bisp.enumeration.N.K.a;
        r6 = r5 & 67;
        r6 = r6 + ((r5 ^ 67) | r6);
        ivas.gov.bisp.enumeration.N.K.b = r6 % 128;
        r6 = r6 % 2;
        r6 = r5 & 85;
        r5 = (r5 ^ 85) | r6;
        r7 = (r6 & r5) + (r5 | r6);
        ivas.gov.bisp.enumeration.N.K.b = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.N.K.a
            int r1 = r1 + 117
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.N.K.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            int r1 = java.lang.Math.abs(r5)
            r3 = 97
            int r3 = r3 / r2
            if (r1 >= r6) goto L3b
            goto L1f
        L19:
            int r1 = java.lang.Math.abs(r5)
            if (r1 >= r6) goto L3b
        L1f:
            int r5 = ivas.gov.bisp.enumeration.N.K.a
            r6 = r5 & 67
            r7 = r5 ^ 67
            r7 = r7 | r6
            int r6 = r6 + r7
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.N.K.b = r7
            int r6 = r6 % r0
            r6 = r5 & 85
            r5 = r5 ^ 85
            r5 = r5 | r6
            r7 = r6 & r5
            r5 = r5 | r6
            int r7 = r7 + r5
            int r5 = r7 % 128
            ivas.gov.bisp.enumeration.N.K.b = r5
            int r7 = r7 % r0
            return r2
        L3b:
            if (r1 <= r7) goto L89
            int r6 = ivas.gov.bisp.enumeration.N.K.a
            r1 = r6 | 79
            int r2 = r1 << 1
            r3 = r6 & 79
            int r3 = ~r3
            r1 = r1 & r3
            int r1 = -r1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.N.K.b = r1
            int r3 = r3 % r0
            r1 = 0
            if (r3 != 0) goto L88
            if (r5 > 0) goto L6e
            r5 = r6 | 36
            int r5 = r5 << 1
            r6 = r6 ^ 36
            int r5 = r5 - r6
            int r5 = r5 + (-1)
            int r6 = r5 % 128
            ivas.gov.bisp.enumeration.N.K.b = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L6a
            int r7 = -r7
            goto L6e
        L6a:
            r1.hashCode()
            throw r1
        L6e:
            int r5 = ivas.gov.bisp.enumeration.N.K.b
            r6 = r5 ^ 43
            r2 = r5 & 43
            r6 = r6 | r2
            int r6 = r6 << 1
            int r2 = ~r2
            r5 = r5 | 43
            r5 = r5 & r2
            int r6 = r6 - r5
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.N.K.a = r5
            int r6 = r6 % r0
            if (r6 == 0) goto L84
            return r7
        L84:
            r1.hashCode()
            throw r1
        L88:
            throw r1
        L89:
            int r6 = ivas.gov.bisp.enumeration.N.K.b
            int r6 = r6 + 17
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.N.K.a = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L97
            r6 = 94
            int r6 = r6 / r2
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.K.h(int, int, int):int");
    }

    public final float i(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 85) - (~((i2 & 85) << 1))) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Math.abs(f);
            obj.hashCode();
            throw null;
        }
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            int i4 = a;
            int i5 = i4 & 113;
            int i6 = -(-((i4 ^ 113) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            return i7 % 2 != 0 ? 2.0f : 0.0f;
        }
        if (fAbs <= f3) {
            int i8 = b;
            int i9 = (i8 ^ 53) + ((i8 & 53) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return f;
            }
            throw null;
        }
        int i10 = a;
        int i11 = i10 & 1;
        int i12 = (i10 | 1) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        int i15 = i14 % 128;
        b = i15;
        if (i14 % 2 == 0 ? f <= 0.0f : f <= 0.0f) {
            f3 = -f3;
            int i16 = i15 + 89;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = ((i15 & 46) + (i15 | 46)) - 1;
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return f3;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0091  */
    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0111  */
    /* JADX WARN: Code duplicated, block: B:28:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x024a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0264  */
    /* JADX WARN: Code duplicated, block: B:59:0x0294  */
    /* JADX WARN: Code duplicated, block: B:67:0x02df  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0049  */
    /* JADX WARN: Code duplicated, block: B:9:0x0051  */
    public final void t(float f, float f2, int i) {
        int i2;
        float[] fArr;
        int i3;
        float[] fArr2;
        float[] fArr3;
        int i4;
        float[] fArr4;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i5;
        float[] fArr5;
        int i6;
        int[] iArr4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2 % 2;
        int i14 = a;
        int i15 = i14 & 113;
        int i16 = (((i14 ^ 113) | i15) << 1) - ((i14 | 113) & (~i15));
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        float[] fArr6 = this.h;
        if (fArr6 != null) {
            int i19 = ((i17 & (-48)) | ((~i17) & 47)) + ((i17 & 47) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            if (fArr6.length <= i) {
                i2 = (i & 1) + (i | 1);
                fArr = new float[i2];
                i3 = ((i17 | 107) << 1) - (i17 ^ 107);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    fArr2 = new float[i2];
                    fArr3 = new float[i2];
                    int i21 = 92 / 0;
                } else {
                    fArr2 = new float[i2];
                    fArr3 = new float[i2];
                }
                i4 = (-2) - ((((i17 | 104) << 1) - (i17 ^ 104)) ^ (-1));
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    fArr4 = new float[i2];
                    iArr = new int[i2];
                    int i22 = 34 / 0;
                } else {
                    fArr4 = new float[i2];
                    iArr = new int[i2];
                }
                int i23 = ((i17 ^ 95) | (i17 & 95)) << 1;
                int i24 = -((i17 & (-96)) | ((~i17) & 95));
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                int i26 = i25 % 2;
                iArr2 = new int[i2];
                iArr3 = new int[i2];
                if (fArr6 != null) {
                    i5 = (i17 & 57) + (i17 | 57);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        System.arraycopy(fArr6, 1, fArr, 0, fArr6.length);
                    } else {
                        System.arraycopy(fArr6, 0, fArr, 0, fArr6.length);
                    }
                    fArr5 = this.j;
                    int i27 = b;
                    int i28 = i27 | 61;
                    i6 = ((i28 << 1) - (~(-((~(i27 & 61)) & i28)))) - 1;
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        System.arraycopy(fArr5, 1, fArr2, 0, fArr5.length);
                    } else {
                        System.arraycopy(fArr5, 0, fArr2, 0, fArr5.length);
                    }
                    float[] fArr7 = this.i;
                    int i29 = b + 87;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                    float[] fArr8 = this.k;
                    int i31 = a;
                    int i32 = i31 & 75;
                    int i33 = ((i31 ^ 75) | i32) << 1;
                    int i34 = -((~i32) & (i31 | 75));
                    int i35 = (i33 & i34) + (i34 | i33);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                    iArr4 = this.l;
                    int i37 = a;
                    i7 = (-2) - (((i37 ^ 78) + ((i37 & 78) << 1)) ^ (-1));
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        i8 = 0;
                        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                    } else {
                        i8 = 0;
                        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                    }
                    int[] iArr5 = this.d;
                    System.arraycopy(iArr5, i8, iArr2, i8, iArr5.length);
                    int[] iArr6 = this.m;
                    int i38 = a;
                    int i39 = ((i38 & 124) + (i38 | 124)) - 1;
                    b = i39 % 128;
                    int i40 = i39 % 2;
                    System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
                    int i41 = a;
                    int i42 = ((i41 | 55) << 1) - (((~i41) & 55) | (i41 & (-56)));
                    b = i42 % 128;
                    int i43 = i42 % 2;
                }
                this.h = fArr;
                this.j = fArr2;
                int i44 = a;
                int i45 = (i44 & (-114)) | ((~i44) & 113);
                int i46 = -(-((i44 & 113) << 1));
                int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                b = i47 % 128;
                int i48 = i47 % 2;
                this.i = fArr3;
                this.k = fArr4;
                int i49 = ((i44 ^ 59) | (i44 & 59)) << 1;
                int i50 = -((i44 & (-60)) | ((~i44) & 59));
                int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                b = i51 % 128;
                int i52 = i51 % 2;
                this.l = iArr;
                this.d = iArr2;
                this.m = iArr3;
                int i53 = i44 & 79;
                int i54 = (i53 - (~(-(-((i44 ^ 79) | i53))))) - 1;
                b = i54 % 128;
                int i55 = i54 % 2;
            }
        } else {
            i2 = (i & 1) + (i | 1);
            fArr = new float[i2];
            i3 = ((i17 | 107) << 1) - (i17 ^ 107);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                fArr2 = new float[i2];
                fArr3 = new float[i2];
                int i210 = 92 / 0;
            } else {
                fArr2 = new float[i2];
                fArr3 = new float[i2];
            }
            i4 = (-2) - ((((i17 | 104) << 1) - (i17 ^ 104)) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                fArr4 = new float[i2];
                iArr = new int[i2];
                int i211 = 34 / 0;
            } else {
                fArr4 = new float[i2];
                iArr = new int[i2];
            }
            int i212 = ((i17 ^ 95) | (i17 & 95)) << 1;
            int i213 = -((i17 & (-96)) | ((~i17) & 95));
            int i214 = (i212 & i213) + (i213 | i212);
            a = i214 % 128;
            int i215 = i214 % 2;
            iArr2 = new int[i2];
            iArr3 = new int[i2];
            if (fArr6 != null) {
                i5 = (i17 & 57) + (i17 | 57);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    System.arraycopy(fArr6, 1, fArr, 0, fArr6.length);
                } else {
                    System.arraycopy(fArr6, 0, fArr, 0, fArr6.length);
                }
                fArr5 = this.j;
                int i216 = b;
                int i217 = i216 | 61;
                i6 = ((i217 << 1) - (~(-((~(i216 & 61)) & i217)))) - 1;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    System.arraycopy(fArr5, 1, fArr2, 0, fArr5.length);
                } else {
                    System.arraycopy(fArr5, 0, fArr2, 0, fArr5.length);
                }
                float[] fArr9 = this.i;
                int i218 = b + 87;
                a = i218 % 128;
                int i310 = i218 % 2;
                System.arraycopy(fArr9, 0, fArr3, 0, fArr9.length);
                float[] fArr10 = this.k;
                int i311 = a;
                int i312 = i311 & 75;
                int i313 = ((i311 ^ 75) | i312) << 1;
                int i314 = -((~i312) & (i311 | 75));
                int i315 = (i313 & i314) + (i314 | i313);
                b = i315 % 128;
                int i316 = i315 % 2;
                System.arraycopy(fArr10, 0, fArr4, 0, fArr10.length);
                iArr4 = this.l;
                int i317 = a;
                i7 = (-2) - (((i317 ^ 78) + ((i317 & 78) << 1)) ^ (-1));
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    i8 = 0;
                    System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                } else {
                    i8 = 0;
                    System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                }
                int[] iArr7 = this.d;
                System.arraycopy(iArr7, i8, iArr2, i8, iArr7.length);
                int[] iArr8 = this.m;
                int i318 = a;
                int i319 = ((i318 & 124) + (i318 | 124)) - 1;
                b = i319 % 128;
                int i410 = i319 % 2;
                System.arraycopy(iArr8, 0, iArr3, 0, iArr8.length);
                int i411 = a;
                int i412 = ((i411 | 55) << 1) - (((~i411) & 55) | (i411 & (-56)));
                b = i412 % 128;
                int i413 = i412 % 2;
            }
            this.h = fArr;
            this.j = fArr2;
            int i414 = a;
            int i415 = (i414 & (-114)) | ((~i414) & 113);
            int i416 = -(-((i414 & 113) << 1));
            int i417 = (i415 ^ i416) + ((i415 & i416) << 1);
            b = i417 % 128;
            int i418 = i417 % 2;
            this.i = fArr3;
            this.k = fArr4;
            int i419 = ((i414 ^ 59) | (i414 & 59)) << 1;
            int i56 = -((i414 & (-60)) | ((~i414) & 59));
            int i57 = ((i419 | i56) << 1) - (i419 ^ i56);
            b = i57 % 128;
            int i58 = i57 % 2;
            this.l = iArr;
            this.d = iArr2;
            this.m = iArr3;
            int i59 = i414 & 79;
            int i510 = (i59 - (~(-(-((i414 ^ 79) | i59))))) - 1;
            b = i510 % 128;
            int i511 = i510 % 2;
        }
        float[] fArr11 = this.h;
        float[] fArr12 = this.i;
        int i60 = a + 29;
        int i61 = i60 % 128;
        b = i61;
        Object obj = null;
        if (i60 % 2 != 0) {
            fArr12[i] = f;
            fArr11[i] = f;
            obj.hashCode();
            throw null;
        }
        fArr12[i] = f;
        fArr11[i] = f;
        float[] fArr13 = this.j;
        this.k[i] = f2;
        fArr13[i] = f2;
        int i62 = i61 & 109;
        int i63 = (~i62) & (i61 | 109);
        int i64 = i62 << 1;
        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
        a = i65 % 128;
        int i66 = i65 % 2;
        int[] iArr9 = this.l;
        int i67 = (int) f;
        int i68 = (int) f2;
        int i69 = (i61 ^ 41) + ((i61 & 41) << 1);
        a = i69 % 128;
        if (i69 % 2 == 0) {
            this.x.getLeft();
            throw null;
        }
        int left = this.x.getLeft();
        int i70 = -(-this.r);
        int i71 = ((~i70) & left) | ((~left) & i70);
        int i72 = -(-((left & i70) << 1));
        if (i67 < ((i71 | i72) << 1) - (i72 ^ i71)) {
            int i73 = b;
            int i74 = i73 & 87;
            int i75 = (i73 | 87) & (~i74);
            int i76 = i74 << 1;
            int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
            int i78 = i77 % 128;
            a = i78;
            int i79 = i77 % 2;
            int i80 = i78 & 13;
            int i81 = ((i78 | 13) & (~i80)) + (i80 << 1);
            b = i81 % 128;
            if (i81 % 2 != 0) {
                int i82 = 3 % 5;
            }
            i9 = 1;
        } else {
            i9 = 0;
        }
        int top = this.x.getTop();
        int i83 = this.r;
        int i84 = b;
        int i85 = i84 ^ 51;
        int i86 = (i84 & 51) << 1;
        int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
        int i88 = i87 % 128;
        a = i88;
        if (i87 % 2 == 0) {
            int i89 = -(-i83);
            if (i68 < (top & i89) + (top | i89)) {
                i9 ^= 4;
                i10 = ((((i88 ^ 111) | (i88 & 111)) << 1) - (~(-((i88 & (-112)) | ((~i88) & 111))))) - 1;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    int i90 = 3 / 5;
                }
            }
        } else if (i68 < ((top | i83) << 1) - (top ^ i83)) {
            i9 ^= 4;
            i10 = ((((i88 ^ 111) | (i88 & 111)) << 1) - (~(-((i88 & (-112)) | ((~i88) & 111))))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i91 = 3 / 5;
            }
        }
        int right = this.x.getRight();
        int i92 = b;
        int i93 = i92 & 61;
        int i94 = (((~i93) & (i92 | 61)) - (~(i93 << 1))) - 1;
        a = i94 % 128;
        if (i94 % 2 != 0) {
            int i95 = -(~(-this.r));
            if (i67 > ((right & i95) + (right | i95)) - 1) {
                i9 = (i9 & (-3)) | ((~i9) & 2);
                int i96 = (-2) - ((((i92 | 20) << 1) - (i92 ^ 20)) ^ (-1));
                a = i96 % 128;
                int i97 = i96 % 2;
            }
        } else if (i67 > (right << this.r)) {
            i9 = (i9 & (-3)) | ((~i9) & 2);
            int i98 = (-2) - ((((i92 | 20) << 1) - (i92 ^ 20)) ^ (-1));
            a = i98 % 128;
            int i99 = i98 % 2;
        }
        int bottom = this.x.getBottom();
        int i100 = b;
        int i101 = ((i100 ^ 8) + ((i100 & 8) << 1)) - 1;
        int i102 = i101 % 128;
        a = i102;
        if (i101 % 2 != 0) {
            int i103 = -this.r;
            int i104 = ((bottom ^ i103) | (bottom & i103)) << 1;
            int i105 = -(((~bottom) & i103) | ((~i103) & bottom));
            if (i68 > (i104 ^ i105) + ((i105 & i104) << 1)) {
                int i106 = ((i102 | 46) << 1) - (i102 ^ 46);
                i11 = (i106 ^ (-1)) + (i106 << 1);
                int i107 = i11 % 128;
                b = i107;
                if (i11 % 2 != 0) {
                    i12 = (~(i9 & 95)) & 95;
                } else {
                    i12 = (i9 & (-9)) | ((~i9) & 8);
                }
                i9 = i12;
                int i108 = (i107 ^ 50) + ((i107 & 50) << 1);
                int i109 = (i108 ^ (-1)) + (i108 << 1);
                a = i109 % 128;
                int i110 = i109 % 2;
            }
        } else if (i68 > (bottom >>> this.r)) {
            int i1010 = ((i102 | 46) << 1) - (i102 ^ 46);
            i11 = (i1010 ^ (-1)) + (i1010 << 1);
            int i1011 = i11 % 128;
            b = i1011;
            if (i11 % 2 != 0) {
                i12 = (~(i9 & 95)) & 95;
            } else {
                i12 = (i9 & (-9)) | ((~i9) & 8);
            }
            i9 = i12;
            int i1012 = (i1011 ^ 50) + ((i1011 & 50) << 1);
            int i1013 = (i1012 ^ (-1)) + (i1012 << 1);
            a = i1013 % 128;
            int i111 = i1013 % 2;
        }
        iArr9[i] = i9;
        int i112 = this.n;
        int i113 = 1 << i;
        int i114 = i112 ^ i113;
        int i115 = i112 & i113;
        int i116 = (i115 & i114) | (i114 ^ i115);
        int i117 = a;
        int i118 = (((i117 | 73) << 1) - (~(-(((~i117) & 73) | (i117 & (-74)))))) - 1;
        int i119 = i118 % 128;
        b = i119;
        if (i118 % 2 != 0) {
            this.n = i116;
            int i120 = 96 / 0;
        } else {
            this.n = i116;
        }
        int i121 = ((i119 ^ 84) + ((i119 & 84) << 1)) - 1;
        a = i121 % 128;
        int i122 = i121 % 2;
    }

    public void u(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 69;
        int i5 = ((i3 & 69) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            this.x.removeCallbacks(this.w);
            throw null;
        }
        this.x.removeCallbacks(this.w);
        int i8 = a;
        int i9 = i8 & 9;
        int i10 = i9 + ((i8 ^ 9) | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.e != i) {
            int i11 = ((i8 ^ 67) | (i8 & 67)) << 1;
            int i12 = -(((~i8) & 67) | (i8 & (-68)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            this.e = i;
            this.u.h(i);
            if (this.e == 0) {
                int i15 = a;
                int i16 = ((i15 & 20) + (i15 | 20)) - 1;
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                this.t = null;
                int i19 = ((i17 | 109) << 1) - (i17 ^ 109);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        int i21 = a + 93;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 21 / 0;
        }
    }

    public final void l(float f, float f2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 126) + (i2 | 126)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.v = true;
        this.u.k(this.t, f, f2);
        int i5 = a;
        int i6 = ((i5 & (-16)) | ((~i5) & 15)) + ((i5 & 15) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.v = false;
        if (this.e == 1) {
            int i8 = ((i5 | 27) << 1) - (i5 ^ 27);
            b = i8 % 128;
            int i9 = i8 % 2;
            u(0);
        }
        int i10 = b + 23;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean n(int i, int i2, int i3, int i4) {
        int iH;
        int i5;
        float f;
        int iAbs;
        int iAbs2;
        float f2;
        float f3;
        float f4;
        float f5;
        int iK;
        aNN ann;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = ((i7 & 56) + (i7 | 56)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i10 = b;
        int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = -left;
        int i14 = ((~i13) & i) | ((~i) & i13);
        int i15 = (i & i13) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = -top;
        int i18 = i2 | i17;
        int i19 = (i18 << 1) - ((~(i2 & i17)) & i18);
        if (i16 == 0) {
            int i20 = ((i10 & 126) + (i10 | 126)) - 1;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                throw null;
            }
            if (i19 == 0) {
                this.s.abortAnimation();
                u(0);
                int i21 = a;
                int i22 = ((i21 | 81) << 1) - (((~i21) & 81) | (i21 & (-82)));
                b = i22 % 128;
                int i23 = i22 % 2;
                return false;
            }
        }
        View view = this.t;
        int i24 = (int) this.p;
        float f6 = this.q;
        int i25 = i10 & 99;
        int i26 = i10 | 99;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            iH = h(i3, i24, (int) f6);
            i5 = (int) this.p;
            f = this.q;
            int i28 = 35 / 0;
        } else {
            iH = h(i3, i24, (int) f6);
            i5 = (int) this.p;
            f = this.q;
        }
        int iH2 = h(i4, i5, (int) f);
        int iAbs3 = Math.abs(i16);
        int iAbs4 = Math.abs(i19);
        int i29 = b;
        int i30 = ((i29 | 13) << 1) - (i29 ^ 13);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            iAbs = Math.abs(iH);
            iAbs2 = Math.abs(iH2);
            int i31 = 46 / 0;
        } else {
            iAbs = Math.abs(iH);
            iAbs2 = Math.abs(iH2);
        }
        int i32 = iAbs & iAbs2;
        int i33 = -(-((iAbs ^ iAbs2) | i32));
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = -(-iAbs4);
        int i36 = (iAbs3 & i35) + (i35 | iAbs3);
        if (iH != 0) {
            int i37 = b;
            int i38 = (i37 & 59) + (i37 | 59);
            int i39 = i38 % 128;
            a = i39;
            int i40 = i38 % 2;
            f2 = iAbs;
            f3 = i34;
            int i41 = i39 & 71;
            int i42 = (i41 - (~(-(-((i39 ^ 71) | i41))))) - 1;
            b = i42 % 128;
            int i43 = i42 % 2;
        } else {
            f2 = iAbs3;
            f3 = i36;
            int i44 = b;
            int i45 = ((i44 | 105) << 1) - (i44 ^ 105);
            a = i45 % 128;
            if (i45 % 2 == 0) {
                int i46 = 2 % 5;
            }
        }
        float f7 = f2 / f3;
        if (iH2 != 0) {
            int i47 = b;
            int i48 = ((i47 & 44) + (i47 | 44)) - 1;
            a = i48 % 128;
            if (i48 % 2 == 0) {
                throw null;
            }
            f5 = iAbs2;
            f4 = i34;
        } else {
            int i49 = b + 105;
            a = i49 % 128;
            int i50 = i49 % 2;
            f4 = i36;
            f5 = iAbs4;
        }
        float f8 = f5 / f4;
        aNN ann2 = this.u;
        int i51 = b;
        int i52 = i51 & 55;
        int i53 = (i51 | 55) & (~i52);
        int i54 = i52 << 1;
        int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
        a = i55 % 128;
        if (i55 % 2 == 0) {
            iK = k(i16, iH, ann2.f(view));
            ann = this.u;
            int i56 = 76 / 0;
        } else {
            iK = k(i16, iH, ann2.f(view));
            ann = this.u;
        }
        float f9 = iK;
        float fK = k(i19, iH2, ann.g(view));
        int i57 = a;
        int i58 = i57 & 115;
        int i59 = -(-((i57 ^ 115) | i58));
        int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
        int i61 = i60 % 128;
        b = i61;
        int i62 = i60 % 2 != 0 ? (int) ((fK * f8) % (f9 + f7)) : (int) ((fK * f8) + (f9 * f7));
        OverScroller overScroller = this.s;
        int i63 = i62;
        int i64 = i61 & 113;
        int i65 = (~i64) & (i61 | 113);
        int i66 = -(-(i64 << 1));
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        a = i67 % 128;
        int i68 = i67 % 2;
        overScroller.startScroll(left, top, i16, i19, i63);
        u(2);
        int i69 = a + 25;
        b = i69 % 128;
        int i70 = i69 % 2;
        return true;
    }

    public final boolean p(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 59;
        int i5 = (~i4) & (i3 | 59);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0 ? (this.n & (1 << i)) != 0 : this.n != 0) {
            int i9 = ((i8 ^ 13) | (i8 & 13)) << 1;
            int i10 = -((i8 & (-14)) | ((~i8) & 13));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int i14 = (i12 & 81) + (i12 | 81);
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = (i15 ^ 17) + ((i15 & 17) << 1);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 1 / 0;
            }
            return true;
        }
        int i19 = i3 & 69;
        int i20 = -(-((i3 ^ 69) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        int i23 = a;
        int i24 = (i23 & (-8)) | ((~i23) & 7);
        int i25 = -(-((i23 & 7) << 1));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        Object obj = null;
        if (i26 % 2 != 0) {
            sb.append(i);
            sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            obj.hashCode();
            throw null;
        }
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        int i27 = a;
        int i28 = i27 ^ 71;
        int i29 = (i27 & 71) << 1;
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void r(float f, float f2, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = (i7 ^ 23) + ((i7 & 23) << 1);
        b = i8 % 128;
        boolean zF = i8 % 2 != 0 ? f(f, f2, i, 0) : f(f, f2, i, 1);
        ?? r1 = zF;
        if (f(f2, f, i, 4)) {
            int i9 = a;
            int i10 = (((i9 & (-90)) | ((~i9) & 89)) - (~(-(-((i9 & 89) << 1))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((zF ? 1 : 0) & 4) | ((zF ? 1 : 0) ^ 4);
            int i13 = ((i9 | 91) << 1) - (i9 ^ 91);
            b = i13 % 128;
            int i14 = i13 % 2;
            r1 = i12;
        }
        ?? r2 = r1;
        if (!(!f(f, f2, i, 2))) {
            int i15 = a + 101;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            int i18 = (r1 == true ? 1 : 0) & 2;
            int i19 = ((r1 == true ? 1 : 0) | 2) & (~i18);
            int i20 = (i19 & i18) | (i19 ^ i18);
            int i21 = i16 & 103;
            int i22 = i16 | 103;
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            a = i23 % 128;
            int i24 = i23 % 2;
            r2 = i20;
        }
        ?? r3 = r2;
        if (f(f2, f, i, 8)) {
            int i25 = a;
            int i26 = (((i25 | 54) << 1) - (i25 ^ 54)) - 1;
            b = i26 % 128;
            if (i26 % 2 != 0) {
                i3 = (r2 == true ? 1 : 0) & 37;
                i4 = ~i3;
                i5 = (r2 == true ? 1 : 0) | 37;
            } else {
                i3 = (r2 == true ? 1 : 0) & 8;
                i4 = ~i3;
                i5 = (r2 == true ? 1 : 0) | 8;
            }
            int i27 = i5 & i4;
            r3 = (i3 & i27) | (i27 ^ i3);
            int i28 = (-2) - (((i25 ^ 80) + ((i25 & 80) << 1)) ^ (-1));
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        if (r3 != 0) {
            int i30 = a;
            int i31 = i30 & 49;
            int i32 = (((i30 | 49) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
            b = i32 % 128;
            if (i32 % 2 != 0) {
                iArr = this.d;
                int i33 = iArr[i];
                i2 = (i33 | r3) & (~((i33 & r3) == true ? 1 : 0));
            } else {
                iArr = this.d;
                int i34 = iArr[i];
                int i35 = ((~r3) & i34) | ((~i34) & r3);
                ?? r8 = i34 & r3;
                i2 = ((r8 == true ? 1 : 0) & i35) | (i35 ^ (r8 == true ? 1 : 0));
            }
            iArr[i] = i2;
            Objects.requireNonNull(this.u);
            int i36 = a;
            int i37 = ((i36 & 122) + (i36 | 122)) - 1;
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = (-2) - ((a + 74) ^ (-1));
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    public boolean x(View view, int i) {
        int i2 = 2 % 2;
        int i3 = a + 37;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (view == this.t) {
            int i5 = (i4 & (-68)) | ((~i4) & 67);
            int i6 = (i4 & 67) << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (this.g == i) {
                int i10 = ((i8 & (-18)) | ((~i8) & 17)) + ((i8 & 17) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i8 & 125;
                int i13 = i12 + ((i8 ^ 125) | i12);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        }
        if (view != null) {
            int i14 = a;
            int i15 = i14 & 1;
            int i16 = ((i14 | 1) & (~i15)) + (i15 << 1);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                this.u.c(view, i);
                throw null;
            }
            if (this.u.c(view, i)) {
                this.g = i;
                e(view, i);
                int i17 = b;
                int i18 = i17 & 113;
                int i19 = -(-(i17 | 113));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                return true;
            }
        }
        int i22 = b + 45;
        a = i22 % 128;
        if (i22 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean f(float f, float f2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 19;
        int i6 = ((((i4 & 19) | i5) << 1) - (~(-i5))) - 1;
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            Math.abs(f);
            Math.abs(f2);
            obj.hashCode();
            throw null;
        }
        Math.abs(f);
        Math.abs(f2);
        int[] iArr = this.l;
        int i7 = a;
        int i8 = (i7 & 103) + (i7 | 103);
        b = i8 % 128;
        if (i8 % 2 == 0 ? (iArr[i] & i2) == i2 : (iArr[i] & i2) == i2) {
            int i9 = ((i7 & (-126)) | ((~i7) & 125)) + ((i7 & 125) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = ((i11 | 99) << 1) - (i11 ^ 99);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public View m(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 23;
        int i6 = -(-((i4 ^ 23) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int childCount = this.x.getChildCount();
        int i9 = (childCount ^ (-1)) + (childCount << 1);
        int i10 = b;
        int i11 = i10 & 79;
        int i12 = -(-((i10 ^ 79) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            Object obj = null;
            if (i9 < 0) {
                int i15 = a;
                int i16 = i15 & 57;
                int i17 = (i15 | 57) & (~i16);
                int i18 = -(-(i16 << 1));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                return null;
            }
            int i21 = a;
            int i22 = ((i21 | 55) << 1) - (i21 ^ 55);
            b = i22 % 128;
            int i23 = i22 % 2;
            ViewGroup viewGroup = this.x;
            Objects.requireNonNull(this.u);
            int i24 = b;
            int i25 = ((i24 | 113) << 1) - (i24 ^ 113);
            a = i25 % 128;
            int i26 = i25 % 2;
            View childAt = viewGroup.getChildAt(i9);
            if (i >= childAt.getLeft()) {
                int i27 = b;
                int i28 = ((i27 | 83) << 1) - (i27 ^ 83);
                a = i28 % 128;
                int i29 = i28 % 2;
                if (i < childAt.getRight()) {
                    int i30 = a;
                    int i31 = i30 & 75;
                    int i32 = -(-(i30 | 75));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    if (i2 >= childAt.getTop()) {
                        int i35 = (-2) - ((b + 30) ^ (-1));
                        a = i35 % 128;
                        if (i35 % 2 == 0) {
                            childAt.getBottom();
                            obj.hashCode();
                            throw null;
                        }
                        if (i2 < childAt.getBottom()) {
                            int i36 = b;
                            int i37 = ((i36 & 36) + (i36 | 36)) - 1;
                            a = i37 % 128;
                            if (i37 % 2 != 0) {
                                return childAt;
                            }
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i9 = (-3) - (~(-(~i9)));
            int i38 = a;
            int i39 = (((i38 ^ 105) | (i38 & 105)) << 1) - (((~i38) & 105) | (i38 & (-106)));
            b = i39 % 128;
            int i40 = i39 % 2;
        }
    }

    public final void s(MotionEvent motionEvent) {
        float x;
        float y;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 35) | (i2 & 35)) << 1) - (((~i2) & 35) | (i2 & (-36)));
        a = i3 % 128;
        int i4 = i3 % 2;
        int pointerCount = motionEvent.getPointerCount();
        int i5 = a;
        int i6 = i5 ^ 47;
        int i7 = -(-((i5 & 47) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < pointerCount) {
            int i11 = b;
            int i12 = ((i11 | 84) << 1) - (i11 ^ 84);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                p(motionEvent.getPointerId(i10));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int pointerId = motionEvent.getPointerId(i10);
            if (p(pointerId)) {
                int i14 = b;
                int i15 = ((i14 | 73) << 1) - (i14 ^ 73);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    x = motionEvent.getX(i10);
                    y = motionEvent.getY(i10);
                    int i16 = 99 / 0;
                } else {
                    x = motionEvent.getX(i10);
                    y = motionEvent.getY(i10);
                }
                this.i[pointerId] = x;
                float[] fArr = this.k;
                int i17 = a;
                int i18 = i17 & 7;
                int i19 = ((i17 ^ 7) | i18) << 1;
                int i20 = -((i17 | 7) & (~i18));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = i21 % 128;
                b = i22;
                if (i21 % 2 != 0) {
                    fArr[pointerId] = y;
                    int i23 = 90 / 0;
                } else {
                    fArr[pointerId] = y;
                }
                int i24 = i22 & 29;
                int i25 = -(-((i22 ^ 29) | i24));
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = i10 & (-39);
            int i29 = -(-((i10 ^ (-39)) | i28));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = i30 & 40;
            int i32 = ((i30 ^ 40) | i31) << 1;
            int i33 = -((~i31) & (i30 | 40));
            i10 = ((i32 & i33) << 1) + (i32 ^ i33);
            int i34 = a;
            int i35 = i34 & 31;
            int i36 = (i34 | 31) & (~i35);
            int i37 = i35 << 1;
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = b;
        int i41 = i40 & 101;
        int i42 = (i41 - (~(-(-((i40 ^ 101) | i41))))) - 1;
        a = i42 % 128;
        int i43 = i42 % 2;
    }

    public void e(View view, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = i4 + ((i3 ^ 109) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (view.getParent() != this.x) {
            StringBuilder sbW = j.w("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbW.append(this.x);
            sbW.append(")");
            throw new IllegalArgumentException(sbW.toString());
        }
        int i7 = a;
        int i8 = ((i7 ^ 105) | (i7 & 105)) << 1;
        int i9 = -((i7 & (-106)) | ((~i7) & 105));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            this.t = view;
            this.g = i;
            throw null;
        }
        this.t = view;
        this.g = i;
        aNN ann = this.u;
        int i11 = i7 & 27;
        int i12 = (i7 ^ 27) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            ann.i(view, i);
        } else {
            ann.i(view, i);
        }
        u(1);
    }

    public final int k(int i, int i2, int i3) {
        int iRound;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 109;
        int i7 = (((~i6) & (i5 | 109)) - (~(-(-(i6 << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        if (i == 0) {
            int i9 = (i5 & (-116)) | ((~i5) & 115);
            int i10 = (i5 & 115) << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            a = i12;
            int i13 = i11 % 2;
            int i14 = ((i12 & (-78)) | ((~i12) & 77)) + ((i12 & 77) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return 0;
        }
        int width = this.x.getWidth();
        int i16 = a;
        int i17 = i16 & 1;
        int i18 = (i17 - (~(-(-((i16 ^ 1) | i17))))) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        float fAbs = Math.abs(i);
        int i20 = b + 109;
        a = i20 % 128;
        int i21 = i20 % 2;
        float fMin = Math.min(1.0f, fAbs / width);
        float f = width / 2;
        int i22 = a;
        int i23 = i22 & 63;
        int i24 = ((i22 | 63) & (~i23)) + (i23 << 1);
        b = i24 % 128;
        float fSin = (float) Math.sin((i24 % 2 != 0 ? fMin / 0.5f : fMin - 0.5f) * 0.47123894f);
        int iAbs = Math.abs(i2);
        if (iAbs > 0) {
            int i25 = b;
            int i26 = ((i25 & (-104)) | ((~i25) & 103)) + ((i25 & 103) << 1);
            a = i26 % 128;
            float fAbs2 = Math.abs(i26 % 2 == 0 ? (fSin / f) * f * iAbs : ((fSin * f) + f) / iAbs);
            int i27 = a;
            int i28 = i27 & 93;
            int i29 = i28 + ((i27 ^ 93) | i28);
            b = i29 % 128;
            int i30 = i29 % 2;
            iRound = Math.round(fAbs2 * 1000.0f) * 4;
            int i31 = (-2) - ((b + 94) ^ (-1));
            a = i31 % 128;
            int i32 = i31 % 2;
        } else {
            float fAbs3 = (Math.abs(i) / i3) + 1.0f;
            int i33 = a + 74;
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            b = i34 % 128;
            iRound = (int) (i34 % 2 != 0 ? fAbs3 - 256.0f : fAbs3 * 256.0f);
        }
        int iMin = Math.min(iRound, 600);
        int i35 = b;
        int i36 = (((i35 | 100) << 1) - (i35 ^ 100)) - 1;
        a = i36 % 128;
        if (i36 % 2 == 0) {
            int i37 = 93 / 0;
        }
        return iMin;
    }

    public boolean w(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 81;
        int i6 = (i4 ^ 81) | i5;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (!this.v) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        int i9 = i4 & 23;
        int i10 = ((i4 ^ 23) | i9) << 1;
        int i11 = -((i4 | 23) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            this.f44o.getXVelocity(this.g);
            throw null;
        }
        float xVelocity = this.f44o.getXVelocity(this.g);
        int i13 = b;
        int i14 = (i13 & 69) + (i13 | 69);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        boolean zN = n(i, i2, (int) xVelocity, (int) this.f44o.getYVelocity(this.g));
        int i15 = a;
        int i16 = (i15 | 19) << 1;
        int i17 = -(i15 ^ 19);
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return zN;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        r7 = r6.f;
        r9 = (r9 * r9) + (r8 * r8);
        r8 = (r5 & 57) + (r5 | 57);
        ivas.gov.bisp.enumeration.N.K.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r9 <= (r7 * r7)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        r7 = r5 & 97;
        r8 = -(-((r5 ^ 97) | r7));
        r9 = (r7 ^ r8) + ((r7 & r8) << 1);
        r7 = r9 % 128;
        ivas.gov.bisp.enumeration.N.K.b = r7;
        r9 = r9 % 2;
        r8 = (r7 ^ 17) + ((r7 & 17) << 1);
        ivas.gov.bisp.enumeration.N.K.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if ((r8 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        r7 = 3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r7 = ivas.gov.bisp.enumeration.N.K.b;
        r9 = r7 & 107;
        r8 = ((r7 ^ 107) | r9) << 1;
        r7 = -((r7 | 107) & (~r9));
        r9 = ((r8 | r7) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.N.K.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.K.g(android.view.View, float, float):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    public final void j(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b + 71;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        float[] fArr = this.h;
        if (fArr != null) {
            int i5 = i4 & 53;
            int i6 = ((i4 ^ 53) | i5) << 1;
            int i7 = -((~i5) & (i4 | 53));
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = this.n;
            int i11 = 1 << i;
            int i12 = i4 & 111;
            int i13 = (i4 ^ 111) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = i14 % 128;
            b = i15;
            if (i14 % 2 != 0) {
                int i16 = ((~i10) & i11) | ((~i11) & i10);
                int i17 = i11 & i10;
                if (((i16 & i17) | (i16 ^ i17)) == 0) {
                    int i18 = i15 & 67;
                    int i19 = -(-((i15 ^ 67) | i18));
                    int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    z = false;
                } else {
                    z = true;
                }
            } else if ((i11 & i10) == 0) {
                int i110 = i15 & 67;
                int i111 = -(-((i15 ^ 67) | i110));
                int i22 = ((i110 | i111) << 1) - (i110 ^ i111);
                a = i22 % 128;
                int i23 = i22 % 2;
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i24 = (-2) - (((i15 & 12) + (i15 | 12)) ^ (-1));
                a = i24 % 128;
                int i25 = i24 % 2;
                fArr[i] = 0.0f;
                float[] fArr2 = this.j;
                int i26 = i15 & 29;
                int i27 = (i15 | 29) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                int i30 = i29 % 128;
                a = i30;
                if (i29 % 2 == 0) {
                    fArr2[i] = 0.0f;
                    this.i[i] = 2.0f;
                } else {
                    fArr2[i] = 0.0f;
                    this.i[i] = 0.0f;
                }
                float[] fArr3 = this.k;
                int i31 = i30 & 81;
                int i32 = (i31 - (~(-(-((i30 ^ 81) | i31))))) - 1;
                b = i32 % 128;
                int i33 = i32 % 2;
                fArr3[i] = 0.0f;
                this.l[i] = 0;
                int i34 = i30 & 121;
                int i35 = i34 + ((i30 ^ 121) | i34);
                b = i35 % 128;
                int i36 = i35 % 2;
                this.d[i] = 0;
                int[] iArr = this.m;
                int i37 = i30 | 51;
                int i38 = ((i37 << 1) - (~(-((~(i30 & 51)) & i37)))) - 1;
                int i39 = i38 % 128;
                b = i39;
                int i40 = i38 % 2;
                iArr[i] = 0;
                this.n = (~i11) & i10;
                int i41 = i39 & 9;
                int i42 = ((i39 ^ 9) | i41) << 1;
                int i43 = -((~i41) & (i39 | 9));
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                a = i44 % 128;
                int i45 = i44 % 2;
            }
        }
        int i46 = a;
        int i47 = i46 & 73;
        int i48 = i47 + ((i46 ^ 73) | i47);
        b = i48 % 128;
        if (i48 % 2 != 0) {
            int i49 = 60 / 0;
        }
    }

    public final void q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 48) << 1) - (i2 ^ 48)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f44o.computeCurrentVelocity(25930, this.q);
        } else {
            this.f44o.computeCurrentVelocity(1000, this.q);
        }
        float xVelocity = this.f44o.getXVelocity(this.g);
        float f = this.p;
        int i4 = b + 13;
        a = i4 % 128;
        int i5 = i4 % 2;
        float fI = i(xVelocity, f, this.q);
        VelocityTracker velocityTracker = this.f44o;
        int i6 = b;
        int i7 = i6 & 79;
        int i8 = (i7 - (~(-(-((i6 ^ 79) | i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        float yVelocity = velocityTracker.getYVelocity(this.g);
        float f2 = this.p;
        int i10 = a;
        int i11 = i10 & 61;
        int i12 = -(-((i10 ^ 61) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            i(yVelocity, f2, this.q);
            throw null;
        }
        float fI2 = i(yVelocity, f2, this.q);
        int i14 = b;
        int i15 = (i14 ^ 39) + ((i14 & 39) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        l(fI, fI2);
        int i17 = b;
        int i18 = ((i17 & (-96)) | ((~i17) & 95)) + ((i17 & 95) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 55) | (i2 & 55)) << 1) - ((i2 & (-56)) | ((~i2) & 55));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.g = -1;
            throw null;
        }
        this.g = -1;
        float[] fArr = this.h;
        if (fArr != null) {
            int i4 = ((i2 ^ 52) + ((i2 & 52) << 1)) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                Arrays.fill(fArr, 1.0f);
                Arrays.fill(this.j, 2.0f);
            } else {
                Arrays.fill(fArr, 0.0f);
                Arrays.fill(this.j, 0.0f);
            }
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.k, 0.0f);
            int[] iArr = this.l;
            int i5 = b;
            int i6 = ((i5 ^ 96) + ((i5 & 96) << 1)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.d, 0);
            int[] iArr2 = this.m;
            int i8 = b;
            int i9 = (i8 & 14) + (i8 | 14);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                Arrays.fill(iArr2, 0);
            } else {
                Arrays.fill(iArr2, 0);
            }
            this.n = 0;
        }
        VelocityTracker velocityTracker = this.f44o;
        if (velocityTracker != null) {
            int i11 = b;
            int i12 = (i11 & 107) + (i11 | 107);
            a = i12 % 128;
            int i13 = i12 % 2;
            velocityTracker.recycle();
            this.f44o = null;
            int i14 = a;
            int i15 = i14 & 53;
            int i16 = (i14 | 53) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = i20 & 111;
        int i22 = (i20 | 111) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0406  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e5 A[EDGE_INSN: B:148:0x03e5->B:118:0x03e5 BREAK  A[LOOP:0: B:65:0x01c9->B:115:0x03a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x03e5 A[EDGE_INSN: B:149:0x03e5->B:118:0x03e5 BREAK  A[LOOP:0: B:65:0x01c9->B:115:0x03a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e A[DONT_INVERT, PHI: r6
  0x012e: PHI (r6v25 int) = (r6v24 int), (r6v35 int) binds: [B:41:0x0126, B:38:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0263  */
    /* JADX WARN: Code duplicated, block: B:80:0x026e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0339 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x033b  */
    /* JADX WARN: Code duplicated, block: B:99:0x034b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
    
        if (r1 == r20.t) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (r1 == r20.t) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r3 = ivas.gov.bisp.enumeration.N.K.a;
        r6 = r3 & 51;
        r3 = (r3 | 51) & (~r6);
        r6 = r6 << 1;
        r9 = (r3 ^ r6) + ((r3 & r6) << 1);
        ivas.gov.bisp.enumeration.N.K.b = r9 % 128;
        r9 = r9 % 2;
        x(r1, r4);
        r1 = ivas.gov.bisp.enumeration.N.K.a;
        r3 = (r1 ^ 65) + ((r1 & 65) << 1);
        ivas.gov.bisp.enumeration.N.K.b = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean v(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.N.K.v(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0107  */
    public boolean c(boolean z) {
        View view;
        boolean z2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (i2 | 105) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 != 0 ? this.e == 2 : this.e == 4) {
            boolean zComputeScrollOffset = this.s.computeScrollOffset();
            OverScroller overScroller = this.s;
            int i7 = a + 53;
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                overScroller.getCurrX();
                this.s.getCurrY();
                throw null;
            }
            int currX = overScroller.getCurrX();
            int currY = this.s.getCurrY();
            int i8 = -this.t.getLeft();
            int i9 = (currX & i8) + (i8 | currX);
            int i10 = a + 53;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = -this.t.getTop();
            int i13 = ((currY | i12) << 1) - (i12 ^ currY);
            int i14 = a;
            int i15 = ((i14 & 44) + (i14 | 44)) - 1;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            if (i9 != 0) {
                int i18 = i16 + 117;
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    view = this.t;
                    WeakHashMap<View, R> weakHashMap = T.c;
                    int i19 = 28 / 0;
                } else {
                    view = this.t;
                    WeakHashMap<View, R> weakHashMap2 = T.c;
                }
                int i20 = b;
                int i21 = (i20 | 63) << 1;
                int i22 = -(((~i20) & 63) | (i20 & (-64)));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                view.offsetLeftAndRight(i9);
                int i25 = a;
                int i26 = (((i25 ^ 19) | (i25 & 19)) << 1) - (((~i25) & 19) | (i25 & (-20)));
                b = i26 % 128;
                int i27 = i26 % 2;
            }
            if (i13 != 0) {
                int i28 = a;
                int i29 = i28 & 57;
                int i30 = (i28 | 57) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    WeakHashMap<View, R> weakHashMap3 = T.c;
                    obj.hashCode();
                    throw null;
                }
                View view2 = this.t;
                WeakHashMap<View, R> weakHashMap4 = T.c;
                view2.offsetTopAndBottom(i13);
                int i33 = a;
                int i34 = (i33 & (-84)) | ((~i33) & 83);
                int i35 = (i33 & 83) << 1;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                b = i36 % 128;
                int i37 = i36 % 2;
            }
            if (i9 == 0) {
                int i38 = a;
                int i39 = i38 & 3;
                int i40 = (i38 ^ 3) | i39;
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                b = i41 % 128;
                int i42 = i41 % 2;
                if (i13 != 0) {
                    aNN ann = this.u;
                    View view3 = this.t;
                    int i43 = b;
                    int i44 = i43 & 81;
                    int i45 = -(-((i43 ^ 81) | i44));
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                    ann.j(view3, currX, currY, i9, i13);
                    int i48 = a;
                    int i49 = (i48 ^ 81) + ((i48 & 81) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                }
            } else {
                aNN ann2 = this.u;
                View view4 = this.t;
                int i410 = b;
                int i411 = i410 & 81;
                int i412 = -(-((i410 ^ 81) | i411));
                int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                a = i413 % 128;
                int i414 = i413 % 2;
                ann2.j(view4, currX, currY, i9, i13);
                int i415 = a;
                int i416 = (i415 ^ 81) + ((i415 & 81) << 1);
                b = i416 % 128;
                int i51 = i416 % 2;
            }
            if (zComputeScrollOffset) {
                int i52 = b + 74;
                int i53 = (i52 ^ (-1)) + (i52 << 1);
                a = i53 % 128;
                if (i53 % 2 == 0) {
                    this.s.getFinalX();
                    obj.hashCode();
                    throw null;
                }
                if (currX == this.s.getFinalX() && currY == this.s.getFinalY()) {
                    int i54 = b;
                    int i55 = i54 & 65;
                    int i56 = (i54 ^ 65) | i55;
                    int i57 = (i55 & i56) + (i56 | i55);
                    a = i57 % 128;
                    int i58 = i57 % 2;
                    this.s.abortAnimation();
                    zComputeScrollOffset = false;
                }
            }
            if (!zComputeScrollOffset) {
                int i59 = a;
                int i60 = (i59 ^ 67) + ((i59 & 67) << 1);
                int i61 = i60 % 128;
                b = i61;
                int i62 = i60 % 2;
                if (z) {
                    int i63 = (i61 | 99) << 1;
                    int i64 = -(((~i61) & 99) | (i61 & (-100)));
                    int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                    a = i65 % 128;
                    int i66 = i65 % 2;
                    this.x.post(this.w);
                    int i67 = a;
                    int i68 = (i67 & 125) + (i67 | 125);
                    b = i68 % 128;
                    if (i68 % 2 != 0) {
                        int i69 = 2 / 3;
                    }
                } else {
                    u(0);
                    int i70 = a;
                    int i71 = ((i70 | 22) << 1) - (i70 ^ 22);
                    int i72 = (i71 ^ (-1)) + (i71 << 1);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                }
            }
        }
        if (this.e == 2) {
            int i74 = a;
            int i75 = i74 & 81;
            int i76 = (i74 | 81) & (~i75);
            int i77 = -(-(i75 << 1));
            int i78 = (i76 & i77) + (i76 | i77);
            b = i78 % 128;
            int i79 = i78 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i80 = b;
        int i81 = (i80 ^ 123) + ((i80 & 123) << 1);
        a = i81 % 128;
        if (i81 % 2 == 0) {
            int i82 = 52 / 0;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:145:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:147:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:150:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:181:0x050a A[EDGE_INSN: B:181:0x050a->B:156:0x050a BREAK  A[LOOP:1: B:129:0x042e->B:155:0x04f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x04f0 A[SYNTHETIC] */
    public void o(MotionEvent motionEvent) {
        View viewM;
        int i;
        boolean zG;
        int iE;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 73) | (i3 & 73)) << 1) - (((~i3) & 73) | (i3 & (-74)));
        b = i4 % 128;
        int i5 = i4 % 2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        Object obj = null;
        if (actionMasked == 0) {
            int i6 = a;
            int i7 = i6 & 93;
            int i8 = (i6 ^ 93) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                d();
                throw null;
            }
            d();
        }
        if (this.f44o == null) {
            this.f44o = VelocityTracker.obtain();
            int i10 = b;
            int i11 = ((i10 ^ 115) - (~((i10 & 115) << 1))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        this.f44o.addMovement(motionEvent);
        if (actionMasked != 0) {
            int i13 = a;
            int i14 = ((i13 | 67) << 1) - (i13 ^ 67);
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            if (actionMasked == 1) {
                if (this.e == 1) {
                    q();
                }
                d();
                int i17 = (-2) - ((b + 74) ^ (-1));
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 59 / 0;
                    return;
                }
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.e == 1) {
                        int i19 = i13 & 77;
                        int i20 = -(-((i13 ^ 77) | i19));
                        int i21 = (i19 & i20) + (i19 | i20);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        l(0.0f, 0.0f);
                    }
                    d();
                    return;
                }
                int i23 = i15 - (-1);
                int i24 = i23 % 128;
                a = i24;
                int i25 = i23 % 2;
                if (actionMasked != 5) {
                    int i26 = (i24 ^ 115) + ((i24 & 115) << 1);
                    b = i26 % 128;
                    if (i26 % 2 == 0 ? actionMasked == 6 : actionMasked == 18) {
                        int pointerId = motionEvent.getPointerId(actionIndex);
                        if (this.e == 1 && pointerId == this.g) {
                            int pointerCount = motionEvent.getPointerCount();
                            int i27 = b;
                            int i28 = i27 & 59;
                            int i29 = ((i27 | 59) & (~i28)) + (i28 << 1);
                            a = i29 % 128;
                            int i30 = i29 % 2;
                            int i31 = 0;
                            while (i31 < pointerCount) {
                                int pointerId2 = motionEvent.getPointerId(i31);
                                if (pointerId2 != this.g) {
                                    int i32 = b;
                                    int i33 = (i32 ^ 99) + ((i32 & 99) << 1);
                                    a = i33 % 128;
                                    int i34 = i33 % 2;
                                    float x = motionEvent.getX(i31);
                                    float y = motionEvent.getY(i31);
                                    int i35 = b;
                                    int i36 = i35 ^ 1;
                                    int i37 = (i35 & 1) << 1;
                                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                                    a = i38 % 128;
                                    int i39 = i38 % 2;
                                    View viewM2 = m((int) x, (int) y);
                                    View view = this.t;
                                    if (viewM2 == view) {
                                        int i40 = a + 43;
                                        b = i40 % 128;
                                        if (i40 % 2 != 0) {
                                            x(view, pointerId2);
                                            throw null;
                                        }
                                        if (x(view, pointerId2)) {
                                            if (this.g == -1) {
                                                break;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                int i41 = i31 & 68;
                                int i42 = -(-((i31 ^ 68) | i41));
                                int i43 = (i41 & i42) + (i42 | i41);
                                int i44 = i43 & (-67);
                                int i45 = (i43 ^ (-67)) | i44;
                                i31 = ((i44 | i45) << 1) - (i44 ^ i45);
                            }
                            int i46 = b + 52;
                            int i47 = (i46 ^ (-1)) + (i46 << 1);
                            a = i47 % 128;
                            if (i47 % 2 == 0) {
                                q();
                                int i48 = 8 / 0;
                            } else {
                                q();
                            }
                            int i49 = a;
                            int i50 = ((i49 ^ 29) | (i49 & 29)) << 1;
                            int i51 = -(((~i49) & 29) | (i49 & (-30)));
                            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        }
                        j(pointerId);
                        return;
                    }
                } else {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    int i54 = a;
                    int i55 = i54 & 107;
                    int i56 = (((i54 | 107) & (~i55)) - (~(i55 << 1))) - 1;
                    b = i56 % 128;
                    if (i56 % 2 != 0) {
                        t(x2, motionEvent.getY(actionIndex), pointerId3);
                        throw null;
                    }
                    float y2 = motionEvent.getY(actionIndex);
                    t(x2, y2, pointerId3);
                    if (this.e == 0) {
                        int i57 = a;
                        int i58 = ((i57 ^ 74) + ((i57 & 74) << 1)) - 1;
                        b = i58 % 128;
                        int i59 = i58 % 2;
                        View viewM3 = m((int) x2, (int) y2);
                        int i60 = b;
                        int i61 = ((i60 ^ 113) | (i60 & 113)) << 1;
                        int i62 = -(((~i60) & 113) | (i60 & (-114)));
                        int i63 = (i61 & i62) + (i62 | i61);
                        a = i63 % 128;
                        if (i63 % 2 == 0) {
                            x(viewM3, pointerId3);
                            int i64 = this.l[pointerId3];
                            int i65 = 91 / 0;
                        } else {
                            x(viewM3, pointerId3);
                            int i66 = this.l[pointerId3];
                        }
                    } else {
                        int i67 = (int) x2;
                        int i68 = (int) y2;
                        View view2 = this.t;
                        int i69 = b;
                        int i70 = (((i69 | 110) << 1) - (i69 ^ 110)) - 1;
                        a = i70 % 128;
                        if (i70 % 2 == 0) {
                            throw null;
                        }
                        if (view2 == null) {
                            int i71 = i69 + 97;
                            a = i71 % 128;
                            int i72 = i71 % 2;
                        } else if (i67 >= view2.getLeft()) {
                            int i73 = b;
                            int i74 = i73 & 115;
                            int i75 = ((i73 ^ 115) | i74) << 1;
                            int i76 = -((i73 | 115) & (~i74));
                            int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                            a = i77 % 128;
                            int i78 = i77 % 2;
                            if (i67 < view2.getRight()) {
                                int i79 = a + 88;
                                int i80 = (i79 ^ (-1)) + (i79 << 1);
                                b = i80 % 128;
                                if (i80 % 2 == 0 ? i68 >= view2.getTop() : i68 >= view2.getTop()) {
                                    if (i68 < view2.getBottom()) {
                                        int i81 = a;
                                        int i82 = i81 & 73;
                                        int i83 = -(-(i81 | 73));
                                        int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                                        b = i84 % 128;
                                        int i85 = i84 % 2;
                                        int i86 = ((i81 | 41) << 1) - (i81 ^ 41);
                                        b = i86 % 128;
                                        int i87 = i86 % 2;
                                        int i88 = ((i81 & (-44)) | ((~i81) & 43)) + ((i81 & 43) << 1);
                                        b = i88 % 128;
                                        if (i88 % 2 == 0) {
                                            x(this.t, pointerId3);
                                            return;
                                        } else {
                                            x(this.t, pointerId3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (this.e != 1) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    int i89 = a;
                    int i90 = i89 & 79;
                    int i91 = (i89 ^ 79) | i90;
                    int i92 = (i90 & i91) + (i91 | i90);
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    int i94 = 0;
                    while (i94 < pointerCount2) {
                        int i95 = a;
                        int i96 = i95 & 59;
                        int i97 = (i96 - (~(-(-((i95 ^ 59) | i96))))) - 1;
                        b = i97 % 128;
                        int i98 = i97 % 2;
                        int pointerId4 = motionEvent.getPointerId(i94);
                        if (!(!p(pointerId4))) {
                            int i99 = a;
                            int i100 = i99 ^ 71;
                            int i101 = ((i99 & 71) | i100) << 1;
                            int i102 = -i100;
                            int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                            b = i103 % 128;
                            int i104 = i103 % 2;
                            float x3 = motionEvent.getX(i94);
                            float y3 = motionEvent.getY(i94);
                            int i105 = a;
                            int i106 = ((i105 ^ 92) + ((i105 & 92) << 1)) - 1;
                            int i107 = i106 % 128;
                            b = i107;
                            int i108 = i106 % 2;
                            float f = x3 - this.h[pointerId4];
                            int i109 = i107 & 51;
                            int i110 = ((i107 | 51) & (~i109)) + (i109 << 1);
                            a = i110 % 128;
                            float f2 = y3 - (i110 % 2 == 0 ? this.j[pointerId4] : this.j[pointerId4]);
                            r(f, f2, pointerId4);
                            int i111 = a;
                            int i112 = ((((i111 ^ 69) | (i111 & 69)) << 1) - (~(-((i111 & (-70)) | (69 & (~i111)))))) - 1;
                            b = i112 % 128;
                            if (i112 % 2 == 0) {
                                if (this.e == 1) {
                                    break;
                                }
                                viewM = m((int) x3, (int) y3);
                                int i113 = b;
                                i = (((i113 & (-102)) | ((~i113) & 101)) - (~((i113 & 101) << 1))) - 1;
                                a = i % 128;
                                if (i % 2 == 0) {
                                    zG = g(viewM, f, f2);
                                    int i114 = 62 / 0;
                                    if (zG) {
                                        continue;
                                    } else if (x(viewM, pointerId4)) {
                                        break;
                                        break;
                                    }
                                } else if (g(viewM, f, f2)) {
                                    continue;
                                } else if (x(viewM, pointerId4)) {
                                    break;
                                    break;
                                }
                            } else {
                                if (this.e == 0) {
                                    break;
                                }
                                viewM = m((int) x3, (int) y3);
                                int i115 = b;
                                i = (((i115 & (-102)) | ((~i115) & 101)) - (~((i115 & 101) << 1))) - 1;
                                a = i % 128;
                                if (i % 2 == 0) {
                                    zG = g(viewM, f, f2);
                                    int i116 = 62 / 0;
                                    if (zG) {
                                        continue;
                                    } else if (x(viewM, pointerId4)) {
                                        break;
                                    }
                                } else if (g(viewM, f, f2)) {
                                    continue;
                                } else if (x(viewM, pointerId4)) {
                                    break;
                                    break;
                                }
                            }
                        }
                        int i117 = (i94 ^ 120) + ((i94 & 120) << 1);
                        i94 = ((i117 | (-119)) << 1) - (i117 ^ (-119));
                        int i118 = a;
                        int i119 = (i118 & 29) + (i118 | 29);
                        b = i119 % 128;
                        int i120 = i119 % 2;
                    }
                    s(motionEvent);
                    int i121 = a;
                    int i122 = (i121 & (-124)) | ((~i121) & 123);
                    int i123 = (i121 & 123) << 1;
                    int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                    b = i124 % 128;
                    int i125 = i124 % 2;
                    return;
                }
                int i126 = i15 & 57;
                int i127 = i126 + ((i15 ^ 57) | i126);
                a = i127 % 128;
                int i128 = i127 % 2;
                if (p(this.g)) {
                    int i129 = a;
                    int i130 = (((i129 | 18) << 1) - (i129 ^ 18)) - 1;
                    b = i130 % 128;
                    if (i130 % 2 != 0) {
                        motionEvent.findPointerIndex(this.g);
                        throw null;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
                    int i131 = b + 57;
                    a = i131 % 128;
                    int i132 = i131 % 2;
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.i;
                    int i133 = b;
                    int i134 = (-2) - ((i133 + 122) ^ (-1));
                    a = i134 % 128;
                    int i135 = i134 % 2;
                    int i136 = this.g;
                    int i137 = i133 & 119;
                    int i138 = ((i133 ^ 119) | i137) << 1;
                    int i139 = -((i133 | 119) & (~i137));
                    int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                    a = i140 % 128;
                    int i141 = i140 % 2;
                    int i142 = (int) (x4 - fArr[i136]);
                    int i143 = (int) (y4 - this.k[i136]);
                    int left = (this.t.getLeft() - (~i142)) - 1;
                    int i144 = b;
                    int i145 = i144 & 17;
                    int i146 = (i144 | 17) & (~i145);
                    int i147 = -(-(i145 << 1));
                    int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                    a = i148 % 128;
                    if (i148 % 2 == 0) {
                        iE = this.t.getTop() % i143;
                    } else {
                        int top = this.t.getTop();
                        int i149 = -(-i143);
                        iE = ((top & i149) << 1) + (top ^ i149);
                    }
                    int left2 = this.t.getLeft();
                    int top2 = this.t.getTop();
                    int i150 = a;
                    int i151 = (i150 ^ 125) + ((i150 & 125) << 1);
                    b = i151 % 128;
                    if (i151 % 2 != 0) {
                        throw null;
                    }
                    if (i142 != 0) {
                        left = this.u.d(this.t, left, i142);
                        View view3 = this.t;
                        WeakHashMap<View, R> weakHashMap = T.c;
                        int i152 = -left2;
                        int i153 = (left & i152) + (i152 | left);
                        int i154 = b;
                        int i155 = (i154 & (-28)) | (27 & (~i154));
                        int i156 = (i154 & 27) << 1;
                        int i157 = ((i155 | i156) << 1) - (i155 ^ i156);
                        a = i157 % 128;
                        int i158 = i157 % 2;
                        view3.offsetLeftAndRight(i153);
                    }
                    int i159 = left;
                    if (i143 != 0) {
                        int i160 = b;
                        int i161 = i160 & 7;
                        int i162 = -(-(i160 | 7));
                        int i163 = (i161 & i162) + (i162 | i161);
                        a = i163 % 128;
                        if (i163 % 2 == 0) {
                            this.u.e(this.t, iE, i143);
                            obj.hashCode();
                            throw null;
                        }
                        iE = this.u.e(this.t, iE, i143);
                        View view4 = this.t;
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        int i164 = a + 126;
                        int i165 = (i164 ^ (-1)) + (i164 << 1);
                        b = i165 % 128;
                        if (i165 % 2 != 0) {
                            view4.offsetTopAndBottom(iE / top2);
                        } else {
                            int i166 = -top2;
                            view4.offsetTopAndBottom((iE ^ i166) + ((i166 & iE) << 1));
                        }
                    }
                    int i167 = iE;
                    if (i142 == 0) {
                        int i168 = a;
                        int i169 = ((i168 | 101) << 1) - (101 ^ i168);
                        b = i169 % 128;
                        int i170 = i169 % 2;
                        if (i143 != 0) {
                            aNN ann = this.u;
                            View view5 = this.t;
                            int i171 = -left2;
                            int i172 = i159 & i171;
                            int i173 = ((i159 | i171) & (~i172)) + (i172 << 1);
                            int i174 = -(~(-top2));
                            ann.j(view5, i159, i167, i173, ((i167 & i174) + (i167 | i174)) - 1);
                        }
                    } else {
                        aNN ann2 = this.u;
                        View view6 = this.t;
                        int i175 = -left2;
                        int i176 = i159 & i175;
                        int i177 = ((i159 | i175) & (~i176)) + (i176 << 1);
                        int i178 = -(~(-top2));
                        ann2.j(view6, i159, i167, i177, ((i167 & i178) + (i167 | i178)) - 1);
                    }
                    s(motionEvent);
                    int i179 = b;
                    int i180 = i179 & 53;
                    int i181 = ((i179 ^ 53) | i180) << 1;
                    int i182 = -((i179 | 53) & (~i180));
                    int i183 = ((i181 | i182) << 1) - (i182 ^ i181);
                    a = i183 % 128;
                    int i184 = i183 % 2;
                    return;
                }
            }
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int i185 = b;
            int i186 = i185 & 93;
            int i187 = i186 + ((i185 ^ 93) | i186);
            a = i187 % 128;
            int i188 = i187 % 2;
            int pointerId5 = motionEvent.getPointerId(0);
            int i189 = b;
            int i190 = i189 & 63;
            int i191 = -(-((i189 ^ 63) | i190));
            int i192 = (i190 ^ i191) + ((i191 & i190) << 1);
            a = i192 % 128;
            int i193 = i192 % 2;
            View viewM4 = m((int) x5, (int) y5);
            int i194 = a;
            int i195 = ((i194 | 81) << 1) - (((~i194) & 81) | (i194 & (-82)));
            b = i195 % 128;
            if (i195 % 2 != 0) {
                t(x5, y5, pointerId5);
                obj.hashCode();
                throw null;
            }
            t(x5, y5, pointerId5);
            x(viewM4, pointerId5);
            int i196 = this.l[pointerId5];
        }
        int i197 = b;
        int i198 = i197 & 67;
        int i199 = i198 + ((i197 ^ 67) | i198);
        a = i199 % 128;
        int i200 = i199 % 2;
    }
}
