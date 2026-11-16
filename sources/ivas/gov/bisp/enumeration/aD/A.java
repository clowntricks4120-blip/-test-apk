package ivas.gov.bisp.enumeration.aD;

import net.sqlcipher.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    private static int a = 1;
    private static int b;
    public static final A c;
    public static final A d;
    public static final A e;
    public static final A f;
    public static final A g;
    public static final A h;
    public static final A i;
    public static final A j;
    public static final A k;
    public static final /* synthetic */ A[] l;
    public static final A m;
    public final Class<?> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f55o;

    static {
        A a2 = new A("VOID", 0, Void.class, Void.class, null);
        d = a2;
        Class cls = Integer.TYPE;
        A a3 = new A("INT", 1, cls, Integer.class, 0);
        f = a3;
        A a4 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        e = a4;
        A a5 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        g = a5;
        A a6 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        h = a6;
        A a7 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        c = a7;
        A a8 = new A("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        i = a8;
        A a9 = new A("BYTE_STRING", 7, AbstractC0069z.class, AbstractC0069z.class, AbstractC0069z.c);
        j = a9;
        A a10 = new A("ENUM", 8, cls, Integer.class, null);
        k = a10;
        A a11 = new A("MESSAGE", 9, Object.class, Object.class, null);
        int i2 = b;
        int i3 = i2 ^ 3;
        int i4 = (i2 & 3) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        m = a11;
        int i7 = i2 & 85;
        int i8 = (i2 ^ 85) | i7;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        l = new A[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11};
        int i11 = i2 + 118;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
    }

    public A(String str, int i2, Class cls, Class cls2, Object obj) {
        super(str, i2);
        this.n = cls2;
        this.f55o = obj;
    }

    public static A valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = a + 55;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return (A) Enum.valueOf(A.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static A[] values() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-74)) | ((~i3) & 73)) - (~((i3 & 73) << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        A[] aArr = (A[]) l.clone();
        int i6 = a + 115;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
        }
        return aArr;
    }
}
