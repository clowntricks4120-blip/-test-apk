package ivas.gov.bisp.enumeration.o00000OO;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ivas.gov.bisp.enumeration.aH.r;
import ivas.gov.bisp.enumeration.o000000o.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o extends OooO0O0 implements r {
    private static int j = 1;
    private static int k;

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void b() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        k = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 47;
        int i4 = ((i2 | 47) & (~i3)) + (i3 << 1);
        k = i4 % 128;
        int i5 = i4 % 2;
        super.draw(canvas);
        int i6 = j;
        int i7 = i6 & 21;
        int i8 = i7 + ((i6 ^ 21) | i7);
        k = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void e() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 29;
        int i4 = i3 + ((i2 ^ 29) | i3);
        k = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        j = i6 % 128;
        int i7 = i6 % 2;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public int getCircularRevealScrimColor() {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 37;
        int i4 = i2 | 37;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        k = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i6 = 23 / 0;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public r.bdX getRevealInfo() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = ((i2 & 74) + (i2 | 74)) - 1;
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        int i = 2 % 2;
        int i2 = k;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = -(-((i2 & 71) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        j = i5 % 128;
        int i6 = i5 % 2;
        boolean zIsOpaque = super.isOpaque();
        int i7 = j + 29;
        k = i7 % 128;
        int i8 = i7 % 2;
        return zIsOpaque;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = j + 63;
        k = i2 % 128;
        int i3 = i2 % 2;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setCircularRevealScrimColor(int i) {
        int i2 = 2 % 2;
        int i3 = k + 47;
        j = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aH.r
    public void setRevealInfo(r.bdX bdx) {
        int i = 2 % 2;
        int i2 = j;
        int i3 = i2 & 93;
        int i4 = ((((i2 ^ 93) | i3) << 1) - (~(-((i2 | 93) & (~i3))))) - 1;
        k = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }
}
