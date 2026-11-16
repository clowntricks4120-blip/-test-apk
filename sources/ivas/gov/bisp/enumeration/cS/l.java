package ivas.gov.bisp.enumeration.cS;

/* JADX INFO: loaded from: classes.dex */
public class l extends c {
    private static int a = 1;
    private static int b;
    public final long d;

    public l(ivas.gov.bisp.enumeration.cP.x xVar, long j) {
        super(xVar);
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r8
  0x0021: PHI (r8v1 long) = (r8v0 long), (r8v2 long) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (r1 != (-1)) goto L48;
     */
    @Override // ivas.gov.bisp.enumeration.cP.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d(long r17, long r19) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cS.l.d(long, long):long");
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long f(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = -(-(i2 | 103));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        return i5 % 2 != 0 ? ivas.gov.bisp.enumeration.p100w.r.Z(j, j2) - this.d : ivas.gov.bisp.enumeration.p100w.r.Z(j, j2) / this.d;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        long j = this.d;
        int i6 = ((i4 & (-80)) | ((~i4) & 79)) + ((i4 & 79) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-74)) | ((~i2) & 73);
        int i4 = -(-((i2 & 73) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (((i6 & (-94)) | ((~i6) & 93)) - (~((i6 & 93) << 1))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long c(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 53) + (i3 | 53);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.d;
        int i6 = i5 + 15;
        a = i6 % 128;
        int i7 = i6 % 2;
        long jY = ivas.gov.bisp.enumeration.p100w.r.Y(j, ((long) i) * j2);
        int i8 = a;
        int i9 = i8 ^ 71;
        int i10 = (((i8 & 71) | i9) << 1) - i9;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return jY;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 53) + (i2 | 53);
        a = i3 % 128;
        int i4 = i3 % 2;
        long j = this.d;
        int i5 = (int) (j ^ (j >>> 32));
        ivas.gov.bisp.enumeration.cP.x xVar = this.c;
        int i6 = b;
        int i7 = (-2) - (((i6 & 48) + (i6 | 48)) ^ (-1));
        a = i7 % 128;
        if (i7 % 2 == 0) {
            iHashCode = xVar.hashCode() * i5;
        } else {
            int iHashCode2 = xVar.hashCode() - (~(-(-i5)));
            iHashCode = (iHashCode2 << 1) + (iHashCode2 ^ (-1));
        }
        int i8 = a;
        int i9 = i8 & 79;
        int i10 = i9 + ((i8 ^ 79) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 87;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        boolean z = false;
        if (this == obj) {
            int i6 = ((i2 ^ 104) + ((i2 & 104) << 1)) - 1;
            a = i6 % 128;
            boolean z2 = i6 % 2 != 0;
            int i7 = i2 & 97;
            int i8 = -(-(i2 | 97));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 1 / 0;
            }
            return z2;
        }
        if (!(obj instanceof l)) {
            int i11 = i4 & 121;
            int i12 = (i4 ^ 121) | i11;
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 23 / 0;
            }
            return false;
        }
        int i15 = ((i2 ^ 85) - (~((i2 & 85) << 1))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        l lVar = (l) obj;
        if (this.c == lVar.c) {
            int i17 = a;
            int i18 = i17 & 119;
            int i19 = (i17 | 119) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 & i20) + (i19 | i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            if (this.d != lVar.d) {
                int i23 = b + 41;
                a = i23 % 128;
                int i24 = i23 % 2;
            } else {
                z = true;
            }
        } else {
            int i25 = b + 41;
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a + 35;
        b = i27 % 128;
        if (i27 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
