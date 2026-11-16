package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class aO implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterActivity c;

    public aO(UpdateRosterActivity updateRosterActivity) {
        this.c = updateRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 125;
        int i4 = ((i2 & 125) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (!(!this.c.bu.isShowing())) {
            int i8 = b;
            int i9 = (i8 ^ 17) + ((i8 & 17) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.c.bu.dismiss();
            int i11 = b;
            int i12 = i11 & 25;
            int i13 = ((i11 ^ 25) | i12) << 1;
            int i14 = -((i11 | 25) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 4;
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        UpdateRosterActivity updateRosterActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        boolean zIsLogout = responseMessageE.isLogout();
        int i17 = b + 23;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            af.b(updateRosterActivity, errorMessage, zIsLogout);
            int i18 = 64 / 0;
        } else {
            af.b(updateRosterActivity, errorMessage, zIsLogout);
        }
        int i19 = a;
        int i20 = i19 & 25;
        int i21 = i20 + ((i19 ^ 25) | i20);
        b = i21 % 128;
        int i22 = i21 % 2;
    }
}
