package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aX implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ double c;
    public final /* synthetic */ UpdateRosterActivity d;

    public aX(UpdateRosterActivity updateRosterActivity, double d) {
        this.d = updateRosterActivity;
        this.c = d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    /* JADX WARN: Code duplicated, block: B:17:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2 = 2 % 2;
        int i3 = a + 7;
        b = i3 % 128;
        int i4 = i3 % 2;
        UpdateRosterActivity updateRosterActivity = this.d;
        updateRosterActivity.bk = arrayList;
        double d = this.c;
        int i5 = a;
        int i6 = ((i5 & (-84)) | ((~i5) & 83)) + ((i5 & 83) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        if (d > 13.0d) {
            updateRosterActivity.I(arrayList, updateRosterActivity.aM);
            int i9 = a;
            int i10 = ((i9 ^ 19) - (~((i9 & 19) << 1))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 18 / 0;
                return;
            }
            return;
        }
        int i12 = i5 & 83;
        int i13 = (~i12) & (i5 | 83);
        int i14 = -(-(i12 << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        while (i8 < this.d.bk.size()) {
            int i17 = b + 35;
            a = i17 % 128;
            int i18 = i17 % 2;
            Item item = this.d.bk.get(i8);
            int i19 = b;
            int i20 = (((i19 & (-122)) | ((~i19) & 121)) - (~((i19 & 121) << 1))) - 1;
            a = i20 % 128;
            if (i20 % 2 != 0) {
                if (item.getOptionId() >= 112) {
                    int i21 = b;
                    int i22 = i21 & 43;
                    int i23 = ((i21 ^ 43) | i22) << 1;
                    int i24 = -((i21 | 43) & (~i22));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    this.d.bk.remove(i8);
                    int i27 = b;
                    int i28 = i27 & 91;
                    i = (((i27 ^ 91) | i28) << 1) - ((i27 | 91) & (~i28));
                    a = i % 128;
                    if (i % 2 != 0) {
                        i8 = (~i8) + (i8 << 1);
                    }
                }
            } else if (item.getOptionId() >= 38) {
                int i29 = b;
                int i210 = i29 & 43;
                int i211 = ((i29 ^ 43) | i210) << 1;
                int i212 = -((i29 | 43) & (~i210));
                int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                a = i213 % 128;
                int i214 = i213 % 2;
                this.d.bk.remove(i8);
                int i215 = b;
                int i216 = i215 & 91;
                i = (((i215 ^ 91) | i216) << 1) - ((i215 | 91) & (~i216));
                a = i % 128;
                if (i % 2 != 0) {
                    i8 = (~i8) + (i8 << 1);
                }
            }
            int i30 = i8 & 1;
            i8 = (i30 - (~(-(-((i8 ^ 1) | i30))))) - 1;
            int i31 = b;
            int i32 = i31 & 109;
            int i33 = i32 + ((i31 ^ 109) | i32);
            a = i33 % 128;
            int i34 = i33 % 2;
        }
        UpdateRosterActivity updateRosterActivity2 = this.d;
        ArrayList<Item> arrayList2 = updateRosterActivity2.bk;
        int i35 = a;
        int i36 = i35 ^ 99;
        int i37 = (i35 & 99) << 1;
        int i38 = (i36 & i37) + (i37 | i36);
        b = i38 % 128;
        if (i38 % 2 != 0) {
            updateRosterActivity2.I(arrayList2, updateRosterActivity2.aM);
            return;
        }
        updateRosterActivity2.I(arrayList2, updateRosterActivity2.aM);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
