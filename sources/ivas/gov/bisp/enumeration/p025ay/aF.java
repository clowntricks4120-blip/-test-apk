package ivas.gov.bisp.enumeration.p025ay;

import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aF extends C0098p {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aI t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aF(aI aIVar, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = aIVar;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t.f);
        int i2 = b;
        int i3 = i2 ^ 57;
        int i4 = ((i2 & 57) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            j.z(sessionManager, sbW, map, "Authorization");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j.z(sessionManager, sbW, map, "Authorization");
        int i7 = b;
        int i8 = (i7 & (-70)) | ((~i7) & 69);
        int i9 = (i7 & 69) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }
}
