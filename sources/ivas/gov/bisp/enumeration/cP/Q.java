package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Objects;
import org.joda.convert.ToString;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends ivas.gov.bisp.enumeration.cQ.z {
    private static int a = 0;
    private static int b = 1;
    public static final Q e = new Q(0);
    public static final Q f = new Q(1);
    public static final Q h = new Q(2);
    public static final Q g = new Q(3);
    public static final Q i = new Q(4);
    public static final Q j = new Q(5);
    public static final Q d = new Q(6);
    public static final Q k = new Q(7);
    public static final Q l = new Q(8);
    public static final Q m = new Q(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Q f79o = new Q(10);
    public static final Q n = new Q(11);
    public static final Q p = new Q(12);
    public static final Q q = new Q(Integer.MAX_VALUE);
    public static final Q r = new Q(Integer.MIN_VALUE);

    static {
        e eVarAb = r.ab();
        S.d();
        int i2 = b;
        int i3 = (i2 & 108) + (i2 | 108);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Objects.requireNonNull(eVarAb);
            int i5 = 94 / 0;
        } else {
            Objects.requireNonNull(eVarAb);
        }
        int i6 = a;
        int i7 = ((i6 ^ 41) | (i6 & 41)) << 1;
        int i8 = -(((~i6) & 41) | (i6 & (-42)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public Q(int i2) {
        super(i2);
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z, ivas.gov.bisp.enumeration.cP.am
    public final S d() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 21;
        int i5 = (i3 | 21) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        S sD = S.d();
        int i9 = b;
        int i10 = i9 ^ 63;
        int i11 = (i9 & 63) << 1;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 12 / 0;
        }
        return sD;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z
    public final x f() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = (i3 ^ 69) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        x xVar = x.h;
        int i8 = a;
        int i9 = i8 ^ 59;
        int i10 = ((((i8 & 59) | i9) << 1) - (~(-i9))) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return xVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ToString
    public final String toString() {
        StringBuilder sbW;
        String strValueOf;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = (i3 | 25) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            sbW = j.w("P");
            strValueOf = String.valueOf(this.c);
            int i8 = 55 / 0;
        } else {
            sbW = j.w("P");
            strValueOf = String.valueOf(this.c);
        }
        sbW.append(strValueOf);
        sbW.append("M");
        String string = sbW.toString();
        int i9 = a;
        int i10 = i9 & 41;
        int i11 = -(-((i9 ^ 41) | i10));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Q g(R r2, R r3) {
        Q q2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-26)) | ((~i3) & 25);
        int i5 = -(-((i3 & 25) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.cQ.z.c(r2, r3, x.h);
            throw null;
        }
        int iC = ivas.gov.bisp.enumeration.cQ.z.c(r2, r3, x.h);
        if (iC != Integer.MIN_VALUE) {
            int i7 = b;
            int i8 = i7 & 23;
            int i9 = ((~i8) & (i7 | 23)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (iC != Integer.MAX_VALUE) {
                int i11 = (((i7 | 20) << 1) - (i7 ^ 20)) - 1;
                int i12 = i11 % 128;
                a = i12;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                switch (iC) {
                    case 0:
                        q2 = e;
                        int i13 = i7 & 29;
                        int i14 = i7 | 29;
                        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                        a = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 4 % 4;
                        }
                        break;
                    case 1:
                        q2 = f;
                        int i17 = i7 & 117;
                        int i18 = (i7 ^ 117) | i17;
                        int i19 = (i17 & i18) + (i18 | i17);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        break;
                    case 2:
                        q2 = h;
                        int i21 = ((i12 & 78) + (i12 | 78)) - 1;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        break;
                    case 3:
                        q2 = g;
                        int i23 = (((i12 | 114) << 1) - (i12 ^ 114)) - 1;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        break;
                    case 4:
                        q2 = i;
                        int i25 = i12 + 67;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        break;
                    case 5:
                        q2 = j;
                        int i27 = ((i12 ^ 107) | (i12 & 107)) << 1;
                        int i28 = -((i12 & (-108)) | ((~i12) & 107));
                        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            int i30 = 4 / 2;
                        }
                        break;
                    case 6:
                        q2 = d;
                        int i31 = (-2) - ((i7 + 112) ^ (-1));
                        a = i31 % 128;
                        if (i31 % 2 != 0) {
                            int i32 = 2 / 5;
                        }
                        break;
                    case 7:
                        q2 = k;
                        int i33 = (((i7 | 36) << 1) - (i7 ^ 36)) - 1;
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        break;
                    case 8:
                        q2 = l;
                        int i35 = i12 & 91;
                        int i36 = i35 + ((i12 ^ 91) | i35);
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        break;
                    case 9:
                        q2 = m;
                        int i38 = i12 & 79;
                        int i39 = -(-((i12 ^ 79) | i38));
                        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        break;
                    case 10:
                        q2 = f79o;
                        int i42 = (i7 ^ 68) + ((i7 & 68) << 1);
                        int i43 = (i42 ^ (-1)) + (i42 << 1);
                        a = i43 % 128;
                        if (i43 % 2 != 0) {
                            int i44 = 3 / 3;
                        }
                        break;
                    case 11:
                        q2 = n;
                        int i45 = (i12 & 7) + (i12 | 7);
                        b = i45 % 128;
                        int i46 = i45 % 2;
                        break;
                    case 12:
                        q2 = p;
                        int i47 = i12 + 7;
                        b = i47 % 128;
                        int i48 = i47 % 2;
                        break;
                    default:
                        Q q3 = new Q(iC);
                        int i49 = b;
                        int i50 = ((i49 & 50) + (i49 | 50)) - 1;
                        a = i50 % 128;
                        if (i50 % 2 != 0) {
                            int i51 = 3 / 2;
                        }
                        q2 = q3;
                        break;
                }
            } else {
                q2 = q;
                int i52 = ((i7 & 96) + (i7 | 96)) - 1;
                a = i52 % 128;
                int i53 = i52 % 2;
            }
        } else {
            q2 = r;
            int i54 = b + 35;
            a = i54 % 128;
            int i55 = i54 % 2;
        }
        int i56 = b + 49;
        a = i56 % 128;
        if (i56 % 2 == 0) {
            return q2;
        }
        obj.hashCode();
        throw null;
    }
}
