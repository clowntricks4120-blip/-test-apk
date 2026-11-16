package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class am extends AbstractC0264h {
    private static int a = 0;
    private static int b = 1;

    public am(int i, C0270p c0270p) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = b;
        int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 2;
        }
        int i5 = 0;
        while (i5 != c0270p.e) {
            int i6 = a;
            int i7 = i6 & 23;
            int i8 = -(-(i6 | 23));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                ((J) c0270p.d(i5)).g("BER");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            try {
                byteArrayOutputStream.write(((J) c0270p.d(i5)).g("BER"));
                int i10 = i5 & 1;
                int i11 = (i5 ^ 1) | i10;
                i5 = (i11 | i10) + (i10 & i11);
                int i12 = b + 11;
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 % 5;
                } else {
                    int i14 = 2 % 2;
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("malformed object: ");
                sb.append(e);
                throw new C0267m(sb.toString(), e);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("malformed object: ");
            sb2.append(e);
            throw new C0267m(sb2.toString(), e);
        }
        super(true, i, byteArrayOutputStream.toByteArray());
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0264h, ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 29) + ((i3 & 29) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.c) {
            int i6 = a;
            int i7 = ((i6 | 35) << 1) - (i6 ^ 35);
            b = i7 % 128;
            i = i7 % 2 == 0 ? 42 : 96;
            int i8 = (i6 ^ 19) + ((i6 & 19) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = b;
            int i11 = i10 ^ 113;
            int i12 = ((i10 & 113) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            i = 64;
        }
        int i16 = this.d;
        byte[] bArr = this.e;
        int i17 = a;
        int i18 = i17 & 89;
        int i19 = (((i17 | 89) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        aVar.z(z, i, i16);
        aVar.r(128);
        int length = bArr.length;
        Object obj = aVar.c;
        int i21 = b + 100;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            ((OutputStream) obj).write(bArr, 0, length);
        } else {
            ((OutputStream) obj).write(bArr, 0, length);
        }
        aVar.r(0);
        aVar.r(0);
        int i23 = b + 71;
        a = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 26 / 0;
        }
    }
}
