package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity_ViewBinding implements Unbinder {
    public MainActivity_ViewBinding(MainActivity mainActivity, View view) {
        mainActivity.textViewType = (TextView) u.b(u.c(view, R.id.tv_type, "field 'textViewType'"), R.id.tv_type, "field 'textViewType'", TextView.class);
        mainActivity.textViewVersion = (TextView) u.b(u.c(view, R.id.tv_version, "field 'textViewVersion'"), R.id.tv_version, "field 'textViewVersion'", TextView.class);
    }
}
