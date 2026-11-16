package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.u;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements R {
    private static int a = 0;
    private static int b = 1;

    public h c(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 47;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 47)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return u.b(hVar);
        }
        u.b(hVar);
        throw null;
    }

    public String toString() {
        String name;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 47) | (i2 & 47)) << 1) - (~(-(((~i2) & 47) | (i2 & (-48)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = j.w("Converter[");
        if (b() == null) {
            int i5 = b;
            int i6 = (i5 & (-118)) | ((~i5) & 117);
            int i7 = -(-((i5 & 117) << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            name = "null";
            int i11 = i9 ^ 89;
            int i12 = -(-((i9 & 89) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            name = b().getName();
            int i15 = (-2) - ((b + 82) ^ (-1));
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        String strU = j.u(sbW, name, "]");
        int i17 = a + 83;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return strU;
        }
        throw null;
    }

    public long d(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = ((i2 ^ 59) | i3) << 1;
        int i5 = -((i2 | 59) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        AtomicReference<Map<String, AbstractC0242a>> atomicReference = u.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i8 = b;
        int i9 = (i8 & 90) + (i8 | 90);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return jCurrentTimeMillis;
    }
}
