package ivas.gov.bisp.enumeration.p088k;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class A implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Typeface d;
    public final /* synthetic */ int e;

    public A(C0322v c0322v, TextView textView, Typeface typeface, int i) {
        this.c = textView;
        this.d = typeface;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 106) << 1) - (i2 ^ 106);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        TextView textView = this.c;
        Typeface typeface = this.d;
        int i7 = this.e;
        int i8 = (-2) - (((i5 ^ 42) + ((i5 & 42) << 1)) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        textView.setTypeface(typeface, i7);
        int i10 = a;
        int i11 = i10 | 93;
        int i12 = (i11 << 1) - ((~(i10 & 93)) & i11);
        b = i12 % 128;
        int i13 = i12 % 2;
    }
}
