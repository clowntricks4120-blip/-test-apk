package ivas.gov.bisp.enumeration.p038bk;

import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bp extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ bk t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(bk bkVar, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = bkVar;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t.h.getApplicationContext());
        int i2 = a;
        int i3 = ((i2 ^ 60) + ((i2 & 60) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            int i4 = 2 / 0;
        } else {
            j.z(sessionManager, sbW, map, "Authorization");
        }
        int i5 = a;
        int i6 = ((i5 ^ 91) | (i5 & 91)) << 1;
        int i7 = -(((~i5) & 91) | (i5 & (-92)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return map;
    }
}
