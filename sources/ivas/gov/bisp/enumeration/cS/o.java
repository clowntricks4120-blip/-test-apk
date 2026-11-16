package ivas.gov.bisp.enumeration.cS;

/* JADX INFO: loaded from: classes.dex */
public class o extends r {
    private static int a = 1;
    private static int b;
    public final int e;

    public o(ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.x xVar, int i) {
        super(j, xVar);
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = -(-(i2 | 79));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e = i;
        if (i6 == 0) {
            int i7 = 46 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long c(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 13) - (~(-(-(i3 | 13))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        long jD = this.d.d(j, ((long) i) * ((long) this.e));
        int i5 = b;
        int i6 = i5 & 95;
        int i7 = (i5 ^ 95) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cS.c, ivas.gov.bisp.enumeration.cP.J
    public int e(long j, long j2) {
        int iE;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 69) + (i3 | 69);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            iE = this.d.e(j, j2);
            i = this.e;
            int i5 = 58 / 0;
        } else {
            iE = this.d.e(j, j2);
            i = this.e;
        }
        int i6 = b;
        int i7 = ((i6 ^ 64) + ((i6 & 64) << 1)) - 1;
        a = i7 % 128;
        return i7 % 2 == 0 ? iE >>> i : iE / i;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long f(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        long jF = i5 % 2 == 0 ? this.d.f(j, j2) ^ ((long) this.e) : this.d.f(j, j2) / ((long) this.e);
        int i6 = a;
        int i7 = (-2) - ((((i6 | 38) << 1) - (i6 ^ 38)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return jF;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.r, ivas.gov.bisp.enumeration.cP.J
    public long h() {
        int i = 2 % 2;
        int i2 = b + 101;
        a = i2 % 128;
        int i3 = i2 % 2;
        long jH = this.d.h();
        int i4 = this.e;
        int i5 = a;
        int i6 = (i5 & 107) + (i5 | 107);
        b = i6 % 128;
        long j = i6 % 2 != 0 ? jH - ((long) i4) : jH * ((long) i4);
        int i7 = i5 & 65;
        int i8 = (i7 - (~((i5 ^ 65) | i7))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    public boolean equals(Object obj) {
        o oVar;
        ivas.gov.bisp.enumeration.cP.J j;
        ivas.gov.bisp.enumeration.cP.J j2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 126) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = ((i4 | 21) << 1) - (i4 ^ 21);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i4 & 9) - (~(i4 | 9))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof o)) {
            int i10 = i2 + 51;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i11 = i2 & 103;
        int i12 = -(-(i2 | 103));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            oVar = (o) obj;
            j = this.d;
            j2 = oVar.d;
            int i14 = 80 / 0;
        } else {
            oVar = (o) obj;
            j = this.d;
            j2 = oVar.d;
        }
        int i15 = a;
        int i16 = ((i15 ^ 19) | (i15 & 19)) << 1;
        int i17 = -(((~i15) & 19) | (i15 & (-20)));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        if (j.equals(j2)) {
            int i20 = a;
            int i21 = i20 ^ 81;
            int i22 = ((i20 & 81) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                ivas.gov.bisp.enumeration.cP.x xVar = this.c;
                ivas.gov.bisp.enumeration.cP.x xVar2 = oVar.c;
                throw null;
            }
            if (this.c == oVar.c) {
                int i25 = a + 94;
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
                if (this.e != oVar.e) {
                    int i28 = b;
                    int i29 = i28 & 63;
                    int i30 = (i29 - (~((i28 ^ 63) | i29))) - 1;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    z = true;
                }
            } else {
                int i210 = b;
                int i211 = i210 & 63;
                int i32 = (i211 - (~((i210 ^ 63) | i211))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
            }
        } else {
            int i212 = b;
            int i213 = i212 & 63;
            int i34 = (i213 - (~((i212 ^ 63) | i213))) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = a;
        int i37 = i36 & 17;
        int i38 = (i36 | 17) & (~i37);
        int i39 = -(-(i37 << 1));
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        b = i40 % 128;
        int i41 = i40 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 1) << 1;
        int i4 = -(((~i2) & 1) | (i2 & (-2)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        long j = this.e;
        int i7 = (int) (j ^ (j >>> 32));
        ivas.gov.bisp.enumeration.cP.x xVar = this.c;
        int i8 = a + 38;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            iHashCode = this.d.hashCode() / (xVar.hashCode() % i7);
        } else {
            int iHashCode2 = xVar.hashCode();
            int iHashCode3 = this.d.hashCode();
            int i10 = -(-i7);
            int i11 = ((iHashCode2 ^ i10) | (iHashCode2 & i10)) << 1;
            int i12 = -((i10 & (~iHashCode2)) | ((~i10) & iHashCode2));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            iHashCode = ((iHashCode3 | i13) << 1) - (i13 ^ iHashCode3);
        }
        int i14 = b;
        int i15 = i14 & 115;
        int i16 = ((i14 | 115) & (~i15)) + (i15 << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 13 / 0;
        }
        return iHashCode;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long d(long j, long j2) {
        long j3 = j2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = (i2 & 103) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.e;
        if (i7 != -1) {
            int i8 = i6 + 81;
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            if (i7 != 0) {
                int i11 = i9 + 61;
                int i12 = i11 % 128;
                b = i12;
                if (i11 % 2 == 0 ? i7 != 1 : i7 != 1) {
                    long j4 = i7;
                    long j5 = j3 * j4;
                    long j6 = j5 / j4;
                    int i13 = ((i12 ^ 29) | (i12 & 29)) << 1;
                    int i14 = -((i12 & (-30)) | ((~i12) & 29));
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    if (j6 != j3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Multiplication overflows a long: ");
                        int i17 = b;
                        int i18 = i17 & 79;
                        int i19 = ((i17 ^ 79) | i18) << 1;
                        int i20 = -((i17 | 79) & (~i18));
                        int i21 = (i19 & i20) + (i20 | i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        sb.append(j3);
                        sb.append(" * ");
                        sb.append(i7);
                        throw new ArithmeticException(sb.toString());
                    }
                    j3 = j5;
                }
            } else {
                int i23 = i9 + 95;
                b = i23 % 128;
                int i24 = i23 % 2;
                j3 = 0;
            }
        } else {
            if (j3 == Long.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder();
                int i25 = b;
                int i26 = i25 & 117;
                int i27 = ((i25 ^ 117) | i26) << 1;
                int i28 = -((i25 | 117) & (~i26));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    sb2.append("Multiplication overflows a long: ");
                    sb2.append(j3);
                    throw null;
                }
                sb2.append("Multiplication overflows a long: ");
                sb2.append(j3);
                int i30 = a;
                int i31 = (i30 | 91) << 1;
                int i32 = -(((~i30) & 91) | (i30 & (-92)));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                b = i33 % 128;
                int i34 = i33 % 2;
                sb2.append(" * ");
                sb2.append(i7);
                throw new ArithmeticException(sb2.toString());
            }
            int i35 = (-2) - ((((i6 | 70) << 1) - (i6 ^ 70)) ^ (-1));
            a = i35 % 128;
            j3 = -j3;
            if (i35 % 2 == 0) {
                int i36 = 69 / 0;
            }
        }
        long jD = this.d.d(j, j3);
        int i37 = a;
        int i38 = ((i37 ^ 81) | (i37 & 81)) << 1;
        int i39 = -(((~i37) & 81) | (i37 & (-82)));
        int i40 = (i38 & i39) + (i39 | i38);
        b = i40 % 128;
        if (i40 % 2 == 0) {
            return jD;
        }
        throw null;
    }
}
