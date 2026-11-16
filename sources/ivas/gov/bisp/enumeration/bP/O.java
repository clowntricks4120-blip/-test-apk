package ivas.gov.bisp.enumeration.bP;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class O extends ivas.gov.bisp.enumeration.bQ.O {
    private static int a = 0;
    private static int b = 1;

    public static final class byp {
        private static int a = 0;
        private static int b = 1;
        public static final Integer c;

        /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
        static {
            Integer num;
            boolean z;
            Object obj = null;
            try {
                Field field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
                int i = b + 11;
                a = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = field.get(null) instanceof Integer;
                    throw null;
                }
                Object obj2 = field.get(null);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                    int i2 = a + 111;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                } else {
                    int i4 = b;
                    int i5 = (i4 & 1) + (i4 | 1);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                    num = null;
                }
                if (num != null) {
                    int i7 = b;
                    int i8 = i7 & 103;
                    int i9 = ((i7 ^ 103) | i8) << 1;
                    int i10 = -((i7 | 103) & (~i8));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    if (num.intValue() > 0) {
                        int i13 = b;
                        int i14 = (i13 & 101) + (i13 | 101);
                        int i15 = i14 % 128;
                        a = i15;
                        int i16 = i14 % 2;
                        int i17 = i15 & 123;
                        int i18 = (((i15 ^ 123) | i17) << 1) - ((i15 | 123) & (~i17));
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        int i20 = 2 % 2;
                        z = true;
                    } else {
                        int i21 = b;
                        int i22 = (i21 ^ 43) + ((i21 & 43) << 1);
                        a = i22 % 128;
                        if (i22 % 2 == 0) {
                            int i23 = 2 % 2;
                        }
                        z = false;
                    }
                    if (!(!z)) {
                        int i24 = b;
                        int i25 = (i24 & (-4)) | ((~i24) & 3);
                        int i26 = -(-((i24 & 3) << 1));
                        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                        a = i27 % 128;
                        if (i27 % 2 != 0) {
                            throw null;
                        }
                        int i28 = 2 % 2;
                    } else {
                        num = null;
                    }
                } else {
                    num = null;
                }
                c = num;
                int i29 = a;
                int i30 = i29 & 75;
                int i31 = -(-((i29 ^ 75) | i30));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.bQ.O
    public void c(Throwable th, Throwable th2) {
        int i = 2 % 2;
        int i2 = b + 97;
        a = i2 % 128;
        int i3 = i2 % 2;
        Integer num = byp.c;
        if (num != null) {
            int i4 = b;
            int i5 = ((i4 & (-108)) | ((~i4) & 107)) + ((i4 & 107) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            if (num.intValue() < 19) {
                int i7 = a;
                int i8 = i7 + 89;
                b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = (-2) - (((i7 & 32) + (i7 | 32)) ^ (-1));
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 % 2;
                }
                super.c(th, th2);
                int i12 = a;
                int i13 = i12 & 33;
                int i14 = i13 + ((i12 ^ 33) | i13);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 5 / 0;
                    return;
                }
                return;
            }
        }
        int i16 = b;
        int i17 = i16 ^ 61;
        int i18 = (i16 & 61) << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((i16 | 125) << 1) - (((~i16) & 125) | (i16 & (-126)));
        a = i21 % 128;
        int i22 = i21 % 2;
        th.addSuppressed(th2);
        int i23 = b + 37;
        a = i23 % 128;
        int i24 = i23 % 2;
    }
}
