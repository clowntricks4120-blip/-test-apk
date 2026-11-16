package ivas.gov.bisp.enumeration.p043bp;

import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Z implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public Z(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Object obj;
        Item item;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = (i2 | 79) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.c.aN = arrayList;
        int i8 = b;
        int i9 = i8 & 81;
        int i10 = (i8 ^ 81) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            obj = null;
            if (i13 >= this.c.aN.size()) {
                int i14 = b;
                int i15 = i14 ^ 91;
                int i16 = ((i14 & 91) | i15) << 1;
                int i17 = -i15;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                i13 = 0;
                break;
            }
            int i20 = b;
            int i21 = i20 & 49;
            int i22 = ((((i20 ^ 49) | i21) << 1) - (~(-((i20 | 49) & (~i21))))) - 1;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                item = this.c.aN.get(i13);
                int i23 = 24 / 0;
            } else {
                item = this.c.aN.get(i13);
            }
            int optionId = item.getOptionId();
            Roster roster = this.c.bn;
            int i24 = b;
            int i25 = i24 & 43;
            int i26 = i25 + ((i24 ^ 43) | i25);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = roster.disability;
                throw null;
            }
            if (optionId == roster.disability) {
                break;
            }
            int i28 = b;
            int i29 = i28 ^ 89;
            int i30 = (((i28 & 89) | i29) << 1) - i29;
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            int i33 = i13 & 6;
            int i34 = ((i13 ^ 6) | i33) << 1;
            int i35 = -((i13 | 6) & (~i33));
            i13 = (((i34 | i35) << 1) - (i35 ^ i34)) - 5;
            int i36 = ((i31 | 79) << 1) - (i31 ^ 79);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        ActivityRoster activityRoster = this.c;
        if (activityRoster.bn.disability != 6) {
            activityRoster.sp_disability.setSelection(i13);
            Spinner spinner = this.c.sp_disability;
            int i38 = b;
            int i39 = i38 & 67;
            int i40 = (i38 ^ 67) | i39;
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            a = i41 % 128;
            if (i41 % 2 != 0) {
                spinner.setEnabled(true);
                return;
            } else {
                spinner.setEnabled(true);
                obj.hashCode();
                throw null;
            }
        }
        int i42 = a;
        int i43 = (-2) - (((i42 ^ 86) + ((i42 & 86) << 1)) ^ (-1));
        b = i43 % 128;
        int i44 = i43 % 2;
        activityRoster.sp_disability.setEnabled(false);
        Spinner spinner2 = this.c.sp_disability;
        int i45 = b;
        int i46 = i45 & 13;
        int i47 = -(-((i45 ^ 13) | i46));
        int i48 = (i46 & i47) + (i47 | i46);
        a = i48 % 128;
        int i49 = i48 % 2;
        spinner2.setSelection(1);
        int i50 = a;
        int i51 = ((i50 | 59) << 1) - (i50 ^ 59);
        b = i51 % 128;
        if (i51 % 2 != 0) {
            throw null;
        }
    }
}
