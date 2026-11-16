package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.UpdateSplittingRosterListActivity;

/* JADX INFO: loaded from: classes.dex */
public class aU implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public aU(UpdateSplittingRosterListActivity updateSplittingRosterListActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.dismiss();
        if (i6 == 0) {
            int i7 = 57 / 0;
        }
    }
}
