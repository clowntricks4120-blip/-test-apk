package ivas.gov.bisp.enumeration.p053bz;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<SecureRandom> c = new btR();

    static {
        int i = b;
        int i2 = i & 9;
        int i3 = (i ^ 9) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static byte[] b(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-46)) | ((~i3) & 45);
        int i5 = -(-((i3 & 45) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArr = new byte[i];
        SecureRandom secureRandom = c.get();
        int i8 = b;
        int i9 = i8 & 33;
        int i10 = (i8 | 33) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        secureRandom.nextBytes(bArr);
        int i14 = b;
        int i15 = i14 & 9;
        int i16 = ((((i14 ^ 9) | i15) << 1) - (~(-((i14 | 9) & (~i15))))) - 1;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 88 / 0;
        }
        return bArr;
    }

    public class btR extends ThreadLocal<SecureRandom> {
        private static int a = 1;
        public static final byte[] b = {28, 127, 47, 53, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
        public static final int c = 114;
        private static int d;

        /* JADX WARN: Code duplicated, block: B:23:0x00c0 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #0 {all -> 0x016b, blocks: (B:6:0x001f, B:12:0x0083, B:21:0x00bc, B:23:0x00c0, B:25:0x00d9, B:32:0x0120), top: B:43:0x001f }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0103  */
        /* JADX WARN: Code duplicated, block: B:29:0x010a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0120 A[Catch: all -> 0x016b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x016b, blocks: (B:6:0x001f, B:12:0x0083, B:21:0x00bc, B:23:0x00c0, B:25:0x00d9, B:32:0x0120), top: B:43:0x001f }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0130  */
        /* JADX WARN: Code duplicated, block: B:36:0x0132  */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // java.lang.ThreadLocal
        public java.security.SecureRandom initialValue() {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bz.Q.btR.initialValue():java.lang.Object");
        }
    }
}
