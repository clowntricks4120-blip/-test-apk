package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class R implements C0094m.bas {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final /* synthetic */ MaritalDiscrepancy c;

    public R(MaritalDiscrepancy maritalDiscrepancy) {
        this.c = maritalDiscrepancy;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = (((i2 ^ 49) | i3) << 1) - ((i2 | 49) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.c.ac.isShowing()) {
            int i6 = a + 121;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                this.c.ac.dismiss();
                int i7 = 1 / 0;
            } else {
                this.c.ac.dismiss();
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        MaritalDiscrepancy maritalDiscrepancy = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i8 = a;
        int i9 = i8 & 121;
        int i10 = i8 | 121;
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        af.b(maritalDiscrepancy, errorMessage, responseMessageE.isLogout());
        int i13 = b;
        int i14 = (i13 ^ 13) + ((i13 & 13) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
    }
}
