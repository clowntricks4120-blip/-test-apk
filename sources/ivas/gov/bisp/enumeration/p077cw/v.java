package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class v extends L {
    private static int a = 1;
    private static int b;
    public final byte[] R;
    public final T S;
    public final am T;
    public final byte[] U;

    public v(am amVar, T t, byte[] bArr, byte[] bArr2) {
        super(false);
        this.T = amVar;
        this.S = t;
        this.U = j.c(bArr2);
        this.R = j.c(bArr);
    }

    public static v c(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        int i = 2 % 2;
        while (true) {
            Object obj2 = null;
            if (obj instanceof v) {
                int i2 = b;
                int i3 = i2 & 71;
                int i4 = (i3 - (~(-(-((i2 ^ 71) | i3))))) - 1;
                int i5 = i4 % 128;
                a = i5;
                v vVar = (v) obj;
                if (i4 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i6 = i5 ^ 101;
                int i7 = (((i5 & 101) | i6) << 1) - i6;
                b = i7 % 128;
                int i8 = i7 % 2;
                return vVar;
            }
            if (obj instanceof DataInputStream) {
                int i9 = a;
                int i10 = (i9 & 49) + (i9 | 49);
                b = i10 % 128;
                int i11 = i10 % 2;
                DataInputStream dataInputStream2 = (DataInputStream) obj;
                am amVarC = am.c(dataInputStream2.readInt());
                int i12 = dataInputStream2.readInt();
                int i13 = b + 89;
                a = i13 % 128;
                int i14 = i13 % 2;
                T tC = T.c(i12);
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                byte[] bArr2 = new byte[amVarC.j];
                dataInputStream2.readFully(bArr2);
                v vVar2 = new v(amVarC, tC, bArr2, bArr);
                int i15 = a;
                int i16 = i15 & 101;
                int i17 = (i15 ^ 101) | i16;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                return vVar2;
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    int i20 = b;
                    int i21 = (i20 & 17) + (i20 | 17);
                    a = i21 % 128;
                    try {
                        if (i21 % 2 == 0) {
                            c(dataInputStream);
                            dataInputStream.close();
                            throw null;
                        }
                        v vVarC = c(dataInputStream);
                        dataInputStream.close();
                        int i22 = a;
                        int i23 = (i22 & 6) + (i22 | 6);
                        int i24 = (i23 ^ (-1)) + (i23 << 1);
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            return vVarC;
                        }
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            int i25 = b;
                            int i26 = (i25 & 23) + (i25 | 23);
                            a = i26 % 128;
                            int i27 = i26 % 2;
                            dataInputStream.close();
                            if (i27 == 0) {
                                throw null;
                            }
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
                int i28 = a;
                int i29 = i28 | 67;
                int i30 = ((i29 << 1) - (~(-((~(i28 & 67)) & i29)))) - 1;
                b = i30 % 128;
                int i31 = i30 % 2;
                obj = i.q((InputStream) obj);
                int i32 = b;
                int i33 = ((i32 ^ 106) + ((i32 & 106) << 1)) - 1;
                a = i33 % 128;
                int i34 = i33 % 2;
            }
        }
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 41) + (i2 | 41);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i5 = i2 ^ 5;
            int i6 = ((i2 & 5) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = i9 & 13;
            int i12 = (i9 | 13) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj != null) {
            int i15 = i2 & 11;
            int i16 = (i15 - (~((i2 ^ 11) | i15))) - 1;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                obj.getClass();
                obj2.hashCode();
                throw null;
            }
            if (v.class == obj.getClass()) {
                int i17 = a;
                int i18 = i17 & 43;
                int i19 = -(-((i17 ^ 43) | i18));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    this.T.equals(((v) obj).T);
                    throw null;
                }
                v vVar = (v) obj;
                if (!this.T.equals(vVar.T)) {
                    int i21 = b;
                    int i22 = ((i21 | 97) << 1) - ((i21 & (-98)) | ((~i21) & 97));
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = (((i21 | 110) << 1) - (i21 ^ 110)) - 1;
                    a = i24 % 128;
                    if (i24 % 2 != 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (!this.S.equals(vVar.S)) {
                    int i25 = b;
                    int i26 = i25 & 83;
                    int i27 = -(-((i25 ^ 83) | i26));
                    int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i25 & 31;
                    int i31 = (((i25 ^ 31) | i30) << 1) - ((i25 | 31) & (~i30));
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    return false;
                }
                byte[] bArr = this.U;
                byte[] bArr2 = vVar.U;
                int i33 = a;
                int i34 = i33 & 39;
                int i35 = ((i33 | 39) & (~i34)) + (i34 << 1);
                b = i35 % 128;
                int i36 = i35 % 2;
                if (Arrays.equals(bArr, bArr2)) {
                    boolean zEquals = Arrays.equals(this.R, vVar.R);
                    int i37 = b;
                    int i38 = (((i37 ^ 121) | (i37 & 121)) << 1) - (((~i37) & 121) | (i37 & (-122)));
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    return zEquals;
                }
                int i40 = a + 125;
                int i41 = i40 % 128;
                b = i41;
                int i42 = i40 % 2;
                int i43 = i41 & 85;
                int i44 = (((i41 ^ 85) | i43) << 1) - ((i41 | 85) & (~i43));
                a = i44 % 128;
                if (i44 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        int i45 = b;
        int i46 = (i45 ^ 110) + ((i45 & 110) << 1);
        int i47 = (i46 ^ (-1)) + (i46 << 1);
        a = i47 % 128;
        int i48 = i47 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.T.hashCode();
        int iHashCode2 = this.S.hashCode();
        int i4 = b;
        int i5 = (((i4 ^ 113) | (i4 & 113)) << 1) - (((~i4) & 113) | (i4 & (-114)));
        a = i5 % 128;
        int i6 = i5 % 2;
        int iH = j.h(this.U);
        byte[] bArr = this.R;
        int i7 = a;
        int i8 = ((i7 & (-14)) | ((~i7) & 13)) + ((i7 & 13) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iH2 = j.h(bArr);
        int i10 = (iHashCode2 + (iHashCode * 31)) * 31;
        int i11 = a;
        int i12 = i11 ^ 83;
        int i13 = ((i11 & 83) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        int i18 = -(~(((-2) - ((iH - (~i10)) ^ (-1))) * 31));
        int i19 = ((iH2 ^ i18) + ((i18 & iH2) << 1)) - 1;
        int i20 = (((i16 | 8) << 1) - (i16 ^ 8)) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        return i19;
    }

    @Override // ivas.gov.bisp.enumeration.p077cw.L, ivas.gov.bisp.enumeration.p064cj.h
    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = b + 18;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        a aVarH = a.h();
        aVarH.p(this.T.i);
        int i5 = b + 15;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            aVarH.p(this.S.h);
            int i6 = 4 / 0;
        } else {
            aVarH.p(this.S.h);
        }
        int i7 = a;
        int i8 = ((i7 | 85) << 1) - (i7 ^ 85);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            aVarH.l(this.U);
            aVarH.l(this.R);
            throw null;
        }
        aVarH.l(this.U);
        aVarH.l(this.R);
        byte[] bArrJ = aVarH.j();
        int i9 = b + 33;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 85 / 0;
        }
        return bArrJ;
    }
}
