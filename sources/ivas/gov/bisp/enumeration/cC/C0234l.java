package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.o00O0oO.o0OoOo0;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234l extends x {
    private static int a = 1;
    private static int b;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.l$bCT */
    public static class bCT extends o0OoOo0.OooO00o<bCT> {
        private static int a = 1;
        private static int b;
        public int g;
        public int h;
        public int i;

        public bCT() {
            super(0);
            this.h = 0;
            this.g = 0;
            this.i = 0;
        }

        public x.bCP c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 69;
            int i4 = ((i2 | 69) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public x g() {
            int i = 2 % 2;
            C0234l c0234l = new C0234l(this, null);
            int i2 = b;
            int i3 = i2 & 39;
            int i4 = ((i2 ^ 39) | i3) << 1;
            int i5 = -((i2 | 39) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return c0234l;
        }
    }

    public C0234l(bCT bct, bCS bcs) {
        super(bct);
        this.h = bct.h;
        this.g = bct.g;
        this.i = bct.i;
    }

    @Override // ivas.gov.bisp.enumeration.cC.x
    public final byte[] c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArrC = super.c();
        int i8 = this.h;
        if (i7 != 0) {
            h.i(i8, bArrC, 25);
        } else {
            h.i(i8, bArrC, 16);
        }
        int i9 = b + 13;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            h.i(this.g, bArrC, 2);
        } else {
            h.i(this.g, bArrC, 20);
        }
        h.i(this.i, bArrC, 24);
        int i10 = a;
        int i11 = ((i10 | 65) << 1) - (i10 ^ 65);
        b = i11 % 128;
        int i12 = i11 % 2;
        return bArrC;
    }
}
