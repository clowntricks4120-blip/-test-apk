package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aS.Q;
import ivas.gov.bisp.enumeration.o0000o0o.o00oO0o;
import ivas.gov.bisp.enumeration.o0000o0o.o0ooOOo;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class r implements o0ooOOo<ivas.gov.bisp.enumeration.aS.z, ivas.gov.bisp.enumeration.aS.z> {
    private static int a = 1;
    private static int b;
    public static final Logger c = Logger.getLogger(r.class.getName());

    static {
        int i = b;
        int i2 = i & 35;
        int i3 = ((i ^ 35) | i2) << 1;
        int i4 = -((i | 35) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public Class<ivas.gov.bisp.enumeration.aS.z> b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return ivas.gov.bisp.enumeration.aS.z.class;
        }
        int i4 = 91 / 0;
        return ivas.gov.bisp.enumeration.aS.z.class;
    }

    public Class<ivas.gov.bisp.enumeration.aS.z> c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 56) + (i2 | 56)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return ivas.gov.bisp.enumeration.aS.z.class;
        }
        int i4 = 33 / 0;
        return ivas.gov.bisp.enumeration.aS.z.class;
    }

    public Object e(Q q) {
        int i = 2 % 2;
        bgi bgiVar = new bgi(q, null);
        int i2 = a;
        int i3 = ((i2 & (-84)) | ((~i2) & 83)) + ((i2 & 83) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
        }
        return bgiVar;
    }

    public static class bgi implements ivas.gov.bisp.enumeration.aS.z {
        private static int a = 1;
        private static int b;
        public final o00oO0o<ivas.gov.bisp.enumeration.aS.z> c;

        public bgi(Q q, bgg bggVar) {
            this.c = q;
        }

        @Override // ivas.gov.bisp.enumeration.aS.z
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 35;
            int i4 = (((i2 ^ 35) | i3) << 1) - ((i2 | 35) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            byte[][] bArr3 = new byte[2][];
            o00oO0o.OooO0O0<P> oooO0O0 = this.c.d;
            int i6 = a;
            int i7 = i6 ^ 61;
            int i8 = (i6 & 61) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            bArr3[0] = oooO0O0.c();
            o00oO0o.OooO0O0<P> oooO0O1 = this.c.d;
            int i11 = b + 39;
            a = i11 % 128;
            int i12 = i11 % 2;
            ivas.gov.bisp.enumeration.aS.z zVar = (ivas.gov.bisp.enumeration.aS.z) oooO0O1.c;
            int i13 = (-2) - ((b + 22) ^ (-1));
            a = i13 % 128;
            if (i13 % 2 != 0) {
                bArr3[1] = zVar.b(bArr, bArr2);
                return ivas.gov.bisp.enumeration.p100w.r.m(bArr3);
            }
            bArr3[1] = zVar.b(bArr, bArr2);
            ivas.gov.bisp.enumeration.p100w.r.m(bArr3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aS.z
        public byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((((i2 | 8) << 1) - (i2 ^ 8)) ^ (-1));
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            if (bArr.length > 5) {
                int i6 = i4 & 109;
                int i7 = -(-((i4 ^ 109) | i6));
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                int i10 = b;
                int i11 = (-2) - (((i10 & 70) + (i10 | 70)) ^ (-1));
                a = i11 % 128;
                int i12 = i11 % 2;
                Iterator it = this.c.c(bArrCopyOfRange).iterator();
                int i13 = b;
                int i14 = i13 & 77;
                int i15 = ((i13 ^ 77) | i14) << 1;
                int i16 = -((i13 | 77) & (~i14));
                int i17 = (i15 & i16) + (i16 | i15);
                int i18 = i17 % 128;
                a = i18;
                int i19 = i17 % 2;
                int i20 = i18 ^ 67;
                int i21 = ((i18 & 67) | i20) << 1;
                int i22 = -i20;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                b = i23 % 128;
                int i24 = i23 % 2;
                while (!(!it.hasNext())) {
                    int i25 = b;
                    int i26 = i25 & 95;
                    int i27 = i26 + ((i25 ^ 95) | i26);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    try {
                        P p = ((Q.bgW) it.next()).c;
                        int i29 = a;
                        int i30 = i29 & 45;
                        int i31 = -(-((i29 ^ 45) | i30));
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        byte[] bArrE = ((ivas.gov.bisp.enumeration.aS.z) p).e(bArrCopyOfRange2, bArr2);
                        int i34 = b;
                        int i35 = i34 & 119;
                        int i36 = i35 + ((i34 ^ 119) | i35);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        int i38 = i34 & 75;
                        int i39 = -(-((i34 ^ 75) | i38));
                        int i40 = (i38 & i39) + (i39 | i38);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        return bArrE;
                    } catch (GeneralSecurityException e) {
                        Logger logger = r.c;
                        StringBuilder sbW = j.w("ciphertext prefix matches a key, but cannot decrypt: ");
                        sbW.append(e.toString());
                        logger.info(sbW.toString());
                    }
                }
            }
            int i42 = a;
            int i43 = (i42 & 51) + (i42 | 51);
            b = i43 % 128;
            int i44 = i43 % 2;
            for (Q.bgW bgw : this.c.d()) {
                int i45 = b;
                int i46 = i45 & 57;
                int i47 = (i45 | 57) & (~i46);
                int i48 = i46 << 1;
                int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                a = i49 % 128;
                int i50 = i49 % 2;
                int i51 = b;
                int i52 = i51 & 43;
                int i53 = (i52 - (~(-(-((i51 ^ 43) | i52))))) - 1;
                a = i53 % 128;
                Object obj = null;
                try {
                    if (i53 % 2 == 0) {
                        ((ivas.gov.bisp.enumeration.aS.z) bgw.c).e(bArr, bArr2);
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArrE2 = ((ivas.gov.bisp.enumeration.aS.z) bgw.c).e(bArr, bArr2);
                    int i54 = a;
                    int i55 = ((i54 & 25) - (~(-(-(i54 | 25))))) - 1;
                    b = i55 % 128;
                    if (i55 % 2 == 0) {
                        return bArrE2;
                    }
                    throw null;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }
}
