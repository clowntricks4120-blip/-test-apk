package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class A extends o000O000<Number> {
    private static int a = 1;
    private static int b;

    public Object c(j jVar) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 115) << 1;
        int i4 = -(((~i2) & 115) | (i2 & (-116)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (jVar.y() == 9) {
            int i7 = b;
            int i8 = ((i7 | 31) << 1) - (i7 ^ 31);
            a = i8 % 128;
            lValueOf = null;
            if (i8 % 2 == 0) {
                jVar.s();
                throw null;
            }
            jVar.s();
            int i9 = b;
            int i10 = i9 & 3;
            int i11 = (i9 | 3) & (~i10);
            int i12 = i10 << 1;
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            lValueOf = Long.valueOf(jVar.q());
            int i15 = a;
            int i16 = (((i15 | 22) << 1) - (i15 ^ 22)) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = i18 & 61;
        int i20 = i19 + ((i18 ^ 61) | i19);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 89 / 0;
        }
        return lValueOf;
    }

    public void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 74) + (i2 | 74)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Number number = (Number) obj;
        if (number != null) {
            cVar.t(number.toString());
            int i5 = a;
            int i6 = (i5 & (-22)) | ((~i5) & 21);
            int i7 = (i5 & 21) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = ((i2 | 33) << 1) - (i2 ^ 33);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            cVar.c();
            throw null;
        }
        cVar.c();
        int i11 = b + 51;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }
}
