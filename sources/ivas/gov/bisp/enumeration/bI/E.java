package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class E implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ OfflineRosterActivity c;

    public E(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        BISPApplication bISPApplication;
        ArrayList<Item> arrayList2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-100)) | ((~i2) & 99);
        int i4 = (i2 & 99) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        OfflineRosterActivity offlineRosterActivity = this.c;
        offlineRosterActivity.aH = arrayList;
        int i7 = b;
        int i8 = ((i7 ^ 101) | (i7 & 101)) << 1;
        int i9 = -(((~i7) & 101) | (i7 & (-102)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 == 0) {
            offlineRosterActivity.O(arrayList, offlineRosterActivity.sp_highest_education);
            throw null;
        }
        offlineRosterActivity.O(arrayList, offlineRosterActivity.sp_highest_education);
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        int i11 = a + 11;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            bISPApplication = offlineRosterActivity2.bv;
            arrayList2 = offlineRosterActivity2.aH;
            int i12 = 79 / 0;
        } else {
            bISPApplication = offlineRosterActivity2.bv;
            arrayList2 = offlineRosterActivity2.aH;
        }
        int i13 = a;
        int i14 = (-2) - ((((i13 | 66) << 1) - (i13 ^ 66)) ^ (-1));
        b = i14 % 128;
        if (i14 % 2 == 0) {
            bISPApplication.L = arrayList2;
        } else {
            bISPApplication.L = arrayList2;
            obj.hashCode();
            throw null;
        }
    }
}
