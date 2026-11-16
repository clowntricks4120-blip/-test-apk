package ivas.gov.bisp.enumeration.J;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface aE extends IInterface {

    public static abstract class aZP extends Binder implements aE {
        private static int a = 0;
        private static int b = 1;

        public static aE c(IBinder iBinder) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 15;
            int i4 = -(-((i2 ^ 15) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            Object obj = null;
            if (iBinder == null) {
                int i8 = (((i6 | 60) << 1) - (i6 ^ 60)) - 1;
                int i9 = i8 % 128;
                b = i9;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i10 = ((i9 & (-6)) | ((~i9) & 5)) + ((i9 & 5) << 1);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ivas.gov.bisp.enumeration.J.aE");
            if (iInterfaceQueryLocalInterface != null) {
                int i11 = a;
                int i12 = ((i11 ^ 69) | (i11 & 69)) << 1;
                int i13 = -(((~i11) & 69) | (i11 & (-70)));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                if (iInterfaceQueryLocalInterface instanceof aE) {
                    int i17 = (((i15 | 34) << 1) - (i15 ^ 34)) - 1;
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    aE aEVar = (aE) iInterfaceQueryLocalInterface;
                    int i18 = i15 + 49;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    return aEVar;
                }
            }
            aZQ azq = new aZQ(iBinder);
            int i20 = a;
            int i21 = (i20 ^ 115) + ((i20 & 115) << 1);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                return azq;
            }
            throw null;
        }

        public static class aZQ implements aE {
            private static int a = 0;
            private static int b = 1;
            public IBinder c;

            public aZQ(IBinder iBinder) {
                this.c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = (i2 & 71) + (i2 | 71);
                b = i3 % 128;
                int i4 = i3 % 2;
                IBinder iBinder = this.c;
                if (i4 == 0) {
                    int i5 = 57 / 0;
                }
                return iBinder;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Parcel, int] */
            @Override // ivas.gov.bisp.enumeration.J.aE
            public void b(String[] strArr) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = ((i2 & 104) + (i2 | 104)) - 1;
                b = i3 % 128;
                ?? r2 = i3 % 2;
                Object obj = null;
                try {
                    if (r2 == 0) {
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("ivas.gov.bisp.enumeration.J.aE");
                        parcelObtain.writeStringArray(strArr);
                        throw null;
                    }
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("ivas.gov.bisp.enumeration.J.aE");
                    parcelObtain2.writeStringArray(strArr);
                    this.c.transact(1, parcelObtain2, null, 1);
                    int i4 = a;
                    int i5 = (i4 ^ 61) + ((i4 & 61) << 1);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        parcelObtain2.recycle();
                    } else {
                        parcelObtain2.recycle();
                        obj.hashCode();
                        throw null;
                    }
                } catch (Throwable th) {
                    r2.recycle();
                    throw th;
                }
            }
        }
    }

    void b(String[] strArr);
}
