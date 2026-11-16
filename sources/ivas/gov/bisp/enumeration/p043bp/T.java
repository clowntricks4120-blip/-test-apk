package ivas.gov.bisp.enumeration.p043bp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;
import ivas.gov.bisp.enumeration.activity.NonBvsDashboardActivity;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.fragments.FragmentContactDetail;
import ivas.gov.bisp.enumeration.fragments.FragmentRoster;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ T(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c;
        Object obj = null;
        if (i5 == 0) {
            ActivityBeginSurvey activityBeginSurvey = (ActivityBeginSurvey) this.d;
            Button button = activityBeginSurvey.buttonNext;
            int i6 = b;
            int i7 = (i6 & (-56)) | ((~i6) & 55);
            int i8 = (i6 & 55) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            button.setEnabled(false);
            int i11 = activityBeginSurvey.aD;
            int i12 = i11 + 1;
            int i13 = b;
            int i14 = ((i13 ^ 58) + ((i13 & 58) << 1)) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                activityBeginSurvey.aD = i12;
                activityBeginSurvey.ai.size();
                throw null;
            }
            activityBeginSurvey.aD = i12;
            if (i12 >= activityBeginSurvey.ai.size()) {
                int size = activityBeginSurvey.ai.size();
                activityBeginSurvey.aD = (size - (~(-(-((size ^ (-1)) | size))))) - 1;
                int i15 = b;
                int i16 = ((((i15 ^ 117) | (i15 & 117)) << 1) - (~(-(((~i15) & 117) | (i15 & (-118)))))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            activityBeginSurvey.B(false, i11, activityBeginSurvey.ah);
            View currentFocus = activityBeginSurvey.getCurrentFocus();
            int i18 = b;
            int i19 = i18 | 83;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 83)) & i19);
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            int i23 = i22 % 128;
            a = i23;
            if (i22 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (currentFocus != null) {
                int i24 = ((((i23 ^ 121) | (i23 & 121)) << 1) - (~(-(((~i23) & 121) | (i23 & (-122)))))) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
                InputMethodManager inputMethodManager = (InputMethodManager) activityBeginSurvey.getSystemService("input_method");
                IBinder windowToken = currentFocus.getWindowToken();
                int i26 = a;
                int i27 = (i26 ^ 104) + ((i26 & 104) << 1);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                b = i28 % 128;
                if (i28 % 2 != 0) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 4);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
                }
                int i29 = b;
                int i30 = (i29 | 87) << 1;
                int i31 = -(i29 ^ 87);
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
            }
            int i34 = a;
            int i35 = i34 ^ 95;
            int i36 = (((i34 & 95) | i35) << 1) - i35;
            b = i36 % 128;
            int i37 = i36 % 2;
            return;
        }
        if (i5 == 1) {
            b bVar = (b) this.d;
            int i38 = CnicValidationActivity.r;
            bVar.dismiss();
            int i39 = a;
            int i40 = i39 & 91;
            int i41 = (i39 ^ 91) | i40;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            b = i42 % 128;
            int i43 = i42 % 2;
            return;
        }
        if (i5 == 2) {
            NonBvsDashboardActivity nonBvsDashboardActivity = (NonBvsDashboardActivity) this.d;
            EditText editText = nonBvsDashboardActivity.ad;
            int i44 = (-2) - ((b + 70) ^ (-1));
            a = i44 % 128;
            if (i44 % 2 == 0) {
                editText.getText().toString().trim().isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!editText.getText().toString().trim().isEmpty()) {
                nonBvsDashboardActivity.u("Beneficiary Verified", "Proceed to POS agent Biometric.");
                LinearLayout linearLayout = nonBvsDashboardActivity.ah;
                int i45 = b;
                int i46 = i45 ^ 117;
                int i47 = (i45 & 117) << 1;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                a = i48 % 128;
                int i49 = i48 % 2;
                linearLayout.setVisibility(0);
                nonBvsDashboardActivity.af.setVisibility(8);
                int i50 = a;
                int i51 = ((i50 | 89) << 1) - (i50 ^ 89);
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i52 = b;
            int i53 = i52 ^ 71;
            int i54 = ((i52 & 71) | i53) << 1;
            int i55 = -i53;
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            a = i56 % 128;
            int i57 = i56 % 2;
            nonBvsDashboardActivity.u("Input Required", "Please enter CNIC number.");
            if (i57 == 0) {
                throw null;
            }
            int i58 = a;
            int i59 = i58 | 31;
            int i60 = ((i59 << 1) - (~(-((~(i58 & 31)) & i59)))) - 1;
            b = i60 % 128;
            if (i60 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i5 == 3) {
            AlertDialog alertDialog = (AlertDialog) this.d;
            int i61 = SimConfirmationActivity.r;
            int i62 = a;
            int i63 = i62 & 55;
            int i64 = ((((i62 ^ 55) | i63) << 1) - (~(-((i62 | 55) & (~i63))))) - 1;
            b = i64 % 128;
            int i65 = i64 % 2;
            alertDialog.dismiss();
            int i66 = a;
            int i67 = (i66 ^ 1) + ((i66 & 1) << 1);
            b = i67 % 128;
            int i68 = i67 % 2;
            return;
        }
        if (i5 == 4) {
            Authentication authentication = (Authentication) this.d;
            int i69 = Authentication.ac;
            Objects.requireNonNull(authentication);
            Intent intent = new Intent(authentication, (Class<?>) ChangePasswordActivity.class);
            int i70 = a;
            int i71 = (i70 ^ 1) + ((i70 & 1) << 1);
            b = i71 % 128;
            int i72 = i71 % 2;
            intent.putExtra("IP_URL", "https://meladeskapp.bisp.gov.pk");
            authentication.startActivity(intent);
            int i73 = b;
            int i74 = (i73 ^ 67) + ((i73 & 67) << 1);
            a = i74 % 128;
            if (i74 % 2 == 0) {
                int i75 = 4 / 0;
                return;
            }
            return;
        }
        if (i5 == 5) {
            FragmentContactDetail.c((FragmentContactDetail) this.d, view);
            int i76 = a;
            int i77 = (((i76 & (-4)) | ((~i76) & 3)) - (~(-(-((i76 & 3) << 1))))) - 1;
            b = i77 % 128;
            int i78 = i77 % 2;
            return;
        }
        int i79 = (((i2 & (-124)) | ((~i2) & 123)) - (~(-(-((i2 & 123) << 1))))) - 1;
        a = i79 % 128;
        int i80 = i79 % 2;
        int i81 = i2 & 69;
        int i82 = i81 + ((i2 ^ 69) | i81);
        a = i82 % 128;
        if (i82 % 2 == 0) {
            FragmentRoster.g((FragmentRoster) this.d, view);
            int i83 = 35 / 0;
        } else {
            FragmentRoster.g((FragmentRoster) this.d, view);
        }
        int i84 = (-2) - ((b + 96) ^ (-1));
        a = i84 % 128;
        int i85 = i84 % 2;
    }
}
