package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends J {
    private static int a = 0;
    private static int b = 1;

    public static O c(byte[] bArr) throws IOException {
        int i = 2 % 2;
        C0266l c0266l = new C0266l(bArr);
        try {
            O oJ = c0266l.j();
            int i2 = a;
            int i3 = i2 & 43;
            int i4 = (i2 ^ 43) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                c0266l.available();
                throw null;
            }
            if (c0266l.available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            int i6 = b;
            int i7 = (((i6 ^ 67) | (i6 & 67)) << 1) - (((~i6) & 67) | (i6 & (-68)));
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (((i8 | 72) << 1) - (i8 ^ 72)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            return oJ;
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public void d(OutputStream outputStream) {
        int i = 2 % 2;
        a aVar = new a(outputStream);
        int i2 = b;
        int i3 = ((((i2 ^ 79) | (i2 & 79)) << 1) - (~(-(((~i2) & 79) | (i2 & (-80)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        i(aVar, true);
        int i5 = b;
        int i6 = ((i5 & (-70)) | ((~i5) & 69)) + ((i5 & 69) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public void e(OutputStream outputStream, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 47;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 47)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        (i6 % 2 == 0 ? a.g(outputStream, str) : a.g(outputStream, str)).A(this, true);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public final boolean equals(Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 45) << 1;
        int i5 = -(((~i3) & 45) | (i3 & (-46)));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0 ? this == obj : this == obj) {
            int i8 = i7 + 105;
            b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof i)) {
            int i10 = b;
            i = ((i10 & 63) - (~(-(-(i10 | 63))))) - 1;
            a = i % 128;
            if (i % 2 != 0) {
                int i11 = 3 % 2;
            }
            z = false;
        } else {
            int i12 = (i7 & 95) + (i7 | 95);
            b = i12 % 128;
            int i13 = i12 % 2;
            O oF = ((i) obj).f();
            if (i13 == 0) {
                int i14 = 66 / 0;
                if (h(oF)) {
                    z = true;
                } else {
                    int i15 = b;
                    i = ((i15 & 63) - (~(-(-(i15 | 63))))) - 1;
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i16 = 3 % 2;
                    }
                    z = false;
                }
            } else if (h(oF)) {
                z = true;
            } else {
                int i17 = b;
                i = ((i17 & 63) - (~(-(-(i17 | 63))))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    int i18 = 3 % 2;
                }
                z = false;
            }
        }
        int i19 = a;
        int i20 = i19 & 111;
        int i21 = i19 | 111;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 56 / 0;
        }
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public final O f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 47;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract boolean h(O o2);

    public abstract void i(a aVar, boolean z);

    public abstract int j();

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    public final boolean k(O o2) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = (i2 ^ 45) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this != o2) {
            int i8 = ((i6 | 70) << 1) - (i6 ^ 70);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (h(o2)) {
                int i11 = a;
                int i12 = (-2) - (((i11 & 68) + (i11 | 68)) ^ (-1));
                b = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                int i14 = b;
                int i15 = i14 & 23;
                int i16 = (i14 | 23) & (~i15);
                int i17 = i15 << 1;
                int i18 = (i16 & i17) + (i16 | i17);
                int i19 = i18 % 128;
                a = i19;
                z = i18 % 2 != 0;
                int i20 = ((i19 ^ 83) | (i19 & 83)) << 1;
                int i21 = -(((~i19) & 83) | (i19 & (-84)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 2 % 5;
                }
            }
        } else {
            int i110 = a;
            int i111 = (-2) - (((i110 & 68) + (i110 | 68)) ^ (-1));
            b = i111 % 128;
            int i112 = i111 % 2;
            z = true;
        }
        int i24 = a;
        int i25 = i24 & 83;
        int i26 = -(-((i24 ^ 83) | i25));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract boolean l();

    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 110) + ((i2 & 110) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public O n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 36) + (i2 | 36)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return this;
    }
}
