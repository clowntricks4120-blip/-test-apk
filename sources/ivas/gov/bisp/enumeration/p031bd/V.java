package ivas.gov.bisp.enumeration.p031bd;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class V implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalDiscrepancy c;

    public V(MaritalDiscrepancy maritalDiscrepancy) {
        this.c = maritalDiscrepancy;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Spinner spinner;
        Object obj;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 40) << 1) - (i2 ^ 40)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            MaritalDiscrepancy maritalDiscrepancy = this.c;
            maritalDiscrepancy.aQ = arrayList;
            spinner = maritalDiscrepancy.aW;
            int i4 = 64 / 0;
        } else {
            MaritalDiscrepancy maritalDiscrepancy2 = this.c;
            maritalDiscrepancy2.aQ = arrayList;
            spinner = maritalDiscrepancy2.aW;
        }
        spinner.setEnabled(true);
        int i5 = b + 68;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= this.c.aQ.size()) {
                i8 = 0;
                break;
            }
            int i9 = b;
            int i10 = ((i9 & 75) - (~(-(-(i9 | 75))))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                this.c.aQ.get(i8);
                throw null;
            }
            Item item = this.c.aQ.get(i8);
            int i11 = a;
            int i12 = i11 & 71;
            int i13 = (i12 - (~(-(-((i11 ^ 71) | i12))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            if (item.getOptionId() == this.c.ay) {
                int i15 = b + 95;
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                int i18 = i16 + 43;
                b = i18 % 128;
                int i19 = i18 % 2;
                break;
            }
            i8++;
            int i20 = a;
            int i21 = i20 & 53;
            int i22 = (i20 | 53) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        MaritalDiscrepancy maritalDiscrepancy3 = this.c;
        ArrayList<Item> arrayList2 = maritalDiscrepancy3.aQ;
        Spinner spinner2 = maritalDiscrepancy3.aW;
        ArrayAdapter arrayAdapter = new ArrayAdapter(maritalDiscrepancy3, R.layout.spinner_item, arrayList2);
        int i26 = a;
        int i27 = (i26 ^ 25) + ((i26 & 25) << 1);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
            int i28 = 60 / 0;
        } else {
            arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        }
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
        am amVar = new am(maritalDiscrepancy3, spinner2, arrayList2);
        int i29 = b;
        int i30 = i29 & 103;
        int i31 = i30 + ((i29 ^ 103) | i30);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            spinner2.setOnItemSelectedListener(amVar);
            this.c.aW.setSelection(i8);
            throw null;
        }
        spinner2.setOnItemSelectedListener(amVar);
        this.c.aW.setSelection(i8);
        int i32 = b;
        int i33 = ((((i32 ^ 27) | (i32 & 27)) << 1) - (~(-(((~i32) & 27) | (i32 & (-28)))))) - 1;
        a = i33 % 128;
        if (i33 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
