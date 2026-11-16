package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.p100w.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements M {
    private static int a = 1;
    private static int b;
    public static final int[] c = h(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    public int[] d;
    public final int e;

    public u(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.d = h(bArr);
        this.e = i;
        int i2 = a;
        int i3 = (i2 & (-98)) | ((~i2) & 97);
        int i4 = -(-((i2 & 97) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static int d(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 63;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            int i7 = -(-i2);
            int i8 = i ^ i7;
            int i9 = -(-((i7 & i) << 1));
            i3 = (i * i2) | ((i8 & i9) + (i9 | i8));
        } else {
            int i10 = i >>> (-i2);
            int i11 = i << i2;
            i3 = (i11 & i10) | (i10 ^ i11);
        }
        int i12 = (i6 & 103) + (i6 | 103);
        b = i12 % 128;
        int i13 = i12 % 2;
        return i3;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.M
    public byte[] e(byte[] bArr) throws GeneralSecurityException, CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrN = n(ByteBuffer.wrap(bArr));
        int i5 = a;
        int i6 = i5 & 105;
        int i7 = i5 | 105;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return bArrN;
    }

    public abstract int[] l(int[] iArr, int i);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        throw new java.lang.IllegalArgumentException("Given ByteBuffer output is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if ((r7.remaining() % o()) >= r8.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (((r3 ^ (-1)) + (r3 << 1)) >= r8.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p053bz.u.a;
        r2 = (r1 & (-74)) | ((~r1) & 73);
        r1 = -(-((r1 & 73) << 1));
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p053bz.u.b = r3 % 128;
        r3 = r3 % 2;
        r1 = ivas.gov.bisp.enumeration.p053bz.Q.b(o());
        r7.put(r1);
        r2 = ivas.gov.bisp.enumeration.p053bz.u.a;
        r3 = ((r2 ^ 57) | (r2 & 57)) << 1;
        r2 = -(((~r2) & 57) | (r2 & (-58)));
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p053bz.u.b = r4 % 128;
        r4 = r4 % 2;
        p(r1, r7, java.nio.ByteBuffer.wrap(r8));
        r7 = (-2) - ((ivas.gov.bisp.enumeration.p053bz.u.b + 64) ^ (-1));
        ivas.gov.bisp.enumeration.p053bz.u.a = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(java.nio.ByteBuffer r7, byte[] r8) throws java.lang.CloneNotSupportedException {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p053bz.u.a
            r2 = r1 ^ 81
            r1 = r1 & 81
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 + (-1)
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p053bz.u.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            int r1 = r7.remaining()
            int r2 = r6.o()
            int r1 = r1 % r2
            int r2 = r8.length
            if (r1 < r2) goto L91
            goto L3e
        L25:
            int r1 = r7.remaining()
            int r2 = r6.o()
            int r2 = -r2
            int r2 = ~r2
            int r2 = -r2
            r3 = r1 | r2
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            r1 = r3 ^ (-1)
            int r2 = r3 << 1
            int r1 = r1 + r2
            int r2 = r8.length
            if (r1 < r2) goto L91
        L3e:
            int r1 = ivas.gov.bisp.enumeration.p053bz.u.a
            r2 = r1 & (-74)
            int r3 = ~r1
            r3 = r3 & 73
            r2 = r2 | r3
            r1 = r1 & 73
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p053bz.u.b = r1
            int r3 = r3 % r0
            int r1 = r6.o()
            byte[] r1 = ivas.gov.bisp.enumeration.p053bz.Q.b(r1)
            r7.put(r1)
            int r2 = ivas.gov.bisp.enumeration.p053bz.u.a
            r3 = r2 ^ 57
            r4 = r2 & 57
            r3 = r3 | r4
            int r3 = r3 << 1
            r4 = r2 & (-58)
            int r2 = ~r2
            r5 = 57
            r2 = r2 & r5
            r2 = r2 | r4
            int r2 = -r2
            r4 = r3 | r2
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p053bz.u.b = r2
            int r4 = r4 % r0
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            r6.p(r1, r7, r8)
            int r7 = ivas.gov.bisp.enumeration.p053bz.u.b
            int r7 = r7 + 64
            r7 = r7 ^ (-1)
            int r7 = (-2) - r7
            int r8 = r7 % 128
            ivas.gov.bisp.enumeration.p053bz.u.a = r8
            int r7 = r7 % r0
            return
        L91:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Given ByteBuffer output is too small"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p053bz.u.m(java.nio.ByteBuffer, byte[]):void");
    }

    public abstract int o();

    static {
        int i = b + 99;
        a = i % 128;
        int i2 = i % 2;
    }

    public static void c(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 ^ 62) + ((i6 & 62) << 1)) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = iArr[i];
            int i9 = -iArr[i2];
            int i10 = i8 & i9;
            int i11 = i8 | i9;
            iArr[i] = (i10 & i11) + (i11 | i10);
        } else {
            int i12 = iArr[i];
            int i13 = iArr[i2];
            int i14 = ((~i13) & i12) | ((~i12) & i13);
            int i15 = (i12 & i13) << 1;
            iArr[i] = ((i14 | i15) << 1) - (i15 ^ i14);
        }
        int i16 = iArr[i4];
        int i17 = iArr[i];
        int iD = d(((~i16) & i17) | ((~i17) & i16), 16);
        iArr[i4] = iD;
        int i18 = b;
        int i19 = (((i18 | 95) << 1) - (~(-((i18 & (-96)) | ((~i18) & 95))))) - 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = (iArr[i3] - (~(-(~(-(-iD)))))) - 2;
        iArr[i3] = i21;
        int i22 = i18 & 25;
        int i23 = (i22 - (~((i18 ^ 25) | i22))) - 1;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            iArr[i2] = d(iArr[i2] ^ i21, 115);
        } else {
            int i24 = iArr[i2];
            int i25 = (~i21) & i24;
            int i26 = (~i24) & i21;
            iArr[i2] = d((i26 & i25) | (i25 ^ i26), 12);
        }
        int i27 = b;
        int i28 = (i27 & 111) + (i27 | 111);
        int i29 = i28 % 128;
        a = i29;
        int i30 = i28 % 2;
        int i31 = iArr[i];
        int i32 = -(-iArr[i2]);
        int i33 = i31 & i32;
        int i34 = (i31 | i32) & (~i33);
        int i35 = -(-(i33 << 1));
        int i36 = (i34 & i35) + (i34 | i35);
        iArr[i] = i36;
        int i37 = iArr[i4];
        int i38 = i29 + 121;
        b = i38 % 128;
        if (i38 % 2 != 0) {
            int i39 = (~i37) & i36;
            int i40 = i37 & (~i36);
            iArr[i4] = d((i40 & i39) | (i39 ^ i40), 10);
        } else {
            int i41 = i36 & i37;
            iArr[i4] = d(((i37 ^ i36) | i41) & (~i41), 8);
        }
        int i42 = iArr[i3];
        int i43 = iArr[i4];
        int i44 = (((~i43) & i42) | ((~i42) & i43)) + ((i42 & i43) << 1);
        iArr[i3] = i44;
        int i45 = b;
        int i46 = i45 & 13;
        int i47 = i45 | 13;
        int i48 = (i46 & i47) + (i47 | i46);
        a = i48 % 128;
        int i49 = i48 % 2;
        int i50 = iArr[i2];
        iArr[i2] = d(((~i50) & i44) | ((~i44) & i50), 7);
        int i51 = b;
        int i52 = (i51 ^ 93) + ((i51 & 93) << 1);
        a = i52 % 128;
        if (i52 % 2 == 0) {
            throw null;
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        int[] iArr3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (i2 ^ 7) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            iArr3 = c;
            System.arraycopy(iArr3, 0, iArr, 1, iArr3.length);
        } else {
            iArr3 = c;
            System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        }
        int i6 = b;
        int i7 = ((i6 ^ 81) | (i6 & 81)) << 1;
        int i8 = -(((~i6) & 81) | (i6 & (-82)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            System.arraycopy(iArr2, 1, iArr, iArr3.length, 118);
        } else {
            System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
        }
    }

    public static int[] h(byte[] bArr) {
        int[] iArr;
        int i = 2 % 2;
        int i2 = b + 117;
        a = i2 % 128;
        int i3 = i2 % 2;
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int i4 = b;
        int i5 = ((i4 & 96) + (i4 | 96)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            iArr = new int[intBufferAsIntBuffer.remaining()];
            intBufferAsIntBuffer.get(iArr);
            int i6 = 18 / 0;
        } else {
            iArr = new int[intBufferAsIntBuffer.remaining()];
            intBufferAsIntBuffer.get(iArr);
        }
        int i7 = b + 17;
        a = i7 % 128;
        int i8 = i7 % 2;
        return iArr;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.M
    public byte[] b(byte[] bArr) throws GeneralSecurityException, CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 4) << 1) - (i2 ^ 4)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        int length = bArr.length;
        int i5 = -o();
        int i6 = i5 ^ Integer.MAX_VALUE;
        int i7 = (i5 & Integer.MAX_VALUE) << 1;
        if (length > (i6 & i7) + (i7 | i6)) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i8 = b;
        int i9 = i8 ^ 7;
        int i10 = (i8 & 7) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int iO = o();
        int i13 = -(-bArr.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iO & i13) + (iO | i13));
        int i14 = a;
        int i15 = (i14 & 113) + (i14 | 113);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            m(byteBufferAllocate, bArr);
            byteBufferAllocate.array();
            throw null;
        }
        m(byteBufferAllocate, bArr);
        byte[] bArrArray = byteBufferAllocate.array();
        int i16 = a;
        int i17 = i16 & 31;
        int i18 = i17 + ((i16 ^ 31) | i17);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 43 / 0;
        }
        return bArrArray;
    }

    public ByteBuffer k(byte[] bArr, int i) throws CloneNotSupportedException {
        int[] iArr;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 95;
        a = i5 % 128;
        int i6 = i5 % 2;
        int[] iArrL = l(h(bArr), i);
        Object objClone = iArrL.clone();
        int i7 = a;
        int i8 = i7 & 125;
        int i9 = -(-((i7 ^ 125) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            iArr = (int[]) objClone;
            g(iArr);
            i2 = 1;
        } else {
            iArr = (int[]) objClone;
            g(iArr);
            i2 = 0;
        }
        int i11 = b + 115;
        a = i11 % 128;
        int i12 = i11 % 2;
        while (i2 < iArrL.length) {
            int i13 = a + 83;
            int i14 = i13 % 128;
            b = i14;
            if (i13 % 2 != 0) {
                iArrL[i2] = iArrL[i2] >> iArr[i2];
                int i15 = i2 & 25;
                int i16 = (i2 ^ 25) | i15;
                i3 = ((i15 | i16) << 1) - (i16 ^ i15);
            } else {
                int i17 = iArrL[i2];
                int i18 = -(-iArr[i2]);
                int i19 = ((~i18) & i17) | ((~i17) & i18);
                int i20 = -(-((i17 & i18) << 1));
                iArrL[i2] = (i19 & i20) + (i20 | i19);
                int i21 = i2 & 8;
                int i22 = (i2 | 8) & (~i21);
                int i23 = -(-(i21 << 1));
                i3 = ((i22 ^ i23) + ((i22 & i23) << 1)) - 7;
            }
            i2 = i3;
            int i24 = ((i14 | 65) << 1) - (i14 ^ 65);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        int i26 = a;
        int i27 = i26 & 73;
        int i28 = -(-((i26 ^ 73) | i27));
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        b = i29 % 128;
        int i30 = i29 % 2;
        byteBufferOrder.asIntBuffer().put(iArrL, 0, 16);
        int i31 = b;
        int i32 = i31 & 119;
        int i33 = (i31 ^ 119) | i32;
        int i34 = (i32 & i33) + (i33 | i32);
        int i35 = i34 % 128;
        a = i35;
        if (i34 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i36 = i35 + 39;
        b = i36 % 128;
        int i37 = i36 % 2;
        return byteBufferOrder;
    }

    public final void p(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws CloneNotSupportedException {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 85;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iRemaining = byteBuffer2.remaining();
        int i6 = iRemaining / 64;
        int i7 = ((i6 | 1) << 1) - (i6 ^ 1);
        int i8 = b;
        int i9 = ((i8 ^ 48) + ((i8 & 48) << 1)) - 1;
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = (i10 & 61) + (i10 | 61);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (i14 < i7) {
            int i15 = a;
            int i16 = i15 & 111;
            int i17 = i16 + ((i15 ^ 111) | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = this.e;
            if (i18 != 0) {
                i = i19 % i14;
            } else {
                int i20 = i19 & i14;
                i = ((i19 | i14) & (~i20)) + (i20 << 1);
            }
            ByteBuffer byteBufferK = k(bArr, i);
            if (i14 == (i7 ^ (-1)) + (i7 << 1)) {
                int i21 = b;
                int i22 = i21 & 105;
                int i23 = (i22 - (~((i21 ^ 105) | i22))) - 1;
                a = i23 % 128;
                r.ai(byteBuffer, byteBuffer2, byteBufferK, i23 % 2 == 0 ? iRemaining % 111 : iRemaining % 64);
                int i24 = b;
                int i25 = i24 & 121;
                i2 = ((i24 | 121) & (~i25)) + (i25 << 1);
                a = i2 % 128;
            } else {
                r.ai(byteBuffer, byteBuffer2, byteBufferK, 64);
                i2 = (-2) - ((a + 124) ^ (-1));
                b = i2 % 128;
            }
            int i26 = i2 % 2;
            int i27 = i14 - 63;
            i14 = ((i27 | 64) << 1) - (i27 ^ 64);
            int i28 = b;
            int i29 = i28 & 119;
            int i30 = (i29 - (~(-(-((i28 ^ 119) | i29))))) - 1;
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = a;
        int i33 = i32 & 1;
        int i34 = i33 + ((i32 ^ 1) | i33);
        b = i34 % 128;
        if (i34 % 2 != 0) {
            throw null;
        }
    }

    public static void g(int[] iArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 111) | (i2 & 111)) << 1) - (~(-(((~i2) & 111) | (i2 & (-112)))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2 != 0 ? 1 : 0;
        int i6 = ((((i4 ^ 119) | (i4 & 119)) << 1) - (~(-(((~i4) & 119) | (i4 & (-120)))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        while (i5 < 10) {
            int i8 = a;
            int i9 = i8 & 77;
            int i10 = ((i8 | 77) & (~i9)) + (i9 << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                c(iArr, 0, 5, 92, 14);
            } else {
                c(iArr, 0, 4, 8, 12);
            }
            c(iArr, 1, 5, 9, 13);
            int i11 = a;
            int i12 = (((i11 ^ 43) | (i11 & 43)) << 1) - (((~i11) & 43) | (i11 & (-44)));
            b = i12 % 128;
            int i13 = i12 % 2;
            c(iArr, 2, 6, 10, 14);
            int i14 = a;
            int i15 = i14 ^ 93;
            int i16 = (i14 & 93) << 1;
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            c(iArr, 3, 7, 11, 15);
            int i19 = b;
            int i20 = ((i19 & 70) + (i19 | 70)) - 1;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                c(iArr, 0, 5, 10, 15);
                c(iArr, 1, 72, 29, 43);
            } else {
                c(iArr, 0, 5, 10, 15);
                c(iArr, 1, 6, 11, 12);
            }
            int i21 = a;
            int i22 = (i21 & 69) + (i21 | 69);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                c(iArr, 4, 33, 81, 28);
            } else {
                c(iArr, 2, 7, 8, 13);
            }
            c(iArr, 3, 4, 9, 14);
            i5++;
            int i23 = b;
            int i24 = (i23 & (-124)) | ((~i23) & 123);
            int i25 = (i23 & 123) << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = a;
        int i29 = ((i28 & (-78)) | ((~i28) & 77)) + ((i28 & 77) << 1);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            int i30 = 34 / 0;
        }
    }

    public byte[] n(ByteBuffer byteBuffer) throws GeneralSecurityException, CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 10) + ((i2 & 10) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        if (byteBuffer.remaining() < o()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i5 = a;
        int i6 = i5 & 29;
        int i7 = i6 + ((i5 ^ 29) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        byte[] bArr = new byte[o()];
        byteBuffer.get(bArr);
        int iRemaining = byteBuffer.remaining();
        int i9 = b;
        int i10 = i9 & 7;
        int i11 = i10 + ((i9 ^ 7) | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        p(bArr, byteBufferAllocate, byteBuffer);
        byte[] bArrArray = byteBufferAllocate.array();
        int i13 = b;
        int i14 = i13 & 117;
        int i15 = (i13 ^ 117) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 20 / 0;
        }
        return bArrArray;
    }
}
