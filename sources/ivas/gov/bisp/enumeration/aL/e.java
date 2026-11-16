package ivas.gov.bisp.enumeration.aL;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public class e extends ivas.gov.bisp.enumeration.p096p.h {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ TextPaint d;
    public final /* synthetic */ ivas.gov.bisp.enumeration.p096p.h e;
    public final /* synthetic */ r f;

    public e(r rVar, TextPaint textPaint, ivas.gov.bisp.enumeration.p096p.h hVar) {
        this.f = rVar;
        this.d = textPaint;
        this.e = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public void aH(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 67;
        int i5 = ((i3 | 67) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.aH(i);
        int i7 = (-2) - ((a + 84) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 65 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public void aG(Typeface typeface, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f.i(this.d, typeface);
        int i5 = b;
        int i6 = ((i5 & 2) + (i5 | 2)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        this.e.aG(typeface, z);
        if (i7 == 0) {
            int i8 = 36 / 0;
        }
    }
}
