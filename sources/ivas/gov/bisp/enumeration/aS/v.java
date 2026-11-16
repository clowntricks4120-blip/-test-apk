package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.C;
import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aC.EnumC0042v;
import ivas.gov.bisp.enumeration.aC.V;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;

    static {
        Charset.forName("UTF-8");
        int i = b;
        int i2 = ((i ^ 104) + ((i & 104) << 1)) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
    }

    public static C b(V v) {
        Iterator<V.bcq> it;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = -(-((i2 ^ 17) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        C.bcu bcuVarW = C.w();
        int iE = v.E();
        bcuVarW.f();
        int i7 = b;
        int i8 = (i7 & (-92)) | ((~i7) & 91);
        int i9 = (i7 & 91) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 == 0) {
            C.t(bcuVarW.d, iE);
            throw null;
        }
        C.t(bcuVarW.d, iE);
        int i11 = b + 75;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            it = v.F().iterator();
            int i12 = 0 / 0;
        } else {
            it = v.F().iterator();
        }
        while (it.hasNext()) {
            int i13 = a + 115;
            b = i13 % 128;
            int i14 = i13 % 2;
            V.bcq next = it.next();
            C.bcv.bcw bcwVarY = C.bcv.y();
            ivas.gov.bisp.enumeration.aC.R rE = next.E();
            int i15 = a;
            int i16 = ((i15 & (-6)) | ((~i15) & 5)) + ((i15 & 5) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            String strA = rE.A();
            bcwVarY.f();
            C.bcv bcvVar = bcwVarY.d;
            int i18 = a;
            int i19 = i18 & 45;
            int i20 = ((((i18 ^ 45) | i19) << 1) - (~(-((i18 | 45) & (~i19))))) - 1;
            b = i20 % 128;
            if (i20 % 2 != 0) {
                C.bcv.t(bcvVar, strA);
                next.G();
                bcwVarY.f();
                obj.hashCode();
                throw null;
            }
            C.bcv.t(bcvVar, strA);
            EnumC0042v enumC0042vG = next.G();
            bcwVarY.f();
            int i21 = b;
            int i22 = ((i21 | 27) << 1) - (i21 ^ 27);
            a = i22 % 128;
            int i23 = i22 % 2;
            C.bcv.v(bcwVarY.d, enumC0042vG);
            D dF = next.F();
            int i24 = b;
            int i25 = i24 & 49;
            int i26 = (i25 - (~((i24 ^ 49) | i25))) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            bcwVarY.f();
            C.bcv.w(bcwVarY.d, dF);
            int i28 = b;
            int i29 = ((i28 & (-64)) | ((~i28) & 63)) + ((i28 & 63) << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            int iA = next.A();
            bcwVarY.f();
            C.bcv bcvVar2 = bcwVarY.d;
            int i31 = a;
            int i32 = i31 & 111;
            int i33 = (i31 ^ 111) | i32;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                C.bcv.x(bcvVar2, iA);
                bcuVarW.f();
                throw null;
            }
            C.bcv.x(bcvVar2, iA);
            C.bcv bcvVar3 = (C.bcv) bcwVarY.c();
            bcuVarW.f();
            C.v(bcuVarW.d, bcvVar3);
            int i35 = a;
            int i36 = i35 & 57;
            int i37 = (i35 ^ 57) | i36;
            int i38 = (i36 & i37) + (i37 | i36);
            b = i38 % 128;
            int i39 = i38 % 2;
        }
        C c2 = (C) bcuVarW.c();
        int i40 = a;
        int i41 = i40 & 1;
        int i42 = ((i40 ^ 1) | i41) << 1;
        int i43 = -((i40 | 1) & (~i41));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        b = i44 % 128;
        if (i44 % 2 != 0) {
            int i45 = 40 / 0;
        }
        return c2;
    }
}
