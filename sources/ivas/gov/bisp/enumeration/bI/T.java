package ivas.gov.bisp.enumeration.bI;

import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class T implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public T(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    public class bwy implements ivas.gov.bisp.enumeration.W.J {
        private static int a = 1;
        private static int b;

        public bwy() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int optionId;
            ActivityRoster activityRoster;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                T.this.c.aJ = arrayList;
                i = 1;
            } else {
                T.this.c.aJ = arrayList;
                i = 0;
            }
            while (true) {
                if (i >= T.this.c.aJ.size()) {
                    int i6 = b + 47;
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 4 % 5;
                    }
                    i = 0;
                    break;
                }
                int i8 = a;
                int i9 = i8 ^ 99;
                int i10 = (i8 & 99) << 1;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                Item item = T.this.c.aJ.get(i);
                int i13 = a;
                int i14 = (i13 ^ 91) + ((i13 & 91) << 1);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    optionId = item.getOptionId();
                    activityRoster = T.this.c;
                    int i15 = 38 / 0;
                } else {
                    optionId = item.getOptionId();
                    activityRoster = T.this.c;
                }
                int i16 = a;
                int i17 = (i16 & (-14)) | ((~i16) & 13);
                int i18 = (i16 & 13) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                int i20 = i19 % 2;
                if (optionId == activityRoster.bk.marital_status) {
                    break;
                }
                int i21 = b;
                int i22 = (i21 ^ 31) + ((i21 & 31) << 1);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = i & 112;
                    int i24 = (i ^ 112) | i23;
                    i2 = (i23 & i24) + (i24 | i23);
                } else {
                    int i25 = i & 1;
                    int i26 = -(-((i ^ 1) | i25));
                    i2 = ((i25 | i26) << 1) - (i26 ^ i25);
                }
                i = i2;
            }
            T.this.c.sp_marital_status.setSelection(i);
            int i27 = b;
            int i28 = ((i27 & (-2)) | ((~i27) & 1)) + ((i27 & 1) << 1);
            a = i28 % 128;
            (i28 % 2 == 0 ? T.this.c : T.this.c).sp_marital_status.setEnabled(false);
        }
    }

    public class bwx implements ivas.gov.bisp.enumeration.W.J {
        private static int a = 0;
        private static int b = 1;

        public bwx() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 35;
            int i4 = -(-((i2 & 35) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            T.this.c.aO = arrayList;
            int i7 = 0;
            while (true) {
                if (i7 >= T.this.c.aO.size()) {
                    int i8 = b;
                    int i9 = i8 & 13;
                    int i10 = (((i8 ^ 13) | i9) << 1) - ((i8 | 13) & (~i9));
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    i7 = 0;
                    break;
                }
                int i12 = (-2) - ((b + 122) ^ (-1));
                a = i12 % 128;
                int i13 = i12 % 2;
                Item item = T.this.c.aO.get(i7);
                int i14 = b;
                int i15 = i14 & 125;
                int i16 = (i15 - (~((i14 ^ 125) | i15))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                int optionId = item.getOptionId();
                Roster roster = T.this.c.bk;
                int i18 = b + 45;
                a = i18 % 128;
                int i19 = i18 % 2;
                if (optionId == roster.disability) {
                    break;
                }
                int i20 = b;
                int i21 = ((i20 | 21) << 1) - (i20 ^ 21);
                a = i21 % 128;
                int i22 = i21 % 2;
                i7++;
                int i23 = i20 + 49;
                a = i23 % 128;
                int i24 = i23 % 2;
            }
            ActivityRoster activityRoster = T.this.c;
            int i25 = activityRoster.bk.disability;
            int i26 = a + 11;
            int i27 = i26 % 128;
            b = i27;
            if (i26 % 2 != 0 ? i25 == 6 : i25 == 89) {
                int i28 = (((i27 & (-20)) | ((~i27) & 19)) - (~((i27 & 19) << 1))) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                activityRoster.sp_disability.setEnabled(false);
                T t = T.this;
                int i30 = a + 33;
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    t.c.sp_disability.setSelection(0);
                } else {
                    t.c.sp_disability.setSelection(1);
                }
                int i31 = a + 17;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    throw null;
                }
                return;
            }
            activityRoster.sp_disability.setSelection(i7);
            ActivityRoster activityRoster2 = T.this.c;
            int i32 = a;
            int i33 = ((i32 ^ 99) | (i32 & 99)) << 1;
            int i34 = -(((~i32) & 99) | (i32 & (-100)));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            b = i35 % 128;
            if (i35 % 2 == 0) {
                activityRoster2.sp_disability.setEnabled(true);
            } else {
                activityRoster2.sp_disability.setEnabled(true);
            }
            int i36 = a;
            int i37 = (i36 & (-64)) | ((~i36) & 63);
            int i38 = (i36 & 63) << 1;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            b = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 39 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) throws ParseException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 99) + (i2 | 99);
        b = i3 % 128;
        int i4 = i3 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aM = arrayList;
        int i5 = b;
        int i6 = i5 & 21;
        int i7 = (i5 | 21) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            activityRoster.R(arrayList, activityRoster.sp_relation_to_household);
        } else {
            activityRoster.R(arrayList, activityRoster.sp_relation_to_household);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.aM.size()) {
                int i11 = b + 5;
                a = i11 % 128;
                int i12 = i11 % 2;
                i10 = -1;
                break;
            }
            int i13 = a;
            int i14 = i13 & 17;
            int i15 = (i13 | 17) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            if (this.c.aM.get(i10).getOptionId() == this.c.bk.relation_to_household_id) {
                break;
            }
            i10++;
            int i19 = b;
            int i20 = i19 & 25;
            int i21 = i19 | 25;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 2 / 4;
            }
        }
        if (i10 != -1) {
            int i24 = b;
            int i25 = i24 & 53;
            int i26 = ((i24 ^ 53) | i25) << 1;
            int i27 = -((i24 | 53) & (~i25));
            int i28 = (i26 & i27) + (i27 | i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            if (this.c.aM.get(i10).getOptionId() == 186) {
                int i30 = b;
                int i31 = (i30 & 87) + (i30 | 87);
                a = i31 % 128;
                int i32 = i31 % 2;
                this.c.sp_relation_to_household.setEnabled(true);
                ActivityRoster activityRoster2 = this.c;
                int i33 = a;
                int i34 = (i33 ^ 3) + ((i33 & 3) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
                activityRoster2.sp_relation_to_household.setSelection(i10);
                int i36 = b;
                int i37 = (((i36 & (-2)) | ((~i36) & 1)) - (~((i36 & 1) << 1))) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
            } else {
                this.c.sp_relation_to_household.setSelection(i10 - 1);
            }
        }
        ActivityRoster activityRoster3 = this.c;
        int i39 = activityRoster3.ac;
        Object obj = null;
        if ((i39 == 1 || i39 == 2 || ag.d) && !ag.g) {
            int i40 = a;
            int i41 = ((i40 | 83) << 1) - (i40 ^ 83);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                activityRoster3.bk.cnic_valid_name.equals(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (!(!activityRoster3.bk.cnic_valid_name.equals(BuildConfig.FLAVOR))) {
                this.c.ll_nadra_name.setVisibility(8);
                int i42 = b;
                int i43 = ((((i42 ^ 73) | (i42 & 73)) << 1) - (~(-(((~i42) & 73) | (i42 & (-74)))))) - 1;
                a = i43 % 128;
                int i44 = i43 % 2;
            } else {
                int i45 = b + 17;
                a = i45 % 128;
                int i46 = i45 % 2;
                this.c.ll_nadra_name.setVisibility(0);
                ActivityRoster activityRoster4 = this.c;
                activityRoster4.et_MemberName.setText(activityRoster4.bk.name_of_member);
                ActivityRoster activityRoster5 = this.c;
                TextView textView = activityRoster5.vald_name_txt_view;
                int i47 = b;
                int i48 = (((i47 | 106) << 1) - (i47 ^ 106)) - 1;
                a = i48 % 128;
                int i49 = i48 % 2;
                textView.setText(activityRoster5.bk.cnic_valid_name);
            }
            if (this.c.bk.date_of_birth.equals(BuildConfig.FLAVOR)) {
                this.c.radioGroupCalendar.setEnabled(true);
                int i50 = a;
                int i51 = i50 & 49;
                int i52 = ((i50 | 49) & (~i51)) + (i51 << 1);
                b = i52 % 128;
                int i53 = i52 % 2;
                this.c.radioButtonCalendarYes.setEnabled(true);
                ActivityRoster activityRoster6 = this.c;
                int i54 = b;
                int i55 = (((i54 | 6) << 1) - (i54 ^ 6)) - 1;
                a = i55 % 128;
                if (i55 % 2 != 0) {
                    activityRoster6.radioButtonCalendarNo.setEnabled(false);
                } else {
                    activityRoster6.radioButtonCalendarNo.setEnabled(true);
                }
                this.c.spinnerYear.setEnabled(true);
                this.c.spinnerMonth.setEnabled(true);
            } else {
                ActivityRoster activityRoster7 = this.c;
                TextView textView2 = activityRoster7.tv_dob;
                String str = activityRoster7.bk.date_of_birth;
                int i56 = b;
                int i57 = (i56 ^ 53) + ((i56 & 53) << 1);
                a = i57 % 128;
                int i58 = i57 % 2;
                textView2.setText(str);
                this.c.radioGroupCalendar.setEnabled(false);
                RadioButton radioButton = this.c.radioButtonCalendarYes;
                int i59 = a;
                int i60 = i59 & 63;
                int i61 = (i60 - (~(-(-((i59 ^ 63) | i60))))) - 1;
                b = i61 % 128;
                int i62 = i61 % 2;
                radioButton.setEnabled(false);
                this.c.radioButtonCalendarNo.setEnabled(false);
                Spinner spinner = this.c.spinnerYear;
                int i63 = b;
                int i64 = i63 & 9;
                int i65 = -(-(i63 | 9));
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                a = i66 % 128;
                int i67 = i66 % 2;
                spinner.setEnabled(false);
                this.c.spinnerMonth.setEnabled(false);
                try {
                    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(date.getTime());
                    int i68 = calendar.get(1);
                    int i69 = a;
                    int i70 = ((i69 ^ 13) | (i69 & 13)) << 1;
                    int i71 = -(((~i69) & 13) | (i69 & (-14)));
                    int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                    int i74 = calendar.get(2);
                    int i75 = calendar.get(5);
                    ActivityRoster activityRoster8 = this.c;
                    activityRoster8.aU = activityRoster8.H(i75, i74, i68, true);
                } catch (ParseException unused) {
                }
            }
            if (this.c.bk.gender.equalsIgnoreCase("male")) {
                int i76 = b;
                int i77 = i76 & 33;
                int i78 = -(-((i76 ^ 33) | i77));
                int i79 = (i77 & i78) + (i78 | i77);
                a = i79 % 128;
                int i80 = i79 % 2;
                this.c.radioButtonMale.setChecked(true);
                this.c.radioButtonFemale.setChecked(false);
                int i81 = a;
                int i82 = ((i81 & 24) + (i81 | 24)) - 1;
                b = i82 % 128;
                int i83 = i82 % 2;
                this.c.radioButtonTrans.setChecked(false);
                int i84 = a + 79;
                b = i84 % 128;
                if (i84 % 2 == 0) {
                    this.c.radioGroupGender.setEnabled(true);
                } else {
                    this.c.radioGroupGender.setEnabled(false);
                }
                this.c.radioButtonTrans.setEnabled(false);
                int i85 = a;
                int i86 = i85 & 33;
                int i87 = (i85 ^ 33) | i86;
                int i88 = (i86 & i87) + (i87 | i86);
                b = i88 % 128;
                int i89 = i88 % 2;
                this.c.radioButtonFemale.setEnabled(false);
                this.c.radioButtonMale.setEnabled(false);
            } else if (this.c.bk.gender.equalsIgnoreCase("female")) {
                this.c.radioButtonMale.setChecked(false);
                ActivityRoster activityRoster9 = this.c;
                int i90 = b;
                int i91 = ((i90 ^ 104) + ((i90 & 104) << 1)) - 1;
                a = i91 % 128;
                if (i91 % 2 != 0) {
                    activityRoster9.radioButtonFemale.setChecked(true);
                } else {
                    activityRoster9.radioButtonFemale.setChecked(true);
                }
                this.c.radioButtonTrans.setChecked(false);
                this.c.radioGroupGender.setEnabled(false);
                int i92 = a;
                int i93 = (((i92 | 14) << 1) - (i92 ^ 14)) - 1;
                b = i93 % 128;
                int i94 = i93 % 2;
                this.c.radioButtonTrans.setEnabled(false);
                ActivityRoster activityRoster10 = this.c;
                int i95 = b;
                int i96 = (i95 & (-76)) | ((~i95) & 75);
                int i97 = (i95 & 75) << 1;
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                a = i98 % 128;
                int i99 = i98 % 2;
                activityRoster10.radioButtonFemale.setEnabled(false);
                this.c.radioButtonMale.setEnabled(false);
                int i100 = b;
                int i101 = i100 & 123;
                int i102 = (((i100 | 123) & (~i101)) - (~(-(-(i101 << 1))))) - 1;
                a = i102 % 128;
                int i103 = i102 % 2;
            } else {
                String str2 = this.c.bk.gender;
                int i104 = b;
                int i105 = i104 & 121;
                int i106 = -(-((i104 ^ 121) | i105));
                int i107 = (i105 & i106) + (i106 | i105);
                a = i107 % 128;
                if (i107 % 2 != 0) {
                    str2.equalsIgnoreCase("transgender");
                    throw null;
                }
                if (str2.equalsIgnoreCase("transgender")) {
                    this.c.radioButtonMale.setChecked(false);
                    this.c.radioButtonFemale.setChecked(false);
                    RadioButton radioButton2 = this.c.radioButtonTrans;
                    int i108 = b;
                    int i109 = i108 & 105;
                    int i110 = i108 | 105;
                    int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    radioButton2.setChecked(true);
                    this.c.radioGroupGender.setEnabled(false);
                    int i113 = b;
                    int i114 = (i113 ^ 41) + ((i113 & 41) << 1);
                    a = i114 % 128;
                    int i115 = i114 % 2;
                    this.c.radioButtonTrans.setEnabled(false);
                    ActivityRoster activityRoster11 = this.c;
                    int i116 = a;
                    int i117 = i116 & 125;
                    int i118 = i117 + ((i116 ^ 125) | i117);
                    b = i118 % 128;
                    if (i118 % 2 == 0) {
                        activityRoster11.radioButtonFemale.setEnabled(true);
                    } else {
                        activityRoster11.radioButtonFemale.setEnabled(false);
                    }
                    this.c.radioButtonMale.setEnabled(false);
                } else if (!this.c.bk.gender.equalsIgnoreCase("eunuch male")) {
                    this.c.radioGroupGender.setEnabled(true);
                    ActivityRoster activityRoster12 = this.c;
                    int i119 = a;
                    int i120 = (((i119 ^ 47) | (i119 & 47)) << 1) - (((~i119) & 47) | (i119 & (-48)));
                    b = i120 % 128;
                    int i121 = i120 % 2;
                    activityRoster12.radioButtonTrans.setEnabled(true);
                    RadioButton radioButton3 = this.c.radioButtonFemale;
                    int i122 = b;
                    int i123 = (i122 ^ 45) + ((i122 & 45) << 1);
                    a = i123 % 128;
                    if (i123 % 2 != 0) {
                        radioButton3.setEnabled(true);
                        this.c.radioButtonMale.setEnabled(false);
                    } else {
                        radioButton3.setEnabled(true);
                        this.c.radioButtonMale.setEnabled(true);
                    }
                } else {
                    int i124 = b;
                    int i125 = i124 & 41;
                    int i126 = ((i124 | 41) & (~i125)) + (i125 << 1);
                    a = i126 % 128;
                    int i127 = i126 % 2;
                    this.c.radioButtonMale.setChecked(false);
                    RadioButton radioButton4 = this.c.radioButtonFemale;
                    int i128 = a;
                    int i129 = i128 & 79;
                    int i130 = i129 + ((i128 ^ 79) | i129);
                    b = i130 % 128;
                    if (i130 % 2 == 0) {
                        radioButton4.setChecked(false);
                        this.c.radioButtonTrans.setChecked(false);
                    } else {
                        radioButton4.setChecked(false);
                        this.c.radioButtonTrans.setChecked(true);
                    }
                    int i131 = a;
                    int i132 = i131 ^ 115;
                    int i133 = ((i131 & 115) | i132) << 1;
                    int i134 = -i132;
                    int i135 = (i133 & i134) + (i133 | i134);
                    b = i135 % 128;
                    if (i135 % 2 == 0) {
                        this.c.radioGroupGender.setEnabled(false);
                    } else {
                        this.c.radioGroupGender.setEnabled(false);
                    }
                    this.c.radioButtonTrans.setEnabled(false);
                    this.c.radioButtonFemale.setEnabled(false);
                    this.c.radioButtonMale.setEnabled(false);
                }
            }
            ActivityRoster activityRoster13 = this.c;
            new au(activityRoster13, "disability_status", activityRoster13.getResources().getString(ivas.gov.bisp.enumeration.R.string.disablity_status), this.c.sp_disability, new bwx()).execute(new Void[0]);
            int i136 = a;
            int i137 = ((i136 | 81) << 1) - (i136 ^ 81);
            b = i137 % 128;
            if (i137 % 2 == 0) {
                int i138 = this.c.bk.marital_status;
                throw null;
            }
            ActivityRoster activityRoster14 = this.c;
            int i139 = activityRoster14.bk.marital_status;
            if (i139 == 200 || i139 == 201 || i139 == 202 || i139 == 203) {
                ActivityRoster activityRoster15 = this.c;
                new au(activityRoster15, "marital_status", activityRoster15.getResources().getString(ivas.gov.bisp.enumeration.R.string.marital_status), this.c.sp_marital_status, new bwy()).execute(new Void[0]);
            } else {
                int i140 = a + 75;
                b = i140 % 128;
                int i141 = i140 % 2;
                activityRoster14.sp_marital_status.setEnabled(true);
            }
            if (!this.c.bk.cnic.equals(BuildConfig.FLAVOR)) {
                int i142 = a;
                int i143 = i142 & 5;
                int i144 = (i142 ^ 5) | i143;
                int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                b = i145 % 128;
                int i146 = i145 % 2;
                ActivityRoster activityRoster16 = this.c;
                String str3 = activityRoster16.bk.cnic;
                int i147 = a + 44;
                int i148 = (i147 ^ (-1)) + (i147 << 1);
                b = i148 % 128;
                if (i148 % 2 == 0) {
                    activityRoster16.et_RosterCNIC.setText(str3);
                    obj.hashCode();
                    throw null;
                }
                activityRoster16.et_RosterCNIC.setText(str3);
                this.c.et_RosterCNICRepeat.setText(str3);
                int i149 = a;
                int i150 = i149 & 117;
                int i151 = i150 + ((i149 ^ 117) | i150);
                b = i151 % 128;
                int i152 = i151 % 2;
            }
            this.c.sp_relation_to_household.setSelection(0);
            this.c.linearLayoutCNIC.setVisibility(0);
            this.c.et_MemberName.setEnabled(true);
            int i153 = a;
            int i154 = i153 & 67;
            int i155 = -(-((i153 ^ 67) | i154));
            int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
            b = i156 % 128;
            int i157 = i156 % 2;
            this.c.sp_relation_to_household.setEnabled(true);
            int i158 = b;
            int i159 = i158 ^ 53;
            int i160 = (((i158 & 53) | i159) << 1) - i159;
            a = i160 % 128;
            int i161 = i160 % 2;
        }
        if (ag.g) {
            int i162 = a + 27;
            b = i162 % 128;
            int i163 = i162 % 2 == 0 ? 1 : 0;
            while (i163 < this.c.aM.size()) {
                int i164 = b + 93;
                a = i164 % 128;
                if (i164 % 2 != 0) {
                    this.c.aM.get(i163);
                    obj.hashCode();
                    throw null;
                }
                if (this.c.aM.get(i163).getOptionId() == 186) {
                    ActivityRoster activityRoster17 = this.c;
                    if (!activityRoster17.aX) {
                        activityRoster17.aM.remove(i163);
                        break;
                    }
                    int i165 = a;
                    int i166 = i165 & 121;
                    int i167 = i166 + ((i165 ^ 121) | i166);
                    b = i167 % 128;
                    int i168 = i167 % 2;
                    if (activityRoster17.aW != -1) {
                        int i169 = a;
                        int i170 = (((i169 ^ 81) | (i169 & 81)) << 1) - (((~i169) & 81) | (i169 & (-82)));
                        b = i170 % 128;
                        int i171 = i170 % 2;
                        if (activityRoster17.bk.relation_to_household_id != 186) {
                            activityRoster17.aM.remove(i163);
                            int i172 = b;
                            int i173 = (i172 | 49) << 1;
                            int i174 = -(i172 ^ 49);
                            int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                            a = i175 % 128;
                            int i176 = i175 % 2;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                int i177 = i163 & 1;
                int i178 = (i163 ^ 1) | i177;
                i163 = (i178 | i177) + (i177 & i178);
                int i179 = b;
                int i180 = i179 & 19;
                int i181 = (((i179 ^ 19) | i180) << 1) - ((i179 | 19) & (~i180));
                a = i181 % 128;
                int i182 = i181 % 2;
            }
        }
        ActivityRoster activityRoster18 = this.c;
        if (!activityRoster18.aX) {
            return;
        }
        activityRoster18.S();
        int i183 = b;
        int i184 = i183 & 7;
        int i185 = ((i183 ^ 7) | i184) << 1;
        int i186 = -((i183 | 7) & (~i184));
        int i187 = (i185 ^ i186) + ((i186 & i185) << 1);
        a = i187 % 128;
        if (i187 % 2 != 0) {
            int i188 = 2 / 3;
        }
    }
}
