package ivas.gov.bisp.enumeration.p031bd;

import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class L extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ GenderDiscrepancy t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(GenderDiscrepancy genderDiscrepancy, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = genderDiscrepancy;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b + 5;
        a = i2 % 128;
        int i3 = i2 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        if (i3 != 0) {
            throw null;
        }
        int i4 = b;
        int i5 = i4 & 53;
        int i6 = (i5 - (~(-(-((i4 ^ 53) | i5))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
        return map;
    }
}
