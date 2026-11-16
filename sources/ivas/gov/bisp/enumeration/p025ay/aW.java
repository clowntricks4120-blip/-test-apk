package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aW extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aT t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aW(aT aTVar, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = aTVar;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t.f);
        int i2 = a;
        int i3 = (i2 & 113) + (i2 | 113);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            return map;
        }
        j.z(sessionManager, sbW, map, "Authorization");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
