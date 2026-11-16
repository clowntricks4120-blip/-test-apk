package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061r {
    private static int a = 1;
    private static int b;
    public static final Class<?> c;
    public static final boolean d;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
            int i = a;
            int i2 = i ^ 79;
            int i3 = (i & 79) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (Throwable unused) {
            cls = null;
        }
        c = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
            int i7 = a;
            int i8 = ((i7 ^ 94) + ((i7 & 94) << 1)) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            int i10 = a + 33;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            z = true;
        } else {
            int i13 = b;
            int i14 = i13 & 63;
            int i15 = ((i13 ^ 63) | i14) << 1;
            int i16 = -((i13 | 63) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 % 2;
            }
            z = false;
        }
        d = z;
        int i19 = b;
        int i20 = i19 & 115;
        int i21 = (i20 - (~((i19 ^ 115) | i20))) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public static boolean b() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (c != null) {
            int i5 = (i4 ^ 21) + ((i4 & 21) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (d) {
                int i7 = b + 65;
                a = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            } else {
                int i9 = (((i4 | 28) << 1) - (i4 ^ 28)) - 1;
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                int i12 = i10 & 11;
                int i13 = i12 + ((i10 ^ 11) | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            }
        } else {
            int i15 = b + 65;
            a = i15 % 128;
            int i16 = i15 % 2;
            z = false;
        }
        int i17 = a;
        int i18 = (i17 & (-76)) | ((~i17) & 75);
        int i19 = -(-((i17 & 75) << 1));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        b = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }
}
