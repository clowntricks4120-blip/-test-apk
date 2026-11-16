package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.o00O0oO.o0OoOo0;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public final class u extends x {
    private static int a = 0;
    private static int b = 1;
    public final int g;
    public final int h;
    public final int i;

    public static class bCW extends o0OoOo0.OooO00o<bCW> {
        private static int a = 1;
        private static int b;
        public int g;
        public int h;
        public int i;

        public bCW() {
            super(1);
            this.h = 0;
            this.g = 0;
            this.i = 0;
        }

        public x.bCP c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 51) | (i2 & 51)) << 1;
            int i4 = -(((~i2) & 51) | (i2 & (-52)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return this;
        }

        public x g() {
            int i = 2 % 2;
            u uVar = new u(this, null);
            int i2 = a + 46;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return uVar;
            }
            throw null;
        }
    }

    public u(bCW bcw, bCV bcv) {
        super(bcw);
        this.h = bcw.h;
        this.g = bcw.g;
        this.i = bcw.i;
    }

    @Override // ivas.gov.bisp.enumeration.cC.x
    public final byte[] c() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 100) + ((i4 & 100) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArrC = super.c();
        h.i(this.h, bArrC, 16);
        int i7 = (-2) - ((a + 54) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            i = this.g;
            i2 = 5;
        } else {
            i = this.g;
            i2 = 20;
        }
        h.i(i, bArrC, i2);
        h.i(this.i, bArrC, 24);
        int i8 = a;
        int i9 = i8 & 73;
        int i10 = ((i8 | 73) & (~i9)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return bArrC;
    }
}
