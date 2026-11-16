package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ab implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public ab(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        BISPApplication bISPApplication;
        int i = 2 % 2;
        int i2 = a + 65;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            ActivityRoster activityRoster = this.c;
            activityRoster.aM = arrayList;
            bISPApplication = activityRoster.bw;
            int i3 = 68 / 0;
        } else {
            ActivityRoster activityRoster2 = this.c;
            activityRoster2.aM = arrayList;
            bISPApplication = activityRoster2.bw;
        }
        int i4 = b;
        int i5 = (i4 & 105) + (i4 | 105);
        a = i5 % 128;
        int i6 = i5 % 2;
        bISPApplication.Q = arrayList;
        int i7 = a;
        int i8 = (((i7 ^ 79) | (i7 & 79)) << 1) - (((~i7) & 79) | (i7 & (-80)));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 / 0;
        }
    }
}
