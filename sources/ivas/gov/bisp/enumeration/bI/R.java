package ivas.gov.bisp.enumeration.bI;

import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class R implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final /* synthetic */ ActivityRoster c;

    public R(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = a + 118;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.aJ = arrayList;
            i = 1;
        } else {
            this.c.aJ = arrayList;
            i = 0;
        }
        int i5 = a;
        int i6 = ((((i5 ^ 7) | (i5 & 7)) << 1) - (~(-(((~i5) & 7) | (i5 & (-8)))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            if (i >= this.c.aJ.size()) {
                int i8 = b;
                int i9 = ((i8 & 6) + (i8 | 6)) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                i = 0;
                break;
            }
            int i11 = (-2) - ((b + 66) ^ (-1));
            a = i11 % 128;
            int i12 = i11 % 2;
            Item item = this.c.aJ.get(i);
            int i13 = b;
            int i14 = i13 & 73;
            int i15 = ((i13 ^ 73) | i14) << 1;
            int i16 = -((i13 | 73) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                item.getOptionId();
                throw null;
            }
            int optionId = item.getOptionId();
            ActivityRoster activityRoster = this.c;
            int i18 = b;
            int i19 = i18 | 45;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 45)) & i19);
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            if (optionId == activityRoster.bk.marital_status) {
                break;
            }
            int i24 = a;
            int i25 = i24 & 53;
            int i26 = (i24 ^ 53) | i25;
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = ((i ^ 1) | (i & 1)) << 1;
            int i30 = -(((~i) & 1) | (i & (-2)));
            i = ((i29 | i30) << 1) - (i30 ^ i29);
            int i31 = (i24 & 117) + (i24 | 117);
            b = i31 % 128;
            int i32 = i31 % 2;
        }
        this.c.sp_marital_status.setSelection(i);
        ActivityRoster activityRoster2 = this.c;
        int i33 = a + 115;
        b = i33 % 128;
        if (i33 % 2 == 0) {
            activityRoster2.sp_marital_status.setEnabled(true);
        } else {
            activityRoster2.sp_marital_status.setEnabled(false);
        }
    }
}
