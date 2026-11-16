package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class u extends J {
    private static int a = 0;
    private static int b = 1;
    public C0258a c;
    public C0278x d;
    public C0258a e;
    public byte[][] f;
    public byte[][] g;
    public byte[] h;

    public u(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.c = new C0258a(0L);
        this.e = new C0258a(i);
        this.g = r.r(sArr);
        this.f = r.r(sArr2);
        this.h = r.o(sArr3);
    }

    public u(Q q) {
        int i;
        byte[][] bArr;
        M mP;
        if (q.u(0) instanceof C0258a) {
            this.c = C0258a.p(q.u(0));
            int i2 = b;
            int i3 = i2 & 89;
            int i4 = -(-((i2 ^ 89) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.d = C0278x.o(q.u(0));
            int i7 = a;
            int i8 = i7 & 117;
            int i9 = (((i7 ^ 117) | i8) << 1) - ((i7 | 117) & (~i8));
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        }
        this.e = C0258a.p(q.u(1));
        int i11 = b;
        int i12 = ((i11 ^ 7) | (i11 & 7)) << 1;
        int i13 = -(((~i11) & 7) | (i11 & (-8)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        Q qO = Q.o(q.u(2));
        int size = qO.size();
        int i16 = a;
        int i17 = i16 ^ 105;
        int i18 = ((i16 & 105) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i18 | i19);
        int i21 = i20 % 128;
        b = i21;
        if (i20 % 2 == 0) {
            this.g = new byte[size][];
            i = 1;
        } else {
            this.g = new byte[size][];
            i = 0;
        }
        int i22 = (((i21 | 58) << 1) - (i21 ^ 58)) - 1;
        a = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 2 % 2;
        while (i < qO.size()) {
            int i25 = a;
            int i26 = i25 & 7;
            int i27 = ((i25 ^ 7) | i26) << 1;
            int i28 = -((i25 | 7) & (~i26));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                bArr = this.g;
                mP = M.p(qO.u(i));
                int i30 = 51 / 0;
            } else {
                bArr = this.g;
                mP = M.p(qO.u(i));
            }
            bArr[i] = mP.c;
            i = ((i | 1) << 1) - (i ^ 1);
            int i31 = b;
            int i32 = i31 & 77;
            int i33 = -(-((i31 ^ 77) | i32));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        Q q2 = (Q) q.u(3);
        int size2 = q2.size();
        int i36 = a;
        int i37 = (i36 & 57) + (i36 | 57);
        b = i37 % 128;
        int i38 = i37 % 2;
        this.f = new byte[size2][];
        int i39 = i36 & 119;
        int i40 = -(-(i36 | 119));
        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
        b = i41 % 128;
        int i42 = i41 % 2;
        int i43 = 0;
        while (i43 < q2.size()) {
            int i44 = a;
            int i45 = i44 & 81;
            int i46 = (i44 | 81) & (~i45);
            int i47 = i45 << 1;
            int i48 = (i46 & i47) + (i46 | i47);
            b = i48 % 128;
            int i49 = i48 % 2;
            byte[][] bArr2 = this.f;
            byte[] bArr3 = M.p(q2.u(i43)).c;
            int i50 = a;
            int i51 = (i50 & (-32)) | ((~i50) & 31);
            int i52 = (i50 & 31) << 1;
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            int i54 = i53 % 128;
            b = i54;
            if (i53 % 2 == 0) {
                bArr2[i43] = bArr3;
                int i55 = i43 & 57;
                int i56 = ((i43 ^ 57) | i55) << 1;
                int i57 = -((i43 | 57) & (~i55));
                i43 = (i56 & i57) + (i57 | i56);
            } else {
                bArr2[i43] = bArr3;
                int i58 = i43 & 1;
                i43 = i58 + ((i43 ^ 1) | i58);
            }
            int i59 = ((i54 & 38) + (i54 | 38)) - 1;
            a = i59 % 128;
            int i60 = i59 % 2;
        }
        byte[] bArr4 = M.p(((Q) q.u(4)).u(0)).c;
        int i61 = a;
        int i62 = (i61 & (-18)) | ((~i61) & 17);
        int i63 = -(-((i61 & 17) << 1));
        int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
        int i65 = i64 % 128;
        b = i65;
        int i66 = i64 % 2;
        this.h = bArr4;
        int i67 = (-2) - ((i65 + 28) ^ (-1));
        a = i67 % 128;
        int i68 = i67 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        i iVar = this.c;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i2 ^ 75) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (iVar == null) {
            int i6 = i2 & 95;
            int i7 = i6 + ((i2 ^ 95) | i6);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            iVar = this.d;
            int i8 = i2 & 55;
            int i9 = (i8 - (~(-(-((i2 ^ 55) | i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        c0270p.c(iVar);
        c0270p.c(this.e);
        C0270p c0270p2 = new C0270p(10);
        int i11 = a;
        int i12 = (i11 & (-78)) | ((~i11) & 77);
        int i13 = (i11 & 77) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        int i15 = i14 % 128;
        b = i15;
        int i16 = 0;
        int i17 = i14 % 2 == 0 ? 1 : 0;
        int i18 = i15 & 113;
        int i19 = i15 | 113;
        while (true) {
            int i20 = i18 + i19;
            a = i20 % 128;
            int i21 = i20 % 2;
            byte[][] bArr = this.g;
            if (i17 >= bArr.length) {
                break;
            }
            c0270p2.c(new B(bArr[i17]));
            int i22 = b;
            int i23 = i22 & 89;
            int i24 = -(-(i22 | 89));
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            int i27 = i17 & (-72);
            int i28 = i27 + ((i17 ^ (-72)) | i27);
            int i29 = i28 & 73;
            i17 = ((((i28 ^ 73) | i29) << 1) - (~(-((i28 | 73) & (~i29))))) - 1;
            i18 = i22 ^ 35;
            i19 = (i22 & 35) << 1;
        }
        c0270p.c(new ac(c0270p2));
        C0270p c0270p3 = new C0270p(10);
        int i30 = b;
        int i31 = ((((i30 ^ 125) | (i30 & 125)) << 1) - (~(-(((~i30) & 125) | (i30 & (-126)))))) - 1;
        int i32 = i31 % 128;
        a = i32;
        int i33 = i31 % 2;
        int i34 = i32 & 85;
        int i35 = (((i32 | 85) & (~i34)) - (~(-(-(i34 << 1))))) - 1;
        b = i35 % 128;
        int i36 = i35 % 2;
        while (true) {
            byte[][] bArr2 = this.f;
            if (i16 >= bArr2.length) {
                c0270p.c(new ac(c0270p3));
                C0270p c0270p4 = new C0270p(10);
                c0270p4.c(new B(this.h));
                c0270p.c(new ac(c0270p4));
                ac acVar = new ac(c0270p);
                int i37 = b;
                int i38 = i37 & 37;
                int i39 = i38 + ((i37 ^ 37) | i38);
                a = i39 % 128;
                int i40 = i39 % 2;
                return acVar;
            }
            c0270p3.c(new B(bArr2[i16]));
            int i41 = b;
            int i42 = i41 & 9;
            int i43 = (i41 ^ 9) | i42;
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            int i45 = i44 % 128;
            a = i45;
            int i46 = i44 % 2;
            int i47 = i16 ^ (-122);
            int i48 = (i16 & (-122)) << 1;
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            i16 = (((i49 ^ 123) | (i49 & 123)) << 1) - ((i49 & (-124)) | ((~i49) & 123));
            int i50 = i45 & 67;
            int i51 = i50 + ((i45 ^ 67) | i50);
            b = i51 % 128;
            int i52 = i51 % 2;
        }
    }
}
