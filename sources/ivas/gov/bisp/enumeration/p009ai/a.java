package ivas.gov.bisp.enumeration.p009ai;

import ivas.gov.bisp.enumeration.Oooo0o0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public class a implements o00oO0o<x.aVW> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ P c;

    public a(P p) {
        this.c = p;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        b = i3 % 128;
        int i4 = i3 % 2;
        x.aVW avw = (x.aVW) obj;
        if (avw == null) {
            avw = new x.aVW(-3);
            int i5 = a;
            int i6 = i5 ^ 39;
            int i7 = ((i5 & 39) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        this.c.c(avw);
        int i11 = a;
        int i12 = i11 ^ 5;
        int i13 = (i11 & 5) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
    }
}
