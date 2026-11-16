package ivas.gov.bisp.enumeration.p048bu;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activitybase.BaseAuth;

/* JADX INFO: loaded from: classes.dex */
public class j implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public j(BaseAuth baseAuth, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 117;
        int i4 = ((i2 & 117) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.dismiss();
            throw null;
        }
        this.c.dismiss();
        int i7 = b;
        int i8 = ((i7 & 114) + (i7 | 114)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }
}
