package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0261e extends O {
    private static int a = 1;
    private static int b;
    public static final C0261e c = new C0261e((byte) 0);
    public static final C0261e d;
    public final byte e;

    static {
        C0261e c0261e = new C0261e((byte) -1);
        int i = b;
        int i2 = i & 35;
        int i3 = (((i ^ 35) | i2) << 1) - ((i | 35) & (~i2));
        a = i3 % 128;
        int i4 = i3 % 2;
        d = c0261e;
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
    }

    public C0261e(byte b2) {
        this.e = b2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 17;
        b = i3 % 128;
        boolean z = true;
        if (i3 % 2 == 0 ? !(o2 instanceof C0261e) : !(o2 instanceof C0261e)) {
            int i4 = i2 ^ 89;
            int i5 = -(-((i2 & 89) << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (o() == ((C0261e) o2).o()) {
            int i8 = a;
            int i9 = (((i8 & (-76)) | ((~i8) & 75)) - (~(-(-((i8 & 75) << 1))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = ((i8 ^ 38) + ((i8 & 38) << 1)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z = false;
        }
        int i13 = a;
        int i14 = i13 & 101;
        int i15 = i14 + ((i13 ^ 101) | i14);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 95 / 0;
        }
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 62) + ((i2 & 62) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean zO = o();
        int i6 = b;
        int i7 = (i6 & (-98)) | ((~i6) & 97);
        int i8 = -(-((i6 & 97) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return zO ? 1 : 0;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a + 99;
        b = i2 % 128;
        return i2 % 2 != 0 ? 4 : 3;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 71) | (i2 & 71)) << 1) - (~(-(((~i2) & 71) | (i2 & (-72)))))) - 1;
        int i4 = i3 % 128;
        a = i4;
        boolean z = i3 % 2 == 0;
        int i5 = ((i4 | 55) << 1) - (i4 ^ 55);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        C0261e c0261e;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-38)) | ((~i2) & 37)) - (~(-(-((i2 & 37) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (o()) {
            int i5 = a;
            int i6 = (-2) - (((i5 ^ 80) + ((i5 & 80) << 1)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            c0261e = d;
            int i8 = (i5 ^ 99) + ((i5 & 99) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            c0261e = c;
            int i10 = b;
            int i11 = i10 & 15;
            int i12 = -(-((i10 ^ 15) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = i15 & 79;
        int i17 = -(-((i15 ^ 79) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return c0261e;
        }
        throw null;
    }

    public boolean o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        boolean z = true;
        int i4 = (((~i3) & (i2 | 39)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.e != 0) {
            int i6 = ((i2 | 17) << 1) - (i2 ^ 17);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & 25;
            int i9 = (i2 ^ 25) | i8;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i2 + 29;
            b = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        }
        int i14 = i2 + 81;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 71;
        int i4 = ((i2 & 71) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            o();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o()) {
            str = "TRUE";
            int i7 = a;
            int i8 = i7 & 77;
            int i9 = (i8 - (~((i7 ^ 77) | i8))) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 % 5;
            }
        } else {
            str = "FALSE";
            int i11 = a;
            int i12 = i11 & 95;
            int i13 = (i12 - (~((i11 ^ 95) | i12))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = i15 & 111;
        int i17 = ((i15 ^ 111) | i16) << 1;
        int i18 = -((i15 | 111) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 5 / 0;
        }
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte b2 = this.e;
        if (z) {
            ((OutputStream) aVar.c).write(1);
            int i4 = a + 103;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        aVar.w(1);
        OutputStream outputStream = (OutputStream) aVar.c;
        int i6 = b;
        int i7 = i6 & 113;
        int i8 = -(-((i6 ^ 113) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        outputStream.write(b2);
        int i11 = a;
        int i12 = (((i11 | 96) << 1) - (i11 ^ 96)) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
    }
}
