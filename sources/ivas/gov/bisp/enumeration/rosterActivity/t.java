package ivas.gov.bisp.enumeration.rosterActivity;

import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
public class t implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity.OooOo c;

    public t(OfflineRosterActivity.OooOo oooOo) {
        this.c = oooOo;
    }

    @Override // java.lang.Runnable
    public void run() {
        Spinner spinner;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 75) - (~(i2 | 75));
        int i4 = 1;
        int i5 = i3 - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            spinner = OfflineRosterActivity.this.sp_employment_status;
        } else {
            spinner = OfflineRosterActivity.this.sp_employment_status;
            i4 = 0;
        }
        spinner.setSelection(i4);
    }
}
