package ivas.gov.bisp.enumeration.p038bk;

import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class be extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ bs t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bs bsVar, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = bsVar;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t.h.getApplicationContext());
        int i2 = a;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        b = i3 % 128;
        int i4 = i3 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i5 = a + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
