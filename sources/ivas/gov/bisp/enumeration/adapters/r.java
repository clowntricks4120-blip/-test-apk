package ivas.gov.bisp.enumeration.adapters;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdapterAgriMember d;

    public r(AdapterAgriMember adapterAgriMember, int i) {
        this.d = adapterAgriMember;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 90) + ((i2 & 90) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.h.onDetailButtonClick(this.c);
        } else {
            this.d.h.onDetailButtonClick(this.c);
            int i4 = 82 / 0;
        }
    }
}
