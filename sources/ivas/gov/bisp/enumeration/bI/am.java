package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class am implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public am(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Spinner spinner;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 3) + (i2 | 3);
        a = i3 % 128;
        int i4 = i3 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aP = arrayList;
        int i5 = a;
        int i6 = ((i5 | 125) << 1) - (i5 ^ 125);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            activityRoster.bN.P = arrayList;
            spinner = activityRoster.sp_attended_school;
            int i7 = 51 / 0;
        } else {
            activityRoster.bN.P = arrayList;
            spinner = activityRoster.sp_attended_school;
        }
        int i8 = a + 35;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            spinner.setOnItemSelectedListener(activityRoster.bt);
            int i9 = 52 / 0;
        } else {
            spinner.setOnItemSelectedListener(activityRoster.bt);
        }
        int i10 = b;
        int i11 = (i10 & (-100)) | ((~i10) & 99);
        int i12 = (i10 & 99) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
