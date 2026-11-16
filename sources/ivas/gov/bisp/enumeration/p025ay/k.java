package ivas.gov.bisp.enumeration.p025ay;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class k implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w e;

    public k(w wVar, RosterItem rosterItem, int i) {
        this.e = wVar;
        this.c = rosterItem;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Intent intent = new Intent(this.e.f, (Class<?>) DisabilityActivity.class);
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = -(-((i2 ^ 91) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            intent.putExtra("roster_data", this.c);
            int i6 = 50 / 0;
        } else {
            intent.putExtra("roster_data", this.c);
        }
        int i7 = b + 53;
        a = i7 % 128;
        int i8 = i7 % 2;
        intent.putExtra("roster_index", this.d);
        this.e.f.startActivity(intent);
        int i9 = b;
        int i10 = ((i9 ^ 119) | (i9 & 119)) << 1;
        int i11 = -(((~i9) & 119) | (i9 & (-120)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            this.e.f.finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.e.f.finish();
        int i13 = b;
        int i14 = (i13 & 51) + (i13 | 51);
        a = i14 % 128;
        int i15 = i14 % 2;
    }
}
