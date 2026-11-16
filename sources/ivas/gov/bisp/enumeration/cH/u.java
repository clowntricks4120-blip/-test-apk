package ivas.gov.bisp.enumeration.cH;

import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p069co.c;
import ivas.gov.bisp.enumeration.p076cv.i;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p101x.r;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes.dex */
public class u implements r, PublicKey {
    private static int a = 1;
    private static int b;
    public ivas.gov.bisp.enumeration.p080cz.r c;

    public u(ivas.gov.bisp.enumeration.p080cz.r rVar) {
        this.c = rVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = (((i2 ^ 7) | i3) << 1) - ((i2 | 7) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = i5 & 13;
        int i7 = (i5 ^ 13) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 49 / 0;
        }
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 95) | (i2 & 95)) << 1) - (((~i2) & 95) | (i2 & (-96)));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return "X.509";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 15) << 1) - (i3 ^ 15);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.p080cz.r rVar = this.c;
        int i6 = rVar.R;
        int i7 = rVar.S;
        int i8 = b + 89;
        a = i8 % 128;
        int i9 = i8 % 2;
        int iHashCode = rVar.b.hashCode();
        int i10 = i7 * 37;
        int i11 = b + 21;
        int i12 = i11 % 128;
        a = i12;
        if (i11 % 2 == 0) {
            i = iHashCode >> ((i10 / i6) >>> 77);
        } else {
            int i13 = i10 & i6;
            int i14 = -(~(-(-(((i13 - (~((i6 ^ i10) | i13))) - 1) * 37))));
            i = ((iHashCode & i14) + (iHashCode | i14)) - 1;
        }
        int i15 = i12 & 3;
        int i16 = -(-((i12 ^ 3) | i15));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        String strS;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbB = P.b("McEliecePublicKey:\n", " length of the code         : ");
        ivas.gov.bisp.enumeration.p080cz.r rVar = this.c;
        int i5 = a;
        int i6 = ((i5 ^ 9) | (i5 & 9)) << 1;
        int i7 = -(((~i5) & 9) | (i5 & (-10)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            strS = j.s(sbB, rVar.R, "\n");
            int i9 = 68 / 0;
        } else {
            strS = j.s(sbB, rVar.R, "\n");
        }
        StringBuilder sbB2 = P.b(strS, " error correction capability: ");
        int i10 = this.c.S;
        int i11 = b;
        int i12 = i11 & 107;
        int i13 = (i12 - (~(-(-((i11 ^ 107) | i12))))) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            P.b(j.s(sbB2, i10, "\n"), " generator matrix           : ");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbB3 = P.b(j.s(sbB2, i10, "\n"), " generator matrix           : ");
        int i14 = a;
        int i15 = i14 & 115;
        int i16 = ((i14 ^ 115) | i15) << 1;
        int i17 = -((i14 | 115) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        ivas.gov.bisp.enumeration.cK.j jVar = this.c.b;
        int i20 = b + 64;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        sbB3.append(jVar.toString());
        String string = sbB3.toString();
        int i23 = b;
        int i24 = (i23 & 21) + (i23 | 21);
        a = i24 % 128;
        int i25 = i24 % 2;
        return string;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 69) + (i2 | 69);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.p080cz.r rVar = this.c;
        try {
            c cVar = new c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p076cv.P.d), new i(rVar.R, rVar.S, rVar.b, ivas.gov.bisp.enumeration.p100w.r.L(rVar.a)));
            int i5 = a;
            int i6 = i5 & 117;
            int i7 = -(-((i5 ^ 117) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            byte[] encoded = cVar.getEncoded();
            int i10 = b;
            int i11 = i10 ^ 105;
            int i12 = -(-((i10 & 105) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 27;
        int i4 = (i2 & 27) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object obj2 = null;
        boolean z = false;
        if (obj != null) {
            int i8 = i6 & 51;
            int i9 = -(-((i6 ^ 51) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            if (obj instanceof u) {
                ivas.gov.bisp.enumeration.p080cz.r rVar = this.c;
                int i13 = rVar.R;
                int i14 = b;
                int i15 = (-2) - ((i14 + 18) ^ (-1));
                a = i15 % 128;
                int i16 = i15 % 2;
                ivas.gov.bisp.enumeration.p080cz.r rVar2 = ((u) obj).c;
                int i17 = i14 & 91;
                int i18 = ((((i14 ^ 91) | i17) << 1) - (~(-((i14 | 91) & (~i17))))) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
                if (i13 == rVar2.R) {
                    int i20 = b;
                    int i21 = ((i20 | 115) << 1) - (((~i20) & 115) | (i20 & (-116)));
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    if (rVar.S == rVar2.S) {
                        int i23 = b;
                        int i24 = (i23 & (-22)) | ((~i23) & 21);
                        int i25 = -(-((i23 & 21) << 1));
                        int i26 = (i24 & i25) + (i25 | i24);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        ivas.gov.bisp.enumeration.cK.j jVar = rVar.b;
                        ivas.gov.bisp.enumeration.cK.j jVar2 = rVar2.b;
                        int i28 = (-2) - ((a + 62) ^ (-1));
                        b = i28 % 128;
                        if (i28 % 2 != 0) {
                            jVar.equals(jVar2);
                            obj2.hashCode();
                            throw null;
                        }
                        if (jVar.equals(jVar2)) {
                            int i29 = a;
                            int i30 = i29 & 29;
                            int i31 = (i30 - (~(-(-((i29 ^ 29) | i30))))) - 1;
                            b = i31 % 128;
                            z = !(i31 % 2 != 0);
                        }
                    }
                }
            } else {
                int i32 = (i11 & 41) + (i11 | 41);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
        }
        int i34 = b + 87;
        a = i34 % 128;
        if (i34 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
