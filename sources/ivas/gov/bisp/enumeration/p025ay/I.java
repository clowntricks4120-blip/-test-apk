package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class I implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ aI c;

    public I(aI aIVar) {
        this.c = aIVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 18) + ((i2 & 18) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.l.isShowing();
            obj.hashCode();
            throw null;
        }
        if (this.c.l.isShowing()) {
            int i4 = b;
            int i5 = (i4 & (-112)) | ((~i4) & 111);
            int i6 = -(-((i4 & 111) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            this.c.l.dismiss();
            int i9 = a;
            int i10 = (i9 & (-94)) | ((~i9) & 93);
            int i11 = (i9 & 93) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        Activity activity = this.c.f;
        int i14 = a;
        int i15 = ((i14 & 49) - (~(i14 | 49))) - 1;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            af.b(activity, responseMessageE.getErrorMessage(), responseMessageE.isLogout());
        } else {
            af.b(activity, responseMessageE.getErrorMessage(), responseMessageE.isLogout());
            obj.hashCode();
            throw null;
        }
    }
}
