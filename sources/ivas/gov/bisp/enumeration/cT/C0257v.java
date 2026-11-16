package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cT.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257v {
    private static int a = 1;
    private static int b;
    public static C0257v c;
    public A d;
    public A e;
    public A f;
    public A g;
    public A h;

    public C0257v() {
        W w = W.c;
        X x = X.c;
        L l = L.c;
        am amVar = am.c;
        C c2 = C.c;
        C0256s c0256s = C0256s.c;
        this.d = new A(new R[]{w, x, l, amVar, c2, c0256s});
        this.e = new A(new R[]{D.c, w, x, l, amVar, c2, c0256s});
        y yVar = y.c;
        al alVar = al.c;
        this.f = new A(new R[]{yVar, alVar, x, c2, c0256s});
        this.g = new A(new R[]{yVar, n.c, alVar, x, c0256s});
        this.h = new A(new R[]{alVar, x, c0256s});
    }

    public final String toString() {
        R[] rArr;
        String strS;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 68) + (i2 | 68)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.w("ConverterManager[");
            int length = this.d.c.length;
            throw null;
        }
        StringBuilder sbW = j.w("ConverterManager[");
        int length2 = this.d.c.length;
        int i4 = a;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            sbW.append(length2);
            sbW.append(" instant,");
            throw null;
        }
        sbW.append(length2);
        sbW.append(" instant,");
        sbW.append(this.e.c.length);
        int i6 = a;
        int i7 = i6 & 33;
        int i8 = i7 + ((i6 ^ 33) | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            sbW.append(" partial,");
            rArr = this.f.c;
            int i9 = 34 / 0;
        } else {
            sbW.append(" partial,");
            rArr = this.f.c;
        }
        int i10 = a;
        int i11 = i10 & 25;
        int i12 = i10 | 25;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            sbW.append(rArr.length);
            sbW.append(" duration,");
            throw null;
        }
        sbW.append(rArr.length);
        sbW.append(" duration,");
        int i14 = b + 110;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            sbW.append(this.g.c.length);
            int i16 = 14 / 0;
        } else {
            sbW.append(this.g.c.length);
        }
        sbW.append(" period,");
        R[] rArr2 = this.h.c;
        int i17 = a;
        int i18 = (i17 ^ 39) + ((i17 & 39) << 1);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            strS = j.s(sbW, rArr2.length, " interval]");
            int i19 = 49 / 0;
        } else {
            strS = j.s(sbW, rArr2.length, " interval]");
        }
        int i20 = a;
        int i21 = ((i20 & 43) - (~(i20 | 43))) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
        return strS;
    }
}
