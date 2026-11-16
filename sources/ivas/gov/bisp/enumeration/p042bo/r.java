package ivas.gov.bisp.enumeration.p042bo;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class r implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ SelectHouseHoldActivity c;

    public r(SelectHouseHoldActivity selectHouseHoldActivity) {
        this.c = selectHouseHoldActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        SelectHouseHoldActivity selectHouseHoldActivity = this.c;
        w wVar = new w(selectHouseHoldActivity, selectHouseHoldActivity.ao);
        int i3 = b + 45;
        a = i3 % 128;
        int i4 = i3 % 2;
        wVar.execute(new Void[0]);
        dialogInterface.cancel();
        int i5 = a + 7;
        b = i5 % 128;
        int i6 = i5 % 2;
    }
}
