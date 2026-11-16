package ivas.gov.bisp.enumeration.dd;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;

/* JADX INFO: loaded from: classes.dex */
public class J implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public J(CnicActivity cnicActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 28) + (i2 | 28);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.dismiss();
        int i6 = a;
        int i7 = (i6 & 25) + (i6 | 25);
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
