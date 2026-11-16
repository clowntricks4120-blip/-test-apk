package ivas.gov.bisp.enumeration.p002ab;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class O {
    private static int a = 0;
    private static int b = 1;
    public static final Object c = new Object();
    public static Method d;
    public static boolean e;

    static {
        int i = b;
        int i2 = ((i & (-4)) | ((~i) & 3)) + ((i & 3) << 1);
        a = i2 % 128;
        int i3 = i2 % 2;
    }
}
