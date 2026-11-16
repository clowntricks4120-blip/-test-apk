package ivas.gov.bisp.enumeration.p063ci;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class az {
    private static int a = 0;
    private static int b = 1;
    public static final long c = Runtime.getRuntime().maxMemory();

    static {
        int i = b;
        int i2 = (i & 21) + (i | 21);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int b(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 + 73;
        a = i5 % 128;
        int i6 = i5 % 2;
        if (i > 127) {
            int i7 = (i4 & 69) + (i4 | 69);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (-2) - ((((i8 | 116) << 1) - (i8 ^ 116)) ^ (-1));
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                int i13 = b;
                int i14 = i13 & 43;
                int i15 = (i13 | 43) & (~i14);
                int i16 = -(-(i14 << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    i12 = (i12 ^ 5) + ((i12 & 5) << 1);
                } else {
                    int i18 = i12 & (-32);
                    int i19 = -(-((i12 ^ (-32)) | i18));
                    int i20 = (i18 & i19) + (i19 | i18);
                    int i21 = i20 & 33;
                    int i22 = ((i20 ^ 33) | i21) << 1;
                    int i23 = -((~i21) & (i20 | 33));
                    i12 = ((i22 | i23) << 1) - (i22 ^ i23);
                }
            }
            int i24 = (i12 - 1) * 8;
            int i25 = a;
            int i26 = (i25 ^ 104) + ((i25 & 104) << 1);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            i2 = 1;
            while (i24 >= 0) {
                int i29 = b;
                int i30 = i29 & 27;
                int i31 = (i29 ^ 27) | i30;
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                a = i32 % 128;
                if (i32 % 2 != 0) {
                    int i33 = i2 & 8;
                    int i34 = (i2 | 8) & (~i33);
                    int i35 = -(-(i33 << 1));
                    int i36 = (i34 & i35) + (i34 | i35);
                    int i37 = i24 - 35;
                    int i38 = i37 & 128;
                    i24 = ((i37 | 128) & (~i38)) + (i38 << 1);
                    i2 = i36;
                } else {
                    int i39 = (i2 & 1) + (i2 | 1);
                    int i40 = i24 & (-8);
                    int i41 = -(-((i24 ^ (-8)) | i40));
                    int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                    i2 = i39;
                    i24 = i42;
                }
                int i43 = (i29 & 23) + (i29 | 23);
                a = i43 % 128;
                if (i43 % 2 != 0) {
                    int i44 = 2 % 3;
                }
            }
        } else {
            i2 = 1;
        }
        int i45 = a;
        int i46 = (i45 ^ 94) + ((i45 & 94) << 1);
        int i47 = (i46 ^ (-1)) + (i46 << 1);
        b = i47 % 128;
        int i48 = i47 % 2;
        return i2;
    }

    public static int c(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (((i5 ^ 89) | (i5 & 89)) << 1) - ((i5 & (-90)) | ((~i5) & 89));
        b = i6 % 128;
        int i7 = i6 % 2;
        if (i >= 31) {
            int i8 = i5 & 71;
            int i9 = i8 + ((i5 ^ 71) | i8);
            int i10 = i9 % 128;
            b = i10;
            int i11 = 4;
            if (i9 % 2 != 0 ? i >= 128 : i >= 24571) {
                byte[] bArr = new byte[5];
                int i12 = i10 & 123;
                int i13 = ((i10 | 123) & (~i12)) + (i12 << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 2;
                }
                while (true) {
                    i >>= 7;
                    i11--;
                    int i15 = b;
                    int i16 = i15 & 89;
                    int i17 = (i15 ^ 89) | i16;
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    int i19 = i18 % 128;
                    a = i19;
                    if (i18 % 2 != 0) {
                        bArr[i11] = (byte) ((i | 48) & 22214);
                    } else {
                        bArr[i11] = (byte) ((i & 127) ^ 128);
                    }
                    int i20 = i19 + 113;
                    i3 = i20 % 128;
                    b = i3;
                    if (i20 % 2 == 0) {
                        if (i <= 105) {
                            break;
                        }
                    } else if (i <= 127) {
                        break;
                    }
                }
                int i21 = i3 + 113;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = -(2 << i11);
                    i2 = (i22 & 1) + (i22 | 1);
                } else {
                    int i23 = -i11;
                    int i24 = i23 & 5;
                    int i25 = -(-((i24 - (~(-(-((i23 ^ 5) | i24))))) - 1));
                    int i26 = i25 & 1;
                    int i27 = -(-((i25 ^ 1) | i26));
                    i2 = ((i26 | i27) << 1) - (i27 ^ i26);
                }
            } else {
                int i28 = ((i10 & 48) + (i10 | 48)) - 1;
                a = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 4 / 5;
                }
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        int i30 = a;
        int i31 = i30 & 77;
        int i32 = (((i30 ^ 77) | i31) << 1) - ((i30 | 77) & (~i31));
        b = i32 % 128;
        int i33 = i32 % 2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf A[Catch: IOException -> 0x010c, PHI: r9
  0x00bf: PHI (r9v12 java.nio.channels.FileChannel) = (r9v11 java.nio.channels.FileChannel), (r9v29 java.nio.channels.FileChannel) binds: [B:29:0x00bd, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {IOException -> 0x010c, blocks: (B:24:0x00aa, B:30:0x00bf, B:28:0x00b7), top: B:54:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    public static int d(InputStream inputStream) {
        FileChannel channel;
        long size;
        int i;
        int iAvailable;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 121;
        int i5 = -(-((i3 & 121) << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            boolean z = inputStream instanceof ax;
            obj.hashCode();
            throw null;
        }
        if (inputStream instanceof ax) {
            int i7 = (i3 & 5) + (i3 | 5);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = ((ax) inputStream).d;
            int i10 = b;
            int i11 = i10 & 13;
            int i12 = -(-((i10 ^ 13) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return i9;
        }
        if (!(!(inputStream instanceof C0266l))) {
            int i15 = (i3 ^ 3) + ((i3 & 3) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((C0266l) inputStream).c;
            int i18 = a;
            int i19 = i18 | 17;
            int i20 = (i19 << 1) - ((~(i18 & 17)) & i19);
            b = i20 % 128;
            int i21 = i20 % 2;
            return i17;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            int i22 = (i3 ^ 109) + ((i3 & 109) << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                iAvailable = ((ByteArrayInputStream) inputStream).available();
                int i23 = 80 / 0;
            } else {
                iAvailable = ((ByteArrayInputStream) inputStream).available();
            }
            int i24 = a;
            int i25 = (i24 & 121) + (i24 | 121);
            b = i25 % 128;
            int i26 = i25 % 2;
            return iAvailable;
        }
        if (inputStream instanceof FileInputStream) {
            int i27 = (((i3 | 40) << 1) - (i3 ^ 40)) - 1;
            b = i27 % 128;
            try {
                if (i27 % 2 == 0) {
                    channel = ((FileInputStream) inputStream).getChannel();
                    int i28 = 74 / 0;
                    if (channel != null) {
                        size = channel.size();
                        int i29 = a + 93;
                        b = i29 % 128;
                        int i30 = i29 % 2;
                    } else {
                        int i31 = a;
                        int i32 = i31 & 53;
                        int i33 = (i31 ^ 53) | i32;
                        int i34 = (i32 & i33) + (i33 | i32);
                        b = i34 % 128;
                        int i35 = i34 % 2;
                        size = 2147483647L;
                    }
                } else {
                    channel = ((FileInputStream) inputStream).getChannel();
                    if (channel != null) {
                        size = channel.size();
                        int i210 = a + 93;
                        b = i210 % 128;
                        int i36 = i210 % 2;
                    } else {
                        int i37 = a;
                        int i38 = i37 & 53;
                        int i39 = (i37 ^ 53) | i38;
                        int i310 = (i38 & i39) + (i39 | i38);
                        b = i310 % 128;
                        int i311 = i310 % 2;
                        size = 2147483647L;
                    }
                }
                if (size < 2147483647L) {
                    int i40 = b + 17;
                    int i41 = i40 % 128;
                    a = i41;
                    if (i40 % 2 != 0) {
                        i = (int) size;
                        int i42 = 44 / 0;
                    } else {
                        i = (int) size;
                    }
                    int i43 = i41 & 9;
                    int i44 = (i41 | 9) & (~i43);
                    int i45 = i43 << 1;
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    b = i46 % 128;
                    if (i46 % 2 == 0) {
                        int i47 = 12 / 0;
                    }
                    return i;
                }
            } catch (IOException unused) {
            }
        }
        long j = c;
        if (j > 2147483647L) {
            int i48 = b;
            int i49 = i48 & 57;
            int i50 = (((i48 ^ 57) | i49) << 1) - ((~i49) & (i48 | 57));
            a = i50 % 128;
            int i51 = i50 % 2;
            int i52 = (-2) - ((i48 + 70) ^ (-1));
            a = i52 % 128;
            int i53 = i52 % 2;
            return Integer.MAX_VALUE;
        }
        int i54 = (int) j;
        int i55 = a;
        int i56 = i55 & 41;
        int i57 = (i55 ^ 41) | i56;
        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
        b = i58 % 128;
        if (i58 % 2 != 0) {
            return i54;
        }
        throw null;
    }
}
