package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.AbstractC0255p;

/* JADX INFO: loaded from: classes.dex */
public class P extends AbstractC0255p {
    private static int a = 0;
    private static int b = 1;
    public final h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(h hVar) {
        super(AbstractC0246t.h, hVar.bC());
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.f = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long B(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = i4 + ((i3 ^ 43) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iBN = this.f.bN();
        int iBL = this.f.bL();
        int i7 = b;
        int i8 = i7 & 115;
        int i9 = (i7 ^ 115) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = (iBN ^ (-1)) | iBN;
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, (iBN & i11) + (iBN | i11), (iBL ^ 1) + ((iBL & 1) << 1));
        } else {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, (-2) - (iBN ^ (-1)), iBL + 1);
        }
        long jBZ = this.f.bZ(j, i);
        int i12 = b;
        int i13 = (((i12 | 26) << 1) - (i12 ^ 26)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        return jBZ;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = ((i2 ^ 117) | i3) << 1;
        int i5 = -((i2 | 117) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        long jD = d(j, ivas.gov.bisp.enumeration.p100w.r.aa(j2));
        int i8 = b;
        int i9 = i8 & 111;
        int i10 = -(-((i8 ^ 111) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return jD;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 83) + (i2 | 83);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iBU = this.f.bU(j);
        int i5 = a;
        int i6 = i5 & 89;
        int i7 = (i6 - (~(-(-((i5 ^ 89) | i6))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 79 / 0;
        }
        return iBU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return -r5.f.bT(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r5.f.bT(r8, r6);
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r6 = r5.f.bT(r6, r8);
        r8 = ivas.gov.bisp.enumeration.cR.P.b;
        r8 = (-2) - (((r8 & 124) + (r8 | 124)) ^ (-1));
        ivas.gov.bisp.enumeration.cR.P.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if ((r8 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r6 < r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r6 < r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = ((r1 | 25) << 1) - (r1 ^ 25);
        ivas.gov.bisp.enumeration.cR.P.a = r2 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long n(long r6, long r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.P.b
            r2 = r1 & 61
            r3 = r1 ^ 61
            r3 = r3 | r2
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cR.P.a = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L21
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r4 = 72
            int r4 = r4 / 0
            if (r2 >= 0) goto L44
            goto L25
        L21:
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L44
        L25:
            r2 = r1 | 25
            int r2 = r2 << 1
            r1 = r1 ^ 25
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cR.P.a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L3b
            ivas.gov.bisp.enumeration.cR.h r0 = r5.f
            long r6 = r0.bT(r8, r6)
            long r6 = -r6
            return r6
        L3b:
            ivas.gov.bisp.enumeration.cR.h r0 = r5.f
            r0.bT(r8, r6)
            r3.hashCode()
            throw r3
        L44:
            ivas.gov.bisp.enumeration.cR.h r1 = r5.f
            long r6 = r1.bT(r6, r8)
            int r8 = ivas.gov.bisp.enumeration.cR.P.b
            r9 = r8 & 124(0x7c, float:1.74E-43)
            r8 = r8 | 124(0x7c, float:1.74E-43)
            int r9 = r9 + r8
            r8 = r9 ^ (-1)
            int r8 = (-2) - r8
            int r9 = r8 % 128
            ivas.gov.bisp.enumeration.cR.P.a = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L5d
            return r6
        L5d:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.P.n(long, long):long");
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iBN = this.f.bN();
        int i5 = a;
        int i6 = (i5 & (-4)) | ((~i5) & 3);
        int i7 = (i5 & 3) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return iBN;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 86) + (i2 | 86)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        int iBL = this.f.bL();
        int i5 = a;
        int i6 = (i5 & 15) + (i5 | 15);
        b = i6 % 128;
        int i7 = i6 % 2;
        return iBL;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-74)) | ((~i2) & 73);
        int i4 = (i2 & 73) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        h hVar = this.f;
        int iBU = hVar.bU(j);
        int i7 = b;
        int i8 = ((((i7 ^ 75) | (i7 & 75)) << 1) - (~(-(((~i7) & 75) | (i7 & (-76)))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        long jBV = j - hVar.bV(iBU);
        int i10 = b;
        int i11 = i10 & 33;
        int i12 = i11 + ((i10 ^ 33) | i11);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return jBV;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public boolean u(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f;
        boolean zBX = hVar.bX(hVar.bU(j));
        int i5 = b;
        int i6 = ((i5 & 42) + (i5 | 42)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return zBX;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean w() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 19) << 1) - (((~i2) & 19) | (i2 & (-20)));
        int i4 = i3 % 128;
        b = i4;
        boolean z = i3 % 2 == 0;
        int i5 = ((i4 & (-64)) | ((~i4) & 63)) + ((i4 & 63) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i4 = -(((~i2) & 83) | (i2 & (-84)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        h hVar = this.f;
        int iBU = hVar.bU(j);
        int i7 = b + 47;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            hVar.bV(iBU);
            throw null;
        }
        long jBV = hVar.bV(iBU);
        int i8 = b;
        int i9 = i8 & 65;
        int i10 = (i8 | 65) & (~i9);
        int i11 = i9 << 1;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return jBV;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 9) + ((i3 & 9) << 1);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.f.bN();
            obj.hashCode();
            throw null;
        }
        int iBN = this.f.bN();
        int i5 = a;
        int i6 = (i5 ^ 97) + ((i5 & 97) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, iBN, this.f.bL());
            throw null;
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, iBN, this.f.bL());
        h hVar = this.f;
        int i7 = a;
        int i8 = i7 & 103;
        int i9 = ((i7 ^ 103) | i8) << 1;
        int i10 = -((i7 | 103) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return hVar.bZ(j, i);
        }
        long jBZ = hVar.bZ(j, i);
        int i12 = 90 / 0;
        return jBZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if ((r1 & r10) >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (((r2 | (r1 ^ r10)) & (~r2)) >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r8 = new java.lang.StringBuilder();
        r8.append("The calculation caused an overflow: ");
        r9 = ivas.gov.bisp.enumeration.cR.P.b;
        r2 = (r9 & 105) + (r9 | 105);
        ivas.gov.bisp.enumeration.cR.P.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        r8.append(r1);
        r8.append(" + ");
        r9 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r8.append(r1);
        r8.append(" + ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        r8.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        throw new java.lang.ArithmeticException(r8.toString());
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d(long r8, int r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.P.d(long, int):long");
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 125;
        int i4 = ((((i2 & 125) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.f.k;
        int i6 = b + 69;
        a = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        h hVar;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 58) + (i3 | 58)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.bU(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iBU = this.f.bU(j);
        h hVar2 = this.f;
        int i5 = a;
        int i6 = (i5 ^ 9) + ((i5 & 9) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (j != hVar2.bV(iBU)) {
            int i8 = b;
            int i9 = i8 ^ 97;
            int i10 = ((i8 & 97) | i9) << 1;
            int i11 = -i9;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                hVar = this.f;
                i = iBU << 1;
            } else {
                hVar = this.f;
                i = (iBU ^ 1) + ((iBU & 1) << 1);
            }
            j = hVar.bV(i);
        }
        int i13 = b;
        int i14 = i13 & 57;
        int i15 = (i13 ^ 57) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        return j;
    }
}
