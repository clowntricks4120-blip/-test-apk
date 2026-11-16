package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0273s extends M {
    private static int a = 0;
    private static int b = 1;
    public final int d;
    public final M[] e;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.s$bzK */
    public class bzK implements Enumeration {
        private static int a = 0;
        private static int b = 1;
        public int c = 0;

        public bzK() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 67;
            int i4 = -(-((i2 ^ 67) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                int length = C0273s.this.c.length;
                obj.hashCode();
                throw null;
            }
            boolean z = true;
            if (this.c < C0273s.this.c.length) {
                int i6 = b;
                int i7 = (-2) - ((((i6 | 98) << 1) - (i6 ^ 98)) ^ (-1));
                a = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = a;
                int i10 = ((i9 ^ 51) - (~((i9 & 51) << 1))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            }
            int i12 = b + 47;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 36) + ((i2 & 36) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.c;
            C0273s c0273s = C0273s.this;
            byte[] bArr = c0273s.c;
            int i6 = a;
            int i7 = (i6 & 47) + (i6 | 47);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            if (i5 >= bArr.length) {
                throw new NoSuchElementException();
            }
            int i10 = i8 + 37;
            a = i10 % 128;
            int i11 = i10 % 2;
            int length = bArr.length;
            int i12 = c0273s.d;
            int i13 = -i5;
            int i14 = ((((~i13) & length) | ((~length) & i13)) - (~((i13 & length) << 1))) - 1;
            int i15 = b;
            int i16 = ((i15 ^ 82) + ((i15 & 82) << 1)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            int iMin = Math.min(i14, i12);
            byte[] bArr2 = new byte[iMin];
            C0273s c0273s2 = C0273s.this;
            int i18 = b;
            int i19 = i18 ^ 69;
            int i20 = ((i18 & 69) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 & i21) + (i20 | i21);
            a = i22 % 128;
            int i23 = i22 % 2;
            System.arraycopy(c0273s2.c, this.c, bArr2, 0, iMin);
            this.c += iMin;
            B b2 = new B(bArr2);
            int i24 = b;
            int i25 = i24 ^ 3;
            int i26 = ((i24 & 3) | i25) << 1;
            int i27 = -i25;
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            return b2;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.s$bzL */
    public class bzL implements Enumeration {
        private static int a = 1;
        private static int b;
        public int c = 0;

        public bzL() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            boolean z;
            int i = 2 % 2;
            int i2 = a + 13;
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.c;
            M[] mArr = C0273s.this.e;
            int i5 = b;
            int i6 = i5 + 111;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int length = mArr.length;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i4 < mArr.length) {
                int i7 = ((i5 ^ 89) | (i5 & 89)) << 1;
                int i8 = -((i5 & (-90)) | ((~i5) & 89));
                int i9 = (i7 & i8) + (i7 | i8);
                a = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                int i11 = (i5 & 53) + (i5 | 53);
                a = i11 % 128;
                int i12 = i11 % 2;
                z = false;
            }
            int i13 = (i5 ^ 5) + ((i5 & 5) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return z;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = 2 % 2;
            int i2 = a + 103;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int length = C0273s.this.e.length;
                throw null;
            }
            int i3 = this.c;
            M[] mArr = C0273s.this.e;
            if (i3 >= mArr.length) {
                throw new NoSuchElementException();
            }
            int i4 = i3 & 1;
            int i5 = i3 | 1;
            this.c = (i4 ^ i5) + ((i4 & i5) << 1);
            M m = mArr[i3];
            int i6 = a;
            int i7 = i6 | 81;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 81)) & i7);
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return m;
        }
    }

    public C0273s(byte[] bArr) {
        super(bArr);
        this.e = null;
        this.d = 1000;
    }

    public static C0273s q(Q q) {
        int i = 2 % 2;
        int i2 = b + 103;
        a = i2 % 128;
        int i3 = i2 % 2;
        int size = q.size();
        M[] mArr = new M[size];
        int i4 = 0;
        while (i4 < size) {
            int i5 = a;
            int i6 = i5 & 23;
            int i7 = ((((i5 ^ 23) | i6) << 1) - (~(-((i5 | 23) & (~i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            M mP = M.p(q.u(i4));
            if (i8 == 0) {
                mArr[i4] = mP;
                i4 += 22;
            } else {
                mArr[i4] = mP;
                int i9 = i4 & (-26);
                int i10 = i9 + ((i4 ^ (-26)) | i9);
                int i11 = i10 & 27;
                int i12 = (i10 ^ 27) | i11;
                i4 = ((i11 | i12) << 1) - (i11 ^ i12);
            }
        }
        C0273s c0273s = new C0273s(mArr);
        int i13 = b + 105;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return c0273s;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = -(-((i2 & 1) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            u();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Enumeration enumerationU = u();
        if (z) {
            int i6 = b;
            int i7 = (((i6 & (-62)) | ((~i6) & 61)) - (~((i6 & 61) << 1))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            ((OutputStream) aVar.c).write(36);
            int i9 = b;
            int i10 = (i9 ^ 93) + ((i9 & 93) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 % 3;
            }
        }
        aVar.r(128);
        aVar.t(enumerationU);
        aVar.r(0);
        int i12 = b;
        int i13 = (((i12 & (-24)) | ((~i12) & 23)) - (~(-(-((i12 & 23) << 1))))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            aVar.r(1);
        } else {
            aVar.r(0);
        }
        int i14 = a;
        int i15 = ((i14 | 113) << 1) - (i14 ^ 113);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = ((i2 ^ 83) | i3) << 1;
        int i5 = -((i2 | 83) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Enumeration enumerationU = u();
        int i8 = 0;
        while (enumerationU.hasMoreElements()) {
            int i9 = b;
            int i10 = i9 & 1;
            int i11 = -(-((i9 ^ 1) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            int iJ = ((i) enumerationU.nextElement()).f().j();
            int i14 = a;
            int i15 = ((i14 | 53) << 1) - (((~i14) & 53) | (i14 & (-54)));
            b = i15 % 128;
            if (i15 % 2 == 0) {
                i8 >>= iJ;
            } else {
                int i16 = i8 & iJ;
                int i17 = -(-((i8 ^ iJ) | i16));
                i8 = ((i16 | i17) << 1) - (i17 ^ i16);
            }
        }
        int i18 = i8 & 2;
        int i19 = -(-((i8 ^ 2) | i18));
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        int i21 = ((i20 | 2) << 1) - (i20 ^ 2);
        int i22 = a;
        int i23 = i22 & 19;
        int i24 = (((i22 | 19) & (~i23)) - (~(i23 << 1))) - 1;
        b = i24 % 128;
        if (i24 % 2 != 0) {
            return i21;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (((i2 | 117) & (~i3)) - (~(i3 << 1))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = i5 & 41;
        int i8 = -(-((i5 ^ 41) | i7));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p063ci.C0273s.bzL(r4);
        r2 = ivas.gov.bisp.enumeration.p063ci.C0273s.a;
        r3 = r2 & 119;
        r3 = (r3 - (~(-(-((r2 ^ 119) | r3))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.C0273s.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if ((r3 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p063ci.C0273s.bzK(r4);
        r2 = ivas.gov.bisp.enumeration.p063ci.C0273s.b;
        r3 = (r2 ^ 79) + ((r2 & 79) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0273s.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if ((r3 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Enumeration u() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.C0273s.b
            r2 = r1 | 95
            int r2 = r2 << 1
            r1 = r1 ^ 95
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0273s.a = r1
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.ci.M[] r1 = r4.e
            if (r3 == 0) goto L22
            r2 = 95
            int r2 = r2 / 0
            if (r1 != 0) goto L3e
            goto L24
        L22:
            if (r1 != 0) goto L3e
        L24:
            ivas.gov.bisp.enumeration.ci.s$bzK r1 = new ivas.gov.bisp.enumeration.ci.s$bzK
            r1.<init>()
            int r2 = ivas.gov.bisp.enumeration.p063ci.C0273s.b
            r3 = r2 ^ 79
            r2 = r2 & 79
            int r2 = r2 << 1
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0273s.a = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L3d
            r0 = 57
            int r0 = r0 / 0
        L3d:
            return r1
        L3e:
            ivas.gov.bisp.enumeration.ci.s$bzL r1 = new ivas.gov.bisp.enumeration.ci.s$bzL
            r1.<init>()
            int r2 = ivas.gov.bisp.enumeration.p063ci.C0273s.a
            r3 = r2 & 119(0x77, float:1.67E-43)
            r2 = r2 ^ 119(0x77, float:1.67E-43)
            r2 = r2 | r3
            int r2 = -r2
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.C0273s.b = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L58
            return r1
        L58:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0273s.u():java.util.Enumeration");
    }

    public C0273s(M[] mArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = b;
        int i2 = (((i ^ 119) | (i & 119)) << 1) - (((~i) & 119) | (i & (-120)));
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        int i5 = 0;
        while (i5 != mArr.length) {
            int i6 = a;
            int i7 = i6 | 121;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 121)) & i7);
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            try {
                byte[] bArr = mArr[i5].c;
                int i12 = a;
                int i13 = (((i12 ^ 41) | (i12 & 41)) << 1) - (((~i12) & 41) | (i12 & (-42)));
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    byteArrayOutputStream.write(bArr);
                    int i14 = (i5 | 21) << 1;
                    int i15 = -(((~i5) & 21) | (i5 & (-22)));
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    i5 = (((i16 & (-53)) | ((~i16) & 52)) - (~(-(-((i16 & 52) << 1))))) - 1;
                } else {
                    byteArrayOutputStream.write(bArr);
                    i5++;
                }
                int i17 = a;
                int i18 = ((i17 | 81) << 1) - (i17 ^ 81);
                b = i18 % 128;
                int i19 = i18 % 2;
            } catch (IOException e) {
                StringBuilder sbW = j.w("exception converting octets ");
                sbW.append(e.toString());
                throw new IllegalArgumentException(sbW.toString());
            }
        }
        super(byteArrayOutputStream.toByteArray());
        this.e = mArr;
        this.d = 1000;
    }
}
