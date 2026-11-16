package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class U extends o000O000<Object> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ad c;

    public U(ad adVar) {
        this.c = adVar;
    }

    public void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (i2 | 105) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj == null) {
            cVar.c();
            int i7 = b;
            int i8 = ((i7 & 115) - (~(i7 | 115))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        this.c.d(cVar, obj);
        int i10 = b;
        int i11 = i10 & 121;
        int i12 = (((i10 ^ 121) | i11) << 1) - ((i10 | 121) & (~i11));
        a = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 28 / 0;
        }
    }

    public Object c(j jVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = (i2 | 71) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (jVar.y() != 9) {
            Object objC = this.c.c(jVar);
            int i8 = a + 15;
            b = i8 % 128;
            int i9 = i8 % 2;
            return objC;
        }
        int i10 = a;
        int i11 = (i10 ^ 6) + ((i10 & 6) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            jVar.s();
            return null;
        }
        jVar.s();
        int i13 = 75 / 0;
        return null;
    }
}
