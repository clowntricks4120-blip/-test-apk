package ivas.gov.bisp.enumeration.p038bk;

import android.app.Activity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class br implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ bk c;

    public br(bk bkVar) {
        this.c = bkVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
        b = i3 % 128;
        int i4 = i3 % 2;
        ResponseMessage responseMessageE = ag.e(t);
        Activity activity = this.c.h;
        String errorMessage = responseMessageE.getErrorMessage();
        int i5 = b;
        int i6 = i5 & 87;
        int i7 = i6 + ((i5 ^ 87) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            af.b(activity, errorMessage, responseMessageE.isLogout());
            int i8 = 10 / 0;
        } else {
            af.b(activity, errorMessage, responseMessageE.isLogout());
        }
        int i9 = a;
        int i10 = i9 & 33;
        int i11 = (i9 ^ 33) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
    }
}
