package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class K implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public K(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 56) + ((i2 & 56) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.aI = arrayList;
        int i5 = b;
        int i6 = i5 & 15;
        int i7 = -(-(i5 | 15));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < this.c.aI.size()) {
            int i11 = a;
            int i12 = i11 & 125;
            int i13 = (i11 | 125) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                this.c.aI.get(i10);
                throw null;
            }
            Item item = this.c.aI.get(i10);
            int i16 = b;
            int i17 = i16 | 25;
            int i18 = (i17 << 1) - ((~(i16 & 25)) & i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            int optionId = item.getOptionId();
            ActivityRoster activityRoster = this.c;
            int i20 = a;
            int i21 = (i20 & 88) + (i20 | 88);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = activityRoster.bn.marital_status;
                throw null;
            }
            if (optionId == activityRoster.bn.marital_status) {
                this.c.sp_marital_status.setSelection(i10);
                int i24 = b;
                int i25 = i24 & 3;
                int i26 = i25 + ((i24 ^ 3) | i25);
                a = i26 % 128;
                int i27 = i26 % 2;
                this.c.sp_marital_status.setEnabled(false);
                int i28 = a + 71;
                b = i28 % 128;
                int i29 = i28 % 2;
            }
            i10 = ((i10 & 1) << 1) + ((i10 & (-2)) | ((~i10) & 1));
            int i30 = a + 67;
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = a;
        int i33 = (((i32 | 48) << 1) - (i32 ^ 48)) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        i10 = 0;
        this.c.sp_marital_status.setSelection(i10);
        int i210 = b;
        int i211 = i210 & 3;
        int i212 = i211 + ((i210 ^ 3) | i211);
        a = i212 % 128;
        int i213 = i212 % 2;
        this.c.sp_marital_status.setEnabled(false);
        int i214 = a + 71;
        b = i214 % 128;
        int i215 = i214 % 2;
    }
}
