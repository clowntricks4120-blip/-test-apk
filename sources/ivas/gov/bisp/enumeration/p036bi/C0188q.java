package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0188q extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188q(DisabilityActivity disabilityActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = disabilityActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a + 23;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j.z(sessionManager, sbW, map, "Authorization");
        int i3 = a;
        int i4 = ((i3 ^ 111) | (i3 & 111)) << 1;
        int i5 = -(((~i3) & 111) | (i3 & (-112)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 50 / 0;
        }
        return map;
    }
}
