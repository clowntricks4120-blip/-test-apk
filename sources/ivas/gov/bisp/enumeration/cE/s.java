package ivas.gov.bisp.enumeration.cE;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p077cw.L;
import ivas.gov.bisp.enumeration.p078cx.i;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class s implements PrivateKey, Key {
    private static int a = 0;
    private static int b = 1;
    public transient L c;
    public transient ivas.gov.bisp.enumeration.p063ci.L d;

    public s(c cVar) {
        this.d = cVar.g;
        this.c = (L) i.b(cVar);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 50) + ((i2 & 50) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = (i4 & 84) + (i4 | 84);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 75;
        int i4 = (i2 & 75) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        try {
            byte[] encoded = r.x(this.c, this.d).getEncoded();
            int i7 = b;
            int i8 = i7 & 39;
            int i9 = (i8 - (~(-(-((i7 ^ 39) | i8))))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return encoded;
            }
            obj.hashCode();
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 121) + (i2 | 121);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = (i4 ^ 117) + ((i4 & 117) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return "PKCS#8";
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        try {
            int iH = j.h(this.c.getEncoded());
            int i4 = b;
            int i5 = ((i4 | 97) << 1) - (i4 ^ 97);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return iH;
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = ((i2 ^ 57) | i3) << 1;
        int i5 = -((~i3) & (i2 | 57));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (obj == this) {
            int i9 = ((i2 | 13) << 1) - (i2 ^ 13);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = ((i10 | 2) << 1) - (i10 ^ 2);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 64 / 0;
            }
            return true;
        }
        if (!(obj instanceof s)) {
            int i15 = ((i2 & 83) - (~(i2 | 83))) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 59 / 0;
            }
            return false;
        }
        int i17 = (i7 & (-70)) | ((~i7) & 69);
        int i18 = (i7 & 69) << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        b = i19 % 128;
        try {
            if (i19 % 2 == 0) {
                try {
                    this.c.getEncoded();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            s sVar = (s) obj;
            byte[] encoded = this.c.getEncoded();
            int i20 = a;
            int i21 = (i20 & 47) + (i20 | 47);
            b = i21 % 128;
            int i22 = i21 % 2;
            boolean zEquals = Arrays.equals(encoded, sVar.c.getEncoded());
            int i23 = b + 85;
            int i24 = i23 % 128;
            a = i24;
            int i25 = i23 % 2;
            int i26 = (-2) - ((i24 + 6) ^ (-1));
            b = i26 % 128;
            int i27 = i26 % 2;
            return zEquals;
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }
}
