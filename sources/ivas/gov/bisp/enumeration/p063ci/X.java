package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class X extends AbstractC0276v {
    private static int a = 1;
    private static int b;

    public X(boolean z, int i, i iVar) {
        super(z, i, iVar);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = (((i2 | 9) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iJ = this.e.f().j();
        int i6 = a + 104;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (!this.d) {
            int iC = az.c(this.c);
            int i9 = a;
            int i10 = i9 & 37;
            int i11 = -(-((i9 ^ 37) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            int i15 = (iC - (~(iJ - 1))) - 1;
            int i16 = i13 & 87;
            int i17 = (i13 ^ 87) | i16;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            return i15;
        }
        int i20 = a;
        int i21 = ((i20 ^ 34) + ((i20 & 34) << 1)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
        int iC2 = az.c(this.c);
        int iB = az.b(iJ);
        int i23 = b + 117;
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        int i26 = -(-iC2);
        int i27 = (iB ^ i26) + ((i26 & iB) << 1);
        int i28 = (((~iJ) & i27) | ((~i27) & iJ)) + ((iJ & i27) << 1);
        int i29 = (((i24 | 24) << 1) - (i24 ^ 24)) - 1;
        b = i29 % 128;
        int i30 = i29 % 2;
        return i28;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z2 = this.d;
            throw null;
        }
        if (this.d) {
            int i4 = b;
            int i5 = (i4 & 9) + (i4 | 9);
            a = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = a;
            int i8 = i7 & 67;
            int i9 = (i8 - (~(-(-((i7 ^ 67) | i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            if (!(!this.e.f().l())) {
                int i11 = b;
                int i12 = (i11 & 9) + (i11 | 9);
                a = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                int i14 = a;
                int i15 = i14 ^ 125;
                int i16 = ((i14 & 125) | i15) << 1;
                int i17 = -i15;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                int i20 = i14 + 73;
                b = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            }
        }
        int i22 = a;
        int i23 = i22 ^ 23;
        int i24 = (i22 & 23) << 1;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        int i26 = i25 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:27:0x00df  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0117  */
    /* JADX WARN: Code duplicated, block: B:9:0x0046  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        i iVar;
        S s;
        int i2;
        Enumeration enumerationR;
        C0273s c0273s;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 ^ 15;
        int i7 = ((((i5 & 15) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        aVar.z(z, 160, this.c);
        int i9 = b;
        int i10 = (((i9 ^ 113) | (i9 & 113)) << 1) - (((~i9) & 113) | (i9 & (-114)));
        a = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        aVar.r(128);
        if (i11 == 0) {
            int i12 = 68 / 0;
            if (this.d) {
                aVar.A(this.e.f(), true);
                int i13 = b + 123;
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                i = b + 53;
                a = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = this.e instanceof M;
                    obj.hashCode();
                    throw null;
                }
                iVar = this.e;
                if (!(!(iVar instanceof M))) {
                    if (!(iVar instanceof C0273s)) {
                        c0273s = new C0273s(((M) iVar).c);
                        int i15 = b;
                        i3 = (i15 ^ 117) + ((i15 & 117) << 1);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            enumerationR = c0273s.u();
                            int i16 = 0 / 0;
                        } else {
                            enumerationR = c0273s.u();
                        }
                    } else {
                        int i17 = a;
                        int i18 = i17 & 77;
                        int i19 = i18 + ((i17 ^ 77) | i18);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        enumerationR = ((C0273s) iVar).u();
                        int i21 = a;
                        int i22 = (i21 & 3) + (i21 | 3);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                    }
                } else if (iVar instanceof Q) {
                    int i24 = a;
                    int i25 = i24 & 107;
                    int i26 = -(-(i24 | 107));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    enumerationR = ((Q) iVar).r();
                    int i29 = a + 25;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    if (iVar instanceof L) {
                        StringBuilder sbW = j.w("not implemented: ");
                        sbW.append(this.e.getClass().getName());
                        throw new P(sbW.toString());
                    }
                    L l = (L) iVar;
                    Objects.requireNonNull(l);
                    s = new S(l);
                    i2 = b + 19;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    enumerationR = s;
                }
                aVar.t(enumerationR);
                int i31 = b;
                int i32 = (i31 ^ 3) + ((i31 & 3) << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
            }
        } else if (!this.d) {
            i = b + 53;
            a = i % 128;
            if (i % 2 != 0) {
                boolean z3 = this.e instanceof M;
                obj.hashCode();
                throw null;
            }
            iVar = this.e;
            if (!(!(iVar instanceof M))) {
                if (!(iVar instanceof C0273s)) {
                    c0273s = new C0273s(((M) iVar).c);
                    int i110 = b;
                    i3 = (i110 ^ 117) + ((i110 & 117) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        enumerationR = c0273s.u();
                        int i111 = 0 / 0;
                    } else {
                        enumerationR = c0273s.u();
                    }
                } else {
                    int i112 = a;
                    int i113 = i112 & 77;
                    int i114 = i113 + ((i112 ^ 77) | i113);
                    b = i114 % 128;
                    int i210 = i114 % 2;
                    enumerationR = ((C0273s) iVar).u();
                    int i211 = a;
                    int i212 = (i211 & 3) + (i211 | 3);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                }
            } else if (iVar instanceof Q) {
                int i214 = a;
                int i215 = i214 & 107;
                int i216 = -(-(i214 | 107));
                int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                b = i217 % 128;
                int i218 = i217 % 2;
                enumerationR = ((Q) iVar).r();
                int i219 = a + 25;
                b = i219 % 128;
                int i34 = i219 % 2;
            } else {
                if (iVar instanceof L) {
                    StringBuilder sbW2 = j.w("not implemented: ");
                    sbW2.append(this.e.getClass().getName());
                    throw new P(sbW2.toString());
                }
                L l2 = (L) iVar;
                Objects.requireNonNull(l2);
                s = new S(l2);
                i2 = b + 19;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                enumerationR = s;
            }
            aVar.t(enumerationR);
            int i35 = b;
            int i36 = (i35 ^ 3) + ((i35 & 3) << 1);
            a = i36 % 128;
            int i37 = i36 % 2;
        } else {
            aVar.A(this.e.f(), true);
            int i115 = b + 123;
            a = i115 % 128;
            int i116 = i115 % 2;
        }
        aVar.r(0);
        aVar.r(0);
        int i38 = a + 31;
        b = i38 % 128;
        if (i38 % 2 != 0) {
            throw null;
        }
    }
}
