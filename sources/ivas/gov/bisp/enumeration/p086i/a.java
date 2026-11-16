package ivas.gov.bisp.enumeration.p086i;

import android.hardware.usb.UsbDeviceConnection;
import android.util.Log;
import ivas.gov.bisp.enumeration.cC.J;
import ivas.gov.bisp.enumeration.cC.v;
import ivas.gov.bisp.enumeration.p037bj.j;
import ivas.gov.bisp.enumeration.p063ci.C0259b;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.ao;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 1;
    private static int b;
    public Object c;

    public a(int i) {
        if (i != 6) {
            return;
        }
        this.c = new ByteArrayOutputStream();
    }

    public static a g(OutputStream outputStream, String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            str.equals("DER");
            throw null;
        }
        if (str.equals("DER")) {
            C0259b c0259b = new C0259b(outputStream);
            int i4 = b;
            int i5 = (i4 & (-108)) | ((~i4) & 107);
            int i6 = (i4 & 107) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 29 / 0;
            }
            return c0259b;
        }
        if (str.equals("DL")) {
            ao aoVar = new ao(outputStream);
            int i9 = b;
            int i10 = ((i9 | 54) << 1) - (i9 ^ 54);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return aoVar;
        }
        a aVar = new a(outputStream);
        int i13 = a;
        int i14 = (i13 & (-56)) | ((~i13) & 55);
        int i15 = -(-((i13 & 55) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        return aVar;
    }

    public static a h() {
        int i = 2 % 2;
        a aVar = new a(6);
        int i2 = b;
        int i3 = (i2 | 67) << 1;
        int i4 = -(((~i2) & 67) | (i2 & (-68)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return aVar;
    }

    public void A(O o2, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 39) + ((i2 & 39) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        o2.i(this, z);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public a i() {
        int i = 2 % 2;
        ao aoVar = new ao((OutputStream) this.c);
        int i2 = b + 45;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return aoVar;
    }

    public byte[] j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 99;
        int i4 = ((i2 & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        byte[] byteArray = ((ByteArrayOutputStream) this.c).toByteArray();
        int i8 = b + 79;
        a = i8 % 128;
        int i9 = i8 % 2;
        return byteArray;
    }

    public a k(h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 102) + (i2 | 102)) - 1;
        b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                ((ByteArrayOutputStream) this.c).write(hVar.getEncoded());
                throw null;
            }
            ((ByteArrayOutputStream) this.c).write(hVar.getEncoded());
            int i4 = b;
            int i5 = ((i4 ^ 122) + ((i4 & 122) << 1)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public a l(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 11) - (~(-(-((i2 & 11) << 1))))) - 1;
        a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                ((ByteArrayOutputStream) this.c).write(bArr);
                return this;
            }
            ((ByteArrayOutputStream) this.c).write(bArr);
            throw null;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public C0259b o() {
        int i = 2 % 2;
        C0259b c0259b = new C0259b((OutputStream) this.c);
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return c0259b;
    }

    public a p(int i) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 61;
        int i6 = ((i4 | 61) & (~i5)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            byteArrayOutputStream = (ByteArrayOutputStream) this.c;
            i2 = ((((i ^ 55) | (i & 55)) << 1) - (~(-((i & (-56)) | ((~i) & 55))))) - 1;
        } else {
            byteArrayOutputStream = (ByteArrayOutputStream) this.c;
            i2 = i >>> 24;
        }
        byteArrayOutputStream.write((byte) i2);
        int i7 = a;
        int i8 = i7 & 41;
        int i9 = ((i7 | 41) & (~i8)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        ((ByteArrayOutputStream) this.c).write((byte) (i >>> 16));
        Object obj = this.c;
        int i11 = b;
        int i12 = ((i11 ^ 85) | (i11 & 85)) << 1;
        int i13 = -(((~i11) & 85) | (i11 & (-86)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        ((ByteArrayOutputStream) obj).write((byte) (i >>> 8));
        ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) this.c;
        int i16 = a;
        int i17 = i16 & 41;
        int i18 = ((i16 ^ 41) | i17) << 1;
        int i19 = -((i16 | 41) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        byteArrayOutputStream2.write((byte) i);
        int i22 = a;
        int i23 = ((i22 & (-30)) | ((~i22) & 29)) + ((i22 & 29) << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
        return this;
    }

    public void r(int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 57) << 1) - (i3 ^ 57);
        b = i4 % 128;
        int i5 = i4 % 2;
        ((OutputStream) this.c).write(i);
        int i6 = b;
        int i7 = i6 & 9;
        int i8 = i6 | 9;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 37 / 0;
        }
    }

    public void t(Enumeration enumeration) {
        int i = 2 % 2;
        while (true) {
            Object obj = null;
            if (!enumeration.hasMoreElements()) {
                int i2 = a + 89;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i3 = a;
            int i4 = i3 & 81;
            int i5 = (i3 ^ 81) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                ((i) enumeration.nextElement()).f();
                obj.hashCode();
                throw null;
            }
            A(((i) enumeration.nextElement()).f(), true);
            int i7 = a + 77;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void u(boolean z, int i, int i2, byte[] bArr) throws IOException {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 124) << 1) - (i4 ^ 124)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            z(z, i, i2);
            w(bArr.length);
            throw null;
        }
        z(z, i, i2);
        w(bArr.length);
        int i6 = a;
        int i7 = (i6 ^ 57) + ((i6 & 57) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int length = bArr.length;
            throw null;
        }
        ((OutputStream) this.c).write(bArr, 0, bArr.length);
        int i8 = (-2) - ((a + 104) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void w(int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 57;
        int i5 = i4 + ((i3 ^ 57) | i4);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0 ? i <= 127 : i <= 34) {
            r((byte) i);
            int i7 = b + 93;
            a = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = (i6 ^ 49) + ((i6 & 49) << 1);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = i10 ^ 43;
            int i13 = ((i10 & 43) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i;
            int i18 = 1;
            while (true) {
                i17 >>>= 8;
                if (i17 == 0) {
                    break;
                }
                int i19 = a;
                int i20 = ((((i19 ^ 33) | (i19 & 33)) << 1) - (~(-(((~i19) & 33) | (i19 & (-34)))))) - 1;
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                int i23 = i18 ^ (-77);
                int i24 = ((i18 & (-77)) | i23) << 1;
                int i25 = -i23;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                i18 = ((i26 ^ 79) + ((i26 & 79) << 1)) - 1;
                int i27 = i21 & 63;
                int i28 = (((i21 | 63) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 4 % 4;
                }
            }
            int i30 = i18 ^ 128;
            int i31 = i18 & 128;
            r((byte) ((i30 & i31) | (i30 ^ i31)));
            int i32 = ((i18 ^ (-1)) | i18) << 1;
            int i33 = -(~i18);
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            int i35 = b;
            int i36 = i35 & 43;
            int i37 = ((i35 | 43) & (~i36)) + (i36 << 1);
            a = i37 % 128;
            int i38 = i37 % 2 == 0 ? i34 * 73 : i34 * 8;
            while (i38 >= 0) {
                int i39 = b;
                int i40 = i39 & 77;
                int i41 = (((i39 ^ 77) | i40) << 1) - ((i39 | 77) & (~i40));
                a = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = i & i38;
                    int i43 = (i ^ i38) | i42;
                    r((byte) ((i42 & i43) + (i42 | i43)));
                    i38 += 96;
                } else {
                    r((byte) (i >> i38));
                    int i44 = (i38 & 20) | ((~i38) & (-21));
                    int i45 = (i38 & (-21)) << 1;
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    int i47 = i46 & 13;
                    i38 = ((~i47) & (i46 | 13)) + (i47 << 1);
                }
                int i48 = a;
                int i49 = i48 & 57;
                int i50 = i49 + ((i48 ^ 57) | i49);
                b = i50 % 128;
                int i51 = i50 % 2;
            }
        }
        int i52 = a;
        int i53 = i52 & 45;
        int i54 = ((i52 ^ 45) | i53) << 1;
        int i55 = -((i52 | 45) & (~i53));
        int i56 = (i54 & i55) + (i55 | i54);
        b = i56 % 128;
        int i57 = i56 % 2;
    }

    public void x(boolean z, int i, i[] iVarArr) throws IOException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 23) + ((i3 & 23) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!z)) {
            ((OutputStream) this.c).write(i);
            int i5 = a;
            int i6 = ((i5 & 72) + (i5 | 72)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        r(128);
        int length = iVarArr.length;
        int i8 = b;
        int i9 = ((i8 ^ 48) + ((i8 & 48) << 1)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < length) {
            int i12 = a;
            int i13 = (i12 & 33) + (i12 | 33);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                A(iVarArr[i11].f(), true);
                i11 = ((i11 & 93) + (i11 | 93)) - 1;
            } else {
                A(iVarArr[i11].f(), true);
                int i14 = i11 - 88;
                int i15 = i14 & 89;
                i11 = (((i14 | 89) & (~i15)) - (~(i15 << 1))) - 1;
            }
        }
        r(0);
        r(0);
        int i16 = b;
        int i17 = i16 & 91;
        int i18 = (i16 ^ 91) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    public void y(i iVar) {
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        A(iVar.f(), true);
        int i4 = b;
        int i5 = ((i4 ^ 98) + ((i4 & 98) << 1)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void z(boolean z, int i, int i2) throws IOException {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (((i5 ^ 27) | (i5 & 27)) << 1) - ((i5 & (-28)) | ((~i5) & 27));
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (!z) {
            int i9 = i5 & 73;
            int i10 = (((~i9) & (i5 | 73)) - (~(i9 << 1))) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i2 < 31) {
            int i11 = (-2) - (((i7 ^ 108) + ((i7 & 108) << 1)) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i & i2;
            r(i13 | ((i | i2) & (~i13)));
            int i14 = b;
            int i15 = (((i14 & (-112)) | ((~i14) & 111)) - (~(-(-((i14 & 111) << 1))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        r((31 & i) | (i ^ 31));
        if (i2 < 128) {
            int i17 = a;
            int i18 = i17 & 125;
            int i19 = ((i17 | 125) & (~i18)) + (i18 << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            ((OutputStream) this.c).write(i2);
            int i21 = b + 75;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        byte[] bArr = new byte[5];
        int i22 = 4;
        bArr[4] = (byte) (i2 & 127);
        int i23 = b;
        int i24 = i23 & 47;
        int i25 = -(-((i23 ^ 47) | i24));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 4 / 2;
        }
        do {
            i2 >>= 7;
            i22--;
            int i28 = a;
            int i29 = i28 ^ 117;
            int i30 = ((i28 & 117) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
            i3 = i32 % 128;
            b = i3;
            int i33 = i32 % 2;
            bArr[i22] = (byte) (((~(i2 & 127)) & 128) | (i2 & 127));
            int i34 = i3 + 60;
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
        } while (i2 > 127);
        int i37 = ((i3 & 89) - (~(i3 | 89))) - 1;
        a = i37 % 128;
        int i38 = i37 % 2;
        OutputStream outputStream = (OutputStream) this.c;
        int i39 = i3 + 45;
        a = i39 % 128;
        int i40 = i39 % 2;
        int i41 = -i22;
        outputStream.write(bArr, i22, (((5 ^ i41) | (5 & i41)) << 1) - ((5 & (~i41)) | (i41 & (-6))));
        int i42 = a + 37;
        b = i42 % 128;
        int i43 = i42 % 2;
    }

    public void s(boolean z, int i, byte b2, byte[] bArr) throws IOException {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 75;
        int i5 = ((i3 ^ 75) | i4) << 1;
        int i6 = -((i3 | 75) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (z) {
            int i10 = (((i8 ^ 13) | (i8 & 13)) << 1) - (((~i8) & 13) | (i8 & (-14)));
            b = i10 % 128;
            if (i10 % 2 != 0) {
                ((OutputStream) this.c).write(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((OutputStream) this.c).write(i);
        }
        int length = bArr.length;
        int i11 = length ^ 1;
        int i12 = (length & 1) << 1;
        w((i11 ^ i12) + ((i12 & i11) << 1));
        Object obj2 = this.c;
        int i13 = b + 13;
        a = i13 % 128;
        int i14 = i13 % 2;
        ((OutputStream) obj2).write(b2);
        int length2 = bArr.length;
        int i15 = a + 76;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        ((OutputStream) (i16 % 2 != 0 ? this.c : this.c)).write(bArr, 0, length2);
        int i17 = a + 111;
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public void v(boolean z, int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-84)) | ((~i3) & 83);
        int i5 = (i3 & 83) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (z) {
            int i9 = ((i7 ^ 69) - (~((i7 & 69) << 1))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            ((OutputStream) this.c).write(i);
            int i11 = b;
            int i12 = (i11 | 45) << 1;
            int i13 = -(((~i11) & 45) | (i11 & (-46)));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        w(bArr.length);
        int length = bArr.length;
        OutputStream outputStream = (OutputStream) this.c;
        int i16 = a;
        int i17 = i16 ^ 97;
        int i18 = (((i16 & 97) | i17) << 1) - i17;
        b = i18 % 128;
        int i19 = i18 % 2;
        outputStream.write(bArr, 0, length);
        int i20 = b;
        int i21 = i20 & 13;
        int i22 = -(-((i20 ^ 13) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    public a(J j, byte[][] bArr) {
        Objects.requireNonNull(j, "params == null");
        if (v.i(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != j.e) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        int i = a + 77;
        int i2 = i % 128;
        b = i2;
        int i3 = i % 2 != 0 ? 1 : 0;
        int i4 = ((i2 ^ 5) - (~(-(-((i2 & 5) << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 % 2;
        } else {
            int i6 = 2 % 2;
        }
        while (i3 < bArr.length) {
            int i7 = b;
            int i8 = i7 & 1;
            int i9 = -(-((i7 ^ 1) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 60 / 0;
                if (bArr[i3].length != j.c) {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
                int i12 = i3 & (-17);
                int i13 = ((i3 | (-17)) & (~i12)) + (i12 << 1);
                i3 = ((i13 & 19) + (i13 | 19)) - 1;
                int i14 = b;
                int i15 = i14 & 101;
                int i16 = (i14 ^ 101) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 2 % 2;
            } else {
                if (bArr[i3].length != j.c) {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
                int i110 = i3 & (-17);
                int i111 = ((i3 | (-17)) & (~i110)) + (i110 << 1);
                i3 = ((i111 & 19) + (i111 | 19)) - 1;
                int i112 = b;
                int i113 = i112 & 101;
                int i114 = (i112 ^ 101) | i113;
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                a = i115 % 128;
                int i116 = i115 % 2;
                int i117 = 2 % 2;
            }
        }
        this.c = v.e(bArr);
        int i20 = a;
        int i21 = i20 & 121;
        int i22 = (i20 | 121) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 25 / 0;
        }
    }

    public int q() {
        byte[] bArr;
        char c;
        byte b2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = -(-((i2 ^ 33) | i3));
        int i5 = i3 ^ i4;
        int i6 = i3 & i4;
        int i7 = 1;
        int i8 = i5 + (i6 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        byte[] bArr2 = new byte[64];
        j jVar = (j) this.c;
        int i10 = ((i2 | 51) << 1) - (i2 ^ 51);
        b = i10 % 128;
        int i11 = 0;
        if (i10 % 2 != 0) {
            bArr = r.t;
            bArr[116] = 0;
            b2 = 26;
            c = '@';
        } else {
            bArr = r.t;
            bArr[6] = 0;
            c = 7;
            b2 = 8;
        }
        bArr[c] = b2;
        int iE = jVar.e(bArr, 64);
        int i12 = b;
        int i13 = (i12 & (-96)) | ((~i12) & 95);
        int i14 = -(-((i12 & 95) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < 64) {
            int i18 = b;
            int i19 = i18 & 49;
            int i20 = (((i18 | 49) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            byte b3 = r.t[i17];
            int i22 = (-2) - ((((i17 | 63) << 1) - (i17 ^ 63)) ^ (-1));
            i17 = (-2) - (((i22 ^ (-60)) + ((i22 & (-60)) << 1)) ^ (-1));
            int i23 = b;
            int i24 = i23 | 43;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 43)) & i24);
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
        }
        if (iE == 64) {
            int i29 = b;
            int i30 = (i29 & 87) + (i29 | 87);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                ((j) this.c).c(bArr2, 21);
            } else {
                ((j) this.c).c(bArr2, 64);
            }
            int i31 = b;
            int i32 = i31 & 109;
            int i33 = (i31 | 109) & (~i32);
            int i34 = i32 << 1;
            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
            a = i35 % 128;
            int i36 = i35 % 2;
            while (i11 < 64) {
                int i37 = b;
                int i38 = ((i37 & 38) + (i37 | 38)) - 1;
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    byte b4 = bArr2[i11];
                    int i39 = i11 + 87;
                    i11 = (i39 ^ (-1)) + (i39 << 1);
                } else {
                    byte b5 = bArr2[i11];
                    int i40 = ((((i11 ^ 89) | (i11 & 89)) << 1) - (~(-(((~i11) & 89) | (i11 & (-90)))))) - 1;
                    int i41 = i40 & (-88);
                    int i42 = ((i40 ^ (-88)) | i41) << 1;
                    int i43 = -((i40 | (-88)) & (~i41));
                    i11 = ((i42 | i43) << 1) - (i42 ^ i43);
                }
                int i44 = (i37 ^ 92) + ((i37 & 92) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                a = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 3 % 4;
                }
            }
            byte b6 = bArr2[8];
            if (b6 == -1) {
                int i47 = a;
                int i48 = ((i47 | 86) << 1) - (i47 ^ 86);
                int i49 = (i48 ^ (-1)) + (i48 << 1);
                b = i49 % 128;
                int i50 = i49 % 2;
                int i51 = i47 & 63;
                int i52 = ((((i47 ^ 63) | i51) << 1) - (~(-((i47 | 63) & (~i51))))) - 1;
                b = i52 % 128;
                int i53 = i52 % 2;
            } else {
                if (b6 == 0) {
                    int i54 = a;
                    int i55 = i54 & 23;
                    int i56 = (i54 ^ 23) | i55;
                    int i57 = (i55 & i56) + (i55 | i56);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    if (bArr2[9] == 90) {
                        int i59 = i54 & 109;
                        int i60 = ((i54 | 109) & (~i59)) + (i59 << 1);
                        int i61 = i60 % 128;
                        b = i61;
                        int i62 = i60 % 2;
                        int i63 = (((i61 ^ 71) | (i61 & 71)) << 1) - (((~i61) & 71) | (i61 & (-72)));
                        a = i63 % 128;
                        int i64 = i63 % 2;
                        return -9;
                    }
                }
                i7 = iE;
            }
        } else {
            i7 = iE;
        }
        int i65 = b + 73;
        a = i65 % 128;
        if (i65 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public /* synthetic */ a(Object obj) {
        this.c = obj;
    }

    public a(Field field) {
        this.c = field;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x012a A[PHI: r3 r13 r18
  0x012a: PHI (r3v38 int) = (r3v26 int), (r3v39 int) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r13v7 byte[]) = (r13v3 byte[]), (r13v8 byte[]) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r18v3 byte[]) = (r18v1 byte[]), (r18v4 byte[]) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0143 A[PHI: r3 r13 r18
  0x0143: PHI (r3v27 int) = (r3v26 int), (r3v39 int) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r13v4 byte[]) = (r13v3 byte[]), (r13v8 byte[]) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r18v2 byte[]) = (r18v1 byte[]), (r18v4 byte[]) binds: [B:27:0x0141, B:23:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    public int m(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = a + 65;
        b = i11 % 128;
        int i12 = i11 % 2;
        j jVar = (j) this.c;
        UsbDeviceConnection usbDeviceConnection = jVar.i;
        int i13 = a;
        int i14 = (i13 & 99) + (i13 | 99);
        b = i14 % 128;
        int i15 = i14 % 2;
        r.f();
        byte[] bArr7 = r.t;
        int i16 = 6;
        bArr7[6] = 0;
        int i17 = a + 79;
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        bArr7[7] = 31;
        bArr7[8] = 1;
        int i20 = (i18 & 31) + (i18 | 31);
        int i21 = i20 % 128;
        a = i21;
        int i22 = i20 % 2;
        bArr7[9] = 0;
        bArr7[10] = 0;
        bArr7[11] = 0;
        int i23 = i21 ^ 89;
        int i24 = (((i21 & 89) | i23) << 1) - i23;
        b = i24 % 128;
        int i25 = i24 % 2;
        int i26 = 0;
        while (true) {
            bArr2 = r.t;
            if (i26 >= bArr2.length) {
                break;
            }
            int i27 = b;
            int i28 = i27 & 87;
            int i29 = -(-((i27 ^ 87) | i28));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                byte b2 = bArr2[i26];
                int i31 = i26 ^ 36;
                i26 = (((i26 & 36) | i31) << 1) - i31;
            } else {
                byte b3 = bArr2[i26];
                i26++;
            }
        }
        jVar.e(bArr2, 64);
        int i32 = 4096;
        byte[] bArr8 = new byte[4096];
        int i33 = b;
        int i34 = i33 & 53;
        int i35 = ((i33 | 53) & (~i34)) + (i34 << 1);
        a = i35 % 128;
        if (i35 % 2 == 0) {
            bArr3 = new byte[92160];
            i = 1;
        } else {
            bArr3 = new byte[92160];
            i = 0;
        }
        int i36 = i;
        while (i36 < 23) {
            int i37 = b;
            int i38 = (((i37 ^ 111) | (i37 & 111)) << 1) - (((~i37) & 111) | (i37 & (-112)));
            a = i38 % 128;
            int i39 = i38 % 2;
            Objects.requireNonNull((j) this.c);
            int i40 = a;
            int i41 = ((i40 ^ 105) | (i40 & 105)) << 1;
            int i42 = -(((~i40) & 105) | (i40 & (-106)));
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            int i44 = i43 % 128;
            b = i44;
            if (i43 % 2 != 0) {
                i2 = 30857;
                i5 = 35;
                i4 = 4880;
                i3 = 32496;
                i6 = 1;
            } else {
                i2 = 129;
                i3 = i32;
                i4 = 8960;
                i5 = i16;
                i6 = 0;
            }
            int i45 = i44 & 17;
            int i46 = i44 | 17;
            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
            a = i47 % 128;
            if (i47 % 2 == 0) {
                bArr4 = bArr3;
                i7 = i36;
                bArr5 = bArr8;
                usbDeviceConnection.controlTransfer(i2, i5, i4, i6, bArr8, i3, 26708);
                if (i7 < 90) {
                    int i48 = b;
                    int i49 = i48 & 17;
                    int i50 = ((i48 ^ 17) | i49) << 1;
                    int i51 = -((i48 | 17) & (~i49));
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    bArr6 = bArr5;
                    i8 = 4096;
                    System.arraycopy(bArr6, 0, bArr4, i7 * 4096, 4096);
                    i9 = b + 111;
                    a = i9 % 128;
                } else {
                    bArr6 = bArr5;
                    i8 = 4096;
                    System.arraycopy(bArr6, 0, bArr4, i7 * 4096, 2048);
                    i9 = b + 109;
                    a = i9 % 128;
                }
            } else {
                i7 = i36;
                bArr4 = bArr3;
                bArr5 = bArr8;
                usbDeviceConnection.controlTransfer(i2, i5, i4, i6, bArr5, i3, 18000);
                if (i7 < 22) {
                    int i410 = b;
                    int i411 = i410 & 17;
                    int i54 = ((i410 ^ 17) | i411) << 1;
                    int i55 = -((i410 | 17) & (~i411));
                    int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    bArr6 = bArr5;
                    i8 = 4096;
                    System.arraycopy(bArr6, 0, bArr4, i7 * 4096, 4096);
                    i9 = b + 111;
                    a = i9 % 128;
                } else {
                    bArr6 = bArr5;
                    i8 = 4096;
                    System.arraycopy(bArr6, 0, bArr4, i7 * 4096, 2048);
                    i9 = b + 109;
                    a = i9 % 128;
                }
            }
            int i58 = i9 % 2;
            int i59 = i7 & 1;
            int i60 = (i7 | 1) & (~i59);
            int i61 = -(-(i59 << 1));
            i36 = (i60 ^ i61) + ((i60 & i61) << 1);
            int i62 = b;
            int i63 = (i62 ^ 21) + ((i62 & 21) << 1);
            a = i63 % 128;
            int i64 = i63 % 2;
            i32 = i8;
            bArr8 = bArr6;
            bArr3 = bArr4;
            i16 = 6;
        }
        byte[] bArr9 = bArr3;
        Objects.requireNonNull((j) this.c);
        int i65 = b;
        int i66 = i65 ^ 125;
        int i67 = (i65 & 125) << 1;
        int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
        a = i68 % 128;
        int i69 = i68 % 2;
        usbDeviceConnection.controlTransfer(129, 6, 9216, 0, bArr8, 64, 18000);
        int i70 = b;
        int i71 = i70 & 105;
        int i72 = (i70 | 105) & (~i71);
        int i73 = -(-(i71 << 1));
        int i74 = (i72 & i73) + (i72 | i73);
        a = i74 % 128;
        if (i74 % 2 == 0) {
            System.arraycopy(bArr9, 1, bArr, 0, 92160);
        } else {
            System.arraycopy(bArr9, 0, bArr, 0, 92160);
        }
        int i75 = b;
        int i76 = (i75 & 29) + (i75 | 29);
        a = i76 % 128;
        int i77 = i76 % 2;
        return 1;
    }

    public int n(byte[] bArr) {
        int i;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[94208];
        int i6 = 4096;
        byte[] bArr4 = new byte[4096];
        byte[] bArr5 = new byte[64];
        int i7 = 0;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        StringBuilder sb = new StringBuilder();
        sb.append("buffer:  ");
        sb.append((int) bArr3[46202]);
        Log.e("fenglei", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("buffer:  ");
        sb2.append((int) bArr3[46203]);
        Log.e("fenglei", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("buffer:  ");
        sb3.append((int) bArr3[46204]);
        Log.e("fenglei", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("buffer:  ");
        sb4.append((int) bArr3[46205]);
        Log.e("fenglei", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("buffer:  ");
        sb5.append((int) bArr3[46206]);
        Log.e("fenglei", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("buffer:  ");
        sb6.append((int) bArr3[46207]);
        Log.e("fenglei", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append("buffer:  ");
        sb7.append((int) bArr3[46208]);
        Log.e("fenglei", sb7.toString());
        int i8 = b;
        int i9 = i8 ^ 63;
        int i10 = (i8 & 63) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        j jVar = (j) this.c;
        r.f();
        byte[] bArr6 = r.t;
        bArr6[6] = 0;
        bArr6[7] = 33;
        int i13 = b;
        int i14 = (((i13 | 120) << 1) - (i13 ^ 120)) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < 64) {
            int i17 = a;
            int i18 = (((i17 ^ 61) | (i17 & 61)) << 1) - (((~i17) & 61) | (i17 & (-62)));
            b = i18 % 128;
            if (i18 % 2 != 0) {
                byte b3 = r.t[i16];
                i16 += 7;
            } else {
                byte b4 = r.t[i16];
                int i19 = (i16 & (-2)) | ((~i16) & 1);
                int i20 = (i16 & 1) << 1;
                i16 = ((i19 | i20) << 1) - (i20 ^ i19);
            }
        }
        jVar.d(r.t, 64);
        int i21 = b;
        int i22 = i21 & 83;
        int i23 = (i21 ^ 83) | i22;
        int i24 = (i22 & i23) + (i22 | i23);
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = i21 & 21;
        int i27 = i21 | 21;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 5 % 2;
        }
        int i30 = 0;
        while (i30 < 23) {
            int i31 = b;
            int i32 = i31 & 49;
            int i33 = i32 + ((i31 ^ 49) | i32);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                i = i30 << 16901;
                i2 = 4657;
            } else {
                i = i30 * 4096;
                i2 = i6;
            }
            System.arraycopy(bArr3, i, bArr4, i7, i2);
            int i34 = b;
            int i35 = ((i34 | 103) << 1) - (i34 ^ 103);
            a = i35 % 128;
            if (i35 % 2 == 0) {
                int i36 = 4 / 3;
            }
            int i37 = i7;
            while (i37 < 64) {
                int i38 = b;
                int i39 = i38 & 29;
                int i40 = (i38 ^ 29) | i39;
                int i41 = (i39 & i40) + (i39 | i40);
                a = i41 % 128;
                int i42 = i41 % 2 == 0 ? 1 : i7;
                int i43 = i38 & 49;
                int i44 = -(-((i38 ^ 49) | i43));
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                while (i42 < 64) {
                    int i47 = b;
                    int i48 = i47 & 113;
                    int i49 = -(-((i47 ^ 113) | i48));
                    int i50 = (i48 & i49) + (i49 | i48);
                    int i51 = i50 % 128;
                    a = i51;
                    if (i50 % 2 == 0) {
                        b2 = bArr4[(i37 / 16) << i42];
                    } else {
                        int i52 = i37 * 64;
                        int i53 = -(-i42);
                        b2 = bArr4[(i52 & i53) + (i53 | i52)];
                    }
                    int i54 = (((i51 & (-106)) | (105 & (~i51))) - (~((i51 & 105) << 1))) - 1;
                    b = i54 % 128;
                    if (i54 % 2 != 0) {
                        bArr5[i42] = b2;
                        int i55 = (i42 | 104) << 1;
                        int i56 = -((i42 & (-105)) | ((~i42) & 104));
                        i3 = i55 ^ i56;
                        i4 = (i55 & i56) << 1;
                    } else {
                        bArr5[i42] = b2;
                        int i57 = i42 & 1;
                        int i58 = (i42 ^ 1) | i57;
                        i3 = i57 & i58;
                        i4 = i57 | i58;
                    }
                    i42 = i3 + i4;
                }
                ((j) this.c).d(bArr5, 64);
                int i59 = a;
                int i60 = i59 & 125;
                int i61 = (i59 ^ 125) | i60;
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                int i63 = i62 % 128;
                b = i63;
                int i64 = i62 % 2;
                int i65 = i37 & 1;
                int i66 = -(-((i37 ^ 1) | i65));
                i37 = (i65 ^ i66) + ((i65 & i66) << 1);
                int i67 = ((i63 & 60) + (i63 | 60)) - 1;
                a = i67 % 128;
                if (i67 % 2 == 0) {
                    int i68 = 4 % 2;
                }
                i7 = 0;
            }
            int i69 = i30 ^ 7;
            int i70 = (((i30 & 7) | i69) << 1) - i69;
            int i71 = i70 & (-6);
            i30 = ((i70 ^ (-6)) | i71) + i71;
            int i72 = a + 21;
            b = i72 % 128;
            int i73 = i72 % 2;
            i6 = 4096;
            i7 = 0;
        }
        j jVar2 = (j) this.c;
        Objects.requireNonNull(jVar2);
        UsbDeviceConnection usbDeviceConnection = jVar2.i;
        int i74 = b;
        int i75 = i74 & 53;
        int i76 = -(-((i74 ^ 53) | i75));
        int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
        a = i77 % 128;
        int i78 = i77 % 2;
        if (usbDeviceConnection.bulkTransfer(jVar2.f, bArr2, 64, 18000) != 64) {
            int i79 = a;
            int i80 = (i79 & 93) + (i79 | 93);
            b = i80 % 128;
            int i81 = i80 % 2;
            return -1;
        }
        int i82 = (-2) - ((b + 110) ^ (-1));
        int i83 = i82 % 128;
        a = i83;
        if (i82 % 2 != 0 ? bArr2[8] != 255 : bArr2[79] != 16096) {
            byte b5 = bArr2[8];
            int i84 = (i83 ^ 85) + ((i83 & 85) << 1);
            b = i84 % 128;
            int i85 = i84 % 2;
            return b5;
        }
        int i86 = i83 + 88;
        int i87 = (i86 ^ (-1)) + (i86 << 1);
        b = i87 % 128;
        int i88 = i87 % 2;
        int i89 = i83 & 37;
        int i90 = -(-((i83 ^ 37) | i89));
        int i91 = ((i89 | i90) << 1) - (i89 ^ i90);
        b = i91 % 128;
        int i92 = i91 % 2;
        return -1;
    }
}
