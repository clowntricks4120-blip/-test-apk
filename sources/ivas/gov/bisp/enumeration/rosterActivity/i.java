package ivas.gov.bisp.enumeration.rosterActivity;

import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity.OooOo c;

    public i(OfflineRosterActivity.OooOo oooOo) {
        this.c = oooOo;
    }

    @Override // java.lang.Runnable
    public void run() {
        Spinner spinner;
        int i = 2 % 2;
        int i2 = a;
        int i3 = 1;
        int i4 = ((i2 | 27) << 1) - (i2 ^ 27);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            spinner = OfflineRosterActivity.this.sp_attended_school;
        } else {
            spinner = OfflineRosterActivity.this.sp_attended_school;
            i3 = 0;
        }
        spinner.setSelection(i3);
        int i5 = a;
        int i6 = (i5 & 99) + (i5 | 99);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
    }
}
