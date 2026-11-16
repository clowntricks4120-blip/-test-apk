package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.o000OoO.o0OoOo0;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public interface x<T> {

    public static class btU implements o0OoOo0<Cipher> {
        private static int a = 0;
        private static int b = 1;

        public Object b(String str, Provider provider) throws NoSuchPaddingException, NoSuchAlgorithmException {
            Cipher cipher;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 75;
            int i4 = i3 + ((i2 ^ 75) | i3);
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (provider == null) {
                int i6 = i5 + 41;
                b = i6 % 128;
                int i7 = i6 % 2;
                cipher = Cipher.getInstance(str);
                int i8 = b;
                int i9 = i8 & 95;
                int i10 = i8 | 95;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                cipher = Cipher.getInstance(str, provider);
                int i13 = a;
                int i14 = i13 & 17;
                int i15 = ((i13 ^ 17) | i14) << 1;
                int i16 = -((i13 | 17) & (~i14));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 4 / 3;
                }
            }
            int i19 = a;
            int i20 = ((i19 ^ 57) | (i19 & 57)) << 1;
            int i21 = -(((~i19) & 57) | (i19 & (-58)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 6 / 0;
            }
            return cipher;
        }
    }

    public static class btV implements o0OoOo0<Mac> {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0028  */
        public Object b(String str, Provider provider) throws NoSuchAlgorithmException {
            Mac mac;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 1) + (i2 | 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
                if (provider == null) {
                    mac = Mac.getInstance(str);
                    int i5 = a + 71;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    mac = Mac.getInstance(str, provider);
                    int i7 = b;
                    int i8 = ((i7 | 97) << 1) - (i7 ^ 97);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (provider == null) {
                mac = Mac.getInstance(str);
                int i10 = a + 71;
                b = i10 % 128;
                int i11 = i10 % 2;
            } else {
                mac = Mac.getInstance(str, provider);
                int i12 = b;
                int i13 = ((i12 | 97) << 1) - (i12 ^ 97);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = b;
            int i16 = (i15 & (-58)) | ((~i15) & 57);
            int i17 = -(-((i15 & 57) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            return mac;
        }
    }

    T b(String str, Provider provider);
}
