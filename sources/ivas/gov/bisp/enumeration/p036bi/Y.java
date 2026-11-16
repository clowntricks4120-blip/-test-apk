package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class Y implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityActivity c;

    public Y(DisabilityActivity disabilityActivity) {
        this.c = disabilityActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.c.aj.isShowing()) {
            int i5 = a;
            int i6 = (i5 ^ 53) + ((i5 & 53) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            this.c.aj.dismiss();
            int i8 = b;
            int i9 = i8 & 69;
            int i10 = ((i8 ^ 69) | i9) << 1;
            int i11 = -((i8 | 69) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        DisabilityActivity disabilityActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i14 = a;
        int i15 = i14 & 33;
        int i16 = (i14 ^ 33) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        af.b(disabilityActivity, errorMessage, responseMessageE.isLogout());
        int i19 = b;
        int i20 = (i19 & 65) + (i19 | 65);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }
}
