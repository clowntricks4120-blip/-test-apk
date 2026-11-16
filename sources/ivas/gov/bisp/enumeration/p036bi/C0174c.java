package ivas.gov.bisp.enumeration.p036bi;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.AddressActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0174c implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ AddressActivity d;

    public C0174c(AddressActivity addressActivity, Spinner spinner) {
        this.d = addressActivity;
        this.c = spinner;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.c$blM */
    public class blM implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public blM() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 | 115;
            int i5 = (i4 << 1) - (i4 & (~(i3 & 115)));
            a = i5 % 128;
            int i6 = i5 % 2;
            if (i == 0) {
                int i7 = i3 + 19;
                a = i7 % 128;
                int i8 = i7 % 2;
                C0174c.this.c.setBackgroundResource(R.drawable.spinner_bg);
                int i9 = a;
                int i10 = (i9 ^ 45) + ((i9 & 45) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            } else {
                C0174c.this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i12 = a;
                int i13 = i12 & 119;
                int i14 = ((i12 ^ 119) | i13) << 1;
                int i15 = -((i12 | 119) & (~i13));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 4 / 5;
                }
            }
            if (C0174c.this.c.getSelectedItem().equals("Other")) {
                int i18 = b;
                int i19 = i18 & 63;
                int i20 = ((i18 | 63) & (~i19)) + (i19 << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                C0174c.this.d.ap.setVisibility(0);
                int i22 = b + 10;
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            EditText editText = C0174c.this.d.ap;
            int i25 = a;
            int i26 = i25 & 45;
            int i27 = (i25 ^ 45) | i26;
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            if (i28 % 2 != 0) {
                editText.setVisibility(8);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            editText.setVisibility(8);
            int i29 = a;
            int i30 = i29 & 21;
            int i31 = i30 + ((i29 ^ 21) | i30);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 66 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = (i3 - (~(-(-((i2 ^ 43) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ax.b(this.d.af);
            throw null;
        }
        ax.b(this.d.af);
        AddressActivity addressActivity = this.d;
        int i5 = b;
        int i6 = i5 & 59;
        int i7 = ((i5 ^ 59) | i6) << 1;
        int i8 = -((i5 | 59) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            af.b(addressActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
            throw null;
        }
        af.b(addressActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i10 = a;
        int i11 = (i10 & 51) + (i10 | 51);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        ArrayList<String> arrayList;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 & 110) + (i3 | 110)) ^ (-1));
        a = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                ax.b(this.d.af);
                jSONObject.getString("result");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ax.b(this.d.af);
            String string = jSONObject.getString("result");
            byte[] bArrB = b.b(this.d.ae.k());
            int i5 = b;
            int i6 = (i5 ^ 87) + ((i5 & 87) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                b.c(string, bArrB, b.b(this.d.ae.m()));
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            JSONArray jSONArray = new JSONObject(b.c(string, bArrB, b.b(this.d.ae.m()))).getJSONArray("villages_list");
            this.d.ak = new ArrayList<>();
            AddressActivity addressActivity = this.d;
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i7 = b;
            int i8 = i7 & 121;
            int i9 = -(-((i7 ^ 121) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            addressActivity.aD = arrayList2;
            Resources resources = this.d.getResources();
            int i12 = a;
            int i13 = i12 & 89;
            int i14 = (((i12 | 89) & (~i13)) - (~(i13 << 1))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            String string2 = resources.getString(R.string.selectvilage);
            if (string2 != null) {
                int i16 = b;
                int i17 = (((i16 & (-86)) | ((~i16) & 85)) - (~(-(-((i16 & 85) << 1))))) - 1;
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    string2.length();
                    throw null;
                }
                if (string2.length() > 0) {
                    ArrayList<vilages> arrayList3 = this.d.ak;
                    vilages vilagesVar = new vilages(0, 0L, BuildConfig.FLAVOR, string2);
                    int i18 = a;
                    int i19 = (i18 ^ 95) + ((i18 & 95) << 1);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    arrayList3.add(vilagesVar);
                    ArrayList<String> arrayList4 = this.d.aD;
                    int i21 = a;
                    int i22 = i21 & 61;
                    int i23 = -(-((i21 ^ 61) | i22));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    b = i24 % 128;
                    if (i24 % 2 != 0) {
                        arrayList4.add(string2);
                        int i25 = 13 / 0;
                    } else {
                        arrayList4.add(string2);
                    }
                    int i26 = a;
                    int i27 = i26 & 121;
                    int i28 = -(-((i26 ^ 121) | i27));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                }
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i31 = a + 63;
                b = i31 % 128;
                int i32 = i31 % 2 != 0 ? 1 : 0;
                while (i32 < length) {
                    int i33 = b;
                    int i34 = i33 & 7;
                    int i35 = (((i33 ^ 7) | i34) << 1) - ((i33 | 7) & (~i34));
                    a = i35 % 128;
                    if (i35 % i == 0) {
                        jSONArray.getJSONObject(i32).getInt("uccode");
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i32);
                    int i36 = jSONObject2.getInt("uccode");
                    int i37 = jSONObject2.getInt("localitycode");
                    String string3 = jSONObject2.getString("localitytype");
                    int i38 = a;
                    int i39 = i38 & 115;
                    int i40 = (((i38 | 115) & (~i39)) - (~(i39 << 1))) - 1;
                    b = i40 % 128;
                    int i41 = i40 % i;
                    String string4 = jSONObject2.getString("locality");
                    ArrayList<vilages> arrayList5 = this.d.ak;
                    int i42 = length;
                    vilages vilagesVar2 = new vilages(i36, i37, string3, string4);
                    int i43 = a;
                    int i44 = (i43 & (-122)) | ((~i43) & 121);
                    int i45 = (i43 & 121) << 1;
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    b = i46 % 128;
                    int i47 = i46 % 2;
                    arrayList5.add(vilagesVar2);
                    ArrayList<String> arrayList6 = this.d.aD;
                    int i48 = b;
                    int i49 = i48 & 71;
                    int i50 = ((i48 ^ 71) | i49) << 1;
                    int i51 = -((i48 | 71) & (~i49));
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    arrayList6.add(string4);
                    i32 = (i32 ^ (-102)) + ((i32 & (-102)) << 1) + 103;
                    int i54 = a;
                    int i55 = (i54 | 61) << 1;
                    int i56 = -(((~i54) & 61) | (i54 & (-62)));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    length = i42;
                    i = 2;
                }
            } else {
                ArrayList<vilages> arrayList7 = this.d.ak;
                vilages vilagesVar3 = new vilages(1, 0L, BuildConfig.FLAVOR, "Other");
                int i59 = a;
                int i60 = i59 & 109;
                int i61 = ((i59 ^ 109) | i60) << 1;
                int i62 = -((i59 | 109) & (~i60));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                b = i63 % 128;
                if (i63 % 2 != 0) {
                    arrayList7.add(vilagesVar3);
                    arrayList = this.d.aD;
                    int i64 = 28 / 0;
                } else {
                    arrayList7.add(vilagesVar3);
                    arrayList = this.d.aD;
                }
                arrayList.add("Other");
                int i65 = b;
                int i66 = ((i65 & 30) + (i65 | 30)) - 1;
                a = i66 % 128;
                int i67 = i66 % 2;
            }
            if (this.c != null) {
                AddressActivity addressActivity2 = this.d;
                ArrayAdapter arrayAdapter = new ArrayAdapter(addressActivity2, R.layout.spinner_item, addressActivity2.aD);
                int i68 = b;
                int i69 = (((i68 & (-72)) | ((~i68) & 71)) - (~(-(-((i68 & 71) << 1))))) - 1;
                a = i69 % 128;
                int i70 = i69 % 2;
                this.c.setAdapter((SpinnerAdapter) arrayAdapter);
                Spinner spinner = this.c;
                blM blm = new blM();
                int i71 = a;
                int i72 = i71 & 21;
                int i73 = (((i71 ^ 21) | i72) << 1) - ((i71 | 21) & (~i72));
                b = i73 % 128;
                int i74 = i73 % 2;
                spinner.setOnItemSelectedListener(blm);
                int i75 = a;
                int i76 = i75 & 15;
                int i77 = (((i75 | 15) & (~i76)) - (~(-(-(i76 << 1))))) - 1;
                b = i77 % 128;
                if (i77 % 2 == 0) {
                    return;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            int i78 = a;
            int i79 = i78 ^ 117;
            int i80 = ((i78 & 117) | i79) << 1;
            int i81 = -i79;
            int i82 = (i80 & i81) + (i80 | i81);
            b = i82 % 128;
            if (i82 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
