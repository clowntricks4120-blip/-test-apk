package ivas.gov.bisp.enumeration.p042bo;

import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateNadraRosterList t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(UpdateNadraRosterList updateNadraRosterList, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = updateNadraRosterList;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = a;
        int i3 = ((i2 | 89) << 1) - (i2 ^ 89);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            obj.hashCode();
            throw null;
        }
        j.z(sessionManager, sbW, map, "Authorization");
        int i4 = b;
        int i5 = i4 ^ 71;
        int i6 = (((i4 & 71) | i5) << 1) - i5;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }
}
