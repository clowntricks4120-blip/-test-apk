package ivas.gov.bisp.enumeration.p009ai;

import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p007ag.e;

/* JADX INFO: loaded from: classes.dex */
public class z implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ h c;
    public final /* synthetic */ int d;

    public z(P p, h hVar, int i) {
        this.c = hVar;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
        b = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.c;
        int i5 = this.d;
        C0084m.aTa ata = ((e.aVq) hVar).a;
        int i6 = b;
        int i7 = (i6 & 25) + (i6 | 25);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        Object obj = null;
        if (ata != null) {
            int i10 = i8 & 115;
            int i11 = (i10 - (~((i8 ^ 115) | i10))) - 1;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                ata.f(i5);
                obj.hashCode();
                throw null;
            }
            ata.f(i5);
            int i12 = a + 35;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = b + 63;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }
}
