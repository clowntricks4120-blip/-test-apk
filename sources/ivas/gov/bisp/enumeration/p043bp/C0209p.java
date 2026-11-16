package ivas.gov.bisp.enumeration.p043bp;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0209p implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityAgriculture c;

    public C0209p(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 64) + ((i2 & 64) << 1)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 & 114) + (i3 | 114)) ^ (-1));
        b = i4 % 128;
        if (i4 % 2 != 0 ? i != 2 : i != 4) {
            if (i != 3) {
                int i5 = i3 ^ 97;
                int i6 = (((i3 & 97) | i5) << 1) - i5;
                b = i6 % 128;
                int i7 = i6 % 2;
                this.c.linearLayoutOtherLand.setVisibility(8);
                int i8 = a + 103;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.c.linearLayoutOtherLand.setVisibility(0);
        int i9 = a;
        int i10 = ((i9 & 85) - (~(i9 | 85))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
