package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p080cz.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class N extends c implements h {
    private static int R = 1;
    private static int b;
    public final byte[] S;
    public final M T;
    public final byte[] U;
    public final byte[] V;
    public volatile long W;
    public volatile e X;
    public final byte[] Y;

    public static class bDd {
        public final M a;
        public long b = 0;
        public long c = -1;
        public byte[] d = null;
        public byte[] f = null;
        public byte[] e = null;
        public byte[] g = null;
        public e h = null;

        public bDd(M m) {
            this.a = m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0200  */
    /* JADX WARN: Illegal instructions before constructor call */
    public N(bDd bdd, bDc bdc) {
        int i;
        M m = bdd.a;
        S s = m.e;
        super(true, s.h);
        this.T = m;
        int i2 = s.j;
        this.W = bdd.b;
        byte[] bArr = bdd.d;
        if (bArr == null) {
            this.U = new byte[i2];
            int i3 = b + 17;
            R = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 4;
            } else {
                int i5 = 2 % 2;
            }
        } else {
            if (bArr.length != i2) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            int i6 = R;
            int i7 = (i6 | 123) << 1;
            int i8 = -(((~i6) & 123) | (i6 & (-124)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            this.U = bArr;
            int i12 = i10 & 3;
            int i13 = -(-(i10 | 3));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            R = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 2 % 2;
            }
        }
        byte[] bArr2 = bdd.f;
        if (bArr2 != null) {
            int i16 = b;
            int i17 = i16 ^ 19;
            int i18 = -(-((i16 & 19) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            R = i20;
            int i21 = i19 % 2;
            if (bArr2.length != i2) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            int i22 = i20 & 97;
            int i23 = -(-(i20 | 97));
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            this.S = bArr2;
            int i26 = i20 & 83;
            int i27 = (i20 | 83) & (~i26);
            int i28 = i26 << 1;
            int i29 = (i27 & i28) + (i28 | i27);
            b = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 2 % 2;
        } else {
            this.S = new byte[i2];
            int i32 = b;
            int i33 = ((i32 & 110) + (i32 | 110)) - 1;
            R = i33 % 128;
            int i34 = i33 % 2;
            int i35 = 2 % 2;
        }
        byte[] bArr3 = bdd.e;
        if (bArr3 != null) {
            int i36 = b;
            int i37 = i36 & 101;
            int i38 = (i37 - (~((i36 ^ 101) | i37))) - 1;
            R = i38 % 128;
            int i39 = i38 % 2;
            if (bArr3.length != i2) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            int i40 = (((i36 | 54) << 1) - (i36 ^ 54)) - 1;
            R = i40 % 128;
            if (i40 % 2 == 0) {
                this.V = bArr3;
                throw null;
            }
            this.V = bArr3;
            int i41 = 2 % 2;
        } else {
            this.V = new byte[i2];
            int i42 = b;
            int i43 = (i42 & (-44)) | ((~i42) & 43);
            int i44 = -(-((i42 & 43) << 1));
            int i45 = (i43 & i44) + (i44 | i43);
            R = i45 % 128;
            int i46 = i45 % 2;
            int i47 = 2 % 2;
        }
        byte[] bArr4 = bdd.g;
        if (bArr4 != null) {
            int i48 = b;
            int i49 = i48 & 59;
            int i50 = (i49 - (~((i48 ^ 59) | i49))) - 1;
            int i51 = i50 % 128;
            R = i51;
            int i52 = i50 % 2;
            if (bArr4.length != i2) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            int i53 = (((i51 & (-82)) | ((~i51) & 81)) - (~((i51 & 81) << 1))) - 1;
            b = i53 % 128;
            if (i53 % 2 != 0) {
                this.Y = bArr4;
                throw null;
            }
            this.Y = bArr4;
            int i54 = ((i51 ^ 55) | (i51 & 55)) << 1;
            int i55 = -((i51 & (-56)) | ((~i51) & 55));
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            b = i56 % 128;
            int i57 = i56 % 2;
            int i58 = 2 % 2;
        } else {
            this.Y = new byte[i2];
            int i59 = R + 73;
            b = i59 % 128;
            if (i59 % 2 == 0) {
                int i60 = 2 % 2;
            }
        }
        e eVar = bdd.h;
        if (eVar == null) {
            int i61 = R;
            int i62 = i61 & 31;
            int i63 = i62 + ((i61 ^ 31) | i62);
            b = i63 % 128;
            if (i63 % 2 != 0) {
                v.j(m.f, bdd.b);
                throw null;
            }
            if (!v.j(m.f, bdd.b)) {
                eVar = new e(bdd.c + 1);
                int i64 = R;
                int i65 = ((i64 ^ 101) | (i64 & 101)) << 1;
                int i66 = -(((~i64) & 101) | (i64 & (-102)));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                int i68 = i67 % 128;
                b = i68;
                int i69 = i67 % 2;
                int i70 = i68 ^ 25;
                int i71 = -(-((i68 & 25) << 1));
                i = (i70 ^ i71) + ((i71 & i70) << 1);
                R = i % 128;
                if (i % 2 != 0) {
                    int i72 = 2 % 2;
                }
            } else {
                int i73 = b;
                int i74 = ((i73 | 111) << 1) - (i73 ^ 111);
                R = i74 % 128;
                if (i74 % 2 == 0) {
                    throw null;
                }
                if (bArr3 == null || bArr == null) {
                    eVar = new e(bdd.c + 1);
                    int i610 = R;
                    int i611 = ((i610 ^ 101) | (i610 & 101)) << 1;
                    int i612 = -(((~i610) & 101) | (i610 & (-102)));
                    int i613 = (i611 ^ i612) + ((i612 & i611) << 1);
                    int i614 = i613 % 128;
                    b = i614;
                    int i615 = i613 % 2;
                    int i75 = i614 ^ 25;
                    int i76 = -(-((i614 & 25) << 1));
                    i = (i75 ^ i76) + ((i76 & i75) << 1);
                    R = i % 128;
                    if (i % 2 != 0) {
                        int i77 = 2 % 2;
                    }
                } else {
                    eVar = new e(m, bdd.b, bArr3, bArr);
                    int i78 = R;
                    int i79 = (-2) - ((i78 + 42) ^ (-1));
                    b = i79 % 128;
                    int i80 = i79 % 2;
                    int i81 = i78 & 97;
                    int i82 = i78 | 97;
                    int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                    b = i83 % 128;
                    if (i83 % 2 == 0) {
                        int i84 = 2 % 2;
                    }
                }
            }
        }
        this.X = eVar;
        long j = bdd.c;
        int i85 = b;
        int i86 = i85 & 113;
        int i87 = -(-((i85 ^ 113) | i86));
        int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
        int i89 = i88 % 128;
        R = i89;
        int i90 = i88 % 2;
        if (j >= 0) {
            int i91 = i89 + 1;
            b = i91 % 128;
            int i92 = i91 % 2;
            if (j != this.X.d) {
                throw new IllegalArgumentException("maxIndex set but not reflected in state");
            }
        }
        int i93 = R;
        int i94 = i93 & 47;
        int i95 = (i93 ^ 47) | i94;
        int i96 = (i94 & i95) + (i95 | i94);
        b = i96 % 128;
        if (i96 % 2 != 0) {
            throw null;
        }
    }

    public final byte[] c() {
        byte[] bArrE;
        synchronized (this) {
            M m = this.T;
            int i = m.e.j;
            int i2 = m.f;
            int i3 = i2 ^ 7;
            int i4 = (((((i2 & 7) | i3) << 1) - (~(-i3))) - 1) / 8;
            int i5 = i4 & i;
            int i6 = (~i5) & (i4 | i);
            int i7 = ~i;
            int i8 = i5 << 1;
            int i9 = ((i6 | i8) << 1) - (i8 ^ i6);
            int i10 = -(-i);
            int i11 = ~i10;
            int i12 = i9 & i10;
            int i13 = i9 | i10;
            int i14 = (i12 & i13) + (i13 | i12);
            int i15 = -i7;
            int i16 = ((i14 ^ i15) + ((i15 & i14) << 1)) - 1;
            int i17 = -(~i10);
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            byte[] bArr = new byte[(i18 ^ (-1)) + (i18 << 1)];
            v.f(bArr, v.k(this.W, i4), 0);
            int i19 = i4 & 108;
            int i20 = ((i4 ^ 108) | i19) << 1;
            int i21 = -((i4 | 108) & (~i19));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            int i23 = i22 & (-108);
            int i24 = (~i23) & (i22 | (-108));
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            v.f(bArr, this.U, i26);
            int i27 = ((i26 ^ i10) | (i26 & i10)) << 1;
            int i28 = -((i11 & i26) | ((~i26) & i10));
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            v.f(bArr, this.S, i29);
            int i30 = i29 & i10;
            int i31 = (((i29 ^ i10) | i30) << 1) - ((i10 | i29) & (~i30));
            v.f(bArr, this.V, i31);
            v.f(bArr, this.Y, (i31 ^ i) + ((i31 & i) << 1));
            try {
                e eVar = this.X;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(eVar);
                objectOutputStream.flush();
                bArrE = j.e(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
        return bArrE;
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public final byte[] getEncoded() {
        byte[] bArrC;
        synchronized (this) {
            bArrC = c();
        }
        return bArrC;
    }
}
