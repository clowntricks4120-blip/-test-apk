package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o00O00;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0050f extends o00O00<an, an> {
    private static int a = 0;
    private static int b = 1;

    public void d(Object obj, int i, int i2) {
        an anVar;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 ^ 43) + ((i5 & 43) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            anVar = (an) obj;
            i3 = (i >> 5) & 4;
        } else {
            anVar = (an) obj;
            int i7 = i << 3;
            i3 = (i7 & 5) | (i7 ^ 5);
        }
        anVar.g(i3, Integer.valueOf(i2));
        int i8 = a;
        int i9 = i8 & 101;
        int i10 = (i9 - (~(-(-((i8 ^ 101) | i9))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void i(Object obj, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ((an) obj).g(i << 3, Long.valueOf(j));
        int i6 = b;
        int i7 = i6 & 25;
        int i8 = (i6 ^ 25) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public Object j(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        an anVar = ((S) obj).unknownFields;
        int i5 = a + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
        return anVar;
    }

    public void o(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-72)) | ((~i2) & 71)) + ((i2 & 71) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            ((S) obj).unknownFields = (an) obj2;
            int i4 = 85 / 0;
        } else {
            ((S) obj).unknownFields = (an) obj2;
        }
        int i5 = (-2) - ((a + 80) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public Object p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 66) + (i2 | 66)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        an anVarD = an.d();
        int i5 = a;
        int i6 = i5 & 83;
        int i7 = (i6 - (~(-(-((i5 ^ 83) | i6))))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return anVarD;
        }
        throw null;
    }

    public boolean r(ag agVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 59;
        int i4 = -(-((i2 ^ 59) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 & 85) + (i2 | 85);
        b = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public Object t(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
        b = i3 % 128;
        int i4 = i3 % 2;
        an anVar = (an) obj;
        anVar.h = false;
        int i5 = a;
        int i6 = ((i5 ^ 95) | (i5 & 95)) << 1;
        int i7 = -(((~i5) & 95) | (i5 & (-96)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return anVar;
    }

    public void e(Object obj, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 55) | (i3 & 55)) << 1;
        int i5 = -(((~i3) & 55) | (i3 & (-56)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i << 3;
        int i9 = i8 & 1;
        int i10 = (i8 | 1) & (~i9);
        ((an) obj).g((i10 & i9) | (i10 ^ i9), Long.valueOf(j));
        int i11 = b;
        int i12 = i11 & 29;
        int i13 = (i11 ^ 29) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public void f(Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 23) + ((i3 & 23) << 1);
        a = i4 % 128;
        Object obj3 = null;
        if (i4 % 2 != 0) {
            obj3.hashCode();
            throw null;
        }
        int i5 = i << 3;
        ((an) obj).g((i5 & 3) | (i5 & (-4)) | ((~i5) & 3), (an) obj2);
        int i6 = b;
        int i7 = i6 & 103;
        int i8 = (i7 - (~(-(-((i6 ^ 103) | i7))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void g(Object obj, int i, AbstractC0069z abstractC0069z) {
        an anVar;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 47) << 1) - (i5 ^ 47);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            anVar = (an) obj;
            int i7 = i - 2;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            int i9 = i8 ^ 5;
            int i10 = i8 & 5;
            i2 = i9 ^ i10;
            i3 = i9 & i10;
        } else {
            anVar = (an) obj;
            int i11 = i << 3;
            i2 = i11 ^ 2;
            i3 = i11 & 2;
        }
        anVar.g(i3 | i2, abstractC0069z);
    }

    public Object h(Object obj) {
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        S s = (S) obj;
        an anVarD = s.unknownFields;
        if (anVarD == an.c) {
            int i4 = b;
            int i5 = ((i4 | 17) << 1) - (i4 ^ 17);
            a = i5 % 128;
            int i6 = i5 % 2;
            anVarD = an.d();
            s.unknownFields = anVarD;
            int i7 = b;
            int i8 = (-2) - (((i7 ^ 44) + ((i7 & 44) << 1)) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = (i10 ^ 117) + ((i10 & 117) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return anVarD;
        }
        throw null;
    }

    public int k(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 88) << 1) - (i2 ^ 88)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            ((an) obj).f();
            throw null;
        }
        int iF = ((an) obj).f();
        int i4 = a;
        int i5 = i4 & 45;
        int i6 = (i4 | 45) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 79 / 0;
        }
        return iF;
    }

    public void l(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = ((i2 ^ 13) | i3) << 1;
        int i5 = -((i2 | 13) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ((S) obj).unknownFields.h = false;
        int i8 = a;
        int i9 = i8 & 19;
        int i10 = (i9 - (~((i8 ^ 19) | i9))) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public void q(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 23) | (i2 & 23)) << 1) - (((~i2) & 23) | (i2 & (-24)));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            ((S) obj).unknownFields = (an) obj2;
            return;
        }
        ((S) obj).unknownFields = (an) obj2;
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public void u(Object obj, InterfaceC0051g interfaceC0051g) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = (i2 | 29) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ((an) obj).h(interfaceC0051g);
        int i8 = a;
        int i9 = (((i8 ^ 23) | (i8 & 23)) << 1) - (((~i8) & 23) | (i8 & (-24)));
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public int c(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (i3 - (~((i2 ^ 19) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = ((an) obj).g;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        an anVar = (an) obj;
        int i6 = anVar.g;
        if (i6 == -1) {
            int i7 = b;
            int i8 = (i7 ^ 39) + ((i7 & 39) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = (-2) - ((i9 + 114) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            i6 = 0;
            int i13 = 0;
            while (i13 < anVar.d) {
                int i14 = a + 107;
                b = i14 % 128;
                int i15 = i14 % 2;
                int i16 = anVar.e[i13];
                Object[] objArr = anVar.f;
                int i17 = b;
                int i18 = i17 & 67;
                int i19 = -(-((i17 ^ 67) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                AbstractC0069z abstractC0069z = (AbstractC0069z) objArr[i13];
                int iBT = AbstractC0064u.bT(1);
                int i22 = b;
                int i23 = (i22 ^ 43) + ((i22 & 43) << 1);
                a = i23 % 128;
                int i24 = 4;
                int iBS = i23 % 2 != 0 ? AbstractC0064u.bS(4, i16 % 3) : AbstractC0064u.bS(2, i16 >>> 3);
                int i25 = b;
                int i26 = ((i25 & (-10)) | ((~i25) & 9)) + ((i25 & 9) << 1);
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    i24 = 3;
                }
                int iBE = AbstractC0064u.bE(i24, abstractC0069z);
                int i27 = b;
                int i28 = (i27 | 115) << 1;
                int i29 = -(((~i27) & 115) | (i27 & (-116)));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = i30 % 128;
                a = i31;
                int i32 = i30 % 2;
                int i33 = -(-(iBT * 2));
                int i34 = iBS & i33;
                i6 += iBE + ((i34 - (~((iBS ^ i33) | i34))) - 1);
                int i35 = i13 & 118;
                int i36 = (i13 ^ 118) | i35;
                int i37 = (i35 & i36) + (i36 | i35);
                int i38 = (i37 & 116) | ((~i37) & (-117));
                int i39 = -(-((i37 & (-117)) << 1));
                i13 = (i38 | i39) + (i38 & i39);
                int i40 = i31 ^ 89;
                int i41 = ((i31 & 89) | i40) << 1;
                int i42 = -i40;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                b = i43 % 128;
                int i44 = i43 % 2;
            }
            anVar.g = i6;
            int i45 = a;
            int i46 = (i45 & 123) + (i45 | 123);
            b = i46 % 128;
            int i47 = i46 % 2;
        }
        int i48 = a;
        int i49 = i48 & 65;
        int i50 = (i48 | 65) & (~i49);
        int i51 = -(-(i49 << 1));
        int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
        b = i52 % 128;
        if (i52 % 2 == 0) {
            int i53 = 90 / 0;
        }
        return i6;
    }

    public void s(Object obj, InterfaceC0051g interfaceC0051g) {
        an anVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (i2 ^ 57) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = 0;
        if (i5 % 2 != 0) {
            anVar = (an) obj;
            Objects.requireNonNull(anVar);
            Objects.requireNonNull(interfaceC0051g);
            int i7 = 33 / 0;
        } else {
            anVar = (an) obj;
            Objects.requireNonNull(anVar);
            Objects.requireNonNull(interfaceC0051g);
        }
        int i8 = b;
        int i9 = (-2) - (((i8 & 36) + (i8 | 36)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        while (i6 < anVar.d) {
            int i11 = b + 17;
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = anVar.e[i6];
            Object obj2 = anVar.f[i6];
            int i14 = b;
            int i15 = ((i14 ^ 83) - (~((i14 & 83) << 1))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            ((C0055l) interfaceC0051g).h(i13 >>> 3, obj2);
            int i17 = i6 & 1;
            i6 = (i17 - (~(-(-((i6 ^ 1) | i17))))) - 1;
            int i18 = b;
            int i19 = i18 & 61;
            int i20 = (i18 | 61) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 3 / 2;
            }
        }
        int i24 = a;
        int i25 = (i24 & (-96)) | ((~i24) & 95);
        int i26 = -(-((i24 & 95) << 1));
        int i27 = (i25 & i26) + (i26 | i25);
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    public Object m(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 101;
        int i6 = ((i4 | 101) & (~i5)) + (i5 << 1);
        a = i6 % 128;
        Object obj3 = null;
        if (i6 % 2 != 0) {
            an anVar = an.c;
            obj3.hashCode();
            throw null;
        }
        an anVar2 = (an) obj;
        an anVar3 = (an) obj2;
        an anVar4 = an.c;
        int i7 = b + 73;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            anVar3.equals(anVar4);
            throw null;
        }
        if (!anVar3.equals(anVar4)) {
            int i8 = a;
            int i9 = i8 | 81;
            int i10 = ((i9 << 1) - (~(-((~(i8 & 81)) & i9)))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = anVar2.d;
            int i13 = anVar3.d;
            int i14 = ((~i13) & i12) | ((~i12) & i13);
            int i15 = (i12 & i13) << 1;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = a + 39;
            b = i17 % 128;
            int i18 = i17 % 2;
            int[] iArrCopyOf = Arrays.copyOf(anVar2.e, i16);
            int[] iArr = anVar3.e;
            int i19 = b + 39;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                i = anVar2.d;
                i2 = anVar3.d;
            } else {
                i = anVar2.d;
                i2 = anVar3.d;
            }
            int i20 = b + 81;
            a = i20 % 128;
            if (i20 % 2 != 0) {
                System.arraycopy(iArr, 0, iArrCopyOf, i, i2);
                Arrays.copyOf(anVar2.f, i16);
                throw null;
            }
            System.arraycopy(iArr, 0, iArrCopyOf, i, i2);
            Object[] objArrCopyOf = Arrays.copyOf(anVar2.f, i16);
            System.arraycopy(anVar3.f, 0, objArrCopyOf, anVar2.d, anVar3.d);
            anVar2 = new an(i16, iArrCopyOf, objArrCopyOf, true);
            int i21 = b;
            int i22 = (i21 & 51) + (i21 | 51);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
        }
        int i23 = b;
        int i24 = i23 & 125;
        int i25 = (i23 | 125) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return anVar2;
        }
        obj3.hashCode();
        throw null;
    }
}
