package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0272r extends O {
    private static int b;
    public final byte[] d;
    public final int e;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static int a = 33 % 128;

    static {
        if (33 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AbstractC0272r(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i <= 7) {
            int i2 = a;
            int i3 = (((i2 ^ 69) | (i2 & 69)) << 1) - (((~i2) & 69) | (i2 & (-70)));
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i >= 0) {
                this.d = j.c(bArr);
                this.e = i;
                int i4 = b;
                int i5 = i4 & 49;
                int i6 = (i4 | 49) & (~i5);
                int i7 = i5 << 1;
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:44:0x0176  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = (i2 ^ 91) | i3;
        int i5 = i3 ^ i4;
        int i6 = i3 & i4;
        boolean z = true;
        int i7 = i5 + (i6 << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        if (!(o2 instanceof AbstractC0272r)) {
            int i10 = (((i2 | 65) << 1) - (~(-(((~i2) & 65) | (i2 & (-66)))))) - 1;
            b = i10 % 128;
            return i10 % 2 != 0;
        }
        AbstractC0272r abstractC0272r = (AbstractC0272r) o2;
        if (this.e != abstractC0272r.e) {
            int i11 = i8 & 35;
            int i12 = i8 | 35;
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i8 & 109;
            int i16 = i15 + ((i8 ^ 109) | i15);
            a = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        byte[] bArr = this.d;
        byte[] bArr2 = abstractC0272r.d;
        int i18 = i2 + 121;
        int i19 = i18 % 128;
        b = i19;
        int i20 = i18 % 2;
        int length = bArr.length;
        if (length != bArr2.length) {
            int i21 = ((i19 ^ 69) - (~((i19 & 69) << 1))) - 1;
            a = i21 % 128;
            return i21 % 2 == 0;
        }
        int i22 = -(-((length ^ (-1)) | length));
        int i23 = ((length | i22) << 1) - (length ^ i22);
        if (i23 < 0) {
            int i24 = ((i19 | 3) << 1) - (i19 ^ 3);
            a = i24 % 128;
            int i25 = i24 % 2;
            int i26 = i19 & 83;
            int i27 = -(-((i19 ^ 83) | i26));
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            a = i28 % 128;
            int i29 = i28 % 2;
            return true;
        }
        int i30 = (i2 & 25) + (i2 | 25);
        b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = 0;
        while (true) {
            Object obj = null;
            if (i32 >= i23) {
                byte b2 = bArr[i23];
                int i33 = this.e;
                int i34 = 255 << i33;
                int i35 = b;
                int i36 = i35 & 47;
                int i37 = ((i35 ^ 47) | i36) << 1;
                int i38 = -((i35 | 47) & (~i36));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                int i40 = i39 % 128;
                a = i40;
                if (i39 % 2 == 0) {
                    int i41 = ((~i34) & b2) | ((~b2) & i34);
                    int i42 = b2 & i34;
                    byte b3 = (byte) ((i42 & i41) | (i41 ^ i42));
                    byte b4 = bArr2[i23];
                    int i43 = 6336 >> i33;
                    int i44 = ((~i43) & b4) | ((~b4) & i43);
                    int i45 = b4 & i43;
                    if (b3 == ((byte) ((i45 & i44) | (i44 ^ i45)))) {
                        int i46 = (i40 & (-46)) | ((~i40) & 45);
                        int i47 = -(-((i40 & 45) << 1));
                        int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        int i50 = i40 & 53;
                        int i51 = i50 + ((i40 ^ 53) | i50);
                        b = i51 % 128;
                        int i52 = i51 % 2;
                    } else {
                        z = false;
                    }
                } else if (((byte) (b2 & i34)) == ((byte) (bArr2[i23] & i34))) {
                    int i410 = (i40 & (-46)) | ((~i40) & 45);
                    int i411 = -(-((i40 & 45) << 1));
                    int i412 = (i410 ^ i411) + ((i410 & i411) << 1);
                    b = i412 % 128;
                    int i413 = i412 % 2;
                    int i53 = i40 & 53;
                    int i54 = i53 + ((i40 ^ 53) | i53);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                } else {
                    z = false;
                }
                int i56 = b + 1;
                a = i56 % 128;
                if (i56 % 2 != 0) {
                    return z;
                }
                obj.hashCode();
                throw null;
            }
            int i57 = a + 115;
            int i58 = i57 % 128;
            b = i58;
            if (i57 % 2 != 0) {
                byte b5 = bArr[i32];
                byte b6 = bArr2[i32];
                obj.hashCode();
                throw null;
            }
            if (bArr[i32] != bArr2[i32]) {
                int i59 = i58 & 17;
                int i60 = ((i58 ^ 17) | i59) << 1;
                int i61 = -((~i59) & (i58 | 17));
                int i62 = (i60 & i61) + (i60 | i61);
                a = i62 % 128;
                int i63 = i62 % 2;
                int i64 = i58 & 27;
                int i65 = (~i64) & (i58 | 27);
                int i66 = i64 << 1;
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                a = i67 % 128;
                int i68 = i67 % 2;
                return false;
            }
            i32 = ((((i32 ^ 1) | (i32 & 1)) << 1) - (~(-(((~i32) & 1) | (i32 & (-2)))))) - 1;
            int i69 = i58 & 91;
            int i70 = (~i69) & (i58 | 91);
            int i71 = -(-(i69 << 1));
            int i72 = (i70 & i71) + (i71 | i70);
            a = i72 % 128;
            int i73 = i72 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r4 = r2[r3];
        r6 = r10.e;
        r7 = (r1 & 67) + (r1 | 67);
        r1 = r7 % 128;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r1;
        r8 = 0;
        r6 = 255 << r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r7 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r4 = (byte) ((r4 | r6) & (~(r4 & r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r4 = (byte) (r4 & r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r6 = r1 ^ 15;
        r1 = (((r1 & 15) | r6) << 1) - r6;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if ((r1 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r1 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r3 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b + 113;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if ((r6 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r1 = r1 >>> 14012;
        r6 = r2[0];
        r1 = (r1 | r6) & (~(r1 & r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        r1 = r1 * 257;
        r6 = r2[r3];
        r7 = (~r6) & r1;
        r1 = (~r1) & r6;
        r1 = (r1 & r7) | (r7 ^ r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r1 = (r8 * 257) ^ r4;
        r2 = r10.e;
        r3 = r1 & r2;
        r1 = ((r1 ^ r2) | r3) & (~r3);
        r2 = ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a;
        r3 = (r2 ^ 7) + ((r2 & 7) << 1);
        ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r3 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r3 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = ((r1 | 83) << 1) - (r1 ^ 83);
        ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r2 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.p063ci.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a
            r2 = r1 & 51
            r3 = r1 ^ 51
            r3 = r3 | r2
            int r3 = -r3
            int r3 = -r3
            r4 = r2 | r3
            r5 = 1
            int r4 = r4 << r5
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L20
            byte[] r2 = r10.d
            int r3 = r2.length
            int r3 = r3 >> r5
            if (r3 >= 0) goto L3c
            goto L29
        L20:
            byte[] r2 = r10.d
            int r3 = r2.length
            r3 = r3 ^ (-1)
            int r3 = (-2) - r3
            if (r3 >= 0) goto L3c
        L29:
            r2 = r1 | 83
            int r2 = r2 << r5
            r1 = r1 ^ 83
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L37
            return r5
        L37:
            r0 = 0
            r0.hashCode()
            throw r0
        L3c:
            r4 = r2[r3]
            int r6 = r10.e
            r7 = r1 & 67
            r1 = r1 | 67
            int r7 = r7 + r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r1
            int r7 = r7 % r0
            r8 = 0
            r9 = 255(0xff, float:3.57E-43)
            int r6 = r9 << r6
            if (r7 == 0) goto L5c
            r7 = r4 & r6
            int r7 = ~r7
            r4 = r4 | r6
            r4 = r4 & r7
            byte r4 = (byte) r4
            if (r2 == 0) goto L5a
            goto L60
        L5a:
            r8 = r5
            goto L9a
        L5c:
            r4 = r4 & r6
            byte r4 = (byte) r4
            if (r2 == 0) goto L9a
        L60:
            r6 = r1 ^ 15
            r1 = r1 & 15
            r1 = r1 | r6
            int r1 = r1 << r5
            int r1 = r1 - r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a = r6
            int r1 = r1 % r0
            if (r1 != 0) goto L70
            r1 = r3
            goto L72
        L70:
            int r1 = r3 + 1
        L72:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L99
            int r6 = ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b
            int r6 = r6 + 113
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L8c
            r6 = 14012(0x36bc, float:1.9635E-41)
            int r1 = r1 >>> r6
            r6 = r2[r8]
            r7 = r1 & r6
            int r7 = ~r7
            r1 = r1 | r6
            r1 = r1 & r7
            goto L72
        L8c:
            int r1 = r1 * 257
            r6 = r2[r3]
            int r7 = ~r6
            r7 = r7 & r1
            int r1 = ~r1
            r1 = r1 & r6
            r6 = r7 ^ r1
            r1 = r1 & r7
            r1 = r1 | r6
            goto L72
        L99:
            r8 = r1
        L9a:
            int r8 = r8 * 257
            r1 = r8 ^ r4
            int r2 = r10.e
            r3 = r1 & r2
            int r4 = ~r3
            r1 = r1 ^ r2
            r1 = r1 | r3
            r1 = r1 & r4
            int r2 = ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.a
            r3 = r2 ^ 7
            r2 = r2 & 7
            int r2 = r2 << r5
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.b = r2
            int r3 = r3 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.AbstractC0272r.hashCode():int");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        G g = new G(this.d, this.e);
        int i2 = a;
        int i3 = (i2 & 51) + (i2 | 51);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return g;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        K k = new K(this.d, this.e);
        int i2 = a;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        b = i3 % 128;
        int i4 = i3 % 2;
        return k;
    }

    public byte[] o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = (i2 & 87) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int length = this.d.length;
            throw null;
        }
        byte[] bArr = this.d;
        if (bArr.length == 0) {
            int i6 = i2 + 42;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 84 / 0;
            }
            return bArr;
        }
        byte[] bArrC = j.c(bArr);
        int length2 = this.d.length;
        int i9 = a;
        int i10 = (i9 ^ 87) + ((i9 & 87) << 1);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = ((length2 << 1) - length2) - 1;
        byte b2 = bArrC[i13];
        int i14 = this.e;
        int i15 = i11 | 59;
        int i16 = ((i15 << 1) - (~(-(i15 & (~(i11 & 59)))))) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        bArrC[i13] = (byte) (b2 & (255 << i14));
        int i18 = i11 ^ 17;
        int i19 = (((i11 & 17) | i18) << 1) - i18;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 40 / 0;
        }
        return bArrC;
    }

    public byte[] p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = ((((i2 ^ 1) | i3) << 1) - (~(-((~i3) & (i2 | 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.e != 0) {
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        }
        int i6 = i2 & 17;
        int i7 = ((((i2 ^ 17) | i6) << 1) - (~(-((i2 | 17) & (~i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        byte[] bArrC = j.c(this.d);
        int i9 = a;
        int i10 = ((i9 | 2) << 1) - (i9 ^ 2);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return bArrC;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            int i2 = b;
            int i3 = (i2 & (-84)) | ((~i2) & 83);
            int i4 = -(-((i2 & 83) << 1));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = ((i2 | 89) << 1) - (i2 ^ 89);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 != encoded.length) {
                int i10 = b;
                int i11 = (((i10 | 25) << 1) - (~(-((i10 & (-26)) | ((~i10) & 25))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr = c;
                byte b2 = encoded[i9];
                int i13 = i10 + 37;
                a = i13 % 128;
                int i14 = i13 % 2;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                int i15 = b;
                int i16 = ((i15 ^ 82) + ((i15 & 82) << 1)) - 1;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    stringBuffer.append(cArr[encoded[i9] ^ 69]);
                    int i17 = (-2) - ((i9 + 18) ^ (-1));
                    int i18 = (i17 & (-2)) | ((~i17) & 1);
                    int i19 = (i17 & 1) << 1;
                    i9 = (i18 ^ i19) + ((i19 & i18) << 1);
                } else {
                    stringBuffer.append(cArr[encoded[i9] & 15]);
                    int i20 = (i9 & 41) + (i9 | 41);
                    i9 = (i20 ^ (-40)) + ((i20 & (-40)) << 1);
                }
                int i21 = a + 101;
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            String string = stringBuffer.toString();
            int i23 = a;
            int i24 = ((i23 ^ 107) | (i23 & 107)) << 1;
            int i25 = -(((~i23) & 107) | (i23 & (-108)));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 34 / 0;
            }
            return string;
        } catch (IOException e) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Internal error encoding BitString: ");
            sbW.append(e.getMessage());
            throw new C0267m(sbW.toString(), e);
        }
    }
}
