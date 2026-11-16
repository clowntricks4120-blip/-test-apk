package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.t;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentContactDetail_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentContactDetail target;
    private View view7f0a0200;
    private View view7f0a020a;

    public FragmentContactDetail_ViewBinding(final FragmentContactDetail fragmentContactDetail, View view) {
        this.target = fragmentContactDetail;
        fragmentContactDetail.textViewRegionLabel = (TextView) u.b(u.c(view, R.id.tv_region_label, "field 'textViewRegionLabel'"), R.id.tv_region_label, "field 'textViewRegionLabel'", TextView.class);
        fragmentContactDetail.radioGroupRegion = (RadioGroup) u.b(u.c(view, R.id.rg_region, "field 'radioGroupRegion'"), R.id.rg_region, "field 'radioGroupRegion'", RadioGroup.class);
        fragmentContactDetail.radioButtonRegionUrban = (RadioButton) u.b(u.c(view, R.id.rb_region_yes, "field 'radioButtonRegionUrban'"), R.id.rb_region_yes, "field 'radioButtonRegionUrban'", RadioButton.class);
        fragmentContactDetail.radioButtonRegionRural = (RadioButton) u.b(u.c(view, R.id.rb_region_no, "field 'radioButtonRegionRural'"), R.id.rb_region_no, "field 'radioButtonRegionRural'", RadioButton.class);
        fragmentContactDetail.sp_province = (Spinner) u.b(u.c(view, R.id.sp_province, "field 'sp_province'"), R.id.sp_province, "field 'sp_province'", Spinner.class);
        fragmentContactDetail.sp_district = (Spinner) u.b(u.c(view, R.id.sp_district, "field 'sp_district'"), R.id.sp_district, "field 'sp_district'", Spinner.class);
        fragmentContactDetail.sp_tehsil = (Spinner) u.b(u.c(view, R.id.sp_tehsil, "field 'sp_tehsil'"), R.id.sp_tehsil, "field 'sp_tehsil'", Spinner.class);
        fragmentContactDetail.textViewTempAddress = (TextView) u.b(u.c(view, R.id.tv_temp_address, "field 'textViewTempAddress'"), R.id.tv_temp_address, "field 'textViewTempAddress'", TextView.class);
        fragmentContactDetail.textViewPerAddress = (TextView) u.b(u.c(view, R.id.tv_per_address, "field 'textViewPerAddress'"), R.id.tv_per_address, "field 'textViewPerAddress'", TextView.class);
        fragmentContactDetail.sp_uc = (Spinner) u.b(u.c(view, R.id.sp_uc, "field 'sp_uc'"), R.id.sp_uc, "field 'sp_uc'", Spinner.class);
        fragmentContactDetail.et_uc = (EditText) u.b(u.c(view, R.id.et_uc, "field 'et_uc'"), R.id.et_uc, "field 'et_uc'", EditText.class);
        fragmentContactDetail.et_village = (EditText) u.b(u.c(view, R.id.et_village, "field 'et_village'"), R.id.et_village, "field 'et_village'", EditText.class);
        fragmentContactDetail.sp_village = (Spinner) u.b(u.c(view, R.id.sp_village, "field 'sp_village'"), R.id.sp_village, "field 'sp_village'", Spinner.class);
        fragmentContactDetail.spinnerVenue = (Spinner) u.b(u.c(view, R.id.spinnerVenue, "field 'spinnerVenue'"), R.id.spinnerVenue, "field 'spinnerVenue'", Spinner.class);
        fragmentContactDetail.sp_visitStatus = (Spinner) u.b(u.c(view, R.id.sp_visit_status, "field 'sp_visitStatus'"), R.id.sp_visit_status, "field 'sp_visitStatus'", Spinner.class);
        fragmentContactDetail.sp_structureNumber = (Spinner) u.b(u.c(view, R.id.sp_structure_number, "field 'sp_structureNumber'"), R.id.sp_structure_number, "field 'sp_structureNumber'", Spinner.class);
        fragmentContactDetail.sp_motherLanguage = (Spinner) u.b(u.c(view, R.id.sp_mother_language, "field 'sp_motherLanguage'"), R.id.sp_mother_language, "field 'sp_motherLanguage'", Spinner.class);
        fragmentContactDetail.sp_networks = (Spinner) u.b(u.c(view, R.id.sp_networks, "field 'sp_networks'"), R.id.sp_networks, "field 'sp_networks'", Spinner.class);
        fragmentContactDetail.editTextNameOfHead = (EditText) u.b(u.c(view, R.id.name_of_head, "field 'editTextNameOfHead'"), R.id.name_of_head, "field 'editTextNameOfHead'", EditText.class);
        fragmentContactDetail.editTextBlockCode = (EditText) u.b(u.c(view, R.id.et_block_code, "field 'editTextBlockCode'"), R.id.et_block_code, "field 'editTextBlockCode'", EditText.class);
        fragmentContactDetail.editTextAreaCode = (EditText) u.b(u.c(view, R.id.et_enumeration_area_code, "field 'editTextAreaCode'"), R.id.et_enumeration_area_code, "field 'editTextAreaCode'", EditText.class);
        fragmentContactDetail.editTextHouseholdNo = (EditText) u.b(u.c(view, R.id.household_no, "field 'editTextHouseholdNo'"), R.id.household_no, "field 'editTextHouseholdNo'", EditText.class);
        fragmentContactDetail.editTextStructureNo = (EditText) u.b(u.c(view, R.id.structure_no, "field 'editTextStructureNo'"), R.id.structure_no, "field 'editTextStructureNo'", EditText.class);
        fragmentContactDetail.editTextAddress = (EditText) u.b(u.c(view, R.id.address_of_house, "field 'editTextAddress'"), R.id.address_of_house, "field 'editTextAddress'", EditText.class);
        fragmentContactDetail.editTextMobile = (EditText) u.b(u.c(view, R.id.mobile_number, "field 'editTextMobile'"), R.id.mobile_number, "field 'editTextMobile'", EditText.class);
        fragmentContactDetail.editTextMobileRepeat = (EditText) u.b(u.c(view, R.id.mobile_number_repeat, "field 'editTextMobileRepeat'"), R.id.mobile_number_repeat, "field 'editTextMobileRepeat'", EditText.class);
        fragmentContactDetail.editTextNumberOfRoster = (EditText) u.b(u.c(view, R.id.number_of_roster, "field 'editTextNumberOfRoster'"), R.id.number_of_roster, "field 'editTextNumberOfRoster'", EditText.class);
        fragmentContactDetail.editTextAlternativeContact = (EditText) u.b(u.c(view, R.id.alternative_contact, "field 'editTextAlternativeContact'"), R.id.alternative_contact, "field 'editTextAlternativeContact'", EditText.class);
        fragmentContactDetail.radioGroupBispBenificiary = (RadioGroup) u.b(u.c(view, R.id.rg_bispBenificiary, "field 'radioGroupBispBenificiary'"), R.id.rg_bispBenificiary, "field 'radioGroupBispBenificiary'", RadioGroup.class);
        fragmentContactDetail.radioButtonbispBenificiaryYes = (RadioButton) u.b(u.c(view, R.id.rb_bispBenificiary_yes, "field 'radioButtonbispBenificiaryYes'"), R.id.rb_bispBenificiary_yes, "field 'radioButtonbispBenificiaryYes'", RadioButton.class);
        fragmentContactDetail.radioButtonbispBenificiaryNo = (RadioButton) u.b(u.c(view, R.id.rb_bispBenificiary_no, "field 'radioButtonbispBenificiaryNo'"), R.id.rb_bispBenificiary_no, "field 'radioButtonbispBenificiaryNo'", RadioButton.class);
        fragmentContactDetail.textViewTimeRemaining = (TextView) u.b(u.c(view, R.id.tv_time_remaining, "field 'textViewTimeRemaining'"), R.id.tv_time_remaining, "field 'textViewTimeRemaining'", TextView.class);
        fragmentContactDetail.btnMap = (Button) u.b(u.c(view, R.id.btn_map, "field 'btnMap'"), R.id.btn_map, "field 'btnMap'", Button.class);
        fragmentContactDetail.linearLayoutIsBispBenificiary = (LinearLayout) u.b(u.c(view, R.id.ll_is_bisp_benif, "field 'linearLayoutIsBispBenificiary'"), R.id.ll_is_bisp_benif, "field 'linearLayoutIsBispBenificiary'", LinearLayout.class);
        fragmentContactDetail.linearLayoutRosterCount = (LinearLayout) u.b(u.c(view, R.id.ll_roster_count, "field 'linearLayoutRosterCount'"), R.id.ll_roster_count, "field 'linearLayoutRosterCount'", LinearLayout.class);
        fragmentContactDetail.editTextReason = (EditText) u.b(u.c(view, R.id.reason, "field 'editTextReason'"), R.id.reason, "field 'editTextReason'", EditText.class);
        View viewC = u.c(view, R.id.iv_add_member, "method 'onAddMember'");
        this.view7f0a0200 = viewC;
        viewC.setOnClickListener(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail_ViewBinding.1
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.V.t
            public void doClick(View view2) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
                a = i3 % 128;
                int i4 = i3 % 2;
                fragmentContactDetail.onAddMember(view2);
                int i5 = a;
                int i6 = i5 & 123;
                int i7 = ((i5 | 123) & (~i6)) + (i6 << 1);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 38 / 0;
                }
            }
        });
        View viewC2 = u.c(view, R.id.iv_delete_member, "method 'onDeleteMember'");
        this.view7f0a020a = viewC2;
        viewC2.setOnClickListener(new t() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentContactDetail_ViewBinding.2
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.V.t
            public void doClick(View view2) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
                a = i3 % 128;
                int i4 = i3 % 2;
                fragmentContactDetail.onDeleteMember(view2);
                int i5 = b + 41;
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 0;
                }
            }
        });
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = b + 73;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        FragmentContactDetail fragmentContactDetail = this.target;
        if (fragmentContactDetail == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i5 = i3 & 75;
        int i6 = (i3 | 75) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        Object obj = null;
        this.target = null;
        fragmentContactDetail.textViewRegionLabel = null;
        fragmentContactDetail.radioGroupRegion = null;
        fragmentContactDetail.radioButtonRegionUrban = null;
        fragmentContactDetail.radioButtonRegionRural = null;
        int i10 = b;
        int i11 = ((i10 ^ 26) + ((i10 & 26) << 1)) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        fragmentContactDetail.sp_province = null;
        fragmentContactDetail.sp_district = null;
        fragmentContactDetail.sp_tehsil = null;
        fragmentContactDetail.textViewTempAddress = null;
        fragmentContactDetail.textViewPerAddress = null;
        fragmentContactDetail.sp_uc = null;
        int i13 = a;
        int i14 = (i13 ^ 37) + ((i13 & 37) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        fragmentContactDetail.et_uc = null;
        fragmentContactDetail.et_village = null;
        fragmentContactDetail.sp_village = null;
        fragmentContactDetail.spinnerVenue = null;
        fragmentContactDetail.sp_visitStatus = null;
        int i16 = b + 97;
        a = i16 % 128;
        int i17 = i16 % 2;
        fragmentContactDetail.sp_structureNumber = null;
        fragmentContactDetail.sp_motherLanguage = null;
        fragmentContactDetail.sp_networks = null;
        fragmentContactDetail.editTextNameOfHead = null;
        fragmentContactDetail.editTextBlockCode = null;
        fragmentContactDetail.editTextAreaCode = null;
        int i18 = a;
        int i19 = (i18 ^ 101) + ((i18 & 101) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        fragmentContactDetail.editTextHouseholdNo = null;
        fragmentContactDetail.editTextStructureNo = null;
        fragmentContactDetail.editTextAddress = null;
        fragmentContactDetail.editTextMobile = null;
        fragmentContactDetail.editTextMobileRepeat = null;
        int i21 = b;
        int i22 = (i21 & 1) + (i21 | 1);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            fragmentContactDetail.editTextNumberOfRoster = null;
            fragmentContactDetail.editTextAlternativeContact = null;
            fragmentContactDetail.radioGroupBispBenificiary = null;
            fragmentContactDetail.radioButtonbispBenificiaryYes = null;
            fragmentContactDetail.radioButtonbispBenificiaryNo = null;
            fragmentContactDetail.textViewTimeRemaining = null;
            throw null;
        }
        fragmentContactDetail.editTextNumberOfRoster = null;
        fragmentContactDetail.editTextAlternativeContact = null;
        fragmentContactDetail.radioGroupBispBenificiary = null;
        fragmentContactDetail.radioButtonbispBenificiaryYes = null;
        fragmentContactDetail.radioButtonbispBenificiaryNo = null;
        fragmentContactDetail.textViewTimeRemaining = null;
        int i23 = b;
        int i24 = i23 & 17;
        int i25 = -(-(i23 | 17));
        int i26 = (i24 & i25) + (i25 | i24);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            fragmentContactDetail.btnMap = null;
            fragmentContactDetail.linearLayoutIsBispBenificiary = null;
            fragmentContactDetail.linearLayoutRosterCount = null;
            fragmentContactDetail.editTextReason = null;
            this.view7f0a0200.setOnClickListener(null);
            obj.hashCode();
            throw null;
        }
        fragmentContactDetail.btnMap = null;
        fragmentContactDetail.linearLayoutIsBispBenificiary = null;
        fragmentContactDetail.linearLayoutRosterCount = null;
        fragmentContactDetail.editTextReason = null;
        this.view7f0a0200.setOnClickListener(null);
        int i27 = b;
        int i28 = i27 ^ 77;
        int i29 = (((i27 & 77) | i28) << 1) - i28;
        a = i29 % 128;
        int i30 = i29 % 2;
        this.view7f0a0200 = null;
        this.view7f0a020a.setOnClickListener(null);
        this.view7f0a020a = null;
        int i31 = a;
        int i32 = ((i31 & 50) + (i31 | 50)) - 1;
        b = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 21 / 0;
        }
    }
}
