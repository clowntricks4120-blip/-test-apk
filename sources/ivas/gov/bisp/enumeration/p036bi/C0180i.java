package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.AddressActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0180i implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AddressActivity c;

    public C0180i(AddressActivity addressActivity) {
        this.c = addressActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 125;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 125)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.af.isShowing();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c.af.isShowing()) {
            this.c.af.dismiss();
            int i7 = a + 73;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        ResponseMessage responseMessageE = ag.e(t);
        AddressActivity addressActivity = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i9 = a;
        int i10 = i9 & 97;
        int i11 = (i9 | 97) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            af.b(addressActivity, errorMessage, responseMessageE.isLogout());
            int i14 = 52 / 0;
        } else {
            af.b(addressActivity, errorMessage, responseMessageE.isLogout());
        }
        int i15 = b + 37;
        a = i15 % 128;
        int i16 = i15 % 2;
    }
}
