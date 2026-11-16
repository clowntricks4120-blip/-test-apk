package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: loaded from: classes.dex */
public class D implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalStatusActivity c;

    public D(MaritalStatusActivity maritalStatusActivity) {
        this.c = maritalStatusActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-52)) | ((~i2) & 51)) - (~((i2 & 51) << 1))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.ak.dismiss();
            ag.e(t);
            obj.hashCode();
            throw null;
        }
        this.c.ak.dismiss();
        ResponseMessage responseMessageE = ag.e(t);
        MaritalStatusActivity maritalStatusActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        boolean zIsLogout = responseMessageE.isLogout();
        int i4 = b;
        int i5 = ((i4 | 65) << 1) - (i4 ^ 65);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            af.b(maritalStatusActivity, errorMessage, zIsLogout);
        } else {
            af.b(maritalStatusActivity, errorMessage, zIsLogout);
            obj.hashCode();
            throw null;
        }
    }
}
