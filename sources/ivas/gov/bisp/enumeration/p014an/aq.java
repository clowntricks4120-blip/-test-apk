package ivas.gov.bisp.enumeration.p014an;

import ivas.gov.bisp.enumeration.O.i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public ByteBuffer d;
    public int e;
    public int f;

    public aq() {
        if (i.h == null) {
            i.h = new i();
            int i = a;
            int i2 = (i & (-108)) | ((~i) & 107);
            int i3 = (i & 107) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        int i6 = a;
        int i7 = (i6 & (-6)) | ((~i6) & 5);
        int i8 = (i6 & 5) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public int c(int i) {
        short s;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 107;
        int i5 = (i3 ^ 107) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (i < this.f) {
            int i9 = i7 & 47;
            int i10 = ((i7 ^ 47) | i9) << 1;
            int i11 = -((i7 | 47) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            ByteBuffer byteBuffer = this.d;
            int i14 = this.e;
            int i15 = -(~(-(-i)));
            int i16 = (i14 & i15) + (i15 | i14);
            s = byteBuffer.getShort((i16 ^ (-1)) + (i16 << 1));
            int i17 = a;
            int i18 = ((i17 | 23) << 1) - (i17 ^ 23);
            b = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = i7 & 117;
            int i21 = ((i7 ^ 117) | i20) << 1;
            int i22 = -((i7 | 117) & (~i20));
            int i23 = (i21 & i22) + (i21 | i22);
            b = i23 % 128;
            int i24 = i23 % 2;
            s = 0;
        }
        int i25 = b;
        int i26 = (i25 & 39) + (i25 | 39);
        a = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 83 / 0;
        }
        return s;
    }

    public void d(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.d = byteBuffer;
        if (byteBuffer == null) {
            this.c = 0;
            this.e = 0;
            this.f = 0;
            int i8 = (((i6 | 108) << 1) - (i6 ^ 108)) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = (i6 | 105) << 1;
        int i11 = -(((~i6) & 105) | (i6 & (-106)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            this.c = i;
            i2 = i >> byteBuffer.getInt(i);
        } else {
            this.c = i;
            int i13 = -byteBuffer.getInt(i);
            i2 = (i | i13) + (i & i13);
        }
        this.e = i2;
        int i14 = a + 18;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            this.f = this.d.getShort(i2);
            return;
        }
        this.f = this.d.getShort(i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
