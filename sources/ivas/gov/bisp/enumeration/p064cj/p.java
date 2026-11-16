package ivas.gov.bisp.enumeration.p064cj;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;

    public static final class bES implements PrivilegedAction<String> {
        private static int a = 0;
        private static int b = 1;

        @Override // java.security.PrivilegedAction
        public final String run() {
            String property;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                property = System.getProperty("line.separator");
                int i4 = 66 / 0;
            } else {
                property = System.getProperty("line.separator");
            }
            int i5 = b;
            int i6 = ((i5 | 26) << 1) - (i5 ^ 26);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return property;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        try {
            Object objDoPrivileged = AccessController.doPrivileged(new bES());
            int i = a;
            int i2 = (i & (-76)) | ((~i) & 75);
            int i3 = (i & 75) << 1;
            int i4 = (i2 & i3) + (i2 | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (i & 43) + (i | 43);
            b = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception unused) {
        }
    }

    public static String b(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-44)) | ((~i2) & 43);
        int i4 = -(-((i2 & 43) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i7 = ((i2 | 9) << 1) - (i2 ^ 9);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 != length) {
            int i10 = b;
            int i11 = i10 + 57;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                cArr[i9] = (char) (bArr[i9] & 22596);
                int i12 = i9 & 49;
                int i13 = ((i9 ^ 49) | i12) << 1;
                int i14 = -((i9 | 49) & (~i12));
                i9 = (-2) - ((((i13 & i14) + (i14 | i13)) - 8) ^ (-1));
            } else {
                cArr[i9] = (char) (bArr[i9] & 255);
                int i15 = i9 & 1;
                int i16 = (i9 ^ 1) | i15;
                i9 = (i15 ^ i16) + ((i16 & i15) << 1);
            }
            int i17 = i10 & 103;
            int i18 = i17 + ((i10 ^ 103) | i17);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        String str = new String(cArr);
        int i20 = b;
        int i21 = (i20 & (-4)) | ((~i20) & 3);
        int i22 = -(-((i20 & 3) << 1));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static byte[] c(String str) {
        int i = 2 % 2;
        int i2 = b + 97;
        a = i2 % 128;
        int i3 = i2 % 2;
        int length = str.length();
        byte[] bArr = new byte[length];
        int i4 = b;
        int i5 = ((i4 | 9) << 1) - (i4 ^ 9);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 != length) {
            int i8 = b;
            int i9 = (((i8 | 20) << 1) - (i8 ^ 20)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            bArr[i7] = (byte) str.charAt(i7);
            i7 = ((i7 & 2) + (i7 | 2)) - 1;
            int i11 = b;
            int i12 = (i11 & 121) + (i11 | 121);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = b + 76;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            return bArr;
        }
        throw null;
    }
}
