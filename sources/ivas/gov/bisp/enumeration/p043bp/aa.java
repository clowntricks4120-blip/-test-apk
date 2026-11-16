package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aa implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public aa(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 24) + (i2 | 24)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aI = arrayList;
        BISPApplication bISPApplication = activityRoster.bw;
        int i5 = b + 49;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            bISPApplication.R = arrayList;
            int i6 = 9 / 0;
        } else {
            bISPApplication.R = arrayList;
        }
        int i7 = b;
        int i8 = i7 & 1;
        int i9 = i8 + ((i7 ^ 1) | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
