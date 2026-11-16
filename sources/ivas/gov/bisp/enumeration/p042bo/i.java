package ivas.gov.bisp.enumeration.p042bo;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class i implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateNadraRosterList c;

    public i(UpdateNadraRosterList updateNadraRosterList) {
        this.c = updateNadraRosterList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        UpdateNadraRosterList updateNadraRosterList = this.c;
        w wVar = new w(updateNadraRosterList, updateNadraRosterList.ag);
        int i3 = a;
        int i4 = i3 ^ 99;
        int i5 = ((i3 & 99) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        wVar.execute(new Void[0]);
        dialogInterface.cancel();
        int i9 = b;
        int i10 = (i9 & 67) + (i9 | 67);
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
