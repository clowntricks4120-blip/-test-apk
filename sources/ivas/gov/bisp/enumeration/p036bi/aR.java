package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class aR implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterActivity c;

    public aR(UpdateRosterActivity updateRosterActivity) {
        this.c = updateRosterActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        UpdateRosterActivity updateRosterActivity = this.c;
        w wVar = new w(updateRosterActivity, updateRosterActivity.bg);
        int i3 = a;
        int i4 = (i3 ^ 7) + ((i3 & 7) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            wVar.execute(new Void[1]);
        } else {
            wVar.execute(new Void[0]);
        }
        dialogInterface.cancel();
    }
}
