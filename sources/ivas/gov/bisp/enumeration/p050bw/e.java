package ivas.gov.bisp.enumeration.p050bw;

import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C0144q;
import ivas.gov.bisp.enumeration.p035bh.W;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.Z;
import ivas.gov.bisp.enumeration.p102y.J;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {
    private static int a = 1;
    private static int b;
    public static final Object s;
    public Object[] t;
    public int u;
    public int[] v;
    public String[] w;

    public class brS extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = 2 % 2;
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            int i3 = 2 % 2;
            throw new AssertionError();
        }
    }

    static {
        new brS();
        Object obj = new Object();
        int i = b;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        s = obj;
        if (i5 == 0) {
            int i6 = 31 / 0;
        }
    }

    private String m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 60) + (i2 | 60)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(" at path ");
        sbW.append(k());
        int i5 = b;
        int i6 = i5 ^ 33;
        int i7 = ((((i5 & 33) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return sbW.toString();
        }
        sbW.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected ");
        r2 = ivas.gov.bisp.enumeration.p050bw.e.a + 15;
        ivas.gov.bisp.enumeration.p050bw.e.b = r2 % 128;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r2 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.append(ivas.gov.bisp.enumeration.p091n.j.F(r6));
        r1.append(" but was ");
        r6 = ivas.gov.bisp.enumeration.p050bw.e.b;
        r2 = (r6 & 45) + (r6 | 45);
        ivas.gov.bisp.enumeration.p050bw.e.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r1.append(ivas.gov.bisp.enumeration.p091n.j.F(y()));
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r1.append(ivas.gov.bisp.enumeration.p091n.j.F(y()));
        r1.append(m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r1.append(ivas.gov.bisp.enumeration.p091n.j.F(r6));
        r1.append(" but was ");
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (y() == r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (y() == r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p050bw.e.a;
        r1 = (r6 & 5) + (r6 | 5);
        ivas.gov.bisp.enumeration.p050bw.e.b = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p050bw.e.a
            int r1 = r1 + 85
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p050bw.e.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r1 = r5.y()
            r2 = 31
            int r2 = r2 / 0
            if (r1 != r6) goto L2c
            goto L1f
        L19:
            int r1 = r5.y()
            if (r1 != r6) goto L2c
        L1f:
            int r6 = ivas.gov.bisp.enumeration.p050bw.e.a
            r1 = r6 & 5
            r6 = r6 | 5
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.p050bw.e.b = r6
            int r1 = r1 % r0
            return
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            r1.append(r2)
            int r2 = ivas.gov.bisp.enumeration.p050bw.e.a
            int r2 = r2 + 15
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.e.b = r3
            int r2 = r2 % r0
            java.lang.String r3 = " but was "
            r4 = 0
            if (r2 != 0) goto L87
            java.lang.String r6 = ivas.gov.bisp.enumeration.p091n.j.F(r6)
            r1.append(r6)
            r1.append(r3)
            int r6 = ivas.gov.bisp.enumeration.p050bw.e.b
            r2 = r6 & 45
            r6 = r6 | 45
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.p050bw.e.a = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L6b
            int r6 = r5.y()
            java.lang.String r6 = ivas.gov.bisp.enumeration.p091n.j.F(r6)
            r1.append(r6)
            r5.m()
            throw r4
        L6b:
            int r6 = r5.y()
            java.lang.String r6 = ivas.gov.bisp.enumeration.p091n.j.F(r6)
            r1.append(r6)
            java.lang.String r6 = r5.m()
            r1.append(r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L87:
            java.lang.String r6 = ivas.gov.bisp.enumeration.p091n.j.F(r6)
            r1.append(r6)
            r1.append(r3)
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.e.E(int):void");
    }

    public final Object F() {
        int i = 2 % 2;
        int i2 = b + 9;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        Object[] objArr = this.t;
        int i5 = this.u;
        Object obj = objArr[((~i5) - (~(i5 << 1))) - 1];
        int i6 = ((i3 & (-54)) | ((~i3) & 53)) + ((i3 & 53) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }

    public final Object G() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 125;
        int i5 = -(-((i3 & 125) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object[] objArr = this.t;
        if (i8 != 0) {
            int i9 = this.u;
            i = ((~i9) - (~(i9 << 1))) - 1;
        } else {
            int i10 = this.u;
            int i11 = i10 ^ (-1);
            int i12 = -(-(i10 << 1));
            i = (i11 ^ i12) + ((i12 & i11) << 1);
        }
        this.u = i;
        Object obj = objArr[i];
        objArr[i] = null;
        int i13 = (i7 & 19) + (i7 | 19);
        a = i13 % 128;
        int i14 = i13 % 2;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003c  */
    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final boolean c() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-(i2 | 123));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iY = y();
        if (iY != 4) {
            int i7 = a;
            int i8 = i7 & 57;
            int i9 = i8 + ((i7 ^ 57) | i8);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            if (iY != 2) {
                int i12 = i10 ^ 99;
                int i13 = (i10 & 99) << 1;
                int i14 = (i12 & i13) + (i12 | i13);
                a = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                int i16 = a + 79;
                b = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
        } else {
            int i18 = a + 79;
            b = i18 % 128;
            int i19 = i18 % 2;
            z = false;
        }
        int i20 = a;
        int i21 = i20 & 73;
        int i22 = (i20 ^ 73) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final String toString() {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return e.class.getSimpleName();
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final String x() {
        int iY;
        String strM;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 19) - (~((i2 & 19) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0 ? (iY = y()) != 6 : (iY = y()) != 75) {
            int i4 = a;
            int i5 = (i4 & 5) + (i4 | 5);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (iY != 7) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                int i7 = b;
                int i8 = i7 & 41;
                int i9 = ((i7 | 41) & (~i8)) + (i8 << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                sb.append(ivas.gov.bisp.enumeration.p091n.j.F(6));
                sb.append(" but was ");
                int i11 = b + 71;
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                    strM = m();
                    int i12 = 26 / 0;
                } else {
                    sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                    strM = m();
                }
                sb.append(strM);
                throw new IllegalStateException(sb.toString());
            }
        }
        String strH = ((Z) G()).h();
        int i13 = a;
        int i14 = (i13 & 113) + (i13 | 113);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i15 = this.u;
        if (i15 > 0) {
            int i16 = (i13 | 9) << 1;
            int i17 = -(i13 ^ 9);
            int i18 = (i16 & i17) + (i17 | i16);
            int i19 = i18 % 128;
            b = i19;
            int i20 = i18 % 2;
            int[] iArr = this.v;
            int i21 = i15 - 1;
            int i22 = i19 & 33;
            int i23 = i22 + ((i19 ^ 33) | i22);
            int i24 = i23 % 128;
            a = i24;
            if (i23 % 2 == 0) {
                int i25 = iArr[i21];
                int i26 = i25 & 1;
                int i27 = -(-((i25 ^ 1) | i26));
                iArr[i21] = (i26 & i27) + (i27 | i26);
            } else {
                int i28 = iArr[i21];
                iArr[i21] = ((i28 ^ 2) + ((i28 & 2) << 1)) - 1;
            }
            int i29 = i24 + 105;
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = (i31 ^ 81) + ((i31 & 81) << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        return strH;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = (~i3) & (i2 | 31);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.t = new Object[]{s};
        int i8 = i2 ^ 111;
        int i9 = -(-((i2 & 111) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        this.u = 1;
        int i13 = i11 & 109;
        int i14 = ((i11 ^ 109) | i13) << 1;
        int i15 = -((i11 | 109) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = -(-((i2 ^ 111) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            E(0);
        } else {
            E(1);
        }
        H(((W) F()).iterator());
        int[] iArr = this.v;
        int i6 = b + 106;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            iArr[this.u >> 1] = 0;
        } else {
            int i8 = this.u;
            iArr[(i8 ^ (-1)) + (i8 << 1)] = 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final boolean n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 23;
        int i4 = -(-((i2 & 23) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        E(i5 % 2 == 0 ? 56 : 8);
        boolean zF = ((Z) G()).f();
        int i6 = a;
        int i7 = i6 + 31;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = this.u;
        if (i9 > 0) {
            int i10 = (((i6 | 6) << 1) - (i6 ^ 6)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int[] iArr = this.v;
            int i12 = i9 - 1;
            int i13 = iArr[i12];
            int i14 = i13 & 1;
            int i15 = -(-((i13 ^ 1) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = (i6 & 89) + (i6 | 89);
            b = i17 % 128;
            int i18 = i17 % 2;
            iArr[i12] = i16;
            int i19 = i6 & 123;
            int i20 = i6 | 123;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = ((i6 | 15) << 1) - (i6 ^ 15);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            return zF;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void C() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (y() == 5) {
            int i5 = b;
            int i6 = i5 & 33;
            int i7 = -(-((i5 ^ 33) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                r();
                throw null;
            }
            r();
            String[] strArr = this.w;
            int i9 = this.u;
            strArr[((i9 ^ (-1)) + (i9 << 1)) - 1] = "null";
            int i10 = a;
            int i11 = (((i10 | 108) << 1) - (i10 ^ 108)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        } else {
            G();
            int i13 = this.u;
            if (i13 > 0) {
                int i14 = a;
                int i15 = i14 & 123;
                int i16 = (i14 | 123) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 & i17) + (i16 | i17);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    this.w[i13] = "null";
                } else {
                    String[] strArr2 = this.w;
                    int i19 = ~i13;
                    int i20 = -(-(i13 << 1));
                    strArr2[(i19 & i20) + (i20 | i19)] = "null";
                }
            }
        }
        int i21 = this.u;
        if (i21 > 0) {
            int i22 = a;
            int i23 = i22 ^ 117;
            int i24 = ((((i22 & 117) | i23) << 1) - (~(-i23))) - 1;
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % 2;
            int[] iArr = this.v;
            int i27 = i21 & 22;
            int i28 = (i21 | 22) & (~i27);
            int i29 = i27 << 1;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            int i31 = i30 & (-23);
            int i32 = (i31 - (~((i30 ^ (-23)) | i31))) - 1;
            int i33 = i25 + 117;
            a = i33 % 128;
            int i34 = i33 % 2;
            iArr[i32] = iArr[i32] + 1;
            int i35 = i25 + 119;
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = a + 19;
        b = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 44 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = -(-(i2 | 81));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        E(4);
        G();
        G();
        int i7 = a;
        int i8 = (i7 | 123) << 1;
        int i9 = -(i7 ^ 123);
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = this.u;
        if (i13 > 0) {
            int i14 = i11 + 90;
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            int[] iArr = this.v;
            int i17 = (i13 - (~(-(-((~i13) | i13))))) - 1;
            int i18 = iArr[i17];
            int i19 = (i18 | 1) << 1;
            int i20 = -(((~i18) & 1) | (i18 & (-2)));
            iArr[i17] = (i19 & i20) + (i20 | i19);
            int i21 = (i11 ^ 79) + ((i11 & 79) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = a;
        int i24 = (i23 & 108) + (i23 | 108);
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final int y() {
        Object obj;
        int i;
        int i2 = 2 % 2;
        while (true) {
            Object obj2 = null;
            if (this.u == 0) {
                int i3 = b;
                int i4 = ((((i3 ^ 91) | (i3 & 91)) << 1) - (~(-((i3 & (-92)) | ((~i3) & 91))))) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = (i3 ^ 43) + ((i3 & 43) << 1);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    return 10;
                }
                throw null;
            }
            Object objF = F();
            if (!(objF instanceof Iterator)) {
                if (!(!(objF instanceof C0144q))) {
                    int i7 = a;
                    int i8 = i7 & 117;
                    int i9 = i8 + ((i7 ^ 117) | i8);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i7 & 89;
                    int i12 = (i7 ^ 89) | i11;
                    int i13 = (i11 & i12) + (i12 | i11);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 83 / 0;
                    }
                    return 3;
                }
                if (objF instanceof W) {
                    int i15 = (-2) - ((a + 76) ^ (-1));
                    b = i15 % 128;
                    return i15 % 2 != 0 ? 0 : 1;
                }
                if (!(objF instanceof Z)) {
                    if (!(objF instanceof Y)) {
                        if (objF == s) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                        throw new AssertionError();
                    }
                    int i16 = b;
                    int i17 = (i16 & 3) + (i16 | 3);
                    a = i17 % 128;
                    return i17 % 2 == 0 ? 95 : 9;
                }
                int i18 = b;
                int i19 = (i18 ^ 89) + ((i18 & 89) << 1);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    boolean z = ((Z) objF).c instanceof String;
                    throw null;
                }
                Object obj3 = ((Z) objF).c;
                if (obj3 instanceof String) {
                    int i20 = a + 13;
                    int i21 = i20 % 128;
                    b = i21;
                    int i22 = i20 % 2;
                    int i23 = (i21 | 77) << 1;
                    int i24 = -(i21 ^ 77);
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    a = i25 % 128;
                    if (i25 % 2 != 0) {
                        return 6;
                    }
                    throw null;
                }
                if (obj3 instanceof Boolean) {
                    int i26 = b;
                    int i27 = (i26 ^ 13) + ((i26 & 13) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2 == 0 ? 29 : 8;
                    int i29 = i26 & 123;
                    int i30 = (((i26 ^ 123) | i29) << 1) - ((i26 | 123) & (~i29));
                    a = i30 % 128;
                    if (i30 % 2 != 0) {
                        return i28;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (!(obj3 instanceof Number)) {
                    throw new AssertionError();
                }
                int i31 = a;
                int i32 = (((i31 ^ 55) | (i31 & 55)) << 1) - ((i31 & (-56)) | ((~i31) & 55));
                b = i32 % 128;
                int i33 = i32 % 2 != 0 ? 60 : 7;
                int i34 = i31 & 117;
                int i35 = (i34 - (~((i31 ^ 117) | i34))) - 1;
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    return i33;
                }
                throw null;
            }
            int i36 = a;
            int i37 = i36 & 49;
            int i38 = -(-((i36 ^ 49) | i37));
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            if (i39 % 2 != 0) {
                obj = this.t[this.u >>> 2];
            } else {
                Object[] objArr = this.t;
                int i40 = this.u;
                obj = objArr[((i40 | (-2)) << 1) - (i40 ^ (-2))];
            }
            boolean z2 = obj instanceof C0144q;
            Iterator it = (Iterator) objF;
            if (!it.hasNext()) {
                if (!z2) {
                    int i41 = b;
                    int i42 = (i41 ^ 31) + ((i41 & 31) << 1);
                    a = i42 % 128;
                    if (i42 % 2 == 0) {
                        int i43 = 5 / 5;
                    }
                    i = 2;
                } else {
                    int i44 = a;
                    int i45 = i44 + 43;
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = ((i44 & (-48)) | ((~i44) & 47)) + ((i44 & 47) << 1);
                    b = i47 % 128;
                    i = 4;
                    if (i47 % 2 != 0) {
                        int i48 = 4 % 3;
                    }
                }
                int i49 = a;
                int i50 = (i49 & (-106)) | ((~i49) & 105);
                int i51 = (i49 & 105) << 1;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                if (i52 % 2 == 0) {
                    return i;
                }
                obj2.hashCode();
                throw null;
            }
            int i53 = a;
            int i54 = (i53 ^ 85) + ((i53 & 85) << 1);
            int i55 = i54 % 128;
            b = i55;
            if (i54 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (z2) {
                int i56 = ((i55 | 1) << 1) - ((i55 & (-2)) | (1 & (~i55)));
                a = i56 % 128;
                if (i56 % 2 == 0) {
                    int i57 = 54 / 0;
                }
                return 5;
            }
            H(it.next());
            int i58 = b;
            int i59 = i58 & 77;
            int i60 = i59 + ((i58 ^ 77) | i59);
            a = i60 % 128;
            int i61 = i60 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        E(2);
        G();
        G();
        int i7 = b;
        int i8 = i7 & 107;
        int i9 = (~i8) & (i7 | 107);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i12 = this.u;
        if (i12 > 0) {
            int[] iArr = this.v;
            int i13 = ~i12;
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i14 | i13);
            int i16 = iArr[i15];
            int i17 = (i16 | 1) << 1;
            int i18 = -(((~i16) & 1) | (i16 & (-2)));
            iArr[i15] = ((i17 | i18) << 1) - (i18 ^ i17);
            int i19 = (i7 & 40) + (i7 | 40);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = i7 & 61;
        int i23 = (i7 | 61) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 & i24) + (i23 | i24);
        a = i25 % 128;
        int i26 = i25 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final String r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i2 ^ 65) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        E(5);
        Object next = ((Iterator) F()).next();
        int i7 = b;
        int i8 = i7 & 23;
        int i9 = (((i7 | 23) & (~i8)) - (~(i8 << 1))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        Map.Entry entry = (Map.Entry) next;
        String str = (String) entry.getKey();
        int i11 = a;
        int i12 = i11 & 21;
        int i13 = -(-((i11 ^ 21) | i12));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        String[] strArr = this.w;
        int i16 = -(~this.u);
        int i17 = i11 + 121;
        b = i17 % 128;
        int i18 = i17 % 2;
        strArr[(((-2) | i16) << 1) - (i16 ^ (-2))] = str;
        H(entry.getValue());
        int i19 = a;
        int i20 = ((i19 & 26) + (i19 | 26)) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 69) | (i2 & 69)) << 1;
        int i4 = -(((~i2) & 69) | (i2 & (-70)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        E(9);
        G();
        int i7 = this.u;
        int i8 = b + 75;
        int i9 = i8 % 128;
        a = i9;
        Object obj = null;
        if (i8 % 2 == 0) {
            throw null;
        }
        if (i7 > 0) {
            int i10 = (i9 & 65) + (i9 | 65);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            int[] iArr = this.v;
            int i13 = -(-((~i7) | i7));
            int i14 = (i7 & i13) + (i7 | i13);
            int i15 = iArr[i14];
            iArr[i14] = (-2) - (((i15 & 2) + (i15 | 2)) ^ (-1));
            int i16 = (i11 & 69) + (i11 | 69);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = ((i18 ^ 97) | (i18 & 97)) << 1;
        int i20 = -(((~i18) & 97) | (i18 & (-98)));
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void H(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 85;
        int i5 = (i3 ^ 85) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.u;
        Object[] objArr = this.t;
        int i10 = (((i7 | 38) << 1) - (i7 ^ 38)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        if (i9 == objArr.length) {
            int i12 = i7 + 53;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                i = i9 >>> 3;
                this.t = Arrays.copyOf(objArr, i);
            } else {
                i = i9 * 2;
                this.t = Arrays.copyOf(objArr, i);
            }
            this.v = Arrays.copyOf(this.v, i);
            Object[] objArrCopyOf = Arrays.copyOf(this.w, i);
            int i13 = a;
            int i14 = ((i13 & 108) + (i13 | 108)) - 1;
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            this.w = (String[]) objArrCopyOf;
            int i17 = (i15 & 125) + (i15 | 125);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        Object[] objArr2 = this.t;
        int i19 = this.u;
        int i20 = a;
        int i21 = (i20 & 95) + (i20 | 95);
        b = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((i19 | 2) << 1) - (i19 ^ 2);
        this.u = (i23 ^ (-1)) + (i23 << 1);
        objArr2[i19] = obj;
        int i24 = ((i20 | 31) << 1) - (i20 ^ 31);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final void e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            E(5);
        } else {
            E(3);
        }
        J.blB.blC blc = new J.blB.blC((J.blB) ((C0144q) F()).c.entrySet());
        int i7 = b + 70;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        H(blc);
        if (i9 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i10 = b;
        int i11 = ((i10 & (-106)) | ((~i10) & 105)) + ((i10 & 105) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 27 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final int o() {
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 40) << 1) - (i3 ^ 40)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iY = y();
        if (iY != 7) {
            int i6 = b;
            int i7 = (i6 & 77) + (i6 | 77);
            a = i7 % 128;
            if (i7 % 2 != 0 ? iY != 6 : iY != 46) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                int i8 = a;
                int i9 = i8 & 119;
                int i10 = (i8 ^ 119) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                sb.append(ivas.gov.bisp.enumeration.p091n.j.F(7));
                sb.append(" but was ");
                int i13 = a;
                int i14 = (i13 ^ 113) + ((i13 & 113) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                sb.append(m());
                throw new IllegalStateException(sb.toString());
            }
        }
        Z z = (Z) F();
        if (z.c instanceof Number) {
            int i16 = b + 47;
            a = i16 % 128;
            int i17 = i16 % 2;
            iIntValue = z.g().intValue();
            int i18 = b;
            int i19 = i18 ^ 49;
            int i20 = -(-((i18 & 49) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            int i22 = i21 % 2;
        } else {
            iIntValue = Integer.parseInt(z.h());
            int i23 = b + 87;
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        G();
        int i25 = this.u;
        if (i25 > 0) {
            int i26 = b;
            int i27 = i26 & 59;
            int i28 = -(-((i26 ^ 59) | i27));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            int i30 = i29 % 128;
            a = i30;
            int i31 = i29 % 2;
            int[] iArr = this.v;
            if (i31 == 0) {
                i = (((i25 | 5) << 1) - (i25 ^ 5)) - 1;
            } else {
                int i32 = i25 & (-113);
                int i33 = ((i25 ^ (-113)) | i32) << 1;
                int i34 = -((i25 | (-113)) & (~i32));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                int i36 = i35 & 112;
                int i37 = -(-((i35 ^ 112) | i36));
                i = (i36 ^ i37) + ((i36 & i37) << 1);
            }
            int i38 = i30 + 87;
            b = i38 % 128;
            int i39 = i38 % 2;
            int i40 = iArr[i];
            int i41 = i40 & 1;
            iArr[i] = (i41 - (~(-(-((i40 ^ 1) | i41))))) - 1;
            int i42 = i30 & 71;
            int i43 = -(-((i30 ^ 71) | i42));
            int i44 = (i42 & i43) + (i42 | i43);
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        int i46 = a;
        int i47 = ((i46 & 42) + (i46 | 42)) - 1;
        b = i47 % 128;
        if (i47 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final String k() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = b;
        int i3 = i2 & 21;
        int i4 = ((~i3) & (i2 | 21)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((((i2 ^ 41) | (i2 & 41)) << 1) - (~(-(((~i2) & 41) | (i2 & (-42)))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            Object obj = null;
            if (i8 >= this.u) {
                String string = sb.toString();
                int i9 = a;
                int i10 = i9 & 63;
                int i11 = (i9 ^ 63) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
            int i13 = a;
            int i14 = i13 ^ 13;
            int i15 = (i13 & 13) << 1;
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = i16 % 128;
            b = i17;
            if (i16 % 2 != 0) {
                boolean z = this.t[i8] instanceof W;
                obj.hashCode();
                throw null;
            }
            Object[] objArr = this.t;
            Object obj2 = objArr[i8];
            if (obj2 instanceof W) {
                int i18 = (i8 & 108) | ((~i8) & (-109));
                int i19 = (i8 & (-109)) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                i8 = (((i20 | 111) << 1) - (i20 ^ 111)) - 1;
                if (objArr[i8] instanceof Iterator) {
                    int i21 = (i17 & 35) + (i17 | 35);
                    a = i21 % 128;
                    sb.append(i21 % 2 == 0 ? '\n' : '[');
                    int[] iArr = this.v;
                    int i22 = b;
                    int i23 = (((i22 & (-22)) | ((~i22) & 21)) - (~((i22 & 21) << 1))) - 1;
                    a = i23 % 128;
                    if (i23 % 2 == 0) {
                        sb.append(iArr[i8]);
                        sb.append('\t');
                    } else {
                        sb.append(iArr[i8]);
                        sb.append(']');
                    }
                    int i24 = b;
                    int i25 = (((i24 | 102) << 1) - (i24 ^ 102)) - 1;
                    a = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                }
            } else if (obj2 instanceof C0144q) {
                int i26 = i17 + 31;
                int i27 = i26 % 128;
                a = i27;
                int i28 = i26 % 2;
                int i29 = i8 & 1;
                int i30 = (i8 ^ 1) | i29;
                i8 = ((i30 & i29) << 1) + (i29 ^ i30);
                if (!(!(objArr[i8] instanceof Iterator))) {
                    int i31 = (((i27 | 39) << 1) - (~(-((i27 & (-40)) | ((~i27) & 39))))) - 1;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    sb.append('.');
                    String[] strArr = this.w;
                    int i33 = a;
                    int i34 = (i33 & 15) + (i33 | 15);
                    b = i34 % 128;
                    if (i34 % 2 != 0) {
                        String str = strArr[i8];
                        throw null;
                    }
                    String str2 = strArr[i8];
                    if (str2 != null) {
                        int i35 = i33 ^ 5;
                        int i36 = ((((i33 & 5) | i35) << 1) - (~(-i35))) - 1;
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        sb.append(str2);
                        if (i37 != 0) {
                            int i38 = 13 / 0;
                        }
                    }
                }
            }
            int i39 = i8 & 1;
            i8 = (i39 - (~((i8 ^ 1) | i39))) - 1;
            int i40 = b;
            int i41 = i40 & 111;
            int i42 = -(-((i40 ^ 111) | i41));
            int i43 = (i41 & i42) + (i42 | i41);
            a = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 5 / 3;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p032be.j
    public final long q() {
        int iY;
        long jLongValue;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 61) + (i2 | 61);
        b = i3 % 128;
        if (i3 % 2 == 0 ? (iY = y()) != 7 : (iY = y()) != 52) {
            int i4 = (-2) - ((b + 28) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 != 0 ? iY != 6 : iY != 33) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected ");
                int i5 = b;
                int i6 = (((i5 & (-2)) | ((~i5) & 1)) - (~(-(-((i5 & 1) << 1))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                sb.append(ivas.gov.bisp.enumeration.p091n.j.F(7));
                int i8 = a;
                int i9 = ((i8 & 57) - (~(i8 | 57))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                sb.append(" but was ");
                sb.append(ivas.gov.bisp.enumeration.p091n.j.F(iY));
                sb.append(m());
                throw new IllegalStateException(sb.toString());
            }
        }
        Z z = (Z) F();
        Object obj = z.c;
        int i11 = b;
        int i12 = ((((i11 ^ 17) | (i11 & 17)) << 1) - (~(-(((~i11) & 17) | (i11 & (-18)))))) - 1;
        a = i12 % 128;
        if (i12 % 2 == 0) {
            boolean z2 = obj instanceof Number;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof Number)) {
            jLongValue = Long.parseLong(z.h());
            int i13 = b;
            int i14 = ((i13 ^ 107) | (i13 & 107)) << 1;
            int i15 = -(((~i13) & 107) | (i13 & (-108)));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            jLongValue = z.g().longValue();
            int i18 = a;
            int i19 = i18 & 51;
            int i20 = ((i18 ^ 51) | i19) << 1;
            int i21 = -((i18 | 51) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        G();
        int i24 = this.u;
        if (i24 > 0) {
            int i25 = a;
            int i26 = i25 & 125;
            int i27 = (i26 - (~(-(-((i25 ^ 125) | i26))))) - 1;
            int i28 = i27 % 128;
            b = i28;
            int i29 = i27 % 2;
            int[] iArr = this.v;
            int i30 = (i24 & 125) + (i24 | 125);
            int i31 = (i30 ^ (-126)) + ((i30 & (-126)) << 1);
            int i32 = i28 + 15;
            a = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = iArr[i31];
                iArr[i31] = 0;
            } else {
                int i34 = iArr[i31];
                int i35 = i34 ^ 1;
                int i36 = (i34 & 1) << 1;
                iArr[i31] = ((i35 | i36) << 1) - (i36 ^ i35);
            }
            int i37 = i28 & 121;
            int i38 = (i28 ^ 121) | i37;
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = b;
        int i42 = i41 & 7;
        int i43 = ((i41 ^ 7) | i42) << 1;
        int i44 = -((7 | i41) & (~i42));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        a = i45 % 128;
        int i46 = i45 % 2;
        return jLongValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (java.lang.Double.isInfinite(r1) == false) goto L27;
     */
    @Override // ivas.gov.bisp.enumeration.p032be.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double p() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p050bw.e.p():double");
    }
}
