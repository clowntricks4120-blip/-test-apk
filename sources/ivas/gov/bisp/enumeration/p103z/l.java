package ivas.gov.bisp.enumeration.p103z;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR;
    private static int b = 1;
    private static int c;
    public static final l d = new aYc();
    public final Parcelable e;

    public class aYc extends l {
        public aYc() {
            super((aYc) null);
        }
    }

    static {
        aYd ayd = new aYd();
        int i = c;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        CREATOR = ayd;
        int i5 = i3 + 7;
        c = i5 % 128;
        int i6 = i5 % 2;
    }

    public l(aYc ayc) {
        this.e = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 89;
        int i4 = (((i2 & 89) | i3) << 1) - i3;
        c = i4 % 128;
        int i5 = i4 % 2 != 0 ? 1 : 0;
        int i6 = i2 & 55;
        int i7 = (i2 | 55) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        c = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 113) + (i3 | 113);
        c = i4 % 128;
        int i5 = i4 % 2;
        parcel.writeParcelable(this.e, i);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class aYd implements Parcelable.ClassLoaderCreator<l> {
        private static int a = 1;
        private static int b;

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 61;
            int i4 = -(-(i2 | 61));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.readParcelable(null);
                throw null;
            }
            if (parcel.readParcelable(null) != null) {
                throw new IllegalStateException("superState must be null");
            }
            int i6 = b;
            int i7 = ((i6 | 115) << 1) - (i6 ^ 115);
            a = i7 % 128;
            int i8 = i7 % 2;
            l lVar = l.d;
            int i9 = a;
            int i10 = (i9 & (-20)) | ((~i9) & 19);
            int i11 = -(-((i9 & 19) << 1));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            return lVar;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 9;
            int i5 = ((i3 | 9) & (~i4)) + (i4 << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            l[] lVarArr = new l[i];
            int i8 = ((i6 | 33) << 1) - (i6 ^ 33);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 58 / 0;
            }
            return lVarArr;
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 111;
            int i4 = -(-((i2 ^ 111) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            int i7 = b + 109;
            a = i7 % 128;
            int i8 = i7 % 2;
            l lVar = l.d;
            int i9 = a + 9;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return lVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public l(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == d) {
            int i = c;
            int i2 = i & 77;
            int i3 = ((i ^ 77) | i2) << 1;
            int i4 = -((i | 77) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 ^ 31;
            int i9 = ((((i6 & 31) | i8) << 1) - (~(-i8))) - 1;
            c = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            parcelable = null;
        }
        this.e = parcelable;
        int i12 = c + 121;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public l(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        if (parcelable == null) {
            parcelable = d;
            int i = b;
            int i2 = (i & 103) + (i | 103);
            c = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.e = parcelable;
        int i5 = b;
        int i6 = i5 ^ 79;
        int i7 = (((i5 & 79) | i6) << 1) - i6;
        c = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }
}
