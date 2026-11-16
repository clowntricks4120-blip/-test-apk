package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Objects;
import org.joda.convert.ToString;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cP.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0245o extends ivas.gov.bisp.enumeration.cQ.z {
    private static int a = 1;
    private static int b;
    public static final C0245o m;
    public static final C0245o e = new C0245o(0);
    public static final C0245o f = new C0245o(1);
    public static final C0245o h = new C0245o(2);
    public static final C0245o g = new C0245o(3);
    public static final C0245o i = new C0245o(4);
    public static final C0245o j = new C0245o(5);
    public static final C0245o d = new C0245o(6);
    public static final C0245o k = new C0245o(7);
    public static final C0245o l = new C0245o(Integer.MAX_VALUE);

    static {
        C0245o c0245o = new C0245o(Integer.MIN_VALUE);
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        m = c0245o;
        e eVarAb = r.ab();
        S.c();
        Objects.requireNonNull(eVarAb);
        int i7 = a;
        int i8 = ((i7 ^ 24) + ((i7 & 24) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0245o(int i2) {
        super(i2);
    }

    public static C0245o g(R r, R r2) {
        C0245o c0245o;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 35;
        int i7 = (i5 ^ 35) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int iC = ivas.gov.bisp.enumeration.cQ.z.c(r, r2, x.c);
        if (iC != Integer.MIN_VALUE) {
            int i10 = a;
            int i11 = ((i10 & 62) + (i10 | 62)) - 1;
            int i12 = i11 % 128;
            b = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (iC != Integer.MAX_VALUE) {
                switch (iC) {
                    case 0:
                        c0245o = e;
                        int i13 = (((i12 ^ 21) | (i12 & 21)) << 1) - ((i12 & (-22)) | ((~i12) & 21));
                        a = i13 % 128;
                        int i14 = i13 % 2;
                        break;
                    case 1:
                        c0245o = f;
                        int i15 = ((i10 & (-32)) | ((~i10) & 31)) + ((i10 & 31) << 1);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 5 % 3;
                        }
                        break;
                    case 2:
                        c0245o = h;
                        i2 = ((((i10 ^ 65) | (i10 & 65)) << 1) - (~(-(((~i10) & 65) | (i10 & (-66)))))) - 1;
                        b = i2 % 128;
                        break;
                    case 3:
                        c0245o = g;
                        int i17 = ((i10 | 9) << 1) - (i10 ^ 9);
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        break;
                    case 4:
                        c0245o = i;
                        int i19 = (i10 ^ 7) + ((i10 & 7) << 1);
                        b = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i20 = 5 % 4;
                        }
                        break;
                    case 5:
                        c0245o = j;
                        i3 = i10 + 67;
                        b = i3 % 128;
                        int i21 = i3 % 2;
                        break;
                    case 6:
                        c0245o = d;
                        i3 = (i12 & 37) + (i12 | 37);
                        a = i3 % 128;
                        int i22 = i3 % 2;
                        break;
                    case 7:
                        c0245o = k;
                        int i23 = i10 + 17;
                        b = i23 % 128;
                        if (i23 % 2 != 0) {
                            int i24 = 4 % 4;
                        }
                        break;
                    default:
                        C0245o c0245o2 = new C0245o(iC);
                        int i25 = a;
                        int i26 = (i25 & 31) + (i25 | 31);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        c0245o = c0245o2;
                        break;
                }
            } else {
                c0245o = l;
                int i28 = i12 & 27;
                i2 = ((~i28) & (i12 | 27)) + (i28 << 1);
                a = i2 % 128;
            }
            int i29 = i2 % 2;
        } else {
            c0245o = m;
            int i30 = a;
            int i31 = (((i30 ^ 13) | (i30 & 13)) << 1) - (((~i30) & 13) | (i30 & (-14)));
            b = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = b;
        int i34 = i33 & 91;
        int i35 = ((i33 | 91) & (~i34)) + (i34 << 1);
        a = i35 % 128;
        int i36 = i35 % 2;
        return c0245o;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z, ivas.gov.bisp.enumeration.cP.am
    public final S d() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = -(-((i3 ^ 69) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        S sC = S.c();
        if (i7 != 0) {
            int i8 = 97 / 0;
        }
        return sC;
    }

    @Override // ivas.gov.bisp.enumeration.cQ.z
    public final x f() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 102) + ((i3 & 102) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        x xVar = x.c;
        int i7 = a + 89;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return xVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ToString
    public final String toString() {
        StringBuilder sbW;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 | 98) << 1) - (i4 ^ 98)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            sbW = j.w("P");
            i2 = this.c;
            int i6 = 72 / 0;
        } else {
            sbW = j.w("P");
            i2 = this.c;
        }
        int i7 = a;
        int i8 = (i7 ^ 75) + ((i7 & 75) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            sbW.append(String.valueOf(i2));
            sbW.append("D");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sbW.append(String.valueOf(i2));
        sbW.append("D");
        String string = sbW.toString();
        int i9 = b + 65;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 63 / 0;
        }
        return string;
    }
}
