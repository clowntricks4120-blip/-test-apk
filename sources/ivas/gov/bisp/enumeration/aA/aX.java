package ivas.gov.bisp.enumeration.aA;

import android.app.Dialog;
import android.view.View;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class aX implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Dialog c;
    public final /* synthetic */ aK d;

    public aX(aK aKVar, Dialog dialog) {
        this.d = aKVar;
        this.c = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ActivityEnumeratorMain activityEnumeratorMain;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 125) << 1) - (((~i2) & 125) | (i2 & (-126)));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            activityEnumeratorMain = (ActivityEnumeratorMain) this.d.a;
            int i4 = 94 / 0;
        } else {
            activityEnumeratorMain = (ActivityEnumeratorMain) this.d.a;
        }
        int i5 = a;
        int i6 = i5 & 77;
        int i7 = i6 + ((i5 ^ 77) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        Objects.requireNonNull(activityEnumeratorMain);
        ag.g = false;
        activityEnumeratorMain.F();
        int i9 = a;
        int i10 = (-2) - (((i9 ^ 56) + ((i9 & 56) << 1)) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
        this.c.dismiss();
        if (i11 == 0) {
            int i12 = 56 / 0;
        }
    }
}
