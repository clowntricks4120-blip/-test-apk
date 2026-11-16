package ivas.gov.bisp.enumeration.enumerator;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.t;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityEnumeratorMain_ViewBinding implements Unbinder {

    public class OooO00o extends t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityEnumeratorMain c;

        public OooO00o(ActivityEnumeratorMain_ViewBinding activityEnumeratorMain_ViewBinding, ActivityEnumeratorMain activityEnumeratorMain) {
            this.c = activityEnumeratorMain;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 123;
            int i4 = -(-(i2 | 123));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.syncAllData(view);
            int i7 = a;
            int i8 = i7 & 33;
            int i9 = i7 | 33;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public class OooO0O0 extends t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityEnumeratorMain c;

        public OooO0O0(ActivityEnumeratorMain_ViewBinding activityEnumeratorMain_ViewBinding, ActivityEnumeratorMain activityEnumeratorMain) {
            this.c = activityEnumeratorMain;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.beginSurvey(view);
            int i5 = a;
            int i6 = (i5 & 115) + (i5 | 115);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
        }
    }

    public ActivityEnumeratorMain_ViewBinding(ActivityEnumeratorMain activityEnumeratorMain, View view) {
        activityEnumeratorMain.textViewTotal = (TextView) u.b(u.c(view, R.id.tv_total, "field 'textViewTotal'"), R.id.tv_total, "field 'textViewTotal'", TextView.class);
        activityEnumeratorMain.textViewOfflineTotal = (TextView) u.b(u.c(view, R.id.tv_offline_total, "field 'textViewOfflineTotal'"), R.id.tv_offline_total, "field 'textViewOfflineTotal'", TextView.class);
        activityEnumeratorMain.textViewSent = (TextView) u.b(u.c(view, R.id.tv_total_sent, "field 'textViewSent'"), R.id.tv_total_sent, "field 'textViewSent'", TextView.class);
        activityEnumeratorMain.textViewOfflineSent = (TextView) u.b(u.c(view, R.id.tv_offline_total_sent, "field 'textViewOfflineSent'"), R.id.tv_offline_total_sent, "field 'textViewOfflineSent'", TextView.class);
        activityEnumeratorMain.textViewWaiting = (TextView) u.b(u.c(view, R.id.tv_total_waiting, "field 'textViewWaiting'"), R.id.tv_total_waiting, "field 'textViewWaiting'", TextView.class);
        activityEnumeratorMain.textViewOfflineWaiting = (TextView) u.b(u.c(view, R.id.tv_total_offline_waiting, "field 'textViewOfflineWaiting'"), R.id.tv_total_offline_waiting, "field 'textViewOfflineWaiting'", TextView.class);
        activityEnumeratorMain.tv_total_not_at_home = (TextView) u.b(u.c(view, R.id.tv_total_not_at_home, "field 'tv_total_not_at_home'"), R.id.tv_total_not_at_home, "field 'tv_total_not_at_home'", TextView.class);
        activityEnumeratorMain.progressBarTotal = (ProgressBar) u.b(u.c(view, R.id.pv_total, "field 'progressBarTotal'"), R.id.pv_total, "field 'progressBarTotal'", ProgressBar.class);
        activityEnumeratorMain.progressBarOfflineTotal = (ProgressBar) u.b(u.c(view, R.id.pv_offline_total, "field 'progressBarOfflineTotal'"), R.id.pv_offline_total, "field 'progressBarOfflineTotal'", ProgressBar.class);
        activityEnumeratorMain.progressBarTotalSent = (ProgressBar) u.b(u.c(view, R.id.pv_total_sent, "field 'progressBarTotalSent'"), R.id.pv_total_sent, "field 'progressBarTotalSent'", ProgressBar.class);
        activityEnumeratorMain.progressBarTotalOfflineSent = (ProgressBar) u.b(u.c(view, R.id.pv_offline_total_sent, "field 'progressBarTotalOfflineSent'"), R.id.pv_offline_total_sent, "field 'progressBarTotalOfflineSent'", ProgressBar.class);
        activityEnumeratorMain.progressBarTotalWaiting = (ProgressBar) u.b(u.c(view, R.id.pv_total_waiting, "field 'progressBarTotalWaiting'"), R.id.pv_total_waiting, "field 'progressBarTotalWaiting'", ProgressBar.class);
        activityEnumeratorMain.progressBarTotalOfflineWaiting = (ProgressBar) u.b(u.c(view, R.id.pv_total_offline_waiting, "field 'progressBarTotalOfflineWaiting'"), R.id.pv_total_offline_waiting, "field 'progressBarTotalOfflineWaiting'", ProgressBar.class);
        activityEnumeratorMain.actionSync = (ImageView) u.b(u.c(view, R.id.iv_refresh, "field 'actionSync'"), R.id.iv_refresh, "field 'actionSync'", ImageView.class);
        activityEnumeratorMain.actionInfo = (ImageView) u.b(u.c(view, R.id.iv_info, "field 'actionInfo'"), R.id.iv_info, "field 'actionInfo'", ImageView.class);
        activityEnumeratorMain.actionLogout = (ImageView) u.b(u.c(view, R.id.iv_logout, "field 'actionLogout'"), R.id.iv_logout, "field 'actionLogout'", ImageView.class);
        u.c(view, R.id.fab_sync, "method 'syncAllData'").setOnClickListener(new OooO00o(this, activityEnumeratorMain));
        u.c(view, R.id.fab_begin_survey, "method 'beginSurvey'").setOnClickListener(new OooO0O0(this, activityEnumeratorMain));
    }
}
