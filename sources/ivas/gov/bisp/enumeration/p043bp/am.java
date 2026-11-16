package ivas.gov.bisp.enumeration.p043bp;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.DatePicker;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.activitybase.BaseAuth;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import ivas.gov.bisp.enumeration.p049bv.P;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUserNew;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ am(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = 1;
        int i6 = (((i4 | 110) << 1) - (i4 ^ 110)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 5;
        Object obj = null;
        switch (this.c) {
            case 0:
                ActivityBeginSurvey.this.finish();
                int i9 = a;
                int i10 = i9 & 19;
                int i11 = ((i9 ^ 19) | i10) << 1;
                int i12 = -((i9 | 19) & (~i10));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                return;
            case 1:
                UpdateRosterActivity updateRosterActivity = (UpdateRosterActivity) this.d;
                int i15 = UpdateRosterActivity.af;
                Objects.requireNonNull(updateRosterActivity);
                int i16 = b;
                int i17 = i16 | 123;
                int i18 = i17 << 1;
                int i19 = -((~(i16 & 123)) & i17);
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                Calendar gregorianCalendar = GregorianCalendar.getInstance();
                updateRosterActivity.ak = gregorianCalendar.get(1);
                int i22 = a;
                int i23 = (i22 | 39) << 1;
                int i24 = -(((~i22) & 39) | (i22 & (-40)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    updateRosterActivity.al = gregorianCalendar.get(5);
                    i8 = 4;
                } else {
                    updateRosterActivity.al = gregorianCalendar.get(2);
                }
                updateRosterActivity.by = gregorianCalendar.get(i8);
                DatePickerDialog datePickerDialog = new DatePickerDialog(updateRosterActivity.ae, new V(updateRosterActivity, i5), updateRosterActivity.ak, updateRosterActivity.al, updateRosterActivity.by);
                DatePicker datePicker = datePickerDialog.getDatePicker();
                int i26 = updateRosterActivity.ak;
                Date date = new Date(((i26 | (-1900)) << 1) - (i26 ^ (-1900)), updateRosterActivity.al, updateRosterActivity.by);
                int i27 = a;
                int i28 = i27 & 123;
                int i29 = -(-((i27 ^ 123) | i28));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                b = i30 % 128;
                int i31 = i30 % 2;
                datePicker.setMaxDate(date.getTime());
                datePickerDialog.show();
                dialogInterface.dismiss();
                int i32 = a;
                int i33 = ((i32 ^ 114) + ((i32 & 114) << 1)) - 1;
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 2:
                DobDiscrepancy dobDiscrepancy = (DobDiscrepancy) this.d;
                int i34 = DobDiscrepancy.ac;
                Objects.requireNonNull(dobDiscrepancy);
                int i35 = a;
                int i36 = (((i35 | 26) << 1) - (i35 ^ 26)) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
                Calendar gregorianCalendar2 = GregorianCalendar.getInstance();
                dobDiscrepancy.aD = gregorianCalendar2.get(1);
                int i38 = b;
                int i39 = ((i38 ^ 1) | (i38 & 1)) << 1;
                int i40 = -(((~i38) & 1) | (i38 & (-2)));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                a = i41 % 128;
                int i42 = i41 % 2;
                dobDiscrepancy.az = gregorianCalendar2.get(2);
                dobDiscrepancy.aB = gregorianCalendar2.get(5);
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(dobDiscrepancy, new V(dobDiscrepancy, i2), dobDiscrepancy.aD, dobDiscrepancy.az, dobDiscrepancy.aB);
                DatePicker datePicker2 = datePickerDialog2.getDatePicker();
                Date date2 = new Date(dobDiscrepancy.aD - 1900, dobDiscrepancy.az, dobDiscrepancy.aB);
                int i43 = a;
                int i44 = ((i43 & 52) + (i43 | 52)) - 1;
                b = i44 % 128;
                if (i44 % 2 == 0) {
                    datePicker2.setMaxDate(date2.getTime());
                    datePickerDialog2.show();
                    dialogInterface.dismiss();
                    return;
                } else {
                    datePicker2.setMaxDate(date2.getTime());
                    datePickerDialog2.show();
                    dialogInterface.dismiss();
                    obj.hashCode();
                    throw null;
                }
            case 3:
                BaseAuth baseAuth = (BaseAuth) this.d;
                int i45 = BaseAuth.r;
                baseAuth.finish();
                int i46 = b + 121;
                a = i46 % 128;
                if (i46 % 2 == 0) {
                    int i47 = 76 / 0;
                    return;
                }
                return;
            case 4:
                ActivityEnumeratorMain activityEnumeratorMain = (ActivityEnumeratorMain) this.d;
                ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
                int i48 = b;
                int i49 = (i48 & 25) + (i48 | 25);
                a = i49 % 128;
                int i50 = i49 % 2;
                activityEnumeratorMain.finish();
                int i51 = b;
                int i52 = i51 ^ 117;
                int i53 = ((i51 & 117) | i52) << 1;
                int i54 = -i52;
                int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                a = i55 % 128;
                int i56 = i55 % 2;
                return;
            case 5:
                ((P) this.d).c.finish();
                int i57 = b + 81;
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    int i58 = 99 / 0;
                    return;
                }
                return;
            case 6:
                PasswordResetActivity passwordResetActivity = (PasswordResetActivity) this.d;
                Pattern pattern = PasswordResetActivity.s;
                Objects.requireNonNull(passwordResetActivity);
                dialogInterface.dismiss();
                Intent intent = new Intent(passwordResetActivity, (Class<?>) Authentication.class);
                int i59 = a;
                int i60 = (i59 | 1) << 1;
                int i61 = -(((~i59) & 1) | (i59 & (-2)));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                b = i62 % 128;
                if (i62 % 2 != 0) {
                    intent.setFlags(268468224);
                    passwordResetActivity.startActivity(intent);
                    int i63 = 34 / 0;
                } else {
                    intent.setFlags(268468224);
                    passwordResetActivity.startActivity(intent);
                }
                int i64 = b + 67;
                a = i64 % 128;
                if (i64 % 2 != 0) {
                    passwordResetActivity.finish();
                    return;
                } else {
                    passwordResetActivity.finish();
                    obj.hashCode();
                    throw null;
                }
            case 7:
                Spinner spinner = ((ActivityRoster.OooOOO) this.d).c.sp_marital_status;
                int i65 = b;
                int i66 = ((i65 & 71) - (~(-(-(i65 | 71))))) - 1;
                a = i66 % 128;
                if (i66 % 2 == 0) {
                    spinner.setSelection(0);
                    return;
                } else {
                    spinner.setSelection(0);
                    return;
                }
            case 8:
                Spinner spinner2 = OfflineRosterActivity.this.sp_marital_status;
                int i67 = b;
                int i68 = (((i67 | 86) << 1) - (i67 ^ 86)) - 1;
                a = i68 % 128;
                if (i68 % 2 == 0) {
                    spinner2.setSelection(1);
                    return;
                } else {
                    spinner2.setSelection(0);
                    return;
                }
            case 9:
                ActivitySpotCheckUser activitySpotCheckUser = (ActivitySpotCheckUser) this.d;
                int i69 = ActivitySpotCheckUser.af;
                int i70 = a;
                int i71 = i70 & 111;
                int i72 = (i70 ^ 111) | i71;
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                b = i73 % 128;
                if (i73 % 2 == 0) {
                    activitySpotCheckUser.finish();
                    return;
                } else {
                    activitySpotCheckUser.finish();
                    throw null;
                }
            default:
                int i74 = i4 ^ 119;
                int i75 = (((i4 & 119) | i74) << 1) - i74;
                a = i75 % 128;
                int i76 = i75 % 2;
                int i77 = (-2) - (((i4 ^ 38) + ((i4 & 38) << 1)) ^ (-1));
                a = i77 % 128;
                int i78 = i77 % 2;
                ActivitySpotCheckUserNew activitySpotCheckUserNew = (ActivitySpotCheckUserNew) this.d;
                int i79 = ActivitySpotCheckUserNew.af;
                Objects.requireNonNull(activitySpotCheckUserNew);
                int i80 = a + 117;
                b = i80 % 128;
                if (i80 % 2 != 0) {
                    dialogInterface.dismiss();
                    activitySpotCheckUserNew.finish();
                    obj.hashCode();
                    throw null;
                }
                dialogInterface.dismiss();
                activitySpotCheckUserNew.finish();
                int i81 = b;
                int i82 = i81 ^ 49;
                int i83 = (((i81 & 49) | i82) << 1) - i82;
                a = i83 % 128;
                int i84 = i83 % 2;
                return;
        }
    }
}
