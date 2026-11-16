package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0266l extends FilterInputStream {
    private static int a = 1;
    private static int b;
    public final int c;
    public final boolean d;
    public final byte[][] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0266l(InputStream inputStream) {
        super(inputStream);
        int iD = az.d(inputStream);
        this.c = iD;
        this.d = false;
        this.e = new byte[11][];
    }

    public static int g(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 83;
        int i8 = i7 + ((i6 ^ 83) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = inputStream.read();
        if (i10 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        int i11 = a;
        int i12 = i11 & 35;
        int i13 = ((i11 ^ 35) | i12) << 1;
        int i14 = -((~i12) & (i11 | 35));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        if (i10 == 128) {
            int i17 = (i11 & (-64)) | ((~i11) & 63);
            int i18 = -(-((i11 & 63) << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = i20 + 94;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            return -1;
        }
        if (i10 > 127) {
            int i25 = ((i11 ^ 19) | (i11 & 19)) << 1;
            int i26 = -(((~i11) & 19) | (i11 & (-20)));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i27 % 128;
            b = i28;
            if (i27 % 2 == 0 ? (i2 = i10 & 127) > 4 : (i2 = i10 ^ 4) > 4) {
                throw new IOException(j.o("DER length more than 4 bytes: ", i2));
            }
            int i29 = i28 & 19;
            int i30 = ((i28 | 19) & (~i29)) + (i29 << 1);
            a = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            int i33 = 0;
            while (i33 < i2) {
                int i34 = b;
                int i35 = i34 | 107;
                int i36 = i35 << 1;
                int i37 = -((~(i34 & 107)) & i35);
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                a = i38 % 128;
                int i39 = i38 % 2;
                int i40 = inputStream.read();
                if (i40 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                int i41 = a;
                int i42 = (i41 & 71) + (i41 | 71);
                b = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = i32 & (-75);
                    int i44 = (i43 - (~(-(-((i32 ^ (-75)) | i43))))) - 1;
                    int i45 = -i40;
                    int i46 = (i44 | i45) << 1;
                    int i47 = -(i45 ^ i44);
                    i3 = (i46 & i47) + (i47 | i46);
                    int i48 = i33 & 25;
                    int i49 = (i33 ^ 25) | i48;
                    i4 = (i48 & i49) + (i48 | i49);
                } else {
                    int i50 = i32 << 8;
                    i3 = (i50 & i40) + (i50 | i40);
                    int i51 = i33 & 1;
                    int i52 = ((i33 ^ 1) | i51) << 1;
                    int i53 = -((i33 | 1) & (~i51));
                    i4 = ((i52 | i53) << 1) - (i52 ^ i53);
                }
                i33 = i4;
                i32 = i3;
            }
            if (i32 < 0) {
                throw new IOException("corrupted stream - negative length found");
            }
            int i54 = b;
            int i55 = (i54 | 49) << 1;
            int i56 = -(((~i54) & 49) | (i54 & (-50)));
            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
            int i58 = i57 % 128;
            a = i58;
            int i59 = i57 % 2;
            if (i32 >= i) {
                int i60 = i58 & 69;
                int i61 = ((i58 ^ 69) | i60) << 1;
                int i62 = -((i58 | 69) & (~i60));
                int i63 = (i61 & i62) + (i62 | i61);
                b = i63 % 128;
                if (i63 % 2 != 0) {
                    throw null;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("corrupted stream - out of bounds length found: ");
                    int i64 = a;
                    int i65 = (i64 ^ 105) + ((i64 & 105) << 1);
                    b = i65 % 128;
                    int i66 = i65 % 2;
                    sb.append(i32);
                    sb.append(" >= ");
                    sb.append(i);
                    throw new IOException(sb.toString());
                }
            }
            int i67 = b;
            int i68 = (i67 & (-50)) | ((~i67) & 49);
            int i69 = (i67 & 49) << 1;
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            a = i70 % 128;
            int i71 = i70 % 2;
            i10 = i32;
        }
        int i72 = a;
        int i73 = i72 & 23;
        int i74 = i72 | 23;
        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
        b = i75 % 128;
        int i76 = i75 % 2;
        return i10;
    }

    public static int h(InputStream inputStream, int i) throws IOException {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 95;
        int i6 = ((i4 | 95) & (~i5)) + (i5 << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = i & 31;
        if (i9 == 31) {
            int i10 = (i7 ^ 68) + ((i7 & 68) << 1);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = inputStream.read();
            if ((i13 & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            int i14 = 0;
            while (i13 >= 0) {
                int i15 = a;
                int i16 = i15 & 125;
                int i17 = -(-(i15 | 125));
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                if ((i13 & 128) == 0) {
                    break;
                }
                int i20 = ((i15 ^ 39) | (i15 & 39)) << 1;
                int i21 = -(((~i15) & 39) | (i15 & (-40)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i13 & 127;
                i14 = ((i24 & i14) | (((~i24) & i14) | ((~i14) & i24))) << 7;
                i13 = inputStream.read();
                int i25 = a;
                int i26 = i25 ^ 105;
                int i27 = ((i25 & 105) | i26) << 1;
                int i28 = -i26;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
            if (i13 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            int i31 = a;
            int i32 = i31 ^ 13;
            int i33 = -(-((i31 & 13) << 1));
            int i34 = (i32 & i33) + (i33 | i32);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                i2 = (~(i13 & 44)) & (i13 | 44) & i14;
            } else {
                int i35 = i13 & 127;
                i2 = (i35 & i14) | (i14 ^ i35);
            }
            i9 = i2;
        }
        int i36 = b;
        int i37 = i36 & 109;
        int i38 = (i36 ^ 109) | i37;
        int i39 = (i37 & i38) + (i38 | i37);
        a = i39 % 128;
        int i40 = i39 % 2;
        return i9;
    }

    public C0266l(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.c = length;
        this.d = false;
        this.e = new byte[11][];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public O i(int i, int i2, int i3) throws IOException {
        boolean z;
        Q q;
        L l;
        i iVarD;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 111;
        int i7 = (i5 ^ 111) | i6;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            int i10 = i & 82;
            if (((i10 | (i ^ 82)) & (~i10)) != 0) {
                int i11 = ((i9 ^ 23) - (~(-(-((i9 & 23) << 1))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                int i13 = (((i5 | 105) << 1) - (~(-(i5 ^ 105)))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
        } else if ((i & 32) != 0) {
            int i15 = ((i9 ^ 23) - (~(-(-((i9 & 23) << 1))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        } else {
            int i17 = (((i5 | 105) << 1) - (~(-(i5 ^ 105)))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            z = false;
        }
        C0263g c0263g = new C0263g(this, i3, this.c);
        int i19 = a;
        int i20 = i19 & 77;
        int i21 = (i19 ^ 77) | i20;
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        b = i22 % 128;
        if (i22 % 2 == 0 ? (i & 64) != 0 : ((~(i & 35)) & (i | 35)) != 0) {
            H h = new H(z, i2, c0263g.d());
            int i23 = a;
            int i24 = ((i23 ^ 43) | (i23 & 43)) << 1;
            int i25 = -(((~i23) & 43) | (i23 & (-44)));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            return h;
        }
        if ((i & 128) != 0) {
            O oE = new R(c0263g).e(z, i2);
            int i28 = a;
            int i29 = (i28 ^ 113) + ((i28 & 113) << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
            return oE;
        }
        if (!z) {
            O oE2 = e(i2, c0263g, this.e);
            int i31 = b;
            int i32 = (i31 & 84) + (i31 | 84);
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 65 / 0;
            }
            return oE2;
        }
        int i35 = i19 & 125;
        int i36 = -(-((i19 ^ 125) | i35));
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int i38 = i37 % 128;
        b = i38;
        Object obj = null;
        if (i37 % 2 == 0 ? i2 == 4 : i2 == 5) {
            C0270p c0270pK = k(c0263g);
            int i39 = c0270pK.e;
            int i40 = b;
            int i41 = (17 & (~i40)) | (i40 & (-18));
            int i42 = -(-((i40 & 17) << 1));
            int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            M[] mArr = new M[i39];
            int i45 = (((i40 | 91) << 1) - (~(-(((~i40) & 91) | (i40 & (-92)))))) - 1;
            a = i45 % 128;
            if (i45 % 2 == 0) {
                int i46 = 3 % 4;
            }
            int i47 = 0;
            while (i47 != i39) {
                int i48 = b;
                int i49 = ((i48 | 69) << 1) - (i48 ^ 69);
                a = i49 % 128;
                if (i49 % 2 == 0) {
                    iVarD = c0270pK.d(i47);
                    int i50 = 64 / 0;
                    if (!(iVarD instanceof M)) {
                        StringBuilder sbW = j.w("unknown object encountered in constructed OCTET STRING: ");
                        sbW.append(iVarD.getClass());
                        throw new P(sbW.toString());
                    }
                    mArr[i47] = (M) iVarD;
                    int i51 = (i47 & (-84)) + (i47 | (-84));
                    i47 = (i51 & 85) + (i51 | 85);
                    int i52 = b;
                    int i53 = ((i52 & 117) - (~(-(-(i52 | 117))))) - 1;
                    a = i53 % 128;
                    int i54 = i53 % 2;
                } else {
                    iVarD = c0270pK.d(i47);
                    if (!(iVarD instanceof M)) {
                        StringBuilder sbW2 = j.w("unknown object encountered in constructed OCTET STRING: ");
                        sbW2.append(iVarD.getClass());
                        throw new P(sbW2.toString());
                    }
                    mArr[i47] = (M) iVarD;
                    int i55 = (i47 & (-84)) + (i47 | (-84));
                    i47 = (i55 & 85) + (i55 | 85);
                    int i56 = b;
                    int i57 = ((i56 & 117) - (~(-(-(i56 | 117))))) - 1;
                    a = i57 % 128;
                    int i58 = i57 % 2;
                }
            }
            C0273s c0273s = new C0273s(mArr);
            int i59 = a;
            int i60 = i59 ^ 57;
            int i61 = ((i59 & 57) | i60) << 1;
            int i62 = -i60;
            int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
            b = i63 % 128;
            if (i63 % 2 == 0) {
                return c0273s;
            }
            obj.hashCode();
            throw null;
        }
        int i64 = ((i38 ^ 93) - (~(-(-((i38 & 93) << 1))))) - 1;
        a = i64 % 128;
        int i65 = i64 % 2;
        if (i2 == 8) {
            an anVar = new an(k(c0263g));
            int i66 = a;
            int i67 = i66 & 29;
            int i68 = (i66 ^ 29) | i67;
            int i69 = (i67 & i68) + (i68 | i67);
            b = i69 % 128;
            int i70 = i69 % 2;
            return anVar;
        }
        int i71 = i38 & 23;
        int i72 = i71 + ((i38 ^ 23) | i71);
        a = i72 % 128;
        int i73 = i72 % 2;
        if (i2 == 16) {
            if (this.d) {
                aw awVar = new aw(c0263g.d());
                int i74 = b;
                int i75 = ((i74 & 2) + (i74 | 2)) - 1;
                a = i75 % 128;
                if (i75 % 2 == 0) {
                    int i76 = 35 / 0;
                }
                return awVar;
            }
            C0270p c0270pK2 = k(c0263g);
            Q q2 = C0262f.c;
            if (c0270pK2.e <= 0) {
                int i77 = a;
                int i78 = i77 & 7;
                int i79 = -(-((i77 ^ 7) | i78));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                b = i80 % 128;
                if (i80 % 2 != 0) {
                    Q q3 = C0262f.c;
                    obj.hashCode();
                    throw null;
                }
                q = C0262f.c;
            } else {
                ar arVar = new ar(c0270pK2);
                int i81 = a;
                int i82 = i81 & 45;
                int i83 = ((i81 ^ 45) | i82) << 1;
                int i84 = -((i81 | 45) & (~i82));
                int i85 = (i83 & i84) + (i84 | i83);
                b = i85 % 128;
                if (i85 % 2 != 0) {
                    int i86 = 4 / 5;
                }
                q = arVar;
            }
            int i87 = a + 69;
            b = i87 % 128;
            int i88 = i87 % 2;
            return q;
        }
        int i89 = (-2) - ((i38 + 38) ^ (-1));
        int i90 = i89 % 128;
        a = i90;
        if (i89 % 2 != 0 ? i2 != 17 : i2 != 42) {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown tag ");
            int i91 = b + 11;
            a = i91 % 128;
            if (i91 % 2 == 0) {
                sb.append(i2);
                sb.append(" encountered");
                throw null;
            }
            sb.append(i2);
            sb.append(" encountered");
            throw new IOException(sb.toString());
        }
        int i92 = (i90 ^ 81) + ((i90 & 81) << 1);
        b = i92 % 128;
        if (i92 % 2 != 0) {
            k(c0263g);
            Q q4 = C0262f.c;
            obj.hashCode();
            throw null;
        }
        C0270p c0270pK3 = k(c0263g);
        Q q5 = C0262f.c;
        if (c0270pK3.e <= 0) {
            int i93 = b;
            int i94 = i93 & 75;
            int i95 = i93 | 75;
            int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
            a = i96 % 128;
            if (i96 % 2 == 0) {
                L l2 = C0262f.d;
                obj.hashCode();
                throw null;
            }
            l = C0262f.d;
            int i97 = b;
            int i98 = ((i97 | 101) << 1) - (i97 ^ 101);
            a = i98 % 128;
            int i99 = i98 % 2;
        } else {
            aq aqVar = new aq(c0270pK3);
            int i100 = b;
            int i101 = i100 & 125;
            int i102 = ((i100 | 125) & (~i101)) + (i101 << 1);
            a = i102 % 128;
            int i103 = i102 % 2;
            l = aqVar;
        }
        int i104 = b;
        int i105 = i104 ^ 99;
        int i106 = ((i104 & 99) | i105) << 1;
        int i107 = -i105;
        int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
        a = i108 % 128;
        int i109 = i108 % 2;
        return l;
    }

    public C0266l(byte[] bArr, boolean z) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.c = length;
        this.d = z;
        this.e = new byte[11][];
    }

    public C0270p k(C0263g c0263g) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = i3 + ((i2 ^ 37) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (c0263g.g <= 0) {
            C0270p c0270p = new C0270p(0);
            int i6 = b + 122;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return c0270p;
            }
            throw null;
        }
        C0266l c0266l = new C0266l(c0263g);
        C0270p c0270p2 = new C0270p(10);
        int i8 = a;
        int i9 = i8 & 15;
        int i10 = ((i8 ^ 15) | i9) << 1;
        int i11 = -((~i9) & (i8 | 15));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((i8 | 84) << 1) - (i8 ^ 84);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        while (true) {
            O oJ = c0266l.j();
            if (oJ == null) {
                int i17 = a + 101;
                b = i17 % 128;
                int i18 = i17 % 2;
                return c0270p2;
            }
            int i19 = a;
            int i20 = (i19 ^ 12) + ((i19 & 12) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            c0270p2.c(oJ);
            int i23 = b;
            int i24 = i23 & 53;
            int i25 = (i23 ^ 53) | i24;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 5 % 3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r4 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r5 = (r4 & 57) + (r4 | 57);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r5 % 128;
        r5 = r5 % 2;
        r5 = new byte[r2];
        r9[r2] = r5;
        r9 = (r4 ^ 79) + ((r4 & 79) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if ((r9 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r9 = 5 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r2 != r4.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p063ci.C0266l.a;
        r5 = ((r9 | 124) << 1) - (r9 ^ 124);
        r9 = (r5 ^ (-1)) + (r5 << 1);
        r5 = r9 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r5;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if ((r9 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r2 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r5 = r5 + 35;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if ((r5 % 2) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r9 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r2 >= r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p063ci.C0266l.a + 67;
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r9 % 128;
        r9 = r9 % 2;
        r9 = -ivas.gov.bisp.enumeration.O.i.s(r8.c, r4, 0, r4.length);
        r5 = (r2 ^ r9) + ((r9 & r2) << 1);
        r8.g = r5;
        r9 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r2 = ((r9 | 85) << 1) - (r9 ^ 85);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if ((r2 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r2 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r5 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r5 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        r9 = r9 + 83;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if ((r9 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r8.c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r8.c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p091n.j.w("DEF length ");
        r9.append(r8.f);
        r1 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r2 = r1 & 17;
        r2 = (r2 - (~(-(-((r1 ^ 17) | r2))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        if ((r2 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        r9.append(" object truncated by ");
        r8 = r8.g;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
    
        r9.append(" object truncated by ");
        r9.append(r8.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        throw new java.io.EOFException(r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p091n.j.w("corrupted stream - out of bounds length found: ");
        r8 = r8.g;
        r2 = ivas.gov.bisp.enumeration.p063ci.C0266l.b + 25;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        if ((r2 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        r1.append(r8);
        r1.append(" >= ");
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        r1.append(r8);
        r1.append(" >= ");
        r1.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
    
        r8 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p063ci.C0266l.a + 73;
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        throw new java.lang.IllegalArgumentException("buffer length not right for data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 >= r9.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 >= r9.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r8 = r8.d();
        r9 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r1 = r9 & 105;
        r9 = (r9 ^ 105) | r1;
        r2 = (r1 ^ r9) + ((r9 & r1) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] f(ivas.gov.bisp.enumeration.p063ci.C0263g r8, byte[][] r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0266l.f(ivas.gov.bisp.enumeration.ci.g, byte[][]):byte[]");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0131 A[PHI: r0 r3 r4
  0x0131: PHI (r0v51 int) = (r0v50 int), (r0v65 int) binds: [B:47:0x012f, B:44:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r3v44 int) = (r3v43 int), (r3v48 int) binds: [B:47:0x012f, B:44:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r4v43 byte[] A[IMMUTABLE_TYPE]) = (r4v42 byte[]), (r4v52 byte[]) binds: [B:47:0x012f, B:44:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0578, code lost:
    
        if (r10 == r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x057b, code lost:
    
        if (r10 == r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0582, code lost:
    
        return new ivas.gov.bisp.enumeration.p063ci.Z(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p063ci.O e(int r21, ivas.gov.bisp.enumeration.p063ci.C0263g r22, byte[][] r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0266l.e(int, ivas.gov.bisp.enumeration.ci.g, byte[][]):ivas.gov.bisp.enumeration.ci.O");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r8 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r8 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r8 = new ivas.gov.bisp.enumeration.p063ci.R(new ivas.gov.bisp.enumeration.p063ci.at(r12, r12.c), r12.c);
        r9 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r10 = r9 + 11;
        r11 = r10 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r11;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if ((r2 & 64) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.am(r7, r8.f());
        r3 = ivas.gov.bisp.enumeration.p063ci.C0266l.a;
        r5 = (r3 ^ 71) + ((r3 & 71) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if ((r5 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if ((r2 & 128) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        r11 = r11 + 55;
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if ((r11 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        r2 = r8.e(false, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r2 = r8.e(true, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r6 = r3 & 51;
        r5 = ((r3 ^ 51) | r6) << 1;
        r3 = -((r3 | 51) & (~r6));
        r4 = ((r5 | r3) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if ((r4 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r7 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        r2 = r9 & 37;
        r6 = r9 | 37;
        r9 = (r2 ^ r6) + ((r2 & r6) << 1);
        r2 = r9 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (r7 == 8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0117, code lost:
    
        r3 = (r2 & 25) + (r2 | 25);
        r2 = r3 % 128;
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r2;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        if (r7 == 16) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        r1 = (r2 & 5) + (r2 | 5);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        if (r7 != 17) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p063ci.D(r8.f());
        r2 = ivas.gov.bisp.enumeration.p063ci.C0266l.b + 77;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        throw new java.io.IOException("unknown BER object encountered");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014c, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.W(r8.f());
        r3 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r5 = (r3 & (-50)) | ((~r3) & 49);
        r3 = (r3 & 49) << 1;
        r6 = (r5 ^ r3) + ((r3 & r5) << 1);
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        if ((r6 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p063ci.an(r8.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017a, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p063ci.C0266l.a;
        r2 = (-2) - ((((r2 | 86) << 1) - (r2 ^ 86)) ^ (-1));
        ivas.gov.bisp.enumeration.p063ci.C0266l.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
    
        throw new ivas.gov.bisp.enumeration.p063ci.P(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.C0273s(ivas.gov.bisp.enumeration.O.i.q(new ivas.gov.bisp.enumeration.p063ci.C0271q(r8)));
        r1 = ivas.gov.bisp.enumeration.p063ci.C0266l.b;
        r5 = r1 & 11;
        r3 = ((((r1 ^ 11) | r5) << 1) - (~(-((r1 | 11) & (~r5))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.C0266l.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ba, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c2, code lost:
    
        throw new java.io.IOException("indefinite-length primitive encoding encountered");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p063ci.O j() {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.C0266l.j():ivas.gov.bisp.enumeration.ci.O");
    }
}
