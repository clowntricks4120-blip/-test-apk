package ivas.gov.bisp.enumeration.cS;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ivas.gov.bisp.enumeration.cP.J implements Serializable {
    private static int a = 1;
    private static int b;
    public final ivas.gov.bisp.enumeration.cP.x c;

    public c(ivas.gov.bisp.enumeration.cP.x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.c = xVar;
        int i = b;
        int i2 = i | 91;
        int i3 = i2 << 1;
        int i4 = -((~(i & 91)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0050  */
    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e A[DONT_INVERT] */
    @Override // java.lang.Comparable
    public int compareTo(ivas.gov.bisp.enumeration.cP.J j) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 77) | (i3 & 77)) << 1;
        int i5 = -(((~i3) & 77) | (i3 & (-78)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        long jH = j.h();
        long jH2 = h();
        int i8 = a;
        int i9 = (i8 & 41) + (i8 | 41);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            int i11 = 39 / 0;
            if (jH2 == jH) {
                int i12 = (i8 ^ 21) + ((i8 & 21) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                i = 0;
            } else if (jH2 < jH) {
                int i14 = i10 & 97;
                int i15 = -(-((i10 ^ 97) | i14));
                int i16 = (i14 & i15) + (i14 | i15);
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                int i19 = i17 + 51;
                b = i19 % 128;
                int i20 = i19 % 2;
                i = -1;
            } else {
                int i21 = (i10 & (-26)) | ((~i10) & 25);
                int i22 = (i10 & 25) << 1;
                int i23 = (i21 & i22) + (i21 | i22);
                a = i23 % 128;
                int i24 = i23 % 2;
                i = 1;
            }
        } else if (jH2 == jH) {
            int i110 = (i8 ^ 21) + ((i8 & 21) << 1);
            b = i110 % 128;
            int i111 = i110 % 2;
            i = 0;
        } else if (jH2 < jH) {
            int i112 = i10 & 97;
            int i113 = -(-((i10 ^ 97) | i112));
            int i114 = (i112 & i113) + (i112 | i113);
            int i115 = i114 % 128;
            a = i115;
            int i116 = i114 % 2;
            int i117 = i115 + 51;
            b = i117 % 128;
            int i25 = i117 % 2;
            i = -1;
        } else {
            int i26 = (i10 & (-26)) | ((~i10) & 25);
            int i27 = (i10 & 25) << 1;
            int i28 = (i26 & i27) + (i26 | i27);
            a = i28 % 128;
            int i29 = i28 % 2;
            i = 1;
        }
        int i30 = a;
        int i31 = (i30 & (-58)) | ((~i30) & 57);
        int i32 = -(-((i30 & 57) << 1));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 3 / 0;
        }
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public int e(long j, long j2) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 94) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        long jF = f(j, j2);
        if (i3 != 0) {
            return ivas.gov.bisp.enumeration.p100w.r.aa(jF);
        }
        ivas.gov.bisp.enumeration.p100w.r.aa(jF);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final ivas.gov.bisp.enumeration.cP.x g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 125;
        int i4 = -(-((i2 & 125) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.x xVar = this.c;
        int i6 = i2 + 27;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return xVar;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 110) + ((i2 & 110) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 125;
        int i6 = i5 + ((i2 ^ 125) | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a + 91;
        b = i2 % 128;
        int i3 = i2 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("DurationField[");
        String str = this.c.f81o;
        int i4 = b;
        int i5 = i4 & 77;
        int i6 = i4 | 77;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        sbW.append(str);
        sbW.append(i8 == 0 ? 'r' : ']');
        String string = sbW.toString();
        int i9 = a;
        int i10 = i9 & 29;
        int i11 = (i9 | 29) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 44 / 0;
        }
        return string;
    }
}
