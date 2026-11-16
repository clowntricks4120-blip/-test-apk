package ivas.gov.bisp.enumeration.bI;

import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ai implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public ai(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 39) + ((i2 & 39) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            OfflineRosterActivity offlineRosterActivity = this.c;
            offlineRosterActivity.aI = arrayList;
            BISPApplication bISPApplication = offlineRosterActivity.bv;
            throw null;
        }
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        offlineRosterActivity2.aI = arrayList;
        BISPApplication bISPApplication2 = offlineRosterActivity2.bv;
        int i4 = b;
        int i5 = ((i4 ^ 44) + ((i4 & 44) << 1)) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            bISPApplication2.O = arrayList;
            offlineRosterActivity2.O(arrayList, offlineRosterActivity2.sp_work_activity);
            obj.hashCode();
            throw null;
        }
        bISPApplication2.O = arrayList;
        offlineRosterActivity2.O(arrayList, offlineRosterActivity2.sp_work_activity);
        OfflineRosterActivity offlineRosterActivity3 = this.c;
        Spinner spinner = offlineRosterActivity3.sp_work_activity;
        AdapterView.OnItemSelectedListener onItemSelectedListener = offlineRosterActivity3.bi;
        int i6 = a;
        int i7 = (i6 & 81) + (i6 | 81);
        b = i7 % 128;
        int i8 = i7 % 2;
        spinner.setOnItemSelectedListener(onItemSelectedListener);
        int i9 = b + 79;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
