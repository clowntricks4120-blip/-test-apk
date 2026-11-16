package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.AddressActivity;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0181j extends C0098p {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ AddressActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181j(AddressActivity addressActivity, int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
        super(i, str, jSONObject, barVar, basVar);
        this.t = addressActivity;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.t);
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = (i2 | 109) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i8 = a;
        int i9 = i8 | 97;
        int i10 = i9 << 1;
        int i11 = -((~(i8 & 97)) & i9);
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        return map;
    }
}
