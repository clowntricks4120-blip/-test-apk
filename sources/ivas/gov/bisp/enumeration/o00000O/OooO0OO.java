package ivas.gov.bisp.enumeration.o00000O;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import ivas.gov.bisp.enumeration.aH.r;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends FrameLayout implements r {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = ((i2 ^ 99) | i3) << 1;
        int i5 = -((i2 | 99) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        super.draw(canvas);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 59;
        int i4 = -(-((i2 & 59) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = i3 + ((i2 ^ 35) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public int getCircularRevealScrimColor() {
        int i = 2 % 2;
        int i2 = a + 63;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 15 / 0;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public r.bdX getRevealInfo() {
        int i = 2 % 2;
        int i2 = b + 23;
        a = i2 % 128;
        int i3 = i2 % 2;
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 36) << 1) - (i2 ^ 36)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsOpaque = super.isOpaque();
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        int i6 = a;
        int i7 = i6 & 17;
        int i8 = i7 + ((i6 ^ 17) | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 95 / 0;
        }
        return zIsOpaque;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-50)) | ((~i2) & 49)) + ((i2 & 49) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setCircularRevealScrimColor(int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((b + 30) ^ (-1));
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setRevealInfo(r.bdX bdx) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = ((((i2 ^ 63) | i3) << 1) - (~(-((i2 | 63) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        throw null;
    }
}
