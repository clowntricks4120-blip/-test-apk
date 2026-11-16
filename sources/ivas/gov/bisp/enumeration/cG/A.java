package ivas.gov.bisp.enumeration.cG;

import ivas.gov.bisp.enumeration.cX.j;
import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p078cx.i;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes.dex */
public class A implements Key, PrivateKey {
    private static int a = 1;
    private static int b;
    public transient j c;
    public transient L d;

    public A(c cVar) {
        this.d = cVar.g;
        this.c = (j) i.b(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r7 = ((r1 | 49) << 1) - (r1 ^ 49);
        ivas.gov.bisp.enumeration.cG.A.b = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r7 instanceof ivas.gov.bisp.enumeration.cG.A) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!(r7 instanceof ivas.gov.bisp.enumeration.cG.A)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r1 = r6.c.c();
        r7 = ((ivas.gov.bisp.enumeration.cG.A) r7).c;
        r2 = (-2) - ((ivas.gov.bisp.enumeration.cG.A.a + 8) ^ (-1));
        ivas.gov.bisp.enumeration.cG.A.b = r2 % 128;
        r2 = r2 % 2;
        r7 = java.util.Arrays.equals(r1, r7.c());
        r1 = ivas.gov.bisp.enumeration.cG.A.b;
        r2 = r1 & 79;
        r1 = (r1 ^ 79) | r2;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.cG.A.a = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cG.A.b
            r2 = r1 | 19
            r3 = 1
            int r2 = r2 << r3
            r1 = r1 ^ 19
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cG.A.a = r1
            int r2 = r2 % r0
            r4 = 0
            if (r2 != 0) goto L1c
            boolean r2 = r7 instanceof ivas.gov.bisp.enumeration.cG.A
            r5 = 31
            int r5 = r5 / r4
            if (r2 != 0) goto L21
            goto L53
        L1c:
            boolean r2 = r7 instanceof ivas.gov.bisp.enumeration.cG.A
            r2 = r2 ^ r3
            if (r2 == r3) goto L53
        L21:
            ivas.gov.bisp.enumeration.cG.A r7 = (ivas.gov.bisp.enumeration.cG.A) r7
            ivas.gov.bisp.enumeration.cX.j r1 = r6.c
            short[] r1 = r1.c()
            ivas.gov.bisp.enumeration.cX.j r7 = r7.c
            int r2 = ivas.gov.bisp.enumeration.cG.A.a
            int r2 = r2 + 8
            r2 = r2 ^ (-1)
            int r2 = (-2) - r2
            int r4 = r2 % 128
            ivas.gov.bisp.enumeration.cG.A.b = r4
            int r2 = r2 % r0
            short[] r7 = r7.c()
            boolean r7 = java.util.Arrays.equals(r1, r7)
            int r1 = ivas.gov.bisp.enumeration.cG.A.b
            r2 = r1 & 79
            r1 = r1 ^ 79
            r1 = r1 | r2
            r4 = r2 | r1
            int r3 = r4 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cG.A.a = r1
            int r3 = r3 % r0
            return r7
        L53:
            r7 = r1 | 49
            int r7 = r7 << r3
            r1 = r1 ^ 49
            int r7 = r7 - r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.cG.A.b = r1
            int r7 = r7 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cG.A.equals(java.lang.Object):boolean");
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 92) + (i2 | 92)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 51;
        int i6 = ((i2 | 51) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (i2 | 103) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        try {
            c cVarX = r.x(this.c, this.d);
            int i8 = b;
            int i9 = ((i8 ^ 109) | (i8 & 109)) << 1;
            int i10 = -(((~i8) & 109) | (i8 & (-110)));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                cVarX.getEncoded();
                throw null;
            }
            byte[] encoded = cVarX.getEncoded();
            int i12 = b;
            int i13 = ((i12 ^ 110) + ((i12 & 110) << 1)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            return encoded;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = (i2 | 87) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i7 | 57;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 57)) & i8);
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return "PKCS#8";
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 83;
        int i4 = ((i2 & 83) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = ivas.gov.bisp.enumeration.p064cj.j.i(this.c.c());
        int i9 = (-2) - ((a + 26) ^ (-1));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return i8;
        }
        throw null;
    }
}
