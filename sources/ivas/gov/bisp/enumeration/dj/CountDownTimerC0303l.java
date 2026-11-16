package ivas.gov.bisp.enumeration.dj;

import android.os.CountDownTimer;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import java.util.Locale;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dj.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class CountDownTimerC0303l extends CountDownTimer {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ChangePasswordActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC0303l(ChangePasswordActivity changePasswordActivity, long j, long j2) {
        super(j, j2);
        this.c = changePasswordActivity;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        int i;
        ChangePasswordActivity changePasswordActivity;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-68)) | ((~i3) & 67);
        int i5 = (i3 & 67) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            i = (int) (j - 1000);
            changePasswordActivity = this.c;
        } else {
            i = (int) (j / 1000);
            changePasswordActivity = this.c;
        }
        TextView textView = changePasswordActivity.L;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i / 60);
        int i7 = b + 95;
        a = i7 % 128;
        int i8 = i7 % 2;
        Object[] objArr = {numValueOf, Integer.valueOf(i % 60)};
        int i9 = b;
        int i10 = i9 & 121;
        int i11 = -(-((i9 ^ 121) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        textView.setText(String.format(locale, "%02d:%02d", objArr));
        int i14 = b;
        int i15 = i14 & 21;
        int i16 = -(-((i14 ^ 21) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 42) << 1) - (i2 ^ 42)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.O.setVisibility(8);
        ChangePasswordActivity changePasswordActivity = this.c;
        int i5 = a;
        int i6 = i5 & 85;
        int i7 = ((((i5 ^ 85) | i6) << 1) - (~(-((i5 | 85) & (~i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        changePasswordActivity.L.setVisibility(8);
        TextView textView = this.c.P;
        int i9 = b;
        int i10 = ((i9 ^ 121) | (i9 & 121)) << 1;
        int i11 = -(((~i9) & 121) | (i9 & (-122)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        textView.setVisibility(0);
        int i14 = b;
        int i15 = i14 ^ 59;
        int i16 = (((i14 & 59) | i15) << 1) - i15;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
