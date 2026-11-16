package ivas.gov.bisp.enumeration.p043bp;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class E implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public E(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        BISPApplication bISPApplication;
        ArrayList<Item> arrayList2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = -(-((i2 ^ 19) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aP = arrayList;
        Spinner spinner = activityRoster.sp_highest_education;
        int i7 = a;
        int i8 = ((i7 ^ 75) - (~((i7 & 75) << 1))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            activityRoster.E(arrayList, spinner);
            ActivityRoster activityRoster2 = this.c;
            bISPApplication = activityRoster2.bw;
            arrayList2 = activityRoster2.aP;
            int i9 = 26 / 0;
        } else {
            activityRoster.E(arrayList, spinner);
            ActivityRoster activityRoster3 = this.c;
            bISPApplication = activityRoster3.bw;
            arrayList2 = activityRoster3.aP;
        }
        bISPApplication.L = arrayList2;
        int i10 = b;
        int i11 = i10 & 63;
        int i12 = (i10 ^ 63) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
