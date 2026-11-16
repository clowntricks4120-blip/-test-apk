package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class H implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ NADRARosterListActivity c;

    public H(NADRARosterListActivity nADRARosterListActivity) {
        this.c = nADRARosterListActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        NADRARosterListActivity nADRARosterListActivity = this.c;
        w wVar = new w(nADRARosterListActivity, nADRARosterListActivity.ak);
        int i3 = a;
        int i4 = ((i3 & 118) + (i3 | 118)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        wVar.execute(new Void[0]);
        dialogInterface.cancel();
        int i6 = a + 71;
        b = i6 % 128;
        int i7 = i6 % 2;
    }
}
