package ivas.gov.bisp.enumeration.Q;

import java.util.TimeZone;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.Q.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0022m {
    private static int a = 0;
    private static int b = 1;
    public static final C0022m c = new C0022m(null, null);
    public final Long d = null;
    public final TimeZone e = null;

    static {
        int i = b;
        int i2 = (i ^ 54) + ((i & 54) << 1);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    public C0022m(Long l, TimeZone timeZone) {
    }
}
