package ivas.gov.bisp.enumeration.bI;

import android.content.DialogInterface;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0122o implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityRoster d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0122o(ActivityRoster activityRoster, int i) {
        this.c = i;
        this.d = activityRoster;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = (((i3 | 25) & (~i4)) - (~(i4 << 1))) - 1;
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.c;
        if (i7 == 0) {
            ActivityRoster activityRoster = this.d;
            activityRoster.spinnerYear.setSelection(0);
            int i8 = b;
            int i9 = (i8 ^ 113) + ((i8 & 113) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            activityRoster.spinnerMonth.setSelection(0);
            TextView textView = activityRoster.tv_dob;
            int i11 = b;
            int i12 = ((i11 ^ 42) + ((i11 & 42) << 1)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                textView.setText(BuildConfig.FLAVOR);
                activityRoster.bW = BuildConfig.FLAVOR;
                int i13 = 13 / 0;
            } else {
                textView.setText(BuildConfig.FLAVOR);
                activityRoster.bW = BuildConfig.FLAVOR;
            }
            int i14 = b;
            int i15 = (i14 | 23) << 1;
            int i16 = -(((~i14) & 23) | (i14 & (-24)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            activityRoster.aU = 0.0d;
            dialogInterface.dismiss();
            return;
        }
        if (i7 == 1) {
            ActivityRoster activityRoster2 = this.d;
            int i19 = ActivityRoster.af;
            activityRoster2.finish();
            int i20 = b;
            int i21 = (((i20 ^ 27) | (i20 & 27)) << 1) - (((~i20) & 27) | (i20 & (-28)));
            a = i21 % 128;
            int i22 = i21 % 2;
            return;
        }
        int i23 = (i6 & (-110)) | ((~i6) & 109);
        int i24 = -(-((i6 & 109) << 1));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        int i26 = i25 % 128;
        a = i26;
        int i27 = i25 % 2;
        int i28 = (i26 & 11) + (i26 | 11);
        b = i28 % 128;
        if (i28 % 2 != 0) {
            ActivityRoster activityRoster3 = this.d;
            int i29 = ActivityRoster.af;
            activityRoster3.scanClicked(null);
            obj.hashCode();
            throw null;
        }
        ActivityRoster activityRoster4 = this.d;
        int i30 = ActivityRoster.af;
        activityRoster4.scanClicked(null);
        int i31 = b;
        int i32 = i31 & 103;
        int i33 = i32 + ((i31 ^ 103) | i32);
        a = i33 % 128;
        int i34 = i33 % 2;
    }
}
