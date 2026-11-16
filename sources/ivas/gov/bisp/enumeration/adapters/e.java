package ivas.gov.bisp.enumeration.adapters;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.models.AgriResource;

/* JADX INFO: loaded from: classes.dex */
public class e implements AdapterView.OnItemSelectedListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdapterAgriResource d;

    public e(AdapterAgriResource adapterAgriResource, int i) {
        this.d = adapterAgriResource;
        this.c = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a + 5;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = ((i3 | 69) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        AgriResource agriResource = this.d.f.get(this.c);
        int i7 = a;
        int i8 = ((i7 & 25) - (~(-(-(i7 | 25))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        agriResource.setResourceOwnerPosition(i);
        int i10 = b;
        int i11 = i10 & 91;
        int i12 = i11 + ((i10 ^ 91) | i11);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 84 / 0;
        }
    }
}
