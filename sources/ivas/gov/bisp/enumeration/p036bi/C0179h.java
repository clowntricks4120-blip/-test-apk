package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import android.widget.AdapterView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.AddressActivity;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0179h implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AddressActivity c;

    public C0179h(AddressActivity addressActivity) {
        this.c = addressActivity;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 125;
        int i5 = (i3 | 125) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (i != 0) {
            AddressActivity addressActivity = this.c;
            addressActivity.aB = addressActivity.aH.getSelectedItem().toString();
            int i10 = b;
            int i11 = (i10 & 117) + (i10 | 117);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                this.c.aH.setBackgroundResource(R.drawable.spinner_bg_selected);
                return;
            } else {
                this.c.aH.setBackgroundResource(R.drawable.spinner_bg_selected);
                throw null;
            }
        }
        int i12 = i8 & 101;
        int i13 = ((i8 ^ 101) | i12) << 1;
        int i14 = -((i8 | 101) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        this.c.aH.setBackgroundResource(R.drawable.spinner_bg);
        AddressActivity addressActivity2 = this.c;
        int i17 = b;
        int i18 = i17 ^ 63;
        int i19 = ((i17 & 63) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        addressActivity2.aB = BuildConfig.FLAVOR;
        int i23 = a + 82;
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
    }
}
