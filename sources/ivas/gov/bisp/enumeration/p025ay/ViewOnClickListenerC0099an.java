package ivas.gov.bisp.enumeration.p025ay;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ay.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0099an implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ f e;

    public ViewOnClickListenerC0099an(f fVar, RosterItem rosterItem, int i) {
        this.e = fVar;
        this.c = rosterItem;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Intent intent = new Intent(this.e.f, (Class<?>) DobActivity.class);
        int i2 = a;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        intent.putExtra("roster_data", this.c);
        int i5 = a;
        int i6 = i5 & 11;
        int i7 = (i6 - (~((i5 ^ 11) | i6))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        intent.putExtra("roster_index", this.d);
        int i9 = a;
        int i10 = i9 & 45;
        int i11 = (((i9 | 45) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        this.e.f.startActivity(intent);
        int i13 = a;
        int i14 = ((i13 ^ 51) - (~((i13 & 51) << 1))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            this.e.f.finish();
            return;
        }
        this.e.f.finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
