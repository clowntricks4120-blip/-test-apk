package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityUnassignedSurvey_ViewBinding implements Unbinder {
    public ActivityUnassignedSurvey_ViewBinding(ActivityUnassignedSurvey activityUnassignedSurvey, View view) {
        activityUnassignedSurvey.textViewTotal = (TextView) u.b(u.c(view, R.id.tv_total, "field 'textViewTotal'"), R.id.tv_total, "field 'textViewTotal'", TextView.class);
        activityUnassignedSurvey.btnRecover = (Button) u.b(u.c(view, R.id.btn_recover, "field 'btnRecover'"), R.id.btn_recover, "field 'btnRecover'", Button.class);
        activityUnassignedSurvey.progressBarTotal = (ProgressBar) u.b(u.c(view, R.id.pv_total, "field 'progressBarTotal'"), R.id.pv_total, "field 'progressBarTotal'", ProgressBar.class);
    }
}
