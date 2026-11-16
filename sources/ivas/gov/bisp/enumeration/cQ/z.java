package ivas.gov.bisp.enumeration.cQ;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.J;
import ivas.gov.bisp.enumeration.cP.R;
import ivas.gov.bisp.enumeration.cP.S;
import ivas.gov.bisp.enumeration.cP.am;
import ivas.gov.bisp.enumeration.cP.u;
import ivas.gov.bisp.enumeration.cP.x;
import ivas.gov.bisp.enumeration.cR.N;
import ivas.gov.bisp.enumeration.p096p.h;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements am, Comparable<z>, Serializable {
    private static int a = 1;
    private static int b;
    public volatile int c;

    public z(int i) {
        this.c = i;
    }

    @Override // ivas.gov.bisp.enumeration.cP.am
    public abstract S d();

    @Override // ivas.gov.bisp.enumeration.cP.am
    public int e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i != 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        int i6 = i3 | 91;
        int i7 = i6 << 1;
        int i8 = -(i6 & (~(i3 & 91)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = this.c;
        int i12 = a;
        int i13 = i12 & 53;
        int i14 = -(-((i12 ^ 53) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        return i11;
    }

    public abstract x f();

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = ((i2 & 123) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.c;
        int iHashCode = f().hashCode();
        int i9 = a;
        int i10 = i9 & 11;
        int i11 = (i9 ^ 11) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        int i13 = i12 % 128;
        b = i13;
        int i14 = i12 % 2;
        int i15 = -(-i8);
        int i16 = ((~i15) & 459) | (i15 & (-460));
        int i17 = (i15 & 459) << 1;
        int i18 = -(-(((i16 ^ i17) + ((i17 & i16) << 1)) * 27));
        int i19 = iHashCode & i18;
        int i20 = (((i18 | iHashCode) & (~i19)) - (~(i19 << 1))) - 1;
        int i21 = i13 & 49;
        int i22 = -(-((i13 ^ 49) | i21));
        int i23 = (i21 & i22) + (i21 | i22);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return i20;
        }
        throw null;
    }

    @Override // java.lang.Comparable
    public int compareTo(z zVar) {
        int i = 2 % 2;
        int i2 = b + 37;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zVar.getClass();
            throw null;
        }
        z zVar2 = zVar;
        if (zVar2.getClass() != getClass()) {
            StringBuilder sb = new StringBuilder();
            Class<?> cls = getClass();
            int i3 = b + 89;
            a = i3 % 128;
            int i4 = i3 % 2;
            sb.append(cls);
            sb.append(" cannot be compared to ");
            sb.append(zVar2.getClass());
            throw new ClassCastException(sb.toString());
        }
        int i5 = zVar2.c;
        int i6 = this.c;
        int i7 = a;
        int i8 = 1;
        int i9 = ((i7 | 107) << 1) - (i7 ^ 107);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i6 > i5) {
            int i11 = (i10 ^ 65) + ((i10 & 65) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 4;
            }
        } else if (i6 < i5) {
            int i13 = (i7 & (-98)) | ((~i7) & 97);
            int i14 = -(-((i7 & 97) << 1));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i16 = i7 & 101;
            int i17 = (((~i16) & (i7 | 101)) - (~(-(-(i16 << 1))))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            i8 = -1;
        } else {
            int i19 = i7 + 75;
            b = i19 % 128;
            int i20 = i19 % 2;
            i8 = 0;
        }
        int i21 = a + 119;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return i8;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        am amVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 97;
        int i6 = ((i4 & 97) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            if (this != obj) {
                z = false;
                if (obj instanceof am) {
                    int i10 = ((i9 ^ 11) | (i9 & 11)) << 1;
                    int i11 = -(((~i9) & 11) | (i9 & (-12)));
                    int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                    int i13 = i12 % 128;
                    a = i13;
                    int i14 = i12 % 2;
                    int i15 = (((i13 & (-30)) | ((~i13) & 29)) - (~(-(-((i13 & 29) << 1))))) - 1;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    return false;
                }
                amVar = (am) obj;
                if (amVar.d() == d()) {
                    int i17 = a;
                    int i18 = (i17 & (-58)) | ((~i17) & 57);
                    int i19 = -(-((i17 & 57) << 1));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    if (amVar.e(0) != this.c) {
                        int i22 = a;
                        int i23 = i22 & 99;
                        int i24 = ((((i22 ^ 99) | i23) << 1) - (~(-((i22 | 99) & (~i23))))) - 1;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        z = false;
                    }
                } else {
                    int i26 = a;
                    int i27 = i26 & 99;
                    int i28 = ((((i26 ^ 99) | i27) << 1) - (~(-((i26 | 99) & (~i27))))) - 1;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    z = false;
                }
                int i30 = a;
                int i31 = ((i30 | 42) << 1) - (i30 ^ 42);
                i2 = (i31 ^ (-1)) + (i31 << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i32 = 33 / 0;
                }
                return z;
            }
            int i33 = (i9 | 111) << 1;
            int i34 = -(i9 ^ 111);
            int i35 = (i33 & i34) + (i33 | i34);
            a = i35 % 128;
            int i36 = i35 % 2;
            i = ((i9 ^ 114) + ((i9 & 114) << 1)) - 1;
            a = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            z = true;
            if (obj instanceof am) {
                int i110 = ((i9 ^ 11) | (i9 & 11)) << 1;
                int i111 = -(((~i9) & 11) | (i9 & (-12)));
                int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                int i113 = i112 % 128;
                a = i113;
                int i114 = i112 % 2;
                int i115 = (((i113 & (-30)) | ((~i113) & 29)) - (~(-(-((i113 & 29) << 1))))) - 1;
                b = i115 % 128;
                int i116 = i115 % 2;
                return false;
            }
            amVar = (am) obj;
            if (amVar.d() == d()) {
                int i117 = a;
                int i118 = (i117 & (-58)) | ((~i117) & 57);
                int i119 = -(-((i117 & 57) << 1));
                int i210 = ((i118 | i119) << 1) - (i119 ^ i118);
                b = i210 % 128;
                int i211 = i210 % 2;
                if (amVar.e(0) != this.c) {
                    int i212 = a;
                    int i213 = i212 & 99;
                    int i214 = ((((i212 ^ 99) | i213) << 1) - (~(-((i212 | 99) & (~i213))))) - 1;
                    b = i214 % 128;
                    int i215 = i214 % 2;
                    z = false;
                }
            } else {
                int i216 = a;
                int i217 = i216 & 99;
                int i218 = ((((i216 ^ 99) | i217) << 1) - (~(-((i216 | 99) & (~i217))))) - 1;
                b = i218 % 128;
                int i219 = i218 % 2;
                z = false;
            }
            int i37 = a;
            int i38 = ((i37 | 42) << 1) - (i37 ^ 42);
            i2 = (i38 ^ (-1)) + (i38 << 1);
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i39 = 33 / 0;
            }
            return z;
        }
        int i310 = (i9 | 111) << 1;
        int i311 = -(i9 ^ 111);
        int i312 = (i310 & i311) + (i310 | i311);
        a = i312 % 128;
        int i313 = i312 % 2;
        i = ((i9 ^ 114) + ((i9 & 114) << 1)) - 1;
        a = i % 128;
        if (i % 2 != 0) {
            return true;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public static int c(R r, R r2, x xVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-94)) | ((~i2) & 93);
        int i4 = (i2 & 93) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (r != null) {
            int i7 = i2 + 67;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (r2 != null) {
                int i9 = ((i2 | 49) << 1) - (i2 ^ 49);
                b = i9 % 128;
                int i10 = i9 % 2;
                AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
                h hVarB = r.b();
                if (hVarB == null) {
                    int i11 = b;
                    int i12 = (i11 & 31) + (i11 | 31);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    hVarB = N.bz();
                    int i14 = b;
                    int i15 = i14 & 103;
                    int i16 = (((i14 | 103) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                }
                J jC = xVar.c(hVarB);
                long jS = r2.s();
                long jS2 = r.s();
                int i18 = b;
                int i19 = (i18 ^ 55) + ((i18 & 55) << 1);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    return jC.e(jS, jS2);
                }
                jC.e(jS, jS2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }
}
