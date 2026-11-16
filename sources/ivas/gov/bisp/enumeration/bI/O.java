package ivas.gov.bisp.enumeration.bI;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;

/* JADX INFO: loaded from: classes.dex */
public class O implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public O(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 43) + ((i3 & 43) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            this.c.sp_banks.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            int i7 = b;
            int i8 = ((i7 | 89) << 1) - (i7 ^ 89);
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = i5 + 99;
        b = i10 % 128;
        int i11 = i10 % 2;
        this.c.sp_banks.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        int i12 = a;
        int i13 = (i12 | 107) << 1;
        int i14 = -(((~i12) & 107) | (i12 & (-108)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 35) | (i2 & 35)) << 1) - (~(-(((~i2) & 35) | (i2 & (-36)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
