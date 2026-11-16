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
public class ActivitySpotCheckUserNew_ViewBinding implements Unbinder {

    public class OooO00o extends t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivitySpotCheckUserNew c;

        public OooO00o(ActivitySpotCheckUserNew_ViewBinding activitySpotCheckUserNew_ViewBinding, ActivitySpotCheckUserNew activitySpotCheckUserNew) {
            this.c = activitySpotCheckUserNew;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 11;
            int i4 = ((i2 & 11) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            this.c.beginSurvey(view);
            if (i7 == 0) {
                int i8 = 52 / 0;
            }
        }
    }

    public ActivitySpotCheckUserNew_ViewBinding(ActivitySpotCheckUserNew activitySpotCheckUserNew, View view) {
        activitySpotCheckUserNew.mRecyclerView = (RecyclerView) u.b(u.c(view, R.id.my_recycler_view, "field 'mRecyclerView'"), R.id.my_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        activitySpotCheckUserNew.textViewTotalWaiting = (TextView) u.b(u.c(view, R.id.tv_total_waiting, "field 'textViewTotalWaiting'"), R.id.tv_total_waiting, "field 'textViewTotalWaiting'", TextView.class);
        activitySpotCheckUserNew.progressBarTotalWaiting = (ProgressBar) u.b(u.c(view, R.id.pv_total_waiting, "field 'progressBarTotalWaiting'"), R.id.pv_total_waiting, "field 'progressBarTotalWaiting'", ProgressBar.class);
        activitySpotCheckUserNew.textViewTotal = (TextView) u.b(u.c(view, R.id.tv_total, "field 'textViewTotal'"), R.id.tv_total, "field 'textViewTotal'", TextView.class);
        activitySpotCheckUserNew.progressBarTotal = (ProgressBar) u.b(u.c(view, R.id.pv_total, "field 'progressBarTotal'"), R.id.pv_total, "field 'progressBarTotal'", ProgressBar.class);
        u.c(view, R.id.fab_begin_survey, "method 'beginSurvey'").setOnClickListener(new OooO00o(this, activitySpotCheckUserNew));
    }
}
