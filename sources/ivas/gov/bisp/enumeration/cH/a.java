package ivas.gov.bisp.enumeration.cH;

import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p069co.c;
import ivas.gov.bisp.enumeration.p076cv.z;
import ivas.gov.bisp.enumeration.p080cz.i;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes.dex */
public class a implements PublicKey {
    private static int a = 0;
    private static int b = 1;
    public i c;

    public a(i iVar) {
        this.c = iVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-62)) | ((~i2) & 61)) - (~((i2 & 61) << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return "McEliece";
        }
        int i4 = 77 / 0;
        return "McEliece";
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (i2 | 37) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return "X.509";
        }
        throw null;
    }

    public String toString() {
        StringBuilder sbB;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = i4 + ((i3 ^ 43) | i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            sbB = P.b("McEliecePublicKey:\n", " length of the code         : ");
            i = this.c.b;
            int i6 = 78 / 0;
        } else {
            sbB = P.b("McEliecePublicKey:\n", " length of the code         : ");
            i = this.c.b;
        }
        int i7 = a;
        int i8 = (i7 & 43) + (i7 | 43);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            P.b(j.s(sbB, i, "\n"), " error correction capability: ");
            throw null;
        }
        StringBuilder sbB2 = P.b(j.s(sbB, i, "\n"), " error correction capability: ");
        int i9 = (-2) - ((a + 106) ^ (-1));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = this.c.a;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbB3 = P.b(j.s(sbB2, this.c.a, "\n"), " generator matrix           : ");
        i iVar = this.c;
        int i11 = a;
        int i12 = i11 & 103;
        int i13 = ((i11 | 103) & (~i12)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        sbB3.append(iVar.T);
        String string = sbB3.toString();
        int i15 = a;
        int i16 = i15 & 59;
        int i17 = ((i15 | 59) & (~i16)) + (i16 << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        return string;
    }

    public boolean equals(Object obj) {
        ivas.gov.bisp.enumeration.cK.j jVar;
        ivas.gov.bisp.enumeration.cK.j jVar2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 99;
        int i4 = ((i2 & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        boolean z = false;
        if (obj instanceof a) {
            int i9 = ((i7 ^ 17) | (i7 & 17)) << 1;
            int i10 = -(((~i7) & 17) | (i7 & (-18)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = this.c.b;
                throw null;
            }
            i iVar = this.c;
            int i13 = iVar.b;
            i iVar2 = ((a) obj).c;
            if (i13 == iVar2.b) {
                int i14 = b;
                int i15 = ((((i14 ^ 117) | (i14 & 117)) << 1) - (~(-(((~i14) & 117) | (i14 & (-118)))))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                if (iVar.a == iVar2.a) {
                    int i17 = (-2) - ((a + 82) ^ (-1));
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        jVar = iVar.T;
                        jVar2 = iVar2.T;
                        int i18 = 7 / 0;
                    } else {
                        jVar = iVar.T;
                        jVar2 = iVar2.T;
                    }
                    if (!(!jVar.equals(jVar2))) {
                        int i19 = a + 24;
                        int i20 = (i19 ^ (-1)) + (i19 << 1);
                        b = i20 % 128;
                        if (i20 % 2 != 0) {
                            z = true;
                        }
                    }
                }
            }
        }
        int i21 = b;
        int i22 = i21 & 107;
        int i23 = ((i21 ^ 107) | i22) << 1;
        int i24 = -((i21 | 107) & (~i22));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b + 79;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = this.c.b;
            obj.hashCode();
            throw null;
        }
        i iVar = this.c;
        try {
            c cVar = new c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p076cv.P.c), new z(iVar.b, iVar.a, iVar.T));
            int i4 = a;
            int i5 = ((i4 | 97) << 1) - (i4 ^ 97);
            b = i5 % 128;
            int i6 = i5 % 2;
            byte[] encoded = cVar.getEncoded();
            int i7 = b + 13;
            a = i7 % 128;
            int i8 = i7 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 119) | (i3 & 119)) << 1) - (((~i3) & 119) | (i3 & (-120)));
        b = i4 % 128;
        int i5 = i4 % 2;
        i iVar = this.c;
        int i6 = iVar.b;
        int i7 = iVar.a;
        int i8 = b;
        int i9 = ((i8 | 41) << 1) - (i8 ^ 41);
        a = i9 % 128;
        int i10 = i9 % 2;
        int iHashCode = iVar.T.hashCode();
        int i11 = i7 * 37;
        int i12 = a;
        int i13 = i12 ^ 67;
        int i14 = (i12 & 67) << 1;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = i11 / i6;
            i = iHashCode * ((i16 ^ (-115)) + ((i16 & (-115)) << 1));
        } else {
            int i17 = -(~i6);
            i = (iHashCode - (~(-(~((((i11 & i17) + (i17 | i11)) - 1) * 37))))) - 2;
        }
        int i18 = i12 & 117;
        int i19 = (i12 ^ 117) | i18;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 69 / 0;
        }
        return i;
    }
}
