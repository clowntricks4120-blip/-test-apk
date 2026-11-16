package ivas.gov.bisp.enumeration.bJ;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bu implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivitySpotCheckUser d;

    public /* synthetic */ bu(ActivitySpotCheckUser activitySpotCheckUser, int i) {
        this.c = i;
        this.d = activitySpotCheckUser;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 54;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.c == 0) {
            ActivitySpotCheckUser activitySpotCheckUser = this.d;
            int i7 = ActivitySpotCheckUser.af;
            activitySpotCheckUser.finish();
            int i8 = b;
            int i9 = ((i8 & 17) - (~(-(-(i8 | 17))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int i11 = i3 & 115;
        int i12 = ((((i3 ^ 115) | i11) << 1) - (~(-((i3 | 115) & (~i11))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        ActivitySpotCheckUser activitySpotCheckUser2 = this.d;
        int i14 = ActivitySpotCheckUser.af;
        Objects.requireNonNull(activitySpotCheckUser2);
        dialogInterface.dismiss();
        int i15 = b;
        int i16 = (i15 & 120) + (i15 | 120);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        activitySpotCheckUser2.finish();
        if (i18 != 0) {
            int i19 = 73 / 0;
        }
        int i20 = a;
        int i21 = ((i20 ^ 124) + ((i20 & 124) << 1)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
    }
}
