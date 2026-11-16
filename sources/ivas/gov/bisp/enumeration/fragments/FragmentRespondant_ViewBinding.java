package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Spinner;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentRespondant_ViewBinding implements Unbinder {
    private static int a = 0;
    private static int b = 1;
    private FragmentRespondant target;

    public FragmentRespondant_ViewBinding(FragmentRespondant fragmentRespondant, View view) {
        this.target = fragmentRespondant;
        fragmentRespondant.spinnerRespondant = (Spinner) u.b(u.c(view, R.id.sp_respondant, "field 'spinnerRespondant'"), R.id.sp_respondant, "field 'spinnerRespondant'", Spinner.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        FragmentRespondant fragmentRespondant = this.target;
        if (fragmentRespondant == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i5 = (-2) - ((((i4 | 108) << 1) - (i4 ^ 108)) ^ (-1));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.target = null;
            fragmentRespondant.spinnerRespondant = null;
            throw null;
        }
        this.target = null;
        fragmentRespondant.spinnerRespondant = null;
        int i6 = a;
        int i7 = (i6 & (-62)) | ((~i6) & 61);
        int i8 = (i6 & 61) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }
}
