package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRoster_ViewBinding implements Unbinder {

    public class OooO extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityRoster c;

        public OooO(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 68) + (i2 | 68)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.c.valdClicked(view);
                throw null;
            }
            this.c.valdClicked(view);
            int i4 = a + 67;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityRoster c;

        public OooO00o(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-126)) | ((~i2) & 125)) - (~((i2 & 125) << 1))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.onDOB(view);
            int i5 = a;
            int i6 = (i5 & 65) + (i5 | 65);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public class OooO0O0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityRoster c;

        public OooO0O0(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a + 19;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.onCnicImageClick(view);
            int i4 = b;
            int i5 = ((i4 | 99) << 1) - (i4 ^ 99);
            a = i5 % 128;
            if (i5 % 2 != 0) {
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
        public final /* synthetic */ ActivityRoster c;

        public OooO0OO(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 61;
            int i4 = -(-((i2 ^ 61) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.scanClicked(view);
            int i7 = a;
            int i8 = (i7 & 15) + (i7 | 15);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 74 / 0;
            }
        }
    }

    public class OooO0o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityRoster c;

        public OooO0o(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 37) << 1) - (((~i2) & 37) | (i2 & (-38)));
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.saveToRosterList(view);
            int i5 = a + 123;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    public class OooOO0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityRoster c;

        public OooOO0(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 7) + (i2 | 7);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.scanBioClicked(view);
            int i5 = b;
            int i6 = i5 & 59;
            int i7 = ((i5 ^ 59) | i6) << 1;
            int i8 = -((i5 | 59) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public class OooOO0O extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ActivityRoster c;

        public OooOO0O(ActivityRoster_ViewBinding activityRoster_ViewBinding, ActivityRoster activityRoster) {
            this.c = activityRoster;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = -(-((i2 ^ 51) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.c.onCnicPic(view);
                return;
            }
            this.c.onCnicPic(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ActivityRoster_ViewBinding(ActivityRoster activityRoster, View view) {
        activityRoster.sp_networks = (Spinner) u.b(u.c(view, R.id.sp_networks, "field 'sp_networks'"), R.id.sp_networks, "field 'sp_networks'", Spinner.class);
        activityRoster.et_mobile_number = (EditText) u.b(u.c(view, R.id.et_mobile_number, "field 'et_mobile_number'"), R.id.et_mobile_number, "field 'et_mobile_number'", EditText.class);
        activityRoster.et_easypaisa_number = (EditText) u.b(u.c(view, R.id.et_easypaisa_number, "field 'et_easypaisa_number'"), R.id.et_easypaisa_number, "field 'et_easypaisa_number'", EditText.class);
        activityRoster.et_account_title = (EditText) u.b(u.c(view, R.id.et_account_title, "field 'et_account_title'"), R.id.et_account_title, "field 'et_account_title'", EditText.class);
        activityRoster.et_account_number = (EditText) u.b(u.c(view, R.id.et_account_number, "field 'et_account_number'"), R.id.et_account_number, "field 'et_account_number'", EditText.class);
        activityRoster.et_MemberName = (EditText) u.b(u.c(view, R.id.name_of_member, "field 'et_MemberName'"), R.id.name_of_member, "field 'et_MemberName'", EditText.class);
        activityRoster.vald_txt_view_caption = (TextView) u.b(u.c(view, R.id.txt_vald_cnic, "field 'vald_txt_view_caption'"), R.id.txt_vald_cnic, "field 'vald_txt_view_caption'", TextView.class);
        activityRoster.ll_nadra_name = (LinearLayout) u.b(u.c(view, R.id.ll_nadra_name, "field 'll_nadra_name'"), R.id.ll_nadra_name, "field 'll_nadra_name'", LinearLayout.class);
        activityRoster.vald_txt_view = (TextView) u.b(u.c(view, R.id.txt_valid_cnic, "field 'vald_txt_view'"), R.id.txt_valid_cnic, "field 'vald_txt_view'", TextView.class);
        activityRoster.vald_name_txt_view = (TextView) u.b(u.c(view, R.id.txt_valid_name_cnic, "field 'vald_name_txt_view'"), R.id.txt_valid_name_cnic, "field 'vald_name_txt_view'", TextView.class);
        activityRoster.sp_relation_to_household = (Spinner) u.b(u.c(view, R.id.sp_relation_to_household, "field 'sp_relation_to_household'"), R.id.sp_relation_to_household, "field 'sp_relation_to_household'", Spinner.class);
        activityRoster.radioGroupGender = (RadioGroup) u.b(u.c(view, R.id.rg_gender, "field 'radioGroupGender'"), R.id.rg_gender, "field 'radioGroupGender'", RadioGroup.class);
        activityRoster.radioButtonMale = (RadioButton) u.b(u.c(view, R.id.rb_male, "field 'radioButtonMale'"), R.id.rb_male, "field 'radioButtonMale'", RadioButton.class);
        activityRoster.radioButtonFemale = (RadioButton) u.b(u.c(view, R.id.rb_female, "field 'radioButtonFemale'"), R.id.rb_female, "field 'radioButtonFemale'", RadioButton.class);
        activityRoster.radioButtonTrans = (RadioButton) u.b(u.c(view, R.id.rb_trans_gender, "field 'radioButtonTrans'"), R.id.rb_trans_gender, "field 'radioButtonTrans'", RadioButton.class);
        activityRoster.checkBoxBispBenif = (CheckBox) u.b(u.c(view, R.id.cb_is_bisp_benif, "field 'checkBoxBispBenif'"), R.id.cb_is_bisp_benif, "field 'checkBoxBispBenif'", CheckBox.class);
        View viewC = u.c(view, R.id.tv_dob, "field 'tv_dob' and method 'onDOB'");
        activityRoster.tv_dob = (TextView) u.b(viewC, R.id.tv_dob, "field 'tv_dob'", TextView.class);
        viewC.setOnClickListener(new OooO00o(this, activityRoster));
        activityRoster.spinnerYear = (Spinner) u.b(u.c(view, R.id.et_age_year, "field 'spinnerYear'"), R.id.et_age_year, "field 'spinnerYear'", Spinner.class);
        activityRoster.spinnerMonth = (Spinner) u.b(u.c(view, R.id.et_age_month, "field 'spinnerMonth'"), R.id.et_age_month, "field 'spinnerMonth'", Spinner.class);
        activityRoster.sp_marital_status = (Spinner) u.b(u.c(view, R.id.sp_merital_status, "field 'sp_marital_status'"), R.id.sp_merital_status, "field 'sp_marital_status'", Spinner.class);
        activityRoster.radioGroupCNICOptions = (RadioGroup) u.b(u.c(view, R.id.rg_cnic_option, "field 'radioGroupCNICOptions'"), R.id.rg_cnic_option, "field 'radioGroupCNICOptions'", RadioGroup.class);
        activityRoster.por_roster = (EditText) u.b(u.c(view, R.id.por_roster, "field 'por_roster'"), R.id.por_roster, "field 'por_roster'", EditText.class);
        activityRoster.radioButtonCNICNotMade = (RadioButton) u.b(u.c(view, R.id.rb_not_made, "field 'radioButtonCNICNotMade'"), R.id.rb_not_made, "field 'radioButtonCNICNotMade'", RadioButton.class);
        activityRoster.radioButtonCNICAbsent = (RadioButton) u.b(u.c(view, R.id.rb_absent, "field 'radioButtonCNICAbsent'"), R.id.rb_absent, "field 'radioButtonCNICAbsent'", RadioButton.class);
        activityRoster.radioButtonCNICPresent = (RadioButton) u.b(u.c(view, R.id.rb_present, "field 'radioButtonCNICPresent'"), R.id.rb_present, "field 'radioButtonCNICPresent'", RadioButton.class);
        activityRoster.rb_afghani_acc = (RadioButton) u.b(u.c(view, R.id.rb_afghani_acc, "field 'rb_afghani_acc'"), R.id.rb_afghani_acc, "field 'rb_afghani_acc'", RadioButton.class);
        activityRoster.rb_afghani_por = (RadioButton) u.b(u.c(view, R.id.rb_afghani_por, "field 'rb_afghani_por'"), R.id.rb_afghani_por, "field 'rb_afghani_por'", RadioButton.class);
        activityRoster.linearLayoutCNIC = (LinearLayout) u.b(u.c(view, R.id.ll_cnic, "field 'linearLayoutCNIC'"), R.id.ll_cnic, "field 'linearLayoutCNIC'", LinearLayout.class);
        activityRoster.linearLayoutCNICPic = (LinearLayout) u.b(u.c(view, R.id.ll_cnic_pic, "field 'linearLayoutCNICPic'"), R.id.ll_cnic_pic, "field 'linearLayoutCNICPic'", LinearLayout.class);
        View viewC2 = u.c(view, R.id.imgbtn_cnic, "field 'imageViewCnic' and method 'onCnicImageClick'");
        activityRoster.imageViewCnic = (ImageView) u.b(viewC2, R.id.imgbtn_cnic, "field 'imageViewCnic'", ImageView.class);
        viewC2.setOnClickListener(new OooO0O0(this, activityRoster));
        activityRoster.et_RosterCNIC = (EditText) u.b(u.c(view, R.id.cnic_roster, "field 'et_RosterCNIC'"), R.id.cnic_roster, "field 'et_RosterCNIC'", EditText.class);
        View viewC3 = u.c(view, R.id.btn_scan_cnic, "field 'buttonScanCNIC' and method 'scanClicked'");
        activityRoster.buttonScanCNIC = (Button) u.b(viewC3, R.id.btn_scan_cnic, "field 'buttonScanCNIC'", Button.class);
        viewC3.setOnClickListener(new OooO0OO(this, activityRoster));
        activityRoster.et_RosterCNICRepeat = (EditText) u.b(u.c(view, R.id.cnic_roster_repeat, "field 'et_RosterCNICRepeat'"), R.id.cnic_roster_repeat, "field 'et_RosterCNICRepeat'", EditText.class);
        activityRoster.et_RosterBForm = (EditText) u.b(u.c(view, R.id.bform_roster, "field 'et_RosterBForm'"), R.id.bform_roster, "field 'et_RosterBForm'", EditText.class);
        activityRoster.et_RosterBFormRepeat = (EditText) u.b(u.c(view, R.id.bform_roster_repeat, "field 'et_RosterBFormRepeat'"), R.id.bform_roster_repeat, "field 'et_RosterBFormRepeat'", EditText.class);
        activityRoster.sp_disability = (Spinner) u.b(u.c(view, R.id.sp_disability, "field 'sp_disability'"), R.id.sp_disability, "field 'sp_disability'", Spinner.class);
        activityRoster.sp_chronic_disease = (Spinner) u.b(u.c(view, R.id.sp_chronic_disease, "field 'sp_chronic_disease'"), R.id.sp_chronic_disease, "field 'sp_chronic_disease'", Spinner.class);
        activityRoster.tv_languageQuestion = (TextView) u.b(u.c(view, R.id.tv_languageQuestion, "field 'tv_languageQuestion'"), R.id.tv_languageQuestion, "field 'tv_languageQuestion'", TextView.class);
        activityRoster.radioGroupLanguage = (RadioGroup) u.b(u.c(view, R.id.rg_language, "field 'radioGroupLanguage'"), R.id.rg_language, "field 'radioGroupLanguage'", RadioGroup.class);
        activityRoster.radioButtonLanguage_yes = (RadioButton) u.b(u.c(view, R.id.rb_language_yes, "field 'radioButtonLanguage_yes'"), R.id.rb_language_yes, "field 'radioButtonLanguage_yes'", RadioButton.class);
        activityRoster.radioButtonLanguage_no = (RadioButton) u.b(u.c(view, R.id.rb_language_no, "field 'radioButtonLanguage_no'"), R.id.rb_language_no, "field 'radioButtonLanguage_no'", RadioButton.class);
        activityRoster.radioGroupCalendar = (RadioGroup) u.b(u.c(view, R.id.rg_calendar, "field 'radioGroupCalendar'"), R.id.rg_calendar, "field 'radioGroupCalendar'", RadioGroup.class);
        activityRoster.radioButtonCalendarYes = (RadioButton) u.b(u.c(view, R.id.rb_calendar_yes, "field 'radioButtonCalendarYes'"), R.id.rb_calendar_yes, "field 'radioButtonCalendarYes'", RadioButton.class);
        activityRoster.radioButtonCalendarNo = (RadioButton) u.b(u.c(view, R.id.rb_calendar_no, "field 'radioButtonCalendarNo'"), R.id.rb_calendar_no, "field 'radioButtonCalendarNo'", RadioButton.class);
        activityRoster.rg_bank_info = (RadioGroup) u.b(u.c(view, R.id.rg_bank_info, "field 'rg_bank_info'"), R.id.rg_bank_info, "field 'rg_bank_info'", RadioGroup.class);
        activityRoster.rb_yes_bank = (RadioButton) u.b(u.c(view, R.id.rb_yes_bank, "field 'rb_yes_bank'"), R.id.rb_yes_bank, "field 'rb_yes_bank'", RadioButton.class);
        activityRoster.rb_no_bank = (RadioButton) u.b(u.c(view, R.id.rb_no_bank, "field 'rb_no_bank'"), R.id.rb_no_bank, "field 'rb_no_bank'", RadioButton.class);
        activityRoster.ll_bank_info = (LinearLayout) u.b(u.c(view, R.id.ll_bank_info, "field 'll_bank_info'"), R.id.ll_bank_info, "field 'll_bank_info'", LinearLayout.class);
        activityRoster.sp_attended_school = (Spinner) u.b(u.c(view, R.id.sp_attended_school, "field 'sp_attended_school'"), R.id.sp_attended_school, "field 'sp_attended_school'", Spinner.class);
        activityRoster.sp_highest_education = (Spinner) u.b(u.c(view, R.id.sp_highest_education, "field 'sp_highest_education'"), R.id.sp_highest_education, "field 'sp_highest_education'", Spinner.class);
        activityRoster.sp_work_activity = (Spinner) u.b(u.c(view, R.id.sp_work_activity, "field 'sp_work_activity'"), R.id.sp_work_activity, "field 'sp_work_activity'", Spinner.class);
        activityRoster.tv_workingHourQuestion = (TextView) u.b(u.c(view, R.id.tv_workingHourQuestion, "field 'tv_workingHourQuestion'"), R.id.tv_workingHourQuestion, "field 'tv_workingHourQuestion'", TextView.class);
        activityRoster.et_hoursWorked = (EditText) u.b(u.c(view, R.id.hours_worked, "field 'et_hoursWorked'"), R.id.hours_worked, "field 'et_hoursWorked'", EditText.class);
        activityRoster.sp_employment_status = (Spinner) u.b(u.c(view, R.id.sp_employment_status, "field 'sp_employment_status'"), R.id.sp_employment_status, "field 'sp_employment_status'", Spinner.class);
        activityRoster.sp_banks = (Spinner) u.b(u.c(view, R.id.sp_banks, "field 'sp_banks'"), R.id.sp_banks, "field 'sp_banks'", Spinner.class);
        View viewC4 = u.c(view, R.id.btn_save, "field 'btn_save' and method 'saveToRosterList'");
        activityRoster.btn_save = (Button) u.b(viewC4, R.id.btn_save, "field 'btn_save'", Button.class);
        viewC4.setOnClickListener(new OooO0o(this, activityRoster));
        activityRoster.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
        View viewC5 = u.c(view, R.id.btn_vald_cnic, "field 'btn_vald_cnic' and method 'valdClicked'");
        activityRoster.btn_vald_cnic = (Button) u.b(viewC5, R.id.btn_vald_cnic, "field 'btn_vald_cnic'", Button.class);
        viewC5.setOnClickListener(new OooO(this, activityRoster));
        View viewC6 = u.c(view, R.id.btn_bio_cnic, "field 'btn_bio_cnic' and method 'scanBioClicked'");
        activityRoster.btn_bio_cnic = (Button) u.b(viewC6, R.id.btn_bio_cnic, "field 'btn_bio_cnic'", Button.class);
        viewC6.setOnClickListener(new OooOO0(this, activityRoster));
        u.c(view, R.id.btn_take_pic_cnic, "method 'onCnicPic'").setOnClickListener(new OooOO0O(this, activityRoster));
    }
}
