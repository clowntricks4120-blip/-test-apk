package ivas.gov.bisp.enumeration.p058cd;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.interaction.ReportInteraction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {
    private static int a = 1;
    private static int b;

    public static /* bridge */ /* synthetic */ boolean b(ReportInteraction reportInteraction, r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = (i2 ^ 59) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        T.b(rVar);
        int i7 = b;
        int i8 = ((i7 ^ 16) + ((i7 & 16) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }
}
