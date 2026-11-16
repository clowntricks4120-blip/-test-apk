package ivas.gov.bisp.enumeration.p088k;

import android.R;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c;
import ivas.gov.bisp.enumeration.p097r.P;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0314b implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final P c;
    public final /* synthetic */ c d;

    public ViewOnClickListenerC0314b(c cVar) {
        this.d = cVar;
        this.c = new P(cVar.b.getContext(), 0, R.id.home, 0, cVar.a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Window.Callback callback = this.d.l;
            throw null;
        }
        c cVar = this.d;
        Window.Callback callback2 = cVar.l;
        if (callback2 != null) {
            int i4 = a;
            int i5 = i4 & 5;
            int i6 = i5 + ((i4 ^ 5) | i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = cVar.n;
                throw null;
            }
            if (cVar.n) {
                int i7 = a;
                int i8 = i7 & 93;
                int i9 = -(-((i7 ^ 93) | i8));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                callback2.onMenuItemSelected(0, this.c);
                int i12 = b;
                int i13 = i12 & 95;
                int i14 = (i13 - (~((i12 ^ 95) | i13))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i12 & 103;
                int i17 = (i16 - (~((i12 ^ 103) | i16))) - 1;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = b;
        int i20 = ((i19 ^ 11) - (~((i19 & 11) << 1))) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
    }
}
