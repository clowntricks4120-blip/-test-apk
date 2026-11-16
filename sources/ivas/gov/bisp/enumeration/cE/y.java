package ivas.gov.bisp.enumeration.cE;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p069co.c;
import ivas.gov.bisp.enumeration.p077cw.L;
import ivas.gov.bisp.enumeration.p078cx.p;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class y implements PublicKey, Key {
    private static int a = 0;
    private static int b = 1;
    public transient L c;

    public y(c cVar) {
        this.c = (L) p.b(cVar);
    }

    public boolean equals(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = (((i2 ^ 95) | i3) << 1) - ((~i3) & (i2 | 95));
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj == this) {
            int i6 = i5 + 97;
            b = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof y) {
            int i8 = (i2 & (-46)) | ((~i2) & 45);
            int i9 = -(-((i2 & 45) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            y yVar = (y) obj;
            try {
                try {
                    byte[] encoded = this.c.getEncoded();
                    int i12 = b + 83;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    boolean zEquals = Arrays.equals(encoded, yVar.c.getEncoded());
                    int i14 = b;
                    int i15 = (-2) - (((i14 ^ 20) + ((i14 & 20) << 1)) ^ (-1));
                    int i16 = i15 % 128;
                    a = i16;
                    int i17 = i15 % 2;
                    int i18 = i16 & 35;
                    int i19 = (i18 - (~((i16 ^ 35) | i18))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    return zEquals;
                } catch (Exception e) {
                    throw e;
                }
            } catch (IOException unused) {
            }
        }
        int i21 = a;
        int i22 = (i21 & 73) + (i21 | 73);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 29 / 0;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-98)) | ((~i2) & 97);
        int i4 = -(-((i2 & 97) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = (i6 ^ 73) + ((i6 & 73) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a + 7;
        b = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                r.t(this.c).getEncoded();
                throw null;
            }
            byte[] encoded = r.t(this.c).getEncoded();
            int i3 = b + 19;
            a = i3 % 128;
            int i4 = i3 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (((i2 ^ 63) | i3) << 1) - ((~i3) & (i2 | 63));
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 65;
        int i7 = i6 + ((i2 ^ 65) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return "X.509";
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = -(-((i2 ^ 15) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            int iH = j.h(this.c.getEncoded());
            int i7 = a;
            int i8 = ((i7 ^ 77) | (i7 & 77)) << 1;
            int i9 = -(((~i7) & 77) | (i7 & (-78)));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return iH;
        } catch (IOException unused) {
            return -1;
        }
    }
}
