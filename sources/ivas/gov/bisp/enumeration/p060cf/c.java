package ivas.gov.bisp.enumeration.p060cf;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.scheduler.SenderSchedulerFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    private static int a = 0;
    private static int b = 1;

    public static /* bridge */ /* synthetic */ boolean b(SenderSchedulerFactory senderSchedulerFactory, r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        T.b(rVar);
        return true;
    }
}
