package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class K implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ OfflineRosterActivity c;

    public K(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b + 116;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        OfflineRosterActivity offlineRosterActivity = this.c;
        offlineRosterActivity.bs = arrayList;
        BISPApplication bISPApplication = offlineRosterActivity.bv;
        int i5 = b;
        int i6 = (i5 ^ 107) + ((i5 & 107) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        bISPApplication.R = arrayList;
        int i8 = a;
        int i9 = (i8 & (-4)) | ((~i8) & 3);
        int i10 = -(-((i8 & 3) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 25 / 0;
        }
    }
}
