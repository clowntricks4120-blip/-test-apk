package ivas.gov.bisp.enumeration.p043bp;

import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0218z implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityAgriculture c;

    public C0218z(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i = 2 % 2;
        ActivityAgriculture activityAgriculture = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i2 = b;
        int i3 = (i2 ^ 44) + ((i2 & 44) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        activityAgriculture.aC = arrayList2;
        ActivityAgriculture activityAgriculture2 = this.c;
        BISPApplication bISPApplication = activityAgriculture2.az;
        int i6 = b;
        int i7 = i6 | 75;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 75)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            List<Item> list = bISPApplication.I;
            throw null;
        }
        if (bISPApplication.I == null) {
            bISPApplication.I = activityAgriculture2.aC;
            int i11 = b;
            int i12 = i11 & 111;
            int i13 = i12 + ((i11 ^ 111) | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = ((i15 ^ 12) + ((i15 & 12) << 1)) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < this.c.aC.size()) {
            int i19 = a;
            int i20 = (i19 & 73) + (i19 | 73);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                ActivityAgriculture activityAgriculture3 = this.c;
                ArrayList<String> arrayList3 = activityAgriculture3.ax;
                List<Item> list2 = activityAgriculture3.aC;
                obj.hashCode();
                throw null;
            }
            ActivityAgriculture activityAgriculture4 = this.c;
            ArrayList<String> arrayList4 = activityAgriculture4.ax;
            List<Item> list3 = activityAgriculture4.aC;
            int i21 = a;
            int i22 = i21 & 35;
            int i23 = (i21 ^ 35) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
            arrayList4.add(list3.get(i18).getOption());
            int i26 = a;
            int i27 = ((i26 | 99) << 1) - (i26 ^ 99);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = (i18 ^ 2) + ((i18 & 2) << 1);
            i18 = (i29 ^ (-1)) + (i29 << 1);
            int i30 = i26 & 37;
            int i31 = (i26 ^ 37) | i30;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            b = i32 % 128;
            int i33 = i32 % 2;
        }
        ActivityAgriculture activityAgriculture5 = this.c;
        ArrayAdapter arrayAdapter = new ArrayAdapter(activityAgriculture5.ae, R.layout.spinner_item, activityAgriculture5.ax);
        int i34 = a;
        int i35 = i34 & 37;
        int i36 = i34 | 37;
        int i37 = (i35 & i36) + (i36 | i35);
        b = i37 % 128;
        int i38 = i37 % 2;
        this.c.spinnerUnit.setAdapter((SpinnerAdapter) arrayAdapter);
        int i39 = b;
        int i40 = i39 & 23;
        int i41 = ((i39 ^ 23) | i40) << 1;
        int i42 = -((i39 | 23) & (~i40));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        a = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 95 / 0;
        }
    }
}
