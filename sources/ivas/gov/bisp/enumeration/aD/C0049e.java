package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o000OOo0;
import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049e {
    private static int a = 1;
    private static int b;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.e$biK */
    public static final class biK {
        public int a;
        public long b;
        public Object c;
        public final J d;

        public biK(J j) {
            Objects.requireNonNull(j);
            this.d = j;
        }
    }

    public static int d(byte[] bArr, int i) {
        byte b2;
        byte b3;
        byte b4;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 83) + (i3 | 83);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            b2 = bArr[i];
            b3 = bArr[i];
            b4 = bArr[i >>> 2];
        } else {
            b2 = bArr[i];
            b3 = bArr[(i ^ 1) + ((i & 1) << 1)];
            b4 = bArr[((i | 2) << 1) - (i ^ 2)];
        }
        int i6 = i ^ 3;
        int i7 = (i & 3) << 1;
        int i8 = (bArr[((i6 | i7) << 1) - (i7 ^ i6)] & 255) << 24;
        int i9 = (i5 & (-44)) | ((~i5) & 43);
        int i10 = (i5 & 43) << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = b2 & 255;
        int i14 = (b3 & 255) << 8;
        int i15 = ((~i13) & i14) | ((~i14) & i13);
        int i16 = b4 & 255;
        int i17 = i5 & 113;
        int i18 = ((((i5 ^ 113) | i17) << 1) - (~(-((i5 | 113) & (~i17))))) - 1;
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return i8 ^ (i15 ^ (i16 << 16));
        }
        int i19 = i16 ^ (-59);
        int i20 = (b4 & 197) << 1;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        return i8 & ((i15 & i21) | (i15 ^ i21));
    }

    public static long e(byte[] bArr, int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long j4;
        char c;
        long j5;
        long j6;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (-2) - ((i4 + 102) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            j = bArr[i];
            j2 = bArr[(((i ^ 1) | (i & 1)) << 1) - ((i & (-2)) | ((~i) & 1))];
            i2 = i << 2;
        } else {
            j = bArr[i];
            j2 = bArr[((i | 1) << 1) - (i ^ 1)];
            i2 = (i & 2) + (i | 2);
        }
        int i6 = i4 & 121;
        int i7 = (~i6) & (i4 | 121);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        long j7 = bArr[i2];
        long j8 = bArr[(i & 3) + (i | 3)];
        int i11 = (i & (-5)) | ((~i) & 4);
        int i12 = -(-((i & 4) << 1));
        byte b2 = bArr[((i11 | i12) << 1) - (i11 ^ i12)];
        int i13 = i4 & 107;
        int i14 = ((i4 ^ 107) | i13) << 1;
        int i15 = -((~i13) & (i4 | 107));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        long j9 = b2;
        int i18 = i & 5;
        int i19 = (~i18) & (i | 5);
        int i20 = i18 << 1;
        long j10 = bArr[(i19 ^ i20) + ((i20 & i19) << 1)];
        int i21 = i & 6;
        byte b3 = bArr[((((i ^ 6) | i21) << 1) - (~(-((~i21) & (i | 6))))) - 1];
        int i22 = (i4 | 79) << 1;
        int i23 = -((i4 & (-80)) | ((~i4) & 79));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        int i25 = i24 % 128;
        b = i25;
        if (i24 % 2 != 0) {
            j3 = b3;
            j4 = ((long) bArr[i % 88]) ^ 255;
            c = 'z';
        } else {
            j3 = b3;
            j4 = ((long) bArr[i + 7]) & 255;
            c = '8';
        }
        long j11 = j4 << c;
        int i26 = i25 + 3;
        a = i26 % 128;
        int i27 = i26 % 2;
        long j12 = (j & 255) | ((j2 & 255) << 8) | ((j7 & 255) << 16);
        long j13 = (j8 & 255) << 24;
        int i28 = i25 & 107;
        int i29 = (i25 ^ 107) | i28;
        int i30 = (i28 & i29) + (i28 | i29);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            j5 = (j12 | j13) % ((j9 % 255) << 76);
            j6 = j10 - 255;
        } else {
            j5 = j12 | j13 | ((j9 & 255) << 32);
            j6 = j10 & 255;
        }
        long j14 = j11 | j5 | (j6 << 40) | ((j3 & 255) << 48);
        int i31 = ((i25 ^ 11) | (i25 & 11)) << 1;
        int i32 = -((i25 & (-12)) | ((~i25) & 11));
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            return j14;
        }
        throw null;
    }

    public static int f(ah ahVar, byte[] bArr, int i, int i2, int i3, biK bik) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 39;
        int i7 = ((i5 | 39) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        ad adVar = (ad) ahVar;
        Object objN = adVar.n();
        int i9 = b + 17;
        a = i9 % 128;
        int i10 = i9 % 2;
        int iX = adVar.X(objN, bArr, i, i2, i3, bik);
        int i11 = b + 3;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            adVar.h(objN);
            bik.c = objN;
            return iX;
        }
        adVar.h(objN);
        bik.c = objN;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int b(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        L l;
        int iV;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 95;
        int i5 = (((i3 ^ 95) | i4) << 1) - ((i3 | 95) & (~i4));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            l = (L) oooO0OO;
            iV = v(bArr, i, bik);
            int i6 = 52 / 0;
        } else {
            l = (L) oooO0OO;
            iV = v(bArr, i, bik);
        }
        int i7 = a;
        int i8 = (i7 ^ 7) + ((i7 & 7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = bik.a;
        int i11 = -(-iV);
        int i12 = i10 & i11;
        int i13 = i12 + ((i10 ^ i11) | i12);
        int i14 = a;
        int i15 = i14 ^ 73;
        int i16 = -(-((i14 & 73) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        while (iV < i13) {
            int i19 = a;
            int i20 = i19 & 37;
            int i21 = (((i19 | 37) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                l.f(d(bArr, iV));
                int i22 = iV & 70;
                int i23 = -(-((iV ^ 70) | i22));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = i24 & 55;
                iV = ((((i24 ^ 55) | i25) << 1) - (~(-((~i25) & (i24 | 55))))) - 1;
            } else {
                l.f(d(bArr, iV));
                int i26 = iV & 4;
                iV = (((iV ^ 4) | i26) << 1) - ((iV | 4) & (~i26));
            }
            int i27 = b;
            int i28 = (i27 ^ 105) + ((i27 & 105) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        }
        if (iV != i13) {
            throw C0065v.c();
        }
        int i30 = b + 106;
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        a = i31 % 128;
        if (i31 % 2 != 0) {
            return iV;
        }
        throw null;
    }

    public static int g(o000OOo0<?> o000ooo0, int i, byte[] bArr, int i2, int i3, o0OO00O.OooO0OO<?> oooO0OO, biK bik) {
        int i4 = 2 % 2;
        int i5 = b + 113;
        a = i5 % 128;
        int i6 = i5 % 2;
        int iH = h(o000ooo0, bArr, i2, i3, bik);
        int i7 = a;
        int i8 = ((i7 ^ 121) | (i7 & 121)) << 1;
        int i9 = -(((~i7) & 121) | (i7 & (-122)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        oooO0OO.add(bik.c);
        int i12 = a;
        int i13 = i12 ^ 79;
        int i14 = (i12 & 79) << 1;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        while (iH < i3) {
            int i17 = a + 49;
            b = i17 % 128;
            int i18 = i17 % 2;
            int iV = v(bArr, iH, bik);
            if (i != bik.a) {
                break;
            }
            int i19 = b;
            int i20 = (i19 | 5) << 1;
            int i21 = -(i19 ^ 5);
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            iH = h(o000ooo0, bArr, iV, i3, bik);
            int i24 = b;
            int i25 = (i24 & (-54)) | ((~i24) & 53);
            int i26 = (i24 & 53) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                oooO0OO.add(bik.c);
                int i28 = 93 / 0;
            } else {
                oooO0OO.add(bik.c);
            }
            int i29 = a + 87;
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = a;
        int i32 = ((i31 & 19) - (~(-(-(i31 | 19))))) - 1;
        b = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 42 / 0;
        }
        return iH;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072 A[PHI: r8
  0x0072: PHI (r8v4 int) = (r8v3 int), (r8v7 int) binds: [B:14:0x0070, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0089 A[PHI: r8
  0x0089: PHI (r8v6 int) = (r8v3 int), (r8v7 int) binds: [B:14:0x0070, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    public static int i(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = b + 101;
        a = i4 % 128;
        int i5 = i4 % 2;
        i iVar = (i) oooO0OO;
        int iV = v(bArr, i, bik);
        int i6 = b + 79;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            i2 = bik.a * iV;
        } else {
            int i7 = bik.a;
            int i8 = i7 ^ iV;
            int i9 = ((i7 & iV) | i8) << 1;
            int i10 = -i8;
            i2 = ((i9 & i10) << 1) + (i9 ^ i10);
        }
        int i11 = b;
        int i12 = (i11 & (-74)) | ((~i11) & 73);
        int i13 = (i11 & 73) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        while (iV < i2) {
            int i16 = b;
            int i17 = (-2) - (((i16 & 122) + (i16 | 122)) ^ (-1));
            a = i17 % 128;
            if (i17 % 2 == 0) {
                iV = w(bArr, iV, bik);
                if (bik.b != 1) {
                    int i18 = a;
                    int i19 = i18 & 11;
                    int i20 = (i18 | 11) & (~i19);
                    int i21 = -(-(i19 << 1));
                    int i22 = (i20 & i21) + (i20 | i21);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    z = true;
                } else {
                    int i24 = b;
                    int i25 = ((i24 | 27) << 1) - (i24 ^ 27);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    z = false;
                }
            } else {
                iV = w(bArr, iV, bik);
                if (bik.b != 0) {
                    int i110 = a;
                    int i111 = i110 & 11;
                    int i27 = (i110 | 11) & (~i111);
                    int i28 = -(-(i111 << 1));
                    int i29 = (i27 & i28) + (i27 | i28);
                    b = i29 % 128;
                    int i210 = i29 % 2;
                    z = true;
                } else {
                    int i211 = b;
                    int i212 = ((i211 | 27) << 1) - (i211 ^ 27);
                    a = i212 % 128;
                    int i213 = i212 % 2;
                    z = false;
                }
            }
            iVar.f(z);
            int i30 = b;
            int i31 = (((i30 & (-18)) | ((~i30) & 17)) - (~(-(-((i30 & 17) << 1))))) - 1;
            a = i31 % 128;
            int i32 = i31 % 2;
        }
        if (iV != i2) {
            throw C0065v.c();
        }
        int i33 = (-2) - ((b + 14) ^ (-1));
        int i34 = i33 % 128;
        a = i34;
        int i35 = i33 % 2;
        int i36 = i34 & 57;
        int i37 = (i36 - (~(-(-((i34 ^ 57) | i36))))) - 1;
        b = i37 % 128;
        if (i37 % 2 == 0) {
            return iV;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int n(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 120) << 1) - (i4 ^ 120)) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            v(bArr, i, bik);
            obj.hashCode();
            throw null;
        }
        L l = (L) oooO0OO;
        int iV = v(bArr, i, bik);
        int i6 = a;
        int i7 = (i6 & 115) + (i6 | 115);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = bik.a;
            int i9 = (i8 | iV) << 1;
            int i10 = -(((~i8) & iV) | ((~iV) & i8));
            i2 = (i9 & i10) + (i10 | i9);
        } else {
            int i11 = bik.a;
            i2 = (i11 & iV) + (i11 | iV);
        }
        int i12 = b;
        int i13 = ((i12 ^ 3) | (i12 & 3)) << 1;
        int i14 = -(((~i12) & 3) | (i12 & (-4)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 2 / 4;
        }
        while (iV < i2) {
            int i17 = b;
            int i18 = i17 & 51;
            int i19 = i18 + ((i17 ^ 51) | i18);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                v(bArr, iV, bik);
                int i20 = bik.a;
                obj.hashCode();
                throw null;
            }
            iV = v(bArr, iV, bik);
            int i21 = bik.a;
            int i22 = a;
            int i23 = (((i22 & (-14)) | ((~i22) & 13)) - (~((i22 & 13) << 1))) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            l.f(i21);
            int i25 = a;
            int i26 = i25 & 99;
            int i27 = (i25 ^ 99) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        if (iV != i2) {
            throw C0065v.c();
        }
        int i30 = b;
        int i31 = i30 & 9;
        int i32 = ((~i31) & (i30 | 9)) + (i31 << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        int i34 = i30 & 121;
        int i35 = i34 + ((i30 ^ 121) | i34);
        a = i35 % 128;
        if (i35 % 2 == 0) {
            int i36 = 26 / 0;
        }
        return iV;
    }

    public static int q(byte[] bArr, int i, biK bik) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 49) + (i3 | 49);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            v(bArr, i, bik);
            int i5 = bik.a;
            throw null;
        }
        int iV = v(bArr, i, bik);
        int i6 = bik.a;
        if (i6 < 0) {
            throw C0065v.i();
        }
        int i7 = a;
        int i8 = i7 & 111;
        int i9 = i8 + ((i7 ^ 111) | i8);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        if (i6 != 0) {
            bik.c = new String(bArr, iV, i6, R.c);
            int i12 = a;
            int i13 = ((i12 & 120) + (i12 | 120)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2 != 0 ? iV << i6 : iV + i6;
            int i15 = (i12 & 117) + (i12 | 117);
            b = i15 % 128;
            int i16 = i15 % 2;
            return i14;
        }
        int i17 = i10 & 17;
        int i18 = i10 | 17;
        int i19 = (i17 & i18) + (i17 | i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        bik.c = BuildConfig.FLAVOR;
        int i21 = a + 46;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            return iV;
        }
        throw null;
    }

    public static int v(byte[] bArr, int i, biK bik) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 105) << 1) - (i3 ^ 105);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            int iT = t(b2, bArr, i7, bik);
            int i8 = a;
            int i9 = i8 & 23;
            int i10 = (i9 - (~((i8 ^ 23) | i9))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return iT;
            }
            throw null;
        }
        int i11 = i5 + 79;
        b = i11 % 128;
        int i12 = i11 % 2;
        bik.a = b2;
        int i13 = b;
        int i14 = ((i13 | 48) << 1) - (i13 ^ 48);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 > ((r4 & r2) + (r2 | r4))) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.C0049e.a;
        r3 = (r2 & 49) + (r2 | 49);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r3 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r2 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r8.c = ivas.gov.bisp.enumeration.aD.AbstractC0069z.c;
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.a;
        r8 = r6 & 13;
        r6 = (r6 ^ 13) | r8;
        r1 = (r8 ^ r6) + ((r6 & r8) << 1);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r6 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r8.c = ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r6, r7, r1);
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r8 = ((r6 & (-42)) | ((~r6) & 41)) + ((r6 & 41) << 1);
        r6 = r8 % 128;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if ((r8 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r7 = r7 % r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r7 = (r7 - (~(-(~(-(-r1)))))) - 1;
        r7 = (r7 << 1) + (r7 ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        r8 = ((r6 | 35) << 1) - (r6 ^ 35);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r2 = r6.length;
        r3 = -r7;
        r4 = ((r2 ^ r3) | (r2 & r3)) << 1;
        r2 = -(((~r2) & r3) | ((~r3) & r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(byte[] r6, int r7, ivas.gov.bisp.enumeration.aD.C0049e.biK r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0049e.b
            r2 = r1 & 29
            r1 = r1 ^ 29
            r1 = r1 | r2
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1f
            int r7 = v(r6, r7, r8)
            int r1 = r8.a
            r2 = 48
            int r2 = r2 / 0
            if (r1 < 0) goto Lab
            goto L27
        L1f:
            int r7 = v(r6, r7, r8)
            int r1 = r8.a
            if (r1 < 0) goto Lab
        L27:
            int r2 = r6.length
            int r3 = -r7
            r4 = r2 ^ r3
            r5 = r2 & r3
            r4 = r4 | r5
            int r4 = r4 << 1
            int r5 = ~r3
            r5 = r5 & r2
            int r2 = ~r2
            r2 = r2 & r3
            r2 = r2 | r5
            int r2 = -r2
            r3 = r4 & r2
            r2 = r2 | r4
            int r3 = r3 + r2
            if (r1 > r3) goto La6
            int r2 = ivas.gov.bisp.enumeration.aD.C0049e.a
            r3 = r2 & 49
            r2 = r2 | 49
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.b = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L51
            r2 = 77
            int r2 = r2 / 0
            if (r1 != 0) goto L70
            goto L53
        L51:
            if (r1 != 0) goto L70
        L53:
            ivas.gov.bisp.enumeration.aD.z r6 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.c
            r8.c = r6
            int r6 = ivas.gov.bisp.enumeration.aD.C0049e.a
            r8 = r6 & 13
            r6 = r6 ^ 13
            r6 = r6 | r8
            r1 = r8 ^ r6
            r6 = r6 & r8
            int r6 = r6 << 1
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.b = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L6f
            r6 = 66
            int r6 = r6 / 0
        L6f:
            return r7
        L70:
            ivas.gov.bisp.enumeration.aD.z r6 = ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r6, r7, r1)
            r8.c = r6
            int r6 = ivas.gov.bisp.enumeration.aD.C0049e.b
            r8 = r6 & (-42)
            int r2 = ~r6
            r2 = r2 & 41
            r8 = r8 | r2
            r6 = r6 & 41
            int r6 = r6 << 1
            int r8 = r8 + r6
            int r6 = r8 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r6
            int r8 = r8 % r0
            if (r8 != 0) goto L8c
            int r7 = r7 % r1
            goto L99
        L8c:
            int r8 = -r1
            int r8 = -r8
            int r8 = ~r8
            int r8 = -r8
            int r8 = ~r8
            int r7 = r7 - r8
            int r7 = r7 + (-1)
            r8 = r7 ^ (-1)
            int r7 = r7 << 1
            int r7 = r7 + r8
        L99:
            r8 = r6 | 35
            int r8 = r8 << 1
            r6 = r6 ^ 35
            int r8 = r8 - r6
            int r6 = r8 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.b = r6
            int r8 = r8 % r0
            return r7
        La6:
            ivas.gov.bisp.enumeration.aD.v r6 = ivas.gov.bisp.enumeration.aD.C0065v.c()
            throw r6
        Lab:
            ivas.gov.bisp.enumeration.aD.v r6 = ivas.gov.bisp.enumeration.aD.C0065v.i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0049e.c(byte[], int, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    public static int j(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 7;
        int i5 = (((i3 ^ 7) | i4) << 1) - ((i3 | 7) & (~i4));
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            v(bArr, i, bik);
            int i6 = bik.a;
            obj.hashCode();
            throw null;
        }
        C0045a c0045a = (C0045a) oooO0OO;
        int iV = v(bArr, i, bik);
        int i7 = bik.a;
        int i8 = -(-iV);
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = b;
        int i11 = (((i10 | 12) << 1) - (i10 ^ 12)) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        while (iV < i9) {
            int i13 = b;
            int i14 = i13 & 9;
            int i15 = (i13 | 9) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                Double.longBitsToDouble(e(bArr, iV));
                throw null;
            }
            c0045a.f(Double.longBitsToDouble(e(bArr, iV)));
            int i18 = iV & (-21);
            int i19 = (iV ^ (-21)) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = (i20 & (-30)) | ((~i20) & 29);
            int i22 = (i20 & 29) << 1;
            iV = (i21 | i22) + (i21 & i22);
            int i23 = b + 41;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        if (iV != i9) {
            throw C0065v.c();
        }
        int i25 = a;
        int i26 = i25 & 29;
        int i27 = i26 + ((i25 ^ 29) | i26);
        b = i27 % 128;
        int i28 = i27 % 2;
        int i29 = i25 + 113;
        b = i29 % 128;
        int i30 = i29 % 2;
        return iV;
    }

    public static int m(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        int i2 = 2 % 2;
        int i3 = b + 115;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            v(bArr, i, bik);
            int i4 = bik.a;
            throw null;
        }
        L l = (L) oooO0OO;
        int iV = v(bArr, i, bik);
        int i5 = bik.a;
        int i6 = a;
        int i7 = ((i6 ^ 41) | (i6 & 41)) << 1;
        int i8 = -(((~i6) & 41) | (i6 & (-42)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        int i12 = (i5 - (~(-(~(-(-iV)))))) - 2;
        int i13 = i10 & 65;
        int i14 = (i13 - (~(-(-((i10 ^ 65) | i13))))) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        while (iV < i12) {
            int i16 = a;
            int i17 = (i16 & (-62)) | ((~i16) & 61);
            int i18 = -(-((i16 & 61) << 1));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            iV = v(bArr, iV, bik);
            int iC = P.c(bik.a);
            int i21 = b;
            int i22 = i21 & 37;
            int i23 = ((i21 ^ 37) | i22) << 1;
            int i24 = -((i21 | 37) & (~i22));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            int i26 = i25 % 2;
            l.f(iC);
            int i27 = b + 73;
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        if (iV != i12) {
            throw C0065v.c();
        }
        int i29 = b;
        int i30 = i29 & 117;
        int i31 = -(-((i29 ^ 117) | i30));
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = i32 % 128;
        a = i33;
        if (i32 % 2 == 0) {
            int i34 = 71 / 0;
        }
        int i35 = i33 + 93;
        b = i35 % 128;
        int i36 = i35 % 2;
        return iV;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r5 = r2 & 57;
        r1 = -(-(r2 | 57));
        r2 = ((r5 | r1) << 1) - (r5 ^ r1);
        ivas.gov.bisp.enumeration.aD.C0049e.a = r2 % 128;
        r2 = r2 % 2;
        r7.c = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r2 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.C0049e.a;
        r7 = r5 & 15;
        r5 = (r5 ^ 15) | r7;
        r1 = (r7 ^ r5) + ((r5 & r7) << 1);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.as.c.c(r5, r6, r1);
        r2 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r3 = r2 & 73;
        r2 = (r2 ^ 73) | r3;
        r4 = (r3 & r2) + (r2 | r3);
        ivas.gov.bisp.enumeration.aD.C0049e.a = r4 % 128;
        r4 = r4 % 2;
        r7.c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r5 = -(~r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        return (((r6 | r5) << 1) - (r5 ^ r6)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r6 % r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r3 = (-2) - ((((r2 | 44) << 1) - (r2 ^ 44)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.C0049e.a = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int s(byte[] r5, int r6, ivas.gov.bisp.enumeration.aD.C0049e.biK r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0049e.b
            r2 = r1 & 93
            r1 = r1 | 93
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1e
            int r6 = v(r5, r6, r7)
            int r1 = r7.a
            r2 = 84
            int r2 = r2 / 0
            if (r1 < 0) goto L8d
            goto L26
        L1e:
            int r6 = v(r5, r6, r7)
            int r1 = r7.a
            if (r1 < 0) goto L8d
        L26:
            int r2 = ivas.gov.bisp.enumeration.aD.C0049e.b
            r3 = r2 | 44
            int r3 = r3 << 1
            r4 = r2 ^ 44
            int r3 = r3 - r4
            r3 = r3 ^ (-1)
            int r3 = (-2) - r3
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r4
            int r3 = r3 % r0
            if (r1 != 0) goto L66
            r5 = r2 & 57
            r1 = r2 | 57
            int r1 = -r1
            int r1 = -r1
            r2 = r5 | r1
            int r2 = r2 << 1
            r5 = r5 ^ r1
            int r2 = r2 - r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r5
            int r2 = r2 % r0
            java.lang.String r5 = ""
            r7.c = r5
            if (r2 == 0) goto L64
            int r5 = ivas.gov.bisp.enumeration.aD.C0049e.a
            r7 = r5 & 15
            r5 = r5 ^ 15
            r5 = r5 | r7
            r1 = r7 ^ r5
            r5 = r5 & r7
            int r5 = r5 << 1
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.b = r5
            int r1 = r1 % r0
            return r6
        L64:
            r5 = 0
            throw r5
        L66:
            ivas.gov.bisp.enumeration.aD.as$bkT r2 = ivas.gov.bisp.enumeration.aD.as.c
            java.lang.String r5 = r2.c(r5, r6, r1)
            int r2 = ivas.gov.bisp.enumeration.aD.C0049e.b
            r3 = r2 & 73
            r2 = r2 ^ 73
            r2 = r2 | r3
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.aD.C0049e.a = r2
            int r4 = r4 % r0
            r7.c = r5
            if (r4 != 0) goto L82
            int r6 = r6 % r1
            goto L8c
        L82:
            int r5 = ~r1
            int r5 = -r5
            r7 = r6 | r5
            int r7 = r7 << 1
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r6 = r7 + (-1)
        L8c:
            return r6
        L8d:
            ivas.gov.bisp.enumeration.aD.v r5 = ivas.gov.bisp.enumeration.aD.C0065v.i()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0049e.s(byte[], int, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    public static int u(int i, byte[] bArr, int i2, int i3, o0OO00O.OooO0OO<?> oooO0OO, biK bik) {
        L l;
        int iV;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 9;
        int i7 = -(-((i5 ^ 9) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            l = (L) oooO0OO;
            iV = v(bArr, i2, bik);
            int i9 = 73 / 0;
        } else {
            l = (L) oooO0OO;
            iV = v(bArr, i2, bik);
        }
        l.f(bik.a);
        int i10 = a + 91;
        b = i10 % 128;
        int i11 = i10 % 2;
        while (iV < i3) {
            int i12 = a + 126;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            Object obj = null;
            if (i13 % 2 != 0) {
                v(bArr, iV, bik);
                obj.hashCode();
                throw null;
            }
            int iV2 = v(bArr, iV, bik);
            if (i != bik.a) {
                break;
            }
            int i14 = a;
            int i15 = i14 & 11;
            int i16 = ((i14 ^ 11) | i15) << 1;
            int i17 = -((i14 | 11) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                v(bArr, iV2, bik);
                int i19 = bik.a;
                throw null;
            }
            iV = v(bArr, iV2, bik);
            int i20 = bik.a;
            int i21 = a;
            int i22 = (((i21 & (-84)) | ((~i21) & 83)) - (~(-(-((i21 & 83) << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            l.f(i20);
            int i24 = a;
            int i25 = ((i24 & (-18)) | ((~i24) & 17)) + ((i24 & 17) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = b + 89;
        a = i27 % 128;
        int i28 = i27 % 2;
        return iV;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if (r2 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r2 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        r9 = r10 & 83;
        r12 = -(-(r10 | 83));
        r13 = (r9 & r12) + (r9 | r12);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r13 % 128;
        r13 = r13 % 2;
        r9 = r10 & 5;
        r10 = (r10 ^ 5) | r9;
        r12 = ((r9 | r10) << 1) - (r9 ^ r10);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        if ((r12 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int x(int r9, byte[] r10, int r11, int r12, ivas.gov.bisp.enumeration.aD.C0049e.biK r13) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0049e.x(int, byte[], int, int, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    public static int k(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        int i2 = 2 % 2;
        int i3 = b + 15;
        a = i3 % 128;
        int i4 = i3 % 2;
        W w = (W) oooO0OO;
        int iV = v(bArr, i, bik);
        int i5 = bik.a;
        int i6 = a;
        int i7 = i6 & 17;
        int i8 = ((~i7) & (i6 | 17)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = -(-iV);
        int i11 = i5 & i10;
        int i12 = i5 | i10;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i6 & 23;
        int i15 = (i6 ^ 23) | i14;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        while (iV < i13) {
            int i18 = a;
            int i19 = ((i18 | 119) << 1) - (i18 ^ 119);
            b = i19 % 128;
            int i20 = i19 % 2;
            w.f(e(bArr, iV));
            iV = i20 != 0 ? iV + 30 : ((iV | 8) << 1) - (iV ^ 8);
            int i21 = b + 55;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        if (iV != i13) {
            throw C0065v.c();
        }
        int i23 = b;
        int i24 = i23 + 65;
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = ((i23 & 93) - (~(-(-(i23 | 93))))) - 1;
        a = i26 % 128;
        int i27 = i26 % 2;
        return iV;
    }

    public static int w(byte[] bArr, int i, biK bik) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 53) << 1) - (i3 ^ 53);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = ((i & (-2)) | ((~i) & 1)) + ((i & 1) << 1);
        long j = bArr[i];
        if (j >= 0) {
            int i8 = i5 & 53;
            int i9 = -(-((i5 ^ 53) | i8));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            bik.b = j;
            int i12 = b;
            int i13 = ((i12 | 27) << 1) - (i12 ^ 27);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return i7;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i14 = i7 + 1;
        byte b2 = bArr[i7];
        int i15 = ((i3 | 73) << 1) - (i3 ^ 73);
        b = i15 % 128;
        int i16 = 7;
        long j2 = i15 % 2 != 0 ? (j * 127) & (((long) (b2 & 65)) >>> 117) : (j & 127) | (((long) (b2 & 127)) << 7);
        int i17 = i3 ^ 41;
        int i18 = (i3 & 41) << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i3 & 79;
        int i22 = (i3 ^ 79) | i21;
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        while (b2 < 0) {
            int i25 = a + 85;
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            byte b3 = bArr[i14];
            int i28 = i16 & 118;
            int i29 = (i28 - (~(-(-((i16 ^ 118) | i28))))) - 1;
            int i30 = i29 & (-111);
            i16 = (i30 - (~((i29 ^ (-111)) | i30))) - 1;
            int i31 = (i26 & 39) + (i26 | 39);
            a = i31 % 128;
            if (i31 % 2 == 0) {
                j2 |= ((long) ((~(b3 & 41)) & (b3 | 41))) >>> i16;
                i14 += 102;
            } else {
                j2 |= ((long) (b3 & 127)) << i16;
                i14++;
            }
            b2 = b3;
        }
        bik.b = j2;
        int i32 = a;
        int i33 = i32 & 85;
        int i34 = i33 + ((i32 ^ 85) | i33);
        b = i34 % 128;
        int i35 = i34 % 2;
        return i14;
    }

    public static int h(ah ahVar, byte[] bArr, int i, int i2, biK bik) {
        int iT;
        int i3;
        Object objN;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 ^ 76) + ((i6 & 76) << 1)) - 1;
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            iT = i % 1;
            i3 = bArr[i];
        } else {
            int i9 = i + 2;
            iT = (i9 << 1) + (i9 ^ (-1));
            i3 = bArr[i];
        }
        Object obj = null;
        if (i3 < 0) {
            int i10 = ((i8 & 111) - (~(i8 | 111))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                t(i3, bArr, iT, bik);
                obj.hashCode();
                throw null;
            }
            iT = t(i3, bArr, iT, bik);
            int i11 = a;
            int i12 = i11 | 47;
            int i13 = ((i12 << 1) - (~(-((~(i11 & 47)) & i12)))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                i3 = bik.a;
                int i14 = 6 / 0;
            } else {
                i3 = bik.a;
            }
            int i15 = b;
            int i16 = ((i15 & 4) + (i15 | 4)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = iT;
        if (i3 >= 0) {
            int i19 = a;
            int i20 = (((i19 & (-38)) | ((~i19) & 37)) - (~((i19 & 37) << 1))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = -i18;
            int i23 = (i2 | i22) << 1;
            int i24 = -(((~i2) & i22) | ((~i22) & i2));
            if (i3 <= ((i23 | i24) << 1) - (i24 ^ i23)) {
                int i25 = i19 + 32;
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    objN = ahVar.n();
                    int i27 = -i22;
                    int i28 = i3 & i27;
                    int i29 = i3 | i27;
                    i4 = (i28 & i29) + (i29 | i28);
                } else {
                    objN = ahVar.n();
                    int i30 = -i22;
                    i4 = ((i3 | i30) << 1) - (i3 ^ i30);
                }
                int i31 = a;
                int i32 = (i31 ^ 123) + ((i31 & 123) << 1);
                b = i32 % 128;
                Object obj2 = objN;
                int i33 = i4;
                if (i32 % 2 != 0) {
                    ahVar.f(obj2, bArr, i18, i33, bik);
                    throw null;
                }
                ahVar.f(obj2, bArr, i18, i33, bik);
                ahVar.h(objN);
                bik.c = objN;
                int i34 = b;
                int i35 = (i34 & 16) + (i34 | 16);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
                int i38 = i34 + 107;
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }
        }
        throw C0065v.c();
    }

    public static int l(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 79;
        b = i4 % 128;
        int i5 = i4 % 2;
        Q q = (Q) oooO0OO;
        int iV = v(bArr, i, bik);
        int i6 = a;
        int i7 = (i6 & 73) + (i6 | 73);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = bik.a;
        int i10 = -(~iV);
        int i11 = (((i9 | i10) << 1) - (i9 ^ i10)) - 1;
        int i12 = a;
        int i13 = ((i12 ^ 78) + ((i12 & 78) << 1)) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        while (iV < i11) {
            int i15 = b;
            int i16 = (i15 ^ 18) + ((i15 & 18) << 1);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                q.f(Float.intBitsToFloat(d(bArr, iV)));
                i2 = ((iV | 96) << 1) - (iV ^ 96);
            } else {
                q.f(Float.intBitsToFloat(d(bArr, iV)));
                i2 = ((iV & 5) + (iV | 5)) - 1;
            }
            iV = i2;
            int i18 = a + 59;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        if (iV != i11) {
            throw C0065v.c();
        }
        int i20 = b;
        int i21 = i20 & 91;
        int i22 = (i20 | 91) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        a = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 29 / 0;
        }
        return iV;
    }

    public static int o(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 13;
        int i6 = -(-(i4 | 13));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        W w = (W) oooO0OO;
        int iV = v(bArr, i, bik);
        int i9 = b;
        int i10 = i9 & 43;
        int i11 = ((i9 | 43) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            i2 = bik.a / iV;
        } else {
            int i12 = bik.a;
            int i13 = -(~(-(-iV)));
            i2 = (((i12 | i13) << 1) - (i12 ^ i13)) - 1;
        }
        while (true) {
            Object obj = null;
            if (iV >= i2) {
                if (iV != i2) {
                    throw C0065v.c();
                }
                int i14 = a + 77;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    return iV;
                }
                throw null;
            }
            int i15 = b;
            int i16 = ((i15 ^ 73) | (i15 & 73)) << 1;
            int i17 = -(((~i15) & 73) | (i15 & (-74)));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                w(bArr, iV, bik);
                w.f(P.d(bik.b));
                obj.hashCode();
                throw null;
            }
            iV = w(bArr, iV, bik);
            w.f(P.d(bik.b));
            int i19 = b + 31;
            a = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    public static int p(byte[] bArr, int i, o0OO00O.OooO0OO<?> oooO0OO, biK bik) throws C0065v {
        Object obj;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 113) + (i4 | 113);
        a = i5 % 128;
        int i6 = i5 % 2;
        W w = (W) oooO0OO;
        int iV = v(bArr, i, bik);
        int i7 = a + 123;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = bik.a;
        int i10 = -(-iV);
        int i11 = i9 ^ i10;
        int i12 = (i9 & i10) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = a + 43;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 4 / 2;
        }
        do {
            obj = null;
            if (iV >= i13) {
                if (iV != i13) {
                    throw C0065v.c();
                }
                int i16 = b;
                int i17 = i16 & 89;
                int i18 = (~i17) & (i16 | 89);
                int i19 = i17 << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 22 / 0;
                }
                int i22 = i16 & 41;
                int i23 = i22 + ((i16 ^ 41) | i22);
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    return iV;
                }
                obj.hashCode();
                throw null;
            }
            int i24 = b;
            int i25 = ((i24 | 109) << 1) - (i24 ^ 109);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                w(bArr, iV, bik);
                long j = bik.b;
                throw null;
            }
            iV = w(bArr, iV, bik);
            long j2 = bik.b;
            int i26 = a;
            int i27 = ((i26 ^ 111) | (i26 & 111)) << 1;
            int i28 = -(((~i26) & 111) | (i26 & (-112)));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            i2 = i29 % 2;
            w.f(j2);
        } while (i2 == 0);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:
    
        if (r2 <= (r18.length << r1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        if (r2 <= ((-2) - (((r4 & r5) + (r4 | r5)) ^ (-1)))) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        if (r2 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        r3 = r3 + 21;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r3 % 128;
        r3 = r3 % 2;
        r21.g(r17, ivas.gov.bisp.enumeration.aD.AbstractC0069z.c);
        r0 = ivas.gov.bisp.enumeration.aD.C0049e.b + 115;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0194, code lost:
    
        r21.g(r17, ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r18, r1, r2));
        r0 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r3 = r0 & 59;
        r3 = (r3 - (~(-(-((r0 ^ 59) | r3))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ac, code lost:
    
        r0 = -(-r2);
        r2 = r1 & r0;
        r0 = (((r0 | r1) & (~r2)) - (~(-(-(r2 << 1))))) - 1;
        r1 = ivas.gov.bisp.enumeration.aD.C0049e.a + 115;
        ivas.gov.bisp.enumeration.aD.C0049e.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(int r17, byte[] r18, int r19, int r20, ivas.gov.bisp.enumeration.aD.an r21, ivas.gov.bisp.enumeration.aD.C0049e.biK r22) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0049e.r(int, byte[], int, int, ivas.gov.bisp.enumeration.aD.an, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (r2 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (r2 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        r7 = r2 << 14;
        r2 = r6 & r7;
        r9.a = ((r6 | r7) & (~r2)) | r2;
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.a + 43;
        ivas.gov.bisp.enumeration.aD.C0049e.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        r6 = r6 | ((r2 & 127) << 14);
        r2 = r3 & 59;
        r2 = r2 + ((r3 ^ 59) | r2);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if ((r2 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        r2 = r8 >>> 1;
        r8 = r7[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r8 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        r2 = (r8 & (-2)) | ((~r8) & 1);
        r4 = -(-((r8 & 1) << 1));
        r2 = (r2 | r4) + (r2 & r4);
        r8 = r7[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r8 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r7 = r8 << 21;
        r8 = r6 & r7;
        r9.a = ((r6 | r7) & (~r8)) | r8;
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r8 = r6 & 87;
        r7 = ((r6 ^ 87) | r8) << 1;
        r6 = -((r6 | 87) & (~r8));
        r8 = (r7 & r6) + (r6 | r7);
        ivas.gov.bisp.enumeration.aD.C0049e.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        r6 = r6 ^ ((r8 & 127) << 21);
        r8 = (r3 ^ 87) + ((r3 & 87) << 1);
        r3 = r8 % 128;
        ivas.gov.bisp.enumeration.aD.C0049e.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fd, code lost:
    
        if ((r8 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        r8 = ((r2 & 1) + (r2 | 1)) - 1;
        r2 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (r2 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
    
        r8 = r2 & 1;
        r8 = (((~r8) & (r2 | 1)) - (~(-(-(r8 << 1))))) - 1;
        r2 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (r2 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        r3 = r3 + 109;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        if ((r3 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        r6 = r6 & (r2 << 67);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        r9.a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        r7 = r2 << 28;
        r2 = r6 & r7;
        r6 = ((r6 | r7) & (~r2)) | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r7 = ((r6 & 75) - (~(-(-(r6 | 75))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
    
        if ((r7 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
    
        r3 = ((r8 | 1) << 1) - (r8 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
    
        if (r7[r8] >= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0155, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r4 = (r8 ^ 81) + ((r8 & 81) << 1);
        r8 = r4 % 128;
        ivas.gov.bisp.enumeration.aD.C0049e.a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        if ((r4 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        r4 = (r8 & (-60)) | ((~r8) & 59);
        r8 = (r8 & 59) << 1;
        r5 = (r4 ^ r8) + ((r8 & r4) << 1);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r5 % 128;
        r5 = r5 % 2;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
    
        r6 = r6 ^ ((r2 & 127) << 28);
        r7 = ivas.gov.bisp.enumeration.aD.C0049e.b;
        r8 = (r7 ^ 11) + ((r7 & 11) << 1);
        ivas.gov.bisp.enumeration.aD.C0049e.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0191, code lost:
    
        if ((r8 % 2) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0193, code lost:
    
        r9.a = r6;
        r6 = ivas.gov.bisp.enumeration.aD.C0049e.a;
        r7 = (r6 & (-90)) | ((~r6) & 89);
        r6 = (r6 & 89) << 1;
        r8 = (r7 & r6) + (r6 | r7);
        ivas.gov.bisp.enumeration.aD.C0049e.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01aa, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:
    
        r9.a = r6;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int t(int r6, byte[] r7, int r8, ivas.gov.bisp.enumeration.aD.C0049e.biK r9) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0049e.t(int, byte[], int, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }
}
