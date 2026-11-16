package ivas.gov.bisp.enumeration.dd;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements DatePickerDialog.OnDateSetListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ N(BaseTouch baseTouch, int i) {
        this.c = i;
        this.d = baseTouch;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4;
        int i5;
        String str;
        int i6;
        double dH;
        double d;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = ((i10 ^ 21) | (i10 & 21)) << 1;
        int i12 = -((i10 & (-22)) | ((~i10) & 21));
        int i13 = (i11 & i12) + (i11 | i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i14 = this.c;
        if (i14 == 0) {
            DobActivity dobActivity = (DobActivity) this.d;
            int i15 = DobActivity.ac;
            Objects.requireNonNull(dobActivity);
            int i16 = (-2) - ((i2 + 2) ^ (-1));
            StringBuilder sb = new StringBuilder();
            int i17 = a + 66;
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                sb.append(i3);
                sb.append("-");
                sb.append(i16);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            sb.append(i3);
            sb.append("-");
            sb.append(i16);
            sb.append("-");
            sb.append(i);
            Date dateH = z.h(sb.toString(), "dd-MM-yyyy");
            Date date = new Date();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(dateH);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            int i19 = a;
            int i20 = i19 & 121;
            int i21 = ((i19 ^ 121) | i20) << 1;
            int i22 = -((i19 | 121) & (~i20));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            gregorianCalendar2.setTime(date);
            int i25 = gregorianCalendar2.get(1);
            int i26 = -gregorianCalendar.get(1);
            int i27 = i25 & i26;
            int i28 = i27 + ((i25 ^ i26) | i27);
            int i29 = b;
            int i30 = i29 + 45;
            a = i30 % 128;
            if (i30 % 2 == 0 ? i28 <= 115 : i28 <= 71) {
                int i31 = i29 ^ 97;
                int i32 = ((i29 & 97) | i31) << 1;
                int i33 = -i31;
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = gregorianCalendar2.get(5) + 2;
                    i4 = (i35 ^ (-1)) + (i35 << 1);
                    i5 = gregorianCalendar.get(5);
                } else {
                    int i36 = gregorianCalendar2.get(2);
                    int i37 = i36 & 1;
                    i4 = i37 + ((i36 ^ 1) | i37);
                    i5 = gregorianCalendar.get(2);
                }
                if (i4 < (-2) - ((i5 + 2) ^ (-1))) {
                    int i38 = b;
                    int i39 = ((i38 ^ 109) | (i38 & 109)) << 1;
                    int i40 = -((i38 & (-110)) | (109 & (~i38)));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    a = i41 % 128;
                    if (i41 % 2 != 0) {
                        gregorianCalendar.get(5);
                        gregorianCalendar2.get(2);
                        int i42 = i28 + 102;
                        i6 = (i42 & 24) + (i42 | 24);
                    } else {
                        gregorianCalendar.get(2);
                        gregorianCalendar2.get(2);
                        int i43 = ~i28;
                        int i44 = i28 << 1;
                        i6 = ((i43 & i44) << 1) + (i43 ^ i44);
                    }
                    i28 = i6;
                } else {
                    gregorianCalendar2.get(2);
                    gregorianCalendar.get(2);
                    int i45 = a;
                    int i46 = i45 & 87;
                    int i47 = (i45 | 87) & (~i46);
                    int i48 = i46 << 1;
                    int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i3);
                int i51 = b;
                int i52 = ((i51 | 115) << 1) - (i51 ^ 115);
                a = i52 % 128;
                int i53 = i52 % 2;
                sb2.append("-");
                sb2.append(i16);
                int i54 = a;
                int i55 = i54 & 109;
                int i56 = -(-((i54 ^ 109) | i55));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                b = i57 % 128;
                if (i57 % 2 == 0) {
                    sb2.append("-");
                    sb2.append(i);
                    sb2.toString();
                    throw null;
                }
                sb2.append("-");
                sb2.append(i);
                String string = sb2.toString();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                DateFormat dateInstance = DateFormat.getDateInstance();
                int i58 = a;
                int i59 = i58 & 69;
                int i60 = (i58 | 69) & (~i59);
                int i61 = i59 << 1;
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                b = i62 % 128;
                int i63 = i62 % 2;
                try {
                    String str2 = dateInstance.format(simpleDateFormat.parse(string));
                    int i64 = b;
                    int i65 = i64 & 55;
                    int i66 = -(-((i64 ^ 55) | i65));
                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                    int i68 = i67 % 128;
                    a = i68;
                    if (i67 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i69 = i68 ^ 123;
                    int i70 = (i68 & 123) << 1;
                    int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                    str = str2;
                } catch (ParseException unused) {
                    str = null;
                }
                dobActivity.aT = str;
                TextView textView = dobActivity.aj;
                int i73 = b;
                int i74 = i73 & 107;
                int i75 = (i73 | 107) & (~i74);
                int i76 = -(-(i74 << 1));
                int i77 = (i75 & i76) + (i75 | i76);
                a = i77 % 128;
                if (i77 % 2 != 0) {
                    textView.setText(str);
                    int i78 = 99 / 0;
                } else {
                    textView.setText(str);
                }
                int i79 = b;
                int i80 = i79 & 69;
                int i81 = ((i79 | 69) & (~i80)) + (i80 << 1);
                a = i81 % 128;
                int i82 = i81 % 2;
            }
            if (i28 > 115.0d) {
                int i83 = a;
                int i84 = (i83 ^ 55) + ((i83 & 55) << 1);
                b = i84 % 128;
                (i84 % 2 == 0 ? Toast.makeText(dobActivity, "Maximum Age should be 115", 1) : Toast.makeText(dobActivity, "Maximum Age should be 115", 0)).show();
                int i85 = b;
                int i86 = ((i85 ^ 31) | (i85 & 31)) << 1;
                int i87 = -(((~i85) & 31) | (i85 & (-32)));
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                a = i88 % 128;
                int i89 = i88 % 2;
            }
            int i90 = b + 124;
            int i91 = (i90 ^ (-1)) + (i90 << 1);
            a = i91 % 128;
            int i92 = i91 % 2;
            return;
        }
        if (i14 == 1) {
            ActivityRoster activityRoster = (ActivityRoster) this.d;
            int i93 = ActivityRoster.af;
            int i94 = a;
            int i95 = i94 & 15;
            int i96 = (((i94 ^ 15) | i95) << 1) - ((i94 | 15) & (~i95));
            b = i96 % 128;
            if (i96 % 2 == 0) {
                dH = activityRoster.H(i3, i2, i, true);
                activityRoster.aU = dH;
            } else {
                int i97 = i2 & 1;
                int i98 = -(-((i2 ^ 1) | i97));
                dH = activityRoster.H(i3, (i97 ^ i98) + ((i98 & i97) << 1), i, true);
                activityRoster.aU = dH;
            }
            int i99 = b;
            int i100 = ((i99 | 65) << 1) - (i99 ^ 65);
            a = i100 % 128;
            if (i100 % 2 != 0) {
                throw null;
            }
            if (dH > 115.0d) {
                int i101 = i99 + 83;
                a = i101 % 128;
                int i102 = i101 % 2;
                Toast.makeText(activityRoster, "Maximum Age should be 115", 0).show();
                activityRoster.N();
                return;
            }
            activityRoster.I(dH);
            activityRoster.P(activityRoster.aU);
            int i103 = a;
            int i104 = (-2) - (((i103 & 28) + (i103 | 28)) ^ (-1));
            b = i104 % 128;
            int i105 = i104 % 2;
            return;
        }
        int i106 = (i10 & 23) + (i10 | 23);
        a = i106 % 128;
        int i107 = i106 % 2;
        int i108 = ((i10 & (-96)) | ((~i10) & 95)) + ((i10 & 95) << 1);
        a = i108 % 128;
        int i109 = i108 % 2;
        OfflineRosterActivity offlineRosterActivity = (OfflineRosterActivity) this.d;
        int i110 = i2 & 1;
        int i111 = (i110 - (~(-(-((i2 ^ 1) | i110))))) - 1;
        offlineRosterActivity.sp_marital_status.setSelection(0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i3);
        int i112 = b;
        int i113 = (i112 ^ 107) + ((i112 & 107) << 1);
        a = i113 % 128;
        if (i113 % 2 != 0) {
            sb3.append("-");
            sb3.append(i111);
            throw null;
        }
        sb3.append("-");
        sb3.append(i111);
        int i114 = a;
        int i115 = (i114 ^ 61) + ((i114 & 61) << 1);
        b = i115 % 128;
        int i116 = i115 % 2;
        sb3.append("-");
        sb3.append(i);
        Date dateH2 = z.h(sb3.toString(), "dd-MM-yyyy");
        Date date2 = new Date();
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
        gregorianCalendar3.setTime(dateH2);
        GregorianCalendar gregorianCalendar4 = new GregorianCalendar();
        int i117 = b + 85;
        a = i117 % 128;
        int i118 = i117 % 2;
        gregorianCalendar4.setTime(date2);
        int i119 = gregorianCalendar4.get(1);
        int i120 = -gregorianCalendar3.get(1);
        int i121 = ((i119 | i120) << 1) - (((~i120) & i119) | ((~i119) & i120));
        int i122 = (-2) - ((b + 58) ^ (-1));
        int i123 = i122 % 128;
        a = i123;
        if (i122 % 2 == 0 ? i121 <= 115 : i121 <= 65) {
            int i124 = gregorianCalendar4.get(2);
            int i125 = ((i124 | 2) << 1) - (i124 ^ 2);
            int i126 = (i125 ^ (-1)) + (i125 << 1);
            int i127 = b;
            int i128 = i127 & 31;
            int i129 = -(-(i127 | 31));
            int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
            a = i130 % 128;
            int i131 = i130 % 2;
            int i132 = gregorianCalendar3.get(2);
            if (i126 < (((i132 ^ 1) | (i132 & 1)) << 1) - ((i132 & (-2)) | ((~i132) & 1))) {
                int i133 = a;
                int i134 = ((i133 ^ 32) + ((i133 & 32) << 1)) - 1;
                b = i134 % 128;
                int i135 = i134 % 2;
                int i136 = gregorianCalendar3.get(2);
                int i137 = gregorianCalendar4.get(2);
                int i138 = a;
                int i139 = ((i138 | 30) << 1) - (i138 ^ 30);
                int i140 = (i139 ^ (-1)) + (i139 << 1);
                b = i140 % 128;
                int i141 = i140 % 2;
                int i142 = i137 + 1;
                int i143 = i136 & 1;
                int i144 = (i136 ^ 1) | i143;
                int i145 = -(((i143 | i144) << 1) - (i144 ^ i143));
                int i146 = ((i145 & 12) - (~(i145 | 12))) - 1;
                d = (i142 & i146) + (i142 | i146);
                int i147 = i138 + 115;
                b = i147 % 128;
                if (i147 % 2 == 0) {
                    int i148 = i121 & (-100);
                    int i149 = i148 + ((i121 ^ (-100)) | i148);
                    i7 = i149 & 102;
                    i8 = (i149 ^ 102) | i7;
                } else {
                    int i150 = i121 + 86;
                    int i151 = i150 & (-87);
                    i7 = (~i151) & (i150 | (-87));
                    i8 = i151 << 1;
                }
                i121 = (i7 - (~(-(-i8)))) - 1;
            } else {
                int i152 = gregorianCalendar4.get(2);
                int i153 = i152 & 1;
                int i154 = (((i152 | 1) & (~i153)) - (~(-(-(i153 << 1))))) - 1;
                int i155 = a;
                int i156 = i155 & 1;
                int i157 = (i155 ^ 1) | i156;
                int i158 = (i156 & i157) + (i157 | i156);
                b = i158 % 128;
                int i159 = i158 % 2;
                int i160 = gregorianCalendar3.get(2);
                int i161 = i160 | 1;
                int i162 = i161 << 1;
                int i163 = -((~(i160 & 1)) & i161);
                int i164 = -((i162 ^ i163) + ((i163 & i162) << 1));
                int i165 = i154 & i164;
                int i166 = (i154 ^ i164) | i165;
                d = (i165 ^ i166) + ((i166 & i165) << 1);
                int i167 = a;
                int i168 = ((i167 ^ 83) - (~((i167 & 83) << 1))) - 1;
                b = i168 % 128;
                int i169 = i168 % 2;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i3);
            int i170 = a;
            int i171 = i170 & 79;
            int i172 = -(-((i170 ^ 79) | i171));
            int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
            b = i173 % 128;
            if (i173 % 2 == 0) {
                sb4.append("-");
                sb4.append(i111);
                int i174 = 34 / 0;
            } else {
                sb4.append("-");
                sb4.append(i111);
            }
            sb4.append("-");
            sb4.append(i);
            String strD = OfflineRosterActivity.D(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i3);
            int i175 = a;
            int i176 = (-2) - (((i175 ^ 112) + ((i175 & 112) << 1)) ^ (-1));
            b = i176 % 128;
            if (i176 % 2 == 0) {
                sb5.append("-");
                sb5.append(i111);
                throw null;
            }
            sb5.append("-");
            sb5.append(i111);
            int i177 = b + 73;
            a = i177 % 128;
            int i178 = i177 % 2;
            sb5.append("-");
            sb5.append(i);
            int i179 = a;
            int i180 = (i179 ^ 73) + ((i179 & 73) << 1);
            b = i180 % 128;
            int i181 = i180 % 2;
            offlineRosterActivity.Q(strD, sb5.toString());
            Spinner spinner = offlineRosterActivity.spinnerYear;
            int i182 = a;
            int i183 = ((i182 | 91) << 1) - (i182 ^ 91);
            b = i183 % 128;
            int i184 = i183 % 2;
            spinner.setSelection(i121);
            offlineRosterActivity.spinnerMonth.setSelection((int) d);
            int i185 = a;
            int i186 = (((i185 ^ 123) | (i185 & 123)) << 1) - (((~i185) & 123) | (i185 & (-124)));
            b = i186 % 128;
            int i187 = i186 % 2;
        } else {
            int i188 = ((i123 | 41) << 1) - (i123 ^ 41);
            b = i188 % 128;
            int i189 = i188 % 2;
            offlineRosterActivity.spinnerYear.setSelection(0);
            offlineRosterActivity.spinnerMonth.setSelection(0);
            int i190 = b;
            int i191 = (i190 ^ 63) + ((i190 & 63) << 1);
            a = i191 % 128;
            int i192 = i191 % 2;
        }
        double d2 = i121;
        offlineRosterActivity.aQ = d2;
        int i193 = b + 73;
        a = i193 % 128;
        if (i193 % 2 != 0) {
            throw null;
        }
        if (d2 > 115.0d) {
            Toast.makeText(offlineRosterActivity, "Maximum Age should be 115", 0).show();
            offlineRosterActivity.L();
            int i194 = b;
            int i195 = (((i194 | 38) << 1) - (i194 ^ 38)) - 1;
            a = i195 % 128;
            int i196 = i195 % 2;
            return;
        }
        offlineRosterActivity.I(d2);
        offlineRosterActivity.P(offlineRosterActivity.aQ);
        int i197 = a;
        int i198 = (i197 ^ 71) + ((i197 & 71) << 1);
        b = i198 % 128;
        if (i198 % 2 != 0) {
            return;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
