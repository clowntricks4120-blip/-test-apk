package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.AbstractC0255p;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0255p {
    private static int a = 0;
    private static int b = 1;
    public final h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h hVar) {
        super(AbstractC0246t.l, hVar.bC());
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.f = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = a + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jD = d(j, ivas.gov.bisp.enumeration.p100w.r.aa(j2));
        int i4 = a;
        int i5 = (i4 ^ 51) + ((i4 & 51) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBS = this.f.bS(j);
        int i8 = a;
        int i9 = i8 ^ 21;
        int i10 = (((i8 & 21) | i9) << 1) - i9;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 73 / 0;
        }
        return iBS;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-124)) | ((~i2) & 123);
        int i4 = (i2 & 123) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iBN = this.f.bN();
        int i7 = a;
        int i8 = (i7 & (-52)) | ((~i7) & 51);
        int i9 = -(-((i7 & 51) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return iBN;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = -(-(i2 | 3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iBL = this.f.bL();
        int i7 = a;
        int i8 = i7 & 119;
        int i9 = ((i7 ^ 119) | i8) << 1;
        int i10 = -((i7 | 119) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 66 / 0;
        }
        return iBL;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 97) << 1) - (((~i2) & 97) | (i2 & (-98)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-54)) | ((~i2) & 53)) + ((i2 & 53) << 1);
        a = i3 % 128;
        long jY = i3 % 2 != 0 ? j ^ y(j) : j - y(j);
        int i4 = b;
        int i5 = i4 & 5;
        int i6 = -(-((i4 ^ 5) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final boolean u(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        h hVar = this.f;
        int iBS = hVar.bS(j);
        if (i7 != 0 ? hVar.bR(iBS) <= 52 : hVar.bR(iBS) <= 15) {
            int i8 = a;
            int i9 = i8 ^ 41;
            int i10 = -(-((i8 & 41) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 4;
            }
            z = false;
        } else {
            int i13 = a;
            int i14 = (i13 & 93) + (i13 | 93);
            b = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        }
        int i16 = a;
        int i17 = i16 & 33;
        int i18 = (i16 | 33) & (~i17);
        int i19 = i17 << 1;
        int i20 = (i18 & i19) + (i18 | i19);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 54) << 1) - (i2 ^ 54)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 25;
        int i6 = (i2 ^ 25) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 117;
        int i4 = -(-((i2 & 117) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        long jY = this.f.F.y(j);
        h hVar = this.f;
        int i7 = a;
        int i8 = ((i7 & 13) - (~(i7 | 13))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int iBP = hVar.bP(jY);
        if (iBP > 1) {
            int i10 = a;
            int i11 = (((i10 ^ 49) | (i10 & 49)) << 1) - ((i10 & (-50)) | ((~i10) & 49));
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ~iBP;
            int i14 = iBP << 1;
            jY -= ((long) ((i13 ^ i14) + ((i14 & i13) << 1))) * 604800000;
            int i15 = ((i10 | 113) << 1) - (i10 ^ 113);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = b + 121;
        a = i17 % 128;
        int i18 = i17 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-104)) | ((~i3) & 103);
        int i5 = -(-((i3 & 103) << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (i == 0) {
            int i8 = i3 | 41;
            int i9 = (i8 << 1) - (i8 & (~(i3 & 41)));
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 29;
            int i13 = -(-((i10 ^ 29) | i12));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return j;
        }
        int iBS = this.f.bS(j);
        int i16 = a;
        int i17 = i16 | 21;
        int i18 = i17 << 1;
        int i19 = -((~(i16 & 21)) & i17);
        int i20 = (i18 & i19) + (i19 | i18);
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = -(-i);
        long jA = A(j, ((((~i22) & iBS) | ((~iBS) & i22)) - (~(-(-((i22 & iBS) << 1))))) - 1);
        int i23 = a;
        int i24 = i23 & 17;
        int i25 = ((((i23 ^ 17) | i24) << 1) - (~(-((i23 | 17) & (~i24))))) - 1;
        b = i25 % 128;
        if (i25 % 2 != 0) {
            return jA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-54)) | ((~i2) & 53);
        int i4 = -(-((i2 & 53) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f.l;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.f.l;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if ((r12 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r2 = r8.f.bS(r9);
        r3 = r8.f;
        r4 = ivas.gov.bisp.enumeration.cR.z.a;
        r5 = (((r4 | 13) << 1) - (~(-(((~r4) & 13) | (r4 & (-14)))))) - 1;
        ivas.gov.bisp.enumeration.cR.z.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if ((r5 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r3 = r3.bS(r11);
        r4 = y(r9);
        r11 = r11 - y(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r11 < 31449600000L) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cR.z.a;
        r7 = r6 & 27;
        r7 = r7 + ((r6 ^ 27) | r7);
        ivas.gov.bisp.enumeration.cR.z.b = r7 % 128;
        r7 = r7 % 2;
        r6 = r8.f.bR(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r7 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (r6 > 87) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r6 > 52) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        r11 = r11 - 604800000;
        r6 = ivas.gov.bisp.enumeration.cR.z.b;
        r7 = (((r6 | 66) << 1) - (r6 ^ 66)) - 1;
        ivas.gov.bisp.enumeration.cR.z.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        r3 = -r3;
        r6 = (r2 ^ r3) + ((r2 & r3) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if ((r9 - r4) >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        r9 = ivas.gov.bisp.enumeration.cR.z.a;
        r10 = ((r9 | 17) << 1) - (r9 ^ 17);
        r9 = r10 % 128;
        ivas.gov.bisp.enumeration.cR.z.b = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if ((r10 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        r10 = r6 >> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r10 = (~r6) + (r6 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        r6 = r10;
        r10 = (((r9 ^ 77) | (r9 & 77)) << 1) - (((~r9) & 77) | (r9 & (-78)));
        ivas.gov.bisp.enumeration.cR.z.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        r9 = r6;
        r11 = ivas.gov.bisp.enumeration.cR.z.b;
        r12 = r11 & 43;
        r11 = (r11 | 43) & (~r12);
        r12 = -(-(r12 << 1));
        r2 = (r11 & r12) + (r11 | r12);
        ivas.gov.bisp.enumeration.cR.z.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if ((r2 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        r3.bS(r11);
        y(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r9 < r11) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r9 < r11) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r9 = -ivas.gov.bisp.enumeration.p100w.r.aa(n(r11, r9));
        r11 = ivas.gov.bisp.enumeration.cR.z.a;
        r12 = r11 | 101;
        r2 = r12 << 1;
        r11 = -((~(r11 & 101)) & r12);
        r12 = (r2 ^ r11) + ((r11 & r2) << 1);
        ivas.gov.bisp.enumeration.cR.z.b = r12 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.z.n(long, long):long");
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int iAbs;
        int iBN;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 89;
        int i5 = ((((i3 ^ 89) | i4) << 1) - (~(-((i3 | 89) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            iAbs = Math.abs(i);
            iBN = this.f.bN();
            int i6 = 33 / 0;
        } else {
            iAbs = Math.abs(i);
            iBN = this.f.bN();
        }
        int i7 = a;
        int i8 = i7 & 83;
        int i9 = -(-((i7 ^ 83) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        int iBL = this.f.bL();
        int i12 = b;
        int i13 = ((i12 & (-92)) | ((~i12) & 91)) + ((i12 & 91) << 1);
        a = i13 % 128;
        Object obj = null;
        if (i13 % 2 != 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, iAbs, iBN, iBL);
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, iAbs, iBN, iBL);
        h hVar = this.f;
        int i14 = b;
        int i15 = i14 & 69;
        int i16 = (i14 | 69) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        a = i18 % 128;
        int i19 = i18 % 2;
        int iBS = hVar.bS(j);
        if (iBS == i) {
            int i20 = b;
            int i21 = (i20 & 77) + (i20 | 77);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 + 123;
            a = i23 % 128;
            if (i23 % 2 == 0) {
                return j;
            }
            obj.hashCode();
            throw null;
        }
        int iBG = this.f.bG(j);
        h hVar2 = this.f;
        int i24 = a;
        int i25 = ((i24 ^ 24) + ((i24 & 24) << 1)) - 1;
        b = i25 % 128;
        int i26 = i25 % 2;
        int iBR = hVar2.bR(iBS);
        int iBR2 = this.f.bR(i);
        int i27 = a;
        int i28 = (i27 ^ 47) + ((i27 & 47) << 1);
        int i29 = i28 % 128;
        b = i29;
        if (i28 % 2 == 0) {
            throw null;
        }
        if (iBR2 < iBR) {
            int i30 = ((i29 ^ 41) - (~((i29 & 41) << 1))) - 1;
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            int i33 = i31 & 43;
            int i34 = -(-((i31 ^ 43) | i33));
            int i35 = (i33 & i34) + (i33 | i34);
            b = i35 % 128;
            int i36 = i35 % 2;
            iBR = iBR2;
        }
        h hVar3 = this.f;
        int iBQ = hVar3.bQ(j, hVar3.bU(j));
        int i37 = a;
        int i38 = i37 & 101;
        int i39 = ((i37 | 101) & (~i38)) + (i38 << 1);
        int i40 = i39 % 128;
        b = i40;
        int i41 = i39 % 2;
        if (iBQ <= iBR) {
            int i42 = (((i40 | 84) << 1) - (i40 ^ 84)) - 1;
            a = i42 % 128;
            int i43 = i42 % 2;
            int i44 = (-2) - ((i40 + 92) ^ (-1));
            a = i44 % 128;
            int i45 = i44 % 2;
            iBR = iBQ;
        }
        long jBZ = this.f.bZ(j, i);
        int iF = f(jBZ);
        int i46 = b + 55;
        int i47 = i46 % 128;
        a = i47;
        if (i46 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (iF < i) {
            int i48 = (i47 & (-76)) | ((~i47) & 75);
            int i49 = (i47 & 75) << 1;
            int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
            jBZ += 604800000;
            int i52 = i47 & 57;
            int i53 = ((~i52) & (i47 | 57)) + (i52 << 1);
            b = i53 % 128;
            int i54 = i53 % 2;
        } else if (iF > i) {
            int i55 = i47 & 101;
            int i56 = -(-((i47 ^ 101) | i55));
            int i57 = (i55 & i56) + (i55 | i56);
            b = i57 % 128;
            jBZ = i57 % 2 == 0 ? jBZ & 604800000 : jBZ - 604800000;
            int i58 = (((i47 | 90) << 1) - (i47 ^ 90)) - 1;
            b = i58 % 128;
            int i59 = i58 % 2;
        }
        int i60 = -this.f.bP(jBZ);
        int i61 = iBR & i60;
        long j2 = (((iBR ^ i60) | i61) << 1) - ((i60 | iBR) & (~i61));
        int i62 = b;
        int i63 = (i62 & 35) + (i62 | 35);
        a = i63 % 128;
        int i64 = i63 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.f.D;
        long j3 = (j2 * 604800000) + jBZ;
        int i65 = b + 97;
        a = i65 % 128;
        if (i65 % 2 == 0) {
            return p.A(j3, iBG);
        }
        long jA = p.A(j3, iBG);
        int i66 = 92 / 0;
        return jA;
    }
}
