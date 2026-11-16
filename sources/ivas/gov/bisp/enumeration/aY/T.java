package ivas.gov.bisp.enumeration.aY;

import ivas.gov.bisp.enumeration.aS.InterfaceC0081t;
import ivas.gov.bisp.enumeration.o0000o0o.o00oO0o;
import ivas.gov.bisp.enumeration.o0000o0o.o0ooOOo;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class T implements o0ooOOo<InterfaceC0081t, InterfaceC0081t> {
    private static int a = 0;
    private static int b = 1;
    public static final Logger c = Logger.getLogger(T.class.getName());

    static {
        int i = a;
        int i2 = i & 109;
        int i3 = i2 + ((i ^ 109) | i2);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public Class<InterfaceC0081t> b() {
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 5;
        int i6 = ((i3 ^ 5) | i5) << 1;
        int i7 = -((i3 | 5) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 37 / 0;
        }
        return InterfaceC0081t.class;
    }

    public Class<InterfaceC0081t> c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = (~i3) & (i2 | 45);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 & 69;
        int i9 = -(-((i2 ^ 69) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return InterfaceC0081t.class;
    }

    public Object e(ivas.gov.bisp.enumeration.aS.Q q) {
        int i = 2 % 2;
        bhw bhwVar = new bhw(q);
        int i2 = b;
        int i3 = (i2 & (-94)) | ((~i2) & 93);
        int i4 = (i2 & 93) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return bhwVar;
    }

    public static class bhw implements InterfaceC0081t {
        private static int a = 0;
        private static int b = 1;
        public o00oO0o<InterfaceC0081t> c;

        public bhw(o00oO0o<InterfaceC0081t> o00oo0o) {
            this.c = o00oo0o;
        }

        @Override // ivas.gov.bisp.enumeration.aS.InterfaceC0081t
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 44) ^ (-1));
            b = i2 % 128;
            byte[][] bArr3 = i2 % 2 == 0 ? new byte[5][] : new byte[2][];
            bArr3[0] = this.c.d.c();
            int i3 = b;
            int i4 = ((i3 ^ 15) | (i3 & 15)) << 1;
            int i5 = -(((~i3) & 15) | (i3 & (-16)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            InterfaceC0081t interfaceC0081t = (InterfaceC0081t) this.c.d.c;
            int i8 = b;
            int i9 = i8 & 111;
            int i10 = ((i8 | 111) & (~i9)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            byte[] bArrB = interfaceC0081t.b(bArr, bArr2);
            int i12 = a + 77;
            b = i12 % 128;
            int i13 = i12 % 2;
            bArr3[1] = bArrB;
            byte[] bArrM = r.m(bArr3);
            int i14 = b;
            int i15 = (i14 ^ 19) + ((i14 & 19) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 36 / 0;
            }
            return bArrM;
        }

        @Override // ivas.gov.bisp.enumeration.aS.InterfaceC0081t
        public byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            InterfaceC0081t interfaceC0081t;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 85;
            int i4 = (i3 - (~(-(-((i2 ^ 85) | i3))))) - 1;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (bArr.length > 5) {
                int i7 = i5 & 15;
                int i8 = (i5 | 15) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                byte[] bArrCopyOfRange = i10 % 2 == 0 ? Arrays.copyOfRange(bArr, 1, 2) : Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                int i11 = a;
                int i12 = i11 & 3;
                int i13 = (((i11 | 3) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    this.c.c(bArrCopyOfRange).iterator();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i14 = b;
                int i15 = i14 & 9;
                int i16 = i15 + ((i14 ^ 9) | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                for (ivas.gov.bisp.enumeration.aS.Q.bgW bgw : this.c.c(bArrCopyOfRange)) {
                    int i18 = b;
                    int i19 = ((i18 ^ 50) + ((i18 & 50) << 1)) - 1;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = b;
                    int i22 = ((i21 ^ 41) | (i21 & 41)) << 1;
                    int i23 = -(((~i21) & 41) | (i21 & (-42)));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    try {
                        if (i24 % 2 != 0) {
                            interfaceC0081t = (InterfaceC0081t) bgw.c;
                            int i25 = 77 / 0;
                        } else {
                            interfaceC0081t = (InterfaceC0081t) bgw.c;
                        }
                        byte[] bArrE = interfaceC0081t.e(bArrCopyOfRange2, bArr2);
                        int i26 = b;
                        int i27 = ((i26 | 5) << 1) - (i26 ^ 5);
                        a = i27 % 128;
                        if (i27 % 2 != 0) {
                            int i28 = 96 / 0;
                        }
                        return bArrE;
                    } catch (GeneralSecurityException e) {
                        Logger logger = T.c;
                        StringBuilder sbW = j.w("ciphertext prefix matches a key, but cannot decrypt: ");
                        sbW.append(e.toString());
                        logger.info(sbW.toString());
                    }
                }
            }
            Iterator it = this.c.d().iterator();
            int i29 = a;
            int i30 = i29 & 75;
            int i31 = i30 + ((i29 ^ 75) | i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            while (it.hasNext()) {
                int i33 = a;
                int i34 = ((i33 ^ 35) | (i33 & 35)) << 1;
                int i35 = -(((~i33) & 35) | (i33 & (-36)));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                int i37 = i36 % 2;
                try {
                    P p = ((ivas.gov.bisp.enumeration.aS.Q.bgW) it.next()).c;
                    int i38 = a;
                    int i39 = (i38 & (-76)) | ((~i38) & 75);
                    int i40 = (i38 & 75) << 1;
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    byte[] bArrE2 = ((InterfaceC0081t) p).e(bArr, bArr2);
                    int i43 = a;
                    int i44 = i43 & 3;
                    int i45 = (i44 - (~(-(-((i43 ^ 3) | i44))))) - 1;
                    b = i45 % 128;
                    if (i45 % 2 == 0) {
                        int i46 = 77 / 0;
                    }
                    return bArrE2;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }
}
