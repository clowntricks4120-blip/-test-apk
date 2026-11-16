package ivas.gov.bisp.enumeration.dj;

import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dj.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class CountDownTimerC0307s extends CountDownTimer {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ TextView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC0307s(long j, long j2, TextView textView, TextView textView2) {
        super(j, j2);
        this.c = textView;
        this.d = textView2;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = b + 107;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.c.setVisibility(72);
        } else {
            this.c.setVisibility(8);
        }
        this.d.setVisibility(0);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-30)) | ((~i2) & 29);
        int i4 = (i2 & 29) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (int) (j / 1000);
        TextView textView = this.c;
        Locale locale = Locale.getDefault();
        int i8 = a;
        int i9 = ((i8 & 26) + (i8 | 26)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 31;
        b = i11 % 128;
        int i12 = i11 % 2;
        Integer numValueOf = Integer.valueOf(i7 % 60);
        int i13 = a;
        int i14 = (((i13 & (-34)) | ((~i13) & 33)) - (~((i13 & 33) << 1))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        textView.setText(String.format(locale, "Resend code in: %02d:%02d", Integer.valueOf(i7 / 60), numValueOf));
        int i16 = b + 75;
        a = i16 % 128;
        int i17 = i16 % 2;
    }
}
