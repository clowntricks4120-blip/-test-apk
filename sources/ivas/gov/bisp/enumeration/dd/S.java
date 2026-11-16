package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: loaded from: classes.dex */
public class S implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DobActivity c;

    public S(DobActivity dobActivity) {
        this.c = dobActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        DobActivity dobActivity;
        String errorMessage;
        boolean zIsLogout;
        int i = 2 % 2;
        int i2 = a + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.c.ak.dismiss();
        ResponseMessage responseMessageE = ag.e(t);
        int i4 = b + 83;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            dobActivity = this.c;
            errorMessage = responseMessageE.getErrorMessage();
            zIsLogout = responseMessageE.isLogout();
            int i5 = 6 / 0;
        } else {
            dobActivity = this.c;
            errorMessage = responseMessageE.getErrorMessage();
            zIsLogout = responseMessageE.isLogout();
        }
        int i6 = a;
        int i7 = i6 ^ 31;
        int i8 = -(-((i6 & 31) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        af.b(dobActivity, errorMessage, zIsLogout);
        int i11 = a;
        int i12 = ((i11 | 19) << 1) - (i11 ^ 19);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
