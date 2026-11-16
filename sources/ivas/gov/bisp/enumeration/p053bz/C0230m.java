package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.o000OoO.o000oOoO;
import ivas.gov.bisp.enumeration.p030bc.A;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230m implements A {
    private static int a = 1;
    private static int b;
    public final ThreadLocal<Mac> c;
    public final String d;
    public final Key e;
    public final int f;

    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    public C0230m(String str, Key key) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        btP btp = new btP();
        this.c = btp;
        this.d = str;
        this.e = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1823053428:
                if (!str.equals("HMACSHA1")) {
                    b2 = -1;
                } else {
                    int i = a;
                    int i2 = ((i | 83) << 1) - (i ^ 83);
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = (-2) - ((i + 42) ^ (-1));
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                }
                break;
            case 392315118:
                if (!str.equals("HMACSHA256")) {
                    b2 = -1;
                } else {
                    int i7 = a;
                    int i8 = (i7 & 9) + (i7 | 9);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        b2 = 1;
                    }
                    int i9 = 2 % 2;
                }
                break;
            case 392316170:
                if (!str.equals("HMACSHA384")) {
                    b2 = -1;
                } else {
                    int i10 = b;
                    int i11 = ((i10 | 84) << 1) - (i10 ^ 84);
                    int i12 = (i11 ^ (-1)) + (i11 << 1);
                    a = i12 % 128;
                    b2 = i12 % 2 == 0 ? (byte) 5 : (byte) 2;
                    int i13 = 2 % 2;
                }
                break;
            case 392317873:
                if (!str.equals("HMACSHA512")) {
                    b2 = -1;
                } else {
                    int i14 = a;
                    int i15 = (i14 & (-112)) | ((~i14) & 111);
                    int i16 = (i14 & 111) << 1;
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    int i18 = i17 % 128;
                    b = i18;
                    int i19 = i17 % 2;
                    int i20 = i18 & 71;
                    int i21 = (i20 - (~(-(-((i18 ^ 71) | i20))))) - 1;
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 2 % 2;
                    }
                    b2 = 3;
                }
                break;
            default:
                int i23 = b + 90;
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 2 % 2;
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                this.f = 32;
                int i27 = b;
                int i28 = (((i27 & (-40)) | ((~i27) & 39)) - (~(-(-((i27 & 39) << 1))))) - 1;
                a = i28 % 128;
                if (i28 % 2 != 0) {
                }
            } else if (b2 == 2) {
                this.f = 48;
                int i29 = a;
                int i30 = i29 & 63;
                int i31 = i30 + ((i29 ^ 63) | i30);
                b = i31 % 128;
                int i32 = i31 % 2;
            } else {
                if (b2 != 3) {
                    throw new NoSuchAlgorithmException(j.r("unknown Hmac algorithm: ", str));
                }
                this.f = 64;
                int i33 = a;
                int i34 = (-2) - (((i33 & 112) + (i33 | 112)) ^ (-1));
                b = i34 % 128;
                int i35 = i34 % 2;
            }
            int i36 = 2 % 2;
        } else {
            this.f = 20;
            int i37 = a + 55;
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 2 % 2;
        }
        btp.get();
        int i40 = a;
        int i41 = (i40 | 85) << 1;
        int i42 = -(((~i40) & 85) | (i40 & (-86)));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        b = i43 % 128;
        int i44 = i43 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p030bc.A
    public final byte[] b(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 33;
        int i5 = i4 + ((i3 ^ 33) | i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i > this.f) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        int i6 = i3 & 113;
        int i7 = (i6 - (~((i3 ^ 113) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            this.c.get().update(bArr);
            obj.hashCode();
            throw null;
        }
        this.c.get().update(bArr);
        int i8 = a + 57;
        b = i8 % 128;
        int i9 = i8 % 2;
        byte[] bArrDoFinal = this.c.get().doFinal();
        int i10 = a;
        int i11 = (((i10 ^ 39) | (i10 & 39)) << 1) - (((~i10) & 39) | (i10 & (-40)));
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return Arrays.copyOf(bArrDoFinal, i);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, i);
        int i12 = 68 / 0;
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.m$btP */
    public class btP extends ThreadLocal<Mac> {
        private static int a = 1;
        private static int b;

        public btP() {
        }

        @Override // java.lang.ThreadLocal
        public Mac initialValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 63;
            int i4 = -(-((i2 ^ 63) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    o000oOoO<x.btV, Mac> o000oooo = J.e;
                    String str = C0230m.this.d;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                o000oOoO<x.btV, Mac> o000oooo2 = J.e;
                String str2 = C0230m.this.d;
                int i6 = a;
                int i7 = (((i6 | 76) << 1) - (i6 ^ 76)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                Mac mac = (Mac) o000oooo2.c(str2);
                C0230m c0230m = C0230m.this;
                int i9 = a;
                int i10 = i9 & 51;
                int i11 = (i9 ^ 51) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                mac.init(c0230m.e);
                int i14 = a;
                int i15 = ((i14 & 39) - (~(i14 | 39))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                return mac;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
