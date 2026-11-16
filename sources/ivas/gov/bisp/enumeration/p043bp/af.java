package ivas.gov.bisp.enumeration.p043bp;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.z;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class af implements o00Ooo.OooO0O0<String> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ProgressDialog c;
    public final /* synthetic */ z d;
    public final /* synthetic */ Context e;

    public af(BISPApplication bISPApplication, ProgressDialog progressDialog, z zVar, Context context) {
        this.c = progressDialog;
        this.d = zVar;
        this.e = context;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r11
  0x0035: PHI (r11v36 java.lang.String) = (r11v1 java.lang.String), (r11v37 java.lang.String) binds: [B:8:0x0033, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public void b(Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = -(-(i2 | 53));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            str = (String) obj;
            int i6 = 76 / 0;
            if (this.c.isShowing()) {
                int i7 = a + 115;
                b = i7 % 128;
                int i8 = i7 % 2;
                this.c.dismiss();
                int i9 = b;
                int i10 = ((i9 | 67) << 1) - (i9 ^ 67);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            str = (String) obj;
            if (this.c.isShowing()) {
                int i12 = a + 115;
                b = i12 % 128;
                int i13 = i12 % 2;
                this.c.dismiss();
                int i14 = b;
                int i15 = ((i14 | 67) << 1) - (i14 ^ 67);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        Log.e("success", str.toString());
        try {
            try {
                JSONObject jSONObject = new JSONObject(str);
                StringBuilder sb = new StringBuilder();
                boolean z = jSONObject.getBoolean("status");
                int i17 = b;
                int i18 = i17 & 119;
                int i19 = ((((i17 ^ 119) | i18) << 1) - (~(-((i17 | 119) & (~i18))))) - 1;
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    sb.append(z);
                    Log.e("success", sb.toString());
                    int i20 = 4 / 0;
                } else {
                    sb.append(z);
                    Log.e("success", sb.toString());
                }
                int i21 = b;
                int i22 = i21 & 11;
                int i23 = (i21 | 11) & (~i22);
                int i24 = i22 << 1;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                a = i25 % 128;
                int i26 = i25 % 2;
                if (!jSONObject.getBoolean("status")) {
                    this.d.failureCall();
                    Context context = this.e;
                    int i27 = b;
                    int i28 = i27 & 47;
                    int i29 = (i28 - (~((i27 ^ 47) | i28))) - 1;
                    a = i29 % 128;
                    (i29 % 2 != 0 ? Toast.makeText(context, "Invalid Electricity Reference No.", 1) : Toast.makeText(context, "Invalid Electricity Reference No.", 0)).show();
                    int i30 = b;
                    int i31 = ((i30 & (-28)) | ((~i30) & 27)) + ((i30 & 27) << 1);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    return;
                }
                int i33 = b;
                int i34 = i33 & 5;
                int i35 = ((((i33 ^ 5) | i34) << 1) - (~(-((i33 | 5) & (~i34))))) - 1;
                a = i35 % 128;
                Object obj2 = null;
                if (i35 % 2 != 0) {
                    this.d.successCall();
                    obj2.hashCode();
                    throw null;
                }
                this.d.successCall();
                int i36 = b;
                int i37 = i36 & 67;
                int i38 = (i36 | 67) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e.toString());
                Log.e("success", sb2.toString());
                throw new RuntimeException(e);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
