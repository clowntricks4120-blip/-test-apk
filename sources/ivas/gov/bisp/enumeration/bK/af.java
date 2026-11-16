package ivas.gov.bisp.enumeration.bK;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster;
import ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity;
import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class af {
    private static int a = 0;
    private static int b = 1;

    public class bwY implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ SessionManager c;
        public final /* synthetic */ Activity d;

        public bwY(SessionManager sessionManager, Activity activity) {
            this.c = sessionManager;
            this.d = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            SessionManager sessionManager;
            SessionManager sessionManager2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 111;
            int i4 = (i2 | 111) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                this.c.S(BuildConfig.FLAVOR);
                sessionManager = this.c;
                int i7 = 87 / 0;
            } else {
                this.c.S(BuildConfig.FLAVOR);
                sessionManager = this.c;
            }
            int i8 = a;
            int i9 = i8 & 59;
            int i10 = ((((i8 ^ 59) | i9) << 1) - (~(-((i8 | 59) & (~i9))))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                sessionManager.Q(BuildConfig.FLAVOR);
                sessionManager2 = this.c;
                int i11 = 80 / 0;
            } else {
                sessionManager.Q(BuildConfig.FLAVOR);
                sessionManager2 = this.c;
            }
            sessionManager2.R(BuildConfig.FLAVOR);
            this.c.H(false);
            Activity activity = this.d;
            Intent intent = new Intent(this.d, (Class<?>) Authentication.class);
            int i12 = b;
            int i13 = ((i12 ^ 44) + ((i12 & 44) << 1)) - 1;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                activity.startActivity(intent);
                this.d.finish();
            } else {
                activity.startActivity(intent);
                this.d.finish();
                int i14 = 5 / 0;
            }
        }
    }

    public class bwZ implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SessionManager d;
        public final /* synthetic */ Activity e;

        public bwZ(boolean z, SessionManager sessionManager, Activity activity) {
            this.c = z;
            this.d = sessionManager;
            this.e = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 77) << 1) - (~(-((i3 & (-78)) | ((~i3) & 77))))) - 1;
            int i5 = i4 % 128;
            a = i5;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!(!this.c)) {
                this.d.S(BuildConfig.FLAVOR);
                SessionManager sessionManager = this.d;
                int i6 = b + 5;
                a = i6 % 128;
                int i7 = i6 % 2;
                sessionManager.Q(BuildConfig.FLAVOR);
                this.d.R(BuildConfig.FLAVOR);
                int i8 = a;
                int i9 = (i8 & 19) + (i8 | 19);
                b = i9 % 128;
                int i10 = i9 % 2;
                this.d.H(false);
                Activity activity = this.e;
                Intent intent = new Intent(this.e, (Class<?>) Authentication.class);
                int i11 = a + 111;
                b = i11 % 128;
                int i12 = i11 % 2;
                activity.startActivity(intent);
                this.e.finish();
                int i13 = b;
                int i14 = i13 | 39;
                int i15 = (i14 << 1) - ((~(i13 & 39)) & i14);
                a = i15 % 128;
                int i16 = i15 % 2;
            } else {
                Activity activity2 = this.e;
                if (activity2 instanceof NADRARosterListActivity) {
                    int i17 = i5 + 83;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    activity2.finish();
                    int i19 = a;
                    int i20 = i19 & 83;
                    int i21 = -(-((i19 ^ 83) | i20));
                    int i22 = (i20 & i21) + (i21 | i20);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                } else if (activity2 instanceof UpdateRosterListActivity) {
                    int i24 = i3 & 31;
                    int i25 = ((i3 ^ 31) | i24) << 1;
                    int i26 = -((i3 | 31) & (~i24));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        activity2.finish();
                        int i28 = 98 / 0;
                    } else {
                        activity2.finish();
                    }
                } else if (!(!(activity2 instanceof UpdateNadraRosterList))) {
                    int i29 = ((i5 ^ 73) | (i5 & 73)) << 1;
                    int i30 = -(((~i5) & 73) | (i5 & (-74)));
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    b = i31 % 128;
                    if (i31 % 2 != 0) {
                        activity2.finish();
                        obj.hashCode();
                        throw null;
                    }
                    activity2.finish();
                    int i32 = a;
                    int i33 = ((((i32 ^ 29) | (i32 & 29)) << 1) - (~(-(((~i32) & 29) | (i32 & (-30)))))) - 1;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                } else if (activity2 instanceof SelectHouseHoldActivity) {
                    int i35 = (-2) - ((i5 + 2) ^ (-1));
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    activity2.finish();
                    int i37 = a;
                    int i38 = i37 & 31;
                    int i39 = (((i37 | 31) & (~i38)) - (~(i38 << 1))) - 1;
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else if (activity2 instanceof NewFormNadraRoster) {
                    int i41 = i5 & 121;
                    int i42 = ((i5 ^ 121) | i41) << 1;
                    int i43 = -((i5 | 121) & (~i41));
                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                    b = i44 % 128;
                    if (i44 % 2 != 0) {
                        activity2.finish();
                        throw null;
                    }
                    activity2.finish();
                } else if (activity2 instanceof UpdateElectricityGassRefActivity) {
                    int i45 = (i5 ^ 63) + ((i5 & 63) << 1);
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        activity2.finish();
                        int i46 = 92 / 0;
                    } else {
                        activity2.finish();
                    }
                }
            }
            dialogInterface.cancel();
            int i47 = a;
            int i48 = (i47 & 75) + (i47 | 75);
            b = i48 % 128;
            int i49 = i48 % 2;
        }
    }

    public static void b(Activity activity, String str, boolean z) {
        int i = 2 % 2;
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setCancelable(true);
            SessionManager sessionManager = new SessionManager(activity);
            int i2 = a;
            int i3 = i2 ^ 29;
            int i4 = -(-((i2 & 29) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (z) {
                Handler handler = new Handler(Looper.getMainLooper());
                bwY bwy = new bwY(sessionManager, activity);
                int i7 = a;
                int i8 = ((i7 & (-108)) | ((~i7) & 107)) + ((i7 & 107) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                handler.postDelayed(bwy, 3000L);
                int i10 = b;
                int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            bwZ bwz = new bwZ(z, sessionManager, activity);
            int i13 = a;
            int i14 = ((i13 | 75) << 1) - (i13 ^ 75);
            b = i14 % 128;
            int i15 = i14 % 2;
            builder.setPositiveButton("Ok", bwz);
            builder.create().show();
            int i16 = b;
            int i17 = i16 & 119;
            int i18 = (i17 - (~((i16 ^ 119) | i17))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
        } catch (Exception unused) {
        }
    }
}
