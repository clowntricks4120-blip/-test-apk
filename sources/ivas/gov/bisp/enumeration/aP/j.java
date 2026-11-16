package ivas.gov.bisp.enumeration.aP;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p103z.l;

/* JADX INFO: loaded from: classes.dex */
public class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new bfF();
    private static int b = 1;
    private static int c;
    public final OooOOOO<String, Bundle> f;

    public static final class bfF implements Parcelable.ClassLoaderCreator<j> {
        private static int a = 1;
        private static int b;

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
            int i = 2 % 2;
            j jVar = new j(parcel, classLoader, null);
            int i2 = b;
            int i3 = ((i2 ^ 96) + ((i2 & 96) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            return jVar;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 83) | (i3 & 83)) << 1;
            int i5 = -((i3 & (-84)) | ((~i3) & 83));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            j[] jVarArr = new j[i];
            int i8 = i3 & 121;
            int i9 = (i3 ^ 121) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return jVarArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            j jVar = new j(parcel, null, null);
            int i2 = a;
            int i3 = (i2 & 113) + (i2 | 113);
            b = i3 % 128;
            int i4 = i3 % 2;
            return jVar;
        }
    }

    static {
        int i = b;
        int i2 = i & 81;
        int i3 = i2 + ((i ^ 81) | i2);
        c = i3 % 128;
        int i4 = i3 % 2;
    }

    public j(Parcelable parcelable) {
        super(parcelable);
        this.f = new t();
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = (i2 | 19) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        c = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("ExtendableSavedState{");
        sbW.append(Integer.toHexString(System.identityHashCode(this)));
        int i8 = b;
        int i9 = ((i8 ^ 44) + ((i8 & 44) << 1)) - 1;
        c = i9 % 128;
        int i10 = i9 % 2;
        sbW.append(" states=");
        sbW.append(this.f);
        int i11 = b;
        int i12 = (i11 ^ 19) + ((i11 & 19) << 1);
        c = i12 % 128;
        int i13 = i12 % 2;
        Object obj = null;
        sbW.append("}");
        if (i13 != 0) {
            sbW.toString();
            throw null;
        }
        String string = sbW.toString();
        int i14 = c;
        int i15 = i14 & 77;
        int i16 = (((i14 | 77) & (~i15)) - (~(i15 << 1))) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public j(Parcel parcel, ClassLoader classLoader, bfF bff) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f = new t(i);
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = c + 27;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                this.f.put(strArr[i3], bundleArr[i3]);
                throw null;
            }
            this.f.put(strArr[i3], bundleArr[i3]);
            int i5 = c;
            int i6 = (i5 ^ 25) + ((i5 & 25) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                i3 += 54;
            } else {
                int i7 = i3 & 19;
                int i8 = -(-(i3 | 19));
                int i9 = (i7 & i8) + (i8 | i7);
                int i10 = i9 & (-18);
                int i11 = (~i10) & (i9 | (-18));
                int i12 = -(-(i10 << 1));
                i3 = ((i11 | i12) << 1) - (i12 ^ i11);
            }
        }
        int i13 = b + 115;
        c = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = c;
        int i6 = (((i5 | 102) << 1) - (i5 ^ 102)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        parcel.writeParcelable(this.e, i);
        int i8 = this.f.i;
        int i9 = c;
        int i10 = i9 & 67;
        int i11 = i9 | 67;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            parcel.writeInt(i8);
            String[] strArr = new String[i8];
            Bundle[] bundleArr = new Bundle[i8];
            throw null;
        }
        parcel.writeInt(i8);
        String[] strArr2 = new String[i8];
        Bundle[] bundleArr2 = new Bundle[i8];
        int i13 = b;
        int i14 = i13 & 87;
        int i15 = -(-((i13 ^ 87) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        c = i16 % 128;
        int i17 = i16 % 2 != 0 ? 1 : 0;
        while (i17 < i8) {
            int i18 = c;
            int i19 = (((i18 | 26) << 1) - (i18 ^ 26)) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            strArr2[i17] = (String) this.f.k(i17);
            int i21 = b;
            int i22 = i21 & 109;
            int i23 = i22 + ((i21 ^ 109) | i22);
            c = i23 % 128;
            if (i23 % 2 != 0) {
                bundleArr2[i17] = (Bundle) this.f.n(i17);
                i2 = i17 & 45;
                i3 = i17 ^ 45;
            } else {
                bundleArr2[i17] = (Bundle) this.f.n(i17);
                i2 = i17 & 1;
                i3 = i17 ^ 1;
            }
            i17 = i2 + (i3 | i2);
            int i24 = c;
            int i25 = i24 ^ 93;
            int i26 = ((i24 & 93) | i25) << 1;
            int i27 = -i25;
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        parcel.writeStringArray(strArr2);
        parcel.writeTypedArray(bundleArr2, 0);
        int i30 = b;
        int i31 = i30 ^ 17;
        int i32 = ((i30 & 17) | i31) << 1;
        int i33 = -i31;
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        c = i34 % 128;
        int i35 = i34 % 2;
    }
}
