package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public static final x m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f81o;
    public static final x d = new bFv("eras", (byte) 1);
    public static final x e = new bFv("centuries", (byte) 2);
    public static final x g = new bFv("weekyears", (byte) 3);
    public static final x f = new bFv("years", (byte) 4);
    public static final x h = new bFv("months", (byte) 5);
    public static final x i = new bFv("weeks", (byte) 6);
    public static final x c = new bFv("days", (byte) 7);
    public static final x j = new bFv("halfdays", (byte) 8);
    public static final x k = new bFv("hours", (byte) 9);
    public static final x l = new bFv("minutes", (byte) 10);
    public static final x n = new bFv("seconds", (byte) 11);

    public static class bFv extends x {
        private static int a = 1;
        private static int b;
        public final byte p;

        public bFv(String str, byte b2) {
            super(str);
            this.p = b2;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = i3 + ((i2 ^ 107) | i3);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            boolean z = false;
            if (this == obj) {
                int i7 = i5 ^ 49;
                int i8 = (i5 & 49) << 1;
                int i9 = (i7 & i8) + (i7 | i8);
                a = i9 % 128;
                return i9 % 2 != 0;
            }
            if (!(obj instanceof bFv)) {
                int i10 = i2 & 37;
                int i11 = (i2 | 37) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            int i15 = ((i2 ^ 18) + ((i2 & 18) << 1)) - 1;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                byte b2 = ((bFv) obj).p;
                throw null;
            }
            if (this.p != ((bFv) obj).p) {
                int i16 = i2 + 105;
                b = i16 % 128;
                int i17 = i16 % 2;
            } else {
                z = true;
            }
            int i18 = b;
            int i19 = i18 & 63;
            int i20 = ((((i18 ^ 63) | i19) << 1) - (~(-((i18 | 63) & (~i19))))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 97;
            int i4 = i3 + ((i2 ^ 97) | i3);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = 1 << this.p;
            int i8 = i5 & 73;
            int i9 = i5 | 73;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 46 / 0;
            }
            return i7;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r7
  0x0032: PHI (r7v25 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x0048 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x0049  */
        /* JADX WARN: Code duplicated, block: B:14:0x004a A[PHI: r7
  0x004a: PHI (r7v23 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0060 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0061  */
        /* JADX WARN: Code duplicated, block: B:18:0x0062 A[PHI: r7
  0x0062: PHI (r7v21 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0078 A[PHI: r7
  0x0078: PHI (r7v19 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x008b A[PHI: r7
  0x008b: PHI (r7v17 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[PHI: r7
  0x00a1: PHI (r7v15 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd A[PHI: r7
  0x00bd: PHI (r7v13 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00d7 A[PHI: r7
  0x00d7: PHI (r7v11 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f6 A[PHI: r7
  0x00f6: PHI (r7v9 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x010c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x010d  */
        /* JADX WARN: Code duplicated, block: B:39:0x0111 A[PHI: r7
  0x0111: PHI (r7v7 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x0128 A[PHI: r7
  0x0128: PHI (r7v5 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x0141  */
        /* JADX WARN: Code duplicated, block: B:45:0x0143 A[PHI: r7
  0x0143: PHI (r7v3 ivas.gov.bisp.enumeration.p.h) = (r7v1 ivas.gov.bisp.enumeration.p.h), (r7v27 ivas.gov.bisp.enumeration.p.h) binds: [B:8:0x002d, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x0152  */
        /* JADX WARN: Code duplicated, block: B:49:0x0156  */
        @Override // ivas.gov.bisp.enumeration.cP.x
        public J c(h hVar) {
            h hVarB;
            int i;
            int i2;
            J jAY;
            int i3;
            int i4;
            int i5;
            J jAO;
            int i6;
            J jAA;
            int i7;
            int i8 = 2 % 2;
            int i9 = b;
            int i10 = i9 & 111;
            int i11 = ((i9 | 111) & (~i10)) + (i10 << 1);
            a = i11 % 128;
            Object obj = null;
            if (i11 % 2 != 0) {
                hVarB = u.b(hVar);
                switch (this.p) {
                    case 1:
                        J jR = hVarB.R();
                        i = a + 27;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i12 = 72 / 0;
                        }
                        return jR;
                    case 2:
                        J jS = hVarB.s();
                        int i13 = b;
                        int i14 = i13 & 29;
                        int i15 = (i13 | 29) & (~i14);
                        int i16 = i14 << 1;
                        i2 = (i15 & i16) + (i15 | i16);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i17 = 63 / 0;
                        }
                        return jS;
                    case 3:
                        J jAt = hVarB.at();
                        int i18 = b;
                        int i19 = (-2) - (((i18 ^ 60) + ((i18 & 60) << 1)) ^ (-1));
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        return jAt;
                    case 4:
                        jAY = hVarB.aY();
                        int i21 = a;
                        int i22 = i21 | 91;
                        i3 = (i22 << 1) - ((~(i21 & 91)) & i22);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            return jAY;
                        }
                        obj.hashCode();
                        throw null;
                    case 5:
                        J jAF = hVarB.aF();
                        int i23 = b;
                        int i24 = i23 & 103;
                        int i25 = (i23 | 103) & (~i24);
                        int i26 = -(-(i24 << 1));
                        i4 = (i25 & i26) + (i25 | i26);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i27 = 20 / 0;
                        }
                        return jAF;
                    case 6:
                        J jAU = hVarB.aU();
                        int i28 = b;
                        int i29 = (((i28 & (-112)) | ((~i28) & 111)) - (~((i28 & 111) << 1))) - 1;
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        return jAU;
                    case 7:
                        J jZ = hVarB.z();
                        int i31 = a;
                        int i32 = i31 & 95;
                        int i33 = ((i31 ^ 95) | i32) << 1;
                        int i34 = -((i31 | 95) & (~i32));
                        int i35 = (i33 & i34) + (i34 | i33);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        return jZ;
                    case 8:
                        J jBq = hVarB.bq();
                        int i37 = a;
                        i5 = ((i37 | 103) << 1) - (i37 ^ 103);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i38 = 0 / 0;
                        }
                        return jBq;
                    case 9:
                        J jBh = hVarB.bh();
                        int i39 = a;
                        int i40 = ((i39 | 39) << 1) - (i39 ^ 39);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        return jBh;
                    case 10:
                        J jAR = hVarB.aR();
                        int i42 = a;
                        int i43 = ((i42 | 63) << 1) - (((~i42) & 63) | (i42 & (-64)));
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        return jAR;
                    case 11:
                        jAO = hVarB.aO();
                        int i45 = b;
                        i6 = ((i45 ^ 40) + ((i45 & 40) << 1)) - 1;
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            return jAO;
                        }
                        throw null;
                    case 12:
                        jAA = hVarB.aA();
                        int i46 = a;
                        int i47 = i46 & 81;
                        i7 = ((i46 | 81) & (~i47)) + (i47 << 1);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            return jAA;
                        }
                        throw null;
                    default:
                        throw new InternalError();
                }
            }
            hVarB = u.b(hVar);
            int i48 = 55 / 0;
            switch (this.p) {
                case 1:
                    J jR2 = hVarB.R();
                    i = a + 27;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i110 = 72 / 0;
                    }
                    return jR2;
                case 2:
                    J jS2 = hVarB.s();
                    int i111 = b;
                    int i112 = i111 & 29;
                    int i113 = (i111 | 29) & (~i112);
                    int i114 = i112 << 1;
                    i2 = (i113 & i114) + (i113 | i114);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i115 = 63 / 0;
                    }
                    return jS2;
                case 3:
                    J jAt2 = hVarB.at();
                    int i116 = b;
                    int i117 = (-2) - (((i116 ^ 60) + ((i116 & 60) << 1)) ^ (-1));
                    a = i117 % 128;
                    int i210 = i117 % 2;
                    return jAt2;
                case 4:
                    jAY = hVarB.aY();
                    int i211 = a;
                    int i212 = i211 | 91;
                    i3 = (i212 << 1) - ((~(i211 & 91)) & i212);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        return jAY;
                    }
                    obj.hashCode();
                    throw null;
                case 5:
                    J jAF2 = hVarB.aF();
                    int i213 = b;
                    int i214 = i213 & 103;
                    int i215 = (i213 | 103) & (~i214);
                    int i216 = -(-(i214 << 1));
                    i4 = (i215 & i216) + (i215 | i216);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i217 = 20 / 0;
                    }
                    return jAF2;
                case 6:
                    J jAU2 = hVarB.aU();
                    int i218 = b;
                    int i219 = (((i218 & (-112)) | ((~i218) & 111)) - (~((i218 & 111) << 1))) - 1;
                    a = i219 % 128;
                    int i310 = i219 % 2;
                    return jAU2;
                case 7:
                    J jZ2 = hVarB.z();
                    int i311 = a;
                    int i312 = i311 & 95;
                    int i313 = ((i311 ^ 95) | i312) << 1;
                    int i314 = -((i311 | 95) & (~i312));
                    int i315 = (i313 & i314) + (i314 | i313);
                    b = i315 % 128;
                    int i316 = i315 % 2;
                    return jZ2;
                case 8:
                    J jBq2 = hVarB.bq();
                    int i317 = a;
                    i5 = ((i317 | 103) << 1) - (i317 ^ 103);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i318 = 0 / 0;
                    }
                    return jBq2;
                case 9:
                    J jBh2 = hVarB.bh();
                    int i319 = a;
                    int i49 = ((i319 | 39) << 1) - (i319 ^ 39);
                    b = i49 % 128;
                    int i410 = i49 % 2;
                    return jBh2;
                case 10:
                    J jAR2 = hVarB.aR();
                    int i411 = a;
                    int i412 = ((i411 | 63) << 1) - (((~i411) & 63) | (i411 & (-64)));
                    b = i412 % 128;
                    int i413 = i412 % 2;
                    return jAR2;
                case 11:
                    jAO = hVarB.aO();
                    int i414 = b;
                    i6 = ((i414 ^ 40) + ((i414 & 40) << 1)) - 1;
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        return jAO;
                    }
                    throw null;
                case 12:
                    jAA = hVarB.aA();
                    int i415 = a;
                    int i416 = i415 & 81;
                    i7 = ((i415 | 81) & (~i416)) + (i416 << 1);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        return jAA;
                    }
                    throw null;
                default:
                    throw new InternalError();
            }
        }
    }

    static {
        bFv bfv = new bFv("millis", (byte) 12);
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = ((i2 ^ 119) | i3) << 1;
        int i5 = -((i2 | 119) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            m = bfv;
            return;
        }
        m = bfv;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public x(String str) {
        this.f81o = str;
    }

    public abstract J c(h hVar);

    public String toString() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-124)) | ((~i3) & 123)) + ((i3 & 123) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f81o;
        int i6 = ((((i3 ^ 33) | (i3 & 33)) << 1) - (~(-(((~i3) & 33) | (i3 & (-34)))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
        return str;
    }
}
