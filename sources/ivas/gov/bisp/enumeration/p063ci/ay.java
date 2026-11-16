package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ay implements Enumeration {
    private static int a = 1;
    private static int b;
    public C0266l c;
    public Object d = c();

    public ay(byte[] bArr) {
        this.c = new C0266l(bArr, true);
    }

    public final Object c() {
        O oJ;
        int i = 2 % 2;
        int i2 = b + 116;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                oJ = this.c.j();
                int i4 = 78 / 0;
            } else {
                oJ = this.c.j();
            }
            return oJ;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("malformed DER construction: ");
            sb.append(e);
            throw new C0267m(sb.toString(), e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 105;
        int i4 = ((i2 & 105) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (this.d != null) {
            int i8 = i2 | 87;
            int i9 = (i8 << 1) - (i8 & (~(i2 & 87)));
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i2 & 23;
            int i12 = ((i2 ^ 23) | i11) << 1;
            int i13 = -((~i11) & (i2 | 23));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            int i16 = (((i2 ^ 49) | (i2 & 49)) << 1) - ((i2 & (-50)) | ((~i2) & 49));
            a = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        }
        int i18 = (((i2 | 1) << 1) - (~(-(i2 ^ 1)))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 89) << 1) - (~(-((i2 & (-90)) | ((~i2) & 89))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.d;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        int i5 = i2 | 53;
        int i6 = i5 << 1;
        int i7 = -((~(i2 & 53)) & i5);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        this.d = c();
        int i10 = a;
        int i11 = i10 & 19;
        int i12 = (i10 | 19) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return obj;
        }
        throw null;
    }
}
