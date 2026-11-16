package ivas.gov.bisp.enumeration.aK;

import android.content.Context;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aL.c;

/* JADX INFO: loaded from: classes.dex */
public class S {
    private static int a = 1;
    private static int b;
    public static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;

    static {
        int i = a;
        int i2 = ((i ^ 101) | (i & 101)) << 1;
        int i3 = -(((~i) & 101) | (i & (-102)));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public S(Context context) {
        boolean zC = c.c(context, R.attr.elevationOverlayEnabled, false);
        int i = a;
        int i2 = i & 103;
        int i3 = (i | 103) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iT = r.t(context, R.attr.elevationOverlayColor, 0);
        int iT2 = r.t(context, R.attr.elevationOverlayAccentColor, 0);
        int i7 = a;
        int i8 = i7 & 111;
        int i9 = (((i7 | 111) & (~i8)) - (~(i8 << 1))) - 1;
        b = i9 % 128;
        int iT3 = i9 % 2 != 0 ? r.t(context, R.attr.colorSurface, 1) : r.t(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.d = zC;
        this.e = iT;
        this.f = iT2;
        this.g = iT3;
        this.h = f;
    }
}
