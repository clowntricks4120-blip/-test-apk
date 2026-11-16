package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ai implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public ai(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = (i3 - (~((i2 ^ 19) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.be = arrayList;
        int i6 = a + 89;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            activityRoster.E(arrayList, activityRoster.sp_employment_status);
            throw null;
        }
        activityRoster.E(arrayList, activityRoster.sp_employment_status);
        ActivityRoster activityRoster2 = this.c;
        BISPApplication bISPApplication = activityRoster2.bw;
        ArrayList<Item> arrayList2 = activityRoster2.be;
        int i7 = b;
        int i8 = i7 & 91;
        int i9 = -(-((i7 ^ 91) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        bISPApplication.M = arrayList2;
        int i12 = a;
        int i13 = i12 ^ 55;
        int i14 = ((i12 & 55) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
