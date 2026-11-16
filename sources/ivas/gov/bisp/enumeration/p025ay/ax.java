package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ax implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ aI f;
    public final /* synthetic */ String g;

    public ax(aI aIVar, RosterItem rosterItem, int i, String str, String str2) {
        this.f = aIVar;
        this.c = rosterItem;
        this.d = i;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = (i2 | 27) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.e = str;
            this.g = str2;
        } else {
            this.e = str;
            this.g = str2;
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Activity activity;
        int i = 2 % 2;
        Intent intent = new Intent(this.f.f, (Class<?>) UpdateRosterActivity.class);
        int i2 = b;
        int i3 = (i2 | 53) << 1;
        int i4 = -(((~i2) & 53) | (i2 & (-54)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        intent.putExtra("roster_data", this.c);
        int i7 = (-2) - ((b + 48) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        intent.putExtra("roster_index", this.d);
        int i9 = b;
        int i10 = ((i9 & (-82)) | ((~i9) & 81)) + ((i9 & 81) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            intent.putExtra("cnic_number", this.e);
            int i11 = 97 / 0;
        } else {
            intent.putExtra("cnic_number", this.e);
        }
        intent.putExtra("form_number", this.g);
        int i12 = b + 9;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            intent.putExtra("avtivity", BuildConfig.FLAVOR);
            activity = this.f.f;
            int i13 = 5 / 0;
        } else {
            intent.putExtra("avtivity", BuildConfig.FLAVOR);
            activity = this.f.f;
        }
        int i14 = a + 37;
        b = i14 % 128;
        int i15 = i14 % 2;
        activity.startActivity(intent);
        this.f.f.finish();
        int i16 = b;
        int i17 = i16 & 87;
        int i18 = (i16 | 87) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 & i19) + (i18 | i19);
        a = i20 % 128;
        int i21 = i20 % 2;
    }
}
