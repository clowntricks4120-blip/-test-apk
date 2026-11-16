package ivas.gov.bisp.enumeration.cM;

import ivas.gov.bisp.enumeration.cC.R;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p078cx.p;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class r implements PublicKey {
    private static int a = 0;
    private static int b = 1;
    public transient R c;
    public transient C0278x d;

    public r(ivas.gov.bisp.enumeration.p069co.c cVar) {
        R r = (R) p.b(cVar);
        this.c = r;
        this.d = ivas.gov.bisp.enumeration.p100w.r.M(r.F());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (obj == this) {
            int i6 = ((i4 ^ 45) | (i4 & 45)) << 1;
            int i7 = -((i4 & (-46)) | ((~i4) & 45));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i4 ^ 51) + ((i4 & 51) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        boolean z = false;
        Object obj2 = null;
        if (obj instanceof r) {
            int i12 = i2 & 27;
            int i13 = (i2 ^ 27) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            r rVar = (r) obj;
            try {
                if (i14 % 2 == 0) {
                    try {
                        this.d.k(rVar.d);
                        throw null;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (this.d.k(rVar.d)) {
                    byte[] encoded = this.c.getEncoded();
                    R r = rVar.c;
                    int i15 = b;
                    int i16 = ((i15 | 5) << 1) - (((~i15) & 5) | (i15 & (-6)));
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    if (Arrays.equals(encoded, r.getEncoded())) {
                        z = true;
                    } else {
                        int i18 = a;
                        int i19 = i18 & 55;
                        int i20 = -(-((i18 ^ 55) | i19));
                        int i21 = (i19 & i20) + (i20 | i19);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                    }
                } else {
                    int i110 = a;
                    int i111 = i110 & 55;
                    int i23 = -(-((i110 ^ 55) | i111));
                    int i24 = (i111 & i23) + (i23 | i111);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
                int i26 = a;
                int i27 = ((i26 | 121) << 1) - (i26 ^ 121);
                b = i27 % 128;
                int i28 = i27 % 2;
                return z;
            } catch (IOException unused) {
            }
        }
        int i29 = b;
        int i30 = i29 & 121;
        int i31 = -(-((i29 ^ 121) | i30));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        a = i32 % 128;
        if (i32 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 99) + (i2 | 99);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 ^ 23;
        int i6 = ((i4 & 23) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return "XMSS";
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] encoded = ivas.gov.bisp.enumeration.p100w.r.t(this.c).getEncoded();
            int i4 = b;
            int i5 = i4 & 113;
            int i6 = (i4 | 113) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a + 3;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 13;
        int i6 = ((i3 ^ 13) | i5) << 1;
        int i7 = -((i3 | 13) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 40 / 0;
        }
        return "X.509";
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 45) + (i2 | 45);
        a = i3 % 128;
        int i4 = i3 % 2;
        try {
            int iHashCode = this.d.hashCode();
            R r = this.c;
            int i5 = a + 81;
            b = i5 % 128;
            int i6 = i5 % 2;
            int iH = ivas.gov.bisp.enumeration.p064cj.j.h(r.getEncoded()) * 37;
            int i7 = b;
            int i8 = i7 & 81;
            int i9 = -(-((i7 ^ 81) | i8));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = -(~iHashCode);
            int i13 = (((iH | i12) << 1) - (i12 ^ iH)) - 1;
            int i14 = (((i7 | 15) << 1) - (~(-((i7 & (-16)) | ((~i7) & 15))))) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 50 / 0;
            }
            return i13;
        } catch (IOException unused) {
            return this.d.hashCode();
        }
    }
}
