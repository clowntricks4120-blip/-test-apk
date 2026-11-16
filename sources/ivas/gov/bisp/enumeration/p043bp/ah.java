package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.SplashScreen;

/* JADX INFO: loaded from: classes.dex */
public class ah implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ SplashScreen c;

    public ah(SplashScreen splashScreen) {
        this.c = splashScreen;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 79) + ((i3 & 79) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            SplashScreen splashScreen = this.c;
            String[] strArr = SplashScreen.r;
            splashScreen.t();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SplashScreen splashScreen2 = this.c;
        String[] strArr2 = SplashScreen.r;
        splashScreen2.t();
        int i5 = b;
        int i6 = (i5 & 83) + (i5 | 83);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
    }
}
