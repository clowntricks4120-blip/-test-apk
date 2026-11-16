package ivas.gov.bisp.enumeration.H;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[PHI: r4
  0x004f: PHI (r4v7 java.lang.String) = (r4v3 java.lang.String), (r4v13 java.lang.String) binds: [B:15:0x004d, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    public static boolean b() {
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = i2 | 29;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        boolean z2 = true;
        if (i5 % 2 == 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 127) {
            int i6 = b;
            int i7 = i6 ^ 95;
            int i8 = ((i6 & 95) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = a;
            int i13 = i12 ^ 93;
            int i14 = ((i12 & 93) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 & i15) + (i14 | i15);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                str = Build.VERSION.CODENAME;
                int i17 = 62 / 0;
                if (!"REL".equals(str)) {
                    if (str.compareTo("S") >= 0) {
                        int i18 = b;
                        int i19 = i18 ^ 67;
                        int i20 = -(-((i18 & 67) << 1));
                        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                        int i22 = i21 % 128;
                        a = i22;
                        int i23 = i21 % 2;
                        int i24 = ((i22 | 107) << 1) - (((~i22) & 107) | (i22 & (-108)));
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        z = true;
                    }
                }
                if (!z) {
                    z2 = false;
                } else {
                    int i26 = b;
                    int i27 = i26 ^ 95;
                    int i28 = ((i26 & 95) | i27) << 1;
                    int i29 = -i27;
                    int i110 = (i28 & i29) + (i28 | i29);
                    a = i110 % 128;
                    int i111 = i110 % 2;
                }
            } else {
                str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    if (str.compareTo("S") >= 0) {
                        int i112 = b;
                        int i113 = i112 ^ 67;
                        int i210 = -(-((i112 & 67) << 1));
                        int i211 = (i113 ^ i210) + ((i210 & i113) << 1);
                        int i212 = i211 % 128;
                        a = i212;
                        int i213 = i211 % 2;
                        int i214 = ((i212 | 107) << 1) - (((~i212) & 107) | (i212 & (-108)));
                        b = i214 % 128;
                        int i215 = i214 % 2;
                        z = true;
                    }
                }
                if (!z) {
                    z2 = false;
                } else {
                    int i216 = b;
                    int i217 = i216 ^ 95;
                    int i218 = ((i216 & 95) | i217) << 1;
                    int i219 = -i217;
                    int i114 = (i218 & i219) + (i218 | i219);
                    a = i114 % 128;
                    int i115 = i114 % 2;
                }
            }
            int i30 = a;
            int i31 = (i30 & 117) + (i30 | 117);
            b = i31 % 128;
            int i32 = i31 % 2;
            z = false;
            if (!z) {
                z2 = false;
            } else {
                int i2110 = b;
                int i2111 = i2110 ^ 95;
                int i2112 = ((i2110 & 95) | i2111) << 1;
                int i2113 = -i2111;
                int i116 = (i2112 & i2113) + (i2112 | i2113);
                a = i116 % 128;
                int i117 = i116 % 2;
            }
        }
        int i33 = a;
        int i34 = i33 & 35;
        int i35 = -(-((i33 ^ 35) | i34));
        int i36 = (i34 & i35) + (i35 | i34);
        b = i36 % 128;
        if (i36 % 2 != 0) {
            return z2;
        }
        throw null;
    }
}
