package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aP extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aP(UpdateRosterActivity updateRosterActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = updateRosterActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (((i2 ^ 13) | i3) << 1) - ((i2 | 13) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        UpdateRosterActivity updateRosterActivity = this.t;
        int i6 = UpdateRosterActivity.af;
        SessionManager sessionManager = new SessionManager(updateRosterActivity.ae);
        int i7 = b;
        int i8 = i7 ^ 89;
        int i9 = (i7 & 89) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i12 = a;
        int i13 = (i12 & 55) + (i12 | 55);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
        return map;
    }
}
