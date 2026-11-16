package ivas.gov.bisp.enumeration.cQ;

import ivas.gov.bisp.enumeration.cJ.P;
import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.C0244m;
import ivas.gov.bisp.enumeration.cP.R;
import ivas.gov.bisp.enumeration.p096p.h;
import org.joda.convert.ToString;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements R {
    private static int a = 0;
    private static int b = 1;

    public AbstractC0242a c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = ((i2 ^ 63) | i3) << 1;
        int i5 = -((i2 | 63) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        AbstractC0242a abstractC0242aAp = b().ap();
        int i8 = b;
        int i9 = i8 & 11;
        int i10 = ((((i8 ^ 11) | i9) << 1) - (~(-((i8 | 11) & (~i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        return abstractC0242aAp;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    @Override // java.lang.Comparable
    public int compareTo(R r) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 5;
        b = i4 % 128;
        Object obj = null;
        R r2 = r;
        if (i4 % 2 != 0) {
            i = 0;
            if (this != r2) {
            }
            int i5 = a;
            i2 = ((i5 ^ 34) + ((i5 & 34) << 1)) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return i;
            }
            obj.hashCode();
            throw null;
        }
        if (this != r2) {
            i = 1;
        } else {
            i = 1;
        }
        int i6 = a;
        i2 = ((i6 ^ 34) + ((i6 & 34) << 1)) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return i;
        }
        obj.hashCode();
        throw null;
        long jS = r2.s();
        long jS2 = s();
        int i7 = b;
        int i8 = i7 & 11;
        int i9 = (i8 - (~(-(-((i7 ^ 11) | i8))))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        if (jS2 != jS) {
            int i10 = ((i7 | 122) << 1) - (i7 ^ 122);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            int i12 = i11 % 128;
            a = i12;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (jS2 < jS) {
                int i13 = i7 ^ 83;
                int i14 = ((((i7 & 83) | i13) << 1) - (~(-i13))) - 1;
                int i15 = i14 % 128;
                a = i15;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i16 = ((i15 | 61) << 1) - (i15 ^ 61);
                b = i16 % 128;
                int i17 = i16 % 2;
                i = -1;
            } else {
                int i18 = i12 & 53;
                int i19 = ((i12 ^ 53) | i18) << 1;
                int i20 = -((i12 | 53) & (~i18));
                int i21 = (i19 & i20) + (i19 | i20);
                b = i21 % 128;
                int i22 = i21 % 2;
                i = 1;
            }
        }
        int i23 = a;
        i2 = ((i23 ^ 34) + ((i23 & 34) << 1)) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return i;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    public boolean equals(Object obj) {
        boolean z;
        R r;
        long jS;
        int i;
        Object obj2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 71;
        int i6 = ((i4 ^ 71) | i5) << 1;
        int i7 = -((~i5) & (i4 | 71));
        int i8 = (i6 & i7) + (i6 | i7);
        int i9 = i8 % 128;
        a = i9;
        boolean z2 = false;
        if (i8 % 2 != 0) {
            if (this != obj) {
                z = false;
                if (!(obj instanceof R)) {
                    int i10 = i4 & 125;
                    int i11 = i4 | 125;
                    int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                    int i13 = i12 % 128;
                    a = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 ^ 107;
                    int i16 = ((i13 & 107) | i15) << 1;
                    int i17 = -i15;
                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    return false;
                }
                r = (R) obj;
                jS = s();
                int i20 = a;
                int i21 = i20 & 121;
                i = ((i20 | 121) & (~i21)) + (i21 << 1);
                b = i % 128;
                obj2 = null;
                if (i % 2 != 0) {
                    r.s();
                    obj2.hashCode();
                    throw null;
                }
                if (jS == r.s() || !ivas.gov.bisp.enumeration.p100w.r.D(b(), r.b())) {
                    int i22 = a;
                    int i23 = ((i22 | 49) << 1) - (i22 ^ 49);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    z2 = z;
                }
                i2 = b + 21;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    return z2;
                }
                throw null;
            }
            int i25 = i9 + 25;
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = i26 + 123;
            a = i28 % 128;
            int i29 = i28 % 2;
            return true;
        }
        if (this != obj) {
            z = true;
            if (!(obj instanceof R)) {
                int i110 = i4 & 125;
                int i111 = i4 | 125;
                int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                int i113 = i112 % 128;
                a = i113;
                int i114 = i112 % 2;
                int i115 = i113 ^ 107;
                int i116 = ((i113 & 107) | i115) << 1;
                int i117 = -i115;
                int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                b = i118 % 128;
                int i119 = i118 % 2;
                return false;
            }
            r = (R) obj;
            jS = s();
            int i210 = a;
            int i211 = i210 & 121;
            i = ((i210 | 121) & (~i211)) + (i211 << 1);
            b = i % 128;
            obj2 = null;
            if (i % 2 != 0) {
                r.s();
                obj2.hashCode();
                throw null;
            }
            if (jS == r.s()) {
                int i212 = a;
                int i213 = ((i212 | 49) << 1) - (i212 ^ 49);
                b = i213 % 128;
                int i214 = i213 % 2;
            } else {
                int i215 = a;
                int i216 = ((i215 | 49) << 1) - (i215 ^ 49);
                b = i216 % 128;
                int i217 = i216 % 2;
            }
            i2 = b + 21;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return z2;
            }
            throw null;
        }
        int i218 = i9 + 25;
        int i219 = i218 % 128;
        b = i219;
        int i220 = i218 % 2;
        int i221 = i219 + 123;
        a = i221 % 128;
        int i222 = i221 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = ((i2 ^ 73) | i3) << 1;
        int i5 = -((i2 | 73) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        long jS = s();
        long jS2 = s();
        int i8 = b;
        int i9 = (i8 & (-106)) | ((~i8) & 105);
        int i10 = -(-((i8 & 105) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (int) (jS ^ (jS2 >>> 32));
        h hVarB = b();
        int i14 = a;
        int i15 = (-2) - ((((i14 | 110) << 1) - (i14 ^ 110)) ^ (-1));
        b = i15 % 128;
        int i16 = i15 % 2;
        int iHashCode = hVarB.hashCode();
        if (i16 == 0) {
            return iHashCode << i13;
        }
        int i17 = -(-i13);
        int i18 = iHashCode & i17;
        return ((((iHashCode ^ i17) | i18) << 1) - (~(-((iHashCode | i17) & (~i18))))) - 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.R
    public C0244m y() {
        int i = 2 % 2;
        C0244m c0244m = new C0244m(s());
        int i2 = a + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        return c0244m;
    }

    @ToString
    public String toString() {
        String strF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = i3 + ((i2 ^ 91) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            strF = P.G.f(this);
            int i5 = 99 / 0;
        } else {
            strF = P.G.f(this);
        }
        int i6 = b + 65;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
        return strF;
    }

    public ivas.gov.bisp.enumeration.cP.z d() {
        int i = 2 % 2;
        ivas.gov.bisp.enumeration.cP.z zVar = new ivas.gov.bisp.enumeration.cP.z(((i) this).c, c());
        int i2 = a;
        int i3 = (i2 & 51) + (i2 | 51);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return zVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
