package ivas.gov.bisp.enumeration.cP;

import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Serializable;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246t implements Serializable {
    private static int a = 1;
    private static int b;
    public static final AbstractC0246t c;
    public static final AbstractC0246t d;
    public static final AbstractC0246t e;
    public static final AbstractC0246t f;
    public static final AbstractC0246t g;
    public static final AbstractC0246t h;
    public static final AbstractC0246t i;
    public static final AbstractC0246t j;
    public static final AbstractC0246t k;
    public static final AbstractC0246t l;
    public static final AbstractC0246t m;
    public static final AbstractC0246t n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC0246t f80o;
    public static final AbstractC0246t p;
    public static final AbstractC0246t q;
    public static final AbstractC0246t r;
    public static final AbstractC0246t s;
    public static final AbstractC0246t t;
    public static final AbstractC0246t u;
    public static final AbstractC0246t v;
    public static final AbstractC0246t w;
    public static final AbstractC0246t x;
    public static final AbstractC0246t y;
    public final String z;

    public AbstractC0246t(String str) {
        this.z = str;
    }

    public abstract P c(h hVar);

    public String toString() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 37;
        int i5 = ((i3 ^ 37) | i4) << 1;
        int i6 = -((~i4) & (i3 | 37));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        String str = this.z;
        int i9 = (-2) - ((i3 + 10) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        x xVar = x.d;
        d = new bFe("era", (byte) 1, xVar, null);
        x xVar2 = x.f;
        e = new bFe("yearOfEra", (byte) 2, xVar2, xVar);
        x xVar3 = x.e;
        g = new bFe("centuryOfEra", (byte) 3, xVar3, xVar);
        f = new bFe("yearOfCentury", (byte) 4, xVar2, xVar3);
        h = new bFe("year", (byte) 5, xVar2, null);
        x xVar4 = x.c;
        i = new bFe("dayOfYear", (byte) 6, xVar4, xVar2);
        x xVar5 = x.h;
        c = new bFe("monthOfYear", (byte) 7, xVar5, xVar2);
        j = new bFe("dayOfMonth", (byte) 8, xVar4, xVar5);
        x xVar6 = x.g;
        k = new bFe("weekyearOfCentury", (byte) 9, xVar6, xVar3);
        l = new bFe("weekyear", (byte) 10, xVar6, null);
        x xVar7 = x.i;
        n = new bFe("weekOfWeekyear", (byte) 11, xVar7, xVar6);
        m = new bFe("dayOfWeek", (byte) 12, xVar4, xVar7);
        x xVar8 = x.j;
        f80o = new bFe("halfdayOfDay", (byte) 13, xVar8, xVar4);
        x xVar9 = x.k;
        p = new bFe("hourOfHalfday", (byte) 14, xVar9, xVar8);
        r = new bFe("clockhourOfHalfday", (byte) 15, xVar9, xVar8);
        q = new bFe("clockhourOfDay", (byte) 16, xVar9, xVar4);
        s = new bFe("hourOfDay", (byte) 17, xVar9, xVar4);
        x xVar10 = x.l;
        v = new bFe("minuteOfDay", (byte) 18, xVar10, xVar4);
        u = new bFe("minuteOfHour", (byte) 19, xVar10, xVar9);
        x xVar11 = x.n;
        w = new bFe("secondOfDay", (byte) 20, xVar11, xVar4);
        x = new bFe("secondOfMinute", (byte) 21, xVar11, xVar10);
        x xVar12 = x.m;
        t = new bFe("millisOfDay", (byte) 22, xVar12, xVar4);
        y = new bFe("millisOfSecond", (byte) 23, xVar12, xVar11);
        int i2 = a + 51;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.t$bFe */
    public static class bFe extends AbstractC0246t {
        private static int a = 0;
        private static int b = 1;
        public final byte A;
        public final transient x B;

        public bFe(String str, byte b2, x xVar, x xVar2) {
            super(str);
            this.A = b2;
            this.B = xVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0063  */
        public boolean equals(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 123) | (i2 & 123)) << 1;
            int i4 = -((i2 & (-124)) | ((~i2) & 123));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            int i6 = i5 % 128;
            b = i6;
            Object obj2 = null;
            if (i5 % 2 != 0 ? this == obj : this == obj) {
                int i7 = ((i6 & 34) + (i6 | 34)) - 1;
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof bFe)) {
                int i8 = (i6 ^ 23) + ((i6 & 23) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = i2 | 55;
            int i11 = i10 << 1;
            int i12 = -(i10 & (~(i2 & 55)));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                byte b2 = ((bFe) obj).A;
                obj2.hashCode();
                throw null;
            }
            if (this.A != ((bFe) obj).A) {
                int i14 = ((i2 & 44) + (i2 | 44)) - 1;
                b = i14 % 128;
                z = i14 % 2 == 0;
            }
            int i15 = (i2 & (-34)) | ((~i2) & 33);
            int i16 = -(-((i2 & 33) << 1));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 41;
            int i4 = (i2 ^ 41) | i3;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 1 << this.A;
            int i8 = (i2 ^ 9) + ((i2 & 9) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return i7;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0246t
        public P c(h hVar) {
            int i = 2 % 2;
            int i2 = b + 75;
            a = i2 % 128;
            int i3 = i2 % 2;
            h hVarB = u.b(hVar);
            Object obj = null;
            switch (this.A) {
                case 1:
                    P pO = hVarB.O();
                    int i4 = b;
                    int i5 = i4 & 83;
                    int i6 = (i5 - (~((i4 ^ 83) | i5))) - 1;
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        return pO;
                    }
                    throw null;
                case 2:
                    P pBb = hVarB.bb();
                    int i7 = b;
                    int i8 = (i7 & 81) + (i7 | 81);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    return pBb;
                case 3:
                    P pT = hVarB.t();
                    int i10 = b + 95;
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        return pT;
                    }
                    obj.hashCode();
                    throw null;
                case 4:
                    P pAZ = hVarB.aZ();
                    int i11 = b;
                    int i12 = i11 & 101;
                    int i13 = ((i11 | 101) & (~i12)) + (i12 << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    return pAZ;
                case 5:
                    P pBd = hVarB.bd();
                    int i15 = b;
                    int i16 = i15 ^ 25;
                    int i17 = (i15 & 25) << 1;
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        return pBd;
                    }
                    obj.hashCode();
                    throw null;
                case 6:
                    P pY = hVarB.y();
                    int i19 = a;
                    int i20 = i19 & 65;
                    int i21 = (i20 - (~((i19 ^ 65) | i20))) - 1;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    return pY;
                case 7:
                    return hVarB.aD();
                case 8:
                    P pX = hVarB.x();
                    int i23 = b + 79;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    return pX;
                case 9:
                    return hVarB.aX();
                case 10:
                    P pAW = hVarB.aW();
                    int i25 = b;
                    int i26 = i25 ^ 19;
                    int i27 = -(-((i25 & 19) << 1));
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    a = i28 % 128;
                    if (i28 % 2 == 0) {
                        return pAW;
                    }
                    throw null;
                case 11:
                    P pAT = hVarB.aT();
                    int i29 = b;
                    int i30 = (i29 & 47) + (i29 | 47);
                    a = i30 % 128;
                    if (i30 % 2 == 0) {
                        return pAT;
                    }
                    throw null;
                case 12:
                    return hVarB.w();
                case 13:
                    P pAs = hVarB.as();
                    int i31 = a;
                    int i32 = i31 & 55;
                    int i33 = (((i31 ^ 55) | i32) << 1) - ((i31 | 55) & (~i32));
                    b = i33 % 128;
                    if (i33 % 2 != 0) {
                        return pAs;
                    }
                    throw null;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    P pBg = hVarB.bg();
                    int i34 = a;
                    int i35 = i34 & 23;
                    int i36 = (i34 | 23) & (~i35);
                    int i37 = i35 << 1;
                    int i38 = (i36 & i37) + (i36 | i37);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    return pBg;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    P pV = hVarB.v();
                    int i40 = b;
                    int i41 = i40 & 21;
                    int i42 = i41 + ((i40 ^ 21) | i41);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    return pV;
                case 16:
                    P pU = hVarB.u();
                    int i44 = b;
                    int i45 = i44 & 79;
                    int i46 = (i44 ^ 79) | i45;
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    a = i47 % 128;
                    if (i47 % 2 == 0) {
                        return pU;
                    }
                    throw null;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    return hVarB.bw();
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    P pAE = hVarB.aE();
                    int i48 = b;
                    int i49 = i48 & 101;
                    int i50 = (i48 | 101) & (~i49);
                    int i51 = i49 << 1;
                    int i52 = (i50 & i51) + (i50 | i51);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    return pAE;
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    P pAV = hVarB.aV();
                    int i54 = a;
                    int i55 = (i54 & (-28)) | ((~i54) & 27);
                    int i56 = -(-((i54 & 27) << 1));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    return pAV;
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    P pAK = hVarB.aK();
                    int i59 = b;
                    int i60 = ((i59 ^ 110) + ((i59 & 110) << 1)) - 1;
                    a = i60 % 128;
                    int i61 = i60 % 2;
                    return pAK;
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    P pAM = hVarB.aM();
                    int i62 = a;
                    int i63 = i62 & 121;
                    int i64 = (i63 - (~((i62 ^ 121) | i63))) - 1;
                    b = i64 % 128;
                    if (i64 % 2 != 0) {
                        return pAM;
                    }
                    obj.hashCode();
                    throw null;
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    P pAB = hVarB.aB();
                    int i65 = b;
                    int i66 = (i65 ^ 85) + ((i65 & 85) << 1);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                    return pAB;
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    P pAu = hVarB.au();
                    int i68 = b;
                    int i69 = (i68 & 91) + (i68 | 91);
                    a = i69 % 128;
                    if (i69 % 2 == 0) {
                        return pAu;
                    }
                    throw null;
                default:
                    throw new InternalError();
            }
        }
    }
}
