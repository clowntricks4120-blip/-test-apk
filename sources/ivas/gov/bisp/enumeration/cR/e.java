package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ivas.gov.bisp.enumeration.cS.u {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int f;
    public final h g;

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 9;
        int i6 = -(-((i2 ^ 9) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 1;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 1)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.f != 0) {
            int i8 = i2 & 61;
            int i9 = -(-((i2 ^ 61) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return 53;
        }
        Objects.requireNonNull(this.g);
        int i12 = a;
        int i13 = (((i12 & (-6)) | ((~i12) & 5)) - (~(-(-((i12 & 5) << 1))))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        return 366;
    }

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 45) + (i2 | 45);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.f != 1) {
            long jT = super.t(j);
            int i4 = b;
            int i5 = ((i4 & 92) + (i4 | 92)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return jT;
        }
        long jT2 = super.t(j + 259200000);
        int i7 = b;
        int i8 = (((i7 ^ 23) | (i7 & 23)) << 1) - (((~i7) & 23) | (i7 & (-24)));
        a = i8 % 128;
        int i9 = i8 % 2;
        return jT2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final boolean u(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = i3 + ((i2 ^ 31) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.f != 0) {
            int i6 = (i2 ^ 21) + ((i2 & 21) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        boolean zBY = this.g.bY(j);
        int i7 = a;
        int i8 = ((((i7 ^ 29) | (i7 & 29)) << 1) - (~(-(((~i7) & 29) | (i7 & (-30)))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return zBY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = b + 15;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (this.f == 1) {
            long jY = super.y(j + 259200000) - 259200000;
            int i4 = a;
            int i5 = (i4 & 49) + (i4 | 49);
            b = i5 % 128;
            int i6 = i5 % 2;
            return jY;
        }
        long jY2 = super.y(j);
        int i7 = b;
        int i8 = i7 & 17;
        int i9 = i7 | 17;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return jY2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = -(-((i2 ^ 89) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f == 1) {
            long jZ = super.z(j + 259200000) - 259200000;
            int i6 = (-2) - ((a + 78) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 80 / 0;
            }
            return jZ;
        }
        long jZ2 = super.z(j);
        int i8 = a;
        int i9 = i8 & 65;
        int i10 = (i8 | 65) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return jZ2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ivas.gov.bisp.enumeration.cP.J j, int i) {
        super(AbstractC0246t.i, j);
        this.f = i;
        if (i != 1) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            this.g = hVar;
        } else {
            AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
            super(AbstractC0246t.n, j);
            this.g = hVar;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 53;
        int i4 = (i2 & 53) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.f == 0) {
            ivas.gov.bisp.enumeration.cP.J j = this.g.n;
            int i7 = a;
            int i8 = ((i7 ^ 93) - (~((i7 & 93) << 1))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return j;
        }
        int i10 = (i2 & 85) + (i2 | 85);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0) {
            int i12 = 2 % 4;
        }
        int i13 = (((i11 | 48) << 1) - (i11 ^ 48)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return this.g.m;
        }
        ivas.gov.bisp.enumeration.cP.J j2 = this.g.m;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // ivas.gov.bisp.enumeration.cS.u
    public final int F(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 103;
        int i5 = (i3 ^ 103) | i4;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.f != 0) {
            int i8 = ((i3 | 39) << 1) - (i3 ^ 39);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int iE = 52;
            if (i > 52) {
                int i11 = ((i9 | 15) << 1) - (i9 ^ 15);
                a = i11 % 128;
                int i12 = i11 % 2;
                iE = E(j);
                int i13 = b;
                int i14 = ((i13 & (-76)) | ((~i13) & 75)) + ((i13 & 75) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = a;
            int i17 = i16 & 119;
            int i18 = i17 + ((i16 ^ 119) | i17);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 40 / 0;
            }
            return iE;
        }
        Objects.requireNonNull(this.g);
        int iE2 = 365;
        if (i <= 365) {
            int i20 = a;
            int i21 = i20 & 31;
            int i22 = ((i20 | 31) & (~i21)) + (i21 << 1);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            if (i <= 0) {
                iE2 = E(j);
                int i23 = a;
                int i24 = i23 & 103;
                int i25 = i23 | 103;
                int i26 = (i24 & i25) + (i25 | i24);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        } else {
            iE2 = E(j);
            int i28 = a;
            int i29 = i28 & 103;
            int i210 = i28 | 103;
            int i211 = (i29 & i210) + (i210 | i29);
            b = i211 % 128;
            int i212 = i211 % 2;
        }
        int i30 = a;
        int i31 = (i30 & 125) + (i30 | 125);
        b = i31 % 128;
        int i32 = i31 % 2;
        return iE2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 51) << 1) - (i2 ^ 51);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.f == 0) {
            h hVar = this.g;
            int iBU = hVar.bU(j);
            int i5 = b;
            int i6 = ((i5 | 17) << 1) - (i5 ^ 17);
            a = i6 % 128;
            int i7 = i6 % 2;
            int iBV = (int) ((j - hVar.bV(iBU)) / 86400000);
            int i8 = b;
            int i9 = (i8 | 71) << 1;
            int i10 = -(((~i8) & 71) | (i8 & (-72)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return iBV;
            }
            int i12 = iBV ^ 1;
            int i13 = (iBV & 1) << 1;
            return ((i12 | i13) << 1) - (i13 ^ i12);
        }
        int i14 = ((i2 | 21) << 1) - (i2 ^ 21);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        int i17 = ((i15 | 110) << 1) - (i15 ^ 110);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        b = i18 % 128;
        Object obj = null;
        if (i18 % 2 != 0) {
            this.g.bU(j);
            throw null;
        }
        h hVar2 = this.g;
        int iBQ = hVar2.bQ(j, hVar2.bU(j));
        int i19 = a;
        int i20 = i19 & 33;
        int i21 = (i19 | 33) & (~i20);
        int i22 = -(-(i20 << 1));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            return iBQ;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        return r4.g.bR(r4.g.bS(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r5 = r4.g.bU(r5);
        r6 = r4.g;
        r1 = ivas.gov.bisp.enumeration.cR.e.a + 53;
        ivas.gov.bisp.enumeration.cR.e.b = r1 % 128;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if ((!r6.bX(r5)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cR.e.b;
        r6 = r5 & 63;
        r5 = (r5 | 63) & (~r6);
        r6 = r6 << 1;
        r1 = ((r5 | r6) << 1) - (r5 ^ r6);
        ivas.gov.bisp.enumeration.cR.e.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r5 = 3 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r5 = 365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cR.e.a;
        r6 = ((r5 ^ 2) + ((r5 & 2) << 1)) - 1;
        r5 = r6 % 128;
        ivas.gov.bisp.enumeration.cR.e.b = r5;
        r6 = r6 % 2;
        r6 = (((r5 ^ 13) | (r5 & 13)) << 1) - (((~r5) & 13) | (r5 & (-14)));
        ivas.gov.bisp.enumeration.cR.e.a = r6 % 128;
        r6 = r6 % 2;
        r5 = 366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cR.e.b;
        r1 = r6 & 101;
        r6 = (((r6 | 101) & (~r1)) - (~(-(-(r1 << 1))))) - 1;
        ivas.gov.bisp.enumeration.cR.e.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if ((r6 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r6.bX(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return r4.g.bR(r4.g.bS(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4.f != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4.f != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = r1 & 101;
        r2 = r2 + ((r1 ^ 101) | r2);
        ivas.gov.bisp.enumeration.cR.e.a = r2 % 128;
        r2 = r2 % 2;
        r1 = r1 + 87;
        ivas.gov.bisp.enumeration.cR.e.a = r1 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E(long r5) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.e.E(long):int");
    }
}
