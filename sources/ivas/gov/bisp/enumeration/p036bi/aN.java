package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class aN implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateElectricityGassRefActivity c;

    public aN(UpdateElectricityGassRefActivity updateElectricityGassRefActivity) {
        this.c = updateElectricityGassRefActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 16) + ((i2 & 16) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.c.af.isShowing()) {
            int i5 = b;
            int i6 = i5 & 63;
            int i7 = (i5 | 63) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.c.af.dismiss();
            int i11 = b;
            int i12 = i11 & 97;
            int i13 = i12 + ((i11 ^ 97) | i12);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 3 % 4;
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        UpdateElectricityGassRefActivity updateElectricityGassRefActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i15 = b;
        int i16 = i15 ^ 23;
        int i17 = ((i15 & 23) | i16) << 1;
        int i18 = -i16;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        af.b(updateElectricityGassRefActivity, errorMessage, responseMessageE.isLogout());
        if (i20 != 0) {
            int i21 = 16 / 0;
        }
    }
}
