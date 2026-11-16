package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Objects;
import org.joda.convert.ToString;

/* JADX INFO: loaded from: classes.dex */
public final class C extends ivas.gov.bisp.enumeration.cQ.z {
    private static int a = 1;
    private static int b;
    public static final C d = new C(0);
    public static final C e = new C(1);
    public static final C g = new C(2);
    public static final C f = new C(3);
    public static final C h = new C(Integer.MAX_VALUE);
    public static final C i = new C(Integer.MIN_VALUE);

    static {
        int i2 = a;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            e eVarAb = r.ab();
            S.e();
            Objects.requireNonNull(eVarAb);
        } else {
            e eVarAb2 = r.ab();
            S.e();
            Objects.requireNonNull(eVarAb2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public C(int i2) {
        super(i2);
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z, ivas.gov.bisp.enumeration.cP.am
    public final S d() {
        int i2 = 2 % 2;
        int i3 = b + 81;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return S.e();
        }
        S.e();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z
    public final x f() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 93) + (i3 | 93);
        a = i4 % 128;
        int i5 = i4 % 2;
        x xVar = x.f;
        if (i5 == 0) {
            int i6 = 50 / 0;
        }
        return xVar;
    }

    @ToString
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 117) | (i3 & 117)) << 1;
        int i5 = -(((~i3) & 117) | (i3 & (-118)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = j.w("P");
        int i8 = this.c;
        int i9 = a;
        int i10 = i9 & 125;
        int i11 = (((i9 ^ 125) | i10) << 1) - ((i9 | 125) & (~i10));
        b = i11 % 128;
        int i12 = i11 % 2;
        sbW.append(String.valueOf(i8));
        sbW.append("Y");
        int i13 = a;
        int i14 = (i13 & (-40)) | ((~i13) & 39);
        int i15 = -(-((i13 & 39) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return sbW.toString();
        }
        String string = sbW.toString();
        int i17 = 51 / 0;
        return string;
    }

    public static C g(R r, R r2) {
        C c;
        C c2;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-84)) | ((~i4) & 83);
        int i6 = -(-((i4 & 83) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int iC = ivas.gov.bisp.enumeration.cQ.z.c(r, r2, x.f);
        if (iC != Integer.MIN_VALUE) {
            int i9 = b;
            int i10 = i9 & 61;
            int i11 = (~i10) & (i9 | 61);
            int i12 = -(-(i10 << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            int i14 = i13 % 128;
            a = i14;
            if (i13 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iC != Integer.MAX_VALUE) {
                if (iC != 0) {
                    int i15 = (i14 ^ 121) + ((i14 & 121) << 1);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    if (iC != 1) {
                        int i17 = i14 + 31;
                        int i18 = i17 % 128;
                        b = i18;
                        if (i17 % 2 == 0 ? iC == 2 : iC == 3) {
                            c2 = g;
                            int i19 = i18 & 21;
                            int i20 = -(-((i18 ^ 21) | i19));
                            int i21 = (i19 & i20) + (i20 | i19);
                            a = i21 % 128;
                            int i22 = i21 % 2;
                        } else {
                            int i23 = (i18 & 61) + (i18 | 61);
                            a = i23 % 128;
                            int i24 = i23 % 2;
                            if (iC != 3) {
                                c = new C(iC);
                                int i25 = b;
                                int i26 = (i25 & 23) + (i25 | 23);
                                a = i26 % 128;
                                int i27 = i26 % 2;
                            } else {
                                c2 = f;
                                i2 = ((i18 ^ 46) + ((i18 & 46) << 1)) - 1;
                            }
                        }
                    } else {
                        c = e;
                        int i28 = i14 ^ 83;
                        int i29 = ((i14 & 83) | i28) << 1;
                        int i30 = -i28;
                        int i31 = (i29 & i30) + (i30 | i29);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                    }
                } else {
                    c2 = d;
                    i2 = (i9 & 91) + (i9 | 91);
                }
                a = i2 % 128;
                int i33 = i2 % 2;
            } else {
                c2 = h;
                int i34 = (-2) - ((((i9 | 24) << 1) - (i9 ^ 24)) ^ (-1));
                a = i34 % 128;
                int i35 = i34 % 2;
            }
            c = c2;
        } else {
            c = i;
            int i36 = b;
            int i37 = (i36 ^ 117) + ((i36 & 117) << 1);
            a = i37 % 128;
            if (i37 % 2 == 0) {
                int i38 = 2 % 4;
            }
        }
        int i39 = a;
        int i40 = i39 & 39;
        int i41 = (((i39 | 39) & (~i40)) - (~(-(-(i40 << 1))))) - 1;
        b = i41 % 128;
        int i42 = i41 % 2;
        return c;
    }
}
