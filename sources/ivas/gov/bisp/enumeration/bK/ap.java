package ivas.gov.bisp.enumeration.bK;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class ap implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ w c;

    public ap(w wVar) {
        this.c = wVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        w wVar = this.c;
        int i3 = b;
        int i4 = (i3 | 103) << 1;
        int i5 = -(i3 ^ 103);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        wVar.c.startActivity(intent);
        int i8 = a;
        int i9 = (i8 & 125) + (i8 | 125);
        b = i9 % 128;
        int i10 = i9 % 2;
    }
}
