package ivas.gov.bisp.enumeration.C;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p001aa.r;
import java.lang.reflect.Method;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c extends j {
    private static int a = 1;
    private static int b;
    public int f;
    public final SparseIntArray g;
    public final int h;
    public final Parcel i;
    public final int j;
    public final String k;
    public int l;
    public int m;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new r(), new r(), new r());
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public boolean c(int i) {
        int i2;
        int i3 = 2 % 2;
        while (true) {
            int i4 = this.l;
            int i5 = this.j;
            int i6 = b;
            int i7 = (i6 & (-106)) | ((~i6) & 105);
            int i8 = -(-((i6 & 105) << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean z = false;
            if (i4 >= i5) {
                if (this.m != i) {
                    int i11 = i6 + 55;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    z = true;
                }
                int i13 = a;
                int i14 = ((i13 & (-90)) | ((~i13) & 89)) + ((i13 & 89) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                return z;
            }
            int i16 = ((((i6 ^ 63) | (i6 & 63)) << 1) - (~(-((i6 & (-64)) | ((~i6) & 63))))) - 1;
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            int i19 = this.m;
            if (i19 == i) {
                int i20 = (i17 & 66) + (i17 | 66);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                return true;
            }
            if (String.valueOf(i19).compareTo(String.valueOf(i)) > 0) {
                int i23 = b;
                int i24 = i23 & 33;
                int i25 = (i23 ^ 33) | i24;
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                int i27 = i26 % 128;
                a = i27;
                boolean z2 = i26 % 2 == 0;
                int i28 = i27 + 13;
                b = i28 % 128;
                int i29 = i28 % 2;
                return z2;
            }
            this.i.setDataPosition(this.l);
            Parcel parcel = this.i;
            int i30 = b;
            int i31 = ((i30 ^ 40) + ((i30 & 40) << 1)) - 1;
            a = i31 % 128;
            if (i31 % 2 == 0) {
                i2 = parcel.readInt();
                this.m = this.i.readInt();
                int i32 = 71 / 0;
            } else {
                i2 = parcel.readInt();
                this.m = this.i.readInt();
            }
            int i33 = this.l;
            int i34 = -(~i2);
            this.l = (-2) - (((i33 & i34) + (i34 | i33)) ^ (-1));
            int i35 = a + 101;
            b = i35 % 128;
            int i36 = i35 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public j e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = ((i2 | 93) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        Parcel parcel = this.i;
        int iDataPosition = parcel.dataPosition();
        int i6 = this.l;
        int i7 = b;
        int i8 = (i7 & (-126)) | ((~i7) & 125);
        int i9 = -(-((i7 & 125) << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i6 == this.h) {
            int i11 = (i7 ^ 93) + ((i7 & 93) << 1);
            int i12 = i11 % 128;
            a = i12;
            int i13 = i11 % 2;
            i6 = this.j;
            int i14 = i12 & 41;
            int i15 = ((((i12 ^ 41) | i14) << 1) - (~(-((i12 | 41) & (~i14))))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        c cVar = new c(parcel, iDataPosition, i6, ivas.gov.bisp.enumeration.p091n.j.u(new StringBuilder(), this.k, "  "), this.c, this.d, this.e);
        int i17 = b;
        int i18 = (i17 ^ 85) + ((i17 & 85) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return cVar;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public boolean h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 47) + (i2 | 47);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (this.i.readInt() != 0) {
            int i5 = a;
            int i6 = (i5 & 82) + (i5 | 82);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
        } else {
            int i8 = b;
            int i9 = i8 & 81;
            int i10 = -(-((i8 ^ 81) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 & 87;
        int i15 = (i13 | 87) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public byte[] j() {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.i.readInt();
        if (i4 >= 0) {
            byte[] bArr = new byte[i4];
            this.i.readByteArray(bArr);
            int i5 = a;
            int i6 = (i5 & (-116)) | ((~i5) & 115);
            int i7 = (i5 & 115) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return bArr;
        }
        int i10 = b;
        int i11 = i10 & 55;
        int i12 = ((((i10 ^ 55) | i11) << 1) - (~(-((~i11) & (i10 | 55))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 ^ 79;
        int i15 = (i10 & 79) << 1;
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public CharSequence k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 57) + (i2 | 57);
        b = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.i);
        int i5 = b + 123;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return charSequence;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public int l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = -(-((i2 ^ 25) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Parcel parcel = this.i;
        if (i6 != 0) {
            return parcel.readInt();
        }
        parcel.readInt();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public <T extends Parcelable> T n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
        a = i3 % 128;
        int i4 = i3 % 2;
        T t = (T) this.i.readParcelable(c.class.getClassLoader());
        int i5 = b;
        int i6 = i5 & 11;
        int i7 = ((i5 | 11) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return t;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public String o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-50)) | ((~i2) & 49);
        int i4 = -(-((i2 & 49) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.i.readString();
            obj.hashCode();
            throw null;
        }
        String string = this.i.readString();
        int i6 = b;
        int i7 = (i6 | 35) << 1;
        int i8 = -(((~i6) & 35) | (i6 & (-36)));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void t(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = (i2 & 33) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.i.writeInt(z ? 1 : 0);
        int i7 = b;
        int i8 = ((i7 | 109) << 1) - (i7 ^ 109);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void u(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        TextUtils.writeToParcel(charSequence, this.i, 0);
        int i5 = b + 7;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void v(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 82) + (i2 | 82)) - 1;
        a = i3 % 128;
        this.i.writeParcelable(parcelable, i3 % 2 != 0 ? 0 : 1);
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void w(int i) {
        int i2 = 2 % 2;
        int i3 = b + 23;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.i.writeInt(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.i.writeInt(i);
        int i4 = b + 83;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void x(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 114) + (i2 | 114)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.i.writeString(str);
        int i5 = a;
        int i6 = i5 & 43;
        int i7 = (i5 ^ 43) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public c(Parcel parcel, int i, int i2, String str, OooO0o<String, Method> oooO0o, OooO0o<String, Method> oooO0o2, OooO0o<String, Class> oooO0o3) {
        super(oooO0o, oooO0o2, oooO0o3);
        this.g = new SparseIntArray();
        this.f = -1;
        this.m = -1;
        this.i = parcel;
        this.h = i;
        this.j = i2;
        this.l = i;
        this.k = str;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void s(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (bArr == null) {
            this.i.writeInt(-1);
            int i5 = b;
            int i6 = ((i5 & (-40)) | ((~i5) & 39)) + ((i5 & 39) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = ((i2 | 42) << 1) - (i2 ^ 42);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        this.i.writeInt(bArr.length);
        Parcel parcel = this.i;
        int i10 = b;
        int i11 = (i10 ^ 5) + ((i10 & 5) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        parcel.writeByteArray(bArr);
        if (i12 == 0) {
            obj.hashCode();
            throw null;
        }
        int i13 = b;
        int i14 = i13 & 25;
        int i15 = i14 + ((i13 ^ 25) | i14);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 36 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 55) + (i2 | 55);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.f;
        if (i6 >= 0) {
            int i7 = i4 & 111;
            int i8 = i4 | 111;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                this.g.get(i6);
                this.i.dataPosition();
                throw null;
            }
            int i10 = this.g.get(i6);
            int iDataPosition = this.i.dataPosition();
            int i11 = a;
            int i12 = i11 & 85;
            int i13 = ((i11 ^ 85) | i12) << 1;
            int i14 = -((i11 | 85) & (~i12));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                this.i.setDataPosition(i10);
                throw null;
            }
            this.i.setDataPosition(i10);
            Parcel parcel = this.i;
            int i16 = b + 29;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                parcel.writeInt(iDataPosition >> i10);
            } else {
                int i17 = -i10;
                int i18 = iDataPosition & i17;
                parcel.writeInt((((iDataPosition ^ i17) | i18) << 1) - ((i17 | iDataPosition) & (~i18)));
            }
            this.i.setDataPosition(iDataPosition);
        }
        int i19 = b;
        int i20 = i19 & 39;
        int i21 = i20 + ((i19 ^ 39) | i20);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.C.j
    public void r(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 29) + (i3 | 29);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            d();
            this.f = i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d();
        this.f = i;
        this.g.put(i, this.i.dataPosition());
        Parcel parcel = this.i;
        int i5 = b;
        int i6 = (i5 & (-48)) | ((~i5) & 47);
        int i7 = -(-((i5 & 47) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        this.i.writeInt(i);
        int i9 = a;
        int i10 = i9 & 55;
        int i11 = i10 + ((i9 ^ 55) | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
