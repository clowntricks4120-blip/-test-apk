package ivas.gov.bisp.enumeration.bZ;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.collector.Collector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac {
    private static int a = 0;
    private static int b = 1;

    public static /* bridge */ /* synthetic */ boolean b(Collector collector, r rVar) {
        int i = 2 % 2;
        int i2 = a + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        T.b(rVar);
        int i4 = a;
        int i5 = i4 & 59;
        int i6 = i5 + ((i4 ^ 59) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static Collector.Order c(Collector collector) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = -(-(i2 | 51));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Collector.Order order = Collector.Order.NORMAL;
        int i7 = a;
        int i8 = i7 & 11;
        int i9 = (((i7 ^ 11) | i8) << 1) - ((i7 | 11) & (~i8));
        b = i9 % 128;
        int i10 = i9 % 2;
        return order;
    }
}
