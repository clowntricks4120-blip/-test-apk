package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0297t implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ CnicActivity c;

    public C0297t(CnicActivity cnicActivity) {
        this.c = cnicActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 54) + (i2 | 54)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.ai.isShowing();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c.ai.isShowing()) {
            int i4 = b;
            int i5 = i4 & 61;
            int i6 = (i5 - (~(-(-((i4 ^ 61) | i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            this.c.ai.dismiss();
            int i8 = (-2) - ((b + 16) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        CnicActivity cnicActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i10 = a;
        int i11 = ((i10 ^ 104) + ((i10 & 104) << 1)) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            af.b(cnicActivity, errorMessage, responseMessageE.isLogout());
            int i12 = 17 / 0;
        } else {
            af.b(cnicActivity, errorMessage, responseMessageE.isLogout());
        }
        int i13 = a + 47;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 26 / 0;
        }
    }
}
