package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class aj extends AbstractC0276v {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(boolean z, int i, i iVar, int i2) {
        super(z, i, iVar);
        this.f = i2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = -(-((i2 ^ 71) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = 160;
        Object obj = null;
        if (this.f == 0) {
            O oN = this.e.f().n();
            int i9 = a;
            int i10 = (i9 ^ 107) + ((i9 & 107) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            if (this.d) {
                int i12 = a;
                int i13 = i12 & 27;
                int i14 = (i12 ^ 27) | i13;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = b + 13;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    oN.l();
                    obj.hashCode();
                    throw null;
                }
                if (oN.l()) {
                    int i18 = a;
                    int i19 = i18 & 27;
                    int i110 = (i18 ^ 27) | i19;
                    int i111 = (i19 ^ i110) + ((i110 & i19) << 1);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                } else {
                    i8 = 128;
                }
            }
            aVar.z(z, i8, this.c);
            if (this.d) {
                int i20 = a;
                int i21 = (((i20 | 34) << 1) - (i20 ^ 34)) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
                aVar.w(oN.j());
                int i23 = b + 59;
                a = i23 % 128;
                int i24 = i23 % 2;
            }
            oN.i(aVar.o(), this.d);
            int i25 = b;
            int i26 = ((i25 | 95) << 1) - (i25 ^ 95);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i27 = i6 + 31;
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        int i30 = i28 + 49;
        b = i30 % 128;
        if (i30 % 2 == 0) {
            this.e.f().m();
            obj.hashCode();
            throw null;
        }
        O oM = this.e.f().m();
        if (this.d) {
            int i31 = b;
            int i32 = i31 & 3;
            int i33 = (i31 ^ 3) | i32;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            a = i34 % 128;
            int i35 = i34 % 2;
        } else {
            int i36 = a;
            int i37 = ((i36 & (-2)) | ((~i36) & 1)) + ((i36 & 1) << 1);
            b = i37 % 128;
            if (i37 % 2 == 0) {
                oM.l();
                obj.hashCode();
                throw null;
            }
            if (oM.l()) {
                int i38 = b;
                int i39 = i38 & 3;
                int i310 = (i38 ^ 3) | i39;
                int i311 = (i39 ^ i310) + ((i310 & i39) << 1);
                a = i311 % 128;
                int i312 = i311 % 2;
            } else {
                i8 = 128;
            }
        }
        aVar.z(z, i8, this.c);
        if (this.d) {
            int i40 = a;
            int i41 = (i40 ^ 70) + ((i40 & 70) << 1);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
            aVar.w(oM.j());
            int i44 = b;
            int i45 = (i44 ^ 93) + ((i44 & 93) << 1);
            a = i45 % 128;
            int i46 = i45 % 2;
        }
        aVar.i().A(oM, this.d);
        int i47 = a;
        int i48 = i47 | 25;
        int i49 = ((i48 << 1) - (~(-((~(i47 & 25)) & i48)))) - 1;
        b = i49 % 128;
        if (i49 % 2 == 0) {
            int i50 = 68 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0276v, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 61) << 1) - (~(-(i2 ^ 61)))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = (i2 ^ 109) + ((i2 & 109) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0276v, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 101;
        int i4 = (i2 & 101) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f == 0) {
            int i6 = i2 + 57;
            a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }
        O oN = super.n();
        int i8 = a;
        int i9 = i8 & 55;
        int i10 = ((i8 ^ 55) | i9) << 1;
        int i11 = -((i8 | 55) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return oN;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i;
        int i2;
        int iC;
        int iB;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-110)) | ((~i4) & 109);
        int i6 = -(-((i4 & 109) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.f == 0) {
            int iJ = this.e.f().n().j();
            int i8 = a;
            int i9 = (i8 & (-42)) | ((~i8) & 41);
            int i10 = -(-((i8 & 41) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (!(!this.d)) {
                int i13 = b;
                int i14 = (i13 ^ 125) + ((i13 & 125) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    az.c(this.c);
                    az.b(iJ);
                    obj.hashCode();
                    throw null;
                }
                int iC2 = az.c(this.c);
                int iB2 = az.b(iJ);
                int i15 = -(~iC2);
                int i16 = (((iB2 | i15) << 1) - (i15 ^ iB2)) - 1;
                int i17 = ((i16 ^ iJ) | (i16 & iJ)) << 1;
                int i18 = -((iJ & (~i16)) | ((~iJ) & i16));
                i = (i17 ^ i18) + ((i18 & i17) << 1);
                int i19 = b;
                int i20 = i19 ^ 77;
                int i21 = -(-((i19 & 77) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
            } else {
                int iC3 = az.c(this.c);
                int i24 = -(~iJ);
                int i25 = -(-(((-2) & i24) + (i24 | (-2))));
                int i26 = iC3 & i25;
                i = (((i25 | iC3) & (~i26)) - (~(i26 << 1))) - 1;
                int i27 = a;
                int i28 = i27 + 65;
                b = i28 % 128;
                int i29 = i28 % 2;
                int i30 = (i27 | 17) << 1;
                int i31 = -(i27 ^ 17);
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
            }
            int i34 = b;
            int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
            a = i35 % 128;
            if (i35 % 2 != 0) {
                int i36 = 10 / 0;
            }
            return i;
        }
        int i37 = ((i4 | 12) << 1) - (i4 ^ 12);
        int i38 = (i37 ^ (-1)) + (i37 << 1);
        int i39 = i38 % 128;
        b = i39;
        int i40 = i38 % 2;
        int i41 = i39 + 65;
        a = i41 % 128;
        int i42 = i41 % 2;
        O oM = this.e.f().m();
        int i43 = a;
        int i44 = (i43 & 3) + (i43 | 3);
        b = i44 % 128;
        if (i44 % 2 == 0) {
            oM.j();
            boolean z = this.d;
            obj.hashCode();
            throw null;
        }
        int iJ2 = oM.j();
        if (this.d) {
            int i45 = a;
            int i46 = (((i45 | 124) << 1) - (i45 ^ 124)) - 1;
            b = i46 % 128;
            if (i46 % 2 == 0) {
                iC = az.c(this.c);
                iB = az.b(iJ2);
                int i47 = 55 / 0;
            } else {
                iC = az.c(this.c);
                iB = az.b(iJ2);
            }
            int i48 = iB & iC;
            int i49 = (iC ^ iB) | i48;
            i2 = ((((i48 | i49) << 1) - (i49 ^ i48)) - (~(-(~(-(-iJ2)))))) - 2;
            int i50 = b;
            int i51 = i50 & 87;
            int i52 = (i50 | 87) & (~i51);
            int i53 = i51 << 1;
            int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
            a = i54 % 128;
            int i55 = i54 % 2;
        } else {
            int iC4 = az.c(this.c);
            int i56 = (-2) - (iJ2 ^ (-1));
            int i57 = iC4 ^ i56;
            int i58 = ((iC4 & i56) | i57) << 1;
            int i59 = -i57;
            i2 = (i58 & i59) + (i59 | i58);
            int i60 = b;
            int i61 = i60 + 1;
            a = i61 % 128;
            int i62 = i61 % 2;
            int i63 = ((i60 | 68) << 1) - (i60 ^ 68);
            int i64 = (i63 ^ (-1)) + (i63 << 1);
            a = i64 % 128;
            int i65 = i64 % 2;
        }
        int i66 = b;
        int i67 = ((i66 & (-12)) | ((~i66) & 11)) + ((i66 & 11) << 1);
        a = i67 % 128;
        int i68 = i67 % 2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0055  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 92) + ((i2 & 92) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        boolean z = false;
        if (this.f != 0) {
            int i6 = i4 & 111;
            int i7 = (i4 | 111) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 & i8) + (i8 | i7);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 25;
            a = i12 % 128;
            int i13 = i12 % 2;
            if (this.d) {
                int i14 = b;
                int i15 = i14 & 23;
                int i16 = (i15 - (~((i14 ^ 23) | i15))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                int i18 = b;
                int i19 = i18 ^ 65;
                int i20 = (((i18 & 65) | i19) << 1) - i19;
                a = i20 % 128;
                int i21 = i20 % 2;
                if (this.e.f().m().l()) {
                    int i110 = b;
                    int i111 = i110 & 23;
                    int i112 = (i111 - (~((i110 ^ 23) | i111))) - 1;
                    a = i112 % 128;
                    int i113 = i112 % 2;
                    z = true;
                }
            }
            int i22 = a;
            int i23 = ((i22 & 2) + (i22 | 2)) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            return z;
        }
        if (!(!this.d)) {
            int i25 = a;
            int i26 = ((((i25 ^ 95) | (i25 & 95)) << 1) - (~(-(((~i25) & 95) | (i25 & (-96)))))) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
            z = true;
        } else {
            int i28 = b;
            int i29 = i28 & 71;
            int i30 = (((i28 ^ 71) | i29) << 1) - ((i28 | 71) & (~i29));
            a = i30 % 128;
            int i31 = i30 % 2;
            O oN = this.e.f().n();
            if (i31 != 0) {
                int i32 = 98 / 0;
            }
            if (oN.l()) {
                int i210 = a;
                int i211 = ((((i210 ^ 95) | (i210 & 95)) << 1) - (~(-(((~i210) & 95) | (i210 & (-96)))))) - 1;
                b = i211 % 128;
                int i212 = i211 % 2;
                z = true;
            }
        }
        int i33 = a;
        int i34 = i33 & 49;
        int i35 = ((((i33 ^ 49) | i34) << 1) - (~(-((i33 | 49) & (~i34))))) - 1;
        b = i35 % 128;
        if (i35 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
