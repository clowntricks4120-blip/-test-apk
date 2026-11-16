package ivas.gov.bisp.enumeration.p043bp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.fragments.FragmentRoster;
import ivas.gov.bisp.enumeration.p044bq.ag;
import ivas.gov.bisp.enumeration.p044bq.d;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityBeginSurvey d;

    public /* synthetic */ N(ActivityBeginSurvey activityBeginSurvey, int i) {
        this.c = i;
        this.d = activityBeginSurvey;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 97) + (i3 | 97);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.c;
        if (i7 == 0) {
            ActivityBeginSurvey activityBeginSurvey = this.d;
            int i8 = ActivityBeginSurvey.af;
            activityBeginSurvey.y();
            int i9 = b;
            int i10 = i9 ^ 5;
            int i11 = (i9 & 5) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 97 / 0;
                return;
            }
            return;
        }
        if (i7 == 1) {
            ActivityBeginSurvey activityBeginSurvey2 = this.d;
            int i14 = ActivityBeginSurvey.af;
            activityBeginSurvey2.finish();
            int i15 = a + 85;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 18 / 0;
                return;
            }
            return;
        }
        if (i7 == 2) {
            ActivityBeginSurvey activityBeginSurvey3 = this.d;
            int i17 = ActivityBeginSurvey.af;
            Objects.requireNonNull(activityBeginSurvey3);
            d dVar = new d(activityBeginSurvey3.ae, activityBeginSurvey3.aG, new C0203e(activityBeginSurvey3, 2));
            int i18 = b;
            int i19 = ((i18 | 33) << 1) - (i18 ^ 33);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                dVar.execute(new Void[1]);
            } else {
                dVar.execute(new Void[0]);
            }
            int i20 = a + 113;
            b = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        int i22 = i5 + 57;
        a = i22 % 128;
        int i23 = i22 % 2;
        ActivityBeginSurvey activityBeginSurvey4 = this.d;
        int i24 = ActivityBeginSurvey.af;
        Objects.requireNonNull(activityBeginSurvey4);
        int i25 = b;
        int i26 = i25 & 29;
        int i27 = -(-(i25 | 29));
        int i28 = (i26 & i27) + (i27 | i26);
        a = i28 % 128;
        int i29 = i28 % 2;
        if (SystemClock.elapsedRealtime() - activityBeginSurvey4.az >= 2000) {
            int i30 = b + 103;
            a = i30 % 128;
            int i31 = i30 % 2;
            activityBeginSurvey4.az = SystemClock.elapsedRealtime();
            try {
                FragmentManager fragmentManager = activityBeginSurvey4.getFragmentManager();
                int i32 = a;
                int i33 = (i32 & 45) + (i32 | 45);
                b = i33 % 128;
                if (i33 % 2 != 0) {
                    fragmentManager.findFragmentByTag("roster");
                    SessionManager sessionManager = activityBeginSurvey4.at;
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("roster");
                int i34 = activityBeginSurvey4.at.c.getInt("k_count", 0);
                int i35 = b;
                int i36 = i35 & 15;
                int i37 = ((i35 ^ 15) | i36) << 1;
                int i38 = -((~i36) & (i35 | 15));
                int i39 = (i37 & i38) + (i37 | i38);
                a = i39 % 128;
                int i40 = i39 % 2;
                if (fragmentFindFragmentByTag != null) {
                    int i41 = (-2) - (((i35 & 68) + (i35 | 68)) ^ (-1));
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    if (fragmentFindFragmentByTag instanceof FragmentRoster) {
                        int i43 = (((i35 | 80) << 1) - (i35 ^ 80)) - 1;
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        i34 = ((FragmentRoster) fragmentFindFragmentByTag).surveyCountWithoutCNIC;
                        int i45 = b;
                        int i46 = (i45 ^ 23) + ((i45 & 23) << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                }
                ag agVar = new ag(i34, activityBeginSurvey4.ae, activityBeginSurvey4.ac, activityBeginSurvey4.ax, activityBeginSurvey4.ai, activityBeginSurvey4.ak, activityBeginSurvey4.aG, activityBeginSurvey4.av, activityBeginSurvey4.aq, activityBeginSurvey4.getApplicationContext());
                int i48 = a;
                int i49 = i48 ^ 3;
                int i50 = ((i48 & 3) | i49) << 1;
                int i51 = -i49;
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                b = i52 % 128;
                int i53 = i52 % 2;
                agVar.execute(new Void[0]);
                int i54 = a;
                int i55 = i54 + 9;
                b = i55 % 128;
                int i56 = i55 % 2;
                int i57 = ((i54 | 123) << 1) - (i54 ^ 123);
                b = i57 % 128;
                int i58 = i57 % 2;
                return;
            } catch (Exception unused) {
                Toast.makeText(activityBeginSurvey4.getApplicationContext(), activityBeginSurvey4.getResources().getString(R.string.app_error), 1).show();
            }
        }
        int i59 = a;
        int i60 = i59 & 37;
        int i61 = -(-(i59 | 37));
        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
        b = i62 % 128;
        int i63 = i62 % 2;
    }
}
