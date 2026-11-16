package ivas.gov.bisp.enumeration.bI;

import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class U implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public U(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            OfflineRosterActivity offlineRosterActivity = this.c;
            offlineRosterActivity.bj = arrayList;
            BISPApplication bISPApplication = offlineRosterActivity.bv;
            throw null;
        }
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        offlineRosterActivity2.bj = arrayList;
        offlineRosterActivity2.bv.P = arrayList;
        Spinner spinner = offlineRosterActivity2.sp_attended_school;
        AdapterView.OnItemSelectedListener onItemSelectedListener = offlineRosterActivity2.aU;
        int i4 = b;
        int i5 = i4 & 65;
        int i6 = (((i4 | 65) & (~i5)) - (~(i5 << 1))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            spinner.setOnItemSelectedListener(onItemSelectedListener);
        } else {
            spinner.setOnItemSelectedListener(onItemSelectedListener);
            obj.hashCode();
            throw null;
        }
    }
}
