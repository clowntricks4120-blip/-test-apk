package ivas.gov.bisp.enumeration.adapters;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.models.Crop;

/* JADX INFO: loaded from: classes.dex */
public class c implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdapterAgriCrop.ViewHolder d;

    public c(AdapterAgriCrop.ViewHolder viewHolder, int i) {
        this.d = viewHolder;
        this.c = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 68) << 1) - (i2 ^ 68)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 87) + (i3 | 87);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            Crop crop = AdapterAgriCrop.this.f.get(this.c);
            int i5 = b;
            int i6 = i5 & 103;
            int i7 = (((i5 | 103) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                crop.setLandUnitPosition(i);
                int i8 = 31 / 0;
            } else {
                crop.setLandUnitPosition(i);
            }
        }
        int i9 = b;
        int i10 = i9 & 19;
        int i11 = (i9 | 19) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
