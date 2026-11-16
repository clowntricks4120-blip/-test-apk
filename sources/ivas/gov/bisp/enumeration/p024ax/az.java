package ivas.gov.bisp.enumeration.p024ax;

import android.util.Log;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooO;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooOO0;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooOO0O;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication.OooOOO0;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p039bl.e;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class az implements o00Ooo.OooO0O0<String> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aF c;

    public az(aF aFVar) {
        this.c = aFVar;
    }

    public void b(Object obj) {
        JSONObject jSONObject;
        int i;
        long j;
        int i2;
        int i3;
        String string;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 41;
        int i8 = 1;
        int i9 = ((~i7) & (i6 | 41)) + (i7 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        String str = (String) obj;
        Authentication.OooO0OO oooO0OO = (Authentication.OooO0OO) this.c;
        int i11 = i6 & 123;
        int i12 = ((((i6 ^ 123) | i11) << 1) - (~(-((i6 | 123) & (~i11))))) - 1;
        a = i12 % 128;
        Object obj2 = null;
        if (i12 % 2 != 0) {
            b.b(oooO0OO.c);
            b.b(oooO0OO.d);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        String strC = b.c(str, b.b(oooO0OO.c), b.b(oooO0OO.d));
        try {
            Authentication.OooO oooO = Authentication.this.new OooO();
            int i13 = b + 58;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            oooO.execute(new Void[0]);
            int i16 = b;
            int i17 = (i16 & 123) + (i16 | 123);
            a = i17 % 128;
            int i18 = i17 % 2;
        } catch (Exception unused) {
        }
        Authentication authentication = Authentication.this;
        new ArrayList();
        Objects.requireNonNull(authentication);
        try {
            JSONObject jSONObject2 = new JSONObject(strC);
            int i19 = b;
            int i20 = ((((i19 ^ 29) | (i19 & 29)) << 1) - (~(-(((~i19) & 29) | (i19 & (-30)))))) - 1;
            a = i20 % 128;
            if (i20 % 2 != 0) {
                jSONObject2.getJSONArray("province_list").length();
                throw null;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("province_list");
            int i21 = a;
            int i22 = (((i21 & (-76)) | ((~i21) & 75)) - (~(-(-((i21 & 75) << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 0;
            for (int length = jSONArray.length(); i24 < length; length = length) {
                int i25 = a;
                int i26 = i25 & 15;
                int i27 = -(-(i25 | 15));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i24);
                int i30 = a;
                int i31 = (((i30 | 16) << 1) - (i30 ^ 16)) - 1;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    i3 = (int) jSONObject3.getDouble("provcode");
                    string = jSONObject3.getString("province");
                    int i32 = 53 / 0;
                } else {
                    i3 = (int) jSONObject3.getDouble("provcode");
                    string = jSONObject3.getString("province");
                }
                Authentication.OooOO0O oooOO0O = Authentication.this.new OooOO0O(new province(UUID.randomUUID().toString(), i3, string));
                int i33 = a;
                int i34 = (i33 ^ 115) + ((i33 & 115) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
                oooOO0O.execute(new Void[0]);
                int i36 = (i24 & (-2)) | ((~i24) & 1);
                int i37 = (i24 & 1) << 1;
                i24 = (i36 & i37) + (i36 | i37);
                int i38 = a;
                int i39 = i38 & 71;
                int i40 = (((i38 ^ 71) | i39) << 1) - ((i38 | 71) & (~i39));
                b = i40 % 128;
                int i41 = i40 % 2;
            }
            JSONArray jSONArray2 = jSONObject2.getJSONArray("district_list");
            int length2 = jSONArray2.length();
            int i42 = a;
            int i43 = i42 + 81;
            b = i43 % 128;
            int i44 = i43 % 2;
            int i45 = i42 ^ 21;
            int i46 = (i42 & 21) << 1;
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            b = i47 % 128;
            if (i47 % 2 == 0) {
                int i48 = 5 % 5;
            }
            int i49 = 0;
            while (i49 < length2) {
                int i50 = a;
                int i51 = ((i50 ^ 106) + ((i50 & 106) << 1)) - 1;
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    jSONArray2.getJSONObject(i49).getInt("distcode");
                    obj2.hashCode();
                    throw null;
                }
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i49);
                int i52 = jSONObject4.getInt("distcode");
                int i53 = jSONObject4.getInt("divcode");
                int i54 = b;
                int i55 = (i54 & 57) + (i54 | 57);
                a = i55 % 128;
                if (i55 % 2 != 0) {
                    jSONObject4.getInt("provcode");
                    jSONObject4.getString("district");
                    throw null;
                }
                Authentication.OooOO0 oooOO0 = Authentication.this.new OooOO0(new district(UUID.randomUUID().toString(), i52, i53, jSONObject4.getInt("provcode"), jSONObject4.getString("district")));
                int i56 = b;
                int i57 = (i56 ^ 99) + ((i56 & 99) << 1);
                a = i57 % 128;
                if (i57 % 2 != 0) {
                    oooOO0.execute(new Void[1]);
                    i2 = ((i49 | 77) << 1) - (i49 ^ 77);
                } else {
                    oooOO0.execute(new Void[0]);
                    int i58 = i49 & (-49);
                    i2 = ((((i49 ^ (-49)) | i58) << 1) - (~(-((i49 | (-49)) & (~i58))))) + 49;
                }
                i49 = i2;
                int i59 = b;
                int i60 = i59 ^ 61;
                int i61 = (((i59 & 61) | i60) << 1) - i60;
                a = i61 % 128;
                int i62 = i61 % 2;
            }
            JSONArray jSONArray3 = jSONObject2.getJSONArray("teshil_list");
            int length3 = jSONArray3.length();
            int i63 = b;
            int i64 = (i63 & (-76)) | ((~i63) & 75);
            int i65 = -(-((i63 & 75) << 1));
            int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
            a = i66 % 128;
            int i67 = i66 % 2;
            int i68 = 0;
            while (i68 < length3) {
                int i69 = a;
                int i70 = i69 & 33;
                int i71 = (i69 | 33) & (~i70);
                int i72 = -(-(i70 << 1));
                int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                b = i73 % 128;
                int i74 = i73 % 2;
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i68);
                int i75 = b;
                int i76 = ((123 & (~i75)) | (i75 & (-124))) + ((i75 & 123) << 1);
                a = i76 % 128;
                if (i76 % 2 != 0) {
                    jSONObject5.getInt("tehsilcode");
                    jSONObject5.getInt("distcode");
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Authentication.OooOOO0 oooOOO0 = Authentication.this.new OooOOO0(new tehsil(UUID.randomUUID().toString(), jSONObject5.getInt("tehsilcode"), jSONObject5.getInt("distcode"), jSONObject5.getString("tehsil")));
                int i77 = b;
                int i78 = i77 & 25;
                int i79 = (i77 ^ 25) | i78;
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                a = i80 % 128;
                int i81 = i80 % 2;
                oooOOO0.execute(new Void[0]);
                int i82 = (-2) - (((i68 ^ (-46)) + ((i68 & (-46)) << 1)) ^ (-1));
                int i83 = i82 & 48;
                i68 = (i83 - (~((i82 ^ 48) | i83))) - 1;
                int i84 = b;
                int i85 = i84 & 89;
                int i86 = ((i84 ^ 89) | i85) << 1;
                int i87 = -((i84 | 89) & (~i85));
                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                a = i88 % 128;
                int i89 = i88 % 2;
            }
            JSONArray jSONArray4 = jSONObject2.getJSONArray("uc_list");
            int length4 = jSONArray4.length();
            ArrayList arrayList = new ArrayList();
            int i90 = b;
            int i91 = (i90 & (-56)) | ((~i90) & 55);
            int i92 = -(-((i90 & 55) << 1));
            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
            a = i93 % 128;
            int i94 = i93 % 2;
            int i95 = 0;
            while (i95 < length4) {
                int i96 = b;
                int i97 = i96 & 23;
                int i98 = (i96 | 23) & (~i97);
                int i99 = i97 << 1;
                int i100 = (i98 ^ i99) + ((i98 & i99) << 1);
                a = i100 % 128;
                int i101 = i100 % 2;
                JSONObject jSONObject6 = jSONArray4.getJSONObject(i95);
                int i102 = a;
                int i103 = i102 ^ 25;
                int i104 = (((i102 & 25) | i103) << 1) - i103;
                b = i104 % 128;
                int i105 = i104 % 2;
                int i106 = jSONObject6.getInt("tehsilcode");
                int i107 = jSONObject6.getInt("uccode");
                int i108 = a;
                int i109 = i108 & 107;
                int i110 = ((i108 | 107) & (~i109)) + (i109 << 1);
                b = i110 % 128;
                int i111 = i110 % 2;
                uc ucVar = new uc(jSONObject6.getString("uc"), i106, i107, jSONObject6.getInt("ucno"));
                int i112 = a;
                int i113 = (-2) - (((i112 ^ 20) + ((i112 & 20) << 1)) ^ (-1));
                b = i113 % 128;
                if (i113 % 2 == 0) {
                    arrayList.add(ucVar);
                    i95 = (i95 ^ 16) + ((i95 & 16) << 1);
                } else {
                    arrayList.add(ucVar);
                    int i114 = i95 & 1;
                    int i115 = -(-(i95 | 1));
                    i95 = ((i114 | i115) << 1) - (i115 ^ i114);
                }
            }
            Authentication authentication2 = Authentication.this;
            ExecutorService executorService = authentication2.at;
            e eVar = new e(authentication2, arrayList);
            int i116 = a + 121;
            b = i116 % 128;
            int i117 = i116 % 2;
            executorService.execute(eVar);
            JSONArray jSONArray5 = jSONObject2.getJSONArray("villages_list");
            int length5 = jSONArray5.length();
            ArrayList arrayList2 = new ArrayList();
            int i118 = a;
            int i119 = i118 & 27;
            int i120 = (i119 - (~(-(-((i118 ^ 27) | i119))))) - 1;
            int i121 = i120 % 128;
            b = i121;
            int i122 = i120 % 2;
            int i123 = i121 & 113;
            int i124 = (i121 | 113) & (~i123);
            int i125 = -(-(i123 << 1));
            int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
            a = i126 % 128;
            int i127 = i126 % 2;
            int i128 = 0;
            while (i128 < length5) {
                int i129 = a + 43;
                b = i129 % 128;
                if (i129 % i4 == 0) {
                    jSONObject = jSONArray5.getJSONObject(i128);
                    i = jSONObject.getInt("uccode");
                    j = jSONObject.getLong("localitycode");
                    int i130 = 75 / 0;
                } else {
                    jSONObject = jSONArray5.getJSONObject(i128);
                    i = jSONObject.getInt("uccode");
                    j = jSONObject.getLong("localitycode");
                }
                long j2 = j;
                int i131 = i;
                int i132 = b;
                int i133 = i132 & 5;
                int i134 = ((i132 ^ 5) | i133) << i8;
                int i135 = -((i132 | 5) & (~i133));
                int i136 = (i134 & i135) + (i135 | i134);
                a = i136 % 128;
                if (i136 % i4 != 0) {
                    jSONObject.getString("localitytype");
                    jSONObject.getString("locality");
                    UUID.randomUUID();
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                String string2 = jSONObject.getString("localitytype");
                String string3 = jSONObject.getString("locality");
                String string4 = UUID.randomUUID().toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Village: Id: ");
                int i137 = a;
                int i138 = ((i137 & 83) - (~(-(-(i137 | 83))))) - 1;
                b = i138 % 128;
                int i139 = i138 % 2;
                sb.append(string4);
                sb.append(" :: UCCode: ");
                sb.append(i131);
                int i140 = b + 37;
                a = i140 % 128;
                if (i140 % 2 != 0) {
                    sb.append(" :: Locality Code: ");
                    sb.append(j2);
                    sb.append(" :: Type: ");
                    throw null;
                }
                sb.append(" :: Locality Code: ");
                sb.append(j2);
                sb.append(" :: Type: ");
                sb.append(string2);
                sb.append(" :: Locality: ");
                sb.append(string3);
                Log.e("Authentication", sb.toString());
                vilages vilagesVar = new vilages(i131, j2, string2, string3);
                int i141 = a;
                int i142 = (((i141 & (-82)) | ((~i141) & 81)) - (~(-(-((i141 & 81) << 1))))) - 1;
                b = i142 % 128;
                if (i142 % 2 == 0) {
                    arrayList2.add(vilagesVar);
                    int i143 = (i128 & (-32)) | ((~i128) & 31);
                    int i144 = (i128 & 31) << 1;
                    i128 = ((i143 | i144) << 1) - (i143 ^ i144);
                } else {
                    arrayList2.add(vilagesVar);
                    int i145 = i128 & 1;
                    i128 = ((((i128 ^ 1) | i145) << 1) - (~(-((~i145) & (i128 | 1))))) - 1;
                }
                i4 = 2;
                i8 = 1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onSuccess: Village List Size:  ");
            int i146 = b;
            int i147 = (((i146 | 82) << 1) - (i146 ^ 82)) - 1;
            a = i147 % 128;
            int i148 = i147 % 2;
            sb2.append(arrayList2.size());
            int i149 = b;
            int i150 = (i149 & 29) + (i149 | 29);
            a = i150 % 128;
            if (i150 % 2 != 0) {
                Log.e("Authentication", sb2.toString());
                Authentication authentication3 = Authentication.this;
                throw null;
            }
            Log.e("Authentication", sb2.toString());
            Authentication authentication4 = Authentication.this;
            ExecutorService executorService2 = authentication4.at;
            ivas.gov.bisp.enumeration.activity.authentication.b bVar = new ivas.gov.bisp.enumeration.activity.authentication.b(authentication4, arrayList2);
            int i151 = b;
            int i152 = i151 & 63;
            int i153 = (i151 ^ 63) | i152;
            int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
            a = i154 % 128;
            int i155 = i154 % 2;
            executorService2.execute(bVar);
            int i156 = a + 69;
            b = i156 % 128;
            if (i156 % 2 != 0) {
                return;
            }
            Object obj6 = null;
            obj6.hashCode();
            throw null;
        } catch (JSONException e) {
            Authentication.this.U.dismiss();
            SessionManager sessionManager = Authentication.this.T;
            sessionManager.d.clear();
            sessionManager.d.commit();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onSuccess: Address Library Parsing Error! \n");
            sb3.append(e.getMessage());
            Log.e("TAG", sb3.toString());
            StringBuilder sbW = j.w("Address Library Parsing Error!\n");
            sbW.append(e.getMessage());
            ResponseMessage responseMessage = new ResponseMessage(0, sbW.toString(), true);
            af.b(Authentication.this, responseMessage.getErrorMessage(), responseMessage.isLogout());
        }
    }
}
