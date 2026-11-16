package ivas.gov.bisp.enumeration.cL;

import ivas.gov.bisp.enumeration.cA.a;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.l;
import ivas.gov.bisp.enumeration.p078cx.p;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements PublicKey, Key {
    private static int a = 0;
    private static int b = 1;
    public transient C0278x c;
    public transient a d;

    public c(ivas.gov.bisp.enumeration.p069co.c cVar) {
        this.c = l.h(cVar.c.d).d.c;
        this.d = (a) p.b(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        int i2;
        int i3;
        Object obj2;
        c cVar;
        C0278x c0278x;
        C0278x c0278x2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = ((i7 | 121) << 1) - (i7 ^ 121);
        int i9 = i8 % 128;
        a = i9;
        boolean z2 = false;
        if (i8 % 2 != 0) {
            if (obj != this) {
                z = false;
                if (!(obj instanceof c)) {
                    int i10 = i9 & 37;
                    int i11 = (i9 | 37) & (~i10);
                    int i12 = i10 << 1;
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
                int i15 = i9 & 49;
                int i16 = ((i9 ^ 49) | i15) << 1;
                int i17 = -((i9 | 49) & (~i15));
                i2 = (i16 ^ i17) + ((i17 & i16) << 1);
                i3 = i2 % 128;
                b = i3;
                obj2 = null;
                cVar = (c) obj;
                if (i2 % 2 != 0) {
                    C0278x c0278x3 = cVar.c;
                    obj2.hashCode();
                    throw null;
                }
                c0278x = this.c;
                c0278x2 = cVar.c;
                i4 = i3 + 95;
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    c0278x.k(c0278x2);
                    throw null;
                }
                if (c0278x.k(c0278x2)) {
                    i5 = b + 65;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        this.d.c();
                        cVar.d.c();
                        throw null;
                    }
                    if (Arrays.equals(this.d.c(), cVar.d.c())) {
                        z2 = z;
                    } else {
                        int i18 = a;
                        int i19 = (i18 ^ 98) + ((i18 & 98) << 1);
                        int i20 = (i19 ^ (-1)) + (i19 << 1);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    }
                } else {
                    int i110 = a;
                    int i111 = (i110 ^ 98) + ((i110 & 98) << 1);
                    int i22 = (i111 ^ (-1)) + (i111 << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
                int i24 = b;
                int i25 = ((i24 | 24) << 1) - (i24 ^ 24);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                a = i26 % 128;
                int i27 = i26 % 2;
                return z2;
            }
            int i28 = ((i9 ^ 27) | (i9 & 27)) << 1;
            int i29 = -(((~i9) & 27) | (i9 & (-28)));
            i = (i28 & i29) + (i28 | i29);
            b = i % 128;
            if (i % 2 == 0) {
                int i30 = 32 / 0;
            }
            return true;
        }
        if (obj != this) {
            z = true;
            if (!(obj instanceof c)) {
                int i112 = i9 & 37;
                int i113 = (i9 | 37) & (~i112);
                int i114 = i112 << 1;
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                b = i115 % 128;
                int i116 = i115 % 2;
                return false;
            }
            int i117 = i9 & 49;
            int i118 = ((i9 ^ 49) | i117) << 1;
            int i119 = -((i9 | 49) & (~i117));
            i2 = (i118 ^ i119) + ((i119 & i118) << 1);
            i3 = i2 % 128;
            b = i3;
            obj2 = null;
            cVar = (c) obj;
            if (i2 % 2 != 0) {
                C0278x c0278x4 = cVar.c;
                obj2.hashCode();
                throw null;
            }
            c0278x = this.c;
            c0278x2 = cVar.c;
            i4 = i3 + 95;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                c0278x.k(c0278x2);
                throw null;
            }
            if (c0278x.k(c0278x2)) {
                i5 = b + 65;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    this.d.c();
                    cVar.d.c();
                    throw null;
                }
                if (Arrays.equals(this.d.c(), cVar.d.c())) {
                    int i1110 = a;
                    int i1111 = (i1110 ^ 98) + ((i1110 & 98) << 1);
                    int i210 = (i1111 ^ (-1)) + (i1111 << 1);
                    b = i210 % 128;
                    int i211 = i210 % 2;
                } else {
                    z2 = z;
                }
            } else {
                int i1112 = a;
                int i1113 = (i1112 ^ 98) + ((i1112 & 98) << 1);
                int i212 = (i1113 ^ (-1)) + (i1113 << 1);
                b = i212 % 128;
                int i213 = i212 % 2;
            }
            int i214 = b;
            int i215 = ((i214 | 24) << 1) - (i214 ^ 24);
            int i216 = (i215 ^ (-1)) + (i215 << 1);
            a = i216 % 128;
            int i217 = i216 % 2;
            return z2;
        }
        int i218 = ((i9 ^ 27) | (i9 & 27)) << 1;
        int i219 = -(((~i9) & 27) | (i9 & (-28)));
        i = (i218 & i219) + (i218 | i219);
        b = i % 128;
        if (i % 2 == 0) {
            int i31 = 32 / 0;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 59;
        int i4 = ((((i2 & 59) | i3) << 1) - (~(-i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 73;
        b = i7 % 128;
        int i8 = i7 % 2;
        return "SPHINCS-256";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d A[Catch: IOException -> 0x00b9, TRY_ENTER, TryCatch #0 {IOException -> 0x00b9, blocks: (B:4:0x001b, B:6:0x0023, B:20:0x005c, B:24:0x009a, B:27:0x00b6, B:15:0x004d, B:16:0x0054, B:17:0x0059, B:11:0x002a), top: B:31:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[Catch: IOException -> 0x00b9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:4:0x001b, B:6:0x0023, B:20:0x005c, B:24:0x009a, B:27:0x00b6, B:15:0x004d, B:16:0x0054, B:17:0x0059, B:11:0x002a), top: B:31:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[Catch: IOException -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:4:0x001b, B:6:0x0023, B:20:0x005c, B:24:0x009a, B:27:0x00b6, B:15:0x004d, B:16:0x0054, B:17:0x0059, B:11:0x002a), top: B:31:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.Key
    public byte[] getEncoded() {
        int i;
        ivas.gov.bisp.enumeration.p069co.c cVarT;
        ivas.gov.bisp.enumeration.p069co.c cVar;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (((i5 ^ 27) | (i5 & 27)) << 1) - (((~i5) & 27) | (i5 & (-28)));
        b = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                int i7 = 21 / 0;
                if (this.d.F() != null) {
                    int i8 = a;
                    int i9 = ((i8 ^ 63) | (i8 & 63)) << 1;
                    int i10 = -(((~i8) & 63) | (i8 & (-64)));
                    i = (i9 & i10) + (i10 | i9);
                    b = i % 128;
                    if (i % 2 != 0) {
                        r.t(this.d);
                        throw null;
                    }
                    cVarT = r.t(this.d);
                } else {
                    cVar = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(P.e, new l(new ivas.gov.bisp.enumeration.p069co.j(this.c))), this.d.c());
                    int i11 = a;
                    i2 = ((i11 | 87) << 1) - (i11 ^ 87);
                    i3 = i2 % 128;
                    b = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i12 = i3 & 55;
                    int i13 = -(-(i3 | 55));
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    cVarT = cVar;
                }
            } else if (this.d.F() != null) {
                int i16 = a;
                int i17 = ((i16 ^ 63) | (i16 & 63)) << 1;
                int i18 = -(((~i16) & 63) | (i16 & (-64)));
                i = (i17 & i18) + (i18 | i17);
                b = i % 128;
                if (i % 2 != 0) {
                    r.t(this.d);
                    throw null;
                }
                cVarT = r.t(this.d);
            } else {
                cVar = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(P.e, new l(new ivas.gov.bisp.enumeration.p069co.j(this.c))), this.d.c());
                int i19 = a;
                i2 = ((i19 | 87) << 1) - (i19 ^ 87);
                i3 = i2 % 128;
                b = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i110 = i3 & 55;
                int i111 = -(-(i3 | 55));
                int i112 = (i110 & i111) + (i111 | i110);
                a = i112 % 128;
                int i113 = i112 % 2;
                cVarT = cVar;
            }
            byte[] encoded = cVarT.getEncoded();
            int i20 = b;
            int i21 = i20 & 113;
            int i22 = ((((i20 ^ 113) | i21) << 1) - (~(-((i20 | 113) & (~i21))))) - 1;
            a = i22 % 128;
            int i23 = i22 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = i3 + ((i2 ^ 3) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (i2 & (-40)) | ((~i2) & 39);
        int i7 = -(-((i2 & 39) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return "X.509";
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-28)) | ((~i2) & 27)) - (~(-(-((i2 & 27) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.c.hashCode();
        a aVar = this.d;
        int i5 = b;
        int i6 = (i5 & 87) + (i5 | 87);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iH = ivas.gov.bisp.enumeration.p064cj.j.h(aVar.c()) * 37;
        int i8 = iH ^ iHashCode;
        int i9 = ((((iHashCode & iH) | i8) << 1) - (~(-i8))) - 1;
        int i10 = a;
        int i11 = ((i10 | 51) << 1) - (i10 ^ 51);
        b = i11 % 128;
        int i12 = i11 % 2;
        return i9;
    }
}
