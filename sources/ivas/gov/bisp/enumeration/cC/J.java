package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final int d;
    public final int e;
    public final C0278x f;

    public J(C0278x c0278x) {
        int iD;
        int i;
        Objects.requireNonNull(c0278x, "treeDigest == null");
        this.f = c0278x;
        ivas.gov.bisp.enumeration.p101x.i iVarB = P.b(c0278x);
        String strC = iVarB.c();
        if (strC.equals("SHAKE128")) {
            int i2 = b;
            int i3 = ((i2 | 78) << 1) - (i2 ^ 78);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            iD = 32;
        } else {
            if (strC.equals("SHAKE256")) {
                int i7 = a;
                int i8 = (i7 & (-36)) | ((~i7) & 35);
                int i9 = (i7 & 35) << 1;
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                iD = i10 % 2 == 0 ? 35 : 64;
            } else {
                iD = iVarB.d();
                int i11 = b;
                int i12 = i11 & 89;
                int i13 = ((i11 ^ 89) | i12) << 1;
                int i14 = -((i11 | 89) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                }
            }
            int i16 = 2 % 2;
        }
        this.c = iD;
        this.d = 16;
        int i17 = b;
        int i18 = i17 & 95;
        int i19 = ((((i17 ^ 95) | i18) << 1) - (~(-((i17 | 95) & (~i18))))) - 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        double dCeil = Math.ceil(((double) (iD * 8)) / ((double) v.b(16)));
        int i21 = b;
        int i22 = (i21 | 15) << 1;
        int i23 = -(((~i21) & 15) | (i21 & (-16)));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = (int) dCeil;
        int iB = v.b(i26 * 15);
        int iB2 = v.b(16);
        int i27 = b;
        int i28 = ((i27 & 96) + (i27 | 96)) - 1;
        a = i28 % 128;
        if (i28 % 2 != 0) {
            i = (iB - iB2) >>> i26;
        } else {
            int i29 = iB / iB2;
            int i30 = i29 ^ 1;
            int i31 = (((i29 & 1) | i30) << 1) - i30;
            int i32 = -(-i26);
            i = ((i31 & i32) - (~(i32 | i31))) - 1;
        }
        this.e = i;
        String strC2 = iVarB.c();
        Map<String, C0236o> map = C0236o.c;
        int i33 = a;
        int i34 = i33 | 61;
        int i35 = i34 << 1;
        int i36 = -((~(i33 & 61)) & i34);
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        b = i37 % 128;
        int i38 = i37 % 2;
        Objects.requireNonNull(strC2, "algorithmName == null");
        Map<String, C0236o> map2 = C0236o.c;
        int i39 = a;
        int i40 = (i39 & 33) + (i39 | 33);
        b = i40 % 128;
        if (i40 % 2 != 0 ? map2.get(C0236o.c(strC2, iD, 16, i)) == null : map2.get(C0236o.c(strC2, iD, 75, i)) == null) {
            StringBuilder sbW = j.w("cannot find OID for digest algorithm: ");
            sbW.append(iVarB.c());
            throw new IllegalArgumentException(sbW.toString());
        }
        int i41 = a;
        int i42 = ((i41 | 41) << 1) - (i41 ^ 41);
        b = i42 % 128;
        int i43 = i42 % 2;
    }
}
