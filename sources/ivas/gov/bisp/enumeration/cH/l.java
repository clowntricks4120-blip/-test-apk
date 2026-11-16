package ivas.gov.bisp.enumeration.cH;

import ivas.gov.bisp.enumeration.cK.c;
import ivas.gov.bisp.enumeration.p069co.j;
import ivas.gov.bisp.enumeration.p076cv.C0281p;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p080cz.e;
import ivas.gov.bisp.enumeration.p101x.r;
import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes.dex */
public class l implements r, PrivateKey {
    private static int a = 0;
    private static int b = 1;
    public e c;

    public l(e eVar) {
        this.c = eVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 107) + (i2 | 107);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 45;
        int i6 = (((i2 | 45) & (~i5)) - (~(i5 << 1))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return "McEliece";
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 107) << 1) - (i2 ^ 107);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 + 13;
        b = i5 % 128;
        int i6 = i5 % 2;
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] encoded;
        int i = 2 % 2;
        int i2 = a + 40;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            e eVar = this.c;
            int i4 = eVar.b;
            int i5 = eVar.a;
            obj.hashCode();
            throw null;
        }
        e eVar2 = this.c;
        int i6 = eVar2.b;
        int i7 = eVar2.a;
        c cVar = eVar2.T;
        ivas.gov.bisp.enumeration.cK.e eVar3 = eVar2.X;
        int i8 = a;
        int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        try {
            ivas.gov.bisp.enumeration.p067cm.c cVar2 = new ivas.gov.bisp.enumeration.p067cm.c(new j(P.c), new C0281p(i6, i7, cVar, eVar3, eVar2.V, eVar2.W, eVar2.U), null, null);
            int i11 = b;
            int i12 = i11 & 83;
            int i13 = ((i11 ^ 83) | i12) << 1;
            int i14 = -((i11 | 83) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                cVar2.getEncoded();
                obj.hashCode();
                throw null;
            }
            encoded = cVar2.getEncoded();
            int i16 = b;
            int i17 = ((i16 & 27) - (~(-(-(i16 | 27))))) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = b;
            int i20 = ((i19 | 55) << 1) - (i19 ^ 55);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                return encoded;
            }
            obj.hashCode();
            throw null;
        } catch (IOException unused) {
            encoded = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public boolean equals(Object obj) {
        e eVar;
        ivas.gov.bisp.enumeration.cK.e eVar2;
        ivas.gov.bisp.enumeration.cK.e eVar3;
        ivas.gov.bisp.enumeration.cK.r rVar;
        e eVar4;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 65;
        int i5 = (((i3 & 65) | i4) << 1) - i4;
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean z = false;
        if (!(obj instanceof l)) {
            int i7 = i3 ^ 119;
            int i8 = ((i3 & 119) | i7) << 1;
            int i9 = -i7;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = (((i3 | 34) << 1) - (i3 ^ 34)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return false;
            }
            throw null;
        }
        l lVar = (l) obj;
        e eVar5 = this.c;
        int i13 = eVar5.b;
        int i14 = (-2) - ((a + 108) ^ (-1));
        b = i14 % 128;
        if (i14 % 2 != 0) {
            eVar = lVar.c;
            if (i13 == eVar.b) {
            }
            int i15 = a;
            i = ((i15 & (-100)) | ((~i15) & 99)) + ((i15 & 99) << 1);
            b = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw null;
        }
        eVar = lVar.c;
        if (i13 != eVar.b) {
            z = true;
        }
        int i16 = a;
        i = ((i16 & (-100)) | ((~i16) & 99)) + ((i16 & 99) << 1);
        b = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
        int i17 = a + 87;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            if (eVar5.a == eVar.a) {
            }
            int i18 = a;
            i = ((i18 & (-100)) | ((~i18) & 99)) + ((i18 & 99) << 1);
            b = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw null;
        }
        if (eVar5.a != eVar.a) {
            z = true;
        }
        int i19 = a;
        i = ((i19 & (-100)) | ((~i19) & 99)) + ((i19 & 99) << 1);
        b = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
        c cVar = eVar5.T;
        c cVar2 = eVar.T;
        int i20 = b;
        int i21 = (-2) - ((((i20 | 72) << 1) - (i20 ^ 72)) ^ (-1));
        a = i21 % 128;
        int i22 = i21 % 2;
        if (!(!cVar.equals(cVar2))) {
            int i23 = a;
            int i24 = i23 & 125;
            int i25 = -(-((i23 ^ 125) | i24));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                eVar2 = this.c.X;
                eVar3 = lVar.c.X;
                int i27 = 98 / 0;
            } else {
                eVar2 = this.c.X;
                eVar3 = lVar.c.X;
            }
            int i28 = a;
            int i29 = ((i28 & 38) + (i28 | 38)) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            boolean zEquals = eVar2.equals(eVar3);
            if (i30 != 0 ? zEquals : !(!zEquals)) {
                ivas.gov.bisp.enumeration.cK.j jVar = this.c.U;
                ivas.gov.bisp.enumeration.cK.j jVar2 = lVar.c.U;
                int i31 = a;
                int i32 = i31 & 89;
                int i33 = (((i31 | 89) & (~i32)) - (~(i32 << 1))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
                if (!(!jVar.equals(jVar2))) {
                    int i35 = a;
                    int i36 = (i35 & (-22)) | ((~i35) & 21);
                    int i37 = (i35 & 21) << 1;
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    b = i38 % 128;
                    if (i38 % 2 == 0) {
                        rVar = this.c.V;
                        eVar4 = lVar.c;
                        int i39 = 28 / 0;
                    } else {
                        rVar = this.c.V;
                        eVar4 = lVar.c;
                    }
                    int i40 = a;
                    int i41 = i40 & 13;
                    int i42 = ((((i40 ^ 13) | i41) << 1) - (~(-((i40 | 13) & (~i41))))) - 1;
                    b = i42 % 128;
                    if (i42 % 2 != 0 ? rVar.equals(eVar4.V) : rVar.equals(eVar4.V)) {
                        ivas.gov.bisp.enumeration.cK.r rVar2 = this.c.W;
                        ivas.gov.bisp.enumeration.cK.r rVar3 = lVar.c.W;
                        int i43 = b;
                        int i44 = i43 & 105;
                        int i45 = i44 + ((i43 ^ 105) | i44);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        if (rVar2.equals(rVar3)) {
                            int i47 = b;
                            int i48 = (((i47 | 108) << 1) - (i47 ^ 108)) - 1;
                            a = i48 % 128;
                            z = i48 % 2 == 0;
                            int i49 = i47 & 123;
                            int i50 = (((i47 ^ 123) | i49) << 1) - ((i47 | 123) & (~i49));
                            a = i50 % 128;
                            int i51 = i50 % 2;
                        }
                    }
                }
            }
        }
        int i110 = a;
        i = ((i110 & (-100)) | ((~i110) & 99)) + ((i110 & 99) << 1);
        b = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 119;
        int i8 = (i6 | 119) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        e eVar = this.c;
        int i12 = eVar.a;
        int i13 = b;
        int i14 = (i13 & 83) + (i13 | 83);
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = eVar.b;
        int i17 = eVar.T.d;
        int i18 = b;
        int i19 = ((((i18 ^ 17) | (i18 & 17)) << 1) - (~(-(((~i18) & 17) | (i18 & (-18)))))) - 1;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            eVar.X.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = eVar.X.hashCode();
        int iHashCode2 = this.c.V.hashCode();
        ivas.gov.bisp.enumeration.cK.r rVar = this.c.W;
        int i20 = b;
        int i21 = ((i20 ^ 92) + ((i20 & 92) << 1)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        int iHashCode3 = rVar.hashCode();
        int iHashCode4 = this.c.U.hashCode();
        int i23 = b;
        int i24 = ((i23 ^ 122) + ((i23 & 122) << 1)) - 1;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            i = (i12 % 71) >> i16;
            i2 = 91;
        } else {
            i = (i12 * 37) + i16;
            i2 = 37;
        }
        int i25 = (i23 & (-108)) | ((~i23) & 107);
        int i26 = (i23 & 107) << 1;
        int i27 = (i25 & i26) + (i25 | i26);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = i / i2;
            int i29 = -(-i17);
            int i30 = (i28 & i29) + (i28 | i29);
            i3 = iHashCode2 >>> ((iHashCode / (((i30 ^ 84) + ((i30 & 84) << 1)) - 1)) / 17);
            i4 = 13;
        } else {
            int i31 = i * i2;
            int i32 = -(-(((i31 ^ i17) + ((i31 & i17) << 1)) * 37));
            int i33 = iHashCode & i32;
            i3 = ((((iHashCode | i32) & (~i33)) + (i33 << 1)) * 37) + iHashCode2;
            i4 = 37;
        }
        int i34 = i23 & 45;
        int i35 = (((~i34) & (i23 | 45)) - (~(-(-(i34 << 1))))) - 1;
        a = i35 % 128;
        if (i35 % 2 != 0) {
            return iHashCode4 >>> ((iHashCode3 % (i3 / i4)) >>> 66);
        }
        int i36 = -(-(((iHashCode3 - (~(i3 * i4))) - 1) * 37));
        int i37 = iHashCode4 & i36;
        int i38 = (i36 ^ iHashCode4) | i37;
        return ((i38 & i37) << 1) + (i37 ^ i38);
    }
}
