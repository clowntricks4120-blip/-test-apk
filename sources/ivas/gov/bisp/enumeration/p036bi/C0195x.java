package ivas.gov.bisp.enumeration.p036bi;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p038bk.bo;
import java.util.HashSet;
import java.util.List;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0195x implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ BikeRegistryActivity c;

    public C0195x(BikeRegistryActivity bikeRegistryActivity) {
        this.c = bikeRegistryActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        ProgressBar progressBar;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 67) - (~(-(-(i3 | 67))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            progressBar = this.c.R;
            i = 94;
        } else {
            progressBar = this.c.R;
            i = 8;
        }
        progressBar.setVisibility(i);
        this.c.z.setEnabled(true);
        int i5 = a;
        int i6 = (((i5 | 109) << 1) - (~(-(i5 ^ 109)))) - 1;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            BikeRegistryActivity.o(this.c, "Failed", responseMessage.getErrorMessage());
            obj.hashCode();
            throw null;
        }
        BikeRegistryActivity.o(this.c, "Failed", responseMessage.getErrorMessage());
        int i7 = a;
        int i8 = i7 & 71;
        int i9 = ((i7 ^ 71) | i8) << 1;
        int i10 = -((i7 | 71) & (~i8));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            responseMessage.getErrorMessage().toLowerCase().contains("session");
            throw null;
        }
        if (responseMessage.getErrorMessage().toLowerCase().contains("session")) {
            int i12 = a;
            int i13 = i12 & 121;
            int i14 = (i12 | 121) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
            this.c.q();
            if (i17 == 0) {
                int i18 = 60 / 0;
            }
        }
        int i19 = a;
        int i20 = (i19 ^ 101) + ((i19 & 101) << 1);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 34 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0167  */
    /* JADX WARN: Code duplicated, block: B:30:0x0191  */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i;
        String str;
        String string;
        String strValueOf;
        int i2 = 2 % 2;
        int i3 = a + 95;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.z.setEnabled(false);
        } else {
            this.c.z.setEnabled(true);
        }
        this.c.R.setVisibility(8);
        int i4 = a;
        int i5 = ((i4 | 93) << 1) - (i4 ^ 93);
        b = i5 % 128;
        int i6 = i5 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject == null) {
            Toast.makeText(this.c, "Invalid server response", 0).show();
            int i7 = b + 89;
            a = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = b;
        int i10 = i9 & 73;
        int i11 = -(-((i9 ^ 73) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        if (i12 % 2 == 0 ? !(!jSONObjectOptJSONObject.optBoolean("hasBike", false)) : jSONObjectOptJSONObject.optBoolean("hasBike", false)) {
            this.c.v.setVisibility(8);
            BikeRegistryActivity bikeRegistryActivity = this.c;
            int i13 = a;
            int i14 = (i13 & 95) + (i13 | 95);
            b = i14 % 128;
            int i15 = i14 % 2;
            bikeRegistryActivity.K.setVisibility(8);
            BikeRegistryActivity bikeRegistryActivity2 = this.c;
            int i16 = b;
            int i17 = i16 & 37;
            int i18 = ((i16 | 37) & (~i17)) + (i17 << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            BikeRegistryActivity.o(bikeRegistryActivity2, "Warning", "Bike Data already provided");
            this.c.A.setVisibility(8);
            int i20 = a;
            int i21 = i20 & 65;
            int i22 = ((i20 ^ 65) | i21) << 1;
            int i23 = -((i20 | 65) & (~i21));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
            this.c.z.setVisibility(8);
            BikeRegistryActivity bikeRegistryActivity3 = this.c;
            int i26 = a;
            int i27 = ((i26 | 89) << 1) - (i26 ^ 89);
            b = i27 % 128;
            int i28 = i27 % 2;
            bikeRegistryActivity3.L.setVisibility(8);
            Button button = this.c.z;
            int i29 = a;
            int i30 = (((i29 | 24) << 1) - (i29 ^ 24)) - 1;
            b = i30 % 128;
            if (i30 % 2 == 0) {
                button.setEnabled(false);
            } else {
                button.setEnabled(false);
            }
            this.c.u.setText(BuildConfig.FLAVOR);
            return;
        }
        int i31 = a + 89;
        b = i31 % 128;
        int i32 = i31 % 2;
        this.c.v.setVisibility(0);
        BikeRegistryActivity bikeRegistryActivity4 = this.c;
        int i33 = a;
        int i34 = i33 & 47;
        int i35 = ((((i33 ^ 47) | i34) << 1) - (~(-((i33 | 47) & (~i34))))) - 1;
        b = i35 % 128;
        int i36 = i35 % 2;
        bikeRegistryActivity4.K.setVisibility(0);
        Button button2 = this.c.z;
        int i37 = a;
        int i38 = ((i37 & 13) - (~(-(-(i37 | 13))))) - 1;
        b = i38 % 128;
        int i39 = i38 % 2;
        button2.setEnabled(true);
        this.c.A.setVisibility(0);
        int i40 = b;
        int i41 = ((i40 & 44) + (i40 | 44)) - 1;
        a = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 77 / 0;
            if (!this.c.F.isEmpty()) {
                this.c.z.setVisibility(0);
                int i43 = a;
                int i44 = ((i43 & 86) + (i43 | 86)) - 1;
                b = i44 % 128;
                int i45 = i44 % 2;
                this.c.L.setVisibility(0);
                int i46 = a + 14;
                i = (i46 ^ (-1)) + (i46 << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    int i47 = 2 / 3;
                }
            }
        } else if (!this.c.F.isEmpty()) {
            this.c.z.setVisibility(0);
            int i48 = a;
            int i49 = ((i48 & 86) + (i48 | 86)) - 1;
            b = i49 % 128;
            int i410 = i49 % 2;
            this.c.L.setVisibility(0);
            int i411 = a + 14;
            i = (i411 ^ (-1)) + (i411 << 1);
            b = i % 128;
            if (i % 2 == 0) {
                int i412 = 2 / 3;
            }
        }
        this.c.H.clear();
        HashSet hashSet = new HashSet();
        int i50 = b;
        int i51 = ((i50 ^ 23) | (i50 & 23)) << 1;
        int i52 = -(((~i50) & 23) | (i50 & (-24)));
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        a = i53 % 128;
        int i54 = i53 % 2;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("members");
        int i55 = a;
        int i56 = i55 & 87;
        int i57 = -(-((i55 ^ 87) | i56));
        int i58 = (i56 & i57) + (i57 | i56);
        b = i58 % 128;
        int i59 = i58 % 2;
        Object obj = null;
        if (jSONArrayOptJSONArray != null) {
            int i60 = 0;
            str = BuildConfig.FLAVOR;
            while (i60 < jSONArrayOptJSONArray.length()) {
                int i61 = b + 117;
                a = i61 % 128;
                int i62 = i61 % 2;
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i60);
                if (jSONObjectOptJSONObject2 != null) {
                    int i63 = a;
                    int i64 = i63 & 109;
                    int i65 = i64 + ((i63 ^ 109) | i64);
                    b = i65 % 128;
                    if (i65 % 2 == 0) {
                        jSONObjectOptJSONObject2.optString("name");
                        jSONObjectOptJSONObject2.optString("cnic");
                        obj.hashCode();
                        throw null;
                    }
                    String strOptString = jSONObjectOptJSONObject2.optString("name");
                    String strOptString2 = jSONObjectOptJSONObject2.optString("cnic");
                    try {
                        double dOptDouble = jSONObjectOptJSONObject2.optDouble("uniqueHhId", -1.0d);
                        if (dOptDouble != -1.0d) {
                            int i66 = b + 103;
                            a = i66 % 128;
                            if (i66 % 2 != 0) {
                                strValueOf = String.valueOf((long) dOptDouble);
                                int i67 = 64 / 0;
                            } else {
                                strValueOf = String.valueOf((long) dOptDouble);
                            }
                        } else {
                            int i68 = b;
                            int i69 = (i68 & (-100)) | ((~i68) & 99);
                            int i70 = (i68 & 99) << 1;
                            int i71 = (i69 & i70) + (i70 | i69);
                            a = i71 % 128;
                            int i72 = i71 % 2;
                            strValueOf = "N/A";
                        }
                    } catch (Exception unused) {
                    }
                    if (!hashSet.contains(strOptString2)) {
                        hashSet.add(strOptString2);
                        List<bo> list = this.c.H;
                        bo boVar = new bo(strOptString, strOptString2);
                        int i73 = b;
                        int i74 = i73 ^ 71;
                        int i75 = (i73 & 71) << 1;
                        int i76 = (i74 & i75) + (i75 | i74);
                        a = i76 % 128;
                        if (i76 % 2 != 0) {
                            list.add(boVar);
                            throw null;
                        }
                        list.add(boVar);
                    }
                    str = strValueOf;
                }
                i60 = ((i60 | 1) << 1) - (i60 ^ 1);
                int i77 = a;
                int i78 = (i77 ^ 47) + ((i77 & 47) << 1);
                b = i78 % 128;
                int i79 = i78 % 2;
            }
        } else {
            str = BuildConfig.FLAVOR;
        }
        BikeRegistryActivity bikeRegistryActivity5 = this.c;
        StringBuilder sb = new StringBuilder();
        int i80 = a;
        int i81 = i80 & 23;
        int i82 = -(-((i80 ^ 23) | i81));
        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
        b = i83 % 128;
        int i84 = i83 % 2;
        sb.append("HouseHoldID : ");
        sb.append(str);
        int i85 = a;
        int i86 = i85 | 1;
        int i87 = ((i86 << 1) - (~(-((~(i85 & 1)) & i86)))) - 1;
        b = i87 % 128;
        if (i87 % 2 == 0) {
            sb.append("\nPlease Add Bike Information");
            string = sb.toString();
            int i88 = 11 / 0;
        } else {
            sb.append("\nPlease Add Bike Information");
            string = sb.toString();
        }
        BikeRegistryActivity.o(bikeRegistryActivity5, "Success", string);
        List<bo> list2 = this.c.H;
        bo boVar2 = new bo("Other", BuildConfig.FLAVOR);
        int i89 = a;
        int i90 = i89 & 3;
        int i91 = -(-((i89 ^ 3) | i90));
        int i92 = (i90 & i91) + (i91 | i90);
        b = i92 % 128;
        if (i92 % 2 != 0) {
            list2.add(boVar2);
        } else {
            list2.add(boVar2);
            throw null;
        }
    }
}
