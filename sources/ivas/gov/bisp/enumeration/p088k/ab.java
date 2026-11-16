package ivas.gov.bisp.enumeration.p088k;

/* JADX INFO: loaded from: classes.dex */
public class ab {
    private static int a = 0;
    private static int b = 1;
    public int c = 0;
    public int d = 0;
    public int e = Integer.MIN_VALUE;
    public int f = Integer.MIN_VALUE;
    public int h = 0;
    public int g = 0;
    public boolean i = false;
    public boolean j = false;

    public void c(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 99;
        int i6 = (~i5) & (i4 | 99);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            this.e = i;
            this.f = i2;
            this.j = false;
        } else {
            this.e = i;
            this.f = i2;
            this.j = true;
        }
        int i9 = i4 + 55;
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        Object obj = null;
        if (this.i) {
            int i12 = (i10 ^ 83) + ((i10 & 83) << 1);
            int i13 = i12 % 128;
            b = i13;
            if (i12 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 != Integer.MIN_VALUE) {
                int i14 = ((i13 & (-120)) | ((~i13) & 119)) + ((i13 & 119) << 1);
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                this.c = i2;
                int i17 = ((i15 & 3) - (~(i15 | 3))) - 1;
                b = i17 % 128;
                int i18 = i17 % 2;
            }
            if (i != Integer.MIN_VALUE) {
                int i19 = a;
                int i20 = (i19 & 35) + (i19 | 35);
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                this.d = i;
                int i23 = i21 & 123;
                int i24 = i21 | 123;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                a = i25 % 128;
                int i26 = i25 % 2;
                return;
            }
        } else {
            if (i != Integer.MIN_VALUE) {
                int i27 = i10 & 53;
                int i28 = (i10 | 53) & (~i27);
                int i29 = -(-(i27 << 1));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                int i31 = i30 % 128;
                b = i31;
                if (i30 % 2 == 0) {
                    this.c = i;
                    obj.hashCode();
                    throw null;
                }
                this.c = i;
                int i32 = ((i31 & 74) + (i31 | 74)) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
            }
            if (i2 != Integer.MIN_VALUE) {
                int i34 = b;
                int i35 = i34 ^ 71;
                int i36 = (i34 & 71) << 1;
                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                a = i37 % 128;
                if (i37 % 2 != 0) {
                    this.d = i2;
                    int i38 = 65 / 0;
                } else {
                    this.d = i2;
                }
                int i39 = i34 + 47;
                a = i39 % 128;
                int i40 = i39 % 2;
            }
        }
        int i41 = b + 35;
        a = i41 % 128;
        if (i41 % 2 != 0) {
            throw null;
        }
    }
}
