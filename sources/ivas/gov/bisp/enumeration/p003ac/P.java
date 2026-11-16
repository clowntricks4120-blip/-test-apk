package ivas.gov.bisp.enumeration.p003ac;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P {
    private static int b;
    public static final /* synthetic */ int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int a = 53 % 128;

    static {
        if (53 % 2 == 0) {
            int i = 18 / 0;
        }
    }

    public static StringBuilder b(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = a;
        int i3 = i2 ^ 53;
        int i4 = -(-((i2 & 53) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        sb.append(str2);
        int i7 = b;
        int i8 = i7 | 49;
        int i9 = ((i8 << 1) - (~(-((~(i7 & 49)) & i8)))) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 52 / 0;
        }
        return sb;
    }

    public static /* synthetic */ int c(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 49;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (i == 0) {
            throw null;
        }
        int i6 = i3 + 72;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = i - 1;
        int i11 = i8 + 123;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        obj.hashCode();
        throw null;
    }
}
