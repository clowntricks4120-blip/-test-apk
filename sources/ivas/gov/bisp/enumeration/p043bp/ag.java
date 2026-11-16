package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ivas.gov.bisp.enumeration.SplashScreen;
import ivas.gov.bisp.enumeration.bX.P;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SplashScreen d;

    public /* synthetic */ ag(SplashScreen splashScreen, int i) {
        this.c = i;
        this.d = splashScreen;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 15) | (i3 & 15)) << 1) - ((i3 & (-16)) | ((~i3) & 15));
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c;
        Object obj = null;
        if (i6 != 0) {
            if (i6 != 1) {
                int i7 = ((i3 ^ 2) + ((i3 & 2) << 1)) - 1;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                int i10 = (i8 & 75) + (i8 | 75);
                a = i10 % 128;
                int i11 = i10 % 2;
                SplashScreen splashScreen = this.d;
                String[] strArr = SplashScreen.r;
                splashScreen.finish();
                int i12 = b;
                int i13 = ((i12 | 12) << 1) - (i12 ^ 12);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                return;
            }
            SplashScreen splashScreen2 = this.d;
            String[] strArr2 = SplashScreen.r;
            Objects.requireNonNull(splashScreen2);
            Intent intent = new Intent();
            int i15 = b;
            int i16 = i15 | 81;
            int i17 = i16 << 1;
            int i18 = -((~(i15 & 81)) & i16);
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                Uri.fromParts("package", splashScreen2.getPackageName(), null);
                obj.hashCode();
                throw null;
            }
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", splashScreen2.getPackageName(), null));
            int i20 = b;
            int i21 = i20 & 97;
            int i22 = i21 + ((i20 ^ 97) | i21);
            a = i22 % 128;
            int i23 = i22 % 2;
            splashScreen2.startActivityForResult(intent, 12345);
            int i24 = a;
            int i25 = i24 & 5;
            int i26 = i25 + ((i24 ^ 5) | i25);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                throw null;
            }
            return;
        }
        SplashScreen splashScreen3 = this.d;
        String[] strArr3 = SplashScreen.r;
        if (splashScreen3.v()) {
            int i27 = b + 37;
            a = i27 % 128;
            int i28 = i27 % 2;
            P.d.b("exception_type", "Application installed on Emulator");
            int i29 = b;
            int i30 = (i29 & 104) + (i29 | 104);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            a = i31 % 128;
            if (i31 % 2 == 0) {
                System.exit(1);
            } else {
                System.exit(0);
            }
            int i32 = a;
            int i33 = i32 & 33;
            int i34 = i33 + ((i32 ^ 33) | i33);
            b = i34 % 128;
            int i35 = i34 % 2;
            return;
        }
        String str = Build.TAGS;
        if (str != null) {
            int i36 = b;
            int i37 = (((i36 | 78) << 1) - (i36 ^ 78)) - 1;
            a = i37 % 128;
            int i38 = i37 % 2;
            if (str.contains("test-keys")) {
                int i39 = b;
                int i40 = i39 & 109;
                int i41 = ((i39 ^ 109) | i40) << 1;
                int i42 = -((i39 | 109) & (~i40));
                int i43 = (i41 & i42) + (i42 | i41);
                int i44 = i43 % 128;
                a = i44;
                int i45 = i43 % 2;
                int i46 = i44 & 53;
                int i47 = (((i44 ^ 53) | i46) << 1) - ((i44 | 53) & (~i46));
                b = i47 % 128;
                int i48 = i47 % 2;
                z = true;
            } else {
                int i49 = b;
                int i50 = i49 & 7;
                int i51 = ((((i49 ^ 7) | i50) << 1) - (~(-((i49 | 7) & (~i50))))) - 1;
                a = i51 % 128;
                int i52 = i51 % 2;
                z = false;
            }
        } else {
            int i410 = b;
            int i53 = i410 & 7;
            int i54 = ((((i410 ^ 7) | i53) << 1) - (~(-((i410 | 7) & (~i53))))) - 1;
            a = i54 % 128;
            int i55 = i54 % 2;
            z = false;
        }
        if (!z) {
            int i56 = b;
            int i57 = (i56 ^ 53) + ((i56 & 53) << 1);
            a = i57 % 128;
            if (i57 % 2 == 0) {
                SplashScreen.p();
                throw null;
            }
            if (!SplashScreen.p() && !SplashScreen.q()) {
                int i58 = b;
                int i59 = i58 & 25;
                int i60 = (i59 - (~(-(-((i58 ^ 25) | i59))))) - 1;
                a = i60 % 128;
                if (i60 % 2 != 0) {
                    splashScreen3.y();
                    return;
                } else {
                    splashScreen3.y();
                    obj.hashCode();
                    throw null;
                }
            }
        }
        P.d.b("exception_type", "Application installed on Rooted Device");
        System.exit(0);
        int i61 = b;
        int i62 = (i61 & 103) + (i61 | 103);
        a = i62 % 128;
        int i63 = i62 % 2;
    }
}
