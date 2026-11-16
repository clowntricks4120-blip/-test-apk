package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.p038bk.bo;

/* JADX INFO: loaded from: classes.dex */
public class J implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ LinearLayout c;

    public J(BikeRegistryActivity bikeRegistryActivity, LinearLayout linearLayout) {
        this.c = linearLayout;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 119;
        int i5 = (i3 ^ 119) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            String str = ((bo) adapterView.getItemAtPosition(i)).c;
            throw null;
        }
        if (!((bo) adapterView.getItemAtPosition(i)).c.equals("Other")) {
            this.c.setVisibility(8);
            int i7 = b;
            int i8 = i7 & 87;
            int i9 = (i8 - (~(-(-((i7 ^ 87) | i8))))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = b;
        int i11 = (i10 & 27) + (i10 | 27);
        a = i11 % 128;
        int i12 = i11 % 2;
        this.c.setVisibility(0);
        int i13 = a;
        int i14 = i13 & 67;
        int i15 = -(-((i13 ^ 67) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-48)) | ((~i2) & 47)) + ((i2 & 47) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
    }
}
