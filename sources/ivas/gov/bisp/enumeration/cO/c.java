package ivas.gov.bisp.enumeration.cO;

import ivas.gov.bisp.enumeration.p088k.C0321u;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 0;
    private static int b = 1;
    public static final C0321u c = new C0321u(5);

    static {
        int i = b;
        int i2 = ((i & (-98)) | ((~i) & 97)) + ((i & 97) << 1);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        byte[] bArr3;
        int i3 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0321u c0321u = c;
            int i4 = b;
            int i5 = i4 & 3;
            int i6 = i5 + ((i4 ^ 3) | i5);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                Objects.requireNonNull(c0321u);
                bArr2 = new byte[45];
            } else {
                Objects.requireNonNull(c0321u);
                bArr2 = new byte[72];
            }
            int i7 = b;
            int i8 = i7 & 61;
            int i9 = -(-((i7 ^ 61) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i;
            int i13 = i2;
            while (true) {
                int i14 = 0;
                if (i13 <= 0) {
                    break;
                }
                int i15 = a + 29;
                b = i15 % 128;
                int i16 = i15 % 2;
                int iMin = Math.min(36, i13);
                int i17 = -(-i12);
                int i18 = iMin & i17;
                int i19 = (i17 ^ iMin) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = a;
                int i22 = (i21 & 15) + (i21 | 15);
                int i23 = i22 % 128;
                b = i23;
                int i24 = i22 % 2;
                int i25 = (((i23 | 72) << 1) - (i23 ^ 72)) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                int i27 = 0;
                while (i12 < i20) {
                    int i28 = a;
                    int i29 = ((i28 ^ 67) - (~((i28 & 67) << 1))) - 1;
                    int i30 = i29 % 128;
                    b = i30;
                    int i31 = i29 % 2;
                    byte b2 = bArr[i12];
                    int i32 = b2 & 255;
                    int i33 = ((i27 ^ 2) + ((i27 & 2) << 1)) - 1;
                    int i34 = (i30 ^ 15) + ((i30 & 15) << 1);
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        bArr3 = (byte[]) c0321u.c;
                        int i35 = 19 / i14;
                    } else {
                        bArr3 = (byte[]) c0321u.c;
                    }
                    int i36 = a;
                    int i37 = (-2) - (((i36 ^ 122) + ((i36 & 122) << 1)) ^ (-1));
                    b = i37 % 128;
                    if (i37 % 2 == 0) {
                        bArr2[i27] = bArr3[i32 * 3];
                        i27 = i33 / 0;
                    } else {
                        bArr2[i27] = bArr3[i32 >>> 4];
                        int i38 = i33 & 1;
                        int i39 = ((i33 ^ 1) | i38) << 1;
                        int i40 = -((~i38) & (i33 | 1));
                        i27 = (i39 ^ i40) + ((i39 & i40) << 1);
                    }
                    bArr2[i33] = bArr3[b2 & 15];
                    i12 = (((i12 & (-2)) | ((~i12) & 1)) - (~(-(-((i12 & 1) << 1))))) - 1;
                    int i41 = ((i36 & (-22)) | ((~i36) & 21)) + ((i36 & 21) << 1);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    i14 = 0;
                }
                int i43 = i27 << 1;
                int i44 = -i27;
                byteArrayOutputStream.write(bArr2, 0, (i43 ^ i44) + ((i43 & i44) << 1));
                int i45 = -(~(-iMin));
                int i46 = (i13 ^ i45) + ((i45 & i13) << 1);
                i13 = (i46 << 1) + (i46 ^ (-1));
                int i47 = a;
                int i48 = ((i47 ^ 81) | (i47 & 81)) << 1;
                int i49 = -(((~i47) & 81) | (i47 & (-82)));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                int i51 = i50 % 128;
                b = i51;
                if (i50 % 2 == 0) {
                    int i52 = 23 / 0;
                }
                int i53 = i51 & 93;
                int i54 = (((i51 ^ 93) | i53) << 1) - ((i51 | 93) & (~i53));
                a = i54 % 128;
                int i55 = i54 % 2;
                i12 = i20;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i56 = a;
            int i57 = i56 ^ 61;
            int i58 = ((i56 & 61) | i57) << 1;
            int i59 = -i57;
            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
            b = i60 % 128;
            if (i60 % 2 == 0) {
                int i61 = 36 / 0;
            }
            return byteArray;
        } catch (Exception e) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("exception encoding Hex string: ");
            sbW.append(e.getMessage());
            throw new j(sbW.toString(), e);
        }
    }
}
