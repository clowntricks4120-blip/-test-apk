package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0271q extends InputStream {
    private static int a = 0;
    private static int b = 1;
    public final R c;
    public boolean d = true;
    public InputStream e;

    public C0271q(R r) {
        this.c = r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.p063ci.N) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.C0271q.a;
        r3 = (-2) - (((r3 ^ 124) + ((r3 & 124) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.p063ci.C0271q.b = r3 % 128;
        r2 = (ivas.gov.bisp.enumeration.p063ci.N) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if ((r3 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("unknown object encountered: ");
        r0.append(r2.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p063ci.C0271q.a;
        r3 = (r2 ^ 117) + ((r2 & 117) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0271q.b = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p063ci.N c() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0271q.a
            r2 = r1 ^ 77
            r3 = r1 & 77
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-78)
            int r1 = ~r1
            r4 = 77
            r1 = r1 & r4
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.C0271q.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 != 0) goto L29
            ivas.gov.bisp.enumeration.ci.R r2 = r5.c
            ivas.gov.bisp.enumeration.ci.i r2 = r2.d()
            r3 = 82
            int r3 = r3 / 0
            if (r2 != 0) goto L43
            goto L31
        L29:
            ivas.gov.bisp.enumeration.ci.R r2 = r5.c
            ivas.gov.bisp.enumeration.ci.i r2 = r2.d()
            if (r2 != 0) goto L43
        L31:
            int r2 = ivas.gov.bisp.enumeration.p063ci.C0271q.a
            r3 = r2 ^ 117(0x75, float:1.64E-43)
            r2 = r2 & 117(0x75, float:1.64E-43)
            int r2 = r2 << 1
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0271q.b = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L42
            return r1
        L42:
            throw r1
        L43:
            boolean r3 = r2 instanceof ivas.gov.bisp.enumeration.p063ci.N
            if (r3 == 0) goto L5f
            int r3 = ivas.gov.bisp.enumeration.p063ci.C0271q.a
            r4 = r3 ^ 124(0x7c, float:1.74E-43)
            r3 = r3 & 124(0x7c, float:1.74E-43)
            int r3 = r3 << 1
            int r4 = r4 + r3
            r3 = r4 ^ (-1)
            int r3 = (-2) - r3
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0271q.b = r4
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.ci.N r2 = (ivas.gov.bisp.enumeration.p063ci.N) r2
            if (r3 == 0) goto L5e
            return r2
        L5e:
            throw r1
        L5f:
            java.lang.String r0 = "unknown object encountered: "
            java.lang.StringBuilder r0 = ivas.gov.bisp.enumeration.p091n.j.w(r0)
            java.lang.Class r1 = r2.getClass()
            r0.append(r1)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0271q.c():ivas.gov.bisp.enumeration.ci.N");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.e == null) {
            int i5 = ((i2 | 92) << 1) - (i2 ^ 92);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (!this.d) {
                int i9 = ((i7 | 124) << 1) - (i7 ^ 124);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i11 = (i7 ^ 51) + ((i7 & 51) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return -1;
                }
                throw null;
            }
            N nC = c();
            if (nC == null) {
                int i12 = a;
                int i13 = i12 & 103;
                int i14 = (i12 | 103) & (~i13);
                int i15 = i13 << 1;
                int i16 = (i14 & i15) + (i14 | i15);
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                int i19 = i17 & 123;
                int i20 = -(-((i17 ^ 123) | i19));
                int i21 = (i19 & i20) + (i20 | i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                return -1;
            }
            this.d = false;
            int i23 = a + 17;
            b = i23 % 128;
            int i24 = i23 % 2;
            this.e = nC.a();
            int i25 = (-2) - ((b + 76) ^ (-1));
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        while (true) {
            int i27 = this.e.read();
            if (i27 >= 0) {
                int i28 = a;
                int i29 = (i28 & (-94)) | ((~i28) & 93);
                int i30 = (i28 & 93) << 1;
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = i31 % 128;
                b = i32;
                int i33 = i31 % 2;
                int i34 = (i32 ^ 59) + ((i32 & 59) << 1);
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    return i27;
                }
                obj.hashCode();
                throw null;
            }
            N nC2 = c();
            if (nC2 == null) {
                int i35 = a;
                int i36 = i35 ^ 123;
                int i37 = -(-((i35 & 123) << 1));
                int i38 = (i36 & i37) + (i37 | i36);
                int i39 = i38 % 128;
                b = i39;
                int i40 = i38 % 2;
                this.e = null;
                if (i40 == 0) {
                    throw null;
                }
                int i41 = i39 ^ 67;
                int i42 = ((i39 & 67) | i41) << 1;
                int i43 = -i41;
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                a = i44 % 128;
                if (i44 % 2 == 0) {
                    return -1;
                }
                obj.hashCode();
                throw null;
            }
            this.e = nC2.a();
            int i45 = (-2) - ((b + 76) ^ (-1));
            a = i45 % 128;
            int i46 = i45 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104 A[DONT_INVERT, EDGE_INSN: B:39:0x0104->B:46:0x0136 BREAK  A[LOOP:0: B:25:0x0073->B:56:?]] */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0165  */
    /* JADX WARN: Code duplicated, block: B:52:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:0: B:25:0x0073->B:56:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0101 -> B:46:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0104 -> B:46:0x0136). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:52:0x0166
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.io.InputStream
    public int read(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0271q.read(byte[], int, int):int");
    }
}
