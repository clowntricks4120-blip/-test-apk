package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.Q;

/* JADX INFO: loaded from: classes.dex */
public class W extends Y {
    private static int a = 0;
    private static int b = 1;

    public W(C0087m c0087m) {
        super(c0087m);
        c0087m.g.h();
        c0087m.i.h();
        this.h = ((Q) c0087m).ak;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 55) + (i2 | 55);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.k.d();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public boolean m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (~i3) & (i2 | 37);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (i2 ^ 76) + ((i2 & 76) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final void o(s sVar) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 96) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.k.m.add(sVar);
            int i3 = 28 / 0;
        } else {
            this.k.m.add(sVar);
        }
        sVar.n.add(this.k);
        int i4 = a;
        int i5 = (-2) - (((i4 ^ 6) + ((i4 & 6) << 1)) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void i() {
        int i = 2 % 2;
        int i2 = a + 117;
        b = i2 % 128;
        int i3 = i2 % 2;
        C0087m c0087m = this.e;
        int i4 = ((Q) c0087m).ak;
        int i5 = a;
        int i6 = ((i5 & (-16)) | ((~i5) & 15)) + ((i5 & 15) << 1);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0 ? i4 == 1 : i4 == 1) {
            int i8 = (((i7 | 20) << 1) - (i7 ^ 20)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            c0087m.H = this.k.j;
            int i10 = a;
            int i11 = (i10 ^ 71) + ((i10 & 71) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        c0087m.U = this.k.j;
        int i12 = b;
        int i13 = i12 | 107;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 107)) & i13);
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 46 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.Y, ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 106) + (i2 | 106)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        s sVar = this.k;
        if (!sVar.f) {
            int i5 = a;
            int i6 = (i5 ^ 107) + ((i5 & 107) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        if (sVar.l) {
            int i8 = b;
            int i9 = i8 & 27;
            int i10 = i9 + ((i8 ^ 27) | i9);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        s sVar2 = sVar.n.get(0);
        int i11 = b;
        int i12 = ((i11 & 22) + (i11 | 22)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        Q q = (Q) this.e;
        int i14 = sVar2.j;
        int i15 = a;
        int i16 = i15 ^ 115;
        int i17 = -(-((i15 & 115) << 1));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = (int) ((i14 * q.ag) + 0.5f);
        int i21 = b;
        int i22 = i21 & 85;
        int i23 = (((i21 | 85) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            this.k.e(i20);
        } else {
            this.k.e(i20);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.B.W.b;
        r4 = ((r2 | 124) << 1) - (r2 ^ 124);
        r2 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r2 = r10.k.n;
        r1 = r1.N.g.k;
        r4 = ivas.gov.bisp.enumeration.B.W.a;
        r7 = (r4 ^ 100) + ((r4 & 100) << 1);
        r4 = (r7 ^ (-1)) + (r7 << 1);
        ivas.gov.bisp.enumeration.B.W.b = r4 % 128;
        r4 = r4 % 2;
        r2.add(r1);
        r1 = r10.e.N.g;
        r2 = ivas.gov.bisp.enumeration.B.W.b;
        r4 = r2 & 35;
        r2 = (r2 ^ 35) | r4;
        r7 = (r4 & r2) + (r2 | r4);
        ivas.gov.bisp.enumeration.B.W.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if ((r7 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        r1.k.m.add(r10.k);
        r10.k.h = r3;
        r1 = ivas.gov.bisp.enumeration.B.W.a;
        r2 = r1 & 1;
        r1 = (r1 ^ 1) | r2;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.B.W.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        r1.k.m.add(r10.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        r0 = r10.k.n;
        r0 = r1.N.g.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        if (r7 == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        r2 = ivas.gov.bisp.enumeration.B.W.b + 1;
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        if ((r2 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        r2 = r10.k.n;
        r1 = r1.N.g.c;
        r3 = ivas.gov.bisp.enumeration.B.W.b;
        r4 = r3 & 117;
        r3 = (r3 | 117) & (~r4);
        r4 = r4 << 1;
        r8 = ((r3 | r4) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.B.W.a = r8 % 128;
        r8 = r8 % 2;
        r2.add(r1);
        r1 = r10.e.N.g;
        r2 = ivas.gov.bisp.enumeration.B.W.a;
        r3 = r2 & 95;
        r2 = -(-((r2 ^ 95) | r3));
        r4 = (r3 & r2) + (r2 | r3);
        ivas.gov.bisp.enumeration.B.W.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fd, code lost:
    
        if ((r4 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ff, code lost:
    
        r1.c.m.add(r10.k);
        r1 = ivas.gov.bisp.enumeration.B.W.a;
        r2 = r1 & 123;
        r2 = (r2 - (~((r1 ^ 123) | r2))) - 1;
        ivas.gov.bisp.enumeration.B.W.b = r2 % 128;
        r2 = r2 % 2;
        r10.k.h = -r7;
        r1 = ivas.gov.bisp.enumeration.B.W.a;
        r2 = ((r1 ^ 35) | (r1 & 35)) << 1;
        r1 = -(((~r1) & 35) | (r1 & (-36)));
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.B.W.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
    
        r1.c.m.add(r10.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
    
        r0 = r10.k.n;
        r0 = r1.N.g.c;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014d, code lost:
    
        r2 = r10.k;
        r2.e = true;
        r2 = r2.n;
        r3 = ivas.gov.bisp.enumeration.B.W.a + 85;
        ivas.gov.bisp.enumeration.B.W.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015c, code lost:
    
        if ((r3 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015e, code lost:
    
        r2.add(r1.N.g.c);
        r1 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016c, code lost:
    
        r2.add(r1.N.g.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0175, code lost:
    
        r1 = r10.e.N.g.c;
        r2 = ivas.gov.bisp.enumeration.B.W.b + 23;
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
        r2 = r2 % 2;
        r1.m.add(r10.k);
        r1 = ivas.gov.bisp.enumeration.B.W.a + 27;
        ivas.gov.bisp.enumeration.B.W.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0196, code lost:
    
        o(r10.e.g.k);
        r1 = ivas.gov.bisp.enumeration.B.W.b;
        r2 = (r1 ^ 81) + ((r1 & 81) << 1);
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ac, code lost:
    
        if ((r2 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ae, code lost:
    
        o(r10.e.g.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b8, code lost:
    
        o(r10.e.g.c);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c5, code lost:
    
        if (r3 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.B.W.b;
        r4 = (r2 & 17) + (r2 | 17);
        ivas.gov.bisp.enumeration.B.W.a = r4 % 128;
        r4 = r4 % 2;
        r2 = r10.k.n;
        r1 = r1.N;
        r4 = ivas.gov.bisp.enumeration.B.W.b;
        r7 = (r4 | 29) << 1;
        r4 = -(r4 ^ 29);
        r8 = (r7 ^ r4) + ((r4 & r7) << 1);
        ivas.gov.bisp.enumeration.B.W.a = r8 % 128;
        r8 = r8 % 2;
        r2.add(r1.i.k);
        r1 = ivas.gov.bisp.enumeration.B.W.b + 56;
        r2 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
        r2 = r2 % 2;
        r1 = r10.e.N.i;
        r2 = ivas.gov.bisp.enumeration.B.W.a;
        r4 = r2 & 67;
        r2 = -(-(r2 | 67));
        r7 = (r4 ^ r2) + ((r2 & r4) << 1);
        ivas.gov.bisp.enumeration.B.W.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0217, code lost:
    
        if ((r7 % 2) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0219, code lost:
    
        r1.k.m.add(r10.k);
        r1 = ivas.gov.bisp.enumeration.B.W.a + 123;
        ivas.gov.bisp.enumeration.B.W.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022b, code lost:
    
        if ((r1 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022d, code lost:
    
        r10.k.h = r3;
        r1 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0236, code lost:
    
        r10.k.h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023a, code lost:
    
        r1 = ivas.gov.bisp.enumeration.B.W.b;
        r3 = r1 & 13;
        r2 = ((r1 ^ 13) | r3) << 1;
        r1 = -((r1 | 13) & (~r3));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.B.W.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0253, code lost:
    
        r1.k.m.add(r10.k);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0260, code lost:
    
        if (r7 == (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0262, code lost:
    
        r2 = ivas.gov.bisp.enumeration.B.W.b;
        r3 = r2 & 93;
        r2 = -(-(r2 | 93));
        r4 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.B.W.a = r4 % 128;
        r4 = r4 % 2;
        r2 = r10.k.n;
        r1 = r1.N.i;
        r3 = ivas.gov.bisp.enumeration.B.W.b;
        r4 = (r3 & (-20)) | ((~r3) & 19);
        r3 = (r3 & 19) << 1;
        r8 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.B.W.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0290, code lost:
    
        if ((r8 % 2) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0292, code lost:
    
        r2.add(r1.c);
        r1 = r10.e.N.i.c.m;
        r2 = ivas.gov.bisp.enumeration.B.W.a + 63;
        ivas.gov.bisp.enumeration.B.W.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02aa, code lost:
    
        if ((r2 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02ac, code lost:
    
        r1.add(r10.k);
        r1 = r10.k;
        r2 = ivas.gov.bisp.enumeration.B.W.a;
        r3 = r2 & 19;
        r2 = (r2 | 19) & (~r3);
        r3 = r3 << 1;
        r4 = ((r2 | r3) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.B.W.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02c5, code lost:
    
        if ((r4 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02c7, code lost:
    
        r1.h = -r7;
        r1 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02cf, code lost:
    
        r1.h = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02d3, code lost:
    
        r1.add(r10.k);
        r0 = r10.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r2.ak == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02db, code lost:
    
        r2.add(r1.c);
        r0 = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02e2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02e3, code lost:
    
        r2 = r10.k;
        r2.e = true;
        r2 = r2.n;
        r3 = ivas.gov.bisp.enumeration.B.W.a;
        r7 = ((r3 & 106) + (r3 | 106)) - 1;
        ivas.gov.bisp.enumeration.B.W.b = r7 % 128;
        r7 = r7 % 2;
        r2.add(r1.N.i.c);
        r1 = ivas.gov.bisp.enumeration.B.W.b;
        r2 = (r1 ^ 75) + ((r1 & 75) << 1);
        ivas.gov.bisp.enumeration.B.W.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x030c, code lost:
    
        if ((r2 % 2) != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x030e, code lost:
    
        r10.e.N.i.c.m.add(r10.k);
        r1 = ivas.gov.bisp.enumeration.B.W.b;
        r2 = r1 & 15;
        r1 = -(-((r1 ^ 15) | r2));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.B.W.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0330, code lost:
    
        o(r10.e.i.k);
        r1 = ivas.gov.bisp.enumeration.B.W.a;
        r2 = ((((r1 ^ 83) | (r1 & 83)) << 1) - (~(-(((~r1) & 83) | (r1 & (-84)))))) - 1;
        ivas.gov.bisp.enumeration.B.W.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0350, code lost:
    
        if ((r2 % 2) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0352, code lost:
    
        o(r10.e.i.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x035b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x035c, code lost:
    
        o(r10.e.i.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0365, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0366, code lost:
    
        r0 = r10.e.N.i.c.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0370, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r2.ak == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r3 == (-1)) goto L19;
     */
    @Override // ivas.gov.bisp.enumeration.B.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.B.W.g():void");
    }
}
