package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentMiscellaneouss_ViewBinding implements Unbinder {
    private static int a = 0;
    private static int b = 1;
    private FragmentMiscellaneouss target;

    public FragmentMiscellaneouss_ViewBinding(FragmentMiscellaneouss fragmentMiscellaneouss, View view) {
        this.target = fragmentMiscellaneouss;
        fragmentMiscellaneouss.sp_levelSatisfaction = (Spinner) u.b(u.c(view, R.id.sp_levelSatisfaction, "field 'sp_levelSatisfaction'"), R.id.sp_levelSatisfaction, "field 'sp_levelSatisfaction'", Spinner.class);
        fragmentMiscellaneouss.sp_resolveComplaint = (Spinner) u.b(u.c(view, R.id.sp_resolveComplaint, "field 'sp_resolveComplaint'"), R.id.sp_resolveComplaint, "field 'sp_resolveComplaint'", Spinner.class);
        fragmentMiscellaneouss.sp_resolveComplaintGovt = (Spinner) u.b(u.c(view, R.id.sp_resolveComplaint_govt, "field 'sp_resolveComplaintGovt'"), R.id.sp_resolveComplaint_govt, "field 'sp_resolveComplaintGovt'", Spinner.class);
        fragmentMiscellaneouss.sp_loan = (Spinner) u.b(u.c(view, R.id.sp_loan, "field 'sp_loan'"), R.id.sp_loan, "field 'sp_loan'", Spinner.class);
        fragmentMiscellaneouss.radioGroupDefenseJob = (RadioGroup) u.b(u.c(view, R.id.rg_defense_job, "field 'radioGroupDefenseJob'"), R.id.rg_defense_job, "field 'radioGroupDefenseJob'", RadioGroup.class);
        fragmentMiscellaneouss.radioButtonDefenceYes = (RadioButton) u.b(u.c(view, R.id.rb_defense_job_yes, "field 'radioButtonDefenceYes'"), R.id.rb_defense_job_yes, "field 'radioButtonDefenceYes'", RadioButton.class);
        fragmentMiscellaneouss.radioButtonDefenceNo = (RadioButton) u.b(u.c(view, R.id.rb_defense_job_no, "field 'radioButtonDefenceNo'"), R.id.rb_defense_job_no, "field 'radioButtonDefenceNo'", RadioButton.class);
        fragmentMiscellaneouss.radioGroupinfantDeath = (RadioGroup) u.b(u.c(view, R.id.rg_infantDeath, "field 'radioGroupinfantDeath'"), R.id.rg_infantDeath, "field 'radioGroupinfantDeath'", RadioGroup.class);
        fragmentMiscellaneouss.radioButtoninfantDeath_yes = (RadioButton) u.b(u.c(view, R.id.rb_infantDeath_yes, "field 'radioButtoninfantDeath_yes'"), R.id.rb_infantDeath_yes, "field 'radioButtoninfantDeath_yes'", RadioButton.class);
        fragmentMiscellaneouss.radioButtoninfantDeath_no = (RadioButton) u.b(u.c(view, R.id.rb_infantDeath_no, "field 'radioButtoninfantDeath_no'"), R.id.rb_infantDeath_no, "field 'radioButtoninfantDeath_no'", RadioButton.class);
        fragmentMiscellaneouss.radioGroupmigration = (RadioGroup) u.b(u.c(view, R.id.rg_migration, "field 'radioGroupmigration'"), R.id.rg_migration, "field 'radioGroupmigration'", RadioGroup.class);
        fragmentMiscellaneouss.radioButtonmigration_yes = (RadioButton) u.b(u.c(view, R.id.rb_migration_yes, "field 'radioButtonmigration_yes'"), R.id.rb_migration_yes, "field 'radioButtonmigration_yes'", RadioButton.class);
        fragmentMiscellaneouss.radioButtonmigration_no = (RadioButton) u.b(u.c(view, R.id.rb_migration_no, "field 'radioButtonmigration_no'"), R.id.rb_migration_no, "field 'radioButtonmigration_no'", RadioButton.class);
        fragmentMiscellaneouss.radioGroupfinancialAssistance = (RadioGroup) u.b(u.c(view, R.id.rg_financialAssistance, "field 'radioGroupfinancialAssistance'"), R.id.rg_financialAssistance, "field 'radioGroupfinancialAssistance'", RadioGroup.class);
        fragmentMiscellaneouss.radioButtonfinancialAssistance_yes = (RadioButton) u.b(u.c(view, R.id.rb_financialAssistance_yes, "field 'radioButtonfinancialAssistance_yes'"), R.id.rb_financialAssistance_yes, "field 'radioButtonfinancialAssistance_yes'", RadioButton.class);
        fragmentMiscellaneouss.radioButtonfinancialAssistance_no = (RadioButton) u.b(u.c(view, R.id.rb_financialAssistance_no, "field 'radioButtonfinancialAssistance_no'"), R.id.rb_financialAssistance_no, "field 'radioButtonfinancialAssistance_no'", RadioButton.class);
        fragmentMiscellaneouss.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
        fragmentMiscellaneouss.linearLayout1 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_1, "field 'linearLayout1'"), R.id.ll_mis_1, "field 'linearLayout1'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout2 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_2, "field 'linearLayout2'"), R.id.ll_mis_2, "field 'linearLayout2'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout3 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_3, "field 'linearLayout3'"), R.id.ll_mis_3, "field 'linearLayout3'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout5 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_5, "field 'linearLayout5'"), R.id.ll_mis_5, "field 'linearLayout5'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout4 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_4, "field 'linearLayout4'"), R.id.ll_mis_4, "field 'linearLayout4'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout6 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_6, "field 'linearLayout6'"), R.id.ll_mis_6, "field 'linearLayout6'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout7 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_7, "field 'linearLayout7'"), R.id.ll_mis_7, "field 'linearLayout7'", LinearLayout.class);
        fragmentMiscellaneouss.linearLayout8 = (LinearLayout) u.b(u.c(view, R.id.ll_mis_8, "field 'linearLayout8'"), R.id.ll_mis_8, "field 'linearLayout8'", LinearLayout.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r7.target = null;
        r2.sp_levelSatisfaction = null;
        r2.sp_resolveComplaint = null;
        r2.sp_resolveComplaintGovt = null;
        r2.sp_loan = null;
        r2.radioGroupDefenseJob = null;
        r2.radioButtonDefenceYes = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b + 35;
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a = r3 % 128;
        r3 = r3 % 2;
        r2.radioButtonDefenceNo = null;
        r2.radioGroupinfantDeath = null;
        r2.radioButtoninfantDeath_yes = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b;
        r4 = r3 & 95;
        r3 = (r3 ^ 95) | r4;
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r2.radioButtoninfantDeath_no = null;
        r2.radioGroupmigration = null;
        r2.radioButtonmigration_yes = null;
        r2.radioButtonmigration_no = null;
        r4 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        r2.radioButtoninfantDeath_no = null;
        r2.radioGroupmigration = null;
        r2.radioButtonmigration_yes = null;
        r2.radioButtonmigration_no = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r2.radioGroupfinancialAssistance = null;
        r2.radioButtonfinancialAssistance_yes = null;
        r2.radioButtonfinancialAssistance_no = null;
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a;
        r5 = (r4 ^ 67) + ((r4 & 67) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b = r5 % 128;
        r5 = r5 % 2;
        r2.textViewTimeRemaining = null;
        r2.linearLayout1 = null;
        r2.linearLayout2 = null;
        r2.linearLayout3 = null;
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a;
        r5 = r4 & 113;
        r4 = (r4 | 113) & (~r5);
        r5 = -(-(r5 << 1));
        r6 = ((r4 | r5) << 1) - (r4 ^ r5);
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b = r6 % 128;
        r6 = r6 % 2;
        r2.linearLayout5 = null;
        r2.linearLayout4 = null;
        r2.linearLayout6 = null;
        r4 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a + 50;
        r5 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b = r5 % 128;
        r5 = r5 % 2;
        r2.linearLayout7 = null;
        r2.linearLayout8 = null;
        r1 = ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.b;
        r2 = r1 & 81;
        r2 = (r2 - (~(-(-((r1 ^ 81) | r2))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        r7.target = null;
        r2.sp_levelSatisfaction = null;
        r2.sp_resolveComplaint = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e9, code lost:
    
        throw new java.lang.IllegalStateException("Bindings already cleared.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r3 = r1 ^ 71;
        r1 = -(-((r1 & 71) << 1));
        r4 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if ((r4 % 2) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void unbind() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss_ViewBinding.unbind():void");
    }
}
