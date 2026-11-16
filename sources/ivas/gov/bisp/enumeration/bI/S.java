package ivas.gov.bisp.enumeration.bI;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class S implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public S(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = i3 + ((i2 ^ 113) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.aO = arrayList;
        int i6 = a;
        int i7 = (i6 & 61) + (i6 | 61);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (true) {
            Object obj = null;
            if (i9 >= this.c.aO.size()) {
                int i10 = a + 57;
                b = i10 % 128;
                int i11 = i10 % 2;
                i9 = 0;
                break;
            }
            int i12 = a;
            int i13 = ((i12 | 67) << 1) - (i12 ^ 67);
            b = i13 % 128;
            int i14 = i13 % 2;
            Item item = this.c.aO.get(i9);
            int i15 = b;
            int i16 = (i15 & 96) + (i15 | 96);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                item.getOptionId();
                Roster roster = this.c.bk;
                obj.hashCode();
                throw null;
            }
            if (item.getOptionId() == this.c.bk.disability) {
                break;
            }
            int i18 = a + 19;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                i9 = (-2) - (((i9 ^ 118) + ((i9 & 118) << 1)) ^ (-1));
            } else {
                int i19 = (-2) - ((i9 - 74) ^ (-1));
                i9 = ((i19 | 76) << 1) - (((~i19) & 76) | (i19 & (-77)));
            }
        }
        ActivityRoster activityRoster = this.c;
        if (activityRoster.bk.disability == 6) {
            int i20 = b;
            int i21 = ((i20 | 123) << 1) - (i20 ^ 123);
            a = i21 % 128;
            int i22 = i21 % 2;
            activityRoster.sp_disability.setEnabled(false);
            ActivityRoster activityRoster2 = this.c;
            int i23 = b + 45;
            a = i23 % 128;
            if (i23 % 2 == 0) {
                activityRoster2.sp_disability.setSelection(1);
                return;
            } else {
                activityRoster2.sp_disability.setSelection(1);
                return;
            }
        }
        activityRoster.sp_disability.setSelection(i9);
        Spinner spinner = this.c.sp_disability;
        int i24 = a;
        int i25 = ((i24 & (-74)) | ((~i24) & 73)) + ((i24 & 73) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
        spinner.setEnabled(true);
        int i27 = a;
        int i28 = ((i27 | 18) << 1) - (i27 ^ 18);
        int i29 = (i28 ^ (-1)) + (i28 << 1);
        b = i29 % 128;
        if (i29 % 2 != 0) {
            throw null;
        }
    }
}
