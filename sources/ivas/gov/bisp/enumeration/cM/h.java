package ivas.gov.bisp.enumeration.cM;

import ivas.gov.bisp.enumeration.cC.L;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p076cv.a;
import ivas.gov.bisp.enumeration.p078cx.i;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h implements PrivateKey {
    private static int a = 1;
    private static int b;
    public transient L c;
    public transient C0278x d;
    public transient ivas.gov.bisp.enumeration.p063ci.L e;

    public h(ivas.gov.bisp.enumeration.p067cm.c cVar) {
        this.e = cVar.g;
        this.d = a.h(cVar.d.d).e.c;
        this.c = (L) i.b(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    public boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 13;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        boolean z = false;
        if (obj == this) {
            int i7 = i3 + 3;
            b = i7 % 128;
            boolean z2 = i7 % 2 == 0;
            int i8 = ((i3 ^ 8) + ((i3 & 8) << 1)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 89 / 0;
            }
            return z2;
        }
        if (!(obj instanceof h)) {
            int i10 = i5 ^ 33;
            int i11 = (i5 & 33) << 1;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        int i14 = i3 + 123;
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        h hVar = (h) obj;
        C0278x c0278x = this.d;
        C0278x c0278x2 = hVar.d;
        int i17 = i15 ^ 81;
        int i18 = ((i15 & 81) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i18 | i19);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            if (c0278x.k(c0278x2)) {
                i = a + 29;
                b = i % 128;
                if (i % 2 == 0) {
                    this.c.c();
                    L l = hVar.c;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!Arrays.equals(this.c.c(), hVar.c.c())) {
                    z = true;
                }
            }
            int i21 = b;
            int i22 = ((i21 & (-98)) | ((~i21) & 97)) + ((i21 & 97) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            return z;
        }
        int i24 = 58 / 0;
        if (c0278x.k(c0278x2)) {
            i = a + 29;
            b = i % 128;
            if (i % 2 == 0) {
                this.c.c();
                L l2 = hVar.c;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (!Arrays.equals(this.c.c(), hVar.c.c())) {
                z = true;
            }
        }
        int i25 = b;
        int i26 = ((i25 & (-98)) | ((~i25) & 97)) + ((i25 & 97) << 1);
        a = i26 % 128;
        int i27 = i26 % 2;
        return z;
        int i28 = (-2) - ((a + 124) ^ (-1));
        b = i28 % 128;
        int i29 = i28 % 2;
        int i210 = b;
        int i211 = ((i210 & (-98)) | ((~i210) & 97)) + ((i210 & 97) << 1);
        a = i211 % 128;
        int i212 = i211 % 2;
        return z;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = -(-((i2 ^ 119) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            int i7 = 49 / 0;
        }
        int i8 = i6 & 49;
        int i9 = ((i6 ^ 49) | i8) << 1;
        int i10 = -((i6 | 49) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return "XMSS";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = (((i2 & 103) | i3) << 1) - i3;
        b = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                ivas.gov.bisp.enumeration.p100w.r.x(this.c, this.e).getEncoded();
                throw null;
            }
            byte[] encoded = ivas.gov.bisp.enumeration.p100w.r.x(this.c, this.e).getEncoded();
            int i5 = a;
            int i6 = (i5 & (-74)) | ((~i5) & 73);
            int i7 = (i5 & 73) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-22)) | ((~i2) & 21)) - (~((i2 & 21) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 ^ 121;
        int i6 = ((i2 & 121) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return "PKCS#8";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        L l;
        int i = 2 % 2;
        int i2 = a + 31;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.d.hashCode();
            l = this.c;
            int i3 = 4 / 0;
        } else {
            iHashCode = this.d.hashCode();
            l = this.c;
        }
        int iH = ivas.gov.bisp.enumeration.p064cj.j.h(l.c()) * 37;
        int i4 = -(~(-(-iHashCode)));
        int i5 = (iH & i4) + (i4 | iH);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        int i7 = a;
        int i8 = ((i7 & 2) + (i7 | 2)) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
