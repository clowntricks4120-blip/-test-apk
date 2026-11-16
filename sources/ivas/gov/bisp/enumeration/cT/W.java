package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.cP.u;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class W extends S implements V {
    private static int a = 1;
    private static int b;
    public static final W c = new W();

    static {
        int i = a;
        int i2 = (i | 11) << 1;
        int i3 = -(i ^ 11);
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (i2 ^ 113) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = (i6 | 29) << 1;
        int i9 = -(((~i6) & 29) | (i6 & (-30)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return ivas.gov.bisp.enumeration.cP.R.class;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public h c(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 119) - (~(-(-((i2 & 119) << 1))))) - 1;
        b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (hVar == null) {
            int i4 = (((i2 & (-112)) | ((~i2) & 111)) - (~(-(-((i2 & 111) << 1))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            hVar = u.b(((ivas.gov.bisp.enumeration.cP.R) obj).b());
            int i6 = a;
            int i7 = (-2) - (((i6 & 46) + (i6 | 46)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
        }
        int i8 = b;
        int i9 = i8 & 115;
        int i10 = (((i8 | 115) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return hVar;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public long d(Object obj, h hVar) {
        long jS;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        b = i3 % 128;
        ivas.gov.bisp.enumeration.cP.R r = (ivas.gov.bisp.enumeration.cP.R) obj;
        if (i3 % 2 != 0) {
            jS = r.s();
            int i4 = 32 / 0;
        } else {
            jS = r.s();
        }
        int i5 = b;
        int i6 = i5 & 27;
        int i7 = i6 + ((i5 ^ 27) | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return jS;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
