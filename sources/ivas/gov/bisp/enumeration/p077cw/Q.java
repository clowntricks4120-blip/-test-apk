package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class Q extends L {
    private static int a = 1;
    private static int b;
    public final v R;
    public final int S;

    public Q(int i, v vVar) {
        super(false);
        this.S = i;
        this.R = vVar;
    }

    public static Q c(Object obj) throws Throwable {
        int i = 2 % 2;
        while (!(obj instanceof Q)) {
            DataInputStream dataInputStream = null;
            if (obj instanceof DataInputStream) {
                Q q = new Q(((DataInputStream) obj).readInt(), v.c(obj));
                int i2 = a;
                int i3 = i2 & 11;
                int i4 = ((i2 ^ 11) | i3) << 1;
                int i5 = -((i2 | 11) & (~i3));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    return q;
                }
                dataInputStream.hashCode();
                throw null;
            }
            if (obj instanceof byte[]) {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    int i7 = a;
                    int i8 = i7 & 65;
                    int i9 = -(-((i7 ^ 65) | i8));
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    b = i10 % 128;
                    try {
                        if (i10 % 2 == 0) {
                            Q qC = c(dataInputStream2);
                            dataInputStream2.close();
                            return qC;
                        }
                        c(dataInputStream2);
                        dataInputStream2.close();
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            int i11 = b;
                            int i12 = i11 & 71;
                            int i13 = ((i11 ^ 71) | i12) << 1;
                            int i14 = -((i11 | 71) & (~i12));
                            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                            a = i15 % 128;
                            int i16 = i15 % 2;
                            dataInputStream.close();
                            if (i16 == 0) {
                                int i17 = 98 / 0;
                            }
                            int i18 = a;
                            int i19 = (i18 & 115) + (i18 | 115);
                            b = i19 % 128;
                            int i20 = i19 % 2;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (!(obj instanceof InputStream)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("cannot parse ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                int i21 = a;
                int i22 = (i21 | 29) << 1;
                int i23 = -(((~i21) & 29) | (i21 & (-30)));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                obj = i.q((InputStream) obj);
                int i26 = b;
                int i27 = i26 & 115;
                int i28 = ((((i26 ^ 115) | i27) << 1) - (~(-((i26 | 115) & (~i27))))) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        int i30 = b;
        int i31 = ((i30 & (-64)) | ((~i30) & 63)) + ((i30 & 63) << 1);
        int i32 = i31 % 128;
        a = i32;
        int i33 = i31 % 2;
        Q q2 = (Q) obj;
        int i34 = i32 & 67;
        int i35 = (i32 | 67) & (~i34);
        int i36 = -(-(i34 << 1));
        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
        b = i37 % 128;
        int i38 = i37 % 2;
        return q2;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = (i3 - (~(-(-((i2 ^ 11) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i6 = i2 & 121;
            int i7 = ((i2 ^ 121) | i6) << 1;
            int i8 = -((~i6) & (i2 | 121));
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i2 & 123;
            int i12 = i11 + ((i2 ^ 123) | i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            int i13 = (i2 & 89) + (i2 | 89);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (Q.class == obj.getClass()) {
                int i15 = a;
                int i16 = (i15 & 3) + (i15 | 3);
                b = i16 % 128;
                Q q = (Q) obj;
                if (i16 % 2 != 0) {
                    int i17 = q.S;
                    throw null;
                }
                if (this.S != q.S) {
                    int i18 = (i15 & 117) + (i15 | 117);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    return false;
                }
                boolean zEquals = this.R.equals(q.R);
                int i20 = b;
                int i21 = (i20 | 73) << 1;
                int i22 = -(i20 ^ 73);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                return zEquals;
            }
        }
        int i25 = b;
        int i26 = i25 & 35;
        int i27 = (i25 ^ 35) | i26;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        int i29 = i28 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p077cw.L, ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            a.h().p(this.S);
            throw null;
        }
        a aVarH = a.h();
        aVarH.p(this.S);
        aVarH.l(this.R.getEncoded());
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = -(-((i3 ^ 3) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            aVarH.j();
            throw null;
        }
        byte[] bArrJ = aVarH.j();
        int i7 = b;
        int i8 = i7 & 7;
        int i9 = (i7 | 7) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return bArrJ;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b + 115;
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.S;
        int iHashCode = this.R.hashCode();
        int i5 = b;
        int i6 = i5 & 83;
        int i7 = (~i6) & (i5 | 83);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = -(-(i4 * 31));
        int i12 = iHashCode & i11;
        int i13 = (i12 - (~((i11 ^ iHashCode) | i12))) - 1;
        int i14 = (-2) - ((((i5 | 24) << 1) - (i5 ^ 24)) ^ (-1));
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 84 / 0;
        }
        return i13;
    }
}
