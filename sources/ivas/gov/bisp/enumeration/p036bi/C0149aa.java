package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0149aa implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DiscrepancyActivity c;

    public C0149aa(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 9) | (i2 & 9)) << 1;
        int i4 = -(((~i2) & 9) | (i2 & (-10)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.c.an.isShowing()) {
            int i7 = b + 123;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                this.c.an.dismiss();
                int i8 = 18 / 0;
            } else {
                this.c.an.dismiss();
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        DiscrepancyActivity discrepancyActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        boolean zIsLogout = responseMessageE.isLogout();
        int i9 = b;
        int i10 = ((i9 | 21) << 1) - (i9 ^ 21);
        a = i10 % 128;
        int i11 = i10 % 2;
        af.b(discrepancyActivity, errorMessage, zIsLogout);
        int i12 = a;
        int i13 = (i12 & (-44)) | ((~i12) & 43);
        int i14 = -(-((i12 & 43) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }
}
