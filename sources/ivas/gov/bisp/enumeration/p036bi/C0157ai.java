package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0157ai extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157ai(DiscrepancyActivity discrepancyActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = discrepancyActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a;
        int i3 = ((i2 ^ 104) + ((i2 & 104) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i5 = b;
        int i6 = i5 & 77;
        int i7 = (i6 - (~(-(-((i5 ^ 77) | i6))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return map;
    }
}
