package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p064cj.j;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class N extends J {
    private static int a = 1;
    private static int b;
    public final byte[] c;
    public final byte[] d;

    public N(byte[] bArr, byte[] bArr2) {
        this.c = j.c(bArr);
        this.d = j.c(bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p076cv.N(ivas.gov.bisp.enumeration.p063ci.Q.o(r4));
        r4 = ivas.gov.bisp.enumeration.p076cv.N.a;
        r4 = (-2) - ((((r4 | 118) << 1) - (r4 ^ 118)) ^ (-1));
        ivas.gov.bisp.enumeration.p076cv.N.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r4 = ((r2 | 39) << 1) - (r2 ^ 39);
        ivas.gov.bisp.enumeration.p076cv.N.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r1 = r2 ^ 67;
        r2 = (r2 & 67) << 1;
        r3 = (r1 & r2) + (r1 | r2);
        ivas.gov.bisp.enumeration.p076cv.N.b = r3 % 128;
        r4 = (ivas.gov.bisp.enumeration.p076cv.N) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r0 = 21 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r4 instanceof ivas.gov.bisp.enumeration.p076cv.N) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r4 instanceof ivas.gov.bisp.enumeration.p076cv.N)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r4 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p076cv.N h(java.lang.Object r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p076cv.N.b
            int r1 = r1 + 17
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p076cv.N.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r1 = r4 instanceof ivas.gov.bisp.enumeration.p076cv.N
            r3 = 22
            int r3 = r3 / 0
            if (r1 == 0) goto L1d
            goto L49
        L17:
            boolean r1 = r4 instanceof ivas.gov.bisp.enumeration.p076cv.N
            r1 = r1 ^ 1
            if (r1 == 0) goto L49
        L1d:
            if (r4 == 0) goto L3b
            ivas.gov.bisp.enumeration.cv.N r1 = new ivas.gov.bisp.enumeration.cv.N
            ivas.gov.bisp.enumeration.ci.Q r4 = ivas.gov.bisp.enumeration.p063ci.Q.o(r4)
            r1.<init>(r4)
            int r4 = ivas.gov.bisp.enumeration.p076cv.N.a
            r2 = r4 | 118(0x76, float:1.65E-43)
            int r2 = r2 << 1
            r4 = r4 ^ 118(0x76, float:1.65E-43)
            int r2 = r2 - r4
            r4 = r2 ^ (-1)
            int r4 = (-2) - r4
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p076cv.N.b = r2
            int r4 = r4 % r0
            return r1
        L3b:
            r4 = r2 | 39
            int r4 = r4 << 1
            r1 = r2 ^ 39
            int r4 = r4 - r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p076cv.N.b = r1
            int r4 = r4 % r0
            r4 = 0
            return r4
        L49:
            r1 = r2 ^ 67
            r2 = r2 & 67
            int r2 = r2 << 1
            r3 = r1 & r2
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p076cv.N.b = r1
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.cv.N r4 = (ivas.gov.bisp.enumeration.p076cv.N) r4
            if (r3 == 0) goto L60
            r0 = 21
            int r0 = r0 / 0
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p076cv.N.h(java.lang.Object):ivas.gov.bisp.enumeration.cv.N");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(0L));
        c0270p.c(new B(this.c));
        c0270p.c(new B(this.d));
        ac acVar = new ac(c0270p);
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = (((i2 | 29) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return acVar;
        }
        throw null;
    }

    public N(Q q) {
        i iVarU;
        if (!C0258a.p(q.u(0)).x(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        byte[] bArr = M.p(q.u(1)).c;
        int i = a;
        int i2 = i ^ 33;
        int i3 = ((i & 33) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c = j.c(bArr);
            iVarU = q.u(5);
        } else {
            this.c = j.c(bArr);
            iVarU = q.u(2);
        }
        M mP = M.p(iVarU);
        int i6 = b;
        int i7 = (((i6 | 48) << 1) - (i6 ^ 48)) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            this.d = j.c(mP.c);
            int i8 = 31 / 0;
        } else {
            this.d = j.c(mP.c);
        }
        int i9 = a;
        int i10 = i9 & 9;
        int i11 = (i9 ^ 9) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = i12 % 2;
    }
}
