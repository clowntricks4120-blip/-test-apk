package ivas.gov.bisp.enumeration.p043bp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.DatePicker;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.dd.N;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0204j implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0204j(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        switch (this.c) {
            case 0:
                ActivityAgriculture activityAgriculture = (ActivityAgriculture) this.d;
                int i6 = ActivityAgriculture.af;
                activityAgriculture.finish();
                int i7 = b + 23;
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 24 / 0;
                    return;
                }
                return;
            case 1:
                Spinner spinner = ((ActivityRoster.OooO) this.d).c.sp_marital_status;
                int i9 = b;
                int i10 = (i9 ^ 39) + ((i9 & 39) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                spinner.setSelection(0);
                int i12 = b;
                int i13 = ((i12 | 37) << 1) - (i12 ^ 37);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 2:
                DobActivity dobActivity = (DobActivity) this.d;
                int i14 = DobActivity.ac;
                Objects.requireNonNull(dobActivity);
                int i15 = b;
                int i16 = (((i15 ^ 73) | (i15 & 73)) << 1) - (((~i15) & 73) | (i15 & (-74)));
                a = i16 % 128;
                int i17 = i16 % 2;
                Calendar gregorianCalendar = GregorianCalendar.getInstance();
                dobActivity.aR = gregorianCalendar.get(1);
                int i18 = b;
                int i19 = (i18 & 1) + (i18 | 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                dobActivity.aX = gregorianCalendar.get(2);
                dobActivity.aG = gregorianCalendar.get(5);
                DatePickerDialog datePickerDialog = new DatePickerDialog(dobActivity, new N(dobActivity, 0), dobActivity.aR, dobActivity.aX, dobActivity.aG);
                DatePicker datePicker = datePickerDialog.getDatePicker();
                int i21 = dobActivity.aR;
                Date date = new Date((-2) - (((i21 ^ (-1899)) + ((i21 & (-1899)) << 1)) ^ (-1)), dobActivity.aX, dobActivity.aG);
                int i22 = (-2) - ((b + 26) ^ (-1));
                a = i22 % 128;
                int i23 = i22 % 2;
                datePicker.setMaxDate(date.getTime());
                datePickerDialog.show();
                dialogInterface.dismiss();
                int i24 = a;
                int i25 = i24 & 123;
                int i26 = -(-((i24 ^ 123) | i25));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                b = i27 % 128;
                int i28 = i27 % 2;
                return;
            case 3:
                ActivityEnumeratorMain activityEnumeratorMain = (ActivityEnumeratorMain) this.d;
                ActivityEnumeratorMain activityEnumeratorMain2 = ActivityEnumeratorMain.ac;
                int i29 = b + 115;
                a = i29 % 128;
                int i30 = i29 % 2;
                activityEnumeratorMain.finish();
                int i31 = b + 63;
                a = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 11 / 0;
                    return;
                }
                return;
            case 4:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.d;
                Pattern pattern = ChangePasswordActivity.r;
                Objects.requireNonNull(changePasswordActivity);
                int i33 = b;
                int i34 = (i33 ^ 101) + ((i33 & 101) << 1);
                a = i34 % 128;
                int i35 = i34 % 2;
                dialogInterface.dismiss();
                changePasswordActivity.finish();
                int i36 = a;
                int i37 = (i36 & 105) + (i36 | 105);
                b = i37 % 128;
                int i38 = i37 % 2;
                return;
            case 5:
                OfflineRosterActivity offlineRosterActivity = (OfflineRosterActivity) this.d;
                int i39 = OfflineRosterActivity.af;
                int i40 = a;
                int i41 = (i40 ^ 15) + ((i40 & 15) << 1);
                b = i41 % 128;
                int i42 = i41 % 2;
                offlineRosterActivity.finish();
                int i43 = a;
                int i44 = ((i43 ^ 99) - (~(-(-((i43 & 99) << 1))))) - 1;
                b = i44 % 128;
                if (i44 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 6:
                ((Activity) ((Context) this.d)).finish();
                int i45 = a;
                int i46 = i45 & 103;
                int i47 = -(-(i45 | 103));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                b = i48 % 128;
                int i49 = i48 % 2;
                return;
            default:
                int i50 = i3 & 103;
                int i51 = -(-((i3 ^ 103) | i50));
                int i52 = (i50 & i51) + (i50 | i51);
                b = i52 % 128;
                int i53 = i52 % 2;
                int i54 = i3 & 105;
                int i55 = (i54 - (~(-(-((i3 ^ 105) | i54))))) - 1;
                b = i55 % 128;
                int i56 = i55 % 2;
                ((Activity) this.d).finishAffinity();
                System.exit(0);
                int i57 = a;
                int i58 = ((((i57 ^ 93) | (i57 & 93)) << 1) - (~(-(((~i57) & 93) | (i57 & (-94)))))) - 1;
                b = i58 % 128;
                int i59 = i58 % 2;
                return;
        }
    }
}
