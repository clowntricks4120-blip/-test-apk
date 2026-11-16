package ivas.gov.bisp.enumeration.cM;

import ivas.gov.bisp.enumeration.cC.C0235m;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p078cx.p;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements PublicKey {
    private static int a = 1;
    private static int b;
    public transient C0278x c;
    public transient C0235m d;

    public c(ivas.gov.bisp.enumeration.p069co.c cVar) {
        C0235m c0235m = (C0235m) p.b(cVar);
        this.d = c0235m;
        this.c = ivas.gov.bisp.enumeration.p100w.r.M(c0235m.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        c cVar;
        C0278x c0278x;
        C0278x c0278x2;
        byte[] bArrC;
        C0235m c0235m;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 1) << 1) - (i3 ^ 1);
        int i5 = i4 % 128;
        a = i5;
        boolean z2 = false;
        if (i4 % 2 == 0) {
            if (obj != this) {
                z = false;
                if (obj instanceof c) {
                    int i6 = i5 & 91;
                    int i7 = i5 | 91;
                    i = (i6 & i7) + (i6 | i7);
                    b = i % 128;
                    if (i % 2 == 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i8 = i3 & 33;
                int i9 = i8 + ((i3 ^ 33) | i8);
                int i10 = i9 % 128;
                a = i10;
                int i11 = i9 % 2;
                cVar = (c) obj;
                c0278x = this.c;
                c0278x2 = cVar.c;
                int i12 = i10 + 107;
                b = i12 % 128;
                int i13 = i12 % 2;
                if (c0278x.k(c0278x2)) {
                    int i14 = a;
                    int i15 = i14 & 61;
                    int i16 = (i15 - (~((i14 ^ 61) | i15))) - 1;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    bArrC = this.d.c();
                    c0235m = cVar.d;
                    int i18 = a;
                    int i19 = i18 & 59;
                    int i20 = i19 + ((i18 ^ 59) | i19);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    if (Arrays.equals(bArrC, c0235m.c())) {
                        z2 = z;
                    } else {
                        int i22 = b;
                        int i23 = (i22 ^ 80) + ((i22 & 80) << 1);
                        int i24 = (i23 ^ (-1)) + (i23 << 1);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                    }
                } else {
                    int i26 = b;
                    int i27 = (i26 ^ 80) + ((i26 & 80) << 1);
                    int i28 = (i27 ^ (-1)) + (i27 << 1);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
                int i30 = a;
                int i31 = (((i30 | 48) << 1) - (i30 ^ 48)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                return z2;
            }
            int i33 = ((i5 | 121) << 1) - (i5 ^ 121);
            b = i33 % 128;
            int i34 = i33 % 2;
            return true;
        }
        if (obj != this) {
            z = true;
            if (obj instanceof c) {
                int i35 = i5 & 91;
                int i36 = i5 | 91;
                i = (i35 & i36) + (i35 | i36);
                b = i % 128;
                if (i % 2 == 0) {
                    return false;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i37 = i3 & 33;
            int i38 = i37 + ((i3 ^ 33) | i37);
            int i110 = i38 % 128;
            a = i110;
            int i111 = i38 % 2;
            cVar = (c) obj;
            c0278x = this.c;
            c0278x2 = cVar.c;
            int i112 = i110 + 107;
            b = i112 % 128;
            int i113 = i112 % 2;
            if (c0278x.k(c0278x2)) {
                int i114 = a;
                int i115 = i114 & 61;
                int i116 = (i115 - (~((i114 ^ 61) | i115))) - 1;
                b = i116 % 128;
                int i117 = i116 % 2;
                bArrC = this.d.c();
                c0235m = cVar.d;
                int i118 = a;
                int i119 = i118 & 59;
                int i210 = i119 + ((i118 ^ 59) | i119);
                b = i210 % 128;
                int i211 = i210 % 2;
                if (Arrays.equals(bArrC, c0235m.c())) {
                    int i212 = b;
                    int i213 = (i212 ^ 80) + ((i212 & 80) << 1);
                    int i214 = (i213 ^ (-1)) + (i213 << 1);
                    a = i214 % 128;
                    int i215 = i214 % 2;
                } else {
                    z2 = z;
                }
            } else {
                int i216 = b;
                int i217 = (i216 ^ 80) + ((i216 & 80) << 1);
                int i218 = (i217 ^ (-1)) + (i217 << 1);
                a = i218 % 128;
                int i219 = i218 % 2;
            }
            int i39 = a;
            int i310 = (((i39 | 48) << 1) - (i39 ^ 48)) - 1;
            b = i310 % 128;
            int i311 = i310 % 2;
            return z2;
        }
        int i312 = ((i5 | 121) << 1) - (i5 ^ 121);
        b = i312 % 128;
        int i313 = i312 % 2;
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 85) + (i2 | 85);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 ^ 89) + ((i2 & 89) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b + 55;
        a = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] encoded = ivas.gov.bisp.enumeration.p100w.r.t(this.d).getEncoded();
            int i4 = b;
            int i5 = i4 & 75;
            int i6 = ((((i4 ^ 75) | i5) << 1) - (~(-((i4 | 75) & (~i5))))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 72 / 0;
            }
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b + 15;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = (-2) - ((i3 + 52) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        return "X.509";
    }

    public int hashCode() {
        C0235m c0235m;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-118)) | ((~i2) & 117);
        int i4 = (i2 & 117) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = this.c.hashCode();
        if (i6 == 0) {
            c0235m = this.d;
            int i7 = 0 / 0;
        } else {
            c0235m = this.d;
        }
        int i8 = b;
        int i9 = ((i8 ^ 55) - (~(-(-((i8 & 55) << 1))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int iH = ivas.gov.bisp.enumeration.p064cj.j.h(c0235m.c()) * 37;
        int i11 = iH & iHashCode;
        int i12 = -(-(iHashCode | iH));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = b;
        int i15 = (((i14 | 56) << 1) - (i14 ^ 56)) - 1;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 68 / 0;
        }
        return i13;
    }
}
