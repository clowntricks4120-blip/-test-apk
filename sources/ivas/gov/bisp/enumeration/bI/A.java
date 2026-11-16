package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class A implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public A(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = i3 + ((i2 ^ 25) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aN = arrayList;
        BISPApplication bISPApplication = activityRoster.bN;
        int i6 = a;
        int i7 = ((i6 | 91) << 1) - (i6 ^ 91);
        b = i7 % 128;
        int i8 = i7 % 2;
        bISPApplication.Q = arrayList;
        int i9 = a;
        int i10 = i9 & 29;
        int i11 = i10 + ((i9 ^ 29) | i10);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 89 / 0;
        }
    }
}
