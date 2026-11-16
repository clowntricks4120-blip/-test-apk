package ivas.gov.bisp.enumeration.p043bp;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class X implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public X(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 85;
        int i5 = ((i3 & 85) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (i != 0) {
            this.c.sp_banks.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i9 = b;
            int i10 = ((i9 & 54) + (i9 | 54)) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 22 / 0;
                return;
            }
            return;
        }
        int i12 = i3 ^ 29;
        int i13 = ((i3 & 29) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        this.c.sp_banks.setBackgroundResource(R.drawable.spinner_bg);
        int i17 = b;
        int i18 = i17 & 75;
        int i19 = i18 + ((i17 ^ 75) | i18);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-96)) | ((~i2) & 95)) - (~((i2 & 95) << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
