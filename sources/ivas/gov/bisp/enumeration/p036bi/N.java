package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ b d;

    public /* synthetic */ N(b bVar, int i) {
        this.c = i;
        this.d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 99;
        int i4 = -(-((i2 & 99) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.c;
        if (i7 == 0) {
            b bVar = this.d;
            int i8 = CnicValidationActivity.r;
            bVar.dismiss();
            int i9 = a;
            int i10 = (i9 & (-76)) | ((~i9) & 75);
            int i11 = (i9 & 75) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        if (i7 == 1) {
            b bVar2 = this.d;
            int i14 = Authentication.OooOo00.c;
            bVar2.dismiss();
            int i15 = b + 7;
            a = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        if (i7 == 2) {
            b bVar3 = this.d;
            Pattern pattern = ChangePasswordActivity.r;
            bVar3.dismiss();
            int i17 = b;
            int i18 = i17 & 111;
            int i19 = -(-((i17 ^ 111) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        int i22 = ((i6 | 111) << 1) - (i6 ^ 111);
        int i23 = i22 % 128;
        a = i23;
        int i24 = i22 % 2;
        int i25 = i23 | 39;
        int i26 = i25 << 1;
        int i27 = -((~(i23 & 39)) & i25);
        int i28 = (i26 & i27) + (i27 | i26);
        b = i28 % 128;
        int i29 = i28 % 2;
        b bVar4 = this.d;
        Pattern pattern2 = PasswordResetActivity.s;
        bVar4.dismiss();
        int i30 = b + 81;
        a = i30 % 128;
        if (i30 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
