package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements i, h {
    private static int a = 0;
    private static int b = 1;

    public void e(OutputStream outputStream, String str) {
        int i = 2 % 2;
        int i2 = b + 109;
        a = i2 % 128;
        int i3 = i2 % 2;
        a.g(outputStream, str).y(this);
        int i4 = a;
        int i5 = i4 & 123;
        int i6 = (((i4 | 123) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 94) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = (i2 ^ 97) + ((i2 & 97) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof i)) {
            int i7 = (i2 & (-18)) | ((~i2) & 17);
            int i8 = (i2 & 17) << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = ((i2 & 37) - (~(i2 | 37))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        O oF = f();
        O oF2 = ((i) obj).f();
        int i13 = b;
        int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
        a = i14 % 128;
        int i15 = i14 % 2;
        boolean zK = oF.k(oF2);
        if (i15 != 0) {
            int i16 = 34 / 0;
        }
        int i17 = b;
        int i18 = (((i17 & (-28)) | ((~i17) & 27)) - (~((i17 & 27) << 1))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        return zK;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public abstract O f();

    public byte[] g(String str) {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e(byteArrayOutputStream, str);
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = -(-(i2 | 81));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i7 = a + 71;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return byteArray;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(byteArrayOutputStream);
        int i2 = a;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            byteArrayOutputStream.toByteArray();
            throw null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i4 = b;
        int i5 = (i4 & 13) + (i4 | 13);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return byteArray;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        O oF = f();
        if (i7 == 0) {
            return oF.hashCode();
        }
        oF.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void d(OutputStream outputStream) {
        int i = 2 % 2;
        a aVar = new a(outputStream);
        O oF = f();
        int i2 = b;
        int i3 = (((i2 ^ 31) | (i2 & 31)) << 1) - (((~i2) & 31) | (i2 & (-32)));
        a = i3 % 128;
        int i4 = i3 % 2;
        oF.i(aVar, true);
        int i5 = b;
        int i6 = (i5 & 55) + (i5 | 55);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
