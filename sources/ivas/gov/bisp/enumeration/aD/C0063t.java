package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0000Ooo;
import ivas.gov.bisp.enumeration.o000O000.o000OOo0;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0063t implements ag {
    private static int a = 1;
    private static int b;
    public final P c;
    public int d;
    public int e;
    public int f = 0;

    public C0063t(P p) {
        Charset charset = R.c;
        this.c = p;
        p.e = this;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final boolean L() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        ac(0);
        boolean zF = this.c.f();
        int i4 = a;
        int i5 = i4 & 77;
        int i6 = (((i4 | 77) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return zF;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void N(List<String> list) throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 113) + (i2 | 113);
        a = i3 % 128;
        int i4 = i3 % 2;
        Q(list, false);
        int i5 = b;
        int i6 = ((i5 & (-86)) | ((~i5) & 85)) + ((i5 & 85) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void ab(int i) throws C0065v {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 13;
        a = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 7) != 0) {
            throw C0065v.j();
        }
        int i6 = ((i3 & 90) + (i3 | 90)) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void ad(int i) throws C0065v {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 103;
        int i5 = (i3 | 103) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (this.c.h() != i) {
            throw C0065v.c();
        }
        int i9 = a;
        int i10 = i9 & 125;
        int i11 = (i9 | 125) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r5 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r5 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (((r5 & r2) | (r5 ^ r2)) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r5 & 3) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r5 = ((r1 & (-16)) | ((~r1) & 15)) + ((r1 & 15) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(int r5) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0063t.a
            r2 = r1 & 111(0x6f, float:1.56E-43)
            r3 = r1 ^ 111(0x6f, float:1.56E-43)
            r3 = r3 | r2
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L22
            r2 = r5 & 3
            int r3 = ~r2
            r5 = r5 | 3
            r5 = r5 & r3
            r3 = r5 ^ r2
            r5 = r5 & r2
            r5 = r5 | r3
            if (r5 != 0) goto L3d
            goto L26
        L22:
            r5 = r5 & 3
            if (r5 != 0) goto L3d
        L26:
            r5 = r1 & (-16)
            int r2 = ~r1
            r2 = r2 & 15
            r5 = r5 | r2
            r1 = r1 & 15
            int r1 = r1 << 1
            int r5 = r5 + r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L3c
            r5 = 64
            int r5 = r5 / 0
        L3c:
            return
        L3d:
            ivas.gov.bisp.enumeration.aD.v r5 = ivas.gov.bisp.enumeration.aD.C0065v.j()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.ae(int):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void c(List<String> list) throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 107) | (i2 & 107)) << 1) - (~(-(((~i2) & 107) | (i2 & (-108)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Q(list, true);
        int i5 = a;
        int i6 = i5 & 21;
        int i7 = (i5 ^ 21) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final AbstractC0069z d() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 73) - (~(-(-(i2 | 73))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            ac(2);
        } else {
            ac(2);
        }
        AbstractC0069z abstractC0069zL = this.c.l();
        int i4 = a;
        int i5 = i4 & 57;
        int i6 = ((i4 | 57) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return abstractC0069zL;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int getTag() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = (i2 ^ 19) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.d;
        int i8 = (i2 & 45) + (i2 | 45);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final boolean s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 85) + (i2 | 85);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!this.c.i()) {
            int i5 = a;
            int i6 = i5 & 73;
            int i7 = (i6 - (~((i5 ^ 73) | i6))) - 1;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i8 = this.d;
            if (i8 != this.e) {
                boolean zC = this.c.C(i8);
                int i9 = b;
                int i10 = i9 & 27;
                int i11 = -(-(i9 | 27));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 73 / 0;
                }
                return zC;
            }
        }
        int i14 = a;
        int i15 = ((i14 ^ 119) | (i14 & 119)) << 1;
        int i16 = -(((~i14) & 119) | (i14 & (-120)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 23 / 0;
        }
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final long E() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 103;
        int i4 = ((i2 & 103) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            ac(0);
        } else {
            ac(0);
        }
        return this.c.t();
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final String F() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 64) + (i2 | 64);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            ac(5);
        } else {
            ac(2);
        }
        String strY = this.c.y();
        int i5 = b;
        int i6 = (((i5 | 114) << 1) - (i5 ^ 114)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return strY;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final String G() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 ^ 27) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ac(2);
        String strZ = this.c.z();
        int i7 = b;
        int i8 = (i7 & (-80)) | ((~i7) & 79);
        int i9 = (i7 & 79) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return strZ;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int H() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i2 ^ 51) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ac(5);
        } else {
            ac(5);
        }
        return this.c.p();
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final long P() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b + 39;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            ac(0);
        } else {
            ac(1);
        }
        return this.c.u();
    }

    public final void ac(int i) throws C0065v.bkY {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 25) << 1) - (i3 ^ 25);
        b = i4 % 128;
        int i5 = i4 % 2;
        if ((this.d & 7) != i) {
            throw C0065v.g();
        }
        int i6 = i3 & 35;
        int i7 = i3 | 35;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final <T> T e(o000OOo0<T> o000ooo0, J j) throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 39) + (i2 | 39);
        b = i3 % 128;
        ac(i3 % 2 != 0 ? 5 : 3);
        return (T) Z(o000ooo0, j);
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int f() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            ac(0);
        } else {
            ac(0);
        }
        int iN = this.c.n();
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = (i3 | 3) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return iN;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int h() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = -(-((i2 ^ 63) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ac(0);
        int iR = this.c.r();
        int i7 = b;
        int i8 = (-2) - ((((i7 | 4) << 1) - (i7 ^ 4)) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        return iR;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int n() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = -(-((i2 ^ 91) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ac(0);
        int iB = this.c.B();
        int i7 = b;
        int i8 = ((i7 ^ 46) + ((i7 & 46) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return iB;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final long o() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 99) | (i2 & 99)) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ac(0);
        long jA = this.c.A();
        int i7 = b;
        int i8 = ((i7 ^ 112) + ((i7 & 112) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return jA;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final long p() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i2 | 3) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ac(1);
        long jO = this.c.o();
        int i8 = a;
        int i9 = i8 & 77;
        int i10 = ((i8 ^ 77) | i9) << 1;
        int i11 = -((i8 | 77) & (~i9));
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return jO;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final <T> T q(o000OOo0<T> o000ooo0, J j) throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = i3 + ((i2 ^ 27) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        ac(2);
        T t = (T) aa(o000ooo0, j);
        int i6 = b;
        int i7 = (i6 ^ 67) + ((i6 & 67) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return t;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final <K, V> void r(Map<K, V> map, o0000Ooo.OooO00o<K, V> oooO00o, J j) throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        ac(2);
        int iB = this.c.B();
        int i4 = a + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.k(iB);
        int i6 = a;
        int i7 = i6 & 71;
        int i8 = -(-((i6 ^ 71) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final double readDouble() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b + 23;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            ac(0);
        } else {
            ac(1);
        }
        return this.c.m();
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final float readFloat() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 63;
        int i4 = -(-((i2 & 63) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            ac(4);
        } else {
            ac(5);
        }
        return this.c.q();
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int t() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b + 21;
        a = i2 % 128;
        int i3 = i2 % 2;
        ac(0);
        int iX = this.c.x();
        int i4 = a;
        int i5 = ((i4 ^ 117) - (~((i4 & 117) << 1))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return iX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final <T> void u(List<T> list, o000OOo0<T> o000ooo0, J j) throws C0065v.bkY {
        int iV;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i2 | 3) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.d;
        if ((i8 & 7) != 2) {
            throw C0065v.g();
        }
        while (true) {
            list.add(aa(o000ooo0, j));
            int i9 = b;
            int i10 = i9 & 11;
            int i11 = (((i9 | 11) & (~i10)) - (~(i10 << 1))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            if (this.c.i()) {
                break;
            }
            int i13 = b;
            int i14 = i13 ^ 33;
            int i15 = ((i13 & 33) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.f != 0) {
                break;
            }
            int i18 = i13 + 123;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                iV = this.c.v();
                int i19 = 81 / 0;
                if (iV != i8) {
                    this.f = iV;
                    int i20 = b;
                    int i21 = i20 & 93;
                    int i22 = (i21 - (~(-(-((i20 ^ 93) | i21))))) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    break;
                }
            } else {
                iV = this.c.v();
                if (iV != i8) {
                    this.f = iV;
                    int i24 = b;
                    int i25 = i24 & 93;
                    int i26 = (i25 - (~(-(-((i24 ^ 93) | i25))))) - 1;
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    break;
                }
            }
        }
        int i28 = a;
        int i29 = i28 & 75;
        int i30 = (i28 ^ 75) | i29;
        int i31 = (i29 & i30) + (i30 | i29);
        b = i31 % 128;
        if (i31 % 2 != 0) {
            int i32 = 82 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int x() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = a + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        ac(5);
        int iS = this.c.s();
        int i4 = b;
        int i5 = ((i4 | 51) << 1) - (((~i4) & 51) | (i4 & (-52)));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return iS;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final long y() throws C0065v.bkY {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 30) + (i2 | 30)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            ac(1);
        } else {
            ac(0);
        }
        return this.c.w();
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final int M() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 23;
        int i4 = -(-((i2 & 23) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.f;
        if (i7 != 0) {
            int i8 = ((i6 & (-8)) | ((~i6) & 7)) + ((i6 & 7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.d = i7;
            this.f = 0;
        } else {
            this.d = this.c.v();
            int i10 = a + 49;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = this.d;
        if (i12 != 0) {
            int i13 = a;
            int i14 = (i13 & (-10)) | ((~i13) & 9);
            int i15 = -(-((i13 & 9) << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i12 != this.e) {
                int i17 = (((i13 | 36) << 1) - (i13 ^ 36)) - 1;
                int i18 = i17 % 128;
                b = i18;
                int i19 = i17 % 2;
                int i20 = i12 >>> 3;
                int i21 = ((i18 | 48) << 1) - (i18 ^ 48);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                return i20;
            }
        }
        int i24 = b;
        int i25 = ((i24 | 7) << 1) - (i24 ^ 7);
        a = i25 % 128;
        int i26 = i25 % 2;
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r8 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r8 = (((r1 | 42) << 1) - (r1 ^ 42)) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if ((r8 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r8 = r7.c.B();
        r1 = r7.c.h();
        r4 = 70 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r8 = r7.c.B();
        r1 = r7.c.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r5 = (r4 & (-4)) | ((~r4) & 3);
        r4 = -(-((r4 & 3) << 1));
        r6 = (r5 ^ r4) + ((r4 & r5) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if ((r6 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r8 = -(~r8);
        r4 = (((r1 | r8) << 1) - (r8 ^ r1)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r4 = (r1 - (~r8)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r2.f(r7.c.A());
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = (r8 & 45) + (r8 | 45);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7.c.h() < r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = (r8 & 35) + (r8 | 35);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        ad(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        ad(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r2.f(r7.c.A());
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a + 27;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r7.c.i() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = r8 ^ 95;
        r8 = (((r8 & 95) | r1) << 1) - r1;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if ((r8 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        r8 = r7.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        if (r8 == r7.d) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r2 = r1 + 43;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
        r2 = r2 % 2;
        r7.f = r8;
        r8 = (r1 ^ 99) + ((r1 & 99) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        if ((r8 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r8 != 0) goto L12;
     */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<java.lang.Long> r8) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.b(java.util.List):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void z(List<AbstractC0069z> list) throws C0065v.bkY {
        int iV;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = (i2 | 9) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        if ((this.d & 7) != 2) {
            throw C0065v.g();
        }
        do {
            list.add(d());
            if (this.c.i()) {
                int i8 = a;
                int i9 = (i8 ^ 73) + ((i8 & 73) << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                return;
            }
            iV = this.c.v();
        } while (iV == this.d);
        int i10 = a;
        int i11 = (i10 | 83) << 1;
        int i12 = -(((~i10) & 83) | (i10 & (-84)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        this.f = iV;
        int i16 = i14 & 109;
        int i17 = i16 + ((i14 ^ 109) | i16);
        a = i17 % 128;
        int i18 = i17 % 2;
    }

    public final <T> T Z(o000OOo0<T> o000ooo0, J j) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 68) << 1) - (i4 ^ 68)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            i = this.e;
            i2 = this.d >>> 2;
        } else {
            i = this.e;
            i2 = this.d >>> 3;
        }
        int i6 = i2 << 3;
        int i7 = (i6 & (-5)) | ((~i6) & 4);
        int i8 = i6 & 4;
        this.e = (i8 & i7) | (i7 ^ i8);
        try {
            T t = (T) o000ooo0.n();
            int i9 = b;
            int i10 = (i9 & 1) + (i9 | 1);
            a = i10 % 128;
            Object obj = null;
            if (i10 % 2 == 0) {
                o000ooo0.d(t, this, j);
                obj.hashCode();
                throw null;
            }
            o000ooo0.d(t, this, j);
            o000ooo0.h(t);
            int i11 = this.d;
            int i12 = b;
            int i13 = i12 & 77;
            int i14 = (~i13) & (i12 | 77);
            int i15 = i13 << 1;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i11 != this.e) {
                throw C0065v.j();
            }
            int i17 = (i12 & 109) + (i12 | 109);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                this.e = i;
                int i18 = 8 / 0;
            } else {
                this.e = i;
            }
            return t;
        } catch (Throwable th) {
            this.e = i;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((!r7.c.i()) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r5 = r2 ^ 11;
        r2 = (r2 & 11) << 1;
        r6 = (r5 ^ r2) + ((r2 & r5) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r6 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r2 = r7.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r2 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r9 = ((r8 & 44) + (r8 | 44)) - 1;
        r8 = r9 % 128;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8;
        r9 = r9 % 2;
        r7.f = r2;
        r9 = r8 & 111;
        r8 = ((r8 | 111) & (~r9)) + (r9 << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r9 = (r8 ^ 69) + ((r8 & 69) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if ((r9 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (((r3 | (r1 ^ 123)) & (~r3)) == 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((r1 & 7) == 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r8.add(Z(r9, r10));
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r3 = (r2 ^ 23) + ((r2 & 23) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r3 % 128;
        r3 = r3 % 2;
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void O(java.util.List<T> r8, ivas.gov.bisp.enumeration.o000O000.o000OOo0<T> r9, ivas.gov.bisp.enumeration.aD.J r10) throws ivas.gov.bisp.enumeration.aD.C0065v.bkY {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0063t.b
            int r1 = r1 + 39
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.a = r2
            int r1 = r1 % r0
            r2 = 3
            if (r1 != 0) goto L1b
            int r1 = r7.d
            r3 = r1 & 123(0x7b, float:1.72E-43)
            int r4 = ~r3
            r5 = r1 ^ 123(0x7b, float:1.72E-43)
            r3 = r3 | r5
            r3 = r3 & r4
            if (r3 != r2) goto L93
            goto L21
        L1b:
            int r1 = r7.d
            r3 = r1 & 7
            if (r3 != r2) goto L93
        L21:
            java.lang.Object r2 = r7.Z(r9, r10)
            r8.add(r2)
            int r2 = ivas.gov.bisp.enumeration.aD.C0063t.a
            r3 = r2 ^ 23
            r2 = r2 & 23
            r4 = 1
            int r2 = r2 << r4
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r2
            int r3 = r3 % 2
            ivas.gov.bisp.enumeration.aD.P r2 = r7.c
            boolean r2 = r2.i()
            r2 = r2 ^ r4
            r3 = 0
            if (r2 == r4) goto L42
            goto L7e
        L42:
            int r2 = ivas.gov.bisp.enumeration.aD.C0063t.a
            r5 = r2 ^ 11
            r2 = r2 & 11
            int r2 = r2 << r4
            r6 = r5 ^ r2
            r2 = r2 & r5
            int r2 = r2 << r4
            int r6 = r6 + r2
            int r2 = r6 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r2
            int r6 = r6 % r0
            if (r6 != 0) goto L8f
            int r2 = r7.f
            if (r2 != 0) goto L7e
            ivas.gov.bisp.enumeration.aD.P r2 = r7.c
            int r2 = r2.v()
            if (r2 == r1) goto L21
            int r8 = ivas.gov.bisp.enumeration.aD.C0063t.a
            r9 = r8 & 44
            r8 = r8 | 44
            int r9 = r9 + r8
            int r9 = r9 + (-1)
            int r8 = r9 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r8
            int r9 = r9 % r0
            r7.f = r2
            r9 = r8 & 111(0x6f, float:1.56E-43)
            int r10 = ~r9
            r8 = r8 | 111(0x6f, float:1.56E-43)
            r8 = r8 & r10
            int r9 = r9 << r4
            int r8 = r8 + r9
            int r9 = r8 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.a = r9
            int r8 = r8 % r0
        L7e:
            int r8 = ivas.gov.bisp.enumeration.aD.C0063t.a
            r9 = r8 ^ 69
            r8 = r8 & 69
            int r8 = r8 << r4
            int r9 = r9 + r8
            int r8 = r9 % 128
            ivas.gov.bisp.enumeration.aD.C0063t.b = r8
            int r9 = r9 % r0
            if (r9 != 0) goto L8e
            return
        L8e:
            throw r3
        L8f:
            r3.hashCode()
            throw r3
        L93:
            ivas.gov.bisp.enumeration.aD.v$bkY r8 = ivas.gov.bisp.enumeration.aD.C0065v.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.O(java.util.List, ivas.gov.bisp.enumeration.aD.ah, ivas.gov.bisp.enumeration.aD.J):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void K(List<Integer> list) throws C0065v {
        int iV;
        int iV2;
        int iB;
        int iH;
        P p;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 102) + (i2 | 102);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            boolean z = list instanceof L;
            throw null;
        }
        if (list instanceof L) {
            L l = (L) list;
            int i6 = this.d & 7;
            int i7 = (-2) - ((i5 + 96) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i6 == 0) {
                do {
                    l.f(this.c.r());
                    P p2 = this.c;
                    int i8 = b + 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    if (p2.i()) {
                        int i10 = b;
                        int i11 = ((i10 | 67) << 1) - (i10 ^ 67);
                        a = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 13 / 0;
                            return;
                        }
                        return;
                    }
                    iV2 = this.c.v();
                } while (iV2 == this.d);
                int i13 = a;
                int i14 = ((i13 ^ 84) + ((i13 & 84) << 1)) - 1;
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                this.f = iV2;
                int i17 = i15 + 113;
                a = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
            int i19 = i5 & 75;
            int i20 = -(-(i5 | 75));
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            b = i22;
            if (i21 % 2 == 0 ? i6 != 2 : i6 != 4) {
                throw C0065v.g();
            }
            int i23 = (i22 & 45) + (i22 | 45);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                iB = this.c.B();
                iH = this.c.h();
                int i24 = 74 / 0;
            } else {
                iB = this.c.B();
                iH = this.c.h();
            }
            int i25 = b;
            int i26 = i25 + 22;
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = -(~(-(-iB)));
            int i30 = (((iH | i29) << 1) - (i29 ^ iH)) - 1;
            int i31 = i25 + 20;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
            do {
                l.f(this.c.r());
                p = this.c;
                int i34 = b;
                int i35 = ((i34 ^ 36) + ((i34 & 36) << 1)) - 1;
                a = i35 % 128;
                int i36 = i35 % 2;
            } while (p.h() < i30);
            int i37 = b;
            int i38 = i37 & 87;
            int i39 = (i38 - (~(-(-((i37 ^ 87) | i38))))) - 1;
            a = i39 % 128;
            int i40 = i39 % 2;
            ad(i30);
            int i41 = a;
            int i42 = (-2) - (((i41 ^ 48) + ((i41 & 48) << 1)) ^ (-1));
            b = i42 % 128;
            int i43 = i42 % 2;
            return;
        }
        int i44 = this.d & 7;
        if (i44 == 0) {
            do {
                Integer numValueOf = Integer.valueOf(this.c.r());
                int i45 = a;
                int i46 = ((i45 ^ 73) | (i45 & 73)) << 1;
                int i47 = -(((~i45) & 73) | (i45 & (-74)));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                b = i48 % 128;
                int i49 = i48 % 2;
                list.add(numValueOf);
                if (this.c.i()) {
                    int i50 = a + 95;
                    b = i50 % 128;
                    if (i50 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i51 = b;
            int i52 = i51 + 33;
            a = i52 % 128;
            int i53 = i52 % 2;
            this.f = iV;
            int i54 = i51 & 95;
            int i55 = (i51 ^ 95) | i54;
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            a = i56 % 128;
            if (i56 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i57 = i5 + 80;
        int i58 = (i57 ^ (-1)) + (i57 << 1);
        b = i58 % 128;
        int i59 = i58 % 2;
        if (i44 != 2) {
            throw C0065v.g();
        }
        int i60 = i5 & 1;
        int i61 = ((i5 ^ 1) | i60) << 1;
        int i62 = -((i5 | 1) & (~i60));
        int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
        b = i63 % 128;
        int i64 = i63 % 2;
        int iB2 = this.c.B();
        int iH2 = this.c.h();
        int i65 = a;
        int i66 = ((((i65 ^ 93) | (i65 & 93)) << 1) - (~(-(((~i65) & 93) | (i65 & (-94)))))) - 1;
        int i67 = i66 % 128;
        b = i67;
        int i68 = i66 % 2;
        int i69 = iH2 ^ iB2;
        int i70 = (iB2 & iH2) << 1;
        int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
        int i72 = i67 & 45;
        int i73 = (((i67 ^ 45) | i72) << 1) - ((i67 | 45) & (~i72));
        a = i73 % 128;
        int i74 = i73 % 2;
        do {
            list.add(Integer.valueOf(this.c.r()));
            int i75 = b;
            int i76 = ((i75 & 88) + (i75 | 88)) - 1;
            a = i76 % 128;
            int i77 = i76 % 2;
        } while (this.c.h() < i71);
        int i78 = b;
        int i79 = i78 | 67;
        int i80 = i79 << 1;
        int i81 = -((~(i78 & 67)) & i79);
        int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
        a = i82 % 128;
        int i83 = i82 % 2;
        ad(i71);
        int i84 = b;
        int i85 = i84 & 49;
        int i86 = -(-((i84 ^ 49) | i85));
        int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
        a = i87 % 128;
        int i88 = i87 % 2;
    }

    public final <T> T aa(o000OOo0<T> o000ooo0, J j) throws C0065v {
        int iB;
        P p;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = ((i2 ^ 49) | i3) << 1;
        int i5 = -((i2 | 49) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            iB = this.c.B();
            p = this.c;
            int i7 = 58 / 0;
        } else {
            iB = this.c.B();
            p = this.c;
        }
        int i8 = a;
        int i9 = (i8 ^ 77) + ((i8 & 77) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        if (p.c >= p.d) {
            throw new C0065v("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i11 = b;
        int i12 = i11 & 45;
        int i13 = (i11 ^ 45) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        int iK = p.k(iB);
        T t = (T) o000ooo0.n();
        int i16 = b;
        int i17 = (i16 ^ 115) + ((i16 & 115) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        P p2 = this.c;
        int i19 = p2.c;
        int i20 = b;
        int i21 = ((i20 ^ 18) + ((i20 & 18) << 1)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = i19 & 1;
        p2.c = (i23 - (~(-(-((i19 ^ 1) | i23))))) - 1;
        o000ooo0.d(t, this, j);
        int i24 = a;
        int i25 = ((((i24 ^ 15) | (i24 & 15)) << 1) - (~(-(((~i24) & 15) | (i24 & (-16)))))) - 1;
        b = i25 % 128;
        if (i25 % 2 != 0) {
            o000ooo0.h(t);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o000ooo0.h(t);
        P p3 = this.c;
        int i26 = b + 31;
        a = i26 % 128;
        int i27 = i26 % 2;
        p3.g(0);
        P p4 = this.c;
        int i28 = a;
        int i29 = ((i28 | 91) << 1) - (i28 ^ 91);
        b = i29 % 128;
        int i30 = i29 % 2;
        p4.c--;
        int i31 = a + 19;
        b = i31 % 128;
        int i32 = i31 % 2;
        p4.j(iK);
        int i33 = b + 39;
        a = i33 % 128;
        if (i33 % 2 == 0) {
            int i34 = 51 / 0;
        }
        return t;
    }

    public final void Q(List<String> list, boolean z) throws C0065v.bkY {
        String strF;
        int iV;
        int iV2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 67) + (i2 | 67);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if ((this.d & 7) != 2) {
            throw C0065v.g();
        }
        int i6 = i4 & 35;
        int i7 = -(-(i4 | 35));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        Object obj = null;
        if (list instanceof InterfaceC0062s) {
            int i11 = (i9 | 115) << 1;
            int i12 = -((i9 & (-116)) | ((~i9) & 115));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (!z) {
                int i15 = (i9 ^ 39) + ((i9 & 39) << 1);
                int i16 = i15 % 128;
                b = i16;
                if (i15 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                InterfaceC0062s interfaceC0062s = (InterfaceC0062s) list;
                int i17 = i16 & 3;
                int i18 = (i16 ^ 3) | i17;
                int i19 = (i17 & i18) + (i17 | i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                do {
                    interfaceC0062s.h(d());
                    P p = this.c;
                    int i21 = a;
                    int i22 = i21 & 117;
                    int i23 = i22 + ((i21 ^ 117) | i22);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    if (p.i()) {
                        int i25 = b;
                        int i26 = (-2) - ((((i25 | 78) << 1) - (i25 ^ 78)) ^ (-1));
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        return;
                    }
                    iV2 = this.c.v();
                } while (iV2 == this.d);
                int i28 = a;
                int i29 = (i28 & 49) + (i28 | 49);
                b = i29 % 128;
                int i30 = i29 % 2;
                this.f = iV2;
                int i31 = i28 & 47;
                int i32 = (i28 | 47) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        do {
            if (z) {
                int i35 = b + 33;
                a = i35 % 128;
                int i36 = i35 % 2;
                strF = G();
                int i37 = b;
                int i38 = ((i37 ^ 103) | (i37 & 103)) << 1;
                int i39 = -(((~i37) & 103) | (i37 & (-104)));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
            } else {
                strF = F();
                int i42 = b + 123;
                a = i42 % 128;
                int i43 = i42 % 2;
            }
            list.add(strF);
            P p2 = this.c;
            int i44 = b + 36;
            int i45 = (i44 ^ (-1)) + (i44 << 1);
            a = i45 % 128;
            if (i45 % 2 == 0) {
                p2.i();
                throw null;
            }
            if (p2.i()) {
                int i46 = b;
                int i47 = i46 & 25;
                int i48 = i46 | 25;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                a = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
                return;
            }
            iV = this.c.v();
        } while (iV == this.d);
        int i50 = a;
        int i51 = ((i50 ^ 33) | (i50 & 33)) << 1;
        int i52 = -((i50 & (-34)) | ((~i50) & 33));
        int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
        b = i53 % 128;
        if (i53 % 2 != 0) {
            this.f = iV;
            throw null;
        }
        this.f = iV;
        int i54 = (i50 & 15) + (i50 | 15);
        b = i54 % 128;
        if (i54 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void A(List<Integer> list) throws C0065v {
        int iV;
        int iB;
        int iH;
        int iV2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-20)) | ((~i2) & 19);
        int i4 = (i2 & 19) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (!(list instanceof L)) {
            int i8 = this.d & 7;
            if (i8 == 0) {
                do {
                    list.add(Integer.valueOf(this.c.B()));
                    int i9 = a + 67;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    if (this.c.i()) {
                        int i11 = a;
                        int i12 = i11 & 49;
                        int i13 = -(-((i11 ^ 49) | i12));
                        int i14 = (i12 & i13) + (i13 | i12);
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    iV2 = this.c.v();
                } while (iV2 == this.d);
                int i15 = a;
                int i16 = ((i15 & (-34)) | ((~i15) & 33)) + ((i15 & 33) << 1);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    this.f = iV2;
                    return;
                } else {
                    this.f = iV2;
                    throw null;
                }
            }
            int i17 = i6 & 3;
            int i18 = ((((i6 ^ 3) | i17) << 1) - (~(-((i6 | 3) & (~i17))))) - 1;
            int i19 = i18 % 128;
            b = i19;
            if (i18 % 2 == 0 ? i8 != 2 : i8 != 5) {
                throw C0065v.g();
            }
            int i20 = (i19 & (-120)) | ((~i19) & 119);
            int i21 = -(-((i19 & 119) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                this.c.B();
                this.c.h();
                throw null;
            }
            int iB2 = this.c.B();
            int iH2 = this.c.h();
            int i23 = -(-iB2);
            int i24 = iH2 ^ i23;
            int i25 = -(-((i23 & iH2) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = a;
            int i28 = i27 & 101;
            int i29 = i27 | 101;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            do {
                list.add(Integer.valueOf(this.c.B()));
                int i32 = b;
                int i33 = ((i32 | 71) << 1) - (i32 ^ 71);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    this.c.h();
                    obj.hashCode();
                    throw null;
                }
            } while (this.c.h() < i26);
            ad(i26);
            int i34 = a + 53;
            b = i34 % 128;
            int i35 = i34 % 2;
            return;
        }
        int i36 = i6 & 115;
        int i37 = ((~i36) & (i6 | 115)) + (i36 << 1);
        b = i37 % 128;
        int i38 = i37 % 2;
        L l = (L) list;
        int i39 = this.d & 7;
        if (i39 == 0) {
            do {
                l.f(this.c.B());
                P p = this.c;
                int i40 = a;
                int i41 = i40 & 103;
                int i42 = i41 + ((i40 ^ 103) | i41);
                b = i42 % 128;
                int i43 = i42 % 2;
                if (p.i()) {
                    int i44 = a;
                    int i45 = i44 & 43;
                    int i46 = (i44 | 43) & (~i45);
                    int i47 = -(-(i45 << 1));
                    int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                    b = i48 % 128;
                    int i49 = i48 % 2;
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i50 = a + 37;
            b = i50 % 128;
            int i51 = i50 % 2;
            this.f = iV;
            if (i51 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i52 = ((i6 ^ 82) + ((i6 & 82) << 1)) - 1;
        int i53 = i52 % 128;
        b = i53;
        int i54 = i52 % 2;
        if (i39 != 2) {
            throw C0065v.g();
        }
        int i55 = i53 | 51;
        int i56 = ((i55 << 1) - (~(-((~(i53 & 51)) & i55)))) - 1;
        a = i56 % 128;
        if (i56 % 2 == 0) {
            iB = this.c.B();
            iH = this.c.h();
            int i57 = 31 / 0;
        } else {
            iB = this.c.B();
            iH = this.c.h();
        }
        int i58 = -(~(-(-iB)));
        int i59 = ((iH ^ i58) + ((i58 & iH) << 1)) - 1;
        int i60 = b;
        int i61 = i60 | 43;
        int i62 = ((i61 << 1) - (~(-((~(i60 & 43)) & i61)))) - 1;
        a = i62 % 128;
        int i63 = i62 % 2;
        while (true) {
            l.f(this.c.B());
            P p2 = this.c;
            int i64 = b;
            int i65 = ((i64 | 100) << 1) - (i64 ^ 100);
            int i66 = (i65 ^ (-1)) + (i65 << 1);
            a = i66 % 128;
            if (i66 % 2 == 0) {
                int i67 = 48 / 0;
                if (p2.h() >= i59) {
                    break;
                }
            } else if (p2.h() >= i59) {
                break;
            }
        }
        ad(i59);
        int i68 = b;
        int i69 = i68 & 3;
        int i70 = (i69 - (~(-(-((i68 ^ 3) | i69))))) - 1;
        a = i70 % 128;
        if (i70 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if ((r7 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r1 == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1 == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r4 = (r2 & (-10)) | ((~r2) & 9);
        r7 = -(-((r2 & 9) << 1));
        r8 = (r4 ^ r7) + ((r4 & r7) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if ((r8 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r1 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r1 != 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r1 = r2 & 27;
        r2 = -(-((r2 ^ 27) | r1));
        r4 = ((r1 | r2) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
        r4 = r4 % 2;
        r1 = r9.c.B();
        ab(r1);
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r4 = ((r2 | 121) << 1) - (r2 ^ 121);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if ((r4 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r2 = r9.c.h();
        r4 = ivas.gov.bisp.enumeration.aD.C0063t.a + 37;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r10.f(r9.c.o());
        r4 = r9.c;
        r5 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r6 = r5 & 55;
        r5 = -(-((r5 ^ 55) | r6));
        r7 = (r6 & r5) + (r5 | r6);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r7 % 128;
        r7 = r7 % 2;
        r5 = -(-r1);
        r6 = r2 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r4.h() < ((r6 - (~(-(-((r5 ^ r2) | r6))))) - 1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b + 11;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if ((r10 % 2) != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
    
        r10 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        r9.c.h();
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        r10.f(r9.c.o());
        r1 = r9.c;
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r4 = (r2 ^ 69) + ((r2 & 69) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        if ((r4 % 2) == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        if (r1.i() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = (r10 ^ 61) + ((r10 & 61) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011f, code lost:
    
        r1 = r9.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        if (r1 == r9.d) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r2 = ((r10 | 89) << 1) - (r10 ^ 89);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0136, code lost:
    
        if ((r2 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
    
        r9.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013b, code lost:
    
        r9.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        r1.i();
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
    
        r2 = r9.d & 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        if (r2 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        r4 = r1 & 103;
        r4 = r4 + ((r1 ^ 103) | r4);
        r1 = r4 % 128;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        if (r2 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
    
        r1 = r1 + 71;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r1 % 128;
        r1 = r1 % 2;
        r1 = r9.c.B();
        ab(r1);
        r2 = r9.c;
        r4 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r5 = (r4 & (-40)) | ((~r4) & 39);
        r4 = -(-((r4 & 39) << 1));
        r7 = ((r5 | r4) << 1) - (r4 ^ r5);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        if ((r7 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0183, code lost:
    
        r4 = r2.h();
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a + 30;
        r5 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
    
        r10.add(java.lang.Long.valueOf(r9.c.o()));
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r5 = ((r2 | 119) << 1) - (r2 ^ 119);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r5 % 128;
        r5 = r5 % 2;
        r5 = -(-r1);
        r7 = r4 & r5;
        r5 = -(-(r5 | r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
    
        if (r9.c.h() < (((r7 | r5) << 1) - (r5 ^ r7))) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c3, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = r10 | 121;
        r2 = (r1 << 1) - ((~(r10 & 121)) & r1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d3, code lost:
    
        if ((r2 % 2) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.aD.W) != true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d7, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        r10.add(java.lang.Long.valueOf(r9.c.o()));
        r1 = ivas.gov.bisp.enumeration.aD.C0063t.b + 43;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
    
        if ((r1 % 2) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f8, code lost:
    
        r2 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        if (r9.c.i() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020b, code lost:
    
        if (r9.c.i() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020d, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = ((r10 ^ 27) | (r10 & 27)) << 1;
        r10 = -(((~r10) & 27) | (r10 & (-28)));
        r2 = (r1 ^ r10) + ((r10 & r1) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0225, code lost:
    
        if ((r2 % 2) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0227, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0228, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x022c, code lost:
    
        r1 = r9.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0234, code lost:
    
        if (r1 == r9.d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0236, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r2 = ((r10 & (-116)) | ((~r10) & 115)) + ((r10 & 115) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r2 % 128;
        r2 = r2 % 2;
        r9.f = r1;
        r1 = r10 & 17;
        r1 = r1 + ((r10 ^ 17) | r1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0255, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((!(r10 instanceof ivas.gov.bisp.enumeration.aD.W)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = ((r2 | 25) << 1) - (r2 ^ 25);
        r2 = r1 % 128;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2;
        r1 = r1 % 2;
        r10 = (ivas.gov.bisp.enumeration.aD.W) r10;
        r1 = r9.d & 7;
        r4 = r2 & 45;
        r2 = (r2 ^ 45) | r4;
        r7 = (r4 & r2) + (r2 | r4);
        r2 = r7 % 128;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r2;
     */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.util.List<java.lang.Long> r10) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.J(java.util.List):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void D(List<Long> list) throws C0065v {
        int iV;
        int i;
        int i2;
        Object obj;
        int iV2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 ^ 115;
        int i7 = (i5 & 115) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (!(list instanceof W)) {
            int i11 = this.d & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.c.u()));
                    int i12 = b;
                    int i13 = i12 & 35;
                    int i14 = ((i12 ^ 35) | i13) << 1;
                    int i15 = -((i12 | 35) & (~i13));
                    int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    if (this.c.i()) {
                        int i18 = b + 63;
                        a = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = 49 / 0;
                            return;
                        }
                        return;
                    }
                    iV = this.c.v();
                } while (iV == this.d);
                int i20 = a;
                int i21 = i20 & 19;
                int i22 = (i20 | 19) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i25 = i24 % 128;
                b = i25;
                int i26 = i24 % 2;
                this.f = iV;
                int i27 = (i25 & 119) + (i25 | 119);
                a = i27 % 128;
                int i28 = i27 % 2;
                return;
            }
            int i29 = (i9 | 65) << 1;
            int i30 = -(i9 ^ 65);
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            int i32 = i31 % 128;
            a = i32;
            int i33 = i31 % 2;
            if (i11 != 2) {
                throw C0065v.g();
            }
            int i34 = (i32 & 51) + (i32 | 51);
            b = i34 % 128;
            int i35 = i34 % 2;
            int iB = this.c.B();
            ab(iB);
            int i36 = b;
            int i37 = i36 ^ 31;
            int i38 = -(-((i36 & 31) << 1));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            a = i39 % 128;
            int i40 = i39 % 2;
            int iH = this.c.h();
            int i41 = b;
            int i42 = i41 & 41;
            int i43 = -(-((i41 ^ 41) | i42));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
            do {
                list.add(Long.valueOf(this.c.u()));
                int i46 = b;
                int i47 = i46 & 93;
                int i48 = (i46 ^ 93) | i47;
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                a = i49 % 128;
                int i50 = i49 % 2;
                i = -(-iB);
                i2 = iH & i;
            } while (this.c.h() < (i2 - (~(-(-((i ^ iH) | i2))))) - 1);
            int i51 = a + 29;
            b = i51 % 128;
            int i52 = i51 % 2;
            return;
        }
        int i53 = (((i9 | 96) << 1) - (i9 ^ 96)) - 1;
        int i54 = i53 % 128;
        a = i54;
        int i55 = i53 % 2;
        W w = (W) list;
        int i56 = this.d & 7;
        if (i56 == 1) {
            do {
                w.f(this.c.u());
                P p = this.c;
                int i57 = b;
                int i58 = ((i57 | 97) << 1) - (i57 ^ 97);
                a = i58 % 128;
                int i59 = i58 % 2;
                obj = null;
                if (p.i()) {
                    int i60 = b;
                    int i61 = ((i60 | 41) << 1) - (i60 ^ 41);
                    a = i61 % 128;
                    if (i61 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                iV2 = this.c.v();
            } while (iV2 == this.d);
            int i62 = b;
            int i63 = i62 ^ 15;
            int i64 = (i62 & 15) << 1;
            int i65 = (i63 & i64) + (i64 | i63);
            int i66 = i65 % 128;
            a = i66;
            int i67 = i65 % 2;
            this.f = iV2;
            int i68 = i66 | 37;
            int i69 = ((i68 << 1) - (~(-(i68 & (~(i66 & 37)))))) - 1;
            b = i69 % 128;
            if (i69 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i70 = i54 & 63;
        int i71 = (((i54 ^ 63) | i70) << 1) - ((~i70) & (i54 | 63));
        b = i71 % 128;
        if (i71 % 2 == 0 ? i56 != 2 : i56 != 3) {
            throw C0065v.g();
        }
        int i72 = i54 + 111;
        b = i72 % 128;
        int i73 = i72 % 2;
        int iB2 = this.c.B();
        ab(iB2);
        int i74 = a;
        int i75 = (i74 & (-102)) | ((~i74) & 101);
        int i76 = (i74 & 101) << 1;
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        b = i77 % 128;
        int i78 = i77 % 2;
        int iH2 = this.c.h();
        int i79 = b;
        int i80 = i79 & 91;
        int i81 = ((i79 ^ 91) | i80) << 1;
        int i82 = -((i79 | 91) & (~i80));
        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
        a = i83 % 128;
        if (i83 % 2 == 0) {
            int i84 = 4 / 3;
        }
        while (true) {
            w.f(this.c.u());
            int iH3 = this.c.h();
            int i85 = (-2) - ((a + 110) ^ (-1));
            i3 = i85 % 128;
            b = i3;
            if (i85 % 2 != 0) {
                if (iH3 >= iH2 * iB2) {
                    break;
                }
            } else if (iH3 >= (iH2 - (~iB2)) - 1) {
                break;
            }
        }
        int i86 = i3 | 65;
        int i87 = i86 << 1;
        int i88 = -(i86 & (~(i3 & 65)));
        int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
        a = i89 % 128;
        if (i89 % 2 == 0) {
            int i90 = 10 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void w(List<Double> list) throws C0065v {
        int iV;
        int iH;
        P p;
        int iV2;
        int iH2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 ^ 85) | (i4 & 85)) << 1) - ((i4 & (-86)) | ((~i4) & 85));
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (!(list instanceof C0045a)) {
            int i8 = this.d & 7;
            if (i8 == 1) {
                do {
                    list.add(Double.valueOf(this.c.m()));
                    int i9 = b + 111;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    if (this.c.i()) {
                        int i11 = b;
                        int i12 = (i11 & (-40)) | ((~i11) & 39);
                        int i13 = -(-((i11 & 39) << 1));
                        int i14 = (i12 & i13) + (i13 | i12);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        return;
                    }
                    iV2 = this.c.v();
                } while (iV2 == this.d);
                int i16 = b;
                int i17 = ((i16 ^ 53) | (i16 & 53)) << 1;
                int i18 = -((i16 & (-54)) | ((~i16) & 53));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                this.f = iV2;
                int i21 = i16 & 9;
                int i22 = ((i16 ^ 9) | i21) << 1;
                int i23 = -((i16 | 9) & (~i21));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 51 / 0;
                    return;
                }
                return;
            }
            int i26 = i4 & 55;
            int i27 = ((~i26) & (i4 | 55)) + (i26 << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            if (i8 != 2) {
                throw C0065v.g();
            }
            int i29 = i4 & 89;
            int i30 = -(-((i4 ^ 89) | i29));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            if (i31 % 2 == 0) {
                ab(this.c.B());
                throw null;
            }
            int iB = this.c.B();
            ab(iB);
            int i32 = (-2) - ((b + 60) ^ (-1));
            a = i32 % 128;
            int i33 = i32 % 2;
            int iH3 = this.c.h();
            int i34 = b;
            int i35 = i34 & 33;
            int i36 = -(-(i34 | 33));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            a = i37 % 128;
            int i38 = i37 % 2;
            do {
                list.add(Double.valueOf(this.c.m()));
                int i39 = a;
                int i40 = i39 & 81;
                int i41 = (i40 - (~((i39 ^ 81) | i40))) - 1;
                b = i41 % 128;
                int i42 = i41 % 2;
                iH2 = this.c.h();
                int i43 = iH3 & iB;
                i = ((iH3 ^ iB) | i43) << 1;
                i2 = -((~i43) & (iH3 | iB));
            } while (iH2 < (i ^ i2) + ((i & i2) << 1));
            int i44 = b + 123;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i45 = i6 & 117;
        int i46 = (i45 - (~(-(-((i6 ^ 117) | i45))))) - 1;
        b = i46 % 128;
        int i47 = i46 % 2;
        C0045a c0045a = (C0045a) list;
        int i48 = this.d & 7;
        int i49 = i6 | 57;
        int i50 = i49 << 1;
        int i51 = -(i49 & (~(i6 & 57)));
        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
        int i53 = i52 % 128;
        b = i53;
        int i54 = i52 % 2;
        if (i48 == 1) {
            do {
                c0045a.f(this.c.m());
                int i55 = b;
                int i56 = ((i55 ^ 117) - (~(-(-((i55 & 117) << 1))))) - 1;
                a = i56 % 128;
                int i57 = i56 % 2;
                if (this.c.i()) {
                    int i58 = a;
                    int i59 = ((i58 ^ 36) + ((i58 & 36) << 1)) - 1;
                    b = i59 % 128;
                    if (i59 % 2 != 0) {
                        int i60 = 20 / 0;
                        return;
                    }
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i61 = b + 37;
            int i62 = i61 % 128;
            a = i62;
            if (i61 % 2 == 0) {
                this.f = iV;
                int i63 = 93 / 0;
            } else {
                this.f = iV;
            }
            int i64 = i62 & 69;
            int i65 = -(-((i62 ^ 69) | i64));
            int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
            b = i66 % 128;
            int i67 = i66 % 2;
            return;
        }
        int i68 = i53 & 7;
        int i69 = -(-((i53 ^ 7) | i68));
        int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
        a = i70 % 128;
        int i71 = i70 % 2;
        if (i48 != 2) {
            throw C0065v.g();
        }
        int i72 = i53 & 41;
        int i73 = (i53 ^ 41) | i72;
        int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
        a = i74 % 128;
        int i75 = i74 % 2;
        int iB2 = this.c.B();
        ab(iB2);
        P p2 = this.c;
        int i76 = b;
        int i77 = (i76 & 15) + (i76 | 15);
        a = i77 % 128;
        if (i77 % 2 == 0) {
            iH = p2.h();
            int i78 = 86 / 0;
        } else {
            iH = p2.h();
        }
        int i79 = a;
        int i80 = i79 ^ 83;
        int i81 = ((i79 & 83) | i80) << 1;
        int i82 = -i80;
        int i83 = (i81 & i82) + (i81 | i82);
        b = i83 % 128;
        if (i83 % 2 != 0) {
            int i84 = 2 % 3;
        }
        do {
            c0045a.f(this.c.m());
            p = this.c;
            int i85 = b;
            int i86 = ((i85 ^ 111) | (i85 & 111)) << 1;
            int i87 = -(((~i85) & 111) | (i85 & (-112)));
            int i88 = (i86 & i87) + (i87 | i86);
            a = i88 % 128;
            int i89 = i88 % 2;
        } while (p.h() < iH + iB2);
        int i90 = b;
        int i91 = (i90 & (-98)) | ((~i90) & 97);
        int i92 = -(-((i90 & 97) << 1));
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        a = i93 % 128;
        int i94 = i93 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void v(List<Long> list) throws C0065v {
        int iV;
        int iB;
        int iH;
        int iV2;
        int iH2;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 111;
        int i5 = i4 + ((i3 ^ 111) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (list instanceof W) {
            int i7 = i3 & 43;
            int i8 = -(-(i3 | 43));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            W w = (W) list;
            int i11 = this.d & 7;
            int i12 = ((i3 | 81) << 1) - (i3 ^ 81);
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            if (i11 != 0) {
                int i15 = (i13 & 35) + (i13 | 35);
                a = i15 % 128;
                if (i15 % 2 != 0 ? i11 != 2 : i11 != 5) {
                    throw C0065v.g();
                }
                int iB2 = this.c.B();
                int iH3 = this.c.h();
                int i16 = b;
                int i17 = (((i16 | 120) << 1) - (i16 ^ 120)) - 1;
                a = i17 % 128;
                int i18 = i17 % 2 == 0 ? iH3 * iB2 : ((((~iB2) & iH3) | ((~iH3) & iB2)) - (~(-(-((iB2 & iH3) << 1))))) - 1;
                do {
                    w.f(this.c.w());
                    iH2 = this.c.h();
                    i = a;
                    int i19 = (((i & (-26)) | ((~i) & 25)) - (~((i & 25) << 1))) - 1;
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } while (iH2 < i18);
                int i20 = ((i | 63) << 1) - (i ^ 63);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    ad(i18);
                    return;
                } else {
                    ad(i18);
                    throw null;
                }
            }
            do {
                w.f(this.c.w());
                int i21 = a;
                int i22 = i21 & 55;
                int i23 = (i21 | 55) & (~i22);
                int i24 = i22 << 1;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                b = i25 % 128;
                int i26 = i25 % 2;
                if (this.c.i()) {
                    int i27 = b;
                    int i28 = i27 & 59;
                    int i29 = (i27 | 59) & (~i28);
                    int i30 = i28 << 1;
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                iV2 = this.c.v();
            } while (iV2 == this.d);
            int i32 = b;
            int i33 = (i32 & (-98)) | ((~i32) & 97);
            int i34 = (i32 & 97) << 1;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            int i36 = i35 % 128;
            a = i36;
            if (i35 % 2 == 0) {
                this.f = iV2;
                int i37 = 38 / 0;
            } else {
                this.f = iV2;
            }
            int i38 = i36 + 99;
            b = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 68 / 0;
                return;
            }
            return;
        }
        int i40 = this.d & 7;
        if (i40 == 0) {
            do {
                Long lValueOf = Long.valueOf(this.c.w());
                int i41 = a;
                int i42 = i41 & 101;
                int i43 = (i41 ^ 101) | i42;
                int i44 = (i42 & i43) + (i43 | i42);
                b = i44 % 128;
                int i45 = i44 % 2;
                list.add(lValueOf);
                if (this.c.i()) {
                    int i46 = a;
                    int i47 = (i46 ^ 23) + ((i46 & 23) << 1);
                    b = i47 % 128;
                    int i48 = i47 % 2;
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i49 = a;
            int i50 = (((i49 | 36) << 1) - (i49 ^ 36)) - 1;
            int i51 = i50 % 128;
            b = i51;
            int i52 = i50 % 2;
            this.f = iV;
            int i53 = (-2) - ((i51 + 6) ^ (-1));
            a = i53 % 128;
            int i54 = i53 % 2;
            return;
        }
        int i55 = i3 & 65;
        int i56 = ((~i55) & (i3 | 65)) + (i55 << 1);
        b = i56 % 128;
        if (i56 % 2 == 0 ? i40 != 2 : i40 != 5) {
            throw C0065v.g();
        }
        int i57 = i3 & 125;
        int i58 = (i3 | 125) & (~i57);
        int i59 = -(-(i57 << 1));
        int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
        b = i60 % 128;
        if (i60 % 2 != 0) {
            iB = this.c.B();
            iH = this.c.h();
            int i61 = 46 / 0;
        } else {
            iB = this.c.B();
            iH = this.c.h();
        }
        int i62 = iH & iB;
        int i63 = (iB ^ iH) | i62;
        int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
        int i65 = a;
        int i66 = i65 & 43;
        int i67 = (((i65 | 43) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
        b = i67 % 128;
        int i68 = i67 % 2;
        do {
            list.add(Long.valueOf(this.c.w()));
            int i69 = b;
            int i70 = (i69 ^ 62) + ((i69 & 62) << 1);
            int i71 = (i70 ^ (-1)) + (i70 << 1);
            a = i71 % 128;
            if (i71 % 2 == 0) {
                this.c.h();
                obj.hashCode();
                throw null;
            }
        } while (this.c.h() < i64);
        int i72 = a;
        int i73 = (i72 ^ 101) + ((i72 & 101) << 1);
        b = i73 % 128;
        int i74 = i73 % 2;
        ad(i64);
        int i75 = b;
        int i76 = i75 & 91;
        int i77 = -(-((i75 ^ 91) | i76));
        int i78 = (i76 & i77) + (i77 | i76);
        a = i78 % 128;
        int i79 = i78 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void C(List<Long> list) throws C0065v {
        int iV;
        int iB;
        int iH;
        int iV2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = (~i3) & (i2 | 5);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (!(list instanceof W)) {
            int i9 = this.d & 7;
            if (i9 == 0) {
                do {
                    Long lValueOf = Long.valueOf(this.c.t());
                    int i10 = a;
                    int i11 = i10 ^ 17;
                    int i12 = -(-((i10 & 17) << 1));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    list.add(lValueOf);
                    if (this.c.i()) {
                        int i15 = a;
                        int i16 = ((i15 ^ 47) | (i15 & 47)) << 1;
                        int i17 = -(((~i15) & 47) | (i15 & (-48)));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return;
                    }
                    iV = this.c.v();
                } while (iV == this.d);
                int i20 = b;
                int i21 = ((i20 | 113) << 1) - (i20 ^ 113);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    this.f = iV;
                    return;
                } else {
                    this.f = iV;
                    throw null;
                }
            }
            int i22 = i2 + 63;
            int i23 = i22 % 128;
            b = i23;
            if (i22 % 2 == 0 ? i9 != 2 : i9 != 4) {
                throw C0065v.g();
            }
            int i24 = i23 & 11;
            int i25 = (i24 - (~(-(-((i23 ^ 11) | i24))))) - 1;
            a = i25 % 128;
            if (i25 % 2 == 0) {
                iB = this.c.B();
                iH = this.c.h();
                int i26 = 93 / 0;
            } else {
                iB = this.c.B();
                iH = this.c.h();
            }
            int i27 = a;
            int i28 = (i27 ^ 89) + ((i27 & 89) << 1);
            int i29 = i28 % 128;
            b = i29;
            int i30 = i28 % 2;
            int i31 = iH + iB;
            int i32 = i29 + 52;
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            do {
                list.add(Long.valueOf(this.c.t()));
                int i35 = a;
                int i36 = (((i35 & (-4)) | ((~i35) & 3)) - (~((i35 & 3) << 1))) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
            } while (this.c.h() < i31);
            int i38 = a;
            int i39 = (i38 ^ 101) + ((i38 & 101) << 1);
            b = i39 % 128;
            if (i39 % 2 != 0) {
                ad(i31);
                throw null;
            }
            ad(i31);
            int i40 = a + 103;
            b = i40 % 128;
            if (i40 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i41 = ((i7 & 24) + (i7 | 24)) - 1;
        a = i41 % 128;
        int i42 = i41 % 2;
        W w = (W) list;
        int i43 = this.d & 7;
        int i44 = i7 & 73;
        int i45 = (((i7 | 73) & (~i44)) - (~(-(-(i44 << 1))))) - 1;
        int i46 = i45 % 128;
        a = i46;
        if (i45 % 2 == 0) {
            throw null;
        }
        if (i43 == 0) {
            do {
                w.f(this.c.t());
                int i47 = b;
                int i48 = (i47 & 66) + (i47 | 66);
                int i49 = (i48 ^ (-1)) + (i48 << 1);
                a = i49 % 128;
                if (i49 % 2 == 0) {
                    this.c.i();
                    throw null;
                }
                if (this.c.i()) {
                    int i50 = b + 33;
                    a = i50 % 128;
                    if (i50 % 2 == 0) {
                        int i51 = 1 / 0;
                        return;
                    }
                    return;
                }
                iV2 = this.c.v();
            } while (iV2 == this.d);
            int i52 = a;
            int i53 = i52 & 53;
            int i54 = (i52 ^ 53) | i53;
            int i55 = (i53 & i54) + (i53 | i54);
            b = i55 % 128;
            int i56 = i55 % 2;
            this.f = iV2;
            int i57 = (i52 & (-58)) | ((~i52) & 57);
            int i58 = (i52 & 57) << 1;
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            b = i59 % 128;
            int i60 = i59 % 2;
            return;
        }
        if (i43 != 2) {
            throw C0065v.g();
        }
        int i61 = (i46 & 55) + (i46 | 55);
        b = i61 % 128;
        if (i61 % 2 != 0) {
            this.c.B();
            this.c.h();
            obj.hashCode();
            throw null;
        }
        int iH2 = (this.c.h() - (~this.c.B())) - 1;
        int i62 = a;
        int i63 = (((i62 | 38) << 1) - (i62 ^ 38)) - 1;
        b = i63 % 128;
        int i64 = i63 % 2;
        do {
            w.f(this.c.t());
            int i65 = a;
            int i66 = ((i65 | 43) << 1) - (i65 ^ 43);
            b = i66 % 128;
            if (i66 % 2 != 0) {
                this.c.h();
                obj.hashCode();
                throw null;
            }
        } while (this.c.h() < iH2);
        ad(iH2);
        int i67 = a;
        int i68 = i67 & 17;
        int i69 = (i67 | 17) & (~i68);
        int i70 = i68 << 1;
        int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
        b = i71 % 128;
        int i72 = i71 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:3: B:62:0x01fc->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r1 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r4 = r3 & 81;
        r5 = (~r4) & (r3 | 81);
        r4 = r4 << 1;
        r6 = (r5 ^ r4) + ((r4 & r5) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r1 != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r1 = (r3 & 95) + (r3 | 95);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        r1 = r7.c.B();
        r3 = r7.c.h();
        r1 = -(-r1);
        r4 = r3 & r1;
        r1 = (r1 | r3) & (~r4);
        r3 = -(-(r4 << 1));
        r4 = ((r1 | r3) << 1) - (r1 ^ r3);
        r1 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r3 = (((r1 & (-20)) | ((~r1) & 19)) - (~((r1 & 19) << 1))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r8.f(r7.c.f());
        r1 = r7.c;
        r3 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r5 = r3 & 69;
        r5 = r5 + ((r3 ^ 69) | r5);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if ((r5 % 2) == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r1.h() < r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.b + 35;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r8 % 128;
        r8 = r8 % 2;
        ad(r4);
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = r8 & 53;
        r1 = (r1 - (~((r8 ^ 53) | r1))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        r1.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        r7.c.B();
        r7.c.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        r8.f(r7.c.f());
        r1 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r3 = (r1 & (-124)) | ((~r1) & 123);
        r1 = -(-((r1 & 123) << 1));
        r4 = ((r3 | r1) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        if ((r4 % 2) != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (r7.c.i() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.b + 71;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        if ((r8 % 2) != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0119, code lost:
    
        r8 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
    
        r1 = r7.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        if (r1 == r7.d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r3 = r8 & 39;
        r8 = (r8 ^ 39) | r3;
        r4 = (r3 ^ r8) + ((r8 & r3) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if ((r4 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        r7.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        r7.f = r1;
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0145, code lost:
    
        r7.c.i();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r1 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.util.List<java.lang.Boolean> r8) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.B(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r2 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r5 = ((r1 | 83) << 1) - (r1 ^ 83);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r2 != 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r2 != 5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r9.f(r8.c.q());
        r1 = r8.c;
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r3 = r2 & 35;
        r2 = (r2 ^ 35) | r3;
        r5 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if ((r5 % 2) != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r1.i() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = r9 & 25;
        r1 = (r1 - (~((r9 ^ 25) | r1))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r1 = r8.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r1 == r8.d) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r2 = r9 + 55;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
        r2 = r2 % 2;
        r8.f = r1;
        r9 = r9 + 8;
        r1 = (r9 ^ (-1)) + (r9 << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r1.i();
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        r2 = r9;
        r5 = r8.c.B();
        ae(r5);
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = ((r9 ^ 4) + ((r9 & 4) << 1)) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r1 % 128;
        r1 = r1 % 2;
        r6 = r8.c.h();
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = r9 & 105;
        r9 = -(-((r9 ^ 105) | r1));
        r3 = (r1 & r9) + (r9 | r1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        r2.f(r8.c.q());
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = ((r9 ^ 111) | (r9 & 111)) << 1;
        r9 = -(((~r9) & 111) | (r9 & (-112)));
        r3 = (r1 ^ r9) + ((r9 & r1) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        if ((r3 % 2) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0129, code lost:
    
        if (r8.c.h() < (r6 >> r5)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        r1 = -(-r5);
        r7 = r6 & r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0143, code lost:
    
        if (r8.c.h() < (((((r6 ^ r1) | r7) << 1) - (~(-((r1 | r6) & (~r7))))) - 1)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.C0063t.b + 75;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014e, code lost:
    
        if ((r9 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0151, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0154, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r2 != 2) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.List<java.lang.Float> r9) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.g(java.util.List):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void a(List<Integer> list) throws C0065v {
        int iV;
        int i;
        int iV2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 103) << 1) - (i3 ^ 103);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = list instanceof L;
            obj.hashCode();
            throw null;
        }
        if (list instanceof L) {
            L l = (L) list;
            int i5 = this.d & 7;
            if (i5 == 0) {
                do {
                    l.f(this.c.x());
                    P p = this.c;
                    int i6 = b + 99;
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    if (p.i()) {
                        int i8 = b;
                        int i9 = ((i8 | 59) << 1) - (i8 ^ 59);
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 41 / 0;
                            return;
                        }
                        return;
                    }
                    iV2 = this.c.v();
                } while (iV2 == this.d);
                int i11 = a + 5;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    this.f = iV2;
                    return;
                } else {
                    this.f = iV2;
                    obj.hashCode();
                    throw null;
                }
            }
            int i12 = i3 & 111;
            int i13 = ((~i12) & (i3 | 111)) + (i12 << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (i5 != 2) {
                throw C0065v.g();
            }
            int i15 = i3 & 113;
            int i16 = i3 | 113;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                this.c.B();
                this.c.h();
                throw null;
            }
            int iB = this.c.B();
            int iH = this.c.h();
            int i18 = a;
            int i19 = (i18 & (-24)) | ((~i18) & 23);
            int i20 = -(-((i18 & 23) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = (((iH ^ iB) | (iH & iB)) << 1) - ((iB & (~iH)) | ((~iB) & iH));
            int i25 = i22 ^ 37;
            int i26 = -(-((i22 & 37) << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 5 % 5;
            }
            do {
                l.f(this.c.x());
                int i29 = a;
                int i30 = ((i29 ^ 47) | (i29 & 47)) << 1;
                int i31 = -(((~i29) & 47) | (i29 & (-48)));
                int i32 = (i30 & i31) + (i31 | i30);
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    this.c.h();
                    throw null;
                }
            } while (this.c.h() < i24);
            ad(i24);
            int i33 = b + 54;
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            a = i34 % 128;
            int i35 = i34 % 2;
            return;
        }
        int i36 = this.d & 7;
        if (i36 == 0) {
            do {
                list.add(Integer.valueOf(this.c.x()));
                int i37 = b + 77;
                a = i37 % 128;
                int i38 = i37 % 2;
                if (this.c.i()) {
                    int i39 = b;
                    int i40 = i39 ^ 113;
                    int i41 = ((i39 & 113) | i40) << 1;
                    int i42 = -i40;
                    int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i45 = a;
            int i46 = i45 & 115;
            int i47 = (i45 | 115) & (~i46);
            int i48 = i46 << 1;
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            int i50 = i49 % 128;
            b = i50;
            if (i49 % 2 != 0) {
                this.f = iV;
                throw null;
            }
            this.f = iV;
            int i51 = ((i50 ^ 121) | (i50 & 121)) << 1;
            int i52 = -(((~i50) & 121) | (i50 & (-122)));
            int i53 = (i51 & i52) + (i52 | i51);
            a = i53 % 128;
            int i54 = i53 % 2;
            return;
        }
        int i55 = i3 & 99;
        int i56 = i55 + ((i3 ^ 99) | i55);
        int i57 = i56 % 128;
        b = i57;
        if (i56 % 2 == 0 ? i36 != 2 : i36 != 3) {
            throw C0065v.g();
        }
        int i58 = i57 & 7;
        int i59 = (i58 - (~(-(-((i57 ^ 7) | i58))))) - 1;
        a = i59 % 128;
        int i60 = i59 % 2;
        int iB2 = this.c.B();
        int iH2 = this.c.h();
        int i61 = a;
        int i62 = ((i61 | 101) << 1) - (i61 ^ 101);
        int i63 = i62 % 128;
        b = i63;
        if (i62 % 2 != 0) {
            i = iH2 % iB2;
        } else {
            int i64 = -(-iB2);
            i = ((iH2 | i64) << 1) - (i64 ^ iH2);
        }
        int i65 = ((i63 | 73) << 1) - (i63 ^ 73);
        a = i65 % 128;
        int i66 = i65 % 2;
        do {
            list.add(Integer.valueOf(this.c.x()));
            int i67 = b + 24;
            int i68 = (i67 ^ (-1)) + (i67 << 1);
            a = i68 % 128;
            if (i68 % 2 == 0) {
                this.c.h();
                throw null;
            }
        } while (this.c.h() < i);
        ad(i);
        int i69 = a;
        int i70 = i69 & 87;
        int i71 = i69 | 87;
        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
        b = i72 % 128;
        if (i72 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void I(List<Integer> list) throws C0065v {
        int iV;
        L l;
        int i;
        int iV2;
        P p;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!(list instanceof L)) {
            int i6 = this.d & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.c.n()));
                    int i7 = b + 31;
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.c.i();
                        throw null;
                    }
                    if (this.c.i()) {
                        int i8 = (-2) - ((a + 60) ^ (-1));
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 86 / 0;
                            return;
                        }
                        return;
                    }
                    iV = this.c.v();
                } while (iV == this.d);
                int i10 = b;
                int i11 = i10 & 125;
                int i12 = -(-((i10 ^ 125) | i11));
                int i13 = (i11 & i12) + (i11 | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                this.f = iV;
                int i15 = i10 + 99;
                a = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            int i17 = (i3 ^ 69) + ((i3 & 69) << 1);
            b = i17 % 128;
            if (i17 % 2 == 0 ? i6 != 2 : i6 != 4) {
                throw C0065v.g();
            }
            int iB = this.c.B();
            int iH = this.c.h();
            int i18 = b;
            int i19 = i18 + 125;
            a = i19 % 128;
            int i20 = i19 % 2;
            int i21 = iH & iB;
            int i22 = ((iH ^ iB) | i21) << 1;
            int i23 = -((iB | iH) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            int i25 = ((((i18 ^ 5) | (i18 & 5)) << 1) - (~(-(((~i18) & 5) | (i18 & (-6)))))) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            do {
                list.add(Integer.valueOf(this.c.n()));
                int i27 = a;
                int i28 = (-2) - ((((i27 | 100) << 1) - (i27 ^ 100)) ^ (-1));
                b = i28 % 128;
                int i29 = i28 % 2;
            } while (this.c.h() < i24);
            int i30 = a;
            int i31 = i30 & 1;
            int i32 = ((i30 ^ 1) | i31) << 1;
            int i33 = -((i30 | 1) & (~i31));
            int i34 = (i32 & i33) + (i33 | i32);
            b = i34 % 128;
            int i35 = i34 % 2;
            ad(i24);
            int i36 = b;
            int i37 = i36 & 79;
            int i38 = (i36 ^ 79) | i37;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            a = i39 % 128;
            int i40 = i39 % 2;
            return;
        }
        int i41 = i3 + 67;
        int i42 = i41 % 128;
        b = i42;
        if (i41 % 2 != 0) {
            l = (L) list;
            int i43 = this.d;
            int i44 = (i43 & (-43)) | ((~i43) & 42);
            int i45 = i43 & 42;
            i = (i45 & i44) | (i44 ^ i45);
        } else {
            l = (L) list;
            i = this.d & 7;
        }
        L l2 = l;
        if (i == 0) {
            do {
                l2.f(this.c.n());
                P p2 = this.c;
                int i46 = a + 121;
                b = i46 % 128;
                int i47 = i46 % 2;
                if (p2.i()) {
                    int i48 = b;
                    int i49 = ((i48 | 77) << 1) - (i48 ^ 77);
                    a = i49 % 128;
                    if (i49 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                iV2 = this.c.v();
            } while (iV2 == this.d);
            int i50 = a;
            int i51 = ((i50 ^ 9) | (i50 & 9)) << 1;
            int i52 = -(((~i50) & 9) | (i50 & (-10)));
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            b = i53 % 128;
            if (i53 % 2 == 0) {
                this.f = iV2;
                return;
            } else {
                this.f = iV2;
                int i54 = 43 / 0;
                return;
            }
        }
        int i55 = ((((i42 ^ 107) | (i42 & 107)) << 1) - (~(-(((~i42) & 107) | (i42 & (-108)))))) - 1;
        int i56 = i55 % 128;
        a = i56;
        int i57 = i55 % 2;
        if (i != 2) {
            throw C0065v.g();
        }
        int i58 = i56 & 55;
        int i59 = ((~i58) & (i56 | 55)) + (i58 << 1);
        b = i59 % 128;
        if (i59 % 2 != 0) {
            this.c.B();
            obj.hashCode();
            throw null;
        }
        int iB2 = this.c.B();
        int iH2 = this.c.h();
        int i60 = iH2 ^ iB2;
        int i61 = (((iB2 & iH2) | i60) << 1) - i60;
        int i62 = a;
        int i63 = i62 & 121;
        int i64 = -(-((i62 ^ 121) | i63));
        int i65 = (i63 & i64) + (i64 | i63);
        b = i65 % 128;
        int i66 = i65 % 2;
        do {
            l2.f(this.c.n());
            p = this.c;
            int i67 = a;
            int i68 = i67 & 47;
            int i69 = ((((i67 ^ 47) | i68) << 1) - (~(-((i67 | 47) & (~i68))))) - 1;
            b = i69 % 128;
            if (i69 % 2 != 0) {
                p.h();
                obj.hashCode();
                throw null;
            }
        } while (p.h() < i61);
        ad(i61);
        int i70 = b + 17;
        a = i70 % 128;
        int i71 = i70 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r2 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r3 = (((r1 | 121) << 1) - (~(-(r1 ^ 121)))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r10.f(r9.c.s());
        r1 = r9.c;
        r2 = ivas.gov.bisp.enumeration.aD.C0063t.a + 79;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r1.i() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = ((r10 ^ 37) - (~(-(-((r10 & 37) << 1))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        r1 = r9.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r1 == r9.d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r2 = r10 & 7;
        r3 = (r10 ^ 7) | r2;
        r4 = ((r2 | r3) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r4 % 128;
        r4 = r4 % 2;
        r9.f = r1;
        r10 = r10 + 51;
        ivas.gov.bisp.enumeration.aD.C0063t.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if ((r10 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        r2 = r10;
        r6 = r9.c.B();
        ae(r6);
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = ((((r10 ^ 39) | (r10 & 39)) << 1) - (~(-(((~r10) & 39) | (r10 & (-40)))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r1 % 128;
        r1 = r1 % 2;
        r7 = r9.c.h();
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r1 = r10 ^ 29;
        r10 = (((r10 & 29) | r1) << 1) - r1;
        ivas.gov.bisp.enumeration.aD.C0063t.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        r2.f(r9.c.s());
        r10 = r9.c;
        r1 = ivas.gov.bisp.enumeration.aD.C0063t.b;
        r3 = ((r1 & (-112)) | ((~r1) & 111)) + ((r1 & 111) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.a = r3 % 128;
        r3 = r3 % 2;
        r1 = -(-r6);
        r3 = r7 & r1;
        r1 = -(-((r1 ^ r7) | r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        if (r10.h() < (((r3 | r1) << 1) - (r1 ^ r3))) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0063t.a;
        r1 = ((r10 ^ 49) | (r10 & 49)) << 1;
        r10 = -(((~r10) & 49) | (r10 & (-50)));
        r2 = (r1 ^ r10) + ((r10 & r1) << 1);
        ivas.gov.bisp.enumeration.aD.C0063t.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r2 != 5) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.aD.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.util.List<java.lang.Integer> r10) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0063t.j(java.util.List):void");
    }

    @Override // ivas.gov.bisp.enumeration.aD.ag
    public final void i(List<Integer> list) throws C0065v {
        int iV;
        int iH;
        int iV2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 93;
        int i4 = ((i3 << 1) - (~(-(i3 & (~(i2 & 93)))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            boolean z = list instanceof L;
            throw null;
        }
        if (!(list instanceof L)) {
            int i6 = this.d & 7;
            if (i6 == 2) {
                int iB = this.c.B();
                ae(iB);
                int i7 = a;
                int i8 = i7 & 31;
                int i9 = (i8 - (~((i7 ^ 31) | i8))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                int iH2 = this.c.h();
                int i11 = a;
                int i12 = ((i11 | 37) << 1) - (i11 ^ 37);
                b = i12 % 128;
                int i13 = i12 % 2;
                while (true) {
                    list.add(Integer.valueOf(this.c.p()));
                    int i14 = b;
                    int i15 = i14 ^ 95;
                    int i16 = ((i14 & 95) | i15) << 1;
                    int i17 = -i15;
                    int i18 = (i16 & i17) + (i16 | i17);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        if (this.c.h() >= iH2 * iB) {
                            break;
                        }
                    } else if (this.c.h() >= (iH2 & iB) + (iH2 | iB)) {
                        break;
                    }
                }
                int i19 = a;
                int i20 = (i19 ^ 20) + ((i19 & 20) << 1);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            int i23 = i2 & 73;
            int i24 = ((i2 | 73) & (~i23)) + (i23 << 1);
            b = i24 % 128;
            if (i24 % 2 == 0 ? i6 != 5 : i6 != 2) {
                throw C0065v.g();
            }
            do {
                list.add(Integer.valueOf(this.c.p()));
                int i25 = a;
                int i26 = i25 & 25;
                int i27 = i26 + ((i25 ^ 25) | i26);
                b = i27 % 128;
                int i28 = i27 % 2;
                if (this.c.i()) {
                    int i29 = (-2) - ((a + 56) ^ (-1));
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    return;
                }
                iV = this.c.v();
            } while (iV == this.d);
            int i31 = b;
            int i32 = (((i31 ^ 49) | (i31 & 49)) << 1) - ((i31 & (-50)) | ((~i31) & 49));
            a = i32 % 128;
            int i33 = i32 % 2;
            this.f = iV;
            if (i33 == 0) {
                int i34 = 39 / 0;
            }
            int i35 = i31 + 3;
            a = i35 % 128;
            int i36 = i35 % 2;
            return;
        }
        int i37 = i5 & 109;
        int i38 = ((i5 ^ 109) | i37) << 1;
        int i39 = -((i5 | 109) & (~i37));
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        int i41 = i40 % 128;
        a = i41;
        int i42 = i40 % 2;
        L l = (L) list;
        int i43 = this.d & 7;
        int i44 = (i41 ^ 43) + ((i41 & 43) << 1);
        b = i44 % 128;
        int i45 = i44 % 2;
        if (i43 == 2) {
            int iB2 = this.c.B();
            ae(iB2);
            int i46 = a;
            int i47 = ((i46 | 103) << 1) - (i46 ^ 103);
            b = i47 % 128;
            if (i47 % 2 != 0) {
                iH = this.c.h();
                int i48 = 92 / 0;
            } else {
                iH = this.c.h();
            }
            int i49 = iH;
            int i50 = b;
            int i51 = i50 & 55;
            int i52 = i51 + ((i50 ^ 55) | i51);
            a = i52 % 128;
            int i53 = i52 % 2;
            while (true) {
                l.f(this.c.p());
                P p = this.c;
                int i54 = a;
                int i55 = i54 & 51;
                int i56 = i54 | 51;
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                b = i57 % 128;
                if (i57 % 2 != 0) {
                    int iH3 = p.h();
                    int i58 = -(~(-iB2));
                    if (iH3 >= (((i49 | i58) << 1) - (i58 ^ i49)) - 1) {
                        break;
                    }
                } else {
                    int iH4 = p.h();
                    int i59 = ((~iB2) & i49) | ((~i49) & iB2);
                    int i60 = -(-((i49 & iB2) << 1));
                    if (iH4 >= (i59 & i60) + (i59 | i60)) {
                        break;
                    }
                }
            }
            int i61 = b;
            int i62 = (i61 ^ 81) + ((i61 & 81) << 1);
            a = i62 % 128;
            if (i62 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i63 = i41 & 27;
        int i64 = ((i41 ^ 27) | i63) << 1;
        int i65 = -((i41 | 27) & (~i63));
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        b = i66 % 128;
        if (i66 % 2 == 0 ? i43 != 5 : i43 != 2) {
            throw C0065v.g();
        }
        do {
            l.f(this.c.p());
            P p2 = this.c;
            int i67 = b;
            int i68 = i67 ^ 83;
            int i69 = ((i67 & 83) | i68) << 1;
            int i70 = -i68;
            int i71 = (i69 & i70) + (i69 | i70);
            a = i71 % 128;
            if (i71 % 2 == 0) {
                int i72 = 40 / 0;
                if (p2.i()) {
                    int i73 = a;
                    int i74 = i73 ^ 93;
                    int i75 = ((((i73 & 93) | i74) << 1) - (~(-i74))) - 1;
                    b = i75 % 128;
                    int i76 = i75 % 2;
                    return;
                }
                iV2 = this.c.v();
            } else {
                if (p2.i()) {
                    int i77 = a;
                    int i78 = i77 ^ 93;
                    int i79 = ((((i77 & 93) | i78) << 1) - (~(-i78))) - 1;
                    b = i79 % 128;
                    int i710 = i79 % 2;
                    return;
                }
                iV2 = this.c.v();
            }
        } while (iV2 == this.d);
        int i80 = a;
        int i81 = i80 ^ 17;
        int i82 = (i80 & 17) << 1;
        int i83 = (i81 & i82) + (i81 | i82);
        b = i83 % 128;
        int i84 = i83 % 2;
        this.f = iV2;
        int i85 = ((i80 & 13) - (~(i80 | 13))) - 1;
        b = i85 % 128;
        if (i85 % 2 != 0) {
            int i86 = 98 / 0;
        }
    }
}
