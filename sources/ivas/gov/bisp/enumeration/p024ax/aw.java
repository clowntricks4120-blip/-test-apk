package ivas.gov.bisp.enumeration.p024ax;

import android.content.Context;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aw extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Context t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar, Context context) {
        super(i, str, null, barVar, basVar);
        this.t = context;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return map;
    }
}
