package ivas.gov.bisp.enumeration.p038bk;

import android.app.Activity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class bd implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ bs c;

    public bd(bs bsVar) {
        this.c = bsVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
        b = i3 % 128;
        int i4 = i3 % 2;
        ResponseMessage responseMessageE = ag.e(t);
        Activity activity = this.c.h;
        int i5 = a;
        int i6 = ((i5 & 2) + (i5 | 2)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        af.b(activity, responseMessageE.getErrorMessage(), responseMessageE.isLogout());
        int i8 = a + 83;
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
