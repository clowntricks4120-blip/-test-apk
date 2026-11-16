package ivas.gov.bisp.enumeration.bI;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0127y implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;

    public C0127y(ActivityRoster activityRoster, Spinner spinner) {
        this.c = spinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 101) - (~(i3 | 101))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            int i7 = a;
            int i8 = (i7 & (-16)) | ((~i7) & 15);
            int i9 = (i7 & 15) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 63 / 0;
                return;
            }
            return;
        }
        int i12 = (i5 ^ 21) + ((i5 & 21) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        this.c.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
        int i14 = b;
        int i15 = ((i14 | 45) << 1) - (i14 ^ 45);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
