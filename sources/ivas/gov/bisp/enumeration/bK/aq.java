package ivas.gov.bisp.enumeration.bK;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class aq implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ au c;

    public aq(au auVar) {
        this.c = auVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 125) - (~(-(-((i2 & 125) << 1))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 29;
        int i5 = ((((i3 ^ 29) | i4) << 1) - (~(-((~i4) & (i3 | 29))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (i == 0) {
            int i7 = (-2) - (((i3 ^ 20) + ((i3 & 20) << 1)) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                this.c.f.setBackgroundResource(R.drawable.spinner_bg);
                return;
            } else {
                this.c.f.setBackgroundResource(R.drawable.spinner_bg);
                throw null;
            }
        }
        this.c.f.setBackgroundResource(R.drawable.spinner_bg_selected);
        int i8 = b;
        int i9 = ((((i8 ^ 117) | (i8 & 117)) << 1) - (~(-(((~i8) & 117) | (i8 & (-118)))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
