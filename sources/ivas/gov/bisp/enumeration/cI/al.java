package ivas.gov.bisp.enumeration.cI;

import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p078cx.i;
import ivas.gov.bisp.enumeration.p079cy.h;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class al implements PrivateKey {
    private static int a = 0;
    private static int b = 1;
    public transient h c;
    public transient L d;

    public al(c cVar) {
        this.d = cVar.g;
        this.c = (h) i.b(cVar);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b + 9;
        a = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] encoded = r.x(this.c, this.d).getEncoded();
            int i4 = b;
            int i5 = (-2) - (((i4 & 20) + (i4 | 20)) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = ((i2 ^ 9) | i3) << 1;
        int i5 = -((~i3) & (i2 | 9));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        int i7 = (-2) - ((i2 + 66) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        return "PKCS#8";
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i2 | 51) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        String strK = ivas.gov.bisp.enumeration.O.i.k(this.c.S);
        int i8 = b;
        int i9 = (i8 & (-84)) | ((~i8) & 83);
        int i10 = (i8 & 83) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return strK;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 108) << 1) - (i2 ^ 108)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            h hVar = this.c;
            int i4 = hVar.S;
            j.h(hVar.c());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        h hVar2 = this.c;
        int i5 = hVar2.S;
        int iH = j.h(hVar2.c());
        int i6 = b;
        int i7 = i6 + 123;
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = iH * 37;
        int i10 = i9 & i5;
        int i11 = (i9 ^ i5) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        int i13 = (-2) - (((i6 & 2) + (i6 | 2)) ^ (-1));
        a = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        Object obj2;
        al alVar;
        h hVar;
        int i2;
        int i3;
        byte[] bArrC;
        h hVar2;
        byte[] bArrC2;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 + 93;
        int i8 = i7 % 128;
        a = i8;
        boolean z2 = false;
        if (i7 % 2 != 0) {
            if (obj != this) {
                z = false;
                if (obj instanceof al) {
                    int i9 = i6 + 69;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                i = ((i8 & (-52)) | ((~i8) & 51)) + ((i8 & 51) << 1);
                b = i % 128;
                obj2 = null;
                alVar = (al) obj;
                if (i % 2 != 0) {
                    int i11 = this.c.S;
                    throw null;
                }
                hVar = this.c;
                if (hVar.S == alVar.c.S) {
                    int i12 = a + 19;
                    b = i12 % 128;
                    i3 = i12 % 2;
                    bArrC = hVar.c();
                    hVar2 = alVar.c;
                    if (i3 == 0) {
                        bArrC2 = hVar2.c();
                        int i13 = 51 / 0;
                    } else {
                        bArrC2 = hVar2.c();
                    }
                    int i14 = b;
                    i4 = (i14 ^ 79) + ((i14 & 79) << 1);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        Arrays.equals(bArrC, bArrC2);
                        obj2.hashCode();
                        throw null;
                    }
                    if (Arrays.equals(bArrC, bArrC2)) {
                        z2 = z;
                    } else {
                        int i15 = b;
                        i2 = ((i15 & (-34)) | ((~i15) & 33)) + ((i15 & 33) << 1);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i16 = 5 % 5;
                        }
                    }
                } else {
                    int i17 = b;
                    i2 = ((i17 & (-34)) | ((~i17) & 33)) + ((i17 & 33) << 1);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i18 = 5 % 5;
                    }
                }
                int i19 = a;
                int i20 = i19 & 21;
                int i21 = -(-((i19 ^ 21) | i20));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                return z2;
            }
            int i24 = i6 ^ 89;
            int i25 = ((i6 & 89) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            return true;
        }
        if (obj != this) {
            z = true;
            if (obj instanceof al) {
                int i29 = i6 + 69;
                a = i29 % 128;
                int i110 = i29 % 2;
                return false;
            }
            i = ((i8 & (-52)) | ((~i8) & 51)) + ((i8 & 51) << 1);
            b = i % 128;
            obj2 = null;
            alVar = (al) obj;
            if (i % 2 != 0) {
                int i111 = this.c.S;
                throw null;
            }
            hVar = this.c;
            if (hVar.S == alVar.c.S) {
                int i112 = a + 19;
                b = i112 % 128;
                i3 = i112 % 2;
                bArrC = hVar.c();
                hVar2 = alVar.c;
                if (i3 == 0) {
                    bArrC2 = hVar2.c();
                    int i113 = 51 / 0;
                } else {
                    bArrC2 = hVar2.c();
                }
                int i114 = b;
                i4 = (i114 ^ 79) + ((i114 & 79) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    Arrays.equals(bArrC, bArrC2);
                    obj2.hashCode();
                    throw null;
                }
                if (Arrays.equals(bArrC, bArrC2)) {
                    z2 = z;
                } else {
                    int i115 = b;
                    i2 = ((i115 & (-34)) | ((~i115) & 33)) + ((i115 & 33) << 1);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i116 = 5 % 5;
                    }
                }
            } else {
                int i117 = b;
                i2 = ((i117 & (-34)) | ((~i117) & 33)) + ((i117 & 33) << 1);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i118 = 5 % 5;
                }
            }
            int i119 = a;
            int i210 = i119 & 21;
            int i211 = -(-((i119 ^ 21) | i210));
            int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
            b = i212 % 128;
            int i213 = i212 % 2;
            return z2;
        }
        int i214 = i6 ^ 89;
        int i215 = ((i6 & 89) | i214) << 1;
        int i216 = -i214;
        int i217 = (i215 & i216) + (i216 | i215);
        a = i217 % 128;
        int i218 = i217 % 2;
        return true;
    }
}
