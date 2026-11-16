package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M extends i {
    private static int a = 1;
    public static final ConcurrentHashMap<AbstractC0242a, M[]> am = new ConcurrentHashMap<>();
    public static final M an;
    private static int b;

    static {
        AbstractC0242a abstractC0242a = AbstractC0242a.c;
        int i = a;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        an = bA(abstractC0242a);
        if (i5 != 0) {
            throw null;
        }
    }

    public M(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj, int i) {
        super(hVar, null, i);
    }

    public static M bA(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (i2 | 13) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        return cc(abstractC0242a, i6 % 2 != 0 ? 3 : 4);
    }

    public static M cc(AbstractC0242a abstractC0242a, int i) {
        M[] mArrPutIfAbsent;
        if (abstractC0242a == null) {
            abstractC0242a = AbstractC0242a.f();
        }
        ConcurrentHashMap<AbstractC0242a, M[]> concurrentHashMap = am;
        M[] mArr = concurrentHashMap.get(abstractC0242a);
        if (mArr == null && (mArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC0242a, (mArr = new M[7]))) != null) {
            mArr = mArrPutIfAbsent;
        }
        int i2 = i - 1;
        try {
            M m = mArr[i2];
            if (m == null) {
                synchronized (mArr) {
                    m = mArr[i2];
                    if (m == null) {
                        AbstractC0242a abstractC0242a2 = AbstractC0242a.c;
                        M m2 = abstractC0242a == abstractC0242a2 ? new M(null, null, i) : new M(T.by(cc(abstractC0242a2, i), abstractC0242a), null, i);
                        mArr[i2] = m2;
                        m = m2;
                    }
                }
            }
            return m;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Invalid min days in first week: ", i));
        }
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bB() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = -(-((i2 ^ 29) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 ^ 28) + ((i6 & 28) << 1)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return 2629746000L;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bC() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 13) - (~(i2 | 13))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 & (-22)) | ((~i2) & 21)) + ((i2 & 21) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return 31556952000L;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bD() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = ((i2 | 103) << 1) - (i2 ^ 103);
        a = i7 % 128;
        int i8 = i7 % 2;
        return 15778476000L;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final int bL() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 36) << 1) - (i2 ^ 36);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = ((i2 & (-36)) | ((~i2) & 35)) + ((i2 & 35) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return 292278993;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final int bN() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 85;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 ^ 7;
        int i5 = ((i2 & 7) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return -292275054;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0051  */
    @Override // ivas.gov.bisp.enumeration.cR.h
    public final boolean bX(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 & 70) + (i3 | 70)) ^ (-1));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if ((i & 3) == 0) {
            int i7 = i5 ^ 107;
            int i8 = ((i5 & 107) | i7) << 1;
            int i9 = -i7;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            if (i % 100 == 0) {
                int i13 = i11 & 15;
                int i14 = (((~i13) & (i11 | 15)) - (~(i13 << 1))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                if (i % 400 != 0) {
                    int i16 = b;
                    int i17 = i16 | 1;
                    int i18 = i17 << 1;
                    int i19 = -((~(i16 & 1)) & i17);
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    z = false;
                }
            }
            int i22 = (-2) - (((i11 ^ 108) + ((i11 & 108) << 1)) ^ (-1));
            a = i22 % 128;
            int i23 = i22 % 2;
            z = true;
        } else {
            int i110 = b;
            int i111 = i110 | 1;
            int i112 = i111 << 1;
            int i113 = -((~(i110 & 1)) & i111);
            int i24 = ((i112 | i113) << 1) - (i113 ^ i112);
            a = i24 % 128;
            int i25 = i24 % 2;
            z = false;
        }
        int i26 = b;
        int i27 = i26 & 9;
        int i28 = (i26 ^ 9) | i27;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        a = i29 % 128;
        if (i29 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 53;
        int i4 = ((i2 & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return an;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = ((i2 | 29) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (abstractC0242a == null) {
            abstractC0242a = AbstractC0242a.f();
            int i5 = b;
            int i6 = (i5 & (-86)) | ((~i5) & 85);
            int i7 = (i5 & 85) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (abstractC0242a != ap()) {
            M mBA = bA(abstractC0242a);
            int i10 = a;
            int i11 = (-2) - (((i10 ^ 68) + ((i10 & 68) << 1)) ^ (-1));
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return mBA;
            }
            obj.hashCode();
            throw null;
        }
        int i12 = b + 31;
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = i13 & 7;
        int i16 = i15 + ((i13 ^ 7) | i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bz() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 33) + (i2 | 33);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return 31083597720000L;
        }
        int i4 = 78 / 0;
        return 31083597720000L;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:14:0x0083 A[PHI: r3
  0x0083: PHI (r3v31 int) = (r3v4 int), (r3v38 int) binds: [B:8:0x0021, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r3
  0x0023: PHI (r3v5 int) = (r3v4 int), (r3v38 int) binds: [B:8:0x0021, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bF(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 ^ 15;
        int i12 = -(-((i10 & 15) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            i2 = i * 63;
            if (i < 0) {
                int i14 = (i10 & 119) + (i10 | 119);
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                int i17 = ((((i ^ 3) | (i & 3)) << 1) - ((i & (-4)) | ((~i) & 3))) >> 2;
                int i18 = -i2;
                int i19 = i17 & i18;
                int i20 = (i17 | i18) & (~i19);
                int i21 = -(-(i19 << 1));
                i3 = (i20 & i21) + (i20 | i21);
                int i22 = (i2 & (-4)) | ((~i2) & 3);
                int i23 = (i2 & 3) << 1;
                i4 = ((i22 | i23) << 1) - (i23 ^ i22);
                i5 = i15 + 11;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i24 = -(i4 % 2);
                    int i25 = ((~i24) & i3) | ((~i3) & i24);
                    int i26 = -(-((i24 & i3) << 1));
                    i6 = (((i25 | i26) << 1) - (i26 ^ i25)) << 1;
                } else {
                    int i27 = i3 + (i4 >> 2);
                    i6 = ((i27 << 1) - i27) - 1;
                }
                int i28 = (i15 & 121) + (i15 | 121);
                b = i28 % 128;
                int i29 = i28 % 2;
            } else {
                int i30 = i >> 2;
                int i31 = -i2;
                int i32 = i30 & i31;
                int i33 = -(-(i30 | i31));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                int i35 = i2 >> 2;
                int i36 = ((~i35) & i34) | ((~i34) & i35);
                int i37 = (i35 & i34) << 1;
                i6 = (i36 ^ i37) + ((i37 & i36) << 1);
                if (!(!bX(i))) {
                    int i38 = a;
                    i7 = ((i38 | 121) << 1) - ((121 & (~i38)) | (i38 & (-122)));
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        i6--;
                    }
                    i8 = i38 + 61;
                    b = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i39 = 4 % 4;
                    }
                }
            }
        } else {
            i2 = i / 100;
            if (i < 0) {
                int i110 = (i10 & 119) + (i10 | 119);
                int i111 = i110 % 128;
                a = i111;
                int i112 = i110 % 2;
                int i113 = ((((i ^ 3) | (i & 3)) << 1) - ((i & (-4)) | ((~i) & 3))) >> 2;
                int i114 = -i2;
                int i115 = i113 & i114;
                int i210 = (i113 | i114) & (~i115);
                int i211 = -(-(i115 << 1));
                i3 = (i210 & i211) + (i210 | i211);
                int i212 = (i2 & (-4)) | ((~i2) & 3);
                int i213 = (i2 & 3) << 1;
                i4 = ((i212 | i213) << 1) - (i213 ^ i212);
                i5 = i111 + 11;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i214 = -(i4 % 2);
                    int i215 = ((~i214) & i3) | ((~i3) & i214);
                    int i216 = -(-((i214 & i3) << 1));
                    i6 = (((i215 | i216) << 1) - (i216 ^ i215)) << 1;
                } else {
                    int i217 = i3 + (i4 >> 2);
                    i6 = ((i217 << 1) - i217) - 1;
                }
                int i218 = (i111 & 121) + (i111 | 121);
                b = i218 % 128;
                int i219 = i218 % 2;
            } else {
                int i310 = i >> 2;
                int i311 = -i2;
                int i312 = i310 & i311;
                int i313 = -(-(i310 | i311));
                int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
                int i315 = i2 >> 2;
                int i316 = ((~i315) & i314) | ((~i314) & i315);
                int i317 = (i315 & i314) << 1;
                i6 = (i316 ^ i317) + ((i317 & i316) << 1);
                if (!(!bX(i))) {
                    int i318 = a;
                    i7 = ((i318 | 121) << 1) - ((121 & (~i318)) | (i318 & (-122)));
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        i6--;
                    }
                    i8 = i318 + 61;
                    b = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i319 = 4 % 4;
                    }
                }
            }
        }
        long j = ((long) i) * 365;
        int i40 = i6 | (-719527);
        int i41 = i40 << 1;
        int i42 = -((~((-719527) & i6)) & i40);
        long j2 = j + ((long) (((i41 | i42) << 1) - (i42 ^ i41)));
        int i43 = b;
        int i44 = i43 + 41;
        a = i44 % 128;
        long j3 = i44 % 2 == 0 ? j2 & 86400000 : j2 * 86400000;
        int i45 = i43 + 89;
        a = i45 % 128;
        if (i45 % 2 != 0) {
            return j3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h, ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 37;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 37)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
            obj.hashCode();
            throw null;
        }
        if (this.e == null) {
            int i7 = b + 119;
            a = i7 % 128;
            int i8 = i7 % 2;
            super.bx(bfa);
            int i9 = b;
            int i10 = (((i9 & (-90)) | ((~i9) & 89)) - (~(-(-((i9 & 89) << 1))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = (i12 & 89) + (i12 | 89);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
