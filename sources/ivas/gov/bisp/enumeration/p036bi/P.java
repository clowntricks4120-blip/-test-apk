package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.View;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.p038bk.aZ;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BikeRegistryActivity d;

    public /* synthetic */ P(BikeRegistryActivity bikeRegistryActivity, int i) {
        this.c = i;
        this.d = bikeRegistryActivity;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4 A[Catch: Exception -> 0x01d5, TRY_ENTER, TryCatch #5 {Exception -> 0x01d5, blocks: (B:70:0x01a4, B:71:0x01aa, B:73:0x01b6, B:72:0x01af), top: B:218:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01af A[Catch: Exception -> 0x01d5, TryCatch #5 {Exception -> 0x01d5, blocks: (B:70:0x01a4, B:71:0x01aa, B:73:0x01b6, B:72:0x01af), top: B:218:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0202  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strTrim;
        Object selectedItem;
        double d;
        String string;
        String strReplaceAll;
        int i;
        double d2;
        String[] strArrSplit;
        String str;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 114) + ((i5 & 114) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (this.c != 0) {
            int i8 = i5 & 79;
            int i9 = (i8 - (~(-(-((i5 ^ 79) | i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            BikeRegistryActivity bikeRegistryActivity = this.d;
            AlertDialog alertDialog = bikeRegistryActivity.S;
            if (alertDialog != null) {
                int i11 = a + 113;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    alertDialog.dismiss();
                    bikeRegistryActivity.S = null;
                    obj.hashCode();
                    throw null;
                }
                alertDialog.dismiss();
                bikeRegistryActivity.S = null;
                int i12 = a;
                int i13 = (i12 & 39) + (i12 | 39);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 4 % 2;
                }
            }
            int i15 = b;
            int i16 = i15 & 83;
            int i17 = (i15 | 83) & (~i16);
            int i18 = i16 << 1;
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            return;
        }
        BikeRegistryActivity bikeRegistryActivity2 = this.d;
        int i20 = BikeRegistryActivity.r;
        Objects.requireNonNull(bikeRegistryActivity2);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            int i21 = b;
            int i22 = ((i21 | 109) << 1) - (i21 ^ 109);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                jSONObject3.put("Cnic", bikeRegistryActivity2.M);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jSONObject3.put("Cnic", bikeRegistryActivity2.M);
            String string2 = bikeRegistryActivity2.x.getText().toString();
            int i23 = b;
            int i24 = (i23 & 73) + (i23 | 73);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                strTrim = string2.trim();
                selectedItem = bikeRegistryActivity2.J.getSelectedItem();
                int i25 = 11 / 0;
            } else {
                strTrim = string2.trim();
                selectedItem = bikeRegistryActivity2.J.getSelectedItem();
            }
            String string3 = selectedItem.toString();
            if (!strTrim.isEmpty()) {
                int i26 = b;
                int i27 = i26 & 11;
                int i28 = (i26 ^ 11) | i27;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                a = i29 % 128;
                int i30 = i29 % 2;
                jSONObject3.put("Bank", string3);
                int i31 = b + 62;
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
                jSONObject3.put("AccountNumber", strTrim);
                int i34 = b + 17;
                a = i34 % 128;
                int i35 = i34 % 2;
            }
            jSONObject3.put("Bank", bikeRegistryActivity2.t);
            int i36 = b;
            int i37 = i36 & 53;
            int i38 = -(-((i36 ^ 53) | i37));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            a = i39 % 128;
            int i40 = i39 % 2;
            jSONObject3.put("AccountNumber", bikeRegistryActivity2.s);
            int i41 = b;
            int i42 = (-2) - (((i41 & 70) + (i41 | 70)) ^ (-1));
            a = i42 % 128;
            if (i42 % 2 == 0) {
                jSONObject3.put("contactNumber", bikeRegistryActivity2.w.getText().toString());
                int i43 = 5 / 0;
            } else {
                jSONObject3.put("contactNumber", bikeRegistryActivity2.w.getText().toString());
            }
            JSONArray jSONArray = new JSONArray();
            String strE = BISPApplication.e();
            int i44 = b;
            int i45 = (i44 ^ 63) + ((i44 & 63) << 1);
            a = i45 % 128;
            if (i45 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            double d3 = 0.0d;
            if (strE != null) {
                int i46 = i44 + 105;
                a = i46 % 128;
                if (i46 % 2 == 0) {
                    int i47 = 31 / 0;
                    if (!strE.contains(",")) {
                        int i48 = a;
                        int i49 = i48 & 77;
                        int i50 = (((i48 | 77) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
                        b = i50 % 128;
                        int i51 = i50 % 2;
                        d = 0.0d;
                    } else {
                        int i52 = a;
                        i = (i52 & 115) + (i52 | 115);
                        b = i % 128;
                        try {
                            if (i % 2 != 0) {
                                strArrSplit = strE.split(",");
                                str = strArrSplit[1];
                            } else {
                                strArrSplit = strE.split(",");
                                str = strArrSplit[0];
                            }
                            d2 = Double.parseDouble(str.trim());
                            try {
                                d3 = Double.parseDouble(strArrSplit[1].trim());
                                int i53 = a;
                                i2 = ((i53 & 118) + (i53 | 118)) - 1;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                            } catch (Exception unused) {
                                Toast.makeText(bikeRegistryActivity2, "Unable to fetch location. Please enable GPS.", 0).show();
                                int i54 = a;
                                int i55 = i54 & 37;
                                int i56 = -(-((i54 ^ 37) | i55));
                                int i57 = (i55 & i56) + (i56 | i55);
                                b = i57 % 128;
                                int i58 = i57 % 2;
                            }
                        } catch (Exception unused2) {
                            d2 = 0.0d;
                        }
                        int i59 = a;
                        int i60 = ((i59 | 53) << 1) - (i59 ^ 53);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        d = d3;
                        d3 = d2;
                    }
                } else if (!(!strE.contains(","))) {
                    int i510 = a;
                    i = (i510 & 115) + (i510 | 115);
                    b = i % 128;
                    if (i % 2 != 0) {
                        strArrSplit = strE.split(",");
                        str = strArrSplit[1];
                    } else {
                        strArrSplit = strE.split(",");
                        str = strArrSplit[0];
                    }
                    d2 = Double.parseDouble(str.trim());
                    d3 = Double.parseDouble(strArrSplit[1].trim());
                    int i511 = a;
                    i2 = ((i511 & 118) + (i511 | 118)) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i512 = a;
                    int i62 = ((i512 | 53) << 1) - (i512 ^ 53);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    d = d3;
                    d3 = d2;
                } else {
                    int i410 = a;
                    int i411 = i410 & 77;
                    int i513 = (((i410 | 77) & (~i411)) - (~(-(-(i411 << 1))))) - 1;
                    b = i513 % 128;
                    int i514 = i513 % 2;
                    d = 0.0d;
                }
            } else {
                int i412 = a;
                int i413 = i412 & 77;
                int i515 = (((i412 | 77) & (~i413)) - (~(-(-(i413 << 1))))) - 1;
                b = i515 % 128;
                int i516 = i515 % 2;
                d = 0.0d;
            }
            Iterator<aZ> it = bikeRegistryActivity2.F.iterator();
            int i64 = b;
            int i65 = (i64 | 11) << 1;
            int i66 = -((i64 & (-12)) | ((~i64) & 11));
            int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
            a = i67 % 128;
            int i68 = i67 % 2;
            while (it.hasNext()) {
                aZ next = it.next();
                JSONObject jSONObject4 = new JSONObject();
                int i69 = b;
                int i70 = i69 & 1;
                int i71 = (i70 - (~(-(-((i69 ^ 1) | i70))))) - 1;
                a = i71 % 128;
                if (i71 % i3 == 0) {
                    strReplaceAll = next.g.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    int i72 = 10 / 0;
                } else {
                    strReplaceAll = next.g.replaceAll("[^\\d]", BuildConfig.FLAVOR);
                }
                int i73 = b;
                int i74 = i73 & 29;
                int i75 = ((i73 ^ 29) | i74) << 1;
                int i76 = -((~i74) & (i73 | 29));
                int i77 = (i75 & i76) + (i75 | i76);
                a = i77 % 128;
                int i78 = i77 % 2;
                jSONObject4.put("OwnerCnic", strReplaceAll);
                String str2 = next.e;
                int i79 = a + 47;
                Iterator<aZ> it2 = it;
                b = i79 % 128;
                int i80 = i79 % 2;
                jSONObject4.put("OwnerName", str2);
                String str3 = next.a;
                int i81 = b;
                JSONObject jSONObject5 = jSONObject;
                int i82 = i81 & 19;
                int i83 = (((i81 ^ 19) | i82) << 1) - ((~i82) & (i81 | 19));
                a = i83 % 128;
                int i84 = i83 % 2;
                jSONObject4.put("BikeNumber", str3);
                int i85 = Integer.parseInt(next.b);
                int i86 = b + 3;
                a = i86 % 128;
                if (i86 % 2 == 0) {
                    jSONObject4.put("RegistrationYear", i85);
                    jSONObject4.put("RegistrationProvince", next.d);
                    int i87 = 76 / 0;
                } else {
                    jSONObject4.put("RegistrationYear", i85);
                    jSONObject4.put("RegistrationProvince", next.d);
                }
                int i88 = a;
                int i89 = ((i88 & 8) + (i88 | 8)) - 1;
                b = i89 % 128;
                int i90 = i89 % 2;
                jSONObject4.put("EngineCc", next.c);
                int i91 = a;
                int i92 = (i91 & 61) + (i91 | 61);
                b = i92 % 128;
                int i93 = i92 % 2;
                Bitmap bitmap = next.f;
                if (bitmap != null) {
                    int i94 = a + 122;
                    int i95 = (i94 ^ (-1)) + (i94 << 1);
                    b = i95 % 128;
                    if (i95 % 2 != 0) {
                        bitmap.equals(BuildConfig.FLAVOR);
                        throw null;
                    }
                    if (!bitmap.equals(BuildConfig.FLAVOR)) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap bitmap2 = next.f;
                        int i96 = b;
                        int i97 = ((i96 ^ 94) + ((i96 & 94) << 1)) - 1;
                        a = i97 % 128;
                        if (i97 % 2 == 0) {
                            bitmap2.compress(Bitmap.CompressFormat.JPEG, 117, byteArrayOutputStream);
                        } else {
                            bitmap2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                        }
                        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        int i98 = (-2) - ((a + 4) ^ (-1));
                        b = i98 % 128;
                        if (i98 % 2 != 0) {
                            jSONObject4.put("RegistrationCardAttachment", strEncodeToString);
                            throw null;
                        }
                        jSONObject4.put("RegistrationCardAttachment", strEncodeToString);
                        int i99 = a;
                        int i100 = (((i99 | 34) << 1) - (i99 ^ 34)) - 1;
                        b = i100 % 128;
                        int i101 = i100 % 2;
                    }
                }
                jSONArray.put(jSONObject4);
                int i102 = a + 79;
                b = i102 % 128;
                int i103 = i102 % 2;
                it = it2;
                jSONObject = jSONObject5;
                i3 = 2;
            }
            JSONObject jSONObject6 = jSONObject;
            TelephonyManager telephonyManager = (TelephonyManager) bikeRegistryActivity2.getSystemService("phone");
            int i104 = Build.VERSION.SDK_INT;
            int i105 = a;
            int i106 = ((i105 | 35) << 1) - ((i105 & (-36)) | ((~i105) & 35));
            b = i106 % 128;
            if (i106 % 2 == 0 ? i104 < 29 : i104 < 116) {
                string = telephonyManager.getDeviceId();
                int i107 = b;
                int i108 = i107 & 99;
                int i109 = -(-((i107 ^ 99) | i108));
                int i110 = (i108 & i109) + (i109 | i108);
                a = i110 % 128;
                int i111 = i110 % 2;
            } else {
                int i112 = ((i105 ^ 69) - (~(-(-((i105 & 69) << 1))))) - 1;
                b = i112 % 128;
                if (i112 % 2 != 0) {
                    string = Settings.Secure.getString(bikeRegistryActivity2.getApplicationContext().getContentResolver(), "android_id");
                    int i113 = 39 / 0;
                } else {
                    string = Settings.Secure.getString(bikeRegistryActivity2.getApplicationContext().getContentResolver(), "android_id");
                }
                int i114 = b;
                int i115 = i114 ^ 95;
                int i116 = (i114 & 95) << 1;
                int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                a = i117 % 128;
                int i118 = i117 % 2;
                int i119 = ((i114 | 117) << 1) - (i114 ^ 117);
                a = i119 % 128;
                int i120 = i119 % 2;
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("UserId", bikeRegistryActivity2.Q.y());
            jSONObject7.put("IMEI", string);
            int i121 = b;
            int i122 = ((i121 & 109) - (~(-(-(i121 | 109))))) - 1;
            a = i122 % 128;
            if (i122 % 2 == 0) {
                jSONObject7.put("Latitude", d3);
                jSONObject7.put("Longitude", d);
                jSONObject2.put("Beneficiary", jSONObject3);
                int i123 = 91 / 0;
            } else {
                jSONObject7.put("Latitude", d3);
                jSONObject7.put("Longitude", d);
                jSONObject2.put("Beneficiary", jSONObject3);
            }
            jSONObject2.put("HasBike", true);
            jSONObject2.put("Bikes", jSONArray);
            jSONObject2.put("DeviceInfo", jSONObject7);
            SessionManager sessionManager = new SessionManager(bikeRegistryActivity2);
            int i124 = a;
            int i125 = ((i124 ^ 117) - (~((i124 & 117) << 1))) - 1;
            b = i125 % 128;
            int i126 = i125 % 2;
            bikeRegistryActivity2.Q = sessionManager;
            String string4 = jSONObject2.toString();
            byte[] bArrB = b.b(bikeRegistryActivity2.Q.k());
            SessionManager sessionManager2 = bikeRegistryActivity2.Q;
            int i127 = a;
            int i128 = ((i127 | 41) << 1) - (i127 ^ 41);
            b = i128 % 128;
            int i129 = i128 % 2;
            jSONObject6.put("string1", b.d(string4, bArrB, b.b(sessionManager2.m())));
            int i130 = b;
            int i131 = i130 ^ 3;
            int i132 = ((i130 & 3) | i131) << 1;
            int i133 = -i131;
            int i134 = (i132 & i133) + (i132 | i133);
            a = i134 % 128;
            if (i134 % 2 == 0) {
                b.b(bikeRegistryActivity2.Q.k());
                b.b(bikeRegistryActivity2.Q.m());
                throw null;
            }
            jSONObject6.put("string2", b.d("AddBike", b.b(bikeRegistryActivity2.Q.k()), b.b(bikeRegistryActivity2.Q.m())));
            String strP = bikeRegistryActivity2.p();
            RunnableC0148a runnableC0148a = new RunnableC0148a(bikeRegistryActivity2, jSONObject6, 0);
            int i135 = a;
            int i136 = ((i135 | 124) << 1) - (i135 ^ 124);
            int i137 = (i136 ^ (-1)) + (i136 << 1);
            b = i137 % 128;
            int i138 = i137 % 2;
            bikeRegistryActivity2.r(strP, runnableC0148a);
            int i139 = a;
            int i140 = i139 ^ 67;
            int i141 = -(-((i139 & 67) << 1));
            int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
            b = i142 % 128;
            int i143 = i142 % 2;
        } catch (Exception unused3) {
        }
    }
}
