package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.o00O0oO.o0OoOo0;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239t extends x {
    private static int a = 0;
    private static int b = 1;
    public final int g;
    public final int h;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.t$bCQ */
    public static class bCQ extends o0OoOo0.OooO00o<bCQ> {
        private static int a = 0;
        private static int b = 1;
        public int g;
        public int h;

        public bCQ() {
            super(2);
            this.h = 0;
            this.g = 0;
        }

        public x.bCP c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = ((i2 ^ 107) | i3) << 1;
            int i5 = -((i2 | 107) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = ((i7 | 21) << 1) - (i7 ^ 21);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public x g() {
            int i = 2 % 2;
            C0239t c0239t = new C0239t(this, null);
            int i2 = a;
            int i3 = ((i2 & 29) - (~(-(-(i2 | 29))))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return c0239t;
        }
    }

    public C0239t(bCQ bcq, bCO bco) {
        super(bcq);
        this.h = bcq.h;
        this.g = bcq.g;
    }

    @Override // ivas.gov.bisp.enumeration.cC.x
    public final byte[] c() {
        int i = 2 % 2;
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrC = super.c();
        h.i(0, bArrC, 16);
        int i4 = a;
        int i5 = (i4 & (-30)) | ((~i4) & 29);
        int i6 = (i4 & 29) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        h.i(this.h, bArrC, i7 % 2 == 0 ? 19 : 20);
        int i8 = this.g;
        int i9 = b + 81;
        a = i9 % 128;
        int i10 = i9 % 2;
        h.i(i8, bArrC, 24);
        int i11 = b;
        int i12 = i11 & 115;
        int i13 = i11 | 115;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        return bArrC;
    }
}
