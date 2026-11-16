package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0150ab extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150ab(DiscrepancyActivity discrepancyActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = discrepancyActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b + 37;
        a = i2 % 128;
        int i3 = i2 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = b;
        int i5 = i4 & 9;
        int i6 = i4 | 9;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return map;
    }
}
