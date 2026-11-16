package ivas.gov.bisp.enumeration.p003ac;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ac.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0086p<T> {
    private static int a = 0;
    private static int b = 1;
    public final Object[] c;
    public int d;

    public C0086p(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.c = new Object[i];
        int i2 = a;
        int i3 = i2 ^ 57;
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean d(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            int length = this.c.length;
            obj.hashCode();
            throw null;
        }
        int i6 = this.d;
        Object[] objArr = this.c;
        if (i6 >= objArr.length) {
            int i7 = i5 & 31;
            int i8 = ((i5 | 31) & (~i7)) + (i7 << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        objArr[i6] = t;
        int i9 = i6 ^ 1;
        int i10 = ((i6 & 1) | i9) << 1;
        int i11 = -i9;
        this.d = ((i10 | i11) << 1) - (i11 ^ i10);
        int i12 = i5 & 101;
        int i13 = (i5 ^ 101) | i12;
        int i14 = (i12 & i13) + (i12 | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    public T c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 113;
        int i4 = ((i2 & 113) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.d;
        if (i9 <= 0) {
            int i10 = i2 & 51;
            int i11 = (i10 - (~((i2 ^ 51) | i10))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            return null;
        }
        int i13 = i7 & 79;
        int i14 = i7 | 79;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((~i9) - (~(i9 << 1))) - 1;
        Object[] objArr = this.c;
        T t = (T) objArr[i17];
        int i18 = i7 & 9;
        int i19 = (i7 ^ 9) | i18;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        objArr[i17] = null;
        this.d = i17;
        int i22 = ((i7 | 59) << 1) - (((~i7) & 59) | (i7 & (-60)));
        b = i22 % 128;
        if (i22 % 2 != 0) {
            return t;
        }
        throw null;
    }
}
