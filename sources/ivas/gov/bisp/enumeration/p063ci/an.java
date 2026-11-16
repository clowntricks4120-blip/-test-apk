package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class an extends AbstractC0274t {
    private static int a = 1;
    private static int b;

    public an(C0270p c0270p) {
        super(c0270p);
    }

    public an(C0278x c0278x, C0258a c0258a, O o2, int i, O o3) {
        super(c0278x, c0258a, o2, i, o3);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0278x c0278x = this.c;
        Object obj = null;
        if (c0278x != null) {
            int i2 = a + 85;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                byteArrayOutputStream.write(c0278x.g("DL"));
                obj.hashCode();
                throw null;
            }
            byteArrayOutputStream.write(c0278x.g("DL"));
        }
        C0258a c0258a = this.d;
        if (c0258a != null) {
            int i3 = a;
            int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                byteArrayOutputStream.write(c0258a.g("DL"));
                obj.hashCode();
                throw null;
            }
            byteArrayOutputStream.write(c0258a.g("DL"));
            int i5 = b;
            int i6 = i5 ^ 103;
            int i7 = ((i5 & 103) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 4;
            }
        }
        O o2 = this.e;
        if (o2 != null) {
            int i11 = a;
            int i12 = i11 & 13;
            int i13 = -(-(i11 | 13));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            byteArrayOutputStream.write(o2.g("DL"));
            int i16 = b;
            int i17 = (((i16 | 42) << 1) - (i16 ^ 42)) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        aj ajVar = new aj(true, this.g, this.f, 1);
        int i19 = b;
        int i20 = ((i19 & 28) + (i19 | 28)) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        byteArrayOutputStream.write(ajVar.g("DL"));
        int i22 = b;
        int i23 = (i22 & 71) + (i22 | 71);
        a = i23 % 128;
        int i24 = i23 % 2;
        aVar.u(z, 32, 8, byteArrayOutputStream.toByteArray());
        int i25 = a;
        int i26 = (((i25 | 34) << 1) - (i25 ^ 34)) - 1;
        b = i26 % 128;
        int i27 = i26 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0274t, ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = getEncoded();
        if (i3 != 0) {
            return encoded.length;
        }
        int length = encoded.length;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0274t, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 61) - (~(-(-((i2 & 61) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 27;
        int i6 = -(-((i2 ^ 27) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }
}
