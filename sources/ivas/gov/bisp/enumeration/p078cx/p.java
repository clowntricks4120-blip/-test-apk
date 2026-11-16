package ivas.gov.bisp.enumeration.p078cx;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.cA.a;
import ivas.gov.bisp.enumeration.cC.C0235m;
import ivas.gov.bisp.enumeration.cC.R;
import ivas.gov.bisp.enumeration.cC.S;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p069co.c;
import ivas.gov.bisp.enumeration.p076cv.N;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.l;
import ivas.gov.bisp.enumeration.p076cv.o;
import ivas.gov.bisp.enumeration.p077cw.Q;
import ivas.gov.bisp.enumeration.p077cw.v;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {
    private static int a = 1;
    private static int b;
    public static Map c;

    public static abstract class bCm {
        public bCm() {
        }

        public bCm(bCl bcl) {
        }

        public abstract r d(c cVar, Object obj);
    }

    public static class bCn extends bCm {
        private static int a = 0;
        private static int b = 1;

        public bCn(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 21;
            int i4 = ((i2 & 21) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i4 | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            byte[] bArrF = M.p(cVar.j()).c;
            int i8 = a;
            int i9 = (((i8 & (-54)) | ((~i8) & 53)) - (~((i8 & 53) << 1))) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0 ? h.e(bArrF, 0) != 1 : h.e(bArrF, 1) != 1) {
                if (bArrF.length == 64) {
                    int i10 = b;
                    int i11 = (((i10 ^ 57) | (i10 & 57)) << 1) - (((~i10) & 57) | (i10 & (-58)));
                    a = i11 % 128;
                    bArrF = i11 % 2 != 0 ? j.f(bArrF, 5, bArrF.length) : j.f(bArrF, 4, bArrF.length);
                }
                Q qC = Q.c(bArrF);
                int i12 = a;
                int i13 = (i12 & 49) + (i12 | 49);
                b = i13 % 128;
                int i14 = i13 % 2;
                return qC;
            }
            int i15 = a;
            int i16 = i15 & 35;
            int i17 = (i15 ^ 35) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            v vVarC = v.c(j.f(bArrF, 4, bArrF.length));
            int i20 = a;
            int i21 = (i20 & 43) + (i20 | 43);
            b = i21 % 128;
            int i22 = i21 % 2;
            return vVarC;
        }
    }

    public static class bCo extends bCm {
        private static int a = 0;
        private static int b = 1;

        public bCo(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.cX.c cVar2 = new ivas.gov.bisp.enumeration.cX.c(cVar.d.o());
            int i2 = a;
            int i3 = i2 & 71;
            int i4 = (((i2 | 71) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
            return cVar2;
        }
    }

    public static class bCq extends bCm {
        private static int a = 1;
        private static int b;

        public bCq(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) {
            int i = 2 % 2;
            int i2 = b + 111;
            a = i2 % 128;
            int i3 = i2 % 2;
            a aVar = new a(cVar.d.o(), z.e(l.h(cVar.c.d)));
            int i4 = b;
            int i5 = (i4 & (-76)) | ((~i4) & 75);
            int i6 = (i4 & 75) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            return aVar;
        }
    }

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(P.i, new bCp(null));
        ((HashMap) c).put(P.a, new bCp(null));
        ((HashMap) c).put(P.e, new bCq(null));
        ((HashMap) c).put(P.g, new bCo(null));
        ((HashMap) c).put(P.f, new bCr(null));
        ((HashMap) c).put(P.h, new bCs(null));
        ((HashMap) c).put(ivas.gov.bisp.enumeration.dg.j.a, new bCr(null));
        ((HashMap) c).put(ivas.gov.bisp.enumeration.dg.j.b, new bCs(null));
        ((HashMap) c).put(ivas.gov.bisp.enumeration.p067cm.j.a, new bCn(null));
        int i = a + 3;
        b = i % 128;
        int i2 = i % 2;
    }

    public static class bCr extends bCm {
        private static int a = 0;
        private static int b = 1;

        public bCr(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) {
            C0278x c0278x;
            O oJ;
            int i = 2 % 2;
            int i2 = a + 91;
            b = i2 % 128;
            int i3 = i2 % 2;
            ivas.gov.bisp.enumeration.p076cv.a aVarH = ivas.gov.bisp.enumeration.p076cv.a.h(cVar.c.d);
            Object obj2 = null;
            if (aVarH == null) {
                byte[] bArr = M.p(cVar.j()).c;
                int iE = h.e(bArr, 0);
                int i4 = b;
                int i5 = i4 & 57;
                int i6 = -(-(i4 | 57));
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                int i8 = i7 % 2;
                R.bDk bdk = new R.bDk(S.c.get(Integer.valueOf(iE)));
                bdk.d = ivas.gov.bisp.enumeration.cC.v.d(bArr);
                R r = new R(bdk, null);
                int i9 = a;
                int i10 = ((i9 | 95) << 1) - (((~i9) & 95) | (i9 & (-96)));
                b = i10 % 128;
                int i11 = i10 % 2;
                return r;
            }
            int i12 = a;
            int i13 = i12 & 119;
            int i14 = (((i12 | 119) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                c0278x = aVarH.e.c;
                oJ = cVar.j();
                int i15 = 98 / 0;
            } else {
                c0278x = aVarH.e.c;
                oJ = cVar.j();
            }
            N nH = N.h(oJ);
            R.bDk bdk2 = new R.bDk(new S(aVarH.d, ivas.gov.bisp.enumeration.cC.P.c(z.b(c0278x).c())));
            byte[] bArr2 = nH.c;
            int i16 = b;
            int i17 = (i16 & 29) + (i16 | 29);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                bdk2.c = ivas.gov.bisp.enumeration.cC.v.d(j.c(bArr2));
                int i18 = 24 / 0;
            } else {
                bdk2.c = ivas.gov.bisp.enumeration.cC.v.d(j.c(bArr2));
            }
            int i19 = b;
            int i20 = ((i19 | 39) << 1) - (i19 ^ 39);
            a = i20 % 128;
            int i21 = i20 % 2;
            bdk2.b = ivas.gov.bisp.enumeration.cC.v.d(j.c(nH.d));
            R r2 = new R(bdk2, null);
            int i22 = a + 71;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                return r2;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static r b(c cVar) throws IOException {
        ivas.gov.bisp.enumeration.p069co.j jVar;
        Map map;
        C0278x c0278x;
        int i = 2 % 2;
        int i2 = b + 13;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            jVar = cVar.c;
            map = c;
            c0278x = jVar.c;
            int i3 = 18 / 0;
        } else {
            jVar = cVar.c;
            map = c;
            c0278x = jVar.c;
        }
        bCm bcm = (bCm) ((HashMap) map).get(c0278x);
        int i4 = b;
        int i5 = ((i4 & 66) + (i4 | 66)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        if (bcm == null) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("algorithm identifier in public key not recognised: ");
            sbW.append(jVar.c);
            throw new IOException(sbW.toString());
        }
        int i7 = i4 & 37;
        int i8 = (i4 ^ 37) | i7;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        r rVarD = bcm.d(cVar, null);
        int i11 = b;
        int i12 = (i11 & (-96)) | ((~i11) & 95);
        int i13 = -(-((i11 & 95) << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        return rVarD;
    }

    public static class bCp extends bCm {
        private static int a = 0;
        private static int b = 1;

        public bCp(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 75) | (i2 & 75)) << 1) - (~(-(((~i2) & 75) | (i2 & (-76)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            ivas.gov.bisp.enumeration.p069co.j jVar = cVar.c;
            Map map = z.c;
            C0278x c0278x = jVar.c;
            int i5 = a;
            int i6 = i5 & 93;
            int i7 = (((i5 | 93) & (~i6)) - (~(i6 << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            ivas.gov.bisp.enumeration.p079cy.r rVar = new ivas.gov.bisp.enumeration.p079cy.r(((Integer) ((HashMap) map).get(c0278x)).intValue(), cVar.d.p());
            int i9 = b + 73;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return rVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static class bCs extends bCm {
        private static int a = 0;
        private static int b = 1;

        public bCs(bCl bcl) {
            super(null);
        }

        @Override // ivas.gov.bisp.enumeration.cx.p.bCm
        public r d(c cVar, Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 29;
            int i4 = (((i2 ^ 29) | i3) << 1) - ((i2 | 29) & (~i3));
            b = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                o.h(cVar.c.d);
                obj2.hashCode();
                throw null;
            }
            o oVarH = o.h(cVar.c.d);
            if (oVarH == null) {
                byte[] bArr = M.p(cVar.j()).c;
                int i5 = a;
                int i6 = i5 | 41;
                int i7 = (i6 << 1) - ((~(i5 & 41)) & i6);
                b = i7 % 128;
                int i8 = i7 % 2;
                C0235m.bDg bdg = new C0235m.bDg(ivas.gov.bisp.enumeration.cC.M.c.get(Integer.valueOf(h.e(bArr, 0))));
                bdg.d = ivas.gov.bisp.enumeration.cC.v.d(bArr);
                C0235m c0235m = new C0235m(bdg, null);
                int i9 = b + 19;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    return c0235m;
                }
                obj2.hashCode();
                throw null;
            }
            int i10 = b;
            int i11 = ((i10 | 63) << 1) - (i10 ^ 63);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                C0278x c0278x = oVarH.f.c;
                N.h(cVar.j());
                throw null;
            }
            C0278x c0278x2 = oVarH.f.c;
            N nH = N.h(cVar.j());
            int i12 = b;
            int i13 = i12 ^ 117;
            int i14 = ((((i12 & 117) | i13) << 1) - (~(-i13))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            C0235m.bDg bdg2 = new C0235m.bDg(new ivas.gov.bisp.enumeration.cC.M(oVarH.d, oVarH.e, ivas.gov.bisp.enumeration.cC.P.c(z.b(c0278x2).c())));
            byte[] bArr2 = nH.c;
            int i16 = b;
            int i17 = i16 & 101;
            int i18 = (((i16 ^ 101) | i17) << 1) - ((i16 | 101) & (~i17));
            a = i18 % 128;
            int i19 = i18 % 2;
            bdg2.c = ivas.gov.bisp.enumeration.cC.v.d(j.c(bArr2));
            int i20 = a;
            int i21 = i20 & 67;
            int i22 = i21 + ((i20 ^ 67) | i21);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                bdg2.b = ivas.gov.bisp.enumeration.cC.v.d(j.c(nH.d));
                int i23 = 81 / 0;
            } else {
                bdg2.b = ivas.gov.bisp.enumeration.cC.v.d(j.c(nH.d));
            }
            C0235m c0235m2 = new C0235m(bdg2, null);
            int i24 = b;
            int i25 = i24 | 65;
            int i26 = i25 << 1;
            int i27 = -((~(i24 & 65)) & i25);
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            if (i28 % 2 == 0) {
                return c0235m2;
            }
            obj2.hashCode();
            throw null;
        }
    }
}
