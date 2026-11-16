package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends O implements Iterable {
    private static int a = 0;
    private static int b = 1;
    public final i[] c;
    public final boolean d;

    public L() {
        this.c = C0270p.c;
        this.d = true;
    }

    public L(i iVar) {
        Objects.requireNonNull(iVar, "'element' cannot be null");
        this.c = new i[]{iVar};
        this.d = true;
    }

    public L(boolean z, i[] iVarArr) {
        this.c = iVarArr;
        boolean z2 = true;
        if (z || iVarArr.length < 2) {
            int i = a;
            int i2 = i & 13;
            int i3 = (i ^ 13) | i2;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            int i7 = b;
            int i8 = i7 & 93;
            int i9 = ((i7 ^ 93) | i8) << 1;
            int i10 = -((i7 | 93) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            z2 = false;
        }
        this.d = z2;
        int i14 = a + 115;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void o(i[] iVarArr) {
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = a + 125;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int length = iVarArr.length;
        if (length < 2) {
            int i6 = (-2) - ((((i4 | 60) << 1) - (i4 ^ 60)) ^ (-1));
            a = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        boolean z2 = false;
        i iVar = iVarArr[0];
        i iVar2 = iVarArr[1];
        byte[] bArrP = p(iVar);
        int i8 = a;
        int i9 = (i8 & 94) + (i8 | 94);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrP2 = p(iVar2);
        if (q(bArrP2, bArrP)) {
            int i12 = b;
            int i13 = i12 & 101;
            int i14 = i13 + ((i12 ^ 101) | i13);
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = i15 ^ 119;
            int i18 = -(-((i15 & 119) << 1));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            iVar2 = iVar;
            iVar = iVar2;
        } else {
            int i21 = a + 51;
            b = i21 % 128;
            int i22 = i21 % 2;
            bArrP2 = bArrP;
            bArrP = bArrP2;
        }
        while (i < length) {
            int i23 = b;
            int i24 = ((i23 | 78) << 1) - (i23 ^ 78);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            a = i25 % 128;
            if (i25 % 2 != 0) {
                p(iVarArr[i]);
                throw null;
            }
            i iVar3 = iVarArr[i];
            byte[] bArrP3 = p(iVar3);
            int i26 = b + 97;
            a = i26 % 128;
            int i27 = i26 % 2;
            if (!(!q(bArrP, bArrP3))) {
                int i28 = b;
                int i29 = (-2) - (((i28 ^ 76) + ((i28 & 76) << 1)) ^ (-1));
                a = i29 % 128;
                if (i29 % 2 != 0) {
                    iVarArr[i >>> 2] = iVar;
                } else {
                    iVarArr[i - 2] = iVar;
                }
                int i30 = i28 & 7;
                int i31 = (i30 - (~((i28 ^ 7) | i30))) - 1;
                int i32 = i31 % 128;
                a = i32;
                if (i31 % 2 != 0) {
                    z = false;
                    int i33 = 54 / 0;
                } else {
                    z = false;
                }
                int i34 = i32 + 99;
                b = i34 % 128;
                int i35 = i34 % 2;
                iVar = iVar2;
                iVar2 = iVar3;
                bArrP3 = bArrP;
                bArrP = bArrP3;
            } else if (!(!q(bArrP2, bArrP3))) {
                int i36 = a;
                int i37 = i36 & 5;
                int i38 = (i36 ^ 5) | i37;
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                b = i39 % 128;
                int i40 = i39 % 2;
                int i41 = i & (-2);
                int i42 = (~i41) & (i | (-2));
                int i43 = -(-(i41 << 1));
                iVarArr[(i42 & i43) + (i43 | i42)] = iVar;
                int i44 = i36 + 103;
                b = i44 % 128;
                int i45 = i44 % 2;
                int i46 = i36 & 35;
                int i47 = i46 + ((i36 ^ 35) | i46);
                b = i47 % 128;
                int i48 = i47 % 2;
                z = z2;
                iVar = iVar3;
            } else {
                int i49 = (i ^ (-1)) | i;
                int i50 = (i & i49) + (i49 | i);
                int i51 = b;
                int i52 = (i51 & 47) + (i51 | 47);
                a = i52 % 128;
                int i53 = i52 % 2;
                while (true) {
                    i50 = ((~i50) - (~(-(-(i50 << 1))))) - 1;
                    if (i50 <= 0) {
                        break;
                    }
                    int i54 = b;
                    int i55 = (i54 ^ 13) + ((i54 & 13) << 1);
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    i iVar4 = iVarArr[(i50 ^ (-1)) + (i50 << 1)];
                    byte[] bArrP4 = p(iVar4);
                    int i57 = a;
                    int i58 = i57 & 113;
                    int i59 = -(-(i57 | 113));
                    int i60 = (i58 & i59) + (i58 | i59);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    if (q(bArrP4, bArrP3)) {
                        break;
                    }
                    int i62 = b;
                    int i63 = i62 ^ 109;
                    int i64 = (i62 & 109) << 1;
                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                    a = i65 % 128;
                    if (i65 % 2 != 0) {
                        iVarArr[i50] = iVar4;
                        throw null;
                    }
                    iVarArr[i50] = iVar4;
                }
                iVarArr[i50] = iVar3;
                int i66 = b;
                int i67 = (i66 & (-112)) | ((~i66) & 111);
                int i68 = -(-((i66 & 111) << 1));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                a = i69 % 128;
                int i70 = i69 % 2;
                bArrP3 = bArrP2;
                z = false;
            }
            int i71 = i & 1;
            i = (((i | 1) & (~i71)) - (~(-(-(i71 << 1))))) - 1;
            int i72 = a + 71;
            b = i72 % 128;
            int i73 = i72 % 2;
            z2 = z;
            bArrP2 = bArrP3;
        }
        iVarArr[length - 2] = iVar;
        int i74 = (-2) - (length ^ (-1));
        int i75 = b;
        int i76 = i75 & 111;
        int i77 = i76 + ((i75 ^ 111) | i76);
        int i78 = i77 % 128;
        a = i78;
        if (i77 % 2 != 0) {
            iVarArr[i74] = iVar2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        iVarArr[i74] = iVar2;
        int i79 = (i78 & 103) + (i78 | 103);
        b = i79 % 128;
        int i80 = i79 % 2;
    }

    public static byte[] p(i iVar) {
        int i = 2 % 2;
        int i2 = b + 45;
        a = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] bArrG = iVar.f().g("DER");
            int i4 = b + 67;
            a = i4 % 128;
            int i5 = i4 % 2;
            return bArrG;
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x013f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0150  */
    /* JADX WARN: Code duplicated, block: B:44:0x0153  */
    public static boolean q(byte[] bArr, byte[] bArr2) {
        int i;
        byte b2;
        byte b3;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        boolean z = true;
        int i5 = ((i4 & (-96)) | ((~i4) & 95)) + ((i4 & 95) << 1);
        a = i5 % 128;
        boolean z2 = false;
        if (i5 % 2 != 0) {
            i = bArr[1] & 123;
            b3 = bArr2[0];
            b2 = 107;
        } else {
            i = bArr[0] & (-33);
            b2 = -33;
            b3 = bArr2[0];
        }
        int i6 = i4 & 9;
        int i7 = -(-((i4 ^ 9) | i6));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = b3 & b2;
        if (i8 % 2 == 0 ? i != i9 : i != i9) {
            if (i < i9) {
                int i10 = ((i4 | 35) << 1) - (i4 ^ 35);
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                int i13 = ((i11 | 69) << 1) - (i11 ^ 69);
                b = i13 % 128;
                int i14 = i13 % 2;
            } else {
                z = false;
            }
            int i15 = a + 81;
            b = i15 % 128;
            int i16 = i15 % 2;
            return z;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        int i17 = ((~iMin) - (~(-(-(iMin << 1))))) - 1;
        int i18 = a;
        int i19 = (i18 & 33) + (i18 | 33);
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 1;
        while (true) {
            Object obj = null;
            if (i21 >= i17) {
                int i22 = bArr[i17] & 255;
                byte b4 = bArr2[i17];
                int i23 = a;
                int i24 = ((i23 ^ 11) - (~(-(-((i23 & 11) << 1))))) - 1;
                int i25 = i24 % 128;
                b = i25;
                if (i24 % 2 == 0) {
                    int i26 = (b4 & (-29610)) | ((~b4) & 29609);
                    int i27 = b4 & 29609;
                    if (i22 <= ((i27 & i26) | (i26 ^ i27))) {
                        i2 = (-2) - (((i25 ^ 102) + ((i25 & 102) << 1)) ^ (-1));
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i28 = 2 / 5;
                        }
                    } else {
                        z = false;
                    }
                } else if (i22 <= (b4 & 255)) {
                    i2 = (-2) - (((i25 ^ 102) + ((i25 & 102) << 1)) ^ (-1));
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i29 = 2 / 5;
                    }
                } else {
                    z = false;
                }
                int i30 = a + 109;
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    return z;
                }
                throw null;
            }
            int i31 = b;
            int i32 = i31 ^ 105;
            int i33 = -(-((i31 & 105) << 1));
            int i34 = (i32 & i33) + (i32 | i33);
            int i35 = i34 % 128;
            a = i35;
            if (i34 % 2 != 0) {
                byte b5 = bArr[i21];
                byte b6 = bArr2[i21];
                obj.hashCode();
                throw null;
            }
            byte b7 = bArr[i21];
            byte b8 = bArr2[i21];
            if (b7 != b8) {
                int i36 = b7 & 255;
                int i37 = i31 ^ 85;
                int i38 = ((i31 & 85) | i37) << 1;
                int i39 = -i37;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                int i41 = b8 & 255;
                if (i40 % 2 == 0 ? i36 < i41 : i36 < i41) {
                    int i42 = ((i31 & 92) + (i31 | 92)) - 1;
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    z2 = true;
                }
                int i44 = a;
                int i45 = (i44 & (-38)) | ((~i44) & 37);
                int i46 = -(-((i44 & 37) << 1));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                b = i47 % 128;
                int i48 = i47 % 2;
                return z2;
            }
            int i49 = i21 & (-104);
            int i50 = -(-((i21 ^ (-104)) | i49));
            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
            int i52 = i51 & 105;
            int i53 = -(-((i51 ^ 105) | i52));
            i21 = ((i52 & i53) << 1) + (i52 ^ i53);
            int i54 = (((i35 ^ 107) | (i35 & 107)) << 1) - ((i35 & (-108)) | ((~i35) & 107));
            b = i54 % 128;
            int i55 = i54 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        O oF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 82) + (i2 | 82)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int length = this.c.length;
        int i6 = ((length & (-2)) | ((~length) & 1)) + ((length & 1) << 1);
        int i7 = i4 & 79;
        int i8 = (i4 | 79) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            length = ((~length) - (~(length << 1))) - 1;
            if (length < 0) {
                int i12 = a + 81;
                b = i12 % 128;
                int i13 = i12 % 2;
                return i6;
            }
            int i14 = b;
            int i15 = i14 ^ 13;
            int i16 = -(-((i14 & 13) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            i[] iVarArr = this.c;
            if (i18 != 0) {
                oF = iVarArr[length].f();
                int i19 = 78 / 0;
            } else {
                oF = iVarArr[length].f();
            }
            int i20 = -(~(-(-oF.hashCode())));
            i6 = ((i6 & i20) + (i20 | i6)) - 1;
            int i21 = b + 99;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a + 123;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        aq aqVar = new aq(this.d, this.c);
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i2 | 97) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return aqVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        i[] iVarArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = i3 + ((i2 ^ 45) | i3);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (!(!this.d)) {
            int i6 = ((i5 | 3) << 1) - (i5 ^ 3);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            iVarArr = this.c;
        } else {
            iVarArr = (i[]) this.c.clone();
            o(iVarArr);
            int i7 = b;
            int i8 = ((i7 ^ 87) | (i7 & 87)) << 1;
            int i9 = -(((~i7) & 87) | (i7 & (-88)));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        ag agVar = new ag(true, iVarArr);
        int i12 = a;
        int i13 = i12 & 47;
        int i14 = (i12 ^ 47) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        return agVar;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 38;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int length = this.c.length;
            throw null;
        }
        int length2 = this.c.length;
        if (length2 == 0) {
            int i5 = i2 + 9;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return "[]";
            }
            throw null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i6 = b;
        int i7 = (i6 & 47) + (i6 | 47);
        a = i7 % 128;
        int i8 = i7 % 2;
        stringBuffer.append('[');
        int i9 = i8 != 0 ? 1 : 0;
        while (true) {
            stringBuffer.append(this.c[i9]);
            int i10 = i9 & 1;
            i9 = (((i9 | 1) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
            if (i9 >= length2) {
                break;
            }
            stringBuffer.append(", ");
            int i11 = a;
            int i12 = i11 & 71;
            int i13 = (((i11 | 71) & (~i12)) - (~(i12 << 1))) - 1;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 / 5;
            }
        }
        int i15 = b + 121;
        a = i15 % 128;
        stringBuffer.append(i15 % 2 != 0 ? 'a' : ']');
        String string = stringBuffer.toString();
        int i16 = b;
        int i17 = i16 & 117;
        int i18 = -(-((i16 ^ 117) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0114 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(o2 instanceof L)) {
            int i6 = i4 ^ 87;
            int i7 = ((i4 & 87) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i4 & 33;
            int i12 = i11 + ((i4 ^ 33) | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        L l = (L) o2;
        int length = this.c.length;
        int i14 = i2 | 95;
        int i15 = i14 << 1;
        int i16 = -(i14 & (~(i2 & 95)));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        if (l.c.length != length) {
            int i19 = i2 ^ 63;
            int i20 = -(-((i2 & 63) << 1));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i2 & 99;
            int i24 = i23 + ((i2 ^ 99) | i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            return false;
        }
        ag agVar = (ag) n();
        ag agVar2 = (ag) l.n();
        int i26 = a;
        int i27 = ((i26 ^ 113) | (i26 & 113)) << 1;
        int i28 = -(((~i26) & 113) | (i26 & (-114)));
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = i29 % 128;
        b = i30;
        int i31 = i29 % 2;
        int i32 = i30 & 3;
        int i33 = ((i30 ^ 3) | i32) << 1;
        int i34 = -((i30 | 3) & (~i32));
        int i35 = (i33 & i34) + (i34 | i33);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 3 / 5;
        }
        int i37 = 0;
        while (i37 < length) {
            int i38 = b + 44;
            int i39 = (i38 ^ (-1)) + (i38 << 1);
            a = i39 % 128;
            if (i39 % 2 != 0) {
                agVar.c[i37].f();
                throw null;
            }
            O oF = agVar.c[i37].f();
            int i40 = b;
            int i41 = (i40 ^ 23) + ((i40 & 23) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
            O oF2 = agVar2.c[i37].f();
            int i43 = b + 6;
            int i44 = (i43 ^ (-1)) + (i43 << 1);
            a = i44 % 128;
            if (i44 % 2 != 0) {
                int i45 = 65 / 0;
                if (oF == oF2) {
                    continue;
                } else if (!oF.h(oF2)) {
                    int i46 = b;
                    int i47 = i46 & 73;
                    int i48 = (~i47) & (i46 | 73);
                    int i49 = -(-(i47 << 1));
                    int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = (i46 ^ 59) + ((i46 & 59) << 1);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    return false;
                }
            } else if (oF == oF2) {
                continue;
            } else if (!oF.h(oF2)) {
                int i410 = b;
                int i411 = i410 & 73;
                int i412 = (~i411) & (i410 | 73);
                int i413 = -(-(i411 << 1));
                int i54 = ((i412 | i413) << 1) - (i413 ^ i412);
                a = i54 % 128;
                int i55 = i54 % 2;
                int i56 = (i410 ^ 59) + ((i410 & 59) << 1);
                a = i56 % 128;
                int i57 = i56 % 2;
                return false;
            }
            int i58 = i37 & 61;
            i37 = (-2) - (((i58 + ((i37 ^ 61) | i58)) - 59) ^ (-1));
            int i59 = b;
            int i60 = i59 ^ 115;
            int i61 = ((i59 & 115) | i60) << 1;
            int i62 = -i60;
            int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
            a = i63 % 128;
            int i64 = i63 % 2;
        }
        int i65 = a;
        int i66 = (((i65 & (-62)) | ((~i65) & 61)) - (~(-(-((i65 & 61) << 1))))) - 1;
        b = i66 % 128;
        if (i66 % 2 == 0) {
            int i67 = 38 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    public L(C0270p c0270p, boolean z) {
        i[] iVarArrE;
        int i;
        Objects.requireNonNull(c0270p, "'elementVector' cannot be null");
        boolean z2 = false;
        if (!z || (i = c0270p.e) < 2) {
            iVarArrE = c0270p.e();
            int i2 = b;
            int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            int i5 = a;
            int i6 = i5 & 15;
            int i7 = (i5 | 15) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            if (i == 0) {
                int i12 = i10 & 9;
                int i13 = -(-((i10 ^ 9) | i12));
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                iVarArrE = C0270p.c;
                int i16 = a;
                int i17 = (i16 ^ 85) + ((i16 & 85) << 1);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 2 % 2;
                }
            } else {
                i[] iVarArr = new i[i];
                System.arraycopy(c0270p.d, 0, iVarArr, 0, i);
                int i19 = a;
                int i20 = (i19 & (-116)) | ((~i19) & 115);
                int i21 = -(-((i19 & 115) << 1));
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = (i19 ^ 73) + ((i19 & 73) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 2 % 2;
                iVarArrE = iVarArr;
            }
            o(iVarArrE);
            int i27 = a + 47;
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 2 % 2;
            }
        }
        this.c = iVarArrE;
        if (!z) {
            int i29 = a;
            int i30 = (i29 & (-116)) | ((~i29) & 115);
            int i31 = (i29 & 115) << 1;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            b = i32 % 128;
            int i33 = i32 % 2;
            if (iVarArrE.length < 2) {
                int i34 = (-2) - ((b + 46) ^ (-1));
                a = i34 % 128;
                int i35 = i34 % 2;
                int i36 = 2 % 2;
                z2 = true;
            }
        } else {
            int i37 = (-2) - ((b + 46) ^ (-1));
            a = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 2 % 2;
            z2 = true;
        }
        this.d = z2;
        int i40 = a;
        int i41 = (i40 & (-10)) | ((~i40) & 9);
        int i42 = -(-((i40 & 9) << 1));
        int i43 = (i41 & i42) + (i42 | i41);
        b = i43 % 128;
        int i44 = i43 % 2;
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        i[] iVarArr;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-12)) | ((~i2) & 11)) + ((i2 & 11) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        i[] iVarArr2 = this.c;
        if (iVarArr2.length <= 0) {
            int i5 = i2 | 93;
            int i6 = ((i5 << 1) - (~(-((~(i2 & 93)) & i5)))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                i[] iVarArr3 = C0270p.c;
                throw null;
            }
            iVarArr = C0270p.c;
            int i7 = b;
            int i8 = i7 & 65;
            int i9 = (i7 ^ 65) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            iVarArr = (i[]) iVarArr2.clone();
            int i12 = b + 30;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        j.bEM bem = new j.bEM(iVarArr);
        int i15 = b;
        int i16 = i15 & 57;
        int i17 = (i15 ^ 57) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        return bem;
    }
}
