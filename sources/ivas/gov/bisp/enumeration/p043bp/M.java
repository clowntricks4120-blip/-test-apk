package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityBeginSurvey d;

    public /* synthetic */ M(ActivityBeginSurvey activityBeginSurvey, int i) {
        this.c = i;
        this.d = activityBeginSurvey;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 71;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c;
        Object obj = null;
        if (i6 == 0) {
            ActivityBeginSurvey activityBeginSurvey = this.d;
            int i7 = ActivityBeginSurvey.af;
            activityBeginSurvey.finish();
            int i8 = b;
            int i9 = (i8 ^ 107) + ((i8 & 107) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i6 == 1) {
            ActivityBeginSurvey activityBeginSurvey2 = this.d;
            int i10 = ActivityBeginSurvey.af;
            activityBeginSurvey2.finish();
            int i11 = a;
            int i12 = i11 & 57;
            int i13 = (i11 | 57) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        if (i6 == 2) {
            ActivityBeginSurvey activityBeginSurvey3 = this.d;
            int i17 = ActivityBeginSurvey.af;
            activityBeginSurvey3.H();
            int i18 = b;
            int i19 = ((i18 & 33) - (~(i18 | 33))) - 1;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i20 = i3 & 113;
        int i21 = (i3 ^ 113) | i20;
        int i22 = (i20 & i21) + (i20 | i21);
        a = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((i3 | 92) << 1) - (i3 ^ 92);
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            ActivityBeginSurvey activityBeginSurvey4 = this.d;
            int i26 = ActivityBeginSurvey.af;
            activityBeginSurvey4.finish();
        } else {
            ActivityBeginSurvey activityBeginSurvey5 = this.d;
            int i27 = ActivityBeginSurvey.af;
            activityBeginSurvey5.finish();
            throw null;
        }
    }
}
