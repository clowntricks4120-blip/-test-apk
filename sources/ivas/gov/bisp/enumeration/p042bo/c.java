package ivas.gov.bisp.enumeration.p042bo;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class c implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ NewFormNadraRoster c;

    public c(NewFormNadraRoster newFormNadraRoster) {
        this.c = newFormNadraRoster;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        NewFormNadraRoster newFormNadraRoster = this.c;
        w wVar = new w(newFormNadraRoster, newFormNadraRoster.am);
        int i3 = b;
        int i4 = i3 & 115;
        int i5 = i3 | 115;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        wVar.execute(new Void[0]);
        dialogInterface.cancel();
        int i8 = a;
        int i9 = i8 & 11;
        int i10 = (i8 | 11) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 8 / 0;
        }
    }
}
