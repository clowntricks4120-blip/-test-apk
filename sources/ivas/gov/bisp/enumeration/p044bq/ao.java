package ivas.gov.bisp.enumeration.p044bq;

import android.app.AlertDialog;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ao implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ar c;

    public ao(ar arVar) {
        this.c = arVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 69) - (~(i2 | 69))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        AlertDialog alertDialog = this.c.g;
        if (alertDialog != null) {
            int i5 = a;
            int i6 = i5 & 25;
            int i7 = (((i5 ^ 25) | i6) << 1) - ((i5 | 25) & (~i6));
            b = i7 % 128;
            if (i7 % 2 != 0) {
                alertDialog.isShowing();
                throw null;
            }
            if (alertDialog.isShowing()) {
                int i8 = a;
                int i9 = i8 & 121;
                int i10 = (i9 - (~((i8 ^ 121) | i9))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                this.c.g.dismiss();
                int i12 = b;
                int i13 = i12 | 111;
                int i14 = i13 << 1;
                int i15 = -((~(i12 & 111)) & i13);
                int i16 = (i14 & i15) + (i15 | i14);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        ar arVar = this.c;
        f fVar = new f(arVar.e, arVar.i, true, BuildConfig.FLAVOR, BuildConfig.FLAVOR, arVar.h);
        int i18 = b;
        int i19 = ((i18 | 39) << 1) - (i18 ^ 39);
        a = i19 % 128;
        int i20 = i19 % 2;
        fVar.execute(new Void[0]);
        int i21 = b;
        int i22 = i21 & 1;
        int i23 = i22 + ((1 ^ i21) | i22);
        a = i23 % 128;
        int i24 = i23 % 2;
    }
}
