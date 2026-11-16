package ivas.gov.bisp.enumeration.p043bp;

import android.content.Context;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p023aw.u;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0202d extends u {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202d(BISPApplication bISPApplication, int i, String str, C0094m.bar barVar, C0094m.bas basVar, Context context) {
        super(i, str, barVar, basVar);
        this.r = context;
    }

    public String g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 111;
        int i9 = (((i6 | 111) & (~i8)) - (~(i8 << 1))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public Map<String, String> i() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        StringBuilder sbW = j.w("Bearer ");
        SessionManager sessionManager = new SessionManager(this.r);
        int i2 = a + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        j.z(sessionManager, sbW, map, "Authorization");
        int i4 = a;
        int i5 = i4 & 17;
        int i6 = (i4 ^ 17) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
