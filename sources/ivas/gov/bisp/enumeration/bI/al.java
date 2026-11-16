package ivas.gov.bisp.enumeration.bI;

import android.content.DialogInterface;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ OfflineRosterActivity d;

    public /* synthetic */ al(OfflineRosterActivity offlineRosterActivity, int i) {
        this.c = i;
        this.d = offlineRosterActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OfflineRosterActivity offlineRosterActivity;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-64)) | ((~i3) & 63)) + ((i3 & 63) << 1);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.c == 0) {
            OfflineRosterActivity offlineRosterActivity2 = this.d;
            offlineRosterActivity2.ba = true;
            ArrayList<Roster> arrayList = new ArrayList<>();
            int i6 = b;
            int i7 = i6 & 105;
            int i8 = (i6 | 105) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            offlineRosterActivity2.aO = arrayList;
            arrayList.add(offlineRosterActivity2.aN);
            int i12 = a;
            int i13 = i12 ^ 81;
            int i14 = (i12 & 81) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                offlineRosterActivity2.R();
                dialogInterface.dismiss();
                return;
            } else {
                offlineRosterActivity2.R();
                dialogInterface.dismiss();
                obj.hashCode();
                throw null;
            }
        }
        int i16 = ((i5 ^ 111) - (~((i5 & 111) << 1))) - 1;
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        int i19 = ((i17 ^ 25) | (i17 & 25)) << 1;
        int i20 = -(((~i17) & 25) | (i17 & (-26)));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            offlineRosterActivity = this.d;
            offlineRosterActivity.spinnerYear.setSelection(1);
        } else {
            offlineRosterActivity = this.d;
            offlineRosterActivity.spinnerYear.setSelection(0);
        }
        offlineRosterActivity.spinnerMonth.setSelection(0);
        TextView textView = offlineRosterActivity.tv_dob;
        int i22 = b;
        int i23 = i22 ^ 119;
        int i24 = -(-((i22 & 119) << 1));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        a = i25 % 128;
        int i26 = i25 % 2;
        textView.setText(BuildConfig.FLAVOR);
        offlineRosterActivity.be = BuildConfig.FLAVOR;
        offlineRosterActivity.aQ = 0.0d;
        int i27 = b + 5;
        a = i27 % 128;
        if (i27 % 2 == 0) {
            dialogInterface.dismiss();
        } else {
            dialogInterface.dismiss();
            obj.hashCode();
            throw null;
        }
    }
}
