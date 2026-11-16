package ivas.gov.bisp.enumeration.p036bi;

import android.content.Intent;
import android.view.View;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0186o implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ BikeRegistryActivity c;

    public ViewOnClickListenerC0186o(BikeRegistryActivity bikeRegistryActivity) {
        this.c = bikeRegistryActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        OooO<Intent> oooO = this.c.P;
        int i2 = a;
        int i3 = (i2 & 110) + (i2 | 110);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        oooO.c(intent, null);
        int i6 = a;
        int i7 = i6 & 65;
        int i8 = ((i6 ^ 65) | i7) << 1;
        int i9 = -((i6 | 65) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
