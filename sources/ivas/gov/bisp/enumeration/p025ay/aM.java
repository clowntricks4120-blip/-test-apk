package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aM implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aT d;

    public aM(aT aTVar, int i) {
        this.d = aTVar;
        this.c = i;
    }

    public void b(Object obj) {
        aT aTVar;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 102) + ((i3 & 102) << 1)) - 1;
        a = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            ProgressDialog progressDialog = this.d.l;
            obj2.hashCode();
            throw null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        ProgressDialog progressDialog2 = this.d.l;
        int i5 = a;
        int i6 = (((i5 & (-122)) | ((~i5) & 121)) - (~(-(-((i5 & 121) << 1))))) - 1;
        b = i6 % 128;
        try {
            if (i6 % 2 != 0) {
                progressDialog2.dismiss();
                jSONObject.getString("result");
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            progressDialog2.dismiss();
            String string = jSONObject.getString("result");
            byte[] bArrB = b.b(this.d.m.k());
            int i7 = a;
            int i8 = i7 & 89;
            int i9 = i8 + ((i7 ^ 89) | i8);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                b.b(this.d.m.m());
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string, bArrB, b.b(this.d.m.m())));
            int i10 = b;
            int i11 = i10 & 37;
            int i12 = (i10 | 37) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            String string2 = jSONObject2.getString("message");
            int i16 = a;
            int i17 = (i16 | 53) << 1;
            int i18 = -(((~i16) & 53) | (i16 & (-54)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                string2.equalsIgnoreCase("Record deleted");
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!string2.equalsIgnoreCase("Record deleted")) {
                Activity activity = this.d.f;
                int i20 = b;
                int i21 = i20 & 69;
                int i22 = ((((i20 ^ 69) | i21) << 1) - (~(-((i20 | 69) & (~i21))))) - 1;
                a = i22 % 128;
                int i23 = i22 % 2;
                Toast.makeText(activity, string2, 0).show();
                int i24 = b;
                int i25 = i24 & 77;
                int i26 = -(-(i24 | 77));
                int i27 = (i25 & i26) + (i26 | i25);
                a = i27 % 128;
                int i28 = i27 % 2;
                return;
            }
            List<RosterItem> list = this.d.g;
            int i29 = b;
            int i30 = i29 & 105;
            int i31 = ((i29 ^ 105) | i30) << 1;
            int i32 = -((i29 | 105) & (~i30));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            list.remove(this.c);
            aT aTVar2 = this.d;
            int i35 = this.c;
            int i36 = b;
            int i37 = (((i36 | 108) << 1) - (i36 ^ 108)) - 1;
            a = i37 % 128;
            if (i37 % 2 == 0) {
                aTVar2.e(i35);
                aTVar = this.d;
                i = this.c;
                int i38 = 46 / 0;
            } else {
                aTVar2.e(i35);
                aTVar = this.d;
                i = this.c;
            }
            int i39 = a;
            int i40 = (i39 & 3) + (i39 | 3);
            b = i40 % 128;
            int i41 = i40 % 2;
            int size = aTVar.g.size();
            RecyclerView.OooOO0 oooOO0 = aTVar.a;
            int i42 = a;
            int i43 = ((i42 ^ 30) + ((i42 & 30) << 1)) - 1;
            b = i43 % 128;
            int i44 = i43 % 2;
            oooOO0.d(i, size);
            Activity activity2 = this.d.f;
            int i45 = a;
            int i46 = ((i45 | 35) << 1) - (i45 ^ 35);
            b = i46 % 128;
            int i47 = i46 % 2;
            Toast.makeText(activity2, string2, 0).show();
            int i48 = a + 102;
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            b = i49 % 128;
            if (i49 % 2 != 0) {
                int i50 = 13 / 0;
            }
        } catch (JSONException unused) {
        }
    }
}
