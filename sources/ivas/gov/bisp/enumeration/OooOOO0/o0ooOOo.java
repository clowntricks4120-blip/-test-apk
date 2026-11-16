package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.S;
import ivas.gov.bisp.enumeration.p088k.ad;

/* JADX INFO: loaded from: classes.dex */
public class o0ooOOo extends SeekBar {
    private static int a = 1;
    private static int b;
    public final S c;

    public o0ooOOo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        ad.b(this, getContext());
        S s = new S(this);
        this.c = s;
        s.c(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.c.f(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 89;
        int i4 = (i2 & 89) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            super.drawableStateChanged();
            Drawable drawable = this.c.i;
            obj.hashCode();
            throw null;
        }
        super.drawableStateChanged();
        S s = this.c;
        Drawable drawable2 = s.i;
        if (drawable2 != null) {
            int i6 = b + 67;
            a = i6 % 128;
            int i7 = i6 % 2;
            if (drawable2.isStateful()) {
                int i8 = a;
                int i9 = i8 ^ 39;
                int i10 = (((i8 & 39) | i9) << 1) - i9;
                b = i10 % 128;
                int i11 = i10 % 2;
                if (!(!drawable2.setState(s.g.getDrawableState()))) {
                    int i12 = a;
                    int i13 = i12 & 107;
                    int i14 = (((i12 | 107) & (~i13)) - (~(i13 << 1))) - 1;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    s.g.invalidateDrawable(drawable2);
                    int i16 = a;
                    int i17 = i16 & 57;
                    int i18 = (((i16 ^ 57) | i17) << 1) - ((i16 | 57) & (~i17));
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 5 / 4;
                    }
                }
            }
        }
        int i20 = a;
        int i21 = i20 & 49;
        int i22 = (i20 | 49) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 30) + (i2 | 30)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            super.jumpDrawablesToCurrentState();
            Drawable drawable = this.c.i;
            throw null;
        }
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.c.i;
        if (drawable2 != null) {
            int i4 = a;
            int i5 = i4 & 31;
            int i6 = (i4 | 31) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                drawable2.jumpToCurrentState();
                throw null;
            }
            drawable2.jumpToCurrentState();
        }
        int i9 = b;
        int i10 = ((i9 | 37) << 1) - (i9 ^ 37);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
    }
}
