package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p064cj.h;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class S implements h {
    private static int a = 1;
    private static int b;
    public final T c;
    public final byte[] d;
    public final byte[] e;

    public S(T t, byte[] bArr, byte[] bArr2) {
        this.c = t;
        this.d = bArr;
        this.e = bArr2;
    }

    public static S c(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        int i = 2 % 2;
        while (true) {
            Object obj2 = null;
            if (obj instanceof S) {
                int i2 = b + 95;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    return (S) obj;
                }
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof DataInputStream) {
                int i3 = a;
                int i4 = (i3 & 95) + (i3 | 95);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = T.c(((DataInputStream) obj).readInt()).i;
                    obj2.hashCode();
                    throw null;
                }
                DataInputStream dataInputStream2 = (DataInputStream) obj;
                T tC = T.c(dataInputStream2.readInt());
                int i6 = tC.i;
                int i7 = b;
                int i8 = i7 & 65;
                int i9 = (((i7 ^ 65) | i8) << 1) - ((i7 | 65) & (~i8));
                a = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = new byte[i6];
                dataInputStream2.readFully(bArr);
                byte[] bArr2 = new byte[tC.k * tC.i];
                dataInputStream2.readFully(bArr2);
                S s = new S(tC, bArr, bArr2);
                int i11 = b;
                int i12 = i11 & 91;
                int i13 = i12 + ((i11 ^ 91) | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                return s;
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    int i15 = b;
                    int i16 = i15 & 75;
                    int i17 = i16 + ((i15 ^ 75) | i16);
                    a = i17 % 128;
                    try {
                        if (i17 % 2 != 0) {
                            S sC = c(dataInputStream);
                            dataInputStream.close();
                            return sC;
                        }
                        c(dataInputStream);
                        dataInputStream.close();
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            int i18 = a;
                            int i19 = (((i18 & (-96)) | ((~i18) & 95)) - (~(-(-((95 & i18) << 1))))) - 1;
                            b = i19 % 128;
                            if (i19 % 2 != 0) {
                                dataInputStream.close();
                                obj2.hashCode();
                                throw null;
                            }
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof InputStream)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("cannot parse ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                int i20 = a;
                int i21 = (i20 ^ 3) + ((i20 & 3) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                obj = i.q((InputStream) obj);
                int i23 = a;
                int i24 = i23 & 51;
                int i25 = (((i23 | 51) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
                b = i25 % 128;
                int i26 = i25 % 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r9.c != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p077cw.S.equals(java.lang.Object):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = (i2 ^ 109) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            a.h();
            int i6 = this.c.h;
            obj.hashCode();
            throw null;
        }
        a aVarH = a.h();
        aVarH.p(this.c.h);
        byte[] bArr = this.d;
        int i7 = b;
        int i8 = i7 & 97;
        int i9 = (i7 ^ 97) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        aVarH.l(bArr);
        aVarH.l(this.e);
        int i12 = b;
        int i13 = (((i12 | 99) << 1) - (~(-(((~i12) & 99) | (i12 & (-100)))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArrJ = aVarH.j();
        int i15 = a + 39;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return bArrJ;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 124) + ((i2 & 124) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        T t = this.c;
        if (t != null) {
            int i5 = i2 & 123;
            int i6 = ((((i2 ^ 123) | i5) << 1) - (~(-((i2 | 123) & (~i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = t.hashCode();
            int i8 = a;
            int i9 = i8 & 97;
            int i10 = (i9 - (~(-(-((i8 ^ 97) | i9))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i2 + 97;
            a = i12 % 128;
            int i13 = i12 % 2;
            iHashCode = 0;
        }
        int iHashCode2 = Arrays.hashCode(this.d);
        byte[] bArr = this.e;
        int i14 = b;
        int i15 = (((i14 | 122) << 1) - (i14 ^ 122)) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        int iHashCode3 = Arrays.hashCode(bArr);
        int i17 = (iHashCode2 - (~(-(~(-(-(iHashCode * 31))))))) - 2;
        int i18 = b;
        int i19 = i18 | 91;
        int i20 = i19 << 1;
        int i21 = -((~(i18 & 91)) & i19);
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = i22 % 128;
        a = i23;
        int i24 = i22 % 2;
        int i25 = i17 * 31;
        int i26 = ((iHashCode3 | i25) << 1) - ((i25 & (~iHashCode3)) | ((~i25) & iHashCode3));
        int i27 = i23 ^ 35;
        int i28 = ((i23 & 35) | i27) << 1;
        int i29 = -i27;
        int i30 = (i28 & i29) + (i28 | i29);
        b = i30 % 128;
        int i31 = i30 % 2;
        return i26;
    }
}
