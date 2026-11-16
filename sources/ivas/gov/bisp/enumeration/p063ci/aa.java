package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class aa extends AbstractC0274t {
    private static int a = 1;
    private static int b;

    public aa(C0278x c0278x, C0258a c0258a, O o2, int i, O o3) {
        super(c0278x, c0258a, o2, i, o3);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2;
        int i3 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0278x c0278x = this.c;
        if (c0278x != null) {
            int i4 = a;
            int i5 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                byteArrayOutputStream.write(c0278x.g("DER"));
                throw null;
            }
            byteArrayOutputStream.write(c0278x.g("DER"));
        }
        C0258a c0258a = this.d;
        if (c0258a != null) {
            int i6 = b + 89;
            a = i6 % 128;
            int i7 = i6 % 2;
            byteArrayOutputStream.write(c0258a.g("DER"));
            int i8 = b + 21;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        O o2 = this.e;
        if (o2 != null) {
            int i10 = a + 87;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                byteArrayOutputStream.write(o2.g("DER"));
                throw null;
            }
            byteArrayOutputStream.write(o2.g("DER"));
        }
        aj ajVar = new aj(true, this.g, this.f, 0);
        int i11 = a + 125;
        b = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArrG = ajVar.g("DER");
        if (i12 != 0) {
            byteArrayOutputStream.write(bArrG);
            i = 33;
            i2 = 125;
        } else {
            byteArrayOutputStream.write(bArrG);
            i = 32;
            i2 = 8;
        }
        aVar.u(z, i, i2, byteArrayOutputStream.toByteArray());
        int i13 = b;
        int i14 = (i13 & (-14)) | ((~i13) & 13);
        int i15 = (i13 & 13) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0274t, ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 109;
        int i4 = -(-((i2 & 109) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int length = getEncoded().length;
        int i7 = a + 45;
        b = i7 % 128;
        int i8 = i7 % 2;
        return length;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0274t, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 63) | (i2 & 63)) << 1) - (~(-(((~i2) & 63) | (i2 & (-64)))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 93;
        int i7 = i6 + ((i4 ^ 93) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0274t, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 125) + ((i2 & 125) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 67;
        int i7 = i6 + ((i4 ^ 67) | i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
