package ivas.gov.bisp.enumeration.p050bw;

import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p035bh.C0144q;
import ivas.gov.bisp.enumeration.p035bh.W;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.Z;
import ivas.gov.bisp.enumeration.p035bh.n;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {
    private static int a = 1;
    private static int b;
    public static final Writer n = new bsb();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Z f77o;
    public String p;
    public final List<n> q;
    public n r;

    public class bsb extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = 2 % 2;
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            int i = 2 % 2;
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            int i3 = 2 % 2;
            throw new AssertionError();
        }
    }

    static {
        Z z = new Z("closed");
        int i = a;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            f77o = z;
            return;
        }
        f77o = z;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public i() {
        super(n);
        this.q = new ArrayList();
        this.r = Y.c;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        x(Y.c);
        int i7 = a;
        int i8 = i7 & 97;
        int i9 = (((i7 ^ 97) | i8) << 1) - ((i7 | 97) & (~i8));
        b = i9 % 128;
        int i10 = i9 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c, java.io.Flushable
    public final void flush() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 122) + (i2 | 122)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c o(long j) {
        int i = 2 % 2;
        x(new Z(Long.valueOf(j)));
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = ((((i2 ^ 23) | i3) << 1) - (~(-((i2 | 23) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c s(boolean z) {
        int i = 2 % 2;
        x(new Z(Boolean.valueOf(z)));
        int i2 = (-2) - ((b + 26) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 47;
        int i6 = (((i3 ^ 47) | i5) << 1) - ((i3 | 47) & (~i5));
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c t(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 90) + ((i2 & 90) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (str != null) {
            x(new Z(str));
            int i6 = b;
            int i7 = (((i6 ^ 73) | (i6 & 73)) << 1) - (((~i6) & 73) | (i6 & (-74)));
            a = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }
        int i9 = i4 & 7;
        int i10 = (i4 ^ 7) | i9;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        x(Y.c);
        if (i12 != 0) {
            int i13 = 82 / 0;
        }
        int i14 = a;
        int i15 = i14 & 1;
        int i16 = (i14 | 1) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        b = i18 % 128;
        int i19 = i18 % 2;
        return this;
    }

    public final n v() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (i2 ^ 105) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        List<n> list = this.q;
        int size = list.size();
        n nVar = list.get(((~size) - (~(size << 1))) - 1);
        int i7 = b;
        int i8 = (i7 & 14) + (i7 | 14);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        n nVar2 = nVar;
        int i11 = (i7 ^ 43) + ((i7 & 43) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return nVar2;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 11;
        int i4 = (i3 << 1) - ((~(i2 & 11)) & i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (!this.q.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        int i6 = a;
        int i7 = (i6 ^ 115) + ((i6 & 115) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.q.add(f77o);
        int i9 = b + 5;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 88 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        x(new ivas.gov.bisp.enumeration.p035bh.Z(r5));
        r5 = ivas.gov.bisp.enumeration.p050bw.i.a + 109;
        ivas.gov.bisp.enumeration.p050bw.i.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        x(ivas.gov.bisp.enumeration.p035bh.Y.c);
        r5 = ivas.gov.bisp.enumeration.p050bw.i.a;
        r1 = r5 ^ 115;
        r5 = (((r5 & 115) | r1) << 1) - r1;
        ivas.gov.bisp.enumeration.p050bw.i.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        return r4;
     */
    @Override // ivas.gov.bisp.enumeration.p032be.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p032be.c q(java.lang.Boolean r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p050bw.i.a
            r2 = r1 ^ 67
            r1 = r1 & 67
            int r1 = r1 << 1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L1f
            r1 = 76
            int r1 = r1 / 0
            if (r5 != 0) goto L36
            goto L21
        L1f:
            if (r5 != 0) goto L36
        L21:
            ivas.gov.bisp.enumeration.bh.Y r5 = ivas.gov.bisp.enumeration.p035bh.Y.c
            r4.x(r5)
            int r5 = ivas.gov.bisp.enumeration.p050bw.i.a
            r1 = r5 ^ 115(0x73, float:1.61E-43)
            r5 = r5 & 115(0x73, float:1.61E-43)
            r5 = r5 | r1
            int r5 = r5 << 1
            int r5 = r5 - r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r1
            int r5 = r5 % r0
            return r4
        L36:
            ivas.gov.bisp.enumeration.bh.Z r1 = new ivas.gov.bisp.enumeration.bh.Z
            r1.<init>(r5)
            r4.x(r1)
            int r5 = ivas.gov.bisp.enumeration.p050bw.i.a
            int r5 = r5 + 109
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L4a
            return r4
        L4a:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.i.q(java.lang.Boolean):ivas.gov.bisp.enumeration.be.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (java.lang.Double.isInfinite(r2) == false) goto L18;
     */
    @Override // ivas.gov.bisp.enumeration.p032be.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p032be.c r(java.lang.Number r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p050bw.i.a
            r2 = r1 & 101(0x65, float:1.42E-43)
            r1 = r1 ^ 101(0x65, float:1.42E-43)
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 != 0) goto La7
            if (r7 != 0) goto L3a
            ivas.gov.bisp.enumeration.bh.Y r7 = ivas.gov.bisp.enumeration.p035bh.Y.c
            r6.x(r7)
            int r7 = ivas.gov.bisp.enumeration.p050bw.i.a
            r2 = r7 & (-102(0xffffffffffffff9a, float:NaN))
            int r3 = ~r7
            r3 = r3 & 101(0x65, float:1.42E-43)
            r2 = r2 | r3
            r7 = r7 & 101(0x65, float:1.42E-43)
            int r7 = r7 << 1
            r3 = r2 ^ r7
            r7 = r7 & r2
            int r7 = r7 << 1
            int r3 = r3 + r7
            int r7 = r3 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L39
            return r6
        L39:
            throw r1
        L3a:
            boolean r2 = r6.k
            if (r2 != 0) goto L84
            int r2 = ivas.gov.bisp.enumeration.p050bw.i.a
            r3 = r2 ^ 35
            r2 = r2 & 35
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.i.b = r3
            int r2 = r2 % r0
            double r2 = r7.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            r4 = r4 ^ 1
            if (r4 == 0) goto L6d
            int r4 = ivas.gov.bisp.enumeration.p050bw.i.b
            int r4 = r4 + 57
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p050bw.i.a = r5
            int r4 = r4 % r0
            boolean r2 = java.lang.Double.isInfinite(r2)
            if (r2 != 0) goto L6d
            goto L84
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JSON forbids NaN and infinities: "
            r0.append(r1)
            r0.append(r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L84:
            ivas.gov.bisp.enumeration.bh.Z r2 = new ivas.gov.bisp.enumeration.bh.Z
            r2.<init>(r7)
            r6.x(r2)
            int r7 = ivas.gov.bisp.enumeration.p050bw.i.b
            r2 = r7 & (-12)
            int r3 = ~r7
            r3 = r3 & 11
            r2 = r2 | r3
            r7 = r7 & 11
            int r7 = r7 << 1
            int r7 = -r7
            int r7 = -r7
            int r7 = ~r7
            int r2 = r2 - r7
            int r2 = r2 + (-1)
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.i.a = r7
            int r2 = r2 % r0
            if (r2 == 0) goto La6
            return r6
        La6:
            throw r1
        La7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.i.r(java.lang.Number):ivas.gov.bisp.enumeration.be.c");
    }

    public final n w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = i3 + ((i2 ^ 79) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!this.q.isEmpty()) {
            StringBuilder sbW = j.w("Expected one JSON element but was ");
            sbW.append(this.q);
            throw new IllegalStateException(sbW.toString());
        }
        int i6 = a;
        int i7 = i6 & 105;
        int i8 = ((i6 ^ 105) | i7) << 1;
        int i9 = -((i6 | 105) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return this.r;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c e() {
        int i = 2 % 2;
        W w = new W();
        x(w);
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = ((i2 | 81) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.q.add(w);
        int i6 = b + 99;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c f() {
        int i = 2 % 2;
        C0144q c0144q = new C0144q();
        x(c0144q);
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = -(-((i2 ^ 37) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.q.add(c0144q);
            int i6 = 66 / 0;
        } else {
            this.q.add(c0144q);
        }
        int i7 = a;
        int i8 = (i7 & (-116)) | ((~i7) & 115);
        int i9 = -(-((i7 & 115) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 13;
        int i14 = (i11 | 13) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i14 | i15);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 22 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c j(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (((i6 & (-44)) | ((~i6) & 43)) - (~((i6 & 43) << 1))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        boolean zIsEmpty = this.q.isEmpty();
        if (i8 == 0) {
            int i9 = 39 / 0;
            if (!zIsEmpty) {
                int i10 = b;
                int i11 = i10 & 85;
                int i12 = -(-((i10 ^ 85) | i11));
                i = (i11 & i12) + (i12 | i11);
                a = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                if (this.p == null) {
                    if (v() instanceof C0144q) {
                        throw new IllegalStateException();
                    }
                    i2 = a;
                    int i13 = (i2 | 85) << 1;
                    int i14 = -(i2 ^ 85);
                    int i15 = (i13 & i14) + (i13 | i14);
                    b = i15 % 128;
                    i3 = i15 % 2;
                    this.p = str;
                    if (i3 == 0) {
                        throw null;
                    }
                    i4 = i2 + 111;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i16 = 28 / 0;
                    }
                    return this;
                }
            }
        } else if (!zIsEmpty) {
            int i17 = b;
            int i18 = i17 & 85;
            int i19 = -(-((i17 ^ 85) | i18));
            i = (i18 & i19) + (i19 | i18);
            a = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (this.p == null) {
                if (v() instanceof C0144q) {
                    throw new IllegalStateException();
                }
                i2 = a;
                int i110 = (i2 | 85) << 1;
                int i111 = -(i2 ^ 85);
                int i112 = (i110 & i111) + (i110 | i111);
                b = i112 % 128;
                i3 = i112 % 2;
                this.p = str;
                if (i3 == 0) {
                    throw null;
                }
                i4 = i2 + 111;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i113 = 28 / 0;
                }
                return this;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c h() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 9;
        int i6 = (i5 - (~(-(-((i4 ^ 9) | i5))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
            if (!this.q.isEmpty()) {
                int i8 = a;
                int i9 = i8 & 105;
                int i10 = ((((i8 ^ 105) | i9) << 1) - (~(-((i8 | 105) & (~i9))))) - 1;
                i = i10 % 128;
                b = i;
                int i11 = i10 % 2;
                if (this.p == null) {
                    int i12 = i & 89;
                    int i13 = i | 89;
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    if (v() instanceof C0144q) {
                        throw new IllegalStateException();
                    }
                    int i16 = b;
                    i2 = ((i16 ^ 71) - (~(-(-((i16 & 71) << 1))))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        List<n> list = this.q;
                        list.remove(list.size() % 1);
                    } else {
                        List<n> list2 = this.q;
                        int size = list2.size();
                        int i17 = ((size ^ (-1)) | size) << 1;
                        int i18 = -(~size);
                        list2.remove((i17 & i18) + (i18 | i17));
                    }
                    int i19 = b;
                    int i20 = i19 ^ 31;
                    int i21 = (((i19 & 31) | i20) << 1) - i20;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = i19 & 41;
                    int i24 = ((((i19 ^ 41) | i23) << 1) - (~(-((i19 | 41) & (~i23))))) - 1;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    return this;
                }
            }
        } else if (!this.q.isEmpty()) {
            int i26 = a;
            int i27 = i26 & 105;
            int i110 = ((((i26 ^ 105) | i27) << 1) - (~(-((i26 | 105) & (~i27))))) - 1;
            i = i110 % 128;
            b = i;
            int i111 = i110 % 2;
            if (this.p == null) {
                int i112 = i & 89;
                int i113 = i | 89;
                int i114 = (i112 & i113) + (i113 | i112);
                a = i114 % 128;
                int i115 = i114 % 2;
                if (v() instanceof C0144q) {
                    throw new IllegalStateException();
                }
                int i116 = b;
                i2 = ((i116 ^ 71) - (~(-(-((i116 & 71) << 1))))) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    List<n> list3 = this.q;
                    list3.remove(list3.size() % 1);
                } else {
                    List<n> list4 = this.q;
                    int size2 = list4.size();
                    int i117 = ((size2 ^ (-1)) | size2) << 1;
                    int i118 = -(~size2);
                    list4.remove((i117 & i118) + (i118 | i117));
                }
                int i119 = b;
                int i28 = i119 ^ 31;
                int i29 = (((i119 & 31) | i28) << 1) - i28;
                a = i29 % 128;
                int i210 = i29 % 2;
                int i211 = i119 & 41;
                int i212 = ((((i119 ^ 41) | i211) << 1) - (~(-((i119 | 41) & (~i211))))) - 1;
                a = i212 % 128;
                int i213 = i212 % 2;
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override // ivas.gov.bisp.enumeration.p032be.c
    public final c i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 107) + (i2 | 107);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!this.q.isEmpty()) {
            int i5 = b;
            int i6 = i5 ^ 95;
            int i7 = ((i5 & 95) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (this.p == null) {
                int i11 = i5 & 87;
                int i12 = (((i5 | 87) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                if (!(v() instanceof W)) {
                    throw new IllegalStateException();
                }
                int i14 = a;
                int i15 = ((i14 ^ 51) | (i14 & 51)) << 1;
                int i16 = -(((~i14) & 51) | (i14 & (-52)));
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                List<n> list = this.q;
                int size = list.size();
                int i19 = b;
                int i20 = (i19 & 57) + (i19 | 57);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    list.remove(size);
                } else {
                    list.remove(size - 1);
                }
                return this;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public final void x(n nVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 10) << 1) - (i2 ^ 10)) - 1;
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.p == null) {
            if (this.q.isEmpty()) {
                int i5 = a;
                int i6 = i5 + 111;
                b = i6 % 128;
                int i7 = i6 % 2;
                this.r = nVar;
                int i8 = ((i5 & 22) + (i5 | 22)) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            n nVarV = v();
            if (!(nVarV instanceof W)) {
                throw new IllegalStateException();
            }
            int i10 = b + 51;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                ((W) nVarV).c.add(nVar);
                int i11 = 96 / 0;
            } else {
                ((W) nVarV).c.add(nVar);
            }
            int i12 = a + 99;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i13 = i4 ^ 9;
        int i14 = -(-((i4 & 9) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        if (nVar instanceof Y) {
            int i18 = i16 & 99;
            int i19 = -(-(i16 | 99));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            if (this.m) {
                C0144q c0144q = (C0144q) v();
                String str = this.p;
                int i22 = b;
                int i23 = ((i22 | 61) << 1) - (i22 ^ 61);
                a = i23 % 128;
                int i24 = i23 % 2;
                c0144q.c.put(str, nVar);
                int i25 = a;
                int i26 = (i25 & 49) + (i25 | 49);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        } else {
            C0144q c0144q2 = (C0144q) v();
            String str2 = this.p;
            int i28 = b;
            int i29 = ((i28 | 61) << 1) - (i28 ^ 61);
            a = i29 % 128;
            int i210 = i29 % 2;
            c0144q2.c.put(str2, nVar);
            int i211 = a;
            int i212 = (i211 & 49) + (i211 | 49);
            b = i212 % 128;
            int i213 = i212 % 2;
        }
        this.p = null;
        int i30 = a;
        int i31 = i30 ^ 17;
        int i32 = -(-((i30 & 17) << 1));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        b = i33 % 128;
        if (i33 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
