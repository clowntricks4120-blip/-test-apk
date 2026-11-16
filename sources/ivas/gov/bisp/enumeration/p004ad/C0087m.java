package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.B.D;
import ivas.gov.bisp.enumeration.B.X;
import ivas.gov.bisp.enumeration.B.am;
import ivas.gov.bisp.enumeration.B.s;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p003ac.i;
import ivas.gov.bisp.enumeration.p003ac.r;
import ivas.gov.bisp.enumeration.p003ac.t;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ad.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0087m {
    private static int a = 0;
    private static int b = 1;
    public N A;
    public N B;
    public N C;
    public N D;
    public N E;
    public N F;
    public N G;
    public int H;
    public boolean[] I;
    public N J;
    public N[] K;
    public ArrayList<N> L;
    public int[] M;
    public C0087m N;
    public int O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public Object X;
    public int Y;
    public String Z;
    public int aa;
    public int ab;
    public float[] ac;
    public C0087m[] ad;
    public C0087m[] ae;
    public float af;
    public am e;
    public am f;
    public boolean v;
    public boolean d = false;
    public D g = new D(this);
    public X i = new X(this);
    public boolean[] h = {true, true};
    public int[] j = {0, 0, 0, 0};
    public int k = -1;
    public int c = -1;
    public int l = 0;
    public int m = 0;
    public int[] n = new int[2];
    public int p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f65o = 0;
    public float q = 1.0f;
    public int r = 0;
    public int t = 0;
    public float s = 1.0f;
    public int u = -1;
    public float x = 1.0f;
    public int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float y = 0.0f;
    public boolean z = false;

    public C0087m() {
        N n = new N(this, N.aTW.d);
        this.B = n;
        N n2 = new N(this, N.aTW.e);
        this.A = n2;
        N n3 = new N(this, N.aTW.f);
        this.C = n3;
        N n4 = new N(this, N.aTW.h);
        this.E = n4;
        N n5 = new N(this, N.aTW.g);
        this.D = n5;
        this.F = new N(this, N.aTW.j);
        this.G = new N(this, N.aTW.c);
        N n6 = new N(this, N.aTW.i);
        this.J = n6;
        this.K = new N[]{n, n3, n2, n4, n5, n6};
        ArrayList<N> arrayList = new ArrayList<>();
        this.L = arrayList;
        this.I = new boolean[2];
        this.M = new int[]{1, 1};
        this.N = null;
        this.P = 0;
        this.O = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.H = 0;
        this.U = 0;
        this.T = 0;
        this.W = 0.5f;
        this.af = 0.5f;
        this.Y = 0;
        this.Z = null;
        this.aa = 0;
        this.ab = 0;
        this.ac = new float[]{-1.0f, -1.0f};
        this.ad = new C0087m[]{null, null};
        this.ae = new C0087m[]{null, null};
        arrayList.add(this.B);
        this.L.add(this.A);
        this.L.add(this.C);
        this.L.add(this.E);
        this.L.add(this.F);
        this.L.add(this.G);
        this.L.add(this.J);
        this.L.add(this.D);
    }

    public void B(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = (((~i4) & (i3 | 95)) - (~(i4 << 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.M[1] = i;
        int i7 = i3 & 99;
        int i8 = (i7 - (~((i3 ^ 99) | i7))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 46) + (i2 | 46)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.Y != 8) {
            int i5 = this.O;
            int i6 = i2 & 75;
            int i7 = (i2 ^ 75) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return i5;
            }
            throw null;
        }
        int i9 = (i2 ^ 61) + ((i2 & 61) << 1);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = ((i10 ^ 39) | (i10 & 39)) << 1;
        int i13 = -(((~i10) & 39) | (i10 & (-40)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return 0;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    public boolean e() {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 27) << 1) - (((~i3) & 27) | (i3 & (-28)));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.Y != 8) {
            int i7 = i5 + 103;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                z = true;
            }
            int i8 = i5 ^ 57;
            i = (((i5 & 57) | i8) << 1) - i8;
            b = i % 128;
            if (i % 2 == 0) {
                int i9 = 78 / 0;
            }
            return z;
        }
        int i10 = i5 ^ 53;
        int i11 = -(-((i5 & 53) << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        z = false;
        int i14 = i5 ^ 57;
        i = (((i5 & 57) | i14) << 1) - i14;
        b = i % 128;
        if (i % 2 == 0) {
            int i15 = 78 / 0;
        }
        return z;
    }

    public int i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 74) + ((i2 & 74) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iS = s();
        int i5 = this.O;
        int i6 = iS ^ i5;
        int i7 = -(-((iS & i5) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = b;
        int i10 = i9 ^ 73;
        int i11 = ((i9 & 73) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r7 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r7 = ((r3 & 4) + (r3 | 4)) - 1;
        ivas.gov.bisp.enumeration.p004ad.C0087m.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if ((r7 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r7 = n();
        r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a;
        r2 = ((((r1 ^ 61) | (r1 & 61)) << 1) - (~(-(((~r1) & 61) | (r1 & (-62)))))) - 1;
        ivas.gov.bisp.enumeration.p004ad.C0087m.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        n();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r7 = r1 ^ 37;
        r1 = ((r1 & 37) | r7) << 1;
        r7 = -r7;
        r3 = ((r1 | r7) << 1) - (r7 ^ r1);
        ivas.gov.bisp.enumeration.p004ad.C0087m.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if ((r3 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r7 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r7 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r7 = r3 & 105;
        r1 = (((~r7) & (r3 | 105)) - (~(r7 << 1))) - 1;
        ivas.gov.bisp.enumeration.p004ad.C0087m.a = r1 % 128;
        r1 = r1 % 2;
        r7 = k();
        r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a;
        r2 = ((r1 | 37) << 1) - (r1 ^ 37);
        ivas.gov.bisp.enumeration.p004ad.C0087m.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j(int r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 ^ 21
            r3 = r1 & 21
            r2 = r2 | r3
            r4 = 1
            int r2 = r2 << r4
            int r3 = ~r3
            r5 = r1 | 21
            r3 = r3 & r5
            int r2 = r2 - r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r3
            int r2 = r2 % r0
            r5 = 0
            if (r2 != 0) goto L1f
            r2 = 56
            int r2 = r2 / r5
            if (r7 != 0) goto L42
            goto L21
        L1f:
            if (r7 != 0) goto L42
        L21:
            r7 = r3 & 105(0x69, float:1.47E-43)
            int r1 = ~r7
            r2 = r3 | 105(0x69, float:1.47E-43)
            r1 = r1 & r2
            int r7 = r7 << r4
            int r7 = ~r7
            int r1 = r1 - r7
            int r1 = r1 - r4
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r7
            int r1 = r1 % r0
            int r7 = r6.k()
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 | 37
            int r2 = r2 << r4
            r1 = r1 ^ 37
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r2 = r2 % r0
            return r7
        L42:
            r2 = 0
            if (r7 != r4) goto L76
            r7 = r3 & 4
            r1 = r3 | 4
            int r7 = r7 + r1
            int r7 = r7 - r4
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L6f
            int r7 = r6.n()
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 ^ 61
            r3 = r1 & 61
            r2 = r2 | r3
            int r2 = r2 << r4
            r3 = r1 & (-62)
            int r1 = ~r1
            r5 = 61
            r1 = r1 & r5
            r1 = r1 | r3
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r2 = r2 % r0
            return r7
        L6f:
            r6.n()
            r2.hashCode()
            throw r2
        L76:
            r7 = r1 ^ 37
            r1 = r1 & 37
            r1 = r1 | r7
            int r1 = r1 << r4
            int r7 = -r7
            r3 = r1 | r7
            int r3 = r3 << r4
            r7 = r7 ^ r1
            int r3 = r3 - r7
            int r7 = r3 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r7
            int r3 = r3 % r0
            if (r3 == 0) goto L8a
            return r5
        L8a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.j(int):int");
    }

    public int k() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = -(-((i2 ^ 89) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int[] iArr = this.M;
        return i6 != 0 ? iArr[0] : iArr[0];
    }

    public int n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = this.M;
        return i4 == 0 ? iArr[1] : iArr[1];
    }

    public int o() {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 126) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        int iQ = q();
        if (i3 != 0) {
            return iQ >> this.P;
        }
        int i4 = this.P;
        return ((iQ & i4) << 1) + (iQ ^ i4);
    }

    public int p() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = (i3 - (~(-(-((i2 ^ 41) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0 ? this.Y != 8 : this.Y != 43) {
            int i6 = this.P;
            int i7 = i5 & 31;
            int i8 = i5 | 31;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 37 / 0;
            }
            return i6;
        }
        int i11 = (i2 & 3) + (i2 | 3);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2 != 0 ? 1 : 0;
        int i14 = i12 + 40;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return i13;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.p004ad.O) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = ((ivas.gov.bisp.enumeration.p004ad.O) r2).as;
        r2 = -(-r6.H);
        r3 = r1 & r2;
        r1 = (r1 | r2) & (~r3);
        r2 = r3 << 1;
        r3 = (r1 & r2) + (r1 | r2);
        r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a;
        r2 = ((r1 ^ 13) | (r1 & 13)) << 1;
        r1 = -(((~r1) & 13) | (r1 & (-14)));
        r4 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.p004ad.C0087m.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if ((r4 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        r0 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.p004ad.O) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int q() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r2 = r1 ^ 47
            r3 = r1 & 47
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r4 = r1 | 47
            r3 = r3 & r4
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L8a
            ivas.gov.bisp.enumeration.ad.m r2 = r6.N
            if (r2 == 0) goto L6f
            r4 = r1 & 55
            r5 = r1 | 55
            int r4 = r4 + r5
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L36
            boolean r4 = r2 instanceof ivas.gov.bisp.enumeration.p004ad.O
            r5 = 54
            int r5 = r5 / 0
            if (r4 == 0) goto L6f
            goto L3a
        L36:
            boolean r4 = r2 instanceof ivas.gov.bisp.enumeration.p004ad.O
            if (r4 == 0) goto L6f
        L3a:
            ivas.gov.bisp.enumeration.ad.O r2 = (ivas.gov.bisp.enumeration.p004ad.O) r2
            int r1 = r2.as
            int r2 = r6.H
            int r2 = -r2
            int r2 = -r2
            r3 = r1 & r2
            int r4 = ~r3
            r1 = r1 | r2
            r1 = r1 & r4
            int r2 = r3 << 1
            r3 = r1 & r2
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 ^ 13
            r4 = r1 & 13
            r2 = r2 | r4
            int r2 = r2 << 1
            r4 = r1 & (-14)
            int r1 = ~r1
            r1 = r1 & 13
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L6e
            r0 = 57
            int r0 = r0 / 0
        L6e:
            return r3
        L6f:
            int r2 = r6.H
            r4 = r1 & 35
            r1 = r1 ^ 35
            r1 = r1 | r4
            int r1 = -r1
            int r1 = -r1
            r5 = r4 ^ r1
            r1 = r1 & r4
            int r1 = r1 << 1
            int r5 = r5 + r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L86
            return r2
        L86:
            r3.hashCode()
            throw r3
        L8a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.q():int");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[PHI: r2
  0x0099: PHI (r2v23 int) = (r2v22 int), (r2v29 int) binds: [B:21:0x0097, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    public final boolean r(int i) {
        int i2;
        N[] nArr;
        N n;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = ((i8 | 123) << 1) - (i8 ^ 123);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = (i & (-5)) | ((~i) & 4);
            int i11 = (i & 4) << 1;
            i2 = ((i10 | i11) << 1) - (i11 ^ i10);
            nArr = this.K;
            n = nArr[i2];
        } else {
            i2 = i * 2;
            nArr = this.K;
            n = nArr[i2];
        }
        N n2 = n.f;
        int i12 = b;
        int i13 = (-2) - ((((i12 | 124) << 1) - (i12 ^ 124)) ^ (-1));
        a = i13 % 128;
        boolean z2 = false;
        Object obj = null;
        if (i13 % 2 != 0) {
            if (n2 != null) {
                z = false;
                if (nArr[i2].f.f != nArr[i2]) {
                    i4 = b + 111;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i14 = (i2 & (-43)) | ((~i2) & 42);
                        int i15 = (i2 & 42) << 1;
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        int i17 = i16 & 11;
                        i5 = i17 + ((i16 ^ 11) | i17);
                        if (nArr[i5].f != null) {
                            int i18 = a;
                            i6 = ((i18 ^ 41) - (~(-(-((i18 & 41) << 1))))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                N n3 = nArr[i5].f.f;
                                N n4 = nArr[i5];
                                obj.hashCode();
                                throw null;
                            }
                            if (nArr[i5].f.f != nArr[i5]) {
                                z2 = z;
                            }
                        }
                    } else {
                        int i19 = (i2 & 46) | ((~i2) & (-47));
                        int i20 = (i2 & (-47)) << 1;
                        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                        int i22 = i21 ^ 48;
                        int i23 = ((i21 & 48) | i22) << 1;
                        int i24 = -i22;
                        i5 = (i24 | i23) + (i23 & i24);
                        if (nArr[i5].f != null) {
                            int i110 = a;
                            i6 = ((i110 ^ 41) - (~(-(-((i110 & 41) << 1))))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                N n5 = nArr[i5].f.f;
                                N n6 = nArr[i5];
                                obj.hashCode();
                                throw null;
                            }
                            if (nArr[i5].f.f != nArr[i5]) {
                                z2 = z;
                            }
                        }
                    }
                }
            }
            int i25 = b;
            int i26 = ((i25 ^ 91) | (i25 & 91)) << 1;
            int i27 = -(((~i25) & 91) | (i25 & (-92)));
            i3 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return z2;
            }
            throw null;
        }
        if (n2 != null) {
            z = true;
            if (nArr[i2].f.f != nArr[i2]) {
                i4 = b + 111;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i111 = (i2 & (-43)) | ((~i2) & 42);
                    int i112 = (i2 & 42) << 1;
                    int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                    int i114 = i113 & 11;
                    i5 = i114 + ((i113 ^ 11) | i114);
                    if (nArr[i5].f != null) {
                        int i115 = a;
                        i6 = ((i115 ^ 41) - (~(-(-((i115 & 41) << 1))))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            N n7 = nArr[i5].f.f;
                            N n8 = nArr[i5];
                            obj.hashCode();
                            throw null;
                        }
                        if (nArr[i5].f.f != nArr[i5]) {
                            z2 = z;
                        }
                    }
                } else {
                    int i116 = (i2 & 46) | ((~i2) & (-47));
                    int i28 = (i2 & (-47)) << 1;
                    int i29 = (i116 ^ i28) + ((i28 & i116) << 1);
                    int i210 = i29 ^ 48;
                    int i211 = ((i29 & 48) | i210) << 1;
                    int i212 = -i210;
                    i5 = (i212 | i211) + (i211 & i212);
                    if (nArr[i5].f != null) {
                        int i117 = a;
                        i6 = ((i117 ^ 41) - (~(-(-((i117 & 41) << 1))))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            N n9 = nArr[i5].f.f;
                            N n10 = nArr[i5];
                            obj.hashCode();
                            throw null;
                        }
                        if (nArr[i5].f.f != nArr[i5]) {
                            z2 = z;
                        }
                    }
                }
            }
        }
        int i213 = b;
        int i214 = ((i213 ^ 91) | (i213 & 91)) << 1;
        int i215 = -(((~i213) & 91) | (i213 & (-92)));
        i3 = ((i214 | i215) << 1) - (i215 ^ i214);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
        int i30 = b;
        int i31 = i30 & 81;
        int i32 = (i30 ^ 81) | i31;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
        int i216 = b;
        int i217 = ((i216 ^ 91) | (i216 & 91)) << 1;
        int i218 = -(((~i216) & 91) | (i216 & (-92)));
        i3 = ((i217 | i218) << 1) - (i218 ^ i217);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public int s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        C0087m c0087m = this.N;
        if (c0087m == null || !(c0087m instanceof O)) {
            int i7 = this.U;
            int i8 = i6 ^ 21;
            int i9 = ((i6 & 21) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return i7;
        }
        int i13 = ((i2 ^ 120) + ((i2 & 120) << 1)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((O) c0087m).au;
        if (i14 != 0) {
            return i15 * this.U;
        }
        int i16 = this.U;
        return ((i15 | i16) << 1) - (i15 ^ i16);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r2.f == r1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r2 = r1 | 57
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & (-58)
            int r1 = ~r1
            r1 = r1 & 57
            r1 = r1 | r4
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r1
            int r2 = r2 % r0
            ivas.gov.bisp.enumeration.ad.N r1 = r6.B
            ivas.gov.bisp.enumeration.ad.N r2 = r1.f
            if (r2 == 0) goto L2f
            int r4 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r5 = r4 & 18
            r4 = r4 | 18
            int r5 = r5 + r4
            r4 = r5 ^ (-1)
            int r4 = (-2) - r4
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r5
            int r4 = r4 % r0
            ivas.gov.bisp.enumeration.ad.N r2 = r2.f
            if (r2 == r1) goto L42
        L2f:
            ivas.gov.bisp.enumeration.ad.N r1 = r6.C
            ivas.gov.bisp.enumeration.ad.N r2 = r1.f
            if (r2 == 0) goto L53
            int r4 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            int r4 = r4 + 17
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r5
            int r4 = r4 % r0
            ivas.gov.bisp.enumeration.ad.N r2 = r2.f
            if (r2 != r1) goto L53
        L42:
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 & 11
            r1 = r1 ^ 11
            r1 = r1 | r2
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r4 = r4 % r0
            return r3
        L53:
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            int r1 = r1 + 113
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.t():boolean");
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = ((((i2 ^ 61) | i3) << 1) - (~(-((i2 | 61) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String strU = BuildConfig.FLAVOR;
        if (i5 == 0) {
            j.w(BuildConfig.FLAVOR);
            throw null;
        }
        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
        if (this.Z != null) {
            int i6 = a;
            int i7 = i6 & 27;
            int i8 = (i7 - (~((i6 ^ 27) | i7))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            StringBuilder sbW2 = j.w("id: ");
            String str = this.Z;
            int i10 = a;
            int i11 = i10 & 41;
            int i12 = i11 + ((i10 ^ 41) | i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                strU = j.u(sbW2, str, " ");
                int i13 = 67 / 0;
            } else {
                strU = j.u(sbW2, str, " ");
            }
        }
        sbW.append(strU);
        sbW.append("(");
        int i14 = a;
        int i15 = ((i14 ^ 103) | (i14 & 103)) << 1;
        int i16 = -(((~i14) & 103) | (i14 & (-104)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        sbW.append(this.H);
        int i19 = b;
        int i20 = (i19 & (-88)) | ((~i19) & 87);
        int i21 = -(-((i19 & 87) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        sbW.append(", ");
        sbW.append(this.U);
        int i24 = a + 77;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            sbW.append(") - (");
            throw null;
        }
        sbW.append(") - (");
        int i25 = this.P;
        int i26 = b;
        int i27 = ((i26 ^ 78) + ((i26 & 78) << 1)) - 1;
        a = i27 % 128;
        if (i27 % 2 != 0) {
            sbW.append(i25);
            sbW.append(" x ");
            throw null;
        }
        sbW.append(i25);
        sbW.append(" x ");
        int i28 = a;
        int i29 = (((i28 ^ 85) | (i28 & 85)) << 1) - (((~i28) & 85) | (i28 & (-86)));
        b = i29 % 128;
        int i30 = i29 % 2;
        String strS = j.s(sbW, this.O, ")");
        int i31 = a;
        int i32 = i31 & 67;
        int i33 = (i31 ^ 67) | i32;
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        b = i34 % 128;
        int i35 = i34 % 2;
        return strS;
    }

    public void u(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 51;
        int i5 = (i4 << 1) - (i4 & (~(i3 & 51)));
        a = i5 % 128;
        int i6 = i5 % 2;
        this.M[0] = i;
        int i7 = i3 & 69;
        int i8 = (i3 ^ 69) | i7;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r4
  0x002d: PHI (r4v5 ivas.gov.bisp.enumeration.ad.N) = (r4v4 ivas.gov.bisp.enumeration.ad.N), (r4v11 ivas.gov.bisp.enumeration.ad.N) binds: [B:8:0x002b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r4.f == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean w() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 ^ 107(0x6b, float:1.5E-43)
            r3 = r1 & 107(0x6b, float:1.5E-43)
            r2 = r2 | r3
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & (-108(0xffffffffffffff94, float:NaN))
            int r1 = ~r1
            r1 = r1 & 107(0x6b, float:1.5E-43)
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r4 = r4 % r0
            r1 = 0
            ivas.gov.bisp.enumeration.ad.N r2 = r7.A
            if (r4 != 0) goto L29
            ivas.gov.bisp.enumeration.ad.N r4 = r2.f
            r5 = 72
            int r5 = r5 / r1
            if (r4 == 0) goto L31
            goto L2d
        L29:
            ivas.gov.bisp.enumeration.ad.N r4 = r2.f
            if (r4 == 0) goto L31
        L2d:
            ivas.gov.bisp.enumeration.ad.N r4 = r4.f
            if (r4 == r2) goto L4b
        L31:
            ivas.gov.bisp.enumeration.ad.N r2 = r7.E
            ivas.gov.bisp.enumeration.ad.N r4 = r2.f
            if (r4 == 0) goto L5c
            int r5 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r6 = r5 & 94
            r5 = r5 | 94
            int r6 = r6 + r5
            int r6 = r6 + (-1)
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r5
            int r6 = r6 % r0
            if (r6 != 0) goto L55
            ivas.gov.bisp.enumeration.ad.N r4 = r4.f
            if (r4 != r2) goto L5c
        L4b:
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            int r1 = r1 + 83
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r2
            int r1 = r1 % r0
            return r3
        L55:
            ivas.gov.bisp.enumeration.ad.N r0 = r4.f
            r0 = 0
            r0.hashCode()
            throw r0
        L5c:
            int r2 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r4 = r2 | 61
            int r4 = r4 << r3
            r5 = r2 & (-62)
            int r2 = ~r2
            r6 = 61
            r2 = r2 & r6
            r2 = r2 | r5
            int r2 = -r2
            r5 = r4 | r2
            int r3 = r5 << 1
            r2 = r2 ^ r4
            int r3 = r3 - r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r2
            int r3 = r3 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.w():boolean");
    }

    public void y(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 123;
        int i5 = -(-((i3 ^ 123) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.O = i;
        int i9 = this.S;
        if (i < i9) {
            int i10 = (i7 & 81) + (i7 | 81);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.O = i9;
                int i11 = 98 / 0;
            } else {
                this.O = i9;
            }
        }
        int i12 = ((i7 | 71) << 1) - (i7 ^ 71);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void z(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 11;
        int i5 = ((((i3 & 11) | i4) << 1) - (~(-i4))) - 1;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i < 0) {
            this.V = 0;
            int i6 = i3 & 125;
            int i7 = (i3 ^ 125) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.V = i;
        int i9 = ((i3 | 50) << 1) - (i3 ^ 50);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void A(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-102)) | ((~i3) & 101)) - (~((i3 & 101) << 1))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (i >= 0) {
            this.S = i;
            int i7 = i5 & 99;
            int i8 = ((i5 ^ 99) | i7) << 1;
            int i9 = -((~i7) & (i5 | 99));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i11 = (i3 ^ 125) + ((i3 & 125) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        this.S = 0;
        int i14 = ((i12 ^ 51) | (i12 & 51)) << 1;
        int i15 = -(((~i12) & 51) | (i12 & (-52)));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    public void D(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 23;
        int i5 = ((i3 & 23) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        this.P = i;
        int i10 = this.V;
        if (i < i10) {
            int i11 = i8 + 63;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            this.P = i10;
            int i14 = i12 + 45;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 ^ 85;
        int i18 = (i16 & 85) << 1;
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[PHI: r1 r8
  0x0045: PHI (r1v17 ivas.gov.bisp.enumeration.ad.N) = (r1v16 ivas.gov.bisp.enumeration.ad.N), (r1v21 ivas.gov.bisp.enumeration.ad.N) binds: [B:10:0x0043, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r8v18 ivas.gov.bisp.enumeration.ad.N) = (r8v17 ivas.gov.bisp.enumeration.ad.N), (r8v26 ivas.gov.bisp.enumeration.ad.N) binds: [B:10:0x0043, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    public C0087m m(int i) {
        int i2;
        C0087m c0087m;
        int i3;
        N n;
        N n2;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 ^ 43) | (i6 & 43)) << 1;
        int i8 = -((i6 & (-44)) | ((~i6) & 43));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        Object obj = null;
        if (i == 0) {
            int i12 = i10 & 21;
            int i13 = -(-((i10 ^ 21) | i12));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                n = this.B;
                n2 = n.f;
                int i15 = 75 / 0;
                if (n2 != null) {
                    if (n2.f == n) {
                        int i16 = a;
                        int i17 = i16 & 73;
                        int i18 = ((((i16 ^ 73) | i17) << 1) - (~(-((i16 | 73) & (~i17))))) - 1;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        C0087m c0087m2 = n2.d;
                        i4 = b + 109;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i20 = 61 / 0;
                        }
                        return c0087m2;
                    }
                }
            } else {
                n = this.B;
                n2 = n.f;
                if (n2 != null) {
                    if (n2.f == n) {
                        int i110 = a;
                        int i111 = i110 & 73;
                        int i112 = ((((i110 ^ 73) | i111) << 1) - (~(-((i110 | 73) & (~i111))))) - 1;
                        b = i112 % 128;
                        int i113 = i112 % 2;
                        C0087m c0087m3 = n2.d;
                        i4 = b + 109;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i21 = 61 / 0;
                        }
                        return c0087m3;
                    }
                }
            }
        } else if (i == 1) {
            int i22 = i6 ^ 83;
            int i23 = (i6 & 83) << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            N n3 = this.A;
            N n4 = n3.f;
            if (i25 == 0) {
                int i26 = 31 / 0;
                if (n4 != null) {
                    if (n4.f == n3) {
                        i2 = b + 5;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            C0087m c0087m4 = n4.d;
                            obj.hashCode();
                            throw null;
                        }
                        c0087m = n4.d;
                        int i27 = a;
                        int i28 = (i27 & (-68)) | ((~i27) & 67);
                        int i29 = (i27 & 67) << 1;
                        i3 = (i28 ^ i29) + ((i29 & i28) << 1);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            return c0087m;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            } else if (n4 != null) {
                if (n4.f == n3) {
                    i2 = b + 5;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        C0087m c0087m5 = n4.d;
                        obj.hashCode();
                        throw null;
                    }
                    c0087m = n4.d;
                    int i210 = a;
                    int i211 = (i210 & (-68)) | ((~i210) & 67);
                    int i212 = (i210 & 67) << 1;
                    i3 = (i211 ^ i212) + ((i212 & i211) << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        return c0087m;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i30 = b + 79;
        a = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0342  */
    /* JADX WARN: Code duplicated, block: B:116:0x0349  */
    /* JADX WARN: Code duplicated, block: B:142:0x0402  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:201:0x0567  */
    /* JADX WARN: Code duplicated, block: B:203:0x056f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0575  */
    /* JADX WARN: Code duplicated, block: B:206:0x0582  */
    /* JADX WARN: Code duplicated, block: B:208:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:211:0x05dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:212:0x05de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:222:0x0609  */
    /* JADX WARN: Code duplicated, block: B:226:0x062a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0633  */
    /* JADX WARN: Code duplicated, block: B:229:0x063d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0645  */
    /* JADX WARN: Code duplicated, block: B:233:0x0659  */
    /* JADX WARN: Code duplicated, block: B:239:0x067e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0682  */
    /* JADX WARN: Code duplicated, block: B:243:0x0688  */
    /* JADX WARN: Code duplicated, block: B:257:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:25:0x0126  */
    /* JADX WARN: Code duplicated, block: B:268:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:272:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:278:0x06de  */
    /* JADX WARN: Code duplicated, block: B:280:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:283:0x0704  */
    /* JADX WARN: Code duplicated, block: B:285:0x0709  */
    /* JADX WARN: Code duplicated, block: B:286:0x070e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0711  */
    /* JADX WARN: Code duplicated, block: B:289:0x0716  */
    /* JADX WARN: Code duplicated, block: B:297:0x0737 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x0739  */
    /* JADX WARN: Code duplicated, block: B:299:0x073c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0741  */
    /* JADX WARN: Code duplicated, block: B:302:0x0748  */
    /* JADX WARN: Code duplicated, block: B:304:0x074e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0816 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:79:0x0238  */
    /* JADX WARN: Code duplicated, block: B:83:0x0247  */
    /* JADX WARN: Code duplicated, block: B:85:0x0251  */
    /* JADX WARN: Code duplicated, block: B:87:0x0255  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x025c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0263  */
    /* JADX WARN: Code duplicated, block: B:94:0x026c  */
    /* JADX WARN: Code duplicated, block: B:95:0x028d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0290  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a3  */
    public final void f(i iVar, boolean z, boolean z2, boolean z3, boolean z4, t tVar, t tVar2, int i, boolean z5, N n, N n2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, int i6, int i7, int i8, int i9, float f2, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int iMin;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        int i15;
        N.aTW atw;
        N.aTW atw2;
        t tVarN;
        t tVarN2;
        int i16;
        int i17;
        boolean z15;
        boolean z16;
        t tVar3;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i18;
        int i19;
        int i20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        t tVar4;
        int i21;
        C0087m c0087m;
        t tVar5;
        t tVar6;
        C0087m c0087m2;
        int iMin2;
        int i22;
        t tVar7;
        boolean z26;
        int i23;
        int i24;
        int i25;
        int iD;
        C0087m c0087m3;
        int i26;
        int i27;
        int iD2;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z27;
        int i35 = i8;
        int i36 = i9;
        int i37 = 2 % 2;
        int i38 = b;
        int i39 = (i38 & 15) + (i38 | 15);
        a = i39 % 128;
        int i40 = i39 % 2;
        N.aTW atw3 = N.aTW.h;
        t tVarN3 = iVar.n(n);
        int i41 = a;
        int i42 = i41 & 89;
        int i43 = ((i41 ^ 89) | i42) << 1;
        int i44 = -((~i42) & (i41 | 89));
        int i45 = (i43 & i44) + (i43 | i44);
        b = i45 % 128;
        int i46 = i45 % 2;
        t tVarN4 = iVar.n(n2);
        int i47 = b;
        int i48 = i47 & 13;
        int i49 = -(-((i47 ^ 13) | i48));
        int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
        a = i50 % 128;
        Object obj = null;
        if (i50 % 2 != 0) {
            iVar.n(n.f);
            obj.hashCode();
            throw null;
        }
        t tVarN5 = iVar.n(n.f);
        t tVarN6 = iVar.n(n2.f);
        boolean zF = n.f();
        boolean zF2 = n2.f();
        boolean zF3 = this.J.f();
        if (zF2) {
            int i51 = b + 107;
            a = i51 % 128;
            int i52 = i51 % 2;
            int i53 = ((!zF ? 1 : 0) | ((zF ? 1 : 0) & 1)) << 1;
            int i54 = -(((zF ? 1 : 0) & (-2)) | ((~(zF ? 1 : 0)) & 1));
            i11 = (i53 & i54) + (i53 | i54);
            i10 = 125;
        } else {
            int i55 = a;
            int i56 = ((i55 ^ 125) | (i55 & 125)) << 1;
            i10 = 125;
            int i57 = -((i55 & (-126)) | (125 & (~i55)));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            b = i58 % 128;
            int i59 = i58 % 2;
            i11 = zF ? 1 : 0;
        }
        if (zF3) {
            int i60 = a;
            int i61 = (i60 & (-76)) | ((~i60) & 75);
            int i62 = -(-((i60 & 75) << 1));
            int i63 = (i61 & i62) + (i62 | i61);
            b = i63 % 128;
            if (i63 % 2 != 0) {
                i11 = (i11 ^ 1) + ((i11 & 1) << 1);
            }
        }
        int i64 = z6 ? 3 : i6;
        if (i == 0) {
            throw null;
        }
        int i65 = (i - (~((~i) | i))) - 1;
        if (i65 == 0 || i65 == 1) {
            z11 = false;
        } else {
            int i66 = b;
            int i67 = i66 & 67;
            int i68 = -(-((i66 ^ 67) | i67));
            int i69 = (i67 ^ i68) + ((i67 & i68) << 1);
            a = i69 % 128;
            int i70 = i69 % 2;
            if (i65 != 2 || i64 == 4) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (this.Y == 8) {
            iMin = 0;
            z12 = false;
        } else {
            z12 = z11;
            iMin = i3;
        }
        if (!z10) {
            z13 = zF3;
        } else if (zF || zF2 || zF3) {
            z13 = zF3;
            if (zF && !zF2) {
                iVar.g(tVarN3, tVarN5, n.d(), 8);
                int i71 = a;
                int i72 = i71 ^ 77;
                int i73 = -(-((i71 & 77) << 1));
                int i74 = (i72 & i73) + (i73 | i72);
                b = i74 % 128;
                int i75 = i74 % 2;
            }
        } else {
            iVar.i(tVarN3, i2);
            int i76 = a + 79;
            z13 = zF3;
            b = i76 % 128;
            if (i76 % 2 == 0) {
                int i77 = 5 / 3;
            }
        }
        if (!z12) {
            if (z5) {
                iVar.g(tVarN4, tVarN3, 0, 3);
                if (i4 > 0) {
                    iVar.h(tVarN4, tVarN3, i4, 8);
                }
                if (i5 < Integer.MAX_VALUE) {
                    iVar.j(tVarN4, tVarN3, i5, 8);
                }
            } else {
                iVar.g(tVarN4, tVarN3, iMin, 8);
                int i78 = b;
                int i79 = i78 & 119;
                int i80 = i78 | 119;
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                a = i81 % 128;
                int i82 = i81 % 2;
            }
            z14 = z4;
            i13 = i35;
            i14 = i36;
            z15 = z12;
        } else if (i11 != 2) {
            int i83 = b;
            int i84 = (i83 & (-38)) | ((~i83) & 37);
            int i85 = -(-((i83 & 37) << 1));
            int i86 = (i84 & i85) + (i85 | i84);
            a = i86 % 128;
            int i87 = i86 % 2;
            if ((!z6) && (i64 == 1 || i64 == 0)) {
                int iMax = Math.max(i35, iMin);
                if (i36 > 0) {
                    iMax = Math.min(i36, iMax);
                }
                iVar.g(tVarN4, tVarN3, iMax, 8);
                n = n;
            } else {
                if (i35 == -2) {
                    i35 = iMin;
                }
                if (i36 == -2) {
                    i36 = iMin;
                }
                if (iMin > 0) {
                    int i88 = a;
                    int i89 = (i88 ^ 89) + ((i88 & 89) << 1);
                    i17 = i89 % 128;
                    b = i17;
                    int i90 = i89 % 2;
                    if (i64 != 1) {
                        int i91 = (i17 & 107) + (i17 | 107);
                        a = i91 % 128;
                        int i92 = i91 % 2;
                        iMin = 0;
                    }
                }
                if (i35 > 0) {
                    iVar.h(tVarN4, tVarN3, i35, 8);
                    iMin = Math.max(iMin, i35);
                }
                if (i36 > 0) {
                    int i93 = b;
                    int i94 = i93 & 5;
                    int i95 = i93 | 5;
                    i16 = (i94 ^ i95) + ((i94 & i95) << 1);
                    a = i16 % 128;
                    if (i16 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (z2 || i64 != 1) {
                        i12 = 8;
                        iVar.j(tVarN4, tVarN3, i36, 8);
                    } else {
                        int i96 = i93 + 67;
                        a = i96 % 128;
                        int i97 = i96 % 2;
                        i12 = 8;
                    }
                    iMin = Math.min(iMin, i36);
                } else {
                    i12 = 8;
                }
                if (i64 == 1) {
                    if (z2) {
                        iVar.g(tVarN4, tVarN3, iMin, i12);
                    } else {
                        if (z7) {
                            iVar.g(tVarN4, tVarN3, iMin, 5);
                            iVar.j(tVarN4, tVarN3, iMin, i12);
                        } else {
                            iVar.g(tVarN4, tVarN3, iMin, 5);
                            int i98 = a;
                            int i99 = i98 & 113;
                            int i100 = (((i98 ^ 113) | i99) << 1) - ((i98 | 113) & (~i99));
                            b = i100 % 128;
                            int i101 = i100 % 2;
                            iVar.j(tVarN4, tVarN3, iMin, 8);
                        }
                        z14 = z4;
                        i13 = i35;
                        i14 = i36;
                    }
                    z14 = z4;
                    i13 = i35;
                    i14 = i36;
                } else if (i64 == 2) {
                    int i102 = b;
                    i15 = ((i102 ^ 102) + ((i102 & 102) << 1)) - 1;
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        N.aTW atw4 = n.e;
                        N.aTW atw5 = N.aTW.e;
                        throw null;
                    }
                    n = n;
                    atw = n.e;
                    atw2 = N.aTW.e;
                    if (atw != atw2 || atw == atw3) {
                        tVarN = iVar.n(this.N.g(atw2));
                        int i103 = b;
                        int i104 = i103 & 1;
                        int i105 = (i103 ^ 1) | i104;
                        int i106 = (i104 & i105) + (i105 | i104);
                        a = i106 % 128;
                        int i107 = i106 % 2;
                        tVarN2 = iVar.n(this.N.g(atw3));
                    } else {
                        int i108 = b;
                        int i109 = i108 & 71;
                        int i110 = (i108 ^ 71) | i109;
                        int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        N nG = this.N.g(N.aTW.d);
                        if (i112 != 0) {
                            iVar.n(nG);
                            throw null;
                        }
                        tVarN = iVar.n(nG);
                        N nG2 = this.N.g(N.aTW.f);
                        int i113 = b;
                        int i114 = i113 & 51;
                        int i115 = (i114 - (~(-(-((i113 ^ 51) | i114))))) - 1;
                        a = i115 % 128;
                        if (i115 % 2 != 0) {
                            iVar.n(nG2);
                            obj.hashCode();
                            throw null;
                        }
                        tVarN2 = iVar.n(nG2);
                    }
                    t tVar8 = tVarN;
                    r rVarP = iVar.p();
                    rVarP.h(tVarN4, tVarN3, tVarN2, tVar8, f2);
                    iVar.f(rVarP);
                } else {
                    i13 = i35;
                    i14 = i36;
                    z14 = true;
                }
                z15 = z12;
            }
            z14 = z4;
            i13 = i35;
            i14 = i36;
            z15 = false;
        } else {
            if (i35 == -2) {
                i35 = iMin;
            }
            if (i36 == -2) {
                i36 = iMin;
            }
            if (iMin > 0) {
                int i810 = a;
                int i811 = (i810 ^ 89) + ((i810 & 89) << 1);
                i17 = i811 % 128;
                b = i17;
                int i910 = i811 % 2;
                if (i64 != 1) {
                    int i911 = (i17 & 107) + (i17 | 107);
                    a = i911 % 128;
                    int i912 = i911 % 2;
                    iMin = 0;
                }
            }
            if (i35 > 0) {
                iVar.h(tVarN4, tVarN3, i35, 8);
                iMin = Math.max(iMin, i35);
            }
            if (i36 > 0) {
                int i913 = b;
                int i914 = i913 & 5;
                int i915 = i913 | 5;
                i16 = (i914 ^ i915) + ((i914 & i915) << 1);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z2) {
                    i12 = 8;
                    iVar.j(tVarN4, tVarN3, i36, 8);
                } else {
                    i12 = 8;
                    iVar.j(tVarN4, tVarN3, i36, 8);
                }
                iMin = Math.min(iMin, i36);
            } else {
                i12 = 8;
            }
            if (i64 == 1) {
                if (z2) {
                    iVar.g(tVarN4, tVarN3, iMin, i12);
                } else {
                    if (z7) {
                        iVar.g(tVarN4, tVarN3, iMin, 5);
                        iVar.j(tVarN4, tVarN3, iMin, i12);
                    } else {
                        iVar.g(tVarN4, tVarN3, iMin, 5);
                        int i916 = a;
                        int i917 = i916 & 113;
                        int i1010 = (((i916 ^ 113) | i917) << 1) - ((i916 | 113) & (~i917));
                        b = i1010 % 128;
                        int i1011 = i1010 % 2;
                        iVar.j(tVarN4, tVarN3, iMin, 8);
                    }
                    z14 = z4;
                    i13 = i35;
                    i14 = i36;
                }
                z14 = z4;
                i13 = i35;
                i14 = i36;
            } else if (i64 == 2) {
                int i1012 = b;
                i15 = ((i1012 ^ 102) + ((i1012 & 102) << 1)) - 1;
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    N.aTW atw6 = n.e;
                    N.aTW atw7 = N.aTW.e;
                    throw null;
                }
                n = n;
                atw = n.e;
                atw2 = N.aTW.e;
                if (atw != atw2) {
                    tVarN = iVar.n(this.N.g(atw2));
                    int i1013 = b;
                    int i1014 = i1013 & 1;
                    int i1015 = (i1013 ^ 1) | i1014;
                    int i1016 = (i1014 & i1015) + (i1015 | i1014);
                    a = i1016 % 128;
                    int i1017 = i1016 % 2;
                    tVarN2 = iVar.n(this.N.g(atw3));
                } else {
                    tVarN = iVar.n(this.N.g(atw2));
                    int i1018 = b;
                    int i1019 = i1018 & 1;
                    int i10110 = (i1018 ^ 1) | i1019;
                    int i10111 = (i1019 & i10110) + (i10110 | i1019);
                    a = i10111 % 128;
                    int i10112 = i10111 % 2;
                    tVarN2 = iVar.n(this.N.g(atw3));
                }
                t tVar9 = tVarN;
                r rVarP2 = iVar.p();
                rVarP2.h(tVarN4, tVarN3, tVarN2, tVar9, f2);
                iVar.f(rVarP2);
                z14 = z4;
                i13 = i35;
                i14 = i36;
                z15 = false;
            } else {
                i13 = i35;
                i14 = i36;
                z14 = true;
            }
            z15 = z12;
        }
        if (!z10 || z7) {
            boolean z28 = z14;
            int i116 = i10;
            if (i11 < 2) {
                int i117 = b;
                int i118 = ((i117 | 114) << 1) - (i117 ^ 114);
                int i119 = (i118 ^ (-1)) + (i118 << 1);
                a = i119 % 128;
                if (i119 % 2 != 0) {
                    throw null;
                }
                if (z2 && z28) {
                    iVar.h(tVarN3, tVar, 0, 8);
                    if (z || this.D.f == null) {
                        int i120 = a;
                        int i121 = (i120 & (-108)) | ((~i120) & 107);
                        int i122 = -(-((i120 & 107) << 1));
                        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                        b = i123 % 128;
                        int i124 = i123 % 2;
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z) {
                        int i125 = a + 3;
                        b = i125 % 128;
                        if (i125 % 2 == 0) {
                            N n3 = this.D.f;
                            throw null;
                        }
                        N n4 = this.D.f;
                        if (n4 != null) {
                            C0087m c0087m4 = n4.d;
                            if (c0087m4.Q == 0.0f) {
                                return;
                            }
                            int[] iArr = c0087m4.M;
                            if (iArr[0] != 3 || iArr[1] != 3) {
                                return;
                            }
                        } else if (!z16) {
                            return;
                        }
                    } else if (!z16) {
                        return;
                    }
                    int i126 = a;
                    int i127 = ((i126 | 97) << 1) - (i126 ^ 97);
                    b = i127 % 128;
                    if (i127 % 2 == 0) {
                        iVar.h(tVar2, tVarN4, 0, i116);
                        return;
                    } else {
                        iVar.h(tVar2, tVarN4, 0, 8);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((!zF && !zF2 && !z13) || (zF && !zF2)) {
            tVar3 = tVarN6;
        } else {
            if (zF || !zF2) {
                tVar3 = tVarN6;
                if ((!zF ? 1 : 0) != 1 && zF2) {
                    C0087m c0087m5 = n.f.d;
                    N n5 = n2.f;
                    int i128 = a;
                    int i129 = ((i128 ^ 68) + ((i128 & 68) << 1)) - 1;
                    b = i129 % 128;
                    int i130 = i129 % 2;
                    C0087m c0087m6 = n5.d;
                    C0087m c0087m7 = this.N;
                    int i131 = 6;
                    if (z15) {
                        int i132 = a;
                        int i133 = i132 ^ 97;
                        z17 = z15;
                        int i134 = -(-((i132 & 97) << 1));
                        int i135 = (i133 ^ i134) + ((i133 & i134) << 1);
                        z18 = z14;
                        int i136 = i135 % 128;
                        b = i136;
                        int i137 = i135 % 2;
                        if (i64 == 0) {
                            if (i14 == 0) {
                                int i138 = i136 | 15;
                                int i139 = (i138 << 1) - (i138 & (~(i136 & 15)));
                                a = i139 % 128;
                                int i140 = i139 % 2;
                                if (i13 == 0) {
                                    i34 = 8;
                                    z27 = false;
                                    z21 = true;
                                    i19 = 8;
                                } else {
                                    i34 = 5;
                                    z27 = true;
                                    z21 = false;
                                    i19 = 5;
                                }
                            } else {
                                i34 = 5;
                                z27 = true;
                                z21 = false;
                                i19 = 5;
                            }
                            boolean z29 = z27;
                            if ((c0087m5 instanceof x) || (c0087m6 instanceof x)) {
                                int i141 = a;
                                int i142 = i141 & 97;
                                int i143 = (i141 ^ 97) | i142;
                                int i144 = (i142 & i143) + (i143 | i142);
                                b = i144 % 128;
                                int i145 = i144 % 2;
                                z23 = false;
                                i20 = 4;
                            } else {
                                z23 = false;
                                i20 = i34;
                            }
                            z22 = z29;
                        } else if (i64 == 1) {
                            i64 = i64;
                            z19 = true;
                            z20 = true;
                            i18 = 8;
                            i19 = i18;
                            i20 = 4;
                            z21 = false;
                            z22 = z20;
                            z23 = z19;
                            i131 = 6;
                        } else if (i64 == 3) {
                            int i146 = i132 + 95;
                            int i147 = i146 % 128;
                            b = i147;
                            int i148 = i146 % 2;
                            i64 = i64;
                            if (this.u == -1) {
                                if (!z8) {
                                    i131 = 8;
                                } else {
                                    int i149 = ((i147 & 40) + (i147 | 40)) - 1;
                                    int i150 = i149 % 128;
                                    a = i150;
                                    int i151 = i149 % 2;
                                    if (z2) {
                                        int i152 = (i150 | 61) << 1;
                                        int i153 = -((61 & (~i150)) | (i150 & (-62)));
                                        int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                                        b = i154 % 128;
                                        int i155 = i154 % 2;
                                        i131 = 5;
                                    } else {
                                        i131 = 4;
                                    }
                                }
                                i31 = 8;
                            } else {
                                if (z6) {
                                    int i156 = ((i132 ^ 94) + ((i132 & 94) << 1)) - 1;
                                    b = i156 % 128;
                                    int i157 = i156 % 2;
                                    if (i7 == 2 || i7 == 1) {
                                        i33 = 4;
                                        i31 = 5;
                                    } else {
                                        i33 = 5;
                                        i31 = 8;
                                    }
                                    i32 = i33;
                                    i131 = 6;
                                } else if (i14 > 0) {
                                    int i158 = i132 & 31;
                                    int i159 = i158 + ((i132 ^ 31) | i158);
                                    b = i159 % 128;
                                    int i160 = i159 % 2;
                                    i131 = 6;
                                    i31 = 5;
                                } else if (i14 != 0 || i13 != 0) {
                                    i30 = 5;
                                    i31 = i30;
                                    i131 = 6;
                                    i32 = 4;
                                } else if (z8) {
                                    if (c0087m5 != c0087m7) {
                                        int i161 = i132 & 91;
                                        int i162 = -(-(i132 | 91));
                                        int i163 = (i161 ^ i162) + ((i161 & i162) << 1);
                                        b = i163 % 128;
                                        if (i163 % 2 == 0) {
                                            throw null;
                                        }
                                        if (c0087m6 != c0087m7) {
                                            i30 = 4;
                                        } else {
                                            i30 = 5;
                                        }
                                    } else {
                                        i30 = 5;
                                    }
                                    i31 = i30;
                                    i131 = 6;
                                    i32 = 4;
                                } else {
                                    int i164 = ((i132 | 31) << 1) - (i132 ^ 31);
                                    b = i164 % 128;
                                    int i165 = i164 % 2;
                                    i131 = 6;
                                    i31 = 5;
                                    i32 = 8;
                                }
                                i19 = i31;
                                i20 = i32;
                                z23 = true;
                                z22 = true;
                                z21 = true;
                            }
                            i32 = 5;
                            i19 = i31;
                            i20 = i32;
                            z23 = true;
                            z22 = true;
                            z21 = true;
                        } else {
                            z19 = false;
                            z20 = false;
                        }
                        if (z23 || tVarN5 != tVar3 || c0087m5 == c0087m7) {
                            z24 = z23;
                            z25 = true;
                        } else {
                            int i166 = b;
                            int i167 = i166 & 51;
                            int i168 = (((i166 ^ 51) | i167) << 1) - ((~i167) & (i166 | 51));
                            a = i168 % 128;
                            z25 = i168 % 2 != 0;
                            z24 = false;
                        }
                        if (z22) {
                            if (this.Y == 8) {
                                int i169 = b + 79;
                                a = i169 % 128;
                                int i170 = i169 % 2;
                                i29 = 4;
                            } else {
                                i29 = i131;
                            }
                            int iD3 = n.d();
                            int iD4 = n2.d();
                            int i171 = b;
                            int i172 = (i171 ^ 77) + ((i171 & 77) << 1);
                            a = i172 % 128;
                            int i173 = i172 % 2;
                            tVar4 = tVar3;
                            c0087m = c0087m7;
                            i21 = 2;
                            iVar.e(tVarN3, tVarN5, iD3, f, tVar4, tVarN4, iD4, i29);
                        } else {
                            tVar4 = tVar3;
                            i21 = 2;
                            c0087m = c0087m7;
                        }
                        if (this.Y == 8) {
                            return;
                        }
                        if (z24) {
                            int i174 = a;
                            int i175 = i174 & 23;
                            int i176 = -(-((i174 ^ 23) | i175));
                            int i177 = ((i175 | i176) << 1) - (i176 ^ i175);
                            b = i177 % 128;
                            int i178 = i177 % i21;
                            tVar5 = tVar4;
                            if (z2 || tVarN5 == tVar5 || z17) {
                                c0087m2 = c0087m5;
                            } else {
                                c0087m2 = c0087m5;
                                if ((c0087m2 instanceof x) || (c0087m6 instanceof x)) {
                                    i27 = 6;
                                }
                                iVar.h(tVarN3, tVarN5, n.d(), i27);
                                iD2 = n2.d();
                                int i179 = a;
                                int i180 = i179 & 111;
                                i28 = ((i179 | 111) & (~i180)) + (i180 << 1);
                                b = i28 % 128;
                                if (i28 % i21 == 0) {
                                    iVar.j(tVarN4, tVar5, -iD2, i27);
                                    obj.hashCode();
                                    throw null;
                                }
                                tVar6 = tVarN4;
                                iVar.j(tVar6, tVar5, -iD2, i27);
                                i19 = i27;
                            }
                            i27 = i19;
                            iVar.h(tVarN3, tVarN5, n.d(), i27);
                            iD2 = n2.d();
                            int i1710 = a;
                            int i181 = i1710 & 111;
                            i28 = ((i1710 | 111) & (~i181)) + (i181 << 1);
                            b = i28 % 128;
                            if (i28 % i21 == 0) {
                                iVar.j(tVarN4, tVar5, -iD2, i27);
                                obj.hashCode();
                                throw null;
                            }
                            tVar6 = tVarN4;
                            iVar.j(tVar6, tVar5, -iD2, i27);
                            i19 = i27;
                        } else {
                            tVar5 = tVar4;
                            tVar6 = tVarN4;
                            c0087m2 = c0087m5;
                        }
                        if (z2) {
                            int i182 = b;
                            int i183 = i182 & 73;
                            i26 = (i183 - (~(-(-((i182 ^ 73) | i183))))) - 1;
                            int i184 = i26 % 128;
                            a = i184;
                            if (i26 % i21 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (z9 || (c0087m2 instanceof x)) {
                                iMin2 = i20;
                                i22 = i19;
                            } else {
                                int i185 = i184 & 35;
                                int i186 = i185 + ((i184 ^ 35) | i185);
                                int i187 = i186 % 128;
                                b = i187;
                                int i188 = i186 % i21;
                                if (c0087m6 instanceof x) {
                                    iMin2 = i20;
                                    i22 = i19;
                                } else {
                                    int i189 = (i187 & 107) + (i187 | 107);
                                    a = i189 % 128;
                                    int i190 = i189 % i21;
                                    iMin2 = 6;
                                    i22 = 6;
                                    z25 = true;
                                }
                            }
                        } else {
                            iMin2 = i20;
                            i22 = i19;
                        }
                        if (z25) {
                            if (z21 || !((!z8) || z3)) {
                                c0087m3 = c0087m;
                            } else {
                                c0087m3 = c0087m;
                                if (c0087m2 != c0087m3 && c0087m6 != c0087m3) {
                                    i131 = iMin2;
                                }
                                if (c0087m2 instanceof Q) {
                                    i131 = 5;
                                } else {
                                    int i191 = b + 77;
                                    a = i191 % 128;
                                    int i192 = i191 % i21;
                                    if (c0087m6 instanceof Q) {
                                        i131 = 5;
                                    }
                                }
                                if (!(!(c0087m2 instanceof x)) || !(!(c0087m6 instanceof x))) {
                                    i131 = 5;
                                }
                                iMin2 = Math.max(z8 ? 5 : i131, iMin2);
                            }
                            if (!(!z2)) {
                                iMin2 = Math.min(i22, iMin2);
                                if (!(!z6) && (!z8)) {
                                    if (c0087m2 != c0087m3) {
                                        int i193 = b;
                                        int i194 = i193 & 61;
                                        int i195 = -(-((i193 ^ 61) | i194));
                                        int i196 = (i194 & i195) + (i195 | i194);
                                        a = i196 % 128;
                                        int i197 = i196 % i21;
                                        if (c0087m6 == c0087m3) {
                                            iMin2 = 4;
                                        }
                                    } else {
                                        iMin2 = 4;
                                    }
                                }
                            }
                            iVar.g(tVarN3, tVarN5, n.d(), iMin2);
                            iVar.g(tVar6, tVar5, -n2.d(), iMin2);
                        }
                        if (z2) {
                            tVar7 = tVarN3;
                            if (tVar == tVarN5) {
                                iD = n.d();
                            } else {
                                iD = 0;
                            }
                            if (tVarN5 != tVar) {
                                iVar.h(tVar7, tVar, iD, 5);
                            }
                        } else {
                            tVar7 = tVarN3;
                        }
                        if (z2 && z17 != 0) {
                            z26 = z17;
                            if (i4 == 0 && i13 == 0) {
                                int i198 = a;
                                int i199 = (i198 & (-72)) | ((~i198) & 71);
                                int i200 = (i198 & 71) << 1;
                                i23 = (i199 & i200) + (i200 | i199);
                                b = i23 % 128;
                                if (i23 % i21 != 0) {
                                    throw null;
                                }
                                if (!z26) {
                                    i25 = 5;
                                    i24 = 0;
                                } else if (i64 == 3) {
                                    iVar.h(tVar6, tVar7, 0, 8);
                                } else {
                                    i24 = 0;
                                    i25 = 5;
                                }
                                iVar.h(tVar6, tVar7, i24, i25);
                            }
                        }
                    } else {
                        z17 = z15;
                        z18 = z14;
                        z19 = true;
                        z20 = true;
                    }
                    int i201 = a;
                    int i202 = ((i201 | 56) << 1) - (i201 ^ 56);
                    int i203 = (i202 ^ (-1)) + (i202 << 1);
                    b = i203 % 128;
                    int i204 = i203 % 2;
                    i18 = 5;
                    i19 = i18;
                    i20 = 4;
                    z21 = false;
                    z22 = z20;
                    z23 = z19;
                    i131 = 6;
                    if (z23) {
                        z24 = z23;
                        z25 = true;
                    } else {
                        z24 = z23;
                        z25 = true;
                    }
                    if (z22) {
                        if (this.Y == 8) {
                            int i1610 = b + 79;
                            a = i1610 % 128;
                            int i1711 = i1610 % 2;
                            i29 = 4;
                        } else {
                            i29 = i131;
                        }
                        int iD5 = n.d();
                        int iD6 = n2.d();
                        int i1712 = b;
                        int i1713 = (i1712 ^ 77) + ((i1712 & 77) << 1);
                        a = i1713 % 128;
                        int i1714 = i1713 % 2;
                        tVar4 = tVar3;
                        c0087m = c0087m7;
                        i21 = 2;
                        iVar.e(tVarN3, tVarN5, iD5, f, tVar4, tVarN4, iD6, i29);
                    } else {
                        tVar4 = tVar3;
                        i21 = 2;
                        c0087m = c0087m7;
                    }
                    if (this.Y == 8) {
                        return;
                    }
                    if (z24) {
                        int i1715 = a;
                        int i1716 = i1715 & 23;
                        int i1717 = -(-((i1715 ^ 23) | i1716));
                        int i1718 = ((i1716 | i1717) << 1) - (i1717 ^ i1716);
                        b = i1718 % 128;
                        int i1719 = i1718 % i21;
                        tVar5 = tVar4;
                        if (z2) {
                            c0087m2 = c0087m5;
                            i27 = i19;
                        } else {
                            c0087m2 = c0087m5;
                            i27 = i19;
                        }
                        iVar.h(tVarN3, tVarN5, n.d(), i27);
                        iD2 = n2.d();
                        int i17110 = a;
                        int i1810 = i17110 & 111;
                        i28 = ((i17110 | 111) & (~i1810)) + (i1810 << 1);
                        b = i28 % 128;
                        if (i28 % i21 == 0) {
                            iVar.j(tVarN4, tVar5, -iD2, i27);
                            obj.hashCode();
                            throw null;
                        }
                        tVar6 = tVarN4;
                        iVar.j(tVar6, tVar5, -iD2, i27);
                        i19 = i27;
                    } else {
                        tVar5 = tVar4;
                        tVar6 = tVarN4;
                        c0087m2 = c0087m5;
                    }
                    if (z2) {
                        int i1811 = b;
                        int i1812 = i1811 & 73;
                        i26 = (i1812 - (~(-(-((i1811 ^ 73) | i1812))))) - 1;
                        int i1813 = i26 % 128;
                        a = i1813;
                        if (i26 % i21 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (z9) {
                            iMin2 = i20;
                            i22 = i19;
                        } else {
                            iMin2 = i20;
                            i22 = i19;
                        }
                    } else {
                        iMin2 = i20;
                        i22 = i19;
                    }
                    if (z25) {
                        if (z21) {
                            c0087m3 = c0087m;
                        } else {
                            c0087m3 = c0087m;
                        }
                        if (!(!z2)) {
                            iMin2 = Math.min(i22, iMin2);
                            if (!(!z6)) {
                                if (c0087m2 != c0087m3) {
                                    int i1910 = b;
                                    int i1911 = i1910 & 61;
                                    int i1912 = -(-((i1910 ^ 61) | i1911));
                                    int i1913 = (i1911 & i1912) + (i1912 | i1911);
                                    a = i1913 % 128;
                                    int i1914 = i1913 % i21;
                                    if (c0087m6 == c0087m3) {
                                        iMin2 = 4;
                                    }
                                } else {
                                    iMin2 = 4;
                                }
                            }
                        }
                        iVar.g(tVarN3, tVarN5, n.d(), iMin2);
                        iVar.g(tVar6, tVar5, -n2.d(), iMin2);
                    }
                    if (z2) {
                        tVar7 = tVarN3;
                        if (tVar == tVarN5) {
                            iD = n.d();
                        } else {
                            iD = 0;
                        }
                        if (tVarN5 != tVar) {
                            iVar.h(tVar7, tVar, iD, 5);
                        }
                    } else {
                        tVar7 = tVarN3;
                    }
                    if (z2) {
                        z26 = z17;
                        if (i4 == 0) {
                            int i1915 = a;
                            int i1916 = (i1915 & (-72)) | ((~i1915) & 71);
                            int i205 = (i1915 & 71) << 1;
                            i23 = (i1916 & i205) + (i205 | i1916);
                            b = i23 % 128;
                            if (i23 % i21 != 0) {
                                throw null;
                            }
                            if (!z26) {
                                i25 = 5;
                                i24 = 0;
                            } else if (i64 == 3) {
                                iVar.h(tVar6, tVar7, 0, 8);
                            } else {
                                i24 = 0;
                                i25 = 5;
                            }
                            iVar.h(tVar6, tVar7, i24, i25);
                        }
                    }
                }
                if (z2 || !z18) {
                }
                int i206 = b;
                int i207 = ((i206 & 12) + (i206 | 12)) - 1;
                a = i207 % 128;
                if (i207 % i21 != 0) {
                    N n6 = n2.f;
                    obj.hashCode();
                    throw null;
                }
                int iD7 = n2.f != null ? n2.d() : 0;
                if (tVar5 != tVar2) {
                    iVar.h(tVar2, tVar6, iD7, 5);
                    int i208 = b;
                    int i209 = i208 ^ 101;
                    int i210 = (i208 & 101) << 1;
                    int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                    a = i211 % 128;
                    if (i211 % i21 != 0) {
                        int i212 = 4 / 5;
                        return;
                    }
                    return;
                }
                return;
            }
            int i213 = a;
            int i214 = i213 & 91;
            int i215 = -(-((i213 ^ 91) | i214));
            int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
            b = i216 % 128;
            int i217 = i216 % 2;
            iVar.g(tVarN4, tVar3, -n2.d(), 8);
            if (z2) {
                tVar3 = tVarN6;
                iVar.h(tVarN3, tVar, 0, 5);
            }
        }
        tVar3 = tVarN6;
        tVar5 = tVar3;
        tVar6 = tVarN4;
        z18 = z14;
        i21 = 2;
        if (z2) {
        }
    }

    public void h(i iVar) {
        N n;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 38) + (i2 | 38)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            iVar.n(this.B);
            n = this.A;
            int i4 = 54 / 0;
        } else {
            iVar.n(this.B);
            n = this.A;
        }
        iVar.n(n);
        iVar.n(this.C);
        int i5 = a;
        int i6 = (i5 & (-42)) | ((~i5) & 41);
        int i7 = -(-((i5 & 41) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        iVar.n(this.E);
        if (this.T > 0) {
            int i10 = b;
            int i11 = (((i10 ^ 41) | (i10 & 41)) << 1) - (((~i10) & 41) | (i10 & (-42)));
            a = i11 % 128;
            int i12 = i11 % 2;
            iVar.n(this.D);
            int i13 = a;
            int i14 = i13 & 1;
            int i15 = ((i13 ^ 1) | i14) << 1;
            int i16 = -((i13 | 1) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = a + 70;
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 96 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r1.f == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1.f == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r8 = r1.d;
        r1 = (-2) - ((ivas.gov.bisp.enumeration.p004ad.C0087m.a + 118) ^ (-1));
        ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p004ad.C0087m l(int r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r2 = r1 & 83
            r1 = r1 ^ 83
            r1 = r1 | r2
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r1
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L1b
            r2 = 15
            int r2 = r2 / 0
            if (r8 != 0) goto L58
            goto L1d
        L1b:
            if (r8 != 0) goto L58
        L1d:
            ivas.gov.bisp.enumeration.ad.N r8 = r7.C
            ivas.gov.bisp.enumeration.ad.N r1 = r8.f
            if (r1 == 0) goto L98
            int r2 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r5 = r2 & 47
            r2 = r2 ^ 47
            r2 = r2 | r5
            int r2 = -r2
            int r2 = -r2
            r6 = r5 | r2
            int r6 = r6 << r4
            r2 = r2 ^ r5
            int r6 = r6 - r2
            int r2 = r6 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r2
            int r6 = r6 % r0
            if (r6 == 0) goto L41
            ivas.gov.bisp.enumeration.ad.N r2 = r1.f
            r5 = 66
            int r5 = r5 / 0
            if (r2 != r8) goto L98
            goto L45
        L41:
            ivas.gov.bisp.enumeration.ad.N r2 = r1.f
            if (r2 != r8) goto L98
        L45:
            ivas.gov.bisp.enumeration.ad.m r8 = r1.d
            int r1 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            int r1 = r1 + 118
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L57
            return r8
        L57:
            throw r3
        L58:
            if (r8 != r4) goto L98
            r8 = r1 & 21
            r1 = r1 ^ 21
            r1 = r1 | r8
            int r1 = ~r1
            int r8 = r8 - r1
            int r8 = r8 - r4
            int r1 = r8 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r1
            int r8 = r8 % r0
            ivas.gov.bisp.enumeration.ad.N r8 = r7.E
            ivas.gov.bisp.enumeration.ad.N r1 = r8.f
            if (r1 == 0) goto L98
            int r2 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r5 = r2 ^ 31
            r2 = r2 & 31
            r2 = r2 | r5
            int r2 = r2 << r4
            int r5 = -r5
            int r5 = ~r5
            int r2 = r2 - r5
            int r2 = r2 - r4
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r5
            int r2 = r2 % r0
            ivas.gov.bisp.enumeration.ad.N r2 = r1.f
            if (r2 != r8) goto L98
            int r8 = ivas.gov.bisp.enumeration.p004ad.C0087m.b
            r2 = r8 ^ 109(0x6d, float:1.53E-43)
            r8 = r8 & 109(0x6d, float:1.53E-43)
            r8 = r8 | r2
            int r8 = r8 << r4
            int r8 = r8 - r2
            int r2 = r8 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.a = r2
            int r8 = r8 % r0
            if (r8 != 0) goto L95
            ivas.gov.bisp.enumeration.ad.m r8 = r1.d
            return r8
        L95:
            ivas.gov.bisp.enumeration.ad.m r8 = r1.d
            throw r3
        L98:
            int r8 = ivas.gov.bisp.enumeration.p004ad.C0087m.a
            r1 = r8 ^ 73
            r2 = r8 & 73
            r1 = r1 | r2
            int r1 = r1 << r4
            int r2 = ~r2
            r8 = r8 | 73
            r8 = r8 & r2
            int r8 = -r8
            r2 = r1 ^ r8
            r8 = r8 & r1
            int r8 = r8 << r4
            int r2 = r2 + r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.p004ad.C0087m.b = r8
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.l(int):ivas.gov.bisp.enumeration.ad.m");
    }

    public void x(e eVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = -(-(i2 | 3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.B.g();
            this.A.g();
            throw null;
        }
        this.B.g();
        this.A.g();
        int i6 = a;
        int i7 = (((i6 | 10) << 1) - (i6 ^ 10)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        this.C.g();
        this.E.g();
        int i9 = a;
        int i10 = (i9 & 11) + (i9 | 11);
        b = i10 % 128;
        int i11 = i10 % 2;
        this.D.g();
        this.J.g();
        int i12 = a;
        int i13 = i12 & 89;
        int i14 = (i12 | 89) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i14 | i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            this.F.g();
            this.G.g();
        } else {
            this.F.g();
            this.G.g();
            int i17 = 36 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1 A[PHI: r14
  0x01a1: PHI (r14v40 int) = (r14v39 int), (r14v50 int) binds: [B:67:0x019f, B:64:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    public void C(boolean z, boolean z2) {
        D d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = a;
        int i11 = ((i10 & (-2)) | ((~i10) & 1)) + ((i10 & 1) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            d = this.g;
            boolean z3 = d.j;
            i = ((z ? 1 : 0) | (z3 ? 1 : 0)) & (~((z ? 1 : 0) & (z3 ? 1 : 0)));
        } else {
            d = this.g;
            i = (z ? 1 : 0) & (d.j ? 1 : 0);
        }
        X x = this.i;
        boolean z4 = z2 & x.j;
        int i12 = a + 49;
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = d.k.j;
        int i15 = x.k.j;
        int i16 = b + 18;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        a = i17 % 128;
        Object obj = null;
        if (i17 % 2 != 0) {
            int i18 = d.c.j;
            int i19 = x.c.j;
            obj.hashCode();
            throw null;
        }
        int i20 = d.c.j;
        int i21 = x.c.j;
        int i22 = -i14;
        int i23 = i20 & i22;
        if ((((i20 ^ i22) | i23) << 1) - ((i22 | i20) & (~i23)) >= 0) {
            int i24 = a;
            int i25 = ((i24 & 88) + (i24 | 88)) - 1;
            int i26 = i25 % 128;
            b = i26;
            if (i25 % 2 != 0) {
                int i27 = -i15;
                if ((i21 ^ i27) + ((i27 & i21) << 1) >= 0) {
                    if (i14 != Integer.MIN_VALUE) {
                        int i28 = ((i26 ^ 109) | (i26 & 109)) << 1;
                        int i29 = -((i26 & (-110)) | ((~i26) & 109));
                        i4 = (i28 ^ i29) + ((i28 & i29) << 1);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i30 = 54 / 0;
                            if (i14 != Integer.MAX_VALUE) {
                                if (i15 != Integer.MIN_VALUE) {
                                    int i31 = (-2) - ((((i26 | 62) << 1) - (i26 ^ 62)) ^ (-1));
                                    i5 = i31 % 128;
                                    a = i5;
                                    int i32 = i31 % 2;
                                    if (i15 != Integer.MAX_VALUE) {
                                        int i33 = i5 + 117;
                                        b = i33 % 128;
                                        int i34 = i33 % 2;
                                        if (i20 != Integer.MIN_VALUE) {
                                            int i35 = ((i5 | 117) << 1) - (i5 ^ 117);
                                            i6 = i35 % 128;
                                            b = i6;
                                            int i36 = i35 % 2;
                                            if (i20 != Integer.MAX_VALUE) {
                                                i7 = (i6 & 35) + (i6 | 35);
                                                i8 = i7 % 128;
                                                a = i8;
                                                if (i7 % 2 == 0) {
                                                    throw null;
                                                }
                                                if (i21 != Integer.MIN_VALUE) {
                                                    int i37 = (i8 & 1) + (i8 | 1);
                                                    b = i37 % 128;
                                                    int i38 = i37 % 2;
                                                    if (i21 == Integer.MAX_VALUE) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i14 != Integer.MAX_VALUE) {
                            if (i15 != Integer.MIN_VALUE) {
                                int i39 = (-2) - ((((i26 | 62) << 1) - (i26 ^ 62)) ^ (-1));
                                i5 = i39 % 128;
                                a = i5;
                                int i310 = i39 % 2;
                                if (i15 != Integer.MAX_VALUE) {
                                    int i311 = i5 + 117;
                                    b = i311 % 128;
                                    int i312 = i311 % 2;
                                    if (i20 != Integer.MIN_VALUE) {
                                        int i313 = ((i5 | 117) << 1) - (i5 ^ 117);
                                        i6 = i313 % 128;
                                        b = i6;
                                        int i314 = i313 % 2;
                                        if (i20 != Integer.MAX_VALUE) {
                                            i7 = (i6 & 35) + (i6 | 35);
                                            i8 = i7 % 128;
                                            a = i8;
                                            if (i7 % 2 == 0) {
                                                throw null;
                                            }
                                            if (i21 != Integer.MIN_VALUE) {
                                                int i315 = (i8 & 1) + (i8 | 1);
                                                b = i315 % 128;
                                                int i316 = i315 % 2;
                                                if (i21 == Integer.MAX_VALUE) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i21 % i15 >= 0) {
                if (i14 != Integer.MIN_VALUE) {
                    int i210 = ((i26 ^ 109) | (i26 & 109)) << 1;
                    int i211 = -((i26 & (-110)) | ((~i26) & 109));
                    i4 = (i210 ^ i211) + ((i210 & i211) << 1);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i317 = 54 / 0;
                        if (i14 != Integer.MAX_VALUE) {
                            if (i15 != Integer.MIN_VALUE) {
                                int i318 = (-2) - ((((i26 | 62) << 1) - (i26 ^ 62)) ^ (-1));
                                i5 = i318 % 128;
                                a = i5;
                                int i319 = i318 % 2;
                                if (i15 != Integer.MAX_VALUE) {
                                    int i3110 = i5 + 117;
                                    b = i3110 % 128;
                                    int i3111 = i3110 % 2;
                                    if (i20 != Integer.MIN_VALUE) {
                                        int i3112 = ((i5 | 117) << 1) - (i5 ^ 117);
                                        i6 = i3112 % 128;
                                        b = i6;
                                        int i3113 = i3112 % 2;
                                        if (i20 != Integer.MAX_VALUE) {
                                            i7 = (i6 & 35) + (i6 | 35);
                                            i8 = i7 % 128;
                                            a = i8;
                                            if (i7 % 2 == 0) {
                                                throw null;
                                            }
                                            if (i21 != Integer.MIN_VALUE) {
                                                int i3114 = (i8 & 1) + (i8 | 1);
                                                b = i3114 % 128;
                                                int i3115 = i3114 % 2;
                                                if (i21 == Integer.MAX_VALUE) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i14 != Integer.MAX_VALUE) {
                        if (i15 != Integer.MIN_VALUE) {
                            int i3116 = (-2) - ((((i26 | 62) << 1) - (i26 ^ 62)) ^ (-1));
                            i5 = i3116 % 128;
                            a = i5;
                            int i3117 = i3116 % 2;
                            if (i15 != Integer.MAX_VALUE) {
                                int i3118 = i5 + 117;
                                b = i3118 % 128;
                                int i3119 = i3118 % 2;
                                if (i20 != Integer.MIN_VALUE) {
                                    int i31110 = ((i5 | 117) << 1) - (i5 ^ 117);
                                    i6 = i31110 % 128;
                                    b = i6;
                                    int i31111 = i31110 % 2;
                                    if (i20 != Integer.MAX_VALUE) {
                                        i7 = (i6 & 35) + (i6 | 35);
                                        i8 = i7 % 128;
                                        a = i8;
                                        if (i7 % 2 == 0) {
                                            throw null;
                                        }
                                        if (i21 != Integer.MIN_VALUE) {
                                            int i31112 = (i8 & 1) + (i8 | 1);
                                            b = i31112 % 128;
                                            int i31113 = i31112 % 2;
                                            if (i21 == Integer.MAX_VALUE) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i40 = a;
            int i41 = i40 & 109;
            int i42 = (i40 | 109) & (~i41);
            int i43 = -(-(i41 << 1));
            int i44 = (i42 & i43) + (i42 | i43);
            b = i44 % 128;
            int i45 = i44 % 2;
            i20 = 0;
            i21 = 0;
            i14 = 0;
            i15 = 0;
        } else {
            int i46 = a;
            int i47 = i46 & 109;
            int i48 = (i46 | 109) & (~i47);
            int i49 = -(-(i47 << 1));
            int i410 = (i48 & i49) + (i48 | i49);
            b = i410 % 128;
            int i411 = i410 % 2;
            i20 = 0;
            i21 = 0;
            i14 = 0;
            i15 = 0;
        }
        int i50 = -i14;
        int i51 = ((((i20 ^ i50) | (i20 & i50)) << 1) - (~(-(((~i20) & i50) | ((~i50) & i20))))) - 1;
        int i52 = -i15;
        int i53 = ((~i52) & i21) | ((~i21) & i52);
        int i54 = (i52 & i21) << 1;
        int i55 = (i53 & i54) + (i54 | i53);
        if (i != 0) {
            int i56 = a + 5;
            b = i56 % 128;
            if (i56 % 2 == 0) {
                this.H = i14;
                throw null;
            }
            this.H = i14;
        }
        if (z4) {
            int i57 = a + 1;
            b = i57 % 128;
            if (i57 % 2 == 0) {
                this.U = i15;
                int i58 = 53 / 0;
            } else {
                this.U = i15;
            }
        }
        if (this.Y == 8) {
            int i59 = b;
            int i60 = (i59 & 11) + (i59 | 11);
            a = i60 % 128;
            int i61 = i60 % 2;
            this.P = 0;
            this.O = 0;
            int i62 = i59 & 103;
            int i63 = -(-((i59 ^ 103) | i62));
            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
            a = i64 % 128;
            if (i64 % 2 != 0) {
                int i65 = 22 / 0;
                return;
            }
            return;
        }
        if (i != 0) {
            int i66 = b + 21;
            int i67 = i66 % 128;
            a = i67;
            int i68 = i66 % 2;
            if (this.M[0] == 1) {
                int i69 = i67 ^ 103;
                int i70 = ((((i67 & 103) | i69) << 1) - (~(-i69))) - 1;
                b = i70 % 128;
                if (i70 % 2 == 0) {
                    i2 = this.P;
                    int i71 = 43 / 0;
                    if (i51 < i2) {
                        i51 = i2;
                        int i72 = i67 & 67;
                        int i73 = (((~i72) & (i67 | 67)) - (~(-(-(i72 << 1))))) - 1;
                        b = i73 % 128;
                        int i74 = i73 % 2;
                        i3 = i67 + 97;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i75 = 2 % 5;
                        }
                    }
                } else {
                    i2 = this.P;
                    if (i51 < i2) {
                        i51 = i2;
                        int i76 = i67 & 67;
                        int i77 = (((~i76) & (i67 | 67)) - (~(-(-(i76 << 1))))) - 1;
                        b = i77 % 128;
                        int i78 = i77 % 2;
                        i3 = i67 + 97;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i79 = 2 % 5;
                        }
                    }
                }
            }
            this.P = i51;
            int i80 = this.V;
            if (i51 < i80) {
                int i81 = (i67 ^ 13) + ((i67 & 13) << 1);
                b = i81 % 128;
                int i82 = i81 % 2;
                this.P = i80;
                if (i82 == 0) {
                    int i83 = 51 / 0;
                }
            }
        }
        if (z4) {
            int i84 = b;
            int i85 = (i84 & 81) + (i84 | 81);
            int i86 = i85 % 128;
            a = i86;
            int i87 = i85 % 2;
            if (this.M[1] == 1) {
                int i88 = i86 & 125;
                int i89 = i88 + ((i86 ^ 125) | i88);
                int i90 = i89 % 128;
                b = i90;
                if (i89 % 2 == 0) {
                    throw null;
                }
                int i91 = this.O;
                if (i55 < i91) {
                    int i92 = i90 & 115;
                    int i93 = -(-(i90 | 115));
                    int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                    a = i94 % 128;
                    if (i94 % 2 != 0) {
                        throw null;
                    }
                    int i95 = i90 ^ 85;
                    int i96 = ((i90 & 85) | i95) << 1;
                    int i97 = -i95;
                    int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                    a = i98 % 128;
                    int i99 = i98 % 2;
                    i55 = i91;
                }
            }
            this.O = i55;
            int i100 = this.S;
            if (i55 < i100) {
                int i101 = a;
                int i102 = (i101 ^ 1) + ((i101 & 1) << 1);
                b = i102 % 128;
                int i103 = i102 % 2;
                this.O = i100;
                if (i103 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i104 = b;
        int i105 = i104 & 105;
        int i106 = -(-(i104 | 105));
        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
        a = i107 % 128;
        if (i107 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public N g(N.aTW atw) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 122) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        switch (atw.ordinal()) {
            case 0:
                int i4 = b;
                int i5 = i4 & 59;
                int i6 = (i4 | 59) & (~i5);
                int i7 = -(-(i5 << 1));
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 84 / 0;
                }
                return null;
            case 1:
                N n = this.B;
                int i10 = b + 13;
                a = i10 % 128;
                int i11 = i10 % 2;
                return n;
            case 2:
                N n2 = this.A;
                int i12 = b + 111;
                a = i12 % 128;
                int i13 = i12 % 2;
                return n2;
            case 3:
                N n3 = this.C;
                int i14 = a;
                int i15 = (i14 & 32) + (i14 | 32);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                return n3;
            case 4:
                N n4 = this.E;
                int i18 = a;
                int i19 = ((i18 | 65) << 1) - (i18 ^ 65);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 14 / 0;
                }
                return n4;
            case 5:
                N n5 = this.D;
                int i21 = a;
                int i22 = i21 & 49;
                int i23 = (i21 ^ 49) | i22;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 14 / 0;
                }
                return n5;
            case 6:
                N n6 = this.J;
                int i26 = a;
                int i27 = ((i26 ^ 32) + ((i26 & 32) << 1)) - 1;
                b = i27 % 128;
                int i28 = i27 % 2;
                return n6;
            case 7:
                N n7 = this.F;
                int i29 = b;
                int i30 = i29 & 57;
                int i31 = ((i29 ^ 57) | i30) << 1;
                int i32 = -((i29 | 57) & (~i30));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    return n7;
                }
                throw null;
            case 8:
                N n8 = this.G;
                int i34 = b;
                int i35 = (i34 & 31) + (i34 | 31);
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 37 / 0;
                }
                return n8;
            default:
                throw new AssertionError(atw.name());
        }
    }

    public void v() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 74) ^ (-1));
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.B.h();
            this.A.h();
            this.C.h();
            this.E.h();
            this.D.h();
            obj.hashCode();
            throw null;
        }
        this.B.h();
        this.A.h();
        this.C.h();
        this.E.h();
        this.D.h();
        int i3 = a;
        int i4 = i3 ^ 89;
        int i5 = -(-((i3 & 89) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.F.h();
            this.G.h();
            this.J.h();
            this.N = null;
            this.y = 0.0f;
            this.P = 1;
        } else {
            this.F.h();
            this.G.h();
            this.J.h();
            this.N = null;
            this.y = 0.0f;
            this.P = 0;
        }
        this.O = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.H = 0;
        this.U = 0;
        this.T = 0;
        this.V = 0;
        int i7 = b;
        int i8 = i7 + 111;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            this.S = 0;
            this.W = 0.5f;
            this.af = 0.5f;
            int[] iArr = this.M;
            iArr[1] = 1;
            iArr[1] = 1;
        } else {
            this.S = 0;
            this.W = 0.5f;
            this.af = 0.5f;
            int[] iArr2 = this.M;
            iArr2[0] = 1;
            iArr2[1] = 1;
        }
        this.X = null;
        this.Y = 0;
        this.aa = 0;
        this.ab = 0;
        float[] fArr = this.ac;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.k = -1;
        int i9 = ((((i7 ^ 73) | (i7 & 73)) << 1) - (~(-((i7 & (-74)) | ((~i7) & 73))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        this.c = -1;
        int[] iArr3 = this.w;
        iArr3[0] = Integer.MAX_VALUE;
        iArr3[1] = Integer.MAX_VALUE;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        int i11 = ((i7 | 27) << 1) - (i7 ^ 27);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            this.s = 1.0f;
            this.f65o = Integer.MAX_VALUE;
            this.t = Integer.MAX_VALUE;
            this.p = 1;
            this.r = 0;
            this.u = -1;
            this.x = 0.0f;
        } else {
            this.s = 1.0f;
            this.f65o = Integer.MAX_VALUE;
            this.t = Integer.MAX_VALUE;
            this.p = 0;
            this.r = 0;
            this.u = -1;
            this.x = 1.0f;
        }
        boolean[] zArr = this.h;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.I;
        zArr2[0] = false;
        zArr2[1] = false;
        int i12 = i7 & 45;
        int i13 = ((~i12) & (i7 | 45)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    public void E(i iVar) {
        int i;
        int i2;
        s sVar;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 85) + ((i5 & 85) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            iVar.q(this.B);
            obj.hashCode();
            throw null;
        }
        int iQ = iVar.q(this.B);
        int iQ2 = iVar.q(this.A);
        N n = this.C;
        int i7 = b;
        int i8 = ((i7 & 93) - (~(-(-(i7 | 93))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            iVar.q(n);
            iVar.q(this.E);
            obj.hashCode();
            throw null;
        }
        int iQ3 = iVar.q(n);
        int iQ4 = iVar.q(this.E);
        D d = this.g;
        s sVar2 = d.k;
        int i9 = a + 121;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            boolean z = sVar2.l;
            obj.hashCode();
            throw null;
        }
        if (!(!sVar2.l)) {
            int i10 = b;
            int i11 = (-2) - (((i10 & 112) + (i10 | 112)) ^ (-1));
            a = i11 % 128;
            if (i11 % 2 != 0) {
                boolean z2 = d.c.l;
                throw null;
            }
            s sVar3 = d.c;
            if (sVar3.l) {
                iQ = sVar2.j;
                iQ3 = sVar3.j;
                int i12 = b;
                int i13 = (((i12 | 34) << 1) - (i12 ^ 34)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        X x = this.i;
        s sVar4 = x.k;
        int i15 = b;
        int i16 = (((i15 | 54) << 1) - (i15 ^ 54)) - 1;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 80 / 0;
            if (!(!sVar4.l)) {
                i2 = a + 13;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z3 = x.c.l;
                    throw null;
                }
                sVar = x.c;
                if (sVar.l) {
                    int i18 = b;
                    i3 = ((i18 | 125) << 1) - (i18 ^ 125);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i19 = sVar4.j;
                        int i20 = sVar.j;
                        obj.hashCode();
                        throw null;
                    }
                    iQ2 = sVar4.j;
                    iQ4 = sVar.j;
                    int i21 = b + 71;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
        } else if (sVar4.l) {
            i2 = a + 13;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z4 = x.c.l;
                throw null;
            }
            sVar = x.c;
            if (sVar.l) {
                int i110 = b;
                i3 = ((i110 | 125) << 1) - (i110 ^ 125);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i111 = sVar4.j;
                    int i23 = sVar.j;
                    obj.hashCode();
                    throw null;
                }
                iQ2 = sVar4.j;
                iQ4 = sVar.j;
                int i24 = b + 71;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        int i26 = -iQ;
        int i27 = iQ3 & i26;
        int i28 = -(-((i26 ^ iQ3) | i27));
        if (((i27 | i28) << 1) - (i28 ^ i27) >= 0) {
            int i29 = b;
            int i30 = ((i29 ^ 40) + ((i29 & 40) << 1)) - 1;
            int i31 = i30 % 128;
            a = i31;
            if (i30 % 2 == 0) {
                int i32 = -iQ2;
                if ((((iQ4 ^ i32) | (iQ4 & i32)) << 1) - ((i32 & (~iQ4)) | ((~i32) & iQ4)) >= 0) {
                    int i33 = i31 & 59;
                    int i34 = ((~i33) & (i31 | 59)) + (i33 << 1);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    if (iQ != Integer.MIN_VALUE) {
                        int i36 = i31 & 73;
                        int i37 = -(-(i31 | 73));
                        i = ((i36 | i37) << 1) - (i36 ^ i37);
                        b = i % 128;
                        if (i % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iQ == Integer.MAX_VALUE) {
                        }
                    }
                }
            } else if (iQ4 / iQ2 >= 0) {
                int i38 = i31 & 59;
                int i39 = ((~i38) & (i31 | 59)) + (i38 << 1);
                b = i39 % 128;
                int i310 = i39 % 2;
                if (iQ != Integer.MIN_VALUE) {
                    int i311 = i31 & 73;
                    int i312 = -(-(i31 | 73));
                    i = ((i311 | i312) << 1) - (i311 ^ i312);
                    b = i % 128;
                    if (i % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iQ == Integer.MAX_VALUE && iQ2 != Integer.MIN_VALUE) {
                        int i40 = i31 & 11;
                        int i41 = -(-((i31 ^ 11) | i40));
                        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        if (iQ2 != Integer.MAX_VALUE) {
                            int i44 = i31 & 35;
                            int i45 = (i31 ^ 35) | i44;
                            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                            int i47 = i46 % 128;
                            b = i47;
                            int i48 = i46 % 2;
                            if (iQ3 != Integer.MIN_VALUE) {
                                int i49 = i47 ^ 11;
                                int i50 = ((i47 & 11) | i49) << 1;
                                int i51 = -i49;
                                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                                int i53 = i52 % 128;
                                a = i53;
                                int i54 = i52 % 2;
                                if (iQ3 != Integer.MAX_VALUE) {
                                    int i55 = i53 & 119;
                                    int i56 = -(-((i53 ^ 119) | i55));
                                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                    int i58 = i57 % 128;
                                    b = i58;
                                    if (i57 % 2 == 0) {
                                        throw null;
                                    }
                                    if (iQ4 != Integer.MIN_VALUE) {
                                        int i59 = i58 & 75;
                                        int i60 = (i58 ^ 75) | i59;
                                        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                                        a = i61 % 128;
                                        int i62 = i61 % 2;
                                        if (iQ4 == Integer.MAX_VALUE) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i63 = a;
            int i64 = (((i63 | 8) << 1) - (i63 ^ 8)) - 1;
            b = i64 % 128;
            int i65 = i64 % 2;
            iQ4 = 0;
            iQ = 0;
            iQ2 = 0;
            iQ3 = 0;
        } else {
            int i66 = a;
            int i67 = (((i66 | 8) << 1) - (i66 ^ 8)) - 1;
            b = i67 % 128;
            int i68 = i67 % 2;
            iQ4 = 0;
            iQ = 0;
            iQ2 = 0;
            iQ3 = 0;
        }
        int i69 = (iQ3 - (~(-iQ))) - 1;
        int i70 = -iQ2;
        int i71 = iQ4 & i70;
        int i72 = ((iQ4 ^ i70) | i71) << 1;
        int i73 = -((iQ4 | i70) & (~i71));
        int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
        int i75 = a;
        int i76 = (((i75 | 40) << 1) - (i75 ^ 40)) - 1;
        b = i76 % 128;
        int i77 = i76 % 2;
        this.H = iQ;
        int i78 = i75 ^ 111;
        int i79 = ((i75 & 111) | i78) << 1;
        int i80 = -i78;
        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
        int i82 = i81 % 128;
        b = i82;
        int i83 = i81 % 2;
        this.U = iQ2;
        if (this.Y == 8) {
            int i84 = (-2) - ((((i82 | 78) << 1) - (i82 ^ 78)) ^ (-1));
            a = i84 % 128;
            int i85 = i84 % 2;
            this.P = 0;
            this.O = 0;
            int i86 = i82 & 31;
            int i87 = ((i82 ^ 31) | i86) << 1;
            int i88 = -((~i86) & (i82 | 31));
            int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
            a = i89 % 128;
            int i90 = i89 % 2;
            return;
        }
        int[] iArr = this.M;
        if (iArr[0] == 1) {
            int i91 = ((i75 & 119) - (~(i75 | 119))) - 1;
            b = i91 % 128;
            int i92 = i91 % 2;
            int i93 = this.P;
            if (i69 < i93) {
                int i94 = i75 + 75;
                b = i94 % 128;
                if (i94 % 2 == 0) {
                    throw null;
                }
                i69 = i93;
            }
        }
        if (iArr[1] == 1) {
            int i95 = (i75 & 119) + (i75 | 119);
            int i96 = i95 % 128;
            b = i96;
            int i97 = i95 % 2;
            int i98 = this.O;
            int i99 = i96 + 18;
            int i100 = (i99 ^ (-1)) + (i99 << 1);
            int i101 = i100 % 128;
            a = i101;
            int i102 = i100 % 2;
            if (i74 < i98) {
                int i103 = i101 & 15;
                int i104 = (((i101 ^ 15) | i103) << 1) - ((i101 | 15) & (~i103));
                int i105 = i104 % 128;
                b = i105;
                if (i104 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i106 = ((i105 ^ 56) + ((i105 & 56) << 1)) - 1;
                a = i106 % 128;
                int i107 = i106 % 2;
                i74 = i98;
            }
        }
        this.P = i69;
        this.O = i74;
        int i108 = this.S;
        int i109 = b;
        int i112 = i109 + 43;
        a = i112 % 128;
        if (i112 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i74 < i108) {
            int i113 = i109 & 103;
            int i114 = (i109 ^ 103) | i113;
            int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
            int i116 = i115 % 128;
            a = i116;
            int i117 = i115 % 2;
            this.O = i108;
            int i118 = (i116 ^ 3) + ((i116 & 3) << 1);
            b = i118 % 128;
            int i119 = i118 % 2;
        }
        int i120 = this.V;
        if (i69 < i120) {
            int i121 = b + 9;
            a = i121 % 128;
            if (i121 % 2 != 0) {
                this.P = i120;
                obj.hashCode();
                throw null;
            }
            this.P = i120;
        }
        int i122 = a;
        int i123 = ((i122 | 121) << 1) - (i122 ^ 121);
        b = i123 % 128;
        if (i123 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:166:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:174:0x0406  */
    /* JADX WARN: Code duplicated, block: B:176:0x040c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0414  */
    /* JADX WARN: Code duplicated, block: B:181:0x0420  */
    /* JADX WARN: Code duplicated, block: B:183:0x0428  */
    /* JADX WARN: Code duplicated, block: B:186:0x0461  */
    /* JADX WARN: Code duplicated, block: B:189:0x0467  */
    /* JADX WARN: Code duplicated, block: B:191:0x0478  */
    /* JADX WARN: Code duplicated, block: B:193:0x047c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x0487  */
    /* JADX WARN: Code duplicated, block: B:199:0x0498  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:229:0x0518  */
    /* JADX WARN: Code duplicated, block: B:245:0x057e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0588  */
    /* JADX WARN: Code duplicated, block: B:253:0x0592  */
    /* JADX WARN: Code duplicated, block: B:256:0x0599  */
    /* JADX WARN: Code duplicated, block: B:258:0x059d  */
    /* JADX WARN: Code duplicated, block: B:259:0x059f  */
    /* JADX WARN: Code duplicated, block: B:262:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:264:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:280:0x061c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0624  */
    /* JADX WARN: Code duplicated, block: B:284:0x062a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0632  */
    /* JADX WARN: Code duplicated, block: B:288:0x0684  */
    /* JADX WARN: Code duplicated, block: B:289:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:291:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:295:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:311:0x0753  */
    /* JADX WARN: Code duplicated, block: B:315:0x0767 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0782  */
    /* JADX WARN: Code duplicated, block: B:321:0x0788  */
    /* JADX WARN: Code duplicated, block: B:323:0x078b  */
    /* JADX WARN: Code duplicated, block: B:325:0x078f  */
    /* JADX WARN: Code duplicated, block: B:327:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:333:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:334:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:337:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:339:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:340:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:342:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:345:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:347:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:349:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:351:0x0808  */
    /* JADX WARN: Code duplicated, block: B:353:0x0821  */
    /* JADX WARN: Code duplicated, block: B:354:0x082b  */
    /* JADX WARN: Code duplicated, block: B:357:0x0849  */
    /* JADX WARN: Code duplicated, block: B:359:0x084d  */
    /* JADX WARN: Code duplicated, block: B:363:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:364:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:367:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:369:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:370:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:371:0x0906  */
    /* JADX WARN: Code duplicated, block: B:374:0x090f  */
    /* JADX WARN: Code duplicated, block: B:376:0x0974  */
    /* JADX WARN: Code duplicated, block: B:377:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:379:0x09c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x018c A[PHI: r0
  0x018c: PHI (r0v244 int[]) = (r0v243 int[]), (r0v257 int[]) binds: [B:44:0x018a, B:41:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x018e A[PHI: r0
  0x018e: PHI (r0v256 int[]) = (r0v243 int[]), (r0v257 int[]) binds: [B:44:0x018a, B:41:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0530, code lost:
    
        if (r4 != 4) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0535, code lost:
    
        if (r13 != 3) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0537, code lost:
    
        r32 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x053a, code lost:
    
        r32 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(ivas.gov.bisp.enumeration.p003ac.i r49) {
        /*
            Method dump skipped, instruction units count: 2506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p004ad.C0087m.d(ivas.gov.bisp.enumeration.ac.i):void");
    }
}
