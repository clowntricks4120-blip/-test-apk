package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class M implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DobDiscrepancy c;

    public M(DobDiscrepancy dobDiscrepancy) {
        this.c = dobDiscrepancy;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i3 - (~((i2 ^ 53) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
            if (this.c.ad.isShowing()) {
                this.c.ad.dismiss();
                int i6 = a;
                int i7 = i6 ^ 9;
                int i8 = -(-((i6 & 9) << 1));
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (!(!this.c.ad.isShowing())) {
            this.c.ad.dismiss();
            int i11 = a;
            int i12 = i11 ^ 9;
            int i13 = -(-((i11 & 9) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        DobDiscrepancy dobDiscrepancy = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i16 = a;
        int i17 = i16 & 115;
        int i18 = ((i16 | 115) & (~i17)) + (i17 << 1);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            af.b(dobDiscrepancy, errorMessage, responseMessageE.isLogout());
            return;
        }
        af.b(dobDiscrepancy, errorMessage, responseMessageE.isLogout());
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
