package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o00000O0;
import ivas.gov.bisp.enumeration.p050bw.J;
import ivas.gov.bisp.enumeration.p050bw.x;
import ivas.gov.bisp.enumeration.p102y.l;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bh.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145s {
    private static int a = 0;
    private static int b = 1;
    public l d = l.c;
    public ab e = ab.c;
    public L f = S.c;
    public final Map<Type, o00000O0<?>> g = new HashMap();
    public final List<E> i = new ArrayList();
    public final List<E> h = new ArrayList();
    public int j = 2;
    public int k = 2;
    public boolean c = true;

    public final C c() {
        int i = 2 % 2;
        int size = this.i.size();
        int size2 = this.h.size();
        int i2 = -(-size);
        int i3 = size2 & i2;
        int i4 = (i3 - (~(-(-((i2 ^ size2) | i3))))) - 1;
        int i5 = i4 & 3;
        ArrayList arrayList = new ArrayList((i5 - (~(-(-((i4 ^ 3) | i5))))) - 1);
        arrayList.addAll(this.i);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.h);
        int i6 = b;
        int i7 = ((i6 & 116) + (i6 | 116)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i9 = this.j;
        int i10 = a;
        int i11 = (i10 & (-106)) | ((~i10) & 105);
        int i12 = -(-((i10 & 105) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        int i16 = this.k;
        if (i9 != 2) {
            int i17 = i14 + 69;
            a = i17 % 128;
            int i18 = i17 % 2;
            if (i16 != 2) {
                Q q = new Q(Date.class, i9, i16);
                Q q2 = new Q(Timestamp.class, i9, i16);
                Q q3 = new Q(java.sql.Date.class, i9, i16);
                E e = J.d;
                arrayList.add(new x(Date.class, q));
                arrayList.add(new x(Timestamp.class, q2));
                x xVar = new x(java.sql.Date.class, q3);
                int i19 = b + 113;
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    arrayList.add(xVar);
                    int i20 = 6 / 0;
                } else {
                    arrayList.add(xVar);
                }
            }
        }
        C c = new C(this.d, this.f, this.g, false, false, false, this.c, false, false, false, this.e, null, this.j, this.k, this.i, this.h, arrayList);
        int i21 = a;
        int i22 = (((i21 | 4) << 1) - (i21 ^ 4)) - 1;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            return c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
