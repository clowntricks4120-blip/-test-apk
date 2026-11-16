package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0293n extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalStatusActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0293n(MaritalStatusActivity maritalStatusActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = maritalStatusActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            return map;
        }
        j.z(sessionManager, sbW, map, "Authorization");
        throw null;
    }
}
