package ivas.gov.bisp.enumeration.B;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.B.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0015y extends s {
    private static int a = 1;
    private static int b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41o;

    public C0015y(Y y) {
        super(y);
        if (!(y instanceof D)) {
            this.i = 3;
            int i = a;
            int i2 = ((i | 113) << 1) - (i ^ 113);
            b = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.i = 2;
        int i4 = b + 79;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.B.s
    public void e(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 26) + (i3 | 26);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.l) {
            int i7 = a;
            int i8 = ((i7 & 59) - (~(-(-(i7 | 59))))) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 95 / 0;
                return;
            }
            return;
        }
        this.l = true;
        this.j = i;
        List<V> list = this.m;
        int i10 = b;
        int i11 = i10 & 33;
        int i12 = (i11 - (~((i10 ^ 33) | i11))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        Iterator<V> it = list.iterator();
        int i14 = a;
        int i15 = ((i14 ^ 89) | (i14 & 89)) << 1;
        int i16 = -(((~i14) & 89) | (i14 & (-90)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        while (true) {
            int i18 = i17 % 2;
            if (!it.hasNext()) {
                int i19 = a;
                int i20 = ((i19 & (-6)) | ((~i19) & 5)) + ((i19 & 5) << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
                return;
            }
            int i22 = a + 37;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                V next = it.next();
                next.b(next);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            V next2 = it.next();
            next2.b(next2);
            int i23 = b;
            int i24 = i23 | 89;
            i17 = ((i24 << 1) - (~(-((~(i23 & 89)) & i24)))) - 1;
            a = i17 % 128;
        }
    }
}
