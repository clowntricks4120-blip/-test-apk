package ivas.gov.bisp.enumeration.p053bz;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    private static int a = 1;
    private static int b;

    public static String c(String str, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            str2.toLowerCase(Locale.US).startsWith(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!str2.toLowerCase(Locale.US).startsWith(str)) {
            throw new IllegalArgumentException(String.format("key URI must start with %s", str));
        }
        int i4 = b + 37;
        a = i4 % 128;
        int i5 = i4 % 2;
        String strSubstring = str2.substring(str.length());
        int i6 = b;
        int i7 = ((i6 | 1) << 1) - (i6 ^ 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return strSubstring;
    }

    public static void d(int i, int i2) throws GeneralSecurityException {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 79;
        int i6 = (i5 - (~((i4 ^ 79) | i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        if (i >= 0) {
            int i8 = i4 & 59;
            int i9 = ((~i8) & (i4 | 59)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (i <= i2) {
                int i11 = ((i4 ^ 97) | (i4 & 97)) << 1;
                int i12 = -((i4 & (-98)) | ((~i4) & 97));
                int i13 = (i11 & i12) + (i11 | i12);
                b = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
        }
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    static {
        Object[] objArr = new Object[4];
        objArr[0] = "([0-9a-zA-Z\\-\\.\\_~])+";
        int i = -(-47);
        a = i % 128;
        if (i % 2 == 0) {
            objArr[1] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr[2] = "([0-9a-zA-Z\\-\\.\\_~])+";
        } else {
            objArr[1] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr[2] = "([0-9a-zA-Z\\-\\.\\_~])+";
        }
        char c = 3;
        objArr[3] = "([0-9a-zA-Z\\-\\.\\_~])+";
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", objArr), 2);
        int i2 = a;
        int i3 = ((i2 ^ 109) | (i2 & 109)) << 1;
        int i4 = -(((~i2) & 109) | (i2 & (-110)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object[] objArr2 = new Object[5];
        objArr2[0] = "([0-9a-zA-Z\\-\\.\\_~])+";
        int i8 = i6 ^ 43;
        int i9 = (((i6 & 43) | i8) << 1) - i8;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            objArr2[1] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr2[4] = "([0-9a-zA-Z\\-\\.\\_~])+";
            c = 4;
        } else {
            objArr2[1] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr2[2] = "([0-9a-zA-Z\\-\\.\\_~])+";
        }
        int i10 = (i6 ^ 118) + ((i6 & 118) << 1);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            objArr2[c] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr2[2] = "([0-9a-zA-Z\\-\\.\\_~])+";
        } else {
            objArr2[c] = "([0-9a-zA-Z\\-\\.\\_~])+";
            objArr2[4] = "([0-9a-zA-Z\\-\\.\\_~])+";
        }
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", objArr2), 2);
        int i12 = a;
        int i13 = ((i12 | 59) << 1) - (i12 ^ 59);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public static void b(int i) throws InvalidAlgorithmParameterException {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 99;
        int i5 = (i3 ^ 99) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (i != 16) {
            int i9 = i7 & 73;
            int i10 = (i7 | 73) & (~i9);
            int i11 = i9 << 1;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            int i13 = i12 % 128;
            a = i13;
            if (i12 % 2 != 0 ? i != 32 : i != 21) {
                int i14 = i13 & 77;
                int i15 = i14 + ((i13 ^ 77) | i14);
                b = i15 % 128;
                int i16 = i15 % 2;
                throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
        }
        int i17 = a + 25;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
