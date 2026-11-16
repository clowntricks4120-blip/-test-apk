package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class S implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ GenderDiscrepancy c;

    public S(GenderDiscrepancy genderDiscrepancy) {
        this.c = genderDiscrepancy;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a + 83;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
            if (this.c.ac.isShowing()) {
                this.c.ac.dismiss();
                int i4 = a;
                int i5 = (-2) - (((i4 ^ 88) + ((i4 & 88) << 1)) ^ (-1));
                b = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (this.c.ac.isShowing()) {
            this.c.ac.dismiss();
            int i7 = a;
            int i8 = (-2) - (((i7 ^ 88) + ((i7 & 88) << 1)) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        GenderDiscrepancy genderDiscrepancy = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i10 = a;
        int i11 = (i10 & (-4)) | ((~i10) & 3);
        int i12 = (i10 & 3) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        af.b(genderDiscrepancy, errorMessage, responseMessageE.isLogout());
        int i15 = a;
        int i16 = (-2) - (((i15 & 52) + (i15 | 52)) ^ (-1));
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
