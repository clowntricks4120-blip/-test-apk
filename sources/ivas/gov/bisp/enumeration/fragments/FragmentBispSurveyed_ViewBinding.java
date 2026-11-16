package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentBispSurveyed_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentBispSurveyed target;

    public FragmentBispSurveyed_ViewBinding(FragmentBispSurveyed fragmentBispSurveyed, View view) {
        this.target = fragmentBispSurveyed;
        fragmentBispSurveyed.linearLayoutBispSurveyed = (LinearLayout) u.b(u.c(view, R.id.ll_bisp_surveyed, "field 'linearLayoutBispSurveyed'"), R.id.ll_bisp_surveyed, "field 'linearLayoutBispSurveyed'", LinearLayout.class);
        fragmentBispSurveyed.linearLayoutQ2 = (LinearLayout) u.b(u.c(view, R.id.ll_q2, "field 'linearLayoutQ2'"), R.id.ll_q2, "field 'linearLayoutQ2'", LinearLayout.class);
        fragmentBispSurveyed.linearLayoutQ3 = (LinearLayout) u.b(u.c(view, R.id.ll_q3, "field 'linearLayoutQ3'"), R.id.ll_q3, "field 'linearLayoutQ3'", LinearLayout.class);
        fragmentBispSurveyed.radioGroupQuestion1 = (RadioGroup) u.b(u.c(view, R.id.rg_question1, "field 'radioGroupQuestion1'"), R.id.rg_question1, "field 'radioGroupQuestion1'", RadioGroup.class);
        fragmentBispSurveyed.radioButtonQuestion1Op1 = (RadioButton) u.b(u.c(view, R.id.rg_q1_yes, "field 'radioButtonQuestion1Op1'"), R.id.rg_q1_yes, "field 'radioButtonQuestion1Op1'", RadioButton.class);
        fragmentBispSurveyed.radioButtonQuestion1Op2 = (RadioButton) u.b(u.c(view, R.id.rg_q1_no, "field 'radioButtonQuestion1Op2'"), R.id.rg_q1_no, "field 'radioButtonQuestion1Op2'", RadioButton.class);
        fragmentBispSurveyed.spReasonLeftOut = (Spinner) u.b(u.c(view, R.id.sp_reason_left_out, "field 'spReasonLeftOut'"), R.id.sp_reason_left_out, "field 'spReasonLeftOut'", Spinner.class);
        fragmentBispSurveyed.radioGroupQuestion3 = (RadioGroup) u.b(u.c(view, R.id.rg_question3, "field 'radioGroupQuestion3'"), R.id.rg_question3, "field 'radioGroupQuestion3'", RadioGroup.class);
        fragmentBispSurveyed.radioButtonQuestion3Op1 = (RadioButton) u.b(u.c(view, R.id.rg_q3_op1, "field 'radioButtonQuestion3Op1'"), R.id.rg_q3_op1, "field 'radioButtonQuestion3Op1'", RadioButton.class);
        fragmentBispSurveyed.radioButtonQuestion3Op2 = (RadioButton) u.b(u.c(view, R.id.rg_q3_op2, "field 'radioButtonQuestion3Op2'"), R.id.rg_q3_op2, "field 'radioButtonQuestion3Op2'", RadioButton.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = a + 105;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        FragmentBispSurveyed fragmentBispSurveyed = this.target;
        if (fragmentBispSurveyed == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i5 = i3 & 75;
        int i6 = i3 | 75;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.target = null;
        fragmentBispSurveyed.linearLayoutBispSurveyed = null;
        fragmentBispSurveyed.linearLayoutQ2 = null;
        int i9 = (-2) - ((b + 50) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            fragmentBispSurveyed.linearLayoutQ3 = null;
            fragmentBispSurveyed.radioGroupQuestion1 = null;
            fragmentBispSurveyed.radioButtonQuestion1Op1 = null;
            int i10 = 69 / 0;
        } else {
            fragmentBispSurveyed.linearLayoutQ3 = null;
            fragmentBispSurveyed.radioGroupQuestion1 = null;
            fragmentBispSurveyed.radioButtonQuestion1Op1 = null;
        }
        fragmentBispSurveyed.radioButtonQuestion1Op2 = null;
        fragmentBispSurveyed.spReasonLeftOut = null;
        fragmentBispSurveyed.radioGroupQuestion3 = null;
        fragmentBispSurveyed.radioButtonQuestion3Op1 = null;
        int i11 = b + 55;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            fragmentBispSurveyed.radioButtonQuestion3Op2 = null;
        } else {
            fragmentBispSurveyed.radioButtonQuestion3Op2 = null;
            int i12 = 38 / 0;
        }
    }
}
