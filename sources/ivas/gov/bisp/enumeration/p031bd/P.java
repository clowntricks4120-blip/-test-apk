package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class P implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityDiscrepancyActivity c;

    public P(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        this.c = disabilityDiscrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (((i2 ^ 1) | i3) << 1) - ((i2 | 1) & (~i3));
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.aQ.isShowing();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c.aQ.isShowing()) {
            int i5 = b;
            int i6 = i5 ^ 49;
            int i7 = ((((i5 & 49) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                this.c.aQ.dismiss();
                int i8 = 85 / 0;
            } else {
                this.c.aQ.dismiss();
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i9 = a;
        int i10 = i9 & 67;
        int i11 = (i10 - (~((i9 ^ 67) | i10))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        af.b(disabilityDiscrepancyActivity, errorMessage, responseMessageE.isLogout());
        if (i12 == 0) {
            int i13 = 79 / 0;
        }
    }
}
