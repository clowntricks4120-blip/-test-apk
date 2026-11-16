package ivas.gov.bisp.enumeration.p029bb;

import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aS.Q;
import ivas.gov.bisp.enumeration.o0000o0o.o00oO0o;
import ivas.gov.bisp.enumeration.o0000o0o.o0ooOOo;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class O implements o0ooOOo<ivas.gov.bisp.enumeration.aS.O, ivas.gov.bisp.enumeration.aS.O> {
    private static int a = 0;
    private static int b = 1;
    public static final Logger c = Logger.getLogger(O.class.getName());

    static {
        int i = b;
        int i2 = ((i ^ 96) + ((i & 96) << 1)) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public Class<ivas.gov.bisp.enumeration.aS.O> b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = (i2 ^ 59) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        int i7 = i2 & 79;
        int i8 = -(-((i2 ^ 79) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return ivas.gov.bisp.enumeration.aS.O.class;
        }
        throw null;
    }

    public Class<ivas.gov.bisp.enumeration.aS.O> c() {
        int i = 2 % 2;
        int i2 = a + 37;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 29;
        int i6 = (i3 ^ 29) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return ivas.gov.bisp.enumeration.aS.O.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Object e(Q q) {
        int i = 2 % 2;
        bhR bhr = new bhR(q, null);
        int i2 = b;
        int i3 = ((i2 ^ 12) + ((i2 & 12) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        return bhr;
    }

    public static class bhR implements ivas.gov.bisp.enumeration.aS.O {
        private static int a = 0;
        private static int b = 1;
        public final o00oO0o<ivas.gov.bisp.enumeration.aS.O> c;
        public final byte[] d = {0};

        public bhR(Q q, bhQ bhq) {
            this.c = q;
        }

        @Override // ivas.gov.bisp.enumeration.aS.O
        public void b(byte[] bArr, byte[] bArr2) throws Exception {
            Q.bgW bgw;
            D d;
            byte[] bArrM;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-100)) | ((~i2) & 99);
            int i4 = (i2 & 99) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0 ? bArr.length <= 5 : bArr.length <= 2) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            int i6 = b;
            int i7 = i6 & 67;
            int i8 = -(-((i6 ^ 67) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            Iterator it = this.c.c(bArrCopyOf).iterator();
            int i11 = a;
            int i12 = i11 ^ 93;
            int i13 = (i11 & 93) << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    int i16 = a;
                    int i17 = i16 & 27;
                    int i18 = -(-((i16 ^ 27) | i17));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    for (Q.bgW bgw2 : this.c.d()) {
                        int i21 = b;
                        int i22 = ((i21 ^ 36) + ((i21 & 36) << 1)) - 1;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        int i24 = a;
                        int i25 = (((i24 ^ 71) | (i24 & 71)) << 1) - (((~i24) & 71) | (i24 & (-72)));
                        b = i25 % 128;
                        try {
                            if (i25 % 2 != 0) {
                                ((ivas.gov.bisp.enumeration.aS.O) bgw2.c).b(bArr, bArr2);
                                return;
                            } else {
                                ((ivas.gov.bisp.enumeration.aS.O) bgw2.c).b(bArr, bArr2);
                                obj.hashCode();
                                throw null;
                            }
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    throw new GeneralSecurityException("invalid MAC");
                }
                int i26 = b;
                int i27 = (((i26 ^ 55) | (i26 & 55)) << 1) - (((~i26) & 55) | (i26 & (-56)));
                a = i27 % 128;
                try {
                    if (i27 % 2 != 0) {
                        bgw = (Q.bgW) it.next();
                        d = bgw.f;
                        int i28 = 17 / 0;
                    } else {
                        bgw = (Q.bgW) it.next();
                        try {
                            d = bgw.f;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (!d.equals(D.g)) {
                        ((ivas.gov.bisp.enumeration.aS.O) bgw.c).b(bArrCopyOfRange, bArr2);
                        int i29 = a;
                        int i30 = i29 & 33;
                        int i31 = (i30 - (~(-(-((i29 ^ 33) | i30))))) - 1;
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        return;
                    }
                    int i33 = b;
                    int i34 = (((i33 ^ 35) | (i33 & 35)) << 1) - (((~i33) & 35) | (i33 & (-36)));
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    ivas.gov.bisp.enumeration.aS.O o2 = (ivas.gov.bisp.enumeration.aS.O) bgw.c;
                    int i36 = b;
                    int i37 = ((i36 ^ 35) | (i36 & 35)) << 1;
                    int i38 = -(((~i36) & 35) | (i36 & (-36)));
                    int i39 = (i37 & i38) + (i38 | i37);
                    int i40 = i39 % 128;
                    a = i40;
                    int i41 = i39 % 2;
                    byte[][] bArr3 = new byte[2][];
                    bArr3[0] = bArr2;
                    int i42 = ((i40 | 93) << 1) - (i40 ^ 93);
                    b = i42 % 128;
                    if (i42 % 2 == 0) {
                        bArr3[1] = this.d;
                        bArrM = r.m(bArr3);
                        int i43 = 56 / 0;
                    } else {
                        bArr3[1] = this.d;
                        bArrM = r.m(bArr3);
                    }
                    int i44 = a + 25;
                    b = i44 % 128;
                    if (i44 % 2 != 0) {
                        o2.b(bArrCopyOfRange, bArrM);
                        return;
                    } else {
                        o2.b(bArrCopyOfRange, bArrM);
                        throw null;
                    }
                } catch (GeneralSecurityException e2) {
                    Logger logger = O.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("tag prefix matches a key, but cannot verify: ");
                    sb.append(e2);
                    logger.info(sb.toString());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
        
            if ((r7 % 2) == 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        
            r2[0] = ((ivas.gov.bisp.enumeration.aS.O) r4).e(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
        
            r9 = ivas.gov.bisp.enumeration.p100w.r.m(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
        
            r2[1] = ((ivas.gov.bisp.enumeration.aS.O) r4).e(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
        
            r2 = ivas.gov.bisp.enumeration.bb.O.bhR.a;
            r3 = (r2 & 55) + (r2 | 55);
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
        
            if ((r3 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        
            r0 = 8 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
        
            r2 = new byte[2][];
            r4 = r8.c.d;
            r5 = ivas.gov.bisp.enumeration.bb.O.bhR.b + 113;
            ivas.gov.bisp.enumeration.bb.O.bhR.a = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        
            if ((r5 % 2) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
        
            r2[0] = r4.c();
            r4 = r8.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
        
            r4 = r4.d.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
        
            r2[0] = r4.c();
            r4 = r8.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
        
            r5 = ivas.gov.bisp.enumeration.bb.O.bhR.a;
            r6 = (((r5 | 42) << 1) - (r5 ^ 42)) - 1;
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r6 % 128;
            r6 = r6 % 2;
            r4 = (ivas.gov.bisp.enumeration.aS.O) r4;
            r5 = r5 + 115;
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r5 % 128;
            r5 = r5 % 2;
            r9 = ivas.gov.bisp.enumeration.p100w.r.m(r9, r8.d);
            r1 = ivas.gov.bisp.enumeration.bb.O.bhR.a;
            r5 = ((r1 | 10) << 1) - (r1 ^ 10);
            r1 = (r5 ^ (-1)) + (r5 << 1);
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
        
            if ((r1 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
        
            r2[1] = r4.e(r9);
            r9 = ivas.gov.bisp.enumeration.p100w.r.m(r2);
            r1 = ivas.gov.bisp.enumeration.bb.O.bhR.a + 25;
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0108, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
        
            r2[1] = r4.e(r9);
            ivas.gov.bisp.enumeration.p100w.r.m(r2);
            r9 = null;
            r9.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        
            if (r8.c.d.f.equals(ivas.gov.bisp.enumeration.aC.D.g) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        
            if (r8.c.d.f.equals(ivas.gov.bisp.enumeration.aC.D.g) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        
            r2 = new byte[2][];
            r4 = r8.c.d;
            r5 = ivas.gov.bisp.enumeration.bb.O.bhR.a;
            r6 = r5 & 111;
            r5 = ((r5 | 111) & (~r6)) + (r6 << 1);
            ivas.gov.bisp.enumeration.bb.O.bhR.b = r5 % 128;
            r5 = r5 % 2;
            r2[0] = r4.c();
            r4 = r8.c.d.c;
            r5 = ivas.gov.bisp.enumeration.bb.O.bhR.b;
            r6 = ((r5 ^ 25) | (r5 & 25)) << 1;
            r5 = -(((~r5) & 25) | (r5 & (-26)));
            r7 = (r6 ^ r5) + ((r5 & r6) << 1);
            ivas.gov.bisp.enumeration.bb.O.bhR.a = r7 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.aS.O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] e(byte[] r9) throws java.security.GeneralSecurityException {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bb.O.bhR.e(byte[]):byte[]");
        }
    }
}
