package ivas.gov.bisp.enumeration.p051bx;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class N implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ RosterItem d;
    public final /* synthetic */ int e;
    public final /* synthetic */ C0229m f;
    public final /* synthetic */ String g;

    public N(C0229m c0229m, String str, RosterItem rosterItem, int i, String str2) {
        this.f = c0229m;
        this.c = str;
        this.d = rosterItem;
        this.e = i;
        this.g = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a + 61;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Activity activity = this.f.f;
            Activity activity2 = this.f.f;
            throw null;
        }
        Activity activity3 = this.f.f;
        Intent intent = new Intent(this.f.f, (Class<?>) DiscrepancyActivity.class);
        int i3 = a;
        int i4 = (i3 | 75) << 1;
        int i5 = -(i3 ^ 75);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        intent.putExtra("roster_data", this.d);
        int i8 = this.e;
        int i9 = b;
        int i10 = (((i9 | 98) << 1) - (i9 ^ 98)) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            intent.putExtra("roster_index", i8);
            intent.putExtra("cnic_number", this.c);
            throw null;
        }
        intent.putExtra("roster_index", i8);
        intent.putExtra("cnic_number", this.c);
        int i11 = a;
        int i12 = (i11 | 51) << 1;
        int i13 = -(((~i11) & 51) | (i11 & (-52)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            intent.putExtra("form_number", this.g);
            throw null;
        }
        intent.putExtra("form_number", this.g);
        C0229m c0229m = this.f;
        int i15 = b;
        int i16 = ((i15 ^ 37) | (i15 & 37)) << 1;
        int i17 = -(((~i15) & 37) | (i15 & (-38)));
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            c0229m.f.startActivity(intent);
            Activity activity4 = this.f.f;
            throw null;
        }
        c0229m.f.startActivity(intent);
        this.f.f.finish();
        int i19 = b;
        int i20 = i19 & 55;
        int i21 = ((i19 ^ 55) | i20) << 1;
        int i22 = -((i19 | 55) & (~i20));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
