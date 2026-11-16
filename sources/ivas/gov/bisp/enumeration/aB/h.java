package ivas.gov.bisp.enumeration.aB;

import ivas.gov.bisp.enumeration.bD.T;
import org.acra.config.ConfigurationBuilderFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {
    private static int a = 1;
    private static int b;

    public static /* bridge */ /* synthetic */ boolean b(ConfigurationBuilderFactory configurationBuilderFactory, r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 48) + ((i2 & 48) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        T.b(rVar);
        int i5 = a;
        int i6 = i5 | 95;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 95)) & i6);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 29 / 0;
        }
        return true;
    }
}
