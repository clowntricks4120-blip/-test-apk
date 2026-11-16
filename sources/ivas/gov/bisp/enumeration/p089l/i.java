package ivas.gov.bisp.enumeration.p089l;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements View.OnTouchListener {
    private static int a = 0;
    private static int b = 1;
    public static final int c = ViewConfiguration.getTapTimeout();
    public int d;
    public final aVb e;
    public final Interpolator f;
    public final View g;
    public float[] h;
    public Runnable i;
    public float[] j;
    public int k;
    public float[] l;
    public float[] m;
    public float[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f104o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    static {
        int i = b;
        int i2 = i & 25;
        int i3 = (i2 - (~(-(-((i ^ 25) | i2))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public i(View view) {
        aVb avb = new aVb();
        this.e = avb;
        this.f = new AccelerateInterpolator();
        this.h = new float[]{0.0f, 0.0f};
        this.j = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.l = new float[]{0.0f, 0.0f};
        this.m = new float[]{0.0f, 0.0f};
        this.n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.g = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.n;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.m;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.k = 1;
        float[] fArr3 = this.j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.h;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.l;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.d = c;
        avb.d = 500;
        avb.e = 500;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r5 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r5 >= r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r5 = ((r1 | 105) << 1) - (r1 ^ 105);
        r7 = r5 % 128;
        ivas.gov.bisp.enumeration.p089l.i.a = r7;
        r5 = r5 % 2;
        r5 = (((r7 | 124) << 1) - (r7 ^ 124)) - 1;
        ivas.gov.bisp.enumeration.p089l.i.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r6 = r1 & 61;
        r6 = (r6 - (~(-(-((r1 ^ 61) | r6))))) - 1;
        ivas.gov.bisp.enumeration.p089l.i.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r5 > r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r5 > r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r1 = r1 + 47;
        ivas.gov.bisp.enumeration.p089l.i.a = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float c(float r5, float r6, float r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p089l.i.b
            r2 = r1 & (-60)
            int r3 = ~r1
            r4 = 59
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = r1 & 59
            int r3 = r3 << 1
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p089l.i.a = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r3 = 39
            int r3 = r3 / 0
            if (r2 <= 0) goto L38
            goto L2a
        L26:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L38
        L2a:
            int r1 = r1 + 47
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.p089l.i.a = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L37
            r5 = 78
            int r5 = r5 / 0
        L37:
            return r7
        L38:
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L57
            r5 = r1 | 105(0x69, float:1.47E-43)
            int r5 = r5 << 1
            r7 = r1 ^ 105(0x69, float:1.47E-43)
            int r5 = r5 - r7
            int r7 = r5 % 128
            ivas.gov.bisp.enumeration.p089l.i.a = r7
            int r5 = r5 % r0
            r5 = r7 | 124(0x7c, float:1.74E-43)
            int r5 = r5 << 1
            r7 = r7 ^ 124(0x7c, float:1.74E-43)
            int r5 = r5 - r7
            int r5 = r5 + (-1)
            int r7 = r5 % 128
            ivas.gov.bisp.enumeration.p089l.i.b = r7
            int r5 = r5 % r0
            return r6
        L57:
            r6 = r1 & 61
            r7 = r1 ^ 61
            r7 = r7 | r6
            int r7 = -r7
            int r7 = -r7
            int r7 = ~r7
            int r6 = r6 - r7
            int r6 = r6 + (-1)
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.p089l.i.a = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L6a
            return r5
        L6a:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p089l.i.c(float, float, float):float");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    public final float e(float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 71;
        int i8 = ((i6 | 71) & (~i7)) + (i7 << 1);
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 == 0 ? f2 == 0.0f : f2 == 1.0f) {
            int i10 = i9 & 47;
            int i11 = ((~i10) & (i9 | 47)) + (i10 << 1);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int i14 = ((i12 | 63) << 1) - (i12 ^ 63);
            a = i14 % 128;
            int i15 = i14 % 2;
            return 0.0f;
        }
        int i16 = this.k;
        if (i16 != 0) {
            int i17 = ((i9 & 122) + (i9 | 122)) - 1;
            b = i17 % 128;
            if (i17 % 2 != 0 ? i16 != 1 : i16 != 1) {
                int i18 = i9 & 119;
                int i19 = (i9 ^ 119) | i18;
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                if (i16 == 2) {
                    int i23 = (i21 & 7) + (i21 | 7);
                    int i24 = i23 % 128;
                    a = i24;
                    if (i23 % 2 == 0 ? f < 0.0f : f < 0.0f) {
                        int i25 = i24 & 19;
                        int i26 = i25 + ((i24 ^ 19) | i25);
                        int i27 = i26 % 128;
                        b = i27;
                        int i28 = i26 % 2;
                        float f3 = f / (-f2);
                        int i29 = i27 + 71;
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        return f3;
                    }
                }
            } else if (f < f2) {
                i = b;
                int i31 = i & 11;
                int i32 = -(-((i ^ 11) | i31));
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                i2 = i33 % 128;
                a = i2;
                int i34 = i33 % 2;
                if (f >= 0.0f) {
                    int i35 = i & 47;
                    int i36 = (((~i35) & (i | 47)) - (~(-(-(i35 << 1))))) - 1;
                    a = i36 % 128;
                    int i37 = i36 % 2;
                    float f4 = 1.0f - (f / f2);
                    int i38 = i & 7;
                    int i39 = ((i ^ 7) | i38) << 1;
                    int i40 = -((~i38) & (i | 7));
                    i4 = ((i39 | i40) << 1) - (i39 ^ i40);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i41 = 51 / 0;
                    }
                    return f4;
                }
                if (this.r) {
                    int i42 = (i2 & 115) + (i2 | 115);
                    i3 = i42 % 128;
                    b = i3;
                    int i43 = i42 % 2;
                    if (i16 == 1) {
                        int i44 = i3 & 51;
                        int i45 = ((i3 | 51) & (~i44)) + (i44 << 1);
                        int i46 = i45 % 128;
                        a = i46;
                        int i47 = i45 % 2;
                        int i48 = ((i46 & 100) + (i46 | 100)) - 1;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        return 1.0f;
                    }
                }
            }
        } else if (f < f2) {
            i = b;
            int i310 = i & 11;
            int i311 = -(-((i ^ 11) | i310));
            int i312 = (i310 ^ i311) + ((i310 & i311) << 1);
            i2 = i312 % 128;
            a = i2;
            int i313 = i312 % 2;
            if (f >= 0.0f) {
                int i314 = i & 47;
                int i315 = (((~i314) & (i | 47)) - (~(-(-(i314 << 1))))) - 1;
                a = i315 % 128;
                int i316 = i315 % 2;
                float f5 = 1.0f - (f / f2);
                int i317 = i & 7;
                int i318 = ((i ^ 7) | i317) << 1;
                int i410 = -((~i317) & (i | 7));
                i4 = ((i318 | i410) << 1) - (i318 ^ i410);
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i411 = 51 / 0;
                }
                return f5;
            }
            if (this.r) {
                int i412 = (i2 & 115) + (i2 | 115);
                i3 = i412 % 128;
                b = i3;
                int i413 = i412 % 2;
                if (i16 == 1) {
                    int i414 = i3 & 51;
                    int i415 = ((i3 | 51) & (~i414)) + (i414 << 1);
                    int i416 = i415 % 128;
                    a = i416;
                    int i417 = i415 % 2;
                    int i418 = ((i416 & 100) + (i416 | 100)) - 1;
                    b = i418 % 128;
                    int i419 = i418 % 2;
                    return 1.0f;
                }
            }
        }
        int i50 = a;
        int i51 = i50 ^ 63;
        int i52 = ((i50 & 63) | i51) << 1;
        int i53 = -i51;
        int i54 = (i52 & i53) + (i52 | i53);
        b = i54 % 128;
        if (i54 % 2 != 0) {
            return 0.0f;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0194  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float fD;
        aVb avb;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = i9 & 103;
        int i11 = (i10 - (~((i9 ^ 103) | i10))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        if (!this.s) {
            int i13 = i9 + 25;
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i9 & 95;
            int i16 = ((((i9 ^ 95) | i15) << 1) - (~(-((~i15) & (i9 | 95))))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i18 = a;
            int i19 = i18 & 117;
            int i20 = (i19 - (~((i18 ^ 117) | i19))) - 1;
            int i21 = i20 % 128;
            b = i21;
            if (i20 % 2 != 0 ? actionMasked == 1 : actionMasked == 1) {
                f();
                int i22 = a;
                int i23 = ((i22 | 60) << 1) - (i22 ^ 60);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
            } else if (actionMasked != 2) {
                int i26 = (-2) - ((i21 + 100) ^ (-1));
                a = i26 % 128;
                if (i26 % 2 == 0 ? actionMasked == 3 : actionMasked == 4) {
                    f();
                    int i27 = a;
                    int i28 = ((i27 | 60) << 1) - (i27 ^ 60);
                    int i29 = (i28 ^ (-1)) + (i28 << 1);
                    b = i29 % 128;
                    int i210 = i29 % 2;
                }
            }
            int i30 = b;
            int i31 = i30 & 91;
            i7 = ((i30 | 91) & (~i31)) + (i31 << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i32 = 82 / 0;
            }
            return false;
        }
        this.q = true;
        this.p = false;
        int i33 = b;
        int i34 = ((i33 & 126) + (i33 | 126)) - 1;
        a = i34 % 128;
        int i35 = i34 % 2;
        float x = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.g;
        int i36 = a;
        int i37 = (-2) - ((((i36 | 30) << 1) - (i36 ^ 30)) ^ (-1));
        b = i37 % 128;
        float fD2 = d(0, x, width, i37 % 2 == 0 ? view2.getWidth() : view2.getWidth());
        float y = motionEvent.getY();
        float height = view.getHeight();
        int i38 = a + 77;
        b = i38 % 128;
        int i39 = i38 % 2;
        float height2 = this.g.getHeight();
        int i40 = a;
        int i41 = ((i40 & (-54)) | ((~i40) & 53)) + ((i40 & 53) << 1);
        b = i41 % 128;
        if (i41 % 2 == 0) {
            fD = d(1, y, height, height2);
            avb = this.e;
            avb.f = fD2;
            int i42 = 14 / 0;
        } else {
            fD = d(1, y, height, height2);
            avb = this.e;
            avb.f = fD2;
        }
        avb.g = fD;
        if (!this.r) {
            int i43 = b;
            int i44 = ((i43 & 6) + (i43 | 6)) - 1;
            a = i44 % 128;
            if (i44 % 2 != 0) {
                int i45 = 76 / 0;
                if (!(!g())) {
                    i = a + 35;
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i46 = 54 / 0;
                        if (this.i == null) {
                            this.i = new aVc();
                            int i47 = b;
                            int i48 = (i47 ^ 16) + ((i47 & 16) << 1);
                            int i49 = (i48 ^ (-1)) + (i48 << 1);
                            a = i49 % 128;
                            int i50 = i49 % 2;
                        }
                    } else if (this.i == null) {
                        this.i = new aVc();
                        int i410 = b;
                        int i411 = (i410 ^ 16) + ((i410 & 16) << 1);
                        int i412 = (i411 ^ (-1)) + (i411 << 1);
                        a = i412 % 128;
                        int i51 = i412 % 2;
                    }
                    this.r = true;
                    this.f104o = true;
                    if (!this.p) {
                        i3 = a;
                        int i52 = i3 & 59;
                        int i53 = i52 + ((i3 ^ 59) | i52);
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        i4 = this.d;
                        if (i4 > 0) {
                            i5 = (i3 & 91) + (i3 | 91);
                            i6 = i5 % 128;
                            b = i6;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            View view3 = this.g;
                            Runnable runnable = this.i;
                            int i55 = i6 & 25;
                            int i56 = (i6 ^ 25) | i55;
                            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                            a = i57 % 128;
                            int i58 = i57 % 2;
                            WeakHashMap<View, R> weakHashMap = T.c;
                            int i59 = a + 123;
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            T.aWX.n(view3, runnable, i4);
                            int i61 = b;
                            int i62 = (i61 & (-68)) | ((~i61) & 67);
                            int i63 = (i61 & 67) << 1;
                            int i64 = (i62 & i63) + (i63 | i62);
                            a = i64 % 128;
                            int i65 = i64 % 2;
                        } else {
                            this.i.run();
                            i2 = b + 49;
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i66 = 2 / 5;
                            }
                        }
                    } else {
                        this.i.run();
                        i2 = b + 49;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i67 = 2 / 5;
                        }
                    }
                    this.p = true;
                    int i68 = a;
                    int i69 = i68 & 65;
                    int i70 = -(-((i68 ^ 65) | i69));
                    int i71 = (i69 & i70) + (i70 | i69);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                }
            } else if (g()) {
                i = a + 35;
                b = i % 128;
                if (i % 2 == 0) {
                    int i413 = 54 / 0;
                    if (this.i == null) {
                        this.i = new aVc();
                        int i414 = b;
                        int i415 = (i414 ^ 16) + ((i414 & 16) << 1);
                        int i416 = (i415 ^ (-1)) + (i415 << 1);
                        a = i416 % 128;
                        int i510 = i416 % 2;
                    }
                } else if (this.i == null) {
                    this.i = new aVc();
                    int i417 = b;
                    int i418 = (i417 ^ 16) + ((i417 & 16) << 1);
                    int i419 = (i418 ^ (-1)) + (i418 << 1);
                    a = i419 % 128;
                    int i511 = i419 % 2;
                }
                this.r = true;
                this.f104o = true;
                if (!this.p) {
                    i3 = a;
                    int i512 = i3 & 59;
                    int i513 = i512 + ((i3 ^ 59) | i512);
                    b = i513 % 128;
                    int i514 = i513 % 2;
                    i4 = this.d;
                    if (i4 > 0) {
                        i5 = (i3 & 91) + (i3 | 91);
                        i6 = i5 % 128;
                        b = i6;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        View view4 = this.g;
                        Runnable runnable2 = this.i;
                        int i515 = i6 & 25;
                        int i516 = (i6 ^ 25) | i515;
                        int i517 = (i515 ^ i516) + ((i516 & i515) << 1);
                        a = i517 % 128;
                        int i518 = i517 % 2;
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        int i519 = a + 123;
                        b = i519 % 128;
                        int i610 = i519 % 2;
                        T.aWX.n(view4, runnable2, i4);
                        int i611 = b;
                        int i612 = (i611 & (-68)) | ((~i611) & 67);
                        int i613 = (i611 & 67) << 1;
                        int i614 = (i612 & i613) + (i613 | i612);
                        a = i614 % 128;
                        int i615 = i614 % 2;
                    } else {
                        this.i.run();
                        i2 = b + 49;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i616 = 2 / 5;
                        }
                    }
                } else {
                    this.i.run();
                    i2 = b + 49;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i617 = 2 / 5;
                    }
                }
                this.p = true;
                int i618 = a;
                int i619 = i618 & 65;
                int i73 = -(-((i618 ^ 65) | i619));
                int i74 = (i619 & i73) + (i73 | i619);
                b = i74 % 128;
                int i75 = i74 % 2;
            }
        }
        int i310 = b;
        int i311 = i310 & 91;
        i7 = ((i310 | 91) & (~i311)) + (i311 << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i312 = 82 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0076 A[PHI: r8
  0x0076: PHI (r8v30 float) = (r8v2 float), (r8v38 float) binds: [B:8:0x005d, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    /* JADX WARN: Code duplicated, block: B:14:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x005f A[PHI: r8
  0x005f: PHI (r8v3 float) = (r8v2 float), (r8v38 float) binds: [B:8:0x005d, B:5:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
    
        if (r8 > 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0112, code lost:
    
        if (r8 > 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0114, code lost:
    
        r7 = c(r8 * r1, r3, r7);
        r8 = ivas.gov.bisp.enumeration.p089l.i.b + 25;
        ivas.gov.bisp.enumeration.p089l.i.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0123, code lost:
    
        r7 = c((-r8) * r1, r3, r7);
        r8 = ivas.gov.bisp.enumeration.p089l.i.a;
        r9 = r8 + 21;
        ivas.gov.bisp.enumeration.p089l.i.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0132, code lost:
    
        if ((r9 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0134, code lost:
    
        r7 = -r7;
        r9 = r8 & 63;
        r8 = (r8 ^ 63) | r9;
        r10 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.p089l.i.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0145, code lost:
    
        if ((r10 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0147, code lost:
    
        r8 = 4 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float d(int r7, float r8, float r9, float r10) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p089l.i.d(int, float, float, float):float");
    }

    public final void f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 7) << 1;
        int i4 = -(i2 ^ 7);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = 0;
        if (this.f104o) {
            int i9 = ((i6 ^ 106) + ((i6 & 106) << 1)) - 1;
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 != 0) {
                this.r = true;
            } else {
                this.r = false;
            }
            int i11 = (((i10 | 102) << 1) - (i10 ^ 102)) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        aVb avb = this.e;
        Objects.requireNonNull(avb);
        int i12 = a;
        int i13 = (i12 & 76) + (i12 | 76);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = avb.i;
        int i16 = b;
        int i17 = ((i16 | 79) << 1) - (i16 ^ 79);
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = (int) (jCurrentAnimationTimeMillis - j);
        int i20 = avb.e;
        if (i19 > i20) {
            int i21 = b;
            int i22 = i21 & 87;
            int i23 = (((~i22) & (i21 | 87)) - (~(-(-(i22 << 1))))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            int i25 = i21 | 59;
            int i26 = (i25 << 1) - ((~(i21 & 59)) & i25);
            a = i26 % 128;
            int i27 = i26 % 2;
            i8 = i20;
        } else if (i19 >= 0) {
            int i28 = b;
            int i29 = (-2) - (((i28 ^ 4) + ((i28 & 4) << 1)) ^ (-1));
            int i30 = i29 % 128;
            a = i30;
            int i31 = i29 % 2;
            int i32 = i30 & 3;
            int i33 = (i30 ^ 3) | i32;
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            b = i34 % 128;
            int i35 = i34 % 2;
            i8 = i19;
        }
        avb.m = i8;
        avb.l = avb.c(jCurrentAnimationTimeMillis);
        int i36 = a + 41;
        b = i36 % 128;
        int i37 = i36 % 2;
        avb.c = jCurrentAnimationTimeMillis;
        int i38 = a;
        int i39 = ((i38 & (-30)) | ((~i38) & 29)) + ((i38 & 29) << 1);
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0151  */
    public boolean g() {
        boolean z;
        int i;
        ListView listView;
        int count;
        int childCount;
        int firstVisiblePosition;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 ^ 65;
        int i9 = (i7 & 65) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        aVb avb = this.e;
        float f = avb.g;
        int i12 = b;
        int i13 = (((i12 & (-26)) | ((~i12) & 25)) - (~(-(-((i12 & 25) << 1))))) - 1;
        a = i13 % 128;
        int iAbs = (int) (i13 % 2 != 0 ? f + Math.abs(f) : f / Math.abs(f));
        float f2 = avb.f;
        int i14 = a;
        int i15 = i14 & 113;
        int i16 = i15 + ((i14 ^ 113) | i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            Math.abs(f2);
            if (iAbs != 0) {
                z = true;
                int i17 = a;
                int i18 = i17 & 55;
                int i19 = (i17 | 55) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                b = i21 % 128;
                int i22 = i21 % 2;
                listView = ((P) this).a;
                count = listView.getCount();
                int i23 = b;
                int i24 = i23 & 119;
                int i25 = -(-((i23 ^ 119) | i24));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                a = i26 % 128;
                int i27 = i26 % 2;
                if (count != 0) {
                    childCount = listView.getChildCount();
                    firstVisiblePosition = listView.getFirstVisiblePosition();
                    if (iAbs > 0) {
                        int i28 = a;
                        int i29 = i28 & 13;
                        int i30 = (i28 | 13) & (~i29);
                        int i31 = i29 << 1;
                        i3 = ((i30 | i31) << 1) - (i30 ^ i31);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i32 = -(-childCount);
                            i4 = ((firstVisiblePosition ^ i32) | (firstVisiblePosition & i32)) << 1;
                            i5 = -((i32 & (~firstVisiblePosition)) | ((~i32) & firstVisiblePosition));
                            if ((i4 & i5) + (i5 | i4) >= count) {
                                if (listView.getChildAt((-2) - (childCount ^ (-1))).getBottom() <= listView.getHeight()) {
                                    int i33 = b;
                                    int i34 = i33 ^ 111;
                                    int i35 = ((((i33 & 111) | i34) << 1) - (~(-i34))) - 1;
                                    a = i35 % 128;
                                    int i36 = i35 % 2;
                                }
                            }
                        } else if (firstVisiblePosition / childCount >= count) {
                            if (listView.getChildAt((-2) - (childCount ^ (-1))).getBottom() <= listView.getHeight()) {
                                int i37 = b;
                                int i38 = i37 ^ 111;
                                int i39 = ((((i37 & 111) | i38) << 1) - (~(-i38))) - 1;
                                a = i39 % 128;
                                int i310 = i39 % 2;
                            }
                        }
                        int i40 = b;
                        int i41 = ((i40 ^ 91) - (~((i40 & 91) << 1))) - 1;
                        a = i41 % 128;
                        int i42 = i41 % 2;
                    } else if (iAbs < 0) {
                        int i43 = b;
                        i2 = ((i43 & (-26)) | ((~i43) & 25)) + ((i43 & 25) << 1);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        if (firstVisiblePosition <= 0) {
                        }
                        int i44 = b;
                        int i45 = ((i44 ^ 91) - (~((i44 & 91) << 1))) - 1;
                        a = i45 % 128;
                        int i46 = i45 % 2;
                    }
                }
                int i47 = a;
                int i48 = (i47 | 49) << 1;
                int i49 = -(((~i47) & 49) | (i47 & (-50)));
                int i50 = (i48 & i49) + (i49 | i48);
                b = i50 % 128;
                int i51 = i50 % 2;
            }
            int i52 = b;
            int i53 = i52 ^ 5;
            i = (((i52 & 5) | i53) << 1) - i53;
            a = i % 128;
            if (i % 2 != 0) {
                int i54 = 53 / 0;
            }
            return z;
        }
        Math.abs(f2);
        if (iAbs != 0) {
            z = false;
            int i110 = a;
            int i111 = i110 & 55;
            int i112 = (i110 | 55) & (~i111);
            int i210 = -(-(i111 << 1));
            int i211 = ((i112 | i210) << 1) - (i112 ^ i210);
            b = i211 % 128;
            int i212 = i211 % 2;
            listView = ((P) this).a;
            count = listView.getCount();
            int i213 = b;
            int i214 = i213 & 119;
            int i215 = -(-((i213 ^ 119) | i214));
            int i216 = ((i214 | i215) << 1) - (i215 ^ i214);
            a = i216 % 128;
            int i217 = i216 % 2;
            if (count != 0) {
                childCount = listView.getChildCount();
                firstVisiblePosition = listView.getFirstVisiblePosition();
                if (iAbs > 0) {
                    int i218 = a;
                    int i219 = i218 & 13;
                    int i311 = (i218 | 13) & (~i219);
                    int i312 = i219 << 1;
                    i3 = ((i311 | i312) << 1) - (i311 ^ i312);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i313 = -(-childCount);
                        i4 = ((firstVisiblePosition ^ i313) | (firstVisiblePosition & i313)) << 1;
                        i5 = -((i313 & (~firstVisiblePosition)) | ((~i313) & firstVisiblePosition));
                        if ((i4 & i5) + (i5 | i4) >= count) {
                            if (listView.getChildAt((-2) - (childCount ^ (-1))).getBottom() <= listView.getHeight()) {
                                int i314 = b;
                                int i315 = i314 ^ 111;
                                int i316 = ((((i314 & 111) | i315) << 1) - (~(-i315))) - 1;
                                a = i316 % 128;
                                int i317 = i316 % 2;
                            }
                        }
                    } else if (firstVisiblePosition / childCount >= count) {
                        if (listView.getChildAt((-2) - (childCount ^ (-1))).getBottom() <= listView.getHeight()) {
                            int i318 = b;
                            int i319 = i318 ^ 111;
                            int i3110 = ((((i318 & 111) | i319) << 1) - (~(-i319))) - 1;
                            a = i3110 % 128;
                            int i3111 = i3110 % 2;
                        }
                    }
                    int i410 = b;
                    int i411 = ((i410 ^ 91) - (~((i410 & 91) << 1))) - 1;
                    a = i411 % 128;
                    int i412 = i411 % 2;
                } else if (iAbs < 0) {
                    int i413 = b;
                    i2 = ((i413 & (-26)) | ((~i413) & 25)) + ((i413 & 25) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (firstVisiblePosition <= 0 || listView.getChildAt(0).getTop() < 0) {
                        int i414 = b;
                        int i415 = ((i414 ^ 91) - (~((i414 & 91) << 1))) - 1;
                        a = i415 % 128;
                        int i416 = i415 % 2;
                    }
                }
            }
            int i417 = a;
            int i418 = (i417 | 49) << 1;
            int i419 = -(((~i417) & 49) | (i417 & (-50)));
            int i55 = (i418 & i419) + (i419 | i418);
            b = i55 % 128;
            int i56 = i55 % 2;
        }
        int i57 = b;
        int i58 = i57 ^ 5;
        i = (((i57 & 5) | i58) << 1) - i58;
        a = i % 128;
        if (i % 2 != 0) {
            int i59 = 53 / 0;
        }
        return z;
        int i60 = a;
        int i61 = (i60 ^ 57) + ((i60 & 57) << 1);
        b = i61 % 128;
        int i62 = i61 % 2;
        z = false;
        int i510 = b;
        int i511 = i510 ^ 5;
        i = (((i510 & 5) | i511) << 1) - i511;
        a = i % 128;
        if (i % 2 != 0) {
            int i512 = 53 / 0;
        }
        return z;
    }

    public static class aVb {
        private static int a = 1;
        private static int b;
        public int d;
        public int e;
        public float f;
        public float g;
        public float l;
        public int m;
        public long i = Long.MIN_VALUE;
        public long c = -1;
        public long h = 0;
        public int j = 0;
        public int k = 0;

        public final float c(long j) {
            float f;
            long j2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            long j3 = this.i;
            if (j < j3) {
                int i6 = (i4 ^ 51) + ((i4 & 51) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i4 & 51;
                int i9 = (i8 - (~(-(-((i4 ^ 51) | i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                return 0.0f;
            }
            long j4 = this.c;
            if (j4 >= 0) {
                int i11 = i4 & 23;
                int i12 = -(-((i4 ^ 23) | i11));
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (j >= j4) {
                    int i14 = i4 & 73;
                    int i15 = -(-((i4 ^ 73) | i14));
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        f = this.l;
                        j2 = j + j4;
                    } else {
                        f = this.l;
                        j2 = j - j4;
                    }
                    float fC = i.c(j2 / this.m, 0.0f, 1.0f);
                    int i17 = b;
                    int i18 = i17 + 56;
                    int i19 = (i18 ^ (-1)) + (i18 << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    float f2 = (fC * f) + (1.0f - f);
                    int i21 = (((i17 | 22) << 1) - (i17 ^ 22)) - 1;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    return f2;
                }
            }
            float fC2 = i.c((j - j3) / this.d, 0.0f, 1.0f);
            int i23 = a;
            int i24 = i23 & 107;
            int i25 = (~i24) & (i23 | 107);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            int i28 = i27 % 2;
            float f3 = fC2 * 0.5f;
            int i29 = i23 + 3;
            b = i29 % 128;
            int i30 = i29 % 2;
            return f3;
        }
    }

    public class aVc implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aVc() {
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:36:0x0103  */
        /* JADX WARN: Code duplicated, block: B:38:0x010b  */
        /* JADX WARN: Code duplicated, block: B:40:0x0111  */
        /* JADX WARN: Code duplicated, block: B:42:0x011c  */
        /* JADX WARN: Code duplicated, block: B:44:0x0128  */
        /* JADX WARN: Code duplicated, block: B:48:0x0164  */
        /* JADX WARN: Code duplicated, block: B:50:0x0198  */
        /* JADX WARN: Code duplicated, block: B:51:0x019f  */
        /* JADX WARN: Code duplicated, block: B:54:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:56:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:59:0x01fe A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:61:0x0200  */
        /* JADX WARN: Code duplicated, block: B:65:0x021d  */
        @Override // java.lang.Runnable
        public void run() {
            int i;
            i iVar;
            long jCurrentAnimationTimeMillis;
            float fC;
            long j;
            int i2;
            float f;
            float f2;
            float f3;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 2 % 2;
            int i8 = b;
            int i9 = (i8 & 51) + (i8 | 51);
            a = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                boolean z = i.this.r;
                obj.hashCode();
                throw null;
            }
            i iVar2 = i.this;
            if (!iVar2.r) {
                int i10 = b;
                int i11 = (i10 & 1) + (i10 | 1);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 72 / 0;
                    return;
                }
                return;
            }
            if (iVar2.f104o) {
                int i13 = b;
                int i14 = ((i13 & (-122)) | ((~i13) & 121)) + ((i13 & 121) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    iVar2.f104o = false;
                } else {
                    iVar2.f104o = false;
                }
                aVb avb = iVar2.e;
                Objects.requireNonNull(avb);
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                avb.i = jCurrentAnimationTimeMillis2;
                int i15 = a;
                int i16 = (i15 & 5) + (i15 | 5);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    avb.c = -1L;
                    avb.h = jCurrentAnimationTimeMillis2;
                    avb.l = 0.5f;
                    int i17 = 2 / 0;
                } else {
                    avb.c = -1L;
                    avb.h = jCurrentAnimationTimeMillis2;
                    avb.l = 0.5f;
                }
                avb.j = 0;
                avb.k = 0;
                int i18 = a;
                int i19 = i18 & 15;
                int i20 = (i18 | 15) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 & i21) + (i20 | i21);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
            aVb avb2 = i.this.e;
            long j2 = avb2.c;
            int i24 = a;
            int i25 = i24 ^ 3;
            int i26 = ((i24 & 3) | i25) << 1;
            int i27 = -i25;
            int i28 = (i26 & i27) + (i26 | i27);
            b = i28 % 128;
            if (i28 % 2 != 0 ? j2 <= 0 : j2 <= 1) {
                int i29 = b;
                int i30 = i29 ^ 107;
                int i31 = (i29 & 107) << 1;
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
                int i34 = i29 & 85;
                i = (((i29 ^ 85) | i34) << 1) - ((i29 | 85) & (~i34));
                a = i % 128;
                if (i % 2 == 0) {
                    i.this.g();
                    throw null;
                }
                if (i.this.g()) {
                    iVar = i.this;
                    if (iVar.q) {
                        i6 = b + 47;
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            iVar.q = true;
                        } else {
                            iVar.q = false;
                        }
                        Objects.requireNonNull(iVar);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        View view = iVar.g;
                        int i35 = b;
                        int i36 = (i35 & 61) + (i35 | 61);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        int i38 = a;
                        int i39 = (i38 ^ 82) + ((i38 & 82) << 1);
                        int i40 = (i39 ^ (-1)) + (i39 << 1);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                    }
                    if (avb2.h != 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    int i42 = a + 112;
                    int i43 = (i42 ^ (-1)) + (i42 << 1);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    fC = avb2.c(jCurrentAnimationTimeMillis);
                    j = avb2.h;
                    int i45 = b;
                    int i46 = ((i45 ^ 45) | (i45 & 45)) << 1;
                    int i47 = -(((~i45) & 45) | (i45 & (-46)));
                    i2 = (i46 & i47) + (i47 | i46);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        avb2.h = jCurrentAnimationTimeMillis;
                        f = jCurrentAnimationTimeMillis ^ j;
                        f2 = fC % 4.0f;
                    } else {
                        avb2.h = jCurrentAnimationTimeMillis;
                        f = jCurrentAnimationTimeMillis - j;
                        f2 = fC * 4.0f;
                    }
                    f3 = f * (f2 + ((-4.0f) * fC * fC));
                    avb2.j = (int) (avb2.f * f3);
                    int i48 = a;
                    int i49 = i48 & 121;
                    int i50 = -(-(i48 | 121));
                    i3 = (i49 & i50) + (i50 | i49);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        i4 = (int) (f3 % avb2.g);
                    } else {
                        i4 = (int) (f3 * avb2.g);
                    }
                    avb2.k = i4;
                    ((P) i.this).a.scrollListBy(i4);
                    View view2 = i.this.g;
                    int i51 = b;
                    int i52 = (i51 ^ 69) + ((i51 & 69) << 1);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    WeakHashMap<View, R> weakHashMap = T.c;
                    T.aWX.o(view2, this);
                    int i54 = a;
                    i5 = ((i54 | 19) << 1) - (i54 ^ 19);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            } else if (AnimationUtils.currentAnimationTimeMillis() > avb2.c + ((long) avb2.m)) {
                int i55 = b;
                int i56 = i55 & 15;
                int i57 = (i56 - (~((i55 ^ 15) | i56))) - 1;
                a = i57 % 128;
                int i58 = i57 % 2;
                int i59 = (i55 & 75) + (i55 | 75);
                a = i59 % 128;
                if (i59 % 2 != 0) {
                    int i60 = 5 % 3;
                }
            } else {
                int i210 = b;
                int i310 = i210 ^ 107;
                int i311 = (i210 & 107) << 1;
                int i312 = (i310 ^ i311) + ((i310 & i311) << 1);
                a = i312 % 128;
                int i313 = i312 % 2;
                int i314 = i210 & 85;
                i = (((i210 ^ 85) | i314) << 1) - ((i210 | 85) & (~i314));
                a = i % 128;
                if (i % 2 == 0) {
                    i.this.g();
                    throw null;
                }
                if (i.this.g()) {
                    iVar = i.this;
                    if (iVar.q) {
                        i6 = b + 47;
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            iVar.q = true;
                        } else {
                            iVar.q = false;
                        }
                        Objects.requireNonNull(iVar);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                        View view3 = iVar.g;
                        int i315 = b;
                        int i316 = (i315 & 61) + (i315 | 61);
                        a = i316 % 128;
                        int i317 = i316 % 2;
                        view3.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        int i318 = a;
                        int i319 = (i318 ^ 82) + ((i318 & 82) << 1);
                        int i410 = (i319 ^ (-1)) + (i319 << 1);
                        b = i410 % 128;
                        int i411 = i410 % 2;
                    }
                    if (avb2.h != 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    int i412 = a + 112;
                    int i413 = (i412 ^ (-1)) + (i412 << 1);
                    b = i413 % 128;
                    int i414 = i413 % 2;
                    jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    fC = avb2.c(jCurrentAnimationTimeMillis);
                    j = avb2.h;
                    int i415 = b;
                    int i416 = ((i415 ^ 45) | (i415 & 45)) << 1;
                    int i417 = -(((~i415) & 45) | (i415 & (-46)));
                    i2 = (i416 & i417) + (i417 | i416);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        avb2.h = jCurrentAnimationTimeMillis;
                        f = jCurrentAnimationTimeMillis ^ j;
                        f2 = fC % 4.0f;
                    } else {
                        avb2.h = jCurrentAnimationTimeMillis;
                        f = jCurrentAnimationTimeMillis - j;
                        f2 = fC * 4.0f;
                    }
                    f3 = f * (f2 + ((-4.0f) * fC * fC));
                    avb2.j = (int) (avb2.f * f3);
                    int i418 = a;
                    int i419 = i418 & 121;
                    int i510 = -(-(i418 | 121));
                    i3 = (i419 & i510) + (i510 | i419);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        i4 = (int) (f3 % avb2.g);
                    } else {
                        i4 = (int) (f3 * avb2.g);
                    }
                    avb2.k = i4;
                    ((P) i.this).a.scrollListBy(i4);
                    View view4 = i.this.g;
                    int i511 = b;
                    int i512 = (i511 ^ 69) + ((i511 & 69) << 1);
                    a = i512 % 128;
                    int i513 = i512 % 2;
                    WeakHashMap<View, R> weakHashMap2 = T.c;
                    T.aWX.o(view4, this);
                    int i514 = a;
                    i5 = ((i514 | 19) << 1) - (i514 ^ 19);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
            i.this.r = false;
            int i61 = b;
            int i62 = i61 & 117;
            int i63 = (i61 ^ 117) | i62;
            int i64 = (i62 & i63) + (i63 | i62);
            a = i64 % 128;
            int i65 = i64 % 2;
        }
    }
}
