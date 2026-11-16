package ivas.gov.bisp.enumeration.p025ay;

import android.app.Activity;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aE implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aI d;

    public aE(aI aIVar, int i) {
        this.d = aIVar;
        this.c = i;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 22) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObject = (JSONObject) obj;
        this.d.l.dismiss();
        int i4 = b;
        int i5 = i4 & 117;
        int i6 = -(-((i4 ^ 117) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        try {
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.d.m;
            int i9 = a;
            int i10 = i9 & 67;
            int i11 = ((i9 ^ 67) | i10) << 1;
            int i12 = -((i9 | 67) & (~i10));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            JSONObject jSONObject2 = new JSONObject(b.c(string, b.b(sessionManager.k()), b.b(this.d.m.m())));
            int i15 = a;
            int i16 = i15 & 37;
            int i17 = (i15 | 37) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            b = i19 % 128;
            int i20 = i19 % 2;
            String string2 = jSONObject2.getString("message");
            Object obj2 = null;
            if (string2.equalsIgnoreCase("Record deleted")) {
                int i21 = a;
                int i22 = (i21 ^ 59) + ((i21 & 59) << 1);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    List<RosterItem> list = this.d.g;
                    obj2.hashCode();
                    throw null;
                }
                List<RosterItem> list2 = this.d.g;
                int i23 = b;
                int i24 = (i23 ^ 99) + ((i23 & 99) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                list2.remove(this.c);
                aI aIVar = this.d;
                int i26 = this.c;
                int i27 = b;
                int i28 = i27 & 121;
                int i29 = ((i27 ^ 121) | i28) << 1;
                int i30 = -((i27 | 121) & (~i28));
                int i31 = (i29 & i30) + (i30 | i29);
                a = i31 % 128;
                int i32 = i31 % 2;
                aIVar.e(i26);
                aI aIVar2 = this.d;
                int i33 = this.c;
                int i34 = a;
                int i35 = i34 ^ 87;
                int i36 = (i34 & 87) << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
                int size = aIVar2.g.size();
                RecyclerView.OooOO0 oooOO0 = aIVar2.a;
                int i39 = a;
                int i40 = (i39 ^ 39) + ((i39 & 39) << 1);
                b = i40 % 128;
                int i41 = i40 % 2;
                oooOO0.d(i33, size);
                Activity activity = this.d.f;
                int i42 = a;
                int i43 = i42 & 49;
                int i44 = (i43 - (~((i42 ^ 49) | i43))) - 1;
                b = i44 % 128;
                int i45 = i44 % 2;
                Toast.makeText(activity, string2, 0).show();
            } else {
                Activity activity2 = this.d.f;
                int i46 = b;
                int i47 = i46 & 91;
                int i48 = (i47 - (~(-(-((i46 ^ 91) | i47))))) - 1;
                a = i48 % 128;
                int i49 = i48 % 2;
                Toast.makeText(activity2, string2, 0).show();
                int i50 = b;
                int i51 = ((i50 ^ 46) + ((i50 & 46) << 1)) - 1;
                a = i51 % 128;
                int i52 = i51 % 2;
            }
            UpdateRosterListActivity updateRosterListActivity = (UpdateRosterListActivity) this.d.f69o;
            int i53 = a;
            int i54 = i53 & 73;
            int i55 = i53 | 73;
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            b = i56 % 128;
            int i57 = i56 % 2;
            updateRosterListActivity.ag.u = true;
            int i58 = b;
            int i59 = (((i58 | 49) << 1) - (~(-(((~i58) & 49) | (i58 & (-50)))))) - 1;
            a = i59 % 128;
            if (i59 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
