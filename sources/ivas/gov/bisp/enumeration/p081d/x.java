package ivas.gov.bisp.enumeration.p081d;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private static int a = 0;
    private static int b = 1;
    public final View c;
    public ViewTreeObserver d;
    public final Runnable e;

    public x(View view, Runnable runnable) {
        this.c = view;
        this.d = view.getViewTreeObserver();
        this.e = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final void d() {
        int i = 2 % 2;
        int i2 = b + 63;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
            if (!this.d.isAlive()) {
                this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int i4 = a;
                int i5 = (i4 ^ 123) + ((i4 & 123) << 1);
                b = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = b;
                int i8 = ((i7 & 19) - (~(-(-(i7 | 19))))) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                this.d.removeOnPreDrawListener(this);
                int i10 = a;
                int i11 = ((i10 | 27) << 1) - (((~i10) & 27) | (i10 & (-28)));
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (this.d.isAlive()) {
            int i13 = b;
            int i14 = ((i13 & 19) - (~(-(-(i13 | 19))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            this.d.removeOnPreDrawListener(this);
            int i16 = a;
            int i17 = ((i16 | 27) << 1) - (((~i16) & 27) | (i16 & (-28)));
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            int i19 = a;
            int i20 = (i19 ^ 123) + ((i19 & 123) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        this.c.removeOnAttachStateChangeListener(this);
        int i22 = a;
        int i23 = i22 & 77;
        int i24 = ((i22 | 77) & (~i23)) + (i23 << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (i3 - (~((i2 ^ 85) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d = view.getViewTreeObserver();
        int i6 = a;
        int i7 = i6 & 105;
        int i8 = -(-((i6 ^ 105) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        b = i3 % 128;
        int i4 = i3 % 2;
        d();
        int i5 = b;
        int i6 = i5 ^ 93;
        int i7 = (i5 & 93) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static x c(View view, Runnable runnable) {
        int i = 2 % 2;
        Objects.requireNonNull(view, "view == null");
        x xVar = new x(view, runnable);
        int i2 = a;
        int i3 = i2 | 9;
        int i4 = (i3 << 1) - ((~(i2 & 9)) & i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        int i6 = a;
        int i7 = ((i6 ^ 111) | (i6 & 111)) << 1;
        int i8 = -(((~i6) & 111) | (i6 & (-112)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 11) | (i2 & 11)) << 1;
        int i4 = -(((~i2) & 11) | (i2 & (-12)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        d();
        this.e.run();
        int i7 = b;
        int i8 = i7 + 58;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i7 & 69;
        int i12 = i11 + ((i7 ^ 69) | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }
}
