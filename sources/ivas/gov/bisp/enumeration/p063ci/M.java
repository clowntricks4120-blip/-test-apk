package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.cO.c;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends O implements N {
    private static int a = 1;
    private static int b;
    public byte[] c;

    public M(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.c = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if ((!r4) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r4 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r6 = (r2 & 105) + (r2 | 105);
        ivas.gov.bisp.enumeration.p063ci.M.a = r6 % 128;
        r1 = (ivas.gov.bisp.enumeration.p063ci.M) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if ((r6 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p063ci.M p(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.M.p(java.lang.Object):ivas.gov.bisp.enumeration.ci.M");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.N
    public InputStream a() {
        int i = 2 % 2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.c);
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (i2 | 113) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return byteArrayInputStream;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = (((i2 ^ 61) | i3) << 1) - ((~i3) & (i2 | 61));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i2 + 51;
        b = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 102) << 1) - (i2 ^ 102)) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = o2 instanceof M;
            obj.hashCode();
            throw null;
        }
        if (!(o2 instanceof M)) {
            int i5 = i4 & 51;
            int i6 = i4 | 51;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (i4 & 109) + (i4 | 109);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((M) o2).c;
        int i10 = (i4 & 91) + (i4 | 91);
        a = i10 % 128;
        int i11 = i10 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i12 = a;
        int i13 = i12 & 47;
        int i14 = ((i12 ^ 47) | i13) << 1;
        int i15 = -((i12 | 47) & (~i13));
        int i16 = (i14 & i15) + (i15 | i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 117) + (i2 | 117);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            j.h(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iH = j.h(this.c);
        int i4 = a + 35;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return iH;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        B b2 = new B(this.c);
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return b2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        B b2 = new B(this.c);
        int i2 = b;
        int i3 = i2 | 123;
        int i4 = (i3 << 1) - ((~(i2 & 123)) & i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r8 = p(r8.t());
        r9 = ivas.gov.bisp.enumeration.p063ci.M.a + 25;
        ivas.gov.bisp.enumeration.p063ci.M.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        throw new java.lang.IllegalArgumentException("object implicit - explicit expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r9 == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p063ci.M o(ivas.gov.bisp.enumeration.p063ci.AbstractC0276v r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.M.o(ivas.gov.bisp.enumeration.ci.v, boolean):ivas.gov.bisp.enumeration.ci.M");
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            ivas.gov.bisp.enumeration.p091n.j.w("#");
            C0321u c0321u = c.c;
            throw null;
        }
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("#");
        byte[] bArr = this.c;
        C0321u c0321u2 = c.c;
        int i4 = a;
        int i5 = i4 ^ 29;
        int i6 = ((i4 & 29) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        sbW.append(i8 % 2 != 0 ? p.b(c.b(bArr, 1, bArr.length)) : p.b(c.b(bArr, 0, bArr.length)));
        String string = sbW.toString();
        int i9 = a;
        int i10 = (i9 & (-60)) | ((~i9) & 59);
        int i11 = -(-((i9 & 59) << 1));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
