package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityRoster;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityRoster d;

    public /* synthetic */ C(ActivityRoster activityRoster, int i) {
        this.c = i;
        this.d = activityRoster;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        double d;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 113) + ((i3 & 113) << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this.c != 0) {
            int i7 = i5 ^ 89;
            int i8 = (i5 & 89) << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 99;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                Objects.requireNonNull(this.d);
                return;
            } else {
                Objects.requireNonNull(this.d);
                int i13 = 66 / 0;
                return;
            }
        }
        ActivityRoster activityRoster = this.d;
        activityRoster.spinnerYear.setSelection(0);
        Spinner spinner = activityRoster.spinnerMonth;
        int i14 = a;
        int i15 = i14 & 49;
        int i16 = i15 + ((i14 ^ 49) | i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            spinner.setSelection(0);
        } else {
            spinner.setSelection(0);
        }
        activityRoster.tv_dob.setText(BuildConfig.FLAVOR);
        int i17 = b;
        int i18 = i17 ^ 99;
        int i19 = ((i17 & 99) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            activityRoster.bq = BuildConfig.FLAVOR;
            d = 1.0d;
        } else {
            activityRoster.bq = BuildConfig.FLAVOR;
            d = 0.0d;
        }
        activityRoster.br = d;
        dialogInterface.dismiss();
    }
}
