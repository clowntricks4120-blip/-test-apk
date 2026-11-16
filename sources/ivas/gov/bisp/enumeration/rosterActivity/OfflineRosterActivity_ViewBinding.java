package ivas.gov.bisp.enumeration.rosterActivity;

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
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class OfflineRosterActivity_ViewBinding implements Unbinder {

    public class OooO extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ OfflineRosterActivity c;

        public OooO(OfflineRosterActivity_ViewBinding offlineRosterActivity_ViewBinding, OfflineRosterActivity offlineRosterActivity) {
            this.c = offlineRosterActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 33;
            int i4 = ((i2 ^ 33) | i3) << 1;
            int i5 = -((i2 | 33) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            this.c.onCnicPic(view);
            int i8 = a;
            int i9 = ((i8 ^ 37) | (i8 & 37)) << 1;
            int i10 = -(((~i8) & 37) | (i8 & (-38)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ OfflineRosterActivity c;

        public OooO00o(OfflineRosterActivity_ViewBinding offlineRosterActivity_ViewBinding, OfflineRosterActivity offlineRosterActivity) {
            this.c = offlineRosterActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a + 52;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.onDOB(view);
            int i5 = b + 51;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public class OooO0O0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ OfflineRosterActivity c;

        public OooO0O0(OfflineRosterActivity_ViewBinding offlineRosterActivity_ViewBinding, OfflineRosterActivity offlineRosterActivity) {
            this.c = offlineRosterActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a + 73;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                this.c.onCnicImageClick(view);
                throw null;
            }
            this.c.onCnicImageClick(view);
            int i3 = b + 3;
            a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public class OooO0OO extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ OfflineRosterActivity c;

        public OooO0OO(OfflineRosterActivity_ViewBinding offlineRosterActivity_ViewBinding, OfflineRosterActivity offlineRosterActivity) {
            this.c = offlineRosterActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a + 67;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.saveToRosterList(view);
            if (i3 == 0) {
                int i4 = 49 / 0;
            }
        }
    }

    public class OooO0o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ OfflineRosterActivity c;

        public OooO0o(OfflineRosterActivity_ViewBinding offlineRosterActivity_ViewBinding, OfflineRosterActivity offlineRosterActivity) {
            this.c = offlineRosterActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.scanBioClicked(view);
            if (i4 != 0) {
                int i5 = 95 / 0;
            }
            int i6 = b + 125;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public OfflineRosterActivity_ViewBinding(OfflineRosterActivity offlineRosterActivity, View view) {
        offlineRosterActivity.sp_networks = (Spinner) u.b(u.c(view, R.id.sp_networks, "field 'sp_networks'"), R.id.sp_networks, "field 'sp_networks'", Spinner.class);
        offlineRosterActivity.et_mobile_number = (EditText) u.b(u.c(view, R.id.et_mobile_number, "field 'et_mobile_number'"), R.id.et_mobile_number, "field 'et_mobile_number'", EditText.class);
        offlineRosterActivity.et_easypaisa_number = (EditText) u.b(u.c(view, R.id.et_easypaisa_number, "field 'et_easypaisa_number'"), R.id.et_easypaisa_number, "field 'et_easypaisa_number'", EditText.class);
        offlineRosterActivity.et_account_title = (EditText) u.b(u.c(view, R.id.et_account_title, "field 'et_account_title'"), R.id.et_account_title, "field 'et_account_title'", EditText.class);
        offlineRosterActivity.et_account_number = (EditText) u.b(u.c(view, R.id.et_account_number, "field 'et_account_number'"), R.id.et_account_number, "field 'et_account_number'", EditText.class);
        offlineRosterActivity.sp_banks = (Spinner) u.b(u.c(view, R.id.sp_banks, "field 'sp_banks'"), R.id.sp_banks, "field 'sp_banks'", Spinner.class);
        offlineRosterActivity.rg_bank_info = (RadioGroup) u.b(u.c(view, R.id.rg_bank_info, "field 'rg_bank_info'"), R.id.rg_bank_info, "field 'rg_bank_info'", RadioGroup.class);
        offlineRosterActivity.rb_yes_bank = (RadioButton) u.b(u.c(view, R.id.rb_yes_bank, "field 'rb_yes_bank'"), R.id.rb_yes_bank, "field 'rb_yes_bank'", RadioButton.class);
        offlineRosterActivity.rb_no_bank = (RadioButton) u.b(u.c(view, R.id.rb_no_bank, "field 'rb_no_bank'"), R.id.rb_no_bank, "field 'rb_no_bank'", RadioButton.class);
        offlineRosterActivity.ll_bank_info = (LinearLayout) u.b(u.c(view, R.id.ll_bank_info, "field 'll_bank_info'"), R.id.ll_bank_info, "field 'll_bank_info'", LinearLayout.class);
        offlineRosterActivity.et_MemberName = (EditText) u.b(u.c(view, R.id.name_of_member, "field 'et_MemberName'"), R.id.name_of_member, "field 'et_MemberName'", EditText.class);
        offlineRosterActivity.vald_txt_view_caption = (TextView) u.b(u.c(view, R.id.txt_vald_cnic, "field 'vald_txt_view_caption'"), R.id.txt_vald_cnic, "field 'vald_txt_view_caption'", TextView.class);
        offlineRosterActivity.vald_txt_view = (TextView) u.b(u.c(view, R.id.txt_valid_cnic, "field 'vald_txt_view'"), R.id.txt_valid_cnic, "field 'vald_txt_view'", TextView.class);
        offlineRosterActivity.vald_name_txt_view = (TextView) u.b(u.c(view, R.id.txt_valid_name_cnic, "field 'vald_name_txt_view'"), R.id.txt_valid_name_cnic, "field 'vald_name_txt_view'", TextView.class);
        offlineRosterActivity.sp_relation_to_household = (Spinner) u.b(u.c(view, R.id.sp_relation_to_household, "field 'sp_relation_to_household'"), R.id.sp_relation_to_household, "field 'sp_relation_to_household'", Spinner.class);
        offlineRosterActivity.radioGroupGender = (RadioGroup) u.b(u.c(view, R.id.rg_gender, "field 'radioGroupGender'"), R.id.rg_gender, "field 'radioGroupGender'", RadioGroup.class);
        offlineRosterActivity.radioButtonMale = (RadioButton) u.b(u.c(view, R.id.rb_male, "field 'radioButtonMale'"), R.id.rb_male, "field 'radioButtonMale'", RadioButton.class);
        offlineRosterActivity.radioButtonFemale = (RadioButton) u.b(u.c(view, R.id.rb_female, "field 'radioButtonFemale'"), R.id.rb_female, "field 'radioButtonFemale'", RadioButton.class);
        offlineRosterActivity.radioButtonTrans = (RadioButton) u.b(u.c(view, R.id.rb_trans_gender, "field 'radioButtonTrans'"), R.id.rb_trans_gender, "field 'radioButtonTrans'", RadioButton.class);
        offlineRosterActivity.checkBoxBispBenif = (CheckBox) u.b(u.c(view, R.id.cb_is_bisp_benif, "field 'checkBoxBispBenif'"), R.id.cb_is_bisp_benif, "field 'checkBoxBispBenif'", CheckBox.class);
        View viewC = u.c(view, R.id.tv_dob, "field 'tv_dob' and method 'onDOB'");
        offlineRosterActivity.tv_dob = (TextView) u.b(viewC, R.id.tv_dob, "field 'tv_dob'", TextView.class);
        viewC.setOnClickListener(new OooO00o(this, offlineRosterActivity));
        offlineRosterActivity.spinnerYear = (Spinner) u.b(u.c(view, R.id.et_age_year, "field 'spinnerYear'"), R.id.et_age_year, "field 'spinnerYear'", Spinner.class);
        offlineRosterActivity.spinnerMonth = (Spinner) u.b(u.c(view, R.id.et_age_month, "field 'spinnerMonth'"), R.id.et_age_month, "field 'spinnerMonth'", Spinner.class);
        offlineRosterActivity.sp_marital_status = (Spinner) u.b(u.c(view, R.id.sp_merital_status, "field 'sp_marital_status'"), R.id.sp_merital_status, "field 'sp_marital_status'", Spinner.class);
        offlineRosterActivity.radioGroupCNICOptions = (RadioGroup) u.b(u.c(view, R.id.rg_cnic_option, "field 'radioGroupCNICOptions'"), R.id.rg_cnic_option, "field 'radioGroupCNICOptions'", RadioGroup.class);
        offlineRosterActivity.por_roster = (EditText) u.b(u.c(view, R.id.por_roster, "field 'por_roster'"), R.id.por_roster, "field 'por_roster'", EditText.class);
        offlineRosterActivity.radioButtonCNICNotMade = (RadioButton) u.b(u.c(view, R.id.rb_not_made, "field 'radioButtonCNICNotMade'"), R.id.rb_not_made, "field 'radioButtonCNICNotMade'", RadioButton.class);
        offlineRosterActivity.radioButtonCNICAbsent = (RadioButton) u.b(u.c(view, R.id.rb_absent, "field 'radioButtonCNICAbsent'"), R.id.rb_absent, "field 'radioButtonCNICAbsent'", RadioButton.class);
        offlineRosterActivity.radioButtonCNICPresent = (RadioButton) u.b(u.c(view, R.id.rb_present, "field 'radioButtonCNICPresent'"), R.id.rb_present, "field 'radioButtonCNICPresent'", RadioButton.class);
        offlineRosterActivity.rb_afghani_acc = (RadioButton) u.b(u.c(view, R.id.rb_afghani_acc, "field 'rb_afghani_acc'"), R.id.rb_afghani_acc, "field 'rb_afghani_acc'", RadioButton.class);
        offlineRosterActivity.rb_afghani_por = (RadioButton) u.b(u.c(view, R.id.rb_afghani_por, "field 'rb_afghani_por'"), R.id.rb_afghani_por, "field 'rb_afghani_por'", RadioButton.class);
        offlineRosterActivity.linearLayoutCNIC = (LinearLayout) u.b(u.c(view, R.id.ll_cnic, "field 'linearLayoutCNIC'"), R.id.ll_cnic, "field 'linearLayoutCNIC'", LinearLayout.class);
        offlineRosterActivity.linearLayoutCNICPic = (LinearLayout) u.b(u.c(view, R.id.ll_cnic_pic, "field 'linearLayoutCNICPic'"), R.id.ll_cnic_pic, "field 'linearLayoutCNICPic'", LinearLayout.class);
        View viewC2 = u.c(view, R.id.imgbtn_cnic, "field 'imageViewCnic' and method 'onCnicImageClick'");
        offlineRosterActivity.imageViewCnic = (ImageView) u.b(viewC2, R.id.imgbtn_cnic, "field 'imageViewCnic'", ImageView.class);
        viewC2.setOnClickListener(new OooO0O0(this, offlineRosterActivity));
        offlineRosterActivity.et_RosterCNIC = (EditText) u.b(u.c(view, R.id.cnic_roster, "field 'et_RosterCNIC'"), R.id.cnic_roster, "field 'et_RosterCNIC'", EditText.class);
        offlineRosterActivity.buttonScanCNIC = (Button) u.b(u.c(view, R.id.btn_scan_cnic, "field 'buttonScanCNIC'"), R.id.btn_scan_cnic, "field 'buttonScanCNIC'", Button.class);
        offlineRosterActivity.et_RosterCNICRepeat = (EditText) u.b(u.c(view, R.id.cnic_roster_repeat, "field 'et_RosterCNICRepeat'"), R.id.cnic_roster_repeat, "field 'et_RosterCNICRepeat'", EditText.class);
        offlineRosterActivity.et_RosterBForm = (EditText) u.b(u.c(view, R.id.bform_roster, "field 'et_RosterBForm'"), R.id.bform_roster, "field 'et_RosterBForm'", EditText.class);
        offlineRosterActivity.et_RosterBFormRepeat = (EditText) u.b(u.c(view, R.id.bform_roster_repeat, "field 'et_RosterBFormRepeat'"), R.id.bform_roster_repeat, "field 'et_RosterBFormRepeat'", EditText.class);
        offlineRosterActivity.sp_disability = (Spinner) u.b(u.c(view, R.id.sp_disability, "field 'sp_disability'"), R.id.sp_disability, "field 'sp_disability'", Spinner.class);
        offlineRosterActivity.sp_chronic_disease = (Spinner) u.b(u.c(view, R.id.sp_chronic_disease, "field 'sp_chronic_disease'"), R.id.sp_chronic_disease, "field 'sp_chronic_disease'", Spinner.class);
        offlineRosterActivity.tv_languageQuestion = (TextView) u.b(u.c(view, R.id.tv_languageQuestion, "field 'tv_languageQuestion'"), R.id.tv_languageQuestion, "field 'tv_languageQuestion'", TextView.class);
        offlineRosterActivity.radioGroupLanguage = (RadioGroup) u.b(u.c(view, R.id.rg_language, "field 'radioGroupLanguage'"), R.id.rg_language, "field 'radioGroupLanguage'", RadioGroup.class);
        offlineRosterActivity.radioButtonLanguage_yes = (RadioButton) u.b(u.c(view, R.id.rb_language_yes, "field 'radioButtonLanguage_yes'"), R.id.rb_language_yes, "field 'radioButtonLanguage_yes'", RadioButton.class);
        offlineRosterActivity.radioButtonLanguage_no = (RadioButton) u.b(u.c(view, R.id.rb_language_no, "field 'radioButtonLanguage_no'"), R.id.rb_language_no, "field 'radioButtonLanguage_no'", RadioButton.class);
        offlineRosterActivity.radioGroupCalendar = (RadioGroup) u.b(u.c(view, R.id.rg_calendar, "field 'radioGroupCalendar'"), R.id.rg_calendar, "field 'radioGroupCalendar'", RadioGroup.class);
        offlineRosterActivity.radioButtonCalendarYes = (RadioButton) u.b(u.c(view, R.id.rb_calendar_yes, "field 'radioButtonCalendarYes'"), R.id.rb_calendar_yes, "field 'radioButtonCalendarYes'", RadioButton.class);
        offlineRosterActivity.radioButtonCalendarNo = (RadioButton) u.b(u.c(view, R.id.rb_calendar_no, "field 'radioButtonCalendarNo'"), R.id.rb_calendar_no, "field 'radioButtonCalendarNo'", RadioButton.class);
        offlineRosterActivity.sp_attended_school = (Spinner) u.b(u.c(view, R.id.sp_attended_school, "field 'sp_attended_school'"), R.id.sp_attended_school, "field 'sp_attended_school'", Spinner.class);
        offlineRosterActivity.sp_highest_education = (Spinner) u.b(u.c(view, R.id.sp_highest_education, "field 'sp_highest_education'"), R.id.sp_highest_education, "field 'sp_highest_education'", Spinner.class);
        offlineRosterActivity.sp_work_activity = (Spinner) u.b(u.c(view, R.id.sp_work_activity, "field 'sp_work_activity'"), R.id.sp_work_activity, "field 'sp_work_activity'", Spinner.class);
        offlineRosterActivity.tv_workingHourQuestion = (TextView) u.b(u.c(view, R.id.tv_workingHourQuestion, "field 'tv_workingHourQuestion'"), R.id.tv_workingHourQuestion, "field 'tv_workingHourQuestion'", TextView.class);
        offlineRosterActivity.et_hoursWorked = (EditText) u.b(u.c(view, R.id.hours_worked, "field 'et_hoursWorked'"), R.id.hours_worked, "field 'et_hoursWorked'", EditText.class);
        offlineRosterActivity.sp_employment_status = (Spinner) u.b(u.c(view, R.id.sp_employment_status, "field 'sp_employment_status'"), R.id.sp_employment_status, "field 'sp_employment_status'", Spinner.class);
        View viewC3 = u.c(view, R.id.btn_save, "field 'btn_save' and method 'saveToRosterList'");
        offlineRosterActivity.btn_save = (Button) u.b(viewC3, R.id.btn_save, "field 'btn_save'", Button.class);
        viewC3.setOnClickListener(new OooO0OO(this, offlineRosterActivity));
        offlineRosterActivity.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
        offlineRosterActivity.btn_vald_cnic = (Button) u.b(u.c(view, R.id.btn_vald_cnic, "field 'btn_vald_cnic'"), R.id.btn_vald_cnic, "field 'btn_vald_cnic'", Button.class);
        View viewC4 = u.c(view, R.id.btn_bio_cnic, "field 'btn_bio_cnic' and method 'scanBioClicked'");
        offlineRosterActivity.btn_bio_cnic = (Button) u.b(viewC4, R.id.btn_bio_cnic, "field 'btn_bio_cnic'", Button.class);
        viewC4.setOnClickListener(new OooO0o(this, offlineRosterActivity));
        u.c(view, R.id.btn_take_pic_cnic, "method 'onCnicPic'").setOnClickListener(new OooO(this, offlineRosterActivity));
    }
}
