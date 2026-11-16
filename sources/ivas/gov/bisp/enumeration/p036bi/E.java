package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class E implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DiscrepancyActivity c;

    public E(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.c.an.isShowing();
            obj.hashCode();
            throw null;
        }
        if (this.c.an.isShowing()) {
            int i4 = b + 105;
            a = i4 % 128;
            int i5 = i4 % 2;
            this.c.an.dismiss();
            int i6 = a + 97;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        DiscrepancyActivity discrepancyActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i8 = a;
        int i9 = i8 & 77;
        int i10 = ((i8 ^ 77) | i9) << 1;
        int i11 = -((i8 | 77) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            af.b(discrepancyActivity, errorMessage, responseMessageE.isLogout());
        } else {
            af.b(discrepancyActivity, errorMessage, responseMessageE.isLogout());
            obj.hashCode();
            throw null;
        }
    }
}
