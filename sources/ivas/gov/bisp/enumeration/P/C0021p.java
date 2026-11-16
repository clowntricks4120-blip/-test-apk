package ivas.gov.bisp.enumeration.P;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.P.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0021p extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C0021p> CREATOR = new beG();
    private static int b = 1;
    private static int c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.P.p$beG */
    public static final class beG implements Parcelable.ClassLoaderCreator<C0021p> {
        private static int a = 0;
        private static int b = 1;

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final C0021p createFromParcel(Parcel parcel, ClassLoader classLoader) {
            int i = 2 % 2;
            C0021p c0021p = new C0021p(parcel, classLoader);
            int i2 = a;
            int i3 = (i2 & (-104)) | ((~i2) & 103);
            int i4 = (i2 & 103) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return c0021p;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = a + 91;
            b = i3 % 128;
            C0021p[] c0021pArr = new C0021p[i];
            if (i3 % 2 != 0) {
                return c0021pArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            C0021p c0021p = new C0021p(parcel, null);
            int i2 = a;
            int i3 = (-2) - ((((i2 | 26) << 1) - (i2 ^ 26)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            return c0021p;
        }
    }

    static {
        int i = b;
        int i2 = (i & 51) + (i | 51);
        c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    public C0021p() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 113) + (i2 | 113);
        b = i3 % 128;
        return i3 % 2 == 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size;
        int[] iArr;
        Parcelable parcelableValueAt;
        int i2 = 2 % 2;
        int i3 = b + 33;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            size = size();
            iArr = new int[size];
            int i4 = 70 / 0;
        } else {
            size = size();
            iArr = new int[size];
        }
        int i5 = c;
        int i6 = i5 & 69;
        int i7 = (i5 ^ 69) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        Parcelable[] parcelableArr = new Parcelable[size];
        int i11 = (i9 | 7) << 1;
        int i12 = -(((~i9) & 7) | (i9 & (-8)));
        int i13 = (i11 & i12) + (i12 | i11);
        c = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < size) {
            int i16 = c;
            int i17 = ((i16 & (-32)) | ((~i16) & 31)) + ((i16 & 31) << 1);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                iArr[i15] = keyAt(i15);
                parcelableValueAt = valueAt(i15);
                int i18 = 85 / 0;
            } else {
                iArr[i15] = keyAt(i15);
                parcelableValueAt = valueAt(i15);
            }
            int i19 = c;
            int i20 = i19 + 107;
            b = i20 % 128;
            int i21 = i20 % 2;
            parcelableArr[i15] = parcelableValueAt;
            i15 = ((i15 & 1) << 1) + (i15 ^ 1);
            int i22 = (i19 ^ 105) + ((i19 & 105) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        int i24 = b;
        int i25 = i24 & 5;
        int i26 = (i25 - (~(-(-((i24 ^ 5) | i25))))) - 1;
        c = i26 % 128;
        if (i26 % 2 == 0) {
            parcel.writeParcelableArray(parcelableArr, i);
            return;
        }
        parcel.writeParcelableArray(parcelableArr, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0021p(Parcel parcel, ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = b;
            int i5 = i4 ^ 17;
            int i6 = ((i4 & 17) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            c = i8 % 128;
            if (i8 % 2 != 0) {
                put(iArr[i3], parcelableArray[i3]);
                i3 = ((i3 ^ 60) - (~((i3 & 60) << 1))) - 1;
            } else {
                put(iArr[i3], parcelableArray[i3]);
                i3++;
            }
            int i9 = b;
            int i10 = ((((i9 ^ 81) | (i9 & 81)) << 1) - (~(-(((~i9) & 81) | (i9 & (-82)))))) - 1;
            c = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = (-2) - ((b + 74) ^ (-1));
        c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 21 / 0;
        }
    }
}
