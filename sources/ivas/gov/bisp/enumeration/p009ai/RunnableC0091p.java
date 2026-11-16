package ivas.gov.bisp.enumeration.p009ai;

import android.graphics.Typeface;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p007ag.e;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ai.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0091p implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ h c;
    public final /* synthetic */ Typeface d;

    public RunnableC0091p(P p, h hVar, Typeface typeface) {
        this.c = hVar;
        this.d = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 41) | (i2 & 41)) << 1) - (~(-(((~i2) & 41) | (i2 & (-42)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            C0084m.aTa ata = ((e.aVq) this.c).a;
            throw null;
        }
        h hVar = this.c;
        Typeface typeface = this.d;
        C0084m.aTa ata2 = ((e.aVq) hVar).a;
        if (ata2 != null) {
            int i4 = b;
            int i5 = i4 & 49;
            int i6 = -(-(i4 | 49));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            ata2.g(typeface);
            int i9 = a;
            int i10 = i9 & 115;
            int i11 = (i9 | 115) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 % 3;
            }
        }
        int i15 = b + 77;
        a = i15 % 128;
        int i16 = i15 % 2;
    }
}
