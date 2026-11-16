package ivas.gov.bisp.enumeration.bK;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class ar implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ as c;

    public ar(as asVar) {
        this.c = asVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 121;
        int i5 = (i3 | 121) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (i != 0) {
            this.c.f.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i10 = a;
            int i11 = (i10 & (-58)) | ((~i10) & 57);
            int i12 = -(-((i10 & 57) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        int i15 = i8 & 27;
        int i16 = -(-((i8 ^ 27) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        this.c.f.setBackgroundResource(R.drawable.spinner_bg);
        int i19 = a;
        int i20 = ((i19 ^ 115) | (i19 & 115)) << 1;
        int i21 = -(((~i19) & 115) | (i19 & (-116)));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = i2 | 125;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }
}
