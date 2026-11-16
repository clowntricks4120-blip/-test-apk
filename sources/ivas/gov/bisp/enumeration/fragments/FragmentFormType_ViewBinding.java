package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFormType_ViewBinding implements Unbinder {
    private static int a = 0;
    private static int b = 1;
    private FragmentFormType target;

    public FragmentFormType_ViewBinding(FragmentFormType fragmentFormType, View view) {
        this.target = fragmentFormType;
        fragmentFormType.radioGroupType = (RadioGroup) u.b(u.c(view, R.id.rg_type, "field 'radioGroupType'"), R.id.rg_type, "field 'radioGroupType'", RadioGroup.class);
        fragmentFormType.radioButtonSampling = (RadioButton) u.b(u.c(view, R.id.rb_sampling, "field 'radioButtonSampling'"), R.id.rb_sampling, "field 'radioButtonSampling'", RadioButton.class);
        fragmentFormType.radioButtonMonitoring = (RadioButton) u.b(u.c(view, R.id.rb_monitoring, "field 'radioButtonMonitoring'"), R.id.rb_monitoring, "field 'radioButtonMonitoring'", RadioButton.class);
        fragmentFormType.linearLayoutSnowballType = (LinearLayout) u.b(u.c(view, R.id.ll_snowball_type, "field 'linearLayoutSnowballType'"), R.id.ll_snowball_type, "field 'linearLayoutSnowballType'", LinearLayout.class);
        fragmentFormType.radioGroupOptions = (RadioGroup) u.b(u.c(view, R.id.rg_options, "field 'radioGroupOptions'"), R.id.rg_options, "field 'radioGroupOptions'", RadioGroup.class);
        fragmentFormType.radioButtonLeft = (RadioButton) u.b(u.c(view, R.id.rb_left, "field 'radioButtonLeft'"), R.id.rb_left, "field 'radioButtonLeft'", RadioButton.class);
        fragmentFormType.radioButtonRight = (RadioButton) u.b(u.c(view, R.id.rb_right, "field 'radioButtonRight'"), R.id.rb_right, "field 'radioButtonRight'", RadioButton.class);
        fragmentFormType.radioButtonNearest = (RadioButton) u.b(u.c(view, R.id.rb_nearest, "field 'radioButtonNearest'"), R.id.rb_nearest, "field 'radioButtonNearest'", RadioButton.class);
        fragmentFormType.radioButtonFresh = (RadioButton) u.b(u.c(view, R.id.rb_fresh, "field 'radioButtonFresh'"), R.id.rb_fresh, "field 'radioButtonFresh'", RadioButton.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (~i3) & (i2 | 3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        FragmentFormType fragmentFormType = this.target;
        if (fragmentFormType == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i8 = (i2 & 71) + (i2 | 71);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.target = null;
            fragmentFormType.radioGroupType = null;
            fragmentFormType.radioButtonSampling = null;
            throw null;
        }
        this.target = null;
        fragmentFormType.radioGroupType = null;
        fragmentFormType.radioButtonSampling = null;
        fragmentFormType.radioButtonMonitoring = null;
        fragmentFormType.linearLayoutSnowballType = null;
        fragmentFormType.radioGroupOptions = null;
        int i9 = b;
        int i10 = i9 & 81;
        int i11 = ((i9 | 81) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            fragmentFormType.radioButtonLeft = null;
            fragmentFormType.radioButtonRight = null;
            fragmentFormType.radioButtonNearest = null;
            obj.hashCode();
            throw null;
        }
        fragmentFormType.radioButtonLeft = null;
        fragmentFormType.radioButtonRight = null;
        fragmentFormType.radioButtonNearest = null;
        fragmentFormType.radioButtonFresh = null;
        int i12 = a;
        int i13 = (((i12 & (-44)) | ((~i12) & 43)) - (~(-(-((i12 & 43) << 1))))) - 1;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }
}
