package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0173b implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DiscrepancyActivity c;

    public C0173b(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = -(-((i2 & 103) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
            if (this.c.an.isShowing()) {
                int i7 = a;
                int i8 = i7 & 47;
                int i9 = (i8 - (~((i7 ^ 47) | i8))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                this.c.an.dismiss();
                int i11 = a;
                int i12 = i11 & 3;
                int i13 = (i11 | 3) & (~i12);
                int i14 = -(-(i12 << 1));
                int i15 = (i13 & i14) + (i13 | i14);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        } else if (!(!this.c.an.isShowing())) {
            int i17 = a;
            int i18 = i17 & 47;
            int i19 = (i18 - (~((i17 ^ 47) | i18))) - 1;
            b = i19 % 128;
            int i110 = i19 % 2;
            this.c.an.dismiss();
            int i111 = a;
            int i112 = i111 & 3;
            int i113 = (i111 | 3) & (~i112);
            int i114 = -(-(i112 << 1));
            int i115 = (i113 & i114) + (i113 | i114);
            b = i115 % 128;
            int i116 = i115 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        DiscrepancyActivity discrepancyActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        boolean zIsLogout = responseMessageE.isLogout();
        int i20 = b;
        int i21 = ((i20 | 29) << 1) - (i20 ^ 29);
        a = i21 % 128;
        int i22 = i21 % 2;
        af.b(discrepancyActivity, errorMessage, zIsLogout);
        int i23 = a;
        int i24 = ((i23 ^ 113) | (i23 & 113)) << 1;
        int i25 = -(((~i23) & 113) | (i23 & (-114)));
        int i26 = (i24 & i25) + (i25 | i24);
        b = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 53 / 0;
        }
    }
}
