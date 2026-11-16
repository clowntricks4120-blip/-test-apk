package ivas.gov.bisp.enumeration.p043bp;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.BISPApplication;
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

/* JADX INFO: loaded from: classes.dex */
public class Y implements J {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public Y(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    public class bqe implements J {
        private static int a = 0;
        private static int b = 1;

        public bqe() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b + 9;
            a = i2 % 128;
            int i3 = i2 % 2;
            Y.this.c.aI = arrayList;
            int i4 = b;
            int i5 = i4 & 81;
            int i6 = ((((i4 ^ 81) | i5) << 1) - (~(-((i4 | 81) & (~i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (true) {
                if (i8 >= Y.this.c.aI.size()) {
                    int i9 = a;
                    int i10 = ((i9 | 93) << 1) - (i9 ^ 93);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    i8 = 0;
                    break;
                }
                int i12 = a;
                int i13 = (i12 & 100) + (i12 | 100);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                Item item = Y.this.c.aI.get(i8);
                int i16 = a;
                int i17 = (((i16 | 74) << 1) - (i16 ^ 74)) - 1;
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    item.getOptionId();
                    Roster roster = Y.this.c.bn;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (item.getOptionId() == Y.this.c.bn.marital_status) {
                    break;
                }
                int i18 = b;
                int i19 = ((i18 | 77) << 1) - (i18 ^ 77);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = i8 + 202;
                    int i21 = i20 & (-119);
                    int i22 = ((i20 ^ (-119)) | i21) << 1;
                    int i23 = -((i20 | (-119)) & (~i21));
                    i8 = (i22 ^ i23) + ((i23 & i22) << 1);
                } else {
                    int i24 = (i8 & 93) + (i8 | 93);
                    i8 = ((i24 | (-92)) << 1) - (i24 ^ (-92));
                }
            }
            Y.this.c.sp_marital_status.setSelection(i8);
            int i25 = b;
            int i26 = (((i25 ^ 123) | (i25 & 123)) << 1) - (((~i25) & 123) | (i25 & (-124)));
            a = i26 % 128;
            if (i26 % 2 != 0) {
                Y.this.c.sp_marital_status.setEnabled(true);
            } else {
                Y.this.c.sp_marital_status.setEnabled(false);
            }
        }
    }

    public class bqd implements J {
        private static int a = 0;
        private static int b = 1;

        public bqd() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b + 9;
            a = i2 % 128;
            int i3 = i2 % 2;
            Y.this.c.aN = arrayList;
            int i4 = b;
            int i5 = ((i4 & 79) - (~(i4 | 79))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if (i7 >= Y.this.c.aN.size()) {
                    int i8 = a;
                    int i9 = i8 & 101;
                    int i10 = -(-((i8 ^ 101) | i9));
                    int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    i7 = 0;
                    break;
                }
                int i13 = a;
                int i14 = i13 & 123;
                int i15 = (i13 | 123) & (~i14);
                int i16 = i14 << 1;
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                Item item = Y.this.c.aN.get(i7);
                int i19 = b;
                int i20 = (i19 & (-126)) | ((~i19) & 125);
                int i21 = (i19 & 125) << 1;
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                int optionId = item.getOptionId();
                Roster roster = Y.this.c.bn;
                int i24 = b;
                int i25 = i24 & 115;
                int i26 = i25 + ((i24 ^ 115) | i25);
                a = i26 % 128;
                int i27 = i26 % 2;
                if (optionId == roster.disability) {
                    break;
                }
                int i28 = a;
                int i29 = i28 & 9;
                int i30 = (i28 | 9) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    i7 = (i7 & 60) + (i7 | 60);
                } else {
                    int i33 = i7 & 1;
                    int i34 = i7 | 1;
                    i7 = (i33 & i34) + (i34 | i33);
                }
            }
            ActivityRoster activityRoster = Y.this.c;
            int i35 = activityRoster.bn.disability;
            int i36 = a + 43;
            int i37 = i36 % 128;
            b = i37;
            int i38 = i36 % 2;
            if (i35 != 6) {
                activityRoster.sp_disability.setSelection(i7);
                Spinner spinner = Y.this.c.sp_disability;
                int i39 = b + 26;
                int i40 = (i39 ^ (-1)) + (i39 << 1);
                a = i40 % 128;
                if (i40 % 2 != 0) {
                    spinner.setEnabled(false);
                    return;
                } else {
                    spinner.setEnabled(true);
                    return;
                }
            }
            int i41 = (i37 & (-26)) | ((~i37) & 25);
            int i42 = (i37 & 25) << 1;
            int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            activityRoster.sp_disability.setEnabled(false);
            ActivityRoster activityRoster2 = Y.this.c;
            int i45 = b;
            int i46 = i45 & 51;
            int i47 = ((i45 ^ 51) | i46) << 1;
            int i48 = -((i45 | 51) & (~i46));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            a = i49 % 128;
            int i50 = i49 % 2;
            activityRoster2.sp_disability.setSelection(1);
            int i51 = a;
            int i52 = i51 & 61;
            int i53 = ((i51 ^ 61) | i52) << 1;
            int i54 = -((i51 | 61) & (~i52));
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            b = i55 % 128;
            int i56 = i55 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:111:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x060d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0611  */
    /* JADX WARN: Code duplicated, block: B:131:0x05f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0671 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:26:0x0102  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0143  */
    /* JADX WARN: Code duplicated, block: B:37:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x0197  */
    /* JADX WARN: Code duplicated, block: B:46:0x01db  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0200  */
    /* JADX WARN: Code duplicated, block: B:52:0x0215  */
    /* JADX WARN: Code duplicated, block: B:54:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0491  */
    /* JADX WARN: Code duplicated, block: B:9:0x0043 A[DONT_INVERT, PHI: r15
  0x0043: PHI (r15v2 int) = (r15v1 int), (r15v118 int) binds: [B:8:0x0041, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2;
        ActivityRoster activityRoster;
        TextView textView;
        Roster roster;
        int i3;
        int i4;
        TextView textView2;
        String str;
        int i5;
        RadioButton radioButton;
        boolean z;
        Spinner spinner;
        int i6;
        RadioButton radioButton2;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = i10 & 11;
        int i12 = ((i10 ^ 11) | i11) << 1;
        int i13 = -((i10 | 11) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        ActivityRoster activityRoster2 = this.c;
        activityRoster2.aL = arrayList;
        BISPApplication bISPApplication = activityRoster2.bw;
        int i16 = b;
        int i17 = ((i16 & (-62)) | ((~i16) & 61)) + ((i16 & 61) << 1);
        a = i17 % 128;
        int i18 = 0;
        if (i17 % 2 != 0) {
            bISPApplication.V = arrayList;
            i = activityRoster2.ac;
            if (i != 0) {
                if (i != 2) {
                    int i19 = b;
                    int i20 = (-2) - (((i19 & 72) + (i19 | 72)) ^ (-1));
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    if (ag.d) {
                    }
                }
            }
            if (ag.g) {
                int i22 = a + 81;
                b = i22 % 128;
                int i23 = i22 % 2;
                while (i18 < this.c.aL.size()) {
                    int i24 = b;
                    int i25 = (i24 | 61) << 1;
                    int i26 = -(((~i24) & 61) | (i24 & (-62)));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    if (this.c.aL.get(i18).getOptionId() == 186) {
                        activityRoster = this.c;
                        if (!activityRoster.aU) {
                            activityRoster.aL.remove(i18);
                            int i29 = a;
                            int i30 = ((i29 ^ 31) - (~(-(-((i29 & 31) << 1))))) - 1;
                            b = i30 % 128;
                            int i31 = i30 % 2;
                            return;
                        }
                        if (activityRoster.aV != -1) {
                            int i32 = a;
                            int i33 = i32 & 3;
                            int i34 = (i32 | 3) & (~i33);
                            int i35 = i33 << 1;
                            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            if (activityRoster.bn.relation_to_household_id != 186) {
                                activityRoster.aL.remove(i18);
                                int i38 = a;
                                int i39 = i38 & 43;
                                int i40 = -(-((i38 ^ 43) | i39));
                                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                                b = i41 % 128;
                                int i42 = i41 % 2;
                                return;
                            }
                        }
                    }
                    int i43 = (i18 & (-65)) | ((~i18) & 64);
                    int i44 = (i18 & 64) << 1;
                    int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                    int i46 = i45 & (-63);
                    int i47 = (~i46) & (i45 | (-63));
                    int i48 = -(-(i46 << 1));
                    i18 = (i47 & i48) + (i48 | i47);
                    int i49 = b;
                    int i50 = i49 & 79;
                    int i51 = i49 | 79;
                    i2 = ((i50 | i51) << 1) - (i51 ^ i50);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i52 = 2 % 3;
                    }
                }
            }
            int i53 = a;
            int i54 = ((i53 | 95) << 1) - (i53 ^ 95);
            b = i54 % 128;
            int i55 = i54 % 2;
        }
        bISPApplication.V = arrayList;
        i = activityRoster2.ac;
        if (i != 1) {
            if (i != 2) {
                int i110 = b;
                int i210 = (-2) - (((i110 & 72) + (i110 | 72)) ^ (-1));
                a = i210 % 128;
                int i211 = i210 % 2;
                if (ag.d) {
                }
            }
        }
        if (ag.g) {
            int i212 = a + 81;
            b = i212 % 128;
            int i213 = i212 % 2;
            while (i18 < this.c.aL.size()) {
                int i214 = b;
                int i215 = (i214 | 61) << 1;
                int i216 = -(((~i214) & 61) | (i214 & (-62)));
                int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                a = i217 % 128;
                int i218 = i217 % 2;
                if (this.c.aL.get(i18).getOptionId() == 186) {
                    activityRoster = this.c;
                    if (!activityRoster.aU) {
                        activityRoster.aL.remove(i18);
                        int i219 = a;
                        int i310 = ((i219 ^ 31) - (~(-(-((i219 & 31) << 1))))) - 1;
                        b = i310 % 128;
                        int i311 = i310 % 2;
                        return;
                    }
                    if (activityRoster.aV != -1) {
                        int i312 = a;
                        int i313 = i312 & 3;
                        int i314 = (i312 | 3) & (~i313);
                        int i315 = i313 << 1;
                        int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
                        b = i316 % 128;
                        int i317 = i316 % 2;
                        if (activityRoster.bn.relation_to_household_id != 186) {
                            activityRoster.aL.remove(i18);
                            int i318 = a;
                            int i319 = i318 & 43;
                            int i410 = -(-((i318 ^ 43) | i319));
                            int i411 = (i319 ^ i410) + ((i410 & i319) << 1);
                            b = i411 % 128;
                            int i412 = i411 % 2;
                            return;
                        }
                    }
                }
                int i413 = (i18 & (-65)) | ((~i18) & 64);
                int i414 = (i18 & 64) << 1;
                int i415 = ((i413 | i414) << 1) - (i413 ^ i414);
                int i416 = i415 & (-63);
                int i417 = (~i416) & (i415 | (-63));
                int i418 = -(-(i416 << 1));
                i18 = (i417 & i418) + (i418 | i417);
                int i419 = b;
                int i56 = i419 & 79;
                int i57 = i419 | 79;
                i2 = ((i56 | i57) << 1) - (i57 ^ i56);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i58 = 2 % 3;
                }
            }
        }
        int i59 = a;
        int i510 = ((i59 | 95) << 1) - (i59 ^ 95);
        b = i510 % 128;
        int i511 = i510 % 2;
        if (!ag.g) {
            int i60 = a;
            int i61 = (i60 & 61) + (i60 | 61);
            b = i61 % 128;
            Object obj = null;
            if (i61 % 2 == 0) {
                int i62 = 39 / 0;
                if (activityRoster2.bn.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                    this.c.ll_nadra_name.setVisibility(8);
                    int i63 = b;
                    int i64 = ((i63 | 115) << 1) - (i63 ^ 115);
                    a = i64 % 128;
                    int i65 = i64 % 2;
                } else {
                    this.c.ll_nadra_name.setVisibility(0);
                    int i66 = b + 5;
                    a = i66 % 128;
                    int i67 = i66 % 2;
                    ActivityRoster activityRoster3 = this.c;
                    EditText editText = activityRoster3.et_MemberName;
                    int i68 = b;
                    int i69 = (i68 & (-30)) | ((~i68) & 29);
                    int i70 = (i68 & 29) << 1;
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    editText.setText(activityRoster3.bn.name_of_member);
                    ActivityRoster activityRoster4 = this.c;
                    textView = activityRoster4.vald_name_txt_view;
                    roster = activityRoster4.bn;
                    int i73 = b;
                    i3 = (((i73 | 88) << 1) - (i73 ^ 88)) - 1;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        textView.setText(roster.cnic_valid_name);
                        throw null;
                    }
                    textView.setText(roster.cnic_valid_name);
                    int i74 = a;
                    int i75 = i74 & 27;
                    int i76 = ((i74 ^ 27) | i75) << 1;
                    int i77 = -((i74 | 27) & (~i75));
                    i4 = (i76 ^ i77) + ((i77 & i76) << 1);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i78 = 2 % 4;
                    }
                }
            } else if (!(!activityRoster2.bn.cnic_valid_name.equals(BuildConfig.FLAVOR))) {
                this.c.ll_nadra_name.setVisibility(8);
                int i610 = b;
                int i611 = ((i610 | 115) << 1) - (i610 ^ 115);
                a = i611 % 128;
                int i612 = i611 % 2;
            } else {
                this.c.ll_nadra_name.setVisibility(0);
                int i613 = b + 5;
                a = i613 % 128;
                int i614 = i613 % 2;
                ActivityRoster activityRoster5 = this.c;
                EditText editText2 = activityRoster5.et_MemberName;
                int i615 = b;
                int i616 = (i615 & (-30)) | ((~i615) & 29);
                int i79 = (i615 & 29) << 1;
                int i710 = (i616 ^ i79) + ((i79 & i616) << 1);
                a = i710 % 128;
                int i711 = i710 % 2;
                editText2.setText(activityRoster5.bn.name_of_member);
                ActivityRoster activityRoster6 = this.c;
                textView = activityRoster6.vald_name_txt_view;
                roster = activityRoster6.bn;
                int i712 = b;
                i3 = (((i712 | 88) << 1) - (i712 ^ 88)) - 1;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    textView.setText(roster.cnic_valid_name);
                    throw null;
                }
                textView.setText(roster.cnic_valid_name);
                int i713 = a;
                int i714 = i713 & 27;
                int i715 = ((i713 ^ 27) | i714) << 1;
                int i716 = -((i713 | 27) & (~i714));
                i4 = (i715 ^ i716) + ((i716 & i715) << 1);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i717 = 2 % 4;
                }
            }
            String str2 = this.c.bn.date_of_birth;
            int i80 = b;
            int i81 = i80 ^ 119;
            int i82 = (((i80 & 119) | i81) << 1) - i81;
            a = i82 % 128;
            if (i82 % 2 != 0) {
                int i83 = 93 / 0;
                if (!str2.equals(BuildConfig.FLAVOR)) {
                    ActivityRoster activityRoster7 = this.c;
                    textView2 = activityRoster7.tv_dob;
                    str = activityRoster7.bn.date_of_birth;
                    int i84 = a;
                    int i85 = i84 & 11;
                    i5 = i85 + ((i84 ^ 11) | i85);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        textView2.setText(str);
                        this.c.radioGroupCalendar.setEnabled(false);
                        radioButton = this.c.radioButtonCalendarYes;
                        z = true;
                    } else {
                        textView2.setText(str);
                        this.c.radioGroupCalendar.setEnabled(false);
                        radioButton = this.c.radioButtonCalendarYes;
                        z = false;
                    }
                    radioButton.setEnabled(z);
                    this.c.radioButtonCalendarNo.setEnabled(false);
                    spinner = this.c.spinnerYear;
                    int i86 = b;
                    int i87 = i86 & 117;
                    int i88 = -(-((i86 ^ 117) | i87));
                    i6 = (i87 & i88) + (i88 | i87);
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        spinner.setEnabled(false);
                    } else {
                        spinner.setEnabled(false);
                    }
                    this.c.spinnerMonth.setEnabled(false);
                    try {
                        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(date.getTime());
                        int i89 = calendar.get(1);
                        int i90 = calendar.get(2);
                        int i91 = calendar.get(5);
                        ActivityRoster activityRoster8 = this.c;
                        activityRoster8.br = activityRoster8.G(i91, i90, i89, true);
                        int i92 = a;
                        int i93 = ((i92 | 84) << 1) - (i92 ^ 84);
                        int i94 = (i93 ^ (-1)) + (i93 << 1);
                        b = i94 % 128;
                        int i95 = i94 % 2;
                    } catch (ParseException unused) {
                    }
                } else {
                    this.c.radioGroupCalendar.setEnabled(true);
                    radioButton2 = this.c.radioButtonCalendarYes;
                    int i96 = a;
                    i7 = ((i96 & 54) + (i96 | 54)) - 1;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        radioButton2.setEnabled(true);
                        this.c.radioButtonCalendarNo.setEnabled(false);
                    } else {
                        radioButton2.setEnabled(true);
                        this.c.radioButtonCalendarNo.setEnabled(true);
                    }
                    i8 = a + 5;
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        this.c.spinnerYear.setEnabled(true);
                    } else {
                        this.c.spinnerYear.setEnabled(true);
                    }
                    this.c.spinnerMonth.setEnabled(true);
                    int i97 = b + 7;
                    a = i97 % 128;
                    int i98 = i97 % 2;
                }
            } else if (str2.equals(BuildConfig.FLAVOR)) {
                this.c.radioGroupCalendar.setEnabled(true);
                radioButton2 = this.c.radioButtonCalendarYes;
                int i99 = a;
                i7 = ((i99 & 54) + (i99 | 54)) - 1;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    radioButton2.setEnabled(true);
                    this.c.radioButtonCalendarNo.setEnabled(false);
                } else {
                    radioButton2.setEnabled(true);
                    this.c.radioButtonCalendarNo.setEnabled(true);
                }
                i8 = a + 5;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    this.c.spinnerYear.setEnabled(true);
                } else {
                    this.c.spinnerYear.setEnabled(true);
                }
                this.c.spinnerMonth.setEnabled(true);
                int i910 = b + 7;
                a = i910 % 128;
                int i911 = i910 % 2;
            } else {
                ActivityRoster activityRoster9 = this.c;
                textView2 = activityRoster9.tv_dob;
                str = activityRoster9.bn.date_of_birth;
                int i810 = a;
                int i811 = i810 & 11;
                i5 = i811 + ((i810 ^ 11) | i811);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    textView2.setText(str);
                    this.c.radioGroupCalendar.setEnabled(false);
                    radioButton = this.c.radioButtonCalendarYes;
                    z = true;
                } else {
                    textView2.setText(str);
                    this.c.radioGroupCalendar.setEnabled(false);
                    radioButton = this.c.radioButtonCalendarYes;
                    z = false;
                }
                radioButton.setEnabled(z);
                this.c.radioButtonCalendarNo.setEnabled(false);
                spinner = this.c.spinnerYear;
                int i812 = b;
                int i813 = i812 & 117;
                int i814 = -(-((i812 ^ 117) | i813));
                i6 = (i813 & i814) + (i814 | i813);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    spinner.setEnabled(false);
                } else {
                    spinner.setEnabled(false);
                }
                this.c.spinnerMonth.setEnabled(false);
                Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(this.c.tv_dob.getText().toString());
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(date2.getTime());
                int i815 = calendar2.get(1);
                int i912 = calendar2.get(2);
                int i913 = calendar2.get(5);
                ActivityRoster activityRoster10 = this.c;
                activityRoster10.br = activityRoster10.G(i913, i912, i815, true);
                int i914 = a;
                int i915 = ((i914 | 84) << 1) - (i914 ^ 84);
                int i916 = (i915 ^ (-1)) + (i915 << 1);
                b = i916 % 128;
                int i917 = i916 % 2;
            }
            if (!(!this.c.bn.gender.equalsIgnoreCase("male"))) {
                this.c.radioButtonMale.setChecked(true);
                this.c.radioButtonFemale.setChecked(false);
                this.c.radioButtonTrans.setChecked(false);
                int i100 = b;
                int i101 = (i100 ^ 123) + ((i100 & 123) << 1);
                a = i101 % 128;
                if (i101 % 2 != 0) {
                    this.c.radioGroupGender.setEnabled(true);
                } else {
                    this.c.radioGroupGender.setEnabled(false);
                }
                RadioButton radioButton3 = this.c.radioButtonTrans;
                int i102 = b;
                int i103 = i102 & 5;
                int i104 = i102 | 5;
                int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                a = i105 % 128;
                int i106 = i105 % 2;
                radioButton3.setEnabled(false);
                this.c.radioButtonFemale.setEnabled(false);
                this.c.radioButtonMale.setEnabled(false);
            } else if (this.c.bn.gender.equalsIgnoreCase("female")) {
                this.c.radioButtonMale.setChecked(false);
                this.c.radioButtonFemale.setChecked(true);
                ActivityRoster activityRoster11 = this.c;
                int i107 = b;
                int i108 = i107 & 77;
                int i109 = -(-((i107 ^ 77) | i108));
                int i111 = (i108 ^ i109) + ((i109 & i108) << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
                activityRoster11.radioButtonTrans.setChecked(false);
                this.c.radioGroupGender.setEnabled(false);
                this.c.radioButtonTrans.setEnabled(false);
                this.c.radioButtonFemale.setEnabled(false);
                int i113 = b;
                int i114 = i113 & 29;
                int i115 = (i113 ^ 29) | i114;
                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                a = i116 % 128;
                int i117 = i116 % 2;
                this.c.radioButtonMale.setEnabled(false);
                int i118 = a + 95;
                b = i118 % 128;
                int i119 = i118 % 2;
            } else if (this.c.bn.gender.equalsIgnoreCase("transgender")) {
                int i120 = b;
                int i121 = i120 & 5;
                int i122 = i121 + ((i120 ^ 5) | i121);
                a = i122 % 128;
                int i123 = i122 % 2;
                this.c.radioButtonMale.setChecked(false);
                int i124 = b;
                int i125 = i124 & 29;
                int i126 = (i125 - (~((i124 ^ 29) | i125))) - 1;
                a = i126 % 128;
                int i127 = i126 % 2;
                this.c.radioButtonFemale.setChecked(false);
                int i128 = b;
                int i129 = i128 | 69;
                int i130 = (i129 << 1) - ((~(i128 & 69)) & i129);
                a = i130 % 128;
                int i131 = i130 % 2;
                this.c.radioButtonTrans.setChecked(true);
                int i132 = b;
                int i133 = (i132 & (-20)) | ((~i132) & 19);
                int i134 = (i132 & 19) << 1;
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                a = i135 % 128;
                if (i135 % 2 != 0) {
                    this.c.radioGroupGender.setEnabled(true);
                } else {
                    this.c.radioGroupGender.setEnabled(false);
                }
                this.c.radioButtonTrans.setEnabled(false);
                int i136 = a;
                int i137 = (((i136 | 54) << 1) - (i136 ^ 54)) - 1;
                b = i137 % 128;
                int i138 = i137 % 2;
                this.c.radioButtonFemale.setEnabled(false);
                int i139 = a;
                int i140 = i139 & 111;
                int i141 = (i139 | 111) & (~i140);
                int i142 = i140 << 1;
                int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
                b = i143 % 128;
                int i144 = i143 % 2;
                this.c.radioButtonMale.setEnabled(false);
                int i145 = b + 49;
                a = i145 % 128;
                if (i145 % 2 != 0) {
                    int i146 = 5 / 2;
                }
            } else {
                this.c.radioGroupGender.setEnabled(true);
                ActivityRoster activityRoster12 = this.c;
                int i147 = a;
                int i148 = i147 ^ 33;
                int i149 = (((i147 & 33) | i148) << 1) - i148;
                b = i149 % 128;
                int i150 = i149 % 2;
                activityRoster12.radioButtonTrans.setEnabled(true);
                RadioButton radioButton4 = this.c.radioButtonFemale;
                int i151 = b;
                int i152 = i151 & 87;
                int i153 = ((i151 ^ 87) | i152) << 1;
                int i154 = -((i151 | 87) & (~i152));
                int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                a = i155 % 128;
                int i156 = i155 % 2;
                radioButton4.setEnabled(true);
                this.c.radioButtonMale.setEnabled(true);
            }
            ActivityRoster activityRoster13 = this.c;
            new au(activityRoster13, "disability_status", activityRoster13.getResources().getString(R.string.disablity_status), this.c.sp_disability, new bqd()).execute(new Void[0]);
            int i157 = a - (-1);
            b = i157 % 128;
            if (i157 % 2 == 0) {
                int i158 = this.c.bn.marital_status;
                obj.hashCode();
                throw null;
            }
            ActivityRoster activityRoster14 = this.c;
            int i159 = activityRoster14.bn.marital_status;
            if (i159 == 200 || i159 == 201) {
                ActivityRoster activityRoster15 = this.c;
                new au(activityRoster15, "marital_status", activityRoster15.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bqe()).execute(new Void[0]);
                int i160 = b + 125;
                a = i160 % 128;
                int i161 = i160 % 2;
            } else {
                int i162 = b;
                int i163 = ((((i162 ^ 53) | (i162 & 53)) << 1) - (~(-((i162 & (-54)) | ((~i162) & 53))))) - 1;
                a = i163 % 128;
                int i164 = i163 % 2;
                if (i159 != 202) {
                    int i165 = i162 & 59;
                    int i166 = ((i162 | 59) & (~i165)) + (i165 << 1);
                    int i167 = i166 % 128;
                    a = i167;
                    int i168 = i166 % 2;
                    if (i159 != 203) {
                        int i169 = i167 + 88;
                        int i170 = (i169 ^ (-1)) + (i169 << 1);
                        b = i170 % 128;
                        int i171 = i170 % 2;
                        activityRoster14.sp_marital_status.setEnabled(true);
                        int i172 = b;
                        int i173 = i172 & 109;
                        int i174 = ((((i172 ^ 109) | i173) << 1) - (~(-((i172 | 109) & (~i173))))) - 1;
                        a = i174 % 128;
                        int i175 = i174 % 2;
                    } else {
                        ActivityRoster activityRoster16 = this.c;
                        new au(activityRoster16, "marital_status", activityRoster16.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bqe()).execute(new Void[0]);
                        int i1610 = b + 125;
                        a = i1610 % 128;
                        int i1611 = i1610 % 2;
                    }
                } else {
                    ActivityRoster activityRoster17 = this.c;
                    new au(activityRoster17, "marital_status", activityRoster17.getResources().getString(R.string.marital_status), this.c.sp_marital_status, new bqe()).execute(new Void[0]);
                    int i1612 = b + 125;
                    a = i1612 % 128;
                    int i1613 = i1612 % 2;
                }
            }
            if (!this.c.bn.cnic.equals(BuildConfig.FLAVOR)) {
                ActivityRoster activityRoster18 = this.c;
                String str3 = activityRoster18.bn.cnic;
                activityRoster18.et_RosterCNIC.setText(str3);
                ActivityRoster activityRoster19 = this.c;
                int i176 = b;
                int i177 = i176 & 23;
                int i178 = ((i176 ^ 23) | i177) << 1;
                int i179 = -((i176 | 23) & (~i177));
                int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                a = i180 % 128;
                int i181 = i180 % 2;
                activityRoster19.et_RosterCNICRepeat.setText(str3);
                int i182 = a;
                int i183 = i182 & 15;
                int i184 = (i182 ^ 15) | i183;
                int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                b = i185 % 128;
                int i186 = i185 % 2;
            }
            int i187 = 0;
            while (true) {
                if (i187 >= this.c.aL.size()) {
                    int i188 = a;
                    int i189 = (((i188 | 90) << 1) - (i188 ^ 90)) - 1;
                    b = i189 % 128;
                    int i190 = i189 % 2;
                    i187 = 0;
                    break;
                }
                Item item = this.c.aL.get(i187);
                int i191 = a;
                int i192 = i191 ^ 17;
                int i193 = ((i191 & 17) | i192) << 1;
                int i194 = -i192;
                int i195 = (i193 ^ i194) + ((i193 & i194) << 1);
                b = i195 % 128;
                int i196 = i195 % 2;
                if (item.getOptionId() == this.c.bn.relation_to_household_id) {
                    break;
                }
                int i197 = i187 & 1;
                int i198 = (i187 | 1) & (~i197);
                int i199 = i197 << 1;
                i187 = (i198 | i199) + (i198 & i199);
                int i200 = b;
                int i201 = ((i200 | 27) << 1) - (i200 ^ 27);
                a = i201 % 128;
                int i202 = i201 % 2;
            }
            this.c.sp_relation_to_household.setSelection(i187);
            this.c.linearLayoutCNIC.setVisibility(0);
            EditText editText3 = this.c.et_MemberName;
            int i203 = b;
            int i204 = i203 ^ 115;
            int i205 = ((((i203 & 115) | i204) << 1) - (~(-i204))) - 1;
            a = i205 % 128;
            int i206 = i205 % 2;
            editText3.setEnabled(true);
            this.c.sp_relation_to_household.setEnabled(true);
            int i207 = a;
            int i208 = i207 & 21;
            int i209 = -(-(i207 | 21));
            int i220 = ((i208 | i209) << 1) - (i209 ^ i208);
            b = i220 % 128;
            int i221 = i220 % 2;
        }
        if (ag.g) {
            int i2110 = a + 81;
            b = i2110 % 128;
            int i2111 = i2110 % 2;
            while (i18 < this.c.aL.size()) {
                int i2112 = b;
                int i2113 = (i2112 | 61) << 1;
                int i2114 = -(((~i2112) & 61) | (i2112 & (-62)));
                int i2115 = ((i2113 | i2114) << 1) - (i2114 ^ i2113);
                a = i2115 % 128;
                int i2116 = i2115 % 2;
                if (this.c.aL.get(i18).getOptionId() == 186) {
                    activityRoster = this.c;
                    if (!activityRoster.aU) {
                        activityRoster.aL.remove(i18);
                        int i2117 = a;
                        int i3110 = ((i2117 ^ 31) - (~(-(-((i2117 & 31) << 1))))) - 1;
                        b = i3110 % 128;
                        int i3111 = i3110 % 2;
                        return;
                    }
                    if (activityRoster.aV != -1) {
                        int i3112 = a;
                        int i3113 = i3112 & 3;
                        int i3114 = (i3112 | 3) & (~i3113);
                        int i3115 = i3113 << 1;
                        int i3116 = ((i3114 | i3115) << 1) - (i3114 ^ i3115);
                        b = i3116 % 128;
                        int i3117 = i3116 % 2;
                        if (activityRoster.bn.relation_to_household_id != 186) {
                            activityRoster.aL.remove(i18);
                            int i3118 = a;
                            int i3119 = i3118 & 43;
                            int i4110 = -(-((i3118 ^ 43) | i3119));
                            int i4111 = (i3119 ^ i4110) + ((i4110 & i3119) << 1);
                            b = i4111 % 128;
                            int i4112 = i4111 % 2;
                            return;
                        }
                    }
                }
                int i4113 = (i18 & (-65)) | ((~i18) & 64);
                int i4114 = (i18 & 64) << 1;
                int i4115 = ((i4113 | i4114) << 1) - (i4113 ^ i4114);
                int i4116 = i4115 & (-63);
                int i4117 = (~i4116) & (i4115 | (-63));
                int i4118 = -(-(i4116 << 1));
                i18 = (i4117 & i4118) + (i4118 | i4117);
                int i4119 = b;
                int i512 = i4119 & 79;
                int i513 = i4119 | 79;
                i2 = ((i512 | i513) << 1) - (i513 ^ i512);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i514 = 2 % 3;
                }
            }
        }
        int i515 = a;
        int i516 = ((i515 | 95) << 1) - (i515 ^ 95);
        b = i516 % 128;
        int i517 = i516 % 2;
    }
}
