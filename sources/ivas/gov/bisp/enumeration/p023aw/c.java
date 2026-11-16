package ivas.gov.bisp.enumeration.p023aw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public static final Comparator<byte[]> c = new bKr();
    public final List<byte[]> d = new ArrayList();
    public final List<byte[]> e = new ArrayList(64);
    public int f = 0;
    public final int g;

    public class bKr implements Comparator<byte[]> {
        private static int a = 0;
        private static int b = 1;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 11;
            int i6 = (i2 | 11) & (~i5);
            int i7 = i5 << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int length = bArr.length;
            int i11 = -bArr2.length;
            int i12 = length & i11;
            int i13 = (length | i11) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            int i16 = i9 & 85;
            int i17 = ((i9 ^ 85) | i16) << 1;
            int i18 = -((~i16) & (i9 | 85));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            b = i19 % 128;
            int i20 = i19 % 2;
            return i15;
        }
    }

    static {
        int i = a + 71;
        b = i % 128;
        int i2 = i % 2;
    }

    public c(int i) {
        this.g = i;
    }

    public byte[] c(int i) {
        synchronized (this) {
            int i2 = 0;
            while (i2 < this.e.size()) {
                byte[] bArr = this.e.get(i2);
                if (bArr.length >= i) {
                    int i3 = this.f;
                    int i4 = -bArr.length;
                    int i5 = i3 & i4;
                    this.f = (i5 - (~(-(-((i3 ^ i4) | i5))))) - 1;
                    this.e.remove(i2);
                    this.d.remove(bArr);
                    return bArr;
                }
                int i6 = i2 & (-33);
                int i7 = -(-((i2 ^ (-33)) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = i8 & 34;
                int i10 = (~i9) & (i8 | 34);
                int i11 = i9 << 1;
                i2 = ((i10 | i11) << 1) - (i11 ^ i10);
            }
            return new byte[i];
        }
    }

    public void d(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length <= this.g) {
                    this.d.add(bArr);
                    int iBinarySearch = Collections.binarySearch(this.e, bArr, c);
                    if (iBinarySearch < 0) {
                        int i = -iBinarySearch;
                        iBinarySearch = (i << 1) + (i ^ (-1));
                    }
                    this.e.add(iBinarySearch, bArr);
                    int i2 = this.f;
                    int length = bArr.length;
                    int i3 = i2 & length;
                    int i4 = (length | i2) & (~i3);
                    int i5 = -(-(i3 << 1));
                    this.f = (i4 ^ i5) + ((i4 & i5) << 1);
                    synchronized (this) {
                        while (this.f > this.g) {
                            byte[] bArrRemove = this.d.remove(0);
                            this.e.remove(bArrRemove);
                            int i6 = this.f;
                            int i7 = -bArrRemove.length;
                            int i8 = i6 & i7;
                            this.f = i8 + ((i7 ^ i6) | i8);
                        }
                    }
                }
            }
        }
    }
}
