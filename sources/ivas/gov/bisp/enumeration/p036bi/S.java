package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;

/* JADX INFO: loaded from: classes.dex */
public class S implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public S(CnicValidationActivity cnicValidationActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 111;
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.dismiss();
        int i7 = b;
        int i8 = i7 & 49;
        int i9 = (i8 - (~((i7 ^ 49) | i8))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
