package ivas.gov.bisp.enumeration.bI;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class F implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;

    public F(OfflineRosterActivity offlineRosterActivity, Spinner spinner) {
        this.c = spinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = (i2 ^ 73) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            int i7 = a;
            int i8 = i7 ^ 95;
            int i9 = ((i7 & 95) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        int i13 = (((i5 | 55) << 1) - (~(-(((~i5) & 55) | (i5 & (-56)))))) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        int i14 = b;
        int i15 = (i14 & 117) + (i14 | 117);
        a = i15 % 128;
        int i16 = i15 % 2;
    }
}
