package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class R extends o000O000<Number> {
    private static int a = 0x00000000;
    private static int b = 0x00000001;

    public R(C c) {
    }

    public Object c(j jVar) {
        Double dValueOf;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 91) | (i2 & 91)) << 1) - (~(-(((~i2) & 91) | (i2 & (-92)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iY = jVar.y();
        if (i4 != 0 ? iY != 9 : iY != 84) {
            dValueOf = Double.valueOf(jVar.p());
            int i5 = a;
            int i6 = i5 & 23;
            int i7 = (((i5 ^ 23) | i6) << 1) - ((i5 | 23) & (~i6));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 4;
            }
        } else {
            jVar.s();
            int i9 = b;
            int i10 = i9 & 13;
            int i11 = (((i9 ^ 13) | i10) << 1) - ((i9 | 13) & (~i10));
            a = i11 % 128;
            int i12 = i11 % 2;
            dValueOf = null;
        }
        int i13 = b;
        int i14 = (i13 & 97) + (i13 | 97);
        a = i14 % 128;
        int i15 = i14 % 2;
        return dValueOf;
    }

    public void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = (i2 | 79) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        Object obj2 = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        Number number = (Number) obj;
        if (number == null) {
            cVar.c();
            int i7 = b;
            int i8 = i7 & 121;
            int i9 = (i7 ^ 121) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 27 / 0;
                return;
            }
            return;
        }
        C.d(number.doubleValue());
        cVar.r(number);
        int i12 = b;
        int i13 = i12 ^ 117;
        int i14 = ((((i12 & 117) | i13) << 1) - (~(-i13))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
