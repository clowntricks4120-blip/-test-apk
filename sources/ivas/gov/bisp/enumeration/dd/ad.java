package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: loaded from: classes.dex */
public class ad implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdatePhoneNoActivity c;

    public ad(UpdatePhoneNoActivity updatePhoneNoActivity) {
        this.c = updatePhoneNoActivity;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 79;
        int i4 = ((i2 & 79) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
            if (!(!this.c.ag.isShowing())) {
                this.c.ag.dismiss();
                int i8 = b;
                int i9 = i8 & 57;
                int i10 = (i8 ^ 57) | i9;
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (this.c.ag.isShowing()) {
            this.c.ag.dismiss();
            int i13 = b;
            int i14 = i13 & 57;
            int i15 = (i13 ^ 57) | i14;
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        UpdatePhoneNoActivity updatePhoneNoActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i18 = b + 101;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            af.b(updatePhoneNoActivity, errorMessage, responseMessageE.isLogout());
        } else {
            af.b(updatePhoneNoActivity, errorMessage, responseMessageE.isLogout());
            int i19 = 75 / 0;
        }
    }
}
