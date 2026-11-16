package ivas.gov.bisp.enumeration.p011ak;

import java.util.Locale;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;

    static {
        new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        int i = a;
        int i2 = i & 43;
        int i3 = (i ^ 43) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }
}
