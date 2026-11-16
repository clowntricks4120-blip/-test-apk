package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivitySummary_ViewBinding implements Unbinder {

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivitySummary c;

        public OooO00o(ActivitySummary_ViewBinding activitySummary_ViewBinding, ActivitySummary activitySummary) {
            this.c = activitySummary;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 79;
            int i4 = ((i2 | 79) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                this.c.fromDate(view);
                int i5 = 47 / 0;
            } else {
                this.c.fromDate(view);
            }
            int i6 = b;
            int i7 = i6 & 17;
            int i8 = (i6 ^ 17) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public class OooO0O0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivitySummary c;

        public OooO0O0(ActivitySummary_ViewBinding activitySummary_ViewBinding, ActivitySummary activitySummary) {
            this.c = activitySummary;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b + 81;
            a = i2 % 128;
            int i3 = i2 % 2;
            this.c.toDate(view);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivitySummary c;

        public OooO0OO(ActivitySummary_ViewBinding activitySummary_ViewBinding, ActivitySummary activitySummary) {
            this.c = activitySummary;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 55;
            int i4 = (i3 << 1) - ((~(i2 & 55)) & i3);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                this.c.onSearchClick(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.c.onSearchClick(view);
            int i5 = a;
            int i6 = i5 & 105;
            int i7 = (((i5 ^ 105) | i6) << 1) - ((i5 | 105) & (~i6));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 47 / 0;
            }
        }
    }

    public ActivitySummary_ViewBinding(ActivitySummary activitySummary, View view) {
        View viewC = u.c(view, R.id.tv_from_date, "field 'textViewFromDate' and method 'fromDate'");
        activitySummary.textViewFromDate = (TextView) u.b(viewC, R.id.tv_from_date, "field 'textViewFromDate'", TextView.class);
        viewC.setOnClickListener(new OooO00o(this, activitySummary));
        View viewC2 = u.c(view, R.id.tv_to_date, "field 'textViewToDate' and method 'toDate'");
        activitySummary.textViewToDate = (TextView) u.b(viewC2, R.id.tv_to_date, "field 'textViewToDate'", TextView.class);
        viewC2.setOnClickListener(new OooO0O0(this, activitySummary));
        View viewC3 = u.c(view, R.id.btn_search, "field 'buttonSearch' and method 'onSearchClick'");
        activitySummary.buttonSearch = (Button) u.b(viewC3, R.id.btn_search, "field 'buttonSearch'", Button.class);
        viewC3.setOnClickListener(new OooO0OO(this, activitySummary));
        activitySummary.recyclerViewSummary = (RecyclerView) u.b(u.c(view, R.id.rv_summary, "field 'recyclerViewSummary'"), R.id.rv_summary, "field 'recyclerViewSummary'", RecyclerView.class);
        activitySummary.textViewNoSummary = (TextView) u.b(u.c(view, R.id.tv_no_summary, "field 'textViewNoSummary'"), R.id.tv_no_summary, "field 'textViewNoSummary'", TextView.class);
        activitySummary.linearLayoutSummary = (LinearLayout) u.b(u.c(view, R.id.ll_summary, "field 'linearLayoutSummary'"), R.id.ll_summary, "field 'linearLayoutSummary'", LinearLayout.class);
        activitySummary.textViewDate = (TextView) u.b(u.c(view, R.id.tv_date, "field 'textViewDate'"), R.id.tv_date, "field 'textViewDate'", TextView.class);
        activitySummary.textViewLocality = (TextView) u.b(u.c(view, R.id.tv_locality, "field 'textViewLocality'"), R.id.tv_locality, "field 'textViewLocality'", TextView.class);
        activitySummary.textViewTotalCount = (TextView) u.b(u.c(view, R.id.tv_total_count, "field 'textViewTotalCount'"), R.id.tv_total_count, "field 'textViewTotalCount'", TextView.class);
        activitySummary.textViewNotAtHomeCount = (TextView) u.b(u.c(view, R.id.tv_not_at_home_count, "field 'textViewNotAtHomeCount'"), R.id.tv_not_at_home_count, "field 'textViewNotAtHomeCount'", TextView.class);
        activitySummary.textViewDeclinedCount = (TextView) u.b(u.c(view, R.id.tv_declined_count, "field 'textViewDeclinedCount'"), R.id.tv_declined_count, "field 'textViewDeclinedCount'", TextView.class);
        activitySummary.textViewSupervisorTimeStamp = (TextView) u.b(u.c(view, R.id.tv_supervisor_time, "field 'textViewSupervisorTimeStamp'"), R.id.tv_supervisor_time, "field 'textViewSupervisorTimeStamp'", TextView.class);
    }
}
