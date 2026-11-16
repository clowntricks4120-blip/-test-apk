package ivas.gov.bisp.enumeration.p067cm;

import ivas.gov.bisp.enumeration.p063ci.AbstractC0272r;
import ivas.gov.bisp.enumeration.p063ci.AbstractC0276v;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.D;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.K;
import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.X;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.aj;
import ivas.gov.bisp.enumeration.p063ci.aq;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p069co.j;
import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public class c extends J {
    private static int a = 0;
    private static int b = 1;
    public C0258a c;
    public j d;
    public M e;
    public AbstractC0272r f;
    public L g;

    /* JADX WARN: Code duplicated, block: B:13:0x006b A[PHI: r2
  0x006b: PHI (r2v9 ivas.gov.bisp.enumeration.ci.K) = (r2v8 ivas.gov.bisp.enumeration.ci.K), (r2v7 ivas.gov.bisp.enumeration.ci.K) binds: [B:15:0x008a, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public c(j jVar, i iVar, L l, byte[] bArr) {
        BigInteger bigInteger;
        if (bArr != null) {
            bigInteger = ivas.gov.bisp.enumeration.p064cj.c.d;
            int i = b + 7;
            a = i % 128;
            int i2 = i % 2;
        } else {
            bigInteger = ivas.gov.bisp.enumeration.p064cj.c.c;
            int i3 = a;
            int i4 = i3 & 39;
            int i5 = (i4 - (~((i3 ^ 39) | i4))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = 2 % 2;
        this.c = new C0258a(bigInteger);
        this.d = jVar;
        B b2 = new B(iVar);
        int i8 = b;
        int i9 = (i8 & 7) + (i8 | 7);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        K k = null;
        this.e = b2;
        this.g = l;
        if (i11 != 0) {
            k.hashCode();
            throw null;
        }
        if (bArr == null) {
            int i12 = (-2) - ((((i10 | 30) << 1) - (i10 ^ 30)) ^ (-1));
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((i10 | 23) << 1) - (i10 ^ 23);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 5 / 2;
            } else {
                int i16 = 2 % 2;
            }
        } else {
            k = new K(bArr);
            int i17 = b;
            int i18 = i17 & 63;
            int i19 = ((i17 ^ 63) | i18) << 1;
            int i20 = -((i17 | 63) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i110 = 2 % 2;
            }
        }
        this.f = k;
        int i22 = a;
        int i23 = i22 & 13;
        int i24 = -(-((i22 ^ 13) | i23));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
    }

    public static c h(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (!(!(obj instanceof c))) {
            int i6 = ((((i4 ^ 33) | (i4 & 33)) << 1) - (~(-(((~i4) & 33) | (i4 & (-34)))))) - 1;
            b = i6 % 128;
            c cVar = (c) obj;
            if (i6 % 2 != 0) {
                return cVar;
            }
            throw null;
        }
        if (obj == null) {
            int i7 = i4 & 93;
            int i8 = (i4 ^ 93) | i7;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return null;
            }
            throw null;
        }
        c cVar2 = new c(Q.o(obj));
        int i10 = b;
        int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
        int i12 = -(((~i10) & 37) | (i10 & (-38)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return cVar2;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(5);
        C0258a c0258a = this.c;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = i2 | 63;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        c0270p.c(c0258a);
        if (i6 != 0) {
            c0270p.c(this.d);
            obj.hashCode();
            throw null;
        }
        c0270p.c(this.d);
        int i7 = a;
        int i8 = i7 ^ 61;
        int i9 = ((((i7 & 61) | i8) << 1) - (~(-i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            c0270p.c(this.e);
            obj.hashCode();
            throw null;
        }
        c0270p.c(this.e);
        L l = this.g;
        if (l != null) {
            c0270p.c(new aj(false, 0, l, 0));
            int i10 = b;
            int i11 = i10 ^ 23;
            int i12 = ((i10 & 23) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        AbstractC0272r abstractC0272r = this.f;
        if (abstractC0272r != null) {
            aj ajVar = new aj(false, 1, abstractC0272r, 0);
            int i16 = a + 95;
            b = i16 % 128;
            int i17 = i16 % 2;
            c0270p.c(ajVar);
            if (i17 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        ac acVar = new ac(c0270p);
        int i18 = a;
        int i19 = (i18 ^ 107) + ((i18 & 107) << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return acVar;
        }
        obj.hashCode();
        throw null;
    }

    public i j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = ((i2 | 25) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return O.c(this.e.c);
        }
        int i5 = 34 / 0;
        return O.c(this.e.c);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:46:0x0150  */
    /* JADX WARN: Code duplicated, block: B:47:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x020f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0212  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:82:0x0237  */
    /* JADX WARN: Code duplicated, block: B:83:0x023b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0248  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:90:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    /* JADX WARN: Code duplicated, block: B:95:0x029a  */
    /* JADX WARN: Code duplicated, block: B:99:0x02cb  */
    public c(Q q) {
        O oT;
        i[] iVarArrV;
        L aqVar;
        int i;
        L aqVar2;
        int i2;
        L l;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        O oT2;
        byte[] bArr;
        int i12;
        int length;
        byte[] bArr2;
        K k;
        int i13;
        int i14;
        Enumeration enumerationR = q.r();
        C0258a c0258aP = C0258a.p(enumerationR.nextElement());
        this.c = c0258aP;
        int iY = c0258aP.y();
        if (iY < 0 || iY > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        int i15 = b - (-1);
        a = i15 % 128;
        int i16 = i15 % 2;
        this.d = j.h(enumerationR.nextElement());
        int i17 = b + 35;
        a = i17 % 128;
        Object obj = null;
        if (i17 % 2 != 0) {
            this.e = M.p(enumerationR.nextElement());
            obj.hashCode();
            throw null;
        }
        this.e = M.p(enumerationR.nextElement());
        int i18 = b;
        int i19 = ((((i18 ^ 53) | (i18 & 53)) << 1) - (~(-(((~i18) & 53) | (i18 & (-54)))))) - 1;
        int i20 = i19 % 128;
        a = i20;
        int i21 = i19 % 2;
        int i22 = i20 & 29;
        int i23 = (i22 - (~((i20 ^ 29) | i22))) - 1;
        b = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 2 % 2;
        }
        int i25 = -1;
        while (!(!enumerationR.hasMoreElements())) {
            int i26 = a;
            int i27 = (i26 & (-100)) | ((~i26) & 99);
            int i28 = -(-((i26 & 99) << 1));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            int i30 = i29 % 2;
            AbstractC0276v abstractC0276v = (AbstractC0276v) enumerationR.nextElement();
            int i31 = abstractC0276v.c;
            int i32 = b;
            int i33 = i32 & 37;
            int i34 = i33 + ((i32 ^ 37) | i33);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 40 / 0;
                if (i31 <= i25) {
                    throw new IllegalArgumentException("invalid optional field in private key info");
                }
                if (i31 != 0) {
                    int i36 = ((i32 ^ 77) | (i32 & 77)) << 1;
                    int i37 = -((77 & (~i32)) | (i32 & (-78)));
                    i9 = (i36 & i37) + (i37 | i36);
                    i10 = i9 % 128;
                    a = i10;
                    if (i9 % 2 != 0) {
                        if (i31 != 1) {
                            throw new IllegalArgumentException("unknown optional field in private key info");
                        }
                        int i38 = i10 | 67;
                        int i39 = i38 << 1;
                        int i40 = -((~(i10 & 67)) & i38);
                        i11 = ((i39 | i40) << 1) - (i40 ^ i39);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i41 = 53 / 0;
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i42 = a;
                                int i43 = (((i42 | 59) << 1) - (~(-(i42 ^ 59)))) - 1;
                                b = i43 % 128;
                                int i44 = i43 % 2;
                                k = K.q(oT2);
                                int i45 = a;
                                i14 = ((i45 | 109) << 1) - (i45 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i46 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i47 = b;
                                int i48 = (i47 & 75) + (i47 | 75);
                                i12 = i48 % 128;
                                a = i12;
                                int i49 = i48 % 2;
                                byte b2 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i50 = i12 & 51;
                                    int i51 = ((i12 ^ 51) | i50) << 1;
                                    int i52 = -((i12 | 51) & (~i50));
                                    i13 = ((i51 | i52) << 1) - (i52 ^ i51);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length2 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length2 - (~((length2 ^ (-1)) | length2))) - 1);
                                    }
                                    int i53 = 2 % 2;
                                }
                                k = new K(bArr2, b2);
                                int i54 = a;
                                int i55 = (i54 & 93) + (i54 | 93);
                                b = i55 % 128;
                                int i56 = i55 % 2;
                                int i57 = 2 % 2;
                            }
                            this.f = k;
                            int i58 = a;
                            int i59 = ((i58 ^ 44) + ((i58 & 44) << 1)) - 1;
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            int i61 = 2 % 2;
                        } else {
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i410 = a;
                                int i411 = (((i410 | 59) << 1) - (~(-(i410 ^ 59)))) - 1;
                                b = i411 % 128;
                                int i412 = i411 % 2;
                                k = K.q(oT2);
                                int i413 = a;
                                i14 = ((i413 | 109) << 1) - (i413 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i414 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i415 = b;
                                int i416 = (i415 & 75) + (i415 | 75);
                                i12 = i416 % 128;
                                a = i12;
                                int i417 = i416 % 2;
                                byte b3 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i510 = i12 & 51;
                                    int i511 = ((i12 ^ 51) | i510) << 1;
                                    int i512 = -((i12 | 51) & (~i510));
                                    i13 = ((i511 | i512) << 1) - (i512 ^ i511);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length3 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length3 - (~((length3 ^ (-1)) | length3))) - 1);
                                    }
                                    int i513 = 2 % 2;
                                }
                                k = new K(bArr2, b3);
                                int i514 = a;
                                int i515 = (i514 & 93) + (i514 | 93);
                                b = i515 % 128;
                                int i516 = i515 % 2;
                                int i517 = 2 % 2;
                            }
                            this.f = k;
                            int i518 = a;
                            int i519 = ((i518 ^ 44) + ((i518 & 44) << 1)) - 1;
                            b = i519 % 128;
                            int i62 = i519 % 2;
                            int i63 = 2 % 2;
                        }
                    } else {
                        if (i31 != 1) {
                            throw new IllegalArgumentException("unknown optional field in private key info");
                        }
                        int i310 = i10 | 67;
                        int i311 = i310 << 1;
                        int i418 = -((~(i10 & 67)) & i310);
                        i11 = ((i311 | i418) << 1) - (i418 ^ i311);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i419 = 53 / 0;
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i4110 = a;
                                int i4111 = (((i4110 | 59) << 1) - (~(-(i4110 ^ 59)))) - 1;
                                b = i4111 % 128;
                                int i4112 = i4111 % 2;
                                k = K.q(oT2);
                                int i4113 = a;
                                i14 = ((i4113 | 109) << 1) - (i4113 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i4114 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i4115 = b;
                                int i4116 = (i4115 & 75) + (i4115 | 75);
                                i12 = i4116 % 128;
                                a = i12;
                                int i4117 = i4116 % 2;
                                byte b4 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i5110 = i12 & 51;
                                    int i5111 = ((i12 ^ 51) | i5110) << 1;
                                    int i5112 = -((i12 | 51) & (~i5110));
                                    i13 = ((i5111 | i5112) << 1) - (i5112 ^ i5111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length4 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length4 - (~((length4 ^ (-1)) | length4))) - 1);
                                    }
                                    int i5113 = 2 % 2;
                                }
                                k = new K(bArr2, b4);
                                int i5114 = a;
                                int i5115 = (i5114 & 93) + (i5114 | 93);
                                b = i5115 % 128;
                                int i5116 = i5115 % 2;
                                int i5117 = 2 % 2;
                            }
                            this.f = k;
                            int i5118 = a;
                            int i5119 = ((i5118 ^ 44) + ((i5118 & 44) << 1)) - 1;
                            b = i5119 % 128;
                            int i64 = i5119 % 2;
                            int i65 = 2 % 2;
                        } else {
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i4118 = a;
                                int i4119 = (((i4118 | 59) << 1) - (~(-(i4118 ^ 59)))) - 1;
                                b = i4119 % 128;
                                int i41110 = i4119 % 2;
                                k = K.q(oT2);
                                int i41111 = a;
                                i14 = ((i41111 | 109) << 1) - (i41111 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i41112 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i41113 = b;
                                int i41114 = (i41113 & 75) + (i41113 | 75);
                                i12 = i41114 % 128;
                                a = i12;
                                int i41115 = i41114 % 2;
                                byte b5 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i51110 = i12 & 51;
                                    int i51111 = ((i12 ^ 51) | i51110) << 1;
                                    int i51112 = -((i12 | 51) & (~i51110));
                                    i13 = ((i51111 | i51112) << 1) - (i51112 ^ i51111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length5 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length5 - (~((length5 ^ (-1)) | length5))) - 1);
                                    }
                                    int i51113 = 2 % 2;
                                }
                                k = new K(bArr2, b5);
                                int i51114 = a;
                                int i51115 = (i51114 & 93) + (i51114 | 93);
                                b = i51115 % 128;
                                int i51116 = i51115 % 2;
                                int i51117 = 2 % 2;
                            }
                            this.f = k;
                            int i51118 = a;
                            int i51119 = ((i51118 ^ 44) + ((i51118 & 44) << 1)) - 1;
                            b = i51119 % 128;
                            int i66 = i51119 % 2;
                            int i67 = 2 % 2;
                        }
                    }
                } else {
                    oT = abstractC0276v.t();
                    if (abstractC0276v.d) {
                        int i68 = a;
                        i5 = (i68 & 111) + (i68 | 111);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            boolean z = abstractC0276v instanceof X;
                            obj.hashCode();
                            throw null;
                        }
                        if (abstractC0276v instanceof X) {
                            aqVar2 = new D(oT);
                            int i69 = b;
                            i7 = ((i69 & (-62)) | ((~i69) & 61)) + ((i69 & 61) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i70 = 2 % 2;
                            }
                        } else {
                            aqVar2 = new aq(oT);
                            i6 = b + 37;
                            a = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i71 = 2 / 4;
                            } else {
                                int i72 = 2 % 2;
                            }
                        }
                    } else {
                        if (oT instanceof L) {
                            i2 = a;
                            int i73 = (i2 & 55) + (i2 | 55);
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            l = (L) oT;
                            if (!(!(abstractC0276v instanceof X))) {
                                aqVar2 = l;
                            } else {
                                int i75 = i2 & 57;
                                int i76 = (i2 ^ 57) | i75;
                                i3 = ((i75 | i76) << 1) - (i75 ^ i76);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                aqVar = (L) l.m();
                                int i77 = a;
                                i4 = ((i77 | 77) << 1) - (77 ^ i77);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i78 = 2 % 4;
                                } else {
                                    int i79 = 2 % 2;
                                }
                            }
                        } else {
                            if (oT instanceof Q) {
                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("unknown object in getInstance: ");
                                sbW.append(abstractC0276v.getClass().getName());
                                throw new IllegalArgumentException(sbW.toString());
                            }
                            int i80 = b + 49;
                            a = i80 % 128;
                            int i81 = i80 % 2;
                            iVarArrV = ((Q) oT).v();
                            if (abstractC0276v instanceof X) {
                                aqVar = new D(false, iVarArrV);
                                int i82 = b;
                                int i83 = (((i82 & (-20)) | ((~i82) & 19)) - (~(-(-((i82 & 19) << 1))))) - 1;
                                a = i83 % 128;
                                int i84 = i83 % 2;
                                int i85 = 2 % 2;
                            } else {
                                aqVar = new aq(false, iVarArrV);
                                int i86 = a;
                                int i87 = i86 & 125;
                                int i88 = (i86 | 125) & (~i87);
                                int i89 = -(-(i87 << 1));
                                i = (i88 ^ i89) + ((i88 & i89) << 1);
                                b = i % 128;
                                if (i % 2 != 0) {
                                    int i90 = 2 % 2;
                                }
                            }
                        }
                        aqVar2 = aqVar;
                    }
                    this.g = aqVar2;
                    int i91 = a;
                    int i92 = i91 ^ 39;
                    int i93 = ((i91 & 39) | i92) << 1;
                    int i94 = -i92;
                    int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                    b = i95 % 128;
                    int i96 = i95 % 2;
                    int i97 = 2 % 2;
                }
                int i98 = b;
                int i99 = i98 & 23;
                int i100 = (i98 | 23) & (~i99);
                int i101 = -(-(i99 << 1));
                i8 = (i100 ^ i101) + ((i100 & i101) << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i102 = 2 % 5;
                } else {
                    int i103 = 2 % 2;
                }
                i25 = i31;
            } else {
                if (i31 <= i25) {
                    throw new IllegalArgumentException("invalid optional field in private key info");
                }
                if (i31 != 0) {
                    int i312 = ((i32 ^ 77) | (i32 & 77)) << 1;
                    int i313 = -((77 & (~i32)) | (i32 & (-78)));
                    i9 = (i312 & i313) + (i313 | i312);
                    i10 = i9 % 128;
                    a = i10;
                    if (i9 % 2 != 0) {
                        if (i31 != 1) {
                            throw new IllegalArgumentException("unknown optional field in private key info");
                        }
                        int i314 = i10 | 67;
                        int i315 = i314 << 1;
                        int i4120 = -((~(i10 & 67)) & i314);
                        i11 = ((i315 | i4120) << 1) - (i4120 ^ i315);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i4121 = 53 / 0;
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i41116 = a;
                                int i41117 = (((i41116 | 59) << 1) - (~(-(i41116 ^ 59)))) - 1;
                                b = i41117 % 128;
                                int i41118 = i41117 % 2;
                                k = K.q(oT2);
                                int i41119 = a;
                                i14 = ((i41119 | 109) << 1) - (i41119 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i411110 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i411111 = b;
                                int i411112 = (i411111 & 75) + (i411111 | 75);
                                i12 = i411112 % 128;
                                a = i12;
                                int i411113 = i411112 % 2;
                                byte b6 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i511110 = i12 & 51;
                                    int i511111 = ((i12 ^ 51) | i511110) << 1;
                                    int i511112 = -((i12 | 51) & (~i511110));
                                    i13 = ((i511111 | i511112) << 1) - (i511112 ^ i511111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length6 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length6 - (~((length6 ^ (-1)) | length6))) - 1);
                                    }
                                    int i511113 = 2 % 2;
                                }
                                k = new K(bArr2, b6);
                                int i511114 = a;
                                int i511115 = (i511114 & 93) + (i511114 | 93);
                                b = i511115 % 128;
                                int i511116 = i511115 % 2;
                                int i511117 = 2 % 2;
                            }
                            this.f = k;
                            int i511118 = a;
                            int i511119 = ((i511118 ^ 44) + ((i511118 & 44) << 1)) - 1;
                            b = i511119 % 128;
                            int i610 = i511119 % 2;
                            int i611 = 2 % 2;
                        } else {
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i411114 = a;
                                int i411115 = (((i411114 | 59) << 1) - (~(-(i411114 ^ 59)))) - 1;
                                b = i411115 % 128;
                                int i411116 = i411115 % 2;
                                k = K.q(oT2);
                                int i411117 = a;
                                i14 = ((i411117 | 109) << 1) - (i411117 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i411118 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i411119 = b;
                                int i4111110 = (i411119 & 75) + (i411119 | 75);
                                i12 = i4111110 % 128;
                                a = i12;
                                int i4111111 = i4111110 % 2;
                                byte b7 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i5111110 = i12 & 51;
                                    int i5111111 = ((i12 ^ 51) | i5111110) << 1;
                                    int i5111112 = -((i12 | 51) & (~i5111110));
                                    i13 = ((i5111111 | i5111112) << 1) - (i5111112 ^ i5111111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length7 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length7 - (~((length7 ^ (-1)) | length7))) - 1);
                                    }
                                    int i5111113 = 2 % 2;
                                }
                                k = new K(bArr2, b7);
                                int i5111114 = a;
                                int i5111115 = (i5111114 & 93) + (i5111114 | 93);
                                b = i5111115 % 128;
                                int i5111116 = i5111115 % 2;
                                int i5111117 = 2 % 2;
                            }
                            this.f = k;
                            int i5111118 = a;
                            int i5111119 = ((i5111118 ^ 44) + ((i5111118 & 44) << 1)) - 1;
                            b = i5111119 % 128;
                            int i612 = i5111119 % 2;
                            int i613 = 2 % 2;
                        }
                    } else {
                        if (i31 != 1) {
                            throw new IllegalArgumentException("unknown optional field in private key info");
                        }
                        int i316 = i10 | 67;
                        int i317 = i316 << 1;
                        int i4122 = -((~(i10 & 67)) & i316);
                        i11 = ((i317 | i4122) << 1) - (i4122 ^ i317);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i4123 = 53 / 0;
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i4111112 = a;
                                int i4111113 = (((i4111112 | 59) << 1) - (~(-(i4111112 ^ 59)))) - 1;
                                b = i4111113 % 128;
                                int i4111114 = i4111113 % 2;
                                k = K.q(oT2);
                                int i4111115 = a;
                                i14 = ((i4111115 | 109) << 1) - (i4111115 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i4111116 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i4111117 = b;
                                int i4111118 = (i4111117 & 75) + (i4111117 | 75);
                                i12 = i4111118 % 128;
                                a = i12;
                                int i4111119 = i4111118 % 2;
                                byte b8 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i51111110 = i12 & 51;
                                    int i51111111 = ((i12 ^ 51) | i51111110) << 1;
                                    int i51111112 = -((i12 | 51) & (~i51111110));
                                    i13 = ((i51111111 | i51111112) << 1) - (i51111112 ^ i51111111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length8 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length8 - (~((length8 ^ (-1)) | length8))) - 1);
                                    }
                                    int i51111113 = 2 % 2;
                                }
                                k = new K(bArr2, b8);
                                int i51111114 = a;
                                int i51111115 = (i51111114 & 93) + (i51111114 | 93);
                                b = i51111115 % 128;
                                int i51111116 = i51111115 % 2;
                                int i51111117 = 2 % 2;
                            }
                            this.f = k;
                            int i51111118 = a;
                            int i51111119 = ((i51111118 ^ 44) + ((i51111118 & 44) << 1)) - 1;
                            b = i51111119 % 128;
                            int i614 = i51111119 % 2;
                            int i615 = 2 % 2;
                        } else {
                            if (iY <= 0) {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                            oT2 = abstractC0276v.t();
                            if (oT2 instanceof K) {
                                int i41111110 = a;
                                int i41111111 = (((i41111110 | 59) << 1) - (~(-(i41111110 ^ 59)))) - 1;
                                b = i41111111 % 128;
                                int i41111112 = i41111111 % 2;
                                k = K.q(oT2);
                                int i41111113 = a;
                                i14 = ((i41111113 | 109) << 1) - (i41111113 ^ 109);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i41111114 = 2 % 2;
                                }
                            } else {
                                bArr = M.p(oT2).c;
                                if (bArr.length > 0) {
                                    throw new IllegalArgumentException("truncated BIT STRING detected");
                                }
                                int i41111115 = b;
                                int i41111116 = (i41111115 & 75) + (i41111115 | 75);
                                i12 = i41111116 % 128;
                                a = i12;
                                int i41111117 = i41111116 % 2;
                                byte b9 = bArr[0];
                                length = (-2) - (bArr.length ^ (-1));
                                bArr2 = new byte[length];
                                if (length != 0) {
                                    int i511111110 = i12 & 51;
                                    int i511111111 = ((i12 ^ 51) | i511111110) << 1;
                                    int i511111112 = -((i12 | 51) & (~i511111110));
                                    i13 = ((i511111111 | i511111112) << 1) - (i511111112 ^ i511111111);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length >> 1);
                                    } else {
                                        int length9 = bArr.length;
                                        System.arraycopy(bArr, 1, bArr2, 0, (length9 - (~((length9 ^ (-1)) | length9))) - 1);
                                    }
                                    int i511111113 = 2 % 2;
                                }
                                k = new K(bArr2, b9);
                                int i511111114 = a;
                                int i511111115 = (i511111114 & 93) + (i511111114 | 93);
                                b = i511111115 % 128;
                                int i511111116 = i511111115 % 2;
                                int i511111117 = 2 % 2;
                            }
                            this.f = k;
                            int i511111118 = a;
                            int i511111119 = ((i511111118 ^ 44) + ((i511111118 & 44) << 1)) - 1;
                            b = i511111119 % 128;
                            int i616 = i511111119 % 2;
                            int i617 = 2 % 2;
                        }
                    }
                } else {
                    oT = abstractC0276v.t();
                    if (abstractC0276v.d) {
                        int i618 = a;
                        i5 = (i618 & 111) + (i618 | 111);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            boolean z2 = abstractC0276v instanceof X;
                            obj.hashCode();
                            throw null;
                        }
                        if (abstractC0276v instanceof X) {
                            aqVar2 = new D(oT);
                            int i619 = b;
                            i7 = ((i619 & (-62)) | ((~i619) & 61)) + ((i619 & 61) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i710 = 2 % 2;
                            }
                        } else {
                            aqVar2 = new aq(oT);
                            i6 = b + 37;
                            a = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i711 = 2 / 4;
                            } else {
                                int i712 = 2 % 2;
                            }
                        }
                    } else {
                        if (oT instanceof L) {
                            i2 = a;
                            int i713 = (i2 & 55) + (i2 | 55);
                            b = i713 % 128;
                            int i714 = i713 % 2;
                            l = (L) oT;
                            if (!(!(abstractC0276v instanceof X))) {
                                aqVar2 = l;
                            } else {
                                int i715 = i2 & 57;
                                int i716 = (i2 ^ 57) | i715;
                                i3 = ((i715 | i716) << 1) - (i715 ^ i716);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                aqVar = (L) l.m();
                                int i717 = a;
                                i4 = ((i717 | 77) << 1) - (77 ^ i717);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i718 = 2 % 4;
                                } else {
                                    int i719 = 2 % 2;
                                }
                            }
                        } else {
                            if (oT instanceof Q) {
                                StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("unknown object in getInstance: ");
                                sbW2.append(abstractC0276v.getClass().getName());
                                throw new IllegalArgumentException(sbW2.toString());
                            }
                            int i810 = b + 49;
                            a = i810 % 128;
                            int i811 = i810 % 2;
                            iVarArrV = ((Q) oT).v();
                            if (abstractC0276v instanceof X) {
                                aqVar = new D(false, iVarArrV);
                                int i812 = b;
                                int i813 = (((i812 & (-20)) | ((~i812) & 19)) - (~(-(-((i812 & 19) << 1))))) - 1;
                                a = i813 % 128;
                                int i814 = i813 % 2;
                                int i815 = 2 % 2;
                            } else {
                                aqVar = new aq(false, iVarArrV);
                                int i816 = a;
                                int i817 = i816 & 125;
                                int i818 = (i816 | 125) & (~i817);
                                int i819 = -(-(i817 << 1));
                                i = (i818 ^ i819) + ((i818 & i819) << 1);
                                b = i % 128;
                                if (i % 2 != 0) {
                                    int i910 = 2 % 2;
                                }
                            }
                        }
                        aqVar2 = aqVar;
                    }
                    this.g = aqVar2;
                    int i911 = a;
                    int i912 = i911 ^ 39;
                    int i913 = ((i911 & 39) | i912) << 1;
                    int i914 = -i912;
                    int i915 = ((i913 | i914) << 1) - (i913 ^ i914);
                    b = i915 % 128;
                    int i916 = i915 % 2;
                    int i917 = 2 % 2;
                }
                int i918 = b;
                int i919 = i918 & 23;
                int i104 = (i918 | 23) & (~i919);
                int i105 = -(-(i919 << 1));
                i8 = (i104 ^ i105) + ((i104 & i105) << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i106 = 2 % 5;
                } else {
                    int i107 = 2 % 2;
                }
                i25 = i31;
            }
        }
        int i108 = a;
        int i109 = i108 ^ 51;
        int i110 = ((i108 & 51) | i109) << 1;
        int i111 = -i109;
        int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
        b = i112 % 128;
        if (i112 % 2 == 0) {
            int i113 = 70 / 0;
        }
    }
}
