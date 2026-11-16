package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R implements DialogInterface.OnClickListener {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0215v d;

    public /* synthetic */ R(C0215v c0215v, int i) {
        this.c = i;
        this.d = c0215v;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 117;
        int i5 = ((i3 & 117) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.c == 0) {
            ActivityBeginSurvey activityBeginSurvey = this.d.d;
            int i8 = ActivityBeginSurvey.af;
            activityBeginSurvey.y();
            int i9 = a;
            int i10 = ((i9 ^ 62) + ((i9 & 62) << 1)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 40 / 0;
                return;
            }
            return;
        }
        int i12 = i3 & 125;
        int i13 = ((i3 ^ 125) | i12) << 1;
        int i14 = -((i3 | 125) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        ActivityBeginSurvey activityBeginSurvey2 = this.d.d;
        int i17 = ActivityBeginSurvey.af;
        int i18 = a;
        int i19 = (i18 & 35) + (i18 | 35);
        b = i19 % 128;
        int i20 = i19 % 2;
        activityBeginSurvey2.y();
        if (i20 == 0) {
            throw null;
        }
    }
}
