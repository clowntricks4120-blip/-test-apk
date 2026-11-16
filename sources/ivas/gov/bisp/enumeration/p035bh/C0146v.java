package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.io.IOException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bh.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0146v extends o000O000<Number> {
    private static int a = 1;
    private static int b;

    public C0146v(C c) {
    }

    public Object c(j jVar) {
        Float fValueOf;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 58) << 1) - (i2 ^ 58)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (jVar.y() == 9) {
            int i5 = b;
            int i6 = i5 ^ 9;
            int i7 = (i5 & 9) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            jVar.s();
            int i10 = b;
            int i11 = i10 & 15;
            int i12 = (i11 - (~((i10 ^ 15) | i11))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf((float) jVar.p());
            int i14 = b + 77;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = a;
        int i17 = i16 ^ 109;
        int i18 = (i16 & 109) << 1;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            return fValueOf;
        }
        obj.hashCode();
        throw null;
    }

    public void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = i2 | 111;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Number number = (Number) obj;
        Object obj2 = null;
        if (number != null) {
            C.d(number.floatValue());
            cVar.r(number);
            int i8 = b;
            int i9 = (i8 & 51) + (i8 | 51);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        int i10 = ((i6 | 23) << 1) - (i6 ^ 23);
        a = i10 % 128;
        int i11 = i10 % 2;
        cVar.c();
        int i12 = a + 100;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
