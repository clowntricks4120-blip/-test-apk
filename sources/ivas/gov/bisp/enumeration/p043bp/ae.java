package ivas.gov.bisp.enumeration.p043bp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class ae implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;

    public ae(ActivityRoster activityRoster, Spinner spinner) {
        this.c = spinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 88) + (i3 | 88)) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            int i6 = i5 + 55;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
                return;
            } else {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
                throw null;
            }
        }
        this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
        int i7 = b;
        int i8 = i7 & 7;
        int i9 = (i7 ^ 7) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 54 / 0;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 52) + ((i2 & 52) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
    }
}
