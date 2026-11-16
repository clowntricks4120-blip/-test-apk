package ivas.gov.bisp.enumeration.p025ay;

import android.view.View;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes.dex */
public class aL implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public aL(aT aTVar, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = ((i2 ^ 35) | i3) << 1;
        int i5 = -((i2 | 35) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.dismiss();
        int i8 = b;
        int i9 = i8 & 95;
        int i10 = -(-(i8 | 95));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
