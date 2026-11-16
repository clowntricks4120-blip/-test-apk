package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;

/* JADX INFO: loaded from: classes.dex */
public class aY implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public aY(UpdateRosterActivity updateRosterActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (i2 | 73) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.c.dismiss();
        int i8 = b;
        int i9 = (((i8 & (-100)) | ((~i8) & 99)) - (~(-(-((i8 & 99) << 1))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
