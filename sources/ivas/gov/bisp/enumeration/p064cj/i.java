package ivas.gov.bisp.enumeration.p064cj;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static int a = 0;
    private static int b = 1;
    public static final ThreadLocal c = new ThreadLocal();

    static {
        int i = b;
        int i2 = (((i & (-74)) | ((~i) & 73)) - (~(-(-((i & 73) << 1))))) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
    }
}
