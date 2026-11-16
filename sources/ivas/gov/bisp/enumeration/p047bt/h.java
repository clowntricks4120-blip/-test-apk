package ivas.gov.bisp.enumeration.p047bt;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class h implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ r d;

    public h(r rVar, RosterItem rosterItem) {
        this.d = rVar;
        this.c = rosterItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Intent intent = new Intent(this.d.f, (Class<?>) CnicActivity.class);
        int i2 = a + 61;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            intent.putExtra("roster_data", this.c);
            throw null;
        }
        intent.putExtra("roster_data", this.c);
        this.d.f.startActivity(intent);
        this.d.f.finish();
        int i3 = b + 67;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
