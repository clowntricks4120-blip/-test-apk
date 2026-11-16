package ivas.gov.bisp.enumeration.p013am;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t {
    private static int a = 0;
    private static int b = 1;

    public a(P p) {
        super(p);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = (((i7 & (-60)) | ((~i7) & 59)) - (~((i7 & 59) << 1))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        Objects.requireNonNull(b.c());
        P p = this.d;
        int i10 = a;
        int i11 = i10 & 89;
        int i12 = (i10 ^ 89) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
        float f2 = i4;
        Typeface typeface = p.e.d;
        int i15 = b;
        int i16 = (i15 ^ 111) + ((i15 & 111) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i18 = b;
        int i19 = (i18 | 67) << 1;
        int i20 = -(i18 ^ 67);
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = p.d;
        char[] cArr = p.e.b;
        int i24 = b;
        int i25 = i24 & 67;
        int i26 = ((((i24 ^ 67) | i25) << 1) - (~(-((i24 | 67) & (~i25))))) - 1;
        a = i26 % 128;
        canvas.drawText(cArr, i26 % 2 != 0 ? i23 * 4 : i23 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface2);
        int i27 = a;
        int i28 = ((i27 ^ 119) | (i27 & 119)) << 1;
        int i29 = -(((~i27) & 119) | (i27 & (-120)));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        int i31 = i30 % 2;
    }
}
