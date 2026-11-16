package ivas.gov.bisp.enumeration.Q;

import android.view.View;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.Q.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0025t implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.datepicker.z c;
    public final /* synthetic */ com.google.android.material.datepicker.h d;

    public ViewOnClickListenerC0025t(com.google.android.material.datepicker.h hVar, com.google.android.material.datepicker.z zVar) {
        this.d = hVar;
        this.c = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iAW;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = ((((i2 ^ 125) | i3) << 1) - (~(-((i2 | 125) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            iAW = this.d.d().aW() % 0;
        } else {
            int iAW2 = this.d.d().aW();
            iAW = ((iAW2 | 1) << 1) - (iAW2 ^ 1);
        }
        if (iAW < this.d.j.getAdapter().b()) {
            int i5 = b;
            int i6 = i5 & 1;
            int i7 = (i5 ^ 1) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.d.g(this.c.h(iAW));
            int i10 = b;
            int i11 = i10 & 15;
            int i12 = (((i10 ^ 15) | i11) << 1) - ((i10 | 15) & (~i11));
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 % 5;
            }
        }
        int i14 = a;
        int i15 = i14 & 19;
        int i16 = -(-((i14 ^ 19) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
