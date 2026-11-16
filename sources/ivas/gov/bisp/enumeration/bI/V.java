package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class V implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public V(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 73;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 73)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aQ = arrayList;
        int i8 = a + 55;
        b = i8 % 128;
        int i9 = i8 % 2;
        activityRoster.R(arrayList, activityRoster.sp_highest_education);
        ActivityRoster activityRoster2 = this.c;
        BISPApplication bISPApplication = activityRoster2.bN;
        int i10 = a + 9;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            bISPApplication.L = activityRoster2.aQ;
            throw null;
        }
        bISPApplication.L = activityRoster2.aQ;
        int i11 = b;
        int i12 = (i11 & 7) + (i11 | 7);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }
}
