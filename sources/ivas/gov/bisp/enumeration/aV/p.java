package ivas.gov.bisp.enumeration.aV;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;

    static {
        Logger.getLogger(p.class.getName());
        int i = a;
        int i2 = (i & (-56)) | ((~i) & 55);
        int i3 = -(-((i & 55) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }
}
