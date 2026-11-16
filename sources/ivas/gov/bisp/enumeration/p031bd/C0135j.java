package ivas.gov.bisp.enumeration.p031bd;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0135j implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ DisabilityDiscrepancyActivity e;

    public C0135j(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity, Spinner spinner, ArrayList arrayList) {
        this.e = disabilityDiscrepancyActivity;
        this.c = spinner;
        this.d = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 85;
        int i5 = (i3 | 85) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            this.c.setBackgroundResource(R.drawable.spinner_bg);
            int i8 = b;
            int i9 = (i8 & 113) + (i8 | 113);
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.e;
        disabilityDiscrepancyActivity.aF = true;
        ArrayList arrayList = this.d;
        int i11 = b + 69;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            disabilityDiscrepancyActivity.aI = ((Item) arrayList.get(i)).getOptionId();
            int i12 = 42 / 0;
        } else {
            disabilityDiscrepancyActivity.aI = ((Item) arrayList.get(i)).getOptionId();
        }
        int i13 = b;
        int i14 = i13 & 103;
        int i15 = i13 | 103;
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity2 = this.e;
        Item item = (Item) this.d.get(i);
        int i18 = b;
        int i19 = i18 & 3;
        int i20 = (i18 ^ 3) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        disabilityDiscrepancyActivity2.aG = item.getOption();
        this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
        int i23 = b + 60;
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = -(-((i2 ^ 79) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.e.aF = false;
        int i7 = a;
        int i8 = (i7 & 48) + (i7 | 48);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
