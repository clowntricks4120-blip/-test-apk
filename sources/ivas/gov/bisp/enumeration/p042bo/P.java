package ivas.gov.bisp.enumeration.p042bo;

import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class P implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateNadraRosterList c;

    public P(UpdateNadraRosterList updateNadraRosterList) {
        this.c = updateNadraRosterList;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (((i2 ^ 107) | i3) << 1) - ((i2 | 107) & (~i3));
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.c.al.isShowing();
            throw null;
        }
        if (this.c.al.isShowing()) {
            this.c.al.dismiss();
            int i5 = a;
            int i6 = ((i5 ^ 93) | (i5 & 93)) << 1;
            int i7 = -(((~i5) & 93) | (i5 & (-94)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        UpdateNadraRosterList updateNadraRosterList = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i10 = b;
        int i11 = i10 | 67;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 67)) & i11);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        af.b(updateNadraRosterList, errorMessage, responseMessageE.isLogout());
        int i16 = a;
        int i17 = i16 & 19;
        int i18 = ((i16 ^ 19) | i17) << 1;
        int i19 = -((i16 | 19) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
