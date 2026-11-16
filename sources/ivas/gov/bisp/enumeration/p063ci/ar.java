package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ar extends Q {
    private static int a = 0;
    private static int b = 1;
    public int d;

    public ar() {
        this.d = -1;
    }

    public ar(C0270p c0270p) {
        super(c0270p);
        this.d = -1;
    }

    public ar(i[] iVarArr, boolean z) {
        super(iVarArr, z);
        this.d = -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x014d  */
    /* JADX WARN: Code duplicated, block: B:27:0x015f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0164 A[LOOP:2: B:28:0x0162->B:29:0x0164, LOOP_END] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 95;
        int i5 = -(-((i3 & 95) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (z) {
            aVar.r(48);
            int i7 = a;
            int i8 = ((i7 ^ 43) | (i7 & 43)) << 1;
            int i9 = -(((~i7) & 43) | (i7 & (-44)));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        a aVarI = aVar.i();
        int length = this.c.length;
        int i12 = b;
        int i13 = (((i12 ^ 93) | (i12 & 93)) << 1) - ((i12 & (-94)) | ((~i12) & 93));
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        if (this.d < 0) {
            int i16 = i12 & 33;
            int i17 = i16 + ((i12 ^ 33) | i16);
            a = i17 % 128;
            if (i17 % 2 == 0 ? length > 16 : length > 102) {
                aVar.w(p());
                i = a + 119;
                b = i % 128;
                if (i % 2 == 0) {
                    int i18 = 2 % 3;
                }
                while (i15 < length) {
                    int i19 = b;
                    int i20 = i19 & 17;
                    int i21 = -(-((i19 ^ 17) | i20));
                    int i22 = (i20 & i21) + (i21 | i20);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    O oF = this.c[i15].f();
                    int i24 = b;
                    int i25 = ((i24 | 115) << 1) - (i24 ^ 115);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    aVarI.A(oF, true);
                    i15 = ((i15 & (-2)) | ((~i15) & 1)) + ((i15 & 1) << 1);
                    int i27 = b;
                    int i28 = ((i27 & 24) + (i27 | 24)) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
            } else {
                O[] oArr = new O[length];
                int i30 = (i12 ^ 15) + ((i12 & 15) << 1);
                a = i30 % 128;
                int i31 = i30 % 2;
                int i32 = 0;
                int i33 = 0;
                while (i32 < length) {
                    int i34 = b;
                    int i35 = (i34 & (-14)) | ((~i34) & 13);
                    int i36 = (i34 & 13) << 1;
                    int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    O oM = this.c[i32].f().m();
                    int i39 = a;
                    int i40 = ((i39 | 59) << 1) - (((~i39) & 59) | (i39 & (-60)));
                    b = i40 % 128;
                    if (i40 % 2 == 0) {
                        oArr[i32] = oM;
                        oM.j();
                        obj.hashCode();
                        throw null;
                    }
                    oArr[i32] = oM;
                    int iJ = oM.j();
                    int i41 = b;
                    int i42 = i41 & 119;
                    int i43 = -(-((i41 ^ 119) | i42));
                    int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = i33 - (~iJ);
                    i33 = (i46 << 1) + (i46 ^ (-1));
                    i32 = ((((i32 ^ 1) | (i32 & 1)) << 1) - (~(-(((~i32) & 1) | (i32 & (-2)))))) - 1;
                    int i47 = i41 | 21;
                    int i48 = ((i47 << 1) - (~(-(i47 & (~(i41 & 21)))))) - 1;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                }
                this.d = i33;
                aVar.w(i33);
                int i50 = a;
                int i51 = i50 ^ 63;
                int i52 = ((i50 & 63) | i51) << 1;
                int i53 = -i51;
                int i54 = (i52 & i53) + (i52 | i53);
                b = i54 % 128;
                int i55 = i54 % 2;
                while (i15 < length) {
                    int i56 = b;
                    int i57 = ((i56 | 52) << 1) - (i56 ^ 52);
                    int i58 = (i57 ^ (-1)) + (i57 << 1);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    aVarI.A(oArr[i15], true);
                    int i60 = i15 ^ 1;
                    int i61 = ((i15 & 1) | i60) << 1;
                    int i62 = -i60;
                    i15 = (i61 ^ i62) + ((i62 & i61) << 1);
                    int i63 = a;
                    int i64 = (((i63 | 63) << 1) - (~(-(i63 ^ 63)))) - 1;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                }
            }
        } else {
            aVar.w(p());
            i = a + 119;
            b = i % 128;
            if (i % 2 == 0) {
                int i110 = 2 % 3;
            }
            while (i15 < length) {
                int i111 = b;
                int i210 = i111 & 17;
                int i211 = -(-((i111 ^ 17) | i210));
                int i212 = (i210 & i211) + (i211 | i210);
                a = i212 % 128;
                int i213 = i212 % 2;
                O oF2 = this.c[i15].f();
                int i214 = b;
                int i215 = ((i214 | 115) << 1) - (i214 ^ 115);
                a = i215 % 128;
                int i216 = i215 % 2;
                aVarI.A(oF2, true);
                i15 = ((i15 & (-2)) | ((~i15) & 1)) + ((i15 & 1) << 1);
                int i217 = b;
                int i218 = ((i217 & 24) + (i217 | 24)) - 1;
                a = i218 % 128;
                int i219 = i218 % 2;
            }
        }
        int i66 = b;
        int i67 = i66 ^ 3;
        int i68 = (i66 & 3) << 1;
        int i69 = (i67 & i68) + (i68 | i67);
        a = i69 % 128;
        if (i69 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iP = p();
        int iB = az.b(iP);
        int i7 = ((((iB ^ 1) | (iB & 1)) << 1) - (~(-(((~iB) & 1) | (iB & (-2)))))) - 1;
        int i8 = b + 29;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return i7 % iP;
        }
        int i9 = -(-iP);
        int i10 = ((i7 ^ i9) | (i7 & i9)) << 1;
        int i11 = -((i9 & (~i7)) | ((~i9) & i7));
        return (i10 ^ i11) + ((i11 & i10) << 1);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = ((~i3) & (i2 | 109)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 ^ 23;
        int i7 = (i2 & 23) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    public final int p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 79) - (~(i2 | 79))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this.d < 0) {
            int i6 = (-2) - (((i4 ^ 68) + ((i4 & 68) << 1)) ^ (-1));
            a = i6 % 128;
            int i7 = i6 % 2;
            int length = this.c.length;
            int i8 = a;
            int i9 = (((i8 & (-82)) | ((~i8) & 81)) - (~(-(-((i8 & 81) << 1))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = a;
                int i14 = (i13 | 111) << 1;
                int i15 = -(((~i13) & 111) | (i13 & (-112)));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                int iJ = this.c[i11].f().m().j();
                int i18 = b;
                int i19 = ((i18 ^ 33) | (i18 & 33)) << 1;
                int i20 = -(((~i18) & 33) | (i18 & (-34)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i21 % 128;
                a = i22;
                int i23 = i21 % 2;
                int i24 = -(-iJ);
                i12 = (i12 | i24) + (i12 & i24);
                int i25 = i11 & 1;
                i11 = (i25 - (~((i11 ^ 1) | i25))) - 1;
                int i26 = i22 & 99;
                int i27 = i26 + ((i22 ^ 99) | i26);
                b = i27 % 128;
                int i28 = i27 % 2;
            }
            this.d = i12;
            int i29 = a;
            int i30 = ((((i29 ^ 35) | (i29 & 35)) << 1) - (~(-(((~i29) & 35) | (i29 & (-36)))))) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = this.d;
        int i33 = a;
        int i34 = (((i33 ^ 17) | (i33 & 17)) << 1) - (((~i33) & 17) | (i33 & (-18)));
        b = i34 % 128;
        if (i34 % 2 != 0) {
            return i32;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
