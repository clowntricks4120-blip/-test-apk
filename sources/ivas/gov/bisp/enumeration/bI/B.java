package ivas.gov.bisp.enumeration.bI;

import android.os.CountDownTimer;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class B extends CountDownTimer {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(OfflineRosterActivity offlineRosterActivity, long j, long j2) {
        super(j, j2);
        this.c = offlineRosterActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.c.textViewTimeRemaining.setVisibility(51);
            } else {
                this.c.textViewTimeRemaining.setVisibility(8);
            }
            this.c.btn_save.setEnabled(true);
            int i3 = a;
            int i4 = ((i3 | 117) << 1) - (((~i3) & 117) | (i3 & (-118)));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        int i = 2 % 2;
        try {
            TextView textView = this.c.textViewTimeRemaining;
            StringBuilder sb = new StringBuilder();
            int i2 = b;
            int i3 = ((i2 | 89) << 1) - (i2 ^ 89);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append("Time Remaining : ");
                throw null;
            }
            sb.append("Time Remaining : ");
            sb.append((int) (j / 1000));
            String string = sb.toString();
            int i4 = a;
            int i5 = i4 & 29;
            int i6 = (i4 ^ 29) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            textView.setText(string);
            this.c.btn_save.setEnabled(false);
            int i9 = a;
            int i10 = (i9 & 41) + (i9 | 41);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
