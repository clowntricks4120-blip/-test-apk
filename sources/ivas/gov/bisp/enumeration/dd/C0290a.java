package ivas.gov.bisp.enumeration.dd;

import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0290a implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ CnicActivity c;

    public C0290a(CnicActivity cnicActivity) {
        this.c = cnicActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(ivas.gov.bisp.enumeration.p022av.T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = (i3 - (~((i2 ^ 35) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.c.ai.isShowing()) {
            int i6 = a;
            int i7 = i6 & 105;
            int i8 = (i6 | 105) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            this.c.ai.dismiss();
            int i12 = a + 83;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        this.c.af.setVisibility(8);
        CnicActivity cnicActivity = this.c;
        int i14 = b;
        int i15 = i14 & 107;
        int i16 = (((i14 | 107) & (~i15)) - (~(i15 << 1))) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        cnicActivity.af.setEnabled(false);
        this.c.ag.setVisibility(0);
        int i18 = b;
        int i19 = ((i18 ^ 22) + ((i18 & 22) << 1)) - 1;
        a = i19 % 128;
        if (i19 % 2 == 0) {
            this.c.af.setEnabled(false);
        } else {
            this.c.af.setEnabled(true);
        }
        EditText editText = this.c.ae;
        int i20 = a;
        int i21 = i20 & 1;
        int i22 = -(-((i20 ^ 1) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            editText.setEnabled(true);
        } else {
            editText.setEnabled(true);
        }
        ResponseMessage responseMessageE = ag.e(t);
        CnicActivity cnicActivity2 = this.c;
        String errorMessage = responseMessageE.getErrorMessage();
        int i24 = a;
        int i25 = ((i24 ^ 125) | (i24 & 125)) << 1;
        int i26 = -(((~i24) & 125) | (i24 & (-126)));
        int i27 = (i25 & i26) + (i25 | i26);
        b = i27 % 128;
        int i28 = i27 % 2;
        af.b(cnicActivity2, errorMessage, responseMessageE.isLogout());
        int i29 = a + 101;
        b = i29 % 128;
        if (i29 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
