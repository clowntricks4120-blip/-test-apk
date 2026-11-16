package ivas.gov.bisp.enumeration.dd;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0301y implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalStatusActivity c;

    public C0301y(MaritalStatusActivity maritalStatusActivity) {
        this.c = maritalStatusActivity;
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        Object obj;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        MaritalStatusActivity maritalStatusActivity = this.c;
        maritalStatusActivity.ac = arrayList;
        maritalStatusActivity.ad.setEnabled(true);
        int i7 = a;
        int i8 = ((i7 & 28) + (i7 | 28)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            ArrayList<Item> arrayList2 = this.c.ac;
            int i13 = b;
            int i14 = (i13 & 57) + (i13 | 57);
            a = i14 % 128;
            int i15 = i14 % 2;
            obj = null;
            if (i12 >= arrayList2.size()) {
                i12 = 0;
                break;
            }
            int i16 = a + 83;
            b = i16 % 128;
            int i17 = i16 % 2;
            Item item = this.c.ac.get(i12);
            int i18 = a;
            int i19 = ((i18 | 111) << 1) - (i18 ^ 111);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                item.getOptionId();
                int i20 = this.c.am;
                obj.hashCode();
                throw null;
            }
            if (item.getOptionId() == this.c.am) {
                int i21 = b;
                int i22 = (i21 & (-88)) | ((~i21) & 87);
                int i23 = -(-((i21 & 87) << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                break;
            }
            int i26 = (i12 & (-2)) | ((~i12) & 1);
            int i27 = (i12 & 1) << 1;
            i12 = ((i27 & i26) << 1) + (i26 ^ i27);
            int i28 = a + 33;
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        MaritalStatusActivity maritalStatusActivity2 = this.c;
        ArrayList<Item> arrayList3 = maritalStatusActivity2.ac;
        Spinner spinner = maritalStatusActivity2.ad;
        ArrayAdapter arrayAdapter = new ArrayAdapter(maritalStatusActivity2, ivas.gov.bisp.enumeration.R.layout.spinner_item, arrayList3);
        int i30 = a;
        int i31 = i30 & 17;
        int i32 = (i31 - (~(-(-((i30 ^ 17) | i31))))) - 1;
        b = i32 % 128;
        int i33 = i32 % 2;
        arrayAdapter.setDropDownViewResource(ivas.gov.bisp.enumeration.R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        C0296s c0296s = new C0296s(maritalStatusActivity2, spinner, arrayList3);
        int i34 = b;
        int i35 = i34 ^ 73;
        int i36 = ((i34 & 73) | i35) << 1;
        int i37 = -i35;
        int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
        a = i38 % 128;
        if (i38 % 2 == 0) {
            spinner.setOnItemSelectedListener(c0296s);
            this.c.ad.setSelection(i12);
            int i39 = 23 / 0;
        } else {
            spinner.setOnItemSelectedListener(c0296s);
            this.c.ad.setSelection(i12);
        }
        int i40 = (-2) - ((a + 20) ^ (-1));
        b = i40 % 128;
        if (i40 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
