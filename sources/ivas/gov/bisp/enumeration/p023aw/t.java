package ivas.gov.bisp.enumeration.p023aw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class t extends ByteArrayOutputStream {
    private static int a = 0;
    private static int b = 1;
    public final c c;

    public t(c cVar, int i) {
        this.c = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.c(Math.max(i, 256));
    }

    public void finalize() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = -(-(i2 | 117));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.d(((ByteArrayOutputStream) this).buf);
        int i7 = b;
        int i8 = ((i7 | 111) << 1) - (i7 ^ 111);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            c(i2);
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 110) + ((i2 & 110) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.d(((ByteArrayOutputStream) this).buf);
        int i6 = b;
        int i7 = ((i6 ^ 28) + ((i6 & 28) << 1)) - 1;
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            ((ByteArrayOutputStream) this).buf = null;
            super.close();
            int i8 = 55 / 0;
        } else {
            ((ByteArrayOutputStream) this).buf = null;
            super.close();
        }
        int i9 = b;
        int i10 = (((i9 ^ 47) | (i9 & 47)) << 1) - (((~i9) & 47) | (i9 & (-48)));
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        synchronized (this) {
            c(1);
            super.write(i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 int, still in use, count: 2, list:
          (r2v13 int) from 0x001e: ARITH (r2v13 int) * (r7v0 int) A[WRAPPED]
          (r2v13 int) from 0x004b: PHI (r2 I:??) = (r2v5 int), (r2v13 int) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final void c(int r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p023aw.t.b
            r2 = r1 ^ 121(0x79, float:1.7E-43)
            r3 = r1 & 121(0x79, float:1.7E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-122(0xffffffffffffff86, float:NaN))
            int r1 = ~r1
            r4 = 121(0x79, float:1.7E-43)
            r1 = r1 & r4
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p023aw.t.a = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 == 0) goto L26
            int r2 = r6.count
            int r3 = r2 * r7
            byte[] r4 = r6.buf
            int r4 = r4.length
            if (r3 > r4) goto L4b
            goto L35
        L26:
            int r2 = r6.count
            int r3 = -r7
            int r3 = -r3
            int r3 = ~r3
            int r3 = -r3
            int r3 = ~r3
            int r3 = r2 - r3
            int r3 = r3 - r0
            byte[] r4 = r6.buf
            int r4 = r4.length
            if (r3 > r4) goto L4b
        L35:
            int r7 = ivas.gov.bisp.enumeration.p023aw.t.a
            r2 = r7 & 107(0x6b, float:1.5E-43)
            r7 = r7 ^ 107(0x6b, float:1.5E-43)
            r7 = r7 | r2
            r3 = r2 & r7
            r7 = r7 | r2
            int r3 = r3 + r7
            int r7 = r3 % 128
            ivas.gov.bisp.enumeration.p023aw.t.b = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L4a
            r7 = 74
            int r7 = r7 / r1
        L4a:
            return
        L4b:
            ivas.gov.bisp.enumeration.aw.c r3 = r6.c
            int r4 = ~r7
            r4 = r4 & r2
            int r5 = ~r2
            r5 = r5 & r7
            r4 = r4 | r5
            r7 = r7 & r2
            int r7 = r7 << 1
            int r7 = -r7
            int r7 = -r7
            r2 = r4 ^ r7
            r7 = r7 & r4
            int r7 = r7 << 1
            int r2 = r2 + r7
            int r2 = r2 * r0
            byte[] r7 = r3.c(r2)
            byte[] r2 = r6.buf
            int r3 = ivas.gov.bisp.enumeration.p023aw.t.a
            r4 = r3 ^ 75
            r3 = r3 & 75
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            ivas.gov.bisp.enumeration.p023aw.t.b = r3
            int r4 = r4 % r0
            int r3 = r6.count
            java.lang.System.arraycopy(r2, r1, r7, r1, r3)
            ivas.gov.bisp.enumeration.aw.c r1 = r6.c
            byte[] r2 = r6.buf
            int r3 = ivas.gov.bisp.enumeration.p023aw.t.a
            r4 = r3 ^ 23
            r5 = r3 & 23
            r4 = r4 | r5
            int r4 = r4 << 1
            int r5 = ~r5
            r3 = r3 | 23
            r3 = r3 & r5
            int r3 = -r3
            r5 = r4 ^ r3
            r3 = r3 & r4
            int r3 = r3 << 1
            int r5 = r5 + r3
            int r3 = r5 % 128
            ivas.gov.bisp.enumeration.p023aw.t.b = r3
            int r5 = r5 % r0
            if (r5 == 0) goto L9c
            r1.d(r2)
            r6.buf = r7
            return
        L9c:
            r1.d(r2)
            r6.buf = r7
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p023aw.t.c(int):void");
    }
}
