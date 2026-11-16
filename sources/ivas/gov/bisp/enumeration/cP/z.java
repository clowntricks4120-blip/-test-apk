package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cQ.i;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public final class z extends i {
    private static int a = 0;
    private static int b = 1;

    public z() {
    }

    @Override // ivas.gov.bisp.enumeration.cQ.e
    public final z d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 99;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        a = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public z(long j, AbstractC0242a abstractC0242a) {
        super(j, abstractC0242a);
    }

    public z(Object obj) {
        super(obj, (h) null);
    }

    public z(int i, int i2, int i3, int i4, int i5, int i6, int i7, h hVar) {
        super(i, i2, i3, i4, i5, i6, i7, hVar);
    }
}
