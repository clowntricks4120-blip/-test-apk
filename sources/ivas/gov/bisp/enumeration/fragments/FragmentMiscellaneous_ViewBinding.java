package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentMiscellaneous_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentMiscellaneous target;

    public FragmentMiscellaneous_ViewBinding(FragmentMiscellaneous fragmentMiscellaneous, View view) {
        this.target = fragmentMiscellaneous;
        fragmentMiscellaneous.sp_levelSatisfaction = (Spinner) u.b(u.c(view, R.id.sp_levelSatisfaction, "field 'sp_levelSatisfaction'"), R.id.sp_levelSatisfaction, "field 'sp_levelSatisfaction'", Spinner.class);
        fragmentMiscellaneous.sp_resolveComplaint = (Spinner) u.b(u.c(view, R.id.sp_resolveComplaint, "field 'sp_resolveComplaint'"), R.id.sp_resolveComplaint, "field 'sp_resolveComplaint'", Spinner.class);
        fragmentMiscellaneous.sp_resolveComplaintGovt = (Spinner) u.b(u.c(view, R.id.sp_resolveComplaint_govt, "field 'sp_resolveComplaintGovt'"), R.id.sp_resolveComplaint_govt, "field 'sp_resolveComplaintGovt'", Spinner.class);
        fragmentMiscellaneous.sp_loan = (Spinner) u.b(u.c(view, R.id.sp_loan, "field 'sp_loan'"), R.id.sp_loan, "field 'sp_loan'", Spinner.class);
        fragmentMiscellaneous.sp_monthly_income = (Spinner) u.b(u.c(view, R.id.sp_monthly_income, "field 'sp_monthly_income'"), R.id.sp_monthly_income, "field 'sp_monthly_income'", Spinner.class);
        fragmentMiscellaneous.radioGroupDefenseJob = (RadioGroup) u.b(u.c(view, R.id.rg_defense_job, "field 'radioGroupDefenseJob'"), R.id.rg_defense_job, "field 'radioGroupDefenseJob'", RadioGroup.class);
        fragmentMiscellaneous.radioButtonDefenceYes = (RadioButton) u.b(u.c(view, R.id.rb_defense_job_yes, "field 'radioButtonDefenceYes'"), R.id.rb_defense_job_yes, "field 'radioButtonDefenceYes'", RadioButton.class);
        fragmentMiscellaneous.radioButtonDefenceNo = (RadioButton) u.b(u.c(view, R.id.rb_defense_job_no, "field 'radioButtonDefenceNo'"), R.id.rb_defense_job_no, "field 'radioButtonDefenceNo'", RadioButton.class);
        fragmentMiscellaneous.radioGroupinfantDeath = (RadioGroup) u.b(u.c(view, R.id.rg_infantDeath, "field 'radioGroupinfantDeath'"), R.id.rg_infantDeath, "field 'radioGroupinfantDeath'", RadioGroup.class);
        fragmentMiscellaneous.radioGroupinfantBirth = (RadioGroup) u.b(u.c(view, R.id.rg_infantBirth, "field 'radioGroupinfantBirth'"), R.id.rg_infantBirth, "field 'radioGroupinfantBirth'", RadioGroup.class);
        fragmentMiscellaneous.radioButtoninfantDeath_yes = (RadioButton) u.b(u.c(view, R.id.rb_infantDeath_yes, "field 'radioButtoninfantDeath_yes'"), R.id.rb_infantDeath_yes, "field 'radioButtoninfantDeath_yes'", RadioButton.class);
        fragmentMiscellaneous.radioButtoninfantDeath_no = (RadioButton) u.b(u.c(view, R.id.rb_infantDeath_no, "field 'radioButtoninfantDeath_no'"), R.id.rb_infantDeath_no, "field 'radioButtoninfantDeath_no'", RadioButton.class);
        fragmentMiscellaneous.radioGroupmigration = (RadioGroup) u.b(u.c(view, R.id.rg_migration, "field 'radioGroupmigration'"), R.id.rg_migration, "field 'radioGroupmigration'", RadioGroup.class);
        fragmentMiscellaneous.radioButtonmigration_yes = (RadioButton) u.b(u.c(view, R.id.rb_migration_yes, "field 'radioButtonmigration_yes'"), R.id.rb_migration_yes, "field 'radioButtonmigration_yes'", RadioButton.class);
        fragmentMiscellaneous.radioButtonmigration_no = (RadioButton) u.b(u.c(view, R.id.rb_migration_no, "field 'radioButtonmigration_no'"), R.id.rb_migration_no, "field 'radioButtonmigration_no'", RadioButton.class);
        fragmentMiscellaneous.radioGroupfinancialAssistance = (RadioGroup) u.b(u.c(view, R.id.rg_financialAssistance, "field 'radioGroupfinancialAssistance'"), R.id.rg_financialAssistance, "field 'radioGroupfinancialAssistance'", RadioGroup.class);
        fragmentMiscellaneous.radioButtonfinancialAssistance_yes = (RadioButton) u.b(u.c(view, R.id.rb_financialAssistance_yes, "field 'radioButtonfinancialAssistance_yes'"), R.id.rb_financialAssistance_yes, "field 'radioButtonfinancialAssistance_yes'", RadioButton.class);
        fragmentMiscellaneous.radioButtonfinancialAssistance_no = (RadioButton) u.b(u.c(view, R.id.rb_financialAssistance_no, "field 'radioButtonfinancialAssistance_no'"), R.id.rb_financialAssistance_no, "field 'radioButtonfinancialAssistance_no'", RadioButton.class);
        fragmentMiscellaneous.linearLayout1 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_1, "field 'linearLayout1'"), R.id.ll_mis_1, "field 'linearLayout1'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout2 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_2, "field 'linearLayout2'"), R.id.ll_mis_2, "field 'linearLayout2'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout3 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_3, "field 'linearLayout3'"), R.id.ll_mis_3, "field 'linearLayout3'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout5 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_5, "field 'linearLayout5'"), R.id.ll_mis_5, "field 'linearLayout5'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout4 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_4, "field 'linearLayout4'"), R.id.ll_mis_4, "field 'linearLayout4'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout6 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_6, "field 'linearLayout6'"), R.id.ll_mis_6, "field 'linearLayout6'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout7 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_7, "field 'linearLayout7'"), R.id.ll_mis_7, "field 'linearLayout7'", LinearLayout.class);
        fragmentMiscellaneous.linearLayout8 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_8, "field 'linearLayout8'"), R.id.ll_mis_8, "field 'linearLayout8'", LinearLayout.class);
        fragmentMiscellaneous.cb_financial_difficulties = (CheckBox) u.b(u.c(view, R.id.cb_financial_difficulties, "field 'cb_financial_difficulties'"), R.id.cb_financial_difficulties, "field 'cb_financial_difficulties'", CheckBox.class);
        fragmentMiscellaneous.cb_poor_education_quality = (CheckBox) u.b(u.c(view, R.id.cb_poor_education_quality, "field 'cb_poor_education_quality'"), R.id.cb_poor_education_quality, "field 'cb_poor_education_quality'", CheckBox.class);
        fragmentMiscellaneous.cb_child_labor = (CheckBox) u.b(u.c(view, R.id.cb_child_labor, "field 'cb_child_labor'"), R.id.cb_child_labor, "field 'cb_child_labor'", CheckBox.class);
        fragmentMiscellaneous.cb_child_health = (CheckBox) u.b(u.c(view, R.id.cb_child_health, "field 'cb_child_health'"), R.id.cb_child_health, "field 'cb_child_health'", CheckBox.class);
        fragmentMiscellaneous.cb_child_not_willing_to_study = (CheckBox) u.b(u.c(view, R.id.cb_child_not_willing_to_study, "field 'cb_child_not_willing_to_study'"), R.id.cb_child_not_willing_to_study, "field 'cb_child_not_willing_to_study'", CheckBox.class);
        fragmentMiscellaneous.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 102) << 1) - (i2 ^ 102);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        FragmentMiscellaneous fragmentMiscellaneous = this.target;
        if (fragmentMiscellaneous == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i7 = (i5 ^ 21) + ((i5 & 21) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            this.target = null;
            fragmentMiscellaneous.sp_levelSatisfaction = null;
            fragmentMiscellaneous.sp_resolveComplaint = null;
            fragmentMiscellaneous.sp_resolveComplaintGovt = null;
            obj.hashCode();
            throw null;
        }
        this.target = null;
        fragmentMiscellaneous.sp_levelSatisfaction = null;
        fragmentMiscellaneous.sp_resolveComplaint = null;
        fragmentMiscellaneous.sp_resolveComplaintGovt = null;
        int i8 = a;
        int i9 = i8 & 45;
        int i10 = (((i8 ^ 45) | i9) << 1) - ((i8 | 45) & (~i9));
        b = i10 % 128;
        int i11 = i10 % 2;
        fragmentMiscellaneous.sp_loan = null;
        fragmentMiscellaneous.sp_monthly_income = null;
        fragmentMiscellaneous.radioGroupDefenseJob = null;
        fragmentMiscellaneous.radioButtonDefenceYes = null;
        int i12 = a;
        int i13 = (i12 ^ 75) + ((i12 & 75) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        fragmentMiscellaneous.radioButtonDefenceNo = null;
        fragmentMiscellaneous.radioGroupinfantDeath = null;
        fragmentMiscellaneous.radioGroupinfantBirth = null;
        fragmentMiscellaneous.radioButtoninfantDeath_yes = null;
        fragmentMiscellaneous.radioButtoninfantDeath_no = null;
        int i15 = b + 9;
        a = i15 % 128;
        int i16 = i15 % 2;
        fragmentMiscellaneous.radioGroupmigration = null;
        fragmentMiscellaneous.radioButtonmigration_yes = null;
        fragmentMiscellaneous.radioButtonmigration_no = null;
        fragmentMiscellaneous.radioGroupfinancialAssistance = null;
        int i17 = b;
        int i18 = ((i17 ^ 59) - (~(-(-((i17 & 59) << 1))))) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        fragmentMiscellaneous.radioButtonfinancialAssistance_yes = null;
        fragmentMiscellaneous.radioButtonfinancialAssistance_no = null;
        fragmentMiscellaneous.linearLayout1 = null;
        fragmentMiscellaneous.linearLayout2 = null;
        int i20 = a;
        int i21 = ((i20 ^ 75) | (i20 & 75)) << 1;
        int i22 = -(((~i20) & 75) | (i20 & (-76)));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            fragmentMiscellaneous.linearLayout3 = null;
            fragmentMiscellaneous.linearLayout5 = null;
            fragmentMiscellaneous.linearLayout4 = null;
            fragmentMiscellaneous.linearLayout6 = null;
            fragmentMiscellaneous.linearLayout7 = null;
            throw null;
        }
        fragmentMiscellaneous.linearLayout3 = null;
        fragmentMiscellaneous.linearLayout5 = null;
        fragmentMiscellaneous.linearLayout4 = null;
        fragmentMiscellaneous.linearLayout6 = null;
        fragmentMiscellaneous.linearLayout7 = null;
        int i24 = a;
        int i25 = ((i24 | 79) << 1) - (i24 ^ 79);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            fragmentMiscellaneous.linearLayout8 = null;
            fragmentMiscellaneous.cb_financial_difficulties = null;
            fragmentMiscellaneous.cb_poor_education_quality = null;
            fragmentMiscellaneous.cb_child_labor = null;
            obj.hashCode();
            throw null;
        }
        fragmentMiscellaneous.linearLayout8 = null;
        fragmentMiscellaneous.cb_financial_difficulties = null;
        fragmentMiscellaneous.cb_poor_education_quality = null;
        fragmentMiscellaneous.cb_child_labor = null;
        fragmentMiscellaneous.cb_child_health = null;
        fragmentMiscellaneous.cb_child_not_willing_to_study = null;
        fragmentMiscellaneous.textViewTimeRemaining = null;
        int i26 = a;
        int i27 = i26 & 13;
        int i28 = ((i26 | 13) & (~i27)) + (i27 << 1);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
