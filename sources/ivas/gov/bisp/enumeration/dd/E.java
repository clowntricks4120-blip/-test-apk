package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class E extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdatePhoneNoActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(UpdatePhoneNoActivity updatePhoneNoActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = updatePhoneNoActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b;
        int i3 = i2 | 65;
        int i4 = (i3 << 1) - ((~(i2 & 65)) & i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i6 = b + 57;
        a = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }
}
