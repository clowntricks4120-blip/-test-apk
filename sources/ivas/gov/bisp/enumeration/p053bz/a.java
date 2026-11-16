package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.p100w.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements z {
    private static int a = 1;
    private static int b;
    public final u c;
    public final u d;

    public a(byte[] bArr) {
        u c0233t;
        u c0233t2;
        l lVar = (l) this;
        if (lVar.a != 0) {
            int i = a;
            int i2 = i & 39;
            int i3 = (i | 39) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            c0233t = new S(bArr, 1);
            int i7 = b;
            int i8 = i7 & 97;
            int i9 = (i7 ^ 97) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            c0233t = new C0233t(bArr, 1);
            int i13 = b;
            int i14 = i13 & 67;
            int i15 = (i14 - (~(-(-((i13 ^ 67) | i14))))) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
        }
        this.c = c0233t;
        if (lVar.a != 0) {
            int i17 = b;
            int i18 = ((i17 ^ 105) | (i17 & 105)) << 1;
            int i19 = -(((~i17) & 105) | (i17 & (-106)));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 2 % 2;
            }
            c0233t2 = new S(bArr, 0);
            int i22 = b + 125;
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 2 % 2;
        } else {
            c0233t2 = new C0233t(bArr, 0);
            int i25 = a;
            int i26 = i25 & 75;
            int i27 = (i26 - (~((i25 ^ 75) | i26))) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 2 % 2;
        }
        this.d = c0233t2;
        int i30 = (-2) - ((b + 122) ^ (-1));
        a = i30 % 128;
        int i31 = i30 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = ((i2 | 55) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            ByteBuffer.wrap(bArr).remaining();
            obj.hashCode();
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        u uVar = this.c;
        int i5 = b;
        int i6 = ((i5 | 69) << 1) - (i5 ^ 69);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iO = uVar.o() + 17;
        if (iRemaining < (iO ^ (-1)) + (iO << 1)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i8 = a;
        int i9 = (i8 | 89) << 1;
        int i10 = -(((~i8) & 89) | (i8 & (-90)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        int iPosition = byteBufferWrap.position();
        byte[] bArr3 = i12 != 0 ? new byte[24] : new byte[16];
        int i13 = a + 39;
        b = i13 % 128;
        byteBufferWrap.position(i13 % 2 != 0 ? byteBufferWrap.limit() >> 31 : byteBufferWrap.limit() - 16);
        byteBufferWrap.get(bArr3);
        int i14 = a + 81;
        b = i14 % 128;
        int i15 = i14 % 2;
        byteBufferWrap.position(iPosition);
        int iLimit = byteBufferWrap.limit();
        int i16 = b;
        int i17 = ((i16 | 73) << 1) - (i16 ^ 73);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            byteBufferWrap.limit(iLimit - 16);
        } else {
            int i18 = iLimit & (-16);
            byteBufferWrap.limit(((iLimit | (-16)) & (~i18)) + (i18 << 1));
        }
        int iO2 = this.c.o();
        int i19 = b;
        int i20 = i19 & 69;
        int i21 = (i19 | 69) & (~i20);
        int i22 = i20 << 1;
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            byteBufferWrap.get(new byte[iO2]);
            throw null;
        }
        byte[] bArr4 = new byte[iO2];
        byteBufferWrap.get(bArr4);
        int i24 = a;
        int i25 = i24 & 109;
        int i26 = (i25 - (~((i24 ^ 109) | i25))) - 1;
        int i27 = i26 % 128;
        b = i27;
        int i28 = i26 % 2;
        if (bArr2 == null) {
            int i29 = i27 ^ 27;
            int i30 = (((i27 & 27) | i29) << 1) - i29;
            a = i30 % 128;
            int i31 = i30 % 2;
            bArr2 = new byte[0];
            int i32 = (i27 | 47) << 1;
            int i33 = -(i27 ^ 47);
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        try {
            ByteBuffer byteBufferK = this.d.k(bArr4, 0);
            byte[] bArr5 = new byte[32];
            int i36 = b;
            int i37 = (i36 & 105) + (i36 | 105);
            a = i37 % 128;
            int i38 = i37 % 2;
            byteBufferK.get(bArr5);
            byte[] bArrC = c(bArr2, byteBufferWrap);
            int i39 = b;
            int i40 = i39 ^ 65;
            int i41 = ((i39 & 65) | i40) << 1;
            int i42 = -i40;
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            a = i43 % 128;
            int i44 = i43 % 2;
            if (!r.C(r.n(bArr5, bArrC), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            int i45 = b;
            int i46 = ((i45 ^ 22) + ((i45 & 22) << 1)) - 1;
            a = i46 % 128;
            if (i46 % 2 == 0) {
                byteBufferWrap.position(iPosition);
                throw null;
            }
            byteBufferWrap.position(iPosition);
            u uVar2 = this.c;
            int i47 = a + 30;
            int i48 = (i47 ^ (-1)) + (i47 << 1);
            b = i48 % 128;
            int i49 = i48 % 2;
            byte[] bArrN = uVar2.n(byteBufferWrap);
            int i50 = b;
            int i51 = i50 & 11;
            int i52 = (i50 ^ 11) | i51;
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            a = i53 % 128;
            if (i53 % 2 == 0) {
                int i54 = 47 / 0;
            }
            return bArrN;
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i;
        byte[] bArrArray;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 107) - (~(-(-((i3 & 107) << 1))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (bArr.length % 16 == 0) {
            int i7 = i3 + 77;
            b = i7 % 128;
            int i8 = i7 % 2;
            length = bArr.length;
            int i9 = ((i3 | 95) << 1) - (i3 ^ 95);
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int length2 = bArr.length;
            int i11 = (length2 ^ 16) + ((length2 & 16) << 1);
            int i12 = -(bArr.length % 16);
            int i13 = ((~i12) & i11) | ((~i11) & i12);
            int i14 = (i12 & i11) << 1;
            length = (i13 ^ i14) + ((i14 & i13) << 1);
            int i15 = i5 + 126;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int iRemaining = byteBuffer.remaining();
        int i18 = iRemaining % 16;
        if (i18 == 0) {
            int i19 = b;
            int i20 = i19 & 45;
            int i21 = (i19 | 45) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            int i24 = i23 % 128;
            a = i24;
            int i25 = i23 % 2;
            int i26 = ((((i24 ^ 89) | (i24 & 89)) << 1) - (~(-(((~i24) & 89) | (i24 & (-90)))))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            i = iRemaining;
        } else {
            int i28 = iRemaining & 16;
            int i29 = -(-((iRemaining ^ 16) | i28));
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            int i31 = -i18;
            int i32 = i30 ^ i31;
            int i33 = (i31 & i30) << 1;
            i = (i32 & i33) + (i33 | i32);
            int i34 = b;
            int i35 = i34 & 47;
            int i36 = -(-((i34 ^ 47) | i35));
            int i37 = (i35 & i36) + (i36 | i35);
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = i & length;
        int i40 = ((i ^ length) | i39) << 1;
        int i41 = -((~i39) & (i | length));
        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
        int i43 = i42 & 16;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((~i43) & (i42 | 16)) + (i43 << 1));
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        int i44 = b;
        int i45 = i44 ^ 31;
        int i46 = (((i44 & 31) | i45) << 1) - i45;
        a = i46 % 128;
        int i47 = i46 % 2;
        ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
        byteBufferOrder.put(bArr);
        int i48 = a + 113;
        b = i48 % 128;
        int i49 = i48 % 2;
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        int i50 = a;
        int i51 = (i50 & (-88)) | ((~i50) & 87);
        int i52 = -(-((i50 & 87) << 1));
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        b = i53 % 128;
        int i54 = i53 % 2;
        byteBufferOrder.position(i42);
        byteBufferOrder.putLong(bArr.length);
        int i55 = a;
        int i56 = i55 & 29;
        int i57 = -(-((i55 ^ 29) | i56));
        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
        b = i58 % 128;
        if (i58 % 2 != 0) {
            byteBufferOrder.putLong(iRemaining);
            bArrArray = byteBufferOrder.array();
            int i59 = 60 / 0;
        } else {
            byteBufferOrder.putLong(iRemaining);
            bArrArray = byteBufferOrder.array();
        }
        int i60 = a;
        int i61 = ((i60 ^ 16) + ((i60 & 16) << 1)) - 1;
        b = i61 % 128;
        if (i61 % 2 != 0) {
            int i62 = 34 / 0;
        }
        return bArrArray;
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, CloneNotSupportedException {
        int length;
        int iO;
        byte[] bArrN;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = (i2 ^ 89) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            length = bArr.length;
            iO = this.c.o();
            int i6 = 75 / 0;
        } else {
            length = bArr.length;
            iO = this.c.o();
        }
        int i7 = a;
        int i8 = ((i7 | 73) << 1) - (i7 ^ 73);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = -iO;
        int i12 = Integer.MAX_VALUE & i11;
        int i13 = -(-((i11 ^ Integer.MAX_VALUE) | i12));
        if (length > ((i12 ^ i13) + ((i13 & i12) << 1)) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i14 = i9 & 51;
        int i15 = ((i9 ^ 51) | i14) << 1;
        int i16 = -((~i14) & (i9 | 51));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        int length2 = bArr.length;
        int iO2 = this.c.o();
        int i19 = iO2 ^ length2;
        int i20 = (length2 & iO2) << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = i21 & 16;
        int i23 = (i21 ^ 16) | i22;
        int i24 = (i22 & i23) + (i22 | i23);
        int i25 = b;
        int i26 = (i25 & (-120)) | ((~i25) & 119);
        int i27 = -(-((i25 & 119) << 1));
        int i28 = (i26 & i27) + (i27 | i26);
        a = i28 % 128;
        Object obj = null;
        if (i28 % 2 == 0) {
            ByteBuffer.allocate(i24).remaining();
            int length3 = bArr.length;
            throw null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i24);
        int iRemaining = byteBufferAllocate.remaining();
        int iO3 = (this.c.o() - (~(-(~bArr.length)))) - 2;
        int i29 = b + 101;
        int i30 = i29 % 128;
        a = i30;
        int i31 = i29 % 2;
        if (iRemaining < ((iO3 | 16) << 1) - (iO3 ^ 16)) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int i32 = (-2) - (((i30 & 88) + (i30 | 88)) ^ (-1));
        b = i32 % 128;
        int i33 = i32 % 2;
        int iPosition = byteBufferAllocate.position();
        this.c.m(byteBufferAllocate, bArr);
        int i34 = b + 73;
        a = i34 % 128;
        if (i34 % 2 == 0) {
            byteBufferAllocate.position(iPosition);
            byte[] bArr3 = new byte[this.c.o()];
            throw null;
        }
        byteBufferAllocate.position(iPosition);
        byte[] bArr4 = new byte[this.c.o()];
        byteBufferAllocate.get(bArr4);
        int iLimit = byteBufferAllocate.limit();
        int i35 = b;
        int i36 = (i35 & 93) + (i35 | 93);
        a = i36 % 128;
        int i37 = i36 % 2;
        byteBufferAllocate.limit((iLimit & (-16)) + (iLimit | (-16)));
        if (bArr2 == null) {
            int i38 = b;
            int i39 = (i38 & 19) + (i38 | 19);
            a = i39 % 128;
            bArr2 = i39 % 2 == 0 ? new byte[0] : new byte[0];
        }
        ByteBuffer byteBufferK = this.d.k(bArr4, 0);
        byte[] bArr5 = new byte[32];
        int i40 = a + 3;
        b = i40 % 128;
        if (i40 % 2 != 0) {
            byteBufferK.get(bArr5);
            c(bArr2, byteBufferAllocate);
            obj.hashCode();
            throw null;
        }
        byteBufferK.get(bArr5);
        byte[] bArrC = c(bArr2, byteBufferAllocate);
        int i41 = a;
        int i42 = (((i41 | 70) << 1) - (i41 ^ 70)) - 1;
        b = i42 % 128;
        if (i42 % 2 != 0) {
            bArrN = r.n(bArr5, bArrC);
            byteBufferAllocate.limit(byteBufferAllocate.limit() * 13);
        } else {
            bArrN = r.n(bArr5, bArrC);
            int iLimit2 = byteBufferAllocate.limit();
            int i43 = iLimit2 & 16;
            byteBufferAllocate.limit((i43 - (~((iLimit2 ^ 16) | i43))) - 1);
        }
        byteBufferAllocate.put(bArrN);
        byte[] bArrArray = byteBufferAllocate.array();
        int i44 = b + 21;
        a = i44 % 128;
        int i45 = i44 % 2;
        return bArrArray;
    }
}
