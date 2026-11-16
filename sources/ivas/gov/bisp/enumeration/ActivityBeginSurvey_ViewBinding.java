package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityBeginSurvey_ViewBinding implements Unbinder {
    public ActivityBeginSurvey_ViewBinding(ActivityBeginSurvey activityBeginSurvey, View view) {
        activityBeginSurvey.buttonPrevious = (Button) u.b(u.c(view, R.id.button_previous, "field 'buttonPrevious'"), R.id.button_previous, "field 'buttonPrevious'", Button.class);
        activityBeginSurvey.buttonNext = (Button) u.b(u.c(view, R.id.button_next, "field 'buttonNext'"), R.id.button_next, "field 'buttonNext'", Button.class);
        activityBeginSurvey.buttonSubmit = (Button) u.b(u.c(view, R.id.button_submit, "field 'buttonSubmit'"), R.id.button_submit, "field 'buttonSubmit'", Button.class);
    }
}
