package ivas.gov.bisp.enumeration.aD;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class al implements aj {
    private static int a = 1;
    private static int b;
    public static final K c = new bjz();
    public final K d;

    public static class bjA implements K {
        private static int a = 1;
        private static int b;
        public K[] c;

        public bjA(K... kArr) {
            this.c = kArr;
        }

        @Override // ivas.gov.bisp.enumeration.aD.K
        public boolean b(Class<?> cls) {
            K[] kArr;
            int length;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-46)) | ((~i2) & 45);
            int i4 = -(-((i2 & 45) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                kArr = this.c;
                length = kArr.length;
            } else {
                kArr = this.c;
                length = kArr.length;
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = b + 27;
                a = i7 % 128;
                Object obj = null;
                if (i7 % 2 == 0) {
                    kArr[i6].b(cls);
                    obj.hashCode();
                    throw null;
                }
                if (kArr[i6].b(cls)) {
                    int i8 = b + 111;
                    a = i8 % 128;
                    if (i8 % 2 != 0) {
                        return true;
                    }
                    obj.hashCode();
                    throw null;
                }
                i6 = ((i6 & 1) << 1) + (i6 ^ 1);
                int i9 = a;
                int i10 = ((i9 & 117) - (~(-(-(i9 | 117))))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = a;
            int i13 = i12 & 31;
            int i14 = (i12 | 31) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.aD.K
        public Z e(Class<?> cls) {
            K k;
            int i = 2 % 2;
            int i2 = b + 31;
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            K[] kArr = this.c;
            int length = kArr.length;
            int i5 = (((i3 | 4) << 1) - (i3 ^ 4)) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("No factory is available for message type: ");
                    sbW.append(cls.getName());
                    throw new UnsupportedOperationException(sbW.toString());
                }
                int i8 = b + 73;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    k = kArr[i7];
                    int i9 = 80 / 0;
                    if (k.b(cls)) {
                        break;
                    }
                    int i10 = i7 & 80;
                    int i11 = ((i7 ^ 80) | i10) << 1;
                    int i12 = -((i7 | 80) & (~i10));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    int i14 = i13 | (-79);
                    i7 = ((i14 << 1) - (~(-(i14 & (~(i13 & (-79))))))) - 1;
                    int i15 = a;
                    int i16 = ((i15 ^ 71) | (i15 & 71)) << 1;
                    int i17 = -(((~i15) & 71) | (i15 & (-72)));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    k = kArr[i7];
                    if (k.b(cls)) {
                        break;
                    }
                    int i110 = i7 & 80;
                    int i111 = ((i7 ^ 80) | i110) << 1;
                    int i112 = -((i7 | 80) & (~i110));
                    int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                    int i114 = i113 | (-79);
                    i7 = ((i114 << 1) - (~(-(i114 & (~(i113 & (-79))))))) - 1;
                    int i115 = a;
                    int i116 = ((i115 ^ 71) | (i115 & 71)) << 1;
                    int i117 = -(((~i115) & 71) | (i115 & (-72)));
                    int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                    b = i118 % 128;
                    int i119 = i118 % 2;
                }
            }
            Z zE = k.e(cls);
            int i20 = b;
            int i21 = ((i20 ^ 52) + ((i20 & 52) << 1)) - 1;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 78 / 0;
            }
            return zE;
        }
    }

    public class bjz implements K {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.aD.K
        public boolean b(Class<?> cls) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-92)) | ((~i2) & 91);
            int i4 = (i2 & 91) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            return i5 % 2 != 0;
        }

        @Override // ivas.gov.bisp.enumeration.aD.K
        public Z e(Class<?> cls) {
            int i = 2 % 2;
            throw new IllegalStateException("This should never be called.");
        }
    }

    static {
        int i = a;
        int i2 = i & 125;
        int i3 = (i ^ 125) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public al() {
        K k;
        K[] kArr = new K[2];
        kArr[0] = T.c;
        int i = a + 64;
        int i2 = (i ^ (-1)) + (i << 1);
        b = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class<?> cls = Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory");
            Class<?>[] clsArr = new Class[0];
            int i4 = b;
            int i5 = ((((i4 ^ 61) | (i4 & 61)) << 1) - (~(-(((~i4) & 61) | (i4 & (-62)))))) - 1;
            a = i5 % 128;
            Object objInvoke = i5 % 2 == 0 ? cls.getDeclaredMethod("getInstance", clsArr).invoke(null, new Object[0]) : cls.getDeclaredMethod("getInstance", clsArr).invoke(null, new Object[0]);
            int i6 = b;
            int i7 = ((i6 & 56) + (i6 | 56)) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            k = (K) objInvoke;
            int i8 = i6 + 77;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            kArr[1] = k;
            bjA bja = new bjA(kArr);
            Charset charset = R.c;
            this.d = bja;
        } catch (Exception unused) {
            k = c;
        }
    }
}
