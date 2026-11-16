package ivas.gov.bisp.enumeration.bJ;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUserNew;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivitySpotCheckUserNew d;

    public /* synthetic */ bv(ActivitySpotCheckUserNew activitySpotCheckUserNew, int i) {
        this.c = i;
        this.d = activitySpotCheckUserNew;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-56)) | ((~i3) & 55);
        int i5 = (i3 & 55) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.c == 0) {
            ActivitySpotCheckUserNew activitySpotCheckUserNew = this.d;
            int i8 = ActivitySpotCheckUserNew.af;
            activitySpotCheckUserNew.finish();
            int i9 = b;
            int i10 = (i9 ^ 9) + ((i9 & 9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        int i12 = ((i7 & 60) + (i7 | 60)) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i7 & 1;
        int i15 = ((i7 | 1) & (~i14)) + (i14 << 1);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            ActivitySpotCheckUserNew activitySpotCheckUserNew2 = this.d;
            int i16 = ActivitySpotCheckUserNew.af;
            activitySpotCheckUserNew2.finish();
        } else {
            ActivitySpotCheckUserNew activitySpotCheckUserNew3 = this.d;
            int i17 = ActivitySpotCheckUserNew.af;
            activitySpotCheckUserNew3.finish();
            throw null;
        }
    }
}
