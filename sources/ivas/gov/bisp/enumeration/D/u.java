package ivas.gov.bisp.enumeration.D;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends Binder implements IInterface {
    private static int a = 0;
    private static int b = 1;

    public u() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = 2 % 2;
        int i2 = b + 85;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & 92) + (i4 | 92)) - 1;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0 ? i != 1 : i != 0) {
            if (i == 1598968902) {
                parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                int i7 = b;
                int i8 = (((i7 | 122) << 1) - (i7 ^ 122)) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
            int i10 = ((i6 | 71) << 1) - (i6 ^ 71);
            b = i10 % 128;
            int i11 = i10 % 2;
            boolean zOnTransact = super.onTransact(i, parcel, parcel2, i2);
            int i12 = a + 93;
            b = i12 % 128;
            int i13 = i12 % 2;
            return zOnTransact;
        }
        parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        IBinder strongBinder = parcel.readStrongBinder();
        int i14 = b;
        int i15 = (i14 & 67) + (i14 | 67);
        int i16 = i15 % 128;
        a = i16;
        Object p = null;
        if (i15 % 2 != 0) {
            throw null;
        }
        if (strongBinder == null) {
            int i17 = i16 + 61;
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("ivas.gov.bisp.enumeration.D.t");
            if (iInterfaceQueryLocalInterface != null) {
                int i19 = a;
                int i20 = i19 & 71;
                int i21 = ((i19 ^ 71) | i20) << 1;
                int i22 = -((i19 | 71) & (~i20));
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = i23 % 128;
                b = i24;
                boolean z = iInterfaceQueryLocalInterface instanceof t;
                if (i23 % 2 == 0) {
                    int i25 = 58 / 0;
                    if (!z) {
                        p = new P(strongBinder);
                        int i26 = b;
                        int i27 = i26 & 31;
                        int i28 = ((i26 ^ 31) | i27) << 1;
                        int i29 = -((i26 | 31) & (~i27));
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        p = (t) iInterfaceQueryLocalInterface;
                        int i32 = i24 + 109;
                        a = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else if (z) {
                    p = (t) iInterfaceQueryLocalInterface;
                    int i34 = i24 + 109;
                    a = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    p = new P(strongBinder);
                    int i210 = b;
                    int i211 = i210 & 31;
                    int i212 = ((i210 ^ 31) | i211) << 1;
                    int i213 = -((i210 | 31) & (~i211));
                    int i36 = ((i212 | i213) << 1) - (i213 ^ i212);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                p = new P(strongBinder);
                int i214 = b;
                int i215 = i214 & 31;
                int i216 = ((i214 ^ 31) | i215) << 1;
                int i217 = -((i214 | 31) & (~i215));
                int i38 = ((i216 | i217) << 1) - (i217 ^ i216);
                a = i38 % 128;
                int i39 = i38 % 2;
            }
        }
        UnusedAppRestrictionsBackportService.OooO00o oooO00o = (UnusedAppRestrictionsBackportService.OooO00o) this;
        if (p != null) {
            a aVar = new a(p);
            UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService = UnusedAppRestrictionsBackportService.this;
            int i40 = a;
            int i41 = i40 ^ 13;
            int i42 = (i40 & 13) << 1;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            b = i43 % 128;
            int i44 = i43 % 2;
            unusedAppRestrictionsBackportService.b(aVar);
            int i45 = a;
            int i46 = (i45 & 34) + (i45 | 34);
            int i47 = (i46 ^ (-1)) + (i46 << 1);
            b = i47 % 128;
            int i48 = i47 % 2;
        }
        int i49 = a;
        int i50 = i49 & 29;
        int i51 = (i49 | 29) & (~i50);
        int i52 = -(-(i50 << 1));
        int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
        b = i53 % 128;
        int i54 = i53 % 2;
        return true;
    }
}
