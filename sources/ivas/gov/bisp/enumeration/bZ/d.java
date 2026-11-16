package ivas.gov.bisp.enumeration.bZ;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.collector.ApplicationStartupCollector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    private static int a = 1;
    private static int b;

    public static /* synthetic */ boolean b(ApplicationStartupCollector applicationStartupCollector, r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 69;
        int i4 = -(-((i2 & 69) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        T.b(rVar);
        int i7 = a + 7;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
