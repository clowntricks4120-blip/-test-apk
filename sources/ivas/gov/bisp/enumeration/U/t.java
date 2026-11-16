package ivas.gov.bisp.enumeration.U;

import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class t implements AutoCompleteTextView.OnDismissListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ com.google.android.material.textfield.c c;

    public t(com.google.android.material.textfield.c cVar) {
        this.c = cVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-76)) | ((~i2) & 75)) - (~(-(-((i2 & 75) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        com.google.android.material.textfield.c cVar = this.c;
        cVar.j = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = a;
        int i6 = i5 & 3;
        int i7 = -(-((i5 ^ 3) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            cVar.l = jCurrentTimeMillis;
        } else {
            cVar.l = jCurrentTimeMillis;
        }
        com.google.android.material.textfield.c.f(this.c, false);
        int i9 = b;
        int i10 = i9 ^ 45;
        int i11 = ((i9 & 45) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 25 / 0;
        }
    }
}
