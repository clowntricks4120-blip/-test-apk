package ivas.gov.bisp.enumeration.p062ch;

import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import org.acra.startup.StartupProcessor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z {
    private static int a = 1;
    private static int b;

    public static /* bridge */ /* synthetic */ boolean b(StartupProcessor startupProcessor, r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 62) + (i2 | 62);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        T.b(rVar);
        return true;
    }
}
