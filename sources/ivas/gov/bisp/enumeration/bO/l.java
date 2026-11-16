package ivas.gov.bisp.enumeration.bO;

import ivas.gov.bisp.enumeration.O.r;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<R> implements Serializable {
    private static int a = 0;
    private static int b = 1;

    public l(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0069 A[PHI: r1
  0x0069: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v13 java.lang.String) binds: [B:12:0x0067, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public String toString() {
        Type[] genericInterfaces;
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (i2 | 69) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            Objects.requireNonNull(a.c);
            genericInterfaces = getClass().getGenericInterfaces();
            int i7 = 35 / 0;
        } else {
            Objects.requireNonNull(a.c);
            genericInterfaces = getClass().getGenericInterfaces();
        }
        int i8 = b;
        int i9 = i8 & 9;
        int i10 = (i8 | 9) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            string = genericInterfaces[0].toString();
            if (string.startsWith("kotlin.jvm.functions.")) {
                string = string.substring(21);
                int i13 = b;
                int i14 = i13 & 57;
                int i15 = (i13 | 57) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            string = genericInterfaces[0].toString();
            if (string.startsWith("kotlin.jvm.functions.")) {
                string = string.substring(21);
                int i19 = b;
                int i110 = i19 & 57;
                int i111 = (i19 | 57) & (~i110);
                int i112 = -(-(i110 << 1));
                int i113 = ((i111 | i112) << 1) - (i111 ^ i112);
                a = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        r.m(string, "renderLambdaToString(this)");
        int i20 = b;
        int i21 = i20 ^ 41;
        int i22 = ((((i20 & 41) | i21) << 1) - (~(-i21))) - 1;
        a = i22 % 128;
        int i23 = i22 % 2;
        return string;
    }
}
