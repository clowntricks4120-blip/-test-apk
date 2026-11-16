package ivas.gov.bisp.enumeration.cZ;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p002ab.Q;
import ivas.gov.bisp.enumeration.p008ah.j;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class h extends i implements Animatable {
    private static int a = 0;
    private static int b = 1;
    public bIe d;
    public Context e;
    public final Drawable.Callback f;
    public ArgbEvaluator g;

    public class bId implements Drawable.Callback {
        private static int a = 1;
        private static int b;

        public bId() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 1) | (i2 & 1)) << 1;
            int i4 = -(((~i2) & 1) | (i2 & (-2)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            h.this.invalidateSelf();
            int i7 = b;
            int i8 = i7 & 29;
            int i9 = (i8 - (~((i7 ^ 29) | i8))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 97;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 97)) & i3);
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                h.this.scheduleSelf(runnable, j);
                throw null;
            }
            h.this.scheduleSelf(runnable, j);
            int i7 = a;
            int i8 = (i7 & (-20)) | ((~i7) & 19);
            int i9 = -(-((i7 & 19) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 23;
            int i4 = (((i2 | 23) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            h.this.unscheduleSelf(runnable);
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class bIe extends Drawable.ConstantState {
        private static int a = 0;
        private static int b = 1;
        public int c;
        public p d;
        public AnimatorSet e;
        public ArrayList<Animator> f;
        public OooO0o<Animator, String> g;

        public bIe(bIe bie, Drawable.Callback callback, Resources resources) {
            Object orDefault;
            if (bie != null) {
                this.c = bie.c;
                p pVar = bie.d;
                int i = a;
                int i2 = ((i | 119) << 1) - (i ^ 119);
                b = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                if (pVar != null) {
                    int i4 = i & 31;
                    int i5 = (((i ^ 31) | i4) << 1) - ((i | 31) & (~i4));
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    Drawable.ConstantState constantState = pVar.getConstantState();
                    if (resources != null) {
                        int i7 = a;
                        int i8 = i7 & 123;
                        int i9 = (((i7 | 123) & (~i8)) - (~(i8 << 1))) - 1;
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            this.d = (p) constantState.newDrawable(resources);
                            int i10 = 43 / 0;
                        } else {
                            this.d = (p) constantState.newDrawable(resources);
                        }
                        int i11 = a;
                        int i12 = ((i11 | 103) << 1) - (i11 ^ 103);
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = 2 % 2;
                    } else {
                        this.d = (p) constantState.newDrawable();
                        int i15 = a;
                        int i16 = (i15 ^ 99) + ((i15 & 99) << 1);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = 2 % 2;
                    }
                    p pVar2 = this.d;
                    pVar2.mutate();
                    this.d = pVar2;
                    int i19 = a;
                    int i20 = (i19 & 35) + (i19 | 35);
                    b = i20 % 128;
                    if (i20 % 2 == 0) {
                        pVar2.setCallback(callback);
                        bie.d.getBounds();
                        throw null;
                    }
                    pVar2.setCallback(callback);
                    this.d.setBounds(bie.d.getBounds());
                    this.d.j = false;
                    int i21 = a;
                    int i22 = ((i21 | 81) << 1) - (i21 ^ 81);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 2 % 2;
                }
                ArrayList<Animator> arrayList = bie.f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f = new ArrayList<>(size);
                    ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r(size);
                    int i25 = a;
                    int i26 = i25 + 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    this.g = rVar;
                    int i28 = (-2) - (((i25 ^ 96) + ((i25 & 96) << 1)) ^ (-1));
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = 2 % 2;
                    int i31 = 0;
                    while (i31 < size) {
                        int i32 = a;
                        int i33 = i32 ^ 59;
                        int i34 = -(-((i32 & 59) << 1));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        Animator animator = bie.f.get(i31);
                        int i37 = b + 9;
                        a = i37 % 128;
                        if (i37 % 2 != 0) {
                            animator.clone();
                            OooO0o<Animator, String> oooO0o = bie.g;
                            obj.hashCode();
                            throw null;
                        }
                        Animator animatorClone = animator.clone();
                        String str = (String) bie.g.getOrDefault(animator, null);
                        p.bIr bir = this.d.f;
                        int i38 = b;
                        int i39 = i38 & 57;
                        int i40 = (i38 | 57) & (~i39);
                        int i41 = -(-(i39 << 1));
                        int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                        a = i42 % 128;
                        if (i42 % 2 != 0) {
                            orDefault = bir.e.s.getOrDefault(str, null);
                            int i43 = 32 / 0;
                        } else {
                            orDefault = bir.e.s.getOrDefault(str, null);
                        }
                        int i44 = b;
                        int i45 = ((((i44 ^ 115) | (i44 & 115)) << 1) - (~(-(((~i44) & 115) | (i44 & (-116)))))) - 1;
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        animatorClone.setTarget(orDefault);
                        this.f.add(animatorClone);
                        int i47 = a;
                        int i48 = i47 ^ 41;
                        int i49 = ((i47 & 41) | i48) << 1;
                        int i50 = -i48;
                        int i51 = (i49 & i50) + (i49 | i50);
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        this.g.put(animatorClone, str);
                        int i53 = (i31 & 94) + (i31 | 94);
                        i31 = (i53 ^ (-93)) + ((i53 & (-93)) << 1);
                        int i54 = b;
                        int i55 = i54 ^ 83;
                        int i56 = (i54 & 83) << 1;
                        int i57 = (i55 & i56) + (i56 | i55);
                        a = i57 % 128;
                        if (i57 % 2 != 0) {
                            int i58 = 3 / 3;
                        }
                    }
                    if (this.e == null) {
                        this.e = new AnimatorSet();
                        int i59 = b;
                        int i60 = (i59 & 43) + (i59 | 43);
                        a = i60 % 128;
                        int i61 = i60 % 2;
                    }
                    this.e.playTogether(this.f);
                    int i62 = b;
                    int i63 = i62 | 75;
                    int i64 = (i63 << 1) - ((~(i62 & 75)) & i63);
                    a = i64 % 128;
                    int i65 = i64 % 2;
                }
            }
            int i66 = b;
            int i67 = ((((i66 ^ 35) | (i66 & 35)) << 1) - (~(-(((~i66) & 35) | (i66 & (-36)))))) - 1;
            a = i67 % 128;
            if (i67 % 2 != 0) {
                int i68 = 99 / 0;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 113;
            int i4 = (i3 << 1) - ((~(i2 & 113)) & i3);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                return this.c;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public h() {
        this(null, null, null);
    }

    @Override // ivas.gov.bisp.enumeration.cZ.i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = -(-((i2 ^ 81) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i7 = a;
            int i8 = ((i7 ^ 33) | (i7 & 33)) << 1;
            int i9 = -(((~i7) & 33) | (i7 & (-34)));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                drawable.applyTheme(theme);
                throw null;
            }
            drawable.applyTheme(theme);
        }
        int i11 = a;
        int i12 = ((i11 & 52) + (i11 | 52)) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 12 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-96)) | ((~i2) & 95)) + ((i2 & 95) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int i5 = b;
            int i6 = (i5 ^ 52) + ((i5 & 52) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i8 = b;
        int i9 = (i8 & (-92)) | ((~i8) & 91);
        int i10 = (i8 & 91) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        boolean zCanApplyTheme = drawable.canApplyTheme();
        int i13 = b;
        int i14 = i13 & 15;
        int i15 = i14 + ((i13 ^ 15) | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
        return zCanApplyTheme;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.c != null) {
            int i5 = a;
            int i6 = (i5 ^ 3) + ((i5 & 3) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0 ? Build.VERSION.SDK_INT >= 24 : Build.VERSION.SDK_INT >= 65) {
                bIf bif = new bIf(this.c.getConstantState());
                int i7 = b;
                int i8 = i7 | 103;
                int i9 = (i8 << 1) - ((~(i7 & 103)) & i8);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 21 / 0;
                }
                return bif;
            }
        }
        int i11 = b;
        int i12 = ((i11 & 123) - (~(i11 | 123))) - 1;
        a = i12 % 128;
        Object obj = null;
        if (i12 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 97) + (i2 | 97);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int intrinsicHeight = this.d.d.getIntrinsicHeight();
            int i5 = (-2) - ((a + 96) ^ (-1));
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 95 / 0;
            }
            return intrinsicHeight;
        }
        int i7 = a;
        int i8 = i7 & 107;
        int i9 = -(-((i7 ^ 107) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int intrinsicHeight2 = drawable.getIntrinsicHeight();
        int i12 = b;
        int i13 = (i12 & (-4)) | ((~i12) & 3);
        int i14 = -(-((i12 & 3) << 1));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        return intrinsicHeight2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        r1 = r5.d.d.isAutoMirrored();
        r2 = ivas.gov.bisp.enumeration.cZ.h.a + 101;
        ivas.gov.bisp.enumeration.cZ.h.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cZ.h.b;
        r3 = (r2 & 126) + (r2 | 126);
        r2 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.cZ.h.a = r2 % 128;
        r2 = r2 % 2;
        r1 = r1.isAutoMirrored();
        r2 = ivas.gov.bisp.enumeration.cZ.h.b;
        r4 = r2 & 85;
        r3 = ((((r2 ^ 85) | r4) << 1) - (~(-((r2 | 85) & (~r4))))) - 1;
        ivas.gov.bisp.enumeration.cZ.h.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        return r1;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAutoMirrored() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            int r1 = r1 + 112
            r2 = r1 ^ (-1)
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r1
            int r2 = r2 % r0
            android.graphics.drawable.Drawable r1 = r5.c
            if (r2 == 0) goto L1c
            r2 = 11
            int r2 = r2 / 0
            if (r1 == 0) goto L4b
            goto L1e
        L1c:
            if (r1 == 0) goto L4b
        L1e:
            int r2 = ivas.gov.bisp.enumeration.cZ.h.b
            r3 = r2 & 126(0x7e, float:1.77E-43)
            r2 = r2 | 126(0x7e, float:1.77E-43)
            int r3 = r3 + r2
            r2 = r3 ^ (-1)
            int r3 = r3 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r3
            int r2 = r2 % r0
            boolean r1 = r1.isAutoMirrored()
            int r2 = ivas.gov.bisp.enumeration.cZ.h.b
            r3 = r2 ^ 85
            r4 = r2 & 85
            r3 = r3 | r4
            int r3 = r3 << 1
            int r4 = ~r4
            r2 = r2 | 85
            r2 = r2 & r4
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r2
            int r3 = r3 % r0
            return r1
        L4b:
            ivas.gov.bisp.enumeration.cZ.h$bIe r1 = r5.d
            ivas.gov.bisp.enumeration.cZ.p r1 = r1.d
            boolean r1 = r1.isAutoMirrored()
            int r2 = ivas.gov.bisp.enumeration.cZ.h.a
            int r2 = r2 + 101
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.isAutoMirrored():boolean");
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            boolean zIsRunning = this.d.e.isRunning();
            int i5 = b + 89;
            a = i5 % 128;
            int i6 = i5 % 2;
            return zIsRunning;
        }
        int i7 = b + 124;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        boolean zIsRunning2 = ((AnimatedVectorDrawable) drawable).isRunning();
        int i10 = a;
        int i11 = ((i10 | 123) << 1) - (i10 ^ 123);
        b = i11 % 128;
        int i12 = i11 % 2;
        return zIsRunning2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = i3 + ((i2 ^ 83) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Drawable drawable = this.c;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.mutate();
            int i5 = b;
            int i6 = (i5 & 117) + (i5 | 117);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b;
        int i9 = (i8 & 15) + (i8 | 15);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 0 / 0;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 52) + ((i2 & 52) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        Object obj = null;
        if (drawable == null) {
            this.d.d.setBounds(rect);
            int i5 = a + 23;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i6 = a + 107;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            drawable.setBounds(rect);
            obj.hashCode();
            throw null;
        }
        drawable.setBounds(rect);
        int i7 = a + 9;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r6 = r5.d.d.setLevel(r6);
        r1 = ivas.gov.bisp.enumeration.cZ.h.b;
        r2 = (r1 & (-108)) | ((~r1) & 107);
        r1 = (r1 & 107) << 1;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.cZ.h.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r6 = r1.setLevel(r6);
        r1 = ivas.gov.bisp.enumeration.cZ.h.a;
        r2 = ((((r1 ^ 69) | (r1 & 69)) << 1) - (~(-(((~r1) & 69) | (r1 & (-70)))))) - 1;
        ivas.gov.bisp.enumeration.cZ.h.b = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // ivas.gov.bisp.enumeration.cZ.i, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onLevelChange(int r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r1 ^ 69
            r1 = r1 & 69
            r1 = r1 | r2
            int r1 = r1 << 1
            int r1 = r1 - r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r5.c
            r2 = 75
            int r2 = r2 / 0
            if (r1 == 0) goto L3f
            goto L21
        L1d:
            android.graphics.drawable.Drawable r1 = r5.c
            if (r1 == 0) goto L3f
        L21:
            boolean r6 = r1.setLevel(r6)
            int r1 = ivas.gov.bisp.enumeration.cZ.h.a
            r2 = r1 ^ 69
            r3 = r1 & 69
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-70)
            int r1 = ~r1
            r1 = r1 & 69
            r1 = r1 | r3
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r1
            int r2 = r2 % r0
            return r6
        L3f:
            ivas.gov.bisp.enumeration.cZ.h$bIe r1 = r5.d
            ivas.gov.bisp.enumeration.cZ.p r1 = r1.d
            boolean r6 = r1.setLevel(r6)
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r1 & (-108(0xffffffffffffff94, float:NaN))
            int r3 = ~r1
            r4 = 107(0x6b, float:1.5E-43)
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r1
            int r3 = r3 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.onLevelChange(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r4 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r3.d.d.setAlpha(r4);
        r4 = ivas.gov.bisp.enumeration.cZ.h.b;
        r1 = r4 & 41;
        r4 = (r4 | 41) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r4 & r1) + (r4 | r1);
        ivas.gov.bisp.enumeration.cZ.h.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r1.setAlpha(r4);
        r4 = ivas.gov.bisp.enumeration.cZ.h.a + 58;
        r1 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.cZ.h.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAlpha(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r1 | 97
            int r2 = r2 << 1
            r1 = r1 ^ 97
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r1
            int r2 = r2 % r0
            android.graphics.drawable.Drawable r1 = r3.c
            if (r2 == 0) goto L1c
            r2 = 65
            int r2 = r2 / 0
            if (r1 == 0) goto L35
            goto L1e
        L1c:
            if (r1 == 0) goto L35
        L1e:
            r1.setAlpha(r4)
            int r4 = ivas.gov.bisp.enumeration.cZ.h.a
            int r4 = r4 + 58
            r1 = r4 ^ (-1)
            int r4 = r4 << 1
            int r1 = r1 + r4
            int r4 = r1 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L34
            r4 = 6
            int r4 = r4 / 0
        L34:
            return
        L35:
            ivas.gov.bisp.enumeration.cZ.h$bIe r1 = r3.d
            ivas.gov.bisp.enumeration.cZ.p r1 = r1.d
            r1.setAlpha(r4)
            int r4 = ivas.gov.bisp.enumeration.cZ.h.b
            r1 = r4 & 41
            int r2 = ~r1
            r4 = r4 | 41
            r4 = r4 & r2
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            r2 = r4 & r1
            r4 = r4 | r1
            int r2 = r2 + r4
            int r4 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r4
            int r2 = r2 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.setAlpha(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r5.d.d.setTint(r6);
        r6 = ivas.gov.bisp.enumeration.cZ.h.a;
        r2 = r6 ^ 11;
        r6 = (((r6 & 11) | r2) << 1) - r2;
        ivas.gov.bisp.enumeration.cZ.h.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if ((r6 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r3 = ivas.gov.bisp.enumeration.cZ.h.b + 93;
        ivas.gov.bisp.enumeration.cZ.h.a = r3 % 128;
        r3 = r3 % 2;
        ivas.gov.bisp.enumeration.p008ah.j.b(r2, r6);
        r6 = ivas.gov.bisp.enumeration.cZ.h.b;
        r2 = ((r6 | 6) << 1) - (r6 ^ 6);
        r6 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.cZ.h.a = r6 % 128;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTint(int r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.a
            r2 = r1 | 13
            int r2 = r2 << 1
            r1 = r1 ^ 13
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 != 0) goto L1d
            android.graphics.drawable.Drawable r2 = r5.c
            r3 = 31
            int r3 = r3 / 0
            if (r2 == 0) goto L44
            goto L21
        L1d:
            android.graphics.drawable.Drawable r2 = r5.c
            if (r2 == 0) goto L44
        L21:
            int r3 = ivas.gov.bisp.enumeration.cZ.h.b
            int r3 = r3 + 93
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r4
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.p008ah.j.b(r2, r6)
            int r6 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r6 | 6
            int r2 = r2 << 1
            r6 = r6 ^ 6
            int r2 = r2 - r6
            r6 = r2 ^ (-1)
            int r2 = r2 << 1
            int r6 = r6 + r2
            int r2 = r6 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r2
            int r6 = r6 % r0
            if (r6 != 0) goto L43
            return
        L43:
            throw r1
        L44:
            ivas.gov.bisp.enumeration.cZ.h$bIe r2 = r5.d
            ivas.gov.bisp.enumeration.cZ.p r2 = r2.d
            r2.setTint(r6)
            int r6 = ivas.gov.bisp.enumeration.cZ.h.a
            r2 = r6 ^ 11
            r6 = r6 & 11
            r6 = r6 | r2
            int r6 = r6 << 1
            int r6 = r6 - r2
            int r2 = r6 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r2
            int r6 = r6 % r0
            if (r6 == 0) goto L5d
            return
        L5d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.setTint(int):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b + 91;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            this.d.d.setTintMode(mode);
            int i3 = a;
            int i4 = ((i3 & (-2)) | ((~i3) & 1)) + ((i3 & 1) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i5 = b;
        int i6 = (-2) - (((i5 & 42) + (i5 | 42)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
        j.d(drawable2, mode);
        int i8 = b;
        int i9 = i8 & 103;
        int i10 = ((i8 ^ 103) | i9) << 1;
        int i11 = -((i8 | 103) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 47 / 0;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 5) + (i2 | 5);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            ((AnimatedVectorDrawable) drawable2).start();
            int i4 = a;
            int i5 = ((i4 ^ 7) | (i4 & 7)) << 1;
            int i6 = -(((~i4) & 7) | (i4 & (-8)));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (this.d.e.isStarted()) {
            int i9 = a;
            int i10 = ((i9 & 52) + (i9 | 52)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 40 / 0;
                return;
            }
            return;
        }
        this.d.e.start();
        invalidateSelf();
        int i12 = b;
        int i13 = (i12 & (-100)) | ((~i12) & 99);
        int i14 = (i12 & 99) << 1;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-28)) | ((~i2) & 27)) + ((i2 & 27) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            this.d.e.end();
            int i5 = a;
            int i6 = (i5 & 21) + (i5 | 21);
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = b;
        int i9 = i8 & 67;
        int i10 = (i9 - (~((i8 ^ 67) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        ((AnimatedVectorDrawable) drawable).stop();
        int i12 = a;
        int i13 = i12 & 79;
        int i14 = ((i12 ^ 79) | i13) << 1;
        int i15 = -((i12 | 79) & (~i13));
        int i16 = (i14 & i15) + (i15 | i14);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public static class bIf extends Drawable.ConstantState {
        private static int a = 0;
        private static int b = 1;
        public final Drawable.ConstantState c;

        public bIf(Drawable.ConstantState constantState) {
            this.c = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = 2 % 2;
            int i2 = a + 5;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zCanApplyTheme = this.c.canApplyTheme();
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return zCanApplyTheme;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = 2 % 2;
            int i2 = b + 117;
            a = i2 % 128;
            int i3 = i2 % 2;
            int changingConfigurations = this.c.getChangingConfigurations();
            int i4 = b;
            int i5 = (i4 ^ 93) + ((i4 & 93) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
            return changingConfigurations;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            Object obj = null;
            h hVar = new h(null, null, null);
            int i2 = a;
            int i3 = i2 & 39;
            int i4 = (((i2 ^ 39) | i3) << 1) - ((i2 | 39) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            Drawable drawableNewDrawable = this.c.newDrawable();
            hVar.c = drawableNewDrawable;
            int i6 = a + 33;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                drawableNewDrawable.setCallback(hVar.f);
                obj.hashCode();
                throw null;
            }
            drawableNewDrawable.setCallback(hVar.f);
            int i7 = b;
            int i8 = i7 & 103;
            int i9 = ((i7 ^ 103) | i8) << 1;
            int i10 = -((i7 | 103) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return hVar;
            }
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            Drawable drawableNewDrawable;
            int i = 2 % 2;
            h hVar = new h(null, null, null);
            int i2 = a;
            int i3 = (-2) - ((((i2 | 68) << 1) - (i2 ^ 68)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                drawableNewDrawable = this.c.newDrawable(resources);
                int i4 = 83 / 0;
            } else {
                drawableNewDrawable = this.c.newDrawable(resources);
            }
            hVar.c = drawableNewDrawable;
            drawableNewDrawable.setCallback(hVar.f);
            int i5 = b;
            int i6 = ((i5 | 51) << 1) - ((i5 & (-52)) | ((~i5) & 51));
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 8 / 0;
            }
            int i8 = i5 ^ 9;
            int i9 = ((i5 & 9) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return hVar;
            }
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            int i = 2 % 2;
            Object obj = null;
            h hVar = new h(null, null, null);
            int i2 = a;
            int i3 = i2 ^ 109;
            int i4 = ((i2 & 109) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            Drawable drawableNewDrawable = this.c.newDrawable(resources, theme);
            hVar.c = drawableNewDrawable;
            int i8 = b;
            int i9 = ((i8 ^ 85) - (~((i8 & 85) << 1))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                drawableNewDrawable.setCallback(hVar.f);
                obj.hashCode();
                throw null;
            }
            drawableNewDrawable.setCallback(hVar.f);
            int i10 = b;
            int i11 = i10 & 19;
            int i12 = i11 + ((i10 ^ 19) | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return hVar;
        }
    }

    public h(Context context, bIe bie, Resources resources) {
        this.g = null;
        bId bid = new bId();
        this.f = bid;
        this.e = context;
        this.d = new bIe(null, bid, null);
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 53) + (i2 | 53);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            ColorFilter colorFilter = this.d.d.getColorFilter();
            int i4 = b + 76;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            return colorFilter;
        }
        ColorFilter colorFilter2 = drawable2.getColorFilter();
        int i7 = a;
        int i8 = ((i7 & (-118)) | ((~i7) & 117)) + ((i7 & 117) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return colorFilter2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 5) + (i2 | 5);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int intrinsicWidth = this.d.d.getIntrinsicWidth();
            int i5 = b;
            int i6 = i5 & 117;
            int i7 = (((i5 | 117) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return intrinsicWidth;
        }
        int i9 = a;
        int i10 = (i9 & 87) + (i9 | 87);
        b = i10 % 128;
        Object obj = null;
        if (i10 % 2 == 0) {
            drawable.getIntrinsicWidth();
            obj.hashCode();
            throw null;
        }
        int intrinsicWidth2 = drawable.getIntrinsicWidth();
        int i11 = a;
        int i12 = i11 ^ 25;
        int i13 = -(-((i11 & 25) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return intrinsicWidth2;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = (i2 & 37) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            boolean zIsStateful = drawable2.isStateful();
            int i6 = b;
            int i7 = (i6 ^ 109) + ((i6 & 109) << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 85 / 0;
            }
            return zIsStateful;
        }
        boolean zIsStateful2 = this.d.d.isStateful();
        int i9 = b;
        int i10 = i9 & 21;
        int i11 = (i9 | 21) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        return zIsStateful2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-38)) | ((~i2) & 37);
        int i4 = -(-((i2 & 37) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            int i6 = b;
            int i7 = i6 ^ 47;
            int i8 = ((i6 & 47) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            drawable2.setAutoMirrored(z);
            int i12 = a;
            int i13 = i12 & 121;
            int i14 = (i12 ^ 121) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        p pVar = this.d.d;
        Drawable drawable3 = pVar.c;
        if (drawable3 == null) {
            pVar.f.i = z;
            int i16 = a;
            int i17 = ((((i16 ^ 17) | (i16 & 17)) << 1) - (~(-(((~i16) & 17) | (i16 & (-18)))))) - 1;
            b = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i18 = b;
        int i19 = (-2) - (((i18 ^ 4) + ((i18 & 4) << 1)) ^ (-1));
        a = i19 % 128;
        int i20 = i19 % 2;
        drawable3.setAutoMirrored(z);
        int i21 = a;
        int i22 = i21 & 85;
        int i23 = (i22 - (~((i21 ^ 85) | i22))) - 1;
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r4 = r4 + 107;
        ivas.gov.bisp.enumeration.cZ.h.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if ((r4 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        r3.setColorFilter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        r3.setColorFilter(r9);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1.i = r9;
        r1.invalidateSelf();
        r9 = ivas.gov.bisp.enumeration.cZ.h.b;
        r1 = (r9 | 51) << 1;
        r9 = -(r9 ^ 51);
        r3 = (r1 ^ r9) + ((r9 & r1) << 1);
        ivas.gov.bisp.enumeration.cZ.h.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if ((r3 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        throw null;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setColorFilter(android.graphics.ColorFilter r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            int r1 = r1 + 81
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r2
            int r1 = r1 % r0
            android.graphics.drawable.Drawable r1 = r8.c
            r2 = 0
            if (r1 == 0) goto L31
            int r3 = ivas.gov.bisp.enumeration.cZ.h.a
            r4 = r3 ^ 14
            r3 = r3 & 14
            int r3 = r3 << 1
            int r4 = r4 + r3
            r3 = r4 ^ (-1)
            int r4 = r4 << 1
            int r3 = r3 + r4
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L2a
            r1.setColorFilter(r9)
            return
        L2a:
            r1.setColorFilter(r9)
            r2.hashCode()
            throw r2
        L31:
            ivas.gov.bisp.enumeration.cZ.h$bIe r1 = r8.d
            ivas.gov.bisp.enumeration.cZ.p r1 = r1.d
            android.graphics.drawable.Drawable r3 = r1.c
            int r4 = ivas.gov.bisp.enumeration.cZ.h.a
            r5 = r4 ^ 125(0x7d, float:1.75E-43)
            r6 = r4 & 125(0x7d, float:1.75E-43)
            r5 = r5 | r6
            int r5 = r5 << 1
            r6 = r4 & (-126(0xffffffffffffff82, float:NaN))
            int r7 = ~r4
            r7 = r7 & 125(0x7d, float:1.75E-43)
            r6 = r6 | r7
            int r6 = -r6
            r7 = r5 | r6
            int r7 = r7 << 1
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r5 = r7 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r5
            int r7 = r7 % r0
            if (r7 != 0) goto L5b
            r5 = 80
            int r5 = r5 / 0
            if (r3 == 0) goto L71
            goto L5d
        L5b:
            if (r3 == 0) goto L71
        L5d:
            int r4 = r4 + 107
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L6a
            r3.setColorFilter(r9)
            return
        L6a:
            r3.setColorFilter(r9)
            r2.hashCode()
            throw r2
        L71:
            r1.i = r9
            r1.invalidateSelf()
            int r9 = ivas.gov.bisp.enumeration.cZ.h.b
            r1 = r9 | 51
            int r1 = r1 << 1
            r9 = r9 ^ 51
            int r9 = -r9
            r3 = r1 ^ r9
            r9 = r9 & r1
            int r9 = r9 << 1
            int r3 = r3 + r9
            int r9 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r9
            int r3 = r3 % r0
            if (r3 != 0) goto L8d
            return
        L8d:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.setColorFilter(android.graphics.ColorFilter):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r4 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r9 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r9 = ivas.gov.bisp.enumeration.cZ.h.b;
        r3 = r9 & 57;
        r2 = ((r9 ^ 57) | r3) << 1;
        r9 = -((r9 | 57) & (~r3));
        r3 = (r2 ^ r9) + ((r9 & r2) << 1);
        ivas.gov.bisp.enumeration.cZ.h.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r7.d.d.setVisible(r8, r9);
        r2 = ivas.gov.bisp.enumeration.cZ.h.a;
        r3 = ((r2 & (-56)) | ((~r2) & 55)) + ((r2 & 55) << 1);
        ivas.gov.bisp.enumeration.cZ.h.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if ((r3 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        return super.setVisible(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        super.setVisible(r8, r9);
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r3 = ivas.gov.bisp.enumeration.cZ.h.a;
        r4 = ((r3 & (-100)) | ((~r3) & 99)) + ((r3 & 99) << 1);
        ivas.gov.bisp.enumeration.cZ.h.b = r4 % 128;
        r4 = r4 % 2;
        r8 = r2.setVisible(r8, r9);
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setVisible(boolean r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r1 & (-90)
            int r3 = ~r1
            r4 = 89
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r1
            int r3 = r3 % r0
            r1 = 0
            if (r3 == 0) goto L24
            android.graphics.drawable.Drawable r2 = r7.c
            r3 = 66
            int r3 = r3 / 0
            if (r2 == 0) goto L61
            goto L28
        L24:
            android.graphics.drawable.Drawable r2 = r7.c
            if (r2 == 0) goto L61
        L28:
            int r3 = ivas.gov.bisp.enumeration.cZ.h.a
            r4 = r3 & (-100)
            int r5 = ~r3
            r6 = 99
            r5 = r5 & r6
            r4 = r4 | r5
            r3 = r3 & r6
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r3
            int r4 = r4 % r0
            boolean r8 = r2.setVisible(r8, r9)
            if (r4 != 0) goto L44
            r9 = 20
            int r9 = r9 / 0
        L44:
            int r9 = ivas.gov.bisp.enumeration.cZ.h.b
            r2 = r9 ^ 57
            r3 = r9 & 57
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r9 = r9 | 57
            r9 = r9 & r3
            int r9 = -r9
            r3 = r2 ^ r9
            r9 = r9 & r2
            int r9 = r9 << 1
            int r3 = r3 + r9
            int r9 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.a = r9
            int r3 = r3 % r0
            if (r3 != 0) goto L60
            return r8
        L60:
            throw r1
        L61:
            ivas.gov.bisp.enumeration.cZ.h$bIe r2 = r7.d
            ivas.gov.bisp.enumeration.cZ.p r2 = r2.d
            r2.setVisible(r8, r9)
            int r2 = ivas.gov.bisp.enumeration.cZ.h.a
            r3 = r2 & (-56)
            int r4 = ~r2
            r4 = r4 & 55
            r3 = r3 | r4
            r2 = r2 & 55
            int r2 = r2 << 1
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.cZ.h.b = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L81
            boolean r8 = super.setVisible(r8, r9)
            return r8
        L81:
            super.setVisible(r8, r9)
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cZ.h.setVisible(boolean, boolean):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-66)) | ((~i2) & 65);
        int i4 = -(-((i2 & 65) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            int alpha = this.d.d.getAlpha();
            int i6 = b + 103;
            a = i6 % 128;
            int i7 = i6 % 2;
            return alpha;
        }
        int i8 = a;
        int i9 = i8 & 71;
        int i10 = i9 + ((i8 ^ 71) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        int alpha2 = drawable2.getAlpha();
        int i12 = b;
        int i13 = i12 & 95;
        int i14 = ((i12 ^ 95) | i13) << 1;
        int i15 = -((i12 | 95) & (~i13));
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return alpha2;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Drawable drawable = this.c;
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            int changingConfigurations = drawable2.getChangingConfigurations();
            int i4 = (-2) - ((a + 118) ^ (-1));
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            return changingConfigurations;
        }
        int changingConfigurations2 = super.getChangingConfigurations();
        int i6 = this.d.c;
        int i7 = (changingConfigurations2 & i6) | (changingConfigurations2 ^ i6);
        int i8 = a;
        int i9 = i8 & 65;
        int i10 = (i8 ^ 65) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return i7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 105) << 1;
        int i4 = -(i2 ^ 105);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i7 = a + 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            int opacity = drawable.getOpacity();
            if (i8 == 0) {
                int i9 = 83 / 0;
            }
            return opacity;
        }
        int opacity2 = this.d.d.getOpacity();
        int i10 = a;
        int i11 = ((i10 ^ 57) | (i10 & 57)) << 1;
        int i12 = -(((~i10) & 57) | (i10 & (-58)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        return opacity2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = ((i2 | 71) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            boolean state = this.d.d.setState(iArr);
            int i6 = a + 85;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 49 / 0;
            }
            return state;
        }
        int i8 = a;
        int i9 = i8 & 11;
        int i10 = (((i8 ^ 11) | i9) << 1) - ((i8 | 11) & (~i9));
        b = i10 % 128;
        int i11 = i10 % 2;
        boolean state2 = drawable.setState(iArr);
        int i12 = a;
        int i13 = (i12 & (-64)) | ((~i12) & 63);
        int i14 = (i12 & 63) << 1;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return state2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = ((i2 & 43) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            Drawable drawable = this.c;
            obj.hashCode();
            throw null;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            j.c(drawable2, colorStateList);
            int i7 = b;
            int i8 = i7 & 107;
            int i9 = (i7 ^ 107) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.d.d.setTintList(colorStateList);
        int i11 = b;
        int i12 = i11 & 43;
        int i13 = (i11 | 43) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 & i14) + (i13 | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-50)) | ((~i2) & 49)) + ((i2 & 49) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = a;
            int i6 = (i5 ^ 56) + ((i5 & 56) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                drawable.draw(canvas);
                return;
            } else {
                drawable.draw(canvas);
                int i8 = 45 / 0;
                return;
            }
        }
        this.d.d.draw(canvas);
        bIe bie = this.d;
        int i9 = b;
        int i10 = (i9 & 23) + (i9 | 23);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            bie.e.isStarted();
            throw null;
        }
        if (bie.e.isStarted()) {
            int i11 = a;
            int i12 = i11 & 121;
            int i13 = i11 | 121;
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            invalidateSelf();
            int i16 = (-2) - ((a + 82) ^ (-1));
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b + 115;
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0301  */
    /* JADX WARN: Code duplicated, block: B:108:0x0367  */
    /* JADX WARN: Code duplicated, block: B:111:0x039c  */
    /* JADX WARN: Code duplicated, block: B:114:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:118:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:166:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x04b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x04b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x019a A[EDGE_INSN: B:184:0x019a->B:53:0x019a BREAK  A[LOOP:1: B:44:0x0182->B:189:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x019a A[EDGE_INSN: B:185:0x019a->B:53:0x019a BREAK  A[LOOP:1: B:44:0x0182->B:189:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x019a A[EDGE_INSN: B:187:0x019a->B:53:0x019a BREAK  A[LOOP:1: B:44:0x0182->B:189:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:36:0x015f  */
    /* JADX WARN: Code duplicated, block: B:43:0x017f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4 A[Catch: IOException -> 0x01eb, XmlPullParserException -> 0x01f0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x01eb, XmlPullParserException -> 0x01f0, blocks: (B:40:0x016c, B:44:0x0182, B:56:0x01b4, B:58:0x01bb, B:63:0x01c0, B:65:0x01e3, B:66:0x01ea), top: B:166:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0 A[Catch: IOException -> 0x01eb, XmlPullParserException -> 0x01f0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x01eb, XmlPullParserException -> 0x01f0, blocks: (B:40:0x016c, B:44:0x0182, B:56:0x01b4, B:58:0x01bb, B:63:0x01c0, B:65:0x01e3, B:66:0x01ea), top: B:166:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e3 A[Catch: IOException -> 0x01eb, XmlPullParserException -> 0x01f0, TRY_ENTER, TryCatch #9 {IOException -> 0x01eb, XmlPullParserException -> 0x01f0, blocks: (B:40:0x016c, B:44:0x0182, B:56:0x01b4, B:58:0x01bb, B:63:0x01c0, B:65:0x01e3, B:66:0x01ea), top: B:166:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0220  */
    /* JADX WARN: Code duplicated, block: B:77:0x0262  */
    /* JADX WARN: Code duplicated, block: B:80:0x026d  */
    /* JADX WARN: Code duplicated, block: B:82:0x027c  */
    /* JADX WARN: Code duplicated, block: B:84:0x029e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int resourceId;
        boolean z;
        p pVar;
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int i;
        int next;
        int i2;
        p pVarD;
        int i3;
        p pVar2;
        int i4;
        int i5;
        int i6;
        TypedArray typedArrayObtainAttributes;
        int i7;
        int i8;
        String string;
        int resourceId2;
        int i9;
        Context context;
        XmlResourceParser animation;
        int i10;
        Animator animatorB;
        int i11;
        bIe bie;
        int i12;
        OooO0o<Animator, String> oooO0o;
        int i13;
        int i14;
        Resources.Theme theme2 = theme;
        int i15 = 2 % 2;
        int i16 = a;
        int i17 = 1;
        int i18 = (i16 ^ 29) + ((i16 & 29) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        Drawable drawable = this.c;
        Object obj = null;
        if (drawable != null) {
            int i20 = a + 15;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme2);
                throw null;
            }
            drawable.inflate(resources, xmlPullParser, attributeSet, theme2);
            int i21 = b;
            int i22 = i21 & 47;
            int i23 = (i21 | 47) & (~i22);
            int i24 = i22 << 1;
            int i25 = (i23 & i24) + (i23 | i24);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        int i26 = a;
        int i27 = ((i26 ^ 69) | (i26 & 69)) << 1;
        int i28 = -((69 & (~i26)) | (i26 & (-70)));
        int i29 = (i27 & i28) + (i28 | i27);
        b = i29 % 128;
        int i30 = i29 % 2;
        while (eventType != i17) {
            int i31 = b;
            int i32 = ((i31 & 63) - (~(-(-(i31 | 63))))) - i17;
            a = i32 % 128;
            int i33 = i32 % 2;
            int depth2 = xmlPullParser.getDepth();
            int i34 = ((~depth) & i17) | (depth & (-2));
            int i35 = (depth & 1) << i17;
            if (depth2 < (i34 & i35) + (i34 | i35)) {
                int i36 = b + 101;
                a = i36 % 128;
                int i37 = i36 % 2;
                if (eventType == 3) {
                    break;
                }
            }
            if (eventType == 2) {
                int i38 = b;
                int i39 = (i38 & (-102)) | (101 & (~i38));
                int i40 = (i38 & 101) << i17;
                int i41 = (i39 & i40) + (i40 | i39);
                a = i41 % 128;
                int i42 = i41 % 2;
                String name = xmlPullParser.getName();
                int i43 = b;
                int i44 = (i43 ^ 48) + ((i43 & 48) << i17);
                int i45 = (i44 ^ (-1)) + (i44 << i17);
                a = i45 % 128;
                if (i45 % 2 != 0) {
                    int i46 = 11 / 0;
                    if ("animated-vector".equals(name)) {
                        int i47 = a;
                        int i48 = (((i47 | 74) << i17) - (i47 ^ 74)) - i17;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        TypedArray typedArrayE = Q.e(resources, theme2, attributeSet, c.i);
                        int i50 = b;
                        int i51 = i50 ^ 73;
                        int i52 = -(-((i50 & 73) << i17));
                        int i53 = (i51 ^ i52) + ((i52 & i51) << i17);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        resourceId = typedArrayE.getResourceId(0, 0);
                        if (resourceId != 0) {
                            int i55 = b;
                            int i56 = (i55 & 37) + (i55 | 37);
                            a = i56 % 128;
                            int i57 = i56 % 2;
                            PorterDuff.Mode mode = p.d;
                            if (Build.VERSION.SDK_INT >= 24) {
                                pVar = new p();
                                ThreadLocal<TypedValue> threadLocal = C0084m.c;
                                i4 = b + 17;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    pVar.c = resources.getDrawable(resourceId, theme2);
                                    throw null;
                                }
                                pVar.c = resources.getDrawable(resourceId, theme2);
                                new p.bIs(pVar.c.getConstantState());
                                int i58 = a;
                                int i59 = ((i58 | 18) << i17) - (i58 ^ 18);
                                i5 = (i59 ^ (-1)) + (i59 << i17);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i60 = 2 / 4;
                                }
                            } else {
                                try {
                                    xml = resources.getXml(resourceId);
                                    attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                    i = a + 3;
                                    b = i % 128;
                                    if (i % 2 == 0) {
                                        int i61 = 3 % 5;
                                    }
                                    while (true) {
                                        next = xml.next();
                                        if (next != 2) {
                                            break;
                                        }
                                        i3 = b + 111;
                                        a = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            i17 = 1;
                                            if (next == 1) {
                                                break;
                                            }
                                        } else {
                                            i17 = 1;
                                            if (next == 1) {
                                                break;
                                            }
                                        }
                                    }
                                    if (next == 2) {
                                        throw new XmlPullParserException("No start tag found");
                                    }
                                    int i62 = a;
                                    int i63 = i62 ^ 29;
                                    int i64 = ((i62 & 29) | i63) << i17;
                                    int i65 = -i63;
                                    i2 = ((i64 | i65) << 1) - (i64 ^ i65);
                                    b = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        pVarD = p.d(resources, xml, attributeSetAsAttributeSet, theme2);
                                        int i66 = 33 / 0;
                                    } else {
                                        pVarD = p.d(resources, xml, attributeSetAsAttributeSet, theme2);
                                    }
                                    int i67 = a;
                                    int i68 = ((i67 ^ 51) | (i67 & 51)) << 1;
                                    int i69 = -((51 & (~i67)) | (i67 & (-52)));
                                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                                    b = i70 % 128;
                                    int i71 = i70 % 2;
                                    pVar = pVarD;
                                } catch (IOException e) {
                                    Log.e("VectorDrawableCompat", "parser error", e);
                                    int i72 = a;
                                    int i73 = ((i72 | 59) << 1) - (i72 ^ 59);
                                    b = i73 % 128;
                                    int i74 = i73 % 2;
                                    z = false;
                                    pVar = null;
                                } catch (XmlPullParserException e2) {
                                    Log.e("VectorDrawableCompat", "parser error", e2);
                                    int i75 = a;
                                    int i76 = ((i75 | 59) << 1) - (i75 ^ 59);
                                    b = i76 % 128;
                                    int i77 = i76 % 2;
                                    z = false;
                                    pVar = null;
                                }
                            }
                            z = false;
                            pVar.j = z;
                            pVar.setCallback(this.f);
                            int i78 = b;
                            int i79 = (((i78 | 94) << 1) - (i78 ^ 94)) - 1;
                            a = i79 % 128;
                            int i80 = i79 % 2;
                            pVar2 = this.d.d;
                            if (pVar2 != null) {
                                int i81 = b + 117;
                                a = i81 % 128;
                                int i82 = i81 % 2;
                                pVar2.setCallback(null);
                                int i83 = a;
                                int i84 = ((i83 & (-110)) | ((~i83) & 109)) + ((i83 & 109) << 1);
                                b = i84 % 128;
                                int i85 = i84 % 2;
                            }
                            this.d.d = pVar;
                            int i86 = a;
                            int i87 = (i86 & 77) + (i86 | 77);
                            b = i87 % 128;
                            int i88 = i87 % 2;
                        }
                        typedArrayE.recycle();
                        int i89 = b;
                        int i90 = (i89 & 7) + (i89 | 7);
                        a = i90 % 128;
                        int i91 = i90 % 2;
                    } else if (!"target".equals(name)) {
                        continue;
                    } else {
                        int i92 = a;
                        i6 = (i92 ^ 55) + ((i92 & 55) << 1);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            resources.obtainAttributes(attributeSet, c.h);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, c.h);
                        int i93 = a;
                        int i94 = ((i93 ^ 7) | (i93 & 7)) << 1;
                        int i95 = -(((~i93) & 7) | (i93 & (-8)));
                        i7 = (i94 ^ i95) + ((i95 & i94) << 1);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            string = typedArrayObtainAttributes.getString(1);
                            i8 = 0;
                        } else {
                            i8 = 0;
                            string = typedArrayObtainAttributes.getString(0);
                        }
                        resourceId2 = typedArrayObtainAttributes.getResourceId(1, i8);
                        if (resourceId2 != 0) {
                            int i96 = a;
                            int i97 = i96 & 81;
                            int i98 = i96 | 81;
                            i9 = ((i97 | i98) << 1) - (i97 ^ i98);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                context = this.e;
                                int i99 = 26 / 0;
                                if (context == null) {
                                    typedArrayObtainAttributes.recycle();
                                    throw new IllegalStateException("Context can't be null when inflating animators");
                                }
                                if (Build.VERSION.SDK_INT >= 24) {
                                    i14 = a + 57;
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        AnimatorInflater.loadAnimator(context, resourceId2);
                                        throw null;
                                    }
                                    animatorB = AnimatorInflater.loadAnimator(context, resourceId2);
                                    int i100 = b;
                                    int i101 = i100 | 15;
                                    int i102 = ((i101 << 1) - (~(-((~(i100 & 15)) & i101)))) - 1;
                                    a = i102 % 128;
                                    int i103 = i102 % 2;
                                } else {
                                    Resources resources2 = context.getResources();
                                    Resources.Theme theme3 = context.getTheme();
                                    int i104 = a;
                                    int i105 = i104 ^ 65;
                                    int i106 = -(-((i104 & 65) << 1));
                                    int i107 = (i105 & i106) + (i105 | i106);
                                    b = i107 % 128;
                                    int i108 = i107 % 2;
                                    try {
                                        try {
                                            animation = resources2.getAnimation(resourceId2);
                                            int i109 = b;
                                            int i110 = ((i109 ^ 75) | (i109 & 75)) << 1;
                                            int i111 = -((i109 & (-76)) | ((~i109) & 75));
                                            int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                                            a = i112 % 128;
                                            int i113 = i112 % 2;
                                            try {
                                                animatorB = r.b(context, resources2, theme3, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                                int i114 = a;
                                                i11 = (i114 & 21) + (i114 | 21);
                                                b = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    animation.close();
                                                    Object obj3 = null;
                                                    obj3.hashCode();
                                                    throw null;
                                                }
                                                animation.close();
                                            } catch (IOException e3) {
                                                e = e3;
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Can't load animation resource ID #0x");
                                                sb.append(Integer.toHexString(resourceId2));
                                                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                                                int i115 = b;
                                                int i116 = (((i115 ^ 107) | (i115 & 107)) << 1) - (((~i115) & 107) | (i115 & (-108)));
                                                a = i116 % 128;
                                                int i117 = i116 % 2;
                                                notFoundException.initCause(e);
                                                throw notFoundException;
                                            } catch (XmlPullParserException e4) {
                                                e = e4;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Can't load animation resource ID #0x");
                                                sb2.append(Integer.toHexString(resourceId2));
                                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                                                int i118 = a;
                                                int i119 = i118 & 103;
                                                int i120 = (i118 ^ 103) | i119;
                                                int i121 = (i119 & i120) + (i120 | i119);
                                                b = i121 % 128;
                                                int i122 = i121 % 2;
                                                notFoundException2.initCause(e);
                                                int i123 = a;
                                                int i124 = ((i123 & 114) + (i123 | 114)) - 1;
                                                b = i124 % 128;
                                                int i125 = i124 % 2;
                                                throw notFoundException2;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (animation != 0) {
                                                    i10 = b + 59;
                                                    a = i10 % 128;
                                                    if (i10 % 2 != 0) {
                                                        animation.close();
                                                        int i126 = 53 / 0;
                                                    } else {
                                                        animation.close();
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e5) {
                                            e = e5;
                                        } catch (XmlPullParserException e6) {
                                            e = e6;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            context = null;
                                            int i127 = a;
                                            int i128 = ((i127 ^ 79) | (i127 & 79)) << 1;
                                            int i129 = -(((~i127) & 79) | (i127 & (-80)));
                                            int i130 = (i128 & i129) + (i129 | i128);
                                            b = i130 % 128;
                                            int i131 = i130 % 2;
                                            animation = context;
                                            if (animation != 0) {
                                                i10 = b + 59;
                                                a = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    animation.close();
                                                    int i1210 = 53 / 0;
                                                } else {
                                                    animation.close();
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int i1211 = a;
                                        int i1212 = ((i1211 ^ 79) | (i1211 & 79)) << 1;
                                        int i1213 = -(((~i1211) & 79) | (i1211 & (-80)));
                                        int i132 = (i1212 & i1213) + (i1213 | i1212);
                                        b = i132 % 128;
                                        int i133 = i132 % 2;
                                        animation = context;
                                        if (animation != 0) {
                                            i10 = b + 59;
                                            a = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                animation.close();
                                                int i1214 = 53 / 0;
                                            } else {
                                                animation.close();
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                p.bIq biq = this.d.d.f.e;
                                int i134 = b;
                                int i135 = (i134 ^ 31) + ((i134 & 31) << 1);
                                a = i135 % 128;
                                int i136 = i135 % 2;
                                Object orDefault = biq.s.getOrDefault(string, null);
                                int i137 = a;
                                int i138 = (i137 & 97) + (i137 | 97);
                                b = i138 % 128;
                                int i139 = i138 % 2;
                                animatorB.setTarget(orDefault);
                                bie = this.d;
                                if (bie.f == null) {
                                    bie.f = new ArrayList<>();
                                    this.d.g = new ivas.gov.bisp.enumeration.p001aa.r();
                                    int i140 = b;
                                    int i141 = i140 | 85;
                                    int i142 = i141 << 1;
                                    int i143 = -((~(i140 & 85)) & i141);
                                    int i144 = (i142 ^ i143) + ((i143 & i142) << 1);
                                    a = i144 % 128;
                                    int i145 = i144 % 2;
                                }
                                this.d.f.add(animatorB);
                                int i146 = a;
                                i12 = (i146 ^ 59) + ((i146 & 59) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    oooO0o = this.d.g;
                                    int i147 = 87 / 0;
                                } else {
                                    oooO0o = this.d.g;
                                }
                                oooO0o.put(animatorB, string);
                                int i148 = b;
                                int i149 = i148 & 123;
                                int i150 = (i148 ^ 123) | i149;
                                i13 = (i149 ^ i150) + ((i150 & i149) << 1);
                                a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i151 = 3 / 2;
                                }
                            } else {
                                context = this.e;
                                if (context == null) {
                                    typedArrayObtainAttributes.recycle();
                                    throw new IllegalStateException("Context can't be null when inflating animators");
                                }
                                if (Build.VERSION.SDK_INT >= 24) {
                                    i14 = a + 57;
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        AnimatorInflater.loadAnimator(context, resourceId2);
                                        throw null;
                                    }
                                    animatorB = AnimatorInflater.loadAnimator(context, resourceId2);
                                    int i1010 = b;
                                    int i1011 = i1010 | 15;
                                    int i1012 = ((i1011 << 1) - (~(-((~(i1010 & 15)) & i1011)))) - 1;
                                    a = i1012 % 128;
                                    int i1013 = i1012 % 2;
                                } else {
                                    Resources resources3 = context.getResources();
                                    Resources.Theme theme4 = context.getTheme();
                                    int i1014 = a;
                                    int i1015 = i1014 ^ 65;
                                    int i1016 = -(-((i1014 & 65) << 1));
                                    int i1017 = (i1015 & i1016) + (i1015 | i1016);
                                    b = i1017 % 128;
                                    int i1018 = i1017 % 2;
                                    animation = resources3.getAnimation(resourceId2);
                                    int i1019 = b;
                                    int i1110 = ((i1019 ^ 75) | (i1019 & 75)) << 1;
                                    int i1111 = -((i1019 & (-76)) | ((~i1019) & 75));
                                    int i1112 = (i1110 ^ i1111) + ((i1110 & i1111) << 1);
                                    a = i1112 % 128;
                                    int i1113 = i1112 % 2;
                                    animatorB = r.b(context, resources3, theme4, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                    int i1114 = a;
                                    i11 = (i1114 & 21) + (i1114 | 21);
                                    b = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        animation.close();
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    animation.close();
                                }
                                p.bIq biq2 = this.d.d.f.e;
                                int i1310 = b;
                                int i1311 = (i1310 ^ 31) + ((i1310 & 31) << 1);
                                a = i1311 % 128;
                                int i1312 = i1311 % 2;
                                Object orDefault2 = biq2.s.getOrDefault(string, null);
                                int i1313 = a;
                                int i1314 = (i1313 & 97) + (i1313 | 97);
                                b = i1314 % 128;
                                int i1315 = i1314 % 2;
                                animatorB.setTarget(orDefault2);
                                bie = this.d;
                                if (bie.f == null) {
                                    bie.f = new ArrayList<>();
                                    this.d.g = new ivas.gov.bisp.enumeration.p001aa.r();
                                    int i1410 = b;
                                    int i1411 = i1410 | 85;
                                    int i1412 = i1411 << 1;
                                    int i1413 = -((~(i1410 & 85)) & i1411);
                                    int i1414 = (i1412 ^ i1413) + ((i1413 & i1412) << 1);
                                    a = i1414 % 128;
                                    int i1415 = i1414 % 2;
                                }
                                this.d.f.add(animatorB);
                                int i1416 = a;
                                i12 = (i1416 ^ 59) + ((i1416 & 59) << 1);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    oooO0o = this.d.g;
                                    int i1417 = 87 / 0;
                                } else {
                                    oooO0o = this.d.g;
                                }
                                oooO0o.put(animatorB, string);
                                int i1418 = b;
                                int i1419 = i1418 & 123;
                                int i152 = (i1418 ^ 123) | i1419;
                                i13 = (i1419 ^ i152) + ((i152 & i1419) << 1);
                                a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i153 = 3 / 2;
                                }
                            }
                        }
                        typedArrayObtainAttributes.recycle();
                        int i154 = a;
                        int i155 = ((i154 & 16) + (i154 | 16)) - 1;
                        b = i155 % 128;
                        int i156 = i155 % 2;
                    }
                } else if ("animated-vector".equals(name)) {
                    int i410 = a;
                    int i411 = (((i410 | 74) << i17) - (i410 ^ 74)) - i17;
                    b = i411 % 128;
                    int i412 = i411 % 2;
                    TypedArray typedArrayE2 = Q.e(resources, theme2, attributeSet, c.i);
                    int i510 = b;
                    int i511 = i510 ^ 73;
                    int i512 = -(-((i510 & 73) << i17));
                    int i513 = (i511 ^ i512) + ((i512 & i511) << i17);
                    a = i513 % 128;
                    int i514 = i513 % 2;
                    resourceId = typedArrayE2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        int i515 = b;
                        int i516 = (i515 & 37) + (i515 | 37);
                        a = i516 % 128;
                        int i517 = i516 % 2;
                        PorterDuff.Mode mode2 = p.d;
                        if (Build.VERSION.SDK_INT >= 24) {
                            pVar = new p();
                            ThreadLocal<TypedValue> threadLocal2 = C0084m.c;
                            i4 = b + 17;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                pVar.c = resources.getDrawable(resourceId, theme2);
                                throw null;
                            }
                            pVar.c = resources.getDrawable(resourceId, theme2);
                            new p.bIs(pVar.c.getConstantState());
                            int i518 = a;
                            int i519 = ((i518 | 18) << i17) - (i518 ^ 18);
                            i5 = (i519 ^ (-1)) + (i519 << i17);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                int i610 = 2 / 4;
                            }
                        } else {
                            xml = resources.getXml(resourceId);
                            attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            i = a + 3;
                            b = i % 128;
                            if (i % 2 == 0) {
                                int i611 = 3 % 5;
                            }
                            while (true) {
                                next = xml.next();
                                if (next != 2) {
                                    break;
                                    break;
                                }
                                i3 = b + 111;
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    i17 = 1;
                                    if (next == 1) {
                                        break;
                                        break;
                                    }
                                } else {
                                    i17 = 1;
                                    if (next == 1) {
                                        break;
                                        break;
                                    }
                                }
                            }
                            if (next == 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            int i612 = a;
                            int i613 = i612 ^ 29;
                            int i614 = ((i612 & 29) | i613) << i17;
                            int i615 = -i613;
                            i2 = ((i614 | i615) << 1) - (i614 ^ i615);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                pVarD = p.d(resources, xml, attributeSetAsAttributeSet, theme2);
                                int i616 = 33 / 0;
                            } else {
                                pVarD = p.d(resources, xml, attributeSetAsAttributeSet, theme2);
                            }
                            int i617 = a;
                            int i618 = ((i617 ^ 51) | (i617 & 51)) << 1;
                            int i619 = -((51 & (~i617)) | (i617 & (-52)));
                            int i710 = ((i618 | i619) << 1) - (i619 ^ i618);
                            b = i710 % 128;
                            int i711 = i710 % 2;
                            pVar = pVarD;
                        }
                        z = false;
                        pVar.j = z;
                        pVar.setCallback(this.f);
                        int i712 = b;
                        int i713 = (((i712 | 94) << 1) - (i712 ^ 94)) - 1;
                        a = i713 % 128;
                        int i810 = i713 % 2;
                        pVar2 = this.d.d;
                        if (pVar2 != null) {
                            int i811 = b + 117;
                            a = i811 % 128;
                            int i812 = i811 % 2;
                            pVar2.setCallback(null);
                            int i813 = a;
                            int i814 = ((i813 & (-110)) | ((~i813) & 109)) + ((i813 & 109) << 1);
                            b = i814 % 128;
                            int i815 = i814 % 2;
                        }
                        this.d.d = pVar;
                        int i816 = a;
                        int i817 = (i816 & 77) + (i816 | 77);
                        b = i817 % 128;
                        int i818 = i817 % 2;
                    }
                    typedArrayE2.recycle();
                    int i819 = b;
                    int i910 = (i819 & 7) + (i819 | 7);
                    a = i910 % 128;
                    int i911 = i910 % 2;
                } else if (!"target".equals(name)) {
                    continue;
                } else {
                    int i912 = a;
                    i6 = (i912 ^ 55) + ((i912 & 55) << 1);
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        resources.obtainAttributes(attributeSet, c.h);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, c.h);
                    int i913 = a;
                    int i914 = ((i913 ^ 7) | (i913 & 7)) << 1;
                    int i915 = -(((~i913) & 7) | (i913 & (-8)));
                    i7 = (i914 ^ i915) + ((i915 & i914) << 1);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        string = typedArrayObtainAttributes.getString(1);
                        i8 = 0;
                    } else {
                        i8 = 0;
                        string = typedArrayObtainAttributes.getString(0);
                    }
                    resourceId2 = typedArrayObtainAttributes.getResourceId(1, i8);
                    if (resourceId2 != 0) {
                        int i916 = a;
                        int i917 = i916 & 81;
                        int i918 = i916 | 81;
                        i9 = ((i917 | i918) << 1) - (i917 ^ i918);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            context = this.e;
                            int i919 = 26 / 0;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                i14 = a + 57;
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    AnimatorInflater.loadAnimator(context, resourceId2);
                                    throw null;
                                }
                                animatorB = AnimatorInflater.loadAnimator(context, resourceId2);
                                int i10110 = b;
                                int i10111 = i10110 | 15;
                                int i10112 = ((i10111 << 1) - (~(-((~(i10110 & 15)) & i10111)))) - 1;
                                a = i10112 % 128;
                                int i10113 = i10112 % 2;
                            } else {
                                Resources resources4 = context.getResources();
                                Resources.Theme theme5 = context.getTheme();
                                int i10114 = a;
                                int i10115 = i10114 ^ 65;
                                int i10116 = -(-((i10114 & 65) << 1));
                                int i10117 = (i10115 & i10116) + (i10115 | i10116);
                                b = i10117 % 128;
                                int i10118 = i10117 % 2;
                                animation = resources4.getAnimation(resourceId2);
                                int i10119 = b;
                                int i1115 = ((i10119 ^ 75) | (i10119 & 75)) << 1;
                                int i1116 = -((i10119 & (-76)) | ((~i10119) & 75));
                                int i1117 = (i1115 ^ i1116) + ((i1115 & i1116) << 1);
                                a = i1117 % 128;
                                int i1118 = i1117 % 2;
                                animatorB = r.b(context, resources4, theme5, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                int i1119 = a;
                                i11 = (i1119 & 21) + (i1119 | 21);
                                b = i11 % 128;
                                if (i11 % 2 != 0) {
                                    animation.close();
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                animation.close();
                            }
                            p.bIq biq3 = this.d.d.f.e;
                            int i1316 = b;
                            int i1317 = (i1316 ^ 31) + ((i1316 & 31) << 1);
                            a = i1317 % 128;
                            int i1318 = i1317 % 2;
                            Object orDefault3 = biq3.s.getOrDefault(string, null);
                            int i1319 = a;
                            int i13110 = (i1319 & 97) + (i1319 | 97);
                            b = i13110 % 128;
                            int i13111 = i13110 % 2;
                            animatorB.setTarget(orDefault3);
                            bie = this.d;
                            if (bie.f == null) {
                                bie.f = new ArrayList<>();
                                this.d.g = new ivas.gov.bisp.enumeration.p001aa.r();
                                int i14110 = b;
                                int i14111 = i14110 | 85;
                                int i14112 = i14111 << 1;
                                int i14113 = -((~(i14110 & 85)) & i14111);
                                int i14114 = (i14112 ^ i14113) + ((i14113 & i14112) << 1);
                                a = i14114 % 128;
                                int i14115 = i14114 % 2;
                            }
                            this.d.f.add(animatorB);
                            int i14116 = a;
                            i12 = (i14116 ^ 59) + ((i14116 & 59) << 1);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                oooO0o = this.d.g;
                                int i14117 = 87 / 0;
                            } else {
                                oooO0o = this.d.g;
                            }
                            oooO0o.put(animatorB, string);
                            int i14118 = b;
                            int i14119 = i14118 & 123;
                            int i157 = (i14118 ^ 123) | i14119;
                            i13 = (i14119 ^ i157) + ((i157 & i14119) << 1);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i158 = 3 / 2;
                            }
                        } else {
                            context = this.e;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                i14 = a + 57;
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    AnimatorInflater.loadAnimator(context, resourceId2);
                                    throw null;
                                }
                                animatorB = AnimatorInflater.loadAnimator(context, resourceId2);
                                int i101110 = b;
                                int i101111 = i101110 | 15;
                                int i101112 = ((i101111 << 1) - (~(-((~(i101110 & 15)) & i101111)))) - 1;
                                a = i101112 % 128;
                                int i101113 = i101112 % 2;
                            } else {
                                Resources resources5 = context.getResources();
                                Resources.Theme theme6 = context.getTheme();
                                int i101114 = a;
                                int i101115 = i101114 ^ 65;
                                int i101116 = -(-((i101114 & 65) << 1));
                                int i101117 = (i101115 & i101116) + (i101115 | i101116);
                                b = i101117 % 128;
                                int i101118 = i101117 % 2;
                                animation = resources5.getAnimation(resourceId2);
                                int i101119 = b;
                                int i11110 = ((i101119 ^ 75) | (i101119 & 75)) << 1;
                                int i11111 = -((i101119 & (-76)) | ((~i101119) & 75));
                                int i11112 = (i11110 ^ i11111) + ((i11110 & i11111) << 1);
                                a = i11112 % 128;
                                int i11113 = i11112 % 2;
                                animatorB = r.b(context, resources5, theme6, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                int i11114 = a;
                                i11 = (i11114 & 21) + (i11114 | 21);
                                b = i11 % 128;
                                if (i11 % 2 != 0) {
                                    animation.close();
                                    Object obj7 = null;
                                    obj7.hashCode();
                                    throw null;
                                }
                                animation.close();
                            }
                            p.bIq biq4 = this.d.d.f.e;
                            int i13112 = b;
                            int i13113 = (i13112 ^ 31) + ((i13112 & 31) << 1);
                            a = i13113 % 128;
                            int i13114 = i13113 % 2;
                            Object orDefault4 = biq4.s.getOrDefault(string, null);
                            int i13115 = a;
                            int i13116 = (i13115 & 97) + (i13115 | 97);
                            b = i13116 % 128;
                            int i13117 = i13116 % 2;
                            animatorB.setTarget(orDefault4);
                            bie = this.d;
                            if (bie.f == null) {
                                bie.f = new ArrayList<>();
                                this.d.g = new ivas.gov.bisp.enumeration.p001aa.r();
                                int i141110 = b;
                                int i141111 = i141110 | 85;
                                int i141112 = i141111 << 1;
                                int i141113 = -((~(i141110 & 85)) & i141111);
                                int i141114 = (i141112 ^ i141113) + ((i141113 & i141112) << 1);
                                a = i141114 % 128;
                                int i141115 = i141114 % 2;
                            }
                            this.d.f.add(animatorB);
                            int i141116 = a;
                            i12 = (i141116 ^ 59) + ((i141116 & 59) << 1);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                oooO0o = this.d.g;
                                int i141117 = 87 / 0;
                            } else {
                                oooO0o = this.d.g;
                            }
                            oooO0o.put(animatorB, string);
                            int i141118 = b;
                            int i141119 = i141118 & 123;
                            int i159 = (i141118 ^ 123) | i141119;
                            i13 = (i141119 ^ i159) + ((i159 & i141119) << 1);
                            a = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i1510 = 3 / 2;
                            }
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                    int i1511 = a;
                    int i1512 = ((i1511 & 16) + (i1511 | 16)) - 1;
                    b = i1512 % 128;
                    int i1513 = i1512 % 2;
                }
            }
            eventType = xmlPullParser.next();
            int i160 = a;
            int i161 = i160 & 41;
            int i162 = (i160 | 41) & (~i161);
            int i163 = i161 << 1;
            int i164 = ((i162 | i163) << 1) - (i162 ^ i163);
            b = i164 % 128;
            int i165 = i164 % 2;
            theme2 = theme;
            i17 = 1;
        }
        bIe bie2 = this.d;
        if (bie2.e == null) {
            bie2.e = new AnimatorSet();
            int i166 = a;
            int i167 = (i166 ^ 63) + ((i166 & 63) << 1);
            b = i167 % 128;
            int i168 = i167 % 2;
        }
        bie2.e.playTogether(bie2.f);
        int i169 = b;
        int i170 = ((i169 ^ 1) | (i169 & 1)) << 1;
        int i171 = -(((~i169) & 1) | (i169 & (-2)));
        int i172 = (i170 & i171) + (i171 | i170);
        a = i172 % 128;
        if (i172 % 2 != 0) {
            int i173 = 61 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = b + 91;
        a = i2 % 128;
        int i3 = i2 % 2;
        inflate(resources, xmlPullParser, attributeSet, null);
        int i4 = a;
        int i5 = i4 & 5;
        int i6 = -(-((i4 ^ 5) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
