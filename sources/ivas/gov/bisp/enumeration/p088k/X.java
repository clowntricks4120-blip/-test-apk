package ivas.gov.bisp.enumeration.p088k;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public class X implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Y c;

    public X(Y y) {
        this.c = y;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 103;
        int i5 = (((i3 & 103) | i4) << 1) - i4;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i != -1) {
            int i8 = ((i6 | 107) << 1) - (i6 ^ 107);
            a = i8 % 128;
            int i9 = i8 % 2;
            o00000OO o00000oo = this.c.i;
            if (o00000oo != null) {
                int i10 = a + 67;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    o00000oo.setListSelectionHidden(true);
                } else {
                    o00000oo.setListSelectionHidden(false);
                }
            }
        }
        int i11 = a;
        int i12 = i11 & 87;
        int i13 = ((i11 ^ 87) | i12) << 1;
        int i14 = -((i11 | 87) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        b = i3 % 128;
        int i4 = i3 % 2;
    }
}
