package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0280z extends O {
    private static int a = 1;
    private static int b;
    public static C0280z[] c = new C0280z[12];
    public final byte[] d;

    static {
        int i = ((1 & (-32)) | ((~1) & 31)) + ((1 & 31) << 1);
        b = i % 128;
        int i2 = i % 2;
    }

    public C0280z(byte[] bArr) {
        if (C0258a.r(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        int i = a;
        int i2 = i & 67;
        int i3 = (i2 - (~((i ^ 67) | i2))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d = j.c(bArr);
        C0258a.s(bArr);
        int i5 = a;
        int i6 = ((i5 | 123) << 1) - (i5 ^ 123);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r6 = 70 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r2 = r5.d;
        r6 = ((ivas.gov.bisp.enumeration.p063ci.C0280z) r6).d;
        r3 = r1 & 25;
        r1 = -(-(r1 | 25));
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.p063ci.C0280z.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return java.util.Arrays.equals(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        java.util.Arrays.equals(r2, r6);
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r6 instanceof ivas.gov.bisp.enumeration.p063ci.C0280z) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if ((r6 instanceof ivas.gov.bisp.enumeration.p063ci.C0280z) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = r1 & 99;
        r1 = r1 | 99;
        r2 = (r6 ^ r1) + ((r6 & r1) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0280z.b = r2 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(ivas.gov.bisp.enumeration.p063ci.O r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0280z.a
            r2 = r1 & 93
            r3 = r1 ^ 93
            r3 = r3 | r2
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.C0280z.b = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L1e
            boolean r2 = r6 instanceof ivas.gov.bisp.enumeration.p063ci.C0280z
            r4 = 84
            int r4 = r4 / r3
            if (r2 != 0) goto L37
            goto L22
        L1e:
            boolean r2 = r6 instanceof ivas.gov.bisp.enumeration.p063ci.C0280z
            if (r2 != 0) goto L37
        L22:
            r6 = r1 & 99
            r1 = r1 | 99
            r2 = r6 ^ r1
            r6 = r6 & r1
            int r6 = r6 << 1
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.C0280z.b = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L36
            r6 = 70
            int r6 = r6 / r3
        L36:
            return r3
        L37:
            ivas.gov.bisp.enumeration.ci.z r6 = (ivas.gov.bisp.enumeration.p063ci.C0280z) r6
            byte[] r2 = r5.d
            byte[] r6 = r6.d
            r3 = r1 & 25
            r1 = r1 | 25
            int r1 = -r1
            int r1 = -r1
            r4 = r3 & r1
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p063ci.C0280z.b = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L53
            boolean r6 = java.util.Arrays.equals(r2, r6)
            return r6
        L53:
            java.util.Arrays.equals(r2, r6)
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0280z.h(ivas.gov.bisp.enumeration.ci.O):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (i2 ^ 55) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iH = j.h(this.d);
        int i7 = b;
        int i8 = i7 & 95;
        int i9 = (i7 | 95) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return iH;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.d;
        if (i3 != 0) {
            aVar.v(z, 77, bArr);
        } else {
            aVar.v(z, 10, bArr);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iB;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 49;
        int i5 = i4 + ((i3 ^ 49) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.d;
        if (i6 == 0) {
            iB = az.b(bArr.length) % 0;
            length = this.d.length;
        } else {
            int iB2 = az.b(bArr.length);
            int i7 = iB2 & 1;
            iB = ((iB2 ^ 1) | i7) + i7;
            length = this.d.length;
        }
        int i8 = a;
        int i9 = i8 ^ 71;
        int i10 = ((i8 & 71) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        b = i13;
        int i14 = -(-length);
        if (i12 % 2 != 0) {
            int i15 = ((~i14) & iB) | ((~iB) & i14);
            int i16 = (iB & i14) << 1;
            i = (i15 & i16) + (i16 | i15);
        } else {
            i = (((iB | i14) << 1) - (~(-(iB ^ i14)))) - 1;
        }
        int i17 = i13 + 87;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 63 / 0;
        }
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = ((~i3) & (i2 | 77)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (i2 & 101) + (i2 | 101);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
