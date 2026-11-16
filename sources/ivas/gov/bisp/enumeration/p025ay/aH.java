package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class aH implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ aT f;
    public final /* synthetic */ String g;

    public aH(aT aTVar, RosterItem rosterItem, int i, String str, String str2) {
        this.f = aTVar;
        this.c = rosterItem;
        this.d = i;
        this.e = str;
        this.g = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int i = 2 % 2;
        Intent intent = new Intent(this.f.f, (Class<?>) UpdateRosterActivity.class);
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (i2 | 73) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        intent.putExtra("roster_data", this.c);
        int i8 = a + 9;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            intent.putExtra("roster_index", this.d);
            str = this.e;
            int i9 = 27 / 0;
        } else {
            intent.putExtra("roster_index", this.d);
            str = this.e;
        }
        int i10 = a;
        int i11 = ((i10 & (-92)) | ((~i10) & 91)) + ((i10 & 91) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            intent.putExtra("cnic_number", str);
            intent.putExtra("form_number", this.g);
            int i12 = 15 / 0;
        } else {
            intent.putExtra("cnic_number", str);
            intent.putExtra("form_number", this.g);
        }
        intent.putExtra("avtivity", "splitting");
        aT aTVar = this.f;
        int i13 = b + 101;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            aTVar.f.startActivity(intent);
            Activity activity = this.f.f;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        aTVar.f.startActivity(intent);
        Activity activity2 = this.f.f;
        int i14 = a;
        int i15 = i14 & 47;
        int i16 = -(-((i14 ^ 47) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        activity2.finish();
        int i19 = a;
        int i20 = i19 & 33;
        int i21 = ((i19 | 33) & (~i20)) + (i20 << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
    }
}
