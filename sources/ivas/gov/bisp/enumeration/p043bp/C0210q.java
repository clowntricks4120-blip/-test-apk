package ivas.gov.bisp.enumeration.p043bp;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.Roster;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0210q implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public C0210q(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.q$bpV */
    public class bpV implements J {
        private static int a = 1;
        private static int b;

        public bpV() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b + 99;
            a = i2 % 128;
            int i3 = i2 % 2;
            C0210q.this.c.aN = arrayList;
            int i4 = b;
            int i5 = (i4 & 34) + (i4 | 34);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (true) {
                if (i8 >= C0210q.this.c.aN.size()) {
                    int i9 = b;
                    int i10 = i9 & 47;
                    int i11 = -(-(i9 | 47));
                    int i12 = (i10 & i11) + (i11 | i10);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    i8 = 0;
                    break;
                }
                int i14 = a + 43;
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    C0210q.this.c.aN.get(i8);
                    throw null;
                }
                Item item = C0210q.this.c.aN.get(i8);
                int i15 = b;
                int i16 = (i15 & (-78)) | ((~i15) & 77);
                int i17 = (i15 & 77) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                int optionId = item.getOptionId();
                Roster roster = C0210q.this.c.bn;
                int i20 = b;
                int i21 = i20 & 79;
                int i22 = i21 + ((i20 ^ 79) | i21);
                a = i22 % 128;
                int i23 = i22 % 2;
                if (optionId == roster.disability) {
                    break;
                }
                int i24 = b;
                int i25 = (i24 ^ 113) + ((i24 & 113) << 1);
                int i26 = i25 % 128;
                a = i26;
                int i27 = i25 % 2;
                int i28 = i8 & 1;
                int i29 = (i8 | 1) & (~i28);
                int i30 = -(-(i28 << 1));
                i8 = ((i29 & i30) << 1) + (i29 ^ i30);
                int i31 = (((i26 | 36) << 1) - (i26 ^ 36)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            ActivityRoster activityRoster = C0210q.this.c;
            if (activityRoster.bn.disability != 6) {
                activityRoster.sp_disability.setSelection(i8);
                Spinner spinner = C0210q.this.c.sp_disability;
                int i33 = a;
                int i34 = (i33 & 44) + (i33 | 44);
                int i35 = (i34 ^ (-1)) + (i34 << 1);
                b = i35 % 128;
                int i36 = i35 % 2;
                spinner.setEnabled(true);
                int i37 = a;
                int i38 = ((i37 | 125) << 1) - (i37 ^ 125);
                b = i38 % 128;
                if (i38 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i39 = a;
            int i40 = i39 ^ 97;
            int i41 = (i39 & 97) << 1;
            int i42 = (i40 & i41) + (i41 | i40);
            b = i42 % 128;
            int i43 = i42 % 2;
            activityRoster.sp_disability.setEnabled(false);
            C0210q c0210q = C0210q.this;
            int i44 = b;
            int i45 = i44 & 123;
            int i46 = -(-((i44 ^ 123) | i45));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            a = i47 % 128;
            if (i47 % 2 == 0) {
                c0210q.c.sp_disability.setSelection(0);
            } else {
                c0210q.c.sp_disability.setSelection(1);
            }
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.q$bpW */
    public class bpW implements J {
        private static int a = 0;
        private static int b = 1;

        public bpW() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((((i4 ^ 57) | (i4 & 57)) << 1) - (~(-(((~i4) & 57) | (i4 & (-58)))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            C0210q.this.c.aI = arrayList;
            int i7 = a;
            int i8 = ((i7 ^ 80) + ((i7 & 80) << 1)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (true) {
                if (i10 >= C0210q.this.c.aI.size()) {
                    int i11 = b;
                    int i12 = ((i11 & (-6)) | ((~i11) & 5)) + ((i11 & 5) << 1);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    i10 = 0;
                    break;
                }
                int i14 = a;
                int i15 = ((i14 ^ 94) + ((i14 & 94) << 1)) - 1;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    C0210q.this.c.aI.get(i10);
                    throw null;
                }
                Item item = C0210q.this.c.aI.get(i10);
                int i16 = b + 118;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                int optionId = item.getOptionId();
                ActivityRoster activityRoster = C0210q.this.c;
                int i19 = a + 51;
                b = i19 % 128;
                int i20 = i19 % 2;
                if (optionId == activityRoster.bn.marital_status) {
                    break;
                }
                int i21 = a;
                int i22 = i21 + 45;
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    i = i10 & 29;
                    i2 = i10 | 29;
                } else {
                    int i23 = i10 + 2;
                    i = i23 ^ (-1);
                    i2 = i23 << 1;
                }
                i10 = i + i2;
                int i24 = i21 + 7;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            C0210q.this.c.sp_marital_status.setSelection(i10);
            C0210q c0210q = C0210q.this;
            int i26 = b;
            int i27 = i26 & 69;
            int i28 = i27 + ((i26 ^ 69) | i27);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                c0210q.c.sp_marital_status.setEnabled(true);
            } else {
                c0210q.c.sp_marital_status.setEnabled(false);
            }
            int i29 = b;
            int i30 = i29 & 43;
            int i31 = -(-(i29 | 43));
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            int i33 = i32 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0523  */
    /* JADX WARN: Code duplicated, block: B:104:0x053a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0565  */
    /* JADX WARN: Code duplicated, block: B:107:0x0570  */
    /* JADX WARN: Code duplicated, block: B:110:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0112  */
    /* JADX WARN: Code duplicated, block: B:28:0x011e  */
    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0154  */
    /* JADX WARN: Code duplicated, block: B:33:0x0163  */
    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x0195  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x022d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0231  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0333  */
    /* JADX WARN: Code duplicated, block: B:69:0x0341  */
    /* JADX WARN: Code duplicated, block: B:71:0x038a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0395  */
    /* JADX WARN: Code duplicated, block: B:75:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x042a  */
    /* JADX WARN: Code duplicated, block: B:84:0x042e  */
    /* JADX WARN: Code duplicated, block: B:86:0x043f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0476  */
    /* JADX WARN: Code duplicated, block: B:89:0x047e  */
    /* JADX WARN: Code duplicated, block: B:99:0x04e5  */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) throws ParseException {
        String str;
        Spinner spinner;
        int i;
        int i2;
        RadioButton radioButton;
        int i3;
        RadioButton radioButton2;
        int i4;
        RadioButton radioButton3;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        EditText editText;
        int i9;
        RadioButton radioButton4;
        int i10;
        ActivityRoster activityRoster;
        int i11;
        RadioButton radioButton5;
        int i12;
        int i13;
        EditText editText2;
        String str3;
        int i14;
        int i15 = 2 % 2;
        ActivityRoster activityRoster2 = this.c;
        activityRoster2.aL = arrayList;
        activityRoster2.E(arrayList, activityRoster2.sp_relation_to_household);
        int i16 = a;
        int i17 = (i16 | 59) << 1;
        int i18 = -(((~i16) & 59) | (i16 & (-60)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i22 >= this.c.aL.size()) {
                i22 = -1;
                break;
            }
            int i23 = b;
            int i24 = i23 & 19;
            int i25 = (i23 | 19) & (~i24);
            int i26 = i24 << 1;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            a = i27 % 128;
            int i28 = i27 % 2;
            int optionId = this.c.aL.get(i22).getOptionId();
            Roster roster = this.c.bn;
            int i29 = a + 119;
            b = i29 % 128;
            int i30 = i29 % 2;
            if (optionId == roster.relation_to_household_id) {
                break;
            }
            int i31 = a;
            int i32 = i31 & 15;
            int i33 = i31 | 15;
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            b = i34 % 128;
            int i35 = i34 % 2;
            int i36 = i22 - 99;
            int i37 = i36 & 100;
            int i38 = -(-((i36 ^ 100) | i37));
            i22 = ((i38 & i37) << 1) + (i37 ^ i38);
            int i39 = (i31 ^ 27) + ((i31 & 27) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
        }
        Object obj = null;
        if (i22 != -1) {
            int i41 = a + 35;
            b = i41 % 128;
            if (i41 % 2 == 0) {
                this.c.aL.get(i22);
                obj.hashCode();
                throw null;
            }
            if (this.c.aL.get(i22).getOptionId() == 186) {
                this.c.sp_relation_to_household.setEnabled(true);
                ActivityRoster activityRoster3 = this.c;
                int i42 = b + 57;
                a = i42 % 128;
                int i43 = i42 % 2;
                activityRoster3.sp_relation_to_household.setSelection(i22);
                int i44 = a;
                int i45 = i44 & 59;
                int i46 = (i44 ^ 59) | i45;
                int i47 = (i45 & i46) + (i46 | i45);
                b = i47 % 128;
                int i48 = i47 % 2;
            } else {
                Spinner spinner2 = this.c.sp_relation_to_household;
                int i49 = ~i22;
                int i50 = i22 << 1;
                spinner2.setSelection((i49 ^ i50) + ((i50 & i49) << 1));
            }
        }
        ActivityRoster activityRoster4 = this.c;
        int i51 = activityRoster4.ac;
        if (i51 != 1 && i51 != 2) {
            int i52 = a;
            int i53 = i52 ^ 27;
            int i54 = -(-((i52 & 27) << 1));
            int i55 = (i53 & i54) + (i54 | i53);
            b = i55 % 128;
            int i56 = i55 % 2;
            if (ag.d) {
                if (!ag.g) {
                    if (!activityRoster4.bn.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                        int i57 = a + 23;
                        b = i57 % 128;
                        int i58 = i57 % 2;
                        this.c.ll_nadra_name.setVisibility(0);
                        int i59 = a + 56;
                        i13 = (i59 ^ (-1)) + (i59 << 1);
                        b = i13 % 128;
                        if (i13 % 2 != 0) {
                            EditText editText3 = this.c.et_MemberName;
                            obj.hashCode();
                            throw null;
                        }
                        ActivityRoster activityRoster5 = this.c;
                        editText2 = activityRoster5.et_MemberName;
                        str3 = activityRoster5.bn.name_of_member;
                        int i60 = b;
                        int i61 = i60 & 65;
                        i14 = i61 + ((i60 ^ 65) | i61);
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            editText2.setText(str3);
                            TextView textView = this.c.vald_name_txt_view;
                            obj.hashCode();
                            throw null;
                        }
                        editText2.setText(str3);
                        ActivityRoster activityRoster6 = this.c;
                        activityRoster6.vald_name_txt_view.setText(activityRoster6.bn.cnic_valid_name);
                    } else {
                        this.c.ll_nadra_name.setVisibility(8);
                    }
                    str = this.c.bn.date_of_birth;
                    int i62 = b + 83;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                    if (!(!str.equals(BuildConfig.FLAVOR))) {
                        this.c.radioGroupCalendar.setEnabled(true);
                        activityRoster = this.c;
                        i11 = (-2) - ((b + 38) ^ (-1));
                        a = i11 % 128;
                        if (i11 % 2 != 0) {
                            activityRoster.radioButtonCalendarYes.setEnabled(false);
                        } else {
                            activityRoster.radioButtonCalendarYes.setEnabled(true);
                        }
                        radioButton5 = this.c.radioButtonCalendarNo;
                        int i64 = a;
                        int i65 = (i64 | 1) << 1;
                        int i66 = -(i64 ^ 1);
                        i12 = ((i65 | i66) << 1) - (i66 ^ i65);
                        b = i12 % 128;
                        if (i12 % 2 == 0) {
                            radioButton5.setEnabled(false);
                        } else {
                            radioButton5.setEnabled(true);
                        }
                        this.c.spinnerYear.setEnabled(true);
                        this.c.spinnerMonth.setEnabled(true);
                    } else {
                        ActivityRoster activityRoster7 = this.c;
                        TextView textView2 = activityRoster7.tv_dob;
                        String str4 = activityRoster7.bn.date_of_birth;
                        int i67 = b;
                        int i68 = i67 ^ 101;
                        int i69 = (i67 & 101) << 1;
                        int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                        a = i70 % 128;
                        int i71 = i70 % 2;
                        textView2.setText(str4);
                        this.c.radioGroupCalendar.setEnabled(false);
                        this.c.radioButtonCalendarYes.setEnabled(false);
                        this.c.radioButtonCalendarNo.setEnabled(false);
                        spinner = this.c.spinnerYear;
                        int i72 = a;
                        int i73 = i72 & 17;
                        int i74 = (i72 ^ 17) | i73;
                        i = (i73 ^ i74) + ((i74 & i73) << 1);
                        b = i % 128;
                        if (i % 2 == 0) {
                            spinner.setEnabled(false);
                        } else {
                            spinner.setEnabled(false);
                        }
                        this.c.spinnerMonth.setEnabled(false);
                        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(date.getTime());
                        int i75 = calendar.get(1);
                        int i76 = a;
                        int i77 = ((i76 ^ 1) | (i76 & 1)) << 1;
                        int i78 = -(((~i76) & 1) | (i76 & (-2)));
                        int i79 = (i77 & i78) + (i78 | i77);
                        b = i79 % 128;
                        int i80 = i79 % 2;
                        int i81 = calendar.get(2);
                        int i82 = calendar.get(5);
                        ActivityRoster activityRoster8 = this.c;
                        int i83 = a;
                        int i84 = (-2) - (((i83 & 32) + (i83 | 32)) ^ (-1));
                        b = i84 % 128;
                        int i85 = i84 % 2;
                        activityRoster8.br = activityRoster8.G(i82, i81, i75, true);
                    }
                    if (this.c.bn.gender.equalsIgnoreCase("male")) {
                        int i86 = a;
                        int i87 = ((i86 ^ 11) | (i86 & 11)) << 1;
                        int i88 = -(((~i86) & 11) | (i86 & (-12)));
                        int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                        b = i89 % 128;
                        int i90 = i89 % 2;
                        this.c.radioButtonMale.setChecked(true);
                        this.c.radioButtonFemale.setChecked(false);
                        radioButton4 = this.c.radioButtonTrans;
                        int i91 = b;
                        int i92 = ((i91 ^ 47) | (i91 & 47)) << 1;
                        int i93 = -(((~i91) & 47) | (i91 & (-48)));
                        i10 = ((i92 | i93) << 1) - (i93 ^ i92);
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            radioButton4.setChecked(false);
                        } else {
                            radioButton4.setChecked(false);
                        }
                        this.c.radioGroupGender.setEnabled(false);
                        this.c.radioButtonTrans.setEnabled(false);
                        this.c.radioButtonFemale.setEnabled(false);
                        RadioButton radioButton6 = this.c.radioButtonMale;
                        int i94 = a;
                        int i95 = (i94 ^ 125) + ((i94 & 125) << 1);
                        b = i95 % 128;
                        int i96 = i95 % 2;
                        radioButton6.setEnabled(false);
                        int i97 = b;
                        int i98 = i97 & 105;
                        int i99 = (i97 | 105) & (~i98);
                        int i100 = i98 << 1;
                        int i101 = (i99 & i100) + (i99 | i100);
                        a = i101 % 128;
                        int i102 = i101 % 2;
                    } else if (this.c.bn.gender.equalsIgnoreCase("female")) {
                        this.c.radioButtonMale.setChecked(false);
                        this.c.radioButtonFemale.setChecked(true);
                        this.c.radioButtonTrans.setChecked(false);
                        int i103 = a;
                        int i104 = i103 | 59;
                        int i105 = i104 << 1;
                        int i106 = -((~(i103 & 59)) & i104);
                        int i107 = (i105 & i106) + (i106 | i105);
                        b = i107 % 128;
                        int i108 = i107 % 2;
                        this.c.radioGroupGender.setEnabled(false);
                        radioButton3 = this.c.radioButtonTrans;
                        int i109 = b;
                        int i110 = i109 & 27;
                        int i111 = (i109 | 27) & (~i110);
                        int i112 = -(-(i110 << 1));
                        i5 = (i111 & i112) + (i111 | i112);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            radioButton3.setEnabled(true);
                        } else {
                            radioButton3.setEnabled(false);
                        }
                        this.c.radioButtonFemale.setEnabled(false);
                        this.c.radioButtonMale.setEnabled(false);
                    } else if (this.c.bn.gender.equalsIgnoreCase("transgender")) {
                        int i113 = b;
                        int i114 = i113 & 91;
                        int i115 = (i114 - (~(-(-((i113 ^ 91) | i114))))) - 1;
                        a = i115 % 128;
                        int i116 = i115 % 2;
                        this.c.radioButtonMale.setChecked(false);
                        this.c.radioButtonFemale.setChecked(false);
                        radioButton = this.c.radioButtonTrans;
                        int i117 = a;
                        int i118 = i117 & 85;
                        i3 = (((i117 | 85) & (~i118)) - (~(-(-(i118 << 1))))) - 1;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            radioButton.setChecked(false);
                            this.c.radioGroupGender.setEnabled(true);
                        } else {
                            radioButton.setChecked(true);
                            this.c.radioGroupGender.setEnabled(false);
                        }
                        int i119 = b;
                        int i120 = i119 & 21;
                        int i121 = (i119 ^ 21) | i120;
                        int i122 = (i120 & i121) + (i121 | i120);
                        a = i122 % 128;
                        int i123 = i122 % 2;
                        this.c.radioButtonTrans.setEnabled(false);
                        this.c.radioButtonFemale.setEnabled(false);
                        radioButton2 = this.c.radioButtonMale;
                        i4 = b + 17;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            radioButton2.setEnabled(false);
                        } else {
                            radioButton2.setEnabled(false);
                        }
                        int i124 = b;
                        int i125 = ((i124 | 33) << 1) - (i124 ^ 33);
                        a = i125 % 128;
                        int i126 = i125 % 2;
                    } else {
                        this.c.radioGroupGender.setEnabled(true);
                        int i127 = a;
                        int i128 = ((i127 & (-120)) | ((~i127) & 119)) + ((i127 & 119) << 1);
                        b = i128 % 128;
                        int i129 = i128 % 2;
                        this.c.radioButtonTrans.setEnabled(true);
                        this.c.radioButtonFemale.setEnabled(true);
                        int i130 = a;
                        int i131 = i130 & 89;
                        i2 = (i131 - (~((i130 ^ 89) | i131))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.c.radioButtonMale.setEnabled(false);
                        } else {
                            this.c.radioButtonMale.setEnabled(true);
                        }
                    }
                    ActivityRoster activityRoster9 = this.c;
                    new au(activityRoster9, "disability_status", activityRoster9.getResources().getString(R.string.disablity_status), this.c.sp_disability, new bpV()).execute(new Void[0]);
                    ActivityRoster activityRoster10 = this.c;
                    i6 = activityRoster10.bn.marital_status;
                    if (i6 != 200) {
                        ActivityRoster activityRoster11 = this.c;
                        au auVar = new au(activityRoster11, "marital_status", activityRoster11.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bpW());
                        int i132 = a;
                        int i133 = ((i132 ^ 59) - (~(-(-((59 & i132) << 1))))) - 1;
                        b = i133 % 128;
                        int i134 = i133 % 2;
                        auVar.execute(new Void[0]);
                        i7 = b + 77;
                        i8 = i7 % 128;
                        a = i8;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        int i135 = i8 + 52;
                        int i136 = (i135 ^ (-1)) + (i135 << 1);
                        b = i136 % 128;
                        int i137 = i136 % 2;
                    } else {
                        ActivityRoster activityRoster12 = this.c;
                        au auVar2 = new au(activityRoster12, "marital_status", activityRoster12.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bpW());
                        int i138 = a;
                        int i139 = ((i138 ^ 59) - (~(-(-((59 & i138) << 1))))) - 1;
                        b = i139 % 128;
                        int i1310 = i139 % 2;
                        auVar2.execute(new Void[0]);
                        i7 = b + 77;
                        i8 = i7 % 128;
                        a = i8;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        int i1311 = i8 + 52;
                        int i1312 = (i1311 ^ (-1)) + (i1311 << 1);
                        b = i1312 % 128;
                        int i1313 = i1312 % 2;
                    }
                    if (!this.c.bn.cnic.equals(BuildConfig.FLAVOR)) {
                        int i140 = a;
                        int i141 = ((i140 | 31) << 1) - (i140 ^ 31);
                        b = i141 % 128;
                        int i142 = i141 % 2;
                        ActivityRoster activityRoster13 = this.c;
                        str2 = activityRoster13.bn.cnic;
                        editText = activityRoster13.et_RosterCNIC;
                        int i143 = b;
                        int i144 = i143 | 33;
                        int i145 = i144 << 1;
                        int i146 = -((~(i143 & 33)) & i144);
                        i9 = (i145 & i146) + (i146 | i145);
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            editText.setText(str2);
                            this.c.et_RosterCNICRepeat.setText(str2);
                            obj.hashCode();
                            throw null;
                        }
                        editText.setText(str2);
                        this.c.et_RosterCNICRepeat.setText(str2);
                    }
                    this.c.sp_relation_to_household.setSelection(0);
                    int i147 = b;
                    int i148 = i147 & 111;
                    int i149 = -(-((i147 ^ 111) | i148));
                    int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                    a = i150 % 128;
                    int i151 = i150 % 2;
                    this.c.linearLayoutCNIC.setVisibility(0);
                    this.c.et_MemberName.setEnabled(true);
                    this.c.sp_relation_to_household.setEnabled(true);
                    int i152 = b;
                    int i153 = (i152 ^ 51) + ((i152 & 51) << 1);
                    a = i153 % 128;
                    int i154 = i153 % 2;
                }
            }
        } else if (!ag.g) {
            if (!activityRoster4.bn.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                int i510 = a + 23;
                b = i510 % 128;
                int i511 = i510 % 2;
                this.c.ll_nadra_name.setVisibility(0);
                int i512 = a + 56;
                i13 = (i512 ^ (-1)) + (i512 << 1);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    EditText editText4 = this.c.et_MemberName;
                    obj.hashCode();
                    throw null;
                }
                ActivityRoster activityRoster14 = this.c;
                editText2 = activityRoster14.et_MemberName;
                str3 = activityRoster14.bn.name_of_member;
                int i610 = b;
                int i611 = i610 & 65;
                i14 = i611 + ((i610 ^ 65) | i611);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    editText2.setText(str3);
                    TextView textView3 = this.c.vald_name_txt_view;
                    obj.hashCode();
                    throw null;
                }
                editText2.setText(str3);
                ActivityRoster activityRoster15 = this.c;
                activityRoster15.vald_name_txt_view.setText(activityRoster15.bn.cnic_valid_name);
            } else {
                this.c.ll_nadra_name.setVisibility(8);
            }
            str = this.c.bn.date_of_birth;
            int i612 = b + 83;
            a = i612 % 128;
            int i613 = i612 % 2;
            if (!(!str.equals(BuildConfig.FLAVOR))) {
                this.c.radioGroupCalendar.setEnabled(true);
                activityRoster = this.c;
                i11 = (-2) - ((b + 38) ^ (-1));
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    activityRoster.radioButtonCalendarYes.setEnabled(false);
                } else {
                    activityRoster.radioButtonCalendarYes.setEnabled(true);
                }
                radioButton5 = this.c.radioButtonCalendarNo;
                int i614 = a;
                int i615 = (i614 | 1) << 1;
                int i616 = -(i614 ^ 1);
                i12 = ((i615 | i616) << 1) - (i616 ^ i615);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    radioButton5.setEnabled(false);
                } else {
                    radioButton5.setEnabled(true);
                }
                this.c.spinnerYear.setEnabled(true);
                this.c.spinnerMonth.setEnabled(true);
            } else {
                ActivityRoster activityRoster16 = this.c;
                TextView textView4 = activityRoster16.tv_dob;
                String str5 = activityRoster16.bn.date_of_birth;
                int i617 = b;
                int i618 = i617 ^ 101;
                int i619 = (i617 & 101) << 1;
                int i710 = ((i618 | i619) << 1) - (i619 ^ i618);
                a = i710 % 128;
                int i711 = i710 % 2;
                textView4.setText(str5);
                this.c.radioGroupCalendar.setEnabled(false);
                this.c.radioButtonCalendarYes.setEnabled(false);
                this.c.radioButtonCalendarNo.setEnabled(false);
                spinner = this.c.spinnerYear;
                int i712 = a;
                int i713 = i712 & 17;
                int i714 = (i712 ^ 17) | i713;
                i = (i713 ^ i714) + ((i714 & i713) << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    spinner.setEnabled(false);
                } else {
                    spinner.setEnabled(false);
                }
                this.c.spinnerMonth.setEnabled(false);
                try {
                    Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(date2.getTime());
                    int i715 = calendar2.get(1);
                    int i716 = a;
                    int i717 = ((i716 ^ 1) | (i716 & 1)) << 1;
                    int i718 = -(((~i716) & 1) | (i716 & (-2)));
                    int i719 = (i717 & i718) + (i718 | i717);
                    b = i719 % 128;
                    int i810 = i719 % 2;
                    int i811 = calendar2.get(2);
                    int i812 = calendar2.get(5);
                    ActivityRoster activityRoster17 = this.c;
                    int i813 = a;
                    int i814 = (-2) - (((i813 & 32) + (i813 | 32)) ^ (-1));
                    b = i814 % 128;
                    int i815 = i814 % 2;
                    activityRoster17.br = activityRoster17.G(i812, i811, i715, true);
                } catch (ParseException unused) {
                }
            }
            if (this.c.bn.gender.equalsIgnoreCase("male")) {
                int i816 = a;
                int i817 = ((i816 ^ 11) | (i816 & 11)) << 1;
                int i818 = -(((~i816) & 11) | (i816 & (-12)));
                int i819 = ((i817 | i818) << 1) - (i818 ^ i817);
                b = i819 % 128;
                int i910 = i819 % 2;
                this.c.radioButtonMale.setChecked(true);
                this.c.radioButtonFemale.setChecked(false);
                radioButton4 = this.c.radioButtonTrans;
                int i911 = b;
                int i912 = ((i911 ^ 47) | (i911 & 47)) << 1;
                int i913 = -(((~i911) & 47) | (i911 & (-48)));
                i10 = ((i912 | i913) << 1) - (i913 ^ i912);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    radioButton4.setChecked(false);
                } else {
                    radioButton4.setChecked(false);
                }
                this.c.radioGroupGender.setEnabled(false);
                this.c.radioButtonTrans.setEnabled(false);
                this.c.radioButtonFemale.setEnabled(false);
                RadioButton radioButton7 = this.c.radioButtonMale;
                int i914 = a;
                int i915 = (i914 ^ 125) + ((i914 & 125) << 1);
                b = i915 % 128;
                int i916 = i915 % 2;
                radioButton7.setEnabled(false);
                int i917 = b;
                int i918 = i917 & 105;
                int i919 = (i917 | 105) & (~i918);
                int i1010 = i918 << 1;
                int i1011 = (i919 & i1010) + (i919 | i1010);
                a = i1011 % 128;
                int i1012 = i1011 % 2;
            } else if (this.c.bn.gender.equalsIgnoreCase("female")) {
                this.c.radioButtonMale.setChecked(false);
                this.c.radioButtonFemale.setChecked(true);
                this.c.radioButtonTrans.setChecked(false);
                int i1013 = a;
                int i1014 = i1013 | 59;
                int i1015 = i1014 << 1;
                int i1016 = -((~(i1013 & 59)) & i1014);
                int i1017 = (i1015 & i1016) + (i1016 | i1015);
                b = i1017 % 128;
                int i1018 = i1017 % 2;
                this.c.radioGroupGender.setEnabled(false);
                radioButton3 = this.c.radioButtonTrans;
                int i1019 = b;
                int i1110 = i1019 & 27;
                int i1111 = (i1019 | 27) & (~i1110);
                int i1112 = -(-(i1110 << 1));
                i5 = (i1111 & i1112) + (i1111 | i1112);
                a = i5 % 128;
                if (i5 % 2 != 0) {
                    radioButton3.setEnabled(true);
                } else {
                    radioButton3.setEnabled(false);
                }
                this.c.radioButtonFemale.setEnabled(false);
                this.c.radioButtonMale.setEnabled(false);
            } else if (this.c.bn.gender.equalsIgnoreCase("transgender")) {
                int i1113 = b;
                int i1114 = i1113 & 91;
                int i1115 = (i1114 - (~(-(-((i1113 ^ 91) | i1114))))) - 1;
                a = i1115 % 128;
                int i1116 = i1115 % 2;
                this.c.radioButtonMale.setChecked(false);
                this.c.radioButtonFemale.setChecked(false);
                radioButton = this.c.radioButtonTrans;
                int i1117 = a;
                int i1118 = i1117 & 85;
                i3 = (((i1117 | 85) & (~i1118)) - (~(-(-(i1118 << 1))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    radioButton.setChecked(false);
                    this.c.radioGroupGender.setEnabled(true);
                } else {
                    radioButton.setChecked(true);
                    this.c.radioGroupGender.setEnabled(false);
                }
                int i1119 = b;
                int i1210 = i1119 & 21;
                int i1211 = (i1119 ^ 21) | i1210;
                int i1212 = (i1210 & i1211) + (i1211 | i1210);
                a = i1212 % 128;
                int i1213 = i1212 % 2;
                this.c.radioButtonTrans.setEnabled(false);
                this.c.radioButtonFemale.setEnabled(false);
                radioButton2 = this.c.radioButtonMale;
                i4 = b + 17;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    radioButton2.setEnabled(false);
                } else {
                    radioButton2.setEnabled(false);
                }
                int i1214 = b;
                int i1215 = ((i1214 | 33) << 1) - (i1214 ^ 33);
                a = i1215 % 128;
                int i1216 = i1215 % 2;
            } else {
                this.c.radioGroupGender.setEnabled(true);
                int i1217 = a;
                int i1218 = ((i1217 & (-120)) | ((~i1217) & 119)) + ((i1217 & 119) << 1);
                b = i1218 % 128;
                int i1219 = i1218 % 2;
                this.c.radioButtonTrans.setEnabled(true);
                this.c.radioButtonFemale.setEnabled(true);
                int i1314 = a;
                int i1315 = i1314 & 89;
                i2 = (i1315 - (~((i1314 ^ 89) | i1315))) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    this.c.radioButtonMale.setEnabled(false);
                } else {
                    this.c.radioButtonMale.setEnabled(true);
                }
            }
            ActivityRoster activityRoster18 = this.c;
            new au(activityRoster18, "disability_status", activityRoster18.getResources().getString(R.string.disablity_status), this.c.sp_disability, new bpV()).execute(new Void[0]);
            ActivityRoster activityRoster19 = this.c;
            i6 = activityRoster19.bn.marital_status;
            if (i6 != 200 || i6 == 201) {
                ActivityRoster activityRoster110 = this.c;
                au auVar3 = new au(activityRoster110, "marital_status", activityRoster110.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bpW());
                int i1316 = a;
                int i1317 = ((i1316 ^ 59) - (~(-(-((59 & i1316) << 1))))) - 1;
                b = i1317 % 128;
                int i1318 = i1317 % 2;
                auVar3.execute(new Void[0]);
                i7 = b + 77;
                i8 = i7 % 128;
                a = i8;
                if (i7 % 2 != 0) {
                    throw null;
                }
                int i1319 = i8 + 52;
                int i13110 = (i1319 ^ (-1)) + (i1319 << 1);
                b = i13110 % 128;
                int i13111 = i13110 % 2;
            } else {
                int i155 = a;
                int i156 = i155 & 105;
                int i157 = (~i156) & (i155 | 105);
                int i158 = i156 << 1;
                int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                b = i159 % 128;
                int i160 = i159 % 2;
                if (i6 != 202) {
                    int i161 = i155 + 89;
                    b = i161 % 128;
                    int i162 = i161 % 2;
                    if (i6 != 203) {
                        int i163 = i155 + 83;
                        b = i163 % 128;
                        int i164 = i163 % 2;
                        activityRoster19.sp_marital_status.setEnabled(true);
                    } else {
                        ActivityRoster activityRoster111 = this.c;
                        au auVar4 = new au(activityRoster111, "marital_status", activityRoster111.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bpW());
                        int i13112 = a;
                        int i13113 = ((i13112 ^ 59) - (~(-(-((59 & i13112) << 1))))) - 1;
                        b = i13113 % 128;
                        int i13114 = i13113 % 2;
                        auVar4.execute(new Void[0]);
                        i7 = b + 77;
                        i8 = i7 % 128;
                        a = i8;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        int i13115 = i8 + 52;
                        int i13116 = (i13115 ^ (-1)) + (i13115 << 1);
                        b = i13116 % 128;
                        int i13117 = i13116 % 2;
                    }
                } else {
                    ActivityRoster activityRoster112 = this.c;
                    au auVar5 = new au(activityRoster112, "marital_status", activityRoster112.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bpW());
                    int i13118 = a;
                    int i13119 = ((i13118 ^ 59) - (~(-(-((59 & i13118) << 1))))) - 1;
                    b = i13119 % 128;
                    int i131110 = i13119 % 2;
                    auVar5.execute(new Void[0]);
                    i7 = b + 77;
                    i8 = i7 % 128;
                    a = i8;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    int i131111 = i8 + 52;
                    int i131112 = (i131111 ^ (-1)) + (i131111 << 1);
                    b = i131112 % 128;
                    int i131113 = i131112 % 2;
                }
            }
            if (!this.c.bn.cnic.equals(BuildConfig.FLAVOR)) {
                int i1410 = a;
                int i1411 = ((i1410 | 31) << 1) - (i1410 ^ 31);
                b = i1411 % 128;
                int i1412 = i1411 % 2;
                ActivityRoster activityRoster113 = this.c;
                str2 = activityRoster113.bn.cnic;
                editText = activityRoster113.et_RosterCNIC;
                int i1413 = b;
                int i1414 = i1413 | 33;
                int i1415 = i1414 << 1;
                int i1416 = -((~(i1413 & 33)) & i1414);
                i9 = (i1415 & i1416) + (i1416 | i1415);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    editText.setText(str2);
                    this.c.et_RosterCNICRepeat.setText(str2);
                    obj.hashCode();
                    throw null;
                }
                editText.setText(str2);
                this.c.et_RosterCNICRepeat.setText(str2);
            }
            this.c.sp_relation_to_household.setSelection(0);
            int i1417 = b;
            int i1418 = i1417 & 111;
            int i1419 = -(-((i1417 ^ 111) | i1418));
            int i1510 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
            a = i1510 % 128;
            int i1511 = i1510 % 2;
            this.c.linearLayoutCNIC.setVisibility(0);
            this.c.et_MemberName.setEnabled(true);
            this.c.sp_relation_to_household.setEnabled(true);
            int i1512 = b;
            int i1513 = (i1512 ^ 51) + ((i1512 & 51) << 1);
            a = i1513 % 128;
            int i1514 = i1513 % 2;
        }
        if (ag.g) {
            int i165 = a;
            int i166 = (i165 & (-50)) | ((~i165) & 49);
            int i167 = (i165 & 49) << 1;
            int i168 = (i166 & i167) + (i167 | i166);
            b = i168 % 128;
            int i169 = i168 % 2;
            while (i21 < this.c.aL.size()) {
                int i170 = a;
                int i171 = (i170 ^ 43) + ((i170 & 43) << 1);
                b = i171 % 128;
                int i172 = i171 % 2;
                Item item = this.c.aL.get(i21);
                int i173 = a;
                int i174 = (i173 & (-46)) | ((~i173) & 45);
                int i175 = (i173 & 45) << 1;
                int i176 = ((i174 | i175) << 1) - (i175 ^ i174);
                b = i176 % 128;
                int i177 = i176 % 2;
                if (item.getOptionId() == 186) {
                    int i178 = b;
                    int i179 = i178 ^ 49;
                    int i180 = (i178 & 49) << 1;
                    int i181 = ((i179 | i180) << 1) - (i180 ^ i179);
                    a = i181 % 128;
                    int i182 = i181 % 2;
                    ActivityRoster activityRoster20 = this.c;
                    if (!activityRoster20.aU) {
                        activityRoster20.aL.remove(i21);
                        int i183 = a;
                        int i184 = (i183 ^ 19) + ((i183 & 19) << 1);
                        b = i184 % 128;
                        int i185 = i184 % 2;
                        break;
                    }
                    int i186 = a;
                    int i187 = i186 & 75;
                    int i188 = (((i186 | 75) & (~i187)) - (~(-(-(i187 << 1))))) - 1;
                    b = i188 % 128;
                    int i189 = i188 % 2;
                    if (activityRoster20.aV != -1) {
                        int i190 = a;
                        int i191 = i190 ^ 89;
                        int i192 = (((i190 & 89) | i191) << 1) - i191;
                        b = i192 % 128;
                        int i193 = i192 % 2;
                        if (activityRoster20.bn.relation_to_household_id != 186) {
                            int i194 = a;
                            int i195 = i194 ^ 37;
                            int i196 = ((((i194 & 37) | i195) << 1) - (~(-i195))) - 1;
                            b = i196 % 128;
                            if (i196 % 2 != 0) {
                                activityRoster20.aL.remove(i21);
                                break;
                            } else {
                                activityRoster20.aL.remove(i21);
                                obj.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        continue;
                    }
                }
                int i197 = i21 & (-35);
                int i198 = ((i21 | (-35)) & (~i197)) + (i197 << 1);
                int i199 = i198 ^ 36;
                int i200 = (i198 & 36) << 1;
                i21 = (i200 | i199) + (i199 & i200);
            }
        }
        ActivityRoster activityRoster21 = this.c;
        if (activityRoster21.aU) {
            activityRoster21.O();
        }
    }
}
