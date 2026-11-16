package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;

/* JADX INFO: loaded from: classes.dex */
public class T implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public T(CnicValidationActivity cnicValidationActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.c.dismiss();
            obj.hashCode();
            throw null;
        }
        this.c.dismiss();
        int i4 = a + 57;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
