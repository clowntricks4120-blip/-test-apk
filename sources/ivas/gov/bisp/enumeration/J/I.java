package ivas.gov.bisp.enumeration.J;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends Binder implements IInterface {
    private static int a = 0;
    private static int b = 1;

    public I() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 1) + (i2 | 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 33;
        int i6 = ((i2 ^ 33) | i5) << 1;
        int i7 = -((i2 | 33) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String string;
        MultiInstanceInvalidationService.OooO0O0 oooO0O0;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 55;
        int i6 = (i4 | 55) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        int i9 = i8 % 128;
        a = i9;
        Object obj = null;
        if (i8 % 2 == 0 ? i == 1 : i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            aE aEVarC = aE.aZP.c(parcel.readStrongBinder());
            int i10 = a;
            int i11 = i10 ^ 59;
            int i12 = ((i10 & 59) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 & i13) + (i12 | i13);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                string = parcel.readString();
                oooO0O0 = (MultiInstanceInvalidationService.OooO0O0) this;
                int i15 = 83 / 0;
            } else {
                string = parcel.readString();
                oooO0O0 = (MultiInstanceInvalidationService.OooO0O0) this;
            }
            int iC = oooO0O0.c(aEVarC, string);
            parcel2.writeNoException();
            parcel2.writeInt(iC);
            int i16 = b;
            int i17 = (i16 ^ 77) + ((i16 & 77) << 1);
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            int i20 = i18 | 57;
            int i21 = i20 << 1;
            int i22 = -((~(i18 & 57)) & i20);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            aE aEVarC2 = aE.aZP.c(parcel.readStrongBinder());
            int i24 = b;
            int i25 = i24 ^ 95;
            int i26 = (i24 & 95) << 1;
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = parcel.readInt();
            MultiInstanceInvalidationService.OooO0O0 oooO0O1 = (MultiInstanceInvalidationService.OooO0O0) this;
            int i30 = b;
            int i31 = ((i30 & 39) - (~(-(-(i30 | 39))))) - 1;
            a = i31 % 128;
            if (i31 % 2 != 0) {
                oooO0O1.d(aEVarC2, i29);
                parcel2.writeNoException();
                return false;
            }
            oooO0O1.d(aEVarC2, i29);
            parcel2.writeNoException();
            return true;
        }
        int i32 = i9 & 81;
        int i33 = i32 + ((i9 ^ 81) | i32);
        b = i33 % 128;
        if (i33 % 2 != 0 ? i == 3 : i == 5) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int i34 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            int i35 = a;
            int i36 = ((i35 ^ 63) | (i35 & 63)) << 1;
            int i37 = -(((~i35) & 63) | (i35 & (-64)));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            b = i38 % 128;
            if (i38 % 2 == 0) {
                ((MultiInstanceInvalidationService.OooO0O0) this).b(i34, strArrCreateStringArray);
                return false;
            }
            ((MultiInstanceInvalidationService.OooO0O0) this).b(i34, strArrCreateStringArray);
            return true;
        }
        int i39 = i9 & 73;
        int i40 = (i9 ^ 73) | i39;
        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
        b = i41 % 128;
        int i42 = i41 % 2;
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            int i43 = a;
            int i44 = i43 & 35;
            int i45 = ((i43 ^ 35) | i44) << 1;
            int i46 = -((i43 | 35) & (~i44));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            b = i47 % 128;
            int i48 = i47 % 2;
            return true;
        }
        int i49 = (i9 ^ 15) + ((i9 & 15) << 1);
        b = i49 % 128;
        if (i49 % 2 == 0) {
            super.onTransact(i, parcel, parcel2, i2);
            obj.hashCode();
            throw null;
        }
        boolean zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        int i50 = b;
        int i51 = i50 ^ 69;
        int i52 = ((i50 & 69) | i51) << 1;
        int i53 = -i51;
        int i54 = (i52 & i53) + (i52 | i53);
        a = i54 % 128;
        int i55 = i54 % 2;
        return zOnTransact;
    }
}
