package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aa implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ OfflineRosterActivity c;

    public aa(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = -(-((i2 ^ 61) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            OfflineRosterActivity offlineRosterActivity = this.c;
            offlineRosterActivity.bA = arrayList;
            BISPApplication bISPApplication = offlineRosterActivity.bv;
            obj.hashCode();
            throw null;
        }
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        offlineRosterActivity2.bA = arrayList;
        BISPApplication bISPApplication2 = offlineRosterActivity2.bv;
        int i6 = a;
        int i7 = (i6 | 111) << 1;
        int i8 = -(i6 ^ 111);
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        bISPApplication2.S = arrayList;
        if (i10 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
