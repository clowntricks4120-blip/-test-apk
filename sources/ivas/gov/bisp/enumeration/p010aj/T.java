package ivas.gov.bisp.enumeration.p010aj;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class T<F, S> {
    private static int a = 0;
    private static int b = 1;
    public final F c;
    public final S d;

    public T(F f, S s) {
        this.c = f;
        this.d = s;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0094 A[PHI: r6
  0x0094: PHI (r6v1 boolean) = (r6v0 boolean), (r6v2 boolean) binds: [B:11:0x0059, B:17:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean equals(Object obj) {
        S s;
        S s2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 21;
        int i4 = -(-((i2 ^ 21) | i3));
        int i5 = i3 ^ i4;
        int i6 = i3 & i4;
        boolean z = true;
        int i7 = i5 + (i6 << 1);
        int i8 = i7 % 128;
        a = i8;
        Object obj2 = null;
        if (i7 % 2 != 0) {
            boolean z2 = obj instanceof T;
            throw null;
        }
        boolean z3 = false;
        if (!(obj instanceof T)) {
            int i9 = (-2) - ((((i2 | 66) << 1) - (i2 ^ 66)) ^ (-1));
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i2 & 17;
            int i12 = (((i2 | 17) & (~i11)) - (~(i11 << 1))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 26 / 0;
            }
            return false;
        }
        T t = (T) obj;
        F f = t.c;
        F f2 = this.c;
        int i14 = ((i8 | 5) << 1) - (i8 ^ 5);
        b = i14 % 128;
        int i15 = i14 % 2;
        if (Objects.equals(f, f2)) {
            int i16 = b;
            int i17 = i16 & 29;
            int i18 = (i16 | 29) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                s = t.d;
                s2 = this.d;
                z3 = true;
            } else {
                s = t.d;
                s2 = this.d;
            }
            if (Objects.equals(s, s2)) {
                int i21 = b + 47;
                int i22 = i21 % 128;
                a = i22;
                int i23 = i21 % 2;
                int i24 = ((i22 & 54) + (i22 | 54)) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
            } else {
                z = z3;
            }
        } else {
            z = z3;
        }
        int i26 = a + 69;
        b = i26 % 128;
        if (i26 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        F f = this.c;
        int i8 = 0;
        if (f == null) {
            int i9 = (i6 & 107) + (i6 | 107);
            a = i9 % 128;
            int i10 = i9 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
            int i11 = b + 85;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 5;
            }
        }
        S s = this.d;
        if (s != null) {
            int i13 = b;
            int i14 = (((i13 | 10) << 1) - (i13 ^ 10)) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                iHashCode2 = s.hashCode();
                int i15 = 47 / 0;
            } else {
                iHashCode2 = s.hashCode();
            }
            i8 = iHashCode2;
        }
        int i16 = ((~iHashCode) & i8) | ((~i8) & iHashCode);
        int i17 = b;
        int i18 = ((i17 | 23) << 1) - (i17 ^ 23);
        a = i18 % 128;
        int i19 = i18 % 2;
        return i16;
    }

    public String toString() {
        StringBuilder sbW;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 90) + ((i2 & 90) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            sbW = j.w("Pair{");
            sbW.append(this.c);
            int i4 = 23 / 0;
        } else {
            sbW = j.w("Pair{");
            sbW.append(this.c);
        }
        sbW.append(" ");
        S s = this.d;
        int i5 = a;
        int i6 = i5 & 95;
        int i7 = (i5 ^ 95) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        sbW.append(s);
        sbW.append("}");
        int i10 = a;
        int i11 = (i10 & (-4)) | ((~i10) & 3);
        int i12 = -(-((i10 & 3) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return sbW.toString();
        }
        sbW.toString();
        throw null;
    }
}
