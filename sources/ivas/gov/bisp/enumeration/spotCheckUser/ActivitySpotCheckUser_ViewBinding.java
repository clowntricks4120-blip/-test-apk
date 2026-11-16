package ivas.gov.bisp.enumeration.spotCheckUser;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.t;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivitySpotCheckUser_ViewBinding implements Unbinder {

    public class OooO00o extends t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivitySpotCheckUser c;

        public OooO00o(ActivitySpotCheckUser_ViewBinding activitySpotCheckUser_ViewBinding, ActivitySpotCheckUser activitySpotCheckUser) {
            this.c = activitySpotCheckUser;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.beginSurvey(view);
            int i5 = b;
            int i6 = (i5 ^ 92) + ((i5 & 92) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 12 / 0;
            }
        }
    }

    public ActivitySpotCheckUser_ViewBinding(ActivitySpotCheckUser activitySpotCheckUser, View view) {
        activitySpotCheckUser.mRecyclerView = (RecyclerView) u.b(u.c(view, R.id.my_recycler_view, "field 'mRecyclerView'"), R.id.my_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        activitySpotCheckUser.textViewTotalWaiting = (TextView) u.b(u.c(view, R.id.tv_total_waiting, "field 'textViewTotalWaiting'"), R.id.tv_total_waiting, "field 'textViewTotalWaiting'", TextView.class);
        activitySpotCheckUser.progressBarTotalWaiting = (ProgressBar) u.b(u.c(view, R.id.pv_total_waiting, "field 'progressBarTotalWaiting'"), R.id.pv_total_waiting, "field 'progressBarTotalWaiting'", ProgressBar.class);
        activitySpotCheckUser.textViewTotal = (TextView) u.b(u.c(view, R.id.tv_total, "field 'textViewTotal'"), R.id.tv_total, "field 'textViewTotal'", TextView.class);
        activitySpotCheckUser.progressBarTotal = (ProgressBar) u.b(u.c(view, R.id.pv_total, "field 'progressBarTotal'"), R.id.pv_total, "field 'progressBarTotal'", ProgressBar.class);
        activitySpotCheckUser.textViewSnowball = (TextView) u.b(u.c(view, R.id.tv_snowball, "field 'textViewSnowball'"), R.id.tv_snowball, "field 'textViewSnowball'", TextView.class);
        activitySpotCheckUser.progressBarSnowball = (ProgressBar) u.b(u.c(view, R.id.pv_snowball, "field 'progressBarSnowball'"), R.id.pv_snowball, "field 'progressBarSnowball'", ProgressBar.class);
        activitySpotCheckUser.textViewSampling = (TextView) u.b(u.c(view, R.id.tv_sampling, "field 'textViewSampling'"), R.id.tv_sampling, "field 'textViewSampling'", TextView.class);
        activitySpotCheckUser.progressBarSampling = (ProgressBar) u.b(u.c(view, R.id.pv_sampling, "field 'progressBarSampling'"), R.id.pv_sampling, "field 'progressBarSampling'", ProgressBar.class);
        u.c(view, R.id.fab_begin_survey, "method 'beginSurvey'").setOnClickListener(new OooO00o(this, activitySpotCheckUser));
    }
}
