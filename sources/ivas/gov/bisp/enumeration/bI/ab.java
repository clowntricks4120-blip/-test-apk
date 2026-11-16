package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ab implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ OfflineRosterActivity c;

    public ab(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = a + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        OfflineRosterActivity offlineRosterActivity = this.c;
        offlineRosterActivity.br = arrayList;
        BISPApplication bISPApplication = offlineRosterActivity.bv;
        int i4 = a;
        int i5 = i4 & 39;
        int i6 = (i4 ^ 39) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        bISPApplication.Q = arrayList;
        int i9 = a;
        int i10 = (((i9 | 28) << 1) - (i9 ^ 28)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
