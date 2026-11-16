package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p080cz.c;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235m extends c implements h {
    private static int R = 0;
    private static int b = 1;
    public final byte[] S;
    public final M T;
    public final int U;
    public final byte[] V;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cC.m$bDg */
    public static class bDg {
        public final M a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public bDg(M m) {
            this.a = m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0147, code lost:
    
        if (r12.length == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (r12.length == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        r10.S = r12;
        r12 = r1 ^ 73;
        r1 = (((r1 & 73) | r12) << 1) - r12;
        ivas.gov.bisp.enumeration.cC.C0235m.R = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015b, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015e, code lost:
    
        r12 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0168, code lost:
    
        throw new java.lang.IllegalArgumentException("length of root must be equal to length of digest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0199, code lost:
    
        if (r11.length == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019d, code lost:
    
        if (r11.length == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019f, code lost:
    
        r10.V = r11;
        r11 = (((r12 ^ 23) | (r12 & 23)) << 1) - (((~r12) & 23) | (r12 & (-24)));
        ivas.gov.bisp.enumeration.cC.C0235m.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b4, code lost:
    
        if ((r11 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b7, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c2, code lost:
    
        throw new java.lang.IllegalArgumentException("length of publicSeed must be equal to length of digest");
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0235m(ivas.gov.bisp.enumeration.cC.C0235m.bDg r11, ivas.gov.bisp.enumeration.cC.C0235m.bDf r12) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cC.C0235m.<init>(ivas.gov.bisp.enumeration.cC.m$bDg, ivas.gov.bisp.enumeration.cC.m$bDf):void");
    }

    public final byte[] c() {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
        R = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = this.T.e.j;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = this.T.e.j;
        int i7 = this.U;
        int i8 = 0;
        if (i7 != 0) {
            int i9 = b;
            int i10 = (i9 ^ 37) + ((i9 & 37) << 1);
            int i11 = i10 % 128;
            R = i11;
            int i12 = i10 % 2;
            int i13 = i6 ^ 4;
            int i14 = -(-((i6 & 4) << 1));
            bArr = new byte[(((i13 ^ i14) + ((i13 & i14) << 1)) - (~(-(~(-(-i6)))))) - 2];
            int i15 = i11 + 35;
            b = i15 % 128;
            int i16 = i15 % 2;
            ivas.gov.bisp.enumeration.p096p.h.i(i7, bArr, 0);
            int i17 = b + 5;
            R = i17 % 128;
            int i18 = i17 % 2;
            i8 = 4;
        } else {
            int i19 = -(-i6);
            int i20 = i6 & i19;
            int i21 = -(-((i19 ^ i6) | i20));
            bArr = new byte[((i20 | i21) << 1) - (i21 ^ i20)];
            int i22 = R + 79;
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        v.f(bArr, this.S, i8);
        int i24 = b;
        int i25 = ((i24 ^ 60) + ((i24 & 60) << 1)) - 1;
        R = i25 % 128;
        if (i25 % 2 != 0) {
            v.f(bArr, this.V, i8 * i6);
        } else {
            v.f(bArr, this.V, (i8 - (~(-(-i6)))) - 1);
        }
        return bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public final byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-44)) | ((~i2) & 43)) - (~(-(-((i2 & 43) << 1))))) - 1;
        R = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrC = c();
        int i5 = b;
        int i6 = ((((i5 ^ 113) | (i5 & 113)) << 1) - (~(-(((~i5) & 113) | (i5 & (-114)))))) - 1;
        R = i6 % 128;
        if (i6 % 2 == 0) {
            return bArrC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
