package ivas.gov.bisp.enumeration.p025ay;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0101av implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C0100at e;

    public ViewOnClickListenerC0101av(C0100at c0100at, RosterItem rosterItem, int i) {
        this.e = c0100at;
        this.c = rosterItem;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0100at c0100at;
        int i = 2 % 2;
        Intent intent = new Intent(this.e.f, (Class<?>) MaritalStatusActivity.class);
        int i2 = a + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        intent.putExtra("roster_data", this.c);
        int i4 = b;
        int i5 = i4 & 29;
        int i6 = ((i4 ^ 29) | i5) << 1;
        int i7 = -((i4 | 29) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            intent.putExtra("roster_index", this.d);
            obj.hashCode();
            throw null;
        }
        intent.putExtra("roster_index", this.d);
        int i9 = b;
        int i10 = i9 & 75;
        int i11 = i9 | 75;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            this.e.f.startActivity(intent);
            c0100at = this.e;
            int i13 = 40 / 0;
        } else {
            this.e.f.startActivity(intent);
            c0100at = this.e;
        }
        c0100at.f.finish();
        int i14 = b;
        int i15 = i14 ^ 59;
        int i16 = -(-((i14 & 59) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }
}
