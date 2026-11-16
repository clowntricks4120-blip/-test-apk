package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aC.EnumC0042v;
import ivas.gov.bisp.enumeration.aC.V;
import ivas.gov.bisp.enumeration.o0000o0o.o00oO0o;
import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p091n.j;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    private static int a = 1;
    private static int b;
    public final V c;

    public J(V v) {
        this.c = v;
    }

    public static final J d(C0321u c0321u, z zVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ivas.gov.bisp.enumeration.aC.O.x(c0321u.g(), ivas.gov.bisp.enumeration.aD.J.d());
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.aC.O oX = ivas.gov.bisp.enumeration.aC.O.x(c0321u.g(), ivas.gov.bisp.enumeration.aD.J.d());
        if (oX.z().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int i4 = b;
        int i5 = i4 ^ 117;
        int i6 = (i4 & 117) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        try {
            byte[] bArrE = zVar.e(oX.z().n(), new byte[0]);
            int i9 = b;
            int i10 = i9 & 103;
            int i11 = i9 | 103;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                V.x(bArrE, ivas.gov.bisp.enumeration.aD.J.d()).A();
                throw null;
            }
            V vX = V.x(bArrE, ivas.gov.bisp.enumeration.aD.J.d());
            if (vX.A() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            J j = new J(vX);
            int i13 = b + 2;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 26 / 0;
            }
            return j;
        } catch (oo0o0Oo unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final J c(V v) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (~i3) & (i2 | 45);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (v != null) {
            int i8 = i2 & 23;
            int i9 = (i8 - (~((i2 ^ 23) | i8))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            if (v.A() > 0) {
                J j = new J(v);
                int i11 = b;
                int i12 = (i11 & (-118)) | ((~i11) & 117);
                int i13 = -(-((i11 & 117) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                return j;
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        String string = v.b(this.c).toString();
        int i7 = b + 55;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0391  */
    /* JADX WARN: Code duplicated, block: B:106:0x039e  */
    /* JADX WARN: Code duplicated, block: B:173:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0138  */
    /* JADX WARN: Code duplicated, block: B:35:0x0147  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:41:0x016a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175  */
    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b5  */
    public final <P> P e(Class<P> cls) throws GeneralSecurityException {
        Class clsB;
        Iterator<V.bcq> it;
        int i;
        boolean z;
        Class clsB2;
        Class<P> cls2;
        String strA;
        ivas.gov.bisp.enumeration.aC.R rE;
        byte[] bArrArray;
        ByteBuffer byteBufferPut;
        int iA;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b + 71;
        a = i7 % 128;
        int i8 = i7 % 2;
        T t = (T) ((ConcurrentHashMap) R.g).get(cls);
        if (t == null) {
            int i9 = b;
            int i10 = (i9 & 123) + (i9 | 123);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = i11 & 99;
            int i14 = (i13 - (~((i11 ^ 99) | i13))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            clsB = null;
        } else {
            clsB = t.b();
            int i16 = b;
            int i17 = i16 & 115;
            int i18 = -(-((i16 ^ 115) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        if (clsB == null) {
            StringBuilder sbW = j.w("No wrapper found for ");
            sbW.append(cls.getName());
            throw new GeneralSecurityException(sbW.toString());
        }
        int i21 = a;
        int i22 = ((i21 ^ 4) + ((i21 & 4) << 1)) - 1;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            Logger logger = R.c;
            EnumC0042v enumC0042v = EnumC0042v.d;
            throw null;
        }
        Logger logger2 = R.c;
        EnumC0042v enumC0042v2 = EnumC0042v.d;
        V v = this.c;
        int i23 = a;
        int i24 = i23 & 27;
        int i25 = ((i23 ^ 27) | i24) << 1;
        int i26 = -((i23 | 27) & (~i24));
        int i27 = (i25 & i26) + (i26 | i25);
        b = i27 % 128;
        int i28 = i27 % 2;
        int i29 = v.c;
        int iE = v.E();
        List<V.bcq> listF = v.F();
        int i30 = b;
        int i31 = i30 & 11;
        int i32 = (i30 ^ 11) | i31;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        a = i33 % 128;
        if (i33 % 2 == 0) {
            it = listF.iterator();
            i = 1;
            z = true;
        } else {
            it = listF.iterator();
            i = 0;
            z = false;
        }
        int i34 = a;
        int i35 = (((i34 | 50) << 1) - (i34 ^ 50)) - 1;
        b = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 5 % 3;
        }
        boolean z2 = true;
        while (it.hasNext()) {
            int i37 = a;
            int i38 = ((i37 & 92) + (i37 | 92)) - 1;
            b = i38 % 128;
            int i39 = i38 % 2;
            V.bcq next = it.next();
            EnumC0042v enumC0042vG = next.G();
            int i40 = a;
            int i41 = (i40 & (-74)) | (73 & (~i40));
            int i42 = (i40 & 73) << 1;
            int i43 = (i41 & i42) + (i42 | i41);
            int i44 = i43 % 128;
            b = i44;
            if (i43 % 2 != 0) {
                throw null;
            }
            if (enumC0042vG == enumC0042v2) {
                int i45 = i44 ^ 65;
                int i46 = ((i44 & 65) | i45) << 1;
                int i47 = -i45;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                a = i48 % 128;
                if (i48 % 2 == 0) {
                    int i49 = 30 / 0;
                    if (!next.H()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.A())));
                    }
                    int i50 = b;
                    i3 = (((i50 | 47) << 1) - (~(-((47 & (~i50)) | (i50 & (-48)))))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i51 = 38 / 0;
                        if (next.F() == D.d) {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.A())));
                        }
                        if (next.G() != EnumC0042v.c) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.A())));
                        }
                        int i52 = b;
                        int i53 = (i52 ^ 81) + ((i52 & 81) << 1);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        if (next.A() == iE) {
                            i4 = b;
                            i5 = i4 + 89;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            if (!z) {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                            int i55 = ((((i4 ^ 3) | (i4 & 3)) << 1) - (~(-(((~i4) & 3) | (i4 & (-4)))))) - 1;
                            int i56 = i55 % 128;
                            a = i56;
                            int i57 = i55 % 2;
                            int i58 = i56 & 21;
                            int i59 = (i56 ^ 21) | i58;
                            int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                            b = i60 % 128;
                            int i61 = i60 % 2;
                            z = true;
                        }
                        if (next.E().E() != ivas.gov.bisp.enumeration.aC.R.bdl.f) {
                            int i62 = b;
                            int i63 = ((i62 ^ 95) | (i62 & 95)) << 1;
                            int i64 = -((i62 & (-96)) | ((~i62) & 95));
                            int i65 = (i63 & i64) + (i63 | i64);
                            a = i65 % 128;
                            int i66 = i65 % 2;
                            int i67 = (-2) - ((i62 + 6) ^ (-1));
                            a = i67 % 128;
                            int i68 = i67 % 2;
                            z2 = false;
                        }
                        i++;
                        int i69 = a + 43;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                    } else {
                        if (next.F() == D.d) {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.A())));
                        }
                        if (next.G() != EnumC0042v.c) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.A())));
                        }
                        int i510 = b;
                        int i511 = (i510 ^ 81) + ((i510 & 81) << 1);
                        a = i511 % 128;
                        int i512 = i511 % 2;
                        if (next.A() == iE) {
                            i4 = b;
                            i5 = i4 + 89;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            if (!z) {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                            int i513 = ((((i4 ^ 3) | (i4 & 3)) << 1) - (~(-(((~i4) & 3) | (i4 & (-4)))))) - 1;
                            int i514 = i513 % 128;
                            a = i514;
                            int i515 = i513 % 2;
                            int i516 = i514 & 21;
                            int i517 = (i514 ^ 21) | i516;
                            int i610 = ((i516 | i517) << 1) - (i517 ^ i516);
                            b = i610 % 128;
                            int i611 = i610 % 2;
                            z = true;
                        }
                        if (next.E().E() != ivas.gov.bisp.enumeration.aC.R.bdl.f) {
                            int i612 = b;
                            int i613 = ((i612 ^ 95) | (i612 & 95)) << 1;
                            int i614 = -((i612 & (-96)) | ((~i612) & 95));
                            int i615 = (i613 & i614) + (i613 | i614);
                            a = i615 % 128;
                            int i616 = i615 % 2;
                            int i617 = (-2) - ((i612 + 6) ^ (-1));
                            a = i617 % 128;
                            int i618 = i617 % 2;
                            z2 = false;
                        }
                        i++;
                        int i619 = a + 43;
                        b = i619 % 128;
                        int i71 = i619 % 2;
                    }
                } else {
                    if (!next.H()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.A())));
                    }
                    int i518 = b;
                    i3 = (((i518 | 47) << 1) - (~(-((47 & (~i518)) | (i518 & (-48)))))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i519 = 38 / 0;
                        if (next.F() == D.d) {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.A())));
                        }
                        if (next.G() != EnumC0042v.c) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.A())));
                        }
                        int i5110 = b;
                        int i5111 = (i5110 ^ 81) + ((i5110 & 81) << 1);
                        a = i5111 % 128;
                        int i5112 = i5111 % 2;
                        if (next.A() == iE) {
                            i4 = b;
                            i5 = i4 + 89;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            if (!z) {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                            int i5113 = ((((i4 ^ 3) | (i4 & 3)) << 1) - (~(-(((~i4) & 3) | (i4 & (-4)))))) - 1;
                            int i5114 = i5113 % 128;
                            a = i5114;
                            int i5115 = i5113 % 2;
                            int i5116 = i5114 & 21;
                            int i5117 = (i5114 ^ 21) | i5116;
                            int i6110 = ((i5116 | i5117) << 1) - (i5117 ^ i5116);
                            b = i6110 % 128;
                            int i6111 = i6110 % 2;
                            z = true;
                        }
                        if (next.E().E() != ivas.gov.bisp.enumeration.aC.R.bdl.f) {
                            int i6112 = b;
                            int i6113 = ((i6112 ^ 95) | (i6112 & 95)) << 1;
                            int i6114 = -((i6112 & (-96)) | ((~i6112) & 95));
                            int i6115 = (i6113 & i6114) + (i6113 | i6114);
                            a = i6115 % 128;
                            int i6116 = i6115 % 2;
                            int i6117 = (-2) - ((i6112 + 6) ^ (-1));
                            a = i6117 % 128;
                            int i6118 = i6117 % 2;
                            z2 = false;
                        }
                        i++;
                        int i6119 = a + 43;
                        b = i6119 % 128;
                        int i72 = i6119 % 2;
                    } else {
                        if (next.F() == D.d) {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.A())));
                        }
                        if (next.G() != EnumC0042v.c) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.A())));
                        }
                        int i5118 = b;
                        int i5119 = (i5118 ^ 81) + ((i5118 & 81) << 1);
                        a = i5119 % 128;
                        int i51110 = i5119 % 2;
                        if (next.A() == iE) {
                            i4 = b;
                            i5 = i4 + 89;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            if (!z) {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                            int i51111 = ((((i4 ^ 3) | (i4 & 3)) << 1) - (~(-(((~i4) & 3) | (i4 & (-4)))))) - 1;
                            int i51112 = i51111 % 128;
                            a = i51112;
                            int i51113 = i51111 % 2;
                            int i51114 = i51112 & 21;
                            int i51115 = (i51112 ^ 21) | i51114;
                            int i61110 = ((i51114 | i51115) << 1) - (i51115 ^ i51114);
                            b = i61110 % 128;
                            int i61111 = i61110 % 2;
                            z = true;
                        }
                        if (next.E().E() != ivas.gov.bisp.enumeration.aC.R.bdl.f) {
                            int i61112 = b;
                            int i61113 = ((i61112 ^ 95) | (i61112 & 95)) << 1;
                            int i61114 = -((i61112 & (-96)) | ((~i61112) & 95));
                            int i61115 = (i61113 & i61114) + (i61113 | i61114);
                            a = i61115 % 128;
                            int i61116 = i61115 % 2;
                            int i61117 = (-2) - ((i61112 + 6) ^ (-1));
                            a = i61117 % 128;
                            int i61118 = i61117 % 2;
                            z2 = false;
                        }
                        i++;
                        int i61119 = a + 43;
                        b = i61119 % 128;
                        int i73 = i61119 % 2;
                    }
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        int i74 = a;
        int i75 = i74 & 119;
        int i76 = (i74 ^ 119) | i75;
        int i77 = (i75 & i76) + (i76 | i75);
        b = i77 % 128;
        if (i77 % 2 != 0) {
            throw null;
        }
        if ((!z) && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        Q q = new Q(clsB);
        int i78 = a;
        int i79 = ((i78 | 49) << 1) - (i78 ^ 49);
        b = i79 % 128;
        if (i79 % 2 != 0) {
            this.c.F().iterator();
            throw null;
        }
        for (V.bcq bcqVar : this.c.F()) {
            int i80 = b;
            int i81 = ((i80 | 99) << 1) - (((~i80) & 99) | (i80 & (-100)));
            a = i81 % 128;
            int i82 = i81 % 2;
            EnumC0042v enumC0042vG2 = bcqVar.G();
            int i83 = a;
            int i84 = i83 & 65;
            int i85 = ((i83 ^ 65) | i84) << 1;
            int i86 = -((~i84) & (i83 | 65));
            int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
            b = i87 % 128;
            if (i87 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (enumC0042vG2 == enumC0042v2) {
                int i88 = i83 & 85;
                int i89 = -(-((i83 ^ 85) | i88));
                int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
                b = i90 % 128;
                if (i90 % 2 != 0) {
                    strA = bcqVar.E().A();
                    rE = bcqVar.E();
                    int i91 = 11 / 0;
                } else {
                    strA = bcqVar.E().A();
                    rE = bcqVar.E();
                }
                Object objF = R.f(strA, rE.F(), clsB);
                int i92 = a + 83;
                b = i92 % 128;
                int i93 = i92 % 2;
                if (bcqVar.G() != enumC0042v2) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int i94 = b;
                int i95 = i94 & 123;
                int i96 = (i94 ^ 123) | i95;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                a = i97 % 128;
                int i98 = i97 % 2;
                int iOrdinal = bcqVar.F().ordinal();
                if (iOrdinal != 1) {
                    int i99 = b;
                    int i100 = ((i99 | 37) << 1) - (i99 ^ 37);
                    a = i100 % 128;
                    int i101 = i100 % 2;
                    if (iOrdinal != 2) {
                        int i102 = (i99 & 47) + (i99 | 47);
                        a = i102 % 128;
                        if (i102 % 2 != 0 ? iOrdinal == 3 : iOrdinal == 3) {
                            bArrArray = P.c;
                            int i103 = a;
                            int i104 = ((~i103) & 73) | (i103 & (-74));
                            int i105 = -(-((i103 & 73) << 1));
                            int i106 = (i104 & i105) + (i104 | i105);
                            b = i106 % 128;
                            if (i106 % 2 != 0) {
                                int i107 = 5 / 3;
                            }
                        } else {
                            if (iOrdinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                            byteBufferPut = ByteBuffer.allocate(5).put((byte) 0);
                            iA = bcqVar.A();
                            int i108 = a;
                            int i109 = ((i108 ^ 109) | (i108 & 109)) << 1;
                            int i110 = -((i108 & (-110)) | ((~i108) & 109));
                            i2 = (i109 & i110) + (i109 | i110);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                bArrArray = byteBufferPut.putInt(iA).array();
                                int i111 = 26 / 0;
                            } else {
                                bArrArray = byteBufferPut.putInt(iA).array();
                            }
                        }
                    } else {
                        byteBufferPut = ByteBuffer.allocate(5).put((byte) 0);
                        iA = bcqVar.A();
                        int i1010 = a;
                        int i1011 = ((i1010 ^ 109) | (i1010 & 109)) << 1;
                        int i112 = -((i1010 & (-110)) | ((~i1010) & 109));
                        i2 = (i1011 & i112) + (i1011 | i112);
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            bArrArray = byteBufferPut.putInt(iA).array();
                            int i113 = 26 / 0;
                        } else {
                            bArrArray = byteBufferPut.putInt(iA).array();
                        }
                    }
                } else {
                    ByteBuffer byteBufferPut2 = ByteBuffer.allocate(5).put((byte) 1);
                    int iA2 = bcqVar.A();
                    int i114 = a;
                    int i115 = i114 ^ 11;
                    int i116 = ((i114 & 11) | i115) << 1;
                    int i117 = -i115;
                    int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                    b = i118 % 128;
                    int i119 = i118 % 2;
                    bArrArray = byteBufferPut2.putInt(iA2).array();
                    int i120 = b;
                    int i121 = ((i120 ^ 97) | (i120 & 97)) << 1;
                    int i122 = -((97 & (~i120)) | (i120 & (-98)));
                    int i123 = (i121 & i122) + (i122 | i121);
                    a = i123 % 128;
                    int i124 = i123 % 2;
                }
                Q.bgW bgw = new Q.bgW(objF, bArrArray, bcqVar.G(), bcqVar.F(), bcqVar.A());
                ArrayList arrayList = new ArrayList();
                arrayList.add(bgw);
                Q.bgX bgx = new Q.bgX(bgw.c(), null);
                int i125 = (-2) - ((a + 50) ^ (-1));
                b = i125 % 128;
                if (i125 % 2 != 0) {
                    Object obj2 = null;
                    q.c.put(bgx, Collections.unmodifiableList(arrayList));
                    obj2.hashCode();
                    throw null;
                }
                List<o00oO0o.OooO0O0<P>> listPut = q.c.put(bgx, Collections.unmodifiableList(arrayList));
                if (listPut != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(listPut);
                    int i126 = b;
                    int i127 = (i126 | 89) << 1;
                    int i128 = -(i126 ^ 89);
                    int i129 = (i127 & i128) + (i128 | i127);
                    a = i129 % 128;
                    int i130 = i129 % 2;
                    arrayList2.add(bgw);
                    ConcurrentMap<Q.bgX, List<o00oO0o.OooO0O0<P>>> concurrentMap = q.c;
                    List<o00oO0o.OooO0O0<P>> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                    int i131 = b;
                    int i132 = ((i131 | 5) << 1) - (5 ^ i131);
                    a = i132 % 128;
                    int i133 = i132 % 2;
                    concurrentMap.put(bgx, listUnmodifiableList);
                    int i134 = b;
                    int i135 = ((i134 ^ 99) | (i134 & 99)) << 1;
                    int i136 = -(((~i134) & 99) | (i134 & (-100)));
                    int i137 = (i135 & i136) + (i136 | i135);
                    a = i137 % 128;
                    int i138 = i137 % 2;
                }
                int iA3 = bcqVar.A();
                V v2 = this.c;
                int i139 = a + 15;
                b = i139 % 128;
                int i140 = i139 % 2;
                if (iA3 == v2.E()) {
                    int i141 = a;
                    int i142 = i141 ^ 93;
                    int i143 = ((i141 & 93) | i142) << 1;
                    int i144 = -i142;
                    int i145 = ((i143 | i144) << 1) - (i143 ^ i144);
                    b = i145 % 128;
                    if (i145 % 2 != 0) {
                        Object obj3 = null;
                        EnumC0042v enumC0042v3 = bgw.e;
                        obj3.hashCode();
                        throw null;
                    }
                    if (bgw.e != enumC0042v2) {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                    if (!(!q.c(bgw.c()).isEmpty())) {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                    int i146 = b;
                    int i147 = i146 & 109;
                    int i148 = (((i146 ^ 109) | i147) << 1) - ((i146 | 109) & (~i147));
                    a = i148 % 128;
                    if (i148 % 2 == 0) {
                        q.d = bgw;
                        throw null;
                    }
                    q.d = bgw;
                } else {
                    continue;
                }
            }
        }
        T t2 = (T) ((ConcurrentHashMap) R.g).get(cls);
        if (t2 == null) {
            StringBuilder sbW2 = j.w("No wrapper found for ");
            sbW2.append(q.e.getName());
            throw new GeneralSecurityException(sbW2.toString());
        }
        int i149 = a;
        int i150 = ((i149 & 48) + (i149 | 48)) - 1;
        b = i150 % 128;
        if (i150 % 2 != 0) {
            clsB2 = t2.b();
            cls2 = q.e;
            int i151 = 96 / 0;
        } else {
            clsB2 = t2.b();
            cls2 = q.e;
        }
        if (clsB2.equals(cls2)) {
            int i152 = b;
            int i153 = i152 & 23;
            int i154 = i153 + ((i152 ^ 23) | i153);
            a = i154 % 128;
            int i155 = i154 % 2;
            P p = (P) t2.e(q);
            int i156 = b;
            int i157 = (i156 & (-114)) | ((~i156) & 113);
            int i158 = (i156 & 113) << 1;
            int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
            a = i159 % 128;
            int i160 = i159 % 2;
            return p;
        }
        StringBuilder sbW3 = j.w("Wrong input primitive class, expected ");
        Class clsB3 = t2.b();
        int i161 = b;
        int i162 = i161 & 43;
        int i163 = (i161 | 43) & (~i162);
        int i164 = -(-(i162 << 1));
        int i165 = ((i163 | i164) << 1) - (i163 ^ i164);
        a = i165 % 128;
        int i166 = i165 % 2;
        sbW3.append(clsB3);
        sbW3.append(", got ");
        if (i166 != 0) {
            sbW3.append(q.e);
            throw new GeneralSecurityException(sbW3.toString());
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
