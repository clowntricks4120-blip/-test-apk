package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class C implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public C(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        ActivityRoster activityRoster;
        Spinner spinner;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 33;
        int i4 = (((i2 & 33) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            activityRoster = this.c;
            activityRoster.bf = arrayList;
            spinner = activityRoster.sp_employment_status;
            int i5 = 10 / 0;
        } else {
            activityRoster = this.c;
            activityRoster.bf = arrayList;
            spinner = activityRoster.sp_employment_status;
        }
        activityRoster.R(arrayList, spinner);
        ActivityRoster activityRoster2 = this.c;
        BISPApplication bISPApplication = activityRoster2.bN;
        int i6 = a;
        int i7 = i6 & 85;
        int i8 = (i6 | 85) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            bISPApplication.M = activityRoster2.bf;
            int i11 = 56 / 0;
        } else {
            bISPApplication.M = activityRoster2.bf;
        }
        int i12 = a;
        int i13 = i12 & 115;
        int i14 = -(-(i12 | 115));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 90 / 0;
        }
    }
}
