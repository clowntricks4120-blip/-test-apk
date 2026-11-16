package ivas.gov.bisp.enumeration.dj;

import android.os.CountDownTimer;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class S extends CountDownTimer {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ PasswordResetActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(PasswordResetActivity passwordResetActivity, long j, long j2) {
        super(j, j2);
        this.c = passwordResetActivity;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = (i2 | 5) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (int) (j / 1000);
        TextView textView = this.c.O;
        int i9 = b;
        int i10 = i9 & 107;
        int i11 = -(-((i9 ^ 107) | i10));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[2];
        int i14 = a;
        int i15 = i14 & 49;
        int i16 = (i14 ^ 49) | i15;
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        char c = 0;
        if (i17 % 2 != 0) {
            objArr[0] = Integer.valueOf(i8 << 60);
            numValueOf = Integer.valueOf(i8 / 54);
        } else {
            objArr[0] = Integer.valueOf(i8 / 60);
            numValueOf = Integer.valueOf(i8 % 60);
            c = 1;
        }
        int i18 = a;
        int i19 = i18 ^ 31;
        int i20 = (i18 & 31) << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            objArr[c] = numValueOf;
            textView.setText(String.format(locale, "%02d:%02d", objArr));
        } else {
            objArr[c] = numValueOf;
            textView.setText(String.format(locale, "%02d:%02d", objArr));
            throw null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 106) + ((i2 & 106) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.N.setVisibility(69);
        } else {
            this.c.N.setVisibility(8);
        }
        int i5 = b;
        int i6 = i5 & 73;
        int i7 = ((i5 | 73) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.c.O.setVisibility(8);
        int i9 = b;
        int i10 = ((i9 | 123) << 1) - (i9 ^ 123);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.c.L.setVisibility(0);
        int i12 = a;
        int i13 = i12 & 97;
        int i14 = (i12 ^ 97) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 20 / 0;
        }
    }
}
