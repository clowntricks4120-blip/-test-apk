package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class F implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity c;

    public F(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-24)) | ((~i2) & 23)) + ((i2 & 23) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.c.an.isShowing())) {
            int i5 = b;
            int i6 = i5 & 3;
            int i7 = (i5 | 3) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.c.an.dismiss();
            int i11 = a;
            int i12 = i11 & 33;
            int i13 = (((i11 | 33) & (~i12)) - (~(i12 << 1))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        DiscrepancyActivity discrepancyActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        boolean zIsLogout = responseMessageE.isLogout();
        int i15 = a;
        int i16 = i15 & 79;
        int i17 = ((i15 ^ 79) | i16) << 1;
        int i18 = -((i15 | 79) & (~i16));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            af.b(discrepancyActivity, errorMessage, zIsLogout);
            return;
        }
        af.b(discrepancyActivity, errorMessage, zIsLogout);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
