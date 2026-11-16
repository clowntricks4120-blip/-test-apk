package ivas.gov.bisp.enumeration.p049bv;

import android.view.View;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: loaded from: classes.dex */
public class e implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public e(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        ActivityEnumeratorMain activityEnumeratorMain = this.c;
        w wVar = new w(activityEnumeratorMain, activityEnumeratorMain.aj);
        int i2 = a;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            wVar.execute(new Void[1]);
        } else {
            wVar.execute(new Void[0]);
        }
        int i4 = b + 89;
        a = i4 % 128;
        int i5 = i4 % 2;
    }
}
