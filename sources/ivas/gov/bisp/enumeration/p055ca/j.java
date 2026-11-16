package ivas.gov.bisp.enumeration.p055ca;

import ivas.gov.bisp.enumeration.cB.t;
import ivas.gov.bisp.enumeration.cN.e;
import ivas.gov.bisp.enumeration.p063ci.ae;
import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements PrivateKey {
    private static int a = 1;
    private static int b;
    public short[][] c;
    public short[] d;
    public short[][] e;
    public t[] f;
    public short[] g;
    public int[] h;

    public j(e eVar) {
        short[][] sArr = eVar.a;
        short[] sArr2 = eVar.b;
        short[][] sArr3 = eVar.c;
        int i = b;
        int i2 = i & 61;
        int i3 = (i2 - (~((i ^ 61) | i2))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            short[] sArr4 = eVar.e;
            int[] iArr = eVar.d;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        short[] sArr5 = eVar.e;
        int[] iArr2 = eVar.d;
        t[] tVarArr = eVar.f;
        this.c = sArr;
        this.d = sArr2;
        this.e = sArr3;
        this.g = sArr5;
        this.h = iArr2;
        this.f = tVarArr;
    }

    public j(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, t[] tVarArr) {
        this.c = sArr;
        this.d = sArr2;
        this.e = sArr3;
        this.g = sArr4;
        this.h = iArr;
        this.f = tVarArr;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = (i2 & 71) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return "Rainbow";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = ((i2 ^ 101) | i3) << 1;
        int i5 = -((~i3) & (i2 | 101));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 ^ 67;
        int i9 = (i2 & 67) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return "PKCS#8";
    }

    public int hashCode() {
        int iJ;
        short[] sArr;
        int i;
        t tVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 19;
        int i5 = ((i3 & 19) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int length = this.f.length;
            ivas.gov.bisp.enumeration.p064cj.j.j(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int length2 = this.f.length;
        int iJ2 = ivas.gov.bisp.enumeration.p064cj.j.j(this.c);
        short[] sArr2 = this.d;
        int i8 = a;
        int i9 = i8 & 85;
        int i10 = (i8 | 85) & (~i9);
        int i11 = i9 << 1;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ivas.gov.bisp.enumeration.p064cj.j.i(sArr2);
        short[][] sArr3 = this.e;
        if (i13 != 0) {
            iJ = ivas.gov.bisp.enumeration.p064cj.j.j(sArr3);
            sArr = this.g;
            int i15 = 89 / 0;
        } else {
            iJ = ivas.gov.bisp.enumeration.p064cj.j.j(sArr3);
            sArr = this.g;
        }
        int i16 = ivas.gov.bisp.enumeration.p064cj.j.i(sArr);
        int iG = ivas.gov.bisp.enumeration.p064cj.j.g(this.h);
        int i17 = a;
        int i18 = ((i17 ^ 43) | (i17 & 43)) << 1;
        int i19 = -(((~i17) & 43) | (i17 & (-44)));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = i20 % 128;
        b = i21;
        int i22 = i20 % 2;
        int i23 = -(-(length2 * 37));
        int i24 = iJ2 & i23;
        int i25 = (i24 + ((i23 ^ iJ2) | i24)) * 37;
        int i26 = -(-(((i14 & i25) + (i14 | i25)) * 37));
        int i27 = ((~i26) & iJ) | ((~iJ) & i26);
        int i28 = (i26 & iJ) << 1;
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = (-2) - ((i21 + 124) ^ (-1));
        a = i30 % 128;
        int i31 = i30 % 2;
        int i32 = i29 * 37;
        int i33 = i16 ^ i32;
        int i34 = ((i16 & i32) | i33) << 1;
        int i35 = -i33;
        int i36 = -(-((((i34 | i35) << 1) - (i35 ^ i34)) * 37));
        int i37 = (iG ^ i36) + ((i36 & iG) << 1);
        int length3 = this.f.length;
        int i38 = ((~length3) - (~(-(-(length3 << 1))))) - 1;
        int i39 = (i21 & (-32)) | ((~i21) & 31);
        int i40 = (i21 & 31) << 1;
        int i41 = i39 & i40;
        int i42 = i39 | i40;
        while (true) {
            int i43 = i41 + i42;
            a = i43 % 128;
            int i44 = i43 % 2;
            if (i38 < 0) {
                int i45 = (-2) - ((b + 88) ^ (-1));
                a = i45 % 128;
                int i46 = i45 % 2;
                return i37;
            }
            int i47 = a;
            int i48 = ((i47 ^ 41) | (i47 & 41)) << 1;
            int i49 = -(((~i47) & 41) | (i47 & (-42)));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            b = i50 % 128;
            if (i50 % 2 != 0) {
                i = i37 << 15;
                tVar = this.f[i38];
            } else {
                i = i37 * 37;
                tVar = this.f[i38];
            }
            int iHashCode = tVar.hashCode();
            int i51 = b;
            int i52 = (i51 ^ 91) + ((i51 & 91) << 1);
            a = i52 % 128;
            int i53 = i52 % 2;
            i37 = (-2) - ((i - (~iHashCode)) ^ (-1));
            i38 = (i38 << 1) + (~i38);
            int i54 = i51 & 57;
            int i55 = i51 | 57;
            i41 = i54 ^ i55;
            i42 = (i54 & i55) << 1;
        }
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        byte[] encoded = null;
        try {
            c cVar = new c(new ivas.gov.bisp.enumeration.p069co.j(P.b, ae.c), new ivas.gov.bisp.enumeration.p076cv.t(this.c, this.d, this.e, this.g, this.h, this.f), null, null);
            int i2 = (-2) - ((a + 6) ^ (-1));
            b = i2 % 128;
            if (i2 % 2 != 0) {
                cVar.getEncoded();
                throw null;
            }
            encoded = cVar.getEncoded();
            int i3 = a;
            int i4 = (i3 & 23) + (i3 | 23);
            b = i4 % 128;
            int i5 = i4 % 2;
            return encoded;
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0154  */
    /* JADX WARN: Code duplicated, block: B:44:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x0191  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        int i2;
        boolean zEquals;
        short[] sArr;
        short[] sArr2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 97) - (~((i4 & 97) << 1))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (obj != null) {
            int i8 = i6 + 43;
            int i9 = i8 % 128;
            a = i9;
            Object obj2 = null;
            if (i8 % 2 == 0) {
                boolean z2 = obj instanceof j;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                short[][] sArr3 = this.c;
                int i10 = i9 & 19;
                int i11 = -(-(i9 | 19));
                int i12 = (i10 & i11) + (i10 | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                if (r.I(sArr3, jVar.c)) {
                    int i14 = a;
                    int i15 = ((i14 ^ 82) + ((i14 & 82) << 1)) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    short[][] sArr4 = this.e;
                    short[][] sArr5 = jVar.e;
                    int i17 = ((i14 ^ 39) | (i14 & 39)) << 1;
                    int i18 = -(((~i14) & 39) | (i14 & (-40)));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        r.I(sArr4, sArr5);
                        throw null;
                    }
                    if (r.I(sArr4, sArr5)) {
                        int i20 = a;
                        int i21 = i20 & 49;
                        int i22 = ((i20 | 49) & (~i21)) + (i21 << 1);
                        int i23 = i22 % 128;
                        b = i23;
                        int i24 = i22 % 2;
                        int i25 = i23 + 23;
                        a = i25 % 128;
                        if (i25 % 2 == 0) {
                            int i26 = 2 / 2;
                        }
                        z = true;
                    } else {
                        int i27 = a;
                        int i28 = (-2) - ((((i27 | 70) << 1) - (i27 ^ 70)) ^ (-1));
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        z = false;
                    }
                } else {
                    int i210 = a;
                    int i211 = (-2) - ((((i210 | 70) << 1) - (i210 ^ 70)) ^ (-1));
                    b = i211 % 128;
                    int i212 = i211 % 2;
                    z = false;
                }
                if (z) {
                    int i30 = a;
                    int i31 = (i30 & 35) + (i30 | 35);
                    int i32 = i31 % 128;
                    b = i32;
                    int i33 = i31 % 2;
                    short[] sArr6 = this.d;
                    short[] sArr7 = jVar.d;
                    int i34 = (-2) - ((((i32 | 24) << 1) - (i32 ^ 24)) ^ (-1));
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    if (!r.H(sArr6, sArr7)) {
                        int i36 = b;
                        i = (((i36 | 20) << 1) - (i36 ^ 20)) - 1;
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i37 = 5 % 4;
                        }
                    } else {
                        int i38 = b;
                        int i39 = i38 & 99;
                        int i40 = (i39 - (~((i38 ^ 99) | i39))) - 1;
                        int i41 = i40 % 128;
                        a = i41;
                        int i42 = i40 % 2;
                        int i43 = i41 + 87;
                        int i44 = i43 % 128;
                        b = i44;
                        if (i43 % 2 != 0) {
                            sArr = this.g;
                            sArr2 = jVar.g;
                            int i45 = 1 / 0;
                        } else {
                            sArr = this.g;
                            sArr2 = jVar.g;
                        }
                        int i46 = i44 & 107;
                        int i47 = i46 + ((i44 ^ 107) | i46);
                        a = i47 % 128;
                        if (i47 % 2 == 0) {
                            r.H(sArr, sArr2);
                            throw null;
                        }
                        if (r.H(sArr, sArr2)) {
                            int i48 = a;
                            int i49 = i48 + 109;
                            b = i49 % 128;
                            int i50 = i49 % 2;
                            int i51 = i48 + 9;
                            b = i51 % 128;
                            int i52 = i51 % 2;
                            int[] iArr = this.h;
                            int[] iArr2 = jVar.h;
                            int i53 = ((i48 | 87) << 1) - (i48 ^ 87);
                            b = i53 % 128;
                            if (i53 % 2 != 0) {
                                Arrays.equals(iArr, iArr2);
                                throw null;
                            }
                            if (Arrays.equals(iArr, iArr2)) {
                                int i54 = b;
                                int i55 = i54 & 39;
                                int i56 = (i54 ^ 39) | i55;
                                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                int i58 = i57 % 128;
                                a = i58;
                                int i59 = i57 % 2;
                                int i60 = (((i58 & (-26)) | ((~i58) & 25)) - (~((i58 & 25) << 1))) - 1;
                                b = i60 % 128;
                                int i61 = i60 % 2;
                                zEquals = true;
                            }
                        }
                        int i62 = a;
                        i2 = (((i62 & (-70)) | ((~i62) & 69)) - (~((i62 & 69) << 1))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i63 = 5 / 3;
                        }
                        zEquals = false;
                    }
                    int i64 = b;
                    int i65 = (i64 & (-34)) | ((~i64) & 33);
                    int i66 = (i64 & 33) << 1;
                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    int i69 = a;
                    i2 = (((i69 & (-70)) | ((~i69) & 69)) - (~((i69 & 69) << 1))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i610 = 5 / 3;
                    }
                    zEquals = false;
                } else {
                    int i310 = b;
                    i = (((i310 | 20) << 1) - (i310 ^ 20)) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i311 = 5 % 4;
                    }
                    int i611 = b;
                    int i612 = (i611 & (-34)) | ((~i611) & 33);
                    int i613 = (i611 & 33) << 1;
                    int i614 = ((i612 | i613) << 1) - (i613 ^ i612);
                    a = i614 % 128;
                    int i615 = i614 % 2;
                    int i616 = a;
                    i2 = (((i616 & (-70)) | ((~i616) & 69)) - (~((i616 & 69) << 1))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i617 = 5 / 3;
                    }
                    zEquals = false;
                }
                t[] tVarArr = this.f;
                int length = tVarArr.length;
                t[] tVarArr2 = jVar.f;
                int i70 = b;
                int i71 = (-2) - (((i70 & 124) + (i70 | 124)) ^ (-1));
                a = i71 % 128;
                int i72 = i71 % 2;
                if (length != tVarArr2.length) {
                    int i73 = i70 & 37;
                    int i74 = -(-((i70 ^ 37) | i73));
                    int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                    int i76 = i75 % 128;
                    a = i76;
                    int i77 = i75 % 2;
                    int i78 = i76 & 15;
                    int i79 = ((i76 | 15) & (~i78)) + (i78 << 1);
                    b = i79 % 128;
                    int i80 = i79 % 2;
                    return false;
                }
                int length2 = tVarArr.length;
                int i81 = ((length2 ^ (-1)) - (~(length2 << 1))) - 1;
                int i82 = i70 & 23;
                int i83 = ((((i70 ^ 23) | i82) << 1) - (~(-((~i82) & (i70 | 23))))) - 1;
                a = i83 % 128;
                int i84 = i83 % 2;
                while (i81 >= 0) {
                    int i85 = b;
                    int i86 = (i85 & (-60)) | ((~i85) & 59);
                    int i87 = -(-((i85 & 59) << 1));
                    int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                    a = i88 % 128;
                    if (i88 % 2 == 0) {
                        t tVar = this.f[i81];
                        t[] tVarArr3 = jVar.f;
                        throw null;
                    }
                    zEquals &= this.f[i81].equals(jVar.f[i81]);
                    int i89 = i81 & (-39);
                    int i90 = i81 | (-39);
                    int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                    int i92 = i91 & 38;
                    int i93 = ((i91 ^ 38) | i92) << 1;
                    int i94 = -((~i92) & (i91 | 38));
                    i81 = (i93 ^ i94) + ((i93 & i94) << 1);
                    int i95 = a;
                    int i96 = ((((i95 ^ 119) | (i95 & 119)) << 1) - (~(-(((~i95) & 119) | (i95 & (-120)))))) - 1;
                    b = i96 % 128;
                    int i97 = i96 % 2;
                }
                int i98 = a;
                int i99 = i98 & 3;
                int i100 = (i99 - (~((i98 ^ 3) | i99))) - 1;
                b = i100 % 128;
                if (i100 % 2 == 0) {
                    return zEquals;
                }
                obj2.hashCode();
                throw null;
            }
        }
        int i101 = i6 + 1;
        a = i101 % 128;
        int i102 = i101 % 2;
        return false;
    }
}
