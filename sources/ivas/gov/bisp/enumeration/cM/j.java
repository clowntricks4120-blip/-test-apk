package ivas.gov.bisp.enumeration.cM;

import ivas.gov.bisp.enumeration.cC.N;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p076cv.o;
import ivas.gov.bisp.enumeration.p078cx.i;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements PrivateKey {
    private static int a = 1;
    private static int b;
    public transient C0278x c;
    public transient N d;
    public transient L e;

    public j(ivas.gov.bisp.enumeration.p067cm.c cVar) {
        this.e = cVar.g;
        this.c = o.h(cVar.d.d).f.c;
        this.d = (N) i.b(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    public boolean equals(Object obj) {
        boolean z;
        j jVar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 117;
        int i5 = i4 + ((i3 ^ 117) | i4);
        int i6 = i5 % 128;
        b = i6;
        boolean z2 = false;
        if (i5 % 2 != 0) {
            if (obj != this) {
                z = false;
                if (obj instanceof j) {
                    int i7 = i6 ^ 101;
                    int i8 = -(-((i6 & 101) << 1));
                    int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                int i11 = i3 & 113;
                int i12 = -(-((i3 ^ 113) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                jVar = (j) obj;
                if (!this.c.k(jVar.c)) {
                    int i15 = a;
                    int i16 = i15 & 81;
                    int i17 = (i15 ^ 81) | i16;
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    int i20 = b;
                    i = (-2) - ((((i20 | 22) << 1) - (i20 ^ 22)) ^ (-1));
                    a = i % 128;
                    if (i % 2 != 0) {
                        this.d.c();
                        jVar.d.c();
                        throw null;
                    }
                    if (Arrays.equals(this.d.c(), jVar.d.c())) {
                        z2 = z;
                    } else {
                        int i110 = a;
                        int i111 = i110 & 81;
                        int i112 = (i110 ^ 81) | i111;
                        int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                        b = i113 % 128;
                        int i114 = i113 % 2;
                    }
                }
                int i21 = a;
                int i22 = ((i21 & 80) + (i21 | 80)) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
                return z2;
            }
            int i24 = i3 & 51;
            int i25 = (((i3 | 51) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            return true;
        }
        if (obj != this) {
            z = true;
            if (obj instanceof j) {
                int i27 = i6 ^ 101;
                int i28 = -(-((i6 & 101) << 1));
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                a = i29 % 128;
                int i115 = i29 % 2;
                return false;
            }
            int i116 = i3 & 113;
            int i117 = -(-((i3 ^ 113) | i116));
            int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
            b = i118 % 128;
            int i119 = i118 % 2;
            jVar = (j) obj;
            if (!this.c.k(jVar.c)) {
                int i1110 = a;
                int i1111 = i1110 & 81;
                int i1112 = (i1110 ^ 81) | i1111;
                int i1113 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                b = i1113 % 128;
                int i1114 = i1113 % 2;
            } else {
                int i210 = b;
                i = (-2) - ((((i210 | 22) << 1) - (i210 ^ 22)) ^ (-1));
                a = i % 128;
                if (i % 2 != 0) {
                    this.d.c();
                    jVar.d.c();
                    throw null;
                }
                if (Arrays.equals(this.d.c(), jVar.d.c())) {
                    int i1115 = a;
                    int i1116 = i1115 & 81;
                    int i1117 = (i1115 ^ 81) | i1116;
                    int i1118 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                    b = i1118 % 128;
                    int i1119 = i1118 % 2;
                } else {
                    z2 = z;
                }
            }
            int i211 = a;
            int i212 = ((i211 & 80) + (i211 | 80)) - 1;
            b = i212 % 128;
            int i213 = i212 % 2;
            return z2;
        }
        int i214 = i3 & 51;
        int i215 = (((i3 | 51) & (~i214)) - (~(-(-(i214 << 1))))) - 1;
        b = i215 % 128;
        int i216 = i215 % 2;
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (((i2 ^ 103) | i3) << 1) - ((~i3) & (i2 | 103));
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 ^ 19;
        int i7 = -(-((i2 & 19) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] encoded;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 35) - (~(-(-((i2 & 35) << 1))))) - 1;
        a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                encoded = ivas.gov.bisp.enumeration.p100w.r.x(this.d, this.e).getEncoded();
                int i4 = 89 / 0;
            } else {
                encoded = ivas.gov.bisp.enumeration.p100w.r.x(this.d, this.e).getEncoded();
            }
            int i5 = b;
            int i6 = i5 ^ 23;
            int i7 = ((i5 & 23) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 65;
        b = i7 % 128;
        int i8 = i7 % 2;
        return "PKCS#8";
    }

    public int hashCode() {
        N n;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 67;
        int i4 = ((i2 & 67) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iHashCode = this.c.hashCode();
        if (i7 == 0) {
            n = this.d;
            int i8 = 45 / 0;
        } else {
            n = this.d;
        }
        int i9 = b;
        int i10 = (((i9 | 106) << 1) - (i9 ^ 106)) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int iH = ivas.gov.bisp.enumeration.p064cj.j.h(n.c()) * 37;
        int i12 = -(-iHashCode);
        int i13 = iH ^ i12;
        int i14 = ((i12 & iH) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        int i17 = b + 34;
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return i16;
    }
}
