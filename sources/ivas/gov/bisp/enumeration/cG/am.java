package ivas.gov.bisp.enumeration.cG;

import ivas.gov.bisp.enumeration.cX.c;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p078cx.p;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class am implements Key, PublicKey {
    private static int a = 0;
    private static int b = 1;
    public transient c c;

    public am(ivas.gov.bisp.enumeration.p069co.c cVar) {
        this.c = (c) p.b(cVar);
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 39;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if (obj != null) {
            int i5 = i2 + 63;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = obj instanceof am;
                throw null;
            }
            if (obj instanceof am) {
                int i6 = i2 & 41;
                int i7 = (i2 | 41) & (~i6);
                int i8 = i6 << 1;
                int i9 = (i7 & i8) + (i7 | i8);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    this.c.c();
                    obj2.hashCode();
                    throw null;
                }
                byte[] bArrC = this.c.c();
                byte[] bArrC2 = ((am) obj).c.c();
                int i10 = b;
                int i11 = i10 ^ 1;
                int i12 = -(-((i10 & 1) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                boolean zEquals = Arrays.equals(bArrC, bArrC2);
                int i15 = a;
                int i16 = (((i15 | 105) << 1) - (~(-(i15 ^ 105)))) - 1;
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 16 / 0;
                }
                return zEquals;
            }
        }
        int i18 = a;
        int i19 = (((i18 | 40) << 1) - (i18 ^ 40)) - 1;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 67) + (i2 | 67);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 5;
        a = i6 % 128;
        int i7 = i6 % 2;
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 88) + ((i2 & 88) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        try {
            byte[] encoded = r.t(this.c).getEncoded();
            int i6 = a;
            int i7 = ((i6 & 40) + (i6 | 40)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 53) | (i2 & 53)) << 1) - (~(-(((~i2) & 53) | (i2 & (-54)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return "X.509";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 100) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        int iH = j.h(this.c.c());
        int i4 = a + 24;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return iH;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
