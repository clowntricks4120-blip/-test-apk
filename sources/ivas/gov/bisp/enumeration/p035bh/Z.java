package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.p102y.C0330o;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends n {
    private static int a = 1;
    private static int b;
    public final Object c;

    public Z(Boolean bool) {
        Objects.requireNonNull(bool);
        this.c = bool;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    public static boolean e(Z z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 49) | (i3 & 49)) << 1;
        int i5 = -(((~i3) & 49) | (i3 & (-50)));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        Object obj = z.c;
        boolean z2 = false;
        if (!(!(obj instanceof Number))) {
            int i9 = ((i7 & 66) + (i7 | 66)) - 1;
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            Number number = (Number) obj;
            if (!(number instanceof BigInteger)) {
                int i12 = i10 & 61;
                int i13 = -(-((i10 ^ 61) | i12));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                int i15 = i14 % 128;
                a = i15;
                boolean z3 = number instanceof Long;
                if (i14 % 2 == 0) {
                    int i16 = 37 / 0;
                    if (!z3) {
                        i = i15 + 29;
                        b = i % 128;
                        if (i % 2 == 0) {
                            boolean z4 = number instanceof Integer;
                            throw null;
                        }
                        if (!(number instanceof Integer) && !(number instanceof Short)) {
                            int i17 = (-2) - (((i15 & 98) + (i15 | 98)) ^ (-1));
                            b = i17 % 128;
                            int i18 = i17 % 2;
                            if (number instanceof Byte) {
                                int i19 = a;
                                int i20 = i19 & 3;
                                int i21 = -(-((i19 ^ 3) | i20));
                                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                                b = i22 % 128;
                                int i23 = i22 % 2;
                            }
                        }
                    }
                } else if (!z3) {
                    i = i15 + 29;
                    b = i % 128;
                    if (i % 2 == 0) {
                        boolean z5 = number instanceof Integer;
                        throw null;
                    }
                    if (!(number instanceof Integer)) {
                        int i110 = (-2) - (((i15 & 98) + (i15 | 98)) ^ (-1));
                        b = i110 % 128;
                        int i111 = i110 % 2;
                        if (number instanceof Byte) {
                            int i112 = a;
                            int i24 = i112 & 3;
                            int i25 = -(-((i112 ^ 3) | i24));
                            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                            b = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    }
                }
            }
            int i28 = a;
            int i29 = (((i28 & (-8)) | ((~i28) & 7)) - (~((i28 & 7) << 1))) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            z2 = true;
        } else {
            int i113 = a;
            int i210 = i113 & 3;
            int i211 = -(-((i113 ^ 3) | i210));
            int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
            b = i212 % 128;
            int i213 = i212 % 2;
        }
        int i31 = b;
        int i32 = i31 ^ 81;
        int i33 = (((i31 & 81) | i32) << 1) - i32;
        a = i33 % 128;
        int i34 = i33 % 2;
        return z2;
    }

    public final boolean f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 98) + (i2 | 98)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.c;
        if (!(!(obj instanceof Boolean))) {
            int i5 = (i2 & (-58)) | ((~i2) & 57);
            int i6 = (i2 & 57) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return ((Boolean) obj).booleanValue();
            }
            ((Boolean) obj).booleanValue();
            throw null;
        }
        boolean z = Boolean.parseBoolean(h());
        int i8 = b;
        int i9 = i8 & 109;
        int i10 = ((i8 ^ 109) | i9) << 1;
        int i11 = -((i8 | 109) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final Number g() {
        Number c0330o;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 111) + (i2 | 111);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = this.c instanceof String;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.c;
        if (obj2 instanceof String) {
            c0330o = new C0330o((String) obj2);
            int i4 = a + 55;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = ((i5 ^ 93) | (i5 & 93)) << 1;
            int i8 = -(((~i5) & 93) | (i5 & (-94)));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = (i2 & 15) + (i2 | 15);
            a = i11 % 128;
            int i12 = i11 % 2;
            c0330o = (Number) obj2;
        }
        int i13 = a;
        int i14 = (i13 & 41) + (i13 | 41);
        b = i14 % 128;
        int i15 = i14 % 2;
        return c0330o;
    }

    public Z(Number number) {
        Objects.requireNonNull(number);
        this.c = number;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.c == null) {
            int i5 = i4 + 39;
            a = i5 % 128;
            int i6 = i5 % 2;
            return 31;
        }
        if (e(this)) {
            int i7 = a;
            int i8 = (i7 & (-32)) | ((~i7) & 31);
            int i9 = -(-((i7 & 31) << 1));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            jDoubleToLongBits = g().longValue();
            int i12 = a + 28;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object obj2 = this.c;
            if (!(obj2 instanceof Number)) {
                int iHashCode = obj2.hashCode();
                int i15 = a;
                int i16 = i15 ^ 75;
                int i17 = ((i15 & 75) | i16) << 1;
                int i18 = -i16;
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    return iHashCode;
                }
                obj.hashCode();
                throw null;
            }
            int i20 = a;
            int i21 = (((i20 & (-78)) | ((~i20) & 77)) - (~((i20 & 77) << 1))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                jDoubleToLongBits = Double.doubleToLongBits(g().doubleValue());
                int i22 = 59 / 0;
            } else {
                jDoubleToLongBits = Double.doubleToLongBits(g().doubleValue());
            }
            int i23 = a;
            int i24 = i23 & 11;
            int i25 = (i24 - (~(-(-((i23 ^ 11) | i24))))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        int i28 = a + 105;
        b = i28 % 128;
        int i29 = i28 % 2;
        return i27;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (ivas.gov.bisp.enumeration.p035bh.Z.class == r13.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (ivas.gov.bisp.enumeration.p035bh.Z.class == r13.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r13 = (ivas.gov.bisp.enumeration.p035bh.Z) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r12.c != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p035bh.Z.b + 109;
        r4 = r2 % 128;
        ivas.gov.bisp.enumeration.p035bh.Z.a = r4;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r13.c == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r13 = (-2) - ((((r4 | 46) << 1) - (r4 ^ 46)) ^ (-1));
        ivas.gov.bisp.enumeration.p035bh.Z.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if ((r13 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.b + 57;
        ivas.gov.bisp.enumeration.p035bh.Z.a = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (e(r12) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r6 = r2 & 33;
        r2 = (r2 ^ 33) | r6;
        r7 = (r6 ^ r2) + ((r2 & r6) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if ((r7 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        r6 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (e(r13) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (e(r13) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        r6 = g().longValue();
        r8 = r13.g().longValue();
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r2 = r13 & 111;
        r10 = -(-((r13 ^ 111) | r2));
        r11 = ((r2 | r10) << 1) - (r2 ^ r10);
        r2 = r11 % 128;
        ivas.gov.bisp.enumeration.p035bh.Z.a = r2;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r6 != r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        r13 = r2 ^ 7;
        r1 = -(-((r2 & 7) << 1));
        r2 = ((r13 | r1) << 1) - (r13 ^ r1);
        ivas.gov.bisp.enumeration.p035bh.Z.b = r2 % 128;
        r2 = r2 % 2;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        r2 = (r13 & (-120)) | ((~r13) & 119);
        r13 = -(-((r13 & 119) << 1));
        r6 = (r2 ^ r13) + ((r13 & r2) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.a;
        r2 = ((r13 ^ 23) | (r13 & 23)) << 1;
        r13 = -(((~r13) & 23) | (r13 & (-24)));
        r4 = (r2 ^ r13) + ((r13 & r2) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011f, code lost:
    
        if ((r4 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
    
        r2 = r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        if ((r2 instanceof java.lang.Number) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r7 = (((r6 | 24) << 1) - (r6 ^ 24)) - 1;
        ivas.gov.bisp.enumeration.p035bh.Z.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013b, code lost:
    
        if ((r13.c instanceof java.lang.Number) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        r2 = (-2) - ((((r6 | 52) << 1) - (r6 ^ 52)) ^ (-1));
        ivas.gov.bisp.enumeration.p035bh.Z.a = r2 % 128;
        r2 = r2 % 2;
        r6 = g().doubleValue();
        r8 = r13.g().doubleValue();
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r2 = r13 & 43;
        r13 = (r13 ^ 43) | r2;
        r10 = (r2 & r13) + (r13 | r2);
        ivas.gov.bisp.enumeration.p035bh.Z.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        if ((r10 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        if (r6 == r8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0173, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        if (r6 == r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        if (java.lang.Double.isNaN(r6) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.a;
        r2 = (r13 ^ 89) + ((r13 & 89) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
    
        if ((r2 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0192, code lost:
    
        if (java.lang.Double.isNaN(r8) == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0195, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r2 = ((r13 & (-24)) | ((~r13) & 23)) + ((r13 & 23) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a5, code lost:
    
        java.lang.Double.isNaN(r8);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ac, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r2 = ((((r13 ^ 93) | (r13 & 93)) << 1) - (~(-(((~r13) & 93) | (r13 & (-94)))))) - 1;
        ivas.gov.bisp.enumeration.p035bh.Z.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c4, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c5, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p035bh.Z.b;
        r5 = r2 & 11;
        r4 = ((r2 ^ 11) | r5) << 1;
        r2 = -((r2 | 11) & (~r5));
        r5 = (r4 ^ r2) + ((r2 & r4) << 1);
        ivas.gov.bisp.enumeration.p035bh.Z.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        if ((r5 % 2) != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
    
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e1, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e2, code lost:
    
        r13 = r2.equals(r13.c);
        r1 = ivas.gov.bisp.enumeration.p035bh.Z.a;
        r4 = r1 & 109;
        r2 = (((r1 ^ 109) | r4) << 1) - ((r1 | 109) & (~r4));
        ivas.gov.bisp.enumeration.p035bh.Z.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fa, code lost:
    
        if ((r2 % 2) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p035bh.Z.equals(java.lang.Object):boolean");
    }

    public final String h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = (i3 - (~((i2 ^ 95) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        Object obj = this.c;
        Object obj2 = null;
        if (!(!(obj instanceof Number))) {
            int i7 = i5 + 61;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return g().toString();
            }
            g().toString();
            throw null;
        }
        if (!(obj instanceof Boolean)) {
            String str = (String) obj;
            int i8 = i5 | 103;
            int i9 = (i8 << 1) - (i8 & (~(i5 & 103)));
            a = i9 % 128;
            int i10 = i9 % 2;
            return str;
        }
        int i11 = i5 & 49;
        int i12 = i11 + ((i5 ^ 49) | i11);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return ((Boolean) obj).toString();
        }
        ((Boolean) obj).toString();
        obj2.hashCode();
        throw null;
    }

    public Z(String str) {
        Objects.requireNonNull(str);
        this.c = str;
    }
}
