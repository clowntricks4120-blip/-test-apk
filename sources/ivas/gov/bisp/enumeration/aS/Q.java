package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aC.EnumC0042v;
import ivas.gov.bisp.enumeration.o0000o0o.o00oO0o;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class Q<P> {
    private static int a = 1;
    private static int b;
    public final ConcurrentMap<bgX, List<o00oO0o.OooO0O0<P>>> c = new ConcurrentHashMap();
    public o00oO0o.OooO0O0<P> d;
    public final Class<P> e;

    public static final class bgW<P> {
        private static int a = 1;
        private static int b;
        public final P c;
        public final byte[] d;
        public final EnumC0042v e;
        public final D f;

        public bgW(P p, byte[] bArr, EnumC0042v enumC0042v, D d, int i) {
            this.c = p;
            this.d = Arrays.copyOf(bArr, bArr.length);
            this.e = enumC0042v;
            this.f = d;
        }

        public final byte[] c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 35;
            int i4 = -(-((i2 ^ 35) | i3));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.d;
            if (bArr != null) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                int i6 = b;
                int i7 = i6 & 47;
                int i8 = ((i6 | 47) & (~i7)) + (i7 << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    return bArrCopyOf;
                }
                obj.hashCode();
                throw null;
            }
            int i9 = i2 & 11;
            int i10 = (i2 ^ 11) | i9;
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i2 & 71;
            int i14 = -(-((i2 ^ 71) | i13));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    public Q(Class<P> cls) {
        this.e = cls;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    public final List<o00oO0o.OooO0O0<P>> c(byte[] bArr) {
        int i = 2 % 2;
        List<o00oO0o.OooO0O0<P>> list = this.c.get(new bgX(bArr, null));
        int i2 = a;
        int i3 = (i2 & (-56)) | ((~i2) & 55);
        int i4 = -(-((i2 & 55) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        List<o00oO0o.OooO0O0<P>> listEmptyList = list;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
                int i7 = a;
                int i8 = (i7 & 103) + (i7 | 103);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
            int i10 = a;
            int i11 = (i10 & 103) + (i10 | 103);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a + 99;
        b = i13 % 128;
        int i14 = i13 % 2;
        return listEmptyList;
    }

    public final List<o00oO0o.OooO0O0<P>> d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 13) + (i2 | 13);
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = P.c;
        if (i4 != 0) {
            return c(bArr);
        }
        c(bArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class bgX implements Comparable<bgX> {
        private static int a = 1;
        private static int b;
        public final byte[] c;

        public bgX(byte[] bArr, bgV bgv) {
            this.c = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            r7 = java.util.Arrays.equals(r6.c, ((ivas.gov.bisp.enumeration.aS.Q.bgX) r7).c);
            r1 = ivas.gov.bisp.enumeration.aS.Q.bgX.b;
            r2 = ((r1 | 30) << 1) - (r1 ^ 30);
            r1 = (r2 ^ (-1)) + (r2 << 1);
            ivas.gov.bisp.enumeration.aS.Q.bgX.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (r3 != true) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r3 != true) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            r7 = r1 ^ 59;
            r1 = -(-((r1 & 59) << 1));
            r3 = (r7 & r1) + (r7 | r1);
            r7 = r3 % 128;
            ivas.gov.bisp.enumeration.aS.Q.bgX.b = r7;
            r3 = r3 % 2;
            r1 = r7 | 11;
            r3 = (r1 << 1) - ((~(r7 & 11)) & r1);
            ivas.gov.bisp.enumeration.aS.Q.bgX.a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        
            return false;
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
                int r1 = ivas.gov.bisp.enumeration.aS.Q.bgX.a
                r2 = r1 & 115(0x73, float:1.61E-43)
                int r3 = ~r2
                r4 = r1 | 115(0x73, float:1.61E-43)
                r3 = r3 & r4
                r4 = 1
                int r2 = r2 << r4
                r5 = r3 | r2
                int r5 = r5 << r4
                r2 = r2 ^ r3
                int r5 = r5 - r2
                int r2 = r5 % 128
                ivas.gov.bisp.enumeration.aS.Q.bgX.b = r2
                int r5 = r5 % r0
                r2 = 0
                boolean r3 = r7 instanceof ivas.gov.bisp.enumeration.aS.Q.bgX
                if (r5 == 0) goto L21
                int r5 = r2 / r2
                if (r3 == r4) goto L42
                goto L23
            L21:
                if (r3 == r4) goto L42
            L23:
                r7 = r1 ^ 59
                r1 = r1 & 59
                int r1 = r1 << r4
                int r1 = -r1
                int r1 = -r1
                r3 = r7 & r1
                r7 = r7 | r1
                int r3 = r3 + r7
                int r7 = r3 % 128
                ivas.gov.bisp.enumeration.aS.Q.bgX.b = r7
                int r3 = r3 % r0
                r1 = r7 | 11
                int r3 = r1 << 1
                r7 = r7 & 11
                int r7 = ~r7
                r7 = r7 & r1
                int r3 = r3 - r7
                int r7 = r3 % 128
                ivas.gov.bisp.enumeration.aS.Q.bgX.a = r7
                int r3 = r3 % r0
                return r2
            L42:
                ivas.gov.bisp.enumeration.aS.Q$bgX r7 = (ivas.gov.bisp.enumeration.aS.Q.bgX) r7
                byte[] r1 = r6.c
                byte[] r7 = r7.c
                boolean r7 = java.util.Arrays.equals(r1, r7)
                int r1 = ivas.gov.bisp.enumeration.aS.Q.bgX.b
                r2 = r1 | 30
                int r2 = r2 << r4
                r1 = r1 ^ 30
                int r2 = r2 - r1
                r1 = r2 ^ (-1)
                int r2 = r2 << r4
                int r1 = r1 + r2
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.aS.Q.bgX.a = r2
                int r1 = r1 % r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aS.Q.bgX.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Arrays.hashCode(this.c);
            int i5 = a;
            int i6 = (-2) - (((i5 & 82) + (i5 | 82)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 67;
            int i4 = i2 | 67;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                r.A(this.c);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strA = r.A(this.c);
            int i6 = a;
            int i7 = ((i6 & (-60)) | ((~i6) & 59)) + ((i6 & 59) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            return strA;
        }

        @Override // java.lang.Comparable
        public int compareTo(bgX bgx) {
            int length;
            int length2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            bgX bgx2 = bgx;
            byte[] bArr = this.c;
            int length3 = bArr.length;
            byte[] bArr2 = bgx2.c;
            int i6 = ((i4 | 63) << 1) - (i4 ^ 63);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            if (length3 == bArr2.length) {
                int i9 = ((i4 ^ 71) | (i4 & 71)) << 1;
                int i10 = -(((~i4) & 71) | (i4 & (-72)));
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 0;
                while (true) {
                    byte[] bArr3 = this.c;
                    int i14 = b;
                    int i15 = i14 & 7;
                    int i16 = -(-((i14 ^ 7) | i15));
                    int i17 = (i15 & i16) + (i16 | i15);
                    int i18 = i17 % 128;
                    a = i18;
                    if (i17 % 2 == 0) {
                        int length4 = bArr3.length;
                        throw null;
                    }
                    if (i13 < bArr3.length) {
                        byte b2 = bArr3[i13];
                        byte[] bArr4 = bgx2.c;
                        int i19 = i18 & 89;
                        int i20 = (((i18 ^ 89) | i19) << 1) - ((~i19) & (i18 | 89));
                        int i21 = i20 % 128;
                        b = i21;
                        if (i20 % 2 != 0) {
                            byte b3 = bArr4[i13];
                            throw null;
                        }
                        byte b4 = bArr4[i13];
                        if (b2 != b4) {
                            int i22 = ((i18 & (-12)) | ((~i18) & 11)) + ((i18 & 11) << 1);
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = 2 % 4;
                            }
                            length = b2;
                            length2 = b4;
                            break;
                        }
                        i13++;
                        int i24 = i21 & 113;
                        int i25 = ((i21 ^ 113) | i24) << 1;
                        int i26 = -((~i24) & (i21 | 113));
                        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                    }
                    int i29 = a;
                    int i30 = ((i29 ^ 63) | (i29 & 63)) << 1;
                    int i31 = -(((~i29) & 63) | (i29 & (-64)));
                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    return i8;
                }
            }
            int i34 = i4 + 99;
            int i35 = i34 % 128;
            a = i35;
            if (i34 % 2 == 0) {
                length = bArr.length;
                length2 = bArr2.length;
                int i36 = 65 / 0;
            } else {
                length = bArr.length;
                length2 = bArr2.length;
            }
            int i37 = i35 + 121;
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = -length2;
            int i40 = length & i39;
            i8 = (((i39 | length) & (~i40)) - (~(i40 << 1))) - 1;
            int i41 = b;
            int i42 = i41 & 119;
            int i43 = -(-((i41 ^ 119) | i42));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            a = i44 % 128;
            int i45 = i44 % 2;
            int i210 = a;
            int i310 = ((i210 ^ 63) | (i210 & 63)) << 1;
            int i311 = -(((~i210) & 63) | (i210 & (-64)));
            int i312 = (i310 ^ i311) + ((i311 & i310) << 1);
            b = i312 % 128;
            int i313 = i312 % 2;
            return i8;
        }
    }
}
