package ivas.gov.bisp.enumeration.cI;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p069co.c;
import ivas.gov.bisp.enumeration.p078cx.p;
import ivas.gov.bisp.enumeration.p079cy.r;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class D implements PublicKey {
    private static int a = 1;
    private static int b;
    public transient r c;

    public D(c cVar) {
        this.c = (r) p.b(cVar);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] encoded;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = ((i2 | 83) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                encoded = ivas.gov.bisp.enumeration.p100w.r.t(this.c).getEncoded();
                int i5 = 93 / 0;
            } else {
                encoded = ivas.gov.bisp.enumeration.p100w.r.t(this.c).getEncoded();
            }
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 118) + ((i2 & 118) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return "X.509";
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = -(-((i2 ^ 95) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return i.k(this.c.S);
        }
        i.k(this.c.S);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 65;
        int i4 = (i3 << 1) - ((~(i2 & 65)) & i3);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            r rVar = this.c;
            int i5 = rVar.S;
            rVar.c();
            throw null;
        }
        r rVar2 = this.c;
        int i6 = rVar2.S;
        byte[] bArrC = rVar2.c();
        int i7 = b + 25;
        a = i7 % 128;
        int i8 = i7 % 2;
        int iH = (-2) - (((j.h(bArrC) * 37) - (~i6)) ^ (-1));
        int i9 = a;
        int i10 = (i9 & 56) + (i9 | 56);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return iH;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    public boolean equals(Object obj) {
        byte[] bArrC;
        r rVar;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 31;
        int i5 = (i4 - (~(-(-((i3 ^ 31) | i4))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Object obj2 = null;
        if (obj == this) {
            int i8 = i6 & 37;
            int i9 = (i8 - (~(-(-((i6 ^ 37) | i8))))) - 1;
            int i10 = i9 % 128;
            b = i10;
            boolean z2 = !(i9 % 2 != 0);
            int i11 = i10 & 121;
            int i12 = (((i10 | 121) & (~i11)) - (~(i11 << 1))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return z2;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof D)) {
            int i13 = i6 & 53;
            int i14 = -(-((i6 ^ 53) | i13));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 78 / 0;
            }
            return false;
        }
        int i17 = i3 & 75;
        int i18 = i17 + ((i3 ^ 75) | i17);
        a = i18 % 128;
        int i19 = i18 % 2;
        D d = (D) obj;
        r rVar2 = this.c;
        int i20 = rVar2.S;
        int i21 = b;
        int i22 = (i21 ^ 17) + ((i21 & 17) << 1);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            if (i20 == d.c.S) {
                bArrC = rVar2.c();
                rVar = d.c;
                int i23 = b;
                int i24 = i23 & 7;
                i = (i24 - (~((i23 ^ 7) | i24))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    Arrays.equals(bArrC, rVar.c());
                    throw null;
                }
                if (Arrays.equals(bArrC, rVar.c())) {
                }
            }
            int i25 = a;
            int i26 = ((i25 & 2) + (i25 | 2)) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            return z;
        }
        int i28 = 32 / 0;
        if (i20 == d.c.S) {
            bArrC = rVar2.c();
            rVar = d.c;
            int i29 = b;
            int i210 = i29 & 7;
            i = (i210 - (~((i29 ^ 7) | i210))) - 1;
            a = i % 128;
            if (i % 2 != 0) {
                Arrays.equals(bArrC, rVar.c());
                throw null;
            }
            z = Arrays.equals(bArrC, rVar.c());
        }
        int i211 = a;
        int i212 = ((i211 & 2) + (i211 | 2)) - 1;
        b = i212 % 128;
        int i213 = i212 % 2;
        return z;
        int i30 = a;
        int i31 = (i30 & 93) + (i30 | 93);
        b = i31 % 128;
        int i32 = i31 % 2;
        int i214 = a;
        int i215 = ((i214 & 2) + (i214 | 2)) - 1;
        b = i215 % 128;
        int i216 = i215 % 2;
        return z;
    }
}
