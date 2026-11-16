package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p064cj.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class L extends ivas.gov.bisp.enumeration.cA.u implements h {
    private static int a = 1;
    private static int b;
    public final byte[] T;
    public final S U;
    public final byte[] V;
    public final byte[] W;
    public volatile C0238r X;
    public final byte[] Y;

    public static class bDo {
        public final S a;
        public int b = 0;
        public int c = -1;
        public byte[] d = null;
        public byte[] f = null;
        public byte[] e = null;
        public byte[] g = null;
        public C0238r h = null;

        public bDo(S s) {
            this.a = s;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x028a  */
    /* JADX WARN: Illegal instructions before constructor call */
    public L(bDo bdo, bDn bdn) throws Throwable {
        int i;
        S s = bdo.a;
        super(true, s.h, 1);
        this.U = s;
        int i2 = s.j;
        byte[] bArr = bdo.d;
        if (bArr == null) {
            this.T = new byte[i2];
            int i3 = b + 77;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            } else {
                int i5 = 2 % 2;
            }
        } else {
            if (bArr.length != i2) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            int i6 = b;
            int i7 = (((i6 | 22) << 1) - (i6 ^ 22)) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                this.T = bArr;
                int i8 = 92 / 0;
            } else {
                this.T = bArr;
            }
            int i9 = 2 % 2;
        }
        byte[] bArr2 = bdo.f;
        if (bArr2 != null) {
            int i10 = b;
            int i11 = i10 & 65;
            int i12 = (((i10 | 65) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            if (bArr2.length != i2) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            int i15 = (((i13 | 82) << 1) - (i13 ^ 82)) - 1;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                this.V = bArr2;
                int i16 = 32 / 0;
            } else {
                this.V = bArr2;
            }
            int i17 = 2 % 2;
        } else {
            this.V = new byte[i2];
            int i18 = b + 87;
            a = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 2 % 2;
        }
        byte[] bArr3 = bdo.e;
        Object obj = null;
        if (bArr3 != null) {
            int i21 = a;
            int i22 = (((i21 | 4) << 1) - (i21 ^ 4)) - 1;
            int i23 = i22 % 128;
            b = i23;
            if (i22 % 2 != 0) {
                int length = bArr3.length;
                obj.hashCode();
                throw null;
            }
            if (bArr3.length != i2) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            int i24 = ((i23 ^ 5) | (i23 & 5)) << 1;
            int i25 = -((i23 & (-6)) | ((~i23) & 5));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            a = i26 % 128;
            int i27 = i26 % 2;
            this.Y = bArr3;
            int i28 = i23 & 109;
            int i29 = -(-((i23 ^ 109) | i28));
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 2 % 2;
            }
        } else {
            this.Y = new byte[i2];
            int i32 = a;
            int i33 = ((i32 | 3) << 1) - (((~i32) & 3) | (i32 & (-4)));
            b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = 2 % 2;
        }
        byte[] bArr4 = bdo.g;
        if (bArr4 != null) {
            int i36 = b;
            int i37 = i36 & 59;
            int i38 = ((~i37) & (i36 | 59)) + (i37 << 1);
            a = i38 % 128;
            if (i38 % 2 == 0) {
                int length2 = bArr4.length;
                throw null;
            }
            if (bArr4.length != i2) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.W = bArr4;
            int i39 = (i36 & 87) + (i36 | 87);
            a = i39 % 128;
            int i40 = i39 % 2;
            int i41 = 2 % 2;
        } else {
            this.W = new byte[i2];
            int i42 = b;
            int i43 = i42 & 105;
            int i44 = i43 + ((i42 ^ 105) | i43);
            a = i44 % 128;
            int i45 = i44 % 2;
            int i46 = 2 % 2;
        }
        C0238r c0238r = bdo.h;
        if (c0238r == null) {
            int i47 = b;
            int i48 = i47 & 9;
            int i49 = (i47 | 9) & (~i48);
            int i50 = i48 << 1;
            int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
            a = i51 % 128;
            int i52 = i51 % 2;
            int i53 = bdo.b;
            int i54 = 1 << s.e;
            int i55 = a + 33;
            int i56 = i55 % 128;
            b = i56;
            int i57 = i55 % 2;
            int i58 = i54 & (-2);
            if (i53 < i58 + ((i54 ^ (-2)) | i58)) {
                int i59 = i56 & 35;
                int i60 = (i56 ^ 35) | i59;
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                int i62 = i61 % 128;
                a = i62;
                int i63 = i61 % 2;
                if (bArr3 != null) {
                    int i64 = ((i62 & (-70)) | ((~i62) & 69)) + ((i62 & 69) << 1);
                    b = i64 % 128;
                    if (i64 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (bArr != null) {
                        C0234l c0234l = (C0234l) new C0234l.bCT().g();
                        int i65 = b + 19;
                        a = i65 % 128;
                        int i66 = i65 % 2;
                        int i67 = bdo.b;
                        a aVarC = s.c();
                        int i68 = s.e;
                        int i69 = 1 << i68;
                        C0238r c0238r2 = new C0238r(aVarC, i68, s.f, i69 + ((i69 ^ (-1)) | i69));
                        int i70 = a;
                        int i71 = i70 ^ 57;
                        int i72 = -(-((i70 & 57) << 1));
                        int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                        b = i73 % 128;
                        int i74 = i73 % 2;
                        c0238r2.f(bArr3, bArr, c0234l);
                        int i75 = b;
                        int i76 = i75 & 89;
                        int i77 = i75 | 89;
                        int i78 = (i76 & i77) + (i77 | i76);
                        a = i78 % 128;
                        int i79 = i78 % 2;
                        int i80 = 2 % 2;
                        while (c0238r2.l < i67) {
                            int i81 = a;
                            int i82 = i81 & 81;
                            int i83 = (i81 ^ 81) | i82;
                            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                            b = i84 % 128;
                            if (i84 % 2 != 0) {
                                c0238r2.g(bArr3, bArr, c0234l);
                            } else {
                                c0238r2.g(bArr3, bArr, c0234l);
                            }
                            int i85 = a;
                            int i86 = ((i85 ^ 111) | (i85 & 111)) << 1;
                            int i87 = -(((~i85) & 111) | (i85 & (-112)));
                            int i88 = (i86 & i87) + (i87 | i86);
                            b = i88 % 128;
                            if (i88 % 2 != 0) {
                                c0238r2.m = false;
                                throw null;
                            }
                            c0238r2.m = false;
                        }
                        c0238r = c0238r2;
                        this.X = c0238r;
                        int i89 = a + 108;
                        i = (i89 ^ (-1)) + (i89 << 1);
                        b = i % 128;
                        if (i % 2 == 0) {
                            int i90 = 2 % 2;
                        }
                    }
                }
            }
            C0238r c0238r3 = new C0238r(s.c(), s.e, s.f, i53);
            int i91 = a + 84;
            int i92 = (i91 ^ (-1)) + (i91 << 1);
            b = i92 % 128;
            int i93 = i92 % 2;
            int i94 = ~i54;
            int i95 = i54 << 1;
            c0238r3.n = (i94 ^ i95) + ((i94 & i95) << 1);
            c0238r3.l = i53;
            int i96 = a;
            int i97 = ((i96 | 59) << 1) - (i96 ^ 59);
            b = i97 % 128;
            if (i97 % 2 != 0) {
                c0238r3.m = true;
            } else {
                c0238r3.m = true;
            }
            this.X = c0238r3;
            int i98 = b + 45;
            a = i98 % 128;
            int i99 = i98 % 2;
            int i100 = 2 % 2;
        } else {
            this.X = c0238r;
            int i810 = a + 108;
            i = (i810 ^ (-1)) + (i810 << 1);
            b = i % 128;
            if (i % 2 == 0) {
                int i910 = 2 % 2;
            }
        }
        int i101 = bdo.c;
        if (i101 >= 0) {
            int i102 = a;
            int i103 = (((i102 ^ 85) | (i102 & 85)) << 1) - (((~i102) & 85) | (i102 & (-86)));
            b = i103 % 128;
            int i104 = i103 % 2;
            if (i101 != this.X.n) {
                throw new IllegalArgumentException("maxIndex set but not reflected in state");
            }
        }
        int i105 = a;
        int i106 = (-2) - (((i105 & 2) + (i105 | 2)) ^ (-1));
        b = i106 % 128;
        if (i106 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final byte[] c() {
        byte[] bArrE;
        synchronized (this) {
            int i = this.U.j;
            int i2 = i + 4;
            int i3 = -(-i);
            int i4 = i2 & i3;
            int i5 = (((i2 ^ i3) | i4) << 1) - ((~i4) & (i2 | i3));
            int i6 = i5 & i3;
            int i7 = -(-((i3 ^ i5) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = i ^ i8;
            byte[] bArr = new byte[(((i & i8) | i9) << 1) - i9];
            ivas.gov.bisp.enumeration.p096p.h.i(this.X.l, bArr, 0);
            v.f(bArr, this.T, 4);
            v.f(bArr, this.V, i2);
            v.f(bArr, this.Y, i5);
            v.f(bArr, this.W, i8);
            try {
                C0238r c0238r = this.X;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(c0238r);
                objectOutputStream.flush();
                bArrE = j.e(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new RuntimeException(sb.toString());
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
