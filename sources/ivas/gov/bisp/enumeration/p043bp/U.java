package ivas.gov.bisp.enumeration.p043bp;

import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class U implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public U(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Spinner spinner;
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aO = arrayList;
        BISPApplication bISPApplication = activityRoster.bw;
        int i7 = b;
        int i8 = i7 & 33;
        int i9 = -(-((i7 ^ 33) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            bISPApplication.P = arrayList;
            spinner = activityRoster.sp_attended_school;
            onItemSelectedListener = activityRoster.bg;
            int i11 = 90 / 0;
        } else {
            bISPApplication.P = arrayList;
            spinner = activityRoster.sp_attended_school;
            onItemSelectedListener = activityRoster.bg;
        }
        spinner.setOnItemSelectedListener(onItemSelectedListener);
        int i12 = a;
        int i13 = i12 & 57;
        int i14 = (i12 | 57) & (~i13);
        int i15 = i13 << 1;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
