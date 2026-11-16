package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Z extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(DiscrepancyActivity discrepancyActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = discrepancyActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = i3 + ((i2 ^ 3) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i6 = b;
        int i7 = i6 & 27;
        int i8 = -(-(i6 | 27));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return map;
    }
}
