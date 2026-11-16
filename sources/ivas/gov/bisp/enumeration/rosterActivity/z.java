package ivas.gov.bisp.enumeration.rosterActivity;

import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
public class z implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity.OooOo c;

    public z(OfflineRosterActivity.OooOo oooOo) {
        this.c = oooOo;
    }

    @Override // java.lang.Runnable
    public void run() {
        Spinner spinner;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 82) + (i3 | 82)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            spinner = OfflineRosterActivity.this.sp_work_activity;
            i = 1;
        } else {
            spinner = OfflineRosterActivity.this.sp_work_activity;
            i = 0;
        }
        int i5 = a;
        int i6 = ((i5 | 91) << 1) - (i5 ^ 91);
        b = i6 % 128;
        int i7 = i6 % 2;
        spinner.setSelection(i);
        int i8 = a;
        int i9 = i8 & 87;
        int i10 = i8 | 87;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
