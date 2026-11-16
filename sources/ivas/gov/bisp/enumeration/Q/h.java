package ivas.gov.bisp.enumeration.Q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final c a;
    public final c b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;
    public final c g;
    public final Paint h;

    public h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ivas.gov.bisp.enumeration.aL.c.d(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.h.class.getCanonicalName()), ivas.gov.bisp.enumeration.O.r.A);
        this.a = c.c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.g = c.c(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.b = c.c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.c = c.c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListB = ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 6);
        this.d = c.c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = c.c(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.e = c.c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
