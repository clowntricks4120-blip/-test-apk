package ivas.gov.bisp.enumeration.bI;

import android.widget.EditText;
import android.widget.RadioButton;
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
public class Q implements ivas.gov.bisp.enumeration.W.J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public Q(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    public class bwq implements ivas.gov.bisp.enumeration.W.J {
        private static int a = 1;
        private static int b;

        public bwq() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-28)) | ((~i2) & 27)) + ((i2 & 27) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            Q.this.c.aJ = arrayList;
            int i5 = b + 45;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if (i7 >= Q.this.c.aJ.size()) {
                    int i8 = b;
                    int i9 = i8 & 1;
                    int i10 = i8 | 1;
                    int i11 = (i9 & i10) + (i10 | i9);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    i7 = 0;
                    break;
                }
                int i13 = a + 59;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    Q.this.c.aJ.get(i7);
                    throw null;
                }
                int optionId = Q.this.c.aJ.get(i7).getOptionId();
                ActivityRoster activityRoster = Q.this.c;
                int i14 = b;
                int i15 = i14 & 107;
                int i16 = (i14 | 107) & (~i15);
                int i17 = i15 << 1;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = activityRoster.bk.marital_status;
                    throw null;
                }
                if (optionId == activityRoster.bk.marital_status) {
                    break;
                }
                int i20 = a;
                int i21 = i20 & 45;
                int i22 = (((i20 | 45) & (~i21)) - (~(i21 << 1))) - 1;
                int i23 = i22 % 128;
                b = i23;
                if (i22 % 2 != 0) {
                    i7 = (i7 ^ 71) + ((i7 & 71) << 1);
                } else {
                    int i24 = i7 ^ 1;
                    int i25 = -(-((i7 & 1) << 1));
                    i7 = ((i24 | i25) << 1) - (i25 ^ i24);
                }
                int i26 = i23 + 41;
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            Q.this.c.sp_marital_status.setSelection(i7);
            Q q = Q.this;
            int i28 = a + 29;
            b = i28 % 128;
            int i29 = i28 % 2;
            q.c.sp_marital_status.setEnabled(false);
            int i30 = b + 87;
            a = i30 % 128;
            if (i30 % 2 == 0) {
                throw null;
            }
        }
    }

    public class bwp implements ivas.gov.bisp.enumeration.W.J {
        private static int a = 0;
        private static int b = 1;

        public bwp() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 | 15) << 1) - (i4 ^ 15);
            b = i5 % 128;
            int i6 = i5 % 2;
            Q.this.c.aO = arrayList;
            int i7 = a;
            int i8 = i7 & 95;
            int i9 = (i8 - (~(-(-((i7 ^ 95) | i8))))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 3;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= Q.this.c.aO.size()) {
                    int i12 = b;
                    int i13 = (-2) - ((((i12 | 4) << 1) - (i12 ^ 4)) ^ (-1));
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    i11 = 0;
                    break;
                }
                int i15 = a;
                int i16 = ((i15 | 109) << 1) - (i15 ^ 109);
                b = i16 % 128;
                int i17 = i16 % 2;
                Item item = Q.this.c.aO.get(i11);
                int i18 = a;
                int i19 = i18 & 67;
                int i20 = ((i18 | 67) & (~i19)) + (i19 << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
                int optionId = item.getOptionId();
                Roster roster = Q.this.c.bk;
                int i22 = b;
                int i23 = i22 & 77;
                int i24 = (i22 | 77) & (~i23);
                int i25 = -(-(i23 << 1));
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 29 / 0;
                    if (optionId == roster.disability) {
                        break;
                    }
                    int i28 = b;
                    int i29 = ((i28 ^ 9) | (i28 & 9)) << 1;
                    int i30 = -(((~i28) & 9) | (i28 & (-10)));
                    i = (i29 & i30) + (i30 | i29);
                    a = i % 128;
                    if (i % 2 != 0) {
                        i2 = ((i11 & 74) - (~(i11 | 74))) - 1;
                    } else {
                        int i31 = ((i11 ^ 45) - (~((i11 & 45) << 1))) - 1;
                        int i32 = i31 & (-44);
                        i2 = ((i31 | (-44)) & (~i32)) + (i32 << 1);
                    }
                    i11 = i2;
                } else {
                    if (optionId == roster.disability) {
                        break;
                    }
                    int i210 = b;
                    int i211 = ((i210 ^ 9) | (i210 & 9)) << 1;
                    int i33 = -(((~i210) & 9) | (i210 & (-10)));
                    i = (i211 & i33) + (i33 | i211);
                    a = i % 128;
                    if (i % 2 != 0) {
                        i2 = ((i11 & 74) - (~(i11 | 74))) - 1;
                    } else {
                        int i34 = ((i11 ^ 45) - (~((i11 & 45) << 1))) - 1;
                        int i35 = i34 & (-44);
                        i2 = ((i34 | (-44)) & (~i35)) + (i35 << 1);
                    }
                    i11 = i2;
                }
            }
            ActivityRoster activityRoster = Q.this.c;
            Roster roster2 = activityRoster.bk;
            int i36 = a;
            int i37 = (i36 ^ 53) + ((i36 & 53) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
            if (roster2.disability == 6) {
                int i39 = b;
                int i40 = ((i39 | 73) << 1) - (i39 ^ 73);
                a = i40 % 128;
                int i41 = i40 % 2;
                activityRoster.sp_disability.setEnabled(false);
                Q.this.c.sp_disability.setSelection(1);
                int i42 = b;
                int i43 = (i42 ^ 123) + ((i42 & 123) << 1);
                a = i43 % 128;
                if (i43 % 2 != 0) {
                    int i44 = 21 / 0;
                    return;
                }
                return;
            }
            activityRoster.sp_disability.setSelection(i11);
            Q q = Q.this;
            int i45 = b;
            int i46 = i45 ^ 95;
            int i47 = ((i45 & 95) | i46) << 1;
            int i48 = -i46;
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            a = i49 % 128;
            int i50 = i49 % 2;
            q.c.sp_disability.setEnabled(true);
            int i51 = b + 36;
            int i52 = (i51 ^ (-1)) + (i51 << 1);
            a = i52 % 128;
            int i53 = i52 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0445  */
    /* JADX WARN: Code duplicated, block: B:80:0x047c  */
    /* JADX WARN: Code duplicated, block: B:88:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x04c9  */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2;
        int optionId;
        int i3 = 2 % 2;
        ActivityRoster activityRoster = this.c;
        activityRoster.aM = arrayList;
        int i4 = b;
        int i5 = ((i4 ^ 62) + ((i4 & 62) << 1)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        activityRoster.bN.V = arrayList;
        int i7 = activityRoster.ac;
        int i8 = b;
        int i9 = (i8 ^ 71) + ((i8 & 71) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        if ((i7 == 1 || i7 == 2 || !(!ag.d)) && (!ag.g)) {
            int i11 = b;
            int i12 = i11 & 77;
            int i13 = (i12 - (~((i11 ^ 77) | i12))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            if (activityRoster.bk.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                this.c.ll_nadra_name.setVisibility(8);
            } else {
                this.c.ll_nadra_name.setVisibility(0);
                ActivityRoster activityRoster2 = this.c;
                int i15 = b + 65;
                a = i15 % 128;
                int i16 = i15 % 2;
                activityRoster2.et_MemberName.setText(activityRoster2.bk.name_of_member);
                ActivityRoster activityRoster3 = this.c;
                int i17 = a;
                int i18 = (i17 ^ 73) + ((i17 & 73) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                TextView textView = activityRoster3.vald_name_txt_view;
                String str = activityRoster3.bk.cnic_valid_name;
                int i20 = a;
                int i21 = i20 ^ 111;
                int i22 = ((i20 & 111) | i21) << 1;
                int i23 = -i21;
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                b = i24 % 128;
                int i25 = i24 % 2;
                textView.setText(str);
            }
            if (this.c.bk.date_of_birth.equals(BuildConfig.FLAVOR)) {
                this.c.radioGroupCalendar.setEnabled(true);
                this.c.radioButtonCalendarYes.setEnabled(true);
                RadioButton radioButton = this.c.radioButtonCalendarNo;
                int i26 = a;
                int i27 = i26 & 81;
                int i28 = -(-((i26 ^ 81) | i27));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                b = i29 % 128;
                int i30 = i29 % 2;
                radioButton.setEnabled(true);
                this.c.spinnerYear.setEnabled(true);
                int i31 = a + 91;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    this.c.spinnerMonth.setEnabled(false);
                } else {
                    this.c.spinnerMonth.setEnabled(true);
                }
                int i32 = (-2) - ((a + 54) ^ (-1));
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 3 / 2;
                }
            } else {
                int i34 = a;
                int i35 = (i34 ^ 11) + ((i34 & 11) << 1);
                b = i35 % 128;
                int i36 = i35 % 2;
                ActivityRoster activityRoster4 = this.c;
                activityRoster4.tv_dob.setText(activityRoster4.bk.date_of_birth);
                this.c.radioGroupCalendar.setEnabled(false);
                RadioButton radioButton2 = this.c.radioButtonCalendarYes;
                int i37 = a;
                int i38 = i37 & 109;
                int i39 = (i37 | 109) & (~i38);
                int i40 = -(-(i38 << 1));
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    radioButton2.setEnabled(false);
                    this.c.radioButtonCalendarNo.setEnabled(true);
                } else {
                    radioButton2.setEnabled(false);
                    this.c.radioButtonCalendarNo.setEnabled(false);
                }
                this.c.spinnerYear.setEnabled(false);
                this.c.spinnerMonth.setEnabled(false);
                try {
                    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                    int i42 = b + 74;
                    int i43 = (i42 ^ (-1)) + (i42 << 1);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(date.getTime());
                    int i45 = calendar.get(1);
                    int i46 = calendar.get(2);
                    int i47 = calendar.get(5);
                    ActivityRoster activityRoster5 = this.c;
                    int i48 = a;
                    int i49 = (i48 ^ 90) + ((i48 & 90) << 1);
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    b = i50 % 128;
                    activityRoster5.aU = i50 % 2 == 0 ? activityRoster5.H(i47, i46, i45, false) : activityRoster5.H(i47, i46, i45, true);
                } catch (ParseException unused) {
                }
            }
            if (this.c.bk.gender.equalsIgnoreCase("male")) {
                int i51 = b + 5;
                a = i51 % 128;
                int i52 = i51 % 2;
                this.c.radioButtonMale.setChecked(true);
                ActivityRoster activityRoster6 = this.c;
                int i53 = b;
                int i54 = i53 & 123;
                int i55 = (i53 ^ 123) | i54;
                int i56 = (i54 & i55) + (i55 | i54);
                a = i56 % 128;
                if (i56 % 2 != 0) {
                    activityRoster6.radioButtonFemale.setChecked(true);
                } else {
                    activityRoster6.radioButtonFemale.setChecked(false);
                }
                this.c.radioButtonTrans.setChecked(false);
                this.c.radioGroupGender.setEnabled(false);
                this.c.radioButtonTrans.setEnabled(false);
                ActivityRoster activityRoster7 = this.c;
                int i57 = b;
                int i58 = i57 & 45;
                int i59 = (i58 - (~((i57 ^ 45) | i58))) - 1;
                a = i59 % 128;
                int i60 = i59 % 2;
                activityRoster7.radioButtonFemale.setEnabled(false);
                this.c.radioButtonMale.setEnabled(false);
            } else if (this.c.bk.gender.equalsIgnoreCase("female")) {
                int i61 = b + 97;
                a = i61 % 128;
                int i62 = i61 % 2;
                this.c.radioButtonMale.setChecked(false);
                this.c.radioButtonFemale.setChecked(true);
                RadioButton radioButton3 = this.c.radioButtonTrans;
                int i63 = a;
                int i64 = (i63 & 15) + (i63 | 15);
                b = i64 % 128;
                if (i64 % 2 == 0) {
                    radioButton3.setChecked(false);
                } else {
                    radioButton3.setChecked(false);
                }
                this.c.radioGroupGender.setEnabled(false);
                this.c.radioButtonTrans.setEnabled(false);
                RadioButton radioButton4 = this.c.radioButtonFemale;
                int i65 = b;
                int i66 = i65 & 85;
                int i67 = i66 + ((i65 ^ 85) | i66);
                a = i67 % 128;
                if (i67 % 2 != 0) {
                    radioButton4.setEnabled(false);
                } else {
                    radioButton4.setEnabled(false);
                }
                this.c.radioButtonMale.setEnabled(false);
            } else {
                String str2 = this.c.bk.gender;
                int i68 = b + 87;
                a = i68 % 128;
                int i69 = i68 % 2;
                if (!(!str2.equalsIgnoreCase("transgender"))) {
                    this.c.radioButtonMale.setChecked(false);
                    ActivityRoster activityRoster8 = this.c;
                    int i70 = a;
                    int i71 = ((i70 & 2) + (i70 | 2)) - 1;
                    b = i71 % 128;
                    int i72 = i71 % 2;
                    activityRoster8.radioButtonFemale.setChecked(false);
                    RadioButton radioButton5 = this.c.radioButtonTrans;
                    int i73 = a + 65;
                    b = i73 % 128;
                    int i74 = i73 % 2;
                    radioButton5.setChecked(true);
                    this.c.radioGroupGender.setEnabled(false);
                    this.c.radioButtonTrans.setEnabled(false);
                    this.c.radioButtonFemale.setEnabled(false);
                    this.c.radioButtonMale.setEnabled(false);
                    int i75 = a;
                    int i76 = i75 & 115;
                    int i77 = (i75 | 115) & (~i76);
                    int i78 = -(-(i76 << 1));
                    int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                    b = i79 % 128;
                    int i80 = i79 % 2;
                } else if (this.c.bk.gender.equalsIgnoreCase("eunuch male")) {
                    this.c.radioButtonMale.setChecked(false);
                    this.c.radioButtonFemale.setChecked(false);
                    int i81 = b;
                    int i82 = ((i81 | 59) << 1) - (i81 ^ 59);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    this.c.radioButtonTrans.setChecked(true);
                    this.c.radioGroupGender.setEnabled(false);
                    this.c.radioButtonTrans.setEnabled(false);
                    this.c.radioButtonFemale.setEnabled(false);
                    int i84 = b;
                    int i85 = (i84 ^ 17) + ((i84 & 17) << 1);
                    a = i85 % 128;
                    int i86 = i85 % 2;
                    this.c.radioButtonMale.setEnabled(false);
                } else {
                    this.c.radioGroupGender.setEnabled(true);
                    int i87 = b;
                    int i88 = (i87 & 91) + (i87 | 91);
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    this.c.radioButtonTrans.setEnabled(true);
                    this.c.radioButtonFemale.setEnabled(true);
                    int i90 = a;
                    int i91 = (i90 & 81) + (i90 | 81);
                    b = i91 % 128;
                    int i92 = i91 % 2;
                    this.c.radioButtonMale.setEnabled(true);
                }
            }
            ActivityRoster activityRoster9 = this.c;
            new au(activityRoster9, "disability_status", activityRoster9.getResources().getString(ivas.gov.bisp.enumeration.R.string.disablity_status), this.c.sp_disability, new bwp()).execute(new Void[0]);
            int i93 = a;
            int i94 = i93 & 13;
            int i95 = i94 + ((i93 ^ 13) | i94);
            b = i95 % 128;
            int i96 = i95 % 2;
            ActivityRoster activityRoster10 = this.c;
            int i97 = activityRoster10.bk.marital_status;
            int i98 = a;
            int i99 = i98 ^ 11;
            int i100 = (((i98 & 11) | i99) << 1) - i99;
            b = i100 % 128;
            int i101 = i100 % 2;
            if (i97 != 200) {
                int i102 = (-2) - (((i98 ^ 62) + ((i98 & 62) << 1)) ^ (-1));
                int i103 = i102 % 128;
                b = i103;
                int i104 = i102 % 2;
                if (i97 != 201) {
                    int i105 = i103 & 11;
                    int i106 = ((~i105) & (i103 | 11)) + (i105 << 1);
                    a = i106 % 128;
                    int i107 = i106 % 2;
                    if (i97 != 202) {
                        int i108 = ((i103 | 101) << 1) - (i103 ^ 101);
                        a = i108 % 128;
                        if (i108 % 2 == 0 ? i97 == 203 : i97 == 24904) {
                            ActivityRoster activityRoster11 = this.c;
                            new au(activityRoster11, "marital_status", activityRoster11.getResources().getString(ivas.gov.bisp.enumeration.R.string.marital_status), this.c.sp_marital_status, new bwq()).execute(new Void[0]);
                            int i109 = b;
                            int i110 = i109 & 85;
                            i = (((i109 ^ 85) | i110) << 1) - ((i109 | 85) & (~i110));
                            a = i % 128;
                            if (i % 2 != 0) {
                                int i111 = 3 % 2;
                            }
                        } else {
                            activityRoster10.sp_marital_status.setEnabled(true);
                            int i112 = a;
                            int i113 = (((i112 & (-64)) | ((~i112) & 63)) - (~((i112 & 63) << 1))) - 1;
                            b = i113 % 128;
                            int i114 = i113 % 2;
                        }
                    } else {
                        ActivityRoster activityRoster12 = this.c;
                        new au(activityRoster12, "marital_status", activityRoster12.getResources().getString(ivas.gov.bisp.enumeration.R.string.marital_status), this.c.sp_marital_status, new bwq()).execute(new Void[0]);
                        int i1010 = b;
                        int i115 = i1010 & 85;
                        i = (((i1010 ^ 85) | i115) << 1) - ((i1010 | 85) & (~i115));
                        a = i % 128;
                        if (i % 2 != 0) {
                            int i116 = 3 % 2;
                        }
                    }
                } else {
                    ActivityRoster activityRoster13 = this.c;
                    new au(activityRoster13, "marital_status", activityRoster13.getResources().getString(ivas.gov.bisp.enumeration.R.string.marital_status), this.c.sp_marital_status, new bwq()).execute(new Void[0]);
                    int i1011 = b;
                    int i117 = i1011 & 85;
                    i = (((i1011 ^ 85) | i117) << 1) - ((i1011 | 85) & (~i117));
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i118 = 3 % 2;
                    }
                }
            } else {
                ActivityRoster activityRoster14 = this.c;
                new au(activityRoster14, "marital_status", activityRoster14.getResources().getString(ivas.gov.bisp.enumeration.R.string.marital_status), this.c.sp_marital_status, new bwq()).execute(new Void[0]);
                int i1012 = b;
                int i119 = i1012 & 85;
                i = (((i1012 ^ 85) | i119) << 1) - ((i1012 | 85) & (~i119));
                a = i % 128;
                if (i % 2 != 0) {
                    int i1110 = 3 % 2;
                }
            }
            String str3 = this.c.bk.cnic;
            int i120 = b;
            int i121 = i120 ^ 61;
            int i122 = ((((i120 & 61) | i121) << 1) - (~(-i121))) - 1;
            a = i122 % 128;
            if (i122 % 2 != 0) {
                int i123 = 36 / 0;
                if (!str3.equals(BuildConfig.FLAVOR)) {
                    int i124 = a;
                    i2 = (i124 ^ 7) + ((i124 & 7) << 1);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        ActivityRoster activityRoster15 = this.c;
                        String str4 = activityRoster15.bk.cnic;
                        EditText editText = activityRoster15.et_RosterCNIC;
                        obj.hashCode();
                        throw null;
                    }
                    ActivityRoster activityRoster16 = this.c;
                    String str5 = activityRoster16.bk.cnic;
                    activityRoster16.et_RosterCNIC.setText(str5);
                    this.c.et_RosterCNICRepeat.setText(str5);
                }
            } else if (!str3.equals(BuildConfig.FLAVOR)) {
                int i125 = a;
                i2 = (i125 ^ 7) + ((i125 & 7) << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    ActivityRoster activityRoster17 = this.c;
                    String str6 = activityRoster17.bk.cnic;
                    EditText editText2 = activityRoster17.et_RosterCNIC;
                    obj.hashCode();
                    throw null;
                }
                ActivityRoster activityRoster18 = this.c;
                String str7 = activityRoster18.bk.cnic;
                activityRoster18.et_RosterCNIC.setText(str7);
                this.c.et_RosterCNICRepeat.setText(str7);
            }
            int i126 = 0;
            while (true) {
                if (i126 >= this.c.aM.size()) {
                    int i127 = b + 97;
                    a = i127 % 128;
                    int i128 = i127 % 2;
                    i126 = 0;
                    break;
                }
                int i129 = a;
                int i130 = (i129 & 99) + (i129 | 99);
                b = i130 % 128;
                int i131 = i130 % 2;
                Item item = this.c.aM.get(i126);
                int i132 = a;
                int i133 = ((i132 ^ 114) + ((i132 & 114) << 1)) - 1;
                b = i133 % 128;
                if (i133 % 2 == 0) {
                    item.getOptionId();
                    Roster roster = this.c.bk;
                    obj.hashCode();
                    throw null;
                }
                if (item.getOptionId() == this.c.bk.relation_to_household_id) {
                    break;
                }
                int i134 = (i126 & (-2)) | ((~i126) & 1);
                int i135 = -(-((i126 & 1) << 1));
                i126 = (i135 | i134) + (i134 & i135);
                int i136 = b;
                int i137 = (i136 ^ 83) + ((i136 & 83) << 1);
                a = i137 % 128;
                int i138 = i137 % 2;
            }
            this.c.sp_relation_to_household.setSelection(i126);
            ActivityRoster activityRoster19 = this.c;
            int i139 = b + 99;
            a = i139 % 128;
            int i140 = i139 % 2;
            activityRoster19.linearLayoutCNIC.setVisibility(0);
            EditText editText3 = this.c.et_MemberName;
            int i141 = a;
            int i142 = (i141 | 77) << 1;
            int i143 = -(((~i141) & 77) | (i141 & (-78)));
            int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
            b = i144 % 128;
            if (i144 % 2 == 0) {
                editText3.setEnabled(true);
                this.c.sp_relation_to_household.setEnabled(false);
            } else {
                editText3.setEnabled(true);
                this.c.sp_relation_to_household.setEnabled(true);
            }
        }
        if (!(!ag.g)) {
            int i145 = b + 91;
            a = i145 % 128;
            int i146 = i145 % 2;
            int i147 = 0;
            while (i147 < this.c.aM.size()) {
                int i148 = b + 25;
                a = i148 % 128;
                if (i148 % 2 != 0) {
                    optionId = this.c.aM.get(i147).getOptionId();
                    int i149 = 50 / 0;
                } else {
                    optionId = this.c.aM.get(i147).getOptionId();
                }
                if (optionId == 186) {
                    int i150 = a;
                    int i151 = i150 & 37;
                    int i152 = (i150 | 37) & (~i151);
                    int i153 = -(-(i151 << 1));
                    int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                    b = i154 % 128;
                    int i155 = i154 % 2;
                    ActivityRoster activityRoster20 = this.c;
                    if (!activityRoster20.aX) {
                        activityRoster20.aM.remove(i147);
                        int i156 = a;
                        int i157 = i156 & 123;
                        int i158 = (i157 - (~(-(-((i156 ^ 123) | i157))))) - 1;
                        b = i158 % 128;
                        int i159 = i158 % 2;
                        return;
                    }
                    int i160 = b;
                    int i161 = ((i160 | 41) << 1) - (((~i160) & 41) | (i160 & (-42)));
                    a = i161 % 128;
                    int i162 = i161 % 2;
                    if (activityRoster20.aW != -1) {
                        int i163 = a;
                        int i164 = i163 & 103;
                        int i165 = (i164 - (~((i163 ^ 103) | i164))) - 1;
                        b = i165 % 128;
                        if (i165 % 2 == 0) {
                            if (activityRoster20.bk.relation_to_household_id != 2252) {
                                activityRoster20.aM.remove(i147);
                                return;
                            }
                        } else if (activityRoster20.bk.relation_to_household_id != 186) {
                            activityRoster20.aM.remove(i147);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                i147++;
                int i166 = b;
                int i167 = ((i166 ^ 49) - (~(-(-((i166 & 49) << 1))))) - 1;
                a = i167 % 128;
                int i168 = i167 % 2;
            }
        }
        int i169 = a;
        int i170 = (i169 & (-32)) | ((~i169) & 31);
        int i171 = -(-((i169 & 31) << 1));
        int i172 = ((i170 | i171) << 1) - (i171 ^ i170);
        b = i172 % 128;
        if (i172 % 2 == 0) {
            throw null;
        }
    }
}
