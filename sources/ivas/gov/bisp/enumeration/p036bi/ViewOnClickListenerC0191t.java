package ivas.gov.bisp.enumeration.p036bi;

import android.R;
import android.app.AlertDialog;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.activity.NonBvsDashboardActivity;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;
import ivas.gov.bisp.enumeration.otp.j;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p043bp.T;
import ivas.gov.bisp.enumeration.utils.NoPasteEditText;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import java.util.UUID;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0191t implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ViewOnClickListenerC0191t(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0443  */
    /* JADX WARN: Code duplicated, block: B:102:0x0449  */
    /* JADX WARN: Code duplicated, block: B:104:0x0454  */
    /* JADX WARN: Code duplicated, block: B:106:0x045e  */
    /* JADX WARN: Code duplicated, block: B:108:0x046d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0477  */
    /* JADX WARN: Code duplicated, block: B:112:0x0482  */
    /* JADX WARN: Code duplicated, block: B:114:0x048a  */
    /* JADX WARN: Code duplicated, block: B:116:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:128:0x0501  */
    /* JADX WARN: Code duplicated, block: B:130:0x0514  */
    /* JADX WARN: Code duplicated, block: B:134:0x0559  */
    /* JADX WARN: Code duplicated, block: B:135:0x0561  */
    /* JADX WARN: Code duplicated, block: B:141:0x0586  */
    /* JADX WARN: Code duplicated, block: B:143:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:144:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x06be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0274  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0307  */
    /* JADX WARN: Code duplicated, block: B:69:0x0334  */
    /* JADX WARN: Code duplicated, block: B:70:0x033e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0369  */
    /* JADX WARN: Code duplicated, block: B:74:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x040b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0413  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String strReplaceAll;
        String string;
        int i2;
        String strReplaceAll2;
        NoPasteEditText noPasteEditText;
        String strReplaceAll3;
        String strTrim;
        int selectedItemPosition;
        int i3;
        int i4;
        int i5;
        String strE;
        double d;
        double d2;
        final String strTrim2;
        int i6;
        int i7;
        String strSubstring;
        final String strSubstring2;
        final long j;
        int i8;
        boolean z;
        ViewGroup viewGroup;
        LayoutInflater layoutInflaterFrom;
        int i9;
        int i10;
        int i11;
        int i12;
        lib_mobile lib_mobileVar;
        int i13;
        int i14 = 2 % 2;
        int i15 = b;
        int i16 = (-2) - (((i15 & 86) + (i15 | 86)) ^ (-1));
        a = i16 % 128;
        Object obj = null;
        if (i16 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i17 = this.c;
        if (i17 == 0) {
            AlertDialog alertDialog = (AlertDialog) this.d;
            int i18 = BikeRegistryActivity.r;
            alertDialog.dismiss();
            return;
        }
        if (i17 == 1) {
            NonBvsDashboardActivity nonBvsDashboardActivity = (NonBvsDashboardActivity) this.d;
            AlertDialog alertDialog2 = nonBvsDashboardActivity.ai;
            int i19 = b;
            int i20 = (i19 ^ 28) + ((i19 & 28) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            if (alertDialog2 != null) {
                int i23 = i19 ^ 49;
                int i24 = ((i19 & 49) | i23) << 1;
                int i25 = -i23;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                a = i26 % 128;
                int i27 = i26 % 2;
                alertDialog2.dismiss();
                nonBvsDashboardActivity.ai = null;
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                FragmentPictures.h((FragmentPictures) this.d, view);
                return;
            }
            OtpVerificationActivity otpVerificationActivity = (OtpVerificationActivity) this.d;
            StringBuilder sb = new StringBuilder();
            EditText[] editTextArr = otpVerificationActivity.t;
            int length = editTextArr.length;
            int i28 = b;
            int i29 = i28 | 35;
            int i30 = (i29 << 1) - ((~(i28 & 35)) & i29);
            a = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            while (i32 < length) {
                int i33 = b;
                int i34 = i33 & 37;
                int i35 = (((i33 ^ 37) | i34) << 1) - ((i33 | 37) & (~i34));
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    editTextArr[i32].getText();
                    throw null;
                }
                sb.append(editTextArr[i32].getText().toString().trim());
                int i36 = i32 + 78;
                i32 = (i36 | (-77)) + (i36 & (-77));
                int i37 = b;
                int i38 = ((i37 ^ 57) | (i37 & 57)) << 1;
                int i39 = -(((~i37) & 57) | (i37 & (-58)));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
            String string2 = sb.toString();
            if (string2.length() < 6) {
                int i42 = a;
                int i43 = i42 & 73;
                int i44 = (((i42 ^ 73) | i43) << 1) - ((i42 | 73) & (~i43));
                b = i44 % 128;
                int i45 = i44 % 2;
                otpVerificationActivity.r();
                Toast.makeText(otpVerificationActivity, "Please enter all 6 digits of the OTP", 0).show();
                return;
            }
            otpVerificationActivity.s(true);
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(otpVerificationActivity.G);
                sb2.append("/api/Users/VerifyOTP");
                String string3 = sb2.toString();
                JSONObject jSONObject = new JSONObject();
                int i46 = a + 63;
                b = i46 % 128;
                if (i46 % 2 == 0) {
                    jSONObject.put("otp_code", string2);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jSONObject.put("otp_code", string2);
                jSONObject.put("transaction_id", otpVerificationActivity.D);
                jSONObject.put("user_id", otpVerificationActivity.F);
                ax.e(jSONObject, otpVerificationActivity, string3, new j(otpVerificationActivity));
                int i47 = b;
                int i48 = ((((i47 ^ 29) | (i47 & 29)) << 1) - (~(-(((~i47) & 29) | (i47 & (-30)))))) - 1;
                a = i48 % 128;
                if (i48 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
                otpVerificationActivity.s(false);
                return;
            }
        }
        final SimConfirmationActivity simConfirmationActivity = (SimConfirmationActivity) this.d;
        NoPasteEditText noPasteEditText2 = simConfirmationActivity.s;
        int i49 = a;
        int i50 = i49 & 43;
        int i51 = ((i49 | 43) & (~i50)) + (i50 << 1);
        b = i51 % 128;
        int i52 = i51 % 2;
        String strReplaceAll4 = noPasteEditText2.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
        int i53 = a;
        int i54 = i53 & 111;
        int i55 = i54 + ((i53 ^ 111) | i54);
        b = i55 % 128;
        int i56 = i55 % 2;
        String string4 = simConfirmationActivity.u.getText().toString();
        int i57 = a;
        int i58 = (i57 & (-4)) | ((~i57) & 3);
        int i59 = (i57 & 3) << 1;
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        b = i60 % 128;
        int i61 = i60 % 2;
        String strReplaceAll5 = string4.replaceAll("[^\\d]", BuildConfig.FLAVOR);
        EditText editText = simConfirmationActivity.t;
        int i62 = b;
        int i63 = (-2) - ((((i62 | 92) << 1) - (i62 ^ 92)) ^ (-1));
        a = i63 % 128;
        if (i63 % 2 != 0) {
            editText.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
            throw null;
        }
        if (editText.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR).length() != 13) {
            int i64 = b;
            int i65 = (i64 & 13) + (i64 | 13);
            a = i65 % 128;
            int i66 = i65 % 2;
            simConfirmationActivity.t("Invalid CNIC", "Please enter a valid 13-digit CNIC.");
            int i67 = a;
            int i68 = i67 ^ 21;
            int i69 = ((i67 & 21) | i68) << 1;
            int i70 = -i68;
            int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
            b = i71 % 128;
            int i72 = i71 % 2;
        } else if (strReplaceAll4.length() != 11) {
            simConfirmationActivity.t("Invalid Phone Number", "Please enter a valid 11-digit phone number.");
        } else if (strReplaceAll5.length() != 11) {
            int i73 = a;
            int i74 = i73 & 23;
            int i75 = (i73 ^ 23) | i74;
            int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
            b = i76 % 128;
            int i77 = i76 % 2;
            simConfirmationActivity.t("Invalid Confirm Number", "Please enter a valid 11-digit confirm phone number.");
        } else if (strReplaceAll4.equals(strReplaceAll5)) {
            String strTrim3 = simConfirmationActivity.y.getSelectedItem().toString().trim();
            int i78 = b;
            int i79 = i78 & 71;
            int i80 = -(-((i78 ^ 71) | i79));
            int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
            a = i81 % 128;
            if (i81 % 2 != 0) {
                int i82 = 28 / 0;
                if (simConfirmationActivity.u(strReplaceAll4, strTrim3)) {
                    i = (-2) - ((b + 96) ^ (-1));
                    a = i % 128;
                    if (i % 2 == 0) {
                        simConfirmationActivity.t.getText().toString();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    strReplaceAll = simConfirmationActivity.t.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    string = simConfirmationActivity.s.getText().toString();
                    int i83 = a;
                    int i84 = (i83 | 51) << 1;
                    int i85 = -(i83 ^ 51);
                    i2 = (i84 ^ i85) + ((i85 & i84) << 1);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        strReplaceAll2 = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                        noPasteEditText = simConfirmationActivity.u;
                        int i86 = 89 / 0;
                    } else {
                        strReplaceAll2 = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                        noPasteEditText = simConfirmationActivity.u;
                    }
                    strReplaceAll3 = noPasteEditText.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    int i87 = b;
                    int i88 = (-2) - ((((i87 | 72) << 1) - (i87 ^ 72)) ^ (-1));
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    if (simConfirmationActivity.y.getSelectedItem() != null) {
                        int i90 = a;
                        int i91 = i90 ^ 3;
                        int i92 = -(-((i90 & 3) << 1));
                        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                        b = i93 % 128;
                        int i94 = i93 % 2;
                        String string5 = simConfirmationActivity.y.getSelectedItem().toString();
                        int i95 = a + 33;
                        b = i95 % 128;
                        int i96 = i95 % 2;
                        strTrim = string5.trim();
                        int i97 = b;
                        int i98 = i97 & 41;
                        int i99 = (((i97 ^ 41) | i98) << 1) - ((i97 | 41) & (~i98));
                        a = i99 % 128;
                        int i100 = i99 % 2;
                    } else {
                        int i101 = b;
                        int i102 = ((i101 ^ 42) + ((i101 & 42) << 1)) - 1;
                        a = i102 % 128;
                        int i103 = i102 % 2;
                        strTrim = BuildConfig.FLAVOR;
                    }
                    selectedItemPosition = simConfirmationActivity.y.getSelectedItemPosition();
                    if (selectedItemPosition >= 0) {
                        int i104 = b;
                        int i105 = (((~i104) & 1) | (i104 & (-2))) + ((i104 & 1) << 1);
                        a = i105 % 128;
                        int i106 = i105 % 2;
                        if (selectedItemPosition < simConfirmationActivity.L.size()) {
                            lib_mobileVar = simConfirmationActivity.L.get(selectedItemPosition);
                            int i107 = b;
                            i13 = ((i107 | 123) << 1) - (i107 ^ 123);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i108 = lib_mobileVar.operatorCode;
                                throw null;
                            }
                            i3 = lib_mobileVar.operatorCode;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 0;
                    }
                    if (strReplaceAll.length() != 13) {
                        int i109 = b;
                        int i110 = i109 & 43;
                        int i111 = i110 + ((i109 ^ 43) | i110);
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        simConfirmationActivity.t("Invalid CNIC", "Please enter a valid 13-digit CNIC.");
                        return;
                    }
                    if (strReplaceAll2.length() == 11) {
                        i4 = b + 109;
                        a = i4 % 128;
                        if (i4 % 2 != 0 ? strReplaceAll3.length() == 11 : strReplaceAll3.length() == 51) {
                            int i113 = b;
                            int i114 = i113 & 43;
                            i5 = (((i113 ^ 43) | i114) << 1) - ((i113 | 43) & (~i114));
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                strReplaceAll2.equals(strReplaceAll3);
                                throw null;
                            }
                            if (!strReplaceAll2.equals(strReplaceAll3)) {
                                simConfirmationActivity.s();
                                simConfirmationActivity.t("Phone Mismatch", "Phone numbers do not match.");
                                return;
                            }
                            if (ac.h(true).equals(BuildConfig.FLAVOR)) {
                                int i115 = a;
                                i12 = ((i115 | 99) << 1) - (i115 ^ 99);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    Toast.makeText(simConfirmationActivity, "IP Not Found", 1).show();
                                    return;
                                } else {
                                    Toast.makeText(simConfirmationActivity, "IP Not Found", 0).show();
                                    return;
                                }
                            }
                            strE = BISPApplication.e();
                            if (strE != null) {
                                int i116 = b;
                                int i117 = i116 & 69;
                                int i118 = (i116 | 69) & (~i117);
                                int i119 = i117 << 1;
                                int i120 = (i118 ^ i119) + ((i118 & i119) << 1);
                                a = i120 % 128;
                                int i121 = i120 % 2;
                                if (strE.contains(",")) {
                                    int i122 = b;
                                    int i123 = i122 & 37;
                                    int i124 = -(-((i122 ^ 37) | i123));
                                    int i125 = (i123 & i124) + (i124 | i123);
                                    a = i125 % 128;
                                    int i126 = i125 % 2;
                                    try {
                                        String[] strArrSplit = strE.split(",");
                                        d = Double.parseDouble(strArrSplit[0].trim());
                                        try {
                                            d2 = Double.parseDouble(strArrSplit[1].trim());
                                        } catch (Exception unused2) {
                                            Toast.makeText(simConfirmationActivity, "Unable to fetch location. Please enable GPS.", 0).show();
                                            int i127 = a + 69;
                                            int i128 = i127 % 128;
                                            b = i128;
                                            int i129 = i127 % 2;
                                            int i130 = i128 & 5;
                                            int i131 = (i130 - (~((i128 ^ 5) | i130))) - 1;
                                            a = i131 % 128;
                                            if (i131 % 2 != 0) {
                                                int i132 = 2 / 2;
                                            }
                                            d2 = 0.0d;
                                        }
                                    } catch (Exception unused3) {
                                        d = 0.0d;
                                    }
                                } else {
                                    d = 0.0d;
                                    d2 = 0.0d;
                                }
                            } else {
                                d = 0.0d;
                                d2 = 0.0d;
                            }
                            if (d == 0.0d) {
                                i11 = a;
                                int i133 = ((i11 & 60) + (i11 | 60)) - 1;
                                b = i133 % 128;
                                int i134 = i133 % 2;
                                if (d2 == 0.0d) {
                                    int i135 = (i11 & (-30)) | ((~i11) & 29);
                                    int i136 = -(-((i11 & 29) << 1));
                                    int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                                    b = i137 % 128;
                                    int i138 = i137 % 2;
                                    Toast.makeText(simConfirmationActivity, "Location not available, please try again.", 0).show();
                                    return;
                                }
                            }
                            strTrim2 = strReplaceAll.trim();
                            Objects.requireNonNull(strTrim);
                            int i139 = a;
                            int i140 = ((i139 ^ 99) | (i139 & 99)) << 1;
                            int i141 = -(((~i139) & 99) | (i139 & (-100)));
                            i6 = (i140 ^ i141) + ((i141 & i140) << 1);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                i7 = 5;
                                strSubstring = strReplaceAll2.substring(1, 5);
                            } else {
                                i7 = 4;
                                strSubstring = strReplaceAll2.substring(0, 4);
                            }
                            strSubstring2 = strReplaceAll2.substring(i7);
                            try {
                                String strTrim4 = simConfirmationActivity.K.trim();
                                int i142 = a;
                                int i143 = (i142 ^ 45) + ((i142 & 45) << 1);
                                b = i143 % 128;
                                int i144 = i143 % 2;
                                j = Long.parseLong(strTrim4);
                                if (i3 <= 0) {
                                    simConfirmationActivity.t("Invalid Operator", "Operator ID must be numeric.");
                                    int i145 = b;
                                    int i146 = ((i145 & 121) - (~(-(-(i145 | 121))))) - 1;
                                    a = i146 % 128;
                                    int i147 = i146 % 2;
                                    return;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(strSubstring);
                                sb3.append("-");
                                sb3.append(strSubstring2);
                                String string6 = sb3.toString();
                                String string7 = simConfirmationActivity.t.getText().toString();
                                final int i148 = i3;
                                final double d3 = d;
                                final double d4 = d2;
                                final String str = strSubstring;
                                Runnable runnable = new Runnable() { // from class: ivas.gov.bisp.enumeration.bi.aH
                                    private static int a = 0;
                                    private static int b = 1;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String deviceId;
                                        int i149;
                                        int i150 = 2 % 2;
                                        int i151 = a;
                                        int i152 = (((i151 ^ 111) | (i151 & 111)) << 1) - ((i151 & (-112)) | ((~i151) & 111));
                                        b = i152 % 128;
                                        if (i152 % 2 == 0) {
                                            throw null;
                                        }
                                        SimConfirmationActivity simConfirmationActivity2 = simConfirmationActivity;
                                        String str2 = strTrim2;
                                        int i153 = i148;
                                        int i154 = i151 + 63;
                                        b = i154 % 128;
                                        int i155 = i154 % 2;
                                        double d5 = d3;
                                        double d6 = d4;
                                        long j2 = j;
                                        int i156 = i151 & 57;
                                        int i157 = (i151 | 57) & (~i156);
                                        int i158 = -(-(i156 << 1));
                                        int i159 = (i157 ^ i158) + ((i157 & i158) << 1);
                                        b = i159 % 128;
                                        if (i159 % 2 == 0) {
                                            int i160 = SimConfirmationActivity.r;
                                            throw null;
                                        }
                                        String str3 = str;
                                        String str4 = strSubstring2;
                                        int i161 = SimConfirmationActivity.r;
                                        Objects.requireNonNull(simConfirmationActivity2);
                                        simConfirmationActivity2.H = new SessionManager(simConfirmationActivity2);
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONObject jSONObject3 = new JSONObject();
                                        int i162 = a;
                                        int i163 = i162 & 83;
                                        int i164 = i163 + ((i162 ^ 83) | i163);
                                        b = i164 % 128;
                                        if (i164 % 2 == 0) {
                                            int i165 = Build.VERSION.SDK_INT;
                                            throw null;
                                        }
                                        TelephonyManager telephonyManager = (TelephonyManager) simConfirmationActivity2.getSystemService("phone");
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            int i166 = b;
                                            int i167 = i166 | 15;
                                            int i168 = ((i167 << 1) - (~(-((~(i166 & 15)) & i167)))) - 1;
                                            a = i168 % 128;
                                            if (i168 % 2 != 0) {
                                                deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                                int i169 = 83 / 0;
                                            } else {
                                                deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                            }
                                            int i170 = b;
                                            int i171 = ((i170 | 81) << 1) - (i170 ^ 81);
                                            a = i171 % 128;
                                            int i172 = i171 % 2;
                                            i149 = 2;
                                        } else {
                                            deviceId = telephonyManager.getDeviceId();
                                            int i173 = a;
                                            int i174 = i173 ^ 109;
                                            int i175 = ((i173 & 109) | i174) << 1;
                                            int i176 = -i174;
                                            int i177 = (i175 & i176) + (i175 | i176);
                                            b = i177 % 128;
                                            i149 = 2;
                                            int i178 = i177 % 2;
                                        }
                                        if (deviceId.isEmpty()) {
                                            int i179 = a + 57;
                                            b = i179 % 128;
                                            int i180 = i179 % i149;
                                            simConfirmationActivity2.t("IMEI", "IMEI Error");
                                            int i181 = b;
                                            int i182 = (i181 ^ 117) + ((i181 & 117) << 1);
                                            a = i182 % 128;
                                            if (i182 % 2 != 0) {
                                                throw null;
                                            }
                                            return;
                                        }
                                        try {
                                            jSONObject2.put("CitizenNo", Long.parseLong(str2));
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(str3);
                                            sb4.append(str4);
                                            int i183 = b;
                                            int i184 = ((i183 ^ 19) - (~((i183 & 19) << 1))) - 1;
                                            a = i184 % 128;
                                            int i185 = i184 % 2;
                                            jSONObject2.put("MobileNo", sb4.toString());
                                            jSONObject2.put("MobileOperator", i153);
                                            jSONObject2.put("Latitude", d5);
                                            jSONObject2.put("Longitude", d6);
                                            int i186 = b;
                                            int i187 = (i186 ^ 23) + ((i186 & 23) << 1);
                                            a = i187 % 128;
                                            int i188 = i187 % 2;
                                            jSONObject2.put("UniqueHhId", j2);
                                            jSONObject2.put("appVersion", "7.6");
                                            jSONObject2.put("imei", deviceId);
                                            jSONObject2.put("IpAddress", ac.h(true));
                                            int i189 = a;
                                            int i190 = (i189 ^ 107) + ((i189 & 107) << 1);
                                            b = i190 % 128;
                                            if (i190 % 2 == 0) {
                                                jSONObject2.put("MobilePrefix", str3);
                                                jSONObject2.put("MobilePostfix", str4);
                                                jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                                jSONObject2.toString();
                                                throw null;
                                            }
                                            jSONObject2.put("MobilePrefix", str3);
                                            jSONObject2.put("MobilePostfix", str4);
                                            jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                            String string8 = jSONObject2.toString();
                                            byte[] bArrB = b.b(simConfirmationActivity2.H.k());
                                            byte[] bArrB2 = b.b(simConfirmationActivity2.H.m());
                                            int i191 = b;
                                            int i192 = i191 & 25;
                                            int i193 = (i192 - (~((i191 ^ 25) | i192))) - 1;
                                            a = i193 % 128;
                                            int i194 = i193 % 2;
                                            jSONObject3.put("string1", b.d(string8, bArrB, bArrB2));
                                            byte[] bArrB3 = b.b(simConfirmationActivity2.H.k());
                                            SessionManager sessionManager = simConfirmationActivity2.H;
                                            int i195 = a;
                                            int i196 = (i195 ^ 109) + ((i195 & 109) << 1);
                                            b = i196 % 128;
                                            int i197 = i196 % 2;
                                            jSONObject3.put("string2", b.d("SaveEWalletData", bArrB3, b.b(sessionManager.m())));
                                            simConfirmationActivity2.w.setEnabled(false);
                                            simConfirmationActivity2.D.setVisibility(8);
                                            ax.e(jSONObject3, simConfirmationActivity2, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new aC(simConfirmationActivity2));
                                            int i198 = a;
                                            int i199 = i198 & 65;
                                            int i200 = (i198 ^ 65) | i199;
                                            int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                                            b = i201 % 128;
                                            int i202 = i201 % 2;
                                        } catch (Exception unused4) {
                                        }
                                    }
                                };
                                AlertDialog.Builder builder = new AlertDialog.Builder(simConfirmationActivity);
                                int i149 = a;
                                int i150 = i149 & 111;
                                int i151 = -(-((i149 ^ 111) | i150));
                                i8 = (i150 ^ i151) + ((i151 & i150) << 1);
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                                    layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                                    i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                                    z = false;
                                } else {
                                    z = false;
                                    viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                                    layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                                    i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                                }
                                View viewInflate = layoutInflaterFrom.inflate(i9, viewGroup, z);
                                builder.setView(viewInflate);
                                AlertDialog alertDialogCreate = builder.create();
                                int i152 = a;
                                int i153 = i152 & 35;
                                int i154 = ((((i152 ^ 35) | i153) << 1) - (~(-((i152 | 35) & (~i153))))) - 1;
                                b = i154 % 128;
                                int i155 = i154 % 2;
                                alertDialogCreate.setCancelable(false);
                                alertDialogCreate.show();
                                TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_heading);
                                TextView textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_message);
                                TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
                                TextView textView4 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_no);
                                textView.setText("Confirm Submission");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("CNIC: ");
                                int i156 = a;
                                int i157 = (i156 & (-56)) | ((~i156) & 55);
                                int i158 = -(-((i156 & 55) << 1));
                                int i159 = (i157 & i158) + (i158 | i157);
                                b = i159 % 128;
                                int i160 = i159 % 2;
                                sb4.append(string7);
                                sb4.append("\nPhone: ");
                                sb4.append(string6);
                                sb4.append("\nOperator: ");
                                sb4.append(strTrim);
                                sb4.append("\n\nAre you sure you want to submit?");
                                textView2.setText(sb4.toString());
                                textView4.setVisibility(0);
                                textView3.setText("YES");
                                textView4.setText("NO");
                                textView3.setOnClickListener(new I(alertDialogCreate, runnable, 0));
                                textView4.setOnClickListener(new T(alertDialogCreate, 3));
                                int i161 = b;
                                int i162 = i161 & 47;
                                int i163 = i161 | 47;
                                i10 = (i162 & i163) + (i163 | i162);
                                a = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            } catch (Exception unused4) {
                                simConfirmationActivity.t("Invalid HH-ID", "Unique Household ID must be numeric.");
                                return;
                            }
                        }
                    }
                    simConfirmationActivity.t("Invalid Phone", "Please enter a valid 11-digit phone number.");
                } else {
                    simConfirmationActivity.s();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid Number for ");
                    sb5.append(strTrim3);
                    String string8 = sb5.toString();
                    StringBuilder sb6 = new StringBuilder();
                    int i164 = a;
                    int i165 = (((i164 & (-6)) | ((~i164) & 5)) - (~(-(-((i164 & 5) << 1))))) - 1;
                    b = i165 % 128;
                    int i166 = i165 % 2;
                    sb6.append(strTrim3);
                    sb6.append(" codes are only ");
                    int i167 = b;
                    int i168 = (((i167 | 61) << 1) - (~(-(((~i167) & 61) | (i167 & (-62)))))) - 1;
                    a = i168 % 128;
                    int i169 = i168 % 2;
                    sb6.append(simConfirmationActivity.q(strTrim3));
                    sb6.append(".");
                    int i170 = b;
                    int i171 = (i170 & (-76)) | ((~i170) & 75);
                    int i172 = -(-((i170 & 75) << 1));
                    int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                    a = i173 % 128;
                    int i174 = i173 % 2;
                    simConfirmationActivity.t(string8, sb6.toString());
                    int i175 = a;
                    int i176 = i175 & 7;
                    int i177 = (i176 - (~((i175 ^ 7) | i176))) - 1;
                    b = i177 % 128;
                    int i178 = i177 % 2;
                }
            } else if (simConfirmationActivity.u(strReplaceAll4, strTrim3)) {
                i = (-2) - ((b + 96) ^ (-1));
                a = i % 128;
                if (i % 2 == 0) {
                    simConfirmationActivity.t.getText().toString();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                strReplaceAll = simConfirmationActivity.t.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                string = simConfirmationActivity.s.getText().toString();
                int i810 = a;
                int i811 = (i810 | 51) << 1;
                int i812 = -(i810 ^ 51);
                i2 = (i811 ^ i812) + ((i812 & i811) << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    strReplaceAll2 = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    noPasteEditText = simConfirmationActivity.u;
                    int i813 = 89 / 0;
                } else {
                    strReplaceAll2 = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    noPasteEditText = simConfirmationActivity.u;
                }
                strReplaceAll3 = noPasteEditText.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                int i814 = b;
                int i815 = (-2) - ((((i814 | 72) << 1) - (i814 ^ 72)) ^ (-1));
                a = i815 % 128;
                int i816 = i815 % 2;
                if (simConfirmationActivity.y.getSelectedItem() != null) {
                    int i910 = a;
                    int i911 = i910 ^ 3;
                    int i912 = -(-((i910 & 3) << 1));
                    int i913 = (i911 ^ i912) + ((i912 & i911) << 1);
                    b = i913 % 128;
                    int i914 = i913 % 2;
                    String string9 = simConfirmationActivity.y.getSelectedItem().toString();
                    int i915 = a + 33;
                    b = i915 % 128;
                    int i916 = i915 % 2;
                    strTrim = string9.trim();
                    int i917 = b;
                    int i918 = i917 & 41;
                    int i919 = (((i917 ^ 41) | i918) << 1) - ((i917 | 41) & (~i918));
                    a = i919 % 128;
                    int i1010 = i919 % 2;
                } else {
                    int i1011 = b;
                    int i1012 = ((i1011 ^ 42) + ((i1011 & 42) << 1)) - 1;
                    a = i1012 % 128;
                    int i1013 = i1012 % 2;
                    strTrim = BuildConfig.FLAVOR;
                }
                selectedItemPosition = simConfirmationActivity.y.getSelectedItemPosition();
                if (selectedItemPosition >= 0) {
                    int i1014 = b;
                    int i1015 = (((~i1014) & 1) | (i1014 & (-2))) + ((i1014 & 1) << 1);
                    a = i1015 % 128;
                    int i1016 = i1015 % 2;
                    if (selectedItemPosition < simConfirmationActivity.L.size()) {
                        lib_mobileVar = simConfirmationActivity.L.get(selectedItemPosition);
                        int i1017 = b;
                        i13 = ((i1017 | 123) << 1) - (i1017 ^ 123);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i1018 = lib_mobileVar.operatorCode;
                            throw null;
                        }
                        i3 = lib_mobileVar.operatorCode;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 0;
                }
                if (strReplaceAll.length() != 13) {
                    int i1019 = b;
                    int i1110 = i1019 & 43;
                    int i1111 = i1110 + ((i1019 ^ 43) | i1110);
                    a = i1111 % 128;
                    int i1112 = i1111 % 2;
                    simConfirmationActivity.t("Invalid CNIC", "Please enter a valid 13-digit CNIC.");
                    return;
                }
                if (strReplaceAll2.length() == 11) {
                    i4 = b + 109;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i1113 = b;
                        int i1114 = i1113 & 43;
                        i5 = (((i1113 ^ 43) | i1114) << 1) - ((i1113 | 43) & (~i1114));
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            strReplaceAll2.equals(strReplaceAll3);
                            throw null;
                        }
                        if (!strReplaceAll2.equals(strReplaceAll3)) {
                            simConfirmationActivity.s();
                            simConfirmationActivity.t("Phone Mismatch", "Phone numbers do not match.");
                            return;
                        }
                        if (ac.h(true).equals(BuildConfig.FLAVOR)) {
                            int i1115 = a;
                            i12 = ((i1115 | 99) << 1) - (i1115 ^ 99);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                Toast.makeText(simConfirmationActivity, "IP Not Found", 1).show();
                                return;
                            } else {
                                Toast.makeText(simConfirmationActivity, "IP Not Found", 0).show();
                                return;
                            }
                        }
                        strE = BISPApplication.e();
                        if (strE != null) {
                            int i1116 = b;
                            int i1117 = i1116 & 69;
                            int i1118 = (i1116 | 69) & (~i1117);
                            int i1119 = i1117 << 1;
                            int i1210 = (i1118 ^ i1119) + ((i1118 & i1119) << 1);
                            a = i1210 % 128;
                            int i1211 = i1210 % 2;
                            if (strE.contains(",")) {
                                int i1212 = b;
                                int i1213 = i1212 & 37;
                                int i1214 = -(-((i1212 ^ 37) | i1213));
                                int i1215 = (i1213 & i1214) + (i1214 | i1213);
                                a = i1215 % 128;
                                int i1216 = i1215 % 2;
                                String[] strArrSplit2 = strE.split(",");
                                d = Double.parseDouble(strArrSplit2[0].trim());
                                d2 = Double.parseDouble(strArrSplit2[1].trim());
                            } else {
                                d = 0.0d;
                                d2 = 0.0d;
                            }
                        } else {
                            d = 0.0d;
                            d2 = 0.0d;
                        }
                        if (d == 0.0d) {
                            i11 = a;
                            int i1310 = ((i11 & 60) + (i11 | 60)) - 1;
                            b = i1310 % 128;
                            int i1311 = i1310 % 2;
                            if (d2 == 0.0d) {
                                int i1312 = (i11 & (-30)) | ((~i11) & 29);
                                int i1313 = -(-((i11 & 29) << 1));
                                int i1314 = ((i1312 | i1313) << 1) - (i1312 ^ i1313);
                                b = i1314 % 128;
                                int i1315 = i1314 % 2;
                                Toast.makeText(simConfirmationActivity, "Location not available, please try again.", 0).show();
                                return;
                            }
                        }
                        strTrim2 = strReplaceAll.trim();
                        Objects.requireNonNull(strTrim);
                        int i1316 = a;
                        int i1410 = ((i1316 ^ 99) | (i1316 & 99)) << 1;
                        int i1411 = -(((~i1316) & 99) | (i1316 & (-100)));
                        i6 = (i1410 ^ i1411) + ((i1411 & i1410) << 1);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            i7 = 5;
                            strSubstring = strReplaceAll2.substring(1, 5);
                        } else {
                            i7 = 4;
                            strSubstring = strReplaceAll2.substring(0, 4);
                        }
                        strSubstring2 = strReplaceAll2.substring(i7);
                        String strTrim5 = simConfirmationActivity.K.trim();
                        int i1412 = a;
                        int i1413 = (i1412 ^ 45) + ((i1412 & 45) << 1);
                        b = i1413 % 128;
                        int i1414 = i1413 % 2;
                        j = Long.parseLong(strTrim5);
                        if (i3 <= 0) {
                            simConfirmationActivity.t("Invalid Operator", "Operator ID must be numeric.");
                            int i1415 = b;
                            int i1416 = ((i1415 & 121) - (~(-(-(i1415 | 121))))) - 1;
                            a = i1416 % 128;
                            int i1417 = i1416 % 2;
                            return;
                        }
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(strSubstring);
                        sb7.append("-");
                        sb7.append(strSubstring2);
                        String string10 = sb7.toString();
                        String string11 = simConfirmationActivity.t.getText().toString();
                        final int i1418 = i3;
                        final double d5 = d;
                        final double d6 = d2;
                        final String str2 = strSubstring;
                        Runnable runnable2 = new Runnable() { // from class: ivas.gov.bisp.enumeration.bi.aH
                            private static int a = 0;
                            private static int b = 1;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String deviceId;
                                int i1419;
                                int i1510 = 2 % 2;
                                int i1511 = a;
                                int i1512 = (((i1511 ^ 111) | (i1511 & 111)) << 1) - ((i1511 & (-112)) | ((~i1511) & 111));
                                b = i1512 % 128;
                                if (i1512 % 2 == 0) {
                                    throw null;
                                }
                                SimConfirmationActivity simConfirmationActivity2 = simConfirmationActivity;
                                String str3 = strTrim2;
                                int i1513 = i1418;
                                int i1514 = i1511 + 63;
                                b = i1514 % 128;
                                int i1515 = i1514 % 2;
                                double d7 = d5;
                                double d8 = d6;
                                long j2 = j;
                                int i1516 = i1511 & 57;
                                int i1517 = (i1511 | 57) & (~i1516);
                                int i1518 = -(-(i1516 << 1));
                                int i1519 = (i1517 ^ i1518) + ((i1517 & i1518) << 1);
                                b = i1519 % 128;
                                if (i1519 % 2 == 0) {
                                    int i1610 = SimConfirmationActivity.r;
                                    throw null;
                                }
                                String str4 = str2;
                                String str5 = strSubstring2;
                                int i1611 = SimConfirmationActivity.r;
                                Objects.requireNonNull(simConfirmationActivity2);
                                simConfirmationActivity2.H = new SessionManager(simConfirmationActivity2);
                                JSONObject jSONObject2 = new JSONObject();
                                JSONObject jSONObject3 = new JSONObject();
                                int i1612 = a;
                                int i1613 = i1612 & 83;
                                int i1614 = i1613 + ((i1612 ^ 83) | i1613);
                                b = i1614 % 128;
                                if (i1614 % 2 == 0) {
                                    int i1615 = Build.VERSION.SDK_INT;
                                    throw null;
                                }
                                TelephonyManager telephonyManager = (TelephonyManager) simConfirmationActivity2.getSystemService("phone");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    int i1616 = b;
                                    int i1617 = i1616 | 15;
                                    int i1618 = ((i1617 << 1) - (~(-((~(i1616 & 15)) & i1617)))) - 1;
                                    a = i1618 % 128;
                                    if (i1618 % 2 != 0) {
                                        deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                        int i1619 = 83 / 0;
                                    } else {
                                        deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                    }
                                    int i179 = b;
                                    int i1710 = ((i179 | 81) << 1) - (i179 ^ 81);
                                    a = i1710 % 128;
                                    int i1711 = i1710 % 2;
                                    i1419 = 2;
                                } else {
                                    deviceId = telephonyManager.getDeviceId();
                                    int i1712 = a;
                                    int i1713 = i1712 ^ 109;
                                    int i1714 = ((i1712 & 109) | i1713) << 1;
                                    int i1715 = -i1713;
                                    int i1716 = (i1714 & i1715) + (i1714 | i1715);
                                    b = i1716 % 128;
                                    i1419 = 2;
                                    int i1717 = i1716 % 2;
                                }
                                if (deviceId.isEmpty()) {
                                    int i1718 = a + 57;
                                    b = i1718 % 128;
                                    int i180 = i1718 % i1419;
                                    simConfirmationActivity2.t("IMEI", "IMEI Error");
                                    int i181 = b;
                                    int i182 = (i181 ^ 117) + ((i181 & 117) << 1);
                                    a = i182 % 128;
                                    if (i182 % 2 != 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                try {
                                    jSONObject2.put("CitizenNo", Long.parseLong(str3));
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append(str4);
                                    sb8.append(str5);
                                    int i183 = b;
                                    int i184 = ((i183 ^ 19) - (~((i183 & 19) << 1))) - 1;
                                    a = i184 % 128;
                                    int i185 = i184 % 2;
                                    jSONObject2.put("MobileNo", sb8.toString());
                                    jSONObject2.put("MobileOperator", i1513);
                                    jSONObject2.put("Latitude", d7);
                                    jSONObject2.put("Longitude", d8);
                                    int i186 = b;
                                    int i187 = (i186 ^ 23) + ((i186 & 23) << 1);
                                    a = i187 % 128;
                                    int i188 = i187 % 2;
                                    jSONObject2.put("UniqueHhId", j2);
                                    jSONObject2.put("appVersion", "7.6");
                                    jSONObject2.put("imei", deviceId);
                                    jSONObject2.put("IpAddress", ac.h(true));
                                    int i189 = a;
                                    int i190 = (i189 ^ 107) + ((i189 & 107) << 1);
                                    b = i190 % 128;
                                    if (i190 % 2 == 0) {
                                        jSONObject2.put("MobilePrefix", str4);
                                        jSONObject2.put("MobilePostfix", str5);
                                        jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                        jSONObject2.toString();
                                        throw null;
                                    }
                                    jSONObject2.put("MobilePrefix", str4);
                                    jSONObject2.put("MobilePostfix", str5);
                                    jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                    String string12 = jSONObject2.toString();
                                    byte[] bArrB = b.b(simConfirmationActivity2.H.k());
                                    byte[] bArrB2 = b.b(simConfirmationActivity2.H.m());
                                    int i191 = b;
                                    int i192 = i191 & 25;
                                    int i193 = (i192 - (~((i191 ^ 25) | i192))) - 1;
                                    a = i193 % 128;
                                    int i194 = i193 % 2;
                                    jSONObject3.put("string1", b.d(string12, bArrB, bArrB2));
                                    byte[] bArrB3 = b.b(simConfirmationActivity2.H.k());
                                    SessionManager sessionManager = simConfirmationActivity2.H;
                                    int i195 = a;
                                    int i196 = (i195 ^ 109) + ((i195 & 109) << 1);
                                    b = i196 % 128;
                                    int i197 = i196 % 2;
                                    jSONObject3.put("string2", b.d("SaveEWalletData", bArrB3, b.b(sessionManager.m())));
                                    simConfirmationActivity2.w.setEnabled(false);
                                    simConfirmationActivity2.D.setVisibility(8);
                                    ax.e(jSONObject3, simConfirmationActivity2, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new aC(simConfirmationActivity2));
                                    int i198 = a;
                                    int i199 = i198 & 65;
                                    int i200 = (i198 ^ 65) | i199;
                                    int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                                    b = i201 % 128;
                                    int i202 = i201 % 2;
                                } catch (Exception unused5) {
                                }
                            }
                        };
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(simConfirmationActivity);
                        int i1419 = a;
                        int i1510 = i1419 & 111;
                        int i1511 = -(-((i1419 ^ 111) | i1510));
                        i8 = (i1510 ^ i1511) + ((i1511 & i1510) << 1);
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                            layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                            i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                            z = false;
                        } else {
                            z = false;
                            viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                            layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                            i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                        }
                        View viewInflate2 = layoutInflaterFrom.inflate(i9, viewGroup, z);
                        builder2.setView(viewInflate2);
                        AlertDialog alertDialogCreate2 = builder2.create();
                        int i1512 = a;
                        int i1513 = i1512 & 35;
                        int i1514 = ((((i1512 ^ 35) | i1513) << 1) - (~(-((i1512 | 35) & (~i1513))))) - 1;
                        b = i1514 % 128;
                        int i1515 = i1514 % 2;
                        alertDialogCreate2.setCancelable(false);
                        alertDialogCreate2.show();
                        TextView textView5 = (TextView) viewInflate2.findViewById(ivas.gov.bisp.enumeration.R.id.tv_heading);
                        TextView textView6 = (TextView) viewInflate2.findViewById(ivas.gov.bisp.enumeration.R.id.tv_message);
                        TextView textView7 = (TextView) viewInflate2.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
                        TextView textView8 = (TextView) viewInflate2.findViewById(ivas.gov.bisp.enumeration.R.id.btn_no);
                        textView5.setText("Confirm Submission");
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("CNIC: ");
                        int i1516 = a;
                        int i1517 = (i1516 & (-56)) | ((~i1516) & 55);
                        int i1518 = -(-((i1516 & 55) << 1));
                        int i1519 = (i1517 & i1518) + (i1518 | i1517);
                        b = i1519 % 128;
                        int i1610 = i1519 % 2;
                        sb8.append(string11);
                        sb8.append("\nPhone: ");
                        sb8.append(string10);
                        sb8.append("\nOperator: ");
                        sb8.append(strTrim);
                        sb8.append("\n\nAre you sure you want to submit?");
                        textView6.setText(sb8.toString());
                        textView8.setVisibility(0);
                        textView7.setText("YES");
                        textView8.setText("NO");
                        textView7.setOnClickListener(new I(alertDialogCreate2, runnable2, 0));
                        textView8.setOnClickListener(new T(alertDialogCreate2, 3));
                        int i1611 = b;
                        int i1612 = i1611 & 47;
                        int i1613 = i1611 | 47;
                        i10 = (i1612 & i1613) + (i1613 | i1612);
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            return;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    int i11110 = b;
                    int i11111 = i11110 & 43;
                    i5 = (((i11110 ^ 43) | i11111) << 1) - ((i11110 | 43) & (~i11111));
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        strReplaceAll2.equals(strReplaceAll3);
                        throw null;
                    }
                    if (!strReplaceAll2.equals(strReplaceAll3)) {
                        simConfirmationActivity.s();
                        simConfirmationActivity.t("Phone Mismatch", "Phone numbers do not match.");
                        return;
                    }
                    if (ac.h(true).equals(BuildConfig.FLAVOR)) {
                        int i11112 = a;
                        i12 = ((i11112 | 99) << 1) - (i11112 ^ 99);
                        b = i12 % 128;
                        if (i12 % 2 == 0) {
                            Toast.makeText(simConfirmationActivity, "IP Not Found", 1).show();
                            return;
                        } else {
                            Toast.makeText(simConfirmationActivity, "IP Not Found", 0).show();
                            return;
                        }
                    }
                    strE = BISPApplication.e();
                    if (strE != null) {
                        int i11113 = b;
                        int i11114 = i11113 & 69;
                        int i11115 = (i11113 | 69) & (~i11114);
                        int i11116 = i11114 << 1;
                        int i1217 = (i11115 ^ i11116) + ((i11115 & i11116) << 1);
                        a = i1217 % 128;
                        int i1218 = i1217 % 2;
                        if (strE.contains(",")) {
                            int i1219 = b;
                            int i12110 = i1219 & 37;
                            int i12111 = -(-((i1219 ^ 37) | i12110));
                            int i12112 = (i12110 & i12111) + (i12111 | i12110);
                            a = i12112 % 128;
                            int i12113 = i12112 % 2;
                            String[] strArrSplit3 = strE.split(",");
                            d = Double.parseDouble(strArrSplit3[0].trim());
                            d2 = Double.parseDouble(strArrSplit3[1].trim());
                        } else {
                            d = 0.0d;
                            d2 = 0.0d;
                        }
                    } else {
                        d = 0.0d;
                        d2 = 0.0d;
                    }
                    if (d == 0.0d) {
                        i11 = a;
                        int i1317 = ((i11 & 60) + (i11 | 60)) - 1;
                        b = i1317 % 128;
                        int i1318 = i1317 % 2;
                        if (d2 == 0.0d) {
                            int i1319 = (i11 & (-30)) | ((~i11) & 29);
                            int i13110 = -(-((i11 & 29) << 1));
                            int i13111 = ((i1319 | i13110) << 1) - (i1319 ^ i13110);
                            b = i13111 % 128;
                            int i13112 = i13111 % 2;
                            Toast.makeText(simConfirmationActivity, "Location not available, please try again.", 0).show();
                            return;
                        }
                    }
                    strTrim2 = strReplaceAll.trim();
                    Objects.requireNonNull(strTrim);
                    int i13113 = a;
                    int i14110 = ((i13113 ^ 99) | (i13113 & 99)) << 1;
                    int i14111 = -(((~i13113) & 99) | (i13113 & (-100)));
                    i6 = (i14110 ^ i14111) + ((i14111 & i14110) << 1);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        i7 = 5;
                        strSubstring = strReplaceAll2.substring(1, 5);
                    } else {
                        i7 = 4;
                        strSubstring = strReplaceAll2.substring(0, 4);
                    }
                    strSubstring2 = strReplaceAll2.substring(i7);
                    String strTrim6 = simConfirmationActivity.K.trim();
                    int i14112 = a;
                    int i14113 = (i14112 ^ 45) + ((i14112 & 45) << 1);
                    b = i14113 % 128;
                    int i14114 = i14113 % 2;
                    j = Long.parseLong(strTrim6);
                    if (i3 <= 0) {
                        simConfirmationActivity.t("Invalid Operator", "Operator ID must be numeric.");
                        int i14115 = b;
                        int i14116 = ((i14115 & 121) - (~(-(-(i14115 | 121))))) - 1;
                        a = i14116 % 128;
                        int i14117 = i14116 % 2;
                        return;
                    }
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(strSubstring);
                    sb9.append("-");
                    sb9.append(strSubstring2);
                    String string12 = sb9.toString();
                    String string13 = simConfirmationActivity.t.getText().toString();
                    final int i14118 = i3;
                    final double d7 = d;
                    final double d8 = d2;
                    final String str3 = strSubstring;
                    Runnable runnable3 = new Runnable() { // from class: ivas.gov.bisp.enumeration.bi.aH
                        private static int a = 0;
                        private static int b = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            String deviceId;
                            int i14119;
                            int i15110 = 2 % 2;
                            int i15111 = a;
                            int i15112 = (((i15111 ^ 111) | (i15111 & 111)) << 1) - ((i15111 & (-112)) | ((~i15111) & 111));
                            b = i15112 % 128;
                            if (i15112 % 2 == 0) {
                                throw null;
                            }
                            SimConfirmationActivity simConfirmationActivity2 = simConfirmationActivity;
                            String str4 = strTrim2;
                            int i15113 = i14118;
                            int i15114 = i15111 + 63;
                            b = i15114 % 128;
                            int i15115 = i15114 % 2;
                            double d9 = d7;
                            double d10 = d8;
                            long j2 = j;
                            int i15116 = i15111 & 57;
                            int i15117 = (i15111 | 57) & (~i15116);
                            int i15118 = -(-(i15116 << 1));
                            int i15119 = (i15117 ^ i15118) + ((i15117 & i15118) << 1);
                            b = i15119 % 128;
                            if (i15119 % 2 == 0) {
                                int i1614 = SimConfirmationActivity.r;
                                throw null;
                            }
                            String str5 = str3;
                            String str6 = strSubstring2;
                            int i1615 = SimConfirmationActivity.r;
                            Objects.requireNonNull(simConfirmationActivity2);
                            simConfirmationActivity2.H = new SessionManager(simConfirmationActivity2);
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            int i1616 = a;
                            int i1617 = i1616 & 83;
                            int i1618 = i1617 + ((i1616 ^ 83) | i1617);
                            b = i1618 % 128;
                            if (i1618 % 2 == 0) {
                                int i1619 = Build.VERSION.SDK_INT;
                                throw null;
                            }
                            TelephonyManager telephonyManager = (TelephonyManager) simConfirmationActivity2.getSystemService("phone");
                            if (Build.VERSION.SDK_INT >= 29) {
                                int i16110 = b;
                                int i16111 = i16110 | 15;
                                int i16112 = ((i16111 << 1) - (~(-((~(i16110 & 15)) & i16111)))) - 1;
                                a = i16112 % 128;
                                if (i16112 % 2 != 0) {
                                    deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                    int i16113 = 83 / 0;
                                } else {
                                    deviceId = Settings.Secure.getString(simConfirmationActivity2.getApplicationContext().getContentResolver(), "android_id");
                                }
                                int i179 = b;
                                int i1710 = ((i179 | 81) << 1) - (i179 ^ 81);
                                a = i1710 % 128;
                                int i1711 = i1710 % 2;
                                i14119 = 2;
                            } else {
                                deviceId = telephonyManager.getDeviceId();
                                int i1712 = a;
                                int i1713 = i1712 ^ 109;
                                int i1714 = ((i1712 & 109) | i1713) << 1;
                                int i1715 = -i1713;
                                int i1716 = (i1714 & i1715) + (i1714 | i1715);
                                b = i1716 % 128;
                                i14119 = 2;
                                int i1717 = i1716 % 2;
                            }
                            if (deviceId.isEmpty()) {
                                int i1718 = a + 57;
                                b = i1718 % 128;
                                int i180 = i1718 % i14119;
                                simConfirmationActivity2.t("IMEI", "IMEI Error");
                                int i181 = b;
                                int i182 = (i181 ^ 117) + ((i181 & 117) << 1);
                                a = i182 % 128;
                                if (i182 % 2 != 0) {
                                    throw null;
                                }
                                return;
                            }
                            try {
                                jSONObject2.put("CitizenNo", Long.parseLong(str4));
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(str5);
                                sb10.append(str6);
                                int i183 = b;
                                int i184 = ((i183 ^ 19) - (~((i183 & 19) << 1))) - 1;
                                a = i184 % 128;
                                int i185 = i184 % 2;
                                jSONObject2.put("MobileNo", sb10.toString());
                                jSONObject2.put("MobileOperator", i15113);
                                jSONObject2.put("Latitude", d9);
                                jSONObject2.put("Longitude", d10);
                                int i186 = b;
                                int i187 = (i186 ^ 23) + ((i186 & 23) << 1);
                                a = i187 % 128;
                                int i188 = i187 % 2;
                                jSONObject2.put("UniqueHhId", j2);
                                jSONObject2.put("appVersion", "7.6");
                                jSONObject2.put("imei", deviceId);
                                jSONObject2.put("IpAddress", ac.h(true));
                                int i189 = a;
                                int i190 = (i189 ^ 107) + ((i189 & 107) << 1);
                                b = i190 % 128;
                                if (i190 % 2 == 0) {
                                    jSONObject2.put("MobilePrefix", str5);
                                    jSONObject2.put("MobilePostfix", str6);
                                    jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                    jSONObject2.toString();
                                    throw null;
                                }
                                jSONObject2.put("MobilePrefix", str5);
                                jSONObject2.put("MobilePostfix", str6);
                                jSONObject2.put("Uuid", UUID.randomUUID().toString());
                                String string14 = jSONObject2.toString();
                                byte[] bArrB = b.b(simConfirmationActivity2.H.k());
                                byte[] bArrB2 = b.b(simConfirmationActivity2.H.m());
                                int i191 = b;
                                int i192 = i191 & 25;
                                int i193 = (i192 - (~((i191 ^ 25) | i192))) - 1;
                                a = i193 % 128;
                                int i194 = i193 % 2;
                                jSONObject3.put("string1", b.d(string14, bArrB, bArrB2));
                                byte[] bArrB3 = b.b(simConfirmationActivity2.H.k());
                                SessionManager sessionManager = simConfirmationActivity2.H;
                                int i195 = a;
                                int i196 = (i195 ^ 109) + ((i195 & 109) << 1);
                                b = i196 % 128;
                                int i197 = i196 % 2;
                                jSONObject3.put("string2", b.d("SaveEWalletData", bArrB3, b.b(sessionManager.m())));
                                simConfirmationActivity2.w.setEnabled(false);
                                simConfirmationActivity2.D.setVisibility(8);
                                ax.e(jSONObject3, simConfirmationActivity2, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new aC(simConfirmationActivity2));
                                int i198 = a;
                                int i199 = i198 & 65;
                                int i200 = (i198 ^ 65) | i199;
                                int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                                b = i201 % 128;
                                int i202 = i201 % 2;
                            } catch (Exception unused5) {
                            }
                        }
                    };
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(simConfirmationActivity);
                    int i14119 = a;
                    int i15110 = i14119 & 111;
                    int i15111 = -(-((i14119 ^ 111) | i15110));
                    i8 = (i15110 ^ i15111) + ((i15111 & i15110) << 1);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                        layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                        i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                        z = false;
                    } else {
                        z = false;
                        viewGroup = (ViewGroup) simConfirmationActivity.findViewById(R.id.content);
                        layoutInflaterFrom = LayoutInflater.from(simConfirmationActivity);
                        i9 = ivas.gov.bisp.enumeration.R.layout.custom_dialog_new;
                    }
                    View viewInflate3 = layoutInflaterFrom.inflate(i9, viewGroup, z);
                    builder3.setView(viewInflate3);
                    AlertDialog alertDialogCreate3 = builder3.create();
                    int i15112 = a;
                    int i15113 = i15112 & 35;
                    int i15114 = ((((i15112 ^ 35) | i15113) << 1) - (~(-((i15112 | 35) & (~i15113))))) - 1;
                    b = i15114 % 128;
                    int i15115 = i15114 % 2;
                    alertDialogCreate3.setCancelable(false);
                    alertDialogCreate3.show();
                    TextView textView9 = (TextView) viewInflate3.findViewById(ivas.gov.bisp.enumeration.R.id.tv_heading);
                    TextView textView10 = (TextView) viewInflate3.findViewById(ivas.gov.bisp.enumeration.R.id.tv_message);
                    TextView textView11 = (TextView) viewInflate3.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
                    TextView textView12 = (TextView) viewInflate3.findViewById(ivas.gov.bisp.enumeration.R.id.btn_no);
                    textView9.setText("Confirm Submission");
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("CNIC: ");
                    int i15116 = a;
                    int i15117 = (i15116 & (-56)) | ((~i15116) & 55);
                    int i15118 = -(-((i15116 & 55) << 1));
                    int i15119 = (i15117 & i15118) + (i15118 | i15117);
                    b = i15119 % 128;
                    int i1614 = i15119 % 2;
                    sb10.append(string13);
                    sb10.append("\nPhone: ");
                    sb10.append(string12);
                    sb10.append("\nOperator: ");
                    sb10.append(strTrim);
                    sb10.append("\n\nAre you sure you want to submit?");
                    textView10.setText(sb10.toString());
                    textView12.setVisibility(0);
                    textView11.setText("YES");
                    textView12.setText("NO");
                    textView11.setOnClickListener(new I(alertDialogCreate3, runnable3, 0));
                    textView12.setOnClickListener(new T(alertDialogCreate3, 3));
                    int i1615 = b;
                    int i1616 = i1615 & 47;
                    int i1617 = i1615 | 47;
                    i10 = (i1616 & i1617) + (i1617 | i1616);
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        return;
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                simConfirmationActivity.t("Invalid Phone", "Please enter a valid 11-digit phone number.");
            } else {
                simConfirmationActivity.s();
                StringBuilder sb11 = new StringBuilder();
                sb11.append("Invalid Number for ");
                sb11.append(strTrim3);
                String string14 = sb11.toString();
                StringBuilder sb12 = new StringBuilder();
                int i1618 = a;
                int i1619 = (((i1618 & (-6)) | ((~i1618) & 5)) - (~(-(-((i1618 & 5) << 1))))) - 1;
                b = i1619 % 128;
                int i1620 = i1619 % 2;
                sb12.append(strTrim3);
                sb12.append(" codes are only ");
                int i1621 = b;
                int i1622 = (((i1621 | 61) << 1) - (~(-(((~i1621) & 61) | (i1621 & (-62)))))) - 1;
                a = i1622 % 128;
                int i1623 = i1622 % 2;
                sb12.append(simConfirmationActivity.q(strTrim3));
                sb12.append(".");
                int i179 = b;
                int i1710 = (i179 & (-76)) | ((~i179) & 75);
                int i1711 = -(-((i179 & 75) << 1));
                int i1712 = (i1710 ^ i1711) + ((i1711 & i1710) << 1);
                a = i1712 % 128;
                int i1713 = i1712 % 2;
                simConfirmationActivity.t(string14, sb12.toString());
                int i1714 = a;
                int i1715 = i1714 & 7;
                int i1716 = (i1715 - (~((i1714 ^ 7) | i1715))) - 1;
                b = i1716 % 128;
                int i1717 = i1716 % 2;
            }
        } else {
            int i180 = a;
            int i181 = i180 ^ 87;
            int i182 = ((i180 & 87) | i181) << 1;
            int i183 = -i181;
            int i184 = ((i182 | i183) << 1) - (i182 ^ i183);
            b = i184 % 128;
            int i185 = i184 % 2;
            simConfirmationActivity.s();
            simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
            int i186 = b;
            int i187 = (i186 & 85) + (i186 | 85);
            a = i187 % 128;
            if (i187 % 2 != 0) {
                int i188 = 5 / 4;
            }
        }
        int i189 = b + 85;
        a = i189 % 128;
        int i190 = i189 % 2;
    }
}
