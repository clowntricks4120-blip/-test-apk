package ivas.gov.bisp.enumeration.p064cj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 1;
    private static int b;

    public static class bEM<T> implements Iterator<T> {
        private static int a = 0;
        private static int b = 1;
        public final T[] c;
        public int d = 0;

        public bEM(T[] tArr) {
            this.c = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 15;
            int i4 = (i2 | 15) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (this.d < this.c.length) {
                int i9 = (i7 | 109) << 1;
                int i10 = -(((~i7) & 109) | (i7 & (-110)));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                int i12 = i11 % 128;
                a = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 95;
                b = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                int i16 = i7 & 41;
                int i17 = -(-((i7 ^ 41) | i16));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                z = false;
            }
            int i20 = b;
            int i21 = (-2) - ((((i20 | 84) << 1) - (i20 ^ 84)) ^ (-1));
            a = i21 % 128;
            int i22 = i21 % 2;
            return z;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 5) - (~(-(-((i2 & 5) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.d;
            T[] tArr = this.c;
            if (i5 == tArr.length) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Out of elements: ");
                sbW.append(this.d);
                throw new NoSuchElementException(sbW.toString());
            }
            int i6 = (-2) - ((i2 + 110) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 & 1;
            this.d = ((((i5 ^ 1) | i8) << 1) - (~(-((~i8) & (i5 | 1))))) - 1;
            T t = tArr[i5];
            int i9 = (((i2 | 20) << 1) - (i2 ^ 20)) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 64 / 0;
            }
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static int b(short[][][] sArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 99;
        int i4 = ((i2 & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = 0;
        int i9 = i6 % 2 == 0 ? 1 : 0;
        int i10 = (i7 & 83) + (i7 | 83);
        b = i10 % 128;
        int i11 = i10 % 2;
        while (i8 != sArr.length) {
            int i12 = b;
            int i13 = (i12 ^ 99) + ((i12 & 99) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i9 * 257;
            int iJ = j(sArr[i8]);
            int i16 = a + 51;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = -iJ;
                int i18 = i15 & i17;
                i8 += 7;
                i9 = (i18 - (~((i17 ^ i15) | i18))) - 1;
            } else {
                int i19 = ((i15 ^ iJ) | (i15 & iJ)) << 1;
                int i20 = -((iJ & (~i15)) | ((~iJ) & i15));
                i9 = (i19 & i20) + (i20 | i19);
                i8++;
            }
        }
        int i21 = b;
        int i22 = i21 & 99;
        int i23 = (i21 ^ 99) | i22;
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        int i25 = i24 % 2;
        return i9;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2;
        int i = 2 % 2;
        int i2 = a + 15;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (bArr == null) {
            int i5 = i3 | 119;
            int i6 = ((i5 << 1) - (~(-(i5 & (~(i3 & 119)))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 4;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
            int i11 = a;
            int i12 = i11 & 91;
            int i13 = -(-((i11 ^ 91) | i12));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 ^ 11;
        int i18 = (i16 & 11) << 1;
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        return bArr2;
    }

    public static short[] d(short[] sArr) {
        short[] sArr2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = ((~i3) & (i2 | 83)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (sArr == null) {
            int i6 = ((i2 ^ 106) + ((i2 & 106) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            sArr2 = null;
        } else {
            sArr2 = (short[]) sArr.clone();
            int i7 = a;
            int i8 = (-2) - (((i7 & 20) + (i7 | 20)) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 5;
            }
        }
        int i10 = b + 11;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return sArr2;
        }
        throw null;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 104) + ((i2 & 104) << 1)) ^ (-1));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (bArr2 == null) {
            int i6 = i4 + 35;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                c(bArr);
                throw null;
            }
            byte[] bArrC = c(bArr);
            int i7 = a;
            int i8 = ((i7 ^ 89) | (i7 & 89)) << 1;
            int i9 = -(((~i7) & 89) | (i7 & (-90)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return bArrC;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        int i12 = length & length2;
        int i13 = (length ^ length2) | i12;
        byte[] bArr3 = new byte[(i12 & i13) + (i13 | i12)];
        int length3 = bArr.length;
        int i14 = i2 & 61;
        int i15 = (i14 - (~(-(-((i2 ^ 61) | i14))))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        System.arraycopy(bArr, 0, bArr3, 0, length3);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        int i17 = a;
        int i18 = ((i17 | 67) << 1) - (i17 ^ 67);
        b = i18 % 128;
        int i19 = i18 % 2;
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r8 = new byte[r3];
        r1 = java.lang.Math.min(r6.length << r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r8 = new byte[r3];
        r1 = r6.length;
        r2 = -r7;
        r1 = java.lang.Math.min((((~r2) & r1) | ((~r1) & r2)) + ((r1 & r2) << 1), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        java.lang.System.arraycopy(r6, r7, r8, 0, r1);
        r6 = ivas.gov.bisp.enumeration.p064cj.j.b;
        r7 = r6 & 45;
        r6 = -(-((r6 ^ 45) | r7));
        r1 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p064cj.j.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        r6 = new java.lang.StringBuffer(r7);
        r6.append(" > ");
        r6.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        throw new java.lang.IllegalArgumentException(r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r3 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r3 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r8 = (r2 & (-28)) | ((~r2) & 27);
        r1 = -(-((r2 & 27) << 1));
        r2 = (r8 ^ r1) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.p064cj.j.b = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] f(byte[] r6, int r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p064cj.j.b
            int r1 = r1 + 9
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1e
            r1 = r8 | r7
            int r3 = r1 << 1
            r4 = r8 & r7
            int r4 = ~r4
            r1 = r1 & r4
            int r1 = -r1
            int r1 = ~r1
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            if (r3 < 0) goto L74
            goto L28
        L1e:
            int r1 = -r7
            int r1 = ~r1
            int r1 = -r1
            int r1 = ~r1
            int r1 = r8 - r1
            int r3 = r1 + (-2)
            if (r3 < 0) goto L74
        L28:
            r8 = r2 & (-28)
            int r1 = ~r2
            r1 = r1 & 27
            r8 = r8 | r1
            r1 = r2 & 27
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            r2 = r8 ^ r1
            r8 = r8 & r1
            int r8 = r8 << 1
            int r2 = r2 + r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.p064cj.j.b = r8
            int r2 = r2 % r0
            if (r2 == 0) goto L4a
            byte[] r8 = new byte[r3]
            int r1 = r6.length
            int r1 = r1 << r7
            int r1 = java.lang.Math.min(r1, r3)
            goto L5b
        L4a:
            byte[] r8 = new byte[r3]
            int r1 = r6.length
            int r2 = -r7
            int r4 = ~r2
            r4 = r4 & r1
            int r5 = ~r1
            r5 = r5 & r2
            r4 = r4 | r5
            r1 = r1 & r2
            int r1 = r1 << 1
            int r4 = r4 + r1
            int r1 = java.lang.Math.min(r4, r3)
        L5b:
            r2 = 0
            java.lang.System.arraycopy(r6, r7, r8, r2, r1)
            int r6 = ivas.gov.bisp.enumeration.p064cj.j.b
            r7 = r6 & 45
            r6 = r6 ^ 45
            r6 = r6 | r7
            int r6 = -r6
            int r6 = -r6
            r1 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << 1
            int r1 = r1 + r6
            int r6 = r1 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r6
            int r1 = r1 % r0
            return r8
        L74:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>(r7)
            java.lang.String r7 = " > "
            r6.append(r7)
            r6.append(r8)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p064cj.j.f(byte[], int, int):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r8 = r1 & 31;
        r1 = (((r1 | 31) & (~r8)) - (~(r8 << 1))) - 1;
        ivas.gov.bisp.enumeration.p064cj.j.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r1 = r8.length;
        r3 = (r1 | 1) << 1;
        r5 = -((r1 & (-2)) | ((~r1) & 1));
        r7 = (r3 & r5) + (r3 | r5);
        r3 = (r2 & 44) + (r2 | 44);
        r2 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.p064cj.j.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r1 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p064cj.j.b + 114;
        r3 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p064cj.j.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if ((r3 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r2 = r8[r1] & (r7 / 20929);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r7 = r7 * 257;
        r2 = r8[r1];
        r3 = (~r2) & r7;
        r2 = r2 & (~r7);
        r2 = (r2 & r3) | (r3 ^ r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p064cj.j.b;
        r1 = ((r8 ^ 21) | (r8 & 21)) << 1;
        r8 = -(((~r8) & 21) | (r8 & (-22)));
        r2 = ((r1 | r8) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.p064cj.j.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if ((r2 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r8 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r8 = r1 & 83;
        r2 = (~r8) & (r1 | 83);
        r8 = r8 << 1;
        r5 = (r2 ^ r8) + ((r8 & r2) << 1);
        ivas.gov.bisp.enumeration.p064cj.j.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if ((r5 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(int[] r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p064cj.j.b
            r2 = r1 ^ 5
            r3 = r1 & 5
            r4 = 1
            int r3 = r3 << r4
            int r3 = -r3
            int r3 = -r3
            r5 = r2 | r3
            int r5 = r5 << r4
            r2 = r2 ^ r3
            int r5 = r5 - r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r2
            int r5 = r5 % r0
            r3 = 0
            r6 = 0
            if (r5 != 0) goto L21
            r5 = 46
            int r5 = r5 / r3
            if (r8 != 0) goto L4a
            goto L23
        L21:
            if (r8 != 0) goto L4a
        L23:
            r8 = r1 & 83
            int r2 = ~r8
            r5 = r1 | 83
            r2 = r2 & r5
            int r8 = r8 << r4
            r5 = r2 ^ r8
            r8 = r8 & r2
            int r8 = r8 << r4
            int r5 = r5 + r8
            int r8 = r5 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r8
            int r5 = r5 % r0
            if (r5 != 0) goto L37
            r3 = r4
        L37:
            r8 = r1 & 31
            int r2 = ~r8
            r1 = r1 | 31
            r1 = r1 & r2
            int r8 = r8 << r4
            int r8 = ~r8
            int r1 = r1 - r8
            int r1 = r1 - r4
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r8
            int r1 = r1 % r0
            if (r1 == 0) goto L49
            return r3
        L49:
            throw r6
        L4a:
            int r1 = r8.length
            r3 = r1 | 1
            int r3 = r3 << r4
            r5 = r1 & (-2)
            int r7 = ~r1
            r7 = r7 & r4
            r5 = r5 | r7
            int r5 = -r5
            r7 = r3 & r5
            r3 = r3 | r5
            int r7 = r7 + r3
            r3 = r2 & 44
            r2 = r2 | 44
            int r3 = r3 + r2
            r2 = r3 ^ (-1)
            int r3 = r3 << r4
            int r2 = r2 + r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p064cj.j.b = r3
            int r2 = r2 % r0
        L66:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L8e
            int r2 = ivas.gov.bisp.enumeration.p064cj.j.b
            int r2 = r2 + 114
            r3 = r2 ^ (-1)
            int r2 = r2 << r4
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r2
            int r3 = r3 % 2
            if (r3 != 0) goto L81
            int r7 = r7 / 20929
            r2 = r8[r1]
            r2 = r2 & r7
        L7f:
            r7 = r2
            goto L66
        L81:
            int r7 = r7 * 257
            r2 = r8[r1]
            int r3 = ~r2
            r3 = r3 & r7
            int r5 = ~r7
            r2 = r2 & r5
            r5 = r3 ^ r2
            r2 = r2 & r3
            r2 = r2 | r5
            goto L7f
        L8e:
            int r8 = ivas.gov.bisp.enumeration.p064cj.j.b
            r1 = r8 ^ 21
            r2 = r8 & 21
            r1 = r1 | r2
            int r1 = r1 << r4
            r2 = r8 & (-22)
            int r8 = ~r8
            r8 = r8 & 21
            r8 = r8 | r2
            int r8 = -r8
            r2 = r1 | r8
            int r2 = r2 << r4
            r8 = r8 ^ r1
            int r2 = r2 - r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.p064cj.j.a = r8
            int r2 = r2 % r0
            if (r2 == 0) goto Laa
            return r7
        Laa:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p064cj.j.g(int[]):int");
    }

    public static int h(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 63;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 63)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bArr == null) {
            int i8 = i7 + 25;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 13 / 0;
            }
            return 0;
        }
        int length = bArr.length;
        int i10 = (((length ^ 1) | (length & 1)) << 1) - ((length & (-2)) | ((~length) & 1));
        int i11 = (((i7 & (-110)) | ((~i7) & 109)) - (~((i7 & 109) << 1))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        while (true) {
            int i13 = ((length | (-69)) << 1) - (length ^ (-69));
            length = (i13 & 68) + (i13 | 68);
            if (length < 0) {
                int i14 = a;
                int i15 = ((i14 | 33) << 1) - (i14 ^ 33);
                b = i15 % 128;
                int i16 = i15 % 2;
                return i10;
            }
            int i17 = a;
            int i18 = i17 & 95;
            int i19 = (~i18) & (i17 | 95);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i10 * 257;
            byte b2 = bArr[length];
            i10 = ((~i23) & b2) | ((~b2) & i23);
            int i24 = i17 + 53;
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    public static int i(short[] sArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (i3 | 109) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (sArr == null) {
            int i10 = (i8 & 121) + (i8 | 121);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 13;
            a = i13 % 128;
            int i14 = i13 % 2;
            return 0;
        }
        int length = sArr.length;
        int i15 = length & 1;
        int i16 = -(-((length ^ 1) | i15));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        int i18 = i8 & 31;
        int i19 = (i8 | 31) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i19 | i20);
        b = i21 % 128;
        int i22 = i21 % 2;
        while (true) {
            length = (((~length) | length) << 1) - (~length);
            if (length < 0) {
                int i23 = a + 49;
                b = i23 % 128;
                int i24 = i23 % 2;
                return i17;
            }
            int i25 = a;
            int i26 = ((i25 & (-100)) | ((~i25) & 99)) + ((i25 & 99) << 1);
            int i27 = i26 % 128;
            b = i27;
            int i28 = i26 % 2;
            int i29 = i17 * 257;
            short s = sArr[length];
            int i30 = i27 & 109;
            int i31 = (i27 ^ 109) | i30;
            int i32 = (i30 & i31) + (i30 | i31);
            a = i32 % 128;
            if (i32 % 2 == 0) {
                i = ((s & 255) | (s ^ 255)) & i29;
            } else {
                int i33 = s & 255;
                i = (i33 | i29) & (~(i29 & i33));
            }
            i17 = i;
            int i34 = i27 & 19;
            int i35 = -(-(i27 | 19));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            a = i36 % 128;
            int i37 = i36 % 2;
        }
    }

    public static int j(short[][] sArr) {
        int i = 2 % 2;
        int i2 = b + 27;
        a = i2 % 128;
        int i3 = 0;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        while (i4 != sArr.length) {
            int i5 = b;
            int i6 = (i5 & 16) + (i5 | 16);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            i3 = ((i3 * 257) - (~(-(~(-(-i(sArr[i4]))))))) - 2;
            i4 = ((i4 & 1) << 1) + (i4 ^ 1);
            int i9 = a;
            int i10 = ((i9 & 112) + (i9 | 112)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = (i12 | 33) << 1;
        int i14 = -(((~i12) & 33) | (i12 & (-34)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        return i3;
    }
}
