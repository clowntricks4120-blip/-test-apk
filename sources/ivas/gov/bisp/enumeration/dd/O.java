package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class O extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DobActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(DobActivity dobActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = dobActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = (i2 ^ 21) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        if (i6 == 0) {
            throw null;
        }
        int i7 = b;
        int i8 = ((i7 | 15) << 1) - (i7 ^ 15);
        a = i8 % 128;
        int i9 = i8 % 2;
        return map;
    }
}
