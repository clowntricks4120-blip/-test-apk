package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.SplashScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SplashScreen d;

    public /* synthetic */ ac(SplashScreen splashScreen, int i) {
        this.c = i;
        this.d = splashScreen;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 17;
        int i5 = (i3 | 17) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = this.c;
        Object obj = null;
        if (i10 == 0) {
            this.d.y.finish();
            int i11 = b;
            int i12 = i11 & 33;
            int i13 = (((i11 ^ 33) | i12) << 1) - ((i11 | 33) & (~i12));
            a = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i10 == 1) {
            this.d.y.finish();
            int i14 = a;
            int i15 = i14 & 97;
            int i16 = -(-((i14 ^ 97) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i18 = (i8 & 83) + (i8 | 83);
        int i19 = i18 % 128;
        a = i19;
        int i20 = i18 % 2;
        int i21 = (-2) - (((i19 & 88) + (i19 | 88)) ^ (-1));
        b = i21 % 128;
        if (i21 % 2 != 0) {
            SplashScreen splashScreen = this.d;
            String[] strArr = SplashScreen.r;
            splashScreen.finish();
            int i22 = 33 / 0;
        } else {
            SplashScreen splashScreen2 = this.d;
            String[] strArr2 = SplashScreen.r;
            splashScreen2.finish();
        }
        int i23 = a;
        int i24 = i23 & 33;
        int i25 = i24 + ((i23 ^ 33) | i24);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
