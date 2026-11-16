package ivas.gov.bisp.enumeration.p025ay;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class as implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aq e;

    public as(aq aqVar, RosterItem rosterItem, int i) {
        this.e = aqVar;
        this.c = rosterItem;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Intent intent = new Intent(this.e.f, (Class<?>) GenderActivity.class);
        int i2 = b;
        int i3 = i2 ^ 49;
        int i4 = ((i2 & 49) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        intent.putExtra("roster_data", this.c);
        if (i7 == 0) {
            int i8 = 68 / 0;
        }
        int i9 = b;
        int i10 = ((i9 ^ 13) | (i9 & 13)) << 1;
        int i11 = -(((~i9) & 13) | (i9 & (-14)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            intent.putExtra("roster_index", this.d);
            int i13 = 32 / 0;
        } else {
            intent.putExtra("roster_index", this.d);
        }
        this.e.f.startActivity(intent);
        int i14 = a;
        int i15 = ((i14 | 71) << 1) - (i14 ^ 71);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            this.e.f.finish();
            int i16 = 78 / 0;
        } else {
            this.e.f.finish();
        }
        int i17 = b;
        int i18 = i17 & 49;
        int i19 = (i17 | 49) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        int i22 = i21 % 2;
    }
}
