package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aM implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ UpdateElectricityGassRefActivity d;

    public aM(UpdateElectricityGassRefActivity updateElectricityGassRefActivity, boolean z) {
        this.d = updateElectricityGassRefActivity;
        this.c = z;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = (JSONObject) obj;
        Log.e("response", jSONObject.toString());
        int i5 = b;
        int i6 = i5 & 1;
        int i7 = ((((i5 ^ 1) | i6) << 1) - (~(-((i5 | 1) & (~i6))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
            String string = jSONObject2.getString("message");
            int i9 = (-2) - ((a + 100) ^ (-1));
            b = i9 % 128;
            if (i9 % 2 != 0) {
                ProgressDialog progressDialog = this.d.af;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.d.af.dismiss();
            if (!(!this.c)) {
                int i10 = b;
                int i11 = ((((i10 ^ 37) | (i10 & 37)) << 1) - (~(-(((~i10) & 37) | (i10 & (-38)))))) - 1;
                a = i11 % 128;
                Toast.makeText(i11 % 2 == 0 ? this.d : this.d, string, 0).show();
                int i12 = a;
                int i13 = ((((i12 ^ 115) | (i12 & 115)) << 1) - (~(-(((~i12) & 115) | (i12 & (-116)))))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                if (!string.equalsIgnoreCase("Meter numbers are empty!")) {
                    int i15 = a;
                    int i16 = (i15 ^ 39) + ((i15 & 39) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    this.d.onBackPressed();
                    int i18 = b;
                    int i19 = i18 & 117;
                    int i20 = ((((i18 ^ 117) | i19) << 1) - (~(-((i18 | 117) & (~i19))))) - 1;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    return;
                }
            } else if (string.equalsIgnoreCase("success")) {
                int i22 = a;
                int i23 = (((i22 & (-60)) | (59 & (~i22))) - (~((i22 & 59) << 1))) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                this.d.ah = jSONObject2.getString("electricityRefNo").toString();
                int i25 = a;
                int i26 = (i25 ^ 101) + ((i25 & 101) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
                this.d.aj = jSONObject2.getString("gasRefNo").toString();
                int i28 = a;
                int i29 = i28 & 25;
                int i30 = ((i28 ^ 25) | i29) << 1;
                int i31 = -((i28 | 25) & (~i29));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                b = i32 % 128;
                int i33 = i32 % 2;
                if (jSONObject2.has("province")) {
                    int i34 = b;
                    int i35 = (i34 & 85) + (i34 | 85);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity = this.d;
                    String string2 = jSONObject2.getString("province");
                    int i37 = a;
                    int i38 = ((i37 | 17) << 1) - (i37 ^ 17);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    Objects.requireNonNull(string2);
                    Objects.requireNonNull(updateElectricityGassRefActivity);
                    int i40 = b;
                    int i41 = i40 & 53;
                    int i42 = -(-((i40 ^ 53) | i41));
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (jSONObject2.has("province_Code")) {
                    int i45 = a;
                    int i46 = (i45 ^ 66) + ((i45 & 66) << 1);
                    int i47 = (i46 ^ (-1)) + (i46 << 1);
                    b = i47 % 128;
                    if (i47 % 2 != 0) {
                        jSONObject2.getString("province_Code");
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity2 = this.d;
                    String string3 = jSONObject2.getString("province_Code");
                    int i48 = b;
                    int i49 = ((((i48 ^ 119) | (i48 & 119)) << 1) - (~(-(((~i48) & 119) | (i48 & (-120)))))) - 1;
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    Objects.requireNonNull(string3);
                    Objects.requireNonNull(updateElectricityGassRefActivity2);
                    int i51 = a;
                    int i52 = (i51 ^ 81) + ((i51 & 81) << 1);
                    b = i52 % 128;
                    int i53 = i52 % 2;
                }
                if (jSONObject2.has("dist")) {
                    int i54 = a;
                    int i55 = i54 & 123;
                    int i56 = i54 | 123;
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity3 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("dist"));
                    int i59 = a;
                    int i60 = (i59 & (-70)) | ((~i59) & 69);
                    int i61 = -(-((i59 & 69) << 1));
                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                    b = i62 % 128;
                    if (i62 % 2 != 0) {
                        Objects.requireNonNull(updateElectricityGassRefActivity3);
                        int i63 = 62 / 0;
                    } else {
                        Objects.requireNonNull(updateElectricityGassRefActivity3);
                    }
                }
                if (jSONObject2.has("dist_Code")) {
                    int i64 = a + 59;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity4 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("dist_Code"));
                    int i66 = b + 79;
                    a = i66 % 128;
                    if (i66 % 2 == 0) {
                        Objects.requireNonNull(updateElectricityGassRefActivity4);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Objects.requireNonNull(updateElectricityGassRefActivity4);
                }
                if (!(!jSONObject2.has("tehsil"))) {
                    int i67 = a;
                    int i68 = i67 | 47;
                    int i69 = i68 << 1;
                    int i70 = -((~(i67 & 47)) & i68);
                    int i71 = (i69 & i70) + (i70 | i69);
                    b = i71 % 128;
                    int i72 = i71 % 2;
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity5 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("tehsil"));
                    int i73 = a;
                    int i74 = ((i73 & (-60)) | (59 & (~i73))) + ((i73 & 59) << 1);
                    b = i74 % 128;
                    if (i74 % 2 != 0) {
                        Objects.requireNonNull(updateElectricityGassRefActivity5);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Objects.requireNonNull(updateElectricityGassRefActivity5);
                }
                if (jSONObject2.has("tehsil_Code")) {
                    int i75 = b;
                    int i76 = i75 ^ 77;
                    int i77 = (((i75 & 77) | i76) << 1) - i76;
                    a = i77 % 128;
                    if (i77 % 2 == 0) {
                        jSONObject2.getString("tehsil_Code");
                        throw null;
                    }
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity6 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("tehsil_Code"));
                    Objects.requireNonNull(updateElectricityGassRefActivity6);
                    int i78 = b;
                    int i79 = ((i78 ^ 49) | (i78 & 49)) << 1;
                    int i80 = -(((~i78) & 49) | (i78 & (-50)));
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    a = i81 % 128;
                    int i82 = i81 % 2;
                }
                if (jSONObject2.has("center")) {
                    int i83 = a;
                    int i84 = ((i83 | 27) << 1) - (i83 ^ 27);
                    b = i84 % 128;
                    int i85 = i84 % 2;
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity7 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("center"));
                    int i86 = a;
                    int i87 = ((i86 ^ 76) + ((i86 & 76) << 1)) - 1;
                    b = i87 % 128;
                    int i88 = i87 % 2;
                    Objects.requireNonNull(updateElectricityGassRefActivity7);
                    int i89 = a;
                    int i90 = (((i89 | 118) << 1) - (i89 ^ 118)) - 1;
                    b = i90 % 128;
                    if (i90 % 2 != 0) {
                        int i91 = 5 / 4;
                    }
                }
                if (!(!jSONObject2.has("center_Code"))) {
                    int i92 = b + 45;
                    a = i92 % 128;
                    if (i92 % 2 == 0) {
                        Objects.requireNonNull(jSONObject2.getString("center_Code"));
                        throw null;
                    }
                    UpdateElectricityGassRefActivity updateElectricityGassRefActivity8 = this.d;
                    Objects.requireNonNull(jSONObject2.getString("center_Code"));
                    int i93 = b;
                    int i94 = i93 & 105;
                    int i95 = ((i93 ^ 105) | i94) << 1;
                    int i96 = -((i93 | 105) & (~i94));
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    a = i97 % 128;
                    int i98 = i97 % 2;
                    Objects.requireNonNull(updateElectricityGassRefActivity8);
                    int i99 = a;
                    int i100 = ((((i99 ^ 5) | (i99 & 5)) << 1) - (~(-(((~i99) & 5) | (i99 & (-6)))))) - 1;
                    b = i100 % 128;
                    int i101 = i100 % 2;
                }
                UpdateElectricityGassRefActivity updateElectricityGassRefActivity9 = this.d;
                EditText editText = updateElectricityGassRefActivity9.ag;
                String str = updateElectricityGassRefActivity9.ah;
                int i102 = b;
                int i103 = i102 | 65;
                int i104 = i103 << 1;
                int i105 = -((~(i102 & 65)) & i103);
                int i106 = (i104 & i105) + (i105 | i104);
                a = i106 % 128;
                if (i106 % 2 == 0) {
                    editText.setText(str);
                    updateElectricityGassRefActivity9.ai.setText(updateElectricityGassRefActivity9.aj);
                    int i107 = 94 / 0;
                } else {
                    editText.setText(str);
                    updateElectricityGassRefActivity9.ai.setText(updateElectricityGassRefActivity9.aj);
                }
                int i108 = a;
                int i109 = (i108 ^ 123) + ((i108 & 123) << 1);
                b = i109 % 128;
                int i110 = i109 % 2;
                return;
            }
            int i111 = a;
            int i112 = i111 & 93;
            int i113 = (i112 - (~((i111 ^ 93) | i112))) - 1;
            b = i113 % 128;
            if (i113 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
            this.d.finish();
            this.d.af.dismiss();
        }
    }
}
