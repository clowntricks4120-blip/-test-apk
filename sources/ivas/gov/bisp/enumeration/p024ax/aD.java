package ivas.gov.bisp.enumeration.p024ax;

import android.content.Context;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.u;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aD extends u {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aD(int i, String str, C0094m.bar barVar, C0094m.bas basVar, Context context) {
        super(i, str, barVar, basVar);
        this.r = context;
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.r);
        int i2 = b + 27;
        a = i2 % 128;
        int i3 = i2 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i4 = b;
        int i5 = i4 & 71;
        int i6 = ((i4 | 71) & (~i5)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }
}
