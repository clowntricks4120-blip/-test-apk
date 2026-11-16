package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.C0244m;
import ivas.gov.bisp.enumeration.cR.C0252t;
import ivas.gov.bisp.enumeration.cR.M;
import ivas.gov.bisp.enumeration.cR.N;
import ivas.gov.bisp.enumeration.cR.O;
import ivas.gov.bisp.enumeration.cR.l;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class L extends S implements V {
    private static int a = 1;
    private static int b;
    public static final L c = new L();

    static {
        int i = a;
        int i2 = ((i ^ 1) | (i & 1)) << 1;
        int i3 = -(((~i) & 1) | (i & (-2)));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public final Class<?> b() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 96) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 21;
        int i6 = (i5 - (~((i3 ^ 21) | i5))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return Calendar.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public final long d(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = (((i2 & 37) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return ((Calendar) obj).getTime().getTime();
        }
        ((Calendar) obj).getTime().getTime();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public final h c(Object obj, h hVar) {
        AbstractC0242a abstractC0242aF;
        h hVarBy;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 117;
        b = i4 % 128;
        C0244m c0244m = null;
        if (i4 % 2 != 0) {
            c0244m.hashCode();
            throw null;
        }
        if (hVar != null) {
            int i5 = i3 & 115;
            int i6 = (i3 ^ 115) | i5;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 74 / 0;
            }
            return hVar;
        }
        Calendar calendar = (Calendar) obj;
        try {
            abstractC0242aF = AbstractC0242a.e(calendar.getTimeZone());
            int i9 = a;
            int i10 = (i9 & 59) + (i9 | 59);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            int i11 = (i9 & 35) + (i9 | 35);
            b = i11 % 128;
            int i12 = i11 % 2;
        } catch (IllegalArgumentException unused) {
            abstractC0242aF = AbstractC0242a.f();
        }
        if (!calendar.getClass().getName().endsWith(".BuddhistCalendar")) {
            if (calendar instanceof GregorianCalendar) {
                int i13 = a;
                int i14 = i13 & 97;
                int i15 = ((i13 | 97) & (~i14)) + (i14 << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                long time = ((GregorianCalendar) calendar).getGregorianChange().getTime();
                int i17 = a;
                int i18 = ((i17 | 31) << 1) - (((~i17) & 31) | (i17 & (-32)));
                int i19 = i18 % 128;
                b = i19;
                int i20 = i18 % 2;
                if (time == Long.MIN_VALUE) {
                    int i21 = (i19 & 15) + (i19 | 15);
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        M.bA(abstractC0242aF);
                        throw null;
                    }
                    hVarBy = M.bA(abstractC0242aF);
                } else if (time == Long.MAX_VALUE) {
                    int i22 = (((i19 | 32) << 1) - (i19 ^ 32)) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    hVarBy = O.bA(abstractC0242aF);
                    int i24 = b + 77;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    C0244m c0244m2 = l.P;
                    if (time == -12219292800000L) {
                        int i26 = a;
                        int i27 = i26 & 97;
                        int i28 = ((((i26 ^ 97) | i27) << 1) - (~(-((i26 | 97) & (~i27))))) - 1;
                        b = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i29 = 16 / 0;
                        }
                    } else {
                        c0244m = new C0244m(time);
                        int i30 = b;
                        int i31 = (i30 & 90) + (i30 | 90);
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                    }
                    hVarBy = l.bz(abstractC0242aF, c0244m, 4);
                    int i34 = a;
                    i = (i34 & 27) + (i34 | 27);
                    b = i % 128;
                }
            } else {
                hVarBy = N.by(abstractC0242aF);
                int i35 = a;
                int i36 = ((i35 | 117) << 1) - (i35 ^ 117);
                b = i36 % 128;
                int i37 = i36 % 2;
            }
            int i38 = b;
            int i39 = ((i38 ^ 41) | (i38 & 41)) << 1;
            int i40 = -(((~i38) & 41) | (i38 & (-42)));
            int i41 = (i39 & i40) + (i40 | i39);
            a = i41 % 128;
            int i42 = i41 % 2;
            return hVarBy;
        }
        int i43 = b;
        int i44 = i43 ^ 7;
        int i45 = ((((i43 & 7) | i44) << 1) - (~(-i44))) - 1;
        a = i45 % 128;
        int i46 = i45 % 2;
        hVarBy = C0252t.by(abstractC0242aF);
        int i47 = b;
        i = ((i47 | 39) << 1) - (i47 ^ 39);
        a = i % 128;
        int i48 = i % 2;
        int i310 = b;
        int i311 = ((i310 ^ 41) | (i310 & 41)) << 1;
        int i49 = -(((~i310) & 41) | (i310 & (-42)));
        int i410 = (i311 & i49) + (i49 | i311);
        a = i410 % 128;
        int i411 = i410 % 2;
        return hVarBy;
    }
}
