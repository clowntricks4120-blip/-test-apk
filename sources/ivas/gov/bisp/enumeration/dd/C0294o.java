package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0294o extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ CnicActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294o(CnicActivity cnicActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = cnicActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b;
        int i3 = (i2 & 17) + (i2 | 17);
        a = i3 % 128;
        int i4 = i3 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i5 = b;
        int i6 = (i5 & (-124)) | ((~i5) & 123);
        int i7 = (i5 & 123) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return map;
    }
}
