package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.cQ.i;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class T extends i implements Cloneable {
    private static int a = 0;
    private static int b = 1;

    public T(long j, AbstractC0242a abstractC0242a) {
        super(j, abstractC0242a);
    }

    public Object clone() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = (((i2 | 123) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        Object obj = null;
        try {
            if (i4 % 2 == 0) {
                super.clone();
                throw null;
            }
            Object objClone = super.clone();
            int i5 = b;
            int i6 = i5 & 63;
            int i7 = (((i5 | 63) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return objClone;
            }
            obj.hashCode();
            throw null;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public void e(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = (i2 | 15) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        AbstractC0242a abstractC0242aD = u.d(abstractC0242a);
        AbstractC0242a abstractC0242aD2 = u.d(c());
        int i8 = b;
        int i9 = i8 & 27;
        int i10 = (i8 ^ 27) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        if (abstractC0242aD == abstractC0242aD2) {
            int i14 = i12 & 27;
            int i15 = -(-(i12 | 27));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            return;
        }
        long jL = abstractC0242aD2.l(abstractC0242aD, this.c);
        int i18 = b;
        int i19 = ((i18 ^ 64) + ((i18 & 64) << 1)) - 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        h hVarB = u.b(this.d.be(abstractC0242aD));
        int i21 = a;
        int i22 = ((i21 ^ 54) + ((i21 & 54) << 1)) - 1;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            this.d = hVarB;
            this.c = jL;
        } else {
            this.d = hVarB;
            this.c = jL;
            throw null;
        }
    }
}
