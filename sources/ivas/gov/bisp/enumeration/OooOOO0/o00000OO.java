package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p089l.P;
import ivas.gov.bisp.enumeration.p091n.r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class o00000OO extends ListView {
    private static int a = 1;
    private static int b;
    public aRZ c;
    public final Rect d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Field j;
    public boolean k;
    public boolean l;
    public boolean m;
    public aSa n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f50o;

    public static class aRZ extends r {
        private static int a = 1;
        private static int b;
        public boolean d;

        public aRZ(Drawable drawable) {
            super(drawable);
            this.d = true;
        }

        @Override // ivas.gov.bisp.enumeration.p091n.r, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = b;
            int i7 = i6 & 19;
            int i8 = i6 | 19;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            int i10 = i9 % 128;
            a = i10;
            Object obj = null;
            if (i9 % 2 == 0) {
                throw null;
            }
            if (this.d) {
                int i11 = i10 ^ 37;
                int i12 = (i10 & 37) << 1;
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    this.c.setHotspotBounds(i, i2, i3, i4);
                    obj.hashCode();
                    throw null;
                }
                this.c.setHotspotBounds(i, i2, i3, i4);
            }
            int i14 = b;
            int i15 = i14 & 67;
            int i16 = (i14 ^ 67) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p091n.r, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 14) << 1) - (i2 ^ 14);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            if (!this.d) {
                int i7 = i2 + 51;
                b = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = ((i5 | 111) << 1) - (i5 ^ 111);
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean state = this.c.setState(iArr);
            int i11 = b;
            int i12 = ((i11 & (-76)) | ((~i11) & 75)) + ((i11 & 75) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return state;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            r2 = r1 ^ 89;
            r1 = (r1 & 89) << 1;
            r3 = (r2 ^ r1) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r3 % 128;
            r3 = r3 % 2;
            r7 = super.setVisible(r7, r8);
            r8 = ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.a + 123;
            ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            if ((r8 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r6.d != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if ((!r6.d) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r7 = r1 & 85;
            r8 = r1 | 85;
            r1 = (r7 & r8) + (r7 | r8);
            ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r1 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.p091n.r, android.graphics.drawable.Drawable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean setVisible(boolean r7, boolean r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b
                r2 = r1 | 115(0x73, float:1.61E-43)
                int r2 = r2 << 1
                r1 = r1 ^ 115(0x73, float:1.61E-43)
                int r1 = -r1
                r3 = r2 | r1
                int r3 = r3 << 1
                r1 = r1 ^ r2
                int r3 = r3 - r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.a = r1
                int r3 = r3 % r0
                r2 = 0
                r4 = 0
                if (r3 != 0) goto L23
                boolean r3 = r6.d
                r5 = 83
                int r5 = r5 / r2
                if (r3 == 0) goto L29
                goto L3d
            L23:
                boolean r3 = r6.d
                r3 = r3 ^ 1
                if (r3 == 0) goto L3d
            L29:
                r7 = r1 & 85
                r8 = r1 | 85
                r1 = r7 & r8
                r7 = r7 | r8
                int r1 = r1 + r7
                int r7 = r1 % 128
                ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r7
                int r1 = r1 % r0
                if (r1 != 0) goto L39
                return r2
            L39:
                r4.hashCode()
                throw r4
            L3d:
                r2 = r1 ^ 89
                r1 = r1 & 89
                int r1 = r1 << 1
                r3 = r2 ^ r1
                r1 = r1 & r2
                int r1 = r1 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r1
                int r3 = r3 % r0
                boolean r7 = super.setVisible(r7, r8)
                int r8 = ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.a
                int r8 = r8 + 123
                int r1 = r8 % 128
                ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.b = r1
                int r8 = r8 % r0
                if (r8 != 0) goto L5e
                return r7
            L5e:
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o00000OO.aRZ.setVisible(boolean, boolean):boolean");
        }

        @Override // ivas.gov.bisp.enumeration.p091n.r, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 7) | (i2 & 7)) << 1;
            int i4 = -((i2 & (-8)) | ((~i2) & 7));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.d) {
                int i6 = (((i2 | 53) << 1) - (~(-(((~i2) & 53) | (i2 & (-54)))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                this.c.draw(canvas);
                int i8 = a;
                int i9 = (i8 ^ 111) + ((i8 & 111) << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 / 4;
                }
            }
            int i11 = b;
            int i12 = (i11 & (-30)) | ((~i11) & 29);
            int i13 = -(-((i11 & 29) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        /* JADX WARN: Code duplicated, block: B:15:0x005a  */
        @Override // ivas.gov.bisp.enumeration.p091n.r, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 109) + ((i3 & 109) << 1);
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 == 0) {
                int i6 = 56 / 0;
                if (this.d) {
                    i = (i5 ^ 121) + ((i5 & 121) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        this.c.setHotspot(f, f2);
                        throw null;
                    }
                    this.c.setHotspot(f, f2);
                    int i7 = a;
                    int i8 = i7 & 37;
                    int i9 = ((i7 | 37) & (~i8)) + (i8 << 1);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else if (!(!this.d)) {
                i = (i5 ^ 121) + ((i5 & 121) << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    this.c.setHotspot(f, f2);
                    throw null;
                }
                this.c.setHotspot(f, f2);
                int i11 = a;
                int i12 = i11 & 37;
                int i13 = ((i11 | 37) & (~i12)) + (i12 << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = a;
            int i16 = i15 ^ 75;
            int i17 = (i15 & 75) << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    public class aSa implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aSa() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 43) - (~(-(-((i2 & 43) << 1))))) - 1;
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                o00000OO o00000oo = o00000OO.this;
                o00000oo.n = null;
                o00000oo.drawableStateChanged();
            } else {
                o00000OO o00000oo2 = o00000OO.this;
                o00000oo2.n = null;
                o00000oo2.drawableStateChanged();
                obj.hashCode();
                throw null;
            }
        }
    }

    public o00000OO(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.d = new Rect();
        this.e = 0;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.l = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.j = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private void setSelectorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 109) | (i2 & 109)) << 1) - (((~i2) & 109) | (i2 & (-110)));
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        aRZ arz = this.c;
        if (arz != null) {
            int i5 = i4 & 43;
            int i6 = -(-(i4 | 43));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                arz.d = z;
                int i8 = 75 / 0;
            } else {
                arz.d = z;
            }
            int i9 = b;
            int i10 = (-2) - (((i9 ^ 102) + ((i9 & 102) << 1)) ^ (-1));
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = (i12 | 65) << 1;
        int i14 = -(i12 ^ 65);
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = a + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (!this.d.isEmpty()) {
            int i4 = a;
            int i5 = i4 & 17;
            int i6 = i5 + ((i4 ^ 17) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            Drawable selector = getSelector();
            if (selector != null) {
                int i8 = b;
                int i9 = (i8 ^ 7) + ((i8 & 7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                selector.setBounds(this.d);
                selector.draw(canvas);
                int i11 = a;
                int i12 = ((i11 | 73) << 1) - (i11 ^ 73);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        super.dispatchDraw(canvas);
        int i14 = b;
        int i15 = i14 & 119;
        int i16 = ((i14 ^ 119) | i15) << 1;
        int i17 = -((i14 | 119) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    public final void f() {
        int i;
        int i2 = 2 % 2;
        int i3 = a + 119;
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable selector = getSelector();
        if (selector != null) {
            int i5 = a;
            int i6 = (i5 & 83) + (i5 | 83);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                int i8 = 28 / 0;
                if (this.m) {
                    int i9 = ((i7 & 36) + (i7 | 36)) - 1;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    if (isPressed()) {
                        int i11 = a;
                        i = (i11 & 97) + (i11 | 97);
                        b = i % 128;
                        if (i % 2 == 0) {
                            selector.setState(getDrawableState());
                            throw null;
                        }
                        selector.setState(getDrawableState());
                    }
                }
            } else if (this.m) {
                int i12 = ((i7 & 36) + (i7 | 36)) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                if (isPressed()) {
                    int i14 = a;
                    i = (i14 & 97) + (i14 | 97);
                    b = i % 128;
                    if (i % 2 == 0) {
                        selector.setState(getDrawableState());
                        throw null;
                    }
                    selector.setState(getDrawableState());
                }
            }
        }
        int i15 = a;
        int i16 = i15 & 61;
        int i17 = -(-((i15 ^ 61) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 77;
        int i5 = (i4 << 1) - ((~(i3 & 77)) & i4);
        b = i5 % 128;
        boolean z = false;
        if (i5 % 2 == 0) {
            if (!this.l) {
                if (!super.hasFocus()) {
                    int i6 = b;
                    int i7 = (i6 & (-12)) | ((~i6) & 11);
                    int i8 = (i6 & 11) << 1;
                    int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i6 & 61;
                    int i12 = -(-((i6 ^ 61) | i11));
                    int i13 = (i11 & i12) + (i12 | i11);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            int i15 = b;
            int i16 = i15 ^ 99;
            int i17 = -(-((i15 & 99) << 1));
            i = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i18 = 10 / 0;
        if (!this.l) {
            if (!super.hasFocus()) {
                int i19 = b;
                int i20 = (i19 & (-12)) | ((~i19) & 11);
                int i21 = (i19 & 11) << 1;
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                a = i22 % 128;
                int i110 = i22 % 2;
                int i111 = i19 & 61;
                int i112 = -(-((i19 ^ 61) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                a = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i115 = b;
        int i116 = i115 ^ 99;
        int i117 = -(-((i115 & 99) << 1));
        i = (i116 ^ i117) + ((i117 & i116) << 1);
        a = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
        int i23 = b;
        int i24 = (i23 & 115) + (i23 | 115);
        a = i24 % 128;
        int i25 = i24 % 2;
        z = true;
        int i118 = b;
        int i119 = i118 ^ 99;
        int i1110 = -(-((i118 & 99) << 1));
        i = (i119 ^ i1110) + ((i1110 & i119) << 1);
        a = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    @Override // android.view.View
    public boolean hasWindowFocus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        boolean z = true;
        int i4 = (((i2 ^ 117) | i3) << 1) - ((~i3) & (i2 | 117));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.l) {
            int i5 = b;
            int i6 = (i5 ^ 87) + ((i5 & 87) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = i2 + 45;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                super.hasWindowFocus();
                throw null;
            }
            if (super.hasWindowFocus()) {
                int i9 = b;
                int i10 = (i9 ^ 87) + ((i9 & 87) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = b;
                int i13 = i12 ^ 13;
                int i14 = (i12 & 13) << 1;
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                z = false;
            }
        }
        int i17 = b;
        int i18 = i17 & 121;
        int i19 = (i17 ^ 121) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 90 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    @Override // android.view.View
    public boolean isFocused() {
        int i = 2 % 2;
        int i2 = b;
        boolean z = true;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!this.l) {
            int i5 = i4 + 111;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
                if (!super.isFocused()) {
                    int i7 = a;
                    int i8 = i7 & 75;
                    int i9 = (i7 | 75) & (~i8);
                    int i10 = -(-(i8 << 1));
                    int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    z = false;
                } else {
                    int i13 = a;
                    int i14 = i13 & 67;
                    int i15 = (i13 ^ 67) | i14;
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                }
            } else if (super.isFocused()) {
                int i18 = a;
                int i19 = i18 & 67;
                int i110 = (i18 ^ 67) | i19;
                int i111 = (i19 ^ i110) + ((i110 & i19) << 1);
                b = i111 % 128;
                int i112 = i111 % 2;
            } else {
                int i20 = a;
                int i21 = i20 & 75;
                int i22 = (i20 | 75) & (~i21);
                int i113 = -(-(i21 << 1));
                int i114 = (i22 ^ i113) + ((i22 & i113) << 1);
                b = i114 % 128;
                int i115 = i114 % 2;
                z = false;
            }
        } else {
            int i116 = a;
            int i117 = i116 & 67;
            int i118 = (i116 ^ 67) | i117;
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            b = i119 % 128;
            int i1110 = i119 % 2;
        }
        int i23 = b;
        int i24 = (i23 & 89) + (i23 | 89);
        a = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // android.view.View
    public boolean isInTouchMode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        boolean z = true;
        int i4 = ((i3 | 89) << 1) - (i3 ^ 89);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.l) {
            int i6 = i3 & 17;
            int i7 = (i3 ^ 17) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (!(!this.k)) {
                i = b + 9;
                a = i % 128;
                if (i % 2 == 0) {
                    int i10 = 5 % 3;
                }
            } else if (!super.isInTouchMode()) {
                int i11 = b;
                int i12 = ((i11 ^ 15) | (i11 & 15)) << 1;
                int i13 = -(((~i11) & 15) | (i11 & (-16)));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                z = false;
            } else {
                i = b + 9;
                a = i % 128;
                if (i % 2 == 0) {
                    int i16 = 5 % 3;
                }
            }
        } else if (!super.isInTouchMode()) {
            int i17 = b;
            int i18 = ((i17 ^ 15) | (i17 & 15)) << 1;
            int i19 = -(((~i17) & 15) | (i17 & (-16)));
            int i110 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i110 % 128;
            int i111 = i110 % 2;
            z = false;
        } else {
            i = b + 9;
            a = i % 128;
            if (i % 2 == 0) {
                int i112 = 5 % 3;
            }
        }
        int i20 = a;
        int i21 = i20 & 55;
        int i22 = -(-((i20 ^ 55) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 63 / 0;
        }
        return z;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = (((i2 | 11) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            motionEvent.getAction();
            throw null;
        }
        if (motionEvent.getAction() == 0) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int i5 = a;
            int i6 = (i5 & 105) + (i5 | 105);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                this.i = iPointToPosition;
                obj.hashCode();
                throw null;
            }
            this.i = iPointToPosition;
            int i8 = ((i7 | 90) << 1) - (i7 ^ 90);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        aSa asa = this.n;
        if (asa != null) {
            int i11 = a;
            int i12 = (i11 | 7) << 1;
            int i13 = -(i11 ^ 7);
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            o00000OO o00000oo = o00000OO.this;
            o00000oo.n = null;
            o00000oo.removeCallbacks(asa);
            int i16 = a;
            int i17 = i16 & 121;
            int i18 = (((i16 ^ 121) | i17) << 1) - ((i16 | 121) & (~i17));
            b = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int i19 = b;
        int i20 = ((i19 | 69) << 1) - (i19 ^ 69);
        a = i20 % 128;
        int i21 = i20 % 2;
        return zOnTouchEvent;
    }

    public void setListSelectionHidden(boolean z) {
        int i = 2 % 2;
        int i2 = a + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.k = z;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i3 - (~(-(-((i2 ^ 113) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.n = null;
            super.onDetachedFromWindow();
        } else {
            this.n = null;
            super.onDetachedFromWindow();
            throw null;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = ((i2 ^ 35) | i3) << 1;
        int i5 = -((i2 | 35) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (this.n != null) {
            int i9 = i7 ^ 121;
            int i10 = ((i7 & 121) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        f();
        int i14 = b;
        int i15 = ((i14 ^ 25) - (~(-(-((i14 & 25) << 1))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0250  */
    /* JADX WARN: Code duplicated, block: B:60:0x025a  */
    /* JADX WARN: Code duplicated, block: B:62:0x026d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0278  */
    /* JADX WARN: Code duplicated, block: B:69:0x0285  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.widget.ListAdapter] */
    public int d(int i, int i2, int i3) throws Throwable {
        ?? r11;
        int iMakeMeasureSpec;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = i12 & 97;
        int i14 = -(-(i12 | 97));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int i17 = b;
        int i18 = i17 & 71;
        int i19 = (i17 ^ 71) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        int i22 = b;
        int i23 = (i22 & (-34)) | ((~i22) & 33);
        int i24 = -(-((i22 & 33) << 1));
        int i25 = (i23 & i24) + (i24 | i23);
        a = i25 % 128;
        Throwable th = null;
        if (i25 % 2 == 0) {
            getAdapter();
            throw null;
        }
        ?? adapter = getAdapter();
        if (adapter == 0) {
            int i26 = a;
            int i27 = ((i26 ^ 11) | (i26 & 11)) << 1;
            int i28 = -(((~i26) & 11) | (i26 & (-12)));
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = i29 % 128;
            b = i30;
            int i31 = i29 % 2;
            int i32 = (listPaddingTop - (~listPaddingBottom)) - 1;
            int i33 = i30 & 59;
            int i34 = i33 + ((i30 ^ 59) | i33);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                return i32;
            }
            throw null;
        }
        int i35 = listPaddingTop & listPaddingBottom;
        int i36 = (listPaddingTop ^ listPaddingBottom) | i35;
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        if (dividerHeight > 0) {
            int i38 = a;
            int i39 = i38 & 125;
            int i40 = ((i38 ^ 125) | i39) << 1;
            int i41 = -((i38 | 125) & (~i39));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            b = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 24 / 0;
                if (divider == null) {
                    int i44 = a;
                    int i45 = i44 & 15;
                    int i46 = (i45 - (~(-(-((i44 ^ 15) | i45))))) - 1;
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    dividerHeight = 0;
                }
            } else if (divider == null) {
                int i48 = a;
                int i49 = i48 & 15;
                int i410 = (i49 - (~(-(-((i48 ^ 15) | i49))))) - 1;
                b = i410 % 128;
                int i411 = i410 % 2;
                dividerHeight = 0;
            }
        } else {
            int i412 = a;
            int i413 = i412 & 15;
            int i414 = (i413 - (~(-(-((i412 ^ 15) | i413))))) - 1;
            b = i414 % 128;
            int i415 = i414 % 2;
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i50 = b;
        int i51 = (i50 & (-56)) | ((~i50) & 55);
        int i52 = -(-((i50 & 55) << 1));
        int i53 = (i51 & i52) + (i52 | i51);
        int i54 = i53 % 128;
        a = i54;
        int i55 = i53 % 2;
        int i56 = ((i54 | 111) << 1) - (i54 ^ 111);
        b = i56 % 128;
        if (i56 % 2 != 0) {
            int i57 = 4 % 2;
        }
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        View view = null;
        while (i58 < count) {
            int i61 = a;
            int i62 = i61 & 51;
            int i63 = -(-((i61 ^ 51) | i62));
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            b = i64 % 128;
            if (i64 % i10 != 0) {
                adapter.getItemViewType(i58);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int itemViewType = adapter.getItemViewType(i58);
            if (itemViewType != i59) {
                int i65 = a;
                int i66 = i65 & 99;
                int i67 = ((i65 ^ 99) | i66) << 1;
                int i68 = -((i65 | 99) & (~i66));
                int i69 = (i67 & i68) + (i68 | i67);
                int i70 = i69 % 128;
                b = i70;
                if (i69 % i10 != 0) {
                    r11 = view;
                    throw th;
                }
                r11 = view;
                int i71 = i70 & 89;
                int i72 = i71 + ((i70 ^ 89) | i71);
                a = i72 % 128;
                int i73 = i72 % i10;
                r11 = th;
                i59 = itemViewType;
            }
            r11 = view;
            View view2 = adapter.getView(i58, r11, this);
            int i74 = a;
            int i75 = i74 & 101;
            int i76 = (i75 - (~(-(-((i74 ^ 101) | i75))))) - 1;
            b = i76 % 128;
            int i77 = i76 % i10;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                int i78 = b;
                int i79 = i78 & 7;
                int i80 = (((~i79) & (i78 | 7)) - (~(-(-(i79 << 1))))) - 1;
                a = i80 % 128;
                if (i80 % i10 == 0) {
                    view2.setLayoutParams(generateDefaultLayoutParams());
                    th.hashCode();
                    throw th;
                }
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            int i81 = layoutParams.height;
            if (i81 > 0) {
                int i82 = a;
                int i83 = i82 & 1;
                int i84 = ((((i82 ^ 1) | i83) << 1) - (~(-((~i83) & (i82 | 1))))) - 1;
                b = i84 % 128;
                int i85 = i84 % i10;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i81, 1073741824);
                int i86 = b + 107;
                a = i86 % 128;
                int i87 = i86 % i10;
            } else {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i88 = a + 79;
                b = i88 % 128;
                int i89 = i88 % i10;
                iMakeMeasureSpec = iMakeMeasureSpec2;
            }
            view2.measure(i, iMakeMeasureSpec);
            view2.forceLayout();
            int i90 = b;
            int i91 = (i90 ^ 111) + ((i90 & 111) << 1);
            int i92 = i91 % 128;
            a = i92;
            if (i91 % i10 == 0) {
                int i93 = 33 / 0;
                if (i58 > 0) {
                    int i94 = (i92 & (-48)) | ((~i92) & 47);
                    int i95 = (i92 & 47) << 1;
                    int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
                    b = i96 % 128;
                    int i97 = i96 % i10;
                    int i98 = -(-dividerHeight);
                    i37 = ((i37 & i98) << 1) + (((~i37) & i98) | ((~i98) & i37));
                    int i99 = ((i92 & 107) - (~(i92 | 107))) - 1;
                    b = i99 % 128;
                    int i100 = i99 % 2;
                }
            } else if (i58 > 0) {
                int i910 = (i92 & (-48)) | ((~i92) & 47);
                int i911 = (i92 & 47) << 1;
                int i912 = (i910 ^ i911) + ((i910 & i911) << 1);
                b = i912 % 128;
                int i913 = i912 % i10;
                int i914 = -(-dividerHeight);
                i37 = ((i37 & i914) << 1) + (((~i37) & i914) | ((~i914) & i37));
                int i915 = ((i92 & 107) - (~(i92 | 107))) - 1;
                b = i915 % 128;
                int i101 = i915 % 2;
            }
            int i102 = -(~(-(-view2.getMeasuredHeight())));
            i37 = (-2) - (((i37 & i102) + (i102 | i37)) ^ (-1));
            int i103 = b;
            int i104 = ((i103 ^ 105) | (i103 & 105)) << 1;
            int i105 = -((i103 & (-106)) | ((~i103) & 105));
            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
            int i107 = i106 % 128;
            a = i107;
            int i108 = i106 % 2;
            if (i37 >= i2) {
                int i109 = i107 + 27;
                int i110 = i109 % 128;
                b = i110;
                if (i109 % 2 == 0) {
                    if (i3 >= 0) {
                        int i111 = i110 + 7;
                        i4 = i111 % 128;
                        a = i4;
                        int i112 = i111 % 2;
                        if (i58 > i3) {
                            int i113 = i4 & 99;
                            int i114 = -(-((i4 ^ 99) | i113));
                            i5 = (i113 & i114) + (i113 | i114);
                            i6 = i5 % 128;
                            b = i6;
                            if (i5 % 2 != 0) {
                                int i115 = 31 / 0;
                                if (i60 > 0) {
                                    if (i37 != i2) {
                                        i7 = (i6 & 125) + (i6 | 125);
                                        a = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            int i116 = 91 / 0;
                                        }
                                        int i117 = (i6 & (-84)) | ((~i6) & 83);
                                        int i118 = -(-((i6 & 83) << 1));
                                        i8 = (i117 & i118) + (i117 | i118);
                                        a = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i119 = 5 / 4;
                                        }
                                    }
                                }
                            } else if (i60 > 0) {
                                if (i37 != i2) {
                                    i7 = (i6 & 125) + (i6 | 125);
                                    a = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        int i1110 = 91 / 0;
                                    }
                                    int i1111 = (i6 & (-84)) | ((~i6) & 83);
                                    int i1112 = -(-((i6 & 83) << 1));
                                    i8 = (i1111 & i1112) + (i1111 | i1112);
                                    a = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i1113 = 5 / 4;
                                    }
                                }
                            }
                        }
                    }
                    int i120 = a;
                    int i121 = i120 & 97;
                    int i122 = -(-((i120 ^ 97) | i121));
                    i9 = ((i121 | i122) << 1) - (i122 ^ i121);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        return i60;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i123 = 89 / 0;
                if (i3 >= 0) {
                    int i1114 = i110 + 7;
                    i4 = i1114 % 128;
                    a = i4;
                    int i1115 = i1114 % 2;
                    if (i58 > i3) {
                        int i1116 = i4 & 99;
                        int i1117 = -(-((i4 ^ 99) | i1116));
                        i5 = (i1116 & i1117) + (i1116 | i1117);
                        i6 = i5 % 128;
                        b = i6;
                        if (i5 % 2 != 0) {
                            int i1118 = 31 / 0;
                            if (i60 > 0) {
                                if (i37 != i2) {
                                    i7 = (i6 & 125) + (i6 | 125);
                                    a = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        int i1119 = 91 / 0;
                                    }
                                    int i11110 = (i6 & (-84)) | ((~i6) & 83);
                                    int i11111 = -(-((i6 & 83) << 1));
                                    i8 = (i11110 & i11111) + (i11110 | i11111);
                                    a = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i11112 = 5 / 4;
                                    }
                                }
                            }
                        } else if (i60 > 0) {
                            if (i37 != i2) {
                                i7 = (i6 & 125) + (i6 | 125);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i11113 = 91 / 0;
                                }
                                int i11114 = (i6 & (-84)) | ((~i6) & 83);
                                int i11115 = -(-((i6 & 83) << 1));
                                i8 = (i11114 & i11115) + (i11114 | i11115);
                                a = i8 % 128;
                                if (i8 % 2 == 0) {
                                    int i11116 = 5 / 4;
                                }
                            }
                        }
                    }
                }
                int i124 = a;
                int i125 = i124 & 97;
                int i126 = -(-((i124 ^ 97) | i125));
                i9 = ((i125 | i126) << 1) - (i126 ^ i125);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return i60;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
                i60 = i2;
                int i127 = a;
                int i128 = i127 & 97;
                int i129 = -(-((i127 ^ 97) | i128));
                i9 = ((i128 | i129) << 1) - (i129 ^ i128);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return i60;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            if (i3 >= 0) {
                int i130 = (((i103 | 100) << 1) - (i103 ^ 100)) - 1;
                a = i130 % 128;
                if (i130 % 2 == 0) {
                    throw null;
                }
                if (i58 >= i3) {
                    int i131 = i103 + 89;
                    int i132 = i131 % 128;
                    a = i132;
                    if (i131 % 2 == 0) {
                        throw null;
                    }
                    int i133 = i132 + 63;
                    b = i133 % 128;
                    int i134 = i133 % 2;
                    i60 = i37;
                }
            }
            i58++;
            int i135 = a;
            int i136 = ((((i135 ^ 35) | (i135 & 35)) << 1) - (~(-(((~i135) & 35) | (i135 & (-36)))))) - 1;
            b = i136 % 128;
            if (i136 % 2 != 0) {
                int i137 = 2 / 5;
            }
            i10 = 2;
            th = null;
            view = view2;
        }
        int i138 = b;
        int i139 = i138 ^ 35;
        int i140 = -(-((i138 & 35) << 1));
        int i141 = (i139 & i140) + (i140 | i139);
        a = i141 % 128;
        if (i141 % 2 != 0) {
            return i37;
        }
        Object obj5 = null;
        obj5.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        aRZ arz;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
            if (drawable != null) {
                arz = new aRZ(drawable);
                int i5 = a;
                int i6 = (i5 ^ 61) + ((i5 & 61) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = ((i2 ^ 33) | (i2 & 33)) << 1;
                int i9 = -(((~i2) & 33) | (i2 & (-34)));
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                arz = null;
            }
        } else if (drawable != null) {
            arz = new aRZ(drawable);
            int i12 = a;
            int i13 = (i12 ^ 61) + ((i12 & 61) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = ((i2 ^ 33) | (i2 & 33)) << 1;
            int i16 = -(((~i2) & 33) | (i2 & (-34)));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            arz = null;
        }
        this.c = arz;
        super.setSelector(arz);
        Rect rect = new Rect();
        int i19 = b;
        int i20 = (i19 ^ 113) + ((i19 & 113) << 1);
        int i21 = i20 % 128;
        a = i21;
        int i22 = i20 % 2;
        if (drawable != null) {
            int i23 = ((i21 | 81) << 1) - (i21 ^ 81);
            b = i23 % 128;
            int i24 = i23 % 2;
            drawable.getPadding(rect);
            int i25 = b;
            int i26 = i25 & 31;
            int i27 = i25 | 31;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        this.e = rect.left;
        this.f = rect.top;
        int i30 = a + 47;
        b = i30 % 128;
        if (i30 % 2 == 0) {
            this.h = rect.right;
            this.g = rect.bottom;
        } else {
            this.h = rect.right;
            this.g = rect.bottom;
            int i31 = 14 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:25:0x0107  */
    /* JADX WARN: Code duplicated, block: B:28:0x0147  */
    /* JADX WARN: Code duplicated, block: B:31:0x0157  */
    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int iPointToPosition;
        int i;
        View childAt;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 63;
        int i6 = (i5 - (~((i4 ^ 63) | i5))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            int i8 = a;
            int i9 = ((i8 ^ 49) - (~((i8 & 49) << 1))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            int i11 = a;
            int i12 = (i11 ^ 103) + ((i11 & 103) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 54 / 0;
            }
            return zOnHoverEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            int i14 = a + 115;
            b = i14 % 128;
            int i15 = i14 % 2;
            if (this.n == null) {
                aSa asa = new aSa();
                int i16 = a;
                int i17 = (i16 ^ 5) + ((i16 & 5) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                this.n = asa;
                post(asa);
                int i19 = a;
                int i20 = ((i19 ^ 100) + ((i19 & 100) << 1)) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        boolean zOnHoverEvent2 = super.onHoverEvent(motionEvent);
        if (actionMasked != 9) {
            int i22 = b;
            int i23 = (i22 ^ 121) + ((i22 & 121) << 1);
            int i24 = i23 % 128;
            a = i24;
            int i25 = i23 % 2;
            if (actionMasked != 7) {
                int i26 = i24 + 49;
                b = i26 % 128;
                int i27 = i26 % 2;
                setSelection(-1);
                int i28 = a;
                int i29 = i28 & 57;
                int i30 = i28 | 57;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
            } else {
                iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                int i33 = a;
                i = ((i33 | 73) << 1) - (i33 ^ 73);
                b = i % 128;
                if (i % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                    int i34 = a;
                    int i35 = (((i34 ^ 121) | (i34 & 121)) << 1) - (((~i34) & 121) | (i34 & (-122)));
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    int i37 = -getFirstVisiblePosition();
                    childAt = getChildAt((iPointToPosition ^ i37) + ((i37 & iPointToPosition) << 1));
                    if (childAt.isEnabled()) {
                        int i38 = b;
                        int i39 = (i38 & 95) + (i38 | 95);
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        int top = childAt.getTop();
                        int i41 = -getTop();
                        setSelectionFromTop(iPointToPosition, (top & i41) + (top | i41));
                        int i42 = a;
                        int i43 = i42 & 3;
                        int i44 = (((i42 ^ 3) | i43) << 1) - ((i42 | 3) & (~i43));
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    f();
                    int i46 = b;
                    i2 = (i46 & 55) + (i46 | 55);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i47 = 4 % 2;
                    }
                }
            }
        } else {
            iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int i310 = a;
            i = ((i310 | 73) << 1) - (i310 ^ 73);
            b = i % 128;
            if (i % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (iPointToPosition != -1) {
                int i311 = a;
                int i312 = (((i311 ^ 121) | (i311 & 121)) << 1) - (((~i311) & 121) | (i311 & (-122)));
                b = i312 % 128;
                int i313 = i312 % 2;
                int i314 = -getFirstVisiblePosition();
                childAt = getChildAt((iPointToPosition ^ i314) + ((i314 & iPointToPosition) << 1));
                if (childAt.isEnabled()) {
                    int i315 = b;
                    int i316 = (i315 & 95) + (i315 | 95);
                    a = i316 % 128;
                    int i48 = i316 % 2;
                    int top2 = childAt.getTop();
                    int i49 = -getTop();
                    setSelectionFromTop(iPointToPosition, (top2 & i49) + (top2 | i49));
                    int i410 = a;
                    int i411 = i410 & 3;
                    int i412 = (((i410 ^ 3) | i411) << 1) - ((i410 | 3) & (~i411));
                    b = i412 % 128;
                    int i413 = i412 % 2;
                }
                f();
                int i414 = b;
                i2 = (i414 & 55) + (i414 | 55);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i415 = 4 % 2;
                }
            }
        }
        int i50 = b;
        int i51 = i50 & 41;
        int i52 = i51 + ((i50 ^ 41) | i51);
        a = i52 % 128;
        int i53 = i52 % 2;
        return zOnHoverEvent2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0356 A[Catch: IllegalAccessException -> 0x03b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalAccessException -> 0x03b2, blocks: (B:86:0x0311, B:89:0x032d, B:91:0x0334, B:101:0x0356, B:105:0x0368, B:109:0x0399, B:97:0x033b), top: B:178:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x035a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0367  */
    /* JADX WARN: Code duplicated, block: B:108:0x0389  */
    /* JADX WARN: Code duplicated, block: B:111:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:152:0x0506  */
    /* JADX WARN: Code duplicated, block: B:154:0x051a A[PHI: r2
  0x051a: PHI (r2v15 android.view.View) = (r2v14 android.view.View), (r2v25 android.view.View) binds: [B:153:0x0518, B:150:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x0540  */
    /* JADX WARN: Code duplicated, block: B:159:0x0544  */
    /* JADX WARN: Code duplicated, block: B:161:0x055b  */
    /* JADX WARN: Code duplicated, block: B:163:0x056c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0570  */
    /* JADX WARN: Code duplicated, block: B:167:0x058b  */
    /* JADX WARN: Code duplicated, block: B:169:0x058f  */
    /* JADX WARN: Code duplicated, block: B:172:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:44:0x015b A[PHI: r3
  0x015b: PHI (r3v96 android.view.View) = (r3v95 android.view.View), (r3v102 android.view.View) binds: [B:43:0x0159, B:40:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0166  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x0341  */
    public boolean e(MotionEvent motionEvent, int i) {
        int actionMasked;
        boolean z;
        int i2;
        View childAt;
        P p;
        int i3;
        P p2;
        int i4;
        int i5;
        int y;
        int iPointToPosition;
        View childAt2;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        View childAt3;
        int i11;
        int i12;
        int i13;
        int i14 = 2 % 2;
        int i15 = b;
        int i16 = i15 & 1;
        int i17 = (i15 | 1) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 & i18) + (i17 | i18);
        a = i19 % 128;
        Object obj = null;
        boolean z5 = false;
        if (i19 % 2 != 0 ? (actionMasked = motionEvent.getActionMasked()) != 1 : (actionMasked = motionEvent.getActionMasked()) != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                int i20 = b + 73;
                a = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                int i22 = a;
                int i23 = (-2) - (((i22 & 6) + (i22 | 6)) ^ (-1));
                b = i23 % 128;
                int i24 = i23 % 2;
                z = false;
            }
            if (z) {
                int i25 = b;
                i5 = (-2) - ((-1) ^ ((i25 ^ 20) + ((i25 & 20) << 1)));
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (z5) {
                    this.m = false;
                    setPressed(false);
                    drawableStateChanged();
                    int i26 = b;
                    int i27 = i26 & 57;
                    int i28 = -(-((i26 ^ 57) | i27));
                    i2 = (i27 ^ i28) + ((i28 & i27) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i29 = this.i;
                        int i30 = -getFirstVisiblePosition();
                        int i31 = i29 ^ i30;
                        int i32 = (i29 & i30) << 1;
                        childAt = getChildAt(((i31 | i32) << 1) - (i32 ^ i31));
                        if (childAt != null) {
                            int i33 = a;
                            int i34 = ((i33 ^ 112) + ((i33 & 112) << 1)) - 1;
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            childAt.setPressed(false);
                            int i36 = a;
                            int i37 = i36 & 63;
                            int i38 = i37 + ((i36 ^ 63) | i37);
                            b = i38 % 128;
                            int i39 = i38 % 2;
                        }
                    } else {
                        int i40 = this.i;
                        int i41 = -getFirstVisiblePosition();
                        int i42 = i40 & i41;
                        int i43 = i40 | i41;
                        childAt = getChildAt((i42 & i43) + (i43 | i42));
                        if (childAt != null) {
                            int i310 = a;
                            int i311 = ((i310 ^ 112) + ((i310 & 112) << 1)) - 1;
                            b = i311 % 128;
                            int i312 = i311 % 2;
                            childAt.setPressed(false);
                            int i313 = a;
                            int i314 = i313 & 63;
                            int i315 = i314 + ((i313 ^ 63) | i314);
                            b = i315 % 128;
                            int i316 = i315 % 2;
                        }
                    }
                }
            } else {
                this.m = false;
                setPressed(false);
                drawableStateChanged();
                int i210 = b;
                int i211 = i210 & 57;
                int i212 = -(-((i210 ^ 57) | i211));
                i2 = (i211 ^ i212) + ((i212 & i211) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i213 = this.i;
                    int i317 = -getFirstVisiblePosition();
                    int i318 = i213 ^ i317;
                    int i319 = (i213 & i317) << 1;
                    childAt = getChildAt(((i318 | i319) << 1) - (i319 ^ i318));
                    if (childAt != null) {
                        int i3110 = a;
                        int i3111 = ((i3110 ^ 112) + ((i3110 & 112) << 1)) - 1;
                        b = i3111 % 128;
                        int i3112 = i3111 % 2;
                        childAt.setPressed(false);
                        int i3113 = a;
                        int i3114 = i3113 & 63;
                        int i3115 = i3114 + ((i3113 ^ 63) | i3114);
                        b = i3115 % 128;
                        int i3116 = i3115 % 2;
                    }
                } else {
                    int i44 = this.i;
                    int i45 = -getFirstVisiblePosition();
                    int i46 = i44 & i45;
                    int i47 = i44 | i45;
                    childAt = getChildAt((i46 & i47) + (i47 | i46));
                    if (childAt != null) {
                        int i3117 = a;
                        int i3118 = ((i3117 ^ 112) + ((i3117 & 112) << 1)) - 1;
                        b = i3118 % 128;
                        int i3119 = i3118 % 2;
                        childAt.setPressed(false);
                        int i31110 = a;
                        int i31111 = i31110 & 63;
                        int i31112 = i31111 + ((i31110 ^ 63) | i31111);
                        b = i31112 % 128;
                        int i31113 = i31112 % 2;
                    }
                }
            }
            if (!z) {
                p2 = this.f50o;
                if (p2 != null) {
                    int i48 = a;
                    int i49 = ((i48 & (-20)) | ((~i48) & 19)) + ((i48 & 19) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    if (p2.s) {
                        int i51 = b + 108;
                        i4 = (i51 ^ (-1)) + (i51 << 1);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            p2.f();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        p2.f();
                    }
                    p2.s = false;
                    int i52 = b;
                    int i53 = (i52 ^ 103) + ((i52 & 103) << 1);
                    a = i53 % 128;
                    int i54 = i53 % 2;
                }
            } else {
                if (this.f50o == null) {
                    this.f50o = new P(this);
                    int i55 = b + 57;
                    a = i55 % 128;
                    int i56 = i55 % 2;
                }
                p = this.f50o;
                boolean z6 = p.s;
                int i57 = b;
                i3 = (i57 ^ 103) + ((i57 & 103) << 1);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    p.s = false;
                } else {
                    p.s = true;
                }
                p.onTouch(this, motionEvent);
            }
            int i58 = a;
            int i59 = (i58 & 93) + (i58 | 93);
            b = i59 % 128;
            int i60 = i59 % 2;
            return z;
        }
        int i61 = a;
        int i62 = (((i61 | 108) << 1) - (i61 ^ 108)) - 1;
        b = i62 % 128;
        if (i62 % 2 != 0) {
            int i63 = 5 % 4;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            int i214 = a;
            int i215 = (-2) - (((i214 & 6) + (i214 | 6)) ^ (-1));
            b = i215 % 128;
            int i216 = i215 % 2;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int i64 = b;
            int i65 = ((i64 ^ 91) | (i64 & 91)) << 1;
            int i66 = -(((~i64) & 91) | (i64 & (-92)));
            int i67 = (i65 & i66) + (i66 | i65);
            a = i67 % 128;
            if (i67 % 2 == 0) {
                y = (int) motionEvent.getY(iFindPointerIndex);
                iPointToPosition = pointToPosition(x, y);
                int i68 = 85 / 0;
            } else {
                y = (int) motionEvent.getY(iFindPointerIndex);
                iPointToPosition = pointToPosition(x, y);
            }
            if (iPointToPosition != -1) {
                int i69 = b;
                int i70 = i69 & 57;
                int i71 = ((i69 | 57) & (~i70)) + (i70 << 1);
                a = i71 % 128;
                if (i71 % 2 == 0) {
                    childAt2 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                } else {
                    int i72 = -getFirstVisiblePosition();
                    childAt2 = getChildAt((((iPointToPosition | i72) << 1) - (~(-(((~iPointToPosition) & i72) | ((~i72) & iPointToPosition))))) - 1);
                }
                int i73 = a;
                int i74 = (i73 ^ 123) + ((i73 & 123) << 1);
                int i75 = i74 % 128;
                b = i75;
                int i76 = i74 % 2;
                float f = x;
                float f2 = y;
                this.m = true;
                int i77 = i75 & 15;
                int i78 = i75 | 15;
                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                a = i79 % 128;
                if (i79 % 2 == 0) {
                    drawableHotspotChanged(f, f2);
                    isPressed();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    int i80 = b;
                    int i81 = i80 & 7;
                    int i82 = i81 + ((i80 ^ 7) | i81);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    setPressed(true);
                }
                layoutChildren();
                int i84 = this.i;
                if (i84 != -1) {
                    int i85 = a;
                    int i86 = (((i85 & (-112)) | (111 & (~i85))) - (~(-(-((i85 & 111) << 1))))) - 1;
                    b = i86 % 128;
                    if (i86 % 2 != 0) {
                        int i87 = -(-getFirstVisiblePosition());
                        int i88 = i84 ^ i87;
                        int i89 = -(-((i84 & i87) << 1));
                        childAt3 = getChildAt((i88 & i89) + (i89 | i88));
                        if (childAt3 != null) {
                            i11 = a;
                            int i90 = i11 + 95;
                            b = i90 % 128;
                            int i91 = i90 % 2;
                            if (childAt3 != childAt2) {
                                i12 = ((i11 & 40) + (i11 | 40)) - 1;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    childAt3.isPressed();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (!(!childAt3.isPressed())) {
                                    int i92 = b;
                                    i13 = ((i92 ^ 78) + ((i92 & 78) << 1)) - 1;
                                    a = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        childAt3.setPressed(true);
                                    } else {
                                        childAt3.setPressed(false);
                                    }
                                }
                            }
                        }
                    } else {
                        int i93 = -getFirstVisiblePosition();
                        int i94 = i84 & i93;
                        childAt3 = getChildAt((i94 - (~(-(-((i84 ^ i93) | i94))))) - 1);
                        if (childAt3 != null) {
                            i11 = a;
                            int i95 = i11 + 95;
                            b = i95 % 128;
                            int i96 = i95 % 2;
                            if (childAt3 != childAt2) {
                                i12 = ((i11 & 40) + (i11 | 40)) - 1;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    childAt3.isPressed();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (!(!childAt3.isPressed())) {
                                    int i97 = b;
                                    i13 = ((i97 ^ 78) + ((i97 & 78) << 1)) - 1;
                                    a = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        childAt3.setPressed(true);
                                    } else {
                                        childAt3.setPressed(false);
                                    }
                                }
                            }
                        }
                    }
                }
                this.i = iPointToPosition;
                float left = childAt2.getLeft();
                int i98 = b;
                int i99 = i98 & 101;
                int i100 = ((i98 ^ 101) | i99) << 1;
                int i101 = -((i98 | 101) & (~i99));
                int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                a = i102 % 128;
                int i103 = i102 % 2;
                float top = childAt2.getTop();
                int i104 = b + 73;
                a = i104 % 128;
                int i105 = i104 % 2;
                childAt2.drawableHotspotChanged(f - left, f2 - top);
                if (!childAt2.isPressed()) {
                    int i106 = b;
                    int i107 = i106 & 45;
                    int i108 = (i106 | 45) & (~i107);
                    int i109 = i107 << 1;
                    int i110 = (i108 & i109) + (i108 | i109);
                    a = i110 % 128;
                    int i111 = i110 % 2;
                    childAt2.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null) {
                    int i112 = a;
                    int i113 = i112 & 91;
                    int i114 = (i112 ^ 91) | i113;
                    int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                    int i116 = i115 % 128;
                    b = i116;
                    int i117 = i115 % 2;
                    if (iPointToPosition != -1) {
                        int i118 = ((i116 & 96) + (i116 | 96)) - 1;
                        a = i118 % 128;
                        if (i118 % 2 != 0) {
                            z2 = true;
                        }
                    } else {
                        int i119 = b;
                        int i120 = (i119 & 113) + (i119 | 113);
                        a = i120 % 128;
                        int i121 = i120 % 2;
                    }
                    z2 = false;
                } else {
                    int i1110 = b;
                    int i122 = (i1110 & 113) + (i1110 | 113);
                    a = i122 % 128;
                    int i123 = i122 % 2;
                    z2 = false;
                }
                if (z2) {
                    int i124 = b;
                    int i125 = (i124 | 101) << 1;
                    int i126 = -(i124 ^ 101);
                    int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                    a = i127 % 128;
                    if (i127 % 2 == 0) {
                        selector.setVisible(true, true);
                    } else {
                        selector.setVisible(false, false);
                    }
                    int i128 = b;
                    int i129 = ((((~i128) & 71) | (i128 & (-72))) - (~((i128 & 71) << 1))) - 1;
                    a = i129 % 128;
                    int i130 = i129 % 2;
                }
                Rect rect = this.d;
                int left2 = childAt2.getLeft();
                int top2 = childAt2.getTop();
                int right = childAt2.getRight();
                int bottom = childAt2.getBottom();
                int i131 = a;
                int i132 = i131 ^ 125;
                int i133 = -(-((i131 & 125) << 1));
                int i134 = ((i132 | i133) << 1) - (i132 ^ i133);
                b = i134 % 128;
                if (i134 % 2 != 0) {
                    rect.set(left2, top2, right, bottom);
                    i6 = rect.left;
                    i7 = this.e;
                    int i135 = 87 / 0;
                } else {
                    rect.set(left2, top2, right, bottom);
                    i6 = rect.left;
                    i7 = this.e;
                }
                int i136 = a;
                int i137 = i136 & 103;
                int i138 = (((i136 | 103) & (~i137)) - (~(-(-(i137 << 1))))) - 1;
                b = i138 % 128;
                int i139 = i138 % 2;
                int i140 = -i7;
                rect.left = (((i6 ^ i140) | (i6 & i140)) << 1) - (((~i6) & i140) | ((~i140) & i6));
                int i141 = rect.top;
                int i142 = this.f;
                int i143 = a;
                int i144 = (i143 | 27) << 1;
                int i145 = -(((~i143) & 27) | (i143 & (-28)));
                int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                b = i146 % 128;
                if (i146 % 2 != 0) {
                    int i147 = -i142;
                    int i148 = ((i141 ^ i147) | (i141 & i147)) << 1;
                    int i149 = -(((~i141) & i147) | ((~i147) & i141));
                    rect.top = ((i148 | i149) << 1) - (i149 ^ i148);
                } else {
                    int i150 = i141 - (~(-i142));
                    rect.top = (i150 ^ (-1)) + (i150 << 1);
                }
                int i151 = rect.right;
                int i152 = this.h;
                int i153 = i151 & i152;
                rect.right = i153 + ((i151 ^ i152) | i153);
                int i154 = rect.bottom;
                int i155 = this.g;
                int i156 = ((~i155) & i154) | ((~i154) & i155);
                int i157 = (i154 & i155) << 1;
                rect.bottom = (i156 ^ i157) + ((i157 & i156) << 1);
                try {
                    boolean z7 = this.j.getBoolean(this);
                    int i158 = a;
                    int i159 = i158 & 23;
                    int i160 = (((i158 ^ 23) | i159) << 1) - ((i158 | 23) & (~i159));
                    b = i160 % 128;
                    if (i160 % 2 != 0) {
                        int i161 = 39 / 0;
                        if (childAt2.isEnabled() != z7) {
                            int i162 = b;
                            i8 = (-2) - (((i162 ^ 98) + ((i162 & 98) << 1)) ^ (-1));
                            i9 = i8 % 128;
                            a = i9;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                            Field field = this.j;
                            if (z7) {
                                z4 = false;
                            } else {
                                int i163 = (i9 & 41) + (i9 | 41);
                                b = i163 % 128;
                                int i164 = i163 % 2;
                                z4 = true;
                            }
                            field.set(this, Boolean.valueOf(z4));
                            int i165 = b;
                            int i166 = i165 & 57;
                            int i167 = ((((i165 ^ 57) | i166) << 1) - (~(-((i165 | 57) & (~i166))))) - 1;
                            i10 = i167 % 128;
                            a = i10;
                            int i168 = i167 % 2;
                            if (iPointToPosition != -1) {
                                int i169 = (-2) - ((((i10 | 86) << 1) - (i10 ^ 86)) ^ (-1));
                                b = i169 % 128;
                                int i170 = i169 % 2;
                                refreshDrawableState();
                                int i171 = a;
                                int i172 = i171 ^ 95;
                                int i173 = ((((i171 & 95) | i172) << 1) - (~(-i172))) - 1;
                                b = i173 % 128;
                                int i174 = i173 % 2;
                            }
                        }
                    } else if (childAt2.isEnabled() != z7) {
                        int i1610 = b;
                        i8 = (-2) - (((i1610 ^ 98) + ((i1610 & 98) << 1)) ^ (-1));
                        i9 = i8 % 128;
                        a = i9;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        Field field2 = this.j;
                        if (z7) {
                            int i1611 = (i9 & 41) + (i9 | 41);
                            b = i1611 % 128;
                            int i1612 = i1611 % 2;
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        field2.set(this, Boolean.valueOf(z4));
                        int i1613 = b;
                        int i1614 = i1613 & 57;
                        int i1615 = ((((i1613 ^ 57) | i1614) << 1) - (~(-((i1613 | 57) & (~i1614))))) - 1;
                        i10 = i1615 % 128;
                        a = i10;
                        int i1616 = i1615 % 2;
                        if (iPointToPosition != -1) {
                            int i1617 = (-2) - ((((i10 | 86) << 1) - (i10 ^ 86)) ^ (-1));
                            b = i1617 % 128;
                            int i175 = i1617 % 2;
                            refreshDrawableState();
                            int i176 = a;
                            int i177 = i176 ^ 95;
                            int i178 = ((((i176 & 95) | i177) << 1) - (~(-i177))) - 1;
                            b = i178 % 128;
                            int i179 = i178 % 2;
                        }
                    }
                } catch (IllegalAccessException unused) {
                }
                if (z2) {
                    int i180 = b;
                    int i181 = ((i180 ^ 84) + ((i180 & 84) << 1)) - 1;
                    a = i181 % 128;
                    int i182 = i181 % 2;
                    Rect rect2 = this.d;
                    float fExactCenterX = rect2.exactCenterX();
                    int i183 = b;
                    int i184 = ((i183 ^ 5) - (~((i183 & 5) << 1))) - 1;
                    a = i184 % 128;
                    int i185 = i184 % 2;
                    float fExactCenterY = rect2.exactCenterY();
                    if (getVisibility() == 0) {
                        int i186 = a;
                        int i187 = ((i186 & 109) - (~(i186 | 109))) - 1;
                        b = i187 % 128;
                        int i188 = i187 % 2;
                        z3 = true;
                    } else {
                        int i189 = a;
                        int i190 = i189 ^ 83;
                        int i191 = (i189 & 83) << 1;
                        int i192 = (i190 & i191) + (i191 | i190);
                        b = i192 % 128;
                        int i193 = i192 % 2;
                        z3 = false;
                    }
                    selector.setVisible(z3, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                    int i194 = b;
                    int i195 = (i194 & 59) + (i194 | 59);
                    a = i195 % 128;
                    int i196 = i195 % 2;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null) {
                    int i197 = b;
                    int i198 = ((((i197 ^ 65) | (i197 & 65)) << 1) - (~(-(((~i197) & 65) | (i197 & (-66)))))) - 1;
                    a = i198 % 128;
                    if (i198 % 2 == 0) {
                        throw null;
                    }
                    if (iPointToPosition != -1) {
                        selector2.setHotspot(f, f2);
                        int i199 = b;
                        int i200 = i199 & 117;
                        int i201 = (i199 ^ 117) | i200;
                        int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
                        a = i202 % 128;
                        int i203 = i202 % 2;
                    }
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    int i204 = b + 65;
                    a = i204 % 128;
                    if (i204 % 2 == 0) {
                        getItemIdAtPosition(iPointToPosition);
                        throw null;
                    }
                    performItemClick(childAt2, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                    int i205 = b;
                    int i206 = (i205 & (-76)) | ((~i205) & 75);
                    int i207 = (i205 & 75) << 1;
                    int i208 = ((i206 | i207) << 1) - (i207 ^ i206);
                    a = i208 % 128;
                    int i209 = i208 % 2;
                }
                int i217 = b + 47;
                a = i217 % 128;
                int i218 = i217 % 2;
                z5 = false;
                z = true;
            } else {
                z5 = true;
            }
        }
        if (z) {
            int i219 = b;
            i5 = (-2) - ((-1) ^ ((i219 ^ 20) + ((i219 & 20) << 1)));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            if (z5) {
                this.m = false;
                setPressed(false);
                drawableStateChanged();
                int i2110 = b;
                int i2111 = i2110 & 57;
                int i2112 = -(-((i2110 ^ 57) | i2111));
                i2 = (i2111 ^ i2112) + ((i2112 & i2111) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i2113 = this.i;
                    int i3120 = -getFirstVisiblePosition();
                    int i3121 = i2113 ^ i3120;
                    int i3122 = (i2113 & i3120) << 1;
                    childAt = getChildAt(((i3121 | i3122) << 1) - (i3122 ^ i3121));
                    if (childAt != null) {
                        int i31114 = a;
                        int i31115 = ((i31114 ^ 112) + ((i31114 & 112) << 1)) - 1;
                        b = i31115 % 128;
                        int i31116 = i31115 % 2;
                        childAt.setPressed(false);
                        int i31117 = a;
                        int i31118 = i31117 & 63;
                        int i31119 = i31118 + ((i31117 ^ 63) | i31118);
                        b = i31119 % 128;
                        int i311110 = i31119 % 2;
                    }
                } else {
                    int i410 = this.i;
                    int i411 = -getFirstVisiblePosition();
                    int i412 = i410 & i411;
                    int i413 = i410 | i411;
                    childAt = getChildAt((i412 & i413) + (i413 | i412));
                    if (childAt != null) {
                        int i311111 = a;
                        int i311112 = ((i311111 ^ 112) + ((i311111 & 112) << 1)) - 1;
                        b = i311112 % 128;
                        int i311113 = i311112 % 2;
                        childAt.setPressed(false);
                        int i311114 = a;
                        int i311115 = i311114 & 63;
                        int i311116 = i311115 + ((i311114 ^ 63) | i311115);
                        b = i311116 % 128;
                        int i311117 = i311116 % 2;
                    }
                }
            }
        } else {
            this.m = false;
            setPressed(false);
            drawableStateChanged();
            int i2114 = b;
            int i2115 = i2114 & 57;
            int i2116 = -(-((i2114 ^ 57) | i2115));
            i2 = (i2115 ^ i2116) + ((i2116 & i2115) << 1);
            a = i2 % 128;
            if (i2 % 2 == 0) {
                int i2117 = this.i;
                int i3123 = -getFirstVisiblePosition();
                int i3124 = i2117 ^ i3123;
                int i3125 = (i2117 & i3123) << 1;
                childAt = getChildAt(((i3124 | i3125) << 1) - (i3125 ^ i3124));
                if (childAt != null) {
                    int i311118 = a;
                    int i311119 = ((i311118 ^ 112) + ((i311118 & 112) << 1)) - 1;
                    b = i311119 % 128;
                    int i3111110 = i311119 % 2;
                    childAt.setPressed(false);
                    int i3111111 = a;
                    int i3111112 = i3111111 & 63;
                    int i3111113 = i3111112 + ((i3111111 ^ 63) | i3111112);
                    b = i3111113 % 128;
                    int i3111114 = i3111113 % 2;
                }
            } else {
                int i414 = this.i;
                int i415 = -getFirstVisiblePosition();
                int i416 = i414 & i415;
                int i417 = i414 | i415;
                childAt = getChildAt((i416 & i417) + (i417 | i416));
                if (childAt != null) {
                    int i3111115 = a;
                    int i3111116 = ((i3111115 ^ 112) + ((i3111115 & 112) << 1)) - 1;
                    b = i3111116 % 128;
                    int i3111117 = i3111116 % 2;
                    childAt.setPressed(false);
                    int i3111118 = a;
                    int i3111119 = i3111118 & 63;
                    int i31111110 = i3111119 + ((i3111118 ^ 63) | i3111119);
                    b = i31111110 % 128;
                    int i31111111 = i31111110 % 2;
                }
            }
        }
        if (!z) {
            p2 = this.f50o;
            if (p2 != null) {
                int i418 = a;
                int i419 = ((i418 & (-20)) | ((~i418) & 19)) + ((i418 & 19) << 1);
                b = i419 % 128;
                int i510 = i419 % 2;
                if (p2.s) {
                    int i511 = b + 108;
                    i4 = (i511 ^ (-1)) + (i511 << 1);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        p2.f();
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    p2.f();
                }
                p2.s = false;
                int i512 = b;
                int i513 = (i512 ^ 103) + ((i512 & 103) << 1);
                a = i513 % 128;
                int i514 = i513 % 2;
            }
        } else {
            if (this.f50o == null) {
                this.f50o = new P(this);
                int i515 = b + 57;
                a = i515 % 128;
                int i516 = i515 % 2;
            }
            p = this.f50o;
            boolean z8 = p.s;
            int i517 = b;
            i3 = (i517 ^ 103) + ((i517 & 103) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                p.s = false;
            } else {
                p.s = true;
            }
            p.onTouch(this, motionEvent);
        }
        int i518 = a;
        int i519 = (i518 & 93) + (i518 | 93);
        b = i519 % 128;
        int i610 = i519 % 2;
        return z;
    }
}
