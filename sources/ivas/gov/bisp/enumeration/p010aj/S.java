package ivas.gov.bisp.enumeration.p010aj;

import ivas.gov.bisp.enumeration.cC.P;
import ivas.gov.bisp.enumeration.cC.v;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p101x.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class S {
    private static int a = 1;
    private static int b;
    public int c;
    public Object d;

    public /* synthetic */ S(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.d = new Object[i];
        int i2 = (-2) - ((a + 78) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ S(C0278x c0278x, int i) {
        Objects.requireNonNull(c0278x, "digest == null");
        this.d = P.b(c0278x);
        this.c = i;
    }

    public byte[] d(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = a + 101;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            int length = bArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bArr.length != this.c) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("wrong address length");
        }
        int i4 = (((i3 ^ 41) | (i3 & 41)) << 1) - (((~i3) & 41) | (i3 & (-42)));
        a = i4 % 128;
        byte[] bArrF = f(i4 % 2 == 0 ? 4 : 3, bArr, bArr2);
        int i5 = a;
        int i6 = ((((i5 ^ 89) | (i5 & 89)) << 1) - (~(-(((~i5) & 89) | (i5 & (-90)))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return bArrF;
    }

    public Object e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 13;
        int i4 = (i2 & 13) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.c;
        Object obj = null;
        if (i8 <= 0) {
            int i9 = (((i6 ^ 41) | (i6 & 41)) << 1) - (((~i6) & 41) | (i6 & (-42)));
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 50 / 0;
            }
            return null;
        }
        int i11 = ((((i6 ^ 45) | (i6 & 45)) << 1) - (~(-(((~i6) & 45) | (i6 & (-46)))))) - 1;
        int i12 = i11 % 128;
        b = i12;
        if (i11 % 2 == 0) {
            i8 = (-2) - (i8 ^ (-1));
        }
        Object[] objArr = (Object[]) this.d;
        Object obj2 = objArr[i8];
        int i13 = i12 & 103;
        int i14 = (((i12 ^ 103) | i13) << 1) - ((~i13) & (i12 | 103));
        a = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[i8] = null;
            this.c = i8;
            obj.hashCode();
            throw null;
        }
        objArr[i8] = null;
        this.c = i8;
        int i15 = i12 ^ 91;
        int i16 = (((i12 & 91) | i15) << 1) - i15;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return obj2;
        }
        obj.hashCode();
        throw null;
    }

    public byte[] f(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = ((i3 ^ 47) | i4) << 1;
        int i6 = -((i3 | 47) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        byte[] bArrK = v.k(i, this.c);
        Object obj = this.d;
        int i9 = a;
        int i10 = i9 & 9;
        int i11 = (i10 - (~(-(-((i9 ^ 9) | i10))))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        ((i) obj).f(bArrK, 0, bArrK.length);
        Object obj2 = this.d;
        int i13 = a;
        int i14 = i13 & 83;
        int i15 = (i13 | 83) & (~i14);
        int i16 = i14 << 1;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        b = i17 % 128;
        int i18 = i17 % 2;
        ((i) obj2).f(bArr, 0, bArr.length);
        Object obj3 = this.d;
        int i19 = b;
        int i20 = i19 & 65;
        int i21 = i19 | 65;
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        ((i) obj3).f(bArr2, 0, bArr2.length);
        int i24 = this.c;
        int i25 = b;
        int i26 = (i25 ^ 5) + ((i25 & 5) << 1);
        int i27 = i26 % 128;
        a = i27;
        int i28 = i26 % 2;
        byte[] bArr3 = new byte[i24];
        i iVar = (i) this.d;
        int i29 = i27 & 3;
        int i30 = (i27 | 3) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        int i33 = i32 % 128;
        b = i33;
        if (i32 % 2 != 0) {
            boolean z = iVar instanceof ivas.gov.bisp.enumeration.p101x.P;
            throw null;
        }
        if (!(iVar instanceof ivas.gov.bisp.enumeration.p101x.P)) {
            iVar.b(bArr3, 0);
            int i34 = b;
            int i35 = ((i34 & 34) + (i34 | 34)) - 1;
            a = i35 % 128;
            int i36 = i35 % 2;
        } else {
            int i37 = (i33 & (-70)) | ((~i33) & 69);
            int i38 = -(-((i33 & 69) << 1));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            a = i39 % 128;
            int i40 = i39 % 2;
            ((ivas.gov.bisp.enumeration.p101x.P) iVar).a(bArr3, 0, i24);
        }
        int i41 = b;
        int i42 = i41 | 39;
        int i43 = i42 << 1;
        int i44 = -((~(i41 & 39)) & i42);
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        a = i45 % 128;
        if (i45 % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    public boolean g(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2 == 0 ? 1 : 0;
        int i6 = i4 ^ 5;
        int i7 = ((i4 & 5) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        while (true) {
            int i11 = this.c;
            Object obj2 = null;
            if (i5 >= i11) {
                int i12 = b;
                int i13 = i12 & 7;
                int i14 = (((i12 ^ 7) | i13) << 1) - ((~i13) & (i12 | 7));
                a = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i12 + 125;
                int i17 = i16 % 128;
                a = i17;
                if (i16 % 2 == 0) {
                    int length = ((Object[]) this.d).length;
                    throw null;
                }
                Object obj3 = this.d;
                if (i11 >= ((Object[]) obj3).length) {
                    int i18 = i12 & 85;
                    int i19 = i18 + ((i12 ^ 85) | i18);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    return false;
                }
                ((Object[]) obj3)[i11] = obj;
                this.c = (i11 ^ 1) + ((i11 & 1) << 1);
                int i21 = ((i17 | 59) << 1) - (i17 ^ 59);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 14 / 0;
                }
                return true;
            }
            int i23 = a;
            int i24 = i23 & 109;
            int i25 = (i23 ^ 109) | i24;
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = i26 % 128;
            b = i27;
            if (i26 % 2 != 0) {
                Object obj4 = ((Object[]) this.d)[i5];
                obj2.hashCode();
                throw null;
            }
            if (((Object[]) this.d)[i5] == obj) {
                int i28 = i27 & 103;
                int i29 = ((i27 ^ 103) | i28) << 1;
                int i30 = -((~i28) & (i27 | 103));
                int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                throw new IllegalStateException("Already in the pool!");
            }
            int i33 = i5 & 1;
            i5 = (((i5 | 1) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
            int i34 = ((i23 | 74) << 1) - (i23 ^ 74);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
    }
}
