package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class aq extends L {
    private static int a = 1;
    private static int b;
    public int e;

    public aq() {
        this.e = -1;
    }

    public aq(i iVar) {
        super(iVar);
        this.e = -1;
    }

    public aq(C0270p c0270p) {
        super(c0270p, false);
        this.e = -1;
    }

    public aq(boolean z, i[] iVarArr) {
        super(z, iVarArr);
        this.e = -1;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0181  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d6 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        i[] iVarArr;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = ((i7 ^ 112) + ((i7 & 112) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (!(!z)) {
            aVar.r(49);
            int i9 = a;
            int i10 = ((i9 ^ 25) | (i9 & 25)) << 1;
            int i11 = -(((~i9) & 25) | (i9 & (-26)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        a aVarI = aVar.i();
        int length = this.c.length;
        int i14 = a;
        int i15 = ((((i14 ^ 73) | (i14 & 73)) << 1) - (~(-(((~i14) & 73) | (i14 & (-74)))))) - 1;
        int i16 = i15 % 128;
        b = i16;
        int i17 = 0;
        if (i15 % 2 == 0 ? this.e >= 0 : this.e >= 0) {
            aVar.w(r());
            int i18 = b;
            int i19 = i18 & 103;
            int i20 = ((i18 ^ 103) | i19) << 1;
            int i21 = -((i18 | 103) & (~i19));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            i3 = 0;
            while (i3 < length) {
                int i24 = b;
                int i25 = (i24 ^ 53) + ((i24 & 53) << 1);
                a = i25 % 128;
                i4 = i25 % 2;
                iVarArr = this.c;
                if (i4 == 0) {
                    aVarI.A(iVarArr[i3].f(), false);
                } else {
                    aVarI.A(iVarArr[i3].f(), true);
                }
                int i26 = b;
                i5 = (((i26 | 112) << 1) - (i26 ^ 112)) - 1;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i27 = i3 ^ 74;
                    i3 = (((i3 & 74) | i27) << 1) - i27;
                } else {
                    i3 = ((i3 & (-2)) | ((~i3) & 1)) + ((i3 & 1) << 1);
                }
            }
        } else if (length <= 16) {
            int i28 = i16 | 83;
            int i29 = (i28 << 1) - (i28 & (~(i16 & 83)));
            a = i29 % 128;
            int i30 = i29 % 2;
            O[] oArr = new O[length];
            int i31 = i16 ^ 125;
            int i32 = ((i16 & 125) | i31) << 1;
            int i33 = -i31;
            int i34 = (i32 & i33) + (i32 | i33);
            a = i34 % 128;
            int i35 = i34 % 2;
            int i36 = 0;
            int i37 = 0;
            while (i36 < length) {
                int i38 = b;
                int i39 = (i38 & (-98)) | ((~i38) & 97);
                int i40 = (i38 & 97) << 1;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                a = i41 % 128;
                int i42 = i41 % 2;
                O oM = this.c[i36].f().m();
                int i43 = a + 17;
                b = i43 % 128;
                if (i43 % 2 != 0) {
                    oArr[i36] = oM;
                    oM.j();
                    throw null;
                }
                oArr[i36] = oM;
                int iJ = oM.j();
                int i44 = a + 79;
                b = i44 % 128;
                if (i44 % 2 != 0) {
                    i37 /= iJ;
                    int i45 = i36 + 131;
                    i36 = (i45 ^ (-75)) + ((i45 & (-75)) << 1);
                } else {
                    int i46 = (i37 ^ iJ) + ((i37 & iJ) << 1);
                    int i47 = i36 & 28;
                    int i48 = -(-(i36 | 28));
                    int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                    i36 = (-2) - (((i49 & (-26)) + (i49 | (-26))) ^ (-1));
                    i37 = i46;
                }
            }
            this.e = i37;
            aVar.w(i37);
            int i50 = b;
            int i51 = i50 ^ 81;
            int i52 = ((i50 & 81) | i51) << 1;
            int i53 = -i51;
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            int i55 = i54 % 128;
            a = i55;
            if (i54 % 2 == 0) {
                int i56 = 23 / 0;
            }
            int i57 = i55 & 115;
            int i58 = (((i55 | 115) & (~i57)) - (~(i57 << 1))) - 1;
            b = i58 % 128;
            int i59 = i58 % 2;
            while (i17 < length) {
                int i60 = a;
                int i61 = i60 & 95;
                int i62 = -(-(i60 | 95));
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                b = i63 % 128;
                if (i63 % 2 != 0) {
                    aVarI.A(oArr[i17], true);
                    int i64 = i17 & 130;
                    int i65 = (((i17 ^ 130) | i64) << 1) - ((~i64) & (i17 | 130));
                    int i66 = i65 & (-54);
                    int i67 = -(-((i65 ^ (-54)) | i66));
                    i = i66 & i67;
                    i2 = i67 | i66;
                } else {
                    aVarI.A(oArr[i17], true);
                    int i68 = i17 ^ 75;
                    int i69 = ((i17 & 75) | i68) << 1;
                    int i70 = -i68;
                    int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                    int i72 = i71 ^ (-74);
                    int i73 = -(-((i71 & (-74)) << 1));
                    i = i72 ^ i73;
                    i2 = (i72 & i73) << 1;
                }
                i17 = i + i2;
                int i74 = a;
                int i75 = ((i74 & (-12)) | ((~i74) & 11)) + ((i74 & 11) << 1);
                b = i75 % 128;
                int i76 = i75 % 2;
            }
        } else {
            aVar.w(r());
            int i110 = b;
            int i111 = i110 & 103;
            int i210 = ((i110 ^ 103) | i111) << 1;
            int i211 = -((i110 | 103) & (~i111));
            int i212 = (i210 & i211) + (i211 | i210);
            a = i212 % 128;
            int i213 = i212 % 2;
            i3 = 0;
            while (i3 < length) {
                int i214 = b;
                int i215 = (i214 ^ 53) + ((i214 & 53) << 1);
                a = i215 % 128;
                i4 = i215 % 2;
                iVarArr = this.c;
                if (i4 == 0) {
                    aVarI.A(iVarArr[i3].f(), false);
                } else {
                    aVarI.A(iVarArr[i3].f(), true);
                }
                int i216 = b;
                i5 = (((i216 | 112) << 1) - (i216 ^ 112)) - 1;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i217 = i3 ^ 74;
                    i3 = (((i3 & 74) | i217) << 1) - i217;
                } else {
                    i3 = ((i3 & (-2)) | ((~i3) & 1)) + ((i3 & 1) << 1);
                }
            }
        }
        int i77 = (-2) - ((b + 12) ^ (-1));
        a = i77 % 128;
        if (i77 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = ((i2 ^ 9) | i3) << 1;
        int i5 = -((i2 | 9) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iR = r();
        int iB = az.b(iR);
        int i8 = ((((iB ^ 1) | (iB & 1)) << 1) - (~(-(((~iB) & 1) | (iB & (-2)))))) - 1;
        int i9 = -(~(-(-iR)));
        int i10 = (-2) - (((i8 ^ i9) + ((i9 & i8) << 1)) ^ (-1));
        int i11 = a;
        int i12 = i11 & 111;
        int i13 = (i11 ^ 111) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        return i10;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.L, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 45) + (i2 | 45);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 121;
        int i6 = -(-((i2 ^ 121) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    public final int r() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 5;
        int i5 = (~i4) & (i3 | 5);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (this.e < 0) {
            int i8 = i3 + 85;
            a = i8 % 128;
            int length = i8 % 2 == 0 ? this.c.length : this.c.length;
            int i9 = a;
            int i10 = ((i9 ^ 5) | (i9 & 5)) << 1;
            int i11 = -(((~i9) & 5) | (i9 & (-6)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int i16 = b + 125;
                a = i16 % 128;
                int i17 = i16 % 2;
                O oM = this.c[i14].f().m();
                int i18 = a;
                int i19 = (i18 & (-72)) | ((~i18) & 71);
                int i20 = -(-((i18 & 71) << 1));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                int i22 = i21 % 2;
                int iJ = oM.j();
                if (i22 != 0) {
                    i15 /= iJ;
                    int i23 = i14 & 116;
                    int i24 = ((i14 ^ 116) | i23) << 1;
                    int i25 = -((i14 | 116) & (~i23));
                    i = ((i24 | i25) << 1) - (i25 ^ i24);
                } else {
                    int i26 = -(-iJ);
                    int i27 = i15 & i26;
                    int i28 = ((i15 ^ i26) | i27) << 1;
                    int i29 = -((i15 | i26) & (~i27));
                    int i30 = (i28 & i29) + (i29 | i28);
                    int i31 = i14 & 1;
                    int i32 = (i14 | 1) & (~i31);
                    int i33 = i31 << 1;
                    i = (i32 ^ i33) + ((i32 & i33) << 1);
                    i15 = i30;
                }
                i14 = i;
            }
            this.e = i15;
            int i34 = a;
            int i35 = ((i34 | 3) << 1) - (i34 ^ 3);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = this.e;
        int i38 = a;
        int i39 = (i38 ^ 93) + ((i38 & 93) << 1);
        b = i39 % 128;
        int i40 = i39 % 2;
        return i37;
    }
}
