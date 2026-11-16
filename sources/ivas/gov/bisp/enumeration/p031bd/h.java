package ivas.gov.bisp.enumeration.p031bd;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityDiscrepancyActivity c;

    public h(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        this.c = disabilityDiscrepancyActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Object obj;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 99) + (i2 | 99);
        a = i3 % 128;
        int i4 = i3 % 2;
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.c;
        disabilityDiscrepancyActivity.ag = arrayList;
        Spinner spinner = disabilityDiscrepancyActivity.ai;
        int i5 = b + 33;
        a = i5 % 128;
        int i6 = i5 % 2;
        spinner.setEnabled(true);
        int i7 = b;
        int i8 = (i7 & 69) + (i7 | 69);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= this.c.ag.size()) {
                i10 = 0;
                break;
            }
            int i11 = a;
            int i12 = i11 & 43;
            int i13 = ((i11 ^ 43) | i12) << 1;
            int i14 = -((i11 | 43) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            Item item = this.c.ag.get(i10);
            int i17 = b;
            int i18 = i17 & 57;
            int i19 = -(-((i17 ^ 57) | i18));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            if (item.getOptionId() == this.c.aJ) {
                int i22 = b;
                int i23 = i22 & 111;
                int i24 = (((i22 ^ 111) | i23) << 1) - ((i22 | 111) & (~i23));
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    break;
                } else {
                    throw null;
                }
            }
            int i25 = ((i10 ^ 1) | (i10 & 1)) << 1;
            int i26 = -(((~i10) & 1) | (i10 & (-2)));
            i10 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i27 = a + 7;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity2 = this.c;
        ArrayList<Item> arrayList2 = disabilityDiscrepancyActivity2.ag;
        Spinner spinner2 = disabilityDiscrepancyActivity2.ai;
        Objects.requireNonNull(disabilityDiscrepancyActivity2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(disabilityDiscrepancyActivity2, R.layout.spinner_item, arrayList2);
        int i29 = b;
        int i30 = i29 & 123;
        int i31 = (i30 - (~((i29 ^ 123) | i30))) - 1;
        a = i31 % 128;
        int i32 = i31 % 2;
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner2.setOnItemSelectedListener(new C0135j(disabilityDiscrepancyActivity2, spinner2, arrayList2));
        int i33 = b;
        int i34 = ((i33 ^ 101) | (i33 & 101)) << 1;
        int i35 = -(((~i33) & 101) | (i33 & (-102)));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        a = i36 % 128;
        if (i36 % 2 != 0) {
            this.c.ai.setSelection(i10);
            obj.hashCode();
            throw null;
        }
        this.c.ai.setSelection(i10);
        int i37 = b;
        int i38 = (i37 ^ 123) + ((i37 & 123) << 1);
        a = i38 % 128;
        if (i38 % 2 != 0) {
            int i39 = 25 / 0;
        }
    }
}
