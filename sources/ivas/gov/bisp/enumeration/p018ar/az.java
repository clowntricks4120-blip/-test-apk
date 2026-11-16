package ivas.gov.bisp.enumeration.p018ar;

import android.support.v4.media.session.PlaybackStateCompat;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class az {
    private static int a = 1;
    private static int b;

    public static class aZG {
        public long a;
        public long b;
    }

    public static aZG b(RandomAccessFile randomAccessFile) throws IOException {
        long length;
        long j;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = -(-((i2 & 21) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            length = randomAccessFile.length() ^ 22;
            j = 1;
        } else {
            length = randomAccessFile.length() - 22;
            j = 0;
        }
        if (length < 0) {
            StringBuilder sbW = j.w("File too short to be a zip file: ");
            sbW.append(randomAccessFile.length());
            throw new ZipException(sbW.toString());
        }
        int i6 = b;
        int i7 = ((i6 ^ 49) | (i6 & 49)) << 1;
        int i8 = -(((~i6) & 49) | (i6 & (-50)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        long j2 = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        if (j2 >= 0) {
            int i12 = ((i10 & 28) + (i10 | 28)) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 75 / 0;
            }
            j = j2;
        }
        int iReverseBytes = Integer.reverseBytes(101010256);
        int i14 = b;
        int i15 = ((i14 | 43) << 1) - (i14 ^ 43);
        a = i15 % 128;
        int i16 = i15 % 2;
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                int i17 = b;
                int i18 = ((i17 ^ 33) - (~((i17 & 33) << 1))) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                aZG azg = new aZG();
                int i20 = a + 121;
                b = i20 % 128;
                int i21 = i20 % 2;
                azg.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                long jReverseBytes = Integer.reverseBytes(randomAccessFile.readInt());
                int i22 = a;
                int i23 = (((i22 | 84) << 1) - (i22 ^ 84)) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                azg.a = jReverseBytes & 4294967295L;
                int i25 = a;
                int i26 = (((i25 & (-28)) | ((~i25) & 27)) - (~(-(-((i25 & 27) << 1))))) - 1;
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    return azg;
                }
                throw null;
            }
            length--;
        } while (length >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
