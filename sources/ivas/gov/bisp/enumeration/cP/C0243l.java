package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cR.c;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0243l extends c {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final AbstractC0242a ap() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = -(-(i2 | 83));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 45;
        int i9 = i8 + ((i6 ^ 45) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final h ba() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 11;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 11)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i7 & 75;
        int i9 = (((i7 ^ 75) | i8) << 1) - ((i7 | 75) & (~i8));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 74 / 0;
        }
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 33;
        int i4 = ((((i2 & 33) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 101;
        int i7 = (i2 | 101) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i3 - (~(-(-((i2 ^ 75) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String name = C0243l.class.getName();
        int i6 = a;
        int i7 = (i6 & 103) + (i6 | 103);
        b = i7 % 128;
        int i8 = i7 % 2;
        return name;
    }
}
