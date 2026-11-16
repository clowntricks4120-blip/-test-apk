package ivas.gov.bisp.enumeration.bU;

import ivas.gov.bisp.enumeration.bN.Z;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Z {
    private static int a = 1;
    private static int b;
    public final int c;
    public final int d;
    public boolean e;
    public int f;

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public p(int i, int i2, int i3) {
        int i4;
        boolean z;
        this.c = i3;
        this.d = i2;
        if (i3 > 0) {
            if (i <= i2) {
                int i5 = b + 111;
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                z = true;
            } else {
                int i8 = b;
                int i9 = i8 & 99;
                i4 = (((i8 ^ 99) | i9) << 1) - ((i8 | 99) & (~i9));
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i10 = 2 % 2;
                }
                z = false;
            }
        } else if (i < i2) {
            int i11 = b;
            int i12 = i11 & 99;
            i4 = (((i11 ^ 99) | i12) << 1) - ((i11 | 99) & (~i12));
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i13 = 2 % 2;
            }
            z = false;
        } else {
            z = true;
        }
        this.e = z;
        if (!z) {
            int i14 = b + 23;
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int i17 = i15 & 27;
            int i18 = (((i15 ^ 27) | i17) << 1) - ((i15 | 27) & (~i17));
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 2 % 2;
            }
            i = i2;
        }
        this.f = i;
        int i20 = b;
        int i21 = i20 & 57;
        int i22 = (i21 - (~(-(-((i20 ^ 57) | i21))))) - 1;
        a = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 71 / 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (((i2 ^ 73) | i3) << 1) - ((i2 | 73) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.e;
        int i6 = (i5 & 13) + (i5 | 13);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Code duplicated, block: B:14:0x005e A[PHI: r2
  0x005e: PHI (r2v5 int) = (r2v2 int), (r2v6 int) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r2
  0x001f: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.bN.Z
    public final int c() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 123;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.f;
            int i5 = 83 / 0;
            if (i == this.d) {
                int i6 = ((((i3 ^ 25) | (i3 & 25)) << 1) - (~(-((i3 & (-26)) | ((~i3) & 25))))) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                if (this.e) {
                    throw new NoSuchElementException();
                }
                int i8 = ((i3 ^ 11) | (i3 & 11)) << 1;
                int i9 = -(((~i3) & 11) | (i3 & (-12)));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                this.e = false;
            } else {
                int i12 = this.c;
                this.f = (i12 ^ i) + ((i12 & i) << 1);
                int i13 = i3 + 43;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            i = this.f;
            if (i == this.d) {
                int i15 = ((((i3 ^ 25) | (i3 & 25)) << 1) - (~(-((i3 & (-26)) | ((~i3) & 25))))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                if (this.e) {
                    throw new NoSuchElementException();
                }
                int i17 = ((i3 ^ 11) | (i3 & 11)) << 1;
                int i18 = -(((~i3) & 11) | (i3 & (-12)));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                b = i19 % 128;
                int i110 = i19 % 2;
                this.e = false;
            } else {
                int i111 = this.c;
                this.f = (i111 ^ i) + ((i111 & i) << 1);
                int i112 = i3 + 43;
                b = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i20 = b + 17;
        a = i20 % 128;
        int i21 = i20 % 2;
        return i;
    }
}
