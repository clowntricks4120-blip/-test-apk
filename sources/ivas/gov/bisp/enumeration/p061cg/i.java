package ivas.gov.bisp.enumeration.p061cg;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.sender.ReportSenderFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    private static int a = 0;
    private static int b = 1;

    public static /* bridge */ /* synthetic */ boolean b(ReportSenderFactory reportSenderFactory, r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = -(-((i2 ^ 71) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        T.b(rVar);
        return true;
    }
}
