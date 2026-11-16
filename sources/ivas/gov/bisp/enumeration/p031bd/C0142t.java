package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0142t extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityDiscrepancyActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142t(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = disabilityDiscrepancyActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a;
        int i3 = (i2 & (-102)) | ((~i2) & 101);
        int i4 = -(-((i2 & 101) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i7 = b;
        int i8 = (((i7 & (-100)) | ((~i7) & 99)) - (~(-(-((i7 & 99) << 1))))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
