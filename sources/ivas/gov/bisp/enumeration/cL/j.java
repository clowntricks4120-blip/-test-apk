package ivas.gov.bisp.enumeration.cL;

import ivas.gov.bisp.enumeration.cA.l;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p078cx.i;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements PrivateKey, Key {
    private static int a = 0;
    private static int b = 1;
    public transient C0278x c;
    public transient l d;
    public transient L e;

    public j(ivas.gov.bisp.enumeration.p067cm.c cVar) {
        this.e = cVar.g;
        this.c = ivas.gov.bisp.enumeration.p076cv.l.h(cVar.d.d).d.c;
        this.d = (l) i.b(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    public boolean equals(Object obj) {
        j jVar;
        C0278x c0278x;
        C0278x c0278x2;
        byte[] bArrC;
        byte[] bArrC2;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        boolean z = true;
        int i4 = ((i3 ^ 50) + ((i3 & 50) << 1)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0 ? obj == this : obj == this) {
            int i5 = ((i3 | 52) << 1) - (i3 ^ 52);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof j)) {
            int i8 = ((i3 | 63) << 1) - (i3 ^ 63);
            b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i3 ^ 77;
        int i11 = ((i3 & 77) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            jVar = (j) obj;
            c0278x = this.c;
            c0278x2 = jVar.c;
            int i14 = 4 / 0;
        } else {
            jVar = (j) obj;
            c0278x = this.c;
            c0278x2 = jVar.c;
        }
        int i15 = i3 + 15;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            if (c0278x.k(c0278x2)) {
                bArrC = this.d.c();
                bArrC2 = jVar.d.c();
                i = b + 93;
                a = i % 128;
                if (i % 2 == 0) {
                    Arrays.equals(bArrC, bArrC2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!Arrays.equals(bArrC, bArrC2)) {
                }
            }
            int i16 = a;
            int i17 = i16 & 19;
            int i18 = i17 + ((i16 ^ 19) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }
        boolean zK = c0278x.k(c0278x2);
        int i20 = 63 / 0;
        if (!(!zK)) {
            bArrC = this.d.c();
            bArrC2 = jVar.d.c();
            i = b + 93;
            a = i % 128;
            if (i % 2 == 0) {
                Arrays.equals(bArrC, bArrC2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (!Arrays.equals(bArrC, bArrC2)) {
            }
        }
        int i110 = a;
        int i111 = i110 & 19;
        int i112 = i111 + ((i110 ^ 19) | i111);
        b = i112 % 128;
        int i113 = i112 % 2;
        return z;
        int i21 = a + 35;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 2 % 5;
        }
        z = false;
        int i114 = a;
        int i115 = i114 & 19;
        int i116 = i115 + ((i114 ^ 19) | i115);
        b = i116 % 128;
        int i117 = i116 % 2;
        return z;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 49;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 19;
        int i6 = ((i2 ^ 19) | i5) << 1;
        int i7 = -((i2 | 19) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return "SPHINCS-256";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 13;
        int i4 = (i3 << 1) - ((~(i2 & 13)) & i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return "PKCS#8";
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.c.hashCode();
        byte[] bArrC = this.d.c();
        int i5 = a + 107;
        b = i5 % 128;
        int i6 = i5 % 2;
        int iH = ivas.gov.bisp.enumeration.p064cj.j.h(bArrC) * 37;
        int i7 = (((~iHashCode) & iH) | ((~iH) & iHashCode)) + ((iHashCode & iH) << 1);
        int i8 = b;
        int i9 = i8 & 83;
        int i10 = (i8 | 83) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return i7;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] encoded;
        ivas.gov.bisp.enumeration.p067cm.c cVarX;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 92) + (i2 | 92)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            if (this.d.F() != null) {
                int i5 = a;
                int i6 = i5 & 25;
                int i7 = (((i5 | 25) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    r.x(this.d, this.e);
                    throw null;
                }
                cVarX = r.x(this.d, this.e);
                int i8 = b;
                int i9 = i8 & 29;
                int i10 = (((i8 | 29) & (~i9)) - (~(i9 << 1))) - 1;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 5;
                }
            } else {
                ivas.gov.bisp.enumeration.p067cm.c cVar = new ivas.gov.bisp.enumeration.p067cm.c(new ivas.gov.bisp.enumeration.p069co.j(P.e, new ivas.gov.bisp.enumeration.p076cv.l(new ivas.gov.bisp.enumeration.p069co.j(this.c))), new B(this.d.c()), this.e, null);
                int i12 = b;
                int i13 = i12 & 125;
                int i14 = i13 + ((i12 ^ 125) | i13);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                cVarX = cVar;
            }
            encoded = cVarX.getEncoded();
            int i15 = a;
            int i16 = (i15 & 69) + (i15 | 69);
            b = i16 % 128;
            int i17 = i16 % 2;
        } catch (IOException unused) {
            encoded = null;
        }
        int i18 = b;
        int i19 = ((((i18 ^ 5) | (i18 & 5)) << 1) - (~(-((5 & (~i18)) | (i18 & (-6)))))) - 1;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            return encoded;
        }
        obj.hashCode();
        throw null;
    }
}
