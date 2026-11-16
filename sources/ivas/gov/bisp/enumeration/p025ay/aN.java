package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class aN implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ aT c;

    public aN(aT aTVar) {
        this.c = aTVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.c.l.isShowing()) {
            int i4 = a;
            int i5 = (i4 & 96) + (i4 | 96);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            this.c.l.dismiss();
            int i8 = a;
            int i9 = i8 & 85;
            int i10 = (i8 ^ 85) | i9;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        Activity activity = this.c.f;
        String errorMessage = responseMessageE.getErrorMessage();
        int i13 = b;
        int i14 = ((i13 & (-122)) | ((~i13) & 121)) + ((i13 & 121) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        af.b(activity, errorMessage, responseMessageE.isLogout());
        int i16 = b;
        int i17 = (i16 ^ 56) + ((i16 & 56) << 1);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }
}
