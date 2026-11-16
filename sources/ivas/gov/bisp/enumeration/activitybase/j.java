package ivas.gov.bisp.enumeration.activitybase;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ BaseAuth.OooOOO0 c;

    public j(BaseAuth.OooOOO0 oooOOO0) {
        this.c = oooOOO0;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        BaseAuth baseAuth = BaseAuth.this;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
        int i8 = b;
        int i9 = i8 | 29;
        int i10 = i9 << 1;
        int i11 = -((~(i8 & 29)) & i9);
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        sbW.append(responseMessage.getErrorMessage());
        int i14 = a;
        int i15 = i14 & 37;
        int i16 = -(-(i14 | 37));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            ax.f(baseAuth, "Alert", sbW.toString());
            BaseAuth baseAuth2 = BaseAuth.this;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ax.f(baseAuth, "Alert", sbW.toString());
        ax.b(BaseAuth.this.U);
        int i18 = a;
        int i19 = (((i18 ^ 25) | (i18 & 25)) << 1) - (((~i18) & 25) | (i18 & (-26)));
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d5  */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        String string;
        String strK;
        byte[] bArrB;
        String strM;
        JSONArray jSONArray;
        ArrayList<String> arrayList;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & 32) + (i4 | 32)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        ax.b(BaseAuth.this.U);
        int i7 = a;
        int i8 = i7 & 111;
        int i9 = -(-((i7 ^ 111) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                string = jSONObject.getString("result");
                strK = BaseAuth.this.T.k();
                int i11 = 27 / 0;
            } else {
                string = jSONObject.getString("result");
                strK = BaseAuth.this.T.k();
            }
            int i12 = a;
            int i13 = (i12 | 21) << 1;
            int i14 = -(((~i12) & 21) | (i12 & (-22)));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                bArrB = b.b(strK);
                strM = BaseAuth.this.T.m();
                int i16 = 1 / 0;
            } else {
                bArrB = b.b(strK);
                strM = BaseAuth.this.T.m();
            }
            String strC = b.c(string, bArrB, b.b(strM));
            String str = this.c.c;
            try {
                JSONObject jSONObject2 = new JSONObject(strC);
                int i17 = a;
                int i18 = i17 ^ 47;
                int i19 = -(-((i17 & 47) << 1));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i20 % 128;
                Object obj = null;
                if (i20 % 2 != 0) {
                    jSONObject2.getInt("status".toLowerCase());
                    "message".toLowerCase();
                    obj.hashCode();
                    throw null;
                }
                int i21 = jSONObject2.getInt("status".toLowerCase());
                String lowerCase = "message".toLowerCase();
                int i22 = a;
                int i23 = (i22 & (-44)) | ((~i22) & 43);
                int i24 = -(-((i22 & 43) << 1));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i25 % 128;
                int i26 = i25 % 2;
                String string2 = jSONObject2.getString(lowerCase);
                String string3 = BuildConfig.FLAVOR;
                if (jSONObject2.has("resurvey_status".toLowerCase())) {
                    int i27 = a;
                    int i28 = (i27 & (-92)) | ((~i27) & 91);
                    int i29 = (i27 & 91) << 1;
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        jSONObject2.getString("resurvey_status".toLowerCase());
                        throw null;
                    }
                    string3 = jSONObject2.getString("resurvey_status".toLowerCase());
                    int i31 = b;
                    int i32 = i31 & 11;
                    int i33 = i32 + ((i31 ^ 11) | i32);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                }
                if (i21 != -1) {
                    this.c.e.actionPerform();
                    int i35 = b;
                    int i36 = ((i35 ^ 54) + ((i35 & 54) << 1)) - 1;
                    a = i36 % 128;
                    int i37 = i36 % 2;
                    return;
                }
                int i38 = a;
                int i39 = ((i38 & (-104)) | ((~i38) & 103)) + ((i38 & 103) << 1);
                b = i39 % 128;
                int i40 = i39 % 2;
                if (string2.equals("701")) {
                    Toast.makeText(BaseAuth.this, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                    jSONArray = jSONObject2.getJSONArray("fingerindex".toLowerCase());
                    arrayList = new ArrayList<>();
                    i = b;
                    int i41 = ((i ^ 79) | (i & 79)) << 1;
                    int i42 = -((i & (-80)) | ((~i) & 79));
                    int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    if (jSONArray != null) {
                        int i45 = (i & 107) + (i | 107);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = (i & (-74)) | ((~i) & 73);
                        int i48 = (i & 73) << 1;
                        int i49 = (i47 & i48) + (i48 | i47);
                        a = i49 % 128;
                        int i50 = i49 % 2;
                        i2 = 0;
                        while (i2 < jSONArray.length()) {
                            int i51 = a;
                            int i52 = (i51 & (-68)) | ((~i51) & 67);
                            int i53 = (i51 & 67) << 1;
                            int i54 = (i52 & i53) + (i53 | i52);
                            b = i54 % 128;
                            int i55 = i54 % 2;
                            arrayList.add(jSONArray.getString(i2));
                            int i56 = i2 & (-53);
                            int i57 = (i56 - (~((i2 ^ (-53)) | i56))) - 1;
                            int i58 = i57 & 54;
                            i2 = i58 + ((i57 ^ 54) | i58);
                            int i59 = b;
                            int i60 = ((i59 ^ 53) - (~(-(-((i59 & 53) << 1))))) - 1;
                            a = i60 % 128;
                            int i61 = i60 % 2;
                        }
                    }
                    BaseAuth.this.q(string2, arrayList);
                    int i62 = b;
                    int i63 = i62 & 91;
                    int i64 = (i62 | 91) & (~i63);
                    int i65 = -(-(i63 << 1));
                    int i66 = (i64 & i65) + (i64 | i65);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    int i68 = a + 103;
                    b = i68 % 128;
                    int i69 = i68 % 2;
                    if (string2.equals("702")) {
                        int i70 = b;
                        int i71 = ((i70 ^ 84) + ((i70 & 84) << 1)) - 1;
                        a = i71 % 128;
                        int i72 = i71 % 2;
                        Toast.makeText(BaseAuth.this, "Fingerprint not matched. Kindly select another finger from given options.", 1).show();
                        jSONArray = jSONObject2.getJSONArray("fingerindex".toLowerCase());
                        arrayList = new ArrayList<>();
                        i = b;
                        int i410 = ((i ^ 79) | (i & 79)) << 1;
                        int i411 = -((i & (-80)) | ((~i) & 79));
                        int i412 = (i410 ^ i411) + ((i410 & i411) << 1);
                        a = i412 % 128;
                        int i413 = i412 % 2;
                        if (jSONArray != null) {
                            int i414 = (i & 107) + (i | 107);
                            a = i414 % 128;
                            int i415 = i414 % 2;
                            int i416 = (i & (-74)) | ((~i) & 73);
                            int i417 = (i & 73) << 1;
                            int i418 = (i416 & i417) + (i417 | i416);
                            a = i418 % 128;
                            int i510 = i418 % 2;
                            i2 = 0;
                            while (i2 < jSONArray.length()) {
                                int i511 = a;
                                int i512 = (i511 & (-68)) | ((~i511) & 67);
                                int i513 = (i511 & 67) << 1;
                                int i514 = (i512 & i513) + (i513 | i512);
                                b = i514 % 128;
                                int i515 = i514 % 2;
                                arrayList.add(jSONArray.getString(i2));
                                int i516 = i2 & (-53);
                                int i517 = (i516 - (~((i2 ^ (-53)) | i516))) - 1;
                                int i518 = i517 & 54;
                                i2 = i518 + ((i517 ^ 54) | i518);
                                int i519 = b;
                                int i610 = ((i519 ^ 53) - (~(-(-((i519 & 53) << 1))))) - 1;
                                a = i610 % 128;
                                int i611 = i610 % 2;
                            }
                        }
                        BaseAuth.this.q(string2, arrayList);
                        int i612 = b;
                        int i613 = i612 & 91;
                        int i614 = (i612 | 91) & (~i613);
                        int i615 = -(-(i613 << 1));
                        int i616 = (i614 & i615) + (i614 | i615);
                        a = i616 % 128;
                        int i617 = i616 % 2;
                    } else {
                        BaseAuth.o(BaseAuth.this, string2, string3);
                        int i73 = a;
                        int i74 = ((i73 ^ 98) + ((i73 & 98) << 1)) - 1;
                        b = i74 % 128;
                        int i75 = i74 % 2;
                    }
                }
                ProgressDialog progressDialog = BaseAuth.this.U;
                if (progressDialog != null) {
                    int i76 = a;
                    int i77 = i76 & 1;
                    int i78 = i77 + ((i76 ^ 1) | i77);
                    b = i78 % 128;
                    int i79 = i78 % 2;
                    if (progressDialog.isShowing()) {
                        int i80 = a;
                        int i81 = i80 & 83;
                        int i82 = ((i80 ^ 83) | i81) << 1;
                        int i83 = -((i80 | 83) & (~i81));
                        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                        b = i84 % 128;
                        if (i84 % 2 != 0) {
                            BaseAuth.this.U.dismiss();
                            int i85 = 53 / 0;
                        } else {
                            BaseAuth.this.U.dismiss();
                        }
                        int i86 = b;
                        int i87 = (i86 & 81) + (i86 | 81);
                        a = i87 % 128;
                        int i88 = i87 % 2;
                        return;
                    }
                }
                int i89 = b + 97;
                a = i89 % 128;
                int i90 = i89 % 2;
            } catch (JSONException e) {
                BaseAuth baseAuth = BaseAuth.this;
                StringBuilder sb = new StringBuilder();
                sb.append("Deserialization Exception ");
                sb.append(e.getMessage());
                ax.f(baseAuth, "Alert", sb.toString());
                ax.b(BaseAuth.this.U);
            }
        } catch (Exception e2) {
            BaseAuth baseAuth2 = BaseAuth.this;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Exception ");
            sbW.append(e2.getMessage());
            ax.f(baseAuth2, "Alert", sbW.toString());
            ax.b(BaseAuth.this.U);
        }
    }
}
