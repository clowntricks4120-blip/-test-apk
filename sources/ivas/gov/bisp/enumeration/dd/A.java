package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: loaded from: classes.dex */
public class A implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ GenderActivity c;

    public A(GenderActivity genderActivity) {
        this.c = genderActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.ad.dismiss();
            obj.hashCode();
            throw null;
        }
        this.c.ad.dismiss();
        ResponseMessage responseMessageE = ag.e(t);
        GenderActivity genderActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i4 = a;
        int i5 = i4 & 57;
        int i6 = i5 + ((i4 ^ 57) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        af.b(genderActivity, errorMessage, responseMessageE.isLogout());
        int i8 = a + 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }
}
