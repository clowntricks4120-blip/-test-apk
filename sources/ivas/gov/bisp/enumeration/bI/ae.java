package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ae implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ OfflineRosterActivity c;

    public ae(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = (i2 ^ 79) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        OfflineRosterActivity offlineRosterActivity = this.c;
        offlineRosterActivity.aJ = arrayList;
        Spinner spinner = offlineRosterActivity.sp_employment_status;
        int i7 = b + 96;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            offlineRosterActivity.O(arrayList, spinner);
            OfflineRosterActivity offlineRosterActivity2 = this.c;
            BISPApplication bISPApplication = offlineRosterActivity2.bv;
            ArrayList<Item> arrayList2 = offlineRosterActivity2.aJ;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        offlineRosterActivity.O(arrayList, spinner);
        OfflineRosterActivity offlineRosterActivity3 = this.c;
        offlineRosterActivity3.bv.M = offlineRosterActivity3.aJ;
        int i9 = a;
        int i10 = i9 & 43;
        int i11 = i10 + ((i9 ^ 43) | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
