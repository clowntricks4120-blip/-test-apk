package ivas.gov.bisp.enumeration.adapters;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ AdapterAgriMember d;

    public h(AdapterAgriMember adapterAgriMember, int i) {
        this.d = adapterAgriMember;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 73) << 1) - (((~i2) & 73) | (i2 & (-74)));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.d.h.onCheckBoxClick(this.c);
            throw null;
        }
        this.d.h.onCheckBoxClick(this.c);
        int i4 = a + 29;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
